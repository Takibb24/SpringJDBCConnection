package com.thenerd.SpringJDBCcon.repository;

import com.thenerd.SpringJDBCcon.model.Bikers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BikersRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Bikers bk) { //bk is the obj of bikers
        String sql = "insert into Bikers (Id,name,TopS) values (?,?,?)";
        int rows = jdbc.update(sql, bk.getId(), bk.getName(), bk.getTops());
        System.out.println(rows + " Effected");
    }

    public List<Bikers> findAll() {

        String sql = "select * from Bikers";
        RowMapper<Bikers> mapper = new RowMapper<Bikers>() {
            @Override
            public Bikers mapRow(ResultSet rs, int rowNum) throws SQLException {
                Bikers bk = new Bikers();
                bk.setId(rs.getInt("Id"));
                bk.setName(rs.getString("name"));
                bk.setTops(rs.getInt("Tops"));

                return bk;
            }



        /*List<Bikers> Bikerss = new ArrayList<>();
        return Bikerss;*/
        };
        return jdbc.query(sql,mapper);
    }

}

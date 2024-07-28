package com.thenerd.SpringJDBCcon.service;

import com.thenerd.SpringJDBCcon.model.Bikers;
import com.thenerd.SpringJDBCcon.repository.BikersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //cz this is service class
public class BikerService {

    private BikersRepo repp;

    public BikersRepo getRepp() {
        return repp;
    }
    @Autowired
    public void setRepp(BikersRepo repp) {
        this.repp = repp;
    }

    public void addBikers(Bikers bk){
        repp.save(bk);
        //here we create a method where repo is working
    }
    public List<Bikers> getBikerss(){
        return repp.findAll();
    }
}
//to run this addBikers method we need to create an obj on main class

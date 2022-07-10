package com.bluetree.Emplyreg.service;

import com.bluetree.Emplyreg.model.Emply;
import com.bluetree.Emplyreg.repository.Emplyrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.apache.logging.log4j.util.Strings.isNotEmpty;

@Service
public class EmplyServiceImpl implements EmplyService{

    public Emplyrepo emplyrepo;

    @Autowired
    public EmplyServiceImpl(Emplyrepo emplyrepo) {
        this.emplyrepo = emplyrepo;
    }


    @Override
    public Emply addEmply(Emply emply){
        return (Emply) emplyrepo.save(emply);
    }

    @Override
    public List<Emply> saveAllEmplys(List<Emply> emplys) {
        return emplyrepo.saveAll(emplys);
    }

    @Override
    public List<Emply> getAllEmply() {
        return emplyrepo.findAll();
    }

    @Override
    public String deleteEmply(int id) {
       emplyrepo.deleteById(id);
        return "details deleted";
    }

    @Override
    public Emply updateEmply(Emply employ){
       Optional employ2= emplyrepo.findById(employ.getId());
        Emply exist = (Emply) employ2.get();    exist.setFname(employ.getFname());
        exist.setLname(employ.getLname());
        exist.setEmail(employ.getEmail());
        exist.setDob(employ.getDob());
        exist.setSalary(employ.getSalary());
        exist.setMobile(employ.getMobile());
        return (Emply) emplyrepo.save(exist);
    }
}
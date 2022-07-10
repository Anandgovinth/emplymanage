package com.bluetree.Emplyreg.service;


import com.bluetree.Emplyreg.model.Emply;

import java.util.List;

public interface EmplyService {

    public Emply addEmply(Emply emply);

    public List<Emply> saveAllEmplys(List<Emply> emplys);
    public List<Emply> getAllEmply();

        public String deleteEmply(int id);

    public Emply updateEmply(Emply employ);

}

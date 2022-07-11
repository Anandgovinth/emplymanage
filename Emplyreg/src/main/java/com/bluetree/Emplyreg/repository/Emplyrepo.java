package com.bluetree.Emplyreg.repository;

import com.bluetree.Emplyreg.model.Emply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Emplyrepo<id> extends JpaRepository<Emply, Integer>{
}

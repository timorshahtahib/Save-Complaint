package com.poraan.Learn.Spring.service.serviceIMP;



import com.poraan.Learn.Spring.model.Comita;
import com.poraan.Learn.Spring.repository.ComitaRepository;
import com.poraan.Learn.Spring.service.ComitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComitaServiceImpl implements ComitaService {

    @Autowired
    private ComitaRepository comitaRepository;
    @Override
    public void saveComita(Comita student) {
        comitaRepository.save(student);
    }

    @Override
    public Object findAll() {
        return comitaRepository.findAll();
    }

    @Override
    public Comita findComitaById(Long id) {
        return comitaRepository.getOne(id);
    }

    @Override
    public void deleteComitaById(Long id) {
        comitaRepository.deleteById(id);
    }
}

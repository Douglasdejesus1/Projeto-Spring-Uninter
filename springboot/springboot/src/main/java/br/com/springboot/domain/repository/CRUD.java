package br.com.springboot.domain.repository;

import java.util.List;

public interface CRUD<T, ID> {
    T pesquisaPeloId(ID id);
    List<T> listaTodos();   
    void insere(T t);
    void atualiza(T t);
    void remove(T t);
}
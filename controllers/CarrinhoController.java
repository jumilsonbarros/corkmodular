package pt.iade.unimanagerdb.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.unimanagerdb.models.Carrinho;

import pt.iade.unimanagerdb.models.repositories.CarrinhoRepository;

@RestController
@RequestMapping(path = "/api/carrinhos")
@Component
public class CarrinhoController {
    private Logger logger = LoggerFactory.getLogger(CarrinhoController.class);
    @Autowired
    private CarrinhoRepository carrinhoRepository;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Carrinho> getCarrinho() {
        logger.info("Sending all carrinho");
        return carrinhoRepository.findAll();
    }
}
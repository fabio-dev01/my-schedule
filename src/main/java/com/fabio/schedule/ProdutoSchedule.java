package com.fabio.schedule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.fabio.model.Produto;
import com.fabio.repository.ProdutoRepository;

@Component
public class ProdutoSchedule {

		@Autowired
		private ProdutoRepository produtoRepository;
	
		@Scheduled(cron = "0/6 * * * * *")
		public List<Produto> executar() {
			long quant = produtoRepository.count();
			System.out.println("###################");
			System.out.println("Total de produtos cadastrados: " +quant);
			return null;
		}
}

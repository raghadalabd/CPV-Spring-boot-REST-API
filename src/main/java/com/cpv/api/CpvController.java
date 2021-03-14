package com.cpv.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController //Create RESTful web services using Spring MVC.
public class CpvController {
	
	@Autowired // Automatic dependency injection
	CpvRepository cpvRepository;
	
	@GetMapping("/getAllCpv") //To maps HTTP GET requests onto specific methods.
	public List<CpvModel> getAllCpv()
	{
		return cpvRepository.findAll();
	}
	
	@GetMapping("/getCpvByCode/{code_}")
	public Optional<CpvModel> getCpvByCode(@PathVariable(value="code_") String code_)
	{
		return cpvRepository.findById(code_);
	}
	
	@PostMapping("/addCpv")
	public CpvModel addCpv(@RequestBody CpvModel cpv)
	{
		return cpvRepository.save(cpv);
	}
	
	@PutMapping("/updateCpv/{code_}")
	public CpvModel updateCpv(@PathVariable(value="code_") String code_, @RequestBody CpvModel cpvDetails)
	{
		Optional<CpvModel> book = cpvRepository.findById(code_);
		CpvModel cpv_new=book.get();
		cpv_new.setCcpv_code(cpvDetails.getCpv_code());
		cpv_new.setDescription_en(cpvDetails.getDescription_en());
		return cpvRepository.save(cpv_new);
		
	}
	
	@DeleteMapping("/deleteCpv/{code_}")
	public void deleteCpv(@PathVariable(value="code_") String code_)
	{
		Optional<CpvModel> cpv=cpvRepository.findById(code_);
		CpvModel cpv_new=cpv.get();
		cpvRepository.delete(cpv_new);
	}
	

}

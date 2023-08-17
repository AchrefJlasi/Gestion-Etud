package ma.enset.catalogue;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import ma.enset.catalogue.entities.etudiant;
import ma.enset.catalogue.metier.ICatalogueMetier;

@Controller
public class CatalogueController {
	
	@Autowired
	private ICatalogueMetier metier;
	
	@RequestMapping(value="/index")
	public String index(Model model) {
		model.addAttribute("etudiant", new etudiant());
		model.addAttribute("etudiants", metier.listEtudiant());
			return "etudiants";
	}
	
	@RequestMapping(value="/edit/save")
	public String editsave(@Valid etudiant e, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			return "etudiants";
		}
	//	if(e.getIdEtudiant()==null) {metier.addEtudiant(e);} 
		else metier.updateEtudiant(e);;
	model.addAttribute("etudiant", new etudiant());
	model.addAttribute("etudiants", metier.listEtudiant());
		return "etudiants";
	}
	
	@RequestMapping(value="/edit/edit/save")
	public String editeditsave(@Valid etudiant e, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			return "etudiants";
		}
	//	if(e.getIdEtudiant()==null) {metier.addEtudiant(e);} 
		else metier.updateEtudiant(e);;
	model.addAttribute("etudiant", new etudiant());
	model.addAttribute("etudiants", metier.listEtudiant());
		return "etudiants";
	}
	
	@RequestMapping(value="/edit/edit/{id}")
	public  String	editedit(@PathVariable(value="id")
	Long	id,  Model	model){
		etudiant e=metier.editEtudiant(id);
		model.addAttribute("etudiant", e);
		model.addAttribute("etudiants", metier.editEtudiant(id));
			return "etudiants";
	}
	
	@RequestMapping(value="/save")
	public String saveE(@Valid etudiant e, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "etudiants";
		}

		//if(e.getId()==null) {metier.add(e);}
		//if(this.test==true) {
			//metier.add(e);
			//System.out.println(this.test);
			//this.test=false;
		//}
		else 
		metier.updateEtudiant(e);	
		model.addAttribute("etudiant",new etudiant());
		model.addAttribute("etudiants",metier.listEtudiant());
		return "etudiants";
	}
	
	@RequestMapping(value="/delete")
	public String delete(@RequestParam(value="id")
	Long id, Model model){
		metier.deleteEtudiant(id);;
		model.addAttribute("etudiant", new etudiant());
		model.addAttribute("etudiants", metier.listEtudiant());
			return "etudiants";
	}
	
	@RequestMapping(value="/edit/{id}")
	public  String	edit(@PathVariable(value="id")
	Long	id,  Model	model){
		etudiant e=metier.editEtudiant(id);
		model.addAttribute("etudiant", e);
		model.addAttribute("etudiants", metier.editEtudiant(id));
			return "etudiants";
	}
	
	@RequestMapping(value="/list/{mc}") 
	@ResponseBody
	public List<etudiant> listE(@PathVariable(value="mc")String mc){ 
		return metier.chercherEtudiant(mc);
	}

}


package shopping.site.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shopping.site.model.CreateItem;
import shopping.site.validator.CreateItemValidator;

@Controller
@RequestMapping("/createItem")
public class CreateItemController {
	
	@Autowired
	private CreateItemValidator createItemValidator;
	
	


	private List<String> errorList;
	@RequestMapping(method = RequestMethod.GET)
	public String returnCreateItemPage(ModelMap model) 
	{
	
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "createitem";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String printWelcome(@ModelAttribute CreateItem createItem) 
	{
		errorList = createItemValidator.validateCreateItem(createItem);
		System.out.println(errorList);
		return "success";
	}
}

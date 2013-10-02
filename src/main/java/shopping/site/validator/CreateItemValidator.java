package shopping.site.validator;

import java.util.List;

import org.springframework.stereotype.Service;

import shopping.site.model.CreateItem;

@Service
public class CreateItemValidator extends BaseValidator{
	
	public List<String> validateCreateItem(CreateItem createItem)
	{
		String itemName = createItem.getItemName(); 
		validateItemName(itemName);
		return errorList;
	}
	
	public List<String> validateItemName(String itemName)
	{
		System.out.println("inside valdiate method");
		if(itemName == null | itemName.length() == 0){
			errorList.add("empty item name");
		}
		return errorList;	
	}	
}

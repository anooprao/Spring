package shopping.site.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import shopping.site.model.CreateItem;

@Service
public class BaseValidator {

	List<String> errorList;

	public BaseValidator(){
		errorList = new ArrayList<String>();
	}

	public List<String> validateCreateItem(CreateItem createItem)
	{
		return errorList;
	}
}

package controle;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator
public class PrenomValidator implements Validator {

	public void validate(FacesContext contexte, UIComponent composant, Object prenom) throws ValidatorException {
		System.out.println(" >>> Classe PrenomValidator : procédure validate() = " + prenom);
		if (prenom.toString().length() < 2) {
			throw new ValidatorException(new FacesMessage("Le prénom doit contenir au moins deux caractères."));
		}
	}
}
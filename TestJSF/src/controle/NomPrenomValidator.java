package controle;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator
public class NomPrenomValidator implements Validator {

	public void validate(FacesContext contexte, UIComponent composant, Object oPrenom) throws ValidatorException {

		String prenom = oPrenom.toString();

		UIInput nomUIInput = (UIInput) composant.getAttributes().get("attributNom");
		String nom = (String) nomUIInput.getValue();

		System.out.println(" >>> Classe NomPrenomValidator : procédure validate() = " + nom + prenom);

		if (prenom.equals(nom)) {
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, null,
					"Le nom et prénom doivent être différent."));
		}
	}
}
package TP.Spring.gestionEtudiant.Id.generateur;

import java.util.Date;

import org.springframework.stereotype.Component;

import TP.Spring.gestionEtudiant.Idgenerateur.IdGenerateur;


@Component
public class TimeStampIdgeneratuer implements IdGenerateur {

	
	@Override
	public String generateurId()
	{
        Date date = new Date();
        long milliSecondes = date.getTime();

		return Long.toString(milliSecondes);

	}
	
	


}

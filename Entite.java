package CoucheMetier ;

import java.util.ArrayList;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @param <T>
 * @generated
 */

public class Entite<T> extends Gestion<T> implements Communication
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public ArrayList<Image> images;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String date;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public Entite(){
		super();
	}

	@Override
	public void listDescription() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listNom() {
		// TODO Auto-generated method stub
		
	}

}


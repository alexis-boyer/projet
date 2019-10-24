package CoucheMetier ;

import java.util.ArrayList;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @param <T>
 * @generated
 */

public class Campagne<T> extends Gestion<T> implements Communication
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public ArrayList<Entite> entites;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String nom;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String description;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Campagne(){
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


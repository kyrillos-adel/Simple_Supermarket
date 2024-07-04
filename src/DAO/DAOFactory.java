
package DAO;


public class DAOFactory {
    public static DAOUserInterface getUserDAO() {
		
		return new DAOUserImp();
		
	}
    public static DAOStoreInterface getStoreDAO() {
		
		return new DAOStoreImp();
		
	}
    
}

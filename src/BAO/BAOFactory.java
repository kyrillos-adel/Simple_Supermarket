
package BAO;


public class BAOFactory {
    public static BAOUserInterface getUserBAO() {
		
		return new BAOUserImp();
		
	}
    public static BAOStoreInterface getStoreBAO() {
		
		return new BAOStoreImp();
		
	}
    
}

package sample02;


/**
 * 사ㅛㅇ자 정의 예외 클래스다.
 * @author Joon
 *
 */
public class CustomException extends RuntimeException{

	public CustomException(String message) {
		super(message);
	}
	
	
	public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
	
}

package org.lee3.book.chap03;

/**
 * p.62 [리스트 3.6]의 DuplicateMemgerException 수정<br>
 * 회원등록할 때 같은 이메일의 회원이 이미 존재하면 발생한다.
 * 
 * @author Jacob
 */
public class DuplicateMemberException extends RuntimeException {



	public DuplicateMemberException() {
	}

	public DuplicateMemberException(String message) {
		super(message);
	}

	public DuplicateMemberException(Throwable cause) {
		super(cause);
	}

	public DuplicateMemberException(String message, Throwable cause) {
		super(message, cause);
	}

	public DuplicateMemberException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
}
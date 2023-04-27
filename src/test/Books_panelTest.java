package test;

import frame.Books_panel;
import org.junit.Test;

import java.sql.SQLException;

public class Books_panelTest {

	@Test
	public void testGetItems() throws SQLException {
		int n=Books_panel.getItems("select * from book_stack;");
		System.out.println(n);

	}

}

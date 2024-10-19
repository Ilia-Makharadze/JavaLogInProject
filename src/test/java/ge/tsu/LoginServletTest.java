//package ge.tsu;
//
//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
//
///**
// * Unit test for simple App.
// */
//public class AppTest
//    extends TestCase
//{
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
//}
package ge.tsu;

import ge.tsu.servlet.LoginServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class LoginServletTest {

    @InjectMocks
    private LoginServlet loginServlet;

    @Mock
    private HttpServletRequest request;

    @Mock
    private HttpServletResponse response;

    @Mock
    private RequestDispatcher requestDispatcher;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testDoGet() throws ServletException, IOException {
        when(request.getRequestDispatcher("WEB-INF/pages/Login.jsp")).thenReturn(requestDispatcher);

        loginServlet.doGet(request, response);

        verify(request).getRequestDispatcher("WEB-INF/pages/Login.jsp");
        verify(requestDispatcher).forward(request, response);
    }

    @Test
    public void testDoPostWithInvalidPassword() throws ServletException, IOException {
        when(request.getParameter("inputEmail")).thenReturn("test@example.com");
        when(request.getParameter("inputPassword")).thenReturn("short");

        loginServlet.doPost(request, response);

        verify(response).sendRedirect(request.getContextPath() + "/Login");
    }

    @Test
    public void testDoPostWithValidPassword() throws ServletException, IOException {
        when(request.getParameter("inputEmail")).thenReturn("test@example.com");
        when(request.getParameter("inputPassword")).thenReturn("validpassword");

        loginServlet.doPost(request, response);

        verify(response).sendRedirect(request.getContextPath() + "/central");
    }
}

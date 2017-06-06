import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;

/**
 * Created by keli on 2017.06.06..
 */
public class MyAnnotation {


    public void main(String[] args) throws IOException{
        Hello hello = new Hello();

    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface WebRoute{
        String route();
    }

    class Hello {
        @WebRoute(route="/test")
        public void sayHello(){
            System.out.println("hello annotation");
        }
    }
}


//class MyHandler implements HttpHandler {
//    @Override
//    public void handle(HttpExchange t) throws IOException {
//        String response = "This is the response";
//        t.sendResponseHeaders(200, response.length());
//        OutputStream os = t.getResponseBody();
//        os.write(response.getBytes());
//        os.close();
//    }
//}

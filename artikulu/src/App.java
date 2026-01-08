
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Author autor = new Author("Javier");
        LocalDate gaur = LocalDate.now();
        artiluku a1= new artiluku(autor, categoria.BACKEND, gaur,"lehenengo java artikulua");
        
    System.out.println(a1.toString());
    }
}

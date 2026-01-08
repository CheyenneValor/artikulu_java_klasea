
import java.time.LocalDate;


public class artiluku {
    private String tituloa;
    private Author autor;
    private LocalDate data;
    private categoria categoria;

    public artiluku(Author autor, categoria categoria, LocalDate fechadepubicacion, String tituloa) {
        this.autor = autor;
        this.categoria = categoria;
        this.data = fechadepubicacion;
        this.tituloa = tituloa;
    }

    public String getTituloa() {
        return tituloa;
    }

    public Author getAutor() {
        return autor;
    }

    public LocalDate getData() {
        return data;
    }

    public categoria getCategoria() {
        return categoria;
    }

    public void setTituloa(String tituloa) {
        this.tituloa = tituloa;
    }

    public void setAutor(Author autor) {
        this.autor = autor;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setCategoria(categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "artiluku [tituloa=" + tituloa + ", autor=" + autor.getName() + ", data=" + data + ", categoria=" + categoria
                + "]";
    }

    }

   




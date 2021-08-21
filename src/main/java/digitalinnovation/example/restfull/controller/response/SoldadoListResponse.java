package digitalinnovation.example.restfull.controller.response;
import org.springframework.hateoas.ResourceSupport;

public class SoldadoListResponse extends ResourceSupport{
    private Long id;
    private String nome;
    private String raca;

    @JsonProperty("id")
    public Long getResourceId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
package dio.com.br.classes;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataTermino = dataInicio.plusDays(45);
    private Set <Desenvolvedor> desenvolvedoresInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public Set<Desenvolvedor> getDesenvolvedoresInscritos() {
        return desenvolvedoresInscritos;
    }

    public void setDesenvolvedoresInscritos(Set<Desenvolvedor> desenvolvedoresInscritos) {
        this.desenvolvedoresInscritos = desenvolvedoresInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public String removerConteudo (Conteudo conteudo){
        this.conteudos.remove(conteudo);
        return "Conteúdo excluído!";
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicio, bootcamp.dataInicio) && Objects.equals(dataTermino, bootcamp.dataTermino) && Objects.equals(desenvolvedoresInscritos, bootcamp.desenvolvedoresInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicio, dataTermino, desenvolvedoresInscritos, conteudos);
    }
}

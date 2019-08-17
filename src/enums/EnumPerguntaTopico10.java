package enums;

/**
 * @author eduardo.andrade
 * @since 17/08/2019
 */
public enum EnumPerguntaTopico10 {
    
    PERGUNTA1(1,"Pergunta 1"),
    PERGUNTA2(2,"Pergunta 2"),
    PERGUNTA3(3,"Pergunta 3"),
    PERGUNTA4(4,"Pergunta 4"),
    PERGUNTA5(5,"Pergunta 5"),
    PERGUNTA6(6,"Pergunta 6"),
    PERGUNTA7(7,"Pergunta 7"),
    PERGUNTA8(8,"Pergunta 8"),
    PERGUNTA9(9,"Pergunta 9"),
    PERGUNTA10(10,"Pergunta 10");

    private String descricao;
    
    private Integer codigo;

    /**
     *
     * @param descricao
     */
    private EnumPerguntaTopico10(Integer codigo, String descricao) {
        this.descricao = descricao;
    }

    /**
     *
     * @return
     */
    public String getDescricao() {
        return descricao;
    }

    /**
    *
    * @return
    */
    public Integer getCodigo() {
        return codigo;
    }
    
    
}

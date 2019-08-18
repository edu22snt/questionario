package enums;

/**
 * @author eduardo.andrade
 * @since 17/08/2019
 */
public enum EnumRespostasOpcoes {
    
    RESPOSTA1(1,"Not yet implemented or planned"),
    RESPOSTA2(2,"Partially implemented or planned"),
    RESPOSTA3(3,"Successfully implemented"),
    RESPOSTA4(4,"Not applicable");

    private String descricao;
    
    private Integer codigo;

    /**
     *
     * @param descricao
     */
    private EnumRespostasOpcoes(Integer codigo, String descricao) {
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

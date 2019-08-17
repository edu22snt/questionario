package enums;

/**
 * @author eduardo.andrade
 * @since 17/08/2019
 */
public enum EnumSistema {

    NM_SITEMA("Questionário"),
    NM_BOTAO_OK("OK"),
    NM_BOTA0_FECHAR("Fechar");
    
    private String descricao;

    /**
     *
     * @param descricao
     */
    private EnumSistema(String descricao) {
        this.descricao = descricao;
    }

    /**
     *
     * @return
     */
    public String getDescricao() {
        return descricao;
    }
}

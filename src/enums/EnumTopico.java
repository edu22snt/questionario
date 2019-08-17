package enums;

/**
 * @author eduardo.andrade
 * @since 17/08/2019
 */
public enum EnumTopico {

    TOPICO1("Corporate Data"),
    TOPICO2("Data Processing"),
    TOPICO3("Data Management"),
    TOPICO4("Privacy Notices"),
    TOPICO5("Rights of Data Subjects"),
    TOPICO6("Governance"),
    TOPICO7("Data Risk Assessment"),
    TOPICO8("Data Protection Impact Analysis"),
    TOPICO9("Privacy by Design"),
    TOPICO10("Cibersecurity"),
    TOPICO11("Controllers"),
    TOPICO12("Processors"),
    TOPICO13("Direct Marketing"),
    TOPICO14("Records Management"),
    TOPICO15("Data Sharing and Subject Access"),
    TOPICO16("CCTV");
    
    private String descricao;

    /**
     *
     * @param descricao
     */
    private EnumTopico(String descricao) {
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

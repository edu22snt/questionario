package controle;

import java.util.ArrayList;

/**
 * @author eduardo.andrade
 * @since 07/08/2019
 */
public class Questionario {

    private ArrayList<String> listaTopico1;
    private ArrayList<String> listaTopico2;
    private ArrayList<String> listaTopico3;
    private ArrayList<String> listaTopico4;
    private ArrayList<String> listaTopico5;
    private ArrayList<String> listaTopico6;
    private ArrayList<String> listaTopico7;
    private ArrayList<String> listaTopico8;
    private ArrayList<String> listaTopico9;
    private ArrayList<String> listaTopico10;
    
    private Perguntas perguntas;


	public void popularTopico1() {
	    listaTopico1 = perguntas.listarPerguntasTopico1();
	}
	
    public void popularTopico2() {
        listaTopico2 = perguntas.listarPerguntasTopico2();
    }
    
    public void popularTopico3() {
        listaTopico3 = perguntas.listarPerguntasTopico3();
    }
    
    public void popularTopico4() {
        listaTopico4 = perguntas.listarPerguntasTopico4();
    }

    public void popularTopico5() {
        listaTopico5 = perguntas.listarPerguntasTopico5();
    }
	
    public void popularTopico6() {
        listaTopico6 = perguntas.listarPerguntasTopico6();
    }
    
    public void popularTopico7() {
        listaTopico7 = perguntas.listarPerguntasTopico7();
    }    
    
    public void popularTopico8() {
        listaTopico8 = perguntas.listarPerguntasTopico8();
    }
    
    public void popularTopico9() {
        listaTopico9 = perguntas.listarPerguntasTopico9();
    }
    
    public void popularTopico10() {
        listaTopico10 = perguntas.listarPerguntasTopico10();
    }

    public ArrayList<String> getListaTopico1() {
        return listaTopico1;
    }

    public void setListaTopico1(ArrayList<String> listaTopico1) {
        this.listaTopico1 = listaTopico1;
    }

    public ArrayList<String> getListaTopico2() {
        return listaTopico2;
    }

    public void setListaTopico2(ArrayList<String> listaTopico2) {
        this.listaTopico2 = listaTopico2;
    }

    public ArrayList<String> getListaTopico3() {
        return listaTopico3;
    }

    public void setListaTopico3(ArrayList<String> listaTopico3) {
        this.listaTopico3 = listaTopico3;
    }

    public ArrayList<String> getListaTopico4() {
        return listaTopico4;
    }

    public void setListaTopico4(ArrayList<String> listaTopico4) {
        this.listaTopico4 = listaTopico4;
    }

    public ArrayList<String> getListaTopico5() {
        return listaTopico5;
    }

    public void setListaTopico5(ArrayList<String> listaTopico5) {
        this.listaTopico5 = listaTopico5;
    }

    public ArrayList<String> getListaTopico6() {
        return listaTopico6;
    }

    public void setListaTopico6(ArrayList<String> listaTopico6) {
        this.listaTopico6 = listaTopico6;
    }

    public ArrayList<String> getListaTopico7() {
        return listaTopico7;
    }

    public void setListaTopico7(ArrayList<String> listaTopico7) {
        this.listaTopico7 = listaTopico7;
    }

    public ArrayList<String> getListaTopico8() {
        return listaTopico8;
    }

    public void setListaTopico8(ArrayList<String> listaTopico8) {
        this.listaTopico8 = listaTopico8;
    }

    public ArrayList<String> getListaTopico9() {
        return listaTopico9;
    }

    public void setListaTopico9(ArrayList<String> listaTopico9) {
        this.listaTopico9 = listaTopico9;
    }

    public ArrayList<String> getListaTopico10() {
        return listaTopico10;
    }

    public void setListaTopico10(ArrayList<String> listaTopico10) {
        this.listaTopico10 = listaTopico10;
    }
}

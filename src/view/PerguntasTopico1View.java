package view;

import java.awt.HeadlessException;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import enums.EnumPerguntaTopico1;
import enums.EnumRespostasOpcoes;
import enums.EnumSistema;
import enums.EnumTopico;

/**
 * @author eduardo.andrade
 * @since 18/08/2019
 */
public class PerguntasTopico1View extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 7239817981185783819L;
    
    private JPanel jContentPane = null;
    private JButton btnFinalizar = null;
    
    private JLabel pergunta1 = new JLabel(EnumPerguntaTopico1.PERGUNTA1.getDescricao());
    private JRadioButton radioResposta1Pergunta1 = new JRadioButton();
    private JRadioButton radioResposta2Pergunta1 = new JRadioButton();
    private JRadioButton radioResposta3Pergunta1 = new JRadioButton();
    private JRadioButton radioResposta4Pergunta1 = new JRadioButton();
    
    private JLabel pergunta2 = new JLabel(EnumPerguntaTopico1.PERGUNTA2.getDescricao());
    private JRadioButton radioResposta1Pergunta2 = new JRadioButton();
    private JRadioButton radioResposta2Pergunta2 = new JRadioButton();
    private JRadioButton radioResposta3Pergunta2 = new JRadioButton();
    private JRadioButton radioResposta4Pergunta2 = new JRadioButton();
    
    private JLabel pergunta3 = new JLabel(EnumPerguntaTopico1.PERGUNTA3.getDescricao());
    private JRadioButton radioResposta1Pergunta3 = new JRadioButton();
    private JRadioButton radioResposta2Pergunta3 = new JRadioButton();
    private JRadioButton radioResposta3Pergunta3 = new JRadioButton();
    private JRadioButton radioResposta4Pergunta3 = new JRadioButton();
    
    private JLabel pergunta4 = new JLabel(EnumPerguntaTopico1.PERGUNTA4.getDescricao());
    private JRadioButton radioResposta1Pergunta4 = new JRadioButton();
    private JRadioButton radioResposta2Pergunta4 = new JRadioButton();
    private JRadioButton radioResposta3Pergunta4 = new JRadioButton();
    private JRadioButton radioResposta4Pergunta4 = new JRadioButton();
    
    private JLabel pergunta5 = new JLabel(EnumPerguntaTopico1.PERGUNTA5.getDescricao());
    private JRadioButton radioResposta1Pergunta5 = new JRadioButton();
    private JRadioButton radioResposta2Pergunta5 = new JRadioButton();
    private JRadioButton radioResposta3Pergunta5 = new JRadioButton();
    private JRadioButton radioResposta4Pergunta5 = new JRadioButton();
    
    private JLabel pergunta6 = new JLabel(EnumPerguntaTopico1.PERGUNTA6.getDescricao());
    private JRadioButton radioResposta1Pergunta6 = new JRadioButton();
    private JRadioButton radioResposta2Pergunta6 = new JRadioButton();
    private JRadioButton radioResposta3Pergunta6 = new JRadioButton();
    private JRadioButton radioResposta4Pergunta6 = new JRadioButton();
    
    private JLabel pergunta7 = new JLabel(EnumPerguntaTopico1.PERGUNTA7.getDescricao());
    private JRadioButton radioResposta1Pergunta7 = new JRadioButton();
    private JRadioButton radioResposta2Pergunta7 = new JRadioButton();
    private JRadioButton radioResposta3Pergunta7 = new JRadioButton();
    private JRadioButton radioResposta4Pergunta7 = new JRadioButton();
    
    private JLabel pergunta8 = new JLabel(EnumPerguntaTopico1.PERGUNTA8.getDescricao());
    private JRadioButton radioResposta1Pergunta8 = new JRadioButton();
    private JRadioButton radioResposta2Pergunta8 = new JRadioButton();
    private JRadioButton radioResposta3Pergunta8 = new JRadioButton();
    private JRadioButton radioResposta4Pergunta8 = new JRadioButton();
    
    private JLabel pergunta9 = new JLabel(EnumPerguntaTopico1.PERGUNTA9.getDescricao());
    private JRadioButton radioResposta1Pergunta9 = new JRadioButton();
    private JRadioButton radioResposta2Pergunta9 = new JRadioButton();
    private JRadioButton radioResposta3Pergunta9 = new JRadioButton();
    private JRadioButton radioResposta4Pergunta9 = new JRadioButton();
    
    private JLabel pergunta10 = new JLabel(EnumPerguntaTopico1.PERGUNTA10.getDescricao());
    private JRadioButton radioResposta1Pergunta10 = new JRadioButton();
    private JRadioButton radioResposta2Pergunta10 = new JRadioButton();
    private JRadioButton radioResposta3Pergunta10 = new JRadioButton();
    private JRadioButton radioResposta4Pergunta10 = new JRadioButton();
    
    public PerguntasTopico1View() throws HeadlessException {
        super();
        initialize();
    }
    
    public void initialize() {
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setContentPane(getJContentPane());
        this.setTitle(EnumTopico.TOPICO1.getDescricao());
        adicionarComponentesNoLayout();
        definirNomeComponente();
        definirTamanhoComponentes();
    }
    
    private JPanel getJContentPane() {
        if (jContentPane == null) {
            jContentPane = new JPanel();
            jContentPane.setLayout(null);
        }
        return jContentPane;
    }
    
    //TODO: RECUPERAR DEPOIS A LISTA DA CLASSE DE PERGUNTAS
    private void definirNomeComponente() {
        radioResposta1Pergunta1.setText(EnumRespostasOpcoes.RESPOSTA1.getDescricao());
        radioResposta2Pergunta1.setText(EnumRespostasOpcoes.RESPOSTA2.getDescricao());
        radioResposta3Pergunta1.setText(EnumRespostasOpcoes.RESPOSTA3.getDescricao());
        radioResposta4Pergunta1.setText(EnumRespostasOpcoes.RESPOSTA4.getDescricao());

        radioResposta1Pergunta2.setText(EnumRespostasOpcoes.RESPOSTA1.getDescricao());
        radioResposta2Pergunta2.setText(EnumRespostasOpcoes.RESPOSTA2.getDescricao());
        radioResposta3Pergunta2.setText(EnumRespostasOpcoes.RESPOSTA3.getDescricao());
        radioResposta4Pergunta2.setText(EnumRespostasOpcoes.RESPOSTA4.getDescricao());
        
        radioResposta1Pergunta3.setText(EnumRespostasOpcoes.RESPOSTA1.getDescricao());
        radioResposta2Pergunta3.setText(EnumRespostasOpcoes.RESPOSTA2.getDescricao());
        radioResposta3Pergunta3.setText(EnumRespostasOpcoes.RESPOSTA3.getDescricao());
        radioResposta4Pergunta3.setText(EnumRespostasOpcoes.RESPOSTA4.getDescricao());
        
        radioResposta1Pergunta4.setText(EnumRespostasOpcoes.RESPOSTA1.getDescricao());
        radioResposta2Pergunta4.setText(EnumRespostasOpcoes.RESPOSTA2.getDescricao());
        radioResposta3Pergunta4.setText(EnumRespostasOpcoes.RESPOSTA3.getDescricao());
        radioResposta4Pergunta4.setText(EnumRespostasOpcoes.RESPOSTA4.getDescricao());
        
        radioResposta1Pergunta5.setText(EnumRespostasOpcoes.RESPOSTA1.getDescricao());
        radioResposta2Pergunta5.setText(EnumRespostasOpcoes.RESPOSTA2.getDescricao());
        radioResposta3Pergunta5.setText(EnumRespostasOpcoes.RESPOSTA3.getDescricao());
        radioResposta4Pergunta5.setText(EnumRespostasOpcoes.RESPOSTA4.getDescricao());
        
        radioResposta1Pergunta6.setText(EnumRespostasOpcoes.RESPOSTA1.getDescricao());
        radioResposta2Pergunta6.setText(EnumRespostasOpcoes.RESPOSTA2.getDescricao());
        radioResposta3Pergunta6.setText(EnumRespostasOpcoes.RESPOSTA3.getDescricao());
        radioResposta4Pergunta6.setText(EnumRespostasOpcoes.RESPOSTA4.getDescricao());
        
        radioResposta1Pergunta7.setText(EnumRespostasOpcoes.RESPOSTA1.getDescricao());
        radioResposta2Pergunta7.setText(EnumRespostasOpcoes.RESPOSTA2.getDescricao());
        radioResposta3Pergunta7.setText(EnumRespostasOpcoes.RESPOSTA3.getDescricao());
        radioResposta4Pergunta7.setText(EnumRespostasOpcoes.RESPOSTA4.getDescricao());
        
        radioResposta1Pergunta8.setText(EnumRespostasOpcoes.RESPOSTA1.getDescricao());
        radioResposta2Pergunta8.setText(EnumRespostasOpcoes.RESPOSTA2.getDescricao());
        radioResposta3Pergunta8.setText(EnumRespostasOpcoes.RESPOSTA3.getDescricao());
        radioResposta4Pergunta8.setText(EnumRespostasOpcoes.RESPOSTA4.getDescricao());
        
        radioResposta1Pergunta9.setText(EnumRespostasOpcoes.RESPOSTA1.getDescricao());
        radioResposta2Pergunta9.setText(EnumRespostasOpcoes.RESPOSTA2.getDescricao());
        radioResposta3Pergunta9.setText(EnumRespostasOpcoes.RESPOSTA3.getDescricao());
        radioResposta4Pergunta9.setText(EnumRespostasOpcoes.RESPOSTA4.getDescricao());
        
        radioResposta1Pergunta10.setText(EnumRespostasOpcoes.RESPOSTA1.getDescricao());
        radioResposta2Pergunta10.setText(EnumRespostasOpcoes.RESPOSTA2.getDescricao());
        radioResposta3Pergunta10.setText(EnumRespostasOpcoes.RESPOSTA3.getDescricao());
        radioResposta4Pergunta10.setText(EnumRespostasOpcoes.RESPOSTA4.getDescricao());

        btnFinalizar.setText(EnumSistema.NM_BOTA0_FINALIZAR.getDescricao());
    }
    
    private void definirTamanhoComponentes() {
        pergunta1.setBounds(new Rectangle(20, 10, 300, 25));
        radioResposta1Pergunta1.setBounds(new Rectangle(30, 40, 300, 25));
        radioResposta2Pergunta1.setBounds(new Rectangle(30, 70, 300, 25));
        radioResposta3Pergunta1.setBounds(new Rectangle(30, 100, 300, 25));
        radioResposta4Pergunta1.setBounds(new Rectangle(30, 130, 300, 25));
        
        pergunta2.setBounds(new Rectangle(20, 160, 300, 25));
        radioResposta1Pergunta2.setBounds(new Rectangle(30, 190, 300, 25));
        radioResposta2Pergunta2.setBounds(new Rectangle(30, 220, 300, 25));
        radioResposta3Pergunta2.setBounds(new Rectangle(30, 250, 300, 25));
        radioResposta4Pergunta2.setBounds(new Rectangle(30, 280, 300, 25));
        
        pergunta3.setBounds(new Rectangle(20, 310, 300, 25));
        radioResposta1Pergunta3.setBounds(new Rectangle(30, 340, 300, 25));
        radioResposta2Pergunta3.setBounds(new Rectangle(30, 370, 300, 25));
        radioResposta3Pergunta3.setBounds(new Rectangle(30, 400, 300, 25));
        radioResposta4Pergunta3.setBounds(new Rectangle(30, 430, 300, 25));
        
        pergunta4.setBounds(new Rectangle(20, 460, 300, 25));
        radioResposta1Pergunta4.setBounds(new Rectangle(30, 490, 300, 25));
        radioResposta2Pergunta4.setBounds(new Rectangle(30, 520, 300, 25));
        radioResposta3Pergunta4.setBounds(new Rectangle(30, 550, 300, 25));
        radioResposta4Pergunta4.setBounds(new Rectangle(30, 580, 300, 25));
        
        pergunta5.setBounds(new Rectangle(600, 10, 300, 25));
        radioResposta1Pergunta5.setBounds(new Rectangle(610, 40, 300, 25));
        radioResposta2Pergunta5.setBounds(new Rectangle(610, 70, 300, 25));
        radioResposta3Pergunta5.setBounds(new Rectangle(610, 100, 300, 25));
        radioResposta4Pergunta5.setBounds(new Rectangle(610, 130, 300, 25));
        
        pergunta6.setBounds(new Rectangle(600, 160, 300, 25));
        radioResposta1Pergunta6.setBounds(new Rectangle(610, 190, 300, 25));
        radioResposta2Pergunta6.setBounds(new Rectangle(610, 220, 300, 25));
        radioResposta3Pergunta6.setBounds(new Rectangle(610, 250, 300, 25));
        radioResposta4Pergunta6.setBounds(new Rectangle(610, 280, 300, 25));
        
        pergunta7.setBounds(new Rectangle(600, 310, 300, 25));
        radioResposta1Pergunta7.setBounds(new Rectangle(610, 340, 300, 25));
        radioResposta2Pergunta7.setBounds(new Rectangle(610, 370, 300, 25));
        radioResposta3Pergunta7.setBounds(new Rectangle(610, 400, 300, 25));
        radioResposta4Pergunta7.setBounds(new Rectangle(610, 430, 300, 25));
        
        pergunta8.setBounds(new Rectangle(600, 460, 300, 25));
        radioResposta1Pergunta8.setBounds(new Rectangle(610, 490, 300, 25));
        radioResposta2Pergunta8.setBounds(new Rectangle(610, 520, 300, 25));
        radioResposta3Pergunta8.setBounds(new Rectangle(610, 550, 300, 25));
        radioResposta4Pergunta8.setBounds(new Rectangle(610, 580, 300, 25));
        
        pergunta9.setBounds(new Rectangle(1100, 10, 300, 25));
        radioResposta1Pergunta9.setBounds(new Rectangle(1110, 40, 300, 25));
        radioResposta2Pergunta9.setBounds(new Rectangle(1110, 70, 300, 25));
        radioResposta3Pergunta9.setBounds(new Rectangle(1110, 100, 300, 25));
        radioResposta4Pergunta9.setBounds(new Rectangle(1110, 130, 300, 25));
        
        pergunta10.setBounds(new Rectangle(1100, 160, 300, 25));
        radioResposta1Pergunta10.setBounds(new Rectangle(1110, 190, 300, 25));
        radioResposta2Pergunta10.setBounds(new Rectangle(1110, 220, 300, 25));
        radioResposta3Pergunta10.setBounds(new Rectangle(1110, 250, 300, 25));
        radioResposta4Pergunta10.setBounds(new Rectangle(1110, 280, 300, 25));
        
        btnFinalizar.setBounds(new Rectangle(1200, 650, 110, 25));
    }
    
    private void adicionarComponentesNoLayout() {
        jContentPane.add(getPergunta1(), null);
        jContentPane.add(getRadioResposta1Pergunta1(), null);
        jContentPane.add(getRadioResposta2Pergunta1(), null);
        jContentPane.add(getRadioResposta3Pergunta1(), null);
        jContentPane.add(getRadioResposta4Pergunta1(), null);
        
        jContentPane.add(getPergunta2(), null);
        jContentPane.add(getRadioResposta1Pergunta2(), null);
        jContentPane.add(getRadioResposta2Pergunta2(), null);
        jContentPane.add(getRadioResposta3Pergunta2(), null);
        jContentPane.add(getRadioResposta4Pergunta2(), null);
        
        jContentPane.add(getPergunta3(), null);
        jContentPane.add(getRadioResposta1Pergunta3(), null);
        jContentPane.add(getRadioResposta2Pergunta3(), null);
        jContentPane.add(getRadioResposta3Pergunta3(), null);
        jContentPane.add(getRadioResposta4Pergunta3(), null);

        jContentPane.add(getPergunta4(), null);
        jContentPane.add(getRadioResposta1Pergunta4(), null);
        jContentPane.add(getRadioResposta2Pergunta4(), null);
        jContentPane.add(getRadioResposta3Pergunta4(), null);
        jContentPane.add(getRadioResposta4Pergunta4(), null);
        
        jContentPane.add(getPergunta5(), null);
        jContentPane.add(getRadioResposta1Pergunta5(), null);
        jContentPane.add(getRadioResposta2Pergunta5(), null);
        jContentPane.add(getRadioResposta3Pergunta5(), null);
        jContentPane.add(getRadioResposta4Pergunta5(), null);
        
        jContentPane.add(getPergunta6(), null);
        jContentPane.add(getRadioResposta1Pergunta6(), null);
        jContentPane.add(getRadioResposta2Pergunta6(), null);
        jContentPane.add(getRadioResposta3Pergunta6(), null);
        jContentPane.add(getRadioResposta4Pergunta6(), null);
        
        jContentPane.add(getPergunta7(), null);
        jContentPane.add(getRadioResposta1Pergunta7(), null);
        jContentPane.add(getRadioResposta2Pergunta7(), null);
        jContentPane.add(getRadioResposta3Pergunta7(), null);
        jContentPane.add(getRadioResposta4Pergunta7(), null);

        jContentPane.add(getPergunta8(), null);
        jContentPane.add(getRadioResposta1Pergunta8(), null);
        jContentPane.add(getRadioResposta2Pergunta8(), null);
        jContentPane.add(getRadioResposta3Pergunta8(), null);
        jContentPane.add(getRadioResposta4Pergunta8(), null);
        
        jContentPane.add(getPergunta9(), null);
        jContentPane.add(getRadioResposta1Pergunta9(), null);
        jContentPane.add(getRadioResposta2Pergunta9(), null);
        jContentPane.add(getRadioResposta3Pergunta9(), null);
        jContentPane.add(getRadioResposta4Pergunta9(), null);

        jContentPane.add(getPergunta10(), null);
        jContentPane.add(getRadioResposta1Pergunta10(), null);
        jContentPane.add(getRadioResposta2Pergunta10(), null);
        jContentPane.add(getRadioResposta3Pergunta10(), null);
        jContentPane.add(getRadioResposta4Pergunta10(), null);
        
        jContentPane.add(getBtnFinalizar(), null);
    }

    public JButton getBtnFinalizar() {
        return btnFinalizar == null ? btnFinalizar = new JButton() : btnFinalizar;
    }

    public JLabel getPergunta1() {
        return pergunta1;
    }
    
    public JRadioButton getRadioResposta1Pergunta1() {
        return radioResposta1Pergunta1;
    }

    public void setRadioResposta1Pergunta1(JRadioButton radioResposta1Pergunta1) {
        this.radioResposta1Pergunta1 = radioResposta1Pergunta1;
    }

    public JRadioButton getRadioResposta2Pergunta1() {
        return radioResposta2Pergunta1;
    }

    public void setRadioResposta2Pergunta1(JRadioButton radioResposta2Pergunta1) {
        this.radioResposta2Pergunta1 = radioResposta2Pergunta1;
    }

    public JRadioButton getRadioResposta3Pergunta1() {
        return radioResposta3Pergunta1;
    }

    public void setRadioResposta3Pergunta1(JRadioButton radioResposta3Pergunta1) {
        this.radioResposta3Pergunta1 = radioResposta3Pergunta1;
    }

    public JRadioButton getRadioResposta4Pergunta1() {
        return radioResposta4Pergunta1;
    }

    public void setRadioResposta4Pergunta1(JRadioButton radioResposta4Pergunta1) {
        this.radioResposta4Pergunta1 = radioResposta4Pergunta1;
    }

    public JRadioButton getRadioResposta1Pergunta2() {
        return radioResposta1Pergunta2;
    }

    public void setRadioResposta1Pergunta2(JRadioButton radioResposta1Pergunta2) {
        this.radioResposta1Pergunta2 = radioResposta1Pergunta2;
    }

    public JRadioButton getRadioResposta2Pergunta2() {
        return radioResposta2Pergunta2;
    }

    public void setRadioResposta2Pergunta2(JRadioButton radioResposta2Pergunta2) {
        this.radioResposta2Pergunta2 = radioResposta2Pergunta2;
    }

    public JRadioButton getRadioResposta3Pergunta2() {
        return radioResposta3Pergunta2;
    }

    public void setRadioResposta3Pergunta2(JRadioButton radioResposta3Pergunta2) {
        this.radioResposta3Pergunta2 = radioResposta3Pergunta2;
    }

    public JRadioButton getRadioResposta4Pergunta2() {
        return radioResposta4Pergunta2;
    }

    public void setRadioResposta4Pergunta2(JRadioButton radioResposta4Pergunta2) {
        this.radioResposta4Pergunta2 = radioResposta4Pergunta2;
    }

    public JRadioButton getRadioResposta1Pergunta3() {
        return radioResposta1Pergunta3;
    }

    public void setRadioResposta1Pergunta3(JRadioButton radioResposta1Pergunta3) {
        this.radioResposta1Pergunta3 = radioResposta1Pergunta3;
    }

    public JRadioButton getRadioResposta2Pergunta3() {
        return radioResposta2Pergunta3;
    }

    public void setRadioResposta2Pergunta3(JRadioButton radioResposta2Pergunta3) {
        this.radioResposta2Pergunta3 = radioResposta2Pergunta3;
    }

    public JRadioButton getRadioResposta3Pergunta3() {
        return radioResposta3Pergunta3;
    }

    public void setRadioResposta3Pergunta3(JRadioButton radioResposta3Pergunta3) {
        this.radioResposta3Pergunta3 = radioResposta3Pergunta3;
    }

    public JRadioButton getRadioResposta4Pergunta3() {
        return radioResposta4Pergunta3;
    }

    public void setRadioResposta4Pergunta3(JRadioButton radioResposta4Pergunta3) {
        this.radioResposta4Pergunta3 = radioResposta4Pergunta3;
    }

    public JRadioButton getRadioResposta1Pergunta4() {
        return radioResposta1Pergunta4;
    }

    public void setRadioResposta1Pergunta4(JRadioButton radioResposta1Pergunta4) {
        this.radioResposta1Pergunta4 = radioResposta1Pergunta4;
    }

    public JRadioButton getRadioResposta2Pergunta4() {
        return radioResposta2Pergunta4;
    }

    public void setRadioResposta2Pergunta4(JRadioButton radioResposta2Pergunta4) {
        this.radioResposta2Pergunta4 = radioResposta2Pergunta4;
    }

    public JRadioButton getRadioResposta3Pergunta4() {
        return radioResposta3Pergunta4;
    }

    public void setRadioResposta3Pergunta4(JRadioButton radioResposta3Pergunta4) {
        this.radioResposta3Pergunta4 = radioResposta3Pergunta4;
    }

    public JRadioButton getRadioResposta4Pergunta4() {
        return radioResposta4Pergunta4;
    }

    public void setRadioResposta4Pergunta4(JRadioButton radioResposta4Pergunta4) {
        this.radioResposta4Pergunta4 = radioResposta4Pergunta4;
    }

    public JRadioButton getRadioResposta1Pergunta5() {
        return radioResposta1Pergunta5;
    }

    public void setRadioResposta1Pergunta5(JRadioButton radioResposta1Pergunta5) {
        this.radioResposta1Pergunta5 = radioResposta1Pergunta5;
    }

    public JRadioButton getRadioResposta2Pergunta5() {
        return radioResposta2Pergunta5;
    }

    public void setRadioResposta2Pergunta5(JRadioButton radioResposta2Pergunta5) {
        this.radioResposta2Pergunta5 = radioResposta2Pergunta5;
    }

    public JRadioButton getRadioResposta3Pergunta5() {
        return radioResposta3Pergunta5;
    }

    public void setRadioResposta3Pergunta5(JRadioButton radioResposta3Pergunta5) {
        this.radioResposta3Pergunta5 = radioResposta3Pergunta5;
    }

    public JRadioButton getRadioResposta4Pergunta5() {
        return radioResposta4Pergunta5;
    }

    public void setRadioResposta4Pergunta5(JRadioButton radioResposta4Pergunta5) {
        this.radioResposta4Pergunta5 = radioResposta4Pergunta5;
    }

    public JRadioButton getRadioResposta1Pergunta6() {
        return radioResposta1Pergunta6;
    }

    public void setRadioResposta1Pergunta6(JRadioButton radioResposta1Pergunta6) {
        this.radioResposta1Pergunta6 = radioResposta1Pergunta6;
    }

    public JRadioButton getRadioResposta2Pergunta6() {
        return radioResposta2Pergunta6;
    }

    public void setRadioResposta2Pergunta6(JRadioButton radioResposta2Pergunta6) {
        this.radioResposta2Pergunta6 = radioResposta2Pergunta6;
    }

    public JRadioButton getRadioResposta3Pergunta6() {
        return radioResposta3Pergunta6;
    }

    public void setRadioResposta3Pergunta6(JRadioButton radioResposta3Pergunta6) {
        this.radioResposta3Pergunta6 = radioResposta3Pergunta6;
    }

    public JRadioButton getRadioResposta4Pergunta6() {
        return radioResposta4Pergunta6;
    }

    public void setRadioResposta4Pergunta6(JRadioButton radioResposta4Pergunta6) {
        this.radioResposta4Pergunta6 = radioResposta4Pergunta6;
    }

    public JRadioButton getRadioResposta1Pergunta7() {
        return radioResposta1Pergunta7;
    }

    public void setRadioResposta1Pergunta7(JRadioButton radioResposta1Pergunta7) {
        this.radioResposta1Pergunta7 = radioResposta1Pergunta7;
    }

    public JRadioButton getRadioResposta2Pergunta7() {
        return radioResposta2Pergunta7;
    }

    public void setRadioResposta2Pergunta7(JRadioButton radioResposta2Pergunta7) {
        this.radioResposta2Pergunta7 = radioResposta2Pergunta7;
    }

    public JRadioButton getRadioResposta3Pergunta7() {
        return radioResposta3Pergunta7;
    }

    public void setRadioResposta3Pergunta7(JRadioButton radioResposta3Pergunta7) {
        this.radioResposta3Pergunta7 = radioResposta3Pergunta7;
    }

    public JRadioButton getRadioResposta4Pergunta7() {
        return radioResposta4Pergunta7;
    }

    public void setRadioResposta4Pergunta7(JRadioButton radioResposta4Pergunta7) {
        this.radioResposta4Pergunta7 = radioResposta4Pergunta7;
    }

    public JRadioButton getRadioResposta1Pergunta8() {
        return radioResposta1Pergunta8;
    }

    public void setRadioResposta1Pergunta8(JRadioButton radioResposta1Pergunta8) {
        this.radioResposta1Pergunta8 = radioResposta1Pergunta8;
    }

    public JRadioButton getRadioResposta2Pergunta8() {
        return radioResposta2Pergunta8;
    }

    public void setRadioResposta2Pergunta8(JRadioButton radioResposta2Pergunta8) {
        this.radioResposta2Pergunta8 = radioResposta2Pergunta8;
    }

    public JRadioButton getRadioResposta3Pergunta8() {
        return radioResposta3Pergunta8;
    }

    public void setRadioResposta3Pergunta8(JRadioButton radioResposta3Pergunta8) {
        this.radioResposta3Pergunta8 = radioResposta3Pergunta8;
    }

    public JRadioButton getRadioResposta4Pergunta8() {
        return radioResposta4Pergunta8;
    }

    public void setRadioResposta4Pergunta8(JRadioButton radioResposta4Pergunta8) {
        this.radioResposta4Pergunta8 = radioResposta4Pergunta8;
    }

    public JRadioButton getRadioResposta1Pergunta9() {
        return radioResposta1Pergunta9;
    }

    public void setRadioResposta1Pergunta9(JRadioButton radioResposta1Pergunta9) {
        this.radioResposta1Pergunta9 = radioResposta1Pergunta9;
    }

    public JRadioButton getRadioResposta2Pergunta9() {
        return radioResposta2Pergunta9;
    }

    public void setRadioResposta2Pergunta9(JRadioButton radioResposta2Pergunta9) {
        this.radioResposta2Pergunta9 = radioResposta2Pergunta9;
    }

    public JRadioButton getRadioResposta3Pergunta9() {
        return radioResposta3Pergunta9;
    }

    public void setRadioResposta3Pergunta9(JRadioButton radioResposta3Pergunta9) {
        this.radioResposta3Pergunta9 = radioResposta3Pergunta9;
    }

    public JRadioButton getRadioResposta4Pergunta9() {
        return radioResposta4Pergunta9;
    }

    public void setRadioResposta4Pergunta9(JRadioButton radioResposta4Pergunta9) {
        this.radioResposta4Pergunta9 = radioResposta4Pergunta9;
    }

    public JRadioButton getRadioResposta1Pergunta10() {
        return radioResposta1Pergunta10;
    }

    public void setRadioResposta1Pergunta10(JRadioButton radioResposta1Pergunta10) {
        this.radioResposta1Pergunta10 = radioResposta1Pergunta10;
    }

    public JRadioButton getRadioResposta2Pergunta10() {
        return radioResposta2Pergunta10;
    }

    public void setRadioResposta2Pergunta10(JRadioButton radioResposta2Pergunta10) {
        this.radioResposta2Pergunta10 = radioResposta2Pergunta10;
    }

    public JRadioButton getRadioResposta3Pergunta10() {
        return radioResposta3Pergunta10;
    }

    public void setRadioResposta3Pergunta10(JRadioButton radioResposta3Pergunta10) {
        this.radioResposta3Pergunta10 = radioResposta3Pergunta10;
    }

    public JRadioButton getRadioResposta4Pergunta10() {
        return radioResposta4Pergunta10;
    }

    public void setRadioResposta4Pergunta10(JRadioButton radioResposta4Pergunta10) {
        this.radioResposta4Pergunta10 = radioResposta4Pergunta10;
    }

    public JLabel getPergunta2() {
        return pergunta2;
    }

    public JLabel getPergunta3() {
        return pergunta3;
    }

    public JLabel getPergunta4() {
        return pergunta4;
    }

    public JLabel getPergunta5() {
        return pergunta5;
    }

    public JLabel getPergunta6() {
        return pergunta6;
    }

    public JLabel getPergunta7() {
        return pergunta7;
    }

    public JLabel getPergunta8() {
        return pergunta8;
    }

    public JLabel getPergunta9() {
        return pergunta9;
    }

    public JLabel getPergunta10() {
        return pergunta10;
    }

}

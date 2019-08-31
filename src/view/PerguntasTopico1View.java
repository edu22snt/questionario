package view;

import java.awt.HeadlessException;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import enums.EnumPerguntaTopico1;
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
    
    private JRadioButton radioPergunta1 = null;
    private JRadioButton radioPergunta2 = null;
    private JRadioButton radioPergunta3 = null;
    private JRadioButton radioPergunta4 = null;
    private JRadioButton radioPergunta5 = null;
    private JRadioButton radioPergunta6 = null;
    private JRadioButton radioPergunta7 = null;
    private JRadioButton radioPergunta8 = null;
    private JRadioButton radioPergunta9 = null;
    private JRadioButton radioPergunta10 = null;

    
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
        radioPergunta1.setText(EnumPerguntaTopico1.PERGUNTA1.getDescricao());
        radioPergunta2.setText(EnumPerguntaTopico1.PERGUNTA2.getDescricao());
        radioPergunta3.setText(EnumPerguntaTopico1.PERGUNTA3.getDescricao());
        radioPergunta4.setText(EnumPerguntaTopico1.PERGUNTA4.getDescricao());
        radioPergunta5.setText(EnumPerguntaTopico1.PERGUNTA5.getDescricao());
        radioPergunta6.setText(EnumPerguntaTopico1.PERGUNTA6.getDescricao());
        radioPergunta7.setText(EnumPerguntaTopico1.PERGUNTA7.getDescricao());
        radioPergunta8.setText(EnumPerguntaTopico1.PERGUNTA8.getDescricao());
        radioPergunta9.setText(EnumPerguntaTopico1.PERGUNTA9.getDescricao());
        radioPergunta10.setText(EnumPerguntaTopico1.PERGUNTA10.getDescricao());

        btnFinalizar.setText(EnumSistema.NM_BOTA0_FINALIZAR.getDescricao());
    }
    
    private void definirTamanhoComponentes() {
        radioPergunta1.setBounds(new Rectangle(20, 10, 300, 25));
        radioPergunta2.setBounds(new Rectangle(20, 40, 300, 25));
        radioPergunta3.setBounds(new Rectangle(20, 70, 300, 25));
        radioPergunta4.setBounds(new Rectangle(20, 100, 300, 25));
        radioPergunta5.setBounds(new Rectangle(20, 130, 300, 25));
        radioPergunta6.setBounds(new Rectangle(20, 160, 300, 25));
        radioPergunta7.setBounds(new Rectangle(20, 190, 300, 25));
        radioPergunta8.setBounds(new Rectangle(20, 220, 300, 25));
        radioPergunta9.setBounds(new Rectangle(20, 250, 300, 25));
        radioPergunta10.setBounds(new Rectangle(20, 280, 300, 25));
        
        btnFinalizar.setBounds(new Rectangle(1200, 650, 110, 25));
    }
    
    private void adicionarComponentesNoLayout() {
        jContentPane.add(getRadioPergunta1(), null);
        jContentPane.add(getRadioPergunta2(), null);
        jContentPane.add(getRadioPergunta3(), null);
        jContentPane.add(getRadioPergunta4(), null);
        jContentPane.add(getRadioPergunta5(), null);
        jContentPane.add(getRadioPergunta6(), null);
        jContentPane.add(getRadioPergunta7(), null);
        jContentPane.add(getRadioPergunta8(), null);
        jContentPane.add(getRadioPergunta9(), null);
        jContentPane.add(getRadioPergunta10(), null);
        jContentPane.add(getBtnFinalizar(), null);
    }

    public JButton getBtnFinalizar() {
        return btnFinalizar == null ? btnFinalizar = new JButton() : btnFinalizar;
    }

    public JRadioButton getRadioPergunta1() {
        return radioPergunta1 == null ? radioPergunta1 = new JRadioButton() : radioPergunta1;
    }

    public JRadioButton getRadioPergunta2() {
        return radioPergunta2 == null ? radioPergunta2 = new JRadioButton() : radioPergunta2;
    }

    public JRadioButton getRadioPergunta3() {
        return radioPergunta3 == null ? radioPergunta3 = new JRadioButton() : radioPergunta3;
    }

    public JRadioButton getRadioPergunta4() {
        return radioPergunta4 == null ? radioPergunta4 = new JRadioButton() : radioPergunta4;
    }

    public JRadioButton getRadioPergunta5() {
        return radioPergunta5 == null ? radioPergunta5 = new JRadioButton() : radioPergunta5;
    }

    public JRadioButton getRadioPergunta6() {
        return radioPergunta6 == null ? radioPergunta6 = new JRadioButton() : radioPergunta6;
    }

    public JRadioButton getRadioPergunta7() {
        return radioPergunta7 == null ? radioPergunta7 = new JRadioButton() : radioPergunta7;
    }

    public JRadioButton getRadioPergunta8() {
        return radioPergunta8 == null ? radioPergunta8 = new JRadioButton() : radioPergunta8;
    }

    public JRadioButton getRadioPergunta9() {
        return radioPergunta9 == null ? radioPergunta9 = new JRadioButton() : radioPergunta9;
    }

    public JRadioButton getRadioPergunta10() {
        return radioPergunta10 == null ? radioPergunta10 = new JRadioButton() : radioPergunta10;
    }

}

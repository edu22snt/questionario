package view;

import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controle.Questionario;
import enums.EnumSistema;
import enums.EnumTopico;

/**
 * @author eduardo.andrade
 * @since 07/08/2019
 */
public class QuestionarioView extends JFrame {

	private static final long serialVersionUID = -6673004886460089120L;

	private JPanel jContentPane = null;
	private JCheckBox ckTopico1 = null;
	private JCheckBox ckTopico2 = null;
	private JCheckBox ckTopico3 = null;
	private JCheckBox ckTopico4 = null;
    private JCheckBox ckTopico5 = null;
    private JCheckBox ckTopico6 = null;
    private JCheckBox ckTopico7 = null;
    private JCheckBox ckTopico8 = null;
    private JCheckBox ckTopico9 = null;
    private JCheckBox ckTopico10 = null;
    private JCheckBox ckTopico11 = null;
    private JCheckBox ckTopico12 = null;
    private JCheckBox ckTopico13 = null;
    private JCheckBox ckTopico14 = null;
    private JCheckBox ckTopico15 = null;
    private JCheckBox ckTopico16 = null;

	private JButton btnOk = null;
	private JButton btnFechar = null;

	public QuestionarioView() throws HeadlessException {
		super();
		initialize();
	}

	public void initialize() {
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setContentPane(getJContentPane());
		this.setTitle(EnumSistema.NM_SITEMA.getDescricao());
		adicionarComponentesNoLayout();
		acaoCheckbox();
		acaoComponentes();
		definirNomeComponente();
		definirTamanhoComponentes();
	}

	private void limparCampos() {
		//txtaMensagem.setText("");
	}

	/**
	 * Metodo responsavel pelas as acoes dos componentes.
	 */
	private void acaoComponentes() {
	    acaoTopico1();
	    acaoTopico2();
	    acaoTopico3();
	    acaoTopico4();
	    acaoTopico5();
	    acaoTopico6();
	    acaoTopico7();
	    acaoTopico8();
	    acaoTopico9();
	    acaoTopico10();
        acaoTopico11();
        acaoTopico12();
        acaoTopico13();
        acaoTopico14();
        acaoTopico15();
        acaoTopico16();
		acaoBtnFechar();
		acaoBtnOk();
	}

	private void selecionarCheck(int value) {
	    ckTopico1.setSelected(value == 1 ? true : false);
        ckTopico2.setSelected(value == 2 ? true : false);
        ckTopico3.setSelected(value == 3 ? true : false);
        ckTopico4.setSelected(value == 4 ? true : false);
        ckTopico5.setSelected(value == 5 ? true : false);
        ckTopico6.setSelected(value == 6 ? true : false);
        ckTopico7.setSelected(value == 7 ? true : false);
        ckTopico8.setSelected(value == 8 ? true : false);
        ckTopico9.setSelected(value == 9 ? true : false);
        ckTopico10.setSelected(value == 10 ? true : false);
        ckTopico11.setSelected(value == 11 ? true : false);
        ckTopico12.setSelected(value == 12 ? true : false);
        ckTopico13.setSelected(value == 13 ? true : false);
        ckTopico14.setSelected(value == 14 ? true : false);
        ckTopico15.setSelected(value == 15 ? true : false);
        ckTopico16.setSelected(value == 16 ? true : false);
	}

	private void acaoTopico1() {
	    ckTopico1.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() >= 1) {
                    selecionarCheck(1);
                    acaoCheckbox();
                    limparCampos();
                }
            }
        });
	}

	private void acaoTopico2() {
        ckTopico2.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() >= 1) {
                    selecionarCheck(2);
                    acaoCheckbox();
                    limparCampos();
                }
            }
        });
    }

    private void acaoTopico3() {
        ckTopico3.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() >= 1) {
                    selecionarCheck(3);
                    acaoCheckbox();
                    limparCampos();
                }
            }
        });
    }

    private void acaoTopico4() {
        ckTopico4.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() >= 1) {
                    selecionarCheck(4);
                    acaoCheckbox();
                    limparCampos();
                }
            }
        });
    }

    private void acaoTopico5() {
        ckTopico5.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() >= 1) {
                    selecionarCheck(5);
                    acaoCheckbox();
                    limparCampos();
                }
            }
        });
    }

    private void acaoTopico6() {
        ckTopico6.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() >= 1) {
                    selecionarCheck(6);
                    acaoCheckbox();
                    limparCampos();
                }
            }
        });
    }

    private void acaoTopico7() {
        ckTopico7.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() >= 1) {
                    selecionarCheck(7);
                    acaoCheckbox();
                    limparCampos();
                }
            }
        });
    }

    private void acaoTopico8() {
        ckTopico8.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() >= 1) {
                    selecionarCheck(8);
                    acaoCheckbox();
                    limparCampos();
                }
            }
        });
    }

    private void acaoTopico9() {
        ckTopico9.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() >= 1) {
                    selecionarCheck(9);
                    acaoCheckbox();
                    limparCampos();
                }
            }
        });
    }

    private void acaoTopico10() {
        ckTopico10.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() >= 1) {
                    selecionarCheck(10);
                    acaoCheckbox();
                    limparCampos();
                }
            }
        });
    }
    
    private void acaoTopico11() {
        ckTopico11.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() >= 1) {
                    selecionarCheck(11);
                    acaoCheckbox();
                    limparCampos();
                }
            }
        });
    }
    
    private void acaoTopico12() {
        ckTopico12.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() >= 1) {
                    selecionarCheck(12);
                    acaoCheckbox();
                    limparCampos();
                }
            }
        });
    }
    
    private void acaoTopico13() {
        ckTopico13.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() >= 1) {
                    selecionarCheck(13);
                    acaoCheckbox();
                    limparCampos();
                }
            }
        });
    }
    
    private void acaoTopico14() {
        ckTopico14.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() >= 1) {
                    selecionarCheck(14);
                    acaoCheckbox();
                    limparCampos();
                }
            }
        });
    }
    
    private void acaoTopico15() {
        ckTopico15.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() >= 1) {
                    selecionarCheck(15);
                    acaoCheckbox();
                    limparCampos();
                }
            }
        });
    }
    
    private void acaoTopico16() {
        ckTopico16.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() >= 1) {
                    selecionarCheck(16);
                    acaoCheckbox();
                    limparCampos();
                }
            }
        });
    }

	private void acaoBtnFechar() {
		btnFechar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}

	private void acaoBtnOk() {
	    btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Questionario q = new Questionario();

				if(ckTopico1.isSelected()) {
//					loterias.sortearNumerosMegaSena();
//					txtNumerosSorteadosMegaSena.setText(loterias.getNumerosSorteados());
				} else if(ckTopico2.isSelected()) {

				} else if(ckTopico3.isSelected()) {

				} else if(ckTopico4.isSelected()) {

				} else if(ckTopico5.isSelected()) {

				} else if(ckTopico6.isSelected()) {

				} else if(ckTopico7.isSelected()) {

                } else if(ckTopico8.isSelected()) {

                } else if(ckTopico9.isSelected()) {

                } else if(ckTopico10.isSelected()) {

                } else if(ckTopico11.isSelected()) {

                } else if(ckTopico12.isSelected()) {

                } else if(ckTopico13.isSelected()) {

                } else if(ckTopico14.isSelected()) {

                } else if(ckTopico15.isSelected()) {

                } else if(ckTopico16.isSelected()) {

                }
			}
		});
	}
	
	private void popularObjeto(int value) {
        ckTopico1.setSelected(value == 1? true : false);
        ckTopico2.setSelected(value == 2? true : false);
        ckTopico3.setSelected(value == 3? true : false);
        ckTopico4.setSelected(value == 4? true : false);
        ckTopico5.setSelected(value == 5? true : false);
        ckTopico6.setSelected(value == 6? true : false);
        ckTopico7.setSelected(value == 7? true : false);
        ckTopico8.setSelected(value == 8? true : false);
        ckTopico9.setSelected(value == 9? true : false);
        ckTopico10.setSelected(value == 10? true : false);
        ckTopico11.setSelected(value == 11? true : false);
        ckTopico12.setSelected(value == 12? true : false);
        ckTopico13.setSelected(value == 13? true : false);
        ckTopico14.setSelected(value == 14? true : false);
        ckTopico15.setSelected(value == 15? true : false);
        ckTopico16.setSelected(value == 16? true : false);
	}
	
	private void definirItensTela(int value) {
	    
	}

	/**
	 * Metodo responsavel por definir as
	 * acoes dos checkboxs.
	 */
	private void acaoCheckbox() {
		if(ckTopico1.isSelected()) {
		    popularObjeto(1);
		    definirItensTela(1);
		}
		if(ckTopico2.isSelected()) {
		    popularObjeto(2);
		    definirItensTela(2);
		}
		if(ckTopico3.isSelected()) {
		    popularObjeto(3);
		    definirItensTela(3);
		}
		if(ckTopico4.isSelected()) {
            popularObjeto(4);
            definirItensTela(4);
		}
        if(ckTopico5.isSelected()) {
            popularObjeto(5);
            definirItensTela(5);
        }
		if(ckTopico6.isSelected()) {
            popularObjeto(6);
            definirItensTela(6);
		}
		if(ckTopico7.isSelected()) {
            popularObjeto(7);
            definirItensTela(7);
		}
	    if(ckTopico8.isSelected()) {
            popularObjeto(8);
            definirItensTela(8);
	    }
	    if(ckTopico9.isSelected()) {
            popularObjeto(9);
            definirItensTela(9);
        }
        if(ckTopico10.isSelected()) {
            popularObjeto(10);
            definirItensTela(10);
        }
        if(ckTopico11.isSelected()) {
            popularObjeto(11);
            definirItensTela(11);
        }
        if(ckTopico12.isSelected()) {
            popularObjeto(12);
            definirItensTela(12);
        }
        if(ckTopico13.isSelected()) {
            popularObjeto(13);
            definirItensTela(13);
        }
        if(ckTopico14.isSelected()) {
            popularObjeto(14);
            definirItensTela(14);
        }
        if(ckTopico15.isSelected()) {
            popularObjeto(15);
            definirItensTela(15);
        }
        if(ckTopico16.isSelected()) {
            popularObjeto(16);
            definirItensTela(16);
        }
	}

	private void definirNomeComponente() {
	    ckTopico1.setText(EnumTopico.TOPICO1.getDescricao());
	    ckTopico2.setText(EnumTopico.TOPICO2.getDescricao());
	    ckTopico3.setText(EnumTopico.TOPICO3.getDescricao());
	    ckTopico4.setText(EnumTopico.TOPICO4.getDescricao());
	    ckTopico5.setText(EnumTopico.TOPICO5.getDescricao());
	    ckTopico6.setText(EnumTopico.TOPICO6.getDescricao());
	    ckTopico7.setText(EnumTopico.TOPICO7.getDescricao());
	    ckTopico8.setText(EnumTopico.TOPICO8.getDescricao());
	    ckTopico9.setText(EnumTopico.TOPICO9.getDescricao());
	    ckTopico10.setText(EnumTopico.TOPICO10.getDescricao());
	    ckTopico11.setText(EnumTopico.TOPICO11.getDescricao());
	    ckTopico12.setText(EnumTopico.TOPICO12.getDescricao());
	    ckTopico13.setText(EnumTopico.TOPICO13.getDescricao());
	    ckTopico14.setText(EnumTopico.TOPICO14.getDescricao());
	    ckTopico15.setText(EnumTopico.TOPICO15.getDescricao());
	    ckTopico16.setText(EnumTopico.TOPICO16.getDescricao());
		btnOk.setText(EnumSistema.NM_BOTAO_OK.getDescricao());
		btnFechar.setText(EnumSistema.NM_BOTA0_FECHAR.getDescricao());
	}

	private void definirTamanhoComponentes() {
		ckTopico1.setBounds(new Rectangle(20, 10, 300, 25));
		ckTopico2.setBounds(new Rectangle(20, 40, 300, 25));
		ckTopico3.setBounds(new Rectangle(20, 70, 300, 25));
		ckTopico4.setBounds(new Rectangle(20, 100, 300, 25));
		ckTopico5.setBounds(new Rectangle(20, 130, 300, 25));
		ckTopico6.setBounds(new Rectangle(20, 160, 300, 25));
		ckTopico7.setBounds(new Rectangle(20, 190, 300, 25));
		ckTopico8.setBounds(new Rectangle(20, 220, 300, 25));
		ckTopico9.setBounds(new Rectangle(20, 250, 300, 25));
		ckTopico10.setBounds(new Rectangle(20, 280, 300, 25));
        ckTopico11.setBounds(new Rectangle(20, 310, 300, 25));
        ckTopico12.setBounds(new Rectangle(20, 340, 300, 25));
        ckTopico13.setBounds(new Rectangle(20, 370, 300, 25));
        ckTopico14.setBounds(new Rectangle(20, 400, 300, 25));
        ckTopico15.setBounds(new Rectangle(20, 430, 300, 25));
        ckTopico16.setBounds(new Rectangle(20, 460, 300, 25));
        
		btnFechar.setBounds(new Rectangle(550, 650, 110, 25));
		btnOk.setBounds(new Rectangle(680, 650, 110, 25));
	}

	private void adicionarComponentesNoLayout() {
		jContentPane.add(getCkTopico1(), null);
		jContentPane.add(getCkTopico2(), null);
		jContentPane.add(getCkTopico3(), null);
		jContentPane.add(getCkTopico4(), null);
		jContentPane.add(getCkTopico5(), null);
		jContentPane.add(getCkTopico6(), null);
		jContentPane.add(getCkTopico7(), null);
		jContentPane.add(getCkTopico8(), null);
		jContentPane.add(getCkTopico9(), null);
		jContentPane.add(getCkTopico10(), null);
        jContentPane.add(getCkTopico11(), null);
        jContentPane.add(getCkTopico12(), null);
        jContentPane.add(getCkTopico13(), null);
        jContentPane.add(getCkTopico14(), null);
        jContentPane.add(getCkTopico15(), null);
        jContentPane.add(getCkTopico16(), null);
		jContentPane.add(getBtnOk(), null);
		jContentPane.add(getBtnFechar(), null);
	}

	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
		}
		return jContentPane;
	}

	private JButton getBtnOk() {
		if (btnOk == null) {
		    btnOk = new JButton();
		}
		return btnOk;
	}

	private JButton getBtnFechar() {
		if (btnFechar == null) {
			btnFechar = new JButton();
		}
		return btnFechar;
	}

    public JCheckBox getCkTopico1() {
        return ckTopico1 == null ? ckTopico1 = new JCheckBox() : ckTopico1;
    }

    public JCheckBox getCkTopico2() {
        return ckTopico2 == null ? ckTopico2 = new JCheckBox() : ckTopico2;
    }

    public JCheckBox getCkTopico3() {
        return ckTopico3 == null ? ckTopico3 = new JCheckBox() : ckTopico3;
    }

    public JCheckBox getCkTopico4() {
        return ckTopico4 == null ? ckTopico4 = new JCheckBox() : ckTopico4;
    }

    public JCheckBox getCkTopico5() {
        return ckTopico5 == null ? ckTopico5 = new JCheckBox() : ckTopico5;
    }

    public JCheckBox getCkTopico6() {
        return ckTopico6 == null ? ckTopico6 = new JCheckBox() : ckTopico6;
    }

    public JCheckBox getCkTopico7() {
        return ckTopico7 == null ? ckTopico7 = new JCheckBox() : ckTopico7;
    }

    public JCheckBox getCkTopico8() {
        return ckTopico8 == null ? ckTopico8 = new JCheckBox() : ckTopico8;
    }

    public JCheckBox getCkTopico9() {
        return ckTopico9 == null ? ckTopico9 = new JCheckBox() : ckTopico9;
    }

    public JCheckBox getCkTopico10() {
        return ckTopico10 == null ? ckTopico10 = new JCheckBox() : ckTopico10;
    }

    public JCheckBox getCkTopico11() {
        return ckTopico11 == null ? ckTopico11 = new JCheckBox() : ckTopico11;
    }

    public JCheckBox getCkTopico12() {
        return ckTopico12 == null ? ckTopico12 = new JCheckBox() : ckTopico12;
    }

    public JCheckBox getCkTopico13() {
        return ckTopico13 == null ? ckTopico13 = new JCheckBox() : ckTopico13;
    }

    public JCheckBox getCkTopico14() {
        return ckTopico14 == null ? ckTopico14 = new JCheckBox() : ckTopico14;
    }

    public JCheckBox getCkTopico15() {
        return ckTopico15 == null ? ckTopico15 = new JCheckBox() : ckTopico15;
    }

    public JCheckBox getCkTopico16() {
        return ckTopico16 == null ? ckTopico16 = new JCheckBox() : ckTopico16;
    }

}

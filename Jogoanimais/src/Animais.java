import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Animais {

	static JFrame a = new JFrame();
	static JButton o = new JButton("OK");
	static JLabel m = new JLabel("Pense em um Animal!");

	static No no = new No();

	static String nome = "";

	public static void main(String[] args) {
		a.setSize(230, 100);
		a.setLocation(500, 300);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setTitle("Animais");
		a.add(m).setBounds(60, 10, 200, 20);
		a.setResizable(false);
		a.add(o).setBounds(80, 40, 70, 20);
		a.setLayout(null);
		a.setVisible(true);
		botao();

	}

	public static void Animal() {
		int resultado = JOptionPane.showConfirmDialog(null, "O Animal Que Voc� Pensou Vive na �gua?");
		if (resultado == JOptionPane.YES_OPTION) {
			nome = "Tubar�o";
			Agua(no);
		} else {
			nome = "Macaco";
			Terra(no);
}
	}

	public static void Agua(No no) {

		if (no.noE != null) {
			Tubarao(no.noE);
		} else {
			if (JOptionPane.showConfirmDialog(null, "O Animal que voc� pensou � um Tubar�o?", "Animais",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Acertei de Novo");
			} else {
				No Animal = new No();
				String Peixe;
				String Resposta;
				Animal.A = Peixe = JOptionPane.showInputDialog("Em Qual Animal Voce Pensou?");
				Animal.B = Resposta = JOptionPane.showInputDialog(null,
						"Um(a) " + Peixe + " � _________, mas um Tubar�o n�o");
				no.noE = Animal;

			}
		}
	}

	public static void Terra(No no) {

		if (no.noD != null) {
			Macaco(no.noD);
		} else {
			if (JOptionPane.showConfirmDialog(null, "O Animal que voc� pensou � um Macaco?", "Animais",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Acertei de Novo");
			} else {
				No Animal = new No();
				String Peixe;
				String Resposta;
				Animal.A = Peixe = JOptionPane.showInputDialog("Em Qual Animal Voce Pensou?");
				Animal.B = Resposta = JOptionPane.showInputDialog(null,
						"Um(a) " + Peixe + " � _________, mas um Tubar�o n�o");
				no.noD = Animal;

			}
		}
	}

	static void Tubarao(No noE) {

		if (JOptionPane.showConfirmDialog(null, "O animal que voc� pensou " + noE.B + "?", "Animais",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
			nome = noE.A;
			if (noE.noD != null) {
				Tubarao(noE.noD);
			} else {
				if (JOptionPane.showConfirmDialog(null, "O Animal que voc� pensou � um(a) " + nome + "?", "Animais",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "Acertei de Novo");
				} else {
					No Animal = new No();
					String Peixe;
					String Resposta;
					Animal.A = Peixe = JOptionPane.showInputDialog("Em Qual Animal Voce Pensou?");
					Animal.B = Resposta = JOptionPane.showInputDialog(null,
							"Um(a) " + Peixe + " � _________, mas um " + noE.A + " n�o");
					noE.noD = Animal;
				}
			}

		} else {
			if (noE.noE != null) {
				Tubarao(noE.noE);
			} else {
				if (JOptionPane.showConfirmDialog(null, "O Animal que voc� pensou � um " + nome + "?", "Animais",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "Acertei de Novo");
				} else {
					No Animal = new No();
					String Peixe;
					String Resposta;
					Animal.A = Peixe = JOptionPane.showInputDialog("Em Qual Animal Voce Pensou?");
					Animal.B = Resposta = JOptionPane.showInputDialog(null,
							"Um(a) " + Peixe + " � _________, mas um Tubar�o n�o");
					noE.noE = Animal;

				}
			}
		}

	}

	static void Macaco(No noD) {

		if (JOptionPane.showConfirmDialog(null, "O animal que voc� pensou " + noD.B + "?", "Animais",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
			nome = noD.A;
			if (noD.noE != null) {
				Macaco(noD.noE);
			} else {
				if (JOptionPane.showConfirmDialog(null, "O Animal que voc� pensou � um(a) " + nome + "?", "Animais",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "Acertei de Novo");
				} else {
					No Animal = new No();
					String Anim;
					String Resp;
					Animal.A = Anim = JOptionPane.showInputDialog("Em Qual Animal Voce Pensou?");
					Animal.B = Resp = JOptionPane.showInputDialog(null,
							"Um(a) " + Anim + " � _________, mas um " + noD.A + " n�o");
					noD.noE = Animal;
				}
			}

		} else {
			if (noD.noD != null) {
				Macaco(noD.noD);
			} else {
				if (JOptionPane.showConfirmDialog(null, "O Animal que voc� pensou � um " + nome + "?", "Animais",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "Acertei de Novo");
				} else {
					No Animal = new No();
					String Anim;
					String Resp;
					Animal.A = Anim = JOptionPane.showInputDialog("Em Qual Animal Voce Pensou?");
					Animal.B = Resp = JOptionPane.showInputDialog(null,
							"Um(a) " + Anim + " � _________, mas um Macaco n�o");
					noD.noD = Animal;

				}
			}
		}
	}

	static void botao() {

		o.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				Animal();

			}
		});
	}
}

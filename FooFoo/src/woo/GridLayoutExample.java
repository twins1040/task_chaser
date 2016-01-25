package woo;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

class StatusPanel extends JPanel{
	/* 라벨 객체 생성, panelA에 label추가 */
//	JPanel panel = new JPanel();
	
	JLabel label1; 
	JLabel label2; 
	JLabel label3; 
	JButton button1; 
	
	public StatusPanel(String lab1, String lab2, String lab3){
		
		label1 = new JLabel(lab1);
		label2 = new JLabel(lab2);
		label3 = new JLabel(lab3);
		this.button1 = new JButton("check");
		
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(button1);
	}
	
}

public class GridLayoutExample extends JFrame {

    public GridLayoutExample() {

        initUI();
    }

    public final void initUI() {

        final JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.setLayout(new GridLayout(7, 1, 5, 5));

        StatusPanel s1 = new StatusPanel("13", "공부", "15");
        StatusPanel s2 = new StatusPanel("13", "공부", "15");
        StatusPanel s3 = new StatusPanel("13", "공부", "15");
        
        //입력 패널
        JPanel resultPanel = new JPanel();
        resultPanel.add(new JLabel("시작"));
        resultPanel.add(new JLabel("종료"));
        
	        //텍스트 영역
	        final JTextArea area = new JTextArea("텍스트");
	        area.setLineWrap(true);
	        area.setWrapStyleWord(true);
        
	        //추가 버튼
	        JButton addButton = new JButton("추가");
	        addButton.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent arg0) {
//					area.setText("text change");
					
				}
			});
        resultPanel.add(area);
        resultPanel.add(addButton);
        resultPanel.setBackground(Color.GREEN);
        
        //만든 패널들 올리기
        panel.add(s1);
        panel.add(s2);
        panel.add(s3);
        panel.add(resultPanel);
        
        add(panel);

        setTitle("스케쥴 관리");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                GridLayoutExample ex = new GridLayoutExample();
                ex.setVisible(true);
            }
        });
    }
}

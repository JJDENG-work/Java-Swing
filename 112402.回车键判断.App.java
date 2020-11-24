package gks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JTextArea label_txt_A=new JTextArea();
    JTextArea label_txt_B=new JTextArea();
    //构造方法
    public App() {

        label_txt_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                if (label_txt_A.getText().equals("等加减")){
                    if (e.getKeyCode() == KeyEvent.VK_ENTER){
                        label_txt_B.setText("天才");
                    }
                }
                if (!label_txt_A.getText().equals("等加减")){
                    if (e.getKeyCode() == KeyEvent.VK_ENTER){
                        label_txt_B.setText("笨蛋");
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE){
                    label_txt_A.setText("");
                    label_txt_B.setText("");
                }

            }
        });


    }
    //显示窗体方法
    void go(){
        label_txt_A.setBounds(100,50,150,100);
        label_txt_A.setBackground(Color.yellow);
        myPanel.add(label_txt_A);
        label_txt_B.setBounds(100,170,150,100);
        label_txt_B.setBackground(Color.green);
        myPanel.add(label_txt_B);

        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(label_txt_A);
        myPanel.add(label_txt_B);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(1000,200,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}

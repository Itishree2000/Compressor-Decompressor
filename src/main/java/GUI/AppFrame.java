/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;
import comp_decomp.compressor;
import comp_decomp.decompressor;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author ITISHREE
 */
public class AppFrame extends JFrame implements ActionListener{
     JButton compressButton;
    JButton decompressButton;
   

    @SuppressWarnings("LeakingThisInConstructor")
    AppFrame(){
    
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
      
        compressButton = new JButton("To Compress");
        compressButton.setBounds(200 ,200,200,30);
        compressButton.setFont(new Font("Monotype Corsiva",Font.BOLD | Font.ITALIC,20));
        compressButton.addActionListener(this);
        compressButton.setBackground(Color.cyan);
        compressButton.setForeground(Color.black);
        
        decompressButton = new JButton("To Decompress");
        decompressButton.setBounds(400,200,200,30);
        decompressButton.setFont(new Font("Monotype Corsiva",Font.BOLD| Font.ITALIC,20));
        decompressButton.addActionListener(this);
        decompressButton.setBackground(Color.cyan);
        decompressButton.setForeground(Color.black);
        
        
        
        //this.setLocation(100,200);
        this.add(compressButton);
        this.add(decompressButton);
        this.setSize(800, 800);
        this.getContentPane().setBackground(Color.pink);
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==compressButton){
            JFileChooser filechooser = new JFileChooser();
            int response =filechooser.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    compressor.method(file);
                }
                catch(Exception ee){
                    JOptionPane.showMessageDialog(null, e.toString());
                }
            }
        }
        if(e.getSource()==decompressButton){
            JFileChooser filechooser = new JFileChooser();
            int response =filechooser.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    decompressor.method(file);
                }
                catch(Exception ee){
                    JOptionPane.showMessageDialog(null, e.toString());
                }
            }
        }
    }
}


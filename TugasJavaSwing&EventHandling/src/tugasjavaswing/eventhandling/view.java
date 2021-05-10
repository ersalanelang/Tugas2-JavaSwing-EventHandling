/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjavaswing.eventhandling;

import Bidang.Persegi;
import Ruang.Balok;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class view extends JFrame implements ActionListener{
    double panjang, lebar, tinggi;
    
    JTextField fpanjang = new JTextField(5);
    JTextField flebar = new JTextField(5);
    JTextField ftinggi = new JTextField(5);
    
    JLabel ljudul = new JLabel ("KALKULATOR BALOK");
    JLabel lpanjang = new JLabel ("Panjang");
    JLabel llebar = new JLabel ("Lebar");
    JLabel ltinggi = new JLabel ("Tinggi");
    JLabel lhasil = new JLabel ("Hasil");
    JLabel lluas = new JLabel (" ");
    JLabel lkeliling = new JLabel (" ");
    JLabel lvolume = new JLabel (" ");
    JLabel llpermukaan = new JLabel (" ");
    JButton tombolHitung = new JButton ("Hitung");
    JButton tombolReset = new JButton ("Reset");
    
    public view(){
        setDefaultCloseOperation(3);
        setTitle("123190163 & Ersalan ELang");
        setSize(380, 500);
        ljudul.setHorizontalAlignment(SwingConstants.CENTER);
        lhasil.setHorizontalAlignment(SwingConstants.CENTER);
        
        setLayout(null);
        add(ljudul);
        add(lpanjang);
        add(fpanjang);
        add(llebar);
        add(flebar);
        add(ltinggi);
        add(ftinggi);
        add(lhasil);
        add(tombolHitung);
        add(tombolReset);
        
        ljudul.setBounds(110,40,150,20);
        lpanjang.setBounds(30,100,120,20);
        fpanjang.setBounds(160,100,150,20);
        llebar.setBounds(30,140,120,20);
        flebar.setBounds(160,140,150,20);
        ltinggi.setBounds(30,180,120,20);
        ftinggi.setBounds(160,180,150,20);
        lhasil.setBounds(110,230,120,20);
        tombolHitung.setBounds(110,400,70,20);
        tombolReset.setBounds(190,400,70,20);
        
        tombolHitung.addActionListener(this);
        tombolReset.addActionListener(this);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == tombolHitung){
            try{
             panjang = Double.valueOf(fpanjang.getText());
             lebar = Double.valueOf(flebar.getText());
             tinggi = Double.valueOf(ftinggi.getText());
             
             Persegi p = new Persegi(panjang, lebar);
             Balok b = new Balok(panjang, lebar, tinggi);
             
             lluas = new JLabel("Luas " + p.luas());
             lkeliling = new JLabel("Keliling " + p.keliling());
             lvolume = new JLabel("Volume " + b.volume());
             llpermukaan = new JLabel("L. Permukaan " + b.luasPermukaan());
            
             add(lluas);
             add(lkeliling);
             add(lvolume);
             add(llpermukaan);
            
             lluas.setBounds(120,270,90,20);
             lkeliling.setBounds(120,290,90,20);
             lvolume.setBounds(120,310,90,20);
             llpermukaan.setBounds(120,330,120,20);
             
             setVisible(true);
             
            }catch(NumberFormatException error){
                 String message = "Error";
                JOptionPane.showMessageDialog(new JFrame(), message, "Message", JOptionPane.INFORMATION_MESSAGE);
            }  
        }
     

        if(e.getSource() == tombolReset){
            fpanjang.setText("");
            flebar.setText("");
            ftinggi.setText("");
            lluas.setText("");
            lkeliling.setText("");
            lvolume.setText("");
            llpermukaan.setText("");
        }        
    }  
}

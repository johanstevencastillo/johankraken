/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresasalones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author Johan Castillo
 */
public class VentanaSalones extends JFrame {
    
    public static ArrayList <DatosEmpresa> listaEmpresas = new ArrayList<DatosEmpresa>();
    int por,contador;
    String []combo = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","49","50"};
    
    JPanel panel,panel2;
    JLabel lbl_titulo,lbl_nombre,lbl_nit,lbl_telefono,lbl_representante,lbl_telere,lbl_cedula,lbl_sector,lbl_salon,lbl_titulo2,lbl_este,lbl_centro,lbl_oeste;
    JTextField ct_numero,ct_nombre,ct_nit,ct_telefono,ct_representante,ct_telere,ct_cedula;
    JComboBox com_salon,com_asistentes,com_ss;    
    JButton btn_agregarem,btn_s1,btn_s2,btn_s3,btn_s4,btn_s5,btn_s6,btn_s7,btn_s8,btn_s9,btn_listar;
    //JTextArea area;
    
    public VentanaSalones ()
    {
    	this.setTitle("EMPRESA DE EVENTOS STEVENJET");
    this.setBounds(200 , 10    , 800, 1000);
    this.setVisible(true);
    panel= new JPanel();
    panel.setBackground(Color.orange);
        this.add(panel);
        panel.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
        lbl_titulo = new  JLabel(" REGISTRO DE EMPRESAS ");
        lbl_titulo.setForeground(Color.blue);
        lbl_titulo.setFont(new java.awt.Font("Tahoma", 30, 20)); 
        lbl_titulo.setBounds(250, 0, 400, 20);
        panel.add(lbl_titulo);
        
        lbl_nombre = new JLabel("NOMBRE DE LA EMPRESA");
        lbl_nombre.setBounds(10, 30, 150, 20);
        panel.add(lbl_nombre);
        
        ct_nombre = new JTextField();
        panel.add(ct_nombre);
        ct_nombre.setBounds(10, 50, 200, 30);
        
        
        
        lbl_nit = new JLabel("NIT" );
        panel.add(lbl_nit);
        lbl_nit.setBounds(260, 30, 200, 20);
        
        
        ct_nit =  new JTextField();
        panel.add(ct_nit);
        ct_nit.setBounds(260, 50, 200, 30);
        
        lbl_telefono = new JLabel("TELEFONO EMPRESA");
        panel.add(lbl_telefono);
        lbl_telefono.setBounds(510, 30, 200, 20);
        
        ct_telefono = new JTextField();
        panel.add(ct_telefono);
        ct_telefono.setBounds(510, 50, 200, 30);
        
        lbl_representante = new JLabel("NOMBRE REPRESENTANTE");
        panel.add(lbl_representante);
        lbl_representante.setBounds(10, 90, 200, 20);
        
        ct_representante = new JTextField();
        panel.add(ct_representante);
        ct_representante.setBounds(10, 110, 200, 30);
        
        lbl_cedula = new JLabel("CEDULA REPRESENTANTE");
        panel.add(lbl_cedula);
        lbl_cedula.setBounds(260, 90, 200, 20);
        
        ct_cedula = new JTextField();
        panel.add(ct_cedula);
        ct_cedula.setBounds(260, 110, 200, 30);
        
        lbl_telere = new JLabel("TELEFONO REPRESENTANTE");
        panel.add(lbl_telere);
        lbl_telere.setBounds(510, 90, 200, 20);
        
        ct_telere = new JTextField();
        panel.add(ct_telere);
        ct_telere.setBounds(510, 110, 200, 30);
        
        lbl_sector = new JLabel("TOTAL AFORO ESPERADO");
        panel.add(lbl_sector);
        lbl_sector.setBounds(10, 150, 200, 20);
        
        /*ct_numero = new JTextField();
        panel.add(ct_numero);
        ct_numero.setBounds(10, 170, 200, 30);
        */
        
        lbl_salon = new JLabel("SELECCIONE EL SALON ");
        panel.add(lbl_salon);
        lbl_salon.setBounds(260, 150, 200, 20);
        
        com_salon = new JComboBox ();
        com_salon.addItem("SELECCIONE");
        com_salon.addItem("salon #1");
        com_salon.addItem("salon #2");
        com_salon.addItem("salon #3");com_salon.addItem("salon #4");com_salon.addItem("salon #5");com_salon.addItem("salon #6");com_salon.addItem("salon #7");
        com_salon.addItem("salon #8");com_salon.addItem("salon #9");
        panel.add(com_salon);
        com_salon.setBounds(260	, 170, 200, 30);
        
        com_asistentes = new JComboBox(combo);
        panel.add(com_asistentes);
        com_asistentes.setBounds(10, 170, 200, 30);
        
        btn_agregarem = new JButton("AGREGAR EMPRESA");
        panel.add(btn_agregarem);
        btn_agregarem.setBounds(510, 150, 200, 50);
        btn_agregarem.setBackground(Color.gray);
        
        lbl_titulo2 = new JLabel("ADMINISTRACION   DE   SALONES   UDEC");
        panel.add(lbl_titulo2);
        lbl_titulo2.setForeground(Color.blue);
        lbl_titulo2.setFont(new java.awt.Font("Tahoma", 30, 20)); 
        lbl_titulo2.setBounds(200, 250, 400, 20);
        
        lbl_este = new JLabel("ESTE");
        panel.add(lbl_este);
        lbl_este.setFont(new java.awt.Font("Algerian",0,20));
        lbl_este.setBounds(60, 310, 200, 20);
        
        lbl_centro = new JLabel("CENTRO");
        panel.add(lbl_centro);
        lbl_centro.setFont(new java.awt.Font("Algerian",0,20));
        lbl_centro.setBounds(360, 310, 200, 20);
        
        lbl_oeste = new JLabel("OESTE");
        panel.add(lbl_oeste);
        lbl_oeste.setFont(new java.awt.Font("Algerian",0,20));
        lbl_oeste.setBounds(630, 310, 200, 20);
        
        btn_s1 = new JButton("SALON #1 ");
        panel.add(btn_s1);
        btn_s1.setBackground(Color.green);
        btn_s1.setBounds(30, 360, 150,100 );
        
        btn_s2 = new JButton("SALON #2 ");
        panel.add(btn_s2);
        btn_s2.setBackground(Color.green);
        btn_s2.setBounds(30, 520, 150,100 );
        
        btn_s3 = new JButton("SALON #3 ");
        panel.add(btn_s3);
        btn_s3.setBackground(Color.green);
        btn_s3.setBounds(30, 700, 150,100 );
        
        btn_s4 = new JButton("SALON #4 ");
        panel.add(btn_s4);
        btn_s4.setBackground(Color.green);
        btn_s4.setBounds(320, 360, 150,100 );
        
        btn_s5 = new JButton("SALON #5 ");
        panel.add(btn_s5);
        btn_s5.setBackground(Color.green);
        btn_s5.setBounds(320, 520, 150,100 );
        
        btn_s6 = new JButton("SALON #6 ");
        panel.add(btn_s6);
        btn_s6.setBackground(Color.green);
        btn_s6.setBounds(320, 700, 150,100 );
        
        btn_s7 = new JButton("SALON #7 ");
        panel.add(btn_s7);
        btn_s7.setBackground(Color.green);
        btn_s7.setBounds(600, 360, 150,100 );

        btn_s8 = new JButton("SALON #8 ");
        panel.add(btn_s8);
        btn_s8.setBackground(Color.green);
        btn_s8.setBounds(600, 520, 150,100 );
        
        btn_s9 = new JButton("SALON #9 ");
        panel.add(btn_s9);
        btn_s9.setBackground(Color.green);
        btn_s9.setBounds(600, 700, 150,100 );
        
        btn_listar = new JButton("LISTAR");
        panel.add(btn_listar);
        btn_listar.setBounds(50, 850, 100, 50);
       /* 
        area = new JTextArea();
        panel.add(area);
        area.setBackground(Color.red);
        area.setBounds(800, 100, 650, 700);
  */
        
        btn_agregarem.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
            
            String nombreEmpresa = ct_nombre.getText();
            String  nit =  ct_nit.getText();
            String  telempresa = ct_telefono.getText();
            String nombrerepre = ct_representante.getText();
            String cedula = ct_cedula.getText();
            String telefonorepre = ct_telere.getText();
            String sector = (String)com_asistentes.getSelectedItem();
            String salon = (String) com_salon.getSelectedItem();
             //int m = Integer.parseInt(sector);
             
             //hace un parseo de string  a int
            por=Integer.parseInt(sector)*100/50;
           
            String porcentaje =por+"";
            
            //System.out.println("mmm   "+por);
            switch(salon){
                case "salon #1":{
                    btn_s1.setBackground(Color.red);
                    break;
                }
                case "salon #2":{
                    btn_s2.setBackground(Color.red);
                    break;
                }
                case "salon #3":{
                    btn_s3.setBackground(Color.red);
                    break;
                }
                case "salon #4":{
                    btn_s4.setBackground(Color.red);
                    break;
                }
                case "salon #5":{
                    btn_s5.setBackground(Color.red);
                    break;
                }
                case "salon #6":{
                    btn_s6.setBackground(Color.red);
                    break;
                }
                case "salon #7":{
                    btn_s7.setBackground(Color.red);
                    break;
                }
                case "salon #8":{
                    btn_s8.setBackground(Color.red);
                    break;
                }
                case "salon #9":{
                    btn_s9.setBackground(Color.red);
                    break;
                }
                
                            
                            
                    
            }
            //System.out.println("el salon     "+salon);
            DatosEmpresa datos = new DatosEmpresa(nombreEmpresa, nit, telempresa, nombrerepre, cedula, telempresa, sector, salon,porcentaje);
            listaEmpresas.add(datos);
            ct_nombre.setText("");ct_nit.setText("");ct_telefono.setText("");ct_representante.setText("");ct_cedula.setText("");ct_telere.setText("");
       
	} 
	});
        
        
        btn_listar.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
            Listar listar = new Listar();
            

Iterator<DatosEmpresa> it = listaEmpresas.listIterator();
                DatosEmpresa tem = new DatosEmpresa();
                tem=null;
		listar.area.append("\n  NOMBRE DE LA EMPRESA\n");
                listar.area.append("----------------------------------------------------\n");
                listar.area2.append("\n       TOTAL DE ASISTENTES\n");
                listar.area2.append("----------------------------------------------------\n");
                listar.area3.append("\n    SALON OCUPADO\n");
                listar.area3.append("-----------------------------------------------------\n");
                listar.area4.append("\n  PORCENTAJE DE ASISTENTES\n");
                listar.area4.append("----------------------------------------------------\n");
		while(it.hasNext()) {
			tem= it.next();
                        
                        listar.area.append(tem.getNombreEmpresa());
                        listar.area.append("\n");
                        listar.area2.append(tem.getSector());
                        listar.area2.append("\n");
                        listar.area3.append(tem.getSalon());
                        listar.area3.append("\n");
                        listar.area4.append(tem.getPocentaje());
                        listar.area4.append(" % porciento");
                        listar.area4.append("\n");
                        
                        
                        
                        
			
			
		
                                }
       
	} 
	});

}	
    
}

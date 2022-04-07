//import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

//import javax.swing.JLabel;
import javax.swing.*;





public class swingd2 extends JFrame  implements ActionListener {
    JFrame window ;

    //BOTONES 

    JButton boton1;
    JButton boton2;
    JButton boton3;
    JButton boton4;

    JPanel  paneloficial;
    int verificar =0;


    public swingd2(){
        window = new JFrame("TAREA DE JOSEPH SANTAMARIA");


        //window.setPreferredSize(new Dimension(150 , 150));
        window.setSize(500 , 500);
        

       

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        Componentes();
        //window.pack();
        
        window.setVisible(true);
    
        paneloficial.setLayout(null);



    }

    private void Componentes(){
        ImageIcon logodeltec = new ImageIcon ("unnamed.JPG");

        

        boton1 = new JButton("PRIMERO");
        boton1.setBounds(40, 200, 100, 40);

        boton1.addActionListener(this);

        



        boton2 = new JButton("SEGUNDO");

        boton2.setBounds(200, 200, 100, 40);
        boton2.addActionListener(this);



        boton3 = new JButton("TERCERO");
        boton3.setBounds(350, 200, 100, 40);
        boton3.addActionListener(this);

        

        //-------------------------------------


        boton4 = new JButton("TOCA ACA PARA CONOCER EL PATRON");
        boton4.addActionListener(this);

        boton4.setBounds(150, 440, 300, 20);

        

         paneloficial = new JPanel();
         paneloficial.setLayout(null);
        // paneloficial.setLayout(new GridLayout(1, 1));
        JLabel etiqueta = new JLabel(" ESTOS BOTONES TIENEN UN PATRÓN ");
        etiqueta.setForeground(Color.white);
        //COLOCAMOS LA ETIQUETA CON ESTAS PROPIEDADES
        //AÑADIMOS TODO APARTIR DE ESTA LINEA YA QUE EL SETLAYOUT TIENE A NULL

        etiqueta.setBounds(125, 100, 500, 30);
         paneloficial.add(etiqueta);

        //BACKGROUND
         paneloficial. setBackground(Color.BLACK);

  

        
        JLabel etiqueta2 = new JLabel ();
        etiqueta2.setBounds (20, 250, 200, 300);
        etiqueta2.setIcon (new ImageIcon (logodeltec.getImage ().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
         paneloficial.add (etiqueta2);


         //SE AÑADEN LOS BOTONES
                 

         paneloficial.add(boton1);
         paneloficial.add(boton2);
         paneloficial.add(boton3);
         paneloficial.add(boton4);

        window.add( paneloficial , BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource().equals(boton1)){
                
                if(verificar != 1){
                    throw new Exception();
                }
                verificar +=1;
            }
            else if (e.getSource().equals(boton2)){

                if(verificar != 0){
                    throw new Exception();
                }
                verificar +=1;
                

            }
            else if(e.getSource().equals(boton3)){


                //verificar +=1;
                if(verificar != 2){
                    throw new Exception();
                }
                else{
                    JOptionPane.showMessageDialog(window , "PATRON CORRECTO");
                    verificar =0;
                }
            }
            else if (e.getSource().equals(boton4)){
                JOptionPane.showMessageDialog(window , " 2 -  1  -  3");
            }
        }
        catch(Exception a){
            JOptionPane.showMessageDialog(window , "BOTON INCORRECTO");
            verificar =0;
        }
    }
    
}

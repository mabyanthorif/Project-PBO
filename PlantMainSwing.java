package kebunku;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author User
 */
public class PlantMainSwing {
    private int jenis;
    private String namaJenis;
    private JFrame frame;
    private JLabel label;
    private JLabel jumlahAir;
    private JLabel jumlahPupuk;
    private JButton Dahlia;
    private JButton Lily;
    private JButton Krisan;
    private JButton back;
    private JButton btnBeriAir;
    private JButton btnBeriPupuk;
    private JTextField txtJenis;
    private JTextField txtDisplay;
    private ImageIcon plantIcon;
    private final Plant p;
public PlantMainSwing()
{
    p = new Plant();
    createAndShowGUI();
    setPlantImage();
}
private void createAndShowGUI()
{
    frame = new JFrame("KEBUNKU ");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);

    
    txtJenis = new JTextField("");
        txtJenis.setBounds(20,70,150,30); //mengatur posisi
        txtJenis.setOpaque(true);
        txtJenis.setEditable(false);
        txtJenis.setBackground(Color.GREEN); //mengatur warna background
        txtJenis.setHorizontalAlignment(SwingConstants.CENTER); //agar text ditengah
        frame.getContentPane().add(txtJenis);
    //menambahkan button krisan
    Krisan = new JButton("Krisan");
    Krisan.setBounds(20,10,100,30); //mengatur posisi button
    frame.getContentPane().add(Krisan); //menambahkan content ke frame
    
    //menambahkan button dahlia
        Dahlia = new JButton("Dahlia");
        Dahlia.setBounds(210,10,100,30); //mengatur posisi button dahlia
        frame.getContentPane().add(Dahlia); //menambahkan content ke frame
        
        //menambhkan button lily
        Lily = new JButton("Lily");
        Lily.setBounds(370,10,100,30); //mengatur posisi button lily
        frame.getContentPane().add(Lily);
//Add label
    label = new JLabel("");
    label.setBounds(184, 50, 150, 150);
    frame.getContentPane().add(label);
    //Add button
    btnBeriAir = new JButton("Beri Air");
    btnBeriPupuk = new JButton("Beri Pupuk");
    btnBeriAir.setBounds(20, 200, 150, 30);
    btnBeriPupuk.setBounds(20, 230, 150, 30);
    frame.getContentPane().add(btnBeriAir);
    frame.getContentPane().add(btnBeriPupuk);
    
    //memasukkan text jumlah air
        jumlahAir = new JLabel("<html><span style='font-size:10px'>Jumlah Air : "+p.getJumlahAir()+"</span></html>");
        jumlahAir.setBounds(20,100,150,30); //mengatur posisi
        jumlahAir.setOpaque(true);
        jumlahAir.setBackground(Color.RED); //mengatur warna background
        frame.getContentPane().add(jumlahAir); //menambahkan content ke frame
        
        //memasukkan text jumlah pupuk
        jumlahPupuk = new JLabel("<html><span style='font-size:10px'>Jumlah Pupuk : "+p.getJumlahPupuk()+"</span></html>");
        jumlahPupuk.setBounds(20,120,150,30); //mengatur posisi
        jumlahPupuk.setOpaque(true);
        jumlahPupuk.setBackground(Color.RED); //mengatur warna background
        frame.getContentPane().add(jumlahPupuk); //menambahkan content ke frame
        //memasukkan button untuk mereset
        back = new JButton("Ambil");
        frame.getContentPane().add(back); //menambhkan content ke frame
        back.setBounds(350, 210, 100, 30); //mengatur posisi
        back.setVisible(true);
        //Add text
        txtDisplay = new JTextField("HASIL");
        txtDisplay.setBounds(190,210,139,30);
        txtDisplay.setEditable(false);
        txtDisplay.setOpaque(true);
        txtDisplay.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(txtDisplay);
     //Add action listener
        btnBeriAir.addActionListener(this::btnBeriAir_actionPerformed);
        Krisan.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent e)
        {
            Krisan_actionPerformed(e);
        }

            private void Krisan_actionPerformed(ActionEvent e) {
                txtJenis.setText("Krisan");
                
                //munculkan menu selanjutnya
                setPlantImage();
            }
    });
        //menambahkan action listener untuk Dahlia
        Dahlia.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Dahlia_actionPerformed(e);
        }

            private void Dahlia_actionPerformed(ActionEvent e) {
                txtJenis.setText("Dahlia");
                
                //munculkan menu selanjutnya
                setPlantImage();
            }
    });
        //menambahkan action listener untuk lily
        Lily.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Lily_actionPerformed(e);
        }
            
            private void Lily_actionPerformed(ActionEvent e) {
                txtJenis.setText("Liily");
                
                //munculkan menu selanjutnya
                setPlantImage();
            }
    });
        //memasukkan add action listener tombol kembali ke menu utama
        back.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e)
        {
        back_actionPerformed(e);
        }
        private void back_actionPerformed(ActionEvent e)
        {
            //reset status tumbuh, air, dan pupuk
            txtDisplay.setText("HASIL");
            txtJenis.setText("");
            jumlahAir.setText("Jumlah Air : 0");
            jumlahPupuk.setText("Jumlah Pupuk : 0");
            
        }
    });
    btnBeriPupuk.addActionListener(this::btnBeriPupuk_actionPerformed);
    //Display the window
    frame.setSize(500,300);
    frame.setVisible(true);
    }
    private void btnBeriAir_actionPerformed(ActionEvent e){
    System.out.println("beri air");
     p.beriAir();
    txtDisplay.setText(p.getStatusTumbuhText());
    jumlahAir.setText("Jumlah Air :"+p.getJumlahAir());
    
    setPlantImage();
    
    }
    private void btnBeriPupuk_actionPerformed(ActionEvent e){
    System.out.println("beri pupuk");
    p.beriPupuk();
    txtDisplay.setText(p.getStatusTumbuhText());
    jumlahPupuk.setText("Jumlah Pupuk :"+p.getJumlahPupuk());
    
    setPlantImage();
    
    }
    protected ImageIcon createImageIcon(String path, String
    description) {
    java.net.URL imgURL = getClass().getResource(path);
    if (imgURL != null) {
    return new ImageIcon(imgURL, description);
    } else {
    System.err.println("Couldn't find file: " + path);
    return null;
    }
    }
    private void setPlantImage()
    {
    plantIcon = createImageIcon(p.getImagePath(),
    p.getStatusTumbuhText());
    label.setIcon(plantIcon);
    }
    public static void main(String[] args)
    {
    javax.swing.SwingUtilities.invokeLater(() -> {
        PlantMainSwing uGardenApp = new
            PlantMainSwing();
    });
    }
}
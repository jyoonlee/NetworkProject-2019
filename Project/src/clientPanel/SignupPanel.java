package clientPanel;
 
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

 
public class SignupPanel extends JPanel{ //회원가입 패널
    public JTextField tfname;
    public JPasswordField tfpw;
    public JPasswordField tfrpw;
    public JTextField tfId;
    public JTextArea textArea;
    public JRadioButton rbAgree;
    public JRadioButton rbdisAgree;
    public JButton btCreate;
    public JButton btCancel;
    private Graphics screenGraphic;
    private Image panelImage;
    private Image selectedImage ;
  //  private Image backgroundImage = new ImageIcon(getClass().getResource("imge/123.gif")).getImage();
 
    public SignupPanel() {
        setSize(450, 700);
        setLayout(null);
        
        // ID 입력 ==================================================================
        JLabel lblNewLabel = new JLabel("회 원 가 입");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("함초롬바탕", Font.BOLD, 30));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(109, 63, 226, 58);
        add(lblNewLabel);
        tfId = new JTextField();
        tfId.setBounds(219, 163, 116, 24);
        add(tfId);
        tfId.setColumns(10);
        // =============================================================================
        
        // Usert name 입력 필드
        tfname = new JTextField();
        tfname.setBounds(219, 197, 116, 24);
        add(tfname);
        tfname.setColumns(10);
        // =============================================================================
        
        // 비밀번호입력창 2개 =========================================================== 
        tfpw = new JPasswordField();
        tfpw.setBounds(219, 231, 116, 24);
        add(tfpw);
        
        tfrpw = new JPasswordField();
        tfrpw.setBounds(219, 265, 116, 24);
        add(tfrpw);
        // =============================================================================
        
        // 회원가입 완료 버튼=============================================================
        btCreate = new JButton("가입");
        btCreate.setBounds(87, 600, 105, 27);
        add(btCreate);
        // =============================================================================
        
        // 회원가입 취소 버튼=============================================================
        btCancel = new JButton("취소");
        btCancel.setBounds(249, 600, 105, 27);
        add(btCancel);
        // =============================================================================
        
        // 회원약관 =====================================================================
       JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(48, 365, 342, 115);
        add(scrollPane);
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setEditable(false);
        scrollPane.setViewportView(textArea);
        textArea.setText("서비스 이용약관\n\n 본 프로그램은 가천대학교 소프트웨어학과\n 이재윤, 신동재, 이정명의 제작으로 만들어졌으며\n 비밀번호와 아이디는 해당 프로그램 내 기록이 됩니다.\n");
        // =============================================================================
        
        // 회원약관 동의 or 비동의 버튼 ==================================================
        ButtonGroup bg = new ButtonGroup();
        rbAgree = new JRadioButton("동의");
        rbAgree.setOpaque(false);
        rbAgree.setForeground(Color.BLACK);
        rbAgree.setBounds(138, 544, 71, 27);
        add(rbAgree);
        
        rbdisAgree = new JRadioButton("비동의");
        rbdisAgree.setOpaque(false);
        rbdisAgree.setForeground(Color.BLACK);
        rbdisAgree.setBounds(230, 544, 139, 27);
        add(rbdisAgree);
        
        bg.add(rbAgree);
        bg.add(rbdisAgree);
        // =============================================================================    
        
        // 기타 라벨 ====================================================================
        JLabel rrag = new JLabel("아이디 : ");
        rrag.setForeground(Color.BLACK);
        rrag.setHorizontalAlignment(SwingConstants.RIGHT);
        rrag.setFont(new Font("함초롬바탕", Font.BOLD, 15));
        rrag.setBounds(126, 165, 62, 18);
        add(rrag);
        
        JLabel label = new JLabel("이름 : ");
        label.setForeground(Color.BLACK);
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        label.setFont(new Font("함초롬바탕", Font.BOLD, 15));
        label.setBounds(126, 199, 62, 18);
        add(label);
        
        JLabel label_1 = new JLabel("비밀번호 : ");
        label_1.setForeground(Color.BLACK);
        label_1.setHorizontalAlignment(SwingConstants.RIGHT);
        label_1.setFont(new Font("함초롬바탕", Font.BOLD, 15));
        label_1.setBounds(83, 233, 105, 18);
        add(label_1);
        
        JLabel label_2 = new JLabel("비밀번호 확인 : ");
        label_2.setForeground(Color.BLACK);
        label_2.setHorizontalAlignment(SwingConstants.RIGHT);
        label_2.setFont(new Font("함초롬바탕", Font.BOLD, 15));
        label_2.setBounds(48, 267, 139, 18);
        add(label_2);
        
        JLabel label_3 = new JLabel("[ 회원약관 ]");
        label_3.setForeground(Color.BLACK);
        label_3.setHorizontalAlignment(SwingConstants.CENTER);
        label_3.setFont(new Font("함초롬바탕", Font.BOLD , 17));
        label_3.setBounds(129, 311, 171, 44);
        add(label_3);
        
        JLabel lblNewLabel_1 = new JLabel("약관을 읽고 동의 버튼을 눌러주세요");
        lblNewLabel_1.setForeground(Color.RED);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("함초롬바탕", Font.BOLD , 14));
        lblNewLabel_1.setBounds(48, 506, 342, 15);
        add(lblNewLabel_1);
        // =============================================================================
    }
    
    // 배경화면을 위한 페인트 =======================================================
   /* public void paint(Graphics g) {
          panelImage = createImage(this.getWidth(), this.getHeight());
          screenGraphic= panelImage.getGraphics();
          screenDraw(screenGraphic);
          g.drawImage(panelImage, 0, 0, null);
    }
    public void screenDraw(Graphics g) {
           g.drawImage(backgroundImage, 0, 0, null);
           paintComponents(g);
           this.repaint();
    // =============================================================================
    }*/
}

import javax.swing.*;
import java.awt.*;
import javax.swing.JComboBox;
public class fw02_01_002 extends JPanel {

    // JTextField
    static JTextField tLogInLogIn;
    static JTextField tLogInPassw;

    static JTextField tEmpRgLogIn;
    static JTextField tEmpRgPssw1;
    static JTextField tEmpRgPssw2;

    static JTextField tDevRgDevNm;
    static JTextField tDevRgDescr;
    static JTextField tDevRgSrNum;

    static JTextField tSpPrtSPtNm;
    static JTextField tSpPrtDescr;
    static JTextField tSpPrtSrNum;

    // JButton
    static JButton bLogInSubmit;

    static JButton bEmpRgSubmit;

    static JButton bDevRgSubmit;

    static JButton bSpPrtSubmit;

    static JButton bEvRegSubmit;
    // JComboBox
    static JComboBox xSpPrtPtType;

    static JComboBox xEvnRgDevSNm;
    /* */

    static JComboBox xExDevNumLst;
    static JComboBox xspPrtItmLst;
    static JComboBox xspPartSrNum;
    static JComboBox xExEventList;

    /* */
    public fw02_01_002() {
        initializeUI();
    }

    public static void showFrame() {
        JPanel panel = new fw02_01_002();
        panel.setOpaque(true);

        JFrame frame = new JFrame("fw02_01_002");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(fw02_01_002::showFrame);
    }

    private void initializeUI() {
        JTabbedPane tabbedPane = new JTabbedPane();
        /* V Log In */
        JPanel logInPanel = new JPanel();

        tLogInLogIn = new JTextField(20);
        tLogInPassw = new JTextField(20);

        logInPanel.add(new JLabel("Log In"));
        logInPanel.add(tLogInLogIn);
        logInPanel.add(new JLabel("Password"));
        logInPanel.add(tLogInPassw);

        bLogInSubmit = new JButton("Submit");
        logInPanel.add(bLogInSubmit);

        // Add Log In Tab
        tabbedPane.addTab("Log In", logInPanel);
        /* A Log In */
        /* V Employ Register */
        JPanel employRegisterPanel = new JPanel();

        tEmpRgLogIn = new JTextField(20);
        tEmpRgPssw1 = new JTextField(20);
        tEmpRgPssw2 = new JTextField(20);

        employRegisterPanel.add(new JLabel("Sign Up"));
        employRegisterPanel.add(tEmpRgLogIn);
        employRegisterPanel.add(new JLabel("Password"));
        employRegisterPanel.add(tEmpRgPssw1);
        employRegisterPanel.add(new JLabel("re Password"));
        employRegisterPanel.add(tEmpRgPssw2);

        bEmpRgSubmit = new JButton("Submit");
        employRegisterPanel.add(bEmpRgSubmit);

        // Add Employ Register Tab
        tabbedPane.addTab("Employ Register", employRegisterPanel);
        /* A Employ Register */
        /* V Device Register */
        JPanel deviceRegisterPanel = new JPanel();

        tDevRgDevNm = new JTextField(20);
        tDevRgDescr = new JTextField(20);
        tDevRgSrNum = new JTextField(20);

        deviceRegisterPanel.add(new JLabel("Device Name"));
        deviceRegisterPanel.add(tDevRgDevNm);
        deviceRegisterPanel.add(new JLabel("Device description"));
        deviceRegisterPanel.add(tDevRgDescr);
        deviceRegisterPanel.add(new JLabel("S/N"));
        deviceRegisterPanel.add(tDevRgSrNum);

        bDevRgSubmit = new JButton("Submit");
        deviceRegisterPanel.add(bDevRgSubmit);

        // Add Device Register Tab
        tabbedPane.addTab("Device Register", deviceRegisterPanel);
        /* A Device Register*/
        /* V Spare Part*/
        JPanel sparePartPanel = new JPanel();

        tSpPrtSPtNm = new JTextField(20);
        tSpPrtDescr = new JTextField(20);
        tSpPrtSrNum = new JTextField(20);

        sparePartPanel.add(new JLabel("Spare Part name"));
        sparePartPanel.add(tSpPrtSPtNm);
        sparePartPanel.add(new JLabel("Device description"));
        sparePartPanel.add(tSpPrtDescr);
        sparePartPanel.add(new JLabel("S/N"));
        sparePartPanel.add(tSpPrtSrNum);

        sparePartPanel.add(new JLabel("Part Type"));
        String sparePartItLst[]={"Display","CD-rom","Keyboard","Power Supply","Motherboard"};
        xSpPrtPtType = new JComboBox(sparePartItLst);
        sparePartPanel.add(xSpPrtPtType);

        bSpPrtSubmit = new JButton("Submit");
        sparePartPanel.add(bSpPrtSubmit);

        // Add Account Tab
        tabbedPane.addTab("Spare Part", sparePartPanel);
        /* A Spare Part*/
        /* V Event Register */
        JPanel eventRegisterPanel = new JPanel();
        eventRegisterPanel.add(new JLabel("Event Register"));

        String genExDevItmLst[]={"Apple","HP","Lenovo","Accer","Toshiba", "Dell"};
        String genExDevNumLst[]={"1001","1002","1003","1004","1005", "1006"};
        /* */

        String sparePrtItmLst[]={"CD-rom","Motherboard","Mouse","Display","Keyboard"};

        /* */
        String sparePartSrNum[]={"2001","2002","2003","2004","2005"};
        String genExEventLst[]={"Ordered","Purchased","Mounted","Dismounted"};
        /* */
        eventRegisterPanel.add(new JLabel("Device Name"));
        xEvnRgDevSNm = new JComboBox(genExDevItmLst);
        eventRegisterPanel.add(xEvnRgDevSNm);

        eventRegisterPanel.add(new JLabel("Device S/N"));
        xExDevNumLst = new JComboBox(genExDevNumLst);
        eventRegisterPanel.add(xExDevNumLst);
        /* */
        eventRegisterPanel.add(new JLabel("Spare Part Name"));
        xspPrtItmLst = new JComboBox(sparePrtItmLst);
        eventRegisterPanel.add(xspPrtItmLst);
        /* */
        eventRegisterPanel.add(new JLabel("Spare Part S/N"));
        xspPartSrNum = new JComboBox(sparePartSrNum);
        eventRegisterPanel.add(xspPartSrNum);

        eventRegisterPanel.add(new JLabel("Device S/N"));
        xExEventList = new JComboBox(genExEventLst);
        eventRegisterPanel.add(xExEventList);

        bEvRegSubmit = new JButton("Submit");
        eventRegisterPanel.add(bEvRegSubmit);
        // Add Event Register Tab
        tabbedPane.addTab("Event Register", eventRegisterPanel);
        /* A Event Register*/
        /* V Common Table*/
        JPanel commonTablePanel = new JPanel();
        commonTablePanel.add(new JLabel("Common Table"));

        // Add Account Tab
        tabbedPane.addTab("Common Table", commonTablePanel);
        /* A Common Table*/
/* V
        JPanel jkPanel = new JPanel();
        jkPanel.add(new JLabel("jk"));

        // Add Account Tab
        tabbedPane.addTab("jk", jkPanel);
/* A */
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(500, 200));
        this.add(tabbedPane, BorderLayout.CENTER);
    }
}

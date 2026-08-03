package Yue;

import Yue.C8403;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4721 {

    /* JADX INFO: renamed from: ۥ */
    public static String f1074;

    /* JADX INFO: renamed from: ۥ */
    public static final String m1632(int i) {
        return C4606.m1561(i);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m1633(String[] strArr) throws Exception {
        try {
            f1074 = strArr[0];
        } catch (ArrayIndexOutOfBoundsException unused) {
            m14121();
            System.exit(0);
        }
        System.setProperty("javax.xml.stream.XMLInputFactory", "com.bea.xml.stream.MXParserFactory");
        AbstractC8553 abstractC8553M28451 = AbstractC8553.m28451();
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FACTORY: ");
        stringBuffer.append(abstractC8553M28451);
        printStream.println(stringBuffer.toString());
        abstractC8553M28451.mo18453(AbstractC8553.f25386, Boolean.FALSE);
        InterfaceC8561 interfaceC8561Mo18443 = abstractC8553M28451.mo18443(new FileReader(f1074));
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("READER:  ");
        stringBuffer2.append(interfaceC8561Mo18443);
        stringBuffer2.append("\n");
        printStream.println(stringBuffer2.toString());
        while (interfaceC8561Mo18443.hasNext()) {
            m14115(interfaceC8561Mo18443);
            interfaceC8561Mo18443.next();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m14113(InterfaceC3453 interfaceC3453) {
        m14118(interfaceC3453.getName().m21588(), interfaceC3453.getName().m3295(), interfaceC3453.getName().m3294());
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("='");
        stringBuffer.append(interfaceC3453.getValue());
        stringBuffer.append("'");
        printStream.print(stringBuffer.toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m14114(InterfaceC8561 interfaceC8561) {
        if (interfaceC8561.mo18351() > 0) {
            Iterator itM28409 = C8545.m28409(interfaceC8561);
            while (itM28409.hasNext()) {
                System.out.print(" ");
                m14113((InterfaceC3453) itM28409.next());
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m14115(InterfaceC8561 interfaceC8561) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("EVENT:[");
        stringBuffer.append(interfaceC8561.mo18330().mo9160());
        stringBuffer.append("][");
        stringBuffer.append(interfaceC8561.mo18330().mo9152());
        stringBuffer.append("] ");
        printStream.print(stringBuffer.toString());
        printStream.print(m1632(interfaceC8561.mo18329()));
        printStream.print(" [");
        int iMo18329 = interfaceC8561.mo18329();
        if (iMo18329 == 9) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(interfaceC8561.mo18348());
            stringBuffer2.append("=");
            printStream.print(stringBuffer2.toString());
            if (interfaceC8561.mo18341()) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[");
                stringBuffer3.append(interfaceC8561.getText());
                stringBuffer3.append("]");
                printStream.print(stringBuffer3.toString());
            }
        } else if (iMo18329 != 12) {
            switch (iMo18329) {
                case 1:
                    printStream.print("<");
                    m14117(interfaceC8561);
                    m14120(C8545.m28410(interfaceC8561));
                    m14114(interfaceC8561);
                    printStream.print(">");
                    break;
                case 2:
                    printStream.print("</");
                    m14117(interfaceC8561);
                    m14120(C8545.m28410(interfaceC8561));
                    printStream.print(">");
                    break;
                case 3:
                    printStream.print("<?");
                    if (interfaceC8561.mo18341()) {
                        printStream.print(interfaceC8561.getText());
                    }
                    printStream.print("?>");
                    break;
                case 4:
                case 6:
                    printStream.print(new String(interfaceC8561.mo18332(), interfaceC8561.mo18349(), interfaceC8561.mo18336()));
                    break;
                case 5:
                    printStream.print("<!--");
                    if (interfaceC8561.mo18341()) {
                        printStream.print(interfaceC8561.getText());
                    }
                    printStream.print("-->");
                    break;
                case 7:
                    printStream.print("<?xml");
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append(" version='");
                    stringBuffer4.append(interfaceC8561.getVersion());
                    stringBuffer4.append("'");
                    printStream.print(stringBuffer4.toString());
                    StringBuffer stringBuffer5 = new StringBuffer();
                    stringBuffer5.append(" encoding='");
                    stringBuffer5.append(interfaceC8561.mo18323());
                    stringBuffer5.append("'");
                    printStream.print(stringBuffer5.toString());
                    if (interfaceC8561.mo18327()) {
                        printStream.print(" standalone='yes'");
                    } else {
                        printStream.print(" standalone='no'");
                    }
                    printStream.print("?>");
                    break;
            }
        } else {
            printStream.print("<![CDATA[");
            if (interfaceC8561.mo18341()) {
                printStream.print(interfaceC8561.getText());
            }
            printStream.print("]]>");
        }
        printStream.println("]");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m14116(int i) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("EVENT TYPE(");
        stringBuffer.append(i);
        stringBuffer.append("):");
        printStream.print(stringBuffer.toString());
        printStream.println(m1632(i));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m14117(InterfaceC8561 interfaceC8561) {
        if (interfaceC8561.mo18334()) {
            m14118(interfaceC8561.getPrefix(), interfaceC8561.mo18325(), interfaceC8561.mo18348());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m14118(String str, String str2, String str3) {
        if (str2 != null && !"".equals(str2)) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("['");
            stringBuffer.append(str2);
            stringBuffer.append("']:");
            printStream.print(stringBuffer.toString());
        }
        if (str != null) {
            PrintStream printStream2 = System.out;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(str);
            stringBuffer2.append(":");
            printStream2.print(stringBuffer2.toString());
        }
        if (str3 != null) {
            System.out.print(str3);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m14119(InterfaceC6347 interfaceC6347) {
        if (interfaceC6347.mo19842()) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("xmlns='");
            stringBuffer.append(interfaceC6347.mo9147());
            stringBuffer.append("'");
            printStream.print(stringBuffer.toString());
            return;
        }
        PrintStream printStream2 = System.out;
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(C8403.C1519.f25098);
        stringBuffer2.append(interfaceC6347.getPrefix());
        stringBuffer2.append("='");
        stringBuffer2.append(interfaceC6347.mo9147());
        stringBuffer2.append("'");
        printStream2.print(stringBuffer2.toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m14120(Iterator it) {
        while (it.hasNext()) {
            System.out.print(" ");
            m14119((InterfaceC6347) it.next());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m14121() {
        System.out.println("usage: java com.bea.xml.stream.samples.EventParse <xmlfile>");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m14122(InterfaceC8561 interfaceC8561) {
        if (!interfaceC8561.mo18341()) {
            System.out.println("HAS NO VALUE");
            return;
        }
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("HAS VALUE: ");
        stringBuffer.append(interfaceC8561.getText());
        printStream.println(stringBuffer.toString());
    }
}

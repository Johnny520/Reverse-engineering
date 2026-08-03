package Yue;

import java.io.FileReader;
import java.io.PrintStream;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۣۡۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6612 {

    /* JADX INFO: renamed from: ۥ */
    public static String f2173;

    /* JADX INFO: renamed from: ۥ */
    public static final String m3078(int i) {
        return C4606.m1561(i);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m3079(String[] strArr) throws Exception {
        try {
            f2173 = strArr[0];
        } catch (ArrayIndexOutOfBoundsException unused) {
            m20984();
            System.exit(0);
        }
        System.setProperty("javax.xml.stream.XMLInputFactory", "com.bea.xml.stream.MXParserFactory");
        AbstractC8553 abstractC8553M28451 = AbstractC8553.m28451();
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FACTORY: ");
        stringBuffer.append(abstractC8553M28451);
        printStream.println(stringBuffer.toString());
        InterfaceC8561 interfaceC8561Mo18443 = abstractC8553M28451.mo18443(new FileReader(f2173));
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("READER:  ");
        stringBuffer2.append(interfaceC8561Mo18443);
        stringBuffer2.append("\n");
        printStream.println(stringBuffer2.toString());
        int iMo18329 = interfaceC8561Mo18443.mo18329();
        printStream.println("PARSER STATE BEFORE FIRST next(): ");
        m20980(iMo18329);
        m20981(interfaceC8561Mo18443);
        m20985(interfaceC8561Mo18443);
        printStream.println("-----------------------------");
        while (interfaceC8561Mo18443.hasNext()) {
            m20980(interfaceC8561Mo18443.next());
            m20981(interfaceC8561Mo18443);
            m20985(interfaceC8561Mo18443);
            if (interfaceC8561Mo18443.mo18328()) {
                m20979(interfaceC8561Mo18443);
                m20983(interfaceC8561Mo18443);
            }
            System.out.println("-----------------------------");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m20978(InterfaceC3453 interfaceC3453) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PREFIX: ");
        stringBuffer.append(interfaceC3453.getName().m21588());
        printStream.println(stringBuffer.toString());
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("NAMESP: ");
        stringBuffer2.append(interfaceC3453.getName().m3295());
        printStream.println(stringBuffer2.toString());
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("NAME:   ");
        stringBuffer3.append(interfaceC3453.getName().m3294());
        printStream.println(stringBuffer3.toString());
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("VALUE:  ");
        stringBuffer4.append(interfaceC3453.getValue());
        printStream.println(stringBuffer4.toString());
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("TYPE:   ");
        stringBuffer5.append(interfaceC3453.mo9125());
        printStream.println(stringBuffer5.toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m20979(InterfaceC8561 interfaceC8561) {
        if (interfaceC8561.mo18351() <= 0) {
            System.out.println("HAS NO ATTRIBUTES");
            return;
        }
        System.out.println("\nHAS ATTRIBUTES: ");
        Iterator itM28409 = C8545.m28409(interfaceC8561);
        while (itM28409.hasNext()) {
            InterfaceC3453 interfaceC3453 = (InterfaceC3453) itM28409.next();
            System.out.println("");
            m20978(interfaceC3453);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m20980(int i) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("EVENT TYPE(");
        stringBuffer.append(i);
        stringBuffer.append("):");
        printStream.print(stringBuffer.toString());
        printStream.println(m3078(i));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m20981(InterfaceC8561 interfaceC8561) {
        if (!interfaceC8561.mo18334()) {
            System.out.println("HAS NO NAME");
            return;
        }
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("HAS NAME: ");
        stringBuffer.append(interfaceC8561.mo18348());
        printStream.println(stringBuffer.toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m20982(InterfaceC6347 interfaceC6347) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PREFIX: ");
        stringBuffer.append(interfaceC6347.getName().m21588());
        printStream.println(stringBuffer.toString());
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("NAMESP: ");
        stringBuffer2.append(interfaceC6347.getName().m3295());
        printStream.println(stringBuffer2.toString());
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("NAME:   ");
        stringBuffer3.append(interfaceC6347.getName().m3294());
        printStream.println(stringBuffer3.toString());
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("VALUE:  ");
        stringBuffer4.append(interfaceC6347.getValue());
        printStream.println(stringBuffer4.toString());
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("TYPE:   ");
        stringBuffer5.append(interfaceC6347.mo9125());
        printStream.println(stringBuffer5.toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m20983(InterfaceC8561 interfaceC8561) {
        if (interfaceC8561.mo18345() <= 0) {
            System.out.println("HAS NO NAMESPACES");
            return;
        }
        System.out.println("\nHAS NAMESPACES: ");
        Iterator itM28410 = C8545.m28410(interfaceC8561);
        while (itM28410.hasNext()) {
            InterfaceC6347 interfaceC6347 = (InterfaceC6347) itM28410.next();
            System.out.println("");
            m20982(interfaceC6347);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m20984() {
        System.out.println("usage: java com.bea.xml.stream.samples.Parse <xmlfile>");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m20985(InterfaceC8561 interfaceC8561) {
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

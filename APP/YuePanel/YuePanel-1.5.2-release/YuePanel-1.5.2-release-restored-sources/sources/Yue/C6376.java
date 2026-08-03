package Yue;

import java.io.FileReader;
import java.io.PrintStream;

/* JADX INFO: renamed from: Yue.ۥۣۡۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6376 {

    /* JADX INFO: renamed from: ۥ */
    public static String f2047;

    /* JADX INFO: renamed from: ۥ */
    public static void m2829(String[] strArr) throws Exception {
        try {
            f2047 = strArr[0];
        } catch (ArrayIndexOutOfBoundsException unused) {
            m2830();
            System.exit(0);
        }
        System.setProperty("javax.xml.stream.XMLInputFactory", "com.bea.xml.stream.MXParserFactory");
        System.setProperty("javax.xml.stream.XMLEventFactory", "com.bea.xml.stream.EventFactory");
        AbstractC8553 abstractC8553M28451 = AbstractC8553.m28451();
        abstractC8553M28451.mo18452(new C7594());
        InterfaceC8549 interfaceC8549Mo18437 = abstractC8553M28451.mo18437(new FileReader(f2047));
        while (interfaceC8549Mo18437.hasNext()) {
            InterfaceC8543 interfaceC8543Mo14125 = interfaceC8549Mo18437.mo14125();
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("ID:");
            stringBuffer.append(interfaceC8543Mo14125.hashCode());
            stringBuffer.append("[");
            stringBuffer.append(interfaceC8543Mo14125);
            stringBuffer.append("]");
            printStream.println(stringBuffer.toString());
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m2830() {
        System.out.println("usage: java com.bea.xml.stream.samples.EventParse <xmlfile>");
    }
}

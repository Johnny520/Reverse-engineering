package Yue;

import java.io.FileReader;
import java.io.PrintStream;

/* JADX INFO: renamed from: Yue.ۥۣ۟۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3196 {

    /* JADX INFO: renamed from: ۥ */
    public static String f124;

    /* JADX INFO: renamed from: ۥ */
    public static void m269(String[] strArr) throws Exception {
        try {
            f124 = strArr[0];
        } catch (ArrayIndexOutOfBoundsException unused) {
            m270();
            System.exit(0);
        }
        System.setProperty("javax.xml.stream.XMLInputFactory", "com.bea.xml.stream.MXParserFactory");
        System.setProperty("javax.xml.stream.XMLOutputFactory", "com.bea.xml.stream.XMLOutputFactoryBase");
        System.setProperty("javax.xml.stream.XMLEventFactory", "com.bea.xml.stream.EventFactory");
        AbstractC8553 abstractC8553M28451 = AbstractC8553.m28451();
        abstractC8553M28451.mo18453(AbstractC8553.f25386, Boolean.FALSE);
        InterfaceC8549 interfaceC8549Mo18437 = abstractC8553M28451.mo18437(new FileReader(f124));
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
    public static void m270() {
        System.out.println("usage: java com.bea.xml.stream.samples.AllocEventParse <xmlfile>");
    }
}

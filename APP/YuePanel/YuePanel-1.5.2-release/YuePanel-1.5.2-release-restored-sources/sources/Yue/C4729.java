package Yue;

import java.io.FileReader;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4729 {

    /* JADX INFO: renamed from: ۥ */
    public static String f1081;

    /* JADX INFO: renamed from: ۥ */
    public static void m1646(String[] strArr) throws Exception {
        try {
            f1081 = strArr[0];
        } catch (ArrayIndexOutOfBoundsException unused) {
            m1647();
            System.exit(0);
        }
        System.setProperty("javax.xml.stream.XMLInputFactory", "com.bea.xml.stream.MXParserFactory");
        System.setProperty("javax.xml.stream.XMLOutputFactory", "com.bea.xml.stream.XMLOutputFactoryBase");
        System.setProperty("javax.xml.stream.XMLEventFactory", "com.bea.xml.stream.EventFactory");
        AbstractC8553 abstractC8553M28451 = AbstractC8553.m28451();
        AbstractC8554 abstractC8554M28453 = AbstractC8554.m28453();
        abstractC8553M28451.mo18453(AbstractC8553.f25386, Boolean.TRUE);
        InterfaceC8549 interfaceC8549Mo18437 = abstractC8553M28451.mo18437(new FileReader(f1081));
        InterfaceC8551 interfaceC8551Mo4530 = abstractC8554M28453.mo4530(System.out);
        interfaceC8551Mo4530.mo28436(interfaceC8549Mo18437);
        interfaceC8551Mo4530.flush();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m1647() {
        System.out.println("usage: java com.bea.xml.stream.samples.EventWrite <xmlfile>");
    }
}

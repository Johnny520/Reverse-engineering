package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2254 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.String f7015;

    static {
            return
    }

    public C2254() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m10441(java.lang.String[] r3) throws java.lang.Exception {
            r0 = 0
            r3 = r3[r0]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6
            Yue.C2254.f7015 = r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6
            goto Lc
        L6:
            m10442()
            java.lang.System.exit(r0)
        Lc:
            java.lang.String r3 = "javax.xml.stream.XMLInputFactory"
            java.lang.String r0 = "com.bea.xml.stream.MXParserFactory"
            java.lang.System.setProperty(r3, r0)
            java.lang.String r3 = "javax.xml.stream.XMLOutputFactory"
            java.lang.String r0 = "com.bea.xml.stream.XMLOutputFactoryBase"
            java.lang.System.setProperty(r3, r0)
            java.lang.String r3 = "javax.xml.stream.XMLEventFactory"
            java.lang.String r0 = "com.bea.xml.stream.EventFactory"
            java.lang.System.setProperty(r3, r0)
            Yue.ۥۢۦۡۧ r3 = Yue.AbstractC7152.m27518()
            Yue.ۥۢۦۡۨ r0 = Yue.AbstractC7153.m27520()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = "javax.xml.stream.isReplacingEntityReferences"
            r3.mo15576(r2, r1)
            java.io.FileReader r1 = new java.io.FileReader
            java.lang.String r2 = Yue.C2254.f7015
            r1.<init>(r2)
            Yue.ۥۢۦۣۡ r3 = r3.mo15560(r1)
            java.io.PrintStream r1 = java.lang.System.out
            Yue.ۥۢۦۡۥ r0 = r0.mo27522(r1)
            r0.mo27503(r3)
            r0.flush()
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m10442() {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "usage: java com.bea.xml.stream.samples.EventWrite <xmlfile>"
            r0.println(r1)
            return
    }
}

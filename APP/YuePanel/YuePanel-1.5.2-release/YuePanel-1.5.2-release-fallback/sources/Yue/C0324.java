package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0324 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.String f717;

    static {
            return
    }

    public C0324() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m1376(java.lang.String[] r4) throws java.lang.Exception {
            r0 = 0
            r4 = r4[r0]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6
            Yue.C0324.f717 = r4     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6
            goto Lc
        L6:
            m1377()
            java.lang.System.exit(r0)
        Lc:
            java.lang.String r4 = "javax.xml.stream.XMLInputFactory"
            java.lang.String r0 = "com.bea.xml.stream.MXParserFactory"
            java.lang.System.setProperty(r4, r0)
            java.lang.String r4 = "javax.xml.stream.XMLOutputFactory"
            java.lang.String r0 = "com.bea.xml.stream.XMLOutputFactoryBase"
            java.lang.System.setProperty(r4, r0)
            java.lang.String r4 = "javax.xml.stream.XMLEventFactory"
            java.lang.String r0 = "com.bea.xml.stream.EventFactory"
            java.lang.System.setProperty(r4, r0)
            Yue.ۥۢۦۡۧ r4 = Yue.AbstractC7152.m27518()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r1 = "javax.xml.stream.isReplacingEntityReferences"
            r4.mo15576(r1, r0)
            java.io.FileReader r0 = new java.io.FileReader
            java.lang.String r1 = Yue.C0324.f717
            r0.<init>(r1)
            Yue.ۥۢۦۣۡ r4 = r4.mo15560(r0)
        L37:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L69
            Yue.ۥۢۦ۠ۨ r0 = r4.mo10309()
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = "ID:"
            r2.append(r3)
            int r3 = r0.hashCode()
            r2.append(r3)
            java.lang.String r3 = "["
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.println(r0)
            goto L37
        L69:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m1377() {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "usage: java com.bea.xml.stream.samples.AllocEventParse <xmlfile>"
            r0.println(r1)
            return
    }
}

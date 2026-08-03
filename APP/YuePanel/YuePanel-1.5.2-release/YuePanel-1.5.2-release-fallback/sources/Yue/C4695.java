package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4695 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.String f14908;

    static {
            return
    }

    public C4695() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String m18594(int r0) {
            java.lang.String r0 = Yue.C2107.m9935(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m18595(java.lang.String[] r3) throws java.lang.Exception {
            r0 = 0
            r3 = r3[r0]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6
            Yue.C4695.f14908 = r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6
            goto Lc
        L6:
            m18602()
            java.lang.System.exit(r0)
        Lc:
            java.lang.String r3 = "javax.xml.stream.XMLInputFactory"
            java.lang.String r0 = "com.bea.xml.stream.MXParserFactory"
            java.lang.System.setProperty(r3, r0)
            Yue.ۥۢۦۡۧ r3 = Yue.AbstractC7152.m27518()
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "FACTORY: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            java.io.FileReader r1 = new java.io.FileReader
            java.lang.String r2 = Yue.C4695.f14908
            r1.<init>(r2)
            Yue.ۥۢۦۢۤ r3 = r3.mo15566(r1)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "READER:  "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = "\n"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            int r1 = r3.mo15450()
            java.lang.String r2 = "PARSER STATE BEFORE FIRST next(): "
            r0.println(r2)
            m18598(r1)
            m18599(r3)
            m18603(r3)
            java.lang.String r1 = "-----------------------------"
            r0.println(r1)
        L68:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8d
            int r0 = r3.next()
            m18598(r0)
            m18599(r3)
            m18603(r3)
            boolean r0 = r3.mo15449()
            if (r0 == 0) goto L87
            m18597(r3)
            m18601(r3)
        L87:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            goto L68
        L8d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m18596(Yue.InterfaceC0645 r3) {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "PREFIX: "
            r1.append(r2)
            Yue.ۥۡۥۤۨ r2 = r3.getName()
            java.lang.String r2 = r2.m19422()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "NAMESP: "
            r1.append(r2)
            Yue.ۥۡۥۤۨ r2 = r3.getName()
            java.lang.String r2 = r2.m19421()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "NAME:   "
            r1.append(r2)
            Yue.ۥۡۥۤۨ r2 = r3.getName()
            java.lang.String r2 = r2.m19420()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "VALUE:  "
            r1.append(r2)
            java.lang.String r2 = r3.getValue()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "TYPE:   "
            r1.append(r2)
            java.lang.String r3 = r3.mo4210()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.println(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m18597(Yue.InterfaceC7160 r3) {
            int r0 = r3.mo15472()
            if (r0 <= 0) goto L28
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "\nHAS ATTRIBUTES: "
            r0.println(r1)
            java.util.Iterator r3 = Yue.C7144.m27474(r3)
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()
            Yue.ۥ۟ۢ۠ۡ r0 = (Yue.InterfaceC0645) r0
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = ""
            r1.println(r2)
            m18596(r0)
            goto L11
        L28:
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.String r0 = "HAS NO ATTRIBUTES"
            r3.println(r0)
        L2f:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m18598(int r3) {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "EVENT TYPE("
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = "):"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
            java.lang.String r3 = m18594(r3)
            r0.println(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m18599(Yue.InterfaceC7160 r3) {
            boolean r0 = r3.mo15455()
            if (r0 == 0) goto L21
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "HAS NAME: "
            r1.append(r2)
            java.lang.String r3 = r3.mo15469()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.println(r3)
            goto L28
        L21:
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.String r0 = "HAS NO NAME"
            r3.println(r0)
        L28:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m18600(Yue.InterfaceC4364 r3) {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "PREFIX: "
            r1.append(r2)
            Yue.ۥۡۥۤۨ r2 = r3.getName()
            java.lang.String r2 = r2.m19422()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "NAMESP: "
            r1.append(r2)
            Yue.ۥۡۥۤۨ r2 = r3.getName()
            java.lang.String r2 = r2.m19421()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "NAME:   "
            r1.append(r2)
            Yue.ۥۡۥۤۨ r2 = r3.getName()
            java.lang.String r2 = r2.m19420()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "VALUE:  "
            r1.append(r2)
            java.lang.String r2 = r3.getValue()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "TYPE:   "
            r1.append(r2)
            java.lang.String r3 = r3.mo4210()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.println(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m18601(Yue.InterfaceC7160 r3) {
            int r0 = r3.mo15466()
            if (r0 <= 0) goto L28
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "\nHAS NAMESPACES: "
            r0.println(r1)
            java.util.Iterator r3 = Yue.C7144.m27475(r3)
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()
            Yue.ۥۣۡۢ۠ r0 = (Yue.InterfaceC4364) r0
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = ""
            r1.println(r2)
            m18600(r0)
            goto L11
        L28:
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.String r0 = "HAS NO NAMESPACES"
            r3.println(r0)
        L2f:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m18602() {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "usage: java com.bea.xml.stream.samples.Parse <xmlfile>"
            r0.println(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m18603(Yue.InterfaceC7160 r3) {
            boolean r0 = r3.mo15462()
            if (r0 == 0) goto L21
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "HAS VALUE: "
            r1.append(r2)
            java.lang.String r3 = r3.getText()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.println(r3)
            goto L28
        L21:
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.String r0 = "HAS NO VALUE"
            r3.println(r0)
        L28:
            return
    }
}

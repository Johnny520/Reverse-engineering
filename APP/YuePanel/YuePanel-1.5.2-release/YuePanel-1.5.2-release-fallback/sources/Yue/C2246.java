package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2246 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.String f6929;

    static {
            return
    }

    public C2246() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String m10293(int r0) {
            java.lang.String r0 = Yue.C2107.m9935(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m10294(java.lang.String[] r3) throws java.lang.Exception {
            r0 = 0
            r3 = r3[r0]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6
            Yue.C2246.f6929 = r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6
            goto Lc
        L6:
            m10303()
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
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r2 = "javax.xml.stream.isReplacingEntityReferences"
            r3.mo15576(r2, r1)
            java.io.FileReader r1 = new java.io.FileReader
            java.lang.String r2 = Yue.C2246.f6929
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
        L58:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L65
            m10297(r3)
            r3.next()
            goto L58
        L65:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m10295(Yue.InterfaceC0645 r3) {
            Yue.ۥۡۥۤۨ r0 = r3.getName()
            java.lang.String r0 = r0.m19422()
            Yue.ۥۡۥۤۨ r1 = r3.getName()
            java.lang.String r1 = r1.m19421()
            Yue.ۥۡۥۤۨ r2 = r3.getName()
            java.lang.String r2 = r2.m19420()
            m10300(r0, r1, r2)
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "='"
            r1.append(r2)
            java.lang.String r3 = r3.getValue()
            r1.append(r3)
            java.lang.String r3 = "'"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.print(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m10296(Yue.InterfaceC7160 r2) {
            int r0 = r2.mo15472()
            if (r0 <= 0) goto L21
            java.util.Iterator r2 = Yue.C7144.m27474(r2)
        La:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L21
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = " "
            r0.print(r1)
            java.lang.Object r0 = r2.next()
            Yue.ۥ۟ۢ۠ۡ r0 = (Yue.InterfaceC0645) r0
            m10295(r0)
            goto La
        L21:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m10297(Yue.InterfaceC7160 r6) {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "EVENT:["
            r1.append(r2)
            Yue.ۥ۠ۧۧۧ r2 = r6.mo15451()
            int r2 = r2.mo4246()
            r1.append(r2)
            java.lang.String r2 = "]["
            r1.append(r2)
            Yue.ۥ۠ۧۧۧ r2 = r6.mo15451()
            int r2 = r2.mo4238()
            r1.append(r2)
            java.lang.String r2 = "] "
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
            int r1 = r6.mo15450()
            java.lang.String r1 = m10293(r1)
            r0.print(r1)
            java.lang.String r1 = " ["
            r0.print(r1)
            int r1 = r6.mo15450()
            r2 = 9
            java.lang.String r3 = "]"
            if (r1 == r2) goto L134
            r2 = 12
            if (r1 == r2) goto L11c
            java.lang.String r2 = ">"
            java.lang.String r4 = "?>"
            switch(r1) {
                case 1: goto L106;
                case 2: goto Lf3;
                case 3: goto Ldc;
                case 4: goto Lc6;
                case 5: goto Lad;
                case 6: goto Lc6;
                case 7: goto L5a;
                default: goto L58;
            }
        L58:
            goto L16d
        L5a:
            java.lang.String r1 = "<?xml"
            r0.print(r1)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = " version='"
            r1.append(r2)
            java.lang.String r2 = r6.getVersion()
            r1.append(r2)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r5 = " encoding='"
            r1.append(r5)
            java.lang.String r5 = r6.mo15444()
            r1.append(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
            boolean r6 = r6.mo15448()
            if (r6 == 0) goto La3
            java.lang.String r6 = " standalone='yes'"
            r0.print(r6)
            goto La8
        La3:
            java.lang.String r6 = " standalone='no'"
            r0.print(r6)
        La8:
            r0.print(r4)
            goto L16d
        Lad:
            java.lang.String r1 = "<!--"
            r0.print(r1)
            boolean r1 = r6.mo15462()
            if (r1 == 0) goto Lbf
            java.lang.String r6 = r6.getText()
            r0.print(r6)
        Lbf:
            java.lang.String r6 = "-->"
            r0.print(r6)
            goto L16d
        Lc6:
            int r1 = r6.mo15470()
            int r2 = r6.mo15457()
            java.lang.String r4 = new java.lang.String
            char[] r6 = r6.mo15453()
            r4.<init>(r6, r1, r2)
            r0.print(r4)
            goto L16d
        Ldc:
            java.lang.String r1 = "<?"
            r0.print(r1)
            boolean r1 = r6.mo15462()
            if (r1 == 0) goto Lee
            java.lang.String r6 = r6.getText()
            r0.print(r6)
        Lee:
            r0.print(r4)
            goto L16d
        Lf3:
            java.lang.String r1 = "</"
            r0.print(r1)
            m10299(r6)
            java.util.Iterator r6 = Yue.C7144.m27475(r6)
            m10302(r6)
            r0.print(r2)
            goto L16d
        L106:
            java.lang.String r1 = "<"
            r0.print(r1)
            m10299(r6)
            java.util.Iterator r1 = Yue.C7144.m27475(r6)
            m10302(r1)
            m10296(r6)
            r0.print(r2)
            goto L16d
        L11c:
            java.lang.String r1 = "<![CDATA["
            r0.print(r1)
            boolean r1 = r6.mo15462()
            if (r1 == 0) goto L12e
            java.lang.String r6 = r6.getText()
            r0.print(r6)
        L12e:
            java.lang.String r6 = "]]>"
            r0.print(r6)
            goto L16d
        L134:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = r6.mo15469()
            r1.append(r2)
            java.lang.String r2 = "="
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
            boolean r1 = r6.mo15462()
            if (r1 == 0) goto L16d
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "["
            r1.append(r2)
            java.lang.String r6 = r6.getText()
            r1.append(r6)
            r1.append(r3)
            java.lang.String r6 = r1.toString()
            r0.print(r6)
        L16d:
            r0.println(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m10298(int r3) {
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
            java.lang.String r3 = m10293(r3)
            r0.println(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m10299(Yue.InterfaceC7160 r2) {
            boolean r0 = r2.mo15455()
            if (r0 == 0) goto L15
            java.lang.String r0 = r2.getPrefix()
            java.lang.String r1 = r2.mo15446()
            java.lang.String r2 = r2.mo15469()
            m10300(r0, r1, r2)
        L15:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m10300(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            if (r4 == 0) goto L25
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L25
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "['"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "']:"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.print(r4)
        L25:
            if (r3 == 0) goto L3d
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = ":"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.print(r3)
        L3d:
            if (r5 == 0) goto L44
            java.io.PrintStream r3 = java.lang.System.out
            r3.print(r5)
        L44:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m10301(Yue.InterfaceC4364 r4) {
            boolean r0 = r4.mo17191()
            java.lang.String r1 = "'"
            if (r0 == 0) goto L26
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = "xmlns='"
            r2.append(r3)
            java.lang.String r4 = r4.mo4233()
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
            r0.print(r4)
            goto L4f
        L26:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = "xmlns:"
            r2.append(r3)
            java.lang.String r3 = r4.getPrefix()
            r2.append(r3)
            java.lang.String r3 = "='"
            r2.append(r3)
            java.lang.String r4 = r4.mo4233()
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
            r0.print(r4)
        L4f:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m10302(java.util.Iterator r2) {
        L0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L17
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = " "
            r0.print(r1)
            java.lang.Object r0 = r2.next()
            Yue.ۥۣۡۢ۠ r0 = (Yue.InterfaceC4364) r0
            m10301(r0)
            goto L0
        L17:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m10303() {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "usage: java com.bea.xml.stream.samples.EventParse <xmlfile>"
            r0.println(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m10304(Yue.InterfaceC7160 r3) {
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

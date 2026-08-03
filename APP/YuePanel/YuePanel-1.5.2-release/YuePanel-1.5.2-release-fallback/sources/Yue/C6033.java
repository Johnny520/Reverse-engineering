package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6033 extends Yue.C5206 {

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int f21822;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean f21823;

    public C6033(Yue.InterfaceC7160 r2) throws Yue.C7158 {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.f21822 = r0
            r0 = 1
            r1.f21823 = r0
            boolean r2 = r2.mo15449()
            if (r2 == 0) goto L17
            r1.f21823 = r0
            int r2 = r1.f21822
            int r2 = r2 + r0
            r1.f21822 = r2
            return
        L17:
            Yue.ۥۢۦۢۢ r2 = new Yue.ۥۢۦۢۢ
            java.lang.String r0 = "Unable to instantiate a subReader because the underlying reader was not on a start element."
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static void m22697(java.lang.String[] r3) throws java.lang.Exception {
            Yue.ۥ۠ۨۤۥ r0 = new Yue.ۥ۠ۨۤۥ
            r0.<init>()
            java.io.FileReader r1 = new java.io.FileReader
            r2 = 0
            r3 = r3[r2]
            r1.<init>(r3)
            r0.m15546(r1)
            r0.m15514()
            r0.next()
        L16:
            boolean r3 = r0.m15514()
            if (r3 == 0) goto L3f
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "SE->"
            r1.append(r2)
            Yue.ۥۡۥۤۨ r2 = r0.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r3.println(r1)
            Yue.ۥۢۦۢۤ r3 = r0.m15550()
            r1 = 1
            m22699(r3, r1)
            goto L16
        L3f:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static void m22698(Yue.InterfaceC7160 r3, int r4) throws Yue.C7158 {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "["
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "]Sub: "
            r1.append(r4)
            int r4 = r3.mo15450()
            java.lang.String r4 = Yue.C2107.m9935(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.print(r4)
            boolean r4 = r3.mo15455()
            if (r4 == 0) goto L45
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.String r1 = "->"
            r4.append(r1)
            java.lang.String r3 = r3.mo15469()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.println(r3)
            goto L6c
        L45:
            boolean r4 = r3.mo15462()
            if (r4 == 0) goto L69
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.String r1 = "->["
            r4.append(r1)
            java.lang.String r3 = r3.getText()
            r4.append(r3)
            java.lang.String r3 = "]"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.println(r3)
            goto L6c
        L69:
            r0.println()
        L6c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static void m22699(Yue.InterfaceC7160 r1, int r2) throws java.lang.Exception {
        L0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Ld
            m22698(r1, r2)
            r1.next()
            goto L0
        Ld:
            return
    }

    @Override // Yue.C5206, Yue.InterfaceC7160
    public boolean hasNext() throws Yue.C7158 {
            r1 = this;
            boolean r0 = r1.f21823
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = super.hasNext()
            return r0
    }

    @Override // Yue.C5206, Yue.InterfaceC7160
    public int next() throws Yue.C7158 {
            r2 = this;
            int r0 = r2.f21822
            if (r0 > 0) goto L7
            r0 = 0
            r2.f21823 = r0
        L7:
            int r0 = super.next()
            boolean r1 = r2.mo15449()
            if (r1 == 0) goto L17
            int r1 = r2.f21822
            int r1 = r1 + 1
            r2.f21822 = r1
        L17:
            boolean r1 = r2.mo15447()
            if (r1 == 0) goto L23
            int r1 = r2.f21822
            int r1 = r1 + (-1)
            r2.f21822 = r1
        L23:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public boolean m22700() throws Yue.C7158 {
            r2 = this;
            boolean r0 = r2.mo15447()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L19
            boolean r0 = r2.mo15447()
            if (r0 == 0) goto L15
            return r1
        L15:
            r2.next()
            goto L8
        L19:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public boolean m22701(java.lang.String r3) throws Yue.C7158 {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2.m22700()
            if (r1 == 0) goto L21
            java.lang.String r1 = r2.mo15469()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L16
            r3 = 1
            return r3
        L16:
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L1d
            return r0
        L1d:
            r2.next()
            goto L4
        L21:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public boolean m22702(java.lang.String r3, java.lang.String r4) throws Yue.C7158 {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L23
            if (r4 != 0) goto L6
            goto L23
        L6:
            boolean r1 = r2.m22701(r3)
            if (r1 == 0) goto L23
            java.lang.String r1 = r2.mo15446()
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L18
            r3 = 1
            return r3
        L18:
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L1f
            return r0
        L1f:
            r2.next()
            goto L6
        L23:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public boolean m22703() throws Yue.C7158 {
            r2 = this;
            boolean r0 = r2.mo15449()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L19
            boolean r0 = r2.mo15449()
            if (r0 == 0) goto L15
            return r1
        L15:
            r2.next()
            goto L8
        L19:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public boolean m22704(java.lang.String r3) throws Yue.C7158 {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2.m22703()
            if (r1 == 0) goto L21
            java.lang.String r1 = r2.mo15469()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L16
            r3 = 1
            return r3
        L16:
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L1d
            return r0
        L1d:
            r2.next()
            goto L4
        L21:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public boolean m22705(java.lang.String r3, java.lang.String r4) throws Yue.C7158 {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L23
            if (r4 != 0) goto L6
            goto L23
        L6:
            boolean r1 = r2.m22704(r3)
            if (r1 == 0) goto L23
            java.lang.String r1 = r2.mo15446()
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L18
            r3 = 1
            return r3
        L18:
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L1f
            return r0
        L1f:
            r2.next()
            goto L6
        L23:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public int m22706() throws Yue.C7158 {
            r1 = this;
            r1.next()
        L3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L19
            boolean r0 = r1.mo15449()
            if (r0 != 0) goto L19
            boolean r0 = r1.mo15447()
            if (r0 != 0) goto L19
            r1.next()
            goto L3
        L19:
            int r0 = super.mo15450()
            return r0
    }
}

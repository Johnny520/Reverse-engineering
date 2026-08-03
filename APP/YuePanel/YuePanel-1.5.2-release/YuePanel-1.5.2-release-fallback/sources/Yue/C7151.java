package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7151 implements Yue.InterfaceC7150, Yue.InterfaceC7145 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Yue.InterfaceC7162 f24697;

    public C7151(Yue.InterfaceC7162 r1) {
            r0 = this;
            r0.<init>()
            r0.f24697 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static void m27504(java.lang.String[] r5) throws java.lang.Exception {
            java.lang.String r0 = "javax.xml.stream.XMLInputFactory"
            java.lang.String r1 = "com.bea.xml.stream.MXParserFactory"
            java.lang.System.setProperty(r0, r1)
            java.lang.String r0 = "javax.xml.stream.XMLEventFactory"
            java.lang.String r1 = "com.bea.xml.stream.EventFactory"
            java.lang.System.setProperty(r0, r1)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            java.io.PrintStream r1 = java.lang.System.out
            r0.<init>(r1)
            Yue.ۥۢۦۡۦ r1 = new Yue.ۥۢۦۡۦ
            Yue.ۥۢۦۢۧ r2 = new Yue.ۥۢۦۢۧ
            r2.<init>(r0)
            r1.<init>(r2)
            Yue.ۥ۠ۨۤۥ r0 = new Yue.ۥ۠ۨۤۥ
            r0.<init>()
            Yue.ۥ۟ۦۧ۟ r2 = new Yue.ۥ۟ۦۧ۟
            r2.<init>()
            r0.m15542(r2)
            java.io.FileReader r2 = new java.io.FileReader
            r3 = 0
            r5 = r5[r3]
            r2.<init>(r5)
            r0.m15546(r2)
            Yue.ۥۢۦۡۤ r5 = new Yue.ۥۢۦۡۤ
            r5.<init>(r0)
        L3c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L65
            Yue.ۥۢۦ۠ۨ r0 = r5.mo10309()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.lang.String r4 = "about to add:["
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = "];"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.println(r3)
            r1.mo27488(r0)
            goto L3c
        L65:
            r1.flush()
            return
    }

    @Override // Yue.InterfaceC7150
    public void close() throws Yue.C7158 {
            r1 = this;
            Yue.ۥۢۦۢۦ r0 = r1.f24697
            r0.close()
            return
    }

    @Override // Yue.InterfaceC7150
    public void flush() throws Yue.C7158 {
            r1 = this;
            Yue.ۥۢۦۢۦ r0 = r1.f24697
            r0.flush()
            return
    }

    @Override // Yue.InterfaceC7150
    public java.lang.String getPrefix(java.lang.String r2) throws Yue.C7158 {
            r1 = this;
            Yue.ۥۢۦۢۦ r0 = r1.f24697
            java.lang.String r2 = r0.getPrefix(r2)
            return r2
    }

    @Override // Yue.InterfaceC7150
    /* JADX INFO: renamed from: ۥ */
    public void mo27499(java.lang.String r2, java.lang.String r3) throws Yue.C7158 {
            r1 = this;
            Yue.ۥۢۦۢۦ r0 = r1.f24697
            r0.mo27564(r2, r3)
            return
    }

    @Override // Yue.InterfaceC7150
    /* JADX INFO: renamed from: ۥ۟ */
    public Yue.InterfaceC4366 mo27500() {
            r1 = this;
            Yue.ۥۢۦۢۦ r0 = r1.f24697
            Yue.ۥۡۢ۠ۥ r0 = r0.mo27565()
            return r0
    }

    @Override // Yue.InterfaceC7150
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo27501(java.lang.String r2) throws Yue.C7158 {
            r1 = this;
            Yue.ۥۢۦۢۦ r0 = r1.f24697
            r0.mo27566(r2)
            return
    }

    @Override // Yue.InterfaceC7150, Yue.InterfaceC7145
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo27488(Yue.InterfaceC7142 r4) throws Yue.C7158 {
            r3 = this;
            int r0 = r4.mo4236()
            switch(r0) {
                case 1: goto L67;
                case 2: goto L61;
                case 3: goto L5b;
                case 4: goto L55;
                case 5: goto L4f;
                case 6: goto L7;
                case 7: goto L49;
                case 8: goto L43;
                case 9: goto L3d;
                case 10: goto L37;
                case 11: goto L31;
                case 12: goto L7;
                case 13: goto L2b;
                default: goto L7;
            }
        L7:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "Unable to add event["
            r1.append(r2)
            int r4 = r4.mo4236()
            java.lang.String r4 = Yue.C2107.m9935(r4)
            r1.append(r4)
            java.lang.String r4 = "]"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L2b:
            Yue.ۥۣۡۢ۠ r4 = (Yue.InterfaceC4364) r4
            r3.m27512(r4)
            goto L6c
        L31:
            Yue.ۥ۟ۨ۟ۨ r4 = (Yue.InterfaceC1695) r4
            r3.m27508(r4)
            goto L6c
        L37:
            Yue.ۥ۟ۢ۠ۡ r4 = (Yue.InterfaceC0645) r4
            r3.m27505(r4)
            goto L6c
        L3d:
            Yue.ۥ۠ۡ۟ۤ r4 = (Yue.InterfaceC2165) r4
            r3.m27511(r4)
            goto L6c
        L43:
            Yue.ۥ۠۠ۨۧ r4 = (Yue.InterfaceC2153) r4
            r3.m27509(r4)
            goto L6c
        L49:
            Yue.ۥۢ۟ۨۢ r4 = (Yue.InterfaceC5920) r4
            r3.m27514(r4)
            goto L6c
        L4f:
            Yue.ۥ۟ۥۤۥ r4 = (Yue.InterfaceC1275) r4
            r3.m27507(r4)
            goto L6c
        L55:
            Yue.ۥۣ۟ۤۥ r4 = (Yue.InterfaceC1093) r4
            r3.m27506(r4)
            goto L6c
        L5b:
            Yue.ۥۡۥۡ۠ r4 = (Yue.InterfaceC4944) r4
            r3.m27513(r4)
            goto L6c
        L61:
            Yue.ۥ۠ۡ r4 = (Yue.InterfaceC2155) r4
            r3.m27510(r4)
            goto L6c
        L67:
            Yue.ۥۢ۟ۨۤ r4 = (Yue.InterfaceC5922) r4
            r3.m27515(r4)
        L6c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m27505(Yue.InterfaceC0645 r1) throws Yue.C7158 {
            r0 = this;
            r0.m27516(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m27506(Yue.InterfaceC1093 r2) throws Yue.C7158 {
            r1 = this;
            boolean r0 = r2.mo5834()
            if (r0 == 0) goto L10
            Yue.ۥۢۦۢۦ r0 = r1.f24697
            java.lang.String r2 = r2.getData()
            r0.mo27553(r2)
            goto L19
        L10:
            Yue.ۥۢۦۢۦ r0 = r1.f24697
            java.lang.String r2 = r2.getData()
            r0.mo27577(r2)
        L19:
            return
    }

    @Override // Yue.InterfaceC7150
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo27502(Yue.InterfaceC4366 r2) throws Yue.C7158 {
            r1 = this;
            Yue.ۥۢۦۢۦ r0 = r1.f24697
            r0.mo27567(r2)
            return
    }

    @Override // Yue.InterfaceC7150
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo27503(Yue.InterfaceC7148 r2) throws Yue.C7158 {
            r1 = this;
        L0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Le
            Yue.ۥۢۦ۠ۨ r0 = r2.mo10309()
            r1.mo27488(r0)
            goto L0
        Le:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m27507(Yue.InterfaceC1275 r2) throws Yue.C7158 {
            r1 = this;
            Yue.ۥۢۦۢۦ r0 = r1.f24697
            java.lang.String r2 = r2.getText()
            r0.mo27555(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m27508(Yue.InterfaceC1695 r2) throws Yue.C7158 {
            r1 = this;
            Yue.ۥۢۦۢۦ r0 = r1.f24697
            java.lang.String r2 = r2.mo8115()
            r0.mo27548(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m27509(Yue.InterfaceC2153 r1) throws Yue.C7158 {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m27510(Yue.InterfaceC2155 r2) throws Yue.C7158 {
            r1 = this;
            Yue.ۥۡۥۤۨ r0 = r2.getName()
            r0.m19422()
            Yue.ۥۡۥۤۨ r0 = r2.getName()
            r0.m19421()
            Yue.ۥۡۥۤۨ r2 = r2.getName()
            r2.m19420()
            Yue.ۥۢۦۢۦ r2 = r1.f24697
            r2.mo27573()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m27511(Yue.InterfaceC2165 r2) throws Yue.C7158 {
            r1 = this;
            Yue.ۥۢۦۢۦ r0 = r1.f24697
            java.lang.String r2 = r2.getName()
            r0.mo27552(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m27512(Yue.InterfaceC4364 r1) throws Yue.C7158 {
            r0 = this;
            r0.m27517(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m27513(Yue.InterfaceC4944 r3) throws Yue.C7158 {
            r2 = this;
            Yue.ۥۢۦۢۦ r0 = r2.f24697
            java.lang.String r1 = r3.getTarget()
            java.lang.String r3 = r3.getData()
            r0.mo27549(r1, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m27514(Yue.InterfaceC5920 r3) throws Yue.C7158 {
            r2 = this;
            java.lang.String r0 = r3.mo21984()
            java.lang.String r1 = r3.getVersion()
            r3.mo21985()
            Yue.ۥۢۦۢۦ r3 = r2.f24697
            r3.mo27554(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m27515(Yue.InterfaceC5922 r5) throws Yue.C7158 {
            r4 = this;
            Yue.ۥۡۥۤۨ r0 = r5.getName()
            java.lang.String r0 = r0.m19422()
            Yue.ۥۡۥۤۨ r1 = r5.getName()
            java.lang.String r1 = r1.m19421()
            Yue.ۥۡۥۤۨ r2 = r5.getName()
            java.lang.String r2 = r2.m19420()
            Yue.ۥۢۦۢۦ r3 = r4.f24697
            r3.mo27571(r0, r2, r1)
            java.util.Iterator r0 = r5.getNamespaces()
        L21:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            Yue.ۥۣۡۢ۠ r1 = (Yue.InterfaceC4364) r1
            r4.m27517(r1)
            goto L21
        L31:
            java.util.Iterator r5 = r5.getAttributes()
        L35:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r5.next()
            Yue.ۥ۟ۢ۠ۡ r0 = (Yue.InterfaceC0645) r0
            r4.m27516(r0)
            goto L35
        L45:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m27516(Yue.InterfaceC0645 r4) throws Yue.C7158 {
            r3 = this;
            Yue.ۥۢۦۢۦ r0 = r3.f24697
            Yue.ۥۡۥۤۨ r1 = r4.getName()
            java.lang.String r1 = r1.m19421()
            Yue.ۥۡۥۤۨ r2 = r4.getName()
            java.lang.String r2 = r2.m19420()
            java.lang.String r4 = r4.getValue()
            r0.mo27551(r1, r2, r4)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m27517(Yue.InterfaceC4364 r3) throws Yue.C7158 {
            r2 = this;
            boolean r0 = r3.mo17191()
            if (r0 == 0) goto L10
            Yue.ۥۢۦۢۦ r0 = r2.f24697
            java.lang.String r3 = r3.mo4233()
            r0.mo27547(r3)
            goto L1d
        L10:
            Yue.ۥۢۦۢۦ r0 = r2.f24697
            java.lang.String r1 = r3.getPrefix()
            java.lang.String r3 = r3.mo4233()
            r0.mo27550(r1, r3)
        L1d:
            return
    }
}

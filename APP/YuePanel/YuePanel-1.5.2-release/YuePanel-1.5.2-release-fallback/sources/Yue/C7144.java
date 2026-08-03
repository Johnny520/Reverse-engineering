package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7144 implements Yue.InterfaceC7143 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.AbstractC7146 f24689;

    public C7144() {
            r1 = this;
            r1.<init>()
            Yue.ۥۢۦۡۡ r0 = Yue.AbstractC7146.m27489()
            r1.f24689 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static java.util.Iterator m27474(Yue.InterfaceC7160 r10) {
            int r0 = r10.mo15472()
            if (r0 != 0) goto L9
            Yue.ۥ۠۠ۨ r10 = Yue.C2144.f6732
            return r10
        L9:
            int r0 = r10.mo15472()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L13:
            if (r2 >= r0) goto L35
            Yue.ۥۣ۟ۢ۠ r9 = new Yue.ۥۣ۟ۢ۠
            java.lang.String r4 = r10.mo15464(r2)
            java.lang.String r5 = r10.mo15460(r2)
            java.lang.String r6 = r10.mo15465(r2)
            java.lang.String r7 = r10.mo15452(r2)
            java.lang.String r8 = r10.mo15474(r2)
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r1.add(r9)
            int r2 = r2 + 1
            goto L13
        L35:
            java.util.Iterator r10 = r1.iterator()
            return r10
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static java.util.Iterator m27475(Yue.InterfaceC7160 r5) {
            int r0 = r5.mo15466()
            if (r0 != 0) goto L9
            Yue.ۥ۠۠ۨ r5 = Yue.C2144.f6732
            return r5
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        Lf:
            int r2 = r5.mo15466()
            if (r1 >= r2) goto L40
            java.lang.String r2 = r5.mo15458(r1)
            if (r2 == 0) goto L31
            java.lang.String r3 = ""
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L24
            goto L31
        L24:
            Yue.ۥۡۢ۠ۤ r3 = new Yue.ۥۡۢ۠ۤ
            java.lang.String r4 = r5.mo15471(r1)
            r3.<init>(r2, r4)
            r0.add(r3)
            goto L3d
        L31:
            Yue.ۥۡۢ۠ۤ r2 = new Yue.ۥۡۢ۠ۤ
            java.lang.String r3 = r5.mo15471(r1)
            r2.<init>(r3)
            r0.add(r2)
        L3d:
            int r1 = r1 + 1
            goto Lf
        L40:
            java.util.Iterator r5 = r0.iterator()
            return r5
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "NonStaticAllocator"
            return r0
    }

    @Override // Yue.InterfaceC7143
    /* JADX INFO: renamed from: ۥ */
    public Yue.InterfaceC7142 mo22065(Yue.InterfaceC7160 r4) throws Yue.C7158 {
            r3 = this;
            int r0 = r4.mo15450()
            switch(r0) {
                case 1: goto L69;
                case 2: goto L64;
                case 3: goto L5f;
                case 4: goto L5a;
                case 5: goto L55;
                case 6: goto L50;
                case 7: goto L4b;
                case 8: goto L46;
                case 9: goto L41;
                case 10: goto L7;
                case 11: goto L3c;
                case 12: goto L37;
                default: goto L7;
            }
        L7:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "Unable to allocate event["
            r1.append(r2)
            int r2 = r4.mo15450()
            r1.append(r2)
            java.lang.String r2 = " , "
            r1.append(r2)
            int r4 = r4.mo15450()
            java.lang.String r4 = Yue.C2107.m9935(r4)
            r1.append(r4)
            java.lang.String r4 = "]"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L37:
            Yue.ۥۣ۟ۤۥ r4 = r3.m27476(r4)
            return r4
        L3c:
            Yue.ۥ۟ۨ۟ۨ r4 = r3.m27479(r4)
            return r4
        L41:
            Yue.ۥ۠ۡ۟ۤ r4 = r3.m27482(r4)
            return r4
        L46:
            Yue.ۥ۠۠ۨۧ r4 = r3.m27480(r4)
            return r4
        L4b:
            Yue.ۥۢ۟ۨۢ r4 = r3.m27485(r4)
            return r4
        L50:
            Yue.ۥۣ۟ۤۥ r4 = r3.m27477(r4)
            return r4
        L55:
            Yue.ۥ۟ۥۤۥ r4 = r3.m27478(r4)
            return r4
        L5a:
            Yue.ۥۣ۟ۤۥ r4 = r3.m27477(r4)
            return r4
        L5f:
            Yue.ۥۡۥۡ۠ r4 = r3.m27483(r4)
            return r4
        L64:
            Yue.ۥ۠ۡ r4 = r3.m27481(r4)
            return r4
        L69:
            Yue.ۥۢ۟ۨۤ r4 = r3.m27486(r4)
            return r4
    }

    @Override // Yue.InterfaceC7143
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo22066(Yue.InterfaceC7160 r1, Yue.InterfaceC7145 r2) throws Yue.C7158 {
            r0 = this;
            Yue.ۥۢۦ۠ۨ r1 = r0.mo22065(r1)
            r2.mo27488(r1)
            return
    }

    @Override // Yue.InterfaceC7143
    /* JADX INFO: renamed from: ۥ۟۟ */
    public Yue.InterfaceC7143 mo22067() {
            r1 = this;
            Yue.ۥۢۦۡ۟ r0 = new Yue.ۥۢۦۡ۟
            r0.<init>()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Yue.InterfaceC1093 m27476(Yue.InterfaceC7160 r2) throws Yue.C7158 {
            r1 = this;
            Yue.ۥۢۦۡۡ r0 = r1.f24689
            java.lang.String r2 = r2.getText()
            Yue.ۥۣ۟ۤۥ r2 = r0.mo10177(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Yue.InterfaceC1093 m27477(Yue.InterfaceC7160 r5) throws Yue.C7158 {
            r4 = this;
            int r0 = r5.mo15470()
            int r1 = r5.mo15457()
            java.lang.String r2 = new java.lang.String
            char[] r3 = r5.mo15453()
            r2.<init>(r3, r0, r1)
            boolean r5 = r5.mo15445()
            if (r5 == 0) goto L1e
            Yue.ۥۢۦۡۡ r5 = r4.f24689
            Yue.ۥۣ۟ۤۥ r5 = r5.mo10190(r2)
            return r5
        L1e:
            Yue.ۥۢۦۡۡ r5 = r4.f24689
            Yue.ۥۣ۟ۤۥ r5 = r5.mo10178(r2)
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Yue.InterfaceC1275 m27478(Yue.InterfaceC7160 r2) throws Yue.C7158 {
            r1 = this;
            Yue.ۥۢۦۡۡ r0 = r1.f24689
            java.lang.String r2 = r2.getText()
            Yue.ۥ۟ۥۤۥ r2 = r0.mo10179(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Yue.InterfaceC1695 m27479(Yue.InterfaceC7160 r3) throws Yue.C7158 {
            r2 = this;
            boolean r0 = r3 instanceof Yue.C3850
            if (r0 == 0) goto L27
            r0 = r3
            Yue.ۥ۠ۨۤۥ r0 = (Yue.C3850) r0
            Yue.ۥ۟ۨۡ۠ r1 = new Yue.ۥ۟ۨۡ۠
            java.lang.String r3 = r3.getText()
            r1.<init>(r3)
            java.lang.String r3 = "javax.xml.stream.notations"
            java.lang.Object r3 = r0.getProperty(r3)
            java.util.List r3 = (java.util.List) r3
            r1.m8178(r3)
            java.lang.String r3 = "javax.xml.stream.entities"
            java.lang.Object r3 = r0.getProperty(r3)
            java.util.List r3 = (java.util.List) r3
            r1.m8177(r3)
            return r1
        L27:
            Yue.ۥۢۦۡۡ r0 = r2.f24689
            java.lang.String r3 = r3.getText()
            Yue.ۥ۟ۨ۟ۨ r3 = r0.mo10180(r3)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Yue.InterfaceC2153 m27480(Yue.InterfaceC7160 r1) throws Yue.C7158 {
            r0 = this;
            Yue.ۥۢۦۡۡ r1 = r0.f24689
            Yue.ۥ۠۠ۨۧ r1 = r1.mo10181()
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Yue.InterfaceC2155 m27481(Yue.InterfaceC7160 r5) throws Yue.C7158 {
            r4 = this;
            java.lang.String r0 = r5.getPrefix()
            java.lang.String r1 = r5.mo15446()
            java.lang.String r2 = ""
            if (r0 != 0) goto Ld
            r0 = r2
        Ld:
            if (r1 != 0) goto L10
            r1 = r2
        L10:
            Yue.ۥۢۦۡۡ r2 = r4.f24689
            java.lang.String r3 = r5.mo15469()
            java.util.Iterator r5 = m27475(r5)
            Yue.ۥ۠ۡ r5 = r2.mo10184(r0, r1, r3, r5)
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Yue.InterfaceC2165 m27482(Yue.InterfaceC7160 r3) throws Yue.C7158 {
            r2 = this;
            java.lang.String r0 = r3.mo15469()
            boolean r1 = r3 instanceof Yue.C3850
            Yue.ۥ۠ۡ۟ۢ r1 = new Yue.ۥ۠ۡ۟ۢ
            java.lang.String r3 = r3.getText()
            r1.<init>(r0, r3)
            Yue.ۥۢۦۡۡ r3 = r2.f24689
            Yue.ۥ۠ۡ۟ۤ r3 = r3.mo10185(r0, r1)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public Yue.InterfaceC4944 m27483(Yue.InterfaceC7160 r3) throws Yue.C7158 {
            r2 = this;
            Yue.ۥۢۦۡۡ r0 = r2.f24689
            java.lang.String r1 = r3.mo15456()
            java.lang.String r3 = r3.mo15467()
            Yue.ۥۡۥۡ۠ r3 = r0.mo10189(r1, r3)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public Yue.InterfaceC1093 m27484(Yue.InterfaceC7160 r2) throws Yue.C7158 {
            r1 = this;
            Yue.ۥۢۦۡۡ r0 = r1.f24689
            java.lang.String r2 = r2.getText()
            Yue.ۥۣ۟ۤۥ r2 = r0.mo10190(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public Yue.InterfaceC5920 m27485(Yue.InterfaceC7160 r1) throws Yue.C7158 {
            r0 = this;
            Yue.ۥۢ۟ۨۢ r1 = r0.m27487(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public Yue.InterfaceC5922 m27486(Yue.InterfaceC7160 r10) throws Yue.C7158 {
            r9 = this;
            java.lang.String r0 = r10.getPrefix()
            java.lang.String r1 = r10.mo15446()
            java.lang.String r2 = ""
            if (r0 != 0) goto Le
            r4 = r2
            goto Lf
        Le:
            r4 = r0
        Lf:
            if (r1 != 0) goto L13
            r5 = r2
            goto L14
        L13:
            r5 = r1
        L14:
            Yue.ۥۢۦۡۡ r3 = r9.f24689
            java.lang.String r6 = r10.mo15469()
            java.util.Iterator r7 = m27474(r10)
            java.util.Iterator r8 = m27475(r10)
            Yue.ۥۢ۟ۨۤ r10 = r3.mo10197(r4, r5, r6, r7, r8)
            return r10
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public Yue.InterfaceC5920 m27487(Yue.InterfaceC7160 r4) throws Yue.C7158 {
            r3 = this;
            java.lang.String r0 = r4.mo15444()
            java.lang.String r1 = r4.getVersion()
            boolean r4 = r4.mo15448()
            if (r0 == 0) goto L19
            if (r1 == 0) goto L19
            if (r4 != 0) goto L19
            Yue.ۥۢۦۡۡ r2 = r3.f24689
            Yue.ۥۢ۟ۨۢ r4 = r2.mo10194(r0, r1, r4)
            return r4
        L19:
            if (r1 == 0) goto L24
            if (r0 == 0) goto L24
            Yue.ۥۢۦۡۡ r4 = r3.f24689
            Yue.ۥۢ۟ۨۢ r4 = r4.mo10193(r0, r1)
            return r4
        L24:
            if (r0 == 0) goto L2d
            Yue.ۥۢۦۡۡ r4 = r3.f24689
            Yue.ۥۢ۟ۨۢ r4 = r4.mo10192(r0)
            return r4
        L2d:
            Yue.ۥۢۦۡۡ r4 = r3.f24689
            Yue.ۥۢ۟ۨۢ r4 = r4.mo10191()
            return r4
    }
}

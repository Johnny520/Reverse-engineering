package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5207 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.InterfaceC7162 f19546;

    public C5207() {
            r0 = this;
            r0.<init>()
            return
    }

    public C5207(Yue.InterfaceC7162 r1) {
            r0 = this;
            r0.<init>()
            r0.f19546 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static void m19665(java.lang.String[] r4) throws java.lang.Exception {
            Yue.ۥۢۦۡۧ r0 = Yue.AbstractC7152.m27518()
            Yue.ۥۢۦۡۨ r1 = Yue.AbstractC7153.m27520()
            java.io.FileReader r2 = new java.io.FileReader
            r3 = 0
            r4 = r4[r3]
            r2.<init>(r4)
            Yue.ۥۢۦۢۤ r4 = r0.mo15566(r2)
            java.io.PrintStream r0 = java.lang.System.out
            Yue.ۥۢۦۢۦ r0 = r1.mo27526(r0)
            Yue.ۥۡۦ۠ r1 = new Yue.ۥۡۦ۠
            r1.<init>(r0)
        L1f:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2c
            r1.mo19667(r4)
            r4.next()
            goto L1f
        L2c:
            r0.flush()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void m19666(Yue.InterfaceC7162 r1) {
            r0 = this;
            r0.f19546 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void mo19667(Yue.InterfaceC7160 r5) throws Yue.C7158 {
            r4 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "wrote event"
            r0.println(r1)
            int r0 = r5.mo15450()
            switch(r0) {
                case 1: goto L89;
                case 2: goto L83;
                case 3: goto L75;
                case 4: goto L63;
                case 5: goto L58;
                case 6: goto L63;
                case 7: goto L38;
                case 8: goto L31;
                case 9: goto L26;
                case 10: goto Le;
                case 11: goto L1b;
                case 12: goto L10;
                default: goto Le;
            }
        Le:
            goto Ld5
        L10:
            Yue.ۥۢۦۢۦ r0 = r4.f19546
            java.lang.String r5 = r5.getText()
            r0.mo27553(r5)
            goto Ld5
        L1b:
            Yue.ۥۢۦۢۦ r0 = r4.f19546
            java.lang.String r5 = r5.getText()
            r0.mo27548(r5)
            goto Ld5
        L26:
            Yue.ۥۢۦۢۦ r0 = r4.f19546
            java.lang.String r5 = r5.mo15469()
            r0.mo27552(r5)
            goto Ld5
        L31:
            Yue.ۥۢۦۢۦ r5 = r4.f19546
            r5.mo27574()
            goto Ld5
        L38:
            java.lang.String r0 = r5.mo15444()
            java.lang.String r1 = r5.getVersion()
            if (r0 == 0) goto L4b
            if (r1 == 0) goto L4b
            Yue.ۥۢۦۢۦ r5 = r4.f19546
            r5.mo27554(r0, r1)
            goto Ld5
        L4b:
            if (r1 == 0) goto Ld5
            Yue.ۥۢۦۢۦ r0 = r4.f19546
            java.lang.String r5 = r5.getVersion()
            r0.mo27546(r5)
            goto Ld5
        L58:
            Yue.ۥۢۦۢۦ r0 = r4.f19546
            java.lang.String r5 = r5.getText()
            r0.mo27555(r5)
            goto Ld5
        L63:
            Yue.ۥۢۦۢۦ r0 = r4.f19546
            char[] r1 = r5.mo15453()
            int r2 = r5.mo15470()
            int r5 = r5.mo15457()
            r0.mo27580(r1, r2, r5)
            goto Ld5
        L75:
            Yue.ۥۢۦۢۦ r0 = r4.f19546
            java.lang.String r1 = r5.mo15456()
            java.lang.String r5 = r5.mo15467()
            r0.mo27549(r1, r5)
            goto Ld5
        L83:
            Yue.ۥۢۦۢۦ r5 = r4.f19546
            r5.mo27573()
            goto Ld5
        L89:
            java.lang.String r0 = r5.getPrefix()
            java.lang.String r1 = r5.mo15446()
            if (r1 == 0) goto Lb5
            if (r0 == 0) goto La7
            Yue.ۥۢۦۢۦ r0 = r4.f19546
            java.lang.String r1 = r5.getPrefix()
            java.lang.String r2 = r5.mo15469()
            java.lang.String r3 = r5.mo15446()
            r0.mo27571(r1, r2, r3)
            goto Lbe
        La7:
            Yue.ۥۢۦۢۦ r0 = r4.f19546
            java.lang.String r1 = r5.mo15446()
            java.lang.String r2 = r5.mo15469()
            r0.mo27572(r1, r2)
            goto Lbe
        Lb5:
            Yue.ۥۢۦۢۦ r0 = r4.f19546
            java.lang.String r1 = r5.mo15469()
            r0.mo27575(r1)
        Lbe:
            r0 = 0
        Lbf:
            int r1 = r5.mo15466()
            if (r0 >= r1) goto Ld5
            Yue.ۥۢۦۢۦ r1 = r4.f19546
            java.lang.String r2 = r5.mo15458(r0)
            java.lang.String r3 = r5.mo15471(r0)
            r1.mo27550(r2, r3)
            int r0 = r0 + 1
            goto Lbf
        Ld5:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public Yue.InterfaceC7162 m19668(Yue.InterfaceC7160 r2) throws Yue.C7158 {
            r1 = this;
        L0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Ld
            r1.mo19667(r2)
            r2.next()
            goto L0
        Ld:
            Yue.ۥۢۦۢۦ r2 = r1.f19546
            r2.flush()
            Yue.ۥۢۦۢۦ r2 = r1.f19546
            return r2
    }
}

package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1721 extends Yue.AbstractC1710 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.String f5379;

    public C1721() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.AbstractC1710
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof Yue.C1721
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            boolean r1 = super.equals(r4)
            if (r1 != 0) goto L11
            return r2
        L11:
            Yue.ۥ۟ۨۢۡ r4 = (Yue.C1721) r4
            java.lang.String r1 = r3.f5379
            if (r1 != 0) goto L1c
            java.lang.String r4 = r4.f5379
            if (r4 == 0) goto L25
            return r2
        L1c:
            java.lang.String r4 = r4.f5379
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L25
            return r2
        L25:
            return r0
    }

    @Override // Yue.AbstractC1710, Yue.InterfaceC1716
    /* JADX INFO: renamed from: ۥ */
    public void mo8116(java.io.PrintWriter r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "PUBLIC \""
            r3.print(r0)
            java.lang.String r0 = r2.f5379
            r3.print(r0)
            java.lang.String r0 = "\""
            r3.print(r0)
            java.lang.String r1 = r2.f5366
            if (r1 == 0) goto L20
            java.lang.String r1 = " \""
            r3.print(r1)
            java.lang.String r1 = r2.f5366
            r3.print(r1)
            r3.print(r0)
        L20:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.String m8223() {
            r1 = this;
            java.lang.String r0 = r1.f5379
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m8224(java.lang.String r1) {
            r0 = this;
            r0.f5379 = r1
            return
    }
}

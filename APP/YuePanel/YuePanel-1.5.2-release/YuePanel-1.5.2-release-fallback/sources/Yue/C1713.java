package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1713 extends Yue.AbstractC1711 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.String f5368;

    public C1713() {
            r0 = this;
            r0.<init>()
            return
    }

    public C1713(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f5368 = r1
            return
    }

    @Override // Yue.AbstractC1711
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof Yue.C1713
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            boolean r1 = super.equals(r4)
            if (r1 != 0) goto L11
            return r2
        L11:
            Yue.ۥ۟ۨۡۤ r4 = (Yue.C1713) r4
            java.lang.String r1 = r3.f5368
            if (r1 != 0) goto L1c
            java.lang.String r4 = r4.f5368
            if (r4 == 0) goto L25
            return r2
        L1c:
            java.lang.String r4 = r4.f5368
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L25
            return r2
        L25:
            return r0
    }

    @Override // Yue.AbstractC1711, Yue.InterfaceC1716
    /* JADX INFO: renamed from: ۥ */
    public void mo8116(java.io.PrintWriter r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = r1.f5368
            r2.print(r0)
            Yue.ۥ۟ۨ۠ۢ r0 = r1.f5367
            r0.mo8116(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.String m8183() {
            r1 = this;
            java.lang.String r0 = r1.f5368
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m8184(java.lang.String r1) {
            r0 = this;
            r0.f5368 = r1
            return
    }
}

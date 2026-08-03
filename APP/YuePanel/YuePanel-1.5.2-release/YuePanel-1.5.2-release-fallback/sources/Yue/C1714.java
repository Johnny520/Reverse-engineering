package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1714 implements Yue.InterfaceC1716 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.String f5369;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.AbstractC1710 f5370;

    public C1714() {
            r0 = this;
            r0.<init>()
            return
    }

    public C1714(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f5369 = r1
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof Yue.C1714
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥ۟ۨۡۥ r5 = (Yue.C1714) r5
            java.lang.String r1 = r4.f5369
            if (r1 != 0) goto L15
            java.lang.String r1 = r5.f5369
            if (r1 == 0) goto L1e
            return r2
        L15:
            java.lang.String r3 = r5.f5369
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            Yue.ۥ۟ۨۡۡ r1 = r4.f5370
            if (r1 != 0) goto L27
            Yue.ۥ۟ۨۡۡ r5 = r5.f5370
            if (r5 == 0) goto L30
            return r2
        L27:
            Yue.ۥ۟ۨۡۡ r5 = r5.f5370
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L30
            return r2
        L30:
            return r0
    }

    @Override // Yue.InterfaceC1716
    /* JADX INFO: renamed from: ۥ */
    public void mo8116(java.io.PrintWriter r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "<!NOTATION "
            r2.print(r0)
            java.lang.String r0 = r1.f5369
            r2.print(r0)
            java.lang.String r0 = " "
            r2.print(r0)
            Yue.ۥ۟ۨۡۡ r0 = r1.f5370
            r0.mo8116(r2)
            java.lang.String r0 = ">"
            r2.println(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.AbstractC1710 m8185() {
            r1 = this;
            Yue.ۥ۟ۨۡۡ r0 = r1.f5370
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.lang.String m8186() {
            r1 = this;
            java.lang.String r0 = r1.f5369
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m8187(Yue.AbstractC1710 r1) {
            r0 = this;
            r0.f5370 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m8188(java.lang.String r1) {
            r0 = this;
            r0.f5369 = r1
            return
    }
}

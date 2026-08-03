package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1710 implements Yue.InterfaceC1716 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.String f5366;

    public AbstractC1710() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof Yue.AbstractC1710
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥ۟ۨۡۡ r4 = (Yue.AbstractC1710) r4
            java.lang.String r1 = r3.f5366
            if (r1 != 0) goto L15
            java.lang.String r4 = r4.f5366
            if (r4 == 0) goto L1e
            return r2
        L15:
            java.lang.String r4 = r4.f5366
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L1e
            return r2
        L1e:
            return r0
    }

    @Override // Yue.InterfaceC1716
    /* JADX INFO: renamed from: ۥ */
    public abstract void mo8116(java.io.PrintWriter r1) throws java.io.IOException;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.String m8179() {
            r1 = this;
            java.lang.String r0 = r1.f5366
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m8180(java.lang.String r1) {
            r0 = this;
            r0.f5366 = r1
            return
    }
}

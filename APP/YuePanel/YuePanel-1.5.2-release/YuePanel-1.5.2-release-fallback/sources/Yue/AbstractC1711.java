package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1711 implements Yue.InterfaceC1716 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.C1700 f5367;

    public AbstractC1711() {
            r1 = this;
            r1.<init>()
            Yue.ۥ۟ۨ۠ۢ r0 = Yue.C1700.f5339
            r1.f5367 = r0
            return
    }

    public AbstractC1711(Yue.C1700 r1) {
            r0 = this;
            r0.<init>()
            r0.f5367 = r1
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof Yue.AbstractC1711
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥ۟ۨۡۢ r4 = (Yue.AbstractC1711) r4
            Yue.ۥ۟ۨ۠ۢ r1 = r3.f5367
            if (r1 != 0) goto L15
            Yue.ۥ۟ۨ۠ۢ r4 = r4.f5367
            if (r4 == 0) goto L1e
            return r2
        L15:
            Yue.ۥ۟ۨ۠ۢ r4 = r4.f5367
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
    public Yue.C1700 m8181() {
            r1 = this;
            Yue.ۥ۟ۨ۠ۢ r0 = r1.f5367
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m8182(Yue.C1700 r1) {
            r0 = this;
            r0.f5367 = r1
            return
    }
}

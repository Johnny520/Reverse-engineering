package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1722 extends Yue.AbstractC1703 {
    public C1722() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.AbstractC1703, Yue.AbstractC1711
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof Yue.C1722
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            boolean r2 = super.equals(r2)
            return r2
    }

    @Override // Yue.AbstractC1703, Yue.AbstractC1711, Yue.InterfaceC1716
    /* JADX INFO: renamed from: ۥ */
    public void mo8116(java.io.PrintWriter r4) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "("
            r4.print(r0)
            java.util.Vector r0 = r3.m8142()
            java.util.Enumeration r0 = r0.elements()
            r1 = 1
        Le:
            boolean r2 = r0.hasMoreElements()
            if (r2 == 0) goto L26
            if (r1 != 0) goto L1b
            java.lang.String r1 = ","
            r4.print(r1)
        L1b:
            java.lang.Object r1 = r0.nextElement()
            Yue.ۥ۟ۨۡۢ r1 = (Yue.AbstractC1711) r1
            r1.mo8116(r4)
            r1 = 0
            goto Le
        L26:
            java.lang.String r0 = ")"
            r4.print(r0)
            Yue.ۥ۟ۨ۠ۢ r0 = r3.f5367
            r0.mo8116(r4)
            return
    }
}

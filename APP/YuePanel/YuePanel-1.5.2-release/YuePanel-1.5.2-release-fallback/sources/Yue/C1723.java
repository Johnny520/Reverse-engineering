package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1723 extends Yue.AbstractC1710 {
    public C1723() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.AbstractC1710
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof Yue.C1723
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            boolean r2 = super.equals(r2)
            return r2
    }

    @Override // Yue.AbstractC1710, Yue.InterfaceC1716
    /* JADX INFO: renamed from: ۥ */
    public void mo8116(java.io.PrintWriter r2) {
            r1 = this;
            java.lang.String r0 = r1.f5366
            if (r0 == 0) goto L13
            java.lang.String r0 = "SYSTEM \""
            r2.print(r0)
            java.lang.String r0 = r1.f5366
            r2.print(r0)
            java.lang.String r0 = "\""
            r2.print(r0)
        L13:
            return
    }
}

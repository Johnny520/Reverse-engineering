package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1702 implements Yue.InterfaceC1716 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.String f5345;

    public C1702() {
            r0 = this;
            r0.<init>()
            return
    }

    public C1702(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f5345 = r1
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof Yue.C1702
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥ۟ۨ۠ۤ r5 = (Yue.C1702) r5
            java.lang.String r1 = r4.f5345
            if (r1 != 0) goto L15
            java.lang.String r3 = r5.f5345
            if (r3 == 0) goto L15
            return r2
        L15:
            if (r1 == 0) goto L20
            java.lang.String r5 = r5.f5345
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L20
            return r2
        L20:
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f5345
            return r0
    }

    @Override // Yue.InterfaceC1716
    /* JADX INFO: renamed from: ۥ */
    public void mo8116(java.io.PrintWriter r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "<!--"
            r2.print(r0)
            java.lang.String r0 = r1.f5345
            r2.print(r0)
            java.lang.String r0 = "-->"
            r2.println(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.String m8136() {
            r1 = this;
            java.lang.String r0 = r1.f5345
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m8137(java.lang.String r1) {
            r0 = this;
            r0.f5345 = r1
            return
    }
}

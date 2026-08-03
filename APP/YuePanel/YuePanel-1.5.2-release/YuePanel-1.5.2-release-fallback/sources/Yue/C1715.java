package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1715 implements Yue.InterfaceC1716 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.util.Vector f5371;

    public C1715() {
            r1 = this;
            r1.<init>()
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1.f5371 = r0
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof Yue.C1715
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            Yue.ۥ۟ۨۡۦ r2 = (Yue.C1715) r2
            java.util.Vector r0 = r1.f5371
            java.util.Vector r2 = r2.f5371
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // Yue.InterfaceC1716
    /* JADX INFO: renamed from: ۥ */
    public void mo8116(java.io.PrintWriter r4) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "NOTATION ( "
            r4.print(r0)
            java.util.Vector r0 = r3.m8193()
            java.util.Enumeration r0 = r0.elements()
            r1 = 1
        Le:
            boolean r2 = r0.hasMoreElements()
            if (r2 == 0) goto L24
            if (r1 != 0) goto L1b
            java.lang.String r1 = " | "
            r4.print(r1)
        L1b:
            java.lang.Object r1 = r0.nextElement()
            r4.print(r1)
            r1 = 0
            goto Le
        L24:
            java.lang.String r0 = ")"
            r4.print(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m8189(java.lang.String r2) {
            r1 = this;
            java.util.Vector r0 = r1.f5371
            r0.addElement(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.lang.String m8190(int r2) {
            r1 = this;
            java.util.Vector r0 = r1.f5371
            java.lang.Object r2 = r0.elementAt(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.String[] m8191() {
            r1 = this;
            java.lang.String[] r0 = r1.m8192()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.lang.String[] m8192() {
            r2 = this;
            java.util.Vector r0 = r2.f5371
            int r0 = r0.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.util.Vector r1 = r2.f5371
            r1.copyInto(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.util.Vector m8193() {
            r1 = this;
            java.util.Vector r0 = r1.f5371
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m8194(java.lang.String r2) {
            r1 = this;
            java.util.Vector r0 = r1.f5371
            r0.removeElement(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m8195(java.lang.String r2, int r3) {
            r1 = this;
            java.util.Vector r0 = r1.f5371
            r0.setElementAt(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m8196(java.lang.String[] r4) {
            r3 = this;
            java.util.Vector r0 = new java.util.Vector
            int r1 = r4.length
            r0.<init>(r1)
            r3.f5371 = r0
            r0 = 0
        L9:
            int r1 = r4.length
            if (r0 >= r1) goto L16
            java.util.Vector r1 = r3.f5371
            r2 = r4[r0]
            r1.addElement(r2)
            int r0 = r0 + 1
            goto L9
        L16:
            return
    }
}

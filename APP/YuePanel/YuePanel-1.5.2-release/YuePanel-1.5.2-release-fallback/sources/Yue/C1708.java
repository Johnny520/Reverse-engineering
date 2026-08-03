package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1708 implements Yue.InterfaceC1716 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.util.Vector f5362;

    public C1708() {
            r1 = this;
            r1.<init>()
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1.f5362 = r0
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof Yue.C1708
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            Yue.ۥ۟ۨۡ۟ r2 = (Yue.C1708) r2
            java.util.Vector r0 = r1.f5362
            java.util.Vector r2 = r2.f5362
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // Yue.InterfaceC1716
    /* JADX INFO: renamed from: ۥ */
    public void mo8116(java.io.PrintWriter r4) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "( "
            r4.print(r0)
            java.util.Vector r0 = r3.m8169()
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
    public void m8165(java.lang.String r2) {
            r1 = this;
            java.util.Vector r0 = r1.f5362
            r0.addElement(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.lang.String m8166(int r2) {
            r1 = this;
            java.util.Vector r0 = r1.f5362
            java.lang.Object r2 = r0.elementAt(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.String[] m8167() {
            r1 = this;
            java.lang.String[] r0 = r1.m8168()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.lang.String[] m8168() {
            r2 = this;
            java.util.Vector r0 = r2.f5362
            int r0 = r0.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.util.Vector r1 = r2.f5362
            r1.copyInto(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.util.Vector m8169() {
            r1 = this;
            java.util.Vector r0 = r1.f5362
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m8170(java.lang.String r2) {
            r1 = this;
            java.util.Vector r0 = r1.f5362
            r0.removeElement(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m8171(java.lang.String r2, int r3) {
            r1 = this;
            java.util.Vector r0 = r1.f5362
            r0.setElementAt(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m8172(java.lang.String[] r4) {
            r3 = this;
            java.util.Vector r0 = new java.util.Vector
            int r1 = r4.length
            r0.<init>(r1)
            r3.f5362 = r0
            r0 = 0
        L9:
            int r1 = r4.length
            if (r0 >= r1) goto L16
            java.util.Vector r1 = r3.f5362
            r2 = r4[r0]
            r1.addElement(r2)
            int r0 = r0 + 1
            goto L9
        L16:
            return
    }
}

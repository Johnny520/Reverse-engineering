package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1698 implements Yue.InterfaceC1716 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.String f5333;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.util.Vector f5334;

    public C1698() {
            r1 = this;
            r1.<init>()
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1.f5334 = r0
            return
    }

    public C1698(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f5333 = r1
            java.util.Vector r1 = new java.util.Vector
            r1.<init>()
            r0.f5334 = r1
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r4 != r3) goto L4
            r4 = 1
            return r4
        L4:
            boolean r0 = r4 instanceof Yue.C1698
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            Yue.ۥ۟ۨ۠۠ r4 = (Yue.C1698) r4
            java.lang.String r0 = r3.f5333
            if (r0 != 0) goto L15
            java.lang.String r2 = r4.f5333
            if (r2 == 0) goto L15
            return r1
        L15:
            if (r0 == 0) goto L20
            java.lang.String r2 = r4.f5333
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L20
            return r1
        L20:
            java.util.Vector r0 = r3.f5334
            java.util.Vector r4 = r4.f5334
            boolean r4 = r0.equals(r4)
            return r4
    }

    @Override // Yue.InterfaceC1716
    /* JADX INFO: renamed from: ۥ */
    public void mo8116(java.io.PrintWriter r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "<!ATTLIST "
            r3.print(r0)
            java.lang.String r0 = r2.f5333
            r3.println(r0)
            java.util.Vector r0 = r2.f5334
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.String r1 = "           "
            r3.print(r1)
            java.lang.Object r1 = r0.next()
            Yue.ۥ۟ۨ۠ۡ r1 = (Yue.C1699) r1
            r1.mo8116(r3)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            r3.println()
            goto L10
        L2e:
            java.lang.String r1 = ">"
            r3.println(r1)
            goto L10
        L34:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C1699 m8122(int r2) {
            r1 = this;
            java.util.Vector r0 = r1.f5334
            java.lang.Object r2 = r0.elementAt(r2)
            Yue.ۥ۟ۨ۠ۡ r2 = (Yue.C1699) r2
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.C1699[] m8123() {
            r2 = this;
            java.util.Vector r0 = r2.f5334
            int r0 = r0.size()
            Yue.ۥ۟ۨ۠ۡ[] r0 = new Yue.C1699[r0]
            java.util.Vector r1 = r2.f5334
            r1.copyInto(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.String m8124() {
            r1 = this;
            java.lang.String r0 = r1.f5333
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m8125(Yue.C1699 r2, int r3) {
            r1 = this;
            java.util.Vector r0 = r1.f5334
            r0.setElementAt(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m8126(Yue.C1699[] r4) {
            r3 = this;
            java.util.Vector r0 = new java.util.Vector
            int r1 = r4.length
            r0.<init>(r1)
            r3.f5334 = r0
            r0 = 0
        L9:
            int r1 = r4.length
            if (r0 >= r1) goto L16
            java.util.Vector r1 = r3.f5334
            r2 = r4[r0]
            r1.addElement(r2)
            int r0 = r0 + 1
            goto L9
        L16:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m8127(java.lang.String r1) {
            r0 = this;
            r0.f5333 = r1
            return
    }
}

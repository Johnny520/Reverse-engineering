package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1696 implements Yue.InterfaceC1716 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.util.Hashtable f5327;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.util.Hashtable f5328;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.util.Hashtable f5329;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.util.Hashtable f5330;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.util.Vector f5331;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Yue.C1705 f5332;

    public C1696() {
            r1 = this;
            r1.<init>()
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r1.f5327 = r0
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r1.f5328 = r0
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r1.f5329 = r0
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r1.f5330 = r0
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1.f5331 = r0
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof Yue.C1696
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            Yue.ۥ۟ۨ۠ r2 = (Yue.C1696) r2
            java.util.Vector r0 = r1.f5331
            java.util.Vector r2 = r2.f5331
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // Yue.InterfaceC1716
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void mo8116(java.io.PrintWriter r3) throws java.io.IOException {
            r2 = this;
            java.util.Vector r0 = r2.f5331
            java.util.Enumeration r0 = r0.elements()
        L6:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.nextElement()
            Yue.ۥ۟ۨۡۧ r1 = (Yue.InterfaceC1716) r1
            r1.mo8116(r3)
            goto L6
        L16:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.Object m8117(int r2) {
            r1 = this;
            java.util.Vector r0 = r1.f5331
            java.lang.Object r2 = r0.elementAt(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.lang.Object[] m8118() {
            r1 = this;
            java.util.Vector r0 = r1.f5331
            java.lang.Object[] r0 = r0.toArray()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.util.Vector m8119(java.lang.Class r5) {
            r4 = this;
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            java.util.Vector r1 = r4.f5331
            java.util.Enumeration r1 = r1.elements()
        Lb:
            boolean r2 = r1.hasMoreElements()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.nextElement()
            java.lang.Class r3 = r2.getClass()
            boolean r3 = r5.isAssignableFrom(r3)
            if (r3 == 0) goto Lb
            r0.addElement(r2)
            goto Lb
        L23:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m8120(java.lang.Object r2, int r3) {
            r1 = this;
            java.util.Vector r0 = r1.f5331
            r0.setElementAt(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m8121(java.lang.Object[] r4) {
            r3 = this;
            java.util.Vector r0 = new java.util.Vector
            int r1 = r4.length
            r0.<init>(r1)
            r3.f5331 = r0
            r0 = 0
        L9:
            int r1 = r4.length
            if (r0 >= r1) goto L16
            java.util.Vector r1 = r3.f5331
            r2 = r4[r0]
            r1.addElement(r2)
            int r0 = r0 + 1
            goto L9
        L16:
            return
    }
}

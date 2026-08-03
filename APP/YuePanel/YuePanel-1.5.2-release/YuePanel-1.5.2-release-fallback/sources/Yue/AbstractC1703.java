package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1703 extends Yue.AbstractC1711 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.util.Vector f5346;

    public AbstractC1703() {
            r1 = this;
            r1.<init>()
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1.f5346 = r0
            return
    }

    @Override // Yue.AbstractC1711
    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r3 instanceof Yue.AbstractC1703
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            boolean r0 = super.equals(r3)
            if (r0 != 0) goto L11
            return r1
        L11:
            Yue.ۥ۟ۨ۠ۥ r3 = (Yue.AbstractC1703) r3
            java.util.Vector r0 = r2.f5346
            java.util.Vector r3 = r3.f5346
            boolean r3 = r0.equals(r3)
            return r3
    }

    @Override // Yue.AbstractC1711, Yue.InterfaceC1716
    /* JADX INFO: renamed from: ۥ */
    public abstract void mo8116(java.io.PrintWriter r1) throws java.io.IOException;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m8138(Yue.AbstractC1711 r2) {
            r1 = this;
            java.util.Vector r0 = r1.f5346
            r0.addElement(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Yue.AbstractC1711 m8139(int r2) {
            r1 = this;
            java.util.Vector r0 = r1.f5346
            java.lang.Object r2 = r0.elementAt(r2)
            Yue.ۥ۟ۨۡۢ r2 = (Yue.AbstractC1711) r2
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Yue.AbstractC1711[] m8140() {
            r2 = this;
            java.util.Vector r0 = r2.f5346
            int r0 = r0.size()
            Yue.ۥ۟ۨۡۢ[] r0 = new Yue.AbstractC1711[r0]
            java.util.Vector r1 = r2.f5346
            r1.copyInto(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Yue.AbstractC1711[] m8141() {
            r2 = this;
            java.util.Vector r0 = r2.f5346
            int r0 = r0.size()
            Yue.ۥ۟ۨۡۢ[] r0 = new Yue.AbstractC1711[r0]
            java.util.Vector r1 = r2.f5346
            r1.copyInto(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public java.util.Vector m8142() {
            r1 = this;
            java.util.Vector r0 = r1.f5346
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m8143(Yue.AbstractC1711 r2) {
            r1 = this;
            java.util.Vector r0 = r1.f5346
            r0.removeElement(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m8144(Yue.AbstractC1711 r2, int r3) {
            r1 = this;
            java.util.Vector r0 = r1.f5346
            r0.setElementAt(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m8145(Yue.AbstractC1711[] r4) {
            r3 = this;
            java.util.Vector r0 = new java.util.Vector
            int r1 = r4.length
            r0.<init>(r1)
            r3.f5346 = r0
            r0 = 0
        L9:
            int r1 = r4.length
            if (r0 >= r1) goto L16
            java.util.Vector r1 = r3.f5346
            r2 = r4[r0]
            r1.addElement(r2)
            int r0 = r0 + 1
            goto L9
        L16:
            return
    }
}

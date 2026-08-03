package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1960 implements java.util.Iterator<java.lang.Double>, Yue.InterfaceC3443 {
    public AbstractC1960() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Double next() {
            r2 = this;
            double r0 = r2.mo2004()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Double m9063() {
            r2 = this;
            double r0 = r2.mo2004()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract double mo2004();
}

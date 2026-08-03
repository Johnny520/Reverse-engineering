package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3820 implements java.util.Iterator<java.lang.Long>, Yue.InterfaceC3443 {
    public AbstractC3820() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Long next() {
            r2 = this;
            long r0 = r2.mo2037()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
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
    public final java.lang.Long m15287() {
            r2 = this;
            long r0 = r2.mo2037()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract long mo2037();
}

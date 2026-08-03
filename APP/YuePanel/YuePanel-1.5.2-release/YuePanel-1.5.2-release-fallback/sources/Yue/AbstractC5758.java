package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5758 implements java.util.Iterator<java.lang.Short>, Yue.InterfaceC3443 {
    public AbstractC5758() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Short next() {
            r1 = this;
            short r0 = r1.mo2096()
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
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
    public final java.lang.Short m21496() {
            r1 = this;
            short r0 = r1.mo2096()
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract short mo2096();
}

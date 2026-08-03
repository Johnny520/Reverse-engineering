package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2455 implements java.util.Iterator<java.lang.Float>, Yue.InterfaceC3443 {
    public AbstractC2455() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Float next() {
            r1 = this;
            float r0 = r1.mo2005()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
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
    public final java.lang.Float m11430() {
            r1 = this;
            float r0 = r1.mo2005()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract float mo2005();
}

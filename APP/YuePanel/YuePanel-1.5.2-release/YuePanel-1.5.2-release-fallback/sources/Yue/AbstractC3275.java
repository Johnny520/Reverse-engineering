package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۣۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3275 implements java.util.Iterator<java.lang.Integer>, Yue.InterfaceC3443 {
    public AbstractC3275() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Integer next() {
            r1 = this;
            int r0 = r1.mo2006()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
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
    public final java.lang.Integer m13736() {
            r1 = this;
            int r0 = r1.mo2006()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract int mo2006();
}

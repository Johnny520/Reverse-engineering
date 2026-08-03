package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0799 implements java.util.Iterator<java.lang.Boolean>, Yue.InterfaceC3443 {
    public AbstractC0799() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Boolean next() {
            r1 = this;
            boolean r0 = r1.mo1954()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
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
    public final java.lang.Boolean m4738() {
            r1 = this;
            boolean r0 = r1.mo1954()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract boolean mo1954();
}

package a;

/* JADX INFO: renamed from: a.c9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0085c9 implements java.util.Iterator<java.lang.Integer>, a.InterfaceC0336q9 {
    public AbstractC0085c9() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract int a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Integer next() {
            r1 = this;
            int r0 = r1.a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}

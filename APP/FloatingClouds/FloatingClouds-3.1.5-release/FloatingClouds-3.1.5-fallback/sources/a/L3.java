package a;

/* JADX INFO: loaded from: classes.dex */
public final class L3<T> implements a.Pd<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference<a.Pd<T>> f160a;

    public L3(a.Pd<? extends T> r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r2)
            r1.f160a = r0
            return
    }

    @Override // a.Pd
    public final java.util.Iterator<T> iterator() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<a.Pd<T>> r0 = r2.f160a
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            a.Pd r0 = (a.Pd) r0
            if (r0 == 0) goto L10
            java.util.Iterator r0 = r0.iterator()
            return r0
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This sequence can be consumed only once."
            r0.<init>(r1)
            throw r0
    }
}

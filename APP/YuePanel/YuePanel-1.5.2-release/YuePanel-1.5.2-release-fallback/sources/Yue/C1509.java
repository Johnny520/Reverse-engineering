package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1509<T> implements Yue.InterfaceC5609<T> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.concurrent.atomic.AtomicReference<Yue.InterfaceC5609<T>> f4729;

    public C1509(@Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "sequence"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r2)
            r1.f4729 = r0
            return
    }

    @Override // Yue.InterfaceC5609
    @Yue.InterfaceC4418
    public java.util.Iterator<T> iterator() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<Yue.ۥۡۨۢ<T>> r0 = r2.f4729
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            Yue.ۥۡۨۢ r0 = (Yue.InterfaceC5609) r0
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

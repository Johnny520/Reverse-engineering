package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0352<T> extends java.util.concurrent.atomic.AtomicBoolean implements Yue.InterfaceC1535<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC1598<T> f852;

    public C0352(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.f852 = r2
            return
    }

    @Override // Yue.InterfaceC1535
    public void accept(T r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L13
            Yue.ۥ۟ۧۤۢ<T> r0 = r2.f852
            Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029
            java.lang.Object r3 = Yue.C5388.m20377(r3)
            r0.resumeWith(r3)
        L13:
            return
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ContinuationConsumer(resultAccepted = "
            r0.append(r1)
            boolean r1 = r2.get()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

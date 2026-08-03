package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0084 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ boolean m471(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
        L0:
            boolean r0 = r1.compareAndSet(r2, r3, r4)
            if (r0 == 0) goto L8
            r1 = 1
            return r1
        L8:
            java.lang.Object r0 = r1.get(r2)
            if (r0 == r3) goto L0
            r1 = 0
            return r1
    }
}

package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends qg.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f11055c = null;
    private volatile /* synthetic */ int _resumed$volatile;

    static {
            java.lang.Class<qg.h> r0 = qg.h.class
            java.lang.String r1 = "_resumed$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            qg.h.f11055c = r0
            return
    }

    public h(qg.g r3, java.lang.Throwable r4, boolean r5) {
            r2 = this;
            if (r4 != 0) goto L1a
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Continuation "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L1a:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed$volatile = r3
            return
    }
}

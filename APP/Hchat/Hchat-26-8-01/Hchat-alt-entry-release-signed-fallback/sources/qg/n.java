package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f11081b = null;
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Throwable f11082a;

    static {
            java.lang.Class<qg.n> r0 = qg.n.class
            java.lang.String r1 = "_handled$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            qg.n.f11081b = r0
            return
    }

    public n(java.lang.Throwable r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f11082a = r1
            r0._handled$volatile = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 91
            r0.append(r1)
            java.lang.Throwable r1 = r2.f11082a
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

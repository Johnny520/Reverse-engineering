package o5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o5.a f9510a = null;

    static {
            o5.a r0 = new o5.a
            r0.<init>()
            o5.e.f9510a = r0
            return
    }

    public static java.util.Set a(k5.u r2, int r3) {
            if (r3 == 0) goto Le
            androidx.lifecycle.x r0 = r2.f7264b
            int r0 = r0.N(r3)
            o5.b r1 = new o5.b
            r1.<init>(r2, r3, r0)
            return r1
        Le:
            java.util.Set r2 = java.util.Collections.EMPTY_SET
            return r2
    }

    public abstract java.util.Set b();

    public abstract o5.c c();

    public abstract o5.c d();

    public abstract o5.c e();
}

package vg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f14324a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f14325b = null;
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ java.lang.Object _prev$volatile;

    static {
            java.lang.String r0 = "_next$volatile"
            java.lang.Class<vg.b> r1 = vg.b.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            vg.b.f14324a = r0
            java.lang.String r0 = "_prev$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            vg.b.f14325b = r0
            return
    }

    public b(vg.q r1) {
            r0 = this;
            r0.<init>()
            r0._prev$volatile = r1
            return
    }

    public final void a() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = vg.b.f14325b
            r1 = 0
            r0.set(r2, r1)
            return
    }

    public final vg.b b() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = vg.b.f14324a
            java.lang.Object r0 = r0.get(r2)
            l3.q r1 = vg.a.f14317a
            if (r0 != r1) goto Lc
            r0 = 0
            return r0
        Lc:
            vg.b r0 = (vg.b) r0
            return r0
    }

    public abstract boolean c();

    public final void d() {
            r6 = this;
            vg.b r0 = r6.b()
            if (r0 != 0) goto L7
            return
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = vg.b.f14325b
            java.lang.Object r1 = r0.get(r6)
            vg.b r1 = (vg.b) r1
        Lf:
            if (r1 == 0) goto L1e
            boolean r2 = r1.c()
            if (r2 == 0) goto L1e
            java.lang.Object r1 = r0.get(r1)
            vg.b r1 = (vg.b) r1
            goto Lf
        L1e:
            vg.b r2 = r6.b()
            r2.getClass()
        L25:
            boolean r3 = r2.c()
            if (r3 == 0) goto L34
            vg.b r3 = r2.b()
            if (r3 != 0) goto L32
            goto L34
        L32:
            r2 = r3
            goto L25
        L34:
            java.lang.Object r3 = r0.get(r2)
            r4 = r3
            vg.b r4 = (vg.b) r4
            if (r4 != 0) goto L3f
            r4 = 0
            goto L40
        L3f:
            r4 = r1
        L40:
            boolean r5 = r0.compareAndSet(r2, r3, r4)
            if (r5 == 0) goto L62
            if (r1 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = vg.b.f14324a
            r0.set(r1, r2)
        L4d:
            boolean r0 = r2.c()
            if (r0 == 0) goto L59
            vg.b r0 = r2.b()
            if (r0 != 0) goto L7
        L59:
            if (r1 == 0) goto L61
            boolean r0 = r1.c()
            if (r0 != 0) goto L7
        L61:
            return
        L62:
            java.lang.Object r5 = r0.get(r2)
            if (r5 == r3) goto L40
            goto L34
    }
}

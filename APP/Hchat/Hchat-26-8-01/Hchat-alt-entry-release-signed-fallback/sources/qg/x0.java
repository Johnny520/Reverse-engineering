package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements qg.o0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f11120h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f11121i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f11122j = null;
    private volatile /* synthetic */ java.lang.Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile;
    private volatile /* synthetic */ java.lang.Object _rootCause$volatile;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qg.a1 f11123g;

    static {
            java.lang.String r0 = "_isCompleting$volatile"
            java.lang.Class<qg.x0> r1 = qg.x0.class
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            qg.x0.f11120h = r0
            java.lang.String r0 = "_rootCause$volatile"
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            qg.x0.f11121i = r0
            java.lang.String r0 = "_exceptionsHolder$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            qg.x0.f11122j = r0
            return
    }

    public x0(qg.a1 r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>()
            r0.f11123g = r1
            r1 = 0
            r0._isCompleting$volatile = r1
            r0._rootCause$volatile = r2
            return
    }

    public final void a(java.lang.Throwable r5) {
            r4 = this;
            java.lang.Throwable r0 = r4.c()
            if (r0 != 0) goto Lc
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.x0.f11121i
            r0.set(r4, r5)
            return
        Lc:
            if (r5 != r0) goto Lf
            goto L21
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.x0.f11122j
            java.lang.Object r1 = r0.get(r4)
            if (r1 != 0) goto L1b
            r0.set(r4, r5)
            return
        L1b:
            boolean r2 = r1 instanceof java.lang.Throwable
            if (r2 == 0) goto L32
            if (r5 != r1) goto L22
        L21:
            return
        L22:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 4
            r2.<init>(r3)
            r2.add(r1)
            r2.add(r5)
            r0.set(r4, r2)
            return
        L32:
            boolean r0 = r1 instanceof java.util.ArrayList
            if (r0 == 0) goto L3c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r5)
            return
        L3c:
            java.lang.String r5 = "State is "
            okio.a.p(r1, r5)
            return
    }

    @Override // qg.o0
    public final boolean b() {
            r1 = this;
            java.lang.Throwable r0 = r1.c()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final java.lang.Throwable c() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.x0.f11121i
            java.lang.Object r0 = r0.get(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
    }

    @Override // qg.o0
    public final qg.a1 d() {
            r1 = this;
            qg.a1 r0 = r1.f11123g
            return r0
    }

    public final boolean e() {
            r1 = this;
            java.lang.Throwable r0 = r1.c()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final java.util.ArrayList f(java.lang.Throwable r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.x0.f11122j
            java.lang.Object r1 = r0.get(r4)
            r2 = 4
            if (r1 != 0) goto Lf
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            goto L23
        Lf:
            boolean r3 = r1 instanceof java.lang.Throwable
            if (r3 == 0) goto L1d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r3.add(r1)
            r1 = r3
            goto L23
        L1d:
            boolean r2 = r1 instanceof java.util.ArrayList
            if (r2 == 0) goto L3e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
        L23:
            java.lang.Throwable r2 = r4.c()
            if (r2 == 0) goto L2d
            r3 = 0
            r1.add(r3, r2)
        L2d:
            if (r5 == 0) goto L38
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L38
            r1.add(r5)
        L38:
            l3.q r5 = qg.v.f11109h
            r0.set(r4, r5)
            return r1
        L3e:
            java.lang.String r5 = "State is "
            okio.a.p(r1, r5)
            r5 = 0
            return r5
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Finishing[cancelling="
            r0.<init>(r1)
            boolean r1 = r2.e()
            r0.append(r1)
            java.lang.String r1 = ", completing="
            r0.append(r1)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = qg.x0.f11120h
            int r1 = r1.get(r2)
            if (r1 == 0) goto L1d
            r1 = 1
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r0.append(r1)
            java.lang.String r1 = ", rootCause="
            r0.append(r1)
            java.lang.Throwable r1 = r2.c()
            r0.append(r1)
            java.lang.String r1 = ", exceptions="
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = qg.x0.f11122j
            java.lang.Object r1 = r1.get(r2)
            r0.append(r1)
            java.lang.String r1 = ", list="
            r0.append(r1)
            qg.a1 r1 = r2.f11123g
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

package vg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f14341g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f14342h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f14343i = null;
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ java.lang.Object _prev$volatile;
    private volatile /* synthetic */ java.lang.Object _removedRef$volatile;

    static {
            java.lang.String r0 = "_next$volatile"
            java.lang.Class<vg.i> r1 = vg.i.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            vg.i.f14341g = r0
            java.lang.String r0 = "_prev$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            vg.i.f14342h = r0
            java.lang.String r0 = "_removedRef$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            vg.i.f14343i = r0
            return
    }

    public i() {
            r0 = this;
            r0.<init>()
            r0._next$volatile = r0
            r0._prev$volatile = r0
            return
    }

    public final boolean e(vg.i r5, int r6) {
            r4 = this;
        L0:
            vg.i r0 = r4.f()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = vg.i.f14342h
            if (r0 != 0) goto L1c
            java.lang.Object r0 = r1.get(r4)
            vg.i r0 = (vg.i) r0
        Le:
            boolean r2 = r0.i()
            if (r2 != 0) goto L15
            goto L1c
        L15:
            java.lang.Object r0 = r1.get(r0)
            vg.i r0 = (vg.i) r0
            goto Le
        L1c:
            boolean r2 = r0 instanceof vg.h
            r3 = 1
            if (r2 == 0) goto L32
            r1 = r0
            vg.h r1 = (vg.h) r1
            int r1 = r1.f14340j
            r1 = r1 & r6
            if (r1 != 0) goto L30
            boolean r5 = r0.e(r5, r6)
            if (r5 == 0) goto L30
            return r3
        L30:
            r5 = 0
            return r5
        L32:
            r1.set(r5, r0)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = vg.i.f14341g
            r1.set(r5, r4)
        L3a:
            boolean r2 = r1.compareAndSet(r0, r4, r5)
            if (r2 == 0) goto L44
            r5.g(r4)
            return r3
        L44:
            java.lang.Object r2 = r1.get(r0)
            if (r2 == r4) goto L3a
            goto L0
    }

    public final vg.i f() {
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = vg.i.f14342h
            java.lang.Object r1 = r0.get(r9)
            vg.i r1 = (vg.i) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = vg.i.f14341g
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            goto L1c
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
        L1c:
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.i()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof vg.n
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            vg.n r6 = (vg.n) r6
            vg.i r6 = r6.f14354a
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            vg.i r3 = (vg.i) r3
            goto Lb
        L4b:
            r6.getClass()
            r4 = r6
            vg.i r4 = (vg.i) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
    }

    public final void g(vg.i r4) {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = vg.i.f14342h
            java.lang.Object r1 = r0.get(r4)
            vg.i r1 = (vg.i) r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = vg.i.f14341g
            java.lang.Object r2 = r2.get(r3)
            if (r2 == r4) goto L11
            goto L20
        L11:
            boolean r2 = r0.compareAndSet(r4, r1, r3)
            if (r2 == 0) goto L21
            boolean r0 = r3.i()
            if (r0 == 0) goto L20
            r4.f()
        L20:
            return
        L21:
            java.lang.Object r2 = r0.get(r4)
            if (r2 == r1) goto L11
            goto L0
    }

    public final vg.i h() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = vg.i.f14341g
            java.lang.Object r0 = r0.get(r2)
            boolean r1 = r0 instanceof vg.n
            if (r1 == 0) goto Le
            r1 = r0
            vg.n r1 = (vg.n) r1
            goto Lf
        Le:
            r1 = 0
        Lf:
            if (r1 == 0) goto L14
            vg.i r0 = r1.f14354a
            return r0
        L14:
            r0.getClass()
            vg.i r0 = (vg.i) r0
            return r0
    }

    public boolean i() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = vg.i.f14341g
            java.lang.Object r0 = r0.get(r1)
            boolean r0 = r0 instanceof vg.n
            return r0
    }

    public java.lang.String toString() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r.l r1 = new r.l
            r2 = 1
            r3 = 1
            java.lang.Class<qg.v> r4 = qg.v.class
            java.lang.String r6 = "classSimpleName"
            java.lang.String r7 = "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;"
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = qg.v.j(r8)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

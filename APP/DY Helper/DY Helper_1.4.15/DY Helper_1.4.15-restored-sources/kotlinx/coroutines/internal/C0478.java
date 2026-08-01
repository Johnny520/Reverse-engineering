package kotlinx.coroutines.internal;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.α */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class C0478 {

    /* JADX INFO: renamed from: ε */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f6063 = null;

    /* JADX INFO: renamed from: ζ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f6064 = null;

    /* JADX INFO: renamed from: η */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f6065 = null;
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ java.lang.Object _prev$volatile;
    private volatile /* synthetic */ java.lang.Object _removedRef$volatile;

    static {
            java.lang.String r0 = "_next$volatile"
            java.lang.Class<kotlinx.coroutines.internal.α> r1 = kotlinx.coroutines.internal.C0478.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.internal.C0478.f6063 = r0
            java.lang.String r0 = "_prev$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.internal.C0478.f6064 = r0
            java.lang.String r0 = "_removedRef$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.internal.C0478.f6065 = r0
            return
    }

    public C0478() {
            r0 = this;
            r0.<init>()
            r0._next$volatile = r0
            r0._prev$volatile = r0
            return
    }

    public java.lang.String toString() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            fv0 r1 = new fv0
            java.lang.String r6 = "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;"
            r2 = 1
            java.lang.Class<yh> r3 = p000.AbstractC1021yh.class
            java.lang.String r5 = "classSimpleName"
            r4 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r0.append(r1)
            r7 = 64
            r0.append(r7)
            java.lang.String r7 = p000.AbstractC1021yh.m6855(r4)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            return r7
    }

    /* JADX INFO: renamed from: ε */
    public final boolean m3387(kotlinx.coroutines.internal.C0478 r5, int r6) {
            r4 = this;
        L0:
            kotlinx.coroutines.internal.α r0 = r4.m3388()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.C0478.f6064
            if (r0 != 0) goto L1c
            java.lang.Object r0 = r1.get(r4)
            kotlinx.coroutines.internal.α r0 = (kotlinx.coroutines.internal.C0478) r0
        Le:
            boolean r2 = r0.mo3391()
            if (r2 != 0) goto L15
            goto L1c
        L15:
            java.lang.Object r0 = r1.get(r0)
            kotlinx.coroutines.internal.α r0 = (kotlinx.coroutines.internal.C0478) r0
            goto Le
        L1c:
            boolean r2 = r0 instanceof p000.au0
            r3 = 1
            if (r2 == 0) goto L32
            r4 = r0
            au0 r4 = (p000.au0) r4
            int r4 = r4.f1307
            r4 = r4 & r6
            if (r4 != 0) goto L30
            boolean r4 = r0.m3387(r5, r6)
            if (r4 == 0) goto L30
            return r3
        L30:
            r4 = 0
            return r4
        L32:
            r1.set(r5, r0)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.C0478.f6063
            r1.set(r5, r4)
        L3a:
            boolean r2 = r1.compareAndSet(r0, r4, r5)
            if (r2 == 0) goto L44
            r5.m3389(r4)
            return r3
        L44:
            java.lang.Object r2 = r1.get(r0)
            if (r2 == r4) goto L3a
            goto L0
    }

    /* JADX INFO: renamed from: ζ */
    public final kotlinx.coroutines.internal.C0478 m3388() {
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.C0478.f6064
            java.lang.Object r1 = r0.get(r9)
            kotlinx.coroutines.internal.α r1 = (kotlinx.coroutines.internal.C0478) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.C0478.f6063
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
            boolean r7 = r9.mo3391()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof p000.gn1
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            gn1 r6 = (p000.gn1) r6
            kotlinx.coroutines.internal.α r6 = r6.f4424
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
            kotlinx.coroutines.internal.α r3 = (kotlinx.coroutines.internal.C0478) r3
            goto Lb
        L4b:
            r6.getClass()
            r4 = r6
            kotlinx.coroutines.internal.α r4 = (kotlinx.coroutines.internal.C0478) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
    }

    /* JADX INFO: renamed from: η */
    public final void m3389(kotlinx.coroutines.internal.C0478 r4) {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.C0478.f6064
            java.lang.Object r1 = r0.get(r4)
            kotlinx.coroutines.internal.α r1 = (kotlinx.coroutines.internal.C0478) r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.C0478.f6063
            java.lang.Object r2 = r2.get(r3)
            if (r2 == r4) goto L11
            goto L20
        L11:
            boolean r2 = r0.compareAndSet(r4, r1, r3)
            if (r2 == 0) goto L21
            boolean r3 = r3.mo3391()
            if (r3 == 0) goto L20
            r4.m3388()
        L20:
            return
        L21:
            java.lang.Object r2 = r0.get(r4)
            if (r2 == r1) goto L11
            goto L0
    }

    /* JADX INFO: renamed from: θ */
    public final kotlinx.coroutines.internal.C0478 m3390() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.C0478.f6063
            java.lang.Object r1 = r0.get(r1)
            boolean r0 = r1 instanceof p000.gn1
            if (r0 == 0) goto Le
            r0 = r1
            gn1 r0 = (p000.gn1) r0
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L14
            kotlinx.coroutines.internal.α r1 = r0.f4424
            return r1
        L14:
            r1.getClass()
            kotlinx.coroutines.internal.α r1 = (kotlinx.coroutines.internal.C0478) r1
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public boolean mo3391() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.C0478.f6063
            java.lang.Object r1 = r0.get(r1)
            boolean r1 = r1 instanceof p000.gn1
            return r1
    }
}

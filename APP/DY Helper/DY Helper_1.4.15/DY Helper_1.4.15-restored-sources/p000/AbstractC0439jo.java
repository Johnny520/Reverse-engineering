package p000;

/* JADX INFO: renamed from: jo */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0439jo {

    /* JADX INFO: renamed from: α */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f5529 = null;

    /* JADX INFO: renamed from: β */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f5530 = null;
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ java.lang.Object _prev$volatile;

    static {
            java.lang.String r0 = "_next$volatile"
            java.lang.Class<jo> r1 = p000.AbstractC0439jo.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            p000.AbstractC0439jo.f5529 = r0
            java.lang.String r0 = "_prev$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            p000.AbstractC0439jo.f5530 = r0
            return
    }

    public AbstractC0439jo(p000.sr1 r1) {
            r0 = this;
            r0.<init>()
            r0._prev$volatile = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m2974() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.AbstractC0439jo.f5530
            r1 = 0
            r0.set(r2, r1)
            return
    }

    /* JADX INFO: renamed from: β */
    public final p000.AbstractC0439jo m2975() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.AbstractC0439jo.f5529
            java.lang.Object r1 = r0.get(r1)
            uy r0 = p000.AbstractC0073bd.f1648
            if (r1 != r0) goto Lc
            r1 = 0
            return r1
        Lc:
            jo r1 = (p000.AbstractC0439jo) r1
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public abstract boolean mo2976();

    /* JADX INFO: renamed from: δ */
    public final void m2977() {
            r6 = this;
            jo r0 = r6.m2975()
            if (r0 != 0) goto L7
            return
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.AbstractC0439jo.f5530
            java.lang.Object r1 = r0.get(r6)
            jo r1 = (p000.AbstractC0439jo) r1
        Lf:
            if (r1 == 0) goto L1e
            boolean r2 = r1.mo2976()
            if (r2 == 0) goto L1e
            java.lang.Object r1 = r0.get(r1)
            jo r1 = (p000.AbstractC0439jo) r1
            goto Lf
        L1e:
            jo r2 = r6.m2975()
            r2.getClass()
        L25:
            boolean r3 = r2.mo2976()
            if (r3 == 0) goto L34
            jo r3 = r2.m2975()
            if (r3 != 0) goto L32
            goto L34
        L32:
            r2 = r3
            goto L25
        L34:
            java.lang.Object r3 = r0.get(r2)
            r4 = r3
            jo r4 = (p000.AbstractC0439jo) r4
            if (r4 != 0) goto L3f
            r4 = 0
            goto L40
        L3f:
            r4 = r1
        L40:
            boolean r5 = r0.compareAndSet(r2, r3, r4)
            if (r5 == 0) goto L62
            if (r1 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.AbstractC0439jo.f5529
            r0.set(r1, r2)
        L4d:
            boolean r0 = r2.mo2976()
            if (r0 == 0) goto L59
            jo r0 = r2.m2975()
            if (r0 != 0) goto L7
        L59:
            if (r1 == 0) goto L61
            boolean r0 = r1.mo2976()
            if (r0 != 0) goto L7
        L61:
            return
        L62:
            java.lang.Object r5 = r0.get(r2)
            if (r5 == r3) goto L40
            goto L34
    }
}

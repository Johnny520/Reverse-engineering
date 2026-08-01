package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class vp1 implements p000.oq0, java.io.Serializable {

    /* JADX INFO: renamed from: η */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f11359 = null;

    /* JADX INFO: renamed from: ε */
    public volatile p000.p70 f11360;

    /* JADX INFO: renamed from: ζ */
    public volatile java.lang.Object f11361;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "ζ"
            java.lang.Class<vp1> r2 = p000.vp1.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            p000.vp1.f11359 = r0
            return
    }

    @Override // p000.oq0
    public final java.lang.Object getValue() {
            r4 = this;
            java.lang.Object r0 = r4.f11361
            xn0 r1 = p000.xn0.f12222
            if (r0 == r1) goto L7
            return r0
        L7:
            p70 r0 = r4.f11360
            if (r0 == 0) goto L21
            java.lang.Object r0 = r0.invoke()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p000.vp1.f11359
        L11:
            boolean r3 = r2.compareAndSet(r4, r1, r0)
            if (r3 == 0) goto L1b
            r1 = 0
            r4.f11360 = r1
            return r0
        L1b:
            java.lang.Object r3 = r2.get(r4)
            if (r3 == r1) goto L11
        L21:
            java.lang.Object r4 = r4.f11361
            return r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.Object r0 = r2.f11361
            xn0 r1 = p000.xn0.f12222
            if (r0 == r1) goto Lf
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            return r2
        Lf:
            java.lang.String r2 = "Lazy value not initialized yet."
            return r2
    }
}

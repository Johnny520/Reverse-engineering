package sf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements sf.c, java.io.Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f12422i = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile fg.a f12423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile java.lang.Object f12424h;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "h"
            java.lang.Class<sf.h> r2 = sf.h.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            sf.h.f12422i = r0
            return
    }

    @Override // sf.c
    public final boolean a() {
            r2 = this;
            java.lang.Object r0 = r2.f12424h
            sf.m r1 = sf.m.f12432a
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // sf.c
    public final java.lang.Object getValue() {
            r4 = this;
            java.lang.Object r0 = r4.f12424h
            sf.m r1 = sf.m.f12432a
            if (r0 == r1) goto L7
            return r0
        L7:
            fg.a r0 = r4.f12423g
            if (r0 == 0) goto L21
            java.lang.Object r0 = r0.invoke()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = sf.h.f12422i
        L11:
            boolean r3 = r2.compareAndSet(r4, r1, r0)
            if (r3 == 0) goto L1b
            r1 = 0
            r4.f12423g = r1
            return r0
        L1b:
            java.lang.Object r3 = r2.get(r4)
            if (r3 == r1) goto L11
        L21:
            java.lang.Object r0 = r4.f12424h
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto Lf
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lf:
            java.lang.String r0 = "Lazy value not initialized yet."
            return r0
    }
}

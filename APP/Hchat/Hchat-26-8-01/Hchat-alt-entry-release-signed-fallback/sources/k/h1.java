package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f6984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yg.b f6985b;

    public h1() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            r2.f6984a = r0
            yg.b r0 = new yg.b
            r0.<init>()
            r2.f6985b = r0
            return
    }

    public static final void a(k.h1 r3, k.f1 r4) {
            java.util.concurrent.atomic.AtomicReference r3 = r3.f6984a
        L2:
            java.lang.Object r0 = r3.get()
            k.f1 r0 = (k.f1) r0
            if (r0 == 0) goto L1d
            k.d1 r1 = r4.f6952a
            k.d1 r2 = r0.f6952a
            int r1 = r1.compareTo(r2)
            if (r1 < 0) goto L15
            goto L1d
        L15:
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r4 = "Current mutation had a higher priority"
            r3.<init>(r4)
            throw r3
        L1d:
            boolean r1 = r3.compareAndSet(r0, r4)
            if (r1 == 0) goto L33
            if (r0 == 0) goto L32
            qg.r0 r3 = r0.f6953b
            k.e1 r4 = new k.e1
            java.lang.String r0 = "Mutation interrupted"
            r1 = 0
            r4.<init>(r0, r1)
            r3.a(r4)
        L32:
            return
        L33:
            java.lang.Object r1 = r3.get()
            if (r1 == r0) goto L1d
            goto L2
    }

    public static java.lang.Object b(k.h1 r2, fg.l r3, yf.i r4) {
            r2.getClass()
            i.e r0 = new i.e
            r1 = 0
            r0.<init>(r2, r3, r1)
            java.lang.Object r2 = qg.v.e(r0, r4)
            return r2
    }
}

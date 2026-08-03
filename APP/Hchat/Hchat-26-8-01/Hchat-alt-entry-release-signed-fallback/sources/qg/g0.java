package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 extends qg.p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f11051l = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f11052i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11053j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public tf.k f11054k;

    public final void A(qg.b0 r2) {
            r1 = this;
            tf.k r0 = r1.f11054k
            if (r0 != 0) goto Lb
            tf.k r0 = new tf.k
            r0.<init>()
            r1.f11054k = r0
        Lb:
            r0.addLast(r2)
            return
    }

    public final void B(boolean r5) {
            r4 = this;
            long r0 = r4.f11052i
            if (r5 == 0) goto La
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            goto Lc
        La:
            r2 = 1
        Lc:
            long r2 = r2 + r0
            r4.f11052i = r2
            if (r5 != 0) goto L14
            r5 = 1
            r4.f11053j = r5
        L14:
            return
    }

    public abstract long C();

    public final boolean D() {
            r2 = this;
            tf.k r0 = r2.f11054k
            if (r0 != 0) goto L5
            goto L15
        L5:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Ld
            r0 = 0
            goto L11
        Ld:
            java.lang.Object r0 = r0.removeFirst()
        L11:
            qg.b0 r0 = (qg.b0) r0
            if (r0 != 0) goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0.run()
            r0 = 1
            return r0
    }

    public abstract void shutdown();

    public final void z(boolean r5) {
            r4 = this;
            long r0 = r4.f11052i
            if (r5 == 0) goto La
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            goto Lc
        La:
            r2 = 1
        Lc:
            long r0 = r0 - r2
            r4.f11052i = r0
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L16
            goto L1d
        L16:
            boolean r5 = r4.f11053j
            if (r5 == 0) goto L1d
            r4.shutdown()
        L1d:
            return
    }
}

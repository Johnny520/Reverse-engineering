package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.g f14710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i2.n0 f14711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u2.c f14716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m2.d f14717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.List f14718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public be.k f14719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u2.m f14720k;

    public x0(i2.g r1, i2.n0 r2, boolean r3, u2.c r4, m2.d r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.f14710a = r1
            r0.f14711b = r2
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.f14712c = r1
            r1 = 1
            r0.f14713d = r1
            r0.f14714e = r3
            r0.f14715f = r1
            r0.f14716g = r4
            r0.f14717h = r5
            tf.t r1 = tf.t.f13167g
            r0.f14718i = r1
            return
    }

    public final void a(u2.m r8) {
            r7 = this;
            be.k r0 = r7.f14719j
            if (r0 == 0) goto Le
            u2.m r1 = r7.f14720k
            if (r8 != r1) goto Le
            boolean r1 = r0.a()
            if (r1 == 0) goto L24
        Le:
            r7.f14720k = r8
            i2.n0 r0 = r7.f14711b
            i2.n0 r3 = i2.e0.h(r0, r8)
            be.k r1 = new be.k
            i2.g r2 = r7.f14710a
            java.util.List r4 = r7.f14718i
            u2.c r5 = r7.f14716g
            m2.d r6 = r7.f14717h
            r1.<init>(r2, r3, r4, r5, r6)
            r0 = r1
        L24:
            r7.f14719j = r0
            return
    }
}

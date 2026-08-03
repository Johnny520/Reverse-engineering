package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements v1.n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p.n f9952b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p.n f9953c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9954a;

    static {
            p.n r0 = new p.n
            r1 = 0
            r0.<init>(r1)
            p.n.f9952b = r0
            p.n r0 = new p.n
            r1 = 1
            r0.<init>(r1)
            p.n.f9953c = r0
            return
    }

    public /* synthetic */ n(int r1) {
            r0 = this;
            r0.f9954a = r1
            r0.<init>()
            return
    }

    @Override // v1.n0
    public final v1.o0 h(v1.p0 r3, java.util.List r4, long r5) {
            r2 = this;
            int r4 = r2.f9954a
            switch(r4) {
                case 0: goto L2a;
                default: goto L5;
            }
        L5:
            boolean r4 = u2.a.f(r5)
            r0 = 0
            if (r4 == 0) goto L11
            int r4 = u2.a.h(r5)
            goto L12
        L11:
            r4 = r0
        L12:
            boolean r1 = u2.a.e(r5)
            if (r1 == 0) goto L1c
            int r0 = u2.a.g(r5)
        L1c:
            i2.z r5 = new i2.z
            r6 = 14
            r5.<init>(r6)
            tf.u r6 = tf.u.f13168g
            v1.o0 r3 = r3.z(r4, r0, r6, r5)
            return r3
        L2a:
            int r4 = u2.a.j(r5)
            int r5 = u2.a.i(r5)
            i2.z r6 = new i2.z
            r0 = 14
            r6.<init>(r0)
            tf.u r0 = tf.u.f13168g
            v1.o0 r3 = r3.z(r4, r5, r0, r6)
            return r3
    }
}

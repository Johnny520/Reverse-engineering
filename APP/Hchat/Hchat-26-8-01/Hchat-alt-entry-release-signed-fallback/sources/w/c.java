package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements v1.n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w.c f14417b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w.c f14418c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i2.z f14419d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14420a;

    static {
            w.c r0 = new w.c
            r1 = 0
            r0.<init>(r1)
            w.c.f14417b = r0
            w.c r0 = new w.c
            r1 = 1
            r0.<init>(r1)
            w.c.f14418c = r0
            i2.z r0 = new i2.z
            r1 = 14
            r0.<init>(r1)
            w.c.f14419d = r0
            return
    }

    public /* synthetic */ c(int r1) {
            r0 = this;
            r0.f14420a = r1
            r0.<init>()
            return
    }

    @Override // v1.n0
    public final v1.o0 h(v1.p0 r5, java.util.List r6, long r7) {
            r4 = this;
            int r0 = r4.f14420a
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            int r6 = u2.a.h(r7)
            int r7 = u2.a.g(r7)
            i2.z r8 = w.c.f14419d
            tf.u r0 = tf.u.f13168g
            v1.o0 r5 = r5.z(r6, r7, r0, r8)
            return r5
        L16:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            int r1 = r6.size()
            r2 = 0
        L24:
            if (r2 >= r1) goto L36
            java.lang.Object r3 = r6.get(r2)
            v1.m0 r3 = (v1.m0) r3
            v1.b1 r3 = r3.Q(r7)
            r0.add(r3)
            int r2 = r2 + 1
            goto L24
        L36:
            int r6 = u2.a.h(r7)
            int r7 = u2.a.g(r7)
            h0.o0 r8 = new h0.o0
            r1 = 2
            r8.<init>(r1, r0)
            tf.u r0 = tf.u.f13168g
            v1.o0 r5 = r5.z(r6, r7, r0, r8)
            return r5
    }
}

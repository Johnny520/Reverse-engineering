package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends y0.n implements x1.v {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final s.p f12079x = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public r.g f12080u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m.c f12081v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public m.p1 f12082w;

    static {
            s.p r0 = new s.p
            r0.<init>()
            s.r.f12079x = r0
            return
    }

    @Override // x1.v
    public final v1.o0 j(v1.p0 r3, v1.m0 r4, long r5) {
            r2 = this;
            v1.b1 r4 = r4.Q(r5)
            int r5 = r4.f13900g
            int r6 = r4.f13901h
            g0.g r0 = new g0.g
            r1 = 6
            r0.<init>(r4, r1)
            tf.u r4 = tf.u.f13168g
            v1.o0 r3 = r3.z(r5, r6, r4, r0)
            return r3
    }

    public final boolean k1(s.m r4, int r5) {
            r3 = this;
            r0 = 5
            r1 = 1
            if (r5 != r0) goto L5
            goto L8
        L5:
            r0 = 6
            if (r5 != r0) goto Lf
        L8:
            m.p1 r0 = r3.f12082w
            m.p1 r2 = m.p1.f8325h
            if (r0 != r2) goto L23
            goto L3e
        Lf:
            r0 = 3
            if (r5 != r0) goto L13
            goto L16
        L13:
            r0 = 4
            if (r5 != r0) goto L1d
        L16:
            m.p1 r0 = r3.f12082w
            m.p1 r2 = m.p1.f8324g
            if (r0 != r2) goto L23
            goto L3e
        L1d:
            if (r5 != r1) goto L20
            goto L23
        L20:
            r0 = 2
            if (r5 != r0) goto L40
        L23:
            boolean r5 = r3.l1(r5)
            if (r5 == 0) goto L39
            int r4 = r4.f12040b
            r.g r5 = r3.f12080u
            r.z r5 = r5.f11165a
            r.p r5 = r5.j()
            int r5 = r5.f11232n
            int r5 = r5 - r1
            if (r4 >= r5) goto L3e
            goto L3d
        L39:
            int r4 = r4.f12039a
            if (r4 <= 0) goto L3e
        L3d:
            return r1
        L3e:
            r4 = 0
            return r4
        L40:
            java.lang.String r4 = "Lazy list does not support beyond bounds layout for the specified direction"
            j8.o.A(r4)
            r4 = 0
            return r4
    }

    public final boolean l1(int r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 != r1) goto L5
            return r0
        L5:
            r2 = 2
            if (r4 != r2) goto L9
            return r1
        L9:
            r2 = 5
            if (r4 != r2) goto Ld
            return r0
        Ld:
            r2 = 6
            if (r4 != r2) goto L11
            return r1
        L11:
            r2 = 3
            if (r4 != r2) goto L29
            x1.f0 r4 = x1.k.w(r3)
            u2.m r4 = r4.F
            int r4 = r4.ordinal()
            if (r4 == 0) goto L28
            if (r4 != r1) goto L23
            return r1
        L23:
            okio.a.k()
        L26:
            r4 = 0
            return r4
        L28:
            return r0
        L29:
            r2 = 4
            if (r4 != r2) goto L40
            x1.f0 r4 = x1.k.w(r3)
            u2.m r4 = r4.F
            int r4 = r4.ordinal()
            if (r4 == 0) goto L3f
            if (r4 != r1) goto L3b
            return r0
        L3b:
            okio.a.k()
            goto L26
        L3f:
            return r1
        L40:
            java.lang.String r4 = "Lazy list does not support beyond bounds layout for the specified direction"
            j8.o.A(r4)
            goto L26
    }
}

package g0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static g0.b f3965h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u2.m f3966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i2.n0 f3967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u2.d f3968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m2.d f3969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i2.n0 f3970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f3971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f3972g;

    public b(u2.m r1, i2.n0 r2, u2.d r3, m2.d r4) {
            r0 = this;
            r0.<init>()
            r0.f3966a = r1
            r0.f3967b = r2
            r0.f3968c = r3
            r0.f3969d = r4
            i2.n0 r1 = i2.e0.h(r2, r1)
            r0.f3970e = r1
            r1 = 2143289344(0x7fc00000, float:NaN)
            r0.f3971f = r1
            r0.f3972g = r1
            return
    }

    public final long a(int r24, long r25) {
            r23 = this;
            r0 = r23
            r1 = r24
            float r2 = r0.f3972g
            float r3 = r0.f3971f
            boolean r4 = java.lang.Float.isNaN(r2)
            r5 = 0
            if (r4 != 0) goto L15
            boolean r4 = java.lang.Float.isNaN(r3)
            if (r4 == 0) goto L52
        L15:
            java.lang.String r6 = g0.c.f3973a
            r2 = 15
            long r8 = u2.b.b(r5, r5, r5, r5, r2)
            r12 = 1
            r13 = 96
            i2.n0 r7 = r0.f3970e
            u2.d r10 = r0.f3968c
            m2.d r11 = r0.f3969d
            i2.a r3 = i2.e0.a(r6, r7, r8, r10, r11, r12, r13)
            r18 = r10
            float r3 = r3.b()
            java.lang.String r14 = g0.c.f3974b
            long r16 = u2.b.b(r5, r5, r5, r5, r2)
            r20 = 2
            r21 = 96
            i2.n0 r15 = r0.f3970e
            m2.d r2 = r0.f3969d
            r19 = r2
            i2.a r2 = i2.e0.a(r14, r15, r16, r18, r19, r20, r21)
            float r2 = r2.b()
            float r2 = r2 - r3
            r0.f3972g = r3
            r0.f3971f = r2
            r22 = r3
            r3 = r2
            r2 = r22
        L52:
            r4 = 1
            if (r1 == r4) goto L69
            int r1 = r1 - r4
            float r1 = (float) r1
            float r3 = r3 * r1
            float r3 = r3 + r2
            int r1 = java.lang.Math.round(r3)
            if (r1 >= 0) goto L60
            goto L61
        L60:
            r5 = r1
        L61:
            int r1 = u2.a.g(r25)
            if (r5 <= r1) goto L6d
            r5 = r1
            goto L6d
        L69:
            int r5 = u2.a.i(r25)
        L6d:
            int r1 = u2.a.g(r25)
            int r2 = u2.a.j(r25)
            int r3 = u2.a.h(r25)
            long r1 = u2.b.a(r2, r3, r5, r1)
            return r1
    }
}

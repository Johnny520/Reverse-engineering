package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p4.t f14509g = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0.f1 f14510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0.f1 f14511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0.g1 f14512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e1.c f14513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0.j1 f14515f;

    static {
            vg.t r0 = new vg.t
            r1 = 2
            r0.<init>(r1)
            r9.p r1 = new r9.p
            r2 = 26
            r1.<init>(r2)
            p4.t r0 = v0.k.b(r0, r1)
            w.j1.f14509g = r0
            return
    }

    public j1(m.p1 r3, float r4) {
            r2 = this;
            r2.<init>()
            i0.f1 r0 = new i0.f1
            r0.<init>(r4)
            r2.f14510a = r0
            i0.f1 r4 = new i0.f1
            r0 = 0
            r4.<init>(r0)
            r2.f14511b = r4
            i0.g1 r4 = new i0.g1
            r0 = 0
            r4.<init>(r0)
            r2.f14512c = r4
            e1.c r4 = e1.c.f2295e
            r2.f14513d = r4
            long r0 = i2.m0.f6358b
            r2.f14514e = r0
            i0.e r4 = i0.e.f5870m
            i0.j1 r0 = new i0.j1
            r0.<init>(r3, r4)
            r2.f14515f = r0
            return
    }

    public final void a(m.p1 r9, e1.c r10, int r11, int r12) {
            r8 = this;
            int r12 = r12 - r11
            float r12 = (float) r12
            i0.f1 r0 = r8.f14511b
            r0.h(r12)
            float r0 = r10.f2296a
            float r1 = r10.f2297b
            e1.c r2 = r8.f14513d
            float r3 = r2.f2296a
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r4 = 0
            i0.f1 r5 = r8.f14510a
            if (r3 != 0) goto L1d
            float r2 = r2.f2297b
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 != 0) goto L1d
            goto L5b
        L1d:
            m.p1 r2 = m.p1.f8324g
            if (r9 != r2) goto L23
            r9 = 1
            goto L24
        L23:
            r9 = 0
        L24:
            if (r9 == 0) goto L27
            r0 = r1
        L27:
            if (r9 == 0) goto L2c
            float r9 = r10.f2299d
            goto L2e
        L2c:
            float r9 = r10.f2298c
        L2e:
            float r1 = r5.g()
            float r2 = (float) r11
            float r3 = r1 + r2
            int r6 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r6 <= 0) goto L3b
        L39:
            float r9 = r9 - r3
            goto L51
        L3b:
            int r6 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r6 >= 0) goto L46
            float r7 = r9 - r0
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 <= 0) goto L46
            goto L39
        L46:
            if (r6 >= 0) goto L50
            float r9 = r9 - r0
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 > 0) goto L50
            float r9 = r0 - r1
            goto L51
        L50:
            r9 = r4
        L51:
            float r0 = r5.g()
            float r0 = r0 + r9
            r5.h(r0)
            r8.f14513d = r10
        L5b:
            float r9 = r5.g()
            float r9 = r9.e0.q(r9, r4, r12)
            r5.h(r9)
            i0.g1 r9 = r8.f14512c
            r9.h(r11)
            return
    }
}

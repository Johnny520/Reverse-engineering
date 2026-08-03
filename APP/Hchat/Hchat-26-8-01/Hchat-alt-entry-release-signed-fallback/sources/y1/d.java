package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends y1.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static y1.d f21867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t2.j f21868f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t2.j f21869g = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i2.k0 f21870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f2.q f21871d;

    static {
            t2.j r0 = t2.j.f13012h
            y1.d.f21868f = r0
            t2.j r0 = t2.j.f13011g
            y1.d.f21869g = r0
            return
    }

    @Override // y1.b
    public final int[] a(int r6) {
            r5 = this;
            java.lang.String r0 = r5.c()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto Ld
            goto L93
        Ld:
            java.lang.String r0 = r5.c()
            int r0 = r0.length()
            if (r6 < r0) goto L19
            goto L93
        L19:
            f2.q r0 = r5.f21871d     // Catch: java.lang.IllegalStateException -> L93
            if (r0 == 0) goto L8d
            e1.c r0 = r0.g()     // Catch: java.lang.IllegalStateException -> L93
            float r2 = r0.f2299d     // Catch: java.lang.IllegalStateException -> L93
            float r0 = r0.f2297b     // Catch: java.lang.IllegalStateException -> L93
            float r2 = r2 - r0
            int r0 = java.lang.Math.round(r2)     // Catch: java.lang.IllegalStateException -> L93
            if (r6 <= 0) goto L2d
            goto L2e
        L2d:
            r6 = 0
        L2e:
            i2.k0 r2 = r5.f21870c
            java.lang.String r3 = "layoutResult"
            if (r2 == 0) goto L89
            i2.o r2 = r2.f6347b
            int r2 = r2.d(r6)
            i2.k0 r4 = r5.f21870c
            if (r4 == 0) goto L85
            i2.o r4 = r4.f6347b
            float r2 = r4.f(r2)
            float r0 = (float) r0
            float r2 = r2 + r0
            i2.k0 r0 = r5.f21870c
            if (r0 == 0) goto L81
            i2.o r0 = r0.f6347b
            int r4 = r0.f6373f
            int r4 = r4 + (-1)
            float r0 = r0.f(r4)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            i2.k0 r4 = r5.f21870c
            if (r0 >= 0) goto L69
            if (r4 == 0) goto L65
            i2.o r0 = r4.f6347b
            int r0 = r0.e(r2)
        L62:
            int r0 = r0 + (-1)
            goto L70
        L65:
            gg.l.g(r3)
            throw r1
        L69:
            if (r4 == 0) goto L7d
            i2.o r0 = r4.f6347b
            int r0 = r0.f6373f
            goto L62
        L70:
            t2.j r1 = y1.d.f21869g
            int r0 = r5.e(r0, r1)
            int r0 = r0 + 1
            int[] r6 = r5.b(r6, r0)
            return r6
        L7d:
            gg.l.g(r3)
            throw r1
        L81:
            gg.l.g(r3)
            throw r1
        L85:
            gg.l.g(r3)
            throw r1
        L89:
            gg.l.g(r3)
            throw r1
        L8d:
            java.lang.String r6 = "node"
            gg.l.g(r6)     // Catch: java.lang.IllegalStateException -> L93
            throw r1     // Catch: java.lang.IllegalStateException -> L93
        L93:
            return r1
    }

    @Override // y1.b
    public final int[] d(int r6) {
            r5 = this;
            java.lang.String r0 = r5.c()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto Ld
            goto L82
        Ld:
            if (r6 > 0) goto L11
            goto L82
        L11:
            f2.q r0 = r5.f21871d     // Catch: java.lang.IllegalStateException -> L82
            if (r0 == 0) goto L7c
            e1.c r0 = r0.g()     // Catch: java.lang.IllegalStateException -> L82
            float r2 = r0.f2299d     // Catch: java.lang.IllegalStateException -> L82
            float r0 = r0.f2297b     // Catch: java.lang.IllegalStateException -> L82
            float r2 = r2 - r0
            int r0 = java.lang.Math.round(r2)     // Catch: java.lang.IllegalStateException -> L82
            java.lang.String r2 = r5.c()
            int r2 = r2.length()
            if (r2 <= r6) goto L2d
            goto L2e
        L2d:
            r6 = r2
        L2e:
            i2.k0 r2 = r5.f21870c
            java.lang.String r3 = "layoutResult"
            if (r2 == 0) goto L78
            i2.o r2 = r2.f6347b
            int r2 = r2.d(r6)
            i2.k0 r4 = r5.f21870c
            if (r4 == 0) goto L74
            i2.o r4 = r4.f6347b
            float r4 = r4.f(r2)
            float r0 = (float) r0
            float r4 = r4 - r0
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L5a
            i2.k0 r0 = r5.f21870c
            if (r0 == 0) goto L56
            i2.o r0 = r0.f6347b
            int r0 = r0.e(r4)
            goto L5b
        L56:
            gg.l.g(r3)
            throw r1
        L5a:
            r0 = 0
        L5b:
            java.lang.String r1 = r5.c()
            int r1 = r1.length()
            if (r6 != r1) goto L69
            if (r0 >= r2) goto L69
            int r0 = r0 + 1
        L69:
            t2.j r1 = y1.d.f21868f
            int r0 = r5.e(r0, r1)
            int[] r6 = r5.b(r0, r6)
            return r6
        L74:
            gg.l.g(r3)
            throw r1
        L78:
            gg.l.g(r3)
            throw r1
        L7c:
            java.lang.String r6 = "node"
            gg.l.g(r6)     // Catch: java.lang.IllegalStateException -> L82
            throw r1     // Catch: java.lang.IllegalStateException -> L82
        L82:
            return r1
    }

    public final int e(int r5, t2.j r6) {
            r4 = this;
            i2.k0 r0 = r4.f21870c
            r1 = 0
            java.lang.String r2 = "layoutResult"
            if (r0 == 0) goto L36
            int r0 = r0.g(r5)
            i2.k0 r3 = r4.f21870c
            if (r3 == 0) goto L32
            t2.j r0 = r3.h(r0)
            i2.k0 r3 = r4.f21870c
            if (r6 == r0) goto L22
            if (r3 == 0) goto L1e
            int r5 = r3.g(r5)
            return r5
        L1e:
            gg.l.g(r2)
            throw r1
        L22:
            if (r3 == 0) goto L2e
            r6 = 0
            i2.o r0 = r3.f6347b
            int r5 = r0.c(r5, r6)
            int r5 = r5 + (-1)
            return r5
        L2e:
            gg.l.g(r2)
            throw r1
        L32:
            gg.l.g(r2)
            throw r1
        L36:
            gg.l.g(r2)
            throw r1
    }
}

package g1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1.c f4096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1.c f4097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1.c f4098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f4099d;

    public h(g1.c r9, g1.c r10, int r11) {
            r8 = this;
            long r0 = r9.f4064b
            long r2 = g1.b.f4058a
            boolean r0 = g1.b.a(r0, r2)
            if (r0 == 0) goto Lf
            g1.c r0 = g1.k.a(r9)
            goto L10
        Lf:
            r0 = r9
        L10:
            long r4 = r10.f4064b
            boolean r1 = g1.b.a(r4, r2)
            if (r1 == 0) goto L1d
            g1.c r1 = g1.k.a(r10)
            goto L1e
        L1d:
            r1 = r10
        L1e:
            r4 = 3
            if (r11 != r4) goto L69
            long r5 = r9.f4064b
            boolean r11 = g1.b.a(r5, r2)
            long r5 = r10.f4064b
            boolean r2 = g1.b.a(r5, r2)
            if (r11 == 0) goto L32
            if (r2 == 0) goto L32
            goto L69
        L32:
            if (r11 != 0) goto L36
            if (r2 == 0) goto L69
        L36:
            if (r11 == 0) goto L39
            goto L3a
        L39:
            r9 = r10
        L3a:
            g1.r r9 = (g1.r) r9
            g1.t r9 = r9.f4120d
            float[] r3 = g1.k.f4105e
            if (r11 == 0) goto L47
            float[] r11 = r9.a()
            goto L48
        L47:
            r11 = r3
        L48:
            if (r2 == 0) goto L4e
            float[] r3 = r9.a()
        L4e:
            r9 = 0
            r2 = r11[r9]
            r5 = r3[r9]
            float r2 = r2 / r5
            r5 = 1
            r6 = r11[r5]
            r7 = r3[r5]
            float r6 = r6 / r7
            r7 = 2
            r11 = r11[r7]
            r3 = r3[r7]
            float r11 = r11 / r3
            float[] r3 = new float[r4]
            r3[r9] = r2
            r3[r5] = r6
            r3[r7] = r11
            goto L6a
        L69:
            r3 = 0
        L6a:
            r8.<init>(r10, r0, r1, r3)
            return
    }

    public h(g1.c r1, g1.c r2, g1.c r3, float[] r4) {
            r0 = this;
            r0.<init>()
            r0.f4096a = r1
            r0.f4097b = r2
            r0.f4098c = r3
            r0.f4099d = r4
            return
    }

    public long a(long r10) {
            r9 = this;
            float r0 = f1.w.h(r10)
            float r1 = f1.w.g(r10)
            float r2 = f1.w.e(r10)
            float r7 = f1.w.d(r10)
            g1.c r10 = r9.f4097b
            long r3 = r10.d(r0, r1, r2)
            r11 = 32
            long r5 = r3 >> r11
            int r11 = (int) r5
            float r11 = java.lang.Float.intBitsToFloat(r11)
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r10 = r10.e(r0, r1, r2)
            float[] r0 = r9.f4099d
            if (r0 == 0) goto L3e
            r1 = 0
            r1 = r0[r1]
            float r11 = r11 * r1
            r1 = 1
            r1 = r0[r1]
            float r3 = r3 * r1
            r1 = 2
            r0 = r0[r1]
            float r10 = r10 * r0
        L3e:
            r6 = r10
            r4 = r11
            r5 = r3
            g1.c r3 = r9.f4098c
            g1.c r8 = r9.f4096a
            long r10 = r3.f(r4, r5, r6, r7, r8)
            return r10
    }
}

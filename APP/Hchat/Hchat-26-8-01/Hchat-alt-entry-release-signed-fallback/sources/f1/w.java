package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f3126b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f3127c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f3128d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f3129e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f3130f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f3131g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f3132h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3133a;

    static {
            r0 = 4278190080(0xff000000, double:2.113706745E-314)
            long r0 = f1.c0.d(r0)
            f1.w.f3126b = r0
            r0 = 4282664004(0xff444444, double:2.115917157E-314)
            f1.c0.d(r0)
            r0 = 4287137928(0xff888888, double:2.118127569E-314)
            f1.c0.d(r0)
            r0 = 4291611852(0xffcccccc, double:2.1203379814E-314)
            f1.c0.d(r0)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = f1.c0.d(r0)
            f1.w.f3127c = r0
            r0 = 4294901760(0xffff0000, double:2.121963412E-314)
            long r0 = f1.c0.d(r0)
            f1.w.f3128d = r0
            r0 = 4278255360(0xff00ff00, double:2.1137389975E-314)
            f1.c0.d(r0)
            r0 = 4278190335(0xff0000ff, double:2.113706871E-314)
            long r0 = f1.c0.d(r0)
            f1.w.f3129e = r0
            r0 = 4294967040(0xffffff00, double:2.1219956645E-314)
            f1.c0.d(r0)
            r0 = 4278255615(0xff00ffff, double:2.1137391235E-314)
            f1.c0.d(r0)
            r0 = 4294902015(0xffff00ff, double:2.121963538E-314)
            f1.c0.d(r0)
            r0 = 0
            long r0 = f1.c0.c(r0)
            f1.w.f3130f = r0
            r0 = 0
            g1.r r1 = g1.e.f4088u
            long r0 = f1.c0.b(r0, r0, r0, r0, r1)
            f1.w.f3131g = r0
            return
    }

    public /* synthetic */ w(long r1) {
            r0 = this;
            r0.<init>()
            r0.f3133a = r1
            return
    }

    public static final long a(long r4, g1.c r6) {
            g1.c r0 = f(r4)
            int r1 = r0.f4065c
            int r2 = r6.f4065c
            r3 = r1 | r2
            if (r3 >= 0) goto L11
            g1.h r6 = g1.k.e(r0, r6)
            goto L26
        L11:
            f.w r3 = g1.i.f4100a
            int r2 = r2 << 6
            r1 = r1 | r2
            java.lang.Object r2 = r3.b(r1)
            if (r2 != 0) goto L23
            g1.h r2 = g1.k.e(r0, r6)
            r3.h(r1, r2)
        L23:
            r6 = r2
            g1.h r6 = (g1.h) r6
        L26:
            long r4 = r6.a(r4)
            return r4
    }

    public static long b(long r3, float r5) {
            float r0 = h(r3)
            float r1 = g(r3)
            float r2 = e(r3)
            g1.c r3 = f(r3)
            long r3 = f1.c0.b(r0, r1, r2, r5, r3)
            return r3
    }

    public static final boolean c(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static final float d(long r4) {
            r0 = 63
            long r0 = r0 & r4
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L18
            r0 = 56
            long r4 = r4 >>> r0
            r0 = 255(0xff, double:1.26E-321)
            long r4 = r4 & r0
            double r4 = fb.v0.O(r4)
            float r4 = (float) r4
            r5 = 1132396544(0x437f0000, float:255.0)
        L16:
            float r4 = r4 / r5
            return r4
        L18:
            r0 = 6
            long r4 = r4 >>> r0
            r0 = 1023(0x3ff, double:5.054E-321)
            long r4 = r4 & r0
            double r4 = fb.v0.O(r4)
            float r4 = (float) r4
            r5 = 1149222912(0x447fc000, float:1023.0)
            goto L16
    }

    public static final float e(long r5) {
            r0 = 63
            long r0 = r0 & r5
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L18
            r0 = 32
            long r5 = r5 >>> r0
            r0 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r0
            double r5 = fb.v0.O(r5)
            float r5 = (float) r5
            r6 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 / r6
            return r5
        L18:
            r0 = 16
            long r5 = r5 >>> r0
            r1 = 65535(0xffff, double:3.23786E-319)
            long r5 = r5 & r1
            int r5 = (int) r5
            short r5 = (short) r5
            r6 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r5
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r5
            int r6 = r6 >>> 10
            r2 = 31
            r6 = r6 & r2
            r5 = r5 & 1023(0x3ff, float:1.434E-42)
            if (r6 != 0) goto L46
            if (r5 == 0) goto L43
            r6 = 1056964608(0x3f000000, float:0.5)
            int r5 = r5 + r6
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r6 = f1.y.f3136a
            float r5 = r5 - r6
            if (r1 != 0) goto L41
            return r5
        L41:
            float r5 = -r5
            return r5
        L43:
            r5 = 0
            r6 = r5
            goto L58
        L46:
            int r5 = r5 << 13
            if (r6 != r2) goto L55
            r6 = 255(0xff, float:3.57E-43)
            if (r5 == 0) goto L51
            r2 = 4194304(0x400000, float:5.877472E-39)
            r5 = r5 | r2
        L51:
            r4 = r6
            r6 = r5
            r5 = r4
            goto L58
        L55:
            int r6 = r6 + 112
            goto L51
        L58:
            int r0 = r1 << 16
            int r5 = r5 << 23
            r5 = r5 | r0
            r5 = r5 | r6
            float r5 = java.lang.Float.intBitsToFloat(r5)
            return r5
    }

    public static final g1.c f(long r2) {
            float[] r0 = g1.e.f4068a
            r0 = 63
            long r2 = r2 & r0
            int r2 = (int) r2
            g1.c[] r3 = g1.e.f4092y
            r2 = r3[r2]
            return r2
    }

    public static final float g(long r5) {
            r0 = 63
            long r0 = r0 & r5
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L18
            r0 = 40
            long r5 = r5 >>> r0
            r0 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r0
            double r5 = fb.v0.O(r5)
            float r5 = (float) r5
            r6 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 / r6
            return r5
        L18:
            r0 = 32
            long r5 = r5 >>> r0
            r0 = 65535(0xffff, double:3.23786E-319)
            long r5 = r5 & r0
            int r5 = (int) r5
            short r5 = (short) r5
            r6 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r5
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r5
            int r6 = r6 >>> 10
            r1 = 31
            r6 = r6 & r1
            r5 = r5 & 1023(0x3ff, float:1.434E-42)
            if (r6 != 0) goto L46
            if (r5 == 0) goto L43
            r6 = 1056964608(0x3f000000, float:0.5)
            int r5 = r5 + r6
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r6 = f1.y.f3136a
            float r5 = r5 - r6
            if (r0 != 0) goto L41
            return r5
        L41:
            float r5 = -r5
            return r5
        L43:
            r5 = 0
            r6 = r5
            goto L58
        L46:
            int r5 = r5 << 13
            if (r6 != r1) goto L55
            r6 = 255(0xff, float:3.57E-43)
            if (r5 == 0) goto L51
            r1 = 4194304(0x400000, float:5.877472E-39)
            r5 = r5 | r1
        L51:
            r4 = r6
            r6 = r5
            r5 = r4
            goto L58
        L55:
            int r6 = r6 + 112
            goto L51
        L58:
            int r0 = r0 << 16
            int r5 = r5 << 23
            r5 = r5 | r0
            r5 = r5 | r6
            float r5 = java.lang.Float.intBitsToFloat(r5)
            return r5
    }

    public static final float h(long r5) {
            r0 = 63
            long r0 = r0 & r5
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 48
            if (r0 != 0) goto L18
            long r5 = r5 >>> r1
            r0 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r0
            double r5 = fb.v0.O(r5)
            float r5 = (float) r5
            r6 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 / r6
            return r5
        L18:
            long r5 = r5 >>> r1
            r0 = 65535(0xffff, double:3.23786E-319)
            long r5 = r5 & r0
            int r5 = (int) r5
            short r5 = (short) r5
            r6 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r5
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r5
            int r6 = r6 >>> 10
            r1 = 31
            r6 = r6 & r1
            r5 = r5 & 1023(0x3ff, float:1.434E-42)
            if (r6 != 0) goto L44
            if (r5 == 0) goto L41
            r6 = 1056964608(0x3f000000, float:0.5)
            int r5 = r5 + r6
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r6 = f1.y.f3136a
            float r5 = r5 - r6
            if (r0 != 0) goto L3f
            return r5
        L3f:
            float r5 = -r5
            return r5
        L41:
            r5 = 0
            r6 = r5
            goto L56
        L44:
            int r5 = r5 << 13
            if (r6 != r1) goto L53
            r6 = 255(0xff, float:3.57E-43)
            if (r5 == 0) goto L4f
            r1 = 4194304(0x400000, float:5.877472E-39)
            r5 = r5 | r1
        L4f:
            r4 = r6
            r6 = r5
            r5 = r4
            goto L56
        L53:
            int r6 = r6 + 112
            goto L4f
        L56:
            int r0 = r0 << 16
            int r5 = r5 << 23
            r5 = r5 | r0
            r5 = r5 | r6
            float r5 = java.lang.Float.intBitsToFloat(r5)
            return r5
    }

    public static java.lang.String i(long r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Color("
            r0.<init>(r1)
            float r1 = h(r3)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            float r2 = g(r3)
            r0.append(r2)
            r0.append(r1)
            float r2 = e(r3)
            r0.append(r2)
            r0.append(r1)
            float r2 = d(r3)
            r0.append(r2)
            r0.append(r1)
            g1.c r3 = f(r3)
            java.lang.String r3 = r3.f4063a
            r4 = 41
            java.lang.String r3 = eh.a.q(r0, r3, r4)
            return r3
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof f1.w
            if (r0 != 0) goto L5
            goto Lf
        L5:
            f1.w r5 = (f1.w) r5
            long r0 = r5.f3133a
            long r2 = r4.f3133a
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L11
        Lf:
            r5 = 0
            return r5
        L11:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f3133a
            int r0 = java.lang.Long.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            long r0 = r2.f3133a
            java.lang.String r0 = i(r0)
            return r0
    }
}

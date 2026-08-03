package df;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends df.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mh.b f2224g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ef.c f2225h = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ud.u f2226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public df.i f2227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public df.a f2228f;

    static {
            java.lang.Class<df.g> r0 = df.g.class
            mh.b r0 = mh.d.b(r0)
            df.g.f2224g = r0
            ef.c r1 = new ef.c
            java.lang.String r5 = "stub"
            java.lang.String r6 = ""
            r2 = -1
            java.lang.String r3 = "stub"
            java.lang.String r4 = "stub"
            r1.<init>(r2, r3, r4, r5, r6)
            df.g.f2225h = r1
            return
    }

    public g(ud.u r1) {
            r0 = this;
            r0.<init>()
            r0.f2226d = r1
            return
    }

    public static java.lang.String e(int r5, df.e r6) {
            long r0 = r6.f2220h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 16
            r2.<init>(r3)
            r3 = 0
        La:
            if (r3 >= r5) goto L1b
            int r4 = r6.g()
            short r4 = (short) r4
            if (r4 != 0) goto L14
            goto L1b
        L14:
            char r4 = (char) r4
            r2.append(r4)
            int r3 = r3 + 1
            goto La
        L1b:
            long r3 = (long) r5
            long r0 = r0 + r3
            java.lang.String r5 = "readScriptOrVariantChar"
            r6.k(r0, r5)
            java.lang.String r5 = r2.toString()
            return r5
    }

    public static char[] f(byte r6, byte r7, char r8) {
            int r0 = r6 >> 7
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            r3 = 2
            if (r0 != r1) goto L25
            r0 = r7 & 31
            r7 = r7 & 224(0xe0, float:3.14E-43)
            int r7 = r7 >> 5
            r4 = r6 & 3
            r5 = 3
            int r4 = r4 << r5
            int r7 = r7 + r4
            r6 = r6 & 124(0x7c, float:1.74E-43)
            int r6 = r6 >> r3
            int r0 = r0 + r8
            char r0 = (char) r0
            int r7 = r7 + r8
            char r7 = (char) r7
            int r6 = r6 + r8
            char r6 = (char) r6
            char[] r8 = new char[r5]
            r8[r2] = r0
            r8[r1] = r7
            r8[r3] = r6
            return r8
        L25:
            char r6 = (char) r6
            char r7 = (char) r7
            char[] r8 = new char[r3]
            r8[r2] = r6
            r8[r1] = r7
            return r8
    }

    public final b5.k d() {
            r4 = this;
            df.e r0 = r4.f2210b
            r1 = 8
            java.lang.String r2 = "value size"
            r0.a(r1, r2)
            df.e r0 = r4.f2210b
            int r1 = r0.g()
            if (r1 != 0) goto L24
            df.e r0 = r4.f2210b
            int r0 = r0.g()
            df.e r1 = r4.f2210b
            int r1 = r1.e()
            b5.k r2 = new b5.k
            r3 = 1
            r2.<init>(r0, r1, r3)
            return r2
        L24:
            r2 = 0
            java.lang.String r3 = "value res0 not 0"
            r0.l(r2, r1, r3)
            r0 = 0
            throw r0
    }
}

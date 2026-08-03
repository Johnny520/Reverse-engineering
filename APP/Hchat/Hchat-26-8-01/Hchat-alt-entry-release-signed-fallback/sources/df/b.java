package df;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends df.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mh.b f2209c = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public df.e f2210b;

    static {
            java.lang.Class<df.b> r0 = df.b.class
            mh.b r0 = mh.d.b(r0)
            df.b.f2209c = r0
            return
    }

    public final df.a b() {
            r7 = this;
            df.e r0 = r7.f2210b
            r1 = 1
            java.lang.String r2 = "String pool expected"
            r0.a(r1, r2)
            df.e r0 = r7.f2210b
            long r1 = r0.f2220h
            r3 = 2
            long r1 = r1 - r3
            int r0 = r0.c()
            r3 = 28
            if (r0 == r3) goto L22
            java.lang.String r3 = "Unexpected string pool header size: 0x{}, expected: 0x1C"
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            mh.b r4 = df.b.f2209c
            r4.h(r0, r3)
        L22:
            df.e r0 = r7.f2210b
            int r0 = r0.e()
            long r3 = (long) r0
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            long r3 = r3 + r1
            df.a r0 = r7.c(r1, r3)
            return r0
    }

    public final df.a c(long r7, long r9) {
            r6 = this;
            df.e r0 = r6.f2210b
            r0.e()
            df.e r0 = r6.f2210b
            r0.e()
            df.e r0 = r6.f2210b
            int r0 = r0.e()
            df.e r1 = r6.f2210b
            int r1 = r1.e()
            long r1 = (long) r1
            df.e r3 = r6.f2210b
            r3.e()
            df.e r3 = r6.f2210b
            long r4 = r3.f2220h
            long r7 = r4 - r7
            long r1 = r1 - r7
            long r7 = r9 - r4
            int r7 = (int) r7
            byte[] r7 = r3.h(r7)
            df.e r8 = r6.f2210b
            java.lang.String r3 = "Expected strings pool end"
            r8.b(r9, r3)
            df.a r8 = new df.a
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L39
            r9 = 1
            goto L3a
        L39:
            r9 = 0
        L3a:
            r8.<init>(r1, r7, r9)
            return r8
    }
}

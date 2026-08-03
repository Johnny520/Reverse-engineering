package df;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends java.io.InputStream {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final java.nio.charset.Charset f2216j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final java.nio.charset.Charset f2217k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f2218l = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.io.InputStream f2219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f2220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f2221i;

    static {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            df.e.f2216j = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            df.e.f2217k = r0
            r0 = 0
            byte[] r0 = new byte[r0]
            df.e.f2218l = r0
            return
    }

    public e(java.io.InputStream r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f2220h = r0
            r2.f2221i = r0
            boolean r0 = r3.markSupported()
            if (r0 == 0) goto L10
            goto L16
        L10:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r3)
            r3 = r0
        L16:
            r2.f2219g = r3
            return
    }

    public final void a(int r2, java.lang.String r3) {
            r1 = this;
            int r0 = r1.c()
            if (r0 != r2) goto L7
            return
        L7:
            r1.l(r2, r0, r3)
            r2 = 0
            throw r2
    }

    public final void b(long r3, java.lang.String r5) {
            r2 = this;
            long r0 = r2.f2220h
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r3 = java.lang.Long.toHexString(r3)
            long r0 = r2.f2220h
            java.lang.String r4 = java.lang.Long.toHexString(r0)
            java.lang.String r0 = ", expected offset: 0x"
            java.lang.String r1 = ", actual: 0x"
            java.lang.String r3 = bc.e.v(r5, r0, r3, r1, r4)
            j8.o.y(r3)
            return
    }

    public final int c() {
            r4 = this;
            long r0 = r4.f2220h
            r2 = 2
            long r0 = r0 + r2
            r4.f2220h = r0
            java.io.InputStream r0 = r4.f2219g
            int r1 = r0.read()
            int r0 = r0.read()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            return r0
    }

    public final int e() {
            r4 = this;
            long r0 = r4.f2220h
            r2 = 4
            long r0 = r0 + r2
            r4.f2220h = r0
            java.io.InputStream r0 = r4.f2219g
            int r1 = r0.read()
            int r2 = r0.read()
            int r3 = r0.read()
            int r0 = r0.read()
            int r0 = r0 << 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 16
            r0 = r0 | r3
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r0 = r0 | r2
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            return r0
    }

    public final int g() {
            r4 = this;
            long r0 = r4.f2220h
            r2 = 1
            long r0 = r0 + r2
            r4.f2220h = r0
            java.io.InputStream r0 = r4.f2219g
            int r0 = r0.read()
            return r0
    }

    public final byte[] h(int r6) {
            r5 = this;
            if (r6 != 0) goto L5
            byte[] r6 = df.e.f2218l
            return r6
        L5:
            long r0 = r5.f2220h
            long r2 = (long) r6
            long r0 = r0 + r2
            r5.f2220h = r0
            byte[] r0 = new byte[r6]
            r1 = 0
            java.io.InputStream r2 = r5.f2219g
            int r1 = r2.read(r0, r1, r6)
        L14:
            if (r1 >= r6) goto L2e
            int r3 = r6 - r1
            int r3 = r2.read(r0, r1, r3)
            r4 = -1
            if (r3 == r4) goto L21
            int r1 = r1 + r3
            goto L14
        L21:
            java.lang.String r0 = "No data, can't read "
            java.lang.String r1 = " bytes"
            java.lang.String r6 = eh.a.m(r6, r0, r1)
            j8.o.y(r6)
            r6 = 0
            return r6
        L2e:
            return r0
    }

    public final java.lang.String i(int r3) {
            r2 = this;
            java.lang.String r0 = new java.lang.String
            int r3 = r3 * 2
            byte[] r3 = r2.h(r3)
            java.nio.charset.Charset r1 = df.e.f2216j
            r0.<init>(r3, r1)
            java.lang.String r3 = r0.trim()
            return r3
    }

    public final void k(long r4, java.lang.String r6) {
            r3 = this;
            long r0 = r3.f2220h
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto L11
            if (r2 >= 0) goto Ld
            long r0 = r4 - r0
            r3.skip(r0)
        Ld:
            r3.b(r4, r6)
            return
        L11:
            java.lang.String r4 = java.lang.Long.toHexString(r4)
            long r0 = r3.f2220h
            java.lang.String r5 = java.lang.Long.toHexString(r0)
            java.lang.String r0 = ", expected offset not reachable: 0x"
            java.lang.String r1 = ", actual: 0x"
            java.lang.String r4 = bc.e.v(r6, r0, r4, r1, r5)
            j8.o.y(r4)
            return
    }

    public final void l(int r4, int r5, java.lang.String r6) {
            r3 = this;
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            long r1 = r3.f2220h
            java.lang.String r1 = java.lang.Long.toHexString(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r6 = ", expected: 0x"
            r2.append(r6)
            r2.append(r4)
            java.lang.String r4 = ", actual: 0x"
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = ", offset: 0x"
            java.lang.String r4 = eh.a.r(r2, r4, r1)
            r0.<init>(r4)
            throw r0
    }

    @Override // java.io.InputStream
    public final void mark(int r3) {
            r2 = this;
            java.io.InputStream r0 = r2.f2219g
            boolean r1 = r0.markSupported()
            if (r1 == 0) goto L10
            r0.mark(r3)
            long r0 = r2.f2220h
            r2.f2221i = r0
            return
        L10:
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "Mark not supported for input stream "
            java.lang.String r3 = r0.concat(r3)
            bsh.j.g(r3)
            return
    }

    @Override // java.io.InputStream
    public final int read() {
            r1 = this;
            java.io.InputStream r0 = r1.f2219g
            int r0 = r0.read()
            return r0
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2, int r3, int r4) {
            r1 = this;
            java.io.InputStream r0 = r1.f2219g
            int r2 = r0.read(r2, r3, r4)
            return r2
    }

    @Override // java.io.InputStream
    public final void reset() {
            r2 = this;
            java.io.InputStream r0 = r2.f2219g
            r0.reset()
            long r0 = r2.f2221i
            r2.f2220h = r0
            return
    }

    @Override // java.io.InputStream
    public final long skip(long r8) {
            r7 = this;
            long r0 = r7.f2220h
            long r0 = r0 + r8
            r7.f2220h = r0
            java.io.InputStream r0 = r7.f2219g
            long r1 = r0.skip(r8)
        Lb:
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 >= 0) goto L36
            long r3 = r8 - r1
            long r3 = r0.skip(r3)
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L1d
            long r1 = r1 + r3
            goto Lb
        L1d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No data, can't skip "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = " bytes"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L36:
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            long r0 = r2.f2220h
            java.lang.String r0 = java.lang.Long.toHexString(r0)
            java.lang.String r1 = "pos: 0x"
            java.lang.String r0 = wb.en.g(r1, r0)
            return r0
    }
}

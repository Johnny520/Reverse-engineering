package g8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f4343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4344c;

    public b(byte[] r2, int r3) {
            r1 = this;
            r0 = 2
            r1.f4342a = r0
            r1.<init>()
            r1.f4343b = r2
            r1.f4344c = r3
            return
    }

    public b(byte[] r1, int r2, byte r3) {
            r0 = this;
            r0.f4342a = r2
            switch(r2) {
                case 1: goto L27;
                case 2: goto L5;
                case 3: goto Lb;
                default: goto L5;
            }
        L5:
            r0.<init>()
            r0.f4343b = r1
            return
        Lb:
            int r2 = r1.length
            r0.<init>()
            if (r2 < 0) goto L20
            int r3 = r1.length
            if (r2 > r3) goto L19
            r0.f4343b = r1
            r0.f4344c = r2
            return
        L19:
            java.lang.String r1 = "end > bytes.length"
            j8.o.t(r1)
            r1 = 0
            throw r1
        L20:
            java.lang.String r1 = "end < start"
            j8.o.t(r1)
            r1 = 0
            throw r1
        L27:
            r0.<init>()
            if (r1 == 0) goto L2d
            goto L30
        L2d:
            r1 = 0
            byte[] r1 = new byte[r1]
        L30:
            r0.f4343b = r1
            return
    }

    public void a(int r6, int r7) {
            r5 = this;
            int r0 = r5.f4344c
            if (r6 < 0) goto L9
            if (r7 < r6) goto L9
            if (r7 > r0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = ".."
            java.lang.String r3 = "; actual size "
            java.lang.String r4 = "bad range: "
            java.lang.StringBuilder r6 = eh.a.s(r6, r7, r4, r2, r3)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r1.<init>(r6)
            throw r1
    }

    public int b(int r3) {
            r2 = this;
            int r0 = r3 + 4
            r2.a(r3, r0)
            byte[] r0 = r2.f4343b
            r0 = r0[r3]
            int r0 = r0 << 24
            int r1 = r3 + 1
            int r1 = r2.f(r1)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r3 + 2
            int r1 = r2.f(r1)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r3 = r3 + 3
            int r3 = r2.f(r3)
            r3 = r3 | r0
            return r3
    }

    public long c(int r7) {
            r6 = this;
            int r0 = r7 + 8
            r6.a(r7, r0)
            byte[] r0 = r6.f4343b
            r1 = r0[r7]
            int r1 = r1 << 24
            int r2 = r7 + 1
            int r2 = r6.f(r2)
            int r2 = r2 << 16
            r1 = r1 | r2
            int r2 = r7 + 2
            int r2 = r6.f(r2)
            int r2 = r2 << 8
            r1 = r1 | r2
            int r2 = r7 + 3
            int r2 = r6.f(r2)
            r1 = r1 | r2
            int r2 = r7 + 4
            r0 = r0[r2]
            int r0 = r0 << 24
            int r2 = r7 + 5
            int r2 = r6.f(r2)
            int r2 = r2 << 16
            r0 = r0 | r2
            int r2 = r7 + 6
            int r2 = r6.f(r2)
            int r2 = r2 << 8
            r0 = r0 | r2
            int r7 = r7 + 7
            int r7 = r6.f(r7)
            r7 = r7 | r0
            long r2 = (long) r7
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = (long) r1
            r7 = 32
            long r0 = r0 << r7
            long r0 = r0 | r2
            return r0
    }

    public int d(int r2) {
            r1 = this;
            int r0 = r2 + 2
            r1.a(r2, r0)
            byte[] r0 = r1.f4343b
            r0 = r0[r2]
            int r0 = r0 << 8
            int r2 = r2 + 1
            int r2 = r1.f(r2)
            r2 = r2 | r0
            return r2
    }

    public int e(int r2) {
            r1 = this;
            int r0 = r2 + 1
            r1.a(r2, r0)
            int r2 = r1.f(r2)
            return r2
    }

    public int f(int r2) {
            r1 = this;
            byte[] r0 = r1.f4343b
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            return r2
    }

    public int g(int r2) {
            r1 = this;
            int r0 = r2 + 2
            r1.a(r2, r0)
            int r0 = r1.f(r2)
            int r0 = r0 << 8
            int r2 = r2 + 1
            int r2 = r1.f(r2)
            r2 = r2 | r0
            return r2
    }

    public byte[] h() {
            r5 = this;
            int r0 = r5.f4342a
            switch(r0) {
                case 0: goto L26;
                default: goto L5;
            }
        L5:
            int r0 = r5.j()
            if (r0 < 0) goto L1f
            byte[] r1 = r5.f4343b
            int r2 = r1.length
            int r3 = r5.f4344c
            int r2 = r2 - r3
            if (r0 > r2) goto L1f
            byte[] r2 = new byte[r0]
            r4 = 0
            java.lang.System.arraycopy(r1, r3, r2, r4, r0)
            int r1 = r5.f4344c
            int r1 = r1 + r0
            r5.f4344c = r1
            goto L25
        L1f:
            java.lang.String r0 = "bytes长度异常"
            j8.o.A(r0)
            r2 = 0
        L25:
            return r2
        L26:
            int r0 = r5.j()
            if (r0 < 0) goto L40
            byte[] r1 = r5.f4343b
            int r2 = r1.length
            int r3 = r5.f4344c
            int r2 = r2 - r3
            if (r0 > r2) goto L40
            byte[] r2 = new byte[r0]
            r4 = 0
            java.lang.System.arraycopy(r1, r3, r2, r4, r0)
            int r1 = r5.f4344c
            int r1 = r1 + r0
            r5.f4344c = r1
            goto L46
        L40:
            java.lang.String r0 = "bytes长度异常"
            j8.o.A(r0)
            r2 = 0
        L46:
            return r2
    }

    public java.lang.String i() {
            r3 = this;
            byte[] r0 = r3.h()
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = "UTF-8"
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            return r1
    }

    public int j() {
            r4 = this;
            int r0 = r4.f4342a
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            long r0 = r4.k()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L12
            int r0 = (int) r0
            goto L18
        L12:
            java.lang.String r0 = "varint过大"
            j8.o.A(r0)
            r0 = 0
        L18:
            return r0
        L19:
            long r0 = r4.k()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L26
            int r0 = (int) r0
            goto L2c
        L26:
            java.lang.String r0 = "varint过大"
            j8.o.A(r0)
            r0 = 0
        L2c:
            return r0
    }

    public long k() {
            r7 = this;
            int r0 = r7.f4342a
            switch(r0) {
                case 0: goto L37;
                default: goto L5;
            }
        L5:
            r0 = 0
            r2 = 0
        L8:
            r3 = 64
            if (r2 >= r3) goto L30
            int r3 = r7.f4344c
            int r4 = r3 + 1
            byte[] r5 = r7.f4343b
            int r6 = r5.length
            if (r4 > r6) goto L28
            int r4 = r3 + 1
            r7.f4344c = r4
            r3 = r5[r3]
            r4 = r3 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r4
            long r4 = r4 << r2
            long r0 = r0 | r4
            r3 = r3 & 128(0x80, float:1.8E-43)
            if (r3 != 0) goto L25
            goto L36
        L25:
            int r2 = r2 + 7
            goto L8
        L28:
            java.lang.String r0 = "protobuf长度不足"
            j8.o.A(r0)
        L2d:
            r0 = 0
            goto L36
        L30:
            java.lang.String r0 = "varint异常"
            j8.o.A(r0)
            goto L2d
        L36:
            return r0
        L37:
            r0 = 0
            r2 = 0
        L3a:
            r3 = 64
            if (r2 >= r3) goto L62
            int r3 = r7.f4344c
            int r4 = r3 + 1
            byte[] r5 = r7.f4343b
            int r6 = r5.length
            if (r4 > r6) goto L5a
            int r4 = r3 + 1
            r7.f4344c = r4
            r3 = r5[r3]
            r4 = r3 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r4
            long r4 = r4 << r2
            long r0 = r0 | r4
            r3 = r3 & 128(0x80, float:1.8E-43)
            if (r3 != 0) goto L57
            goto L68
        L57:
            int r2 = r2 + 7
            goto L3a
        L5a:
            java.lang.String r0 = "protobuf长度不足"
            j8.o.A(r0)
        L5f:
            r0 = 0
            goto L68
        L62:
            java.lang.String r0 = "varint异常"
            j8.o.A(r0)
            goto L5f
        L68:
            return r0
    }

    public void l(int r2) {
            r1 = this;
            int r0 = r1.f4342a
            switch(r0) {
                case 0: goto L31;
                default: goto L5;
            }
        L5:
            if (r2 == 0) goto L2d
            r0 = 1
            if (r2 == r0) goto L27
            r0 = 2
            if (r2 == r0) goto L1f
            r0 = 5
            if (r2 != r0) goto L15
            r2 = 4
            r1.m(r2)
            goto L30
        L15:
            java.lang.String r0 = "不支持的wireType: "
            java.lang.String r2 = eh.a.l(r2, r0)
            j8.o.A(r2)
            goto L30
        L1f:
            int r2 = r1.j()
            r1.m(r2)
            goto L30
        L27:
            r2 = 8
            r1.m(r2)
            goto L30
        L2d:
            r1.k()
        L30:
            return
        L31:
            if (r2 == 0) goto L59
            r0 = 1
            if (r2 == r0) goto L53
            r0 = 2
            if (r2 == r0) goto L4b
            r0 = 5
            if (r2 != r0) goto L41
            r2 = 4
            r1.m(r2)
            goto L5c
        L41:
            java.lang.String r0 = "不支持的wireType: "
            java.lang.String r2 = eh.a.l(r2, r0)
            j8.o.A(r2)
            goto L5c
        L4b:
            int r2 = r1.j()
            r1.m(r2)
            goto L5c
        L53:
            r2 = 8
            r1.m(r2)
            goto L5c
        L59:
            r1.k()
        L5c:
            return
    }

    public void m(int r4) {
            r3 = this;
            int r0 = r3.f4342a
            switch(r0) {
                case 0: goto L22;
                default: goto L5;
            }
        L5:
            if (r4 < 0) goto L1c
            if (r4 < 0) goto L16
            int r0 = r3.f4344c
            int r1 = r0 + r4
            byte[] r2 = r3.f4343b
            int r2 = r2.length
            if (r1 > r2) goto L16
            int r0 = r0 + r4
            r3.f4344c = r0
            goto L21
        L16:
            java.lang.String r4 = "protobuf长度不足"
            j8.o.A(r4)
            goto L21
        L1c:
            java.lang.String r4 = "跳过长度异常"
            j8.o.A(r4)
        L21:
            return
        L22:
            if (r4 < 0) goto L37
            int r0 = r3.f4344c
            int r1 = r0 + r4
            byte[] r2 = r3.f4343b
            int r2 = r2.length
            if (r1 > r2) goto L31
            int r0 = r0 + r4
            r3.f4344c = r0
            goto L3c
        L31:
            java.lang.String r4 = "protobuf长度不足"
            j8.o.A(r4)
            goto L3c
        L37:
            java.lang.String r4 = "跳过长度异常"
            j8.o.A(r4)
        L3c:
            return
    }

    public g8.b n(int r3, int r4) {
            r2 = this;
            r2.a(r3, r4)
            byte[] r0 = r2.f4343b
            byte[] r3 = java.util.Arrays.copyOfRange(r0, r3, r4)
            g8.b r4 = new g8.b
            r0 = 3
            r1 = 0
            r4.<init>(r3, r0, r1)
            return r4
    }
}

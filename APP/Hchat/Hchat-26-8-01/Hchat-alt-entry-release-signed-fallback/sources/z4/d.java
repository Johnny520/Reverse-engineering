package z4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f22537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f22540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22542g;

    public d() {
            r2 = this;
            r0 = 1000(0x3e8, float:1.401E-42)
            byte[] r0 = new byte[r0]
            r1 = 1
            r2.<init>(r0, r1)
            return
    }

    public d(byte[] r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f22536a = r2
            r0.f22537b = r1
            r1 = 0
            r0.f22538c = r1
            r0.f22539d = r1
            r2 = 0
            r0.f22540e = r2
            r0.f22541f = r1
            r0.f22542g = r1
            return
    }

    public static void g() {
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "attempt to write past the end"
            r0.<init>(r1)
            throw r0
    }

    public final void a(int r4) {
            r3 = this;
            int r0 = r4 + (-1)
            if (r4 < 0) goto L29
            r4 = r4 & r0
            if (r4 != 0) goto L29
            int r4 = r3.f22538c
            int r4 = r4 + r0
            int r0 = ~r0
            r4 = r4 & r0
            boolean r0 = r3.f22536a
            if (r0 == 0) goto L14
            r3.f(r4)
            goto L19
        L14:
            byte[] r0 = r3.f22537b
            int r0 = r0.length
            if (r4 > r0) goto L24
        L19:
            byte[] r0 = r3.f22537b
            int r1 = r3.f22538c
            r2 = 0
            java.util.Arrays.fill(r0, r1, r4, r2)
            r3.f22538c = r4
            return
        L24:
            g()
            r4 = 0
            throw r4
        L29:
            java.lang.String r4 = "bogus alignment"
            j8.o.t(r4)
            return
    }

    public final void b(int r4, java.lang.String r5) {
            r3 = this;
            java.util.ArrayList r0 = r3.f22540e
            if (r0 != 0) goto L5
            return
        L5:
            r3.e()
            java.util.ArrayList r0 = r3.f22540e
            int r0 = r0.size()
            if (r0 != 0) goto L12
            r0 = 0
            goto L1e
        L12:
            java.util.ArrayList r1 = r3.f22540e
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.get(r0)
            z4.c r0 = (z4.c) r0
            int r0 = r0.f22535b
        L1e:
            int r1 = r3.f22538c
            if (r0 > r1) goto L23
            r0 = r1
        L23:
            java.util.ArrayList r1 = r3.f22540e
            z4.c r2 = new z4.c
            int r4 = r4 + r0
            r2.<init>(r0, r4, r5)
            r1.add(r2)
            return
    }

    public final void c(java.lang.String r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.f22540e
            if (r0 != 0) goto L5
            return
        L5:
            r4.e()
            java.util.ArrayList r0 = r4.f22540e
            z4.c r1 = new z4.c
            int r2 = r4.f22538c
            r3 = 2147483647(0x7fffffff, float:NaN)
            r1.<init>(r2, r3, r5)
            r0.add(r1)
            return
    }

    public final boolean d() {
            r1 = this;
            java.util.ArrayList r0 = r1.f22540e
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final void e() {
            r4 = this;
            java.util.ArrayList r0 = r4.f22540e
            if (r0 != 0) goto L5
            goto L20
        L5:
            int r0 = r0.size()
            if (r0 == 0) goto L20
            java.util.ArrayList r1 = r4.f22540e
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.get(r0)
            z4.c r0 = (z4.c) r0
            int r1 = r4.f22538c
            int r2 = r0.f22535b
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r3) goto L20
            r0.f22535b = r1
        L20:
            return
    }

    public final void f(int r4) {
            r3 = this;
            byte[] r0 = r3.f22537b
            int r1 = r0.length
            if (r1 >= r4) goto L13
            int r4 = r4 * 2
            int r4 = r4 + 1000
            byte[] r4 = new byte[r4]
            int r1 = r3.f22538c
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            r3.f22537b = r4
        L13:
            return
    }

    public final byte[] h() {
            r4 = this;
            int r0 = r4.f22538c
            byte[] r1 = new byte[r0]
            byte[] r2 = r4.f22537b
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            return r1
    }

    public final void i(byte[] r6) {
            r5 = this;
            int r0 = r6.length
            int r1 = r5.f22538c
            int r2 = r1 + r0
            r3 = r0 | r2
            if (r3 < 0) goto L27
            int r3 = r6.length
            if (r0 > r3) goto L27
            boolean r3 = r5.f22536a
            if (r3 == 0) goto L14
            r5.f(r2)
            goto L19
        L14:
            byte[] r3 = r5.f22537b
            int r3 = r3.length
            if (r2 > r3) goto L22
        L19:
            byte[] r3 = r5.f22537b
            r4 = 0
            java.lang.System.arraycopy(r6, r4, r3, r1, r0)
            r5.f22538c = r2
            return
        L22:
            g()
            r6 = 0
            throw r6
        L27:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            int r6 = r6.length
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "bytes.length "
            r1.<init>(r3)
            r1.append(r6)
            java.lang.String r6 = "; 0..!"
            r1.append(r6)
            r1.append(r2)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }

    public final void j(int r4) {
            r3 = this;
            int r0 = r3.f22538c
            int r1 = r0 + 1
            boolean r2 = r3.f22536a
            if (r2 == 0) goto Lc
            r3.f(r1)
            goto L11
        Lc:
            byte[] r2 = r3.f22537b
            int r2 = r2.length
            if (r1 > r2) goto L19
        L11:
            byte[] r2 = r3.f22537b
            byte r4 = (byte) r4
            r2[r0] = r4
            r3.f22538c = r1
            return
        L19:
            g()
            r4 = 0
            throw r4
    }

    public final void k(int r6) {
            r5 = this;
            int r0 = r5.f22538c
            int r1 = r0 + 4
            boolean r2 = r5.f22536a
            if (r2 == 0) goto Lc
            r5.f(r1)
            goto L11
        Lc:
            byte[] r2 = r5.f22537b
            int r2 = r2.length
            if (r1 > r2) goto L2e
        L11:
            byte[] r2 = r5.f22537b
            byte r3 = (byte) r6
            r2[r0] = r3
            int r3 = r0 + 1
            int r4 = r6 >> 8
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r0 + 2
            int r4 = r6 >> 16
            byte r4 = (byte) r4
            r2[r3] = r4
            int r0 = r0 + 3
            int r6 = r6 >> 24
            byte r6 = (byte) r6
            r2[r0] = r6
            r5.f22538c = r1
            return
        L2e:
            g()
            r6 = 0
            throw r6
    }

    public final void l(int r5) {
            r4 = this;
            int r0 = r4.f22538c
            int r1 = r0 + 2
            boolean r2 = r4.f22536a
            if (r2 == 0) goto Lc
            r4.f(r1)
            goto L11
        Lc:
            byte[] r2 = r4.f22537b
            int r2 = r2.length
            if (r1 > r2) goto L20
        L11:
            byte[] r2 = r4.f22537b
            byte r3 = (byte) r5
            r2[r0] = r3
            int r0 = r0 + 1
            int r5 = r5 >> 8
            byte r5 = (byte) r5
            r2[r0] = r5
            r4.f22538c = r1
            return
        L20:
            g()
            r5 = 0
            throw r5
    }

    public final void m(int r8) {
            r7 = this;
            boolean r0 = r7.f22536a
            if (r0 == 0) goto Lb
            int r0 = r7.f22538c
            int r0 = r0 + 5
            r7.f(r0)
        Lb:
            int r0 = r8 >> 7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r8
            r2 = 0
            if (r1 != 0) goto L15
            r1 = r2
            goto L16
        L15:
            r1 = -1
        L16:
            r3 = 1
            r4 = r0
            r0 = r8
            r8 = r4
            r4 = r3
        L1b:
            if (r4 == 0) goto L3d
            if (r8 != r1) goto L29
            r4 = r8 & 1
            int r5 = r0 >> 6
            r5 = r5 & r3
            if (r4 == r5) goto L27
            goto L29
        L27:
            r4 = r2
            goto L2a
        L29:
            r4 = r3
        L2a:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            if (r4 == 0) goto L31
            r5 = 128(0x80, float:1.8E-43)
            goto L32
        L31:
            r5 = r2
        L32:
            r0 = r0 | r5
            byte r0 = (byte) r0
            r7.j(r0)
            int r0 = r8 >> 7
            r6 = r0
            r0 = r8
            r8 = r6
            goto L1b
        L3d:
            return
    }

    public final int n(int r4) {
            r3 = this;
            boolean r0 = r3.f22536a
            if (r0 == 0) goto Lb
            int r0 = r3.f22538c
            int r0 = r0 + 5
            r3.f(r0)
        Lb:
            int r0 = r3.f22538c
        Ld:
            int r1 = r4 >>> 7
            r2 = r1
            r1 = r4
            r4 = r2
            if (r4 == 0) goto L1d
            r1 = r1 & 127(0x7f, float:1.78E-43)
            r1 = r1 | 128(0x80, float:1.8E-43)
            byte r1 = (byte) r1
            r3.j(r1)
            goto Ld
        L1d:
            r4 = r1 & 127(0x7f, float:1.78E-43)
            byte r4 = (byte) r4
            r3.j(r4)
            int r4 = r3.f22538c
            int r4 = r4 - r0
            return r4
    }

    public final void o(int r4) {
            r3 = this;
            if (r4 < 0) goto L22
            int r0 = r3.f22538c
            int r0 = r0 + r4
            boolean r4 = r3.f22536a
            if (r4 == 0) goto Ld
            r3.f(r0)
            goto L12
        Ld:
            byte[] r4 = r3.f22537b
            int r4 = r4.length
            if (r0 > r4) goto L1d
        L12:
            byte[] r4 = r3.f22537b
            int r1 = r3.f22538c
            r2 = 0
            java.util.Arrays.fill(r4, r1, r0, r2)
            r3.f22538c = r0
            return
        L1d:
            g()
            r4 = 0
            throw r4
        L22:
            java.lang.String r4 = "count < 0"
            j8.o.t(r4)
            return
    }
}

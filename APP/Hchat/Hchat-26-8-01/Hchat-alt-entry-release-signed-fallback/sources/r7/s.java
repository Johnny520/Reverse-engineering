package r7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s extends r7.r implements java.lang.Comparable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final java.nio.charset.CharsetDecoder f11579r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final n7.e f11580s = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f11581o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public java.lang.Object f11582p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r7.u f11583q;

    static {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            java.nio.charset.CharsetDecoder r0 = r0.newDecoder()
            r7.s.f11579r = r0
            n7.e r0 = n7.e.f9045a
            r7.s.f11580s = r0
            return
    }

    public s(boolean r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            java.lang.String r0 = ""
            r1.f11578m = r0
            r1.f11581o = r2
            return
    }

    public static byte[] O(byte[] r3, byte[] r4, byte[] r5) {
            r0 = 0
            if (r3 == 0) goto L5
            int r1 = r3.length
            goto L6
        L5:
            r1 = r0
        L6:
            int r2 = r4.length
            int r1 = r1 + r2
            int r2 = r5.length
            int r1 = r1 + r2
            byte[] r1 = new byte[r1]
            if (r3 == 0) goto L13
            int r2 = r3.length
            java.lang.System.arraycopy(r3, r0, r1, r0, r2)
            goto L14
        L13:
            r2 = r0
        L14:
            int r3 = r4.length
            java.lang.System.arraycopy(r4, r0, r1, r2, r3)
            int r3 = r4.length
            int r2 = r2 + r3
            int r3 = r5.length
            java.lang.System.arraycopy(r5, r0, r1, r2, r3)
            return r1
    }

    public static int[] T(byte[] r3) {
            r0 = 1
            r0 = r3[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r1 = 0
            r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            r2 = 2
            if (r1 == 0) goto L2c
            r1 = 3
            r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r3 = r3[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0 = r0 & 32767(0x7fff, float:4.5916E-41)
            int r0 = r0 << 16
            int r1 = r1 + r3
            int r1 = r1 + r0
            r3 = 4
            int r1 = r1 * r2
            int[] r3 = new int[]{r3, r1}
            return r3
        L2c:
            int r0 = r0 * r2
            int[] r3 = new int[]{r2, r0}
            return r3
    }

    public static int[] U(byte[] r5) {
            r0 = 0
            r0 = r5[r0]
            r0 = r0 & 128(0x80, float:1.8E-43)
            r1 = 2
            if (r0 == 0) goto La
            r0 = r1
            goto Lb
        La:
            r0 = 1
        Lb:
            r2 = r5[r0]
            int r3 = r0 + 1
            r4 = r2 & 128(0x80, float:1.8E-43)
            if (r4 == 0) goto L1e
            r5 = r5[r3]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r2 = r2 & 127(0x7f, float:1.78E-43)
            int r2 = r2 << 8
            int r2 = r2 + r5
            int r3 = r0 + 2
        L1e:
            int[] r5 = new int[]{r3, r2}
            return r5
    }

    @Override // k7.a
    public final void A(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.f11582p
            if (r0 != 0) goto L7
            z7.h r0 = z7.h.f22606g
            goto L1a
        L7:
            java.lang.Class r1 = r0.getClass()
            java.lang.Class<y7.b> r2 = y7.b.class
            if (r1 != r2) goto L16
            y7.b r0 = (y7.b) r0
            java.util.Iterator r0 = r0.b()
            goto L1a
        L16:
            java.util.Iterator r0 = z7.q.a(r0)
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            r7.m r1 = (r7.m) r1
            r1.k(r4)
            goto L1a
        L2a:
            return
    }

    @Override // r7.b, k7.a
    public final void B(q7.b r3) {
            r2 = this;
            int r0 = r3.available()
            r1 = 4
            if (r0 >= r1) goto L8
            return
        L8:
            int r0 = r2.Q(r3)
            r1 = 0
            r2.M(r0, r1)
            byte[] r0 = r2.f11553k
            int r1 = r0.length
            r3.e(r0, r1)
            r2.L()
            return
    }

    @Override // r7.r
    public java.lang.String N(byte[] r8) {
            r7 = this;
            boolean r0 = r7.f11581o
            if (r8 != 0) goto L5
            goto L63
        L5:
            int r1 = r8.length
            r2 = 2
            if (r1 >= r2) goto La
            goto L63
        La:
            if (r2 >= r1) goto L63
            r3 = r8[r2]
            if (r3 == 0) goto L60
            if (r0 == 0) goto L17
            int[] r1 = U(r8)
            goto L1b
        L17:
            int[] r1 = T(r8)
        L1b:
            if (r0 == 0) goto L20
            java.nio.charset.CharsetDecoder r2 = r7.r.f11577n
            goto L22
        L20:
            java.nio.charset.CharsetDecoder r2 = r7.s.f11579r
        L22:
            r3 = 1
            r4 = 0
            r5 = r1[r4]     // Catch: java.nio.charset.CharacterCodingException -> L35
            r6 = r1[r3]     // Catch: java.nio.charset.CharacterCodingException -> L35
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r8, r5, r6)     // Catch: java.nio.charset.CharacterCodingException -> L35
            java.nio.CharBuffer r2 = r2.decode(r5)     // Catch: java.nio.charset.CharacterCodingException -> L35
            java.lang.String r8 = r2.toString()     // Catch: java.nio.charset.CharacterCodingException -> L35
            return r8
        L35:
            if (r0 == 0) goto L53
            r0 = r1[r4]
            r1 = r1[r3]
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r8, r0, r1)     // Catch: java.nio.charset.CharacterCodingException -> L4a
            n7.e r3 = r7.s.f11580s     // Catch: java.nio.charset.CharacterCodingException -> L4a
            java.nio.CharBuffer r2 = r3.decode(r2)     // Catch: java.nio.charset.CharacterCodingException -> L4a
            java.lang.String r8 = r2.toString()     // Catch: java.nio.charset.CharacterCodingException -> L4a
            goto L5f
        L4a:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            r2.<init>(r8, r0, r1, r3)
            r8 = r2
            goto L5f
        L53:
            java.lang.String r0 = new java.lang.String
            r2 = r1[r4]
            r1 = r1[r3]
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_16LE
            r0.<init>(r8, r2, r1, r3)
            r8 = r0
        L5f:
            return r8
        L60:
            int r2 = r2 + 1
            goto La
        L63:
            if (r8 == 0) goto L6c
            int r8 = r8.length
            if (r8 != 0) goto L69
            goto L6c
        L69:
            java.lang.String r8 = ""
            return r8
        L6c:
            r8 = 0
            return r8
    }

    public final void P(r7.m r3) {
            r2 = this;
            if (r3 == 0) goto L15
            java.lang.Object r0 = r2.f11582p
            java.lang.Object r0 = y7.a.a(r0, r3)
            r2.f11582p = r0
            int r0 = r2.f7388g
            int r1 = r3.get()
            if (r1 == r0) goto L15
            r3.k(r0)
        L15:
            return
    }

    public int Q(q7.b r4) {
            r3 = this;
            int r0 = r4.available()
            r1 = 4
            if (r0 >= r1) goto Lc
            int r4 = r4.available()
            return r4
        Lc:
            byte[] r0 = new byte[r1]
            r4.e(r0, r1)
            r1 = -4
            r4.c(r1)
            boolean r4 = r3.f11581o
            if (r4 == 0) goto L1e
            int[] r4 = U(r0)
            goto L22
        L1e:
            int[] r4 = T(r0)
        L22:
            boolean r0 = r3.f11581o
            r1 = 1
            if (r0 == 0) goto L29
            r0 = r1
            goto L2a
        L29:
            r0 = 2
        L2a:
            r2 = 0
            r2 = r4[r2]
            r4 = r4[r1]
            int r2 = r2 + r4
            int r2 = r2 + r0
            return r2
    }

    public int R(r7.s r5) {
            r4 = this;
            r7.u r0 = r4.f11583q
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L12
            o7.b r0 = r0.f11587m
            z7.c r0 = r0.f9563k
            int r0 = r0.size()
            if (r0 == 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = r2
        L13:
            r7.u r3 = r5.f11583q
            if (r3 == 0) goto L22
            o7.b r3 = r3.f11587m
            z7.c r3 = r3.f9563k
            int r3 = r3.size()
            if (r3 == 0) goto L22
            goto L23
        L22:
            r1 = r2
        L23:
            int r0 = y7.a.d(r0, r1)
            int r0 = r0 * (-1)
            if (r0 == 0) goto L2c
            return r0
        L2c:
            java.lang.String r0 = r4.f11578m
            java.lang.String r5 = r5.f11578m
            int r5 = y7.a.c(r0, r5)
            return r5
    }

    public int S(r7.s r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = -1
            return r2
        L4:
            if (r2 != r1) goto L8
            r2 = 0
            return r2
        L8:
            int r0 = r1.R(r2)
            if (r0 == 0) goto Lf
            return r0
        Lf:
            int r2 = r2.X()
            int r0 = r1.X()
            int r2 = y7.a.b(r2, r0)
            return r2
    }

    public byte[] V(java.lang.String r10) {
            r9 = this;
            boolean r0 = r9.f11581o
            r1 = 3
            r2 = 4
            r3 = 2
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L5b
            byte[] r0 = new byte[r3]
            if (r10 == 0) goto L52
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r0 = r10.getBytes(r0)
            int r6 = r0.length
            r7 = 65408(0xff80, float:9.1656E-41)
            r7 = r7 & r6
            if (r7 == 0) goto L3c
            byte[] r2 = new byte[r2]
            r7 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 - r7
            int r6 = r6 >> 8
            byte r7 = (byte) r7
            r2[r1] = r7
            r1 = r6 | 128(0x80, float:1.8E-43)
            byte r1 = (byte) r1
            r2[r3] = r1
            int r10 = r10.length()
            r1 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 - r1
            int r10 = r10 >> 8
            byte r1 = (byte) r1
            r2[r5] = r1
            r10 = r10 | 128(0x80, float:1.8E-43)
            byte r10 = (byte) r10
            r2[r4] = r10
            r1 = r2
            goto L4f
        L3c:
            r7.a r1 = new r7.a
            short r2 = (short) r6
            r1.<init>(r2)
            byte[] r1 = r1.f11553k
            r2 = r1[r4]
            r1[r5] = r2
            int r10 = r10.length()
            byte r10 = (byte) r10
            r1[r4] = r10
        L4f:
            r10 = r0
            r0 = r1
            goto L54
        L52:
            byte[] r10 = new byte[r4]
        L54:
            byte[] r1 = new byte[r5]
            byte[] r10 = O(r0, r10, r1)
            return r10
        L5b:
            if (r10 != 0) goto L5f
            r10 = 0
            return r10
        L5f:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            byte[] r10 = r10.getBytes(r0)
            int r0 = r10.length
            int r0 = r0 / r3
            r6 = r0 & (-32768(0xffffffffffff8000, float:NaN))
            if (r6 == 0) goto L8c
            byte[] r2 = new byte[r2]
            r6 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 - r6
            r7 = 65280(0xff00, float:9.1477E-41)
            r8 = r0 & r7
            int r0 = r0 - r8
            int r8 = r8 >> 8
            byte r8 = (byte) r8
            r2[r1] = r8
            byte r1 = (byte) r6
            r2[r3] = r1
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 & r7
            int r0 = r0 >> 8
            r0 = r0 | 128(0x80, float:1.8E-43)
            byte r0 = (byte) r0
            r2[r5] = r0
            byte r0 = (byte) r1
            r2[r4] = r0
            goto L94
        L8c:
            r7.a r1 = new r7.a
            short r0 = (short) r0
            r1.<init>(r0)
            byte[] r2 = r1.f11553k
        L94:
            byte[] r0 = new byte[r3]
            byte[] r10 = O(r2, r10, r0)
            return r10
    }

    public void W() {
            r1 = this;
            java.lang.Class<u7.c> r0 = u7.c.class
            k7.a r0 = r1.v(r0)
            u7.c r0 = (u7.c) r0
            if (r0 == 0) goto Ld
            r0.U()
        Ld:
            return
    }

    public int X() {
            r1 = this;
            java.lang.Object r0 = r1.f11582p
            int r0 = y7.a.j(r0)
            return r0
    }

    public final java.lang.String Y() {
            r3 = this;
            java.lang.String r0 = r3.f11578m
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r7.u r1 = r3.f11583q
            if (r1 != 0) goto Lb
            return r0
        Lb:
            r2 = 1
            java.lang.String r0 = r1.Q(r0, r2)
            return r0
    }

    public void Z(java.lang.String r7) {
            r6 = this;
            java.lang.Class<s7.g> r0 = s7.g.class
            k7.a r0 = r6.v(r0)
            s7.g r0 = (s7.g) r0
            if (r0 == 0) goto L5e
            java.lang.Class<u7.c> r1 = u7.c.class
            k7.a r1 = r0.v(r1)
            u7.c r1 = (u7.c) r1
            if (r1 == 0) goto L5b
            r2 = 0
            r0.f12374p = r2
            boolean r2 = r1.f13534s
            if (r2 != 0) goto L5b
            f1.h r1 = r1.f13533r
            java.lang.String r2 = r6.Y()
            java.lang.Object r3 = r1.f3058i
            monitor-enter(r3)
            if (r7 != 0) goto L2c
            if (r2 != 0) goto L2c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
            goto L5b
        L2a:
            r7 = move-exception
            goto L59
        L2c:
            java.lang.Object r4 = r1.f3059j     // Catch: java.lang.Throwable -> L2a
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> L2a
            if (r4 != 0) goto L44
            int r4 = r1.f3057h     // Catch: java.lang.Throwable -> L2a
            if (r4 != 0) goto L3c
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2a
            r4.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L42
        L3c:
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2a
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2a
            r4 = r5
        L42:
            r1.f3059j = r4     // Catch: java.lang.Throwable -> L2a
        L44:
            java.lang.Object r7 = r4.remove(r7)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r5 = r4.remove(r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = r1.m(r7, r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = r1.m(r7, r6)     // Catch: java.lang.Throwable -> L2a
            r4.put(r2, r7)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
            goto L5b
        L59:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
            throw r7
        L5b:
            r7 = 1
            r0.f12375q = r7
        L5e:
            return
    }

    public final void a0(r7.m r2) {
            r1 = this;
            java.lang.Object r0 = r1.f11582p
            java.lang.Object r2 = y7.a.i(r0, r2)
            r1.f11582p = r2
            return
    }

    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            r7.s r1 = (r7.s) r1
            int r1 = r0.S(r1)
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = r3.Y()
            if (r0 != 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.f7388g
            java.lang.String r2 = ": NULL"
            java.lang.String r0 = j8.b.j(r0, r1, r2)
            return r0
        L14:
            java.lang.Class<u7.c> r1 = u7.c.class
            k7.a r1 = r3.v(r1)
            u7.c r1 = (u7.c) r1
            if (r1 == 0) goto L44
            boolean r1 = r1.f13534s
            if (r1 != 0) goto L44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r3.f7388g
            r1.append(r2)
            java.lang.String r2 = ": USED BY="
            r1.append(r2)
            int r2 = r3.X()
            r1.append(r2)
            java.lang.String r2 = "{"
            r1.append(r2)
            java.lang.String r2 = "}"
            java.lang.String r0 = eh.a.r(r1, r0, r2)
            return r0
        L44:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r3.f7388g
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}

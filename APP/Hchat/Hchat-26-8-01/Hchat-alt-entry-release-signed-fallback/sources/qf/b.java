package qf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements nf.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final mh.b f11019r = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.io.File f11020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b.e f11021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final rf.b f11022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.Set f11023j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f11024k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f11025l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.io.RandomAccessFile f11026m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.nio.channels.FileChannel f11027n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.nio.ByteBuffer f11028o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11029p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public nf.c f11030q;

    static {
            java.lang.Class<qf.b> r0 = qf.b.class
            mh.b r0 = mh.d.b(r0)
            qf.b.f11019r = r0
            return
    }

    public b(java.io.File r2, b.e r3) {
            r1 = this;
            r1.<init>()
            r0 = -2
            r1.f11029p = r0
            r1.f11020g = r2
            r1.f11021h = r3
            java.lang.Object r2 = r3.f332h
            rf.b r2 = (rf.b) r2
            r1.f11022i = r2
            java.lang.Object r3 = r3.f333i
            java.util.Set r3 = (java.util.Set) r3
            r1.f11023j = r3
            nf.d r0 = nf.d.f9419h
            boolean r3 = r3.contains(r0)
            r1.f11024k = r3
            boolean r2 = r2.d()
            r1.f11025l = r2
            return
    }

    public static void l(qf.a r6) {
            int r0 = r6.f11014c
            long r1 = r6.f11018g
            mh.b r3 = qf.b.f11019r
            if (r0 != 0) goto L20
            long r4 = r6.f11017f
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L2d
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r1, r6}
            java.lang.String r0 = "Not equal sizes for STORE method: compressed: {}, uncompressed: {}, entry: {}"
            r3.i(r0, r6)
            return
        L20:
            r1 = 8
            if (r0 == r1) goto L2d
            java.lang.String r1 = "Unknown compress method: {} in entry: {}"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.s(r0, r1, r6)
        L2d:
            return
    }

    public final void a(qf.a r4, java.lang.Exception r5) {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.f11028o
            int r1 = r4.f11015d
            int r1 = r1 + 6
            java.nio.Buffer r1 = r0.position(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            short r0 = r0.getShort()
            r0 = r0 & 1
            if (r0 != 0) goto L3a
            java.util.Set r0 = r3.f11023j
            nf.d r1 = nf.d.f9421j
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L26
            mh.b r0 = qf.b.f11019r
            java.lang.String r1 = "Entry '{}' parse failed, switching to fallback parser"
            r0.s(r4, r1, r5)
            return
        L26:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = r5.getMessage()
            java.lang.String r1 = "Failed to decompress zip entry: "
            java.lang.String r2 = ", error: "
            java.lang.String r4 = bc.e.j(r1, r4, r2, r0)
            ah.a.p(r4, r5)
            return
        L3a:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "Entry is encrypted, failed to decompress: "
            java.lang.String r4 = r0.concat(r4)
            ah.a.p(r4, r5)
            return
    }

    public final nf.c b() {
            r3 = this;
            java.io.File r0 = r3.f11020g
            nf.c r1 = r3.f11030q
            if (r1 != 0) goto L24
            of.b r1 = new of.b     // Catch: java.lang.Exception -> L14
            b.e r2 = r3.f11021h     // Catch: java.lang.Exception -> L14
            r1.<init>(r0, r2)     // Catch: java.lang.Exception -> L14
            nf.c r1 = r1.d()     // Catch: java.lang.Exception -> L14
            r3.f11030q = r1     // Catch: java.lang.Exception -> L14
            goto L24
        L14:
            r1 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Fallback parser failed to open file: "
            java.lang.String r0 = r2.concat(r0)
            ah.a.p(r0, r1)
            r0 = 0
            return r0
        L24:
            nf.c r0 = r3.f11030q
            return r0
    }

    public final void c() {
            r7 = this;
            java.nio.ByteBuffer r0 = r7.f11028o
            if (r0 == 0) goto L5
            return
        L5:
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.io.File r1 = r7.f11020g
            java.lang.String r2 = "r"
            r0.<init>(r1, r2)
            r7.f11026m = r0
            long r0 = r0.length()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L58
            int r0 = (int) r0
            r1 = 104857600(0x6400000, float:3.6111186E-35)
            if (r0 >= r1) goto L3a
            byte[] r0 = new byte[r0]
            java.io.RandomAccessFile r1 = r7.f11026m
            r1.readFully(r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            r7.f11028o = r0
            java.io.RandomAccessFile r0 = r7.f11026m
            r0.close()
            r0 = 0
            r7.f11026m = r0
            goto L50
        L3a:
            java.io.RandomAccessFile r0 = r7.f11026m
            java.nio.channels.FileChannel r1 = r0.getChannel()
            r7.f11027n = r1
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY
            r3 = 0
            long r5 = r1.size()
            java.nio.MappedByteBuffer r0 = r1.map(r2, r3, r5)
            r7.f11028o = r0
        L50:
            java.nio.ByteBuffer r0 = r7.f11028o
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r1)
            return
        L58:
            java.lang.String r0 = "Zip file is too big"
            j8.o.y(r0)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r3 = this;
            r0 = -2
            r1 = 0
            java.nio.channels.FileChannel r2 = r3.f11027n     // Catch: java.lang.Throwable -> La
            if (r2 == 0) goto Lc
            r2.close()     // Catch: java.lang.Throwable -> La
            goto Lc
        La:
            r2 = move-exception
            goto L25
        Lc:
            java.io.RandomAccessFile r2 = r3.f11026m     // Catch: java.lang.Throwable -> La
            if (r2 == 0) goto L13
            r2.close()     // Catch: java.lang.Throwable -> La
        L13:
            nf.c r2 = r3.f11030q     // Catch: java.lang.Throwable -> La
            if (r2 == 0) goto L1a
            r2.close()     // Catch: java.lang.Throwable -> La
        L1a:
            r3.f11027n = r1
            r3.f11026m = r1
            r3.f11028o = r1
            r3.f11029p = r0
            r3.f11030q = r1
            return
        L25:
            r3.f11027n = r1
            r3.f11026m = r1
            r3.f11028o = r1
            r3.f11029p = r0
            r3.f11030q = r1
            throw r2
    }

    @Override // nf.b
    public final nf.c d() {
            r6 = this;
            java.util.Set r0 = r6.f11023j
            r6.c()
            rf.b r1 = r6.f11022i     // Catch: java.lang.Exception -> L1e
            int r1 = r1.b()     // Catch: java.lang.Exception -> L1e
            r2 = -1
            if (r1 != r2) goto L11
            r1 = 2147483647(0x7fffffff, float:NaN)
        L11:
            nf.d r2 = nf.d.f9418g     // Catch: java.lang.Exception -> L1e
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Exception -> L1e
            if (r2 == 0) goto L20
            java.util.ArrayList r1 = r6.i(r1)     // Catch: java.lang.Exception -> L1e
            goto L24
        L1e:
            r1 = move-exception
            goto L2a
        L20:
            java.util.ArrayList r1 = r6.g(r1)     // Catch: java.lang.Exception -> L1e
        L24:
            nf.c r2 = new nf.c     // Catch: java.lang.Exception -> L1e
            r2.<init>(r6, r1)     // Catch: java.lang.Exception -> L1e
            return r2
        L2a:
            nf.d r2 = nf.d.f9421j
            boolean r0 = r0.contains(r2)
            java.io.File r2 = r6.f11020g
            if (r0 != 0) goto L40
            mh.b r0 = qf.b.f11019r
            java.lang.String r3 = "Zip open failed, switching to fallback parser, zip: {}"
            r0.s(r2, r3, r1)
            nf.c r0 = r6.b()
            return r0
        L40:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = r1.getMessage()
            java.lang.String r4 = "Failed to open zip: "
            java.lang.String r5 = ", error: "
            java.lang.String r2 = bc.e.j(r4, r2, r5, r3)
            r0.<init>(r2, r1)
            throw r0
    }

    public final qf.a e(int r14) {
            r13 = this;
            java.nio.ByteBuffer r0 = r13.f11028o
            int r1 = r14 + 8
            java.nio.Buffer r1 = r0.position(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            short r1 = r0.getShort()
            r2 = 65535(0xffff, float:9.1834E-41)
            r8 = r1 & r2
            int r1 = r14 + 18
            java.nio.Buffer r1 = r0.position(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r0.getInt()
            int r3 = r0.getInt()
            short r4 = r0.getShort()
            r4 = r4 & r2
            short r5 = r0.getShort()
            r2 = r2 & r5
            byte[] r5 = new byte[r4]
            r0.get(r5)
            r6 = r5
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            r5.<init>(r6, r7)
            int r6 = r14 + 30
            int r6 = r6 + r4
            int r7 = r6 + r2
            int r2 = r7 + r1
            java.nio.Buffer r0 = r0.position(r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r0 = r3
            qf.a r3 = new qf.a
            long r9 = (long) r1
            long r11 = (long) r0
            r4 = r13
            r6 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r11)
            return r3
    }

    public final java.util.ArrayList g(int r21) {
            r20 = this;
            r1 = r20
            int r0 = r1.h()
            if (r0 < 0) goto L156
            java.nio.ByteBuffer r2 = r1.f11028o
            int r3 = r0 + 10
            java.nio.Buffer r3 = r2.position(r3)
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            short r3 = r2.getShort()
            r10 = 65535(0xffff, float:9.1834E-41)
            r11 = r3 & r10
            int r0 = r0 + 16
            java.nio.Buffer r0 = r2.position(r0)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r0 = r2.getInt()
            r3 = r21
            if (r11 > r3) goto L147
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r11)
            java.nio.Buffer r0 = r2.position(r0)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r0 = 0
            r13 = r0
        L38:
            if (r13 >= r11) goto L146
            java.nio.ByteBuffer r14 = r1.f11028o
            int r3 = r14.position()
            int r0 = r3 + 28
            java.nio.Buffer r0 = r14.position(r0)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            short r0 = r14.getShort()
            r0 = r0 & r10
            short r2 = r14.getShort()
            r2 = r2 & r10
            short r4 = r14.getShort()
            r4 = r4 & r10
            int r5 = r3 + 42
            java.nio.Buffer r5 = r14.position(r5)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            int r5 = r14.getInt()
            int r6 = r3 + 46
            int r6 = r6 + r0
            int r6 = r6 + r2
            int r15 = r6 + r4
            qf.a r0 = r1.e(r5)
            long r4 = r0.f11017f
            long r6 = r0.f11018g
            int r2 = r0.f11014c
            boolean r8 = r1.f11024k
            mh.b r9 = qf.b.f11019r
            if (r8 == 0) goto Lda
            int r8 = r3 + 10
            java.nio.Buffer r8 = r14.position(r8)
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            short r8 = r14.getShort()
            r8 = r8 & r10
            if (r8 == r2) goto L99
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r8, r2, r0}
            java.lang.String r8 = "Compression method differ in CD {} and LFH {} for {}"
            r9.i(r8, r2)
        L99:
            int r2 = r3 + 20
            java.nio.Buffer r2 = r14.position(r2)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r14.getInt()
            int r8 = r14.getInt()
            r16 = r10
            r17 = r11
            long r10 = (long) r2
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 == 0) goto Lc3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r10, r0}
            java.lang.String r10 = "Compressed size differ in CD {} and LFH {} for {}"
            r9.i(r10, r2)
        Lc3:
            long r10 = (long) r8
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 == 0) goto Lde
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r8, r0}
            java.lang.String r8 = "Uncompressed size differ in CD {} and LFH {} for {}"
            r9.i(r8, r2)
            goto Lde
        Lda:
            r16 = r10
            r17 = r11
        Lde:
            r10 = 0
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 > 0) goto Le5
            goto Lf0
        Le5:
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 > 0) goto Lea
            goto Lf0
        Lea:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto Lf0
            r10 = r9
            goto L126
        Lf0:
            java.nio.ByteBuffer r2 = r1.f11028o
            int r4 = r3 + 10
            java.nio.Buffer r4 = r2.position(r4)
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            short r4 = r2.getShort()
            r5 = r4 & r16
            int r4 = r3 + 20
            java.nio.Buffer r4 = r2.position(r4)
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r4 = r2.getInt()
            int r2 = r2.getInt()
            qf.a r6 = new qf.a
            java.lang.String r7 = r0.f11013b
            int r0 = r0.f11016e
            long r10 = (long) r4
            r4 = r0
            long r0 = (long) r2
            r2 = r7
            r18 = r0
            r1 = r20
            r0 = r6
            r6 = r10
            r10 = r9
            r8 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
        L126:
            java.nio.Buffer r2 = r14.position(r15)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            rf.b r2 = r1.f11022i
            boolean r2 = r2.a(r0)
            if (r2 != 0) goto L139
            java.lang.String r3 = "Zip entry '{}' is invalid and excluded from processing"
            r10.h(r0, r3)
        L139:
            if (r2 == 0) goto L13e
            r12.add(r0)
        L13e:
            int r13 = r13 + 1
            r10 = r16
            r11 = r17
            goto L38
        L146:
            return r12
        L147:
            r17 = r11
            java.lang.String r0 = "Max entries count limit exceeded: "
            r2 = r17
            java.lang.String r0 = eh.a.l(r2, r0)
            j8.o.A(r0)
        L154:
            r0 = 0
            return r0
        L156:
            java.lang.String r0 = "End of central directory not found"
            bsh.j.g(r0)
            goto L154
    }

    public final int h() {
            r5 = this;
            int r0 = r5.f11029p
            r1 = -2
            if (r0 == r1) goto L6
            return r0
        L6:
            java.nio.ByteBuffer r0 = r5.f11028o
            int r1 = r0.limit()
            int r2 = r1 + (-22)
            r3 = 65557(0x10015, float:9.1865E-41)
            int r1 = r1 - r3
            r3 = 0
            int r1 = java.lang.Math.max(r3, r1)
        L17:
            java.nio.Buffer r3 = r0.position(r2)
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r0.getInt()
            r4 = 101010256(0x6054b50, float:2.506985E-35)
            if (r3 != r4) goto L29
            r5.f11029p = r2
            return r2
        L29:
            int r2 = r2 + (-1)
            if (r2 < r1) goto L2e
            goto L17
        L2e:
            java.lang.String r0 = "End of central directory record not found"
            j8.o.y(r0)
            r0 = 0
            return r0
    }

    public final java.util.ArrayList i(int r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            java.nio.ByteBuffer r1 = r6.f11028o
        L7:
            int r2 = r1.position()
            int r3 = r2 + 4
            int r4 = r1.limit()
            r5 = -1
            if (r3 <= r4) goto L16
            r2 = r5
            goto L2d
        L16:
            byte r3 = r1.get()
            r4 = 80
            if (r3 != r4) goto L7
            java.nio.Buffer r3 = r1.position(r2)
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r1.getInt()
            r4 = 67324752(0x4034b50, float:1.5433558E-36)
            if (r3 != r4) goto L7
        L2d:
            if (r2 != r5) goto L30
            return r0
        L30:
            qf.a r1 = r6.e(r2)
            rf.b r2 = r6.f11022i
            boolean r2 = r2.a(r1)
            if (r2 != 0) goto L43
            mh.b r3 = qf.b.f11019r
            java.lang.String r4 = "Zip entry '{}' is invalid and excluded from processing"
            r3.h(r1, r4)
        L43:
            if (r2 == 0) goto L5
            r0.add(r1)
            int r1 = r0.size()
            if (r1 > r7) goto L4f
            goto L5
        L4f:
            int r7 = r0.size()
            java.lang.String r0 = "Max entries count limit exceeded: "
            java.lang.String r7 = eh.a.l(r7, r0)
            j8.o.A(r7)
            r7 = 0
            return r7
    }

    public final nf.a k(qf.a r3) {
            r2 = this;
            mh.b r0 = qf.b.f11019r
            java.lang.String r1 = "useFallbackParser used for {}"
            r0.x(r3, r1)
            nf.c r0 = r2.b()
            java.lang.String r1 = r3.f11013b
            java.util.HashMap r0 = r0.f9417i
            java.lang.Object r0 = r0.get(r1)
            nf.a r0 = (nf.a) r0
            if (r0 == 0) goto L18
            return r0
        L18:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "Fallback parser can't find entry: "
            java.lang.String r3 = r0.concat(r3)
            bsh.j.g(r3)
            r3 = 0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.io.File r0 = r3.f11020g
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "JadxZipParser{"
            java.lang.String r2 = "}"
            java.lang.String r0 = eh.a.n(r1, r0, r2)
            return r0
    }
}

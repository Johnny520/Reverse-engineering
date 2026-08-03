package g6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.nio.ByteBuffer f4318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f4321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f4326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g6.a f4329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g6.a f4330m;

    public b() {
            r3 = this;
            g6.a r0 = g6.a.a()
            r3.<init>()
            r1 = 1
            r3.f4320c = r1
            r1 = 0
            r3.f4321d = r1
            r1 = 0
            r3.f4322e = r1
            r3.f4323f = r1
            r3.f4324g = r1
            r2 = 16
            int[] r2 = new int[r2]
            r3.f4326i = r2
            r3.f4327j = r1
            r3.f4328k = r1
            g6.a r1 = g6.a.f4316a
            r3.f4329l = r1
            r1 = 1024(0x400, float:1.435E-42)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            r3.f4318a = r1
            r3.f4330m = r0
            int r0 = r1.capacity()
            r3.f4319b = r0
            return
    }

    public final void a(byte r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            r3.k(r1, r0)
            java.nio.ByteBuffer r0 = r3.f4318a
            int r2 = r3.f4319b
            int r2 = r2 - r1
            r3.f4319b = r2
            r0.put(r2, r4)
            return
    }

    public final void b(int r4) {
            r3 = this;
            r0 = 0
            r1 = 4
            r3.k(r1, r0)
            int r0 = r3.j()
            int r0 = r0 - r4
            int r0 = r0 + r1
            java.nio.ByteBuffer r4 = r3.f4318a
            int r2 = r3.f4319b
            int r2 = r2 - r1
            r3.f4319b = r2
            r4.putInt(r2, r0)
            return
    }

    public final void c(int r1, int r2) {
            r0 = this;
            if (r2 == 0) goto L8
            r0.b(r2)
            r0.m(r1)
        L8:
            return
    }

    public final void d(short r4) {
            r3 = this;
            r0 = 0
            r1 = 2
            r3.k(r1, r0)
            java.nio.ByteBuffer r0 = r3.f4318a
            int r2 = r3.f4319b
            int r2 = r2 - r1
            r3.f4319b = r2
            r0.putShort(r2, r4)
            return
    }

    public final int e(java.lang.CharSequence r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            g6.a r2 = r0.f4330m
            r2.getClass()
            int r3 = r1.length()
            r4 = 0
            r5 = r4
        Lf:
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r3) goto L1c
            char r7 = r1.charAt(r5)
            if (r7 >= r6) goto L1c
            int r5 = r5 + 1
            goto Lf
        L1c:
            r7 = r3
        L1d:
            r8 = 57343(0xdfff, float:8.0355E-41)
            r9 = 55296(0xd800, float:7.7486E-41)
            r10 = 2048(0x800, float:2.87E-42)
            r11 = 1
            if (r5 >= r3) goto L63
            char r12 = r1.charAt(r5)
            if (r12 >= r10) goto L36
            int r8 = 127 - r12
            int r8 = r8 >>> 31
            int r7 = r7 + r8
            int r5 = r5 + 1
            goto L1d
        L36:
            int r12 = r1.length()
            r13 = r4
        L3b:
            if (r5 >= r12) goto L62
            char r14 = r1.charAt(r5)
            if (r14 >= r10) goto L49
            int r14 = 127 - r14
            int r14 = r14 >>> 31
            int r13 = r13 + r14
            goto L60
        L49:
            int r13 = r13 + 2
            if (r9 > r14) goto L60
            if (r14 > r8) goto L60
            int r14 = java.lang.Character.codePointAt(r1, r5)
            r15 = 65536(0x10000, float:9.1835E-41)
            if (r14 < r15) goto L5a
            int r5 = r5 + 1
            goto L60
        L5a:
            g6.d r1 = new g6.d
            r1.<init>(r5, r12)
            throw r1
        L60:
            int r5 = r5 + r11
            goto L3b
        L62:
            int r7 = r7 + r13
        L63:
            if (r7 < r3) goto L29d
            r0.a(r4)
            r0.o(r11, r7, r11)
            java.nio.ByteBuffer r3 = r0.f4318a
            int r5 = r0.f4319b
            int r5 = r5 - r7
            r0.f4319b = r5
            r3.position(r5)
            java.nio.ByteBuffer r3 = r0.f4318a
            r2.getClass()
            boolean r2 = r3.hasArray()
            java.lang.String r5 = " at index "
            java.lang.String r7 = "Failed writing "
            if (r2 == 0) goto L19c
            int r2 = r3.arrayOffset()
            byte[] r12 = r3.array()
            int r13 = r3.position()
            int r13 = r13 + r2
            int r14 = r3.remaining()
            int r15 = r1.length()
            int r14 = r14 + r13
        L9a:
            r16 = r11
            if (r4 >= r15) goto Lb3
            int r11 = r4 + r13
            if (r11 >= r14) goto Lb3
            char r8 = r1.charAt(r4)
            if (r8 >= r6) goto Lb3
            byte r8 = (byte) r8
            r12[r11] = r8
            int r4 = r4 + 1
            r11 = r16
            r8 = 57343(0xdfff, float:8.0355E-41)
            goto L9a
        Lb3:
            if (r4 != r15) goto Lb8
            int r13 = r13 + r15
            goto L196
        Lb8:
            int r13 = r13 + r4
        Lb9:
            if (r4 >= r15) goto L196
            char r8 = r1.charAt(r4)
            if (r8 >= r6) goto Lcb
            if (r13 >= r14) goto Lcb
            int r11 = r13 + 1
            byte r8 = (byte) r8
            r12[r13] = r8
            r13 = r11
            goto L14a
        Lcb:
            if (r8 >= r10) goto Le3
            int r11 = r14 + (-2)
            if (r13 > r11) goto Le3
            int r11 = r13 + 1
            int r10 = r8 >>> 6
            r10 = r10 | 960(0x3c0, float:1.345E-42)
            byte r10 = (byte) r10
            r12[r13] = r10
            int r13 = r13 + 2
            r8 = r8 & 63
            r8 = r8 | r6
            byte r8 = (byte) r8
            r12[r11] = r8
            goto L14a
        Le3:
            if (r8 < r9) goto Lea
            r10 = 57343(0xdfff, float:8.0355E-41)
            if (r10 >= r8) goto L10a
        Lea:
            int r10 = r14 + (-3)
            if (r13 > r10) goto L10a
            int r10 = r13 + 1
            int r11 = r8 >>> 12
            r11 = r11 | 480(0x1e0, float:6.73E-43)
            byte r11 = (byte) r11
            r12[r13] = r11
            int r11 = r13 + 2
            int r17 = r8 >>> 6
            r9 = r17 & 63
            r9 = r9 | r6
            byte r9 = (byte) r9
            r12[r10] = r9
            int r13 = r13 + 3
            r8 = r8 & 63
            r8 = r8 | r6
            byte r8 = (byte) r8
            r12[r11] = r8
            goto L14a
        L10a:
            int r9 = r14 + (-4)
            if (r13 > r9) goto L15c
            int r9 = r4 + 1
            int r10 = r1.length()
            if (r9 == r10) goto L154
            char r4 = r1.charAt(r9)
            boolean r10 = java.lang.Character.isSurrogatePair(r8, r4)
            if (r10 == 0) goto L153
            int r4 = java.lang.Character.toCodePoint(r8, r4)
            int r8 = r13 + 1
            int r10 = r4 >>> 18
            r10 = r10 | 240(0xf0, float:3.36E-43)
            byte r10 = (byte) r10
            r12[r13] = r10
            int r10 = r13 + 2
            int r11 = r4 >>> 12
            r11 = r11 & 63
            r11 = r11 | r6
            byte r11 = (byte) r11
            r12[r8] = r11
            int r8 = r13 + 3
            int r11 = r4 >>> 6
            r11 = r11 & 63
            r11 = r11 | r6
            byte r11 = (byte) r11
            r12[r10] = r11
            int r13 = r13 + 4
            r4 = r4 & 63
            r4 = r4 | r6
            byte r4 = (byte) r4
            r12[r8] = r4
            r4 = r9
        L14a:
            int r4 = r4 + 1
            r9 = 55296(0xd800, float:7.7486E-41)
            r10 = 2048(0x800, float:2.87E-42)
            goto Lb9
        L153:
            r4 = r9
        L154:
            g6.d r1 = new g6.d
            int r4 = r4 + (-1)
            r1.<init>(r4, r15)
            throw r1
        L15c:
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r2 > r8) goto L17e
            r10 = 57343(0xdfff, float:8.0355E-41)
            if (r8 > r10) goto L17e
            int r2 = r4 + 1
            int r3 = r1.length()
            if (r2 == r3) goto L178
            char r1 = r1.charAt(r2)
            boolean r1 = java.lang.Character.isSurrogatePair(r8, r1)
            if (r1 != 0) goto L17e
        L178:
            g6.d r1 = new g6.d
            r1.<init>(r4, r15)
            throw r1
        L17e:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            r2.append(r8)
            r2.append(r5)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L196:
            int r13 = r13 - r2
            r3.position(r13)
            goto L26c
        L19c:
            r16 = r11
            int r2 = r1.length()
            int r8 = r3.position()
        L1a6:
            if (r4 >= r2) goto L1b7
            char r9 = r1.charAt(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L271
            if (r9 >= r6) goto L1b7
            int r10 = r8 + r4
            byte r9 = (byte) r9     // Catch: java.lang.IndexOutOfBoundsException -> L271
            r3.put(r10, r9)     // Catch: java.lang.IndexOutOfBoundsException -> L271
            int r4 = r4 + 1
            goto L1a6
        L1b7:
            if (r4 != r2) goto L1c0
            int r2 = r8 + r4
            r3.position(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L271
            goto L26c
        L1c0:
            int r8 = r8 + r4
        L1c1:
            if (r4 >= r2) goto L269
            char r9 = r1.charAt(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L271
            if (r9 >= r6) goto L1d7
            byte r9 = (byte) r9     // Catch: java.lang.IndexOutOfBoundsException -> L271
            r3.put(r8, r9)     // Catch: java.lang.IndexOutOfBoundsException -> L271
            r10 = 2048(0x800, float:2.87E-42)
        L1cf:
            r11 = 55296(0xd800, float:7.7486E-41)
            r12 = 57343(0xdfff, float:8.0355E-41)
            goto L261
        L1d7:
            r10 = 2048(0x800, float:2.87E-42)
            if (r9 >= r10) goto L1f1
            int r11 = r8 + 1
            int r12 = r9 >>> 6
            r12 = r12 | 192(0xc0, float:2.69E-43)
            byte r12 = (byte) r12
            r3.put(r8, r12)     // Catch: java.lang.IndexOutOfBoundsException -> L1ee
            r8 = r9 & 63
            r8 = r8 | r6
            byte r8 = (byte) r8     // Catch: java.lang.IndexOutOfBoundsException -> L1ee
            r3.put(r11, r8)     // Catch: java.lang.IndexOutOfBoundsException -> L1ee
            r8 = r11
            goto L1cf
        L1ee:
            r8 = r11
            goto L271
        L1f1:
            r11 = 55296(0xd800, float:7.7486E-41)
            r12 = 57343(0xdfff, float:8.0355E-41)
            if (r9 < r11) goto L245
            if (r12 >= r9) goto L1fc
            goto L245
        L1fc:
            int r13 = r4 + 1
            if (r13 == r2) goto L23f
            char r4 = r1.charAt(r13)     // Catch: java.lang.IndexOutOfBoundsException -> L237
            boolean r14 = java.lang.Character.isSurrogatePair(r9, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L237
            if (r14 == 0) goto L23e
            int r4 = java.lang.Character.toCodePoint(r9, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L237
            int r9 = r8 + 1
            int r14 = r4 >>> 18
            r14 = r14 | 240(0xf0, float:3.36E-43)
            byte r14 = (byte) r14
            r3.put(r8, r14)     // Catch: java.lang.IndexOutOfBoundsException -> L23c
            int r14 = r8 + 2
            int r15 = r4 >>> 12
            r15 = r15 & 63
            r15 = r15 | r6
            byte r15 = (byte) r15
            r3.put(r9, r15)     // Catch: java.lang.IndexOutOfBoundsException -> L239
            int r8 = r8 + 3
            int r9 = r4 >>> 6
            r9 = r9 & 63
            r9 = r9 | r6
            byte r9 = (byte) r9
            r3.put(r14, r9)     // Catch: java.lang.IndexOutOfBoundsException -> L237
            r4 = r4 & 63
            r4 = r4 | r6
            byte r4 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> L237
            r3.put(r8, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L237
            r4 = r13
            goto L261
        L237:
            r4 = r13
            goto L271
        L239:
            r4 = r13
            r8 = r14
            goto L271
        L23c:
            r8 = r9
            goto L237
        L23e:
            r4 = r13
        L23f:
            g6.d r6 = new g6.d     // Catch: java.lang.IndexOutOfBoundsException -> L271
            r6.<init>(r4, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L271
            throw r6     // Catch: java.lang.IndexOutOfBoundsException -> L271
        L245:
            int r13 = r8 + 1
            int r14 = r9 >>> 12
            r14 = r14 | 224(0xe0, float:3.14E-43)
            byte r14 = (byte) r14
            r3.put(r8, r14)     // Catch: java.lang.IndexOutOfBoundsException -> L267
            int r8 = r8 + 2
            int r14 = r9 >>> 6
            r14 = r14 & 63
            r14 = r14 | r6
            byte r14 = (byte) r14
            r3.put(r13, r14)     // Catch: java.lang.IndexOutOfBoundsException -> L271
            r9 = r9 & 63
            r9 = r9 | r6
            byte r9 = (byte) r9     // Catch: java.lang.IndexOutOfBoundsException -> L271
            r3.put(r8, r9)     // Catch: java.lang.IndexOutOfBoundsException -> L271
        L261:
            int r4 = r4 + 1
            int r8 = r8 + 1
            goto L1c1
        L267:
            r8 = r13
            goto L271
        L269:
            r3.position(r8)     // Catch: java.lang.IndexOutOfBoundsException -> L271
        L26c:
            int r1 = r0.h()
            return r1
        L271:
            int r2 = r3.position()
            int r3 = r3.position()
            int r8 = r8 - r3
            int r8 = r8 + 1
            int r3 = java.lang.Math.max(r4, r8)
            int r3 = r3 + r2
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            char r1 = r1.charAt(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r7)
            r4.append(r1)
            r4.append(r5)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            r2.<init>(r1)
            throw r2
        L29d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            long r2 = (long) r7
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            long r2 = r2 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "UTF-8 length does not fit in int: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            throw r1
    }

    public final int f(int[] r3) {
            r2 = this;
            boolean r0 = r2.f4323f
            if (r0 != 0) goto L1b
            r0 = 4
            int r1 = r3.length
            r2.o(r0, r1, r0)
            int r0 = r3.length
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L16
            r1 = r3[r0]
            r2.b(r1)
            int r0 = r0 + (-1)
            goto Lc
        L16:
            int r3 = r2.h()
            return r3
        L1b:
            java.lang.String r3 = "FlatBuffers: object serialization must not be nested."
            j8.o.f(r3)
            r3 = 0
            return r3
    }

    public final int g() {
            r11 = this;
            int[] r0 = r11.f4321d
            if (r0 == 0) goto Ld0
            boolean r0 = r11.f4323f
            if (r0 == 0) goto Ld0
            r0 = 4
            r1 = 0
            r11.k(r0, r1)
            java.nio.ByteBuffer r2 = r11.f4318a
            int r3 = r11.f4319b
            int r3 = r3 - r0
            r11.f4319b = r3
            r2.putInt(r3, r1)
            int r0 = r11.j()
            int r2 = r11.f4322e
            int r2 = r2 + (-1)
        L1f:
            if (r2 < 0) goto L2a
            int[] r3 = r11.f4321d
            r3 = r3[r2]
            if (r3 != 0) goto L2a
            int r2 = r2 + (-1)
            goto L1f
        L2a:
            r3 = r2
        L2b:
            if (r3 < 0) goto L3e
            int[] r4 = r11.f4321d
            r4 = r4[r3]
            if (r4 == 0) goto L36
            int r4 = r0 - r4
            goto L37
        L36:
            r4 = r1
        L37:
            short r4 = (short) r4
            r11.d(r4)
            int r3 = r3 + (-1)
            goto L2b
        L3e:
            int r3 = r11.f4325h
            int r3 = r0 - r3
            short r3 = (short) r3
            r11.d(r3)
            int r2 = r2 + 3
            r3 = 2
            int r2 = r2 * r3
            short r2 = (short) r2
            r11.d(r2)
            r2 = r1
        L4f:
            int r4 = r11.f4327j
            if (r2 >= r4) goto L8f
            java.nio.ByteBuffer r4 = r11.f4318a
            int r4 = r4.capacity()
            int[] r5 = r11.f4326i
            r5 = r5[r2]
            int r4 = r4 - r5
            int r5 = r11.f4319b
            java.nio.ByteBuffer r6 = r11.f4318a
            short r6 = r6.getShort(r4)
            java.nio.ByteBuffer r7 = r11.f4318a
            short r7 = r7.getShort(r5)
            if (r6 != r7) goto L8c
            r7 = r3
        L6f:
            if (r7 >= r6) goto L87
            java.nio.ByteBuffer r8 = r11.f4318a
            int r9 = r4 + r7
            short r8 = r8.getShort(r9)
            java.nio.ByteBuffer r9 = r11.f4318a
            int r10 = r5 + r7
            short r9 = r9.getShort(r10)
            if (r8 == r9) goto L84
            goto L8c
        L84:
            int r7 = r7 + 2
            goto L6f
        L87:
            int[] r4 = r11.f4326i
            r2 = r4[r2]
            goto L90
        L8c:
            int r2 = r2 + 1
            goto L4f
        L8f:
            r2 = r1
        L90:
            if (r2 == 0) goto La2
            java.nio.ByteBuffer r3 = r11.f4318a
            int r3 = r3.capacity()
            int r3 = r3 - r0
            r11.f4319b = r3
            java.nio.ByteBuffer r4 = r11.f4318a
            int r2 = r2 - r0
            r4.putInt(r3, r2)
            goto Lcd
        La2:
            int r2 = r11.f4327j
            int[] r4 = r11.f4326i
            int r5 = r4.length
            if (r2 != r5) goto Lb0
            int r2 = r2 * r3
            int[] r2 = java.util.Arrays.copyOf(r4, r2)
            r11.f4326i = r2
        Lb0:
            int[] r2 = r11.f4326i
            int r3 = r11.f4327j
            int r4 = r3 + 1
            r11.f4327j = r4
            int r4 = r11.j()
            r2[r3] = r4
            java.nio.ByteBuffer r2 = r11.f4318a
            int r3 = r2.capacity()
            int r3 = r3 - r0
            int r4 = r11.j()
            int r4 = r4 - r0
            r2.putInt(r3, r4)
        Lcd:
            r11.f4323f = r1
            return r0
        Ld0:
            java.lang.String r0 = "FlatBuffers: endTable called without startTable"
            j8.o.f(r0)
            r0 = 0
            return r0
    }

    public final int h() {
            r3 = this;
            boolean r0 = r3.f4323f
            if (r0 == 0) goto L19
            r0 = 0
            r3.f4323f = r0
            int r0 = r3.f4328k
            java.nio.ByteBuffer r1 = r3.f4318a
            int r2 = r3.f4319b
            int r2 = r2 + (-4)
            r3.f4319b = r2
            r1.putInt(r2, r0)
            int r0 = r3.j()
            return r0
        L19:
            java.lang.String r0 = "FlatBuffers: endVector called without startVector"
            j8.o.f(r0)
            r0 = 0
            return r0
    }

    public final void i(int r3) {
            r2 = this;
            int r0 = r2.f4320c
            r1 = 4
            r2.k(r0, r1)
            r2.b(r3)
            java.nio.ByteBuffer r3 = r2.f4318a
            int r0 = r2.f4319b
            r3.position(r0)
            r3 = 1
            r2.f4324g = r3
            return
    }

    public final int j() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f4318a
            int r0 = r0.capacity()
            int r1 = r2.f4319b
            int r0 = r0 - r1
            return r0
    }

    public final void k(int r8, int r9) {
            r7 = this;
            int r0 = r7.f4320c
            if (r8 <= r0) goto L6
            r7.f4320c = r8
        L6:
            java.nio.ByteBuffer r0 = r7.f4318a
            int r0 = r0.capacity()
            int r1 = r7.f4319b
            int r0 = r0 - r1
            int r0 = r0 + r9
            int r0 = ~r0
            int r0 = r0 + 1
            int r1 = r8 + (-1)
            r0 = r0 & r1
        L16:
            int r1 = r7.f4319b
            int r2 = r0 + r8
            int r2 = r2 + r9
            r3 = 0
            if (r1 >= r2) goto L70
            java.nio.ByteBuffer r1 = r7.f4318a
            int r1 = r1.capacity()
            java.nio.ByteBuffer r2 = r7.f4318a
            int r4 = r2.capacity()
            if (r4 != 0) goto L2f
            r5 = 1024(0x400, float:1.435E-42)
            goto L3c
        L2f:
            r5 = 2147483639(0x7ffffff7, float:NaN)
            if (r4 == r5) goto L6a
            r6 = -1073741824(0xffffffffc0000000, float:-2.0)
            r6 = r6 & r4
            if (r6 == 0) goto L3a
            goto L3c
        L3a:
            int r5 = r4 << 1
        L3c:
            r2.position(r3)
            g6.a r3 = r7.f4329l
            r3.getClass()
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r5)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r3 = r3.order(r5)
            java.nio.Buffer r5 = r3.clear()
            int r5 = r5.capacity()
            int r5 = r5 - r4
            r3.position(r5)
            r3.put(r2)
            r7.f4318a = r3
            int r2 = r7.f4319b
            int r3 = r3.capacity()
            int r3 = r3 - r1
            int r3 = r3 + r2
            r7.f4319b = r3
            goto L16
        L6a:
            java.lang.String r8 = "FlatBuffers: cannot grow buffer beyond 2 gigabytes."
            j8.o.f(r8)
            return
        L70:
            r8 = r3
        L71:
            if (r8 >= r0) goto L81
            java.nio.ByteBuffer r9 = r7.f4318a
            int r1 = r7.f4319b
            int r1 = r1 + (-1)
            r7.f4319b = r1
            r9.put(r1, r3)
            int r8 = r8 + 1
            goto L71
        L81:
            return
    }

    public final byte[] l() {
            r3 = this;
            int r0 = r3.f4319b
            java.nio.ByteBuffer r1 = r3.f4318a
            int r1 = r1.capacity()
            int r2 = r3.f4319b
            int r1 = r1 - r2
            boolean r2 = r3.f4324g
            if (r2 == 0) goto L1c
            byte[] r1 = new byte[r1]
            java.nio.ByteBuffer r2 = r3.f4318a
            r2.position(r0)
            java.nio.ByteBuffer r0 = r3.f4318a
            r0.get(r1)
            return r1
        L1c:
            java.lang.String r0 = "FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish()."
            j8.o.f(r0)
            r0 = 0
            return r0
    }

    public final void m(int r3) {
            r2 = this;
            int[] r0 = r2.f4321d
            int r1 = r2.j()
            r0[r3] = r1
            return
    }

    public final void n(int r3) {
            r2 = this;
            boolean r0 = r2.f4323f
            if (r0 != 0) goto L21
            int[] r0 = r2.f4321d
            if (r0 == 0) goto Lb
            int r0 = r0.length
            if (r0 >= r3) goto Lf
        Lb:
            int[] r0 = new int[r3]
            r2.f4321d = r0
        Lf:
            r2.f4322e = r3
            int[] r0 = r2.f4321d
            r1 = 0
            java.util.Arrays.fill(r0, r1, r3, r1)
            r3 = 1
            r2.f4323f = r3
            int r3 = r2.j()
            r2.f4325h = r3
            return
        L21:
            java.lang.String r3 = "FlatBuffers: object serialization must not be nested."
            j8.o.f(r3)
            return
    }

    public final void o(int r2, int r3, int r4) {
            r1 = this;
            boolean r0 = r1.f4323f
            if (r0 != 0) goto L12
            r1.f4328k = r3
            int r2 = r2 * r3
            r3 = 4
            r1.k(r3, r2)
            r1.k(r4, r2)
            r2 = 1
            r1.f4323f = r2
            return
        L12:
            java.lang.String r2 = "FlatBuffers: object serialization must not be nested."
            j8.o.f(r2)
            return
    }
}

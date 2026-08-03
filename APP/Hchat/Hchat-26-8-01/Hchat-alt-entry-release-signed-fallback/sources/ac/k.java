package ac;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements w4.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.Object f179j;

    public k(byte r1, int r2) {
            r0 = this;
            r0.f176g = r2
            switch(r2) {
                case 9: goto L14;
                default: goto L5;
            }
        L5:
            r0.<init>()
            r1 = 0
            int[] r2 = new int[r1]
            r0.f178i = r2
            int[] r2 = new int[r1]
            r0.f179j = r2
            r0.f177h = r1
            return
        L14:
            r0.<init>()
            j0.b r1 = new j0.b
            r2 = 16
            s.i[] r2 = new s.i[r2]
            r1.<init>(r2)
            r0.f178i = r1
            return
    }

    public k(int r2) {
            r1 = this;
            r0 = 0
            r1.f176g = r0
            byte[] r2 = new byte[r2]
            r1.<init>(r2, r0)
            return
    }

    public /* synthetic */ k(int r1, char r2) {
            r0 = this;
            r0.f176g = r1
            r0.<init>()
            return
    }

    public k(ff.e r2, int r3) {
            r1 = this;
            r0 = 5
            r1.f176g = r0
            r1.<init>()
            r1.f179j = r2
            r1.f177h = r3
            java.nio.ByteBuffer r2 = r2.f3933c
            java.nio.ByteBuffer r2 = r2.duplicate()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            java.nio.Buffer r3 = r2.position(r3)
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            r1.f178i = r2
            return
    }

    public k(g8.b r2, int r3, int r4, v4.e0 r5) {
            r1 = this;
            r0 = 6
            r1.f176g = r0
            r1.<init>()
            if (r4 < 0) goto L30
            int r0 = r4 * 2
            int r0 = r0 + r3
            g8.b r2 = r2.n(r3, r0)
            r1.f178i = r2
            r1.f177h = r4
            r1.f179j = r5
            r3 = 0
        L16:
            if (r3 >= r4) goto L2f
            int r0 = r3 * 2
            int r0 = r2.g(r0)
            v4.a r0 = r5.l(r0)     // Catch: java.lang.ClassCastException -> L27
            v4.d0 r0 = (v4.d0) r0     // Catch: java.lang.ClassCastException -> L27
            int r3 = r3 + 1
            goto L16
        L27:
            r2 = move-exception
            java.lang.String r3 = "bogus class cpi"
            ah.a.p(r3, r2)
            r2 = 0
            throw r2
        L2f:
            return
        L30:
            java.lang.String r2 = "size < 0"
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    public k(java.io.File r2, int r3, java.io.File r4) {
            r1 = this;
            r0 = 4
            r1.f176g = r0
            r1.<init>()
            r1.f178i = r2
            r1.f177h = r3
            r1.f179j = r4
            return
    }

    public k(java.util.ArrayList r2, int r3, android.view.MotionEvent r4) {
            r1 = this;
            r0 = 8
            r1.f176g = r0
            r1.<init>()
            r1.f178i = r2
            r1.f177h = r3
            r1.f179j = r4
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L14
            return
        L14:
            java.lang.String r2 = "changes cannot be empty"
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    public k(k5.u r2, k5.z r3, int r4) {
            r1 = this;
            r0 = 7
            r1.f176g = r0
            r1.<init>()
            r1.f178i = r2
            r1.f179j = r3
            r1.f177h = r4
            return
    }

    public k(lg.d r13, r.h r14) {
            r12 = this;
            r0 = 10
            r12.f176g = r0
            r12.<init>()
            ac.k r14 = r14.f11166a
            int r0 = r13.f8042g
            if (r0 < 0) goto Le
            goto L13
        Le:
            java.lang.String r1 = "negative nearestRange.first"
            o.b.c(r1)
        L13:
            int r13 = r13.f8043h
            int r1 = r14.f177h
            int r1 = r1 + (-1)
            int r13 = java.lang.Math.min(r13, r1)
            if (r13 >= r0) goto L2f
            f.b0 r13 = f.o0.f2877a
            r13.getClass()
            r12.f178i = r13
            r13 = 0
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r12.f179j = r14
            r12.f177h = r13
            goto Led
        L2f:
            int r1 = r13 - r0
            int r1 = r1 + 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r12.f179j = r2
            r12.f177h = r0
            f.b0 r2 = new f.b0
            r2.<init>(r1)
            java.lang.Object r1 = r14.f178i
            j0.b r1 = (j0.b) r1
            java.lang.String r3 = ", size "
            java.lang.String r4 = "Index "
            if (r0 < 0) goto L4d
            int r5 = r14.f177h
            if (r0 >= r5) goto L4d
            goto L5d
        L4d:
            java.lang.StringBuilder r5 = eh.a.t(r0, r4, r3)
            int r6 = r14.f177h
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            o.b.e(r5)
        L5d:
            if (r13 < 0) goto L64
            int r5 = r14.f177h
            if (r13 >= r5) goto L64
            goto L74
        L64:
            java.lang.StringBuilder r3 = eh.a.t(r13, r4, r3)
            int r14 = r14.f177h
            r3.append(r14)
            java.lang.String r14 = r3.toString()
            o.b.e(r14)
        L74:
            if (r13 < r0) goto L77
            goto L95
        L77:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r3 = "toIndex ("
            r14.<init>(r3)
            r14.append(r13)
            java.lang.String r3 = ") should be not smaller than fromIndex ("
            r14.append(r3)
            r14.append(r0)
            r3 = 41
            r14.append(r3)
            java.lang.String r14 = r14.toString()
            o.b.a(r14)
        L95:
            int r14 = s.o.e(r0, r1)
            java.lang.Object[] r3 = r1.f6671g
            r3 = r3[r14]
            s.i r3 = (s.i) r3
            int r3 = r3.f12025a
        La1:
            if (r3 > r13) goto Leb
            java.lang.Object[] r4 = r1.f6671g
            r4 = r4[r14]
            s.i r4 = (s.i) r4
            b5.c r5 = r4.f12027c
            java.lang.Object r5 = r5.f469a
            fg.l r5 = (fg.l) r5
            int r6 = r4.f12025a
            int r7 = java.lang.Math.max(r0, r6)
            int r8 = r4.f12026b
            int r8 = r8 + r6
            int r8 = r8 + (-1)
            int r8 = java.lang.Math.min(r13, r8)
            if (r7 > r8) goto Le5
        Lc0:
            if (r5 == 0) goto Lce
            int r9 = r7 - r6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r9 = r5.invoke(r9)
            if (r9 != 0) goto Ld3
        Lce:
            s.g r9 = new s.g
            r9.<init>(r7)
        Ld3:
            r2.g(r7, r9)
            java.lang.Object r10 = r12.f179j
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            int r11 = r12.f177h
            int r11 = r7 - r11
            r10[r11] = r9
            if (r7 == r8) goto Le5
            int r7 = r7 + 1
            goto Lc0
        Le5:
            int r4 = r4.f12026b
            int r3 = r3 + r4
            int r14 = r14 + 1
            goto La1
        Leb:
            r12.f178i = r2
        Led:
            return
    }

    public k(y1.l2 r2) {
            r1 = this;
            r0 = 3
            r1.f176g = r0
            r1.<init>()
            r1.f178i = r2
            return
    }

    public k(byte[] r2, int r3) {
            r1 = this;
            r0 = 0
            r1.f176g = r0
            r1.<init>()
            r0 = 0
            r1.f178i = r0
            r1.f179j = r2
            r1.f177h = r3
            return
    }

    public static /* synthetic */ void A(ac.k r12, int r13, int r14, int r15, int r16, int r17, int r18, boolean r19, boolean r20, boolean r21, int r22) {
            r0 = r22 & 32
            if (r0 == 0) goto L7
            r0 = -1
            r7 = r0
            goto L9
        L7:
            r7 = r18
        L9:
            r11 = -1
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r8 = r19
            r9 = r20
            r10 = r21
            r1.z(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static int f(int[] r4, int r5, int r6) {
            r0 = -1
            r1 = r5
        L2:
            int r2 = r1 - r0
            r3 = 1
            if (r2 <= r3) goto L13
            int r2 = r1 + r0
            int r2 = r2 / 2
            r3 = r4[r2]
            if (r3 >= r6) goto L11
            r0 = r2
            goto L2
        L11:
            r1 = r2
            goto L2
        L13:
            if (r1 != r5) goto L17
            int r4 = ~r5
            return r4
        L17:
            r4 = r4[r1]
            if (r4 != r6) goto L1c
            return r1
        L1c:
            int r4 = ~r1
            return r4
    }

    public static int x(java.lang.String r6) {
            int r0 = r6.length()
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r0) goto L30
            int r3 = r1 + 1
            char r4 = r6.charAt(r1)
            r5 = 128(0x80, float:1.8E-43)
            if (r4 >= r5) goto L16
            int r2 = r2 + 1
        L14:
            r1 = r3
            goto L6
        L16:
            r5 = 2048(0x800, float:2.87E-42)
            if (r4 >= r5) goto L1d
            int r2 = r2 + 2
            goto L14
        L1d:
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L2d
            r5 = 57343(0xdfff, float:8.0355E-41)
            if (r4 <= r5) goto L28
            goto L2d
        L28:
            int r1 = r1 + 2
            int r2 = r2 + 4
            goto L6
        L2d:
            int r2 = r2 + 3
            goto L14
        L30:
            return r2
    }

    public void B(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f178i
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r1 = r2.f177h
            int r1 = r1 + r3
            java.nio.Buffer r3 = r0.position(r1)
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            return
    }

    public void C(byte[] r5) {
            r4 = this;
            int r0 = r5.length
            if (r0 <= 0) goto L12
            java.lang.Object r1 = r4.f179j
            byte[] r1 = (byte[]) r1
            int r2 = r4.f177h
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r1, r2, r0)
            int r5 = r4.f177h
            int r5 = r5 + r0
            r4.f177h = r5
        L12:
            return
    }

    public void D(int r6) {
            r5 = this;
            java.lang.Object r0 = r5.f179j
            byte[] r0 = (byte[]) r0
            int r1 = r5.f177h
            int r2 = r1 + 1
            r5.f177h = r2
            byte r3 = (byte) r6
            r0[r1] = r3
            int r3 = r1 + 2
            r5.f177h = r3
            int r4 = r6 >> 8
            byte r4 = (byte) r4
            r0[r2] = r4
            int r2 = r1 + 3
            r5.f177h = r2
            int r4 = r6 >> 16
            byte r4 = (byte) r4
            r0[r3] = r4
            int r1 = r1 + 4
            r5.f177h = r1
            int r6 = r6 >> 24
            byte r6 = (byte) r6
            r0[r2] = r6
            return
    }

    public void E(int r5, int r6) {
            r4 = this;
            java.lang.Object r0 = r4.f179j
            byte[] r0 = (byte[]) r0
            int r1 = r5 + 1
            byte r2 = (byte) r6
            r0[r5] = r2
            int r2 = r5 + 2
            int r3 = r6 >> 8
            byte r3 = (byte) r3
            r0[r1] = r3
            int r5 = r5 + 3
            int r1 = r6 >> 16
            byte r1 = (byte) r1
            r0[r2] = r1
            int r6 = r6 >> 24
            byte r6 = (byte) r6
            r0[r5] = r6
            return
    }

    public void F(int r6, long r7) {
            r5 = this;
            java.lang.Object r0 = r5.f179j
            byte[] r0 = (byte[]) r0
            int r1 = r6 + 1
            int r2 = (int) r7
            byte r2 = (byte) r2
            r0[r6] = r2
            int r2 = r6 + 2
            r3 = 8
            long r3 = r7 >> r3
            int r3 = (int) r3
            byte r3 = (byte) r3
            r0[r1] = r3
            int r1 = r6 + 3
            r3 = 16
            long r3 = r7 >> r3
            int r3 = (int) r3
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r6 + 4
            r3 = 24
            long r3 = r7 >> r3
            int r3 = (int) r3
            byte r3 = (byte) r3
            r0[r1] = r3
            int r1 = r6 + 5
            r3 = 32
            long r3 = r7 >> r3
            int r3 = (int) r3
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r6 + 6
            r3 = 40
            long r3 = r7 >> r3
            int r3 = (int) r3
            byte r3 = (byte) r3
            r0[r1] = r3
            int r6 = r6 + 7
            r1 = 48
            long r3 = r7 >> r1
            int r1 = (int) r3
            byte r1 = (byte) r1
            r0[r2] = r1
            r1 = 56
            long r7 = r7 >> r1
            int r7 = (int) r7
            byte r7 = (byte) r7
            r0[r6] = r7
            return
    }

    public void G(java.lang.String r10) {
            r9 = this;
            if (r10 == 0) goto L99
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L99
            java.lang.Object r0 = r9.f179j
            byte[] r0 = (byte[]) r0
            int r1 = r9.f177h
            int r2 = r10.length()
            r3 = 0
        L13:
            if (r3 >= r2) goto L97
            int r4 = r3 + 1
            char r5 = r10.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L27
            int r3 = r1 + 1
            byte r5 = (byte) r5
            r0[r1] = r5
            r1 = r3
        L25:
            r3 = r4
            goto L13
        L27:
            r7 = 2048(0x800, float:2.87E-42)
            if (r5 >= r7) goto L3d
            int r3 = r1 + 1
            int r7 = r5 >>> 6
            r7 = r7 | 192(0xc0, float:2.69E-43)
            byte r7 = (byte) r7
            r0[r1] = r7
            int r1 = r1 + 2
            r5 = r5 & 63
            r5 = r5 | r6
            byte r5 = (byte) r5
            r0[r3] = r5
            goto L25
        L3d:
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r7) goto L7b
            r7 = 57343(0xdfff, float:8.0355E-41)
            if (r5 <= r7) goto L48
            goto L7b
        L48:
            int r3 = r3 + 2
            char r4 = r10.charAt(r4)
            int r5 = r5 << 10
            int r5 = r5 + r4
            r4 = -56613888(0xfffffffffca02400, float:-6.651981E36)
            int r5 = r5 + r4
            int r4 = r1 + 1
            int r7 = r5 >>> 18
            r7 = r7 | 240(0xf0, float:3.36E-43)
            byte r7 = (byte) r7
            r0[r1] = r7
            int r7 = r1 + 2
            int r8 = r5 >>> 12
            r8 = r8 & 63
            r8 = r8 | r6
            byte r8 = (byte) r8
            r0[r4] = r8
            int r4 = r1 + 3
            int r8 = r5 >>> 6
            r8 = r8 & 63
            r8 = r8 | r6
            byte r8 = (byte) r8
            r0[r7] = r8
            int r1 = r1 + 4
            r5 = r5 & 63
            r5 = r5 | r6
            byte r5 = (byte) r5
            r0[r4] = r5
            goto L13
        L7b:
            int r3 = r1 + 1
            int r7 = r5 >>> 12
            r7 = r7 | 224(0xe0, float:3.14E-43)
            byte r7 = (byte) r7
            r0[r1] = r7
            int r7 = r1 + 2
            int r8 = r5 >>> 6
            r8 = r8 & 63
            r8 = r8 | r6
            byte r8 = (byte) r8
            r0[r3] = r8
            int r1 = r1 + 3
            r3 = r5 & 63
            r3 = r3 | r6
            byte r3 = (byte) r3
            r0[r7] = r3
            goto L25
        L97:
            r9.f177h = r1
        L99:
            return
    }

    public void H() {
            r1 = this;
            java.lang.Object r0 = r1.f178i
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r0.getInt()
            return
    }

    public int I() {
            r6 = this;
            r0 = 0
            r1 = -1
            r2 = r1
            r1 = r0
        L4:
            int r3 = r6.K()
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r1 * 7
            int r4 = r4 << r5
            r0 = r0 | r4
            int r2 = r2 << 7
            int r1 = r1 + 1
            r4 = 128(0x80, float:1.8E-43)
            r3 = r3 & r4
            if (r3 != r4) goto L1a
            r5 = 5
            if (r1 < r5) goto L4
        L1a:
            if (r3 == r4) goto L23
            int r1 = r2 >> 1
            r1 = r1 & r0
            if (r1 == 0) goto L22
            r0 = r0 | r2
        L22:
            return r0
        L23:
            af.d r0 = new af.d
            java.lang.String r1 = "Invalid LEB128 sequence"
            r0.<init>(r1)
            throw r0
    }

    public java.util.List J() {
            r5 = this;
            java.lang.Object r0 = r5.f178i
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r0 = r0.getInt()
            if (r0 != 0) goto Ld
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
        Ld:
            int[] r1 = new int[r0]
            r2 = 0
            r3 = r2
        L11:
            if (r3 >= r0) goto L1c
            int r4 = r5.L()
            r1[r3] = r4
            int r3 = r3 + 1
            goto L11
        L1c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
        L21:
            if (r2 >= r0) goto L2f
            r4 = r1[r2]
            java.lang.String r4 = r5.y(r4)
            r3.add(r4)
            int r2 = r2 + 1
            goto L21
        L2f:
            return r3
    }

    public int K() {
            r1 = this;
            java.lang.Object r0 = r1.f178i
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            byte r0 = r0.get()
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    public int L() {
            r2 = this;
            java.lang.Object r0 = r2.f178i
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            short r0 = r0.getShort()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            return r0
    }

    public void M(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f178i
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r1 = r0.position()
            int r1 = r1 + r3
            java.nio.Buffer r3 = r0.position(r1)
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            return
    }

    public void N(int r9, boolean r10) {
            r8 = this;
            r0 = 33554431(0x1ffffff, float:9.403954E-38)
            r9 = r9 & r0
            java.lang.Object r1 = r8.f178i
            long[] r1 = (long[]) r1
            int r2 = r8.f177h
            r3 = 0
        Lb:
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r3 >= r4) goto L2f
            if (r3 >= r2) goto L2f
            int r4 = r3 + 2
            r5 = r1[r4]
            int r7 = (int) r5
            r7 = r7 & r0
            if (r7 != r9) goto L2c
            r2 = 8070450532247928831(0x6fffffffffffffff, double:3.1050361846014175E231)
            long r2 = r2 & r5
            long r9 = (long) r10
            r5 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r5 = r5 * r9
            long r2 = r2 | r5
            r5 = -9223372036854775808
            long r9 = r9 * r5
            long r9 = r9 | r2
            r1[r4] = r9
            return
        L2c:
            int r3 = r3 + 3
            goto Lb
        L2f:
            return
    }

    public void O(int r23, int r24, long r25) {
            r22 = this;
            r0 = r22
            java.lang.Object r1 = r0.f178i
            long[] r1 = (long[]) r1
            java.lang.Object r2 = r0.f179j
            long[] r2 = (long[]) r2
            r3 = 0
            r2[r3] = r25
            r3 = 1
        Le:
            if (r3 <= 0) goto Lab
            int r3 = r3 + (-1)
            r4 = r2[r3]
            int r6 = (int) r4
            r7 = 33554431(0x1ffffff, float:9.403954E-38)
            r6 = r6 & r7
            r8 = 25
            long r9 = r4 >> r8
            int r9 = (int) r9
            r9 = r9 & r7
            r10 = 50
            long r4 = r4 >> r10
            int r4 = (int) r4
            r5 = 1023(0x3ff, float:1.434E-42)
            r4 = r4 & r5
            if (r4 != r5) goto L2b
            int r4 = r0.f177h
            goto L2e
        L2b:
            int r4 = r4 * 3
            int r4 = r4 + r9
        L2e:
            if (r9 < 0) goto Lab
        L30:
            int r11 = r1.length
            int r11 = r11 + (-2)
            if (r9 >= r11) goto Le
            if (r9 >= r4) goto Le
            int r11 = r9 + 2
            r12 = r1[r11]
            long r14 = r12 >> r8
            int r14 = (int) r14
            r14 = r14 & r7
            if (r14 != r6) goto L9c
            r14 = r1[r9]
            int r16 = r9 + 1
            r25 = r7
            r26 = r8
            r7 = r1[r16]
            r17 = 32
            r18 = r10
            r19 = r11
            long r10 = r14 >> r17
            int r10 = (int) r10
            int r10 = r10 + r23
            int r11 = (int) r14
            int r11 = r11 + r24
            long r14 = (long) r10
            long r14 = r14 << r17
            long r10 = (long) r11
            r20 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r20
            long r10 = r10 | r14
            r1[r9] = r10
            long r10 = r7 >> r17
            int r10 = (int) r10
            int r10 = r10 + r23
            int r7 = (int) r7
            int r7 = r7 + r24
            long r10 = (long) r10
            long r10 = r10 << r17
            long r7 = (long) r7
            long r7 = r7 & r20
            long r7 = r7 | r10
            r1[r16] = r7
            r7 = 63
            long r7 = r12 >> r7
            r10 = 1
            long r7 = r7 & r10
            r10 = 60
            long r7 = r7 << r10
            long r7 = r7 | r12
            r1[r19] = r7
            long r7 = r12 >> r18
            int r7 = (int) r7
            r7 = r7 & r5
            if (r7 <= 0) goto La2
            int r7 = r3 + 1
            int r8 = r9 + 3
            long r10 = g2.a.f4144b
            long r10 = r10 & r12
            r8 = r8 & r25
            long r12 = (long) r8
            long r12 = r12 << r26
            long r10 = r10 | r12
            r2[r3] = r10
            r3 = r7
            goto La2
        L9c:
            r25 = r7
            r26 = r8
            r18 = r10
        La2:
            int r9 = r9 + 3
            r7 = r25
            r8 = r26
            r10 = r18
            goto L30
        Lab:
            return
    }

    public void P(int r7, fg.r r8) {
            r6 = this;
            r0 = 33554431(0x1ffffff, float:9.403954E-38)
            r7 = r7 & r0
            java.lang.Object r1 = r6.f178i
            long[] r1 = (long[]) r1
            int r2 = r6.f177h
            r3 = 0
        Lb:
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r3 >= r4) goto L41
            if (r3 >= r2) goto L41
            int r4 = r3 + 2
            r4 = r1[r4]
            int r4 = (int) r4
            r4 = r4 & r0
            if (r4 != r7) goto L3e
            r4 = r1[r3]
            int r3 = r3 + 1
            r0 = r1[r3]
            r7 = 32
            long r2 = r4 >> r7
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = (int) r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            long r4 = r0 >> r7
            int r7 = (int) r4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.c(r2, r3, r7, r0)
            return
        L3e:
            int r3 = r3 + 3
            goto Lb
        L41:
            return
    }

    public void a(int r2) {
            r1 = this;
            java.lang.Object r0 = r1.f178i
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.Buffer r2 = r0.position(r2)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            return
    }

    public void b(int r3, b5.c r4) {
            r2 = this;
            if (r3 < 0) goto L3
            goto L8
        L3:
            java.lang.String r0 = "size should be >=0"
            o.b.a(r0)
        L8:
            if (r3 != 0) goto Lb
            return
        Lb:
            s.i r0 = new s.i
            int r1 = r2.f177h
            r0.<init>(r1, r3, r4)
            int r4 = r2.f177h
            int r4 = r4 + r3
            r2.f177h = r4
            java.lang.Object r3 = r2.f178i
            j0.b r3 = (j0.b) r3
            r3.b(r0)
            return
    }

    public void c(int r7, int r8) {
            r6 = this;
            int r0 = r6.f177h
            r1 = 0
            if (r0 == 0) goto L72
            java.lang.Object r2 = r6.f178i
            int[] r2 = (int[]) r2
            int r3 = r0 + (-1)
            r3 = r2[r3]
            if (r7 > r3) goto L72
            int r0 = f(r2, r0, r7)
            if (r0 < 0) goto L1c
            java.lang.Object r7 = r6.f179j
            int[] r7 = (int[]) r7
            r7[r0] = r8
            return
        L1c:
            int r0 = ~r0
            int r2 = r6.f177h
            java.lang.Object r3 = r6.f178i
            int[] r3 = (int[]) r3
            int r4 = r3.length
            if (r2 < r4) goto L47
            int r2 = r2 + 1
            int r3 = r3.length
            int r3 = r3 * 2
            int r2 = java.lang.Math.max(r2, r3)
            int[] r3 = new int[r2]
            int[] r2 = new int[r2]
            java.lang.Object r4 = r6.f178i
            int[] r4 = (int[]) r4
            int r5 = r4.length
            java.lang.System.arraycopy(r4, r1, r3, r1, r5)
            java.lang.Object r4 = r6.f179j
            int[] r4 = (int[]) r4
            int r5 = r4.length
            java.lang.System.arraycopy(r4, r1, r2, r1, r5)
            r6.f178i = r3
            r6.f179j = r2
        L47:
            int r1 = r6.f177h
            int r1 = r1 - r0
            if (r1 == 0) goto L5f
            java.lang.Object r2 = r6.f178i
            int[] r2 = (int[]) r2
            int r3 = r0 + 1
            java.lang.System.arraycopy(r2, r0, r2, r3, r1)
            java.lang.Object r1 = r6.f179j
            int[] r1 = (int[]) r1
            int r2 = r6.f177h
            int r2 = r2 - r0
            java.lang.System.arraycopy(r1, r0, r1, r3, r2)
        L5f:
            java.lang.Object r1 = r6.f178i
            int[] r1 = (int[]) r1
            r1[r0] = r7
            java.lang.Object r7 = r6.f179j
            int[] r7 = (int[]) r7
            r7[r0] = r8
            int r7 = r6.f177h
            int r7 = r7 + 1
            r6.f177h = r7
            return
        L72:
            java.lang.Object r2 = r6.f178i
            int[] r2 = (int[]) r2
            int r3 = r2.length
            if (r0 < r3) goto L9a
            int r3 = r0 + 1
            int r2 = r2.length
            int r2 = r2 * 2
            int r2 = java.lang.Math.max(r3, r2)
            int[] r3 = new int[r2]
            int[] r2 = new int[r2]
            java.lang.Object r4 = r6.f178i
            int[] r4 = (int[]) r4
            int r5 = r4.length
            java.lang.System.arraycopy(r4, r1, r3, r1, r5)
            java.lang.Object r4 = r6.f179j
            int[] r4 = (int[]) r4
            int r5 = r4.length
            java.lang.System.arraycopy(r4, r1, r2, r1, r5)
            r6.f178i = r3
            r6.f179j = r2
        L9a:
            java.lang.Object r1 = r6.f178i
            int[] r1 = (int[]) r1
            r1[r0] = r7
            java.lang.Object r7 = r6.f179j
            int[] r7 = (int[]) r7
            r7[r0] = r8
            int r0 = r0 + 1
            r6.f177h = r0
            return
    }

    @Override // w4.e
    public w4.e d(w4.c r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "unsupported"
            r2.<init>(r0)
            throw r2
    }

    @Override // w4.e
    public boolean e() {
            r1 = this;
            r0 = 0
            return r0
    }

    public ac.k g() {
            r3 = this;
            ac.k r0 = new ac.k
            int r1 = r3.f177h
            java.lang.Object r2 = r3.f179j
            ff.e r2 = (ff.e) r2
            r0.<init>(r2, r1)
            return r0
    }

    @Override // w4.e
    public w4.c getType(int r2) {
            r1 = this;
            java.lang.Object r0 = r1.f178i
            g8.b r0 = (g8.b) r0
            int r2 = r2 * 2
            int r2 = r0.g(r2)
            java.lang.Object r0 = r1.f179j
            v4.e0 r0 = (v4.e0) r0
            v4.a r2 = r0.l(r2)
            v4.d0 r2 = (v4.d0) r2
            w4.c r2 = r2.f14088g
            return r2
    }

    public synchronized java.lang.String h(byte[] r11, int r12, int r13) {
            r10 = this;
            monitor-enter(r10)
            java.lang.Object r0 = r10.f178i     // Catch: java.lang.Throwable -> L2f
            char[] r0 = (char[]) r0     // Catch: java.lang.Throwable -> L2f
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L15
            r0 = 256(0x100, float:3.59E-43)
            if (r13 > r0) goto L10
            char[] r0 = new char[r0]     // Catch: java.lang.Throwable -> L2f
            goto L12
        L10:
            char[] r0 = new char[r1]     // Catch: java.lang.Throwable -> L2f
        L12:
            r10.f178i = r0     // Catch: java.lang.Throwable -> L2f
            goto L1c
        L15:
            int r2 = r0.length     // Catch: java.lang.Throwable -> L2f
            if (r2 >= r13) goto L1c
            char[] r0 = new char[r1]     // Catch: java.lang.Throwable -> L2f
            r10.f178i = r0     // Catch: java.lang.Throwable -> L2f
        L1c:
            int r13 = r13 + r12
            r1 = 0
            r2 = r1
        L1f:
            if (r12 >= r13) goto Lda
            int r3 = r12 + 1
            r4 = r11[r12]     // Catch: java.lang.Throwable -> L2f
            if (r4 <= 0) goto L32
            int r12 = r2 + 1
            char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
            r0[r2] = r4     // Catch: java.lang.Throwable -> L2f
            r2 = r12
            r12 = r3
            goto L1f
        L2f:
            r11 = move-exception
            goto Leb
        L32:
            r5 = -32
            r6 = -65
            if (r4 >= r5) goto L58
            int r12 = r12 + 2
            r3 = r11[r3]     // Catch: java.lang.Throwable -> L2f
            r5 = -62
            if (r4 < r5) goto L50
            if (r3 > r6) goto L50
            int r5 = r2 + 1
            r4 = r4 & 31
            int r4 = r4 << 6
            r3 = r3 & 63
            r3 = r3 | r4
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L2f
            r0[r2] = r3     // Catch: java.lang.Throwable -> L2f
        L4e:
            r2 = r5
            goto L1f
        L50:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r12 = "Invalid String"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L2f
            throw r11     // Catch: java.lang.Throwable -> L2f
        L58:
            r7 = -16
            if (r4 >= r7) goto L8e
            int r7 = r12 + 2
            r3 = r11[r3]     // Catch: java.lang.Throwable -> L2f
            int r12 = r12 + 3
            r7 = r11[r7]     // Catch: java.lang.Throwable -> L2f
            r8 = -96
            if (r4 != r5) goto L6a
            if (r3 < r8) goto L86
        L6a:
            r5 = -19
            if (r4 != r5) goto L70
            if (r3 >= r8) goto L86
        L70:
            if (r3 > r6) goto L86
            if (r7 > r6) goto L86
            int r5 = r2 + 1
            r4 = r4 & 15
            int r4 = r4 << 12
            r3 = r3 & 63
            int r3 = r3 << 6
            r3 = r3 | r4
            r4 = r7 & 63
            r3 = r3 | r4
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L2f
            r0[r2] = r3     // Catch: java.lang.Throwable -> L2f
            goto L4e
        L86:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r12 = "Invalid String"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L2f
            throw r11     // Catch: java.lang.Throwable -> L2f
        L8e:
            int r5 = r12 + 2
            r3 = r11[r3]     // Catch: java.lang.Throwable -> L2f
            int r7 = r12 + 3
            r5 = r11[r5]     // Catch: java.lang.Throwable -> L2f
            int r12 = r12 + 4
            r7 = r11[r7]     // Catch: java.lang.Throwable -> L2f
            if (r3 > r6) goto Ld2
            int r8 = r4 << 28
            int r9 = r3 + 112
            int r9 = r9 + r8
            int r8 = r9 >> 30
            if (r8 != 0) goto Ld2
            if (r5 > r6) goto Ld2
            if (r7 > r6) goto Ld2
            r4 = r4 & 7
            int r4 = r4 << 18
            r3 = r3 & 63
            int r3 = r3 << 12
            r3 = r3 | r4
            r4 = r5 & 63
            int r4 = r4 << 6
            r3 = r3 | r4
            r4 = r7 & 63
            r3 = r3 | r4
            int r4 = r2 + 1
            int r5 = r3 >>> 10
            r6 = 55232(0xd7c0, float:7.7397E-41)
            int r5 = r5 + r6
            char r5 = (char) r5     // Catch: java.lang.Throwable -> L2f
            r0[r2] = r5     // Catch: java.lang.Throwable -> L2f
            int r2 = r2 + 2
            r3 = r3 & 1023(0x3ff, float:1.434E-42)
            r5 = 56320(0xdc00, float:7.8921E-41)
            int r3 = r3 + r5
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L2f
            r0[r4] = r3     // Catch: java.lang.Throwable -> L2f
            goto L1f
        Ld2:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r12 = "Invalid String"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L2f
            throw r11     // Catch: java.lang.Throwable -> L2f
        Lda:
            if (r12 > r13) goto Le3
            java.lang.String r11 = new java.lang.String     // Catch: java.lang.Throwable -> L2f
            r11.<init>(r0, r1, r2)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r10)
            return r11
        Le3:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r12 = "Invalid String"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L2f
            throw r11     // Catch: java.lang.Throwable -> L2f
        Leb:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L2f
            throw r11
    }

    public void i() {
            r2 = this;
            java.lang.Object r0 = r2.f179j
            java.io.File r0 = (java.io.File) r0
            if (r0 != 0) goto L7
            goto L10
        L7:
            boolean r1 = r0.delete()
            if (r1 != 0) goto L10
            r0.deleteOnExit()
        L10:
            return
    }

    public int j(jf.d r3, int r4) {
            r2 = this;
            java.lang.Object r0 = r2.f179j
            ff.e r0 = (ff.e) r0
            jf.e r0 = r0.f3934d
            int r0 = r0.f6881e
            int r4 = r4 * 8
            int r4 = r4 + r0
            r2.a(r4)
            int r4 = r2.L()
            int r0 = r2.L()
            java.lang.Object r1 = r2.f178i
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r1.getInt()
            java.lang.String r0 = r2.y(r0)
            r3.f6872c = r0
            java.lang.String r0 = r2.v(r1)
            r3.f6873d = r0
            return r4
    }

    public int k(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f178i
            int[] r0 = (int[]) r0
            int r1 = r2.f177h
            int r3 = f(r0, r1, r3)
            if (r3 >= 0) goto Le
            r3 = -1
            return r3
        Le:
            java.lang.Object r0 = r2.f179j
            int[] r0 = (int[]) r0
            r3 = r0[r3]
            return r3
    }

    public s.i l(int r4) {
            r3 = this;
            if (r4 < 0) goto L7
            int r0 = r3.f177h
            if (r4 >= r0) goto L7
            goto L1b
        L7:
            java.lang.String r0 = "Index "
            java.lang.String r1 = ", size "
            java.lang.StringBuilder r0 = eh.a.t(r4, r0, r1)
            int r1 = r3.f177h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            o.b.e(r0)
        L1b:
            java.lang.Object r0 = r3.f179j
            s.i r0 = (s.i) r0
            if (r0 == 0) goto L2b
            int r1 = r0.f12025a
            int r2 = r0.f12026b
            int r2 = r2 + r1
            if (r4 >= r2) goto L2b
            if (r1 > r4) goto L2b
            return r0
        L2b:
            java.lang.Object r0 = r3.f178i
            j0.b r0 = (j0.b) r0
            int r4 = s.o.e(r4, r0)
            java.lang.Object[] r0 = r0.f6671g
            r4 = r0[r4]
            s.i r4 = (s.i) r4
            r3.f179j = r4
            return r4
    }

    public long m(int r10, int r11) {
            r9 = this;
            r0 = 0
            if (r11 > 0) goto L5
            return r0
        L5:
            int r2 = r11 >> 3
            r11 = r11 & 7
            r3 = 0
            r5 = r10
            r4 = r3
        Lc:
            if (r4 >= r2) goto L18
            long r6 = r9.r(r5)
            long r0 = r0 ^ r6
            int r5 = r5 + 8
            int r4 = r4 + 1
            goto Lc
        L18:
            int r11 = r11 << 3
        L1a:
            if (r3 >= r11) goto L2e
            java.lang.Object r2 = r9.f179j
            byte[] r2 = (byte[]) r2
            int r4 = r5 + 1
            r2 = r2[r5]
            long r5 = (long) r2
            r7 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r7
            long r5 = r5 << r3
            long r0 = r0 ^ r5
            int r3 = r3 + 8
            r5 = r4
            goto L1a
        L2e:
            r10 = r10 & 7
            int r10 = r10 << 3
            long r2 = r0 << r10
            int r10 = 64 - r10
            long r10 = r0 >>> r10
            long r10 = r10 | r2
            return r10
    }

    public o5.j n() {
            r6 = this;
            java.lang.Object r0 = r6.f179j
            k5.z r0 = (k5.z) r0
            java.lang.Object r1 = r6.f178i
            k5.u r1 = (k5.u) r1
            androidx.lifecycle.x r2 = r1.f7264b
            int r3 = r6.f177h
            int r3 = r3 + 8
            int r2 = r2.J(r3)
            r3 = -1
            o5.i r4 = o5.i.f9525g
            if (r2 == r3) goto L5a
            if (r2 != 0) goto L1a
            goto L5a
        L1a:
            java.lang.String r3 = ": Invalid debug offset"
            if (r2 >= 0) goto L33
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            r1.println(r0)
            return r4
        L33:
            androidx.lifecycle.x r5 = r1.f7263a
            java.lang.Object r5 = r5.f310h
            byte[] r5 = (byte[]) r5
            int r5 = r5.length
            if (r2 < r5) goto L51
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            r1.println(r0)
            return r4
        L51:
            if (r2 != 0) goto L54
            return r4
        L54:
            o5.h r0 = new o5.h
            r0.<init>(r1, r2, r6)
            return r0
        L5a:
            return r4
    }

    public int o(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.f178i
            f.b0 r0 = (f.b0) r0
            int r2 = r0.d(r2)
            if (r2 < 0) goto Lf
            int[] r0 = r0.f2776c
            r2 = r0[r2]
            return r2
        Lf:
            r2 = -1
            return r2
    }

    public k5.b0 p() {
            r3 = this;
            java.lang.Object r0 = r3.f178i
            k5.u r0 = (k5.u) r0
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r3.f177h
            int r2 = r1 + 12
            int r0 = r0.N(r2)
            int r1 = r1 + 16
            int r0 = r0 * 2
            int r0 = r0 + r1
            k5.b0 r2 = new k5.b0
            r2.<init>(r3, r1, r0)
            return r2
    }

    public int q() {
            r5 = this;
            java.lang.Object r0 = r5.f179j
            byte[] r0 = (byte[]) r0
            int r1 = r5.f177h
            int r2 = r1 + 1
            r5.f177h = r2
            r3 = r0[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r1 + 2
            r5.f177h = r4
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            int r3 = r1 + 3
            r5.f177h = r3
            r4 = r0[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r2 = r2 | r4
            int r1 = r1 + 4
            r5.f177h = r1
            r0 = r0[r3]
            int r0 = r0 << 24
            r0 = r0 | r2
            return r0
    }

    public long r(int r10) {
            r9 = this;
            java.lang.Object r0 = r9.f179j
            byte[] r0 = (byte[]) r0
            int r1 = r10 + 1
            r2 = r0[r10]
            long r2 = (long) r2
            r4 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r4
            int r6 = r10 + 2
            r1 = r0[r1]
            long r7 = (long) r1
            long r7 = r7 & r4
            r1 = 8
            long r7 = r7 << r1
            long r1 = r2 | r7
            int r3 = r10 + 3
            r6 = r0[r6]
            long r6 = (long) r6
            long r6 = r6 & r4
            r8 = 16
            long r6 = r6 << r8
            long r1 = r1 | r6
            int r6 = r10 + 4
            r3 = r0[r3]
            long r7 = (long) r3
            long r7 = r7 & r4
            r3 = 24
            long r7 = r7 << r3
            long r1 = r1 | r7
            int r3 = r10 + 5
            r6 = r0[r6]
            long r6 = (long) r6
            long r6 = r6 & r4
            r8 = 32
            long r6 = r6 << r8
            long r1 = r1 | r6
            int r6 = r10 + 6
            r3 = r0[r3]
            long r7 = (long) r3
            long r7 = r7 & r4
            r3 = 40
            long r7 = r7 << r3
            long r1 = r1 | r7
            int r10 = r10 + 7
            r3 = r0[r6]
            long r6 = (long) r3
            long r3 = r6 & r4
            r5 = 48
            long r3 = r3 << r5
            long r1 = r1 | r3
            r10 = r0[r10]
            long r3 = (long) r10
            r10 = 56
            long r3 = r3 << r10
            long r0 = r1 | r3
            return r0
    }

    public jf.g s(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f179j
            ff.e r0 = (ff.e) r0
            jf.e r0 = r0.f3934d
            int r0 = r0.f6882f
            int r3 = r3 * 12
            int r3 = r3 + r0
            r2.a(r3)
            r3 = 4
            r2.M(r3)
            java.lang.Object r3 = r2.f178i
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r0 = r3.getInt()
            int r3 = r3.getInt()
            jf.g r1 = new jf.g
            if (r3 != 0) goto L25
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            goto L2c
        L25:
            r2.a(r3)
            java.util.List r3 = r2.J()
        L2c:
            java.lang.String r0 = r2.y(r0)
            r1.<init>(r3, r0)
            return r1
    }

    @Override // w4.e
    public int size() {
            r1 = this;
            int r0 = r1.f177h
            return r0
    }

    public int t() {
            r2 = this;
            java.lang.Object r0 = r2.f178i
            k5.u r0 = (k5.u) r0
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r2.f177h
            int r0 = r0.P(r1)
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.f176g
            switch(r0) {
                case 5: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.Object r0 = r4.f178i
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r4.f177h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "SectionReader{buf="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", offset="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "}"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    public short u() {
            r4 = this;
            java.lang.Object r0 = r4.f179j
            byte[] r0 = (byte[]) r0
            int r1 = r4.f177h
            int r2 = r1 + 1
            r4.f177h = r2
            r3 = r0[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r1 = r1 + 2
            r4.f177h = r1
            r0 = r0[r2]
            int r0 = r0 << 8
            r0 = r0 | r3
            short r0 = (short) r0
            return r0
    }

    public java.lang.String v(int r8) {
            r7 = this;
            r0 = -1
            if (r8 != r0) goto L5
            r8 = 0
            return r8
        L5:
            java.lang.Object r0 = r7.f179j
            ff.e r0 = (ff.e) r0
            jf.e r0 = r0.f3934d
            int r0 = r0.f6879c
            int r8 = r8 * 4
            int r8 = r8 + r0
            r7.a(r8)
            java.lang.Object r8 = r7.f178i
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            int r8 = r8.getInt()
            r7.a(r8)
            int r8 = a.a.H0(r7)
            char[] r8 = new char[r8]
            r0 = 0
            r1 = r0
        L26:
            int r2 = r7.K()
            r2 = r2 & 255(0xff, float:3.57E-43)
            char r2 = (char) r2
            if (r2 != 0) goto L35
            java.lang.String r2 = new java.lang.String
            r2.<init>(r8, r0, r1)
            return r2
        L35:
            r8[r1] = r2
            r3 = 128(0x80, float:1.8E-43)
            if (r2 >= r3) goto L3e
        L3b:
            int r1 = r1 + 1
            goto L26
        L3e:
            r4 = r2 & 224(0xe0, float:3.14E-43)
            r5 = 192(0xc0, float:2.69E-43)
            if (r4 != r5) goto L5f
            int r4 = r7.K()
            r5 = r4 & 192(0xc0, float:2.69E-43)
            if (r5 != r3) goto L57
            r2 = r2 & 31
            int r2 = r2 << 6
            r3 = r4 & 63
            r2 = r2 | r3
            char r2 = (char) r2
            r8[r1] = r2
            goto L3b
        L57:
            af.d r8 = new af.d
            java.lang.String r0 = "Bad second byte"
            r8.<init>(r0)
            throw r8
        L5f:
            r4 = r2 & 240(0xf0, float:3.36E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r4 != r5) goto L8d
            int r4 = r7.K()
            int r5 = r7.K()
            r6 = r4 & 192(0xc0, float:2.69E-43)
            if (r6 != r3) goto L85
            r6 = r5 & 192(0xc0, float:2.69E-43)
            if (r6 != r3) goto L85
            r2 = r2 & 15
            int r2 = r2 << 12
            r3 = r4 & 63
            int r3 = r3 << 6
            r2 = r2 | r3
            r3 = r5 & 63
            r2 = r2 | r3
            char r2 = (char) r2
            r8[r1] = r2
            goto L3b
        L85:
            af.d r8 = new af.d
            java.lang.String r0 = "Bad second or third byte"
            r8.<init>(r0)
            throw r8
        L8d:
            af.d r8 = new af.d
            java.lang.String r0 = "Bad byte"
            r8.<init>(r0)
            throw r8
    }

    public java.lang.String w(int r5) {
            r4 = this;
            if (r5 >= 0) goto L4
            r5 = 0
            return r5
        L4:
            if (r5 != 0) goto L9
            java.lang.String r5 = ""
            return r5
        L9:
            java.lang.Object r0 = r4.f179j
            byte[] r0 = (byte[]) r0
            r1 = 2048(0x800, float:2.87E-42)
            if (r5 <= r1) goto L1b
            java.lang.String r1 = new java.lang.String
            int r2 = r4.f177h
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            r1.<init>(r0, r2, r5, r3)
            goto L21
        L1b:
            int r1 = r4.f177h
            java.lang.String r1 = r4.h(r0, r1, r5)
        L21:
            int r0 = r4.f177h
            int r0 = r0 + r5
            r4.f177h = r0
            return r1
    }

    public java.lang.String y(int r2) {
            r1 = this;
            r0 = -1
            if (r2 != r0) goto L5
            r2 = 0
            return r2
        L5:
            java.lang.Object r0 = r1.f179j
            ff.e r0 = (ff.e) r0
            jf.e r0 = r0.f3934d
            int r0 = r0.f6880d
            int r2 = r2 * 4
            int r2 = r2 + r0
            r1.a(r2)
            java.lang.Object r2 = r1.f178i
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.getInt()
            java.lang.String r2 = r1.v(r2)
            return r2
    }

    public void z(int r11, int r12, int r13, int r14, int r15, int r16, boolean r17, boolean r18, boolean r19, int r20) {
            r10 = this;
            java.lang.Object r0 = r10.f178i
            long[] r0 = (long[]) r0
            int r1 = r10.f177h
            int r2 = r1 + 3
            r10.f177h = r2
            int r3 = r0.length
            if (r3 > r2) goto L23
            int r3 = r3 * 2
            int r2 = java.lang.Math.max(r3, r2)
            long[] r0 = java.util.Arrays.copyOf(r0, r2)
            r10.f178i = r0
            java.lang.Object r0 = r10.f179j
            long[] r0 = (long[]) r0
            long[] r0 = java.util.Arrays.copyOf(r0, r2)
            r10.f179j = r0
        L23:
            java.lang.Object r0 = r10.f178i
            long[] r0 = (long[]) r0
            long r2 = (long) r12
            r12 = 32
            long r2 = r2 << r12
            long r4 = (long) r13
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            long r2 = r2 | r4
            r0[r1] = r2
            int r13 = r1 + 1
            long r2 = (long) r14
            long r2 = r2 << r12
            long r4 = (long) r15
            long r4 = r4 & r6
            long r2 = r2 | r4
            r0[r13] = r2
            int r12 = r1 + 2
            r13 = r19
            long r2 = (long) r13
            r13 = 63
            long r2 = r2 << r13
            r13 = r18
            long r4 = (long) r13
            r13 = 62
            long r4 = r4 << r13
            long r2 = r2 | r4
            r13 = r17
            long r4 = (long) r13
            r13 = 61
            long r4 = r4 << r13
            long r2 = r2 | r4
            r13 = 1
            long r4 = (long) r13
            r13 = 60
            long r4 = r4 << r13
            long r2 = r2 | r4
            r13 = 0
            r4 = 1023(0x3ff, float:1.434E-42)
            int r13 = java.lang.Math.min(r13, r4)
            long r5 = (long) r13
            r13 = 50
            long r5 = r5 << r13
            long r2 = r2 | r5
            r5 = 33554431(0x1ffffff, float:9.403954E-38)
            r6 = r16 & r5
            long r7 = (long) r6
            r9 = 25
            long r7 = r7 << r9
            long r2 = r2 | r7
            r11 = r11 & r5
            long r7 = (long) r11
            long r2 = r2 | r7
            r0[r12] = r2
            if (r16 >= 0) goto L78
            goto L9f
        L78:
            r11 = -1
            r12 = r20
            if (r12 == r11) goto L7f
            r11 = r12
            goto L81
        L7f:
            int r11 = r1 + (-3)
        L81:
            if (r11 < 0) goto L9f
            int r12 = r11 + 2
            r2 = r0[r12]
            int r7 = (int) r2
            r7 = r7 & r5
            if (r7 != r6) goto L9c
            int r1 = r1 - r11
            int r1 = r1 / 3
            long r5 = g2.a.f4143a
            long r2 = r2 & r5
            int r11 = java.lang.Math.min(r1, r4)
            long r4 = (long) r11
            long r4 = r4 << r13
            long r1 = r2 | r4
            r0[r12] = r1
            return
        L9c:
            int r11 = r11 + (-3)
            goto L81
        L9f:
            return
    }
}

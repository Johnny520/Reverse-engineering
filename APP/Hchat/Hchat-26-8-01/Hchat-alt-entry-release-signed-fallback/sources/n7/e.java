package n7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends java.nio.charset.CharsetDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n7.e f9045a = null;

    static {
            n7.e r0 = new n7.e
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r2, r2)
            n7.e.f9045a = r0
            return
    }

    public static boolean a(int r2, int r3, int r4) {
            r0 = -32
            r1 = 128(0x80, float:1.8E-43)
            if (r2 != r0) goto La
            r2 = r3 & 224(0xe0, float:3.14E-43)
            if (r2 == r1) goto L15
        La:
            r2 = r3 & 192(0xc0, float:2.69E-43)
            if (r2 != r1) goto L15
            r2 = r4 & 192(0xc0, float:2.69E-43)
            if (r2 == r1) goto L13
            goto L15
        L13:
            r2 = 0
            return r2
        L15:
            r2 = 1
            return r2
    }

    public static boolean b(int r1) {
            r1 = r1 & 192(0xc0, float:2.69E-43)
            r0 = 128(0x80, float:1.8E-43)
            if (r1 == r0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public static java.nio.charset.CoderResult c(int r9, java.nio.ByteBuffer r10) {
            r0 = 1
            if (r9 == r0) goto L6d
            r1 = 2
            if (r9 == r1) goto L6d
            r2 = 128(0x80, float:1.8E-43)
            r3 = 3
            if (r9 == r3) goto L51
            r4 = 4
            if (r9 == r4) goto L10
            r9 = 0
            return r9
        L10:
            byte r9 = r10.get()
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r4 = r10.get()
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 244(0xf4, float:3.42E-43)
            if (r9 > r6) goto L4c
            r7 = 240(0xf0, float:3.36E-43)
            if (r9 != r7) goto L2c
            r8 = 144(0x90, float:2.02E-43)
            if (r5 < r8) goto L4c
            r8 = 191(0xbf, float:2.68E-43)
            if (r5 > r8) goto L4c
        L2c:
            if (r9 != r6) goto L32
            r9 = r4 & 240(0xf0, float:3.36E-43)
            if (r9 != r2) goto L4c
        L32:
            boolean r9 = b(r5)
            if (r9 != 0) goto L4c
            byte r9 = r10.get()
            boolean r9 = b(r9)
            if (r9 == 0) goto L47
            java.nio.charset.CoderResult r9 = java.nio.charset.CoderResult.malformedForLength(r1)
            return r9
        L47:
            java.nio.charset.CoderResult r9 = java.nio.charset.CoderResult.malformedForLength(r3)
            return r9
        L4c:
            java.nio.charset.CoderResult r9 = java.nio.charset.CoderResult.malformedForLength(r0)
            return r9
        L51:
            byte r9 = r10.get()
            byte r10 = r10.get()
            r3 = -32
            if (r9 != r3) goto L61
            r9 = r10 & 224(0xe0, float:3.14E-43)
            if (r9 == r2) goto L68
        L61:
            boolean r9 = b(r10)
            if (r9 != 0) goto L68
            r0 = r1
        L68:
            java.nio.charset.CoderResult r9 = java.nio.charset.CoderResult.malformedForLength(r0)
            return r9
        L6d:
            java.nio.charset.CoderResult r9 = java.nio.charset.CoderResult.malformedForLength(r0)
            return r9
    }

    public static void d(java.nio.Buffer r1, int r2, java.nio.Buffer r3, int r4) {
            int r0 = r1.arrayOffset()
            int r2 = r2 - r0
            r1.position(r2)
            int r1 = r3.arrayOffset()
            int r4 = r4 - r1
            r3.position(r4)
            return
    }

    public static java.nio.charset.CoderResult e(java.nio.ByteBuffer r0, int r1, int r2) {
            r0.position(r1)
            if (r2 == 0) goto Le
            int r0 = r0.remaining()
            if (r0 < r2) goto Le
            java.nio.charset.CoderResult r0 = java.nio.charset.CoderResult.OVERFLOW
            return r0
        Le:
            java.nio.charset.CoderResult r0 = java.nio.charset.CoderResult.UNDERFLOW
            return r0
    }

    public static java.nio.charset.CoderResult f(java.nio.ByteBuffer r0, int r1, int r2, java.nio.CharBuffer r3, int r4, int r5) {
            d(r0, r1, r3, r4)
            if (r5 == 0) goto Lb
            int r2 = r2 - r1
            if (r2 < r5) goto Lb
            java.nio.charset.CoderResult r0 = java.nio.charset.CoderResult.OVERFLOW
            return r0
        Lb:
            java.nio.charset.CoderResult r0 = java.nio.charset.CoderResult.UNDERFLOW
            return r0
    }

    @Override // java.nio.charset.CharsetDecoder
    public final java.nio.charset.CoderResult decodeLoop(java.nio.ByteBuffer r20, java.nio.CharBuffer r21) {
            r19 = this;
            r0 = r20
            r3 = r21
            boolean r1 = r0.hasArray()
            r2 = -32
            r4 = 128(0x80, float:1.8E-43)
            r6 = 1
            r7 = 2
            r8 = 3
            r9 = -2
            if (r1 == 0) goto L144
            boolean r1 = r3.hasArray()
            if (r1 == 0) goto L144
            byte[] r1 = r0.array()
            int r10 = r0.arrayOffset()
            int r11 = r0.position()
            int r11 = r11 + r10
            int r10 = r0.arrayOffset()
            int r12 = r0.limit()
            int r12 = r12 + r10
            char[] r10 = r3.array()
            int r13 = r3.arrayOffset()
            int r14 = r3.position()
            int r14 = r14 + r13
            int r13 = r3.arrayOffset()
            int r15 = r3.limit()
            int r15 = r15 + r13
            int r13 = r12 - r11
            r16 = -123008(0xfffffffffffe1f80, float:NaN)
            int r5 = r15 - r14
            if (r5 >= r13) goto L4e
            r13 = r5
        L4e:
            int r13 = r13 + r14
        L4f:
            if (r14 >= r13) goto L5f
            r5 = r1[r11]
            if (r5 < 0) goto L5f
            int r17 = r14 + 1
            int r11 = r11 + 1
            char r5 = (char) r5
            r10[r14] = r5
            r14 = r17
            goto L4f
        L5f:
            if (r11 >= r12) goto L137
            r5 = r1[r11]
            if (r5 >= 0) goto L112
            int r13 = r5 >> 5
            if (r13 != r9) goto La2
            r13 = r5 & 30
            if (r13 == 0) goto La2
            int r13 = r12 - r11
            if (r13 < r7) goto L99
            if (r14 < r15) goto L74
            goto L99
        L74:
            int r13 = r11 + 1
            r13 = r1[r13]
            boolean r17 = b(r13)
            if (r17 == 0) goto L86
            d(r0, r11, r3, r14)
            java.nio.charset.CoderResult r0 = java.nio.charset.CoderResult.malformedForLength(r6)
            return r0
        L86:
            int r17 = r14 + 1
            int r5 = r5 << 6
            r5 = r5 ^ r13
            r5 = r5 ^ 3968(0xf80, float:5.56E-42)
            char r5 = (char) r5
            r10[r14] = r5
            int r11 = r11 + 2
            r14 = r11
            r11 = r1
            r1 = r14
        L95:
            r14 = r17
            goto L12d
        L99:
            r5 = 2
            r1 = r11
            r2 = r12
            r4 = r14
            java.nio.charset.CoderResult r0 = f(r0, r1, r2, r3, r4, r5)
            return r0
        La2:
            r18 = r11
            r11 = r1
            r1 = r18
            int r13 = r5 >> 4
            if (r13 == r9) goto Lbc
            int r2 = r0.arrayOffset()
            int r11 = r1 - r2
            r0.position(r11)
            java.nio.charset.CoderResult r2 = c(r6, r0)
            d(r0, r1, r3, r14)
            return r2
        Lbc:
            int r13 = r12 - r1
            if (r13 < r8) goto Lf2
            if (r14 < r15) goto Lc3
            goto Lf2
        Lc3:
            int r13 = r1 + 1
            r13 = r11[r13]
            int r17 = r1 + 2
            r7 = r11[r17]
            boolean r17 = a(r5, r13, r7)
            if (r17 == 0) goto Le2
            int r2 = r0.arrayOffset()
            int r11 = r1 - r2
            r0.position(r11)
            java.nio.charset.CoderResult r2 = c(r8, r0)
            d(r0, r1, r3, r14)
            return r2
        Le2:
            int r17 = r14 + 1
            int r5 = r5 << 12
            int r13 = r13 << 6
            r5 = r5 ^ r13
            r5 = r5 ^ r7
            r5 = r5 ^ r16
            char r5 = (char) r5
            r10[r14] = r5
            int r1 = r1 + 3
            goto L95
        Lf2:
            if (r13 <= r6) goto L10a
            int r7 = r1 + 1
            r7 = r11[r7]
            if (r5 != r2) goto Lfe
            r2 = r7 & 224(0xe0, float:3.14E-43)
            if (r2 == r4) goto L102
        Lfe:
            r2 = r7 & 192(0xc0, float:2.69E-43)
            if (r2 == r4) goto L10a
        L102:
            d(r0, r1, r3, r14)
            java.nio.charset.CoderResult r0 = java.nio.charset.CoderResult.malformedForLength(r6)
            return r0
        L10a:
            r5 = 3
            r2 = r12
            r4 = r14
            java.nio.charset.CoderResult r0 = f(r0, r1, r2, r3, r4, r5)
            return r0
        L112:
            r18 = r11
            r11 = r1
            r1 = r18
            if (r14 < r15) goto L125
            r5 = 1
            r0 = r20
            r3 = r21
            r2 = r12
            r4 = r14
            java.nio.charset.CoderResult r0 = f(r0, r1, r2, r3, r4, r5)
            return r0
        L125:
            int r0 = r14 + 1
            char r3 = (char) r5
            r10[r14] = r3
            int r1 = r1 + 1
            r14 = r0
        L12d:
            r0 = r11
            r11 = r1
            r1 = r0
            r0 = r20
            r3 = r21
            r7 = 2
            goto L5f
        L137:
            r1 = r11
            r5 = 0
            r0 = r20
            r3 = r21
            r2 = r12
            r4 = r14
            java.nio.charset.CoderResult r0 = f(r0, r1, r2, r3, r4, r5)
            return r0
        L144:
            r16 = -123008(0xfffffffffffe1f80, float:NaN)
            int r1 = r0.position()
            int r5 = r0.limit()
        L14f:
            if (r1 >= r5) goto L205
            byte r7 = r0.get()
            if (r7 >= 0) goto L1f1
            int r10 = r7 >> 5
            if (r10 != r9) goto L190
            r10 = r7 & 30
            if (r10 == 0) goto L190
            int r10 = r5 - r1
            r11 = 2
            if (r10 < r11) goto L18b
            int r10 = r3.remaining()
            if (r10 >= r6) goto L16c
            r11 = 2
            goto L18b
        L16c:
            byte r10 = r0.get()
            boolean r11 = b(r10)
            if (r11 == 0) goto L17e
            r0.position(r1)
            java.nio.charset.CoderResult r0 = java.nio.charset.CoderResult.malformedForLength(r6)
            return r0
        L17e:
            int r7 = r7 << 6
            r7 = r7 ^ r10
            r7 = r7 ^ 3968(0xf80, float:5.56E-42)
            char r7 = (char) r7
            r3.put(r7)
            int r1 = r1 + 2
            r11 = 2
            goto L14f
        L18b:
            java.nio.charset.CoderResult r0 = e(r0, r1, r11)
            return r0
        L190:
            r11 = 2
            int r10 = r7 >> 4
            if (r10 == r9) goto L1a0
            r0.position(r1)
            java.nio.charset.CoderResult r2 = java.nio.charset.CoderResult.malformedForLength(r6)
            r0.position(r1)
            return r2
        L1a0:
            int r10 = r5 - r1
            if (r10 < r8) goto L1d4
            int r12 = r3.remaining()
            if (r12 >= r6) goto L1ab
            goto L1d4
        L1ab:
            byte r10 = r0.get()
            byte r12 = r0.get()
            boolean r13 = a(r7, r10, r12)
            if (r13 == 0) goto L1c4
            r0.position(r1)
            java.nio.charset.CoderResult r2 = c(r8, r0)
            r0.position(r1)
            return r2
        L1c4:
            int r7 = r7 << 12
            int r10 = r10 << 6
            r7 = r7 ^ r10
            r7 = r7 ^ r12
            r7 = r7 ^ r16
            char r7 = (char) r7
            r3.put(r7)
            int r1 = r1 + 3
            goto L14f
        L1d4:
            if (r10 <= r6) goto L1ec
            byte r3 = r0.get()
            if (r7 != r2) goto L1e0
            r2 = r3 & 224(0xe0, float:3.14E-43)
            if (r2 == r4) goto L1e4
        L1e0:
            r2 = r3 & 192(0xc0, float:2.69E-43)
            if (r2 == r4) goto L1ec
        L1e4:
            r0.position(r1)
            java.nio.charset.CoderResult r0 = java.nio.charset.CoderResult.malformedForLength(r6)
            return r0
        L1ec:
            java.nio.charset.CoderResult r0 = e(r0, r1, r8)
            return r0
        L1f1:
            r11 = 2
            int r10 = r3.remaining()
            if (r10 >= r6) goto L1fd
            java.nio.charset.CoderResult r0 = e(r0, r1, r6)
            return r0
        L1fd:
            char r7 = (char) r7
            r3.put(r7)
            int r1 = r1 + 1
            goto L14f
        L205:
            r2 = 0
            java.nio.charset.CoderResult r0 = e(r0, r1, r2)
            return r0
    }
}

package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛲᛶᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0241 extends xhss.AbstractC0561 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int f907;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.String f908;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final boolean f909;

    public C0241(java.lang.String r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f908 = r1
            r0.f907 = r2
            r0.f909 = r3
            return
    }

    @Override // xhss.AbstractC0561
    /* JADX INFO: renamed from: ᛸᛶᲈᛶ */
    public final int mo135(xhss.C0099 r22) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = 0
            java.lang.String r3 = r0.f908
            if (r3 == 0) goto L325
            int r4 = r3.length()
            r5 = 5
            if (r4 != 0) goto L16
            int r4 = r0.f907
            if (r4 == r5) goto L16
            r0.f907 = r5
        L16:
            xhss.ᛶᛵᲇᛸ r4 = r1.f459
            r4.getClass()
            int r4 = r3.length()
            r6 = r2
        L20:
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r4) goto L2d
            char r8 = r3.charAt(r6)
            if (r8 >= r7) goto L2d
            int r6 = r6 + 1
            goto L20
        L2d:
            r8 = r4
        L2e:
            r9 = 1
            r10 = 57343(0xdfff, float:8.0355E-41)
            r11 = 55296(0xd800, float:7.7486E-41)
            r12 = 2048(0x800, float:2.87E-42)
            if (r6 >= r4) goto L75
            char r13 = r3.charAt(r6)
            if (r13 >= r12) goto L47
            int r9 = 127 - r13
            int r9 = r9 >>> 31
            int r8 = r8 + r9
            int r6 = r6 + 1
            goto L2e
        L47:
            int r13 = r3.length()
            r14 = r2
        L4c:
            if (r6 >= r13) goto L74
            char r15 = r3.charAt(r6)
            if (r15 >= r12) goto L5a
            int r15 = 127 - r15
            int r15 = r15 >>> 31
            int r14 = r14 + r15
            goto L71
        L5a:
            int r14 = r14 + 2
            if (r11 > r15) goto L71
            if (r15 > r10) goto L71
            int r15 = java.lang.Character.codePointAt(r3, r6)
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r15 < r5) goto L6b
            int r6 = r6 + 1
            goto L71
        L6b:
            xhss.ᛲᛴᛴᲁ r0 = new xhss.ᛲᛴᛴᲁ
            r0.<init>(r6, r13)
            throw r0
        L71:
            int r6 = r6 + r9
            r5 = 5
            goto L4c
        L74:
            int r8 = r8 + r14
        L75:
            if (r8 < r4) goto L30a
            r1.m254(r2)
            r1.m263(r9, r8, r9)
            java.nio.ByteBuffer r4 = r1.f458
            int r5 = r1.f455
            int r5 = r5 - r8
            r1.f455 = r5
            r4.position(r5)
            java.nio.ByteBuffer r4 = r1.f458
            boolean r5 = r4.hasArray()
            java.lang.String r6 = " at index "
            java.lang.String r8 = "Failed writing "
            if (r5 == 0) goto L1bd
            int r5 = r4.arrayOffset()
            byte[] r13 = r4.array()
            int r14 = r4.position()
            int r14 = r14 + r5
            int r15 = r4.remaining()
            int r2 = r3.length()
            int r15 = r15 + r14
            r17 = r9
            r9 = 0
        Lac:
            if (r9 >= r2) goto Lc4
            int r10 = r9 + r14
            if (r10 >= r15) goto Lc4
            char r11 = r3.charAt(r9)
            if (r11 >= r7) goto Lc4
            byte r11 = (byte) r11
            r13[r10] = r11
            int r9 = r9 + 1
            r10 = 57343(0xdfff, float:8.0355E-41)
            r11 = 55296(0xd800, float:7.7486E-41)
            goto Lac
        Lc4:
            if (r9 != r2) goto Lcb
            int r14 = r14 + r2
        Lc7:
            r20 = r5
            goto L1b6
        Lcb:
            int r14 = r14 + r9
        Lcc:
            if (r9 >= r2) goto Lc7
            char r10 = r3.charAt(r9)
            if (r10 >= r7) goto Le0
            if (r14 >= r15) goto Le0
            int r11 = r14 + 1
            byte r10 = (byte) r10
            r13[r14] = r10
            r20 = r5
            r14 = r11
            goto L16b
        Le0:
            if (r10 >= r12) goto Lfb
            int r11 = r15 + (-2)
            if (r14 > r11) goto Lfb
            int r11 = r14 + 1
            int r12 = r10 >>> 6
            r12 = r12 | 960(0x3c0, float:1.345E-42)
            byte r12 = (byte) r12
            r13[r14] = r12
            int r14 = r14 + 2
            r10 = r10 & 63
            r10 = r10 | r7
            byte r10 = (byte) r10
            r13[r11] = r10
            r20 = r5
            goto L16b
        Lfb:
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r10 < r11) goto L109
            r11 = 57343(0xdfff, float:8.0355E-41)
            if (r11 >= r10) goto L106
            goto L109
        L106:
            r20 = r5
            goto L12b
        L109:
            int r11 = r15 + (-3)
            if (r14 > r11) goto L106
            int r11 = r14 + 1
            int r12 = r10 >>> 12
            r12 = r12 | 480(0x1e0, float:6.73E-43)
            byte r12 = (byte) r12
            r13[r14] = r12
            int r12 = r14 + 2
            int r19 = r10 >>> 6
            r20 = r5
            r5 = r19 & 63
            r5 = r5 | r7
            byte r5 = (byte) r5
            r13[r11] = r5
            int r14 = r14 + 3
            r5 = r10 & 63
            r5 = r5 | r7
            byte r5 = (byte) r5
            r13[r12] = r5
            goto L16b
        L12b:
            int r5 = r15 + (-4)
            if (r14 > r5) goto L17c
            int r5 = r9 + 1
            int r11 = r3.length()
            if (r5 == r11) goto L174
            char r9 = r3.charAt(r5)
            boolean r11 = java.lang.Character.isSurrogatePair(r10, r9)
            if (r11 == 0) goto L173
            int r9 = java.lang.Character.toCodePoint(r10, r9)
            int r10 = r14 + 1
            int r11 = r9 >>> 18
            r11 = r11 | 240(0xf0, float:3.36E-43)
            byte r11 = (byte) r11
            r13[r14] = r11
            int r11 = r14 + 2
            int r12 = r9 >>> 12
            r12 = r12 & 63
            r12 = r12 | r7
            byte r12 = (byte) r12
            r13[r10] = r12
            int r10 = r14 + 3
            int r12 = r9 >>> 6
            r12 = r12 & 63
            r12 = r12 | r7
            byte r12 = (byte) r12
            r13[r11] = r12
            int r14 = r14 + 4
            r9 = r9 & 63
            r9 = r9 | r7
            byte r9 = (byte) r9
            r13[r10] = r9
            r9 = r5
        L16b:
            int r9 = r9 + 1
            r5 = r20
            r12 = 2048(0x800, float:2.87E-42)
            goto Lcc
        L173:
            r9 = r5
        L174:
            xhss.ᛲᛴᛴᲁ r0 = new xhss.ᛲᛴᛴᲁ
            int r9 = r9 + (-1)
            r0.<init>(r9, r2)
            throw r0
        L17c:
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r11 > r10) goto L19e
            r11 = 57343(0xdfff, float:8.0355E-41)
            if (r10 > r11) goto L19e
            int r0 = r9 + 1
            int r1 = r3.length()
            if (r0 == r1) goto L198
            char r0 = r3.charAt(r0)
            boolean r0 = java.lang.Character.isSurrogatePair(r10, r0)
            if (r0 != 0) goto L19e
        L198:
            xhss.ᛲᛴᛴᲁ r0 = new xhss.ᛲᛴᛴᲁ
            r0.<init>(r9, r2)
            throw r0
        L19e:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            r1.append(r10)
            r1.append(r6)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1b6:
            int r14 = r14 - r20
            r4.position(r14)
            goto L292
        L1bd:
            r17 = r9
            int r2 = r3.length()
            int r5 = r4.position()
            r9 = 0
        L1c8:
            if (r9 >= r2) goto L1dd
            char r10 = r3.charAt(r9)     // Catch: java.lang.IndexOutOfBoundsException -> L1d9
            if (r10 >= r7) goto L1dd
            int r11 = r5 + r9
            byte r10 = (byte) r10     // Catch: java.lang.IndexOutOfBoundsException -> L1d9
            r4.put(r11, r10)     // Catch: java.lang.IndexOutOfBoundsException -> L1d9
            int r9 = r9 + 1
            goto L1c8
        L1d9:
            r2 = r17
            goto L2df
        L1dd:
            if (r9 != r2) goto L1e6
            int r2 = r5 + r9
            r4.position(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L1d9
            goto L292
        L1e6:
            int r5 = r5 + r9
        L1e7:
            if (r9 >= r2) goto L28f
            char r10 = r3.charAt(r9)     // Catch: java.lang.IndexOutOfBoundsException -> L1d9
            if (r10 >= r7) goto L1fb
            byte r10 = (byte) r10     // Catch: java.lang.IndexOutOfBoundsException -> L1d9
            r4.put(r5, r10)     // Catch: java.lang.IndexOutOfBoundsException -> L1d9
        L1f3:
            r12 = 55296(0xd800, float:7.7486E-41)
            r13 = 57343(0xdfff, float:8.0355E-41)
            goto L286
        L1fb:
            r11 = 2048(0x800, float:2.87E-42)
            if (r10 >= r11) goto L214
            int r12 = r5 + 1
            int r13 = r10 >>> 6
            r13 = r13 | 192(0xc0, float:2.69E-43)
            byte r13 = (byte) r13
            r4.put(r5, r13)     // Catch: java.lang.IndexOutOfBoundsException -> L212
            r5 = r10 & 63
            r5 = r5 | r7
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L212
            r4.put(r12, r5)     // Catch: java.lang.IndexOutOfBoundsException -> L212
            r5 = r12
            goto L1f3
        L212:
            r5 = r12
            goto L1d9
        L214:
            r12 = 55296(0xd800, float:7.7486E-41)
            r13 = 57343(0xdfff, float:8.0355E-41)
            if (r10 < r12) goto L26a
            if (r13 >= r10) goto L21f
            goto L26a
        L21f:
            int r14 = r9 + 1
            if (r14 == r2) goto L264
            char r9 = r3.charAt(r14)     // Catch: java.lang.IndexOutOfBoundsException -> L25a
            boolean r15 = java.lang.Character.isSurrogatePair(r10, r9)     // Catch: java.lang.IndexOutOfBoundsException -> L25a
            if (r15 == 0) goto L263
            int r9 = java.lang.Character.toCodePoint(r10, r9)     // Catch: java.lang.IndexOutOfBoundsException -> L25a
            int r10 = r5 + 1
            int r15 = r9 >>> 18
            r15 = r15 | 240(0xf0, float:3.36E-43)
            byte r15 = (byte) r15
            r4.put(r5, r15)     // Catch: java.lang.IndexOutOfBoundsException -> L261
            int r15 = r5 + 2
            int r18 = r9 >>> 12
            r11 = r18 & 63
            r11 = r11 | r7
            byte r11 = (byte) r11
            r4.put(r10, r11)     // Catch: java.lang.IndexOutOfBoundsException -> L25d
            int r5 = r5 + 3
            int r10 = r9 >>> 6
            r10 = r10 & 63
            r10 = r10 | r7
            byte r10 = (byte) r10
            r4.put(r15, r10)     // Catch: java.lang.IndexOutOfBoundsException -> L25a
            r9 = r9 & 63
            r9 = r9 | r7
            byte r9 = (byte) r9     // Catch: java.lang.IndexOutOfBoundsException -> L25a
            r4.put(r5, r9)     // Catch: java.lang.IndexOutOfBoundsException -> L25a
            r9 = r14
            goto L286
        L25a:
            r9 = r14
            goto L1d9
        L25d:
            r9 = r14
            r5 = r15
            goto L1d9
        L261:
            r5 = r10
            goto L25a
        L263:
            r9 = r14
        L264:
            xhss.ᛲᛴᛴᲁ r0 = new xhss.ᛲᛴᛴᲁ     // Catch: java.lang.IndexOutOfBoundsException -> L1d9
            r0.<init>(r9, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L1d9
            throw r0     // Catch: java.lang.IndexOutOfBoundsException -> L1d9
        L26a:
            int r11 = r5 + 1
            int r14 = r10 >>> 12
            r14 = r14 | 224(0xe0, float:3.14E-43)
            byte r14 = (byte) r14
            r4.put(r5, r14)     // Catch: java.lang.IndexOutOfBoundsException -> L28c
            int r5 = r5 + 2
            int r14 = r10 >>> 6
            r14 = r14 & 63
            r14 = r14 | r7
            byte r14 = (byte) r14
            r4.put(r11, r14)     // Catch: java.lang.IndexOutOfBoundsException -> L1d9
            r10 = r10 & 63
            r10 = r10 | r7
            byte r10 = (byte) r10     // Catch: java.lang.IndexOutOfBoundsException -> L1d9
            r4.put(r5, r10)     // Catch: java.lang.IndexOutOfBoundsException -> L1d9
        L286:
            int r9 = r9 + 1
            int r5 = r5 + 1
            goto L1e7
        L28c:
            r5 = r11
            goto L1d9
        L28f:
            r4.position(r5)     // Catch: java.lang.IndexOutOfBoundsException -> L1d9
        L292:
            int r2 = r1.m256()
            int r3 = r0.f907
            r4 = 3
            r5 = 2
            r6 = r17
            if (r3 == r6) goto L2b1
            if (r3 == r5) goto L2af
            if (r3 == r4) goto L2ad
            r6 = 4
            if (r3 == r6) goto L2ab
            r7 = 5
            if (r3 != r7) goto L2a9
            goto L2b2
        L2a9:
            r0 = 0
            throw r0
        L2ab:
            r6 = r4
            goto L2b2
        L2ad:
            r6 = r5
            goto L2b2
        L2af:
            r6 = 1
            goto L2b2
        L2b1:
            r6 = 0
        L2b2:
            r1.m258(r4)
            r3 = 0
            r1.m253(r3, r2)
            boolean r0 = r0.f909
            r2 = 1
            if (r0 == 0) goto L2d4
            r1.m255(r2, r3)
            java.nio.ByteBuffer r3 = r1.f458
            int r4 = r1.f455
            int r4 = r4 - r2
            r1.f455 = r4
            byte r0 = (byte) r0
            r3.put(r4, r0)
            int[] r0 = r1.f464
            int r3 = r1.m264()
            r0[r5] = r3
        L2d4:
            r1.m251(r2, r6)
            int r0 = r1.m257()
            r1.m259(r0)
            return r0
        L2df:
            int r0 = r4.position()
            int r1 = r4.position()
            int r5 = r5 - r1
            int r5 = r5 + r2
            int r1 = java.lang.Math.max(r9, r5)
            int r1 = r1 + r0
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            char r2 = r3.charAt(r9)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r8)
            r3.append(r2)
            r3.append(r6)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L30a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            long r1 = (long) r8
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            long r1 = r1 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "UTF-8 length does not fit in int: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L325:
            java.lang.String r0 = "value must be specified"
            xhss.C0532.m959(r0)
            r16 = 0
            return r16
    }
}

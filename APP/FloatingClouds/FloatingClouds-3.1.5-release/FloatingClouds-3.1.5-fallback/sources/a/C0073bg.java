package a;

/* JADX INFO: renamed from: a.bg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0073bg extends a.AbstractC0054ag {

    /* JADX INFO: renamed from: a.bg$a */
    public static class a extends java.lang.IllegalArgumentException {
        public a(int r3, int r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Unpaired surrogate at index "
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r3 = " of "
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }
    }

    @Override // a.AbstractC0054ag
    public final java.lang.String a(java.nio.ByteBuffer r12, int r13, int r14) {
            r11 = this;
            boolean r0 = r12.hasArray()
            r1 = -16
            r2 = -32
            java.lang.String r3 = "Invalid UTF-8"
            r4 = 0
            if (r0 == 0) goto Lc3
            byte[] r0 = r12.array()
            int r12 = r12.arrayOffset()
            int r12 = r12 + r13
            r13 = r12 | r14
            int r5 = r0.length
            int r5 = r5 - r12
            int r5 = r5 - r14
            r13 = r13 | r5
            if (r13 < 0) goto La6
            int r13 = r12 + r14
            char[] r9 = new char[r14]
            r14 = r4
        L23:
            if (r12 >= r13) goto L32
            r5 = r0[r12]
            if (r5 < 0) goto L32
            int r12 = r12 + 1
            int r6 = r14 + 1
            char r5 = (char) r5
            r9[r14] = r5
            r14 = r6
            goto L23
        L32:
            r10 = r14
        L33:
            if (r12 >= r13) goto La0
            int r14 = r12 + 1
            r5 = r0[r12]
            if (r5 < 0) goto L52
            int r12 = r10 + 1
            char r5 = (char) r5
            r9[r10] = r5
        L40:
            if (r14 >= r13) goto L4f
            r5 = r0[r14]
            if (r5 < 0) goto L4f
            int r14 = r14 + 1
            int r6 = r12 + 1
            char r5 = (char) r5
            r9[r12] = r5
            r12 = r6
            goto L40
        L4f:
            r10 = r12
            r12 = r14
            goto L33
        L52:
            if (r5 >= r2) goto L67
            if (r14 >= r13) goto L61
            int r12 = r12 + 2
            r14 = r0[r14]
            int r6 = r10 + 1
            a.AbstractC0054ag.a.c(r5, r14, r9, r10)
            r10 = r6
            goto L33
        L61:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>(r3)
            throw r12
        L67:
            if (r5 >= r1) goto L82
            int r6 = r13 + (-1)
            if (r14 >= r6) goto L7c
            int r6 = r12 + 2
            r14 = r0[r14]
            int r12 = r12 + 3
            r6 = r0[r6]
            int r7 = r10 + 1
            a.AbstractC0054ag.a.b(r5, r14, r6, r9, r10)
            r10 = r7
            goto L33
        L7c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>(r3)
            throw r12
        L82:
            int r6 = r13 + (-2)
            if (r14 >= r6) goto L9a
            int r6 = r12 + 2
            r14 = r0[r14]
            int r7 = r12 + 3
            r6 = r0[r6]
            int r12 = r12 + 4
            r8 = r0[r7]
            r7 = r6
            r6 = r14
            a.AbstractC0054ag.a.a(r5, r6, r7, r8, r9, r10)
            int r10 = r10 + 2
            goto L33
        L9a:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>(r3)
            throw r12
        La0:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r9, r4, r10)
            return r12
        La6:
            java.lang.ArrayIndexOutOfBoundsException r13 = new java.lang.ArrayIndexOutOfBoundsException
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r12 = new java.lang.Object[]{r0, r12, r14}
            java.lang.String r14 = "buffer length=%d, index=%d, size=%d"
            java.lang.String r12 = java.lang.String.format(r14, r12)
            r13.<init>(r12)
            throw r13
        Lc3:
            r0 = r13 | r14
            int r5 = r12.limit()
            int r5 = r5 - r13
            int r5 = r5 - r14
            r0 = r0 | r5
            if (r0 < 0) goto L168
            int r0 = r13 + r14
            char[] r9 = new char[r14]
            r14 = r4
        Ld3:
            if (r13 >= r0) goto Le4
            byte r5 = r12.get(r13)
            if (r5 < 0) goto Le4
            int r13 = r13 + 1
            int r6 = r14 + 1
            char r5 = (char) r5
            r9[r14] = r5
            r14 = r6
            goto Ld3
        Le4:
            r10 = r14
        Le5:
            if (r13 >= r0) goto L162
            int r14 = r13 + 1
            byte r5 = r12.get(r13)
            if (r5 < 0) goto L108
            int r13 = r10 + 1
            char r5 = (char) r5
            r9[r10] = r5
        Lf4:
            if (r14 >= r0) goto L105
            byte r5 = r12.get(r14)
            if (r5 < 0) goto L105
            int r14 = r14 + 1
            int r6 = r13 + 1
            char r5 = (char) r5
            r9[r13] = r5
            r13 = r6
            goto Lf4
        L105:
            r10 = r13
            r13 = r14
            goto Le5
        L108:
            if (r5 >= r2) goto L11f
            if (r14 >= r0) goto L119
            int r13 = r13 + 2
            byte r14 = r12.get(r14)
            int r6 = r10 + 1
            a.AbstractC0054ag.a.c(r5, r14, r9, r10)
            r10 = r6
            goto Le5
        L119:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>(r3)
            throw r12
        L11f:
            if (r5 >= r1) goto L13e
            int r6 = r0 + (-1)
            if (r14 >= r6) goto L138
            int r6 = r13 + 2
            byte r14 = r12.get(r14)
            int r13 = r13 + 3
            byte r6 = r12.get(r6)
            int r7 = r10 + 1
            a.AbstractC0054ag.a.b(r5, r14, r6, r9, r10)
            r10 = r7
            goto Le5
        L138:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>(r3)
            throw r12
        L13e:
            int r6 = r0 + (-2)
            if (r14 >= r6) goto L15c
            int r6 = r13 + 2
            byte r14 = r12.get(r14)
            int r7 = r13 + 3
            byte r6 = r12.get(r6)
            int r13 = r13 + 4
            byte r8 = r12.get(r7)
            r7 = r6
            r6 = r14
            a.AbstractC0054ag.a.a(r5, r6, r7, r8, r9, r10)
            int r10 = r10 + 2
            goto Le5
        L15c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>(r3)
            throw r12
        L162:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r9, r4, r10)
            return r12
        L168:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            int r12 = r12.limit()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r13, r14}
            java.lang.String r13 = "buffer limit=%d, index=%d, limit=%d"
            java.lang.String r12 = java.lang.String.format(r13, r12)
            r0.<init>(r12)
            throw r0
    }

    @Override // a.AbstractC0054ag
    public final void b(java.lang.CharSequence r18, java.nio.ByteBuffer r19) {
            r17 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1.hasArray()
            java.lang.String r3 = " at index "
            java.lang.String r4 = "Failed writing "
            r5 = 55296(0xd800, float:7.7486E-41)
            r6 = 57343(0xdfff, float:8.0355E-41)
            r7 = 2048(0x800, float:2.87E-42)
            r8 = 128(0x80, float:1.8E-43)
            r9 = 0
            if (r2 == 0) goto L123
            int r2 = r1.arrayOffset()
            byte[] r10 = r1.array()
            int r11 = r1.position()
            int r11 = r11 + r2
            int r12 = r1.remaining()
            int r13 = r0.length()
            int r12 = r12 + r11
        L2f:
            if (r9 >= r13) goto L41
            int r14 = r9 + r11
            if (r14 >= r12) goto L41
            char r15 = r0.charAt(r9)
            if (r15 >= r8) goto L41
            byte r15 = (byte) r15
            r10[r14] = r15
            int r9 = r9 + 1
            goto L2f
        L41:
            if (r9 != r13) goto L46
            int r11 = r11 + r13
            goto L11e
        L46:
            int r11 = r11 + r9
        L47:
            if (r9 >= r13) goto L11e
            char r14 = r0.charAt(r9)
            if (r14 >= r8) goto L59
            if (r11 >= r12) goto L59
            int r15 = r11 + 1
            byte r14 = (byte) r14
            r10[r11] = r14
            r11 = r15
            goto Ld5
        L59:
            if (r14 >= r7) goto L71
            int r15 = r12 + (-2)
            if (r11 > r15) goto L71
            int r15 = r11 + 1
            int r7 = r14 >>> 6
            r7 = r7 | 960(0x3c0, float:1.345E-42)
            byte r7 = (byte) r7
            r10[r11] = r7
            int r11 = r11 + 2
            r7 = r14 & 63
            r7 = r7 | r8
            byte r7 = (byte) r7
            r10[r15] = r7
            goto Ld5
        L71:
            if (r14 < r5) goto L75
            if (r6 >= r14) goto L95
        L75:
            int r7 = r12 + (-3)
            if (r11 > r7) goto L95
            int r7 = r11 + 1
            int r15 = r14 >>> 12
            r15 = r15 | 480(0x1e0, float:6.73E-43)
            byte r15 = (byte) r15
            r10[r11] = r15
            int r15 = r11 + 2
            int r16 = r14 >>> 6
            r6 = r16 & 63
            r6 = r6 | r8
            byte r6 = (byte) r6
            r10[r7] = r6
            int r11 = r11 + 3
            r6 = r14 & 63
            r6 = r6 | r8
            byte r6 = (byte) r6
            r10[r15] = r6
            goto Ld5
        L95:
            int r6 = r12 + (-4)
            if (r11 > r6) goto Le7
            int r6 = r9 + 1
            int r7 = r0.length()
            if (r6 == r7) goto Ldf
            char r7 = r0.charAt(r6)
            boolean r9 = java.lang.Character.isSurrogatePair(r14, r7)
            if (r9 == 0) goto Lde
            int r7 = java.lang.Character.toCodePoint(r14, r7)
            int r9 = r11 + 1
            int r14 = r7 >>> 18
            r14 = r14 | 240(0xf0, float:3.36E-43)
            byte r14 = (byte) r14
            r10[r11] = r14
            int r14 = r11 + 2
            int r15 = r7 >>> 12
            r15 = r15 & 63
            r15 = r15 | r8
            byte r15 = (byte) r15
            r10[r9] = r15
            int r9 = r11 + 3
            int r15 = r7 >>> 6
            r15 = r15 & 63
            r15 = r15 | r8
            byte r15 = (byte) r15
            r10[r14] = r15
            int r11 = r11 + 4
            r7 = r7 & 63
            r7 = r7 | r8
            byte r7 = (byte) r7
            r10[r9] = r7
            r9 = r6
        Ld5:
            int r9 = r9 + 1
            r6 = 57343(0xdfff, float:8.0355E-41)
            r7 = 2048(0x800, float:2.87E-42)
            goto L47
        Lde:
            r9 = r6
        Ldf:
            a.bg$a r0 = new a.bg$a
            int r9 = r9 + (-1)
            r0.<init>(r9, r13)
            throw r0
        Le7:
            if (r5 > r14) goto L106
            r1 = 57343(0xdfff, float:8.0355E-41)
            if (r14 > r1) goto L106
            int r1 = r9 + 1
            int r2 = r0.length()
            if (r1 == r2) goto L100
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r14, r0)
            if (r0 != 0) goto L106
        L100:
            a.bg$a r0 = new a.bg$a
            r0.<init>(r9, r13)
            throw r0
        L106:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            r1.append(r14)
            r1.append(r3)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L11e:
            int r11 = r11 - r2
            r1.position(r11)
            return
        L123:
            int r2 = r0.length()
            int r6 = r1.position()
        L12b:
            if (r9 >= r2) goto L13c
            char r7 = r0.charAt(r9)     // Catch: java.lang.IndexOutOfBoundsException -> L1eb
            if (r7 >= r8) goto L13c
            int r10 = r6 + r9
            byte r7 = (byte) r7     // Catch: java.lang.IndexOutOfBoundsException -> L1eb
            r1.put(r10, r7)     // Catch: java.lang.IndexOutOfBoundsException -> L1eb
            int r9 = r9 + 1
            goto L12b
        L13c:
            if (r9 != r2) goto L144
            int r2 = r6 + r9
            r1.position(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L1eb
            return
        L144:
            int r6 = r6 + r9
        L145:
            if (r9 >= r2) goto L1e7
            char r7 = r0.charAt(r9)     // Catch: java.lang.IndexOutOfBoundsException -> L1eb
            if (r7 >= r8) goto L158
            byte r7 = (byte) r7     // Catch: java.lang.IndexOutOfBoundsException -> L1eb
            r1.put(r6, r7)     // Catch: java.lang.IndexOutOfBoundsException -> L1eb
            r10 = 2048(0x800, float:2.87E-42)
        L153:
            r11 = 57343(0xdfff, float:8.0355E-41)
            goto L1df
        L158:
            r10 = 2048(0x800, float:2.87E-42)
            if (r7 >= r10) goto L172
            int r11 = r6 + 1
            int r12 = r7 >>> 6
            r12 = r12 | 192(0xc0, float:2.69E-43)
            byte r12 = (byte) r12
            r1.put(r6, r12)     // Catch: java.lang.IndexOutOfBoundsException -> L16f
            r6 = r7 & 63
            r6 = r6 | r8
            byte r6 = (byte) r6     // Catch: java.lang.IndexOutOfBoundsException -> L16f
            r1.put(r11, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L16f
            r6 = r11
            goto L153
        L16f:
            r6 = r11
            goto L1eb
        L172:
            r11 = 57343(0xdfff, float:8.0355E-41)
            if (r7 < r5) goto L1c3
            if (r11 >= r7) goto L17a
            goto L1c3
        L17a:
            int r12 = r9 + 1
            if (r12 == r2) goto L1bd
            char r9 = r0.charAt(r12)     // Catch: java.lang.IndexOutOfBoundsException -> L1b5
            boolean r13 = java.lang.Character.isSurrogatePair(r7, r9)     // Catch: java.lang.IndexOutOfBoundsException -> L1b5
            if (r13 == 0) goto L1bc
            int r7 = java.lang.Character.toCodePoint(r7, r9)     // Catch: java.lang.IndexOutOfBoundsException -> L1b5
            int r9 = r6 + 1
            int r13 = r7 >>> 18
            r13 = r13 | 240(0xf0, float:3.36E-43)
            byte r13 = (byte) r13
            r1.put(r6, r13)     // Catch: java.lang.IndexOutOfBoundsException -> L1ba
            int r13 = r6 + 2
            int r14 = r7 >>> 12
            r14 = r14 & 63
            r14 = r14 | r8
            byte r14 = (byte) r14
            r1.put(r9, r14)     // Catch: java.lang.IndexOutOfBoundsException -> L1b7
            int r6 = r6 + 3
            int r9 = r7 >>> 6
            r9 = r9 & 63
            r9 = r9 | r8
            byte r9 = (byte) r9
            r1.put(r13, r9)     // Catch: java.lang.IndexOutOfBoundsException -> L1b5
            r7 = r7 & 63
            r7 = r7 | r8
            byte r7 = (byte) r7     // Catch: java.lang.IndexOutOfBoundsException -> L1b5
            r1.put(r6, r7)     // Catch: java.lang.IndexOutOfBoundsException -> L1b5
            r9 = r12
            goto L1df
        L1b5:
            r9 = r12
            goto L1eb
        L1b7:
            r9 = r12
            r6 = r13
            goto L1eb
        L1ba:
            r6 = r9
            goto L1b5
        L1bc:
            r9 = r12
        L1bd:
            a.bg$a r5 = new a.bg$a     // Catch: java.lang.IndexOutOfBoundsException -> L1eb
            r5.<init>(r9, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L1eb
            throw r5     // Catch: java.lang.IndexOutOfBoundsException -> L1eb
        L1c3:
            int r12 = r6 + 1
            int r13 = r7 >>> 12
            r13 = r13 | 224(0xe0, float:3.14E-43)
            byte r13 = (byte) r13
            r1.put(r6, r13)     // Catch: java.lang.IndexOutOfBoundsException -> L1e5
            int r6 = r6 + 2
            int r13 = r7 >>> 6
            r13 = r13 & 63
            r13 = r13 | r8
            byte r13 = (byte) r13
            r1.put(r12, r13)     // Catch: java.lang.IndexOutOfBoundsException -> L1eb
            r7 = r7 & 63
            r7 = r7 | r8
            byte r7 = (byte) r7     // Catch: java.lang.IndexOutOfBoundsException -> L1eb
            r1.put(r6, r7)     // Catch: java.lang.IndexOutOfBoundsException -> L1eb
        L1df:
            int r9 = r9 + 1
            int r6 = r6 + 1
            goto L145
        L1e5:
            r6 = r12
            goto L1eb
        L1e7:
            r1.position(r6)     // Catch: java.lang.IndexOutOfBoundsException -> L1eb
            return
        L1eb:
            int r2 = r1.position()
            int r1 = r1.position()
            int r6 = r6 - r1
            int r6 = r6 + 1
            int r1 = java.lang.Math.max(r9, r6)
            int r1 = r1 + r2
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            char r0 = r0.charAt(r9)
            r5.append(r0)
            r5.append(r3)
            r5.append(r1)
            java.lang.String r0 = r5.toString()
            r2.<init>(r0)
            throw r2
    }

    @Override // a.AbstractC0054ag
    public final int c(java.lang.CharSequence r9) {
            r8 = this;
            int r0 = r9.length()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L13
            char r3 = r9.charAt(r2)
            r4 = 128(0x80, float:1.8E-43)
            if (r3 >= r4) goto L13
            int r2 = r2 + 1
            goto L6
        L13:
            r3 = r0
        L14:
            if (r2 >= r0) goto L59
            char r4 = r9.charAt(r2)
            r5 = 2048(0x800, float:2.87E-42)
            if (r4 >= r5) goto L26
            int r4 = 127 - r4
            int r4 = r4 >>> 31
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L14
        L26:
            int r4 = r9.length()
        L2a:
            if (r2 >= r4) goto L58
            char r6 = r9.charAt(r2)
            if (r6 >= r5) goto L38
            int r6 = 127 - r6
            int r6 = r6 >>> 31
            int r1 = r1 + r6
            goto L55
        L38:
            int r1 = r1 + 2
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r7 > r6) goto L55
            r7 = 57343(0xdfff, float:8.0355E-41)
            if (r6 > r7) goto L55
            int r6 = java.lang.Character.codePointAt(r9, r2)
            r7 = 65536(0x10000, float:9.1835E-41)
            if (r6 < r7) goto L4f
            int r2 = r2 + 1
            goto L55
        L4f:
            a.bg$a r9 = new a.bg$a
            r9.<init>(r2, r4)
            throw r9
        L55:
            int r2 = r2 + 1
            goto L2a
        L58:
            int r3 = r3 + r1
        L59:
            if (r3 < r0) goto L5c
            return r3
        L5c:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UTF-8 length does not fit in int: "
            r0.<init>(r1)
            long r1 = (long) r3
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            long r1 = r1 + r3
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
    }
}

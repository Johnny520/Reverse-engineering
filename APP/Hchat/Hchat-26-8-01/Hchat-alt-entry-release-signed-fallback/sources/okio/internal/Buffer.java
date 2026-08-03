package okio.internal;

/* JADX INFO: renamed from: okio.internal.-Buffer, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Buffer {
    private static final byte[] HEX_DIGIT_BYTES = null;
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    static {
            java.lang.String r0 = "0123456789abcdef"
            byte[] r0 = okio._JvmPlatformKt.asUtf8ToByteArray(r0)
            okio.internal.Buffer.HEX_DIGIT_BYTES = r0
            return
    }

    public static final void commonClear(okio.Buffer r2) {
            r2.getClass()
            long r0 = r2.size()
            r2.skip(r0)
            return
    }

    public static final void commonClose(okio.Buffer.UnsafeCursor r3) {
            r3.getClass()
            okio.Buffer r0 = r3.buffer
            if (r0 == 0) goto L19
            r0 = 0
            r3.buffer = r0
            r3.setSegment$okio(r0)
            r1 = -1
            r3.offset = r1
            r3.data = r0
            r0 = -1
            r3.start = r0
            r3.end = r0
            return
        L19:
            java.lang.String r3 = "not attached to a buffer"
            j8.o.A(r3)
            return
    }

    public static final long commonCompleteSegmentByteCount(okio.Buffer r5) {
            r5.getClass()
            long r0 = r5.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            return r2
        Le:
            okio.Segment r5 = r5.head
            r5.getClass()
            okio.Segment r5 = r5.prev
            r5.getClass()
            int r2 = r5.limit
            r3 = 8192(0x2000, float:1.148E-41)
            if (r2 >= r3) goto L27
            boolean r3 = r5.owner
            if (r3 == 0) goto L27
            int r5 = r5.pos
            int r2 = r2 - r5
            long r2 = (long) r2
            long r0 = r0 - r2
        L27:
            return r0
    }

    public static final okio.Buffer commonCopy(okio.Buffer r6) {
            r6.getClass()
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            long r1 = r6.size()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L13
            return r0
        L13:
            okio.Segment r1 = r6.head
            r1.getClass()
            okio.Segment r2 = r1.sharedCopy()
            r0.head = r2
            r2.prev = r2
            r2.next = r2
            okio.Segment r3 = r1.next
        L24:
            if (r3 == r1) goto L38
            okio.Segment r4 = r2.prev
            r4.getClass()
            r3.getClass()
            okio.Segment r5 = r3.sharedCopy()
            r4.push(r5)
            okio.Segment r3 = r3.next
            goto L24
        L38:
            long r1 = r6.size()
            r0.setSize$okio(r1)
            return r0
    }

    public static final okio.Buffer commonCopyTo(okio.Buffer r8, okio.Buffer r9, long r10, long r12) {
            r8.getClass()
            r9.getClass()
            long r0 = r8.size()
            r2 = r10
            r4 = r12
            okio.SegmentedByteString.checkOffsetAndCount(r0, r2, r4)
            r10 = 0
            int r12 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r12 != 0) goto L16
            goto L72
        L16:
            long r12 = r9.size()
            long r12 = r12 + r4
            r9.setSize$okio(r12)
            okio.Segment r12 = r8.head
        L20:
            r12.getClass()
            int r13 = r12.limit
            int r0 = r12.pos
            int r1 = r13 - r0
            long r6 = (long) r1
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 < 0) goto L34
            int r13 = r13 - r0
            long r0 = (long) r13
            long r2 = r2 - r0
            okio.Segment r12 = r12.next
            goto L20
        L34:
            r0 = r12
            r12 = r4
        L36:
            int r1 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r1 <= 0) goto L72
            r0.getClass()
            okio.Segment r1 = r0.sharedCopy()
            int r4 = r1.pos
            int r2 = (int) r2
            int r4 = r4 + r2
            r1.pos = r4
            int r2 = (int) r12
            int r4 = r4 + r2
            int r2 = r1.limit
            int r2 = java.lang.Math.min(r4, r2)
            r1.limit = r2
            okio.Segment r2 = r9.head
            if (r2 != 0) goto L5c
            r1.prev = r1
            r1.next = r1
            r9.head = r1
            goto L67
        L5c:
            r2.getClass()
            okio.Segment r2 = r2.prev
            r2.getClass()
            r2.push(r1)
        L67:
            int r2 = r1.limit
            int r1 = r1.pos
            int r2 = r2 - r1
            long r1 = (long) r2
            long r12 = r12 - r1
            okio.Segment r0 = r0.next
            r2 = r10
            goto L36
        L72:
            return r8
    }

    public static final boolean commonEquals(okio.Buffer r18, java.lang.Object r19) {
            r0 = r18
            r1 = r19
            r0.getClass()
            r2 = 1
            if (r0 != r1) goto Lb
            return r2
        Lb:
            boolean r3 = r1 instanceof okio.Buffer
            r4 = 0
            if (r3 != 0) goto L11
            return r4
        L11:
            long r5 = r0.size()
            okio.Buffer r1 = (okio.Buffer) r1
            long r7 = r1.size()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L20
            return r4
        L20:
            long r5 = r0.size()
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L2b
            return r2
        L2b:
            okio.Segment r3 = r0.head
            r3.getClass()
            okio.Segment r1 = r1.head
            r1.getClass()
            int r5 = r3.pos
            int r6 = r1.pos
            r9 = r7
        L3a:
            long r11 = r0.size()
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L81
            int r11 = r3.limit
            int r11 = r11 - r5
            int r12 = r1.limit
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L4e:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L69
            byte[] r15 = r3.data
            int r16 = r5 + 1
            r5 = r15[r5]
            byte[] r15 = r1.data
            int r17 = r6 + 1
            r6 = r15[r6]
            if (r5 == r6) goto L61
            return r4
        L61:
            r5 = 1
            long r13 = r13 + r5
            r5 = r16
            r6 = r17
            goto L4e
        L69:
            int r13 = r3.limit
            if (r5 != r13) goto L74
            okio.Segment r3 = r3.next
            r3.getClass()
            int r5 = r3.pos
        L74:
            int r13 = r1.limit
            if (r6 != r13) goto L7f
            okio.Segment r1 = r1.next
            r1.getClass()
            int r6 = r1.pos
        L7f:
            long r9 = r9 + r11
            goto L3a
        L81:
            return r2
    }

    public static final long commonExpandBuffer(okio.Buffer.UnsafeCursor r9, int r10) {
            r9.getClass()
            if (r10 <= 0) goto L4d
            r0 = 8192(0x2000, float:1.148E-41)
            if (r10 > r0) goto L43
            okio.Buffer r1 = r9.buffer
            if (r1 == 0) goto L3d
            boolean r2 = r9.readWrite
            if (r2 == 0) goto L35
            long r2 = r1.size()
            okio.Segment r10 = r1.writableSegment$okio(r10)
            int r4 = r10.limit
            int r4 = 8192 - r4
            r10.limit = r0
            long r5 = (long) r4
            long r7 = r2 + r5
            r1.setSize$okio(r7)
            r9.setSegment$okio(r10)
            r9.offset = r2
            byte[] r10 = r10.data
            r9.data = r10
            int r10 = 8192 - r4
            r9.start = r10
            r9.end = r0
            return r5
        L35:
            java.lang.String r9 = "expandBuffer() only permitted for read/write buffers"
            j8.o.A(r9)
        L3a:
            r9 = 0
            return r9
        L3d:
            java.lang.String r9 = "not attached to a buffer"
            j8.o.A(r9)
            goto L3a
        L43:
            java.lang.String r9 = "minByteCount > Segment.SIZE: "
            java.lang.String r9 = eh.a.l(r10, r9)
            j8.o.q(r9)
            goto L3a
        L4d:
            java.lang.String r9 = "minByteCount <= 0: "
            java.lang.String r9 = eh.a.l(r10, r9)
            j8.o.q(r9)
            goto L3a
    }

    public static final byte commonGet(okio.Buffer r6, long r7) {
            r6.getClass()
            long r0 = r6.size()
            r4 = 1
            r2 = r7
            okio.SegmentedByteString.checkOffsetAndCount(r0, r2, r4)
            okio.Segment r7 = r6.head
            r7.getClass()
            long r0 = r6.size()
            long r0 = r0 - r2
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 >= 0) goto L3b
            long r0 = r6.size()
        L1f:
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L30
            okio.Segment r7 = r7.prev
            r7.getClass()
            int r6 = r7.limit
            int r8 = r7.pos
            int r6 = r6 - r8
            long r4 = (long) r6
            long r0 = r0 - r4
            goto L1f
        L30:
            byte[] r6 = r7.data
            int r7 = r7.pos
            long r7 = (long) r7
            long r7 = r7 + r2
            long r7 = r7 - r0
            int r7 = (int) r7
            r6 = r6[r7]
            return r6
        L3b:
            r0 = 0
        L3d:
            int r6 = r7.limit
            int r8 = r7.pos
            int r6 = r6 - r8
            long r4 = (long) r6
            long r4 = r4 + r0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L4f
            okio.Segment r7 = r7.next
            r7.getClass()
            r0 = r4
            goto L3d
        L4f:
            byte[] r6 = r7.data
            long r7 = (long) r8
            long r7 = r7 + r2
            long r7 = r7 - r0
            int r7 = (int) r7
            r6 = r6[r7]
            return r6
    }

    public static final int commonHashCode(okio.Buffer r5) {
            r5.getClass()
            okio.Segment r0 = r5.head
            if (r0 != 0) goto L9
            r5 = 0
            return r5
        L9:
            r1 = 1
        La:
            int r2 = r0.pos
            int r3 = r0.limit
        Le:
            if (r2 >= r3) goto L1a
            int r1 = r1 * 31
            byte[] r4 = r0.data
            r4 = r4[r2]
            int r1 = r1 + r4
            int r2 = r2 + 1
            goto Le
        L1a:
            okio.Segment r0 = r0.next
            r0.getClass()
            okio.Segment r2 = r5.head
            if (r0 != r2) goto La
            return r1
    }

    public static final long commonIndexOf(okio.Buffer r9, byte r10, long r11, long r13) {
            r9.getClass()
            r0 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 > 0) goto Lbe
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 > 0) goto Lbe
            long r2 = r9.size()
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 <= 0) goto L19
            long r13 = r9.size()
        L19:
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            r3 = -1
            if (r2 != 0) goto L20
            return r3
        L20:
            okio.Segment r2 = r9.head
            if (r2 != 0) goto L25
            return r3
        L25:
            long r5 = r9.size()
            long r5 = r5 - r11
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L7a
            long r0 = r9.size()
        L32:
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 <= 0) goto L43
            okio.Segment r2 = r2.prev
            r2.getClass()
            int r9 = r2.limit
            int r5 = r2.pos
            int r9 = r9 - r5
            long r5 = (long) r9
            long r0 = r0 - r5
            goto L32
        L43:
            int r9 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r9 >= 0) goto L79
            byte[] r9 = r2.data
            int r5 = r2.limit
            long r5 = (long) r5
            int r7 = r2.pos
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            long r5 = java.lang.Math.min(r5, r7)
            int r5 = (int) r5
            int r6 = r2.pos
            long r6 = (long) r6
            long r6 = r6 + r11
            long r6 = r6 - r0
            int r11 = (int) r6
        L5c:
            if (r11 >= r5) goto L6b
            r12 = r9[r11]
            if (r12 != r10) goto L68
        L62:
            int r9 = r2.pos
            int r11 = r11 - r9
            long r9 = (long) r11
            long r9 = r9 + r0
            return r9
        L68:
            int r11 = r11 + 1
            goto L5c
        L6b:
            int r9 = r2.limit
            int r11 = r2.pos
            int r9 = r9 - r11
            long r11 = (long) r9
            long r0 = r0 + r11
            okio.Segment r2 = r2.next
            r2.getClass()
            r11 = r0
            goto L43
        L79:
            return r3
        L7a:
            int r9 = r2.limit
            int r5 = r2.pos
            int r9 = r9 - r5
            long r5 = (long) r9
            long r5 = r5 + r0
            int r9 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r9 > 0) goto L8c
            okio.Segment r2 = r2.next
            r2.getClass()
            r0 = r5
            goto L7a
        L8c:
            int r9 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r9 >= 0) goto Lbd
            byte[] r9 = r2.data
            int r5 = r2.limit
            long r5 = (long) r5
            int r7 = r2.pos
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            long r5 = java.lang.Math.min(r5, r7)
            int r5 = (int) r5
            int r6 = r2.pos
            long r6 = (long) r6
            long r6 = r6 + r11
            long r6 = r6 - r0
            int r11 = (int) r6
        La5:
            if (r11 >= r5) goto Laf
            r12 = r9[r11]
            if (r12 != r10) goto Lac
            goto L62
        Lac:
            int r11 = r11 + 1
            goto La5
        Laf:
            int r9 = r2.limit
            int r11 = r2.pos
            int r9 = r9 - r11
            long r11 = (long) r9
            long r0 = r0 + r11
            okio.Segment r2 = r2.next
            r2.getClass()
            r11 = r0
            goto L8c
        Lbd:
            return r3
        Lbe:
            long r9 = r9.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "size="
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = " fromIndex="
            r0.append(r9)
            r0.append(r11)
            java.lang.String r9 = " toIndex="
            r0.append(r9)
            r0.append(r13)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    public static final long commonIndexOf(okio.Buffer r20, okio.ByteString r21, long r22) {
            r0 = r22
            r20.getClass()
            r21.getClass()
            int r2 = r21.size()
            if (r2 <= 0) goto L10c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L100
            r4 = r20
            okio.Segment r5 = r4.head
            r6 = -1
            if (r5 != 0) goto L1d
            return r6
        L1d:
            long r8 = r4.size()
            long r8 = r8 - r0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r9 = 1
            r11 = 0
            r12 = 1
            if (r8 >= 0) goto L91
            long r2 = r4.size()
        L2e:
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 <= 0) goto L3f
            okio.Segment r5 = r5.prev
            r5.getClass()
            int r8 = r5.limit
            int r13 = r5.pos
            int r8 = r8 - r13
            long r13 = (long) r8
            long r2 = r2 - r13
            goto L2e
        L3f:
            byte[] r8 = r21.internalArray$okio()
            r11 = r8[r11]
            int r13 = r21.size()
            long r14 = r4.size()
            r16 = r6
            long r6 = (long) r13
            long r14 = r14 - r6
            long r14 = r14 + r9
        L52:
            int r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r4 >= 0) goto L90
            byte[] r4 = r5.data
            int r6 = r5.limit
            int r7 = r5.pos
            long r9 = (long) r7
            long r9 = r9 + r14
            long r9 = r9 - r2
            long r6 = (long) r6
            long r6 = java.lang.Math.min(r6, r9)
            int r6 = (int) r6
            int r7 = r5.pos
            long r9 = (long) r7
            long r9 = r9 + r0
            long r9 = r9 - r2
            int r0 = (int) r9
        L6b:
            if (r0 >= r6) goto L82
            r1 = r4[r0]
            if (r1 != r11) goto L7f
            int r1 = r0 + 1
            boolean r1 = rangeEquals(r5, r1, r8, r12, r13)
            if (r1 == 0) goto L7f
            int r1 = r5.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r0 = r0 + r2
            return r0
        L7f:
            int r0 = r0 + 1
            goto L6b
        L82:
            int r0 = r5.limit
            int r1 = r5.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r2 = r2 + r0
            okio.Segment r5 = r5.next
            r5.getClass()
            r0 = r2
            goto L52
        L90:
            return r16
        L91:
            r16 = r6
        L93:
            int r6 = r5.limit
            int r7 = r5.pos
            int r6 = r6 - r7
            long r6 = (long) r6
            long r6 = r6 + r2
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 > 0) goto La5
            okio.Segment r5 = r5.next
            r5.getClass()
            r2 = r6
            goto L93
        La5:
            byte[] r6 = r21.internalArray$okio()
            r7 = r6[r11]
            int r8 = r21.size()
            long r13 = r4.size()
            r18 = r9
            long r9 = (long) r8
            long r13 = r13 - r9
            long r13 = r13 + r18
        Lb9:
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 >= 0) goto Lff
            byte[] r4 = r5.data
            int r9 = r5.limit
            int r10 = r5.pos
            long r10 = (long) r10
            long r10 = r10 + r13
            long r10 = r10 - r2
            r20 = r13
            long r12 = (long) r9
            long r9 = java.lang.Math.min(r12, r10)
            int r9 = (int) r9
            int r10 = r5.pos
            long r10 = (long) r10
            long r10 = r10 + r0
            long r10 = r10 - r2
            int r0 = (int) r10
        Ld4:
            if (r0 >= r9) goto Led
            r1 = r4[r0]
            if (r1 != r7) goto Le9
            int r1 = r0 + 1
            r15 = 1
            boolean r1 = rangeEquals(r5, r1, r6, r15, r8)
            if (r1 == 0) goto Lea
            int r1 = r5.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r0 = r0 + r2
            return r0
        Le9:
            r15 = 1
        Lea:
            int r0 = r0 + 1
            goto Ld4
        Led:
            r15 = 1
            int r0 = r5.limit
            int r1 = r5.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r2 = r2 + r0
            okio.Segment r5 = r5.next
            r5.getClass()
            r13 = r20
            r0 = r2
            r12 = r15
            goto Lb9
        Lff:
            return r16
        L100:
            java.lang.String r2 = "fromIndex < 0: "
            java.lang.String r0 = bc.e.g(r0, r2)
            j8.o.q(r0)
            r0 = 0
            return r0
        L10c:
            java.lang.String r0 = "bytes is empty"
            j8.o.t(r0)
            r0 = 0
            return r0
    }

    public static final long commonIndexOfElement(okio.Buffer r11, okio.ByteString r12, long r13) {
            r11.getClass()
            r12.getClass()
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto L140
            okio.Segment r2 = r11.head
            r3 = -1
            if (r2 != 0) goto L13
            return r3
        L13:
            long r5 = r11.size()
            long r5 = r5 - r13
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            r6 = 2
            r7 = 0
            r8 = 1
            if (r5 >= 0) goto Lb1
            long r0 = r11.size()
        L23:
            int r5 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r5 <= 0) goto L34
            okio.Segment r2 = r2.prev
            r2.getClass()
            int r5 = r2.limit
            int r9 = r2.pos
            int r5 = r5 - r9
            long r9 = (long) r5
            long r0 = r0 - r9
            goto L23
        L34:
            int r5 = r12.size()
            if (r5 != r6) goto L74
            byte r5 = r12.getByte(r7)
            byte r12 = r12.getByte(r8)
        L42:
            long r6 = r11.size()
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 >= 0) goto Lb0
            byte[] r6 = r2.data
            int r7 = r2.pos
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            int r13 = (int) r7
            int r14 = r2.limit
        L54:
            if (r13 >= r14) goto L66
            r7 = r6[r13]
            if (r7 == r5) goto L60
            if (r7 != r12) goto L5d
            goto L60
        L5d:
            int r13 = r13 + 1
            goto L54
        L60:
            int r11 = r2.pos
            int r13 = r13 - r11
            long r11 = (long) r13
            long r11 = r11 + r0
            return r11
        L66:
            int r13 = r2.limit
            int r14 = r2.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r2 = r2.next
            r2.getClass()
            r13 = r0
            goto L42
        L74:
            byte[] r12 = r12.internalArray$okio()
        L78:
            long r5 = r11.size()
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto Lb0
            byte[] r5 = r2.data
            int r6 = r2.pos
            long r8 = (long) r6
            long r8 = r8 + r13
            long r8 = r8 - r0
            int r13 = (int) r8
            int r14 = r2.limit
        L8a:
            if (r13 >= r14) goto La2
            r6 = r5[r13]
            int r8 = r12.length
            r9 = r7
        L90:
            if (r9 >= r8) goto L9f
            r10 = r12[r9]
            if (r6 != r10) goto L9c
            int r11 = r2.pos
            int r13 = r13 - r11
            long r11 = (long) r13
            long r11 = r11 + r0
            return r11
        L9c:
            int r9 = r9 + 1
            goto L90
        L9f:
            int r13 = r13 + 1
            goto L8a
        La2:
            int r13 = r2.limit
            int r14 = r2.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r2 = r2.next
            r2.getClass()
            r13 = r0
            goto L78
        Lb0:
            return r3
        Lb1:
            int r5 = r2.limit
            int r9 = r2.pos
            int r5 = r5 - r9
            long r9 = (long) r5
            long r9 = r9 + r0
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 > 0) goto Lc3
            okio.Segment r2 = r2.next
            r2.getClass()
            r0 = r9
            goto Lb1
        Lc3:
            int r5 = r12.size()
            if (r5 != r6) goto L103
            byte r5 = r12.getByte(r7)
            byte r12 = r12.getByte(r8)
        Ld1:
            long r6 = r11.size()
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 >= 0) goto L13f
            byte[] r6 = r2.data
            int r7 = r2.pos
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            int r13 = (int) r7
            int r14 = r2.limit
        Le3:
            if (r13 >= r14) goto Lf5
            r7 = r6[r13]
            if (r7 == r5) goto Lef
            if (r7 != r12) goto Lec
            goto Lef
        Lec:
            int r13 = r13 + 1
            goto Le3
        Lef:
            int r11 = r2.pos
            int r13 = r13 - r11
            long r11 = (long) r13
            long r11 = r11 + r0
            return r11
        Lf5:
            int r13 = r2.limit
            int r14 = r2.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r2 = r2.next
            r2.getClass()
            r13 = r0
            goto Ld1
        L103:
            byte[] r12 = r12.internalArray$okio()
        L107:
            long r5 = r11.size()
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L13f
            byte[] r5 = r2.data
            int r6 = r2.pos
            long r8 = (long) r6
            long r8 = r8 + r13
            long r8 = r8 - r0
            int r13 = (int) r8
            int r14 = r2.limit
        L119:
            if (r13 >= r14) goto L131
            r6 = r5[r13]
            int r8 = r12.length
            r9 = r7
        L11f:
            if (r9 >= r8) goto L12e
            r10 = r12[r9]
            if (r6 != r10) goto L12b
            int r11 = r2.pos
            int r13 = r13 - r11
            long r11 = (long) r13
            long r11 = r11 + r0
            return r11
        L12b:
            int r9 = r9 + 1
            goto L11f
        L12e:
            int r13 = r13 + 1
            goto L119
        L131:
            int r13 = r2.limit
            int r14 = r2.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r2 = r2.next
            r2.getClass()
            r13 = r0
            goto L107
        L13f:
            return r3
        L140:
            java.lang.String r11 = "fromIndex < 0: "
            java.lang.String r11 = bc.e.g(r13, r11)
            j8.o.q(r11)
            r11 = 0
            return r11
    }

    public static final int commonNext(okio.Buffer.UnsafeCursor r4) {
            r4.getClass()
            long r0 = r4.offset
            okio.Buffer r2 = r4.buffer
            r2.getClass()
            long r2 = r2.size()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L2d
            long r0 = r4.offset
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L21
            r0 = 0
            int r4 = r4.seek(r0)
            return r4
        L21:
            int r2 = r4.end
            int r3 = r4.start
            int r2 = r2 - r3
            long r2 = (long) r2
            long r0 = r0 + r2
            int r4 = r4.seek(r0)
            return r4
        L2d:
            java.lang.String r4 = "no more bytes"
            j8.o.A(r4)
            r4 = 0
            return r4
    }

    public static final boolean commonRangeEquals(okio.Buffer r6, long r7, okio.ByteString r9, int r10, int r11) {
            r6.getClass()
            r9.getClass()
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L3a
            if (r10 < 0) goto L3a
            if (r11 < 0) goto L3a
            long r2 = r6.size()
            long r2 = r2 - r7
            long r4 = (long) r11
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L3a
            int r0 = r9.size()
            int r0 = r0 - r10
            if (r0 >= r11) goto L23
            goto L3a
        L23:
            r0 = r1
        L24:
            if (r0 >= r11) goto L38
            long r2 = (long) r0
            long r2 = r2 + r7
            byte r2 = r6.getByte(r2)
            int r3 = r10 + r0
            byte r3 = r9.getByte(r3)
            if (r2 == r3) goto L35
            return r1
        L35:
            int r0 = r0 + 1
            goto L24
        L38:
            r6 = 1
            return r6
        L3a:
            return r1
    }

    public static final int commonRead(okio.Buffer r2, byte[] r3) {
            r2.getClass()
            r3.getClass()
            r0 = 0
            int r1 = r3.length
            int r2 = r2.read(r3, r0, r1)
            return r2
    }

    public static final int commonRead(okio.Buffer r7, byte[] r8, int r9, int r10) {
            r7.getClass()
            r8.getClass()
            int r0 = r8.length
            long r1 = (long) r0
            long r3 = (long) r9
            long r5 = (long) r10
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            okio.Segment r0 = r7.head
            if (r0 != 0) goto L13
            r7 = -1
            return r7
        L13:
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            int r10 = java.lang.Math.min(r10, r1)
            byte[] r1 = r0.data
            int r2 = r0.pos
            int r3 = r2 + r10
            tf.l.o0(r1, r9, r2, r8, r3)
            int r8 = r0.pos
            int r8 = r8 + r10
            r0.pos = r8
            long r8 = r7.size()
            long r1 = (long) r10
            long r8 = r8 - r1
            r7.setSize$okio(r8)
            int r8 = r0.pos
            int r9 = r0.limit
            if (r8 != r9) goto L42
            okio.Segment r8 = r0.pop()
            r7.head = r8
            okio.SegmentPool.recycle(r0)
        L42:
            return r10
    }

    public static final long commonRead(okio.Buffer r4, okio.Buffer r5, long r6) {
            r4.getClass()
            r5.getClass()
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L27
            long r2 = r4.size()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L17
            r4 = -1
            return r4
        L17:
            long r0 = r4.size()
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L23
            long r6 = r4.size()
        L23:
            r5.write(r4, r6)
            return r6
        L27:
            java.lang.String r4 = "byteCount < 0: "
            java.lang.String r4 = bc.e.g(r6, r4)
            j8.o.q(r4)
            r4 = 0
            return r4
    }

    public static final long commonReadAll(okio.Buffer r4, okio.Sink r5) {
            r4.getClass()
            r5.getClass()
            long r0 = r4.size()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L13
            r5.write(r4, r0)
        L13:
            return r0
    }

    public static final okio.Buffer.UnsafeCursor commonReadAndWriteUnsafe(okio.Buffer r1, okio.Buffer.UnsafeCursor r2) {
            r1.getClass()
            r2.getClass()
            okio.Buffer$UnsafeCursor r2 = okio.SegmentedByteString.resolveDefaultParameter(r2)
            okio.Buffer r0 = r2.buffer
            if (r0 != 0) goto L14
            r2.buffer = r1
            r1 = 1
            r2.readWrite = r1
            return r2
        L14:
            java.lang.String r1 = "already attached to a buffer"
            j8.o.A(r1)
            r1 = 0
            return r1
    }

    public static final byte commonReadByte(okio.Buffer r9) {
            r9.getClass()
            long r0 = r9.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L35
            okio.Segment r0 = r9.head
            r0.getClass()
            int r1 = r0.pos
            int r2 = r0.limit
            byte[] r3 = r0.data
            int r4 = r1 + 1
            r1 = r3[r1]
            long r5 = r9.size()
            r7 = 1
            long r5 = r5 - r7
            r9.setSize$okio(r5)
            if (r4 != r2) goto L32
            okio.Segment r2 = r0.pop()
            r9.head = r2
            okio.SegmentPool.recycle(r0)
            return r1
        L32:
            r0.pos = r4
            return r1
        L35:
            j8.o.a()
            r9 = 0
            return r9
    }

    public static final byte[] commonReadByteArray(okio.Buffer r2) {
            r2.getClass()
            long r0 = r2.size()
            byte[] r2 = r2.readByteArray(r0)
            return r2
    }

    public static final byte[] commonReadByteArray(okio.Buffer r2, long r3) {
            r2.getClass()
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L24
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L24
            long r0 = r2.size()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L1f
            int r3 = (int) r3
            byte[] r3 = new byte[r3]
            r2.readFully(r3)
            return r3
        L1f:
            j8.o.a()
        L22:
            r2 = 0
            return r2
        L24:
            java.lang.String r2 = "byteCount: "
            java.lang.String r2 = bc.e.g(r3, r2)
            j8.o.q(r2)
            goto L22
    }

    public static final okio.ByteString commonReadByteString(okio.Buffer r2) {
            r2.getClass()
            long r0 = r2.size()
            okio.ByteString r2 = r2.readByteString(r0)
            return r2
    }

    public static final okio.ByteString commonReadByteString(okio.Buffer r2, long r3) {
            r2.getClass()
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L36
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L36
            long r0 = r2.size()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L31
            r0 = 4096(0x1000, double:2.0237E-320)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L27
            int r0 = (int) r3
            okio.ByteString r0 = r2.snapshot(r0)
            r2.skip(r3)
            return r0
        L27:
            okio.ByteString r0 = new okio.ByteString
            byte[] r2 = r2.readByteArray(r3)
            r0.<init>(r2)
            return r0
        L31:
            j8.o.a()
        L34:
            r2 = 0
            return r2
        L36:
            java.lang.String r2 = "byteCount: "
            java.lang.String r2 = bc.e.g(r3, r2)
            j8.o.q(r2)
            goto L34
    }

    public static final long commonReadDecimalLong(okio.Buffer r19) {
            r0 = r19
            r0.getClass()
            long r1 = r0.size()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto Lda
            r1 = 0
            r5 = -7
            r2 = r1
            r8 = r3
            r6 = r5
            r5 = r2
        L16:
            okio.Segment r10 = r0.head
            r10.getClass()
            byte[] r11 = r10.data
            int r12 = r10.pos
            int r13 = r10.limit
        L21:
            if (r12 >= r13) goto L7b
            r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L66
            r14 = 57
            if (r15 > r14) goto L66
            int r14 = 48 - r15
            r16 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r16 < 0) goto L48
            r17 = r3
            if (r16 != 0) goto L42
            long r3 = (long) r14
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto L42
            goto L48
        L42:
            r3 = 10
            long r8 = r8 * r3
            long r3 = (long) r14
            long r8 = r8 + r3
            goto L72
        L48:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeDecimalLong(r8)
            okio.Buffer r0 = r0.writeByte(r15)
            if (r2 != 0) goto L5a
            r0.readByte()
        L5a:
            java.lang.String r1 = "Number too large: "
            java.lang.String r0 = r0.readUtf8()
            j8.o.v(r0, r1)
        L63:
            r0 = 0
            return r0
        L66:
            r17 = r3
            r3 = 45
            if (r15 != r3) goto L79
            if (r1 != 0) goto L79
            r2 = 1
            long r6 = r6 - r2
            r2 = 1
        L72:
            int r12 = r12 + 1
            int r1 = r1 + 1
            r3 = r17
            goto L21
        L79:
            r5 = 1
            goto L7d
        L7b:
            r17 = r3
        L7d:
            if (r12 != r13) goto L89
            okio.Segment r3 = r10.pop()
            r0.head = r3
            okio.SegmentPool.recycle(r10)
            goto L8b
        L89:
            r10.pos = r12
        L8b:
            if (r5 != 0) goto L95
            okio.Segment r3 = r0.head
            if (r3 != 0) goto L92
            goto L95
        L92:
            r3 = r17
            goto L16
        L95:
            long r3 = r0.size()
            long r5 = (long) r1
            long r3 = r3 - r5
            r0.setSize$okio(r3)
            if (r2 == 0) goto La2
            r14 = 2
            goto La3
        La2:
            r14 = 1
        La3:
            if (r1 >= r14) goto Ld5
            long r3 = r0.size()
            int r1 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r1 == 0) goto Ld1
            if (r2 == 0) goto Lb2
            java.lang.String r1 = "Expected a digit"
            goto Lb4
        Lb2:
            java.lang.String r1 = "Expected a digit or '-'"
        Lb4:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r3 = " but was 0x"
            java.lang.StringBuilder r1 = bc.e.n(r1, r3)
            r3 = r17
            byte r0 = r0.getByte(r3)
            java.lang.String r0 = okio.SegmentedByteString.toHexString(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            throw r2
        Ld1:
            j8.o.a()
            goto L63
        Ld5:
            if (r2 == 0) goto Ld8
            return r8
        Ld8:
            long r0 = -r8
            return r0
        Lda:
            j8.o.a()
            goto L63
    }

    public static final void commonReadFully(okio.Buffer r2, okio.Buffer r3, long r4) {
            r2.getClass()
            r3.getClass()
            long r0 = r2.size()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L12
            r3.write(r2, r4)
            return
        L12:
            long r4 = r2.size()
            r3.write(r2, r4)
            j8.o.a()
            return
    }

    public static final void commonReadFully(okio.Buffer r3, byte[] r4) {
            r3.getClass()
            r4.getClass()
            r0 = 0
        L7:
            int r1 = r4.length
            if (r0 >= r1) goto L18
            int r1 = r4.length
            int r1 = r1 - r0
            int r1 = r3.read(r4, r0, r1)
            r2 = -1
            if (r1 == r2) goto L15
            int r0 = r0 + r1
            goto L7
        L15:
            j8.o.a()
        L18:
            return
    }

    public static final long commonReadHexadecimalUnsignedLong(okio.Buffer r14) {
            r14.getClass()
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L94
            r0 = 0
            r1 = r0
            r4 = r2
        L10:
            okio.Segment r6 = r14.head
            r6.getClass()
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L1b:
            if (r8 >= r9) goto L76
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L2a
            r11 = 57
            if (r10 > r11) goto L2a
            int r11 = r10 + (-48)
            goto L3f
        L2a:
            r11 = 97
            if (r10 < r11) goto L35
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L35
            int r11 = r10 + (-87)
            goto L3f
        L35:
            r11 = 65
            if (r10 < r11) goto L68
            r11 = 70
            if (r10 > r11) goto L68
            int r11 = r10 + (-55)
        L3f:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4f
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1b
        L4f:
            okio.Buffer r14 = new okio.Buffer
            r14.<init>()
            okio.Buffer r14 = r14.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r14 = r14.writeByte(r10)
            java.lang.String r0 = "Number too large: "
            java.lang.String r14 = r14.readUtf8()
            j8.o.v(r14, r0)
        L65:
            r0 = 0
            return r0
        L68:
            if (r0 == 0) goto L6c
            r1 = 1
            goto L76
        L6c:
            java.lang.String r14 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = okio.SegmentedByteString.toHexString(r10)
            j8.o.v(r0, r14)
            goto L65
        L76:
            if (r8 != r9) goto L82
            okio.Segment r7 = r6.pop()
            r14.head = r7
            okio.SegmentPool.recycle(r6)
            goto L84
        L82:
            r6.pos = r8
        L84:
            if (r1 != 0) goto L8a
            okio.Segment r6 = r14.head
            if (r6 != 0) goto L10
        L8a:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        L94:
            j8.o.a()
            goto L65
    }

    public static final int commonReadInt(okio.Buffer r9) {
            r9.getClass()
            long r0 = r9.size()
            r2 = 4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L79
            okio.Segment r0 = r9.head
            r0.getClass()
            int r1 = r0.pos
            int r4 = r0.limit
            int r5 = r4 - r1
            long r5 = (long) r5
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L3f
            byte r0 = r9.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            byte r1 = r9.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            byte r1 = r9.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            byte r9 = r9.readByte()
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r9 | r0
            return r9
        L3f:
            byte[] r5 = r0.data
            int r6 = r1 + 1
            r7 = r5[r1]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 24
            int r8 = r1 + 2
            r6 = r5[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r6 = r6 | r7
            int r7 = r1 + 3
            r8 = r5[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            r6 = r6 | r8
            int r1 = r1 + 4
            r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r6
            long r6 = r9.size()
            long r6 = r6 - r2
            r9.setSize$okio(r6)
            if (r1 != r4) goto L76
            okio.Segment r1 = r0.pop()
            r9.head = r1
            okio.SegmentPool.recycle(r0)
            return r5
        L76:
            r0.pos = r1
            return r5
        L79:
            j8.o.a()
            r9 = 0
            return r9
    }

    public static final long commonReadLong(okio.Buffer r15) {
            r15.getClass()
            long r0 = r15.size()
            r2 = 8
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L9a
            okio.Segment r0 = r15.head
            r0.getClass()
            int r1 = r0.pos
            int r4 = r0.limit
            int r5 = r4 - r1
            long r5 = (long) r5
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 32
            if (r5 >= 0) goto L33
            int r0 = r15.readInt()
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = r0 << r6
            int r15 = r15.readInt()
            long r4 = (long) r15
            long r2 = r2 & r4
            long r0 = r0 | r2
            return r0
        L33:
            byte[] r5 = r0.data
            int r7 = r1 + 1
            r8 = r5[r1]
            long r8 = (long) r8
            r10 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r10
            r12 = 56
            long r8 = r8 << r12
            int r12 = r1 + 2
            r7 = r5[r7]
            long r13 = (long) r7
            long r13 = r13 & r10
            r7 = 48
            long r13 = r13 << r7
            long r7 = r8 | r13
            int r9 = r1 + 3
            r12 = r5[r12]
            long r12 = (long) r12
            long r12 = r12 & r10
            r14 = 40
            long r12 = r12 << r14
            long r7 = r7 | r12
            int r12 = r1 + 4
            r9 = r5[r9]
            long r13 = (long) r9
            long r13 = r13 & r10
            long r13 = r13 << r6
            long r6 = r7 | r13
            int r8 = r1 + 5
            r9 = r5[r12]
            long r12 = (long) r9
            long r12 = r12 & r10
            r9 = 24
            long r12 = r12 << r9
            long r6 = r6 | r12
            int r9 = r1 + 6
            r8 = r5[r8]
            long r12 = (long) r8
            long r12 = r12 & r10
            r8 = 16
            long r12 = r12 << r8
            long r6 = r6 | r12
            int r8 = r1 + 7
            r9 = r5[r9]
            long r12 = (long) r9
            long r12 = r12 & r10
            r9 = 8
            long r12 = r12 << r9
            long r6 = r6 | r12
            int r1 = r1 + r9
            r5 = r5[r8]
            long r8 = (long) r5
            long r8 = r8 & r10
            long r5 = r6 | r8
            long r7 = r15.size()
            long r7 = r7 - r2
            r15.setSize$okio(r7)
            if (r1 != r4) goto L97
            okio.Segment r1 = r0.pop()
            r15.head = r1
            okio.SegmentPool.recycle(r0)
            return r5
        L97:
            r0.pos = r1
            return r5
        L9a:
            j8.o.a()
            r0 = 0
            return r0
    }

    public static final short commonReadShort(okio.Buffer r9) {
            r9.getClass()
            long r0 = r9.size()
            r2 = 2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L54
            okio.Segment r0 = r9.head
            r0.getClass()
            int r1 = r0.pos
            int r4 = r0.limit
            int r5 = r4 - r1
            r6 = 2
            if (r5 >= r6) goto L2c
            byte r0 = r9.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            byte r9 = r9.readByte()
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r9 | r0
            short r9 = (short) r9
            return r9
        L2c:
            byte[] r5 = r0.data
            int r7 = r1 + 1
            r8 = r5[r1]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            int r1 = r1 + r6
            r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r8
            long r6 = r9.size()
            long r6 = r6 - r2
            r9.setSize$okio(r6)
            if (r1 != r4) goto L50
            okio.Segment r1 = r0.pop()
            r9.head = r1
            okio.SegmentPool.recycle(r0)
            goto L52
        L50:
            r0.pos = r1
        L52:
            short r9 = (short) r5
            return r9
        L54:
            j8.o.a()
            r9 = 0
            return r9
    }

    public static final okio.Buffer.UnsafeCursor commonReadUnsafe(okio.Buffer r1, okio.Buffer.UnsafeCursor r2) {
            r1.getClass()
            r2.getClass()
            okio.Buffer$UnsafeCursor r2 = okio.SegmentedByteString.resolveDefaultParameter(r2)
            okio.Buffer r0 = r2.buffer
            if (r0 != 0) goto L14
            r2.buffer = r1
            r1 = 0
            r2.readWrite = r1
            return r2
        L14:
            java.lang.String r1 = "already attached to a buffer"
            j8.o.A(r1)
            r1 = 0
            return r1
    }

    public static final java.lang.String commonReadUtf8(okio.Buffer r6, long r7) {
            r6.getClass()
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L64
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 > 0) goto L64
            long r1 = r6.size()
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 < 0) goto L5f
            if (r0 != 0) goto L1d
            java.lang.String r6 = ""
            return r6
        L1d:
            okio.Segment r0 = r6.head
            r0.getClass()
            int r1 = r0.pos
            long r2 = (long) r1
            long r2 = r2 + r7
            int r4 = r0.limit
            long r4 = (long) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L39
            byte[] r6 = r6.readByteArray(r7)
            r7 = 3
            r8 = 0
            r0 = 0
            java.lang.String r6 = okio.internal._Utf8Kt.commonToUtf8String$default(r6, r0, r0, r7, r8)
            return r6
        L39:
            byte[] r2 = r0.data
            int r3 = (int) r7
            int r4 = r1 + r3
            java.lang.String r1 = okio.internal._Utf8Kt.commonToUtf8String(r2, r1, r4)
            int r2 = r0.pos
            int r2 = r2 + r3
            r0.pos = r2
            long r2 = r6.size()
            long r2 = r2 - r7
            r6.setSize$okio(r2)
            int r7 = r0.pos
            int r8 = r0.limit
            if (r7 != r8) goto L5e
            okio.Segment r7 = r0.pop()
            r6.head = r7
            okio.SegmentPool.recycle(r0)
        L5e:
            return r1
        L5f:
            j8.o.a()
            r6 = 0
            return r6
        L64:
            java.lang.String r6 = "byteCount: "
            java.lang.String r6 = bc.e.g(r7, r6)
            j8.o.q(r6)
            r6 = 0
            return r6
    }

    public static final int commonReadUtf8CodePoint(okio.Buffer r12) {
            r12.getClass()
            long r0 = r12.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lab
            byte r0 = r12.getByte(r2)
            r1 = r0 & 128(0x80, float:1.8E-43)
            r2 = 1
            r3 = 128(0x80, float:1.8E-43)
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r1 != 0) goto L21
            r1 = r0 & 127(0x7f, float:1.78E-43)
            r5 = 0
            r6 = r5
            r5 = r2
            goto L43
        L21:
            r1 = r0 & 224(0xe0, float:3.14E-43)
            r5 = 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L2c
            r1 = r0 & 31
            r5 = 2
            r6 = r3
            goto L43
        L2c:
            r1 = r0 & 240(0xf0, float:3.36E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r1 != r5) goto L38
            r1 = r0 & 15
            r5 = 3
            r6 = 2048(0x800, float:2.87E-42)
            goto L43
        L38:
            r1 = r0 & 248(0xf8, float:3.48E-43)
            r5 = 240(0xf0, float:3.36E-43)
            if (r1 != r5) goto La5
            r1 = r0 & 7
            r5 = 4
            r6 = 65536(0x10000, float:9.1835E-41)
        L43:
            long r7 = r12.size()
            long r9 = (long) r5
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L7b
        L4c:
            if (r2 >= r5) goto L63
            long r7 = (long) r2
            byte r0 = r12.getByte(r7)
            r11 = r0 & 192(0xc0, float:2.69E-43)
            if (r11 != r3) goto L5f
            int r1 = r1 << 6
            r0 = r0 & 63
            r1 = r1 | r0
            int r2 = r2 + 1
            goto L4c
        L5f:
            r12.skip(r7)
            return r4
        L63:
            r12.skip(r9)
            r12 = 1114111(0x10ffff, float:1.561202E-39)
            if (r1 <= r12) goto L6c
            return r4
        L6c:
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r12 > r1) goto L77
            r12 = 57344(0xe000, float:8.0356E-41)
            if (r1 >= r12) goto L77
            return r4
        L77:
            if (r1 >= r6) goto L7a
            return r4
        L7a:
            return r1
        L7b:
            java.io.EOFException r1 = new java.io.EOFException
            java.lang.String r2 = "size < "
            java.lang.String r3 = ": "
            java.lang.StringBuilder r2 = eh.a.t(r5, r2, r3)
            long r3 = r12.size()
            r2.append(r3)
            java.lang.String r12 = " (to read code point prefixed 0x"
            r2.append(r12)
            java.lang.String r12 = okio.SegmentedByteString.toHexString(r0)
            r2.append(r12)
            r12 = 41
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            r1.<init>(r12)
            throw r1
        La5:
            r0 = 1
            r12.skip(r0)
            return r4
        Lab:
            j8.o.a()
            r12 = 0
            return r12
    }

    public static final java.lang.String commonReadUtf8Line(okio.Buffer r4) {
            r4.getClass()
            r0 = 10
            long r0 = r4.indexOf(r0)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L14
            java.lang.String r4 = readUtf8Line(r4, r0)
            return r4
        L14:
            long r0 = r4.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L27
            long r0 = r4.size()
            java.lang.String r4 = r4.readUtf8(r0)
            return r4
        L27:
            r4 = 0
            return r4
    }

    public static final java.lang.String commonReadUtf8LineStrict(okio.Buffer r10, long r11) {
            r10.getClass()
            r0 = 0
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L77
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r6 = 1
            if (r2 != 0) goto L16
        L14:
            r4 = r0
            goto L19
        L16:
            long r0 = r11 + r6
            goto L14
        L19:
            r1 = 10
            r2 = 0
            r0 = r10
            long r1 = r0.indexOf(r1, r2, r4)
            r8 = -1
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 == 0) goto L2d
            java.lang.String r0 = readUtf8Line(r10, r1)
            return r0
        L2d:
            long r1 = r10.size()
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 >= 0) goto L4c
            long r1 = r4 - r6
            byte r1 = r10.getByte(r1)
            r2 = 13
            if (r1 != r2) goto L4c
            byte r1 = r10.getByte(r4)
            r2 = 10
            if (r1 != r2) goto L4c
            java.lang.String r0 = readUtf8Line(r10, r4)
            return r0
        L4c:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            long r2 = r10.size()
            r4 = 32
            long r4 = (long) r4
            long r4 = java.lang.Math.min(r4, r2)
            r2 = 0
            r0 = r10
            r0.copyTo(r1, r2, r4)
            long r2 = r10.size()
            long r2 = java.lang.Math.min(r2, r11)
            okio.ByteString r0 = r1.readByteString()
            java.lang.String r0 = r0.hex()
            j8.o.g(r0, r2)
        L75:
            r0 = 0
            return r0
        L77:
            java.lang.String r0 = "limit < 0: "
            java.lang.String r0 = bc.e.g(r11, r0)
            j8.o.q(r0)
            goto L75
    }

    public static final long commonResizeBuffer(okio.Buffer.UnsafeCursor r13, long r14) {
            r13.getClass()
            okio.Buffer r0 = r13.buffer
            if (r0 == 0) goto L9b
            boolean r1 = r13.readWrite
            if (r1 == 0) goto L95
            long r1 = r0.size()
            int r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            r4 = 0
            if (r3 > 0) goto L5d
            int r3 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r3 < 0) goto L51
            long r6 = r1 - r14
        L1b:
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 <= 0) goto L43
            okio.Segment r3 = r0.head
            r3.getClass()
            okio.Segment r3 = r3.prev
            r3.getClass()
            int r8 = r3.limit
            int r9 = r3.pos
            int r9 = r8 - r9
            long r9 = (long) r9
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 > 0) goto L3f
            okio.Segment r8 = r3.pop()
            r0.head = r8
            okio.SegmentPool.recycle(r3)
            long r6 = r6 - r9
            goto L1b
        L3f:
            int r4 = (int) r6
            int r8 = r8 - r4
            r3.limit = r8
        L43:
            r3 = 0
            r13.setSegment$okio(r3)
            r13.offset = r14
            r13.data = r3
            r3 = -1
            r13.start = r3
            r13.end = r3
            goto L91
        L51:
            java.lang.String r13 = "newSize < 0: "
            java.lang.String r13 = bc.e.g(r14, r13)
            j8.o.q(r13)
        L5a:
            r13 = 0
            return r13
        L5d:
            if (r3 <= 0) goto L91
            long r6 = r14 - r1
            r3 = 1
            r8 = r3
        L63:
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 <= 0) goto L91
            okio.Segment r9 = r0.writableSegment$okio(r3)
            int r10 = r9.limit
            int r10 = 8192 - r10
            long r10 = (long) r10
            long r10 = java.lang.Math.min(r6, r10)
            int r10 = (int) r10
            int r11 = r9.limit
            int r11 = r11 + r10
            r9.limit = r11
            long r11 = (long) r10
            long r6 = r6 - r11
            if (r8 == 0) goto L63
            r13.setSegment$okio(r9)
            r13.offset = r1
            byte[] r8 = r9.data
            r13.data = r8
            int r8 = r9.limit
            int r9 = r8 - r10
            r13.start = r9
            r13.end = r8
            r8 = 0
            goto L63
        L91:
            r0.setSize$okio(r14)
            return r1
        L95:
            java.lang.String r13 = "resizeBuffer() only permitted for read/write buffers"
            j8.o.A(r13)
            goto L5a
        L9b:
            java.lang.String r13 = "not attached to a buffer"
            j8.o.A(r13)
            goto L5a
    }

    public static final int commonSeek(okio.Buffer.UnsafeCursor r11, long r12) {
            r11.getClass()
            okio.Buffer r0 = r11.buffer
            if (r0 == 0) goto Le6
            r1 = -1
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 < 0) goto Lcd
            long r2 = r0.size()
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 > 0) goto Lcd
            if (r1 == 0) goto Lbf
            long r1 = r0.size()
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 != 0) goto L21
            goto Lbf
        L21:
            long r1 = r0.size()
            okio.Segment r3 = r0.head
            okio.Segment r4 = r11.getSegment$okio()
            r5 = 0
            if (r4 == 0) goto L51
            long r7 = r11.offset
            int r4 = r11.start
            okio.Segment r9 = r11.getSegment$okio()
            r9.getClass()
            int r9 = r9.pos
            int r4 = r4 - r9
            long r9 = (long) r4
            long r7 = r7 - r9
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 <= 0) goto L4b
            okio.Segment r1 = r11.getSegment$okio()
            r4 = r3
            r3 = r1
            r1 = r7
            goto L52
        L4b:
            okio.Segment r4 = r11.getSegment$okio()
            r5 = r7
            goto L52
        L51:
            r4 = r3
        L52:
            long r7 = r1 - r12
            long r9 = r12 - r5
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L6f
        L5a:
            r4.getClass()
            int r1 = r4.limit
            int r2 = r4.pos
            int r3 = r1 - r2
            long r7 = (long) r3
            long r7 = r7 + r5
            int r3 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r3 < 0) goto L85
            int r1 = r1 - r2
            long r1 = (long) r1
            long r5 = r5 + r1
            okio.Segment r4 = r4.next
            goto L5a
        L6f:
            int r4 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r4 <= 0) goto L83
            r3.getClass()
            okio.Segment r3 = r3.prev
            r3.getClass()
            int r4 = r3.limit
            int r5 = r3.pos
            int r4 = r4 - r5
            long r4 = (long) r4
            long r1 = r1 - r4
            goto L6f
        L83:
            r5 = r1
            r4 = r3
        L85:
            boolean r1 = r11.readWrite
            if (r1 == 0) goto La6
            r4.getClass()
            boolean r1 = r4.shared
            if (r1 == 0) goto La6
            okio.Segment r1 = r4.unsharedCopy()
            okio.Segment r2 = r0.head
            if (r2 != r4) goto L9a
            r0.head = r1
        L9a:
            okio.Segment r4 = r4.push(r1)
            okio.Segment r0 = r4.prev
            r0.getClass()
            r0.pop()
        La6:
            r11.setSegment$okio(r4)
            r11.offset = r12
            r4.getClass()
            byte[] r0 = r4.data
            r11.data = r0
            int r0 = r4.pos
            long r12 = r12 - r5
            int r12 = (int) r12
            int r0 = r0 + r12
            r11.start = r0
            int r12 = r4.limit
            r11.end = r12
            int r12 = r12 - r0
            return r12
        Lbf:
            r0 = 0
            r11.setSegment$okio(r0)
            r11.offset = r12
            r11.data = r0
            r12 = -1
            r11.start = r12
            r11.end = r12
            return r12
        Lcd:
            java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.String r1 = "offset="
            java.lang.String r2 = " > size="
            java.lang.StringBuilder r12 = p.a.o(r12, r1, r2)
            long r0 = r0.size()
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        Le6:
            java.lang.String r11 = "not attached to a buffer"
            j8.o.A(r11)
            r11 = 0
            return r11
    }

    public static final int commonSelect(okio.Buffer r3, okio.Options r4) {
            r3.getClass()
            r4.getClass()
            r0 = 2
            r1 = 0
            r2 = 0
            int r0 = selectPrefix$default(r3, r4, r2, r0, r1)
            r1 = -1
            if (r0 != r1) goto L11
            return r1
        L11:
            okio.ByteString[] r4 = r4.getByteStrings$okio()
            r4 = r4[r0]
            int r4 = r4.size()
            long r1 = (long) r4
            r3.skip(r1)
            return r0
    }

    public static final void commonSkip(okio.Buffer r6, long r7) {
            r6.getClass()
        L3:
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L38
            okio.Segment r0 = r6.head
            if (r0 == 0) goto L35
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r7, r1)
            int r1 = (int) r1
            long r2 = r6.size()
            long r4 = (long) r1
            long r2 = r2 - r4
            r6.setSize$okio(r2)
            long r7 = r7 - r4
            int r2 = r0.pos
            int r2 = r2 + r1
            r0.pos = r2
            int r1 = r0.limit
            if (r2 != r1) goto L3
            okio.Segment r1 = r0.pop()
            r6.head = r1
            okio.SegmentPool.recycle(r0)
            goto L3
        L35:
            j8.o.a()
        L38:
            return
    }

    public static final okio.ByteString commonSnapshot(okio.Buffer r4) {
            r4.getClass()
            long r0 = r4.size()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L18
            long r0 = r4.size()
            int r0 = (int) r0
            okio.ByteString r4 = r4.snapshot(r0)
            return r4
        L18:
            long r0 = r4.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = "size > Int.MAX_VALUE: "
            r4.<init>(r2)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public static final okio.ByteString commonSnapshot(okio.Buffer r7, int r8) {
            r7.getClass()
            if (r8 != 0) goto L8
            okio.ByteString r7 = okio.ByteString.EMPTY
            return r7
        L8:
            long r0 = r7.size()
            r2 = 0
            long r4 = (long) r8
            okio.SegmentedByteString.checkOffsetAndCount(r0, r2, r4)
            okio.Segment r0 = r7.head
            r1 = 0
            r2 = r1
            r3 = r2
        L17:
            if (r2 >= r8) goto L30
            r0.getClass()
            int r4 = r0.limit
            int r5 = r0.pos
            if (r4 == r5) goto L29
            int r4 = r4 - r5
            int r2 = r2 + r4
            int r3 = r3 + 1
            okio.Segment r0 = r0.next
            goto L17
        L29:
            java.lang.String r7 = "s.limit == s.pos"
            j8.o.f(r7)
            r7 = 0
            return r7
        L30:
            byte[][] r0 = new byte[r3][]
            int r2 = r3 * 2
            int[] r2 = new int[r2]
            okio.Segment r7 = r7.head
            r4 = r1
        L39:
            if (r1 >= r8) goto L5b
            r7.getClass()
            byte[] r5 = r7.data
            r0[r4] = r5
            int r5 = r7.limit
            int r6 = r7.pos
            int r5 = r5 - r6
            int r1 = r1 + r5
            int r5 = java.lang.Math.min(r1, r8)
            r2[r4] = r5
            int r5 = r4 + r3
            int r6 = r7.pos
            r2[r5] = r6
            r5 = 1
            r7.shared = r5
            int r4 = r4 + r5
            okio.Segment r7 = r7.next
            goto L39
        L5b:
            okio.SegmentedByteString r7 = new okio.SegmentedByteString
            r7.<init>(r0, r2)
            return r7
    }

    public static final okio.Segment commonWritableSegment(okio.Buffer r2, int r3) {
            r2.getClass()
            r0 = 1
            if (r3 < r0) goto L35
            r0 = 8192(0x2000, float:1.148E-41)
            if (r3 > r0) goto L35
            okio.Segment r1 = r2.head
            if (r1 != 0) goto L19
            okio.Segment r3 = okio.SegmentPool.take()
            r2.head = r3
            r3.prev = r3
            r3.next = r3
            return r3
        L19:
            r1.getClass()
            okio.Segment r2 = r1.prev
            r2.getClass()
            int r1 = r2.limit
            int r1 = r1 + r3
            if (r1 > r0) goto L2c
            boolean r3 = r2.owner
            if (r3 != 0) goto L2b
            goto L2c
        L2b:
            return r2
        L2c:
            okio.Segment r3 = okio.SegmentPool.take()
            okio.Segment r2 = r2.push(r3)
            return r2
        L35:
            java.lang.String r2 = "unexpected capacity"
            j8.o.t(r2)
            r2 = 0
            return r2
    }

    public static final okio.Buffer commonWrite(okio.Buffer r0, okio.ByteString r1, int r2, int r3) {
            r0.getClass()
            r1.getClass()
            r1.write$okio(r0, r2, r3)
            return r0
    }

    public static final okio.Buffer commonWrite(okio.Buffer r4, okio.Source r5, long r6) {
            r4.getClass()
            r5.getClass()
        L6:
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1c
            long r0 = r5.read(r4, r6)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L18
            long r6 = r6 - r0
            goto L6
        L18:
            j8.o.a()
            r4 = 0
        L1c:
            return r4
    }

    public static final okio.Buffer commonWrite(okio.Buffer r2, byte[] r3) {
            r2.getClass()
            r3.getClass()
            r0 = 0
            int r1 = r3.length
            okio.Buffer r2 = r2.write(r3, r0, r1)
            return r2
    }

    public static final okio.Buffer commonWrite(okio.Buffer r7, byte[] r8, int r9, int r10) {
            r7.getClass()
            r8.getClass()
            int r0 = r8.length
            long r1 = (long) r0
            long r3 = (long) r9
            long r5 = (long) r10
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            int r10 = r10 + r9
        Le:
            if (r9 >= r10) goto L2f
            r0 = 1
            okio.Segment r0 = r7.writableSegment$okio(r0)
            int r1 = r10 - r9
            int r2 = r0.limit
            int r2 = 8192 - r2
            int r1 = java.lang.Math.min(r1, r2)
            byte[] r2 = r0.data
            int r3 = r0.limit
            int r4 = r9 + r1
            tf.l.o0(r8, r3, r9, r2, r4)
            int r9 = r0.limit
            int r9 = r9 + r1
            r0.limit = r9
            r9 = r4
            goto Le
        L2f:
            long r8 = r7.size()
            long r8 = r8 + r5
            r7.setSize$okio(r8)
            return r7
    }

    public static final void commonWrite(okio.Buffer r6, okio.Buffer r7, long r8) {
            r6.getClass()
            r7.getClass()
            if (r7 == r6) goto Lb6
            long r0 = r7.size()
            r2 = 0
            r4 = r8
            okio.SegmentedByteString.checkOffsetAndCount(r0, r2, r4)
        L12:
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lb5
            okio.Segment r0 = r7.head
            r0.getClass()
            int r0 = r0.limit
            okio.Segment r1 = r7.head
            r1.getClass()
            int r1 = r1.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 >= 0) goto L77
            okio.Segment r0 = r6.head
            if (r0 == 0) goto L36
            r0.getClass()
            okio.Segment r0 = r0.prev
            goto L37
        L36:
            r0 = 0
        L37:
            if (r0 == 0) goto L6b
            boolean r1 = r0.owner
            if (r1 == 0) goto L6b
            int r1 = r0.limit
            long r1 = (long) r1
            long r1 = r1 + r8
            boolean r3 = r0.shared
            if (r3 == 0) goto L47
            r3 = 0
            goto L49
        L47:
            int r3 = r0.pos
        L49:
            long r3 = (long) r3
            long r1 = r1 - r3
            r3 = 8192(0x2000, double:4.0474E-320)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L6b
            okio.Segment r1 = r7.head
            r1.getClass()
            int r2 = (int) r8
            r1.writeTo(r0, r2)
            long r0 = r7.size()
            long r0 = r0 - r8
            r7.setSize$okio(r0)
            long r0 = r6.size()
            long r0 = r0 + r8
            r6.setSize$okio(r0)
            return
        L6b:
            okio.Segment r0 = r7.head
            r0.getClass()
            int r1 = (int) r8
            okio.Segment r0 = r0.split(r1)
            r7.head = r0
        L77:
            okio.Segment r0 = r7.head
            r0.getClass()
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            okio.Segment r3 = r0.pop()
            r7.head = r3
            okio.Segment r3 = r6.head
            if (r3 != 0) goto L93
            r6.head = r0
            r0.prev = r0
            r0.next = r0
            goto La2
        L93:
            r3.getClass()
            okio.Segment r3 = r3.prev
            r3.getClass()
            okio.Segment r0 = r3.push(r0)
            r0.compact()
        La2:
            long r3 = r7.size()
            long r3 = r3 - r1
            r7.setSize$okio(r3)
            long r3 = r6.size()
            long r3 = r3 + r1
            r6.setSize$okio(r3)
            long r8 = r8 - r1
            goto L12
        Lb5:
            return
        Lb6:
            java.lang.String r6 = "source == this"
            j8.o.t(r6)
            return
    }

    public static /* synthetic */ okio.Buffer commonWrite$default(okio.Buffer r0, okio.ByteString r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = r1.size()
        Ld:
            r0.getClass()
            r1.getClass()
            r1.write$okio(r0, r2, r3)
            return r0
    }

    public static final long commonWriteAll(okio.Buffer r6, okio.Source r7) {
            r6.getClass()
            r7.getClass()
            r0 = 0
        L8:
            r2 = 8192(0x2000, double:4.0474E-320)
            long r2 = r7.read(r6, r2)
            r4 = -1
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L16
            long r0 = r0 + r2
            goto L8
        L16:
            return r0
    }

    public static final okio.Buffer commonWriteByte(okio.Buffer r4, int r5) {
            r4.getClass()
            r0 = 1
            okio.Segment r0 = r4.writableSegment$okio(r0)
            byte[] r1 = r0.data
            int r2 = r0.limit
            int r3 = r2 + 1
            r0.limit = r3
            byte r5 = (byte) r5
            r1[r2] = r5
            long r0 = r4.size()
            r2 = 1
            long r0 = r0 + r2
            r4.setSize$okio(r0)
            return r4
    }

    public static final okio.Buffer commonWriteDecimalLong(okio.Buffer r12, long r13) {
            r12.getClass()
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto L10
            r13 = 48
            okio.Buffer r12 = r12.writeByte(r13)
            return r12
        L10:
            r3 = 1
            if (r2 >= 0) goto L21
            long r13 = -r13
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L1f
            java.lang.String r13 = "-9223372036854775808"
            okio.Buffer r12 = r12.writeUtf8(r13)
            return r12
        L1f:
            r2 = r3
            goto L22
        L21:
            r2 = 0
        L22:
            r4 = 100000000(0x5f5e100, double:4.94065646E-316)
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            r5 = 10
            if (r4 >= 0) goto L70
            r6 = 10000(0x2710, double:4.9407E-320)
            int r4 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r4 >= 0) goto L4e
            r6 = 100
            int r4 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r4 >= 0) goto L42
            r6 = 10
            int r4 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r4 >= 0) goto L3f
            goto Le7
        L3f:
            r3 = 2
            goto Le7
        L42:
            r3 = 1000(0x3e8, double:4.94E-321)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L4b
            r3 = 3
            goto Le7
        L4b:
            r3 = 4
            goto Le7
        L4e:
            r3 = 1000000(0xf4240, double:4.940656E-318)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L62
            r3 = 100000(0x186a0, double:4.94066E-319)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L5f
            r3 = 5
            goto Le7
        L5f:
            r3 = 6
            goto Le7
        L62:
            r3 = 10000000(0x989680, double:4.9406565E-317)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L6c
            r3 = 7
            goto Le7
        L6c:
            r3 = 8
            goto Le7
        L70:
            r3 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9d
            r3 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L8e
            r3 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L8c
            r3 = 9
            goto Le7
        L8c:
            r3 = r5
            goto Le7
        L8e:
            r3 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9a
            r3 = 11
            goto Le7
        L9a:
            r3 = 12
            goto Le7
        L9d:
            r3 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Lc1
            r3 = 10000000000000(0x9184e72a000, double:4.9406564584125E-311)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Lb2
            r3 = 13
            goto Le7
        Lb2:
            r3 = 100000000000000(0x5af3107a4000, double:4.94065645841247E-310)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Lbe
            r3 = 14
            goto Le7
        Lbe:
            r3 = 15
            goto Le7
        Lc1:
            r3 = 100000000000000000(0x16345785d8a0000, double:5.620395787888205E-302)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Ld9
            r3 = 10000000000000000(0x2386f26fc10000, double:5.431165199810528E-308)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Ld6
            r3 = 16
            goto Le7
        Ld6:
            r3 = 17
            goto Le7
        Ld9:
            r3 = 1000000000000000000(0xde0b6b3a7640000, double:7.832953389245686E-242)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Le5
            r3 = 18
            goto Le7
        Le5:
            r3 = 19
        Le7:
            if (r2 == 0) goto Leb
            int r3 = r3 + 1
        Leb:
            okio.Segment r4 = r12.writableSegment$okio(r3)
            byte[] r6 = r4.data
            int r7 = r4.limit
            int r7 = r7 + r3
        Lf4:
            int r8 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r8 == 0) goto L108
            long r8 = (long) r5
            long r10 = r13 % r8
            int r10 = (int) r10
            int r7 = r7 + (-1)
            byte[] r11 = getHEX_DIGIT_BYTES()
            r10 = r11[r10]
            r6[r7] = r10
            long r13 = r13 / r8
            goto Lf4
        L108:
            if (r2 == 0) goto L110
            int r7 = r7 + (-1)
            r13 = 45
            r6[r7] = r13
        L110:
            int r13 = r4.limit
            int r13 = r13 + r3
            r4.limit = r13
            long r13 = r12.size()
            long r0 = (long) r3
            long r13 = r13 + r0
            r12.setSize$okio(r13)
            return r12
    }

    public static final okio.Buffer commonWriteHexadecimalUnsignedLong(okio.Buffer r12, long r13) {
            r12.getClass()
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 != 0) goto L10
            r13 = 48
            okio.Buffer r12 = r12.writeByte(r13)
            return r12
        L10:
            r0 = 1
            long r1 = r13 >>> r0
            long r1 = r1 | r13
            r3 = 2
            long r4 = r1 >>> r3
            long r1 = r1 | r4
            r4 = 4
            long r5 = r1 >>> r4
            long r1 = r1 | r5
            r5 = 8
            long r6 = r1 >>> r5
            long r1 = r1 | r6
            r6 = 16
            long r7 = r1 >>> r6
            long r1 = r1 | r7
            r7 = 32
            long r8 = r1 >>> r7
            long r1 = r1 | r8
            long r8 = r1 >>> r0
            r10 = 6148914691236517205(0x5555555555555555, double:1.1945305291614955E103)
            long r8 = r8 & r10
            long r1 = r1 - r8
            long r8 = r1 >>> r3
            r10 = 3689348814741910323(0x3333333333333333, double:4.667261458395856E-62)
            long r8 = r8 & r10
            long r1 = r1 & r10
            long r8 = r8 + r1
            long r1 = r8 >>> r4
            long r1 = r1 + r8
            r8 = 1085102592571150095(0xf0f0f0f0f0f0f0f, double:3.815736827118017E-236)
            long r1 = r1 & r8
            long r8 = r1 >>> r5
            long r1 = r1 + r8
            long r5 = r1 >>> r6
            long r1 = r1 + r5
            r5 = 63
            long r8 = r1 & r5
            long r1 = r1 >>> r7
            long r1 = r1 & r5
            long r8 = r8 + r1
            r1 = 3
            long r1 = (long) r1
            long r8 = r8 + r1
            long r1 = (long) r4
            long r8 = r8 / r1
            int r1 = (int) r8
            okio.Segment r2 = r12.writableSegment$okio(r1)
            byte[] r3 = r2.data
            int r5 = r2.limit
            int r6 = r5 + r1
            int r6 = r6 - r0
        L65:
            if (r6 < r5) goto L77
            byte[] r0 = getHEX_DIGIT_BYTES()
            r7 = 15
            long r7 = r7 & r13
            int r7 = (int) r7
            r0 = r0[r7]
            r3[r6] = r0
            long r13 = r13 >>> r4
            int r6 = r6 + (-1)
            goto L65
        L77:
            int r13 = r2.limit
            int r13 = r13 + r1
            r2.limit = r13
            long r13 = r12.size()
            long r0 = (long) r1
            long r13 = r13 + r0
            r12.setSize$okio(r13)
            return r12
    }

    public static final okio.Buffer commonWriteInt(okio.Buffer r7, int r8) {
            r7.getClass()
            r0 = 4
            okio.Segment r1 = r7.writableSegment$okio(r0)
            byte[] r2 = r1.data
            int r3 = r1.limit
            int r4 = r3 + 1
            int r5 = r8 >>> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r2[r3] = r5
            int r5 = r3 + 2
            int r6 = r8 >>> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 3
            int r6 = r8 >>> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r2[r5] = r6
            int r3 = r3 + r0
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r2[r4] = r8
            r1.limit = r3
            long r0 = r7.size()
            r2 = 4
            long r0 = r0 + r2
            r7.setSize$okio(r0)
            return r7
    }

    public static final okio.Buffer commonWriteLong(okio.Buffer r11, long r12) {
            r11.getClass()
            r0 = 8
            okio.Segment r1 = r11.writableSegment$okio(r0)
            byte[] r2 = r1.data
            int r3 = r1.limit
            int r4 = r3 + 1
            r5 = 56
            long r5 = r12 >>> r5
            r7 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r7
            int r5 = (int) r5
            byte r5 = (byte) r5
            r2[r3] = r5
            int r5 = r3 + 2
            r6 = 48
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 3
            r6 = 40
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r5] = r6
            int r5 = r3 + 4
            r6 = 32
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 5
            r6 = 24
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r5] = r6
            int r5 = r3 + 6
            r6 = 16
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 7
            long r9 = r12 >>> r0
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r5] = r6
            int r3 = r3 + r0
            long r12 = r12 & r7
            int r12 = (int) r12
            byte r12 = (byte) r12
            r2[r4] = r12
            r1.limit = r3
            long r12 = r11.size()
            r0 = 8
            long r12 = r12 + r0
            r11.setSize$okio(r12)
            return r11
    }

    public static final okio.Buffer commonWriteShort(okio.Buffer r6, int r7) {
            r6.getClass()
            r0 = 2
            okio.Segment r1 = r6.writableSegment$okio(r0)
            byte[] r2 = r1.data
            int r3 = r1.limit
            int r4 = r3 + 1
            int r5 = r7 >>> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r2[r3] = r5
            int r3 = r3 + r0
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r2[r4] = r7
            r1.limit = r3
            long r0 = r6.size()
            r2 = 2
            long r0 = r0 + r2
            r6.setSize$okio(r0)
            return r6
    }

    public static final okio.Buffer commonWriteUtf8(okio.Buffer r9, java.lang.String r10, int r11, int r12) {
            r9.getClass()
            r10.getClass()
            if (r11 < 0) goto L13b
            if (r12 < r11) goto L12f
            int r0 = r10.length()
            if (r12 > r0) goto L11e
        L10:
            if (r11 >= r12) goto L11d
            char r0 = r10.charAt(r11)
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L51
            r2 = 1
            okio.Segment r2 = r9.writableSegment$okio(r2)
            byte[] r3 = r2.data
            int r4 = r2.limit
            int r4 = r4 - r11
            int r5 = 8192 - r4
            int r5 = java.lang.Math.min(r12, r5)
            int r6 = r11 + 1
            int r11 = r11 + r4
            byte r0 = (byte) r0
            r3[r11] = r0
        L30:
            r11 = r6
            if (r11 >= r5) goto L40
            char r0 = r10.charAt(r11)
            if (r0 >= r1) goto L40
            int r6 = r11 + 1
            int r11 = r11 + r4
            byte r0 = (byte) r0
            r3[r11] = r0
            goto L30
        L40:
            int r4 = r4 + r11
            int r0 = r2.limit
            int r4 = r4 - r0
            int r0 = r0 + r4
            r2.limit = r0
            long r0 = r9.size()
            long r2 = (long) r4
            long r0 = r0 + r2
            r9.setSize$okio(r0)
            goto L10
        L51:
            r2 = 2048(0x800, float:2.87E-42)
            if (r0 >= r2) goto L7d
            r2 = 2
            okio.Segment r3 = r9.writableSegment$okio(r2)
            byte[] r4 = r3.data
            int r5 = r3.limit
            int r6 = r0 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            r4[r6] = r0
            int r5 = r5 + r2
            r3.limit = r5
            long r0 = r9.size()
            r2 = 2
            long r0 = r0 + r2
            r9.setSize$okio(r0)
        L7a:
            int r11 = r11 + 1
            goto L10
        L7d:
            r2 = 55296(0xd800, float:7.7486E-41)
            r3 = 63
            if (r0 < r2) goto Led
            r2 = 57343(0xdfff, float:8.0355E-41)
            if (r0 <= r2) goto L8a
            goto Led
        L8a:
            int r2 = r11 + 1
            if (r2 >= r12) goto L93
            char r4 = r10.charAt(r2)
            goto L94
        L93:
            r4 = 0
        L94:
            r5 = 56319(0xdbff, float:7.892E-41)
            if (r0 > r5) goto Le7
            r5 = 56320(0xdc00, float:7.8921E-41)
            if (r5 > r4) goto Le7
            r5 = 57344(0xe000, float:8.0356E-41)
            if (r4 >= r5) goto Le7
            r0 = r0 & 1023(0x3ff, float:1.434E-42)
            int r0 = r0 << 10
            r2 = r4 & 1023(0x3ff, float:1.434E-42)
            r0 = r0 | r2
            r2 = 65536(0x10000, float:9.1835E-41)
            int r0 = r0 + r2
            r2 = 4
            okio.Segment r4 = r9.writableSegment$okio(r2)
            byte[] r5 = r4.data
            int r6 = r4.limit
            int r7 = r0 >> 18
            r7 = r7 | 240(0xf0, float:3.36E-43)
            byte r7 = (byte) r7
            r5[r6] = r7
            int r7 = r6 + 1
            int r8 = r0 >> 12
            r8 = r8 & r3
            r8 = r8 | r1
            byte r8 = (byte) r8
            r5[r7] = r8
            int r7 = r6 + 2
            int r8 = r0 >> 6
            r8 = r8 & r3
            r8 = r8 | r1
            byte r8 = (byte) r8
            r5[r7] = r8
            int r7 = r6 + 3
            r0 = r0 & r3
            r0 = r0 | r1
            byte r0 = (byte) r0
            r5[r7] = r0
            int r6 = r6 + r2
            r4.limit = r6
            long r0 = r9.size()
            r2 = 4
            long r0 = r0 + r2
            r9.setSize$okio(r0)
            int r11 = r11 + 2
            goto L10
        Le7:
            r9.writeByte(r3)
            r11 = r2
            goto L10
        Led:
            r2 = 3
            okio.Segment r4 = r9.writableSegment$okio(r2)
            byte[] r5 = r4.data
            int r6 = r4.limit
            int r7 = r0 >> 12
            r7 = r7 | 224(0xe0, float:3.14E-43)
            byte r7 = (byte) r7
            r5[r6] = r7
            int r7 = r6 + 1
            int r8 = r0 >> 6
            r3 = r3 & r8
            r3 = r3 | r1
            byte r3 = (byte) r3
            r5[r7] = r3
            int r3 = r6 + 2
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            r5[r3] = r0
            int r6 = r6 + r2
            r4.limit = r6
            long r0 = r9.size()
            r2 = 3
            long r0 = r0 + r2
            r9.setSize$okio(r0)
            goto L7a
        L11d:
            return r9
        L11e:
            java.lang.String r9 = "endIndex > string.length: "
            java.lang.String r11 = " > "
            java.lang.StringBuilder r9 = eh.a.t(r12, r9, r11)
            int r10 = r10.length()
            okio.a.e(r10, r9)
        L12d:
            r9 = 0
            return r9
        L12f:
            java.lang.String r9 = "endIndex < beginIndex: "
            java.lang.String r10 = " < "
            java.lang.String r9 = p.a.j(r12, r9, r10, r11)
            j8.o.q(r9)
            goto L12d
        L13b:
            java.lang.String r9 = "beginIndex < 0: "
            java.lang.String r9 = eh.a.l(r11, r9)
            j8.o.q(r9)
            goto L12d
    }

    public static final okio.Buffer commonWriteUtf8CodePoint(okio.Buffer r8, int r9) {
            r8.getClass()
            r0 = 128(0x80, float:1.8E-43)
            if (r9 >= r0) goto Lb
            r8.writeByte(r9)
            return r8
        Lb:
            r1 = 2048(0x800, float:2.87E-42)
            r2 = 63
            if (r9 >= r1) goto L36
            r1 = 2
            okio.Segment r3 = r8.writableSegment$okio(r1)
            byte[] r4 = r3.data
            int r5 = r3.limit
            int r6 = r9 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.limit = r5
            long r0 = r8.size()
            r2 = 2
            long r0 = r0 + r2
            r8.setSize$okio(r0)
            return r8
        L36:
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r1 > r9) goto L44
            r1 = 57344(0xe000, float:8.0356E-41)
            if (r9 >= r1) goto L44
            r8.writeByte(r2)
            return r8
        L44:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r9 >= r1) goto L76
            r1 = 3
            okio.Segment r3 = r8.writableSegment$okio(r1)
            byte[] r4 = r3.data
            int r5 = r3.limit
            int r6 = r9 >> 12
            r6 = r6 | 224(0xe0, float:3.14E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            int r7 = r9 >> 6
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 2
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.limit = r5
            long r0 = r8.size()
            r2 = 3
            long r0 = r0 + r2
            r8.setSize$okio(r0)
            return r8
        L76:
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r9 > r1) goto Lb2
            r1 = 4
            okio.Segment r3 = r8.writableSegment$okio(r1)
            byte[] r4 = r3.data
            int r5 = r3.limit
            int r6 = r9 >> 18
            r6 = r6 | 240(0xf0, float:3.36E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            int r7 = r9 >> 12
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 2
            int r7 = r9 >> 6
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 3
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.limit = r5
            long r0 = r8.size()
            r2 = 4
            long r0 = r0 + r2
            r8.setSize$okio(r0)
            return r8
        Lb2:
            java.lang.String r8 = "Unexpected code point: 0x"
            java.lang.String r9 = okio.SegmentedByteString.toHexString(r9)
            j8.o.x(r9, r8)
            r8 = 0
            return r8
    }

    public static final byte[] getHEX_DIGIT_BYTES() {
            byte[] r0 = okio.internal.Buffer.HEX_DIGIT_BYTES
            return r0
    }

    public static /* synthetic */ void getHEX_DIGIT_BYTES$annotations() {
            return
    }

    public static final boolean rangeEquals(okio.Segment r5, int r6, byte[] r7, int r8, int r9) {
            r5.getClass()
            r7.getClass()
            int r0 = r5.limit
            byte[] r1 = r5.data
        La:
            if (r8 >= r9) goto L2a
            if (r6 != r0) goto L1d
            okio.Segment r5 = r5.next
            r5.getClass()
            byte[] r6 = r5.data
            int r0 = r5.pos
            int r1 = r5.limit
            r4 = r1
            r1 = r6
            r6 = r0
            r0 = r4
        L1d:
            r2 = r1[r6]
            r3 = r7[r8]
            if (r2 == r3) goto L25
            r5 = 0
            return r5
        L25:
            int r6 = r6 + 1
            int r8 = r8 + 1
            goto La
        L2a:
            r5 = 1
            return r5
    }

    public static final java.lang.String readUtf8Line(okio.Buffer r6, long r7) {
            r6.getClass()
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L1f
            long r3 = r7 - r1
            byte r0 = r6.getByte(r3)
            r5 = 13
            if (r0 != r5) goto L1f
            java.lang.String r7 = r6.readUtf8(r3)
            r0 = 2
            r6.skip(r0)
            return r7
        L1f:
            java.lang.String r7 = r6.readUtf8(r7)
            r6.skip(r1)
            return r7
    }

    public static final <T> T seek(okio.Buffer r5, long r6, fg.p r8) {
            r5.getClass()
            r8.getClass()
            okio.Segment r0 = r5.head
            if (r0 != 0) goto L16
            r5 = -1
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 0
            java.lang.Object r5 = r8.invoke(r6, r5)
            return r5
        L16:
            long r1 = r5.size()
            long r1 = r1 - r6
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 >= 0) goto L3d
            long r1 = r5.size()
        L23:
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 <= 0) goto L34
            okio.Segment r0 = r0.prev
            r0.getClass()
            int r5 = r0.limit
            int r3 = r0.pos
            int r5 = r5 - r3
            long r3 = (long) r5
            long r1 = r1 - r3
            goto L23
        L34:
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            java.lang.Object r5 = r8.invoke(r0, r5)
            return r5
        L3d:
            r1 = 0
        L3f:
            int r5 = r0.limit
            int r3 = r0.pos
            int r5 = r5 - r3
            long r3 = (long) r5
            long r3 = r3 + r1
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 > 0) goto L51
            okio.Segment r0 = r0.next
            r0.getClass()
            r1 = r3
            goto L3f
        L51:
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            java.lang.Object r5 = r8.invoke(r0, r5)
            return r5
    }

    public static final int selectPrefix(okio.Buffer r17, okio.Options r18, boolean r19) {
            r17.getClass()
            r18.getClass()
            r0 = r17
            okio.Segment r0 = r0.head
            r1 = -2
            r2 = -1
            if (r0 != 0) goto L12
            if (r19 == 0) goto L11
            return r1
        L11:
            return r2
        L12:
            byte[] r3 = r0.data
            int r4 = r0.pos
            int r5 = r0.limit
            int[] r6 = r18.getTrie$okio()
            r7 = 0
            r9 = r0
            r10 = r2
            r8 = r7
        L20:
            int r11 = r8 + 1
            r12 = r6[r8]
            int r8 = r8 + 2
            r11 = r6[r11]
            if (r11 == r2) goto L2b
            r10 = r11
        L2b:
            if (r9 != 0) goto L2e
            goto L5e
        L2e:
            r11 = 0
            if (r12 >= 0) goto L77
            int r12 = r12 * (-1)
            int r13 = r12 + r8
        L35:
            int r12 = r4 + 1
            r4 = r3[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r14 = r8 + 1
            r8 = r6[r8]
            if (r4 == r8) goto L42
            goto L81
        L42:
            if (r14 != r13) goto L46
            r4 = 1
            goto L47
        L46:
            r4 = r7
        L47:
            if (r12 != r5) goto L67
            r9.getClass()
            okio.Segment r3 = r9.next
            r3.getClass()
            int r5 = r3.pos
            byte[] r8 = r3.data
            int r9 = r3.limit
            if (r3 != r0) goto L61
            if (r4 == 0) goto L5e
            r3 = r8
            r8 = r11
            goto L6a
        L5e:
            if (r19 == 0) goto L81
            return r1
        L61:
            r16 = r8
            r8 = r3
            r3 = r16
            goto L6a
        L67:
            r8 = r9
            r9 = r5
            r5 = r12
        L6a:
            if (r4 == 0) goto L72
            r4 = r6[r14]
            r13 = r5
            r5 = r9
            r9 = r8
            goto L9c
        L72:
            r4 = r5
            r5 = r9
            r9 = r8
            r8 = r14
            goto L35
        L77:
            int r13 = r4 + 1
            r4 = r3[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r14 = r8 + r12
        L7f:
            if (r8 != r14) goto L82
        L81:
            return r10
        L82:
            r15 = r6[r8]
            if (r4 != r15) goto La3
            int r8 = r8 + r12
            r4 = r6[r8]
            if (r13 != r5) goto L9c
            okio.Segment r9 = r9.next
            r9.getClass()
            int r3 = r9.pos
            byte[] r5 = r9.data
            int r8 = r9.limit
            r13 = r3
            r3 = r5
            r5 = r8
            if (r9 != r0) goto L9c
            r9 = r11
        L9c:
            if (r4 < 0) goto L9f
            return r4
        L9f:
            int r8 = -r4
            r4 = r13
            goto L20
        La3:
            int r8 = r8 + 1
            goto L7f
    }

    public static /* synthetic */ int selectPrefix$default(okio.Buffer r0, okio.Options r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            int r0 = selectPrefix(r0, r1, r2)
            return r0
    }
}

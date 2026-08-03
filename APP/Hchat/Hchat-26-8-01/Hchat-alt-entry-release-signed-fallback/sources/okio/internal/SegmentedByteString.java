package okio.internal;

/* JADX INFO: renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class SegmentedByteString {
    public static final int binarySearch(int[] r2, int r3, int r4, int r5) {
            r2.getClass()
            int r5 = r5 + (-1)
        L5:
            if (r4 > r5) goto L18
            int r0 = r4 + r5
            int r0 = r0 >>> 1
            r1 = r2[r0]
            if (r1 >= r3) goto L12
            int r4 = r0 + 1
            goto L5
        L12:
            if (r1 <= r3) goto L17
            int r5 = r0 + (-1)
            goto L5
        L17:
            return r0
        L18:
            int r2 = -r4
            int r2 = r2 + (-1)
            return r2
    }

    public static final void commonCopyInto(okio.C0004SegmentedByteString r11, int r12, byte[] r13, int r14, int r15) {
            r11.getClass()
            r13.getClass()
            int r0 = r11.size()
            long r1 = (long) r0
            long r3 = (long) r12
            long r5 = (long) r15
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            int r0 = r13.length
            long r0 = (long) r0
            long r7 = (long) r14
            r9 = r5
            r5 = r0
            okio.SegmentedByteString.checkOffsetAndCount(r5, r7, r9)
            int r15 = r15 + r12
            int r0 = segment(r11, r12)
        L1d:
            if (r12 >= r15) goto L57
            if (r0 != 0) goto L23
            r1 = 0
            goto L2b
        L23:
            int[] r1 = r11.getDirectory$okio()
            int r2 = r0 + (-1)
            r1 = r1[r2]
        L2b:
            int[] r2 = r11.getDirectory$okio()
            r2 = r2[r0]
            int r2 = r2 - r1
            int[] r3 = r11.getDirectory$okio()
            byte[][] r4 = r11.getSegments$okio()
            int r4 = r4.length
            int r4 = r4 + r0
            r3 = r3[r4]
            int r2 = r2 + r1
            int r2 = java.lang.Math.min(r15, r2)
            int r2 = r2 - r12
            int r1 = r12 - r1
            int r1 = r1 + r3
            byte[][] r3 = r11.getSegments$okio()
            r3 = r3[r0]
            int r4 = r1 + r2
            tf.l.o0(r3, r14, r1, r13, r4)
            int r14 = r14 + r2
            int r12 = r12 + r2
            int r0 = r0 + 1
            goto L1d
        L57:
            return
    }

    public static final boolean commonEquals(okio.C0004SegmentedByteString r4, java.lang.Object r5) {
            r4.getClass()
            r0 = 1
            if (r5 != r4) goto L7
            return r0
        L7:
            boolean r1 = r5 instanceof okio.ByteString
            r2 = 0
            if (r1 == 0) goto L23
            okio.ByteString r5 = (okio.ByteString) r5
            int r1 = r5.size()
            int r3 = r4.size()
            if (r1 != r3) goto L23
            int r1 = r4.size()
            boolean r4 = r4.rangeEquals(r2, r5, r2, r1)
            if (r4 == 0) goto L23
            return r0
        L23:
            return r2
    }

    public static final int commonGetSize(okio.C0004SegmentedByteString r1) {
            r1.getClass()
            int[] r0 = r1.getDirectory$okio()
            byte[][] r1 = r1.getSegments$okio()
            int r1 = r1.length
            int r1 = r1 + (-1)
            r1 = r0[r1]
            return r1
    }

    public static final int commonHashCode(okio.C0004SegmentedByteString r8) {
            r8.getClass()
            int r0 = r8.getHashCode$okio()
            if (r0 == 0) goto La
            return r0
        La:
            byte[][] r0 = r8.getSegments$okio()
            int r0 = r0.length
            r1 = 0
            r2 = 1
            r3 = r2
            r2 = r1
        L13:
            if (r1 >= r0) goto L3a
            int[] r4 = r8.getDirectory$okio()
            int r5 = r0 + r1
            r4 = r4[r5]
            int[] r5 = r8.getDirectory$okio()
            r5 = r5[r1]
            byte[][] r6 = r8.getSegments$okio()
            r6 = r6[r1]
            int r2 = r5 - r2
            int r2 = r2 + r4
        L2c:
            if (r4 >= r2) goto L36
            int r3 = r3 * 31
            r7 = r6[r4]
            int r3 = r3 + r7
            int r4 = r4 + 1
            goto L2c
        L36:
            int r1 = r1 + 1
            r2 = r5
            goto L13
        L3a:
            r8.setHashCode$okio(r3)
            return r3
    }

    public static final byte commonInternalGet(okio.C0004SegmentedByteString r7, int r8) {
            r7.getClass()
            int[] r0 = r7.getDirectory$okio()
            byte[][] r1 = r7.getSegments$okio()
            int r1 = r1.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            long r1 = (long) r0
            long r3 = (long) r8
            r5 = 1
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            int r0 = segment(r7, r8)
            if (r0 != 0) goto L1f
            r1 = 0
            goto L27
        L1f:
            int[] r1 = r7.getDirectory$okio()
            int r2 = r0 + (-1)
            r1 = r1[r2]
        L27:
            int[] r2 = r7.getDirectory$okio()
            byte[][] r3 = r7.getSegments$okio()
            int r3 = r3.length
            int r3 = r3 + r0
            r2 = r2[r3]
            byte[][] r7 = r7.getSegments$okio()
            r7 = r7[r0]
            int r8 = r8 - r1
            int r8 = r8 + r2
            r7 = r7[r8]
            return r7
    }

    public static final boolean commonRangeEquals(okio.C0004SegmentedByteString r6, int r7, okio.ByteString r8, int r9, int r10) {
            r6.getClass()
            r8.getClass()
            r0 = 0
            if (r7 < 0) goto L54
            int r1 = r6.size()
            int r1 = r1 - r10
            if (r7 <= r1) goto L11
            goto L54
        L11:
            int r10 = r10 + r7
            int r1 = segment(r6, r7)
        L16:
            if (r7 >= r10) goto L52
            if (r1 != 0) goto L1c
            r2 = r0
            goto L24
        L1c:
            int[] r2 = r6.getDirectory$okio()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L24:
            int[] r3 = r6.getDirectory$okio()
            r3 = r3[r1]
            int r3 = r3 - r2
            int[] r4 = r6.getDirectory$okio()
            byte[][] r5 = r6.getSegments$okio()
            int r5 = r5.length
            int r5 = r5 + r1
            r4 = r4[r5]
            int r3 = r3 + r2
            int r3 = java.lang.Math.min(r10, r3)
            int r3 = r3 - r7
            int r2 = r7 - r2
            int r2 = r2 + r4
            byte[][] r4 = r6.getSegments$okio()
            r4 = r4[r1]
            boolean r2 = r8.rangeEquals(r9, r4, r2, r3)
            if (r2 != 0) goto L4d
            return r0
        L4d:
            int r9 = r9 + r3
            int r7 = r7 + r3
            int r1 = r1 + 1
            goto L16
        L52:
            r6 = 1
            return r6
        L54:
            return r0
    }

    public static final boolean commonRangeEquals(okio.C0004SegmentedByteString r6, int r7, byte[] r8, int r9, int r10) {
            r6.getClass()
            r8.getClass()
            r0 = 0
            if (r7 < 0) goto L5a
            int r1 = r6.size()
            int r1 = r1 - r10
            if (r7 > r1) goto L5a
            if (r9 < 0) goto L5a
            int r1 = r8.length
            int r1 = r1 - r10
            if (r9 <= r1) goto L17
            goto L5a
        L17:
            int r10 = r10 + r7
            int r1 = segment(r6, r7)
        L1c:
            if (r7 >= r10) goto L58
            if (r1 != 0) goto L22
            r2 = r0
            goto L2a
        L22:
            int[] r2 = r6.getDirectory$okio()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L2a:
            int[] r3 = r6.getDirectory$okio()
            r3 = r3[r1]
            int r3 = r3 - r2
            int[] r4 = r6.getDirectory$okio()
            byte[][] r5 = r6.getSegments$okio()
            int r5 = r5.length
            int r5 = r5 + r1
            r4 = r4[r5]
            int r3 = r3 + r2
            int r3 = java.lang.Math.min(r10, r3)
            int r3 = r3 - r7
            int r2 = r7 - r2
            int r2 = r2 + r4
            byte[][] r4 = r6.getSegments$okio()
            r4 = r4[r1]
            boolean r2 = okio.SegmentedByteString.arrayRangeEquals(r4, r2, r8, r9, r3)
            if (r2 != 0) goto L53
            return r0
        L53:
            int r9 = r9 + r3
            int r7 = r7 + r3
            int r1 = r1 + 1
            goto L1c
        L58:
            r6 = 1
            return r6
        L5a:
            return r0
    }

    public static final okio.ByteString commonSubstring(okio.C0004SegmentedByteString r10, int r11, int r12) {
            r10.getClass()
            int r12 = okio.SegmentedByteString.resolveDefaultParameter(r10, r12)
            if (r11 < 0) goto Lab
            int r0 = r10.size()
            java.lang.String r1 = "endIndex="
            if (r12 > r0) goto L8b
            int r0 = r12 - r11
            if (r0 < 0) goto L80
            if (r11 != 0) goto L1e
            int r1 = r10.size()
            if (r12 != r1) goto L1e
            return r10
        L1e:
            if (r11 != r12) goto L23
            okio.ByteString r10 = okio.ByteString.EMPTY
            return r10
        L23:
            int r1 = segment(r10, r11)
            int r12 = r12 + (-1)
            int r12 = segment(r10, r12)
            byte[][] r2 = r10.getSegments$okio()
            int r3 = r12 + 1
            java.lang.Object[] r2 = tf.l.u0(r2, r1, r3)
            byte[][] r2 = (byte[][]) r2
            int r3 = r2.length
            int r3 = r3 * 2
            int[] r3 = new int[r3]
            r4 = 0
            if (r1 > r12) goto L68
            r6 = r1
            r5 = r4
        L43:
            int[] r7 = r10.getDirectory$okio()
            r7 = r7[r6]
            int r7 = r7 - r11
            int r7 = java.lang.Math.min(r7, r0)
            r3[r5] = r7
            int r7 = r5 + 1
            int r8 = r2.length
            int r5 = r5 + r8
            int[] r8 = r10.getDirectory$okio()
            byte[][] r9 = r10.getSegments$okio()
            int r9 = r9.length
            int r9 = r9 + r6
            r8 = r8[r9]
            r3[r5] = r8
            if (r6 == r12) goto L68
            int r6 = r6 + 1
            r5 = r7
            goto L43
        L68:
            if (r1 != 0) goto L6b
            goto L73
        L6b:
            int[] r10 = r10.getDirectory$okio()
            int r1 = r1 + (-1)
            r4 = r10[r1]
        L73:
            int r10 = r2.length
            r12 = r3[r10]
            int r11 = r11 - r4
            int r11 = r11 + r12
            r3[r10] = r11
            okio.SegmentedByteString r10 = new okio.SegmentedByteString
            r10.<init>(r2, r3)
            return r10
        L80:
            java.lang.String r10 = " < beginIndex="
            java.lang.String r10 = p.a.j(r12, r1, r10, r11)
            j8.o.q(r10)
            r10 = 0
            return r10
        L8b:
            java.lang.String r11 = " > length("
            java.lang.StringBuilder r11 = eh.a.t(r12, r1, r11)
            int r10 = r10.size()
            r11.append(r10)
            r10 = 41
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        Lab:
            java.lang.String r10 = "beginIndex="
            java.lang.String r12 = " < 0"
            java.lang.String r10 = eh.a.m(r11, r10, r12)
            j8.o.q(r10)
            r10 = 0
            return r10
    }

    public static final byte[] commonToByteArray(okio.C0004SegmentedByteString r9) {
            r9.getClass()
            int r0 = r9.size()
            byte[] r0 = new byte[r0]
            byte[][] r1 = r9.getSegments$okio()
            int r1 = r1.length
            r2 = 0
            r3 = r2
            r4 = r3
        L11:
            if (r2 >= r1) goto L33
            int[] r5 = r9.getDirectory$okio()
            int r6 = r1 + r2
            r5 = r5[r6]
            int[] r6 = r9.getDirectory$okio()
            r6 = r6[r2]
            byte[][] r7 = r9.getSegments$okio()
            r7 = r7[r2]
            int r3 = r6 - r3
            int r8 = r5 + r3
            tf.l.o0(r7, r4, r5, r0, r8)
            int r4 = r4 + r3
            int r2 = r2 + 1
            r3 = r6
            goto L11
        L33:
            return r0
    }

    public static final void commonWrite(okio.C0004SegmentedByteString r11, okio.Buffer r12, int r13, int r14) {
            r11.getClass()
            r12.getClass()
            int r0 = r13 + r14
            int r1 = segment(r11, r13)
        Lc:
            if (r13 >= r0) goto L60
            if (r1 != 0) goto L12
            r2 = 0
            goto L1a
        L12:
            int[] r2 = r11.getDirectory$okio()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L1a:
            int[] r3 = r11.getDirectory$okio()
            r3 = r3[r1]
            int r3 = r3 - r2
            int[] r4 = r11.getDirectory$okio()
            byte[][] r5 = r11.getSegments$okio()
            int r5 = r5.length
            int r5 = r5 + r1
            r4 = r4[r5]
            int r3 = r3 + r2
            int r3 = java.lang.Math.min(r0, r3)
            int r3 = r3 - r13
            int r2 = r13 - r2
            int r7 = r2 + r4
            byte[][] r2 = r11.getSegments$okio()
            r6 = r2[r1]
            okio.Segment r5 = new okio.Segment
            int r8 = r7 + r3
            r9 = 1
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            okio.Segment r2 = r12.head
            if (r2 != 0) goto L51
            r5.prev = r5
            r5.next = r5
            r12.head = r5
            goto L5c
        L51:
            r2.getClass()
            okio.Segment r2 = r2.prev
            r2.getClass()
            r2.push(r5)
        L5c:
            int r13 = r13 + r3
            int r1 = r1 + 1
            goto Lc
        L60:
            long r0 = r12.size()
            long r13 = (long) r14
            long r0 = r0 + r13
            r12.setSize$okio(r0)
            return
    }

    private static final void forEachSegment(okio.C0004SegmentedByteString r5, int r6, int r7, fg.q r8) {
            int r0 = segment(r5, r6)
        L4:
            if (r6 >= r7) goto L43
            if (r0 != 0) goto La
            r1 = 0
            goto L12
        La:
            int[] r1 = r5.getDirectory$okio()
            int r2 = r0 + (-1)
            r1 = r1[r2]
        L12:
            int[] r2 = r5.getDirectory$okio()
            r2 = r2[r0]
            int r2 = r2 - r1
            int[] r3 = r5.getDirectory$okio()
            byte[][] r4 = r5.getSegments$okio()
            int r4 = r4.length
            int r4 = r4 + r0
            r3 = r3[r4]
            int r2 = r2 + r1
            int r2 = java.lang.Math.min(r7, r2)
            int r2 = r2 - r6
            int r1 = r6 - r1
            int r1 = r1 + r3
            byte[][] r3 = r5.getSegments$okio()
            r3 = r3[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r8.b(r3, r1, r4)
            int r6 = r6 + r2
            int r0 = r0 + 1
            goto L4
        L43:
            return
    }

    public static final void forEachSegment(okio.C0004SegmentedByteString r6, fg.q r7) {
            r6.getClass()
            r7.getClass()
            byte[][] r0 = r6.getSegments$okio()
            int r0 = r0.length
            r1 = 0
            r2 = r1
        Ld:
            if (r1 >= r0) goto L34
            int[] r3 = r6.getDirectory$okio()
            int r4 = r0 + r1
            r3 = r3[r4]
            int[] r4 = r6.getDirectory$okio()
            r4 = r4[r1]
            byte[][] r5 = r6.getSegments$okio()
            r5 = r5[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r2 = r4 - r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7.b(r5, r3, r2)
            int r1 = r1 + 1
            r2 = r4
            goto Ld
        L34:
            return
    }

    public static final int segment(okio.C0004SegmentedByteString r2, int r3) {
            r2.getClass()
            int[] r0 = r2.getDirectory$okio()
            int r3 = r3 + 1
            byte[][] r2 = r2.getSegments$okio()
            int r2 = r2.length
            r1 = 0
            int r2 = binarySearch(r0, r3, r1, r2)
            if (r2 < 0) goto L16
            return r2
        L16:
            int r2 = ~r2
            return r2
    }
}

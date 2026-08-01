package okio.internal;

/* JADX INFO: renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
/* JADX INFO: compiled from: SegmentedByteString.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000T\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a-\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u0017\u0010\u000e\u001a\u00020\u000f*\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0080\b\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\bH\u0080\b\u001a\r\u0010\u0013\u001a\u00020\u0001*\u00020\bH\u0080\b\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0001H\u0080\b\u001a-\u0010\u0017\u001a\u00020\u000f*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a-\u0010\u0017\u001a\u00020\u000f*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u001d\u0010\u001a\u001a\u00020\u0019*\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0001H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u000b*\u00020\bH\u0080\b\u001a%\u0010\u001e\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a]\u0010!\u001a\u00020\u0007*\u00020\b2K\u0010\"\u001aG\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00070#H\u0080\bø\u0001\u0000\u001aj\u0010!\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012K\u0010\"\u001aG\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00070#H\u0082\b\u001a\u0014\u0010'\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0001H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, m115d2 = {"binarySearch", "", "", "value", "fromIndex", "toIndex", "commonCopyInto", "", "Lokio/SegmentedByteString;", "offset", "target", "", "targetOffset", "byteCount", "commonEquals", "", "other", "", "commonGetSize", "commonHashCode", "commonInternalGet", "", "pos", "commonRangeEquals", "otherOffset", "Lokio/ByteString;", "commonSubstring", "beginIndex", "endIndex", "commonToByteArray", "commonWrite", "buffer", "Lokio/Buffer;", "forEachSegment", "action", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "data", "segment", "okio"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class SegmentedByteString {
    public static final int binarySearch(int[] r4, int r5, int r6, int r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r6
            int r1 = r7 + (-1)
        L8:
            if (r0 > r1) goto L1c
            int r2 = r0 + r1
            int r2 = r2 >>> 1
            r3 = r4[r2]
            if (r3 >= r5) goto L16
            int r0 = r2 + 1
            goto L8
        L16:
            if (r3 <= r5) goto L1b
            int r1 = r2 + (-1)
            goto L8
        L1b:
            return r2
        L1c:
            int r2 = -r0
            int r2 = r2 + (-1)
            return r2
    }

    public static final void commonCopyInto(okio.C1126SegmentedByteString r21, int r22, byte[] r23, int r24, int r25) {
            r0 = r22
            r1 = r23
            r2 = r25
            java.lang.String r3 = "<this>"
            r4 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            java.lang.String r3 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            r3 = 0
            int r5 = r21.size()
            long r6 = (long) r5
            long r8 = (long) r0
            long r10 = (long) r2
            okio.SegmentedByteString.checkOffsetAndCount(r6, r8, r10)
            int r5 = r1.length
            long r6 = (long) r5
            r5 = r24
            long r8 = (long) r5
            long r10 = (long) r2
            okio.SegmentedByteString.checkOffsetAndCount(r6, r8, r10)
            int r6 = r0 + r2
            r7 = r21
            r8 = 0
            int r9 = segment(r7, r0)
            r10 = r22
            r11 = r5
        L33:
            if (r10 >= r6) goto L89
            if (r9 != 0) goto L39
            r12 = 0
            goto L41
        L39:
            int[] r12 = r7.getDirectory$okio()
            int r13 = r9 + (-1)
            r12 = r12[r13]
        L41:
            int[] r13 = r7.getDirectory$okio()
            r13 = r13[r9]
            int r13 = r13 - r12
            int[] r14 = r7.getDirectory$okio()
            byte[][] r15 = r7.getSegments$okio()
            java.lang.Object[] r15 = (java.lang.Object[]) r15
            int r15 = r15.length
            int r15 = r15 + r9
            r14 = r14[r15]
            int r15 = r12 + r13
            int r15 = java.lang.Math.min(r6, r15)
            int r15 = r15 - r10
            int r16 = r10 - r12
            int r16 = r14 + r16
            byte[][] r17 = r7.getSegments$okio()
            r17 = r17[r9]
            r18 = r15
            r19 = r17
            r17 = r16
            r20 = 0
            r0 = r17
            int r2 = r0 + r18
            r17 = r3
            r3 = r19
            kotlin.collections.ArraysKt.copyInto(r3, r1, r11, r0, r2)
            int r11 = r11 + r18
            int r10 = r10 + r15
            int r9 = r9 + 1
            r0 = r22
            r2 = r25
            r3 = r17
            goto L33
        L89:
            return
    }

    public static final boolean commonEquals(okio.C1126SegmentedByteString r5, java.lang.Object r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            r1 = 1
            if (r6 != r5) goto Lb
            goto L2e
        Lb:
            boolean r2 = r6 instanceof okio.ByteString
            r3 = 0
            if (r2 == 0) goto L2d
            r2 = r6
            okio.ByteString r2 = (okio.ByteString) r2
            int r2 = r2.size()
            int r4 = r5.size()
            if (r2 != r4) goto L2b
            r2 = r6
            okio.ByteString r2 = (okio.ByteString) r2
            int r4 = r5.size()
            boolean r2 = r5.rangeEquals(r3, r2, r3, r4)
            if (r2 == 0) goto L2b
            goto L2e
        L2b:
            r1 = r3
            goto L2e
        L2d:
            r1 = r3
        L2e:
            return r1
    }

    public static final int commonGetSize(okio.C1126SegmentedByteString r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int[] r1 = r3.getDirectory$okio()
            byte[][] r2 = r3.getSegments$okio()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r2 = r2.length
            int r2 = r2 + (-1)
            r1 = r1[r2]
            return r1
    }

    public static final int commonHashCode(okio.C1126SegmentedByteString r18) {
            r0 = r18
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = 0
            int r2 = r18.getHashCode$okio()
            if (r2 == 0) goto L10
            return r2
        L10:
            r2 = 1
            r3 = r18
            r4 = 0
            byte[][] r5 = r3.getSegments$okio()
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            int r5 = r5.length
            r6 = 0
            r7 = 0
        L1d:
            if (r6 >= r5) goto L4c
            int[] r8 = r3.getDirectory$okio()
            int r9 = r5 + r6
            r8 = r8[r9]
            int[] r9 = r3.getDirectory$okio()
            r9 = r9[r6]
            byte[][] r10 = r3.getSegments$okio()
            r10 = r10[r6]
            int r11 = r9 - r7
            r12 = r8
            r13 = 0
            r14 = r12
            int r15 = r12 + r11
        L3a:
            if (r14 >= r15) goto L45
            int r16 = r2 * 31
            r17 = r10[r14]
            int r2 = r16 + r17
            int r14 = r14 + 1
            goto L3a
        L45:
            r7 = r9
            int r6 = r6 + 1
            goto L1d
        L4c:
            r0.setHashCode$okio(r2)
            return r2
    }

    public static final byte commonInternalGet(okio.C1126SegmentedByteString r8, int r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            int[] r1 = r8.getDirectory$okio()
            byte[][] r2 = r8.getSegments$okio()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r2 = r2.length
            int r2 = r2 + (-1)
            r1 = r1[r2]
            long r2 = (long) r1
            long r4 = (long) r9
            r6 = 1
            okio.SegmentedByteString.checkOffsetAndCount(r2, r4, r6)
            int r1 = segment(r8, r9)
            if (r1 != 0) goto L24
            r2 = 0
            goto L2c
        L24:
            int[] r2 = r8.getDirectory$okio()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L2c:
            int[] r3 = r8.getDirectory$okio()
            byte[][] r4 = r8.getSegments$okio()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r4 = r4.length
            int r4 = r4 + r1
            r3 = r3[r4]
            byte[][] r4 = r8.getSegments$okio()
            r4 = r4[r1]
            int r5 = r9 - r2
            int r5 = r5 + r3
            r4 = r4[r5]
            return r4
    }

    public static final boolean commonRangeEquals(okio.C1126SegmentedByteString r21, int r22, okio.ByteString r23, int r24, int r25) {
            r0 = r22
            r1 = r23
            java.lang.String r2 = "<this>"
            r3 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.String r2 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            if (r0 < 0) goto L8a
            int r5 = r21.size()
            int r5 = r5 - r25
            if (r0 <= r5) goto L1f
            r16 = r2
            goto L8c
        L1f:
            int r5 = r0 + r25
            r6 = r21
            r7 = 0
            int r8 = segment(r6, r0)
            r9 = r22
            r10 = r24
        L2d:
            if (r9 >= r5) goto L87
            if (r8 != 0) goto L33
            r11 = 0
            goto L3b
        L33:
            int[] r11 = r6.getDirectory$okio()
            int r12 = r8 + (-1)
            r11 = r11[r12]
        L3b:
            int[] r12 = r6.getDirectory$okio()
            r12 = r12[r8]
            int r12 = r12 - r11
            int[] r13 = r6.getDirectory$okio()
            byte[][] r14 = r6.getSegments$okio()
            java.lang.Object[] r14 = (java.lang.Object[]) r14
            int r14 = r14.length
            int r14 = r14 + r8
            r13 = r13[r14]
            int r14 = r11 + r12
            int r14 = java.lang.Math.min(r5, r14)
            int r14 = r14 - r9
            int r15 = r9 - r11
            int r15 = r15 + r13
            byte[][] r16 = r6.getSegments$okio()
            r16 = r16[r8]
            r17 = r14
            r18 = r16
            r16 = r15
            r19 = 0
            r4 = r17
            r0 = r18
            r20 = r16
            r16 = r2
            r2 = r20
            boolean r17 = r1.rangeEquals(r10, r0, r2, r4)
            if (r17 != 0) goto L7b
            r17 = 0
            return r17
        L7b:
            int r10 = r10 + r4
            int r9 = r9 + r14
            int r8 = r8 + 1
            r0 = r22
            r2 = r16
            goto L2d
        L87:
            r0 = 1
            return r0
        L8a:
            r16 = r2
        L8c:
            r0 = 0
            return r0
    }

    public static final boolean commonRangeEquals(okio.C1126SegmentedByteString r21, int r22, byte[] r23, int r24, int r25) {
            r0 = r22
            r1 = r23
            r2 = r24
            java.lang.String r3 = "<this>"
            r4 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            java.lang.String r3 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            r3 = 0
            if (r0 < 0) goto L8c
            int r6 = r21.size()
            int r6 = r6 - r25
            if (r0 > r6) goto L8c
            if (r2 < 0) goto L8c
            int r6 = r1.length
            int r6 = r6 - r25
            if (r2 <= r6) goto L25
            goto L8c
        L25:
            int r6 = r0 + r25
            r7 = r21
            r8 = 0
            int r9 = segment(r7, r0)
            r10 = r22
            r11 = r2
        L32:
            if (r10 >= r6) goto L89
            if (r9 != 0) goto L38
            r12 = 0
            goto L40
        L38:
            int[] r12 = r7.getDirectory$okio()
            int r13 = r9 + (-1)
            r12 = r12[r13]
        L40:
            int[] r13 = r7.getDirectory$okio()
            r13 = r13[r9]
            int r13 = r13 - r12
            int[] r14 = r7.getDirectory$okio()
            byte[][] r15 = r7.getSegments$okio()
            java.lang.Object[] r15 = (java.lang.Object[]) r15
            int r15 = r15.length
            int r15 = r15 + r9
            r14 = r14[r15]
            int r15 = r12 + r13
            int r15 = java.lang.Math.min(r6, r15)
            int r15 = r15 - r10
            int r16 = r10 - r12
            int r16 = r14 + r16
            byte[][] r17 = r7.getSegments$okio()
            r17 = r17[r9]
            r18 = r15
            r19 = r17
            r17 = r16
            r20 = 0
            r2 = r17
            r5 = r18
            r0 = r19
            boolean r17 = okio.SegmentedByteString.arrayRangeEquals(r0, r2, r1, r11, r5)
            if (r17 != 0) goto L7d
            r17 = 0
            return r17
        L7d:
            int r11 = r11 + r5
            int r10 = r10 + r15
            int r9 = r9 + 1
            r0 = r22
            r2 = r24
            goto L32
        L89:
            r0 = 1
            return r0
        L8c:
            r0 = 0
            return r0
    }

    public static final okio.ByteString commonSubstring(okio.C1126SegmentedByteString r13, int r14, int r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = 0
            r1 = r13
            okio.ByteString r1 = (okio.ByteString) r1
            int r1 = okio.SegmentedByteString.resolveDefaultParameter(r1, r15)
            r2 = 0
            r3 = 1
            if (r14 < 0) goto L13
            r4 = r3
            goto L14
        L13:
            r4 = r2
        L14:
            if (r4 == 0) goto L100
            int r4 = r13.size()
            if (r1 > r4) goto L1e
            r4 = r3
            goto L1f
        L1e:
            r4 = r2
        L1f:
            java.lang.String r5 = "endIndex="
            if (r4 == 0) goto Ld0
            int r4 = r1 - r14
            if (r4 < 0) goto L28
            goto L29
        L28:
            r3 = r2
        L29:
            if (r3 == 0) goto Laa
        L2c:
            if (r14 != 0) goto L38
            int r3 = r13.size()
            if (r1 != r3) goto L38
            r2 = r13
            okio.ByteString r2 = (okio.ByteString) r2
            return r2
        L38:
            if (r14 != r1) goto L3d
            okio.ByteString r2 = okio.ByteString.EMPTY
            return r2
        L3d:
            int r3 = segment(r13, r14)
            int r5 = r1 + (-1)
            int r5 = segment(r13, r5)
            byte[][] r6 = r13.getSegments$okio()
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            int r7 = r5 + 1
            java.lang.Object[] r6 = kotlin.collections.ArraysKt.copyOfRange(r6, r3, r7)
            byte[][] r6 = (byte[][]) r6
            r7 = r6
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            int r7 = r7.length
            int r7 = r7 * 2
            int[] r7 = new int[r7]
            r8 = 0
            r9 = r3
            if (r9 > r5) goto L8c
        L61:
            int[] r10 = r13.getDirectory$okio()
            r10 = r10[r9]
            int r10 = r10 - r14
            int r10 = java.lang.Math.min(r10, r4)
            r7[r8] = r10
            int r10 = r8 + 1
            r11 = r6
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            int r11 = r11.length
            int r8 = r8 + r11
            int[] r11 = r13.getDirectory$okio()
            byte[][] r12 = r13.getSegments$okio()
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            int r12 = r12.length
            int r12 = r12 + r9
            r11 = r11[r12]
            r7[r8] = r11
            if (r9 == r5) goto L8b
            int r9 = r9 + 1
            r8 = r10
            goto L61
        L8b:
            r8 = r10
        L8c:
            if (r3 != 0) goto L8f
            goto L97
        L8f:
            int[] r2 = r13.getDirectory$okio()
            int r9 = r3 + (-1)
            r2 = r2[r9]
        L97:
            r9 = r6
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            int r9 = r9.length
            r10 = r7[r9]
            int r11 = r14 - r2
            int r10 = r10 + r11
            r7[r9] = r10
            okio.SegmentedByteString r9 = new okio.SegmentedByteString
            r9.<init>(r6, r7)
            okio.ByteString r9 = (okio.ByteString) r9
            return r9
        Laa:
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r5 = " < beginIndex="
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r3 = r3.append(r14)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        Ld0:
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r4 = " > length("
            java.lang.StringBuilder r3 = r3.append(r4)
            int r4 = r13.size()
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = 41
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L100:
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "beginIndex="
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r14)
            java.lang.String r4 = " < 0"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static final byte[] commonToByteArray(okio.C1126SegmentedByteString r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = 0
            int r1 = r15.size()
            byte[] r1 = new byte[r1]
            r2 = 0
            r3 = r15
            r4 = 0
            byte[][] r5 = r3.getSegments$okio()
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            int r5 = r5.length
            r6 = 0
            r7 = 0
        L18:
            if (r6 >= r5) goto L43
            int[] r8 = r3.getDirectory$okio()
            int r9 = r5 + r6
            r8 = r8[r9]
            int[] r9 = r3.getDirectory$okio()
            r9 = r9[r6]
            byte[][] r10 = r3.getSegments$okio()
            r10 = r10[r6]
            int r11 = r9 - r7
            r12 = r8
            r13 = 0
            int r14 = r12 + r11
            kotlin.collections.ArraysKt.copyInto(r10, r1, r2, r12, r14)
            int r2 = r2 + r11
            r7 = r9
            int r6 = r6 + 1
            goto L18
        L43:
            return r1
    }

    public static final void commonWrite(okio.C1126SegmentedByteString r25, okio.Buffer r26, int r27, int r28) {
            r0 = r26
            r1 = r27
            r2 = r28
            java.lang.String r3 = "<this>"
            r4 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            java.lang.String r3 = "buffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            r3 = 0
            int r5 = r1 + r2
            r6 = r25
            r7 = 0
            int r8 = segment(r6, r1)
            r9 = r27
        L1e:
            if (r9 >= r5) goto L94
            if (r8 != 0) goto L24
            r10 = 0
            goto L2c
        L24:
            int[] r10 = r6.getDirectory$okio()
            int r11 = r8 + (-1)
            r10 = r10[r11]
        L2c:
            int[] r11 = r6.getDirectory$okio()
            r11 = r11[r8]
            int r11 = r11 - r10
            int[] r12 = r6.getDirectory$okio()
            byte[][] r13 = r6.getSegments$okio()
            java.lang.Object[] r13 = (java.lang.Object[]) r13
            int r13 = r13.length
            int r13 = r13 + r8
            r12 = r12[r13]
            int r13 = r10 + r11
            int r13 = java.lang.Math.min(r5, r13)
            int r13 = r13 - r9
            int r14 = r9 - r10
            int r14 = r14 + r12
            byte[][] r15 = r6.getSegments$okio()
            r17 = r15[r8]
            r15 = r13
            r22 = r14
            r23 = 0
            okio.Segment r24 = new okio.Segment
            int r19 = r22 + r15
            r20 = 1
            r21 = 0
            r16 = r24
            r18 = r22
            r16.<init>(r17, r18, r19, r20, r21)
            okio.Segment r1 = r0.head
            if (r1 != 0) goto L78
            r1 = r16
            r1.prev = r1
            r16 = r3
            okio.Segment r3 = r1.prev
            r1.next = r3
            okio.Segment r3 = r1.next
            r0.head = r3
            goto L89
        L78:
            r1 = r16
            r16 = r3
            okio.Segment r3 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.Segment r3 = r3.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r3.push(r1)
        L89:
            int r9 = r9 + r13
            int r8 = r8 + 1
            r1 = r27
            r3 = r16
            goto L1e
        L94:
            long r5 = r26.size()
            long r7 = (long) r2
            long r5 = r5 + r7
            r0.setSize$okio(r5)
            return
    }

    private static final void forEachSegment(okio.C1126SegmentedByteString r11, int r12, int r13, kotlin.jvm.functions.Function3<? super byte[], ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r14) {
            r0 = 0
            int r1 = segment(r11, r12)
            r2 = r12
        L6:
            if (r2 >= r13) goto L49
            if (r1 != 0) goto Lc
            r3 = 0
            goto L14
        Lc:
            int[] r3 = r11.getDirectory$okio()
            int r4 = r1 + (-1)
            r3 = r3[r4]
        L14:
            int[] r4 = r11.getDirectory$okio()
            r4 = r4[r1]
            int r4 = r4 - r3
            int[] r5 = r11.getDirectory$okio()
            byte[][] r6 = r11.getSegments$okio()
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            int r6 = r6.length
            int r6 = r6 + r1
            r5 = r5[r6]
            int r6 = r3 + r4
            int r6 = java.lang.Math.min(r13, r6)
            int r6 = r6 - r2
            int r7 = r2 - r3
            int r7 = r7 + r5
            byte[][] r8 = r11.getSegments$okio()
            r8 = r8[r1]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r14.invoke(r8, r9, r10)
            int r2 = r2 + r6
            int r1 = r1 + 1
            goto L6
        L49:
            return
    }

    public static final void forEachSegment(okio.C1126SegmentedByteString r9, kotlin.jvm.functions.Function3<? super byte[], ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            byte[][] r1 = r9.getSegments$okio()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r1 = r1.length
            r2 = 0
            r3 = 0
        L14:
            if (r2 >= r1) goto L3c
            int[] r4 = r9.getDirectory$okio()
            int r5 = r1 + r2
            r4 = r4[r5]
            int[] r5 = r9.getDirectory$okio()
            r5 = r5[r2]
            byte[][] r6 = r9.getSegments$okio()
            r6 = r6[r2]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            int r8 = r5 - r3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10.invoke(r6, r7, r8)
            r3 = r5
            int r2 = r2 + 1
            goto L14
        L3c:
            return
    }

    public static final int segment(okio.C1126SegmentedByteString r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int[] r0 = r4.getDirectory$okio()
            int r1 = r5 + 1
            byte[][] r2 = r4.getSegments$okio()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r2 = r2.length
            r3 = 0
            int r0 = binarySearch(r0, r1, r3, r2)
            if (r0 < 0) goto L1b
            r1 = r0
            goto L1c
        L1b:
            int r1 = ~r0
        L1c:
            return r1
    }
}

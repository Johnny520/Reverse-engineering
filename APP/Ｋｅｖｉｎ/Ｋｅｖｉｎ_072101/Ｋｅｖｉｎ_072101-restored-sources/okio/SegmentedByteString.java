package okio;

/* JADX INFO: renamed from: okio.-SegmentedByteString, reason: invalid class name */
/* JADX INFO: compiled from: Util.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000N\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a0\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0000\u001a \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0015H\u0000\u001a\u0019\u0010\u0017\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0015H\u0080\b\u001a\u0019\u0010\u0017\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0001H\u0080\b\u001a\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0000\u001a\u0015\u0010\u001a\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0001H\u0080\f\u001a\u0015\u0010\u001a\u001a\u00020\u0015*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0080\f\u001a\u0015\u0010\u001a\u001a\u00020\u0015*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0015H\u0080\f\u001a\u0015\u0010\u001d\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0080\f\u001a\u0014\u0010\u0018\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0018\u001a\u00020\u0001*\u00020 2\u0006\u0010!\u001a\u00020\u0001H\u0000\u001a\f\u0010\"\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\f\u0010\"\u001a\u00020\u0015*\u00020\u0015H\u0000\u001a\f\u0010\"\u001a\u00020#*\u00020#H\u0000\u001a\u0015\u0010$\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0001H\u0080\f\u001a\u0015\u0010%\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0001H\u0080\f\u001a\u0015\u0010&\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0001H\u0080\f\u001a\f\u0010'\u001a\u00020(*\u00020\u001bH\u0000\u001a\f\u0010'\u001a\u00020(*\u00020\u0001H\u0000\u001a\f\u0010'\u001a\u00020(*\u00020\u0015H\u0000\u001a\u0015\u0010)\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0080\f\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0004\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006*"}, m115d2 = {"DEFAULT__ByteString_size", "", "getDEFAULT__ByteString_size", "()I", "DEFAULT__new_UnsafeCursor", "Lokio/Buffer$UnsafeCursor;", "getDEFAULT__new_UnsafeCursor$annotations", "()V", "getDEFAULT__new_UnsafeCursor", "()Lokio/Buffer$UnsafeCursor;", "arrayRangeEquals", "", "a", "", "aOffset", "b", "bOffset", "byteCount", "checkOffsetAndCount", "", "size", "", "offset", "minOf", "resolveDefaultParameter", "unsafeCursor", "and", "", "other", "leftRotate", "bitCount", "sizeParam", "Lokio/ByteString;", "position", "reverseBytes", "", "rightRotate", "shl", "shr", "toHexString", "", "xor", "okio"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class SegmentedByteString {
    private static final int DEFAULT__ByteString_size = 0;
    private static final okio.Buffer.UnsafeCursor DEFAULT__new_UnsafeCursor = null;

    static {
            okio.Buffer$UnsafeCursor r0 = new okio.Buffer$UnsafeCursor
            r0.<init>()
            okio.SegmentedByteString.DEFAULT__new_UnsafeCursor = r0
            r0 = -1234567890(0xffffffffb669fd2e, float:-3.4867076E-6)
            okio.SegmentedByteString.DEFAULT__ByteString_size = r0
            return
    }

    public static final int and(byte r2, int r3) {
            r0 = 0
            r1 = r2 & r3
            return r1
    }

    public static final long and(byte r3, long r4) {
            r0 = 0
            long r1 = (long) r3
            long r1 = r1 & r4
            return r1
    }

    public static final long and(int r3, long r4) {
            r0 = 0
            long r1 = (long) r3
            long r1 = r1 & r4
            return r1
    }

    public static final boolean arrayRangeEquals(byte[] r3, int r4, byte[] r5, int r6, int r7) {
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
        Lb:
            if (r0 >= r7) goto L1c
            int r1 = r0 + r4
            r1 = r3[r1]
            int r2 = r0 + r6
            r2 = r5[r2]
            if (r1 == r2) goto L19
            r1 = 0
            return r1
        L19:
            int r0 = r0 + 1
            goto Lb
        L1c:
            r0 = 1
            return r0
    }

    public static final void checkOffsetAndCount(long r4, long r6, long r8) {
            long r0 = r6 | r8
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L13
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L13
            long r0 = r4 - r6
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 < 0) goto L13
            return
        L13:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "size="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " offset="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = " byteCount="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final int getDEFAULT__ByteString_size() {
            int r0 = okio.SegmentedByteString.DEFAULT__ByteString_size
            return r0
    }

    public static final okio.Buffer.UnsafeCursor getDEFAULT__new_UnsafeCursor() {
            okio.Buffer$UnsafeCursor r0 = okio.SegmentedByteString.DEFAULT__new_UnsafeCursor
            return r0
    }

    public static /* synthetic */ void getDEFAULT__new_UnsafeCursor$annotations() {
            return
    }

    public static final int leftRotate(int r3, int r4) {
            r0 = 0
            int r1 = r3 << r4
            int r2 = 32 - r4
            int r2 = r3 >>> r2
            r1 = r1 | r2
            return r1
    }

    public static final long minOf(int r3, long r4) {
            r0 = 0
            long r1 = (long) r3
            long r1 = java.lang.Math.min(r1, r4)
            return r1
    }

    public static final long minOf(long r3, int r5) {
            r0 = 0
            long r1 = (long) r5
            long r1 = java.lang.Math.min(r3, r1)
            return r1
    }

    public static final int resolveDefaultParameter(okio.ByteString r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = okio.SegmentedByteString.DEFAULT__ByteString_size
            if (r2 != r0) goto Le
            int r0 = r1.size()
            return r0
        Le:
            return r2
    }

    public static final int resolveDefaultParameter(byte[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = okio.SegmentedByteString.DEFAULT__ByteString_size
            if (r2 != r0) goto Lb
            int r0 = r1.length
            return r0
        Lb:
            return r2
    }

    public static final okio.Buffer.UnsafeCursor resolveDefaultParameter(okio.Buffer.UnsafeCursor r1) {
            java.lang.String r0 = "unsafeCursor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okio.Buffer$UnsafeCursor r0 = okio.SegmentedByteString.DEFAULT__new_UnsafeCursor
            if (r1 != r0) goto Lf
            okio.Buffer$UnsafeCursor r0 = new okio.Buffer$UnsafeCursor
            r0.<init>()
            return r0
        Lf:
            return r1
    }

    public static final int reverseBytes(int r2) {
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r2
            int r0 = r0 >>> 24
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = r1 & r2
            int r1 = r1 >>> 8
            r0 = r0 | r1
            r1 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            int r1 = r1 << 8
            r0 = r0 | r1
            r1 = r2 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 24
            r0 = r0 | r1
            return r0
    }

    public static final long reverseBytes(long r8) {
            r0 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r0 = r0 & r8
            r2 = 56
            long r0 = r0 >>> r2
            r3 = 71776119061217280(0xff000000000000, double:7.06327445644526E-304)
            long r3 = r3 & r8
            r5 = 40
            long r3 = r3 >>> r5
            long r0 = r0 | r3
            r3 = 280375465082880(0xff0000000000, double:1.38523885234213E-309)
            long r3 = r3 & r8
            r6 = 24
            long r3 = r3 >>> r6
            long r0 = r0 | r3
            r3 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r3 = r3 & r8
            r7 = 8
            long r3 = r3 >>> r7
            long r0 = r0 | r3
            r3 = 4278190080(0xff000000, double:2.113706745E-314)
            long r3 = r3 & r8
            long r3 = r3 << r7
            long r0 = r0 | r3
            r3 = 16711680(0xff0000, double:8.256667E-317)
            long r3 = r3 & r8
            long r3 = r3 << r6
            long r0 = r0 | r3
            r3 = 65280(0xff00, double:3.22526E-319)
            long r3 = r3 & r8
            long r3 = r3 << r5
            long r0 = r0 | r3
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r8
            long r2 = r3 << r2
            long r0 = r0 | r2
            return r0
    }

    public static final short reverseBytes(short r3) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r3
            r1 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r0
            int r1 = r1 >>> 8
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            short r2 = (short) r1
            return r2
    }

    public static final long rightRotate(long r5, int r7) {
            r0 = 0
            long r1 = r5 >>> r7
            int r3 = 64 - r7
            long r3 = r5 << r3
            long r1 = r1 | r3
            return r1
    }

    public static final int shl(byte r2, int r3) {
            r0 = 0
            int r1 = r2 << r3
            return r1
    }

    public static final int shr(byte r2, int r3) {
            r0 = 0
            int r1 = r2 >> r3
            return r1
    }

    public static final java.lang.String toHexString(byte r5) {
            r0 = 2
            char[] r0 = new char[r0]
            char[] r1 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r2 = 4
            r3 = r5
            r4 = 0
            int r2 = r3 >> r2
            r2 = r2 & 15
            char r1 = r1[r2]
            r2 = 0
            r0[r2] = r1
            char[] r1 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r2 = 15
            r4 = 0
            r2 = r2 & r3
            char r1 = r1[r2]
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = kotlin.text.StringsKt.concatToString(r0)
            return r1
    }

    public static final java.lang.String toHexString(int r4) {
            if (r4 != 0) goto L5
            java.lang.String r0 = "0"
            return r0
        L5:
            r0 = 8
            char[] r0 = new char[r0]
            char[] r1 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r2 = r4 >> 28
            r2 = r2 & 15
            char r1 = r1[r2]
            r2 = 0
            r0[r2] = r1
            char[] r1 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r2 = r4 >> 24
            r2 = r2 & 15
            char r1 = r1[r2]
            r2 = 1
            r0[r2] = r1
            char[] r1 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r2 = r4 >> 20
            r2 = r2 & 15
            char r1 = r1[r2]
            r2 = 2
            r0[r2] = r1
            char[] r1 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r2 = r4 >> 16
            r2 = r2 & 15
            char r1 = r1[r2]
            r2 = 3
            r0[r2] = r1
            char[] r1 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r2 = r4 >> 12
            r2 = r2 & 15
            char r1 = r1[r2]
            r2 = 4
            r0[r2] = r1
            char[] r1 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r2 = r4 >> 8
            r2 = r2 & 15
            char r1 = r1[r2]
            r2 = 5
            r0[r2] = r1
            char[] r1 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r2 = r4 >> 4
            r2 = r2 & 15
            char r1 = r1[r2]
            r2 = 6
            r0[r2] = r1
            char[] r1 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r2 = r4 & 15
            char r1 = r1[r2]
            r2 = 7
            r0[r2] = r1
            r1 = 0
        L70:
            int r2 = r0.length
            if (r1 >= r2) goto L7c
            char r2 = r0[r1]
            r3 = 48
            if (r2 != r3) goto L7c
            int r1 = r1 + 1
            goto L70
        L7c:
            int r2 = r0.length
            java.lang.String r2 = kotlin.text.StringsKt.concatToString(r0, r1, r2)
            return r2
    }

    public static final java.lang.String toHexString(long r10) {
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 != 0) goto L9
            java.lang.String r0 = "0"
            return r0
        L9:
            r0 = 16
            char[] r1 = new char[r0]
            char[] r2 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r3 = 60
            long r3 = r10 >> r3
            r5 = 15
            long r3 = r3 & r5
            int r3 = (int) r3
            char r2 = r2[r3]
            r3 = 0
            r1[r3] = r2
            char[] r2 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r3 = 56
            long r3 = r10 >> r3
            long r3 = r3 & r5
            int r3 = (int) r3
            char r2 = r2[r3]
            r3 = 1
            r1[r3] = r2
            char[] r2 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r3 = 52
            long r3 = r10 >> r3
            long r3 = r3 & r5
            int r3 = (int) r3
            char r2 = r2[r3]
            r3 = 2
            r1[r3] = r2
            char[] r2 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r3 = 48
            long r7 = r10 >> r3
            long r7 = r7 & r5
            int r4 = (int) r7
            char r2 = r2[r4]
            r4 = 3
            r1[r4] = r2
            char[] r2 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r4 = 44
            long r7 = r10 >> r4
            long r7 = r7 & r5
            int r4 = (int) r7
            char r2 = r2[r4]
            r4 = 4
            r1[r4] = r2
            char[] r2 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r7 = 40
            long r7 = r10 >> r7
            long r7 = r7 & r5
            int r7 = (int) r7
            char r2 = r2[r7]
            r7 = 5
            r1[r7] = r2
            char[] r2 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r7 = 36
            long r7 = r10 >> r7
            long r7 = r7 & r5
            int r7 = (int) r7
            char r2 = r2[r7]
            r7 = 6
            r1[r7] = r2
            char[] r2 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r7 = 32
            long r7 = r10 >> r7
            long r7 = r7 & r5
            int r7 = (int) r7
            char r2 = r2[r7]
            r7 = 7
            r1[r7] = r2
            char[] r2 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r7 = 28
            long r7 = r10 >> r7
            long r7 = r7 & r5
            int r7 = (int) r7
            char r2 = r2[r7]
            r7 = 8
            r1[r7] = r2
            char[] r2 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r8 = 24
            long r8 = r10 >> r8
            long r8 = r8 & r5
            int r8 = (int) r8
            char r2 = r2[r8]
            r8 = 9
            r1[r8] = r2
            char[] r2 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r8 = 20
            long r8 = r10 >> r8
            long r8 = r8 & r5
            int r8 = (int) r8
            char r2 = r2[r8]
            r8 = 10
            r1[r8] = r2
            char[] r2 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            long r8 = r10 >> r0
            long r8 = r8 & r5
            int r0 = (int) r8
            char r0 = r2[r0]
            r2 = 11
            r1[r2] = r0
            char[] r0 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r2 = 12
            long r8 = r10 >> r2
            long r8 = r8 & r5
            int r8 = (int) r8
            char r0 = r0[r8]
            r1[r2] = r0
            char[] r0 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            long r7 = r10 >> r7
            long r7 = r7 & r5
            int r2 = (int) r7
            char r0 = r0[r2]
            r2 = 13
            r1[r2] = r0
            char[] r0 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            long r7 = r10 >> r4
            long r7 = r7 & r5
            int r2 = (int) r7
            char r0 = r0[r2]
            r2 = 14
            r1[r2] = r0
            char[] r0 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            long r4 = r10 & r5
            int r2 = (int) r4
            char r0 = r0[r2]
            r2 = 15
            r1[r2] = r0
            r0 = 0
        Lfd:
            int r2 = r1.length
            if (r0 >= r2) goto L107
            char r2 = r1[r0]
            if (r2 != r3) goto L107
            int r0 = r0 + 1
            goto Lfd
        L107:
            int r2 = r1.length
            java.lang.String r2 = kotlin.text.StringsKt.concatToString(r1, r0, r2)
            return r2
    }

    public static final byte xor(byte r2, byte r3) {
            r0 = 0
            r1 = r2 ^ r3
            byte r1 = (byte) r1
            return r1
    }
}

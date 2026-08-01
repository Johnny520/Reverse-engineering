package okio.internal;

/* JADX INFO: renamed from: okio.internal.-Buffer, reason: invalid class name */
/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0000\u001a\r\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0080\b\u001a\r\u0010\u0016\u001a\u00020\u0014*\u00020\u0017H\u0080\b\u001a\r\u0010\u0018\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010\u0019\u001a\u00020\u0015*\u00020\u0015H\u0080\b\u001a%\u0010\u001a\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0017\u0010\u001e\u001a\u00020\f*\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0080\b\u001a\u0015\u0010!\u001a\u00020\u0007*\u00020\u00172\u0006\u0010\"\u001a\u00020\nH\u0080\b\u001a\u0015\u0010#\u001a\u00020$*\u00020\u00152\u0006\u0010%\u001a\u00020\u0007H\u0080\b\u001a\r\u0010&\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a%\u0010'\u001a\u00020\u0007*\u00020\u00152\u0006\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010'\u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0010\u001a\u00020+2\u0006\u0010)\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010,\u001a\u00020\u0007*\u00020\u00152\u0006\u0010-\u001a\u00020+2\u0006\u0010)\u001a\u00020\u0007H\u0080\b\u001a\r\u0010.\u001a\u00020\n*\u00020\u0017H\u0080\b\u001a-\u0010/\u001a\u00020\f*\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020+2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u0015\u00100\u001a\u00020\n*\u00020\u00152\u0006\u00101\u001a\u00020\u0001H\u0080\b\u001a%\u00100\u001a\u00020\n*\u00020\u00152\u0006\u00101\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u00100\u001a\u00020\u0007*\u00020\u00152\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0015\u00102\u001a\u00020\u0007*\u00020\u00152\u0006\u00101\u001a\u000203H\u0080\b\u001a\u0014\u00104\u001a\u00020\u0017*\u00020\u00152\u0006\u00105\u001a\u00020\u0017H\u0000\u001a\r\u00106\u001a\u00020$*\u00020\u0015H\u0080\b\u001a\r\u00107\u001a\u00020\u0001*\u00020\u0015H\u0080\b\u001a\u0015\u00107\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u00108\u001a\u00020+*\u00020\u0015H\u0080\b\u001a\u0015\u00108\u001a\u00020+*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u00109\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\u0015\u0010:\u001a\u00020\u0014*\u00020\u00152\u0006\u00101\u001a\u00020\u0001H\u0080\b\u001a\u001d\u0010:\u001a\u00020\u0014*\u00020\u00152\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010;\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010<\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a\r\u0010=\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010>\u001a\u00020?*\u00020\u0015H\u0080\b\u001a\u0014\u0010@\u001a\u00020\u0017*\u00020\u00152\u0006\u00105\u001a\u00020\u0017H\u0000\u001a\u0015\u0010A\u001a\u00020B*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010C\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a\u000f\u0010D\u001a\u0004\u0018\u00010B*\u00020\u0015H\u0080\b\u001a\u0015\u0010E\u001a\u00020B*\u00020\u00152\u0006\u0010F\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010G\u001a\u00020\u0007*\u00020\u00172\u0006\u0010H\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010I\u001a\u00020\n*\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010J\u001a\u00020\n*\u00020\u00152\u0006\u0010K\u001a\u00020LH\u0080\b\u001a\u0015\u0010M\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010N\u001a\u00020+*\u00020\u0015H\u0080\b\u001a\u0015\u0010N\u001a\u00020+*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u0015\u0010O\u001a\u00020\u000e*\u00020\u00152\u0006\u0010P\u001a\u00020\nH\u0080\b\u001a\u0015\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020\u0001H\u0080\b\u001a%\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u0010Q\u001a\u00020\u0014*\u00020\u00152\u0006\u0010R\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a)\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010S\u001a\u00020+2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020T2\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010U\u001a\u00020\u0007*\u00020\u00152\u0006\u0010R\u001a\u00020TH\u0080\b\u001a\u0015\u0010V\u001a\u00020\u0015*\u00020\u00152\u0006\u0010(\u001a\u00020\nH\u0080\b\u001a\u0015\u0010W\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010Y\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010Z\u001a\u00020\u0015*\u00020\u00152\u0006\u0010[\u001a\u00020\nH\u0080\b\u001a\u0015\u0010\\\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010]\u001a\u00020\u0015*\u00020\u00152\u0006\u0010^\u001a\u00020\nH\u0080\b\u001a%\u0010_\u001a\u00020\u0015*\u00020\u00152\u0006\u0010`\u001a\u00020B2\u0006\u0010a\u001a\u00020\n2\u0006\u0010b\u001a\u00020\nH\u0080\b\u001a\u0015\u0010c\u001a\u00020\u0015*\u00020\u00152\u0006\u0010d\u001a\u00020\nH\u0080\b\u001a\u0014\u0010e\u001a\u00020B*\u00020\u00152\u0006\u0010f\u001a\u00020\u0007H\u0000\u001a?\u0010g\u001a\u0002Hh\"\u0004\b\u0000\u0010h*\u00020\u00152\u0006\u0010)\u001a\u00020\u00072\u001a\u0010i\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002Hh0jH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010k\u001a\u001e\u0010l\u001a\u00020\n*\u00020\u00152\u0006\u0010K\u001a\u00020L2\b\b\u0002\u0010m\u001a\u00020\fH\u0000\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006n"}, m115d2 = {"HEX_DIGIT_BYTES", "", "getHEX_DIGIT_BYTES$annotations", "()V", "getHEX_DIGIT_BYTES", "()[B", "OVERFLOW_DIGIT_START", "", "OVERFLOW_ZONE", "SEGMENTING_THRESHOLD", "", "rangeEquals", "", "segment", "Lokio/Segment;", "segmentPos", "bytes", "bytesOffset", "bytesLimit", "commonClear", "", "Lokio/Buffer;", "commonClose", "Lokio/Buffer$UnsafeCursor;", "commonCompleteSegmentByteCount", "commonCopy", "commonCopyTo", "out", "offset", "byteCount", "commonEquals", "other", "", "commonExpandBuffer", "minByteCount", "commonGet", "", "pos", "commonHashCode", "commonIndexOf", "b", "fromIndex", "toIndex", "Lokio/ByteString;", "commonIndexOfElement", "targetBytes", "commonNext", "commonRangeEquals", "commonRead", "sink", "commonReadAll", "Lokio/Sink;", "commonReadAndWriteUnsafe", "unsafeCursor", "commonReadByte", "commonReadByteArray", "commonReadByteString", "commonReadDecimalLong", "commonReadFully", "commonReadHexadecimalUnsignedLong", "commonReadInt", "commonReadLong", "commonReadShort", "", "commonReadUnsafe", "commonReadUtf8", "", "commonReadUtf8CodePoint", "commonReadUtf8Line", "commonReadUtf8LineStrict", "limit", "commonResizeBuffer", "newSize", "commonSeek", "commonSelect", "options", "Lokio/Options;", "commonSkip", "commonSnapshot", "commonWritableSegment", "minimumCapacity", "commonWrite", "source", "byteString", "Lokio/Source;", "commonWriteAll", "commonWriteByte", "commonWriteDecimalLong", "v", "commonWriteHexadecimalUnsignedLong", "commonWriteInt", "i", "commonWriteLong", "commonWriteShort", "s", "commonWriteUtf8", "string", "beginIndex", "endIndex", "commonWriteUtf8CodePoint", "codePoint", "readUtf8Line", "newline", "seek", "T", "lambda", "Lkotlin/Function2;", "(Lokio/Buffer;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "selectPrefix", "selectTruncated", "okio"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
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

    public static final void commonClear(okio.Buffer r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            long r1 = r3.size()
            r3.skip(r1)
            return
    }

    public static final void commonClose(okio.Buffer.UnsafeCursor r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            okio.Buffer r1 = r4.buffer
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L21
            r1 = 0
            r4.buffer = r1
            r4.setSegment$okio(r1)
            r2 = -1
            r4.offset = r2
            r4.data = r1
            r1 = -1
            r4.start = r1
            r4.end = r1
            return
        L21:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "not attached to a buffer"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final long commonCompleteSegmentByteCount(okio.Buffer r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            long r1 = r6.size()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L11
            return r3
        L11:
            okio.Segment r3 = r6.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.Segment r3 = r3.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r4 = r3.limit
            r5 = 8192(0x2000, float:1.148E-41)
            if (r4 >= r5) goto L2c
            boolean r4 = r3.owner
            if (r4 == 0) goto L2c
            int r4 = r3.limit
            int r5 = r3.pos
            int r4 = r4 - r5
            long r4 = (long) r4
            long r1 = r1 - r4
        L2c:
            return r1
    }

    public static final okio.Buffer commonCopy(okio.Buffer r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            long r2 = r7.size()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L16
            return r1
        L16:
            okio.Segment r2 = r7.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            okio.Segment r3 = r2.sharedCopy()
            r1.head = r3
            okio.Segment r4 = r1.head
            r3.prev = r4
            okio.Segment r4 = r3.prev
            r3.next = r4
            okio.Segment r4 = r2.next
        L2b:
            if (r4 == r2) goto L3f
            okio.Segment r5 = r3.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            okio.Segment r6 = r4.sharedCopy()
            r5.push(r6)
            okio.Segment r4 = r4.next
            goto L2b
        L3f:
            long r5 = r7.size()
            r1.setSize$okio(r5)
            return r1
    }

    public static final okio.Buffer commonCopyTo(okio.Buffer r13, okio.Buffer r14, long r15, long r17) {
            r0 = r13
            r1 = r14
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
            java.lang.String r2 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r2)
            r2 = 0
            r5 = r15
            r9 = r17
            long r3 = r13.size()
            r7 = r9
            okio.SegmentedByteString.checkOffsetAndCount(r3, r5, r7)
            r3 = 0
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 != 0) goto L1f
            return r0
        L1f:
            long r7 = r14.size()
            long r7 = r7 + r9
            r14.setSize$okio(r7)
            okio.Segment r7 = r0.head
        L29:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            int r8 = r7.limit
            int r11 = r7.pos
            int r8 = r8 - r11
            long r11 = (long) r8
            int r8 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r8 < 0) goto L40
            int r8 = r7.limit
            int r11 = r7.pos
            int r8 = r8 - r11
            long r11 = (long) r8
            long r5 = r5 - r11
            okio.Segment r7 = r7.next
            goto L29
        L40:
            int r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r8 <= 0) goto L85
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            okio.Segment r8 = r7.sharedCopy()
            int r11 = r8.pos
            int r12 = (int) r5
            int r11 = r11 + r12
            r8.pos = r11
            int r11 = r8.pos
            int r12 = (int) r9
            int r11 = r11 + r12
            int r12 = r8.limit
            int r11 = java.lang.Math.min(r11, r12)
            r8.limit = r11
            okio.Segment r11 = r1.head
            if (r11 != 0) goto L6c
            r8.prev = r8
            okio.Segment r11 = r8.prev
            r8.next = r11
            okio.Segment r11 = r8.next
            r1.head = r11
            goto L79
        L6c:
            okio.Segment r11 = r1.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            okio.Segment r11 = r11.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            r11.push(r8)
        L79:
            int r11 = r8.limit
            int r12 = r8.pos
            int r11 = r11 - r12
            long r11 = (long) r11
            long r9 = r9 - r11
            r5 = 0
            okio.Segment r7 = r7.next
            goto L40
        L85:
            return r0
    }

    public static final boolean commonEquals(okio.Buffer r18, java.lang.Object r19) {
            r0 = r18
            r1 = r19
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Le
            return r3
        Le:
            boolean r4 = r1 instanceof okio.Buffer
            r5 = 0
            if (r4 != 0) goto L14
            return r5
        L14:
            long r6 = r18.size()
            r4 = r1
            okio.Buffer r4 = (okio.Buffer) r4
            long r8 = r4.size()
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L24
            return r5
        L24:
            long r6 = r18.size()
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L2f
            return r3
        L2f:
            okio.Segment r4 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r6 = r1
            okio.Buffer r6 = (okio.Buffer) r6
            okio.Segment r6 = r6.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            int r7 = r4.pos
            int r8 = r6.pos
            r9 = 0
            r11 = 0
        L44:
            long r13 = r18.size()
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r13 >= 0) goto L8e
            int r13 = r4.limit
            int r13 = r13 - r7
            int r14 = r6.limit
            int r14 = r14 - r8
            int r13 = java.lang.Math.min(r13, r14)
            long r11 = (long) r13
            r13 = 0
        L59:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L74
            byte[] r15 = r4.data
            int r16 = r7 + 1
            r7 = r15[r7]
            byte[] r15 = r6.data
            int r17 = r8 + 1
            r8 = r15[r8]
            if (r7 == r8) goto L6c
            return r5
        L6c:
            r7 = 1
            long r13 = r13 + r7
            r7 = r16
            r8 = r17
            goto L59
        L74:
            int r13 = r4.limit
            if (r7 != r13) goto L80
            okio.Segment r13 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13)
            r4 = r13
            int r7 = r4.pos
        L80:
            int r13 = r6.limit
            if (r8 != r13) goto L8c
            okio.Segment r13 = r6.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13)
            r6 = r13
            int r8 = r6.pos
        L8c:
            long r9 = r9 + r11
            goto L44
        L8e:
            return r3
    }

    public static final long commonExpandBuffer(okio.Buffer.UnsafeCursor r9, int r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            r1 = 1
            r2 = 0
            if (r10 <= 0) goto Lc
            r3 = r1
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r3 == 0) goto L7d
            r3 = 8192(0x2000, float:1.148E-41)
            if (r10 > r3) goto L14
            goto L15
        L14:
            r1 = r2
        L15:
            if (r1 == 0) goto L5f
            okio.Buffer r1 = r9.buffer
            if (r1 == 0) goto L51
            boolean r2 = r9.readWrite
            if (r2 == 0) goto L43
            long r4 = r1.size()
            okio.Segment r2 = r1.writableSegment$okio(r10)
            int r6 = r2.limit
            int r6 = 8192 - r6
            r2.limit = r3
            long r7 = (long) r6
            long r7 = r7 + r4
            r1.setSize$okio(r7)
            r9.setSegment$okio(r2)
            r9.offset = r4
            byte[] r7 = r2.data
            r9.data = r7
            int r7 = 8192 - r6
            r9.start = r7
            r9.end = r3
            long r7 = (long) r6
            return r7
        L43:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "expandBuffer() only permitted for read/write buffers"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L51:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "not attached to a buffer"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L5f:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "minByteCount > Segment.SIZE: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r10)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L7d:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "minByteCount <= 0: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r10)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static final byte commonGet(okio.Buffer r13, long r14) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = 0
            long r1 = r13.size()
            r5 = 1
            r3 = r14
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            r1 = r13
            r2 = 0
            okio.Segment r3 = r1.head
            if (r3 != 0) goto L28
            r3 = 0
            r4 = -1
            r6 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            byte[] r7 = r3.data
            int r8 = r3.pos
            long r8 = (long) r8
            long r8 = r8 + r14
            long r8 = r8 - r4
            int r8 = (int) r8
            r7 = r7[r8]
            return r7
        L28:
            long r4 = r1.size()
            long r4 = r4 - r14
            int r4 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r4 >= 0) goto L59
            long r4 = r1.size()
        L36:
            int r6 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r6 <= 0) goto L48
            okio.Segment r6 = r3.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r3 = r6
            int r6 = r3.limit
            int r7 = r3.pos
            int r6 = r6 - r7
            long r6 = (long) r6
            long r4 = r4 - r6
            goto L36
        L48:
            r6 = r3
            r7 = r4
            r9 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            byte[] r10 = r6.data
            int r11 = r6.pos
            long r11 = (long) r11
            long r11 = r11 + r14
            long r11 = r11 - r7
            int r11 = (int) r11
            r10 = r10[r11]
            return r10
        L59:
            r4 = 0
        L5b:
            int r6 = r3.limit
            int r7 = r3.pos
            int r6 = r6 - r7
            long r6 = (long) r6
            long r6 = r6 + r4
            int r8 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r8 > 0) goto L6f
            okio.Segment r8 = r3.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            r3 = r8
            r4 = r6
            goto L5b
        L6f:
            r6 = r3
            r7 = r4
            r9 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            byte[] r10 = r6.data
            int r11 = r6.pos
            long r11 = (long) r11
            long r11 = r11 + r14
            long r11 = r11 - r7
            int r11 = (int) r11
            r10 = r10[r11]
            return r10
    }

    public static final int commonHashCode(okio.Buffer r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            okio.Segment r1 = r7.head
            if (r1 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            r2 = 1
        Ld:
            int r3 = r1.pos
            int r4 = r1.limit
        L11:
            if (r3 >= r4) goto L1e
            int r5 = r2 * 31
            byte[] r6 = r1.data
            r6 = r6[r3]
            int r2 = r5 + r6
            int r3 = r3 + 1
            goto L11
        L1e:
            okio.Segment r5 = r1.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r1 = r5
            okio.Segment r3 = r7.head
            if (r1 != r3) goto Ld
            return r2
    }

    public static final long commonIndexOf(okio.Buffer r33, byte r34, long r35, long r37) {
            r0 = r34
            r1 = r35
            r3 = r37
            java.lang.String r5 = "<this>"
            r6 = r33
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            r5 = 0
            r7 = 0
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r8 = 0
            if (r7 > 0) goto L1c
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 > 0) goto L1c
            r8 = 1
        L1c:
            if (r8 == 0) goto L14f
            long r7 = r33.size()
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 <= 0) goto L2b
            long r7 = r33.size()
            goto L2c
        L2b:
            r7 = r3
        L2c:
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            r10 = -1
            if (r9 != 0) goto L33
            return r10
        L33:
            r12 = r35
            r9 = r33
            r14 = 0
            okio.Segment r15 = r9.head
            if (r15 != 0) goto L42
            r15 = 0
            r16 = -1
            r18 = 0
            return r10
        L42:
            long r16 = r9.size()
            long r16 = r16 - r12
            int r16 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r16 >= 0) goto Ld2
            long r16 = r9.size()
        L51:
            int r18 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r18 <= 0) goto L66
            okio.Segment r10 = r15.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            r15 = r10
            int r10 = r15.limit
            int r11 = r15.pos
            int r10 = r10 - r11
            long r10 = (long) r10
            long r16 = r16 - r10
            r10 = -1
            goto L51
        L66:
            r10 = r15
            r20 = r16
            r11 = 0
            if (r10 != 0) goto L6f
            r18 = -1
            return r18
        L6f:
            r22 = r10
            r23 = r20
            r26 = r1
            r25 = r5
            r5 = r22
        L79:
            int r22 = (r23 > r7 ? 1 : (r23 == r7 ? 0 : -1))
            if (r22 >= 0) goto Lcd
            byte[] r6 = r5.data
            r22 = r9
            int r9 = r5.limit
            r28 = r10
            long r9 = (long) r9
            r29 = r11
            int r11 = r5.pos
            r30 = r14
            r31 = r15
            long r14 = (long) r11
            long r14 = r14 + r7
            long r14 = r14 - r23
            long r9 = java.lang.Math.min(r9, r14)
            int r9 = (int) r9
            int r10 = r5.pos
            long r10 = (long) r10
            long r10 = r10 + r26
            long r10 = r10 - r23
            int r10 = (int) r10
        L9f:
            if (r10 >= r9) goto Lb0
            r11 = r6[r10]
            if (r11 != r0) goto Lad
            int r11 = r5.pos
            int r11 = r10 - r11
            long r14 = (long) r11
            long r14 = r14 + r23
            return r14
        Lad:
            int r10 = r10 + 1
            goto L9f
        Lb0:
            int r11 = r5.limit
            int r14 = r5.pos
            int r11 = r11 - r14
            long r14 = (long) r11
            long r23 = r23 + r14
            r26 = r23
            okio.Segment r11 = r5.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            r5 = r11
            r6 = r33
            r9 = r22
            r10 = r28
            r11 = r29
            r14 = r30
            r15 = r31
            goto L79
        Lcd:
            r22 = r9
            r9 = -1
            return r9
        Ld2:
            r25 = r5
            r22 = r9
            r30 = r14
            r5 = 0
        Lda:
            int r9 = r15.limit
            int r10 = r15.pos
            int r9 = r9 - r10
            long r9 = (long) r9
            long r9 = r9 + r5
            int r11 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r11 > 0) goto Lee
            okio.Segment r11 = r15.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            r15 = r11
            r5 = r9
            goto Lda
        Lee:
            r9 = r15
            r10 = r5
            r14 = 0
            if (r9 != 0) goto Lf6
            r16 = -1
            return r16
        Lf6:
            r16 = r9
            r20 = r10
            r23 = r5
            r5 = r16
            r16 = r1
        L100:
            int r6 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r6 >= 0) goto L14a
            byte[] r6 = r5.data
            r26 = r9
            int r9 = r5.limit
            r27 = r10
            long r9 = (long) r9
            int r11 = r5.pos
            r31 = r12
            long r11 = (long) r11
            long r11 = r11 + r7
            long r11 = r11 - r20
            long r9 = java.lang.Math.min(r9, r11)
            int r9 = (int) r9
            int r10 = r5.pos
            long r10 = (long) r10
            long r10 = r10 + r16
            long r10 = r10 - r20
            int r10 = (int) r10
        L122:
            if (r10 >= r9) goto L133
            r11 = r6[r10]
            if (r11 != r0) goto L130
            int r11 = r5.pos
            int r11 = r10 - r11
            long r11 = (long) r11
            long r11 = r11 + r20
            return r11
        L130:
            int r10 = r10 + 1
            goto L122
        L133:
            int r11 = r5.limit
            int r12 = r5.pos
            int r11 = r11 - r12
            long r11 = (long) r11
            long r20 = r20 + r11
            r16 = r20
            okio.Segment r11 = r5.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            r5 = r11
            r9 = r26
            r10 = r27
            r12 = r31
            goto L100
        L14a:
            r26 = r9
            r9 = -1
            return r9
        L14f:
            r25 = r5
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "size="
            java.lang.StringBuilder r6 = r6.append(r7)
            long r7 = r33.size()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = " fromIndex="
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r7 = " toIndex="
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    public static final long commonIndexOf(okio.Buffer r31, okio.ByteString r32, long r33) {
            r0 = r33
            java.lang.String r2 = "<this>"
            r3 = r31
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.String r2 = "bytes"
            r4 = r32
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            r2 = 0
            int r5 = r32.size()
            if (r5 <= 0) goto L1a
            r5 = 1
            goto L1b
        L1a:
            r5 = 0
        L1b:
            if (r5 == 0) goto L197
            r8 = 0
            int r5 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r5 < 0) goto L25
            r5 = 1
            goto L26
        L25:
            r5 = 0
        L26:
            if (r5 == 0) goto L175
            r8 = r33
            r5 = r31
            r10 = 0
            okio.Segment r11 = r5.head
            r12 = -1
            if (r11 != 0) goto L38
            r6 = 0
            r14 = -1
            r7 = 0
            return r12
        L38:
            long r14 = r5.size()
            long r14 = r14 - r8
            int r14 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r14 >= 0) goto Lde
            long r17 = r5.size()
        L46:
            int r14 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r14 <= 0) goto L59
            okio.Segment r14 = r11.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r14)
            r11 = r14
            int r14 = r11.limit
            int r7 = r11.pos
            int r14 = r14 - r7
            long r6 = (long) r14
            long r17 = r17 - r6
            goto L46
        L59:
            r6 = r11
            r20 = r17
            r7 = 0
            if (r6 != 0) goto L60
            return r12
        L60:
            r14 = r6
            r22 = r20
            byte[] r12 = r32.internalArray$okio()
            r13 = 0
            r13 = r12[r13]
            int r15 = r32.size()
            long r26 = r31.size()
            r16 = r2
            long r2 = (long) r15
            long r26 = r26 - r2
            r2 = 1
            long r26 = r26 + r2
            r2 = r0
        L7c:
            int r19 = (r22 > r26 ? 1 : (r22 == r26 ? 0 : -1))
            if (r19 >= 0) goto Ldb
            byte[] r4 = r14.data
            r28 = r5
            int r5 = r14.limit
            r19 = r6
            int r6 = r14.pos
            r24 = r7
            long r6 = (long) r6
            long r6 = r6 + r26
            long r6 = r6 - r22
            r25 = 0
            r29 = r10
            r30 = r11
            long r10 = (long) r5
            long r10 = java.lang.Math.min(r10, r6)
            int r5 = (int) r10
            int r6 = r14.pos
            long r6 = (long) r6
            long r6 = r6 + r2
            long r6 = r6 - r22
            int r6 = (int) r6
        La4:
            if (r6 >= r5) goto Lbe
            r7 = r4[r6]
            if (r7 != r13) goto Lbb
            int r7 = r6 + 1
            r10 = 1
            boolean r7 = rangeEquals(r14, r7, r12, r10, r15)
            if (r7 == 0) goto Lbb
            int r7 = r14.pos
            int r7 = r6 - r7
            long r10 = (long) r7
            long r10 = r10 + r22
            return r10
        Lbb:
            int r6 = r6 + 1
            goto La4
        Lbe:
            int r6 = r14.limit
            int r7 = r14.pos
            int r6 = r6 - r7
            long r6 = (long) r6
            long r22 = r22 + r6
            r2 = r22
            okio.Segment r6 = r14.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r14 = r6
            r4 = r32
            r6 = r19
            r7 = r24
            r5 = r28
            r10 = r29
            r11 = r30
            goto L7c
        Ldb:
            r4 = -1
            return r4
        Lde:
            r16 = r2
            r28 = r5
            r29 = r10
            r2 = 0
        Le6:
            int r4 = r11.limit
            int r5 = r11.pos
            int r4 = r4 - r5
            long r4 = (long) r4
            long r4 = r4 + r2
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 > 0) goto Lfa
            okio.Segment r6 = r11.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r11 = r6
            r2 = r4
            goto Le6
        Lfa:
            r4 = r11
            r5 = r2
            r7 = 0
            if (r4 != 0) goto L102
            r12 = -1
            return r12
        L102:
            r10 = r4
            r12 = r5
            byte[] r14 = r32.internalArray$okio()
            r15 = 0
            r15 = r14[r15]
            r17 = r2
            int r2 = r32.size()
            long r19 = r31.size()
            r21 = r4
            long r3 = (long) r2
            long r19 = r19 - r3
            r3 = 1
            long r19 = r19 + r3
            r3 = r0
        L11f:
            int r22 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r22 >= 0) goto L172
            r22 = r5
            byte[] r5 = r10.data
            int r6 = r10.limit
            r24 = r7
            int r7 = r10.pos
            r25 = r8
            long r7 = (long) r7
            long r7 = r7 + r19
            long r7 = r7 - r12
            r9 = 0
            long r0 = (long) r6
            long r0 = java.lang.Math.min(r0, r7)
            int r0 = (int) r0
            int r1 = r10.pos
            long r6 = (long) r1
            long r6 = r6 + r3
            long r6 = r6 - r12
            int r1 = (int) r6
        L140:
            if (r1 >= r0) goto L15a
            r6 = r5[r1]
            if (r6 != r15) goto L156
            int r6 = r1 + 1
            r7 = 1
            boolean r6 = rangeEquals(r10, r6, r14, r7, r2)
            if (r6 == 0) goto L157
            int r6 = r10.pos
            int r6 = r1 - r6
            long r6 = (long) r6
            long r6 = r6 + r12
            return r6
        L156:
            r7 = 1
        L157:
            int r1 = r1 + 1
            goto L140
        L15a:
            r7 = 1
            int r1 = r10.limit
            int r6 = r10.pos
            int r1 = r1 - r6
            long r8 = (long) r1
            long r12 = r12 + r8
            r3 = r12
            okio.Segment r1 = r10.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r10 = r1
            r0 = r33
            r5 = r22
            r7 = r24
            r8 = r25
            goto L11f
        L172:
            r0 = -1
            return r0
        L175:
            r16 = r2
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "fromIndex < 0: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r33
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L197:
            r16 = r2
            r2 = r0
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "bytes is empty"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final long commonIndexOfElement(okio.Buffer r31, okio.ByteString r32, long r33) {
            r0 = r32
            r1 = r33
            java.lang.String r3 = "<this>"
            r4 = r31
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            java.lang.String r3 = "targetBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            r3 = 0
            r5 = 0
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 < 0) goto L1a
            r5 = 1
            goto L1b
        L1a:
            r5 = 0
        L1b:
            if (r5 == 0) goto L230
            r8 = r33
            r5 = r31
            r10 = 0
            okio.Segment r11 = r5.head
            r12 = -1
            if (r11 != 0) goto L2d
            r6 = 0
            r14 = -1
            r7 = 0
            return r12
        L2d:
            long r14 = r5.size()
            long r14 = r14 - r8
            int r14 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            r15 = 2
            if (r14 >= 0) goto L135
            long r16 = r5.size()
        L3c:
            int r14 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r14 <= 0) goto L4f
            okio.Segment r14 = r11.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r14)
            r11 = r14
            int r14 = r11.limit
            int r7 = r11.pos
            int r14 = r14 - r7
            long r6 = (long) r14
            long r16 = r16 - r6
            goto L3c
        L4f:
            r6 = r11
            r20 = r16
            r7 = 0
            if (r6 != 0) goto L56
            return r12
        L56:
            r14 = r6
            r22 = r20
            int r12 = r32.size()
            if (r12 != r15) goto Lc1
            r12 = 0
            byte r12 = r0.getByte(r12)
            r13 = 1
            byte r13 = r0.getByte(r13)
            r18 = r1
        L6b:
            long r24 = r31.size()
            int r15 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r15 >= 0) goto Lb7
            byte[] r15 = r14.data
            r24 = r3
            int r3 = r14.pos
            long r3 = (long) r3
            long r3 = r3 + r18
            long r3 = r3 - r22
            int r3 = (int) r3
            int r4 = r14.limit
        L81:
            if (r3 >= r4) goto L9e
            r25 = r4
            r4 = r15[r3]
            if (r4 == r12) goto L92
            if (r4 != r13) goto L8c
            goto L92
        L8c:
            int r3 = r3 + 1
            r4 = r25
            goto L81
        L92:
            r26 = r4
            int r4 = r14.pos
            int r4 = r3 - r4
            r27 = r3
            long r3 = (long) r4
            long r3 = r3 + r22
            return r3
        L9e:
            r27 = r3
            r25 = r4
            int r3 = r14.limit
            int r4 = r14.pos
            int r3 = r3 - r4
            long r3 = (long) r3
            long r22 = r22 + r3
            r18 = r22
            okio.Segment r3 = r14.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r14 = r3
            r4 = r31
            r3 = r24
            goto L6b
        Lb7:
            r24 = r3
            r25 = r5
            r12 = r18
            r18 = r6
            goto L132
        Lc1:
            r24 = r3
            byte[] r3 = r32.internalArray$okio()
            r12 = r1
        Lc8:
            long r25 = r31.size()
            int r4 = (r22 > r25 ? 1 : (r22 == r25 ? 0 : -1))
            if (r4 >= 0) goto L12c
            byte[] r4 = r14.data
            int r15 = r14.pos
            r25 = r5
            r18 = r6
            long r5 = (long) r15
            long r5 = r5 + r12
            long r5 = r5 - r22
            int r5 = (int) r5
            int r6 = r14.limit
        Ldf:
            if (r5 >= r6) goto L10f
            r15 = r4[r5]
            r26 = r4
            int r4 = r3.length
            r27 = r6
            r6 = 0
        Le9:
            if (r6 >= r4) goto L106
            r28 = r4
            r4 = r3[r6]
            if (r15 != r4) goto Lfd
            int r6 = r14.pos
            int r6 = r5 - r6
            r29 = r3
            r30 = r4
            long r3 = (long) r6
            long r3 = r3 + r22
            return r3
        Lfd:
            r29 = r3
            r30 = r4
            int r6 = r6 + 1
            r4 = r28
            goto Le9
        L106:
            r29 = r3
            int r5 = r5 + 1
            r4 = r26
            r6 = r27
            goto Ldf
        L10f:
            r29 = r3
            r26 = r4
            r27 = r6
            int r3 = r14.limit
            int r4 = r14.pos
            int r3 = r3 - r4
            long r3 = (long) r3
            long r22 = r22 + r3
            r12 = r22
            okio.Segment r3 = r14.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r14 = r3
            r6 = r18
            r5 = r25
            r3 = r29
            goto Lc8
        L12c:
            r29 = r3
            r25 = r5
            r18 = r6
        L132:
            r3 = -1
            return r3
        L135:
            r24 = r3
            r25 = r5
            r3 = 0
        L13b:
            int r5 = r11.limit
            int r6 = r11.pos
            int r5 = r5 - r6
            long r5 = (long) r5
            long r5 = r5 + r3
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 > 0) goto L14f
            okio.Segment r7 = r11.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            r11 = r7
            r3 = r5
            goto L13b
        L14f:
            r5 = r11
            r6 = r3
            r12 = 0
            if (r5 != 0) goto L157
            r13 = -1
            return r13
        L157:
            r13 = r5
            r16 = r6
            int r14 = r32.size()
            if (r14 != r15) goto L1c4
            r14 = 0
            byte r14 = r0.getByte(r14)
            r15 = 1
            byte r15 = r0.getByte(r15)
            r18 = r1
        L16c:
            long r20 = r31.size()
            int r20 = (r16 > r20 ? 1 : (r16 == r20 ? 0 : -1))
            if (r20 >= 0) goto L1bc
            byte[] r0 = r13.data
            r20 = r3
            int r3 = r13.pos
            long r3 = (long) r3
            long r3 = r3 + r18
            long r3 = r3 - r16
            int r3 = (int) r3
            int r4 = r13.limit
        L182:
            if (r3 >= r4) goto L1a1
            r22 = r4
            r4 = r0[r3]
            if (r4 == r14) goto L193
            if (r4 != r15) goto L18d
            goto L193
        L18d:
            int r3 = r3 + 1
            r4 = r22
            goto L182
        L193:
            r23 = r0
            int r0 = r13.pos
            int r0 = r3 - r0
            r26 = r3
            r27 = r4
            long r3 = (long) r0
            long r3 = r3 + r16
            return r3
        L1a1:
            r23 = r0
            r26 = r3
            r22 = r4
            int r0 = r13.limit
            int r3 = r13.pos
            int r0 = r0 - r3
            long r3 = (long) r0
            long r16 = r16 + r3
            r18 = r16
            okio.Segment r0 = r13.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r13 = r0
            r0 = r32
            r3 = r20
            goto L16c
        L1bc:
            r20 = r3
            r26 = r5
            r28 = r6
            goto L22d
        L1c4:
            r20 = r3
            r14 = 0
            byte[] r0 = r32.internalArray$okio()
            r18 = r1
        L1cd:
            long r3 = r31.size()
            int r3 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r3 >= 0) goto L229
            byte[] r3 = r13.data
            int r4 = r13.pos
            long r14 = (long) r4
            long r14 = r14 + r18
            long r14 = r14 - r16
            int r4 = (int) r14
            int r14 = r13.limit
        L1e1:
            if (r4 >= r14) goto L20d
            r15 = r3[r4]
            r23 = r3
            int r3 = r0.length
            r26 = r5
            r5 = 0
        L1eb:
            if (r5 >= r3) goto L204
            r27 = r3
            r3 = r0[r5]
            if (r15 != r3) goto L1fd
            int r5 = r13.pos
            int r5 = r4 - r5
            r28 = r6
            long r5 = (long) r5
            long r5 = r5 + r16
            return r5
        L1fd:
            r28 = r6
            int r5 = r5 + 1
            r3 = r27
            goto L1eb
        L204:
            r28 = r6
            int r4 = r4 + 1
            r3 = r23
            r5 = r26
            goto L1e1
        L20d:
            r23 = r3
            r26 = r5
            r28 = r6
            int r3 = r13.limit
            int r5 = r13.pos
            int r3 = r3 - r5
            long r5 = (long) r3
            long r16 = r16 + r5
            r18 = r16
            okio.Segment r3 = r13.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r13 = r3
            r5 = r26
            r6 = r28
            r14 = 0
            goto L1cd
        L229:
            r26 = r5
            r28 = r6
        L22d:
            r3 = -1
            return r3
        L230:
            r24 = r3
            r0 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "fromIndex < 0: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r0 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public static final int commonNext(okio.Buffer.UnsafeCursor r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            long r1 = r5.offset
            okio.Buffer r3 = r5.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            long r3 = r3.size()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            if (r1 == 0) goto L33
            long r1 = r5.offset
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L25
            r1 = 0
            goto L2e
        L25:
            long r1 = r5.offset
            int r3 = r5.end
            int r4 = r5.start
            int r3 = r3 - r4
            long r3 = (long) r3
            long r1 = r1 + r3
        L2e:
            int r1 = r5.seek(r1)
            return r1
        L33:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "no more bytes"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final boolean commonRangeEquals(okio.Buffer r7, long r8, okio.ByteString r10, int r11, int r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            r1 = 0
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r2 = 0
            if (r1 < 0) goto L3f
            if (r11 < 0) goto L3f
            if (r12 < 0) goto L3f
            long r3 = r7.size()
            long r3 = r3 - r8
            long r5 = (long) r12
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L3f
            int r1 = r10.size()
            int r1 = r1 - r11
            if (r1 >= r12) goto L28
            goto L3f
        L28:
            r1 = 0
        L29:
            if (r1 >= r12) goto L3d
            long r3 = (long) r1
            long r3 = r3 + r8
            byte r3 = r7.getByte(r3)
            int r4 = r11 + r1
            byte r4 = r10.getByte(r4)
            if (r3 == r4) goto L3a
            return r2
        L3a:
            int r1 = r1 + 1
            goto L29
        L3d:
            r1 = 1
            return r1
        L3f:
            return r2
    }

    public static final int commonRead(okio.Buffer r3, byte[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            r1 = 0
            int r2 = r4.length
            int r1 = r3.read(r4, r1, r2)
            return r1
    }

    public static final int commonRead(okio.Buffer r8, byte[] r9, int r10, int r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r1 = r9.length
            long r2 = (long) r1
            long r4 = (long) r10
            long r6 = (long) r11
            okio.SegmentedByteString.checkOffsetAndCount(r2, r4, r6)
            okio.Segment r1 = r8.head
            if (r1 != 0) goto L18
            r1 = -1
            return r1
        L18:
            int r2 = r1.limit
            int r3 = r1.pos
            int r2 = r2 - r3
            int r2 = java.lang.Math.min(r11, r2)
            byte[] r3 = r1.data
            int r4 = r1.pos
            int r5 = r1.pos
            int r5 = r5 + r2
            kotlin.collections.ArraysKt.copyInto(r3, r9, r10, r4, r5)
            int r3 = r1.pos
            int r3 = r3 + r2
            r1.pos = r3
            long r3 = r8.size()
            long r5 = (long) r2
            long r3 = r3 - r5
            r8.setSize$okio(r3)
            int r3 = r1.pos
            int r4 = r1.limit
            if (r3 != r4) goto L4a
            okio.Segment r3 = r1.pop()
            r8.head = r3
            okio.SegmentPool.recycle(r1)
        L4a:
            return r2
    }

    public static final long commonRead(okio.Buffer r5, okio.Buffer r6, long r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = 0
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 < 0) goto L14
            r3 = 1
            goto L15
        L14:
            r3 = 0
        L15:
            if (r3 == 0) goto L34
            long r3 = r5.size()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L22
            r1 = -1
            return r1
        L22:
            long r1 = r5.size()
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L2f
            long r1 = r5.size()
            goto L30
        L2f:
            r1 = r7
        L30:
            r6.write(r5, r1)
            return r1
        L34:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "byteCount < 0: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static final long commonReadAll(okio.Buffer r5, okio.Sink r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            long r1 = r5.size()
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L18
            r6.write(r5, r1)
        L18:
            return r1
    }

    public static final okio.Buffer.UnsafeCursor commonReadAndWriteUnsafe(okio.Buffer r3, okio.Buffer.UnsafeCursor r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "unsafeCursor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okio.Buffer$UnsafeCursor r0 = okio.SegmentedByteString.resolveDefaultParameter(r4)
            okio.Buffer r1 = r0.buffer
            r2 = 1
            if (r1 != 0) goto L15
            r1 = r2
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 == 0) goto L1d
            r0.buffer = r3
            r0.readWrite = r2
            return r0
        L1d:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "already attached to a buffer"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final byte commonReadByte(okio.Buffer r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            long r1 = r10.size()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L38
            okio.Segment r1 = r10.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r2 = r1.pos
            int r3 = r1.limit
            byte[] r4 = r1.data
            int r5 = r2 + 1
            r2 = r4[r2]
            long r6 = r10.size()
            r8 = 1
            long r6 = r6 - r8
            r10.setSize$okio(r6)
            if (r5 != r3) goto L35
            okio.Segment r6 = r1.pop()
            r10.head = r6
            okio.SegmentPool.recycle(r1)
            goto L37
        L35:
            r1.pos = r5
        L37:
            return r2
        L38:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    public static final byte[] commonReadByteArray(okio.Buffer r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            long r1 = r3.size()
            byte[] r1 = r3.readByteArray(r1)
            return r1
    }

    public static final byte[] commonReadByteArray(okio.Buffer r4, long r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L15
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 == 0) goto L2d
            long r1 = r4.size()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 < 0) goto L27
            int r1 = (int) r5
            byte[] r1 = new byte[r1]
            r4.readFully(r1)
            return r1
        L27:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L2d:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "byteCount: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static final okio.ByteString commonReadByteString(okio.Buffer r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            long r1 = r3.size()
            okio.ByteString r1 = r3.readByteString(r1)
            return r1
    }

    public static final okio.ByteString commonReadByteString(okio.Buffer r4, long r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L15
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 == 0) goto L41
            long r1 = r4.size()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 < 0) goto L3b
            r1 = 4096(0x1000, double:2.0237E-320)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L31
            int r1 = (int) r5
            okio.ByteString r1 = r4.snapshot(r1)
            r2 = r1
            r3 = 0
            r4.skip(r5)
            return r1
        L31:
            okio.ByteString r1 = new okio.ByteString
            byte[] r2 = r4.readByteArray(r5)
            r1.<init>(r2)
            return r1
        L3b:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L41:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "byteCount: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static final long commonReadDecimalLong(okio.Buffer r18) {
            r0 = r18
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            long r2 = r18.size()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L114
            r2 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = -7
        L19:
            okio.Segment r11 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            byte[] r12 = r11.data
            int r13 = r11.pos
            int r14 = r11.limit
        L24:
            if (r13 >= r14) goto L9e
            r15 = r12[r13]
            r4 = 48
            if (r15 < r4) goto L83
            r4 = 57
            if (r15 > r4) goto L83
            int r4 = 48 - r15
            r16 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r5 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r5 < 0) goto L4f
            int r5 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r5 != 0) goto L46
            r5 = r1
            long r0 = (long) r4
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 >= 0) goto L47
            goto L50
        L46:
            r5 = r1
        L47:
            r0 = 10
            long r2 = r2 * r0
            long r0 = (long) r4
            long r2 = r2 + r0
            r17 = r5
            goto L8f
        L4f:
            r5 = r1
        L50:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeDecimalLong(r2)
            okio.Buffer r0 = r0.writeByte(r15)
            if (r7 != 0) goto L62
            r0.readByte()
        L62:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r16 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r17 = r5
            java.lang.String r5 = "Number too large: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r0.readUtf8()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4)
            throw r1
        L83:
            r17 = r1
            r0 = 45
            if (r15 != r0) goto L9b
            if (r6 != 0) goto L9b
            r7 = 1
            r0 = 1
            long r9 = r9 - r0
        L8f:
            int r13 = r13 + 1
            int r6 = r6 + 1
            r4 = 0
            r0 = r18
            r1 = r17
            goto L24
        L9b:
            r0 = 1
            r8 = r0
            goto La0
        L9e:
            r17 = r1
        La0:
            if (r13 != r14) goto Lae
            okio.Segment r0 = r11.pop()
            r1 = r18
            r1.head = r0
            okio.SegmentPool.recycle(r11)
            goto Lb2
        Lae:
            r1 = r18
            r11.pos = r13
        Lb2:
            if (r8 != 0) goto Lc0
            okio.Segment r0 = r1.head
            if (r0 != 0) goto Lb9
            goto Lc0
        Lb9:
            r0 = r1
            r1 = r17
            r4 = 0
            goto L19
        Lc0:
            long r4 = r18.size()
            long r11 = (long) r6
            long r4 = r4 - r11
            r1.setSize$okio(r4)
            if (r7 == 0) goto Lcd
            r0 = 2
            goto Lce
        Lcd:
            r0 = 1
        Lce:
            if (r6 >= r0) goto L10e
            long r4 = r18.size()
            r11 = 0
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 == 0) goto L108
            if (r7 == 0) goto Ldf
            java.lang.String r4 = "Expected a digit"
            goto Le1
        Ldf:
            java.lang.String r4 = "Expected a digit or '-'"
        Le1:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.StringBuilder r11 = r11.append(r4)
            java.lang.String r12 = " but was 0x"
            java.lang.StringBuilder r11 = r11.append(r12)
            r12 = 0
            byte r12 = r1.getByte(r12)
            java.lang.String r12 = okio.SegmentedByteString.toHexString(r12)
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r11 = r11.toString()
            r5.<init>(r11)
            throw r5
        L108:
            java.io.EOFException r4 = new java.io.EOFException
            r4.<init>()
            throw r4
        L10e:
            if (r7 == 0) goto L112
            r4 = r2
            goto L113
        L112:
            long r4 = -r2
        L113:
            return r4
        L114:
            r17 = r1
            r1 = r0
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    public static final void commonReadFully(okio.Buffer r3, okio.Buffer r4, long r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            long r1 = r3.size()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 < 0) goto L17
            r4.write(r3, r5)
            return
        L17:
            long r1 = r3.size()
            r4.write(r3, r1)
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    public static final void commonReadFully(okio.Buffer r4, byte[] r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            r1 = 0
        Lc:
            int r2 = r5.length
            if (r1 >= r2) goto L20
            int r2 = r5.length
            int r2 = r2 - r1
            int r2 = r4.read(r5, r1, r2)
            r3 = -1
            if (r2 == r3) goto L1a
            int r1 = r1 + r2
            goto Lc
        L1a:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
        L20:
            return
    }

    public static final long commonReadHexadecimalUnsignedLong(okio.Buffer r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = 0
            long r1 = r15.size()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto Lc2
            r1 = 0
            r5 = 0
            r6 = 0
        L14:
            okio.Segment r7 = r15.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            byte[] r8 = r7.data
            int r9 = r7.pos
            int r10 = r7.limit
        L1f:
            if (r9 >= r10) goto La4
            r11 = 0
            r12 = r8[r9]
            r13 = 48
            if (r12 < r13) goto L2f
            r13 = 57
            if (r12 > r13) goto L2f
            int r11 = r12 + (-48)
            goto L48
        L2f:
            r13 = 97
            if (r12 < r13) goto L3c
            r13 = 102(0x66, float:1.43E-43)
            if (r12 > r13) goto L3c
            int r13 = r12 + (-97)
            int r11 = r13 + 10
            goto L48
        L3c:
            r13 = 65
            if (r12 < r13) goto L83
            r13 = 70
            if (r12 > r13) goto L83
            int r13 = r12 + (-65)
            int r11 = r13 + 10
        L48:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r1
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 != 0) goto L59
            r13 = 4
            long r1 = r1 << r13
            long r13 = (long) r11
            long r1 = r1 | r13
            int r9 = r9 + 1
            int r5 = r5 + 1
            goto L1f
        L59:
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            okio.Buffer r3 = r3.writeHexadecimalUnsignedLong(r1)
            okio.Buffer r3 = r3.writeByte(r12)
            java.lang.NumberFormatException r4 = new java.lang.NumberFormatException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Number too large: "
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.String r14 = r3.readUtf8()
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.String r13 = r13.toString()
            r4.<init>(r13)
            throw r4
        L83:
            if (r5 == 0) goto L87
            r6 = 1
            goto La4
        L87:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r13 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r4 = r4.append(r13)
            java.lang.String r13 = okio.SegmentedByteString.toHexString(r12)
            java.lang.StringBuilder r4 = r4.append(r13)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        La4:
            if (r9 != r10) goto Lb0
            okio.Segment r11 = r7.pop()
            r15.head = r11
            okio.SegmentPool.recycle(r7)
            goto Lb2
        Lb0:
            r7.pos = r9
        Lb2:
            if (r6 != 0) goto Lb8
            okio.Segment r7 = r15.head
            if (r7 != 0) goto L14
        Lb8:
            long r3 = r15.size()
            long r7 = (long) r5
            long r3 = r3 - r7
            r15.setSize$okio(r3)
            return r1
        Lc2:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    public static final int commonReadInt(okio.Buffer r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            long r1 = r11.size()
            r3 = 4
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L8d
            okio.Segment r1 = r11.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r2 = r1.pos
            int r5 = r1.limit
            int r6 = r5 - r2
            long r6 = (long) r6
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 >= 0) goto L4a
            byte r3 = r11.readByte()
            r4 = 255(0xff, float:3.57E-43)
            r6 = 0
            r3 = r3 & r4
            int r3 = r3 << 24
            byte r4 = r11.readByte()
            r6 = 255(0xff, float:3.57E-43)
            r7 = 0
            r4 = r4 & r6
            int r4 = r4 << 16
            r3 = r3 | r4
            byte r4 = r11.readByte()
            r6 = 255(0xff, float:3.57E-43)
            r7 = 0
            r4 = r4 & r6
            int r4 = r4 << 8
            r3 = r3 | r4
            byte r4 = r11.readByte()
            r6 = 255(0xff, float:3.57E-43)
            r7 = 0
            r4 = r4 & r6
            r3 = r3 | r4
            return r3
        L4a:
            byte[] r6 = r1.data
            int r7 = r2 + 1
            r2 = r6[r2]
            r8 = 255(0xff, float:3.57E-43)
            r9 = 0
            r2 = r2 & r8
            int r2 = r2 << 24
            int r8 = r7 + 1
            r7 = r6[r7]
            r9 = 255(0xff, float:3.57E-43)
            r10 = 0
            r7 = r7 & r9
            int r7 = r7 << 16
            r2 = r2 | r7
            int r7 = r8 + 1
            r8 = r6[r8]
            r9 = 255(0xff, float:3.57E-43)
            r10 = 0
            r8 = r8 & r9
            int r8 = r8 << 8
            r2 = r2 | r8
            int r8 = r7 + 1
            r7 = r6[r7]
            r9 = 255(0xff, float:3.57E-43)
            r10 = 0
            r7 = r7 & r9
            r2 = r2 | r7
            long r9 = r11.size()
            long r9 = r9 - r3
            r11.setSize$okio(r9)
            if (r8 != r5) goto L8a
            okio.Segment r3 = r1.pop()
            r11.head = r3
            okio.SegmentPool.recycle(r1)
            goto L8c
        L8a:
            r1.pos = r8
        L8c:
            return r2
        L8d:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    public static final long commonReadLong(okio.Buffer r15) {
            r0 = r15
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            r1 = 0
            long r2 = r15.size()
            r4 = 8
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto Lc3
            okio.Segment r2 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r3 = r2.pos
            int r6 = r2.limit
            int r7 = r6 - r3
            long r7 = (long) r7
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            r8 = 32
            if (r7 >= 0) goto L40
            int r4 = r15.readInt()
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r5 = 0
            long r11 = (long) r4
            long r4 = r11 & r9
            long r4 = r4 << r8
            int r7 = r15.readInt()
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 0
            long r11 = (long) r7
            long r7 = r11 & r8
            long r4 = r4 | r7
            return r4
        L40:
            byte[] r7 = r2.data
            int r9 = r3 + 1
            r3 = r7[r3]
            r10 = 255(0xff, double:1.26E-321)
            r12 = 0
            long r13 = (long) r3
            long r10 = r10 & r13
            r3 = 56
            long r10 = r10 << r3
            int r3 = r9 + 1
            r9 = r7[r9]
            r12 = 255(0xff, double:1.26E-321)
            r14 = 0
            long r4 = (long) r9
            long r4 = r4 & r12
            r9 = 48
            long r4 = r4 << r9
            long r4 = r4 | r10
            int r9 = r3 + 1
            r3 = r7[r3]
            r10 = 255(0xff, double:1.26E-321)
            r12 = 0
            long r13 = (long) r3
            long r10 = r10 & r13
            r3 = 40
            long r10 = r10 << r3
            long r3 = r4 | r10
            int r5 = r9 + 1
            r9 = r7[r9]
            r10 = 255(0xff, double:1.26E-321)
            r12 = 0
            long r13 = (long) r9
            long r9 = r13 & r10
            long r8 = r9 << r8
            long r3 = r3 | r8
            int r8 = r5 + 1
            r5 = r7[r5]
            r9 = 255(0xff, double:1.26E-321)
            r11 = 0
            long r12 = (long) r5
            long r9 = r9 & r12
            r5 = 24
            long r9 = r9 << r5
            long r3 = r3 | r9
            int r5 = r8 + 1
            r8 = r7[r8]
            r9 = 255(0xff, double:1.26E-321)
            r11 = 0
            long r12 = (long) r8
            long r8 = r12 & r9
            r10 = 16
            long r8 = r8 << r10
            long r3 = r3 | r8
            int r8 = r5 + 1
            r5 = r7[r5]
            r9 = 255(0xff, double:1.26E-321)
            r11 = 0
            long r12 = (long) r5
            long r9 = r9 & r12
            r5 = 8
            long r9 = r9 << r5
            long r3 = r3 | r9
            int r5 = r8 + 1
            r8 = r7[r8]
            r9 = 255(0xff, double:1.26E-321)
            r11 = 0
            long r12 = (long) r8
            long r8 = r12 & r9
            long r3 = r3 | r8
            long r8 = r15.size()
            r10 = 8
            long r8 = r8 - r10
            r15.setSize$okio(r8)
            if (r5 != r6) goto Lc0
            okio.Segment r8 = r2.pop()
            r0.head = r8
            okio.SegmentPool.recycle(r2)
            goto Lc2
        Lc0:
            r2.pos = r5
        Lc2:
            return r3
        Lc3:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
    }

    public static final short commonReadShort(okio.Buffer r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            long r1 = r11.size()
            r3 = 2
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L60
            okio.Segment r1 = r11.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r2 = r1.pos
            int r5 = r1.limit
            int r6 = r5 - r2
            r7 = 2
            if (r6 >= r7) goto L33
            byte r3 = r11.readByte()
            r4 = 255(0xff, float:3.57E-43)
            r6 = 0
            r3 = r3 & r4
            int r3 = r3 << 8
            byte r4 = r11.readByte()
            r6 = 255(0xff, float:3.57E-43)
            r7 = 0
            r4 = r4 & r6
            r3 = r3 | r4
            short r4 = (short) r3
            return r4
        L33:
            byte[] r6 = r1.data
            int r7 = r2 + 1
            r2 = r6[r2]
            r8 = 255(0xff, float:3.57E-43)
            r9 = 0
            r2 = r2 & r8
            int r2 = r2 << 8
            int r8 = r7 + 1
            r7 = r6[r7]
            r9 = 255(0xff, float:3.57E-43)
            r10 = 0
            r7 = r7 & r9
            r2 = r2 | r7
            long r9 = r11.size()
            long r9 = r9 - r3
            r11.setSize$okio(r9)
            if (r8 != r5) goto L5c
            okio.Segment r3 = r1.pop()
            r11.head = r3
            okio.SegmentPool.recycle(r1)
            goto L5e
        L5c:
            r1.pos = r8
        L5e:
            short r3 = (short) r2
            return r3
        L60:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    public static final okio.Buffer.UnsafeCursor commonReadUnsafe(okio.Buffer r3, okio.Buffer.UnsafeCursor r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "unsafeCursor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okio.Buffer$UnsafeCursor r0 = okio.SegmentedByteString.resolveDefaultParameter(r4)
            okio.Buffer r1 = r0.buffer
            r2 = 0
            if (r1 != 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = r2
        L16:
            if (r1 == 0) goto L1d
            r0.buffer = r3
            r0.readWrite = r2
            return r0
        L1d:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "already attached to a buffer"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final java.lang.String commonReadUtf8(okio.Buffer r7, long r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            r1 = 0
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r4 = 0
            if (r3 < 0) goto L16
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 > 0) goto L16
            r3 = 1
            goto L17
        L16:
            r3 = r4
        L17:
            if (r3 == 0) goto L73
            long r5 = r7.size()
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 < 0) goto L6d
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto L28
            java.lang.String r1 = ""
            return r1
        L28:
            okio.Segment r1 = r7.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r2 = r1.pos
            long r2 = (long) r2
            long r2 = r2 + r8
            int r5 = r1.limit
            long r5 = (long) r5
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L43
            byte[] r2 = r7.readByteArray(r8)
            r3 = 3
            r5 = 0
            java.lang.String r2 = okio.internal._Utf8Kt.commonToUtf8String$default(r2, r4, r4, r3, r5)
            return r2
        L43:
            byte[] r2 = r1.data
            int r3 = r1.pos
            int r4 = r1.pos
            int r5 = (int) r8
            int r4 = r4 + r5
            java.lang.String r2 = okio.internal._Utf8Kt.commonToUtf8String(r2, r3, r4)
            int r3 = r1.pos
            int r4 = (int) r8
            int r3 = r3 + r4
            r1.pos = r3
            long r3 = r7.size()
            long r3 = r3 - r8
            r7.setSize$okio(r3)
            int r3 = r1.pos
            int r4 = r1.limit
            if (r3 != r4) goto L6c
            okio.Segment r3 = r1.pop()
            r7.head = r3
            okio.SegmentPool.recycle(r1)
        L6c:
            return r2
        L6d:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L73:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "byteCount: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static final int commonReadUtf8CodePoint(okio.Buffer r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            long r1 = r11.size()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto Lec
            byte r1 = r11.getByte(r3)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 128(0x80, float:1.8E-43)
            r6 = r1
            r7 = 0
            r5 = r5 & r6
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r5 != 0) goto L2b
            r5 = 127(0x7f, float:1.78E-43)
            r7 = r1
            r8 = 0
            r5 = r5 & r7
            r2 = r5
            r3 = 1
            r4 = 0
            goto L62
        L2b:
            r5 = 224(0xe0, float:3.14E-43)
            r7 = r1
            r8 = 0
            r5 = r5 & r7
            r7 = 192(0xc0, float:2.69E-43)
            if (r5 != r7) goto L3e
            r5 = 31
            r7 = r1
            r8 = 0
            r5 = r5 & r7
            r2 = r5
            r3 = 2
            r4 = 128(0x80, float:1.8E-43)
            goto L62
        L3e:
            r5 = 240(0xf0, float:3.36E-43)
            r7 = r1
            r8 = 0
            r5 = r5 & r7
            r7 = 224(0xe0, float:3.14E-43)
            if (r5 != r7) goto L51
            r5 = 15
            r7 = r1
            r8 = 0
            r5 = r5 & r7
            r2 = r5
            r3 = 3
            r4 = 2048(0x800, float:2.87E-42)
            goto L62
        L51:
            r5 = 248(0xf8, float:3.48E-43)
            r7 = r1
            r8 = 0
            r5 = r5 & r7
            r7 = 240(0xf0, float:3.36E-43)
            if (r5 != r7) goto Le6
            r5 = 7
            r7 = r1
            r8 = 0
            r5 = r5 & r7
            r2 = r5
            r3 = 4
            r4 = 65536(0x10000, float:9.1835E-41)
        L62:
            long r7 = r11.size()
            long r9 = (long) r3
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 < 0) goto Lab
            r5 = 1
        L6c:
            if (r5 >= r3) goto L8c
            long r7 = (long) r5
            byte r7 = r11.getByte(r7)
            r8 = 192(0xc0, float:2.69E-43)
            r9 = r7
            r10 = 0
            r8 = r8 & r9
            r9 = 128(0x80, float:1.8E-43)
            if (r8 != r9) goto L87
            int r2 = r2 << 6
            r8 = 63
            r9 = r7
            r10 = 0
            r8 = r8 & r9
            r2 = r2 | r8
            int r5 = r5 + 1
            goto L6c
        L87:
            long r8 = (long) r5
            r11.skip(r8)
            return r6
        L8c:
            long r7 = (long) r3
            r11.skip(r7)
            r5 = 1114111(0x10ffff, float:1.561202E-39)
            if (r2 <= r5) goto L97
            goto Laa
        L97:
            r5 = 55296(0xd800, float:7.7486E-41)
            r7 = 0
            if (r5 > r2) goto La3
            r5 = 57344(0xe000, float:8.0356E-41)
            if (r2 >= r5) goto La3
            r7 = 1
        La3:
            if (r7 == 0) goto La6
            goto Laa
        La6:
            if (r2 >= r4) goto La9
            goto Laa
        La9:
            r6 = r2
        Laa:
            return r6
        Lab:
            java.io.EOFException r5 = new java.io.EOFException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "size < "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r7 = ": "
            java.lang.StringBuilder r6 = r6.append(r7)
            long r7 = r11.size()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = " (to read code point prefixed 0x"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = okio.SegmentedByteString.toHexString(r1)
            java.lang.StringBuilder r6 = r6.append(r7)
            r7 = 41
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        Le6:
            r7 = 1
            r11.skip(r7)
            return r6
        Lec:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    public static final java.lang.String commonReadUtf8Line(okio.Buffer r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            r1 = 10
            long r1 = r7.indexOf(r1)
            r3 = -1
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L18
            java.lang.String r3 = readUtf8Line(r7, r1)
            goto L2c
        L18:
            long r3 = r7.size()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L2b
            long r3 = r7.size()
            java.lang.String r3 = r7.readUtf8(r3)
            goto L2c
        L2b:
            r3 = 0
        L2c:
            return r3
    }

    public static final java.lang.String commonReadUtf8LineStrict(okio.Buffer r16, long r17) {
            r6 = r16
            r7 = r17
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r9 = 0
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto Lac
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r10 = 1
            if (r2 != 0) goto L21
            goto L23
        L21:
            long r0 = r7 + r10
        L23:
            r12 = r0
            r1 = 10
            r2 = 0
            r0 = r16
            r4 = r12
            long r14 = r0.indexOf(r1, r2, r4)
            r0 = -1
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 == 0) goto L3a
            java.lang.String r0 = readUtf8Line(r6, r14)
            return r0
        L3a:
            long r0 = r16.size()
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 >= 0) goto L59
            long r0 = r12 - r10
            byte r0 = r6.getByte(r0)
            r1 = 13
            if (r0 != r1) goto L59
            byte r0 = r6.getByte(r12)
            r1 = 10
            if (r0 != r1) goto L59
            java.lang.String r0 = readUtf8Line(r6, r12)
            return r0
        L59:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r0 = 32
            long r2 = r16.size()
            r4 = 0
            long r10 = (long) r0
            long r10 = java.lang.Math.min(r10, r2)
            r2 = 0
            r0 = r16
            r4 = r10
            r0.copyTo(r1, r2, r4)
            java.io.EOFException r0 = new java.io.EOFException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "\\n not found: limit="
            java.lang.StringBuilder r2 = r2.append(r3)
            long r3 = r16.size()
            long r3 = java.lang.Math.min(r3, r7)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " content="
            java.lang.StringBuilder r2 = r2.append(r3)
            okio.ByteString r3 = r1.readByteString()
            java.lang.String r3 = r3.hex()
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = 8230(0x2026, float:1.1533E-41)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        Lac:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "limit < 0: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static final long commonResizeBuffer(okio.Buffer.UnsafeCursor r16, long r17) {
            r0 = r16
            r1 = r17
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            r3 = 0
            okio.Buffer r4 = r0.buffer
            if (r4 == 0) goto Lce
            boolean r5 = r0.readWrite
            if (r5 == 0) goto Lc0
            long r5 = r4.size()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r8 = 1
            r9 = 0
            if (r7 > 0) goto L7e
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 < 0) goto L22
            goto L23
        L22:
            r8 = 0
        L23:
            if (r8 == 0) goto L60
            long r7 = r5 - r1
        L27:
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L52
            okio.Segment r11 = r4.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            okio.Segment r11 = r11.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            int r12 = r11.limit
            int r13 = r11.pos
            int r12 = r12 - r13
            long r13 = (long) r12
            int r13 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r13 > 0) goto L4b
            okio.Segment r13 = r11.pop()
            r4.head = r13
            okio.SegmentPool.recycle(r11)
            long r13 = (long) r12
            long r7 = r7 - r13
            goto L27
        L4b:
            int r9 = r11.limit
            int r10 = (int) r7
            int r9 = r9 - r10
            r11.limit = r9
        L52:
            r9 = 0
            r0.setSegment$okio(r9)
            r0.offset = r1
            r0.data = r9
            r9 = -1
            r0.start = r9
            r0.end = r9
            goto Lbc
        L60:
            r7 = 0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "newSize < 0: "
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.String r7 = r8.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L7e:
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto Lbc
            r7 = 1
            long r11 = r1 - r5
        L85:
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 <= 0) goto Lbc
            okio.Segment r13 = r4.writableSegment$okio(r8)
            int r14 = r13.limit
            int r14 = 8192 - r14
            r15 = 0
            long r8 = (long) r14
            long r8 = java.lang.Math.min(r11, r8)
            int r8 = (int) r8
            int r9 = r13.limit
            int r9 = r9 + r8
            r13.limit = r9
            long r9 = (long) r8
            long r11 = r11 - r9
            if (r7 == 0) goto Lb8
            r0.setSegment$okio(r13)
            r0.offset = r5
            byte[] r9 = r13.data
            r0.data = r9
            int r9 = r13.limit
            int r9 = r9 - r8
            r0.start = r9
            int r9 = r13.limit
            r0.end = r9
            r7 = 0
            r8 = 1
            r9 = 0
            goto L85
        Lb8:
            r8 = 1
            r9 = 0
            goto L85
        Lbc:
            r4.setSize$okio(r1)
            return r5
        Lc0:
            r5 = 0
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "resizeBuffer() only permitted for read/write buffers"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        Lce:
            r4 = 0
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "not attached to a buffer"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public static final int commonSeek(okio.Buffer.UnsafeCursor r18, long r19) {
            r0 = r18
            r1 = r19
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            r3 = 0
            okio.Buffer r4 = r0.buffer
            if (r4 == 0) goto L109
            r5 = -1
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 < 0) goto Le2
            long r7 = r4.size()
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 > 0) goto Le2
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 == 0) goto Ld4
            long r5 = r4.size()
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L2a
            goto Ld4
        L2a:
            r5 = 0
            long r7 = r4.size()
            okio.Segment r9 = r4.head
            okio.Segment r10 = r4.head
            okio.Segment r11 = r18.getSegment$okio()
            if (r11 == 0) goto L59
            long r11 = r0.offset
            int r13 = r0.start
            okio.Segment r14 = r18.getSegment$okio()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r14)
            int r14 = r14.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r11 = r11 - r13
            int r13 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r13 <= 0) goto L54
            r7 = r11
            okio.Segment r10 = r18.getSegment$okio()
            goto L59
        L54:
            r5 = r11
            okio.Segment r9 = r18.getSegment$okio()
        L59:
            r11 = 0
            r12 = 0
            long r14 = r7 - r1
            long r16 = r1 - r5
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 <= 0) goto L7e
            r11 = r9
            r12 = r5
        L66:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            int r14 = r11.limit
            int r15 = r11.pos
            int r14 = r14 - r15
            long r14 = (long) r14
            long r14 = r14 + r12
            int r14 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r14 < 0) goto L94
            int r14 = r11.limit
            int r15 = r11.pos
            int r14 = r14 - r15
            long r14 = (long) r14
            long r12 = r12 + r14
            okio.Segment r11 = r11.next
            goto L66
        L7e:
            r11 = r10
            r12 = r7
        L80:
            int r14 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r14 <= 0) goto L94
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            okio.Segment r11 = r11.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            int r14 = r11.limit
            int r15 = r11.pos
            int r14 = r14 - r15
            long r14 = (long) r14
            long r12 = r12 - r14
            goto L80
        L94:
            boolean r14 = r0.readWrite
            if (r14 == 0) goto Lb5
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            boolean r14 = r11.shared
            if (r14 == 0) goto Lb5
            okio.Segment r14 = r11.unsharedCopy()
            okio.Segment r15 = r4.head
            if (r15 != r11) goto La9
            r4.head = r14
        La9:
            okio.Segment r11 = r11.push(r14)
            okio.Segment r15 = r11.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15)
            r15.pop()
        Lb5:
            r0.setSegment$okio(r11)
            r0.offset = r1
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            byte[] r14 = r11.data
            r0.data = r14
            int r14 = r11.pos
            r15 = r5
            long r5 = r1 - r12
            int r5 = (int) r5
            int r14 = r14 + r5
            r0.start = r14
            int r5 = r11.limit
            r0.end = r5
            int r5 = r0.end
            int r6 = r0.start
            int r5 = r5 - r6
            return r5
        Ld4:
            r5 = 0
            r0.setSegment$okio(r5)
            r0.offset = r1
            r0.data = r5
            r5 = -1
            r0.start = r5
            r0.end = r5
            return r5
        Le2:
            java.lang.ArrayIndexOutOfBoundsException r5 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "offset="
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r7 = " > size="
            java.lang.StringBuilder r6 = r6.append(r7)
            long r7 = r4.size()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L109:
            r4 = 0
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "not attached to a buffer"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public static final int commonSelect(okio.Buffer r5, okio.Options r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = 2
            r2 = 0
            r3 = 0
            int r1 = selectPrefix$default(r5, r6, r3, r1, r2)
            r2 = -1
            if (r1 != r2) goto L16
            return r2
        L16:
            okio.ByteString[] r2 = r6.getByteStrings$okio()
            r2 = r2[r1]
            int r2 = r2.size()
            long r3 = (long) r2
            r5.skip(r3)
            return r1
    }

    public static final void commonSkip(okio.Buffer r9, long r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            r1 = r10
        L7:
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L43
            okio.Segment r3 = r9.head
            if (r3 == 0) goto L3d
            int r4 = r3.limit
            int r5 = r3.pos
            int r4 = r4 - r5
            r5 = 0
            long r6 = (long) r4
            long r6 = java.lang.Math.min(r1, r6)
            int r4 = (int) r6
            long r5 = r9.size()
            long r7 = (long) r4
            long r5 = r5 - r7
            r9.setSize$okio(r5)
            long r5 = (long) r4
            long r1 = r1 - r5
            int r5 = r3.pos
            int r5 = r5 + r4
            r3.pos = r5
            int r5 = r3.pos
            int r6 = r3.limit
            if (r5 != r6) goto L7
            okio.Segment r5 = r3.pop()
            r9.head = r5
            okio.SegmentPool.recycle(r3)
            goto L7
        L3d:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
        L43:
            return
    }

    public static final okio.ByteString commonSnapshot(okio.Buffer r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            long r1 = r5.size()
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            if (r1 == 0) goto L20
            long r1 = r5.size()
            int r1 = (int) r1
            okio.ByteString r1 = r5.snapshot(r1)
            return r1
        L20:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "size > Int.MAX_VALUE: "
            java.lang.StringBuilder r2 = r2.append(r3)
            long r3 = r5.size()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static final okio.ByteString commonSnapshot(okio.Buffer r8, int r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            if (r9 != 0) goto Lb
            okio.ByteString r1 = okio.ByteString.EMPTY
            return r1
        Lb:
            long r2 = r8.size()
            r4 = 0
            long r6 = (long) r9
            okio.SegmentedByteString.checkOffsetAndCount(r2, r4, r6)
            r1 = 0
            r2 = 0
            okio.Segment r3 = r8.head
        L19:
            if (r1 >= r9) goto L37
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r4 = r3.limit
            int r5 = r3.pos
            if (r4 == r5) goto L2f
            int r4 = r3.limit
            int r5 = r3.pos
            int r4 = r4 - r5
            int r1 = r1 + r4
            int r2 = r2 + 1
            okio.Segment r3 = r3.next
            goto L19
        L2f:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r5 = "s.limit == s.pos"
            r4.<init>(r5)
            throw r4
        L37:
            byte[][] r4 = new byte[r2][]
            int r5 = r2 * 2
            int[] r5 = new int[r5]
            r1 = 0
            r2 = 0
            okio.Segment r3 = r8.head
        L41:
            if (r1 >= r9) goto L67
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            byte[] r6 = r3.data
            r4[r2] = r6
            int r6 = r3.limit
            int r7 = r3.pos
            int r6 = r6 - r7
            int r1 = r1 + r6
            int r6 = java.lang.Math.min(r1, r9)
            r5[r2] = r6
            r6 = r4
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            int r6 = r6.length
            int r6 = r6 + r2
            int r7 = r3.pos
            r5[r6] = r7
            r6 = 1
            r3.shared = r6
            int r2 = r2 + 1
            okio.Segment r3 = r3.next
            goto L41
        L67:
            okio.SegmentedByteString r6 = new okio.SegmentedByteString
            r6.<init>(r4, r5)
            okio.ByteString r6 = (okio.ByteString) r6
            return r6
    }

    public static final okio.Segment commonWritableSegment(okio.Buffer r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            r1 = 8192(0x2000, float:1.148E-41)
            r2 = 1
            if (r5 < r2) goto Le
            if (r5 > r1) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            if (r2 == 0) goto L3c
            okio.Segment r2 = r4.head
            if (r2 != 0) goto L20
            okio.Segment r1 = okio.SegmentPool.take()
            r4.head = r1
            r1.prev = r1
            r1.next = r1
            return r1
        L20:
            okio.Segment r2 = r4.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            okio.Segment r2 = r2.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r3 = r2.limit
            int r3 = r3 + r5
            if (r3 > r1) goto L33
            boolean r1 = r2.owner
            if (r1 != 0) goto L3b
        L33:
            okio.Segment r1 = okio.SegmentPool.take()
            okio.Segment r2 = r2.push(r1)
        L3b:
            return r2
        L3c:
            r1 = 0
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "unexpected capacity"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final okio.Buffer commonWrite(okio.Buffer r1, okio.ByteString r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "byteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            r2.write$okio(r1, r3, r4)
            return r1
    }

    public static final okio.Buffer commonWrite(okio.Buffer r7, okio.Source r8, long r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            r1 = r9
        Lc:
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L24
            long r3 = r8.read(r7, r1)
            r5 = -1
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L1e
            long r1 = r1 - r3
            goto Lc
        L1e:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L24:
            return r7
    }

    public static final okio.Buffer commonWrite(okio.Buffer r3, byte[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            r1 = 0
            int r2 = r4.length
            okio.Buffer r1 = r3.write(r4, r1, r2)
            return r1
    }

    public static final okio.Buffer commonWrite(okio.Buffer r9, byte[] r10, int r11, int r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            r1 = r11
            int r2 = r10.length
            long r3 = (long) r2
            long r5 = (long) r1
            long r7 = (long) r12
            okio.SegmentedByteString.checkOffsetAndCount(r3, r5, r7)
            int r2 = r1 + r12
        L15:
            if (r1 >= r2) goto L38
            r3 = 1
            okio.Segment r3 = r9.writableSegment$okio(r3)
            int r4 = r2 - r1
            int r5 = r3.limit
            int r5 = 8192 - r5
            int r4 = java.lang.Math.min(r4, r5)
            byte[] r5 = r3.data
            int r6 = r3.limit
            int r7 = r1 + r4
            kotlin.collections.ArraysKt.copyInto(r10, r5, r6, r1, r7)
            int r1 = r1 + r4
            int r5 = r3.limit
            int r5 = r5 + r4
            r3.limit = r5
            goto L15
        L38:
            long r3 = r9.size()
            long r5 = (long) r12
            long r3 = r3 + r5
            r9.setSize$okio(r3)
            return r9
    }

    public static final void commonWrite(okio.Buffer r10, okio.Buffer r11, long r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            r5 = r12
            r7 = 0
            if (r11 == r10) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = r7
        L12:
            if (r1 == 0) goto Lc7
            long r1 = r11.size()
            r3 = 0
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
        L1d:
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto Lc6
            okio.Segment r1 = r11.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r1 = r1.limit
            okio.Segment r2 = r11.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r2 = r2.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 >= 0) goto L84
            okio.Segment r1 = r10.head
            if (r1 == 0) goto L43
            okio.Segment r1 = r10.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            okio.Segment r1 = r1.prev
            goto L44
        L43:
            r1 = 0
        L44:
            if (r1 == 0) goto L78
            boolean r2 = r1.owner
            if (r2 == 0) goto L78
            int r2 = r1.limit
            long r2 = (long) r2
            long r2 = r2 + r5
            boolean r4 = r1.shared
            if (r4 == 0) goto L54
            r4 = r7
            goto L56
        L54:
            int r4 = r1.pos
        L56:
            long r8 = (long) r4
            long r2 = r2 - r8
            r8 = 8192(0x2000, double:4.0474E-320)
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 > 0) goto L78
            okio.Segment r2 = r11.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r3 = (int) r5
            r2.writeTo(r1, r3)
            long r2 = r11.size()
            long r2 = r2 - r5
            r11.setSize$okio(r2)
            long r2 = r10.size()
            long r2 = r2 + r5
            r10.setSize$okio(r2)
            return
        L78:
            okio.Segment r2 = r11.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r3 = (int) r5
            okio.Segment r2 = r2.split(r3)
            r11.head = r2
        L84:
            okio.Segment r1 = r11.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r2 = r1.limit
            int r3 = r1.pos
            int r2 = r2 - r3
            long r2 = (long) r2
            okio.Segment r4 = r1.pop()
            r11.head = r4
            okio.Segment r4 = r10.head
            if (r4 != 0) goto La2
            r10.head = r1
            r1.prev = r1
            okio.Segment r4 = r1.prev
            r1.next = r4
            goto Lb3
        La2:
            okio.Segment r4 = r10.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            okio.Segment r4 = r4.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            okio.Segment r4 = r4.push(r1)
            r4.compact()
        Lb3:
            long r8 = r11.size()
            long r8 = r8 - r2
            r11.setSize$okio(r8)
            long r8 = r10.size()
            long r8 = r8 + r2
            r10.setSize$okio(r8)
            long r5 = r5 - r2
            goto L1d
        Lc6:
            return
        Lc7:
            r1 = 0
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "source == this"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
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
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "byteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            r4 = 0
            r1.write$okio(r0, r2, r3)
            return r0
    }

    public static final long commonWriteAll(okio.Buffer r7, okio.Source r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            r1 = 0
        Ld:
            r3 = 8192(0x2000, double:4.0474E-320)
            long r3 = r8.read(r7, r3)
            r5 = -1
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L1c
            long r1 = r1 + r3
            goto Ld
        L1c:
            return r1
    }

    public static final okio.Buffer commonWriteByte(okio.Buffer r6, int r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = 1
            okio.Segment r1 = r6.writableSegment$okio(r1)
            byte[] r2 = r1.data
            int r3 = r1.limit
            int r4 = r3 + 1
            r1.limit = r4
            byte r4 = (byte) r7
            r2[r3] = r4
            long r2 = r6.size()
            r4 = 1
            long r2 = r2 + r4
            r6.setSize$okio(r2)
            return r6
    }

    public static final okio.Buffer commonWriteDecimalLong(okio.Buffer r16, long r17) {
            r0 = r16
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = r17
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L17
            r4 = 48
            okio.Buffer r4 = r0.writeByte(r4)
            return r4
        L17:
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L29
            long r2 = -r2
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L28
            java.lang.String r4 = "-9223372036854775808"
            okio.Buffer r4 = r0.writeUtf8(r4)
            return r4
        L28:
            r6 = 1
        L29:
            r7 = 100000000(0x5f5e100, double:4.94065646E-316)
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r8 = 10
            if (r7 >= 0) goto L78
            r9 = 10000(0x2710, double:4.9407E-320)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto L56
            r9 = 100
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto L4a
            r9 = 10
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto L47
            r7 = 1
            goto Lef
        L47:
            r7 = 2
            goto Lef
        L4a:
            r9 = 1000(0x3e8, double:4.94E-321)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto L53
            r7 = 3
            goto Lef
        L53:
            r7 = 4
            goto Lef
        L56:
            r9 = 1000000(0xf4240, double:4.940656E-318)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto L6a
            r9 = 100000(0x186a0, double:4.94066E-319)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto L67
            r7 = 5
            goto Lef
        L67:
            r7 = 6
            goto Lef
        L6a:
            r9 = 10000000(0x989680, double:4.9406565E-317)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto L74
            r7 = 7
            goto Lef
        L74:
            r7 = 8
            goto Lef
        L78:
            r9 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto La5
            r9 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto L96
            r9 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto L94
            r7 = 9
            goto Lef
        L94:
            r7 = r8
            goto Lef
        L96:
            r9 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto La2
            r7 = 11
            goto Lef
        La2:
            r7 = 12
            goto Lef
        La5:
            r9 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto Lc9
            r9 = 10000000000000(0x9184e72a000, double:4.9406564584125E-311)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto Lba
            r7 = 13
            goto Lef
        Lba:
            r9 = 100000000000000(0x5af3107a4000, double:4.94065645841247E-310)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto Lc6
            r7 = 14
            goto Lef
        Lc6:
            r7 = 15
            goto Lef
        Lc9:
            r9 = 100000000000000000(0x16345785d8a0000, double:5.620395787888205E-302)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto Le1
            r9 = 10000000000000000(0x2386f26fc10000, double:5.431165199810528E-308)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto Lde
            r7 = 16
            goto Lef
        Lde:
            r7 = 17
            goto Lef
        Le1:
            r9 = 1000000000000000000(0xde0b6b3a7640000, double:7.832953389245686E-242)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto Led
            r7 = 18
            goto Lef
        Led:
            r7 = 19
        Lef:
            if (r6 == 0) goto Lf6
            int r7 = r7 + 1
        Lf6:
            okio.Segment r9 = r0.writableSegment$okio(r7)
            byte[] r10 = r9.data
            int r11 = r9.limit
            int r11 = r11 + r7
        Lff:
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r12 == 0) goto L113
            long r12 = (long) r8
            long r14 = r2 % r12
            int r14 = (int) r14
            int r11 = r11 + (-1)
            byte[] r15 = getHEX_DIGIT_BYTES()
            r15 = r15[r14]
            r10[r11] = r15
            long r2 = r2 / r12
            goto Lff
        L113:
            if (r6 == 0) goto L11b
            int r11 = r11 + (-1)
            r4 = 45
            r10[r11] = r4
        L11b:
            int r4 = r9.limit
            int r4 = r4 + r7
            r9.limit = r4
            long r4 = r16.size()
            long r12 = (long) r7
            long r4 = r4 + r12
            r0.setSize$okio(r4)
            return r0
    }

    public static final okio.Buffer commonWriteHexadecimalUnsignedLong(okio.Buffer r16, long r17) {
            r0 = r16
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = r17
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L17
            r4 = 48
            okio.Buffer r4 = r0.writeByte(r4)
            return r4
        L17:
            r4 = r2
            r6 = 1
            long r7 = r4 >>> r6
            long r4 = r4 | r7
            r7 = 2
            long r8 = r4 >>> r7
            long r4 = r4 | r8
            r8 = 4
            long r9 = r4 >>> r8
            long r4 = r4 | r9
            r9 = 8
            long r10 = r4 >>> r9
            long r4 = r4 | r10
            r10 = 16
            long r11 = r4 >>> r10
            long r4 = r4 | r11
            r11 = 32
            long r12 = r4 >>> r11
            long r4 = r4 | r12
            long r12 = r4 >>> r6
            r14 = 6148914691236517205(0x5555555555555555, double:1.1945305291614955E103)
            long r12 = r12 & r14
            long r4 = r4 - r12
            long r12 = r4 >>> r7
            r14 = 3689348814741910323(0x3333333333333333, double:4.667261458395856E-62)
            long r12 = r12 & r14
            long r14 = r14 & r4
            long r12 = r12 + r14
            long r4 = r12 >>> r8
            long r4 = r4 + r12
            r14 = 1085102592571150095(0xf0f0f0f0f0f0f0f, double:3.815736827118017E-236)
            long r4 = r4 & r14
            long r12 = r4 >>> r9
            long r4 = r4 + r12
            long r9 = r4 >>> r10
            long r4 = r4 + r9
            r9 = 63
            long r12 = r4 & r9
            long r14 = r4 >>> r11
            long r9 = r9 & r14
            long r12 = r12 + r9
            r4 = 3
            long r4 = (long) r4
            long r4 = r4 + r12
            long r9 = (long) r8
            long r4 = r4 / r9
            int r4 = (int) r4
            okio.Segment r5 = r0.writableSegment$okio(r4)
            byte[] r7 = r5.data
            int r9 = r5.limit
            int r9 = r9 + r4
            int r9 = r9 - r6
            int r6 = r5.limit
        L6f:
            if (r9 < r6) goto L81
            byte[] r10 = getHEX_DIGIT_BYTES()
            r14 = 15
            long r14 = r14 & r2
            int r11 = (int) r14
            r10 = r10[r11]
            r7[r9] = r10
            long r2 = r2 >>> r8
            int r9 = r9 + (-1)
            goto L6f
        L81:
            int r8 = r5.limit
            int r8 = r8 + r4
            r5.limit = r8
            long r10 = r16.size()
            long r14 = (long) r4
            long r10 = r10 + r14
            r0.setSize$okio(r10)
            return r0
    }

    public static final okio.Buffer commonWriteInt(okio.Buffer r8, int r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            r1 = 4
            okio.Segment r1 = r8.writableSegment$okio(r1)
            byte[] r2 = r1.data
            int r3 = r1.limit
            int r4 = r3 + 1
            int r5 = r9 >>> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r2[r3] = r5
            int r3 = r4 + 1
            int r5 = r9 >>> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r2[r4] = r5
            int r4 = r3 + 1
            int r5 = r9 >>> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r2[r3] = r5
            int r3 = r4 + 1
            r5 = r9 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r2[r4] = r5
            r1.limit = r3
            long r4 = r8.size()
            r6 = 4
            long r4 = r4 + r6
            r8.setSize$okio(r4)
            return r8
    }

    public static final okio.Buffer commonWriteLong(okio.Buffer r10, long r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            r1 = 8
            okio.Segment r2 = r10.writableSegment$okio(r1)
            byte[] r3 = r2.data
            int r4 = r2.limit
            int r5 = r4 + 1
            r6 = 56
            long r6 = r11 >>> r6
            r8 = 255(0xff, double:1.26E-321)
            long r6 = r6 & r8
            int r6 = (int) r6
            byte r6 = (byte) r6
            r3[r4] = r6
            int r4 = r5 + 1
            r6 = 48
            long r6 = r11 >>> r6
            long r6 = r6 & r8
            int r6 = (int) r6
            byte r6 = (byte) r6
            r3[r5] = r6
            int r5 = r4 + 1
            r6 = 40
            long r6 = r11 >>> r6
            long r6 = r6 & r8
            int r6 = (int) r6
            byte r6 = (byte) r6
            r3[r4] = r6
            int r4 = r5 + 1
            r6 = 32
            long r6 = r11 >>> r6
            long r6 = r6 & r8
            int r6 = (int) r6
            byte r6 = (byte) r6
            r3[r5] = r6
            int r5 = r4 + 1
            r6 = 24
            long r6 = r11 >>> r6
            long r6 = r6 & r8
            int r6 = (int) r6
            byte r6 = (byte) r6
            r3[r4] = r6
            int r4 = r5 + 1
            r6 = 16
            long r6 = r11 >>> r6
            long r6 = r6 & r8
            int r6 = (int) r6
            byte r6 = (byte) r6
            r3[r5] = r6
            int r5 = r4 + 1
            long r6 = r11 >>> r1
            long r6 = r6 & r8
            int r1 = (int) r6
            byte r1 = (byte) r1
            r3[r4] = r1
            int r1 = r5 + 1
            long r6 = r11 & r8
            int r4 = (int) r6
            byte r4 = (byte) r4
            r3[r5] = r4
            r2.limit = r1
            long r4 = r10.size()
            r6 = 8
            long r4 = r4 + r6
            r10.setSize$okio(r4)
            return r10
    }

    public static final okio.Buffer commonWriteShort(okio.Buffer r8, int r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            r1 = 2
            okio.Segment r1 = r8.writableSegment$okio(r1)
            byte[] r2 = r1.data
            int r3 = r1.limit
            int r4 = r3 + 1
            int r5 = r9 >>> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r2[r3] = r5
            int r3 = r4 + 1
            r5 = r9 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r2[r4] = r5
            r1.limit = r3
            long r4 = r8.size()
            r6 = 2
            long r4 = r4 + r6
            r8.setSize$okio(r4)
            return r8
    }

    public static final okio.Buffer commonWriteUtf8(okio.Buffer r18, java.lang.String r19, int r20, int r21) {
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            r4 = 0
            r6 = 1
            if (r2 < 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = 0
        L19:
            if (r7 == 0) goto L1c8
            if (r3 < r2) goto L1f
            r7 = r6
            goto L20
        L1f:
            r7 = 0
        L20:
            if (r7 == 0) goto L1a0
            int r7 = r19.length()
            if (r3 > r7) goto L2a
            r7 = r6
            goto L2b
        L2a:
            r7 = 0
        L2b:
            if (r7 == 0) goto L174
            r7 = r20
        L2f:
            if (r7 >= r3) goto L173
            char r8 = r1.charAt(r7)
            r9 = 128(0x80, float:1.8E-43)
            if (r8 >= r9) goto L75
            okio.Segment r10 = r0.writableSegment$okio(r6)
            byte[] r11 = r10.data
            int r12 = r10.limit
            int r12 = r12 - r7
            int r13 = 8192 - r12
            int r13 = java.lang.Math.min(r3, r13)
            int r14 = r7 + 1
            int r7 = r7 + r12
            byte r15 = (byte) r8
            r11[r7] = r15
            r7 = r14
        L50:
            if (r7 >= r13) goto L60
            char r8 = r1.charAt(r7)
            if (r8 >= r9) goto L60
            int r14 = r7 + 1
            int r7 = r7 + r12
            byte r15 = (byte) r8
            r11[r7] = r15
            r7 = r14
            goto L50
        L60:
            int r9 = r7 + r12
            int r14 = r10.limit
            int r9 = r9 - r14
            int r14 = r10.limit
            int r14 = r14 + r9
            r10.limit = r14
            long r14 = r18.size()
            long r5 = (long) r9
            long r14 = r14 + r5
            r0.setSize$okio(r14)
            r6 = 1
            goto L2f
        L75:
            r5 = 2048(0x800, float:2.87E-42)
            r6 = 2
            if (r8 >= r5) goto La9
            okio.Segment r5 = r0.writableSegment$okio(r6)
            byte[] r10 = r5.data
            int r11 = r5.limit
            int r12 = r8 >> 6
            r12 = r12 | 192(0xc0, float:2.69E-43)
            byte r12 = (byte) r12
            r10[r11] = r12
            byte[] r10 = r5.data
            int r11 = r5.limit
            r12 = 1
            int r11 = r11 + r12
            r12 = r8 & 63
            r9 = r9 | r12
            byte r9 = (byte) r9
            r10[r11] = r9
            int r9 = r5.limit
            int r9 = r9 + r6
            r5.limit = r9
            long r9 = r18.size()
            r11 = 2
            long r9 = r9 + r11
            r0.setSize$okio(r9)
            int r7 = r7 + 1
            r6 = 1
            goto L2f
        La9:
            r5 = 55296(0xd800, float:7.7486E-41)
            r11 = 63
            if (r8 < r5) goto L135
            r5 = 57343(0xdfff, float:8.0355E-41)
            if (r8 <= r5) goto Lb7
            goto L135
        Lb7:
            int r5 = r7 + 1
            if (r5 >= r3) goto Lc2
            int r5 = r7 + 1
            char r5 = r1.charAt(r5)
            goto Lc3
        Lc2:
            r5 = 0
        Lc3:
            r12 = 56319(0xdbff, float:7.892E-41)
            if (r8 > r12) goto L12d
            r12 = 56320(0xdc00, float:7.8921E-41)
            if (r12 > r5) goto Ld4
            r12 = 57344(0xe000, float:8.0356E-41)
            if (r5 >= r12) goto Ld4
            r12 = 1
            goto Ld5
        Ld4:
            r12 = 0
        Ld5:
            if (r12 != 0) goto Ld8
            goto L12d
        Ld8:
            r12 = r8 & 1023(0x3ff, float:1.434E-42)
            int r12 = r12 << 10
            r13 = r5 & 1023(0x3ff, float:1.434E-42)
            r12 = r12 | r13
            r13 = 65536(0x10000, float:9.1835E-41)
            int r12 = r12 + r13
            r13 = 4
            okio.Segment r14 = r0.writableSegment$okio(r13)
            byte[] r15 = r14.data
            int r13 = r14.limit
            int r10 = r12 >> 18
            r10 = r10 | 240(0xf0, float:3.36E-43)
            byte r10 = (byte) r10
            r15[r13] = r10
            byte[] r10 = r14.data
            int r13 = r14.limit
            r15 = 1
            int r13 = r13 + r15
            int r15 = r12 >> 12
            r15 = r15 & r11
            r15 = r15 | r9
            byte r15 = (byte) r15
            r10[r13] = r15
            byte[] r10 = r14.data
            int r13 = r14.limit
            int r13 = r13 + r6
            int r6 = r12 >> 6
            r6 = r6 & r11
            r6 = r6 | r9
            byte r6 = (byte) r6
            r10[r13] = r6
            byte[] r6 = r14.data
            int r10 = r14.limit
            r11 = 3
            int r10 = r10 + r11
            r11 = r12 & 63
            r9 = r9 | r11
            byte r9 = (byte) r9
            r6[r10] = r9
            int r6 = r14.limit
            r9 = 4
            int r6 = r6 + r9
            r14.limit = r6
            long r9 = r18.size()
            r16 = 4
            long r9 = r9 + r16
            r0.setSize$okio(r9)
            int r7 = r7 + 2
            r6 = 1
            goto L2f
        L12d:
            r0.writeByte(r11)
            int r7 = r7 + 1
            r6 = 1
            goto L2f
        L135:
            r5 = 3
            okio.Segment r10 = r0.writableSegment$okio(r5)
            byte[] r5 = r10.data
            int r12 = r10.limit
            int r13 = r8 >> 12
            r13 = r13 | 224(0xe0, float:3.14E-43)
            byte r13 = (byte) r13
            r5[r12] = r13
            byte[] r5 = r10.data
            int r12 = r10.limit
            r13 = 1
            int r12 = r12 + r13
            int r14 = r8 >> 6
            r11 = r11 & r14
            r11 = r11 | r9
            byte r11 = (byte) r11
            r5[r12] = r11
            byte[] r5 = r10.data
            int r11 = r10.limit
            int r11 = r11 + r6
            r6 = r8 & 63
            r6 = r6 | r9
            byte r6 = (byte) r6
            r5[r11] = r6
            int r5 = r10.limit
            r6 = 3
            int r5 = r5 + r6
            r10.limit = r5
            long r5 = r18.size()
            r11 = 3
            long r5 = r5 + r11
            r0.setSize$okio(r5)
            int r7 = r7 + 1
            r6 = r13
            goto L2f
        L173:
            return r0
        L174:
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "endIndex > string.length: "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r7 = " > "
            java.lang.StringBuilder r6 = r6.append(r7)
            int r7 = r19.length()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L1a0:
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "endIndex < beginIndex: "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r7 = " < "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L1c8:
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "beginIndex < 0: "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    public static final okio.Buffer commonWriteUtf8CodePoint(okio.Buffer r11, int r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            r1 = 128(0x80, float:1.8E-43)
            if (r12 >= r1) goto L10
            r11.writeByte(r12)
            goto Ld8
        L10:
            r2 = 2048(0x800, float:2.87E-42)
            r3 = 1
            r4 = 2
            if (r12 >= r2) goto L41
            okio.Segment r2 = r11.writableSegment$okio(r4)
            byte[] r5 = r2.data
            int r6 = r2.limit
            int r7 = r12 >> 6
            r7 = r7 | 192(0xc0, float:2.69E-43)
            byte r7 = (byte) r7
            r5[r6] = r7
            byte[] r5 = r2.data
            int r6 = r2.limit
            int r6 = r6 + r3
            r3 = r12 & 63
            r1 = r1 | r3
            byte r1 = (byte) r1
            r5[r6] = r1
            int r1 = r2.limit
            int r1 = r1 + r4
            r2.limit = r1
            long r3 = r11.size()
            r5 = 2
            long r3 = r3 + r5
            r11.setSize$okio(r3)
            goto Ld8
        L41:
            r2 = 55296(0xd800, float:7.7486E-41)
            r5 = 0
            if (r2 > r12) goto L4d
            r2 = 57344(0xe000, float:8.0356E-41)
            if (r12 >= r2) goto L4d
            r5 = r3
        L4d:
            r2 = 63
            if (r5 == 0) goto L56
            r11.writeByte(r2)
            goto Ld8
        L56:
            r5 = 65536(0x10000, float:9.1835E-41)
            r6 = 3
            if (r12 >= r5) goto L91
            okio.Segment r5 = r11.writableSegment$okio(r6)
            byte[] r7 = r5.data
            int r8 = r5.limit
            int r9 = r12 >> 12
            r9 = r9 | 224(0xe0, float:3.14E-43)
            byte r9 = (byte) r9
            r7[r8] = r9
            byte[] r7 = r5.data
            int r8 = r5.limit
            int r8 = r8 + r3
            int r3 = r12 >> 6
            r2 = r2 & r3
            r2 = r2 | r1
            byte r2 = (byte) r2
            r7[r8] = r2
            byte[] r2 = r5.data
            int r3 = r5.limit
            int r3 = r3 + r4
            r4 = r12 & 63
            r1 = r1 | r4
            byte r1 = (byte) r1
            r2[r3] = r1
            int r1 = r5.limit
            int r1 = r1 + r6
            r5.limit = r1
            long r1 = r11.size()
            r3 = 3
            long r1 = r1 + r3
            r11.setSize$okio(r1)
            goto Ld8
        L91:
            r5 = 1114111(0x10ffff, float:1.561202E-39)
            if (r12 > r5) goto Ld9
            r5 = 4
            okio.Segment r7 = r11.writableSegment$okio(r5)
            byte[] r8 = r7.data
            int r9 = r7.limit
            int r10 = r12 >> 18
            r10 = r10 | 240(0xf0, float:3.36E-43)
            byte r10 = (byte) r10
            r8[r9] = r10
            byte[] r8 = r7.data
            int r9 = r7.limit
            int r9 = r9 + r3
            int r3 = r12 >> 12
            r3 = r3 & r2
            r3 = r3 | r1
            byte r3 = (byte) r3
            r8[r9] = r3
            byte[] r3 = r7.data
            int r8 = r7.limit
            int r8 = r8 + r4
            int r4 = r12 >> 6
            r2 = r2 & r4
            r2 = r2 | r1
            byte r2 = (byte) r2
            r3[r8] = r2
            byte[] r2 = r7.data
            int r3 = r7.limit
            int r3 = r3 + r6
            r4 = r12 & 63
            r1 = r1 | r4
            byte r1 = (byte) r1
            r2[r3] = r1
            int r1 = r7.limit
            int r1 = r1 + r5
            r7.limit = r1
            long r1 = r11.size()
            r3 = 4
            long r1 = r1 + r3
            r11.setSize$okio(r1)
        Ld8:
            return r11
        Ld9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected code point: 0x"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = okio.SegmentedByteString.toHexString(r12)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final byte[] getHEX_DIGIT_BYTES() {
            byte[] r0 = okio.internal.Buffer.HEX_DIGIT_BYTES
            return r0
    }

    public static /* synthetic */ void getHEX_DIGIT_BYTES$annotations() {
            return
    }

    public static final boolean rangeEquals(okio.Segment r7, int r8, byte[] r9, int r10, int r11) {
            java.lang.String r0 = "segment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r7
            r1 = r8
            int r2 = r0.limit
            byte[] r3 = r0.data
            r4 = r10
        L11:
            if (r4 >= r11) goto L2e
            if (r1 != r2) goto L21
            okio.Segment r5 = r0.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r0 = r5
            byte[] r3 = r0.data
            int r1 = r0.pos
            int r2 = r0.limit
        L21:
            r5 = r3[r1]
            r6 = r9[r4]
            if (r5 == r6) goto L29
            r5 = 0
            return r5
        L29:
            int r1 = r1 + 1
            int r4 = r4 + 1
            goto L11
        L2e:
            r5 = 1
            return r5
    }

    public static final java.lang.String readUtf8Line(okio.Buffer r5, long r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L25
            long r3 = r6 - r1
            byte r0 = r5.getByte(r3)
            r3 = 13
            if (r0 != r3) goto L25
            long r0 = r6 - r1
            java.lang.String r0 = r5.readUtf8(r0)
            r1 = 2
            r5.skip(r1)
            goto L2d
        L25:
            java.lang.String r0 = r5.readUtf8(r6)
            r5.skip(r1)
        L2d:
            return r0
    }

    public static final <T> T seek(okio.Buffer r7, long r8, kotlin.jvm.functions.Function2<? super okio.Segment, ? super java.lang.Long, ? extends T> r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "lambda"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            okio.Segment r1 = r7.head
            if (r1 != 0) goto L1b
            r1 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            java.lang.Object r1 = r10.invoke(r2, r1)
            return r1
        L1b:
            long r2 = r7.size()
            long r2 = r2 - r8
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 >= 0) goto L43
            long r2 = r7.size()
        L28:
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 <= 0) goto L3a
            okio.Segment r4 = r1.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r1 = r4
            int r4 = r1.limit
            int r5 = r1.pos
            int r4 = r4 - r5
            long r4 = (long) r4
            long r2 = r2 - r4
            goto L28
        L3a:
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.lang.Object r4 = r10.invoke(r1, r4)
            return r4
        L43:
            r2 = 0
        L45:
            int r4 = r1.limit
            int r5 = r1.pos
            int r4 = r4 - r5
            long r4 = (long) r4
            long r4 = r4 + r2
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 > 0) goto L59
            okio.Segment r6 = r1.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r1 = r6
            r2 = r4
            goto L45
        L59:
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.lang.Object r4 = r10.invoke(r1, r4)
            return r4
    }

    public static final int selectPrefix(okio.Buffer r19, okio.Options r20, boolean r21) {
            r0 = r19
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "options"
            r2 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            okio.Segment r1 = r0.head
            r4 = -1
            if (r1 != 0) goto L19
            if (r21 == 0) goto L17
            r3 = -2
            goto L18
        L17:
            r3 = r4
        L18:
            return r3
        L19:
            r5 = r1
            byte[] r6 = r1.data
            int r7 = r1.pos
            int r8 = r1.limit
            int[] r9 = r20.getTrie$okio()
            r10 = 0
            r11 = -1
        L26:
            int r12 = r10 + 1
            r10 = r9[r10]
            int r13 = r12 + 1
            r12 = r9[r12]
            if (r12 == r4) goto L32
            r11 = r12
        L32:
            r14 = 0
            if (r5 != 0) goto L36
            goto L70
        L36:
            if (r10 >= 0) goto L89
            int r15 = r10 * (-1)
            int r4 = r13 + r15
        L3c:
            int r3 = r7 + 1
            r7 = r6[r7]
            r17 = 255(0xff, float:3.57E-43)
            r18 = 0
            r7 = r7 & r17
            int r0 = r13 + 1
            r13 = r9[r13]
            if (r7 == r13) goto L4f
            return r11
        L4f:
            if (r0 != r4) goto L53
            r13 = 1
            goto L54
        L53:
            r13 = 0
        L54:
            if (r3 != r8) goto L79
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            okio.Segment r2 = r5.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r5 = r2
            int r2 = r5.pos
            byte[] r6 = r5.data
            int r8 = r5.limit
            if (r5 != r1) goto L76
            if (r13 == 0) goto L6e
            r3 = 0
            r5 = r3
            r16 = -2
            goto L7c
        L6e:
            r13 = r0
            r7 = r2
        L70:
            if (r21 == 0) goto L75
            r16 = -2
            return r16
        L75:
            return r11
        L76:
            r16 = -2
            goto L7c
        L79:
            r16 = -2
            r2 = r3
        L7c:
            if (r13 == 0) goto L82
            r3 = r9[r0]
            r7 = r2
            goto Lc0
        L82:
            r13 = r0
            r7 = r2
            r0 = r19
            r2 = r20
            goto L3c
        L89:
            r16 = -2
            r0 = r10
            int r2 = r7 + 1
            r3 = r6[r7]
            r4 = 255(0xff, float:3.57E-43)
            r7 = 0
            r3 = r3 & r4
            int r4 = r13 + r0
        L97:
            if (r13 != r4) goto L9b
            return r11
        L9b:
            r7 = r9[r13]
            if (r3 != r7) goto Lcb
            int r7 = r13 + r0
            r7 = r9[r7]
            if (r2 != r8) goto Lbd
            okio.Segment r14 = r5.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r14)
            r5 = r14
            int r2 = r5.pos
            byte[] r6 = r5.data
            int r8 = r5.limit
            if (r5 != r1) goto Lb9
            r5 = 0
            r3 = r7
            r0 = r13
            r7 = r2
            goto Lc0
        Lb9:
            r3 = r7
            r0 = r13
            r7 = r2
            goto Lc0
        Lbd:
            r3 = r7
            r0 = r13
            r7 = r2
        Lc0:
            if (r3 < 0) goto Lc3
            return r3
        Lc3:
            int r10 = -r3
            r4 = -1
            r0 = r19
            r2 = r20
            goto L26
        Lcb:
            int r13 = r13 + 1
            goto L97
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

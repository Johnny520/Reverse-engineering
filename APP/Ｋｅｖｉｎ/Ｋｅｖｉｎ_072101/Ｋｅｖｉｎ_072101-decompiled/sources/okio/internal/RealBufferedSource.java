package okio.internal;

/* JADX INFO: renamed from: okio.internal.-RealBufferedSource, reason: invalid class name */
/* JADX INFO: compiled from: RealBufferedSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000j\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a%\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0080\b\u001a\u001d\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0080\b\u001a\u001d\u0010\r\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u000f\u001a\u00020\u0010*\u00020\u0002H\u0080\b\u001a-\u0010\u0011\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0080\b\u001a%\u0010\u0016\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0080\b\u001a\u001d\u0010\u0016\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u0010\u001a\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u001bH\u0080\b\u001a\r\u0010\u001c\u001a\u00020\b*\u00020\u0002H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u0018*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u001d\u001a\u00020\u0018*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u001e\u001a\u00020\f*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u001e\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u001f\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\u0015\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0080\b\u001a\u001d\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010!\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010\"\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\r\u0010#\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\r\u0010$\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010%\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010&\u001a\u00020'*\u00020\u0002H\u0080\b\u001a\r\u0010(\u001a\u00020'*\u00020\u0002H\u0080\b\u001a\r\u0010)\u001a\u00020**\u00020\u0002H\u0080\b\u001a\u0015\u0010)\u001a\u00020**\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010+\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\u000f\u0010,\u001a\u0004\u0018\u00010**\u00020\u0002H\u0080\b\u001a\u0015\u0010-\u001a\u00020**\u00020\u00022\u0006\u0010.\u001a\u00020\u0006H\u0080\b\u001a\u0015\u0010/\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u00100\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u00101\u001a\u00020\u0014*\u00020\u00022\u0006\u00102\u001a\u000203H\u0080\b\u001a\u0015\u00104\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u00105\u001a\u000206*\u00020\u0002H\u0080\b\u001a\r\u00107\u001a\u00020**\u00020\u0002H\u0080\b¨\u00068"}, m115d2 = {"commonClose", "", "Lokio/RealBufferedSource;", "commonExhausted", "", "commonIndexOf", "", "b", "", "fromIndex", "toIndex", "bytes", "Lokio/ByteString;", "commonIndexOfElement", "targetBytes", "commonPeek", "Lokio/BufferedSource;", "commonRangeEquals", "offset", "bytesOffset", "", "byteCount", "commonRead", "sink", "", "Lokio/Buffer;", "commonReadAll", "Lokio/Sink;", "commonReadByte", "commonReadByteArray", "commonReadByteString", "commonReadDecimalLong", "commonReadFully", "commonReadHexadecimalUnsignedLong", "commonReadInt", "commonReadIntLe", "commonReadLong", "commonReadLongLe", "commonReadShort", "", "commonReadShortLe", "commonReadUtf8", "", "commonReadUtf8CodePoint", "commonReadUtf8Line", "commonReadUtf8LineStrict", "limit", "commonRequest", "commonRequire", "commonSelect", "options", "Lokio/Options;", "commonSkip", "commonTimeout", "Lokio/Timeout;", "commonToString", "okio"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class RealBufferedSource {
    public static final void commonClose(okio.RealBufferedSource r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            boolean r1 = r3.closed
            if (r1 == 0) goto Lb
            return
        Lb:
            r1 = 1
            r3.closed = r1
            okio.Source r1 = r3.source
            r1.close()
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r1.clear()
            return
    }

    public static final boolean commonExhausted(okio.RealBufferedSource r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            boolean r1 = r5.closed
            if (r1 != 0) goto L2a
            r1 = r5
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            boolean r1 = r1.exhausted()
            if (r1 == 0) goto L28
            okio.Source r1 = r5.source
            r2 = r5
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r3 = 8192(0x2000, double:4.0474E-320)
            long r1 = r1.read(r2, r3)
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L28
            r1 = 1
            goto L29
        L28:
            r1 = 0
        L29:
            return r1
        L2a:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final long commonIndexOf(okio.RealBufferedSource r18, byte r19, long r20, long r22) {
            r0 = r18
            r1 = r20
            r9 = r22
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            r11 = 0
            boolean r3 = r0.closed
            if (r3 != 0) goto L8c
            r3 = 0
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r4 = 0
            if (r3 > 0) goto L1d
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 > 0) goto L1d
            r4 = 1
        L1d:
            if (r4 == 0) goto L64
            r12 = r1
        L20:
            int r3 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            r14 = -1
            if (r3 >= 0) goto L63
            r3 = r18
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            r4 = r19
            r5 = r12
            r7 = r22
            long r3 = r3.indexOf(r4, r5, r7)
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 == 0) goto L39
            return r3
        L39:
            r5 = r18
            r6 = 0
            okio.Buffer r5 = r5.bufferField
            long r5 = r5.size()
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 >= 0) goto L60
            okio.Source r7 = r0.source
            r8 = r18
            r16 = 0
            okio.Buffer r8 = r8.bufferField
            r16 = r3
            r3 = 8192(0x2000, double:4.0474E-320)
            long r3 = r7.read(r8, r3)
            int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r3 != 0) goto L5b
            goto L62
        L5b:
            long r12 = java.lang.Math.max(r12, r5)
            goto L20
        L60:
            r16 = r3
        L62:
            return r14
        L63:
            return r14
        L64:
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "fromIndex="
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r5 = " toIndex="
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r9)
            java.lang.String r3 = r4.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L8c:
            r3 = 0
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "closed"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public static final long commonIndexOf(okio.RealBufferedSource r15, okio.ByteString r16, long r17) {
            r0 = r15
            r1 = r16
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r2)
            java.lang.String r2 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            r3 = r17
            boolean r5 = r0.closed
            if (r5 != 0) goto L4c
        L14:
        L15:
            r5 = r15
            r6 = 0
            okio.Buffer r5 = r5.bufferField
            long r5 = r5.indexOf(r1, r3)
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L24
            return r5
        L24:
            r9 = r15
            r10 = 0
            okio.Buffer r9 = r9.bufferField
            long r9 = r9.size()
            okio.Source r11 = r0.source
            r12 = r15
            r13 = 0
            okio.Buffer r12 = r12.bufferField
            r13 = 8192(0x2000, double:4.0474E-320)
            long r11 = r11.read(r12, r13)
            int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r11 != 0) goto L3d
            return r7
        L3d:
            int r7 = r16.size()
            long r7 = (long) r7
            long r7 = r9 - r7
            r11 = 1
            long r7 = r7 + r11
            long r3 = java.lang.Math.max(r3, r7)
            goto L14
        L4c:
            r5 = 0
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "closed"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    public static final long commonIndexOfElement(okio.RealBufferedSource r15, okio.ByteString r16, long r17) {
            r0 = r15
            r1 = r16
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r2)
            java.lang.String r2 = "targetBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            r3 = r17
            boolean r5 = r0.closed
            if (r5 != 0) goto L42
        L14:
        L15:
            r5 = r15
            r6 = 0
            okio.Buffer r5 = r5.bufferField
            long r5 = r5.indexOfElement(r1, r3)
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L24
            return r5
        L24:
            r9 = r15
            r10 = 0
            okio.Buffer r9 = r9.bufferField
            long r9 = r9.size()
            okio.Source r11 = r0.source
            r12 = r15
            r13 = 0
            okio.Buffer r12 = r12.bufferField
            r13 = 8192(0x2000, double:4.0474E-320)
            long r11 = r11.read(r12, r13)
            int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r11 != 0) goto L3d
            return r7
        L3d:
            long r3 = java.lang.Math.max(r3, r9)
            goto L14
        L42:
            r5 = 0
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "closed"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    public static final okio.BufferedSource commonPeek(okio.RealBufferedSource r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            okio.PeekSource r1 = new okio.PeekSource
            r2 = r3
            okio.BufferedSource r2 = (okio.BufferedSource) r2
            r1.<init>(r2)
            okio.Source r1 = (okio.Source) r1
            okio.BufferedSource r1 = okio.Okio.buffer(r1)
            return r1
    }

    public static final boolean commonRangeEquals(okio.RealBufferedSource r7, long r8, okio.ByteString r10, int r11, int r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            boolean r1 = r7.closed
            if (r1 != 0) goto L48
            r1 = 0
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r2 = 0
            if (r1 < 0) goto L47
            if (r11 < 0) goto L47
            if (r12 < 0) goto L47
            int r1 = r10.size()
            int r1 = r1 - r11
            if (r1 >= r12) goto L22
            goto L47
        L22:
            r1 = 0
        L23:
            if (r1 >= r12) goto L45
            long r3 = (long) r1
            long r3 = r3 + r8
            r5 = 1
            long r5 = r5 + r3
            boolean r5 = r7.request(r5)
            if (r5 != 0) goto L31
            return r2
        L31:
            r5 = r7
            r6 = 0
            okio.Buffer r5 = r5.bufferField
            byte r5 = r5.getByte(r3)
            int r6 = r11 + r1
            byte r6 = r10.getByte(r6)
            if (r5 == r6) goto L42
            return r2
        L42:
            int r1 = r1 + 1
            goto L23
        L45:
            r1 = 1
            return r1
        L47:
            return r2
        L48:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final int commonRead(okio.RealBufferedSource r8, byte[] r9, int r10, int r11) {
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
            r1 = r8
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            long r1 = r1.size()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L34
            okio.Source r1 = r8.source
            r2 = r8
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r3 = 8192(0x2000, double:4.0474E-320)
            long r1 = r1.read(r2, r3)
            r3 = -1
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L34
            r3 = -1
            return r3
        L34:
            r1 = r8
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            long r1 = r1.size()
            r3 = 0
            long r4 = (long) r11
            long r4 = java.lang.Math.min(r4, r1)
            int r1 = (int) r4
            r2 = r8
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            int r2 = r2.read(r9, r10, r1)
            return r2
    }

    public static final long commonRead(okio.RealBufferedSource r6, okio.Buffer r7, long r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            r1 = 0
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 < 0) goto L13
            r3 = 1
            goto L14
        L13:
            r3 = 0
        L14:
            if (r3 == 0) goto L5c
            boolean r3 = r6.closed
            if (r3 != 0) goto L4e
            r3 = r6
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            long r3 = r3.size()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L39
            okio.Source r1 = r6.source
            r2 = r6
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r3 = 8192(0x2000, double:4.0474E-320)
            long r1 = r1.read(r2, r3)
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L39
            return r3
        L39:
            r1 = r6
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            long r1 = r1.size()
            long r1 = java.lang.Math.min(r8, r1)
            r3 = r6
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            long r3 = r3.read(r7, r1)
            return r3
        L4e:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L5c:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "byteCount < 0: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static final long commonReadAll(okio.RealBufferedSource r8, okio.Sink r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            r1 = 0
        Ld:
            okio.Source r3 = r8.source
            r4 = r8
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            r5 = 8192(0x2000, double:4.0474E-320)
            long r3 = r3.read(r4, r5)
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 0
            if (r3 == 0) goto L36
            r3 = r8
            r6 = 0
            okio.Buffer r3 = r3.bufferField
            long r6 = r3.completeSegmentByteCount()
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 <= 0) goto Ld
            long r1 = r1 + r6
            r3 = r8
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            r9.write(r3, r6)
            goto Ld
        L36:
            r3 = r8
            r6 = 0
            okio.Buffer r3 = r3.bufferField
            long r6 = r3.size()
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 <= 0) goto L5a
            r3 = r8
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            long r3 = r3.size()
            long r1 = r1 + r3
            r3 = r8
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            r4 = r8
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            long r4 = r4.size()
            r9.write(r3, r4)
        L5a:
            return r1
    }

    public static final byte commonReadByte(okio.RealBufferedSource r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1 = 1
            r3.require(r1)
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            byte r1 = r1.readByte()
            return r1
    }

    public static final byte[] commonReadByteArray(okio.RealBufferedSource r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            okio.Source r2 = r3.source
            r1.writeAll(r2)
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            byte[] r1 = r1.readByteArray()
            return r1
    }

    public static final byte[] commonReadByteArray(okio.RealBufferedSource r3, long r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r3.require(r4)
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            byte[] r1 = r1.readByteArray(r4)
            return r1
    }

    public static final okio.ByteString commonReadByteString(okio.RealBufferedSource r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            okio.Source r2 = r3.source
            r1.writeAll(r2)
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            okio.ByteString r1 = r1.readByteString()
            return r1
    }

    public static final okio.ByteString commonReadByteString(okio.RealBufferedSource r3, long r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r3.require(r4)
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            okio.ByteString r1 = r1.readByteString(r4)
            return r1
    }

    public static final long commonReadDecimalLong(okio.RealBufferedSource r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            r1 = 1
            r9.require(r1)
            r3 = 0
        Ld:
            long r5 = r3 + r1
            boolean r5 = r9.request(r5)
            if (r5 == 0) goto L63
            r5 = r9
            r6 = 0
            okio.Buffer r5 = r5.bufferField
            byte r5 = r5.getByte(r3)
            r6 = 48
            if (r5 < r6) goto L25
            r6 = 57
            if (r5 <= r6) goto L30
        L25:
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L32
            r8 = 45
            if (r5 == r8) goto L30
            goto L32
        L30:
            long r3 = r3 + r1
            goto Ld
        L32:
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 == 0) goto L37
            goto L63
        L37:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Expected a digit or '-' but was 0x"
            java.lang.StringBuilder r2 = r2.append(r6)
            r6 = 16
            int r6 = kotlin.text.CharsKt.checkRadix(r6)
            int r6 = kotlin.text.CharsKt.checkRadix(r6)
            java.lang.String r6 = java.lang.Integer.toString(r5, r6)
            java.lang.String r7 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L63:
            r1 = r9
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            long r1 = r1.readDecimalLong()
            return r1
    }

    public static final void commonReadFully(okio.RealBufferedSource r4, okio.Buffer r5, long r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            r4.require(r6)     // Catch: java.io.EOFException -> L17
            r1 = r4
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r1.readFully(r5, r6)
            return
        L17:
            r1 = move-exception
            r2 = r4
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            okio.Source r2 = (okio.Source) r2
            r5.writeAll(r2)
            throw r1
    }

    public static final void commonReadFully(okio.RealBufferedSource r7, byte[] r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            int r1 = r8.length     // Catch: java.io.EOFException -> L19
            long r1 = (long) r1     // Catch: java.io.EOFException -> L19
            r7.require(r1)     // Catch: java.io.EOFException -> L19
            r1 = r7
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r1.readFully(r8)
            return
        L19:
            r1 = move-exception
            r2 = 0
        L1b:
            r3 = r7
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            long r3 = r3.size()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L45
            r3 = r7
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            r4 = r7
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            long r4 = r4.size()
            int r4 = (int) r4
            int r3 = r3.read(r8, r2, r4)
            r4 = -1
            if (r3 == r4) goto L3f
            int r2 = r2 + r3
            goto L1b
        L3f:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L45:
            throw r1
    }

    public static final long commonReadHexadecimalUnsignedLong(okio.RealBufferedSource r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            r1 = 1
            r7.require(r1)
            r1 = 0
        Lc:
            int r2 = r1 + 1
            long r2 = (long) r2
            boolean r2 = r7.request(r2)
            if (r2 == 0) goto L6a
            r2 = r7
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            long r3 = (long) r1
            byte r2 = r2.getByte(r3)
            r3 = 48
            if (r2 < r3) goto L26
            r3 = 57
            if (r2 <= r3) goto L37
        L26:
            r3 = 97
            if (r2 < r3) goto L2e
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L37
        L2e:
            r3 = 65
            if (r2 < r3) goto L3b
            r3 = 70
            if (r2 <= r3) goto L37
            goto L3b
        L37:
            int r1 = r1 + 1
            goto Lc
        L3b:
            if (r1 == 0) goto L3e
            goto L6a
        L3e:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r4 = r4.append(r5)
            r5 = 16
            int r5 = kotlin.text.CharsKt.checkRadix(r5)
            int r5 = kotlin.text.CharsKt.checkRadix(r5)
            java.lang.String r5 = java.lang.Integer.toString(r2, r5)
            java.lang.String r6 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L6a:
            r2 = r7
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            long r2 = r2.readHexadecimalUnsignedLong()
            return r2
    }

    public static final int commonReadInt(okio.RealBufferedSource r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1 = 4
            r3.require(r1)
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            int r1 = r1.readInt()
            return r1
    }

    public static final int commonReadIntLe(okio.RealBufferedSource r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1 = 4
            r3.require(r1)
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            int r1 = r1.readIntLe()
            return r1
    }

    public static final long commonReadLong(okio.RealBufferedSource r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1 = 8
            r3.require(r1)
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            long r1 = r1.readLong()
            return r1
    }

    public static final long commonReadLongLe(okio.RealBufferedSource r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1 = 8
            r3.require(r1)
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            long r1 = r1.readLongLe()
            return r1
    }

    public static final short commonReadShort(okio.RealBufferedSource r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1 = 2
            r3.require(r1)
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            short r1 = r1.readShort()
            return r1
    }

    public static final short commonReadShortLe(okio.RealBufferedSource r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1 = 2
            r3.require(r1)
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            short r1 = r1.readShortLe()
            return r1
    }

    public static final java.lang.String commonReadUtf8(okio.RealBufferedSource r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            okio.Source r2 = r3.source
            r1.writeAll(r2)
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            java.lang.String r1 = r1.readUtf8()
            return r1
    }

    public static final java.lang.String commonReadUtf8(okio.RealBufferedSource r3, long r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r3.require(r4)
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            java.lang.String r1 = r1.readUtf8(r4)
            return r1
    }

    public static final int commonReadUtf8CodePoint(okio.RealBufferedSource r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            r1 = 1
            r4.require(r1)
            r1 = r4
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r2 = 0
            byte r1 = r1.getByte(r2)
            r2 = r1 & 224(0xe0, float:3.14E-43)
            r3 = 192(0xc0, float:2.69E-43)
            if (r2 != r3) goto L22
            r2 = 2
            r4.require(r2)
            goto L39
        L22:
            r2 = r1 & 240(0xf0, float:3.36E-43)
            r3 = 224(0xe0, float:3.14E-43)
            if (r2 != r3) goto L2e
            r2 = 3
            r4.require(r2)
            goto L39
        L2e:
            r2 = r1 & 248(0xf8, float:3.48E-43)
            r3 = 240(0xf0, float:3.36E-43)
            if (r2 != r3) goto L39
            r2 = 4
            r4.require(r2)
        L39:
            r2 = r4
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            int r2 = r2.readUtf8CodePoint()
            return r2
    }

    public static final java.lang.String commonReadUtf8Line(okio.RealBufferedSource r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            r1 = 10
            long r1 = r7.indexOf(r1)
            r3 = -1
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L2f
            r3 = r7
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            long r3 = r3.size()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L2d
            r3 = r7
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            long r3 = r3.size()
            java.lang.String r3 = r7.readUtf8(r3)
            goto L37
        L2d:
            r3 = 0
            goto L37
        L2f:
            r3 = r7
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            java.lang.String r3 = okio.internal.Buffer.readUtf8Line(r3, r1)
        L37:
            return r3
    }

    public static final java.lang.String commonReadUtf8LineStrict(okio.RealBufferedSource r22, long r23) {
            r6 = r22
            r7 = r23
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
            if (r0 == 0) goto Ld8
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            r12 = 1
            if (r0 != 0) goto L22
            r0 = r10
            goto L24
        L22:
            long r0 = r7 + r12
        L24:
            r14 = r0
            r1 = 10
            r2 = 0
            r0 = r22
            r4 = r14
            long r0 = r0.indexOf(r1, r2, r4)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L40
            r2 = r22
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            java.lang.String r2 = okio.internal.Buffer.readUtf8Line(r2, r0)
            return r2
        L40:
            int r2 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r2 >= 0) goto L77
            boolean r2 = r6.request(r14)
            if (r2 == 0) goto L77
            r2 = r22
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            long r3 = r14 - r12
            byte r2 = r2.getByte(r3)
            r3 = 13
            if (r2 != r3) goto L77
            long r12 = r12 + r14
            boolean r2 = r6.request(r12)
            if (r2 == 0) goto L77
            r2 = r22
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            byte r2 = r2.getByte(r14)
            r3 = 10
            if (r2 != r3) goto L77
            r2 = r22
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            java.lang.String r2 = okio.internal.Buffer.readUtf8Line(r2, r14)
            return r2
        L77:
            okio.Buffer r17 = new okio.Buffer
            r17.<init>()
            r2 = r22
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r3 = r22
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            long r3 = r3.size()
            r5 = 32
            r10 = 0
            long r11 = (long) r5
            long r20 = java.lang.Math.min(r11, r3)
            r18 = 0
            r16 = r2
            r16.copyTo(r17, r18, r20)
            java.io.EOFException r2 = new java.io.EOFException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "\\n not found: limit="
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r22
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            long r4 = r4.size()
            long r4 = java.lang.Math.min(r4, r7)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " content="
            java.lang.StringBuilder r3 = r3.append(r4)
            okio.ByteString r4 = r17.readByteString()
            java.lang.String r4 = r4.hex()
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = 8230(0x2026, float:1.1533E-41)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        Ld8:
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

    public static final boolean commonRequest(okio.RealBufferedSource r8, long r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            r1 = 0
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 < 0) goto L10
            r1 = r2
            goto L11
        L10:
            r1 = r3
        L11:
            if (r1 == 0) goto L45
            boolean r1 = r8.closed
            if (r1 != 0) goto L37
        L17:
            r1 = r8
            r4 = 0
            okio.Buffer r1 = r1.bufferField
            long r4 = r1.size()
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 >= 0) goto L36
            okio.Source r1 = r8.source
            r4 = r8
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            r5 = 8192(0x2000, double:4.0474E-320)
            long r4 = r1.read(r4, r5)
            r6 = -1
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L17
            return r3
        L36:
            return r2
        L37:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L45:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "byteCount < 0: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r9)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static final void commonRequire(okio.RealBufferedSource r2, long r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            boolean r1 = r2.request(r3)
            if (r1 == 0) goto Ld
            return
        Ld:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    public static final int commonSelect(okio.RealBufferedSource r7, okio.Options r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            boolean r1 = r7.closed
            if (r1 != 0) goto L44
        Lf:
        L10:
            r1 = r7
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r2 = 1
            int r1 = okio.internal.Buffer.selectPrefix(r1, r8, r2)
            r2 = -1
            switch(r1) {
                case -2: goto L31;
                case -1: goto L30;
                default: goto L1d;
            }
        L1d:
            okio.ByteString[] r2 = r8.getByteStrings$okio()
            r2 = r2[r1]
            int r2 = r2.size()
            r3 = r7
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            long r4 = (long) r2
            r3.skip(r4)
            return r1
        L30:
            return r2
        L31:
            okio.Source r3 = r7.source
            r4 = r7
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            r5 = 8192(0x2000, double:4.0474E-320)
            long r3 = r3.read(r4, r5)
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto Lf
            return r2
        L44:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final void commonSkip(okio.RealBufferedSource r7, long r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            r1 = r8
            boolean r3 = r7.closed
            if (r3 != 0) goto L4c
        Lb:
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L4b
            r5 = r7
            r6 = 0
            okio.Buffer r5 = r5.bufferField
            long r5 = r5.size()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 != 0) goto L36
            okio.Source r3 = r7.source
            r4 = r7
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            r5 = 8192(0x2000, double:4.0474E-320)
            long r3 = r3.read(r4, r5)
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L30
            goto L36
        L30:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
        L36:
            r3 = r7
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            long r3 = r3.size()
            long r3 = java.lang.Math.min(r1, r3)
            r5 = r7
            r6 = 0
            okio.Buffer r5 = r5.bufferField
            r5.skip(r3)
            long r1 = r1 - r3
            goto Lb
        L4b:
            return
        L4c:
            r3 = 0
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "closed"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public static final okio.Timeout commonTimeout(okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            okio.Source r1 = r2.source
            okio.Timeout r1 = r1.timeout()
            return r1
    }

    public static final java.lang.String commonToString(okio.RealBufferedSource r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "buffer("
            java.lang.StringBuilder r1 = r1.append(r2)
            okio.Source r2 = r3.source
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 41
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }
}

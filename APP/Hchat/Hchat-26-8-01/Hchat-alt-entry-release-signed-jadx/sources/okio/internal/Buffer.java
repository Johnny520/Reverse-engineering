package okio.internal;

import bsh.org.objectweb.asm.Opcodes;
import com.alibaba.fastjson2.JSONB;
import java.io.EOFException;
import okhttp3.HttpUrl;
import okhttp3.internal.connection.RealConnection;
import okio.Buffer;
import okio.ByteString;
import okio.C3193a;
import okio.C6147SegmentedByteString;
import okio.Options;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Source;
import okio.Utf8;
import okio._JvmPlatformKt;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p222p.AbstractC3199a;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: okio.internal.-Buffer, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Buffer {
    private static final byte[] HEX_DIGIT_BYTES = _JvmPlatformKt.asUtf8ToByteArray("0123456789abcdef");
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void commonClear(okio.Buffer buffer) throws EOFException {
        buffer.getClass();
        buffer.skip(buffer.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void commonClose(Buffer.UnsafeCursor unsafeCursor) {
        unsafeCursor.getClass();
        if (unsafeCursor.buffer == null) {
            C2104o.m5276A("not attached to a buffer");
            return;
        }
        unsafeCursor.buffer = null;
        unsafeCursor.setSegment$okio(null);
        unsafeCursor.offset = -1L;
        unsafeCursor.data = null;
        unsafeCursor.start = -1;
        unsafeCursor.end = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long commonCompleteSegmentByteCount(okio.Buffer buffer) {
        buffer.getClass();
        long size = buffer.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = buffer.head;
        segment.getClass();
        Segment segment2 = segment.prev;
        segment2.getClass();
        int i9 = segment2.limit;
        return (i9 >= 8192 || !segment2.owner) ? size : size - ((long) (i9 - segment2.pos));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final okio.Buffer commonCopy(okio.Buffer buffer) {
        buffer.getClass();
        okio.Buffer buffer2 = new okio.Buffer();
        if (buffer.size() == 0) {
            return buffer2;
        }
        Segment segment = buffer.head;
        segment.getClass();
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer2.head = segmentSharedCopy;
        segmentSharedCopy.prev = segmentSharedCopy;
        segmentSharedCopy.next = segmentSharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            segment3.getClass();
            segment2.getClass();
            segment3.push(segment2.sharedCopy());
        }
        buffer2.setSize$okio(buffer.size());
        return buffer2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final okio.Buffer commonCopyTo(okio.Buffer buffer, okio.Buffer buffer2, long j3, long j4) {
        buffer.getClass();
        buffer2.getClass();
        long j5 = j3;
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j5, j4);
        if (j4 != 0) {
            buffer2.setSize$okio(buffer2.size() + j4);
            Segment segment = buffer.head;
            while (true) {
                segment.getClass();
                int i9 = segment.limit;
                int i10 = segment.pos;
                if (j5 < i9 - i10) {
                    break;
                }
                j5 -= (long) (i9 - i10);
                segment = segment.next;
            }
            Segment segment2 = segment;
            long j10 = j4;
            while (j10 > 0) {
                segment2.getClass();
                Segment segmentSharedCopy = segment2.sharedCopy();
                int i11 = segmentSharedCopy.pos + ((int) j5);
                segmentSharedCopy.pos = i11;
                segmentSharedCopy.limit = Math.min(i11 + ((int) j10), segmentSharedCopy.limit);
                Segment segment3 = buffer2.head;
                if (segment3 == null) {
                    segmentSharedCopy.prev = segmentSharedCopy;
                    segmentSharedCopy.next = segmentSharedCopy;
                    buffer2.head = segmentSharedCopy;
                } else {
                    segment3.getClass();
                    Segment segment4 = segment3.prev;
                    segment4.getClass();
                    segment4.push(segmentSharedCopy);
                }
                j10 -= (long) (segmentSharedCopy.limit - segmentSharedCopy.pos);
                segment2 = segment2.next;
                j5 = 0;
            }
        }
        return buffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean commonEquals(okio.Buffer buffer, Object obj) {
        buffer.getClass();
        if (buffer == obj) {
            return true;
        }
        if (!(obj instanceof okio.Buffer)) {
            return false;
        }
        okio.Buffer buffer2 = (okio.Buffer) obj;
        if (buffer.size() != buffer2.size()) {
            return false;
        }
        if (buffer.size() == 0) {
            return true;
        }
        Segment segment = buffer.head;
        segment.getClass();
        Segment segment2 = buffer2.head;
        segment2.getClass();
        int i9 = segment.pos;
        int i10 = segment2.pos;
        long j3 = 0;
        while (j3 < buffer.size()) {
            long jMin = Math.min(segment.limit - i9, segment2.limit - i10);
            long j4 = 0;
            while (j4 < jMin) {
                int i11 = i9 + 1;
                int i12 = i10 + 1;
                if (segment.data[i9] != segment2.data[i10]) {
                    return false;
                }
                j4++;
                i9 = i11;
                i10 = i12;
            }
            if (i9 == segment.limit) {
                segment = segment.next;
                segment.getClass();
                i9 = segment.pos;
            }
            if (i10 == segment2.limit) {
                segment2 = segment2.next;
                segment2.getClass();
                i10 = segment2.pos;
            }
            j3 += jMin;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long commonExpandBuffer(Buffer.UnsafeCursor unsafeCursor, int i9) {
        unsafeCursor.getClass();
        if (i9 <= 0) {
            C2104o.m5291q(AbstractC0921a.m2249l(i9, "minByteCount <= 0: "));
            return 0L;
        }
        if (i9 > 8192) {
            C2104o.m5291q(AbstractC0921a.m2249l(i9, "minByteCount > Segment.SIZE: "));
            return 0L;
        }
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            C2104o.m5276A("not attached to a buffer");
            return 0L;
        }
        if (!unsafeCursor.readWrite) {
            C2104o.m5276A("expandBuffer() only permitted for read/write buffers");
            return 0L;
        }
        long size = buffer.size();
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i9);
        int i10 = 8192 - segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = 8192;
        long j3 = i10;
        buffer.setSize$okio(size + j3);
        unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
        unsafeCursor.offset = size;
        unsafeCursor.data = segmentWritableSegment$okio.data;
        unsafeCursor.start = 8192 - i10;
        unsafeCursor.end = 8192;
        return j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final byte commonGet(okio.Buffer buffer, long j3) {
        buffer.getClass();
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j3, 1L);
        Segment segment = buffer.head;
        segment.getClass();
        if (buffer.size() - j3 < j3) {
            long size = buffer.size();
            while (size > j3) {
                segment = segment.prev;
                segment.getClass();
                size -= (long) (segment.limit - segment.pos);
            }
            return segment.data[(int) ((((long) segment.pos) + j3) - size)];
        }
        long j4 = 0;
        while (true) {
            int i9 = segment.limit;
            int i10 = segment.pos;
            long j5 = ((long) (i9 - i10)) + j4;
            if (j5 > j3) {
                return segment.data[(int) ((((long) i10) + j3) - j4)];
            }
            segment = segment.next;
            segment.getClass();
            j4 = j5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int commonHashCode(okio.Buffer buffer) {
        buffer.getClass();
        Segment segment = buffer.head;
        if (segment == null) {
            return 0;
        }
        int i9 = 1;
        do {
            int i10 = segment.limit;
            for (int i11 = segment.pos; i11 < i10; i11++) {
                i9 = (i9 * 31) + segment.data[i11];
            }
            segment = segment.next;
            segment.getClass();
        } while (segment != buffer.head);
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long commonIndexOf(okio.Buffer buffer, ByteString byteString, long j3) {
        long j4 = j3;
        buffer.getClass();
        byteString.getClass();
        if (byteString.size() <= 0) {
            C2104o.m5294t("bytes is empty");
            return 0L;
        }
        long j5 = 0;
        if (j4 < 0) {
            C2104o.m5291q(AbstractC0255e.m1018g(j4, "fromIndex < 0: "));
            return 0L;
        }
        Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j4 < j4) {
            long size = buffer.size();
            while (size > j4) {
                segment = segment.prev;
                segment.getClass();
                size -= (long) (segment.limit - segment.pos);
            }
            byte[] bArrInternalArray$okio = byteString.internalArray$okio();
            byte b10 = bArrInternalArray$okio[0];
            int size2 = byteString.size();
            long size3 = (buffer.size() - ((long) size2)) + 1;
            while (size < size3) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + size3) - size);
                for (int i9 = (int) ((((long) segment.pos) + j4) - size); i9 < iMin; i9++) {
                    if (bArr[i9] == b10 && rangeEquals(segment, i9 + 1, bArrInternalArray$okio, 1, size2)) {
                        return ((long) (i9 - segment.pos)) + size;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                segment.getClass();
                j4 = size;
            }
            return -1L;
        }
        while (true) {
            long j10 = ((long) (segment.limit - segment.pos)) + j5;
            if (j10 > j4) {
                break;
            }
            segment = segment.next;
            segment.getClass();
            j5 = j10;
        }
        byte[] bArrInternalArray$okio2 = byteString.internalArray$okio();
        byte b11 = bArrInternalArray$okio2[0];
        int size4 = byteString.size();
        long size5 = (buffer.size() - ((long) size4)) + 1;
        while (j5 < size5) {
            byte[] bArr2 = segment.data;
            long j11 = size5;
            int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + size5) - j5);
            for (int i10 = (int) ((((long) segment.pos) + j4) - j5); i10 < iMin2; i10++) {
                if (bArr2[i10] == b11 && rangeEquals(segment, i10 + 1, bArrInternalArray$okio2, 1, size4)) {
                    return ((long) (i10 - segment.pos)) + j5;
                }
            }
            j5 += (long) (segment.limit - segment.pos);
            segment = segment.next;
            segment.getClass();
            size5 = j11;
            j4 = j5;
        }
        return -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long commonIndexOfElement(okio.Buffer buffer, ByteString byteString, long j3) {
        buffer.getClass();
        byteString.getClass();
        long j4 = 0;
        if (j3 < 0) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "fromIndex < 0: "));
            return 0L;
        }
        Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j3 < j3) {
            long size = buffer.size();
            while (size > j3) {
                segment = segment.prev;
                segment.getClass();
                size -= (long) (segment.limit - segment.pos);
            }
            if (byteString.size() == 2) {
                byte b10 = byteString.getByte(0);
                byte b11 = byteString.getByte(1);
                while (size < buffer.size()) {
                    byte[] bArr = segment.data;
                    int i9 = segment.limit;
                    for (int i10 = (int) ((((long) segment.pos) + j3) - size); i10 < i9; i10++) {
                        byte b12 = bArr[i10];
                        if (b12 == b10 || b12 == b11) {
                            return ((long) (i10 - segment.pos)) + size;
                        }
                    }
                    size += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    segment.getClass();
                    j3 = size;
                }
            } else {
                byte[] bArrInternalArray$okio = byteString.internalArray$okio();
                while (size < buffer.size()) {
                    byte[] bArr2 = segment.data;
                    int i11 = segment.limit;
                    for (int i12 = (int) ((((long) segment.pos) + j3) - size); i12 < i11; i12++) {
                        byte b13 = bArr2[i12];
                        for (byte b14 : bArrInternalArray$okio) {
                            if (b13 == b14) {
                                return ((long) (i12 - segment.pos)) + size;
                            }
                        }
                    }
                    size += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    segment.getClass();
                    j3 = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (segment.limit - segment.pos)) + j4;
            if (j5 > j3) {
                break;
            }
            segment = segment.next;
            segment.getClass();
            j4 = j5;
        }
        if (byteString.size() == 2) {
            byte b15 = byteString.getByte(0);
            byte b16 = byteString.getByte(1);
            while (j4 < buffer.size()) {
                byte[] bArr3 = segment.data;
                int i13 = segment.limit;
                for (int i14 = (int) ((((long) segment.pos) + j3) - j4); i14 < i13; i14++) {
                    byte b17 = bArr3[i14];
                    if (b17 == b15 || b17 == b16) {
                        return ((long) (i14 - segment.pos)) + j4;
                    }
                }
                j4 += (long) (segment.limit - segment.pos);
                segment = segment.next;
                segment.getClass();
                j3 = j4;
            }
        } else {
            byte[] bArrInternalArray$okio2 = byteString.internalArray$okio();
            while (j4 < buffer.size()) {
                byte[] bArr4 = segment.data;
                int i15 = segment.limit;
                for (int i16 = (int) ((((long) segment.pos) + j3) - j4); i16 < i15; i16++) {
                    byte b18 = bArr4[i16];
                    for (byte b19 : bArrInternalArray$okio2) {
                        if (b18 == b19) {
                            return ((long) (i16 - segment.pos)) + j4;
                        }
                    }
                }
                j4 += (long) (segment.limit - segment.pos);
                segment = segment.next;
                segment.getClass();
                j3 = j4;
            }
        }
        return -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int commonNext(Buffer.UnsafeCursor unsafeCursor) {
        unsafeCursor.getClass();
        long j3 = unsafeCursor.offset;
        okio.Buffer buffer = unsafeCursor.buffer;
        buffer.getClass();
        if (j3 != buffer.size()) {
            long j4 = unsafeCursor.offset;
            return j4 == -1 ? unsafeCursor.seek(0L) : unsafeCursor.seek(j4 + ((long) (unsafeCursor.end - unsafeCursor.start)));
        }
        C2104o.m5276A("no more bytes");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean commonRangeEquals(okio.Buffer buffer, long j3, ByteString byteString, int i9, int i10) {
        buffer.getClass();
        byteString.getClass();
        if (j3 < 0 || i9 < 0 || i10 < 0 || buffer.size() - j3 < i10 || byteString.size() - i9 < i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (buffer.getByte(((long) i11) + j3) != byteString.getByte(i9 + i11)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int commonRead(okio.Buffer buffer, byte[] bArr, int i9, int i10) {
        buffer.getClass();
        bArr.getClass();
        SegmentedByteString.checkOffsetAndCount(bArr.length, i9, i10);
        Segment segment = buffer.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i10, segment.limit - segment.pos);
        byte[] bArr2 = segment.data;
        int i11 = segment.pos;
        AbstractC4165l.m8380o0(bArr2, i9, i11, bArr, i11 + iMin);
        segment.pos += iMin;
        buffer.setSize$okio(buffer.size() - ((long) iMin));
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long commonReadAll(okio.Buffer buffer, Sink sink) {
        buffer.getClass();
        sink.getClass();
        long size = buffer.size();
        if (size > 0) {
            sink.write(buffer, size);
        }
        return size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Buffer.UnsafeCursor commonReadAndWriteUnsafe(okio.Buffer buffer, Buffer.UnsafeCursor unsafeCursor) {
        buffer.getClass();
        unsafeCursor.getClass();
        Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            C2104o.m5276A("already attached to a buffer");
            return null;
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = true;
        return unsafeCursorResolveDefaultParameter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final byte commonReadByte(okio.Buffer buffer) throws EOFException {
        buffer.getClass();
        if (buffer.size() == 0) {
            C2104o.m5277a();
            return (byte) 0;
        }
        Segment segment = buffer.head;
        segment.getClass();
        int i9 = segment.pos;
        int i10 = segment.limit;
        int i11 = i9 + 1;
        byte b10 = segment.data[i9];
        buffer.setSize$okio(buffer.size() - 1);
        if (i11 != i10) {
            segment.pos = i11;
            return b10;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return b10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final byte[] commonReadByteArray(okio.Buffer buffer, long j3) throws EOFException {
        buffer.getClass();
        if (j3 < 0 || j3 > 2147483647L) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "byteCount: "));
            return null;
        }
        if (buffer.size() < j3) {
            C2104o.m5277a();
            return null;
        }
        byte[] bArr = new byte[(int) j3];
        buffer.readFully(bArr);
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ByteString commonReadByteString(okio.Buffer buffer, long j3) throws EOFException {
        buffer.getClass();
        if (j3 < 0 || j3 > 2147483647L) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "byteCount: "));
            return null;
        }
        if (buffer.size() < j3) {
            C2104o.m5277a();
            return null;
        }
        if (j3 < 4096) {
            return new ByteString(buffer.readByteArray(j3));
        }
        ByteString byteStringSnapshot = buffer.snapshot((int) j3);
        buffer.skip(j3);
        return byteStringSnapshot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        r0 = new okio.Buffer().writeDecimalLong(r8).writeByte((int) r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        r0.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        p136j8.C2104o.m5296v(r0.readUtf8(), "Number too large: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long commonReadDecimalLong(okio.Buffer buffer) throws EOFException {
        long j3;
        buffer.getClass();
        long j4 = 0;
        if (buffer.size() == 0) {
            C2104o.m5277a();
            return 0L;
        }
        int i9 = 0;
        boolean z9 = false;
        long j5 = 0;
        long j10 = -7;
        boolean z10 = false;
        loop0: while (true) {
            Segment segment = buffer.head;
            segment.getClass();
            byte[] bArr = segment.data;
            int i10 = segment.pos;
            int i11 = segment.limit;
            while (i10 < i11) {
                byte b10 = bArr[i10];
                if (b10 >= 48 && b10 <= 57) {
                    int i12 = 48 - b10;
                    if (j5 < OVERFLOW_ZONE) {
                        break loop0;
                    }
                    j3 = j4;
                    if (j5 == OVERFLOW_ZONE && i12 < j10) {
                        break loop0;
                    }
                    j5 = (j5 * 10) + ((long) i12);
                } else {
                    j3 = j4;
                    if (b10 != 45 || i9 != 0) {
                        z10 = true;
                        break;
                    }
                    j10--;
                    z9 = true;
                }
                i10++;
                i9++;
                j4 = j3;
            }
            j3 = j4;
            if (i10 == i11) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i10;
            }
            if (z10 || buffer.head == null) {
                break;
            }
            j4 = j3;
        }
        buffer.setSize$okio(buffer.size() - ((long) i9));
        if (i9 >= (z9 ? 2 : 1)) {
            return z9 ? j5 : -j5;
        }
        if (buffer.size() == j3) {
            C2104o.m5277a();
            return 0L;
        }
        StringBuilder sbM1025n = AbstractC0255e.m1025n(z9 ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
        sbM1025n.append(SegmentedByteString.toHexString(buffer.getByte(j3)));
        throw new NumberFormatException(sbM1025n.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void commonReadFully(okio.Buffer buffer, okio.Buffer buffer2, long j3) throws EOFException {
        buffer.getClass();
        buffer2.getClass();
        if (buffer.size() >= j3) {
            buffer2.write(buffer, j3);
        } else {
            buffer2.write(buffer, buffer.size());
            C2104o.m5277a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a A[EDGE_INSN: B:42:0x008a->B:37:0x008a BREAK  A[LOOP:0: B:5:0x0010->B:44:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long commonReadHexadecimalUnsignedLong(okio.Buffer buffer) throws EOFException {
        int i9;
        buffer.getClass();
        if (buffer.size() == 0) {
            C2104o.m5277a();
            return 0L;
        }
        int i10 = 0;
        boolean z9 = false;
        long j3 = 0;
        do {
            Segment segment = buffer.head;
            segment.getClass();
            byte[] bArr = segment.data;
            int i11 = segment.pos;
            int i12 = segment.limit;
            while (i11 < i12) {
                byte b10 = bArr[i11];
                if (b10 >= 48 && b10 <= 57) {
                    i9 = b10 + JSONB.Constants.BC_INT64_BYTE_ZERO;
                } else if (b10 >= 97 && b10 <= 102) {
                    i9 = b10 + JSONB.Constants.BC_LOCAL_DATE;
                } else if (b10 >= 65 && b10 <= 70) {
                    i9 = b10 - 55;
                } else {
                    if (i10 == 0) {
                        C2104o.m5296v(SegmentedByteString.toHexString(b10), "Expected leading [0-9a-fA-F] character but was 0x");
                        return 0L;
                    }
                    z9 = true;
                    if (i11 != i12) {
                        buffer.head = segment.pop();
                        SegmentPool.recycle(segment);
                    } else {
                        segment.pos = i11;
                    }
                    if (!z9) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j3) != 0) {
                    C2104o.m5296v(new okio.Buffer().writeHexadecimalUnsignedLong(j3).writeByte((int) b10).readUtf8(), "Number too large: ");
                    return 0L;
                }
                j3 = (j3 << 4) | ((long) i9);
                i11++;
                i10++;
            }
            if (i11 != i12) {
            }
            if (!z9) {
            }
        } while (buffer.head != null);
        buffer.setSize$okio(buffer.size() - ((long) i10));
        return j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int commonReadInt(okio.Buffer buffer) throws EOFException {
        buffer.getClass();
        if (buffer.size() < 4) {
            C2104o.m5277a();
            return 0;
        }
        Segment segment = buffer.head;
        segment.getClass();
        int i9 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i9 < 4) {
            return (buffer.readByte() & 255) | ((buffer.readByte() & 255) << 24) | ((buffer.readByte() & 255) << 16) | ((buffer.readByte() & 255) << 8);
        }
        byte[] bArr = segment.data;
        int i11 = i9 + 3;
        int i12 = ((bArr[i9 + 1] & 255) << 16) | ((bArr[i9] & 255) << 24) | ((bArr[i9 + 2] & 255) << 8);
        int i13 = i9 + 4;
        int i14 = (bArr[i11] & 255) | i12;
        buffer.setSize$okio(buffer.size() - 4);
        if (i13 != i10) {
            segment.pos = i13;
            return i14;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return i14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long commonReadLong(okio.Buffer buffer) throws EOFException {
        buffer.getClass();
        if (buffer.size() < 8) {
            C2104o.m5277a();
            return 0L;
        }
        Segment segment = buffer.head;
        segment.getClass();
        int i9 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i9 < 8) {
            return ((((long) buffer.readInt()) & 4294967295L) << 32) | (4294967295L & ((long) buffer.readInt()));
        }
        byte[] bArr = segment.data;
        int i11 = i9 + 7;
        long j3 = ((((long) bArr[i9]) & 255) << 56) | ((((long) bArr[i9 + 1]) & 255) << 48) | ((((long) bArr[i9 + 2]) & 255) << 40) | ((((long) bArr[i9 + 3]) & 255) << 32) | ((((long) bArr[i9 + 4]) & 255) << 24) | ((((long) bArr[i9 + 5]) & 255) << 16) | ((((long) bArr[i9 + 6]) & 255) << 8);
        int i12 = i9 + 8;
        long j4 = j3 | (((long) bArr[i11]) & 255);
        buffer.setSize$okio(buffer.size() - 8);
        if (i12 != i10) {
            segment.pos = i12;
            return j4;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final short commonReadShort(okio.Buffer buffer) throws EOFException {
        buffer.getClass();
        if (buffer.size() < 2) {
            C2104o.m5277a();
            return (short) 0;
        }
        Segment segment = buffer.head;
        segment.getClass();
        int i9 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i9 < 2) {
            return (short) ((buffer.readByte() & 255) | ((buffer.readByte() & 255) << 8));
        }
        byte[] bArr = segment.data;
        int i11 = i9 + 1;
        int i12 = (bArr[i9] & 255) << 8;
        int i13 = i9 + 2;
        int i14 = (bArr[i11] & 255) | i12;
        buffer.setSize$okio(buffer.size() - 2);
        if (i13 == i10) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i13;
        }
        return (short) i14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Buffer.UnsafeCursor commonReadUnsafe(okio.Buffer buffer, Buffer.UnsafeCursor unsafeCursor) {
        buffer.getClass();
        unsafeCursor.getClass();
        Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            C2104o.m5276A("already attached to a buffer");
            return null;
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = false;
        return unsafeCursorResolveDefaultParameter;
    }

    /* JADX DEBUG: Class process forced to load method for inline: okio.internal._Utf8Kt.commonToUtf8String$default(byte[], int, int, int, java.lang.Object):java.lang.String */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String commonReadUtf8(okio.Buffer buffer, long j3) throws EOFException {
        buffer.getClass();
        if (j3 < 0 || j3 > 2147483647L) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "byteCount: "));
            return null;
        }
        if (buffer.size() < j3) {
            C2104o.m5277a();
            return null;
        }
        if (j3 == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Segment segment = buffer.head;
        segment.getClass();
        int i9 = segment.pos;
        if (((long) i9) + j3 > segment.limit) {
            return _Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j3), 0, 0, 3, null);
        }
        int i10 = (int) j3;
        String strCommonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i9, i9 + i10);
        segment.pos += i10;
        buffer.setSize$okio(buffer.size() - j3);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return strCommonToUtf8String;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int commonReadUtf8CodePoint(okio.Buffer buffer) throws EOFException {
        int i9;
        int i10;
        int i11;
        buffer.getClass();
        if (buffer.size() == 0) {
            C2104o.m5277a();
            return 0;
        }
        byte b10 = buffer.getByte(0L);
        if ((b10 & 128) == 0) {
            i9 = b10 & JSONB.Constants.BC_SYMBOL;
            i11 = 0;
            i10 = 1;
        } else if ((b10 & 224) == 192) {
            i9 = b10 & 31;
            i10 = 2;
            i11 = 128;
        } else if ((b10 & JSONB.Constants.BC_INT32_NUM_MIN) == 224) {
            i9 = b10 & 15;
            i10 = 3;
            i11 = Opcodes.ACC_STRICT;
        } else {
            if ((b10 & 248) != 240) {
                buffer.skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i9 = b10 & 7;
            i10 = 4;
            i11 = 65536;
        }
        long j3 = i10;
        if (buffer.size() < j3) {
            StringBuilder sbM2257t = AbstractC0921a.m2257t(i10, "size < ", ": ");
            sbM2257t.append(buffer.size());
            sbM2257t.append(" (to read code point prefixed 0x");
            sbM2257t.append(SegmentedByteString.toHexString(b10));
            sbM2257t.append(')');
            throw new EOFException(sbM2257t.toString());
        }
        for (int i12 = 1; i12 < i10; i12++) {
            long j4 = i12;
            byte b11 = buffer.getByte(j4);
            if ((b11 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                buffer.skip(j4);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i9 = (i9 << 6) | (b11 & 63);
        }
        buffer.skip(j3);
        return i9 > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 > i9 || i9 >= 57344) && i9 >= i11) ? i9 : Utf8.REPLACEMENT_CODE_POINT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String commonReadUtf8Line(okio.Buffer buffer) {
        buffer.getClass();
        long jIndexOf = buffer.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (buffer.size() != 0) {
            return buffer.readUtf8(buffer.size());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String commonReadUtf8LineStrict(okio.Buffer buffer, long j3) throws EOFException {
        buffer.getClass();
        if (j3 < 0) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "limit < 0: "));
            return null;
        }
        long j4 = j3 != Long.MAX_VALUE ? j3 + 1 : Long.MAX_VALUE;
        long jIndexOf = buffer.indexOf((byte) 10, 0L, j4);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (j4 < buffer.size() && buffer.getByte(j4 - 1) == 13 && buffer.getByte(j4) == 10) {
            return readUtf8Line(buffer, j4);
        }
        okio.Buffer buffer2 = new okio.Buffer();
        buffer.copyTo(buffer2, 0L, Math.min(32, buffer.size()));
        C2104o.m5282g(buffer2.readByteString().hex(), Math.min(buffer.size(), j3));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long commonResizeBuffer(Buffer.UnsafeCursor unsafeCursor, long j3) {
        unsafeCursor.getClass();
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            C2104o.m5276A("not attached to a buffer");
            return 0L;
        }
        if (!unsafeCursor.readWrite) {
            C2104o.m5276A("resizeBuffer() only permitted for read/write buffers");
            return 0L;
        }
        long size = buffer.size();
        if (j3 <= size) {
            if (j3 < 0) {
                C2104o.m5291q(AbstractC0255e.m1018g(j3, "newSize < 0: "));
                return 0L;
            }
            long j4 = size - j3;
            while (true) {
                if (j4 <= 0) {
                    break;
                }
                Segment segment = buffer.head;
                segment.getClass();
                Segment segment2 = segment.prev;
                segment2.getClass();
                int i9 = segment2.limit;
                long j5 = i9 - segment2.pos;
                if (j5 > j4) {
                    segment2.limit = i9 - ((int) j4);
                    break;
                }
                buffer.head = segment2.pop();
                SegmentPool.recycle(segment2);
                j4 -= j5;
            }
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j3;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
        } else if (j3 > size) {
            long j10 = j3 - size;
            boolean z9 = true;
            while (j10 > 0) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                int iMin = (int) Math.min(j10, 8192 - segmentWritableSegment$okio.limit);
                segmentWritableSegment$okio.limit += iMin;
                j10 -= (long) iMin;
                if (z9) {
                    unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
                    unsafeCursor.offset = size;
                    unsafeCursor.data = segmentWritableSegment$okio.data;
                    int i10 = segmentWritableSegment$okio.limit;
                    unsafeCursor.start = i10 - iMin;
                    unsafeCursor.end = i10;
                    z9 = false;
                }
            }
        }
        buffer.setSize$okio(j3);
        return size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int commonSeek(Buffer.UnsafeCursor unsafeCursor, long j3) {
        Segment segmentPush;
        unsafeCursor.getClass();
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            C2104o.m5276A("not attached to a buffer");
            return 0;
        }
        if (j3 < -1 || j3 > buffer.size()) {
            StringBuilder sbM6842o = AbstractC3199a.m6842o(j3, "offset=", " > size=");
            sbM6842o.append(buffer.size());
            throw new ArrayIndexOutOfBoundsException(sbM6842o.toString());
        }
        if (j3 == -1 || j3 == buffer.size()) {
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j3;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
            return -1;
        }
        long size = buffer.size();
        Segment segment$okio = buffer.head;
        long j4 = 0;
        if (unsafeCursor.getSegment$okio() != null) {
            long j5 = unsafeCursor.offset;
            int i9 = unsafeCursor.start;
            Segment segment$okio2 = unsafeCursor.getSegment$okio();
            segment$okio2.getClass();
            long j10 = j5 - ((long) (i9 - segment$okio2.pos));
            if (j10 > j3) {
                segmentPush = segment$okio;
                segment$okio = unsafeCursor.getSegment$okio();
                size = j10;
            } else {
                segmentPush = unsafeCursor.getSegment$okio();
                j4 = j10;
            }
        } else {
            segmentPush = segment$okio;
        }
        if (size - j3 > j3 - j4) {
            while (true) {
                segmentPush.getClass();
                int i10 = segmentPush.limit;
                int i11 = segmentPush.pos;
                if (j3 < ((long) (i10 - i11)) + j4) {
                    break;
                }
                j4 += (long) (i10 - i11);
                segmentPush = segmentPush.next;
            }
        } else {
            while (size > j3) {
                segment$okio.getClass();
                segment$okio = segment$okio.prev;
                segment$okio.getClass();
                size -= (long) (segment$okio.limit - segment$okio.pos);
            }
            j4 = size;
            segmentPush = segment$okio;
        }
        if (unsafeCursor.readWrite) {
            segmentPush.getClass();
            if (segmentPush.shared) {
                Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                if (buffer.head == segmentPush) {
                    buffer.head = segmentUnsharedCopy;
                }
                segmentPush = segmentPush.push(segmentUnsharedCopy);
                Segment segment = segmentPush.prev;
                segment.getClass();
                segment.pop();
            }
        }
        unsafeCursor.setSegment$okio(segmentPush);
        unsafeCursor.offset = j3;
        segmentPush.getClass();
        unsafeCursor.data = segmentPush.data;
        int i12 = segmentPush.pos + ((int) (j3 - j4));
        unsafeCursor.start = i12;
        int i13 = segmentPush.limit;
        unsafeCursor.end = i13;
        return i13 - i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int commonSelect(okio.Buffer buffer, Options options) throws EOFException {
        buffer.getClass();
        options.getClass();
        int iSelectPrefix$default = selectPrefix$default(buffer, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        buffer.skip(options.getByteStrings$okio()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void commonSkip(okio.Buffer buffer, long j3) throws EOFException {
        buffer.getClass();
        while (j3 > 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                C2104o.m5277a();
                return;
            }
            int iMin = (int) Math.min(j3, segment.limit - segment.pos);
            long j4 = iMin;
            buffer.setSize$okio(buffer.size() - j4);
            j3 -= j4;
            int i9 = segment.pos + iMin;
            segment.pos = i9;
            if (i9 == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ByteString commonSnapshot(okio.Buffer buffer, int i9) {
        buffer.getClass();
        if (i9 == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, i9);
        Segment segment = buffer.head;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i9) {
            segment.getClass();
            int i13 = segment.limit;
            int i14 = segment.pos;
            if (i13 == i14) {
                C2104o.m5281f("s.limit == s.pos");
                return null;
            }
            i11 += i13 - i14;
            i12++;
            segment = segment.next;
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        Segment segment2 = buffer.head;
        int i15 = 0;
        while (i10 < i9) {
            segment2.getClass();
            bArr[i15] = segment2.data;
            i10 += segment2.limit - segment2.pos;
            iArr[i15] = Math.min(i10, i9);
            iArr[i15 + i12] = segment2.pos;
            segment2.shared = true;
            i15++;
            segment2 = segment2.next;
        }
        return new C6147SegmentedByteString(bArr, iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Segment commonWritableSegment(okio.Buffer buffer, int i9) {
        buffer.getClass();
        if (i9 < 1 || i9 > 8192) {
            C2104o.m5294t("unexpected capacity");
            return null;
        }
        Segment segment = buffer.head;
        if (segment != null) {
            segment.getClass();
            Segment segment2 = segment.prev;
            segment2.getClass();
            return (segment2.limit + i9 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        buffer.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void commonWrite(okio.Buffer buffer, okio.Buffer buffer2, long j3) {
        Segment segment;
        buffer.getClass();
        buffer2.getClass();
        if (buffer2 == buffer) {
            C2104o.m5294t("source == this");
            return;
        }
        SegmentedByteString.checkOffsetAndCount(buffer2.size(), 0L, j3);
        while (j3 > 0) {
            Segment segment2 = buffer2.head;
            segment2.getClass();
            int i9 = segment2.limit;
            buffer2.head.getClass();
            if (j3 < i9 - r1.pos) {
                Segment segment3 = buffer.head;
                if (segment3 != null) {
                    segment3.getClass();
                    segment = segment3.prev;
                } else {
                    segment = null;
                }
                if (segment != null && segment.owner) {
                    if ((((long) segment.limit) + j3) - ((long) (segment.shared ? 0 : segment.pos)) <= 8192) {
                        Segment segment4 = buffer2.head;
                        segment4.getClass();
                        segment4.writeTo(segment, (int) j3);
                        buffer2.setSize$okio(buffer2.size() - j3);
                        buffer.setSize$okio(buffer.size() + j3);
                        return;
                    }
                }
                Segment segment5 = buffer2.head;
                segment5.getClass();
                buffer2.head = segment5.split((int) j3);
            }
            Segment segment6 = buffer2.head;
            segment6.getClass();
            long j4 = segment6.limit - segment6.pos;
            buffer2.head = segment6.pop();
            Segment segment7 = buffer.head;
            if (segment7 == null) {
                buffer.head = segment6;
                segment6.prev = segment6;
                segment6.next = segment6;
            } else {
                segment7.getClass();
                Segment segment8 = segment7.prev;
                segment8.getClass();
                segment8.push(segment6).compact();
            }
            buffer2.setSize$okio(buffer2.size() - j4);
            buffer.setSize$okio(buffer.size() + j4);
            j3 -= j4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ okio.Buffer commonWrite$default(okio.Buffer buffer, ByteString byteString, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = byteString.size();
        }
        buffer.getClass();
        byteString.getClass();
        byteString.write$okio(buffer, i9, i10);
        return buffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long commonWriteAll(okio.Buffer buffer, Source source) {
        buffer.getClass();
        source.getClass();
        long j3 = 0;
        while (true) {
            long j4 = source.read(buffer, 8192L);
            if (j4 == -1) {
                return j3;
            }
            j3 += j4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final okio.Buffer commonWriteByte(okio.Buffer buffer, int i9) {
        buffer.getClass();
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i10 + 1;
        bArr[i10] = (byte) i9;
        buffer.setSize$okio(buffer.size() + 1);
        return buffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final okio.Buffer commonWriteDecimalLong(okio.Buffer buffer, long j3) {
        boolean z9;
        buffer.getClass();
        if (j3 == 0) {
            return buffer.writeByte(48);
        }
        int i9 = 1;
        if (j3 < 0) {
            j3 = -j3;
            if (j3 < 0) {
                return buffer.writeUtf8("-9223372036854775808");
            }
            z9 = true;
        } else {
            z9 = false;
        }
        if (j3 >= 100000000) {
            i9 = j3 < 1000000000000L ? j3 < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j3 < 1000000000 ? 9 : 10 : j3 < 100000000000L ? 11 : 12 : j3 < 1000000000000000L ? j3 < 10000000000000L ? 13 : j3 < 100000000000000L ? 14 : 15 : j3 < 100000000000000000L ? j3 < 10000000000000000L ? 16 : 17 : j3 < 1000000000000000000L ? 18 : 19;
        } else if (j3 >= 10000) {
            i9 = j3 < 1000000 ? j3 < 100000 ? 5 : 6 : j3 < 10000000 ? 7 : 8;
        } else if (j3 >= 100) {
            i9 = j3 < 1000 ? 3 : 4;
        } else if (j3 >= 10) {
            i9 = 2;
        }
        if (z9) {
            i9++;
        }
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i9);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit + i9;
        while (j3 != 0) {
            long j4 = 10;
            i10--;
            bArr[i10] = getHEX_DIGIT_BYTES()[(int) (j3 % j4)];
            j3 /= j4;
        }
        if (z9) {
            bArr[i10 - 1] = 45;
        }
        segmentWritableSegment$okio.limit += i9;
        buffer.setSize$okio(buffer.size() + ((long) i9));
        return buffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final okio.Buffer commonWriteHexadecimalUnsignedLong(okio.Buffer buffer, long j3) {
        buffer.getClass();
        if (j3 == 0) {
            return buffer.writeByte(48);
        }
        long j4 = (j3 >>> 1) | j3;
        long j5 = j4 | (j4 >>> 2);
        long j10 = j5 | (j5 >>> 4);
        long j11 = j10 | (j10 >>> 8);
        long j12 = j11 | (j11 >>> 16);
        long j13 = j12 | (j12 >>> 32);
        long j14 = j13 - ((j13 >>> 1) & 6148914691236517205L);
        long j15 = ((j14 >>> 2) & 3689348814741910323L) + (j14 & 3689348814741910323L);
        long j16 = ((j15 >>> 4) + j15) & 1085102592571150095L;
        long j17 = j16 + (j16 >>> 8);
        long j18 = j17 + (j17 >>> 16);
        int i9 = (int) ((((j18 & 63) + ((j18 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i9);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        for (int i11 = (i10 + i9) - 1; i11 >= i10; i11--) {
            bArr[i11] = getHEX_DIGIT_BYTES()[(int) (15 & j3)];
            j3 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i9;
        buffer.setSize$okio(buffer.size() + ((long) i9));
        return buffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final okio.Buffer commonWriteInt(okio.Buffer buffer, int i9) {
        buffer.getClass();
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((i9 >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i9 >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i9 >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i9 & 255);
        segmentWritableSegment$okio.limit = i10 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final okio.Buffer commonWriteLong(okio.Buffer buffer, long j3) {
        buffer.getClass();
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i9 = segmentWritableSegment$okio.limit;
        bArr[i9] = (byte) ((j3 >>> 56) & 255);
        bArr[i9 + 1] = (byte) ((j3 >>> 48) & 255);
        bArr[i9 + 2] = (byte) ((j3 >>> 40) & 255);
        bArr[i9 + 3] = (byte) ((j3 >>> 32) & 255);
        bArr[i9 + 4] = (byte) ((j3 >>> 24) & 255);
        bArr[i9 + 5] = (byte) ((j3 >>> 16) & 255);
        bArr[i9 + 6] = (byte) ((j3 >>> 8) & 255);
        bArr[i9 + 7] = (byte) (j3 & 255);
        segmentWritableSegment$okio.limit = i9 + 8;
        buffer.setSize$okio(buffer.size() + 8);
        return buffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final okio.Buffer commonWriteShort(okio.Buffer buffer, int i9) {
        buffer.getClass();
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((i9 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i9 & 255);
        segmentWritableSegment$okio.limit = i10 + 2;
        buffer.setSize$okio(buffer.size() + 2);
        return buffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final okio.Buffer commonWriteUtf8(okio.Buffer buffer, String str, int i9, int i10) {
        char cCharAt;
        buffer.getClass();
        str.getClass();
        if (i9 < 0) {
            C2104o.m5291q(AbstractC0921a.m2249l(i9, "beginIndex < 0: "));
            return null;
        }
        if (i10 < i9) {
            C2104o.m5291q(AbstractC3199a.m6837j(i10, "endIndex < beginIndex: ", " < ", i9));
            return null;
        }
        if (i10 > str.length()) {
            C3193a.m6816e(str.length(), AbstractC0921a.m2257t(i10, "endIndex > string.length: ", " > "));
            return null;
        }
        while (i9 < i10) {
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 < 128) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                byte[] bArr = segmentWritableSegment$okio.data;
                int i11 = segmentWritableSegment$okio.limit - i9;
                int iMin = Math.min(i10, 8192 - i11);
                int i12 = i9 + 1;
                bArr[i9 + i11] = (byte) cCharAt2;
                while (true) {
                    i9 = i12;
                    if (i9 >= iMin || (cCharAt = str.charAt(i9)) >= 128) {
                        break;
                    }
                    i12 = i9 + 1;
                    bArr[i9 + i11] = (byte) cCharAt;
                }
                int i13 = segmentWritableSegment$okio.limit;
                int i14 = (i11 + i9) - i13;
                segmentWritableSegment$okio.limit = i13 + i14;
                buffer.setSize$okio(buffer.size() + ((long) i14));
            } else {
                if (cCharAt2 < 2048) {
                    Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(2);
                    byte[] bArr2 = segmentWritableSegment$okio2.data;
                    int i15 = segmentWritableSegment$okio2.limit;
                    bArr2[i15] = (byte) ((cCharAt2 >> 6) | Opcodes.CHECKCAST);
                    bArr2[i15 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio2.limit = i15 + 2;
                    buffer.setSize$okio(buffer.size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(3);
                    byte[] bArr3 = segmentWritableSegment$okio3.data;
                    int i16 = segmentWritableSegment$okio3.limit;
                    bArr3[i16] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i16 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i16 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio3.limit = i16 + 3;
                    buffer.setSize$okio(buffer.size() + 3);
                } else {
                    int i17 = i9 + 1;
                    char cCharAt3 = i17 < i10 ? str.charAt(i17) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        buffer.writeByte(63);
                        i9 = i17;
                    } else {
                        int i18 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentWritableSegment$okio4 = buffer.writableSegment$okio(4);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i19 = segmentWritableSegment$okio4.limit;
                        bArr4[i19] = (byte) ((i18 >> 18) | 240);
                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                        segmentWritableSegment$okio4.limit = i19 + 4;
                        buffer.setSize$okio(buffer.size() + 4);
                        i9 += 2;
                    }
                }
                i9++;
            }
        }
        return buffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final okio.Buffer commonWriteUtf8CodePoint(okio.Buffer buffer, int i9) {
        buffer.getClass();
        if (i9 < 128) {
            buffer.writeByte(i9);
            return buffer;
        }
        if (i9 < 2048) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i10 = segmentWritableSegment$okio.limit;
            bArr[i10] = (byte) ((i9 >> 6) | Opcodes.CHECKCAST);
            bArr[i10 + 1] = (byte) ((i9 & 63) | 128);
            segmentWritableSegment$okio.limit = i10 + 2;
            buffer.setSize$okio(buffer.size() + 2);
            return buffer;
        }
        if (55296 <= i9 && i9 < 57344) {
            buffer.writeByte(63);
            return buffer;
        }
        if (i9 < 65536) {
            Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i11 = segmentWritableSegment$okio2.limit;
            bArr2[i11] = (byte) ((i9 >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((i9 >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((i9 & 63) | 128);
            segmentWritableSegment$okio2.limit = i11 + 3;
            buffer.setSize$okio(buffer.size() + 3);
            return buffer;
        }
        if (i9 > 1114111) {
            C2104o.m5298x(SegmentedByteString.toHexString(i9), "Unexpected code point: 0x");
            return null;
        }
        Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(4);
        byte[] bArr3 = segmentWritableSegment$okio3.data;
        int i12 = segmentWritableSegment$okio3.limit;
        bArr3[i12] = (byte) ((i9 >> 18) | 240);
        bArr3[i12 + 1] = (byte) (((i9 >> 12) & 63) | 128);
        bArr3[i12 + 2] = (byte) (((i9 >> 6) & 63) | 128);
        bArr3[i12 + 3] = (byte) ((i9 & 63) | 128);
        segmentWritableSegment$okio3.limit = i12 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean rangeEquals(Segment segment, int i9, byte[] bArr, int i10, int i11) {
        segment.getClass();
        bArr.getClass();
        int i12 = segment.limit;
        byte[] bArr2 = segment.data;
        while (i10 < i11) {
            if (i9 == i12) {
                segment = segment.next;
                segment.getClass();
                byte[] bArr3 = segment.data;
                bArr2 = bArr3;
                i9 = segment.pos;
                i12 = segment.limit;
            }
            if (bArr2[i9] != bArr[i10]) {
                return false;
            }
            i9++;
            i10++;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String readUtf8Line(okio.Buffer buffer, long j3) throws EOFException {
        buffer.getClass();
        if (j3 > 0) {
            long j4 = j3 - 1;
            if (buffer.getByte(j4) == 13) {
                String utf8 = buffer.readUtf8(j4);
                buffer.skip(2L);
                return utf8;
            }
        }
        String utf82 = buffer.readUtf8(j3);
        buffer.skip(1L);
        return utf82;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final <T> T seek(okio.Buffer buffer, long j3, InterfaceC1235p interfaceC1235p) {
        buffer.getClass();
        interfaceC1235p.getClass();
        Segment segment = buffer.head;
        if (segment == null) {
            return (T) interfaceC1235p.invoke(null, -1L);
        }
        if (buffer.size() - j3 < j3) {
            long size = buffer.size();
            while (size > j3) {
                segment = segment.prev;
                segment.getClass();
                size -= (long) (segment.limit - segment.pos);
            }
            return (T) interfaceC1235p.invoke(segment, Long.valueOf(size));
        }
        long j4 = 0;
        while (true) {
            long j5 = ((long) (segment.limit - segment.pos)) + j4;
            if (j5 > j3) {
                return (T) interfaceC1235p.invoke(segment, Long.valueOf(j4));
            }
            segment = segment.next;
            segment.getClass();
            j4 = j5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r19 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f A[LOOP:0: B:8:0x0020->B:46:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int selectPrefix(okio.Buffer buffer, Options options, boolean z9) {
        int i9;
        int i10;
        Segment segment;
        int i11;
        int i12;
        buffer.getClass();
        options.getClass();
        Segment segment2 = buffer.head;
        if (segment2 != null) {
            byte[] bArr = segment2.data;
            int i13 = segment2.pos;
            int i14 = segment2.limit;
            int[] trie$okio = options.getTrie$okio();
            Segment segment3 = segment2;
            int i15 = -1;
            int i16 = 0;
            loop0: while (true) {
                int i17 = i16 + 1;
                int i18 = trie$okio[i16];
                int i19 = i16 + 2;
                int i20 = trie$okio[i17];
                if (i20 != -1) {
                    i15 = i20;
                }
                if (segment3 == null) {
                    break;
                }
                if (i18 >= 0) {
                    i9 = i13 + 1;
                    int i21 = bArr[i13] & 255;
                    int i22 = i19 + i18;
                    while (i19 != i22) {
                        if (i21 == trie$okio[i19]) {
                            i10 = trie$okio[i19 + i18];
                            if (i9 == i14) {
                                segment3 = segment3.next;
                                segment3.getClass();
                                i9 = segment3.pos;
                                bArr = segment3.data;
                                i14 = segment3.limit;
                                if (segment3 == segment2) {
                                    segment3 = null;
                                }
                            }
                            if (i10 < 0) {
                            }
                        } else {
                            i19++;
                        }
                    }
                    break loop0;
                }
                int i23 = (i18 * (-1)) + i19;
                while (true) {
                    int i24 = i13 + 1;
                    int i25 = i19 + 1;
                    if ((bArr[i13] & 255) != trie$okio[i19]) {
                        break loop0;
                    }
                    boolean z10 = i25 == i23;
                    if (i24 == i14) {
                        segment3.getClass();
                        Segment segment4 = segment3.next;
                        segment4.getClass();
                        i12 = segment4.pos;
                        byte[] bArr2 = segment4.data;
                        i11 = segment4.limit;
                        if (segment4 != segment2) {
                            segment = segment4;
                            bArr = bArr2;
                        } else {
                            if (!z10) {
                                break loop0;
                            }
                            bArr = bArr2;
                            segment = null;
                        }
                    } else {
                        segment = segment3;
                        i11 = i14;
                        i12 = i24;
                    }
                    if (z10) {
                        i10 = trie$okio[i25];
                        i9 = i12;
                        i14 = i11;
                        segment3 = segment;
                        break;
                    }
                    i13 = i12;
                    i14 = i11;
                    segment3 = segment;
                    i19 = i25;
                }
                if (i10 < 0) {
                    return i10;
                }
                i16 = -i10;
                i13 = i9;
            }
        } else {
            return z9 ? -2 : -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ int selectPrefix$default(okio.Buffer buffer, Options options, boolean z9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        return selectPrefix(buffer, options, z9);
    }

    public static /* synthetic */ void getHEX_DIGIT_BYTES$annotations() {
    }

    public static final void commonReadFully(okio.Buffer buffer, byte[] bArr) throws EOFException {
        buffer.getClass();
        bArr.getClass();
        int i9 = 0;
        while (i9 < bArr.length) {
            int i10 = buffer.read(bArr, i9, bArr.length - i9);
            if (i10 == -1) {
                C2104o.m5277a();
                return;
            }
            i9 += i10;
        }
    }

    public static final byte[] commonReadByteArray(okio.Buffer buffer) {
        buffer.getClass();
        return buffer.readByteArray(buffer.size());
    }

    public static final ByteString commonReadByteString(okio.Buffer buffer) {
        buffer.getClass();
        return buffer.readByteString(buffer.size());
    }

    public static final int commonRead(okio.Buffer buffer, byte[] bArr) {
        buffer.getClass();
        bArr.getClass();
        return buffer.read(bArr, 0, bArr.length);
    }

    public static final long commonRead(okio.Buffer buffer, okio.Buffer buffer2, long j3) {
        buffer.getClass();
        buffer2.getClass();
        if (j3 < 0) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "byteCount < 0: "));
            return 0L;
        }
        if (buffer.size() == 0) {
            return -1L;
        }
        if (j3 > buffer.size()) {
            j3 = buffer.size();
        }
        buffer2.write(buffer, j3);
        return j3;
    }

    public static final ByteString commonSnapshot(okio.Buffer buffer) {
        buffer.getClass();
        if (buffer.size() <= 2147483647L) {
            return buffer.snapshot((int) buffer.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + buffer.size()).toString());
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, byte[] bArr) {
        buffer.getClass();
        bArr.getClass();
        return buffer.write(bArr, 0, bArr.length);
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, byte[] bArr, int i9, int i10) {
        buffer.getClass();
        bArr.getClass();
        long j3 = i10;
        SegmentedByteString.checkOffsetAndCount(bArr.length, i9, j3);
        int i11 = i10 + i9;
        while (i9 < i11) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            int iMin = Math.min(i11 - i9, 8192 - segmentWritableSegment$okio.limit);
            int i12 = i9 + iMin;
            AbstractC4165l.m8380o0(bArr, segmentWritableSegment$okio.limit, i9, segmentWritableSegment$okio.data, i12);
            segmentWritableSegment$okio.limit += iMin;
            i9 = i12;
        }
        buffer.setSize$okio(buffer.size() + j3);
        return buffer;
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, Source source, long j3) throws EOFException {
        buffer.getClass();
        source.getClass();
        while (j3 > 0) {
            long j4 = source.read(buffer, j3);
            if (j4 == -1) {
                C2104o.m5277a();
                return null;
            }
            j3 -= j4;
        }
        return buffer;
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, ByteString byteString, int i9, int i10) {
        buffer.getClass();
        byteString.getClass();
        byteString.write$okio(buffer, i9, i10);
        return buffer;
    }

    public static final long commonIndexOf(okio.Buffer buffer, byte b10, long j3, long j4) {
        Segment segment;
        int i9;
        buffer.getClass();
        long size = 0;
        if (0 > j3 || j3 > j4) {
            throw new IllegalArgumentException(("size=" + buffer.size() + " fromIndex=" + j3 + " toIndex=" + j4).toString());
        }
        if (j4 > buffer.size()) {
            j4 = buffer.size();
        }
        if (j3 == j4 || (segment = buffer.head) == null) {
            return -1L;
        }
        if (buffer.size() - j3 < j3) {
            size = buffer.size();
            while (size > j3) {
                segment = segment.prev;
                segment.getClass();
                size -= (long) (segment.limit - segment.pos);
            }
            while (size < j4) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + j4) - size);
                i9 = (int) ((((long) segment.pos) + j3) - size);
                while (i9 < iMin) {
                    if (bArr[i9] != b10) {
                        i9++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                segment.getClass();
                j3 = size;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (segment.limit - segment.pos)) + size;
            if (j5 > j3) {
                break;
            }
            segment = segment.next;
            segment.getClass();
            size = j5;
        }
        while (size < j4) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + j4) - size);
            i9 = (int) ((((long) segment.pos) + j3) - size);
            while (i9 < iMin2) {
                if (bArr2[i9] != b10) {
                    i9++;
                }
            }
            size += (long) (segment.limit - segment.pos);
            segment = segment.next;
            segment.getClass();
            j3 = size;
        }
        return -1L;
        return ((long) (i9 - segment.pos)) + size;
    }
}

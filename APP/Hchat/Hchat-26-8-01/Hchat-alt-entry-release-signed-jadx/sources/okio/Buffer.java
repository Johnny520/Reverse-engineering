package okio;

import bsh.org.objectweb.asm.Opcodes;
import com.alibaba.fastjson2.JSONB;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.HttpUrl;
import okhttp3.internal.connection.RealConnection;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p218og.AbstractC3137a;
import p222p.AbstractC3199a;
import p276sf.InterfaceC3954a;
import tf.AbstractC4165l;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    public Segment head;
    private long size;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class UnsafeCursor implements Closeable {
        public Buffer buffer;
        public byte[] data;
        public boolean readWrite;
        private Segment segment;
        public long offset = -1;
        public int start = -1;
        public int end = -1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                C2104o.m5276A("not attached to a buffer");
                return;
            }
            this.buffer = null;
            setSegment$okio(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long expandBuffer(int i9) {
            if (i9 <= 0) {
                C2104o.m5291q(AbstractC0921a.m2249l(i9, "minByteCount <= 0: "));
                return 0L;
            }
            if (i9 > 8192) {
                C2104o.m5291q(AbstractC0921a.m2249l(i9, "minByteCount > Segment.SIZE: "));
                return 0L;
            }
            Buffer buffer = this.buffer;
            if (buffer == null) {
                C2104o.m5276A("not attached to a buffer");
                return 0L;
            }
            if (!this.readWrite) {
                C2104o.m5276A("expandBuffer() only permitted for read/write buffers");
                return 0L;
            }
            long size = buffer.size();
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i9);
            int i10 = 8192 - segmentWritableSegment$okio.limit;
            segmentWritableSegment$okio.limit = 8192;
            long j3 = i10;
            buffer.setSize$okio(size + j3);
            setSegment$okio(segmentWritableSegment$okio);
            this.offset = size;
            this.data = segmentWritableSegment$okio.data;
            this.start = 8192 - i10;
            this.end = 8192;
            return j3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Segment getSegment$okio() {
            return this.segment;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int next() {
            long j3 = this.offset;
            Buffer buffer = this.buffer;
            buffer.getClass();
            if (j3 != buffer.size()) {
                long j4 = this.offset;
                return j4 == -1 ? seek(0L) : seek(j4 + ((long) (this.end - this.start)));
            }
            C2104o.m5276A("no more bytes");
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long resizeBuffer(long j3) {
            Buffer buffer = this.buffer;
            if (buffer == null) {
                C2104o.m5276A("not attached to a buffer");
                return 0L;
            }
            if (!this.readWrite) {
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
                setSegment$okio(null);
                this.offset = j3;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (j3 > size) {
                long j10 = j3 - size;
                boolean z9 = true;
                while (j10 > 0) {
                    Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                    int iMin = (int) Math.min(j10, 8192 - segmentWritableSegment$okio.limit);
                    segmentWritableSegment$okio.limit += iMin;
                    j10 -= (long) iMin;
                    if (z9) {
                        setSegment$okio(segmentWritableSegment$okio);
                        this.offset = size;
                        this.data = segmentWritableSegment$okio.data;
                        int i10 = segmentWritableSegment$okio.limit;
                        this.start = i10 - iMin;
                        this.end = i10;
                        z9 = false;
                    }
                }
            }
            buffer.setSize$okio(j3);
            return size;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int seek(long j3) {
            Segment segmentPush;
            Buffer buffer = this.buffer;
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
                setSegment$okio(null);
                this.offset = j3;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = buffer.size();
            Segment segment$okio = buffer.head;
            long j4 = 0;
            if (getSegment$okio() != null) {
                long j5 = this.offset;
                int i9 = this.start;
                Segment segment$okio2 = getSegment$okio();
                segment$okio2.getClass();
                long j10 = j5 - ((long) (i9 - segment$okio2.pos));
                if (j10 > j3) {
                    segmentPush = segment$okio;
                    segment$okio = getSegment$okio();
                    size = j10;
                } else {
                    segmentPush = getSegment$okio();
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
            if (this.readWrite) {
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
            setSegment$okio(segmentPush);
            this.offset = j3;
            segmentPush.getClass();
            this.data = segmentPush.data;
            int i12 = segmentPush.pos + ((int) (j3 - j4));
            this.start = i12;
            int i13 = segmentPush.limit;
            this.end = i13;
            return i13 - i12;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setSegment$okio(Segment segment) {
            this.segment = segment;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, OutputStream outputStream, long j3, long j4, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            j3 = 0;
        }
        long j5 = j3;
        if ((i9 & 4) != 0) {
            j4 = buffer.size - j5;
        }
        return buffer.copyTo(outputStream, j5, j4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final ByteString digest(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        Segment segment = this.head;
        if (segment != null) {
            byte[] bArr = segment.data;
            int i9 = segment.pos;
            messageDigest.update(bArr, i9, segment.limit - i9);
            Segment segment2 = segment.next;
            segment2.getClass();
            while (segment2 != segment) {
                byte[] bArr2 = segment2.data;
                int i10 = segment2.pos;
                messageDigest.update(bArr2, i10, segment2.limit - i10);
                segment2 = segment2.next;
                segment2.getClass();
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new ByteString(bArrDigest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final ByteString hmac(String str, ByteString byteString) throws NoSuchAlgorithmException {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.internalArray$okio(), str));
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i9 = segment.pos;
                mac.update(bArr, i9, segment.limit - i9);
                Segment segment2 = segment.next;
                segment2.getClass();
                while (segment2 != segment) {
                    byte[] bArr2 = segment2.data;
                    int i10 = segment2.pos;
                    mac.update(bArr2, i10, segment2.limit - i10);
                    segment2 = segment2.next;
                    segment2.getClass();
                }
            }
            byte[] bArrDoFinal = mac.doFinal();
            bArrDoFinal.getClass();
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ UnsafeCursor readAndWriteUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readAndWriteUnsafe(unsafeCursor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void readFrom(InputStream inputStream, long j3, boolean z9) throws IOException {
        while (true) {
            if (j3 <= 0 && !z9) {
                return;
            }
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int i9 = inputStream.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(j3, 8192 - segmentWritableSegment$okio.limit));
            if (i9 == -1) {
                if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
                    this.head = segmentWritableSegment$okio.pop();
                    SegmentPool.recycle(segmentWritableSegment$okio);
                }
                if (z9) {
                    return;
                }
                C2104o.m5277a();
                return;
            }
            segmentWritableSegment$okio.limit += i9;
            long j4 = i9;
            this.size += j4;
            j3 -= j4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ UnsafeCursor readUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readUnsafe(unsafeCursor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Buffer writeTo$default(Buffer buffer, OutputStream outputStream, long j3, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            j3 = buffer.size;
        }
        return buffer.writeTo(outputStream, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m11062deprecated_getByte(long j3) {
        return getByte(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final long m11063deprecated_size() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void clear() throws EOFException {
        skip(size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long completeSegmentByteCount() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = this.head;
        segment.getClass();
        Segment segment2 = segment.prev;
        segment2.getClass();
        int i9 = segment2.limit;
        return (i9 >= 8192 || !segment2.owner) ? size : size - ((long) (i9 - segment2.pos));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Buffer copy() {
        Buffer buffer = new Buffer();
        if (size() == 0) {
            return buffer;
        }
        Segment segment = this.head;
        segment.getClass();
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer.head = segmentSharedCopy;
        segmentSharedCopy.prev = segmentSharedCopy;
        segmentSharedCopy.next = segmentSharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            segment3.getClass();
            segment2.getClass();
            segment3.push(segment2.sharedCopy());
        }
        buffer.setSize$okio(size());
        return buffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Buffer copyTo(Buffer buffer, long j3, long j4) {
        buffer.getClass();
        long j5 = j3;
        SegmentedByteString.checkOffsetAndCount(size(), j5, j4);
        if (j4 != 0) {
            buffer.setSize$okio(buffer.size() + j4);
            Segment segment = this.head;
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
                Segment segment3 = buffer.head;
                if (segment3 == null) {
                    segmentSharedCopy.prev = segmentSharedCopy;
                    segmentSharedCopy.next = segmentSharedCopy;
                    buffer.head = segmentSharedCopy;
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
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Buffer)) {
            return false;
        }
        Buffer buffer = (Buffer) obj;
        if (size() != buffer.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        Segment segment = this.head;
        segment.getClass();
        Segment segment2 = buffer.head;
        segment2.getClass();
        int i9 = segment.pos;
        int i10 = segment2.pos;
        long j3 = 0;
        while (j3 < size()) {
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
    @Override // okio.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte getByte(long j3) {
        SegmentedByteString.checkOffsetAndCount(size(), j3, 1L);
        Segment segment = this.head;
        segment.getClass();
        if (size() - j3 < j3) {
            long size = size();
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
    public int hashCode() {
        Segment segment = this.head;
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
        } while (segment != this.head);
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteString hmacSha1(ByteString byteString) {
        byteString.getClass();
        return hmac("HmacSHA1", byteString);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteString hmacSha256(ByteString byteString) {
        byteString.getClass();
        return hmac("HmacSHA256", byteString);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteString hmacSha512(ByteString byteString) {
        byteString.getClass();
        return hmac("HmacSHA512", byteString);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public long indexOf(ByteString byteString, long j3) {
        int i9;
        long j4 = j3;
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
        Segment segment = this.head;
        if (segment == null) {
            return -1L;
        }
        if (size() - j4 >= j4) {
            while (true) {
                long j10 = ((long) (segment.limit - segment.pos)) + j5;
                if (j10 > j4) {
                    break;
                }
                segment = segment.next;
                segment.getClass();
                j5 = j10;
            }
            byte[] bArrInternalArray$okio = byteString.internalArray$okio();
            byte b10 = bArrInternalArray$okio[0];
            int size = byteString.size();
            long size2 = (size() - ((long) size)) + 1;
            while (j5 < size2) {
                byte[] bArr = segment.data;
                long j11 = j4;
                int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + size2) - j5);
                for (int i10 = (int) ((((long) segment.pos) + j11) - j5); i10 < iMin; i10++) {
                    if (bArr[i10] == b10 && okio.internal.Buffer.rangeEquals(segment, i10 + 1, bArrInternalArray$okio, 1, size)) {
                        return ((long) (i10 - segment.pos)) + j5;
                    }
                }
                j5 += (long) (segment.limit - segment.pos);
                segment = segment.next;
                segment.getClass();
                j4 = j5;
            }
            return -1L;
        }
        long size3 = size();
        while (size3 > j4) {
            segment = segment.prev;
            segment.getClass();
            size3 -= (long) (segment.limit - segment.pos);
        }
        byte[] bArrInternalArray$okio2 = byteString.internalArray$okio();
        byte b11 = bArrInternalArray$okio2[0];
        int size4 = byteString.size();
        long size5 = (size() - ((long) size4)) + 1;
        while (size3 < size5) {
            byte[] bArr2 = segment.data;
            int i11 = size4;
            int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + size5) - size3);
            int i12 = (int) ((((long) segment.pos) + j4) - size3);
            while (i12 < iMin2) {
                if (bArr2[i12] == b11) {
                    i9 = i11;
                    if (okio.internal.Buffer.rangeEquals(segment, i12 + 1, bArrInternalArray$okio2, 1, i9)) {
                        return ((long) (i12 - segment.pos)) + size3;
                    }
                } else {
                    i9 = i11;
                }
                i12++;
                i11 = i9;
            }
            size3 += (long) (segment.limit - segment.pos);
            segment = segment.next;
            segment.getClass();
            j4 = size3;
            size4 = i11;
        }
        return -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public long indexOfElement(ByteString byteString, long j3) {
        byteString.getClass();
        long j4 = 0;
        if (j3 < 0) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "fromIndex < 0: "));
            return 0L;
        }
        Segment segment = this.head;
        if (segment == null) {
            return -1L;
        }
        if (size() - j3 < j3) {
            long size = size();
            while (size > j3) {
                segment = segment.prev;
                segment.getClass();
                size -= (long) (segment.limit - segment.pos);
            }
            if (byteString.size() == 2) {
                byte b10 = byteString.getByte(0);
                byte b11 = byteString.getByte(1);
                while (size < size()) {
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
                while (size < size()) {
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
            while (j4 < size()) {
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
            while (j4 < size()) {
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
    @Override // okio.BufferedSource
    public InputStream inputStream() {
        return new InputStream() { // from class: okio.Buffer.inputStream.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(Buffer.this.size(), Integer.MAX_VALUE);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.io.InputStream
            public int read() {
                if (Buffer.this.size() > 0) {
                    return Buffer.this.readByte() & 255;
                }
                return -1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public String toString() {
                return Buffer.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i9, int i10) {
                bArr.getClass();
                return Buffer.this.read(bArr, i9, i10);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteString md5() {
        return digest("MD5");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSink
    public OutputStream outputStream() {
        return new OutputStream() { // from class: okio.Buffer.outputStream.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public String toString() {
                return Buffer.this + ".outputStream()";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i9, int i10) {
                bArr.getClass();
                Buffer.this.write(bArr, i9, i10);
            }

            @Override // java.io.OutputStream
            public void write(int i9) {
                Buffer.this.writeByte(i9);
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public boolean rangeEquals(long j3, ByteString byteString, int i9, int i10) {
        byteString.getClass();
        if (j3 < 0 || i9 < 0 || i10 < 0 || size() - j3 < i10 || byteString.size() - i9 < i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (getByte(((long) i11) + j3) != byteString.getByte(i9 + i11)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public int read(byte[] bArr, int i9, int i10) {
        bArr.getClass();
        SegmentedByteString.checkOffsetAndCount(bArr.length, i9, i10);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i10, segment.limit - segment.pos);
        byte[] bArr2 = segment.data;
        int i11 = segment.pos;
        AbstractC4165l.m8380o0(bArr2, i9, i11, bArr, i11 + iMin);
        segment.pos += iMin;
        setSize$okio(size() - ((long) iMin));
        if (segment.pos == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public long readAll(Sink sink) {
        sink.getClass();
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final UnsafeCursor readAndWriteUnsafe(UnsafeCursor unsafeCursor) {
        unsafeCursor.getClass();
        return okio.internal.Buffer.commonReadAndWriteUnsafe(this, unsafeCursor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public byte readByte() throws EOFException {
        if (size() == 0) {
            C2104o.m5277a();
            return (byte) 0;
        }
        Segment segment = this.head;
        segment.getClass();
        int i9 = segment.pos;
        int i10 = segment.limit;
        int i11 = i9 + 1;
        byte b10 = segment.data[i9];
        setSize$okio(size() - 1);
        if (i11 != i10) {
            segment.pos = i11;
            return b10;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return b10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public byte[] readByteArray(long j3) throws EOFException {
        if (j3 < 0 || j3 > 2147483647L) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "byteCount: "));
            return null;
        }
        if (size() < j3) {
            C2104o.m5277a();
            return null;
        }
        byte[] bArr = new byte[(int) j3];
        readFully(bArr);
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public ByteString readByteString(long j3) throws EOFException {
        if (j3 < 0 || j3 > 2147483647L) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "byteCount: "));
            return null;
        }
        if (size() < j3) {
            C2104o.m5277a();
            return null;
        }
        if (j3 < 4096) {
            return new ByteString(readByteArray(j3));
        }
        ByteString byteStringSnapshot = snapshot((int) j3);
        skip(j3);
        return byteStringSnapshot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r1 = new okio.Buffer().writeDecimalLong(r8).writeByte((int) r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        p136j8.C2104o.m5296v(r1.readUtf8(), "Number too large: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        return 0;
     */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long readDecimalLong() throws EOFException {
        long j3;
        long j4 = 0;
        if (size() == 0) {
            C2104o.m5277a();
            return 0L;
        }
        int i9 = 0;
        boolean z9 = false;
        long j5 = 0;
        long j10 = -7;
        boolean z10 = false;
        loop0: while (true) {
            Segment segment = this.head;
            segment.getClass();
            byte[] bArr = segment.data;
            int i10 = segment.pos;
            int i11 = segment.limit;
            while (i10 < i11) {
                byte b10 = bArr[i10];
                if (b10 >= 48 && b10 <= 57) {
                    int i12 = 48 - b10;
                    if (j5 < okio.internal.Buffer.OVERFLOW_ZONE) {
                        break loop0;
                    }
                    j3 = j4;
                    if (j5 == okio.internal.Buffer.OVERFLOW_ZONE && i12 < j10) {
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
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i10;
            }
            if (z10 || this.head == null) {
                break;
            }
            j4 = j3;
        }
        setSize$okio(size() - ((long) i9));
        if (i9 >= (z9 ? 2 : 1)) {
            return z9 ? j5 : -j5;
        }
        if (size() == j3) {
            C2104o.m5277a();
            return 0L;
        }
        StringBuilder sbM1025n = AbstractC0255e.m1025n(z9 ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
        sbM1025n.append(SegmentedByteString.toHexString(getByte(j3)));
        throw new NumberFormatException(sbM1025n.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public void readFully(Buffer buffer, long j3) throws EOFException {
        buffer.getClass();
        if (size() >= j3) {
            buffer.write(this, j3);
        } else {
            buffer.write(this, size());
            C2104o.m5277a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087 A[EDGE_INSN: B:42:0x0087->B:37:0x0087 BREAK  A[LOOP:0: B:5:0x000d->B:44:?], SYNTHETIC] */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long readHexadecimalUnsignedLong() throws EOFException {
        int i9;
        if (size() == 0) {
            C2104o.m5277a();
            return 0L;
        }
        int i10 = 0;
        boolean z9 = false;
        long j3 = 0;
        do {
            Segment segment = this.head;
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
                        this.head = segment.pop();
                        SegmentPool.recycle(segment);
                    } else {
                        segment.pos = i11;
                    }
                    if (!z9) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j3) != 0) {
                    C2104o.m5296v(new Buffer().writeHexadecimalUnsignedLong(j3).writeByte((int) b10).readUtf8(), "Number too large: ");
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
        } while (this.head != null);
        setSize$okio(size() - ((long) i10));
        return j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public int readInt() throws EOFException {
        if (size() < 4) {
            C2104o.m5277a();
            return 0;
        }
        Segment segment = this.head;
        segment.getClass();
        int i9 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i9 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = segment.data;
        int i11 = i9 + 3;
        int i12 = ((bArr[i9 + 1] & 255) << 16) | ((bArr[i9] & 255) << 24) | ((bArr[i9 + 2] & 255) << 8);
        int i13 = i9 + 4;
        int i14 = (bArr[i11] & 255) | i12;
        setSize$okio(size() - 4);
        if (i13 != i10) {
            segment.pos = i13;
            return i14;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return i14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public int readIntLe() {
        return SegmentedByteString.reverseBytes(readInt());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public long readLong() throws EOFException {
        if (size() < 8) {
            C2104o.m5277a();
            return 0L;
        }
        Segment segment = this.head;
        segment.getClass();
        int i9 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i9 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = segment.data;
        int i11 = i9 + 7;
        long j3 = ((((long) bArr[i9]) & 255) << 56) | ((((long) bArr[i9 + 1]) & 255) << 48) | ((((long) bArr[i9 + 2]) & 255) << 40) | ((((long) bArr[i9 + 3]) & 255) << 32) | ((((long) bArr[i9 + 4]) & 255) << 24) | ((((long) bArr[i9 + 5]) & 255) << 16) | ((((long) bArr[i9 + 6]) & 255) << 8);
        int i12 = i9 + 8;
        long j4 = j3 | (((long) bArr[i11]) & 255);
        setSize$okio(size() - 8);
        if (i12 != i10) {
            segment.pos = i12;
            return j4;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public long readLongLe() {
        return SegmentedByteString.reverseBytes(readLong());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public short readShort() throws EOFException {
        if (size() < 2) {
            C2104o.m5277a();
            return (short) 0;
        }
        Segment segment = this.head;
        segment.getClass();
        int i9 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i9 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = segment.data;
        int i11 = i9 + 1;
        int i12 = (bArr[i9] & 255) << 8;
        int i13 = i9 + 2;
        int i14 = (bArr[i11] & 255) | i12;
        setSize$okio(size() - 2);
        if (i13 == i10) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i13;
        }
        return (short) i14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public short readShortLe() {
        return SegmentedByteString.reverseBytes(readShort());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public String readString(long j3, Charset charset) throws EOFException {
        charset.getClass();
        if (j3 < 0 || j3 > 2147483647L) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "byteCount: "));
            return null;
        }
        if (this.size < j3) {
            C2104o.m5277a();
            return null;
        }
        if (j3 == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Segment segment = this.head;
        segment.getClass();
        int i9 = segment.pos;
        if (((long) i9) + j3 > segment.limit) {
            return new String(readByteArray(j3), charset);
        }
        int i10 = (int) j3;
        String str = new String(segment.data, i9, i10, charset);
        int i11 = segment.pos + i10;
        segment.pos = i11;
        this.size -= j3;
        if (i11 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final UnsafeCursor readUnsafe(UnsafeCursor unsafeCursor) {
        unsafeCursor.getClass();
        return okio.internal.Buffer.commonReadUnsafe(this, unsafeCursor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public String readUtf8() {
        return readString(this.size, AbstractC3137a.f10177a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        int i9;
        int i10;
        int i11;
        if (size() == 0) {
            C2104o.m5277a();
            return 0;
        }
        byte b10 = getByte(0L);
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
                skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i9 = b10 & 7;
            i10 = 4;
            i11 = 65536;
        }
        long j3 = i10;
        if (size() < j3) {
            StringBuilder sbM2257t = AbstractC0921a.m2257t(i10, "size < ", ": ");
            sbM2257t.append(size());
            sbM2257t.append(" (to read code point prefixed 0x");
            sbM2257t.append(SegmentedByteString.toHexString(b10));
            sbM2257t.append(')');
            throw new EOFException(sbM2257t.toString());
        }
        for (int i12 = 1; i12 < i10; i12++) {
            long j4 = i12;
            byte b11 = getByte(j4);
            if ((b11 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                skip(j4);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i9 = (i9 << 6) | (b11 & 63);
        }
        skip(j3);
        return i9 > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 > i9 || i9 >= 57344) && i9 >= i11) ? i9 : Utf8.REPLACEMENT_CODE_POINT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public String readUtf8Line() {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this, jIndexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public String readUtf8LineStrict(long j3) throws EOFException {
        if (j3 < 0) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "limit < 0: "));
            return null;
        }
        long j4 = j3 != Long.MAX_VALUE ? j3 + 1 : Long.MAX_VALUE;
        long jIndexOf = indexOf((byte) 10, 0L, j4);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this, jIndexOf);
        }
        if (j4 < size() && getByte(j4 - 1) == 13 && getByte(j4) == 10) {
            return okio.internal.Buffer.readUtf8Line(this, j4);
        }
        Buffer buffer = new Buffer();
        copyTo(buffer, 0L, Math.min(32, size()));
        C2104o.m5282g(buffer.readByteString().hex(), Math.min(size(), j3));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public boolean request(long j3) {
        return this.size >= j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public void require(long j3) throws EOFException {
        if (this.size >= j3) {
            return;
        }
        C2104o.m5277a();
    }

    /* JADX DEBUG: Class process forced to load method for inline: okio.internal.-Buffer.selectPrefix$default(okio.Buffer, okio.Options, boolean, int, java.lang.Object):int */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public int select(Options options) throws EOFException {
        options.getClass();
        int iSelectPrefix$default = okio.internal.Buffer.selectPrefix$default(this, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        skip(options.getByteStrings$okio()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setSize$okio(long j3) {
        this.size = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteString sha1() {
        return digest("SHA-1");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteString sha256() {
        return digest("SHA-256");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteString sha512() {
        return digest("SHA-512");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long size() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public void skip(long j3) throws EOFException {
        while (j3 > 0) {
            Segment segment = this.head;
            if (segment == null) {
                C2104o.m5277a();
                return;
            }
            int iMin = (int) Math.min(j3, segment.limit - segment.pos);
            long j4 = iMin;
            setSize$okio(size() - j4);
            j3 -= j4;
            int i9 = segment.pos + iMin;
            segment.pos = i9;
            if (i9 == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteString snapshot(int i9) {
        if (i9 == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(size(), 0L, i9);
        Segment segment = this.head;
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
        Segment segment2 = this.head;
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
    @Override // okio.Source
    public Timeout timeout() {
        return Timeout.NONE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return snapshot().toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Segment writableSegment$okio(int i9) {
        if (i9 < 1 || i9 > 8192) {
            C2104o.m5294t("unexpected capacity");
            return null;
        }
        Segment segment = this.head;
        if (segment != null) {
            segment.getClass();
            Segment segment2 = segment.prev;
            segment2.getClass();
            return (segment2.limit + i9 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        this.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Sink
    public void write(Buffer buffer, long j3) {
        Segment segment;
        buffer.getClass();
        if (buffer == this) {
            C2104o.m5294t("source == this");
            return;
        }
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, j3);
        while (j3 > 0) {
            Segment segment2 = buffer.head;
            segment2.getClass();
            int i9 = segment2.limit;
            buffer.head.getClass();
            if (j3 < i9 - r1.pos) {
                Segment segment3 = this.head;
                if (segment3 != null) {
                    segment3.getClass();
                    segment = segment3.prev;
                } else {
                    segment = null;
                }
                if (segment != null && segment.owner) {
                    if ((((long) segment.limit) + j3) - ((long) (segment.shared ? 0 : segment.pos)) <= 8192) {
                        Segment segment4 = buffer.head;
                        segment4.getClass();
                        segment4.writeTo(segment, (int) j3);
                        buffer.setSize$okio(buffer.size() - j3);
                        setSize$okio(size() + j3);
                        return;
                    }
                }
                Segment segment5 = buffer.head;
                segment5.getClass();
                buffer.head = segment5.split((int) j3);
            }
            Segment segment6 = buffer.head;
            segment6.getClass();
            long j4 = segment6.limit - segment6.pos;
            buffer.head = segment6.pop();
            Segment segment7 = this.head;
            if (segment7 == null) {
                this.head = segment6;
                segment6.prev = segment6;
                segment6.next = segment6;
            } else {
                segment7.getClass();
                Segment segment8 = segment7.prev;
                segment8.getClass();
                segment8.push(segment6).compact();
            }
            buffer.setSize$okio(buffer.size() - j4);
            setSize$okio(size() + j4);
            j3 -= j4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSink
    public long writeAll(Source source) {
        source.getClass();
        long j3 = 0;
        while (true) {
            long j4 = source.read(this, 8192L);
            if (j4 == -1) {
                return j3;
            }
            j3 += j4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: writeByte(I)Lokio/BufferedSink; */
    @Override // okio.BufferedSink
    public Buffer writeByte(int i9) {
        Segment segmentWritableSegment$okio = writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i10 + 1;
        bArr[i10] = (byte) i9;
        setSize$okio(size() + 1);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: writeDecimalLong(J)Lokio/BufferedSink; */
    @Override // okio.BufferedSink
    public Buffer writeDecimalLong(long j3) {
        boolean z9;
        if (j3 == 0) {
            return writeByte(48);
        }
        int i9 = 1;
        if (j3 < 0) {
            j3 = -j3;
            if (j3 < 0) {
                return writeUtf8("-9223372036854775808");
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
        Segment segmentWritableSegment$okio = writableSegment$okio(i9);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit + i9;
        while (j3 != 0) {
            long j4 = 10;
            i10--;
            bArr[i10] = okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (j3 % j4)];
            j3 /= j4;
        }
        if (z9) {
            bArr[i10 - 1] = 45;
        }
        segmentWritableSegment$okio.limit += i9;
        setSize$okio(size() + ((long) i9));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: writeHexadecimalUnsignedLong(J)Lokio/BufferedSink; */
    @Override // okio.BufferedSink
    public Buffer writeHexadecimalUnsignedLong(long j3) {
        if (j3 == 0) {
            return writeByte(48);
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
        Segment segmentWritableSegment$okio = writableSegment$okio(i9);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        for (int i11 = (i10 + i9) - 1; i11 >= i10; i11--) {
            bArr[i11] = okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (15 & j3)];
            j3 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i9;
        setSize$okio(size() + ((long) i9));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: writeInt(I)Lokio/BufferedSink; */
    @Override // okio.BufferedSink
    public Buffer writeInt(int i9) {
        Segment segmentWritableSegment$okio = writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((i9 >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i9 >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i9 >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i9 & 255);
        segmentWritableSegment$okio.limit = i10 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: writeIntLe(I)Lokio/BufferedSink; */
    @Override // okio.BufferedSink
    public Buffer writeIntLe(int i9) {
        return writeInt(SegmentedByteString.reverseBytes(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: writeLong(J)Lokio/BufferedSink; */
    @Override // okio.BufferedSink
    public Buffer writeLong(long j3) {
        Segment segmentWritableSegment$okio = writableSegment$okio(8);
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
        setSize$okio(size() + 8);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: writeLongLe(J)Lokio/BufferedSink; */
    @Override // okio.BufferedSink
    public Buffer writeLongLe(long j3) {
        return writeLong(SegmentedByteString.reverseBytes(j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: writeShort(I)Lokio/BufferedSink; */
    @Override // okio.BufferedSink
    public Buffer writeShort(int i9) {
        Segment segmentWritableSegment$okio = writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((i9 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i9 & 255);
        segmentWritableSegment$okio.limit = i10 + 2;
        setSize$okio(size() + 2);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: writeShortLe(I)Lokio/BufferedSink; */
    @Override // okio.BufferedSink
    public Buffer writeShortLe(int i9) {
        return writeShort((int) SegmentedByteString.reverseBytes((short) i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: writeString(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/BufferedSink; */
    @Override // okio.BufferedSink
    public Buffer writeString(String str, int i9, int i10, Charset charset) {
        str.getClass();
        charset.getClass();
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
        if (charset.equals(AbstractC3137a.f10177a)) {
            return writeUtf8(str, i9, i10);
        }
        byte[] bytes = str.substring(i9, i10).getBytes(charset);
        bytes.getClass();
        return write(bytes, 0, bytes.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Buffer writeTo(OutputStream outputStream, long j3) throws IOException {
        outputStream.getClass();
        SegmentedByteString.checkOffsetAndCount(this.size, 0L, j3);
        Segment segment = this.head;
        long j4 = j3;
        while (j4 > 0) {
            segment.getClass();
            int iMin = (int) Math.min(j4, segment.limit - segment.pos);
            outputStream.write(segment.data, segment.pos, iMin);
            int i9 = segment.pos + iMin;
            segment.pos = i9;
            long j5 = iMin;
            this.size -= j5;
            j4 -= j5;
            if (i9 == segment.limit) {
                Segment segmentPop = segment.pop();
                this.head = segmentPop;
                SegmentPool.recycle(segment);
                segment = segmentPop;
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: writeUtf8(Ljava/lang/String;II)Lokio/BufferedSink; */
    @Override // okio.BufferedSink
    public Buffer writeUtf8(String str, int i9, int i10) {
        char cCharAt;
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
                Segment segmentWritableSegment$okio = writableSegment$okio(1);
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
                setSize$okio(size() + ((long) i14));
            } else {
                if (cCharAt2 < 2048) {
                    Segment segmentWritableSegment$okio2 = writableSegment$okio(2);
                    byte[] bArr2 = segmentWritableSegment$okio2.data;
                    int i15 = segmentWritableSegment$okio2.limit;
                    bArr2[i15] = (byte) ((cCharAt2 >> 6) | Opcodes.CHECKCAST);
                    bArr2[i15 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio2.limit = i15 + 2;
                    setSize$okio(size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    Segment segmentWritableSegment$okio3 = writableSegment$okio(3);
                    byte[] bArr3 = segmentWritableSegment$okio3.data;
                    int i16 = segmentWritableSegment$okio3.limit;
                    bArr3[i16] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i16 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i16 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio3.limit = i16 + 3;
                    setSize$okio(size() + 3);
                } else {
                    int i17 = i9 + 1;
                    char cCharAt3 = i17 < i10 ? str.charAt(i17) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        i9 = i17;
                    } else {
                        int i18 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentWritableSegment$okio4 = writableSegment$okio(4);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i19 = segmentWritableSegment$okio4.limit;
                        bArr4[i19] = (byte) ((i18 >> 18) | 240);
                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                        segmentWritableSegment$okio4.limit = i19 + 4;
                        setSize$okio(size() + 4);
                        i9 += 2;
                    }
                }
                i9++;
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: writeUtf8CodePoint(I)Lokio/BufferedSink; */
    @Override // okio.BufferedSink
    public Buffer writeUtf8CodePoint(int i9) {
        if (i9 < 128) {
            writeByte(i9);
            return this;
        }
        if (i9 < 2048) {
            Segment segmentWritableSegment$okio = writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i10 = segmentWritableSegment$okio.limit;
            bArr[i10] = (byte) ((i9 >> 6) | Opcodes.CHECKCAST);
            bArr[i10 + 1] = (byte) ((i9 & 63) | 128);
            segmentWritableSegment$okio.limit = i10 + 2;
            setSize$okio(size() + 2);
            return this;
        }
        if (55296 <= i9 && i9 < 57344) {
            writeByte(63);
            return this;
        }
        if (i9 < 65536) {
            Segment segmentWritableSegment$okio2 = writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i11 = segmentWritableSegment$okio2.limit;
            bArr2[i11] = (byte) ((i9 >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((i9 >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((i9 & 63) | 128);
            segmentWritableSegment$okio2.limit = i11 + 3;
            setSize$okio(size() + 3);
            return this;
        }
        if (i9 > 1114111) {
            C2104o.m5298x(SegmentedByteString.toHexString(i9), "Unexpected code point: 0x");
            return null;
        }
        Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
        byte[] bArr3 = segmentWritableSegment$okio3.data;
        int i12 = segmentWritableSegment$okio3.limit;
        bArr3[i12] = (byte) ((i9 >> 18) | 240);
        bArr3[i12 + 1] = (byte) (((i9 >> 12) & 63) | 128);
        bArr3[i12 + 2] = (byte) (((i9 >> 6) & 63) | 128);
        bArr3[i12 + 3] = (byte) ((i9 & 63) | 128);
        segmentWritableSegment$okio3.limit = i12 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    public Buffer clone() {
        return copy();
    }

    /* JADX DEBUG: Method merged with bridge method: emit()Lokio/BufferedSink; */
    @Override // okio.BufferedSink
    public Buffer emit() {
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: emitCompleteSegments()Lokio/BufferedSink; */
    @Override // okio.BufferedSink
    public Buffer emitCompleteSegments() {
        return this;
    }

    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    public final UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    @Override // okio.BufferedSource
    public String readUtf8(long j3) throws EOFException {
        return readString(j3, AbstractC3137a.f10177a);
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j3, long j4, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            j3 = 0;
        }
        return buffer.copyTo(buffer2, j3, j4);
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j3, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            j3 = 0;
        }
        return buffer.copyTo(buffer2, j3);
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public Buffer buffer() {
        return this;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public Buffer getBuffer() {
        return this;
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] bArr) throws EOFException {
        bArr.getClass();
        int i9 = 0;
        while (i9 < bArr.length) {
            int i10 = read(bArr, i9, bArr.length - i9);
            if (i10 == -1) {
                C2104o.m5277a();
                return;
            }
            i9 += i10;
        }
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j3, ByteString byteString) {
        byteString.getClass();
        return rangeEquals(j3, byteString, 0, byteString.size());
    }

    @Override // okio.BufferedSource
    public ByteString readByteString() {
        return readByteString(size());
    }

    @Override // okio.BufferedSource
    public int read(byte[] bArr) {
        bArr.getClass();
        return read(bArr, 0, bArr.length);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), segment.limit - segment.pos);
        byteBuffer.put(segment.data, segment.pos, iMin);
        int i9 = segment.pos + iMin;
        segment.pos = i9;
        this.size -= (long) iMin;
        if (i9 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    public final Buffer readFrom(InputStream inputStream, long j3) throws IOException {
        inputStream.getClass();
        if (j3 >= 0) {
            readFrom(inputStream, j3, false);
            return this;
        }
        C2104o.m5291q(AbstractC0255e.m1018g(j3, "byteCount < 0: "));
        return null;
    }

    public final Buffer writeTo(OutputStream outputStream) {
        outputStream.getClass();
        return writeTo$default(this, outputStream, 0L, 2, null);
    }

    @Override // okio.Source
    public long read(Buffer buffer, long j3) {
        buffer.getClass();
        if (j3 < 0) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "byteCount < 0: "));
            return 0L;
        }
        if (size() == 0) {
            return -1L;
        }
        if (j3 > size()) {
            j3 = size();
        }
        buffer.write(this, j3);
        return j3;
    }

    public final Buffer readFrom(InputStream inputStream) throws IOException {
        inputStream.getClass();
        readFrom(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: writeString(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/BufferedSink; */
    @Override // okio.BufferedSink
    public Buffer writeString(String str, Charset charset) {
        str.getClass();
        charset.getClass();
        return writeString(str, 0, str.length(), charset);
    }

    public final ByteString snapshot() {
        if (size() <= 2147483647L) {
            return snapshot((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @Override // okio.BufferedSource
    public String readString(Charset charset) {
        charset.getClass();
        return readString(this.size, charset);
    }

    public final Buffer copyTo(OutputStream outputStream, long j3) {
        outputStream.getClass();
        return copyTo$default(this, outputStream, j3, 0L, 4, (Object) null);
    }

    public final Buffer copyTo(OutputStream outputStream, long j3, long j4) throws IOException {
        outputStream.getClass();
        long j5 = j3;
        SegmentedByteString.checkOffsetAndCount(this.size, j5, j4);
        if (j4 != 0) {
            Segment segment = this.head;
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
                int i11 = (int) (((long) segment2.pos) + j5);
                int iMin = (int) Math.min(segment2.limit - i11, j10);
                outputStream.write(segment2.data, i11, iMin);
                j10 -= (long) iMin;
                segment2 = segment2.next;
                j5 = 0;
            }
        }
        return this;
    }

    public final Buffer copyTo(Buffer buffer, long j3) {
        buffer.getClass();
        return copyTo(buffer, j3, this.size - j3);
    }

    public final Buffer copyTo(OutputStream outputStream) {
        outputStream.getClass();
        return copyTo$default(this, outputStream, 0L, 0L, 6, (Object) null);
    }

    @Override // okio.BufferedSource
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i9 = iRemaining;
        while (i9 > 0) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i9, 8192 - segmentWritableSegment$okio.limit);
            byteBuffer.get(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, iMin);
            i9 -= iMin;
            segmentWritableSegment$okio.limit += iMin;
        }
        this.size += (long) iRemaining;
        return iRemaining;
    }

    /* JADX DEBUG: Method merged with bridge method: write(Lokio/ByteString;)Lokio/BufferedSink; */
    @Override // okio.BufferedSink
    public Buffer write(ByteString byteString) {
        byteString.getClass();
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: write(Lokio/ByteString;II)Lokio/BufferedSink; */
    @Override // okio.BufferedSink
    public Buffer write(ByteString byteString, int i9, int i10) {
        byteString.getClass();
        byteString.write$okio(this, i9, i10);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: write([B)Lokio/BufferedSink; */
    @Override // okio.BufferedSink
    public Buffer write(byte[] bArr) {
        bArr.getClass();
        return write(bArr, 0, bArr.length);
    }

    /* JADX DEBUG: Method merged with bridge method: write([BII)Lokio/BufferedSink; */
    @Override // okio.BufferedSink
    public Buffer write(byte[] bArr, int i9, int i10) {
        bArr.getClass();
        long j3 = i10;
        SegmentedByteString.checkOffsetAndCount(bArr.length, i9, j3);
        int i11 = i10 + i9;
        while (i9 < i11) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i11 - i9, 8192 - segmentWritableSegment$okio.limit);
            int i12 = i9 + iMin;
            AbstractC4165l.m8380o0(bArr, segmentWritableSegment$okio.limit, i9, segmentWritableSegment$okio.data, i12);
            segmentWritableSegment$okio.limit += iMin;
            i9 = i12;
        }
        setSize$okio(size() + j3);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: write(Lokio/Source;J)Lokio/BufferedSink; */
    @Override // okio.BufferedSink
    public Buffer write(Source source, long j3) throws EOFException {
        source.getClass();
        while (j3 > 0) {
            long j4 = source.read(this, j3);
            if (j4 == -1) {
                C2104o.m5277a();
                return null;
            }
            j3 -= j4;
        }
        return this;
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b10, long j3) {
        return indexOf(b10, j3, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(ByteString byteString) {
        byteString.getClass();
        return indexOf(byteString, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b10, long j3, long j4) {
        Segment segment;
        int i9;
        long size = 0;
        if (0 > j3 || j3 > j4) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j3 + " toIndex=" + j4).toString());
        }
        if (j4 > size()) {
            j4 = size();
        }
        if (j3 == j4 || (segment = this.head) == null) {
            return -1L;
        }
        if (size() - j3 < j3) {
            size = size();
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

    @Override // okio.BufferedSource
    public long indexOf(byte b10) {
        return indexOf(b10, 0L, Long.MAX_VALUE);
    }

    /* JADX DEBUG: Method merged with bridge method: writeUtf8(Ljava/lang/String;)Lokio/BufferedSink; */
    @Override // okio.BufferedSink
    public Buffer writeUtf8(String str) {
        str.getClass();
        return writeUtf8(str, 0, str.length());
    }

    @Override // okio.BufferedSource
    public long indexOfElement(ByteString byteString) {
        byteString.getClass();
        return indexOfElement(byteString, 0L);
    }
}

package okio;

/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0090\u0001B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0000H\u0016J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0000H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0006\u0010\u0015\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\u0000J$\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\fJ \u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0000H\u0016J\b\u0010!\u001a\u00020\u0000H\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020\u0012H\u0016J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\fH\u0087\u0002¢\u0006\u0002\b+J\u0015\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\fH\u0007¢\u0006\u0002\b-J\b\u0010.\u001a\u00020/H\u0016J\u0018\u00100\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u001dH\u0002J\u000e\u00102\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u000e\u00103\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u000e\u00104\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u0010\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)H\u0016J\u0018\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020\fH\u0016J \u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\fH\u0016J\u0010\u00105\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001dH\u0016J\u0018\u00105\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\fH\u0016J\u0010\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u001dH\u0016J\u0018\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\fH\u0016J\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020#H\u0016J\u0006\u0010?\u001a\u00020\u001dJ\b\u0010@\u001a\u00020\u0019H\u0016J\b\u0010A\u001a\u00020\u0001H\u0016J\u0018\u0010B\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001dH\u0016J(\u0010B\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0010\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020FH\u0016J\u0010\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020GH\u0016J \u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020G2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010D\u001a\u00020\f2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010H\u001a\u00020\f2\u0006\u0010E\u001a\u00020IH\u0016J\u0012\u0010J\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020KH\u0007J\b\u0010M\u001a\u00020)H\u0016J\b\u0010N\u001a\u00020GH\u0016J\u0010\u0010N\u001a\u00020G2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010O\u001a\u00020\u001dH\u0016J\u0010\u0010O\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010P\u001a\u00020\fH\u0016J\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020=J\u0016\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020=2\u0006\u0010\u001b\u001a\u00020\fJ \u0010Q\u001a\u00020\u00122\u0006\u0010R\u001a\u00020=2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010S\u001a\u00020#H\u0002J\u0010\u0010T\u001a\u00020\u00122\u0006\u0010E\u001a\u00020GH\u0016J\u0018\u0010T\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010U\u001a\u00020\fH\u0016J\b\u0010V\u001a\u00020/H\u0016J\b\u0010W\u001a\u00020/H\u0016J\b\u0010X\u001a\u00020\fH\u0016J\b\u0010Y\u001a\u00020\fH\u0016J\b\u0010Z\u001a\u00020[H\u0016J\b\u0010\\\u001a\u00020[H\u0016J\u0010\u0010]\u001a\u00020\u001f2\u0006\u0010^\u001a\u00020_H\u0016J\u0018\u0010]\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010^\u001a\u00020_H\u0016J\u0012\u0010`\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020KH\u0007J\b\u0010a\u001a\u00020\u001fH\u0016J\u0010\u0010a\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010b\u001a\u00020/H\u0016J\n\u0010c\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010d\u001a\u00020\u001fH\u0016J\u0010\u0010d\u001a\u00020\u001f2\u0006\u0010e\u001a\u00020\fH\u0016J\u0010\u0010f\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010g\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010h\u001a\u00020/2\u0006\u0010i\u001a\u00020jH\u0016J\u0006\u0010k\u001a\u00020\u001dJ\u0006\u0010l\u001a\u00020\u001dJ\u0006\u0010m\u001a\u00020\u001dJ\r\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0002\bnJ\u0010\u0010o\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0006\u0010p\u001a\u00020\u001dJ\u000e\u0010p\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020/J\b\u0010q\u001a\u00020rH\u0016J\b\u0010s\u001a\u00020\u001fH\u0016J\u0015\u0010t\u001a\u00020\n2\u0006\u0010u\u001a\u00020/H\u0000¢\u0006\u0002\bvJ\u0010\u0010w\u001a\u00020/2\u0006\u0010x\u001a\u00020FH\u0016J\u0010\u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020GH\u0016J \u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020G2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010w\u001a\u00020\u00122\u0006\u0010x\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010w\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u001dH\u0016J \u0010w\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020z2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010{\u001a\u00020\f2\u0006\u0010x\u001a\u00020zH\u0016J\u0010\u0010|\u001a\u00020\u00002\u0006\u00106\u001a\u00020/H\u0016J\u0010\u0010}\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0010\u0010\u007f\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0012\u0010\u0080\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020/H\u0016J\u0012\u0010\u0082\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020/H\u0016J\u0011\u0010\u0083\u0001\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0011\u0010\u0084\u0001\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0012\u0010\u0085\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0001\u001a\u00020/H\u0016J\u0012\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0001\u001a\u00020/H\u0016J\u001a\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0006\u0010^\u001a\u00020_H\u0016J,\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0007\u0010\u008a\u0001\u001a\u00020/2\u0007\u0010\u008b\u0001\u001a\u00020/2\u0006\u0010^\u001a\u00020_H\u0016J\u001b\u0010\u008c\u0001\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\fH\u0007J\u0012\u0010\u008d\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001fH\u0016J$\u0010\u008d\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0007\u0010\u008a\u0001\u001a\u00020/2\u0007\u0010\u008b\u0001\u001a\u00020/H\u0016J\u0012\u0010\u008e\u0001\u001a\u00020\u00002\u0007\u0010\u008f\u0001\u001a\u00020/H\u0016R\u0014\u0010\u0006\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8G@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0091\u0001"}, m115d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "()V", "buffer", "getBuffer", "()Lokio/Buffer;", "head", "Lokio/Segment;", "<set-?>", "", "size", "()J", "setSize$okio", "(J)V", "clear", "", "clone", "close", "completeSegmentByteCount", "copy", "copyTo", "out", "Ljava/io/OutputStream;", "offset", "byteCount", "digest", "Lokio/ByteString;", "algorithm", "", "emit", "emitCompleteSegments", "equals", "", "other", "", "exhausted", "flush", "get", "", "pos", "getByte", "index", "-deprecated_getByte", "hashCode", "", "hmac", "key", "hmacSha1", "hmacSha256", "hmacSha512", "indexOf", "b", "fromIndex", "toIndex", "bytes", "indexOfElement", "targetBytes", "inputStream", "Ljava/io/InputStream;", "isOpen", "md5", "outputStream", "peek", "rangeEquals", "bytesOffset", "read", "sink", "Ljava/nio/ByteBuffer;", "", "readAll", "Lokio/Sink;", "readAndWriteUnsafe", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "readByte", "readByteArray", "readByteString", "readDecimalLong", "readFrom", "input", "forever", "readFully", "readHexadecimalUnsignedLong", "readInt", "readIntLe", "readLong", "readLongLe", "readShort", "", "readShortLe", "readString", "charset", "Ljava/nio/charset/Charset;", "readUnsafe", "readUtf8", "readUtf8CodePoint", "readUtf8Line", "readUtf8LineStrict", "limit", "request", "require", "select", "options", "Lokio/Options;", "sha1", "sha256", "sha512", "-deprecated_size", "skip", "snapshot", "timeout", "Lokio/Timeout;", "toString", "writableSegment", "minimumCapacity", "writableSegment$okio", "write", "source", "byteString", "Lokio/Source;", "writeAll", "writeByte", "writeDecimalLong", "v", "writeHexadecimalUnsignedLong", "writeInt", "i", "writeIntLe", "writeLong", "writeLongLe", "writeShort", "s", "writeShortLe", "writeString", "string", "beginIndex", "endIndex", "writeTo", "writeUtf8", "writeUtf8CodePoint", "codePoint", "UnsafeCursor", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class Buffer implements okio.BufferedSource, okio.BufferedSink, java.lang.Cloneable, java.nio.channels.ByteChannel {
    public okio.Segment head;
    private long size;

    /* JADX INFO: compiled from: Buffer.kt */
    @kotlin.Metadata(m114d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\bJ\u0006\u0010\u0018\u001a\u00020\bJ\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m115d2 = {"Lokio/Buffer$UnsafeCursor;", "Ljava/io/Closeable;", "()V", "buffer", "Lokio/Buffer;", "data", "", "end", "", "offset", "", "readWrite", "", "segment", "Lokio/Segment;", "getSegment$okio", "()Lokio/Segment;", "setSegment$okio", "(Lokio/Segment;)V", "start", "close", "", "expandBuffer", "minByteCount", "next", "resizeBuffer", "newSize", "seek", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
    public static final class UnsafeCursor implements java.io.Closeable {
        public okio.Buffer buffer;
        public byte[] data;
        public int end;
        public long offset;
        public boolean readWrite;
        private okio.Segment segment;
        public int start;

        public UnsafeCursor() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.offset = r0
                r0 = -1
                r2.start = r0
                r2.end = r0
                return
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r5 = this;
                r0 = r5
                r1 = 0
                okio.Buffer r2 = r0.buffer
                if (r2 == 0) goto L8
                r2 = 1
                goto L9
            L8:
                r2 = 0
            L9:
                if (r2 == 0) goto L1e
                r2 = 0
                r0.buffer = r2
                r0.setSegment$okio(r2)
                r3 = -1
                r0.offset = r3
                r0.data = r2
                r2 = -1
                r0.start = r2
                r0.end = r2
                return
            L1e:
                r2 = 0
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r3 = "not attached to a buffer"
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        public final long expandBuffer(int r11) {
                r10 = this;
                r0 = r10
                r1 = 0
                r2 = 1
                r3 = 0
                if (r11 <= 0) goto L8
                r4 = r2
                goto L9
            L8:
                r4 = r3
            L9:
                if (r4 == 0) goto L79
                r4 = 8192(0x2000, float:1.148E-41)
                if (r11 > r4) goto L10
                goto L11
            L10:
                r2 = r3
            L11:
                if (r2 == 0) goto L5b
                okio.Buffer r2 = r0.buffer
                if (r2 == 0) goto L4d
                boolean r3 = r0.readWrite
                if (r3 == 0) goto L3f
                long r5 = r2.size()
                okio.Segment r3 = r2.writableSegment$okio(r11)
                int r7 = r3.limit
                int r7 = 8192 - r7
                r3.limit = r4
                long r8 = (long) r7
                long r8 = r8 + r5
                r2.setSize$okio(r8)
                r0.setSegment$okio(r3)
                r0.offset = r5
                byte[] r8 = r3.data
                r0.data = r8
                int r8 = 8192 - r7
                r0.start = r8
                r0.end = r4
                long r0 = (long) r7
                return r0
            L3f:
                r3 = 0
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "expandBuffer() only permitted for read/write buffers"
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
            L4d:
                r2 = 0
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r3 = "not attached to a buffer"
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L5b:
                r2 = 0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "minByteCount > Segment.SIZE: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r11)
                java.lang.String r2 = r3.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
            L79:
                r2 = 0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "minByteCount <= 0: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r11)
                java.lang.String r2 = r3.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
        }

        public final okio.Segment getSegment$okio() {
                r1 = this;
                okio.Segment r0 = r1.segment
                return r0
        }

        public final int next() {
                r6 = this;
                r0 = r6
                r1 = 0
                long r2 = r0.offset
                okio.Buffer r4 = r0.buffer
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
                long r4 = r4.size()
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 == 0) goto L13
                r2 = 1
                goto L14
            L13:
                r2 = 0
            L14:
                if (r2 == 0) goto L2f
                long r2 = r0.offset
                r4 = -1
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 != 0) goto L21
                r2 = 0
                goto L2a
            L21:
                long r2 = r0.offset
                int r4 = r0.end
                int r5 = r0.start
                int r4 = r4 - r5
                long r4 = (long) r4
                long r2 = r2 + r4
            L2a:
                int r2 = r0.seek(r2)
                return r2
            L2f:
                r2 = 0
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r3 = "no more bytes"
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        public final long resizeBuffer(long r17) {
                r16 = this;
                r0 = r17
                r2 = r16
                r3 = 0
                okio.Buffer r4 = r2.buffer
                if (r4 == 0) goto Lca
                boolean r5 = r2.readWrite
                if (r5 == 0) goto Lbc
                long r5 = r4.size()
                int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                r8 = 1
                r9 = 0
                if (r7 > 0) goto L79
                int r7 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
                if (r7 < 0) goto L1d
                goto L1e
            L1d:
                r8 = 0
            L1e:
                if (r8 == 0) goto L5b
                long r7 = r5 - r0
            L22:
                int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r11 <= 0) goto L4d
                okio.Segment r11 = r4.head
                kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
                okio.Segment r11 = r11.prev
                kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
                int r12 = r11.limit
                int r13 = r11.pos
                int r12 = r12 - r13
                long r13 = (long) r12
                int r13 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                if (r13 > 0) goto L46
                okio.Segment r13 = r11.pop()
                r4.head = r13
                okio.SegmentPool.recycle(r11)
                long r13 = (long) r12
                long r7 = r7 - r13
                goto L22
            L46:
                int r9 = r11.limit
                int r10 = (int) r7
                int r9 = r9 - r10
                r11.limit = r9
            L4d:
                r9 = 0
                r2.setSegment$okio(r9)
                r2.offset = r0
                r2.data = r9
                r9 = -1
                r2.start = r9
                r2.end = r9
                goto Lb7
            L5b:
                r7 = 0
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "newSize < 0: "
                java.lang.StringBuilder r8 = r8.append(r9)
                java.lang.StringBuilder r8 = r8.append(r0)
                java.lang.String r7 = r8.toString()
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r7 = r7.toString()
                r8.<init>(r7)
                throw r8
            L79:
                int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r7 <= 0) goto Lb7
                r7 = 1
                long r11 = r0 - r5
            L80:
                int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r13 <= 0) goto Lb7
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
                if (r7 == 0) goto Lb3
                r2.setSegment$okio(r13)
                r2.offset = r5
                byte[] r9 = r13.data
                r2.data = r9
                int r9 = r13.limit
                int r9 = r9 - r8
                r2.start = r9
                int r9 = r13.limit
                r2.end = r9
                r7 = 0
                r8 = 1
                r9 = 0
                goto L80
            Lb3:
                r8 = 1
                r9 = 0
                goto L80
            Lb7:
                r4.setSize$okio(r0)
                return r5
            Lbc:
                r5 = 0
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "resizeBuffer() only permitted for read/write buffers"
                java.lang.String r6 = r6.toString()
                r5.<init>(r6)
                throw r5
            Lca:
                r4 = 0
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "not attached to a buffer"
                java.lang.String r5 = r5.toString()
                r4.<init>(r5)
                throw r4
        }

        public final int seek(long r19) {
                r18 = this;
                r0 = r19
                r2 = r18
                r3 = 0
                okio.Buffer r4 = r2.buffer
                if (r4 == 0) goto L105
                r5 = -1
                int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r7 < 0) goto Lde
                long r7 = r4.size()
                int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r7 > 0) goto Lde
                int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r5 == 0) goto Lcf
                long r5 = r4.size()
                int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r5 != 0) goto L25
                goto Lcf
            L25:
                r5 = 0
                long r7 = r4.size()
                okio.Segment r9 = r4.head
                okio.Segment r10 = r4.head
                okio.Segment r11 = r2.getSegment$okio()
                if (r11 == 0) goto L54
                long r11 = r2.offset
                int r13 = r2.start
                okio.Segment r14 = r2.getSegment$okio()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r14)
                int r14 = r14.pos
                int r13 = r13 - r14
                long r13 = (long) r13
                long r11 = r11 - r13
                int r13 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
                if (r13 <= 0) goto L4f
                r7 = r11
                okio.Segment r10 = r2.getSegment$okio()
                goto L54
            L4f:
                r5 = r11
                okio.Segment r9 = r2.getSegment$okio()
            L54:
                r11 = 0
                r12 = 0
                long r14 = r7 - r0
                long r16 = r0 - r5
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 <= 0) goto L79
                r11 = r9
                r12 = r5
            L61:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
                int r14 = r11.limit
                int r15 = r11.pos
                int r14 = r14 - r15
                long r14 = (long) r14
                long r14 = r14 + r12
                int r14 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
                if (r14 < 0) goto L8f
                int r14 = r11.limit
                int r15 = r11.pos
                int r14 = r14 - r15
                long r14 = (long) r14
                long r12 = r12 + r14
                okio.Segment r11 = r11.next
                goto L61
            L79:
                r11 = r10
                r12 = r7
            L7b:
                int r14 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                if (r14 <= 0) goto L8f
                kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
                okio.Segment r11 = r11.prev
                kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
                int r14 = r11.limit
                int r15 = r11.pos
                int r14 = r14 - r15
                long r14 = (long) r14
                long r12 = r12 - r14
                goto L7b
            L8f:
                boolean r14 = r2.readWrite
                if (r14 == 0) goto Lb0
                kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
                boolean r14 = r11.shared
                if (r14 == 0) goto Lb0
                okio.Segment r14 = r11.unsharedCopy()
                okio.Segment r15 = r4.head
                if (r15 != r11) goto La4
                r4.head = r14
            La4:
                okio.Segment r11 = r11.push(r14)
                okio.Segment r15 = r11.prev
                kotlin.jvm.internal.Intrinsics.checkNotNull(r15)
                r15.pop()
            Lb0:
                r2.setSegment$okio(r11)
                r2.offset = r0
                kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
                byte[] r14 = r11.data
                r2.data = r14
                int r14 = r11.pos
                r15 = r5
                long r5 = r0 - r12
                int r5 = (int) r5
                int r14 = r14 + r5
                r2.start = r14
                int r5 = r11.limit
                r2.end = r5
                int r5 = r2.end
                int r6 = r2.start
                int r5 = r5 - r6
                goto Ldd
            Lcf:
                r5 = 0
                r2.setSegment$okio(r5)
                r2.offset = r0
                r2.data = r5
                r5 = -1
                r2.start = r5
                r2.end = r5
            Ldd:
                return r5
            Lde:
                java.lang.ArrayIndexOutOfBoundsException r5 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "offset="
                java.lang.StringBuilder r6 = r6.append(r7)
                java.lang.StringBuilder r6 = r6.append(r0)
                java.lang.String r7 = " > size="
                java.lang.StringBuilder r6 = r6.append(r7)
                long r7 = r4.size()
                java.lang.StringBuilder r6 = r6.append(r7)
                java.lang.String r6 = r6.toString()
                r5.<init>(r6)
                throw r5
            L105:
                r4 = 0
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "not attached to a buffer"
                java.lang.String r5 = r5.toString()
                r4.<init>(r5)
                throw r4
        }

        public final void setSegment$okio(okio.Segment r1) {
                r0 = this;
                r0.segment = r1
                return
        }
    }



    public Buffer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ okio.Buffer copyTo$default(okio.Buffer r6, java.io.OutputStream r7, long r8, long r10, int r12, java.lang.Object r13) throws java.io.IOException {
            r13 = r12 & 2
            if (r13 == 0) goto L8
            r8 = 0
            r2 = r8
            goto L9
        L8:
            r2 = r8
        L9:
            r8 = r12 & 4
            if (r8 == 0) goto L13
            long r8 = r6.size
            long r10 = r8 - r2
            r4 = r10
            goto L14
        L13:
            r4 = r10
        L14:
            r0 = r6
            r1 = r7
            okio.Buffer r6 = r0.copyTo(r1, r2, r4)
            return r6
    }

    public static /* synthetic */ okio.Buffer copyTo$default(okio.Buffer r0, okio.Buffer r1, long r2, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            r2 = 0
        L6:
            okio.Buffer r0 = r0.copyTo(r1, r2)
            return r0
    }

    public static /* synthetic */ okio.Buffer copyTo$default(okio.Buffer r6, okio.Buffer r7, long r8, long r10, int r12, java.lang.Object r13) {
            r12 = r12 & 2
            if (r12 == 0) goto L8
            r8 = 0
            r2 = r8
            goto L9
        L8:
            r2 = r8
        L9:
            r0 = r6
            r1 = r7
            r4 = r10
            okio.Buffer r6 = r0.copyTo(r1, r2, r4)
            return r6
    }

    private final okio.ByteString digest(java.lang.String r9) {
            r8 = this;
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r9)
            okio.Segment r1 = r8.head
            if (r1 == 0) goto L31
            r2 = 0
            byte[] r3 = r1.data
            int r4 = r1.pos
            int r5 = r1.limit
            int r6 = r1.pos
            int r5 = r5 - r6
            r0.update(r3, r4, r5)
            okio.Segment r3 = r1.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
        L1a:
            if (r3 == r1) goto L2f
            byte[] r4 = r3.data
            int r5 = r3.pos
            int r6 = r3.limit
            int r7 = r3.pos
            int r6 = r6 - r7
            r0.update(r4, r5, r6)
            okio.Segment r4 = r3.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r3 = r4
            goto L1a
        L2f:
        L31:
            okio.ByteString r1 = new okio.ByteString
            byte[] r2 = r0.digest()
            java.lang.String r3 = "digest(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.<init>(r2)
            return r1
    }

    private final okio.ByteString hmac(java.lang.String r9, okio.ByteString r10) {
            r8 = this;
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r9)     // Catch: java.security.InvalidKeyException -> L4f
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L4f
            byte[] r2 = r10.internalArray$okio()     // Catch: java.security.InvalidKeyException -> L4f
            r1.<init>(r2, r9)     // Catch: java.security.InvalidKeyException -> L4f
            java.security.Key r1 = (java.security.Key) r1     // Catch: java.security.InvalidKeyException -> L4f
            r0.init(r1)     // Catch: java.security.InvalidKeyException -> L4f
            okio.Segment r1 = r8.head     // Catch: java.security.InvalidKeyException -> L4f
            if (r1 == 0) goto L3f
            r2 = 0
            byte[] r3 = r1.data     // Catch: java.security.InvalidKeyException -> L4f
            int r4 = r1.pos     // Catch: java.security.InvalidKeyException -> L4f
            int r5 = r1.limit     // Catch: java.security.InvalidKeyException -> L4f
            int r6 = r1.pos     // Catch: java.security.InvalidKeyException -> L4f
            int r5 = r5 - r6
            r0.update(r3, r4, r5)     // Catch: java.security.InvalidKeyException -> L4f
            okio.Segment r3 = r1.next     // Catch: java.security.InvalidKeyException -> L4f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.security.InvalidKeyException -> L4f
        L29:
            if (r3 == r1) goto L3e
            byte[] r4 = r3.data     // Catch: java.security.InvalidKeyException -> L4f
            int r5 = r3.pos     // Catch: java.security.InvalidKeyException -> L4f
            int r6 = r3.limit     // Catch: java.security.InvalidKeyException -> L4f
            int r7 = r3.pos     // Catch: java.security.InvalidKeyException -> L4f
            int r6 = r6 - r7
            r0.update(r4, r5, r6)     // Catch: java.security.InvalidKeyException -> L4f
            okio.Segment r4 = r3.next     // Catch: java.security.InvalidKeyException -> L4f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch: java.security.InvalidKeyException -> L4f
            r3 = r4
            goto L29
        L3e:
        L3f:
            okio.ByteString r1 = new okio.ByteString     // Catch: java.security.InvalidKeyException -> L4f
            byte[] r2 = r0.doFinal()     // Catch: java.security.InvalidKeyException -> L4f
            java.lang.String r3 = "doFinal(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.security.InvalidKeyException -> L4f
            r1.<init>(r2)     // Catch: java.security.InvalidKeyException -> L4f
            return r1
        L4f:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.<init>(r2)
            throw r1
    }

    public static /* synthetic */ okio.Buffer.UnsafeCursor readAndWriteUnsafe$default(okio.Buffer r0, okio.Buffer.UnsafeCursor r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L8
            okio.Buffer$UnsafeCursor r1 = okio.SegmentedByteString.getDEFAULT__new_UnsafeCursor()
        L8:
            okio.Buffer$UnsafeCursor r0 = r0.readAndWriteUnsafe(r1)
            return r0
    }

    private final void readFrom(java.io.InputStream r10, long r11, boolean r13) throws java.io.IOException {
            r9 = this;
            r0 = r11
        L1:
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto Lb
            if (r13 == 0) goto La
            goto Lb
        La:
            return
        Lb:
            r2 = 1
            okio.Segment r2 = r9.writableSegment$okio(r2)
            int r3 = r2.limit
            int r3 = 8192 - r3
            r4 = 0
            long r5 = (long) r3
            long r5 = java.lang.Math.min(r0, r5)
            int r3 = (int) r5
            byte[] r4 = r2.data
            int r5 = r2.limit
            int r4 = r10.read(r4, r5, r3)
            r5 = -1
            if (r4 != r5) goto L3e
            int r5 = r2.pos
            int r6 = r2.limit
            if (r5 != r6) goto L35
            okio.Segment r5 = r2.pop()
            r9.head = r5
            okio.SegmentPool.recycle(r2)
        L35:
            if (r13 == 0) goto L38
            return
        L38:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L3e:
            int r5 = r2.limit
            int r5 = r5 + r4
            r2.limit = r5
            long r5 = r9.size
            long r7 = (long) r4
            long r5 = r5 + r7
            r9.size = r5
            long r5 = (long) r4
            long r0 = r0 - r5
            goto L1
    }

    public static /* synthetic */ okio.Buffer.UnsafeCursor readUnsafe$default(okio.Buffer r0, okio.Buffer.UnsafeCursor r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L8
            okio.Buffer$UnsafeCursor r1 = okio.SegmentedByteString.getDEFAULT__new_UnsafeCursor()
        L8:
            okio.Buffer$UnsafeCursor r0 = r0.readUnsafe(r1)
            return r0
    }

    public static /* synthetic */ okio.Buffer writeTo$default(okio.Buffer r0, java.io.OutputStream r1, long r2, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            long r2 = r0.size
        L6:
            okio.Buffer r0 = r0.writeTo(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @kotlin.ReplaceWith(expression = "this[index]", imports = {}))
    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m10367deprecated_getByte(long r2) {
            r1 = this;
            byte r0 = r1.getByte(r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "size", imports = {}))
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final long m10368deprecated_size() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public okio.Buffer buffer() {
            r0 = this;
            return r0
    }

    public final void clear() {
            r4 = this;
            r0 = r4
            r1 = 0
            long r2 = r0.size()
            r0.skip(r2)
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            okio.Buffer r0 = r1.m10369clone()
            return r0
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public okio.Buffer m10369clone() {
            r1 = this;
            okio.Buffer r0 = r1.copy()
            return r0
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    public final long completeSegmentByteCount() {
            r7 = this;
            r0 = r7
            r1 = 0
            long r2 = r0.size()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto Ld
            goto L29
        Ld:
            okio.Segment r4 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            okio.Segment r4 = r4.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r5 = r4.limit
            r6 = 8192(0x2000, float:1.148E-41)
            if (r5 >= r6) goto L28
            boolean r5 = r4.owner
            if (r5 == 0) goto L28
            int r5 = r4.limit
            int r6 = r4.pos
            int r5 = r5 - r6
            long r5 = (long) r5
            long r2 = r2 - r5
        L28:
            r4 = r2
        L29:
            return r4
    }

    public final okio.Buffer copy() {
            r8 = this;
            r0 = r8
            r1 = 0
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            long r3 = r0.size()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L12
            goto L43
        L12:
            okio.Segment r3 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.Segment r4 = r3.sharedCopy()
            r2.head = r4
            okio.Segment r5 = r2.head
            r4.prev = r5
            okio.Segment r5 = r4.prev
            r4.next = r5
            okio.Segment r5 = r3.next
        L27:
            if (r5 == r3) goto L3b
            okio.Segment r6 = r4.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            okio.Segment r7 = r5.sharedCopy()
            r6.push(r7)
            okio.Segment r5 = r5.next
            goto L27
        L3b:
            long r6 = r0.size()
            r2.setSize$okio(r6)
        L43:
            return r2
    }

    public final okio.Buffer copyTo(java.io.OutputStream r10) throws java.io.IOException {
            r9 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r7 = 6
            r8 = 0
            r3 = 0
            r5 = 0
            r1 = r9
            r2 = r10
            okio.Buffer r0 = copyTo$default(r1, r2, r3, r5, r7, r8)
            return r0
    }

    public final okio.Buffer copyTo(java.io.OutputStream r10, long r11) throws java.io.IOException {
            r9 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r7 = 4
            r8 = 0
            r5 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            okio.Buffer r0 = copyTo$default(r1, r2, r3, r5, r7, r8)
            return r0
    }

    public final okio.Buffer copyTo(java.io.OutputStream r15, long r16, long r18) throws java.io.IOException {
            r14 = this;
            r0 = r14
            r1 = r15
            java.lang.String r2 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r2)
            r4 = r16
            r8 = r18
            long r2 = r0.size
            r6 = r8
            okio.SegmentedByteString.checkOffsetAndCount(r2, r4, r6)
            r2 = 0
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 != 0) goto L18
            return r0
        L18:
            okio.Segment r6 = r0.head
        L1a:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            int r7 = r6.limit
            int r10 = r6.pos
            int r7 = r7 - r10
            long r10 = (long) r7
            int r7 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r7 < 0) goto L31
            int r7 = r6.limit
            int r10 = r6.pos
            int r7 = r7 - r10
            long r10 = (long) r7
            long r4 = r4 - r10
            okio.Segment r6 = r6.next
            goto L1a
        L31:
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 <= 0) goto L53
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            int r7 = r6.pos
            long r10 = (long) r7
            long r10 = r10 + r4
            int r7 = (int) r10
            int r10 = r6.limit
            int r10 = r10 - r7
            r11 = 0
            long r12 = (long) r10
            long r12 = java.lang.Math.min(r12, r8)
            int r10 = (int) r12
            byte[] r11 = r6.data
            r15.write(r11, r7, r10)
            long r11 = (long) r10
            long r8 = r8 - r11
            r4 = 0
            okio.Segment r6 = r6.next
            goto L31
        L53:
            return r0
    }

    public final okio.Buffer copyTo(okio.Buffer r9, long r10) {
            r8 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            long r0 = r8.size
            long r6 = r0 - r10
            r2 = r8
            r3 = r9
            r4 = r10
            okio.Buffer r0 = r2.copyTo(r3, r4, r6)
            return r0
    }

    public final okio.Buffer copyTo(okio.Buffer r14, long r15, long r17) {
            r13 = this;
            r0 = r14
            java.lang.String r1 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            r1 = r13
            r2 = 0
            r5 = r15
            r9 = r17
            long r3 = r1.size()
            r7 = r9
            okio.SegmentedByteString.checkOffsetAndCount(r3, r5, r7)
            r3 = 0
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 != 0) goto L1a
            goto L81
        L1a:
            long r7 = r14.size()
            long r7 = r7 + r9
            r14.setSize$okio(r7)
            okio.Segment r7 = r1.head
        L24:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            int r8 = r7.limit
            int r11 = r7.pos
            int r8 = r8 - r11
            long r11 = (long) r8
            int r8 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r8 < 0) goto L3b
            int r8 = r7.limit
            int r11 = r7.pos
            int r8 = r8 - r11
            long r11 = (long) r8
            long r5 = r5 - r11
            okio.Segment r7 = r7.next
            goto L24
        L3b:
            int r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r8 <= 0) goto L80
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
            okio.Segment r11 = r0.head
            if (r11 != 0) goto L67
            r8.prev = r8
            okio.Segment r11 = r8.prev
            r8.next = r11
            okio.Segment r11 = r8.next
            r0.head = r11
            goto L74
        L67:
            okio.Segment r11 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            okio.Segment r11 = r11.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            r11.push(r8)
        L74:
            int r11 = r8.limit
            int r12 = r8.pos
            int r11 = r11 - r12
            long r11 = (long) r11
            long r9 = r9 - r11
            r5 = 0
            okio.Segment r7 = r7.next
            goto L3b
        L80:
        L81:
            return r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer emit() {
            r0 = this;
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink emit() {
            r1 = this;
            okio.Buffer r0 = r1.emit()
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer emitCompleteSegments() {
            r0 = this;
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink emitCompleteSegments() {
            r1 = this;
            okio.Buffer r0 = r1.emitCompleteSegments()
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    public boolean equals(java.lang.Object r19) {
            r18 = this;
            r0 = r19
            r1 = r18
            r2 = 0
            r3 = 1
            if (r1 != r0) goto La
            goto L90
        La:
            boolean r4 = r0 instanceof okio.Buffer
            r5 = 0
            if (r4 != 0) goto L12
            r3 = r5
            goto L90
        L12:
            long r6 = r1.size()
            r4 = r0
            okio.Buffer r4 = (okio.Buffer) r4
            long r8 = r4.size()
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L24
            r3 = r5
            goto L90
        L24:
            long r6 = r1.size()
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L2f
            goto L90
        L2f:
            okio.Segment r4 = r1.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r6 = r0
            okio.Buffer r6 = (okio.Buffer) r6
            okio.Segment r6 = r6.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            int r7 = r4.pos
            int r8 = r6.pos
            r9 = 0
            r11 = 0
        L44:
            long r13 = r1.size()
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r13 >= 0) goto L8f
            int r13 = r4.limit
            int r13 = r13 - r7
            int r14 = r6.limit
            int r14 = r14 - r8
            int r13 = java.lang.Math.min(r13, r14)
            long r11 = (long) r13
            r13 = 0
        L59:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L75
            byte[] r15 = r4.data
            int r16 = r7 + 1
            r7 = r15[r7]
            byte[] r15 = r6.data
            int r17 = r8 + 1
            r8 = r15[r8]
            if (r7 == r8) goto L6d
            r3 = r5
            goto L90
        L6d:
            r7 = 1
            long r13 = r13 + r7
            r7 = r16
            r8 = r17
            goto L59
        L75:
            int r13 = r4.limit
            if (r7 != r13) goto L81
            okio.Segment r13 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13)
            r4 = r13
            int r7 = r4.pos
        L81:
            int r13 = r6.limit
            if (r8 != r13) goto L8d
            okio.Segment r13 = r6.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13)
            r6 = r13
            int r8 = r6.pos
        L8d:
            long r9 = r9 + r11
            goto L44
        L8f:
        L90:
            return r3
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
            r4 = this;
            long r0 = r4.size
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
            r0 = this;
            return
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public okio.Buffer getBuffer() {
            r0 = this;
            return r0
    }

    public final byte getByte(long r15) {
            r14 = this;
            r6 = r14
            r7 = 0
            long r0 = r6.size()
            r4 = 1
            r2 = r15
            okio.SegmentedByteString.checkOffsetAndCount(r0, r2, r4)
            r0 = r6
            r1 = 0
            okio.Segment r2 = r0.head
            if (r2 != 0) goto L24
            r2 = 0
            r3 = -1
            r5 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            byte[] r8 = r2.data
            int r9 = r2.pos
            long r9 = (long) r9
            long r9 = r9 + r15
            long r9 = r9 - r3
            int r9 = (int) r9
            r8 = r8[r9]
            goto L7c
        L24:
            long r3 = r0.size()
            long r3 = r3 - r15
            int r3 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r3 >= 0) goto L55
            long r3 = r0.size()
        L32:
            int r5 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r5 <= 0) goto L44
            okio.Segment r5 = r2.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r2 = r5
            int r5 = r2.limit
            int r8 = r2.pos
            int r5 = r5 - r8
            long r8 = (long) r5
            long r3 = r3 - r8
            goto L32
        L44:
            r5 = r2
            r8 = r3
            r10 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            byte[] r11 = r5.data
            int r12 = r5.pos
            long r12 = (long) r12
            long r12 = r12 + r15
            long r12 = r12 - r8
            int r12 = (int) r12
            r11 = r11[r12]
            goto L7b
        L55:
            r3 = 0
        L57:
            int r5 = r2.limit
            int r8 = r2.pos
            int r5 = r5 - r8
            long r8 = (long) r5
            long r8 = r8 + r3
            int r5 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r5 > 0) goto L6b
            okio.Segment r5 = r2.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r2 = r5
            r3 = r8
            goto L57
        L6b:
            r5 = r2
            r8 = r3
            r10 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            byte[] r11 = r5.data
            int r12 = r5.pos
            long r12 = (long) r12
            long r12 = r12 + r15
            long r12 = r12 - r8
            int r12 = (int) r12
            r11 = r11[r12]
        L7b:
            r8 = r11
        L7c:
            return r8
    }

    public int hashCode() {
            r8 = this;
            r0 = r8
            r1 = 0
            okio.Segment r2 = r0.head
            if (r2 != 0) goto L8
            r2 = 0
            goto L25
        L8:
            r3 = 1
        L9:
            int r4 = r2.pos
            int r5 = r2.limit
        Ld:
            if (r4 >= r5) goto L1a
            int r6 = r3 * 31
            byte[] r7 = r2.data
            r7 = r7[r4]
            int r3 = r6 + r7
            int r4 = r4 + 1
            goto Ld
        L1a:
            okio.Segment r6 = r2.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r2 = r6
            okio.Segment r4 = r0.head
            if (r2 != r4) goto L9
            r2 = r3
        L25:
            return r2
    }

    public final okio.ByteString hmacSha1(okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "HmacSHA1"
            okio.ByteString r0 = r1.hmac(r0, r2)
            return r0
    }

    public final okio.ByteString hmacSha256(okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "HmacSHA256"
            okio.ByteString r0 = r1.hmac(r0, r2)
            return r0
    }

    public final okio.ByteString hmacSha512(okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "HmacSHA512"
            okio.ByteString r0 = r1.hmac(r0, r2)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOf(byte r7) {
            r6 = this;
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = r6
            r1 = r7
            long r0 = r0.indexOf(r1, r2, r4)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOf(byte r7, long r8) {
            r6 = this;
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = r6
            r1 = r7
            r2 = r8
            long r0 = r0.indexOf(r1, r2, r4)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOf(byte r30, long r31, long r33) {
            r29 = this;
            r0 = r30
            r1 = r29
            r2 = 0
            r3 = 0
            r3 = r31
            r5 = 0
            r5 = r33
            r7 = 0
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            r8 = 0
            if (r7 > 0) goto L19
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L19
            r8 = 1
        L19:
            if (r8 == 0) goto L154
            long r7 = r1.size()
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 <= 0) goto L27
            long r5 = r1.size()
        L27:
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L2f
            r8 = -1
            goto L153
        L2f:
            r10 = r3
            r7 = r1
            r12 = 0
            okio.Segment r13 = r7.head
            if (r13 != 0) goto L3f
            r13 = 0
            r14 = -1
            r16 = 0
            r8 = -1
            goto L153
        L3f:
            long r14 = r7.size()
            long r14 = r14 - r10
            int r14 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r14 >= 0) goto Ld4
            long r14 = r7.size()
        L4d:
            int r16 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r16 <= 0) goto L5f
            okio.Segment r8 = r13.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            r13 = r8
            int r8 = r13.limit
            int r9 = r13.pos
            int r8 = r8 - r9
            long r8 = (long) r8
            long r14 = r14 - r8
            goto L4d
        L5f:
            r8 = r13
            r17 = r14
            r9 = 0
            if (r8 != 0) goto L69
            r8 = -1
            goto L153
        L69:
            r19 = r8
            r20 = r17
            r28 = r19
            r19 = r2
            r2 = r28
        L73:
            int r22 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r22 >= 0) goto Lc6
            r22 = r7
            byte[] r7 = r2.data
            r23 = r8
            int r8 = r2.limit
            r24 = r9
            long r8 = (long) r8
            r25 = r12
            int r12 = r2.pos
            r26 = r13
            long r12 = (long) r12
            long r12 = r12 + r5
            long r12 = r12 - r20
            long r8 = java.lang.Math.min(r8, r12)
            int r8 = (int) r8
            int r9 = r2.pos
            long r12 = (long) r9
            long r12 = r12 + r3
            long r12 = r12 - r20
            int r9 = (int) r12
        L98:
            if (r9 >= r8) goto Lab
            r12 = r7[r9]
            if (r12 != r0) goto La8
            int r12 = r2.pos
            int r12 = r9 - r12
            long r12 = (long) r12
            long r12 = r12 + r20
            r8 = r12
            goto L153
        La8:
            int r9 = r9 + 1
            goto L98
        Lab:
            int r12 = r2.limit
            int r13 = r2.pos
            int r12 = r12 - r13
            long r12 = (long) r12
            long r20 = r20 + r12
            r3 = r20
            okio.Segment r12 = r2.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r12)
            r2 = r12
            r7 = r22
            r8 = r23
            r9 = r24
            r12 = r25
            r13 = r26
            goto L73
        Lc6:
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r12
            r26 = r13
            r8 = -1
            goto L153
        Ld4:
            r19 = r2
            r22 = r7
            r25 = r12
            r7 = 0
        Ldc:
            int r2 = r13.limit
            int r9 = r13.pos
            int r2 = r2 - r9
            long r14 = (long) r2
            long r14 = r14 + r7
            int r2 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r2 > 0) goto Lf0
            okio.Segment r2 = r13.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r13 = r2
            r7 = r14
            goto Ldc
        Lf0:
            r2 = r13
            r14 = r7
            r9 = 0
            if (r2 != 0) goto Lf8
            r8 = -1
            goto L153
        Lf8:
            r12 = r2
            r17 = r14
        Lfb:
            int r20 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r20 >= 0) goto L149
            r20 = r2
            byte[] r2 = r12.data
            r23 = r7
            int r7 = r12.limit
            long r7 = (long) r7
            r21 = r9
            int r9 = r12.pos
            r26 = r10
            long r9 = (long) r9
            long r9 = r9 + r5
            long r9 = r9 - r17
            long r7 = java.lang.Math.min(r7, r9)
            int r7 = (int) r7
            int r8 = r12.pos
            long r8 = (long) r8
            long r8 = r8 + r3
            long r8 = r8 - r17
            int r8 = (int) r8
        L11e:
            if (r8 >= r7) goto L130
            r9 = r2[r8]
            if (r9 != r0) goto L12d
            int r9 = r12.pos
            int r9 = r8 - r9
            long r9 = (long) r9
            long r9 = r9 + r17
            r8 = r9
            goto L153
        L12d:
            int r8 = r8 + 1
            goto L11e
        L130:
            int r9 = r12.limit
            int r10 = r12.pos
            int r9 = r9 - r10
            long r9 = (long) r9
            long r17 = r17 + r9
            r3 = r17
            okio.Segment r9 = r12.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            r12 = r9
            r2 = r20
            r9 = r21
            r7 = r23
            r10 = r26
            goto Lfb
        L149:
            r20 = r2
            r23 = r7
            r21 = r9
            r26 = r10
            r8 = -1
        L153:
            return r8
        L154:
            r19 = r2
            r2 = 0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "size="
            java.lang.StringBuilder r7 = r7.append(r8)
            long r8 = r1.size()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = " fromIndex="
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r3)
            java.lang.String r8 = " toIndex="
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r5)
            java.lang.String r2 = r7.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r7.<init>(r2)
            throw r7
    }

    @Override // okio.BufferedSource
    public long indexOf(okio.ByteString r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            long r0 = r2.indexOf(r3, r0)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOf(okio.ByteString r32, long r33) throws java.io.IOException {
            r31 = this;
            java.lang.String r0 = "bytes"
            r1 = r32
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = r31
            r2 = 0
            r3 = 0
            r3 = r33
            int r5 = r32.size()
            r6 = 0
            if (r5 <= 0) goto L17
            r5 = 1
            goto L18
        L17:
            r5 = r6
        L18:
            if (r5 == 0) goto L1af
            r8 = 0
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 < 0) goto L22
            r5 = 1
            goto L23
        L22:
            r5 = r6
        L23:
            if (r5 == 0) goto L18d
            r8 = r3
            r5 = r0
            r10 = 0
            okio.Segment r11 = r5.head
            if (r11 != 0) goto L34
            r6 = 0
            r14 = -1
            r7 = 0
            r12 = -1
            goto L18c
        L34:
            long r14 = r5.size()
            long r14 = r14 - r8
            int r14 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r14 >= 0) goto Le9
            long r17 = r5.size()
        L42:
            int r14 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r14 <= 0) goto L55
            okio.Segment r14 = r11.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r14)
            r11 = r14
            int r14 = r11.limit
            int r12 = r11.pos
            int r14 = r14 - r12
            long r12 = (long) r14
            long r17 = r17 - r12
            goto L42
        L55:
            r12 = r11
            r13 = r17
            r19 = 0
            if (r12 != 0) goto L60
            r12 = -1
            goto L18c
        L60:
            r20 = r12
            r21 = r13
            byte[] r7 = r32.internalArray$okio()
            r6 = r7[r6]
            int r15 = r32.size()
            long r25 = r0.size()
            r16 = r2
            long r1 = (long) r15
            long r25 = r25 - r1
            r1 = 1
            long r25 = r25 + r1
            r1 = r20
        L7d:
            int r2 = (r21 > r25 ? 1 : (r21 == r25 ? 0 : -1))
            if (r2 >= 0) goto Ldb
            byte[] r2 = r1.data
            r20 = r5
            int r5 = r1.limit
            r27 = r10
            int r10 = r1.pos
            r23 = r11
            long r10 = (long) r10
            long r10 = r10 + r25
            long r10 = r10 - r21
            r24 = 0
            r28 = r12
            r29 = r13
            long r12 = (long) r5
            long r12 = java.lang.Math.min(r12, r10)
            int r5 = (int) r12
            int r10 = r1.pos
            long r10 = (long) r10
            long r10 = r10 + r3
            long r10 = r10 - r21
            int r10 = (int) r10
        La5:
            if (r10 >= r5) goto Lc0
            r11 = r2[r10]
            if (r11 != r6) goto Lbd
            int r11 = r10 + 1
            r12 = 1
            boolean r11 = okio.internal.Buffer.rangeEquals(r1, r11, r7, r12, r15)
            if (r11 == 0) goto Lbd
            int r11 = r1.pos
            int r11 = r10 - r11
            long r11 = (long) r11
            long r12 = r11 + r21
            goto L18c
        Lbd:
            int r10 = r10 + 1
            goto La5
        Lc0:
            int r10 = r1.limit
            int r11 = r1.pos
            int r10 = r10 - r11
            long r10 = (long) r10
            long r21 = r21 + r10
            r3 = r21
            okio.Segment r10 = r1.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            r1 = r10
            r5 = r20
            r11 = r23
            r10 = r27
            r12 = r28
            r13 = r29
            goto L7d
        Ldb:
            r20 = r5
            r27 = r10
            r23 = r11
            r28 = r12
            r29 = r13
            r12 = -1
            goto L18c
        Le9:
            r16 = r2
            r20 = r5
            r27 = r10
            r1 = 0
        Lf1:
            int r5 = r11.limit
            int r7 = r11.pos
            int r5 = r5 - r7
            long r12 = (long) r5
            long r12 = r12 + r1
            int r5 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r5 > 0) goto L105
            okio.Segment r5 = r11.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r11 = r5
            r1 = r12
            goto Lf1
        L105:
            r5 = r11
            r12 = r1
            r7 = 0
            if (r5 != 0) goto L10e
            r12 = -1
            goto L18c
        L10e:
            r10 = r5
            r14 = r12
            r17 = r1
            byte[] r1 = r32.internalArray$okio()
            r2 = r1[r6]
            int r6 = r32.size()
            long r21 = r0.size()
            r25 = r8
            r9 = r7
            long r7 = (long) r6
            long r21 = r21 - r7
            r7 = 1
            long r21 = r21 + r7
        L12a:
            int r7 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r7 >= 0) goto L183
            byte[] r7 = r10.data
            int r8 = r10.limit
            r19 = r0
            int r0 = r10.pos
            r23 = r11
            r28 = r12
            long r11 = (long) r0
            long r11 = r11 + r21
            long r11 = r11 - r14
            r0 = 0
            r24 = r0
            r13 = r1
            long r0 = (long) r8
            long r0 = java.lang.Math.min(r0, r11)
            int r0 = (int) r0
            int r1 = r10.pos
            long r11 = (long) r1
            long r11 = r11 + r3
            long r11 = r11 - r14
            int r1 = (int) r11
        L14e:
            if (r1 >= r0) goto L16b
            r8 = r7[r1]
            if (r8 != r2) goto L165
            int r8 = r1 + 1
            r11 = r13
            r12 = 1
            boolean r8 = okio.internal.Buffer.rangeEquals(r10, r8, r11, r12, r6)
            if (r8 == 0) goto L167
            int r8 = r10.pos
            int r8 = r1 - r8
            long r12 = (long) r8
            long r12 = r12 + r14
            goto L18c
        L165:
            r11 = r13
            r12 = 1
        L167:
            int r1 = r1 + 1
            r13 = r11
            goto L14e
        L16b:
            r11 = r13
            r12 = 1
            int r1 = r10.limit
            int r8 = r10.pos
            int r1 = r1 - r8
            long r12 = (long) r1
            long r14 = r14 + r12
            r3 = r14
            okio.Segment r1 = r10.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r10 = r1
            r1 = r11
            r0 = r19
            r11 = r23
            r12 = r28
            goto L12a
        L183:
            r19 = r0
            r23 = r11
            r28 = r12
            r11 = r1
            r12 = -1
        L18c:
            return r12
        L18d:
            r19 = r0
            r16 = r2
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "fromIndex < 0: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L1af:
            r19 = r0
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "bytes is empty"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.BufferedSource
    public long indexOfElement(okio.ByteString r3) {
            r2 = this;
            java.lang.String r0 = "targetBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            long r0 = r2.indexOfElement(r3, r0)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOfElement(okio.ByteString r30, long r31) {
            r29 = this;
            r0 = r30
            java.lang.String r1 = "targetBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = r29
            r2 = 0
            r3 = 0
            r3 = r31
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r6 = 0
            if (r5 < 0) goto L17
            r5 = 1
            goto L18
        L17:
            r5 = r6
        L18:
            if (r5 == 0) goto L230
            r8 = r3
            r5 = r1
            r10 = 0
            okio.Segment r11 = r5.head
            if (r11 != 0) goto L29
            r6 = 0
            r14 = -1
            r7 = 0
            r12 = -1
            goto L22f
        L29:
            long r14 = r5.size()
            long r14 = r14 - r8
            int r14 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            r15 = 2
            if (r14 >= 0) goto L133
            long r16 = r5.size()
        L38:
            int r14 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r14 <= 0) goto L4b
            okio.Segment r14 = r11.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r14)
            r11 = r14
            int r14 = r11.limit
            int r12 = r11.pos
            int r14 = r14 - r12
            long r12 = (long) r14
            long r16 = r16 - r12
            goto L38
        L4b:
            r12 = r11
            r13 = r16
            r18 = 0
            if (r12 != 0) goto L56
            r12 = -1
            goto L22f
        L56:
            r19 = r12
            r20 = r13
            int r7 = r30.size()
            if (r7 != r15) goto Lca
            byte r6 = r0.getByte(r6)
            r7 = 1
            byte r7 = r0.getByte(r7)
            r15 = r19
        L6b:
            long r22 = r1.size()
            int r19 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r19 >= 0) goto Lbe
            r23 = r2
            byte[] r2 = r15.data
            r24 = r5
            int r5 = r15.pos
            r25 = r10
            r22 = r11
            long r10 = (long) r5
            long r10 = r10 + r3
            long r10 = r10 - r20
            int r5 = (int) r10
            int r10 = r15.limit
        L86:
            if (r5 >= r10) goto La1
            r11 = r2[r5]
            if (r11 == r6) goto L93
            if (r11 != r7) goto L8f
            goto L93
        L8f:
            int r5 = r5 + 1
            goto L86
        L93:
            r19 = r2
            int r2 = r15.pos
            int r2 = r5 - r2
            r26 = r3
            long r2 = (long) r2
            long r2 = r2 + r20
            r12 = r2
            goto L22f
        La1:
            r19 = r2
            r26 = r3
            int r2 = r15.limit
            int r3 = r15.pos
            int r2 = r2 - r3
            long r2 = (long) r2
            long r20 = r20 + r2
            r3 = r20
            okio.Segment r2 = r15.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r15 = r2
            r11 = r22
            r2 = r23
            r5 = r24
            r10 = r25
            goto L6b
        Lbe:
            r23 = r2
            r26 = r3
            r24 = r5
            r25 = r10
            r22 = r11
            goto L12f
        Lca:
            r23 = r2
            r24 = r5
            r25 = r10
            r22 = r11
            byte[] r2 = r30.internalArray$okio()
            r5 = r19
        Ld8:
            long r10 = r1.size()
            int r7 = (r20 > r10 ? 1 : (r20 == r10 ? 0 : -1))
            if (r7 >= 0) goto L12a
            byte[] r7 = r5.data
            int r10 = r5.pos
            long r10 = (long) r10
            long r10 = r10 + r3
            long r10 = r10 - r20
            int r10 = (int) r10
            int r11 = r5.limit
        Leb:
            if (r10 >= r11) goto L112
            r15 = r7[r10]
            int r6 = r2.length
            r26 = r3
            r3 = 0
        Lf3:
            if (r3 >= r6) goto L10a
            r4 = r2[r3]
            if (r15 != r4) goto L105
            int r3 = r5.pos
            int r3 = r10 - r3
            r28 = r2
            long r2 = (long) r3
            long r2 = r2 + r20
            r12 = r2
            goto L22f
        L105:
            r28 = r2
            int r3 = r3 + 1
            goto Lf3
        L10a:
            r28 = r2
            int r10 = r10 + 1
            r3 = r26
            r6 = 0
            goto Leb
        L112:
            r28 = r2
            r26 = r3
            int r2 = r5.limit
            int r3 = r5.pos
            int r2 = r2 - r3
            long r2 = (long) r2
            long r20 = r20 + r2
            r3 = r20
            okio.Segment r2 = r5.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r5 = r2
            r2 = r28
            r6 = 0
            goto Ld8
        L12a:
            r28 = r2
            r26 = r3
            r15 = r5
        L12f:
            r12 = -1
            goto L22f
        L133:
            r23 = r2
            r24 = r5
            r25 = r10
            r5 = 0
        L13b:
            int r2 = r11.limit
            int r7 = r11.pos
            int r2 = r2 - r7
            long r12 = (long) r2
            long r12 = r12 + r5
            int r2 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r2 > 0) goto L14f
            okio.Segment r2 = r11.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r11 = r2
            r5 = r12
            goto L13b
        L14f:
            r2 = r11
            r12 = r5
            r7 = 0
            if (r2 != 0) goto L158
            r12 = -1
            goto L22f
        L158:
            r10 = r2
            r16 = r12
            int r14 = r30.size()
            if (r14 != r15) goto L1c5
            r14 = 0
            byte r14 = r0.getByte(r14)
            r15 = 1
            byte r15 = r0.getByte(r15)
        L16b:
            long r18 = r1.size()
            int r18 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r18 >= 0) goto L1bb
            byte[] r0 = r10.data
            r18 = r2
            int r2 = r10.pos
            r19 = r5
            long r5 = (long) r2
            long r5 = r5 + r3
            long r5 = r5 - r16
            int r2 = (int) r5
            int r5 = r10.limit
        L182:
            if (r2 >= r5) goto L19e
            r6 = r0[r2]
            if (r6 == r14) goto L18f
            if (r6 != r15) goto L18b
            goto L18f
        L18b:
            int r2 = r2 + 1
            goto L182
        L18f:
            r21 = r0
            int r0 = r10.pos
            int r0 = r2 - r0
            r26 = r3
            r4 = r2
            long r2 = (long) r0
            long r2 = r2 + r16
            r12 = r2
            goto L22f
        L19e:
            r21 = r0
            r26 = r3
            r4 = r2
            int r0 = r10.limit
            int r2 = r10.pos
            int r0 = r0 - r2
            long r2 = (long) r0
            long r16 = r16 + r2
            r2 = r16
            okio.Segment r0 = r10.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r10 = r0
            r0 = r30
            r3 = r2
            r2 = r18
            r5 = r19
            goto L16b
        L1bb:
            r18 = r2
            r26 = r3
            r19 = r5
            r22 = r1
            goto L22d
        L1c5:
            r18 = r2
            r19 = r5
            r14 = 0
            byte[] r0 = r30.internalArray$okio()
        L1ce:
            long r5 = r1.size()
            int r2 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r2 >= 0) goto L229
            byte[] r2 = r10.data
            int r5 = r10.pos
            long r5 = (long) r5
            long r5 = r5 + r3
            long r5 = r5 - r16
            int r5 = (int) r5
            int r6 = r10.limit
        L1e1:
            if (r5 >= r6) goto L20d
            r15 = r2[r5]
            int r14 = r0.length
            r22 = r1
            r1 = 0
        L1e9:
            if (r1 >= r14) goto L203
            r26 = r2
            r2 = r0[r1]
            if (r15 != r2) goto L1fc
            int r1 = r10.pos
            int r1 = r5 - r1
            r27 = r0
            long r0 = (long) r1
            long r0 = r0 + r16
            r12 = r0
            goto L22f
        L1fc:
            r27 = r0
            int r1 = r1 + 1
            r2 = r26
            goto L1e9
        L203:
            r27 = r0
            r26 = r2
            int r5 = r5 + 1
            r1 = r22
            r14 = 0
            goto L1e1
        L20d:
            r27 = r0
            r22 = r1
            r26 = r2
            int r0 = r10.limit
            int r1 = r10.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r16 = r16 + r0
            r3 = r16
            okio.Segment r0 = r10.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r10 = r0
            r1 = r22
            r0 = r27
            r14 = 0
            goto L1ce
        L229:
            r27 = r0
            r22 = r1
        L22d:
            r12 = -1
        L22f:
            return r12
        L230:
            r22 = r1
            r23 = r2
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "fromIndex < 0: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // okio.BufferedSource
    public java.io.InputStream inputStream() {
            r1 = this;
            okio.Buffer$inputStream$1 r0 = new okio.Buffer$inputStream$1
            r0.<init>(r1)
            java.io.InputStream r0 = (java.io.InputStream) r0
            return r0
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final okio.ByteString md5() {
            r1 = this;
            java.lang.String r0 = "MD5"
            okio.ByteString r0 = r1.digest(r0)
            return r0
    }

    @Override // okio.BufferedSink
    public java.io.OutputStream outputStream() {
            r1 = this;
            okio.Buffer$outputStream$1 r0 = new okio.Buffer$outputStream$1
            r0.<init>(r1)
            java.io.OutputStream r0 = (java.io.OutputStream) r0
            return r0
    }

    @Override // okio.BufferedSource
    public okio.BufferedSource peek() {
            r2 = this;
            okio.PeekSource r0 = new okio.PeekSource
            r1 = r2
            okio.BufferedSource r1 = (okio.BufferedSource) r1
            r0.<init>(r1)
            okio.Source r0 = (okio.Source) r0
            okio.BufferedSource r0 = okio.Okio.buffer(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long r8, okio.ByteString r10) {
            r7 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r5 = 0
            int r6 = r10.size()
            r1 = r7
            r2 = r8
            r4 = r10
            boolean r0 = r1.rangeEquals(r2, r4, r5, r6)
            return r0
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long r9, okio.ByteString r11, int r12, int r13) {
            r8 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = r8
            r1 = 0
            r2 = 0
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r3 = 0
            if (r2 < 0) goto L3b
            if (r12 < 0) goto L3b
            if (r13 < 0) goto L3b
            long r4 = r0.size()
            long r4 = r4 - r9
            long r6 = (long) r13
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L3b
            int r2 = r11.size()
            int r2 = r2 - r12
            if (r2 >= r13) goto L24
            goto L3b
        L24:
            r2 = 0
        L25:
            if (r2 >= r13) goto L39
            long r4 = (long) r2
            long r4 = r4 + r9
            byte r4 = r0.getByte(r4)
            int r5 = r12 + r2
            byte r5 = r11.getByte(r5)
            if (r4 == r5) goto L36
            goto L3c
        L36:
            int r2 = r2 + 1
            goto L25
        L39:
            r3 = 1
            goto L3c
        L3b:
        L3c:
            return r3
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer r7) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            okio.Segment r0 = r6.head
            if (r0 != 0) goto Lb
            r0 = -1
            return r0
        Lb:
            int r1 = r7.remaining()
            int r2 = r0.limit
            int r3 = r0.pos
            int r2 = r2 - r3
            int r1 = java.lang.Math.min(r1, r2)
            byte[] r2 = r0.data
            int r3 = r0.pos
            r7.put(r2, r3, r1)
            int r2 = r0.pos
            int r2 = r2 + r1
            r0.pos = r2
            long r2 = r6.size
            long r4 = (long) r1
            long r2 = r2 - r4
            r6.size = r2
            int r2 = r0.pos
            int r3 = r0.limit
            if (r2 != r3) goto L39
            okio.Segment r2 = r0.pop()
            r6.head = r2
            okio.SegmentPool.recycle(r0)
        L39:
            return r1
    }

    @Override // okio.BufferedSource
    public int read(byte[] r5) {
            r4 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            r1 = 0
            r2 = 0
            int r3 = r5.length
            int r0 = r0.read(r5, r2, r3)
            return r0
    }

    @Override // okio.BufferedSource
    public int read(byte[] r10, int r11, int r12) {
            r9 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = r9
            r1 = 0
            int r2 = r10.length
            long r3 = (long) r2
            long r5 = (long) r11
            long r7 = (long) r12
            okio.SegmentedByteString.checkOffsetAndCount(r3, r5, r7)
            okio.Segment r2 = r0.head
            if (r2 != 0) goto L14
            r2 = -1
            goto L47
        L14:
            int r3 = r2.limit
            int r4 = r2.pos
            int r3 = r3 - r4
            int r3 = java.lang.Math.min(r12, r3)
            byte[] r4 = r2.data
            int r5 = r2.pos
            int r6 = r2.pos
            int r6 = r6 + r3
            kotlin.collections.ArraysKt.copyInto(r4, r10, r11, r5, r6)
            int r4 = r2.pos
            int r4 = r4 + r3
            r2.pos = r4
            long r4 = r0.size()
            long r6 = (long) r3
            long r4 = r4 - r6
            r0.setSize$okio(r4)
            int r4 = r2.pos
            int r5 = r2.limit
            if (r4 != r5) goto L46
            okio.Segment r4 = r2.pop()
            r0.head = r4
            okio.SegmentPool.recycle(r2)
        L46:
            r2 = r3
        L47:
            return r2
    }

    @Override // okio.Source
    public long read(okio.Buffer r9, long r10) {
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r8
            r1 = 0
            r2 = 0
            r2 = r10
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L12
            r6 = 1
            goto L13
        L12:
            r6 = 0
        L13:
            if (r6 == 0) goto L31
            long r6 = r0.size()
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 != 0) goto L20
            r4 = -1
            goto L30
        L20:
            long r4 = r0.size()
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L2c
            long r2 = r0.size()
        L2c:
            r9.write(r0, r2)
            r4 = r2
        L30:
            return r4
        L31:
            r4 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "byteCount < 0: "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r4 = r5.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    @Override // okio.BufferedSource
    public long readAll(okio.Sink r7) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r6
            r1 = 0
            long r2 = r0.size()
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L14
            r7.write(r0, r2)
        L14:
            return r2
    }

    public final okio.Buffer.UnsafeCursor readAndWriteUnsafe() {
            r2 = this;
            r0 = 0
            r1 = 1
            okio.Buffer$UnsafeCursor r0 = readAndWriteUnsafe$default(r2, r0, r1, r0)
            return r0
    }

    public final okio.Buffer.UnsafeCursor readAndWriteUnsafe(okio.Buffer.UnsafeCursor r2) {
            r1 = this;
            java.lang.String r0 = "unsafeCursor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Buffer$UnsafeCursor r0 = okio.internal.Buffer.commonReadAndWriteUnsafe(r1, r2)
            return r0
    }

    @Override // okio.BufferedSource
    public byte readByte() throws java.io.EOFException {
            r11 = this;
            r0 = r11
            r1 = 0
            long r2 = r0.size()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L35
            okio.Segment r2 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r3 = r2.pos
            int r4 = r2.limit
            byte[] r5 = r2.data
            int r6 = r3 + 1
            r3 = r5[r3]
            long r7 = r0.size()
            r9 = 1
            long r7 = r7 - r9
            r0.setSize$okio(r7)
            if (r6 != r4) goto L31
            okio.Segment r7 = r2.pop()
            r0.head = r7
            okio.SegmentPool.recycle(r2)
            goto L33
        L31:
            r2.pos = r6
        L33:
            return r3
        L35:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray() {
            r4 = this;
            r0 = r4
            r1 = 0
            long r2 = r0.size()
            byte[] r0 = r0.readByteArray(r2)
            return r0
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray(long r6) throws java.io.EOFException {
            r5 = this;
            r0 = r5
            r1 = 0
            r2 = 0
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 < 0) goto L11
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 > 0) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            if (r2 == 0) goto L2a
            long r2 = r0.size()
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L24
            int r2 = (int) r6
            byte[] r2 = new byte[r2]
            r0.readFully(r2)
            return r2
        L24:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
        L2a:
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "byteCount: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // okio.BufferedSource
    public okio.ByteString readByteString() {
            r4 = this;
            r0 = r4
            r1 = 0
            long r2 = r0.size()
            okio.ByteString r0 = r0.readByteString(r2)
            return r0
    }

    @Override // okio.BufferedSource
    public okio.ByteString readByteString(long r6) throws java.io.EOFException {
            r5 = this;
            r0 = r5
            r1 = 0
            r2 = 0
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 < 0) goto L11
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 > 0) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            if (r2 == 0) goto L3d
            long r2 = r0.size()
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L37
            r2 = 4096(0x1000, double:2.0237E-320)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 < 0) goto L2d
            int r2 = (int) r6
            okio.ByteString r2 = r0.snapshot(r2)
            r3 = r2
            r4 = 0
            r0.skip(r6)
            goto L36
        L2d:
            okio.ByteString r2 = new okio.ByteString
            byte[] r3 = r0.readByteArray(r6)
            r2.<init>(r3)
        L36:
            return r2
        L37:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
        L3d:
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "byteCount: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() throws java.io.EOFException {
            r19 = this;
            r0 = r19
            r1 = 0
            long r2 = r0.size()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L119
            r2 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = -7
        L14:
            okio.Segment r11 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            byte[] r12 = r11.data
            int r13 = r11.pos
            int r14 = r11.limit
        L1f:
            if (r13 >= r14) goto La4
            r15 = r12[r13]
            r4 = 48
            if (r15 < r4) goto L84
            r4 = 57
            if (r15 > r4) goto L84
            int r4 = 48 - r15
            r16 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r5 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r5 < 0) goto L4e
            int r5 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r5 != 0) goto L43
            r5 = r0
            r16 = r1
            long r0 = (long) r4
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 >= 0) goto L46
            goto L51
        L43:
            r5 = r0
            r16 = r1
        L46:
            r0 = 10
            long r2 = r2 * r0
            long r0 = (long) r4
            long r2 = r2 + r0
            r18 = r8
            goto L93
        L4e:
            r5 = r0
            r16 = r1
        L51:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeDecimalLong(r2)
            okio.Buffer r0 = r0.writeByte(r15)
            if (r7 != 0) goto L63
            r0.readByte()
        L63:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r17 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r18 = r8
            java.lang.String r8 = "Number too large: "
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.String r8 = r0.readUtf8()
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4)
            throw r1
        L84:
            r5 = r0
            r16 = r1
            r18 = r8
            r0 = 45
            if (r15 != r0) goto La1
            if (r6 != 0) goto La1
            r7 = 1
            r0 = 1
            long r9 = r9 - r0
        L93:
            int r13 = r13 + 1
            int r6 = r6 + 1
            r0 = r5
            r1 = r16
            r8 = r18
            r4 = 0
            goto L1f
        La1:
            r0 = 1
            r8 = r0
            goto La9
        La4:
            r5 = r0
            r16 = r1
            r18 = r8
        La9:
            if (r13 != r14) goto Lb5
            okio.Segment r0 = r11.pop()
            r5.head = r0
            okio.SegmentPool.recycle(r11)
            goto Lb7
        Lb5:
            r11.pos = r13
        Lb7:
            if (r8 != 0) goto Lc5
            okio.Segment r0 = r5.head
            if (r0 != 0) goto Lbe
            goto Lc5
        Lbe:
            r0 = r5
            r1 = r16
            r4 = 0
            goto L14
        Lc5:
            long r0 = r5.size()
            long r11 = (long) r6
            long r0 = r0 - r11
            r5.setSize$okio(r0)
            if (r7 == 0) goto Ld2
            r0 = 2
            goto Ld3
        Ld2:
            r0 = 1
        Ld3:
            if (r6 >= r0) goto L113
            long r11 = r5.size()
            r13 = 0
            int r1 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r1 == 0) goto L10d
            if (r7 == 0) goto Le4
            java.lang.String r1 = "Expected a digit"
            goto Le6
        Le4:
            java.lang.String r1 = "Expected a digit or '-'"
        Le6:
            java.lang.NumberFormatException r4 = new java.lang.NumberFormatException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.StringBuilder r11 = r11.append(r1)
            java.lang.String r12 = " but was 0x"
            java.lang.StringBuilder r11 = r11.append(r12)
            r12 = 0
            byte r12 = r5.getByte(r12)
            java.lang.String r12 = okio.SegmentedByteString.toHexString(r12)
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r11 = r11.toString()
            r4.<init>(r11)
            throw r4
        L10d:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L113:
            if (r7 == 0) goto L116
            goto L118
        L116:
            long r11 = -r2
            r2 = r11
        L118:
            return r2
        L119:
            r5 = r0
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    public final okio.Buffer readFrom(java.io.InputStream r4) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 1
            r3.readFrom(r4, r0, r2)
            return r3
    }

    public final okio.Buffer readFrom(java.io.InputStream r4, long r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L15
            r3.readFrom(r4, r5, r1)
            return r3
        L15:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "byteCount < 0: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // okio.BufferedSource
    public void readFully(okio.Buffer r5, long r6) throws java.io.EOFException {
            r4 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            r1 = 0
            long r2 = r0.size()
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L14
            r5.write(r0, r6)
            return
        L14:
            long r2 = r0.size()
            r5.write(r0, r2)
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] r6) throws java.io.EOFException {
            r5 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            r1 = 0
            r2 = 0
        L8:
            int r3 = r6.length
            if (r2 >= r3) goto L1c
            int r3 = r6.length
            int r3 = r3 - r2
            int r3 = r0.read(r6, r2, r3)
            r4 = -1
            if (r3 == r4) goto L16
            int r2 = r2 + r3
            goto L8
        L16:
            java.io.EOFException r4 = new java.io.EOFException
            r4.<init>()
            throw r4
        L1c:
            return
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() throws java.io.EOFException {
            r16 = this;
            r0 = r16
            r1 = 0
            long r2 = r0.size()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto Lc0
            r2 = 0
            r6 = 0
            r7 = 0
        L11:
            okio.Segment r8 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            byte[] r9 = r8.data
            int r10 = r8.pos
            int r11 = r8.limit
        L1c:
            if (r10 >= r11) goto La1
            r12 = 0
            r13 = r9[r10]
            r14 = 48
            if (r13 < r14) goto L2c
            r14 = 57
            if (r13 > r14) goto L2c
            int r12 = r13 + (-48)
            goto L45
        L2c:
            r14 = 97
            if (r13 < r14) goto L39
            r14 = 102(0x66, float:1.43E-43)
            if (r13 > r14) goto L39
            int r14 = r13 + (-97)
            int r12 = r14 + 10
            goto L45
        L39:
            r14 = 65
            if (r13 < r14) goto L80
            r14 = 70
            if (r13 > r14) goto L80
            int r14 = r13 + (-65)
            int r12 = r14 + 10
        L45:
            r14 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r14 = r14 & r2
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 != 0) goto L56
            r14 = 4
            long r2 = r2 << r14
            long r14 = (long) r12
            long r2 = r2 | r14
            int r10 = r10 + 1
            int r6 = r6 + 1
            goto L1c
        L56:
            okio.Buffer r4 = new okio.Buffer
            r4.<init>()
            okio.Buffer r4 = r4.writeHexadecimalUnsignedLong(r2)
            okio.Buffer r4 = r4.writeByte(r13)
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Number too large: "
            java.lang.StringBuilder r14 = r14.append(r15)
            java.lang.String r15 = r4.readUtf8()
            java.lang.StringBuilder r14 = r14.append(r15)
            java.lang.String r14 = r14.toString()
            r5.<init>(r14)
            throw r5
        L80:
            if (r6 == 0) goto L84
            r7 = 1
            goto La1
        L84:
            java.lang.NumberFormatException r4 = new java.lang.NumberFormatException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r14 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r5 = r5.append(r14)
            java.lang.String r14 = okio.SegmentedByteString.toHexString(r13)
            java.lang.StringBuilder r5 = r5.append(r14)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        La1:
            if (r10 != r11) goto Lad
            okio.Segment r12 = r8.pop()
            r0.head = r12
            okio.SegmentPool.recycle(r8)
            goto Laf
        Lad:
            r8.pos = r10
        Laf:
            if (r7 != 0) goto Lb5
            okio.Segment r8 = r0.head
            if (r8 != 0) goto L11
        Lb5:
            long r4 = r0.size()
            long r8 = (long) r6
            long r4 = r4 - r8
            r0.setSize$okio(r4)
            return r2
        Lc0:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
    }

    @Override // okio.BufferedSource
    public int readInt() throws java.io.EOFException {
            r12 = this;
            r0 = r12
            r1 = 0
            long r2 = r0.size()
            r4 = 4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L8a
            okio.Segment r2 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r3 = r2.pos
            int r6 = r2.limit
            int r7 = r6 - r3
            long r7 = (long) r7
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 >= 0) goto L46
            byte r4 = r0.readByte()
            r5 = 255(0xff, float:3.57E-43)
            r7 = 0
            r4 = r4 & r5
            int r4 = r4 << 24
            byte r5 = r0.readByte()
            r7 = 255(0xff, float:3.57E-43)
            r8 = 0
            r5 = r5 & r7
            int r5 = r5 << 16
            r4 = r4 | r5
            byte r5 = r0.readByte()
            r7 = 255(0xff, float:3.57E-43)
            r8 = 0
            r5 = r5 & r7
            int r5 = r5 << 8
            r4 = r4 | r5
            byte r5 = r0.readByte()
            r7 = 255(0xff, float:3.57E-43)
            r8 = 0
            r5 = r5 & r7
            r4 = r4 | r5
            goto L89
        L46:
            byte[] r7 = r2.data
            int r8 = r3 + 1
            r3 = r7[r3]
            r9 = 255(0xff, float:3.57E-43)
            r10 = 0
            r3 = r3 & r9
            int r3 = r3 << 24
            int r9 = r8 + 1
            r8 = r7[r8]
            r10 = 255(0xff, float:3.57E-43)
            r11 = 0
            r8 = r8 & r10
            int r8 = r8 << 16
            r3 = r3 | r8
            int r8 = r9 + 1
            r9 = r7[r9]
            r10 = 255(0xff, float:3.57E-43)
            r11 = 0
            r9 = r9 & r10
            int r9 = r9 << 8
            r3 = r3 | r9
            int r9 = r8 + 1
            r8 = r7[r8]
            r10 = 255(0xff, float:3.57E-43)
            r11 = 0
            r8 = r8 & r10
            r3 = r3 | r8
            long r10 = r0.size()
            long r10 = r10 - r4
            r0.setSize$okio(r10)
            if (r9 != r6) goto L86
            okio.Segment r4 = r2.pop()
            r0.head = r4
            okio.SegmentPool.recycle(r2)
            goto L88
        L86:
            r2.pos = r9
        L88:
            r4 = r3
        L89:
            return r4
        L8a:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws java.io.EOFException {
            r1 = this;
            int r0 = r1.readInt()
            int r0 = okio.SegmentedByteString.reverseBytes(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public long readLong() throws java.io.EOFException {
            r15 = this;
            r0 = r15
            r1 = 0
            long r2 = r0.size()
            r4 = 8
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto Lc0
            okio.Segment r2 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r3 = r2.pos
            int r6 = r2.limit
            int r7 = r6 - r3
            long r7 = (long) r7
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            r8 = 32
            if (r7 >= 0) goto L3c
            int r4 = r0.readInt()
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r5 = 0
            long r11 = (long) r4
            long r4 = r11 & r9
            long r4 = r4 << r8
            int r7 = r0.readInt()
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 0
            long r11 = (long) r7
            long r7 = r11 & r8
            long r4 = r4 | r7
            goto Lbf
        L3c:
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
            long r8 = r0.size()
            r10 = 8
            long r8 = r8 - r10
            r0.setSize$okio(r8)
            if (r5 != r6) goto Lbc
            okio.Segment r8 = r2.pop()
            r0.head = r8
            okio.SegmentPool.recycle(r2)
            goto Lbe
        Lbc:
            r2.pos = r5
        Lbe:
            r4 = r3
        Lbf:
            return r4
        Lc0:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws java.io.EOFException {
            r2 = this;
            long r0 = r2.readLong()
            long r0 = okio.SegmentedByteString.reverseBytes(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public short readShort() throws java.io.EOFException {
            r12 = this;
            r0 = r12
            r1 = 0
            long r2 = r0.size()
            r4 = 2
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L5c
            okio.Segment r2 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r3 = r2.pos
            int r6 = r2.limit
            int r7 = r6 - r3
            r8 = 2
            if (r7 >= r8) goto L2f
            byte r4 = r0.readByte()
            r5 = 255(0xff, float:3.57E-43)
            r7 = 0
            r4 = r4 & r5
            int r4 = r4 << 8
            byte r5 = r0.readByte()
            r7 = 255(0xff, float:3.57E-43)
            r8 = 0
            r5 = r5 & r7
            r4 = r4 | r5
            short r5 = (short) r4
            goto L5b
        L2f:
            byte[] r7 = r2.data
            int r8 = r3 + 1
            r3 = r7[r3]
            r9 = 255(0xff, float:3.57E-43)
            r10 = 0
            r3 = r3 & r9
            int r3 = r3 << 8
            int r9 = r8 + 1
            r8 = r7[r8]
            r10 = 255(0xff, float:3.57E-43)
            r11 = 0
            r8 = r8 & r10
            r3 = r3 | r8
            long r10 = r0.size()
            long r10 = r10 - r4
            r0.setSize$okio(r10)
            if (r9 != r6) goto L58
            okio.Segment r4 = r2.pop()
            r0.head = r4
            okio.SegmentPool.recycle(r2)
            goto L5a
        L58:
            r2.pos = r9
        L5a:
            short r5 = (short) r3
        L5b:
            return r5
        L5c:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws java.io.EOFException {
            r1 = this;
            short r0 = r1.readShort()
            short r0 = okio.SegmentedByteString.reverseBytes(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readString(long r6, java.nio.charset.Charset r8) throws java.io.EOFException {
            r5 = this;
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L14
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 > 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            if (r2 == 0) goto L69
            long r2 = r5.size
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L63
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L24
            java.lang.String r0 = ""
            return r0
        L24:
            okio.Segment r0 = r5.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.pos
            long r1 = (long) r1
            long r1 = r1 + r6
            int r3 = r0.limit
            long r3 = (long) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L3e
            java.lang.String r1 = new java.lang.String
            byte[] r2 = r5.readByteArray(r6)
            r1.<init>(r2, r8)
            return r1
        L3e:
            java.lang.String r1 = new java.lang.String
            byte[] r2 = r0.data
            int r3 = r0.pos
            int r4 = (int) r6
            r1.<init>(r2, r3, r4, r8)
            int r2 = r0.pos
            int r3 = (int) r6
            int r2 = r2 + r3
            r0.pos = r2
            long r2 = r5.size
            long r2 = r2 - r6
            r5.size = r2
            int r2 = r0.pos
            int r3 = r0.limit
            if (r2 != r3) goto L62
            okio.Segment r2 = r0.pop()
            r5.head = r2
            okio.SegmentPool.recycle(r0)
        L62:
            return r1
        L63:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L69:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "byteCount: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // okio.BufferedSource
    public java.lang.String readString(java.nio.charset.Charset r3) {
            r2 = this;
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            long r0 = r2.size
            java.lang.String r0 = r2.readString(r0, r3)
            return r0
    }

    public final okio.Buffer.UnsafeCursor readUnsafe() {
            r2 = this;
            r0 = 0
            r1 = 1
            okio.Buffer$UnsafeCursor r0 = readUnsafe$default(r2, r0, r1, r0)
            return r0
    }

    public final okio.Buffer.UnsafeCursor readUnsafe(okio.Buffer.UnsafeCursor r2) {
            r1 = this;
            java.lang.String r0 = "unsafeCursor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Buffer$UnsafeCursor r0 = okio.internal.Buffer.commonReadUnsafe(r1, r2)
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8() {
            r3 = this;
            long r0 = r3.size
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
            java.lang.String r0 = r3.readString(r0, r2)
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8(long r2) throws java.io.EOFException {
            r1 = this;
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            java.lang.String r0 = r1.readString(r2, r0)
            return r0
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws java.io.EOFException {
            r12 = this;
            r0 = r12
            r1 = 0
            long r2 = r0.size()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto Le9
            byte r2 = r0.getByte(r4)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 128(0x80, float:1.8E-43)
            r7 = r2
            r8 = 0
            r6 = r6 & r7
            r7 = 65533(0xfffd, float:9.1831E-41)
            if (r6 != 0) goto L27
            r6 = 127(0x7f, float:1.78E-43)
            r8 = r2
            r9 = 0
            r6 = r6 & r8
            r3 = r6
            r4 = 1
            r5 = 0
            goto L5e
        L27:
            r6 = 224(0xe0, float:3.14E-43)
            r8 = r2
            r9 = 0
            r6 = r6 & r8
            r8 = 192(0xc0, float:2.69E-43)
            if (r6 != r8) goto L3a
            r6 = 31
            r8 = r2
            r9 = 0
            r6 = r6 & r8
            r3 = r6
            r4 = 2
            r5 = 128(0x80, float:1.8E-43)
            goto L5e
        L3a:
            r6 = 240(0xf0, float:3.36E-43)
            r8 = r2
            r9 = 0
            r6 = r6 & r8
            r8 = 224(0xe0, float:3.14E-43)
            if (r6 != r8) goto L4d
            r6 = 15
            r8 = r2
            r9 = 0
            r6 = r6 & r8
            r3 = r6
            r4 = 3
            r5 = 2048(0x800, float:2.87E-42)
            goto L5e
        L4d:
            r6 = 248(0xf8, float:3.48E-43)
            r8 = r2
            r9 = 0
            r6 = r6 & r8
            r8 = 240(0xf0, float:3.36E-43)
            if (r6 != r8) goto Le2
            r6 = 7
            r8 = r2
            r9 = 0
            r6 = r6 & r8
            r3 = r6
            r4 = 4
            r5 = 65536(0x10000, float:9.1835E-41)
        L5e:
            long r8 = r0.size()
            long r10 = (long) r4
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 < 0) goto La7
            r6 = 1
        L68:
            if (r6 >= r4) goto L88
            long r8 = (long) r6
            byte r8 = r0.getByte(r8)
            r9 = 192(0xc0, float:2.69E-43)
            r10 = r8
            r11 = 0
            r9 = r9 & r10
            r10 = 128(0x80, float:1.8E-43)
            if (r9 != r10) goto L83
            int r3 = r3 << 6
            r9 = 63
            r10 = r8
            r11 = 0
            r9 = r9 & r10
            r3 = r3 | r9
            int r6 = r6 + 1
            goto L68
        L83:
            long r9 = (long) r6
            r0.skip(r9)
            goto Le8
        L88:
            long r8 = (long) r4
            r0.skip(r8)
            r6 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r6) goto L93
            goto La6
        L93:
            r6 = 55296(0xd800, float:7.7486E-41)
            r8 = 0
            if (r6 > r3) goto L9f
            r6 = 57344(0xe000, float:8.0356E-41)
            if (r3 >= r6) goto L9f
            r8 = 1
        L9f:
            if (r8 == 0) goto La2
            goto La6
        La2:
            if (r3 >= r5) goto La5
            goto La6
        La5:
            r7 = r3
        La6:
            goto Le8
        La7:
            java.io.EOFException r6 = new java.io.EOFException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "size < "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r4)
            java.lang.String r8 = ": "
            java.lang.StringBuilder r7 = r7.append(r8)
            long r8 = r0.size()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = " (to read code point prefixed 0x"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = okio.SegmentedByteString.toHexString(r2)
            java.lang.StringBuilder r7 = r7.append(r8)
            r8 = 41
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        Le2:
            r8 = 1
            r0.skip(r8)
        Le8:
            return r7
        Le9:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8Line() throws java.io.EOFException {
            r8 = this;
            r0 = r8
            r1 = 0
            r2 = 10
            long r2 = r0.indexOf(r2)
            r4 = -1
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L14
            java.lang.String r4 = okio.internal.Buffer.readUtf8Line(r0, r2)
            goto L28
        L14:
            long r4 = r0.size()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L27
            long r4 = r0.size()
            java.lang.String r4 = r0.readUtf8(r4)
            goto L28
        L27:
            r4 = 0
        L28:
            return r4
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8LineStrict() throws java.io.EOFException {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r0 = r2.readUtf8LineStrict(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8LineStrict(long r17) throws java.io.EOFException {
            r16 = this;
            r0 = r17
            r8 = r16
            r9 = 0
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 == 0) goto La5
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r10 = 1
            if (r4 != 0) goto L1c
            goto L1e
        L1c:
            long r2 = r0 + r10
        L1e:
            r12 = r2
            r3 = 10
            r4 = 0
            r2 = r8
            r6 = r12
            long r14 = r2.indexOf(r3, r4, r6)
            r2 = -1
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 == 0) goto L34
            java.lang.String r2 = okio.internal.Buffer.readUtf8Line(r8, r14)
            goto L52
        L34:
            long r2 = r8.size()
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 >= 0) goto L53
            long r2 = r12 - r10
            byte r2 = r8.getByte(r2)
            r3 = 13
            if (r2 != r3) goto L53
            byte r2 = r8.getByte(r12)
            r3 = 10
            if (r2 != r3) goto L53
            java.lang.String r2 = okio.internal.Buffer.readUtf8Line(r8, r12)
        L52:
            return r2
        L53:
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            r2 = 32
            long r4 = r8.size()
            r6 = 0
            long r10 = (long) r2
            long r10 = java.lang.Math.min(r10, r4)
            r4 = 0
            r2 = r8
            r6 = r10
            r2.copyTo(r3, r4, r6)
            java.io.EOFException r2 = new java.io.EOFException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "\\n not found: limit="
            java.lang.StringBuilder r4 = r4.append(r5)
            long r5 = r8.size()
            long r5 = java.lang.Math.min(r5, r0)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = " content="
            java.lang.StringBuilder r4 = r4.append(r5)
            okio.ByteString r5 = r3.readByteString()
            java.lang.String r5 = r5.hex()
            java.lang.StringBuilder r4 = r4.append(r5)
            r5 = 8230(0x2026, float:1.1533E-41)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.<init>(r4)
            throw r2
        La5:
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "limit < 0: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // okio.BufferedSource
    public boolean request(long r3) {
            r2 = this;
            long r0 = r2.size
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // okio.BufferedSource
    public void require(long r3) throws java.io.EOFException {
            r2 = this;
            long r0 = r2.size
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L7
            return
        L7:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // okio.BufferedSource
    public int select(okio.Options r7) {
            r6 = this;
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r6
            r1 = 0
            r2 = 2
            r3 = 0
            r4 = 0
            int r2 = okio.internal.Buffer.selectPrefix$default(r0, r7, r4, r2, r3)
            r3 = -1
            if (r2 != r3) goto L13
            r2 = r3
            goto L22
        L13:
            okio.ByteString[] r3 = r7.getByteStrings$okio()
            r3 = r3[r2]
            int r3 = r3.size()
            long r4 = (long) r3
            r0.skip(r4)
        L22:
            return r2
    }

    public final void setSize$okio(long r1) {
            r0 = this;
            r0.size = r1
            return
    }

    public final okio.ByteString sha1() {
            r1 = this;
            java.lang.String r0 = "SHA-1"
            okio.ByteString r0 = r1.digest(r0)
            return r0
    }

    public final okio.ByteString sha256() {
            r1 = this;
            java.lang.String r0 = "SHA-256"
            okio.ByteString r0 = r1.digest(r0)
            return r0
    }

    public final okio.ByteString sha512() {
            r1 = this;
            java.lang.String r0 = "SHA-512"
            okio.ByteString r0 = r1.digest(r0)
            return r0
    }

    public final long size() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    @Override // okio.BufferedSource
    public void skip(long r11) throws java.io.EOFException {
            r10 = this;
            r0 = r10
            r1 = 0
            r2 = r11
        L3:
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L3f
            okio.Segment r4 = r0.head
            if (r4 == 0) goto L39
            int r5 = r4.limit
            int r6 = r4.pos
            int r5 = r5 - r6
            r6 = 0
            long r7 = (long) r5
            long r7 = java.lang.Math.min(r2, r7)
            int r5 = (int) r7
            long r6 = r0.size()
            long r8 = (long) r5
            long r6 = r6 - r8
            r0.setSize$okio(r6)
            long r6 = (long) r5
            long r2 = r2 - r6
            int r6 = r4.pos
            int r6 = r6 + r5
            r4.pos = r6
            int r6 = r4.pos
            int r7 = r4.limit
            if (r6 != r7) goto L3
            okio.Segment r6 = r4.pop()
            r0.head = r6
            okio.SegmentPool.recycle(r4)
            goto L3
        L39:
            java.io.EOFException r4 = new java.io.EOFException
            r4.<init>()
            throw r4
        L3f:
            return
    }

    public final okio.ByteString snapshot() {
            r6 = this;
            r0 = r6
            r1 = 0
            long r2 = r0.size()
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 == 0) goto L1c
            long r2 = r0.size()
            int r2 = (int) r2
            okio.ByteString r0 = r0.snapshot(r2)
            return r0
        L1c:
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "size > Int.MAX_VALUE: "
            java.lang.StringBuilder r3 = r3.append(r4)
            long r4 = r0.size()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public final okio.ByteString snapshot(int r10) {
            r9 = this;
            r0 = r9
            r1 = 0
            if (r10 != 0) goto L7
            okio.ByteString r2 = okio.ByteString.EMPTY
            goto L6b
        L7:
            long r3 = r0.size()
            r5 = 0
            long r7 = (long) r10
            okio.SegmentedByteString.checkOffsetAndCount(r3, r5, r7)
            r2 = 0
            r3 = 0
            okio.Segment r4 = r0.head
        L15:
            if (r2 >= r10) goto L33
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r5 = r4.limit
            int r6 = r4.pos
            if (r5 == r6) goto L2b
            int r5 = r4.limit
            int r6 = r4.pos
            int r5 = r5 - r6
            int r2 = r2 + r5
            int r3 = r3 + 1
            okio.Segment r4 = r4.next
            goto L15
        L2b:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            java.lang.String r6 = "s.limit == s.pos"
            r5.<init>(r6)
            throw r5
        L33:
            byte[][] r5 = new byte[r3][]
            int r6 = r3 * 2
            int[] r6 = new int[r6]
            r2 = 0
            r3 = 0
            okio.Segment r4 = r0.head
        L3d:
            if (r2 >= r10) goto L63
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            byte[] r7 = r4.data
            r5[r3] = r7
            int r7 = r4.limit
            int r8 = r4.pos
            int r7 = r7 - r8
            int r2 = r2 + r7
            int r7 = java.lang.Math.min(r2, r10)
            r6[r3] = r7
            r7 = r5
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            int r7 = r7.length
            int r7 = r7 + r3
            int r8 = r4.pos
            r6[r7] = r8
            r7 = 1
            r4.shared = r7
            int r3 = r3 + 1
            okio.Segment r4 = r4.next
            goto L3d
        L63:
            okio.SegmentedByteString r7 = new okio.SegmentedByteString
            r7.<init>(r5, r6)
            okio.ByteString r7 = (okio.ByteString) r7
            r2 = r7
        L6b:
            return r2
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
            r1 = this;
            okio.Timeout r0 = okio.Timeout.NONE
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            okio.ByteString r0 = r1.snapshot()
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final okio.Segment writableSegment$okio(int r6) {
            r5 = this;
            r0 = r5
            r1 = 0
            r2 = 8192(0x2000, float:1.148E-41)
            r3 = 1
            if (r6 < r3) goto La
            if (r6 > r2) goto La
            goto Lb
        La:
            r3 = 0
        Lb:
            if (r3 == 0) goto L3c
            okio.Segment r3 = r0.head
            if (r3 != 0) goto L1c
            okio.Segment r2 = okio.SegmentPool.take()
            r0.head = r2
            r2.prev = r2
            r2.next = r2
            goto L3b
        L1c:
            okio.Segment r3 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.Segment r3 = r3.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r4 = r3.limit
            int r4 = r4 + r6
            if (r4 > r2) goto L32
            boolean r2 = r3.owner
            if (r2 != 0) goto L30
            goto L32
        L30:
            r2 = r3
            goto L3a
        L32:
            okio.Segment r2 = okio.SegmentPool.take()
            okio.Segment r2 = r3.push(r2)
        L3a:
        L3b:
            return r2
        L3c:
            r2 = 0
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "unexpected capacity"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer r7) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r7.remaining()
            r1 = r0
        La:
            if (r1 <= 0) goto L27
            r2 = 1
            okio.Segment r2 = r6.writableSegment$okio(r2)
            int r3 = r2.limit
            int r3 = 8192 - r3
            int r3 = java.lang.Math.min(r1, r3)
            byte[] r4 = r2.data
            int r5 = r2.limit
            r7.get(r4, r5, r3)
            int r1 = r1 - r3
            int r4 = r2.limit
            int r4 = r4 + r3
            r2.limit = r4
            goto La
        L27:
            long r2 = r6.size
            long r4 = (long) r0
            long r2 = r2 + r4
            r6.size = r2
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(okio.ByteString r5) {
            r4 = this;
            java.lang.String r0 = "byteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            r1 = 0
            int r2 = r5.size()
            r3 = 0
            r5.write$okio(r0, r1, r2)
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(okio.ByteString r3, int r4, int r5) {
            r2 = this;
            java.lang.String r0 = "byteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            r1 = 0
            r3.write$okio(r0, r4, r5)
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(okio.Source r9, long r10) throws java.io.IOException {
            r8 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r8
            r1 = 0
            r2 = r10
        L8:
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L20
            long r4 = r9.read(r0, r2)
            r6 = -1
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L1a
            long r2 = r2 - r4
            goto L8
        L1a:
            java.io.EOFException r6 = new java.io.EOFException
            r6.<init>()
            throw r6
        L20:
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(byte[] r5) {
            r4 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            r1 = 0
            r2 = 0
            int r3 = r5.length
            okio.Buffer r0 = r0.write(r5, r2, r3)
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(byte[] r11, int r12, int r13) {
            r10 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = r10
            r1 = 0
            r2 = r12
            int r3 = r11.length
            long r4 = (long) r3
            long r6 = (long) r2
            long r8 = (long) r13
            okio.SegmentedByteString.checkOffsetAndCount(r4, r6, r8)
            int r3 = r2 + r13
        L11:
            if (r2 >= r3) goto L34
            r4 = 1
            okio.Segment r4 = r0.writableSegment$okio(r4)
            int r5 = r3 - r2
            int r6 = r4.limit
            int r6 = 8192 - r6
            int r5 = java.lang.Math.min(r5, r6)
            byte[] r6 = r4.data
            int r7 = r4.limit
            int r8 = r2 + r5
            kotlin.collections.ArraysKt.copyInto(r11, r6, r7, r2, r8)
            int r2 = r2 + r5
            int r6 = r4.limit
            int r6 = r6 + r5
            r4.limit = r6
            goto L11
        L34:
            long r4 = r0.size()
            long r6 = (long) r13
            long r4 = r4 + r6
            r0.setSize$okio(r4)
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink write(okio.ByteString r2) {
            r1 = this;
            okio.Buffer r0 = r1.write(r2)
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink write(okio.ByteString r2, int r3, int r4) {
            r1 = this;
            okio.Buffer r0 = r1.write(r2, r3, r4)
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink write(okio.Source r2, long r3) {
            r1 = this;
            okio.Buffer r0 = r1.write(r2, r3)
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink write(byte[] r2) {
            r1 = this;
            okio.Buffer r0 = r1.write(r2)
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink write(byte[] r2, int r3, int r4) {
            r1 = this;
            okio.Buffer r0 = r1.write(r2, r3, r4)
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    @Override // okio.Sink
    public void write(okio.Buffer r12, long r13) {
            r11 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = r11
            r1 = 0
            r6 = r13
            r8 = 0
            if (r12 == r0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = r8
        Le:
            if (r2 == 0) goto Lc4
            long r2 = r12.size()
            r4 = 0
            okio.SegmentedByteString.checkOffsetAndCount(r2, r4, r6)
        L19:
            r2 = 0
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto Lc2
            okio.Segment r2 = r12.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r2 = r2.limit
            okio.Segment r3 = r12.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r3 = r3.pos
            int r2 = r2 - r3
            long r2 = (long) r2
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 >= 0) goto L80
            okio.Segment r2 = r0.head
            if (r2 == 0) goto L3f
            okio.Segment r2 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            okio.Segment r2 = r2.prev
            goto L40
        L3f:
            r2 = 0
        L40:
            if (r2 == 0) goto L74
            boolean r3 = r2.owner
            if (r3 == 0) goto L74
            int r3 = r2.limit
            long r3 = (long) r3
            long r3 = r3 + r6
            boolean r5 = r2.shared
            if (r5 == 0) goto L50
            r5 = r8
            goto L52
        L50:
            int r5 = r2.pos
        L52:
            long r9 = (long) r5
            long r3 = r3 - r9
            r9 = 8192(0x2000, double:4.0474E-320)
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 > 0) goto L74
            okio.Segment r3 = r12.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r4 = (int) r6
            r3.writeTo(r2, r4)
            long r3 = r12.size()
            long r3 = r3 - r6
            r12.setSize$okio(r3)
            long r3 = r0.size()
            long r3 = r3 + r6
            r0.setSize$okio(r3)
            goto Lc3
        L74:
            okio.Segment r3 = r12.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r4 = (int) r6
            okio.Segment r3 = r3.split(r4)
            r12.head = r3
        L80:
            okio.Segment r2 = r12.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r3 = r2.limit
            int r4 = r2.pos
            int r3 = r3 - r4
            long r3 = (long) r3
            okio.Segment r5 = r2.pop()
            r12.head = r5
            okio.Segment r5 = r0.head
            if (r5 != 0) goto L9e
            r0.head = r2
            r2.prev = r2
            okio.Segment r5 = r2.prev
            r2.next = r5
            goto Laf
        L9e:
            okio.Segment r5 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            okio.Segment r5 = r5.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            okio.Segment r5 = r5.push(r2)
            r5.compact()
        Laf:
            long r9 = r12.size()
            long r9 = r9 - r3
            r12.setSize$okio(r9)
            long r9 = r0.size()
            long r9 = r9 + r3
            r0.setSize$okio(r9)
            long r6 = r6 - r3
            goto L19
        Lc2:
        Lc3:
            return
        Lc4:
            r2 = 0
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "source == this"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    public long writeAll(okio.Source r9) throws java.io.IOException {
            r8 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r8
            r1 = 0
            r2 = 0
        L9:
            r4 = 8192(0x2000, double:4.0474E-320)
            long r4 = r9.read(r0, r4)
            r6 = -1
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L18
            long r2 = r2 + r4
            goto L9
        L18:
            return r2
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeByte(int r8) {
            r7 = this;
            r0 = r7
            r1 = 0
            r2 = 1
            okio.Segment r2 = r0.writableSegment$okio(r2)
            byte[] r3 = r2.data
            int r4 = r2.limit
            int r5 = r4 + 1
            r2.limit = r5
            byte r5 = (byte) r8
            r3[r4] = r5
            long r3 = r0.size()
            r5 = 1
            long r3 = r3 + r5
            r0.setSize$okio(r3)
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeByte(int r2) {
            r1 = this;
            okio.Buffer r0 = r1.writeByte(r2)
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeDecimalLong(long r17) {
            r16 = this;
            r0 = r16
            r1 = 0
            r2 = r17
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L14
            r4 = 48
            okio.Buffer r4 = r0.writeByte(r4)
            r0 = r4
            goto L129
        L14:
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L28
            long r2 = -r2
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L27
            java.lang.String r4 = "-9223372036854775808"
            okio.Buffer r4 = r0.writeUtf8(r4)
            r0 = r4
            goto L129
        L27:
            r6 = 1
        L28:
            r7 = 100000000(0x5f5e100, double:4.94065646E-316)
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r8 = 10
            if (r7 >= 0) goto L77
            r9 = 10000(0x2710, double:4.9407E-320)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto L55
            r9 = 100
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto L49
            r9 = 10
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto L46
            r7 = 1
            goto Lee
        L46:
            r7 = 2
            goto Lee
        L49:
            r9 = 1000(0x3e8, double:4.94E-321)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto L52
            r7 = 3
            goto Lee
        L52:
            r7 = 4
            goto Lee
        L55:
            r9 = 1000000(0xf4240, double:4.940656E-318)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto L69
            r9 = 100000(0x186a0, double:4.94066E-319)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto L66
            r7 = 5
            goto Lee
        L66:
            r7 = 6
            goto Lee
        L69:
            r9 = 10000000(0x989680, double:4.9406565E-317)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto L73
            r7 = 7
            goto Lee
        L73:
            r7 = 8
            goto Lee
        L77:
            r9 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto La4
            r9 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto L95
            r9 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto L93
            r7 = 9
            goto Lee
        L93:
            r7 = r8
            goto Lee
        L95:
            r9 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto La1
            r7 = 11
            goto Lee
        La1:
            r7 = 12
            goto Lee
        La4:
            r9 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto Lc8
            r9 = 10000000000000(0x9184e72a000, double:4.9406564584125E-311)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto Lb9
            r7 = 13
            goto Lee
        Lb9:
            r9 = 100000000000000(0x5af3107a4000, double:4.94065645841247E-310)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto Lc5
            r7 = 14
            goto Lee
        Lc5:
            r7 = 15
            goto Lee
        Lc8:
            r9 = 100000000000000000(0x16345785d8a0000, double:5.620395787888205E-302)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto Le0
            r9 = 10000000000000000(0x2386f26fc10000, double:5.431165199810528E-308)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto Ldd
            r7 = 16
            goto Lee
        Ldd:
            r7 = 17
            goto Lee
        Le0:
            r9 = 1000000000000000000(0xde0b6b3a7640000, double:7.832953389245686E-242)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 >= 0) goto Lec
            r7 = 18
            goto Lee
        Lec:
            r7 = 19
        Lee:
            if (r6 == 0) goto Lf5
            int r7 = r7 + 1
        Lf5:
            okio.Segment r9 = r0.writableSegment$okio(r7)
            byte[] r10 = r9.data
            int r11 = r9.limit
            int r11 = r11 + r7
        Lfe:
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r12 == 0) goto L112
            long r12 = (long) r8
            long r14 = r2 % r12
            int r14 = (int) r14
            int r11 = r11 + (-1)
            byte[] r15 = okio.internal.Buffer.getHEX_DIGIT_BYTES()
            r15 = r15[r14]
            r10[r11] = r15
            long r2 = r2 / r12
            goto Lfe
        L112:
            if (r6 == 0) goto L11a
            int r11 = r11 + (-1)
            r4 = 45
            r10[r11] = r4
        L11a:
            int r4 = r9.limit
            int r4 = r4 + r7
            r9.limit = r4
            long r4 = r0.size()
            long r12 = (long) r7
            long r4 = r4 + r12
            r0.setSize$okio(r4)
        L129:
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeDecimalLong(long r2) {
            r1 = this;
            okio.Buffer r0 = r1.writeDecimalLong(r2)
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeHexadecimalUnsignedLong(long r17) {
            r16 = this;
            r0 = r16
            r1 = 0
            r2 = r17
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L14
            r4 = 48
            okio.Buffer r4 = r0.writeByte(r4)
            r0 = r4
            goto L8d
        L14:
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
        L6c:
            if (r9 < r6) goto L7e
            byte[] r10 = okio.internal.Buffer.getHEX_DIGIT_BYTES()
            r14 = 15
            long r14 = r14 & r2
            int r11 = (int) r14
            r10 = r10[r11]
            r7[r9] = r10
            long r2 = r2 >>> r8
            int r9 = r9 + (-1)
            goto L6c
        L7e:
            int r8 = r5.limit
            int r8 = r8 + r4
            r5.limit = r8
            long r10 = r0.size()
            long r14 = (long) r4
            long r10 = r10 + r14
            r0.setSize$okio(r10)
        L8d:
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeHexadecimalUnsignedLong(long r2) {
            r1 = this;
            okio.Buffer r0 = r1.writeHexadecimalUnsignedLong(r2)
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeInt(int r10) {
            r9 = this;
            r0 = r9
            r1 = 0
            r2 = 4
            okio.Segment r2 = r0.writableSegment$okio(r2)
            byte[] r3 = r2.data
            int r4 = r2.limit
            int r5 = r4 + 1
            int r6 = r10 >>> 24
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r3[r4] = r6
            int r4 = r5 + 1
            int r6 = r10 >>> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r3[r5] = r6
            int r5 = r4 + 1
            int r6 = r10 >>> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r3[r4] = r6
            int r4 = r5 + 1
            r6 = r10 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r3[r5] = r6
            r2.limit = r4
            long r5 = r0.size()
            r7 = 4
            long r5 = r5 + r7
            r0.setSize$okio(r5)
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeInt(int r2) {
            r1 = this;
            okio.Buffer r0 = r1.writeInt(r2)
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeIntLe(int r2) {
            r1 = this;
            int r0 = okio.SegmentedByteString.reverseBytes(r2)
            okio.Buffer r0 = r1.writeInt(r0)
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeIntLe(int r2) {
            r1 = this;
            okio.Buffer r0 = r1.writeIntLe(r2)
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeLong(long r12) {
            r11 = this;
            r0 = r11
            r1 = 0
            r2 = 8
            okio.Segment r3 = r0.writableSegment$okio(r2)
            byte[] r4 = r3.data
            int r5 = r3.limit
            int r6 = r5 + 1
            r7 = 56
            long r7 = r12 >>> r7
            r9 = 255(0xff, double:1.26E-321)
            long r7 = r7 & r9
            int r7 = (int) r7
            byte r7 = (byte) r7
            r4[r5] = r7
            int r5 = r6 + 1
            r7 = 48
            long r7 = r12 >>> r7
            long r7 = r7 & r9
            int r7 = (int) r7
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 1
            r7 = 40
            long r7 = r12 >>> r7
            long r7 = r7 & r9
            int r7 = (int) r7
            byte r7 = (byte) r7
            r4[r5] = r7
            int r5 = r6 + 1
            r7 = 32
            long r7 = r12 >>> r7
            long r7 = r7 & r9
            int r7 = (int) r7
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 1
            r7 = 24
            long r7 = r12 >>> r7
            long r7 = r7 & r9
            int r7 = (int) r7
            byte r7 = (byte) r7
            r4[r5] = r7
            int r5 = r6 + 1
            r7 = 16
            long r7 = r12 >>> r7
            long r7 = r7 & r9
            int r7 = (int) r7
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 1
            long r7 = r12 >>> r2
            long r7 = r7 & r9
            int r2 = (int) r7
            byte r2 = (byte) r2
            r4[r5] = r2
            int r2 = r6 + 1
            long r7 = r12 & r9
            int r5 = (int) r7
            byte r5 = (byte) r5
            r4[r6] = r5
            r3.limit = r2
            long r5 = r0.size()
            r7 = 8
            long r5 = r5 + r7
            r0.setSize$okio(r5)
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeLong(long r2) {
            r1 = this;
            okio.Buffer r0 = r1.writeLong(r2)
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeLongLe(long r3) {
            r2 = this;
            long r0 = okio.SegmentedByteString.reverseBytes(r3)
            okio.Buffer r0 = r2.writeLong(r0)
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeLongLe(long r2) {
            r1 = this;
            okio.Buffer r0 = r1.writeLongLe(r2)
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeShort(int r10) {
            r9 = this;
            r0 = r9
            r1 = 0
            r2 = 2
            okio.Segment r2 = r0.writableSegment$okio(r2)
            byte[] r3 = r2.data
            int r4 = r2.limit
            int r5 = r4 + 1
            int r6 = r10 >>> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r3[r4] = r6
            int r4 = r5 + 1
            r6 = r10 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r3[r5] = r6
            r2.limit = r4
            long r5 = r0.size()
            r7 = 2
            long r5 = r5 + r7
            r0.setSize$okio(r5)
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeShort(int r2) {
            r1 = this;
            okio.Buffer r0 = r1.writeShort(r2)
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeShortLe(int r2) {
            r1 = this;
            short r0 = (short) r2
            short r0 = okio.SegmentedByteString.reverseBytes(r0)
            okio.Buffer r0 = r1.writeShort(r0)
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeShortLe(int r2) {
            r1 = this;
            okio.Buffer r0 = r1.writeShortLe(r2)
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeString(java.lang.String r4, int r5, int r6, java.nio.charset.Charset r7) {
            r3 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 1
            r1 = 0
            if (r5 < 0) goto L10
            r2 = r0
            goto L11
        L10:
            r2 = r1
        L11:
            if (r2 == 0) goto L9d
            if (r6 < r5) goto L17
            r2 = r0
            goto L18
        L17:
            r2 = r1
        L18:
            if (r2 == 0) goto L75
            int r2 = r4.length()
            if (r6 > r2) goto L21
            goto L22
        L21:
            r0 = r1
        L22:
            if (r0 == 0) goto L49
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            if (r0 == 0) goto L31
            okio.Buffer r0 = r3.writeUtf8(r4, r5, r6)
            return r0
        L31:
            java.lang.String r0 = r4.substring(r5, r6)
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            byte[] r0 = r0.getBytes(r7)
            java.lang.String r2 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r2 = r0.length
            okio.Buffer r1 = r3.write(r0, r1, r2)
            return r1
        L49:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "endIndex > string.length: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = " > "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r4.length()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L75:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "endIndex < beginIndex: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = " < "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L9d:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "beginIndex < 0: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeString(java.lang.String r3, java.nio.charset.Charset r4) {
            r2 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.length()
            r1 = 0
            okio.Buffer r0 = r2.writeString(r3, r1, r0, r4)
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeString(java.lang.String r2, int r3, int r4, java.nio.charset.Charset r5) {
            r1 = this;
            okio.Buffer r0 = r1.writeString(r2, r3, r4, r5)
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeString(java.lang.String r2, java.nio.charset.Charset r3) {
            r1 = this;
            okio.Buffer r0 = r1.writeString(r2, r3)
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    public final okio.Buffer writeTo(java.io.OutputStream r8) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            r1 = r7
            r2 = r8
            okio.Buffer r0 = writeTo$default(r1, r2, r3, r5, r6)
            return r0
    }

    public final okio.Buffer writeTo(java.io.OutputStream r9, long r10) throws java.io.IOException {
            r8 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r4 = r10
            long r0 = r8.size
            r2 = 0
            okio.SegmentedByteString.checkOffsetAndCount(r0, r2, r4)
            okio.Segment r0 = r8.head
        Lf:
            r1 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L49
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            r2 = 0
            long r6 = (long) r1
            long r6 = java.lang.Math.min(r4, r6)
            int r1 = (int) r6
            byte[] r2 = r0.data
            int r3 = r0.pos
            r9.write(r2, r3, r1)
            int r2 = r0.pos
            int r2 = r2 + r1
            r0.pos = r2
            long r2 = r8.size
            long r6 = (long) r1
            long r2 = r2 - r6
            r8.size = r2
            long r2 = (long) r1
            long r4 = r4 - r2
            int r2 = r0.pos
            int r3 = r0.limit
            if (r2 != r3) goto Lf
            r2 = r0
            okio.Segment r0 = r2.pop()
            r8.head = r0
            okio.SegmentPool.recycle(r2)
            goto Lf
        L49:
            return r8
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeUtf8(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r3.length()
            okio.Buffer r0 = r2.writeUtf8(r3, r0, r1)
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeUtf8(java.lang.String r19, int r20, int r21) {
            r18 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.String r3 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            r3 = r18
            r4 = 0
            r6 = 1
            if (r1 < 0) goto L13
            r7 = r6
            goto L14
        L13:
            r7 = 0
        L14:
            if (r7 == 0) goto L1c4
            if (r2 < r1) goto L1a
            r7 = r6
            goto L1b
        L1a:
            r7 = 0
        L1b:
            if (r7 == 0) goto L19c
            int r7 = r19.length()
            if (r2 > r7) goto L25
            r7 = r6
            goto L26
        L25:
            r7 = 0
        L26:
            if (r7 == 0) goto L170
            r7 = r20
        L2a:
            if (r7 >= r2) goto L16e
            char r8 = r0.charAt(r7)
            r9 = 128(0x80, float:1.8E-43)
            if (r8 >= r9) goto L70
            okio.Segment r10 = r3.writableSegment$okio(r6)
            byte[] r11 = r10.data
            int r12 = r10.limit
            int r12 = r12 - r7
            int r13 = 8192 - r12
            int r13 = java.lang.Math.min(r2, r13)
            int r14 = r7 + 1
            int r7 = r7 + r12
            byte r15 = (byte) r8
            r11[r7] = r15
            r7 = r14
        L4b:
            if (r7 >= r13) goto L5b
            char r8 = r0.charAt(r7)
            if (r8 >= r9) goto L5b
            int r14 = r7 + 1
            int r7 = r7 + r12
            byte r15 = (byte) r8
            r11[r7] = r15
            r7 = r14
            goto L4b
        L5b:
            int r9 = r7 + r12
            int r14 = r10.limit
            int r9 = r9 - r14
            int r14 = r10.limit
            int r14 = r14 + r9
            r10.limit = r14
            long r14 = r3.size()
            long r5 = (long) r9
            long r14 = r14 + r5
            r3.setSize$okio(r14)
            r6 = 1
            goto L2a
        L70:
            r5 = 2048(0x800, float:2.87E-42)
            r6 = 2
            if (r8 >= r5) goto La4
            okio.Segment r5 = r3.writableSegment$okio(r6)
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
            long r9 = r3.size()
            r11 = 2
            long r9 = r9 + r11
            r3.setSize$okio(r9)
            int r7 = r7 + 1
            r6 = 1
            goto L2a
        La4:
            r5 = 55296(0xd800, float:7.7486E-41)
            r11 = 63
            if (r8 < r5) goto L130
            r5 = 57343(0xdfff, float:8.0355E-41)
            if (r8 <= r5) goto Lb2
            goto L130
        Lb2:
            int r5 = r7 + 1
            if (r5 >= r2) goto Lbd
            int r5 = r7 + 1
            char r5 = r0.charAt(r5)
            goto Lbe
        Lbd:
            r5 = 0
        Lbe:
            r12 = 56319(0xdbff, float:7.892E-41)
            if (r8 > r12) goto L128
            r12 = 56320(0xdc00, float:7.8921E-41)
            if (r12 > r5) goto Lcf
            r12 = 57344(0xe000, float:8.0356E-41)
            if (r5 >= r12) goto Lcf
            r12 = 1
            goto Ld0
        Lcf:
            r12 = 0
        Ld0:
            if (r12 != 0) goto Ld3
            goto L128
        Ld3:
            r12 = r8 & 1023(0x3ff, float:1.434E-42)
            int r12 = r12 << 10
            r13 = r5 & 1023(0x3ff, float:1.434E-42)
            r12 = r12 | r13
            r13 = 65536(0x10000, float:9.1835E-41)
            int r12 = r12 + r13
            r13 = 4
            okio.Segment r14 = r3.writableSegment$okio(r13)
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
            long r9 = r3.size()
            r16 = 4
            long r9 = r9 + r16
            r3.setSize$okio(r9)
            int r7 = r7 + 2
            r6 = 1
            goto L2a
        L128:
            r3.writeByte(r11)
            int r7 = r7 + 1
            r6 = 1
            goto L2a
        L130:
            r5 = 3
            okio.Segment r10 = r3.writableSegment$okio(r5)
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
            long r5 = r3.size()
            r11 = 3
            long r5 = r5 + r11
            r3.setSize$okio(r5)
            int r7 = r7 + 1
            r6 = r13
            goto L2a
        L16e:
            return r3
        L170:
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "endIndex > string.length: "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.String r7 = " > "
            java.lang.StringBuilder r6 = r6.append(r7)
            int r7 = r19.length()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L19c:
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "endIndex < beginIndex: "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.String r7 = " < "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L1c4:
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "beginIndex < 0: "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeUtf8(java.lang.String r2) {
            r1 = this;
            okio.Buffer r0 = r1.writeUtf8(r2)
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeUtf8(java.lang.String r2, int r3, int r4) {
            r1 = this;
            okio.Buffer r0 = r1.writeUtf8(r2, r3, r4)
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeUtf8CodePoint(int r13) {
            r12 = this;
            r0 = r12
            r1 = 0
            r2 = 128(0x80, float:1.8E-43)
            if (r13 >= r2) goto Lc
            r0.writeByte(r13)
            goto Ld4
        Lc:
            r3 = 2048(0x800, float:2.87E-42)
            r4 = 1
            r5 = 2
            if (r13 >= r3) goto L3d
            okio.Segment r3 = r0.writableSegment$okio(r5)
            byte[] r6 = r3.data
            int r7 = r3.limit
            int r8 = r13 >> 6
            r8 = r8 | 192(0xc0, float:2.69E-43)
            byte r8 = (byte) r8
            r6[r7] = r8
            byte[] r6 = r3.data
            int r7 = r3.limit
            int r7 = r7 + r4
            r4 = r13 & 63
            r2 = r2 | r4
            byte r2 = (byte) r2
            r6[r7] = r2
            int r2 = r3.limit
            int r2 = r2 + r5
            r3.limit = r2
            long r4 = r0.size()
            r6 = 2
            long r4 = r4 + r6
            r0.setSize$okio(r4)
            goto Ld4
        L3d:
            r3 = 55296(0xd800, float:7.7486E-41)
            r6 = 0
            if (r3 > r13) goto L49
            r3 = 57344(0xe000, float:8.0356E-41)
            if (r13 >= r3) goto L49
            r6 = r4
        L49:
            r3 = 63
            if (r6 == 0) goto L52
            r0.writeByte(r3)
            goto Ld4
        L52:
            r6 = 65536(0x10000, float:9.1835E-41)
            r7 = 3
            if (r13 >= r6) goto L8d
            okio.Segment r6 = r0.writableSegment$okio(r7)
            byte[] r8 = r6.data
            int r9 = r6.limit
            int r10 = r13 >> 12
            r10 = r10 | 224(0xe0, float:3.14E-43)
            byte r10 = (byte) r10
            r8[r9] = r10
            byte[] r8 = r6.data
            int r9 = r6.limit
            int r9 = r9 + r4
            int r4 = r13 >> 6
            r3 = r3 & r4
            r3 = r3 | r2
            byte r3 = (byte) r3
            r8[r9] = r3
            byte[] r3 = r6.data
            int r4 = r6.limit
            int r4 = r4 + r5
            r5 = r13 & 63
            r2 = r2 | r5
            byte r2 = (byte) r2
            r3[r4] = r2
            int r2 = r6.limit
            int r2 = r2 + r7
            r6.limit = r2
            long r2 = r0.size()
            r4 = 3
            long r2 = r2 + r4
            r0.setSize$okio(r2)
            goto Ld4
        L8d:
            r6 = 1114111(0x10ffff, float:1.561202E-39)
            if (r13 > r6) goto Ld6
            r6 = 4
            okio.Segment r8 = r0.writableSegment$okio(r6)
            byte[] r9 = r8.data
            int r10 = r8.limit
            int r11 = r13 >> 18
            r11 = r11 | 240(0xf0, float:3.36E-43)
            byte r11 = (byte) r11
            r9[r10] = r11
            byte[] r9 = r8.data
            int r10 = r8.limit
            int r10 = r10 + r4
            int r4 = r13 >> 12
            r4 = r4 & r3
            r4 = r4 | r2
            byte r4 = (byte) r4
            r9[r10] = r4
            byte[] r4 = r8.data
            int r9 = r8.limit
            int r9 = r9 + r5
            int r5 = r13 >> 6
            r3 = r3 & r5
            r3 = r3 | r2
            byte r3 = (byte) r3
            r4[r9] = r3
            byte[] r3 = r8.data
            int r4 = r8.limit
            int r4 = r4 + r7
            r5 = r13 & 63
            r2 = r2 | r5
            byte r2 = (byte) r2
            r3[r4] = r2
            int r2 = r8.limit
            int r2 = r2 + r6
            r8.limit = r2
            long r2 = r0.size()
            r4 = 4
            long r2 = r2 + r4
            r0.setSize$okio(r2)
        Ld4:
            return r0
        Ld6:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected code point: 0x"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = okio.SegmentedByteString.toHexString(r13)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeUtf8CodePoint(int r2) {
            r1 = this;
            okio.Buffer r0 = r1.writeUtf8CodePoint(r2)
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }
}

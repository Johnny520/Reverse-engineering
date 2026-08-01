package okhttp3.internal.p004ws;

/* JADX INFO: compiled from: WebSocketWriter.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!J\u0018\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020!H\u0002J\u0016\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020!J\u000e\u0010(\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020!J\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, m115d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "isClient", "", "sink", "Lokio/BufferedSink;", "random", "Ljava/util/Random;", "perMessageDeflate", "noContextTakeover", "minimumDeflateSize", "", "(ZLokio/BufferedSink;Ljava/util/Random;ZZJ)V", "maskCursor", "Lokio/Buffer$UnsafeCursor;", "maskKey", "", "messageBuffer", "Lokio/Buffer;", "messageDeflater", "Lokhttp3/internal/ws/MessageDeflater;", "getRandom", "()Ljava/util/Random;", "getSink", "()Lokio/BufferedSink;", "sinkBuffer", "writerClosed", "close", "", "writeClose", "code", "", "reason", "Lokio/ByteString;", "writeControlFrame", "opcode", "payload", "writeMessageFrame", "formatOpcode", "data", "writePing", "writePong", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class WebSocketWriter implements java.io.Closeable {
    private final boolean isClient;
    private final okio.Buffer.UnsafeCursor maskCursor;
    private final byte[] maskKey;
    private final okio.Buffer messageBuffer;
    private okhttp3.internal.p004ws.MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final java.util.Random random;
    private final okio.BufferedSink sink;
    private final okio.Buffer sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean r3, okio.BufferedSink r4, java.util.Random r5, boolean r6, boolean r7, long r8) {
            r2 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r2.<init>()
            r2.isClient = r3
            r2.sink = r4
            r2.random = r5
            r2.perMessageDeflate = r6
            r2.noContextTakeover = r7
            r2.minimumDeflateSize = r8
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r2.messageBuffer = r0
            okio.BufferedSink r0 = r2.sink
            okio.Buffer r0 = r0.getBuffer()
            r2.sinkBuffer = r0
            boolean r0 = r2.isClient
            r1 = 0
            if (r0 == 0) goto L31
            r0 = 4
            byte[] r0 = new byte[r0]
            goto L32
        L31:
            r0 = r1
        L32:
            r2.maskKey = r0
            boolean r0 = r2.isClient
            if (r0 == 0) goto L3d
            okio.Buffer$UnsafeCursor r1 = new okio.Buffer$UnsafeCursor
            r1.<init>()
        L3d:
            r2.maskCursor = r1
            return
    }

    private final void writeControlFrame(int r9, okio.ByteString r10) throws java.io.IOException {
            r8 = this;
            boolean r0 = r8.writerClosed
            if (r0 != 0) goto L81
            int r0 = r10.size()
            long r1 = (long) r0
            r3 = 125(0x7d, double:6.2E-322)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L73
            r1 = r9 | 128(0x80, float:1.8E-43)
            okio.Buffer r2 = r8.sinkBuffer
            r2.writeByte(r1)
            r2 = r0
            boolean r3 = r8.isClient
            if (r3 == 0) goto L63
            r2 = r2 | 128(0x80, float:1.8E-43)
            okio.Buffer r3 = r8.sinkBuffer
            r3.writeByte(r2)
            java.util.Random r3 = r8.random
            byte[] r4 = r8.maskKey
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r3.nextBytes(r4)
            okio.Buffer r3 = r8.sinkBuffer
            byte[] r4 = r8.maskKey
            r3.write(r4)
            if (r0 <= 0) goto L6d
            okio.Buffer r3 = r8.sinkBuffer
            long r3 = r3.size()
            okio.Buffer r5 = r8.sinkBuffer
            r5.write(r10)
            okio.Buffer r5 = r8.sinkBuffer
            okio.Buffer$UnsafeCursor r6 = r8.maskCursor
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r5.readAndWriteUnsafe(r6)
            okio.Buffer$UnsafeCursor r5 = r8.maskCursor
            r5.seek(r3)
            okhttp3.internal.ws.WebSocketProtocol r5 = okhttp3.internal.p004ws.WebSocketProtocol.INSTANCE
            okio.Buffer$UnsafeCursor r6 = r8.maskCursor
            byte[] r7 = r8.maskKey
            r5.toggleMask(r6, r7)
            okio.Buffer$UnsafeCursor r5 = r8.maskCursor
            r5.close()
            goto L6d
        L63:
            okio.Buffer r3 = r8.sinkBuffer
            r3.writeByte(r2)
            okio.Buffer r3 = r8.sinkBuffer
            r3.write(r10)
        L6d:
            okio.BufferedSink r3 = r8.sink
            r3.flush()
            return
        L73:
            r1 = 0
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Payload size must be less than or equal to 125"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L81:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            okhttp3.internal.ws.MessageDeflater r0 = r1.messageDeflater
            if (r0 == 0) goto L7
            r0.close()
        L7:
            return
    }

    public final java.util.Random getRandom() {
            r1 = this;
            java.util.Random r0 = r1.random
            return r0
    }

    public final okio.BufferedSink getSink() {
            r1 = this;
            okio.BufferedSink r0 = r1.sink
            return r0
    }

    public final void writeClose(int r4, okio.ByteString r5) throws java.io.IOException {
            r3 = this;
            okio.ByteString r0 = okio.ByteString.EMPTY
            if (r4 != 0) goto L6
            if (r5 == 0) goto L20
        L6:
            if (r4 == 0) goto Ld
            okhttp3.internal.ws.WebSocketProtocol r1 = okhttp3.internal.p004ws.WebSocketProtocol.INSTANCE
            r1.validateCloseCode(r4)
        Ld:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r2 = 0
            r1.writeShort(r4)
            if (r5 == 0) goto L1b
            r1.write(r5)
        L1b:
            okio.ByteString r1 = r1.readByteString()
            r0 = r1
        L20:
            r1 = 8
            r2 = 1
            r3.writeControlFrame(r1, r0)     // Catch: java.lang.Throwable -> L2b
            r3.writerClosed = r2
            return
        L2b:
            r1 = move-exception
            r3.writerClosed = r2
            throw r1
    }

    public final void writeMessageFrame(int r9, okio.ByteString r10) throws java.io.IOException {
            r8 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            boolean r0 = r8.writerClosed
            if (r0 != 0) goto Lbd
            okio.Buffer r0 = r8.messageBuffer
            r0.write(r10)
            r0 = r9 | 128(0x80, float:1.8E-43)
            boolean r1 = r8.perMessageDeflate
            if (r1 == 0) goto L36
            int r1 = r10.size()
            long r1 = (long) r1
            long r3 = r8.minimumDeflateSize
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L36
            okhttp3.internal.ws.MessageDeflater r1 = r8.messageDeflater
            if (r1 != 0) goto L2e
            okhttp3.internal.ws.MessageDeflater r1 = new okhttp3.internal.ws.MessageDeflater
            boolean r2 = r8.noContextTakeover
            r1.<init>(r2)
            r2 = r1
            r3 = 0
            r8.messageDeflater = r2
        L2e:
            okio.Buffer r2 = r8.messageBuffer
            r1.deflate(r2)
            r0 = r0 | 64
        L36:
            okio.Buffer r1 = r8.messageBuffer
            long r1 = r1.size()
            okio.Buffer r3 = r8.sinkBuffer
            r3.writeByte(r0)
            r3 = 0
            boolean r4 = r8.isClient
            if (r4 == 0) goto L48
            r3 = r3 | 128(0x80, float:1.8E-43)
        L48:
            r4 = 125(0x7d, double:6.2E-322)
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 > 0) goto L57
            int r4 = (int) r1
            r3 = r3 | r4
            okio.Buffer r4 = r8.sinkBuffer
            r4.writeByte(r3)
            goto L78
        L57:
            r4 = 65535(0xffff, double:3.23786E-319)
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 > 0) goto L6c
            r3 = r3 | 126(0x7e, float:1.77E-43)
            okio.Buffer r4 = r8.sinkBuffer
            r4.writeByte(r3)
            okio.Buffer r4 = r8.sinkBuffer
            int r5 = (int) r1
            r4.writeShort(r5)
            goto L78
        L6c:
            r3 = r3 | 127(0x7f, float:1.78E-43)
            okio.Buffer r4 = r8.sinkBuffer
            r4.writeByte(r3)
            okio.Buffer r4 = r8.sinkBuffer
            r4.writeLong(r1)
        L78:
            boolean r4 = r8.isClient
            if (r4 == 0) goto Lb0
            java.util.Random r4 = r8.random
            byte[] r5 = r8.maskKey
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r4.nextBytes(r5)
            okio.Buffer r4 = r8.sinkBuffer
            byte[] r5 = r8.maskKey
            r4.write(r5)
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 <= 0) goto Lb0
            okio.Buffer r6 = r8.messageBuffer
            okio.Buffer$UnsafeCursor r7 = r8.maskCursor
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            r6.readAndWriteUnsafe(r7)
            okio.Buffer$UnsafeCursor r6 = r8.maskCursor
            r6.seek(r4)
            okhttp3.internal.ws.WebSocketProtocol r4 = okhttp3.internal.p004ws.WebSocketProtocol.INSTANCE
            okio.Buffer$UnsafeCursor r5 = r8.maskCursor
            byte[] r6 = r8.maskKey
            r4.toggleMask(r5, r6)
            okio.Buffer$UnsafeCursor r4 = r8.maskCursor
            r4.close()
        Lb0:
            okio.Buffer r4 = r8.sinkBuffer
            okio.Buffer r5 = r8.messageBuffer
            r4.write(r5, r1)
            okio.BufferedSink r4 = r8.sink
            r4.emit()
            return
        Lbd:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
    }

    public final void writePing(okio.ByteString r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 9
            r1.writeControlFrame(r0, r2)
            return
    }

    public final void writePong(okio.ByteString r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 10
            r1.writeControlFrame(r0, r2)
            return
    }
}

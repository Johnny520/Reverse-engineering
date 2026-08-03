package okhttp3.internal.ws;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WebSocketWriter implements java.io.Closeable {
    private final boolean isClient;
    private final okio.Buffer.UnsafeCursor maskCursor;
    private final byte[] maskKey;
    private final okio.Buffer messageBuffer;
    private okhttp3.internal.ws.MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final java.util.Random random;
    private final okio.BufferedSink sink;
    private final okio.Buffer sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean r1, okio.BufferedSink r2, java.util.Random r3, boolean r4, boolean r5, long r6) {
            r0 = this;
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.isClient = r1
            r0.sink = r2
            r0.random = r3
            r0.perMessageDeflate = r4
            r0.noContextTakeover = r5
            r0.minimumDeflateSize = r6
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            r0.messageBuffer = r3
            okio.Buffer r2 = r2.getBuffer()
            r0.sinkBuffer = r2
            r2 = 0
            if (r1 == 0) goto L29
            r3 = 4
            byte[] r3 = new byte[r3]
            goto L2a
        L29:
            r3 = r2
        L2a:
            r0.maskKey = r3
            if (r1 == 0) goto L33
            okio.Buffer$UnsafeCursor r2 = new okio.Buffer$UnsafeCursor
            r2.<init>()
        L33:
            r0.maskCursor = r2
            return
    }

    private final void writeControlFrame(int r6, okio.ByteString r7) {
            r5 = this;
            boolean r0 = r5.writerClosed
            if (r0 != 0) goto L71
            int r0 = r7.size()
            long r1 = (long) r0
            r3 = 125(0x7d, double:6.2E-322)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L6b
            r6 = r6 | 128(0x80, float:1.8E-43)
            okio.Buffer r1 = r5.sinkBuffer
            r1.writeByte(r6)
            boolean r6 = r5.isClient
            okio.Buffer r1 = r5.sinkBuffer
            if (r6 == 0) goto L5d
            r6 = r0 | 128(0x80, float:1.8E-43)
            r1.writeByte(r6)
            java.util.Random r6 = r5.random
            byte[] r1 = r5.maskKey
            r1.getClass()
            r6.nextBytes(r1)
            okio.Buffer r6 = r5.sinkBuffer
            byte[] r1 = r5.maskKey
            r6.write(r1)
            if (r0 <= 0) goto L65
            okio.Buffer r6 = r5.sinkBuffer
            long r0 = r6.size()
            okio.Buffer r6 = r5.sinkBuffer
            r6.write(r7)
            okio.Buffer r6 = r5.sinkBuffer
            okio.Buffer$UnsafeCursor r7 = r5.maskCursor
            r7.getClass()
            r6.readAndWriteUnsafe(r7)
            okio.Buffer$UnsafeCursor r6 = r5.maskCursor
            r6.seek(r0)
            okhttp3.internal.ws.WebSocketProtocol r6 = okhttp3.internal.ws.WebSocketProtocol.INSTANCE
            okio.Buffer$UnsafeCursor r7 = r5.maskCursor
            byte[] r0 = r5.maskKey
            r6.toggleMask(r7, r0)
            okio.Buffer$UnsafeCursor r6 = r5.maskCursor
            r6.close()
            goto L65
        L5d:
            r1.writeByte(r0)
            okio.Buffer r6 = r5.sinkBuffer
            r6.write(r7)
        L65:
            okio.BufferedSink r6 = r5.sink
            r6.flush()
            return
        L6b:
            java.lang.String r6 = "Payload size must be less than or equal to 125"
            j8.o.t(r6)
            return
        L71:
            java.lang.String r6 = "closed"
            j8.o.y(r6)
            return
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

    public final void writeClose(int r2, okio.ByteString r3) {
            r1 = this;
            okio.ByteString r0 = okio.ByteString.EMPTY
            if (r2 != 0) goto L6
            if (r3 == 0) goto L1e
        L6:
            if (r2 == 0) goto Ld
            okhttp3.internal.ws.WebSocketProtocol r0 = okhttp3.internal.ws.WebSocketProtocol.INSTANCE
            r0.validateCloseCode(r2)
        Ld:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r0.writeShort(r2)
            if (r3 == 0) goto L1a
            r0.write(r3)
        L1a:
            okio.ByteString r0 = r0.readByteString()
        L1e:
            r2 = 8
            r3 = 1
            r1.writeControlFrame(r2, r0)     // Catch: java.lang.Throwable -> L27
            r1.writerClosed = r3
            return
        L27:
            r2 = move-exception
            r1.writerClosed = r3
            throw r2
    }

    public final void writeMessageFrame(int r6, okio.ByteString r7) {
            r5 = this;
            r7.getClass()
            boolean r0 = r5.writerClosed
            if (r0 != 0) goto Lb6
            okio.Buffer r0 = r5.messageBuffer
            r0.write(r7)
            r0 = r6 | 128(0x80, float:1.8E-43)
            boolean r1 = r5.perMessageDeflate
            if (r1 == 0) goto L31
            int r7 = r7.size()
            long r1 = (long) r7
            long r3 = r5.minimumDeflateSize
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 < 0) goto L31
            okhttp3.internal.ws.MessageDeflater r7 = r5.messageDeflater
            if (r7 != 0) goto L2a
            okhttp3.internal.ws.MessageDeflater r7 = new okhttp3.internal.ws.MessageDeflater
            boolean r0 = r5.noContextTakeover
            r7.<init>(r0)
            r5.messageDeflater = r7
        L2a:
            okio.Buffer r0 = r5.messageBuffer
            r7.deflate(r0)
            r0 = r6 | 192(0xc0, float:2.69E-43)
        L31:
            okio.Buffer r6 = r5.messageBuffer
            long r6 = r6.size()
            okio.Buffer r1 = r5.sinkBuffer
            r1.writeByte(r0)
            boolean r0 = r5.isClient
            if (r0 == 0) goto L43
            r0 = 128(0x80, float:1.8E-43)
            goto L44
        L43:
            r0 = 0
        L44:
            r1 = 125(0x7d, double:6.2E-322)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 > 0) goto L52
            int r1 = (int) r6
            r0 = r0 | r1
            okio.Buffer r1 = r5.sinkBuffer
            r1.writeByte(r0)
            goto L71
        L52:
            r1 = 65535(0xffff, double:3.23786E-319)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            okio.Buffer r2 = r5.sinkBuffer
            if (r1 > 0) goto L67
            r0 = r0 | 126(0x7e, float:1.77E-43)
            r2.writeByte(r0)
            okio.Buffer r0 = r5.sinkBuffer
            int r1 = (int) r6
            r0.writeShort(r1)
            goto L71
        L67:
            r0 = r0 | 127(0x7f, float:1.78E-43)
            r2.writeByte(r0)
            okio.Buffer r0 = r5.sinkBuffer
            r0.writeLong(r6)
        L71:
            boolean r0 = r5.isClient
            if (r0 == 0) goto La9
            java.util.Random r0 = r5.random
            byte[] r1 = r5.maskKey
            r1.getClass()
            r0.nextBytes(r1)
            okio.Buffer r0 = r5.sinkBuffer
            byte[] r1 = r5.maskKey
            r0.write(r1)
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto La9
            okio.Buffer r2 = r5.messageBuffer
            okio.Buffer$UnsafeCursor r3 = r5.maskCursor
            r3.getClass()
            r2.readAndWriteUnsafe(r3)
            okio.Buffer$UnsafeCursor r2 = r5.maskCursor
            r2.seek(r0)
            okhttp3.internal.ws.WebSocketProtocol r0 = okhttp3.internal.ws.WebSocketProtocol.INSTANCE
            okio.Buffer$UnsafeCursor r1 = r5.maskCursor
            byte[] r2 = r5.maskKey
            r0.toggleMask(r1, r2)
            okio.Buffer$UnsafeCursor r0 = r5.maskCursor
            r0.close()
        La9:
            okio.Buffer r0 = r5.sinkBuffer
            okio.Buffer r1 = r5.messageBuffer
            r0.write(r1, r6)
            okio.BufferedSink r6 = r5.sink
            r6.emit()
            return
        Lb6:
            java.lang.String r6 = "closed"
            j8.o.y(r6)
            return
    }

    public final void writePing(okio.ByteString r2) {
            r1 = this;
            r2.getClass()
            r0 = 9
            r1.writeControlFrame(r0, r2)
            return
    }

    public final void writePong(okio.ByteString r2) {
            r1 = this;
            r2.getClass()
            r0 = 10
            r1.writeControlFrame(r0, r2)
            return
    }
}

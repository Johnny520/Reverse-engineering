package okhttp3.internal.ws;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WebSocketReader implements java.io.Closeable {
    private boolean closed;
    private final okio.Buffer controlFrameBuffer;
    private final okhttp3.internal.ws.WebSocketReader.FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final okio.Buffer.UnsafeCursor maskCursor;
    private final byte[] maskKey;
    private final okio.Buffer messageFrameBuffer;
    private okhttp3.internal.ws.MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final okio.BufferedSource source;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface FrameCallback {
        void onReadClose(int r1, java.lang.String r2);

        void onReadMessage(java.lang.String r1);

        void onReadMessage(okio.ByteString r1);

        void onReadPing(okio.ByteString r1);

        void onReadPong(okio.ByteString r1);
    }

    public WebSocketReader(boolean r1, okio.BufferedSource r2, okhttp3.internal.ws.WebSocketReader.FrameCallback r3, boolean r4, boolean r5) {
            r0 = this;
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.isClient = r1
            r0.source = r2
            r0.frameCallback = r3
            r0.perMessageDeflate = r4
            r0.noContextTakeover = r5
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            r0.controlFrameBuffer = r2
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            r0.messageFrameBuffer = r2
            r2 = 0
            if (r1 == 0) goto L26
            r3 = r2
            goto L29
        L26:
            r3 = 4
            byte[] r3 = new byte[r3]
        L29:
            r0.maskKey = r3
            if (r1 == 0) goto L2e
            goto L33
        L2e:
            okio.Buffer$UnsafeCursor r2 = new okio.Buffer$UnsafeCursor
            r2.<init>()
        L33:
            r0.maskCursor = r2
            return
    }

    private final void readControlFrame() {
            r6 = this;
            long r0 = r6.frameLength
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L33
            okio.BufferedSource r4 = r6.source
            okio.Buffer r5 = r6.controlFrameBuffer
            r4.readFully(r5, r0)
            boolean r0 = r6.isClient
            if (r0 != 0) goto L33
            okio.Buffer r0 = r6.controlFrameBuffer
            okio.Buffer$UnsafeCursor r1 = r6.maskCursor
            r1.getClass()
            r0.readAndWriteUnsafe(r1)
            okio.Buffer$UnsafeCursor r0 = r6.maskCursor
            r0.seek(r2)
            okhttp3.internal.ws.WebSocketProtocol r0 = okhttp3.internal.ws.WebSocketProtocol.INSTANCE
            okio.Buffer$UnsafeCursor r1 = r6.maskCursor
            byte[] r4 = r6.maskKey
            r4.getClass()
            r0.toggleMask(r1, r4)
            okio.Buffer$UnsafeCursor r0 = r6.maskCursor
            r0.close()
        L33:
            int r0 = r6.opcode
            switch(r0) {
                case 8: goto L6a;
                case 9: goto L5e;
                case 10: goto L52;
                default: goto L38;
            }
        L38:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            int r1 = r6.opcode
            java.lang.String r1 = okhttp3.internal.Util.toHexString(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown control opcode: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L52:
            okhttp3.internal.ws.WebSocketReader$FrameCallback r0 = r6.frameCallback
            okio.Buffer r1 = r6.controlFrameBuffer
            okio.ByteString r1 = r1.readByteString()
            r0.onReadPong(r1)
            return
        L5e:
            okhttp3.internal.ws.WebSocketReader$FrameCallback r0 = r6.frameCallback
            okio.Buffer r1 = r6.controlFrameBuffer
            okio.ByteString r1 = r1.readByteString()
            r0.onReadPing(r1)
            return
        L6a:
            okio.Buffer r0 = r6.controlFrameBuffer
            long r0 = r0.size()
            r4 = 1
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto La2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L95
            okio.Buffer r0 = r6.controlFrameBuffer
            short r0 = r0.readShort()
            okio.Buffer r1 = r6.controlFrameBuffer
            java.lang.String r1 = r1.readUtf8()
            okhttp3.internal.ws.WebSocketProtocol r2 = okhttp3.internal.ws.WebSocketProtocol.INSTANCE
            java.lang.String r2 = r2.closeCodeExceptionMessage(r0)
            if (r2 != 0) goto L8f
            goto L99
        L8f:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r2)
            throw r0
        L95:
            r0 = 1005(0x3ed, float:1.408E-42)
            java.lang.String r1 = ""
        L99:
            okhttp3.internal.ws.WebSocketReader$FrameCallback r2 = r6.frameCallback
            r2.onReadClose(r0, r1)
            r0 = 1
            r6.closed = r0
            return
        La2:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Malformed close payload length of 1."
            r0.<init>(r1)
            throw r0
    }

    private final void readHeader() {
            r8 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            boolean r1 = r8.closed
            if (r1 != 0) goto L132
            okio.BufferedSource r1 = r8.source
            okio.Timeout r1 = r1.timeout()
            long r1 = r1.timeoutNanos()
            okio.BufferedSource r3 = r8.source
            okio.Timeout r3 = r3.timeout()
            r3.clearTimeout()
            okio.BufferedSource r3 = r8.source     // Catch: java.lang.Throwable -> L127
            byte r3 = r3.readByte()     // Catch: java.lang.Throwable -> L127
            r4 = 255(0xff, float:3.57E-43)
            int r3 = okhttp3.internal.Util.and(r3, r4)     // Catch: java.lang.Throwable -> L127
            okio.BufferedSource r5 = r8.source
            okio.Timeout r5 = r5.timeout()
            r5.timeout(r1, r0)
            r0 = r3 & 15
            r8.opcode = r0
            r1 = r3 & 128(0x80, float:1.8E-43)
            r2 = 0
            r5 = 1
            if (r1 == 0) goto L3a
            r1 = r5
            goto L3b
        L3a:
            r1 = r2
        L3b:
            r8.isFinalFrame = r1
            r6 = r3 & 8
            if (r6 == 0) goto L43
            r6 = r5
            goto L44
        L43:
            r6 = r2
        L44:
            r8.isControlFrame = r6
            if (r6 == 0) goto L53
            if (r1 == 0) goto L4b
            goto L53
        L4b:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Control frames must be final."
            r0.<init>(r1)
            throw r0
        L53:
            r1 = r3 & 64
            if (r1 == 0) goto L59
            r1 = r5
            goto L5a
        L59:
            r1 = r2
        L5a:
            java.lang.String r6 = "Unexpected rsv1 flag"
            if (r0 == r5) goto L6a
            r7 = 2
            if (r0 == r7) goto L6a
            if (r1 != 0) goto L64
            goto L7b
        L64:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r6)
            throw r0
        L6a:
            if (r1 == 0) goto L78
            boolean r0 = r8.perMessageDeflate
            if (r0 == 0) goto L72
            r0 = r5
            goto L79
        L72:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r6)
            throw r0
        L78:
            r0 = r2
        L79:
            r8.readingCompressedMessage = r0
        L7b:
            r0 = r3 & 32
            if (r0 != 0) goto L11f
            r0 = r3 & 16
            if (r0 != 0) goto L117
            okio.BufferedSource r0 = r8.source
            byte r0 = r0.readByte()
            int r0 = okhttp3.internal.Util.and(r0, r4)
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L92
            r2 = r5
        L92:
            boolean r1 = r8.isClient
            if (r2 != r1) goto La5
            java.net.ProtocolException r0 = new java.net.ProtocolException
            boolean r1 = r8.isClient
            if (r1 == 0) goto L9f
            java.lang.String r1 = "Server-sent frames must not be masked."
            goto La1
        L9f:
            java.lang.String r1 = "Client-sent frames must be masked."
        La1:
            r0.<init>(r1)
            throw r0
        La5:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            long r0 = (long) r0
            r8.frameLength = r0
            r3 = 126(0x7e, double:6.23E-322)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto Lc1
            okio.BufferedSource r0 = r8.source
            short r0 = r0.readShort()
            r1 = 65535(0xffff, float:9.1834E-41)
            int r0 = okhttp3.internal.Util.and(r0, r1)
            long r0 = (long) r0
            r8.frameLength = r0
            goto Lf5
        Lc1:
            r3 = 127(0x7f, double:6.27E-322)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto Lf5
            okio.BufferedSource r0 = r8.source
            long r0 = r0.readLong()
            r8.frameLength = r0
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto Ld6
            goto Lf5
        Ld6:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            long r1 = r8.frameLength
            java.lang.String r1 = okhttp3.internal.Util.toHexString(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Frame length 0x"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " > 0x7FFFFFFFFFFFFFFF"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        Lf5:
            boolean r0 = r8.isControlFrame
            if (r0 == 0) goto L10a
            long r0 = r8.frameLength
            r3 = 125(0x7d, double:6.2E-322)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L102
            goto L10a
        L102:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Control frame must be less than 125B."
            r0.<init>(r1)
            throw r0
        L10a:
            if (r2 == 0) goto L116
            okio.BufferedSource r0 = r8.source
            byte[] r1 = r8.maskKey
            r1.getClass()
            r0.readFully(r1)
        L116:
            return
        L117:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Unexpected rsv3 flag"
            r0.<init>(r1)
            throw r0
        L11f:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Unexpected rsv2 flag"
            r0.<init>(r1)
            throw r0
        L127:
            r3 = move-exception
            okio.BufferedSource r4 = r8.source
            okio.Timeout r4 = r4.timeout()
            r4.timeout(r1, r0)
            throw r3
        L132:
            java.lang.String r0 = "closed"
            j8.o.y(r0)
            return
    }

    private final void readMessage() {
            r5 = this;
        L0:
            boolean r0 = r5.closed
            if (r0 != 0) goto L67
            long r0 = r5.frameLength
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L40
            okio.BufferedSource r2 = r5.source
            okio.Buffer r3 = r5.messageFrameBuffer
            r2.readFully(r3, r0)
            boolean r0 = r5.isClient
            if (r0 != 0) goto L40
            okio.Buffer r0 = r5.messageFrameBuffer
            okio.Buffer$UnsafeCursor r1 = r5.maskCursor
            r1.getClass()
            r0.readAndWriteUnsafe(r1)
            okio.Buffer$UnsafeCursor r0 = r5.maskCursor
            okio.Buffer r1 = r5.messageFrameBuffer
            long r1 = r1.size()
            long r3 = r5.frameLength
            long r1 = r1 - r3
            r0.seek(r1)
            okhttp3.internal.ws.WebSocketProtocol r0 = okhttp3.internal.ws.WebSocketProtocol.INSTANCE
            okio.Buffer$UnsafeCursor r1 = r5.maskCursor
            byte[] r2 = r5.maskKey
            r2.getClass()
            r0.toggleMask(r1, r2)
            okio.Buffer$UnsafeCursor r0 = r5.maskCursor
            r0.close()
        L40:
            boolean r0 = r5.isFinalFrame
            if (r0 != 0) goto L66
            r5.readUntilNonControlFrame()
            int r0 = r5.opcode
            if (r0 != 0) goto L4c
            goto L0
        L4c:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            int r1 = r5.opcode
            java.lang.String r1 = okhttp3.internal.Util.toHexString(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected continuation opcode. Got: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L66:
            return
        L67:
            java.lang.String r0 = "closed"
            j8.o.y(r0)
            return
    }

    private final void readMessageFrame() {
            r4 = this;
            int r0 = r4.opcode
            r1 = 1
            if (r0 == r1) goto L21
            r2 = 2
            if (r0 != r2) goto L9
            goto L21
        L9:
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r0 = okhttp3.internal.Util.toHexString(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown opcode: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L21:
            r4.readMessage()
            boolean r2 = r4.readingCompressedMessage
            if (r2 == 0) goto L3a
            okhttp3.internal.ws.MessageInflater r2 = r4.messageInflater
            if (r2 != 0) goto L35
            okhttp3.internal.ws.MessageInflater r2 = new okhttp3.internal.ws.MessageInflater
            boolean r3 = r4.noContextTakeover
            r2.<init>(r3)
            r4.messageInflater = r2
        L35:
            okio.Buffer r3 = r4.messageFrameBuffer
            r2.inflate(r3)
        L3a:
            okhttp3.internal.ws.WebSocketReader$FrameCallback r2 = r4.frameCallback
            if (r0 != r1) goto L48
            okio.Buffer r0 = r4.messageFrameBuffer
            java.lang.String r0 = r0.readUtf8()
            r2.onReadMessage(r0)
            return
        L48:
            okio.Buffer r0 = r4.messageFrameBuffer
            okio.ByteString r0 = r0.readByteString()
            r2.onReadMessage(r0)
            return
    }

    private final void readUntilNonControlFrame() {
            r1 = this;
        L0:
            boolean r0 = r1.closed
            if (r0 != 0) goto L10
            r1.readHeader()
            boolean r0 = r1.isControlFrame
            if (r0 != 0) goto Lc
            goto L10
        Lc:
            r1.readControlFrame()
            goto L0
        L10:
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            okhttp3.internal.ws.MessageInflater r0 = r1.messageInflater
            if (r0 == 0) goto L7
            r0.close()
        L7:
            return
    }

    public final okio.BufferedSource getSource() {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            return r0
    }

    public final void processNextFrame() {
            r1 = this;
            r1.readHeader()
            boolean r0 = r1.isControlFrame
            if (r0 == 0) goto Lb
            r1.readControlFrame()
            return
        Lb:
            r1.readMessageFrame()
            return
    }
}

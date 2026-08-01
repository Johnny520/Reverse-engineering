package okhttp3.internal.p004ws;

/* JADX INFO: compiled from: WebSocketReader.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001&B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0006\u0010 \u001a\u00020\u001fJ\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\b\u0010$\u001a\u00020\u001fH\u0002J\b\u0010%\u001a\u00020\u001fH\u0002R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, m115d2 = {"Lokhttp3/internal/ws/WebSocketReader;", "Ljava/io/Closeable;", "isClient", "", "source", "Lokio/BufferedSource;", "frameCallback", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "perMessageDeflate", "noContextTakeover", "(ZLokio/BufferedSource;Lokhttp3/internal/ws/WebSocketReader$FrameCallback;ZZ)V", "closed", "controlFrameBuffer", "Lokio/Buffer;", "frameLength", "", "isControlFrame", "isFinalFrame", "maskCursor", "Lokio/Buffer$UnsafeCursor;", "maskKey", "", "messageFrameBuffer", "messageInflater", "Lokhttp3/internal/ws/MessageInflater;", "opcode", "", "readingCompressedMessage", "getSource", "()Lokio/BufferedSource;", "close", "", "processNextFrame", "readControlFrame", "readHeader", "readMessage", "readMessageFrame", "readUntilNonControlFrame", "FrameCallback", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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
    private okhttp3.internal.p004ws.MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final okio.BufferedSource source;

    /* JADX INFO: compiled from: WebSocketReader.kt */
    @kotlin.Metadata(m114d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH&¨\u0006\u000f"}, m115d2 = {"Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "", "onReadClose", "", "code", "", "reason", "", "onReadMessage", "text", "bytes", "Lokio/ByteString;", "onReadPing", "payload", "onReadPong", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public interface FrameCallback {
        void onReadClose(int r1, java.lang.String r2);

        void onReadMessage(java.lang.String r1) throws java.io.IOException;

        void onReadMessage(okio.ByteString r1) throws java.io.IOException;

        void onReadPing(okio.ByteString r1);

        void onReadPong(okio.ByteString r1);
    }

    public WebSocketReader(boolean r3, okio.BufferedSource r4, okhttp3.internal.ws.WebSocketReader.FrameCallback r5, boolean r6, boolean r7) {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "frameCallback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r2.<init>()
            r2.isClient = r3
            r2.source = r4
            r2.frameCallback = r5
            r2.perMessageDeflate = r6
            r2.noContextTakeover = r7
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r2.controlFrameBuffer = r0
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r2.messageFrameBuffer = r0
            boolean r0 = r2.isClient
            r1 = 0
            if (r0 == 0) goto L2c
            r0 = r1
            goto L2f
        L2c:
            r0 = 4
            byte[] r0 = new byte[r0]
        L2f:
            r2.maskKey = r0
            boolean r0 = r2.isClient
            if (r0 == 0) goto L36
            goto L3b
        L36:
            okio.Buffer$UnsafeCursor r1 = new okio.Buffer$UnsafeCursor
            r1.<init>()
        L3b:
            r2.maskCursor = r1
            return
    }

    private final void readControlFrame() throws java.io.IOException {
            r8 = this;
            long r0 = r8.frameLength
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L35
            okio.BufferedSource r0 = r8.source
            okio.Buffer r1 = r8.controlFrameBuffer
            long r4 = r8.frameLength
            r0.readFully(r1, r4)
            boolean r0 = r8.isClient
            if (r0 != 0) goto L35
            okio.Buffer r0 = r8.controlFrameBuffer
            okio.Buffer$UnsafeCursor r1 = r8.maskCursor
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r0.readAndWriteUnsafe(r1)
            okio.Buffer$UnsafeCursor r0 = r8.maskCursor
            r0.seek(r2)
            okhttp3.internal.ws.WebSocketProtocol r0 = okhttp3.internal.p004ws.WebSocketProtocol.INSTANCE
            okio.Buffer$UnsafeCursor r1 = r8.maskCursor
            byte[] r4 = r8.maskKey
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r0.toggleMask(r1, r4)
            okio.Buffer$UnsafeCursor r0 = r8.maskCursor
            r0.close()
        L35:
            int r0 = r8.opcode
            switch(r0) {
                case 8: goto L71;
                case 9: goto L65;
                case 10: goto L59;
                default: goto L3a;
            }
        L3a:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown control opcode: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r8.opcode
            java.lang.String r2 = okhttp3.internal.Util.toHexString(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L59:
            okhttp3.internal.ws.WebSocketReader$FrameCallback r0 = r8.frameCallback
            okio.Buffer r1 = r8.controlFrameBuffer
            okio.ByteString r1 = r1.readByteString()
            r0.onReadPong(r1)
            goto La8
        L65:
            okhttp3.internal.ws.WebSocketReader$FrameCallback r0 = r8.frameCallback
            okio.Buffer r1 = r8.controlFrameBuffer
            okio.ByteString r1 = r1.readByteString()
            r0.onReadPing(r1)
            goto La8
        L71:
            r0 = 1005(0x3ed, float:1.408E-42)
            java.lang.String r1 = ""
            okio.Buffer r4 = r8.controlFrameBuffer
            long r4 = r4.size()
            r6 = 1
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto La9
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto La0
            okio.Buffer r2 = r8.controlFrameBuffer
            short r0 = r2.readShort()
            okio.Buffer r2 = r8.controlFrameBuffer
            java.lang.String r1 = r2.readUtf8()
            okhttp3.internal.ws.WebSocketProtocol r2 = okhttp3.internal.p004ws.WebSocketProtocol.INSTANCE
            java.lang.String r2 = r2.closeCodeExceptionMessage(r0)
            if (r2 != 0) goto L9a
            goto La0
        L9a:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            r3.<init>(r2)
            throw r3
        La0:
            okhttp3.internal.ws.WebSocketReader$FrameCallback r2 = r8.frameCallback
            r2.onReadClose(r0, r1)
            r2 = 1
            r8.closed = r2
        La8:
            return
        La9:
            java.net.ProtocolException r2 = new java.net.ProtocolException
            java.lang.String r3 = "Malformed close payload length of 1."
            r2.<init>(r3)
            throw r2
    }

    private final void readHeader() throws java.io.IOException, java.net.ProtocolException {
            r13 = this;
            boolean r0 = r13.closed
            if (r0 != 0) goto L153
            r0 = 0
            okio.BufferedSource r1 = r13.source
            okio.Timeout r1 = r1.timeout()
            long r1 = r1.timeoutNanos()
            okio.BufferedSource r3 = r13.source
            okio.Timeout r3 = r3.timeout()
            r3.clearTimeout()
            okio.BufferedSource r3 = r13.source     // Catch: java.lang.Throwable -> L146
            byte r3 = r3.readByte()     // Catch: java.lang.Throwable -> L146
            r4 = 255(0xff, float:3.57E-43)
            int r3 = okhttp3.internal.Util.and(r3, r4)     // Catch: java.lang.Throwable -> L146
            r0 = r3
            okio.BufferedSource r3 = r13.source
            okio.Timeout r3 = r3.timeout()
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            r3.timeout(r1, r5)
            r3 = r0 & 15
            r13.opcode = r3
            r3 = r0 & 128(0x80, float:1.8E-43)
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L3e
            r3 = r5
            goto L3f
        L3e:
            r3 = r6
        L3f:
            r13.isFinalFrame = r3
            r3 = r0 & 8
            if (r3 == 0) goto L47
            r3 = r5
            goto L48
        L47:
            r3 = r6
        L48:
            r13.isControlFrame = r3
            boolean r3 = r13.isControlFrame
            if (r3 == 0) goto L5b
            boolean r3 = r13.isFinalFrame
            if (r3 == 0) goto L53
            goto L5b
        L53:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r4 = "Control frames must be final."
            r3.<init>(r4)
            throw r3
        L5b:
            r3 = r0 & 64
            if (r3 == 0) goto L61
            r3 = r5
            goto L62
        L61:
            r3 = r6
        L62:
            int r7 = r13.opcode
            java.lang.String r8 = "Unexpected rsv1 flag"
            switch(r7) {
                case 1: goto L6c;
                case 2: goto L6c;
                default: goto L69;
            }
        L69:
            if (r3 != 0) goto L140
            goto L7d
        L6c:
            if (r3 == 0) goto L7a
            boolean r7 = r13.perMessageDeflate
            if (r7 == 0) goto L74
            r7 = r5
            goto L7b
        L74:
            java.net.ProtocolException r4 = new java.net.ProtocolException
            r4.<init>(r8)
            throw r4
        L7a:
            r7 = r6
        L7b:
            r13.readingCompressedMessage = r7
        L7d:
            r7 = r0 & 32
            if (r7 == 0) goto L83
            r7 = r5
            goto L84
        L83:
            r7 = r6
        L84:
            if (r7 != 0) goto L138
            r8 = r0 & 16
            if (r8 == 0) goto L8c
            r8 = r5
            goto L8d
        L8c:
            r8 = r6
        L8d:
            if (r8 != 0) goto L130
            okio.BufferedSource r9 = r13.source
            byte r9 = r9.readByte()
            int r4 = okhttp3.internal.Util.and(r9, r4)
            r9 = r4 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L9e
            goto L9f
        L9e:
            r5 = r6
        L9f:
            boolean r6 = r13.isClient
            if (r5 != r6) goto Lb2
            java.net.ProtocolException r6 = new java.net.ProtocolException
            boolean r9 = r13.isClient
            if (r9 == 0) goto Lac
            java.lang.String r9 = "Server-sent frames must not be masked."
            goto Lae
        Lac:
            java.lang.String r9 = "Client-sent frames must be masked."
        Lae:
            r6.<init>(r9)
            throw r6
        Lb2:
            r6 = r4 & 127(0x7f, float:1.78E-43)
            long r9 = (long) r6
            r13.frameLength = r9
            long r9 = r13.frameLength
            r11 = 126(0x7e, double:6.23E-322)
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 != 0) goto Ld0
            okio.BufferedSource r6 = r13.source
            short r6 = r6.readShort()
            r9 = 65535(0xffff, float:9.1834E-41)
            int r6 = okhttp3.internal.Util.and(r6, r9)
            long r9 = (long) r6
            r13.frameLength = r9
            goto L10e
        Ld0:
            long r9 = r13.frameLength
            r11 = 127(0x7f, double:6.27E-322)
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 != 0) goto L10e
            okio.BufferedSource r6 = r13.source
            long r9 = r6.readLong()
            r13.frameLength = r9
            long r9 = r13.frameLength
            r11 = 0
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 < 0) goto Le9
            goto L10e
        Le9:
            java.net.ProtocolException r6 = new java.net.ProtocolException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Frame length 0x"
            java.lang.StringBuilder r9 = r9.append(r10)
            long r10 = r13.frameLength
            java.lang.String r10 = okhttp3.internal.Util.toHexString(r10)
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r10 = " > 0x7FFFFFFFFFFFFFFF"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            r6.<init>(r9)
            throw r6
        L10e:
            boolean r6 = r13.isControlFrame
            if (r6 == 0) goto L123
            long r9 = r13.frameLength
            r11 = 125(0x7d, double:6.2E-322)
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 > 0) goto L11b
            goto L123
        L11b:
            java.net.ProtocolException r6 = new java.net.ProtocolException
            java.lang.String r9 = "Control frame must be less than 125B."
            r6.<init>(r9)
            throw r6
        L123:
            if (r5 == 0) goto L12f
            okio.BufferedSource r6 = r13.source
            byte[] r9 = r13.maskKey
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            r6.readFully(r9)
        L12f:
            return
        L130:
            java.net.ProtocolException r4 = new java.net.ProtocolException
            java.lang.String r5 = "Unexpected rsv3 flag"
            r4.<init>(r5)
            throw r4
        L138:
            java.net.ProtocolException r4 = new java.net.ProtocolException
            java.lang.String r5 = "Unexpected rsv2 flag"
            r4.<init>(r5)
            throw r4
        L140:
            java.net.ProtocolException r4 = new java.net.ProtocolException
            r4.<init>(r8)
            throw r4
        L146:
            r3 = move-exception
            okio.BufferedSource r4 = r13.source
            okio.Timeout r4 = r4.timeout()
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            r4.timeout(r1, r5)
            throw r3
        L153:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
    }

    private final void readMessage() throws java.io.IOException {
            r5 = this;
        L1:
            boolean r0 = r5.closed
            if (r0 != 0) goto L70
            long r0 = r5.frameLength
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L44
            okio.BufferedSource r0 = r5.source
            okio.Buffer r1 = r5.messageFrameBuffer
            long r2 = r5.frameLength
            r0.readFully(r1, r2)
            boolean r0 = r5.isClient
            if (r0 != 0) goto L44
            okio.Buffer r0 = r5.messageFrameBuffer
            okio.Buffer$UnsafeCursor r1 = r5.maskCursor
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r0.readAndWriteUnsafe(r1)
            okio.Buffer$UnsafeCursor r0 = r5.maskCursor
            okio.Buffer r1 = r5.messageFrameBuffer
            long r1 = r1.size()
            long r3 = r5.frameLength
            long r1 = r1 - r3
            r0.seek(r1)
            okhttp3.internal.ws.WebSocketProtocol r0 = okhttp3.internal.p004ws.WebSocketProtocol.INSTANCE
            okio.Buffer$UnsafeCursor r1 = r5.maskCursor
            byte[] r2 = r5.maskKey
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r0.toggleMask(r1, r2)
            okio.Buffer$UnsafeCursor r0 = r5.maskCursor
            r0.close()
        L44:
            boolean r0 = r5.isFinalFrame
            if (r0 != 0) goto L6f
            r5.readUntilNonControlFrame()
            int r0 = r5.opcode
            if (r0 != 0) goto L50
            goto L1
        L50:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected continuation opcode. Got: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r5.opcode
            java.lang.String r2 = okhttp3.internal.Util.toHexString(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L6f:
            return
        L70:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
    }

    private final void readMessageFrame() throws java.io.IOException {
            r5 = this;
            int r0 = r5.opcode
            r1 = 1
            if (r0 == r1) goto L26
            r2 = 2
            if (r0 != r2) goto L9
            goto L26
        L9:
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown opcode: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = okhttp3.internal.Util.toHexString(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L26:
            r5.readMessage()
            boolean r2 = r5.readingCompressedMessage
            if (r2 == 0) goto L42
            okhttp3.internal.ws.MessageInflater r2 = r5.messageInflater
            if (r2 != 0) goto L3c
            okhttp3.internal.ws.MessageInflater r2 = new okhttp3.internal.ws.MessageInflater
            boolean r3 = r5.noContextTakeover
            r2.<init>(r3)
            r3 = r2
            r4 = 0
            r5.messageInflater = r3
        L3c:
            okio.Buffer r3 = r5.messageFrameBuffer
            r2.inflate(r3)
        L42:
            if (r0 != r1) goto L50
            okhttp3.internal.ws.WebSocketReader$FrameCallback r1 = r5.frameCallback
            okio.Buffer r2 = r5.messageFrameBuffer
            java.lang.String r2 = r2.readUtf8()
            r1.onReadMessage(r2)
            goto L5b
        L50:
            okhttp3.internal.ws.WebSocketReader$FrameCallback r1 = r5.frameCallback
            okio.Buffer r2 = r5.messageFrameBuffer
            okio.ByteString r2 = r2.readByteString()
            r1.onReadMessage(r2)
        L5b:
            return
    }

    private final void readUntilNonControlFrame() throws java.io.IOException {
            r1 = this;
        L1:
            boolean r0 = r1.closed
            if (r0 != 0) goto L11
            r1.readHeader()
            boolean r0 = r1.isControlFrame
            if (r0 != 0) goto Ld
            goto L11
        Ld:
            r1.readControlFrame()
            goto L1
        L11:
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
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

    public final void processNextFrame() throws java.io.IOException {
            r1 = this;
            r1.readHeader()
            boolean r0 = r1.isControlFrame
            if (r0 == 0) goto Lb
            r1.readControlFrame()
            goto Le
        Lb:
            r1.readMessageFrame()
        Le:
            return
    }
}

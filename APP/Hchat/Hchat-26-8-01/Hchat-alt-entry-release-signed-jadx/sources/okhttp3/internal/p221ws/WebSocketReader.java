package okhttp3.internal.p221ws;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Settings;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WebSocketReader implements Closeable {
    private boolean closed;
    private final Buffer controlFrameBuffer;
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final Buffer.UnsafeCursor maskCursor;
    private final byte[] maskKey;
    private final Buffer messageFrameBuffer;
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final BufferedSource source;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface FrameCallback {
        void onReadClose(int i9, String str);

        void onReadMessage(String str);

        void onReadMessage(ByteString byteString);

        void onReadPing(ByteString byteString);

        void onReadPong(ByteString byteString);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WebSocketReader(boolean z9, BufferedSource bufferedSource, FrameCallback frameCallback, boolean z10, boolean z11) {
        bufferedSource.getClass();
        frameCallback.getClass();
        this.isClient = z9;
        this.source = bufferedSource;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z10;
        this.noContextTakeover = z11;
        this.controlFrameBuffer = new Buffer();
        this.messageFrameBuffer = new Buffer();
        this.maskKey = z9 ? null : new byte[4];
        this.maskCursor = z9 ? null : new Buffer.UnsafeCursor();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void readControlFrame() throws ProtocolException, EOFException {
        short s10;
        String utf8;
        long j3 = this.frameLength;
        if (j3 > 0) {
            this.source.readFully(this.controlFrameBuffer, j3);
            if (!this.isClient) {
                Buffer buffer = this.controlFrameBuffer;
                Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
                unsafeCursor.getClass();
                buffer.readAndWriteUnsafe(unsafeCursor);
                this.maskCursor.seek(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                Buffer.UnsafeCursor unsafeCursor2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                bArr.getClass();
                webSocketProtocol.toggleMask(unsafeCursor2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                long size = this.controlFrameBuffer.size();
                if (size == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (size != 0) {
                    s10 = this.controlFrameBuffer.readShort();
                    utf8 = this.controlFrameBuffer.readUtf8();
                    String strCloseCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s10);
                    if (strCloseCodeExceptionMessage != null) {
                        throw new ProtocolException(strCloseCodeExceptionMessage);
                    }
                } else {
                    s10 = 1005;
                    utf8 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                this.frameCallback.onReadClose(s10, utf8);
                this.closed = true;
                return;
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.readByteString());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.readByteString());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Util.toHexString(this.opcode));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void readHeader() throws IOException {
        boolean z9;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.closed) {
            C2104o.m5299y("closed");
            return;
        }
        long jTimeoutNanos = this.source.timeout().timeoutNanos();
        this.source.timeout().clearTimeout();
        try {
            int iAnd = Util.and(this.source.readByte(), 255);
            this.source.timeout().timeout(jTimeoutNanos, timeUnit);
            int i9 = iAnd & 15;
            this.opcode = i9;
            boolean z10 = (iAnd & 128) != 0;
            this.isFinalFrame = z10;
            boolean z11 = (iAnd & 8) != 0;
            this.isControlFrame = z11;
            if (z11 && !z10) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z12 = (iAnd & 64) != 0;
            if (i9 == 1 || i9 == 2) {
                if (!z12) {
                    z9 = false;
                } else {
                    if (!this.perMessageDeflate) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z9 = true;
                }
                this.readingCompressedMessage = z9;
            } else if (z12) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iAnd & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iAnd & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iAnd2 = Util.and(this.source.readByte(), 255);
            boolean z13 = (iAnd2 & 128) != 0;
            if (z13 == this.isClient) {
                throw new ProtocolException(this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j3 = iAnd2 & 127;
            this.frameLength = j3;
            if (j3 == 126) {
                this.frameLength = Util.and(this.source.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            } else if (j3 == 127) {
                long j4 = this.source.readLong();
                this.frameLength = j4;
                if (j4 < 0) {
                    throw new ProtocolException("Frame length 0x" + Util.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.isControlFrame && this.frameLength > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z13) {
                BufferedSource bufferedSource = this.source;
                byte[] bArr = this.maskKey;
                bArr.getClass();
                bufferedSource.readFully(bArr);
            }
        } catch (Throwable th2) {
            this.source.timeout().timeout(jTimeoutNanos, timeUnit);
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void readMessage() throws IOException {
        while (!this.closed) {
            long j3 = this.frameLength;
            if (j3 > 0) {
                this.source.readFully(this.messageFrameBuffer, j3);
                if (!this.isClient) {
                    Buffer buffer = this.messageFrameBuffer;
                    Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
                    unsafeCursor.getClass();
                    buffer.readAndWriteUnsafe(unsafeCursor);
                    this.maskCursor.seek(this.messageFrameBuffer.size() - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    Buffer.UnsafeCursor unsafeCursor2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    bArr.getClass();
                    webSocketProtocol.toggleMask(unsafeCursor2, bArr);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Util.toHexString(this.opcode));
            }
        }
        C2104o.m5299y("closed");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void readMessageFrame() throws IOException {
        int i9 = this.opcode;
        if (i9 != 1 && i9 != 2) {
            throw new ProtocolException("Unknown opcode: " + Util.toHexString(i9));
        }
        readMessage();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater = this.messageInflater;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.inflate(this.messageFrameBuffer);
        }
        FrameCallback frameCallback = this.frameCallback;
        if (i9 == 1) {
            frameCallback.onReadMessage(this.messageFrameBuffer.readUtf8());
        } else {
            frameCallback.onReadMessage(this.messageFrameBuffer.readByteString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (!this.isControlFrame) {
                return;
            } else {
                readControlFrame();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageInflater messageInflater = this.messageInflater;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final BufferedSource getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void processNextFrame() {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}

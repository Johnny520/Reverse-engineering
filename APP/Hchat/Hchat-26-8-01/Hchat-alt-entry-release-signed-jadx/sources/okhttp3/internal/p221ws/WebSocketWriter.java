package okhttp3.internal.p221ws;

import bsh.org.objectweb.asm.Opcodes;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final Buffer.UnsafeCursor maskCursor;
    private final byte[] maskKey;
    private final Buffer messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final BufferedSink sink;
    private final Buffer sinkBuffer;
    private boolean writerClosed;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WebSocketWriter(boolean z9, BufferedSink bufferedSink, Random random, boolean z10, boolean z11, long j3) {
        bufferedSink.getClass();
        random.getClass();
        this.isClient = z9;
        this.sink = bufferedSink;
        this.random = random;
        this.perMessageDeflate = z10;
        this.noContextTakeover = z11;
        this.minimumDeflateSize = j3;
        this.messageBuffer = new Buffer();
        this.sinkBuffer = bufferedSink.getBuffer();
        this.maskKey = z9 ? new byte[4] : null;
        this.maskCursor = z9 ? new Buffer.UnsafeCursor() : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void writeControlFrame(int i9, ByteString byteString) throws IOException {
        if (this.writerClosed) {
            C2104o.m5299y("closed");
            return;
        }
        int size = byteString.size();
        if (size > 125) {
            C2104o.m5294t("Payload size must be less than or equal to 125");
            return;
        }
        this.sinkBuffer.writeByte(i9 | 128);
        boolean z9 = this.isClient;
        Buffer buffer = this.sinkBuffer;
        if (z9) {
            buffer.writeByte(size | 128);
            Random random = this.random;
            byte[] bArr = this.maskKey;
            bArr.getClass();
            random.nextBytes(bArr);
            this.sinkBuffer.write(this.maskKey);
            if (size > 0) {
                long size2 = this.sinkBuffer.size();
                this.sinkBuffer.write(byteString);
                Buffer buffer2 = this.sinkBuffer;
                Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
                unsafeCursor.getClass();
                buffer2.readAndWriteUnsafe(unsafeCursor);
                this.maskCursor.seek(size2);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            buffer.writeByte(size);
            this.sinkBuffer.write(byteString);
        }
        this.sink.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Random getRandom() {
        return this.random;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final BufferedSink getSink() {
        return this.sink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeClose(int i9, ByteString byteString) {
        ByteString byteString2 = ByteString.EMPTY;
        if (i9 != 0 || byteString != null) {
            if (i9 != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i9);
            }
            Buffer buffer = new Buffer();
            buffer.writeShort(i9);
            if (byteString != null) {
                buffer.write(byteString);
            }
            byteString2 = buffer.readByteString();
        }
        try {
            writeControlFrame(8, byteString2);
        } finally {
            this.writerClosed = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeMessageFrame(int i9, ByteString byteString) throws IOException {
        byteString.getClass();
        if (this.writerClosed) {
            C2104o.m5299y("closed");
            return;
        }
        this.messageBuffer.write(byteString);
        int i10 = i9 | 128;
        if (this.perMessageDeflate && byteString.size() >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.deflate(this.messageBuffer);
            i10 = i9 | Opcodes.CHECKCAST;
        }
        long size = this.messageBuffer.size();
        this.sinkBuffer.writeByte(i10);
        int i11 = this.isClient ? 128 : 0;
        if (size <= 125) {
            this.sinkBuffer.writeByte(i11 | ((int) size));
        } else {
            Buffer buffer = this.sinkBuffer;
            if (size <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                buffer.writeByte(i11 | 126);
                this.sinkBuffer.writeShort((int) size);
            } else {
                buffer.writeByte(i11 | 127);
                this.sinkBuffer.writeLong(size);
            }
        }
        if (this.isClient) {
            Random random = this.random;
            byte[] bArr = this.maskKey;
            bArr.getClass();
            random.nextBytes(bArr);
            this.sinkBuffer.write(this.maskKey);
            if (size > 0) {
                Buffer buffer2 = this.messageBuffer;
                Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
                unsafeCursor.getClass();
                buffer2.readAndWriteUnsafe(unsafeCursor);
                this.maskCursor.seek(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, size);
        this.sink.emit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writePing(ByteString byteString) {
        byteString.getClass();
        writeControlFrame(9, byteString);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writePong(ByteString byteString) throws IOException {
        byteString.getClass();
        writeControlFrame(10, byteString);
    }
}

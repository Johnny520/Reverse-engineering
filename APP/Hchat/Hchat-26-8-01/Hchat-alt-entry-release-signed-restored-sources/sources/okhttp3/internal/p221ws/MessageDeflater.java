package okhttp3.internal.p221ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import okio.Buffer;
import okio.ByteString;
import okio.DeflaterSink;
import okio.Sink;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class MessageDeflater implements Closeable {
    private final Buffer deflatedBytes;
    private final Deflater deflater;
    private final DeflaterSink deflaterSink;
    private final boolean noContextTakeover;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MessageDeflater(boolean z9) {
        this.noContextTakeover = z9;
        Buffer buffer = new Buffer();
        this.deflatedBytes = buffer;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new DeflaterSink((Sink) buffer, deflater);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean endsWith(Buffer buffer, ByteString byteString) {
        return buffer.rangeEquals(buffer.size() - ((long) byteString.size()), byteString);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.deflaterSink.close();
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void deflate(Buffer buffer) throws IOException {
        buffer.getClass();
        if (this.deflatedBytes.size() != 0) {
            C2104o.m5294t("Failed requirement.");
            return;
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(buffer, buffer.size());
        this.deflaterSink.flush();
        boolean zEndsWith = endsWith(this.deflatedBytes, MessageDeflaterKt.EMPTY_DEFLATE_BLOCK);
        Buffer buffer2 = this.deflatedBytes;
        if (zEndsWith) {
            long size = buffer2.size() - ((long) 4);
            Buffer.UnsafeCursor andWriteUnsafe$default = Buffer.readAndWriteUnsafe$default(this.deflatedBytes, null, 1, null);
            try {
                andWriteUnsafe$default.resizeBuffer(size);
                andWriteUnsafe$default.close();
            } finally {
            }
        } else {
            buffer2.writeByte(0);
        }
        Buffer buffer3 = this.deflatedBytes;
        buffer.write(buffer3, buffer3.size());
    }
}

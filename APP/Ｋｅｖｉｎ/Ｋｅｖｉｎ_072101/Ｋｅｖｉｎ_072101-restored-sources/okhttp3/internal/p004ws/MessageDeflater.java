package okhttp3.internal.p004ws;

/* JADX INFO: compiled from: MessageDeflater.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006J\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m115d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "noContextTakeover", "", "(Z)V", "deflatedBytes", "Lokio/Buffer;", "deflater", "Ljava/util/zip/Deflater;", "deflaterSink", "Lokio/DeflaterSink;", "close", "", "deflate", "buffer", "endsWith", "suffix", "Lokio/ByteString;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class MessageDeflater implements java.io.Closeable {
    private final okio.Buffer deflatedBytes;
    private final java.util.zip.Deflater deflater;
    private final okio.DeflaterSink deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean r4) {
            r3 = this;
            r3.<init>()
            r3.noContextTakeover = r4
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r3.deflatedBytes = r0
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            r1 = -1
            r2 = 1
            r0.<init>(r1, r2)
            r3.deflater = r0
            okio.DeflaterSink r0 = new okio.DeflaterSink
            okio.Buffer r1 = r3.deflatedBytes
            okio.Sink r1 = (okio.Sink) r1
            java.util.zip.Deflater r2 = r3.deflater
            r0.<init>(r1, r2)
            r3.deflaterSink = r0
            return
    }

    private final boolean endsWith(okio.Buffer r5, okio.ByteString r6) {
            r4 = this;
            long r0 = r5.size()
            int r2 = r6.size()
            long r2 = (long) r2
            long r0 = r0 - r2
            boolean r0 = r5.rangeEquals(r0, r6)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okio.DeflaterSink r0 = r1.deflaterSink
            r0.close()
            return
    }

    public final void deflate(okio.Buffer r7) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            okio.Buffer r0 = r6.deflatedBytes
            long r0 = r0.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L15
            r0 = r1
            goto L16
        L15:
            r0 = r2
        L16:
            if (r0 == 0) goto L70
            boolean r0 = r6.noContextTakeover
            if (r0 == 0) goto L21
            java.util.zip.Deflater r0 = r6.deflater
            r0.reset()
        L21:
            okio.DeflaterSink r0 = r6.deflaterSink
            long r3 = r7.size()
            r0.write(r7, r3)
            okio.DeflaterSink r0 = r6.deflaterSink
            r0.flush()
            okio.Buffer r0 = r6.deflatedBytes
            okio.ByteString r3 = okhttp3.internal.p004ws.MessageDeflaterKt.access$getEMPTY_DEFLATE_BLOCK$p()
            boolean r0 = r6.endsWith(r0, r3)
            if (r0 == 0) goto L5f
            okio.Buffer r0 = r6.deflatedBytes
            long r2 = r0.size()
            r0 = 4
            long r4 = (long) r0
            long r2 = r2 - r4
            okio.Buffer r0 = r6.deflatedBytes
            r4 = 0
            okio.Buffer$UnsafeCursor r0 = okio.Buffer.readAndWriteUnsafe$default(r0, r4, r1, r4)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            okio.Buffer$UnsafeCursor r1 = (okio.Buffer.UnsafeCursor) r1     // Catch: java.lang.Throwable -> L58
            r5 = 0
            r1.resizeBuffer(r2)     // Catch: java.lang.Throwable -> L58
            kotlin.p001io.CloseableKt.closeFinally(r0, r4)
            goto L64
        L58:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L5a
        L5a:
            r4 = move-exception
            kotlin.p001io.CloseableKt.closeFinally(r0, r1)
            throw r4
        L5f:
            okio.Buffer r0 = r6.deflatedBytes
            r0.writeByte(r2)
        L64:
            okio.Buffer r0 = r6.deflatedBytes
            okio.Buffer r1 = r6.deflatedBytes
            long r1 = r1.size()
            r7.write(r0, r1)
            return
        L70:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}

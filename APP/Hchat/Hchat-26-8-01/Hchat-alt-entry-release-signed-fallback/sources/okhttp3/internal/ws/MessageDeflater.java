package okhttp3.internal.ws;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class MessageDeflater implements java.io.Closeable {
    private final okio.Buffer deflatedBytes;
    private final java.util.zip.Deflater deflater;
    private final okio.DeflaterSink deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean r4) {
            r3 = this;
            r3.<init>()
            r3.noContextTakeover = r4
            okio.Buffer r4 = new okio.Buffer
            r4.<init>()
            r3.deflatedBytes = r4
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            r1 = -1
            r2 = 1
            r0.<init>(r1, r2)
            r3.deflater = r0
            okio.DeflaterSink r1 = new okio.DeflaterSink
            r1.<init>(r4, r0)
            r3.deflaterSink = r1
            return
    }

    private final boolean endsWith(okio.Buffer r5, okio.ByteString r6) {
            r4 = this;
            long r0 = r5.size()
            int r2 = r6.size()
            long r2 = (long) r2
            long r0 = r0 - r2
            boolean r5 = r5.rangeEquals(r0, r6)
            return r5
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            okio.DeflaterSink r0 = r1.deflaterSink
            r0.close()
            return
    }

    public final void deflate(okio.Buffer r6) {
            r5 = this;
            r6.getClass()
            okio.Buffer r0 = r5.deflatedBytes
            long r0 = r0.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L5f
            boolean r0 = r5.noContextTakeover
            if (r0 == 0) goto L18
            java.util.zip.Deflater r0 = r5.deflater
            r0.reset()
        L18:
            okio.DeflaterSink r0 = r5.deflaterSink
            long r1 = r6.size()
            r0.write(r6, r1)
            okio.DeflaterSink r0 = r5.deflaterSink
            r0.flush()
            okio.Buffer r0 = r5.deflatedBytes
            okio.ByteString r1 = okhttp3.internal.ws.MessageDeflaterKt.access$getEMPTY_DEFLATE_BLOCK$p()
            boolean r0 = r5.endsWith(r0, r1)
            okio.Buffer r1 = r5.deflatedBytes
            if (r0 == 0) goto L51
            long r0 = r1.size()
            r2 = 4
            long r2 = (long) r2
            long r0 = r0 - r2
            okio.Buffer r2 = r5.deflatedBytes
            r3 = 1
            r4 = 0
            okio.Buffer$UnsafeCursor r2 = okio.Buffer.readAndWriteUnsafe$default(r2, r4, r3, r4)
            r2.resizeBuffer(r0)     // Catch: java.lang.Throwable -> L4a
            r2.close()
            goto L55
        L4a:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L4c
        L4c:
            r0 = move-exception
            ig.a.i(r2, r6)
            throw r0
        L51:
            r0 = 0
            r1.writeByte(r0)
        L55:
            okio.Buffer r0 = r5.deflatedBytes
            long r1 = r0.size()
            r6.write(r0, r1)
            return
        L5f:
            java.lang.String r6 = "Failed requirement."
            j8.o.t(r6)
            return
    }
}

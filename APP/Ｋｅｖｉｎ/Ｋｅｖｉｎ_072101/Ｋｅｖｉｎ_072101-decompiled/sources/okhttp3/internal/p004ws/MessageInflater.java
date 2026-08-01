package okhttp3.internal.p004ws;

/* JADX INFO: compiled from: MessageInflater.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m115d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "noContextTakeover", "", "(Z)V", "deflatedBytes", "Lokio/Buffer;", "inflater", "Ljava/util/zip/Inflater;", "inflaterSource", "Lokio/InflaterSource;", "close", "", "inflate", "buffer", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class MessageInflater implements java.io.Closeable {
    private final okio.Buffer deflatedBytes;
    private final java.util.zip.Inflater inflater;
    private final okio.InflaterSource inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean r4) {
            r3 = this;
            r3.<init>()
            r3.noContextTakeover = r4
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r3.deflatedBytes = r0
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r1 = 1
            r0.<init>(r1)
            r3.inflater = r0
            okio.InflaterSource r0 = new okio.InflaterSource
            okio.Buffer r1 = r3.deflatedBytes
            okio.Source r1 = (okio.Source) r1
            java.util.zip.Inflater r2 = r3.inflater
            r0.<init>(r1, r2)
            r3.inflaterSource = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okio.InflaterSource r0 = r1.inflaterSource
            r0.close()
            return
    }

    public final void inflate(okio.Buffer r6) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            okio.Buffer r0 = r5.deflatedBytes
            long r0 = r0.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto L51
            boolean r0 = r5.noContextTakeover
            if (r0 == 0) goto L1f
            java.util.zip.Inflater r0 = r5.inflater
            r0.reset()
        L1f:
            okio.Buffer r0 = r5.deflatedBytes
            r1 = r6
            okio.Source r1 = (okio.Source) r1
            r0.writeAll(r1)
            okio.Buffer r0 = r5.deflatedBytes
            r1 = 65535(0xffff, float:9.1834E-41)
            r0.writeInt(r1)
            java.util.zip.Inflater r0 = r5.inflater
            long r0 = r0.getBytesRead()
            okio.Buffer r2 = r5.deflatedBytes
            long r2 = r2.size()
            long r0 = r0 + r2
        L3c:
            okio.InflaterSource r2 = r5.inflaterSource
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.readOrInflate(r6, r3)
            java.util.zip.Inflater r2 = r5.inflater
            long r2 = r2.getBytesRead()
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 < 0) goto L3c
            return
        L51:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}

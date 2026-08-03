package okhttp3.internal.ws;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class MessageInflater implements java.io.Closeable {
    private final okio.Buffer deflatedBytes;
    private final java.util.zip.Inflater inflater;
    private final okio.InflaterSource inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean r3) {
            r2 = this;
            r2.<init>()
            r2.noContextTakeover = r3
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            r2.deflatedBytes = r3
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r1 = 1
            r0.<init>(r1)
            r2.inflater = r0
            okio.InflaterSource r1 = new okio.InflaterSource
            r1.<init>(r3, r0)
            r2.inflaterSource = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            okio.InflaterSource r0 = r1.inflaterSource
            r0.close()
            return
    }

    public final void inflate(okio.Buffer r7) {
            r6 = this;
            r7.getClass()
            okio.Buffer r0 = r6.deflatedBytes
            long r0 = r0.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L47
            boolean r0 = r6.noContextTakeover
            if (r0 == 0) goto L18
            java.util.zip.Inflater r0 = r6.inflater
            r0.reset()
        L18:
            okio.Buffer r0 = r6.deflatedBytes
            r0.writeAll(r7)
            okio.Buffer r0 = r6.deflatedBytes
            r1 = 65535(0xffff, float:9.1834E-41)
            r0.writeInt(r1)
            java.util.zip.Inflater r0 = r6.inflater
            long r0 = r0.getBytesRead()
            okio.Buffer r2 = r6.deflatedBytes
            long r2 = r2.size()
            long r2 = r2 + r0
        L32:
            okio.InflaterSource r0 = r6.inflaterSource
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0.readOrInflate(r7, r4)
            java.util.zip.Inflater r0 = r6.inflater
            long r0 = r0.getBytesRead()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L32
            return
        L47:
            java.lang.String r7 = "Failed requirement."
            j8.o.t(r7)
            return
    }
}

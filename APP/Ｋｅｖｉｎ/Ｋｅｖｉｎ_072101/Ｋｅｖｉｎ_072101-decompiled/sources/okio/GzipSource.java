package okio;

/* JADX INFO: compiled from: GzipSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m115d2 = {"Lokio/GzipSource;", "Lokio/Source;", "source", "(Lokio/Source;)V", "crc", "Ljava/util/zip/CRC32;", "inflater", "Ljava/util/zip/Inflater;", "inflaterSource", "Lokio/InflaterSource;", "section", "", "Lokio/RealBufferedSource;", "checkEqual", "", "name", "", "expected", "", "actual", "close", "consumeHeader", "consumeTrailer", "read", "", "sink", "Lokio/Buffer;", "byteCount", "timeout", "Lokio/Timeout;", "updateCrc", "buffer", "offset", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class GzipSource implements okio.Source {
    private final java.util.zip.CRC32 crc;
    private final java.util.zip.Inflater inflater;
    private final okio.InflaterSource inflaterSource;
    private byte section;
    private final okio.RealBufferedSource source;

    public GzipSource(okio.Source r4) {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r3.<init>()
            okio.RealBufferedSource r0 = new okio.RealBufferedSource
            r0.<init>(r4)
            r3.source = r0
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r1 = 1
            r0.<init>(r1)
            r3.inflater = r0
            okio.InflaterSource r0 = new okio.InflaterSource
            okio.RealBufferedSource r1 = r3.source
            okio.BufferedSource r1 = (okio.BufferedSource) r1
            java.util.zip.Inflater r2 = r3.inflater
            r0.<init>(r1, r2)
            r3.inflaterSource = r0
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r3.crc = r0
            return
    }

    private final void checkEqual(java.lang.String r4, int r5, int r6) {
            r3 = this;
            if (r6 != r5) goto L3
            return
        L3:
            java.io.IOException r0 = new java.io.IOException
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r1, r2}
            r2 = 3
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "%s: actual 0x%08x != expected 0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.String r2 = "format(this, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    private final void consumeHeader() throws java.io.IOException {
            r18 = this;
            r6 = r18
            okio.RealBufferedSource r0 = r6.source
            r1 = 10
            r0.require(r1)
            okio.RealBufferedSource r0 = r6.source
            r1 = 0
            okio.Buffer r0 = r0.bufferField
            r1 = 3
            byte r7 = r0.getByte(r1)
            r0 = 1
            r1 = r7
            r2 = 0
            int r3 = r1 >> r0
            r8 = 1
            r3 = r3 & r8
            r9 = 0
            if (r3 != r8) goto L20
            r0 = r8
            goto L21
        L20:
            r0 = r9
        L21:
            r10 = r0
            if (r10 == 0) goto L32
            okio.RealBufferedSource r0 = r6.source
            r1 = 0
            okio.Buffer r1 = r0.bufferField
            r2 = 0
            r4 = 10
            r0 = r18
            r0.updateCrc(r1, r2, r4)
        L32:
            okio.RealBufferedSource r0 = r6.source
            short r11 = r0.readShort()
            java.lang.String r0 = "ID1ID2"
            r1 = 8075(0x1f8b, float:1.1315E-41)
            r6.checkEqual(r0, r1, r11)
            okio.RealBufferedSource r0 = r6.source
            r1 = 8
            r0.skip(r1)
            r0 = 2
            r1 = r7
            r2 = 0
            int r3 = r1 >> r0
            r3 = r3 & r8
            if (r3 != r8) goto L50
            r0 = r8
            goto L51
        L50:
            r0 = r9
        L51:
            if (r0 == 0) goto L91
            okio.RealBufferedSource r0 = r6.source
            r1 = 2
            r0.require(r1)
            if (r10 == 0) goto L6a
            okio.RealBufferedSource r0 = r6.source
            r1 = 0
            okio.Buffer r1 = r0.bufferField
            r2 = 0
            r4 = 2
            r0 = r18
            r0.updateCrc(r1, r2, r4)
        L6a:
            okio.RealBufferedSource r0 = r6.source
            r1 = 0
            okio.Buffer r0 = r0.bufferField
            short r0 = r0.readShortLe()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            long r12 = (long) r0
            okio.RealBufferedSource r0 = r6.source
            r0.require(r12)
            if (r10 == 0) goto L8c
            okio.RealBufferedSource r0 = r6.source
            r1 = 0
            okio.Buffer r1 = r0.bufferField
            r2 = 0
            r0 = r18
            r4 = r12
            r0.updateCrc(r1, r2, r4)
        L8c:
            okio.RealBufferedSource r0 = r6.source
            r0.skip(r12)
        L91:
            r0 = 3
            r1 = r7
            r2 = 0
            int r3 = r1 >> r0
            r3 = r3 & r8
            if (r3 != r8) goto L9b
            r0 = r8
            goto L9c
        L9b:
            r0 = r9
        L9c:
            r12 = -1
            r14 = 1
            if (r0 == 0) goto Lca
            okio.RealBufferedSource r0 = r6.source
            long r16 = r0.indexOf(r9)
            int r0 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r0 == 0) goto Lc4
            if (r10 == 0) goto Lbc
            okio.RealBufferedSource r0 = r6.source
            r1 = 0
            okio.Buffer r1 = r0.bufferField
            r2 = 0
            long r4 = r16 + r14
            r0 = r18
            r0.updateCrc(r1, r2, r4)
        Lbc:
            okio.RealBufferedSource r0 = r6.source
            long r1 = r16 + r14
            r0.skip(r1)
            goto Lca
        Lc4:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        Lca:
            r0 = 4
            r1 = r7
            r2 = 0
            int r3 = r1 >> r0
            r3 = r3 & r8
            if (r3 != r8) goto Ld3
            goto Ld4
        Ld3:
            r8 = r9
        Ld4:
            if (r8 == 0) goto Lfd
            okio.RealBufferedSource r0 = r6.source
            long r8 = r0.indexOf(r9)
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 == 0) goto Lf7
            if (r10 == 0) goto Lf0
            okio.RealBufferedSource r0 = r6.source
            r1 = 0
            okio.Buffer r1 = r0.bufferField
            r2 = 0
            long r4 = r8 + r14
            r0 = r18
            r0.updateCrc(r1, r2, r4)
        Lf0:
            okio.RealBufferedSource r0 = r6.source
            long r14 = r14 + r8
            r0.skip(r14)
            goto Lfd
        Lf7:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        Lfd:
            if (r10 == 0) goto L117
            okio.RealBufferedSource r0 = r6.source
            short r0 = r0.readShortLe()
            java.util.zip.CRC32 r1 = r6.crc
            long r1 = r1.getValue()
            int r1 = (int) r1
            short r1 = (short) r1
            java.lang.String r2 = "FHCRC"
            r6.checkEqual(r2, r0, r1)
            java.util.zip.CRC32 r0 = r6.crc
            r0.reset()
        L117:
            return
    }

    private final void consumeTrailer() throws java.io.IOException {
            r3 = this;
            okio.RealBufferedSource r0 = r3.source
            int r0 = r0.readIntLe()
            java.util.zip.CRC32 r1 = r3.crc
            long r1 = r1.getValue()
            int r1 = (int) r1
            java.lang.String r2 = "CRC"
            r3.checkEqual(r2, r0, r1)
            okio.RealBufferedSource r0 = r3.source
            int r0 = r0.readIntLe()
            java.util.zip.Inflater r1 = r3.inflater
            long r1 = r1.getBytesWritten()
            int r1 = (int) r1
            java.lang.String r2 = "ISIZE"
            r3.checkEqual(r2, r0, r1)
            return
    }

    private final void updateCrc(okio.Buffer r11, long r12, long r14) {
            r10 = this;
            r0 = r12
            r2 = r14
            okio.Segment r4 = r11.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
        L7:
            int r5 = r4.limit
            int r6 = r4.pos
            int r5 = r5 - r6
            long r5 = (long) r5
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 < 0) goto L1f
            int r5 = r4.limit
            int r6 = r4.pos
            int r5 = r5 - r6
            long r5 = (long) r5
            long r0 = r0 - r5
            okio.Segment r5 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r4 = r5
            goto L7
        L1f:
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto L46
            int r5 = r4.pos
            long r5 = (long) r5
            long r5 = r5 + r0
            int r5 = (int) r5
            int r6 = r4.limit
            int r6 = r6 - r5
            r7 = 0
            long r8 = (long) r6
            long r8 = java.lang.Math.min(r8, r2)
            int r6 = (int) r8
            java.util.zip.CRC32 r7 = r10.crc
            byte[] r8 = r4.data
            r7.update(r8, r5, r6)
            long r7 = (long) r6
            long r2 = r2 - r7
            r0 = 0
            okio.Segment r7 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            r4 = r7
            goto L1f
        L46:
            return
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okio.InflaterSource r0 = r1.inflaterSource
            r0.close()
            return
    }

    @Override // okio.Source
    public long read(okio.Buffer r15, long r16) throws java.io.IOException {
            r14 = this;
            r6 = r14
            r7 = r15
            r8 = r16
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r3 = 1
            if (r2 < 0) goto L12
            r2 = r3
            goto L13
        L12:
            r2 = 0
        L13:
            if (r2 == 0) goto L5e
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 != 0) goto L1a
            return r0
        L1a:
            byte r0 = r6.section
            if (r0 != 0) goto L23
            r14.consumeHeader()
            r6.section = r3
        L23:
            byte r0 = r6.section
            r1 = -1
            r4 = 2
            if (r0 != r3) goto L42
            long r10 = r15.size()
            okio.InflaterSource r0 = r6.inflaterSource
            long r12 = r0.read(r15, r8)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 == 0) goto L40
            r0 = r14
            r1 = r15
            r2 = r10
            r4 = r12
            r0.updateCrc(r1, r2, r4)
            return r12
        L40:
            r6.section = r4
        L42:
            byte r0 = r6.section
            if (r0 != r4) goto L5d
            r14.consumeTrailer()
            r0 = 3
            r6.section = r0
            okio.RealBufferedSource r0 = r6.source
            boolean r0 = r0.exhausted()
            if (r0 == 0) goto L55
            goto L5d
        L55:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "gzip finished without exhausting source"
            r0.<init>(r1)
            throw r0
        L5d:
            return r1
        L5e:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "byteCount < 0: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
            r1 = this;
            okio.RealBufferedSource r0 = r1.source
            okio.Timeout r0 = r0.timeout()
            return r0
    }
}

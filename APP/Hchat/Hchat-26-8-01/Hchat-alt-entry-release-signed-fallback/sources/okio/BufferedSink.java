package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface BufferedSink extends okio.Sink, java.nio.channels.WritableByteChannel {
    @sf.a
    okio.Buffer buffer();

    okio.BufferedSink emit();

    okio.BufferedSink emitCompleteSegments();

    @Override // okio.Sink, java.io.Flushable
    void flush();

    okio.Buffer getBuffer();

    java.io.OutputStream outputStream();

    okio.BufferedSink write(okio.ByteString r1);

    okio.BufferedSink write(okio.ByteString r1, int r2, int r3);

    okio.BufferedSink write(okio.Source r1, long r2);

    okio.BufferedSink write(byte[] r1);

    okio.BufferedSink write(byte[] r1, int r2, int r3);

    long writeAll(okio.Source r1);

    okio.BufferedSink writeByte(int r1);

    okio.BufferedSink writeDecimalLong(long r1);

    okio.BufferedSink writeHexadecimalUnsignedLong(long r1);

    okio.BufferedSink writeInt(int r1);

    okio.BufferedSink writeIntLe(int r1);

    okio.BufferedSink writeLong(long r1);

    okio.BufferedSink writeLongLe(long r1);

    okio.BufferedSink writeShort(int r1);

    okio.BufferedSink writeShortLe(int r1);

    okio.BufferedSink writeString(java.lang.String r1, int r2, int r3, java.nio.charset.Charset r4);

    okio.BufferedSink writeString(java.lang.String r1, java.nio.charset.Charset r2);

    okio.BufferedSink writeUtf8(java.lang.String r1);

    okio.BufferedSink writeUtf8(java.lang.String r1, int r2, int r3);

    okio.BufferedSink writeUtf8CodePoint(int r1);
}

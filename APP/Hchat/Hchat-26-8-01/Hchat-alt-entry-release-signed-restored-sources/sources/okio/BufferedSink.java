package okio;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import p276sf.InterfaceC3954a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface BufferedSink extends Sink, WritableByteChannel {
    @InterfaceC3954a
    Buffer buffer();

    BufferedSink emit();

    BufferedSink emitCompleteSegments();

    @Override // okio.Sink, java.io.Flushable
    void flush();

    Buffer getBuffer();

    OutputStream outputStream();

    BufferedSink write(ByteString byteString);

    BufferedSink write(ByteString byteString, int i9, int i10);

    BufferedSink write(Source source, long j3);

    BufferedSink write(byte[] bArr);

    BufferedSink write(byte[] bArr, int i9, int i10);

    long writeAll(Source source);

    BufferedSink writeByte(int i9);

    BufferedSink writeDecimalLong(long j3);

    BufferedSink writeHexadecimalUnsignedLong(long j3);

    BufferedSink writeInt(int i9);

    BufferedSink writeIntLe(int i9);

    BufferedSink writeLong(long j3);

    BufferedSink writeLongLe(long j3);

    BufferedSink writeShort(int i9);

    BufferedSink writeShortLe(int i9);

    BufferedSink writeString(String str, int i9, int i10, Charset charset);

    BufferedSink writeString(String str, Charset charset);

    BufferedSink writeUtf8(String str);

    BufferedSink writeUtf8(String str, int i9, int i10);

    BufferedSink writeUtf8CodePoint(int i9);
}

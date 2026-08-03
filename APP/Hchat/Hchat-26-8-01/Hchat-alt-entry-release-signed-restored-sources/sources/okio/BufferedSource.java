package okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import p276sf.InterfaceC3954a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface BufferedSource extends Source, ReadableByteChannel {
    @InterfaceC3954a
    Buffer buffer();

    boolean exhausted();

    Buffer getBuffer();

    long indexOf(byte b10);

    long indexOf(byte b10, long j3);

    long indexOf(byte b10, long j3, long j4);

    long indexOf(ByteString byteString);

    long indexOf(ByteString byteString, long j3);

    long indexOfElement(ByteString byteString);

    long indexOfElement(ByteString byteString, long j3);

    InputStream inputStream();

    BufferedSource peek();

    boolean rangeEquals(long j3, ByteString byteString);

    boolean rangeEquals(long j3, ByteString byteString, int i9, int i10);

    int read(byte[] bArr);

    int read(byte[] bArr, int i9, int i10);

    long readAll(Sink sink);

    byte readByte();

    byte[] readByteArray();

    byte[] readByteArray(long j3);

    ByteString readByteString();

    ByteString readByteString(long j3);

    long readDecimalLong();

    void readFully(Buffer buffer, long j3);

    void readFully(byte[] bArr);

    long readHexadecimalUnsignedLong();

    int readInt();

    int readIntLe();

    long readLong();

    long readLongLe();

    short readShort();

    short readShortLe();

    String readString(long j3, Charset charset);

    String readString(Charset charset);

    String readUtf8();

    String readUtf8(long j3);

    int readUtf8CodePoint();

    String readUtf8Line();

    String readUtf8LineStrict();

    String readUtf8LineStrict(long j3);

    boolean request(long j3);

    void require(long j3);

    int select(Options options);

    void skip(long j3);
}

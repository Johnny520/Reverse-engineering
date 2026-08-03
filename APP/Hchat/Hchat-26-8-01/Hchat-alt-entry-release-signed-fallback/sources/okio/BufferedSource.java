package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface BufferedSource extends okio.Source, java.nio.channels.ReadableByteChannel {
    @sf.a
    okio.Buffer buffer();

    boolean exhausted();

    okio.Buffer getBuffer();

    long indexOf(byte r1);

    long indexOf(byte r1, long r2);

    long indexOf(byte r1, long r2, long r4);

    long indexOf(okio.ByteString r1);

    long indexOf(okio.ByteString r1, long r2);

    long indexOfElement(okio.ByteString r1);

    long indexOfElement(okio.ByteString r1, long r2);

    java.io.InputStream inputStream();

    okio.BufferedSource peek();

    boolean rangeEquals(long r1, okio.ByteString r3);

    boolean rangeEquals(long r1, okio.ByteString r3, int r4, int r5);

    int read(byte[] r1);

    int read(byte[] r1, int r2, int r3);

    long readAll(okio.Sink r1);

    byte readByte();

    byte[] readByteArray();

    byte[] readByteArray(long r1);

    okio.ByteString readByteString();

    okio.ByteString readByteString(long r1);

    long readDecimalLong();

    void readFully(okio.Buffer r1, long r2);

    void readFully(byte[] r1);

    long readHexadecimalUnsignedLong();

    int readInt();

    int readIntLe();

    long readLong();

    long readLongLe();

    short readShort();

    short readShortLe();

    java.lang.String readString(long r1, java.nio.charset.Charset r3);

    java.lang.String readString(java.nio.charset.Charset r1);

    java.lang.String readUtf8();

    java.lang.String readUtf8(long r1);

    int readUtf8CodePoint();

    java.lang.String readUtf8Line();

    java.lang.String readUtf8LineStrict();

    java.lang.String readUtf8LineStrict(long r1);

    boolean request(long r1);

    void require(long r1);

    int select(okio.Options r1);

    void skip(long r1);
}

package Yue;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: Yue.ۥۣۣ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3604 extends InterfaceC7506, ReadableByteChannel {
    @InterfaceC6399
    InterfaceC3604 peek();

    int read(@InterfaceC6399 byte[] bArr) throws IOException;

    int read(@InterfaceC6399 byte[] bArr, int i, int i2) throws IOException;

    byte readByte() throws IOException;

    void readFully(@InterfaceC6399 byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    void skip(long j) throws IOException;

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8970, message = "moved to val: use getBuffer() instead", replaceWith = @InterfaceC7097(expression = "buffer", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    C3600 mo9604();

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    C3600 mo9605();

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    InputStream mo9607();

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    String mo9609(long j) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    C3630 mo9612(long j) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    long mo9616(@InterfaceC6399 C3630 c3630, long j) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    byte[] mo9618() throws IOException;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    boolean mo9622() throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    long mo9623(@InterfaceC6399 C3630 c3630, long j) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    long mo9624(@InterfaceC6399 InterfaceC7472 interfaceC7472) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    long mo9627(byte b, long j) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    boolean mo9629(long j, @InterfaceC6399 C3630 c3630, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    long mo9630(byte b, long j, long j2) throws IOException;

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    String mo9631() throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
    long mo9633() throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ */
    String mo9634(long j) throws IOException;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    long mo9639(@InterfaceC6399 C3630 c3630) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ */
    String mo9642(@InterfaceC6399 Charset charset) throws IOException;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ */
    int mo9643(@InterfaceC6399 C6582 c6582) throws IOException;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ */
    int mo9644() throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟ */
    boolean mo9647(long j, @InterfaceC6399 C3630 c3630) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠ */
    C3630 mo9648() throws IOException;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    boolean mo9651(long j) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    String mo9655() throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۥ */
    int mo9657() throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۣ */
    byte[] mo9661(long j) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ */
    String mo9662() throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ */
    long mo9663(@InterfaceC6399 C3630 c3630) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ */
    void mo9664(@InterfaceC6399 C3600 c3600, long j) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ */
    String mo9665(long j, @InterfaceC6399 Charset charset) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠ */
    short mo9666() throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ */
    long mo9667() throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ */
    void mo9670(long j) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ */
    long mo9673(byte b) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۧ */
    long mo9674() throws IOException;
}

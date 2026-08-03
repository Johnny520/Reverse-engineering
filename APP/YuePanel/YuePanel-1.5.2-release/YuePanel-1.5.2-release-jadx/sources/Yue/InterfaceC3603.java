package Yue;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: Yue.ۥۣۣ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3603 extends InterfaceC7472, WritableByteChannel {
    @Override // Yue.InterfaceC7472, java.io.Flushable
    void flush() throws IOException;

    @InterfaceC6399
    InterfaceC3603 write(@InterfaceC6399 byte[] bArr) throws IOException;

    @InterfaceC6399
    InterfaceC3603 write(@InterfaceC6399 byte[] bArr, int i, int i2) throws IOException;

    @InterfaceC6399
    InterfaceC3603 writeByte(int i) throws IOException;

    @InterfaceC6399
    InterfaceC3603 writeInt(int i) throws IOException;

    @InterfaceC6399
    InterfaceC3603 writeLong(long j) throws IOException;

    @InterfaceC6399
    InterfaceC3603 writeShort(int i) throws IOException;

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8970, message = "moved to val: use getBuffer() instead", replaceWith = @InterfaceC7097(expression = "buffer", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    C3600 mo9604();

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    C3600 mo9605();

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    long mo9610(@InterfaceC6399 InterfaceC7506 interfaceC7506) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    InterfaceC3603 mo9613(@InterfaceC6399 InterfaceC7506 interfaceC7506, long j) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    InterfaceC3603 mo9614() throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    InterfaceC3603 mo9615(int i) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    InterfaceC3603 mo9617(long j) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    InterfaceC3603 mo9621(int i) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    InterfaceC3603 mo9632() throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    InterfaceC3603 mo9636(int i) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    InterfaceC3603 mo9638(@InterfaceC6399 String str) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    InterfaceC3603 mo9640(@InterfaceC6399 C3630 c3630, int i, int i2) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ */
    InterfaceC3603 mo9645(@InterfaceC6399 String str, int i, int i2) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤ */
    InterfaceC3603 mo9646(long j) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ */
    InterfaceC3603 mo9649(@InterfaceC6399 String str, @InterfaceC6399 Charset charset) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۦۣ */
    InterfaceC3603 mo9668(@InterfaceC6399 C3630 c3630) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۦۤ */
    InterfaceC3603 mo9669(@InterfaceC6399 String str, int i, int i2, @InterfaceC6399 Charset charset) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۦۦ */
    InterfaceC3603 mo9671(long j) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ */
    OutputStream mo9672();
}

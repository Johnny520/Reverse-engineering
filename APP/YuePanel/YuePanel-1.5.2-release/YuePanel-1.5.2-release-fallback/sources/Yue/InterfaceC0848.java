package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0848 extends Yue.InterfaceC5794, java.nio.channels.WritableByteChannel {
    @Override // Yue.InterfaceC5794, java.io.Flushable
    void flush() throws java.io.IOException;

    @Yue.InterfaceC4418
    Yue.InterfaceC0848 write(@Yue.InterfaceC4418 byte[] r1) throws java.io.IOException;

    @Yue.InterfaceC4418
    Yue.InterfaceC0848 write(@Yue.InterfaceC4418 byte[] r1, int r2, int r3) throws java.io.IOException;

    @Yue.InterfaceC4418
    Yue.InterfaceC0848 writeByte(int r1) throws java.io.IOException;

    @Yue.InterfaceC4418
    Yue.InterfaceC0848 writeInt(int r1) throws java.io.IOException;

    @Yue.InterfaceC4418
    Yue.InterfaceC0848 writeLong(long r1) throws java.io.IOException;

    @Yue.InterfaceC4418
    Yue.InterfaceC0848 writeShort(int r1) throws java.io.IOException;

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5580, message = "moved to val: use getBuffer() instead", replaceWith = @Yue.InterfaceC5313(expression = "buffer", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    Yue.C0843 mo4809();

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    Yue.C0843 mo4810();

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    long mo4815(@Yue.InterfaceC4418 Yue.InterfaceC5839 r1) throws java.io.IOException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    Yue.InterfaceC0848 mo4818(@Yue.InterfaceC4418 Yue.InterfaceC5839 r1, long r2) throws java.io.IOException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    Yue.InterfaceC0848 mo4819() throws java.io.IOException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    Yue.InterfaceC0848 mo4820(int r1) throws java.io.IOException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    Yue.InterfaceC0848 mo4822(long r1) throws java.io.IOException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    Yue.InterfaceC0848 mo4826(int r1) throws java.io.IOException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    Yue.InterfaceC0848 mo4837() throws java.io.IOException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    Yue.InterfaceC0848 mo4841(int r1) throws java.io.IOException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    Yue.InterfaceC0848 mo4843(@Yue.InterfaceC4418 java.lang.String r1) throws java.io.IOException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    Yue.InterfaceC0848 mo4845(@Yue.InterfaceC4418 Yue.C0879 r1, int r2, int r3) throws java.io.IOException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ */
    Yue.InterfaceC0848 mo4850(@Yue.InterfaceC4418 java.lang.String r1, int r2, int r3) throws java.io.IOException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۤ */
    Yue.InterfaceC0848 mo4851(long r1) throws java.io.IOException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ */
    Yue.InterfaceC0848 mo4854(@Yue.InterfaceC4418 java.lang.String r1, @Yue.InterfaceC4418 java.nio.charset.Charset r2) throws java.io.IOException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۦۣ */
    Yue.InterfaceC0848 mo4873(@Yue.InterfaceC4418 Yue.C0879 r1) throws java.io.IOException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۦۤ */
    Yue.InterfaceC0848 mo4874(@Yue.InterfaceC4418 java.lang.String r1, int r2, int r3, @Yue.InterfaceC4418 java.nio.charset.Charset r4) throws java.io.IOException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۦۦ */
    Yue.InterfaceC0848 mo4876(long r1) throws java.io.IOException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ */
    java.io.OutputStream mo4877();
}

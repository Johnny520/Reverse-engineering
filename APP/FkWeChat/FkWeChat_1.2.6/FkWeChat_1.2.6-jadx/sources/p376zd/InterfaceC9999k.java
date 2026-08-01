package p376zd;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: zd.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC9999k extends InterfaceC10024w0, ReadableByteChannel {
    /* JADX INFO: renamed from: B0 */
    long mo38671B0();

    /* JADX INFO: renamed from: C */
    byte[] mo38672C();

    /* JADX INFO: renamed from: I0 */
    long mo38679I0();

    /* JADX INFO: renamed from: J */
    long mo38680J(C10003m c10003m, long j10, long j11);

    /* JADX INFO: renamed from: K0 */
    InputStream mo38683K0();

    /* JADX INFO: renamed from: O */
    int mo38687O(C9996i0 c9996i0);

    /* JADX INFO: renamed from: S */
    long mo38692S();

    /* JADX INFO: renamed from: U */
    String mo38694U(long j10);

    /* JADX INFO: renamed from: b */
    C9995i mo38699b();

    /* JADX INFO: renamed from: f0 */
    boolean mo38706f0(long j10, C10003m c10003m);

    /* JADX INFO: renamed from: g */
    boolean mo38707g();

    /* JADX INFO: renamed from: h0 */
    int mo38709h0();

    /* JADX INFO: renamed from: i */
    boolean mo38710i(long j10);

    /* JADX INFO: renamed from: l0 */
    C10003m mo38717l0();

    /* JADX INFO: renamed from: o */
    void mo38721o(long j10);

    InterfaceC9999k peek();

    /* JADX INFO: renamed from: r */
    void mo38724r(C9995i c9995i, long j10);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    String readString(Charset charset);

    /* JADX INFO: renamed from: s */
    String mo38726s(long j10);

    void skip(long j10);

    /* JADX INFO: renamed from: t0 */
    String mo38728t0();

    /* JADX INFO: renamed from: u */
    C10003m mo38729u(long j10);

    /* JADX INFO: renamed from: u0 */
    int mo38730u0();

    /* JADX INFO: renamed from: x0 */
    short mo38735x0();
}

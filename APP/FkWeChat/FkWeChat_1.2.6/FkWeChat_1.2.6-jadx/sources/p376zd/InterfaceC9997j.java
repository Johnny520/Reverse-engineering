package p376zd;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: zd.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC9997j extends InterfaceC10020u0, WritableByteChannel {
    /* JADX INFO: renamed from: A0 */
    long mo38670A0(InterfaceC10024w0 interfaceC10024w0);

    /* JADX INFO: renamed from: E */
    InterfaceC9997j mo38674E(int i10);

    /* JADX INFO: renamed from: H0 */
    InterfaceC9997j mo38678H0(long j10);

    /* JADX INFO: renamed from: Q */
    InterfaceC9997j mo38690Q();

    /* JADX INFO: renamed from: a0 */
    InterfaceC9997j mo38698a0(String str);

    /* JADX INFO: renamed from: b */
    C9995i mo38699b();

    @Override // p376zd.InterfaceC10020u0, java.io.Flushable
    void flush();

    /* JADX INFO: renamed from: i0 */
    InterfaceC9997j mo38711i0(String str, int i10, int i11);

    /* JADX INFO: renamed from: k0 */
    InterfaceC9997j mo38715k0(long j10);

    /* JADX INFO: renamed from: w */
    InterfaceC9997j mo38732w(int i10);

    InterfaceC9997j write(byte[] bArr);

    InterfaceC9997j write(byte[] bArr, int i10, int i11);

    InterfaceC9997j writeByte(int i10);

    InterfaceC9997j writeInt(int i10);

    InterfaceC9997j writeShort(int i10);

    /* JADX INFO: renamed from: y0 */
    InterfaceC9997j mo38736y0(C10003m c10003m);

    /* JADX INFO: renamed from: z */
    InterfaceC9997j mo38737z(long j10);
}

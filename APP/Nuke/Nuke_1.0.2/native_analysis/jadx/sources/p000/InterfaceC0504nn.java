package p000;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: nn */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0504nn extends fr2, WritableByteChannel {
    @Override // p000.fr2, java.io.Flushable
    void flush();

    /* JADX INFO: renamed from: l */
    C0209fn mo1684l();

    /* JADX INFO: renamed from: w */
    InterfaceC0504nn mo1694w(int i, byte[] bArr);

    InterfaceC0504nn write(byte[] bArr);

    InterfaceC0504nn writeByte(int i);

    InterfaceC0504nn writeInt(int i);

    InterfaceC0504nn writeShort(int i);

    /* JADX INFO: renamed from: y */
    InterfaceC0504nn mo1696y(String str);

    /* JADX INFO: renamed from: z */
    InterfaceC0504nn mo1697z(C0505no c0505no);
}

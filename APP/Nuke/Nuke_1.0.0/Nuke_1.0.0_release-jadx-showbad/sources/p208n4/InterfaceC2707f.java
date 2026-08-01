package p208n4;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: n4.f */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2707f extends InterfaceC2720s, WritableByteChannel {
    /* JADX INFO: renamed from: e */
    InterfaceC2707f mo4713e(C2709h c2709h);

    @Override // p208n4.InterfaceC2720s, java.io.Flushable
    void flush();

    /* JADX INFO: renamed from: k */
    C2706e mo4718k();

    /* JADX INFO: renamed from: s */
    InterfaceC2707f mo4725s(int i5, byte[] bArr);

    /* JADX INFO: renamed from: v */
    InterfaceC2707f mo4728v(String str);

    InterfaceC2707f write(byte[] bArr);

    InterfaceC2707f writeByte(int i5);

    InterfaceC2707f writeInt(int i5);

    InterfaceC2707f writeShort(int i5);
}

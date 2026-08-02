package p000;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: renamed from: on */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0549on extends ht2, ReadableByteChannel {
    /* JADX INFO: renamed from: C */
    InputStream mo1668C();

    /* JADX INFO: renamed from: f */
    C0505no mo1678f(long j);

    /* JADX INFO: renamed from: i */
    long mo1681i(C0209fn c0209fn);

    /* JADX INFO: renamed from: m */
    int mo1685m(nv1 nv1Var);

    byte readByte();

    int readInt();

    short readShort();

    /* JADX INFO: renamed from: s */
    String mo1690s(long j);

    void skip(long j);

    /* JADX INFO: renamed from: x */
    void mo1695x(long j);
}

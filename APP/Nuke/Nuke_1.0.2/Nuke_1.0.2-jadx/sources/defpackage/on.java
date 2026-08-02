package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public interface on extends ht2, ReadableByteChannel {
    InputStream C();

    no f(long j);

    long i(fn fnVar);

    int m(nv1 nv1Var);

    byte readByte();

    int readInt();

    short readShort();

    String s(long j);

    void skip(long j);

    void x(long j);
}

package defpackage;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public interface nn extends fr2, WritableByteChannel {
    @Override // defpackage.fr2, java.io.Flushable
    void flush();

    fn l();

    nn w(int i, byte[] bArr);

    nn write(byte[] bArr);

    nn writeByte(int i);

    nn writeInt(int i);

    nn writeShort(int i);

    nn y(String str);

    nn z(no noVar);
}

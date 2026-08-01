package p020;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.text.AbstractC5976;
import p025.AbstractC7012;
import p191.AbstractC8568;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6934 implements InterfaceC6930 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final CRC32 f17026;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6933 f17027;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6928 f17028;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Inflater f17029;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public byte f17030;

    public C6934(InterfaceC6939 interfaceC6939) {
        interfaceC6939.getClass();
        C6928 c6928 = new C6928(interfaceC6939);
        this.f17028 = c6928;
        Inflater inflater = new Inflater(true);
        this.f17029 = inflater;
        this.f17027 = new C6933(c6928, inflater);
        this.f17026 = new CRC32();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m12065(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        StringBuilder sbM12143 = AbstractC7012.m12143(str, ": actual 0x");
        sbM12143.append(AbstractC5976.m10726(8, AbstractC8568.m13609(i2)));
        sbM12143.append(" != expected 0x");
        sbM12143.append(AbstractC5976.m10726(8, AbstractC8568.m13609(i)));
        throw new IOException(sbM12143.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17027.close();
    }

    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo11491(C6921 c6921, long j) throws IOException {
        long j2;
        C6934 c6934 = this;
        c6921.getClass();
        byte b = c6934.f17030;
        CRC32 crc32 = c6934.f17026;
        C6928 c6928 = c6934.f17028;
        if (b == 0) {
            c6928.mo12046(10L);
            C6921 c69212 = c6928.f17016;
            byte bM12045 = c69212.m12045(3L);
            boolean z = ((bM12045 >> 1) & 1) == 1;
            if (z) {
                c6934.m12066(c69212, 0L, 10L);
            }
            m12065(8075, c6928.readShort(), "ID1ID2");
            c6928.skip(8L);
            if (((bM12045 >> 2) & 1) == 1) {
                c6928.mo12046(2L);
                if (z) {
                    m12066(c69212, 0L, 2L);
                }
                short s = c69212.readShort();
                long j3 = ((short) (((s & 255) << 8) | ((s & 65280) >>> 8))) & 65535;
                c6928.mo12046(j3);
                if (z) {
                    m12066(c69212, 0L, j3);
                }
                c6928.skip(j3);
            }
            if (((bM12045 >> 3) & 1) == 1) {
                long jM12061 = c6928.m12061((byte) 0, 0L, Long.MAX_VALUE);
                if (jM12061 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = 2;
                    m12066(c69212, 0L, jM12061 + 1);
                } else {
                    j2 = 2;
                }
                c6928.skip(jM12061 + 1);
            } else {
                j2 = 2;
            }
            if (((bM12045 >> 4) & 1) == 1) {
                long j4 = j2;
                long jM120612 = c6928.m12061((byte) 0, 0L, Long.MAX_VALUE);
                if (jM120612 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = j4;
                    c6934 = this;
                    c6934.m12066(c69212, 0L, jM120612 + 1);
                } else {
                    c6934 = this;
                    j2 = j4;
                }
                c6928.skip(jM120612 + 1);
            } else {
                c6934 = this;
            }
            if (z) {
                c6928.mo12046(j2);
                short s2 = c69212.readShort();
                m12065((short) (((s2 & 255) << 8) | ((s2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            c6934.f17030 = (byte) 1;
        }
        if (c6934.f17030 == 1) {
            long j5 = c6921.f16992;
            long jMo11491 = c6934.f17027.mo11491(c6921, 8192L);
            if (jMo11491 != -1) {
                c6934.m12066(c6921, j5, jMo11491);
                return jMo11491;
            }
            c6934.f17030 = (byte) 2;
        }
        if (c6934.f17030 == 2) {
            m12065(c6928.m12060(), (int) crc32.getValue(), "CRC");
            m12065(c6928.m12060(), (int) c6934.f17029.getBytesWritten(), "ISIZE");
            c6934.f17030 = (byte) 3;
            if (!c6928.m12062()) {
                C6755.m11866("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6919 mo11492() {
        return this.f17028.f17018.mo11492();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12066(C6921 c6921, long j, long j2) {
        C6927 c6927 = c6921.f16993;
        c6927.getClass();
        while (true) {
            int i = c6927.f17012;
            int i2 = c6927.f17013;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            c6927 = c6927.f17009;
            c6927.getClass();
        }
        while (j2 > 0) {
            int i3 = (int) (((long) c6927.f17013) + j);
            int iMin = (int) Math.min(c6927.f17012 - i3, j2);
            this.f17026.update(c6927.f17014, i3, iMin);
            j2 -= (long) iMin;
            c6927 = c6927.f17009;
            c6927.getClass();
            j = 0;
        }
    }
}

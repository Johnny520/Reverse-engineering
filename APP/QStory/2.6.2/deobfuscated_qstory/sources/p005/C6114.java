package p005;

import com.bumptech.glide.AbstractC3055;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.text.AbstractC5143;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏楪子.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6114 implements InterfaceC6110 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final CRC32 f16691;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6113 f16692;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6108 f16693;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Inflater f16694;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public byte f16695;

    public C6114(InterfaceC6119 interfaceC6119) {
        interfaceC6119.getClass();
        C6108 c6108 = new C6108(interfaceC6119);
        this.f16693 = c6108;
        Inflater inflater = new Inflater(true);
        this.f16694 = inflater;
        this.f16692 = new C6113(c6108, inflater);
        this.f16691 = new CRC32();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m11513(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        StringBuilder sbM11553 = AbstractC6136.m11553(str, ": actual 0x");
        sbM11553.append(AbstractC5143.m10162(8, AbstractC3055.m6627(i2)));
        sbM11553.append(" != expected 0x");
        sbM11553.append(AbstractC5143.m10162(8, AbstractC3055.m6627(i)));
        throw new IOException(sbM11553.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16692.close();
    }

    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6099 mo10875() {
        return this.f16693.f16683.mo10875();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11514(C6101 c6101, long j, long j2) {
        C6107 c6107 = c6101.f16658;
        c6107.getClass();
        while (true) {
            int i = c6107.f16677;
            int i2 = c6107.f16678;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            c6107 = c6107.f16674;
            c6107.getClass();
        }
        while (j2 > 0) {
            int i3 = (int) (((long) c6107.f16678) + j);
            int iMin = (int) Math.min(c6107.f16677 - i3, j2);
            this.f16691.update(c6107.f16679, i3, iMin);
            j2 -= (long) iMin;
            c6107 = c6107.f16674;
            c6107.getClass();
            j = 0;
        }
    }

    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final long mo10876(C6101 c6101, long j) throws IOException {
        long j2;
        C6114 c6114 = this;
        c6101.getClass();
        byte b = c6114.f16695;
        CRC32 crc32 = c6114.f16691;
        C6108 c6108 = c6114.f16693;
        if (b == 0) {
            c6108.mo11493(10L);
            C6101 c61012 = c6108.f16681;
            byte bM11492 = c61012.m11492(3L);
            boolean z = ((bM11492 >> 1) & 1) == 1;
            if (z) {
                c6114.m11514(c61012, 0L, 10L);
            }
            m11513(8075, c6108.readShort(), "ID1ID2");
            c6108.skip(8L);
            if (((bM11492 >> 2) & 1) == 1) {
                c6108.mo11493(2L);
                if (z) {
                    m11514(c61012, 0L, 2L);
                }
                short s = c61012.readShort();
                long j3 = ((short) (((s & 255) << 8) | ((s & 65280) >>> 8))) & 65535;
                c6108.mo11493(j3);
                if (z) {
                    m11514(c61012, 0L, j3);
                }
                c6108.skip(j3);
            }
            if (((bM11492 >> 3) & 1) == 1) {
                long jM11509 = c6108.m11509((byte) 0, 0L, Long.MAX_VALUE);
                if (jM11509 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = 2;
                    m11514(c61012, 0L, jM11509 + 1);
                } else {
                    j2 = 2;
                }
                c6108.skip(jM11509 + 1);
            } else {
                j2 = 2;
            }
            if (((bM11492 >> 4) & 1) == 1) {
                long j4 = j2;
                long jM115092 = c6108.m11509((byte) 0, 0L, Long.MAX_VALUE);
                if (jM115092 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = j4;
                    c6114 = this;
                    c6114.m11514(c61012, 0L, jM115092 + 1);
                } else {
                    c6114 = this;
                    j2 = j4;
                }
                c6108.skip(jM115092 + 1);
            } else {
                c6114 = this;
            }
            if (z) {
                c6108.mo11493(j2);
                short s2 = c61012.readShort();
                m11513((short) (((s2 & 255) << 8) | ((s2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            c6114.f16695 = (byte) 1;
        }
        if (c6114.f16695 == 1) {
            long j5 = c6101.f16657;
            long jMo10876 = c6114.f16692.mo10876(c6101, 8192L);
            if (jMo10876 != -1) {
                c6114.m11514(c6101, j5, jMo10876);
                return jMo10876;
            }
            c6114.f16695 = (byte) 2;
        }
        if (c6114.f16695 == 2) {
            m11513(c6108.m11508(), (int) crc32.getValue(), "CRC");
            m11513(c6108.m11508(), (int) c6114.f16694.getBytesWritten(), "ISIZE");
            c6114.f16695 = (byte) 3;
            if (!c6108.m11510()) {
                C5919.m11246("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }
}

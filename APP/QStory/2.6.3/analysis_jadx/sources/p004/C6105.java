package p004;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.text.AbstractC5144;
import p009.AbstractC6183;
import p175.AbstractC7739;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6105 implements InterfaceC6101 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final CRC32 f16681;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6104 f16682;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6099 f16683;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Inflater f16684;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public byte f16685;

    public C6105(InterfaceC6110 interfaceC6110) {
        interfaceC6110.getClass();
        C6099 c6099 = new C6099(interfaceC6110);
        this.f16683 = c6099;
        Inflater inflater = new Inflater(true);
        this.f16684 = inflater;
        this.f16682 = new C6104(c6099, inflater);
        this.f16681 = new CRC32();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m11506(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        StringBuilder sbM11584 = AbstractC6183.m11584(str, ": actual 0x");
        sbM11584.append(AbstractC5144.m10167(8, AbstractC7739.m13050(i2)));
        sbM11584.append(" != expected 0x");
        sbM11584.append(AbstractC5144.m10167(8, AbstractC7739.m13050(i)));
        throw new IOException(sbM11584.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16682.close();
    }

    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo10932(C6092 c6092, long j) throws IOException {
        long j2;
        C6105 c6105 = this;
        c6092.getClass();
        byte b = c6105.f16685;
        CRC32 crc32 = c6105.f16681;
        C6099 c6099 = c6105.f16683;
        if (b == 0) {
            c6099.mo11487(10L);
            C6092 c60922 = c6099.f16671;
            byte bM11486 = c60922.m11486(3L);
            boolean z = ((bM11486 >> 1) & 1) == 1;
            if (z) {
                c6105.m11507(c60922, 0L, 10L);
            }
            m11506(8075, c6099.readShort(), "ID1ID2");
            c6099.skip(8L);
            if (((bM11486 >> 2) & 1) == 1) {
                c6099.mo11487(2L);
                if (z) {
                    m11507(c60922, 0L, 2L);
                }
                short s = c60922.readShort();
                long j3 = ((short) (((s & 255) << 8) | ((s & 65280) >>> 8))) & 65535;
                c6099.mo11487(j3);
                if (z) {
                    m11507(c60922, 0L, j3);
                }
                c6099.skip(j3);
            }
            if (((bM11486 >> 3) & 1) == 1) {
                long jM11502 = c6099.m11502((byte) 0, 0L, Long.MAX_VALUE);
                if (jM11502 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = 2;
                    m11507(c60922, 0L, jM11502 + 1);
                } else {
                    j2 = 2;
                }
                c6099.skip(jM11502 + 1);
            } else {
                j2 = 2;
            }
            if (((bM11486 >> 4) & 1) == 1) {
                long j4 = j2;
                long jM115022 = c6099.m11502((byte) 0, 0L, Long.MAX_VALUE);
                if (jM115022 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = j4;
                    c6105 = this;
                    c6105.m11507(c60922, 0L, jM115022 + 1);
                } else {
                    c6105 = this;
                    j2 = j4;
                }
                c6099.skip(jM115022 + 1);
            } else {
                c6105 = this;
            }
            if (z) {
                c6099.mo11487(j2);
                short s2 = c60922.readShort();
                m11506((short) (((s2 & 255) << 8) | ((s2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            c6105.f16685 = (byte) 1;
        }
        if (c6105.f16685 == 1) {
            long j5 = c6092.f16647;
            long jMo10932 = c6105.f16682.mo10932(c6092, 8192L);
            if (jMo10932 != -1) {
                c6105.m11507(c6092, j5, jMo10932);
                return jMo10932;
            }
            c6105.f16685 = (byte) 2;
        }
        if (c6105.f16685 == 2) {
            m11506(c6099.m11501(), (int) crc32.getValue(), "CRC");
            m11506(c6099.m11501(), (int) c6105.f16684.getBytesWritten(), "ISIZE");
            c6105.f16685 = (byte) 3;
            if (!c6099.m11503()) {
                C5925.m11307("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6090 mo10933() {
        return this.f16683.f16673.mo10933();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11507(C6092 c6092, long j, long j2) {
        C6098 c6098 = c6092.f16648;
        c6098.getClass();
        while (true) {
            int i = c6098.f16667;
            int i2 = c6098.f16668;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            c6098 = c6098.f16664;
            c6098.getClass();
        }
        while (j2 > 0) {
            int i3 = (int) (((long) c6098.f16668) + j);
            int iMin = (int) Math.min(c6098.f16667 - i3, j2);
            this.f16681.update(c6098.f16669, i3, iMin);
            j2 -= (long) iMin;
            c6098 = c6098.f16664;
            c6098.getClass();
            j = 0;
        }
    }
}

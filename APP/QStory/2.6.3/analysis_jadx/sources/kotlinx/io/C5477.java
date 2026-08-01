package kotlinx.io;

import androidx.profileinstaller.AbstractC2442;
import com.android.dx.io.Opcodes;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import io.ktor.util.C4211;
import java.io.EOFException;
import kotlin.collections.AbstractC4347;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5477 implements InterfaceC5481, InterfaceC5484 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C5479 f15141;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f15142;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C5479 f15143;

    @Override // kotlinx.io.InterfaceC5481
    public final C5472 peek() {
        return new C5472(new C5475(this));
    }

    @Override // kotlinx.io.InterfaceC5481
    public final byte readByte() throws EOFException {
        C5479 c5479 = this.f15143;
        if (c5479 == null) {
            m10608(1L);
            throw null;
        }
        int iM10637 = c5479.m10637();
        if (iM10637 == 0) {
            m10610();
            return readByte();
        }
        byte[] bArr = c5479.f15150;
        int i = c5479.f15149;
        c5479.f15149 = i + 1;
        byte b = bArr[i];
        this.f15142--;
        if (iM10637 == 1) {
            m10610();
        }
        return b;
    }

    @Override // kotlinx.io.InterfaceC5481
    public final int readInt() throws EOFException {
        C5479 c5479 = this.f15143;
        if (c5479 == null) {
            m10608(4L);
            throw null;
        }
        int iM10637 = c5479.m10637();
        if (iM10637 < 4) {
            mo10606(4L);
            if (iM10637 == 0) {
                m10610();
                return readInt();
            }
            return (readShort() & 65535) | (readShort() << 16);
        }
        byte[] bArr = c5479.f15150;
        int i = c5479.f15149;
        int i2 = (bArr[i + 3] & DefaultClassResolver.NAME) | ((bArr[i + 1] & DefaultClassResolver.NAME) << 16) | ((bArr[i] & DefaultClassResolver.NAME) << 24) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 8);
        c5479.f15149 = i + 4;
        this.f15142 -= 4;
        if (iM10637 == 4) {
            m10610();
        }
        return i2;
    }

    @Override // kotlinx.io.InterfaceC5481
    public final long readLong() throws EOFException {
        C5479 c5479 = this.f15143;
        if (c5479 == null) {
            m10608(8L);
            throw null;
        }
        int iM10637 = c5479.m10637();
        if (iM10637 < 8) {
            mo10606(8L);
            if (iM10637 != 0) {
                return (((long) readInt()) << 32) | (((long) readInt()) & 4294967295L);
            }
            m10610();
            return readLong();
        }
        byte[] bArr = c5479.f15150;
        int i = c5479.f15149;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8) | (((long) bArr[i + 7]) & 255);
        c5479.f15149 = i + 8;
        this.f15142 -= 8;
        if (iM10637 == 8) {
            m10610();
        }
        return j;
    }

    @Override // kotlinx.io.InterfaceC5481
    public final short readShort() throws EOFException {
        C5479 c5479 = this.f15143;
        if (c5479 == null) {
            m10608(2L);
            throw null;
        }
        int iM10637 = c5479.m10637();
        if (iM10637 < 2) {
            mo10606(2L);
            if (iM10637 == 0) {
                m10610();
                return readShort();
            }
            return (short) ((readByte() & DefaultClassResolver.NAME) | ((readByte() & DefaultClassResolver.NAME) << 8));
        }
        byte[] bArr = c5479.f15150;
        int i = c5479.f15149;
        short s = (short) ((bArr[i + 1] & DefaultClassResolver.NAME) | ((bArr[i] & DefaultClassResolver.NAME) << 8));
        c5479.f15149 = i + 2;
        this.f15142 -= 2;
        if (iM10637 == 2) {
            m10610();
        }
        return s;
    }

    public final void skip(long j) throws EOFException {
        if (j < 0) {
            C4211.m8609("byteCount (", j, ") < 0");
            return;
        }
        long j2 = j;
        while (j2 > 0) {
            C5479 c5479 = this.f15143;
            if (c5479 == null) {
                throw new EOFException("Buffer exhausted before skipping " + j + " bytes.");
            }
            int iMin = (int) Math.min(j2, c5479.f15148 - c5479.f15149);
            long j3 = iMin;
            this.f15142 -= j3;
            j2 -= j3;
            int i = c5479.f15149 + iMin;
            c5479.f15149 = i;
            if (i == c5479.f15148) {
                m10610();
            }
        }
    }

    public final String toString() {
        long j = this.f15142;
        if (j == 0) {
            return "Buffer(size=0)";
        }
        int iMin = (int) Math.min(64L, j);
        StringBuilder sb = new StringBuilder((iMin * 2) + (this.f15142 > 64 ? 1 : 0));
        int i = 0;
        for (C5479 c5479 = this.f15143; c5479 != null; c5479 = c5479.f15145) {
            int i2 = 0;
            while (i < iMin && i2 < c5479.m10637()) {
                int i3 = i2 + 1;
                byte b = c5479.f15150[c5479.f15149 + i2];
                i++;
                char[] cArr = AbstractC5478.f15144;
                sb.append(cArr[(b >> 4) & 15]);
                sb.append(cArr[b & 15]);
                i2 = i3;
            }
        }
        if (this.f15142 > 64) {
            sb.append((char) 8230);
        }
        return "Buffer(size=" + this.f15142 + " hex=" + ((Object) sb) + ')';
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        AbstractC5478.m10621(bArr.length, i, i2);
        int i3 = i;
        while (i3 < i2) {
            C5479 c5479M10612 = m10612(1);
            int iMin = Math.min(i2 - i3, c5479M10612.m10638()) + i3;
            AbstractC4347.m8844(bArr, c5479M10612.f15148, c5479M10612.f15150, i3, iMin);
            c5479M10612.f15148 = (iMin - i3) + c5479M10612.f15148;
            i3 = iMin;
        }
        this.f15142 += (long) (i2 - i);
    }

    @Override // kotlinx.io.InterfaceC5481
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final long mo10600(InterfaceC5484 interfaceC5484) {
        interfaceC5484.getClass();
        long j = this.f15142;
        if (j > 0) {
            ((C5477) interfaceC5484).m10616(this, j);
        }
        return j;
    }

    @Override // kotlinx.io.InterfaceC5481
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final void mo10601(InterfaceC5484 interfaceC5484, long j) throws EOFException {
        interfaceC5484.getClass();
        if (j < 0) {
            C4211.m8609("byteCount (", j, ") < 0");
            return;
        }
        long j2 = this.f15142;
        if (j2 >= j) {
            ((C5477) interfaceC5484).m10616(this, j);
            return;
        }
        ((C5477) interfaceC5484).m10616(this, j2);
        throw new EOFException("Buffer exhausted before writing " + j + " bytes. Only " + this.f15142 + " bytes were written.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m10608(long j) throws EOFException {
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.f15142 + ", required: " + j + ')');
    }

    @Override // kotlinx.io.InterfaceC5481
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo10602(long j) {
        if (j >= 0) {
            return this.f15142 >= j;
        }
        C4211.m8609("byteCount: ", j, " < 0");
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ void m10609() {
        C5479 c5479 = this.f15141;
        c5479.getClass();
        C5479 c54792 = c5479.f15151;
        this.f15141 = c54792;
        if (c54792 == null) {
            this.f15143 = null;
        } else {
            c54792.f15145 = null;
        }
        c5479.f15151 = null;
        AbstractC5483.m10640(c5479);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m10610() {
        C5479 c5479 = this.f15143;
        c5479.getClass();
        C5479 c54792 = c5479.f15145;
        this.f15143 = c54792;
        if (c54792 == null) {
            this.f15141 = null;
        } else {
            c54792.f15151 = null;
        }
        c5479.f15145 = null;
        AbstractC5483.m10640(c5479);
    }

    @Override // kotlinx.io.InterfaceC5481
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo10604() {
        return this.f15142 == 0;
    }

    @Override // kotlinx.io.InterfaceC5474
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final long mo10605(C5477 c5477, long j) {
        if (j < 0) {
            C4211.m8609("byteCount (", j, ") < 0");
            return 0L;
        }
        long j2 = this.f15142;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c5477.m10616(this, j);
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m10611(short s) {
        C5479 c5479M10612 = m10612(2);
        byte[] bArr = c5479M10612.f15150;
        int i = c5479M10612.f15148;
        bArr[i] = (byte) ((s >>> 8) & Opcodes.CONST_METHOD_TYPE);
        bArr[i + 1] = (byte) (s & 255);
        c5479M10612.f15148 = i + 2;
        this.f15142 += 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5479 m10612(int i) {
        if (i < 1 || i > 8192) {
            C5925.m11310("unexpected capacity");
            return null;
        }
        C5479 c5479 = this.f15141;
        if (c5479 == null) {
            C5479 c5479M10639 = AbstractC5483.m10639();
            this.f15143 = c5479M10639;
            this.f15141 = c5479M10639;
            return c5479M10639;
        }
        if (c5479.f15148 + i <= 8192 && c5479.f15146) {
            return c5479;
        }
        C5479 c5479M106392 = AbstractC5483.m10639();
        c5479.m10635(c5479M106392);
        this.f15141 = c5479M106392;
        return c5479M106392;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long m10613(InterfaceC5474 interfaceC5474) {
        interfaceC5474.getClass();
        long j = 0;
        while (true) {
            long jMo10605 = interfaceC5474.mo10605(this, 8192L);
            if (jMo10605 == -1) {
                return j;
            }
            j += jMo10605;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m10614(byte b) {
        C5479 c5479M10612 = m10612(1);
        byte[] bArr = c5479M10612.f15150;
        int i = c5479M10612.f15148;
        c5479M10612.f15148 = i + 1;
        bArr[i] = b;
        this.f15142++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m10615(int i) {
        C5479 c5479M10612 = m10612(4);
        byte[] bArr = c5479M10612.f15150;
        int i2 = c5479M10612.f15148;
        bArr[i2] = (byte) ((i >>> 24) & Opcodes.CONST_METHOD_TYPE);
        bArr[i2 + 1] = (byte) ((i >>> 16) & Opcodes.CONST_METHOD_TYPE);
        bArr[i2 + 2] = (byte) ((i >>> 8) & Opcodes.CONST_METHOD_TYPE);
        bArr[i2 + 3] = (byte) (i & Opcodes.CONST_METHOD_TYPE);
        c5479M10612.f15148 = i2 + 4;
        this.f15142 += 4;
    }

    @Override // kotlinx.io.InterfaceC5481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo10606(long j) throws EOFException {
        if (j < 0) {
            C5925.m11314(AbstractC2442.m4583(j, "byteCount: "));
            return;
        }
        if (this.f15142 >= j) {
            return;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.f15142 + ", required: " + j + ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m10616(C5477 c5477, long j) {
        C5479 c5479M10639;
        if (c5477 == this) {
            C5925.m11310("source == this");
            return;
        }
        AbstractC5478.m10620(c5477.f15142, 0L, j);
        while (j > 0) {
            c5477.f15143.getClass();
            int i = 0;
            if (j < r0.m10637()) {
                C5479 c5479 = this.f15141;
                if (c5479 != null && c5479.f15146) {
                    long j2 = ((long) c5479.f15148) + j;
                    C5480 c5480 = c5479.f15147;
                    if (j2 - ((long) ((c5480 == null || c5480.f15153 <= 0) ? c5479.f15149 : 0)) <= 8192) {
                        C5479 c54792 = c5477.f15143;
                        c54792.getClass();
                        c54792.m10633(c5479, (int) j);
                        c5477.f15142 -= j;
                        this.f15142 += j;
                        return;
                    }
                }
                C5479 c54793 = c5477.f15143;
                c54793.getClass();
                int i2 = (int) j;
                if (i2 <= 0 || i2 > c54793.f15148 - c54793.f15149) {
                    C5925.m11310("byteCount out of range");
                    return;
                }
                if (i2 >= 1024) {
                    c5479M10639 = c54793.m10634();
                } else {
                    c5479M10639 = AbstractC5483.m10639();
                    byte[] bArr = c54793.f15150;
                    byte[] bArr2 = c5479M10639.f15150;
                    int i3 = c54793.f15149;
                    AbstractC4347.m8839(bArr, i3, bArr2, i3 + i2, 2);
                }
                c5479M10639.f15148 = c5479M10639.f15149 + i2;
                c54793.f15149 += i2;
                C5479 c54794 = c54793.f15151;
                if (c54794 != null) {
                    c54794.m10635(c5479M10639);
                } else {
                    c5479M10639.f15145 = c54793;
                    c54793.f15151 = c5479M10639;
                }
                c5477.f15143 = c5479M10639;
            }
            C5479 c54795 = c5477.f15143;
            c54795.getClass();
            long jM10637 = c54795.m10637();
            C5479 c5479M10636 = c54795.m10636();
            c5477.f15143 = c5479M10636;
            if (c5479M10636 == null) {
                c5477.f15141 = null;
            }
            if (this.f15143 == null) {
                this.f15143 = c54795;
                this.f15141 = c54795;
            } else {
                C5479 c54796 = this.f15141;
                c54796.getClass();
                c54796.m10635(c54795);
                C5479 c54797 = c54795.f15151;
                if (c54797 == null) {
                    C5925.m11311("cannot compact");
                    return;
                }
                if (c54797.f15146) {
                    int i4 = c54795.f15148 - c54795.f15149;
                    int i5 = 8192 - c54797.f15148;
                    c54797.getClass();
                    C5480 c54802 = c54797.f15147;
                    if (c54802 == null || c54802.f15153 <= 0) {
                        C5479 c54798 = c54795.f15151;
                        c54798.getClass();
                        i = c54798.f15149;
                    }
                    if (i4 <= i5 + i) {
                        C5479 c54799 = c54795.f15151;
                        c54799.getClass();
                        c54795.m10633(c54799, i4);
                        if (c54795.m10636() != null) {
                            C5925.m11311("Check failed.");
                            return;
                        } else {
                            AbstractC5483.m10640(c54795);
                            c54795 = c54799;
                        }
                    }
                }
                this.f15141 = c54795;
                if (c54795.f15151 == null) {
                    this.f15143 = c54795;
                }
            }
            c5477.f15142 -= jM10637;
            this.f15142 += jM10637;
            j -= jM10637;
        }
    }

    @Override // kotlinx.io.InterfaceC5481
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final int mo10607(int i, byte[] bArr, int i2) {
        bArr.getClass();
        AbstractC5478.m10621(bArr.length, i, i2);
        C5479 c5479 = this.f15143;
        if (c5479 == null) {
            return -1;
        }
        int iMin = Math.min(i2 - i, c5479.m10637());
        int i3 = (i + iMin) - i;
        byte[] bArr2 = c5479.f15150;
        int i4 = c5479.f15149;
        AbstractC4347.m8844(bArr2, i, bArr, i4, i4 + i3);
        c5479.f15149 += i3;
        this.f15142 -= (long) iMin;
        if (AbstractC5478.m10628(c5479)) {
            m10610();
        }
        return iMin;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Flushable
    public final void flush() {
    }

    @Override // kotlinx.io.InterfaceC5481
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C5477 mo10603() {
        return this;
    }
}

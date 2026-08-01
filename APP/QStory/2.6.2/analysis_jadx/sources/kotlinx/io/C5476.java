package kotlinx.io;

import androidx.profileinstaller.AbstractC2442;
import com.android.dx.io.Opcodes;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import io.ktor.util.C4210;
import java.io.EOFException;
import kotlin.collections.AbstractC4346;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5476 implements InterfaceC5480, InterfaceC5483 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C5478 f15141;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f15142;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C5478 f15143;

    @Override // kotlinx.io.InterfaceC5480
    public final C5471 peek() {
        return new C5471(new C5474(this));
    }

    @Override // kotlinx.io.InterfaceC5480
    public final byte readByte() throws EOFException {
        C5478 c5478 = this.f15143;
        if (c5478 == null) {
            m10604(1L);
            throw null;
        }
        int iM10633 = c5478.m10633();
        if (iM10633 == 0) {
            m10606();
            return readByte();
        }
        byte[] bArr = c5478.f15150;
        int i = c5478.f15149;
        c5478.f15149 = i + 1;
        byte b = bArr[i];
        this.f15142--;
        if (iM10633 == 1) {
            m10606();
        }
        return b;
    }

    @Override // kotlinx.io.InterfaceC5480
    public final int readInt() throws EOFException {
        C5478 c5478 = this.f15143;
        if (c5478 == null) {
            m10604(4L);
            throw null;
        }
        int iM10633 = c5478.m10633();
        if (iM10633 < 4) {
            mo10602(4L);
            if (iM10633 == 0) {
                m10606();
                return readInt();
            }
            return (readShort() & 65535) | (readShort() << 16);
        }
        byte[] bArr = c5478.f15150;
        int i = c5478.f15149;
        int i2 = (bArr[i + 3] & DefaultClassResolver.NAME) | ((bArr[i + 1] & DefaultClassResolver.NAME) << 16) | ((bArr[i] & DefaultClassResolver.NAME) << 24) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 8);
        c5478.f15149 = i + 4;
        this.f15142 -= 4;
        if (iM10633 == 4) {
            m10606();
        }
        return i2;
    }

    @Override // kotlinx.io.InterfaceC5480
    public final long readLong() throws EOFException {
        C5478 c5478 = this.f15143;
        if (c5478 == null) {
            m10604(8L);
            throw null;
        }
        int iM10633 = c5478.m10633();
        if (iM10633 < 8) {
            mo10602(8L);
            if (iM10633 != 0) {
                return (((long) readInt()) << 32) | (((long) readInt()) & 4294967295L);
            }
            m10606();
            return readLong();
        }
        byte[] bArr = c5478.f15150;
        int i = c5478.f15149;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8) | (((long) bArr[i + 7]) & 255);
        c5478.f15149 = i + 8;
        this.f15142 -= 8;
        if (iM10633 == 8) {
            m10606();
        }
        return j;
    }

    @Override // kotlinx.io.InterfaceC5480
    public final short readShort() throws EOFException {
        C5478 c5478 = this.f15143;
        if (c5478 == null) {
            m10604(2L);
            throw null;
        }
        int iM10633 = c5478.m10633();
        if (iM10633 < 2) {
            mo10602(2L);
            if (iM10633 == 0) {
                m10606();
                return readShort();
            }
            return (short) ((readByte() & DefaultClassResolver.NAME) | ((readByte() & DefaultClassResolver.NAME) << 8));
        }
        byte[] bArr = c5478.f15150;
        int i = c5478.f15149;
        short s = (short) ((bArr[i + 1] & DefaultClassResolver.NAME) | ((bArr[i] & DefaultClassResolver.NAME) << 8));
        c5478.f15149 = i + 2;
        this.f15142 -= 2;
        if (iM10633 == 2) {
            m10606();
        }
        return s;
    }

    public final void skip(long j) throws EOFException {
        if (j < 0) {
            C4210.m8619("byteCount (", j, ") < 0");
            return;
        }
        long j2 = j;
        while (j2 > 0) {
            C5478 c5478 = this.f15143;
            if (c5478 == null) {
                throw new EOFException("Buffer exhausted before skipping " + j + " bytes.");
            }
            int iMin = (int) Math.min(j2, c5478.f15148 - c5478.f15149);
            long j3 = iMin;
            this.f15142 -= j3;
            j2 -= j3;
            int i = c5478.f15149 + iMin;
            c5478.f15149 = i;
            if (i == c5478.f15148) {
                m10606();
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
        for (C5478 c5478 = this.f15143; c5478 != null; c5478 = c5478.f15145) {
            int i2 = 0;
            while (i < iMin && i2 < c5478.m10633()) {
                int i3 = i2 + 1;
                byte b = c5478.f15150[c5478.f15149 + i2];
                i++;
                char[] cArr = AbstractC5477.f15144;
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
        AbstractC5477.m10617(bArr.length, i, i2);
        int i3 = i;
        while (i3 < i2) {
            C5478 c5478M10608 = m10608(1);
            int iMin = Math.min(i2 - i3, c5478M10608.m10634()) + i3;
            AbstractC4346.m8840(bArr, c5478M10608.f15148, c5478M10608.f15150, i3, iMin);
            c5478M10608.f15148 = (iMin - i3) + c5478M10608.f15148;
            i3 = iMin;
        }
        this.f15142 += (long) (i2 - i);
    }

    @Override // kotlinx.io.InterfaceC5480
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final void mo10596(InterfaceC5483 interfaceC5483, long j) throws EOFException {
        interfaceC5483.getClass();
        if (j < 0) {
            C4210.m8619("byteCount (", j, ") < 0");
            return;
        }
        long j2 = this.f15142;
        if (j2 >= j) {
            ((C5476) interfaceC5483).m10612(this, j);
            return;
        }
        ((C5476) interfaceC5483).m10612(this, j2);
        throw new EOFException("Buffer exhausted before writing " + j + " bytes. Only " + this.f15142 + " bytes were written.");
    }

    @Override // kotlinx.io.InterfaceC5480
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final long mo10597(InterfaceC5483 interfaceC5483) {
        interfaceC5483.getClass();
        long j = this.f15142;
        if (j > 0) {
            ((C5476) interfaceC5483).m10612(this, j);
        }
        return j;
    }

    @Override // kotlinx.io.InterfaceC5473
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final long mo10598(C5476 c5476, long j) {
        if (j < 0) {
            C4210.m8619("byteCount (", j, ") < 0");
            return 0L;
        }
        long j2 = this.f15142;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c5476.m10612(this, j);
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m10604(long j) throws EOFException {
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.f15142 + ", required: " + j + ')');
    }

    @Override // kotlinx.io.InterfaceC5480
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo10599(long j) {
        if (j >= 0) {
            return this.f15142 >= j;
        }
        C4210.m8619("byteCount: ", j, " < 0");
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ void m10605() {
        C5478 c5478 = this.f15141;
        c5478.getClass();
        C5478 c54782 = c5478.f15151;
        this.f15141 = c54782;
        if (c54782 == null) {
            this.f15143 = null;
        } else {
            c54782.f15145 = null;
        }
        c5478.f15151 = null;
        AbstractC5482.m10636(c5478);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m10606() {
        C5478 c5478 = this.f15143;
        c5478.getClass();
        C5478 c54782 = c5478.f15145;
        this.f15143 = c54782;
        if (c54782 == null) {
            this.f15141 = null;
        } else {
            c54782.f15151 = null;
        }
        c5478.f15145 = null;
        AbstractC5482.m10636(c5478);
    }

    @Override // kotlinx.io.InterfaceC5480
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final boolean mo10601() {
        return this.f15142 == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m10607(short s) {
        C5478 c5478M10608 = m10608(2);
        byte[] bArr = c5478M10608.f15150;
        int i = c5478M10608.f15148;
        bArr[i] = (byte) ((s >>> 8) & Opcodes.CONST_METHOD_TYPE);
        bArr[i + 1] = (byte) (s & 255);
        c5478M10608.f15148 = i + 2;
        this.f15142 += 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5478 m10608(int i) {
        if (i < 1 || i > 8192) {
            C5919.m11249("unexpected capacity");
            return null;
        }
        C5478 c5478 = this.f15141;
        if (c5478 == null) {
            C5478 c5478M10635 = AbstractC5482.m10635();
            this.f15143 = c5478M10635;
            this.f15141 = c5478M10635;
            return c5478M10635;
        }
        if (c5478.f15148 + i <= 8192 && c5478.f15146) {
            return c5478;
        }
        C5478 c5478M106352 = AbstractC5482.m10635();
        c5478.m10631(c5478M106352);
        this.f15141 = c5478M106352;
        return c5478M106352;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long m10609(InterfaceC5473 interfaceC5473) {
        interfaceC5473.getClass();
        long j = 0;
        while (true) {
            long jMo10598 = interfaceC5473.mo10598(this, 8192L);
            if (jMo10598 == -1) {
                return j;
            }
            j += jMo10598;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m10610(byte b) {
        C5478 c5478M10608 = m10608(1);
        byte[] bArr = c5478M10608.f15150;
        int i = c5478M10608.f15148;
        c5478M10608.f15148 = i + 1;
        bArr[i] = b;
        this.f15142++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m10611(int i) {
        C5478 c5478M10608 = m10608(4);
        byte[] bArr = c5478M10608.f15150;
        int i2 = c5478M10608.f15148;
        bArr[i2] = (byte) ((i >>> 24) & Opcodes.CONST_METHOD_TYPE);
        bArr[i2 + 1] = (byte) ((i >>> 16) & Opcodes.CONST_METHOD_TYPE);
        bArr[i2 + 2] = (byte) ((i >>> 8) & Opcodes.CONST_METHOD_TYPE);
        bArr[i2 + 3] = (byte) (i & Opcodes.CONST_METHOD_TYPE);
        c5478M10608.f15148 = i2 + 4;
        this.f15142 += 4;
    }

    @Override // kotlinx.io.InterfaceC5480
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo10602(long j) throws EOFException {
        if (j < 0) {
            C5919.m11253(AbstractC2442.m4572(j, "byteCount: "));
            return;
        }
        if (this.f15142 >= j) {
            return;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.f15142 + ", required: " + j + ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m10612(C5476 c5476, long j) {
        C5478 c5478M10635;
        if (c5476 == this) {
            C5919.m11249("source == this");
            return;
        }
        AbstractC5477.m10616(c5476.f15142, 0L, j);
        while (j > 0) {
            c5476.f15143.getClass();
            int i = 0;
            if (j < r0.m10633()) {
                C5478 c5478 = this.f15141;
                if (c5478 != null && c5478.f15146) {
                    long j2 = ((long) c5478.f15148) + j;
                    C5479 c5479 = c5478.f15147;
                    if (j2 - ((long) ((c5479 == null || c5479.f15153 <= 0) ? c5478.f15149 : 0)) <= 8192) {
                        C5478 c54782 = c5476.f15143;
                        c54782.getClass();
                        c54782.m10629(c5478, (int) j);
                        c5476.f15142 -= j;
                        this.f15142 += j;
                        return;
                    }
                }
                C5478 c54783 = c5476.f15143;
                c54783.getClass();
                int i2 = (int) j;
                if (i2 <= 0 || i2 > c54783.f15148 - c54783.f15149) {
                    C5919.m11249("byteCount out of range");
                    return;
                }
                if (i2 >= 1024) {
                    c5478M10635 = c54783.m10630();
                } else {
                    c5478M10635 = AbstractC5482.m10635();
                    byte[] bArr = c54783.f15150;
                    byte[] bArr2 = c5478M10635.f15150;
                    int i3 = c54783.f15149;
                    AbstractC4346.m8833(bArr, i3, bArr2, i3 + i2, 2);
                }
                c5478M10635.f15148 = c5478M10635.f15149 + i2;
                c54783.f15149 += i2;
                C5478 c54784 = c54783.f15151;
                if (c54784 != null) {
                    c54784.m10631(c5478M10635);
                } else {
                    c5478M10635.f15145 = c54783;
                    c54783.f15151 = c5478M10635;
                }
                c5476.f15143 = c5478M10635;
            }
            C5478 c54785 = c5476.f15143;
            c54785.getClass();
            long jM10633 = c54785.m10633();
            C5478 c5478M10632 = c54785.m10632();
            c5476.f15143 = c5478M10632;
            if (c5478M10632 == null) {
                c5476.f15141 = null;
            }
            if (this.f15143 == null) {
                this.f15143 = c54785;
                this.f15141 = c54785;
            } else {
                C5478 c54786 = this.f15141;
                c54786.getClass();
                c54786.m10631(c54785);
                C5478 c54787 = c54785.f15151;
                if (c54787 == null) {
                    C5919.m11250("cannot compact");
                    return;
                }
                if (c54787.f15146) {
                    int i4 = c54785.f15148 - c54785.f15149;
                    int i5 = 8192 - c54787.f15148;
                    c54787.getClass();
                    C5479 c54792 = c54787.f15147;
                    if (c54792 == null || c54792.f15153 <= 0) {
                        C5478 c54788 = c54785.f15151;
                        c54788.getClass();
                        i = c54788.f15149;
                    }
                    if (i4 <= i5 + i) {
                        C5478 c54789 = c54785.f15151;
                        c54789.getClass();
                        c54785.m10629(c54789, i4);
                        if (c54785.m10632() != null) {
                            C5919.m11250("Check failed.");
                            return;
                        } else {
                            AbstractC5482.m10636(c54785);
                            c54785 = c54789;
                        }
                    }
                }
                this.f15141 = c54785;
                if (c54785.f15151 == null) {
                    this.f15143 = c54785;
                }
            }
            c5476.f15142 -= jM10633;
            this.f15142 += jM10633;
            j -= jM10633;
        }
    }

    @Override // kotlinx.io.InterfaceC5480
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final int mo10603(int i, byte[] bArr, int i2) {
        bArr.getClass();
        AbstractC5477.m10617(bArr.length, i, i2);
        C5478 c5478 = this.f15143;
        if (c5478 == null) {
            return -1;
        }
        int iMin = Math.min(i2 - i, c5478.m10633());
        int i3 = (i + iMin) - i;
        byte[] bArr2 = c5478.f15150;
        int i4 = c5478.f15149;
        AbstractC4346.m8840(bArr2, i, bArr, i4, i4 + i3);
        c5478.f15149 += i3;
        this.f15142 -= (long) iMin;
        if (AbstractC5477.m10624(c5478)) {
            m10606();
        }
        return iMin;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Flushable
    public final void flush() {
    }

    @Override // kotlinx.io.InterfaceC5480
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C5476 mo10600() {
        return this;
    }
}

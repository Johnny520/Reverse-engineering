package kotlinx.p010io;

import androidx.profileinstaller.AbstractC3275;
import com.android.p002dx.p005io.Opcodes;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import io.ktor.util.C5043;
import java.io.EOFException;
import kotlin.collections.AbstractC5179;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6309 implements InterfaceC6313, InterfaceC6316 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C6311 f15486;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f15487;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C6311 f15488;

    @Override // kotlinx.p010io.InterfaceC6313
    public final C6304 peek() {
        return new C6304(new C6307(this));
    }

    @Override // kotlinx.p010io.InterfaceC6313
    public final byte readByte() throws EOFException {
        C6311 c6311 = this.f15488;
        if (c6311 == null) {
            m11167(1L);
            throw null;
        }
        int iM11196 = c6311.m11196();
        if (iM11196 == 0) {
            m11169();
            return readByte();
        }
        byte[] bArr = c6311.f15495;
        int i = c6311.f15494;
        c6311.f15494 = i + 1;
        byte b = bArr[i];
        this.f15487--;
        if (iM11196 == 1) {
            m11169();
        }
        return b;
    }

    @Override // kotlinx.p010io.InterfaceC6313
    public final int readInt() throws EOFException {
        C6311 c6311 = this.f15488;
        if (c6311 == null) {
            m11167(4L);
            throw null;
        }
        int iM11196 = c6311.m11196();
        if (iM11196 < 4) {
            mo11165(4L);
            if (iM11196 == 0) {
                m11169();
                return readInt();
            }
            return (readShort() & 65535) | (readShort() << 16);
        }
        byte[] bArr = c6311.f15495;
        int i = c6311.f15494;
        int i2 = (bArr[i + 3] & DefaultClassResolver.NAME) | ((bArr[i + 1] & DefaultClassResolver.NAME) << 16) | ((bArr[i] & DefaultClassResolver.NAME) << 24) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 8);
        c6311.f15494 = i + 4;
        this.f15487 -= 4;
        if (iM11196 == 4) {
            m11169();
        }
        return i2;
    }

    @Override // kotlinx.p010io.InterfaceC6313
    public final long readLong() throws EOFException {
        C6311 c6311 = this.f15488;
        if (c6311 == null) {
            m11167(8L);
            throw null;
        }
        int iM11196 = c6311.m11196();
        if (iM11196 < 8) {
            mo11165(8L);
            if (iM11196 != 0) {
                return (((long) readInt()) << 32) | (((long) readInt()) & 4294967295L);
            }
            m11169();
            return readLong();
        }
        byte[] bArr = c6311.f15495;
        int i = c6311.f15494;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8) | (((long) bArr[i + 7]) & 255);
        c6311.f15494 = i + 8;
        this.f15487 -= 8;
        if (iM11196 == 8) {
            m11169();
        }
        return j;
    }

    @Override // kotlinx.p010io.InterfaceC6313
    public final short readShort() throws EOFException {
        C6311 c6311 = this.f15488;
        if (c6311 == null) {
            m11167(2L);
            throw null;
        }
        int iM11196 = c6311.m11196();
        if (iM11196 < 2) {
            mo11165(2L);
            if (iM11196 == 0) {
                m11169();
                return readShort();
            }
            return (short) ((readByte() & DefaultClassResolver.NAME) | ((readByte() & DefaultClassResolver.NAME) << 8));
        }
        byte[] bArr = c6311.f15495;
        int i = c6311.f15494;
        short s = (short) ((bArr[i + 1] & DefaultClassResolver.NAME) | ((bArr[i] & DefaultClassResolver.NAME) << 8));
        c6311.f15494 = i + 2;
        this.f15487 -= 2;
        if (iM11196 == 2) {
            m11169();
        }
        return s;
    }

    public final void skip(long j) throws EOFException {
        if (j < 0) {
            C5043.m9168("byteCount (", j, ") < 0");
            return;
        }
        long j2 = j;
        while (j2 > 0) {
            C6311 c6311 = this.f15488;
            if (c6311 == null) {
                throw new EOFException("Buffer exhausted before skipping " + j + " bytes.");
            }
            int iMin = (int) Math.min(j2, c6311.f15493 - c6311.f15494);
            long j3 = iMin;
            this.f15487 -= j3;
            j2 -= j3;
            int i = c6311.f15494 + iMin;
            c6311.f15494 = i;
            if (i == c6311.f15493) {
                m11169();
            }
        }
    }

    public final String toString() {
        long j = this.f15487;
        if (j == 0) {
            return "Buffer(size=0)";
        }
        int iMin = (int) Math.min(64L, j);
        StringBuilder sb = new StringBuilder((iMin * 2) + (this.f15487 > 64 ? 1 : 0));
        int i = 0;
        for (C6311 c6311 = this.f15488; c6311 != null; c6311 = c6311.f15490) {
            int i2 = 0;
            while (i < iMin && i2 < c6311.m11196()) {
                int i3 = i2 + 1;
                byte b = c6311.f15495[c6311.f15494 + i2];
                i++;
                char[] cArr = AbstractC6310.f15489;
                sb.append(cArr[(b >> 4) & 15]);
                sb.append(cArr[b & 15]);
                i2 = i3;
            }
        }
        if (this.f15487 > 64) {
            sb.append((char) 8230);
        }
        return "Buffer(size=" + this.f15487 + " hex=" + ((Object) sb) + ')';
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        AbstractC6310.m11180(bArr.length, i, i2);
        int i3 = i;
        while (i3 < i2) {
            C6311 c6311M11171 = m11171(1);
            int iMin = Math.min(i2 - i3, c6311M11171.m11197()) + i3;
            AbstractC5179.m9403(bArr, c6311M11171.f15493, c6311M11171.f15495, i3, iMin);
            c6311M11171.f15493 = (iMin - i3) + c6311M11171.f15493;
            i3 = iMin;
        }
        this.f15487 += (long) (i2 - i);
    }

    @Override // kotlinx.p010io.InterfaceC6313
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final long mo11159(InterfaceC6316 interfaceC6316) {
        interfaceC6316.getClass();
        long j = this.f15487;
        if (j > 0) {
            ((C6309) interfaceC6316).m11175(this, j);
        }
        return j;
    }

    @Override // kotlinx.p010io.InterfaceC6313
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final void mo11160(InterfaceC6316 interfaceC6316, long j) throws EOFException {
        interfaceC6316.getClass();
        if (j < 0) {
            C5043.m9168("byteCount (", j, ") < 0");
            return;
        }
        long j2 = this.f15487;
        if (j2 >= j) {
            ((C6309) interfaceC6316).m11175(this, j);
            return;
        }
        ((C6309) interfaceC6316).m11175(this, j2);
        throw new EOFException("Buffer exhausted before writing " + j + " bytes. Only " + this.f15487 + " bytes were written.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m11167(long j) throws EOFException {
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.f15487 + ", required: " + j + ')');
    }

    @Override // kotlinx.p010io.InterfaceC6313
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo11161(long j) {
        if (j >= 0) {
            return this.f15487 >= j;
        }
        C5043.m9168("byteCount: ", j, " < 0");
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ void m11168() {
        C6311 c6311 = this.f15486;
        c6311.getClass();
        C6311 c63112 = c6311.f15496;
        this.f15486 = c63112;
        if (c63112 == null) {
            this.f15488 = null;
        } else {
            c63112.f15490 = null;
        }
        c6311.f15496 = null;
        AbstractC6315.m11199(c6311);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11169() {
        C6311 c6311 = this.f15488;
        c6311.getClass();
        C6311 c63112 = c6311.f15490;
        this.f15488 = c63112;
        if (c63112 == null) {
            this.f15486 = null;
        } else {
            c63112.f15496 = null;
        }
        c6311.f15490 = null;
        AbstractC6315.m11199(c6311);
    }

    @Override // kotlinx.p010io.InterfaceC6313
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo11163() {
        return this.f15487 == 0;
    }

    @Override // kotlinx.p010io.InterfaceC6306
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final long mo11164(C6309 c6309, long j) {
        if (j < 0) {
            C5043.m9168("byteCount (", j, ") < 0");
            return 0L;
        }
        long j2 = this.f15487;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c6309.m11175(this, j);
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m11170(short s) {
        C6311 c6311M11171 = m11171(2);
        byte[] bArr = c6311M11171.f15495;
        int i = c6311M11171.f15493;
        bArr[i] = (byte) ((s >>> 8) & Opcodes.CONST_METHOD_TYPE);
        bArr[i + 1] = (byte) (s & 255);
        c6311M11171.f15493 = i + 2;
        this.f15487 += 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6311 m11171(int i) {
        if (i < 1 || i > 8192) {
            C6755.m11869("unexpected capacity");
            return null;
        }
        C6311 c6311 = this.f15486;
        if (c6311 == null) {
            C6311 c6311M11198 = AbstractC6315.m11198();
            this.f15488 = c6311M11198;
            this.f15486 = c6311M11198;
            return c6311M11198;
        }
        if (c6311.f15493 + i <= 8192 && c6311.f15491) {
            return c6311;
        }
        C6311 c6311M111982 = AbstractC6315.m11198();
        c6311.m11194(c6311M111982);
        this.f15486 = c6311M111982;
        return c6311M111982;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long m11172(InterfaceC6306 interfaceC6306) {
        interfaceC6306.getClass();
        long j = 0;
        while (true) {
            long jMo11164 = interfaceC6306.mo11164(this, 8192L);
            if (jMo11164 == -1) {
                return j;
            }
            j += jMo11164;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m11173(byte b) {
        C6311 c6311M11171 = m11171(1);
        byte[] bArr = c6311M11171.f15495;
        int i = c6311M11171.f15493;
        c6311M11171.f15493 = i + 1;
        bArr[i] = b;
        this.f15487++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11174(int i) {
        C6311 c6311M11171 = m11171(4);
        byte[] bArr = c6311M11171.f15495;
        int i2 = c6311M11171.f15493;
        bArr[i2] = (byte) ((i >>> 24) & Opcodes.CONST_METHOD_TYPE);
        bArr[i2 + 1] = (byte) ((i >>> 16) & Opcodes.CONST_METHOD_TYPE);
        bArr[i2 + 2] = (byte) ((i >>> 8) & Opcodes.CONST_METHOD_TYPE);
        bArr[i2 + 3] = (byte) (i & Opcodes.CONST_METHOD_TYPE);
        c6311M11171.f15493 = i2 + 4;
        this.f15487 += 4;
    }

    @Override // kotlinx.p010io.InterfaceC6313
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo11165(long j) throws EOFException {
        if (j < 0) {
            C6755.m11873(AbstractC3275.m5143(j, "byteCount: "));
            return;
        }
        if (this.f15487 >= j) {
            return;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.f15487 + ", required: " + j + ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11175(C6309 c6309, long j) {
        C6311 c6311M11198;
        if (c6309 == this) {
            C6755.m11869("source == this");
            return;
        }
        AbstractC6310.m11179(c6309.f15487, 0L, j);
        while (j > 0) {
            c6309.f15488.getClass();
            int i = 0;
            if (j < r0.m11196()) {
                C6311 c6311 = this.f15486;
                if (c6311 != null && c6311.f15491) {
                    long j2 = ((long) c6311.f15493) + j;
                    C6312 c6312 = c6311.f15492;
                    if (j2 - ((long) ((c6312 == null || c6312.f15498 <= 0) ? c6311.f15494 : 0)) <= 8192) {
                        C6311 c63112 = c6309.f15488;
                        c63112.getClass();
                        c63112.m11192(c6311, (int) j);
                        c6309.f15487 -= j;
                        this.f15487 += j;
                        return;
                    }
                }
                C6311 c63113 = c6309.f15488;
                c63113.getClass();
                int i2 = (int) j;
                if (i2 <= 0 || i2 > c63113.f15493 - c63113.f15494) {
                    C6755.m11869("byteCount out of range");
                    return;
                }
                if (i2 >= 1024) {
                    c6311M11198 = c63113.m11193();
                } else {
                    c6311M11198 = AbstractC6315.m11198();
                    byte[] bArr = c63113.f15495;
                    byte[] bArr2 = c6311M11198.f15495;
                    int i3 = c63113.f15494;
                    AbstractC5179.m9398(bArr, i3, bArr2, i3 + i2, 2);
                }
                c6311M11198.f15493 = c6311M11198.f15494 + i2;
                c63113.f15494 += i2;
                C6311 c63114 = c63113.f15496;
                if (c63114 != null) {
                    c63114.m11194(c6311M11198);
                } else {
                    c6311M11198.f15490 = c63113;
                    c63113.f15496 = c6311M11198;
                }
                c6309.f15488 = c6311M11198;
            }
            C6311 c63115 = c6309.f15488;
            c63115.getClass();
            long jM11196 = c63115.m11196();
            C6311 c6311M11195 = c63115.m11195();
            c6309.f15488 = c6311M11195;
            if (c6311M11195 == null) {
                c6309.f15486 = null;
            }
            if (this.f15488 == null) {
                this.f15488 = c63115;
                this.f15486 = c63115;
            } else {
                C6311 c63116 = this.f15486;
                c63116.getClass();
                c63116.m11194(c63115);
                C6311 c63117 = c63115.f15496;
                if (c63117 == null) {
                    C6755.m11870("cannot compact");
                    return;
                }
                if (c63117.f15491) {
                    int i4 = c63115.f15493 - c63115.f15494;
                    int i5 = 8192 - c63117.f15493;
                    c63117.getClass();
                    C6312 c63122 = c63117.f15492;
                    if (c63122 == null || c63122.f15498 <= 0) {
                        C6311 c63118 = c63115.f15496;
                        c63118.getClass();
                        i = c63118.f15494;
                    }
                    if (i4 <= i5 + i) {
                        C6311 c63119 = c63115.f15496;
                        c63119.getClass();
                        c63115.m11192(c63119, i4);
                        if (c63115.m11195() != null) {
                            C6755.m11870("Check failed.");
                            return;
                        } else {
                            AbstractC6315.m11199(c63115);
                            c63115 = c63119;
                        }
                    }
                }
                this.f15486 = c63115;
                if (c63115.f15496 == null) {
                    this.f15488 = c63115;
                }
            }
            c6309.f15487 -= jM11196;
            this.f15487 += jM11196;
            j -= jM11196;
        }
    }

    @Override // kotlinx.p010io.InterfaceC6313
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final int mo11166(int i, byte[] bArr, int i2) {
        bArr.getClass();
        AbstractC6310.m11180(bArr.length, i, i2);
        C6311 c6311 = this.f15488;
        if (c6311 == null) {
            return -1;
        }
        int iMin = Math.min(i2 - i, c6311.m11196());
        int i3 = (i + iMin) - i;
        byte[] bArr2 = c6311.f15495;
        int i4 = c6311.f15494;
        AbstractC5179.m9403(bArr2, i, bArr, i4, i4 + i3);
        c6311.f15494 += i3;
        this.f15487 -= (long) iMin;
        if (AbstractC6310.m11187(c6311)) {
            m11169();
        }
        return iMin;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Flushable
    public final void flush() {
    }

    @Override // kotlinx.p010io.InterfaceC6313
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C6309 mo11162() {
        return this;
    }
}

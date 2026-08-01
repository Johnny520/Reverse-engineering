package p005;

import androidx.activity.AbstractC0053;
import androidx.profileinstaller.AbstractC2442;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3055;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.collections.AbstractC4346;
import kotlin.text.AbstractC5131;
import okio.ByteString;
import okio.SegmentedByteString;
import okio.internal.AbstractC5571;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏楪子.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6101 implements InterfaceC6119, InterfaceC6120, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f16657;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C6107 f16658;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6101)) {
            return false;
        }
        long j = this.f16657;
        C6101 c6101 = (C6101) obj;
        if (j != c6101.f16657) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        C6107 c6107 = this.f16658;
        c6107.getClass();
        C6107 c61072 = c6101.f16658;
        c61072.getClass();
        int i = c6107.f16678;
        int i2 = c61072.f16678;
        long j2 = 0;
        while (j2 < this.f16657) {
            long jMin = Math.min(c6107.f16677 - i, c61072.f16677 - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (c6107.f16679[i] != c61072.f16679[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == c6107.f16677) {
                c6107 = c6107.f16674;
                c6107.getClass();
                i = c6107.f16678;
            }
            if (i2 == c61072.f16677) {
                c61072 = c61072.f16674;
                c61072.getClass();
                i2 = c61072.f16678;
            }
            j2 += jMin;
        }
        return true;
    }

    public final int hashCode() {
        C6107 c6107 = this.f16658;
        if (c6107 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c6107.f16677;
            for (int i3 = c6107.f16678; i3 < i2; i3++) {
                i = (i * 31) + c6107.f16679[i3];
            }
            c6107 = c6107.f16674;
            c6107.getClass();
        } while (c6107 != this.f16658);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final int read(byte[] bArr, int i, int i2) {
        AbstractC3055.m6628(bArr.length, i, i2);
        C6107 c6107 = this.f16658;
        if (c6107 == null) {
            return -1;
        }
        int iMin = Math.min(i2, c6107.f16677 - c6107.f16678);
        byte[] bArr2 = c6107.f16679;
        int i3 = c6107.f16678;
        AbstractC4346.m8840(bArr2, i, bArr, i3, i3 + iMin);
        int i4 = c6107.f16678 + iMin;
        c6107.f16678 = i4;
        this.f16657 -= (long) iMin;
        if (i4 == c6107.f16677) {
            this.f16658 = c6107.m11507();
            AbstractC6111.m11512(c6107);
        }
        return iMin;
    }

    @Override // p005.InterfaceC6119
    public final byte readByte() throws EOFException {
        if (this.f16657 == 0) {
            throw new EOFException();
        }
        C6107 c6107 = this.f16658;
        c6107.getClass();
        int i = c6107.f16678;
        int i2 = c6107.f16677;
        int i3 = i + 1;
        byte b = c6107.f16679[i];
        this.f16657--;
        if (i3 != i2) {
            c6107.f16678 = i3;
            return b;
        }
        this.f16658 = c6107.m11507();
        AbstractC6111.m11512(c6107);
        return b;
    }

    @Override // p005.InterfaceC6119
    public final int readInt() throws EOFException {
        if (this.f16657 < 4) {
            throw new EOFException();
        }
        C6107 c6107 = this.f16658;
        c6107.getClass();
        int i = c6107.f16678;
        int i2 = c6107.f16677;
        if (i2 - i < 4) {
            return (readByte() & DefaultClassResolver.NAME) | ((readByte() & DefaultClassResolver.NAME) << 24) | ((readByte() & DefaultClassResolver.NAME) << 16) | ((readByte() & DefaultClassResolver.NAME) << 8);
        }
        byte[] bArr = c6107.f16679;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & DefaultClassResolver.NAME) << 16) | ((bArr[i] & DefaultClassResolver.NAME) << 24) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & DefaultClassResolver.NAME) | i4;
        this.f16657 -= 4;
        if (i5 != i2) {
            c6107.f16678 = i5;
            return i6;
        }
        this.f16658 = c6107.m11507();
        AbstractC6111.m11512(c6107);
        return i6;
    }

    @Override // p005.InterfaceC6119
    public final short readShort() throws EOFException {
        if (this.f16657 < 2) {
            throw new EOFException();
        }
        C6107 c6107 = this.f16658;
        c6107.getClass();
        int i = c6107.f16678;
        int i2 = c6107.f16677;
        if (i2 - i < 2) {
            return (short) ((readByte() & DefaultClassResolver.NAME) | ((readByte() & DefaultClassResolver.NAME) << 8));
        }
        byte[] bArr = c6107.f16679;
        int i3 = i + 1;
        int i4 = (bArr[i] & DefaultClassResolver.NAME) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & DefaultClassResolver.NAME) | i4;
        this.f16657 -= 2;
        if (i5 == i2) {
            this.f16658 = c6107.m11507();
            AbstractC6111.m11512(c6107);
        } else {
            c6107.f16678 = i5;
        }
        return (short) i6;
    }

    @Override // p005.InterfaceC6119
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            C6107 c6107 = this.f16658;
            if (c6107 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, c6107.f16677 - c6107.f16678);
            long j2 = iMin;
            this.f16657 -= j2;
            j -= j2;
            int i = c6107.f16678 + iMin;
            c6107.f16678 = i;
            if (i == c6107.f16677) {
                this.f16658 = c6107.m11507();
                AbstractC6111.m11512(c6107);
            }
        }
    }

    public final String toString() {
        long j = this.f16657;
        if (j <= 2147483647L) {
            return m11471((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f16657).toString());
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        AbstractC3055.m6628(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C6107 c6107M11469 = m11469(1);
            int iMin = Math.min(i3 - i, 8192 - c6107M11469.f16677);
            int i4 = i + iMin;
            AbstractC4346.m8840(bArr, c6107M11469.f16677, c6107M11469.f16679, i, i4);
            c6107M11469.f16677 += iMin;
            i = i4;
        }
        this.f16657 += j;
    }

    @Override // p005.InterfaceC6120
    public final /* bridge */ /* synthetic */ InterfaceC6120 writeByte(int i) {
        m11474(i);
        return this;
    }

    @Override // p005.InterfaceC6120
    public final /* bridge */ /* synthetic */ InterfaceC6120 writeInt(int i) {
        m11463(i);
        return this;
    }

    @Override // p005.InterfaceC6120
    public final /* bridge */ /* synthetic */ InterfaceC6120 writeShort(int i) {
        m11465(i);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m11463(int i) {
        C6107 c6107M11469 = m11469(4);
        byte[] bArr = c6107M11469.f16679;
        int i2 = c6107M11469.f16677;
        bArr[i2] = (byte) ((i >>> 24) & Opcodes.CONST_METHOD_TYPE);
        bArr[i2 + 1] = (byte) ((i >>> 16) & Opcodes.CONST_METHOD_TYPE);
        bArr[i2 + 2] = (byte) ((i >>> 8) & Opcodes.CONST_METHOD_TYPE);
        bArr[i2 + 3] = (byte) (i & Opcodes.CONST_METHOD_TYPE);
        c6107M11469.f16677 = i2 + 4;
        this.f16657 += 4;
    }

    @Override // p005.InterfaceC6120
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC6120 mo11464(ByteString byteString) {
        m11476(byteString);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m11465(int i) {
        C6107 c6107M11469 = m11469(2);
        byte[] bArr = c6107M11469.f16679;
        int i2 = c6107M11469.f16677;
        bArr[i2] = (byte) ((i >>> 8) & Opcodes.CONST_METHOD_TYPE);
        bArr[i2 + 1] = (byte) (i & Opcodes.CONST_METHOD_TYPE);
        c6107M11469.f16677 = i2 + 2;
        this.f16657 += 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m11466(long j) {
        if (j == 0) {
            m11474(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        C6107 c6107M11469 = m11469(i);
        byte[] bArr = c6107M11469.f16679;
        int i2 = c6107M11469.f16677;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = AbstractC5571.f15354[(int) (15 & j)];
            j >>>= 4;
        }
        c6107M11469.f16677 += i;
        this.f16657 += (long) i;
    }

    @Override // p005.InterfaceC6119
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final ByteString mo11467() {
        return mo11487(this.f16657);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m11468(long j) {
        boolean z;
        if (j == 0) {
            m11474(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m11498("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = AbstractC5571.f15354;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > AbstractC5571.f15353[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        C6107 c6107M11469 = m11469(i);
        byte[] bArr2 = c6107M11469.f16679;
        int i2 = c6107M11469.f16677 + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = AbstractC5571.f15354[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        c6107M11469.f16677 += i;
        this.f16657 += (long) i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C6107 m11469(int i) {
        if (i < 1 || i > 8192) {
            C5919.m11249("unexpected capacity");
            return null;
        }
        C6107 c6107 = this.f16658;
        if (c6107 == null) {
            C6107 c6107M11511 = AbstractC6111.m11511();
            this.f16658 = c6107M11511;
            c6107M11511.f16680 = c6107M11511;
            c6107M11511.f16674 = c6107M11511;
            return c6107M11511;
        }
        C6107 c61072 = c6107.f16680;
        c61072.getClass();
        if (c61072.f16677 + i <= 8192 && c61072.f16675) {
            return c61072;
        }
        C6107 c6107M115112 = AbstractC6111.m11511();
        c61072.m11506(c6107M115112);
        return c6107M115112;
    }

    @Override // p005.InterfaceC6120
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC6120 mo11470(byte[] bArr, int i) {
        write(bArr, 0, i);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final ByteString m11471(int i) {
        if (i == 0) {
            return ByteString.EMPTY;
        }
        AbstractC3055.m6628(this.f16657, 0L, i);
        C6107 c6107 = this.f16658;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            c6107.getClass();
            int i5 = c6107.f16677;
            int i6 = c6107.f16678;
            if (i5 == i6) {
                C5919.m11243("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            c6107 = c6107.f16674;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        C6107 c61072 = this.f16658;
        int i7 = 0;
        while (i2 < i) {
            c61072.getClass();
            bArr[i7] = c61072.f16679;
            i2 += c61072.f16677 - c61072.f16678;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c61072.f16678;
            c61072.f16676 = true;
            i7++;
            c61072 = c61072.f16674;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // p005.InterfaceC6112
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo10877(C6101 c6101, long j) {
        C6107 c6107M11511;
        c6101.getClass();
        if (c6101 == this) {
            C5919.m11249("source == this");
            return;
        }
        AbstractC3055.m6628(c6101.f16657, 0L, j);
        while (j > 0) {
            C6107 c6107 = c6101.f16658;
            c6107.getClass();
            int i = c6107.f16677;
            C6107 c61072 = c6101.f16658;
            c61072.getClass();
            long j2 = i - c61072.f16678;
            int i2 = 0;
            if (j < j2) {
                C6107 c61073 = this.f16658;
                C6107 c61074 = c61073 != null ? c61073.f16680 : null;
                if (c61074 != null && c61074.f16675) {
                    if ((((long) c61074.f16677) + j) - ((long) (c61074.f16676 ? 0 : c61074.f16678)) <= 8192) {
                        C6107 c61075 = c6101.f16658;
                        c61075.getClass();
                        c61075.m11504(c61074, (int) j);
                        c6101.f16657 -= j;
                        this.f16657 += j;
                        return;
                    }
                }
                C6107 c61076 = c6101.f16658;
                c61076.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > c61076.f16677 - c61076.f16678) {
                    C5919.m11249("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    c6107M11511 = c61076.m11505();
                } else {
                    c6107M11511 = AbstractC6111.m11511();
                    byte[] bArr = c61076.f16679;
                    byte[] bArr2 = c6107M11511.f16679;
                    int i4 = c61076.f16678;
                    AbstractC4346.m8833(bArr, i4, bArr2, i4 + i3, 2);
                }
                c6107M11511.f16677 = c6107M11511.f16678 + i3;
                c61076.f16678 += i3;
                C6107 c61077 = c61076.f16680;
                c61077.getClass();
                c61077.m11506(c6107M11511);
                c6101.f16658 = c6107M11511;
            }
            C6107 c61078 = c6101.f16658;
            c61078.getClass();
            long j3 = c61078.f16677 - c61078.f16678;
            c6101.f16658 = c61078.m11507();
            C6107 c61079 = this.f16658;
            if (c61079 == null) {
                this.f16658 = c61078;
                c61078.f16680 = c61078;
                c61078.f16674 = c61078;
            } else {
                C6107 c610710 = c61079.f16680;
                c610710.getClass();
                c610710.m11506(c61078);
                C6107 c610711 = c61078.f16680;
                if (c610711 == c61078) {
                    C5919.m11250("cannot compact");
                    return;
                }
                c610711.getClass();
                if (c610711.f16675) {
                    int i5 = c61078.f16677 - c61078.f16678;
                    C6107 c610712 = c61078.f16680;
                    c610712.getClass();
                    int i6 = 8192 - c610712.f16677;
                    C6107 c610713 = c61078.f16680;
                    c610713.getClass();
                    if (!c610713.f16676) {
                        C6107 c610714 = c61078.f16680;
                        c610714.getClass();
                        i2 = c610714.f16678;
                    }
                    if (i5 <= i6 + i2) {
                        C6107 c610715 = c61078.f16680;
                        c610715.getClass();
                        c61078.m11504(c610715, i5);
                        c61078.m11507();
                        AbstractC6111.m11512(c61078);
                    }
                }
            }
            c6101.f16657 -= j3;
            this.f16657 += j3;
            j -= j3;
        }
    }

    @Override // p005.InterfaceC6119
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final String mo11472(long j) throws EOFException {
        if (j < 0) {
            C5919.m11253(AbstractC2442.m4572(j, "limit < 0: "));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jM11488 = m11488((byte) 10, 0L, j2);
        if (jM11488 != -1) {
            return AbstractC5571.m10883(this, jM11488);
        }
        if (j2 < this.f16657 && m11492(j2 - 1) == 13 && m11492(j2) == 10) {
            return AbstractC5571.m10883(this, j2);
        }
        C6101 c6101 = new C6101();
        m11491(c6101, 0L, Math.min(32L, this.f16657));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f16657, j) + " content=" + c6101.mo11487(c6101.f16657).hex() + (char) 8230);
    }

    @Override // p005.InterfaceC6119
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final String mo11473(Charset charset) {
        charset.getClass();
        return m11485(this.f16657, charset);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m11474(int i) {
        C6107 c6107M11469 = m11469(1);
        byte[] bArr = c6107M11469.f16679;
        int i2 = c6107M11469.f16677;
        c6107M11469.f16677 = i2 + 1;
        bArr[i2] = (byte) i;
        this.f16657++;
    }

    @Override // p005.InterfaceC6119
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final long mo11475(C6101 c6101) {
        long j = this.f16657;
        if (j > 0) {
            c6101.mo10877(this, j);
        }
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m11476(ByteString byteString) {
        byteString.getClass();
        byteString.write$okio(this, 0, byteString.size());
    }

    @Override // p005.InterfaceC6120
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC6120 mo11477(String str) {
        m11498(str);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long m11478() {
        long j = this.f16657;
        if (j == 0) {
            return 0L;
        }
        C6107 c6107 = this.f16658;
        c6107.getClass();
        C6107 c61072 = c6107.f16680;
        c61072.getClass();
        int i = c61072.f16677;
        return (i >= 8192 || !c61072.f16675) ? j : j - ((long) (i - c61072.f16678));
    }

    @Override // p005.InterfaceC6119
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo11479(long j) {
        return this.f16657 >= Long.MAX_VALUE;
    }

    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6099 mo10875() {
        return C6099.f16653;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C6101 clone() {
        C6101 c6101 = new C6101();
        if (this.f16657 == 0) {
            return c6101;
        }
        C6107 c6107 = this.f16658;
        c6107.getClass();
        C6107 c6107M11505 = c6107.m11505();
        c6101.f16658 = c6107M11505;
        c6107M11505.f16680 = c6107M11505;
        c6107M11505.f16674 = c6107M11505;
        for (C6107 c61072 = c6107.f16674; c61072 != c6107; c61072 = c61072.f16674) {
            C6107 c61073 = c6107M11505.f16680;
            c61073.getClass();
            c61072.getClass();
            c61073.m11506(c61072.m11505());
        }
        c6101.f16657 = this.f16657;
        return c6101;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11481() throws EOFException {
        skip(this.f16657);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean m11483() {
        return this.f16657 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:38:0x00a2 BREAK  A[LOOP:0: B:5:0x000c->B:46:?], SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m11484() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.f16657
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La9
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            飘花落叶言世兰哲苏楪子.飘花落叶言子楪兰世哲苏 r7 = r15.f16658
            r7.getClass()
            byte[] r8 = r7.f16679
            int r9 = r7.f16678
            int r10 = r7.f16677
        L17:
            if (r9 >= r10) goto L8e
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L26
            r12 = 57
            if (r11 > r12) goto L26
            int r12 = r11 + (-48)
            goto L3b
        L26:
            r12 = 97
            if (r11 < r12) goto L31
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L31
            int r12 = r11 + (-87)
            goto L3b
        L31:
            r12 = 65
            if (r11 < r12) goto L66
            r12 = 70
            if (r11 > r12) goto L66
            int r12 = r11 + (-55)
        L3b:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L4b
            r11 = 4
            long r4 = r4 << r11
            long r11 = (long) r12
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L17
        L4b:
            飘花落叶言世兰哲苏楪子.飘花落叶言子楪世兰哲苏 r15 = new 飘花落叶言世兰哲苏楪子.飘花落叶言子楪世兰哲苏
            r15.<init>()
            r15.m11466(r4)
            r15.m11474(r11)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r15 = r15.m11486()
            java.lang.String r1 = "Number too large: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        L66:
            r6 = 1
            if (r1 == 0) goto L6a
            goto L8e
        L6a:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            int r1 = r11 >> 4
            r1 = r1 & 15
            char[] r2 = okio.internal.AbstractC5570.f15352
            char r1 = r2[r1]
            r3 = r11 & 15
            char r2 = r2[r3]
            r3 = 2
            char[] r3 = new char[r3]
            r3[r0] = r1
            r3[r6] = r2
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r15.<init>(r0)
            throw r15
        L8e:
            if (r9 != r10) goto L9a
            飘花落叶言世兰哲苏楪子.飘花落叶言子楪兰世哲苏 r8 = r7.m11507()
            r15.f16658 = r8
            p005.AbstractC6111.m11512(r7)
            goto L9c
        L9a:
            r7.f16678 = r9
        L9c:
            if (r6 != 0) goto La2
            飘花落叶言世兰哲苏楪子.飘花落叶言子楪兰世哲苏 r7 = r15.f16658
            if (r7 != 0) goto Lc
        La2:
            long r2 = r15.f16657
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f16657 = r2
            return r4
        La9:
            java.io.EOFException r15 = new java.io.EOFException
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p005.C6101.m11484():long");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final String m11485(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            C5919.m11253(AbstractC2442.m4572(j, "byteCount: "));
            return null;
        }
        if (this.f16657 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        C6107 c6107 = this.f16658;
        c6107.getClass();
        int i = c6107.f16678;
        if (((long) i) + j > c6107.f16677) {
            return new String(m11489(j), charset);
        }
        int i2 = (int) j;
        String str = new String(c6107.f16679, i, i2, charset);
        int i3 = c6107.f16678 + i2;
        c6107.f16678 = i3;
        this.f16657 -= j;
        if (i3 == c6107.f16677) {
            this.f16658 = c6107.m11507();
            AbstractC6111.m11512(c6107);
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final String m11486() {
        return m11485(this.f16657, AbstractC5131.f14688);
    }

    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final long mo10876(C6101 c6101, long j) {
        c6101.getClass();
        if (j < 0) {
            C5919.m11253(AbstractC2442.m4572(j, "byteCount < 0: "));
            return 0L;
        }
        long j2 = this.f16657;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c6101.mo10877(this, j);
        return j;
    }

    @Override // p005.InterfaceC6119
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final ByteString mo11487(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C5919.m11253(AbstractC2442.m4572(j, "byteCount: "));
            return null;
        }
        if (this.f16657 < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new ByteString(m11489(j));
        }
        ByteString byteStringM11471 = m11471((int) j);
        skip(j);
        return byteStringM11471;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final long m11488(byte b, long j, long j2) {
        C6107 c6107;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.f16657 + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.f16657;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (c6107 = this.f16658) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                c6107 = c6107.f16680;
                c6107.getClass();
                j4 -= (long) (c6107.f16677 - c6107.f16678);
            }
            while (j4 < j2) {
                byte[] bArr = c6107.f16679;
                int iMin = (int) Math.min(c6107.f16677, (((long) c6107.f16678) + j2) - j4);
                for (int i = (int) ((((long) c6107.f16678) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - c6107.f16678)) + j4;
                    }
                }
                j4 += (long) (c6107.f16677 - c6107.f16678);
                c6107 = c6107.f16674;
                c6107.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (c6107.f16677 - c6107.f16678)) + j3;
            if (j5 > j) {
                break;
            }
            c6107 = c6107.f16674;
            c6107.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = c6107.f16679;
            int iMin2 = (int) Math.min(c6107.f16677, (((long) c6107.f16678) + j2) - j3);
            for (int i2 = (int) ((((long) c6107.f16678) + j) - j3); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - c6107.f16678)) + j3;
                }
            }
            j3 += (long) (c6107.f16677 - c6107.f16678);
            c6107 = c6107.f16674;
            c6107.getClass();
            j = j3;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final byte[] m11489(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C5919.m11253(AbstractC2442.m4572(j, "byteCount: "));
            return null;
        }
        if (this.f16657 < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        return bArr;
    }

    @Override // p005.InterfaceC6119
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int mo11490(C6118 c6118) throws EOFException {
        c6118.getClass();
        int iM10882 = AbstractC5571.m10882(this, c6118, false);
        if (iM10882 == -1) {
            return -1;
        }
        skip(c6118.f16702[iM10882].size());
        return iM10882;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m11491(C6101 c6101, long j, long j2) {
        c6101.getClass();
        long j3 = j;
        AbstractC3055.m6628(this.f16657, j3, j2);
        if (j2 == 0) {
            return;
        }
        c6101.f16657 += j2;
        C6107 c6107 = this.f16658;
        while (true) {
            c6107.getClass();
            long j4 = c6107.f16677 - c6107.f16678;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            c6107 = c6107.f16674;
        }
        long j5 = j2;
        while (j5 > 0) {
            c6107.getClass();
            C6107 c6107M11505 = c6107.m11505();
            int i = c6107M11505.f16678 + ((int) j3);
            c6107M11505.f16678 = i;
            c6107M11505.f16677 = Math.min(i + ((int) j5), c6107M11505.f16677);
            C6107 c61072 = c6101.f16658;
            if (c61072 == null) {
                c6107M11505.f16680 = c6107M11505;
                c6107M11505.f16674 = c6107M11505;
                c6101.f16658 = c6107M11505;
            } else {
                C6107 c61073 = c61072.f16680;
                c61073.getClass();
                c61073.m11506(c6107M11505);
            }
            j5 -= (long) (c6107M11505.f16677 - c6107M11505.f16678);
            c6107 = c6107.f16674;
            j3 = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final byte m11492(long j) {
        AbstractC3055.m6628(this.f16657, j, 1L);
        C6107 c6107 = this.f16658;
        c6107.getClass();
        long j2 = this.f16657;
        if (j2 - j < j) {
            while (j2 > j) {
                c6107 = c6107.f16680;
                c6107.getClass();
                j2 -= (long) (c6107.f16677 - c6107.f16678);
            }
            return c6107.f16679[(int) ((((long) c6107.f16678) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = c6107.f16677;
            int i2 = c6107.f16678;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return c6107.f16679[(int) ((((long) i2) + j) - j3)];
            }
            c6107 = c6107.f16674;
            c6107.getClass();
            j3 = j4;
        }
    }

    @Override // p005.InterfaceC6119
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo11493(long j) throws EOFException {
        if (this.f16657 < j) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m11494(int i) {
        if (i < 128) {
            m11474(i);
            return;
        }
        if (i < 2048) {
            C6107 c6107M11469 = m11469(2);
            byte[] bArr = c6107M11469.f16679;
            int i2 = c6107M11469.f16677;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            c6107M11469.f16677 = i2 + 2;
            this.f16657 += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            m11474(63);
            return;
        }
        if (i < 65536) {
            C6107 c6107M114692 = m11469(3);
            byte[] bArr2 = c6107M114692.f16679;
            int i3 = c6107M114692.f16677;
            bArr2[i3] = (byte) ((i >> 12) | Opcodes.SHL_INT_LIT8);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            c6107M114692.f16677 = i3 + 3;
            this.f16657 += 3;
            return;
        }
        if (i > 1114111) {
            C5919.m11249("Unexpected code point: 0x".concat(AbstractC3055.m6627(i)));
            return;
        }
        C6107 c6107M114693 = m11469(4);
        byte[] bArr3 = c6107M114693.f16679;
        int i4 = c6107M114693.f16677;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        c6107M114693.f16677 = i4 + 4;
        this.f16657 += 4;
    }

    @Override // p005.InterfaceC6120
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final long mo11495(InterfaceC6110 interfaceC6110) {
        interfaceC6110.getClass();
        long j = 0;
        while (true) {
            long jMo10876 = interfaceC6110.mo10876(this, 8192L);
            if (jMo10876 == -1) {
                return j;
            }
            j += jMo10876;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void m11496(String str, int i, int i2, Charset charset) {
        str.getClass();
        if (i < 0) {
            C5919.m11253(AbstractC6136.m11556(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            C5919.m11253(AbstractC6136.m11559(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            C5919.m11248(AbstractC0053.m148(i2, "endIndex > string.length: ", " > "), str.length());
        } else {
            if (charset.equals(AbstractC5131.f14688)) {
                m11499(i, i2, str);
                return;
            }
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            bytes.getClass();
            write(bytes, 0, bytes.length);
        }
    }

    @Override // p005.InterfaceC6119
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final InputStream mo11497() {
        return new C6103(this, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m11498(String str) {
        str.getClass();
        m11499(0, str.length(), str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final void m11499(int i, int i2, String str) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            C5919.m11253(AbstractC6136.m11556(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            C5919.m11253(AbstractC6136.m11559(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            C5919.m11248(AbstractC0053.m148(i2, "endIndex > string.length: ", " > "), str.length());
            return;
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C6107 c6107M11469 = m11469(1);
                byte[] bArr = c6107M11469.f16679;
                int i3 = c6107M11469.f16677 - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = c6107M11469.f16677;
                int i6 = (i3 + i) - i5;
                c6107M11469.f16677 = i5 + i6;
                this.f16657 += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    C6107 c6107M114692 = m11469(2);
                    byte[] bArr2 = c6107M114692.f16679;
                    int i7 = c6107M114692.f16677;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c6107M114692.f16677 = i7 + 2;
                    this.f16657 += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C6107 c6107M114693 = m11469(3);
                    byte[] bArr3 = c6107M114693.f16679;
                    int i8 = c6107M114693.f16677;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | Opcodes.SHL_INT_LIT8);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c6107M114693.f16677 = i8 + 3;
                    this.f16657 += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m11474(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C6107 c6107M114694 = m11469(4);
                        byte[] bArr4 = c6107M114694.f16679;
                        int i11 = c6107M114694.f16677;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        c6107M114694.f16677 = i11 + 4;
                        this.f16657 += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p005.InterfaceC6112
    public final void close() {
    }

    @Override // p005.InterfaceC6120, p005.InterfaceC6112, java.io.Flushable
    public final void flush() {
    }

    @Override // p005.InterfaceC6119, p005.InterfaceC6120
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6101 mo11482() {
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C6107 c6107M11469 = m11469(1);
            int iMin = Math.min(i, 8192 - c6107M11469.f16677);
            byteBuffer.get(c6107M11469.f16679, c6107M11469.f16677, iMin);
            i -= iMin;
            c6107M11469.f16677 += iMin;
        }
        this.f16657 += (long) iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        C6107 c6107 = this.f16658;
        if (c6107 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c6107.f16677 - c6107.f16678);
        byteBuffer.put(c6107.f16679, c6107.f16678, iMin);
        int i = c6107.f16678 + iMin;
        c6107.f16678 = i;
        this.f16657 -= (long) iMin;
        if (i == c6107.f16677) {
            this.f16658 = c6107.m11507();
            AbstractC6111.m11512(c6107);
        }
        return iMin;
    }

    @Override // p005.InterfaceC6120
    public final InterfaceC6120 write(byte[] bArr) {
        bArr.getClass();
        write(bArr, 0, bArr.length);
        return this;
    }
}

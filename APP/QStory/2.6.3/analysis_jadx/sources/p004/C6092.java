package p004;

import androidx.activity.AbstractC0053;
import androidx.profileinstaller.AbstractC2442;
import com.android.dx.io.Opcodes;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.collections.AbstractC4347;
import kotlin.text.AbstractC5132;
import okio.ByteString;
import okio.SegmentedByteString;
import okio.internal.AbstractC5572;
import p009.AbstractC6183;
import p175.AbstractC7739;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6092 implements InterfaceC6110, InterfaceC6111, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f16647;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C6098 f16648;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6092)) {
            return false;
        }
        long j = this.f16647;
        C6092 c6092 = (C6092) obj;
        if (j != c6092.f16647) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        C6098 c6098 = this.f16648;
        c6098.getClass();
        C6098 c60982 = c6092.f16648;
        c60982.getClass();
        int i = c6098.f16668;
        int i2 = c60982.f16668;
        long j2 = 0;
        while (j2 < this.f16647) {
            long jMin = Math.min(c6098.f16667 - i, c60982.f16667 - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (c6098.f16669[i] != c60982.f16669[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == c6098.f16667) {
                c6098 = c6098.f16664;
                c6098.getClass();
                i = c6098.f16668;
            }
            if (i2 == c60982.f16667) {
                c60982 = c60982.f16664;
                c60982.getClass();
                i2 = c60982.f16668;
            }
            j2 += jMin;
        }
        return true;
    }

    public final int hashCode() {
        C6098 c6098 = this.f16648;
        if (c6098 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c6098.f16667;
            for (int i3 = c6098.f16668; i3 < i2; i3++) {
                i = (i * 31) + c6098.f16669[i3];
            }
            c6098 = c6098.f16664;
            c6098.getClass();
        } while (c6098 != this.f16648);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final int read(byte[] bArr, int i, int i2) {
        AbstractC7739.m13066(bArr.length, i, i2);
        C6098 c6098 = this.f16648;
        if (c6098 == null) {
            return -1;
        }
        int iMin = Math.min(i2, c6098.f16667 - c6098.f16668);
        byte[] bArr2 = c6098.f16669;
        int i3 = c6098.f16668;
        AbstractC4347.m8844(bArr2, i, bArr, i3, i3 + iMin);
        int i4 = c6098.f16668 + iMin;
        c6098.f16668 = i4;
        this.f16647 -= (long) iMin;
        if (i4 == c6098.f16667) {
            this.f16648 = c6098.m11500();
            AbstractC6102.m11505(c6098);
        }
        return iMin;
    }

    @Override // p004.InterfaceC6110
    public final byte readByte() throws EOFException {
        if (this.f16647 == 0) {
            throw new EOFException();
        }
        C6098 c6098 = this.f16648;
        c6098.getClass();
        int i = c6098.f16668;
        int i2 = c6098.f16667;
        int i3 = i + 1;
        byte b = c6098.f16669[i];
        this.f16647--;
        if (i3 != i2) {
            c6098.f16668 = i3;
            return b;
        }
        this.f16648 = c6098.m11500();
        AbstractC6102.m11505(c6098);
        return b;
    }

    @Override // p004.InterfaceC6110
    public final int readInt() throws EOFException {
        if (this.f16647 < 4) {
            throw new EOFException();
        }
        C6098 c6098 = this.f16648;
        c6098.getClass();
        int i = c6098.f16668;
        int i2 = c6098.f16667;
        if (i2 - i < 4) {
            return (readByte() & DefaultClassResolver.NAME) | ((readByte() & DefaultClassResolver.NAME) << 24) | ((readByte() & DefaultClassResolver.NAME) << 16) | ((readByte() & DefaultClassResolver.NAME) << 8);
        }
        byte[] bArr = c6098.f16669;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & DefaultClassResolver.NAME) << 16) | ((bArr[i] & DefaultClassResolver.NAME) << 24) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & DefaultClassResolver.NAME) | i4;
        this.f16647 -= 4;
        if (i5 != i2) {
            c6098.f16668 = i5;
            return i6;
        }
        this.f16648 = c6098.m11500();
        AbstractC6102.m11505(c6098);
        return i6;
    }

    @Override // p004.InterfaceC6110
    public final short readShort() throws EOFException {
        if (this.f16647 < 2) {
            throw new EOFException();
        }
        C6098 c6098 = this.f16648;
        c6098.getClass();
        int i = c6098.f16668;
        int i2 = c6098.f16667;
        if (i2 - i < 2) {
            return (short) ((readByte() & DefaultClassResolver.NAME) | ((readByte() & DefaultClassResolver.NAME) << 8));
        }
        byte[] bArr = c6098.f16669;
        int i3 = i + 1;
        int i4 = (bArr[i] & DefaultClassResolver.NAME) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & DefaultClassResolver.NAME) | i4;
        this.f16647 -= 2;
        if (i5 == i2) {
            this.f16648 = c6098.m11500();
            AbstractC6102.m11505(c6098);
        } else {
            c6098.f16668 = i5;
        }
        return (short) i6;
    }

    @Override // p004.InterfaceC6110
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            C6098 c6098 = this.f16648;
            if (c6098 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, c6098.f16667 - c6098.f16668);
            long j2 = iMin;
            this.f16647 -= j2;
            j -= j2;
            int i = c6098.f16668 + iMin;
            c6098.f16668 = i;
            if (i == c6098.f16667) {
                this.f16648 = c6098.m11500();
                AbstractC6102.m11505(c6098);
            }
        }
    }

    public final String toString() {
        long j = this.f16647;
        if (j <= 2147483647L) {
            return m11466((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f16647).toString());
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        AbstractC7739.m13066(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C6098 c6098M11464 = m11464(1);
            int iMin = Math.min(i3 - i, 8192 - c6098M11464.f16667);
            int i4 = i + iMin;
            AbstractC4347.m8844(bArr, c6098M11464.f16667, c6098M11464.f16669, i, i4);
            c6098M11464.f16667 += iMin;
            i = i4;
        }
        this.f16647 += j;
    }

    @Override // p004.InterfaceC6111
    public final /* bridge */ /* synthetic */ InterfaceC6111 writeByte(int i) {
        m11470(i);
        return this;
    }

    @Override // p004.InterfaceC6111
    public final /* bridge */ /* synthetic */ InterfaceC6111 writeInt(int i) {
        m11458(i);
        return this;
    }

    @Override // p004.InterfaceC6111
    public final /* bridge */ /* synthetic */ InterfaceC6111 writeShort(int i) {
        m11457(i);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m11456(String str, int i, int i2, Charset charset) {
        str.getClass();
        if (i < 0) {
            C5925.m11314(AbstractC6183.m11588(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            C5925.m11314(AbstractC6183.m11591(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            C5925.m11309(AbstractC0053.m150(i2, "endIndex > string.length: ", " > "), str.length());
        } else {
            if (charset.equals(AbstractC5132.f14688)) {
                m11492(i, i2, str);
                return;
            }
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            bytes.getClass();
            write(bytes, 0, bytes.length);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m11457(int i) {
        C6098 c6098M11464 = m11464(2);
        byte[] bArr = c6098M11464.f16669;
        int i2 = c6098M11464.f16667;
        bArr[i2] = (byte) ((i >>> 8) & Opcodes.CONST_METHOD_TYPE);
        bArr[i2 + 1] = (byte) (i & Opcodes.CONST_METHOD_TYPE);
        c6098M11464.f16667 = i2 + 2;
        this.f16647 += 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m11458(int i) {
        C6098 c6098M11464 = m11464(4);
        byte[] bArr = c6098M11464.f16669;
        int i2 = c6098M11464.f16667;
        bArr[i2] = (byte) ((i >>> 24) & Opcodes.CONST_METHOD_TYPE);
        bArr[i2 + 1] = (byte) ((i >>> 16) & Opcodes.CONST_METHOD_TYPE);
        bArr[i2 + 2] = (byte) ((i >>> 8) & Opcodes.CONST_METHOD_TYPE);
        bArr[i2 + 3] = (byte) (i & Opcodes.CONST_METHOD_TYPE);
        c6098M11464.f16667 = i2 + 4;
        this.f16647 += 4;
    }

    @Override // p004.InterfaceC6111
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC6111 mo11459(ByteString byteString) {
        m11471(byteString);
        return this;
    }

    @Override // p004.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final ByteString mo11460() {
        return mo11481(this.f16647);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m11461(long j) {
        if (j == 0) {
            m11470(48);
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
        C6098 c6098M11464 = m11464(i);
        byte[] bArr = c6098M11464.f16669;
        int i2 = c6098M11464.f16667;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = AbstractC5572.f15354[(int) (15 & j)];
            j >>>= 4;
        }
        c6098M11464.f16667 += i;
        this.f16647 += (long) i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m11462(long j) {
        boolean z;
        if (j == 0) {
            m11470(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m11491("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = AbstractC5572.f15354;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > AbstractC5572.f15353[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        C6098 c6098M11464 = m11464(i);
        byte[] bArr2 = c6098M11464.f16669;
        int i2 = c6098M11464.f16667 + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = AbstractC5572.f15354[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        c6098M11464.f16667 += i;
        this.f16647 += (long) i;
    }

    @Override // p004.InterfaceC6111
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC6111 mo11463(String str) {
        m11491(str);
        return this;
    }

    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo10932(C6092 c6092, long j) {
        c6092.getClass();
        if (j < 0) {
            C5925.m11314(AbstractC2442.m4583(j, "byteCount < 0: "));
            return 0L;
        }
        long j2 = this.f16647;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c6092.mo10935(this, j);
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C6098 m11464(int i) {
        if (i < 1 || i > 8192) {
            C5925.m11310("unexpected capacity");
            return null;
        }
        C6098 c6098 = this.f16648;
        if (c6098 == null) {
            C6098 c6098M11504 = AbstractC6102.m11504();
            this.f16648 = c6098M11504;
            c6098M11504.f16670 = c6098M11504;
            c6098M11504.f16664 = c6098M11504;
            return c6098M11504;
        }
        C6098 c60982 = c6098.f16670;
        c60982.getClass();
        if (c60982.f16667 + i <= 8192 && c60982.f16665) {
            return c60982;
        }
        C6098 c6098M115042 = AbstractC6102.m11504();
        c60982.m11499(c6098M115042);
        return c6098M115042;
    }

    @Override // p004.InterfaceC6111
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC6111 mo11465(byte[] bArr, int i) {
        write(bArr, 0, i);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final ByteString m11466(int i) {
        if (i == 0) {
            return ByteString.EMPTY;
        }
        AbstractC7739.m13066(this.f16647, 0L, i);
        C6098 c6098 = this.f16648;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            c6098.getClass();
            int i5 = c6098.f16667;
            int i6 = c6098.f16668;
            if (i5 == i6) {
                C5925.m11304("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            c6098 = c6098.f16664;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        C6098 c60982 = this.f16648;
        int i7 = 0;
        while (i2 < i) {
            c60982.getClass();
            bArr[i7] = c60982.f16669;
            i2 += c60982.f16667 - c60982.f16668;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c60982.f16668;
            c60982.f16666 = true;
            i7++;
            c60982 = c60982.f16664;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // p004.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final int mo11467(C6109 c6109) throws EOFException {
        c6109.getClass();
        int iM10939 = AbstractC5572.m10939(this, c6109, false);
        if (iM10939 == -1) {
            return -1;
        }
        skip(c6109.f16692[iM10939].size());
        return iM10939;
    }

    @Override // p004.InterfaceC6111
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final long mo11468(InterfaceC6101 interfaceC6101) {
        interfaceC6101.getClass();
        long j = 0;
        while (true) {
            long jMo10932 = interfaceC6101.mo10932(this, 8192L);
            if (jMo10932 == -1) {
                return j;
            }
            j += jMo10932;
        }
    }

    @Override // p004.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final String mo11469(Charset charset) {
        charset.getClass();
        return m11477(this.f16647, charset);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m11470(int i) {
        C6098 c6098M11464 = m11464(1);
        byte[] bArr = c6098M11464.f16669;
        int i2 = c6098M11464.f16667;
        c6098M11464.f16667 = i2 + 1;
        bArr[i2] = (byte) i;
        this.f16647++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void m11471(ByteString byteString) {
        byteString.getClass();
        byteString.write$okio(this, 0, byteString.size());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long m11472() {
        long j = this.f16647;
        if (j == 0) {
            return 0L;
        }
        C6098 c6098 = this.f16648;
        c6098.getClass();
        C6098 c60982 = c6098.f16670;
        c60982.getClass();
        int i = c60982.f16667;
        return (i >= 8192 || !c60982.f16665) ? j : j - ((long) (i - c60982.f16668));
    }

    @Override // p004.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo11473(long j) {
        return this.f16647 >= Long.MAX_VALUE;
    }

    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6090 mo10933() {
        return C6090.f16643;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C6092 clone() {
        C6092 c6092 = new C6092();
        if (this.f16647 == 0) {
            return c6092;
        }
        C6098 c6098 = this.f16648;
        c6098.getClass();
        C6098 c6098M11498 = c6098.m11498();
        c6092.f16648 = c6098M11498;
        c6098M11498.f16670 = c6098M11498;
        c6098M11498.f16664 = c6098M11498;
        for (C6098 c60982 = c6098.f16664; c60982 != c6098; c60982 = c60982.f16664) {
            C6098 c60983 = c6098M11498.f16670;
            c60983.getClass();
            c60982.getClass();
            c60983.m11499(c60982.m11498());
        }
        c6092.f16647 = this.f16647;
        return c6092;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11475() throws EOFException {
        skip(this.f16647);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String m11477(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            C5925.m11314(AbstractC2442.m4583(j, "byteCount: "));
            return null;
        }
        if (this.f16647 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        C6098 c6098 = this.f16648;
        c6098.getClass();
        int i = c6098.f16668;
        if (((long) i) + j > c6098.f16667) {
            return new String(m11484(j), charset);
        }
        int i2 = (int) j;
        String str = new String(c6098.f16669, i, i2, charset);
        int i3 = c6098.f16668 + i2;
        c6098.f16668 = i3;
        this.f16647 -= j;
        if (i3 == c6098.f16667) {
            this.f16648 = c6098.m11500();
            AbstractC6102.m11505(c6098);
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean m11478() {
        return this.f16647 == 0;
    }

    @Override // p004.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final String mo11479(long j) throws EOFException {
        if (j < 0) {
            C5925.m11314(AbstractC2442.m4583(j, "limit < 0: "));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jM11482 = m11482((byte) 10, 0L, j2);
        if (jM11482 != -1) {
            return AbstractC5572.m10940(this, jM11482);
        }
        if (j2 < this.f16647 && m11486(j2 - 1) == 13 && m11486(j2) == 10) {
            return AbstractC5572.m10940(this, j2);
        }
        C6092 c6092 = new C6092();
        m11485(c6092, 0L, Math.min(32L, this.f16647));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f16647, j) + " content=" + c6092.mo11481(c6092.f16647).hex() + (char) 8230);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final String m11480() {
        return m11477(this.f16647, AbstractC5132.f14688);
    }

    @Override // p004.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final ByteString mo11481(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C5925.m11314(AbstractC2442.m4583(j, "byteCount: "));
            return null;
        }
        if (this.f16647 < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new ByteString(m11484(j));
        }
        ByteString byteStringM11466 = m11466((int) j);
        skip(j);
        return byteStringM11466;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final long m11482(byte b, long j, long j2) {
        C6098 c6098;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.f16647 + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.f16647;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (c6098 = this.f16648) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                c6098 = c6098.f16670;
                c6098.getClass();
                j4 -= (long) (c6098.f16667 - c6098.f16668);
            }
            while (j4 < j2) {
                byte[] bArr = c6098.f16669;
                int iMin = (int) Math.min(c6098.f16667, (((long) c6098.f16668) + j2) - j4);
                for (int i = (int) ((((long) c6098.f16668) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - c6098.f16668)) + j4;
                    }
                }
                j4 += (long) (c6098.f16667 - c6098.f16668);
                c6098 = c6098.f16664;
                c6098.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (c6098.f16667 - c6098.f16668)) + j3;
            if (j5 > j) {
                break;
            }
            c6098 = c6098.f16664;
            c6098.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = c6098.f16669;
            int iMin2 = (int) Math.min(c6098.f16667, (((long) c6098.f16668) + j2) - j3);
            for (int i2 = (int) ((((long) c6098.f16668) + j) - j3); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - c6098.f16668)) + j3;
                }
            }
            j3 += (long) (c6098.f16667 - c6098.f16668);
            c6098 = c6098.f16664;
            c6098.getClass();
            j = j3;
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:38:0x00a2 BREAK  A[LOOP:0: B:5:0x000c->B:46:?], SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m11483() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.f16647
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La9
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            飘花落叶言世兰哲苏子楪.飘花落叶言子楪兰世哲苏 r7 = r15.f16648
            r7.getClass()
            byte[] r8 = r7.f16669
            int r9 = r7.f16668
            int r10 = r7.f16667
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
            飘花落叶言世兰哲苏子楪.飘花落叶言子楪世兰哲苏 r15 = new 飘花落叶言世兰哲苏子楪.飘花落叶言子楪世兰哲苏
            r15.<init>()
            r15.m11461(r4)
            r15.m11470(r11)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r15 = r15.m11480()
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
            char[] r2 = okio.internal.AbstractC5571.f15352
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
            飘花落叶言世兰哲苏子楪.飘花落叶言子楪兰世哲苏 r8 = r7.m11500()
            r15.f16648 = r8
            p004.AbstractC6102.m11505(r7)
            goto L9c
        L9a:
            r7.f16668 = r9
        L9c:
            if (r6 != 0) goto La2
            飘花落叶言世兰哲苏子楪.飘花落叶言子楪兰世哲苏 r7 = r15.f16648
            if (r7 != 0) goto Lc
        La2:
            long r2 = r15.f16647
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f16647 = r2
            return r4
        La9:
            java.io.EOFException r15 = new java.io.EOFException
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p004.C6092.m11483():long");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final byte[] m11484(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C5925.m11314(AbstractC2442.m4583(j, "byteCount: "));
            return null;
        }
        if (this.f16647 < j) {
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

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m11485(C6092 c6092, long j, long j2) {
        c6092.getClass();
        long j3 = j;
        AbstractC7739.m13066(this.f16647, j3, j2);
        if (j2 == 0) {
            return;
        }
        c6092.f16647 += j2;
        C6098 c6098 = this.f16648;
        while (true) {
            c6098.getClass();
            long j4 = c6098.f16667 - c6098.f16668;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            c6098 = c6098.f16664;
        }
        long j5 = j2;
        while (j5 > 0) {
            c6098.getClass();
            C6098 c6098M11498 = c6098.m11498();
            int i = c6098M11498.f16668 + ((int) j3);
            c6098M11498.f16668 = i;
            c6098M11498.f16667 = Math.min(i + ((int) j5), c6098M11498.f16667);
            C6098 c60982 = c6092.f16648;
            if (c60982 == null) {
                c6098M11498.f16670 = c6098M11498;
                c6098M11498.f16664 = c6098M11498;
                c6092.f16648 = c6098M11498;
            } else {
                C6098 c60983 = c60982.f16670;
                c60983.getClass();
                c60983.m11499(c6098M11498);
            }
            j5 -= (long) (c6098M11498.f16667 - c6098M11498.f16668);
            c6098 = c6098.f16664;
            j3 = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final byte m11486(long j) {
        AbstractC7739.m13066(this.f16647, j, 1L);
        C6098 c6098 = this.f16648;
        c6098.getClass();
        long j2 = this.f16647;
        if (j2 - j < j) {
            while (j2 > j) {
                c6098 = c6098.f16670;
                c6098.getClass();
                j2 -= (long) (c6098.f16667 - c6098.f16668);
            }
            return c6098.f16669[(int) ((((long) c6098.f16668) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = c6098.f16667;
            int i2 = c6098.f16668;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return c6098.f16669[(int) ((((long) i2) + j) - j3)];
            }
            c6098 = c6098.f16664;
            c6098.getClass();
            j3 = j4;
        }
    }

    @Override // p004.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo11487(long j) throws EOFException {
        if (this.f16647 < j) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m11488(int i) {
        if (i < 128) {
            m11470(i);
            return;
        }
        if (i < 2048) {
            C6098 c6098M11464 = m11464(2);
            byte[] bArr = c6098M11464.f16669;
            int i2 = c6098M11464.f16667;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            c6098M11464.f16667 = i2 + 2;
            this.f16647 += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            m11470(63);
            return;
        }
        if (i < 65536) {
            C6098 c6098M114642 = m11464(3);
            byte[] bArr2 = c6098M114642.f16669;
            int i3 = c6098M114642.f16667;
            bArr2[i3] = (byte) ((i >> 12) | Opcodes.SHL_INT_LIT8);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            c6098M114642.f16667 = i3 + 3;
            this.f16647 += 3;
            return;
        }
        if (i > 1114111) {
            C5925.m11310("Unexpected code point: 0x".concat(AbstractC7739.m13050(i)));
            return;
        }
        C6098 c6098M114643 = m11464(4);
        byte[] bArr3 = c6098M114643.f16669;
        int i4 = c6098M114643.f16667;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        c6098M114643.f16667 = i4 + 4;
        this.f16647 += 4;
    }

    @Override // p004.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final long mo11489(C6092 c6092) {
        long j = this.f16647;
        if (j > 0) {
            c6092.mo10935(this, j);
        }
        return j;
    }

    @Override // p004.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final InputStream mo11490() {
        return new C6094(this, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m11491(String str) {
        str.getClass();
        m11492(0, str.length(), str);
    }

    @Override // p004.InterfaceC6103
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo10935(C6092 c6092, long j) {
        C6098 c6098M11504;
        c6092.getClass();
        if (c6092 == this) {
            C5925.m11310("source == this");
            return;
        }
        AbstractC7739.m13066(c6092.f16647, 0L, j);
        while (j > 0) {
            C6098 c6098 = c6092.f16648;
            c6098.getClass();
            int i = c6098.f16667;
            C6098 c60982 = c6092.f16648;
            c60982.getClass();
            long j2 = i - c60982.f16668;
            int i2 = 0;
            if (j < j2) {
                C6098 c60983 = this.f16648;
                C6098 c60984 = c60983 != null ? c60983.f16670 : null;
                if (c60984 != null && c60984.f16665) {
                    if ((((long) c60984.f16667) + j) - ((long) (c60984.f16666 ? 0 : c60984.f16668)) <= 8192) {
                        C6098 c60985 = c6092.f16648;
                        c60985.getClass();
                        c60985.m11497(c60984, (int) j);
                        c6092.f16647 -= j;
                        this.f16647 += j;
                        return;
                    }
                }
                C6098 c60986 = c6092.f16648;
                c60986.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > c60986.f16667 - c60986.f16668) {
                    C5925.m11310("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    c6098M11504 = c60986.m11498();
                } else {
                    c6098M11504 = AbstractC6102.m11504();
                    byte[] bArr = c60986.f16669;
                    byte[] bArr2 = c6098M11504.f16669;
                    int i4 = c60986.f16668;
                    AbstractC4347.m8839(bArr, i4, bArr2, i4 + i3, 2);
                }
                c6098M11504.f16667 = c6098M11504.f16668 + i3;
                c60986.f16668 += i3;
                C6098 c60987 = c60986.f16670;
                c60987.getClass();
                c60987.m11499(c6098M11504);
                c6092.f16648 = c6098M11504;
            }
            C6098 c60988 = c6092.f16648;
            c60988.getClass();
            long j3 = c60988.f16667 - c60988.f16668;
            c6092.f16648 = c60988.m11500();
            C6098 c60989 = this.f16648;
            if (c60989 == null) {
                this.f16648 = c60988;
                c60988.f16670 = c60988;
                c60988.f16664 = c60988;
            } else {
                C6098 c609810 = c60989.f16670;
                c609810.getClass();
                c609810.m11499(c60988);
                C6098 c609811 = c60988.f16670;
                if (c609811 == c60988) {
                    C5925.m11311("cannot compact");
                    return;
                }
                c609811.getClass();
                if (c609811.f16665) {
                    int i5 = c60988.f16667 - c60988.f16668;
                    C6098 c609812 = c60988.f16670;
                    c609812.getClass();
                    int i6 = 8192 - c609812.f16667;
                    C6098 c609813 = c60988.f16670;
                    c609813.getClass();
                    if (!c609813.f16666) {
                        C6098 c609814 = c60988.f16670;
                        c609814.getClass();
                        i2 = c609814.f16668;
                    }
                    if (i5 <= i6 + i2) {
                        C6098 c609815 = c60988.f16670;
                        c609815.getClass();
                        c60988.m11497(c609815, i5);
                        c60988.m11500();
                        AbstractC6102.m11505(c60988);
                    }
                }
            }
            c6092.f16647 -= j3;
            this.f16647 += j3;
            j -= j3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final void m11492(int i, int i2, String str) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            C5925.m11314(AbstractC6183.m11588(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            C5925.m11314(AbstractC6183.m11591(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            C5925.m11309(AbstractC0053.m150(i2, "endIndex > string.length: ", " > "), str.length());
            return;
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C6098 c6098M11464 = m11464(1);
                byte[] bArr = c6098M11464.f16669;
                int i3 = c6098M11464.f16667 - i;
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
                int i5 = c6098M11464.f16667;
                int i6 = (i3 + i) - i5;
                c6098M11464.f16667 = i5 + i6;
                this.f16647 += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    C6098 c6098M114642 = m11464(2);
                    byte[] bArr2 = c6098M114642.f16669;
                    int i7 = c6098M114642.f16667;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c6098M114642.f16667 = i7 + 2;
                    this.f16647 += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C6098 c6098M114643 = m11464(3);
                    byte[] bArr3 = c6098M114643.f16669;
                    int i8 = c6098M114643.f16667;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | Opcodes.SHL_INT_LIT8);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c6098M114643.f16667 = i8 + 3;
                    this.f16647 += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m11470(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C6098 c6098M114644 = m11464(4);
                        byte[] bArr4 = c6098M114644.f16669;
                        int i11 = c6098M114644.f16667;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        c6098M114644.f16667 = i11 + 4;
                        this.f16647 += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p004.InterfaceC6103
    public final void close() {
    }

    @Override // p004.InterfaceC6111, p004.InterfaceC6103, java.io.Flushable
    public final void flush() {
    }

    @Override // p004.InterfaceC6110, p004.InterfaceC6111
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6092 mo11476() {
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C6098 c6098M11464 = m11464(1);
            int iMin = Math.min(i, 8192 - c6098M11464.f16667);
            byteBuffer.get(c6098M11464.f16669, c6098M11464.f16667, iMin);
            i -= iMin;
            c6098M11464.f16667 += iMin;
        }
        this.f16647 += (long) iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        C6098 c6098 = this.f16648;
        if (c6098 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c6098.f16667 - c6098.f16668);
        byteBuffer.put(c6098.f16669, c6098.f16668, iMin);
        int i = c6098.f16668 + iMin;
        c6098.f16668 = i;
        this.f16647 -= (long) iMin;
        if (i == c6098.f16667) {
            this.f16648 = c6098.m11500();
            AbstractC6102.m11505(c6098);
        }
        return iMin;
    }

    @Override // p004.InterfaceC6111
    public final InterfaceC6111 write(byte[] bArr) {
        bArr.getClass();
        write(bArr, 0, bArr.length);
        return this;
    }
}

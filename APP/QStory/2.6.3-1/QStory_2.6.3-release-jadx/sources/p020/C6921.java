package p020;

import androidx.activity.AbstractC0900;
import androidx.profileinstaller.AbstractC3275;
import com.android.p002dx.p005io.Opcodes;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.collections.AbstractC5179;
import kotlin.text.AbstractC5964;
import okio.ByteString;
import okio.SegmentedByteString;
import okio.internal.AbstractC6401;
import okio.internal.AbstractC6402;
import p025.AbstractC7012;
import p191.AbstractC8568;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6921 implements InterfaceC6939, InterfaceC6940, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f16992;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C6927 f16993;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6921)) {
            return false;
        }
        long j = this.f16992;
        C6921 c6921 = (C6921) obj;
        if (j != c6921.f16992) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        C6927 c6927 = this.f16993;
        c6927.getClass();
        C6927 c69272 = c6921.f16993;
        c69272.getClass();
        int i = c6927.f17013;
        int i2 = c69272.f17013;
        long j2 = 0;
        while (j2 < this.f16992) {
            long jMin = Math.min(c6927.f17012 - i, c69272.f17012 - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (c6927.f17014[i] != c69272.f17014[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == c6927.f17012) {
                c6927 = c6927.f17009;
                c6927.getClass();
                i = c6927.f17013;
            }
            if (i2 == c69272.f17012) {
                c69272 = c69272.f17009;
                c69272.getClass();
                i2 = c69272.f17013;
            }
            j2 += jMin;
        }
        return true;
    }

    public final int hashCode() {
        C6927 c6927 = this.f16993;
        if (c6927 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c6927.f17012;
            for (int i3 = c6927.f17013; i3 < i2; i3++) {
                i = (i * 31) + c6927.f17014[i3];
            }
            c6927 = c6927.f17009;
            c6927.getClass();
        } while (c6927 != this.f16993);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final int read(byte[] bArr, int i, int i2) {
        AbstractC8568.m13625(bArr.length, i, i2);
        C6927 c6927 = this.f16993;
        if (c6927 == null) {
            return -1;
        }
        int iMin = Math.min(i2, c6927.f17012 - c6927.f17013);
        byte[] bArr2 = c6927.f17014;
        int i3 = c6927.f17013;
        AbstractC5179.m9403(bArr2, i, bArr, i3, i3 + iMin);
        int i4 = c6927.f17013 + iMin;
        c6927.f17013 = i4;
        this.f16992 -= (long) iMin;
        if (i4 == c6927.f17012) {
            this.f16993 = c6927.m12059();
            AbstractC6931.m12064(c6927);
        }
        return iMin;
    }

    @Override // p020.InterfaceC6939
    public final byte readByte() throws EOFException {
        if (this.f16992 == 0) {
            throw new EOFException();
        }
        C6927 c6927 = this.f16993;
        c6927.getClass();
        int i = c6927.f17013;
        int i2 = c6927.f17012;
        int i3 = i + 1;
        byte b = c6927.f17014[i];
        this.f16992--;
        if (i3 != i2) {
            c6927.f17013 = i3;
            return b;
        }
        this.f16993 = c6927.m12059();
        AbstractC6931.m12064(c6927);
        return b;
    }

    @Override // p020.InterfaceC6939
    public final int readInt() throws EOFException {
        if (this.f16992 < 4) {
            throw new EOFException();
        }
        C6927 c6927 = this.f16993;
        c6927.getClass();
        int i = c6927.f17013;
        int i2 = c6927.f17012;
        if (i2 - i < 4) {
            return (readByte() & DefaultClassResolver.NAME) | ((readByte() & DefaultClassResolver.NAME) << 24) | ((readByte() & DefaultClassResolver.NAME) << 16) | ((readByte() & DefaultClassResolver.NAME) << 8);
        }
        byte[] bArr = c6927.f17014;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & DefaultClassResolver.NAME) << 16) | ((bArr[i] & DefaultClassResolver.NAME) << 24) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & DefaultClassResolver.NAME) | i4;
        this.f16992 -= 4;
        if (i5 != i2) {
            c6927.f17013 = i5;
            return i6;
        }
        this.f16993 = c6927.m12059();
        AbstractC6931.m12064(c6927);
        return i6;
    }

    @Override // p020.InterfaceC6939
    public final short readShort() throws EOFException {
        if (this.f16992 < 2) {
            throw new EOFException();
        }
        C6927 c6927 = this.f16993;
        c6927.getClass();
        int i = c6927.f17013;
        int i2 = c6927.f17012;
        if (i2 - i < 2) {
            return (short) ((readByte() & DefaultClassResolver.NAME) | ((readByte() & DefaultClassResolver.NAME) << 8));
        }
        byte[] bArr = c6927.f17014;
        int i3 = i + 1;
        int i4 = (bArr[i] & DefaultClassResolver.NAME) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & DefaultClassResolver.NAME) | i4;
        this.f16992 -= 2;
        if (i5 == i2) {
            this.f16993 = c6927.m12059();
            AbstractC6931.m12064(c6927);
        } else {
            c6927.f17013 = i5;
        }
        return (short) i6;
    }

    @Override // p020.InterfaceC6939
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            C6927 c6927 = this.f16993;
            if (c6927 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, c6927.f17012 - c6927.f17013);
            long j2 = iMin;
            this.f16992 -= j2;
            j -= j2;
            int i = c6927.f17013 + iMin;
            c6927.f17013 = i;
            if (i == c6927.f17012) {
                this.f16993 = c6927.m12059();
                AbstractC6931.m12064(c6927);
            }
        }
    }

    public final String toString() {
        long j = this.f16992;
        if (j <= 2147483647L) {
            return m12025((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f16992).toString());
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        AbstractC8568.m13625(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C6927 c6927M12023 = m12023(1);
            int iMin = Math.min(i3 - i, 8192 - c6927M12023.f17012);
            int i4 = i + iMin;
            AbstractC5179.m9403(bArr, c6927M12023.f17012, c6927M12023.f17014, i, i4);
            c6927M12023.f17012 += iMin;
            i = i4;
        }
        this.f16992 += j;
    }

    @Override // p020.InterfaceC6940
    public final /* bridge */ /* synthetic */ InterfaceC6940 writeByte(int i) {
        m12029(i);
        return this;
    }

    @Override // p020.InterfaceC6940
    public final /* bridge */ /* synthetic */ InterfaceC6940 writeInt(int i) {
        m12017(i);
        return this;
    }

    @Override // p020.InterfaceC6940
    public final /* bridge */ /* synthetic */ InterfaceC6940 writeShort(int i) {
        m12016(i);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m12015(String str, int i, int i2, Charset charset) {
        str.getClass();
        if (i < 0) {
            C6755.m11873(AbstractC7012.m12147(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            C6755.m11873(AbstractC7012.m12150(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            C6755.m11868(AbstractC0900.m710(i2, "endIndex > string.length: ", " > "), str.length());
        } else {
            if (charset.equals(AbstractC5964.f15033)) {
                m12051(i, i2, str);
                return;
            }
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            bytes.getClass();
            write(bytes, 0, bytes.length);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m12016(int i) {
        C6927 c6927M12023 = m12023(2);
        byte[] bArr = c6927M12023.f17014;
        int i2 = c6927M12023.f17012;
        bArr[i2] = (byte) ((i >>> 8) & Opcodes.CONST_METHOD_TYPE);
        bArr[i2 + 1] = (byte) (i & Opcodes.CONST_METHOD_TYPE);
        c6927M12023.f17012 = i2 + 2;
        this.f16992 += 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m12017(int i) {
        C6927 c6927M12023 = m12023(4);
        byte[] bArr = c6927M12023.f17014;
        int i2 = c6927M12023.f17012;
        bArr[i2] = (byte) ((i >>> 24) & Opcodes.CONST_METHOD_TYPE);
        bArr[i2 + 1] = (byte) ((i >>> 16) & Opcodes.CONST_METHOD_TYPE);
        bArr[i2 + 2] = (byte) ((i >>> 8) & Opcodes.CONST_METHOD_TYPE);
        bArr[i2 + 3] = (byte) (i & Opcodes.CONST_METHOD_TYPE);
        c6927M12023.f17012 = i2 + 4;
        this.f16992 += 4;
    }

    @Override // p020.InterfaceC6940
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC6940 mo12018(ByteString byteString) {
        m12030(byteString);
        return this;
    }

    @Override // p020.InterfaceC6939
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final ByteString mo12019() {
        return mo12040(this.f16992);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m12020(long j) {
        if (j == 0) {
            m12029(48);
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
        C6927 c6927M12023 = m12023(i);
        byte[] bArr = c6927M12023.f17014;
        int i2 = c6927M12023.f17012;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = AbstractC6402.f15699[(int) (15 & j)];
            j >>>= 4;
        }
        c6927M12023.f17012 += i;
        this.f16992 += (long) i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m12021(long j) {
        boolean z;
        if (j == 0) {
            m12029(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m12050("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = AbstractC6402.f15699;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > AbstractC6402.f15698[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        C6927 c6927M12023 = m12023(i);
        byte[] bArr2 = c6927M12023.f17014;
        int i2 = c6927M12023.f17012 + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = AbstractC6402.f15699[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        c6927M12023.f17012 += i;
        this.f16992 += (long) i;
    }

    @Override // p020.InterfaceC6940
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC6940 mo12022(String str) {
        m12050(str);
        return this;
    }

    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo11491(C6921 c6921, long j) {
        c6921.getClass();
        if (j < 0) {
            C6755.m11873(AbstractC3275.m5143(j, "byteCount < 0: "));
            return 0L;
        }
        long j2 = this.f16992;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c6921.mo11494(this, j);
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C6927 m12023(int i) {
        if (i < 1 || i > 8192) {
            C6755.m11869("unexpected capacity");
            return null;
        }
        C6927 c6927 = this.f16993;
        if (c6927 == null) {
            C6927 c6927M12063 = AbstractC6931.m12063();
            this.f16993 = c6927M12063;
            c6927M12063.f17015 = c6927M12063;
            c6927M12063.f17009 = c6927M12063;
            return c6927M12063;
        }
        C6927 c69272 = c6927.f17015;
        c69272.getClass();
        if (c69272.f17012 + i <= 8192 && c69272.f17010) {
            return c69272;
        }
        C6927 c6927M120632 = AbstractC6931.m12063();
        c69272.m12058(c6927M120632);
        return c6927M120632;
    }

    @Override // p020.InterfaceC6940
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC6940 mo12024(byte[] bArr, int i) {
        write(bArr, 0, i);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final ByteString m12025(int i) {
        if (i == 0) {
            return ByteString.EMPTY;
        }
        AbstractC8568.m13625(this.f16992, 0L, i);
        C6927 c6927 = this.f16993;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            c6927.getClass();
            int i5 = c6927.f17012;
            int i6 = c6927.f17013;
            if (i5 == i6) {
                C6755.m11863("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            c6927 = c6927.f17009;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        C6927 c69272 = this.f16993;
        int i7 = 0;
        while (i2 < i) {
            c69272.getClass();
            bArr[i7] = c69272.f17014;
            i2 += c69272.f17012 - c69272.f17013;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c69272.f17013;
            c69272.f17011 = true;
            i7++;
            c69272 = c69272.f17009;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // p020.InterfaceC6939
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final int mo12026(C6938 c6938) throws EOFException {
        c6938.getClass();
        int iM11498 = AbstractC6402.m11498(this, c6938, false);
        if (iM11498 == -1) {
            return -1;
        }
        skip(c6938.f17037[iM11498].size());
        return iM11498;
    }

    @Override // p020.InterfaceC6940
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final long mo12027(InterfaceC6930 interfaceC6930) {
        interfaceC6930.getClass();
        long j = 0;
        while (true) {
            long jMo11491 = interfaceC6930.mo11491(this, 8192L);
            if (jMo11491 == -1) {
                return j;
            }
            j += jMo11491;
        }
    }

    @Override // p020.InterfaceC6939
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final String mo12028(Charset charset) {
        charset.getClass();
        return m12036(this.f16992, charset);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m12029(int i) {
        C6927 c6927M12023 = m12023(1);
        byte[] bArr = c6927M12023.f17014;
        int i2 = c6927M12023.f17012;
        c6927M12023.f17012 = i2 + 1;
        bArr[i2] = (byte) i;
        this.f16992++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void m12030(ByteString byteString) {
        byteString.getClass();
        byteString.write$okio(this, 0, byteString.size());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long m12031() {
        long j = this.f16992;
        if (j == 0) {
            return 0L;
        }
        C6927 c6927 = this.f16993;
        c6927.getClass();
        C6927 c69272 = c6927.f17015;
        c69272.getClass();
        int i = c69272.f17012;
        return (i >= 8192 || !c69272.f17010) ? j : j - ((long) (i - c69272.f17013));
    }

    @Override // p020.InterfaceC6939
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo12032(long j) {
        return this.f16992 >= Long.MAX_VALUE;
    }

    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6919 mo11492() {
        return C6919.f16988;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C6921 clone() {
        C6921 c6921 = new C6921();
        if (this.f16992 == 0) {
            return c6921;
        }
        C6927 c6927 = this.f16993;
        c6927.getClass();
        C6927 c6927M12057 = c6927.m12057();
        c6921.f16993 = c6927M12057;
        c6927M12057.f17015 = c6927M12057;
        c6927M12057.f17009 = c6927M12057;
        for (C6927 c69272 = c6927.f17009; c69272 != c6927; c69272 = c69272.f17009) {
            C6927 c69273 = c6927M12057.f17015;
            c69273.getClass();
            c69272.getClass();
            c69273.m12058(c69272.m12057());
        }
        c6921.f16992 = this.f16992;
        return c6921;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12034() throws EOFException {
        skip(this.f16992);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String m12036(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            C6755.m11873(AbstractC3275.m5143(j, "byteCount: "));
            return null;
        }
        if (this.f16992 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        C6927 c6927 = this.f16993;
        c6927.getClass();
        int i = c6927.f17013;
        if (((long) i) + j > c6927.f17012) {
            return new String(m12043(j), charset);
        }
        int i2 = (int) j;
        String str = new String(c6927.f17014, i, i2, charset);
        int i3 = c6927.f17013 + i2;
        c6927.f17013 = i3;
        this.f16992 -= j;
        if (i3 == c6927.f17012) {
            this.f16993 = c6927.m12059();
            AbstractC6931.m12064(c6927);
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean m12037() {
        return this.f16992 == 0;
    }

    @Override // p020.InterfaceC6939
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final String mo12038(long j) throws EOFException {
        if (j < 0) {
            C6755.m11873(AbstractC3275.m5143(j, "limit < 0: "));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jM12041 = m12041((byte) 10, 0L, j2);
        if (jM12041 != -1) {
            return AbstractC6402.m11499(this, jM12041);
        }
        if (j2 < this.f16992 && m12045(j2 - 1) == 13 && m12045(j2) == 10) {
            return AbstractC6402.m11499(this, j2);
        }
        C6921 c6921 = new C6921();
        m12044(c6921, 0L, Math.min(32L, this.f16992));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f16992, j) + " content=" + c6921.mo12040(c6921.f16992).hex() + (char) 8230);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final String m12039() {
        return m12036(this.f16992, AbstractC5964.f15033);
    }

    @Override // p020.InterfaceC6939
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final ByteString mo12040(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C6755.m11873(AbstractC3275.m5143(j, "byteCount: "));
            return null;
        }
        if (this.f16992 < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new ByteString(m12043(j));
        }
        ByteString byteStringM12025 = m12025((int) j);
        skip(j);
        return byteStringM12025;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final long m12041(byte b, long j, long j2) {
        C6927 c6927;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.f16992 + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.f16992;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (c6927 = this.f16993) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                c6927 = c6927.f17015;
                c6927.getClass();
                j4 -= (long) (c6927.f17012 - c6927.f17013);
            }
            while (j4 < j2) {
                byte[] bArr = c6927.f17014;
                int iMin = (int) Math.min(c6927.f17012, (((long) c6927.f17013) + j2) - j4);
                for (int i = (int) ((((long) c6927.f17013) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - c6927.f17013)) + j4;
                    }
                }
                j4 += (long) (c6927.f17012 - c6927.f17013);
                c6927 = c6927.f17009;
                c6927.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (c6927.f17012 - c6927.f17013)) + j3;
            if (j5 > j) {
                break;
            }
            c6927 = c6927.f17009;
            c6927.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = c6927.f17014;
            int iMin2 = (int) Math.min(c6927.f17012, (((long) c6927.f17013) + j2) - j3);
            for (int i2 = (int) ((((long) c6927.f17013) + j) - j3); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - c6927.f17013)) + j3;
                }
            }
            j3 += (long) (c6927.f17012 - c6927.f17013);
            c6927 = c6927.f17009;
            c6927.getClass();
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
    */
    public final long m12042() throws EOFException {
        int i;
        if (this.f16992 == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            C6927 c6927 = this.f16993;
            c6927.getClass();
            byte[] bArr = c6927.f17014;
            int i3 = c6927.f17013;
            int i4 = c6927.f17012;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b < 65 || b > 70) {
                    z = true;
                    if (i2 == 0) {
                        char[] cArr = AbstractC6401.f15697;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    if (i3 != i4) {
                        this.f16993 = c6927.m12059();
                        AbstractC6931.m12064(c6927);
                    } else {
                        c6927.f17013 = i3;
                    }
                    if (!z) {
                        break;
                    }
                } else {
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    C6921 c6921 = new C6921();
                    c6921.m12020(j);
                    c6921.m12029(b);
                    throw new NumberFormatException("Number too large: ".concat(c6921.m12039()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.f16993 != null);
        this.f16992 -= (long) i2;
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final byte[] m12043(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C6755.m11873(AbstractC3275.m5143(j, "byteCount: "));
            return null;
        }
        if (this.f16992 < j) {
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
    public final void m12044(C6921 c6921, long j, long j2) {
        c6921.getClass();
        long j3 = j;
        AbstractC8568.m13625(this.f16992, j3, j2);
        if (j2 == 0) {
            return;
        }
        c6921.f16992 += j2;
        C6927 c6927 = this.f16993;
        while (true) {
            c6927.getClass();
            long j4 = c6927.f17012 - c6927.f17013;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            c6927 = c6927.f17009;
        }
        long j5 = j2;
        while (j5 > 0) {
            c6927.getClass();
            C6927 c6927M12057 = c6927.m12057();
            int i = c6927M12057.f17013 + ((int) j3);
            c6927M12057.f17013 = i;
            c6927M12057.f17012 = Math.min(i + ((int) j5), c6927M12057.f17012);
            C6927 c69272 = c6921.f16993;
            if (c69272 == null) {
                c6927M12057.f17015 = c6927M12057;
                c6927M12057.f17009 = c6927M12057;
                c6921.f16993 = c6927M12057;
            } else {
                C6927 c69273 = c69272.f17015;
                c69273.getClass();
                c69273.m12058(c6927M12057);
            }
            j5 -= (long) (c6927M12057.f17012 - c6927M12057.f17013);
            c6927 = c6927.f17009;
            j3 = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final byte m12045(long j) {
        AbstractC8568.m13625(this.f16992, j, 1L);
        C6927 c6927 = this.f16993;
        c6927.getClass();
        long j2 = this.f16992;
        if (j2 - j < j) {
            while (j2 > j) {
                c6927 = c6927.f17015;
                c6927.getClass();
                j2 -= (long) (c6927.f17012 - c6927.f17013);
            }
            return c6927.f17014[(int) ((((long) c6927.f17013) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = c6927.f17012;
            int i2 = c6927.f17013;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return c6927.f17014[(int) ((((long) i2) + j) - j3)];
            }
            c6927 = c6927.f17009;
            c6927.getClass();
            j3 = j4;
        }
    }

    @Override // p020.InterfaceC6939
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo12046(long j) throws EOFException {
        if (this.f16992 < j) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m12047(int i) {
        if (i < 128) {
            m12029(i);
            return;
        }
        if (i < 2048) {
            C6927 c6927M12023 = m12023(2);
            byte[] bArr = c6927M12023.f17014;
            int i2 = c6927M12023.f17012;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            c6927M12023.f17012 = i2 + 2;
            this.f16992 += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            m12029(63);
            return;
        }
        if (i < 65536) {
            C6927 c6927M120232 = m12023(3);
            byte[] bArr2 = c6927M120232.f17014;
            int i3 = c6927M120232.f17012;
            bArr2[i3] = (byte) ((i >> 12) | Opcodes.SHL_INT_LIT8);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            c6927M120232.f17012 = i3 + 3;
            this.f16992 += 3;
            return;
        }
        if (i > 1114111) {
            C6755.m11869("Unexpected code point: 0x".concat(AbstractC8568.m13609(i)));
            return;
        }
        C6927 c6927M120233 = m12023(4);
        byte[] bArr3 = c6927M120233.f17014;
        int i4 = c6927M120233.f17012;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        c6927M120233.f17012 = i4 + 4;
        this.f16992 += 4;
    }

    @Override // p020.InterfaceC6939
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final long mo12048(C6921 c6921) {
        long j = this.f16992;
        if (j > 0) {
            c6921.mo11494(this, j);
        }
        return j;
    }

    @Override // p020.InterfaceC6939
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final InputStream mo12049() {
        return new C6923(this, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m12050(String str) {
        str.getClass();
        m12051(0, str.length(), str);
    }

    @Override // p020.InterfaceC6932
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo11494(C6921 c6921, long j) {
        C6927 c6927M12063;
        c6921.getClass();
        if (c6921 == this) {
            C6755.m11869("source == this");
            return;
        }
        AbstractC8568.m13625(c6921.f16992, 0L, j);
        while (j > 0) {
            C6927 c6927 = c6921.f16993;
            c6927.getClass();
            int i = c6927.f17012;
            C6927 c69272 = c6921.f16993;
            c69272.getClass();
            long j2 = i - c69272.f17013;
            int i2 = 0;
            if (j < j2) {
                C6927 c69273 = this.f16993;
                C6927 c69274 = c69273 != null ? c69273.f17015 : null;
                if (c69274 != null && c69274.f17010) {
                    if ((((long) c69274.f17012) + j) - ((long) (c69274.f17011 ? 0 : c69274.f17013)) <= 8192) {
                        C6927 c69275 = c6921.f16993;
                        c69275.getClass();
                        c69275.m12056(c69274, (int) j);
                        c6921.f16992 -= j;
                        this.f16992 += j;
                        return;
                    }
                }
                C6927 c69276 = c6921.f16993;
                c69276.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > c69276.f17012 - c69276.f17013) {
                    C6755.m11869("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    c6927M12063 = c69276.m12057();
                } else {
                    c6927M12063 = AbstractC6931.m12063();
                    byte[] bArr = c69276.f17014;
                    byte[] bArr2 = c6927M12063.f17014;
                    int i4 = c69276.f17013;
                    AbstractC5179.m9398(bArr, i4, bArr2, i4 + i3, 2);
                }
                c6927M12063.f17012 = c6927M12063.f17013 + i3;
                c69276.f17013 += i3;
                C6927 c69277 = c69276.f17015;
                c69277.getClass();
                c69277.m12058(c6927M12063);
                c6921.f16993 = c6927M12063;
            }
            C6927 c69278 = c6921.f16993;
            c69278.getClass();
            long j3 = c69278.f17012 - c69278.f17013;
            c6921.f16993 = c69278.m12059();
            C6927 c69279 = this.f16993;
            if (c69279 == null) {
                this.f16993 = c69278;
                c69278.f17015 = c69278;
                c69278.f17009 = c69278;
            } else {
                C6927 c692710 = c69279.f17015;
                c692710.getClass();
                c692710.m12058(c69278);
                C6927 c692711 = c69278.f17015;
                if (c692711 == c69278) {
                    C6755.m11870("cannot compact");
                    return;
                }
                c692711.getClass();
                if (c692711.f17010) {
                    int i5 = c69278.f17012 - c69278.f17013;
                    C6927 c692712 = c69278.f17015;
                    c692712.getClass();
                    int i6 = 8192 - c692712.f17012;
                    C6927 c692713 = c69278.f17015;
                    c692713.getClass();
                    if (!c692713.f17011) {
                        C6927 c692714 = c69278.f17015;
                        c692714.getClass();
                        i2 = c692714.f17013;
                    }
                    if (i5 <= i6 + i2) {
                        C6927 c692715 = c69278.f17015;
                        c692715.getClass();
                        c69278.m12056(c692715, i5);
                        c69278.m12059();
                        AbstractC6931.m12064(c69278);
                    }
                }
            }
            c6921.f16992 -= j3;
            this.f16992 += j3;
            j -= j3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final void m12051(int i, int i2, String str) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            C6755.m11873(AbstractC7012.m12147(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            C6755.m11873(AbstractC7012.m12150(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            C6755.m11868(AbstractC0900.m710(i2, "endIndex > string.length: ", " > "), str.length());
            return;
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C6927 c6927M12023 = m12023(1);
                byte[] bArr = c6927M12023.f17014;
                int i3 = c6927M12023.f17012 - i;
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
                int i5 = c6927M12023.f17012;
                int i6 = (i3 + i) - i5;
                c6927M12023.f17012 = i5 + i6;
                this.f16992 += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    C6927 c6927M120232 = m12023(2);
                    byte[] bArr2 = c6927M120232.f17014;
                    int i7 = c6927M120232.f17012;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c6927M120232.f17012 = i7 + 2;
                    this.f16992 += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C6927 c6927M120233 = m12023(3);
                    byte[] bArr3 = c6927M120233.f17014;
                    int i8 = c6927M120233.f17012;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | Opcodes.SHL_INT_LIT8);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c6927M120233.f17012 = i8 + 3;
                    this.f16992 += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m12029(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C6927 c6927M120234 = m12023(4);
                        byte[] bArr4 = c6927M120234.f17014;
                        int i11 = c6927M120234.f17012;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        c6927M120234.f17012 = i11 + 4;
                        this.f16992 += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p020.InterfaceC6932
    public final void close() {
    }

    @Override // p020.InterfaceC6940, p020.InterfaceC6932, java.io.Flushable
    public final void flush() {
    }

    @Override // p020.InterfaceC6939, p020.InterfaceC6940
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6921 mo12035() {
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C6927 c6927M12023 = m12023(1);
            int iMin = Math.min(i, 8192 - c6927M12023.f17012);
            byteBuffer.get(c6927M12023.f17014, c6927M12023.f17012, iMin);
            i -= iMin;
            c6927M12023.f17012 += iMin;
        }
        this.f16992 += (long) iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        C6927 c6927 = this.f16993;
        if (c6927 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c6927.f17012 - c6927.f17013);
        byteBuffer.put(c6927.f17014, c6927.f17013, iMin);
        int i = c6927.f17013 + iMin;
        c6927.f17013 = i;
        this.f16992 -= (long) iMin;
        if (i == c6927.f17012) {
            this.f16993 = c6927.m12059();
            AbstractC6931.m12064(c6927);
        }
        return iMin;
    }

    @Override // p020.InterfaceC6940
    public final InterfaceC6940 write(byte[] bArr) {
        bArr.getClass();
        write(bArr, 0, bArr.length);
        return this;
    }
}

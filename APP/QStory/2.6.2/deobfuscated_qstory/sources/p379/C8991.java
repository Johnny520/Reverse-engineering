package p379;

import androidx.activity.AbstractC0053;
import bsh.C2632;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.apache.commons.compress.archivers.zip.C5582;
import p007.AbstractC6136;
import p144.C7546;
import p357.C8912;
import p376.C8978;
import p378.AbstractC8988;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言苏子楪哲兰世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8991 extends AbstractC8988 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f25242;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public int f25243;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f25244;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f25245;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f25246;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f25247;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C8992 f25248;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public char f25249;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f25250;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f25251;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f25252;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f25253;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C8990 f25254;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f25255;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f25256;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f25257;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f25258;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C8978 f25259;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f25260;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f25261;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f25262;

    public C8991(C5582 c5582) throws IOException {
        C8990 c8990 = new C8990();
        c8990.f25241 = -1;
        this.f25254 = c8990;
        this.f25256 = 1;
        this.f25259 = new C8978(c5582 == System.in ? new C8912(c5582) : c5582, ByteOrder.BIG_ENDIAN);
        C8978 c8978 = this.f25259;
        if (c8978 != null) {
            int iM14567 = (int) c8978.m14567(8);
            int iM145672 = (int) this.f25259.m14567(8);
            int iM145673 = (int) this.f25259.m14567(8);
            if (iM14567 != 66 || iM145672 != 90 || iM145673 != 104) {
                throw new IOException("Stream is not in the BZip2 format");
            }
            int iM145674 = (int) this.f25259.m14567(8);
            if (iM145674 < 49 || iM145674 > 57) {
                C5919.m11246("BZip2 block size is invalid");
            } else {
                this.f25261 = iM145674 - 48;
                this.f25246 = 0;
            }
        } else {
            C5919.m11246("No InputStream");
        }
        m14581();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m14575(int i, int i2, String str) throws IOException {
        if (i < 0) {
            C5919.m11246(AbstractC0053.m156("Corrupted input, ", str, " value negative"));
        } else {
            if (i < i2) {
                return;
            }
            C5919.m11246(AbstractC0053.m156("Corrupted input, ", str, " value too big"));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m14576(C8978 c8978, int i) throws IOException {
        long jM14567 = c8978.m14567(i);
        if (jM14567 >= 0) {
            return (int) jM14567;
        }
        C5919.m11246("Unexpected end of stream");
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C8978 c8978 = this.f25259;
        if (c8978 != null) {
            try {
                c8978.close();
            } finally {
                this.f25248 = null;
                this.f25259 = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            C7546.m12743(AbstractC0053.m161(i, "offs(", ") < 0."));
            return 0;
        }
        if (i2 < 0) {
            C7546.m12743(AbstractC0053.m161(i2, "len(", ") < 0."));
            return 0;
        }
        int i3 = i + i2;
        if (i3 > bArr.length) {
            C7546.m12743(AbstractC0053.m147(AbstractC0053.m151(i, i2, "offs(", ") + len(", ") > dest.length("), ").", bArr.length));
            return 0;
        }
        if (this.f25259 == null) {
            C5919.m11246("Stream closed");
            return 0;
        }
        if (i2 == 0) {
            return 0;
        }
        int i4 = i;
        while (i4 < i3) {
            int iM14580 = m14580();
            if (iM14580 < 0) {
                break;
            }
            bArr[i4] = (byte) iM14580;
            i4++;
        }
        if (i4 == i) {
            return -1;
        }
        return i4 - i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m14577() throws IOException {
        int i = ~this.f25254.f25241;
        int i2 = this.f25257;
        if (i2 == i) {
            int i3 = this.f25246;
            this.f25246 = i ^ ((i3 >>> 31) | (i3 << 1));
        } else {
            int i4 = this.f25247;
            this.f25246 = ((i4 >>> 31) | (i4 << 1)) ^ i2;
            C5919.m11246("BZip2 CRC error");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int m14578() throws IOException {
        if (this.f25242 > this.f25262) {
            m14577();
            m14581();
            return m14584();
        }
        this.f25243 = this.f25244;
        C8992 c8992 = this.f25248;
        byte[] bArr = c8992.f25271;
        int i = this.f25250;
        int i2 = bArr[i] & DefaultClassResolver.NAME;
        m14575(i, c8992.f25269.length, "su_tPos");
        this.f25250 = this.f25248.f25269[this.f25250];
        int i3 = this.f25252;
        if (i3 == 0) {
            int i4 = this.f25251;
            this.f25252 = AbstractC8989.f25239[i4] - 1;
            int i5 = i4 + 1;
            this.f25251 = i5;
            if (i5 == 512) {
                this.f25251 = 0;
            }
        } else {
            this.f25252 = i3 - 1;
        }
        int i6 = i2 ^ (this.f25252 == 1 ? 1 : 0);
        this.f25244 = i6;
        this.f25242++;
        this.f25256 = 3;
        this.f25254.m14574(i6);
        return i6;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int m14579() {
        if (this.f25253 < this.f25249) {
            this.f25254.m14574(this.f25244);
            this.f25253++;
            return this.f25244;
        }
        this.f25256 = 2;
        this.f25242++;
        this.f25245 = 0;
        return m14578();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m14580() throws IOException {
        switch (this.f25256) {
            case 0:
                return -1;
            case 1:
                return m14584();
            case 2:
                C2632.m5296();
                return 0;
            case 3:
                if (this.f25244 != this.f25243) {
                    this.f25256 = 2;
                    this.f25245 = 1;
                    return m14578();
                }
                int i = this.f25245 + 1;
                this.f25245 = i;
                if (i < 4) {
                    this.f25256 = 2;
                    return m14578();
                }
                C8992 c8992 = this.f25248;
                byte[] bArr = c8992.f25271;
                int i2 = this.f25250;
                this.f25249 = (char) (bArr[i2] & DefaultClassResolver.NAME);
                m14575(i2, c8992.f25269.length, "su_tPos");
                this.f25250 = this.f25248.f25269[this.f25250];
                int i3 = this.f25252;
                if (i3 == 0) {
                    int i4 = this.f25251;
                    this.f25252 = AbstractC8989.f25239[i4] - 1;
                    int i5 = i4 + 1;
                    this.f25251 = i5;
                    if (i5 == 512) {
                        this.f25251 = 0;
                    }
                } else {
                    this.f25252 = i3 - 1;
                }
                this.f25253 = 0;
                this.f25256 = 4;
                if (this.f25252 == 1) {
                    this.f25249 = (char) (this.f25249 ^ 1);
                }
                return m14579();
            case 4:
                return m14579();
            case 5:
                C2632.m5296();
                return 0;
            case 6:
                if (this.f25244 != this.f25243) {
                    this.f25245 = 1;
                    return m14582();
                }
                int i6 = this.f25245 + 1;
                this.f25245 = i6;
                if (i6 < 4) {
                    return m14582();
                }
                m14575(this.f25250, this.f25248.f25271.length, "su_tPos");
                C8992 c89922 = this.f25248;
                byte[] bArr2 = c89922.f25271;
                int i7 = this.f25250;
                this.f25249 = (char) (bArr2[i7] & DefaultClassResolver.NAME);
                this.f25250 = c89922.f25269[i7];
                this.f25253 = 0;
                return m14583();
            case 7:
                return m14583();
            default:
                C2632.m5296();
                return 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14581() throws IOException {
        char[] cArr;
        char c;
        int i;
        char c2;
        C8978 c8978 = this.f25259;
        char cM14576 = (char) m14576(c8978, 8);
        char cM145762 = (char) m14576(c8978, 8);
        char cM145763 = (char) m14576(c8978, 8);
        char cM145764 = (char) m14576(c8978, 8);
        char cM145765 = (char) m14576(c8978, 8);
        char cM145766 = (char) m14576(c8978, 8);
        char c3 = 0;
        if (cM14576 == 23 && cM145762 == 'r' && cM145763 == 'E' && cM145764 == '8' && cM145765 == 'P' && cM145766 == 144) {
            int iM14576 = m14576(this.f25259, 32);
            this.f25247 = iM14576;
            this.f25256 = 0;
            this.f25248 = null;
            if (iM14576 == this.f25246) {
                return;
            }
            C5919.m11246("BZip2 CRC error");
            return;
        }
        if (cM14576 != '1' || cM145762 != 'A' || cM145763 != 'Y' || cM145764 != '&' || cM145765 != 'S' || cM145766 != 'Y') {
            this.f25256 = 0;
            C5919.m11246("Bad block header");
            return;
        }
        this.f25257 = m14576(c8978, 32);
        int i2 = 1;
        this.f25255 = m14576(c8978, 1) == 1;
        if (this.f25248 == null) {
            this.f25248 = new C8992(this.f25261);
        }
        C8978 c89782 = this.f25259;
        this.f25260 = m14576(c89782, 24);
        C8978 c89783 = this.f25259;
        C8992 c8992 = this.f25248;
        boolean[] zArr = c8992.f25268;
        byte[] bArr = c8992.f25270;
        byte[] bArr2 = c8992.f25266;
        byte[] bArr3 = c8992.f25265;
        int i3 = 0;
        for (int i4 = 0; i4 < 16; i4++) {
            if (m14576(c89783, 1) != 0) {
                i3 |= 1 << i4;
            }
        }
        Arrays.fill(zArr, false);
        for (int i5 = 0; i5 < 16; i5++) {
            if ((i3 & (1 << i5)) != 0) {
                int i6 = i5 << 4;
                for (int i7 = 0; i7 < 16; i7++) {
                    if (m14576(c89783, 1) != 0) {
                        zArr[i6 + i7] = true;
                    }
                }
            }
        }
        C8992 c89922 = this.f25248;
        boolean[] zArr2 = c89922.f25268;
        byte[] bArr4 = c89922.f25267;
        int i8 = 0;
        int i9 = 0;
        while (i8 < 256) {
            if (zArr2[i8]) {
                c2 = c3;
                bArr4[i9] = (byte) i8;
                i9++;
            } else {
                c2 = c3;
            }
            i8++;
            c3 = c2;
        }
        char c4 = c3;
        this.f25258 = i9;
        int i10 = i9 + 2;
        int iM145762 = m14576(c89783, 3);
        int iM145763 = m14576(c89783, 15);
        if (iM145763 < 0) {
            C5919.m11246("Corrupted input, nSelectors value negative");
            return;
        }
        m14575(i10, 259, "alphaSize");
        m14575(iM145762, 7, "nGroups");
        for (int i11 = c4; i11 < iM145763; i11++) {
            int i12 = c4;
            while (m14576(c89783, 1) != 0) {
                i12++;
            }
            if (i11 < 18002) {
                bArr3[i11] = (byte) i12;
            }
        }
        int iMin = Math.min(iM145763, 18002);
        int i13 = iM145762;
        while (true) {
            i13--;
            if (i13 < 0) {
                break;
            } else {
                bArr[i13] = (byte) i13;
            }
        }
        for (int i14 = c4; i14 < iMin; i14++) {
            int i15 = bArr3[i14] & DefaultClassResolver.NAME;
            m14575(i15, 6, "selectorMtf");
            byte b = bArr[i15];
            while (i15 > 0) {
                bArr[i15] = bArr[i15 - 1];
                i15--;
            }
            bArr[c4] = b;
            bArr2[i14] = b;
        }
        char[][] cArr2 = c8992.f25275;
        for (int i16 = c4; i16 < iM145762; i16++) {
            int iM145764 = m14576(c89783, 5);
            char[] cArr3 = cArr2[i16];
            for (int i17 = c4; i17 < i10; i17++) {
                while (m14576(c89783, 1) != 0) {
                    iM145764 += m14576(c89783, 1) != 0 ? -1 : 1;
                }
                cArr3[i17] = (char) iM145764;
            }
        }
        C8992 c89923 = this.f25248;
        char[][] cArr4 = c89923.f25275;
        int[] iArr = c89923.f25276;
        int[][] iArr2 = c89923.f25263;
        int[][] iArr3 = c89923.f25273;
        int[][] iArr4 = c89923.f25272;
        int i18 = c4;
        while (i18 < iM145762) {
            char[] cArr5 = cArr4[i18];
            int i19 = i2;
            int i20 = i10;
            char c5 = c4;
            char c6 = ' ';
            while (true) {
                i20--;
                if (i20 < 0) {
                    break;
                }
                char c7 = cArr5[i20];
                if (c7 > c5) {
                    c5 = c7;
                }
                if (c7 < c6) {
                    c6 = c7;
                }
            }
            int[] iArr5 = iArr2[i18];
            int[] iArr6 = iArr3[i18];
            int[] iArr7 = iArr4[i18];
            char[] cArr6 = cArr4[i18];
            int i21 = c4;
            for (int i22 = c6; i22 <= c5; i22++) {
                int i23 = c4;
                while (i23 < i10) {
                    char c8 = c6;
                    if (cArr6[i23] == i22) {
                        iArr7[i21] = i23;
                        i21++;
                    }
                    i23++;
                    c6 = c8;
                }
            }
            char c9 = c6;
            int i24 = 23;
            while (true) {
                i24--;
                if (i24 <= 0) {
                    break;
                }
                iArr6[i24] = c4;
                iArr5[i24] = c4;
            }
            for (int i25 = c4; i25 < i10; i25++) {
                char c10 = cArr6[i25];
                m14575(c10, 258, "length");
                int i26 = c10 + 1;
                iArr6[i26] = iArr6[i26] + 1;
            }
            int i27 = iArr6[c4];
            for (int i28 = i19; i28 < 23; i28++) {
                i27 += iArr6[i28];
                iArr6[i28] = i27;
            }
            int i29 = iArr6[c9];
            int i30 = c4;
            int i31 = c9;
            while (i31 <= c5) {
                int i32 = i31 + 1;
                int i33 = iArr6[i32];
                int i34 = (i33 - i29) + i30;
                iArr5[i31] = i34 - 1;
                i30 = i34 << 1;
                i31 = i32;
                i29 = i33;
            }
            for (int i35 = c9 + 1; i35 <= c5; i35++) {
                iArr6[i35] = ((iArr5[i35 - 1] + 1) << 1) - iArr6[i35];
            }
            iArr[i18] = c9;
            i18++;
            i2 = i19;
        }
        int i36 = i2;
        C8992 c89924 = this.f25248;
        byte[] bArr5 = c89924.f25271;
        int[] iArr8 = c89924.f25264;
        byte[] bArr6 = c89924.f25266;
        byte[] bArr7 = c89924.f25267;
        char[] cArr7 = c89924.f25274;
        int[] iArr9 = c89924.f25276;
        int[][] iArr10 = c89924.f25263;
        int[][] iArr11 = c89924.f25273;
        int[][] iArr12 = c89924.f25272;
        int i37 = this.f25261 * 100000;
        int i38 = 256;
        while (true) {
            i38--;
            if (i38 < 0) {
                break;
            }
            cArr7[i38] = (char) i38;
            iArr8[i38] = c4;
        }
        int i39 = this.f25258 + 1;
        C8992 c89925 = this.f25248;
        int i40 = c89925.f25266[c4] & DefaultClassResolver.NAME;
        m14575(i40, 6, "zt");
        int[] iArr13 = c89925.f25263[i40];
        int i41 = c89925.f25276[i40];
        m14575(i41, 258, "zn");
        int iM145765 = m14576(this.f25259, i41);
        int i42 = i41;
        while (iM145765 > iArr13[i42]) {
            int i43 = i42 + 1;
            m14575(i43, 258, "zn");
            i42 = i43;
            iM145765 = (iM145765 << 1) | m14576(this.f25259, i36);
            i36 = 1;
        }
        int i44 = iM145765 - c89925.f25273[i40][i42];
        m14575(i44, 258, "zvec");
        int i45 = c89925.f25272[i40][i44];
        int i46 = bArr6[c4] & DefaultClassResolver.NAME;
        m14575(i46, 6, "zt");
        int[] iArr14 = iArr11[i46];
        int[] iArr15 = iArr10[i46];
        int[] iArr16 = iArr12[i46];
        int i47 = iArr9[i46];
        int i48 = -1;
        int[] iArr17 = iArr16;
        int i49 = 49;
        int i50 = c4;
        while (i45 != i39) {
            int[] iArr18 = iArr9;
            int[][] iArr19 = iArr10;
            int[][] iArr20 = iArr11;
            int i51 = i39;
            if (i45 == 0 || i45 == 1) {
                int[] iArr21 = iArr14;
                int i52 = -1;
                int i53 = 1;
                while (true) {
                    if (i45 != 0) {
                        cArr = cArr7;
                        if (i45 != 1) {
                            break;
                        } else {
                            i52 += i53 << 1;
                        }
                    } else {
                        i52 += i53;
                        cArr = cArr7;
                    }
                    if (i49 == 0) {
                        int i54 = i50 + 1;
                        m14575(i54, 18002, "groupNo");
                        int i55 = bArr6[i54] & DefaultClassResolver.NAME;
                        m14575(i55, 6, "zt");
                        iArr21 = iArr20[i55];
                        int[] iArr22 = iArr19[i55];
                        iArr17 = iArr12[i55];
                        i47 = iArr18[i55];
                        i50 = i54;
                        iArr15 = iArr22;
                        i49 = 49;
                    } else {
                        i49--;
                    }
                    int i56 = i47;
                    m14575(i56, 258, "zn");
                    i47 = i56;
                    int iM145766 = m14576(c89782, i56);
                    int i57 = i47;
                    while (iM145766 > iArr15[i57]) {
                        int i58 = i57 + 1;
                        m14575(i58, 258, "zn");
                        iM145766 = (iM145766 << 1) | m14576(c89782, 1);
                        i57 = i58;
                    }
                    int i59 = iM145766 - iArr21[i57];
                    m14575(i59, 258, "zvec");
                    i53 <<= 1;
                    i45 = iArr17[i59];
                    cArr7 = cArr;
                }
                m14575(i52, this.f25248.f25271.length, "s");
                char c11 = cArr[0];
                m14575(c11, 256, "yy");
                byte b2 = bArr7[c11];
                int i60 = b2 & DefaultClassResolver.NAME;
                iArr8[i60] = i52 + 1 + iArr8[i60];
                int i61 = i48 + 1;
                int i62 = i61 + i52;
                m14575(i62, this.f25248.f25271.length, "lastShadow");
                Arrays.fill(bArr5, i61, i62 + 1, b2);
                if (i62 >= i37) {
                    C5919.m11246(AbstractC6136.m11559(i62, i37, "Block overrun while expanding RLE in MTF, ", " exceeds "));
                    return;
                }
                i48 = i62;
                iArr9 = iArr18;
                iArr10 = iArr19;
                iArr11 = iArr20;
                i39 = i51;
                iArr14 = iArr21;
                cArr7 = cArr;
            } else {
                i48++;
                if (i48 >= i37) {
                    C5919.m11246(AbstractC6136.m11559(i48, i37, "Block overrun in MTF, ", " exceeds "));
                    return;
                }
                m14575(i45, 257, "nextSym");
                int i63 = i45 - 1;
                char c12 = cArr7[i63];
                int[] iArr23 = iArr14;
                m14575(c12, 256, "yy");
                byte b3 = bArr7[c12];
                int i64 = b3 & DefaultClassResolver.NAME;
                iArr8[i64] = iArr8[i64] + 1;
                bArr5[i48] = b3;
                if (i45 <= 16) {
                    while (i63 > 0) {
                        int i65 = i63 - 1;
                        cArr7[i63] = cArr7[i65];
                        i63 = i65;
                    }
                    c = c4;
                } else {
                    c = c4;
                    System.arraycopy(cArr7, c, cArr7, 1, i63);
                }
                cArr7[c] = c12;
                if (i49 == 0) {
                    int i66 = i50 + 1;
                    m14575(i66, 18002, "groupNo");
                    int i67 = bArr6[i66] & DefaultClassResolver.NAME;
                    m14575(i67, 6, "zt");
                    int[] iArr24 = iArr20[i67];
                    int[] iArr25 = iArr19[i67];
                    int[] iArr26 = iArr12[i67];
                    i = iArr18[i67];
                    i50 = i66;
                    iArr23 = iArr24;
                    iArr15 = iArr25;
                    iArr17 = iArr26;
                    i49 = 49;
                } else {
                    i49--;
                    i = i47;
                }
                m14575(i, 258, "zn");
                int iM145767 = m14576(c89782, i);
                int i68 = i;
                while (iM145767 > iArr15[i68]) {
                    i68++;
                    m14575(i68, 258, "zn");
                    iM145767 = (iM145767 << 1) | m14576(c89782, 1);
                }
                int i69 = iM145767 - iArr23[i68];
                m14575(i69, 258, "zvec");
                i45 = iArr17[i69];
                i47 = i;
                iArr9 = iArr18;
                iArr10 = iArr19;
                iArr11 = iArr20;
                i39 = i51;
                iArr14 = iArr23;
            }
            c4 = 0;
        }
        this.f25262 = i48;
        this.f25254.f25241 = -1;
        this.f25256 = 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int m14582() throws IOException {
        if (this.f25242 > this.f25262) {
            this.f25256 = 5;
            m14577();
            m14581();
            return m14584();
        }
        this.f25243 = this.f25244;
        C8992 c8992 = this.f25248;
        byte[] bArr = c8992.f25271;
        int i = this.f25250;
        int i2 = bArr[i] & DefaultClassResolver.NAME;
        this.f25244 = i2;
        m14575(i, c8992.f25269.length, "su_tPos");
        this.f25250 = this.f25248.f25269[this.f25250];
        this.f25242++;
        this.f25256 = 6;
        this.f25254.m14574(i2);
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int m14583() {
        if (this.f25253 >= this.f25249) {
            this.f25242++;
            this.f25245 = 0;
            return m14582();
        }
        int i = this.f25244;
        this.f25254.m14574(i);
        this.f25253++;
        this.f25256 = 7;
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m14584() throws IOException {
        C8992 c8992;
        if (this.f25256 == 0 || (c8992 = this.f25248) == null) {
            return -1;
        }
        int[] iArr = c8992.f25277;
        int i = this.f25262 + 1;
        int[] iArr2 = c8992.f25269;
        if (iArr2 == null || iArr2.length < i) {
            iArr2 = new int[i];
            c8992.f25269 = iArr2;
        }
        byte[] bArr = c8992.f25271;
        iArr[0] = 0;
        System.arraycopy(c8992.f25264, 0, iArr, 1, 256);
        int i2 = iArr[0];
        for (int i3 = 1; i3 <= 256; i3++) {
            i2 += iArr[i3];
            iArr[i3] = i2;
        }
        int i4 = this.f25262;
        for (int i5 = 0; i5 <= i4; i5++) {
            int i6 = bArr[i5] & DefaultClassResolver.NAME;
            int i7 = iArr[i6];
            iArr[i6] = i7 + 1;
            m14575(i7, i, "tt index");
            iArr2[i7] = i5;
        }
        int i8 = this.f25260;
        if (i8 < 0 || i8 >= iArr2.length) {
            C5919.m11246("Stream corrupted");
            return 0;
        }
        this.f25250 = iArr2[i8];
        this.f25245 = 0;
        this.f25242 = 0;
        this.f25244 = 256;
        if (!this.f25255) {
            return m14582();
        }
        this.f25252 = 0;
        this.f25251 = 0;
        return m14578();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f25259 != null) {
            return m14580();
        }
        C5919.m11246("Stream closed");
        return 0;
    }
}

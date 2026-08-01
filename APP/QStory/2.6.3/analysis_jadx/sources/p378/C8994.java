package p378;

import androidx.activity.AbstractC0053;
import bsh.C2633;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.apache.commons.compress.archivers.zip.C5583;
import p009.AbstractC6183;
import p144.C7547;
import p357.C8902;
import p374.AbstractC8977;
import p379.C8997;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言苏子楪哲世兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8994 extends AbstractC8977 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f25223;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public int f25224;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f25225;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f25226;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f25227;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f25228;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C8995 f25229;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public char f25230;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f25231;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f25232;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f25233;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f25234;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C8993 f25235;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f25236;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f25237;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f25238;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f25239;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C8997 f25240;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f25241;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f25242;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f25243;

    public C8994(C5583 c5583) throws IOException {
        C8993 c8993 = new C8993();
        c8993.f25222 = -1;
        this.f25235 = c8993;
        this.f25237 = 1;
        this.f25240 = new C8997(c5583 == System.in ? new C8902(c5583) : c5583, ByteOrder.BIG_ENDIAN);
        C8997 c8997 = this.f25240;
        if (c8997 != null) {
            int iM14603 = (int) c8997.m14603(8);
            int iM146032 = (int) this.f25240.m14603(8);
            int iM146033 = (int) this.f25240.m14603(8);
            if (iM14603 != 66 || iM146032 != 90 || iM146033 != 104) {
                throw new IOException("Stream is not in the BZip2 format");
            }
            int iM146034 = (int) this.f25240.m14603(8);
            if (iM146034 < 49 || iM146034 > 57) {
                C5925.m11307("BZip2 block size is invalid");
            } else {
                this.f25242 = iM146034 - 48;
                this.f25227 = 0;
            }
        } else {
            C5925.m11307("No InputStream");
        }
        m14594();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m14588(int i, int i2, String str) throws IOException {
        if (i < 0) {
            C5925.m11307(AbstractC0053.m158("Corrupted input, ", str, " value negative"));
        } else {
            if (i < i2) {
                return;
            }
            C5925.m11307(AbstractC0053.m158("Corrupted input, ", str, " value too big"));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m14589(C8997 c8997, int i) throws IOException {
        long jM14603 = c8997.m14603(i);
        if (jM14603 >= 0) {
            return (int) jM14603;
        }
        C5925.m11307("Unexpected end of stream");
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C8997 c8997 = this.f25240;
        if (c8997 != null) {
            try {
                c8997.close();
            } finally {
                this.f25229 = null;
                this.f25240 = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            C7547.m12772(AbstractC0053.m162(i, "offs(", ") < 0."));
            return 0;
        }
        if (i2 < 0) {
            C7547.m12772(AbstractC0053.m162(i2, "len(", ") < 0."));
            return 0;
        }
        int i3 = i + i2;
        if (i3 > bArr.length) {
            C7547.m12772(AbstractC0053.m147(AbstractC0053.m149(i, i2, "offs(", ") + len(", ") > dest.length("), ").", bArr.length));
            return 0;
        }
        if (this.f25240 == null) {
            C5925.m11307("Stream closed");
            return 0;
        }
        if (i2 == 0) {
            return 0;
        }
        int i4 = i;
        while (i4 < i3) {
            int iM14593 = m14593();
            if (iM14593 < 0) {
                break;
            }
            bArr[i4] = (byte) iM14593;
            i4++;
        }
        if (i4 == i) {
            return -1;
        }
        return i4 - i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m14590() throws IOException {
        int i = ~this.f25235.f25222;
        int i2 = this.f25238;
        if (i2 == i) {
            int i3 = this.f25227;
            this.f25227 = i ^ ((i3 >>> 31) | (i3 << 1));
        } else {
            int i4 = this.f25228;
            this.f25227 = ((i4 >>> 31) | (i4 << 1)) ^ i2;
            C5925.m11307("BZip2 CRC error");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int m14591() throws IOException {
        if (this.f25223 > this.f25243) {
            m14590();
            m14594();
            return m14597();
        }
        this.f25224 = this.f25225;
        C8995 c8995 = this.f25229;
        byte[] bArr = c8995.f25252;
        int i = this.f25231;
        int i2 = bArr[i] & DefaultClassResolver.NAME;
        m14588(i, c8995.f25250.length, "su_tPos");
        this.f25231 = this.f25229.f25250[this.f25231];
        int i3 = this.f25233;
        if (i3 == 0) {
            int i4 = this.f25232;
            this.f25233 = AbstractC8992.f25220[i4] - 1;
            int i5 = i4 + 1;
            this.f25232 = i5;
            if (i5 == 512) {
                this.f25232 = 0;
            }
        } else {
            this.f25233 = i3 - 1;
        }
        int i6 = i2 ^ (this.f25233 == 1 ? 1 : 0);
        this.f25225 = i6;
        this.f25223++;
        this.f25237 = 3;
        this.f25235.m14587(i6);
        return i6;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int m14592() {
        if (this.f25234 < this.f25230) {
            this.f25235.m14587(this.f25225);
            this.f25234++;
            return this.f25225;
        }
        this.f25237 = 2;
        this.f25223++;
        this.f25226 = 0;
        return m14591();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m14593() throws IOException {
        switch (this.f25237) {
            case 0:
                return -1;
            case 1:
                return m14597();
            case 2:
                C2633.m5341();
                return 0;
            case 3:
                if (this.f25225 != this.f25224) {
                    this.f25237 = 2;
                    this.f25226 = 1;
                    return m14591();
                }
                int i = this.f25226 + 1;
                this.f25226 = i;
                if (i < 4) {
                    this.f25237 = 2;
                    return m14591();
                }
                C8995 c8995 = this.f25229;
                byte[] bArr = c8995.f25252;
                int i2 = this.f25231;
                this.f25230 = (char) (bArr[i2] & DefaultClassResolver.NAME);
                m14588(i2, c8995.f25250.length, "su_tPos");
                this.f25231 = this.f25229.f25250[this.f25231];
                int i3 = this.f25233;
                if (i3 == 0) {
                    int i4 = this.f25232;
                    this.f25233 = AbstractC8992.f25220[i4] - 1;
                    int i5 = i4 + 1;
                    this.f25232 = i5;
                    if (i5 == 512) {
                        this.f25232 = 0;
                    }
                } else {
                    this.f25233 = i3 - 1;
                }
                this.f25234 = 0;
                this.f25237 = 4;
                if (this.f25233 == 1) {
                    this.f25230 = (char) (this.f25230 ^ 1);
                }
                return m14592();
            case 4:
                return m14592();
            case 5:
                C2633.m5341();
                return 0;
            case 6:
                if (this.f25225 != this.f25224) {
                    this.f25226 = 1;
                    return m14595();
                }
                int i6 = this.f25226 + 1;
                this.f25226 = i6;
                if (i6 < 4) {
                    return m14595();
                }
                m14588(this.f25231, this.f25229.f25252.length, "su_tPos");
                C8995 c89952 = this.f25229;
                byte[] bArr2 = c89952.f25252;
                int i7 = this.f25231;
                this.f25230 = (char) (bArr2[i7] & DefaultClassResolver.NAME);
                this.f25231 = c89952.f25250[i7];
                this.f25234 = 0;
                return m14596();
            case 7:
                return m14596();
            default:
                C2633.m5341();
                return 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14594() throws IOException {
        char[] cArr;
        char c;
        int i;
        char c2;
        C8997 c8997 = this.f25240;
        char cM14589 = (char) m14589(c8997, 8);
        char cM145892 = (char) m14589(c8997, 8);
        char cM145893 = (char) m14589(c8997, 8);
        char cM145894 = (char) m14589(c8997, 8);
        char cM145895 = (char) m14589(c8997, 8);
        char cM145896 = (char) m14589(c8997, 8);
        char c3 = 0;
        if (cM14589 == 23 && cM145892 == 'r' && cM145893 == 'E' && cM145894 == '8' && cM145895 == 'P' && cM145896 == 144) {
            int iM14589 = m14589(this.f25240, 32);
            this.f25228 = iM14589;
            this.f25237 = 0;
            this.f25229 = null;
            if (iM14589 == this.f25227) {
                return;
            }
            C5925.m11307("BZip2 CRC error");
            return;
        }
        if (cM14589 != '1' || cM145892 != 'A' || cM145893 != 'Y' || cM145894 != '&' || cM145895 != 'S' || cM145896 != 'Y') {
            this.f25237 = 0;
            C5925.m11307("Bad block header");
            return;
        }
        this.f25238 = m14589(c8997, 32);
        int i2 = 1;
        this.f25236 = m14589(c8997, 1) == 1;
        if (this.f25229 == null) {
            this.f25229 = new C8995(this.f25242);
        }
        C8997 c89972 = this.f25240;
        this.f25241 = m14589(c89972, 24);
        C8997 c89973 = this.f25240;
        C8995 c8995 = this.f25229;
        boolean[] zArr = c8995.f25249;
        byte[] bArr = c8995.f25251;
        byte[] bArr2 = c8995.f25247;
        byte[] bArr3 = c8995.f25246;
        int i3 = 0;
        for (int i4 = 0; i4 < 16; i4++) {
            if (m14589(c89973, 1) != 0) {
                i3 |= 1 << i4;
            }
        }
        Arrays.fill(zArr, false);
        for (int i5 = 0; i5 < 16; i5++) {
            if ((i3 & (1 << i5)) != 0) {
                int i6 = i5 << 4;
                for (int i7 = 0; i7 < 16; i7++) {
                    if (m14589(c89973, 1) != 0) {
                        zArr[i6 + i7] = true;
                    }
                }
            }
        }
        C8995 c89952 = this.f25229;
        boolean[] zArr2 = c89952.f25249;
        byte[] bArr4 = c89952.f25248;
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
        this.f25239 = i9;
        int i10 = i9 + 2;
        int iM145892 = m14589(c89973, 3);
        int iM145893 = m14589(c89973, 15);
        if (iM145893 < 0) {
            C5925.m11307("Corrupted input, nSelectors value negative");
            return;
        }
        m14588(i10, 259, "alphaSize");
        m14588(iM145892, 7, "nGroups");
        for (int i11 = c4; i11 < iM145893; i11++) {
            int i12 = c4;
            while (m14589(c89973, 1) != 0) {
                i12++;
            }
            if (i11 < 18002) {
                bArr3[i11] = (byte) i12;
            }
        }
        int iMin = Math.min(iM145893, 18002);
        int i13 = iM145892;
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
            m14588(i15, 6, "selectorMtf");
            byte b = bArr[i15];
            while (i15 > 0) {
                bArr[i15] = bArr[i15 - 1];
                i15--;
            }
            bArr[c4] = b;
            bArr2[i14] = b;
        }
        char[][] cArr2 = c8995.f25256;
        for (int i16 = c4; i16 < iM145892; i16++) {
            int iM145894 = m14589(c89973, 5);
            char[] cArr3 = cArr2[i16];
            for (int i17 = c4; i17 < i10; i17++) {
                while (m14589(c89973, 1) != 0) {
                    iM145894 += m14589(c89973, 1) != 0 ? -1 : 1;
                }
                cArr3[i17] = (char) iM145894;
            }
        }
        C8995 c89953 = this.f25229;
        char[][] cArr4 = c89953.f25256;
        int[] iArr = c89953.f25257;
        int[][] iArr2 = c89953.f25244;
        int[][] iArr3 = c89953.f25254;
        int[][] iArr4 = c89953.f25253;
        int i18 = c4;
        while (i18 < iM145892) {
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
                m14588(c10, 258, "length");
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
        C8995 c89954 = this.f25229;
        byte[] bArr5 = c89954.f25252;
        int[] iArr8 = c89954.f25245;
        byte[] bArr6 = c89954.f25247;
        byte[] bArr7 = c89954.f25248;
        char[] cArr7 = c89954.f25255;
        int[] iArr9 = c89954.f25257;
        int[][] iArr10 = c89954.f25244;
        int[][] iArr11 = c89954.f25254;
        int[][] iArr12 = c89954.f25253;
        int i37 = this.f25242 * 100000;
        int i38 = 256;
        while (true) {
            i38--;
            if (i38 < 0) {
                break;
            }
            cArr7[i38] = (char) i38;
            iArr8[i38] = c4;
        }
        int i39 = this.f25239 + 1;
        C8995 c89955 = this.f25229;
        int i40 = c89955.f25247[c4] & DefaultClassResolver.NAME;
        m14588(i40, 6, "zt");
        int[] iArr13 = c89955.f25244[i40];
        int i41 = c89955.f25257[i40];
        m14588(i41, 258, "zn");
        int iM145895 = m14589(this.f25240, i41);
        int i42 = i41;
        while (iM145895 > iArr13[i42]) {
            int i43 = i42 + 1;
            m14588(i43, 258, "zn");
            i42 = i43;
            iM145895 = (iM145895 << 1) | m14589(this.f25240, i36);
            i36 = 1;
        }
        int i44 = iM145895 - c89955.f25254[i40][i42];
        m14588(i44, 258, "zvec");
        int i45 = c89955.f25253[i40][i44];
        int i46 = bArr6[c4] & DefaultClassResolver.NAME;
        m14588(i46, 6, "zt");
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
                        m14588(i54, 18002, "groupNo");
                        int i55 = bArr6[i54] & DefaultClassResolver.NAME;
                        m14588(i55, 6, "zt");
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
                    m14588(i56, 258, "zn");
                    i47 = i56;
                    int iM145896 = m14589(c89972, i56);
                    int i57 = i47;
                    while (iM145896 > iArr15[i57]) {
                        int i58 = i57 + 1;
                        m14588(i58, 258, "zn");
                        iM145896 = (iM145896 << 1) | m14589(c89972, 1);
                        i57 = i58;
                    }
                    int i59 = iM145896 - iArr21[i57];
                    m14588(i59, 258, "zvec");
                    i53 <<= 1;
                    i45 = iArr17[i59];
                    cArr7 = cArr;
                }
                m14588(i52, this.f25229.f25252.length, "s");
                char c11 = cArr[0];
                m14588(c11, 256, "yy");
                byte b2 = bArr7[c11];
                int i60 = b2 & DefaultClassResolver.NAME;
                iArr8[i60] = i52 + 1 + iArr8[i60];
                int i61 = i48 + 1;
                int i62 = i61 + i52;
                m14588(i62, this.f25229.f25252.length, "lastShadow");
                Arrays.fill(bArr5, i61, i62 + 1, b2);
                if (i62 >= i37) {
                    C5925.m11307(AbstractC6183.m11591(i62, i37, "Block overrun while expanding RLE in MTF, ", " exceeds "));
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
                    C5925.m11307(AbstractC6183.m11591(i48, i37, "Block overrun in MTF, ", " exceeds "));
                    return;
                }
                m14588(i45, 257, "nextSym");
                int i63 = i45 - 1;
                char c12 = cArr7[i63];
                int[] iArr23 = iArr14;
                m14588(c12, 256, "yy");
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
                    m14588(i66, 18002, "groupNo");
                    int i67 = bArr6[i66] & DefaultClassResolver.NAME;
                    m14588(i67, 6, "zt");
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
                m14588(i, 258, "zn");
                int iM145897 = m14589(c89972, i);
                int i68 = i;
                while (iM145897 > iArr15[i68]) {
                    i68++;
                    m14588(i68, 258, "zn");
                    iM145897 = (iM145897 << 1) | m14589(c89972, 1);
                }
                int i69 = iM145897 - iArr23[i68];
                m14588(i69, 258, "zvec");
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
        this.f25243 = i48;
        this.f25235.f25222 = -1;
        this.f25237 = 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int m14595() throws IOException {
        if (this.f25223 > this.f25243) {
            this.f25237 = 5;
            m14590();
            m14594();
            return m14597();
        }
        this.f25224 = this.f25225;
        C8995 c8995 = this.f25229;
        byte[] bArr = c8995.f25252;
        int i = this.f25231;
        int i2 = bArr[i] & DefaultClassResolver.NAME;
        this.f25225 = i2;
        m14588(i, c8995.f25250.length, "su_tPos");
        this.f25231 = this.f25229.f25250[this.f25231];
        this.f25223++;
        this.f25237 = 6;
        this.f25235.m14587(i2);
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int m14596() {
        if (this.f25234 >= this.f25230) {
            this.f25223++;
            this.f25226 = 0;
            return m14595();
        }
        int i = this.f25225;
        this.f25235.m14587(i);
        this.f25234++;
        this.f25237 = 7;
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m14597() throws IOException {
        C8995 c8995;
        if (this.f25237 == 0 || (c8995 = this.f25229) == null) {
            return -1;
        }
        int[] iArr = c8995.f25258;
        int i = this.f25243 + 1;
        int[] iArr2 = c8995.f25250;
        if (iArr2 == null || iArr2.length < i) {
            iArr2 = new int[i];
            c8995.f25250 = iArr2;
        }
        byte[] bArr = c8995.f25252;
        iArr[0] = 0;
        System.arraycopy(c8995.f25245, 0, iArr, 1, 256);
        int i2 = iArr[0];
        for (int i3 = 1; i3 <= 256; i3++) {
            i2 += iArr[i3];
            iArr[i3] = i2;
        }
        int i4 = this.f25243;
        for (int i5 = 0; i5 <= i4; i5++) {
            int i6 = bArr[i5] & DefaultClassResolver.NAME;
            int i7 = iArr[i6];
            iArr[i6] = i7 + 1;
            m14588(i7, i, "tt index");
            iArr2[i7] = i5;
        }
        int i8 = this.f25241;
        if (i8 < 0 || i8 >= iArr2.length) {
            C5925.m11307("Stream corrupted");
            return 0;
        }
        this.f25231 = iArr2[i8];
        this.f25226 = 0;
        this.f25223 = 0;
        this.f25225 = 256;
        if (!this.f25236) {
            return m14595();
        }
        this.f25233 = 0;
        this.f25232 = 0;
        return m14591();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f25240 != null) {
            return m14593();
        }
        C5925.m11307("Stream closed");
        return 0;
    }
}

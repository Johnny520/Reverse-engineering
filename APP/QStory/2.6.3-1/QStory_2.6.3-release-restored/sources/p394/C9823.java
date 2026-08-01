package p394;

import androidx.activity.AbstractC0900;
import bsh.C3466;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.apache.commons.compress.archivers.zip.C6413;
import p025.AbstractC7012;
import p160.C8376;
import p373.C9731;
import p390.AbstractC9806;
import p395.C9826;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言苏子楪哲世兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9823 extends AbstractC9806 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f25568;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public int f25569;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f25570;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f25571;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f25572;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f25573;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C9824 f25574;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public char f25575;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f25576;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f25577;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f25578;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f25579;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C9822 f25580;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f25581;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f25582;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f25583;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f25584;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C9826 f25585;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f25586;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f25587;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f25588;

    public C9823(C6413 c6413) throws IOException {
        C9822 c9822 = new C9822();
        c9822.f25567 = -1;
        this.f25580 = c9822;
        this.f25582 = 1;
        this.f25585 = new C9826(c6413 == System.in ? new C9731(c6413) : c6413, ByteOrder.BIG_ENDIAN);
        C9826 c9826 = this.f25585;
        if (c9826 != null) {
            int iM15162 = (int) c9826.m15162(8);
            int iM151622 = (int) this.f25585.m15162(8);
            int iM151623 = (int) this.f25585.m15162(8);
            if (iM15162 != 66 || iM151622 != 90 || iM151623 != 104) {
                throw new IOException("Stream is not in the BZip2 format");
            }
            int iM151624 = (int) this.f25585.m15162(8);
            if (iM151624 < 49 || iM151624 > 57) {
                C6755.m11866("BZip2 block size is invalid");
            } else {
                this.f25587 = iM151624 - 48;
                this.f25572 = 0;
            }
        } else {
            C6755.m11866("No InputStream");
        }
        m15153();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m15147(int i, int i2, String str) throws IOException {
        if (i < 0) {
            C6755.m11866(AbstractC0900.m718("Corrupted input, ", str, " value negative"));
        } else {
            if (i < i2) {
                return;
            }
            C6755.m11866(AbstractC0900.m718("Corrupted input, ", str, " value too big"));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m15148(C9826 c9826, int i) throws IOException {
        long jM15162 = c9826.m15162(i);
        if (jM15162 >= 0) {
            return (int) jM15162;
        }
        C6755.m11866("Unexpected end of stream");
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C9826 c9826 = this.f25585;
        if (c9826 != null) {
            try {
                c9826.close();
            } finally {
                this.f25574 = null;
                this.f25585 = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            C8376.m13331(AbstractC0900.m722(i, "offs(", ") < 0."));
            return 0;
        }
        if (i2 < 0) {
            C8376.m13331(AbstractC0900.m722(i2, "len(", ") < 0."));
            return 0;
        }
        int i3 = i + i2;
        if (i3 > bArr.length) {
            C8376.m13331(AbstractC0900.m707(AbstractC0900.m709(i, i2, "offs(", ") + len(", ") > dest.length("), ").", bArr.length));
            return 0;
        }
        if (this.f25585 == null) {
            C6755.m11866("Stream closed");
            return 0;
        }
        if (i2 == 0) {
            return 0;
        }
        int i4 = i;
        while (i4 < i3) {
            int iM15152 = m15152();
            if (iM15152 < 0) {
                break;
            }
            bArr[i4] = (byte) iM15152;
            i4++;
        }
        if (i4 == i) {
            return -1;
        }
        return i4 - i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m15149() throws IOException {
        int i = ~this.f25580.f25567;
        int i2 = this.f25583;
        if (i2 == i) {
            int i3 = this.f25572;
            this.f25572 = i ^ ((i3 >>> 31) | (i3 << 1));
        } else {
            int i4 = this.f25573;
            this.f25572 = ((i4 >>> 31) | (i4 << 1)) ^ i2;
            C6755.m11866("BZip2 CRC error");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int m15150() throws IOException {
        if (this.f25568 > this.f25588) {
            m15149();
            m15153();
            return m15156();
        }
        this.f25569 = this.f25570;
        C9824 c9824 = this.f25574;
        byte[] bArr = c9824.f25597;
        int i = this.f25576;
        int i2 = bArr[i] & DefaultClassResolver.NAME;
        m15147(i, c9824.f25595.length, "su_tPos");
        this.f25576 = this.f25574.f25595[this.f25576];
        int i3 = this.f25578;
        if (i3 == 0) {
            int i4 = this.f25577;
            this.f25578 = AbstractC9821.f25565[i4] - 1;
            int i5 = i4 + 1;
            this.f25577 = i5;
            if (i5 == 512) {
                this.f25577 = 0;
            }
        } else {
            this.f25578 = i3 - 1;
        }
        int i6 = i2 ^ (this.f25578 == 1 ? 1 : 0);
        this.f25570 = i6;
        this.f25568++;
        this.f25582 = 3;
        this.f25580.m15146(i6);
        return i6;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int m15151() {
        if (this.f25579 < this.f25575) {
            this.f25580.m15146(this.f25570);
            this.f25579++;
            return this.f25570;
        }
        this.f25582 = 2;
        this.f25568++;
        this.f25571 = 0;
        return m15150();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m15152() throws IOException {
        switch (this.f25582) {
            case 0:
                return -1;
            case 1:
                return m15156();
            case 2:
                C3466.m5901();
                return 0;
            case 3:
                if (this.f25570 != this.f25569) {
                    this.f25582 = 2;
                    this.f25571 = 1;
                    return m15150();
                }
                int i = this.f25571 + 1;
                this.f25571 = i;
                if (i < 4) {
                    this.f25582 = 2;
                    return m15150();
                }
                C9824 c9824 = this.f25574;
                byte[] bArr = c9824.f25597;
                int i2 = this.f25576;
                this.f25575 = (char) (bArr[i2] & DefaultClassResolver.NAME);
                m15147(i2, c9824.f25595.length, "su_tPos");
                this.f25576 = this.f25574.f25595[this.f25576];
                int i3 = this.f25578;
                if (i3 == 0) {
                    int i4 = this.f25577;
                    this.f25578 = AbstractC9821.f25565[i4] - 1;
                    int i5 = i4 + 1;
                    this.f25577 = i5;
                    if (i5 == 512) {
                        this.f25577 = 0;
                    }
                } else {
                    this.f25578 = i3 - 1;
                }
                this.f25579 = 0;
                this.f25582 = 4;
                if (this.f25578 == 1) {
                    this.f25575 = (char) (this.f25575 ^ 1);
                }
                return m15151();
            case 4:
                return m15151();
            case 5:
                C3466.m5901();
                return 0;
            case 6:
                if (this.f25570 != this.f25569) {
                    this.f25571 = 1;
                    return m15154();
                }
                int i6 = this.f25571 + 1;
                this.f25571 = i6;
                if (i6 < 4) {
                    return m15154();
                }
                m15147(this.f25576, this.f25574.f25597.length, "su_tPos");
                C9824 c98242 = this.f25574;
                byte[] bArr2 = c98242.f25597;
                int i7 = this.f25576;
                this.f25575 = (char) (bArr2[i7] & DefaultClassResolver.NAME);
                this.f25576 = c98242.f25595[i7];
                this.f25579 = 0;
                return m15155();
            case 7:
                return m15155();
            default:
                C3466.m5901();
                return 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m15153() throws IOException {
        char[] cArr;
        char c;
        int i;
        char c2;
        C9826 c9826 = this.f25585;
        char cM15148 = (char) m15148(c9826, 8);
        char cM151482 = (char) m15148(c9826, 8);
        char cM151483 = (char) m15148(c9826, 8);
        char cM151484 = (char) m15148(c9826, 8);
        char cM151485 = (char) m15148(c9826, 8);
        char cM151486 = (char) m15148(c9826, 8);
        char c3 = 0;
        if (cM15148 == 23 && cM151482 == 'r' && cM151483 == 'E' && cM151484 == '8' && cM151485 == 'P' && cM151486 == 144) {
            int iM15148 = m15148(this.f25585, 32);
            this.f25573 = iM15148;
            this.f25582 = 0;
            this.f25574 = null;
            if (iM15148 == this.f25572) {
                return;
            }
            C6755.m11866("BZip2 CRC error");
            return;
        }
        if (cM15148 != '1' || cM151482 != 'A' || cM151483 != 'Y' || cM151484 != '&' || cM151485 != 'S' || cM151486 != 'Y') {
            this.f25582 = 0;
            C6755.m11866("Bad block header");
            return;
        }
        this.f25583 = m15148(c9826, 32);
        int i2 = 1;
        this.f25581 = m15148(c9826, 1) == 1;
        if (this.f25574 == null) {
            this.f25574 = new C9824(this.f25587);
        }
        C9826 c98262 = this.f25585;
        this.f25586 = m15148(c98262, 24);
        C9826 c98263 = this.f25585;
        C9824 c9824 = this.f25574;
        boolean[] zArr = c9824.f25594;
        byte[] bArr = c9824.f25596;
        byte[] bArr2 = c9824.f25592;
        byte[] bArr3 = c9824.f25591;
        int i3 = 0;
        for (int i4 = 0; i4 < 16; i4++) {
            if (m15148(c98263, 1) != 0) {
                i3 |= 1 << i4;
            }
        }
        Arrays.fill(zArr, false);
        for (int i5 = 0; i5 < 16; i5++) {
            if ((i3 & (1 << i5)) != 0) {
                int i6 = i5 << 4;
                for (int i7 = 0; i7 < 16; i7++) {
                    if (m15148(c98263, 1) != 0) {
                        zArr[i6 + i7] = true;
                    }
                }
            }
        }
        C9824 c98242 = this.f25574;
        boolean[] zArr2 = c98242.f25594;
        byte[] bArr4 = c98242.f25593;
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
        this.f25584 = i9;
        int i10 = i9 + 2;
        int iM151482 = m15148(c98263, 3);
        int iM151483 = m15148(c98263, 15);
        if (iM151483 < 0) {
            C6755.m11866("Corrupted input, nSelectors value negative");
            return;
        }
        m15147(i10, 259, "alphaSize");
        m15147(iM151482, 7, "nGroups");
        for (int i11 = c4; i11 < iM151483; i11++) {
            int i12 = c4;
            while (m15148(c98263, 1) != 0) {
                i12++;
            }
            if (i11 < 18002) {
                bArr3[i11] = (byte) i12;
            }
        }
        int iMin = Math.min(iM151483, 18002);
        int i13 = iM151482;
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
            m15147(i15, 6, "selectorMtf");
            byte b = bArr[i15];
            while (i15 > 0) {
                bArr[i15] = bArr[i15 - 1];
                i15--;
            }
            bArr[c4] = b;
            bArr2[i14] = b;
        }
        char[][] cArr2 = c9824.f25601;
        for (int i16 = c4; i16 < iM151482; i16++) {
            int iM151484 = m15148(c98263, 5);
            char[] cArr3 = cArr2[i16];
            for (int i17 = c4; i17 < i10; i17++) {
                while (m15148(c98263, 1) != 0) {
                    iM151484 += m15148(c98263, 1) != 0 ? -1 : 1;
                }
                cArr3[i17] = (char) iM151484;
            }
        }
        C9824 c98243 = this.f25574;
        char[][] cArr4 = c98243.f25601;
        int[] iArr = c98243.f25602;
        int[][] iArr2 = c98243.f25589;
        int[][] iArr3 = c98243.f25599;
        int[][] iArr4 = c98243.f25598;
        int i18 = c4;
        while (i18 < iM151482) {
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
                m15147(c10, 258, "length");
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
        C9824 c98244 = this.f25574;
        byte[] bArr5 = c98244.f25597;
        int[] iArr8 = c98244.f25590;
        byte[] bArr6 = c98244.f25592;
        byte[] bArr7 = c98244.f25593;
        char[] cArr7 = c98244.f25600;
        int[] iArr9 = c98244.f25602;
        int[][] iArr10 = c98244.f25589;
        int[][] iArr11 = c98244.f25599;
        int[][] iArr12 = c98244.f25598;
        int i37 = this.f25587 * 100000;
        int i38 = 256;
        while (true) {
            i38--;
            if (i38 < 0) {
                break;
            }
            cArr7[i38] = (char) i38;
            iArr8[i38] = c4;
        }
        int i39 = this.f25584 + 1;
        C9824 c98245 = this.f25574;
        int i40 = c98245.f25592[c4] & DefaultClassResolver.NAME;
        m15147(i40, 6, "zt");
        int[] iArr13 = c98245.f25589[i40];
        int i41 = c98245.f25602[i40];
        m15147(i41, 258, "zn");
        int iM151485 = m15148(this.f25585, i41);
        int i42 = i41;
        while (iM151485 > iArr13[i42]) {
            int i43 = i42 + 1;
            m15147(i43, 258, "zn");
            i42 = i43;
            iM151485 = (iM151485 << 1) | m15148(this.f25585, i36);
            i36 = 1;
        }
        int i44 = iM151485 - c98245.f25599[i40][i42];
        m15147(i44, 258, "zvec");
        int i45 = c98245.f25598[i40][i44];
        int i46 = bArr6[c4] & DefaultClassResolver.NAME;
        m15147(i46, 6, "zt");
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
                        m15147(i54, 18002, "groupNo");
                        int i55 = bArr6[i54] & DefaultClassResolver.NAME;
                        m15147(i55, 6, "zt");
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
                    m15147(i56, 258, "zn");
                    i47 = i56;
                    int iM151486 = m15148(c98262, i56);
                    int i57 = i47;
                    while (iM151486 > iArr15[i57]) {
                        int i58 = i57 + 1;
                        m15147(i58, 258, "zn");
                        iM151486 = (iM151486 << 1) | m15148(c98262, 1);
                        i57 = i58;
                    }
                    int i59 = iM151486 - iArr21[i57];
                    m15147(i59, 258, "zvec");
                    i53 <<= 1;
                    i45 = iArr17[i59];
                    cArr7 = cArr;
                }
                m15147(i52, this.f25574.f25597.length, "s");
                char c11 = cArr[0];
                m15147(c11, 256, "yy");
                byte b2 = bArr7[c11];
                int i60 = b2 & DefaultClassResolver.NAME;
                iArr8[i60] = i52 + 1 + iArr8[i60];
                int i61 = i48 + 1;
                int i62 = i61 + i52;
                m15147(i62, this.f25574.f25597.length, "lastShadow");
                Arrays.fill(bArr5, i61, i62 + 1, b2);
                if (i62 >= i37) {
                    C6755.m11866(AbstractC7012.m12150(i62, i37, "Block overrun while expanding RLE in MTF, ", " exceeds "));
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
                    C6755.m11866(AbstractC7012.m12150(i48, i37, "Block overrun in MTF, ", " exceeds "));
                    return;
                }
                m15147(i45, 257, "nextSym");
                int i63 = i45 - 1;
                char c12 = cArr7[i63];
                int[] iArr23 = iArr14;
                m15147(c12, 256, "yy");
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
                    m15147(i66, 18002, "groupNo");
                    int i67 = bArr6[i66] & DefaultClassResolver.NAME;
                    m15147(i67, 6, "zt");
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
                m15147(i, 258, "zn");
                int iM151487 = m15148(c98262, i);
                int i68 = i;
                while (iM151487 > iArr15[i68]) {
                    i68++;
                    m15147(i68, 258, "zn");
                    iM151487 = (iM151487 << 1) | m15148(c98262, 1);
                }
                int i69 = iM151487 - iArr23[i68];
                m15147(i69, 258, "zvec");
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
        this.f25588 = i48;
        this.f25580.f25567 = -1;
        this.f25582 = 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int m15154() throws IOException {
        if (this.f25568 > this.f25588) {
            this.f25582 = 5;
            m15149();
            m15153();
            return m15156();
        }
        this.f25569 = this.f25570;
        C9824 c9824 = this.f25574;
        byte[] bArr = c9824.f25597;
        int i = this.f25576;
        int i2 = bArr[i] & DefaultClassResolver.NAME;
        this.f25570 = i2;
        m15147(i, c9824.f25595.length, "su_tPos");
        this.f25576 = this.f25574.f25595[this.f25576];
        this.f25568++;
        this.f25582 = 6;
        this.f25580.m15146(i2);
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int m15155() {
        if (this.f25579 >= this.f25575) {
            this.f25568++;
            this.f25571 = 0;
            return m15154();
        }
        int i = this.f25570;
        this.f25580.m15146(i);
        this.f25579++;
        this.f25582 = 7;
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m15156() throws IOException {
        C9824 c9824;
        if (this.f25582 == 0 || (c9824 = this.f25574) == null) {
            return -1;
        }
        int[] iArr = c9824.f25603;
        int i = this.f25588 + 1;
        int[] iArr2 = c9824.f25595;
        if (iArr2 == null || iArr2.length < i) {
            iArr2 = new int[i];
            c9824.f25595 = iArr2;
        }
        byte[] bArr = c9824.f25597;
        iArr[0] = 0;
        System.arraycopy(c9824.f25590, 0, iArr, 1, 256);
        int i2 = iArr[0];
        for (int i3 = 1; i3 <= 256; i3++) {
            i2 += iArr[i3];
            iArr[i3] = i2;
        }
        int i4 = this.f25588;
        for (int i5 = 0; i5 <= i4; i5++) {
            int i6 = bArr[i5] & DefaultClassResolver.NAME;
            int i7 = iArr[i6];
            iArr[i6] = i7 + 1;
            m15147(i7, i, "tt index");
            iArr2[i7] = i5;
        }
        int i8 = this.f25586;
        if (i8 < 0 || i8 >= iArr2.length) {
            C6755.m11866("Stream corrupted");
            return 0;
        }
        this.f25576 = iArr2[i8];
        this.f25571 = 0;
        this.f25568 = 0;
        this.f25570 = 256;
        if (!this.f25581) {
            return m15154();
        }
        this.f25578 = 0;
        this.f25577 = 0;
        return m15150();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f25585 != null) {
            return m15152();
        }
        C6755.m11866("Stream closed");
        return 0;
    }
}

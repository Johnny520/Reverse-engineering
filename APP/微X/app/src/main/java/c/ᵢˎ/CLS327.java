// Decompiled by JEB v5.42.0.202606242140

package c.ᵢˎ;

import c.ﾞʾ.CLS366;
import com.google.zxing.FormatException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public final class CLS327 {
    public static final class CLS325 {
        public final int FLD1534;
        public final int FLD1535;

        public CLS325(int v, int v1) {
            this.FLD1534 = v;
            this.FLD1535 = v1;
        }

        public int MTH4730() {
            return this.FLD1534;
        }

        public int MTH4731() {
            return this.FLD1535;
        }
    }

    public static final class CLS326 {
        public final int FLD1536;
        public final CLS325[] FLD1537;

        public CLS326(int v, CLS325[] arr_ᵔʼ$ⁱˋ) {
            this.FLD1536 = v;
            this.FLD1537 = arr_ᵔʼ$ⁱˋ;
        }

        public int MTH4733() {
            CLS325[] arr_ᵔʼ$ⁱˋ = this.FLD1537;
            int v1 = 0;
            for(int v = 0; v < arr_ᵔʼ$ⁱˋ.length; ++v) {
                v1 += arr_ᵔʼ$ⁱˋ[v].MTH4730();
            }
            return v1;
        }

        public int MTH4734() {
            int v = this.MTH4733();
            return this.FLD1536 * v;
        }

        public CLS325[] MTH4735() {
            return this.FLD1537;
        }

        public int MTH4736() {
            return this.FLD1536;
        }
    }

    public final CLS326[] FLD1538;
    public static final int[] FLD1539;
    public final int FLD1540;
    public static final CLS327[] FLD1541;
    public final int FLD1542;
    public final int[] FLD1543;

    static {
        CLS327.FLD1539 = new int[]{0x7C94, 0x85BC, 0x9A99, 0xA4D3, 0xBBF6, 51042, 0xD847, 0xE60D, 0xF928, 0x10B78, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 0x1B08E, 0x1CC1A, 0x1D33F, 0x1ED75, 0x1F250, 0x209D5, 0x216F0, 0x228BA, 0x2379F, 0x24B0B, 0x2542E, 158308, 161089, 167017};
        CLS327.FLD1541 = CLS327.MTH4749();
    }

    public CLS327(int v, int[] arr_v, CLS326[] arr_ᵔʼ$ﾞⁱ) {
        this.FLD1542 = v;
        this.FLD1543 = arr_v;
        this.FLD1538 = arr_ᵔʼ$ﾞⁱ;
        int v2 = arr_ᵔʼ$ﾞⁱ[0].MTH4736();
        CLS325[] arr_ᵔʼ$ⁱˋ = arr_ᵔʼ$ﾞⁱ[0].MTH4735();
        int v3 = 0;
        for(int v1 = 0; v1 < arr_ᵔʼ$ⁱˋ.length; ++v1) {
            CLS325 ᵔʼ$ⁱˋ0 = arr_ᵔʼ$ⁱˋ[v1];
            v3 += ᵔʼ$ⁱˋ0.MTH4730() * (ᵔʼ$ⁱˋ0.MTH4731() + v2);
        }
        this.FLD1540 = v3;
    }

    @Override
    public String toString() {
        return String.valueOf(this.FLD1542);
    }

    public static CLS327 MTH4740(int v) {
        int v1 = 0x7FFFFFFF;
        int v3 = 0;
        for(int v2 = 0; true; ++v2) {
            int[] arr_v = CLS327.FLD1539;
            if(v2 >= arr_v.length) {
                break;
            }
            int v4 = arr_v[v2];
            if(v4 == v) {
                return CLS327.MTH4741(v2 + 7);
            }
            int v5 = CLS324.MTH4725(v, v4);
            if(v5 < v1) {
                v3 = v2 + 7;
                v1 = v5;
            }
        }
        return v1 > 3 ? null : CLS327.MTH4741(v3);
    }

    public static CLS327 MTH4741(int v) {
        if(v <= 0 || v > 40) {
            throw new IllegalArgumentException();
        }
        return CLS327.FLD1541[v - 1];
    }

    public int MTH4742() {
        return this.FLD1542 * 4 + 17;
    }

    public int[] MTH4743() {
        return this.FLD1543;
    }

    public CLS326 MTH4744(ErrorCorrectionLevel errorCorrectionLevel0) {
        return this.FLD1538[errorCorrectionLevel0.ordinal()];
    }

    public int MTH4745() {
        return this.FLD1540;
    }

    public int MTH4746() {
        return this.FLD1542;
    }

    public CLS366 MTH4747() {
        int v = this.MTH4742();
        CLS366 ﾞⁱ0 = new CLS366(v);
        ﾞⁱ0.MTH5037(0, 0, 9, 9);
        ﾞⁱ0.MTH5037(v - 8, 0, 8, 9);
        ﾞⁱ0.MTH5037(0, v - 8, 9, 8);
        for(int v1 = 0; v1 < this.FLD1543.length; ++v1) {
            int v2 = this.FLD1543[v1] - 2;
            for(int v3 = 0; v3 < this.FLD1543.length; ++v3) {
                if((v1 != 0 || v3 != 0 && v3 != this.FLD1543.length - 1) && (v1 != this.FLD1543.length - 1 || v3 != 0)) {
                    ﾞⁱ0.MTH5037(this.FLD1543[v3] - 2, v2, 5, 5);
                }
            }
        }
        ﾞⁱ0.MTH5037(6, 9, 1, v - 17);
        ﾞⁱ0.MTH5037(9, 6, v - 17, 1);
        if(this.FLD1542 > 6) {
            ﾞⁱ0.MTH5037(v - 11, 0, 3, 6);
            ﾞⁱ0.MTH5037(0, v - 11, 6, 3);
        }
        return ﾞⁱ0;
    }

    public static CLS327 MTH4748(int v) {
        if(v % 4 == 1) {
            try {
                return CLS327.MTH4741((v - 17) / 4);
            }
            catch(IllegalArgumentException unused_ex) {
                throw FormatException.getFormatInstance();
            }
        }
        throw FormatException.getFormatInstance();
    }

    public static CLS327[] MTH4749() {
        CLS327[] arr_ᵔʼ = new CLS327[40];
        CLS326[] arr_ᵔʼ$ﾞⁱ = {new CLS326(7, new CLS325[]{new CLS325(1, 19)}), new CLS326(10, new CLS325[]{new CLS325(1, 16)}), new CLS326(13, new CLS325[]{new CLS325(1, 13)}), new CLS326(17, new CLS325[]{new CLS325(1, 9)})};
        arr_ᵔʼ[0] = new CLS327(1, new int[0], arr_ᵔʼ$ﾞⁱ);
        CLS326[] arr_ᵔʼ$ﾞⁱ1 = {new CLS326(10, new CLS325[]{new CLS325(1, 34)}), new CLS326(16, new CLS325[]{new CLS325(1, 28)}), new CLS326(22, new CLS325[]{new CLS325(1, 22)}), new CLS326(28, new CLS325[]{new CLS325(1, 16)})};
        arr_ᵔʼ[1] = new CLS327(2, new int[]{6, 18}, arr_ᵔʼ$ﾞⁱ1);
        CLS326[] arr_ᵔʼ$ﾞⁱ2 = {new CLS326(15, new CLS325[]{new CLS325(1, 55)}), new CLS326(26, new CLS325[]{new CLS325(1, 44)}), new CLS326(18, new CLS325[]{new CLS325(2, 17)}), new CLS326(22, new CLS325[]{new CLS325(2, 13)})};
        arr_ᵔʼ[2] = new CLS327(3, new int[]{6, 22}, arr_ᵔʼ$ﾞⁱ2);
        CLS326[] arr_ᵔʼ$ﾞⁱ3 = {new CLS326(20, new CLS325[]{new CLS325(1, 80)}), new CLS326(18, new CLS325[]{new CLS325(2, 0x20)}), new CLS326(26, new CLS325[]{new CLS325(2, 24)}), new CLS326(16, new CLS325[]{new CLS325(4, 9)})};
        arr_ᵔʼ[3] = new CLS327(4, new int[]{6, 26}, arr_ᵔʼ$ﾞⁱ3);
        CLS326[] arr_ᵔʼ$ﾞⁱ4 = {new CLS326(26, new CLS325[]{new CLS325(1, 108)}), new CLS326(24, new CLS325[]{new CLS325(2, 43)}), new CLS326(18, new CLS325[]{new CLS325(2, 15), new CLS325(2, 16)}), new CLS326(22, new CLS325[]{new CLS325(2, 11), new CLS325(2, 12)})};
        arr_ᵔʼ[4] = new CLS327(5, new int[]{6, 30}, arr_ᵔʼ$ﾞⁱ4);
        CLS326[] arr_ᵔʼ$ﾞⁱ5 = {new CLS326(18, new CLS325[]{new CLS325(2, 68)}), new CLS326(16, new CLS325[]{new CLS325(4, 27)}), new CLS326(24, new CLS325[]{new CLS325(4, 19)}), new CLS326(28, new CLS325[]{new CLS325(4, 15)})};
        arr_ᵔʼ[5] = new CLS327(6, new int[]{6, 34}, arr_ᵔʼ$ﾞⁱ5);
        CLS326[] arr_ᵔʼ$ﾞⁱ6 = {new CLS326(20, new CLS325[]{new CLS325(2, 78)}), new CLS326(18, new CLS325[]{new CLS325(4, 0x1F)}), new CLS326(18, new CLS325[]{new CLS325(2, 14), new CLS325(4, 15)}), new CLS326(26, new CLS325[]{new CLS325(4, 13), new CLS325(1, 14)})};
        arr_ᵔʼ[6] = new CLS327(7, new int[]{6, 22, 38}, arr_ᵔʼ$ﾞⁱ6);
        CLS326[] arr_ᵔʼ$ﾞⁱ7 = {new CLS326(24, new CLS325[]{new CLS325(2, 97)}), new CLS326(22, new CLS325[]{new CLS325(2, 38), new CLS325(2, 39)}), new CLS326(22, new CLS325[]{new CLS325(4, 18), new CLS325(2, 19)}), new CLS326(26, new CLS325[]{new CLS325(4, 14), new CLS325(2, 15)})};
        arr_ᵔʼ[7] = new CLS327(8, new int[]{6, 24, 42}, arr_ᵔʼ$ﾞⁱ7);
        CLS326[] arr_ᵔʼ$ﾞⁱ8 = {new CLS326(30, new CLS325[]{new CLS325(2, 0x74)}), new CLS326(22, new CLS325[]{new CLS325(3, 36), new CLS325(2, 37)}), new CLS326(20, new CLS325[]{new CLS325(4, 16), new CLS325(4, 17)}), new CLS326(24, new CLS325[]{new CLS325(4, 12), new CLS325(4, 13)})};
        arr_ᵔʼ[8] = new CLS327(9, new int[]{6, 26, 46}, arr_ᵔʼ$ﾞⁱ8);
        CLS326[] arr_ᵔʼ$ﾞⁱ9 = {new CLS326(18, new CLS325[]{new CLS325(2, 68), new CLS325(2, 69)}), new CLS326(26, new CLS325[]{new CLS325(4, 43), new CLS325(1, 44)}), new CLS326(24, new CLS325[]{new CLS325(6, 19), new CLS325(2, 20)}), new CLS326(28, new CLS325[]{new CLS325(6, 15), new CLS325(2, 16)})};
        arr_ᵔʼ[9] = new CLS327(10, new int[]{6, 28, 50}, arr_ᵔʼ$ﾞⁱ9);
        CLS326[] arr_ᵔʼ$ﾞⁱ10 = {new CLS326(20, new CLS325[]{new CLS325(4, 81)}), new CLS326(30, new CLS325[]{new CLS325(1, 50), new CLS325(4, 51)}), new CLS326(28, new CLS325[]{new CLS325(4, 22), new CLS325(4, 23)}), new CLS326(24, new CLS325[]{new CLS325(3, 12), new CLS325(8, 13)})};
        arr_ᵔʼ[10] = new CLS327(11, new int[]{6, 30, 54}, arr_ᵔʼ$ﾞⁱ10);
        CLS326[] arr_ᵔʼ$ﾞⁱ11 = {new CLS326(24, new CLS325[]{new CLS325(2, 92), new CLS325(2, 93)}), new CLS326(22, new CLS325[]{new CLS325(6, 36), new CLS325(2, 37)}), new CLS326(26, new CLS325[]{new CLS325(4, 20), new CLS325(6, 21)}), new CLS326(28, new CLS325[]{new CLS325(7, 14), new CLS325(4, 15)})};
        arr_ᵔʼ[11] = new CLS327(12, new int[]{6, 0x20, 58}, arr_ᵔʼ$ﾞⁱ11);
        CLS326[] arr_ᵔʼ$ﾞⁱ12 = {new CLS326(26, new CLS325[]{new CLS325(4, 107)}), new CLS326(22, new CLS325[]{new CLS325(8, 37), new CLS325(1, 38)}), new CLS326(24, new CLS325[]{new CLS325(8, 20), new CLS325(4, 21)}), new CLS326(22, new CLS325[]{new CLS325(12, 11), new CLS325(4, 12)})};
        arr_ᵔʼ[12] = new CLS327(13, new int[]{6, 34, 62}, arr_ᵔʼ$ﾞⁱ12);
        CLS326[] arr_ᵔʼ$ﾞⁱ13 = {new CLS326(30, new CLS325[]{new CLS325(3, 0x73), new CLS325(1, 0x74)}), new CLS326(24, new CLS325[]{new CLS325(4, 40), new CLS325(5, 41)}), new CLS326(20, new CLS325[]{new CLS325(11, 16), new CLS325(5, 17)}), new CLS326(24, new CLS325[]{new CLS325(11, 12), new CLS325(5, 13)})};
        arr_ᵔʼ[13] = new CLS327(14, new int[]{6, 26, 46, 66}, arr_ᵔʼ$ﾞⁱ13);
        CLS326[] arr_ᵔʼ$ﾞⁱ14 = {new CLS326(22, new CLS325[]{new CLS325(5, 87), new CLS325(1, 88)}), new CLS326(24, new CLS325[]{new CLS325(5, 41), new CLS325(5, 42)}), new CLS326(30, new CLS325[]{new CLS325(5, 24), new CLS325(7, 25)}), new CLS326(24, new CLS325[]{new CLS325(11, 12), new CLS325(7, 13)})};
        arr_ᵔʼ[14] = new CLS327(15, new int[]{6, 26, 0x30, 70}, arr_ᵔʼ$ﾞⁱ14);
        CLS326[] arr_ᵔʼ$ﾞⁱ15 = {new CLS326(24, new CLS325[]{new CLS325(5, 98), new CLS325(1, 99)}), new CLS326(28, new CLS325[]{new CLS325(7, 45), new CLS325(3, 46)}), new CLS326(24, new CLS325[]{new CLS325(15, 19), new CLS325(2, 20)}), new CLS326(30, new CLS325[]{new CLS325(3, 15), new CLS325(13, 16)})};
        arr_ᵔʼ[15] = new CLS327(16, new int[]{6, 26, 50, 74}, arr_ᵔʼ$ﾞⁱ15);
        CLS326[] arr_ᵔʼ$ﾞⁱ16 = {new CLS326(28, new CLS325[]{new CLS325(1, 107), new CLS325(5, 108)}), new CLS326(28, new CLS325[]{new CLS325(10, 46), new CLS325(1, 0x2F)}), new CLS326(28, new CLS325[]{new CLS325(1, 22), new CLS325(15, 23)}), new CLS326(28, new CLS325[]{new CLS325(2, 14), new CLS325(17, 15)})};
        arr_ᵔʼ[16] = new CLS327(17, new int[]{6, 30, 54, 78}, arr_ᵔʼ$ﾞⁱ16);
        CLS326[] arr_ᵔʼ$ﾞⁱ17 = {new CLS326(30, new CLS325[]{new CLS325(5, 120), new CLS325(1, 0x79)}), new CLS326(26, new CLS325[]{new CLS325(9, 43), new CLS325(4, 44)}), new CLS326(28, new CLS325[]{new CLS325(17, 22), new CLS325(1, 23)}), new CLS326(28, new CLS325[]{new CLS325(2, 14), new CLS325(19, 15)})};
        arr_ᵔʼ[17] = new CLS327(18, new int[]{6, 30, 56, 82}, arr_ᵔʼ$ﾞⁱ17);
        CLS326[] arr_ᵔʼ$ﾞⁱ18 = {new CLS326(28, new CLS325[]{new CLS325(3, 0x71), new CLS325(4, 0x72)}), new CLS326(26, new CLS325[]{new CLS325(3, 44), new CLS325(11, 45)}), new CLS326(26, new CLS325[]{new CLS325(17, 21), new CLS325(4, 22)}), new CLS326(26, new CLS325[]{new CLS325(9, 13), new CLS325(16, 14)})};
        arr_ᵔʼ[18] = new CLS327(19, new int[]{6, 30, 58, 86}, arr_ᵔʼ$ﾞⁱ18);
        CLS326[] arr_ᵔʼ$ﾞⁱ19 = {new CLS326(28, new CLS325[]{new CLS325(3, 107), new CLS325(5, 108)}), new CLS326(26, new CLS325[]{new CLS325(3, 41), new CLS325(13, 42)}), new CLS326(30, new CLS325[]{new CLS325(15, 24), new CLS325(5, 25)}), new CLS326(28, new CLS325[]{new CLS325(15, 15), new CLS325(10, 16)})};
        arr_ᵔʼ[19] = new CLS327(20, new int[]{6, 34, 62, 90}, arr_ᵔʼ$ﾞⁱ19);
        CLS326[] arr_ᵔʼ$ﾞⁱ20 = {new CLS326(28, new CLS325[]{new CLS325(4, 0x74), new CLS325(4, 0x75)}), new CLS326(26, new CLS325[]{new CLS325(17, 42)}), new CLS326(28, new CLS325[]{new CLS325(17, 22), new CLS325(6, 23)}), new CLS326(30, new CLS325[]{new CLS325(19, 16), new CLS325(6, 17)})};
        arr_ᵔʼ[20] = new CLS327(21, new int[]{6, 28, 50, 72, 94}, arr_ᵔʼ$ﾞⁱ20);
        CLS326[] arr_ᵔʼ$ﾞⁱ21 = {new CLS326(28, new CLS325[]{new CLS325(2, 0x6F), new CLS325(7, 0x70)}), new CLS326(28, new CLS325[]{new CLS325(17, 46)}), new CLS326(30, new CLS325[]{new CLS325(7, 24), new CLS325(16, 25)}), new CLS326(24, new CLS325[]{new CLS325(34, 13)})};
        arr_ᵔʼ[21] = new CLS327(22, new int[]{6, 26, 50, 74, 98}, arr_ᵔʼ$ﾞⁱ21);
        CLS326[] arr_ᵔʼ$ﾞⁱ22 = {new CLS326(30, new CLS325[]{new CLS325(4, 0x79), new CLS325(5, 0x7A)}), new CLS326(28, new CLS325[]{new CLS325(4, 0x2F), new CLS325(14, 0x30)}), new CLS326(30, new CLS325[]{new CLS325(11, 24), new CLS325(14, 25)}), new CLS326(30, new CLS325[]{new CLS325(16, 15), new CLS325(14, 16)})};
        arr_ᵔʼ[22] = new CLS327(23, new int[]{6, 30, 54, 78, 102}, arr_ᵔʼ$ﾞⁱ22);
        CLS326[] arr_ᵔʼ$ﾞⁱ23 = {new CLS326(30, new CLS325[]{new CLS325(6, 0x75), new CLS325(4, 0x76)}), new CLS326(28, new CLS325[]{new CLS325(6, 45), new CLS325(14, 46)}), new CLS326(30, new CLS325[]{new CLS325(11, 24), new CLS325(16, 25)}), new CLS326(30, new CLS325[]{new CLS325(30, 16), new CLS325(2, 17)})};
        arr_ᵔʼ[23] = new CLS327(24, new int[]{6, 28, 54, 80, 106}, arr_ᵔʼ$ﾞⁱ23);
        CLS326[] arr_ᵔʼ$ﾞⁱ24 = {new CLS326(26, new CLS325[]{new CLS325(8, 106), new CLS325(4, 107)}), new CLS326(28, new CLS325[]{new CLS325(8, 0x2F), new CLS325(13, 0x30)}), new CLS326(30, new CLS325[]{new CLS325(7, 24), new CLS325(22, 25)}), new CLS326(30, new CLS325[]{new CLS325(22, 15), new CLS325(13, 16)})};
        arr_ᵔʼ[24] = new CLS327(25, new int[]{6, 0x20, 58, 84, 110}, arr_ᵔʼ$ﾞⁱ24);
        CLS326[] arr_ᵔʼ$ﾞⁱ25 = {new CLS326(28, new CLS325[]{new CLS325(10, 0x72), new CLS325(2, 0x73)}), new CLS326(28, new CLS325[]{new CLS325(19, 46), new CLS325(4, 0x2F)}), new CLS326(28, new CLS325[]{new CLS325(28, 22), new CLS325(6, 23)}), new CLS326(30, new CLS325[]{new CLS325(33, 16), new CLS325(4, 17)})};
        arr_ᵔʼ[25] = new CLS327(26, new int[]{6, 30, 58, 86, 0x72}, arr_ᵔʼ$ﾞⁱ25);
        CLS326[] arr_ᵔʼ$ﾞⁱ26 = {new CLS326(30, new CLS325[]{new CLS325(8, 0x7A), new CLS325(4, 0x7B)}), new CLS326(28, new CLS325[]{new CLS325(22, 45), new CLS325(3, 46)}), new CLS326(30, new CLS325[]{new CLS325(8, 23), new CLS325(26, 24)}), new CLS326(30, new CLS325[]{new CLS325(12, 15), new CLS325(28, 16)})};
        arr_ᵔʼ[26] = new CLS327(27, new int[]{6, 34, 62, 90, 0x76}, arr_ᵔʼ$ﾞⁱ26);
        CLS326[] arr_ᵔʼ$ﾞⁱ27 = {new CLS326(30, new CLS325[]{new CLS325(3, 0x75), new CLS325(10, 0x76)}), new CLS326(28, new CLS325[]{new CLS325(3, 45), new CLS325(23, 46)}), new CLS326(30, new CLS325[]{new CLS325(4, 24), new CLS325(0x1F, 25)}), new CLS326(30, new CLS325[]{new CLS325(11, 15), new CLS325(0x1F, 16)})};
        arr_ᵔʼ[27] = new CLS327(28, new int[]{6, 26, 50, 74, 98, 0x7A}, arr_ᵔʼ$ﾞⁱ27);
        CLS326[] arr_ᵔʼ$ﾞⁱ28 = {new CLS326(30, new CLS325[]{new CLS325(7, 0x74), new CLS325(7, 0x75)}), new CLS326(28, new CLS325[]{new CLS325(21, 45), new CLS325(7, 46)}), new CLS326(30, new CLS325[]{new CLS325(1, 23), new CLS325(37, 24)}), new CLS326(30, new CLS325[]{new CLS325(19, 15), new CLS325(26, 16)})};
        arr_ᵔʼ[28] = new CLS327(29, new int[]{6, 30, 54, 78, 102, 0x7E}, arr_ᵔʼ$ﾞⁱ28);
        CLS326[] arr_ᵔʼ$ﾞⁱ29 = {new CLS326(30, new CLS325[]{new CLS325(5, 0x73), new CLS325(10, 0x74)}), new CLS326(28, new CLS325[]{new CLS325(19, 0x2F), new CLS325(10, 0x30)}), new CLS326(30, new CLS325[]{new CLS325(15, 24), new CLS325(25, 25)}), new CLS326(30, new CLS325[]{new CLS325(23, 15), new CLS325(25, 16)})};
        arr_ᵔʼ[29] = new CLS327(30, new int[]{6, 26, 52, 78, 104, 130}, arr_ᵔʼ$ﾞⁱ29);
        CLS326[] arr_ᵔʼ$ﾞⁱ30 = {new CLS326(30, new CLS325[]{new CLS325(13, 0x73), new CLS325(3, 0x74)}), new CLS326(28, new CLS325[]{new CLS325(2, 46), new CLS325(29, 0x2F)}), new CLS326(30, new CLS325[]{new CLS325(42, 24), new CLS325(1, 25)}), new CLS326(30, new CLS325[]{new CLS325(23, 15), new CLS325(28, 16)})};
        arr_ᵔʼ[30] = new CLS327(0x1F, new int[]{6, 30, 56, 82, 108, 0x86}, arr_ᵔʼ$ﾞⁱ30);
        CLS326[] arr_ᵔʼ$ﾞⁱ31 = {new CLS326(30, new CLS325[]{new CLS325(17, 0x73)}), new CLS326(28, new CLS325[]{new CLS325(10, 46), new CLS325(23, 0x2F)}), new CLS326(30, new CLS325[]{new CLS325(10, 24), new CLS325(35, 25)}), new CLS326(30, new CLS325[]{new CLS325(19, 15), new CLS325(35, 16)})};
        arr_ᵔʼ[0x1F] = new CLS327(0x20, new int[]{6, 34, 60, 86, 0x70, 0x8A}, arr_ᵔʼ$ﾞⁱ31);
        CLS326[] arr_ᵔʼ$ﾞⁱ32 = {new CLS326(30, new CLS325[]{new CLS325(17, 0x73), new CLS325(1, 0x74)}), new CLS326(28, new CLS325[]{new CLS325(14, 46), new CLS325(21, 0x2F)}), new CLS326(30, new CLS325[]{new CLS325(29, 24), new CLS325(19, 25)}), new CLS326(30, new CLS325[]{new CLS325(11, 15), new CLS325(46, 16)})};
        arr_ᵔʼ[0x20] = new CLS327(33, new int[]{6, 30, 58, 86, 0x72, 0x8E}, arr_ᵔʼ$ﾞⁱ32);
        CLS326[] arr_ᵔʼ$ﾞⁱ33 = {new CLS326(30, new CLS325[]{new CLS325(13, 0x73), new CLS325(6, 0x74)}), new CLS326(28, new CLS325[]{new CLS325(14, 46), new CLS325(23, 0x2F)}), new CLS326(30, new CLS325[]{new CLS325(44, 24), new CLS325(7, 25)}), new CLS326(30, new CLS325[]{new CLS325(59, 16), new CLS325(1, 17)})};
        arr_ᵔʼ[33] = new CLS327(34, new int[]{6, 34, 62, 90, 0x76, 0x92}, arr_ᵔʼ$ﾞⁱ33);
        CLS326[] arr_ᵔʼ$ﾞⁱ34 = {new CLS326(30, new CLS325[]{new CLS325(12, 0x79), new CLS325(7, 0x7A)}), new CLS326(28, new CLS325[]{new CLS325(12, 0x2F), new CLS325(26, 0x30)}), new CLS326(30, new CLS325[]{new CLS325(39, 24), new CLS325(14, 25)}), new CLS326(30, new CLS325[]{new CLS325(22, 15), new CLS325(41, 16)})};
        arr_ᵔʼ[34] = new CLS327(35, new int[]{6, 30, 54, 78, 102, 0x7E, 150}, arr_ᵔʼ$ﾞⁱ34);
        CLS326[] arr_ᵔʼ$ﾞⁱ35 = {new CLS326(30, new CLS325[]{new CLS325(6, 0x79), new CLS325(14, 0x7A)}), new CLS326(28, new CLS325[]{new CLS325(6, 0x2F), new CLS325(34, 0x30)}), new CLS326(30, new CLS325[]{new CLS325(46, 24), new CLS325(10, 25)}), new CLS326(30, new CLS325[]{new CLS325(2, 15), new CLS325(0x40, 16)})};
        arr_ᵔʼ[35] = new CLS327(36, new int[]{6, 24, 50, 76, 102, 0x80, 0x9A}, arr_ᵔʼ$ﾞⁱ35);
        CLS326[] arr_ᵔʼ$ﾞⁱ36 = {new CLS326(30, new CLS325[]{new CLS325(17, 0x7A), new CLS325(4, 0x7B)}), new CLS326(28, new CLS325[]{new CLS325(29, 46), new CLS325(14, 0x2F)}), new CLS326(30, new CLS325[]{new CLS325(49, 24), new CLS325(10, 25)}), new CLS326(30, new CLS325[]{new CLS325(24, 15), new CLS325(46, 16)})};
        arr_ᵔʼ[36] = new CLS327(37, new int[]{6, 28, 54, 80, 106, 0x84, 0x9E}, arr_ᵔʼ$ﾞⁱ36);
        CLS326[] arr_ᵔʼ$ﾞⁱ37 = {new CLS326(30, new CLS325[]{new CLS325(4, 0x7A), new CLS325(18, 0x7B)}), new CLS326(28, new CLS325[]{new CLS325(13, 46), new CLS325(0x20, 0x2F)}), new CLS326(30, new CLS325[]{new CLS325(0x30, 24), new CLS325(14, 25)}), new CLS326(30, new CLS325[]{new CLS325(42, 15), new CLS325(0x20, 16)})};
        arr_ᵔʼ[37] = new CLS327(38, new int[]{6, 0x20, 58, 84, 110, 0x88, 0xA2}, arr_ᵔʼ$ﾞⁱ37);
        CLS326[] arr_ᵔʼ$ﾞⁱ38 = {new CLS326(30, new CLS325[]{new CLS325(20, 0x75), new CLS325(4, 0x76)}), new CLS326(28, new CLS325[]{new CLS325(40, 0x2F), new CLS325(7, 0x30)}), new CLS326(30, new CLS325[]{new CLS325(43, 24), new CLS325(22, 25)}), new CLS326(30, new CLS325[]{new CLS325(10, 15), new CLS325(67, 16)})};
        arr_ᵔʼ[38] = new CLS327(39, new int[]{6, 26, 54, 82, 110, 0x8A, 0xA6}, arr_ᵔʼ$ﾞⁱ38);
        CLS326[] arr_ᵔʼ$ﾞⁱ39 = {new CLS326(30, new CLS325[]{new CLS325(19, 0x76), new CLS325(6, 0x77)}), new CLS326(28, new CLS325[]{new CLS325(18, 0x2F), new CLS325(0x1F, 0x30)}), new CLS326(30, new CLS325[]{new CLS325(34, 24), new CLS325(34, 25)}), new CLS326(30, new CLS325[]{new CLS325(20, 15), new CLS325(61, 16)})};
        arr_ᵔʼ[39] = new CLS327(40, new int[]{6, 30, 58, 86, 0x72, 0x8E, 170}, arr_ᵔʼ$ﾞⁱ39);
        return arr_ᵔʼ;
    }
}


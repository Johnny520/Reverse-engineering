// Decompiled by JEB v5.42.0.202606242140

package c.ᐧᵔ;

import c.ˎˊ.CLS117;
import com.google.zxing.FormatException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public final class CLS329 {
    public static final class CLS327 {
        public final CLS328[] FLD1499;
        public final int FLD1500;

        public CLS327(int v, CLS328[] arr_ٴⁱ$ˆٴ) {
            this.FLD1500 = v;
            this.FLD1499 = arr_ٴⁱ$ˆٴ;
        }

        public int MTH4731() {
            return this.FLD1500;
        }

        public CLS328[] MTH4732() {
            return this.FLD1499;
        }

        public int MTH4733() {
            CLS328[] arr_ٴⁱ$ˆٴ = this.FLD1499;
            int v1 = 0;
            for(int v = 0; v < arr_ٴⁱ$ˆٴ.length; ++v) {
                v1 += arr_ٴⁱ$ˆٴ[v].MTH4737();
            }
            return v1;
        }

        public int MTH4734() {
            int v = this.MTH4733();
            return this.FLD1500 * v;
        }
    }

    public static final class CLS328 {
        public final int FLD1501;
        public final int FLD1502;

        public CLS328(int v, int v1) {
            this.FLD1502 = v;
            this.FLD1501 = v1;
        }

        public int MTH4736() {
            return this.FLD1501;
        }

        public int MTH4737() {
            return this.FLD1502;
        }
    }

    public final int[] FLD1503;
    public static final int[] FLD1504;
    public final int FLD1505;
    public final CLS327[] FLD1506;
    public static final CLS329[] FLD1507;
    public final int FLD1508;

    static {
        CLS329.FLD1504 = new int[]{0x7C94, 0x85BC, 0x9A99, 0xA4D3, 0xBBF6, 51042, 0xD847, 0xE60D, 0xF928, 0x10B78, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 0x1B08E, 0x1CC1A, 0x1D33F, 0x1ED75, 0x1F250, 0x209D5, 0x216F0, 0x228BA, 0x2379F, 0x24B0B, 0x2542E, 158308, 161089, 167017};
        CLS329.FLD1507 = CLS329.MTH4741();
    }

    public CLS329(int v, int[] arr_v, CLS327[] arr_ٴⁱ$ʻᵢ) {
        this.FLD1505 = v;
        this.FLD1503 = arr_v;
        this.FLD1506 = arr_ٴⁱ$ʻᵢ;
        int v2 = arr_ٴⁱ$ʻᵢ[0].MTH4731();
        CLS328[] arr_ٴⁱ$ˆٴ = arr_ٴⁱ$ʻᵢ[0].MTH4732();
        int v3 = 0;
        for(int v1 = 0; v1 < arr_ٴⁱ$ˆٴ.length; ++v1) {
            CLS328 ٴⁱ$ˆٴ0 = arr_ٴⁱ$ˆٴ[v1];
            v3 += ٴⁱ$ˆٴ0.MTH4737() * (ٴⁱ$ˆٴ0.MTH4736() + v2);
        }
        this.FLD1508 = v3;
    }

    @Override
    public String toString() {
        return String.valueOf(this.FLD1505);
    }

    public static CLS329[] MTH4741() {
        CLS329[] arr_ٴⁱ = new CLS329[40];
        CLS327[] arr_ٴⁱ$ʻᵢ = {new CLS327(7, new CLS328[]{new CLS328(1, 19)}), new CLS327(10, new CLS328[]{new CLS328(1, 16)}), new CLS327(13, new CLS328[]{new CLS328(1, 13)}), new CLS327(17, new CLS328[]{new CLS328(1, 9)})};
        arr_ٴⁱ[0] = new CLS329(1, new int[0], arr_ٴⁱ$ʻᵢ);
        CLS327[] arr_ٴⁱ$ʻᵢ1 = {new CLS327(10, new CLS328[]{new CLS328(1, 34)}), new CLS327(16, new CLS328[]{new CLS328(1, 28)}), new CLS327(22, new CLS328[]{new CLS328(1, 22)}), new CLS327(28, new CLS328[]{new CLS328(1, 16)})};
        arr_ٴⁱ[1] = new CLS329(2, new int[]{6, 18}, arr_ٴⁱ$ʻᵢ1);
        CLS327[] arr_ٴⁱ$ʻᵢ2 = {new CLS327(15, new CLS328[]{new CLS328(1, 55)}), new CLS327(26, new CLS328[]{new CLS328(1, 44)}), new CLS327(18, new CLS328[]{new CLS328(2, 17)}), new CLS327(22, new CLS328[]{new CLS328(2, 13)})};
        arr_ٴⁱ[2] = new CLS329(3, new int[]{6, 22}, arr_ٴⁱ$ʻᵢ2);
        CLS327[] arr_ٴⁱ$ʻᵢ3 = {new CLS327(20, new CLS328[]{new CLS328(1, 80)}), new CLS327(18, new CLS328[]{new CLS328(2, 0x20)}), new CLS327(26, new CLS328[]{new CLS328(2, 24)}), new CLS327(16, new CLS328[]{new CLS328(4, 9)})};
        arr_ٴⁱ[3] = new CLS329(4, new int[]{6, 26}, arr_ٴⁱ$ʻᵢ3);
        CLS327[] arr_ٴⁱ$ʻᵢ4 = {new CLS327(26, new CLS328[]{new CLS328(1, 108)}), new CLS327(24, new CLS328[]{new CLS328(2, 43)}), new CLS327(18, new CLS328[]{new CLS328(2, 15), new CLS328(2, 16)}), new CLS327(22, new CLS328[]{new CLS328(2, 11), new CLS328(2, 12)})};
        arr_ٴⁱ[4] = new CLS329(5, new int[]{6, 30}, arr_ٴⁱ$ʻᵢ4);
        CLS327[] arr_ٴⁱ$ʻᵢ5 = {new CLS327(18, new CLS328[]{new CLS328(2, 68)}), new CLS327(16, new CLS328[]{new CLS328(4, 27)}), new CLS327(24, new CLS328[]{new CLS328(4, 19)}), new CLS327(28, new CLS328[]{new CLS328(4, 15)})};
        arr_ٴⁱ[5] = new CLS329(6, new int[]{6, 34}, arr_ٴⁱ$ʻᵢ5);
        CLS327[] arr_ٴⁱ$ʻᵢ6 = {new CLS327(20, new CLS328[]{new CLS328(2, 78)}), new CLS327(18, new CLS328[]{new CLS328(4, 0x1F)}), new CLS327(18, new CLS328[]{new CLS328(2, 14), new CLS328(4, 15)}), new CLS327(26, new CLS328[]{new CLS328(4, 13), new CLS328(1, 14)})};
        arr_ٴⁱ[6] = new CLS329(7, new int[]{6, 22, 38}, arr_ٴⁱ$ʻᵢ6);
        CLS327[] arr_ٴⁱ$ʻᵢ7 = {new CLS327(24, new CLS328[]{new CLS328(2, 97)}), new CLS327(22, new CLS328[]{new CLS328(2, 38), new CLS328(2, 39)}), new CLS327(22, new CLS328[]{new CLS328(4, 18), new CLS328(2, 19)}), new CLS327(26, new CLS328[]{new CLS328(4, 14), new CLS328(2, 15)})};
        arr_ٴⁱ[7] = new CLS329(8, new int[]{6, 24, 42}, arr_ٴⁱ$ʻᵢ7);
        CLS327[] arr_ٴⁱ$ʻᵢ8 = {new CLS327(30, new CLS328[]{new CLS328(2, 0x74)}), new CLS327(22, new CLS328[]{new CLS328(3, 36), new CLS328(2, 37)}), new CLS327(20, new CLS328[]{new CLS328(4, 16), new CLS328(4, 17)}), new CLS327(24, new CLS328[]{new CLS328(4, 12), new CLS328(4, 13)})};
        arr_ٴⁱ[8] = new CLS329(9, new int[]{6, 26, 46}, arr_ٴⁱ$ʻᵢ8);
        CLS327[] arr_ٴⁱ$ʻᵢ9 = {new CLS327(18, new CLS328[]{new CLS328(2, 68), new CLS328(2, 69)}), new CLS327(26, new CLS328[]{new CLS328(4, 43), new CLS328(1, 44)}), new CLS327(24, new CLS328[]{new CLS328(6, 19), new CLS328(2, 20)}), new CLS327(28, new CLS328[]{new CLS328(6, 15), new CLS328(2, 16)})};
        arr_ٴⁱ[9] = new CLS329(10, new int[]{6, 28, 50}, arr_ٴⁱ$ʻᵢ9);
        CLS327[] arr_ٴⁱ$ʻᵢ10 = {new CLS327(20, new CLS328[]{new CLS328(4, 81)}), new CLS327(30, new CLS328[]{new CLS328(1, 50), new CLS328(4, 51)}), new CLS327(28, new CLS328[]{new CLS328(4, 22), new CLS328(4, 23)}), new CLS327(24, new CLS328[]{new CLS328(3, 12), new CLS328(8, 13)})};
        arr_ٴⁱ[10] = new CLS329(11, new int[]{6, 30, 54}, arr_ٴⁱ$ʻᵢ10);
        CLS327[] arr_ٴⁱ$ʻᵢ11 = {new CLS327(24, new CLS328[]{new CLS328(2, 92), new CLS328(2, 93)}), new CLS327(22, new CLS328[]{new CLS328(6, 36), new CLS328(2, 37)}), new CLS327(26, new CLS328[]{new CLS328(4, 20), new CLS328(6, 21)}), new CLS327(28, new CLS328[]{new CLS328(7, 14), new CLS328(4, 15)})};
        arr_ٴⁱ[11] = new CLS329(12, new int[]{6, 0x20, 58}, arr_ٴⁱ$ʻᵢ11);
        CLS327[] arr_ٴⁱ$ʻᵢ12 = {new CLS327(26, new CLS328[]{new CLS328(4, 107)}), new CLS327(22, new CLS328[]{new CLS328(8, 37), new CLS328(1, 38)}), new CLS327(24, new CLS328[]{new CLS328(8, 20), new CLS328(4, 21)}), new CLS327(22, new CLS328[]{new CLS328(12, 11), new CLS328(4, 12)})};
        arr_ٴⁱ[12] = new CLS329(13, new int[]{6, 34, 62}, arr_ٴⁱ$ʻᵢ12);
        CLS327[] arr_ٴⁱ$ʻᵢ13 = {new CLS327(30, new CLS328[]{new CLS328(3, 0x73), new CLS328(1, 0x74)}), new CLS327(24, new CLS328[]{new CLS328(4, 40), new CLS328(5, 41)}), new CLS327(20, new CLS328[]{new CLS328(11, 16), new CLS328(5, 17)}), new CLS327(24, new CLS328[]{new CLS328(11, 12), new CLS328(5, 13)})};
        arr_ٴⁱ[13] = new CLS329(14, new int[]{6, 26, 46, 66}, arr_ٴⁱ$ʻᵢ13);
        CLS327[] arr_ٴⁱ$ʻᵢ14 = {new CLS327(22, new CLS328[]{new CLS328(5, 87), new CLS328(1, 88)}), new CLS327(24, new CLS328[]{new CLS328(5, 41), new CLS328(5, 42)}), new CLS327(30, new CLS328[]{new CLS328(5, 24), new CLS328(7, 25)}), new CLS327(24, new CLS328[]{new CLS328(11, 12), new CLS328(7, 13)})};
        arr_ٴⁱ[14] = new CLS329(15, new int[]{6, 26, 0x30, 70}, arr_ٴⁱ$ʻᵢ14);
        CLS327[] arr_ٴⁱ$ʻᵢ15 = {new CLS327(24, new CLS328[]{new CLS328(5, 98), new CLS328(1, 99)}), new CLS327(28, new CLS328[]{new CLS328(7, 45), new CLS328(3, 46)}), new CLS327(24, new CLS328[]{new CLS328(15, 19), new CLS328(2, 20)}), new CLS327(30, new CLS328[]{new CLS328(3, 15), new CLS328(13, 16)})};
        arr_ٴⁱ[15] = new CLS329(16, new int[]{6, 26, 50, 74}, arr_ٴⁱ$ʻᵢ15);
        CLS327[] arr_ٴⁱ$ʻᵢ16 = {new CLS327(28, new CLS328[]{new CLS328(1, 107), new CLS328(5, 108)}), new CLS327(28, new CLS328[]{new CLS328(10, 46), new CLS328(1, 0x2F)}), new CLS327(28, new CLS328[]{new CLS328(1, 22), new CLS328(15, 23)}), new CLS327(28, new CLS328[]{new CLS328(2, 14), new CLS328(17, 15)})};
        arr_ٴⁱ[16] = new CLS329(17, new int[]{6, 30, 54, 78}, arr_ٴⁱ$ʻᵢ16);
        CLS327[] arr_ٴⁱ$ʻᵢ17 = {new CLS327(30, new CLS328[]{new CLS328(5, 120), new CLS328(1, 0x79)}), new CLS327(26, new CLS328[]{new CLS328(9, 43), new CLS328(4, 44)}), new CLS327(28, new CLS328[]{new CLS328(17, 22), new CLS328(1, 23)}), new CLS327(28, new CLS328[]{new CLS328(2, 14), new CLS328(19, 15)})};
        arr_ٴⁱ[17] = new CLS329(18, new int[]{6, 30, 56, 82}, arr_ٴⁱ$ʻᵢ17);
        CLS327[] arr_ٴⁱ$ʻᵢ18 = {new CLS327(28, new CLS328[]{new CLS328(3, 0x71), new CLS328(4, 0x72)}), new CLS327(26, new CLS328[]{new CLS328(3, 44), new CLS328(11, 45)}), new CLS327(26, new CLS328[]{new CLS328(17, 21), new CLS328(4, 22)}), new CLS327(26, new CLS328[]{new CLS328(9, 13), new CLS328(16, 14)})};
        arr_ٴⁱ[18] = new CLS329(19, new int[]{6, 30, 58, 86}, arr_ٴⁱ$ʻᵢ18);
        CLS327[] arr_ٴⁱ$ʻᵢ19 = {new CLS327(28, new CLS328[]{new CLS328(3, 107), new CLS328(5, 108)}), new CLS327(26, new CLS328[]{new CLS328(3, 41), new CLS328(13, 42)}), new CLS327(30, new CLS328[]{new CLS328(15, 24), new CLS328(5, 25)}), new CLS327(28, new CLS328[]{new CLS328(15, 15), new CLS328(10, 16)})};
        arr_ٴⁱ[19] = new CLS329(20, new int[]{6, 34, 62, 90}, arr_ٴⁱ$ʻᵢ19);
        CLS327[] arr_ٴⁱ$ʻᵢ20 = {new CLS327(28, new CLS328[]{new CLS328(4, 0x74), new CLS328(4, 0x75)}), new CLS327(26, new CLS328[]{new CLS328(17, 42)}), new CLS327(28, new CLS328[]{new CLS328(17, 22), new CLS328(6, 23)}), new CLS327(30, new CLS328[]{new CLS328(19, 16), new CLS328(6, 17)})};
        arr_ٴⁱ[20] = new CLS329(21, new int[]{6, 28, 50, 72, 94}, arr_ٴⁱ$ʻᵢ20);
        CLS327[] arr_ٴⁱ$ʻᵢ21 = {new CLS327(28, new CLS328[]{new CLS328(2, 0x6F), new CLS328(7, 0x70)}), new CLS327(28, new CLS328[]{new CLS328(17, 46)}), new CLS327(30, new CLS328[]{new CLS328(7, 24), new CLS328(16, 25)}), new CLS327(24, new CLS328[]{new CLS328(34, 13)})};
        arr_ٴⁱ[21] = new CLS329(22, new int[]{6, 26, 50, 74, 98}, arr_ٴⁱ$ʻᵢ21);
        CLS327[] arr_ٴⁱ$ʻᵢ22 = {new CLS327(30, new CLS328[]{new CLS328(4, 0x79), new CLS328(5, 0x7A)}), new CLS327(28, new CLS328[]{new CLS328(4, 0x2F), new CLS328(14, 0x30)}), new CLS327(30, new CLS328[]{new CLS328(11, 24), new CLS328(14, 25)}), new CLS327(30, new CLS328[]{new CLS328(16, 15), new CLS328(14, 16)})};
        arr_ٴⁱ[22] = new CLS329(23, new int[]{6, 30, 54, 78, 102}, arr_ٴⁱ$ʻᵢ22);
        CLS327[] arr_ٴⁱ$ʻᵢ23 = {new CLS327(30, new CLS328[]{new CLS328(6, 0x75), new CLS328(4, 0x76)}), new CLS327(28, new CLS328[]{new CLS328(6, 45), new CLS328(14, 46)}), new CLS327(30, new CLS328[]{new CLS328(11, 24), new CLS328(16, 25)}), new CLS327(30, new CLS328[]{new CLS328(30, 16), new CLS328(2, 17)})};
        arr_ٴⁱ[23] = new CLS329(24, new int[]{6, 28, 54, 80, 106}, arr_ٴⁱ$ʻᵢ23);
        CLS327[] arr_ٴⁱ$ʻᵢ24 = {new CLS327(26, new CLS328[]{new CLS328(8, 106), new CLS328(4, 107)}), new CLS327(28, new CLS328[]{new CLS328(8, 0x2F), new CLS328(13, 0x30)}), new CLS327(30, new CLS328[]{new CLS328(7, 24), new CLS328(22, 25)}), new CLS327(30, new CLS328[]{new CLS328(22, 15), new CLS328(13, 16)})};
        arr_ٴⁱ[24] = new CLS329(25, new int[]{6, 0x20, 58, 84, 110}, arr_ٴⁱ$ʻᵢ24);
        CLS327[] arr_ٴⁱ$ʻᵢ25 = {new CLS327(28, new CLS328[]{new CLS328(10, 0x72), new CLS328(2, 0x73)}), new CLS327(28, new CLS328[]{new CLS328(19, 46), new CLS328(4, 0x2F)}), new CLS327(28, new CLS328[]{new CLS328(28, 22), new CLS328(6, 23)}), new CLS327(30, new CLS328[]{new CLS328(33, 16), new CLS328(4, 17)})};
        arr_ٴⁱ[25] = new CLS329(26, new int[]{6, 30, 58, 86, 0x72}, arr_ٴⁱ$ʻᵢ25);
        CLS327[] arr_ٴⁱ$ʻᵢ26 = {new CLS327(30, new CLS328[]{new CLS328(8, 0x7A), new CLS328(4, 0x7B)}), new CLS327(28, new CLS328[]{new CLS328(22, 45), new CLS328(3, 46)}), new CLS327(30, new CLS328[]{new CLS328(8, 23), new CLS328(26, 24)}), new CLS327(30, new CLS328[]{new CLS328(12, 15), new CLS328(28, 16)})};
        arr_ٴⁱ[26] = new CLS329(27, new int[]{6, 34, 62, 90, 0x76}, arr_ٴⁱ$ʻᵢ26);
        CLS327[] arr_ٴⁱ$ʻᵢ27 = {new CLS327(30, new CLS328[]{new CLS328(3, 0x75), new CLS328(10, 0x76)}), new CLS327(28, new CLS328[]{new CLS328(3, 45), new CLS328(23, 46)}), new CLS327(30, new CLS328[]{new CLS328(4, 24), new CLS328(0x1F, 25)}), new CLS327(30, new CLS328[]{new CLS328(11, 15), new CLS328(0x1F, 16)})};
        arr_ٴⁱ[27] = new CLS329(28, new int[]{6, 26, 50, 74, 98, 0x7A}, arr_ٴⁱ$ʻᵢ27);
        CLS327[] arr_ٴⁱ$ʻᵢ28 = {new CLS327(30, new CLS328[]{new CLS328(7, 0x74), new CLS328(7, 0x75)}), new CLS327(28, new CLS328[]{new CLS328(21, 45), new CLS328(7, 46)}), new CLS327(30, new CLS328[]{new CLS328(1, 23), new CLS328(37, 24)}), new CLS327(30, new CLS328[]{new CLS328(19, 15), new CLS328(26, 16)})};
        arr_ٴⁱ[28] = new CLS329(29, new int[]{6, 30, 54, 78, 102, 0x7E}, arr_ٴⁱ$ʻᵢ28);
        CLS327[] arr_ٴⁱ$ʻᵢ29 = {new CLS327(30, new CLS328[]{new CLS328(5, 0x73), new CLS328(10, 0x74)}), new CLS327(28, new CLS328[]{new CLS328(19, 0x2F), new CLS328(10, 0x30)}), new CLS327(30, new CLS328[]{new CLS328(15, 24), new CLS328(25, 25)}), new CLS327(30, new CLS328[]{new CLS328(23, 15), new CLS328(25, 16)})};
        arr_ٴⁱ[29] = new CLS329(30, new int[]{6, 26, 52, 78, 104, 130}, arr_ٴⁱ$ʻᵢ29);
        CLS327[] arr_ٴⁱ$ʻᵢ30 = {new CLS327(30, new CLS328[]{new CLS328(13, 0x73), new CLS328(3, 0x74)}), new CLS327(28, new CLS328[]{new CLS328(2, 46), new CLS328(29, 0x2F)}), new CLS327(30, new CLS328[]{new CLS328(42, 24), new CLS328(1, 25)}), new CLS327(30, new CLS328[]{new CLS328(23, 15), new CLS328(28, 16)})};
        arr_ٴⁱ[30] = new CLS329(0x1F, new int[]{6, 30, 56, 82, 108, 0x86}, arr_ٴⁱ$ʻᵢ30);
        CLS327[] arr_ٴⁱ$ʻᵢ31 = {new CLS327(30, new CLS328[]{new CLS328(17, 0x73)}), new CLS327(28, new CLS328[]{new CLS328(10, 46), new CLS328(23, 0x2F)}), new CLS327(30, new CLS328[]{new CLS328(10, 24), new CLS328(35, 25)}), new CLS327(30, new CLS328[]{new CLS328(19, 15), new CLS328(35, 16)})};
        arr_ٴⁱ[0x1F] = new CLS329(0x20, new int[]{6, 34, 60, 86, 0x70, 0x8A}, arr_ٴⁱ$ʻᵢ31);
        CLS327[] arr_ٴⁱ$ʻᵢ32 = {new CLS327(30, new CLS328[]{new CLS328(17, 0x73), new CLS328(1, 0x74)}), new CLS327(28, new CLS328[]{new CLS328(14, 46), new CLS328(21, 0x2F)}), new CLS327(30, new CLS328[]{new CLS328(29, 24), new CLS328(19, 25)}), new CLS327(30, new CLS328[]{new CLS328(11, 15), new CLS328(46, 16)})};
        arr_ٴⁱ[0x20] = new CLS329(33, new int[]{6, 30, 58, 86, 0x72, 0x8E}, arr_ٴⁱ$ʻᵢ32);
        CLS327[] arr_ٴⁱ$ʻᵢ33 = {new CLS327(30, new CLS328[]{new CLS328(13, 0x73), new CLS328(6, 0x74)}), new CLS327(28, new CLS328[]{new CLS328(14, 46), new CLS328(23, 0x2F)}), new CLS327(30, new CLS328[]{new CLS328(44, 24), new CLS328(7, 25)}), new CLS327(30, new CLS328[]{new CLS328(59, 16), new CLS328(1, 17)})};
        arr_ٴⁱ[33] = new CLS329(34, new int[]{6, 34, 62, 90, 0x76, 0x92}, arr_ٴⁱ$ʻᵢ33);
        CLS327[] arr_ٴⁱ$ʻᵢ34 = {new CLS327(30, new CLS328[]{new CLS328(12, 0x79), new CLS328(7, 0x7A)}), new CLS327(28, new CLS328[]{new CLS328(12, 0x2F), new CLS328(26, 0x30)}), new CLS327(30, new CLS328[]{new CLS328(39, 24), new CLS328(14, 25)}), new CLS327(30, new CLS328[]{new CLS328(22, 15), new CLS328(41, 16)})};
        arr_ٴⁱ[34] = new CLS329(35, new int[]{6, 30, 54, 78, 102, 0x7E, 150}, arr_ٴⁱ$ʻᵢ34);
        CLS327[] arr_ٴⁱ$ʻᵢ35 = {new CLS327(30, new CLS328[]{new CLS328(6, 0x79), new CLS328(14, 0x7A)}), new CLS327(28, new CLS328[]{new CLS328(6, 0x2F), new CLS328(34, 0x30)}), new CLS327(30, new CLS328[]{new CLS328(46, 24), new CLS328(10, 25)}), new CLS327(30, new CLS328[]{new CLS328(2, 15), new CLS328(0x40, 16)})};
        arr_ٴⁱ[35] = new CLS329(36, new int[]{6, 24, 50, 76, 102, 0x80, 0x9A}, arr_ٴⁱ$ʻᵢ35);
        CLS327[] arr_ٴⁱ$ʻᵢ36 = {new CLS327(30, new CLS328[]{new CLS328(17, 0x7A), new CLS328(4, 0x7B)}), new CLS327(28, new CLS328[]{new CLS328(29, 46), new CLS328(14, 0x2F)}), new CLS327(30, new CLS328[]{new CLS328(49, 24), new CLS328(10, 25)}), new CLS327(30, new CLS328[]{new CLS328(24, 15), new CLS328(46, 16)})};
        arr_ٴⁱ[36] = new CLS329(37, new int[]{6, 28, 54, 80, 106, 0x84, 0x9E}, arr_ٴⁱ$ʻᵢ36);
        CLS327[] arr_ٴⁱ$ʻᵢ37 = {new CLS327(30, new CLS328[]{new CLS328(4, 0x7A), new CLS328(18, 0x7B)}), new CLS327(28, new CLS328[]{new CLS328(13, 46), new CLS328(0x20, 0x2F)}), new CLS327(30, new CLS328[]{new CLS328(0x30, 24), new CLS328(14, 25)}), new CLS327(30, new CLS328[]{new CLS328(42, 15), new CLS328(0x20, 16)})};
        arr_ٴⁱ[37] = new CLS329(38, new int[]{6, 0x20, 58, 84, 110, 0x88, 0xA2}, arr_ٴⁱ$ʻᵢ37);
        CLS327[] arr_ٴⁱ$ʻᵢ38 = {new CLS327(30, new CLS328[]{new CLS328(20, 0x75), new CLS328(4, 0x76)}), new CLS327(28, new CLS328[]{new CLS328(40, 0x2F), new CLS328(7, 0x30)}), new CLS327(30, new CLS328[]{new CLS328(43, 24), new CLS328(22, 25)}), new CLS327(30, new CLS328[]{new CLS328(10, 15), new CLS328(67, 16)})};
        arr_ٴⁱ[38] = new CLS329(39, new int[]{6, 26, 54, 82, 110, 0x8A, 0xA6}, arr_ٴⁱ$ʻᵢ38);
        CLS327[] arr_ٴⁱ$ʻᵢ39 = {new CLS327(30, new CLS328[]{new CLS328(19, 0x76), new CLS328(6, 0x77)}), new CLS327(28, new CLS328[]{new CLS328(18, 0x2F), new CLS328(0x1F, 0x30)}), new CLS327(30, new CLS328[]{new CLS328(34, 24), new CLS328(34, 25)}), new CLS327(30, new CLS328[]{new CLS328(20, 15), new CLS328(61, 16)})};
        arr_ٴⁱ[39] = new CLS329(40, new int[]{6, 30, 58, 86, 0x72, 0x8E, 170}, arr_ٴⁱ$ʻᵢ39);
        return arr_ٴⁱ;
    }

    public int MTH4742() {
        return this.FLD1505 * 4 + 17;
    }

    public CLS117 MTH4743() {
        int v = this.MTH4742();
        CLS117 ʻᵢ0 = new CLS117(v);
        ʻᵢ0.MTH2326(0, 0, 9, 9);
        ʻᵢ0.MTH2326(v - 8, 0, 8, 9);
        ʻᵢ0.MTH2326(0, v - 8, 9, 8);
        for(int v1 = 0; v1 < this.FLD1503.length; ++v1) {
            int v2 = this.FLD1503[v1] - 2;
            for(int v3 = 0; v3 < this.FLD1503.length; ++v3) {
                if((v1 != 0 || v3 != 0 && v3 != this.FLD1503.length - 1) && (v1 != this.FLD1503.length - 1 || v3 != 0)) {
                    ʻᵢ0.MTH2326(this.FLD1503[v3] - 2, v2, 5, 5);
                }
            }
        }
        ʻᵢ0.MTH2326(6, 9, 1, v - 17);
        ʻᵢ0.MTH2326(9, 6, v - 17, 1);
        if(this.FLD1505 > 6) {
            ʻᵢ0.MTH2326(v - 11, 0, 3, 6);
            ʻᵢ0.MTH2326(0, v - 11, 6, 3);
        }
        return ʻᵢ0;
    }

    public static CLS329 MTH4744(int v) {
        if(v <= 0 || v > 40) {
            throw new IllegalArgumentException();
        }
        return CLS329.FLD1507[v - 1];
    }

    public int MTH4745() {
        return this.FLD1505;
    }

    public static CLS329 MTH4746(int v) {
        int v1 = 0x7FFFFFFF;
        int v3 = 0;
        for(int v2 = 0; true; ++v2) {
            int[] arr_v = CLS329.FLD1504;
            if(v2 >= arr_v.length) {
                break;
            }
            int v4 = arr_v[v2];
            if(v4 == v) {
                return CLS329.MTH4744(v2 + 7);
            }
            int v5 = CLS330.MTH4756(v, v4);
            if(v5 < v1) {
                v3 = v2 + 7;
                v1 = v5;
            }
        }
        return v1 > 3 ? null : CLS329.MTH4744(v3);
    }

    public static CLS329 MTH4747(int v) {
        if(v % 4 == 1) {
            try {
                return CLS329.MTH4744((v - 17) / 4);
            }
            catch(IllegalArgumentException unused_ex) {
                throw FormatException.getFormatInstance();
            }
        }
        throw FormatException.getFormatInstance();
    }

    public int MTH4748() {
        return this.FLD1508;
    }

    public CLS327 MTH4749(ErrorCorrectionLevel errorCorrectionLevel0) {
        return this.FLD1506[errorCorrectionLevel0.ordinal()];
    }

    public int[] MTH4750() {
        return this.FLD1503;
    }
}


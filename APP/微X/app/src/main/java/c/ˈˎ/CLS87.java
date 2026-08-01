// Decompiled by JEB v5.42.0.202606242140

package c.ˈˎ;

import com.google.zxing.FormatException;

public final class CLS87 {
    public static final class CLS84 {
        public final int FLD442;
        public final int FLD443;

        public CLS84(int v, int v1) {
            this.FLD443 = v;
            this.FLD442 = v1;
        }

        public CLS84(int v, int v1, CLS85 ʿˊ$ˆٴ0) {
            this(v, v1);
        }

        public int MTH1914() {
            return this.FLD442;
        }

        public int MTH1915() {
            return this.FLD443;
        }
    }

    public static class CLS85 {
    }

    public static final class CLS86 {
        public final CLS84[] FLD444;
        public final int FLD445;

        public CLS86(int v, CLS84 ʿˊ$ʻᵢ0) {
            this.FLD445 = v;
            this.FLD444 = new CLS84[]{ʿˊ$ʻᵢ0};
        }

        public CLS86(int v, CLS84 ʿˊ$ʻᵢ0, CLS84 ʿˊ$ʻᵢ1) {
            this.FLD445 = v;
            this.FLD444 = new CLS84[]{ʿˊ$ʻᵢ0, ʿˊ$ʻᵢ1};
        }

        public CLS86(int v, CLS84 ʿˊ$ʻᵢ0, CLS84 ʿˊ$ʻᵢ1, CLS85 ʿˊ$ˆٴ0) {
            this(v, ʿˊ$ʻᵢ0, ʿˊ$ʻᵢ1);
        }

        public CLS86(int v, CLS84 ʿˊ$ʻᵢ0, CLS85 ʿˊ$ˆٴ0) {
            this(v, ʿˊ$ʻᵢ0);
        }

        public int MTH1920() {
            return this.FLD445;
        }

        public CLS84[] MTH1921() {
            return this.FLD444;
        }
    }

    public final int FLD446;
    public final int FLD447;
    public final int FLD448;
    public final int FLD449;
    public final int FLD450;
    public static final CLS87[] FLD451;
    public final CLS86 FLD452;
    public final int FLD453;

    static {
        CLS87.FLD451 = CLS87.MTH1927();
    }

    public CLS87(int v, int v1, int v2, int v3, int v4, CLS86 ʿˊ$ـᵎ0) {
        this.FLD448 = v;
        this.FLD446 = v1;
        this.FLD449 = v2;
        this.FLD453 = v3;
        this.FLD447 = v4;
        this.FLD452 = ʿˊ$ـᵎ0;
        int v5 = ʿˊ$ـᵎ0.MTH1920();
        CLS84[] arr_ʿˊ$ʻᵢ = ʿˊ$ـᵎ0.MTH1921();
        int v7 = 0;
        for(int v6 = 0; v6 < arr_ʿˊ$ʻᵢ.length; ++v6) {
            CLS84 ʿˊ$ʻᵢ0 = arr_ʿˊ$ʻᵢ[v6];
            v7 += ʿˊ$ʻᵢ0.MTH1915() * (ʿˊ$ʻᵢ0.MTH1914() + v5);
        }
        this.FLD450 = v7;
    }

    @Override
    public String toString() {
        return String.valueOf(this.FLD448);
    }

    public int MTH1925() {
        return this.FLD447;
    }

    public int MTH1926() {
        return this.FLD449;
    }

    public static CLS87[] MTH1927() {
        return new CLS87[]{new CLS87(1, 10, 10, 8, 8, new CLS86(5, new CLS84(1, 3, null), null)), new CLS87(2, 12, 12, 10, 10, new CLS86(7, new CLS84(1, 5, null), null)), new CLS87(3, 14, 14, 12, 12, new CLS86(10, new CLS84(1, 8, null), null)), new CLS87(4, 16, 16, 14, 14, new CLS86(12, new CLS84(1, 12, null), null)), new CLS87(5, 18, 18, 16, 16, new CLS86(14, new CLS84(1, 18, null), null)), new CLS87(6, 20, 20, 18, 18, new CLS86(18, new CLS84(1, 22, null), null)), new CLS87(7, 22, 22, 20, 20, new CLS86(20, new CLS84(1, 30, null), null)), new CLS87(8, 24, 24, 22, 22, new CLS86(24, new CLS84(1, 36, null), null)), new CLS87(9, 26, 26, 24, 24, new CLS86(28, new CLS84(1, 44, null), null)), new CLS87(10, 0x20, 0x20, 14, 14, new CLS86(36, new CLS84(1, 62, null), null)), new CLS87(11, 36, 36, 16, 16, new CLS86(42, new CLS84(1, 86, null), null)), new CLS87(12, 40, 40, 18, 18, new CLS86(0x30, new CLS84(1, 0x72, null), null)), new CLS87(13, 44, 44, 20, 20, new CLS86(56, new CLS84(1, 0x90, null), null)), new CLS87(14, 0x30, 0x30, 22, 22, new CLS86(68, new CLS84(1, 0xAE, null), null)), new CLS87(15, 52, 52, 24, 24, new CLS86(42, new CLS84(2, 102, null), null)), new CLS87(16, 0x40, 0x40, 14, 14, new CLS86(56, new CLS84(2, 140, null), null)), new CLS87(17, 72, 72, 16, 16, new CLS86(36, new CLS84(4, 92, null), null)), new CLS87(18, 80, 80, 18, 18, new CLS86(0x30, new CLS84(4, 0x72, null), null)), new CLS87(19, 88, 88, 20, 20, new CLS86(56, new CLS84(4, 0x90, null), null)), new CLS87(20, 0x60, 0x60, 22, 22, new CLS86(68, new CLS84(4, 0xAE, null), null)), new CLS87(21, 104, 104, 24, 24, new CLS86(56, new CLS84(6, 0x88, null), null)), new CLS87(22, 120, 120, 18, 18, new CLS86(68, new CLS84(6, 0xAF, null), null)), new CLS87(23, 0x84, 0x84, 20, 20, new CLS86(62, new CLS84(8, 0xA3, null), null)), new CLS87(24, 0x90, 0x90, 22, 22, new CLS86(62, new CLS84(8, 0x9C, null), new CLS84(2, 0x9B, null), null)), new CLS87(25, 8, 18, 6, 16, new CLS86(7, new CLS84(1, 5, null), null)), new CLS87(26, 8, 0x20, 6, 14, new CLS86(11, new CLS84(1, 10, null), null)), new CLS87(27, 12, 26, 10, 24, new CLS86(14, new CLS84(1, 16, null), null)), new CLS87(28, 12, 36, 10, 16, new CLS86(18, new CLS84(1, 22, null), null)), new CLS87(29, 16, 36, 14, 16, new CLS86(24, new CLS84(1, 0x20, null), null)), new CLS87(30, 16, 0x30, 14, 22, new CLS86(28, new CLS84(1, 49, null), null))};
    }

    public int MTH1928() {
        return this.FLD448;
    }

    public int MTH1929() {
        return this.FLD453;
    }

    public int MTH1930() {
        return this.FLD450;
    }

    public static CLS87 MTH1931(int v, int v1) {
        if((v & 1) != 0 || (v1 & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        CLS87[] arr_ʿˊ = CLS87.FLD451;
        for(int v2 = 0; v2 < arr_ʿˊ.length; ++v2) {
            CLS87 ʿˊ0 = arr_ʿˊ[v2];
            if(ʿˊ0.FLD446 == v && ʿˊ0.FLD449 == v1) {
                return ʿˊ0;
            }
        }
        throw FormatException.getFormatInstance();
    }

    public int MTH1932() {
        return this.FLD446;
    }

    public CLS86 MTH1933() {
        return this.FLD452;
    }
}


// Decompiled by JEB v5.42.0.202606242140

package c.יʾ;

import com.google.zxing.FormatException;

public final class CLS242 {
    public static final class CLS239 {
        public final int FLD954;
        public final CLS241[] FLD955;

        public CLS239(int v, CLS241 ˈᴵ$ﾞⁱ0) {
            this.FLD954 = v;
            this.FLD955 = new CLS241[]{ˈᴵ$ﾞⁱ0};
        }

        public CLS239(int v, CLS241 ˈᴵ$ﾞⁱ0, CLS240 ˈᴵ$ⁱˋ0) {
            this(v, ˈᴵ$ﾞⁱ0);
        }

        public CLS239(int v, CLS241 ˈᴵ$ﾞⁱ0, CLS241 ˈᴵ$ﾞⁱ1) {
            this.FLD954 = v;
            this.FLD955 = new CLS241[]{ˈᴵ$ﾞⁱ0, ˈᴵ$ﾞⁱ1};
        }

        public CLS239(int v, CLS241 ˈᴵ$ﾞⁱ0, CLS241 ˈᴵ$ﾞⁱ1, CLS240 ˈᴵ$ⁱˋ0) {
            this(v, ˈᴵ$ﾞⁱ0, ˈᴵ$ﾞⁱ1);
        }

        public CLS241[] MTH3218() {
            return this.FLD955;
        }

        public int MTH3219() {
            return this.FLD954;
        }
    }

    public static class CLS240 {
    }

    public static final class CLS241 {
        public final int FLD956;
        public final int FLD957;

        public CLS241(int v, int v1) {
            this.FLD956 = v;
            this.FLD957 = v1;
        }

        public CLS241(int v, int v1, CLS240 ˈᴵ$ⁱˋ0) {
            this(v, v1);
        }

        public int MTH3222() {
            return this.FLD956;
        }

        public int MTH3223() {
            return this.FLD957;
        }
    }

    public final int FLD958;
    public final int FLD959;
    public final int FLD960;
    public final CLS239 FLD961;
    public static final CLS242[] FLD962;
    public final int FLD963;
    public final int FLD964;
    public final int FLD965;

    static {
        CLS242.FLD962 = CLS242.MTH3233();
    }

    public CLS242(int v, int v1, int v2, int v3, int v4, CLS239 ˈᴵ$ʾʻ0) {
        this.FLD963 = v;
        this.FLD965 = v1;
        this.FLD958 = v2;
        this.FLD960 = v3;
        this.FLD959 = v4;
        this.FLD961 = ˈᴵ$ʾʻ0;
        int v5 = ˈᴵ$ʾʻ0.MTH3219();
        CLS241[] arr_ˈᴵ$ﾞⁱ = ˈᴵ$ʾʻ0.MTH3218();
        int v7 = 0;
        for(int v6 = 0; v6 < arr_ˈᴵ$ﾞⁱ.length; ++v6) {
            CLS241 ˈᴵ$ﾞⁱ0 = arr_ˈᴵ$ﾞⁱ[v6];
            v7 += ˈᴵ$ﾞⁱ0.MTH3222() * (ˈᴵ$ﾞⁱ0.MTH3223() + v5);
        }
        this.FLD964 = v7;
    }

    @Override
    public String toString() {
        return String.valueOf(this.FLD963);
    }

    public int MTH3227() {
        return this.FLD960;
    }

    public int MTH3228() {
        return this.FLD963;
    }

    public int MTH3229() {
        return this.FLD958;
    }

    public CLS239 MTH3230() {
        return this.FLD961;
    }

    public int MTH3231() {
        return this.FLD965;
    }

    public static CLS242 MTH3232(int v, int v1) {
        if((v & 1) != 0 || (v1 & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        CLS242[] arr_ˈᴵ = CLS242.FLD962;
        for(int v2 = 0; v2 < arr_ˈᴵ.length; ++v2) {
            CLS242 ˈᴵ0 = arr_ˈᴵ[v2];
            if(ˈᴵ0.FLD965 == v && ˈᴵ0.FLD958 == v1) {
                return ˈᴵ0;
            }
        }
        throw FormatException.getFormatInstance();
    }

    public static CLS242[] MTH3233() {
        return new CLS242[]{new CLS242(1, 10, 10, 8, 8, new CLS239(5, new CLS241(1, 3, null), null)), new CLS242(2, 12, 12, 10, 10, new CLS239(7, new CLS241(1, 5, null), null)), new CLS242(3, 14, 14, 12, 12, new CLS239(10, new CLS241(1, 8, null), null)), new CLS242(4, 16, 16, 14, 14, new CLS239(12, new CLS241(1, 12, null), null)), new CLS242(5, 18, 18, 16, 16, new CLS239(14, new CLS241(1, 18, null), null)), new CLS242(6, 20, 20, 18, 18, new CLS239(18, new CLS241(1, 22, null), null)), new CLS242(7, 22, 22, 20, 20, new CLS239(20, new CLS241(1, 30, null), null)), new CLS242(8, 24, 24, 22, 22, new CLS239(24, new CLS241(1, 36, null), null)), new CLS242(9, 26, 26, 24, 24, new CLS239(28, new CLS241(1, 44, null), null)), new CLS242(10, 0x20, 0x20, 14, 14, new CLS239(36, new CLS241(1, 62, null), null)), new CLS242(11, 36, 36, 16, 16, new CLS239(42, new CLS241(1, 86, null), null)), new CLS242(12, 40, 40, 18, 18, new CLS239(0x30, new CLS241(1, 0x72, null), null)), new CLS242(13, 44, 44, 20, 20, new CLS239(56, new CLS241(1, 0x90, null), null)), new CLS242(14, 0x30, 0x30, 22, 22, new CLS239(68, new CLS241(1, 0xAE, null), null)), new CLS242(15, 52, 52, 24, 24, new CLS239(42, new CLS241(2, 102, null), null)), new CLS242(16, 0x40, 0x40, 14, 14, new CLS239(56, new CLS241(2, 140, null), null)), new CLS242(17, 72, 72, 16, 16, new CLS239(36, new CLS241(4, 92, null), null)), new CLS242(18, 80, 80, 18, 18, new CLS239(0x30, new CLS241(4, 0x72, null), null)), new CLS242(19, 88, 88, 20, 20, new CLS239(56, new CLS241(4, 0x90, null), null)), new CLS242(20, 0x60, 0x60, 22, 22, new CLS239(68, new CLS241(4, 0xAE, null), null)), new CLS242(21, 104, 104, 24, 24, new CLS239(56, new CLS241(6, 0x88, null), null)), new CLS242(22, 120, 120, 18, 18, new CLS239(68, new CLS241(6, 0xAF, null), null)), new CLS242(23, 0x84, 0x84, 20, 20, new CLS239(62, new CLS241(8, 0xA3, null), null)), new CLS242(24, 0x90, 0x90, 22, 22, new CLS239(62, new CLS241(8, 0x9C, null), new CLS241(2, 0x9B, null), null)), new CLS242(25, 8, 18, 6, 16, new CLS239(7, new CLS241(1, 5, null), null)), new CLS242(26, 8, 0x20, 6, 14, new CLS239(11, new CLS241(1, 10, null), null)), new CLS242(27, 12, 26, 10, 24, new CLS239(14, new CLS241(1, 16, null), null)), new CLS242(28, 12, 36, 10, 16, new CLS239(18, new CLS241(1, 22, null), null)), new CLS242(29, 16, 36, 14, 16, new CLS239(24, new CLS241(1, 0x20, null), null)), new CLS242(30, 16, 0x30, 14, 22, new CLS239(28, new CLS241(1, 49, null), null))};
    }

    public int MTH3234() {
        return this.FLD964;
    }

    public int MTH3235() {
        return this.FLD959;
    }
}


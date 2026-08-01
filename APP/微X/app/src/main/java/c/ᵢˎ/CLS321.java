// Decompiled by JEB v5.42.0.202606242140

package c.ᵢˎ;

import c.ﾞʾ.CLS366;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public abstract class CLS321 extends Enum {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS806 extends CLS321 {
        public CLS806(String s, int v) {
            super(s, v, null);
        }

        @Override  // c.ᵢˎ.CLS321
        public boolean MTH4705(int v, int v1) {
            return v1 % 3 == 0;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS807 extends CLS321 {
        public CLS807(String s, int v) {
            super(s, v, null);
        }

        @Override  // c.ᵢˎ.CLS321
        public boolean MTH4705(int v, int v1) {
            return (v / 2 + v1 / 3 & 1) == 0;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS808 extends CLS321 {
        public CLS808(String s, int v) {
            super(s, v, null);
        }

        @Override  // c.ᵢˎ.CLS321
        public boolean MTH4705(int v, int v1) {
            return (v + v1) % 3 == 0;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS809 extends CLS321 {
        public CLS809(String s, int v) {
            super(s, v, null);
        }

        @Override  // c.ᵢˎ.CLS321
        public boolean MTH4705(int v, int v1) {
            return v * v1 % 6 == 0;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS810 extends CLS321 {
        public CLS810(String s, int v) {
            super(s, v, null);
        }

        @Override  // c.ᵢˎ.CLS321
        public boolean MTH4705(int v, int v1) {
            return (v + v1 + v * v1 % 3 & 1) == 0;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS811 extends CLS321 {
        public CLS811(String s, int v) {
            super(s, v, null);
        }

        @Override  // c.ᵢˎ.CLS321
        public boolean MTH4705(int v, int v1) {
            return (v + v1 & 1) == 0;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS812 extends CLS321 {
        public CLS812(String s, int v) {
            super(s, v, null);
        }

        @Override  // c.ᵢˎ.CLS321
        public boolean MTH4705(int v, int v1) {
            return v * v1 % 6 < 3;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS813 extends CLS321 {
        public CLS813(String s, int v) {
            super(s, v, null);
        }

        @Override  // c.ᵢˎ.CLS321
        public boolean MTH4705(int v, int v1) {
            return (v & 1) == 0;
        }
    }

    public static final enum CLS321 FLD1520;
    public static final CLS321[] FLD1521;
    public static final enum CLS321 FLD1522;
    public static final enum CLS321 FLD1523;
    public static final enum CLS321 FLD1524;
    public static final enum CLS321 FLD1525;
    public static final enum CLS321 FLD1526;
    public static final enum CLS321 FLD1527;
    public static final enum CLS321 FLD1528;

    static {
        CLS811 ʾʻ$ⁱˋ0 = new CLS811("DATA_MASK_000", 0);
        CLS321.FLD1526 = ʾʻ$ⁱˋ0;
        CLS813 ʾʻ$ﾞⁱ0 = new CLS813("DATA_MASK_001", 1);
        CLS321.FLD1528 = ʾʻ$ﾞⁱ0;
        CLS806 ʾʻ$ʾʻ0 = new CLS806("DATA_MASK_010", 2);
        CLS321.FLD1520 = ʾʻ$ʾʻ0;
        CLS808 ʾʻ$ˉˎ0 = new CLS808("DATA_MASK_011", 3);
        CLS321.FLD1523 = ʾʻ$ˉˎ0;
        CLS807 ʾʻ$ˈᴵ0 = new CLS807("DATA_MASK_100", 4);
        CLS321.FLD1522 = ʾʻ$ˈᴵ0;
        CLS809 ʾʻ$ˋʼ0 = new CLS809("DATA_MASK_101", 5);
        CLS321.FLD1524 = ʾʻ$ˋʼ0;
        CLS812 ʾʻ$ﾞʿ0 = new CLS812("DATA_MASK_110", 6);
        CLS321.FLD1527 = ʾʻ$ﾞʿ0;
        CLS810 ʾʻ$ᵔʼ0 = new CLS810("DATA_MASK_111", 7);
        CLS321.FLD1525 = ʾʻ$ᵔʼ0;
        CLS321.FLD1521 = new CLS321[]{ʾʻ$ⁱˋ0, ʾʻ$ﾞⁱ0, ʾʻ$ʾʻ0, ʾʻ$ˉˎ0, ʾʻ$ˈᴵ0, ʾʻ$ˋʼ0, ʾʻ$ﾞʿ0, ʾʻ$ᵔʼ0};
    }

    public CLS321(String s, int v) {
        super(s, v);
    }

    public CLS321(String s, int v, CLS811 ʾʻ$ⁱˋ0) {
        this(s, v);
    }

    public static CLS321 valueOf(String s) {
        return (CLS321)Enum.valueOf(CLS321.class, s);
    }

    public static CLS321[] values() {
        return (CLS321[])CLS321.FLD1521.clone();
    }

    public abstract boolean MTH4705(int arg1, int arg2);

    public final void MTH4706(CLS366 ﾞⁱ0, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            for(int v2 = 0; v2 < v; ++v2) {
                if(this.MTH4705(v1, v2)) {
                    ﾞⁱ0.MTH5033(v2, v1);
                }
            }
        }
    }
}


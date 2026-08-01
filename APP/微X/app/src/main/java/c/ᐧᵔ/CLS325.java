// Decompiled by JEB v5.42.0.202606242140

package c.ᐧᵔ;

import c.ˎˊ.CLS117;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public abstract class CLS325 extends Enum {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS808 extends CLS325 {
        public CLS808(String s, int v) {
            super(s, v, null);
        }

        @Override  // c.ᐧᵔ.CLS325
        public boolean MTH4727(int v, int v1) {
            return (v & 1) == 0;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS809 extends CLS325 {
        public CLS809(String s, int v) {
            super(s, v, null);
        }

        @Override  // c.ᐧᵔ.CLS325
        public boolean MTH4727(int v, int v1) {
            return (v / 2 + v1 / 3 & 1) == 0;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS810 extends CLS325 {
        public CLS810(String s, int v) {
            super(s, v, null);
        }

        @Override  // c.ᐧᵔ.CLS325
        public boolean MTH4727(int v, int v1) {
            return (v + v1 & 1) == 0;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS811 extends CLS325 {
        public CLS811(String s, int v) {
            super(s, v, null);
        }

        @Override  // c.ᐧᵔ.CLS325
        public boolean MTH4727(int v, int v1) {
            return v1 % 3 == 0;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS812 extends CLS325 {
        public CLS812(String s, int v) {
            super(s, v, null);
        }

        @Override  // c.ᐧᵔ.CLS325
        public boolean MTH4727(int v, int v1) {
            return v * v1 % 6 < 3;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS813 extends CLS325 {
        public CLS813(String s, int v) {
            super(s, v, null);
        }

        @Override  // c.ᐧᵔ.CLS325
        public boolean MTH4727(int v, int v1) {
            return (v + v1 + v * v1 % 3 & 1) == 0;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS814 extends CLS325 {
        public CLS814(String s, int v) {
            super(s, v, null);
        }

        @Override  // c.ᐧᵔ.CLS325
        public boolean MTH4727(int v, int v1) {
            return v * v1 % 6 == 0;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS815 extends CLS325 {
        public CLS815(String s, int v) {
            super(s, v, null);
        }

        @Override  // c.ᐧᵔ.CLS325
        public boolean MTH4727(int v, int v1) {
            return (v + v1) % 3 == 0;
        }
    }

    public static final enum CLS325 FLD1489;
    public static final enum CLS325 FLD1490;
    public static final enum CLS325 FLD1491;
    public static final CLS325[] FLD1492;
    public static final enum CLS325 FLD1493;
    public static final enum CLS325 FLD1494;
    public static final enum CLS325 FLD1495;
    public static final enum CLS325 FLD1496;
    public static final enum CLS325 FLD1497;

    static {
        CLS810 ـᵎ$ˆٴ0 = new CLS810("DATA_MASK_000", 0);
        CLS325.FLD1491 = ـᵎ$ˆٴ0;
        CLS808 ـᵎ$ʻᵢ0 = new CLS808("DATA_MASK_001", 1);
        CLS325.FLD1489 = ـᵎ$ʻᵢ0;
        CLS811 ـᵎ$ـᵎ0 = new CLS811("DATA_MASK_010", 2);
        CLS325.FLD1493 = ـᵎ$ـᵎ0;
        CLS815 ـᵎ$ᵔﹶ0 = new CLS815("DATA_MASK_011", 3);
        CLS325.FLD1497 = ـᵎ$ᵔﹶ0;
        CLS809 ـᵎ$ʿˊ0 = new CLS809("DATA_MASK_100", 4);
        CLS325.FLD1490 = ـᵎ$ʿˊ0;
        CLS814 ـᵎ$ᴵⁱ0 = new CLS814("DATA_MASK_101", 5);
        CLS325.FLD1496 = ـᵎ$ᴵⁱ0;
        CLS812 ـᵎ$ٴˑ0 = new CLS812("DATA_MASK_110", 6);
        CLS325.FLD1494 = ـᵎ$ٴˑ0;
        CLS813 ـᵎ$ٴⁱ0 = new CLS813("DATA_MASK_111", 7);
        CLS325.FLD1495 = ـᵎ$ٴⁱ0;
        CLS325.FLD1492 = new CLS325[]{ـᵎ$ˆٴ0, ـᵎ$ʻᵢ0, ـᵎ$ـᵎ0, ـᵎ$ᵔﹶ0, ـᵎ$ʿˊ0, ـᵎ$ᴵⁱ0, ـᵎ$ٴˑ0, ـᵎ$ٴⁱ0};
    }

    public CLS325(String s, int v) {
        super(s, v);
    }

    public CLS325(String s, int v, CLS810 ـᵎ$ˆٴ0) {
        this(s, v);
    }

    public static CLS325 valueOf(String s) {
        return (CLS325)Enum.valueOf(CLS325.class, s);
    }

    public static CLS325[] values() {
        return (CLS325[])CLS325.FLD1492.clone();
    }

    public final void MTH4726(CLS117 ʻᵢ0, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            for(int v2 = 0; v2 < v; ++v2) {
                if(this.MTH4727(v1, v2)) {
                    ʻᵢ0.MTH2327(v2, v1);
                }
            }
        }
    }

    public abstract boolean MTH4727(int arg1, int arg2);
}


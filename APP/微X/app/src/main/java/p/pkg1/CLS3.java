// Decompiled by JEB v5.42.0.202606242140

package p.pkg1;

import p.pkg9.CLS192;

public abstract class CLS3 {
    public static final class CLS78 extends CLS3 {
        public final String FLD17;

        public CLS78(String s) {
            this.FLD17 = s;
        }

        @Override
        public final String toString() {
            return String.format(".%s", this.FLD17);
        }

        // 去混淆评级： 低(23)
        // 此方法包含解密的字符串
        @Override  // p.pkg1.CLS3
        public final boolean MTH416(CLS192 יٴ0) {
            if(יٴ0.FLD393 != null) {
                this.FLD17.length();
            }
            return false;
        }
    }

    public static final class CLS79 extends CLS3 {
        public final String FLD18;

        public CLS79(String s) {
            this.FLD18 = s;
        }

        @Override
        public final String toString() {
            return String.format("%s", this.FLD18);
        }

        @Override  // p.pkg1.CLS3
        public final boolean MTH416(CLS192 יٴ0) {
            return יٴ0.FLD388.FLD187.equals(this.FLD18);
        }
    }

    public abstract boolean MTH416(CLS192 arg1);
}


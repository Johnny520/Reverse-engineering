// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import b.ˆٴ.CLS66;
import b.יᐧ.CLS158.CLS157;
import b.יᐧ.CLS158;

public final class CLS307 {
    public static final class CLS306 {
        public final long FLD3182;
        public final int FLD3183;
        public final String FLD3184;
        public final String FLD3185;

        public CLS306(int v, long v1, String s, String s1) {
            this.FLD3182 = v1;
            this.FLD3185 = s1;
            this.FLD3184 = s;
            this.FLD3183 = v;
        }
    }

    public final CLS158 FLD3186;
    public static final CLS307 FLD3187;

    static {
        CLS307.FLD3187 = new CLS307();
    }

    public CLS307() {
        public final class CLS1256 implements CLS157 {
            public CLS1256() {
                super();
            }

            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3145() {
            }

            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3146(CLS158 ⁱʾ0) {
                CLS306 ⁱʽ$ᵔʾ0 = (CLS306)ⁱʾ0.MTH3152();
                if(ⁱʽ$ᵔʾ0 != null) {
                    CLS66.MTH1472(ⁱʽ$ᵔʾ0.FLD3182, ⁱʽ$ᵔʾ0.FLD3184, ⁱʽ$ᵔʾ0.FLD3185);
                }
                CLS306 ⁱʽ$ᵔʾ1 = (CLS306)ⁱʾ0.FLD1557.peek();
                if(ⁱʽ$ᵔʾ1 != null) {
                    ⁱʾ0.MTH3156(((long)ⁱʽ$ᵔʾ1.FLD3183));
                }
            }
        }

        this.FLD3186 = new CLS158(((CLS157)new CLS1256()), 3000L);
    }
}


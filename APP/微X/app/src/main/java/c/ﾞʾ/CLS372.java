// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʾ;

import java.util.Formatter;

public final class CLS372 {
    public final CLS371[] FLD1634;
    public final CLS367 FLD1635;
    public CLS370 FLD1636;
    public final int FLD1637;

    public CLS372(CLS367 ˆٴ0, CLS370 ـᵎ0) {
        this.FLD1635 = ˆٴ0;
        int v = ˆٴ0.MTH4980();
        this.FLD1637 = v;
        this.FLD1636 = ـᵎ0;
        this.FLD1634 = new CLS371[v + 2];
    }

    @Override
    public String toString() {
        CLS371[] arr_ٴˑ = this.FLD1634;
        CLS371 ٴˑ0 = arr_ٴˑ[0];
        if(ٴˑ0 == null) {
            ٴˑ0 = arr_ٴˑ[this.FLD1637 + 1];
        }
        Formatter formatter0 = new Formatter();
        for(int v = 0; v < ٴˑ0.MTH5034().length; ++v) {
            formatter0.format("CW %3d:", v);
            for(int v1 = 0; v1 < this.FLD1637 + 2; ++v1) {
                CLS371 ٴˑ1 = this.FLD1634[v1];
                if(ٴˑ1 == null) {
                    formatter0.format("    |   ");
                }
                else {
                    CLS373 ᵔﹶ0 = ٴˑ1.MTH5034()[v];
                    if(ᵔﹶ0 == null) {
                        formatter0.format("    |   ");
                    }
                    else {
                        formatter0.format(" %3d|%3d", ᵔﹶ0.MTH5070(), ᵔﹶ0.MTH5066());
                    }
                }
            }
            formatter0.format("%n");
        }
        formatter0.close();
        return formatter0.toString();
    }

    public static boolean MTH5046(CLS373 ᵔﹶ0, CLS373 ᵔﹶ1) {
        if(ᵔﹶ1 == null) {
            return false;
        }
        if(ᵔﹶ1.MTH5071() && ᵔﹶ1.MTH5067() == ᵔﹶ0.MTH5067()) {
            ᵔﹶ0.MTH5068(ᵔﹶ1.MTH5070());
            return true;
        }
        return false;
    }

    public int MTH5047() {
        return this.FLD1635.MTH4981();
    }

    public final void MTH5048(int v, int v1, CLS373[] arr_ᵔﹶ) {
        CLS373 ᵔﹶ0 = arr_ᵔﹶ[v1];
        CLS373[] arr_ᵔﹶ1 = this.FLD1634[v - 1].MTH5034();
        CLS371 ٴˑ0 = this.FLD1634[v + 1];
        CLS373[] arr_ᵔﹶ2 = ٴˑ0 == null ? arr_ᵔﹶ1 : ٴˑ0.MTH5034();
        CLS373[] arr_ᵔﹶ3 = new CLS373[14];
        arr_ᵔﹶ3[2] = arr_ᵔﹶ1[v1];
        arr_ᵔﹶ3[3] = arr_ᵔﹶ2[v1];
        if(v1 > 0) {
            arr_ᵔﹶ3[0] = arr_ᵔﹶ[v1 - 1];
            arr_ᵔﹶ3[4] = arr_ᵔﹶ1[v1 - 1];
            arr_ᵔﹶ3[5] = arr_ᵔﹶ2[v1 - 1];
        }
        if(v1 > 1) {
            arr_ᵔﹶ3[8] = arr_ᵔﹶ[v1 - 2];
            arr_ᵔﹶ3[10] = arr_ᵔﹶ1[v1 - 2];
            arr_ᵔﹶ3[11] = arr_ᵔﹶ2[v1 - 2];
        }
        if(v1 < arr_ᵔﹶ.length - 1) {
            arr_ᵔﹶ3[1] = arr_ᵔﹶ[v1 + 1];
            arr_ᵔﹶ3[6] = arr_ᵔﹶ1[v1 + 1];
            arr_ᵔﹶ3[7] = arr_ᵔﹶ2[v1 + 1];
        }
        if(v1 < arr_ᵔﹶ.length - 2) {
            arr_ᵔﹶ3[9] = arr_ᵔﹶ[v1 + 2];
            arr_ᵔﹶ3[12] = arr_ᵔﹶ1[v1 + 2];
            arr_ᵔﹶ3[13] = arr_ᵔﹶ2[v1 + 2];
        }
        for(int v2 = 0; v2 < 14 && !CLS372.MTH5046(ᵔﹶ0, arr_ᵔﹶ3[v2]); ++v2) {
        }
    }

    public CLS371[] MTH5049() {
        this.MTH5050(this.FLD1634[0]);
        this.MTH5050(this.FLD1634[this.FLD1637 + 1]);
        for(int v = 0x3A0; true; v = v1) {
            int v1 = this.MTH5062();
            if(v1 <= 0 || v1 >= v) {
                break;
            }
        }
        return this.FLD1634;
    }

    public final void MTH5050(CLS371 ٴˑ0) {
        if(ٴˑ0 != null) {
            ((CLS817)ٴˑ0).MTH5042(this.FLD1635);
        }
    }

    public int MTH5051() {
        return this.FLD1635.MTH4978();
    }

    public CLS371 MTH5052(int v) {
        return this.FLD1634[v];
    }

    public final int MTH5053() {
        CLS371[] arr_ٴˑ = this.FLD1634;
        int v = this.FLD1637;
        if(arr_ٴˑ[v + 1] == null) {
            return 0;
        }
        CLS373[] arr_ᵔﹶ = arr_ٴˑ[v + 1].MTH5034();
        int v2 = 0;
        for(int v1 = 0; v1 < arr_ᵔﹶ.length; ++v1) {
            CLS373 ᵔﹶ0 = arr_ᵔﹶ[v1];
            if(ᵔﹶ0 != null) {
                int v3 = ᵔﹶ0.MTH5070();
                int v4 = this.FLD1637 + 1;
                int v5 = 0;
                while(v4 > 0 && v5 < 2) {
                    CLS373 ᵔﹶ1 = this.FLD1634[v4].MTH5034()[v1];
                    if(ᵔﹶ1 != null) {
                        v5 = CLS372.MTH5058(v3, v5, ᵔﹶ1);
                        if(!ᵔﹶ1.MTH5071()) {
                            ++v2;
                        }
                    }
                    --v4;
                }
            }
        }
        return v2;
    }

    public void MTH5054(CLS370 ـᵎ0) {
        this.FLD1636 = ـᵎ0;
    }

    public void MTH5055(int v, CLS371 ٴˑ0) {
        this.FLD1634[v] = ٴˑ0;
    }

    public int MTH5056() {
        return this.FLD1637;
    }

    public CLS370 MTH5057() {
        return this.FLD1636;
    }

    public static int MTH5058(int v, int v1, CLS373 ᵔﹶ0) {
        if(ᵔﹶ0 == null) {
            return v1;
        }
        if(!ᵔﹶ0.MTH5071()) {
            if(ᵔﹶ0.MTH5072(v)) {
                ᵔﹶ0.MTH5068(v);
                return 0;
            }
            return v1 + 1;
        }
        return v1;
    }

    public final void MTH5059() {
        CLS371 ٴˑ0 = this.FLD1634[0];
        if(ٴˑ0 != null && this.FLD1634[this.FLD1637 + 1] != null) {
            CLS373[] arr_ᵔﹶ = ٴˑ0.MTH5034();
            CLS373[] arr_ᵔﹶ1 = this.FLD1634[this.FLD1637 + 1].MTH5034();
            for(int v = 0; v < arr_ᵔﹶ.length; ++v) {
                CLS373 ᵔﹶ0 = arr_ᵔﹶ[v];
                if(ᵔﹶ0 != null && arr_ᵔﹶ1[v] != null && ᵔﹶ0.MTH5070() == arr_ᵔﹶ1[v].MTH5070()) {
                    for(int v1 = 1; v1 <= this.FLD1637; ++v1) {
                        CLS373 ᵔﹶ1 = this.FLD1634[v1].MTH5034()[v];
                        if(ᵔﹶ1 != null) {
                            ᵔﹶ1.MTH5068(arr_ᵔﹶ[v].MTH5070());
                            if(!ᵔﹶ1.MTH5071()) {
                                this.FLD1634[v1].MTH5034()[v] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    public final int MTH5060() {
        CLS371 ٴˑ0 = this.FLD1634[0];
        if(ٴˑ0 == null) {
            return 0;
        }
        CLS373[] arr_ᵔﹶ = ٴˑ0.MTH5034();
        int v1 = 0;
        for(int v = 0; v < arr_ᵔﹶ.length; ++v) {
            CLS373 ᵔﹶ0 = arr_ᵔﹶ[v];
            if(ᵔﹶ0 != null) {
                int v2 = ᵔﹶ0.MTH5070();
                int v4 = 0;
                for(int v3 = 1; v3 < this.FLD1637 + 1 && v4 < 2; ++v3) {
                    CLS373 ᵔﹶ1 = this.FLD1634[v3].MTH5034()[v];
                    if(ᵔﹶ1 != null) {
                        v4 = CLS372.MTH5058(v2, v4, ᵔﹶ1);
                        if(!ᵔﹶ1.MTH5071()) {
                            ++v1;
                        }
                    }
                }
            }
        }
        return v1;
    }

    public final int MTH5061() {
        this.MTH5059();
        return this.MTH5060() + this.MTH5053();
    }

    public final int MTH5062() {
        int v = this.MTH5061();
        if(v == 0) {
            return 0;
        }
        for(int v1 = 1; v1 < this.FLD1637 + 1; ++v1) {
            CLS373[] arr_ᵔﹶ = this.FLD1634[v1].MTH5034();
            for(int v2 = 0; v2 < arr_ᵔﹶ.length; ++v2) {
                CLS373 ᵔﹶ0 = arr_ᵔﹶ[v2];
                if(ᵔﹶ0 != null && !ᵔﹶ0.MTH5071()) {
                    this.MTH5048(v1, v2, arr_ᵔﹶ);
                }
            }
        }
        return v;
    }
}


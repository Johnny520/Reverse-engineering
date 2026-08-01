// Decompiled by JEB v5.42.0.202606242140

package c.ﹶˋ;

import java.util.Formatter;

public final class CLS354 {
    public CLS348 FLD1607;
    public final int FLD1608;
    public final CLS356 FLD1609;
    public final CLS357[] FLD1610;

    public CLS354(CLS356 ⁱˋ0, CLS348 ʾʻ0) {
        this.FLD1609 = ⁱˋ0;
        int v = ⁱˋ0.MTH4933();
        this.FLD1608 = v;
        this.FLD1607 = ʾʻ0;
        this.FLD1610 = new CLS357[v + 2];
    }

    @Override
    public String toString() {
        CLS357[] arr_ﾞʿ = this.FLD1610;
        CLS357 ﾞʿ0 = arr_ﾞʿ[0];
        if(ﾞʿ0 == null) {
            ﾞʿ0 = arr_ﾞʿ[this.FLD1608 + 1];
        }
        Formatter formatter0 = new Formatter();
        for(int v = 0; v < ﾞʿ0.MTH4939().length; ++v) {
            formatter0.format("CW %3d:", v);
            for(int v1 = 0; v1 < this.FLD1608 + 2; ++v1) {
                CLS357 ﾞʿ1 = this.FLD1610[v1];
                if(ﾞʿ1 == null) {
                    formatter0.format("    |   ");
                }
                else {
                    CLS353 ˉˎ0 = ﾞʿ1.MTH4939()[v];
                    if(ˉˎ0 == null) {
                        formatter0.format("    |   ");
                    }
                    else {
                        formatter0.format(" %3d|%3d", ˉˎ0.MTH4867(), ˉˎ0.MTH4869());
                    }
                }
            }
            formatter0.format("%n");
        }
        formatter0.close();
        return formatter0.toString();
    }

    public static int MTH4879(int v, int v1, CLS353 ˉˎ0) {
        if(ˉˎ0 == null) {
            return v1;
        }
        if(!ˉˎ0.MTH4875()) {
            if(ˉˎ0.MTH4872(v)) {
                ˉˎ0.MTH4868(v);
                return 0;
            }
            return v1 + 1;
        }
        return v1;
    }

    public final int MTH4880() {
        CLS357[] arr_ﾞʿ = this.FLD1610;
        int v = this.FLD1608;
        if(arr_ﾞʿ[v + 1] == null) {
            return 0;
        }
        CLS353[] arr_ˉˎ = arr_ﾞʿ[v + 1].MTH4939();
        int v2 = 0;
        for(int v1 = 0; v1 < arr_ˉˎ.length; ++v1) {
            CLS353 ˉˎ0 = arr_ˉˎ[v1];
            if(ˉˎ0 != null) {
                int v3 = ˉˎ0.MTH4867();
                int v4 = this.FLD1608 + 1;
                int v5 = 0;
                while(v4 > 0 && v5 < 2) {
                    CLS353 ˉˎ1 = this.FLD1610[v4].MTH4939()[v1];
                    if(ˉˎ1 != null) {
                        v5 = CLS354.MTH4879(v3, v5, ˉˎ1);
                        if(!ˉˎ1.MTH4875()) {
                            ++v2;
                        }
                    }
                    --v4;
                }
            }
        }
        return v2;
    }

    public int MTH4881() {
        return this.FLD1609.MTH4930();
    }

    public final void MTH4882(int v, int v1, CLS353[] arr_ˉˎ) {
        CLS353 ˉˎ0 = arr_ˉˎ[v1];
        CLS353[] arr_ˉˎ1 = this.FLD1610[v - 1].MTH4939();
        CLS357 ﾞʿ0 = this.FLD1610[v + 1];
        CLS353[] arr_ˉˎ2 = ﾞʿ0 == null ? arr_ˉˎ1 : ﾞʿ0.MTH4939();
        CLS353[] arr_ˉˎ3 = new CLS353[14];
        arr_ˉˎ3[2] = arr_ˉˎ1[v1];
        arr_ˉˎ3[3] = arr_ˉˎ2[v1];
        if(v1 > 0) {
            arr_ˉˎ3[0] = arr_ˉˎ[v1 - 1];
            arr_ˉˎ3[4] = arr_ˉˎ1[v1 - 1];
            arr_ˉˎ3[5] = arr_ˉˎ2[v1 - 1];
        }
        if(v1 > 1) {
            arr_ˉˎ3[8] = arr_ˉˎ[v1 - 2];
            arr_ˉˎ3[10] = arr_ˉˎ1[v1 - 2];
            arr_ˉˎ3[11] = arr_ˉˎ2[v1 - 2];
        }
        if(v1 < arr_ˉˎ.length - 1) {
            arr_ˉˎ3[1] = arr_ˉˎ[v1 + 1];
            arr_ˉˎ3[6] = arr_ˉˎ1[v1 + 1];
            arr_ˉˎ3[7] = arr_ˉˎ2[v1 + 1];
        }
        if(v1 < arr_ˉˎ.length - 2) {
            arr_ˉˎ3[9] = arr_ˉˎ[v1 + 2];
            arr_ˉˎ3[12] = arr_ˉˎ1[v1 + 2];
            arr_ˉˎ3[13] = arr_ˉˎ2[v1 + 2];
        }
        for(int v2 = 0; v2 < 14 && !CLS354.MTH4895(ˉˎ0, arr_ˉˎ3[v2]); ++v2) {
        }
    }

    public CLS348 MTH4883() {
        return this.FLD1607;
    }

    public final int MTH4884() {
        int v = this.MTH4886();
        if(v == 0) {
            return 0;
        }
        for(int v1 = 1; v1 < this.FLD1608 + 1; ++v1) {
            CLS353[] arr_ˉˎ = this.FLD1610[v1].MTH4939();
            for(int v2 = 0; v2 < arr_ˉˎ.length; ++v2) {
                CLS353 ˉˎ0 = arr_ˉˎ[v2];
                if(ˉˎ0 != null && !ˉˎ0.MTH4875()) {
                    this.MTH4882(v1, v2, arr_ˉˎ);
                }
            }
        }
        return v;
    }

    public int MTH4885() {
        return this.FLD1609.MTH4934();
    }

    public final int MTH4886() {
        this.MTH4894();
        return this.MTH4890() + this.MTH4880();
    }

    public CLS357 MTH4887(int v) {
        return this.FLD1610[v];
    }

    public void MTH4888(int v, CLS357 ﾞʿ0) {
        this.FLD1610[v] = ﾞʿ0;
    }

    public CLS357[] MTH4889() {
        this.MTH4892(this.FLD1610[0]);
        this.MTH4892(this.FLD1610[this.FLD1608 + 1]);
        for(int v = 0x3A0; true; v = v1) {
            int v1 = this.MTH4884();
            if(v1 <= 0 || v1 >= v) {
                break;
            }
        }
        return this.FLD1610;
    }

    public final int MTH4890() {
        CLS357 ﾞʿ0 = this.FLD1610[0];
        if(ﾞʿ0 == null) {
            return 0;
        }
        CLS353[] arr_ˉˎ = ﾞʿ0.MTH4939();
        int v1 = 0;
        for(int v = 0; v < arr_ˉˎ.length; ++v) {
            CLS353 ˉˎ0 = arr_ˉˎ[v];
            if(ˉˎ0 != null) {
                int v2 = ˉˎ0.MTH4867();
                int v4 = 0;
                for(int v3 = 1; v3 < this.FLD1608 + 1 && v4 < 2; ++v3) {
                    CLS353 ˉˎ1 = this.FLD1610[v3].MTH4939()[v];
                    if(ˉˎ1 != null) {
                        v4 = CLS354.MTH4879(v2, v4, ˉˎ1);
                        if(!ˉˎ1.MTH4875()) {
                            ++v1;
                        }
                    }
                }
            }
        }
        return v1;
    }

    public int MTH4891() {
        return this.FLD1608;
    }

    public final void MTH4892(CLS357 ﾞʿ0) {
        if(ﾞʿ0 != null) {
            ((CLS817)ﾞʿ0).MTH4904(this.FLD1609);
        }
    }

    public void MTH4893(CLS348 ʾʻ0) {
        this.FLD1607 = ʾʻ0;
    }

    public final void MTH4894() {
        CLS357 ﾞʿ0 = this.FLD1610[0];
        if(ﾞʿ0 != null && this.FLD1610[this.FLD1608 + 1] != null) {
            CLS353[] arr_ˉˎ = ﾞʿ0.MTH4939();
            CLS353[] arr_ˉˎ1 = this.FLD1610[this.FLD1608 + 1].MTH4939();
            for(int v = 0; v < arr_ˉˎ.length; ++v) {
                CLS353 ˉˎ0 = arr_ˉˎ[v];
                if(ˉˎ0 != null && arr_ˉˎ1[v] != null && ˉˎ0.MTH4867() == arr_ˉˎ1[v].MTH4867()) {
                    for(int v1 = 1; v1 <= this.FLD1608; ++v1) {
                        CLS353 ˉˎ1 = this.FLD1610[v1].MTH4939()[v];
                        if(ˉˎ1 != null) {
                            ˉˎ1.MTH4868(arr_ˉˎ[v].MTH4867());
                            if(!ˉˎ1.MTH4875()) {
                                this.FLD1610[v1].MTH4939()[v] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean MTH4895(CLS353 ˉˎ0, CLS353 ˉˎ1) {
        if(ˉˎ1 == null) {
            return false;
        }
        if(ˉˎ1.MTH4875() && ˉˎ1.MTH4874() == ˉˎ0.MTH4874()) {
            ˉˎ0.MTH4868(ˉˎ1.MTH4867());
            return true;
        }
        return false;
    }
}


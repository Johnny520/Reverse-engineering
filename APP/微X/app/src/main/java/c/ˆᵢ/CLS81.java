// Decompiled by JEB v5.42.0.202606242140

package c.ˆᵢ;

import com.google.zxing.common.reedsolomon.ReedSolomonException;

public final class CLS81 {
    public final CLS80 FLD437;

    public CLS81(CLS80 ˆٴ0) {
        this.FLD437 = ˆٴ0;
    }

    public final int[] MTH1901(CLS79 ʻᵢ0) {
        int v = ʻᵢ0.MTH1885();
        int v1 = 0;
        if(v == 1) {
            return new int[]{ʻᵢ0.MTH1886(1)};
        }
        int[] arr_v = new int[v];
        for(int v2 = 1; v2 < this.FLD437.MTH1898() && v1 < v; ++v2) {
            if(ʻᵢ0.MTH1882(v2) == 0) {
                arr_v[v1] = this.FLD437.MTH1897(v2);
                ++v1;
            }
        }
        if(v1 != v) {
            throw new ReedSolomonException("Error locator degree does not match number of roots");
        }
        return arr_v;
    }

    public void MTH1902(int[] arr_v, int v) {
        CLS79 ʻᵢ0 = new CLS79(this.FLD437, arr_v);
        int[] arr_v1 = new int[v];
        boolean z = true;
        for(int v2 = 0; v2 < v; ++v2) {
            int v3 = ʻᵢ0.MTH1882(this.FLD437.MTH1895(this.FLD437.MTH1899() + v2));
            arr_v1[v - 1 - v2] = v3;
            if(v3 != 0) {
                z = false;
            }
        }
        if(z) {
            return;
        }
        CLS79 ʻᵢ1 = new CLS79(this.FLD437, arr_v1);
        CLS79[] arr_ʻᵢ = this.MTH1904(this.FLD437.MTH1890(v, 1), ʻᵢ1, v);
        CLS79 ʻᵢ2 = arr_ʻᵢ[0];
        CLS79 ʻᵢ3 = arr_ʻᵢ[1];
        int[] arr_v2 = this.MTH1901(ʻᵢ2);
        int[] arr_v3 = this.MTH1903(ʻᵢ3, arr_v2);
        for(int v1 = 0; v1 < arr_v2.length; ++v1) {
            int v4 = this.FLD437.MTH1893(arr_v2[v1]);
            int v5 = arr_v.length - 1 - v4;
            if(v5 < 0) {
                throw new ReedSolomonException("Bad error location");
            }
            arr_v[v5] = CLS80.MTH1892(arr_v[v5], arr_v3[v1]);
        }
    }

    public final int[] MTH1903(CLS79 ʻᵢ0, int[] arr_v) {
        int[] arr_v1 = new int[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = this.FLD437.MTH1897(arr_v[v]);
            int v2 = 1;
            for(int v3 = 0; v3 < arr_v.length; ++v3) {
                if(v != v3) {
                    int v4 = this.FLD437.MTH1894(arr_v[v3], v1);
                    v2 = this.FLD437.MTH1894(v2, ((v4 & 1) == 0 ? v4 | 1 : v4 & -2));
                }
            }
            int v5 = ʻᵢ0.MTH1882(v1);
            int v6 = this.FLD437.MTH1897(v2);
            arr_v1[v] = this.FLD437.MTH1894(v5, v6);
            if(this.FLD437.MTH1899() != 0) {
                arr_v1[v] = this.FLD437.MTH1894(arr_v1[v], v1);
            }
        }
        return arr_v1;
    }

    public final CLS79[] MTH1904(CLS79 ʻᵢ0, CLS79 ʻᵢ1, int v) {
        if(ʻᵢ0.MTH1885() < ʻᵢ1.MTH1885()) {
            CLS79 ʻᵢ2 = ʻᵢ1;
            ʻᵢ1 = ʻᵢ0;
            ʻᵢ0 = ʻᵢ2;
        }
        CLS79 ʻᵢ3 = this.FLD437.MTH1896();
        CLS79 ʻᵢ4 = this.FLD437.MTH1891();
        do {
            CLS79 ʻᵢ5 = ʻᵢ1;
            ʻᵢ1 = ʻᵢ0;
            ʻᵢ0 = ʻᵢ5;
            CLS79 ʻᵢ6 = ʻᵢ3;
            ʻᵢ3 = ʻᵢ4;
            if(ʻᵢ0.MTH1885() < v / 2) {
                goto label_27;
            }
            if(ʻᵢ0.MTH1883()) {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
            CLS79 ʻᵢ7 = this.FLD437.MTH1896();
            int v1 = ʻᵢ0.MTH1886(ʻᵢ0.MTH1885());
            int v2 = this.FLD437.MTH1897(v1);
            while(ʻᵢ1.MTH1885() >= ʻᵢ0.MTH1885() && !ʻᵢ1.MTH1883()) {
                int v3 = ʻᵢ1.MTH1885() - ʻᵢ0.MTH1885();
                int v4 = ʻᵢ1.MTH1886(ʻᵢ1.MTH1885());
                int v5 = this.FLD437.MTH1894(v4, v2);
                ʻᵢ7 = ʻᵢ7.MTH1879(this.FLD437.MTH1890(v3, v5));
                ʻᵢ1 = ʻᵢ1.MTH1879(ʻᵢ0.MTH1881(v3, v5));
            }
            ʻᵢ4 = ʻᵢ7.MTH1880(ʻᵢ3).MTH1879(ʻᵢ6);
        }
        while(ʻᵢ1.MTH1885() < ʻᵢ0.MTH1885());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    label_27:
        int v6 = ʻᵢ3.MTH1886(0);
        if(v6 == 0) {
            throw new ReedSolomonException("sigmaTilde(0) was zero");
        }
        int v7 = this.FLD437.MTH1897(v6);
        return new CLS79[]{ʻᵢ3.MTH1884(v7), ʻᵢ0.MTH1884(v7)};
    }
}


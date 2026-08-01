// Decompiled by JEB v5.42.0.202606242140

package c.ˋﾞ;

import com.google.zxing.common.reedsolomon.ReedSolomonException;

public final class CLS103 {
    public final CLS105 FLD349;

    public CLS103(CLS105 ⁱˋ0) {
        this.FLD349 = ⁱˋ0;
    }

    public final int[] MTH1404(CLS106 ﾞⁱ0, int[] arr_v) {
        int[] arr_v1 = new int[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = this.FLD349.MTH1419(arr_v[v]);
            int v2 = 1;
            for(int v3 = 0; v3 < arr_v.length; ++v3) {
                if(v != v3) {
                    int v4 = this.FLD349.MTH1420(arr_v[v3], v1);
                    v2 = this.FLD349.MTH1420(v2, ((v4 & 1) == 0 ? v4 | 1 : v4 & -2));
                }
            }
            int v5 = ﾞⁱ0.MTH1426(v1);
            int v6 = this.FLD349.MTH1419(v2);
            arr_v1[v] = this.FLD349.MTH1420(v5, v6);
            if(this.FLD349.MTH1417() != 0) {
                arr_v1[v] = this.FLD349.MTH1420(arr_v1[v], v1);
            }
        }
        return arr_v1;
    }

    public final CLS106[] MTH1405(CLS106 ﾞⁱ0, CLS106 ﾞⁱ1, int v) {
        if(ﾞⁱ0.MTH1430() < ﾞⁱ1.MTH1430()) {
            CLS106 ﾞⁱ2 = ﾞⁱ1;
            ﾞⁱ1 = ﾞⁱ0;
            ﾞⁱ0 = ﾞⁱ2;
        }
        CLS106 ﾞⁱ3 = this.FLD349.MTH1422();
        CLS106 ﾞⁱ4 = this.FLD349.MTH1416();
        do {
            CLS106 ﾞⁱ5 = ﾞⁱ1;
            ﾞⁱ1 = ﾞⁱ0;
            ﾞⁱ0 = ﾞⁱ5;
            CLS106 ﾞⁱ6 = ﾞⁱ3;
            ﾞⁱ3 = ﾞⁱ4;
            if(ﾞⁱ0.MTH1430() < v / 2) {
                goto label_27;
            }
            if(ﾞⁱ0.MTH1434()) {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
            CLS106 ﾞⁱ7 = this.FLD349.MTH1422();
            int v1 = ﾞⁱ0.MTH1429(ﾞⁱ0.MTH1430());
            int v2 = this.FLD349.MTH1419(v1);
            while(ﾞⁱ1.MTH1430() >= ﾞⁱ0.MTH1430() && !ﾞⁱ1.MTH1434()) {
                int v3 = ﾞⁱ1.MTH1430() - ﾞⁱ0.MTH1430();
                int v4 = ﾞⁱ1.MTH1429(ﾞⁱ1.MTH1430());
                int v5 = this.FLD349.MTH1420(v4, v2);
                ﾞⁱ7 = ﾞⁱ7.MTH1433(this.FLD349.MTH1423(v3, v5));
                ﾞⁱ1 = ﾞⁱ1.MTH1433(ﾞⁱ0.MTH1432(v3, v5));
            }
            ﾞⁱ4 = ﾞⁱ7.MTH1427(ﾞⁱ3).MTH1433(ﾞⁱ6);
        }
        while(ﾞⁱ1.MTH1430() < ﾞⁱ0.MTH1430());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    label_27:
        int v6 = ﾞⁱ3.MTH1429(0);
        if(v6 == 0) {
            throw new ReedSolomonException("sigmaTilde(0) was zero");
        }
        int v7 = this.FLD349.MTH1419(v6);
        return new CLS106[]{ﾞⁱ3.MTH1431(v7), ﾞⁱ0.MTH1431(v7)};
    }

    public void MTH1406(int[] arr_v, int v) {
        CLS106 ﾞⁱ0 = new CLS106(this.FLD349, arr_v);
        int[] arr_v1 = new int[v];
        boolean z = true;
        for(int v2 = 0; v2 < v; ++v2) {
            int v3 = ﾞⁱ0.MTH1426(this.FLD349.MTH1414(this.FLD349.MTH1417() + v2));
            arr_v1[v - 1 - v2] = v3;
            if(v3 != 0) {
                z = false;
            }
        }
        if(z) {
            return;
        }
        CLS106 ﾞⁱ1 = new CLS106(this.FLD349, arr_v1);
        CLS106[] arr_ﾞⁱ = this.MTH1405(this.FLD349.MTH1423(v, 1), ﾞⁱ1, v);
        CLS106 ﾞⁱ2 = arr_ﾞⁱ[0];
        CLS106 ﾞⁱ3 = arr_ﾞⁱ[1];
        int[] arr_v2 = this.MTH1407(ﾞⁱ2);
        int[] arr_v3 = this.MTH1404(ﾞⁱ3, arr_v2);
        for(int v1 = 0; v1 < arr_v2.length; ++v1) {
            int v4 = this.FLD349.MTH1415(arr_v2[v1]);
            int v5 = arr_v.length - 1 - v4;
            if(v5 < 0) {
                throw new ReedSolomonException("Bad error location");
            }
            arr_v[v5] = CLS105.MTH1421(arr_v[v5], arr_v3[v1]);
        }
    }

    public final int[] MTH1407(CLS106 ﾞⁱ0) {
        int v = ﾞⁱ0.MTH1430();
        int v1 = 0;
        if(v == 1) {
            return new int[]{ﾞⁱ0.MTH1429(1)};
        }
        int[] arr_v = new int[v];
        for(int v2 = 1; v2 < this.FLD349.MTH1418() && v1 < v; ++v2) {
            if(ﾞⁱ0.MTH1426(v2) == 0) {
                arr_v[v1] = this.FLD349.MTH1419(v2);
                ++v1;
            }
        }
        if(v1 != v) {
            throw new ReedSolomonException("Error locator degree does not match number of roots");
        }
        return arr_v;
    }
}


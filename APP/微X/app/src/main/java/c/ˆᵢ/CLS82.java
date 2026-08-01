// Decompiled by JEB v5.42.0.202606242140

package c.ˆᵢ;

import java.util.ArrayList;
import java.util.List;

public final class CLS82 {
    public final List FLD438;
    public final CLS80 FLD439;

    public CLS82(CLS80 ˆٴ0) {
        this.FLD439 = ˆٴ0;
        ArrayList arrayList0 = new ArrayList();
        this.FLD438 = arrayList0;
        arrayList0.add(new CLS79(ˆٴ0, new int[]{1}));
    }

    public void MTH1906(int[] arr_v, int v) {
        if(v == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int v1 = arr_v.length - v;
        if(v1 <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        CLS79 ʻᵢ0 = this.MTH1907(v);
        int[] arr_v1 = new int[v1];
        System.arraycopy(arr_v, 0, arr_v1, 0, v1);
        int[] arr_v2 = new CLS79(this.FLD439, arr_v1).MTH1881(v, 1).MTH1877(ʻᵢ0)[1].MTH1878();
        int v2 = v - arr_v2.length;
        for(int v3 = 0; v3 < v2; ++v3) {
            arr_v[v1 + v3] = 0;
        }
        System.arraycopy(arr_v2, 0, arr_v, v1 + v2, arr_v2.length);
    }

    public final CLS79 MTH1907(int v) {
        if(v >= this.FLD438.size()) {
            CLS79 ʻᵢ0 = (CLS79)this.FLD438.get(this.FLD438.size() - 1);
            for(int v1 = this.FLD438.size(); v1 <= v; ++v1) {
                int[] arr_v = {1, this.FLD439.MTH1895(v1 - 1 + this.FLD439.MTH1899())};
                ʻᵢ0 = ʻᵢ0.MTH1880(new CLS79(this.FLD439, arr_v));
                this.FLD438.add(ʻᵢ0);
            }
        }
        return (CLS79)this.FLD438.get(v);
    }
}


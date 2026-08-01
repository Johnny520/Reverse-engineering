// Decompiled by JEB v5.42.0.202606242140

package c.ˋﾞ;

import java.util.ArrayList;
import java.util.List;

public final class CLS104 {
    public final CLS105 FLD350;
    public final List FLD351;

    public CLS104(CLS105 ⁱˋ0) {
        this.FLD350 = ⁱˋ0;
        ArrayList arrayList0 = new ArrayList();
        this.FLD351 = arrayList0;
        arrayList0.add(new CLS106(ⁱˋ0, new int[]{1}));
    }

    public final CLS106 MTH1409(int v) {
        if(v >= this.FLD351.size()) {
            CLS106 ﾞⁱ0 = (CLS106)this.FLD351.get(this.FLD351.size() - 1);
            for(int v1 = this.FLD351.size(); v1 <= v; ++v1) {
                int[] arr_v = {1, this.FLD350.MTH1414(v1 - 1 + this.FLD350.MTH1417())};
                ﾞⁱ0 = ﾞⁱ0.MTH1427(new CLS106(this.FLD350, arr_v));
                this.FLD351.add(ﾞⁱ0);
            }
        }
        return (CLS106)this.FLD351.get(v);
    }

    public void MTH1410(int[] arr_v, int v) {
        if(v == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int v1 = arr_v.length - v;
        if(v1 <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        CLS106 ﾞⁱ0 = this.MTH1409(v);
        int[] arr_v1 = new int[v1];
        System.arraycopy(arr_v, 0, arr_v1, 0, v1);
        int[] arr_v2 = new CLS106(this.FLD350, arr_v1).MTH1432(v, 1).MTH1435(ﾞⁱ0)[1].MTH1428();
        int v2 = v - arr_v2.length;
        for(int v3 = 0; v3 < v2; ++v3) {
            arr_v[v1 + v3] = 0;
        }
        System.arraycopy(arr_v2, 0, arr_v, v1 + v2, arr_v2.length);
    }
}


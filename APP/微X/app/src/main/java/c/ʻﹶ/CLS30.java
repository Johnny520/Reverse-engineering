// Decompiled by JEB v5.42.0.202606242140

package c.ʻﹶ;

import com.google.zxing.ChecksumException;

public final class CLS30 {
    public final CLS29 FLD127;

    public CLS30() {
        this.FLD127 = CLS29.FLD125;
    }

    public final int[] MTH815(CLS31 ـᵎ0) {
        int v = ـᵎ0.MTH830();
        int[] arr_v = new int[v];
        int v1 = 0;
        for(int v2 = 1; v2 < this.FLD127.MTH805() && v1 < v; ++v2) {
            if(ـᵎ0.MTH821(v2) == 0) {
                arr_v[v1] = this.FLD127.MTH810(v2);
                ++v1;
            }
        }
        if(v1 != v) {
            throw ChecksumException.getChecksumInstance();
        }
        return arr_v;
    }

    public int MTH816(int[] arr_v, int v, int[] arr_v1) {
        CLS31 ـᵎ0 = new CLS31(this.FLD127, arr_v);
        int[] arr_v2 = new int[v];
        int v2 = v;
        boolean z = false;
        while(v2 > 0) {
            int v3 = ـᵎ0.MTH821(this.FLD127.MTH809(v2));
            arr_v2[v - v2] = v3;
            if(v3 != 0) {
                z = true;
            }
            --v2;
        }
        if(!z) {
            return 0;
        }
        CLS31 ـᵎ1 = this.FLD127.MTH813();
        if(arr_v1 != null) {
            for(int v4 = 0; v4 < arr_v1.length; ++v4) {
                int v5 = this.FLD127.MTH809(arr_v.length - 1 - arr_v1[v4]);
                int[] arr_v3 = {this.FLD127.MTH808(0, v5), 1};
                ـᵎ1 = ـᵎ1.MTH827(new CLS31(this.FLD127, arr_v3));
            }
        }
        CLS31 ـᵎ2 = new CLS31(this.FLD127, arr_v2);
        CLS31[] arr_ـᵎ = this.MTH818(this.FLD127.MTH804(v, 1), ـᵎ2, v);
        CLS31 ـᵎ3 = arr_ـᵎ[0];
        CLS31 ـᵎ4 = arr_ـᵎ[1];
        int[] arr_v4 = this.MTH815(ـᵎ3);
        int[] arr_v5 = this.MTH817(ـᵎ4, ـᵎ3, arr_v4);
        for(int v1 = 0; v1 < arr_v4.length; ++v1) {
            int v6 = this.FLD127.MTH811(arr_v4[v1]);
            int v7 = arr_v.length - 1 - v6;
            if(v7 < 0) {
                throw ChecksumException.getChecksumInstance();
            }
            arr_v[v7] = this.FLD127.MTH808(arr_v[v7], arr_v5[v1]);
        }
        return arr_v4.length;
    }

    public final int[] MTH817(CLS31 ـᵎ0, CLS31 ـᵎ1, int[] arr_v) {
        int v = ـᵎ1.MTH830();
        int[] arr_v1 = new int[v];
        for(int v1 = 1; v1 <= v; ++v1) {
            int v2 = ـᵎ1.MTH826(v1);
            arr_v1[v - v1] = this.FLD127.MTH807(v1, v2);
        }
        CLS31 ـᵎ2 = new CLS31(this.FLD127, arr_v1);
        int[] arr_v2 = new int[arr_v.length];
        for(int v3 = 0; v3 < arr_v.length; ++v3) {
            int v4 = this.FLD127.MTH810(arr_v[v3]);
            int v5 = ـᵎ0.MTH821(v4);
            int v6 = this.FLD127.MTH808(0, v5);
            int v7 = ـᵎ2.MTH821(v4);
            int v8 = this.FLD127.MTH810(v7);
            arr_v2[v3] = this.FLD127.MTH807(v6, v8);
        }
        return arr_v2;
    }

    public final CLS31[] MTH818(CLS31 ـᵎ0, CLS31 ـᵎ1, int v) {
        if(ـᵎ0.MTH830() < ـᵎ1.MTH830()) {
            CLS31 ـᵎ2 = ـᵎ1;
            ـᵎ1 = ـᵎ0;
            ـᵎ0 = ـᵎ2;
        }
        CLS31 ـᵎ3 = this.FLD127.MTH812();
        for(CLS31 ـᵎ4 = this.FLD127.MTH813(); true; ـᵎ4 = ـᵎ7.MTH827(ـᵎ3).MTH825(ـᵎ6).MTH824()) {
            CLS31 ـᵎ5 = ـᵎ1;
            ـᵎ1 = ـᵎ0;
            ـᵎ0 = ـᵎ5;
            CLS31 ـᵎ6 = ـᵎ3;
            ـᵎ3 = ـᵎ4;
            if(ـᵎ0.MTH830() < v / 2) {
                break;
            }
            if(ـᵎ0.MTH822()) {
                throw ChecksumException.getChecksumInstance();
            }
            CLS31 ـᵎ7 = this.FLD127.MTH812();
            int v1 = ـᵎ0.MTH826(ـᵎ0.MTH830());
            int v2 = this.FLD127.MTH810(v1);
            while(ـᵎ1.MTH830() >= ـᵎ0.MTH830() && !ـᵎ1.MTH822()) {
                int v3 = ـᵎ1.MTH830() - ـᵎ0.MTH830();
                int v4 = ـᵎ1.MTH826(ـᵎ1.MTH830());
                int v5 = this.FLD127.MTH807(v4, v2);
                ـᵎ7 = ـᵎ7.MTH823(this.FLD127.MTH804(v3, v5));
                ـᵎ1 = ـᵎ1.MTH825(ـᵎ0.MTH828(v3, v5));
            }
        }
        int v6 = ـᵎ3.MTH826(0);
        if(v6 == 0) {
            throw ChecksumException.getChecksumInstance();
        }
        int v7 = this.FLD127.MTH810(v6);
        return new CLS31[]{ـᵎ3.MTH829(v7), ـᵎ0.MTH829(v7)};
    }
}


// Decompiled by JEB v5.42.0.202606242140

package c.ʻٴ;

import com.google.zxing.ChecksumException;

public final class CLS21 {
    public final CLS22 FLD108;

    public CLS21() {
        this.FLD108 = CLS22.FLD112;
    }

    public final int[] MTH767(CLS20 ʾʻ0, CLS20 ʾʻ1, int[] arr_v) {
        int v = ʾʻ1.MTH759();
        int[] arr_v1 = new int[v];
        for(int v1 = 1; v1 <= v; ++v1) {
            int v2 = ʾʻ1.MTH756(v1);
            arr_v1[v - v1] = this.FLD108.MTH774(v1, v2);
        }
        CLS20 ʾʻ2 = new CLS20(this.FLD108, arr_v1);
        int[] arr_v2 = new int[arr_v.length];
        for(int v3 = 0; v3 < arr_v.length; ++v3) {
            int v4 = this.FLD108.MTH781(arr_v[v3]);
            int v5 = ʾʻ0.MTH765(v4);
            int v6 = this.FLD108.MTH779(0, v5);
            int v7 = ʾʻ2.MTH765(v4);
            int v8 = this.FLD108.MTH781(v7);
            arr_v2[v3] = this.FLD108.MTH774(v6, v8);
        }
        return arr_v2;
    }

    public final CLS20[] MTH768(CLS20 ʾʻ0, CLS20 ʾʻ1, int v) {
        if(ʾʻ0.MTH759() < ʾʻ1.MTH759()) {
            CLS20 ʾʻ2 = ʾʻ1;
            ʾʻ1 = ʾʻ0;
            ʾʻ0 = ʾʻ2;
        }
        CLS20 ʾʻ3 = this.FLD108.MTH777();
        for(CLS20 ʾʻ4 = this.FLD108.MTH776(); true; ʾʻ4 = ʾʻ7.MTH764(ʾʻ3).MTH762(ʾʻ6).MTH757()) {
            CLS20 ʾʻ5 = ʾʻ1;
            ʾʻ1 = ʾʻ0;
            ʾʻ0 = ʾʻ5;
            CLS20 ʾʻ6 = ʾʻ3;
            ʾʻ3 = ʾʻ4;
            if(ʾʻ0.MTH759() < v / 2) {
                break;
            }
            if(ʾʻ0.MTH758()) {
                throw ChecksumException.getChecksumInstance();
            }
            CLS20 ʾʻ7 = this.FLD108.MTH777();
            int v1 = ʾʻ0.MTH756(ʾʻ0.MTH759());
            int v2 = this.FLD108.MTH781(v1);
            while(ʾʻ1.MTH759() >= ʾʻ0.MTH759() && !ʾʻ1.MTH758()) {
                int v3 = ʾʻ1.MTH759() - ʾʻ0.MTH759();
                int v4 = ʾʻ1.MTH756(ʾʻ1.MTH759());
                int v5 = this.FLD108.MTH774(v4, v2);
                ʾʻ7 = ʾʻ7.MTH763(this.FLD108.MTH782(v3, v5));
                ʾʻ1 = ʾʻ1.MTH762(ʾʻ0.MTH761(v3, v5));
            }
        }
        int v6 = ʾʻ3.MTH756(0);
        if(v6 == 0) {
            throw ChecksumException.getChecksumInstance();
        }
        int v7 = this.FLD108.MTH781(v6);
        return new CLS20[]{ʾʻ3.MTH760(v7), ʾʻ0.MTH760(v7)};
    }

    public int MTH769(int[] arr_v, int v, int[] arr_v1) {
        CLS20 ʾʻ0 = new CLS20(this.FLD108, arr_v);
        int[] arr_v2 = new int[v];
        int v2 = v;
        boolean z = false;
        while(v2 > 0) {
            int v3 = ʾʻ0.MTH765(this.FLD108.MTH773(v2));
            arr_v2[v - v2] = v3;
            if(v3 != 0) {
                z = true;
            }
            --v2;
        }
        if(!z) {
            return 0;
        }
        CLS20 ʾʻ1 = this.FLD108.MTH776();
        if(arr_v1 != null) {
            for(int v4 = 0; v4 < arr_v1.length; ++v4) {
                int v5 = this.FLD108.MTH773(arr_v.length - 1 - arr_v1[v4]);
                int[] arr_v3 = {this.FLD108.MTH779(0, v5), 1};
                ʾʻ1 = ʾʻ1.MTH764(new CLS20(this.FLD108, arr_v3));
            }
        }
        CLS20 ʾʻ2 = new CLS20(this.FLD108, arr_v2);
        CLS20[] arr_ʾʻ = this.MTH768(this.FLD108.MTH782(v, 1), ʾʻ2, v);
        CLS20 ʾʻ3 = arr_ʾʻ[0];
        CLS20 ʾʻ4 = arr_ʾʻ[1];
        int[] arr_v4 = this.MTH770(ʾʻ3);
        int[] arr_v5 = this.MTH767(ʾʻ4, ʾʻ3, arr_v4);
        for(int v1 = 0; v1 < arr_v4.length; ++v1) {
            int v6 = this.FLD108.MTH778(arr_v4[v1]);
            int v7 = arr_v.length - 1 - v6;
            if(v7 < 0) {
                throw ChecksumException.getChecksumInstance();
            }
            arr_v[v7] = this.FLD108.MTH779(arr_v[v7], arr_v5[v1]);
        }
        return arr_v4.length;
    }

    public final int[] MTH770(CLS20 ʾʻ0) {
        int v = ʾʻ0.MTH759();
        int[] arr_v = new int[v];
        int v1 = 0;
        for(int v2 = 1; v2 < this.FLD108.MTH775() && v1 < v; ++v2) {
            if(ʾʻ0.MTH765(v2) == 0) {
                arr_v[v1] = this.FLD108.MTH781(v2);
                ++v1;
            }
        }
        if(v1 != v) {
            throw ChecksumException.getChecksumInstance();
        }
        return arr_v;
    }
}


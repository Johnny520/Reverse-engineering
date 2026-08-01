// Decompiled by JEB v5.42.0.202606242140

package c.ˎˊ;

import c.ﾞﹶ.CLS375;
import c.ﾞﹶ.CLS378;
import com.google.zxing.NotFoundException;

public class CLS628 extends CLS375 {
    public byte[] FLD585;
    public final int[] FLD586;
    public static final byte[] FLD587;

    static {
        CLS628.FLD587 = new byte[0];
    }

    public CLS628(CLS378 ـᵎ0) {
        super(ـᵎ0);
        this.FLD585 = CLS628.FLD587;
        this.FLD586 = new int[0x20];
    }

    @Override  // c.ﾞﹶ.CLS375
    public CLS117 MTH5095() {
        CLS378 ـᵎ0 = ((CLS375)this).MTH5096();
        int v = ـᵎ0.MTH5110();
        int v1 = ـᵎ0.MTH5107();
        CLS117 ʻᵢ0 = new CLS117(v, v1);
        this.MTH2387(v);
        int[] arr_v = this.FLD586;
        for(int v2 = 1; v2 < 5; ++v2) {
            byte[] arr_b = ـᵎ0.MTH5108(v1 * v2 / 5, this.FLD585);
            for(int v3 = v / 5; v3 < (v << 2) / 5; ++v3) {
                int v4 = (arr_b[v3] & 0xFF) >> 3;
                ++arr_v[v4];
            }
        }
        int v5 = CLS628.MTH2386(arr_v);
        byte[] arr_b1 = ـᵎ0.MTH5105();
        for(int v6 = 0; v6 < v1; ++v6) {
            int v7 = v6 * v;
            for(int v8 = 0; v8 < v; ++v8) {
                if((arr_b1[v7 + v8] & 0xFF) < v5) {
                    ʻᵢ0.MTH2318(v8, v6);
                }
            }
        }
        return ʻᵢ0;
    }

    @Override  // c.ﾞﹶ.CLS375
    public CLS118 MTH5098(int v, CLS118 ˆٴ0) {
        CLS378 ـᵎ0 = ((CLS375)this).MTH5096();
        int v1 = ـᵎ0.MTH5110();
        if(ˆٴ0 == null || ˆٴ0.MTH2347() < v1) {
            ˆٴ0 = new CLS118(v1);
        }
        else {
            ˆٴ0.MTH2360();
        }
        this.MTH2387(v1);
        byte[] arr_b = ـᵎ0.MTH5108(v, this.FLD585);
        int[] arr_v = this.FLD586;
        for(int v3 = 0; v3 < v1; ++v3) {
            int v4 = (arr_b[v3] & 0xFF) >> 3;
            ++arr_v[v4];
        }
        int v5 = CLS628.MTH2386(arr_v);
        if(v1 < 3) {
            for(int v2 = 0; v2 < v1; ++v2) {
                if((arr_b[v2] & 0xFF) < v5) {
                    ˆٴ0.MTH2350(v2);
                }
            }
            return ˆٴ0;
        }
        int v6 = 1;
        int v7 = arr_b[0] & 0xFF;
        for(int v8 = arr_b[1] & 0xFF; v6 < v1 - 1; v8 = v9) {
            int v9 = arr_b[v6 + 1] & 0xFF;
            if(((v8 << 2) - v7 - v9) / 2 < v5) {
                ˆٴ0.MTH2350(v6);
            }
            v7 = v8;
            ++v6;
        }
        return ˆٴ0;
    }

    public static int MTH2386(int[] arr_v) {
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v5 = arr_v[v1];
            if(v5 > v2) {
                v4 = v1;
                v2 = v5;
            }
            if(v5 > v3) {
                v3 = v5;
            }
        }
        int v6 = 0;
        int v7 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            int v8 = arr_v[v] * (v - v4) * (v - v4);
            if(v8 > v7) {
                v6 = v;
                v7 = v8;
            }
        }
        if(v4 <= v6) {
            int v9 = v4;
            v4 = v6;
            v6 = v9;
        }
        if(v4 - v6 <= arr_v.length / 16) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v10 = v4 - 1;
        int v11 = v10;
        int v12 = -1;
        while(v10 > v6) {
            int v13 = (v10 - v6) * (v10 - v6) * (v4 - v10) * (v3 - arr_v[v10]);
            if(v13 > v12) {
                v11 = v10;
                v12 = v13;
            }
            --v10;
        }
        return v11 << 3;
    }

    public final void MTH2387(int v) {
        if(this.FLD585.length < v) {
            this.FLD585 = new byte[v];
        }
        for(int v1 = 0; v1 < 0x20; ++v1) {
            this.FLD586[v1] = 0;
        }
    }
}


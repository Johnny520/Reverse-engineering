// Decompiled by JEB v5.42.0.202606242140

package c.ˎˊ;

import com.google.zxing.NotFoundException;

public final class CLS627 extends CLS122 {
    @Override  // c.ˎˊ.CLS122
    public CLS117 MTH2392(CLS117 ʻᵢ0, int v, int v1, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        return this.MTH2393(ʻᵢ0, v, v1, CLS120.MTH2371(f, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15));
    }

    @Override  // c.ˎˊ.CLS122
    public CLS117 MTH2393(CLS117 ʻᵢ0, int v, int v1, CLS120 י0) {
        if(v <= 0 || v1 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        CLS117 ʻᵢ1 = new CLS117(v, v1);
        float[] arr_f = new float[v * 2];
        for(int v2 = 0; v2 < v1; ++v2) {
            float f = ((float)v2) + 0.5f;
            for(int v3 = 0; v3 < v * 2; v3 += 2) {
                arr_f[v3] = ((float)(v3 / 2)) + 0.5f;
                arr_f[v3 + 1] = f;
            }
            י0.MTH2375(arr_f);
            CLS122.MTH2391(ʻᵢ0, arr_f);
            for(int v4 = 0; v4 < v * 2; v4 += 2) {
                try {
                    if(ʻᵢ0.MTH2331(((int)arr_f[v4]), ((int)arr_f[v4 + 1]))) {
                        ʻᵢ1.MTH2318(v4 / 2, v2);
                    }
                }
                catch(ArrayIndexOutOfBoundsException unused_ex) {
                    throw NotFoundException.getNotFoundInstance();
                }
            }
        }
        return ʻᵢ1;
    }
}


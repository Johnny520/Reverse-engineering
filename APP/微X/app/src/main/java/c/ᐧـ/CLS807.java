// Decompiled by JEB v5.42.0.202606242140

package c.ᐧـ;

import c.ˎˊ.CLS118;
import c.ﾞﹶ.CLS374;
import c.ﾞﹶ.CLS379;
import c.ﾞﹶ.CLS380;
import c.ﾞﹶ.CLS381;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import java.util.Arrays;
import java.util.Map;

public abstract class CLS807 implements CLS381 {
    public abstract CLS379 MTH4611(int arg1, CLS118 arg2, Map arg3);

    public static void MTH4612(CLS118 ˆٴ0, int v, int[] arr_v) {
        int v1 = 0;
        Arrays.fill(arr_v, 0, arr_v.length, 0);
        int v2 = ˆٴ0.MTH2347();
        if(v >= v2) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v3 = !ˆٴ0.MTH2357(v);
        while(v < v2) {
            if((ˆٴ0.MTH2357(v) ^ v3) == 0) {
                ++v1;
                if(v1 == arr_v.length) {
                    break;
                }
                arr_v[v1] = 1;
                v3 ^= 1;
            }
            else {
                ++arr_v[v1];
            }
            ++v;
        }
        if(v1 != arr_v.length && (v1 != arr_v.length - 1 || v != v2)) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    @Override  // c.ﾞﹶ.CLS381
    public CLS379 MTH5132(CLS374 ʻᵢ0, Map map0) {
        try {
            return this.MTH4614(ʻᵢ0, map0);
        }
        catch(NotFoundException notFoundException0) {
            if(map0 == null || !map0.containsKey(DecodeHintType.TRY_HARDER) || !ʻᵢ0.MTH5086()) {
                throw notFoundException0;
            }
            CLS374 ʻᵢ1 = ʻᵢ0.MTH5089();
            CLS379 ٴˑ0 = this.MTH4614(ʻᵢ1, map0);
            Map map1 = ٴˑ0.MTH5122();
            int v1 = 270;
            if(map1 != null) {
                ResultMetadataType resultMetadataType0 = ResultMetadataType.ORIENTATION;
                if(map1.containsKey(resultMetadataType0)) {
                    v1 = (((int)(((Integer)map1.get(resultMetadataType0)))) + 270) % 360;
                }
            }
            ٴˑ0.MTH5120(ResultMetadataType.ORIENTATION, v1);
            CLS380[] arr_ٴⁱ = ٴˑ0.MTH5116();
            if(arr_ٴⁱ != null) {
                int v2 = ʻᵢ1.MTH5088();
                for(int v = 0; v < arr_ٴⁱ.length; ++v) {
                    arr_ٴⁱ[v] = new CLS380(((float)v2) - arr_ٴⁱ[v].MTH5131() - 1.0f, arr_ٴⁱ[v].MTH5130());
                }
            }
            return ٴˑ0;
        }
    }

    public final CLS379 MTH4614(CLS374 ʻᵢ0, Map map0) {
        int v5;
        int v = ʻᵢ0.MTH5090();
        int v1 = ʻᵢ0.MTH5088();
        CLS118 ˆٴ0 = new CLS118(v);
        boolean z = map0 != null && map0.containsKey(DecodeHintType.TRY_HARDER);
        int v2 = Math.max(1, v1 >> (z ? 8 : 5));
        int v3 = 0;
        while(v3 < (z ? v1 : 15)) {
            int v4 = ((v3 & 1) == 0 ? (v3 + 1) / 2 : -((v3 + 1) / 2)) * v2 + (v1 >> 1);
            if(v4 < 0 || v4 >= v1) {
                break;
            }
            try {
                ˆٴ0 = ʻᵢ0.MTH5085(v4, ˆٴ0);
                v5 = 0;
            }
            catch(NotFoundException unused_ex) {
                ++v3;
                continue;
            }
            while(true) {
                try {
                    return this.MTH4611(v4, ˆٴ0, map0);
                }
                catch(ReaderException unused_ex) {
                    ++v5;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static void MTH4615(CLS118 ˆٴ0, int v, int[] arr_v) {
        int v1 = arr_v.length;
        boolean z = ˆٴ0.MTH2357(v);
        while(v > 0 && v1 >= 0) {
            --v;
            if(ˆٴ0.MTH2357(v) != z) {
                --v1;
                z = !z;
            }
        }
        if(v1 >= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        CLS807.MTH4612(ˆٴ0, v + 1, arr_v);
    }

    public static float MTH4616(int[] arr_v, int[] arr_v1, float f) {
        int v2 = 0;
        int v3 = 0;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v2 += arr_v[v1];
            v3 += arr_v1[v1];
        }
        if(v2 < v3) {
            return Infinityf;
        }
        float f1 = ((float)v2) / ((float)v3);
        float f2 = 0.0f;
        for(int v = 0; v < arr_v.length; ++v) {
            int v4 = arr_v[v];
            float f3 = ((float)arr_v1[v]) * f1;
            float f4 = (float)v4;
            float f5 = f4 > f3 ? f4 - f3 : f3 - f4;
            if(f5 > f * f1) {
                return Infinityf;
            }
            f2 += f5;
        }
        return f2 / ((float)v2);
    }
}


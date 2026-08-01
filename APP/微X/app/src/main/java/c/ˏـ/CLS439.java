// Decompiled by JEB v5.42.0.202606242140

package c.ˏـ;

import c.ᐧᵎ.CLS267;
import c.ᐧᵎ.CLS268;
import c.ᐧᵎ.CLS271;
import c.ᐧᵎ.CLS272;
import c.ﾞʾ.CLS365;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import java.util.Arrays;
import java.util.Map;

public abstract class CLS439 implements CLS267 {
    public final CLS271 MTH1677(CLS272 ﾞⁱ0, Map map0) {
        int v5;
        int v = ﾞⁱ0.MTH3497();
        int v1 = ﾞⁱ0.MTH3495();
        CLS365 ⁱˋ0 = new CLS365(v);
        boolean z = map0 != null && map0.containsKey(DecodeHintType.TRY_HARDER);
        int v2 = Math.max(1, v1 >> (z ? 8 : 5));
        int v3 = 0;
        while(v3 < (z ? v1 : 15)) {
            int v4 = ((v3 & 1) == 0 ? (v3 + 1) / 2 : -((v3 + 1) / 2)) * v2 + (v1 >> 1);
            if(v4 < 0 || v4 >= v1) {
                break;
            }
            try {
                ⁱˋ0 = ﾞⁱ0.MTH3500(v4, ⁱˋ0);
                v5 = 0;
            }
            catch(NotFoundException unused_ex) {
                ++v3;
                continue;
            }
            while(true) {
                try {
                    return this.MTH1682(v4, ⁱˋ0, map0);
                }
                catch(ReaderException unused_ex) {
                    ++v5;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static void MTH1678(CLS365 ⁱˋ0, int v, int[] arr_v) {
        int v1 = 0;
        Arrays.fill(arr_v, 0, arr_v.length, 0);
        int v2 = ⁱˋ0.MTH5007();
        if(v >= v2) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v3 = !ⁱˋ0.MTH5018(v);
        while(v < v2) {
            if((ⁱˋ0.MTH5018(v) ^ v3) == 0) {
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

    public static float MTH1679(int[] arr_v, int[] arr_v1, float f) {
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

    public static void MTH1680(CLS365 ⁱˋ0, int v, int[] arr_v) {
        int v1 = arr_v.length;
        boolean z = ⁱˋ0.MTH5018(v);
        while(v > 0 && v1 >= 0) {
            --v;
            if(ⁱˋ0.MTH5018(v) != z) {
                --v1;
                z = !z;
            }
        }
        if(v1 >= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        CLS439.MTH1678(ⁱˋ0, v + 1, arr_v);
    }

    @Override  // c.ᐧᵎ.CLS267
    public CLS271 MTH3463(CLS272 ﾞⁱ0, Map map0) {
        try {
            return this.MTH1677(ﾞⁱ0, map0);
        }
        catch(NotFoundException notFoundException0) {
            if(map0 == null || !map0.containsKey(DecodeHintType.TRY_HARDER) || !ﾞⁱ0.MTH3496()) {
                throw notFoundException0;
            }
            CLS272 ﾞⁱ1 = ﾞⁱ0.MTH3498();
            CLS271 ﾞʿ0 = this.MTH1677(ﾞⁱ1, map0);
            Map map1 = ﾞʿ0.MTH3487();
            int v1 = 270;
            if(map1 != null) {
                ResultMetadataType resultMetadataType0 = ResultMetadataType.ORIENTATION;
                if(map1.containsKey(resultMetadataType0)) {
                    v1 = (((int)(((Integer)map1.get(resultMetadataType0)))) + 270) % 360;
                }
            }
            ﾞʿ0.MTH3489(ResultMetadataType.ORIENTATION, v1);
            CLS268[] arr_ᵔʼ = ﾞʿ0.MTH3486();
            if(arr_ᵔʼ != null) {
                int v2 = ﾞⁱ1.MTH3495();
                for(int v = 0; v < arr_ᵔʼ.length; ++v) {
                    arr_ᵔʼ[v] = new CLS268(((float)v2) - arr_ᵔʼ[v].MTH3470() - 1.0f, arr_ᵔʼ[v].MTH3468());
                }
            }
            return ﾞʿ0;
        }
    }

    public abstract CLS271 MTH1682(int arg1, CLS365 arg2, Map arg3);
}


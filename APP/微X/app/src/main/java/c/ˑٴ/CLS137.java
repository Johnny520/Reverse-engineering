// Decompiled by JEB v5.42.0.202606242140

package c.ˑٴ;

import c.ˎʼ.CLS114;
import c.ˎˊ.CLS117;
import c.ˎˊ.CLS120;
import c.ˎˊ.CLS122;
import c.ˎˊ.CLS123;
import c.ᐧᵔ.CLS329;
import c.ﾞﹶ.CLS376;
import c.ﾞﹶ.CLS380;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.Map;

public class CLS137 {
    public CLS376 FLD649;
    public final CLS117 FLD650;

    public CLS137(CLS117 ʻᵢ0) {
        this.FLD650 = ʻᵢ0;
    }

    public final float MTH2535(CLS380 ٴⁱ0, CLS380 ٴⁱ1) {
        float f = this.MTH2538(((int)ٴⁱ0.MTH5130()), ((int)ٴⁱ0.MTH5131()), ((int)ٴⁱ1.MTH5130()), ((int)ٴⁱ1.MTH5131()));
        float f1 = this.MTH2538(((int)ٴⁱ1.MTH5130()), ((int)ٴⁱ1.MTH5131()), ((int)ٴⁱ0.MTH5130()), ((int)ٴⁱ0.MTH5131()));
        if(Float.isNaN(f)) {
            return f1 / 7.0f;
        }
        return Float.isNaN(f1) ? f / 7.0f : (f + f1) / 14.0f;
    }

    public CLS123 MTH2536() {
        return this.MTH2544(null);
    }

    public final float MTH2537(CLS380 ٴⁱ0, CLS380 ٴⁱ1, CLS380 ٴⁱ2) {
        return (this.MTH2535(ٴⁱ0, ٴⁱ1) + this.MTH2535(ٴⁱ0, ٴⁱ2)) / 2.0f;
    }

    public final float MTH2538(int v, int v1, int v2, int v3) {
        float f1;
        float f = this.MTH2540(v, v1, v2, v3);
        int v4 = v * 2 - v2;
        if(v4 < 0) {
            f1 = ((float)v) / ((float)(v - v4));
            v4 = 0;
        }
        else if(v4 >= this.FLD650.MTH2325()) {
            f1 = ((float)(this.FLD650.MTH2325() - 1 - v)) / ((float)(v4 - v));
            v4 = this.FLD650.MTH2325() - 1;
        }
        else {
            f1 = 1.0f;
        }
        int v5 = (int)(((float)v1) - ((float)(v3 - v1)) * f1);
        if(v5 < 0) {
            return f + this.MTH2540(v, v1, ((int)(((float)v) + ((float)(v4 - v)) * (((float)v1) / ((float)(v1 - v5))))), 0) - 1.0f;
        }
        return v5 < this.FLD650.MTH2328() ? f + this.MTH2540(v, v1, ((int)(((float)v) + ((float)(v4 - v)) * 1.0f)), v5) - 1.0f : f + this.MTH2540(v, v1, ((int)(((float)v) + ((float)(v4 - v)) * (((float)(this.FLD650.MTH2328() - 1 - v1)) / ((float)(v5 - v1))))), this.FLD650.MTH2328() - 1) - 1.0f;
    }

    public static CLS117 MTH2539(CLS117 ʻᵢ0, CLS120 י0, int v) {
        return CLS122.MTH2390().MTH2393(ʻᵢ0, v, v, י0);
    }

    public final float MTH2540(int v, int v1, int v2, int v3) {
        boolean z;
        int v18;
        int v8;
        int v7;
        int v6;
        int v5;
        int v4 = Math.abs(v3 - v1) <= Math.abs(v2 - v) ? 0 : 1;
        if(v4 == 0) {
            v6 = v;
            v5 = v1;
            v8 = v2;
            v7 = v3;
        }
        else {
            v5 = v;
            v6 = v1;
            v7 = v2;
            v8 = v3;
        }
        int v9 = Math.abs(v8 - v6);
        int v10 = Math.abs(v7 - v5);
        int v11 = -v9 / 2;
        int v12 = -1;
        int v13 = v6 >= v8 ? -1 : 1;
        if(v5 < v7) {
            v12 = 1;
        }
        int v14 = v8 + v13;
        int v15 = v6;
        int v16 = v5;
        int v17 = 0;
        while(true) {
            if(v15 == v14) {
                v18 = v14;
                break;
            }
            if(v17 == 1) {
                v18 = v14;
                z = true;
            }
            else {
                v18 = v14;
                z = false;
            }
            if(z == this.FLD650.MTH2331((v4 == 0 ? v15 : v16), (v4 == 0 ? v16 : v15))) {
                if(v17 == 2) {
                    return CLS114.MTH2295(v15, v16, v6, v5);
                }
                ++v17;
            }
            v11 += v10;
            if(v11 > 0) {
                if(v16 == v7) {
                    break;
                }
                v16 += v12;
                v11 -= v9;
            }
            v15 += v13;
            v14 = v18;
        }
        return v17 == 2 ? CLS114.MTH2295(v18, v7, v6, v5) : NaNf;
    }

    public static int MTH2541(CLS380 ٴⁱ0, CLS380 ٴⁱ1, CLS380 ٴⁱ2, float f) {
        int v = (CLS114.MTH2297(CLS380.MTH5127(ٴⁱ0, ٴⁱ1) / f) + CLS114.MTH2297(CLS380.MTH5127(ٴⁱ0, ٴⁱ2) / f)) / 2 + 7;
        switch(v & 3) {
            case 0: {
                return v + 1;
            }
            case 2: {
                return v - 1;
            }
            default: {
                if((v & 3) == 3) {
                    throw NotFoundException.getNotFoundInstance();
                }
                return v;
            }
        }
    }

    public final CLS640 MTH2542(float f, int v, int v1, float f1) {
        int v2 = (int)(f1 * f);
        int v3 = Math.max(0, v - v2);
        int v4 = Math.min(this.FLD650.MTH2325() - 1, v + v2) - v3;
        if(((float)v4) < 3.0f * f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v5 = Math.max(0, v1 - v2);
        int v6 = Math.min(this.FLD650.MTH2328() - 1, v1 + v2) - v5;
        if(((float)v6) < 3.0f * f) {
            throw NotFoundException.getNotFoundInstance();
        }
        return new CLS132(this.FLD650, v3, v5, v4, v6, f, this.FLD649).MTH2509();
    }

    public final CLS123 MTH2543(CLS138 ᴵⁱ0) {
        CLS380 ٴⁱ1;
        CLS641 ᵔﹶ0 = ᴵⁱ0.MTH2547();
        CLS641 ᵔﹶ1 = ᴵⁱ0.MTH2549();
        CLS641 ᵔﹶ2 = ᴵⁱ0.MTH2548();
        float f = this.MTH2537(((CLS380)ᵔﹶ0), ((CLS380)ᵔﹶ1), ((CLS380)ᵔﹶ2));
        if(f < 1.0f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v = CLS137.MTH2541(((CLS380)ᵔﹶ0), ((CLS380)ᵔﹶ1), ((CLS380)ᵔﹶ2), f);
        CLS329 ٴⁱ0 = CLS329.MTH4747(v);
        int v1 = ٴⁱ0.MTH4742();
        if(ٴⁱ0.MTH4750().length > 0) {
            float f1 = ((CLS380)ᵔﹶ1).MTH5130();
            float f2 = ((CLS380)ᵔﹶ0).MTH5130();
            float f3 = ((CLS380)ᵔﹶ2).MTH5130();
            float f4 = ((CLS380)ᵔﹶ1).MTH5131();
            float f5 = ((CLS380)ᵔﹶ0).MTH5131();
            float f6 = ((CLS380)ᵔﹶ2).MTH5131();
            float f7 = 1.0f - 3.0f / ((float)(v1 - 7));
            float f8 = ((CLS380)ᵔﹶ0).MTH5130();
            float f9 = ((CLS380)ᵔﹶ0).MTH5130();
            float f10 = ((CLS380)ᵔﹶ0).MTH5131();
            float f11 = ((CLS380)ᵔﹶ0).MTH5131();
            int v2 = 4;
            while(true) {
                try {
                    ٴⁱ1 = this.MTH2542(f, ((int)(f8 + (f1 - f2 + f3 - f9) * f7)), ((int)(f10 + f7 * (f4 - f5 + f6 - f11))), ((float)v2));
                    break;
                }
                catch(NotFoundException unused_ex) {
                    v2 <<= 1;
                }
            }
        }
        else {
            ٴⁱ1 = null;
        }
        CLS120 י0 = CLS137.MTH2545(((CLS380)ᵔﹶ0), ((CLS380)ᵔﹶ1), ((CLS380)ᵔﹶ2), ٴⁱ1, v);
        CLS117 ʻᵢ0 = CLS137.MTH2539(this.FLD650, י0, v);
        return ٴⁱ1 == null ? new CLS123(ʻᵢ0, new CLS380[]{ᵔﹶ2, ᵔﹶ0, ᵔﹶ1}) : new CLS123(ʻᵢ0, new CLS380[]{ᵔﹶ2, ᵔﹶ0, ᵔﹶ1, ٴⁱ1});
    }

    public final CLS123 MTH2544(Map map0) {
        CLS376 ˋᵎ0 = map0 == null ? null : ((CLS376)map0.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK));
        this.FLD649 = ˋᵎ0;
        return this.MTH2543(new CLS136(this.FLD650, ˋᵎ0).MTH2521(map0));
    }

    public static CLS120 MTH2545(CLS380 ٴⁱ0, CLS380 ٴⁱ1, CLS380 ٴⁱ2, CLS380 ٴⁱ3, int v) {
        float f;
        if(ٴⁱ3 != null) {
            f = ((float)v) - 3.5f - 3.0f;
            return CLS120.MTH2371(3.5f, 3.5f, ((float)v) - 3.5f, 3.5f, f, f, 3.5f, ((float)v) - 3.5f, ٴⁱ0.MTH5130(), ٴⁱ0.MTH5131(), ٴⁱ1.MTH5130(), ٴⁱ1.MTH5131(), ٴⁱ3.MTH5130(), ٴⁱ3.MTH5131(), ٴⁱ2.MTH5130(), ٴⁱ2.MTH5131());
        }
        f = ((float)v) - 3.5f;
        return CLS120.MTH2371(3.5f, 3.5f, ((float)v) - 3.5f, 3.5f, f, f, 3.5f, ((float)v) - 3.5f, ٴⁱ0.MTH5130(), ٴⁱ0.MTH5131(), ٴⁱ1.MTH5130(), ٴⁱ1.MTH5131(), ٴⁱ1.MTH5130() - ٴⁱ0.MTH5130() + ٴⁱ2.MTH5130(), ٴⁱ1.MTH5131() - ٴⁱ0.MTH5131() + ٴⁱ2.MTH5131(), ٴⁱ2.MTH5130(), ٴⁱ2.MTH5131());
    }
}


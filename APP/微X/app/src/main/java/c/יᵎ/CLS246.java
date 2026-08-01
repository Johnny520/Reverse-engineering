// Decompiled by JEB v5.42.0.202606242140

package c.יᵎ;

import c.ٴʽ.CLS258;
import c.ᐧᵎ.CLS266;
import c.ᐧᵎ.CLS268;
import c.ᵢˎ.CLS327;
import c.ﾞʾ.CLS362;
import c.ﾞʾ.CLS363;
import c.ﾞʾ.CLS364;
import c.ﾞʾ.CLS366;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.Map;

public class CLS246 {
    public final CLS366 FLD972;
    public CLS266 FLD973;

    public CLS246(CLS366 ﾞⁱ0) {
        this.FLD972 = ﾞⁱ0;
    }

    public static int MTH3255(CLS268 ᵔʼ0, CLS268 ᵔʼ1, CLS268 ᵔʼ2, float f) {
        int v = (CLS258.MTH3383(CLS268.MTH3472(ᵔʼ0, ᵔʼ1) / f) + CLS258.MTH3383(CLS268.MTH3472(ᵔʼ0, ᵔʼ2) / f)) / 2 + 7;
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

    public static CLS366 MTH3256(CLS366 ﾞⁱ0, CLS364 ᵢʼ0, int v) {
        return CLS363.MTH4986().MTH4984(ﾞⁱ0, v, v, ᵢʼ0);
    }

    public CLS362 MTH3257() {
        return this.MTH3260(null);
    }

    public static CLS364 MTH3258(CLS268 ᵔʼ0, CLS268 ᵔʼ1, CLS268 ᵔʼ2, CLS268 ᵔʼ3, int v) {
        float f;
        if(ᵔʼ3 != null) {
            f = ((float)v) - 3.5f - 3.0f;
            return CLS364.MTH4993(3.5f, 3.5f, ((float)v) - 3.5f, 3.5f, f, f, 3.5f, ((float)v) - 3.5f, ᵔʼ0.MTH3468(), ᵔʼ0.MTH3470(), ᵔʼ1.MTH3468(), ᵔʼ1.MTH3470(), ᵔʼ3.MTH3468(), ᵔʼ3.MTH3470(), ᵔʼ2.MTH3468(), ᵔʼ2.MTH3470());
        }
        f = ((float)v) - 3.5f;
        return CLS364.MTH4993(3.5f, 3.5f, ((float)v) - 3.5f, 3.5f, f, f, 3.5f, ((float)v) - 3.5f, ᵔʼ0.MTH3468(), ᵔʼ0.MTH3470(), ᵔʼ1.MTH3468(), ᵔʼ1.MTH3470(), ᵔʼ1.MTH3468() - ᵔʼ0.MTH3468() + ᵔʼ2.MTH3468(), ᵔʼ1.MTH3470() - ᵔʼ0.MTH3470() + ᵔʼ2.MTH3470(), ᵔʼ2.MTH3468(), ᵔʼ2.MTH3470());
    }

    public final float MTH3259(int v, int v1, int v2, int v3) {
        float f1;
        float f = this.MTH3262(v, v1, v2, v3);
        int v4 = v * 2 - v2;
        if(v4 < 0) {
            f1 = ((float)v) / ((float)(v - v4));
            v4 = 0;
        }
        else if(v4 >= this.FLD972.MTH5044()) {
            f1 = ((float)(this.FLD972.MTH5044() - 1 - v)) / ((float)(v4 - v));
            v4 = this.FLD972.MTH5044() - 1;
        }
        else {
            f1 = 1.0f;
        }
        int v5 = (int)(((float)v1) - ((float)(v3 - v1)) * f1);
        if(v5 < 0) {
            return f + this.MTH3262(v, v1, ((int)(((float)v) + ((float)(v4 - v)) * (((float)v1) / ((float)(v1 - v5))))), 0) - 1.0f;
        }
        return v5 < this.FLD972.MTH5046() ? f + this.MTH3262(v, v1, ((int)(((float)v) + ((float)(v4 - v)) * 1.0f)), v5) - 1.0f : f + this.MTH3262(v, v1, ((int)(((float)v) + ((float)(v4 - v)) * (((float)(this.FLD972.MTH5046() - 1 - v1)) / ((float)(v5 - v1))))), this.FLD972.MTH5046() - 1) - 1.0f;
    }

    public final CLS362 MTH3260(Map map0) {
        CLS266 ʾᐧ0 = map0 == null ? null : ((CLS266)map0.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK));
        this.FLD973 = ʾᐧ0;
        return this.MTH3261(new CLS250(this.FLD972, ʾᐧ0).MTH3277(map0));
    }

    public final CLS362 MTH3261(CLS251 ˋʼ0) {
        CLS268 ᵔʼ1;
        CLS571 ˉˎ0 = ˋʼ0.MTH3295();
        CLS571 ˉˎ1 = ˋʼ0.MTH3293();
        CLS571 ˉˎ2 = ˋʼ0.MTH3294();
        float f = this.MTH3263(((CLS268)ˉˎ0), ((CLS268)ˉˎ1), ((CLS268)ˉˎ2));
        if(f < 1.0f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v = CLS246.MTH3255(((CLS268)ˉˎ0), ((CLS268)ˉˎ1), ((CLS268)ˉˎ2), f);
        CLS327 ᵔʼ0 = CLS327.MTH4748(v);
        int v1 = ᵔʼ0.MTH4742();
        if(ᵔʼ0.MTH4743().length > 0) {
            float f1 = ((CLS268)ˉˎ1).MTH3468();
            float f2 = ((CLS268)ˉˎ0).MTH3468();
            float f3 = ((CLS268)ˉˎ2).MTH3468();
            float f4 = ((CLS268)ˉˎ1).MTH3470();
            float f5 = ((CLS268)ˉˎ0).MTH3470();
            float f6 = ((CLS268)ˉˎ2).MTH3470();
            float f7 = 1.0f - 3.0f / ((float)(v1 - 7));
            float f8 = ((CLS268)ˉˎ0).MTH3468();
            float f9 = ((CLS268)ˉˎ0).MTH3468();
            float f10 = ((CLS268)ˉˎ0).MTH3470();
            float f11 = ((CLS268)ˉˎ0).MTH3470();
            int v2 = 4;
            while(true) {
                try {
                    ᵔʼ1 = this.MTH3264(f, ((int)(f8 + (f1 - f2 + f3 - f9) * f7)), ((int)(f10 + f7 * (f4 - f5 + f6 - f11))), ((float)v2));
                    break;
                }
                catch(NotFoundException unused_ex) {
                    v2 <<= 1;
                }
            }
        }
        else {
            ᵔʼ1 = null;
        }
        CLS364 ᵢʼ0 = CLS246.MTH3258(((CLS268)ˉˎ0), ((CLS268)ˉˎ1), ((CLS268)ˉˎ2), ᵔʼ1, v);
        CLS366 ﾞⁱ0 = CLS246.MTH3256(this.FLD972, ᵢʼ0, v);
        return ᵔʼ1 == null ? new CLS362(ﾞⁱ0, new CLS268[]{ˉˎ2, ˉˎ0, ˉˎ1}) : new CLS362(ﾞⁱ0, new CLS268[]{ˉˎ2, ˉˎ0, ˉˎ1, ᵔʼ1});
    }

    public final float MTH3262(int v, int v1, int v2, int v3) {
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
            if(z == this.FLD972.MTH5038((v4 == 0 ? v15 : v16), (v4 == 0 ? v16 : v15))) {
                if(v17 == 2) {
                    return CLS258.MTH3386(v15, v16, v6, v5);
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
        return v17 == 2 ? CLS258.MTH3386(v18, v7, v6, v5) : NaNf;
    }

    public final float MTH3263(CLS268 ᵔʼ0, CLS268 ᵔʼ1, CLS268 ᵔʼ2) {
        return (this.MTH3265(ᵔʼ0, ᵔʼ1) + this.MTH3265(ᵔʼ0, ᵔʼ2)) / 2.0f;
    }

    public final CLS572 MTH3264(float f, int v, int v1, float f1) {
        int v2 = (int)(f1 * f);
        int v3 = Math.max(0, v - v2);
        int v4 = Math.min(this.FLD972.MTH5044() - 1, v + v2) - v3;
        if(((float)v4) < 3.0f * f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v5 = Math.max(0, v1 - v2);
        int v6 = Math.min(this.FLD972.MTH5046() - 1, v1 + v2) - v5;
        if(((float)v6) < 3.0f * f) {
            throw NotFoundException.getNotFoundInstance();
        }
        return new CLS252(this.FLD972, v3, v5, v4, v6, f, this.FLD973).MTH3300();
    }

    public final float MTH3265(CLS268 ᵔʼ0, CLS268 ᵔʼ1) {
        float f = this.MTH3259(((int)ᵔʼ0.MTH3468()), ((int)ᵔʼ0.MTH3470()), ((int)ᵔʼ1.MTH3468()), ((int)ᵔʼ1.MTH3470()));
        float f1 = this.MTH3259(((int)ᵔʼ1.MTH3468()), ((int)ᵔʼ1.MTH3470()), ((int)ᵔʼ0.MTH3468()), ((int)ᵔʼ0.MTH3470()));
        if(Float.isNaN(f)) {
            return f1 / 7.0f;
        }
        return Float.isNaN(f1) ? f / 7.0f : (f + f1) / 14.0f;
    }
}


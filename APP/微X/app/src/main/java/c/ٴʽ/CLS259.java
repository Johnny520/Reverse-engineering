// Decompiled by JEB v5.42.0.202606242140

package c.ٴʽ;

import c.ᐧᵎ.CLS268;
import c.ﾞʾ.CLS366;
import com.google.zxing.NotFoundException;

public final class CLS259 {
    public final int FLD1020;
    public final int FLD1021;
    public final int FLD1022;
    public final int FLD1023;
    public final CLS366 FLD1024;
    public final int FLD1025;
    public final int FLD1026;

    public CLS259(CLS366 ﾞⁱ0) {
        this(ﾞⁱ0, 10, ﾞⁱ0.MTH5044() / 2, ﾞⁱ0.MTH5046() / 2);
    }

    public CLS259(CLS366 ﾞⁱ0, int v, int v1, int v2) {
        this.FLD1024 = ﾞⁱ0;
        int v3 = ﾞⁱ0.MTH5046();
        this.FLD1026 = v3;
        int v4 = ﾞⁱ0.MTH5044();
        this.FLD1020 = v4;
        int v5 = v1 - v / 2;
        this.FLD1022 = v5;
        int v6 = v1 + v / 2;
        this.FLD1021 = v6;
        int v7 = v2 - v / 2;
        this.FLD1025 = v7;
        int v8 = v2 + v / 2;
        this.FLD1023 = v8;
        if(v7 < 0 || v5 < 0 || v8 >= v3 || v6 >= v4) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    public CLS268[] MTH3389() {
        int v = this.FLD1022;
        int v1 = this.FLD1021;
        int v2 = this.FLD1025;
        int v3 = this.FLD1023;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int v5 = 1;
        while(v5 != 0) {
            boolean z6 = true;
            int v6 = 0;
            while((z6 || !z1) && v1 < this.FLD1020) {
                z6 = this.MTH3392(v2, v3, v1, false);
                if(z6) {
                    ++v1;
                    z1 = true;
                    v6 = 1;
                }
                else if(!z1) {
                    ++v1;
                }
            }
            if(v1 < this.FLD1020) {
                boolean z7 = true;
                while((z7 || !z2) && v3 < this.FLD1026) {
                    z7 = this.MTH3392(v, v1, v3, true);
                    if(z7) {
                        ++v3;
                        z2 = true;
                        v6 = 1;
                    }
                    else if(!z2) {
                        ++v3;
                    }
                }
                if(v3 < this.FLD1026) {
                    boolean z8 = true;
                    while((z8 || !z3) && v >= 0) {
                        z8 = this.MTH3392(v2, v3, v, false);
                        if(z8) {
                            --v;
                            z3 = true;
                            v6 = 1;
                        }
                        else if(!z3) {
                            --v;
                        }
                    }
                    if(v >= 0) {
                        v5 = v6;
                        boolean z9 = true;
                        while((z9 || !z5) && v2 >= 0) {
                            z9 = this.MTH3392(v, v1, v2, true);
                            if(z9) {
                                --v2;
                                v5 = 1;
                                z5 = true;
                            }
                            else if(!z5) {
                                --v2;
                            }
                        }
                        if(v2 >= 0) {
                            if(v5 == 0) {
                                continue;
                            }
                            z4 = true;
                            continue;
                        }
                    }
                }
            }
            z = true;
            if(true) {
                break;
            }
        }
        if(z || !z4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v7 = v1 - v;
        CLS268 ᵔʼ0 = null;
        CLS268 ᵔʼ1 = null;
        for(int v8 = 1; ᵔʼ1 == null && v8 < v7; ++v8) {
            ᵔʼ1 = this.MTH3390(((float)v), ((float)(v3 - v8)), ((float)(v + v8)), ((float)v3));
        }
        if(ᵔʼ1 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        CLS268 ᵔʼ2 = null;
        for(int v9 = 1; ᵔʼ2 == null && v9 < v7; ++v9) {
            ᵔʼ2 = this.MTH3390(((float)v), ((float)(v2 + v9)), ((float)(v + v9)), ((float)v2));
        }
        if(ᵔʼ2 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        CLS268 ᵔʼ3 = null;
        for(int v10 = 1; ᵔʼ3 == null && v10 < v7; ++v10) {
            ᵔʼ3 = this.MTH3390(((float)v1), ((float)(v2 + v10)), ((float)(v1 - v10)), ((float)v2));
        }
        if(ᵔʼ3 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        for(int v4 = 1; ᵔʼ0 == null && v4 < v7; ++v4) {
            ᵔʼ0 = this.MTH3390(((float)v1), ((float)(v3 - v4)), ((float)(v1 - v4)), ((float)v3));
        }
        if(ᵔʼ0 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        return this.MTH3391(ᵔʼ0, ᵔʼ1, ᵔʼ3, ᵔʼ2);
    }

    public final CLS268 MTH3390(float f, float f1, float f2, float f3) {
        int v = CLS258.MTH3383(CLS258.MTH3385(f, f1, f2, f3));
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = CLS258.MTH3383(((float)v1) * ((f2 - f) / ((float)v)) + f);
            int v3 = CLS258.MTH3383(((float)v1) * ((f3 - f1) / ((float)v)) + f1);
            if(this.FLD1024.MTH5038(v2, v3)) {
                return new CLS268(((float)v2), ((float)v3));
            }
        }
        return null;
    }

    public final CLS268[] MTH3391(CLS268 ᵔʼ0, CLS268 ᵔʼ1, CLS268 ᵔʼ2, CLS268 ᵔʼ3) {
        float f = ᵔʼ0.MTH3468();
        float f1 = ᵔʼ0.MTH3470();
        float f2 = ᵔʼ1.MTH3468();
        float f3 = ᵔʼ1.MTH3470();
        float f4 = ᵔʼ2.MTH3468();
        float f5 = ᵔʼ2.MTH3470();
        float f6 = ᵔʼ3.MTH3468();
        float f7 = ᵔʼ3.MTH3470();
        return f < ((float)this.FLD1020) / 2.0f ? new CLS268[]{new CLS268(f6 - 1.0f, f7 + 1.0f), new CLS268(f2 + 1.0f, f3 + 1.0f), new CLS268(f4 - 1.0f, f5 - 1.0f), new CLS268(f + 1.0f, f1 - 1.0f)} : new CLS268[]{new CLS268(f6 + 1.0f, f7 + 1.0f), new CLS268(f2 + 1.0f, f3 - 1.0f), new CLS268(f4 - 1.0f, f5 + 1.0f), new CLS268(f - 1.0f, f1 - 1.0f)};
    }

    public final boolean MTH3392(int v, int v1, int v2, boolean z) {
        if(z) {
            while(v <= v1) {
                if(this.FLD1024.MTH5038(v, v2)) {
                    return true;
                }
                ++v;
            }
            return false;
        }
        while(v <= v1) {
            if(this.FLD1024.MTH5038(v2, v)) {
                return true;
            }
            ++v;
        }
        return false;
    }
}


// Decompiled by JEB v5.42.0.202606242140

package c.ˎʼ;

import c.ˎˊ.CLS117;
import c.ﾞﹶ.CLS380;
import com.google.zxing.NotFoundException;

public final class CLS113 {
    public final int FLD552;
    public final int FLD553;
    public final CLS117 FLD554;
    public final int FLD555;
    public final int FLD556;
    public final int FLD557;
    public final int FLD558;

    public CLS113(CLS117 ʻᵢ0) {
        this(ʻᵢ0, 10, ʻᵢ0.MTH2325() / 2, ʻᵢ0.MTH2328() / 2);
    }

    public CLS113(CLS117 ʻᵢ0, int v, int v1, int v2) {
        this.FLD554 = ʻᵢ0;
        int v3 = ʻᵢ0.MTH2328();
        this.FLD552 = v3;
        int v4 = ʻᵢ0.MTH2325();
        this.FLD555 = v4;
        int v5 = v1 - v / 2;
        this.FLD558 = v5;
        int v6 = v1 + v / 2;
        this.FLD553 = v6;
        int v7 = v2 - v / 2;
        this.FLD556 = v7;
        int v8 = v2 + v / 2;
        this.FLD557 = v8;
        if(v7 < 0 || v5 < 0 || v8 >= v3 || v6 >= v4) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    public final boolean MTH2291(int v, int v1, int v2, boolean z) {
        if(z) {
            while(v <= v1) {
                if(this.FLD554.MTH2331(v, v2)) {
                    return true;
                }
                ++v;
            }
            return false;
        }
        while(v <= v1) {
            if(this.FLD554.MTH2331(v2, v)) {
                return true;
            }
            ++v;
        }
        return false;
    }

    public final CLS380[] MTH2292(CLS380 ٴⁱ0, CLS380 ٴⁱ1, CLS380 ٴⁱ2, CLS380 ٴⁱ3) {
        float f = ٴⁱ0.MTH5130();
        float f1 = ٴⁱ0.MTH5131();
        float f2 = ٴⁱ1.MTH5130();
        float f3 = ٴⁱ1.MTH5131();
        float f4 = ٴⁱ2.MTH5130();
        float f5 = ٴⁱ2.MTH5131();
        float f6 = ٴⁱ3.MTH5130();
        float f7 = ٴⁱ3.MTH5131();
        return f < ((float)this.FLD555) / 2.0f ? new CLS380[]{new CLS380(f6 - 1.0f, f7 + 1.0f), new CLS380(f2 + 1.0f, f3 + 1.0f), new CLS380(f4 - 1.0f, f5 - 1.0f), new CLS380(f + 1.0f, f1 - 1.0f)} : new CLS380[]{new CLS380(f6 + 1.0f, f7 + 1.0f), new CLS380(f2 + 1.0f, f3 - 1.0f), new CLS380(f4 - 1.0f, f5 + 1.0f), new CLS380(f - 1.0f, f1 - 1.0f)};
    }

    public CLS380[] MTH2293() {
        int v = this.FLD558;
        int v1 = this.FLD553;
        int v2 = this.FLD556;
        int v3 = this.FLD557;
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
            while((z6 || !z1) && v1 < this.FLD555) {
                z6 = this.MTH2291(v2, v3, v1, false);
                if(z6) {
                    ++v1;
                    z1 = true;
                    v6 = 1;
                }
                else if(!z1) {
                    ++v1;
                }
            }
            if(v1 < this.FLD555) {
                boolean z7 = true;
                while((z7 || !z2) && v3 < this.FLD552) {
                    z7 = this.MTH2291(v, v1, v3, true);
                    if(z7) {
                        ++v3;
                        z2 = true;
                        v6 = 1;
                    }
                    else if(!z2) {
                        ++v3;
                    }
                }
                if(v3 < this.FLD552) {
                    boolean z8 = true;
                    while((z8 || !z3) && v >= 0) {
                        z8 = this.MTH2291(v2, v3, v, false);
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
                            z9 = this.MTH2291(v, v1, v2, true);
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
        CLS380 ٴⁱ0 = null;
        CLS380 ٴⁱ1 = null;
        for(int v8 = 1; ٴⁱ1 == null && v8 < v7; ++v8) {
            ٴⁱ1 = this.MTH2294(((float)v), ((float)(v3 - v8)), ((float)(v + v8)), ((float)v3));
        }
        if(ٴⁱ1 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        CLS380 ٴⁱ2 = null;
        for(int v9 = 1; ٴⁱ2 == null && v9 < v7; ++v9) {
            ٴⁱ2 = this.MTH2294(((float)v), ((float)(v2 + v9)), ((float)(v + v9)), ((float)v2));
        }
        if(ٴⁱ2 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        CLS380 ٴⁱ3 = null;
        for(int v10 = 1; ٴⁱ3 == null && v10 < v7; ++v10) {
            ٴⁱ3 = this.MTH2294(((float)v1), ((float)(v2 + v10)), ((float)(v1 - v10)), ((float)v2));
        }
        if(ٴⁱ3 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        for(int v4 = 1; ٴⁱ0 == null && v4 < v7; ++v4) {
            ٴⁱ0 = this.MTH2294(((float)v1), ((float)(v3 - v4)), ((float)(v1 - v4)), ((float)v3));
        }
        if(ٴⁱ0 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        return this.MTH2292(ٴⁱ0, ٴⁱ1, ٴⁱ3, ٴⁱ2);
    }

    public final CLS380 MTH2294(float f, float f1, float f2, float f3) {
        int v = CLS114.MTH2297(CLS114.MTH2296(f, f1, f2, f3));
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = CLS114.MTH2297(((float)v1) * ((f2 - f) / ((float)v)) + f);
            int v3 = CLS114.MTH2297(((float)v1) * ((f3 - f1) / ((float)v)) + f1);
            if(this.FLD554.MTH2331(v2, v3)) {
                return new CLS380(((float)v2), ((float)v3));
            }
        }
        return null;
    }
}


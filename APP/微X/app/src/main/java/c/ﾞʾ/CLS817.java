// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʾ;

public final class CLS817 extends CLS371 {
    public final boolean FLD1633;

    public CLS817(CLS370 ـᵎ0, boolean z) {
        super(ـᵎ0);
        this.FLD1633 = z;
    }

    @Override  // c.ﾞʾ.CLS371
    public String toString() {
        return "IsLeft: " + this.FLD1633 + '\n' + ((CLS371)this).super.toString();
    }

    public final void MTH5037(CLS373[] arr_ᵔﹶ, CLS367 ˆٴ0) {
        for(int v = 0; v < arr_ᵔﹶ.length; ++v) {
            CLS373 ᵔﹶ0 = arr_ᵔﹶ[v];
            if(ᵔﹶ0 != null) {
                int v1 = ᵔﹶ0.MTH5066() % 30;
                int v2 = ᵔﹶ0.MTH5070();
                if(v2 > ˆٴ0.MTH4981()) {
                    arr_ᵔﹶ[v] = null;
                }
                else {
                    if(!this.FLD1633) {
                        v2 += 2;
                    }
                    switch(v2 % 3) {
                        case 0: {
                            if(v1 * 3 + 1 != ˆٴ0.MTH4979()) {
                                arr_ᵔﹶ[v] = null;
                            }
                            break;
                        }
                        case 1: {
                            if(v1 / 3 != ˆٴ0.MTH4978() || v1 % 3 != ˆٴ0.MTH4982()) {
                                arr_ᵔﹶ[v] = null;
                            }
                            break;
                        }
                        default: {
                            if(v2 % 3 == 2 && v1 + 1 != ˆٴ0.MTH4980()) {
                                arr_ᵔﹶ[v] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean MTH5038() {
        return this.FLD1633;
    }

    public CLS367 MTH5039() {
        CLS373[] arr_ᵔﹶ = ((CLS371)this).MTH5034();
        CLS363 ʻᵢ0 = new CLS363();
        CLS363 ʻᵢ1 = new CLS363();
        CLS363 ʻᵢ2 = new CLS363();
        CLS363 ʻᵢ3 = new CLS363();
        for(int v = 0; v < arr_ᵔﹶ.length; ++v) {
            CLS373 ᵔﹶ0 = arr_ᵔﹶ[v];
            if(ᵔﹶ0 != null) {
                ᵔﹶ0.MTH5069();
                int v1 = ᵔﹶ0.MTH5066() % 30;
                int v2 = this.FLD1633 ? ᵔﹶ0.MTH5070() : ᵔﹶ0.MTH5070() + 2;
                switch(v2 % 3) {
                    case 0: {
                        ʻᵢ1.MTH4962(v1 * 3 + 1);
                        break;
                    }
                    case 1: {
                        ʻᵢ3.MTH4962(v1 / 3);
                        ʻᵢ2.MTH4962(v1 % 3);
                        break;
                    }
                    default: {
                        if(v2 % 3 == 2) {
                            ʻᵢ0.MTH4962(v1 + 1);
                        }
                    }
                }
            }
        }
        if(ʻᵢ0.MTH4963().length != 0 && ʻᵢ1.MTH4963().length != 0 && ʻᵢ2.MTH4963().length != 0 && ʻᵢ3.MTH4963().length != 0 && ʻᵢ0.MTH4963()[0] > 0 && ʻᵢ1.MTH4963()[0] + ʻᵢ2.MTH4963()[0] >= 3 && ʻᵢ1.MTH4963()[0] + ʻᵢ2.MTH4963()[0] <= 90) {
            CLS367 ˆٴ0 = new CLS367(ʻᵢ0.MTH4963()[0], ʻᵢ1.MTH4963()[0], ʻᵢ2.MTH4963()[0], ʻᵢ3.MTH4963()[0]);
            this.MTH5037(arr_ᵔﹶ, ˆٴ0);
            return ˆٴ0;
        }
        return null;
    }

    public int[] MTH5040() {
        CLS367 ˆٴ0 = this.MTH5039();
        if(ˆٴ0 == null) {
            return null;
        }
        this.MTH5043(ˆٴ0);
        int v = ˆٴ0.MTH4981();
        int[] arr_v = new int[v];
        CLS373[] arr_ᵔﹶ = ((CLS371)this).MTH5034();
        for(int v1 = 0; v1 < arr_ᵔﹶ.length; ++v1) {
            CLS373 ᵔﹶ0 = arr_ᵔﹶ[v1];
            if(ᵔﹶ0 != null) {
                int v2 = ᵔﹶ0.MTH5070();
                if(v2 < v) {
                    ++arr_v[v2];
                }
            }
        }
        return arr_v;
    }

    public final void MTH5041() {
        CLS373[] arr_ᵔﹶ = ((CLS371)this).MTH5034();
        for(int v = 0; v < arr_ᵔﹶ.length; ++v) {
            CLS373 ᵔﹶ0 = arr_ᵔﹶ[v];
            if(ᵔﹶ0 != null) {
                ᵔﹶ0.MTH5069();
            }
        }
    }

    public void MTH5042(CLS367 ˆٴ0) {
        CLS373[] arr_ᵔﹶ = ((CLS371)this).MTH5034();
        this.MTH5041();
        this.MTH5037(arr_ᵔﹶ, ˆٴ0);
        CLS370 ـᵎ0 = ((CLS371)this).MTH5031();
        int v = ((CLS371)this).MTH5030(((int)(this.FLD1633 ? ـᵎ0.MTH5020() : ـᵎ0.MTH5021()).MTH5131()));
        int v1 = ((CLS371)this).MTH5030(((int)(this.FLD1633 ? ـᵎ0.MTH5022() : ـᵎ0.MTH5026()).MTH5131()));
        int v2 = -1;
        int v3 = 0;
        int v4 = 1;
        while(v < v1) {
            CLS373 ᵔﹶ0 = arr_ᵔﹶ[v];
            if(ᵔﹶ0 != null) {
                int v5 = ᵔﹶ0.MTH5070() - v2;
                if(v5 == 0) {
                    ++v3;
                }
                else if(v5 == 1) {
                    v4 = Math.max(v4, v3);
                    v2 = ᵔﹶ0.MTH5070();
                    v3 = 1;
                }
                else if(v5 < 0 || ᵔﹶ0.MTH5070() >= ˆٴ0.MTH4981() || v5 > v) {
                    arr_ᵔﹶ[v] = null;
                }
                else {
                    if(v4 > 2) {
                        v5 *= v4 - 2;
                    }
                    boolean z = v5 >= v;
                    for(int v6 = 1; v6 <= v5 && !z; ++v6) {
                        z = arr_ᵔﹶ[v - v6] != null;
                    }
                    if(z) {
                        arr_ᵔﹶ[v] = null;
                    }
                    else {
                        v2 = ᵔﹶ0.MTH5070();
                        v3 = 1;
                    }
                }
            }
            ++v;
        }
    }

    public final void MTH5043(CLS367 ˆٴ0) {
        CLS370 ـᵎ0 = ((CLS371)this).MTH5031();
        int v = ((CLS371)this).MTH5030(((int)(this.FLD1633 ? ـᵎ0.MTH5020() : ـᵎ0.MTH5021()).MTH5131()));
        int v1 = ((CLS371)this).MTH5030(((int)(this.FLD1633 ? ـᵎ0.MTH5022() : ـᵎ0.MTH5026()).MTH5131()));
        CLS373[] arr_ᵔﹶ = ((CLS371)this).MTH5034();
        int v2 = -1;
        int v3 = 0;
        int v4 = 1;
        while(v < v1) {
            CLS373 ᵔﹶ0 = arr_ᵔﹶ[v];
            if(ᵔﹶ0 != null) {
                ᵔﹶ0.MTH5069();
                int v5 = ᵔﹶ0.MTH5070() - v2;
                if(v5 == 0) {
                    ++v3;
                }
                else {
                    if(v5 == 1) {
                        v4 = Math.max(v4, v3);
                    }
                    else if(ᵔﹶ0.MTH5070() >= ˆٴ0.MTH4981()) {
                        arr_ᵔﹶ[v] = null;
                        goto label_23;
                    }
                    v2 = ᵔﹶ0.MTH5070();
                    v3 = 1;
                }
            }
        label_23:
            ++v;
        }
    }
}


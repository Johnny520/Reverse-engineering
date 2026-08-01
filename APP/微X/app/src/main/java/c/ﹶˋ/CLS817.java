// Decompiled by JEB v5.42.0.202606242140

package c.ﹶˋ;

public final class CLS817 extends CLS357 {
    public final boolean FLD1611;

    public CLS817(CLS348 ʾʻ0, boolean z) {
        super(ʾʻ0);
        this.FLD1611 = z;
    }

    @Override  // c.ﹶˋ.CLS357
    public String toString() {
        return "IsLeft: " + this.FLD1611 + '\n' + ((CLS357)this).super.toString();
    }

    public CLS356 MTH4898() {
        CLS353[] arr_ˉˎ = ((CLS357)this).MTH4939();
        CLS358 ﾞⁱ0 = new CLS358();
        CLS358 ﾞⁱ1 = new CLS358();
        CLS358 ﾞⁱ2 = new CLS358();
        CLS358 ﾞⁱ3 = new CLS358();
        for(int v = 0; v < arr_ˉˎ.length; ++v) {
            CLS353 ˉˎ0 = arr_ˉˎ[v];
            if(ˉˎ0 != null) {
                ˉˎ0.MTH4873();
                int v1 = ˉˎ0.MTH4869() % 30;
                int v2 = this.FLD1611 ? ˉˎ0.MTH4867() : ˉˎ0.MTH4867() + 2;
                switch(v2 % 3) {
                    case 0: {
                        ﾞⁱ1.MTH4945(v1 * 3 + 1);
                        break;
                    }
                    case 1: {
                        ﾞⁱ3.MTH4945(v1 / 3);
                        ﾞⁱ2.MTH4945(v1 % 3);
                        break;
                    }
                    default: {
                        if(v2 % 3 == 2) {
                            ﾞⁱ0.MTH4945(v1 + 1);
                        }
                    }
                }
            }
        }
        if(ﾞⁱ0.MTH4944().length != 0 && ﾞⁱ1.MTH4944().length != 0 && ﾞⁱ2.MTH4944().length != 0 && ﾞⁱ3.MTH4944().length != 0 && ﾞⁱ0.MTH4944()[0] > 0 && ﾞⁱ1.MTH4944()[0] + ﾞⁱ2.MTH4944()[0] >= 3 && ﾞⁱ1.MTH4944()[0] + ﾞⁱ2.MTH4944()[0] <= 90) {
            CLS356 ⁱˋ0 = new CLS356(ﾞⁱ0.MTH4944()[0], ﾞⁱ1.MTH4944()[0], ﾞⁱ2.MTH4944()[0], ﾞⁱ3.MTH4944()[0]);
            this.MTH4899(arr_ˉˎ, ⁱˋ0);
            return ⁱˋ0;
        }
        return null;
    }

    public final void MTH4899(CLS353[] arr_ˉˎ, CLS356 ⁱˋ0) {
        for(int v = 0; v < arr_ˉˎ.length; ++v) {
            CLS353 ˉˎ0 = arr_ˉˎ[v];
            if(ˉˎ0 != null) {
                int v1 = ˉˎ0.MTH4869() % 30;
                int v2 = ˉˎ0.MTH4867();
                if(v2 > ⁱˋ0.MTH4930()) {
                    arr_ˉˎ[v] = null;
                }
                else {
                    if(!this.FLD1611) {
                        v2 += 2;
                    }
                    switch(v2 % 3) {
                        case 0: {
                            if(v1 * 3 + 1 != ⁱˋ0.MTH4931()) {
                                arr_ˉˎ[v] = null;
                            }
                            break;
                        }
                        case 1: {
                            if(v1 / 3 != ⁱˋ0.MTH4934() || v1 % 3 != ⁱˋ0.MTH4932()) {
                                arr_ˉˎ[v] = null;
                            }
                            break;
                        }
                        default: {
                            if(v2 % 3 == 2 && v1 + 1 != ⁱˋ0.MTH4933()) {
                                arr_ˉˎ[v] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void MTH4900() {
        CLS353[] arr_ˉˎ = ((CLS357)this).MTH4939();
        for(int v = 0; v < arr_ˉˎ.length; ++v) {
            CLS353 ˉˎ0 = arr_ˉˎ[v];
            if(ˉˎ0 != null) {
                ˉˎ0.MTH4873();
            }
        }
    }

    public boolean MTH4901() {
        return this.FLD1611;
    }

    public final void MTH4902(CLS356 ⁱˋ0) {
        CLS348 ʾʻ0 = ((CLS357)this).MTH4941();
        int v = ((CLS357)this).MTH4938(((int)(this.FLD1611 ? ʾʻ0.MTH4835() : ʾʻ0.MTH4842()).MTH3470()));
        int v1 = ((CLS357)this).MTH4938(((int)(this.FLD1611 ? ʾʻ0.MTH4834() : ʾʻ0.MTH4838()).MTH3470()));
        CLS353[] arr_ˉˎ = ((CLS357)this).MTH4939();
        int v2 = -1;
        int v3 = 0;
        int v4 = 1;
        while(v < v1) {
            CLS353 ˉˎ0 = arr_ˉˎ[v];
            if(ˉˎ0 != null) {
                ˉˎ0.MTH4873();
                int v5 = ˉˎ0.MTH4867() - v2;
                if(v5 == 0) {
                    ++v3;
                }
                else {
                    if(v5 == 1) {
                        v4 = Math.max(v4, v3);
                    }
                    else if(ˉˎ0.MTH4867() >= ⁱˋ0.MTH4930()) {
                        arr_ˉˎ[v] = null;
                        goto label_23;
                    }
                    v2 = ˉˎ0.MTH4867();
                    v3 = 1;
                }
            }
        label_23:
            ++v;
        }
    }

    public int[] MTH4903() {
        CLS356 ⁱˋ0 = this.MTH4898();
        if(ⁱˋ0 == null) {
            return null;
        }
        this.MTH4902(ⁱˋ0);
        int v = ⁱˋ0.MTH4930();
        int[] arr_v = new int[v];
        CLS353[] arr_ˉˎ = ((CLS357)this).MTH4939();
        for(int v1 = 0; v1 < arr_ˉˎ.length; ++v1) {
            CLS353 ˉˎ0 = arr_ˉˎ[v1];
            if(ˉˎ0 != null) {
                int v2 = ˉˎ0.MTH4867();
                if(v2 < v) {
                    ++arr_v[v2];
                }
            }
        }
        return arr_v;
    }

    public void MTH4904(CLS356 ⁱˋ0) {
        CLS353[] arr_ˉˎ = ((CLS357)this).MTH4939();
        this.MTH4900();
        this.MTH4899(arr_ˉˎ, ⁱˋ0);
        CLS348 ʾʻ0 = ((CLS357)this).MTH4941();
        int v = ((CLS357)this).MTH4938(((int)(this.FLD1611 ? ʾʻ0.MTH4835() : ʾʻ0.MTH4842()).MTH3470()));
        int v1 = ((CLS357)this).MTH4938(((int)(this.FLD1611 ? ʾʻ0.MTH4834() : ʾʻ0.MTH4838()).MTH3470()));
        int v2 = -1;
        int v3 = 0;
        int v4 = 1;
        while(v < v1) {
            CLS353 ˉˎ0 = arr_ˉˎ[v];
            if(ˉˎ0 != null) {
                int v5 = ˉˎ0.MTH4867() - v2;
                if(v5 == 0) {
                    ++v3;
                }
                else if(v5 == 1) {
                    v4 = Math.max(v4, v3);
                    v2 = ˉˎ0.MTH4867();
                    v3 = 1;
                }
                else if(v5 < 0 || ˉˎ0.MTH4867() >= ⁱˋ0.MTH4930() || v5 > v) {
                    arr_ˉˎ[v] = null;
                }
                else {
                    if(v4 > 2) {
                        v5 *= v4 - 2;
                    }
                    boolean z = v5 >= v;
                    for(int v6 = 1; v6 <= v5 && !z; ++v6) {
                        z = arr_ˉˎ[v - v6] != null;
                    }
                    if(z) {
                        arr_ˉˎ[v] = null;
                    }
                    else {
                        v2 = ˉˎ0.MTH4867();
                        v3 = 1;
                    }
                }
            }
            ++v;
        }
    }
}


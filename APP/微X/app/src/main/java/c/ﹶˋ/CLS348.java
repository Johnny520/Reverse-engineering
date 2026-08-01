// Decompiled by JEB v5.42.0.202606242140

package c.ﹶˋ;

import c.ᐧᵎ.CLS268;
import c.ﾞʾ.CLS366;
import com.google.zxing.NotFoundException;

public final class CLS348 {
    public CLS268 FLD1580;
    public int FLD1581;
    public CLS268 FLD1582;
    public CLS268 FLD1583;
    public int FLD1584;
    public int FLD1585;
    public CLS366 FLD1586;
    public int FLD1587;
    public CLS268 FLD1588;

    public CLS348(CLS348 ʾʻ0) {
        this.MTH4839(ʾʻ0.FLD1586, ʾʻ0.FLD1588, ʾʻ0.FLD1580, ʾʻ0.FLD1583, ʾʻ0.FLD1582);
    }

    public CLS348(CLS366 ﾞⁱ0, CLS268 ᵔʼ0, CLS268 ᵔʼ1, CLS268 ᵔʼ2, CLS268 ᵔʼ3) {
        if(ᵔʼ0 == null && ᵔʼ2 == null || ᵔʼ1 == null && ᵔʼ3 == null || ᵔʼ0 != null && ᵔʼ1 == null || ᵔʼ2 != null && ᵔʼ3 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        this.MTH4839(ﾞⁱ0, ᵔʼ0, ᵔʼ1, ᵔʼ2, ᵔʼ3);
    }

    public CLS268 MTH4834() {
        return this.FLD1580;
    }

    public CLS268 MTH4835() {
        return this.FLD1588;
    }

    public static CLS348 MTH4836(CLS348 ʾʻ0, CLS348 ʾʻ1) {
        if(ʾʻ0 == null) {
            return ʾʻ1;
        }
        return ʾʻ1 == null ? ʾʻ0 : new CLS348(ʾʻ0.FLD1586, ʾʻ0.FLD1588, ʾʻ0.FLD1580, ʾʻ1.FLD1583, ʾʻ1.FLD1582);
    }

    public int MTH4837() {
        return this.FLD1587;
    }

    public CLS268 MTH4838() {
        return this.FLD1582;
    }

    public final void MTH4839(CLS366 ﾞⁱ0, CLS268 ᵔʼ0, CLS268 ᵔʼ1, CLS268 ᵔʼ2, CLS268 ᵔʼ3) {
        this.FLD1586 = ﾞⁱ0;
        this.FLD1588 = ᵔʼ0;
        this.FLD1580 = ᵔʼ1;
        this.FLD1583 = ᵔʼ2;
        this.FLD1582 = ᵔʼ3;
        this.MTH4845();
    }

    public int MTH4840() {
        return this.FLD1581;
    }

    public int MTH4841() {
        return this.FLD1585;
    }

    public CLS268 MTH4842() {
        return this.FLD1583;
    }

    public CLS348 MTH4843(int v, int v1, boolean z) {
        CLS268 ᵔʼ10;
        CLS268 ᵔʼ7;
        CLS268 ᵔʼ0 = this.FLD1588;
        CLS268 ᵔʼ1 = ᵔʼ0;
        CLS268 ᵔʼ2 = this.FLD1580;
        CLS268 ᵔʼ3 = this.FLD1583;
        CLS268 ᵔʼ4 = this.FLD1582;
        if(v > 0) {
            CLS268 ᵔʼ5 = z ? ᵔʼ0 : ᵔʼ3;
            int v2 = ((int)ᵔʼ5.MTH3470()) - v;
            if(v2 < 0) {
                v2 = 0;
            }
            CLS268 ᵔʼ6 = new CLS268(ᵔʼ5.MTH3468(), ((float)v2));
            if(z) {
                ᵔʼ1 = ᵔʼ6;
                ᵔʼ7 = ᵔʼ3;
            }
            else {
                ᵔʼ7 = ᵔʼ6;
            }
        }
        else {
            ᵔʼ7 = ᵔʼ3;
        }
        if(v1 > 0) {
            CLS268 ᵔʼ8 = z ? this.FLD1580 : this.FLD1582;
            int v3 = ((int)ᵔʼ8.MTH3470()) + v1;
            if(v3 >= this.FLD1586.MTH5046()) {
                v3 = this.FLD1586.MTH5046() - 1;
            }
            CLS268 ᵔʼ9 = new CLS268(ᵔʼ8.MTH3468(), ((float)v3));
            if(z) {
                ᵔʼ2 = ᵔʼ9;
                ᵔʼ10 = ᵔʼ4;
            }
            else {
                ᵔʼ10 = ᵔʼ9;
            }
        }
        else {
            ᵔʼ10 = ᵔʼ4;
        }
        this.MTH4845();
        return new CLS348(this.FLD1586, ᵔʼ1, ᵔʼ2, ᵔʼ7, ᵔʼ10);
    }

    public int MTH4844() {
        return this.FLD1584;
    }

    public final void MTH4845() {
        if(this.FLD1588 == null) {
            this.FLD1588 = new CLS268(0.0f, this.FLD1583.MTH3470());
            this.FLD1580 = new CLS268(0.0f, this.FLD1582.MTH3470());
        }
        else if(this.FLD1583 == null) {
            this.FLD1583 = new CLS268(((float)(this.FLD1586.MTH5044() - 1)), this.FLD1588.MTH3470());
            this.FLD1582 = new CLS268(((float)(this.FLD1586.MTH5044() - 1)), this.FLD1580.MTH3470());
        }
        this.FLD1584 = (int)Math.min(this.FLD1588.MTH3468(), this.FLD1580.MTH3468());
        this.FLD1587 = (int)Math.max(this.FLD1583.MTH3468(), this.FLD1582.MTH3468());
        this.FLD1585 = (int)Math.min(this.FLD1588.MTH3470(), this.FLD1583.MTH3470());
        this.FLD1581 = (int)Math.max(this.FLD1580.MTH3470(), this.FLD1582.MTH3470());
    }
}


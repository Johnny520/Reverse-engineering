// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʾ;

import c.ˎˊ.CLS117;
import c.ﾞﹶ.CLS380;
import com.google.zxing.NotFoundException;

public final class CLS370 {
    public CLS380 FLD1622;
    public CLS380 FLD1623;
    public CLS117 FLD1624;
    public int FLD1625;
    public CLS380 FLD1626;
    public int FLD1627;
    public int FLD1628;
    public int FLD1629;
    public CLS380 FLD1630;

    public CLS370(CLS117 ʻᵢ0, CLS380 ٴⁱ0, CLS380 ٴⁱ1, CLS380 ٴⁱ2, CLS380 ٴⁱ3) {
        if(ٴⁱ0 == null && ٴⁱ2 == null || ٴⁱ1 == null && ٴⁱ3 == null || ٴⁱ0 != null && ٴⁱ1 == null || ٴⁱ2 != null && ٴⁱ3 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        this.MTH5019(ʻᵢ0, ٴⁱ0, ٴⁱ1, ٴⁱ2, ٴⁱ3);
    }

    public CLS370(CLS370 ـᵎ0) {
        this.MTH5019(ـᵎ0.FLD1624, ـᵎ0.FLD1622, ـᵎ0.FLD1626, ـᵎ0.FLD1630, ـᵎ0.FLD1623);
    }

    public final void MTH5015() {
        if(this.FLD1622 == null) {
            this.FLD1622 = new CLS380(0.0f, this.FLD1630.MTH5131());
            this.FLD1626 = new CLS380(0.0f, this.FLD1623.MTH5131());
        }
        else if(this.FLD1630 == null) {
            this.FLD1630 = new CLS380(((float)(this.FLD1624.MTH2325() - 1)), this.FLD1622.MTH5131());
            this.FLD1623 = new CLS380(((float)(this.FLD1624.MTH2325() - 1)), this.FLD1626.MTH5131());
        }
        this.FLD1629 = (int)Math.min(this.FLD1622.MTH5130(), this.FLD1626.MTH5130());
        this.FLD1627 = (int)Math.max(this.FLD1630.MTH5130(), this.FLD1623.MTH5130());
        this.FLD1628 = (int)Math.min(this.FLD1622.MTH5131(), this.FLD1630.MTH5131());
        this.FLD1625 = (int)Math.max(this.FLD1626.MTH5131(), this.FLD1623.MTH5131());
    }

    public static CLS370 MTH5016(CLS370 ـᵎ0, CLS370 ـᵎ1) {
        if(ـᵎ0 == null) {
            return ـᵎ1;
        }
        return ـᵎ1 == null ? ـᵎ0 : new CLS370(ـᵎ0.FLD1624, ـᵎ0.FLD1622, ـᵎ0.FLD1626, ـᵎ1.FLD1630, ـᵎ1.FLD1623);
    }

    public int MTH5017() {
        return this.FLD1627;
    }

    public CLS370 MTH5018(int v, int v1, boolean z) {
        CLS380 ٴⁱ10;
        CLS380 ٴⁱ7;
        CLS380 ٴⁱ0 = this.FLD1622;
        CLS380 ٴⁱ1 = ٴⁱ0;
        CLS380 ٴⁱ2 = this.FLD1626;
        CLS380 ٴⁱ3 = this.FLD1630;
        CLS380 ٴⁱ4 = this.FLD1623;
        if(v > 0) {
            CLS380 ٴⁱ5 = z ? ٴⁱ0 : ٴⁱ3;
            int v2 = ((int)ٴⁱ5.MTH5131()) - v;
            if(v2 < 0) {
                v2 = 0;
            }
            CLS380 ٴⁱ6 = new CLS380(ٴⁱ5.MTH5130(), ((float)v2));
            if(z) {
                ٴⁱ1 = ٴⁱ6;
                ٴⁱ7 = ٴⁱ3;
            }
            else {
                ٴⁱ7 = ٴⁱ6;
            }
        }
        else {
            ٴⁱ7 = ٴⁱ3;
        }
        if(v1 > 0) {
            CLS380 ٴⁱ8 = z ? this.FLD1626 : this.FLD1623;
            int v3 = ((int)ٴⁱ8.MTH5131()) + v1;
            if(v3 >= this.FLD1624.MTH2328()) {
                v3 = this.FLD1624.MTH2328() - 1;
            }
            CLS380 ٴⁱ9 = new CLS380(ٴⁱ8.MTH5130(), ((float)v3));
            if(z) {
                ٴⁱ2 = ٴⁱ9;
                ٴⁱ10 = ٴⁱ4;
            }
            else {
                ٴⁱ10 = ٴⁱ9;
            }
        }
        else {
            ٴⁱ10 = ٴⁱ4;
        }
        this.MTH5015();
        return new CLS370(this.FLD1624, ٴⁱ1, ٴⁱ2, ٴⁱ7, ٴⁱ10);
    }

    public final void MTH5019(CLS117 ʻᵢ0, CLS380 ٴⁱ0, CLS380 ٴⁱ1, CLS380 ٴⁱ2, CLS380 ٴⁱ3) {
        this.FLD1624 = ʻᵢ0;
        this.FLD1622 = ٴⁱ0;
        this.FLD1626 = ٴⁱ1;
        this.FLD1630 = ٴⁱ2;
        this.FLD1623 = ٴⁱ3;
        this.MTH5015();
    }

    public CLS380 MTH5020() {
        return this.FLD1622;
    }

    public CLS380 MTH5021() {
        return this.FLD1630;
    }

    public CLS380 MTH5022() {
        return this.FLD1626;
    }

    public int MTH5023() {
        return this.FLD1629;
    }

    public int MTH5024() {
        return this.FLD1628;
    }

    public int MTH5025() {
        return this.FLD1625;
    }

    public CLS380 MTH5026() {
        return this.FLD1623;
    }
}


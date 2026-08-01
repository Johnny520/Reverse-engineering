// Decompiled by JEB v5.42.0.202606242140

package c.ʽˉ;

import com.google.zxing.FormatException;

public final class CLS411 extends CLS40 {
    public final int FLD154;
    public final int FLD155;

    public CLS411(int v, int v1, int v2) {
        super(v);
        if(v1 < 0 || v1 > 10 || v2 < 0 || v2 > 10) {
            throw FormatException.getFormatInstance();
        }
        this.FLD154 = v1;
        this.FLD155 = v2;
    }

    public int MTH934() {
        return this.FLD154;
    }

    public boolean MTH935() {
        return this.FLD155 == 10;
    }

    public int MTH936() {
        return this.FLD155;
    }

    public boolean MTH937() {
        return this.FLD154 == 10;
    }
}


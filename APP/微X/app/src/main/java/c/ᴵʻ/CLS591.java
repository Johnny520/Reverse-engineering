// Decompiled by JEB v5.42.0.202606242140

package c.ᴵʻ;

import com.google.zxing.FormatException;

public final class CLS591 extends CLS277 {
    public final int FLD1097;
    public final int FLD1098;

    public CLS591(int v, int v1, int v2) {
        super(v);
        if(v1 < 0 || v1 > 10 || v2 < 0 || v2 > 10) {
            throw FormatException.getFormatInstance();
        }
        this.FLD1098 = v1;
        this.FLD1097 = v2;
    }

    public int MTH3580() {
        return this.FLD1097;
    }

    public boolean MTH3581() {
        return this.FLD1097 == 10;
    }

    public boolean MTH3582() {
        return this.FLD1098 == 10;
    }

    public int MTH3583() {
        return this.FLD1098;
    }
}


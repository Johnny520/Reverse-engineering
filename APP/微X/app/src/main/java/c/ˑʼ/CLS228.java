// Decompiled by JEB v5.42.0.202606242140

package c.ˑʼ;

import c.ᐧᵎ.CLS269;
import c.ﾞʾ.CLS366;
import com.google.zxing.BarcodeFormat;
import java.util.HashMap;
import net.glxn.qrgen.core.image.ImageType;

public abstract class CLS228 {
    public int FLD919;
    public ImageType FLD920;
    public int FLD921;
    public final HashMap FLD922;
    public CLS269 FLD923;

    public CLS228() {
        this.FLD922 = new HashMap();
        this.FLD919 = 0x7D;
        this.FLD921 = 0x7D;
        this.FLD920 = ImageType.PNG;
    }

    public CLS366 MTH3125(String s) {
        return this.FLD923.MTH3473(s, BarcodeFormat.QR_CODE, this.FLD919, this.FLD921, this.FLD922);
    }
}


// Decompiled by JEB v5.42.0.202606242140

package c.ﹳˋ;

import c.ˎˊ.CLS117;
import c.ﾞﹶ.CLS377;
import com.google.zxing.BarcodeFormat;
import java.util.HashMap;
import net.glxn.qrgen.core.image.ImageType;

public abstract class CLS362 {
    public CLS377 FLD1597;
    public ImageType FLD1598;
    public final HashMap FLD1599;
    public int FLD1600;
    public int FLD1601;

    public CLS362() {
        this.FLD1599 = new HashMap();
        this.FLD1600 = 0x7D;
        this.FLD1601 = 0x7D;
        this.FLD1598 = ImageType.PNG;
    }

    public CLS117 MTH4960(String s) {
        return this.FLD1597.MTH5102(s, BarcodeFormat.QR_CODE, this.FLD1600, this.FLD1601, this.FLD1599);
    }
}


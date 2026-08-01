// Decompiled by JEB v5.42.0.202606242140

package c.ٴˑ;

import android.graphics.Bitmap;
import c.ˑʼ.CLS228;
import c.ᴵʽ.CLS593;
import com.google.zxing.WriterException;
import net.glxn.qrgen.core.exception.QRGenerationException;

public class CLS584 extends CLS228 {
    public final String FLD1029;
    public CLS260 FLD1030;

    public CLS584(String s) {
        this.FLD1030 = new CLS260();
        this.FLD1029 = s;
        this.FLD923 = new CLS593();
    }

    public static CLS584 MTH3398(String s) {
        return new CLS584(s);
    }

    public CLS584 MTH3399(int v, int v1) {
        this.FLD919 = v;
        this.FLD921 = v1;
        return this;
    }

    public Bitmap MTH3400() {
        try {
            return CLS261.MTH3407(((CLS228)this).MTH3125(this.FLD1029), this.FLD1030);
        }
        catch(WriterException writerException0) {
            throw new QRGenerationException("Failed to create QR image from text due to underlying exception", writerException0);
        }
    }
}


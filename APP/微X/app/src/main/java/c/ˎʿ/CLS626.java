// Decompiled by JEB v5.42.0.202606242140

package c.ˎʿ;

import android.graphics.Bitmap;
import c.ﹳˋ.CLS362;
import c.ﾞי.CLS818;
import com.google.zxing.WriterException;
import net.glxn.qrgen.core.exception.QRGenerationException;

public class CLS626 extends CLS362 {
    public CLS116 FLD562;
    public final String FLD563;

    public CLS626(String s) {
        this.FLD562 = new CLS116();
        this.FLD563 = s;
        this.FLD1597 = new CLS818();
    }

    public Bitmap MTH2307() {
        try {
            return CLS115.MTH2300(((CLS362)this).MTH4960(this.FLD563), this.FLD562);
        }
        catch(WriterException writerException0) {
            throw new QRGenerationException("Failed to create QR image from text due to underlying exception", writerException0);
        }
    }

    public static CLS626 MTH2308(String s) {
        return new CLS626(s);
    }

    public CLS626 MTH2309(int v, int v1) {
        this.FLD1600 = v;
        this.FLD1601 = v1;
        return this;
    }
}


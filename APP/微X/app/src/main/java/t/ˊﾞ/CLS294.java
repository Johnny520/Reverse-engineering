// Decompiled by JEB v5.42.0.202606242140

package t.ˊﾞ;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import java.io.File;
import t.ˆʿ.CLS28;
import t.ˆʿ.CLS43;
import t.ᵔʾ.CLS125;
import t.ᵔʾ.CLS132;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS146;
import t.ⁱʾ.CLS147;
import t.ﾞٴ.CLS309;

public final class CLS294 implements CLS146 {
    public final int FLD823;
    public final Object FLD824;

    public CLS294(Object object0, int v) {
        this.FLD823 = v;
        this.FLD824 = object0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS146
    public final void MTH2177(Object object0) {
        Object object1 = this.FLD824;
        switch(this.FLD823) {
            case 0: {
                ((CLS102)object1).getClass();
                File file0 = new File(((File)object0), CLS125.MTH2025(((CLS102)object1).FLD773, "zip"));
                if(CLS132.MTH2094(file0, new String[]{((CLS102)object1).FLD773})) {
                    CLS28.MTH1315(CLS133.MTH2108(), CLS133.MTH2099("export_") + ": " + file0.getAbsolutePath());
                }
                return;
            }
            case 1: {
                CLS43.MTH1437(((ViewGroup)object1), new BitmapDrawable(CLS133.MTH2108().getResources(), ((Bitmap)object0)));
                return;
            }
            default: {
                ((CLS309)object1).getClass();
                ((CLS309)object1).MTH2238(((CLS147)object0));
            }
        }
    }
}


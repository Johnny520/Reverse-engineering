// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import android.webkit.JavascriptInterface;
import b.ʻˑ.CLS12;

public final class CLS96 {
    public CLS12 FLD408;
    public CLS12 FLD409;
    public CLS12 FLD410;

    @JavascriptInterface
    public void onDeselected(String s) {
        CLS12 ᵔʾ0 = this.FLD409;
        if(ᵔʾ0 != null) {
            ᵔʾ0.MTH791(s);
        }
    }

    @JavascriptInterface
    public void onSelected(String s) {
        CLS12 ᵔʾ0 = this.FLD410;
        if(ᵔʾ0 != null) {
            ᵔʾ0.MTH791(s);
        }
    }

    @JavascriptInterface
    public void onclick(String s) {
        CLS12 ᵔʾ0 = this.FLD408;
        if(ᵔʾ0 != null) {
            ᵔʾ0.MTH791(s);
        }
    }

    @JavascriptInterface
    public void onlog(String s) {
    }
}


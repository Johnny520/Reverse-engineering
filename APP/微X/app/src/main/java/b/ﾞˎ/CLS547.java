// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;
import b.ⁱᵔ.CLS502;

public final class CLS547 implements TextView.OnEditorActionListener {
    public final CLS556 FLD5350;
    public final Activity FLD5351;

    public CLS547(CLS556 ﾞٴ0, Activity activity0) {
        this.FLD5350 = ﾞٴ0;
        this.FLD5351 = activity0;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.TextView$OnEditorActionListener
    public final boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
        CLS556 ﾞٴ0 = this.FLD5350;
        ﾞٴ0.getClass();
        if(v == 3 || v == 6 || keyEvent0.getAction() == 0 && keyEvent0.getKeyCode() == 66) {
            ﾞٴ0.MTH7431(CLS502.MTH6936(textView0.getText()));
            ((InputMethodManager)this.FLD5351.getSystemService("input_method")).hideSoftInputFromWindow(ﾞٴ0.FLD5422.FLD5246.getWindowToken(), 0);
            return true;
        }
        return false;
    }
}


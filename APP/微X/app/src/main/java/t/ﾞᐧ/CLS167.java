// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;

public final class CLS167 implements TextView.OnEditorActionListener {
    public final CLS172 FLD1163;
    public final Activity FLD1164;

    public CLS167(CLS172 ـˏ0, Activity activity0) {
        this.FLD1163 = ـˏ0;
        this.FLD1164 = activity0;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.TextView$OnEditorActionListener
    public final boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
        CLS172 ـˏ0 = this.FLD1163;
        ـˏ0.getClass();
        if(v == 3 || v == 6 || keyEvent0.getAction() == 0 && keyEvent0.getKeyCode() == 66) {
            ـˏ0.MTH2421(textView0.getText().toString());
            ((InputMethodManager)this.FLD1164.getSystemService("input_method")).hideSoftInputFromWindow(ـˏ0.FLD1223.FLD1196.getWindowToken(), 0);
            return true;
        }
        return false;
    }
}


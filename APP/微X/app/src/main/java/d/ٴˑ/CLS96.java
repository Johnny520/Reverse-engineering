// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;

public final class CLS96 implements TextView.OnEditorActionListener {
    public final Activity FLD547;
    public final CLS87 FLD548;

    public CLS96(CLS87 ˏᐧ0, Activity activity0) {
        this.FLD548 = ˏᐧ0;
        this.FLD547 = activity0;
    }

    @Override  // android.widget.TextView$OnEditorActionListener
    public final boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
        CLS87 ˏᐧ0 = this.FLD548;
        ˏᐧ0.getClass();
        if(v == 3 || v == 6 || keyEvent0.getAction() == 0 && keyEvent0.getKeyCode() == 66) {
            ˏᐧ0.MTH934(textView0.getText().toString());
            ((InputMethodManager)this.FLD547.getSystemService("input_method")).hideSoftInputFromWindow(ˏᐧ0.FLD446.FLD560.getWindowToken(), 0);
            return true;
        }
        return false;
    }
}


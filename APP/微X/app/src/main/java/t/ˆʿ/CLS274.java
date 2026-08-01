// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.text.TextUtils;
import android.widget.LinearLayout;
import t.ⁱʾ.CLS144;
import t.ⁱʾ.CLS145;
import t.ﾞᐧ.CLS339;

public final class CLS274 implements CLS144 {
    public final CLS339 FLD436;
    public final int FLD437;
    public final String FLD438;
    public final String FLD439;

    public CLS274(CLS339 יﹳ0, String s, int v, String s1) {
        this.FLD436 = יﹳ0;
        this.FLD438 = s;
        this.FLD437 = v;
        this.FLD439 = s1;
    }

    @Override  // t.ⁱʾ.CLS144
    public final void MTH2170(Object[] arr_object) {
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS339 יﹳ0 = this.FLD436;
        יﹳ0.MTH2172(this.FLD438);
        יﹳ0.MTH2410(this.FLD437);
        String s = this.FLD439;
        if(!TextUtils.isEmpty(s)) {
            יﹳ0.MTH2409(s);
        }
        CLS43.MTH1423(linearLayout0, ((CLS145)יﹳ0), true);
    }
}


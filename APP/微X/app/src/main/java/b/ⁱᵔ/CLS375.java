// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ᐧˉ.CLS1039;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1626;

public final class CLS375 implements View.OnClickListener {
    public final int FLD3503;
    public final CLS1626 FLD3504;
    public final Activity FLD3505;

    public CLS375(Activity activity0, CLS1626 ـﹳ0, int v) {
        this.FLD3503 = v;
        this.FLD3505 = activity0;
        this.FLD3504 = ـﹳ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.FLD3505;
        CLS1626 ـﹳ0 = this.FLD3504;
        if(this.FLD3503 == 0) {
            CLS1481 יˆ0 = new CLS1481(7, ـﹳ0);
            CLS1622 ˑٴ0 = new CLS1622(activity0);
            CLS523.MTH7160(activity0, CLS27.MTH889("sns_fake_comments"), ((CLS17)new CLS1039(ˑٴ0, 1)), ((CLS11)new CLS1422(ˑٴ0, יˆ0)));
            return;
        }
        CLS443.MTH6316(activity0, ((CLS8)new CLS1433(ـﹳ0)));
    }
}


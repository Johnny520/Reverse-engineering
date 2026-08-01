// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import d.יʻ.CLS69;

public final class CLS27 implements View.OnClickListener {
    public final Activity FLD110;
    public final int FLD111;
    public final StringBuilder FLD112;

    public CLS27(Activity activity0, StringBuilder stringBuilder0, int v) {
        this.FLD111 = v;
        this.FLD110 = activity0;
        this.FLD112 = stringBuilder0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        StringBuilder stringBuilder0 = this.FLD112;
        Activity activity0 = this.FLD110;
        if(this.FLD111 == 0) {
            CLS13.MTH426(activity0, CLS69.MTH795("copy_to_clipboard"));
            CLS13.MTH428(activity0, stringBuilder0.toString());
            return;
        }
        CLS13.MTH428(activity0, stringBuilder0.toString());
        CLS13.MTH426(activity0, CLS69.MTH795("copy_to_clipboard"));
    }
}


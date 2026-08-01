// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.net.Uri;
import d.ˎˏ.CLS1;
import d.ⁱٴ.CLS123;

public final class CLS135 implements CLS123 {
    public final Activity FLD107;
    public final int FLD108;
    public final String FLD109;

    public CLS135(Activity activity0, String s, int v) {
        this.FLD108 = v;
        this.FLD107 = activity0;
        this.FLD109 = s;
        super();
    }

    @Override  // d.ⁱٴ.CLS123
    public final void MTH1174() {
        String s = this.FLD109;
        Activity activity0 = this.FLD107;
        switch(this.FLD108) {
            case 0: {
                CLS1.MTH363(activity0, s);
                return;
            }
            case 1: {
                CLS1.MTH362(activity0, Uri.parse(s));
                return;
            }
            case 2: {
                CLS1.MTH363(activity0, s);
                return;
            }
            default: {
                CLS1.MTH362(activity0, Uri.parse(s));
            }
        }
    }
}


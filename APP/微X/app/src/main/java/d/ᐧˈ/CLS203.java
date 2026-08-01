// Decompiled by JEB v5.42.0.202606242140

package d.ᐧˈ;

import android.app.Activity;
import d.ˎˏ.CLS1;
import d.ⁱٴ.CLS120;
import java.util.HashMap;

public final class CLS203 implements CLS120 {
    public final HashMap FLD617;
    public final int FLD618;
    public final Activity FLD619;

    public CLS203(HashMap hashMap0, Activity activity0, int v) {
        this.FLD618 = v;
        this.FLD617 = hashMap0;
        this.FLD619 = activity0;
        super();
    }

    @Override  // d.ⁱٴ.CLS120
    public final void MTH1170(Object object0) {
        Activity activity0 = this.FLD619;
        HashMap hashMap0 = this.FLD617;
        switch(this.FLD618) {
            case 0: {
                CLS1.MTH363(activity0, ((String)hashMap0.get(((String)object0))));
                return;
            }
            case 1: {
                CLS1.MTH363(activity0, ((String)hashMap0.get(((String)object0))));
                return;
            }
            default: {
                CLS1.MTH363(activity0, ((String)hashMap0.get(((String)object0))));
            }
        }
    }
}


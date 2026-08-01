// Decompiled by JEB v5.42.0.202606242140

package p.pkg2;

import android.app.Activity;
import java.lang.ref.WeakReference;
import p.pkg8.CLS44;
import p.pkg8.CLS53;

public abstract class CLS5 {
    public final CLS6 FLD22;

    public CLS5(CLS6 ﹳˑ0) {
        this.FLD22 = ﹳˑ0;
        CLS44.MTH891();
        try {
            this.MTH431(CLS53.FLD362);
        }
        catch(Throwable throwable0) {
            CLS44.MTH897(throwable0);
        }
    }

    public final Activity MTH430() {
        Activity activity0;
        CLS6 ﹳˑ0 = this.FLD22;
        WeakReference weakReference0 = ﹳˑ0.FLD26;
        if(weakReference0 != null) {
            activity0 = (Activity)weakReference0.get();
            if(activity0 != null && !activity0.isFinishing()) {
                return activity0;
            }
        }
        activity0 = ﹳˑ0.MTH433();
        return activity0 != null && !activity0.isFinishing() ? activity0 : ﹳˑ0.MTH433();
    }

    public abstract void MTH431(CLS53 arg1);
}


// Decompiled by JEB v5.42.0.202606242140

package p.pkg11;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Message;
import java.lang.ref.WeakReference;
import p.pkg5.CLS24;
import p.pkg8.CLS44;

public final class CLS68 {
    public final String FLD420;
    public final WeakReference FLD421;
    public final Handler.Callback FLD422;

    public CLS68(String s, Handler.Callback handler$Callback0, Activity activity0) {
        this.FLD420 = s;
        this.FLD422 = handler$Callback0;
        this.FLD421 = new WeakReference(activity0);
    }

    public final void MTH1125(CLS74 ﾞˈ0) {
        if(ﾞˈ0 != null) {
            String s = this.FLD420;
            if(!CLS24.MTH814(s)) {
                CLS24.FLD280.put(s, ﾞˈ0);
            }
        }
        Message message0 = new Message();
        Bundle bundle0 = new Bundle();
        if(ﾞˈ0 == null) {
            bundle0.putBoolean("err", true);
        }
        else {
            bundle0.putString("vidUrl", ﾞˈ0.FLD444);
            bundle0.putString("imgUrl", ﾞˈ0.FLD445);
            bundle0.putInt("sourceType", 1);
        }
        message0.setData(bundle0);
        try {
            this.FLD422.handleMessage(message0);
        }
        catch(Throwable throwable0) {
            CLS44.MTH897(throwable0);
        }
    }
}


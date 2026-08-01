// Decompiled by JEB v5.42.0.202606242140

package p.pkg11;

import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Message;
import p.pkg10.CLS65;
import p.pkg8.CLS43.CLS42;
import p.pkg8.CLS44;
import p.pkg9.CLS192;
import p.pkg9.CLS207;

public final class CLS197 implements CLS42, CLS70 {
    public final int FLD442;
    public final Object FLD443;

    public CLS197(int v, Object object0) {
        this.FLD442 = v;
        this.FLD443 = object0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // p.pkg8.CLS43$CLS42
    public final void run() {
        Object object0 = this.FLD443;
        if(this.FLD442 == 0) {
            ((CLS72)object0).getClass();
            ((CLS72)object0).loadUrl("javascript:window.java_obj.getSource(\'<head>\'+document.getElementsByTagName(\'html\')[0].innerHTML+\'</head>\');");
            return;
        }
        ((CLS72)object0).destroy();
    }

    // 此方法包含解密的字符串
    @Override  // p.pkg11.CLS72$CLS70
    public final boolean MTH1130(String s) {
        Handler.Callback handler$Callback0 = (Handler.Callback)this.FLD443;
        try {
            CLS207 ﾞˈ0 = CLS65.MTH1117(s);
            if(handler$Callback0 != null) {
                Message message0 = new Message();
                Bundle bundle0 = new Bundle();
                bundle0.putString("html", ((CLS192)ﾞˈ0).MTH1051());
                message0.setData(bundle0);
                handler$Callback0.handleMessage(message0);
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS44.MTH897(throwable0);
        }
        return true;
    }
}


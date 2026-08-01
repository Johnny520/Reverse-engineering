// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS127.CLS126;
import t.ᵔʾ.CLS139.CLS138;

public final class CLS150 {
    public final HashMap FLD991;
    public boolean FLD992;
    public WeakReference FLD993;
    public String FLD994;
    public WeakReference FLD995;

    public CLS150() {
        this.FLD992 = false;
        this.FLD991 = new HashMap();
    }

    // 此方法包含解密的字符串
    public final Activity MTH2203() {
        WeakReference weakReference0 = this.FLD993;
        if(weakReference0 != null) {
            Activity activity0 = (Activity)weakReference0.get();
            if(activity0 != null && !activity0.isFinishing()) {
                return activity0;
            }
        }
        Activity activity1 = (Activity)CLS123.FLD912.MTH2003("getCurrentActivity", new Object[0]);
        return activity1 == null || activity1.isFinishing() ? this.MTH2205() : activity1;
    }

    // 此方法包含解密的字符串
    public final void MTH2204() {
        if(!this.FLD992) {
            this.FLD992 = true;
            CLS310 ʾᵢ0 = new CLS310(this, 0);
            CLS123.FLD912.MTH2002("set_current_talker", ((CLS138)ʾᵢ0));
            CLS310 ʾᵢ1 = new CLS310(this, 1);
            CLS123.FLD912.MTH2002("set_current_activity", ((CLS138)ʾᵢ1));
            CLS310 ʾᵢ2 = new CLS310(this, 2);
            CLS123.FLD912.MTH2002("set_launcherui", ((CLS138)ʾᵢ2));
            CLS310 ʾᵢ3 = new CLS310(this, 3);
            CLS123.FLD912.MTH2002("b.settingsui.onactivityresult,b.launcherui.onactivityresult,b.mmactivity.onactivityresult,b.chattingui.onactivityresult,b.fragmentactivity.onactivityresult", ((CLS138)ʾᵢ3));
            CLS310 ʾᵢ4 = new CLS310(this, 4);
            CLS123.FLD912.MTH2002("startActivityForResult_themes", ((CLS138)ʾᵢ4));
            CLS311 ˆʿ0 = new CLS311(this, 0);
            CLS123.FLD912.MTH2009("getCurrentActivity_themes", ((CLS126)ˆʿ0));
            CLS311 ˆʿ1 = new CLS311(this, 1);
            CLS123.FLD912.MTH2009("getLauncherUI_themes", ((CLS126)ˆʿ1));
        }
    }

    // 此方法包含解密的字符串
    public final Activity MTH2205() {
        WeakReference weakReference0 = this.FLD995;
        if(weakReference0 != null) {
            Activity activity0 = (Activity)weakReference0.get();
            return activity0 == null || activity0.isFinishing() ? ((Activity)CLS123.FLD912.MTH2003("getLauncherUI", new Object[0])) : activity0;
        }
        return (Activity)CLS123.FLD912.MTH2003("getLauncherUI", new Object[0]);
    }
}


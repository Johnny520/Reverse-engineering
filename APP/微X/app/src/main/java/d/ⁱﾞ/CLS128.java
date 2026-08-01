// Decompiled by JEB v5.42.0.202606242140

package d.ⁱﾞ;

import d.יʻ.CLS175;
import d.יʻ.CLS62;
import d.יʻ.CLS65.CLS64;
import java.util.HashMap;

public final class CLS128 {
    public boolean FLD676;
    public final HashMap FLD677;

    public CLS128() {
        this.FLD676 = false;
        this.FLD677 = new HashMap();
    }

    // 此方法包含解密的字符串
    public final void MTH1195() {
        if(!this.FLD676) {
            this.FLD676 = true;
            CLS212 יʻ0 = new CLS212(this, 0);
            CLS62.FLD317.MTH753("b.settingsui.onactivityresult,b.launcherui.onactivityresult,b.mmactivity.onactivityresult,b.chattingui.onactivityresult,b.fragmentactivity.onactivityresult", ((CLS64)יʻ0));
            CLS212 יʻ1 = new CLS212(this, 1);
            CLS62.FLD317.MTH753("startActivityForResult_donation", ((CLS64)יʻ1));
            CLS175 ⁱٴ0 = new CLS175(4);
            CLS62.FLD317.MTH753("a.dbinsert.message", ⁱٴ0);
            CLS175 ⁱٴ1 = new CLS175(5);
            CLS62.FLD317.MTH753("wx_donate", ⁱٴ1);
            CLS175 ⁱٴ2 = new CLS175(6);
            CLS62.FLD317.MTH753("on_update_check", ⁱٴ2);
            CLS175 ⁱٴ3 = new CLS175(7);
            CLS62.FLD317.MTH753("delayed_check", ⁱٴ3);
        }
    }
}


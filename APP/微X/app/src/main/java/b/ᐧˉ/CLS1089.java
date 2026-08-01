// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.widget.LinearLayout;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS29;
import b.ˑٴ.CLS848;
import b.ᵔʾ.CLS279;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS1423;
import b.ⁱᵔ.CLS433;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1629.CLS548;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS525;
import java.util.ArrayList;
import java.util.HashMap;

public final class CLS1089 implements CLS17, CLS548 {
    public final Object FLD2361;
    public final String FLD2362;
    public final Object FLD2363;
    public final Object FLD2364;
    public final Activity FLD2365;
    public final Object FLD2366;
    public final Object FLD2367;
    public final Object FLD2368;

    public CLS1089(CLS1105 ᐧˈ0, String s, Activity activity0, CLS1625 ـˏ0, CLS1625 ـˏ1, CLS1635 ﾞᵎ0, CLS1635 ﾞᵎ1, CLS1626 ـﹳ0) {
        this.FLD2364 = ᐧˈ0;
        this.FLD2362 = s;
        this.FLD2365 = activity0;
        this.FLD2366 = ـˏ0;
        this.FLD2363 = ـˏ1;
        this.FLD2368 = ﾞᵎ0;
        this.FLD2367 = ﾞᵎ1;
        this.FLD2361 = ـﹳ0;
    }

    public CLS1089(ArrayList arrayList0, HashMap hashMap0, String s, CLS369 ﾞᵎ0, Activity activity0, String s1, AlertDialog[] arr_alertDialog, CLS3 ˆٴ0) {
        this.FLD2364 = arrayList0;
        this.FLD2366 = hashMap0;
        this.FLD2362 = s;
        this.FLD2363 = ﾞᵎ0;
        this.FLD2365 = activity0;
        this.FLD2368 = s1;
        this.FLD2367 = arr_alertDialog;
        this.FLD2361 = ˆٴ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1629$CLS548
    public final void MTH7368(String s) {
        int v;
        CLS1105 ᐧˈ0 = (CLS1105)this.FLD2364;
        CLS1625 ـˏ0 = (CLS1625)this.FLD2366;
        CLS1625 ـˏ1 = (CLS1625)this.FLD2363;
        CLS1635 ﾞᵎ0 = (CLS1635)this.FLD2368;
        CLS1635 ﾞᵎ1 = (CLS1635)this.FLD2367;
        CLS1626 ـﹳ0 = (CLS1626)this.FLD2361;
        ᐧˈ0.getClass();
        switch(s) {
            case "radio_type_notification": {
                v = 0;
                break;
            }
            case "radio_type_toast": {
                v = 1;
                break;
            }
            default: {
                v = -1;
            }
        }
        String s1 = this.FLD2362;
        CLS29 ˎᵢ0 = ᐧˈ0.FLD2151;
        switch(v) {
            case 0: {
                ˎᵢ0.MTH922(0, CLS182.MTH3475(4100576170670347061L, CLS182.MTH3483(s1)));
                String s2 = CLS182.MTH3484(4100576260864660277L, new StringBuilder(), s1);
                ᐧˈ0.FLD2414.getClass();
                if(CLS485.MTH6739(this.FLD2365, s2)) {
                    CLS523.MTH7157(false, new CLS18[]{ـˏ0, ـˏ1});
                    CLS523.MTH7157(true, new CLS18[]{ﾞᵎ0, ﾞᵎ1, ـﹳ0});
                }
                return;
            }
            case 1: {
                ˎᵢ0.MTH922(1, CLS182.MTH3475(4100576290929431349L, CLS182.MTH3483(s1)));
                CLS523.MTH7157(true, new CLS18[]{ـˏ0, ـˏ1});
                CLS523.MTH7157(false, new CLS18[]{ﾞᵎ0, ﾞᵎ1, ـﹳ0});
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        Menu menu0 = (Menu)arr_object[0];
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS848 ⁱי0 = new CLS848(((ArrayList)this.FLD2364), ((HashMap)this.FLD2366), this.FLD2362, ((CLS369)this.FLD2363));
        CLS279.FLD2908.FLD2909.put("showContactLabelContactListDialog", ⁱי0);
        CLS525 ʻˑ0 = new CLS525(this.FLD2365, linearLayout0, menu0);
        ʻˑ0.MTH7187("select", ((CLS3)new CLS848(((HashMap)this.FLD2366), ((String)this.FLD2368), this.FLD2365, this.FLD2362, 19)));
        ʻˑ0.MTH7187("send", ((CLS3)new CLS1423(((HashMap)this.FLD2366), this.FLD2365)));
        ʻˑ0.MTH7188();
        CLS1624 יﹳ0 = new CLS1624(this.FLD2365);
        יﹳ0.FLD5274 = new CLS1043(((CLS369)this.FLD2363), 16);
        יﹳ0.MTH7302();
        יﹳ0.MTH7303(((CLS369)this.FLD2363));
        יﹳ0.MTH7301(new CLS433(((HashMap)this.FLD2366), ((CLS369)this.FLD2363), ((AlertDialog[])this.FLD2367), ((CLS3)this.FLD2361), this.FLD2365));
        יﹳ0.MTH7305(new CLS250(((HashMap)this.FLD2366), ((CLS369)this.FLD2363), this.FLD2365, this.FLD2362));
        ⁱי0.MTH774();
        CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
    }
}


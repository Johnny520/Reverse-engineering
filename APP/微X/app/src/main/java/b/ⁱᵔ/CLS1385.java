// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.widget.LinearLayout;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS67;
import b.ˈˈ.CLS79;
import b.ˑٴ.CLS702;
import b.ᐧˉ.CLS258;
import b.ﾞˎ.CLS1619;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS525;

public final class CLS1385 implements CLS17, CLS378 {
    public final String FLD3921;
    public final CLS29 FLD3922;
    public final Activity FLD3923;

    public CLS1385(Activity activity0, CLS29 ˎᵢ0, String s) {
        this.FLD3923 = activity0;
        this.FLD3922 = ˎᵢ0;
        this.FLD3921 = s;
    }

    public CLS1385(String s, Activity activity0, CLS29 ˎᵢ0) {
        this.FLD3921 = s;
        this.FLD3923 = activity0;
        this.FLD3922 = ˎᵢ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        ʻˑ0.MTH7187("add", ((CLS3)new CLS702(this.FLD3923, this.FLD3922, this.FLD3921, 14)));
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        int v = CLS523.MTH7137(10);
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS79 ˎᵢ0 = CLS79.FLD292;
        String s = this.FLD3921;
        boolean z = s.equals("wx__MAIN_");
        boolean z1 = s.startsWith("wx__c_");
        Activity activity0 = this.FLD3923;
        CLS1623 יᐧ0 = new CLS1623(activity0);
        if(!z && !z1 && !ˎᵢ0.MTH1639()) {
            CLS1635 ﾞᵎ0 = new CLS1635(activity0);
            ﾞᵎ0.MTH800(CLS27.MTH889("show_in_main"));
            ﾞᵎ0.MTH7437(ˎᵢ0.MTH1658(s));
            ﾞᵎ0.MTH7438(new CLS374(ˎᵢ0, s, 0));
            יᐧ0.MTH7296(ﾞᵎ0);
        }
        CLS1635 ﾞᵎ1 = new CLS1635(activity0);
        ﾞᵎ1.MTH800(CLS27.MTH889("sticky_in_main"));
        ﾞᵎ1.MTH7437(ˎᵢ0.MTH1658(s) && CLS66.MTH1364(s));
        ﾞᵎ1.MTH7438(new CLS374(ˎᵢ0, s, 1));
        יᐧ0.MTH7296(ﾞᵎ1);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
        CLS1625 ـˏ0 = new CLS1625(activity0);
        ـˏ0.MTH800(CLS27.MTH889("customize_avatar"));
        ـˏ0.MTH7320(new CLS67(activity0, s, ˎᵢ0, 24));
        CLS1626 ـﹳ0 = new CLS1626(activity0);
        ـﹳ0.MTH800(CLS27.MTH889("rename"));
        ـﹳ0.MTH7325(ˎᵢ0.MTH1625(s));
        ـﹳ0.MTH7324(new CLS258(activity0, ˎᵢ0, s, ـﹳ0));
        CLS1623 יᐧ1 = new CLS1623(activity0);
        יᐧ1.MTH7289(new Object[]{ـˏ0, ـﹳ0});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
        CLS1635 ﾞᵎ2 = new CLS1635(activity0);
        ﾞᵎ2.MTH800(CLS27.MTH889("showUnread"));
        CLS29 ˎᵢ1 = this.FLD3922;
        ﾞᵎ2.MTH7437(ˎᵢ1.MTH938("wx_container_show_unread_" + s, true));
        ﾞᵎ2.MTH7438(new CLS494(ˎᵢ1, s, 0));
        CLS1635 ﾞᵎ3 = new CLS1635(activity0);
        ﾞᵎ3.MTH800(CLS27.MTH889("wx_container_show_preview"));
        ﾞᵎ3.MTH7437(ˎᵢ1.MTH938("show_preview_" + s, false));
        ﾞᵎ3.MTH7438(new CLS494(ˎᵢ1, s, 1));
        CLS1623 יᐧ2 = new CLS1623(activity0);
        יᐧ2.MTH7289(new Object[]{ﾞᵎ2, ﾞᵎ3});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), v);
        if(z || z1) {
            CLS1623 יᐧ3 = new CLS1623(activity0);
            CLS1635 ﾞᵎ4 = new CLS1635(activity0);
            ﾞᵎ4.MTH800(CLS27.MTH889("chatroom_container_round_avatar"));
            ﾞᵎ4.MTH7437(ˎᵢ1.MTH938("chatroom_container_round_avatar", false));
            ﾞᵎ4.MTH7438(new CLS373(ˎᵢ1, 2));
            יᐧ3.MTH7296(ﾞᵎ4);
            CLS1635 ﾞᵎ5 = new CLS1635(activity0);
            ﾞᵎ5.MTH800(CLS27.MTH889("showEmptyAcccounts"));
            ﾞᵎ5.MTH7437(ˎᵢ1.MTH938("container_show_empty", false));
            ﾞᵎ5.MTH7438(new CLS373(ˎᵢ1, 3));
            יᐧ3.MTH7296(ﾞᵎ5);
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ3), v);
            if(!ˎᵢ0.MTH1639()) {
                CLS1623 יᐧ4 = new CLS1623(activity0);
                CLS1619 ˉᐧ0 = new CLS1619(activity0);
                ˉᐧ0.MTH800(CLS27.MTH889("toolbar_color"));
                ˉᐧ0.FLD5214 = "EDEDED";
                String s1 = ˎᵢ1.MTH925("chatroom_container_toolbar_color", "EDEDED");
                ˉᐧ0.FLD5207 = s1;
                CLS1626 ـﹳ1 = ˉᐧ0.FLD5213;
                if(ـﹳ1 != null) {
                    ـﹳ1.MTH7325(s1);
                    ˉᐧ0.FLD5213.FLD5302.setTextColor(CLS522.MTH7110(s1));
                }
                ˉᐧ0.FLD5208 = new CLS1473(ˎᵢ1, 3);
                יᐧ4.MTH7296(ˉᐧ0);
                CLS1619 ˉᐧ1 = new CLS1619(activity0);
                ˉᐧ1.MTH800(CLS27.MTH889("toolbar_text_color"));
                ˉᐧ1.FLD5214 = "000000";
                String s2 = ˎᵢ1.MTH925("chatroom_container_toolbar_text_color", "000000");
                ˉᐧ1.FLD5207 = s2;
                CLS1626 ـﹳ2 = ˉᐧ1.FLD5213;
                if(ـﹳ2 != null) {
                    ـﹳ2.MTH7325(s2);
                    ˉᐧ1.FLD5213.FLD5302.setTextColor(CLS522.MTH7110(s2));
                }
                ˉᐧ1.FLD5208 = new CLS1473(ˎᵢ1, 4);
                יᐧ4.MTH7296(ˉᐧ1);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ4), v);
            }
        }
    }
}


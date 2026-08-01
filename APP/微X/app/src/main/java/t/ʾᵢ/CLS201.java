// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.HashSet;
import t.ˆʿ.CLS43;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS145;
import t.ﾞᐧ.CLS332;
import t.ﾞᐧ.CLS333.CLS161;
import t.ﾞᐧ.CLS337;
import t.ﾞᐧ.CLS338;
import t.ﾞᐧ.CLS339;
import t.ﾞᐧ.CLS344;
import t.ﾞᐧ.CLS345;

public final class CLS201 implements CLS161 {
    public final CLS216 FLD178;
    public final int FLD179;
    public final boolean FLD180;
    public final boolean FLD181;
    public final Activity FLD182;

    public CLS201(CLS216 ˎﾞ0, boolean z, boolean z1, Activity activity0, int v) {
        this.FLD178 = ˎﾞ0;
        this.FLD181 = z;
        this.FLD180 = z1;
        this.FLD182 = activity0;
        this.FLD179 = v;
    }

    // 此方法包含解密的字符串
    @Override  // t.ﾞᐧ.CLS333$CLS161
    public final void MTH2332(LinearLayout linearLayout0) {
        CLS216 ˎﾞ0 = this.FLD178;
        if(!ˎﾞ0.MTH1137()) {
            CLS337 ˎᵢ0 = new CLS337(((CLS10)ˎﾞ0).MTH1048());
            HashSet hashSet0 = ˎﾞ0.FLD136;
            boolean z = this.FLD181;
            if(z) {
                hashSet0.add(ˎᵢ0);
            }
            HashSet hashSet1 = ˎﾞ0.FLD140;
            boolean z1 = this.FLD180;
            if(z1) {
                hashSet1.add(ˎᵢ0);
            }
            ˎᵢ0.MTH2172(CLS133.MTH2099("modify_chatfooter"));
            ˎᵢ0.MTH2387(new CLS26(ˎﾞ0, 11));
            if(!TextUtils.isEmpty(CLS133.MTH2115("ChatFooter"))) {
                CLS43.MTH1423(linearLayout0, ((CLS145)ˎᵢ0), true);
            }
            Activity activity0 = this.FLD182;
            CLS344 ⁱˉ0 = new CLS344(activity0);
            CLS332 ʻᵎ0 = ((CLS10)ˎﾞ0).MTH1047(z, z1);
            ʻᵎ0.MTH2328(ˎﾞ0.FLD236.MTH1818("ChangeChatTextColor", false));
            ʻᵎ0.MTH2172(CLS133.MTH2099("ChangeChatTextColor"));
            ʻᵎ0.MTH2327(new CLS19(ˎﾞ0, 15));
            ⁱˉ0.MTH2482(((CLS145)ʻᵎ0));
            CLS345 ﹳˊ0 = new CLS345(activity0);
            ﹳˊ0.FLD1310 = CLS15.MTH1074(0xFFFFF1B02B3CF2B7L, ﹳˊ0, 0xFF000000);
            ﹳˊ0.MTH2493(ˎﾞ0.FLD236.MTH1804("ChatTextColorLeft", "#000000"));
            ﹳˊ0.FLD1303 = new CLS265(ˎﾞ0, 15);
            ⁱˉ0.MTH2482(((CLS145)ﹳˊ0));
            CLS345 ﹳˊ1 = new CLS345(activity0);
            ﹳˊ1.FLD1310 = CLS15.MTH1074(0xFFFFF1892B3CF2B7L, ﹳˊ1, 0xFF000000);
            ﹳˊ1.MTH2493(ˎﾞ0.FLD236.MTH1804("ChatTextColorRight", "#000000"));
            ﹳˊ1.FLD1303 = new CLS265(ˎﾞ0, 16);
            ⁱˉ0.MTH2482(((CLS145)ﹳˊ1));
            int v = this.FLD179;
            ⁱˉ0.MTH2475(linearLayout0, v);
            CLS344 ⁱˉ1 = new CLS344(activity0);
            CLS332 ʻᵎ1 = ((CLS10)ˎﾞ0).MTH1047(z, z1);
            ʻᵎ1.MTH2328(ˎﾞ0.FLD236.MTH1818("ChangeChatBubble", false));
            ʻᵎ1.MTH2172(CLS133.MTH2099("ChangeChatBubble"));
            ʻᵎ1.MTH2327(new CLS19(ˎﾞ0, 19));
            ⁱˉ1.MTH2482(((CLS145)ʻᵎ1));
            CLS338 יᐧ0 = ((CLS10)ˎﾞ0).MTH1044(z, z1);
            יᐧ0.MTH2172(CLS133.MTH2099("setLeftChatBubble"));
            יᐧ0.MTH2400(new CLS26(ˎﾞ0, 12));
            ⁱˉ1.MTH2482(((CLS145)יᐧ0));
            CLS338 יᐧ1 = ((CLS10)ˎﾞ0).MTH1044(z, z1);
            יᐧ1.MTH2172(CLS133.MTH2099("setRightChatBubble"));
            יᐧ1.MTH2400(new CLS26(ˎﾞ0, 13));
            ⁱˉ1.MTH2482(((CLS145)יᐧ1));
            CLS332 ʻᵎ2 = ((CLS10)ˎﾞ0).MTH1047(z, z1);
            ʻᵎ2.MTH2328(ˎﾞ0.FLD236.MTH1818("LeftChatBubbleColorEnable", false));
            ʻᵎ2.MTH2172(CLS133.MTH2099("LeftChatBubbleColorEnable"));
            ʻᵎ2.MTH2327(new CLS19(ˎﾞ0, 20));
            CLS345 ﹳˊ2 = new CLS345(activity0);
            ﹳˊ2.MTH2172(CLS133.MTH2099("setLeftChatBubbleColor"));
            ﹳˊ2.FLD1310 = "#FFFFFFFF";
            ﹳˊ2.MTH2493(ˎﾞ0.FLD236.MTH1804("LeftChatBubbleColor", "#FFFFFFFF"));
            ﹳˊ2.FLD1303 = new CLS265(ˎﾞ0, 17);
            ﹳˊ2.FLD1309 = true;
            CLS332 ʻᵎ3 = ((CLS10)ˎﾞ0).MTH1047(z, z1);
            ʻᵎ3.MTH2328(ˎﾞ0.FLD236.MTH1818("RightChatBubbleColorEnable", false));
            ʻᵎ3.MTH2172(CLS133.MTH2099("RightChatBubbleColorEnable"));
            ʻᵎ3.MTH2327(new CLS19(ˎﾞ0, 21));
            CLS345 ﹳˊ3 = new CLS345(activity0);
            ﹳˊ3.MTH2172(CLS133.MTH2099("setRightChatBubbleColor"));
            ﹳˊ3.FLD1310 = "#FFFFFFFF";
            ﹳˊ3.MTH2493(ˎﾞ0.FLD236.MTH1804("RightChatBubbleColor", "#FFFFFFFF"));
            ﹳˊ3.FLD1303 = new CLS265(ˎﾞ0, 7);
            ﹳˊ3.FLD1309 = true;
            if(Build.VERSION.SDK_INT >= 21) {
                ⁱˉ1.MTH2481(new Object[]{ʻᵎ2, ﹳˊ2, ʻᵎ3, ﹳˊ3});
            }
            ⁱˉ1.MTH2475(linearLayout0, v);
            if(CLS133.MTH2107(new String[]{"ChattingDataAdapterV2_timeTV", "ChattingDataAdapter_timeTV", "ChattingDataAdapterV3_timeTV"})) {
                CLS344 ⁱˉ2 = new CLS344(activity0);
                CLS332 ʻᵎ4 = ((CLS10)ˎﾞ0).MTH1047(z, z1);
                CLS15.MTH1073(0xFFFFF0022B3CF2B7L, ʻᵎ4);
                ʻᵎ4.MTH2328(ˎﾞ0.FLD236.MTH1818("setChatTimeTVCentered", false));
                ʻᵎ4.MTH2327(new CLS19(ˎﾞ0, 10));
                ⁱˉ2.MTH2482(((CLS145)ʻᵎ4));
                CLS332 ʻᵎ5 = ((CLS10)ˎﾞ0).MTH1047(z, z1);
                CLS15.MTH1073(0xFFFFEFD92B3CF2B7L, ʻᵎ5);
                ʻᵎ5.MTH2328(ˎﾞ0.FLD236.MTH1818("showChatTimeTVDetailed", false));
                ʻᵎ5.MTH2327(new CLS19(ˎﾞ0, 11));
                ⁱˉ2.MTH2482(((CLS145)ʻᵎ5));
                CLS339 יﹳ0 = new CLS339(((CLS10)ˎﾞ0).MTH1048());
                if(z) {
                    hashSet0.add(יﹳ0);
                }
                if(z1) {
                    hashSet1.add(יﹳ0);
                }
                יﹳ0.FLD1193 = true;
                יﹳ0.MTH2409(ˎﾞ0.FLD236.MTH1804("ChatTimeTVDetailedPattern", "yyyy-MM-dd HH:mm:ss"));
                יﹳ0.FLD1201 = new CLS265(ˎﾞ0, 8);
                ⁱˉ2.MTH2482(((CLS145)יﹳ0));
                CLS332 ʻᵎ6 = ((CLS10)ˎﾞ0).MTH1047(z, z1);
                ʻᵎ6.MTH2328(ˎﾞ0.FLD236.MTH1818("LeftChatTimeTVTextColorEnable", false));
                ʻᵎ6.MTH2172(CLS133.MTH2099("LeftChatTimeTVTextColorEnable"));
                ʻᵎ6.MTH2327(new CLS19(ˎﾞ0, 12));
                ⁱˉ2.MTH2482(((CLS145)ʻᵎ6));
                CLS345 ﹳˊ4 = new CLS345(activity0);
                ﹳˊ4.MTH2172(CLS133.MTH2099("setLeftChatTimeTVTextColor"));
                ﹳˊ4.FLD1310 = "#FFFFFFFF";
                ﹳˊ4.MTH2493(ˎﾞ0.FLD236.MTH1804("LeftChatTimeTVTextColor", "#000000"));
                ﹳˊ4.FLD1303 = new CLS265(ˎﾞ0, 9);
                ⁱˉ2.MTH2482(((CLS145)ﹳˊ4));
                CLS332 ʻᵎ7 = ((CLS10)ˎﾞ0).MTH1047(z, z1);
                ʻᵎ7.MTH2328(ˎﾞ0.FLD236.MTH1818("LeftChatTimeTVBackgroundColorEnable", false));
                ʻᵎ7.MTH2172(CLS133.MTH2099("LeftChatTimeTVBackgroundColorEnable"));
                ʻᵎ7.MTH2327(new CLS19(ˎﾞ0, 13));
                ⁱˉ2.MTH2482(((CLS145)ʻᵎ7));
                CLS345 ﹳˊ5 = new CLS345(activity0);
                ﹳˊ5.MTH2172(CLS133.MTH2099("setLeftChatTimeTVBackgroundColor"));
                ﹳˊ5.FLD1310 = "#FFFFFFFF";
                ﹳˊ5.MTH2493(ˎﾞ0.FLD236.MTH1804("LeftChatTimeTVBackgroundColor", "#FFFFFFFF"));
                ﹳˊ5.FLD1303 = new CLS265(ˎﾞ0, 10);
                ﹳˊ5.FLD1309 = true;
                ⁱˉ2.MTH2482(((CLS145)ﹳˊ5));
                CLS332 ʻᵎ8 = ((CLS10)ˎﾞ0).MTH1047(z, z1);
                ʻᵎ8.MTH2328(ˎﾞ0.FLD236.MTH1818("RightChatTimeTVTextColorEnable", false));
                ʻᵎ8.MTH2172(CLS133.MTH2099("RightChatTimeTVTextColorEnable"));
                ʻᵎ8.MTH2327(new CLS19(ˎﾞ0, 14));
                ⁱˉ2.MTH2482(((CLS145)ʻᵎ8));
                CLS345 ﹳˊ6 = new CLS345(activity0);
                ﹳˊ6.MTH2172(CLS133.MTH2099("setRightChatTimeTVTextColor"));
                ﹳˊ6.FLD1310 = "#FFFFFFFF";
                ﹳˊ6.MTH2493(ˎﾞ0.FLD236.MTH1804("RightChatTimeTVTextColor", "#000000"));
                ﹳˊ6.FLD1303 = new CLS265(ˎﾞ0, 11);
                ⁱˉ2.MTH2482(((CLS145)ﹳˊ6));
                CLS332 ʻᵎ9 = ((CLS10)ˎﾞ0).MTH1047(z, z1);
                ʻᵎ9.MTH2328(ˎﾞ0.FLD236.MTH1818("RightChatTimeTVBackgroundColorEnable", false));
                ʻᵎ9.MTH2172(CLS133.MTH2099("RightChatTimeTVBackgroundColorEnable"));
                ʻᵎ9.MTH2327(new CLS19(ˎﾞ0, 16));
                ⁱˉ2.MTH2482(((CLS145)ʻᵎ9));
                CLS345 ﹳˊ7 = new CLS345(activity0);
                ﹳˊ7.MTH2172(CLS133.MTH2099("setRightChatTimeTVBackgroundColor"));
                ﹳˊ7.FLD1310 = "#FFFFFFFF";
                ﹳˊ7.MTH2493(ˎﾞ0.FLD236.MTH1804("RightChatTimeTVBackgroundColor", "#FFFFFFFF"));
                ﹳˊ7.FLD1303 = new CLS265(ˎﾞ0, 12);
                ﹳˊ7.FLD1309 = true;
                ⁱˉ2.MTH2482(((CLS145)ﹳˊ7));
                ⁱˉ2.MTH2475(linearLayout0, 0);
            }
            if(CLS133.MTH2107(new String[]{"ChattingDataAdapterV2_userTV", "ChattingDataAdapter_userTV", "ChattingDataAdapterV3_userTV"})) {
                CLS344 ⁱˉ3 = new CLS344(activity0);
                CLS332 ʻᵎ10 = ((CLS10)ˎﾞ0).MTH1047(z, z1);
                ʻᵎ10.MTH2328(ˎﾞ0.FLD236.MTH1818("LeftChatUserTVTextColorEnable", false));
                ʻᵎ10.MTH2172(CLS133.MTH2099("LeftChatUserTVTextColorEnable"));
                ʻᵎ10.MTH2327(new CLS19(ˎﾞ0, 17));
                ⁱˉ3.MTH2482(((CLS145)ʻᵎ10));
                CLS345 ﹳˊ8 = new CLS345(activity0);
                ﹳˊ8.MTH2172(CLS133.MTH2099("setLeftChatUserTVTextColor"));
                ﹳˊ8.FLD1310 = "#FFFFFFFF";
                ﹳˊ8.MTH2493(ˎﾞ0.FLD236.MTH1804("LeftChatUserTVTextColor", "#000000"));
                ﹳˊ8.FLD1303 = new CLS265(ˎﾞ0, 13);
                ⁱˉ3.MTH2482(((CLS145)ﹳˊ8));
                CLS332 ʻᵎ11 = ((CLS10)ˎﾞ0).MTH1047(z, z1);
                ʻᵎ11.MTH2328(ˎﾞ0.FLD236.MTH1818("LeftChatUserTVBackgroundColorEnable", false));
                ʻᵎ11.MTH2172(CLS133.MTH2099("LeftChatUserTVBackgroundColorEnable"));
                ʻᵎ11.MTH2327(new CLS19(ˎﾞ0, 18));
                ⁱˉ3.MTH2482(((CLS145)ʻᵎ11));
                CLS345 ﹳˊ9 = new CLS345(activity0);
                ﹳˊ9.MTH2172(CLS133.MTH2099("setLeftChatUserTVBackgroundColor"));
                ﹳˊ9.FLD1310 = "#FFFFFFFF";
                ﹳˊ9.MTH2493(ˎﾞ0.FLD236.MTH1804("LeftChatUserTVBackgroundColor", "#FFFFFFFF"));
                ﹳˊ9.FLD1303 = new CLS265(ˎﾞ0, 14);
                ﹳˊ9.FLD1309 = true;
                ⁱˉ3.MTH2482(((CLS145)ﹳˊ9));
                ⁱˉ3.MTH2475(linearLayout0, 0);
            }
        }
    }
}


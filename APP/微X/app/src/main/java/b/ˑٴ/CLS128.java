// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS71;
import b.ᵔʾ.CLS1235;
import b.ⁱᵔ.CLS500;

public final class CLS128 implements MenuItem.OnMenuItemClickListener {
    public final CLS794 FLD1105;
    public final CLS3 FLD1106;
    public final String FLD1107;
    public final Activity FLD1108;
    public final String FLD1109;
    public final String FLD1110;

    public CLS128(CLS794 ᴵʽ0, Activity activity0, String s, String s1, CLS844 ⁱˉ0, String s2) {
        this.FLD1105 = ᴵʽ0;
        this.FLD1108 = activity0;
        this.FLD1107 = s;
        this.FLD1109 = s1;
        this.FLD1106 = ⁱˉ0;
        this.FLD1110 = s2;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        Activity activity0 = this.FLD1108;
        CLS3 ˆٴ0 = this.FLD1106;
        String s = this.FLD1110;
        CLS794 ᴵʽ0 = this.FLD1105;
        ᴵʽ0.getClass();
        CLS71 ˆٴ1 = new CLS71(activity0, this.FLD1107);
        if(!CLS21.FLD76.MTH830("isHideWxMenu", new Object[0])) {
            ˆٴ1.MTH1572("appname", ((CLS3)new CLS720(0)));
        }
        String s1 = this.FLD1109;
        CLS139 ﹶʼ0 = ᴵʽ0.FLD1447;
        if(!s1.startsWith("wx__c_") && (ﹶʼ0.FLD1438.MTH6895("chatroom_container_tags") && CLS27.MTH895().MTH938("chatroom_tags", false))) {
            ˆٴ1.MTH1572("chatroom_tags", ((CLS3)new CLS651(activity0, 0)));
        }
        ˆٴ1.MTH1572("mark_read", ((CLS3)new CLS822(ᴵʽ0, s1, ˆٴ0, 0)));
        ˆٴ1.MTH1572("mass_delete_msg", ((CLS3)new CLS822(ᴵʽ0, s1, ˆٴ0, 1)));
        ˆٴ1.MTH1572("mute", ((CLS3)new CLS639(ᴵʽ0, s1, activity0, ˆٴ0, 0)));
        ˆٴ1.MTH1572("unmute", ((CLS3)new CLS639(ᴵʽ0, s1, activity0, ˆٴ0, 1)));
        if(ﹶʼ0.FLD1438.MTH6895("chatroom_container_tags")) {
            ˆٴ1.MTH1572("send", ((CLS3)new CLS630(ᴵʽ0, activity0, s1, 1)));
        }
        CLS500 ᵢﹶ0 = ﹶʼ0.FLD1438;
        if(s1.startsWith("wx__c_") && ᵢﹶ0.MTH6895("chatroom_send_multi_invites")) {
            ˆٴ1.MTH1572("invite_member", ((CLS3)new CLS630(ᴵʽ0, activity0, s1, 2)));
        }
        if(s1.startsWith("wx__c_")) {
            ˆٴ1.MTH1572("add", ((CLS3)new CLS639(activity0, ˆٴ0, ᴵʽ0, s1)));
            ˆٴ1.MTH1572("move_out", ((CLS3)new CLS639(ᴵʽ0, s1, activity0, ˆٴ0, 3)));
        }
        if(s1.startsWith("wx__c_") || !s1.startsWith("wx__c_") && ᵢﹶ0.MTH6895("chatroom_container_tags")) {
            ˆٴ1.MTH1572("move_to", ((CLS3)new CLS1235(ᴵʽ0, s1, activity0, ˆٴ0, s)));
        }
        ˆٴ1.MTH1572("search", ((CLS3)new CLS630(activity0, ᴵʽ0, s1)));
        ˆٴ1.MTH1572("settings", ((CLS3)new CLS856(activity0, s1, 0)));
        ˆٴ1.MTH1573();
        return true;
    }
}


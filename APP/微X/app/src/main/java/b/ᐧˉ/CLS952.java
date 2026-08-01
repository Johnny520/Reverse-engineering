// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˈˈ.CLS70;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS536;
import java.util.ArrayList;

public final class CLS952 extends CLS219 {
    public final ArrayList FLD1833;

    public CLS952(String s, String s1) {
        super(s, s1);
        this.FLD1833 = new ArrayList();
    }

    @Override  // b.ᐧˉ.CLS219
    public final void MTH3874(boolean z, boolean z1, String s) {
        this.FLD1833.clear();
        CLS960 ˆˉ0 = new CLS960(this);
        CLS40.FLD157.MTH1124(((CLS39)ˆˉ0));
        if(z1) {
            ((CLS219)this).MTH3875();
        }
        CLS380 ʼˎ0 = new CLS380(((CLS219)this).MTH3883(), this.FLD2156);
        ʼˎ0.FLD3527 = new CLS960(this);
        ʼˎ0.FLD3518 = new CLS1069(((CLS219)this), z, z1, 11);
        ʼˎ0.show();
        if(z1 && !TextUtils.isEmpty(s)) {
            ((CLS219)this).MTH3882(s);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ᐧˉ.CLS219
    public final void MTH3878(LinearLayout linearLayout0, boolean z, boolean z1, boolean z2) {
        int v = CLS523.MTH7137(10);
        Activity activity0 = ((CLS219)this).MTH3883();
        CLS1626 ـﹳ0 = new CLS1626(activity0);
        ـﹳ0.MTH798(CLS27.MTH889("tts_warning"));
        ـﹳ0.FLD5295 = false;
        CLS523.MTH7147(linearLayout0, ((CLS18)ـﹳ0), true);
        boolean z3 = CLS27.MTH902("tts_shortcut_enable");
        CLS29 ˎᵢ0 = this.FLD2151;
        if(z3) {
            CLS1635 ﾞᵎ0 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ0.MTH800(CLS27.MTH889("tts_shortcut_enable"));
            ﾞᵎ0.MTH7437(ˎᵢ0.MTH938("tts_shortcut_enable", false));
            ﾞᵎ0.MTH7438(new CLS223(this, 0));
            CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ0), true);
        }
        CLS1635 ﾞᵎ1 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ1.MTH798(CLS27.MTH889("tts_desc"));
        ﾞᵎ1.MTH800(CLS27.MTH889("tts_send_mode_enable"));
        ﾞᵎ1.MTH7437(ˎᵢ0.MTH938("tts_send_mode_enable", false));
        ﾞᵎ1.MTH7438(new CLS223(this, 1));
        CLS1635 ﾞᵎ2 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ2.MTH800(CLS27.MTH889("tts_enable"));
        ﾞᵎ2.MTH7437(ˎᵢ0.MTH938("tts_enable", true));
        ﾞᵎ2.MTH7438(new CLS223(this, 2));
        CLS1623 יᐧ0 = new CLS1623(activity0);
        יᐧ0.MTH7289(new Object[]{ﾞᵎ1, ﾞᵎ2});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
        CLS1635 ﾞᵎ3 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ3.MTH800(CLS27.MTH889("auto_tts_enable"));
        ﾞᵎ3.MTH7437(ˎᵢ0.MTH938("auto_tts_enable", false));
        ﾞᵎ3.MTH7438(new CLS223(this, 3));
        CLS1635 ﾞᵎ4 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ4.MTH800(CLS27.MTH889("auto_tts_volume_control"));
        ﾞᵎ4.MTH798(CLS27.MTH889("auto_tts_volume_control_desc"));
        ﾞᵎ4.MTH7437(ˎᵢ0.MTH938("auto_tts_volume_control", false));
        ﾞᵎ4.MTH7438(new CLS223(this, 4));
        CLS1635 ﾞᵎ5 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ5.MTH800(CLS27.MTH889("auto_tts_announce_speaker"));
        ﾞᵎ5.MTH7437(ˎᵢ0.MTH938("auto_tts_announce_speaker", false));
        ﾞᵎ5.MTH7438(new CLS223(this, 5));
        CLS1635 ﾞᵎ6 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ6.MTH800(CLS27.MTH889("auto_tts_do_not_disturb"));
        ﾞᵎ6.MTH7437(ˎᵢ0.MTH938("auto_tts_do_not_disturb", false));
        ﾞᵎ6.MTH7438(new CLS223(this, 6));
        CLS1155 ᵔᴵ0 = new CLS1155(this, 0);
        CLS1155 ᵔᴵ1 = new CLS1155(this, 1);
        String s = ˎᵢ0.MTH925("auto_tts_do_not_disturb_start", "23:0");
        String s1 = ˎᵢ0.MTH925("auto_tts_do_not_disturb_end", "8:0");
        String[] arr_s = s.split(":");
        String[] arr_s1 = s1.split(":");
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("startH", arr_s[0]);
        contentValues0.put("startM", arr_s[1]);
        contentValues0.put("endH", arr_s1[0]);
        contentValues0.put("endM", arr_s1[1]);
        CLS536 ˉˏ0 = new CLS536(activity0, contentValues0, ((CLS12)ᵔᴵ0), ((CLS12)ᵔᴵ1));
        CLS1625 ـˏ0 = new CLS1625(activity0);
        ـˏ0.MTH800(CLS27.MTH889("config_include"));
        ـˏ0.MTH7320(new CLS70(5, this));
        CLS1623 יᐧ1 = new CLS1623(activity0);
        יᐧ1.MTH7289(new Object[]{ﾞᵎ3, ﾞᵎ4, ﾞᵎ5, ﾞᵎ6});
        ˉˏ0.MTH7234(יᐧ1);
        יᐧ1.MTH7296(ـˏ0);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        ˑٴ0.FLD5256 = "zh_CN";
        ˑٴ0.MTH7277(ˎᵢ0.MTH925("tts_lang", "zh_CN"));
        ˑٴ0.FLD5252 = new CLS960(this);
        CLS523.MTH7147(linearLayout0, ((CLS18)ˑٴ0), true);
        CLS1622 ˑٴ1 = new CLS1622(activity0);
        CLS1625 ـˏ1 = new CLS1625(activity0);
        ـˏ1.MTH800(CLS27.MTH889("tts_test"));
        ـˏ1.MTH7320(new CLS251(ˑٴ1, 1));
        CLS1623 יᐧ2 = new CLS1623(activity0);
        יᐧ2.MTH7289(new Object[]{ˑٴ1, ـˏ1});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), v);
    }
}


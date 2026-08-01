// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS530;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;

public final class CLS1030 extends CLS219 {
    public final ArrayList FLD2136;
    public CLS244 FLD2137;
    public CLS210 FLD2138;

    public CLS1030(String s, String s1) {
        super(s, s1);
        this.FLD2136 = new ArrayList();
    }

    @Override  // b.ᐧˉ.CLS219
    public final void MTH3874(boolean z, boolean z1, String s) {
        this.FLD2136.clear();
        CLS1178 ⁱʽ0 = new CLS1178(this, 3);
        CLS40.FLD157.MTH1124(((CLS39)ⁱʽ0));
        Activity activity0 = ((CLS219)this).MTH3883();
        this.FLD2138 = new CLS210(activity0, this.FLD2157);
        this.FLD2137 = new CLS244(activity0, this.FLD2157);
        if(z1) {
            ((CLS219)this).MTH3875();
        }
        CLS380 ʼˎ0 = new CLS380(activity0, this.FLD2156);
        ʼˎ0.FLD3527 = new CLS1178(this, 0);
        ʼˎ0.FLD3518 = new CLS1069(((CLS219)this), z, z1, 0);
        ʼˎ0.show();
        if(z1 && !TextUtils.isEmpty(s)) {
            ((CLS219)this).MTH3882(s);
        }
    }

    public final CLS210 MTH3861() {
        if(this.FLD2138 == null) {
            this.FLD2138 = new CLS210(((CLS219)this).MTH3883(), CLS27.MTH904());
        }
        CLS210 ˋʼ0 = this.FLD2138;
        Activity activity0 = ((CLS219)this).MTH3883();
        ˋʼ0.getClass();
        ˋʼ0.FLD2000 = new WeakReference(activity0);
        return this.FLD2138;
    }

    // 此方法包含解密的字符串
    @Override  // b.ᐧˉ.CLS219
    public final void MTH3878(LinearLayout linearLayout0, boolean z, boolean z1, boolean z2) {
        int v = CLS523.MTH7137(10);
        Activity activity0 = ((CLS219)this).MTH3883();
        CLS1623 יᐧ0 = new CLS1623(activity0);
        CLS1635 ﾞᵎ0 = ((CLS219)this).MTH3879(z1, z2);
        String s = CLS34.MTH1065(0x38E9A0F12B3CD335L, ﾞᵎ0, 0x38E9A0892B3CD335L);
        CLS29 ˎᵢ0 = this.FLD2151;
        ﾞᵎ0.MTH7437(ˎᵢ0.MTH938(s, false));
        ﾞᵎ0.MTH7438(new CLS262(this, 0));
        יᐧ0.MTH7296(ﾞᵎ0);
        CLS1635 ﾞᵎ1 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ1.MTH7437(ˎᵢ0.MTH938("autoreply_auto_enable", false));
        ﾞᵎ1.MTH800(CLS27.MTH889("autoreply_auto_enable"));
        ﾞᵎ1.MTH7438(new CLS262(this, 2));
        יᐧ0.MTH7296(ﾞᵎ1);
        CLS1635 ﾞᵎ2 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ2.MTH800(CLS27.MTH889("nonfriend_reply_enable"));
        ﾞᵎ2.MTH7437(ˎᵢ0.MTH938("nonfriend_reply_enable", false));
        ﾞᵎ2.MTH7438(new CLS262(this, 3));
        יᐧ0.MTH7296(ﾞᵎ2);
        CLS1635 ﾞᵎ3 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ3.MTH7437(ˎᵢ0.MTH938("autoreply_showtoast", false));
        ﾞᵎ3.MTH800(CLS27.MTH889("autoreply_toast"));
        ﾞᵎ3.MTH7438(new CLS262(this, 4));
        יᐧ0.MTH7296(ﾞᵎ3);
        יᐧ0.MTH7290(linearLayout0, v);
        CLS1623 יᐧ1 = new CLS1623(activity0);
        CLS1635 ﾞᵎ4 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ4.MTH800(CLS27.MTH889("auto_exclude_reply"));
        ﾞᵎ4.MTH7437(ˎᵢ0.MTH938("auto_exclude_reply", false));
        ﾞᵎ4.MTH7438(new CLS262(this, 5));
        יᐧ1.MTH7296(ﾞᵎ4);
        CLS1635 ﾞᵎ5 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ5.MTH800(CLS27.MTH889("auto_exclude_new_contact_reply"));
        ﾞᵎ5.MTH7437(ˎᵢ0.MTH938("auto_exclude_new_contact_reply", false));
        ﾞᵎ5.MTH7438(new CLS262(this, 6));
        CLS1625 ـˏ0 = CLS34.MTH1082(יᐧ1, ﾞᵎ5, activity0);
        ـˏ0.MTH800(CLS27.MTH889("config_exclude"));
        ـˏ0.MTH7320(new CLS242(this, 2));
        יᐧ1.MTH7296(ـˏ0);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
        CLS500 ᵢﹶ0 = this.FLD2153;
        if(ᵢﹶ0.MTH6895("remote_autoreply")) {
            CLS1635 ﾞᵎ6 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ6.MTH7437(ˎᵢ0.MTH938("remote_autoreply_master_switch", false));
            ﾞᵎ6.MTH800(CLS27.MTH889("remote_autoreply_master_switch"));
            ﾞᵎ6.MTH7438(new CLS262(this, 7));
            CLS1622 ˑٴ0 = new CLS1622(activity0);
            ˑٴ0.MTH7277(ˎᵢ0.MTH925(CLS182.MTH3469(4101000668058014517L, ˑٴ0, 4101000784022131509L), ""));
            ˑٴ0.FLD5252 = new CLS1178(this, 1);
            CLS1622 ˑٴ1 = new CLS1622(activity0);
            ˑٴ1.MTH7277(ˎᵢ0.MTH925(CLS182.MTH3469(4101000354525401909L, ˑٴ1, 4101000474784486197L), ""));
            ˑٴ1.FLD5252 = new CLS1178(this, 2);
            CLS1623 יᐧ2 = new CLS1623(activity0);
            יᐧ2.MTH7289(new Object[]{ﾞᵎ6, ˑٴ0, ˑٴ1});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), v);
        }
        CLS1625 ـˏ1 = new CLS1625(activity0);
        ـˏ1.MTH800(CLS27.MTH889("general"));
        ـˏ1.MTH7320(new CLS242(this, 0));
        CLS523.MTH7147(linearLayout0, ((CLS18)ـˏ1), true);
        CLS1625 ـˏ2 = new CLS1625(activity0);
        ـˏ2.MTH800(CLS27.MTH889("custom"));
        ـˏ2.MTH7320(new CLS242(this, 1));
        CLS523.MTH7147(linearLayout0, ((CLS18)ـˏ2), true);
        if(ᵢﹶ0.MTH6895("ad_sender")) {
            CLS1623 יᐧ3 = new CLS1623(activity0);
            CLS1635 ﾞᵎ7 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ7.MTH800(CLS27.MTH889("ad_sender_enable"));
            ﾞᵎ7.MTH7437(ˎᵢ0.MTH938("ad_sender_enable", false));
            ﾞᵎ7.MTH7438(new CLS262(this, 1));
            CLS1626 ـﹳ0 = ((CLS219)this).MTH3881(z1, z2);
            ـﹳ0.MTH800(CLS27.MTH889("config_ad_rules"));
            ـﹳ0.MTH7324(new CLS530(this, activity0, 3));
            Collections.addAll(יᐧ3.FLD5262, new Object[]{ﾞᵎ7, ـﹳ0});
            יᐧ3.MTH7290(linearLayout0, 0);
        }
    }
}


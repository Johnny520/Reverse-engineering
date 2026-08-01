// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS38.CLS37;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS44;
import b.ˈˈ.CLS73;
import b.ˈˈ.CLS77;
import b.ᵔʾ.CLS1229;

public final class CLS772 extends CLS140 {
    public final CLS73 FLD1073;
    public final CLS77 FLD1074;
    public final int FLD1075;

    public CLS772(CLS139 ﹶʼ0) {
        super(ﹶʼ0);
        this.FLD1074 = new CLS77(ﹶʼ0);
        this.FLD1073 = new CLS73();
        this.FLD1075 = 900000;
    }

    // 此方法包含解密的字符串
    @Override  // b.ˑٴ.CLS140
    public final void MTH3040(CLS21 ʾᵢ0) {
        ʾᵢ0.MTH828("onsettingschange", ((CLS35)new CLS674(this, 0)));
        ʾᵢ0.MTH828("b.on_MMFragmentActivity_onResume,b.on_LauncherUI_onResume", ((CLS35)new CLS674(this, 2)));
        ʾᵢ0.MTH828("on_LauncherUI_onPause", ((CLS35)new CLS674(this, 3)));
        ʾᵢ0.MTH828("config_responses_list", ((CLS35)new CLS674(this, 4)));
        ʾᵢ0.MTH828("a.async.sqldb.insert", ((CLS35)new CLS674(this, 5)));
        ʾᵢ0.MTH828("new_chatroom", ((CLS35)new CLS674(this, 6)));
        ʾᵢ0.MTH828("new_contact", ((CLS35)new CLS674(this, 7)));
        ʾᵢ0.MTH828("a.dbinsert.message", ((CLS35)new CLS674(this, 8)));
        ʾᵢ0.MTH828("import_settings", ((CLS35)new CLS674(this, 9)));
        ʾᵢ0.MTH828("export_settings", ((CLS35)new CLS674(this, 10)));
        ʾᵢ0.MTH833("b.chatroominfoui.menu.options,b.contactinfoui.menu.options,b.singlechatinfoui.menu.options", ((CLS37)new CLS821(((CLS140)this), 0)));
        ʾᵢ0.MTH828("on_pat_msg", ((CLS35)new CLS674(this, 1)));
    }

    @Override  // b.ˑٴ.CLS140
    public final void MTH3043() {
        String s = CLS27.MTH904();
        if(TextUtils.isEmpty(s)) {
            return;
        }
        CLS77 ˊˏ0 = this.FLD1074;
        ˊˏ0.FLD263 = s;
        if(!ˊˏ0.FLD261) {
            ˊˏ0.FLD259 = this.MTH2595();
            ˊˏ0.FLD261 = true;
            CLS1229 ˆٴ0 = new CLS1229(17, this);
            CLS40.FLD157.MTH1124(((CLS39)ˆٴ0));
        }
    }

    public final CLS44 MTH2595() {
        return (CLS44)CLS40.FLD157.MTH1118(CLS44.class);
    }
}


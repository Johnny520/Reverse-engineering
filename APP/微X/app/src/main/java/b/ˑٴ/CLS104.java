// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.Intent;
import android.text.TextUtils;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ᵔʾ.CLS1258;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS523;
import java.io.Serializable;
import java.util.LinkedHashMap;

public final class CLS104 implements MenuItem.OnMenuItemClickListener {
    public final int FLD601;
    public final String FLD602;
    public final CLS139 FLD603;
    public final Serializable FLD604;

    public CLS104(CLS139 ﹶʼ0, String s, String s1) {
        this.FLD601 = 0;
        super();
        this.FLD603 = ﹶʼ0;
        this.FLD602 = s;
        this.FLD604 = s1;
    }

    public CLS104(CLS139 ﹶʼ0, LinkedHashMap linkedHashMap0, String s) {
        this.FLD601 = 1;
        super();
        this.FLD603 = ﹶʼ0;
        this.FLD604 = linkedHashMap0;
        this.FLD602 = s;
    }

    // 此方法包含解密的字符串
    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        String s = this.FLD602;
        CLS139 ﹶʼ0 = this.FLD603;
        Serializable serializable0 = this.FLD604;
        if(this.FLD601 == 0) {
            String s1 = (String)serializable0;
            ﹶʼ0.getClass();
            switch(s) {
                case "addfriend": {
                    s1 = CLS27.MTH897(CLS370.MTH5289(4101699145704461109L));
                    goto label_40;
                }
                case "custom": {
                    goto label_40;
                }
                case "qrcode": {
                    s1 = CLS27.MTH897(CLS370.MTH5289(4101699089869886261L));
                    goto label_40;
                }
                case "scan": {
                    s1 = CLS27.MTH897(CLS370.MTH5289(0x38EC291D2B3CD335L));
                    goto label_40;
                }
                case "settings": {
                    if(!CLS66.MTH1450("setting", ".ui.setting.SettingsUI", new Intent())) {
                        s1 = CLS27.MTH897(CLS370.MTH5289(4101699042625246005L));
                    label_40:
                        if(!TextUtils.isEmpty(s1)) {
                            ﹶʼ0.MTH3014(new Intent(), s1);
                        }
                    }
                    break;
                }
                case "start_groupchat": {
                    String s2 = CLS27.MTH897("SelectContactUI");
                    if(!TextUtils.isEmpty(s2)) {
                        try {
                            Intent intent1 = new Intent();
                            intent1.putExtra("list_attr", 4951);
                            intent1.putExtra("list_type", 0);
                            intent1.putExtra("titile", CLS27.MTH889("start_groupchat"));
                            intent1.putExtra("scene", 7);
                            intent1.putExtra("max_limit_num", 6000);
                            ﹶʼ0.MTH3014(intent1, s2);
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                        }
                        return true;
                    }
                    break;
                }
                case "switch_account": {
                    Intent intent0 = new Intent();
                    intent0.putExtra("key_scene", 0);
                    ﹶʼ0.MTH3014(intent0, CLS27.MTH897("SettingsSwitchAccountUI"));
                    goto label_40;
                }
                case "wallet": {
                    s1 = CLS27.MTH897(CLS370.MTH5289(4101698613128516405L));
                    goto label_40;
                }
                case "walletcoin": {
                    s1 = CLS27.MTH897(CLS370.MTH5289(0x38EC29342B3CD335L));
                    goto label_40;
                }
                case "wexposed": {
                    CLS21.FLD76.MTH831("core", "show_wexposed_main_options", new Object[0]);
                    return true;
                }
                default: {
                    return true;
                }
            }
            return true;
        }
        CLS523.MTH7159(ﹶʼ0.MTH3026(), CLS27.MTH889("appname"), ((LinkedHashMap)serializable0), ((CLS7)new CLS1258(8, s)));
        return true;
    }
}


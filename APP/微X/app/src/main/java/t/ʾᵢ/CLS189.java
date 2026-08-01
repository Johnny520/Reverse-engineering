// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import java.util.ArrayList;
import t.ˆʿ.CLS55.CLS53;
import t.ٴـ.CLS117;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS137.CLS136;
import t.ⁱʾ.CLS143;
import t.ﾞٴ.CLS322;
import t.ﾞᐧ.CLS168;
import t.ﾞᐧ.CLS172.CLS171;
import t.ﾞᐧ.CLS339.CLS170;

public final class CLS189 implements CLS53, CLS136, CLS170, CLS171 {
    public final int FLD115;
    public final CLS216 FLD116;

    public CLS189(CLS216 ˎﾞ0, int v) {
        this.FLD115 = v;
        this.FLD116 = ˎﾞ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS137$CLS136
    public final void run() {
        this.FLD116.FLD236.MTH1813();
        CLS117.FLD842.MTH1908();
        CLS133.MTH2103().MTH2125(this.FLD116.FLD236.FLD773, "current_theme");
        CLS123.FLD912.MTH1999("apply_theme", new Object[]{this.FLD116.FLD236.FLD773});
    }

    // 此方法包含解密的字符串
    @Override  // t.ﾞᐧ.CLS339$CLS170
    public final void MTH2406(String s) {
        CLS216 ˎﾞ0 = this.FLD116;
        switch(this.FLD115) {
            case 9: {
                ˎﾞ0.getClass();
                try {
                    ˎﾞ0.FLD236.MTH1795(Integer.parseInt(s), "DrawerWidth");
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
                return;
            }
            case 10: {
                ˎﾞ0.getClass();
                try {
                    ˎﾞ0.FLD236.MTH1795(Integer.parseInt(s), "DrawerCustomTopMargin");
                }
                catch(Throwable throwable1) {
                    CLS133.MTH2113(throwable1);
                }
                return;
            }
            case 21: {
                ˎﾞ0.FLD236.MTH1823("BottomTabIconWechatText", s);
                return;
            }
            case 22: {
                ˎﾞ0.FLD236.MTH1823("BottomTabIconContactsText", s);
                return;
            }
            case 23: {
                ˎﾞ0.FLD236.MTH1823("BottomTabIconDiscoverText", s);
                return;
            }
            default: {
                ˎﾞ0.FLD236.MTH1823("BottomTabIconMeText", s);
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // t.ˆʿ.CLS55$CLS53
    public final void MTH1476(CLS168 ˑٴ0) {
        this.FLD116.FLD238 = ˑٴ0;
        CLS117.FLD842.getClass();
        ArrayList arrayList0 = new ArrayList(CLS117.FLD842.FLD841.keySet());
        Activity activity0 = ((CLS10)this.FLD116).MTH1048();
        ˑٴ0.MTH2390("import_", ((CLS143)new CLS255(this.FLD116, activity0, 1)));
        ˑٴ0.MTH2390("export_", ((CLS143)new CLS226(this.FLD116, 0)));
        ˑٴ0.MTH2390("delete_theme", ((CLS143)new CLS322(this.FLD116, activity0, arrayList0, 1)));
        ˑٴ0.MTH2390("add_theme", ((CLS143)new CLS255(this.FLD116, activity0, 2)));
        ˑٴ0.MTH2390("rename_theme", ((CLS143)new CLS255(this.FLD116, activity0, 3)));
        ˑٴ0.MTH2390("clone_theme", ((CLS143)new CLS255(this.FLD116, activity0, 4)));
        ˑٴ0.MTH2390("save_theme", ((CLS143)new CLS226(this.FLD116, 1)));
        ˑٴ0.MTH2390("apply_theme", ((CLS143)new CLS226(this.FLD116, 2)));
    }

    // 此方法包含解密的字符串
    @Override  // t.ﾞᐧ.CLS172$CLS171
    public final void MTH2418(int v, String s) {
        CLS216 ˎﾞ0 = this.FLD116;
        switch(this.FLD115) {
            case 0: {
                if(!ˎﾞ0.MTH1137()) {
                    ˎﾞ0.FLD236.MTH1823("ActionBarColor", s);
                }
                return;
            }
            case 1: {
                if(!ˎﾞ0.MTH1137()) {
                    ˎﾞ0.FLD236.MTH1823("FragmentItemViewBackgroundColor", s);
                }
                return;
            }
            case 2: {
                if(!ˎﾞ0.MTH1137()) {
                    ˎﾞ0.FLD236.MTH1823("FragmentItemViewStickyBackgroundColor", s);
                }
                return;
            }
            case 3: {
                if(!ˎﾞ0.MTH1137()) {
                    ˎﾞ0.FLD236.MTH1823("FragmentItemViewTitleColor", s);
                }
                return;
            }
            case 4: {
                if(!ˎﾞ0.MTH1137()) {
                    ˎﾞ0.FLD236.MTH1823("FragmentItemViewSubTitleColor", s);
                }
                return;
            }
            case 7: {
                ˎﾞ0.FLD236.MTH1823("FloatingActionMenuColor", s);
                return;
            }
            case 8: {
                ˎﾞ0.FLD236.MTH1823("FloatingActionMenuTextColor", s);
                return;
            }
            case 11: {
                ˎﾞ0.FLD236.MTH1823("DrawerBackgroundColor", s);
                return;
            }
            case 12: {
                ˎﾞ0.FLD236.MTH1823("DrawerItemViewBackgroundColor", s);
                return;
            }
            case 13: {
                ˎﾞ0.FLD236.MTH1823("DrawerItemViewHighlightColor", s);
                return;
            }
            case 14: {
                ˎﾞ0.FLD236.MTH1823("DrawerItemViewHighlightTextColor", s);
                return;
            }
            case 15: {
                ˎﾞ0.FLD236.MTH1823("DrawerItemViewTitleColor", s);
                return;
            }
            case 16: {
                ˎﾞ0.FLD236.MTH1823("DrawerItemViewSubTitleColor", s);
                return;
            }
            case 17: {
                ˎﾞ0.FLD236.MTH1823("DrawerNewMessageColor", s);
                return;
            }
            case 18: {
                ˎﾞ0.FLD236.MTH1823("DrawerAccountInfoColor", s);
                return;
            }
            case 19: {
                ˎﾞ0.FLD236.MTH1823("BottomTabLabelTextColorNormal", s);
                return;
            }
            case 20: {
                ˎﾞ0.FLD236.MTH1823("BottomTabLabelTextColorFocus", s);
                return;
            }
            case 25: {
                ˎﾞ0.FLD236.MTH1823("BottomTabColor", s);
                return;
            }
            case 26: {
                ˎﾞ0.FLD236.MTH1823("BottomTabIconColorNormal", s);
                return;
            }
            case 27: {
                ˎﾞ0.FLD236.MTH1823("BottomTabIconColorMiddle", s);
                return;
            }
            default: {
                ˎﾞ0.FLD236.MTH1823("BottomTabIconColorFocus", s);
            }
        }
    }
}


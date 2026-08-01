// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.text.TextUtils;
import java.util.ArrayList;
import t.ˊﾞ.CLS102;
import t.ٴـ.CLS117;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS137.CLS136;
import t.ᵔʾ.CLS137;
import t.ⁱʾ.CLS140;
import t.ﾞᐧ.CLS172.CLS171;
import t.ﾞᐧ.CLS177;
import t.ﾞᐧ.CLS339.CLS170;

public final class CLS265 implements CLS136, CLS140, CLS170, CLS171 {
    public final int FLD391;
    public final CLS216 FLD392;

    public CLS265(CLS216 ˎﾞ0, int v) {
        this.FLD391 = v;
        this.FLD392 = ˎﾞ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS137$CLS136
    public final void run() {
        CLS216 ˎﾞ0 = this.FLD392;
        if(this.FLD391 == 20) {
            ˎﾞ0.FLD236.MTH1813();
            CLS117.FLD842.MTH1908();
            CLS133.MTH2103().MTH2125(ˎﾞ0.FLD236.FLD773, "current_theme");
            CLS123.FLD912.MTH1999("apply_theme", new Object[]{ˎﾞ0.FLD236.FLD773});
            return;
        }
        ˎﾞ0.FLD236.MTH1813();
        CLS117.FLD842.MTH1908();
    }

    // 此方法包含解密的字符串
    @Override  // t.ﾞᐧ.CLS339$CLS170
    public final void MTH2406(String s) {
        CLS216 ˎﾞ0 = this.FLD392;
        switch(this.FLD391) {
            case 4: {
                ˎﾞ0.getClass();
                try {
                    int v = Integer.parseInt(s);
                    ˎﾞ0.FLD236.MTH1795(v, "RecentChatFloatingActionMenuMax");
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            case 8: {
                ˎﾞ0.FLD236.MTH1823("ChatTimeTVDetailedPattern", s);
                return;
            }
            case 26: {
                ˎﾞ0.getClass();
                try {
                    ˎﾞ0.FLD236.MTH1795(Integer.parseInt(s), "TabLayoutCustomTopMargin");
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
                return;
            }
            case 27: {
                ˎﾞ0.FLD236.MTH1823("TabLayoutTextWechat", s);
                return;
            }
            case 28: {
                ˎﾞ0.FLD236.MTH1823("TabLayoutTextContacts", s);
                return;
            }
            default: {
                ˎﾞ0.FLD236.MTH1823("TabLayoutTextDiscover", s);
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS140
    public final void MTH2164(String s) {
        CLS216 ˎﾞ0 = this.FLD392;
        switch(this.FLD391) {
            case 18: {
                ˎﾞ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    ˎﾞ0.FLD235.MTH2365(s);
                }
                return;
            }
            case 19: {
                ˎﾞ0.getClass();
                if(!TextUtils.isEmpty(s) && !s.equals(ˎﾞ0.FLD236.FLD773)) {
                    CLS198 ˊʼ0 = new CLS198(ˎﾞ0, s, 0);
                    CLS137.FLD972.MTH2141(((CLS136)ˊʼ0));
                }
                return;
            }
            default: {
                ˎﾞ0.getClass();
                if(!TextUtils.isEmpty(s) && !s.equals(ˎﾞ0.FLD236.FLD773)) {
                    CLS177 ᐧˉ0 = ˎﾞ0.FLD235.FLD1139;
                    String s1 = ˎﾞ0.FLD236.FLD773;
                    ArrayList arrayList0 = ᐧˉ0.FLD1259;
                    if(arrayList0.contains(s1)) {
                        arrayList0.remove(s1);
                        arrayList0.add(s);
                        ᐧˉ0.FLD1260.notifyDataSetChanged();
                        ᐧˉ0.MTH2445(s);
                    }
                    CLS102 יﹳ0 = ˎﾞ0.FLD236;
                    ((Boolean)CLS123.FLD912.MTH2010("core", "renameModuleFile", new Object[]{10, יﹳ0.FLD773, s})).booleanValue();
                    יﹳ0.FLD773 = s;
                    יﹳ0.FLD765 = null;
                    יﹳ0.FLD766 = null;
                    CLS117.FLD842.MTH1908();
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // t.ﾞᐧ.CLS172$CLS171
    public final void MTH2418(int v, String s) {
        CLS216 ˎﾞ0 = this.FLD392;
        switch(this.FLD391) {
            case 0: {
                ˎﾞ0.FLD236.MTH1823("MainFragmentBackgroundColor", s);
                return;
            }
            case 1: {
                ˎﾞ0.FLD236.MTH1823("ContactFragmentBackgroundColor", s);
                return;
            }
            case 2: {
                ˎﾞ0.FLD236.MTH1823("DiscoverFragmentBackgroundColor", s);
                return;
            }
            case 3: {
                ˎﾞ0.FLD236.MTH1823("MeFragmentBackgroundColor", s);
                return;
            }
            case 5: {
                ˎﾞ0.FLD236.MTH1823("RecentChatFloatingActionMenuColor", s);
                return;
            }
            case 6: {
                ˎﾞ0.FLD236.MTH1823("RecentChatFloatingActionMenuTextColor", s);
                return;
            }
            case 7: {
                ˎﾞ0.FLD236.MTH1823("RightChatBubbleColor", s);
                return;
            }
            case 9: {
                ˎﾞ0.FLD236.MTH1823("LeftChatTimeTVTextColor", s);
                return;
            }
            case 10: {
                ˎﾞ0.FLD236.MTH1823("LeftChatTimeTVBackgroundColor", s);
                return;
            }
            case 11: {
                ˎﾞ0.FLD236.MTH1823("RightChatTimeTVTextColor", s);
                return;
            }
            case 12: {
                ˎﾞ0.FLD236.MTH1823("RightChatTimeTVBackgroundColor", s);
                return;
            }
            case 13: {
                ˎﾞ0.FLD236.MTH1823("LeftChatUserTVTextColor", s);
                return;
            }
            case 14: {
                ˎﾞ0.FLD236.MTH1823("LeftChatUserTVBackgroundColor", s);
                return;
            }
            case 15: {
                ˎﾞ0.FLD236.MTH1823("ChatTextColorLeft", s);
                return;
            }
            case 16: {
                ˎﾞ0.FLD236.MTH1823("ChatTextColorRight", s);
                return;
            }
            case 17: {
                ˎﾞ0.FLD236.MTH1823("LeftChatBubbleColor", s);
                return;
            }
            case 23: {
                ˎﾞ0.FLD236.MTH1823("TabLayoutIconColorNormal", s);
                return;
            }
            case 24: {
                ˎﾞ0.FLD236.MTH1823("TabLayoutIconColorFocus", s);
                return;
            }
            default: {
                ˎﾞ0.FLD236.MTH1823("TabLayoutColor", s);
            }
        }
    }
}


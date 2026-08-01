// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS25;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS41;
import b.ˆʿ.CLS45;
import b.ᵔʾ.CLS288;
import b.ᵔʾ.CLS305;
import b.ⁱᵔ.CLS1511;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS485;

public final class CLS267 implements View.OnClickListener {
    public final int FLD2810;

    public CLS267(int v) {
        this.FLD2810 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS305 ᵢʾ0 = CLS305.FLD3177;
        switch(this.FLD2810) {
            case 0: {
                CLS25.MTH866(14);
                return;
            }
            case 1: {
                CLS25.MTH866(14);
                return;
            }
            case 2: {
                CLS40 ﾞᵎ0 = CLS40.FLD157;
                CLS485 ᐧﾞ0 = (CLS485)ﾞᵎ0.MTH1118(CLS485.class);
                for(int v = 0; v < ᐧﾞ0.FLD4737.size(); ++v) {
                    ᐧﾞ0.MTH6733(v);
                }
                ﾞᵎ0.MTH1124(((CLS39)new CLS1511(8)));
                return;
            }
            case 3: {
                CLS288.FLD2989.MTH4737();
                return;
            }
            case 4: {
                CLS288.FLD2989.MTH4743();
                return;
            }
            case 5: {
                CLS288.FLD2989.MTH4740();
                return;
            }
            case 6: {
                if(!ᵢʾ0.FLD3178 && !TextUtils.isEmpty(CLS27.MTH895().MTH925("auto_shake_gps", ""))) {
                    ᵢʾ0.FLD3178 = true;
                    ᵢʾ0.FLD3176 = CLS412.MTH6005(10, "auto_shake_friend_max");
                    CLS412.MTH6011((CLS27.MTH889("start_auto_shake_friendfinder") + " " + ᵢʾ0.FLD3176));
                    ᵢʾ0.MTH4915();
                }
                return;
            }
            case 7: {
                ᵢʾ0.FLD3178 = false;
                CLS412.MTH6011(CLS27.MTH889("stop_auto_shake_friendfinder"));
                return;
            }
            case 8: {
                CLS21.FLD76.MTH818("mass_invite_chatrooms", new Object[0]);
                return;
            }
            case 9: {
                CLS25.MTH866(13);
                return;
            }
            case 10: {
                CLS25.MTH866(5);
                return;
            }
            case 11: {
                CLS21.FLD76.MTH829("doFilterMoments", new Object[0]);
                return;
            }
            case 12: {
                CLS41 ʻˑ0 = (CLS41)CLS40.FLD157.MTH1118(CLS41.class);
                if(ʻˑ0 != null) {
                    String s = CLS27.MTH904();
                    if(!TextUtils.isEmpty(s)) {
                        ʻˑ0.getWritableDatabase().delete("FAKECOMMENTS", "ACCOUNT = ?", new String[]{s});
                    }
                }
                return;
            }
            case 13: {
                CLS45 ˈˈ0 = (CLS45)CLS40.FLD157.MTH1118(CLS45.class);
                if(ˈˈ0 != null) {
                    String s1 = CLS27.MTH904();
                    if(!TextUtils.isEmpty(s1)) {
                        ˈˈ0.getWritableDatabase().delete("FAKELIKES", "ACCOUNT = ?", new String[]{s1});
                        ˈˈ0.FLD163.clear();
                    }
                }
                return;
            }
            case 14: {
                CLS21.FLD76.MTH818("unrecallSnsComments", new Object[0]);
                return;
            }
            case 15: {
                CLS21.FLD76.MTH818("unrecallSnsMoments", new Object[0]);
                return;
            }
            case 16: {
                CLS288.FLD2989.MTH4743();
                return;
            }
            case 17: {
                CLS288.FLD2989.MTH4740();
                return;
            }
            case 18: {
                CLS288.FLD2989.MTH4743();
                return;
            }
            case 19: {
                CLS288.FLD2989.MTH4740();
                return;
            }
            case 20: {
                CLS288.FLD2989.MTH4740();
                return;
            }
            case 21: {
                CLS288.FLD2989.MTH4743();
                return;
            }
            case 22: {
                CLS21.FLD76.MTH818("config_responses_list", new Object[]{"_FRIENDREQUEST_INTRO_", Boolean.FALSE, Boolean.TRUE, Boolean.TRUE});
                return;
            }
            case 23: {
                CLS288.FLD2989.MTH4737();
                return;
            }
            default: {
                CLS21.FLD76.MTH818("config_responses_list", new Object[]{"_SELF_ACCEPT_", Boolean.TRUE, Boolean.FALSE});
            }
        }
    }
}


// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS568;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS79;
import b.ᵔʾ.CLS1259;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS403;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class CLS245 implements View.OnClickListener {
    public final int FLD2585;
    public final Activity FLD2586;
    public final CLS1019 FLD2587;

    public CLS245(CLS1019 ˎʻ0, Activity activity0, int v) {
        this.FLD2585 = v;
        this.FLD2587 = ˎʻ0;
        this.FLD2586 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.FLD2586;
        CLS1019 ˎʻ0 = this.FLD2587;
        switch(this.FLD2585) {
            case 0: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2085.getClass();
                CLS485.MTH6721(activity0, "wx_at");
                return;
            }
            case 1: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2085.getClass();
                CLS485.MTH6716(activity0, "wx_at");
                return;
            }
            case 2: {
                CLS1007 ˎʻ$ˆٴ0 = new CLS1007(ˎʻ0);
                String s2 = ˎʻ0.FLD2151.MTH925("prevent_at_include", "");
                CLS387.MTH5585(true, activity0, ˎʻ0.FLD2089, ((CLS2)ˎʻ$ˆٴ0), s2, -1);
                return;
            }
            case 3: {
                CLS1014 ˎʻ$ᵔʾ0 = new CLS1014(ˎʻ0);
                String s3 = ˎʻ0.FLD2151.MTH925("prevent_at_exclude", "");
                CLS387.MTH5585(true, activity0, ˎʻ0.FLD2089, ((CLS2)ˎʻ$ᵔʾ0), s3, -1);
                return;
            }
            case 4: {
                CLS1012 ˎʻ$ٴـ0 = new CLS1012(ˎʻ0);
                String s4 = ˎʻ0.FLD2151.MTH925("auto_remark_new_chat_member_allowlist", "");
                CLS387.MTH5585(true, activity0, ˎʻ0.FLD2087, ((CLS2)ˎʻ$ٴـ0), s4, -1);
                return;
            }
            case 5: {
                ˎʻ0.getClass();
                CLS387.MTH5585(true, activity0, new ArrayList(ˎʻ0.FLD2086), ((CLS2)new CLS1015(ˎʻ0)), ˎʻ0.FLD2151.MTH925("autokick_member_friend_request_list", ""), -1);
                return;
            }
            case 6: {
                ˎʻ0.getClass();
                try {
                    ArrayList arrayList1 = new ArrayList();
                    ˎʻ0.FLD2092.MTH5330(arrayList1);
                    for(Object object0: arrayList1) {
                        ((CLS78)object0).FLD275 = " (" + CLS371.FLD3470.MTH5369("") + ")";
                    }
                    CLS387.MTH5585(true, activity0, arrayList1, ((CLS2)new CLS1010(activity0)), null, -1);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 7: {
                ˎʻ0.getClass();
                try {
                    ArrayList arrayList2 = new ArrayList();
                    ˎʻ0.FLD2092.MTH5374(arrayList2);
                    CLS387.MTH5585(true, activity0, arrayList2, ((CLS2)new CLS1018(ˎʻ0)), null, -1);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 8: {
                ˎʻ0.getClass();
                try {
                    CLS387.MTH5585(true, activity0, ˎʻ0.FLD2092.MTH5376(), ((CLS2)new CLS1017()), null, -1);
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 9: {
                ˎʻ0.getClass();
                ArrayList arrayList3 = new ArrayList();
                CLS371 ʻ0 = ˎʻ0.FLD2092;
                ʻ0.MTH5330(arrayList3);
                Iterator iterator1 = arrayList3.iterator();
                while(iterator1.hasNext()) {
                    iterator1.next();
                    if(ʻ0.MTH5367("")) {
                        iterator1.remove();
                    }
                }
                CLS387.MTH5585(true, activity0, arrayList3, ((CLS2)new CLS1005()), null, -1);
                return;
            }
            case 10: {
                ˎʻ0.getClass();
                ArrayList arrayList4 = new ArrayList();
                CLS371 ʻ1 = ˎʻ0.FLD2092;
                ʻ1.MTH5330(arrayList4);
                Iterator iterator2 = arrayList4.iterator();
                while(iterator2.hasNext()) {
                    iterator2.next();
                    if(!ʻ1.MTH5367("")) {
                        iterator2.remove();
                    }
                }
                CLS387.MTH5585(true, activity0, arrayList4, ((CLS2)new CLS1006()), null, -1);
                return;
            }
            case 11: {
                ˎʻ0.getClass();
                ArrayList arrayList5 = new ArrayList();
                ˎʻ0.FLD2092.MTH5330(arrayList5);
                CLS523.MTH7165(activity0, CLS27.MTH889("mass_chatroom_nickname"), CLS27.MTH889("chatroom_lbl"), "", 1, ((CLS16)new CLS1259(ˎʻ0, activity0, arrayList5, 23)));
                return;
            }
            case 12: {
                ˎʻ0.getClass();
                ArrayList arrayList6 = new ArrayList();
                CLS371.FLD3470.MTH5313(ˎʻ0.FLD2157, arrayList6);
                CLS372.MTH5405(arrayList6);
                CLS387.MTH5585(true, activity0, arrayList6, ((CLS2)new CLS1008(activity0)), null, -1);
                return;
            }
            case 13: {
                ˎʻ0.getClass();
                CLS523.MTH7165(activity0, CLS27.MTH889("mass_announce"), "", "", 1, ((CLS16)new CLS1116(ˎʻ0, activity0)));
                return;
            }
            case 14: {
                ˎʻ0.getClass();
                new String("WxChatroomManagementTempl_");
                CLS403.MTH5865(activity0, CLS27.MTH889("chatroom_management_template"), "WxChatroomManagementTemplates", "WxChatroomManagementTempl_", ((CLS12)new CLS568(((CLS219)ˎʻ0), activity0, 7)));
                return;
            }
            case 15: {
                CLS1197 ﹳᵎ0 = new CLS1197(ˎʻ0);
                String s5 = ˎʻ0.FLD2151.MTH925("auto_accept_chatroom_invite_config_include", "");
                CLS387.MTH5585(true, activity0, ˎʻ0.FLD2089, ((CLS2)ﹳᵎ0), s5, -1);
                return;
            }
            case 16: {
                CLS908 ʻᵔ0 = new CLS908(ˎʻ0);
                String s6 = ˎʻ0.FLD2151.MTH925("auto_accept_chatroom_invite_config_exclude", "");
                CLS387.MTH5585(true, activity0, ˎʻ0.FLD2089, ((CLS2)ʻᵔ0), s6, -1);
                return;
            }
            case 17: {
                CLS1148 ᵎᐧ0 = new CLS1148(ˎʻ0);
                String s7 = ˎʻ0.FLD2151.MTH925("auto_accept_chatroom_invite_qr_config_include", "");
                CLS387.MTH5585(true, activity0, ˎʻ0.FLD2089, ((CLS2)ᵎᐧ0), s7, -1);
                return;
            }
            case 18: {
                CLS1196 ﹳᴵ0 = new CLS1196(ˎʻ0);
                String s8 = ˎʻ0.FLD2151.MTH925("auto_accept_chatroom_invite_qr_excl", "");
                CLS387.MTH5585(true, activity0, ˎʻ0.FLD2089, ((CLS2)ﹳᴵ0), s8, -1);
                return;
            }
            default: {
                ˎʻ0.getClass();
                ArrayList arrayList0 = new ArrayList();
                String s = CLS79.FLD292.MTH1624();
                HashSet hashSet0 = new HashSet();
                String[] arr_s = CLS502.MTH6941(s);
                for(int v = 0; v < arr_s.length; ++v) {
                    String s1 = arr_s[v];
                    if(!"wx__MAIN_".equals(s1) && !s1.startsWith("wx__c_")) {
                        arrayList0.add(new CLS78(s1, CLS79.FLD292.MTH1625(s1)));
                        if(CLS79.FLD292.MTH1658(s1)) {
                            hashSet0.add(s1);
                        }
                    }
                }
                CLS387.MTH5585(true, activity0, arrayList0, ((CLS2)new CLS1022(hashSet0)), TextUtils.join(",", hashSet0), -1);
            }
        }
    }
}


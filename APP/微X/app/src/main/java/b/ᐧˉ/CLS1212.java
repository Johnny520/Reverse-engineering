// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS69;
import b.ˈˊ.CLS99;
import b.ᵔʾ.CLS1259;
import b.ᵔʾ.CLS309;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;

public final class CLS1212 implements CLS3 {
    public final int FLD2858;
    public final CLS1078 FLD2859;

    public CLS1212(CLS1078 ـˆ0, int v) {
        this.FLD2858 = v;
        this.FLD2859 = ـˆ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS1078 ـˆ0 = this.FLD2859;
        switch(this.FLD2858) {
            case 0: {
                CLS309 ⁱʾ0 = ـˆ0.FLD2313;
                ⁱʾ0.getClass();
                for(Object object0: ـˆ0.FLD2314) {
                    CLS99 ﾞᵎ0 = (CLS99)object0;
                    if(ﾞᵎ0.FLD490) {
                        ⁱʾ0.MTH4941(ﾞᵎ0);
                    }
                }
                return;
            }
            case 1: {
                ـˆ0.getClass();
                CLS1212 ﾞˋ0 = new CLS1212(ـˆ0, 2);
                ArrayList arrayList0 = new ArrayList();
                CLS69 ʾᵢ0 = new CLS69();
                arrayList0.add(CLS27.MTH889("mark_read"));
                arrayList0.add(CLS27.MTH889("mass_delete_msg"));
                arrayList0.add(CLS27.MTH889("mass_delete_conversation"));
                arrayList0.add(CLS27.MTH889("restart_wechat"));
                arrayList0.add(CLS27.MTH889("send_msg"));
                ʾᵢ0.MTH1560(CLS182.MTH3497(3, ʾᵢ0, CLS182.MTH3497(2, ʾᵢ0, CLS182.MTH3497(1, ʾᵢ0, CLS182.MTH3497(0, ʾᵢ0, CLS27.MTH889("mark_read"), 4100611896208315189L), 4100611964927791925L), 4100612029352301365L), 4100612068007007029L), 8);
                CLS500 ᵢﹶ0 = ـˆ0.FLD2153;
                if(ᵢﹶ0.MTH6895("task_chatroom_invite_allow_by_identity")) {
                    arrayList0.add(CLS27.MTH889("chatroom_invite_allow_by_identity_enable"));
                    arrayList0.add(CLS27.MTH889("chatroom_invite_allow_by_identity_disable"));
                    ʾᵢ0.MTH1560(CLS182.MTH3497(9, ʾᵢ0, CLS27.MTH889("chatroom_invite_allow_by_identity_enable"), 4100612325705044789L), 10);
                }
                if(ᵢﹶ0.MTH6895("zombie_silent_search")) {
                    arrayList0.add(CLS27.MTH889("zombie_silent_search"));
                    ʾᵢ0.MTH1560(CLS27.MTH889("zombie_silent_search"), 6);
                }
                if(ᵢﹶ0.MTH6897()) {
                    arrayList0.add(CLS27.MTH889("post_moment"));
                    ʾᵢ0.MTH1560(CLS27.MTH889("post_moment"), 4);
                }
                boolean z = CLS412.MTH6002();
                if(ـˆ0.FLD2151.MTH938("multi_selection_auto_forward_enable", z) && ᵢﹶ0.MTH6895("task_multi_selection_auto_forward") && ᵢﹶ0.MTH6895("RecordForward") && ᵢﹶ0.MTH6898()) {
                    arrayList0.add(CLS27.MTH889("multi_selection_auto_forward_enable"));
                    ʾᵢ0.MTH1560(CLS27.MTH889("multi_selection_auto_forward_enable"), 5);
                    arrayList0.add(CLS27.MTH889("exported_records"));
                    ʾᵢ0.MTH1560(CLS27.MTH889("exported_records"), 13);
                }
                arrayList0.add(CLS27.MTH889("mass_announce"));
                ʾᵢ0.MTH1560(CLS27.MTH889("mass_announce"), 7);
                arrayList0.add(CLS27.MTH889("mass_mute"));
                arrayList0.add(CLS27.MTH889("mass_unmute"));
                ʾᵢ0.MTH1560(CLS182.MTH3497(11, ʾᵢ0, CLS27.MTH889("mass_mute"), 4100609555451138869L), 12);
                CLS523.MTH7163(true, ((CLS219)ـˆ0).MTH3883(), CLS27.MTH889("add_task"), arrayList0, ((CLS7)new CLS1259(ـˆ0, ʾᵢ0, ﾞˋ0, 29)));
                return;
            }
            case 2: {
                ـˆ0.FLD2317.notifyDataSetChanged();
                return;
            }
            default: {
                ـˆ0.FLD2317.notifyDataSetChanged();
            }
        }
    }
}


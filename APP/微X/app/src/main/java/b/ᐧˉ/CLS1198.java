// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ˈˈ.CLS78;
import b.ⁱʾ.CLS332.CLS330;
import b.ⁱʾ.CLS332;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624.CLS540;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS525;
import b.ﾞˎ.CLS534.CLS533;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

public final class CLS1198 implements CLS39, CLS378, CLS379, CLS533, CLS540 {
    public final int FLD2804;
    public final CLS1112 FLD2805;

    public CLS1198(CLS1112 ᐧˏ0, int v) {
        this.FLD2804 = v;
        this.FLD2805 = ᐧˏ0;
        super();
    }

    @Override  // b.ﾞˎ.CLS1624$CLS540
    public final void onQueryTextChange(String s) {
        CLS332 ˊﾞ0 = this.FLD2805.FLD2465;
        ˊﾞ0.getClass();
        new CLS330(ˊﾞ0).filter(s);
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        ArrayList arrayList0 = this.FLD2805.FLD2448;
        arrayList0.clear();
        HashMap hashMap0 = this.FLD2805.FLD2453;
        hashMap0.clear();
        ArrayList arrayList1 = new ArrayList();
        this.FLD2805.FLD2472.MTH5314(this.FLD2805.FLD2157, arrayList1);
        for(Object object0: arrayList1) {
            CLS78 ˊﾞ0 = (CLS78)object0;
            if(!hashMap0.containsKey("")) {
                arrayList0.add(ˊﾞ0);
                hashMap0.put("", ˊﾞ0);
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        CLS1112 ᐧˏ0 = this.FLD2805;
        ᐧˏ0.getClass();
        CLS967 ˈʼ0 = new CLS967(ᐧˏ0, 0);
        ʻˑ0.MTH7187("createTemplate", ((CLS3)new CLS967(ᐧˏ0, 1)));
        ʻˑ0.MTH7187("clear_empty_contacts", ((CLS3)new CLS967(ᐧˏ0, 2)));
        ʻˑ0.MTH7187("delete_all", ((CLS3)ˈʼ0));
        ʻˑ0.MTH7187("add_multi_members", ((CLS3)new CLS967(ᐧˏ0, 3)));
        ʻˑ0.MTH7187("add_member", ((CLS3)new CLS967(ᐧˏ0, 4)));
        CLS500 ᵢﹶ0 = ᐧˏ0.FLD2153;
        if(ᵢﹶ0.MTH6895("all_friends_chat_blacklist")) {
            ʻˑ0.MTH7187("all_friends_chat_blacklist", ((CLS3)new CLS967(ᐧˏ0, 5)));
        }
        if(ᵢﹶ0.MTH6895("all_chatroom_chat_blacklist")) {
            ʻˑ0.MTH7187("all_chatroom_chat_blacklist", ((CLS3)new CLS967(ᐧˏ0, 6)));
        }
        if(ᵢﹶ0.MTH6895("new_contact_chat_blacklist")) {
            ʻˑ0.MTH7187("new_contact_chat_blacklist", ((CLS3)new CLS967(ᐧˏ0, 7)));
        }
        if(ᵢﹶ0.MTH6895("new_chatroom_chat_blacklist")) {
            ʻˑ0.MTH7187("new_chatroom_chat_blacklist", ((CLS3)new CLS967(ᐧˏ0, 8)));
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS534$CLS533
    public final void MTH7225(int v, String s) {
        CLS1112 ᐧˏ0 = this.FLD2805;
        if(this.FLD2804 == 3) {
            ᐧˏ0.getClass();
            if(!TextUtils.isEmpty(s)) {
                for(Object object0: ᐧˏ0.FLD2482) {
                    JSONObject jSONObject0 = (JSONObject)object0;
                    if(s.equals(jSONObject0.optString("n"))) {
                        ᐧˏ0.MTH4204(jSONObject0.optString("t"));
                        return;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return;
        }
        ᐧˏ0.getClass();
        if(!TextUtils.isEmpty(s)) {
            for(Object object1: ᐧˏ0.FLD2482) {
                JSONObject jSONObject1 = (JSONObject)object1;
                if(s.equals(jSONObject1.optString("n"))) {
                    ᐧˏ0.MTH4204(jSONObject1.optString("t"));
                    return;
                }
                if(false) {
                    break;
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        CLS1112 ᐧˏ0 = this.FLD2805;
        Activity activity0 = ((CLS219)ᐧˏ0).MTH3883();
        CLS1635 ﾞᵎ0 = new CLS1635(activity0);
        ᐧˏ0.FLD2476 = ﾞᵎ0;
        CLS1635 ﾞᵎ1 = CLS34.MTH1086(4100646797112562485L, ﾞᵎ0, activity0);
        ᐧˏ0.FLD2477 = ﾞᵎ1;
        CLS1635 ﾞᵎ2 = CLS34.MTH1086(0x38E86C902B3CD335L, ﾞᵎ1, activity0);
        ᐧˏ0.FLD2471 = ﾞᵎ2;
        CLS1635 ﾞᵎ3 = CLS34.MTH1086(4100646848652170037L, ﾞᵎ2, activity0);
        ᐧˏ0.FLD2458 = ﾞᵎ3;
        CLS1635 ﾞᵎ4 = CLS34.MTH1086(4100646874421973813L, ﾞᵎ3, activity0);
        ᐧˏ0.FLD2451 = ﾞᵎ4;
        CLS1635 ﾞᵎ5 = CLS34.MTH1086(4100646900191777589L, ﾞᵎ4, activity0);
        ᐧˏ0.FLD2483 = ﾞᵎ5;
        CLS1635 ﾞᵎ6 = CLS34.MTH1086(4100646925961581365L, ﾞᵎ5, activity0);
        ᐧˏ0.FLD2467 = ﾞᵎ6;
        CLS1635 ﾞᵎ7 = CLS34.MTH1086(4100646960321319733L, ﾞᵎ6, activity0);
        ᐧˏ0.FLD2481 = ﾞᵎ7;
        CLS1635 ﾞᵎ8 = CLS34.MTH1086(4100646986091123509L, ﾞᵎ7, activity0);
        ᐧˏ0.FLD2449 = ﾞᵎ8;
        CLS1635 ﾞᵎ9 = CLS34.MTH1086(4100647024745829173L, ﾞᵎ8, activity0);
        ᐧˏ0.FLD2462 = ﾞᵎ9;
        CLS1635 ﾞᵎ10 = CLS34.MTH1086(4100647621746283317L, ﾞᵎ9, activity0);
        ᐧˏ0.FLD2447 = ﾞᵎ10;
        CLS1635 ﾞᵎ11 = CLS34.MTH1086(4100647647516087093L, ﾞᵎ10, activity0);
        ᐧˏ0.FLD2474 = ﾞᵎ11;
        CLS1635 ﾞᵎ12 = CLS34.MTH1086(4100647694760727349L, ﾞᵎ11, activity0);
        ᐧˏ0.FLD2480 = ﾞᵎ12;
        CLS1635 ﾞᵎ13 = CLS34.MTH1086(4100647754890269493L, ﾞᵎ12, activity0);
        ᐧˏ0.FLD2452 = ﾞᵎ13;
        CLS1635 ﾞᵎ14 = CLS34.MTH1086(4100647797839942453L, ﾞᵎ13, activity0);
        ᐧˏ0.FLD2450 = ﾞᵎ14;
        CLS1635 ﾞᵎ15 = CLS34.MTH1086(4100647836494648117L, ﾞᵎ14, activity0);
        ᐧˏ0.FLD2455 = ﾞᵎ15;
        CLS1635 ﾞᵎ16 = CLS34.MTH1086(4100647329688507189L, ﾞᵎ15, activity0);
        ᐧˏ0.FLD2469 = ﾞᵎ16;
        CLS1635 ﾞᵎ17 = CLS34.MTH1086(4100647364048245557L, ﾞᵎ16, activity0);
        ᐧˏ0.FLD2456 = ﾞᵎ17;
        CLS1635 ﾞᵎ18 = CLS34.MTH1086(4100647389818049333L, ﾞᵎ17, activity0);
        ᐧˏ0.FLD2468 = ﾞᵎ18;
        CLS1635 ﾞᵎ19 = CLS34.MTH1086(4100647419882820405L, ﾞᵎ18, activity0);
        ᐧˏ0.FLD2473 = ﾞᵎ19;
        CLS1635 ﾞᵎ20 = CLS34.MTH1086(4100647467127460661L, ﾞᵎ19, activity0);
        ᐧˏ0.FLD2461 = ﾞᵎ20;
        ﾞᵎ20.MTH800(CLS27.MTH889("anymsg"));
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add("");
        for(Object object0: ᐧˏ0.FLD2482) {
            JSONObject jSONObject0 = (JSONObject)object0;
            try {
                arrayList0.add(jSONObject0.getString("n"));
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        CLS1620 ˊˏ0 = new CLS1620(activity0);
        ˊˏ0.MTH7248(((CLS533)new CLS1198(ᐧˏ0, 5)));
        ˊˏ0.MTH7247(arrayList0);
        CLS1623 יᐧ0 = new CLS1623(activity0);
        יᐧ0.MTH7296(ᐧˏ0.FLD2476);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), CLS523.MTH7137(10));
        CLS523.MTH7147(linearLayout0, ((CLS18)ˊˏ0), true);
        CLS1623 יᐧ1 = new CLS1623(activity0);
        יᐧ1.MTH800(CLS27.MTH889("types"));
        CLS182.MTH3498(יᐧ1, new Object[]{ᐧˏ0.FLD2477, ᐧˏ0.FLD2471, ᐧˏ0.FLD2458, ᐧˏ0.FLD2451, ᐧˏ0.FLD2483, ᐧˏ0.FLD2467, ᐧˏ0.FLD2481, ᐧˏ0.FLD2449, ᐧˏ0.FLD2462, ᐧˏ0.FLD2447, ᐧˏ0.FLD2474, ᐧˏ0.FLD2480, ᐧˏ0.FLD2452, ᐧˏ0.FLD2450, ᐧˏ0.FLD2455, ᐧˏ0.FLD2469, ᐧˏ0.FLD2456, ᐧˏ0.FLD2468, ᐧˏ0.FLD2473, ᐧˏ0.FLD2461}, 10, linearLayout0, יᐧ1);
        ᐧˏ0.FLD2478 = null;
        CLS1625 ـˏ0 = new CLS1625(activity0);
        ᐧˏ0.FLD2479 = ـˏ0;
        ـˏ0.MTH800(CLS27.MTH889("members"));
        ᐧˏ0.FLD2479.MTH7320(new CLS192(ᐧˏ0, 2));
        CLS523.MTH7147(linearLayout0, ((CLS18)ᐧˏ0.FLD2479), true);
    }
}


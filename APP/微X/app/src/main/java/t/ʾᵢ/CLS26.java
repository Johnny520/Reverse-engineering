// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS55.CLS53;
import t.ˆʿ.CLS55.CLS54;
import t.ˆٴ.CLS73;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS137.CLS136;
import t.ᵔʾ.CLS137;
import t.ⁱʾ.CLS141;
import t.ⁱʾ.CLS143;

public final class CLS26 implements View.OnClickListener {
    public final int FLD372;
    public final CLS216 FLD373;

    public CLS26(CLS216 ˎﾞ0, int v) {
        this.FLD372 = v;
        this.FLD373 = ˎﾞ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS216 ˎﾞ0 = this.FLD373;
        switch(this.FLD372) {
            case 0: {
                if(!ˎﾞ0.MTH1137()) {
                    CLS189 ʾˈ0 = new CLS189(ˎﾞ0, 6);
                    CLS137.FLD972.MTH2141(((CLS136)ʾˈ0));
                }
                return;
            }
            case 1: {
                ˎﾞ0.getClass();
                String s = CLS133.MTH2099("set_auto_change_theme_time");
                ArrayList arrayList0 = new ArrayList();
                Activity activity0 = ((CLS10)ˎﾞ0).MTH1048();
                ArrayList arrayList1 = new ArrayList();
                try {
                    JSONArray jSONArray0 = new JSONArray();
                    JSONArray jSONArray1 = ˎﾞ0.FLD135.MTH2135("theme_change_time", jSONArray0);
                    for(int v = 0; v < jSONArray1.length(); ++v) {
                        arrayList0.add(jSONArray1.getJSONObject(v));
                    }
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
                CLS73 ﾞᐧ0 = new CLS73(activity0);
                CLS267 ﾞᐧ1 = new CLS267(arrayList1, arrayList0, ﾞᐧ0, 1);
                ﾞᐧ0.MTH1565(arrayList1);
                ﾞᐧ1.MTH2169();
                CLS43.MTH1426(activity0, s, ((CLS54)new CLS191(ˎﾞ0, activity0, ﾞᐧ0, arrayList0, ﾞᐧ1, arrayList1)), ((CLS53)new CLS191(ˎﾞ0, arrayList0, ((CLS143)ﾞᐧ1), activity0, arrayList1, ﾞᐧ0, 2)), ((CLS141)new CLS203(ˎﾞ0, arrayList0)));
                return;
            }
            case 2: {
                if(ˎﾞ0.FLD236 != null) {
                    Activity activity1 = ((CLS10)ˎﾞ0).MTH1048();
                    CLS43.MTH1435(activity1, CLS133.MTH2099("set_background_color"), new CLS200(ˎﾞ0, activity1, 1));
                }
                return;
            }
            case 3: {
                if(ˎﾞ0.FLD236 != null) {
                    Activity activity2 = ((CLS10)ˎﾞ0).MTH1048();
                    CLS43.MTH1435(activity2, CLS133.MTH2099("set_background"), new CLS200(ˎﾞ0, activity2, 3));
                }
                return;
            }
            case 4: {
                if(ˎﾞ0.FLD236 != null) {
                    Object[] arr_object1 = {new CLS237(ˎﾞ0), ˎﾞ0.FLD236.MTH1826(ˎﾞ0.FLD236.MTH1804("FloatingActionMenuIcon", ""))};
                    CLS123.FLD912.MTH1999("themes_selectImg2", arr_object1);
                }
                return;
            }
            case 5: {
                if(ˎﾞ0.FLD236 != null) {
                    String s1 = CLS133.MTH2099("addMenuButton");
                    ArrayList arrayList2 = new ArrayList(ˎﾞ0.FLD236.FLD767);
                    Activity activity3 = ((CLS10)ˎﾞ0).MTH1048();
                    ArrayList arrayList3 = new ArrayList();
                    CLS73 ﾞᐧ2 = new CLS73(activity3);
                    CLS199 ˊˏ0 = new CLS199(ˎﾞ0, arrayList3, arrayList2, ﾞᐧ2, 0);
                    CLS239 ᐧי0 = new CLS239(arrayList2, ((CLS143)new CLS187(arrayList2, ˊˏ0, 0)), 1);
                    ﾞᐧ2.MTH1565(arrayList3);
                    ˊˏ0.MTH2169();
                    CLS43.MTH1426(activity3, s1, ((CLS54)new CLS268(ˎﾞ0, activity3, ﾞᐧ2, arrayList2, ˊˏ0, arrayList3, ᐧי0, 0)), ((CLS53)new CLS191(ˎﾞ0, arrayList2, ((CLS143)ˊˏ0), activity3, arrayList3, ﾞᐧ2, 3)), ((CLS141)new CLS251(ˎﾞ0, arrayList2)));
                }
                return;
            }
            case 6: {
                if(ˎﾞ0.FLD236 != null) {
                    String s2 = CLS133.MTH2099("add_drawer_items");
                    ArrayList arrayList4 = new ArrayList(ˎﾞ0.FLD236.FLD770);
                    Activity activity4 = ((CLS10)ˎﾞ0).MTH1048();
                    ArrayList arrayList5 = new ArrayList();
                    CLS73 ﾞᐧ3 = new CLS73(activity4);
                    CLS199 ˊˏ1 = new CLS199(ˎﾞ0, arrayList5, arrayList4, ﾞᐧ3, 1);
                    CLS239 ᐧי1 = new CLS239(arrayList4, ((CLS143)new CLS187(arrayList4, ˊˏ1, 1)), 2);
                    ﾞᐧ3.MTH1565(arrayList5);
                    ˊˏ1.MTH2169();
                    CLS43.MTH1426(activity4, s2, ((CLS54)new CLS268(ˎﾞ0, activity4, ﾞᐧ3, arrayList4, ˊˏ1, arrayList5, ᐧי1, 1)), ((CLS53)new CLS191(ˎﾞ0, arrayList4, ((CLS143)ˊˏ1), activity4, arrayList5, ﾞᐧ3, 5)), ((CLS141)new CLS195(ˎﾞ0, arrayList4)));
                }
                return;
            }
            case 7: {
                ˎﾞ0.getClass();
                try {
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("p1", "drawer_bg_whole.png");
                    jSONObject0.put("p2", ˎﾞ0.FLD236.MTH1796("drawer_bg_whole.png"));
                    jSONObject0.put("p3", jSONObject0.getString("p2"));
                    jSONObject0.put("a", ˎﾞ0.FLD236.MTH1817(0xFF, "DrawerWholeAlpha"));
                    jSONObject0.put("b", ˎﾞ0.FLD236.MTH1817(0, "DrawerWholeBgBlur"));
                    jSONObject0.put("c", ˎﾞ0.FLD236.MTH1804("DrawerWholeOverlay", "#00FFFFFF"));
                    ˎﾞ0.MTH1135(jSONObject0, CLS133.MTH2099("set_drawer_whole_bg"), new CLS227(ˎﾞ0, jSONObject0, 2));
                }
                catch(Throwable throwable1) {
                    CLS133.MTH2113(throwable1);
                }
                return;
            }
            case 8: {
                ˎﾞ0.getClass();
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("p1", "drawer_header.png");
                    jSONObject1.put("p2", ˎﾞ0.FLD236.MTH1796("drawer_header.png"));
                    jSONObject1.put("p3", jSONObject1.getString("p2"));
                    jSONObject1.put("a", ˎﾞ0.FLD236.MTH1817(0xFF, "DrawerHeaderBgAlpha"));
                    jSONObject1.put("b", ˎﾞ0.FLD236.MTH1817(0, "DrawerHeaderBgBlur"));
                    jSONObject1.put("c", ˎﾞ0.FLD236.MTH1804("DrawerHeaderOverlay", "#00FFFFFF"));
                    ˎﾞ0.MTH1135(jSONObject1, CLS133.MTH2099("set_drawer_header_bg"), new CLS227(ˎﾞ0, jSONObject1, 0));
                }
                catch(Throwable throwable2) {
                    CLS133.MTH2113(throwable2);
                }
                return;
            }
            case 9: {
                ˎﾞ0.getClass();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("p1", "drawer_bg.png");
                    jSONObject2.put("p2", ˎﾞ0.FLD236.MTH1796("drawer_bg.png"));
                    jSONObject2.put("p3", jSONObject2.getString("p2"));
                    jSONObject2.put("a", ˎﾞ0.FLD236.MTH1817(0xFF, "DrawerListBgAlpha"));
                    jSONObject2.put("b", ˎﾞ0.FLD236.MTH1817(0, "DrawerListBgBlur"));
                    jSONObject2.put("c", ˎﾞ0.FLD236.MTH1804("DrawerListOverlay", "#00FFFFFF"));
                    ˎﾞ0.MTH1135(jSONObject2, CLS133.MTH2099("set_drawer_bg"), new CLS227(ˎﾞ0, jSONObject2, 1));
                }
                catch(Throwable throwable3) {
                    CLS133.MTH2113(throwable3);
                }
                return;
            }
            case 10: {
                if(ˎﾞ0.FLD236 != null) {
                    Object[] arr_object2 = {new CLS260(ˎﾞ0), ˎﾞ0.FLD236.MTH1826(ˎﾞ0.FLD236.MTH1804("RecentChatFloatingActionMenuIcon", ""))};
                    CLS123.FLD912.MTH1999("themes_selectImg2", arr_object2);
                }
                return;
            }
            case 11: {
                if(ˎﾞ0.FLD236 != null) {
                    Activity activity5 = ((CLS10)ˎﾞ0).MTH1048();
                    CLS43.MTH1435(activity5, CLS133.MTH2099("modify_chatfooter"), new CLS200(ˎﾞ0, activity5, 7));
                }
                return;
            }
            case 12: {
                ˎﾞ0.getClass();
                Object[] arr_object3 = {new CLS218(ˎﾞ0), ˎﾞ0.FLD236.MTH1796("left_bubble.9.png")};
                CLS123.FLD912.MTH1999("themes_selectImg2", arr_object3);
                return;
            }
            case 13: {
                ˎﾞ0.getClass();
                Object[] arr_object4 = {new CLS192(ˎﾞ0), ˎﾞ0.FLD236.MTH1796("right_bubble.9.png")};
                CLS123.FLD912.MTH1999("themes_selectImg2", arr_object4);
                return;
            }
            case 14: {
                ˎﾞ0.getClass();
                Object[] arr_object5 = {new CLS241(ˎﾞ0), ˎﾞ0.FLD236.MTH1826("TabLayoutWechatIcon.png")};
                CLS123.FLD912.MTH1999("themes_selectImg2", arr_object5);
                return;
            }
            case 15: {
                ˎﾞ0.getClass();
                Object[] arr_object6 = {new CLS257(ˎﾞ0), ˎﾞ0.FLD236.MTH1826("TabLayoutContactsIcon.png")};
                CLS123.FLD912.MTH1999("themes_selectImg2", arr_object6);
                return;
            }
            case 16: {
                ˎﾞ0.getClass();
                Object[] arr_object7 = {new CLS190(ˎﾞ0), ˎﾞ0.FLD236.MTH1826("TabLayoutDiscoverIcon.png")};
                CLS123.FLD912.MTH1999("themes_selectImg2", arr_object7);
                return;
            }
            case 17: {
                ˎﾞ0.getClass();
                Object[] arr_object8 = {new CLS248(ˎﾞ0), ˎﾞ0.FLD236.MTH1826("TabLayoutMeIcon.png")};
                CLS123.FLD912.MTH1999("themes_selectImg2", arr_object8);
                return;
            }
            case 18: {
                ˎﾞ0.getClass();
                Object[] arr_object9 = {new CLS220(ˎﾞ0), ˎﾞ0.FLD236.MTH1826("chatfooter_mic.png")};
                CLS123.FLD912.MTH1999("themes_selectImg2", arr_object9);
                return;
            }
            case 19: {
                ˎﾞ0.getClass();
                Object[] arr_object10 = {new CLS240(ˎﾞ0), ˎﾞ0.FLD236.MTH1826("chatfooter_smiley.png")};
                CLS123.FLD912.MTH1999("themes_selectImg2", arr_object10);
                return;
            }
            case 20: {
                ˎﾞ0.getClass();
                Object[] arr_object11 = {new CLS263(ˎﾞ0), ˎﾞ0.FLD236.MTH1826("chatfooter_keyboard.png")};
                CLS123.FLD912.MTH1999("themes_selectImg2", arr_object11);
                return;
            }
            case 21: {
                ˎﾞ0.getClass();
                Object[] arr_object12 = {new CLS223(ˎﾞ0), ˎﾞ0.FLD236.MTH1826("chatfooter_plus.png")};
                CLS123.FLD912.MTH1999("themes_selectImg2", arr_object12);
                return;
            }
            case 22: {
                ˎﾞ0.getClass();
                Object[] arr_object13 = {new CLS233(ˎﾞ0), ˎﾞ0.FLD236.MTH1826("chatfooter_send.png")};
                CLS123.FLD912.MTH1999("themes_selectImg2", arr_object13);
                return;
            }
            default: {
                ˎﾞ0.getClass();
                Object[] arr_object = {new CLS219(ˎﾞ0), ˎﾞ0.FLD236.MTH1796("chatfooter_edit_bg.png")};
                CLS123.FLD912.MTH1999("themes_selectImg2", arr_object);
            }
        }
    }
}


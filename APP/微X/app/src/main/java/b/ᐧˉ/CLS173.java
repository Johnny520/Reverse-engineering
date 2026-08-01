// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS61;
import b.ˈˈ.CLS78;
import b.ᵔʾ.CLS1255;
import b.ᵔʾ.CLS298;
import b.ⁱʾ.CLS347;
import b.ⁱʾ.CLS363;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS1275;
import b.ⁱᵔ.CLS1359;
import b.ⁱᵔ.CLS1427;
import b.ⁱᵔ.CLS1436;
import b.ⁱᵔ.CLS1530;
import b.ⁱᵔ.CLS1562;
import b.ⁱᵔ.CLS1564;
import b.ⁱᵔ.CLS1573;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS403;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS443;
import b.ⁱᵔ.CLS462;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS528;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS173 implements View.OnClickListener {
    public final int FLD1665;
    public final Activity FLD1666;

    public CLS173(Activity activity0, int v) {
        this.FLD1665 = v;
        this.FLD1666 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.FLD1666;
        switch(this.FLD1665) {
            case 0: {
                CLS403.MTH5870(activity0, null, null, null, true);
                return;
            }
            case 1: {
                CLS395.MTH5744(true, activity0, CLS371.FLD3470.MTH5377(), null);
                return;
            }
            case 2: {
                CLS395.MTH5738(activity0, true);
                return;
            }
            case 3: {
                CLS395.MTH5734(activity0, true);
                return;
            }
            case 4: {
                ArrayList arrayList0 = new ArrayList();
                String s = CLS27.MTH895().MTH925("hidden_chat_menu_items", "");
                if(!TextUtils.isEmpty(s)) {
                    arrayList0.addAll(Arrays.asList(s.split(",")));
                }
                CLS369 ﾞᵎ0 = new CLS369(activity0, arrayList0);
                CLS523.MTH7162(true, activity0, CLS27.MTH889("manage_chat_menus"), ((CLS379)new CLS1564(activity0, arrayList0, 0, ﾞᵎ0)), ((CLS378)new CLS1564(activity0, arrayList0, ﾞᵎ0)), null);
                return;
            }
            case 5: {
                CLS403.MTH5872(true, activity0, new ArrayList(), null);
                return;
            }
            case 6: {
                if(CLS500.FLD4928.MTH6895("chatroom_send_multi_invites")) {
                    ArrayList arrayList1 = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    String s1 = CLS27.MTH904();
                    CLS371.FLD3470.MTH5381(s1, arrayList1);
                    CLS371.FLD3470.MTH5330(arrayList2);
                    for(Object object0: arrayList2) {
                        ((CLS78)object0).FLD275 = " (" + CLS371.FLD3470.MTH5369("") + ")";
                    }
                    CLS387.MTH5585(true, activity0, arrayList1, ((CLS2)new CLS1573(activity0, arrayList2)), null, -1);
                }
                return;
            }
            case 7: {
                JSONObject jSONObject0 = CLS27.MTH895().MTH921("invite_key_tags");
                ArrayList arrayList3 = new ArrayList();
                Iterator iterator1 = jSONObject0.keys();
                while(iterator1.hasNext()) {
                    Object object1 = iterator1.next();
                    arrayList3.add(((String)object1));
                }
                CLS369 ﾞᵎ1 = new CLS369(activity0, arrayList3);
                CLS523.MTH7162(true, activity0, CLS27.MTH889("invite_key_tags"), ((CLS379)new CLS1564(activity0, arrayList3, 2, ﾞᵎ1)), ((CLS378)new CLS1564(arrayList3, ﾞᵎ1, activity0)), null);
                return;
            }
            case 8: {
                String s2 = CLS27.MTH889("permaban");
                ArrayList arrayList4 = new ArrayList();
                CLS523.MTH7160(activity0, s2, ((CLS17)new CLS1562(arrayList4, activity0, 2)), ((CLS11)new CLS1427(arrayList4)));
                return;
            }
            case 9: {
                ArrayList arrayList5 = new ArrayList();
                CLS371.FLD3470.MTH5330(arrayList5);
                CLS61 ﾞٴ0 = (CLS61)CLS40.FLD157.MTH1118(CLS61.class);
                CLS1624 יﹳ0 = new CLS1624(activity0);
                CLS363 ﾞٴ1 = new CLS363(activity0, arrayList5, יﹳ0);
                CLS523.MTH7153(activity0, CLS27.MTH889("duplicate_members"), ((CLS379)new CLS1156(יﹳ0, ﾞٴ1, 26)), ((CLS11)new CLS1275(ﾞٴ1, ﾞٴ0, activity0)));
                return;
            }
            case 10: {
                if(!CLS412.MTH6002() && !CLS27.MTH895().MTH938("add_contacts_warn_disable", false)) {
                    CLS395.MTH5745(activity0, null, CLS27.MTH889("add_contacts_disclaimer"), "add_contacts_warn_disable");
                }
                return;
            }
            case 11: {
                CLS387.MTH5593(activity0, ((CLS12)new CLS1191(0)));
                return;
            }
            case 12: {
                try {
                    Intent intent0 = new Intent();
                    intent0.putExtra("map_view_type", 8);
                    intent0.setClassName(activity0, CLS27.MTH897("RedirectUI"));
                    activity0.startActivityForResult(intent0, 0x202);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 13: {
                CLS462.MTH6488(true, activity0, null);
                return;
            }
            case 14: {
                CLS443.MTH6308(activity0, null);
                return;
            }
            case 15: {
                JSONArray jSONArray0 = CLS27.MTH895().MTH937("actionbar_items", new JSONArray());
                ArrayList arrayList6 = new ArrayList();
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    try {
                        JSONObject jSONObject1 = jSONArray0.getJSONObject(v);
                        String s3 = jSONObject1.getString("name");
                        String s4 = jSONObject1.optString("label");
                        String s5 = jSONObject1.optString("cls");
                        CLS528 ʽי0 = new CLS528();
                        ʽי0.FLD5165 = s3.equals("wexposed") ? CLS27.MTH889("appname") : CLS27.MTH889(s3);
                        ʽי0.FLD5168 = s3;
                        ʽי0.FLD5166 = s4;
                        ʽי0.FLD5167 = s5;
                        arrayList6.add("");
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                }
                CLS347 ᐧי0 = new CLS347(activity0, arrayList6);
                CLS523.MTH7162(true, activity0, CLS27.MTH889("add_actionbar_items"), ((CLS379)new CLS1530(activity0, ᐧי0, arrayList6)), ((CLS378)new CLS1530(activity0, arrayList6, ᐧי0)), ((CLS11)new CLS1359(arrayList6)));
                return;
            }
            case 16: {
                ArrayList arrayList7 = new ArrayList();
                CLS523.MTH7153(activity0, CLS27.MTH889("manage_wxid_module_load"), ((CLS379)new CLS1562(activity0, arrayList7, 0)), ((CLS11)new CLS1436(arrayList7)));
                return;
            }
            case 17: {
                CLS395.MTH5743(activity0, true);
                return;
            }
            case 18: {
                CLS395.MTH5741(activity0, true);
                return;
            }
            case 19: {
                try {
                    Intent intent1 = new Intent();
                    intent1.putExtra("map_view_type", 8);
                    intent1.setClassName(activity0, CLS27.MTH897("RedirectUI"));
                    activity0.startActivityForResult(intent1, 0x200);
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 20: {
                CLS443.MTH6315(activity0);
                return;
            }
            case 21: {
                CLS443.MTH6310(true, activity0, null, null);
                return;
            }
            case 22: {
                CLS443.MTH6313(activity0);
                return;
            }
            case 23: {
                CLS443.MTH6312(activity0, true);
                return;
            }
            case 24: {
                CLS21.FLD76.MTH817("mf", "showMassForwardSnsItemsDialog", new Object[]{activity0});
                return;
            }
            case 25: {
                CLS298.FLD3104.MTH4848(activity0, 0L);
                return;
            }
            case 26: {
                CLS298.FLD3104.getClass();
                CLS523.MTH7150(activity0, CLS27.MTH889("mass_repeat_sns_list"), ((CLS17)new CLS1255(CLS298.FLD3104, activity0, 0)));
                return;
            }
            case 27: {
                CLS443.MTH6314(activity0);
                return;
            }
            default: {
                CLS395.MTH5737(activity0, "auto_like_timeframe");
            }
        }
    }
}


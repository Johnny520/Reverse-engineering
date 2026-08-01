// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ˆʿ.CLS44;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS91;
import b.ˑٴ.CLS116;
import b.ⁱʾ.CLS356;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS442.CLS441;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS525;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1055 implements CLS378, CLS379, CLS441, CLS539 {
    public final CLS244 FLD2253;
    public final Activity FLD2254;

    public CLS1055(CLS244 ᴵʻ0, Activity activity0) {
        this.FLD2253 = ᴵʻ0;
        this.FLD2254 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        CLS244 ᴵʻ0 = this.FLD2253;
        ᴵʻ0.getClass();
        ʻˑ0.MTH7187("delete_all", ((CLS3)new CLS991(ᴵʻ0, this.FLD2254, 0)));
        if(ᴵʻ0.FLD2538.MTH6895("f_autoreply_export")) {
            ʻˑ0.MTH7187("export_", ((CLS3)new CLS1133(ᴵʻ0, 0)));
            ʻˑ0.MTH7187("import_", ((CLS3)new CLS1133(ᴵʻ0, 1)));
        }
        ʻˑ0.MTH7187("add_response", ((CLS3)new CLS1133(ᴵʻ0, 2)));
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        CLS244 ᴵʻ0 = this.FLD2253;
        if(((CLS502.MTH6934(ᴵʻ0.FLD2542, new String[]{"_REDPACKETS_"}) || CLS502.MTH6934(ᴵʻ0.FLD2542, new String[]{"_MONEYTRANSFER_"})) && ᴵʻ0.FLD2538.MTH6895("rp_keyword") || !ᴵʻ0.FLD2544) && (s.equals("#chatroom") || s.endsWith("|#chatroom") || s.endsWith("#chatroom "))) {
            ArrayList arrayList0 = new ArrayList();
            ᴵʻ0.FLD2541.MTH5313(ᴵʻ0.FLD2546, arrayList0);
            HashSet hashSet0 = new HashSet();
            ArrayList arrayList1 = new ArrayList();
            for(Object object0: arrayList0) {
                CLS78 ˊﾞ0 = (CLS78)object0;
                if(!hashSet0.contains("") && !CLS502.MTH6934(s, new String[]{""})) {
                    hashSet0.add("");
                    arrayList1.add(ˊﾞ0);
                }
            }
            CLS372.MTH5405(arrayList1);
            CLS1044 ˑˈ0 = new CLS1044(ᴵʻ0, s);
            CLS387.MTH5600(true, this.FLD2254, arrayList1, ((CLS2)ˑˈ0));
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS442$CLS441
    public final void MTH6222(InputStream inputStream0) {
        CLS44 ˆٴ0;
        Activity activity0 = this.FLD2254;
        CLS244 ᴵʻ0 = this.FLD2253;
        ᴵʻ0.getClass();
        try {
            String s = CLS31.MTH998(inputStream0);
            if(TextUtils.isEmpty(s)) {
                return;
            }
            else {
                try {
                    JSONObject jSONObject0 = new JSONObject(s);
                    if(jSONObject0.has("wx_autoresponse")) {
                        JSONArray jSONArray0 = jSONObject0.getJSONArray("wx_autoresponse");
                        try {
                            for(int v = 0; true; ++v) {
                                int v1 = jSONArray0.length();
                                ˆٴ0 = ᴵʻ0.FLD2536;
                                if(v >= v1) {
                                    break;
                                }
                                CLS91 ᵔʾ0 = new CLS91(jSONArray0.getJSONObject(v));
                                if(!TextUtils.isEmpty(ᵔʾ0.MTH1736())) {
                                    ᵔʾ0.FLD384 = ᴵʻ0.FLD2542;
                                    ˆٴ0.MTH1182(ᵔʾ0);
                                }
                            }
                            ᴵʻ0.FLD2545.clear();
                            ᴵʻ0.FLD2545.addAll(ˆٴ0.MTH1178(ᴵʻ0.FLD2542));
                            ᴵʻ0.FLD2543.notifyDataSetChanged();
                        }
                        catch(Throwable throwable2) {
                            CLS27.MTH893(throwable2);
                        }
                        CLS412.MTH6013(activity0, CLS27.MTH889("import_done"));
                        return;
                    }
                    return;
                }
                catch(Throwable throwable1) {
                }
            }
            CLS27.MTH893(throwable1);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        CLS244 ᴵʻ0 = this.FLD2253;
        ᴵʻ0.getClass();
        Activity activity0 = this.FLD2254;
        CLS1635 ﾞᵎ0 = new CLS1635(activity0);
        ﾞᵎ0.MTH800(CLS27.MTH889("autoresponse_keywords_enable"));
        ﾞᵎ0.MTH7438(new CLS180(ᴵʻ0, 0));
        CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ0), true);
        boolean z = ᴵʻ0.FLD2538.MTH6895("autoreply_id");
        CLS29 ˎᵢ0 = ᴵʻ0.FLD2552;
        if(z) {
            CLS1622 ˑٴ0 = new CLS1622(activity0);
            ˑٴ0.FLD5256 = CLS182.MTH3469(4100637764796338997L, ˑٴ0, 4100637812040979253L);
            ˑٴ0.MTH7277(ˎᵢ0.MTH925("autoreply_members", ""));
            ˑٴ0.FLD5252 = new CLS939(ᴵʻ0, 0);
            CLS523.MTH7147(linearLayout0, ((CLS18)ˑٴ0), true);
        }
        CLS1624 יﹳ0 = new CLS1624(activity0);
        יﹳ0.FLD5274 = new CLS939(ᴵʻ0, 1);
        יﹳ0.MTH7302();
        יﹳ0.MTH7311();
        ﾞᵎ0.MTH7437(ˎᵢ0.MTH938((TextUtils.isEmpty(ᴵʻ0.FLD2542) ? "autoresponse_keywords_enable" : ᴵʻ0.FLD2542 + "_" + "autoresponse_keywords_enable"), false));
        CLS44 ˆٴ0 = ᴵʻ0.FLD2536;
        ᴵʻ0.FLD2545 = ˆٴ0.MTH1178(ᴵʻ0.FLD2542);
        if(!ᴵʻ0.FLD2544 && ˎᵢ0.MTH938(ᴵʻ0.FLD2542 + "_inherit_general", false)) {
            ᴵʻ0.FLD2545.addAll(ˆٴ0.MTH1178("_ANY_"));
        }
        CLS356 ⁱʾ0 = new CLS356(activity0, ᴵʻ0.FLD2545);
        ᴵʻ0.FLD2543 = ⁱʾ0;
        יﹳ0.MTH7303(ⁱʾ0);
        יﹳ0.MTH7308(5);
        יﹳ0.MTH7301(new CLS249(1, ᴵʻ0));
        יﹳ0.MTH7305(new CLS116(2, ᴵʻ0));
        CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
    }
}


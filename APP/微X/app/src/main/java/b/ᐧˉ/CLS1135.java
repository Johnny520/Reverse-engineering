// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS91;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS442.CLS441;
import b.ⁱᵔ.CLS502;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS525;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1135 implements CLS378, CLS441, CLS539 {
    public final CLS210 FLD2567;
    public final Activity FLD2568;

    public CLS1135(CLS210 ˋʼ0, Activity activity0) {
        this.FLD2567 = ˋʼ0;
        this.FLD2568 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        CLS1084 ـᵢ0;
        String s;
        CLS210 ˋʼ0 = this.FLD2567;
        ˋʼ0.getClass();
        ʻˑ0.MTH7187("delete_all", ((CLS3)new CLS1054(0, this.FLD2568, ˋʼ0)));
        if(ˋʼ0.FLD2011.MTH6895("f_autoreply_export")) {
            ʻˑ0.MTH7187("export_", ((CLS3)new CLS1084(ˋʼ0, 0)));
            ʻˑ0.MTH7187("import_", ((CLS3)new CLS1084(ˋʼ0, 1)));
        }
        if(CLS502.MTH6934(ˋʼ0.FLD1998, new String[]{"_tail"})) {
            s = "add";
            ـᵢ0 = new CLS1084(ˋʼ0, 2);
        }
        else {
            s = "add_response";
            ـᵢ0 = new CLS1084(ˋʼ0, 3);
        }
        ʻˑ0.MTH7187(s, ((CLS3)ـᵢ0));
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        CLS210 ˋʼ0 = this.FLD2567;
        if(((CLS502.MTH6934(ˋʼ0.FLD1998, new String[]{"_REDPACKETS_"}) || CLS502.MTH6934(ˋʼ0.FLD1998, new String[]{"_MONEYTRANSFER_"})) && ˋʼ0.FLD2011.MTH6895("rp_keyword") || !ˋʼ0.FLD2009) && (s.equals("#chatroom") || s.endsWith("|#chatroom") || s.endsWith("#chatroom "))) {
            ArrayList arrayList0 = new ArrayList();
            ˋʼ0.FLD2006.MTH5313(ˋʼ0.FLD2015, arrayList0);
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
            CLS971 ˈˋ0 = new CLS971(ˋʼ0, s);
            CLS387.MTH5600(true, this.FLD2568, arrayList1, ((CLS2)ˈˋ0));
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS442$CLS441
    public final void MTH6222(InputStream inputStream0) {
        Activity activity0 = this.FLD2568;
        CLS210 ˋʼ0 = this.FLD2567;
        ˋʼ0.getClass();
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
                            for(int v = 0; v < jSONArray0.length(); ++v) {
                                CLS91 ᵔʾ0 = new CLS91(jSONArray0.getJSONObject(v));
                                if(TextUtils.isEmpty(ᵔʾ0.MTH1736())) {
                                    ᵔʾ0.FLD384 = ˋʼ0.FLD1998;
                                    ˋʼ0.FLD2001.MTH1182(ᵔʾ0);
                                }
                            }
                            ˋʼ0.FLD2010.clear();
                            ˋʼ0.FLD2010.addAll(ˋʼ0.FLD2001.MTH1181(ˋʼ0.FLD1998));
                            ˋʼ0.FLD2020.notifyDataSetChanged();
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
}


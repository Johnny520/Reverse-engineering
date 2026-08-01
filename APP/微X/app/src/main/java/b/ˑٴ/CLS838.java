// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Toast;
import b.ʻˑ.CLS0;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS47;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS81;
import b.ˈˈ.CLS82;
import b.יᐧ.CLS151.CLS148;
import b.ـˏ.CLS169;
import b.ٴـ.CLS896.CLS170;
import b.ᐧˉ.CLS1049;
import b.ᐧˉ.CLS1062;
import b.ᐧˉ.CLS1115;
import b.ᐧˉ.CLS1141;
import b.ᐧˉ.CLS1182;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS210;
import b.ᐧˉ.CLS231;
import b.ᐧˉ.CLS241;
import b.ᐧˉ.CLS249;
import b.ᐧˉ.CLS948;
import b.ᐧˉ.CLS968;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS344;
import b.ⁱʾ.CLS369;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS1384;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS412.CLS411;
import b.ⁱᵔ.CLS432;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS491;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1617.CLS526;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1628;
import b.ﾞˎ.CLS1635;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;

public final class CLS838 implements CLS0, CLS16, CLS39, CLS148, CLS379, CLS411, CLS526 {
    public final int FLD1297;
    public final int FLD1298;
    public final Object FLD1299;
    public final Object FLD1300;

    public CLS838(Object object0, int v, Object object1, int v1) {
        this.FLD1297 = v1;
        this.FLD1300 = object0;
        this.FLD1298 = v;
        this.FLD1299 = object1;
        super();
    }

    public CLS838(Object object0, Object object1, int v, int v1) {
        this.FLD1297 = v1;
        this.FLD1300 = object0;
        this.FLD1299 = object1;
        this.FLD1298 = v;
        super();
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        int v = this.FLD1298;
        Object object0 = this.FLD1299;
        Object object1 = this.FLD1300;
        if(this.FLD1297 == 5) {
            Toast.makeText(((Context)object1), ((String)object0), v).show();
            return;
        }
        ((CLS1628)object1).MTH800(CLS481.MTH6693(v));
        ((SeekBar)object0).setProgress(v);
    }

    @Override  // b.ʻˑ.CLS0
    public final void MTH770(String s) {
        ArrayList arrayList0 = (ArrayList)this.FLD1299;
        int v = ((int[])this.FLD1300)[0];
        ((int[])this.FLD1300)[0] = v + 1;
        if(v == this.FLD1298) {
            CLS466.MTH6540(arrayList0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS412$CLS411
    public final void MTH5992(int v) {
        CLS1062 יٴ0 = (CLS1062)this.FLD1300;
        ArrayList arrayList0 = (ArrayList)this.FLD1299;
        יٴ0.getClass();
        if(v < arrayList0.size()) {
            File file0 = (File)arrayList0.get(v);
            String s = file0.getAbsolutePath();
            int v1 = file0.getName().lastIndexOf(".");
            String s1 = file0.getName();
            if(v1 != -1) {
                s1 = s1.substring(0, v1);
            }
            CLS81 יᐧ0 = new CLS81(CLS47.FLD167.MTH1197(), s1);
            יᐧ0.FLD305 = this.FLD1298;
            CLS47.FLD167.MTH1194(יᐧ0);
            CLS40 ﾞᵎ0 = CLS40.FLD157;
            ﾞᵎ0.MTH1116(((CLS39)new CLS1115(יٴ0, 5)));
            if(s.endsWith(".wav")) {
                ﾞᵎ0.MTH1124(((CLS39)new CLS1384(s, 0, 0, יᐧ0, ((CLS3)new CLS948(יٴ0, 3)), 1)));
                return;
            }
            if(CLS500.FLD4928.MTH6895("voice_manager") && (s.endsWith(".silk") || s.endsWith(".slk") || s.endsWith("amr"))) {
                ﾞᵎ0.MTH1124(((CLS39)new CLS1049(s, יᐧ0, new CLS1182(יٴ0, file0, יᐧ0, 1), 3)));
                return;
            }
            CLS491.MTH6815(0, 0, ((CLS3)new CLS948(יٴ0, 4)), יᐧ0, s);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1617$CLS526
    public final void MTH7191(LinearLayout linearLayout0) {
        JSONObject jSONObject0 = (JSONObject)this.FLD1300;
        Activity activity0 = (Activity)this.FLD1299;
        String s = "";
        if(jSONObject0.optBoolean("grab_red_packet_filter_onlyopen_enable", false)) {
            s = jSONObject0.optString("red_packet_filter_onlyopen_text", CLS370.MTH5289(4100561340148273973L));
        }
        else if(jSONObject0.optBoolean("grab_red_packet_filter_notopen_enable", false)) {
            s = jSONObject0.optString("red_packet_filter_text", CLS370.MTH5289(4100561056680432437L));
        }
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        ˑٴ0.MTH800(CLS27.MTH889("keyword"));
        ˑٴ0.MTH798(CLS27.MTH889("fill_in_filter_keywords_separate_using"));
        ˑٴ0.MTH7277(s);
        ˑٴ0.FLD5252 = new CLS1141(jSONObject0, 10);
        CLS1625 ـˏ0 = new CLS1625(activity0);
        ـˏ0.MTH800(CLS27.MTH889("add_keyword"));
        ـˏ0.MTH7320(new CLS241(activity0, jSONObject0, ˑٴ0));
        CLS1623 יᐧ0 = new CLS1623(activity0);
        יᐧ0.MTH7289(new Object[]{ـˏ0, ˑٴ0});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), this.FLD1298);
    }

    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        int v3;
        Object object0 = this.FLD1299;
        Object object1 = this.FLD1300;
        if(this.FLD1297 == 6) {
            CLS369 ﾞᵎ0 = (CLS369)object1;
            if(!TextUtils.isEmpty(s)) {
                int v = Integer.parseInt(s);
                ﾞᵎ0.getClass();
                int v1 = this.FLD1298;
                if(v1 != v - 1) {
                    try {
                        int v2 = Math.min(Math.max(0, v - 1), ﾞᵎ0.FLD3461.size() - 1);
                        String s1 = (String)ﾞᵎ0.getItem(v1);
                        ﾞᵎ0.FLD3461.remove(v1);
                        ﾞᵎ0.FLD3461.add(v2, s1);
                        ﾞᵎ0.notifyDataSetChanged();
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                ((CLS82)object0).getClass();
                if(v1 != v - 1) {
                    try {
                        v3 = Math.max(0, v - 1);
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                        return;
                    }
                    ArrayList arrayList0 = ((CLS82)object0).FLD313;
                    try {
                        JSONObject jSONObject0 = (JSONObject)arrayList0.get(v1);
                        arrayList0.remove(v1);
                        arrayList0.add(Math.min(v3, arrayList0.size() - 1), jSONObject0);
                        return;
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                }
            }
            return;
        }
        int v4 = this.FLD1298;
        if(!TextUtils.isEmpty(s)) {
            CLS432.MTH6173(s, ((CLS3)new CLS736(((ContentValues)object1), s, v4, ((CLS335)object0), 5)));
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.יᐧ.CLS151$CLS148
    public final void MTH3131(SparseArray sparseArray0) {
        CLS170 ˆٴ$ˆٴ1;
        ArrayList arrayList0 = (ArrayList)this.FLD1299;
        ((CLS614)this.FLD1300).getClass();
        int v = this.FLD1298;
        CLS629 ʻˋ0 = ((CLS614)this.FLD1300).FLD515;
        if(sparseArray0.size() > 1 && CLS27.MTH895().MTH938("mass_send_user_priority", false)) {
            int v1 = 0;
            for(Object object0: arrayList0) {
                CLS78 ˊﾞ0 = (CLS78)object0;
                for(int v2 = 0; v2 < sparseArray0.size(); ++v2) {
                    CLS169 ˆٴ0 = (CLS169)sparseArray0.get(sparseArray0.keyAt(v2));
                    if(ˆٴ0.MTH3228() != 13 || v == -1 || v1 <= v) {
                        CLS170 ˆٴ$ˆٴ0 = new CLS170(ˆٴ0, "");
                        ʻˋ0.FLD1447.MTH3029(ˆٴ$ˆٴ0);
                    }
                }
                ++v1;
            }
            return;
        }
        for(int v3 = 0; v3 < sparseArray0.size(); ++v3) {
            CLS169 ˆٴ1 = (CLS169)sparseArray0.get(sparseArray0.keyAt(v3));
            if(ˆٴ1.MTH3228() != 13 || v == -1 || arrayList0.size() <= v) {
                ˆٴ$ˆٴ1 = new CLS170(ˆٴ1, 2, arrayList0);
            }
            else {
                ArrayList arrayList1 = new ArrayList();
                for(int v4 = 0; v4 < v; ++v4) {
                    arrayList1.add(((CLS78)arrayList0.get(v4)));
                }
                ˆٴ$ˆٴ1 = new CLS170(ˆٴ1, 2, arrayList1);
            }
            ʻˋ0.FLD1447.MTH3029(ˆٴ$ˆٴ1);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        CLS210 ˋʼ0 = (CLS210)this.FLD1300;
        Activity activity0 = (Activity)this.FLD1299;
        ˋʼ0.getClass();
        CLS1626 ـﹳ0 = new CLS1626(activity0);
        ـﹳ0.FLD5295 = false;
        ـﹳ0.MTH798(CLS27.MTH889("autoresponse_multiple_random_warning"));
        CLS523.MTH7147(linearLayout0, ((CLS18)ـﹳ0), true);
        CLS29 ˎᵢ0 = ˋʼ0.FLD2017;
        if(ˋʼ0.FLD2014) {
            CLS1635 ﾞᵎ0 = new CLS1635(activity0);
            ﾞᵎ0.MTH800(CLS27.MTH889("reply_delay_enable"));
            ﾞᵎ0.MTH7437(ˎᵢ0.MTH938(ˋʼ0.FLD1998 + "_reply_delay_enable", false));
            ﾞᵎ0.MTH7438(new CLS231(ˋʼ0, 0));
            CLS1621 ˎᵢ1 = new CLS1621(activity0);
            ˎᵢ1.MTH800(CLS27.MTH889("delay"));
            ˎᵢ1.MTH7268(((long)ˎᵢ0.MTH927(5000, ˋʼ0.FLD1998 + "_reply_delay")));
            ˎᵢ1.FLD5242 = new CLS968(ˋʼ0, 0);
            CLS1623 יᐧ0 = new CLS1623(activity0);
            יᐧ0.MTH7289(new Object[]{ﾞᵎ0, ˎᵢ1});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), this.FLD1298);
        }
        CLS1624 יﹳ0 = new CLS1624(activity0);
        יﹳ0.MTH7311();
        ˋʼ0.FLD2010 = ˋʼ0.FLD2001.MTH1181(ˋʼ0.FLD1998);
        if(!CLS502.MTH6934(ˋʼ0.FLD1998, new String[]{"_REDPACKETS_"})) {
            if(!ˋʼ0.FLD1998.contains("_TYPE")) {
                if(!ˋʼ0.FLD1998.contains("_tail")) {
                    if(ˎᵢ0.MTH938(ˋʼ0.FLD1998 + "_inherit_general", false)) {
                        ˋʼ0.FLD2010.addAll(ˋʼ0.FLD2001.MTH1181(CLS370.MTH5289(4100604070777901877L)));
                    }
                }
                else if(ˎᵢ0.MTH938(ˋʼ0.FLD1998 + "_tail_inherit_general", false)) {
                    ˋʼ0.FLD2010.addAll(ˋʼ0.FLD2001.MTH1181(CLS370.MTH5289(4100603950518817589L)));
                }
            }
            else if(!ˋʼ0.FLD1998.startsWith("_TYPE") && CLS182.MTH3480(4100604281231299381L, CLS182.MTH3483(ˋʼ0.FLD1998.substring(0, ˋʼ0.FLD1998.indexOf("_TYPE"))), ˎᵢ0, false)) {
                ˋʼ0.FLD2010.addAll(ˋʼ0.FLD2001.MTH1181(ˋʼ0.FLD1998.substring(ˋʼ0.FLD1998.indexOf("_TYPE"))));
            }
        }
        else if(!ˋʼ0.FLD1998.startsWith("_REDPACKETS_") && CLS182.MTH3480(4100603525317055285L, CLS182.MTH3483(ˋʼ0.FLD1998.substring(0, ˋʼ0.FLD1998.indexOf("_REDPACKETS_"))), ˎᵢ0, false)) {
            ˋʼ0.FLD2010.addAll(ˋʼ0.FLD2001.MTH1181(CLS370.MTH5289(4100603598331499317L)));
        }
        CLS344 ٴـ0 = new CLS344(activity0, ˋʼ0.FLD2010);
        ˋʼ0.FLD2020 = ٴـ0;
        יﹳ0.MTH7303(ٴـ0);
        יﹳ0.MTH7308(5);
        יﹳ0.MTH7301(new CLS249(2, ˋʼ0));
        יﹳ0.MTH7305(new CLS116(3, ˋʼ0));
        CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
    }
}


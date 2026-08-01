// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;
import android.widget.Switch;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import t.ˆʿ.CLS277;
import t.ˆʿ.CLS28;
import t.ˆʿ.CLS34;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ˆʿ.CLS55.CLS53;
import t.ˆʿ.CLS55.CLS54;
import t.ˆʿ.CLS55;
import t.ˆٴ.CLS73;
import t.ˊﾞ.CLS102;
import t.ˊﾞ.CLS106;
import t.ٴـ.CLS117;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS125;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS304;
import t.ⁱʾ.CLS141;
import t.ⁱʾ.CLS142;
import t.ⁱʾ.CLS143;
import t.ⁱʾ.CLS145;
import t.ⁱʾ.CLS146;
import t.ⁱʾ.CLS147;
import t.ﾞٴ.CLS153;
import t.ﾞᐧ.CLS168;
import t.ﾞᐧ.CLS177.CLS176;
import t.ﾞᐧ.CLS181;
import t.ﾞᐧ.CLS332;
import t.ﾞᐧ.CLS333;
import t.ﾞᐧ.CLS335;
import t.ﾞᐧ.CLS337;
import t.ﾞᐧ.CLS338;
import t.ﾞᐧ.CLS339;
import t.ﾞᐧ.CLS344;
import t.ﾞᐧ.CLS345;

public final class CLS216 extends CLS10 {
    public CLS335 FLD235;
    public CLS102 FLD236;
    public CLS337 FLD237;
    public CLS168 FLD238;
    public CLS55 FLD239;
    public final SimpleDateFormat FLD240;

    // 此方法包含解密的字符串
    public CLS216(String s, String s1) {
        super(s, s1);
        this.FLD240 = new SimpleDateFormat("HH:mm");
    }

    // 此方法包含解密的字符串
    public final void MTH1134(Activity activity0, String s) {
        public final class CLS205 implements CLS141 {
            public final ArrayList FLD191;
            public final CLS73 FLD192;
            public final ArrayList FLD193;

            public CLS205(ArrayList arrayList0, ArrayList arrayList1, CLS73 ﾞᐧ0) {
                this.FLD193 = arrayList1;
                this.FLD192 = ﾞᐧ0;
                super();
            }

            @Override  // t.ⁱʾ.CLS141
            public final void MTH2165() {
            }

            @Override  // t.ⁱʾ.CLS141
            public final void MTH2166() {
                this.FLD191.clear();
                this.FLD193.clear();
                this.FLD192.notifyDataSetChanged();
            }
        }


        public final class CLS214 implements CLS141 {
            public final ArrayList FLD228;
            public final ArrayList FLD229;
            public final int FLD230;
            public final CLS73 FLD231;

            public CLS214(ArrayList arrayList0, int v, ArrayList arrayList1, CLS73 ﾞᐧ0) {
                this.FLD230 = v;
                this.FLD229 = arrayList1;
                this.FLD231 = ﾞᐧ0;
                super();
            }

            @Override  // t.ⁱʾ.CLS141
            public final void MTH2165() {
            }

            @Override  // t.ⁱʾ.CLS141
            public final void MTH2166() {
                this.FLD228.remove(this.FLD230);
                this.FLD229.remove(this.FLD230);
                this.FLD231.notifyDataSetChanged();
            }
        }


        public final class CLS215 implements CLS141 {
            public final ArrayList FLD232;
            public final CLS216 FLD233;
            public final String FLD234;

            public CLS215(ArrayList arrayList0, String s) {
                this.FLD232 = arrayList0;
                this.FLD234 = s;
                super();
            }

            @Override  // t.ⁱʾ.CLS141
            public final void MTH2165() {
            }

            @Override  // t.ⁱʾ.CLS141
            public final void MTH2166() {
                try {
                    JSONArray jSONArray0 = new JSONArray();
                    for(Object object0: this.FLD232) {
                        jSONArray0.put(((JSONObject)object0));
                    }
                    CLS216.this.FLD135.MTH2125(jSONArray0, this.FLD234);
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            }
        }

        String s1 = CLS133.MTH2099("random_chatting_bg");
        if(!TextUtils.isEmpty(s)) {
            s1 = s1 + " " + CLS34.FLD463.MTH1367(s);
        }
        String s2 = TextUtils.isEmpty(s) ? "rnd_bg" : "rnd_bg_" + s;
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        try {
            JSONArray jSONArray0 = new JSONArray();
            JSONArray jSONArray1 = this.FLD135.MTH2135(s2, jSONArray0);
            for(int v = 0; v < jSONArray1.length(); ++v) {
                arrayList0.add(jSONArray1.getJSONObject(v));
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        CLS73 ﾞᐧ0 = new CLS73(activity0);
        CLS267 ﾞᐧ1 = new CLS267(arrayList1, arrayList0, ﾞᐧ0, 0);
        ﾞᐧ0.MTH1565(arrayList1);
        ﾞᐧ1.MTH2169();
        CLS43.MTH1426(activity0, s1, ((CLS54)new CLS266(this, s, activity0, ﾞᐧ0, arrayList0, ﾞᐧ1, arrayList1)), ((CLS53)new CLS191(this, activity0, arrayList0, ﾞᐧ1, arrayList1, ﾞᐧ0, 0)), ((CLS141)new CLS215(this, arrayList0, s2)));
    }

    public final void MTH1135(JSONObject jSONObject0, String s, CLS227 יﹳ0) {
        Activity activity0 = ((CLS10)this).MTH1048();
        CLS256 ⁱˉ0 = new CLS256(this, activity0, jSONObject0, 1);
        CLS262 ﹶᴵ0 = new CLS262(יﹳ0, jSONObject0);
        CLS55 ⁱˉ1 = new CLS55(activity0, s);
        ⁱˉ1.FLD514 = ⁱˉ0;
        ⁱˉ1.FLD523 = null;
        ⁱˉ1.FLD515 = new CLS277(((CLS141)ﹶᴵ0), 0);
        ⁱˉ1.FLD513 = ﹶᴵ0;
        ⁱˉ1.show();
    }

    // 此方法包含解密的字符串
    public final void MTH1136(Activity activity0, String s, String s1) {
        public final class CLS209 implements CLS141 {
            public final ArrayList FLD213;
            public final CLS73 FLD214;
            public final ArrayList FLD215;
            public final CLS216 FLD216;

            public CLS209(ArrayList arrayList0, ArrayList arrayList1, CLS73 ﾞᐧ0) {
                this.FLD213 = arrayList0;
                this.FLD215 = arrayList1;
                this.FLD214 = ﾞᐧ0;
                super();
            }

            @Override  // t.ⁱʾ.CLS141
            public final void MTH2165() {
            }

            // 此方法包含解密的字符串
            @Override  // t.ⁱʾ.CLS141
            public final void MTH2166() {
                ArrayList arrayList0 = this.FLD213;
                for(Object object0: arrayList0) {
                    JSONObject jSONObject0 = (JSONObject)object0;
                    if(jSONObject0.has("p")) {
                        try {
                            String s = jSONObject0.getString("p");
                            CLS216.this.FLD236.MTH1802(s);
                        }
                        catch(Throwable throwable0) {
                            CLS133.MTH2113(throwable0);
                        }
                    }
                }
                this.FLD215.clear();
                arrayList0.clear();
                this.FLD214.notifyDataSetChanged();
            }
        }


        public final class CLS210 implements CLS141 {
            public final ArrayList FLD217;
            public final CLS216 FLD218;
            public final String FLD219;

            public CLS210(ArrayList arrayList0, String s) {
                this.FLD217 = arrayList0;
                this.FLD219 = s;
                super();
            }

            @Override  // t.ⁱʾ.CLS141
            public final void MTH2165() {
            }

            // 此方法包含解密的字符串
            @Override  // t.ⁱʾ.CLS141
            public final void MTH2166() {
                CLS216 ˎﾞ0;
                try {
                    JSONArray jSONArray0 = new JSONArray();
                    Iterator iterator0 = this.FLD217.iterator();
                    while(true) {
                        boolean z = iterator0.hasNext();
                        ˎﾞ0 = CLS216.this;
                        if(!z) {
                            break;
                        }
                        Object object0 = iterator0.next();
                        JSONObject jSONObject0 = (JSONObject)object0;
                        if(jSONObject0.has("p")) {
                            CLS102 יﹳ0 = ˎﾞ0.FLD236;
                            String s = jSONObject0.getString("p");
                            יﹳ0.getClass();
                            File file0 = new File(s);
                            String s1 = CLS125.MTH2023(file0) ? יﹳ0.MTH1808(file0.getName(), file0.getAbsolutePath()) : "";
                            if(!TextUtils.isEmpty(s1)) {
                                jSONObject0.put("p", s1);
                                jSONArray0.put(jSONObject0);
                            }
                        }
                    }
                    CLS102 יﹳ1 = ˎﾞ0.FLD236;
                    יﹳ1.getClass();
                    try {
                        יﹳ1.FLD772.put(this.FLD219, jSONArray0);
                    }
                    catch(Throwable throwable1) {
                        CLS133.MTH2113(throwable1);
                    }
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            }
        }


        public final class CLS213 implements CLS141 {
            public final ArrayList FLD223;
            public final CLS216 FLD224;
            public final ArrayList FLD225;
            public final int FLD226;
            public final CLS73 FLD227;

            public CLS213(ArrayList arrayList0, int v, ArrayList arrayList1, CLS73 ﾞᐧ0) {
                this.FLD223 = arrayList0;
                this.FLD226 = v;
                this.FLD225 = arrayList1;
                this.FLD227 = ﾞᐧ0;
                super();
            }

            @Override  // t.ⁱʾ.CLS141
            public final void MTH2165() {
            }

            // 此方法包含解密的字符串
            @Override  // t.ⁱʾ.CLS141
            public final void MTH2166() {
                ArrayList arrayList0 = this.FLD225;
                int v = this.FLD226;
                this.FLD223.remove(v);
                try {
                    JSONObject jSONObject0 = (JSONObject)arrayList0.get(v);
                    if(jSONObject0.has("p")) {
                        String s = jSONObject0.getString("p");
                        CLS216.this.FLD236.MTH1802(s);
                    }
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
                arrayList0.remove(v);
                this.FLD227.notifyDataSetChanged();
            }
        }

        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        JSONArray jSONArray0 = this.FLD236.MTH1812(s1, new JSONArray());
        for(int v = 0; v < jSONArray0.length(); ++v) {
            try {
                JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                if(jSONObject0.has("p")) {
                    jSONObject0.put("p", this.FLD236.MTH1796(jSONObject0.getString("p")));
                }
                arrayList0.add(jSONObject0);
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
        }
        CLS73 ﾞᐧ0 = new CLS73(activity0);
        CLS267 ﾞᐧ1 = new CLS267(arrayList1, arrayList0, ﾞᐧ0, 2);
        ﾞᐧ0.MTH1565(arrayList1);
        ﾞᐧ1.MTH2169();
        CLS43.MTH1426(activity0, s, ((CLS54)new CLS266(this, activity0, s1, ﾞᐧ0, arrayList0, ﾞᐧ1, arrayList1)), ((CLS53)new CLS191(this, activity0, arrayList0, ﾞᐧ1, arrayList1, ﾞᐧ0, 4)), ((CLS141)new CLS210(this, arrayList0, s1)));
    }

    // 此方法包含解密的字符串
    public final boolean MTH1137() {
        if(this.FLD236 != null) {
            ArrayList arrayList0 = this.FLD235.FLD1139.FLD1259;
            if(arrayList0 != null && !arrayList0.isEmpty()) {
                return false;
            }
        }
        this.FLD237.FLD1174.setTextColor(0xFFFF0000);
        CLS28.MTH1315(((CLS10)this).MTH1048(), CLS133.MTH2099("please_create_theme"));
        return true;
    }

    @Override  // t.ʾᵢ.CLS10
    public final void MTH1045(boolean z, boolean z1, String s) {
        public final class CLS211 implements CLS141 {
            public final CLS216 FLD220;

            @Override  // t.ⁱʾ.CLS141
            public final void MTH2165() {
            }

            // 去混淆评级： 低(26)
            // 此方法包含解密的字符串
            @Override  // t.ⁱʾ.CLS141
            public final void MTH2166() {
                CLS133.MTH2103().MTH2125(CLS216.this.FLD236.FLD773, "current_theme");
                CLS123.FLD912.MTH1999("apply_theme_no_settings", new Object[]{CLS216.this.FLD236.FLD773});
            }
        }

        HashSet hashSet0 = this.FLD140;
        if(z1) {
            hashSet0.clear();
        }
        Activity activity0 = ((CLS10)this).MTH1048();
        CLS55 ⁱˉ0 = new CLS55(activity0, this.FLD139);
        this.FLD239 = ⁱˉ0;
        ⁱˉ0.FLD523 = new CLS189(this, 5);
        ⁱˉ0.FLD514 = new CLS236(this, z, z1);
        ⁱˉ0.FLD515 = new CLS255(this, activity0, 0);
        ⁱˉ0.show();
        if(z1 && !TextUtils.isEmpty(s)) {
            for(Object object0: hashSet0) {
                CLS145 ٴـ0 = (CLS145)object0;
                if(ٴـ0.getText().equals(s)) {
                    ٴـ0.MTH2176();
                    return;
                }
                if(false) {
                    break;
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // t.ʾᵢ.CLS10
    public final void MTH1046(LinearLayout linearLayout0, boolean z, boolean z1) {
        CLS332 ʻᵎ10;
        CLS332 ʻᵎ9;
        Activity activity0 = ((CLS10)this).MTH1048();
        this.FLD235 = new CLS335(activity0);
        CLS117.FLD842.getClass();
        ArrayList arrayList0 = new ArrayList(CLS117.FLD842.FLD841.keySet());
        CLS168 ˑٴ0 = this.FLD238;
        if(ˑٴ0 != null) {
            boolean z2 = false;
            String s = "apply_theme";
            Menu menu0 = ˑٴ0.FLD1182;
            if(menu0 != null) {
                HashMap hashMap0 = ˑٴ0.FLD1178;
                if(hashMap0.containsKey("apply_theme")) {
                    s = (String)hashMap0.get("apply_theme");
                }
                for(int v = 0; v < menu0.size(); ++v) {
                    if(s.equals(menu0.getItem(v).getTitle().toString())) {
                        z2 = true;
                        break;
                    }
                }
            }
            if(!z2) {
                CLS338 יᐧ0 = new CLS338(activity0);
                יᐧ0.MTH2172(CLS133.MTH2099("apply_theme"));
                יᐧ0.MTH2400(new CLS26(this, 0));
                CLS43.MTH1423(linearLayout0, ((CLS145)יᐧ0), true);
            }
        }
        int v1 = CLS43.MTH1439(10);
        if(!TextUtils.isEmpty(CLS133.MTH2116("theme_discussion_url")) != 0) {
            CLS338 יᐧ1 = ((CLS10)this).MTH1044(z, z1);
            יᐧ1.MTH2172(CLS133.MTH2099("theme_discussion"));
            יᐧ1.MTH2400(new CLS153(activity0, 1));
            CLS43.MTH1423(linearLayout0, ((CLS145)יᐧ1), true);
        }
        CLS332 ʻᵎ0 = ((CLS10)this).MTH1047(z, z1);
        CLS332 ʻᵎ1 = ((CLS10)this).MTH1047(z, z1);
        CLS332 ʻᵎ2 = ((CLS10)this).MTH1047(z, z1);
        CLS332 ʻᵎ3 = ((CLS10)this).MTH1047(z, z1);
        CLS332 ʻᵎ4 = ((CLS10)this).MTH1047(z, z1);
        CLS332 ʻᵎ5 = ((CLS10)this).MTH1047(z, z1);
        CLS332 ʻᵎ6 = ((CLS10)this).MTH1047(z, z1);
        CLS332 ʻᵎ7 = ((CLS10)this).MTH1047(z, z1);
        CLS345 ﹳˊ0 = new CLS345(activity0);
        CLS345 ﹳˊ1 = new CLS345(activity0);
        CLS345 ﹳˊ2 = new CLS345(activity0);
        CLS345 ﹳˊ3 = new CLS345(activity0);
        CLS345 ﹳˊ4 = new CLS345(activity0);
        CLS337 ˎᵢ0 = new CLS337(activity0);
        CLS337 ˎᵢ1 = new CLS337(activity0);
        if(CLS133.FLD947.contains("io.va.exposed")) {
            CLS332 ʻᵎ8 = ((CLS10)this).MTH1047(z, z1);
            ʻᵎ9 = ʻᵎ6;
            ʻᵎ8.MTH2172(CLS133.MTH2099("themes_settings") + " (" + CLS133.MTH2099("please_restart") + ")");
            ʻᵎ10 = ʻᵎ5;
            ʻᵎ8.MTH2328(CLS133.MTH2103().MTH2131("themes", false));
            ʻᵎ8.MTH2327(new CLS25(1));
            CLS43.MTH1423(linearLayout0, ((CLS145)ʻᵎ8), true);
        }
        else {
            ʻᵎ9 = ʻᵎ6;
            ʻᵎ10 = ʻᵎ5;
        }
        CLS344 ⁱˉ0 = new CLS344(activity0);
        CLS332 ʻᵎ11 = ((CLS10)this).MTH1047(z, z1);
        ʻᵎ11.MTH2172(CLS133.MTH2099("random_chatting_bg"));
        ʻᵎ11.MTH2328(CLS133.MTH2103().MTH2131("random_chatting_bg", false));
        ʻᵎ11.MTH2327(new CLS25(2));
        ⁱˉ0.MTH2482(((CLS145)ʻᵎ11));
        CLS338 יᐧ2 = new CLS338(activity0);
        יᐧ2.MTH2172(CLS133.MTH2099("random_bg_general"));
        יᐧ2.MTH2400(new CLS22(this, activity0, 3));
        ⁱˉ0.MTH2482(((CLS145)יᐧ2));
        CLS338 יᐧ3 = new CLS338(activity0);
        יᐧ3.MTH2172(CLS133.MTH2099("random_bg_custom"));
        יᐧ3.MTH2400(new CLS22(this, activity0, 4));
        ⁱˉ0.MTH2482(((CLS145)יᐧ3));
        ⁱˉ0.MTH2475(linearLayout0, v1);
        CLS344 ⁱˉ1 = new CLS344(activity0);
        CLS337 ˎᵢ2 = new CLS337(activity0);
        this.FLD237 = ˎᵢ2;
        ˎᵢ2.FLD1165 = false;
        ˎᵢ2.MTH2388(CLS133.MTH2099("theme_desc"));
        ⁱˉ1.MTH2482(((CLS145)this.FLD237));
        CLS332 ʻᵎ12 = ((CLS10)this).MTH1047(z, z1);
        ʻᵎ12.MTH2172(CLS133.MTH2099("themes"));
        ʻᵎ12.MTH2328(CLS133.MTH2103().MTH2131("themes_enable", false));
        ʻᵎ12.MTH2327(new CLS25(3));
        ⁱˉ1.MTH2482(((CLS145)ʻᵎ12));
        CLS245 ᵔʾ0 = new CLS245(this, ʻᵎ1, ʻᵎ2, ʻᵎ3, ʻᵎ0, ʻᵎ4, ʻᵎ9, ʻᵎ7, ʻᵎ10, ﹳˊ0, ﹳˊ1, ﹳˊ4, ﹳˊ2, ﹳˊ3);
        CLS335 ˉᐧ0 = this.FLD235;
        CLS304 ﾞᐧ0 = new CLS304(this, ᵔʾ0, 10);
        CLS181 ⁱᵔ0 = new CLS181(ˉᐧ0.FLD1139, ((CLS176)ﾞᐧ0));
        ˉᐧ0.FLD1139.FLD1257.setOnItemSelectedListener(ⁱᵔ0);
        this.FLD235.MTH2364(arrayList0);
        CLS335 ˉᐧ1 = this.FLD235;
        String s1 = CLS133.MTH2103().MTH2134("current_theme", "");
        ˉᐧ1.FLD1139.MTH2445(s1);
        CLS335 ˉᐧ2 = this.FLD235;
        ˉᐧ2.getClass();
        ⁱˉ1.MTH2482(((CLS145)ˉᐧ2));
        CLS117 ˆٴ0 = CLS117.FLD842;
        CLS102 יﹳ0 = ˆٴ0.MTH1905();
        this.FLD236 = יﹳ0;
        if(יﹳ0 == null && !arrayList0.isEmpty()) {
            this.FLD236 = ˆٴ0.MTH1907(((String)this.FLD235.FLD1139.FLD1259.get(this.FLD235.FLD1139.FLD1258)));
        }
        if(this.FLD236 != null) {
            this.FLD237.MTH2175(8);
        }
        ᵔʾ0.MTH2169();
        ʻᵎ0.MTH2172(CLS133.MTH2099("DisableOnDarkMode"));
        ʻᵎ0.MTH2327(new CLS8(this, 7));
        ⁱˉ1.MTH2482(((CLS145)ʻᵎ0));
        CLS332 ʻᵎ13 = ((CLS10)this).MTH1047(z, z1);
        ʻᵎ13.MTH2172(CLS133.MTH2099("auto_change_theme"));
        ʻᵎ13.MTH2328(CLS133.MTH2103().MTH2131("auto_change_theme", false));
        ʻᵎ13.MTH2327(new CLS25(0));
        ⁱˉ1.MTH2482(((CLS145)ʻᵎ13));
        CLS338 יᐧ4 = new CLS338(activity0);
        יᐧ4.MTH2172(CLS133.MTH2099("set_auto_change_theme_time"));
        יᐧ4.MTH2400(new CLS26(this, 1));
        ⁱˉ1.MTH2482(((CLS145)יᐧ4));
        ⁱˉ1.MTH2475(linearLayout0, v1);
        CLS344 ⁱˉ2 = new CLS344(activity0);
        CLS337 ˎᵢ3 = new CLS337(activity0);
        ˎᵢ3.MTH2172(CLS133.MTH2099("enable_fab"));
        ˎᵢ3.MTH2387(new CLS22(this, activity0, 0));
        ⁱˉ2.MTH2482(((CLS145)ˎᵢ3));
        CLS337 ˎᵢ4 = new CLS337(activity0);
        ˎᵢ4.MTH2172(CLS133.MTH2099("recent_chat_fab"));
        ˎᵢ4.MTH2387(new CLS22(this, activity0, 1));
        ⁱˉ2.MTH2482(((CLS145)ˎᵢ4));
        CLS337 ˎᵢ5 = new CLS337(activity0);
        ˎᵢ5.MTH2172(CLS133.MTH2099("enable_drawer"));
        ˎᵢ5.MTH2387(new CLS22(this, activity0, 2));
        ⁱˉ2.MTH2482(((CLS145)ˎᵢ5));
        CLS333 ʽﹶ0 = new CLS333(activity0);
        ʽﹶ0.MTH2172(CLS133.MTH2099("chat_ui"));
        ʽﹶ0.FLD1117 = new CLS201(this, z, z1, activity0, v1);
        ⁱˉ2.MTH2482(((CLS145)ʽﹶ0));
        CLS333 ʽﹶ1 = new CLS333(activity0);
        ʽﹶ1.MTH2172(CLS133.MTH2099("tab_layout"));
        ʽﹶ1.FLD1117 = new CLS224(this, activity0, z, z1, ᵔʾ0, v1);
        ⁱˉ2.MTH2482(((CLS145)ʽﹶ1));
        ⁱˉ2.MTH2475(linearLayout0, v1);
        CLS344 ⁱˉ3 = new CLS344(activity0);
        ʻᵎ3.MTH2172(CLS133.MTH2099("chatroom_container_round_avatar"));
        ʻᵎ3.MTH2327(new CLS8(this, 0));
        ⁱˉ3.MTH2482(((CLS145)ʻᵎ3));
        ʻᵎ2.MTH2172(CLS133.MTH2099("hide_appbrand"));
        ʻᵎ2.MTH2327(new CLS8(this, 1));
        if(!TextUtils.isEmpty(CLS133.MTH2115("ConversationWithAppBrandListViewClass"))) {
            ⁱˉ3.MTH2482(((CLS145)ʻᵎ2));
        }
        ⁱˉ3.MTH2475(linearLayout0, v1);
        CLS344 ⁱˉ4 = new CLS344(activity0);
        ʻᵎ1.MTH2172(CLS133.MTH2099("hide_actionbar"));
        ʻᵎ1.MTH2327(new CLS8(this, 2));
        ⁱˉ4.MTH2482(((CLS145)ʻᵎ1));
        ʻᵎ9.MTH2172(CLS133.MTH2099("HideActionBarSearchMenu"));
        ʻᵎ9.MTH2327(new CLS8(this, 3));
        ⁱˉ4.MTH2482(((CLS145)ʻᵎ9));
        ʻᵎ7.MTH2172(CLS133.MTH2099("HideActionBarPlusMenu"));
        ʻᵎ7.MTH2327(new CLS8(this, 4));
        ⁱˉ4.MTH2482(((CLS145)ʻᵎ7));
        ʻᵎ4.MTH2172(CLS133.MTH2099("ChangeActionBarColor"));
        ʻᵎ4.MTH2327(new CLS8(this, 5));
        ⁱˉ4.MTH2482(((CLS145)ʻᵎ4));
        ﹳˊ0.FLD1310 = CLS15.MTH1074(-3877630053705L, ﹳˊ0, 0xFF000000);
        CLS102 יﹳ1 = this.FLD236;
        if(יﹳ1 != null) {
            ﹳˊ0.MTH2493(יﹳ1.MTH1804("ActionBarColor", "#000000"));
        }
        ﹳˊ0.FLD1303 = new CLS189(this, 0);
        ⁱˉ4.MTH2482(((CLS145)ﹳˊ0));
        ⁱˉ4.MTH2475(linearLayout0, v1);
        CLS344 ⁱˉ5 = new CLS344(activity0);
        ˎᵢ1.MTH2172(CLS133.MTH2099("set_background_color"));
        ˎᵢ1.MTH2387(new CLS26(this, 2));
        ⁱˉ5.MTH2482(((CLS145)ˎᵢ1));
        ˎᵢ0.MTH2172(CLS133.MTH2099("set_background"));
        ˎᵢ0.MTH2387(new CLS26(this, 3));
        ⁱˉ5.MTH2482(((CLS145)ˎᵢ0));
        ⁱˉ5.MTH2475(linearLayout0, v1);
        CLS344 ⁱˉ6 = new CLS344(activity0);
        ﹳˊ1.MTH2172(CLS133.MTH2099("FragmentItemViewBackgroundColor"));
        ﹳˊ1.FLD1310 = CLS46.MTH1451(CLS46.MTH1454(-1));
        CLS102 יﹳ2 = this.FLD236;
        if(יﹳ2 != null) {
            ﹳˊ1.MTH2493(יﹳ2.MTH1804("FragmentItemViewBackgroundColor", CLS46.MTH1451(CLS46.MTH1454(-1))));
        }
        ﹳˊ1.FLD1303 = new CLS189(this, 1);
        ﹳˊ1.FLD1309 = true;
        ⁱˉ6.MTH2482(((CLS145)ﹳˊ1));
        ﹳˊ4.MTH2172(CLS133.MTH2099("FragmentItemViewStickyBackgroundColor"));
        ﹳˊ4.FLD1309 = true;
        ﹳˊ4.FLD1310 = CLS46.MTH1451(CLS46.MTH1454(CLS46.MTH1447("#F7F3F7")));
        CLS102 יﹳ3 = this.FLD236;
        if(יﹳ3 != null) {
            ﹳˊ4.MTH2493(יﹳ3.MTH1804("FragmentItemViewStickyBackgroundColor", CLS46.MTH1451(CLS46.MTH1454(CLS46.MTH1447("#F7F3F7")))));
        }
        ﹳˊ4.FLD1303 = new CLS189(this, 2);
        ⁱˉ6.MTH2482(((CLS145)ﹳˊ4));
        ʻᵎ10.MTH2172(CLS133.MTH2099("FragmentItemViewTitleColorEnable"));
        ʻᵎ10.MTH2327(new CLS8(this, 6));
        ⁱˉ6.MTH2482(((CLS145)ʻᵎ10));
        ﹳˊ2.MTH2172(CLS133.MTH2099("FragmentItemViewTitleColor"));
        ﹳˊ2.FLD1310 = "#353535";
        CLS102 יﹳ4 = this.FLD236;
        if(יﹳ4 != null) {
            ﹳˊ2.MTH2493(יﹳ4.MTH1804("FragmentItemViewTitleColor", "#353535"));
        }
        ﹳˊ2.FLD1303 = new CLS189(this, 3);
        ⁱˉ6.MTH2482(((CLS145)ﹳˊ2));
        ﹳˊ3.MTH2172(CLS133.MTH2099("FragmentItemViewSubTitleColor"));
        ﹳˊ3.FLD1310 = "#AAAAAA";
        CLS102 יﹳ5 = this.FLD236;
        if(יﹳ5 != null) {
            ﹳˊ3.MTH2493(יﹳ5.MTH1804("FragmentItemViewSubTitleColor", "#AAAAAA"));
        }
        ﹳˊ3.FLD1303 = new CLS189(this, 4);
        ⁱˉ6.MTH2482(((CLS145)ﹳˊ3));
        ⁱˉ6.MTH2475(linearLayout0, v1);
    }

    // 此方法包含解密的字符串
    public final void MTH1140(JSONObject jSONObject0, CLS146 ᵔʾ0) {
        public final class CLS17 implements SeekBar.OnSeekBarChangeListener {
            public final int[] FLD189;
            public final CLS143 FLD190;

            public CLS17(int[] arr_v, CLS259 ⁱᵔ0) {
                this.FLD190 = ⁱᵔ0;
                super();
            }

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
                this.FLD189[0] = v;
                this.FLD190.MTH2169();
            }

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar0) {
            }

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar0) {
            }
        }


        public final class CLS206 implements CLS141 {
            public final JSONObject FLD194;
            public final String[] FLD195;
            public final String[] FLD196;
            public final CLS332 FLD197;
            public final int[] FLD198;
            public final CLS146 FLD199;

            public CLS206(JSONObject jSONObject0, CLS332 ʻᵎ0, String[] arr_s, int[] arr_v, String[] arr_s1, CLS146 ᵔʾ0) {
                this.FLD197 = ʻᵎ0;
                this.FLD196 = arr_s;
                this.FLD198 = arr_v;
                this.FLD195 = arr_s1;
                this.FLD199 = ᵔʾ0;
                super();
            }

            @Override  // t.ⁱʾ.CLS141
            public final void MTH2165() {
            }

            // 此方法包含解密的字符串
            @Override  // t.ⁱʾ.CLS141
            public final void MTH2166() {
                try {
                    Switch switch0 = this.FLD197.FLD1101;
                    boolean z = switch0 == null ? this.FLD197.FLD1104 : switch0.isChecked();
                    this.FLD194.put("e", z);
                    this.FLD194.put("p", this.FLD196[0]);
                    this.FLD194.put("b", this.FLD198[0]);
                    this.FLD194.put("c", this.FLD195[0]);
                    this.FLD199.MTH2177(this.FLD194);
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            }
        }


        public final class CLS208 implements CLS142 {
            public final String[] FLD211;
            public final CLS143 FLD212;

            public CLS208(String[] arr_s, CLS143 ˆٴ0) {
                this.FLD212 = ˆٴ0;
                super();
            }

            @Override  // t.ⁱʾ.CLS142
            public final void MTH2167() {
            }

            @Override  // t.ⁱʾ.CLS142
            public final void MTH2168(String s) {
                this.FLD211[0] = s;
                this.FLD212.MTH2169();
            }
        }

        String s = CLS133.MTH2099("add");
        Activity activity0 = ((CLS10)this).MTH1048();
        CLS332 ʻᵎ0 = new CLS332(activity0);
        String s1 = jSONObject0.optString("p", "");
        String[] arr_s = {s1};
        int[] arr_v = {jSONObject0.optInt("b", 0)};
        String[] arr_s1 = {jSONObject0.optString("c", "#00FFFFFF")};
        CLS188 ʽﹶ0 = new CLS188(this, ʻᵎ0, jSONObject0, activity0, arr_s, arr_s1, arr_v, s1);
        CLS206 ˎﾞ$ˆʿ0 = new CLS206(jSONObject0, ʻᵎ0, arr_s, arr_v, arr_s1, ᵔʾ0);
        CLS55 ⁱˉ0 = new CLS55(activity0, s);
        ⁱˉ0.FLD514 = ʽﹶ0;
        ⁱˉ0.FLD523 = null;
        ⁱˉ0.FLD515 = new CLS277(((CLS141)ˎﾞ$ˆʿ0), 0);
        ⁱˉ0.FLD513 = ˎﾞ$ˆʿ0;
        ⁱˉ0.show();
    }

    // 此方法包含解密的字符串
    public final void MTH1141(CLS147 ⁱʾ0, CLS146 ᵔʾ0) {
        public final class CLS207 implements CLS141 {
            public final CLS332 FLD200;
            public final CLS332 FLD201;
            public final String[] FLD202;
            public final CLS147 FLD203;
            public final CLS146 FLD204;
            public final CLS335 FLD205;
            public final CLS339 FLD206;
            public final CLS339 FLD207;
            public final CLS106 FLD208;
            public final String FLD209;
            public final String[] FLD210;

            public CLS207(CLS147 ⁱʾ0, CLS339 יﹳ0, CLS339 יﹳ1, CLS106 ٴـ0, CLS335 ˉᐧ0, String[] arr_s, String s, CLS332 ʻᵎ0, String[] arr_s1, CLS332 ʻᵎ1, CLS146 ᵔʾ0) {
                this.FLD207 = יﹳ0;
                this.FLD206 = יﹳ1;
                this.FLD208 = ٴـ0;
                this.FLD205 = ˉᐧ0;
                this.FLD210 = arr_s;
                this.FLD209 = s;
                this.FLD201 = ʻᵎ0;
                this.FLD202 = arr_s1;
                this.FLD200 = ʻᵎ1;
                this.FLD204 = ᵔʾ0;
                super();
            }

            @Override  // t.ⁱʾ.CLS141
            public final void MTH2165() {
            }

            @Override  // t.ⁱʾ.CLS141
            public final void MTH2166() {
                try {
                    String[] arr_s = this.FLD210;
                    CLS147 ⁱʾ0 = this.FLD203;
                    ⁱʾ0.MTH2185(this.FLD207.MTH2416());
                    ⁱʾ0.MTH2187(this.FLD206.MTH2416());
                    String s = (String)this.FLD205.FLD1139.FLD1259.get(this.FLD205.FLD1139.FLD1258);
                    ⁱʾ0.MTH2183(((String)((HashMap)this.FLD208.FLD790).get(s)));
                    if(!TextUtils.isEmpty(arr_s[0]) && !this.FLD209.equals(arr_s[0])) {
                        ⁱʾ0.MTH2189(new File(arr_s[0]));
                    }
                    Switch switch0 = this.FLD201.FLD1101;
                    ⁱʾ0.MTH2190((switch0 == null ? this.FLD201.FLD1104 : switch0.isChecked()));
                    ⁱʾ0.MTH2182(this.FLD202[0]);
                    Switch switch1 = this.FLD200.FLD1101;
                    ⁱʾ0.setEnabled((switch1 == null ? this.FLD200.FLD1104 : switch1.isChecked()));
                    this.FLD204.MTH2177(ⁱʾ0);
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            }
        }


        public final class CLS212 implements CLS142 {
            public final String[] FLD221;
            public final CLS143 FLD222;

            public CLS212(String[] arr_s, CLS143 ˆٴ0) {
                this.FLD222 = ˆٴ0;
                super();
            }

            @Override  // t.ⁱʾ.CLS142
            public final void MTH2167() {
            }

            @Override  // t.ⁱʾ.CLS142
            public final void MTH2168(String s) {
                this.FLD221[0] = s;
                this.FLD222.MTH2169();
            }
        }

        String s = CLS133.MTH2099("add");
        Activity activity0 = ((CLS10)this).MTH1048();
        CLS332 ʻᵎ0 = new CLS332(activity0);
        CLS339 יﹳ0 = new CLS339(activity0);
        CLS339 יﹳ1 = new CLS339(activity0);
        CLS332 ʻᵎ1 = new CLS332(activity0);
        CLS335 ˉᐧ0 = new CLS335(activity0);
        String s1 = this.FLD236.MTH1826(ⁱʾ0.getIcon());
        String[] arr_s = {s1};
        String[] arr_s1 = {ⁱʾ0.MTH2188()};
        CLS106 ٴـ0 = new CLS106();
        CLS43.MTH1426(activity0, s, ((CLS54)new CLS264(this, ʻᵎ0, ⁱʾ0, יﹳ0, יﹳ1, activity0, ٴـ0, ˉᐧ0, ʻᵎ1, arr_s, arr_s1)), null, ((CLS141)new CLS207(ⁱʾ0, יﹳ0, יﹳ1, ٴـ0, ˉᐧ0, arr_s, s1, ʻᵎ1, arr_s1, ʻᵎ0, ᵔʾ0)));
    }
}


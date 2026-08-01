// Decompiled by JEB v5.42.0.202606242140

package d.יʻ;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import d.ˎˏ.CLS1;
import d.ˑʽ.CLS10.CLS8;
import d.ˑʽ.CLS10.CLS9;
import d.ˑʽ.CLS135;
import d.ˑʽ.CLS13;
import d.ˑʽ.CLS15;
import d.ˑʽ.CLS21.CLS17;
import d.ˑʽ.CLS21.CLS20;
import d.ˑʽ.CLS27;
import d.ˑʽ.CLS36;
import d.ˑʽ.CLS38;
import d.ˑʽ.CLS43;
import d.ˑʽ.CLS45;
import d.ˑʽ.CLS47;
import d.ˑʽ.CLS53;
import d.ٴˑ.CLS176;
import d.ٴˑ.CLS181;
import d.ٴˑ.CLS182;
import d.ٴˑ.CLS184;
import d.ٴˑ.CLS185;
import d.ٴˑ.CLS187;
import d.ٴˑ.CLS188;
import d.ٴˑ.CLS190.CLS97;
import d.ٴˑ.CLS190;
import d.ٴˑ.CLS191;
import d.ٴˑ.CLS74;
import d.ٴˑ.CLS76;
import d.ٴˑ.CLS83.CLS81;
import d.ٴˑ.CLS85;
import d.ٴˑ.CLS87.CLS86;
import d.ٴˑ.CLS87;
import d.ٴˑ.CLS88;
import d.ٴˑ.CLS90.CLS89;
import d.ٴˑ.CLS90;
import d.ٴˑ.CLS91;
import d.ٴˑ.CLS92;
import d.ٴˑ.CLS93;
import d.ٴˑ.CLS96;
import d.ᐧˈ.CLS101;
import d.ᐧˈ.CLS104;
import d.ᐧˈ.CLS194;
import d.ᐧˏ.CLS108;
import d.ᐧי.CLS110;
import d.ᵎʻ.CLS119;
import d.ᵎʻ.CLS210;
import d.ⁱٴ.CLS123;
import d.ⁱٴ.CLS124;
import d.ⁱٴ.CLS125;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS173 implements CLS8, CLS9, CLS17, CLS67, CLS81, CLS86, CLS97, CLS124 {
    public final Object FLD338;
    public final int FLD339;
    public final Object FLD340;

    public CLS173(Object object0, Object object1, int v) {
        this.FLD339 = v;
        this.FLD338 = object0;
        this.FLD340 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // d.יʻ.CLS68$CLS67
    public final void run() {
        Object object0 = this.FLD340;
        Object object1 = this.FLD338;
        switch(this.FLD339) {
            case 0: {
                ((CLS64)object1).MTH774(((Object[])object0));
                return;
            }
            case 1: {
                HashSet hashSet0 = new HashSet();
                if(!TextUtils.isEmpty(((String)object1))) {
                    hashSet0.addAll(Arrays.asList(((String)object1).split(";")));
                }
                if(!TextUtils.isEmpty(((String)object0))) {
                    hashSet0.addAll(Arrays.asList(((String)object0).split(";")));
                }
                if(!hashSet0.isEmpty()) {
                    String s = ((CLS36)CLS68.FLD326.MTH786(CLS36.class)).MTH593();
                    for(Object object2: hashSet0) {
                        if(s.contains(((String)object2).trim())) {
                            CLS62.FLD317.MTH755("disable", new Object[0]);
                            CLS62.FLD317.MTH754("core", "unloadFeature", new Object[]{"donation"});
                            CLS62.FLD317.FLD316.clear();
                            CLS62.FLD317.FLD314.clear();
                            CLS62.FLD317.FLD312.clear();
                            return;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                return;
            }
            default: {
                ((CLS53)object1).getClass();
                String[] arr_s = ((String)object0).split(",");
                for(int v = 0; v < arr_s.length; ++v) {
                    ((CLS53)object1).FLD279.MTH1158(arr_s[v], Boolean.TRUE);
                }
            }
        }
    }

    @Override  // d.ٴˑ.CLS83$CLS81
    public final void MTH921(String s) {
        ((int[])this.FLD338)[0] = (int)(((Integer)((HashMap)((CLS119)this.FLD340).FLD667).get(s)));
    }

    // 此方法包含解密的字符串
    @Override  // d.ˑʽ.CLS10$CLS9
    public final void MTH416(CLS91 ٴˆ0) {
        String s7;
        String s6;
        String s5;
        String s4;
        LinkedHashMap linkedHashMap0 = (LinkedHashMap)this.FLD338;
        Activity activity0 = (Activity)this.FLD340;
        for(Object object0: linkedHashMap0.keySet()) {
            String s = (String)object0;
            String s1 = (String)linkedHashMap0.get(s);
            String s2 = s1.startsWith("#") ? s1.substring(1) : s1;
            String s3 = "";
            if(!s2.startsWith("$") && !s2.startsWith("*")) {
                if(TextUtils.isEmpty(s)) {
                    s4 = "";
                }
                else {
                    if(!s.contains("[[") || !s.contains("]]")) {
                        s5 = s;
                        s6 = "";
                    }
                    else {
                        int v = s.indexOf("[[");
                        int v1 = s.lastIndexOf("]]");
                        s5 = CLS71.MTH825(s, 0, v, new StringBuilder(), v1, 2);
                        s6 = s.substring(v + 2, v1);
                    }
                    if(!s5.contains("{") || !s5.contains("}")) {
                        s7 = "";
                    }
                    else {
                        int v2 = s5.indexOf("{");
                        int v3 = s5.lastIndexOf("}");
                        s7 = s5.substring(v2 + 1, v3);
                        s5 = CLS71.MTH825(s5, 0, v2, new StringBuilder(), v3, 1);
                    }
                    if(s5.contains("((") && s5.contains("))")) {
                        int v4 = s5.indexOf("((");
                        int v5 = s5.lastIndexOf("))");
                        s3 = s5.substring(v4 + 2, v5);
                        s5 = CLS71.MTH825(s5, 0, v4, new StringBuilder(), v5, 2);
                    }
                    s4 = s5.trim();
                    s7.getClass();
                    s6.getClass();
                    s3.getClass();
                }
                ٴˆ0.MTH968(CLS69.MTH795("open_with_internal_browser") + ": " + s4, s1, ((CLS123)new CLS135(activity0, s2, 0)));
                ٴˆ0.MTH968(CLS69.MTH795("open_with_external_browser") + ": " + s4, s1, ((CLS123)new CLS135(activity0, s2, 1)));
            }
        }
    }

    @Override  // d.ٴˑ.CLS87$CLS86
    public final void MTH932(String s, int v) {
        CLS185 ـﾞ0 = (CLS185)this.FLD338;
        CLS188 ᴵʾ0 = (CLS188)this.FLD340;
        ـﾞ0.getClass();
        try {
            ـﾞ0.FLD482.MTH932(s, v);
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        ᴵʾ0.FLD527 = s;
        CLS45.MTH658(ᴵʾ0.FLD534, s);
        int v1 = CLS43.MTH643(s);
        ᴵʾ0.FLD534.setTextColor(v1);
    }

    // 此方法包含解密的字符串
    @Override  // d.ˑʽ.CLS10$CLS8
    public final void MTH415(LinearLayout linearLayout0) {
        Object object0 = this.FLD340;
        Object object1 = this.FLD338;
        if(this.FLD339 == 8) {
            ArrayList arrayList0 = (ArrayList)object0;
            CLS188 ᴵʾ0 = new CLS188(((Activity)object1));
            ᴵʾ0.FLD531 = false;
            ᴵʾ0.MTH1179(CLS69.MTH795("keycard_feedback_desc"));
            StringBuilder stringBuilder0 = new StringBuilder();
            String s = CLS1.MTH369();
            stringBuilder0.append("wxid: ");
            stringBuilder0.append(s);
            stringBuilder0.append("<br>");
            try {
                for(Object object2: arrayList0) {
                    stringBuilder0.append("key: ");
                    stringBuilder0.append(((JSONObject)object2).getString("key"));
                    stringBuilder0.append(CLS69.MTH795((((JSONObject)object2).optBoolean("valid") ? "donate_key_used" : "donate_key_wrong")));
                    stringBuilder0.append("<br>");
                }
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
            stringBuilder0.append("发卡平台预留联系方式: ");
            CLS188 ᴵʾ1 = new CLS188(((Activity)object1));
            ᴵʾ1.FLD531 = false;
            ᴵʾ1.MTH1181(stringBuilder0.toString());
            ᴵʾ1.MTH1179(CLS69.MTH795("click_to_copy"));
            ᴵʾ1.MTH1000(new CLS27(((Activity)object1), stringBuilder0, 0));
            CLS187 ᐧﹶ0 = new CLS187(((Activity)object1));
            ᐧﹶ0.MTH1181(CLS69.MTH795("keycard_feedback"));
            ᐧﹶ0.MTH991(new CLS47(((Activity)object1), 3));
            CLS182 ˆᐧ0 = new CLS182(((Activity)object1));
            Collections.addAll(ˆᐧ0.FLD411, new Object[]{ᴵʾ0, ᴵʾ1, ᐧﹶ0});
            CLS45.MTH667(linearLayout0, ((CLS125)ˆᐧ0), CLS45.MTH662(10));
            return;
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        HashMap hashMap0 = new HashMap();
        String[] arr_s = ((String)object1).split(";");
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            String s2 = s1.split(Pattern.quote("|"))[0].trim();
            hashMap0.put(s2, s1);
            linkedHashMap0.put(CLS69.MTH795(s2), s2);
        }
        CLS182 ˆᐧ1 = new CLS182(((Activity)object0));
        CLS188 ᴵʾ2 = new CLS188(((Activity)object0));
        ᴵʾ2.FLD531 = false;
        ᴵʾ2.MTH1181(CLS69.MTH795("donate_crypto_desc"));
        ˆᐧ1.MTH907(((CLS125)ᴵʾ2));
        if(!TextUtils.isEmpty(CLS69.MTH806("donate_feedback_url"))) {
            CLS187 ᐧﹶ1 = new CLS187(((Activity)object0));
            ᐧﹶ1.MTH1181(CLS69.MTH795("donate_feedback"));
            ᐧﹶ1.MTH991(new CLS104(((Activity)object0), 27));
            ˆᐧ1.MTH907(((CLS125)ᐧﹶ1));
        }
        CLS45.MTH667(linearLayout0, ((CLS125)ˆᐧ1), CLS45.MTH662(10));
        CLS181 ˆـ0 = new CLS181(((Activity)object0));
        CLS110 ٴˑ0 = new CLS110(((Activity)object0), linkedHashMap0.keySet());
        ˆـ0.MTH894(ٴˑ0);
        ˆـ0.MTH893(new CLS15(ٴˑ0, linkedHashMap0, hashMap0, ((Activity)object0)));
        CLS45.MTH660(linearLayout0, ((CLS125)ˆـ0));
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱٴ.CLS124
    public final void MTH1175(Object[] arr_object) {
        Object object0 = this.FLD340;
        Object object1 = this.FLD338;
        switch(this.FLD339) {
            case 2: {
                CLS87 ˏᐧ0 = (CLS87)object1;
                ˏᐧ0.getClass();
                Menu menu0 = (Menu)arr_object[0];
                LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
                CLS91 ٴˆ0 = new CLS91(((Activity)object0), linearLayout1, menu0);
                ٴˆ0.MTH969("reset_to_default", ((CLS123)new CLS191(ˏᐧ0, 0)));
                ٴˆ0.MTH971();
                CLS90 יʻ0 = new CLS90(((Activity)object0));
                ˏᐧ0.FLD434 = יʻ0;
                יʻ0.setOnColorSelectedListener(((CLS89)new CLS210(ˏᐧ0, 1)));
                LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(CLS45.MTH662(200), CLS45.MTH662(200));
                linearLayout$LayoutParams0.gravity = 17;
                linearLayout1.addView(ˏᐧ0.FLD434, linearLayout$LayoutParams0);
                View view0 = new View(((Activity)object0));
                ˏᐧ0.FLD440 = view0;
                linearLayout1.addView(view0, new LinearLayout.LayoutParams(-1, CLS45.MTH662(15)));
                CLS182 ˆᐧ0 = new CLS182(((Activity)object0));
                CLS190 ᵎᐧ0 = new CLS190(((Activity)object0));
                ˏᐧ0.FLD446 = ᵎᐧ0;
                ᵎᐧ0.FLD559 = true;
                ˆᐧ0.MTH907(((CLS125)ᵎᐧ0));
                CLS184 י0 = new CLS184(((Activity)object0));
                י0.FLD452 = true;
                י0.MTH1181(CLS69.MTH795("red"));
                ˏᐧ0.FLD441 = י0.FLD458;
                י0.FLD458.setMax(0xFF);
                int v = Build.VERSION.SDK_INT;
                SeekBar seekBar0 = ˏᐧ0.FLD441;
                if(v >= 21) {
                    seekBar0.setProgressTintList(ColorStateList.valueOf(0xFFFF0000));
                }
                else {
                    seekBar0.getProgressDrawable().setColorFilter(0xFFFF0000, PorterDuff.Mode.SRC_IN);
                }
                ˏᐧ0.FLD441.setOnSeekBarChangeListener(new CLS88(ˏᐧ0, י0));
                י0.FLD449 = new CLS92(ˏᐧ0, ((Activity)object0), י0, 0);
                ˆᐧ0.MTH907(((CLS125)י0));
                CLS184 י1 = new CLS184(((Activity)object0));
                י1.FLD452 = true;
                י1.MTH1181(CLS69.MTH795("green"));
                ˏᐧ0.FLD437 = י1.FLD458;
                י1.FLD458.setMax(0xFF);
                SeekBar seekBar1 = ˏᐧ0.FLD437;
                if(v >= 21) {
                    seekBar1.setProgressTintList(ColorStateList.valueOf(0xFF00FF00));
                }
                else {
                    seekBar1.getProgressDrawable().setColorFilter(0xFF00FF00, PorterDuff.Mode.SRC_IN);
                }
                ˏᐧ0.FLD437.setOnSeekBarChangeListener(new CLS85(ˏᐧ0, י1));
                י1.FLD449 = new CLS92(ˏᐧ0, ((Activity)object0), י1, 1);
                ˆᐧ0.MTH907(((CLS125)י1));
                CLS184 י2 = new CLS184(((Activity)object0));
                י2.FLD452 = true;
                י2.MTH1181(CLS69.MTH795("blue"));
                ˏᐧ0.FLD435 = י2.FLD458;
                י2.FLD458.setMax(0xFF);
                SeekBar seekBar2 = ˏᐧ0.FLD435;
                if(v >= 21) {
                    seekBar2.setProgressTintList(ColorStateList.valueOf(0xFF0000FF));
                }
                else {
                    seekBar2.getProgressDrawable().setColorFilter(0xFF0000FF, PorterDuff.Mode.SRC_IN);
                }
                ˏᐧ0.FLD435.setOnSeekBarChangeListener(new CLS93(ˏᐧ0, י2));
                י2.FLD449 = new CLS92(ˏᐧ0, ((Activity)object0), י2, 2);
                ˆᐧ0.MTH907(((CLS125)י2));
                if(ˏᐧ0.FLD431) {
                    CLS184 י3 = new CLS184(((Activity)object0));
                    י3.FLD452 = true;
                    י3.MTH1181(CLS69.MTH795("alpha"));
                    ˏᐧ0.FLD439 = י3.FLD458;
                    י3.FLD458.setMax(0xFF);
                    SeekBar seekBar3 = ˏᐧ0.FLD439;
                    if(v >= 21) {
                        seekBar3.setProgressTintList(ColorStateList.valueOf(-1));
                    }
                    else {
                        seekBar3.getProgressDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
                    }
                    ˏᐧ0.FLD439.setOnSeekBarChangeListener(new CLS76(ˏᐧ0, י3));
                    י3.FLD449 = new CLS92(ˏᐧ0, ((Activity)object0), י3, 3);
                    ˆᐧ0.MTH907(((CLS125)י3));
                }
                ˏᐧ0.FLD446.FLD560.setOnEditorActionListener(new CLS96(ˏᐧ0, ((Activity)object0)));
                ˆᐧ0.MTH904(linearLayout1, CLS45.MTH662(3));
                ˏᐧ0.MTH934(ˏᐧ0.FLD444);
                ˏᐧ0.MTH935();
                return;
            }
            case 5: {
                CLS124 ᵎʻ0 = (CLS124)object0;
                Menu menu1 = (Menu)arr_object[0];
                LinearLayout linearLayout2 = (LinearLayout)arr_object[1];
                LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -1);
                ScrollView scrollView0 = new ScrollView(((Activity)object1));
                LinearLayout linearLayout3 = new LinearLayout(((Activity)object1));
                linearLayout3.setOrientation(1);
                linearLayout3.setLayoutParams(linearLayout$LayoutParams1);
                if(ᵎʻ0 != null) {
                    try {
                        ᵎʻ0.MTH1175(new Object[]{menu1, linearLayout3, linearLayout2});
                    }
                    catch(Throwable throwable0) {
                        CLS69.MTH797(throwable0);
                    }
                }
                scrollView0.addView(linearLayout3, new LinearLayout.LayoutParams(-1, -2));
                linearLayout2.addView(scrollView0, new LinearLayout.LayoutParams(-1, -2));
                return;
            }
            default: {
                LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
                CLS188 ᴵʾ0 = new CLS188(((Activity)object1));
                ᴵʾ0.FLD531 = false;
                ᴵʾ0.MTH1181(String.format(CLS69.MTH795("only_accept"), CLS69.MTH795(((String[])object0)[0].trim())));
                CLS45.MTH660(linearLayout0, ((CLS125)ᴵʾ0));
                if(((String[])object0).length > 2 && !TextUtils.isEmpty(((String[])object0)[2])) {
                    String s = ((String[])object0)[2].trim();
                    ImageView imageView0 = new ImageView(((Activity)object1));
                    imageView0.setImageBitmap(((Bitmap)CLS62.FLD317.MTH761("genQRCode", new Object[]{s, 0x200, 0x200})));
                    CLS176 ʻ0 = new CLS176(((Activity)object1));
                    ʻ0.FLD351.add(imageView0);
                    CLS45.MTH660(linearLayout0, ((CLS125)ʻ0));
                }
                if(((String[])object0).length > 1 && !TextUtils.isEmpty(((String[])object0)[1])) {
                    CLS187 ᐧﹶ0 = new CLS187(((Activity)object1));
                    ᐧﹶ0.MTH1181(((String[])object0)[1].trim());
                    ᐧﹶ0.MTH1179(CLS69.MTH795("click_to_copy"));
                    ᐧﹶ0.MTH991(new CLS74(((Activity)object1), ((Serializable)(((String[])object0))), 4));
                    CLS45.MTH660(linearLayout0, ((CLS125)ᐧﹶ0));
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // d.ٴˑ.CLS190$CLS97
    public final void MTH1016(String s) {
        long v;
        String s3;
        String s2;
        String s1;
        StringBuilder stringBuilder0;
        CLS194 ʼˎ0 = (CLS194)this.FLD338;
        ʼˎ0.getClass();
        EditText editText0 = ((CLS190)this.FLD340).FLD560;
        if(!TextUtils.isEmpty(s)) {
            Activity activity0 = ((CLS101)ʼˎ0).MTH1053();
            CLS61 ˉᵢ0 = ʼˎ0.FLD585;
            if(s.startsWith("cs ")) {
                String[] arr_s = s.split(" ");
                if(arr_s.length > 2) {
                    editText0.setText("");
                    ˉᵢ0.MTH743(arr_s[1]);
                    stringBuilder0 = new StringBuilder();
                    stringBuilder0.append("clear setting: ");
                    s1 = arr_s[1];
                    stringBuilder0.append(s1);
                    s2 = stringBuilder0.toString();
                    CLS13.MTH426(activity0, s2);
                    return;
                }
                CLS62.FLD317.MTH758("about_input", new Object[]{s, editText0, ʼˎ0});
                return;
            }
            if(s.startsWith("s2 ")) {
                String[] arr_s1 = s.split(" ");
                if(arr_s1.length > 2) {
                    editText0.setText("");
                    ˉᵢ0.MTH741(arr_s1[2], arr_s1[1]);
                    stringBuilder0 = new StringBuilder();
                    stringBuilder0.append("set settings: ");
                    stringBuilder0.append(arr_s1[1]);
                    stringBuilder0.append("=");
                    s1 = arr_s1[2];
                    stringBuilder0.append(s1);
                    s2 = stringBuilder0.toString();
                    CLS13.MTH426(activity0, s2);
                    return;
                }
                CLS62.FLD317.MTH758("about_input", new Object[]{s, editText0, ʼˎ0});
                return;
            }
            if(s.startsWith("s ")) {
                String[] arr_s2 = s.split(" ");
                if(arr_s2.length > 2) {
                    editText0.setText("");
                    boolean z = arr_s2[2].equalsIgnoreCase("t");
                    ˉᵢ0.MTH741(Boolean.valueOf(z), arr_s2[1]);
                    stringBuilder0 = CLS71.MTH830(CLS69.MTH795(CLS108.MTH1103((z ? -275504200729019L : 0xFFFF05672DFB3E45L))));
                    stringBuilder0.append(" ");
                    s1 = arr_s2[1];
                    stringBuilder0.append(s1);
                    s2 = stringBuilder0.toString();
                    CLS13.MTH426(activity0, s2);
                    return;
                }
                CLS62.FLD317.MTH758("about_input", new Object[]{s, editText0, ʼˎ0});
                return;
            }
            if(s.startsWith("r ")) {
                String[] arr_s3 = s.split(" ");
                if(arr_s3.length > 2) {
                    editText0.setText("");
                    boolean z1 = arr_s3[2].equalsIgnoreCase("t");
                    ˉᵢ0.MTH741((z1 ? arr_s3[1] : ""), "_reguser");
                    CLS38.FLD200.getClass();
                    CLS38.MTH606(false);
                    stringBuilder0 = CLS71.MTH830(CLS69.MTH795(CLS108.MTH1103((z1 ? 0xFFFF05362DFB3E45L : 0xFFFF052F2DFB3E45L))));
                    stringBuilder0.append(" ");
                    s1 = arr_s3[1];
                    stringBuilder0.append(s1);
                    s2 = stringBuilder0.toString();
                    CLS13.MTH426(activity0, s2);
                    return;
                }
                CLS62.FLD317.MTH758("about_input", new Object[]{s, editText0, ʼˎ0});
                return;
            }
            if(s.startsWith("f ")) {
                String[] arr_s4 = s.split(" ");
                if(arr_s4.length > 2) {
                    editText0.setText("");
                    boolean z2 = arr_s4[2].equalsIgnoreCase("t");
                    ˉᵢ0.MTH741((z2 ? arr_s4[1] : ""), "_specialfp");
                    CLS38.FLD200.getClass();
                    CLS38.MTH606(false);
                    stringBuilder0 = CLS71.MTH830(CLS69.MTH795(CLS108.MTH1103((z2 ? 0xFFFF1AFA2DFB3E45L : 0xFFFF1AF32DFB3E45L))));
                    stringBuilder0.append(" ");
                    s1 = arr_s4[1];
                    stringBuilder0.append(s1);
                    s2 = stringBuilder0.toString();
                    CLS13.MTH426(activity0, s2);
                    return;
                }
                CLS62.FLD317.MTH758("about_input", new Object[]{s, editText0, ʼˎ0});
                return;
            }
            if(s.startsWith("wxid")) {
                editText0.setText("");
                CLS13.MTH428(activity0, ʼˎ0.FLD588);
                ʼˎ0.MTH1040();
                s2 = String.format(CLS69.MTH795("view_copy_id"), ʼˎ0.FLD588);
                CLS13.MTH426(activity0, s2);
                return;
            }
            boolean z3 = false;
            if(s.startsWith("crc")) {
                z3 = true;
                s3 = CLS62.FLD317.MTH756("getWechatHash", new Object[0]);
                CLS13.MTH426(activity0, s3);
                v = -252113808835003L;
            }
            else if(s.startsWith("sig")) {
                z3 = true;
                ʼˎ0.FLD582.getClass();
                ContentValues contentValues0 = ʼˎ0.FLD582.FLD191;
                s3 = contentValues0.containsKey("wxSig") ? contentValues0.getAsString("wxSig") : "";
                if(TextUtils.isEmpty(s3)) {
                    s3 = CLS62.FLD317.MTH756("getWechatSig", new Object[0]);
                }
                CLS13.MTH426(activity0, s3);
                v = 0xFFFF1AA62DFB3E45L;
            }
            if(z3) {
                editText0.setText(CLS108.MTH1103(v));
                CLS13.MTH428(activity0, s3);
                return;
            }
            if(s.equals("reset")) {
                editText0.setText("");
                CLS62.FLD317.MTH759("core", "ejectCore", new Object[0]);
                goto label_118;
            }
            if(s.equals("update")) {
                editText0.setText("");
                CLS38.FLD200.getClass();
                CLS38.MTH606(true);
                return;
            }
            if(s.contains("clear")) {
                editText0.setText("");
                ˉᵢ0.getClass();
                try {
                    String s4 = CLS69.MTH812();
                    if(!TextUtils.isEmpty(s4)) {
                        ˉᵢ0.getWritableDatabase().delete("DATA", "ACCOUNT = ?", new String[]{s4});
                        ˉᵢ0.FLD309.clear();
                    }
                }
                catch(Throwable throwable0) {
                    CLS69.MTH797(throwable0);
                }
                if(ˉᵢ0.FLD310) {
                    ˉᵢ0.FLD309.clear();
                    return;
                }
                CLS62.FLD317.MTH758("WxDataManagerClear", new Object[0]);
                return;
            }
            if(s.equals("restart")) {
                editText0.setText("");
                try {
                label_118:
                    Context context0 = (Activity)CLS62.FLD317.MTH757("getLauncherUI", new Object[0]);
                    if(context0 == null) {
                        context0 = CLS69.MTH810();
                    }
                    if(context0 != null) {
                        Intent intent0 = context0.getPackageManager().getLaunchIntentForPackage(context0.getPackageName());
                        PendingIntent pendingIntent0 = Build.VERSION.SDK_INT < 23 ? PendingIntent.getActivity(context0, 1000, intent0, 0x10000000) : PendingIntent.getActivity(context0, 1000, intent0, 0x14000000);
                        if(pendingIntent0 != null) {
                            ((AlarmManager)context0.getSystemService("alarm")).set(1, System.currentTimeMillis() + 1000L, pendingIntent0);
                        }
                    }
                }
                catch(Throwable throwable1) {
                    CLS69.MTH797(throwable1);
                }
                try {
                    System.exit(0);
                }
                catch(Throwable throwable2) {
                    CLS69.MTH797(throwable2);
                }
                return;
            }
            if(s.equals("#apps")) {
                editText0.setText("");
                CLS62.FLD317.MTH759("core", "reportInstalledApps", new Object[0]);
                return;
            }
            if(s.startsWith("d ")) {
                String[] arr_s5 = s.split(" ");
                if(arr_s5.length > 2) {
                    editText0.setText("");
                    switch(arr_s5[1]) {
                        case "core": {
                            CLS62.FLD317.MTH759("core", "downloadCore", new Object[0]);
                            break;
                        }
                        case "lib": {
                            CLS62.FLD317.MTH759("core", "downloadLib", new Object[0]);
                            break;
                        }
                        default: {
                            CLS62.FLD317.MTH759("core", "downloadFeaturePack", new Object[]{arr_s5[1]});
                        }
                    }
                    stringBuilder0 = new StringBuilder();
                    stringBuilder0.append("download ");
                    s1 = arr_s5[1];
                    stringBuilder0.append(s1);
                    s2 = stringBuilder0.toString();
                    CLS13.MTH426(activity0, s2);
                    return;
                }
                CLS62.FLD317.MTH758("about_input", new Object[]{s, editText0, ʼˎ0});
                return;
            }
            if(s.equals("toolbar")) {
                editText0.setText("");
                CLS62.FLD317.MTH763("settings.config", new Object[]{"config_toolbar_settings", ʼˎ0.FLD588, activity0, Boolean.FALSE, Boolean.FALSE, ""});
                return;
            }
            if(s.endsWith(" ")) {
                s = s.replaceAll(" ", "");
            }
            if(s.length() > 60) {
                try {
                    Matcher matcher0 = Pattern.compile("^[a-zA-Z0-9+/]*={0,2}$").matcher(s);
                    if(matcher0.matches()) {
                        s = matcher0.group();
                    }
                }
                catch(Throwable throwable3) {
                    CLS69.MTH797(throwable3);
                }
            }
            if(s.length() == 0x40) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(s);
                CLS38.FLD200.getClass();
                CLS38.FLD200.MTH610(arrayList0, "a");
                editText0.setText("");
                return;
            }
            CLS62.FLD317.MTH758("about_input", new Object[]{s, editText0, ʼˎ0});
        }
    }

    // 此方法包含解密的字符串
    @Override  // d.ˑʽ.CLS21$CLS17
    public final void MTH446(CLS20 ʾﹶ$ⁱٴ0) {
        String s3;
        JSONObject jSONObject0;
        Object object0 = this.FLD340;
        Object object1 = this.FLD338;
        if(this.FLD339 == 6) {
            CLS123 ᐧי0 = (CLS123)object1;
            CLS123 ᐧי1 = (CLS123)object0;
            if(!ʾﹶ$ⁱٴ0.MTH454()) {
                try {
                    jSONObject0 = null;
                    String s = ʾﹶ$ⁱٴ0.MTH455();
                    if(!TextUtils.isEmpty(s)) {
                        jSONObject0 = new JSONObject(s);
                    }
                    goto label_17;
                }
                catch(Throwable throwable0) {
                    try {
                        CLS69.MTH797(throwable0);
                    label_17:
                        if(jSONObject0 != null) {
                            CLS13.MTH434(("" + jSONObject0));
                            String s1 = jSONObject0.optString("msg");
                            if(!TextUtils.isEmpty(s1)) {
                                CLS13.MTH431(s1);
                            }
                            if(jSONObject0.optInt("code", 0) == 1 && jSONObject0.optInt("status", 0) == 1) {
                                ᐧי1.MTH1174();
                                return;
                            }
                            if(ᐧי0 != null) {
                                ᐧי0.MTH1174();
                                return;
                            }
                        }
                        else if(ᐧי0 != null) {
                            ᐧי0.MTH1174();
                            return;
                        }
                        return;
                    }
                    catch(Throwable throwable1) {
                    }
                }
                CLS69.MTH797(throwable1);
            }
            else if(ᐧי0 != null) {
                ᐧי0.MTH1174();
                return;
            }
            return;
        }
        String s2 = (String)object1;
        CLS188 ᴵʾ0 = (CLS188)object0;
        if(!ʾﹶ$ⁱٴ0.MTH454()) {
            try {
                JSONArray jSONArray0 = new JSONArray(CLS69.MTH803(new String(ʾﹶ$ⁱٴ0.FLD71)));
                if(!s2.startsWith("zh")) {
                    s3 = "en";
                }
                else if(!s2.equals("zh_TW") && !s2.equals("zh_HK")) {
                    s3 = "zh";
                }
                else {
                    s3 = "zh_HK";
                }
                SparseArray sparseArray0 = new SparseArray();
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    JSONObject jSONObject1 = jSONArray0.getJSONObject(v);
                    String s4 = jSONObject1.has(s3) ? jSONObject1.getString(s3) : jSONObject1.getString("zh");
                    sparseArray0.append(jSONObject1.getInt("index"), "<i>" + jSONObject1.getString("time") + ":</i><br>" + s4 + "<br><br><br>");
                }
                StringBuilder stringBuilder0 = new StringBuilder();
                int v1 = sparseArray0.size();
                while(true) {
                    --v1;
                    if(v1 < 0) {
                        break;
                    }
                    stringBuilder0.append(((String)sparseArray0.get(v1)));
                }
                ᴵʾ0.MTH1179(stringBuilder0.toString());
                ᴵʾ0.MTH1181("");
            }
            catch(Throwable throwable2) {
                CLS69.MTH797(throwable2);
            }
        }
    }
}


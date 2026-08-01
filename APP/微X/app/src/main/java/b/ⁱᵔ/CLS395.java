// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ContentValues;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.EditText;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS26;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS33;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS568;
import b.ˆʿ.CLS47;
import b.ˆʿ.CLS59;
import b.ˈˈ.CLS580;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS94;
import b.ˊﾞ.CLS612;
import b.ˑٴ.CLS677;
import b.ˑٴ.CLS697;
import b.ˑٴ.CLS702;
import b.ˑٴ.CLS713;
import b.ˑٴ.CLS755;
import b.ˑٴ.CLS766;
import b.ˑٴ.CLS798;
import b.ˑٴ.CLS868;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS1036;
import b.ᐧˉ.CLS1049;
import b.ᐧˉ.CLS1181;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS934;
import b.ᵔʾ.CLS1225;
import b.ᵔʾ.CLS1227;
import b.ᵔʾ.CLS1229;
import b.ᵔʾ.CLS1231;
import b.ⁱʾ.CLS1274;
import b.ⁱʾ.CLS338;
import b.ⁱʾ.CLS359;
import b.ⁱʾ.CLS369;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1629;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS395 {
    public static AlertDialog FLD3767;
    public static Dialog FLD3768;
    public static AlertDialog FLD3769;
    public static AlertDialog FLD3770;
    public static Dialog FLD3771;
    public static AlertDialog FLD3772;
    public static AlertDialog FLD3773;

    public static void MTH5722(Activity activity0, CLS8 ـˏ0, String s, ArrayList arrayList0) {
        if(arrayList0.isEmpty()) {
            return;
        }
        CLS1624 יﹳ0 = new CLS1624(activity0);
        CLS338 יᐧ0 = new CLS338(activity0, arrayList0, יﹳ0);
        CLS523.MTH7160(activity0, s, ((CLS17)new CLS1049(activity0, יᐧ0, יﹳ0, 10)), ((CLS11)new CLS1476(יᐧ0, ـˏ0)));
    }

    // 此方法包含解密的字符串
    public static void MTH5723(Activity activity0, ArrayList arrayList0, CLS677 ˈ0) {
        if(CLS395.FLD3773 != null && CLS395.FLD3773.isShowing()) {
            CLS395.FLD3773.dismiss();
        }
        CLS29 ˎᵢ0 = CLS27.MTH895();
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        CLS395.FLD3773 = CLS523.MTH7160(activity0, CLS27.MTH889("werun_like_all"), ((CLS17)new CLS612(arrayList0, ˑٴ0, ˎᵢ0, activity0, 19)), ((CLS11)new CLS1409(ˎᵢ0, ˑٴ0, ˈ0)));
    }

    // 此方法包含解密的字符串
    public static void MTH5724(Activity activity0) {
        public final class CLS1339 implements CLS11 {
            public final CLS29 FLD3719;
            public final String FLD3720;
            public final String FLD3721;
            public final Activity FLD3722;

            public CLS1339(Activity activity0, CLS29 ˎᵢ0, String s, String s1) {
                this.FLD3719 = ˎᵢ0;
                this.FLD3721 = s;
                this.FLD3720 = s1;
                this.FLD3722 = activity0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS29 ˎᵢ0;
                String s;
                try {
                    s = this.FLD3721;
                    ˎᵢ0 = this.FLD3719;
                    String s1 = ˎᵢ0.MTH925("fsa_n", "");
                    JSONObject jSONObject0 = TextUtils.isEmpty(s1) ? new JSONObject() : new JSONObject(s1);
                    jSONObject0.remove(s);
                    ˎᵢ0.MTH922(jSONObject0.toString(), "fsa_n");
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                try {
                    JSONObject jSONObject1 = new JSONObject(CLS412.MTH5996(ˎᵢ0.MTH925("fsa", "")));
                    jSONObject1.remove(s);
                    ˎᵢ0.MTH922(CLS33.MTH1054(this.FLD3720, jSONObject1.toString()), "fsa");
                    CLS395.MTH5724(this.FLD3722);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
            }
        }


        public final class CLS1354 implements CLS8 {
            public final CLS29 FLD3760;
            public final Activity FLD3761;
            public final String FLD3762;

            public CLS1354(Activity activity0, CLS29 ˎᵢ0, String s) {
                this.FLD3760 = ˎᵢ0;
                this.FLD3762 = s;
                this.FLD3761 = activity0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                String s = ((ContentValues)object0).getAsString("p");
                String s1 = ((ContentValues)object0).getAsString("a");
                String s2 = ((ContentValues)object0).getAsString("n");
                if(!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s)) {
                    boolean z = TextUtils.isEmpty(s2);
                    CLS29 ˎᵢ0 = this.FLD3760;
                    if(!z) {
                        try {
                            String s3 = ˎᵢ0.MTH925("fsa_n", "");
                            JSONObject jSONObject0 = TextUtils.isEmpty(s3) ? new JSONObject() : new JSONObject(s3);
                            jSONObject0.put(s1, s2);
                            ˎᵢ0.MTH922(jSONObject0.toString(), "fsa_n");
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                        }
                    }
                    String s4 = CLS412.MTH5996(ˎᵢ0.MTH925("fsa", ""));
                    try {
                        JSONObject jSONObject1 = TextUtils.isEmpty(s4) ? new JSONObject() : new JSONObject(s4);
                        jSONObject1.put(s1, s);
                        ˎᵢ0.MTH922(CLS33.MTH1054(this.FLD3762, jSONObject1.toString()), "fsa");
                        CLS395.MTH5724(this.FLD3761);
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                }
            }
        }


        public final class CLS1355 implements CLS8 {
            public final CLS29 FLD3763;
            public final String FLD3764;
            public final String FLD3765;
            public final Activity FLD3766;

            public CLS1355(Activity activity0, CLS29 ˎᵢ0, String s, String s1) {
                this.FLD3763 = ˎᵢ0;
                this.FLD3765 = s;
                this.FLD3764 = s1;
                this.FLD3766 = activity0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                String s = this.FLD3765;
                String s1 = ((ContentValues)object0).getAsString("p");
                String s2 = ((ContentValues)object0).getAsString("a");
                String s3 = ((ContentValues)object0).getAsString("n");
                if(TextUtils.isEmpty(s2)) {
                    return;
                }
                CLS29 ˎᵢ0 = this.FLD3763;
                String s4 = ˎᵢ0.MTH925("fsa", "");
                if(!TextUtils.isEmpty(s3)) {
                    try {
                        String s5 = ˎᵢ0.MTH925("fsa_n", "");
                        JSONObject jSONObject0 = TextUtils.isEmpty(s5) ? new JSONObject() : new JSONObject(s5);
                        jSONObject0.put(s2, s3);
                        ˎᵢ0.MTH922(jSONObject0.toString(), "fsa_n");
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                try {
                    JSONObject jSONObject1 = new JSONObject(CLS33.MTH1053(s, s4));
                    boolean z = TextUtils.isEmpty(s1);
                    String s6 = this.FLD3764;
                    if(z) {
                        s1 = jSONObject1.getString(s6);
                    }
                    if(!s2.equals(s6)) {
                        jSONObject1.remove(s6);
                    }
                    jSONObject1.put(s2, s1);
                    ˎᵢ0.MTH922(CLS33.MTH1054(s, jSONObject1.toString()), "fsa");
                    CLS395.MTH5724(this.FLD3766);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
            }
        }

        if(CLS395.FLD3771 != null && CLS395.FLD3771.isShowing()) {
            CLS395.FLD3771.dismiss();
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        CLS29 ˎᵢ0 = CLS27.MTH895();
        CLS26 ˊˏ0 = (CLS26)CLS40.FLD157.MTH1118(CLS26.class);
        String s = CLS431.MTH6161((ˊˏ0.MTH876() + ˊˏ0.MTH874()).getBytes());
        HashMap hashMap0 = new HashMap();
        try {
            String s1 = ˎᵢ0.MTH925("fsa_n", "");
            JSONObject jSONObject0 = TextUtils.isEmpty(s1) ? new JSONObject() : new JSONObject(s1);
            Iterator iterator0 = jSONObject0.keys();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                hashMap0.put(((String)object0), jSONObject0.getString(((String)object0)));
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        String s2 = ˎᵢ0.MTH925("fsa", "");
        try {
            String s3 = CLS412.MTH5996(s2);
            Iterator iterator1 = (TextUtils.isEmpty(s3) ? new JSONObject() : new JSONObject(s3)).keys();
            while(iterator1.hasNext()) {
                Object object1 = iterator1.next();
                String s4 = (String)object1;
                if(hashMap0.containsKey(s4)) {
                    linkedHashMap0.put(((String)hashMap0.get(s4)), s4);
                }
                else {
                    linkedHashMap0.put(s4, s4);
                }
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
        CLS395.FLD3771 = CLS523.MTH7136(false, activity0, CLS27.MTH889("fast_switch_account"), "", linkedHashMap0, false, ((CLS7)new CLS1225(20)), ((CLS7)new CLS612(activity0, ˎᵢ0, s, hashMap0, 18)), ((CLS378)new CLS1385(activity0, ˎᵢ0, s)), true);
    }

    // 此方法包含解密的字符串
    public static void MTH5725(Activity activity0, String s, int v, boolean z, CLS8 ـˏ0) {
        public final class CLS1331 implements CLS11 {
            public final CLS8 FLD3700;
            public final HashSet FLD3701;

            public CLS1331(CLS8 ـˏ0, HashSet hashSet0) {
                this.FLD3701 = hashSet0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS8 ـˏ0 = this.FLD3700;
                if(ـˏ0 != null) {
                    try {
                        for(Object object0: this.FLD3701) {
                            ـˏ0.MTH786(((String)object0));
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
            }
        }

        String s1 = CLS27.MTH889("web_fav_image");
        HashSet hashSet0 = new HashSet();
        CLS523.MTH7160(activity0, s1, ((CLS17)new CLS1435(hashSet0, activity0, s, z, v)), ((CLS11)new CLS1331(ـˏ0, hashSet0)));
    }

    // 此方法包含解密的字符串
    public static void MTH5726(Activity activity0, long v, CLS12 ᵔʾ0, boolean z, boolean z1, boolean z2) {
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        ˑٴ0.MTH800(CLS27.MTH889("hour"));
        ˑٴ0.MTH7278(2);
        CLS523.MTH7157(!z, new CLS18[]{ˑٴ0});
        CLS1622 ˑٴ1 = new CLS1622(activity0);
        ˑٴ1.MTH800(CLS27.MTH889("minute"));
        ˑٴ1.MTH7278(2);
        CLS523.MTH7157(!z1, new CLS18[]{ˑٴ1});
        CLS1622 ˑٴ2 = new CLS1622(activity0);
        ˑٴ2.MTH800(CLS27.MTH889("second"));
        ˑٴ2.MTH7278(2);
        CLS523.MTH7157(false, new CLS18[]{ˑٴ2});
        CLS1622 ˑٴ3 = new CLS1622(activity0);
        ˑٴ3.MTH800(CLS27.MTH889("millisecond"));
        ˑٴ3.MTH7278(2);
        CLS523.MTH7157(!z2, new CLS18[]{ˑٴ3});
        if(z || z1 || z2) {
            ContentValues contentValues0 = CLS481.MTH6696(v);
            ˑٴ0.MTH7277(contentValues0.getAsString("hours"));
            ˑٴ1.MTH7277(contentValues0.getAsString("minutes"));
            ˑٴ2.MTH7277(contentValues0.getAsString("seconds"));
            ˑٴ3.MTH7277(contentValues0.getAsString("milliseconds"));
        }
        else {
            ˑٴ2.MTH7277(String.valueOf(v / 1000L));
        }
        CLS523.MTH7160(activity0, CLS27.MTH889("set_time"), ((CLS17)new CLS766(activity0, ˑٴ0, ˑٴ1, ˑٴ2, ˑٴ3, 10)), ((CLS11)new CLS1276(ˑٴ0, ˑٴ1, ˑٴ2, ˑٴ3, ᵔʾ0)));
    }

    // 此方法包含解密的字符串
    public static void MTH5727(Activity activity0, ContentValues contentValues0, CLS12 ᵔʾ0) {
        public final class CLS1351 implements CLS11 {
            public final CLS12 FLD3752;
            public final ContentValues FLD3753;

            public CLS1351(CLS12 ᵔʾ0, ContentValues contentValues0) {
                this.FLD3753 = contentValues0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS12 ᵔʾ0 = this.FLD3752;
                if(ᵔʾ0 != null) {
                    ᵔʾ0.MTH791(this.FLD3753);
                }
            }
        }

        ContentValues contentValues1 = new ContentValues();
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        ˑٴ0.MTH800(CLS27.MTH889("latitude"));
        ˑٴ0.FLD5252 = new CLS934(contentValues1, 1);
        CLS1622 ˑٴ1 = new CLS1622(activity0);
        ˑٴ1.MTH800(CLS27.MTH889("longitude"));
        ˑٴ1.FLD5252 = new CLS934(contentValues1, 2);
        CLS1622 ˑٴ2 = new CLS1622(activity0);
        ˑٴ2.MTH800(CLS27.MTH889("address"));
        ˑٴ2.FLD5252 = new CLS934(contentValues1, 3);
        CLS1622 ˑٴ3 = new CLS1622(activity0);
        ˑٴ3.MTH800(CLS27.MTH889("poiname"));
        ˑٴ3.FLD5252 = new CLS934(contentValues1, 4);
        if(contentValues0 != null) {
            if(contentValues0.containsKey("lat")) {
                contentValues1.put("lat", contentValues0.getAsString("lat"));
                ˑٴ0.MTH7277(contentValues0.getAsString("lat"));
            }
            if(contentValues0.containsKey("lng")) {
                contentValues1.put("lng", contentValues0.getAsString("lng"));
                ˑٴ1.MTH7277(contentValues0.getAsString("lng"));
            }
            if(contentValues0.containsKey("addr")) {
                contentValues1.put("addr", contentValues0.getAsString("addr"));
                ˑٴ2.MTH7277(contentValues0.getAsString("addr"));
            }
            if(contentValues0.containsKey("poi")) {
                contentValues1.put("poi", contentValues0.getAsString("poi"));
                ˑٴ3.MTH7277(contentValues0.getAsString("poi"));
            }
        }
        CLS523.MTH7145(activity0, CLS27.MTH889("location_msg"), ((CLS17)new CLS580(activity0, contentValues1, ˑٴ3, ˑٴ2, ˑٴ0, ˑٴ1, 3)), ((CLS11)new CLS1351(ᵔʾ0, contentValues1)));
    }

    // 此方法包含解密的字符串
    public static void MTH5728(Activity activity0, CLS8 ـˏ0) {
        public final class CLS1340 implements CLS11 {
            public final String[] FLD3723;
            public final CLS8 FLD3724;

            public CLS1340(CLS8 ـˏ0, String[] arr_s) {
                this.FLD3723 = arr_s;
                this.FLD3724 = ـˏ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                try {
                    String s = this.FLD3723[0];
                    if(TextUtils.isEmpty(s)) {
                        return;
                    }
                    CLS8 ـˏ0 = this.FLD3724;
                    if(ـˏ0 != null) {
                        ـˏ0.MTH786(s);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }


        public final class CLS1342 implements CLS11 {
            public final CLS29 FLD3729;
            public final ArrayList FLD3730;
            public final String FLD3731;
            public final CLS369 FLD3732;

            public CLS1342(CLS369 ﾞᵎ0, CLS29 ˎᵢ0, String s, ArrayList arrayList0) {
                this.FLD3729 = ˎᵢ0;
                this.FLD3731 = s;
                this.FLD3730 = arrayList0;
                this.FLD3732 = ﾞᵎ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                try {
                    HashSet hashSet0 = new HashSet(Arrays.asList(this.FLD3729.MTH925("mass_send_data_tags", "").split(",")));
                    hashSet0.remove(this.FLD3731);
                    String s = TextUtils.join(",", hashSet0);
                    this.FLD3729.MTH922(s, "mass_send_data_tags");
                    this.FLD3729.MTH932("mass_send_data_val_" + this.FLD3731);
                    this.FLD3730.remove(this.FLD3731);
                    this.FLD3732.notifyDataSetChanged();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        String[] arr_s = {""};
        CLS29 ˎᵢ0 = CLS27.MTH895();
        CLS523.MTH7160(activity0, CLS27.MTH889("load"), ((CLS17)new CLS1049(ˎᵢ0, activity0, arr_s, 11)), ((CLS11)new CLS1340(ـˏ0, arr_s)));
    }

    // 此方法包含解密的字符串
    public static void MTH5729(Activity activity0, CLS8 ـˏ0, String s) {
        ContentValues contentValues0 = new ContentValues();
        if(TextUtils.isEmpty(s)) {
            contentValues0.put("startH", -1);
            contentValues0.put("startM", 0);
            contentValues0.put("endH", -1);
            contentValues0.put("endM", 0);
        }
        else {
            String[] arr_s = s.split(";");
            String[] arr_s1 = arr_s[0].split(":");
            String[] arr_s2 = arr_s[1].split(":");
            contentValues0.put("startH", arr_s1[0]);
            contentValues0.put("startM", arr_s1[1]);
            contentValues0.put("endH", arr_s2[0]);
            contentValues0.put("endM", arr_s2[1]);
        }
        CLS1626 ـﹳ0 = new CLS1626(activity0);
        ـﹳ0.MTH800(CLS27.MTH889("start_time"));
        CLS1626 ـﹳ1 = new CLS1626(activity0);
        ـﹳ1.MTH800(CLS27.MTH889("end_time"));
        CLS702 ˊᵔ0 = new CLS702(contentValues0, ـﹳ0, ـﹳ1, 18);
        ـﹳ0.MTH7324(new CLS407(activity0, contentValues0, ˊᵔ0, 0));
        ـﹳ1.MTH7324(new CLS407(activity0, contentValues0, ˊᵔ0, 1));
        CLS523.MTH7160(activity0, "", ((CLS17)new CLS1049(activity0, ـﹳ0, ـﹳ1, 15)), ((CLS11)new CLS1330(ـˏ0, contentValues0)));
    }

    // 此方法包含解密的字符串
    public static void MTH5730(Activity activity0, CLS868 ﹶˏ0) {
        if(CLS395.FLD3767 != null && CLS395.FLD3767.isShowing()) {
            CLS395.FLD3767.dismiss();
        }
        CLS1629 ⁱˉ0 = new CLS1629(activity0);
        CLS395.FLD3767 = CLS523.MTH7160(activity0, CLS27.MTH889("select_camera"), ((CLS17)new CLS1481(0, ⁱˉ0)), ((CLS11)new CLS1578(ⁱˉ0, ﹶˏ0)));
    }

    // 此方法包含解密的字符串
    public static void MTH5731(Activity activity0, CLS697 ˊˉ0, Object object0) {
        long v = CLS166.MTH3185(object0, "field_createTime");
        int v1 = CLS166.MTH3181(object0, "field_type");
        Object object1 = CLS166.MTH3194(object0, "field_content");
        Calendar calendar0 = Calendar.getInstance();
        calendar0.setTime(new Date(v));
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        CLS523.MTH7160(activity0, CLS27.MTH889("modify_message"), ((CLS17)new CLS755(v1, ˑٴ0, ((String)object1), activity0, calendar0)), ((CLS11)new CLS1459(ˑٴ0, calendar0, ˊˉ0)));
    }

    public static void MTH5732(Activity activity0, String s, ArrayList arrayList0, String s1, CLS12 ᵔʾ0) {
        public final class CLS1336 implements CLS11 {
            public final CLS12 FLD3713;
            public final CLS1629 FLD3714;

            public CLS1336(CLS12 ᵔʾ0, CLS1629 ⁱˉ0) {
                this.FLD3714 = ⁱˉ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS12 ᵔʾ0 = this.FLD3713;
                if(ᵔʾ0 != null) {
                    ᵔʾ0.MTH791(this.FLD3714.MTH7373());
                }
            }
        }

        CLS1629 ⁱˉ0 = new CLS1629(activity0);
        ⁱˉ0.FLD5352 = true;
        CLS523.MTH7160(activity0, s, ((CLS17)new CLS1049(arrayList0, ⁱˉ0, s1, 14)), ((CLS11)new CLS1336(ᵔʾ0, ⁱˉ0)));
    }

    // 此方法包含解密的字符串
    public static void MTH5733(Activity activity0, boolean z, CLS3 ˆٴ0) {
        public final class CLS1343 implements CLS8 {
            public final CLS59 FLD3733;
            public final CLS1620 FLD3734;

            public CLS1343(CLS59 ⁱᵔ0, CLS1620 ˊˏ0) {
                this.FLD3734 = ˊˏ0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                CLS59 ⁱᵔ0 = this.FLD3733;
                CLS1620 ˊˏ0 = this.FLD3734;
                if(object0 == null) {
                    ArrayList arrayList0 = new ArrayList();
                    arrayList0.add(CLS27.MTH889("empty"));
                    for(Object object1: ⁱᵔ0.MTH1285()) {
                        arrayList0.add(((CLS94)object1).FLD398);
                    }
                    ˊˏ0.MTH7247(arrayList0);
                    return;
                }
                ⁱᵔ0.MTH1281(((CLS94)object0));
                ⁱᵔ0.MTH1287();
                String s = ((CLS94)object0).FLD398;
                if(TextUtils.isEmpty(s)) {
                    return;
                }
                ˊˏ0.MTH7246(s);
                ˊˏ0.MTH7254(s);
            }
        }


        public final class CLS1347 implements CLS11 {
            public final CLS3 FLD3743;

            public CLS1347(CLS3 ˆٴ0) {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS3 ˆٴ0 = this.FLD3743;
                if(ˆٴ0 != null) {
                    ˆٴ0.MTH774();
                }
            }
        }

        if(!z) {
            ˆٴ0.MTH774();
            return;
        }
        CLS523.MTH7160(activity0, CLS27.MTH889("select_watermark"), ((CLS17)new CLS1049(activity0, CLS27.MTH895(), CLS59.FLD183, 9)), ((CLS11)new CLS1347(ˆٴ0)));
    }

    // 此方法包含解密的字符串
    public static void MTH5734(Activity activity0, boolean z) {
        CLS371.FLD3470.getClass();
        ArrayList arrayList0 = new ArrayList();
        Cursor cursor0 = CLS371.FLD3470.MTH5307("select username from rconversation where parentRef = \'hidden_conv_parent\'", null);
        if(cursor0 != null) {
            if(cursor0.moveToFirst()) {
                while(true) {
                    arrayList0.add(cursor0.getString(cursor0.getColumnIndex("username")));
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
            cursor0.close();
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            String s = (String)object0;
            if(!CLS21.FLD76.MTH830("isHidden", new Object[]{s})) {
                arrayList1.add(new CLS78(s, CLS371.FLD3470.MTH5311(s)));
            }
        }
        CLS387.MTH5585(z, activity0, arrayList1, ((CLS2)new CLS1489()), "", -1);
    }

    // 此方法包含解密的字符串
    public static void MTH5735(Activity activity0, int v, String s, String s1, String s2, CLS8 ـˏ0) {
        public final class CLS1333 implements CLS11 {
            public final CLS1622 FLD3704;
            public final CLS8 FLD3705;
            public final CLS1622 FLD3706;
            public final CLS1622 FLD3707;
            public final int FLD3708;

            public CLS1333(CLS1622 ˑٴ0, CLS1622 ˑٴ1, CLS1622 ˑٴ2, int v, CLS8 ـˏ0) {
                this.FLD3707 = ˑٴ1;
                this.FLD3706 = ˑٴ2;
                this.FLD3708 = v;
                this.FLD3705 = ـˏ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                String s = this.FLD3704.MTH7285();
                String s1 = this.FLD3707.MTH7285();
                String s2 = this.FLD3706.MTH7285();
                if(!TextUtils.isEmpty(s) && (this.FLD3708 != 1 || !TextUtils.isEmpty(s1))) {
                    CLS8 ـˏ0 = this.FLD3705;
                    if(ـˏ0 != null) {
                        ContentValues contentValues0 = new ContentValues();
                        contentValues0.put("a", s);
                        contentValues0.put("p", s1);
                        contentValues0.put("n", s2);
                        ـˏ0.MTH786(contentValues0);
                    }
                }
            }
        }

        CLS1622 ˑٴ0 = new CLS1622(activity0);
        CLS1622 ˑٴ1 = new CLS1622(activity0);
        CLS1622 ˑٴ2 = new CLS1622(activity0);
        CLS523.MTH7145(activity0, "", ((CLS17)new CLS1231(ˑٴ0, s, ˑٴ1, s2, ˑٴ2, s1, v, activity0)), ((CLS11)new CLS1333(ˑٴ0, ˑٴ2, ˑٴ1, v, ـˏ0)));
    }

    public static void MTH5736(String s, Activity activity0, CLS8 ـˏ0, HashSet hashSet0, boolean z) {
        public final class CLS1332 implements CLS8 {
            public final ArrayList FLD3702;
            public final CLS359 FLD3703;

            public CLS1332(CLS359 ⁱˉ0, ArrayList arrayList0) {
                this.FLD3702 = arrayList0;
                this.FLD3703 = ⁱˉ0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                try {
                    CLS359 ⁱˉ0 = this.FLD3703;
                    ArrayList arrayList0 = this.FLD3702;
                    for(Object object1: ((ArrayList)object0)) {
                        ContentValues contentValues0 = new ContentValues();
                        contentValues0.put("img", ((String)object1));
                        contentValues0.put("type", -2);
                        contentValues0.put("desc", CLS27.MTH889("image"));
                        arrayList0.add(contentValues0);
                        ⁱˉ0.MTH5235(arrayList0);
                        ⁱˉ0.MTH5231(contentValues0);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }


        public final class CLS1335 implements CLS8 {
            public final ArrayList FLD3711;
            public final CLS359 FLD3712;

            public CLS1335(CLS359 ⁱˉ0, ArrayList arrayList0) {
                this.FLD3711 = arrayList0;
                this.FLD3712 = ⁱˉ0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("img", ((String)object0));
                contentValues0.put(CLS182.MTH3479(0xFFFFFFD1, contentValues0, "type", 4101263966733128501L), CLS27.MTH889("gif"));
                this.FLD3711.add(contentValues0);
                this.FLD3712.MTH5235(this.FLD3711);
                this.FLD3712.MTH5231(contentValues0);
            }
        }


        public final class CLS1338 implements CLS8 {
            public final ArrayList FLD3717;
            public final CLS359 FLD3718;

            public CLS1338(CLS359 ⁱˉ0, ArrayList arrayList0) {
                this.FLD3717 = arrayList0;
                this.FLD3718 = ⁱˉ0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                try {
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("img", ((String)object0));
                    contentValues0.put("type", -2);
                    contentValues0.put("desc", CLS27.MTH889("image"));
                    this.FLD3717.add(contentValues0);
                    this.FLD3718.MTH5235(this.FLD3717);
                    this.FLD3718.MTH5231(contentValues0);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }


        public final class CLS1344 implements CLS2 {
            public final ArrayList FLD3735;
            public final CLS359 FLD3736;

            public CLS1344(CLS359 ⁱˉ0, ArrayList arrayList0) {
                this.FLD3735 = arrayList0;
                this.FLD3736 = ⁱˉ0;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                ContentValues contentValues0 = new ContentValues();
                String s2 = CLS182.MTH3479(-4, contentValues0, "type", 0x38EA9E9F2B3CD335L);
                CLS182.MTH3478(0x38EA9EA42B3CD335L, new StringBuilder(), 0x38EA9EAF2B3CD335L, s1, contentValues0, s2);
                contentValues0.put("avatar", s);
                this.FLD3735.add(contentValues0);
                this.FLD3736.MTH5235(this.FLD3735);
                this.FLD3736.MTH5231(contentValues0);
            }
        }


        public final class CLS1346 implements CLS11 {
            public final CLS359 FLD3741;
            public final CLS8 FLD3742;

            public CLS1346(CLS359 ⁱˉ0, CLS8 ـˏ0) {
                this.FLD3742 = ـˏ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                ArrayList arrayList0 = this.FLD3741.MTH5234();
                CLS8 ـˏ0 = this.FLD3742;
                if(ـˏ0 != null) {
                    ـˏ0.MTH786(arrayList0);
                }
            }
        }


        public final class CLS1348 implements CLS8 {
            public final ArrayList FLD3744;
            public final CLS359 FLD3745;

            public CLS1348(CLS359 ⁱˉ0, ArrayList arrayList0) {
                this.FLD3744 = arrayList0;
                this.FLD3745 = ⁱˉ0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                if(!TextUtils.isEmpty(((String)object0))) {
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("type", -16);
                    contentValues0.put("path", ((String)object0));
                    contentValues0.put("desc", CLS27.MTH889("video"));
                    this.FLD3744.add(contentValues0);
                    this.FLD3745.MTH5235(this.FLD3744);
                    this.FLD3745.MTH5231(contentValues0);
                }
            }
        }


        public final class CLS1350 implements CLS8 {
            public final ArrayList FLD3750;
            public final CLS359 FLD3751;

            public CLS1350(CLS359 ⁱˉ0, ArrayList arrayList0) {
                this.FLD3750 = arrayList0;
                this.FLD3751 = ⁱˉ0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                ArrayList arrayList0 = CLS412.MTH6012(CLS27.MTH895().MTH937(CLS182.MTH3489(4101315111203689269L, new StringBuilder(), object0), new JSONArray()));
                this.FLD3750.clear();
                this.FLD3750.addAll(arrayList0);
                this.FLD3751.MTH5235(this.FLD3750);
                this.FLD3751.MTH5229();
            }
        }

        ArrayList arrayList0 = new ArrayList();
        CLS1624 יﹳ0 = new CLS1624(activity0);
        CLS359 ⁱˉ0 = new CLS359(activity0, arrayList0);
        CLS523.MTH7160(activity0, s, ((CLS17)new CLS1036(activity0, hashSet0, z, CLS500.FLD4928, arrayList0, ⁱˉ0, CLS47.FLD167, יﹳ0)), ((CLS11)new CLS1346(ⁱˉ0, ـˏ0)));
    }

    // 此方法包含解密的字符串
    public static void MTH5737(Activity activity0, String s) {
        public final class CLS1341 implements CLS8 {
            public final CLS1225 FLD3725;
            public final CLS338 FLD3726;
            public final ContentValues FLD3727;
            public final CLS3 FLD3728;

            public CLS1341(CLS1225 ʻˏ0, ContentValues contentValues0, CLS338 יᐧ0, CLS3 ˆٴ0) {
                this.FLD3727 = contentValues0;
                this.FLD3726 = יᐧ0;
                this.FLD3728 = ˆٴ0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 去混淆评级： 低(22)
            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                String[] arr_s = ((String)object0).split(";");
                String s = arr_s[0];
                this.FLD3725.getClass();
                this.FLD3727.put("desc", CLS27.MTH889("start_time") + ": " + CLS1225.MTH4648(s) + ", " + CLS27.MTH889("end_time") + ": " + CLS1225.MTH4648(arr_s[1]));
                this.FLD3727.put("timeframe", ((String)object0));
                this.FLD3726.notifyDataSetChanged();
                this.FLD3728.MTH774();
            }
        }


        public final class CLS1345 implements CLS8 {
            public final CLS1225 FLD3737;
            public final CLS338 FLD3738;
            public final ArrayList FLD3739;
            public final CLS3 FLD3740;

            public CLS1345(CLS1225 ʻˏ0, ArrayList arrayList0, CLS338 יᐧ0, CLS3 ˆٴ0) {
                this.FLD3739 = arrayList0;
                this.FLD3738 = יᐧ0;
                this.FLD3740 = ˆٴ0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                ContentValues contentValues0 = new ContentValues();
                String[] arr_s = ((String)object0).split(";");
                String s = arr_s[0];
                this.FLD3737.getClass();
                contentValues0.put("desc", CLS27.MTH889("start_time") + ": " + CLS1225.MTH4648(s) + ", " + CLS27.MTH889("end_time") + ": " + CLS1225.MTH4648(arr_s[1]));
                contentValues0.put("timeframe", ((String)object0));
                contentValues0.put("enable", Boolean.FALSE);
                this.FLD3739.add(contentValues0);
                this.FLD3738.MTH5123(this.FLD3739);
                this.FLD3740.MTH774();
            }
        }


        public final class CLS1349 implements CLS11 {
            public final CLS338 FLD3746;
            public final ContentValues FLD3747;
            public final ArrayList FLD3748;
            public final CLS3 FLD3749;

            public CLS1349(CLS338 יᐧ0, ArrayList arrayList0, ContentValues contentValues0, CLS3 ˆٴ0) {
                this.FLD3748 = arrayList0;
                this.FLD3747 = contentValues0;
                this.FLD3749 = ˆٴ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS338 יᐧ0 = this.FLD3746;
                יᐧ0.MTH5130();
                ArrayList arrayList0 = this.FLD3748;
                arrayList0.remove(this.FLD3747);
                for(int v = 0; v < יᐧ0.getCount(); ++v) {
                    ContentValues contentValues0 = (ContentValues)יᐧ0.getItem(v);
                    if(contentValues0.containsKey("enable") && contentValues0.getAsBoolean("enable").booleanValue()) {
                        יᐧ0.MTH5125(v, true);
                    }
                }
                יᐧ0.MTH5123(arrayList0);
                this.FLD3749.MTH774();
            }
        }


        public final class CLS1352 implements CLS11 {
            public final ArrayList FLD3754;
            public final CLS338 FLD3755;
            public final String FLD3756;

            public CLS1352(ArrayList arrayList0, String s, CLS338 יᐧ0) {
                this.FLD3756 = s;
                this.FLD3755 = יᐧ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                this.FLD3754.clear();
                CLS27.MTH895().MTH922("", this.FLD3756);
                this.FLD3755.MTH5123(this.FLD3754);
            }
        }

        CLS1624 יﹳ0 = new CLS1624(activity0);
        יﹳ0.MTH7311();
        ArrayList arrayList0 = new ArrayList();
        CLS1225 ʻˏ0 = new CLS1225(21);
        String s1 = CLS27.MTH895().MTH925(s, "");
        if(!TextUtils.isEmpty(s1)) {
            if(s1.startsWith("{")) {
                try {
                    JSONArray jSONArray0 = new JSONObject(s1).getJSONArray("timeframes");
                    for(int v = 0; v < jSONArray0.length(); ++v) {
                        JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                        String s2 = jSONObject0.getString("timeframe");
                        ContentValues contentValues0 = new ContentValues();
                        contentValues0.put("enable", Boolean.valueOf(jSONObject0.optBoolean("enable")));
                        contentValues0.put("timeframe", s2);
                        String[] arr_s = s2.split(";");
                        contentValues0.put("desc", CLS27.MTH889("start_time") + ": " + CLS1225.MTH4648(arr_s[0]) + ", " + CLS27.MTH889("end_time") + ": " + CLS1225.MTH4648(arr_s[1]));
                        arrayList0.add(contentValues0);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
            else {
                ContentValues contentValues1 = new ContentValues();
                String[] arr_s1 = s1.split(";");
                contentValues1.put("desc", CLS27.MTH889("start_time") + ": " + CLS1225.MTH4648(arr_s1[0]) + ", " + CLS27.MTH889("end_time") + ": " + CLS1225.MTH4648(arr_s1[1]));
                contentValues1.put("timeframe", s1);
                contentValues1.put("enable", Boolean.TRUE);
                arrayList0.add(contentValues1);
            }
        }
        CLS338 יᐧ0 = new CLS338(activity0, arrayList0, יﹳ0);
        CLS1274 ﾞˎ0 = new CLS1274(יᐧ0, s, 24);
        CLS523.MTH7150(activity0, CLS27.MTH889("set_timeframe"), ((CLS17)new CLS1181(activity0, ʻˏ0, arrayList0, יᐧ0, ﾞˎ0, s, יﹳ0, 2)));
    }

    // 此方法包含解密的字符串
    public static void MTH5738(Activity activity0, boolean z) {
        boolean z1 = CLS182.MTH3470(4100851559678399285L);
        ArrayList arrayList0 = CLS371.FLD3470.MTH5377();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            String s = (String)object0;
            if((!z1 == 0 || !CLS371.FLD3470.MTH5379(s)) && !CLS21.FLD76.MTH830("isHidden", new Object[]{s})) {
                arrayList1.add(new CLS78(s, CLS371.FLD3470.MTH5311(s)));
            }
        }
        CLS387.MTH5585(z, activity0, arrayList1, ((CLS2)new CLS1475(activity0, !z1)), "", -1);
    }

    // 此方法包含解密的字符串
    public static void MTH5739(Activity activity0, long v, long v1, CLS568 יᐧ0) {
        CLS1621 ˎᵢ0 = new CLS1621(activity0);
        ˎᵢ0.MTH800(CLS27.MTH889("start_time"));
        ˎᵢ0.MTH7268(v);
        CLS1621 ˎᵢ1 = new CLS1621(activity0);
        ˎᵢ1.MTH800(CLS27.MTH889("end_time"));
        ˎᵢ1.MTH7268(v1);
        CLS523.MTH7160(activity0, CLS27.MTH889("set_timeframe"), ((CLS17)new CLS1049(activity0, ˎᵢ0, ˎᵢ1, 13)), ((CLS11)new CLS1597(יᐧ0, ˎᵢ0, ˎᵢ1)));
    }

    // 此方法包含解密的字符串
    public static void MTH5740(Activity activity0, CLS7 יᐧ0, HashSet hashSet0) {
        public final class CLS1337 implements CLS11 {
            public final ContentValues[] FLD3715;
            public final CLS7 FLD3716;

            public CLS1337(ContentValues[] arr_contentValues, CLS7 יᐧ0) {
                this.FLD3716 = יᐧ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                try {
                    ContentValues contentValues0 = this.FLD3715[0];
                    if(contentValues0 == null) {
                        return;
                    }
                    CLS7 יᐧ0 = this.FLD3716;
                    if(יᐧ0 != null) {
                        יᐧ0.MTH784(contentValues0);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        if(CLS395.FLD3769 != null && CLS395.FLD3769.isShowing()) {
            CLS395.FLD3769.dismiss();
        }
        String s = CLS27.MTH889("select_fav_item");
        ContentValues[] arr_contentValues = {null};
        CLS395.FLD3769 = CLS523.MTH7160(activity0, s, ((CLS17)new CLS1049(activity0, hashSet0, arr_contentValues, 12)), ((CLS11)new CLS1337(arr_contentValues, יᐧ0)));
    }

    // 此方法包含解密的字符串
    public static void MTH5741(Activity activity0, boolean z) {
        CLS29 ˎᵢ0 = (CLS29)CLS40.FLD157.MTH1118(CLS29.class);
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: ˎᵢ0.MTH929("regioncode_%")) {
            linkedHashMap0.put(((String)((Pair)object0).second), ((Pair)object0).first);
        }
        CLS395.FLD3768 = CLS523.MTH7136(z, activity0, CLS27.MTH889("add_fake_region"), "", linkedHashMap0, false, null, ((CLS7)new CLS1394(activity0, ˎᵢ0, z)), ((CLS378)new CLS1394(activity0, ˎᵢ0, z)), true);
    }

    // 此方法包含解密的字符串
    public static void MTH5742(Activity activity0, String s, String s1, CLS798 ᴵٴ0, CLS713 ˎʻ0) {
        CLS1421 ˋˑ0;
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        CLS1622 ˑٴ1 = new CLS1622(activity0);
        CLS702 ˊᵔ0 = new CLS702(ˑٴ0, ˑٴ1, ᴵٴ0, 15);
        String s2 = "";
        if(ˎʻ0 == null) {
            ˋˑ0 = new CLS1421(ˊᵔ0);
        }
        else {
            s2 = CLS27.MTH889("restore");
            ˋˑ0 = new CLS1648(ˎʻ0, ˊᵔ0);
        }
        CLS523.MTH7151(activity0, CLS27.MTH889("set_fake_transfer_amount"), ((CLS17)new CLS766(ˑٴ0, s, ˑٴ1, s1, activity0, 9)), ((CLS11)ˋˑ0), s2);
    }

    // 此方法包含解密的字符串
    public static void MTH5743(Activity activity0, boolean z) {
        public final class CLS1353 implements CLS11 {
            public final CLS1622 FLD3757;
            public final CLS29 FLD3758;
            public final CLS1622 FLD3759;

            public CLS1353(CLS1622 ˑٴ0, CLS1622 ˑٴ1, CLS29 ˎᵢ0) {
                this.FLD3759 = ˑٴ1;
                this.FLD3758 = ˎᵢ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                String s = this.FLD3757.MTH7285();
                String s1 = this.FLD3759.MTH7285();
                try {
                    this.FLD3758.MTH922(s, "preconfigdice");
                    this.FLD3758.MTH922(s1, "preconfigrps");
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        CLS29 ˎᵢ0 = (CLS29)CLS40.FLD157.MTH1118(CLS29.class);
        String s = CLS27.MTH889("pre_config_dice");
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        CLS1622 ˑٴ1 = new CLS1622(activity0);
        CLS612 ᵔʾ0 = new CLS612(ˑٴ0, ˎᵢ0, ˑٴ1, activity0, 17);
        CLS1353 ʿʼ$ﾞˎ0 = new CLS1353(ˑٴ0, ˑٴ1, ˎᵢ0);
        if(z) {
            CLS523.MTH7153(activity0, s, ((CLS379)ᵔʾ0), ((CLS11)ʿʼ$ﾞˎ0));
            return;
        }
        CLS523.MTH7160(activity0, s, ((CLS17)new CLS1229(29, ᵔʾ0)), ((CLS11)ʿʼ$ﾞˎ0));
    }

    // 此方法包含解密的字符串
    public static void MTH5744(boolean z, Activity activity0, ArrayList arrayList0, CLS3 ˆٴ0) {
        public final class CLS1334 implements CLS2 {
            public final Activity FLD3709;
            public final CLS3 FLD3710;

            public CLS1334(Activity activity0, CLS3 ˆٴ0) {
                this.FLD3710 = ˆٴ0;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS1582 ⁱٴ0 = new CLS1582(this, s, arrayList0);
                CLS523.MTH7142(this.FLD3709, ((CLS11)ⁱٴ0));
            }
        }

        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            arrayList1.add(new CLS78(((String)object0), CLS371.FLD3470.MTH5311(((String)object0))));
        }
        CLS387.MTH5585(z, activity0, arrayList1, ((CLS2)new CLS1334(activity0, ˆٴ0)), "", -1);
    }

    // 此方法包含解密的字符串
    public static void MTH5745(Activity activity0, CLS11 ᐧⁱ0, String s, String s1) {
        if(TextUtils.isEmpty(s)) {
            if(ᐧⁱ0 != null) {
                ᐧⁱ0.MTH790();
            }
            return;
        }
        AlertDialog[] arr_alertDialog = new AlertDialog[1];
        arr_alertDialog[0] = CLS523.MTH7160(activity0, CLS27.MTH889("disclaimer"), ((CLS17)new CLS1227(activity0, s, s1, ((Serializable)arr_alertDialog), ᐧⁱ0, 30, 7)), ᐧⁱ0);
    }

    public static void MTH5746(Activity activity0, String s) {
        try {
            int v = Build.VERSION.SDK_INT;
            AlertDialog.Builder alertDialog$Builder0 = v < 21 ? new AlertDialog.Builder(activity0, 4) : new AlertDialog.Builder(activity0);
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
            linearLayout0.setOrientation(1);
            linearLayout0.setLayoutParams(linearLayout$LayoutParams0);
            linearLayout0.setGravity(0x80);
            linearLayout0.setPadding(2, 2, 2, 2);
            EditText editText0 = new EditText(activity0);
            editText0.setText(s);
            if(v < 21) {
                editText0.setTextColor(-1);
            }
            editText0.setSingleLine(false);
            editText0.setImeOptions(0x40000000);
            editText0.setInputType(0x20001);
            editText0.setTextIsSelectable(true);
            linearLayout0.addView(editText0, new LinearLayout.LayoutParams(-1, -2));
            alertDialog$Builder0.setView(linearLayout0);
            alertDialog$Builder0.create().show();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH5747(Activity activity0, CLS12 ᵔʾ0, String s) {
        Object object0 = CLS40.FLD157.MTH1118(CLS29.class);
        ArrayList arrayList0 = new ArrayList();
        String[] arr_s = ((CLS29)object0).MTH925("wb_fav_list", "").split(";");
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            if(!TextUtils.isEmpty(s1)) {
                arrayList0.add(s1);
            }
        }
        CLS523.MTH7150(activity0, s, ((CLS17)new CLS766(activity0, ((CLS29)object0), arrayList0, new CLS369(activity0, arrayList0), ᵔʾ0, 11)));
    }
}


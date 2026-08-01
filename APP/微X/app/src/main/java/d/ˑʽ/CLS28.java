// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.content.ContentValues;
import android.text.TextUtils;
import d.ˎˏ.CLS1;
import d.יʻ.CLS173;
import d.יʻ.CLS62;
import d.יʻ.CLS68;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.ٴˑ.CLS178;
import d.ٴˑ.CLS190;
import d.ٴˑ.CLS99;
import d.ᐧˈ.CLS195;
import d.ᐧˈ.CLS205;
import d.ᐧˈ.CLS206;
import d.ᐧˏ.CLS108;
import d.ᐧי.CLS110;
import d.ⁱٴ.CLS124;
import d.ⁱٴ.CLS125;
import d.ⁱٴ.CLS126;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;

public final class CLS28 {
    // 此方法包含解密的字符串
    public static void MTH526(Activity activity0) {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        if(CLS35.MTH585()) {
            linkedHashMap0.put(CLS69.MTH795("epay_wechat"), "$wechatpay#integrated");
            if(CLS1.MTH376(CLS69.MTH806("epay_alipay_enable"))) {
                linkedHashMap0.put(CLS69.MTH795("epay_alipay"), "$alipay#integrated");
            }
            if(CLS71.MTH827(0xFFFF21C52DFB3E45L)) {
                linkedHashMap0.put(CLS69.MTH795("epay_qq"), "$qqpay#integrated");
            }
        }
        if(CLS69.MTH794("donate_sub_integrated_urls")) {
            String[] arr_s = CLS69.MTH806("donate_sub_integrated_urls").split(";");
            for(int v = 0; v < arr_s.length; v = CLS71.MTH828(arr_s1[1], linkedHashMap0, arr_s1[0].trim(), v, 1)) {
                String[] arr_s1 = arr_s[v].split(",");
            }
            if(!CLS71.MTH831(0xFFFF21A32DFB3E45L)) {
                String[] arr_s2 = CLS69.MTH806("donate_sub_integrated_urls2").split(";");
                for(int v1 = 0; v1 < arr_s2.length; ++v1) {
                    String[] arr_s3 = arr_s2[v1].split(",");
                    linkedHashMap0.put(arr_s3[0].trim(), "#" + arr_s3[1].trim());
                }
            }
            if(!CLS71.MTH831(0xFFFF21612DFB3E45L)) {
                linkedHashMap0.put(CLS69.MTH795("keycard"), "*key");
            }
            if(!CLS71.MTH831(0xFFFF21032DFB3E45L)) {
                linkedHashMap0.put(CLS69.MTH795("keycard_lookup"), "*lookup");
            }
        }
        if(linkedHashMap0.isEmpty() && CLS69.MTH794("donate_sub_integrated_url")) {
            CLS71.MTH829(0xFFFF26C32DFB3E45L, activity0);
            return;
        }
        CLS28.MTH531(activity0, CLS69.MTH795("donate_sub_integrated"), new CLS110(activity0, linkedHashMap0.keySet()), linkedHashMap0, CLS69.MTH795("donate_list_warn2"));
    }

    // 此方法包含解密的字符串
    public static void MTH527(ArrayList arrayList0) {
        Activity activity0 = (Activity)CLS62.FLD317.MTH761("getCurrentActivity", new Object[0]);
        if(activity0 != null && !CLS71.MTH831(0xFFFF270E2DFB3E45L)) {
            CLS10 ʻﹶ0 = new CLS10(activity0, CLS69.MTH795("keycard_feedback"));
            ʻﹶ0.FLD44 = new CLS173(activity0, arrayList0, 8);
            ʻﹶ0.FLD48 = true;
            ʻﹶ0.FLD43 = new CLS206(1);
            ʻﹶ0.show();
            CLS46.FLD233.MTH672();
        }
    }

    // 此方法包含解密的字符串
    public static void MTH528(Activity activity0) {
        public final class CLS140 implements CLS126 {
            public final HashMap FLD118;

            public CLS140(HashMap hashMap0) {
            }

            // 此方法包含解密的字符串
            @Override  // d.ⁱٴ.CLS126
            public final void MTH1183() {
                String s = (String)this.FLD118.get("key");
                String s1 = (String)this.FLD118.get("limit");
                CLS38 ـʿ0 = CLS38.FLD200;
                ـʿ0.getClass();
                String s2 = s.trim();
                String s3 = s1.trim();
                String s4 = CLS1.MTH369();
                if(!TextUtils.isEmpty(s4) && !TextUtils.isEmpty(s2)) {
                    if(s2.equals(s3)) {
                        s3 = "";
                    }
                    if(s3.length() != 0x40) {
                        String s5 = CLS69.MTH801().MTH740("transferkey_time", "");
                        if(!TextUtils.isEmpty(s5)) {
                            long v = Long.parseLong(s5, 16);
                            String s6 = CLS69.MTH806("transferkey_time");
                            long v1 = TextUtils.isEmpty(s6) ? 600000L : Long.parseLong(s6);
                            if(!CLS34.MTH574(v, v1)) {
                                long v2 = System.currentTimeMillis() - (v + v1);
                                CLS13.MTH431(String.format(CLS69.MTH795("try_again_in"), ((int)(v2 / 3600000L % 24L)), ((int)(v2 / 60000L % 60L)), ((int)(((int)(v2 / 1000L)) % 60))));
                                return;
                            }
                        }
                    }
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        if(CLS13.MTH430()) {
                            jSONObject0.put("xv", true);
                        }
                        jSONObject0.put("reguser", CLS69.MTH801().MTH740("_reguser", ""));
                        jSONObject0.put("special_fp", CLS69.MTH801().MTH740("_specialfp", ""));
                        jSONObject0.put("at", ـʿ0.FLD195.MTH597());
                        jSONObject0.put("k2", s2);
                        jSONObject0.put("wxid", s4);
                        Object[] arr_object = {CLS69.MTH810()};
                        jSONObject0.put("deviceId", CLS62.FLD317.MTH756("getDeviceId", arr_object));
                        jSONObject0.put("time", Long.toHexString(System.currentTimeMillis()));
                        jSONObject0.put("tfk", s3);
                    }
                    catch(Throwable throwable0) {
                        CLS69.MTH797(throwable0);
                    }
                    CLS21 ʾﹶ0 = new CLS21(CLS38.MTH611());
                    ʾﹶ0.MTH459(CLS38.MTH607());
                    ʾﹶ0.FLD73 = "POST";
                    ʾﹶ0.MTH463("cmd", "tk");
                    ʾﹶ0.MTH463("args", CLS38.MTH604(jSONObject0).toString());
                    ʾﹶ0.FLD74 = true;
                    new CLS19(ʾﹶ0, new CLS171(ـʿ0, 1)).execute(new Void[0]);
                }
            }

            @Override  // d.ⁱٴ.CLS126
            public final void MTH1184() {
            }
        }

        HashMap hashMap0 = new HashMap();
        HashMap hashMap1 = new HashMap();
        hashMap0.put("key", "");
        hashMap0.put("limit", "");
        String s = CLS69.MTH795("transfer_here");
        CLS205 ⁱٴ0 = new CLS205(activity0, hashMap0, hashMap1, 3);
        CLS140 ˉˆ$ٴˑ0 = new CLS140(hashMap0);
        CLS45.MTH653(activity0, s, ((CLS124)new CLS173(activity0, ⁱٴ0, 5)), ((CLS126)ˉˆ$ٴˑ0));
    }

    // 此方法包含解密的字符串
    public static void MTH529(String s, boolean z) {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("key", s);
            jSONObject0.put("valid", !z);
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(jSONObject0);
            CLS28.MTH527(arrayList0);
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH530(Activity activity0, long v, CLS178 ʼᵔ0) {
        CLS190 ᵎᐧ0 = new CLS190(activity0);
        ᵎᐧ0.MTH1181(CLS69.MTH795("hour"));
        ᵎᐧ0.MTH1019(2);
        CLS45.MTH659(false, new CLS125[]{ᵎᐧ0});
        CLS190 ᵎᐧ1 = new CLS190(activity0);
        ᵎᐧ1.MTH1181(CLS69.MTH795("minute"));
        ᵎᐧ1.MTH1019(2);
        CLS45.MTH659(false, new CLS125[]{ᵎᐧ1});
        CLS190 ᵎᐧ2 = new CLS190(activity0);
        ᵎᐧ2.MTH1181(CLS69.MTH795("second"));
        ᵎᐧ2.MTH1019(2);
        CLS45.MTH659(false, new CLS125[]{ᵎᐧ2});
        CLS190 ᵎᐧ3 = new CLS190(activity0);
        ᵎᐧ3.MTH1181(CLS69.MTH795("millisecond"));
        ᵎᐧ3.MTH1019(2);
        CLS45.MTH659(false, new CLS125[]{ᵎᐧ3});
        ContentValues contentValues0 = CLS34.MTH571(v);
        ᵎᐧ0.MTH1020(contentValues0.getAsString("hours"));
        ᵎᐧ1.MTH1020(contentValues0.getAsString("minutes"));
        ᵎᐧ2.MTH1020(contentValues0.getAsString("seconds"));
        ᵎᐧ3.MTH1020(contentValues0.getAsString("milliseconds"));
        CLS45.MTH653(activity0, CLS69.MTH795("set_time"), ((CLS124)new CLS149(activity0, ᵎᐧ0, ᵎᐧ1, ᵎᐧ2, ᵎᐧ3)), ((CLS126)new CLS167(ᵎᐧ0, ᵎᐧ1, ᵎᐧ2, ᵎᐧ3, ʼᵔ0)));
    }

    public static void MTH531(Activity activity0, String s, CLS110 ٴˑ0, LinkedHashMap linkedHashMap0, String s1) {
        CLS45.MTH661(activity0, s, ((CLS8)new CLS151(s1, activity0, ٴˑ0, linkedHashMap0)), ((CLS9)new CLS173(linkedHashMap0, activity0, 9)), null);
    }

    public static void MTH532(Activity activity0, String s, String s1, boolean z) {
        public final class CLS137 implements CLS126 {
            public final double[] FLD115;

            public CLS137(double[] arr_f) {
            }

            @Override  // d.ⁱٴ.CLS126
            public final void MTH1183() {
                CLS35.MTH583(this.FLD115[0]);
            }

            @Override  // d.ⁱٴ.CLS126
            public final void MTH1184() {
            }
        }


        public final class CLS138 implements CLS126 {
            public final String FLD116;
            public final double[] FLD117;

            public CLS138(double[] arr_f, String s) {
                this.FLD116 = s;
                super();
            }

            @Override  // d.ⁱٴ.CLS126
            public final void MTH1183() {
                CLS35.MTH588(this.FLD117[0], this.FLD116);
            }

            @Override  // d.ⁱٴ.CLS126
            public final void MTH1184() {
            }
        }


        public final class CLS141 implements CLS126 {
            public final double[] FLD119;

            public CLS141(double[] arr_f) {
            }

            @Override  // d.ⁱٴ.CLS126
            public final void MTH1183() {
                CLS35.MTH583(this.FLD119[0]);
            }

            @Override  // d.ⁱٴ.CLS126
            public final void MTH1184() {
            }
        }


        public final class CLS142 implements CLS126 {
            public final String FLD120;
            public final double[] FLD121;

            public CLS142(double[] arr_f, String s) {
                this.FLD120 = s;
                super();
            }

            @Override  // d.ⁱٴ.CLS126
            public final void MTH1183() {
                CLS35.MTH588(this.FLD121[0], this.FLD120);
            }

            @Override  // d.ⁱٴ.CLS126
            public final void MTH1184() {
            }
        }


        public final class CLS145 implements CLS126 {
            public CLS145() {
                super();
            }

            // 此方法包含解密的字符串
            @Override  // d.ⁱٴ.CLS126
            public final void MTH1183() {
                CLS68 ٴˆ0 = CLS68.FLD326;
                if(ٴˆ0.FLD321.MTH1155("wx+donate")) {
                    CLS35.MTH586(((String)ٴˆ0.FLD321.MTH1159("wx+donate")), new CLS206(4));
                }
            }

            @Override  // d.ⁱٴ.CLS126
            public final void MTH1184() {
            }
        }

        double[] arr_f = {10.0};
        CLS157 ـˊ0 = new CLS157(activity0, arr_f, z, s1);
        CLS157 ـˊ1 = new CLS157(activity0, z, arr_f, s1, 1);
        CLS145 ˉˆ$ⁱﾞ0 = new CLS145();
        CLS10 ʻﹶ0 = new CLS10(activity0, s);
        ʻﹶ0.FLD44 = ـˊ0;
        ʻﹶ0.FLD52 = ـˊ1;
        CLS46.FLD233.FLD234.add(ʻﹶ0);
        ʻﹶ0.FLD43 = new CLS150(ʻﹶ0, ((CLS126)ˉˆ$ⁱﾞ0), 1);
        ʻﹶ0.show();
    }

    // 此方法包含解密的字符串
    public static void MTH533(Activity activity0, CLS126 ⁱﾞ0) {
        if(CLS1.MTH365() && !TextUtils.isEmpty(CLS69.MTH795("epay_disclaimer"))) {
            try {
                CLS45.MTH653(activity0, CLS69.MTH795("disclaimer"), ((CLS124)new CLS152(activity0, CLS69.MTH795("epay_disclaimer"), false)), ⁱﾞ0);
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
            return;
        }
        ⁱﾞ0.MTH1183();
    }

    // 此方法包含解密的字符串
    public static String MTH534(JSONObject jSONObject0) {
        String s;
        CLS99 ﹶᵎ0 = new CLS99();
        try {
            ﹶᵎ0.FLD571 = jSONObject0.getString("key");
            if(jSONObject0.optBoolean("valid", false)) {
                String s1 = jSONObject0.optString("amount");
                int v = jSONObject0.optInt("type", 0);
                boolean z = jSONObject0.optBoolean("used");
                boolean z1 = jSONObject0.optBoolean("registered");
                StringBuilder stringBuilder0 = new StringBuilder();
                switch(v) {
                    case 0: {
                        stringBuilder0.append(CLS69.MTH795("donate"));
                        goto label_23;
                    }
                    case 1: {
                        stringBuilder0.append(CLS69.MTH795("secret_friend"));
                        goto label_23;
                    }
                    case 2: {
                        stringBuilder0.append(CLS69.MTH795("moments_auto_forward"));
                        goto label_23;
                    }
                    case 3: {
                        stringBuilder0.append(CLS69.MTH795("multichat_autoforward"));
                        goto label_23;
                    }
                    case 101: {
                        stringBuilder0.append(CLS69.MTH795("auto_accept_chatroom_invite"));
                        goto label_23;
                    }
                    case 102: {
                        stringBuilder0.append(CLS69.MTH795("auto_friendreq"));
                    label_23:
                        stringBuilder0.append(": ");
                    }
                }
                if(!TextUtils.isEmpty(s1)) {
                    stringBuilder0.append(s1);
                    stringBuilder0.append("元 ");
                }
                if(z) {
                    if(z1) {
                        stringBuilder0.append("(");
                        stringBuilder0.append(CLS69.MTH795("keycard_registered"));
                    }
                    else {
                        stringBuilder0.append("(");
                        stringBuilder0.append(CLS69.MTH795("keycard_used"));
                    }
                    stringBuilder0.append(")");
                }
                if(jSONObject0.has("expired")) {
                    stringBuilder0.append("(");
                    stringBuilder0.append(CLS69.MTH795("expired"));
                    stringBuilder0.append(")");
                }
                if(jSONObject0.has("expiration_left")) {
                    String[] arr_s = jSONObject0.getString("expiration_left").split(",");
                    stringBuilder0.append("(");
                    stringBuilder0.append(String.format(CLS69.MTH795("expiration_left"), arr_s[0], arr_s[1]));
                    stringBuilder0.append(")");
                }
                s = stringBuilder0.toString();
            }
            else {
                s = CLS69.MTH795("keycard_invalid");
            }
            ﹶᵎ0.FLD570 = s;
            return "";
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static void MTH535(Activity activity0, int v) {
        public final class CLS143 implements CLS126 {
            public final int FLD122;
            public final CLS110 FLD123;
            public final ArrayList FLD124;
            public final CLS99 FLD125;
            public final ArrayList FLD126;

            public CLS143(ArrayList arrayList0, int v, ArrayList arrayList1, CLS99 ﹶᵎ0, CLS110 ٴˑ0) {
                this.FLD122 = v;
                this.FLD126 = arrayList1;
                this.FLD125 = ﹶᵎ0;
                this.FLD123 = ٴˑ0;
                super();
            }

            @Override  // d.ⁱٴ.CLS126
            public final void MTH1183() {
                this.FLD124.remove(this.FLD122);
                this.FLD126.remove(this.FLD125.FLD571);
                this.FLD123.notifyDataSetChanged();
            }

            @Override  // d.ⁱٴ.CLS126
            public final void MTH1184() {
            }
        }


        public final class CLS144 implements CLS126 {
            public final ArrayList FLD127;
            public final HashMap FLD128;
            public final ArrayList FLD129;

            public CLS144(HashMap hashMap0, ArrayList arrayList0, ArrayList arrayList1) {
                this.FLD127 = arrayList0;
                this.FLD129 = arrayList1;
                super();
            }

            // 此方法包含解密的字符串
            @Override  // d.ⁱٴ.CLS126
            public final void MTH1183() {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: this.FLD128.values()) {
                    JSONObject jSONObject0 = (JSONObject)object0;
                    if(!jSONObject0.optBoolean("valid") || jSONObject0.optBoolean("used") && !jSONObject0.optBoolean("registered")) {
                        arrayList0.add(jSONObject0);
                    }
                }
                if(!arrayList0.isEmpty()) {
                    CLS28.MTH527(arrayList0);
                }
                ArrayList arrayList1 = this.FLD127;
                if(!arrayList1.isEmpty()) {
                    CLS38.FLD200.getClass();
                    CLS38.FLD200.MTH610(arrayList1, "a");
                    return;
                }
                if(!this.FLD129.isEmpty()) {
                    CLS38.FLD200.getClass();
                    CLS38.MTH606(false);
                }
            }

            @Override  // d.ⁱٴ.CLS126
            public final void MTH1184() {
            }
        }

        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        HashMap hashMap0 = new HashMap();
        CLS110 ٴˑ0 = new CLS110(activity0, arrayList0);
        CLS134 ˆⁱ0 = new CLS134(activity0, ٴˑ0, arrayList0, arrayList1, hashMap0);
        CLS45.MTH661(activity0, CLS69.MTH795("keycard"), ((CLS8)new CLS154(activity0, v, ˆⁱ0, ٴˑ0, arrayList0, arrayList1, hashMap0)), null, ((CLS126)new CLS144(hashMap0, arrayList1, arrayList0)));
    }

    // 此方法包含解密的字符串
    public static void MTH536(Activity activity0) {
        if(activity0 != null && !CLS71.MTH831(0xFFFF27252DFB3E45L)) {
            CLS10 ʻﹶ0 = new CLS10(activity0, CLS69.MTH795("donate_feedback"));
            ʻﹶ0.FLD44 = new CLS195(activity0, 12);
            ʻﹶ0.FLD48 = true;
            ʻﹶ0.FLD43 = new CLS206(2);
            ʻﹶ0.show();
            CLS46.FLD233.MTH672();
        }
    }

    // 此方法包含解密的字符串
    public static void MTH537(Activity activity0, String s, String s1, boolean z) {
        public final class CLS139 implements CLS126 {
            public CLS139() {
                super();
            }

            // 此方法包含解密的字符串
            @Override  // d.ⁱٴ.CLS126
            public final void MTH1183() {
                CLS68 ٴˆ0 = CLS68.FLD326;
                if(ٴˆ0.FLD321.MTH1155("wx+donate")) {
                    CLS35.MTH586(((String)ٴˆ0.FLD321.MTH1159("wx+donate")), new CLS206(3));
                }
            }

            @Override  // d.ⁱٴ.CLS126
            public final void MTH1184() {
            }
        }

        long v;
        switch(s1) {
            case "alipay": {
                v = -241320556020155L;
                break;
            }
            case "qqpay": {
                v = 0xFFFF24B92DFB3E45L;
                break;
            }
            default: {
                v = 0xFFFF24B12DFB3E45L;
            }
        }
        String s2 = CLS69.MTH795(CLS108.MTH1103(v));
        int[] arr_v = {0};
        int v1 = 2;
        switch(s) {
            case "af": {
                v1 = 3;
                break;
            }
            case "integrated": {
                v1 = 104;
                break;
            }
            case "invite": {
                v1 = 101;
                break;
            }
            case "mf": {
                break;
            }
            case "sf": {
                v1 = 1;
                break;
            }
            default: {
                v1 = 1;
            }
        }
        CLS165 ᵢᴵ0 = new CLS165(v1, arr_v, s1);
        CLS136 ˈﹶ0 = new CLS136(v1, arr_v);
        CLS170 ﹳⁱ0 = new CLS170(activity0, s, arr_v, ˈﹶ0, z, s1, ᵢᴵ0);
        CLS157 ـˊ0 = new CLS157(activity0, z, ˈﹶ0, ᵢᴵ0, 2);
        CLS139 ˉˆ$יʻ0 = new CLS139();
        CLS10 ʻﹶ0 = new CLS10(activity0, s2);
        ʻﹶ0.FLD44 = ﹳⁱ0;
        ʻﹶ0.FLD52 = ـˊ0;
        CLS46.FLD233.FLD234.add(ʻﹶ0);
        ʻﹶ0.FLD43 = new CLS150(ʻﹶ0, ((CLS126)ˉˆ$יʻ0), 1);
        ʻﹶ0.show();
    }
}


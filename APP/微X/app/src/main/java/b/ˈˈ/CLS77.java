// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import b.ʻˑ.CLS10;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS14;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS576;
import b.ˆʿ.CLS44;
import b.ˊﾞ.CLS612;
import b.ˑٴ.CLS139;
import b.יᐧ.CLS158.CLS157;
import b.יᐧ.CLS158;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1255;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS423.CLS420;
import b.ⁱᵔ.CLS423;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;

public final class CLS77 {
    public final class CLS75 {
        public final Handler FLD248;
        public final int FLD249;
        public final CLS68 FLD250;
        public final CLS77 FLD251;

        public CLS75(String s, String s1, int v, String s2, String s3) {
            this.FLD248 = CLS40.FLD157.MTH1121();
            this.FLD250 = new CLS68(this, s1, s, s2, s3);
            this.FLD249 = v;
        }
    }

    public static final class CLS76 {
        public final CLS14 FLD253;
        public final String FLD254;
        public final String FLD255;
        public final String FLD256;
        public final String FLD257;
        public final String FLD258;

        public CLS76(CLS14 ⁱʾ0, String s, String s1, String s2, String s3, String s4) {
            this.FLD253 = ⁱʾ0;
            this.FLD256 = s;
            this.FLD255 = s1;
            this.FLD257 = s2;
            this.FLD254 = s3;
            this.FLD258 = s4;
        }
    }

    public CLS44 FLD259;
    public boolean FLD260;
    public boolean FLD261;
    public final CLS74 FLD262;
    public String FLD263;
    public final CLS371 FLD264;
    public final HashMap FLD265;
    public final HashMap FLD266;
    public final CLS139 FLD267;
    public final CLS158 FLD268;
    public final CLS29 FLD269;

    public CLS77(CLS139 ﹶʼ0) {
        public final class CLS74 extends Handler {
            public final CLS139 FLD246;
            public final CLS77 FLD247;

            public CLS74(Looper looper0, CLS139 ﹶʼ0) {
                this.FLD246 = ﹶʼ0;
                super(looper0);
            }

            // 此方法包含解密的字符串
            @Override  // android.os.Handler
            public final void handleMessage(Message message0) {
                CLS29 ˎᵢ4;
                String s17;
                int v5;
                String s16;
                String s13;
                String s11;
                HashSet hashSet0;
                String s7;
                super.handleMessage(message0);
                if(message0.what != 1000) {
                    return;
                }
                Bundle bundle0 = message0.getData();
                String s = bundle0.getString("tag");
                String s1 = bundle0.getString("talker");
                String s2 = bundle0.getString("content");
                String s3 = bundle0.getString("username_");
                String s4 = bundle0.getString("nickname");
                int v = bundle0.getInt("delaytime");
                int v1 = bundle0.getInt("type");
                int v2 = bundle0.getInt("isSend");
                CLS77 ˊˏ0 = CLS77.this;
                if(v1 != 1) {
                    String s5 = "";
                    switch(v1) {
                        case 3: {
                            s5 = CLS370.MTH5289(0x38EB91FB2B3CD335L);
                            break;
                        }
                        case 34: {
                            s5 = CLS370.MTH5289(4101532337764619061L);
                            break;
                        }
                        case 50: {
                            if(s2.endsWith("video")) {
                                s5 = CLS370.MTH5289(0x38EB919B2B3CD335L);
                            }
                            else if(s2.endsWith("voice")) {
                                s5 = CLS370.MTH5289(4101532097246450485L);
                            }
                            break;
                        }
                        case 43: 
                        case 62: {
                            s5 = CLS370.MTH5289(0x38EB91882B3CD335L);
                            break;
                        }
                        case 10002: {
                            s5 = CLS370.MTH5289(4101545931336110901L);
                        }
                    }
                    if(!TextUtils.isEmpty(s5) && !ˊˏ0.FLD263.equals(s1) && v2 != 1) {
                        String s6 = CLS182.MTH3484(4101545978580751157L, CLS182.MTH3483(s), s5);
                        CLS29 ˎᵢ0 = ˊˏ0.FLD269;
                        if(ˎᵢ0.MTH938(s6, false)) {
                            CLS91 ᵔʾ0 = ˊˏ0.MTH1604().MTH1184((TextUtils.isEmpty(s) ? s5 : s1 + s5));
                            if(ᵔʾ0 == null && CLS182.MTH3480(4101546034415326005L, CLS182.MTH3483(s), ˎᵢ0, false)) {
                                ᵔʾ0 = ˊˏ0.MTH1604().MTH1184(s5);
                            }
                            s7 = ᵔʾ0 == null ? "" : ᵔʾ0.MTH1735();
                        }
                        else {
                            s7 = "";
                        }
                        CLS77.this.MTH1594(v, s, s1, s7, s3);
                    }
                    return;
                }
                if(!TextUtils.isEmpty(s2)) {
                    CLS29 ˎᵢ1 = CLS27.MTH895();
                    if(CLS182.MTH3480(4101546103134802741L, CLS182.MTH3483(s), ˎᵢ1, false)) {
                        String s8 = CLS182.MTH3473(4101545707997811509L, CLS27.MTH895(), CLS182.MTH3475(4101545630688400181L, CLS182.MTH3483(s)));
                        if(!TextUtils.isEmpty(s8) && s2.startsWith(s8)) {
                            if(v2 == 0) {
                            label_54:
                                String s9 = s2.substring(s8.length()).trim();
                                CLS584 ᐧי0 = new CLS584(this.FLD246, s1, 0);
                                CLS423 ˊⁱ0 = new CLS423();
                                ˊⁱ0.FLD4085 = true;
                                String s10 = CLS27.MTH882("music163_url");
                                if(!TextUtils.isEmpty(s10) && !ˊⁱ0.MTH6075(s10)) {
                                    ˊⁱ0.FLD4075.add(s10);
                                }
                                ˊⁱ0.MTH6077("Referer", "http://music.163.com/");
                                ˊⁱ0.MTH6077("Cookie", "appver=1.5.0.75771");
                                ˊⁱ0.MTH6077("Content-type", "application/x-www-form-urlencoded");
                                ˊⁱ0.MTH6076("s", s9);
                                ˊⁱ0.MTH6076("offset", "0");
                                ˊⁱ0.MTH6076("limit", "1");
                                ˊⁱ0.MTH6076("type", "1");
                                ˊⁱ0.MTH6076("csrf_token", "");
                                ˊⁱ0.MTH6076("hlpretag", "");
                                ˊⁱ0.MTH6076("hlposttag", "");
                                ˊⁱ0.FLD4078 = "GET";
                                ˊⁱ0.MTH6078(((CLS420)new CLS576(((CLS12)ᐧי0), 10)));
                            }
                            else if(v2 == 1) {
                                CLS29 ˎᵢ2 = CLS27.MTH895();
                                if(CLS182.MTH3480(4101545785307222837L, CLS182.MTH3483(s), ˎᵢ2, false)) {
                                    goto label_54;
                                }
                            }
                            return;
                        }
                    }
                }
                if(!ˊˏ0.FLD263.equals(s1) && v2 != 1) {
                    boolean z = TextUtils.isEmpty(s);
                    CLS29 ˎᵢ3 = ˊˏ0.FLD269;
                    if(!z && CLS182.MTH3480(0x38EB9E3F2B3CD335L, CLS182.MTH3483(s), ˎᵢ3, false)) {
                        if(CLS182.MTH3480(4101546554106368821L, CLS182.MTH3483(s), ˎᵢ3, false)) {
                            CLS44 ˆٴ0 = ˊˏ0.MTH1604();
                            String[] arr_s = {s1, "_ANY_"};
                            ˆٴ0.getClass();
                            hashSet0 = new HashSet();
                            for(int v3 = 0; v3 < 2; ++v3) {
                                hashSet0.addAll(ˆٴ0.MTH1176(arr_s[v3]));
                            }
                        }
                        else {
                            hashSet0 = ˊˏ0.MTH1604().MTH1176(s1);
                        }
                        s11 = s1;
                    }
                    else if(ˎᵢ3.MTH938("_ANY__autoresponse_keywords_enable", false)) {
                        hashSet0 = ˊˏ0.MTH1604().MTH1176("_ANY_");
                        s11 = "_ANY_";
                    }
                    else {
                        hashSet0 = null;
                        s11 = null;
                    }
                    if(hashSet0 != null && !hashSet0.isEmpty() && !TextUtils.isEmpty(s2)) {
                        int v4 = 0;
                        for(Object object0: hashSet0) {
                            String s12 = (String)object0;
                            if(TextUtils.isEmpty(s12) || !CLS502.MTH6930(s12, s2)) {
                                s13 = s11;
                                goto label_142;
                            }
                            CLS91 ᵔʾ1 = CLS44.MTH1179(ˊˏ0.MTH1604().MTH1171(s11, s12));
                            if(ᵔʾ1 == null) {
                                s13 = s11;
                                if(CLS182.MTH3480(4101546300703298357L, CLS182.MTH3483(s), ˎᵢ3, false)) {
                                    ᵔʾ1 = CLS44.MTH1179(ˊˏ0.MTH1604().MTH1171("_ANY_", s12));
                                }
                            }
                            else {
                                s13 = s11;
                            }
                            if(ᵔʾ1 == null) {
                                goto label_142;
                            }
                            String s14 = ᵔʾ1.MTH1735();
                            if(TextUtils.isEmpty(s14)) {
                                goto label_142;
                            }
                            JSONObject jSONObject0 = ᵔʾ1.MTH1738();
                            if(jSONObject0 == null) {
                                s16 = s4;
                                goto label_150;
                            label_149:
                                CLS27.MTH893(throwable0);
                            }
                            else {
                                String s15 = ˎᵢ3.MTH925("autoreply_members", "");
                                if(TextUtils.isEmpty(s15)) {
                                    s16 = s4;
                                }
                                else {
                                    boolean z1 = !jSONObject0.has("specify_id") || jSONObject0.optBoolean("specify_id");
                                    CLS500 ᵢﹶ0 = CLS500.FLD4928;
                                    s16 = s4;
                                    if(ᵢﹶ0.MTH6895("autoreply_id") && (!CLS426.MTH6126(s1) || !z1 || !TextUtils.isEmpty(s3) && !CLS502.MTH6934(s15, new String[]{s3}))) {
                                        v5 = v4;
                                        s11 = s13;
                                        v4 = v5;
                                        s4 = s16;
                                        continue;
                                    }
                                    else if(ᵢﹶ0.MTH6895("remote_rp_cmd") && CLS182.MTH3480(4101547237006168885L, CLS182.MTH3483(s), ˎᵢ3, true)) {
                                        CLS21.FLD76.MTH818("includeRpUser", new Object[]{s1});
                                    }
                                }
                                if(jSONObject0.optBoolean("keyword_cooldown")) {
                                    try {
                                        long v6 = jSONObject0.optLong("keyword_cooldown_time", 60000L);
                                        v5 = v4;
                                        long v7 = jSONObject0.optLong("cooldown_" + s1, 0L);
                                        if(v7 == 0L || System.currentTimeMillis() >= v7 + v6) {
                                            jSONObject0.put("cooldown_" + s1, System.currentTimeMillis());
                                            ᵔʾ1.MTH1740(jSONObject0);
                                            ˊˏ0.MTH1604().MTH1182(ᵔʾ1);
                                            goto label_150;
                                        label_142:
                                            s16 = s4;
                                            v5 = v4;
                                        }
                                        s11 = s13;
                                        v4 = v5;
                                        s4 = s16;
                                        continue;
                                    }
                                    catch(Throwable throwable0) {
                                    }
                                    goto label_149;
                                }
                            }
                        label_150:
                            if(TextUtils.isEmpty(s14)) {
                                s17 = s13;
                                ˎᵢ4 = ˎᵢ3;
                            }
                            else {
                                ˊˏ0.MTH1601(s1);
                                s17 = s13;
                                ˎᵢ4 = ˎᵢ3;
                                CLS75 ˊˏ$ٴـ0 = new CLS75(ˊˏ0, s1, s14, v, s, s3);
                                ˊˏ0.FLD266.put(s1, ˊˏ$ٴـ0);
                                ˊˏ$ٴـ0.FLD248.postDelayed(ˊˏ$ٴـ0.FLD250, ((long)ˊˏ$ٴـ0.FLD249));
                            }
                            v4 = 1;
                            s11 = s17;
                            ˎᵢ3 = ˎᵢ4;
                            s4 = s16;
                        }
                        if(v4 == 0) {
                            CLS77.MTH1593(CLS77.this, s, s1, s2, v, s3, s4);
                        }
                        return;
                    }
                    CLS77.MTH1593(CLS77.this, s, s1, s2, v, s3, s4);
                }
            }
        }


        public final class CLS582 implements CLS157 {
            public final CLS77 FLD252;

            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3145() {
            }

            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3146(CLS158 ⁱʾ0) {
                CLS76 ˊˏ$ⁱʾ0 = (CLS76)ⁱʾ0.MTH3152();
                CLS77.this.MTH1597(ˊˏ$ⁱʾ0);
            }
        }

        this.FLD267 = ﹶʼ0;
        this.FLD266 = new HashMap();
        this.FLD265 = new HashMap();
        this.FLD264 = CLS371.FLD3470;
        this.FLD269 = CLS27.MTH895();
        this.FLD262 = new CLS74(this, Looper.getMainLooper(), ﹶʼ0);
        CLS582 ˊˏ$ᵔʾ0 = new CLS582(this);
        CLS158 ⁱʾ0 = new CLS158();
        ⁱʾ0.FLD1558 = ˊˏ$ᵔʾ0;
        this.FLD268 = ⁱʾ0;
    }

    // 去混淆评级： 中等(80)
    // 此方法包含解密的字符串
    public final boolean MTH1590() {
        return this.FLD261 && this.FLD260 && (this.FLD269.MTH938("autoreply_master_enable", false) && this.MTH1592());
    }

    // 此方法包含解密的字符串
    public final boolean MTH1591(String s) {
        String s1 = CLS182.MTH3475(0x38EBB8A32B3CD335L, CLS182.MTH3483(s));
        CLS29 ˎᵢ0 = this.FLD269;
        if(!ˎᵢ0.MTH938(s1, false)) {
            return false;
        }
        if(!CLS182.MTH3480(4101574969609999157L, CLS182.MTH3483(s), ˎᵢ0, false)) {
            return true;
        }
        String s2 = ˎᵢ0.MTH925(CLS182.MTH3475(4101575635329930037L, CLS182.MTH3483(s)), "");
        return TextUtils.isEmpty(s2) || CLS481.MTH6697(s2);
    }

    // 此方法包含解密的字符串
    public final boolean MTH1592() {
        CLS29 ˎᵢ0 = this.FLD269;
        ArrayList arrayList0 = new ArrayList(Arrays.asList(CLS502.MTH6941(ˎᵢ0.MTH925("custom_autoreply_list", ""))));
        arrayList0.add("");
        for(Object object0: arrayList0) {
            String s = (String)object0;
            String s1 = TextUtils.isEmpty(s) ? "" : CLS182.MTH3475(0x38EBB97D2B3CD335L, CLS182.MTH3483(s));
            if(CLS182.MTH3480(0x38EBB97F2B3CD335L, CLS182.MTH3483(s1), ˎᵢ0, false) && this.MTH1591(s1)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static void MTH1593(CLS77 ˊˏ0, String s, String s1, String s2, int v, String s3, String s4) {
        CLS14 ⁱʾ0;
        String s7;
        CLS91 ᵔʾ0;
        ˊˏ0.getClass();
        boolean z = TextUtils.isEmpty(s2);
        CLS29 ˎᵢ0 = ˊˏ0.FLD269;
        if(z || (!ˎᵢ0.MTH938("autoreply_enable", false) || !ˎᵢ0.MTH938("_ANY__use_turingrobot", false))) {
            if(!CLS182.MTH3480(4101574574473007925L, CLS182.MTH3483(s1), ˎᵢ0, false)) {
                CLS44 ˆٴ1 = ˊˏ0.MTH1604();
                ˆٴ1.getClass();
                ᵔʾ0 = ˆٴ1.MTH1184("_ANY_");
            }
            else if(CLS182.MTH3480(0x38EBB86A2B3CD335L, CLS182.MTH3483(s1), ˎᵢ0, false)) {
                CLS44 ˆٴ0 = ˊˏ0.MTH1604();
                String[] arr_s = {s1, "_ANY_"};
                ˆٴ0.getClass();
                ArrayList arrayList0 = new ArrayList();
                for(int v1 = 0; v1 < 2; ++v1) {
                    arrayList0.addAll(ˆٴ0.MTH1173(arr_s[v1]));
                }
                ᵔʾ0 = CLS44.MTH1179(arrayList0);
            }
            else {
                ᵔʾ0 = ˊˏ0.MTH1604().MTH1184(s1);
            }
            s7 = ᵔʾ0 == null ? null : ᵔʾ0.MTH1735();
            ˊˏ0.MTH1594(v, s, s1, s7, s3);
        }
        else if(CLS182.MTH3480(0x38EBBBC32B3CD335L, CLS182.MTH3483(s1), ˎᵢ0, false) && CLS182.MTH3480(4101578409878803253L, CLS182.MTH3483(s1), ˎᵢ0, false)) {
            if(!CLS182.MTH3480(0x38EBBBE62B3CD335L, CLS182.MTH3483(s1), ˎᵢ0, false)) {
                ⁱʾ0 = CLS404.MTH5897(s1);
                ˊˏ0.MTH1595(ⁱʾ0, s, s1, s2, v, s3, s4);
                return;
            }
            String s5 = ˎᵢ0.MTH925(CLS182.MTH3475(0x38EBBBFC2B3CD335L, CLS182.MTH3483(s1)), "");
            boolean z1 = false;
            if(TextUtils.isEmpty(s5)) {
                z1 = true;
            }
            else if(s2.startsWith(s5)) {
                z1 = true;
                s2 = s2.substring(s5.length()).trim();
            }
            if(z1) {
                ⁱʾ0 = CLS404.MTH5897(s1);
                ˊˏ0.MTH1595(ⁱʾ0, s, s1, s2, v, s3, s4);
            }
        }
        else {
            if(!ˎᵢ0.MTH938("robot_keyword_enable", false)) {
                ⁱʾ0 = CLS404.MTH5897("");
                ˊˏ0.MTH1595(ⁱʾ0, s, s1, s2, v, s3, s4);
                return;
            }
            String s6 = ˎᵢ0.MTH925("robot_keyword", "");
            boolean z2 = false;
            if(TextUtils.isEmpty(s6)) {
                z2 = true;
            }
            else if(s2.startsWith(s6)) {
                z2 = true;
                s2 = s2.substring(s6.length()).trim();
            }
            if(z2) {
                ⁱʾ0 = CLS404.MTH5897("");
                ˊˏ0.MTH1595(ⁱʾ0, s, s1, s2, v, s3, s4);
            }
        }
    }

    public final void MTH1594(int v, String s, String s1, String s2, String s3) {
        if(!TextUtils.isEmpty(s2) && this.MTH1599(s, s1)) {
            this.MTH1601(s1);
            CLS75 ˊˏ$ٴـ0 = new CLS75(this, s1, s2, v, s, s3);
            this.FLD266.put(s1, ˊˏ$ٴـ0);
            ˊˏ$ٴـ0.FLD248.postDelayed(ˊˏ$ٴـ0.FLD250, ((long)ˊˏ$ٴـ0.FLD249));
        }
    }

    public final void MTH1595(CLS14 ⁱʾ0, String s, String s1, String s2, int v, String s3, String s4) {
        if(!TextUtils.isEmpty(s2) && this.MTH1599(s, s1) && ⁱʾ0 != null) {
            CLS76 ˊˏ$ⁱʾ0 = new CLS76(ⁱʾ0, s, s1, s2, s3, s4);
            CLS29 ˎᵢ0 = CLS27.MTH895();
            if(CLS182.MTH3480(4101577598129984309L, CLS182.MTH3483(s), ˎᵢ0, false)) {
                this.FLD268.FLD1557.offer(ˊˏ$ⁱʾ0);
                CLS29 ˎᵢ1 = CLS27.MTH895();
                long v1 = (long)CLS34.MTH1064(4101577718389068597L, CLS182.MTH3483(s), ˎᵢ1, 5000);
                this.FLD268.MTH3156(v1);
                this.FLD268.MTH3155();
                return;
            }
            CLS1255 ᵢﹶ0 = new CLS1255(this, ˊˏ$ⁱʾ0, 13);
            CLS40.FLD157.MTH1123(((CLS39)ᵢﹶ0), ((long)v));
        }
    }

    // 此方法包含解密的字符串
    public final void MTH1596() {
        CLS29 ˎᵢ0 = this.FLD269;
        if(ˎᵢ0.MTH938("autoreply_master_enable", false) && !this.MTH1590()) {
            if(ˎᵢ0.MTH938("autoreply_showtoast", false)) {
                CLS412.MTH6011(CLS27.MTH889("autoreply_enabled"));
            }
            this.MTH1598();
            this.FLD265.clear();
            this.FLD260 = true;
        }
    }

    public final void MTH1597(CLS76 ˊˏ$ⁱʾ0) {
        if(ˊˏ$ⁱʾ0 == null) {
            return;
        }
        try {
            CLS612 ᵔʾ0 = new CLS612(this, ˊˏ$ⁱʾ0.FLD256, ˊˏ$ⁱʾ0.FLD255, ˊˏ$ⁱʾ0.FLD254, 4);
            ˊˏ$ⁱʾ0.FLD253.MTH793(ˊˏ$ⁱʾ0.FLD257, ˊˏ$ⁱʾ0.FLD255, ˊˏ$ⁱʾ0.FLD254, ˊˏ$ⁱʾ0.FLD258, ((CLS10)ᵔʾ0));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public final void MTH1598() {
        HashMap hashMap0 = this.FLD266;
        if(hashMap0 != null && !hashMap0.isEmpty()) {
            for(Object object0: hashMap0.keySet()) {
                this.MTH1601(((String)object0));
            }
        }
    }

    public final boolean MTH1599(String s, String s1) {
        Integer integer0;
        String s2 = CLS182.MTH3475(4101574810696209205L, CLS182.MTH3483(s));
        int v = this.FLD269.MTH927(5, s2);
        if(v < 0) {
            return true;
        }
        HashMap hashMap0 = this.FLD265;
        if(hashMap0.containsKey(s1)) {
            int v1 = (int)(((Integer)hashMap0.get(s1)));
            if(v1 == v) {
                return false;
            }
            integer0 = (int)(v1 + 1);
        }
        else {
            integer0 = 1;
        }
        hashMap0.put(s1, integer0);
        return true;
    }

    // 此方法包含解密的字符串
    public final void MTH1600(int v, int v1, String s, String s1, String s2, String s3, String s4) {
        boolean z1;
        if(this.MTH1590() && this.MTH1591(s2)) {
            CLS29 ˎᵢ0 = this.FLD269;
            boolean z = ˎᵢ0.MTH938("nonfriend_reply_enable", false);
            CLS371 ʻ0 = this.FLD264;
            if(z) {
                String s5 = this.FLD263;
                ʻ0.getClass();
                if(s1.equals(s5) || CLS372.MTH5400(s1) || s1.endsWith("@qqim") || s1.equals("filehelper") || s1.startsWith("fake_")) {
                    z1 = false;
                }
                else if(CLS426.MTH6126(s1)) {
                    Cursor cursor0 = ʻ0.MTH5307(CLS27.MTH882("q_db36"), new String[]{s1});
                    if(cursor0 == null) {
                        z1 = false;
                    }
                    else {
                        z1 = cursor0.getCount() > 0;
                        cursor0.close();
                        if(z1) {
                            z1 = CLS502.MTH6934(ʻ0.MTH5335(s1), new String[]{s5});
                        }
                    }
                }
                else {
                    Cursor cursor1 = ʻ0.MTH5307(CLS27.MTH882("q_db36") + " AND verifyFlag == 0", new String[]{s1});
                    if(cursor1 == null) {
                        z1 = false;
                    }
                    else {
                        z1 = cursor1.getCount() > 0;
                        cursor1.close();
                    }
                }
            }
            else {
                z1 = ʻ0.MTH5340(this.FLD263, s1);
            }
            if(z1) {
                int v2 = CLS34.MTH1064(4101577400561488693L, CLS182.MTH3483(s2), ˎᵢ0, 1000);
                if(CLS182.MTH3480(0x38EBBAFE2B3CD335L, CLS182.MTH3483(s2), ˎᵢ0, false)) {
                    String s6 = ˎᵢ0.MTH925(CLS182.MTH3475(4101577044079203125L, CLS182.MTH3483(s2)), "");
                    if(!TextUtils.isEmpty(s6)) {
                        try {
                            String[] arr_s = s6.split(",");
                            v2 = CLS412.MTH6015(((int)(Double.parseDouble(arr_s[0]) * 1000.0)), ((int)(Double.parseDouble(arr_s[1]) * 1000.0)));
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                        }
                    }
                }
                Message message0 = this.FLD262.obtainMessage();
                message0.what = 1000;
                Bundle bundle0 = new Bundle();
                bundle0.putInt("delaytime", v2);
                bundle0.putString("content", s);
                bundle0.putString("talker", s1);
                bundle0.putString("tag", s2);
                bundle0.putString("username_", s3);
                bundle0.putString("nickname", s4);
                bundle0.putInt("type", v);
                bundle0.putInt("isSend", v1);
                message0.setData(bundle0);
                this.FLD262.sendMessageDelayed(message0, ((long)v2));
            }
        }
    }

    public final void MTH1601(String s) {
        HashMap hashMap0 = this.FLD266;
        if(!hashMap0.containsKey(s)) {
            return;
        }
        CLS75 ˊˏ$ٴـ0 = (CLS75)hashMap0.get(s);
        ˊˏ$ٴـ0.FLD248.removeCallbacks(ˊˏ$ٴـ0.FLD250);
        hashMap0.remove(s);
    }

    // 此方法包含解密的字符串
    public final void MTH1602() {
        if(!this.MTH1590()) {
            return;
        }
        if(this.FLD269.MTH938("autoreply_showtoast", false)) {
            CLS412.MTH6011(CLS27.MTH889("autoreply_disabled"));
        }
        this.FLD260 = false;
        this.MTH1598();
    }

    // 此方法包含解密的字符串
    public final void MTH1603(String s, String s1, String s2, String s3) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        CLS29 ˎᵢ0 = this.FLD269;
        if(s.startsWith("#") || s.startsWith("{")) {
            if(s.startsWith("{") && CLS182.MTH3480(0x38EBBB602B3CD335L, CLS182.MTH3483(s2), ˎᵢ0, false)) {
                try {
                    JSONObject jSONObject0 = new JSONObject(s);
                    jSONObject0.put("tail", "\n" + ˎᵢ0.MTH925(s2 + "reply_sign", CLS27.MTH889("reply_sign")));
                    s = jSONObject0.toString();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
        else if(CLS182.MTH3480(4101577168633254709L, CLS182.MTH3483(s2), ˎᵢ0, false)) {
            StringBuilder stringBuilder0 = CLS182.MTH3483(s);
            stringBuilder0.append("\n");
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(s2);
            stringBuilder0.append(ˎᵢ0.MTH925(CLS182.MTH3475(4101577804288414517L, stringBuilder1), CLS27.MTH889("reply_sign")));
            s = stringBuilder0.toString();
        }
        String s4 = CLS502.MTH6939(s, s1, s3);
        boolean z = CLS182.MTH3480(0x38EBBB0F2B3CD335L, CLS182.MTH3483(s2), ˎᵢ0, false);
        this.FLD267.MTH3021(s4, s1, s3, null, z);
    }

    public final CLS44 MTH1604() {
        if(this.FLD259 == null) {
            this.FLD259 = (CLS44)CLS40.FLD157.MTH1118(CLS44.class);
        }
        return this.FLD259;
    }

    // 此方法包含解密的字符串
    public final void MTH1605(String s) {
        CLS29 ˎᵢ0 = this.FLD269;
        String s1 = ˎᵢ0.MTH925("autoreply_exclude_usernames", "");
        if(CLS502.MTH6934(s1, new String[]{s})) {
            return;
        }
        HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(s1)));
        hashSet0.add(s);
        ˎᵢ0.MTH922(TextUtils.join(",", hashSet0), "autoreply_exclude_usernames");
    }
}


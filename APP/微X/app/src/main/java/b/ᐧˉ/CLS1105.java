// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˊﾞ.CLS612;
import b.ˑٴ.CLS766;
import b.ᵔʾ.CLS1234;
import b.ⁱʾ.CLS1274;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS408;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1617;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS530;
import b.ﾞˎ.CLS536;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

public final class CLS1105 extends CLS219 {
    public final CLS371 FLD2413;
    public final CLS485 FLD2414;
    public CLS1626 FLD2415;
    public String FLD2416;
    public CLS210 FLD2417;
    public CLS536 FLD2418;
    public final ArrayList FLD2419;
    public JSONObject FLD2420;
    public CLS244 FLD2421;

    public CLS1105(String s, String s1) {
        super(s, s1);
        this.FLD2413 = CLS371.FLD3470;
        this.FLD2414 = (CLS485)CLS40.FLD157.MTH1118(CLS485.class);
        this.FLD2419 = new ArrayList();
    }

    @Override  // b.ᐧˉ.CLS219
    public final void MTH3874(boolean z, boolean z1, String s) {
        this.FLD2419.clear();
        CLS1056 יˏ0 = new CLS1056(this, 11);
        CLS40.FLD157.MTH1124(((CLS39)יˏ0));
        Activity activity0 = ((CLS219)this).MTH3883();
        this.FLD2417 = new CLS210(activity0, this.FLD2157);
        this.FLD2421 = new CLS244(activity0, this.FLD2157);
        if(z1) {
            ((CLS219)this).MTH3875();
        }
        CLS380 ʼˎ0 = new CLS380(((CLS219)this).MTH3883(), this.FLD2156);
        ʼˎ0.FLD3527 = new CLS1056(this, 0);
        ʼˎ0.FLD3518 = new CLS909(this, activity0, z, z1);
        ʼˎ0.FLD3519 = new CLS1274(this, activity0, 18);
        ʼˎ0.show();
        if(z1 && !TextUtils.isEmpty(s)) {
            ((CLS219)this).MTH3882(s);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH4172(String s, JSONObject jSONObject0) {
        Integer integer0;
        String s11;
        int v;
        String s8;
        StringBuilder stringBuilder0;
        String s5;
        HashSet hashSet0;
        String s1 = CLS182.MTH3475(4100585490749379381L, CLS182.MTH3483(s));
        String s2 = CLS182.MTH3475(4100585499339313973L, CLS182.MTH3483(s1));
        Boolean boolean0 = Boolean.valueOf(jSONObject0.optBoolean("grab_red_packet_enable", false));
        CLS29 ˎᵢ0 = this.FLD2151;
        ˎᵢ0.MTH922(boolean0, s2);
        String s3 = ˎᵢ0.MTH925("rp_custom_list", "");
        if(!jSONObject0.optBoolean("grab_red_packet_enable", false)) {
            if(!TextUtils.isEmpty(s1) && CLS502.MTH6934(s3, new String[]{s})) {
                hashSet0 = new ArrayList(Arrays.asList(CLS502.MTH6941(s3)));
                ((ArrayList)hashSet0).remove(s);
                ˎᵢ0.MTH922(TextUtils.join(CLS370.MTH5289(4100585452094673717L), hashSet0), "rp_custom_list");
            }
        }
        else if(!TextUtils.isEmpty(s1) && !CLS502.MTH6934(s3, new String[]{s})) {
            hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(s3)));
            hashSet0.add(s);
            ˎᵢ0.MTH922(TextUtils.join(CLS370.MTH5289(4100585379080229685L), hashSet0), "rp_custom_list");
        }
        String s4 = CLS182.MTH3475(4100586302498198325L, CLS182.MTH3494(4100586684750287669L, jSONObject0, false, ˎᵢ0, CLS182.MTH3475(4100585967490749237L, CLS182.MTH3494(4100585834346763061L, jSONObject0, false, ˎᵢ0, CLS182.MTH3475(4100586250958590773L, CLS182.MTH3494(4100586130699506485L, jSONObject0, false, ˎᵢ0, CLS182.MTH3475(4100586010440422197L, CLS182.MTH3483(s1)), s1)), s1)), s1));
        ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("grab_red_packet_filter_notopen_enable", false)), s4);
        if(jSONObject0.optBoolean("grab_red_packet_filter_onlyopen_enable", false)) {
            s5 = jSONObject0.optString("red_packet_filter_onlyopen_text", "");
            stringBuilder0 = CLS182.MTH3483(s1);
            stringBuilder0.append(CLS370.MTH5289(4100582540106847029L));
            ˎᵢ0.MTH922(s5, stringBuilder0.toString());
        }
        else if(jSONObject0.optBoolean("grab_red_packet_filter_notopen_enable", false)) {
            s5 = jSONObject0.optString("red_packet_filter_text", "");
            stringBuilder0 = CLS182.MTH3483(s1);
            stringBuilder0.append(CLS370.MTH5289(0x38E832F62B3CD335L));
            ˎᵢ0.MTH922(s5, stringBuilder0.toString());
        }
        String s6 = CLS182.MTH3475(4100583841481937717L, CLS182.MTH3494(4100583167172072245L, jSONObject0, false, ˎᵢ0, CLS182.MTH3475(4100583042618020661L, CLS182.MTH3483(s1)), s1));
        ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("grab_red_packet_random_delay_enable", false)), s6);
        if(jSONObject0.optBoolean("grab_red_packet_random_delay_enable", false)) {
            String s7 = CLS182.MTH3475(4100583755582591797L, CLS182.MTH3483(s1));
            ˎᵢ0.MTH922(jSONObject0.optInt("grab_red_packet_rdelay_min", 0), s7);
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(s1);
            s8 = CLS182.MTH3475(4100584537266639669L, stringBuilder1);
            v = jSONObject0.optInt("grab_red_packet_rdelay_max", 5000);
        }
        else {
            s8 = CLS182.MTH3475(4100584219439059765L, CLS182.MTH3483(s1));
            v = jSONObject0.optInt("grab_red_packet_delay", 0);
        }
        ˎᵢ0.MTH922(v, s8);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(s1);
        String s9 = CLS182.MTH3475(4100580749105484597L, CLS182.MTH3494(4100580654616204085L, jSONObject0, false, ˎᵢ0, CLS182.MTH3475(4100580560126923573L, stringBuilder2), s1));
        ˎᵢ0.MTH922(jSONObject0.optString("red_packet_msg_text", ""), s9);
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(s1);
        String s10 = CLS182.MTH3475(4100581651048616757L, CLS182.MTH3494(4100580968148816693L, jSONObject0, false, ˎᵢ0, CLS182.MTH3475(4100580835004830517L, CLS182.MTH3494(0x38E830FF2B3CD335L, jSONObject0, false, ˎᵢ0, CLS182.MTH3475(0x38E830F32B3CD335L, CLS182.MTH3494(0x38E830E32B3CD335L, jSONObject0, false, ˎᵢ0, CLS182.MTH3475(4100581139947508533L, CLS182.MTH3494(4100580482817512245L, jSONObject0, false, ˎᵢ0, CLS182.MTH3475(0x38E830202B3CD335L, stringBuilder3), s1)), s1)), s1)), s1));
        ˎᵢ0.MTH922(jSONObject0.optString("rp_sound_uri", ""), s10);
        if(jSONObject0.optInt("rp_notification_type", 1) == 1) {
            s11 = CLS182.MTH3475(4100581857207046965L, CLS182.MTH3483(s1));
            integer0 = 1;
        }
        else {
            s11 = CLS182.MTH3475(0x38E8310E2B3CD335L, CLS182.MTH3483(s1));
            integer0 = 0;
        }
        ˎᵢ0.MTH922(integer0, s11);
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(s1);
        String s12 = CLS182.MTH3475(4100582406962860853L, CLS182.MTH3494(4100582308178613045L, jSONObject0, true, ˎᵢ0, CLS182.MTH3475(4100582209394365237L, CLS182.MTH3494(0x38E831C02B3CD335L, jSONObject0, false, ˎᵢ0, CLS182.MTH3475(4100581565149270837L, CLS182.MTH3494(4100581526494565173L, jSONObject0, false, ˎᵢ0, CLS182.MTH3475(4100581487839859509L, stringBuilder4), s1)), s1)), s1));
        ˎᵢ0.MTH922(jSONObject0.optString("rp_missed_text", ""), s12);
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append(s1);
        String s13 = CLS182.MTH3475(4100582127789986613L, CLS182.MTH3494(4100582059070509877L, jSONObject0, false, ˎᵢ0, CLS182.MTH3475(4100581990351033141L, stringBuilder5), s1));
        ˎᵢ0.MTH922(jSONObject0.optInt("rp_not_speak_amount", 0), s13);
        StringBuilder stringBuilder6 = new StringBuilder();
        stringBuilder6.append(s1);
        String s14 = CLS182.MTH3475(4100596043484025653L, stringBuilder6);
        ˎᵢ0.MTH922(jSONObject0.optString("rp_timeframe", ""), s14);
        StringBuilder stringBuilder7 = new StringBuilder();
        stringBuilder7.append(s1);
        String s15 = CLS182.MTH3475(4100596159448142645L, stringBuilder7);
        ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("rp_timeframe_enable", false)), s15);
        if(jSONObject0.optBoolean("grab_red_packet_filter_onlyopen_enable", false)) {
            String s16 = CLS182.MTH3475(4100596498750559029L, CLS182.MTH3483(s1));
            ˎᵢ0.MTH922(Boolean.FALSE, s16);
        }
        if(jSONObject0.optBoolean("grab_red_packet_filter_notopen_enable", false)) {
            String s17 = CLS182.MTH3475(4100596275412259637L, CLS182.MTH3483(s1));
            ˎᵢ0.MTH922(Boolean.FALSE, s17);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ᐧˉ.CLS219
    public final void MTH3878(LinearLayout linearLayout0, boolean z, boolean z1, boolean z2) {
        CLS1623 יᐧ0 = new CLS1623(((CLS219)this).MTH3883());
        int v = CLS523.MTH7137(10);
        CLS408 ˈˈ0 = this.FLD2154;
        if(!ˈˈ0.MTH5947("redpacket")) {
            Activity activity0 = ((CLS219)this).MTH3883();
            CLS1617 ʻᵎ0 = new CLS1617(activity0);
            ʻᵎ0.MTH7200(z);
            ʻᵎ0.MTH800(CLS27.MTH889("luckymoney"));
            ʻᵎ0.FLD5159 = new CLS1037(((CLS219)this), activity0, z1, z2, v, 2);
            יᐧ0.MTH7296(ʻᵎ0);
        }
        Activity activity1 = ((CLS219)this).MTH3883();
        CLS1617 ʻᵎ1 = new CLS1617(activity1);
        ʻᵎ1.MTH7200(z);
        ʻᵎ1.MTH800(CLS27.MTH889("moneytransfer"));
        ʻᵎ1.FLD5159 = new CLS909(this, z1, z2, activity1, 1);
        יᐧ0.MTH7296(ʻᵎ1);
        int v1 = CLS523.MTH7137(10);
        CLS500 ᵢﹶ0 = this.FLD2153;
        boolean z3 = ᵢﹶ0.MTH6895("total_amount_notification");
        boolean z4 = ᵢﹶ0.MTH6895("f_rp_reply");
        boolean z5 = ᵢﹶ0.MTH6895("f_rp_threshold_reply");
        if(z3 || z4 || z5) {
            Activity activity2 = ((CLS219)this).MTH3883();
            CLS1617 ʻᵎ2 = new CLS1617(activity2);
            ʻᵎ2.MTH7200(z);
            ʻᵎ2.MTH800(CLS27.MTH889("config_custom"));
            ʻᵎ2.FLD5159 = new CLS1027(this, z3, z1, z2, activity2, v1, z4, z5);
            יᐧ0.MTH7296(ʻᵎ2);
        }
        if(!ˈˈ0.MTH5947("fake_amount")) {
            Activity activity3 = ((CLS219)this).MTH3883();
            CLS1617 ʻᵎ3 = new CLS1617(activity3);
            ʻᵎ3.MTH7200(z);
            ʻᵎ3.MTH800(CLS27.MTH889("fake_amount_enable"));
            ʻᵎ3.FLD5159 = new CLS909(this, z1, z2, activity3, 0);
            יᐧ0.MTH7296(ʻᵎ3);
        }
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), CLS523.MTH7137(10));
        if(ᵢﹶ0.MTH6895("redpacket_amount_accumulate")) {
            int v2 = CLS523.MTH7137(10);
            Activity activity4 = ((CLS219)this).MTH3883();
            CLS1623 יᐧ1 = new CLS1623(activity4);
            יᐧ1.MTH798(CLS27.MTH889("money_stat"));
            CLS1626 ـﹳ0 = new CLS1626(activity4);
            ـﹳ0.FLD5295 = false;
            ـﹳ0.MTH800(CLS27.MTH889("money_stat_lbl_rp_personal"));
            CLS1626 ـﹳ1 = new CLS1626(activity4);
            ـﹳ1.FLD5295 = false;
            ـﹳ1.MTH800(CLS27.MTH889("money_stat_lbl_rp_group"));
            CLS1626 ـﹳ2 = new CLS1626(activity4);
            ـﹳ2.FLD5295 = false;
            ـﹳ2.MTH800(CLS27.MTH889("moneytransfer"));
            CLS1626 ـﹳ3 = new CLS1626(activity4);
            ـﹳ3.FLD5295 = false;
            ـﹳ3.MTH800(CLS27.MTH889("money_stat_lbl_total"));
            CLS1626 ـﹳ4 = new CLS1626(activity4);
            ـﹳ4.FLD5295 = false;
            ـﹳ4.MTH800(CLS27.MTH889("money_stat_lbl_accumulate"));
            CLS1234 ˊⁱ0 = new CLS1234(this, ـﹳ0, ـﹳ1, ـﹳ2, ـﹳ3, ـﹳ4, 1);
            CLS1625 ـˏ0 = new CLS1625(activity4);
            ـˏ0.MTH800(CLS27.MTH889("clear_count"));
            ـˏ0.MTH7320(new CLS530(this, ˊⁱ0, 14));
            יᐧ1.MTH7289(new Object[]{ـﹳ0, ـﹳ1, ـﹳ2, ـﹳ3, ـﹳ4, ـˏ0});
            ˊⁱ0.MTH774();
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v2);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH4174(String s, String s1) {
        public final class CLS1102 implements CLS11 {
            public final String FLD2406;
            public final CLS1105 FLD2407;
            public final Activity FLD2408;

            public CLS1102(String s, Activity activity0) {
                this.FLD2406 = s;
                this.FLD2408 = activity0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS1105 ᐧˈ0 = CLS1105.this;
                String s = this.FLD2406;
                if(ᐧˈ0.FLD2151.MTH927(1, s + "rp_notification_type") == 0) {
                    String s1 = CLS182.MTH3475(4100674469586850613L, CLS182.MTH3483(s));
                    if(ᐧˈ0.FLD2151.MTH938(s1, false)) {
                        String s2 = CLS182.MTH3484(4100670754440139573L, new StringBuilder(), s);
                        ᐧˈ0.FLD2414.getClass();
                        CLS485.MTH6726(this.FLD2408, s2);
                    }
                }
            }
        }


        public final class CLS1103 implements CLS2 {
            public final String FLD2409;
            public final CLS1105 FLD2410;

            public CLS1103(String s) {
                this.FLD2409 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                String s2 = this.FLD2409;
                CLS1105 ᐧˈ0 = CLS1105.this;
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    StringBuilder stringBuilder0 = CLS182.MTH3483(s2);
                    stringBuilder0.append("member_incl");
                    ᐧˈ0.FLD2151.MTH922(s, stringBuilder0.toString());
                    return;
                }
                String s3 = CLS182.MTH3475(4100671695037977397L, CLS182.MTH3483(s2));
                ᐧˈ0.FLD2151.MTH922("", s3);
            }
        }


        public final class CLS1104 implements CLS2 {
            public final String FLD2411;
            public final CLS1105 FLD2412;

            public CLS1104(String s) {
                this.FLD2411 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS1105.this.FLD2151.MTH922(s, this.FLD2411 + "member_excl");
            }
        }

        String s2 = TextUtils.isEmpty(s) ? "" : CLS182.MTH3475(4100590021939876661L, CLS182.MTH3483(s));
        Activity activity0 = ((CLS219)this).MTH3883();
        this.FLD2417 = new CLS210(activity0, this.FLD2157);
        this.FLD2421 = new CLS244(activity0, this.FLD2157);
        CLS380[] arr_ʼˎ = {null};
        arr_ʼˎ[0] = CLS523.MTH7133(activity0, s1, ((CLS379)new CLS612(this, s2, activity0, s, 11)), ((CLS378)new CLS766(this, activity0, s, arr_ʼˎ, s1, 3, 0)), ((CLS11)new CLS1102(this, s2, activity0)));
    }

    // 此方法包含解密的字符串
    public final void MTH4175() {
        Activity activity0 = ((CLS219)this).MTH3883();
        String s = CLS34.MTH1074(new StringBuilder(), this.FLD2416, 4100591130041439029L);
        String s1 = this.FLD2151.MTH925(s, "");
        Uri uri0 = TextUtils.isEmpty(s1) ? RingtoneManager.getActualDefaultRingtoneUri(activity0, 2) : Uri.parse(s1);
        Intent intent0 = new Intent("android.intent.action.RINGTONE_PICKER");
        intent0.putExtra("android.intent.extra.ringtone.TYPE", 2);
        intent0.putExtra("android.intent.extra.ringtone.TITLE", CLS27.MTH889("ringtone_selection"));
        intent0.putExtra("android.intent.extra.ringtone.EXISTING_URI", uri0);
        intent0.putExtra("android.intent.extra.ringtone.SHOW_SILENT", false);
        intent0.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
        activity0.startActivityForResult(intent0, 1500);
    }
}


// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ˈˈ.CLS69;
import b.ᵔʾ.CLS1255;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1616;
import b.ﾞˎ.CLS1617;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS534.CLS533;

public final class CLS1063 implements CLS379 {
    public final int FLD2280;
    public final String FLD2281;
    public final CLS1030 FLD2282;
    public final Activity FLD2283;

    public CLS1063(CLS1030 ˎᵢ0, String s, Activity activity0, int v) {
        this.FLD2280 = v;
        this.FLD2282 = ˎᵢ0;
        this.FLD2281 = s;
        this.FLD2283 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        String s3;
        CLS1030 ˎᵢ0 = this.FLD2282;
        if(this.FLD2280 == 0) {
            String s = this.FLD2281;
            Activity activity0 = this.FLD2283;
            ˎᵢ0.getClass();
            int v = CLS523.MTH7137(10);
            String s1 = TextUtils.isEmpty(s) ? "" : CLS182.MTH3475(4100973128727712565L, CLS182.MTH3483(s));
            CLS1623 יᐧ0 = new CLS1623(activity0);
            CLS1635 ﾞᵎ0 = new CLS1635(activity0);
            String s2 = CLS182.MTH3475(4100973167382418229L, CLS182.MTH3487(4100973137317647157L, ﾞᵎ0, s1));
            CLS29 ˎᵢ1 = ˎᵢ0.FLD2151;
            ﾞᵎ0.MTH7437(ˎᵢ1.MTH938(s2, false));
            ﾞᵎ0.MTH7438(new CLS205(ˎᵢ0, s1, s, 0));
            CLS1635 ﾞᵎ1 = new CLS1635(activity0);
            StringBuilder stringBuilder0 = CLS182.MTH3487(4100973240396862261L, ﾞᵎ1, s1);
            stringBuilder0.append("autoreply_webwx_disable");
            ﾞᵎ1.MTH7437(ˎᵢ1.MTH938(stringBuilder0.toString(), false));
            ﾞᵎ1.MTH7438(new CLS234(ˎᵢ0, s1, 3));
            CLS1622 ˑٴ0 = new CLS1622(activity0);
            StringBuilder stringBuilder1 = CLS34.MTH1085(0x38E9951F2B3CD335L, ˑٴ0, s1);
            stringBuilder1.append("autoreply_max_count");
            ˑٴ0.MTH7277(String.valueOf(ˎᵢ1.MTH927(5, stringBuilder1.toString())));
            ˑٴ0.MTH7278(2);
            ˑٴ0.FLD5252 = new CLS1118(ˎᵢ0, s1, 6);
            יᐧ0.MTH7289(new Object[]{ﾞᵎ0, ﾞᵎ1, ˑٴ0});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
            boolean z = CLS426.MTH6126(s);
            if(TextUtils.isEmpty(s) || z) {
                CLS1635 ﾞᵎ2 = new CLS1635(activity0);
                StringBuilder stringBuilder2 = CLS182.MTH3487(4100973601174115125L, ﾞᵎ2, s1);
                stringBuilder2.append("autoreply_only_at");
                ﾞᵎ2.MTH7437(ˎᵢ1.MTH938(stringBuilder2.toString(), false));
                ﾞᵎ2.MTH7438(new CLS234(ˎᵢ0, s1, 13));
                CLS1635 ﾞᵎ3 = new CLS1635(activity0);
                StringBuilder stringBuilder3 = CLS182.MTH3487(4100973751497970485L, ﾞᵎ3, s1);
                stringBuilder3.append("reply_at");
                ﾞᵎ3.MTH7437(ˎᵢ1.MTH938(stringBuilder3.toString(), false));
                ﾞᵎ3.MTH7438(new CLS234(ˎᵢ0, s1, 14));
                CLS1623 יᐧ1 = new CLS1623(activity0);
                יᐧ1.MTH7289(new Object[]{ﾞᵎ2, ﾞᵎ3});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
            }
            if(z) {
                CLS1635 ﾞᵎ4 = new CLS1635(activity0);
                StringBuilder stringBuilder4 = CLS182.MTH3487(4100973828807381813L, ﾞᵎ4, s1);
                stringBuilder4.append("chatroom_autoreply_member_enable");
                ﾞᵎ4.MTH7437(ˎᵢ1.MTH938(stringBuilder4.toString(), false));
                ﾞᵎ4.MTH7438(new CLS234(ˎᵢ0, s1, 15));
                CLS1625 ـˏ0 = new CLS1625(activity0);
                ـˏ0.MTH800(CLS27.MTH889("specify_id"));
                ـˏ0.MTH7320(new CLS199(ˎᵢ0, s, activity0, s1, 0));
                CLS1625 ـˏ1 = new CLS1625(activity0);
                ـˏ1.MTH800(CLS27.MTH889("config_exclude"));
                s3 = s;
                ـˏ1.MTH7320(new CLS199(ˎᵢ0, s, activity0, s1, 1));
                CLS1623 יᐧ2 = new CLS1623(activity0);
                יᐧ2.MTH7289(new Object[]{ﾞᵎ4, ـˏ0, ـˏ1});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), v);
            }
            else {
                s3 = s;
            }
            CLS1635 ﾞᵎ5 = new CLS1635(activity0);
            StringBuilder stringBuilder5 = CLS182.MTH3487(4100973579699278645L, ﾞᵎ5, s1);
            stringBuilder5.append("autoreply_timeframe_enable");
            ﾞᵎ5.MTH7437(ˎᵢ1.MTH938(stringBuilder5.toString(), false));
            ﾞᵎ5.MTH7438(new CLS234(ˎᵢ0, s1, 16));
            CLS1625 ـˏ2 = new CLS1625(activity0);
            ـˏ2.MTH800(CLS27.MTH889("set_timeframe"));
            ـˏ2.MTH7320(new CLS230(activity0, s1, 0));
            CLS1623 יᐧ3 = new CLS1623(activity0);
            יᐧ3.MTH7296(ﾞᵎ5);
            יᐧ3.MTH7296(ـˏ2);
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ3), v);
            CLS1621 ˎᵢ2 = new CLS1621(activity0);
            CLS1616 ʻˏ0 = new CLS1616(activity0);
            CLS1635 ﾞᵎ6 = new CLS1635(activity0);
            StringBuilder stringBuilder6 = CLS182.MTH3487(4100969980516684597L, ﾞᵎ6, s1);
            stringBuilder6.append("autoreply_r_delay_enable");
            ﾞᵎ6.MTH7437(ˎᵢ1.MTH938(stringBuilder6.toString(), false));
            ﾞᵎ6.MTH7438(new CLS198(((CLS219)ˎᵢ0), s1, ˎᵢ2, ((CLS18)ʻˏ0), 0));
            ˎᵢ2.MTH800(CLS27.MTH889("delay"));
            StringBuilder stringBuilder7 = new StringBuilder();
            stringBuilder7.append(s1);
            ˎᵢ2.MTH7268(((long)CLS34.MTH1064(4100969619739431733L, stringBuilder7, ˎᵢ1, 1000)));
            ˎᵢ2.FLD5242 = new CLS1118(ˎᵢ0, s1, 0);
            ʻˏ0.MTH800(CLS27.MTH889("delay"));
            ʻˏ0.FLD5144 = new CLS1118(ˎᵢ0, s1, 1);
            String s4 = ˎᵢ1.MTH925(CLS182.MTH3475(4100969731408581429L, CLS182.MTH3483(s1)), "");
            if(!TextUtils.isEmpty(s4)) {
                String[] arr_s = s4.split(",");
                ʻˏ0.FLD5143 = ((long)Integer.parseInt(arr_s[0])) * 1000L;
                ʻˏ0.FLD5137 = ((long)Integer.parseInt(arr_s[1])) * 1000L;
            }
            if(CLS182.MTH3480(4100970388538577717L, CLS182.MTH3483(s1), ˎᵢ1, false)) {
                ˎᵢ2.MTH801(8);
                ʻˏ0.MTH801(0);
            }
            else {
                ˎᵢ2.MTH801(0);
                ʻˏ0.MTH801(8);
            }
            CLS1623 יᐧ4 = new CLS1623(activity0);
            יᐧ4.MTH7289(new Object[]{ﾞᵎ6, ˎᵢ2, ʻˏ0});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ4), v);
            CLS1635 ﾞᵎ7 = new CLS1635(activity0);
            StringBuilder stringBuilder8 = CLS182.MTH3483(s1);
            stringBuilder8.append("reply_sign_enable");
            ﾞᵎ7.MTH7437(ˎᵢ1.MTH938(stringBuilder8.toString(), false));
            ﾞᵎ7.MTH800(CLS27.MTH889("reply_sign_enable"));
            ﾞᵎ7.MTH7438(new CLS234(ˎᵢ0, s1, 0));
            CLS1622 ˑٴ1 = new CLS1622(activity0);
            ˑٴ1.MTH7277(ˎᵢ1.MTH925(CLS182.MTH3475(4100970165200278325L, CLS34.MTH1085(4100970100775768885L, ˑٴ1, s1)), CLS27.MTH889("reply_sign")));
            ˑٴ1.FLD5252 = new CLS1118(ˎᵢ0, s1, 2);
            CLS1623 יᐧ5 = new CLS1623(activity0);
            יᐧ5.MTH7289(new Object[]{ﾞᵎ7, ˑٴ1});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ5), v);
            CLS1625 ـˏ3 = new CLS1625(activity0);
            CLS1635 ﾞᵎ8 = new CLS1635(activity0);
            ﾞᵎ8.MTH800(CLS27.MTH889("chatrobot_enable"));
            ﾞᵎ8.MTH7437(ˎᵢ1.MTH938((TextUtils.isEmpty(s3) ? "_ANY_" : s3) + "_use_turingrobot", false));
            ﾞᵎ8.MTH7438(new CLS205(ˎᵢ0, s3, ـˏ3, 1));
            CLS1635 ﾞᵎ9 = new CLS1635(activity0);
            StringBuilder stringBuilder9 = CLS182.MTH3487(4100970981244064565L, ﾞᵎ9, s1);
            stringBuilder9.append("robot_keyword_enable");
            ﾞᵎ9.MTH7437(ˎᵢ1.MTH938(stringBuilder9.toString(), false));
            ﾞᵎ9.MTH7438(new CLS234(ˎᵢ0, s1, 1));
            CLS1622 ˑٴ2 = new CLS1622(activity0);
            ˑٴ2.MTH7277(ˎᵢ1.MTH925(CLS182.MTH3475(4100970646236615477L, CLS34.MTH1085(4100970611876877109L, ˑٴ2, s1)), ""));
            ˑٴ2.FLD5252 = new CLS1118(ˎᵢ0, s1, 3);
            CLS1635 ﾞᵎ10 = new CLS1635(activity0);
            StringBuilder stringBuilder10 = CLS182.MTH3487(4100970710661124917L, ﾞᵎ10, s1);
            stringBuilder10.append("robot_interval_delay_enable");
            ﾞᵎ10.MTH7437(ˎᵢ1.MTH938(stringBuilder10.toString(), false));
            ﾞᵎ10.MTH7438(new CLS234(ˎᵢ0, s1, 2));
            CLS1621 ˎᵢ3 = new CLS1621(activity0);
            ˎᵢ3.MTH7268(((long)CLS34.MTH1064(4100971445100532533L, CLS182.MTH3483(s1), ˎᵢ1, 5000)));
            ˎᵢ3.FLD5242 = new CLS1118(ˎᵢ0, s1, 4);
            ˎᵢ3.FLD5233 = true;
            CLS1626 ـﹳ0 = ˎᵢ3.FLD5238;
            if(ـﹳ0 != null) {
                ـﹳ0.FLD5301 = true;
            }
            CLS1625 ـˏ4 = new CLS1625(activity0);
            ـˏ4.MTH800(CLS27.MTH889("config_robot"));
            ـˏ4.MTH7320(new CLS274(ˎᵢ0, s3, 0));
            CLS1623 יᐧ6 = new CLS1623(activity0);
            יᐧ6.MTH7289(new Object[]{ﾞᵎ8, ﾞᵎ9, ˑٴ2, ﾞᵎ10, ˎᵢ3, ـˏ4});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ6), v);
            if(CLS27.MTH890("WXMusicObject")) {
                CLS1623 יᐧ7 = new CLS1623(activity0);
                CLS1635 ﾞᵎ11 = new CLS1635(activity0);
                ﾞᵎ11.MTH800(CLS27.MTH889("songrobot_enable"));
                ﾞᵎ11.MTH7437(ˎᵢ1.MTH938((TextUtils.isEmpty(s3) ? "" : CLS182.MTH3475(4100971153042756405L, CLS182.MTH3483(s3))) + "song_robot_enable", false));
                ﾞᵎ11.MTH7438(new CLS234(ˎᵢ0, s3, 4));
                יᐧ7.MTH7296(ﾞᵎ11);
                CLS1635 ﾞᵎ12 = new CLS1635(activity0);
                ﾞᵎ12.MTH800(CLS27.MTH889("songrobot_self_enable"));
                ﾞᵎ12.MTH7437(ˎᵢ1.MTH938((TextUtils.isEmpty(s3) ? "" : CLS182.MTH3475(4100971337726350133L, CLS182.MTH3483(s3))) + "songrobot_self_enable", false));
                ﾞᵎ12.MTH7438(new CLS234(ˎᵢ0, s3, 5));
                CLS1622 ˑٴ3 = CLS182.MTH3486(יᐧ7, ﾞᵎ12, activity0);
                ˑٴ3.MTH7277(ˎᵢ1.MTH925(CLS182.MTH3475(4100967626874606389L, CLS34.MTH1085(4100967592514868021L, ˑٴ3, s1)), CLS27.MTH889("songrobot_keyword")));
                ˑٴ3.FLD5252 = new CLS1118(ˎᵢ0, s1, 5);
                יᐧ7.MTH7296(ˑٴ3);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ7), v);
            }
            CLS1623 יᐧ8 = new CLS1623(activity0);
            if(!TextUtils.isEmpty(s3)) {
                CLS1635 ﾞᵎ13 = new CLS1635(activity0);
                StringBuilder stringBuilder11 = CLS182.MTH3487(4100967781493429045L, ﾞᵎ13, s1);
                stringBuilder11.append("inherit_general");
                ﾞᵎ13.MTH7437(ˎᵢ1.MTH938(stringBuilder11.toString(), false));
                ﾞᵎ13.MTH7438(new CLS234(ˎᵢ0, s1, 6));
                יᐧ8.MTH7296(ﾞᵎ13);
            }
            ـˏ3.MTH800(CLS27.MTH889("config_responses"));
            ـˏ3.MTH7320(new CLS274(ˎᵢ0, s3, 1));
            CLS1625 ـˏ5 = new CLS1625(activity0);
            ـˏ5.MTH800(CLS27.MTH889("title_autoresponse_keywords"));
            ـˏ5.MTH7320(new CLS274(ˎᵢ0, s3, 2));
            if(ﾞᵎ8.MTH7444()) {
                ـˏ3.MTH801(8);
            }
            יᐧ8.MTH7289(new Object[]{ـˏ3, ـˏ5});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ8), v);
            CLS1635 ﾞᵎ14 = new CLS1635(activity0);
            StringBuilder stringBuilder12 = CLS182.MTH3487(4100968112205910837L, ﾞᵎ14, s1);
            stringBuilder12.append("autoresponse_TYPE_IMAGE_");
            ﾞᵎ14.MTH7437(ˎᵢ1.MTH938(stringBuilder12.toString(), false));
            ﾞᵎ14.MTH7438(new CLS234(ˎᵢ0, s1, 7));
            CLS1625 ـˏ6 = new CLS1625(activity0);
            ـˏ6.MTH800(CLS27.MTH889("config_responses"));
            ـˏ6.MTH7320(new CLS274(ˎᵢ0, s3, 3));
            CLS1635 ﾞᵎ15 = new CLS1635(activity0);
            StringBuilder stringBuilder13 = CLS182.MTH3487(4100967850212905781L, ﾞᵎ15, s1);
            stringBuilder13.append("autoresponse_TYPE_VOICE_");
            ﾞᵎ15.MTH7437(ˎᵢ1.MTH938(stringBuilder13.toString(), false));
            ﾞᵎ15.MTH7438(new CLS234(ˎᵢ0, s1, 8));
            CLS1625 ـˏ7 = new CLS1625(activity0);
            ـˏ7.MTH800(CLS27.MTH889("config_responses"));
            ـˏ7.MTH7320(new CLS274(ˎᵢ0, s3, 4));
            CLS1635 ﾞᵎ16 = new CLS1635(activity0);
            StringBuilder stringBuilder14 = CLS182.MTH3487(4100968687731528501L, ﾞᵎ16, s1);
            stringBuilder14.append("autoresponse_TYPE_VIDEO_");
            ﾞᵎ16.MTH7437(ˎᵢ1.MTH938(stringBuilder14.toString(), false));
            ﾞᵎ16.MTH7438(new CLS234(ˎᵢ0, s1, 9));
            CLS1625 ـˏ8 = new CLS1625(activity0);
            ـˏ8.MTH800(CLS27.MTH889("config_responses"));
            ـˏ8.MTH7320(new CLS274(ˎᵢ0, s3, 5));
            CLS1635 ﾞᵎ17 = new CLS1635(activity0);
            StringBuilder stringBuilder15 = CLS182.MTH3487(0x38E9910E2B3CD335L, ﾞᵎ17, s1);
            stringBuilder15.append("autoresponse_TYPE_VIDEOCALLFAIL_");
            ﾞᵎ17.MTH7437(ˎᵢ1.MTH938(stringBuilder15.toString(), false));
            ﾞᵎ17.MTH7438(new CLS234(ˎᵢ0, s1, 10));
            CLS1625 ـˏ9 = new CLS1625(activity0);
            ـˏ9.MTH800(CLS27.MTH889("config_responses"));
            ـˏ9.MTH7320(new CLS274(ˎᵢ0, s3, 6));
            CLS1635 ﾞᵎ18 = new CLS1635(activity0);
            StringBuilder stringBuilder16 = CLS182.MTH3487(4100969331976622901L, ﾞᵎ18, s1);
            stringBuilder16.append("autoresponse_TYPE_VOICECALLFAIL_");
            ﾞᵎ18.MTH7437(ˎᵢ1.MTH938(stringBuilder16.toString(), false));
            ﾞᵎ18.MTH7438(new CLS234(ˎᵢ0, s1, 11));
            CLS1625 ـˏ10 = new CLS1625(activity0);
            ـˏ10.MTH800(CLS27.MTH889("config_responses"));
            ـˏ10.MTH7320(new CLS274(ˎᵢ0, s3, 7));
            CLS1635 ﾞᵎ19 = new CLS1635(activity0);
            StringBuilder stringBuilder17 = CLS182.MTH3487(4100969138703094581L, ﾞᵎ19, s1);
            stringBuilder17.append("autoresponse_TYPE_PAT_");
            ﾞᵎ19.MTH7437(ˎᵢ1.MTH938(stringBuilder17.toString(), false));
            ﾞᵎ19.MTH7438(new CLS234(ˎᵢ0, s1, 12));
            CLS1625 ـˏ11 = new CLS1625(activity0);
            ـˏ8.MTH800(CLS27.MTH889("config_responses"));
            ـˏ8.MTH7320(new CLS274(ˎᵢ0, s3, 8));
            CLS1623 יᐧ9 = new CLS1623(activity0);
            יᐧ9.MTH7289(new Object[]{ﾞᵎ14, ـˏ6, ﾞᵎ15, ـˏ7, ﾞᵎ16, ـˏ8, ﾞᵎ17, ـˏ9, ﾞᵎ18, ـˏ10, ﾞᵎ19, ـˏ11});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ9), v);
            return;
        }
        String s5 = this.FLD2281;
        ˎᵢ0.getClass();
        String s6 = TextUtils.isEmpty(s5) ? "" : CLS182.MTH3475(4101001630130688821L, CLS182.MTH3483(s5));
        Activity activity1 = this.FLD2283;
        CLS1622 ˑٴ4 = new CLS1622(activity1);
        CLS1625 ـˏ12 = new CLS1625(activity1);
        CLS1622 ˑٴ5 = new CLS1622(activity1);
        CLS1635 ﾞᵎ20 = new CLS1635(activity1);
        String s7 = CLS182.MTH3475(4101001724619969333L, CLS182.MTH3487(4101001638720623413L, ﾞᵎ20, s6));
        ﾞᵎ20.MTH7437(ˎᵢ0.FLD2151.MTH938(s7, true));
        ﾞᵎ20.MTH7438(new CLS234(ˎᵢ0, s6, 17));
        CLS1623 יᐧ10 = new CLS1623(activity1);
        CLS1622 ˑٴ6 = new CLS1622(activity1);
        String s8 = CLS182.MTH3475(4101001866353890101L, CLS34.MTH1085(4101001810519315253L, ˑٴ6, s6));
        ˑٴ6.MTH7277(ˎᵢ0.FLD2151.MTH925(s8, "gpt-3.5-turbo"));
        ˑٴ6.FLD5252 = new CLS1118(ˎᵢ0, s6, 8);
        CLS1622 ˑٴ7 = CLS34.MTH1069(יᐧ10, ˑٴ6, activity1);
        String s9 = CLS182.MTH3475(4101001509871604533L, CLS34.MTH1085(4101001432562193205L, ˑٴ7, s6));
        ˑٴ7.MTH7277(ˎᵢ0.FLD2151.MTH925(s9, ""));
        ˑٴ7.FLD5252 = new CLS1118(ˎᵢ0, s6, 9);
        יᐧ10.MTH7296(ˑٴ7);
        CLS1622 ˑٴ8 = new CLS1622(activity1);
        ˑٴ8.MTH7278(2);
        StringBuilder stringBuilder18 = CLS34.MTH1085(4101001591475983157L, ˑٴ8, s6);
        stringBuilder18.append("openai_history_msg");
        ˑٴ8.MTH7277(String.valueOf(ˎᵢ0.FLD2151.MTH927(0, stringBuilder18.toString())));
        ˑٴ8.FLD5252 = new CLS1118(ˎᵢ0, s6, 10);
        יᐧ10.MTH7296(ˑٴ8);
        CLS1617 ʻᵎ0 = new CLS1617(activity1);
        ʻᵎ0.MTH800(CLS27.MTH889("advanced_options"));
        ʻᵎ0.FLD5159 = new CLS1255(ˎᵢ0, activity1, 28);
        יᐧ10.MTH7296(ʻᵎ0);
        יᐧ10.MTH801(8);
        CLS1622 ˑٴ9 = new CLS1622(activity1);
        String s10 = CLS182.MTH3469(0x38E9AFEF2B3CD335L, ˑٴ9, 4101001913598530357L);
        ˑٴ9.MTH7277(ˎᵢ0.FLD2151.MTH925(s10, ""));
        ˑٴ9.FLD5256 = "http://...";
        ˑٴ9.FLD5252 = new CLS1178(ˎᵢ0, 4);
        CLS1623 יᐧ11 = new CLS1623(activity1);
        CLS1621 ˎᵢ4 = new CLS1621(activity1);
        ˎᵢ4.MTH800(CLS27.MTH889("connection_timeout"));
        ˎᵢ4.FLD5242 = new CLS1118(ˎᵢ0, s5, 11);
        יᐧ11.MTH7296(ˎᵢ4);
        CLS1621 ˎᵢ5 = new CLS1621(activity1);
        ˎᵢ5.MTH800(CLS27.MTH889("read_timeout"));
        ˎᵢ5.FLD5242 = new CLS1118(ˎᵢ0, s5, 12);
        יᐧ11.MTH7296(ˎᵢ5);
        CLS69 ʾᵢ0 = new CLS69();
        ʾᵢ0.MTH1560(CLS34.MTH1059(4100998580703908661L, ʾᵢ0, CLS34.MTH1059(4100998499099530037L, ʾᵢ0, CLS34.MTH1059(4100998396020314933L, ʾᵢ0, CLS27.MTH889("turing_robot"), 4100998451854889781L), 4100998546344170293L), 4100998065307833141L), "weixin_aibot");
        if(!CLS412.MTH6002()) {
            ʾᵢ0.MTH1560(CLS34.MTH1059(4100998928596259637L, ʾᵢ0, CLS34.MTH1059(4100998245696459573L, ʾᵢ0, CLS27.MTH889("chatgpt_for_bot"), 4100998314415936309L), 4100998958661030709L), "welm");
        }
        CLS1620 ˊˏ0 = new CLS1620(activity1);
        ˊˏ0.MTH7248(((CLS533)new CLS1106(ˎᵢ0, ʾᵢ0, s6, ˑٴ4, ˑٴ5, ـˏ12, ﾞᵎ20, יᐧ10, ˎᵢ4, ˎᵢ5, ˑٴ9, s5)));
        ˊˏ0.MTH7247(ʾᵢ0.MTH1566());
        ˊˏ0.MTH7246(((String)ʾᵢ0.MTH1559(CLS404.MTH5890(s5))));
        CLS523.MTH7147(linearLayout0, ((CLS18)ˊˏ0), true);
        ˑٴ4.MTH800(CLS27.MTH882("apikey"));
        ˑٴ4.MTH7278(1);
        ˑٴ4.FLD5252 = new CLS1118(ˎᵢ0, s5, 13);
        ˑٴ5.MTH800(CLS27.MTH882("secretkey"));
        ˑٴ5.MTH7278(1);
        ˑٴ5.FLD5252 = new CLS1118(ˎᵢ0, s5, 7);
        CLS523.MTH7157(!"mly_bot".equals(CLS404.MTH5914()), new CLS18[]{ﾞᵎ20});
        CLS523.MTH7157(!"chatgpt_for_bot".equals(CLS404.MTH5914()), new CLS18[]{ˑٴ9});
        CLS1623 יᐧ12 = new CLS1623(activity1);
        יᐧ12.MTH7289(new Object[]{ˑٴ4, ˑٴ5, ﾞᵎ20});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ12), CLS523.MTH7137(10));
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ11), CLS523.MTH7137(10));
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ10), CLS523.MTH7137(10));
        CLS523.MTH7154(linearLayout0, ((CLS18)ˑٴ9), CLS523.MTH7137(10));
        ـˏ12.MTH7320(new CLS230(s5, activity1, 1));
        CLS523.MTH7147(linearLayout0, ((CLS18)ـˏ12), true);
    }
}


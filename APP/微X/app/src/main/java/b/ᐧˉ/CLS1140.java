// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1617.CLS526;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1635;

public final class CLS1140 implements CLS526 {
    public final int FLD2577;
    public final int FLD2578;
    public final Activity FLD2579;
    public final CLS1019 FLD2580;
    public final String FLD2581;

    public CLS1140(CLS1019 ˎʻ0, Activity activity0, String s, int v, int v1) {
        this.FLD2577 = v1;
        this.FLD2580 = ˎʻ0;
        this.FLD2579 = activity0;
        this.FLD2581 = s;
        this.FLD2578 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1617$CLS526
    public final void MTH7191(LinearLayout linearLayout0) {
        int v = this.FLD2578;
        String s = this.FLD2581;
        Activity activity0 = this.FLD2579;
        CLS1019 ˎʻ0 = this.FLD2580;
        switch(this.FLD2577) {
            case 0: {
                ˎʻ0.getClass();
                CLS1623 יᐧ1 = new CLS1623(activity0);
                CLS1635 ﾞᵎ1 = new CLS1635(activity0);
                String s3 = CLS182.MTH3475(4100689716720751413L, CLS182.MTH3487(4100690146217481013L, ﾞᵎ1, s));
                CLS29 ˎᵢ1 = ˎʻ0.FLD2151;
                ﾞᵎ1.MTH7437(ˎᵢ1.MTH938(s3, false));
                CLS34.MTH1083(ˎʻ0, s, 24, ﾞᵎ1);
                CLS1622 ˑٴ3 = CLS182.MTH3486(יᐧ1, ﾞᵎ1, activity0);
                ˑٴ3.MTH7277(ˎᵢ1.MTH925(CLS182.MTH3475(4100689871339574069L, CLS34.MTH1085(4100689841274802997L, ˑٴ3, s)), CLS27.MTH889("article_ban_reason")));
                ˑٴ3.FLD5252 = new CLS1096(ˎʻ0, s, 24);
                יᐧ1.MTH7296(ˑٴ3);
                if(ˎᵢ1.MTH938("ban_timelimited", false)) {
                    CLS1621 ˎᵢ2 = new CLS1621(activity0);
                    ˎᵢ2.MTH800(CLS27.MTH889("ban_max_time_lbl"));
                    StringBuilder stringBuilder1 = new StringBuilder();
                    stringBuilder1.append(s);
                    String s4 = ˎᵢ1.MTH925(CLS182.MTH3475(0x38E8907E2B3CD335L, stringBuilder1), "");
                    if(!TextUtils.isEmpty(s4)) {
                        ˎᵢ2.MTH7268(Long.parseLong(s4, 16));
                    }
                    ˎᵢ2.FLD5242 = new CLS1096(ˎʻ0, s, 25);
                    יᐧ1.MTH7296(ˎᵢ2);
                }
                CLS1623 יᐧ2 = CLS34.MTH1087(linearLayout0, יᐧ1, v, activity0);
                CLS1635 ﾞᵎ2 = new CLS1635(activity0);
                StringBuilder stringBuilder2 = CLS182.MTH3487(4100685881314956085L, ﾞᵎ2, s);
                stringBuilder2.append("_chatroom_article_ban_warning_enable");
                ﾞᵎ2.MTH7437(ˎᵢ1.MTH938(stringBuilder2.toString(), false));
                CLS34.MTH1083(ˎʻ0, s, 25, ﾞᵎ2);
                CLS1622 ˑٴ4 = CLS182.MTH3486(יᐧ2, ﾞᵎ2, activity0);
                StringBuilder stringBuilder3 = CLS34.MTH1085(4100686654409069365L, ˑٴ4, s);
                stringBuilder3.append("_chatroom_article_ban_warning_max");
                ˑٴ4.MTH7277(String.valueOf(ˎᵢ1.MTH927(3, stringBuilder3.toString())));
                ˑٴ4.MTH7278(2);
                ˑٴ4.FLD5252 = new CLS1096(ˎʻ0, s, 26);
                CLS1622 ˑٴ5 = CLS34.MTH1069(יᐧ2, ˑٴ4, activity0);
                ˑٴ5.MTH7277(ˎᵢ1.MTH925(CLS182.MTH3475(4100686366646260533L, CLS34.MTH1085(0x38E890F92B3CD335L, ˑٴ5, s)), CLS27.MTH889("warning_default_text")));
                ˑٴ5.MTH7278(1);
                ˑٴ5.FLD5252 = new CLS1096(ˎʻ0, s, 27);
                יᐧ2.MTH7296(ˑٴ5);
                CLS1625 ـˏ0 = new CLS1625(activity0);
                ـˏ0.MTH800(CLS27.MTH889("autokick_warning_management"));
                ـˏ0.MTH7320(new CLS230(activity0, s, 7));
                יᐧ2.MTH7296(ـˏ0);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), v);
                return;
            }
            case 1: {
                ˎʻ0.getClass();
                CLS1623 יᐧ3 = new CLS1623(activity0);
                CLS1635 ﾞᵎ3 = new CLS1635(activity0);
                String s5 = CLS182.MTH3475(4100692044593025845L, CLS182.MTH3487(4100691941513810741L, ﾞᵎ3, s));
                CLS29 ˎᵢ3 = ˎʻ0.FLD2151;
                ﾞᵎ3.MTH7437(ˎᵢ3.MTH938(s5, false));
                CLS34.MTH1083(ˎʻ0, s, 19, ﾞᵎ3);
                CLS1622 ˑٴ6 = CLS182.MTH3486(יᐧ3, ﾞᵎ3, activity0);
                ˑٴ6.MTH7277(ˎᵢ3.MTH925(CLS182.MTH3475(4100688333741282101L, CLS34.MTH1085(4100688303676511029L, ˑٴ6, s)), CLS27.MTH889("app_ban_reason")));
                ˑٴ6.FLD5252 = new CLS1096(ˎʻ0, s, 13);
                יᐧ3.MTH7296(ˑٴ6);
                if(ˎᵢ3.MTH938("ban_timelimited", false)) {
                    CLS1621 ˎᵢ4 = new CLS1621(activity0);
                    ˎᵢ4.MTH800(CLS27.MTH889("ban_max_time_lbl"));
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append(s);
                    String s6 = ˎᵢ3.MTH925(CLS182.MTH3475(4100688058863375157L, stringBuilder4), "");
                    if(!TextUtils.isEmpty(s6)) {
                        ˎᵢ4.MTH7268(Long.parseLong(s6, 16));
                    }
                    ˎᵢ4.FLD5242 = new CLS1096(ˎʻ0, s, 14);
                    יᐧ3.MTH7296(ˎᵢ4);
                }
                CLS1623 יᐧ4 = CLS34.MTH1087(linearLayout0, יᐧ3, v, activity0);
                CLS1635 ﾞᵎ4 = new CLS1635(activity0);
                StringBuilder stringBuilder5 = CLS182.MTH3487(4100688140467753781L, ﾞᵎ4, s);
                stringBuilder5.append("_chatroom_app_ban_warning_enable");
                ﾞᵎ4.MTH7437(ˎᵢ3.MTH938(stringBuilder5.toString(), false));
                CLS34.MTH1083(ˎʻ0, s, 20, ﾞᵎ4);
                CLS1622 ˑٴ7 = CLS182.MTH3486(יᐧ4, ﾞᵎ4, activity0);
                StringBuilder stringBuilder6 = CLS34.MTH1085(4100688896381997877L, ˑٴ7, s);
                stringBuilder6.append("_chatroom_app_ban_warning_max");
                ˑٴ7.MTH7277(String.valueOf(ˎᵢ3.MTH927(3, stringBuilder6.toString())));
                ˑٴ7.MTH7278(2);
                ˑٴ7.FLD5252 = new CLS1096(ˎʻ0, s, 15);
                CLS1622 ˑٴ8 = CLS34.MTH1069(יᐧ4, ˑٴ7, activity0);
                ˑٴ8.MTH7277(ˎᵢ3.MTH925(CLS182.MTH3475(4100688591439319861L, CLS34.MTH1085(4100689085360558901L, ˑٴ8, s)), CLS27.MTH889("warning_default_text")));
                ˑٴ8.MTH7278(1);
                ˑٴ8.FLD5252 = new CLS1096(ˎʻ0, s, 16);
                יᐧ4.MTH7296(ˑٴ8);
                CLS1625 ـˏ1 = new CLS1625(activity0);
                ـˏ1.MTH800(CLS27.MTH889("autokick_warning_management"));
                ـˏ1.MTH7320(new CLS230(activity0, s, 5));
                יᐧ4.MTH7296(ـˏ1);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ4), v);
                return;
            }
            case 2: {
                ˎʻ0.getClass();
                CLS1623 יᐧ5 = new CLS1623(activity0);
                CLS1635 ﾞᵎ5 = new CLS1635(activity0);
                String s7 = CLS182.MTH3475(0x38E897F02B3CD335L, CLS182.MTH3487(4100694385350202165L, ﾞᵎ5, s));
                CLS29 ˎᵢ5 = ˎʻ0.FLD2151;
                ﾞᵎ5.MTH7437(ˎᵢ5.MTH938(s7, false));
                CLS34.MTH1083(ˎʻ0, s, 16, ﾞᵎ5);
                CLS1622 ˑٴ9 = CLS182.MTH3486(יᐧ5, ﾞᵎ5, activity0);
                ˑٴ9.MTH7277(ˎᵢ5.MTH925(CLS182.MTH3475(4100694136242098997L, CLS34.MTH1085(4100694106177327925L, ˑٴ9, s)), CLS27.MTH889("friendcard_ban_reason")));
                ˑٴ9.FLD5252 = new CLS1096(ˎʻ0, s, 6);
                יᐧ5.MTH7296(ˑٴ9);
                if(ˎᵢ5.MTH938("ban_timelimited", false)) {
                    CLS1621 ˎᵢ6 = new CLS1621(activity0);
                    ˎᵢ6.MTH800(CLS27.MTH889("ban_max_time_lbl"));
                    StringBuilder stringBuilder7 = new StringBuilder();
                    stringBuilder7.append(s);
                    String s8 = ˎᵢ5.MTH925(CLS182.MTH3475(4100690622958850869L, stringBuilder7), "");
                    if(!TextUtils.isEmpty(s8)) {
                        ˎᵢ6.MTH7268(Long.parseLong(s8, 16));
                    }
                    ˎᵢ6.FLD5242 = new CLS1096(ˎʻ0, s, 7);
                    יᐧ5.MTH7296(ˎᵢ6);
                }
                CLS1623 יᐧ6 = CLS34.MTH1087(linearLayout0, יᐧ5, v, activity0);
                CLS1635 ﾞᵎ6 = new CLS1635(activity0);
                StringBuilder stringBuilder8 = CLS182.MTH3487(4100690734628000565L, ﾞᵎ6, s);
                stringBuilder8.append("_chatroom_friendcard_ban_warning_enable");
                ﾞᵎ6.MTH7437(ˎᵢ5.MTH938(stringBuilder8.toString(), false));
                CLS34.MTH1083(ˎʻ0, s, 17, ﾞᵎ6);
                CLS1622 ˑٴ10 = CLS182.MTH3486(יᐧ6, ﾞᵎ6, activity0);
                StringBuilder stringBuilder9 = CLS34.MTH1085(4100690421095387957L, ˑٴ10, s);
                stringBuilder9.append("_chatroom_friendcard_ban_warning_max");
                ˑٴ10.MTH7277(String.valueOf(ˎᵢ5.MTH927(3, stringBuilder9.toString())));
                ˑٴ10.MTH7278(2);
                ˑٴ10.FLD5252 = new CLS1096(ˎʻ0, s, 8);
                CLS1622 ˑٴ11 = CLS34.MTH1069(יᐧ6, ˑٴ10, activity0);
                ˑٴ11.MTH7277(ˎᵢ5.MTH925(CLS182.MTH3475(4100691245729108789L, CLS34.MTH1085(4100691189894533941L, ˑٴ11, s)), CLS27.MTH889("warning_default_text")));
                ˑٴ11.MTH7278(1);
                ˑٴ11.FLD5252 = new CLS1096(ˎʻ0, s, 9);
                יᐧ6.MTH7296(ˑٴ11);
                CLS1625 ـˏ2 = new CLS1625(activity0);
                ـˏ2.MTH800(CLS27.MTH889("autokick_warning_management"));
                ـˏ2.MTH7320(new CLS230(activity0, s, 4));
                יᐧ6.MTH7296(ـˏ2);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ6), v);
                return;
            }
            case 3: {
                ˎʻ0.getClass();
                CLS1623 יᐧ7 = new CLS1623(activity0);
                CLS1635 ﾞᵎ7 = new CLS1635(activity0);
                String s9 = CLS182.MTH3475(4100714245278978869L, CLS182.MTH3487(4100714129314861877L, ﾞᵎ7, s));
                CLS29 ˎᵢ7 = ˎʻ0.FLD2151;
                ﾞᵎ7.MTH7437(ˎᵢ7.MTH938(s9, false));
                CLS34.MTH1083(ˎʻ0, s, 28, ﾞᵎ7);
                CLS1622 ˑٴ12 = CLS182.MTH3486(יᐧ7, ﾞᵎ7, activity0);
                ˑٴ12.MTH7277(ˎᵢ7.MTH925(CLS182.MTH3475(4100713845847020341L, CLS34.MTH1085(4100714365538063157L, ˑٴ12, s)), CLS27.MTH889("images_ban_reason")));
                ˑٴ12.FLD5252 = new CLS1107(ˎʻ0, s, 3);
                יᐧ7.MTH7296(ˑٴ12);
                if(ˎᵢ7.MTH938("ban_timelimited", false)) {
                    CLS1621 ˎᵢ8 = new CLS1621(activity0);
                    ˎᵢ8.MTH800(CLS27.MTH889("ban_max_time_lbl"));
                    StringBuilder stringBuilder10 = new StringBuilder();
                    stringBuilder10.append(s);
                    String s10 = ˎᵢ7.MTH925(CLS182.MTH3475(4100692706017989429L, stringBuilder10), "");
                    if(!TextUtils.isEmpty(s10)) {
                        ˎᵢ8.MTH7268(Long.parseLong(s10, 16));
                    }
                    ˎᵢ8.FLD5242 = new CLS1107(ˎʻ0, s, 4);
                    יᐧ7.MTH7296(ˎᵢ8);
                }
                CLS1623 יᐧ8 = CLS34.MTH1087(linearLayout0, יᐧ7, v, activity0);
                CLS1635 ﾞᵎ8 = new CLS1635(activity0);
                StringBuilder stringBuilder11 = CLS182.MTH3487(4100692800507269941L, ﾞᵎ8, s);
                stringBuilder11.append("_chatroom_images_ban_warning_enable");
                ﾞᵎ8.MTH7437(ˎᵢ7.MTH938(stringBuilder11.toString(), false));
                CLS34.MTH1083(ˎʻ0, s, 29, ﾞᵎ8);
                CLS1622 ˑٴ13 = CLS182.MTH3486(יᐧ8, ﾞᵎ8, activity0);
                StringBuilder stringBuilder12 = CLS34.MTH1085(4100692469794788149L, ˑٴ13, s);
                stringBuilder12.append("_chatroom_images_ban_warning_max");
                ˑٴ13.MTH7277(String.valueOf(ˎᵢ7.MTH927(3, stringBuilder12.toString())));
                ˑٴ13.MTH7278(2);
                ˑٴ13.FLD5252 = new CLS1107(ˎʻ0, s, 5);
                CLS1622 ˑٴ14 = CLS34.MTH1069(יᐧ8, ˑٴ13, activity0);
                ˑٴ14.MTH7277(ˎᵢ7.MTH925(CLS182.MTH3475(0x38E896CF2B3CD335L, CLS34.MTH1085(4100693221414064949L, ˑٴ14, s)), CLS27.MTH889("warning_default_text")));
                ˑٴ14.MTH7278(1);
                ˑٴ14.FLD5252 = new CLS1107(ˎʻ0, s, 6);
                יᐧ8.MTH7296(ˑٴ14);
                CLS1625 ـˏ3 = new CLS1625(activity0);
                ـˏ3.MTH800(CLS27.MTH889("autokick_warning_management"));
                ـˏ3.MTH7320(new CLS230(activity0, s, 9));
                יᐧ8.MTH7296(ـˏ3);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ8), v);
                return;
            }
            case 4: {
                ˎʻ0.getClass();
                CLS1623 יᐧ9 = new CLS1623(activity0);
                CLS1635 ﾞᵎ9 = new CLS1635(activity0);
                String s11 = CLS182.MTH3475(4100716397057594165L, CLS182.MTH3487(4100715731337663285L, ﾞᵎ9, s));
                CLS29 ˎᵢ9 = ˎʻ0.FLD2151;
                ﾞᵎ9.MTH7437(ˎᵢ9.MTH938(s11, false));
                CLS34.MTH1083(ˎʻ0, s, 22, ﾞᵎ9);
                CLS1622 ˑٴ15 = CLS182.MTH3486(יᐧ9, ﾞᵎ9, activity0);
                ˑٴ15.MTH7277(ˎᵢ9.MTH925(CLS182.MTH3475(0x38E8ABF92B3CD335L, CLS34.MTH1085(0x38E8ABF22B3CD335L, ˑٴ15, s)), CLS27.MTH889("qrcode_ban_reason")));
                ˑٴ15.FLD5252 = new CLS1096(ˎʻ0, s, 20);
                יᐧ9.MTH7296(ˑٴ15);
                if(ˎᵢ9.MTH938("ban_timelimited", false)) {
                    CLS1621 ˎᵢ10 = new CLS1621(activity0);
                    ˎᵢ10.MTH800(CLS27.MTH889("ban_max_time_lbl"));
                    StringBuilder stringBuilder13 = new StringBuilder();
                    stringBuilder13.append(s);
                    String s12 = ˎᵢ9.MTH925(CLS182.MTH3475(0x38E8ABBF2B3CD335L, stringBuilder13), "");
                    if(!TextUtils.isEmpty(s12)) {
                        ˎᵢ10.MTH7268(Long.parseLong(s12, 16));
                    }
                    ˎᵢ10.FLD5242 = new CLS1096(ˎʻ0, s, 21);
                    יᐧ9.MTH7296(ˎᵢ10);
                }
                CLS1623 יᐧ10 = CLS34.MTH1087(linearLayout0, יᐧ9, v, activity0);
                CLS1635 ﾞᵎ10 = new CLS1635(activity0);
                StringBuilder stringBuilder14 = CLS182.MTH3487(4100712544471929653L, ﾞᵎ10, s);
                stringBuilder14.append("_chatroom_qrcode_ban_warning_enable");
                ﾞᵎ10.MTH7437(ˎᵢ9.MTH938(stringBuilder14.toString(), false));
                CLS34.MTH1083(ˎʻ0, s, 23, ﾞᵎ10);
                CLS1622 ˑٴ16 = CLS182.MTH3486(יᐧ10, ﾞᵎ10, activity0);
                StringBuilder stringBuilder15 = CLS34.MTH1085(0x38E8A8082B3CD335L, ˑٴ16, s);
                stringBuilder15.append("_chatroom_qrcode_ban_warning_max");
                ˑٴ16.MTH7277(String.valueOf(ˎᵢ9.MTH927(3, stringBuilder15.toString())));
                ˑٴ16.MTH7278(2);
                ˑٴ16.FLD5252 = new CLS1096(ˎʻ0, s, 22);
                CLS1622 ˑٴ17 = CLS34.MTH1069(יᐧ10, ˑٴ16, activity0);
                ˑٴ17.MTH7277(ˎᵢ9.MTH925(CLS182.MTH3475(4100713021213299509L, CLS34.MTH1085(4100712415622910773L, ˑٴ17, s)), CLS27.MTH889("warning_default_text")));
                ˑٴ17.MTH7278(1);
                ˑٴ17.FLD5252 = new CLS1096(ˎʻ0, s, 23);
                יᐧ10.MTH7296(ˑٴ17);
                CLS1625 ـˏ4 = new CLS1625(activity0);
                ـˏ4.MTH800(CLS27.MTH889("autokick_warning_management"));
                ـˏ4.MTH7320(new CLS230(activity0, s, 6));
                יᐧ10.MTH7296(ـˏ4);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ10), v);
                return;
            }
            case 5: {
                ˎʻ0.getClass();
                CLS1623 יᐧ11 = new CLS1623(activity0);
                CLS1635 ﾞᵎ11 = new CLS1635(activity0);
                String s13 = CLS182.MTH3475(4100717977605559093L, CLS182.MTH3487(4100717320475562805L, ﾞᵎ11, s));
                CLS29 ˎᵢ11 = ˎʻ0.FLD2151;
                ﾞᵎ11.MTH7437(ˎᵢ11.MTH938(s13, false));
                CLS34.MTH1083(ˎʻ0, s, 26, ﾞᵎ11);
                CLS1622 ˑٴ18 = CLS182.MTH3486(יᐧ11, ﾞᵎ11, activity0);
                ˑٴ18.MTH800(CLS27.MTH889("keyword"));
                ˑٴ18.MTH798(CLS27.MTH889("fill_in_filter_keywords_separate_using"));
                StringBuilder stringBuilder16 = new StringBuilder();
                stringBuilder16.append(s);
                ˑٴ18.MTH7277(ˎᵢ11.MTH925(CLS182.MTH3475(0x38E8AD0F2B3CD335L, stringBuilder16), ""));
                ˑٴ18.FLD5252 = new CLS1096(ˎʻ0, s, 28);
                יᐧ11.MTH7296(ˑٴ18);
                CLS1625 ـˏ5 = new CLS1625(activity0);
                ـˏ5.MTH800(CLS27.MTH889("add_keyword"));
                ـˏ5.MTH7320(new CLS222(ˎʻ0, activity0, ˑٴ18, 1));
                יᐧ11.MTH7296(ـˏ5);
                CLS1622 ˑٴ19 = new CLS1622(activity0);
                ˑٴ19.MTH7277(ˎᵢ11.MTH925(CLS182.MTH3475(4100717930360918837L, CLS34.MTH1085(4100717900296147765L, ˑٴ19, s)), CLS27.MTH889("goodbye_text")));
                ˑٴ19.FLD5252 = new CLS1096(ˎʻ0, s, 29);
                יᐧ11.MTH7296(ˑٴ19);
                if(ˎᵢ11.MTH938("ban_timelimited", false)) {
                    CLS1621 ˎᵢ12 = new CLS1621(activity0);
                    ˎᵢ12.MTH800(CLS27.MTH889("ban_max_time_lbl"));
                    StringBuilder stringBuilder17 = new StringBuilder();
                    stringBuilder17.append(s);
                    String s14 = ˎᵢ11.MTH925(CLS182.MTH3475(0x38E8ADFF2B3CD335L, stringBuilder17), "");
                    if(!TextUtils.isEmpty(s14)) {
                        ˎᵢ12.MTH7268(Long.parseLong(s14, 16));
                    }
                    ˎᵢ12.FLD5242 = new CLS1107(ˎʻ0, s, 0);
                    יᐧ11.MTH7296(ˎᵢ12);
                }
                CLS1623 יᐧ12 = CLS34.MTH1087(linearLayout0, יᐧ11, v, activity0);
                CLS1635 ﾞᵎ12 = new CLS1635(activity0);
                StringBuilder stringBuilder18 = CLS182.MTH3487(4100718304023073589L, ﾞᵎ12, s);
                stringBuilder18.append("_chatroom_keyword_ban_warning_enable");
                ﾞᵎ12.MTH7437(ˎᵢ11.MTH938(stringBuilder18.toString(), false));
                CLS34.MTH1083(ˎʻ0, s, 27, ﾞᵎ12);
                CLS1622 ˑٴ20 = CLS182.MTH3486(יᐧ12, ﾞᵎ12, activity0);
                StringBuilder stringBuilder19 = CLS34.MTH1085(4100714679070675765L, ˑٴ20, s);
                stringBuilder19.append("_chatroom_keyword_ban_warning_max");
                ˑٴ20.MTH7277(String.valueOf(ˎᵢ11.MTH927(3, stringBuilder19.toString())));
                ˑٴ20.MTH7278(2);
                ˑٴ20.FLD5252 = new CLS1107(ˎʻ0, s, 1);
                CLS1622 ˑٴ21 = CLS34.MTH1069(יᐧ12, ˑٴ20, activity0);
                ˑٴ21.MTH7277(ˎᵢ11.MTH925(CLS182.MTH3475(4100714391307866933L, CLS34.MTH1085(4100714885229105973L, ˑٴ21, s)), CLS27.MTH889("warning_default_text")));
                ˑٴ21.MTH7278(1);
                ˑٴ21.FLD5252 = new CLS1107(ˎʻ0, s, 2);
                יᐧ12.MTH7296(ˑٴ21);
                CLS1625 ـˏ6 = new CLS1625(activity0);
                ـˏ6.MTH800(CLS27.MTH889("autokick_warning_management"));
                ـˏ6.MTH7320(new CLS230(activity0, s, 8));
                יᐧ12.MTH7296(ـˏ6);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ12), v);
                return;
            }
            case 6: {
                ˎʻ0.getClass();
                CLS1623 יᐧ13 = new CLS1623(activity0);
                CLS1635 ﾞᵎ13 = new CLS1635(activity0);
                String s15 = CLS182.MTH3475(4100702597327672117L, CLS182.MTH3487(4100701931607741237L, ﾞᵎ13, s));
                CLS29 ˎᵢ13 = ˎʻ0.FLD2151;
                ﾞᵎ13.MTH7437(ˎᵢ13.MTH938(s15, false));
                CLS34.MTH1083(ˎʻ0, s, 18, ﾞᵎ13);
                CLS1622 ˑٴ22 = CLS182.MTH3486(יᐧ13, ﾞᵎ13, activity0);
                ˑٴ22.MTH800(CLS27.MTH889("text_max_length_lbl"));
                ˑٴ22.MTH7278(2);
                ˑٴ22.MTH7277(String.valueOf(ˎᵢ13.MTH927(200, s + "_text_max_length")));
                ˑٴ22.FLD5252 = new CLS1096(ˎʻ0, s, 10);
                CLS1622 ˑٴ23 = CLS34.MTH1069(יᐧ13, ˑٴ22, activity0);
                ˑٴ23.MTH7277(ˎᵢ13.MTH925(CLS182.MTH3475(4100702356809503541L, CLS34.MTH1085(0x38E89F0A2B3CD335L, ˑٴ23, s)), CLS27.MTH889("text_max_ban_reason")));
                ˑٴ23.FLD5252 = new CLS1096(ˎʻ0, s, 11);
                יᐧ13.MTH7296(ˑٴ23);
                if(ˎᵢ13.MTH938("ban_timelimited", false)) {
                    CLS1621 ˎᵢ14 = new CLS1621(activity0);
                    ˎᵢ14.MTH800(CLS27.MTH889("ban_max_time_lbl"));
                    StringBuilder stringBuilder20 = new StringBuilder();
                    stringBuilder20.append(s);
                    String s16 = ˎᵢ13.MTH925(CLS182.MTH3475(4100703224392897333L, stringBuilder20), "");
                    if(!TextUtils.isEmpty(s16)) {
                        ˎᵢ14.MTH7268(Long.parseLong(s16, 16));
                    }
                    ˎᵢ14.FLD5242 = new CLS1096(ˎʻ0, s, 12);
                    יᐧ13.MTH7296(ˎᵢ14);
                }
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ13), v);
                return;
            }
            default: {
                ˎʻ0.getClass();
                CLS1623 יᐧ0 = new CLS1623(activity0);
                CLS1635 ﾞᵎ0 = new CLS1635(activity0);
                String s1 = CLS182.MTH3475(4100687625071678261L, CLS182.MTH3487(4100687509107561269L, ﾞᵎ0, s));
                CLS29 ˎᵢ0 = ˎʻ0.FLD2151;
                ﾞᵎ0.MTH7437(ˎᵢ0.MTH938(s1, false));
                CLS34.MTH1083(ˎʻ0, s, 21, ﾞᵎ0);
                CLS1622 ˑٴ0 = CLS182.MTH3486(יᐧ0, ﾞᵎ0, activity0);
                ˑٴ0.MTH800(CLS27.MTH889("chatroom_repeat_lbl"));
                ˑٴ0.MTH7278(2);
                ˑٴ0.MTH7277(String.valueOf(ˎᵢ0.MTH927(5, s + "_chatroom_repeat_max")));
                ˑٴ0.FLD5252 = new CLS1096(ˎʻ0, s, 17);
                CLS1622 ˑٴ1 = CLS34.MTH1069(יᐧ0, ˑٴ0, activity0);
                ˑٴ1.MTH7277(ˎᵢ0.MTH925(CLS182.MTH3475(4100701695384539957L, CLS34.MTH1085(4100701665319768885L, ˑٴ1, s)), CLS27.MTH889("repeat_ban_reason")));
                ˑٴ1.FLD5252 = new CLS1096(ˎʻ0, s, 18);
                יᐧ0.MTH7296(ˑٴ1);
                if(ˎᵢ0.MTH938("ban_timelimited", false)) {
                    CLS1622 ˑٴ2 = new CLS1622(activity0);
                    ˑٴ2.MTH800(CLS27.MTH889("ban_max_time_lbl"));
                    ˑٴ2.MTH7278(0x2000);
                    StringBuilder stringBuilder0 = new StringBuilder();
                    stringBuilder0.append(s);
                    String s2 = ˎᵢ0.MTH925(CLS182.MTH3475(4100701446276436789L, stringBuilder0), "");
                    ˑٴ2.MTH7277((TextUtils.isEmpty(s2) ? "0" : String.valueOf(((double)Long.parseLong(s2, 16)) / 60000.0)));
                    ˑٴ2.FLD5252 = new CLS1096(ˎʻ0, s, 19);
                    יᐧ0.MTH7296(ˑٴ2);
                }
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
            }
        }
    }
}


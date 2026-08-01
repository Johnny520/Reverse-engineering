// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioAttributes.Builder;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS38.CLS37;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS44;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS73;
import b.ˈˈ.CLS91;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1227;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class CLS786 extends CLS140 {
    public final HashMap FLD1119;
    public final CLS73 FLD1120;
    public final HashMap FLD1121;
    public final HashMap FLD1122;
    public final long FLD1123;
    public final CLS73 FLD1124;
    public HandlerThread FLD1125;
    public final HashMap FLD1126;
    public Handler FLD1127;
    public final HashMap FLD1128;
    public final CLS73 FLD1129;
    public final CLS73 FLD1130;
    public final CLS73 FLD1131;

    public CLS786(CLS139 ﹶʼ0) {
        super(ﹶʼ0);
        this.FLD1124 = new CLS73(10);
        this.FLD1131 = new CLS73(20);
        this.FLD1130 = new CLS73(20);
        this.FLD1120 = new CLS73(20);
        this.FLD1121 = new HashMap();
        this.FLD1126 = new HashMap();
        this.FLD1119 = new HashMap();
        this.FLD1129 = new CLS73(20);
        this.FLD1122 = new HashMap();
        this.FLD1128 = new HashMap();
        this.FLD1123 = 86400000L;
    }

    // 此方法包含解密的字符串
    public final void MTH2649(ContentValues contentValues0) {
        int v11;
        int v10;
        Pattern pattern2;
        int v8;
        Pattern pattern0;
        boolean z2;
        CLS29 ˎᵢ1;
        Intent intent0;
        Object[] arr_object;
        String s7;
        CLS485 ᐧﾞ0;
        String s6;
        Bitmap bitmap0;
        long v4;
        int v20;
        String s33;
        String s31;
        double f;
        String s30;
        int v17;
        String s26;
        String s24;
        String s23;
        CLS29 ˎᵢ2;
        int v14;
        if(!contentValues0.containsKey("type")) {
            return;
        }
        int v = CLS182.MTH3474(0x38ECF5162B3CD335L, contentValues0);
        if(v != 10000 && v != 0x19000031 && v != 0x1A000031 && v != 0x1C000031) {
            return;
        }
        String s = contentValues0.containsKey("content") ? contentValues0.getAsString("content") : "";
        if(TextUtils.isEmpty(s)) {
            return;
        }
        int v1 = contentValues0.containsKey("isSend") ? CLS182.MTH3474(0x38ECF5332B3CD335L, contentValues0) : 0;
        String s1 = contentValues0.getAsString("talker");
        String s2 = CLS182.MTH3475(4101923570630578997L, CLS182.MTH3483(s1));
        CLS29 ˎᵢ0 = this.FLD1445;
        String s3 = ˎᵢ0.MTH938(s2, false) ? CLS182.MTH3475(4101923673709794101L, CLS182.MTH3483(s1)) : "";
        boolean z = contentValues0.containsKey("msgId");
        CLS73 ˈˊ0 = this.FLD1130;
        if(z) {
            long v2 = CLS34.MTH1080(0x38ECF5E22B3CD335L, contentValues0);
            if(ˈˊ0.MTH1579(v2)) {
                return;
            }
            ˈˊ0.MTH1578(v2);
        }
        if(contentValues0.containsKey("msgSvrId")) {
            long v3 = CLS34.MTH1080(4101923776789009205L, contentValues0);
            if(ˈˊ0.MTH1579(v3)) {
                return;
            }
            ˈˊ0.MTH1578(v3);
        }
        CLS371 ʻ0 = this.FLD1444;
        switch(v) {
            case 10000: {
                if(!ˎᵢ0.MTH938("grab_red_packet_master_enable", false) || !CLS182.MTH3480(0x38ECFD452B3CD335L, CLS182.MTH3483(s3), ˎᵢ0, false) || !CLS502.MTH6934(s, new String[]{"weixinhongbao"}) && !CLS502.MTH6934(s, new String[]{"sendid"})) {
                    return;
                }
                String s16 = s.substring(s.indexOf("sendid") + 7);
                int v12 = s16.indexOf("&");
                if(v12 == -1) {
                    v12 = s16.indexOf(">");
                }
                if(v12 == -1) {
                    return;
                }
                String s17 = s16.substring(0, v12);
                HashMap hashMap4 = this.FLD1126;
                if(!hashMap4.containsKey(s17)) {
                    return;
                }
                Object object1 = hashMap4.get(s17);
                hashMap4.remove(s17);
                if(((int)((ContentValues)object1).getAsInteger("isSend")) == 1) {
                    return;
                }
                String s18 = ((ContentValues)object1).getAsString("sendusername");
                String s19 = "";
                String s20 = "";
                String s21 = "";
                HashMap hashMap5 = this.FLD1119;
                if(hashMap5.containsKey(s17)) {
                    ContentValues contentValues2 = (ContentValues)hashMap5.get(s17);
                    String s22 = contentValues2.getAsString("receiveId");
                    s20 = contentValues2.getAsString("msg");
                    int v13 = CLS182.MTH3474(0x38ECFD212B3CD335L, contentValues2);
                    s21 = contentValues2.getAsString("wishing");
                    s19 = s22;
                    v14 = v13;
                }
                else {
                    v14 = 0;
                }
                CLS786.MTH2658(v14, CLS370.MTH5289((CLS426.MTH6126(s1) ? 0x38ECFD302B3CD335L : 0x38ECFDCE2B3CD335L)));
                ˎᵢ0.MTH922(((int)(ˎᵢ0.MTH927(0, "money_stat_amount_acc") + v14)), "money_stat_amount_acc");
                if(ˎᵢ0.MTH938("rp_amount_auto_disable", false)) {
                    int v15 = ˎᵢ0.MTH927(0, "rp_max_disable_amount");
                    if(v15 > 0) {
                        int v16 = CLS481.MTH6691("money_stat_rp_chatroom_amount");
                        if(CLS481.MTH6691("money_stat_rp_amount") + v16 >= v15) {
                            ˎᵢ0.MTH922(Boolean.FALSE, "grab_red_packet_master_enable");
                        }
                    }
                }
                CLS21.MTH821().MTH818("red_packet_received", new Object[]{v14, s1, s18, s21});
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append(s3);
                if(CLS182.MTH3480(4101928286504670005L, stringBuilder0, ˎᵢ0, false) && !TextUtils.isEmpty(s19)) {
                    CLS66.MTH1390(s17, ˎᵢ0.MTH925(CLS182.MTH3475(4101928380993950517L, CLS182.MTH3483(s3)), ""), s19);
                }
                if(CLS182.MTH3480(0x38ECFA362B3CD335L, CLS182.MTH3483(s3), ˎᵢ0, false)) {
                    if(TextUtils.isEmpty(s1)) {
                        return;
                    }
                    ˎᵢ2 = ˎᵢ0;
                    s23 = s3;
                    s24 = s1;
                    CLS1227 ʽי0 = new CLS1227(this, s1, s3, ((ContentValues)object1), v14, s18, 3);
                    StringBuilder stringBuilder1 = CLS182.MTH3483(s23);
                    stringBuilder1.append("_REDPACKETS_");
                    CLS40.MTH1120().MTH1123(((CLS39)ʽי0), ((long)CLS404.MTH5913(stringBuilder1.toString())));
                }
                else {
                    ˎᵢ2 = ˎᵢ0;
                    s23 = s3;
                    s24 = s1;
                }
                if(CLS21.MTH821().MTH830("isHidden", new Object[]{s18})) {
                    return;
                }
                if(TextUtils.isEmpty(s20)) {
                    String s25 = s.substring(s.indexOf(">") + 1).trim();
                    s20 = s25.substring(0, s25.indexOf("<")) + s25.substring(s25.indexOf(">") + 1, s25.indexOf("</_wc_custom_link_>"));
                }
                if(!CLS182.MTH3480(0x38ECFAFF2B3CD335L, CLS182.MTH3483(s23), ˎᵢ2, false)) {
                    s26 = s23;
                    v17 = v14;
                }
                else if(CLS34.MTH1064(0x38ECFA9E2B3CD335L, CLS182.MTH3483(s23), ˎᵢ2, 1) == 1) {
                    if(CLS426.MTH6126(s24)) {
                        s20 = ʻ0.MTH5316(s24) + "\n" + s20;
                    }
                    CLS412.MTH6014(((CLS140)this).MTH3042(), s20);
                    StringBuilder stringBuilder2 = new StringBuilder();
                    s26 = s23;
                    stringBuilder2.append(s26);
                    if(CLS182.MTH3480(4101929016649110325L, stringBuilder2, ˎᵢ2, false)) {
                        CLS390.MTH5614(500L);
                    }
                    if(CLS182.MTH3480(0x38ECFB402B3CD335L, CLS182.MTH3483(s26), ˎᵢ2, false)) {
                        this.MTH2654(s26);
                    }
                    v17 = v14;
                }
                else {
                    s26 = s23;
                    Bitmap bitmap1 = CLS372.MTH5411(s24);
                    String s27 = ʻ0.MTH5316(s24);
                    CLS485 ᐧﾞ1 = this.MTH2651();
                    this.MTH2651().getClass();
                    v17 = v14;
                    ᐧﾞ1.MTH6719(CLS485.MTH6731(s24), bitmap1, s27, s20, s26, s24);
                }
                if(v17 != 0 && ˎᵢ2.MTH938("tts_enable", true) && CLS182.MTH3480(0x38ECFB542B3CD335L, CLS182.MTH3483(s26), ˎᵢ2, false)) {
                    int v18 = CLS34.MTH1064(0x38ECFB642B3CD335L, CLS182.MTH3483(s26), ˎᵢ2, 0);
                    if(v18 == 0 || v17 > v18) {
                        CLS40.MTH1120().MTH1123(((CLS39)new CLS852(v17, 1)), 3000L);
                        return;
                    }
                }
                return;
            }
            case 0x19000031: {
                try {
                    HashMap hashMap6 = CLS392.MTH5633(s, "appmsg");
                    String s28 = (String)hashMap6.get(".appmsg.wcpayinfo.transcationid");
                    String s29 = (String)hashMap6.get(".appmsg.wcpayinfo.transferid");
                    int v19 = Integer.parseInt(((String)hashMap6.get(".appmsg.wcpayinfo.invalidtime")));
                    s30 = (String)hashMap6.get(".appmsg.wcpayinfo.feedesc");
                    f = Double.parseDouble(s30.substring(1));
                    s31 = (String)hashMap6.get("appmsg.wcpayinfo.pay_memo");
                    String s32 = hashMap6.containsKey(".appmsg.wcpayinfo.receiver_username") ? ((String)hashMap6.get(".appmsg.wcpayinfo.receiver_username")) : "";
                    s33 = hashMap6.containsKey(".appmsg.wcpayinfo.payer_username") ? ((String)hashMap6.get(".appmsg.wcpayinfo.payer_username")) : "";
                    CLS21.MTH821().MTH818("transfer_money_received", new Object[]{((int)(f * 100.0)), s1, v1, s31});
                    if(!ˎᵢ0.MTH938("confirm_transfer_enable", false)) {
                        return;
                    }
                    CLS73 ˈˊ1 = this.FLD1120;
                    if(v1 != 1) {
                        if(!TextUtils.isEmpty(s32) && !s32.equals(CLS140.MTH3041())) {
                            return;
                        }
                        if(ˎᵢ0.MTH938("confirm_transfer_specific_enable", false)) {
                            if(!CLS502.MTH6934(ˎᵢ0.MTH925("confirm_transfer_specific", ""), new String[]{s1})) {
                                return;
                            }
                        }
                        else if(CLS502.MTH6934(ˎᵢ0.MTH925("confirm_transfer_exclude", ""), new String[]{s1})) {
                            return;
                        }
                        ˈˊ1.MTH1578(s28);
                        if(!ˎᵢ0.MTH938("confirm_transfer_delay_enable", false)) {
                            v20 = 0;
                        }
                        else if(ˎᵢ0.MTH938("confirm_transfer_random_delay_enable", false)) {
                            v20 = CLS412.MTH6015(ˎᵢ0.MTH927(0, "confirm_transfer_rdelay_min"), ˎᵢ0.MTH927(0, "confirm_transfer_rdelay_max"));
                        }
                        else {
                            v20 = ˎᵢ0.MTH927(0, "confirm_transfer_delay");
                        }
                        if(v20 == 0) {
                            CLS66.MTH1363(v19, s28, s29, s1);
                            return;
                        }
                        this.MTH2650().postDelayed(new CLS120(v19, s28, s29, s1), ((long)v20));
                        return;
                    }
                    if(!ˈˊ1.MTH1579(s28)) {
                        return;
                    }
                    CLS786.MTH2658(((int)(f * 100.0)), "money_stat_transfer_amount");
                    ˎᵢ0.MTH922(((int)(ˎᵢ0.MTH927(0, "money_stat_amount_acc") + ((int)(f * 100.0)))), "money_stat_amount_acc");
                }
                catch(Throwable throwable1) {
                    break;
                }
                try {
                    if(!CLS21.MTH821().MTH830("isHidden", new Object[]{s1}) && ˎᵢ0.MTH938("tts_enable", true) && ˎᵢ0.MTH938("confirm_transfer_speak_amount", false)) {
                        int v21 = ˎᵢ0.MTH927(0, "confirm_transfer_not_speak_amount");
                        if(v21 == 0 || ((int)(f * 100.0)) > v21) {
                            CLS40.MTH1120().MTH1123(((CLS39)new CLS852(((int)(f * 100.0)), 0)), 3000L);
                        }
                    }
                    goto label_293;
                }
                catch(Throwable throwable2) {
                    try {
                        CLS27.MTH893(throwable2);
                    label_293:
                        if(ˎᵢ0.MTH938("transfer_money_reply_enable", false)) {
                            CLS40.MTH1120().MTH1123(((CLS39)new CLS737(this, s1, s31, ((int)(f * 100.0)))), ((long)CLS404.MTH5913("_MONEYTRANSFER_")));
                        }
                        if(ˎᵢ0.MTH938("transfer_money_notification_enable", false)) {
                            Bitmap bitmap2 = CLS372.MTH5411(s1);
                            String s34 = ʻ0.MTH5311(s33);
                            if(CLS426.MTH6126(s1)) {
                                s34 = s34 + " (" + ʻ0.MTH5316(s1) + ")";
                            }
                            CLS485 ᐧﾞ2 = this.MTH2651();
                            String s35 = CLS27.MTH889("transfer_money_notification_text");
                            Object[] arr_object1 = {Double.parseDouble(s30.substring(1))};
                            this.MTH2651().getClass();
                            ᐧﾞ2.MTH6719(CLS485.MTH6731(s1), bitmap2, s34, String.format(s35, arr_object1), "transfer_money_", s1);
                            return;
                        }
                        return;
                    }
                    catch(Throwable throwable1) {
                        break;
                    }
                }
            }
            case 0x1A000031: 
            case 0x1C000031: {
                try {
                    v4 = System.currentTimeMillis();
                    if(!ˎᵢ0.MTH938("grab_red_packet_master_enable", false)) {
                        if(!ˎᵢ0.MTH938("red_packet_notification_only", false)) {
                            return;
                        }
                        HashMap hashMap0 = CLS392.MTH5633(s, "appmsg");
                        String s4 = hashMap0.containsKey(".appmsg.wcpayinfo.exclusive_recv_username") ? ((String)hashMap0.get(".appmsg.wcpayinfo.exclusive_recv_username")) : "";
                        if(!TextUtils.isEmpty(s4) && !s4.equals(CLS140.MTH3041())) {
                            return;
                        }
                        String s5 = Uri.parse(((String)hashMap0.get(".appmsg.wcpayinfo.nativeurl"))).getQueryParameter("sendusername");
                        bitmap0 = CLS372.MTH5411(s1);
                        s6 = ʻ0.MTH5316(s1);
                        ᐧﾞ0 = this.MTH2651();
                        s7 = CLS27.MTH889("red_packet_notif_only_text");
                        arr_object = new Object[]{(CLS426.MTH6126(s1) ? CLS66.MTH1452(s1, s5) : ʻ0.MTH5311(s5))};
                        this.MTH2651().getClass();
                        intent0 = CLS485.MTH6731(s1);
                        ˎᵢ1 = ˎᵢ0;
                        goto label_45;
                    }
                    ˎᵢ1 = ˎᵢ0;
                    goto label_54;
                }
                catch(Throwable throwable0) {
                    goto label_52;
                }
                try {
                label_45:
                    ᐧﾞ0.MTH6719(intent0, bitmap0, s6, String.format(s7, arr_object), "red_packet_notif_only_", s1);
                    return;
                }
                catch(Throwable throwable0) {
                    goto label_53;
                }
                try {
                    ˎᵢ1 = ˎᵢ0;
                    goto label_54;
                }
                catch(Throwable throwable0) {
                label_52:
                    ˎᵢ1 = ˎᵢ0;
                }
            label_53:
                CLS27.MTH893(throwable0);
            label_54:
                if(CLS502.MTH6934(ˎᵢ1.MTH925("grab_red_packet_exclude", ""), new String[]{s1})) {
                    return;
                }
                boolean z1 = CLS426.MTH6126(s1);
                if((z1 || !ˎᵢ1.MTH938("grab_red_packet_notprivate_enable", false)) && CLS182.MTH3480(4101920160426545973L, CLS182.MTH3483(s3), ˎᵢ1, false) && !CLS502.MTH6934(s, new String[]{CLS27.MTH882("transfer_url")}) && CLS502.MTH6934(s, new String[]{CLS27.MTH882("rp_url")})) {
                    if(CLS182.MTH3480(0x38ECF3522B3CD335L, CLS182.MTH3483(s3), ˎᵢ1, false) && CLS372.MTH5396(s1)) {
                        return;
                    }
                    if(CLS182.MTH3480(4101921015125037877L, CLS182.MTH3483(s3), ˎᵢ1, false)) {
                        if(v1 == 1) {
                            return;
                        }
                    }
                    else if(!z1 && v1 == 1) {
                        return;
                    }
                    try {
                        HashMap hashMap1 = CLS392.MTH5633(s, "appmsg");
                        Object object0 = hashMap1.get(".appmsg.wcpayinfo.nativeurl");
                        Uri uri0 = Uri.parse(((String)object0));
                        String s8 = uri0.getQueryParameter("sendid");
                        String s9 = uri0.getQueryParameter("sendusername");
                        int v5 = Integer.parseInt(uri0.getQueryParameter("msgtype"));
                        int v6 = Integer.parseInt(uri0.getQueryParameter("channelid"));
                        int v7 = Integer.parseInt(((String)hashMap1.get(".appmsg.wcpayinfo.sceneid")));
                        String s10 = hashMap1.containsKey(".appmsg.wcpayinfo.exclusive_recv_username") ? ((String)hashMap1.get(".appmsg.wcpayinfo.exclusive_recv_username")) : "";
                        String s11 = (String)hashMap1.get(".appmsg.wcpayinfo.sendertitle");
                        if(TextUtils.isEmpty(s10)) {
                            z2 = false;
                        }
                        else {
                            if(!s10.equals(CLS140.MTH3041())) {
                                return;
                            }
                            z2 = true;
                        }
                        if(z2) {
                            v8 = v7;
                        }
                        else {
                            if(z1 && !TextUtils.isEmpty(s9)) {
                                String s12 = ˎᵢ1.MTH925(s3 + "member_excl", "");
                                if(!TextUtils.isEmpty(s12) && CLS502.MTH6934(s12, new String[]{s9})) {
                                    return;
                                }
                                String s13 = ˎᵢ1.MTH925(s3 + "member_incl", "");
                                if(!TextUtils.isEmpty(s13) && !CLS502.MTH6934(s13, new String[]{s9})) {
                                    return;
                                }
                            }
                            if(!ˎᵢ1.MTH938(s3 + "grab_red_packet_filter_notopen_enable", false) || TextUtils.isEmpty(s11)) {
                                v8 = v7;
                            }
                            else {
                                HashMap hashMap2 = this.FLD1122;
                                if(hashMap2.containsKey(s3)) {
                                    pattern0 = (Pattern)hashMap2.get(s3);
                                    v8 = v7;
                                }
                                else {
                                    String s14 = ˎᵢ1.MTH925(s3 + "red_packet_filter_text", "");
                                    if(TextUtils.isEmpty(s14)) {
                                        v8 = v7;
                                        pattern0 = null;
                                    }
                                    else {
                                        if(s14.endsWith("|")) {
                                            v8 = v7;
                                            s14 = s14.substring(0, s14.length() - 1);
                                        }
                                        else {
                                            v8 = v7;
                                        }
                                        Pattern pattern1 = Pattern.compile(s14, 2);
                                        hashMap2.put(s3, pattern1);
                                        pattern0 = pattern1;
                                    }
                                }
                                if(CLS502.MTH6935(pattern0, s11)) {
                                    return;
                                }
                            }
                            if(ˎᵢ1.MTH938(s3 + "grab_red_packet_filter_onlyopen_enable", false) && !TextUtils.isEmpty(s11)) {
                                HashMap hashMap3 = this.FLD1128;
                                if(hashMap3.containsKey(s3)) {
                                    pattern2 = (Pattern)hashMap3.get(s3);
                                }
                                else {
                                    String s15 = ˎᵢ1.MTH925(s3 + "red_packet_filter_onlyopen_text", "");
                                    if(TextUtils.isEmpty(s15)) {
                                        pattern2 = null;
                                    }
                                    else {
                                        if(s15.endsWith("|")) {
                                            s15 = s15.substring(0, s15.length() - 1);
                                        }
                                        Pattern pattern3 = Pattern.compile(s15, 2);
                                        hashMap3.put(s3, pattern3);
                                        pattern2 = pattern3;
                                    }
                                }
                                if(!CLS502.MTH6935(pattern2, s11)) {
                                    return;
                                }
                            }
                            if(this.MTH2659(s3)) {
                                return;
                            }
                        }
                        ContentValues contentValues1 = new ContentValues();
                        contentValues1.put("talker", s1);
                        contentValues1.put("msgType", v5);
                        contentValues1.put("channelId", v6);
                        contentValues1.put("nativeurl", ((String)object0));
                        contentValues1.put("sendusername", s9);
                        contentValues1.put("isSend", v1);
                        contentValues1.put("startTime", v4);
                        contentValues1.put("title", s11);
                        contentValues1.put("sceneId", v8);
                        if(ˎᵢ1.MTH938(s3 + "grab_red_packet_delay_enable", false)) {
                            if(ˎᵢ1.MTH938(s3 + "grab_red_packet_random_delay_enable", false)) {
                                Random random0 = new Random(System.currentTimeMillis());
                                int v9 = ˎᵢ1.MTH927(0, s3 + "grab_red_packet_rdelay_min");
                                v10 = random0.nextInt(ˎᵢ1.MTH927(5000, s3 + "grab_red_packet_rdelay_max") - v9 + 1) + v9;
                            }
                            else {
                                v10 = ˎᵢ1.MTH927(0, s3 + "grab_red_packet_delay");
                            }
                            v11 = v10;
                        }
                        else {
                            v11 = 0;
                        }
                        if(v11 == 0) {
                            this.MTH2653(v5, v6, contentValues1, s1, s8, ((String)object0));
                            return;
                        }
                        this.MTH2650().postDelayed(new CLS109(this, s1, v5, v6, s8, ((String)object0), contentValues1), ((long)v11));
                        return;
                    }
                    catch(Throwable throwable1) {
                        break;
                    }
                }
                return;
            }
            default: {
                return;
            }
        }
        CLS27.MTH893(throwable1);
    }

    // 此方法包含解密的字符串
    public final Handler MTH2650() {
        if(this.FLD1125 == null || !this.FLD1125.isAlive()) {
            HandlerThread handlerThread0 = new HandlerThread(CLS412.MTH5999("wx_rp_thread"));
            this.FLD1125 = handlerThread0;
            CLS412.MTH6000(handlerThread0);
            this.FLD1127 = new Handler(this.FLD1125.getLooper());
        }
        return this.FLD1127;
    }

    public final CLS485 MTH2651() {
        return (CLS485)CLS40.FLD157.MTH1118(CLS485.class);
    }

    @Override  // b.ˑٴ.CLS140
    public final void MTH3039() {
        CLS412.MTH6001(this.FLD1125);
    }

    // 此方法包含解密的字符串
    public final void MTH2653(int v, int v1, ContentValues contentValues0, String s, String s1, String s2) {
        this.FLD1126.put(s1, contentValues0);
        if(!this.MTH2661()) {
            CLS66.MTH1438(v, v1, s1, s2, s, null);
        }
        else if(this.FLD1445.MTH927(0, "rpc_mode") != 0) {
            Intent intent0 = new Intent();
            intent0.putExtra("key_way", !CLS426.MTH6126(s));
            intent0.putExtra("key_native_url", s2);
            intent0.putExtra("sendid", s1);
            intent0.putExtra("key_username", s);
            intent0.putExtra("auto_grab", true);
            intent0.putExtra("scene_id", contentValues0.getAsInteger("sceneId"));
            intent0.setClassName(((CLS140)this).MTH3042(), CLS27.MTH897("LuckyMoneyReceiveUI"));
            ((CLS140)this).MTH3042().startActivity(intent0);
        }
        else if(CLS182.MTH3474(0x38ECFB8F2B3CD335L, contentValues0) == 1005) {
            CLS66.MTH1402(v1, s1, s2);
        }
        else {
            CLS66.MTH1409(v1, s1, s2, s);
        }
        this.MTH2656(s);
    }

    // 此方法包含解密的字符串
    public final void MTH2654(String s) {
        try {
            String s1 = this.FLD1445.MTH925(s + "rp_sound_uri", "");
            Uri uri0 = TextUtils.isEmpty(s1) ? RingtoneManager.getDefaultUri(2) : Uri.parse(s1);
            Ringtone ringtone0 = RingtoneManager.getRingtone(CLS27.MTH900(), uri0);
            if(Build.VERSION.SDK_INT >= 21) {
                ringtone0.setAudioAttributes(new AudioAttributes.Builder().setUsage(5).setContentType(4).build());
            }
            else {
                ringtone0.setStreamType(5);
            }
            ringtone0.play();
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ˑٴ.CLS140
    public final void MTH3040(CLS21 ʾᵢ0) {
        ʾᵢ0.MTH828("a.msgitem", ((CLS35)new CLS633(this, 0)));
        ʾᵢ0.MTH833("onincomingdata", ((CLS37)new CLS863(this, 0)));
        ʾᵢ0.MTH828("b.sqldb.insert", ((CLS35)new CLS633(this, 2)));
        ʾᵢ0.MTH828("a.sqldb.insert", ((CLS35)new CLS633(this, 3)));
        ʾᵢ0.MTH833("b.chatroominfoui.menu.options,b.contactinfoui.menu.options,b.singlechatinfoui.menu.options", ((CLS37)new CLS863(this, 1)));
        ʾᵢ0.MTH828("excludeRpUser", ((CLS35)new CLS633(this, 4)));
        ʾᵢ0.MTH828("includeRpUser", ((CLS35)new CLS633(this, 5)));
        ʾᵢ0.MTH828("rp_update_filter_notopen", ((CLS35)new CLS633(this, 6)));
        ʾᵢ0.MTH828("rp_update_filter_onlyopen", ((CLS35)new CLS633(this, 7)));
        ʾᵢ0.MTH828("remote_auto_rpexcl", ((CLS35)new CLS633(this, 8)));
        ʾᵢ0.MTH828("new_chatroom", ((CLS35)new CLS633(this, 1)));
        CLS633 ʻᐧ0 = new CLS633(this, 9);
        CLS21.FLD76.MTH828("on_RedPacketOpenClass", ((CLS35)ʻᐧ0));
        CLS633 ʻᐧ1 = new CLS633(this, 10);
        CLS21.FLD76.MTH828("on_RedPacketOpenClass2", ((CLS35)ʻᐧ1));
        CLS633 ʻᐧ2 = new CLS633(this, 11);
        CLS21.FLD76.MTH828("on_TransferDetailClass", ((CLS35)ʻᐧ2));
        CLS633 ʻᐧ3 = new CLS633(this, 12);
        CLS21.FLD76.MTH828("on_LuckyMoneyReceiveUI", ((CLS35)ʻᐧ3));
        CLS633 ʻᐧ4 = new CLS633(this, 13);
        CLS21.FLD76.MTH828("on_luckymoneydetailui_oncreate", ((CLS35)ʻᐧ4));
    }

    // 此方法包含解密的字符串
    public final void MTH2656(String s) {
        String s1 = CLS182.MTH3475(0x38ECF56C2B3CD335L, CLS182.MTH3483(s));
        if(this.FLD1445.MTH938(s1, true) && this.FLD1447.FLD1438.MTH6895("remote_rp_cmd")) {
            this.MTH2663(s);
        }
    }

    public final boolean MTH2657(ContentValues contentValues0) {
        if(!this.MTH2661()) {
            return false;
        }
        switch(CLS182.MTH3474(4101930206355051317L, contentValues0)) {
            case 0x1A000031: 
            case 0x1C000031: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static void MTH2658(int v, String s) {
        CLS481.MTH6694(CLS481.MTH6691(s) + v, s);
    }

    // 此方法包含解密的字符串
    public final boolean MTH2659(String s) {
        String s1 = CLS182.MTH3475(0x38ECF87F2B3CD335L, CLS182.MTH3483(s));
        CLS29 ˎᵢ0 = this.FLD1445;
        if(!ˎᵢ0.MTH938(s1, false)) {
            return false;
        }
        String s2 = ˎᵢ0.MTH925(CLS182.MTH3475(0x38ECF8132B3CD335L, CLS182.MTH3483(s)), "");
        return !TextUtils.isEmpty(s2) && CLS481.MTH6697(s2);
    }

    // 此方法包含解密的字符串
    public final CLS91 MTH2660(ArrayList arrayList0, int v, boolean z, boolean z1) {
        CLS91 ᵔʾ0;
        HashMap hashMap0;
        ArrayList arrayList1;
        if(arrayList0 != null) {
            try {
                if(!arrayList0.isEmpty()) {
                    arrayList1 = new ArrayList();
                    hashMap0 = new HashMap();
                    Iterator iterator0 = arrayList0.iterator();
                    while(true) {
                    label_5:
                        int v1 = 0;
                        if(!iterator0.hasNext()) {
                            if(!z1) {
                                CLS44 ˆٴ0 = this.MTH2662();
                                ArrayList arrayList2 = (ArrayList)hashMap0.get(0);
                                ˆٴ0.getClass();
                                return CLS44.MTH1179(arrayList2);
                            }
                            if(hashMap0.containsKey(v)) {
                                CLS44 ˆٴ1 = this.MTH2662();
                                ArrayList arrayList3 = (ArrayList)hashMap0.get(v);
                                ˆٴ1.getClass();
                                return CLS44.MTH1179(arrayList3);
                            }
                            if(arrayList1.size() == 1 && v >= ((int)(((Integer)arrayList1.get(0))))) {
                                CLS44 ˆٴ2 = this.MTH2662();
                                ArrayList arrayList4 = (ArrayList)hashMap0.get(arrayList1.get(0));
                                ˆٴ2.getClass();
                                return CLS44.MTH1179(arrayList4);
                            }
                            Collections.sort(arrayList1);
                            int v2 = 0;
                            while(v1 < arrayList1.size()) {
                                int v3 = (int)(((Integer)arrayList1.get(v1)));
                                if(v >= v3) {
                                    ++v1;
                                    v2 = v3;
                                    continue;
                                }
                                if(v < v2) {
                                    break;
                                }
                                CLS44 ˆٴ3 = this.MTH2662();
                                ArrayList arrayList5 = (ArrayList)hashMap0.get(v2);
                                ˆٴ3.getClass();
                                return CLS44.MTH1179(arrayList5);
                            }
                            int v4 = (int)(((Integer)arrayList1.get(arrayList1.size() - 1)));
                            if(v < v4) {
                                break;
                            }
                            CLS44 ˆٴ4 = this.MTH2662();
                            ArrayList arrayList6 = (ArrayList)hashMap0.get(v4);
                            ˆٴ4.getClass();
                            return CLS44.MTH1179(arrayList6);
                        }
                        Object object0 = iterator0.next();
                        ᵔʾ0 = (CLS91)object0;
                        goto label_47;
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return null;
            try {
            label_47:
                JSONObject jSONObject0 = ᵔʾ0.MTH1738();
                boolean z2 = !z1 || jSONObject0 == null || !jSONObject0.has("chatroom") || jSONObject0.getBoolean("chatroom");
                boolean z3 = !z1 || jSONObject0 == null || !jSONObject0.has("private") || jSONObject0.getBoolean("private");
                int v5 = !z1 || jSONObject0 == null || !jSONObject0.has("amount") ? 0 : jSONObject0.getInt("amount");
                String s = ᵔʾ0.MTH1735();
                if(!z) {
                    if(z3 && (z1 || !CLS502.MTH6934(s, new String[]{"#chatroom"}))) {
                        goto label_56;
                    }
                    goto label_5;
                }
                else if(!z2 || CLS502.MTH6934(s, new String[]{"#chatroom"})) {
                    goto label_5;
                }
            label_56:
                arrayList1.add(v5);
                if(hashMap0.containsKey(v5)) {
                    ((ArrayList)hashMap0.get(v5)).add(ᵔʾ0);
                    goto label_5;
                }
                ArrayList arrayList7 = new ArrayList();
                arrayList7.add(ᵔʾ0);
                hashMap0.put(v5, arrayList7);
            }
            catch(Throwable unused_ex) {
            }
            goto label_5;
        }
        return null;
    }

    // 此方法包含解密的字符串
    public final boolean MTH2661() {
        CLS29 ˎᵢ0 = this.FLD1445;
        boolean z = ˎᵢ0.MTH938("red_packet_comp", false);
        if(!z && CLS182.MTH3474(0x38ECFBDF2B3CD335L, this.FLD1447.FLD1407.FLD3943) >= 1000) {
            ˎᵢ0.MTH922(Boolean.TRUE, "red_packet_comp");
            ˎᵢ0.MTH922(0, "rpc_mode");
            return true;
        }
        return z;
    }

    public final CLS44 MTH2662() {
        return (CLS44)CLS40.FLD157.MTH1118(CLS44.class);
    }

    // 此方法包含解密的字符串
    public final void MTH2663(String s) {
        try {
            CLS29 ˎᵢ0 = this.FLD1445;
            String s1 = ˎᵢ0.MTH925("grab_red_packet_exclude", "");
            if(CLS502.MTH6934(s1, new String[]{s})) {
                return;
            }
            HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(s1)));
            hashSet0.add(s);
            ˎᵢ0.MTH922(TextUtils.join(",", hashSet0), "grab_red_packet_exclude");
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}


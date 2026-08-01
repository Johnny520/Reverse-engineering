// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Button;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS73;
import b.ˊﾞ.CLS613;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS502;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Random;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS633 implements CLS35 {
    public final int FLD567;
    public final CLS786 FLD568;

    public CLS633(CLS786 ᐧᵢ0, int v) {
        this.FLD567 = v;
        this.FLD568 = ᐧᵢ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        Object object1;
        int v9;
        Pattern pattern3;
        Pattern pattern1;
        boolean z1;
        CLS786 ᐧᵢ0 = this.FLD568;
        switch(this.FLD567) {
            case 0: {
                if(!ᐧᵢ0.FLD1447.FLD1410) {
                    CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                    int v = CLS166.MTH3181(ᵔʾ0.MTH3205(), "field_type");
                    long v1 = CLS166.MTH3185(ᵔʾ0.MTH3205(), "field_msgId");
                    long v2 = CLS166.MTH3185(ᵔʾ0.MTH3205(), "field_msgSvrId");
                    int v3 = CLS166.MTH3181(ᵔʾ0.MTH3205(), "field_isSend");
                    String s1 = (String)CLS166.MTH3194(ᵔʾ0.MTH3205(), "field_talker");
                    boolean z = CLS426.MTH6126(s1);
                    CLS29 ˎᵢ0 = ᐧᵢ0.FLD1445;
                    if(z || !ˎᵢ0.MTH938("grab_red_packet_notprivate_enable", false)) {
                        CLS73 ˈˊ1 = ᐧᵢ0.FLD1130;
                        switch(v) {
                            case 0x19000031: {
                                if(v3 != 1 && ˎᵢ0.MTH938("confirm_transfer_enable", false) && !ˈˊ1.MTH1579(v1) && !ˈˊ1.MTH1579(v2)) {
                                    ˈˊ1.MTH1578(v1);
                                    ˈˊ1.MTH1578(v2);
                                    String s2 = (String)CLS166.MTH3194(ᵔʾ0.MTH3205(), "field_content");
                                    try {
                                        HashMap hashMap0 = CLS392.MTH5633(s2, "appmsg");
                                        String s3 = (String)hashMap0.get(".appmsg.wcpayinfo.transcationid");
                                        String s4 = (String)hashMap0.get(".appmsg.wcpayinfo.transferid");
                                        int v4 = Integer.parseInt(((String)hashMap0.get(".appmsg.wcpayinfo.invalidtime")));
                                        String s5 = hashMap0.containsKey(".appmsg.wcpayinfo.receiver_username") ? ((String)hashMap0.get(".appmsg.wcpayinfo.receiver_username")) : "";
                                        if(((long)v4) * 1000L >= System.currentTimeMillis() && (TextUtils.isEmpty(s5) || s5.equals(CLS27.MTH904()))) {
                                            if(ˎᵢ0.MTH938("confirm_transfer_specific_enable", false)) {
                                                if(CLS502.MTH6934(ˎᵢ0.MTH925("confirm_transfer_specific", ""), new String[]{s1})) {
                                                    goto label_43;
                                                }
                                                return;
                                            }
                                            else if(!CLS502.MTH6934(ˎᵢ0.MTH925("confirm_transfer_exclude", ""), new String[]{s1})) {
                                            label_43:
                                                if(!ᐧᵢ0.FLD1120.MTH1579(s3)) {
                                                    ContentValues contentValues0 = new ContentValues();
                                                    contentValues0.put("transactionid", s3);
                                                    contentValues0.put("transferid", s4);
                                                    contentValues0.put("invalidtime", v4);
                                                    contentValues0.put("talker", s1);
                                                    ᐧᵢ0.FLD1121.put(s3, contentValues0);
                                                    CLS66.MTH1375(v4, s3, s4);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    catch(Throwable throwable0) {
                                        CLS27.MTH893(throwable0);
                                        break;
                                    }
                                }
                                break;
                            }
                            case 0x1A000031: 
                            case 0x1C000031: {
                                if(ˎᵢ0.MTH938("grab_red_packet_master_enable", false) && !CLS481.MTH6688(CLS166.MTH3185(ᵔʾ0.MTH3205(), "field_createTime"), ᐧᵢ0.FLD1123)) {
                                    String s6 = (String)CLS166.MTH3194(ᵔʾ0.MTH3205(), "field_content");
                                    if(!TextUtils.isEmpty(s6) && !CLS502.MTH6934(s6, new String[]{CLS27.MTH882("transfer_url")}) && CLS502.MTH6934(s6, new String[]{CLS27.MTH882("rp_url")})) {
                                        String s7 = CLS182.MTH3480(4101380764073775925L, CLS182.MTH3483(s1), ˎᵢ0, false) ? CLS182.MTH3475(4101380867152991029L, CLS182.MTH3483(s1)) : "";
                                        if(CLS182.MTH3480(4101380880037892917L, CLS182.MTH3483(s7), ˎᵢ0, false) && !ˈˊ1.MTH1579(v1) && !ˈˊ1.MTH1579(v2)) {
                                            ˈˊ1.MTH1578(v1);
                                            ˈˊ1.MTH1578(v2);
                                            if((!ˎᵢ0.MTH938("red_packet_comp", false) || ˎᵢ0.MTH927(0, "rpc_mode") == 0) && (!CLS182.MTH3480(0x38EB08DE2B3CD335L, CLS182.MTH3483(s7), ˎᵢ0, false) || !CLS372.MTH5396(s1))) {
                                                if(CLS182.MTH3480(0x38EB08FA2B3CD335L, CLS182.MTH3483(s7), ˎᵢ0, false)) {
                                                    if(v3 != 1) {
                                                        goto label_64;
                                                    }
                                                    return;
                                                }
                                                else if(z || v3 != 1) {
                                                label_64:
                                                    if(!CLS502.MTH6934(ˎᵢ0.MTH925("grab_red_packet_exclude", ""), new String[]{s1})) {
                                                        try {
                                                            HashMap hashMap1 = CLS392.MTH5633(s6, "appmsg");
                                                            Uri uri0 = Uri.parse(((String)hashMap1.get(".appmsg.url")));
                                                            String s8 = uri0.getQueryParameter("sendid");
                                                            int v5 = Integer.parseInt(uri0.getQueryParameter("msgtype"));
                                                            int v6 = Integer.parseInt(uri0.getQueryParameter("channelid"));
                                                            String s9 = (String)hashMap1.get(".appmsg.wcpayinfo.nativeurl");
                                                            String s10 = uri0.getQueryParameter("sendusername");
                                                            int v7 = Integer.parseInt(((String)hashMap1.get(".appmsg.wcpayinfo.sceneid")));
                                                            String s11 = hashMap1.containsKey(".appmsg.wcpayinfo.exclusive_recv_username") ? ((String)hashMap1.get(".appmsg.wcpayinfo.exclusive_recv_username")) : "";
                                                            if(TextUtils.isEmpty(s11)) {
                                                                z1 = false;
                                                                goto label_79;
                                                            }
                                                            else if(s11.equals(CLS27.MTH904())) {
                                                                z1 = true;
                                                            label_79:
                                                                if(z1) {
                                                                    goto label_120;
                                                                }
                                                                if(!z || TextUtils.isEmpty(s10)) {
                                                                label_85:
                                                                    if(ˎᵢ0.MTH938(s7 + "grab_red_packet_filter_notopen_enable", false)) {
                                                                        String s14 = (String)hashMap1.get(".appmsg.wcpayinfo.sendertitle");
                                                                        if(TextUtils.isEmpty(s14)) {
                                                                            goto label_102;
                                                                        }
                                                                        else {
                                                                            HashMap hashMap2 = ᐧᵢ0.FLD1122;
                                                                            if(hashMap2.containsKey(s7)) {
                                                                                pattern1 = (Pattern)hashMap2.get(s7);
                                                                            }
                                                                            else {
                                                                                String s15 = ˎᵢ0.MTH925(s7 + "red_packet_filter_text", "");
                                                                                if(TextUtils.isEmpty(s15)) {
                                                                                    pattern1 = null;
                                                                                }
                                                                                else {
                                                                                    if(s15.endsWith("|")) {
                                                                                        s15 = s15.substring(0, s15.length() - 1);
                                                                                    }
                                                                                    Pattern pattern0 = Pattern.compile(s15, 2);
                                                                                    hashMap2.put(s7, pattern0);
                                                                                    pattern1 = pattern0;
                                                                                }
                                                                            }
                                                                            if(!CLS502.MTH6935(pattern1, s14)) {
                                                                                goto label_102;
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                    label_102:
                                                                        if(ˎᵢ0.MTH938(s7 + "grab_red_packet_filter_onlyopen_enable", false)) {
                                                                            String s16 = (String)hashMap1.get(".appmsg.wcpayinfo.sendertitle");
                                                                            if(TextUtils.isEmpty(s16)) {
                                                                                goto label_119;
                                                                            }
                                                                            else {
                                                                                HashMap hashMap3 = ᐧᵢ0.FLD1128;
                                                                                if(hashMap3.containsKey(s7)) {
                                                                                    pattern3 = (Pattern)hashMap3.get(s7);
                                                                                }
                                                                                else {
                                                                                    String s17 = ˎᵢ0.MTH925(s7 + "red_packet_filter_onlyopen_text", "");
                                                                                    if(TextUtils.isEmpty(s17)) {
                                                                                        pattern3 = null;
                                                                                    }
                                                                                    else {
                                                                                        if(s17.endsWith("|")) {
                                                                                            s17 = s17.substring(0, s17.length() - 1);
                                                                                        }
                                                                                        Pattern pattern2 = Pattern.compile(s17, 2);
                                                                                        hashMap3.put(s7, pattern2);
                                                                                        pattern3 = pattern2;
                                                                                    }
                                                                                }
                                                                                if(CLS502.MTH6935(pattern3, s16)) {
                                                                                    goto label_119;
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                        label_119:
                                                                            if(!ᐧᵢ0.MTH2659(s7)) {
                                                                            label_120:
                                                                                ContentValues contentValues1 = new ContentValues();
                                                                                contentValues1.put("talker", s1);
                                                                                contentValues1.put("msgType", v5);
                                                                                contentValues1.put("channelId", v6);
                                                                                contentValues1.put("nativeurl", s9);
                                                                                contentValues1.put("isSend", v3);
                                                                                contentValues1.put("startTime", System.currentTimeMillis());
                                                                                contentValues1.put("sceneId", v7);
                                                                                if(!ˎᵢ0.MTH938(s7 + "grab_red_packet_delay_enable", false)) {
                                                                                    v9 = 0;
                                                                                }
                                                                                else if(ˎᵢ0.MTH938(s7 + "grab_red_packet_random_delay_enable", false)) {
                                                                                    Random random0 = new Random(System.currentTimeMillis());
                                                                                    int v8 = ˎᵢ0.MTH927(0, s7 + "grab_red_packet_rdelay_min");
                                                                                    v9 = random0.nextInt(ˎᵢ0.MTH927(5000, s7 + "grab_red_packet_rdelay_max") - v8 + 1) + v8;
                                                                                }
                                                                                else {
                                                                                    v9 = ˎᵢ0.MTH927(0, s7 + "grab_red_packet_delay");
                                                                                }
                                                                                ᐧᵢ0.FLD1131.MTH1578(s8);
                                                                                ᐧᵢ0.MTH2650().postDelayed(new CLS109(ᐧᵢ0, s8, contentValues1, v7, v6, s9, s1), ((long)v9));
                                                                                return;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    String s12 = ˎᵢ0.MTH925(s7 + "member_excl", "");
                                                                    if(TextUtils.isEmpty(s12) || !s12.contains(s10)) {
                                                                        String s13 = ˎᵢ0.MTH925(s7 + "member_incl", "");
                                                                        if(TextUtils.isEmpty(s13) || s13.contains(s10)) {
                                                                            goto label_85;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        catch(Throwable throwable0) {
                                                            CLS27.MTH893(throwable0);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                            default: {
                                return;
                            }
                        }
                    }
                }
                return;
            }
            case 1: {
                ᐧᵢ0.getClass();
                String s18 = (String)arr_object[0];
                ᐧᵢ0.MTH2656(s18);
                if(ᐧᵢ0.FLD1445.MTH938("auto_exclude_new_chatroom", false)) {
                    ᐧᵢ0.MTH2663(s18);
                }
                return;
            }
            case 2: {
                if(!ᐧᵢ0.FLD1447.FLD1410 && "message".equalsIgnoreCase(((String)arr_object[2]))) {
                    ContentValues contentValues2 = (ContentValues)arr_object[3];
                    if(!ᐧᵢ0.MTH2657(contentValues2)) {
                        ᐧᵢ0.MTH2649(contentValues2);
                    }
                }
                return;
            }
            case 3: {
                if(!ᐧᵢ0.FLD1447.FLD1410) {
                    Object object2 = arr_object[0];
                    if("message".equalsIgnoreCase(((String)arr_object[2]))) {
                        ContentValues contentValues3 = (ContentValues)arr_object[3];
                        if(ᐧᵢ0.MTH2657(contentValues3)) {
                            ᐧᵢ0.MTH2649(contentValues3);
                        }
                    }
                }
                return;
            }
            case 4: {
                ᐧᵢ0.getClass();
                CLS652 ʾʼ0 = new CLS652(ᐧᵢ0, arr_object, 1);
                CLS40.FLD157.MTH1124(((CLS39)ʾʼ0));
                return;
            }
            case 5: {
                ᐧᵢ0.getClass();
                CLS652 ʾʼ1 = new CLS652(ᐧᵢ0, arr_object, 2);
                CLS40.FLD157.MTH1124(((CLS39)ʾʼ1));
                return;
            }
            case 6: {
                HashMap hashMap4 = ᐧᵢ0.FLD1122;
                if(!hashMap4.isEmpty()) {
                    hashMap4.clear();
                }
                return;
            }
            case 7: {
                HashMap hashMap5 = ᐧᵢ0.FLD1128;
                if(!hashMap5.isEmpty()) {
                    hashMap5.clear();
                }
                return;
            }
            case 8: {
                ᐧᵢ0.getClass();
                CLS652 ʾʼ2 = new CLS652(ᐧᵢ0, arr_object, 0);
                CLS40.FLD157.MTH1124(((CLS39)ʾʼ2));
                return;
            }
            case 9: {
                this.MTH2072(arr_object);
                return;
            }
            case 10: {
                this.MTH2071(arr_object);
                return;
            }
            case 11: {
                ᐧᵢ0.getClass();
                try {
                    if(ᐧᵢ0.FLD1445.MTH938("confirm_transfer_enable", false)) {
                        CLS167 ᵔʾ1 = new CLS167(arr_object[0]);
                        String s19 = (String)CLS166.MTH3182(ᵔʾ1.MTH3205(), "wx");
                        if(!TextUtils.isEmpty(s19)) {
                            CLS166.MTH3193(ᵔʾ1.MTH3205(), "wx");
                            if(((int)(((Integer)ᵔʾ1.MTH3204()[0]))) == 0 && ((JSONObject)ᵔʾ1.MTH3204()[2]).getInt("trans_status") == 2000) {
                                HashMap hashMap6 = ᐧᵢ0.FLD1121;
                                if(hashMap6.containsKey(s19)) {
                                    ContentValues contentValues4 = (ContentValues)hashMap6.get(s19);
                                    hashMap6.remove(s19);
                                    String s20 = contentValues4.getAsString("transferid");
                                    String s21 = contentValues4.getAsString("talker");
                                    CLS66.MTH1363(((int)contentValues4.getAsInteger("invalidtime")), s19, s20, s21);
                                    return;
                                }
                            }
                        }
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 12: {
                this.MTH2073(arr_object);
                return;
            }
            default: {
                ᐧᵢ0.getClass();
                if(ᐧᵢ0.FLD1445.MTH938("grab_red_packet_master_enable", false)) {
                    Object object0 = arr_object[0];
                    try {
                        Field field0 = object0.getClass().getDeclaredField("thisObject");
                        object1 = null;
                        if(field0 != null) {
                            field0.setAccessible(true);
                            object1 = field0.get(object0);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    String s = ((Activity)object1).getIntent().getStringExtra("key_sendid");
                    CLS73 ˈˊ0 = ᐧᵢ0.FLD1124;
                    if(ˈˊ0.MTH1579(s)) {
                        ˈˊ0.FLD242.remove(s);
                        ((Activity)object1).finish();
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2071(Object[] arr_object) {
        CLS657 ʾᵔ0;
        CLS40 ﾞᵎ0;
        try {
            CLS786 ᐧᵢ0 = this.FLD568;
            CLS73 ˈˊ0 = ᐧᵢ0.FLD1131;
            CLS29 ˎᵢ0 = ᐧᵢ0.FLD1445;
            if(ˎᵢ0.MTH938("grab_red_packet_master_enable", false)) {
                CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                if(((int)(((Integer)ᵔʾ0.MTH3204()[0]))) == 0) {
                    Object object0 = ᵔʾ0.MTH3204().length == 3 ? ᵔʾ0.MTH3204()[2] : ᵔʾ0.MTH3204()[1];
                    String s = ((JSONObject)object0).getString("sendId");
                    HashMap hashMap0 = ᐧᵢ0.FLD1126;
                    if(hashMap0.containsKey(s)) {
                        ContentValues contentValues0 = (ContentValues)hashMap0.get(s);
                        String s1 = contentValues0.getAsString("talker");
                        String s2 = ˎᵢ0.MTH938(s1 + "_grab_red_packet_enable", false) ? s1 + "_" : "";
                        if(ˎᵢ0.MTH938(s2 + "grab_red_packet_enable", false)) {
                            boolean z = ˈˊ0.MTH1579(s);
                            if(z || ˎᵢ0.MTH938("red_packet_comp", false) && ˎᵢ0.MTH927(0, "rpc_mode") == 0) {
                                ˈˊ0.FLD242.remove(s);
                                int v = ((JSONObject)object0).getInt("hbStatus");
                                if(((JSONObject)object0).getInt("receiveStatus") == 0) {
                                    String s3 = contentValues0.getAsString("sendusername");
                                    if(v != 4) {
                                        String s4 = ((JSONObject)object0).optString("timingIdentifier");
                                        ((JSONObject)object0).getInt("hbType");
                                        JSONObject jSONObject0 = ((JSONObject)object0).optJSONObject("agree_duty");
                                        int v1 = jSONObject0 == null ? 1 : jSONObject0.getInt("agreed_flag");
                                        int v2 = (int)contentValues0.getAsInteger("msgType");
                                        int v3 = (int)contentValues0.getAsInteger("channelId");
                                        String s5 = contentValues0.getAsString("nativeurl");
                                        int v4 = (int)contentValues0.getAsInteger("sceneId");
                                        if(z) {
                                            if(ˎᵢ0.MTH938("red_packet_comp", false) && ˎᵢ0.MTH927(0, "rpc_mode") == 1) {
                                                ﾞᵎ0 = CLS40.FLD157;
                                                ʾᵔ0 = new CLS657(ᐧᵢ0, s1, s5, s, v4, 0);
                                                ﾞᵎ0.MTH1116(((CLS39)ʾᵔ0));
                                                return;
                                            }
                                            if(v1 != 1) {
                                                ﾞᵎ0 = CLS40.FLD157;
                                                ʾᵔ0 = new CLS657(ᐧᵢ0, s1, s5, s, v4, 1);
                                                ﾞᵎ0.MTH1116(((CLS39)ʾᵔ0));
                                                return;
                                            }
                                            if(v4 != 1005) {
                                                CLS66.MTH1438(v2, v3, s, s5, s1, s4);
                                                return;
                                            }
                                        }
                                        else {
                                            if(v1 != 1) {
                                                ﾞᵎ0 = CLS40.FLD157;
                                                ʾᵔ0 = new CLS657(ᐧᵢ0, s1, s5, s, v4, 2);
                                                ﾞᵎ0.MTH1116(((CLS39)ʾᵔ0));
                                                return;
                                            }
                                            if(v4 != 1005) {
                                                CLS66.MTH1438(v2, v3, s, s5, s1, s4);
                                                return;
                                            }
                                        }
                                        Object object1 = null;
                                        if(CLS27.MTH890("RedPacketOpenUnionClass")) {
                                            Class class0 = CLS27.MTH894("RedPacketOpenUnionClass");
                                            if(class0 != null) {
                                                object1 = CLS166.MTH3188(class0, new Object[]{v2, v3, s, s5, null, null, s1, "v1.0", s4});
                                            }
                                        }
                                        else if(CLS27.MTH890("RedPacketOpenUnionClass_b")) {
                                            Class class1 = CLS27.MTH894("RedPacketOpenUnionClass_b");
                                            if(class1 != null) {
                                                object1 = CLS166.MTH3188(class1, new Object[]{v2, v3, s, s5, null, null, s1, s4});
                                            }
                                        }
                                        if(object1 != null) {
                                            CLS66.MTH1521(object1);
                                        }
                                    }
                                    else if(!TextUtils.isEmpty(s3) && ˎᵢ0.MTH938(s2 + "rp_missed_toast_enable", true)) {
                                        String s6 = ˎᵢ0.MTH925(s2 + "rp_missed_text", "");
                                        if(TextUtils.isEmpty(s6)) {
                                            s6 = String.format(CLS27.MTH889("rp_missed"), ((int)(new Random(System.currentTimeMillis()).nextInt(10) + 1)));
                                        }
                                        CLS412.MTH6014(((CLS140)ᐧᵢ0).MTH3042(), s6 + "\n(" + (CLS426.MTH6126(s1) ? CLS66.MTH1452(s1, s3) : ᐧᵢ0.FLD1444.MTH5311(s3)) + (CLS426.MTH6126(s1) ? ", " + ᐧᵢ0.FLD1444.MTH5316(s1) : "") + ")");
                                        hashMap0.remove(s);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 去混淆评级： 低(21)
    // 此方法包含解密的字符串
    private final void MTH2072(Object[] arr_object) {
        CLS786 ᐧᵢ0 = this.FLD568;
        CLS371 ʻ0 = ᐧᵢ0.FLD1444;
        CLS29 ˎᵢ0 = ᐧᵢ0.FLD1445;
        if(ˎᵢ0.MTH938("grab_red_packet_master_enable", false)) {
            CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
            if(ᵔʾ0.MTH3204().length >= 2 && ((int)(((Integer)ᵔʾ0.MTH3204()[0]))) == 0) {
                Object[] arr_object1 = ᵔʾ0.MTH3204();
                if(arr_object1[ᵔʾ0.MTH3204().length - 1] instanceof JSONObject) {
                    try {
                        Object[] arr_object2 = ᵔʾ0.MTH3204();
                        JSONObject jSONObject0 = (JSONObject)arr_object2[ᵔʾ0.MTH3204().length - 1];
                        String s = jSONObject0.getString("sendId");
                        String s1 = jSONObject0.getString("receiveId");
                        HashMap hashMap0 = ᐧᵢ0.FLD1126;
                        if(hashMap0.containsKey(s) && jSONObject0.getInt("isSender") != 1) {
                            HashMap hashMap1 = ᐧᵢ0.FLD1119;
                            if(!hashMap1.containsKey(s)) {
                                ContentValues contentValues0 = (ContentValues)hashMap0.get(s);
                                String s2 = contentValues0.getAsString("talker");
                                if(ˎᵢ0.MTH938((ˎᵢ0.MTH938(s2 + "_grab_red_packet_enable", false) ? s2 + "_" : "") + "grab_red_packet_enable", false)) {
                                    JSONArray jSONArray0 = jSONObject0.getJSONArray("record");
                                    String s3 = ʻ0.MTH5304(CLS27.MTH904());
                                    for(int v = 0; v < jSONArray0.length(); ++v) {
                                        JSONObject jSONObject1 = jSONArray0.getJSONObject(v);
                                        if(jSONObject1.getString("receiveId").equals(s1) || jSONObject1.has("receiveName") && jSONObject1.getString("receiveName").equals(s3)) {
                                            int v1 = jSONObject1.getInt("receiveAmount");
                                            String s4 = "";
                                            if(jSONObject0.has("sendNick")) {
                                                s4 = CLS613.MTH1971(jSONObject0.getString("sendNick"));
                                            }
                                            else if(jSONObject0.has("sendUserName")) {
                                                String s5 = jSONObject0.getString("sendUserName");
                                                s4 = CLS426.MTH6126(s2) ? CLS66.MTH1452(s2, s5) : ʻ0.MTH5311(s5);
                                            }
                                            String s6 = CLS27.MTH882("ccur") + ((double)v1) / 100.0 + " " + (jSONObject1.has("gameTips") ? jSONObject1.getString("gameTips") + "\n" : "");
                                            if(contentValues0.containsKey("startTime")) {
                                                long v2 = (long)contentValues0.getAsLong("startTime");
                                                s6 = s6 + String.format(CLS27.MTH889("rp_elapsedtime"), ((long)(System.currentTimeMillis() - v2))) + "\n";
                                            }
                                            ContentValues contentValues1 = new ContentValues();
                                            contentValues1.put("receiveId", s1);
                                            contentValues1.put("msg", s6 + (jSONObject0.has("wishing") ? jSONObject0.getString("wishing") + "\n" : "") + (TextUtils.isEmpty(s4) ? "" : s4 + " ") + (jSONObject0.has("changeWording") ? jSONObject0.getString("changeWording") : ""));
                                            contentValues1.put("amount", v1);
                                            contentValues1.put("wishing", jSONObject0.optString("wishing"));
                                            hashMap1.put(s, contentValues1);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2073(Object[] arr_object) {
        try {
            CLS786 ᐧᵢ0 = this.FLD568;
            CLS73 ˈˊ0 = ᐧᵢ0.FLD1129;
            CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
            Activity activity0 = (Activity)ᵔʾ0.MTH3205();
            boolean z = activity0.getIntent().hasExtra("auto_grab");
            if(ᐧᵢ0.FLD1445.MTH938("click_red_packet_enable", false) || z) {
                String s = activity0.getIntent().getStringExtra("sendid");
                if(TextUtils.isEmpty(s)) {
                    s = activity0.getIntent().getStringExtra("key_native_url");
                }
                CLS73 ˈˊ1 = ᐧᵢ0.FLD1124;
                if(z) {
                    if(!ˈˊ1.MTH1579(s)) {
                        ˈˊ1.MTH1578(s);
                    }
                    if(!CLS502.MTH6943(ᵔʾ0.MTH3204()[3].getClass().getName(), new String[]{CLS27.MTH897("RedPacketOpenClass"), CLS27.MTH897("RedPacketOpenClass_b"), CLS27.MTH897("RedPacketOpenClass_c"), CLS27.MTH897("RedPacketOpenClass_d")})) {
                        goto label_14;
                    }
                }
                else {
                label_14:
                    Button button0 = (Button)CLS166.MTH3202(ᵔʾ0.MTH3205().getClass()).get(ᵔʾ0.MTH3205());
                    if(button0.isShown() && button0.isClickable()) {
                        if(!ˈˊ0.MTH1579(s)) {
                            button0.performClick();
                            ˈˊ0.MTH1578(s);
                        }
                        if(z) {
                            activity0.finish();
                        }
                    }
                    else if(z) {
                        ˈˊ1.FLD242.remove(s);
                        activity0.finish();
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}


// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS44;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS73;
import b.ˈˈ.CLS77;
import b.ˈˈ.CLS91;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS210;
import b.ᵔʾ.CLS1229;
import b.ᵔʾ.CLS304.CLS303;
import b.ᵔʾ.CLS304;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS674 implements CLS35 {
    public final int FLD717;
    public final CLS772 FLD718;

    public CLS674(CLS772 ٴـ0, int v) {
        this.FLD717 = v;
        this.FLD718 = ٴـ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        int v11;
        String s20;
        String s12;
        int v5;
        Iterator iterator2;
        CLS772 ٴـ0 = this.FLD718;
        switch(this.FLD717) {
            case 0: {
                ٴـ0.MTH3043();
                CLS1229 ˆٴ1 = new CLS1229(17, ٴـ0);
                CLS40.FLD157.MTH1124(((CLS39)ˆٴ1));
                CLS404.FLD3914.clear();
                return;
            }
            case 1: {
                ٴـ0.getClass();
                CLS29 ˎᵢ0 = ٴـ0.FLD1445;
                if(ˎᵢ0.MTH938("autoreply_master_enable", false)) {
                    String s = (String)arr_object[0];
                    String s1 = (String)arr_object[1];
                    String s2 = CLS182.MTH3480(0x38EC0B632B3CD335L, CLS182.MTH3483(s), ˎᵢ0, false) ? CLS182.MTH3475(0x38EC0B752B3CD335L, CLS182.MTH3483(s)) : "";
                    if(CLS182.MTH3480(4101665971377066805L, CLS182.MTH3483(s2), ˎᵢ0, false)) {
                        ٴـ0.FLD1074.MTH1600(10002, 0, "", s, s2, s1, null);
                    }
                }
                return;
            }
            case 2: {
                ٴـ0.getClass();
                CLS1229 ˆٴ2 = new CLS1229(17, ٴـ0);
                CLS40.FLD157.MTH1124(((CLS39)ˆٴ2));
                return;
            }
            case 3: {
                ٴـ0.getClass();
                if(ٴـ0.FLD1445.MTH938("autoreply_master_enable", false) && ٴـ0.FLD1445.MTH938("autoreply_auto_enable", false)) {
                    CLS77 ˊˏ0 = ٴـ0.FLD1074;
                    if(ˊˏ0 != null && !ˊˏ0.MTH1590()) {
                        ˊˏ0.MTH1596();
                    }
                }
                return;
            }
            case 4: {
                CLS210 ˋʼ0 = new CLS210(((CLS140)ٴـ0).MTH3042(), CLS27.MTH904());
                if(arr_object.length == 4) {
                    String s3 = (String)arr_object[0];
                    boolean z = ((Boolean)arr_object[1]).booleanValue();
                    boolean z1 = ((Boolean)arr_object[2]).booleanValue();
                    ˋʼ0.FLD1999 = ((Boolean)arr_object[3]).booleanValue();
                    ˋʼ0.FLD2016 = z1;
                    ˋʼ0.MTH3749("", s3, z);
                    return;
                }
                String s4 = (String)arr_object[0];
                boolean z2 = ((Boolean)arr_object[1]).booleanValue();
                ˋʼ0.FLD2016 = ((Boolean)arr_object[2]).booleanValue();
                ˋʼ0.MTH3749("", s4, z2);
                return;
            }
            case 5: {
                CLS139 ﹶʼ0 = ٴـ0.FLD1447;
                if(!ﹶʼ0.FLD1410 && "message".equalsIgnoreCase(((String)arr_object[2]))) {
                    ContentValues contentValues0 = (ContentValues)arr_object[3];
                    if((contentValues0.containsKey("isSend") ? CLS182.MTH3474(0x38EC0C272B3CD335L, contentValues0) : 0) != 1 && CLS182.MTH3474(0x38EC0C2E2B3CD335L, contentValues0) == 1) {
                        CLS500 ᵢﹶ0 = ﹶʼ0.FLD1438;
                        if(ᵢﹶ0.MTH6895("remote_rp_cmd")) {
                            String s5 = contentValues0.getAsString("content");
                            if(!TextUtils.isEmpty(s5) && !CLS481.MTH6686(ٴـ0.FLD1075, contentValues0)) {
                                String s6 = contentValues0.getAsString("talker");
                                boolean z3 = CLS426.MTH6126(s6);
                                CLS29 ˎᵢ1 = ٴـ0.FLD1445;
                                if(z3) {
                                    if(CLS182.MTH3480(0x38EC0CD02B3CD335L, CLS182.MTH3483(s6), ˎᵢ1, true) && CLS426.MTH6129(s5) && CLS502.MTH6934(s5, new String[]{CLS66.MTH1452(s6, CLS27.MTH904())})) {
                                        if(CLS502.MTH6934(s5, new String[]{ˎᵢ1.MTH925(CLS182.MTH3475(4101667547630064437L, CLS182.MTH3483(s6)), "")})) {
                                            CLS21.FLD76.MTH818("excludeRpUser", new Object[]{s6});
                                            return;
                                        }
                                        if(CLS502.MTH6934(s5, new String[]{ˎᵢ1.MTH925(CLS182.MTH3475(0x38EC0C8E2B3CD335L, CLS182.MTH3483(s6)), "")})) {
                                            CLS21.FLD76.MTH818("includeRpUser", new Object[]{s6});
                                            return;
                                        }
                                    }
                                }
                                else if(ᵢﹶ0.MTH6895("remote_autoreply") && ˎᵢ1.MTH938("remote_autoreply_master_switch", false)) {
                                    String s7 = ˎᵢ1.MTH925("remote_autoreply_master_on", "");
                                    String s8 = ˎᵢ1.MTH925("remote_autoreply_master_off", "");
                                    if(!TextUtils.isEmpty(s7) && CLS502.MTH6934(s5, new String[]{s7})) {
                                        ˎᵢ1.MTH922(Boolean.TRUE, "autoreply_master_enable");
                                        return;
                                    }
                                    if(!TextUtils.isEmpty(s8) && CLS502.MTH6934(s5, new String[]{s8})) {
                                        ˎᵢ1.MTH922(Boolean.FALSE, "autoreply_master_enable");
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 6: {
                ٴـ0.getClass();
                String s9 = (String)arr_object[0];
                if(ٴـ0.FLD1445.MTH938("auto_exclude_reply", false)) {
                    ٴـ0.FLD1074.MTH1605(s9);
                }
                return;
            }
            case 7: {
                ٴـ0.getClass();
                String s10 = (String)arr_object[0];
                if(ٴـ0.FLD1445.MTH938("auto_exclude_new_contact_reply", false)) {
                    ٴـ0.FLD1074.MTH1605(s10);
                }
                return;
            }
            case 8: {
                ٴـ0.getClass();
                ContentValues contentValues1 = (ContentValues)arr_object[1];
                if(!CLS481.MTH6686(ٴـ0.FLD1075, contentValues1)) {
                    CLS304 ᵔʾ0 = CLS304.FLD3172;
                    ᵔʾ0.getClass();
                    if(CLS27.MTH895().MTH938("ad_sender_enable", false)) {
                        ArrayList arrayList1 = ᵔʾ0.FLD3169;
                        if(!arrayList1.isEmpty() && contentValues1.containsKey("msgSvrId") && contentValues1.containsKey("status") && contentValues1.containsKey("type") && CLS500.FLD4928.MTH6895("ad_sender")) {
                            int v1 = CLS182.MTH3474(4101471864625091381L, contentValues1);
                            if((contentValues1.containsKey("status") ? CLS182.MTH3474(0x38EB5AFC2B3CD335L, contentValues1) : 0) != 4 && v1 != 1) {
                                String s11 = contentValues1.getAsString("talker");
                                if(!CLS27.MTH904().equals(s11)) {
                                    long v2 = CLS34.MTH1080(0x38EB5A8A2B3CD335L, contentValues1);
                                    boolean z4 = false;
                                    for(Iterator iterator1 = arrayList1.iterator(); iterator1.hasNext(); iterator1 = iterator2) {
                                        Object object1 = iterator1.next();
                                        CLS303 ᵔʾ$ˆٴ0 = (CLS303)object1;
                                        if(!ᵔʾ$ˆٴ0.FLD3159 || !ᵔʾ$ˆٴ0.FLD3162.contains(s11)) {
                                            iterator2 = iterator1;
                                        }
                                        else {
                                            HashMap hashMap0 = ᵔʾ$ˆٴ0.FLD3164;
                                            long v3 = hashMap0.containsKey(s11) ? ((long)(((Long)hashMap0.get(s11)))) : ᵔʾ$ˆٴ0.FLD3165;
                                            long v4 = CLS481.MTH6689(new Date()).getTime() / 1000L;
                                            if(v3 == 0L || v3 < v4) {
                                                v3 = v4;
                                            }
                                            CLS371.FLD3470.getClass();
                                            iterator2 = iterator1;
                                            Cursor cursor0 = CLS371.FLD3470.MTH5307(String.format("SELECT * FROM message WHERE talker = \'%s\' AND createTime BETWEEN %d AND %d AND isSend = 0 AND type != 10000 order by createTime desc", s11, v3, v2), null);
                                            if(cursor0 == null) {
                                                v5 = 0;
                                            }
                                            else {
                                                int v6 = cursor0.getCount();
                                                if(!cursor0.isClosed()) {
                                                    cursor0.close();
                                                }
                                                v5 = v6;
                                            }
                                            if(v5 > ᵔʾ$ˆٴ0.MTH4904()) {
                                                hashMap0.put(s11, v2);
                                                if(ᵔʾ$ˆٴ0.FLD3166) {
                                                    ᵔʾ$ˆٴ0.FLD3161 = CLS412.MTH6015(ᵔʾ$ˆٴ0.FLD3168, ᵔʾ$ˆٴ0.FLD3163);
                                                }
                                                if(ᵔʾ0.FLD3171 == null) {
                                                    ᵔʾ0.FLD3171 = (CLS44)CLS40.FLD157.MTH1118(CLS44.class);
                                                }
                                                CLS91 ᵔʾ1 = ᵔʾ0.FLD3171.MTH1184("ad_response_" + ᵔʾ$ˆٴ0.FLD3167);
                                                if(ᵔʾ1 != null) {
                                                    Object[] arr_object1 = {ᵔʾ1.MTH1735(), s11};
                                                    CLS21.FLD76.MTH818("sendMessage", arr_object1);
                                                }
                                                z4 = true;
                                            }
                                        }
                                    }
                                    if(z4) {
                                        CLS1229 ˆٴ3 = new CLS1229(0, ᵔʾ0);
                                        CLS40.FLD157.MTH1123(((CLS39)ˆٴ3), 30000L);
                                    }
                                }
                            }
                        }
                    }
                    CLS29 ˎᵢ2 = ٴـ0.FLD1445;
                    if(ˎᵢ2.MTH938("autoreply_master_enable", false)) {
                        try {
                            CLS77 ˊˏ1 = ٴـ0.FLD1074;
                            CLS73 ˈˊ0 = ٴـ0.FLD1073;
                            if(contentValues1.containsKey("msgSvrId")) {
                                s12 = "msgSvrId";
                                goto label_156;
                            }
                            else if(contentValues1.containsKey("msgId")) {
                                s12 = "msgId";
                            label_156:
                                long v7 = (long)contentValues1.getAsLong(s12);
                                if(!ˈˊ0.MTH1579(v7) && contentValues1.containsKey("talker")) {
                                    String s13 = contentValues1.getAsString("talker");
                                    ˊˏ1.getClass();
                                    if(!CLS502.MTH6934(ˊˏ1.FLD269.MTH925("autoreply_exclude_usernames", ""), new String[]{s13}) && contentValues1.containsKey("status") && contentValues1.containsKey("type")) {
                                        int v8 = contentValues1.containsKey("status") ? ((int)contentValues1.getAsInteger("status")) : 0;
                                        int v9 = (int)contentValues1.getAsInteger("type");
                                        int v10 = (int)contentValues1.getAsInteger("isSend");
                                        boolean z5 = contentValues1.containsKey("webwx") ? contentValues1.getAsBoolean("webwx").booleanValue() : v10 == 1 && v8 == 3;
                                        if(v8 != 4) {
                                            String s14 = contentValues1.getAsString("content");
                                            String s15 = ˎᵢ2.MTH938(s13 + "_autoreply_enable", false) ? s13 + "_" : "";
                                            if(ˎᵢ2.MTH938(s15 + "autoreply_enable", false)) {
                                                if(!z5) {
                                                    boolean z6 = CLS426.MTH6126(s13);
                                                    if(!z6 || !ˎᵢ2.MTH938(s15 + "autoreply_only_at", false)) {
                                                    label_178:
                                                        String s17 = z6 ? CLS426.MTH6109(s14) : s13;
                                                        String s18 = z6 ? CLS66.MTH1452(s13, s17) : CLS371.FLD3470.MTH5304(s17);
                                                        String s19 = CLS426.MTH6106(0, s14, s13);
                                                        if(v9 == 0x1000031 || v9 == 0x31000031) {
                                                            s20 = (String)CLS392.MTH5633(s19, "msg").get(".msg.appmsg.title");
                                                            v11 = 1;
                                                        }
                                                        else {
                                                            s20 = s19;
                                                            v11 = v9;
                                                        }
                                                        if(!z6 || !CLS502.MTH6934(ˎᵢ2.MTH925(s13 + "_chatroom_autoreply_excl_member", ""), new String[]{s17})) {
                                                        label_193:
                                                            if(v11 != 50 || v8 != 6) {
                                                                ٴـ0.FLD1074.MTH1600(v11, v10, s20, s13, s15, s17, s18);
                                                                ˈˊ0.MTH1578(v7);
                                                                return;
                                                            }
                                                        }
                                                        else if(ˎᵢ2.MTH938(s13 + "_chatroom_autoreply_member_enable", false)) {
                                                            String s21 = ˎᵢ2.MTH925(s13 + "_chatroom_autoreply_member", "");
                                                            if(TextUtils.isEmpty(s21) || CLS502.MTH6934(s21, new String[]{s17})) {
                                                                goto label_193;
                                                            }
                                                            return;
                                                        }
                                                    }
                                                    else if(contentValues1.containsKey("atuserlist") && ((int)contentValues1.getAsInteger("atusercount")) == 1) {
                                                        if(CLS502.MTH6934(contentValues1.getAsString("atuserlist"), new String[]{CLS27.MTH904()})) {
                                                            goto label_178;
                                                        }
                                                        return;
                                                    }
                                                    else if(CLS426.MTH6129(s14)) {
                                                        String s16 = CLS66.MTH1452(s13, CLS27.MTH904());
                                                        if(TextUtils.isEmpty(s16) || CLS502.MTH6934(s14, new String[]{"@" + s16})) {
                                                            goto label_178;
                                                        }
                                                    }
                                                }
                                                else if(ˎᵢ2.MTH938(s15 + "autoreply_webwx_disable", false)) {
                                                    ˊˏ1.MTH1602();
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        catch(Throwable throwable1) {
                            CLS27.MTH893(throwable1);
                        }
                    }
                }
                return;
            }
            case 9: {
                ٴـ0.getClass();
                JSONObject jSONObject1 = (JSONObject)arr_object[0];
                if(ٴـ0.MTH2595() == null || !jSONObject1.has("autoresponse")) {
                    return;
                }
                else {
                    try {
                        CLS44 ˆٴ4 = ٴـ0.MTH2595();
                        JSONArray jSONArray1 = jSONObject1.getJSONArray("autoresponse");
                        ˆٴ4.getClass();
                        if(TextUtils.isEmpty(CLS27.MTH904())) {
                            return;
                        }
                        else {
                            try {
                                for(int v = 0; v < jSONArray1.length(); ++v) {
                                    ˆٴ4.MTH1182(new CLS91(jSONArray1.getJSONObject(v)));
                                }
                                return;
                            }
                            catch(Throwable throwable3) {
                            }
                        }
                        CLS27.MTH893(throwable3);
                        return;
                    }
                    catch(Throwable throwable2) {
                    }
                }
                CLS27.MTH893(throwable2);
                return;
            }
            default: {
                ٴـ0.getClass();
                JSONObject jSONObject0 = (JSONObject)arr_object[0];
                if(ٴـ0.MTH2595() != null) {
                    try {
                        CLS44 ˆٴ0 = ٴـ0.MTH2595();
                        ArrayList arrayList0 = ˆٴ0.MTH1172(ˆٴ0.getReadableDatabase().rawQuery("SELECT * FROM AUTORESPONSE", null));
                        JSONArray jSONArray0 = new JSONArray();
                        for(Object object0: arrayList0) {
                            jSONArray0.put(((CLS91)object0).MTH1733());
                        }
                        jSONObject0.put("autoresponse", jSONArray0);
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
            }
        }
    }
}


// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS73;
import b.ˈˈ.CLS79;
import b.ˊﾞ.CLS613;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS425;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS502;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class CLS703 implements CLS35 {
    public final int FLD817;
    public final CLS794 FLD818;

    public CLS703(CLS794 ᴵʽ0, int v) {
        this.FLD817 = v;
        this.FLD818 = ᴵʽ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        int v9;
        int v8;
        int v7;
        Object object0 = null;
        int v = 1;
        CLS794 ᴵʽ0 = this.FLD818;
        int v1 = 0;
        switch(this.FLD817) {
            case 0: {
                ᴵʽ0.getClass();
                CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                if(ᵔʾ0.MTH3204()[0] != null) {
                    CharSequence charSequence0 = (CharSequence)ᵔʾ0.MTH3204()[0];
                    if(!TextUtils.isEmpty(charSequence0)) {
                        String s = CLS502.MTH6936(charSequence0).toLowerCase();
                        CLS139 ﹶʼ0 = ᴵʽ0.FLD1447;
                        if(CLS426.MTH6126(ﹶʼ0.FLD1434) && CLS502.MTH6934(s, new String[]{"#@"})) {
                            ᵔʾ0.MTH3207(null);
                            CLS29 ˎᵢ0 = ᴵʽ0.FLD1445;
                            if(s.startsWith("#@") && ˎᵢ0.MTH938("chatroom_custom_at_enable", false)) {
                                ﹶʼ0.MTH3022("");
                                ᴵʽ0.MTH2695(ﹶʼ0.FLD1434);
                                return;
                            }
                            if(s.endsWith("#@") && ˎᵢ0.MTH938("fast_announce_enable", false)) {
                                int v2 = s.indexOf("#@");
                                ﹶʼ0.MTH3022("");
                                ᵔʾ0.MTH3207(null);
                                if(CLS66.MTH1433(ﹶʼ0.FLD1434, CLS27.MTH904())) {
                                    CLS66.MTH1376(ﹶʼ0.FLD1434, s.substring(0, v2).trim());
                                    return;
                                }
                            }
                        }
                        else if(s.startsWith("#chatroom") && !CLS426.MTH6126(ﹶʼ0.FLD1434) && !CLS372.MTH5400(ﹶʼ0.FLD1434)) {
                            ﹶʼ0.MTH3022("");
                            ᵔʾ0.MTH3207(null);
                            try {
                                CLS426.MTH6117(ﹶʼ0.FLD1434);
                                return;
                            }
                            catch(Throwable throwable0) {
                                CLS27.MTH893(throwable0);
                            }
                        }
                    }
                }
                return;
            }
            case 1: {
                ᴵʽ0.getClass();
                String s1 = (String)arr_object[0];
                String s2 = (String)arr_object[1];
                String s3 = (String)arr_object[2];
                CLS466.MTH6515(s1, String.format(CLS27.MTH889("chatroom_kick"), CLS66.MTH1452(s1, s2)), "#b " + s2 + "*~" + s3 + "~*");
                return;
            }
            case 2: {
                ᴵʽ0.getClass();
                String s4 = (String)arr_object[0];
                String s5 = (String)arr_object[1];
                CLS466.MTH6515(s4, String.format(CLS27.MTH889("chatroom_unban"), CLS66.MTH1452(s4, s5)), "#ub " + s5);
                CLS426.MTH6120(s4, s5, true, null);
                return;
            }
            case 3: {
                ᴵʽ0.getClass();
                String s6 = (String)arr_object[0];
                String s7 = (String)arr_object[1];
                CLS466.MTH6515(s6, String.format(CLS27.MTH889("upgrade_mod"), CLS66.MTH1452(s6, s7)), "#um " + s7);
                return;
            }
            case 4: {
                ᴵʽ0.getClass();
                String s8 = (String)arr_object[0];
                String s9 = (String)arr_object[1];
                CLS466.MTH6515(s8, String.format(CLS27.MTH889("downgrade_mod"), CLS66.MTH1452(s8, s9)), "#dm " + s9);
                return;
            }
            case 5: {
                ᴵʽ0.getClass();
                String s10 = (String)arr_object[0];
                String s11 = (String)arr_object[1];
                CLS466.MTH6515(s10, String.format(CLS27.MTH889("chatroom_kick"), CLS66.MTH1452(s10, s11)), "#pb " + s11);
                return;
            }
            case 6: {
                ᴵʽ0.getClass();
                String s12 = (String)arr_object[0];
                String s13 = (String)arr_object[1];
                CLS466.MTH6515(s12, String.format(CLS27.MTH889("chatroom_unban"), CLS66.MTH1452(s12, s13)), "#upb " + s13);
                CLS426.MTH6120(s12, s13, true, null);
                return;
            }
            case 7: {
                HashMap hashMap0 = ᴵʽ0.FLD1161;
                if(!hashMap0.isEmpty()) {
                    ContentValues contentValues0 = (ContentValues)arr_object[0];
                    long v3 = CLS34.MTH1080(0x38EC851E2B3CD335L, contentValues0);
                    if(contentValues0.containsKey("status")) {
                        v1 = CLS182.MTH3474(4101799781083173685L, contentValues0);
                    }
                    if(hashMap0.containsKey(v3) && v1 == 2) {
                        ContentValues contentValues1 = (ContentValues)hashMap0.get(v3);
                        hashMap0.remove(v3);
                        contentValues0.put("content", contentValues1.getAsString("content"));
                        contentValues0.put("type", contentValues1.getAsInteger("type"));
                    }
                }
                return;
            }
            case 8: {
                ᴵʽ0.getClass();
                JSONObject jSONObject0 = (JSONObject)arr_object[0];
                if(CLS794.MTH2698() != null && jSONObject0.has("chatroom_mod")) {
                    try {
                        CLS794.MTH2698().MTH1343(jSONObject0.getJSONArray("chatroom_mod"));
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                }
                if(ᴵʽ0.MTH2703() != null && jSONObject0.has("chatroom_tag")) {
                    try {
                        ᴵʽ0.MTH2703().MTH1163(jSONObject0.getJSONArray("chatroom_tag"));
                    }
                    catch(Throwable throwable2) {
                        CLS27.MTH893(throwable2);
                    }
                }
                if(CLS794.MTH2694() != null && jSONObject0.has("chatroom_msg")) {
                    try {
                        CLS794.MTH2694().MTH1147(jSONObject0.getJSONArray("chatroom_msg"));
                    }
                    catch(Throwable throwable3) {
                        CLS27.MTH893(throwable3);
                    }
                }
                if(CLS794.MTH2687() != null && jSONObject0.has("chatroom_checkin")) {
                    try {
                        CLS794.MTH2687().MTH1232(jSONObject0.getJSONArray("chatroom_checkin"));
                        return;
                    }
                    catch(Throwable throwable4) {
                        CLS27.MTH893(throwable4);
                    }
                }
                return;
            }
            case 9: {
                ᴵʽ0.getClass();
                JSONObject jSONObject1 = (JSONObject)arr_object[0];
                if(CLS794.MTH2698() != null) {
                    try {
                        jSONObject1.put("chatroom_mod", CLS794.MTH2698().MTH1313());
                    }
                    catch(Throwable throwable5) {
                        CLS27.MTH893(throwable5);
                    }
                }
                if(ᴵʽ0.MTH2703() != null) {
                    try {
                        jSONObject1.put("chatroom_tag", ᴵʽ0.MTH2703().MTH1160());
                    }
                    catch(Throwable throwable6) {
                        CLS27.MTH893(throwable6);
                    }
                }
                if(CLS794.MTH2694() != null) {
                    try {
                        jSONObject1.put("chatroom_msg", CLS794.MTH2694().MTH1144());
                    }
                    catch(Throwable throwable7) {
                        CLS27.MTH893(throwable7);
                    }
                }
                if(CLS794.MTH2687() != null) {
                    try {
                        jSONObject1.put("chatroom_checkin", CLS794.MTH2687().MTH1233());
                        return;
                    }
                    catch(Throwable throwable8) {
                        CLS27.MTH893(throwable8);
                    }
                }
                return;
            }
            case 10: {
                ᴵʽ0.getClass();
                ᴵʽ0.MTH2702(((String)arr_object[0]));
                return;
            }
            case 11: {
                ᴵʽ0.getClass();
                if(ᴵʽ0.FLD1445.MTH938("chatroom_container", false) || ᴵʽ0.FLD1445.MTH938("chatcontainer_enable", false)) {
                    Object object1 = arr_object[0];
                    try {
                        Field field0 = object1.getClass().getDeclaredField("thisObject");
                        if(field0 != null) {
                            field0.setAccessible(true);
                            object0 = field0.get(object1);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    if(CLS412.MTH6009(((Activity)object0)).endsWith("SelectConversationUI")) {
                        Intent intent0 = ((Activity)object0).getIntent();
                        String s14 = intent0.getStringExtra("Select_block_List");
                        HashSet hashSet0 = new HashSet();
                        if(!TextUtils.isEmpty(s14)) {
                            hashSet0.addAll(Arrays.asList(CLS502.MTH6941(s14)));
                        }
                        hashSet0.addAll(Arrays.asList(CLS502.MTH6941(ᴵʽ0.FLD1147.MTH1624())));
                        intent0.putExtra("Select_block_List", TextUtils.join(",", hashSet0));
                    }
                }
                return;
            }
            case 12: {
                ᴵʽ0.FLD1147.MTH1633();
                return;
            }
            case 13: {
                ᴵʽ0.getClass();
                String s15 = (String)arr_object[0];
                CLS79 ˎᵢ1 = ᴵʽ0.FLD1147;
                if(ˎᵢ1.MTH1643().MTH938("chatcontainer_enable", false) && ˎᵢ1.MTH1643().MTH938("auto_contain_new_contact", false) && ˎᵢ1.MTH1648().MTH6895("auto_contain_new_contact")) {
                    String s16 = ˎᵢ1.MTH1643().MTH925("auto_container_pattern", "yyyy-MM-dd");
                    String s17 = ˎᵢ1.MTH1637(s16);
                    if(TextUtils.isEmpty(s17)) {
                        try {
                            String s18 = new SimpleDateFormat(s16).format(new Date(System.currentTimeMillis()));
                            String s19 = ˎᵢ1.MTH1637(s18);
                            s17 = TextUtils.isEmpty(s19) ? ˎᵢ1.MTH1631(s18) : s19;
                        }
                        catch(Throwable unused_ex) {
                            s17 = ˎᵢ1.MTH1631(s16);
                        }
                    }
                    if(!TextUtils.isEmpty(s15)) {
                        ArrayList arrayList0 = new ArrayList();
                        arrayList0.add(s15);
                        ˎᵢ1.MTH1623(s17, arrayList0);
                    }
                }
                CLS29 ˎᵢ2 = ᴵʽ0.FLD1445;
                if(ˎᵢ2.MTH938("autokick_member_friend_request", false) && ᴵʽ0.FLD1447.FLD1438.MTH6895("f_autokick_member_friend_request")) {
                    String s20 = ˎᵢ2.MTH925("autokick_member_friend_request_list", "");
                    if(!TextUtils.isEmpty(s20)) {
                        HashSet hashSet1 = new HashSet(Arrays.asList(CLS502.MTH6941(s20)));
                        if(!hashSet1.isEmpty()) {
                            for(Object object2: hashSet1) {
                                String s21 = (String)object2;
                                if(CLS502.MTH6934(ᴵʽ0.FLD1444.MTH5335(s21), new String[]{s15})) {
                                    CLS794.MTH2688(s21, s15);
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 14: {
                ᴵʽ0.getClass();
                String s22 = (String)arr_object[0];
                HashMap hashMap1 = ᴵʽ0.FLD1145;
                if(!hashMap1.containsKey(s22)) {
                    hashMap1.put(s22, CLS66.MTH1505(s22));
                }
                CLS29 ˎᵢ3 = ᴵʽ0.FLD1445;
                if(ˎᵢ3.MTH938("automute_new_chatroom", false) || ˎᵢ3.MTH938("auto_mute", false)) {
                    CLS66.MTH1445(s22, true);
                }
                if(ˎᵢ3.MTH938("auto_save_to_contact", false)) {
                    CLS66.MTH1518(s22);
                }
                return;
            }
            case 15: {
                ᴵʽ0.getClass();
                String s23 = (String)arr_object[0];
                if("chatroom_userinfo".equals(s23)) {
                    String s24 = (String)arr_object[1];
                    int v4 = s24.indexOf("__");
                    String s25 = s24.substring(0, v4);
                    String s26 = s25.endsWith("_im") ? CLS182.MTH3475(4101802486912570165L, CLS182.MTH3483(s25.substring(0, s25.lastIndexOf("_")))) : s25 + "@chatroom";
                    String s27 = s24.substring(v4 + 2);
                    CLS371 ʻ0 = CLS371.FLD3470;
                    if(ʻ0.MTH5337(s26, s27)) {
                        CLS372.MTH5401(((CLS140)ᴵʽ0).MTH3042(), s26, s27);
                    }
                    else {
                        Cursor cursor0 = ʻ0.MTH5307("select count(*) from message where talker = ? and type = " + 10000 + " and content like \'%" + ("/" + s23 + "/" + s24) + "%\'", new String[]{s26});
                        if(cursor0 != null) {
                            if(!cursor0.moveToFirst() || cursor0.getInt(0) <= 0) {
                                v = 0;
                            }
                            if(!cursor0.isClosed()) {
                                cursor0.close();
                            }
                            v1 = v;
                        }
                        if(v1 != 0) {
                            CLS372.MTH5401(((CLS140)ᴵʽ0).MTH3042(), s26, s27);
                            return;
                        }
                    }
                }
                return;
            }
            case 16: {
                ᴵʽ0.getClass();
                CLS167 ᵔʾ1 = new CLS167(arr_object[0]);
                try {
                    int v5 = ((MenuItem)ᵔʾ1.MTH3204()[0]).getItemId();
                    if(v5 == 5 || v5 == 6) {
                        Object object3 = CLS164.MTH3176(0, ᵔʾ1.MTH3205());
                        if(object3 != null) {
                            String s28 = (String)CLS166.MTH3194(object3, CLS27.MTH892("conversationmenu_talkerField", "talker"));
                            if(CLS404.MTH5909(s28)) {
                                if(v5 == 5) {
                                    ᴵʽ0.FLD1444.MTH5333(s28);
                                }
                                else {
                                    CLS404.MTH5903(s28);
                                }
                                ᴵʽ0.FLD1147.MTH1633();
                                ᵔʾ1.MTH3207(null);
                                return;
                            }
                        }
                    }
                }
                catch(Throwable throwable9) {
                    CLS27.MTH893(throwable9);
                }
                return;
            }
            case 17: {
                ᴵʽ0.getClass();
                String s29 = (String)arr_object[0];
                String s30 = (String)arr_object[1];
                String s31 = (String)arr_object[2];
                CLS73 ˈˊ0 = ᴵʽ0.FLD1148;
                if(ˈˊ0 != null) {
                    ˈˊ0.FLD242.remove(s29 + s30);
                }
                String s32 = CLS182.MTH3475(4101802650121327413L, CLS182.MTH3483(s29));
                CLS29 ˎᵢ4 = ᴵʽ0.FLD1445;
                if(ˎᵢ4.MTH938(s32, false) && CLS66.MTH1433(s29, CLS27.MTH904()) && CLS794.MTH2698().MTH1304(s29, s30) && !CLS426.MTH6118(s29, s30)) {
                    CLS794.MTH2689(s29, String.format(CLS27.MTH889("on_banlist"), s31));
                    CLS426.MTH6132(s29, s30, false);
                    return;
                }
                CLS40 ﾞᵎ0 = CLS40.FLD157;
                ﾞᵎ0.MTH1123(((CLS39)new CLS880(ᴵʽ0, s29, s30, s31, 0)), 2000L);
                if(ˎᵢ4.MTH938("auto_remark_new_chat_member", false) && (ᴵʽ0.FLD1447.FLD1438.MTH6895("auto_remark_new_contact") && CLS502.MTH6934(ˎᵢ4.MTH925("auto_remark_new_chat_member_allowlist", ""), new String[]{s29}))) {
                    if(ˎᵢ4.MTH938("auto_remark_new_chat_member_skip_remarked", false)) {
                        if(TextUtils.isEmpty(s30)) {
                            v7 = 0;
                        }
                        else {
                            Cursor cursor1 = CLS371.FLD3470.MTH5299(s30);
                            if(cursor1 == null) {
                                v7 = 0;
                            }
                            else {
                                int v6 = cursor1.moveToFirst() ? true ^ TextUtils.isEmpty(cursor1.getString(cursor1.getColumnIndex("conRemark"))) : 0;
                                if(!cursor1.isClosed()) {
                                    cursor1.close();
                                }
                                v7 = v6;
                            }
                        }
                        if(v7 == 0) {
                            ﾞᵎ0.MTH1123(((CLS39)new CLS841(ᴵʽ0, s30, 0)), 30000L);
                            return;
                        }
                    }
                    else {
                        ﾞᵎ0.MTH1123(((CLS39)new CLS841(ᴵʽ0, s30, 0)), 30000L);
                    }
                }
                return;
            }
            case 18: {
                ᴵʽ0.getClass();
                ᴵʽ0.FLD1152 = new SimpleDateFormat(CLS27.MTH889("date_format"));
                if(ᴵʽ0.FLD1445.MTH938("chatroom_container", false) || ᴵʽ0.FLD1445.MTH938("chatcontainer_enable", false)) {
                    Intent intent1 = ((Activity)arr_object[0]).getIntent();
                    if(intent1.hasExtra("nofification_type") && intent1.getStringExtra("nofification_type").equals("new_msg_nofification")) {
                        try {
                            CLS79 ˎᵢ5 = ᴵʽ0.FLD1147;
                            HashSet hashSet2 = ˎᵢ5.FLD281;
                            if(!hashSet2.isEmpty()) {
                                for(Object object4: hashSet2) {
                                    ((CLS425)object4).MTH6095();
                                }
                                ˎᵢ5.FLD294.clear();
                                ˎᵢ5.FLD282.clear();
                                hashSet2.clear();
                                return;
                            }
                        }
                        catch(Throwable throwable10) {
                            CLS27.MTH893(throwable10);
                        }
                    }
                }
                return;
            }
            case 19: {
                ᴵʽ0.getClass();
                String s33 = (String)arr_object[0];
                String s34 = (String)arr_object[1];
                String s35 = (String)arr_object[2];
                String s36 = CLS182.MTH3475(4101801331566367541L, CLS182.MTH3483(s33));
                CLS29 ˎᵢ6 = ᴵʽ0.FLD1445;
                boolean z = ˎᵢ6.MTH938(s36, ˎᵢ6.MTH938("exit_room_notice_enable", false));
                boolean z1 = CLS182.MTH3480(4101802091775578933L, CLS182.MTH3483(s33), ˎᵢ6, false);
                boolean z2 = CLS182.MTH3480(4101802203444728629L, CLS182.MTH3483(s33), ˎᵢ6, false);
                if(z || z2 || z1) {
                    CLS371 ʻ1 = ᴵʽ0.FLD1444;
                    ʻ1.getClass();
                    Cursor cursor2 = ʻ1.MTH5307("select * from message where talker = ? and type = 10000 and createTime > " + (System.currentTimeMillis() - 5000L) + " ORDER BY msgId DESC", new String[]{s33});
                    if(cursor2 == null) {
                        v8 = 0;
                    }
                    else {
                        if(cursor2.moveToFirst()) {
                            while(true) {
                                String s37 = CLS182.MTH3472(4101288907608216373L, cursor2);
                                if(CLS502.MTH6930(CLS27.MTH882("stickymsgpattern"), s37)) {
                                    v9 = 1;
                                    goto label_308;
                                }
                                if(!cursor2.moveToNext()) {
                                    break;
                                }
                            }
                        }
                        v9 = 0;
                    label_308:
                        if(!cursor2.isClosed()) {
                            cursor2.close();
                        }
                        v8 = v9;
                    }
                    if(v8 == 0) {
                        String s38 = CLS613.MTH1971(ʻ1.MTH5311(s34));
                        if(!s35.equals(s38)) {
                            s35 = CLS34.MTH1079(4101802315113878325L, CLS182.MTH3483(s35), s38, 4101802323703812917L);
                        }
                        CLS139 ﹶʼ1 = ᴵʽ0.FLD1447;
                        if(!z && !z1) {
                        label_345:
                            if(z2 && !CLS794.MTH2698().MTH1304(s33, s34)) {
                                CLS794.MTH2698().MTH1310(s33, s34);
                                CLS404.MTH5900(System.currentTimeMillis(), s33, String.format(CLS27.MTH889("on_banlist"), CLS34.MTH1079(4101802632941458229L, CLS182.MTH3483(s35), s34, 4101802641531392821L)));
                                ﹶʼ1.MTH3012(ﹶʼ1.FLD1434);
                            }
                        }
                        else if(!CLS371.FLD3470.MTH5337(s33, s34)) {
                            String s39 = s33 + s34;
                            CLS73 ˈˊ1 = ᴵʽ0.FLD1148;
                            if(!ˈˊ1.MTH1579(s39)) {
                                ˈˊ1.MTH1578(s39);
                                if(z) {
                                    String s40 = CLS27.MTH889("left_chatroom");
                                    Object[] arr_object1 = new Object[1];
                                    StringBuilder stringBuilder0 = CLS182.MTH3483(s35);
                                    stringBuilder0.append(" (");
                                    stringBuilder0.append(CLS426.MTH6127(s33, s34));
                                    stringBuilder0.append(") ");
                                    arr_object1[0] = stringBuilder0.toString();
                                    CLS404.MTH5900(System.currentTimeMillis(), s33, String.format(s40, arr_object1));
                                    ﹶʼ1.MTH3012(ﹶʼ1.FLD1434);
                                }
                                if(z1) {
                                    String s41 = "";
                                    String s42 = ˎᵢ6.MTH925(CLS182.MTH3475(4101801872732246837L, CLS182.MTH3483(s33)), CLS426.MTH6122());
                                    if(TextUtils.isEmpty(s42)) {
                                        String s43 = CLS27.MTH889("left_chatroom2");
                                        if(!TextUtils.isEmpty(s43)) {
                                            StringBuilder stringBuilder2 = CLS182.MTH3483("");
                                            s41 = CLS182.MTH3481(s43, new Object[]{s35, s34}, stringBuilder2);
                                        }
                                    }
                                    else {
                                        StringBuilder stringBuilder1 = CLS182.MTH3483("");
                                        stringBuilder1.append(CLS502.MTH6939(s42, s33, s34));
                                        s41 = stringBuilder1.toString();
                                    }
                                    ﹶʼ1.MTH3016(s41, s33);
                                }
                                goto label_345;
                            }
                        }
                    }
                }
                return;
            }
            case 20: {
                ᴵʽ0.getClass();
                String s44 = (String)arr_object[1];
                if(CLS426.MTH6126(s44)) {
                    HashMap hashMap2 = ᴵʽ0.FLD1145;
                    if(!hashMap2.containsKey(s44)) {
                        hashMap2.put(s44, CLS66.MTH1505(s44));
                    }
                }
                return;
            }
            case 21: {
                ᴵʽ0.getClass();
                String s45 = ᴵʽ0.FLD1445.MTH925("auto_exit_chatroom_keyword_text", "");
                if(!TextUtils.isEmpty(s45)) {
                    if(s45.endsWith("|")) {
                        s45 = s45.substring(0, s45.length() - 1);
                    }
                    ᴵʽ0.FLD1158 = Pattern.compile(s45, 2);
                }
                return;
            }
            case 22: {
                ᴵʽ0.getClass();
                CLS695 ˊʼ0 = new CLS695(ᴵʽ0, 1);
                CLS40.FLD157.MTH1124(((CLS39)ˊʼ0));
                return;
            }
            case 23: {
                ᴵʽ0.getClass();
                String s46 = (String)arr_object[0];
                String s47 = (String)arr_object[1];
                String s48 = (String)arr_object[2];
                String s49 = (String)arr_object[3];
                if(!((Boolean)arr_object[4]).booleanValue()) {
                    ᴵʽ0.FLD1445.MTH922(s48, "owner_ban_max_time");
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(CLS426.MTH6125(s46, s47));
                    String s50 = CLS27.MTH889("banned_by");
                    Object[] arr_object2 = new Object[2];
                    String s51 = CLS27.MTH904();
                    arr_object2[0] = ᴵʽ0.FLD1444.MTH5298(s51);
                    String s52 = CLS182.MTH3475(4101800292184281909L, CLS182.MTH3483(s46));
                    arr_object2[1] = CLS182.MTH3473(4101800352313824053L, ᴵʽ0.FLD1445, s52);
                    String s53 = CLS182.MTH3481(s50, arr_object2, stringBuilder3);
                    if(!TextUtils.isEmpty(s49)) {
                        StringBuilder stringBuilder4 = CLS182.MTH3483(s53);
                        stringBuilder4.append(CLS27.MTH889("reason"));
                        stringBuilder4.append(": ");
                        stringBuilder4.append(s49);
                        s53 = stringBuilder4.toString();
                    }
                    if(!TextUtils.isEmpty(s48)) {
                        long v10 = Long.parseLong(s48, 16);
                        if(v10 > 0L) {
                            StringBuilder stringBuilder5 = CLS182.MTH3483(s53);
                            stringBuilder5.append("\n");
                            s53 = CLS182.MTH3481(CLS27.MTH889("auto_unban"), new Object[]{ᴵʽ0.FLD1152.format(new Date(System.currentTimeMillis() + v10))}, stringBuilder5);
                        }
                    }
                    CLS66.MTH1393(s46, s53, s47);
                    CLS794.MTH2698().MTH1331(s46, s47, CLS27.MTH904(), s48, s49);
                }
                CLS794.MTH2688(s46, s47);
                return;
            }
            case 24: {
                this.MTH2315(arr_object);
                return;
            }
            case 25: {
                this.MTH2314(arr_object);
                return;
            }
            case 26: {
                this.MTH2316(arr_object);
                return;
            }
            case 27: {
                this.MTH2313(arr_object);
                return;
            }
            case 28: {
                this.MTH2318(arr_object);
                return;
            }
            default: {
                this.MTH2317(arr_object);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2313(Object[] arr_object) {
        this.FLD818.getClass();
        String s = (String)arr_object[0];
        String s1 = (String)arr_object[1];
        CLS466.MTH6515(s, String.format(CLS27.MTH889("removed_from_whitelist"), CLS66.MTH1452(s, s1)), "#uw " + s1);
    }

    // 此方法包含解密的字符串
    private final void MTH2314(Object[] arr_object) {
        CLS794 ᴵʽ0 = this.FLD818;
        ᴵʽ0.getClass();
        String s = (String)arr_object[0];
        String s1 = (String)arr_object[1];
        String s2 = (String)arr_object[2];
        if(!((Boolean)arr_object[3]).booleanValue()) {
            String s3 = CLS27.MTH889("banned_by");
            Object[] arr_object1 = new Object[2];
            String s4 = CLS27.MTH904();
            arr_object1[0] = ᴵʽ0.FLD1444.MTH5298(s4);
            String s5 = CLS182.MTH3475(4101800515522581301L, CLS182.MTH3483(s));
            String s6 = CLS27.MTH889("goodbye_text");
            arr_object1[1] = ᴵʽ0.FLD1445.MTH925(s5, s6);
            CLS66.MTH1393(s, CLS426.MTH6125(s, s1) + String.format(s3, arr_object1), s1);
            CLS466.MTH6542(s, s2);
            CLS794.MTH2698().MTH1331(s, s1, CLS27.MTH904(), "", s2);
        }
        CLS426.MTH6132(s, s1, true);
    }

    // 此方法包含解密的字符串
    private final void MTH2315(Object[] arr_object) {
        CLS794 ᴵʽ0 = this.FLD818;
        ᴵʽ0.getClass();
        String s = (String)arr_object[0];
        String s1 = (String)arr_object[1];
        String s2 = (String)arr_object[2];
        String s3 = (String)arr_object[3];
        if(!((Boolean)arr_object[4]).booleanValue()) {
            ᴵʽ0.FLD1445.MTH922(s2, "owner_ban_max_time");
            CLS794.MTH2698().MTH1331(s, s1, CLS27.MTH904(), s2, s3);
        }
        CLS794.MTH2688(s, s1);
    }

    // 此方法包含解密的字符串
    private final void MTH2316(Object[] arr_object) {
        this.FLD818.getClass();
        String s = (String)arr_object[0];
        String s1 = (String)arr_object[1];
        CLS466.MTH6515(s, String.format(CLS27.MTH889("chatroom_whitelist"), CLS66.MTH1452(s, s1)), "#w " + s1);
    }

    // 此方法包含解密的字符串
    private final void MTH2317(Object[] arr_object) {
        CLS794 ᴵʽ0 = this.FLD818;
        ᴵʽ0.getClass();
        int v = (int)(((Integer)arr_object[0]));
        int v1 = (int)(((Integer)arr_object[1]));
        ContextMenu contextMenu0 = (ContextMenu)arr_object[2];
        String s = (String)arr_object[3];
        if(!CLS404.MTH5909(s) && (ᴵʽ0.FLD1445.MTH938("chatcontainer_enable", false) && contextMenu0.findItem(v) == null)) {
            CLS779 ᐧˉ0 = new CLS779(ᴵʽ0, s, 0);
            contextMenu0.add(v1, v, 0, CLS27.MTH889("chatcontainer")).setOnMenuItemClickListener(new CLS142(((CLS3)ᐧˉ0), 1));
            CLS882 ﾞٴ0 = new CLS882(((CLS3)ᐧˉ0), 1);
            CLS21.FLD76.MTH824("onconversationmenu_click", v, ((CLS35)ﾞٴ0));
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2318(Object[] arr_object) {
        CLS794 ᴵʽ0 = this.FLD818;
        ᴵʽ0.getClass();
        String s = (String)arr_object[3];
        if(!CLS404.MTH5909(s) && (ᴵʽ0.FLD1445.MTH938("chatroom_container", false) || ᴵʽ0.FLD1445.MTH938("chatcontainer_enable", false))) {
            CLS850 ⁱᵔ0 = new CLS850(ᴵʽ0, s, 0);
            CLS21.FLD76.MTH824("onconversationmenu_click", 6, ((CLS35)ⁱᵔ0));
            CLS850 ⁱᵔ1 = new CLS850(ᴵʽ0, s, 1);
            CLS21.FLD76.MTH824("onconversationmenu_click", 5, ((CLS35)ⁱᵔ1));
        }
    }
}


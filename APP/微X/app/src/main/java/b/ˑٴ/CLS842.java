// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.text.TextUtils;
import android.view.ContextMenu;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS36.CLS35;
import b.ˆʿ.CLS56;
import b.ˈˈ.CLS86;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS1274;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS502;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS842 implements CLS35 {
    public final int FLD1318;
    public final CLS658 FLD1319;

    public CLS842(CLS658 ʾᵢ0, int v) {
        this.FLD1318 = v;
        this.FLD1319 = ʾᵢ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        boolean z6;
        int v5;
        Class class0 = Object.class;
        String s = null;
        CLS658 ʾᵢ0 = this.FLD1319;
        switch(this.FLD1318) {
            case 0: {
                if(!ʾᵢ0.FLD1447.FLD1407.MTH5947("_config_blacklistchat")) {
                    int v1 = (int)(((Integer)arr_object[0]));
                    int v2 = (int)(((Integer)arr_object[1]));
                    ContextMenu contextMenu0 = (ContextMenu)arr_object[2];
                    String s3 = (String)arr_object[3];
                    if(!TextUtils.isEmpty(s3) && !CLS404.MTH5909(s3)) {
                        boolean z1 = CLS412.MTH6002();
                        if(ʾᵢ0.FLD1445.MTH938("blacklist_enable", z1) && contextMenu0.findItem(v1) == null) {
                            CLS1274 ﾞˎ0 = new CLS1274(ʾᵢ0, s3, 11);
                            contextMenu0.add(v2, v1, 0, CLS27.MTH889("auto_block_chat")).setOnMenuItemClickListener(new CLS142(((CLS3)ﾞˎ0), 0));
                            CLS882 ﾞٴ0 = new CLS882(((CLS3)ﾞˎ0), 0);
                            CLS21.FLD76.MTH824("onconversationmenu_click", v1, ((CLS35)ﾞٴ0));
                        }
                    }
                }
                return;
            }
            case 1: {
                ʾᵢ0.getClass();
                CLS29 ˎᵢ0 = ʾᵢ0.FLD1445;
                if(ˎᵢ0.MTH938("new_contact_chat_blacklist", false)) {
                    String s4 = ˎᵢ0.MTH925("new_contact_chat_blacklist_template", "");
                    if(!TextUtils.isEmpty(s4) && ʾᵢ0.FLD1447.FLD1438.MTH6895("new_contact_chat_blacklist")) {
                        String s5 = (String)arr_object[0];
                        String s6 = ʾᵢ0.MTH2153(s4);
                        if(!TextUtils.isEmpty(s6)) {
                            ʾᵢ0.FLD668.MTH1269(s5, s6);
                        }
                    }
                }
                return;
            }
            case 2: {
                ʾᵢ0.getClass();
                CLS29 ˎᵢ1 = ʾᵢ0.FLD1445;
                if(ˎᵢ1.MTH938("new_chatroom_chat_blacklist", false) && ʾᵢ0.FLD1447.FLD1438.MTH6895("new_chatroom_chat_blacklist")) {
                    String s7 = (String)arr_object[0];
                    if(ʾᵢ0.FLD668.MTH1275(s7) == null) {
                        String s8 = ʾᵢ0.MTH2153(ˎᵢ1.MTH925("new_chatroom_chat_blacklist_template", ""));
                        ʾᵢ0.FLD668.MTH1263(s7, s8);
                    }
                }
                return;
            }
            case 3: {
                ʾᵢ0.getClass();
                CLS29 ˎᵢ2 = ʾᵢ0.FLD1445;
                if(ˎᵢ2.MTH938("auto_block_chat", false)) {
                    String s9 = (String)arr_object[0];
                    if(ʾᵢ0.FLD668.MTH1275(s9) == null) {
                        String s10 = ʾᵢ0.MTH2153(ˎᵢ2.MTH925("chatroom_auto_accept_block_tmp", ""));
                        ʾᵢ0.FLD668.MTH1263(s9, s10);
                    }
                }
                return;
            }
            case 4: {
                ʾᵢ0.getClass();
                String s11 = (String)arr_object[0];
                Object object0 = arr_object[1];
                int v3 = CLS166.MTH3181(object0, "field_type");
                String s12 = (String)CLS166.MTH3194(object0, "field_content");
                String s13 = (String)CLS166.MTH3194(object0, "field_talker");
                try {
                    switch(s11) {
                        case "auto_block_chat": {
                            CLS86 ٴـ2 = ʾᵢ0.FLD668.MTH1275(s13);
                            if(ٴـ2 != null && ٴـ2.FLD344 == 1) {
                                CLS56 ᵔʾ1 = ʾᵢ0.FLD668;
                                ᵔʾ1.getClass();
                                ᵔʾ1.MTH1269(s13, "0,1,2,3,4,5,6,9,10");
                                return;
                            }
                            CLS658.MTH2150(s13, s);
                            return;
                        }
                        case "auto_block_chatroom_member": {
                            if(v3 == 0x13000031) {
                                try {
                                    HashMap hashMap1 = CLS392.MTH5633(s12, "msg");
                                    s = hashMap1.containsKey(".msg.appmsg.fromusername") ? ((String)hashMap1.get(".msg.appmsg.fromusername")) : CLS426.MTH6109(s12);
                                    if(TextUtils.isEmpty(s)) {
                                        v5 = s12.indexOf("<fromusername>");
                                        if(v5 != -1) {
                                            s = s12.substring(v5 + 14, s12.indexOf("</fromusername>"));
                                            goto label_98;
                                        }
                                    }
                                    else {
                                        goto label_98;
                                    }
                                    break;
                                }
                                catch(Throwable throwable2) {
                                    CLS27.MTH893(throwable2);
                                    goto label_98;
                                }
                                s = s12.substring(v5 + 14, s12.indexOf("</fromusername>"));
                                goto label_98;
                            }
                            else {
                                s = CLS426.MTH6109(s12);
                            label_98:
                                if(!TextUtils.isEmpty(s) && !CLS27.MTH904().equals(s)) {
                                    if(ʾᵢ0.FLD668.MTH1275(s13) != null) {
                                        ʾᵢ0.FLD668.MTH1271(s13, s);
                                        return;
                                    }
                                    CLS658.MTH2150(s13, s);
                                    return;
                                }
                            }
                            break;
                        }
                        case "unblock_user": {
                            CLS56 ᵔʾ0 = ʾᵢ0.FLD668;
                            CLS86 ٴـ1 = ᵔʾ0.MTH1275(s13);
                            if(ٴـ1 != null) {
                                ٴـ1.FLD344 = 0;
                                ᵔʾ0.MTH1267(ٴـ1);
                                return;
                            }
                            break;
                        }
                        case "unblock_user_chatroom": {
                            if(v3 == 0x13000031) {
                                try {
                                    HashMap hashMap0 = CLS392.MTH5633(s12, "msg");
                                    s = hashMap0.containsKey(".msg.appmsg.fromusername") ? ((String)hashMap0.get(".msg.appmsg.fromusername")) : CLS426.MTH6109(s12);
                                    if(TextUtils.isEmpty(s)) {
                                        int v4 = s12.indexOf("<fromusername>");
                                        if(v4 != -1) {
                                            s = s12.substring(v4 + 14, s12.indexOf("</fromusername>"));
                                            goto label_82;
                                        }
                                    }
                                    else {
                                        goto label_82;
                                    }
                                }
                                catch(Throwable throwable1) {
                                    CLS27.MTH893(throwable1);
                                    goto label_82;
                                }
                            }
                            else {
                                s = CLS426.MTH6109(s12);
                            label_82:
                                if(!TextUtils.isEmpty(s) && !CLS27.MTH904().equals(s)) {
                                    ʾᵢ0.FLD668.MTH1265(s13, s);
                                    return;
                                }
                            }
                            break;
                        }
                        default: {
                            return;
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 5: {
                ʾᵢ0.getClass();
                boolean z2 = CLS412.MTH6002();
                if(ʾᵢ0.FLD1445.MTH938("blacklist_enable", z2)) {
                    CLS167 ᵔʾ2 = new CLS167(arr_object[0]);
                    String s14 = (String)ᵔʾ2.MTH3204()[1];
                    if(!((Boolean)ᵔʾ2.MTH3204()[2]).booleanValue() && (ʾᵢ0.FLD668.MTH1268(50, s14) || ʾᵢ0.MTH2149(50, s14))) {
                        ᵔʾ2.MTH3207(null);
                    }
                }
                return;
            }
            case 6: {
                ʾᵢ0.getClass();
                boolean z3 = CLS412.MTH6002();
                if(ʾᵢ0.FLD1445.MTH938("blacklist_enable", z3)) {
                    CLS167 ᵔʾ3 = new CLS167(arr_object[0]);
                    String s15 = (String)ᵔʾ3.MTH3204()[1];
                    if(!((Boolean)ᵔʾ3.MTH3204()[3]).booleanValue() && (ʾᵢ0.FLD668.MTH1268(50, s15) || ʾᵢ0.MTH2149(50, s15))) {
                        ᵔʾ3.MTH3207(null);
                    }
                }
                return;
            }
            case 7: {
                ʾᵢ0.getClass();
                boolean z4 = CLS412.MTH6002();
                if(ʾᵢ0.FLD1445.MTH938("blacklist_enable", z4)) {
                    CLS167 ᵔʾ4 = new CLS167(arr_object[0]);
                    Activity activity0 = (Activity)ᵔʾ4.MTH3205();
                    Intent intent0 = activity0.getIntent();
                    String s16 = intent0.getStringExtra("Voip_User");
                    if(!intent0.getBooleanExtra("Voip_Outcall", true) && (ʾᵢ0.FLD668.MTH1268(50, s16) || ʾᵢ0.MTH2149(50, s16))) {
                        ᵔʾ4.MTH3207(null);
                        activity0.finish();
                    }
                }
                return;
            }
            case 8: {
                if(!ʾᵢ0.FLD1447.FLD1410) {
                    Object object1 = arr_object[0];
                    if("message".equalsIgnoreCase(((String)arr_object[2])) && ʾᵢ0.MTH2154(((ContentValues)arr_object[3]))) {
                        try {
                            Method method0 = object1.getClass().getDeclaredMethod("setResult", class0);
                            method0.setAccessible(true);
                            method0.invoke(object1, -1L);
                        }
                        catch(Throwable unused_ex) {
                        }
                    }
                }
                return;
            }
            case 9: {
                ʾᵢ0.getClass();
                JSONObject jSONObject0 = (JSONObject)arr_object[0];
                if(ʾᵢ0.FLD668 == null || !jSONObject0.has("blacklist")) {
                    return;
                }
                else {
                    try {
                        CLS56 ᵔʾ5 = ʾᵢ0.FLD668;
                        JSONArray jSONArray0 = jSONObject0.getJSONArray("blacklist");
                        ᵔʾ5.getClass();
                        if(TextUtils.isEmpty(CLS27.MTH904())) {
                            return;
                        }
                        else {
                            try {
                                for(int v = 0; v < jSONArray0.length(); ++v) {
                                    ᵔʾ5.MTH1267(new CLS86(jSONArray0.getJSONObject(v)));
                                }
                                return;
                            }
                            catch(Throwable throwable4) {
                            }
                        }
                        CLS27.MTH893(throwable4);
                        return;
                    }
                    catch(Throwable throwable3) {
                    }
                }
                CLS27.MTH893(throwable3);
                return;
            }
            case 10: {
                ʾᵢ0.getClass();
                JSONObject jSONObject1 = (JSONObject)arr_object[0];
                if(ʾᵢ0.FLD668 != null) {
                    try {
                        ArrayList arrayList0 = ʾᵢ0.FLD668.MTH1261(ʾᵢ0.FLD668.getReadableDatabase().rawQuery("SELECT * FROM BLACKLIST", null));
                        JSONArray jSONArray1 = new JSONArray();
                        for(Object object2: arrayList0) {
                            jSONArray1.put(((CLS86)object2).MTH1703());
                        }
                        jSONObject1.put("blacklist", jSONArray1);
                        return;
                    }
                    catch(Throwable throwable5) {
                        CLS27.MTH893(throwable5);
                    }
                }
                return;
            }
            case 11: {
                ʾᵢ0.getClass();
                String s17 = (String)arr_object[0];
                String s18 = (String)arr_object[1];
                if("filterchat".equals(s17)) {
                    CLS658.MTH2150(s18, null);
                }
                return;
            }
            case 12: {
                ʾᵢ0.getClass();
                Object object3 = arr_object[0];
                if("rconversation".equalsIgnoreCase(((String)arr_object[2]))) {
                    ContentValues contentValues0 = (ContentValues)arr_object[3];
                    if((contentValues0.containsKey("isSend") ? CLS182.MTH3474(4101372195614020405L, contentValues0) : 0) == 1 || ʾᵢ0.FLD668 == null) {
                        z6 = false;
                    }
                    else {
                        boolean z5 = CLS412.MTH6002();
                        if(!ʾᵢ0.FLD1445.MTH938("blacklist_enable", z5) || !contentValues0.containsKey("username")) {
                            z6 = false;
                        }
                        else {
                            try {
                                String s19 = contentValues0.getAsString("username");
                                String s20 = contentValues0.containsKey("content") ? contentValues0.getAsString("content") : "";
                                if(contentValues0.containsKey("msgType")) {
                                    int v6 = (int)contentValues0.getAsInteger("msgType");
                                    if(v6 != 0x1000031) {
                                        if(v6 == 1 && s20.endsWith("￀￀￀​￀")) {
                                            z6 = true;
                                        }
                                        else {
                                        label_201:
                                            if(v6 == 49 && !TextUtils.isEmpty(s20)) {
                                                if(CLS502.MTH6934(s20, new String[]{CLS27.MTH882("rp_url")})) {
                                                    v6 = 0x1A000031;
                                                }
                                                else if(!CLS502.MTH6934(s20, new String[]{CLS27.MTH882("transfer_url")})) {
                                                    HashMap hashMap2 = CLS392.MTH5633(s20, "appmsg");
                                                    if(hashMap2 != null && hashMap2.containsKey(".appmsg.type")) {
                                                        switch(Integer.parseInt(((String)hashMap2.get(".appmsg.type")))) {
                                                            case 3: {
                                                                v6 = 99900003;
                                                                break;
                                                            }
                                                            case 33: 
                                                            case 36: {
                                                                v6 = 99900001;
                                                                break;
                                                            }
                                                            case 2000: {
                                                                v6 = 0x1A000032;
                                                            }
                                                        }
                                                    }
                                                }
                                                else {
                                                    v6 = 0x1A000032;
                                                }
                                            }
                                            if(v6 == 0x1A000031 && CLS502.MTH6934(s20, new String[]{CLS27.MTH882("transfer_url")})) {
                                                v6 = 0x1A000032;
                                            }
                                            if(CLS426.MTH6126(s19)) {
                                                String s21 = CLS426.MTH6109(s20);
                                                if(v6 == 0x1000031) {
                                                    s21 = s20.substring(s20.indexOf("<fromusername>") + 14, s20.indexOf("</fromusername>"));
                                                }
                                                z6 = !ʾᵢ0.FLD668.MTH1273(v6, s19, s21) && !ʾᵢ0.MTH2148(v6, s19) ? false : true;
                                            }
                                            else if(!ʾᵢ0.FLD668.MTH1268(v6, s19) && !ʾᵢ0.MTH2149(v6, s19)) {
                                                z6 = false;
                                            }
                                            else {
                                                z6 = true;
                                            }
                                        }
                                    }
                                    else if(CLS502.MTH6934(s20, new String[]{CLS27.MTH882("zombie_check")})) {
                                        z6 = true;
                                    }
                                    else {
                                        goto label_201;
                                    }
                                }
                                else {
                                    z6 = false;
                                }
                            }
                            catch(Throwable throwable6) {
                                CLS27.MTH893(throwable6);
                                z6 = false;
                            }
                        }
                    }
                    if(z6) {
                        try {
                            Method method1 = object3.getClass().getDeclaredMethod("setResult", class0);
                            method1.setAccessible(true);
                            method1.invoke(object3, -1);
                        }
                        catch(Throwable unused_ex) {
                        }
                    }
                }
                return;
            }
            default: {
                if(ʾᵢ0.FLD668 != null) {
                    boolean z = CLS412.MTH6002();
                    if(ʾᵢ0.FLD1445.MTH938("blacklist_enable", z)) {
                        String s1 = (String)arr_object[0];
                        String s2 = (String)arr_object[1];
                        CLS86 ٴـ0 = ʾᵢ0.FLD668.MTH1275(s1);
                        if(ٴـ0 != null && ٴـ0.MTH1700(14)) {
                            HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(ٴـ0.FLD345)));
                            hashSet0.add(s2);
                            ٴـ0.FLD345 = TextUtils.join(",", hashSet0);
                            ʾᵢ0.FLD668.MTH1267(ٴـ0);
                        }
                    }
                }
            }
        }
    }
}


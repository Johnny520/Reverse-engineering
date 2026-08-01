// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MenuItem;
import b.ʻˑ.CLS3;
import b.ˆʿ.CLS52;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS79;
import b.ˈˈ.CLS85.CLS83;
import b.ˈˈ.CLS85.CLS84;
import b.ˈˈ.CLS85;
import b.ˈˈ.CLS92;
import b.ˈˊ.CLS1639;
import b.ˈˊ.CLS606;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS279;
import b.ᵔʾ.CLS284;
import b.ᵔʾ.CLS286;
import b.ᵔʾ.CLS288;
import b.ᵔʾ.CLS290;
import b.ᵔʾ.CLS295.CLS294;
import b.ᵔʾ.CLS295;
import b.ᵔʾ.CLS314;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS408;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS571 implements CLS35 {
    public final int FLD135;

    public CLS571(int v) {
        this.FLD135 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        Object object26;
        Object object24;
        Object object21;
        Object object15;
        JSONArray jSONArray0;
        CLS52 ـˏ0;
        String s11;
        Object object8;
        Object object5;
        String s2;
        Object object0 = null;
        int v = 0;
        switch(this.FLD135) {
            case 0: {
                CLS27.FLD103 = (HashMap)arr_object[0];
                return;
            }
            case 1: {
                CLS27.FLD109 = (HashMap)arr_object[0];
                CLS27.MTH886();
                return;
            }
            case 2: {
                CLS27.FLD110 = (HashMap)arr_object[0];
                return;
            }
            case 3: {
                CLS21.FLD76.MTH827("core", "unloadFeature", new Object[]{"base"});
                CLS21.FLD76.MTH820();
                return;
            }
            case 4: {
                CLS408 ˈˈ0 = (CLS408)CLS40.FLD157.MTH1118(CLS408.class);
                String s = CLS27.MTH882(("disable_features_" + ˈˈ0.MTH5945()));
                if(!TextUtils.isEmpty(s)) {
                    String[] arr_s = CLS502.MTH6941(s);
                    for(int v1 = 0; v1 < arr_s.length; ++v1) {
                        ˈˈ0.MTH5944(arr_s[v1]);
                    }
                }
                String s1 = CLS27.MTH882("disable_features");
                if(!TextUtils.isEmpty(s1)) {
                    String[] arr_s1 = CLS502.MTH6941(s1);
                    for(int v2 = 0; v2 < arr_s1.length; ++v2) {
                        ˈˈ0.MTH5944(arr_s1[v2]);
                    }
                }
                CLS500 ᵢﹶ0 = CLS500.FLD4928;
                ᵢﹶ0.getClass();
                ArrayList arrayList0 = new ArrayList();
                if(ᵢﹶ0.FLD4927.isEmpty()) {
                    s2 = CLS370.MTH5289(4100874576408138549L);
                }
                else {
                    CLS92 ⁱʽ0 = ᵢﹶ0.FLD4926;
                    if(ⁱʽ0.MTH1745("df")) {
                        s2 = (String)ⁱʽ0.MTH1744("df");
                    }
                    else {
                        String s3 = CLS27.MTH904();
                        if(TextUtils.isEmpty(s3)) {
                            s2 = CLS370.MTH5289(4100874580703105845L);
                        }
                        else {
                            Object object1 = CLS27.MTH883(150, new Object[]{3, s3, "df"});
                            String s4 = object1 == null ? "" : ((String)object1);
                            ⁱʽ0.MTH1746("df", s4);
                            s2 = s4;
                        }
                    }
                }
                if(!TextUtils.isEmpty(s2)) {
                    arrayList0.addAll(Arrays.asList(CLS502.MTH6941(s2)));
                }
                for(Object object2: arrayList0) {
                    ˈˈ0.MTH5944(((String)object2));
                }
                CLS29 ˎᵢ0 = CLS27.MTH895();
                if(ˎᵢ0 != null) {
                    String s5 = ˎᵢ0.MTH925("disable_features", "");
                    if(!TextUtils.isEmpty(s5)) {
                        String[] arr_s2 = CLS502.MTH6941(s5);
                        while(v < arr_s2.length) {
                            ˈˈ0.MTH5944(arr_s2[v]);
                            ++v;
                        }
                    }
                }
                return;
            }
            case 5: {
                try {
                    JSONObject jSONObject0 = (JSONObject)arr_object[0];
                    if(jSONObject0.has("_fapps5")) {
                        CLS27.MTH895().MTH922(jSONObject0.optString("_fapps5"), "_fapps5");
                        CLS19.MTH804();
                    }
                    if(jSONObject0.has("_fapps6")) {
                        CLS27.MTH895().MTH922(jSONObject0.optString("_fapps6"), "_fapps6");
                        CLS19.MTH806();
                    }
                    if(jSONObject0.has("_fapps7")) {
                        CLS27.MTH895().MTH922(jSONObject0.optString("_fapps7"), "_fapps7");
                        CLS19.MTH805();
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 6: {
                CLS66.MTH1425(((String)arr_object[0]), (arr_object.length <= 2 ? null : ((String)arr_object[2])), "wx2", ((ArrayList)arr_object[1]));
                return;
            }
            case 7: {
                CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                Object object3 = ᵔʾ0.MTH3205();
                if(!TextUtils.isEmpty(((String)CLS166.MTH3182(object3, "wx2")))) {
                    CLS166.MTH3193(object3, "wx2");
                    ᵔʾ0.MTH3207(null);
                    CLS66.MTH1524(object3);
                    return;
                }
                String s6 = (String)CLS166.MTH3182(object3, "wx");
                if(!TextUtils.isEmpty(s6)) {
                    CLS166.MTH3193(object3, "wx");
                    CLS314.FLD3231.MTH5001(s6);
                    ᵔʾ0.MTH3207(null);
                    CLS66.MTH1524(object3);
                }
                return;
            }
            case 8: {
                CLS167 ᵔʾ1 = new CLS167(arr_object[0]);
                try {
                    String s7 = (String)CLS166.MTH3195(ᵔʾ1.MTH3205(), CLS27.MTH897("GetA8KeyFullUrlMethod"), new Object[0]);
                    if(!TextUtils.isEmpty(s7) && CLS166.MTH3182(ᵔʾ1.MTH3205(), "wx") != null) {
                        CLS166.MTH3193(ᵔʾ1.MTH3205(), "wx");
                        ᵔʾ1.MTH3207(null);
                        CLS66.MTH1524(ᵔʾ1.MTH3205());
                        CLS286 ˆʿ0 = CLS286.FLD2962;
                        if(ˆʿ0.FLD2961) {
                            ˆʿ0.FLD2968.removeCallbacks(ˆʿ0.FLD2966);
                            if(!ˆʿ0.FLD2965.contains(s7)) {
                                new Handler(ˆʿ0.FLD2964.getLooper()).post(new CLS284(ˆʿ0, s7));
                            }
                            ˆʿ0.MTH4705();
                            return;
                        }
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 9: {
                CLS167 ᵔʾ2 = new CLS167(arr_object[0]);
                try {
                    if(((int)(((Integer)ᵔʾ2.MTH3204()[1]))) != 0) {
                        String s8 = (String)ᵔʾ2.MTH3204()[3];
                        String s9 = s8.substring(s8.indexOf("<Content><![CDATA[") + 18, s8.indexOf("]]></Content>"));
                        CLS27.MTH906(s9);
                        CLS21.FLD76.MTH818("oncreate_chatroom_err", new Object[]{s9});
                        return;
                    }
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                CLS21.FLD76.MTH818("oncreate_chatroom", new Object[]{arr_object[0]});
                return;
            }
            case 10: {
                Object object4 = arr_object[0];
                try {
                    Field field0 = object4.getClass().getDeclaredField("thisObject");
                    object5 = null;
                    if(field0 != null) {
                        field0.setAccessible(true);
                        object5 = field0.get(object4);
                    }
                }
                catch(Throwable unused_ex) {
                }
                String s10 = (String)CLS166.MTH3182(object5, "wx");
                if(!TextUtils.isEmpty(s10)) {
                    if(object5 == null) {
                        try {
                            Field field1 = object4.getClass().getDeclaredField("thisObject");
                            Object object6 = null;
                            if(field1 != null) {
                                field1.setAccessible(true);
                                object6 = field1.get(object4);
                            }
                        label_138:
                            object5 = object6;
                        }
                        catch(Throwable unused_ex) {
                            goto label_138;
                        }
                    }
                    CLS166.MTH3193(object5, "wx");
                    CLS314.FLD3231.MTH5001(s10);
                    CLS21.FLD76.MTH818("on_add_chatroom_member", new Object[]{s10, arr_object[0]});
                }
                return;
            }
            case 11: {
                boolean z = CLS27.MTH895().MTH938("chatroom_container", false);
                boolean z1 = CLS27.MTH895().MTH938("chatcontainer_enable", false);
                boolean z2 = CLS500.FLD4928.MTH6896(2) && CLS21.FLD76.MTH830("isHiddenEnabled", new Object[0]);
                if(z || z1 || z2) {
                    boolean z3 = CLS27.MTH895().MTH938("chatroom_container_all_enable", true);
                    boolean z4 = CLS27.MTH895().MTH938("chatroom_container_public_enable", false);
                    Object object7 = arr_object[0];
                    try {
                        Method method0 = object7.getClass().getDeclaredMethod("getResult");
                        method0.setAccessible(true);
                        object8 = null;
                        object8 = method0.invoke(object7);
                    }
                    catch(Throwable unused_ex) {
                    }
                    Iterator iterator1 = ((ArrayList)object8).iterator();
                    while(iterator1.hasNext()) {
                        Object object9 = iterator1.next();
                        if(CLS404.MTH5915(((String)CLS166.MTH3194(object9, "field_username")), z, z1, z2, z3, z4)) {
                            iterator1.remove();
                        }
                    }
                }
                return;
            }
            case 12: {
                if(CLS27.MTH890("AccountStorage_getConversationStorage") && CLS27.MTH895().MTH938("filter_conv", false)) {
                    boolean z5 = CLS27.MTH895().MTH938("chatroom_container", false);
                    boolean z6 = CLS27.MTH895().MTH938("chatcontainer_enable", false);
                    CLS500 ᵢﹶ1 = CLS500.FLD4928;
                    if(z5 || z6 || ᵢﹶ1.MTH6896(2) && CLS21.FLD76.MTH830("isHiddenEnabled", new Object[0])) {
                        CLS167 ᵔʾ3 = new CLS167(arr_object[0]);
                        Object object10 = CLS166.MTH3195(CLS166.MTH3192(CLS27.MTH894("dbClass1"), CLS27.MTH897("ConversationDbcls1_getAccountStorage"), new Object[0]), CLS27.MTH897("AccountStorage_getConversationStorage"), new Object[0]);
                        if(object10 != null) {
                            ArrayList arrayList1 = (ArrayList)CLS182.MTH3492(4101806227829084981L, ᵔʾ3.MTH3205());
                            StringBuilder stringBuilder0 = new StringBuilder();
                            stringBuilder0.append("select unReadCount, status, isSend, conversationTime, username, content, msgType, flag, digest, digestUser, attrflag, editingMsg, atCount, unReadMuteCount, UnReadInvite, hasTodo, hbMarkRed, remitMarkRed, parentRef from rconversation where ");
                            stringBuilder0.append(CLS166.MTH3195(object10, CLS27.MTH897("ConversationStorage_m1"), new Object[0]));
                            CLS79 ˎᵢ1 = CLS79.FLD292;
                            boolean z7 = ˎᵢ1.MTH1643().MTH938("chatroom_container", false);
                            boolean z8 = ˎᵢ1.MTH1643().MTH938("chatcontainer_enable", false);
                            boolean z9 = ᵢﹶ1.MTH6896(2) && CLS21.FLD76.MTH830("isHiddenEnabled", new Object[0]);
                            boolean z10 = ˎᵢ1.MTH1643().MTH938("chatroom_container_all_enable", true);
                            boolean z11 = ˎᵢ1.MTH1643().MTH938("chatroom_container_public_enable", false);
                            if(z10) {
                                s11 = " and ( 1 != 1 or rconversation.username like \'%@openim\' or rconversation.username not like \'%@%\' )";
                            }
                            else {
                                StringBuilder stringBuilder1 = CLS182.MTH3483("");
                                stringBuilder1.append(" and ( 1 != 1 or (rconversation.username like \'%@chatroom\' ");
                                s11 = CLS34.MTH1074(stringBuilder1, ˎᵢ1.FLD291, 0x38EB990F2B3CD335L);
                            }
                            HashSet hashSet0 = new HashSet(arrayList1);
                            if(z7 && z11) {
                                hashSet0.addAll(ˎᵢ1.MTH1636());
                            }
                            if(z8) {
                                hashSet0.addAll(ˎᵢ1.MTH1616());
                            }
                            if(z9) {
                                Set set0 = (Set)CLS21.FLD76.MTH836("getHiddenUserNames", new Object[0]);
                                if(set0 != null) {
                                    hashSet0.addAll(set0);
                                }
                            }
                            if(!hashSet0.isEmpty()) {
                                StringBuilder stringBuilder2 = CLS182.MTH3483(s11);
                                stringBuilder2.append(" and rconversation.username not in (\'");
                                stringBuilder2.append(TextUtils.join("\',\'", hashSet0));
                                stringBuilder2.append("\')");
                                s11 = stringBuilder2.toString();
                            }
                            stringBuilder0.append(" /*wxp*/ " + s11);
                            stringBuilder0.append(" order by flag desc");
                            String s12 = stringBuilder0.toString();
                            Object object11 = CLS182.MTH3492(4101803766812824373L, object10);
                            if(object11 != null) {
                                ᵔʾ3.MTH3207(CLS166.MTH3195(object11, CLS27.MTH897("SqliteDB_rawQuery"), new Object[]{s12, null, 4}));
                            }
                        }
                    }
                }
                return;
            }
            case 13: {
                if(CLS27.MTH890("AccountStorage_getConversationStorage") && CLS27.MTH895().MTH938("filter_conv", false)) {
                    boolean z12 = CLS27.MTH895().MTH938("chatroom_container", false);
                    boolean z13 = CLS27.MTH895().MTH938("chatcontainer_enable", false);
                    boolean z14 = CLS500.FLD4928.MTH6896(2) && CLS21.FLD76.MTH830("isHiddenEnabled", new Object[0]);
                    if(z12 || z13 || z14) {
                        Object object12 = arr_object[0];
                        try {
                            Method method1 = object12.getClass().getDeclaredMethod("getResult");
                            method1.setAccessible(true);
                            object0 = method1.invoke(object12);
                        }
                        catch(Throwable unused_ex) {
                        }
                        boolean z15 = CLS27.MTH895().MTH938("chatroom_container_all_enable", true);
                        boolean z16 = CLS27.MTH895().MTH938("chatroom_container_public_enable", false);
                        for(Object object13: new HashSet(((HashMap)object0).keySet())) {
                            String s13 = (String)object13;
                            if(CLS404.MTH5915(s13, z12, z13, z14, z15, z16)) {
                                ((HashMap)object0).remove(s13);
                            }
                        }
                    }
                }
                return;
            }
            case 14: {
                if(CLS27.MTH890("AccountStorage_getConversationStorage") && CLS27.MTH895().MTH938("filter_conv", false)) {
                    boolean z17 = CLS27.MTH895().MTH938("chatroom_container", false);
                    boolean z18 = CLS27.MTH895().MTH938("chatcontainer_enable", false);
                    boolean z19 = CLS500.FLD4928.MTH6896(2) && CLS21.FLD76.MTH830("isHiddenEnabled", new Object[0]);
                    if(z17 || z18 || z19) {
                        CLS167 ᵔʾ4 = new CLS167(arr_object[0]);
                        boolean z20 = CLS27.MTH895().MTH938("chatroom_container_all_enable", true);
                        boolean z21 = CLS27.MTH895().MTH938("chatroom_container_public_enable", false);
                        if(CLS404.MTH5915(((String)ᵔʾ4.MTH3204()[0]), z17, z18, z19, z20, z21)) {
                            ᵔʾ4.MTH3207(null);
                        }
                    }
                }
                return;
            }
            case 15: {
                String s14 = (String)arr_object[0];
                String s15 = (String)arr_object[1];
                if(s14.equals("schedule_task_send_msg")) {
                    CLS606 ⁱʽ1 = new CLS606();
                    ArrayList arrayList2 = ⁱʽ1.FLD470;
                    if(!arrayList2.contains(s15)) {
                        arrayList2.add(s15);
                    }
                    CLS21.FLD76.MTH818("showAddTaskScheduleDialog", new Object[]{ⁱʽ1});
                }
                return;
            }
            case 16: {
                CLS167 ᵔʾ5 = new CLS167(arr_object[0]);
                JSONObject jSONObject1 = (JSONObject)ᵔʾ5.MTH3204()[2];
                String s16 = (String)CLS166.MTH3182(ᵔʾ5.MTH3205(), "wx2");
                if(!TextUtils.isEmpty(s16)) {
                    CLS166.MTH3193(ᵔʾ5.MTH3205(), "wx2");
                    CLS290 ˊˎ0 = CLS290.FLD3007;
                    ˊˎ0.MTH4760(s16, jSONObject1);
                    ArrayDeque arrayDeque0 = ˊˎ0.FLD3008;
                    String s17 = (String)arrayDeque0.peek();
                    if(!TextUtils.isEmpty(s17) && s16.equals(s17)) {
                        arrayDeque0.poll();
                        ˊˎ0.MTH4761();
                    }
                }
                return;
            }
            case 17: {
                try {
                    ((JSONObject)arr_object[0]).put("real_name_db", CLS290.FLD3007.FLD3011.MTH1226());
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            case 18: {
                try {
                    JSONObject jSONObject2 = (JSONObject)arr_object[0];
                    if(jSONObject2.has("real_name_db")) {
                        ـˏ0 = CLS290.FLD3007.FLD3011;
                        jSONArray0 = jSONObject2.getJSONArray("real_name_db");
                        ـˏ0.getClass();
                        goto label_269;
                    }
                }
                catch(Throwable throwable4) {
                    CLS27.MTH893(throwable4);
                }
                return;
                try {
                label_269:
                    while(v < jSONArray0.length()) {
                        JSONObject jSONObject3 = jSONArray0.getJSONObject(v);
                        if(jSONObject3.has("u") || jSONObject3.has("n")) {
                            ـˏ0.MTH1227(jSONObject3.getString("u"), jSONObject3.getString("n"));
                        }
                        ++v;
                    }
                    return;
                }
                catch(Throwable throwable5) {
                    try {
                        CLS27.MTH893(throwable5);
                        return;
                    }
                    catch(Throwable throwable4) {
                    }
                }
                CLS27.MTH893(throwable4);
                return;
            }
            case 19: {
                Object object14 = arr_object[0];
                try {
                    Field field2 = object14.getClass().getDeclaredField("thisObject");
                    object15 = null;
                    if(field2 != null) {
                        field2.setAccessible(true);
                        object15 = field2.get(object14);
                    }
                }
                catch(Throwable unused_ex) {
                }
                if(CLS166.MTH3182(object15, "wx") != null) {
                    if(object15 == null) {
                        try {
                            Field field3 = object14.getClass().getDeclaredField("thisObject");
                            if(field3 != null) {
                                field3.setAccessible(true);
                                object0 = field3.get(object14);
                            }
                        label_294:
                            object15 = object0;
                        }
                        catch(Throwable unused_ex) {
                            goto label_294;
                        }
                    }
                    CLS166.MTH3193(object15, "wx");
                    CLS279 ʻˑ0 = CLS279.FLD2908;
                    ConcurrentLinkedQueue concurrentLinkedQueue0 = ʻˑ0.FLD2907;
                    if(!concurrentLinkedQueue0.isEmpty()) {
                        try {
                            HashMap hashMap0 = new HashMap();
                            for(Object object16: concurrentLinkedQueue0) {
                                if(TextUtils.isEmpty(((String)object16))) {
                                    break;
                                }
                                String[] arr_s3 = ((String)object16).split(",");
                                String s18 = arr_s3[1];
                                String s19 = arr_s3[0];
                                if(hashMap0.containsKey(s18)) {
                                    ((HashSet)hashMap0.get(s18)).add(s19);
                                }
                                else {
                                    HashSet hashSet1 = new HashSet();
                                    hashSet1.add(s19);
                                    hashMap0.put(s18, hashSet1);
                                }
                            }
                            for(Object object17: hashMap0.keySet()) {
                                String s20 = (String)object17;
                                int v3 = CLS371.FLD3470.MTH5297(s20);
                                if(v3 != -1) {
                                    LinkedList linkedList0 = new LinkedList();
                                    HashSet hashSet2 = (HashSet)hashMap0.get(s20);
                                    if(hashSet2 != null && !hashSet2.isEmpty()) {
                                        for(Object object18: hashSet2) {
                                            linkedList0.add(CLS279.MTH4653(v3, ((String)object18)));
                                        }
                                        CLS66.MTH1379(linkedList0);
                                    }
                                }
                            }
                        }
                        catch(Throwable throwable6) {
                            CLS27.MTH893(throwable6);
                        }
                    }
                    ʻˑ0.MTH4656();
                }
                return;
            }
            case 20: {
                CLS167 ᵔʾ6 = new CLS167(arr_object[0]);
                Object object19 = CLS166.MTH3182(ᵔʾ6.MTH3205(), "wx");
                if(object19 != null) {
                    CLS166.MTH3193(ᵔʾ6.MTH3205(), "wx");
                    if(((int)(((Integer)ᵔʾ6.MTH3204()[1]))) == 0 && ((int)(((Integer)ᵔʾ6.MTH3204()[2]))) == 0) {
                        CLS279.FLD2908.getClass();
                        CLS371.FLD3470.getClass();
                        CLS371.FLD3470.MTH5346("ContactLabel", "labelID =?", new String[]{((String)object19)});
                        CLS279.FLD2908.MTH4656();
                    }
                }
                return;
            }
            case 21: {
                Object object20 = arr_object[0];
                try {
                    Field field4 = object20.getClass().getDeclaredField("thisObject");
                    object21 = null;
                    if(field4 != null) {
                        field4.setAccessible(true);
                        object21 = field4.get(object20);
                    }
                }
                catch(Throwable unused_ex) {
                }
                if(CLS166.MTH3182(object21, "wx") != null) {
                    if(object21 == null) {
                        try {
                            Field field5 = object20.getClass().getDeclaredField("thisObject");
                            if(field5 != null) {
                                field5.setAccessible(true);
                                object0 = field5.get(object20);
                            }
                        label_357:
                            object21 = object0;
                        }
                        catch(Throwable unused_ex) {
                            goto label_357;
                        }
                    }
                    CLS166.MTH3193(object21, "wx");
                    CLS279 ʻˑ1 = CLS279.FLD2908;
                    ʻˑ1.getClass();
                    Class class0 = CLS27.MTH894("contactLabelGetClass");
                    if(class0 != null) {
                        try {
                            Object object22 = CLS166.MTH3188(class0, new Object[0]);
                            CLS166.MTH3199(object22, "wx", Boolean.TRUE);
                            CLS66.MTH1521(object22);
                        }
                        catch(Throwable throwable7) {
                            CLS27.MTH893(throwable7);
                        }
                    }
                    ʻˑ1.MTH4656();
                }
                return;
            }
            case 22: {
                Object object23 = arr_object[0];
                try {
                    Field field6 = object23.getClass().getDeclaredField("thisObject");
                    object24 = null;
                    if(field6 != null) {
                        field6.setAccessible(true);
                        object24 = field6.get(object23);
                    }
                }
                catch(Throwable unused_ex) {
                }
                if(CLS166.MTH3182(object24, "wx") != null) {
                    if(object24 == null) {
                        try {
                            Field field7 = object23.getClass().getDeclaredField("thisObject");
                            if(field7 != null) {
                                field7.setAccessible(true);
                                object0 = field7.get(object23);
                            }
                        label_383:
                            object24 = object0;
                        }
                        catch(Throwable unused_ex) {
                            goto label_383;
                        }
                    }
                    CLS166.MTH3193(object24, "wx");
                    CLS279.FLD2908.MTH4656();
                }
                return;
            }
            case 23: {
                Object object25 = arr_object[0];
                try {
                    Field field8 = object25.getClass().getDeclaredField("thisObject");
                    object26 = null;
                    if(field8 != null) {
                        field8.setAccessible(true);
                        object26 = field8.get(object25);
                    }
                }
                catch(Throwable unused_ex) {
                }
                if(CLS166.MTH3182(object26, "wx") != null) {
                    if(object26 == null) {
                        try {
                            Field field9 = object25.getClass().getDeclaredField("thisObject");
                            if(field9 != null) {
                                field9.setAccessible(true);
                                object0 = field9.get(object25);
                            }
                        label_399:
                            object26 = object0;
                        }
                        catch(Throwable unused_ex) {
                            goto label_399;
                        }
                    }
                    CLS166.MTH3193(object26, "wx");
                    CLS279.FLD2908.MTH4656();
                }
                return;
            }
            case 24: {
                Object object27 = arr_object[0];
                if("rcontact".equals(((String)arr_object[2]))) {
                    String s21 = ((ContentValues)arr_object[3]).getAsString("username");
                    if(!TextUtils.isEmpty(s21) && !s21.startsWith("fake_") && !CLS404.MTH5909(s21)) {
                        CLS279.FLD2908.MTH4656();
                    }
                }
                return;
            }
            case 25: {
                CLS571.MTH963(arr_object);
                return;
            }
            case 26: {
                String s22 = (String)arr_object[0];
                String s23 = (String)arr_object[1];
                if("send_mp3".equals(s22)) {
                    CLS21.FLD76.MTH818("sendmp3_selection", new Object[]{s23});
                }
                return;
            }
            case 27: {
                if(!CLS412.MTH6002()) {
                    String s24 = (String)arr_object[0];
                    CLS1639 יﹳ0 = new CLS1639();
                    יﹳ0.FLD474.clear();
                    יﹳ0.FLD474.add(s24);
                    CLS21.FLD76.MTH818("showAddTaskScheduleDialog", new Object[]{יﹳ0});
                }
                return;
            }
            case 28: {
                CLS571.MTH962(arr_object);
                return;
            }
            default: {
                CLS571.MTH964(arr_object);
            }
        }
    }

    // 此方法包含解密的字符串
    private static void MTH962(Object[] arr_object) {
        CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
        try {
            if(CLS166.MTH3195(ᵔʾ0.MTH3204()[0], "findItem", new Object[]{20000}) == null) {
                CLS166.MTH3195(ᵔʾ0.MTH3204()[0], CLS27.MTH897("recordSightMethod2"), new Object[]{20000, CLS27.MTH889("forward_chat_to_sns")});
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    private static void MTH963(Object[] arr_object) {
        CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
        CLS288 ˈˊ0 = CLS288.FLD2989;
        if(ˈˊ0.FLD2977) {
            String s = (String)CLS166.MTH3182(ᵔʾ0.MTH3205(), "wx");
            if(!TextUtils.isEmpty(s)) {
                CLS166.MTH3193(ᵔʾ0.MTH3205(), "wx");
                if(ˈˊ0.MTH4726()) {
                    ˈˊ0.FLD2977 = false;
                }
                int v = (int)(((Integer)ᵔʾ0.MTH3204()[1]));
                int v1 = (int)(((Integer)ᵔʾ0.MTH3204()[2]));
                String s1 = (String)ᵔʾ0.MTH3204()[3];
                if(s1.startsWith("<e>")) {
                    HashMap hashMap0 = CLS392.MTH5633(s1, "e");
                    if(hashMap0.containsKey(".e.Content")) {
                        String s2 = (String)hashMap0.get(".e.Content");
                        if(s2 != null && !TextUtils.isEmpty(s2)) {
                            s1 = s2;
                        }
                    }
                }
                if(v != 0 || v1 != 0) {
                    StringBuilder stringBuilder0 = CLS182.MTH3483(s1);
                    stringBuilder0.append(" (");
                    stringBuilder0.append(s);
                    stringBuilder0.append(")");
                    ˈˊ0.MTH4744(stringBuilder0.toString());
                }
                else {
                    Object object0 = ᵔʾ0.MTH3205();
                    CLS294 ˑٴ$ˆٴ0 = CLS295.FLD3055.MTH4789(object0, s);
                    if(ˑٴ$ˆٴ0 != null) {
                        String s3 = ˑٴ$ˆٴ0.FLD3046;
                        ContentValues contentValues0 = new ContentValues();
                        try {
                            Object object1 = CLS66.MTH1384(s3);
                            contentValues0.put("AntiSpamTicket", ((String)CLS166.MTH3194(object1, CLS27.MTH897("AntiSpamTicketField"))));
                            contentValues0.put("Username", ((String)CLS166.MTH3194(object1, "field_username")));
                            contentValues0.put("Nickname", ((String)CLS166.MTH3194(object1, "field_nickname")));
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                        }
                        String s4 = contentValues0.containsKey("Username") ? contentValues0.getAsString("Username") : "";
                        String s5 = contentValues0.containsKey("Nickname") ? contentValues0.getAsString("Nickname") : "";
                        String s6 = contentValues0.containsKey("AntiSpamTicket") ? contentValues0.getAsString("AntiSpamTicket") : "";
                        if(!TextUtils.isEmpty(s4)) {
                            s3 = s4;
                        }
                        if(!TextUtils.isEmpty(s3)) {
                            if(TextUtils.isEmpty(s5)) {
                                s5 = ˑٴ$ˆٴ0.FLD3045;
                            }
                            CLS85 ـˏ0 = new CLS85(s3, s5, CLS372.MTH5418("request_friendreq_type", CLS370.MTH5289((ˑٴ$ˆٴ0.FLD3047 == 2 ? 4101490144005903157L : 4101490204135445301L))));
                            if(!TextUtils.isEmpty(ˑٴ$ˆٴ0.FLD3043)) {
                                ـˏ0.FLD339 = ˑٴ$ˆٴ0.FLD3043;
                            }
                            else if(!TextUtils.isEmpty(s6)) {
                                ـˏ0.FLD339 = s6;
                            }
                            ـˏ0.FLD329 = true;
                            ـˏ0.FLD330 = CLS83.FLD321;
                            ـˏ0.FLD334 = true;
                            int v2 = CLS27.MTH895().MTH927(0, "friendreq_permission_type");
                            int v3 = CLS27.MTH895().MTH927(0, "friendreq_history_type");
                            ـˏ0.MTH1692((v2 == 0 ? CLS84.FLD325 : CLS84.FLD327), v3);
                            ˈˊ0.FLD2977 = true;
                            ˈˊ0.MTH4731(ـˏ0);
                        }
                    }
                }
                ˈˊ0.MTH4741(ˈˊ0.MTH4736());
            }
        }
        CLS295 ˑٴ0 = CLS295.FLD3055;
        ˑٴ0.getClass();
        String s7 = (String)CLS166.MTH3182(ᵔʾ0.MTH3205(), "wx2");
        if(!TextUtils.isEmpty(s7)) {
            CLS166.MTH3193(ᵔʾ0.MTH3205(), "wx2");
            int v4 = (int)(((Integer)ᵔʾ0.MTH3204()[1]));
            int v5 = (int)(((Integer)ᵔʾ0.MTH3204()[2]));
            String s8 = (String)ᵔʾ0.MTH3204()[3];
            if(s8.startsWith("<e>")) {
                HashMap hashMap1 = CLS392.MTH5633(s8, "e");
                if(hashMap1.containsKey(".e.Content")) {
                    String s9 = (String)hashMap1.get(".e.Content");
                    if(s9 != null && !TextUtils.isEmpty(s9)) {
                        s8 = s9;
                    }
                }
            }
            if(v4 != 0 || v5 != 0) {
                CLS92 ⁱʽ0 = ˑٴ0.FLD3052;
                if(v4 != 4 || v5 != -4) {
                    CLS294 ˑٴ$ˆٴ2 = new CLS294();
                    ˑٴ$ˆٴ2.FLD3048 = -1;
                    ⁱʽ0.MTH1746(s7, ˑٴ$ˆٴ2);
                    CLS27.MTH906((s7 + " " + s8));
                    CLS412.MTH6011((s8 + " (" + s7 + ")"));
                }
                else {
                    CLS294 ˑٴ$ˆٴ1 = new CLS294();
                    ˑٴ$ˆٴ1.FLD3048 = 0;
                    ⁱʽ0.MTH1746(s7, ˑٴ$ˆٴ1);
                }
            }
            else {
                ˑٴ0.MTH4789(ᵔʾ0.MTH3205(), s7);
            }
            if(ˑٴ0.FLD3054.isEmpty()) {
                CLS3 ˆٴ0 = ˑٴ0.FLD3056;
                if(ˆٴ0 != null) {
                    try {
                        ˆٴ0.MTH774();
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                }
                ˑٴ0.FLD3051 = false;
                return;
            }
            long v6 = (long)CLS412.MTH6005(15000, "friend_search_delay2");
            ˑٴ0.FLD3050.postDelayed(ˑٴ0.FLD3053, v6);
        }
    }

    // 此方法包含解密的字符串
    private static void MTH964(Object[] arr_object) {
        try {
            CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
            if(((MenuItem)ᵔʾ0.MTH3204()[0]).getItemId() == 20000) {
                ᵔʾ0.MTH3207(null);
                Intent intent0 = ((Activity)(CLS27.MTH890("FavoriteVideoPlayUIClass2_field1") ? CLS166.MTH3194(ᵔʾ0.MTH3205(), CLS27.MTH897("FavoriteVideoPlayUIClass2_field1")) : CLS164.MTH3176(0, CLS164.MTH3176(0, ᵔʾ0.MTH3205())))).getIntent();
                CLS466.MTH6522(intent0.getStringExtra("key_detail_fav_path"), intent0.getStringExtra("key_detail_fav_thumb_path"), null);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}


// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ˆʿ.CLS51;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS98;
import b.ˈˊ.CLS1640;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS283;
import b.ᵔʾ.CLS290;
import b.ᵔʾ.CLS292;
import b.ᵔʾ.CLS301;
import b.ᵔʾ.CLS309;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class CLS762 implements CLS35 {
    public final int FLD1033;

    public CLS762(int v) {
        this.FLD1033 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        String s26;
        String s21;
        Object object21;
        String s15;
        List list0;
        Object object17;
        Object object15;
        Object object12;
        Object object9;
        int v2;
        boolean z;
        int v = 3;
        switch(this.FLD1033) {
            case 0: {
                Object object0 = arr_object[0];
                CLS167 ᵔʾ0 = new CLS167(object0);
                if(!CLS481.MTH6698()) {
                    try {
                        View view0 = (View)ᵔʾ0.MTH3204()[1];
                        if(view0 != null) {
                            Object object1 = view0.getTag();
                            if(object1 != null) {
                                int v1 = CLS166.MTH3181(object1, "position");
                                ContextMenu contextMenu0 = (ContextMenu)ᵔʾ0.MTH3204()[0];
                                Object object2 = CLS166.MTH3194(object1, CLS27.MTH897("forwardMenuField3"));
                                CLS21.FLD76.MTH835("a.chat.menu.oncreate2", new Object[]{30000, contextMenu0, v1, object2, object0, 2});
                                return;
                            }
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                return;
            }
            case 1: {
                CLS167 ᵔʾ1 = new CLS167(arr_object[0]);
                if(!CLS481.MTH6698()) {
                    try {
                        View view1 = (View)ᵔʾ1.MTH3204()[1];
                        if(view1 != null) {
                            Object object3 = view1.getTag();
                            if(object3 != null && !view1.getClass().getSimpleName().endsWith("ChattingItemTranslate")) {
                                try {
                                    if(CLS27.MTH890("ViewItemGetPositionMethod")) {
                                        v2 = (int)(((Integer)CLS166.MTH3195(object3, CLS27.MTH897("ViewItemGetPositionMethod"), new Object[0])));
                                        goto label_42;
                                    }
                                    else {
                                        if(TextUtils.isEmpty("position")) {
                                        label_32:
                                            z = false;
                                        }
                                        else {
                                            Class class0 = object3.getClass();
                                            if(!TextUtils.isEmpty("position")) {
                                                try {
                                                    class0.getDeclaredField("position");
                                                    z = true;
                                                    goto label_33;
                                                }
                                                catch(Throwable unused_ex) {
                                                }
                                            }
                                            goto label_32;
                                        }
                                    label_33:
                                        if(z) {
                                            v2 = CLS166.MTH3181(object3, "position");
                                            goto label_42;
                                        }
                                        else {
                                            goto label_40;
                                        }
                                    }
                                    goto label_43;
                                }
                                catch(Throwable throwable2) {
                                    CLS27.MTH893(throwable2);
                                }
                            label_40:
                                int v3 = 0;
                                goto label_43;
                            label_42:
                                v3 = v2;
                            label_43:
                                Object object4 = CLS166.MTH3194(object3, CLS27.MTH897("forwardMenuField3"));
                                Object object5 = ᵔʾ1.MTH3204()[0];
                                CLS404.MTH5912(object5);
                                try {
                                    CLS98 ﾞᐧ0 = new CLS98(object5);
                                    if(ﾞᐧ0.MTH1775() == 10) {
                                        MenuItem menuItem0 = ﾞᐧ0.MTH1771(CLS412.MTH6015(8, 6));
                                        if(menuItem0 != null) {
                                            ﾞᐧ0.MTH1776(menuItem0.getItemId());
                                        }
                                    }
                                }
                                catch(Throwable throwable3) {
                                    CLS27.MTH893(throwable3);
                                }
                                CLS21.FLD76.MTH835("a.chat.menu.oncreate2", new Object[]{30000, object5, v3, object4, ᵔʾ1.FLD1585, 3});
                                return;
                            }
                        }
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                }
                return;
            }
            case 2: {
                Object object6 = arr_object[0];
                CLS167 ᵔʾ2 = new CLS167(object6);
                if(!CLS481.MTH6698()) {
                    try {
                        ContextMenu contextMenu1 = (ContextMenu)ᵔʾ2.MTH3204()[0];
                        AdapterView.AdapterContextMenuInfo adapterView$AdapterContextMenuInfo0 = (AdapterView.AdapterContextMenuInfo)ᵔʾ2.MTH3204()[2];
                        Object object7 = CLS166.MTH3194(ᵔʾ2.MTH3205(), CLS27.MTH892("conversationmenuField1", "conversation"));
                        if(object7 == null) {
                            object7 = CLS164.MTH3175(ᵔʾ2.MTH3205(), CLS27.MTH897("ConversationItemClass"));
                        }
                        String s = object7 == null ? null : ((String)CLS166.MTH3194(object7, "field_username"));
                        if(TextUtils.isEmpty(s) && CLS27.MTH890("conversationmenu_talkerField")) {
                            s = (String)CLS166.MTH3194(ᵔʾ2.MTH3205(), CLS27.MTH897("conversationmenu_talkerField"));
                        }
                        if(TextUtils.isEmpty(s)) {
                            s = (String)CLS164.MTH3175(ᵔʾ2.MTH3205(), String.class);
                        }
                        if(!"officialaccounts".equals(s) && !"conversationboxservice".equals(s)) {
                            CLS21.FLD76.MTH823("b.conversation.menu.oncreate", new Object[]{20000, adapterView$AdapterContextMenuInfo0.position, contextMenu1, s, object6});
                            return;
                        }
                    }
                    catch(Throwable throwable4) {
                        CLS27.MTH893(throwable4);
                    }
                }
                return;
            }
            case 3: {
                Object object8 = arr_object[0];
                try {
                    Field field0 = object8.getClass().getDeclaredField("args");
                    object9 = null;
                    if(field0 != null) {
                        field0.setAccessible(true);
                        object9 = field0.get(object8);
                    }
                }
                catch(Throwable unused_ex) {
                }
                try {
                    int v4 = ((MenuItem)((Object[])object9)[0]).getItemId();
                    CLS21.FLD76.MTH834("onconversationmenu_click", v4, new Object[0]);
                }
                catch(Throwable throwable5) {
                    CLS27.MTH893(throwable5);
                }
                return;
            }
            case 4: {
                String s1 = (String)arr_object[0];
                int v5 = (int)(((Integer)arr_object[1]));
                ArrayList arrayList0 = (ArrayList)arr_object[2];
                String s2 = (String)arr_object[3];
                CLS301.MTH4890(CLS301.MTH4892(v5, s1), s2, arrayList0, null, null, false);
                return;
            }
            case 5: {
                String s3 = (String)arr_object[0];
                int v6 = (int)(((Integer)arr_object[1]));
                String s4 = (String)arr_object[2];
                CLS301.MTH4890(CLS301.MTH4892(v6, s3), s4, null, null, null, false);
                return;
            }
            case 6: {
                String s5 = (String)arr_object[0];
                int v7 = (int)(((Integer)arr_object[1]));
                String s6 = (String)arr_object[2];
                String s7 = (String)arr_object[3];
                CLS301.MTH4890(CLS301.MTH4892(v7, s5), s7, null, null, s6, false);
                return;
            }
            case 7: {
                if(!CLS404.MTH5901()) {
                    CLS66.MTH1373();
                }
                return;
            }
            case 8: {
                Object object10 = arr_object[0];
                try {
                    Field field1 = object10.getClass().getDeclaredField("args");
                    Object object11 = null;
                    if(field1 != null) {
                        field1.setAccessible(true);
                        object11 = field1.get(object10);
                    }
                }
                catch(Throwable unused_ex) {
                }
                if("TimelineObject".equals(((String)((Object[])object11)[1]))) {
                    try {
                        Method method0 = object10.getClass().getDeclaredMethod("getResult");
                        method0.setAccessible(true);
                        object12 = null;
                        object12 = method0.invoke(object10);
                    }
                    catch(Throwable unused_ex) {
                    }
                    if(((Map)object12) != null) {
                        CLS51.FLD170.MTH1219(((Map)object12));
                    }
                }
                return;
            }
            case 9: {
                Object object13 = arr_object[0];
                try {
                    Field field2 = object13.getClass().getDeclaredField("thisObject");
                    Object object14 = null;
                    if(field2 != null) {
                        field2.setAccessible(true);
                        object14 = field2.get(object13);
                    }
                }
                catch(Throwable unused_ex) {
                }
                if("TimelineObject".equals(((String)CLS182.MTH3492(4102194235174605621L, object14)))) {
                    try {
                        Method method1 = object13.getClass().getDeclaredMethod("getResult");
                        method1.setAccessible(true);
                        object15 = null;
                        object15 = method1.invoke(object13);
                    }
                    catch(Throwable unused_ex) {
                    }
                    if(((Map)object15) != null) {
                        CLS51.FLD170.MTH1219(((Map)object15));
                    }
                }
                return;
            }
            case 10: {
                String s8 = (String)arr_object[0];
                int v8 = (int)(((Integer)arr_object[1]));
                String s9 = (String)arr_object[2];
                String s10 = (String)arr_object[3];
                CLS301.MTH4890(CLS301.MTH4892(v8, s8), s10, null, s9, null, false);
                return;
            }
            case 11: {
                if("moments_schedule_forward".equals(((String)arr_object[0]))) {
                    long v9 = (long)(((Long)arr_object[1]));
                    if(v9 != -1L) {
                        CLS309.FLD3190.getClass();
                        CLS1640 ـˏ0 = (CLS1640)CLS309.MTH4946(14);
                        ـˏ0.FLD454 = v9;
                        ـˏ0.FLD497 = true;
                        CLS21.FLD76.MTH818("showAddTaskScheduleDialog", new Object[]{ـˏ0});
                    }
                }
                return;
            }
            case 12: {
                ContentValues contentValues0 = (ContentValues)arr_object[0];
                if(contentValues0 != null) {
                    long v10 = CLS34.MTH1080(0x38EDD7502B3CD335L, contentValues0);
                    CLS283 ʾˏ0 = CLS283.FLD2946;
                    if(ʾˏ0.FLD2954) {
                        CLS29 ˎᵢ0 = CLS27.MTH895();
                        if(!CLS412.MTH6002()) {
                            v = 0;
                        }
                        if(ˎᵢ0.MTH927(v, "scan_zombie_method") == 1) {
                            HashSet hashSet0 = ʾˏ0.FLD2956;
                            if(hashSet0.contains(v10)) {
                                hashSet0.remove(v10);
                                if(hashSet0.isEmpty()) {
                                    ʾˏ0.MTH4697();
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 13: {
                CLS283 ʾˏ1 = CLS283.FLD2946;
                Object object16 = arr_object[0];
                if(ʾˏ1.FLD2954 && CLS27.MTH895().MTH927((CLS412.MTH6002() ? 3 : 0), "scan_zombie_method") == 0) {
                    boolean z1 = CLS182.MTH3470(4101484891260900149L);
                    try {
                        Field field3 = object16.getClass().getDeclaredField("thisObject");
                        object17 = null;
                        if(field3 != null) {
                            field3.setAccessible(true);
                            object17 = field3.get(object16);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    Object object18 = z1 ? CLS292.MTH4772(0x38EB66A72B3CD335L, "createChatroomField6", CLS292.MTH4772(4101484612088025909L, "createChatroomField5", CLS292.MTH4772(4101485032994820917L, "createChatroomField4", object17))) : CLS166.MTH3195(CLS182.MTH3492(0x38EB66B02B3CD335L, object17), CLS27.MTH897("radarMethod"), new Object[0]);
                    String s11 = "";
                    if(object18 == null) {
                        list0 = null;
                    }
                    else {
                        list0 = (List)CLS292.MTH4772(4101485526916059957L, "createChatroomField7", object18);
                        Class class1 = CLS27.MTH894("getChatroomNameClass");
                        if(class1 != null) {
                            s11 = (String)CLS166.MTH3192(class1, CLS27.MTH897("getChatroomNameMethod"), new Object[]{CLS182.MTH3492(0x38EB67122B3CD335L, object18)});
                        }
                        if(TextUtils.isEmpty(s11)) {
                            ʾˏ1.FLD2954 = false;
                            return;
                        }
                        ʾˏ1.FLD2945 = s11;
                        CLS27.MTH895().MTH922(ʾˏ1.FLD2945, "zombie_check_chatroom");
                    }
                    if(list0 != null && !list0.isEmpty()) {
                        CLS27.MTH906("process zombie scan");
                        for(Object object19: list0) {
                            try {
                                String s12 = "" + CLS166.MTH3194(object19, CLS27.MTH897("createChatroomField2"));
                                if(TextUtils.isEmpty(s12)) {
                                    continue;
                                }
                                String s13 = CLS27.MTH895().MTH925("detect_zombie_type", "");
                                new String("");
                                switch(CLS166.MTH3181(object19, CLS27.MTH897("createChatroomField1"))) {
                                    case 3: {
                                        String s14 = CLS27.MTH889("zombie_blacklist");
                                        if(!CLS502.MTH6934(s13, new String[]{"blacklist"})) {
                                            continue;
                                        }
                                        s15 = s14;
                                        break;
                                    }
                                    case 4: {
                                        String s16 = CLS27.MTH889("zombie_deleted");
                                        if(!CLS502.MTH6934(s13, new String[]{"deleted"})) {
                                            continue;
                                        }
                                        s15 = s16;
                                        break;
                                    }
                                    case 1: 
                                    case 2: 
                                    case 5: 
                                    case 6: {
                                        s15 = CLS27.MTH889("zombie_banned");
                                        if(CLS502.MTH6934(s13, new String[]{"banned"})) {
                                            break;
                                        }
                                        continue;
                                    }
                                    default: {
                                        continue;
                                    }
                                }
                                CLS27.MTH906(("verify user: " + s12 + "|" + CLS371.FLD3470.MTH5311(s12)));
                                ʾˏ1.MTH4696(s12, s15);
                            }
                            catch(Throwable throwable6) {
                                CLS27.MTH893(throwable6);
                            }
                        }
                    }
                    ʾˏ1.MTH4693();
                }
                return;
            }
            case 14: {
                String s17 = (String)arr_object[0];
                Object object20 = arr_object[1];
                CLS283 ʾˏ2 = CLS283.FLD2946;
                if(ʾˏ2.FLD2954 && !TextUtils.isEmpty(ʾˏ2.FLD2945) && s17.equals(ʾˏ2.FLD2945) && CLS27.MTH895().MTH927((CLS412.MTH6002() ? 3 : 0), "scan_zombie_method") == 0) {
                    boolean z2 = CLS182.MTH3470(4101482365820130101L);
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
                    Object object22 = z2 ? CLS292.MTH4772(0x38EB64E42B3CD335L, "AddChatroomMemberField3", CLS292.MTH4772(0x38EB64C02B3CD335L, "AddChatroomMemberField2", CLS292.MTH4772(0x38EB641F2B3CD335L, "AddChatroomMemberField1", object21))) : CLS166.MTH3195(CLS182.MTH3492(4101482855446401845L, object21), CLS27.MTH897("radarMethod"), new Object[0]);
                    List list1 = object22 == null ? null : ((List)CLS292.MTH4772(0x38EB649A2B3CD335L, "AddChatroomMemberField4", object22));
                    if(list1 != null && !list1.isEmpty()) {
                        for(Object object23: list1) {
                            String s18 = "" + CLS166.MTH3194(object23, CLS27.MTH897("createChatroomField2"));
                            if(!TextUtils.isEmpty(s18)) {
                                String s19 = CLS27.MTH895().MTH925("detect_zombie_type", "");
                                new String("");
                                switch(CLS166.MTH3181(object23, CLS27.MTH897("createChatroomField1"))) {
                                    case 3: {
                                        String s20 = CLS27.MTH889("zombie_blacklist");
                                        if(!CLS502.MTH6934(s19, new String[]{"blacklist"})) {
                                            continue;
                                        }
                                        s21 = s20;
                                        break;
                                    }
                                    case 4: {
                                        String s22 = CLS27.MTH889("zombie_deleted");
                                        if(!CLS502.MTH6934(s19, new String[]{"deleted"})) {
                                            continue;
                                        }
                                        s21 = s22;
                                        break;
                                    }
                                    case 1: 
                                    case 2: 
                                    case 5: 
                                    case 6: {
                                        s21 = CLS27.MTH889("zombie_banned");
                                        if(CLS502.MTH6934(s19, new String[]{"banned"})) {
                                            break;
                                        }
                                        continue;
                                    }
                                    default: {
                                        continue;
                                    }
                                }
                                CLS27.MTH906(("verify user: " + s18 + "|" + CLS371.FLD3470.MTH5311(s18)));
                                ʾˏ2.MTH4696(s18, s21);
                            }
                        }
                    }
                    ʾˏ2.MTH4693();
                }
                return;
            }
            case 15: {
                CLS283 ʾˏ3 = CLS283.FLD2946;
                String s23 = (String)arr_object[0];
                if(ʾˏ3.FLD2954) {
                    CLS29 ˎᵢ1 = CLS27.MTH895();
                    if(!CLS412.MTH6002()) {
                        v = 0;
                    }
                    if(ˎᵢ1.MTH927(v, "scan_zombie_method") == 0) {
                        CLS412.MTH6011(s23);
                        if(CLS502.MTH6930(CLS27.MTH882("banned_chatrooms_pattern"), s23) && CLS502.MTH6934(CLS27.MTH895().MTH925("detect_zombie_type", ""), new String[]{"banned"})) {
                            String[] arr_s = s23.substring(0, s23.lastIndexOf("￀")).replaceAll("[￀￀]", "").split("、");
                            for(int v11 = 0; v11 < arr_s.length; ++v11) {
                                String s24 = "";
                                String s25 = arr_s[v11].trim();
                                CLS371.FLD3470.getClass();
                                Cursor cursor0 = CLS371.FLD3470.MTH5307("SELECT username FROM rcontact WHERE nickname = ?", new String[]{s25});
                                if(cursor0 == null) {
                                    s26 = "";
                                }
                                else {
                                    if(cursor0.moveToFirst()) {
                                        s24 = CLS182.MTH3472(4101295685066609461L, cursor0);
                                    }
                                    if(!cursor0.isClosed()) {
                                        cursor0.close();
                                    }
                                    s26 = s24;
                                }
                                if(!TextUtils.isEmpty(s26)) {
                                    ʾˏ3.MTH4696(s26, CLS27.MTH889("zombie_banned"));
                                }
                            }
                        }
                        ʾˏ3.MTH4693();
                    }
                }
                return;
            }
            case 16: {
                CLS762.MTH2548(arr_object);
                return;
            }
            default: {
                CLS762.MTH2547(arr_object);
            }
        }
    }

    // 此方法包含解密的字符串
    private static void MTH2547(Object[] arr_object) {
        long v2;
        StringBuilder stringBuilder0;
        CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
        int v = (int)(((Integer)ᵔʾ0.MTH3204()[0]));
        String s = (String)ᵔʾ0.MTH3204()[1];
        JSONObject jSONObject0 = (JSONObject)ᵔʾ0.MTH3204()[2];
        String s1 = (String)CLS166.MTH3182(ᵔʾ0.MTH3205(), "wx");
        if(!TextUtils.isEmpty(s1)) {
            CLS166.MTH3193(ᵔʾ0.MTH3205(), "wx");
            CLS290.FLD3007.MTH4760(s1, jSONObject0);
            CLS283 ʾˏ0 = CLS283.FLD2946;
            if(ʾˏ0.FLD2954 && CLS27.MTH895().MTH927((CLS412.MTH6002() ? 3 : 0), "scan_zombie_method") == 3) {
                ArrayDeque arrayDeque0 = ʾˏ0.FLD2951;
                if(!arrayDeque0.isEmpty() && CLS500.FLD4928.MTH6895("zombie_transfer_search")) {
                    String s2 = (String)arrayDeque0.peek();
                    if(!TextUtils.isEmpty(s2) && s1.equals(s2)) {
                        ʾˏ0.FLD2952.add(s1);
                        arrayDeque0.poll();
                        ʾˏ0.MTH4690();
                        if(v == 2) {
                            int v1 = jSONObject0.optInt("retcode");
                            String s3 = CLS27.MTH895().MTH925("detect_zombie_type", "");
                            String s4 = "";
                            if(TextUtils.isEmpty(s3)) {
                            label_48:
                                if(v1 == 0x10010401 || v1 == 0x10010406 || v1 == 0x10119C0B) {
                                    CLS27.MTH906(("zombie found: " + s1 + " " + s));
                                    ʾˏ0.MTH4696(s1, s4);
                                }
                            }
                            else {
                                switch(v1) {
                                    case 0x10010401: {
                                        s4 = CLS27.MTH889("zombie_deleted");
                                        if(CLS502.MTH6934(s3, new String[]{"deleted"})) {
                                            goto label_48;
                                        }
                                        else {
                                            stringBuilder0 = new StringBuilder();
                                            stringBuilder0.append("skip zombie: ");
                                            stringBuilder0.append(s1);
                                            v2 = 4101478985680868149L;
                                            stringBuilder0.append(CLS370.MTH5289(v2));
                                            stringBuilder0.append(s);
                                            CLS27.MTH906(stringBuilder0.toString());
                                            break;
                                        }
                                        break;
                                    }
                                    case 0x10010406: {
                                        s4 = CLS27.MTH889("zombie_blacklist");
                                        if(CLS502.MTH6934(s3, new String[]{"blacklist"})) {
                                            goto label_48;
                                        }
                                        else {
                                            stringBuilder0 = new StringBuilder();
                                            stringBuilder0.append("skip zombie: ");
                                            stringBuilder0.append(s1);
                                            v2 = 4101478620608647989L;
                                            stringBuilder0.append(CLS370.MTH5289(v2));
                                            stringBuilder0.append(s);
                                            CLS27.MTH906(stringBuilder0.toString());
                                            break;
                                        }
                                        break;
                                    }
                                    case 0x10119C0B: {
                                        s4 = CLS27.MTH889("zombie_banned");
                                        if(!CLS502.MTH6934(s3, new String[]{"banned"})) {
                                            stringBuilder0 = new StringBuilder();
                                            stringBuilder0.append("skip zombie: ");
                                            stringBuilder0.append(s1);
                                            v2 = 0x38EB61382B3CD335L;
                                            stringBuilder0.append(CLS370.MTH5289(v2));
                                            stringBuilder0.append(s);
                                            CLS27.MTH906(stringBuilder0.toString());
                                            break;
                                        }
                                        goto label_48;
                                    }
                                    default: {
                                        goto label_48;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            CLS66.MTH1524(ᵔʾ0.MTH3205());
            ᵔʾ0.MTH3207(null);
        }
    }

    // 此方法包含解密的字符串
    private static void MTH2548(Object[] arr_object) {
        long v3;
        StringBuilder stringBuilder0;
        List list0 = (List)arr_object[0];
        if(list0 != null && !list0.isEmpty()) {
            String s = (String)list0.get(0);
            CLS167 ᵔʾ0 = new CLS167(arr_object[1]);
            int v = (int)(((Integer)ᵔʾ0.MTH3204()[1]));
            int v1 = (int)(((Integer)ᵔʾ0.MTH3204()[2]));
            int v2 = 3;
            String s1 = (String)ᵔʾ0.MTH3204()[3];
            CLS283 ʾˏ0 = CLS283.FLD2946;
            if(ʾˏ0.FLD2954) {
                CLS29 ˎᵢ0 = CLS27.MTH895();
                if(!CLS412.MTH6002()) {
                    v2 = 0;
                }
                if(ˎᵢ0.MTH927(v2, "scan_zombie_method") == 2) {
                    ArrayDeque arrayDeque0 = ʾˏ0.FLD2941;
                    if(!arrayDeque0.isEmpty()) {
                        String s2 = (String)arrayDeque0.peek();
                        if(!TextUtils.isEmpty(s2) && s.equals(s2) && CLS500.FLD4928.MTH6895("zombie_silent_search")) {
                            ʾˏ0.FLD2952.add(s);
                            arrayDeque0.poll();
                            ʾˏ0.MTH4698();
                            if(!CLS502.MTH6934(s1, new String[]{"操作过于频繁"})) {
                                String s3 = CLS27.MTH895().MTH925("detect_zombie_type", "");
                                String s4 = "";
                                if(v == 4) {
                                    switch(v1) {
                                        case -44: {
                                            s4 = CLS27.MTH889("zombie_deleted");
                                            if(!CLS502.MTH6934(s3, new String[]{"deleted"})) {
                                                stringBuilder0 = new StringBuilder();
                                                stringBuilder0.append("skip zombie: ");
                                                stringBuilder0.append(s);
                                                v3 = 4101480755207394101L;
                                                stringBuilder0.append(CLS370.MTH5289(v3));
                                                stringBuilder0.append(s1);
                                                CLS27.MTH906(stringBuilder0.toString());
                                                return;
                                            }
                                            break;
                                        }
                                        case -24: {
                                            s4 = CLS27.MTH889("zombie_banned");
                                            if(!CLS502.MTH6934(s3, new String[]{"banned"})) {
                                                stringBuilder0 = new StringBuilder();
                                                stringBuilder0.append("skip zombie: ");
                                                stringBuilder0.append(s);
                                                v3 = 4101480914121184053L;
                                                stringBuilder0.append(CLS370.MTH5289(v3));
                                                stringBuilder0.append(s1);
                                                CLS27.MTH906(stringBuilder0.toString());
                                                return;
                                            }
                                            break;
                                        }
                                        case -22: {
                                            s4 = CLS27.MTH889("zombie_blacklist");
                                            if(!CLS502.MTH6934(s3, new String[]{"blacklist"})) {
                                                stringBuilder0 = new StringBuilder();
                                                stringBuilder0.append("skip zombie: ");
                                                stringBuilder0.append(s);
                                                v3 = 4101481648560591669L;
                                                stringBuilder0.append(CLS370.MTH5289(v3));
                                                stringBuilder0.append(s1);
                                                CLS27.MTH906(stringBuilder0.toString());
                                                return;
                                            }
                                        }
                                    }
                                    CLS27.MTH906(("zombie found: " + s + " " + s1));
                                    ʾˏ0.MTH4696(s, s4);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


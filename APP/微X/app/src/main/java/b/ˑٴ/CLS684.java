// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS1;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS568;
import b.ʾᵢ.CLS574;
import b.ʾᵢ.CLS576;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS73;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS85;
import b.יᐧ.CLS147.CLS146;
import b.יᐧ.CLS147;
import b.יᐧ.CLS158;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS216;
import b.ᵔʾ.CLS1229;
import b.ᵔʾ.CLS1258;
import b.ᵔʾ.CLS283;
import b.ᵔʾ.CLS288;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412.CLS411;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS529;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;

public final class CLS684 implements CLS35 {
    public final int FLD762;
    public final CLS818 FLD763;

    public CLS684(CLS818 ᵎⁱ0, int v) {
        this.FLD762 = v;
        this.FLD763 = ᵎⁱ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        String s14;
        long v12;
        Object object13;
        Object object14;
        Object object11;
        Object object10;
        Object object7;
        Object object5;
        Activity activity0;
        Object object0 = null;
        int v = 1;
        CLS818 ᵎⁱ0 = this.FLD763;
        switch(this.FLD762) {
            case 0: {
                ᵎⁱ0.getClass();
                int v1 = (int)(((Integer)arr_object[0]));
                ArrayList arrayList0 = (ArrayList)arr_object[1];
                if(!arrayList0.isEmpty()) {
                    CLS851 ⁱᵢ0 = new CLS851(ᵎⁱ0, v1, arrayList0, 1);
                    CLS40.FLD157.MTH1124(((CLS39)ⁱᵢ0));
                }
                return;
            }
            case 1: {
                ᵎⁱ0.getClass();
                Object object1 = arr_object[0];
                int v2 = (int)(((Integer)arr_object[1]));
                int v3 = (int)(((Integer)arr_object[2]));
                boolean z = ((Boolean)arr_object[3]).booleanValue();
                CLS371 ʻ0 = ᵎⁱ0.FLD1444;
                if(!ᵎⁱ0.FLD1445.MTH938("accept_skip_contactinfoui", false)) {
                    ᵎⁱ0.FLD1233 = true;
                }
                try {
                    ArrayList arrayList1 = ʻ0.MTH5321(z);
                    if(arrayList1.size() == 0) {
                        activity0 = ((CLS140)ᵎⁱ0).MTH3042();
                        CLS412.MTH6014(activity0, CLS27.MTH889("no_request_found"));
                        return;
                    }
                    int v4 = Math.min(v2, arrayList1.size());
                    ArrayList arrayList2 = new ArrayList();
                    for(Object object2: arrayList1) {
                        ContentValues contentValues0 = (ContentValues)object2;
                        int v5 = (int)contentValues0.getAsInteger("sex");
                        String s = contentValues0.getAsString("talker");
                        if(!ʻ0.MTH5382(s) && (v3 == 3 || v5 == v3)) {
                            ContentValues contentValues1 = new ContentValues();
                            contentValues1.put("ticket", contentValues0.getAsString("ticket"));
                            contentValues1.put("scene", contentValues0.getAsInteger("scene"));
                            contentValues1.put("nickname", contentValues0.getAsString("nickname"));
                            contentValues1.put("username", s);
                            arrayList2.add(contentValues1);
                            if(v4 != -1) {
                                if(v4 == v) {
                                    break;
                                }
                                ++v;
                            }
                        }
                    }
                    if(arrayList2.size() == 0) {
                        activity0 = ((CLS140)ᵎⁱ0).MTH3042();
                        CLS412.MTH6014(activity0, CLS27.MTH889("no_request_found"));
                        return;
                    }
                    CLS568 יᐧ0 = new CLS568(ᵎⁱ0, arrayList2, 4);
                    int v6 = CLS412.MTH6005(3000, "mass_friend_acc_delay");
                    if(v6 != 0) {
                        CLS412.MTH6016(v6, arrayList2.size(), ((CLS411)new CLS576(((CLS12)יᐧ0), 7)), null);
                        return;
                    }
                label_54:
                    for(int v7 = 0; v7 < arrayList2.size(); ++v7) {
                        יᐧ0.MTH791(v7);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                    if(true) {
                        return;
                    }
                    goto label_54;
                }
                return;
            }
            case 2: {
                ᵎⁱ0.getClass();
                int v8 = (int)(((Integer)arr_object[0]));
                String s1 = (String)arr_object[1];
                ᵎⁱ0.FLD1445.MTH922(v8, "auto_remark_delay");
                ᵎⁱ0.FLD1445.MTH922(s1, "auto_remark_enable_text");
                if(!ᵎⁱ0.FLD1239) {
                    ᵎⁱ0.MTH2792();
                }
                return;
            }
            case 3: {
                ᵎⁱ0.FLD1229.put(((String)arr_object[0]), ((CLS1)arr_object[1]));
                return;
            }
            case 4: {
                ᵎⁱ0.getClass();
                String s2 = (String)arr_object[0];
                String s3 = (String)arr_object[1];
                if(s2.equals("avatar")) {
                    new CLS216(((CLS140)ᵎⁱ0).MTH3042()).MTH3842(s3, ᵎⁱ0.FLD1444.MTH5311(s3));
                }
                return;
            }
            case 5: {
                ᵎⁱ0.getClass();
                if(((String)arr_object[0]).equals("copy_userid")) {
                    String s4 = "";
                    String s5 = (String)arr_object[1];
                    if(CLS426.MTH6126(s5)) {
                        CLS404.MTH5910(((CLS140)ᵎⁱ0).MTH3042(), s5);
                        return;
                    }
                    if(arr_object.length > 2) {
                        s4 = (String)arr_object[2];
                    }
                    LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                    linkedHashMap0.put(CLS370.MTH5289((s5.endsWith("@stranger") ? 4101397334057603893L : 4101397303992832821L)) + s5, s5);
                    if(TextUtils.isEmpty(s4)) {
                        CLS371 ʻ1 = ᵎⁱ0.FLD1444;
                        if(ʻ1.MTH5382(s5)) {
                            s4 = ʻ1.MTH5350(s5);
                        }
                    }
                    if(!TextUtils.isEmpty(s4)) {
                        linkedHashMap0.put(String.format(CLS27.MTH889("alias"), s4), s4);
                    }
                    CLS523.MTH7136(false, ((CLS140)ᵎⁱ0).MTH3042(), CLS27.MTH889("view_id"), CLS27.MTH889("copy_wxid"), linkedHashMap0, true, ((CLS7)new CLS1229(18, ᵎⁱ0)), null, null, false);
                }
                return;
            }
            case 6: {
                ᵎⁱ0.getClass();
                if(((String)arr_object[0]).equals("config_contact")) {
                    CLS387.MTH5597(((CLS140)ᵎⁱ0).MTH3042());
                }
                return;
            }
            case 7: {
                ᵎⁱ0.getClass();
                JSONArray jSONArray0 = (JSONArray)arr_object[0];
                if(jSONArray0 != null && jSONArray0.length() != 0) {
                    CLS523.MTH7131(((CLS140)ᵎⁱ0).MTH3042(), CLS27.MTH889("filename"), CLS27.MTH889("exported_contacts"), ((CLS16)new CLS729(ᵎⁱ0, jSONArray0, 0)));
                }
                return;
            }
            case 8: {
                ᵎⁱ0.getClass();
                JSONArray jSONArray1 = (JSONArray)arr_object[0];
                if(jSONArray1 != null && jSONArray1.length() != 0) {
                    CLS523.MTH7131(((CLS140)ᵎⁱ0).MTH3042(), CLS27.MTH889("filename"), "nearby_users", ((CLS16)new CLS729(ᵎⁱ0, jSONArray1, 1)));
                }
                return;
            }
            case 9: {
                CLS31.MTH971(((CLS140)ᵎⁱ0).MTH3042(), ((CLS12)new CLS871(ᵎⁱ0, 0)));
                return;
            }
            case 10: {
                CLS31.MTH971(((CLS140)ᵎⁱ0).MTH3042(), ((CLS12)arr_object[0]));
                return;
            }
            case 11: {
                ᵎⁱ0.getClass();
                CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                Object object3 = ᵔʾ0.MTH3205();
                if(CLS412.MTH6009(((Activity)object3)).equals(CLS27.MTH897("AddMoreFriendsUI")) && ᵎⁱ0.FLD1447.FLD1438.MTH6895("wxid_friend_req")) {
                    try {
                        CLS166.MTH3195(ᵔʾ0.MTH3205(), "enableOptionMenu", new Object[]{Boolean.TRUE});
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                    CLS166.MTH3195(ᵔʾ0.MTH3205(), CLS27.MTH892("addTextOptionMenu", "a"), new Object[]{20000, CLS27.MTH889("send_friend_req"), new CLS529(ᵎⁱ0, ((Activity)object3), 1)});
                }
                return;
            }
            case 12: {
                ᵎⁱ0.getClass();
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
                if(CLS412.MTH6009(((Activity)object5)).endsWith("MobileFriendUI") && ᵎⁱ0.FLD1447.FLD1438.MTH6895("friend_request_phone")) {
                    if(object5 == null) {
                        try {
                            Field field1 = object4.getClass().getDeclaredField("thisObject");
                            if(field1 != null) {
                                field1.setAccessible(true);
                                object0 = field1.get(object4);
                            }
                        label_138:
                            object5 = object0;
                        }
                        catch(Throwable unused_ex) {
                            goto label_138;
                        }
                    }
                    CLS166.MTH3195(object5, CLS27.MTH892("addTextOptionMenu", "a"), new Object[]{20000, CLS27.MTH889("send_friend_req"), new CLS127(ᵎⁱ0, 0)});
                }
                return;
            }
            case 13: {
                ᵎⁱ0.getClass();
                ᵎⁱ0.MTH2795(((int)(((Integer)arr_object[0]))), ((int)(((Integer)arr_object[1]))));
                return;
            }
            case 14: {
                if(ᵎⁱ0.FLD1447.FLD1438.MTH6895("accept_neighbor_friendreq")) {
                    Object object6 = arr_object[0];
                    try {
                        Field field2 = object6.getClass().getDeclaredField("thisObject");
                        object7 = null;
                        if(field2 != null) {
                            field2.setAccessible(true);
                            object7 = field2.get(object6);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    if(CLS412.MTH6009(((Activity)object7)).endsWith("NearbySayHiListUI")) {
                        if(object7 == null) {
                            try {
                                Field field3 = object6.getClass().getDeclaredField("thisObject");
                                if(field3 != null) {
                                    field3.setAccessible(true);
                                    object0 = field3.get(object6);
                                }
                            label_157:
                                object7 = object0;
                            }
                            catch(Throwable unused_ex) {
                                goto label_157;
                            }
                        }
                        CLS166.MTH3195(object7, CLS27.MTH892("addTextOptionMenu", "a"), new Object[]{20000, CLS27.MTH889("accept_neighbor_friendreq_lbl"), new CLS127(ᵎⁱ0, 1)});
                    }
                }
                return;
            }
            case 15: {
                ᵎⁱ0.getClass();
                Object object8 = arr_object[0];
                try {
                    Field field4 = object8.getClass().getDeclaredField("thisObject");
                    if(field4 != null) {
                        field4.setAccessible(true);
                        object0 = field4.get(object8);
                    }
                }
                catch(Throwable unused_ex) {
                }
                if(CLS412.MTH6009(((Activity)object0)).equals(CLS27.MTH897("ContactInfoUI")) && ᵎⁱ0.FLD1233) {
                    ((Activity)object0).finish();
                }
                return;
            }
            case 16: {
                ᵎⁱ0.getClass();
                String s6 = (String)arr_object[2];
                ContentValues contentValues2 = (ContentValues)arr_object[3];
                if("rcontact".equalsIgnoreCase(s6)) {
                    String s7 = contentValues2.getAsString("username");
                    if(!TextUtils.isEmpty(s7) && !s7.startsWith("fake") && contentValues2.containsKey("type")) {
                        int v9 = CLS182.MTH3474(0x38EB32B12B3CD335L, contentValues2);
                        if(v9 != 0 && (v9 & 1) != 0 && !ᵎⁱ0.FLD1444.MTH5302(s7)) {
                            CLS21.FLD76.MTH818("fire_event_new_contact", new Object[]{s7});
                        }
                    }
                }
                return;
            }
            case 17: {
                ᵎⁱ0.getClass();
                String s8 = (String)arr_object[0];
                String s9 = (String)arr_object[1];
                if(s8.equals("delete_contact")) {
                    CLS523.MTH7142(((CLS140)ᵎⁱ0).MTH3042(), ((CLS11)new CLS811(ᵎⁱ0, s9)));
                }
                return;
            }
            case 18: {
                ᵎⁱ0.getClass();
                CLS29 ˎᵢ0 = ᵎⁱ0.FLD1445;
                if(ˎᵢ0.MTH938("fake_contacts_count_enable", false)) {
                    int v10 = ˎᵢ0.MTH927(0, "fake_contacts_count");
                    if(v10 != 0) {
                        Object object9 = arr_object[0];
                        if(CLS182.MTH3470(0x38EB2B052B3CD335L)) {
                            object10 = null;
                            object11 = null;
                        }
                        else {
                            try {
                                Field field5 = object9.getClass().getDeclaredField("thisObject");
                                object10 = null;
                                if(field5 != null) {
                                    field5.setAccessible(true);
                                    object10 = field5.get(object9);
                                }
                            }
                            catch(Throwable unused_ex) {
                            }
                            object11 = CLS182.MTH3492(0x38EB2B1E2B3CD335L, object10);
                        }
                        if(object11 == null) {
                            if(object10 == null) {
                                try {
                                    Field field6 = object9.getClass().getDeclaredField("thisObject");
                                    if(field6 != null) {
                                        field6.setAccessible(true);
                                        object0 = field6.get(object9);
                                    }
                                label_207:
                                    object10 = object0;
                                }
                                catch(Throwable unused_ex) {
                                    goto label_207;
                                }
                            }
                            object11 = CLS164.MTH3175(object10, "ContactCountView");
                        }
                        if(object11 != null) {
                            CLS166.MTH3195(object11, CLS27.MTH892("setFixedContactCountMethod", "setFixedContactCount"), new Object[]{v10});
                        }
                    }
                }
                return;
            }
            case 19: {
                ᵎⁱ0.getClass();
                CLS29 ˎᵢ1 = ᵎⁱ0.FLD1445;
                if(ˎᵢ1.MTH938("fake_contacts_count_enable", false)) {
                    int v11 = ˎᵢ1.MTH927(0, "fake_contacts_count");
                    if(v11 != 0) {
                        Object object12 = arr_object[0];
                        if(CLS182.MTH3470(4101418100224480053L)) {
                            try {
                                Field field8 = object12.getClass().getDeclaredField("thisObject");
                                object14 = null;
                                if(field8 != null) {
                                    field8.setAccessible(true);
                                    object14 = field8.get(object12);
                                }
                            }
                            catch(Throwable unused_ex) {
                            }
                            object13 = CLS182.MTH3492(0x38EB2AC02B3CD335L, object14);
                            v12 = 4101419010757546805L;
                        }
                        else {
                            try {
                                Field field7 = object12.getClass().getDeclaredField("thisObject");
                                object13 = null;
                                if(field7 != null) {
                                    field7.setAccessible(true);
                                    object13 = field7.get(object12);
                                }
                            }
                            catch(Throwable unused_ex) {
                            }
                            v12 = 4101418220483564341L;
                        }
                        Object object15 = CLS182.MTH3492(v12, object13);
                        if(object15 != null) {
                            if(!CLS182.MTH3470(4101419131016631093L)) {
                                object0 = CLS182.MTH3492(4101418688634999605L, object15);
                            }
                            if(object0 == null) {
                                object0 = CLS164.MTH3175(object15, "ContactCountView");
                            }
                            if(object0 != null) {
                                CLS166.MTH3195(object0, CLS27.MTH897("setFixedContactCountMethod"), new Object[]{v11});
                            }
                        }
                    }
                }
                return;
            }
            case 20: {
                ᵎⁱ0.getClass();
                CLS29 ˎᵢ2 = ᵎⁱ0.FLD1445;
                if(ˎᵢ2.MTH938("auto_req_new_member", false) && ᵎⁱ0.FLD1447.FLD1438.MTH6895("auto_friendreq")) {
                    String s10 = ˎᵢ2.MTH925("auto_req_new_member_list", "");
                    if(!TextUtils.isEmpty(s10)) {
                        String s11 = (String)arr_object[0];
                        String s12 = (String)arr_object[1];
                        if(CLS502.MTH6934(s10, new String[]{s11}) && (!CLS371.FLD3470.MTH5382(s12) && !CLS288.FLD2989.MTH4730(s12) && (!CLS27.MTH895().MTH938("chatroom_friend_req_excl_owner", false) || !CLS371.FLD3470.MTH5343(s11).equals(s12)) && (!CLS27.MTH895().MTH938("chatroom_friend_req_excl_mod", false) || !CLS66.MTH1383(s11, s12)))) {
                            int v13 = ˎᵢ2.MTH927(-1, "auto_req_new_member_sextype");
                            CLS147 ˆٴ0 = new CLS147();
                            CLS146 ˆٴ$ˆٴ0 = new CLS146(((CLS3)new CLS574(1, s12, s11)));
                            ˆٴ0.FLD1537.addLast(ˆٴ$ˆٴ0);
                            CLS146 ˆٴ$ˆٴ1 = new CLS146(((CLS3)new CLS736(ᵎⁱ0, v13, s12, s11, 0)));
                            ˆٴ0.FLD1537.addLast(ˆٴ$ˆٴ1);
                            ˆٴ0.MTH3130();
                        }
                    }
                }
                return;
            }
            case 21: {
                ᵎⁱ0.getClass();
                Object object16 = arr_object[0];
                String s13 = (String)arr_object[2];
                ContentValues contentValues3 = (ContentValues)arr_object[3];
                CLS158 ⁱʾ0 = ᵎⁱ0.FLD1224;
                try {
                    if("fmessage_msginfo".equalsIgnoreCase(s13)) {
                        s14 = contentValues3.getAsString("talker");
                        if(!CLS372.MTH5406(s14)) {
                            boolean z1 = ᵎⁱ0.FLD1447.FLD1438.MTH6895("auto_disable_verification");
                            CLS29 ˎᵢ3 = ᵎⁱ0.FLD1445;
                            if(z1 && (ˎᵢ3.MTH938("auto_disable_verification", false) && CLS66.MTH1497())) {
                                int v14 = ˎᵢ3.MTH927(0, "nca3_cnt");
                                ˎᵢ3.MTH922(((int)(v14 + 1)), "nca3_cnt");
                                int v15 = ˎᵢ3.MTH927(0, "nca3_cnt_max");
                                if(v15 != 0 && v14 + 1 >= v15) {
                                    goto label_273;
                                }
                            }
                            goto label_278;
                        }
                    }
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                goto label_297;
                try {
                label_273:
                    if(CLS66.MTH1497()) {
                        CLS66.MTH1360(false);
                    }
                    goto label_278;
                }
                catch(Throwable throwable3) {
                    try {
                        CLS27.MTH893(throwable3);
                    label_278:
                        if(ˎᵢ3.MTH938("auto_accept_req_enable", false)) {
                            String s15 = contentValues3.getAsString("msgContent");
                            String s16 = s15.substring(s15.indexOf("ticket") + 8);
                            String s17 = s15.substring(s15.indexOf("scene") + 7);
                            ContentValues contentValues4 = new ContentValues();
                            contentValues4.put("talker", s14);
                            contentValues4.put("ticket", s16.substring(0, s16.indexOf("\"")));
                            contentValues4.put("scene", Integer.valueOf(s17.substring(0, s17.indexOf("\""))));
                            int v16 = CLS412.MTH6005(15000, "auto_accept_friend_delay");
                            ⁱʾ0.MTH3150(contentValues4);
                            ⁱʾ0.MTH3156(((long)v16));
                            ⁱʾ0.MTH3149(((long)v16));
                            goto label_294;
                        }
                        goto label_297;
                    }
                    catch(Throwable throwable2) {
                    }
                }
                CLS27.MTH893(throwable2);
                goto label_297;
                try {
                label_294:
                    Method method0 = object16.getClass().getDeclaredMethod("setResult", Object.class);
                    method0.setAccessible(true);
                    method0.invoke(object16, -1L);
                }
                catch(Throwable unused_ex) {
                }
            label_297:
                if("chatroom".equalsIgnoreCase(s13)) {
                    String s18 = contentValues3.getAsString("chatroomname");
                    String s19 = contentValues3.getAsString("roomowner");
                    if(!CLS27.MTH904().equals(s19) && !ᵎⁱ0.FLD1444.MTH5383(s18)) {
                        CLS73 ˈˊ0 = ᵎⁱ0.FLD1236;
                        if(!ˈˊ0.MTH1579(s18)) {
                            ˈˊ0.MTH1578(s18);
                            CLS1258 ⁱˏ0 = new CLS1258(5, s18);
                            CLS40.FLD157.MTH1123(((CLS39)ⁱˏ0), 1000L);
                        }
                    }
                }
                return;
            }
            case 22: {
                CLS139 ﹶʼ0 = ᵎⁱ0.FLD1447;
                if(!ﹶʼ0.FLD1410) {
                    String s20 = (String)arr_object[2];
                    ContentValues contentValues5 = (ContentValues)arr_object[3];
                    CLS158 ⁱʾ1 = ᵎⁱ0.FLD1224;
                    boolean z2 = CLS27.MTH901();
                    CLS371 ʻ2 = ᵎⁱ0.FLD1444;
                    CLS29 ˎᵢ4 = ᵎⁱ0.FLD1445;
                    if(!z2) {
                        try {
                            if("LBSVerifyMessage".equalsIgnoreCase(s20) && ˎᵢ4.MTH938("auto_accept_neighbor_req", false) && ﹶʼ0.FLD1438.MTH6895("auto_accept_neighbor_req")) {
                                String s21 = contentValues5.getAsString("sayhiuser");
                                if(!ʻ2.MTH5382(s21)) {
                                    ContentValues contentValues6 = new ContentValues();
                                    contentValues6.put("talker", s21);
                                    contentValues6.put("ticket", contentValues5.getAsString("ticket"));
                                    contentValues6.put("scene", 18);
                                    int v17 = CLS412.MTH6005(15000, "auto_accept_friend_delay");
                                    ⁱʾ1.MTH3150(contentValues6);
                                    ⁱʾ1.MTH3156(((long)v17));
                                    ⁱʾ1.MTH3149(((long)v17));
                                }
                            }
                        }
                        catch(Throwable throwable4) {
                            CLS27.MTH893(throwable4);
                        }
                    }
                    if("message".equalsIgnoreCase(s20)) {
                        boolean z3 = ˎᵢ4.MTH938("reply_on_accept", false);
                        Pattern pattern0 = ᵎⁱ0.FLD1244;
                        if(z3 && (contentValues5.containsKey("talker") || contentValues5.containsKey("status") || contentValues5.containsKey("type"))) {
                            String s22 = contentValues5.getAsString("talker");
                            if(!CLS426.MTH6126(s22) && ((contentValues5.containsKey("status") ? CLS182.MTH3474(0x38EB3F792B3CD335L, contentValues5) : 0) == 3 && CLS182.MTH3474(0x38EB3F002B3CD335L, contentValues5) == 1)) {
                                String s23 = contentValues5.getAsString("content");
                                if(!TextUtils.isEmpty(s23) && CLS502.MTH6935(pattern0, s23)) {
                                    CLS73 ˈˊ1 = ᵎⁱ0.FLD1232;
                                    if(!ˈˊ1.MTH1579(s22)) {
                                        ˈˊ1.MTH1578(s22);
                                        CLS827 ᵔᐧ0 = new CLS827(ᵎⁱ0, s22, 0);
                                        long v18 = (long)CLS404.MTH5913("_FRIEND_ACCEPT_");
                                        CLS40.FLD157.MTH1123(((CLS39)ᵔᐧ0), v18);
                                    }
                                }
                            }
                        }
                        int v19 = CLS182.MTH3474(0x38EB334D2B3CD335L, contentValues5);
                        if(v19 == 1 || v19 == 10000 || v19 == 0x22000031) {
                            int v20 = contentValues5.containsKey("isSend") ? CLS182.MTH3474(4101428343721481013L, contentValues5) : 0;
                            String s24 = contentValues5.getAsString("talker");
                            String s25 = contentValues5.getAsString("content");
                            if(v19 != 10000 && v19 != 0x22000031) {
                                if(v20 == 0 && !CLS426.MTH6126(s24) && !ʻ2.MTH5302(s24) && CLS502.MTH6935(pattern0, s25)) {
                                    CLS21.FLD76.MTH818("fire_event_new_contact", new Object[]{s24});
                                    return;
                                }
                            }
                            else if(CLS426.MTH6126(s24)) {
                                if(CLS502.MTH6935(ᵎⁱ0.FLD1226, s25)) {
                                    CLS73 ˈˊ2 = ᵎⁱ0.FLD1236;
                                    if(!ˈˊ2.MTH1579(s24)) {
                                        ˈˊ2.MTH1578(s24);
                                        CLS21.FLD76.MTH818("new_chatroom", new Object[]{s24});
                                        return;
                                    }
                                }
                            }
                            else if(CLS502.MTH6935(ᵎⁱ0.FLD1231, s25)) {
                                CLS21.FLD76.MTH818("fire_event_new_contact", new Object[]{s24});
                            }
                        }
                    }
                }
                return;
            }
            case 23: {
                this.MTH2240(arr_object);
                return;
            }
            case 24: {
                this.MTH2239();
                return;
            }
            case 25: {
                this.MTH2241(arr_object);
                return;
            }
            case 26: {
                this.MTH2238(arr_object);
                return;
            }
            case 27: {
                ᵎⁱ0.getClass();
                int v21 = (int)(((Integer)arr_object[0]));
                ArrayList arrayList3 = (ArrayList)arr_object[1];
                if(!arrayList3.isEmpty()) {
                    CLS851 ⁱᵢ1 = new CLS851(ᵎⁱ0, v21, arrayList3, 0);
                    CLS40.FLD157.MTH1124(((CLS39)ⁱᵢ1));
                }
                return;
            }
            case 28: {
                this.MTH2243(arr_object);
                return;
            }
            default: {
                this.MTH2242(arr_object);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2238(Object[] arr_object) {
        CLS818 ᵎⁱ0 = this.FLD763;
        ᵎⁱ0.getClass();
        int v = (int)(((Integer)arr_object[0]));
        String s = (String)arr_object[1];
        int v1 = (int)(((Integer)arr_object[2]));
        ArrayList arrayList0 = new ArrayList();
        ᵎⁱ0.FLD1444.MTH5349(s, arrayList0);
        if(!arrayList0.isEmpty()) {
            if(CLS27.MTH895().MTH938("chatroom_friend_req_excl_owner", false)) {
                String s1 = CLS371.FLD3470.MTH5343(s);
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    if(s1.equals("")) {
                        iterator0.remove();
                    }
                }
            }
            if(CLS27.MTH895().MTH938("chatroom_friend_req_excl_mod", false)) {
                Iterator iterator1 = arrayList0.iterator();
                while(iterator1.hasNext()) {
                    iterator1.next();
                    if(CLS66.MTH1383(s, "")) {
                        iterator1.remove();
                    }
                }
            }
            CLS759 ـˏ0 = new CLS759(ᵎⁱ0, v, arrayList0, v1, s);
            CLS40.FLD157.MTH1124(((CLS39)ـˏ0));
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2239() {
        this.FLD763.FLD1233 = false;
        CLS288 ˈˊ0 = CLS288.FLD2989;
        if(ˈˊ0.FLD2977 && !ˈˊ0.FLD2975 && !ˈˊ0.MTH4726() && ˈˊ0.FLD2986 != 0L && System.currentTimeMillis() - ˈˊ0.FLD2986 >= ((long)(CLS412.MTH6005(25000, "friend_request_delay") + 300000))) {
            int v = CLS27.MTH895().MTH927(0, "friendreq_max_break");
            if(v <= 0 || CLS288.MTH4746() % v != 0) {
            label_8:
                CLS85 ـˏ0 = ˈˊ0.MTH4736();
                if(ـˏ0 != null && !ـˏ0.FLD332) {
                    ˈˊ0.MTH4741(ˈˊ0.MTH4736());
                }
            }
            else {
                long v1 = System.currentTimeMillis() - ˈˊ0.FLD2986;
                int v2 = CLS412.MTH6005(1800000, "friendreq_max_break_delay");
                if(v1 >= ((long)(CLS412.MTH6005(25000, "friend_request_delay") + v2 + 300000))) {
                    goto label_8;
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2240(Object[] arr_object) {
        CLS818 ᵎⁱ0 = this.FLD763;
        ᵎⁱ0.getClass();
        String s = (String)arr_object[0];
        CLS29 ˎᵢ0 = ᵎⁱ0.FLD1445;
        if(!CLS283.FLD2946.FLD2943 || ˎᵢ0.MTH927((CLS412.MTH6002() ? 3 : 0), "scan_zombie_method") != 2) {
            if(ˎᵢ0.MTH938("no_confirmation_autoremark", false)) {
                CLS827 ᵔᐧ0 = new CLS827(ᵎⁱ0, s, 2);
                CLS40.FLD157.MTH1123(((CLS39)ᵔᐧ0), 5000L);
            }
            if(ˎᵢ0.MTH938("no_confirmation_accept_reply", false)) {
                CLS73 ˈˊ0 = ᵎⁱ0.FLD1232;
                if(!ˈˊ0.MTH1579(s)) {
                    ˈˊ0.MTH1578(s);
                    new String("_FRIEND_ACCEPT_");
                    CLS827 ᵔᐧ1 = new CLS827(ᵎⁱ0, s, 3);
                    int v = CLS404.MTH5913("_FRIEND_ACCEPT_");
                    CLS40.FLD157.MTH1123(((CLS39)ᵔᐧ1), ((long)Math.max(v, 10000)));
                }
            }
            boolean z = ᵎⁱ0.FLD1447.FLD1407.MTH5947("nca2");
            CLS500 ᵢﹶ0 = ᵎⁱ0.FLD1447.FLD1438;
            if(!z && ˎᵢ0.MTH938("nca2", false) && ᵢﹶ0.MTH6895("no_confirmation_accept") && !CLS66.MTH1497()) {
                int v1 = CLS412.MTH6005(15000, "auto_accept_friend_delay");
                ᵎⁱ0.FLD1220.MTH3150(s);
                ᵎⁱ0.FLD1220.MTH3156(((long)v1));
                ᵎⁱ0.FLD1220.MTH3149(((long)v1));
            }
            ᵎⁱ0.MTH2790(s);
            if(ˎᵢ0.MTH938("auto_remark_new_contact", false) && ᵢﹶ0.MTH6895("auto_remark_new_contact") && !CLS372.MTH5410(s)) {
                CLS827 ᵔᐧ2 = new CLS827(ᵎⁱ0, s, 4);
                CLS40.FLD157.MTH1123(((CLS39)ᵔᐧ2), 30000L);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2241(Object[] arr_object) {
        int v6;
        CLS831 ᵔⁱ0;
        Activity activity0;
        CLS818 ᵎⁱ0 = this.FLD763;
        ᵎⁱ0.getClass();
        if(ᵎⁱ0.FLD1445.MTH938("nearby_friendreq_manual", false)) {
            int v = (int)(((Integer)arr_object[0]));
            int v1 = (int)(((Integer)arr_object[1]));
            if(ᵎⁱ0.FLD1222 != null) {
                Object object0 = ᵎⁱ0.FLD1245;
                if(object0 != null) {
                    if(ᵎⁱ0.FLD1235 == null) {
                        ᵎⁱ0.FLD1235 = CLS164.MTH3174(object0, "onItemClick", Void.TYPE, new Object[]{AdapterView.class, View.class, Integer.TYPE, Long.TYPE});
                    }
                    ᵎⁱ0.FLD1227 = true;
                    CLS158 ⁱʾ0 = ᵎⁱ0.FLD1234;
                    if(ⁱʾ0.FLD1562) {
                        activity0 = ((CLS140)ᵎⁱ0).MTH3042();
                        ᵔⁱ0 = new CLS831(ᵎⁱ0);
                        goto label_48;
                    }
                    CLS412.MTH6014(((CLS140)ᵎⁱ0).MTH3042(), CLS27.MTH889("start_friend_request"));
                    ListAdapter listAdapter0 = ᵎⁱ0.FLD1222.getAdapter();
                    int v2 = Math.min(v, listAdapter0.getCount() - 1);
                    String s = CLS27.MTH895().MTH925("nearby_friend_req_excl", "");
                    int v3 = 1;
                    int v4 = 1;
                    while(v3 < listAdapter0.getCount()) {
                        Object object1 = listAdapter0.getItem(v3);
                        int v5 = CLS166.MTH3181(object1, CLS27.MTH897("nearbyFieldSex"));
                        String s1 = (String)CLS182.MTH3492(4101426398101295925L, object1);
                        if(CLS502.MTH6934(s, new String[]{s1}) || (v1 != -1 && v1 != v5 || ᵎⁱ0.FLD1223.contains(s1) || ᵎⁱ0.FLD1444.MTH5382(s1))) {
                            v6 = v1;
                        }
                        else {
                            ContentValues contentValues0 = new ContentValues();
                            v6 = v1;
                            contentValues0.put(CLS182.MTH3496(4101426484000641845L, contentValues0, s1, 4101426522655347509L), ((String)CLS182.MTH3492(4101426561310053173L, object1)));
                            contentValues0.put("position", v3);
                            if(v2 != -1) {
                                if(v2 == v4) {
                                    break;
                                }
                                ++v4;
                            }
                            int v7 = CLS412.MTH6005(25000, "friend_request_delay");
                            ᵎⁱ0.FLD1240 = v7;
                            int v8 = CLS412.MTH6015(CLS412.MTH6007(3000, v7, v7 - 5000), ᵎⁱ0.FLD1240 + 10000);
                            ⁱʾ0.MTH3150(contentValues0);
                            ⁱʾ0.MTH3156(((long)v8));
                            ⁱʾ0.MTH3149(((long)v8));
                        }
                        ++v3;
                        v1 = v6;
                    }
                    if(ⁱʾ0.FLD1562 || ᵎⁱ0.FLD1227) {
                        activity0 = ((CLS140)ᵎⁱ0).MTH3042();
                        ᵔⁱ0 = new CLS733(ᵎⁱ0);
                    label_48:
                        if(CLS387.FLD3648 != null && CLS387.FLD3648.isShowing()) {
                            CLS387.FLD3648.dismiss();
                        }
                        CLS387.FLD3648 = CLS523.MTH7160(activity0, null, ((CLS17)new CLS796(activity0, 2)), ((CLS11)ᵔⁱ0));
                    }
                }
            }
        }
        else {
            int v9 = (int)(((Integer)arr_object[0]));
            int v10 = (int)(((Integer)arr_object[1]));
            if(!ᵎⁱ0.FLD1243.isEmpty()) {
                CLS735 ˑˊ0 = new CLS735(ᵎⁱ0, v9, v10, 0);
                CLS40.FLD157.MTH1124(((CLS39)ˑˊ0));
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2242(Object[] arr_object) {
        CLS818 ᵎⁱ0 = this.FLD763;
        ᵎⁱ0.getClass();
        String s = (String)arr_object[0];
        String s1 = (String)arr_object[1];
        switch(s) {
            case "contact_tags": {
                CLS387.MTH5597(((CLS140)ᵎⁱ0).MTH3042());
                return;
            }
            case "send_multple_friendcard": {
                ArrayList arrayList0 = new ArrayList();
                String s2 = CLS27.MTH904();
                ᵎⁱ0.FLD1444.MTH5381(s2, arrayList0);
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    CLS78 ˊﾞ0 = (CLS78)object0;
                    if(CLS372.MTH5406("")) {
                        iterator0.remove();
                    }
                    else if(CLS426.MTH6126("")) {
                        ˊﾞ0.FLD275 = "" + " (" + CLS371.FLD3470.MTH5369("") + ")";
                    }
                }
                CLS387.MTH5585(false, ((CLS140)ᵎⁱ0).MTH3042(), arrayList0, ((CLS2)new CLS723(ᵎⁱ0, s1)), null, -1);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2243(Object[] arr_object) {
        Bitmap bitmap1;
        int v2;
        int v1;
        CLS818 ᵎⁱ0 = this.FLD763;
        ᵎⁱ0.getClass();
        CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
        try {
            String s = (String)ᵔʾ0.MTH3204()[0];
            if(s.startsWith("key_")) {
                s = s.substring(4);
                int v = s.indexOf("_0");
                if(v != -1) {
                    s = s.substring(0, v);
                }
            }
            if(ᵎⁱ0.FLD1445.MTH938(s + "_custom_avatar_enable", false)) {
                Bitmap bitmap0 = (Bitmap)ᵔʾ0.MTH3206();
                if(bitmap0 == null) {
                    v1 = 0x60;
                    v2 = 0x60;
                }
                else {
                    v1 = bitmap0.getWidth();
                    v2 = bitmap0.getHeight();
                }
                bitmap1 = CLS372.MTH5402(v1, v2, s);
                if(bitmap1 == null || bitmap1.isRecycled()) {
                    bitmap1 = null;
                }
            }
            else {
                bitmap1 = null;
            }
            if(bitmap1 != null) {
                ᵔʾ0.MTH3207(bitmap1);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}


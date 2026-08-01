// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.ListView;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS1;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS71;
import b.ˈˈ.CLS85.CLS83;
import b.ˈˈ.CLS85.CLS84;
import b.ˈˈ.CLS85;
import b.ˈˈ.CLS91;
import b.ˈˊ.CLS600;
import b.ˈˊ.CLS99;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1229;
import b.ᵔʾ.CLS1247;
import b.ᵔʾ.CLS1262;
import b.ᵔʾ.CLS288;
import b.ᵔʾ.CLS305;
import b.ᵔʾ.CLS309;
import b.ⁱʾ.CLS1274;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ﾞˎ.CLS1627;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class CLS666 implements CLS35 {
    public final int FLD693;
    public final CLS818 FLD694;

    public CLS666(CLS818 ᵎⁱ0, int v) {
        this.FLD693 = v;
        this.FLD694 = ᵎⁱ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        Activity activity0;
        Object object13;
        Object object2;
        String s;
        CLS305 ᵢʾ0 = CLS305.FLD3177;
        Object object0 = null;
        CLS818 ᵎⁱ0 = this.FLD694;
        switch(this.FLD693) {
            case 0: {
                ᵎⁱ0.getClass();
                Object object1 = arr_object[0];
                if(ᵎⁱ0.FLD1447.FLD1438.MTH6895("auto_friendreq") && ᵎⁱ0.FLD1445.MTH938("contact_nearby_enable2", false)) {
                    try {
                        s = CLS27.MTH892("addTextOptionMenu", "a");
                    }
                    catch(Throwable throwable0) {
                        object2 = null;
                        goto label_22;
                    }
                    try {
                        Field field0 = object1.getClass().getDeclaredField("thisObject");
                        object2 = null;
                        if(field0 != null) {
                            field0.setAccessible(true);
                            object2 = field0.get(object1);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    try {
                        CLS166.MTH3195(object2, s, new Object[]{1, CLS27.MTH889("send_friend_req"), new CLS127(ᵎⁱ0, 2)});
                        goto label_23;
                    }
                    catch(Throwable throwable0) {
                    }
                label_22:
                    CLS27.MTH893(throwable0);
                label_23:
                    if(object2 == null) {
                        try {
                            Field field1 = object1.getClass().getDeclaredField("thisObject");
                            if(field1 != null) {
                                field1.setAccessible(true);
                                object0 = field1.get(object1);
                            }
                            object2 = object0;
                        }
                        catch(Throwable unused_ex) {
                            object2 = object0;
                            ᵎⁱ0.FLD1222 = (ListView)CLS164.MTH3175(object2, "ListView");
                            return;
                        }
                    }
                    ᵎⁱ0.FLD1222 = (ListView)CLS164.MTH3175(object2, "ListView");
                }
                return;
            }
            case 1: {
                CLS29 ˎᵢ0 = ᵎⁱ0.FLD1445;
                CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                try {
                    if(((int)(((Integer)ᵔʾ0.MTH3204()[1]))) == 0 && ((int)(((Integer)ᵔʾ0.MTH3204()[2]))) == 0) {
                        if(ᵎⁱ0.FLD1447.FLD1438.MTH6895("f_auto_remark") && ˎᵢ0.MTH938("auto_remark_enable", false) && !ᵎⁱ0.FLD1230.isEmpty()) {
                            String s1 = (String)ᵎⁱ0.FLD1230.get(0);
                            if(ᵎⁱ0.FLD1239) {
                                String s2 = ˎᵢ0.MTH925("auto_remark_list_temp", "");
                                if(!s2.contains(s1)) {
                                    ˎᵢ0.MTH922(s1 + "," + s2, "auto_remark_list_temp");
                                }
                            }
                            else {
                                ArrayDeque arrayDeque0 = ᵎⁱ0.FLD1241;
                                if(!arrayDeque0.contains(s1)) {
                                    arrayDeque0.add(s1);
                                    ˎᵢ0.MTH922(TextUtils.join(",", arrayDeque0), "auto_remark_list");
                                    ᵎⁱ0.MTH2792();
                                }
                            }
                        }
                        if(ᵎⁱ0.FLD1230 != null && !ᵎⁱ0.FLD1230.isEmpty()) {
                            for(Object object3: ᵎⁱ0.FLD1230) {
                                String s3 = (String)object3;
                                HashMap hashMap0 = ᵎⁱ0.FLD1229;
                                if(hashMap0.containsKey(s3)) {
                                    CLS1 ʾᵢ0 = (CLS1)hashMap0.get(s3);
                                    hashMap0.remove(s3);
                                    if(ʾᵢ0 != null) {
                                        ʾᵢ0.MTH771();
                                    }
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
            case 2: {
                ᵎⁱ0.getClass();
                CLS167 ᵔʾ1 = new CLS167(arr_object[0]);
                CLS29 ˎᵢ1 = ᵎⁱ0.FLD1445;
                if(ˎᵢ1.MTH938("accept_skip_contactinfoui", false)) {
                    ᵎⁱ0.FLD1233 = true;
                }
                String s4 = CLS27.MTH892("addTextOptionMenu", "a");
                CLS71 ˆٴ0 = new CLS71(((CLS140)ᵎⁱ0).MTH3042(), CLS404.MTH5899());
                if(ˎᵢ1.MTH938("accept_all_req_enable", false)) {
                    ˆٴ0.MTH1572("mass_accept", ((CLS3)new CLS1274(ᵎⁱ0, ᵔʾ1, 12)));
                }
                if(ˎᵢ1.MTH938("auto_remark_enable", false)) {
                    ˆٴ0.MTH1572("auto_remark_enable", ((CLS3)new CLS1627(3, ᵎⁱ0)));
                }
                if(!ˆٴ0.FLD238.isEmpty()) {
                    try {
                        CLS166.MTH3195(ᵔʾ1.MTH3205(), s4, new Object[]{1, "...", new CLS134(0, ˆٴ0)});
                        return;
                    }
                    catch(Throwable throwable2) {
                        CLS27.MTH893(throwable2);
                    }
                }
                return;
            }
            case 3: {
                ᵎⁱ0.getClass();
                CLS167 ᵔʾ2 = new CLS167(arr_object[0]);
                if(!CLS182.MTH3470(4101415329970574133L) && ᵎⁱ0.FLD1445.MTH938("disable_accept_notification", false)) {
                    try {
                        if(CLS166.MTH3181(CLS166.MTH3194(ᵔʾ2.MTH3204()[0], CLS27.MTH897("friendRequestAcceptNotificationField1")), "type") == 1) {
                            ᵔʾ2.MTH3207(Boolean.TRUE);
                            return;
                        }
                    }
                    catch(Throwable throwable3) {
                        CLS27.MTH893(throwable3);
                    }
                }
                return;
            }
            case 4: {
                ᵎⁱ0.getClass();
                if(CLS27.MTH895().MTH938("auto_shake_friend_finder_enable", false) && ᵎⁱ0.FLD1447.FLD1438.MTH6895("auto_shake_friend_finder")) {
                    CLS167 ᵔʾ3 = new CLS167(arr_object[0]);
                    if(CLS166.MTH3182(ᵔʾ3.MTH3205(), "wx") != null) {
                        CLS166.MTH3193(ᵔʾ3.MTH3205(), "wx");
                        if(((int)(((Integer)ᵔʾ3.MTH3204()[1]))) == 0 && ((int)(((Integer)ᵔʾ3.MTH3204()[2]))) == 0) {
                            object0 = (byte[])CLS182.MTH3492(0x38EB27E62B3CD335L, ᵔʾ3.MTH3205());
                        }
                        if(object0 == null) {
                            ᵢʾ0.MTH4915();
                            return;
                        }
                        Object object4 = CLS166.MTH3188(CLS27.MTH894("shakeGetClass"), new Object[]{object0});
                        CLS166.MTH3199(object4, "wx", Boolean.TRUE);
                        CLS66.MTH1521(object4);
                    }
                }
                return;
            }
            case 5: {
                ᵎⁱ0.getClass();
                if(CLS27.MTH895().MTH938("auto_shake_friend_finder_enable", false) && ᵎⁱ0.FLD1447.FLD1438.MTH6895("auto_shake_friend_finder")) {
                    CLS167 ᵔʾ4 = new CLS167(arr_object[0]);
                    if(CLS166.MTH3182(ᵔʾ4.MTH3205(), "wx") != null) {
                        CLS166.MTH3193(ᵔʾ4.MTH3205(), "wx");
                        if(((int)(((Integer)ᵔʾ4.MTH3204()[1]))) == 0 && ((int)(((Integer)ᵔʾ4.MTH3204()[2]))) == 0) {
                            object0 = (LinkedList)CLS182.MTH3492(0x38EB270D2B3CD335L, ᵔʾ4.MTH3205());
                        }
                        if(object0 != null && !((AbstractCollection)object0).isEmpty()) {
                            int v = CLS27.MTH895().MTH927(-1, "auto_shake_friend_sextype");
                            for(Object object5: ((AbstractCollection)object0)) {
                                String s5 = (String)CLS166.MTH3194(object5, "field_username");
                                String s6 = (String)CLS166.MTH3194(object5, "field_nickname");
                                if(v == -1 || v == CLS166.MTH3181(object5, "field_sex")) {
                                    CLS85 ـˏ0 = new CLS85(s5, s6, "shake");
                                    ـˏ0.FLD330 = CLS83.FLD324;
                                    CLS288.FLD2989.MTH4731(ـˏ0);
                                    --ᵢʾ0.FLD3176;
                                }
                            }
                            CLS288.FLD2989.MTH4734();
                            if(ᵢʾ0.FLD3176 > 0) {
                                CLS1229 ˆٴ1 = new CLS1229(4, ᵢʾ0);
                                long v1 = (long)CLS412.MTH6005(1000, "auto_shake_delay");
                                CLS40.FLD157.MTH1123(((CLS39)ˆٴ1), v1);
                                return;
                            }
                            CLS412.MTH6011(CLS27.MTH889("auto_shake_friendfinder_finished"));
                            return;
                        }
                        ᵢʾ0.MTH4915();
                    }
                }
                return;
            }
            case 6: {
                ᵎⁱ0.getClass();
                Object object6 = arr_object[0];
                if(ᵎⁱ0.FLD1447.FLD1438.MTH6895("auto_friendreq") && ᵎⁱ0.FLD1445.MTH938("contact_nearby_enable2", false)) {
                    try {
                        Field field2 = object6.getClass().getDeclaredField("args");
                        if(field2 != null) {
                            field2.setAccessible(true);
                            object0 = field2.get(object6);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    CLS166.MTH3195(((Object[])object0)[0], CLS27.MTH897("recordSightMethod2"), new Object[]{20000, CLS27.MTH889("send_friend_req")});
                }
                return;
            }
            case 7: {
                ᵎⁱ0.getClass();
                Object object7 = arr_object[0];
                if(ᵎⁱ0.FLD1447.FLD1438.MTH6895("auto_friendreq") && ᵎⁱ0.FLD1445.MTH938("contact_nearby_enable2", false)) {
                    try {
                        Field field3 = object7.getClass().getDeclaredField("args");
                        if(field3 != null) {
                            field3.setAccessible(true);
                            object0 = field3.get(object7);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    if(((MenuItem)((Object[])object0)[0]).getItemId() == 20000) {
                        if(!CLS412.MTH6002() && !CLS27.MTH895().MTH938("add_contacts_warn_disable", false)) {
                            CLS395.MTH5745(((CLS140)ᵎⁱ0).MTH3042(), ((CLS11)new CLS790(ᵎⁱ0)), CLS27.MTH889("add_contacts_disclaimer"), "add_contacts_warn_disable");
                            return;
                        }
                        CLS387.MTH5598(((CLS140)ᵎⁱ0).MTH3042());
                    }
                }
                return;
            }
            case 8: {
                ᵎⁱ0.getClass();
                Object object8 = arr_object[0];
                if(ᵎⁱ0.FLD1447.FLD1438.MTH6895("auto_friendreq") && ᵎⁱ0.FLD1445.MTH938("contact_nearby_enable2", false)) {
                    try {
                        Field field4 = object8.getClass().getDeclaredField("thisObject");
                        if(field4 != null) {
                            field4.setAccessible(true);
                            object0 = field4.get(object8);
                        }
                        ᵎⁱ0.FLD1245 = object0;
                    }
                    catch(Throwable unused_ex) {
                        ᵎⁱ0.FLD1245 = object0;
                        return;
                    }
                }
                return;
            }
            case 9: {
                ᵎⁱ0.getClass();
                Object object9 = arr_object[0];
                if(ᵎⁱ0.FLD1445.MTH938("contact_nearby_enable2", false) && ᵎⁱ0.FLD1447.FLD1438.MTH6895("auto_friendreq")) {
                    try {
                        Method method0 = object9.getClass().getDeclaredMethod("getResult");
                        method0.setAccessible(true);
                        object0 = method0.invoke(object9);
                    }
                    catch(Throwable unused_ex) {
                    }
                    try {
                        if(((List)object0) != null && !((List)object0).isEmpty()) {
                            ArrayList arrayList0 = ᵎⁱ0.FLD1243;
                            arrayList0.clear();
                            String s7 = CLS27.MTH897("nearbyFieldPlace");
                            String s8 = CLS27.MTH897("nearbyFieldAntiSpam");
                            for(Object object10: ((List)object0)) {
                                int v2 = CLS166.MTH3181(object10, CLS27.MTH897("nearbyFieldSex"));
                                ContentValues contentValues0 = new ContentValues();
                                contentValues0.put("username", ((String)CLS166.MTH3194(object10, CLS27.MTH897("nearbyFieldUsername"))));
                                contentValues0.put("nickname", ((String)CLS166.MTH3194(object10, CLS27.MTH897("nearbyFieldNickname"))));
                                contentValues0.put("sex", v2);
                                if(!TextUtils.isEmpty(s7)) {
                                    contentValues0.put("place", ((String)CLS166.MTH3194(object10, s7)));
                                }
                                if(!TextUtils.isEmpty(s8)) {
                                    contentValues0.put("antispam", ((String)CLS166.MTH3194(object10, s8)));
                                }
                                arrayList0.add(contentValues0);
                            }
                        }
                    }
                    catch(Throwable throwable4) {
                        CLS27.MTH893(throwable4);
                    }
                }
                return;
            }
            case 10: {
                ᵎⁱ0.getClass();
                Object object11 = arr_object[0];
                try {
                    if(ᵎⁱ0.FLD1447.FLD1438.MTH6895("auto_friendreq") && (ᵎⁱ0.FLD1445.MTH938("contact_nearby_enable2", false) && ᵎⁱ0.FLD1227)) {
                        goto label_195;
                    }
                }
                catch(Throwable throwable5) {
                    CLS27.MTH893(throwable5);
                }
                return;
                try {
                label_195:
                    Field field5 = object11.getClass().getDeclaredField("thisObject");
                    if(field5 != null) {
                        field5.setAccessible(true);
                        object0 = field5.get(object11);
                    }
                }
                catch(Throwable unused_ex) {
                }
                try {
                    Intent intent0 = ((Activity)object0).getIntent();
                    if(intent0.hasExtra("Contact_Scene")) {
                        String s9 = intent0.getStringExtra("Contact_User");
                        HashSet hashSet0 = ᵎⁱ0.FLD1242;
                        if(hashSet0.contains(s9)) {
                            hashSet0.remove(s9);
                            if(intent0.getIntExtra("Contact_Scene", 0) == 18) {
                                Intent intent1 = new Intent();
                                intent1.putExtra("Contact_User", s9);
                                intent1.putExtra("Contact_Scene", 18);
                                intent1.putExtra("AntispamTicket", "");
                                intent1.putExtra("wexposed_wf", true);
                                if(!CLS66.MTH1502(intent1, CLS27.MTH897("SayHiEditUI"))) {
                                    intent0.setClassName(CLS390.MTH5619(((Activity)object0)), CLS27.MTH897("SayHiEditUI"));
                                    ((Activity)object0).startActivity(intent1);
                                }
                            }
                            ((Activity)object0).finish();
                            return;
                        }
                    }
                }
                catch(Throwable throwable5) {
                    CLS27.MTH893(throwable5);
                }
                return;
            }
            case 11: {
                ᵎⁱ0.getClass();
                Object object12 = arr_object[0];
                if(ᵎⁱ0.FLD1447.FLD1438.MTH6895("auto_friendreq") && (ᵎⁱ0.FLD1445.MTH938("contact_nearby_enable2", false) && ᵎⁱ0.FLD1227)) {
                    try {
                        Field field6 = object12.getClass().getDeclaredField("thisObject");
                        object13 = null;
                        if(field6 != null) {
                            field6.setAccessible(true);
                            object13 = field6.get(object12);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    try {
                        activity0 = (Activity)object13;
                        if(activity0.getIntent().hasExtra("wexposed_wf")) {
                            if(object13 == null) {
                                goto label_230;
                            }
                            goto label_235;
                        }
                    }
                    catch(Throwable throwable6) {
                        CLS27.MTH893(throwable6);
                    }
                    return;
                    try {
                    label_230:
                        Field field7 = object12.getClass().getDeclaredField("thisObject");
                        object13 = null;
                        if(field7 != null) {
                            field7.setAccessible(true);
                            object13 = field7.get(object12);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    try {
                    label_235:
                        Object object14 = CLS164.MTH3175(object13, "MMEditText");
                        if(object14 != null) {
                            CLS91 ᵔʾ5 = ᵎⁱ0.MTH2791().MTH1184("_FRIENDREQUEST_INTRO_");
                            CLS166.MTH3195(object14, "setText", new Object[]{(ᵔʾ5 == null ? "" : ᵔʾ5.MTH1735())});
                        }
                        Object object15 = ᵎⁱ0.FLD1221;
                        if(object15 != null) {
                            Method method1 = CLS164.MTH3174(object15, "onMenuItemClick", Boolean.TYPE, new Object[]{MenuItem.class});
                            if(method1 != null) {
                                CLS164.MTH3178(ᵎⁱ0.FLD1221, method1, new Object[]{null});
                            }
                        }
                        activity0.finish();
                        return;
                    }
                    catch(Throwable throwable6) {
                        CLS27.MTH893(throwable6);
                    }
                }
                return;
            }
            case 12: {
                ᵎⁱ0.getClass();
                Object object16 = arr_object[0];
                if(ᵎⁱ0.FLD1447.FLD1438.MTH6895("auto_friendreq") && ᵎⁱ0.FLD1445.MTH938("contact_nearby_enable2", false)) {
                    try {
                        Field field8 = object16.getClass().getDeclaredField("thisObject");
                        if(field8 != null) {
                            field8.setAccessible(true);
                            object0 = field8.get(object16);
                        }
                        ᵎⁱ0.FLD1221 = object0;
                    }
                    catch(Throwable unused_ex) {
                        ᵎⁱ0.FLD1221 = object0;
                        return;
                    }
                }
                return;
            }
            case 13: {
                this.MTH2181(arr_object);
                return;
            }
            default: {
                this.MTH2180(arr_object);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2180(Object[] arr_object) {
        CLS818 ᵎⁱ0 = this.FLD694;
        ᵎⁱ0.getClass();
        Object object0 = arr_object[0];
        CLS167 ᵔʾ0 = new CLS167(object0);
        try {
            List list0 = (List)CLS166.MTH3194(ᵔʾ0.MTH3205(), CLS27.MTH897("verifyListField"));
            ᵎⁱ0.FLD1230 = list0;
            if(list0 != null && !list0.isEmpty()) {
                CLS21.FLD76.MTH818("onreceive_verify_user", new Object[]{ᵎⁱ0.FLD1230, object0});
                goto label_11;
            }
            return;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    label_11:
        int v = (int)(((Integer)ᵔʾ0.MTH3204()[1]));
        int v1 = (int)(((Integer)ᵔʾ0.MTH3204()[2]));
        String s = (String)ᵔʾ0.MTH3204()[3];
        CLS288 ˈˊ0 = CLS288.FLD2989;
        String s1 = (String)ᵎⁱ0.FLD1230.get(0);
        ˈˊ0.getClass();
        if(TextUtils.isEmpty(s)) {
            s = "";
        }
        if(s.startsWith("<e>")) {
            HashMap hashMap0 = CLS392.MTH5633(s, "e");
            if(hashMap0.containsKey(".e.Content")) {
                String s2 = (String)hashMap0.get(".e.Content");
                if(s2 != null && !TextUtils.isEmpty(s2)) {
                    s = s2;
                }
            }
        }
        try {
            if(ˈˊ0.FLD2977 && !ˈˊ0.MTH4726()) {
                CLS85 ـˏ0 = ˈˊ0.MTH4736();
                if(ـˏ0.FLD337.equals(s1)) {
                    ˈˊ0.FLD2984.removeCallbacks(ˈˊ0.FLD2988);
                    if(!ـˏ0.FLD332 && ـˏ0.FLD329 && v == 4 && v1 == -24 && CLS502.MTH6934(s, new String[]{"对方帐号异常"}) && !TextUtils.isEmpty(ـˏ0.FLD340)) {
                        CLS27.MTH895().MTH922(ـˏ0.FLD337 + "," + ـˏ0.FLD340 + "," + ـˏ0.MTH1691(), "friendreq_limit_hack");
                    }
                    if(CLS27.MTH895().MTH938("chatroom_friend_req_no_verify_only", false)) {
                        goto label_96;
                    }
                    if(v == 4 && v1 == -44) {
                        ـˏ0.FLD329 = false;
                        if(CLS27.MTH895().MTH938("chatroom_friend_req_no_verify_priority", false)) {
                            ˈˊ0.MTH4745();
                            ˈˊ0.MTH4731(ـˏ0);
                            return;
                        }
                        ˈˊ0.MTH4735(ـˏ0);
                        return;
                    }
                    if(v != 4 || v1 != -24 || !CLS502.MTH6934(s, new String[]{"操作过于频繁"})) {
                        ˈˊ0.MTH4745();
                        if(!ˈˊ0.FLD2975) {
                            if(!ـˏ0.FLD332) {
                                CLS481.MTH6694(CLS481.MTH6691("friendreq_req_day_cnt") + 1, "friendreq_req_day_cnt");
                                CLS27.MTH895().MTH933("friendreq_req_cnt");
                                if(v == 0 && v1 == 0) {
                                    CLS481.MTH6694(CLS481.MTH6691("friendreq_success_day_cnt") + 1, "friendreq_success_day_cnt");
                                    CLS27.MTH895().MTH933("friendreq_success_cnt");
                                    ++ˈˊ0.FLD2990;
                                    ++ˈˊ0.FLD2985;
                                    int v6 = !CLS27.MTH895().MTH938("friendreq_auto_cycle_type", false) || (!CLS500.FLD4928.MTH6895("friend_request_type") || !CLS412.MTH6002()) ? 0 : CLS412.MTH6005(20, "friendreq_auto_cycle_max");
                                    if(v6 > 0 && ˈˊ0.FLD2990 >= v6) {
                                        ++ˈˊ0.FLD2983;
                                        ˈˊ0.FLD2990 = 0;
                                    }
                                }
                                String s3 = "";
                                try {
                                    s3 = String.format(CLS27.MTH889("add_friend_toast2"), ـˏ0.MTH1691(), CLS288.MTH4746(), ˈˊ0.MTH4727(), CLS288.MTH4728());
                                }
                                catch(Throwable throwable2) {
                                    CLS27.MTH893(throwable2);
                                }
                                if(!TextUtils.isEmpty(s)) {
                                    s3 = s3 + "\n" + s;
                                }
                                ˈˊ0.MTH4744(s3);
                                if(ˈˊ0.FLD2979 != null) {
                                    CLS1247 ـˏ1 = new CLS1247(ˈˊ0, 3);
                                    CLS40.FLD157.MTH1116(((CLS39)ـˏ1));
                                }
                                ˈˊ0.MTH4729(s1);
                                int v7 = CLS27.MTH895().MTH927(0, "friendreq_max_break");
                                if(v7 > 0 && CLS288.MTH4746() % v7 == 0) {
                                    CLS40 ﾞᵎ0 = CLS40.FLD157;
                                    CLS1247 ـˏ2 = new CLS1247(ˈˊ0, 2);
                                    ﾞᵎ0.MTH1123(((CLS39)ـˏ2), ((long)CLS412.MTH6005(1800000, "friendreq_max_break_delay")));
                                    return;
                                label_96:
                                    ˈˊ0.MTH4745();
                                    CLS481.MTH6694(CLS481.MTH6691("friendreq_req_day_cnt") + 1, "friendreq_req_day_cnt");
                                    CLS27.MTH895().MTH933("friendreq_req_cnt");
                                    if(v == 0 && v1 == 0) {
                                        CLS481.MTH6694(CLS481.MTH6691("friendreq_success_day_cnt") + 1, "friendreq_success_day_cnt");
                                        CLS27.MTH895().MTH933("friendreq_success_cnt");
                                        ++ˈˊ0.FLD2985;
                                    }
                                    String s4 = "";
                                    try {
                                        s4 = String.format(CLS27.MTH889("add_friend_toast2"), ـˏ0.MTH1691(), CLS288.MTH4746(), ˈˊ0.MTH4727(), CLS288.MTH4728());
                                    }
                                    catch(Throwable throwable3) {
                                        CLS27.MTH893(throwable3);
                                    }
                                    if(!TextUtils.isEmpty(s)) {
                                        s4 = s4 + "\n" + s;
                                    }
                                    ˈˊ0.MTH4744(s4);
                                    if(ˈˊ0.FLD2979 != null) {
                                        CLS1247 ـˏ3 = new CLS1247(ˈˊ0, 3);
                                        CLS40.FLD157.MTH1116(((CLS39)ـˏ3));
                                    }
                                    ˈˊ0.MTH4729(s1);
                                    int v8 = CLS27.MTH895().MTH927(0, "friendreq_max_break");
                                    if(v8 > 0 && CLS288.MTH4746() % v8 == 0) {
                                        ﾞᵎ0 = CLS40.FLD157;
                                        ـˏ2 = new CLS1247(ˈˊ0, 1);
                                        ﾞᵎ0.MTH1123(((CLS39)ـˏ2), ((long)CLS412.MTH6005(1800000, "friendreq_max_break_delay")));
                                        return;
                                    }
                                }
                            }
                            ˈˊ0.MTH4741(ˈˊ0.MTH4736());
                        }
                    }
                    else {
                        if(CLS27.MTH895().MTH938("friendreq_limit_auto_bypass", false) && CLS500.FLD4928.MTH6895("friendreq_limit_bypass")) {
                            int v2 = ـˏ0.FLD336;
                            if(v2 < 5) {
                                ـˏ0.FLD336 = v2 + 1;
                                ˈˊ0.MTH4744(s + ": " + CLS27.MTH889("friendreq_limit_auto_bypass"));
                                CLS1262 ﾞˎ0 = new CLS1262(ˈˊ0, CLS412.MTH6005(50, "friendreq_limit_auto_bypass_attempts"), 0);
                                CLS40.FLD157.MTH1124(((CLS39)ﾞˎ0));
                                return;
                            }
                        }
                        int v3 = CLS288.MTH4747();
                        if(v3 != 0) {
                            int v4 = ˈˊ0.FLD2983;
                            if(v4 < v3) {
                                ˈˊ0.FLD2990 = 0;
                                ˈˊ0.FLD2983 = v4 + 1;
                                ˈˊ0.MTH4741(ˈˊ0.MTH4736());
                                return;
                            }
                        }
                        ˈˊ0.MTH4744(s + "\n" + CLS27.MTH889("pause_request"));
                        ˈˊ0.MTH4739();
                        if(CLS27.MTH895().MTH938("friendreq_limit_auto_resume", false)) {
                            ˈˊ0.FLD2990 = 0;
                            ˈˊ0.FLD2983 = 0;
                            CLS600 ᐧˉ0 = new CLS600(1);
                            long v5 = (long)CLS412.MTH6005(3900000, "friendreq_limit_auto_resume_delay");
                            CLS309.FLD3190.MTH4945(((CLS99)ᐧˉ0), v5);
                        }
                    }
                }
            }
            else if(v == 4 && v1 == -24 && CLS502.MTH6934(s, new String[]{"操作过于频繁"}) && CLS27.MTH895().MTH938("friendreq_limit_auto_bypass", false) && CLS500.FLD4928.MTH6895("friendreq_limit_bypass")) {
                CLS1262 ﾞˎ1 = new CLS1262(ˈˊ0, 100, 0);
                CLS40.FLD157.MTH1124(((CLS39)ﾞˎ1));
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2181(Object[] arr_object) {
        this.FLD694.getClass();
        CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
        CLS29 ˎᵢ0 = this.FLD694.FLD1445;
        if(ˎᵢ0.MTH938("contact_radar_enable2", false) && this.FLD694.FLD1447.FLD1438.MTH6895("auto_friendreq")) {
            try {
                List list0 = (List)CLS166.MTH3194((TextUtils.isEmpty(CLS27.MTH897("radarMethod")) ? CLS166.MTH3194(CLS166.MTH3194(CLS166.MTH3194(ᵔʾ0.MTH3205(), CLS27.MTH892("radarField1", "atField1")), CLS27.MTH897("radarField2")), CLS27.MTH892("radarField3", "atField3")) : CLS166.MTH3195(CLS166.MTH3194(ᵔʾ0.MTH3205(), CLS27.MTH897("atField1")), CLS27.MTH897("radarMethod"), new Object[0])), CLS27.MTH897("radarField4"));
                if(list0 != null && !list0.isEmpty()) {
                    Iterator iterator0 = list0.iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            CLS288.FLD2989.MTH4734();
                            return;
                        }
                        Object object0 = iterator0.next();
                        String s = (String)CLS166.MTH3194(object0, CLS27.MTH897("nearbyFieldUsername"));
                        if(TextUtils.isEmpty(s)) {
                            s = (String)CLS166.MTH3194(object0, CLS27.MTH897("radarField5"));
                        }
                        String s1 = (String)CLS166.MTH3194(object0, CLS27.MTH897("nearbyFieldNickname"));
                        String s2 = "";
                        try {
                            s2 = (String)CLS166.MTH3194(object0, CLS27.MTH897("nearbyFieldAntiSpam"));
                        }
                        catch(Throwable throwable1) {
                            CLS27.MTH893(throwable1);
                        }
                        CLS85 ـˏ0 = new CLS85(s, s1, "radar");
                        ـˏ0.FLD339 = s2;
                        ـˏ0.FLD330 = CLS83.FLD322;
                        int v = ˎᵢ0.MTH927(0, "friendreq_permission_type");
                        int v1 = ˎᵢ0.MTH927(0, "friendreq_history_type");
                        ـˏ0.MTH1692((v == 0 ? CLS84.FLD325 : CLS84.FLD327), v1);
                        CLS288.FLD2989.MTH4731(ـˏ0);
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }
}


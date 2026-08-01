// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.app.Notification.Builder;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Handler.Callback;
import android.text.TextUtils;
import android.widget.TextView;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS573;
import b.ˆʿ.CLS44;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS69;
import b.ˈˈ.CLS91;
import b.ˊﾞ.CLS613;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1229;
import b.ᵔʾ.CLS280;
import b.ᵔʾ.CLS293;
import b.ᵔʾ.CLS298;
import b.ᵔʾ.CLS301;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS1380;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS396;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS443;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS529;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class CLS845 implements CLS35 {
    public final int FLD1324;
    public final CLS877 FLD1325;

    public CLS845(CLS877 ﹶﾞ0, int v) {
        this.FLD1324 = v;
        this.FLD1325 = ﹶﾞ0;
        super();
    }

    // 此方法包含解密的字符串
    private final void MTH2920(Object[] arr_object) {
        this.FLD1325.getClass();
        if("sns_block_enable".equals(((String)arr_object[0]))) {
            long v = (long)(((Long)arr_object[1]));
            if(v != -1L) {
                if(CLS466.MTH6511(v).equals(CLS27.MTH904())) {
                    CLS66.MTH1481(CLS396.FLD3775.MTH5754(v));
                    return;
                }
                try {
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("sourceType", 8);
                    CLS396.FLD3775.MTH5767("SnsInfo", contentValues0, "rowid = ?", new String[]{String.valueOf(v)});
                    CLS66.MTH1373();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2921(Object[] arr_object) {
        CLS877 ﹶﾞ0 = this.FLD1325;
        if(ﹶﾞ0.FLD1447.FLD1438.MTH6895("remove_mention_limit") && ﹶﾞ0.FLD1445.MTH938("remove_mention_limit_enable", false)) {
            CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
            if(CLS412.MTH6009(((Activity)ᵔʾ0.MTH3205())).endsWith("SnsAddressUI")) {
                String s = CLS27.MTH892("addTextOptionMenu", "a");
                CLS166.MTH3195(ᵔʾ0.MTH3205(), s, new Object[]{2000, CLS27.MTH889("select_all"), new CLS529(ﹶﾞ0, ᵔʾ0, 4)});
                Class class0 = CLS27.MTH894("SnsAddressUIMaxClass");
                if(class0 != null) {
                    String s1 = CLS27.MTH897("SnsAddressUIMaxField");
                    try {
                        CLS166.MTH3187(class0, s1).setInt(null, 10000);
                    }
                    catch(IllegalAccessException illegalAccessException0) {
                        CLS27.MTH893(illegalAccessException0);
                        throw new IllegalAccessError(illegalAccessException0.getMessage());
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2922(Object[] arr_object) {
        if(this.FLD1325.FLD1447.FLD1438.MTH6895("remove_mention_limit") && this.FLD1325.FLD1445.MTH938("remove_mention_limit_enable", false)) {
            Object object0 = arr_object[0];
            try {
                Field field0 = object0.getClass().getDeclaredField("thisObject");
                Object object1 = null;
                if(field0 != null) {
                    field0.setAccessible(true);
                    object1 = field0.get(object0);
                }
            }
            catch(Throwable unused_ex) {
            }
            if(CLS412.MTH6009(((Activity)object1)).equals(CLS27.MTH897("SnsAddressUI"))) {
                Class class0 = CLS27.MTH894("SnsAddressUIMaxClass");
                if(class0 != null) {
                    String s = CLS27.MTH897("SnsAddressUIMaxField");
                    try {
                        CLS166.MTH3187(class0, s).setInt(null, 10);
                    }
                    catch(IllegalAccessException illegalAccessException0) {
                        CLS27.MTH893(illegalAccessException0);
                        throw new IllegalAccessError(illegalAccessException0.getMessage());
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        boolean z4;
        boolean z3;
        Object object18;
        Object object13;
        int v1;
        Cursor cursor0;
        CLS396 ʿʽ0;
        String s8;
        Object object2;
        CLS301 ᐧי0 = CLS301.FLD3148;
        Class class0 = Object.class;
        CLS877 ﹶﾞ0 = this.FLD1325;
        switch(this.FLD1324) {
            case 0: {
                Object object0 = null;
                ﹶﾞ0.getClass();
                if(ﹶﾞ0.FLD1445.MTH938("moments_container_enable", false) && (ﹶﾞ0.FLD1447.FLD1438.MTH6895("moments_container_enable") && !TextUtils.isEmpty(ﹶﾞ0.FLD1445.MTH925("moments_container_filter", "")) && CLS27.MTH890("SnsTimeLineUI_adapterField"))) {
                    Object object1 = arr_object[0];
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
                    String s = CLS412.MTH6009(((Activity)object2));
                    if(!TextUtils.isEmpty(s) && s.endsWith("SnsTimeLineUI")) {
                        if(object2 == null) {
                            try {
                                Field field1 = object1.getClass().getDeclaredField("thisObject");
                                if(field1 != null) {
                                    field1.setAccessible(true);
                                    object0 = field1.get(object1);
                                }
                            }
                            catch(Throwable unused_ex) {
                            }
                            object2 = object0;
                        }
                        Object object3 = CLS182.MTH3492(0x38EDE93A2B3CD335L, object2);
                        if(object3 != null) {
                            Object object4 = CLS182.MTH3492(4102191937367102261L, object3);
                            if(object4 != null) {
                                CLS166.MTH3196(CLS412.MTH6007(0, 10, CLS166.MTH3181(object4, CLS27.MTH897("SnsTimeLineVendingAdapter_field1_field1"))), object4, CLS27.MTH897("SnsTimeLineVendingAdapter_field1_field1"));
                            }
                        }
                    }
                }
                return;
            }
            case 1: {
                if(ﹶﾞ0.FLD1447.FLD1438.MTH6895("sns_export")) {
                    ContentValues contentValues0 = (ContentValues)arr_object[0];
                    long v = CLS34.MTH1080(4102193505030165301L, contentValues0);
                    String s1 = contentValues0.getAsString("userName");
                    ᐧי0.MTH4891(contentValues0, v, CLS301.MTH4892(((int)contentValues0.getAsInteger("createTime")), s1), false);
                }
                return;
            }
            case 2: {
                ﹶﾞ0.getClass();
                ﹶﾞ0.MTH3091(((long)(((Long)arr_object[0]))));
                return;
            }
            case 3: {
                ﹶﾞ0.getClass();
                if(ﹶﾞ0.FLD1445.MTH938("moment_original_image", false) && ﹶﾞ0.FLD1447.FLD1438.MTH6895("moment_original_image")) {
                    CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                    String s2 = (String)ᵔʾ0.MTH3204()[0];
                    String s3 = (String)ᵔʾ0.MTH3204()[1];
                    String s4 = (String)ᵔʾ0.MTH3204()[2];
                    if(ᵔʾ0.MTH3204().length <= 3 || ((Boolean)ᵔʾ0.MTH3204()[3]).booleanValue()) {
                        File file0 = new File(s3);
                        if(CLS31.MTH1001(file0)) {
                            CLS69 ʾᵢ0 = new CLS69(s2 + s4);
                            CLS31.MTH1016(new CLS69(file0), ʾᵢ0);
                        }
                    }
                }
                return;
            }
            case 4: {
                ﹶﾞ0.getClass();
                Handler.Callback handler$Callback0 = (Handler.Callback)arr_object[0];
                CLS443.MTH6316(((CLS140)ﹶﾞ0).MTH3042(), ((CLS8)new CLS876(handler$Callback0)));
                return;
            }
            case 5: {
                Object object5 = null;
                ﹶﾞ0.getClass();
                Object object6 = arr_object[0];
                try {
                    Field field2 = object6.getClass().getDeclaredField("thisObject");
                    if(field2 != null) {
                        field2.setAccessible(true);
                        object5 = field2.get(object6);
                    }
                }
                catch(Throwable unused_ex) {
                }
                String s5 = CLS412.MTH6009(((Activity)object5));
                if(s5.equals(CLS27.MTH897("SnsTimeLineUI")) || s5.endsWith("ImproveSnsTimelineUI")) {
                    CLS66.MTH1387(((Activity)object5));
                }
                if(s5.endsWith("ImproveSnsTimelineUI")) {
                    if(ﹶﾞ0.FLD1445.MTH938("enable_block_snsad", false)) {
                        ﹶﾞ0.FLD1446.MTH5753("AdSnsInfo");
                    }
                    CLS66.MTH1373();
                }
                return;
            }
            case 6: {
                Object object7 = null;
                ﹶﾞ0.getClass();
                if(ﹶﾞ0.FLD1445.MTH938("enable_block_snsad", false)) {
                    Object object8 = arr_object[0];
                    try {
                        Field field3 = object8.getClass().getDeclaredField("thisObject");
                        if(field3 != null) {
                            field3.setAccessible(true);
                            object7 = field3.get(object8);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    ArrayList arrayList0 = (ArrayList)CLS182.MTH3492(4102192542957490997L, object7);
                    if(arrayList0 != null && !arrayList0.isEmpty() && arrayList0.get(0).getClass().getName().equals(CLS27.MTH897("ImproveListItemCls"))) {
                        Iterator iterator0 = arrayList0.iterator();
                        while(iterator0.hasNext()) {
                            Object object9 = iterator0.next();
                            if(((Boolean)CLS166.MTH3195(CLS182.MTH3492(0x38EDEA082B3CD335L, object9), CLS27.MTH897("ImproveSnsInfo_isAd"), new Object[0])).booleanValue()) {
                                iterator0.remove();
                            }
                        }
                    }
                }
                return;
            }
            case 7: {
                Object object10 = null;
                ﹶﾞ0.getClass();
                CLS29 ˎᵢ0 = ﹶﾞ0.FLD1445;
                if(ˎᵢ0.MTH938("moments_container_enable", false) && ﹶﾞ0.FLD1447.FLD1438.MTH6895("moments_container_enable")) {
                    Object object11 = arr_object[0];
                    try {
                        Field field4 = object11.getClass().getDeclaredField("thisObject");
                        if(field4 != null) {
                            field4.setAccessible(true);
                            object10 = field4.get(object11);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    String s6 = CLS412.MTH6009(((Activity)object10));
                    if(!TextUtils.isEmpty(s6) && (s6.endsWith("SnsTimeLineUI") || s6.endsWith("ImproveSnsTimeLineUI"))) {
                        if(ˎᵢ0.MTH938("moments_container_remember_selected", false)) {
                            String s7 = ˎᵢ0.MTH925("moments_container_selected", "");
                            s8 = "";
                            if(!TextUtils.isEmpty(s7)) {
                                String s9 = ˎᵢ0.MTH925(CLS182.MTH3484(4102190777725932341L, new StringBuilder(), s7), "");
                                if(!TextUtils.isEmpty(s9)) {
                                    HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(s9)));
                                    hashSet0.add(CLS27.MTH904());
                                    s8 = " userName in (\'" + TextUtils.join("\',\'", hashSet0) + "\') AND ";
                                }
                            }
                        }
                        else {
                            ˎᵢ0.MTH922("", "moments_container_selected");
                            s8 = "";
                        }
                        ˎᵢ0.MTH922(s8, "moments_container_filter");
                    }
                }
                return;
            }
            case 8: {
                try {
                    ʿʽ0 = ﹶﾞ0.FLD1446;
                    cursor0 = ʿʽ0.MTH5759(String.format(CLS27.MTH882("q_snsinfo2"), CLS27.MTH904()), null);
                    if(cursor0 != null) {
                        v1 = 0;
                        String s10 = ﹶﾞ0.FLD1445.MTH925("moments_filter_exclude", "");
                        if(cursor0.moveToFirst()) {
                            goto label_117;
                        }
                        goto label_137;
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
                while(true) {
                    try {
                    label_117:
                        String s11 = cursor0.getString(cursor0.getColumnIndex("userName"));
                        ContentValues contentValues1 = new ContentValues();
                        contentValues1.put("snsId", cursor0.getString(cursor0.getColumnIndex("snsId")));
                        contentValues1.put("content", cursor0.getBlob(cursor0.getColumnIndex("content")));
                        contentValues1.put("userName", s11);
                        contentValues1.put("sourceType", cursor0.getInt(cursor0.getColumnIndex("sourceType")));
                        contentValues1.put("type", cursor0.getInt(cursor0.getColumnIndex("type")));
                        contentValues1.put("attrBuf", cursor0.getBlob(cursor0.getColumnIndex("attrBuf")));
                        if(!CLS502.MTH6934(s10, new String[]{s11})) {
                            ﹶﾞ0.MTH3086(contentValues1);
                            ﹶﾞ0.MTH3082(contentValues1);
                            if(((int)contentValues1.getAsInteger("sourceType")) == 8) {
                                ContentValues contentValues2 = new ContentValues();
                                contentValues2.put("sourceType", 8);
                                ++v1;
                                ʿʽ0.MTH5767("SnsInfo", contentValues2, "snsId = ?", new String[]{contentValues1.getAsString("snsId")});
                            }
                        }
                        goto label_136;
                    }
                    catch(Throwable throwable1) {
                        try {
                            CLS27.MTH893(throwable1);
                        label_136:
                            if(cursor0.moveToNext()) {
                                goto label_117;
                            }
                        label_137:
                            cursor0.close();
                            CLS412.MTH6014(((CLS140)ﹶﾞ0).MTH3042(), String.format(CLS27.MTH889("do_filter_result"), v1));
                            return;
                        }
                        catch(Throwable throwable0) {
                            break;
                        }
                    }
                }
                CLS27.MTH893(throwable0);
                return;
            }
            case 9: {
                ﹶﾞ0.getClass();
                CLS1229 ˆٴ0 = new CLS1229(20, ﹶﾞ0);
                CLS40.FLD157.MTH1124(((CLS39)ˆٴ0));
                return;
            }
            case 10: {
                if(ﹶﾞ0.FLD1447.FLD1438.MTH6895("mass_sns_forward")) {
                    ContentValues contentValues3 = (ContentValues)arr_object[0];
                    long v2 = CLS34.MTH1080(0x38EDEBAE2B3CD335L, contentValues3);
                    ArrayList arrayList1 = new ArrayList();
                    ArrayList arrayList2 = arr_object.length <= 1 ? arrayList1 : ((ArrayList)arr_object[1]);
                    String s12 = CLS466.MTH6541(CLS66.MTH1424(contentValues3.getAsByteArray("content")));
                    ArrayList arrayList3 = new ArrayList();
                    CLS280.FLD2910.MTH4659(contentValues3, v2, s12, 0, arrayList2, arrayList3, null);
                }
                return;
            }
            case 11: {
                ﹶﾞ0.getClass();
                if(CLS27.MTH890("setSnsAutoPlayFiedl1")) {
                    boolean z = CLS613.MTH1965(CLS27.MTH900());
                    CLS29 ˎᵢ1 = ﹶﾞ0.FLD1445;
                    if(z) {
                        if(!ˎᵢ1.MTH938("moment_wifi_autoplay", !CLS412.MTH6002())) {
                            Object object12 = arr_object[0];
                            try {
                                Field field5 = object12.getClass().getDeclaredField("thisObject");
                                object13 = null;
                                if(field5 != null) {
                                    field5.setAccessible(true);
                                    object13 = field5.get(object12);
                                }
                            }
                            catch(Throwable unused_ex) {
                            }
                            CLS166.MTH3189(object13, CLS27.MTH897(CLS370.MTH5289(4102193414835852085L)), false);
                            return;
                        }
                    }
                    else if(!ˎᵢ1.MTH938("moment_data_autoplay", !CLS412.MTH6002())) {
                        Object object14 = arr_object[0];
                        try {
                            Field field6 = object14.getClass().getDeclaredField("thisObject");
                            object13 = null;
                            if(field6 != null) {
                                field6.setAccessible(true);
                                object13 = field6.get(object14);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        CLS166.MTH3189(object13, CLS27.MTH897(CLS370.MTH5289(4102194144980292405L)), false);
                    }
                }
                return;
            }
            case 12: {
                ﹶﾞ0.getClass();
                boolean z1 = CLS613.MTH1965(CLS27.MTH900());
                CLS29 ˎᵢ2 = ﹶﾞ0.FLD1445;
                if(z1) {
                    if(!ˎᵢ2.MTH938("moment_wifi_autoplay", !CLS412.MTH6002())) {
                        Object object15 = arr_object[0];
                        try {
                            Method method0 = object15.getClass().getDeclaredMethod("setResult", class0);
                            method0.setAccessible(true);
                            method0.invoke(object15, Boolean.FALSE);
                            return;
                        }
                        catch(Throwable unused_ex) {
                        }
                    }
                }
                else if(!ˎᵢ2.MTH938("moment_data_autoplay", !CLS412.MTH6002())) {
                    Object object16 = arr_object[0];
                    try {
                        Method method1 = object16.getClass().getDeclaredMethod("setResult", class0);
                        method1.setAccessible(true);
                        method1.invoke(object16, Boolean.FALSE);
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                return;
            }
            case 13: {
                ﹶﾞ0.getClass();
                Object object17 = arr_object[0];
                if("snsinfo".equalsIgnoreCase(((String)arr_object[2]))) {
                    try {
                        Method method2 = object17.getClass().getDeclaredMethod("getResult");
                        method2.setAccessible(true);
                        object18 = null;
                        object18 = method2.invoke(object17);
                    }
                    catch(Throwable unused_ex) {
                    }
                    long v3 = (long)(((Long)object18));
                    if(v3 != -1L) {
                        ContentValues contentValues4 = (ContentValues)arr_object[3];
                        if(!contentValues4.containsKey("rowid") && contentValues4.containsKey("userName")) {
                            boolean z2 = contentValues4.getAsString("userName").equals(CLS27.MTH904());
                            if(contentValues4.containsKey("snsId") && CLS34.MTH1080(4102192435583308597L, contentValues4) == 0L) {
                                if(z2) {
                                    String s13 = CLS66.MTH1424(contentValues4.getAsByteArray("content"));
                                    if(!ﹶﾞ0.MTH3097(contentValues4, s13) && !ﹶﾞ0.MTH3087(contentValues4)) {
                                        if(ﹶﾞ0.MTH3093(s13)) {
                                            CLS680 ˈʾ0 = new CLS680(ﹶﾞ0, contentValues4, v3, 1);
                                            CLS40.FLD157.MTH1123(((CLS39)ˈʾ0), 5000L);
                                        }
                                        if(ﹶﾞ0.MTH3089(s13)) {
                                            CLS683 ˈˋ0 = new CLS683(ﹶﾞ0, contentValues4, v3, s13);
                                            CLS40.FLD157.MTH1123(((CLS39)ˈˋ0), 5000L);
                                            return;
                                        }
                                    }
                                }
                            }
                            else if(!z2 && !CLS481.MTH6686(ﹶﾞ0.FLD1474, contentValues4)) {
                                CLS293 ˎᵢ3 = CLS293.FLD3041;
                                if(CLS27.MTH895().MTH938("moments_post_message_enable", false) && CLS500.FLD4928.MTH6895("moments_post_message_mass_send")) {
                                    String s14 = contentValues4.getAsString("userName");
                                    if(!s14.equals(CLS27.MTH904()) && !CLS502.MTH6934(CLS27.MTH895().MTH925("moments_post_message_exclude", ""), new String[]{s14})) {
                                        try {
                                            JSONObject jSONObject0 = CLS27.MTH895().MTH924("moments_post_message_dup_check_json", new JSONObject());
                                            if(jSONObject0.has(s14)) {
                                                long v4 = CLS27.MTH895().MTH936(14400000L, "moments_post_message_dup_check_time");
                                                if(CLS481.MTH6688(jSONObject0.getLong(s14), v4)) {
                                                    jSONObject0.put(s14, System.currentTimeMillis());
                                                    CLS27.MTH895().MTH922(jSONObject0, "moments_post_message_dup_check_json");
                                                    goto label_237;
                                                }
                                                else {
                                                    z3 = true;
                                                }
                                            }
                                            else {
                                                jSONObject0.put(s14, System.currentTimeMillis());
                                                CLS27.MTH895().MTH922(jSONObject0, "moments_post_message_dup_check_json");
                                                goto label_237;
                                            }
                                            goto label_238;
                                        }
                                        catch(Throwable throwable2) {
                                            CLS27.MTH893(throwable2);
                                        }
                                    label_237:
                                        z3 = false;
                                    label_238:
                                        if(!z3) {
                                            if(ˎᵢ3.FLD3040 == null) {
                                                ˎᵢ3.FLD3040 = (CLS44)CLS40.FLD157.MTH1118(CLS44.class);
                                            }
                                            CLS91 ᵔʾ1 = ˎᵢ3.FLD3040.MTH1184("_MOMENT_POST_MESSAGE_");
                                            if(ᵔʾ1 != null) {
                                                Object[] arr_object1 = {ᵔʾ1.MTH1735(), s14};
                                                CLS21.FLD76.MTH818("sendMessage", arr_object1);
                                            }
                                        }
                                    }
                                }
                                if(!CLS27.MTH895().MTH938("sns_auto_export_enable", false) || !CLS500.FLD4928.MTH6895("sns_auto_export")) {
                                    z4 = false;
                                }
                                else {
                                    String s15 = contentValues4.getAsString("userName");
                                    z4 = CLS502.MTH6934(CLS27.MTH895().MTH925("sns_auto_export_list", ""), new String[]{s15});
                                }
                                if(z4) {
                                    String s16 = contentValues4.getAsString("userName");
                                    ᐧי0.MTH4891(contentValues4, v3, CLS301.MTH4892(((int)contentValues4.getAsInteger("createTime")), s16), true);
                                }
                                String s17 = CLS66.MTH1424(contentValues4.getAsByteArray("content"));
                                String s18 = contentValues4.getAsString("userName");
                                if(ﹶﾞ0.FLD1445.MTH938("sns_keyword_notification_enable", false) && (ﹶﾞ0.FLD1447.FLD1438.MTH6895("sns_keyword_notification") && (ﹶﾞ0.FLD1445.MTH938("timeline_sync_enable", false) && ﹶﾞ0.FLD1445.MTH938("sns_sync_enable", false) || ﹶﾞ0.FLD1445.MTH938("moments_forward_enable", CLS412.MTH6002())) && !CLS502.MTH6934(ﹶﾞ0.FLD1445.MTH925("sns_keyword_notif_excl", ""), new String[]{s18})) && (!CLS21.FLD76.MTH830("isHidden", new Object[]{s18}) && CLS502.MTH6930(ﹶﾞ0.FLD1445.MTH925("sns_keyword_notif_keyword_text", ""), s17))) {
                                    String s19 = ﹶﾞ0.FLD1444.MTH5311(s18);
                                    CLS485 ᐧﾞ0 = (CLS485)CLS40.FLD157.MTH1118(CLS485.class);
                                    String s20 = CLS27.MTH889("sns_keyword_notification") + " " + s19;
                                    Bitmap bitmap0 = CLS372.MTH5411(s18);
                                    ((CLS485)CLS40.FLD157.MTH1118(CLS485.class)).getClass();
                                    Intent intent0 = CLS485.MTH6743();
                                    ᐧﾞ0.getClass();
                                    try {
                                        Context context0 = CLS27.MTH900();
                                        if(!CLS485.MTH6730("sns_keyword")) {
                                            if(bitmap0 == null) {
                                                bitmap0 = CLS404.MTH5887();
                                            }
                                            Notification.Builder notification$Builder0 = new Notification.Builder(context0).setLargeIcon(bitmap0).setSmallIcon(CLS485.MTH6745()).setContentTitle(s20).setContentText(s17).setAutoCancel(true);
                                            if(CLS390.MTH5615(context0)) {
                                                CLS485.MTH6726(context0, "sns_keyword");
                                                notification$Builder0.setChannelId(CLS485.MTH6736("wx_sns_keyword"));
                                            }
                                            notification$Builder0.setContentIntent((Build.VERSION.SDK_INT < 23 ? PendingIntent.getActivity(context0, 11122201, intent0, 0x8000000) : PendingIntent.getActivity(context0, 11122201, intent0, 0xC000000)));
                                            CLS485.MTH6722(notification$Builder0, "sns_keyword");
                                            Notification notification0 = notification$Builder0.build();
                                            notification0.flags = 17;
                                            notification0.ledOnMS = 300;
                                            notification0.ledOffMS = 1000;
                                            notification0.ledARGB = 0xFFFF0000;
                                            CLS485.MTH6748("sns_keyword", notification0);
                                            CLS485.MTH6724("sns_keyword", notification0);
                                            CLS485.MTH6741(notification0, 11122201);
                                        }
                                    }
                                    catch(Throwable throwable3) {
                                        CLS27.MTH893(throwable3);
                                    }
                                }
                                if(!ﹶﾞ0.MTH3097(contentValues4, s17) && !ﹶﾞ0.MTH3087(contentValues4)) {
                                    if(ﹶﾞ0.MTH3093(s17)) {
                                        ﹶﾞ0.MTH3083(v3, contentValues4);
                                    }
                                    if(ﹶﾞ0.MTH3089(s17)) {
                                        ﹶﾞ0.MTH3099(contentValues4, v3, s17);
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 14: {
                this.MTH2929(arr_object);
                return;
            }
            case 15: {
                ﹶﾞ0.getClass();
                if("snsinfo".equalsIgnoreCase(((String)arr_object[2]))) {
                    ContentValues contentValues5 = (ContentValues)arr_object[3];
                    String s21 = contentValues5.getAsString("snsId");
                    long v5 = CLS396.FLD3775.MTH5756(s21);
                    if(v5 != -1L && (ﹶﾞ0.FLD1445.MTH938("auto_like_enable", false) && !CLS66.MTH1479(v5) && ﹶﾞ0.FLD1445.MTH938("like_only_on_already_liked", false) && !ﹶﾞ0.MTH3092().MTH1191(((long)contentValues5.getAsLong("snsId"))) && CLS66.MTH1477(contentValues5.getAsByteArray("attrBuf")) >= 1 && !CLS481.MTH6686(ﹶﾞ0.FLD1474, contentValues5) && ﹶﾞ0.MTH3093(CLS66.MTH1424(contentValues5.getAsByteArray("content"))))) {
                        ﹶﾞ0.MTH3083(v5, contentValues5);
                    }
                }
                return;
            }
            case 16: {
                this.MTH2927(arr_object);
                return;
            }
            case 17: {
                ﹶﾞ0.getClass();
                Object object19 = arr_object[0];
                String s22 = (String)arr_object[2];
                if(ﹶﾞ0.FLD1445.MTH938("enable_moment_filter", false) && "snsinfo".equalsIgnoreCase(s22)) {
                    ContentValues contentValues6 = (ContentValues)arr_object[3];
                    ﹶﾞ0.MTH3086(contentValues6);
                    ﹶﾞ0.MTH3082(contentValues6);
                }
                if(ﹶﾞ0.MTH3084(s22)) {
                    try {
                        Method method3 = object19.getClass().getDeclaredMethod("setResult", class0);
                        method3.setAccessible(true);
                        method3.invoke(object19, -1L);
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                return;
            }
            case 18: {
                ﹶﾞ0.getClass();
                if(ﹶﾞ0.FLD1445.MTH938("enable_block_snsad", false)) {
                    ﹶﾞ0.FLD1446.MTH5753("AdSnsInfo");
                }
                return;
            }
            case 19: {
                this.MTH2930(arr_object);
                return;
            }
            case 20: {
                this.MTH2932(arr_object);
                return;
            }
            case 21: {
                this.MTH2925(arr_object);
                return;
            }
            case 22: {
                this.MTH2931(arr_object);
                return;
            }
            case 23: {
                this.MTH2921(arr_object);
                return;
            }
            case 24: {
                this.MTH2922(arr_object);
                return;
            }
            case 25: {
                this.MTH2920(arr_object);
                return;
            }
            case 26: {
                this.MTH2924(arr_object);
                return;
            }
            case 27: {
                this.MTH2928(arr_object);
                return;
            }
            default: {
                this.MTH2926(arr_object);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2924(Object[] arr_object) {
        CLS877 ﹶﾞ0 = this.FLD1325;
        ﹶﾞ0.getClass();
        if("add_to_moments_container".equals(((String)arr_object[0]))) {
            long v = (long)(((Long)arr_object[1]));
            if(v != -1L) {
                String s = CLS466.MTH6511(v);
                if(!TextUtils.isEmpty(s)) {
                    CLS443.MTH6310(false, ((CLS140)ﹶﾞ0).MTH3042(), s, null);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2925(Object[] arr_object) {
        Object object1;
        CLS877 ﹶﾞ0 = this.FLD1325;
        ﹶﾞ0.getClass();
        boolean z = CLS412.MTH6002();
        if(ﹶﾞ0.FLD1445.MTH938("timeLineUITitleShowMenu", z) && CLS27.MTH890("MMActivity_getMMTitleView")) {
            Object object0 = arr_object[0];
            try {
                Field field0 = object0.getClass().getDeclaredField("args");
                object1 = null;
                if(field0 != null) {
                    field0.setAccessible(true);
                    object1 = field0.get(object0);
                }
            }
            catch(Throwable unused_ex) {
            }
            ((TextView)CLS166.MTH3195(((Object[])object1)[0], CLS27.MTH897("MMActivity_getMMTitleView"), new Object[0])).setOnLongClickListener(new CLS125(ﹶﾞ0, 2));
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2926(Object[] arr_object) {
        CLS877 ﹶﾞ0 = this.FLD1325;
        ﹶﾞ0.getClass();
        if("fake_moment_forward".equals(((String)arr_object[0]))) {
            Activity activity0 = ((CLS140)ﹶﾞ0).MTH3042();
            long v = (long)(((Long)arr_object[1]));
            ArrayList arrayList0 = new ArrayList();
            CLS1622 ˑٴ0 = new CLS1622(activity0);
            CLS523.MTH7160(activity0, CLS27.MTH889("fake_moment_forward_enable"), ((CLS17)new CLS683(arrayList0, activity0, ˑٴ0, v)), ((CLS11)new CLS1380(arrayList0, v, ˑٴ0)));
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2927(Object[] arr_object) {
        String s4;
        String[] arr_s;
        CLS877 ﹶﾞ0 = this.FLD1325;
        ﹶﾞ0.getClass();
        CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
        int v = (int)(((Integer)arr_object[1]));
        String s = (String)arr_object[2];
        if(v == 1) {
            s = (String)ᵔʾ0.MTH3204()[1];
        }
        else if(v == 2) {
            s = (String)ᵔʾ0.MTH3204()[0];
        }
        if(CLS502.MTH6934(s.toLowerCase(), new String[]{"from snsinfo"}) && CLS502.MTH6934(s, new String[]{CLS27.MTH882("snsinfoquery"), CLS27.MTH882("snsinfoquery2"), CLS27.MTH882("snsinfoquery_loadmore")})) {
            CLS29 ˎᵢ0 = ﹶﾞ0.FLD1445;
            boolean z = ˎᵢ0.MTH938("moments_container_enable", false);
            CLS139 ﹶʼ0 = ﹶﾞ0.FLD1447;
            if(z && ﹶʼ0.FLD1438.MTH6895("moments_container_enable") || ˎᵢ0.MTH938("enable_block_snsad", false)) {
                if(ˎᵢ0.MTH938("moments_container_enable", false) && ﹶʼ0.FLD1438.MTH6895("moments_container_enable")) {
                    String s1 = ˎᵢ0.MTH925("moments_container_filter", "");
                    if(!TextUtils.isEmpty(s1)) {
                        if(!TextUtils.isEmpty(s1)) {
                            int v1 = s.toLowerCase().indexOf("where");
                            String s2 = s.trim();
                            int v2 = s2.indexOf(";");
                            if(v2 != -1) {
                                s2 = s2.substring(0, v2);
                            }
                            if(v1 == -1) {
                                s = CLS182.MTH3484(4101222704982315829L, CLS182.MTH3483(s2), s1);
                            }
                            else {
                                String s3 = s2.substring(v1 + 5);
                                if(TextUtils.isEmpty(s3.trim())) {
                                    s1 = s1.substring(0, s1.lastIndexOf("AND"));
                                }
                                s = s2.substring(0, v1 + 5) + " " + s1 + s3;
                            }
                        }
                        int v3 = s.indexOf("AND  (snsId");
                        int v4 = s.indexOf("UNION");
                        if(v3 != -1 && v4 != -1) {
                            s = s.substring(0, v3) + s.substring(v4);
                        }
                        int v5 = s.indexOf("UNION");
                        int v6 = s.indexOf("order by");
                        if(v5 != -1 && v6 != -1) {
                            s = s.substring(0, v5) + s.substring(v6 - 1);
                        }
                    }
                }
                if(ˎᵢ0.MTH938("enable_block_snsad", false) && CLS502.MTH6934(s, new String[]{"AdSnsInfo"})) {
                    int v7 = s.indexOf("UNION");
                    int v8 = s.indexOf("order by");
                    if(v7 != -1 && v8 != -1) {
                        s = s.substring(0, v7) + s.substring(v8 - 1);
                    }
                }
                if(s.contains("AND SnsInfo.stringSeq >= ? ")) {
                    try {
                        s = s.replace("AND SnsInfo.stringSeq >= ? ", "");
                        arr_s = new String[1];
                        if(v == 1) {
                            s4 = (String)((Object[])ᵔʾ0.MTH3204()[2])[0];
                        }
                        else if(v == 2) {
                            s4 = ((String[])ᵔʾ0.MTH3204()[1])[0];
                        }
                        else {
                            goto label_57;
                        }
                        goto label_58;
                    }
                    catch(Throwable throwable0) {
                    }
                    CLS27.MTH893(throwable0);
                    s4 = "";
                    goto label_58;
                label_57:
                    s4 = "";
                label_58:
                    arr_s[0] = s4;
                    if(v == 1) {
                        ᵔʾ0.MTH3204()[2] = arr_s;
                    }
                    else if(v == 2) {
                        ᵔʾ0.MTH3204()[1] = arr_s;
                    }
                }
                if(!TextUtils.isEmpty(s)) {
                    switch(v) {
                        case 1: {
                            ᵔʾ0.MTH3204()[1] = s;
                            return;
                        }
                        case 2: {
                            ᵔʾ0.MTH3204()[0] = s;
                            break;
                        }
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2928(Object[] arr_object) {
        CLS877 ﹶﾞ0 = this.FLD1325;
        ﹶﾞ0.getClass();
        if("mass_repeat_sns".equals(((String)arr_object[0]))) {
            Activity activity0 = ((CLS140)ﹶﾞ0).MTH3042();
            CLS298.FLD3104.MTH4848(activity0, ((long)(((Long)arr_object[1]))));
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2929(Object[] arr_object) {
        CLS877 ﹶﾞ0 = this.FLD1325;
        ﹶﾞ0.getClass();
        Object object0 = arr_object[0];
        String s = (String)arr_object[2];
        if(ﹶﾞ0.MTH3084(s)) {
            try {
                Method method0 = object0.getClass().getDeclaredMethod("setResult", Object.class);
                method0.setAccessible(true);
                method0.invoke(object0, -1);
            }
            catch(Throwable unused_ex) {
            }
        }
        if("snsinfo".equalsIgnoreCase(s)) {
            ContentValues contentValues0 = (ContentValues)arr_object[3];
            if(contentValues0.containsKey("snsId")) {
                long v = CLS34.MTH1080(4102200514416792373L, contentValues0);
                boolean z = ﹶﾞ0.MTH3094().MTH1132(v);
                boolean z1 = ﹶﾞ0.MTH3092().MTH1191(v);
                if(z1 || z) {
                    Class class0 = CLS27.MTH894("snsAttrClass");
                    if(class0 != null) {
                        Cursor cursor0 = ﹶﾞ0.FLD1446.MTH5763(v);
                        Object object1 = null;
                        if(cursor0 != null) {
                            if(cursor0.moveToFirst()) {
                                object1 = CLS66.MTH1381(class0, cursor0.getBlob(cursor0.getColumnIndex("attrBuf")));
                            }
                            cursor0.close();
                        }
                        if(object1 != null) {
                            Object object2 = CLS66.MTH1381(class0, contentValues0.getAsByteArray("attrBuf"));
                            if(z1) {
                                List list0 = (List)CLS182.MTH3492(0x38EDFE452B3CD335L, object1);
                                CLS166.MTH3198(object2, CLS27.MTH897("snsAttrLikeListField"), list0);
                                CLS166.MTH3196(list0.size(), object2, CLS27.MTH897("snsAttrLikeFieldCount"));
                                contentValues0.put("likeFlag", ((int)(!list0.isEmpty())));
                            }
                            if(z) {
                                List list1 = (List)CLS182.MTH3492(0x38EDFE0E2B3CD335L, object1);
                                List list2 = (List)CLS182.MTH3492(0x38EDFE272B3CD335L, object2);
                                HashSet hashSet0 = new HashSet();
                                ContentValues contentValues1 = ﹶﾞ0.MTH3094().MTH1131(v);
                                if(contentValues1 != null) {
                                    String s1 = contentValues1.getAsString("CREATETIMES");
                                    if(!TextUtils.isEmpty(s1)) {
                                        for(Object object3: list2) {
                                            int v1 = CLS166.MTH3181(object3, CLS27.MTH897("snsFieldCreateTime"));
                                            if(!CLS502.MTH6934(s1, new String[]{String.valueOf(v1)})) {
                                                hashSet0.add(v1);
                                            }
                                        }
                                    }
                                }
                                for(Object object4: list1) {
                                    if(!hashSet0.contains(CLS166.MTH3181(object4, CLS27.MTH897("snsFieldCreateTime")))) {
                                        list2.add(object4);
                                    }
                                }
                                CLS166.MTH3198(object2, CLS27.MTH897("snsAttrCommentsListField"), list2);
                                CLS166.MTH3196(list2.size(), object2, CLS27.MTH897("snsAttrCommentFieldCount"));
                            }
                            contentValues0.put("attrBuf", CLS396.MTH5764(object2));
                        }
                    }
                }
            }
            if(ﹶﾞ0.FLD1445.MTH938("enable_moment_filter", false)) {
                ﹶﾞ0.MTH3086(contentValues0);
                ﹶﾞ0.MTH3082(contentValues0);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2930(Object[] arr_object) {
        CLS877 ﹶﾞ0 = this.FLD1325;
        ﹶﾞ0.getClass();
        CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
        String s = CLS412.MTH6009(((Activity)ᵔʾ0.MTH3205()));
        boolean z = CLS412.MTH6002();
        if(ﹶﾞ0.FLD1445.MTH938("timeLineUITitleShowMenu", z) && CLS502.MTH6943(s, new String[]{CLS27.MTH897("SnsTimeLineUI"), CLS27.MTH897("ImproveSnsTimelineUI")})) {
            ((TextView)CLS166.MTH3195(ᵔʾ0.MTH3205(), CLS27.MTH892("MMActivity_getMMTitleView", "getMMTitleView"), new Object[0])).setOnLongClickListener(new CLS125(ﹶﾞ0, 1));
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2931(Object[] arr_object) {
        Object object1;
        CLS877 ﹶﾞ0 = this.FLD1325;
        ﹶﾞ0.getClass();
        boolean z = CLS412.MTH6002();
        if(ﹶﾞ0.FLD1445.MTH938("timeLineUITitleShowMenu", z) && CLS27.MTH890("MMActivity_getMMTitleView")) {
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
            ((TextView)CLS166.MTH3195(object1, CLS27.MTH897("MMActivity_getMMTitleView"), new Object[0])).setOnLongClickListener(new CLS125(ﹶﾞ0, 0));
        }
    }

    private final void MTH2932(Object[] arr_object) {
        CLS877 ﹶﾞ0 = this.FLD1325;
        ﹶﾞ0.getClass();
        String s = (String)arr_object[0];
        switch(s.hashCode()) {
            case 0xB0B2EF67: {
                if(s.equals(CLS370.MTH5289(4102188986724569909L))) {
                    CLS443.MTH6314(((CLS140)ﹶﾞ0).MTH3042());
                    return;
                }
                break;
            }
            case -1099287400: {
                if(s.equals(CLS370.MTH5289(4102189313142084405L))) {
                    CLS443.MTH6315(((CLS140)ﹶﾞ0).MTH3042());
                    return;
                }
                break;
            }
            case 0xEFC9D1B5: {
                if(s.equals(CLS370.MTH5289(0x38EDE7602B3CD335L))) {
                    CLS443.MTH6310(false, ((CLS140)ﹶﾞ0).MTH3042(), null, new CLS573(4, ﹶﾞ0));
                    return;
                }
                break;
            }
            case 0xF1FDECF9: {
                if(s.equals(CLS370.MTH5289(4102189119868556085L))) {
                    CLS443.MTH6313(((CLS140)ﹶﾞ0).MTH3042());
                    return;
                }
                break;
            }
            case 0xF72002FF: {
                if(s.equals(CLS370.MTH5289(4102188918005093173L))) {
                    Activity activity0 = ((CLS140)ﹶﾞ0).MTH3042();
                    CLS298.FLD3104.MTH4848(activity0, 0L);
                    return;
                }
                break;
            }
            case 0x87D349E: {
                if(s.equals(CLS370.MTH5289(0x38EDE7022B3CD335L))) {
                    CLS443.MTH6308(((CLS140)ﹶﾞ0).MTH3042(), null);
                    return;
                }
                break;
            }
            case 0x593FC1C4: {
                if(s.equals(CLS370.MTH5289(4102189085508817717L))) {
                    CLS66.MTH1387(((CLS140)ﹶﾞ0).MTH3042());
                    return;
                }
                break;
            }
            case 0x5EF8B5BB: {
                if(s.equals(CLS370.MTH5289(4102189175703130933L))) {
                    CLS443.MTH6312(((CLS140)ﹶﾞ0).MTH3042(), false);
                    return;
                }
                break;
            }
        }
    }
}


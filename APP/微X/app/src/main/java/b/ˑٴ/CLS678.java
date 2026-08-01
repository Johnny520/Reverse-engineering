// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View.OnCreateContextMenuListener;
import android.view.View;
import android.widget.TextView;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1225;
import b.ᵔʾ.CLS292;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS502;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public final class CLS678 implements CLS35 {
    public final int FLD738;

    public CLS678(int v) {
        this.FLD738 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        Object object12;
        Object object9;
        Object object6;
        Object object30;
        Object object27;
        Object object25;
        Object object23;
        Object object20;
        Object object17;
        Object object16;
        StringBuilder stringBuilder1;
        Intent intent3;
        Object object11;
        Intent intent2;
        Object object8;
        StringBuilder stringBuilder0;
        Intent intent0;
        Object object5;
        Class class0 = Object.class;
        switch(this.FLD738) {
            case 0: {
                CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                if(((MenuItem)ᵔʾ0.MTH3204()[0]).getItemId() == 20000) {
                    ᵔʾ0.MTH3207(null);
                    Object object2 = CLS164.MTH3175(ᵔʾ0.MTH3205(), CLS27.MTH897("FavMediaGalleryUI"));
                    Object object3 = CLS166.MTH3195(CLS182.MTH3492(0x38EDAE852B3CD335L, object2), "getItem", new Object[]{CLS166.MTH3181(object2, CLS27.MTH897("FavMediaGalleryUI_indexField"))});
                    String s = (String)CLS166.MTH3195(object3, CLS27.MTH897("galleryItem_method1"), new Object[0]);
                    if(((int)(((Integer)CLS166.MTH3195(object3, CLS27.MTH897("galleryItem_method2"), new Object[0])))) == 4) {
                        CLS466.MTH6522(s, null, null);
                    }
                }
                return;
            }
            case 1: {
                if(CLS27.MTH894("dbClass1") != null) {
                    Object object4 = arr_object[0];
                    try {
                        Field field1 = object4.getClass().getDeclaredField("thisObject");
                        object5 = null;
                        if(field1 != null) {
                            field1.setAccessible(true);
                            object5 = field1.get(object4);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    try {
                        intent0 = ((Activity)object5).getIntent();
                        if(intent0.hasExtra("WeXposed_TEXT")) {
                            CLS66.MTH1431(68408, "");
                            CLS66.MTH1431(7489, 0);
                        }
                        if((intent0.hasExtra("WeXposed_TEXT") || intent0.hasExtra("wexposed_wf")) && !TextUtils.isEmpty(CLS27.MTH897("uploadEditText"))) {
                            stringBuilder0 = new StringBuilder();
                            stringBuilder0.append("");
                            if(object5 == null) {
                                goto label_35;
                            }
                            goto label_41;
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                    return;
                    try {
                    label_35:
                        Field field2 = object4.getClass().getDeclaredField("thisObject");
                        object6 = null;
                        if(field2 != null) {
                            field2.setAccessible(true);
                            object6 = field2.get(object4);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    object5 = object6;
                    try {
                    label_41:
                        stringBuilder0.append(CLS166.MTH3195(CLS166.MTH3194(object5, CLS27.MTH897("uploadEditText")), "getText", new Object[0]));
                        intent0.putExtra("Kdescription", stringBuilder0.toString());
                        return;
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                return;
            }
            case 2: {
                CLS167 ᵔʾ1 = new CLS167(arr_object[0]);
                try {
                    Intent intent1 = ((Activity)ᵔʾ1.MTH3205()).getIntent();
                    if(intent1.hasExtra("WeXposed_TEXT") || intent1.hasExtra("wexposed_wf")) {
                        if(!TextUtils.isEmpty(CLS27.MTH897("uploadEditText"))) {
                            CLS166.MTH3195(CLS166.MTH3194(ᵔʾ1.MTH3205(), CLS27.MTH897("uploadEditText")), "setText", new Object[]{intent1.getStringExtra("Kdescription")});
                        }
                        if(intent1.hasExtra("WeXposed_TEXT")) {
                            CLS166.MTH3195(ᵔʾ1.MTH3205(), CLS27.MTH897("uploadButtonEnable"), new Object[]{Boolean.TRUE});
                            return;
                        }
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 3: {
                Object object7 = arr_object[0];
                try {
                    Field field3 = object7.getClass().getDeclaredField("thisObject");
                    object8 = null;
                    if(field3 != null) {
                        field3.setAccessible(true);
                        object8 = field3.get(object7);
                    }
                }
                catch(Throwable unused_ex) {
                }
                try {
                    intent2 = ((Activity)object8).getIntent();
                    if(intent2.hasExtra("wexposed_wf") && !TextUtils.isEmpty(CLS27.MTH897("uploadEditText"))) {
                        if(object8 == null) {
                            goto label_67;
                        }
                        goto label_73;
                    }
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
                try {
                label_67:
                    Field field4 = object7.getClass().getDeclaredField("thisObject");
                    object9 = null;
                    if(field4 != null) {
                        field4.setAccessible(true);
                        object9 = field4.get(object7);
                    }
                }
                catch(Throwable unused_ex) {
                }
                object8 = object9;
                try {
                label_73:
                    CLS166.MTH3195(CLS166.MTH3194(object8, CLS27.MTH897("uploadEditText")), "setText", new Object[]{intent2.getStringExtra("Kdescription")});
                    return;
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 4: {
                Object object10 = arr_object[0];
                try {
                    Field field5 = object10.getClass().getDeclaredField("thisObject");
                    object11 = null;
                    if(field5 != null) {
                        field5.setAccessible(true);
                        object11 = field5.get(object10);
                    }
                }
                catch(Throwable unused_ex) {
                }
                try {
                    intent3 = ((Activity)object11).getIntent();
                    if(intent3.hasExtra("wexposed_wf") && !TextUtils.isEmpty(CLS27.MTH897("uploadEditText"))) {
                        stringBuilder1 = new StringBuilder();
                        stringBuilder1.append("");
                        if(object11 == null) {
                            goto label_89;
                        }
                        goto label_95;
                    }
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
                try {
                label_89:
                    Field field6 = object10.getClass().getDeclaredField("thisObject");
                    object12 = null;
                    if(field6 != null) {
                        field6.setAccessible(true);
                        object12 = field6.get(object10);
                    }
                }
                catch(Throwable unused_ex) {
                }
                object11 = object12;
                try {
                label_95:
                    stringBuilder1.append(CLS166.MTH3195(CLS166.MTH3194(object11, CLS27.MTH897("uploadEditText")), "getText", new Object[0]));
                    intent3.putExtra("Kdescription", stringBuilder1.toString());
                    return;
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            case 5: {
                if(CLS27.MTH895().MTH938("remove_voip_videoplayback_limitation", false)) {
                    Object object13 = arr_object[0];
                    try {
                        Method method0 = object13.getClass().getDeclaredMethod("setResult", class0);
                        method0.setAccessible(true);
                        method0.invoke(object13, Boolean.FALSE);
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                return;
            }
            case 6: {
                if(CLS27.MTH895().MTH938("skip_recovery", false)) {
                    Object object14 = arr_object[0];
                    try {
                        Method method1 = object14.getClass().getDeclaredMethod("setResult", class0);
                        method1.setAccessible(true);
                        method1.invoke(object14, Boolean.TRUE);
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                return;
            }
            case 7: {
                Object object15 = arr_object[0];
                Integer integer0 = CLS412.MTH6005(9000, "max_emoji");
                try {
                    Method method2 = object15.getClass().getDeclaredMethod("setResult", class0);
                    method2.setAccessible(true);
                    method2.invoke(object15, integer0);
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            case 8: {
                CLS167 ᵔʾ2 = new CLS167(arr_object[0]);
                if(((int)(((Integer)ᵔʾ2.MTH3206()))) >= 150) {
                    ᵔʾ2.MTH3207(0x95);
                }
                return;
            }
            case 9: {
                try {
                    CLS167 ᵔʾ3 = new CLS167(arr_object[0]);
                    if(ᵔʾ3.MTH3204().length == 6 && ((int)(((Integer)ᵔʾ3.MTH3204()[2]))) == -434) {
                        ᵔʾ3.MTH3204()[2] = 0;
                        ᵔʾ3.MTH3204()[1] = 0;
                        return;
                    }
                }
                catch(Throwable throwable4) {
                    CLS27.MTH893(throwable4);
                }
                return;
            }
            case 10: {
                try {
                    CLS167 ᵔʾ4 = new CLS167(arr_object[0]);
                    if(((int)(((Integer)ᵔʾ4.MTH3204()[2]))) == -434) {
                        ᵔʾ4.MTH3204()[2] = 0;
                        ᵔʾ4.MTH3204()[1] = 0;
                        return;
                    }
                }
                catch(Throwable throwable5) {
                    CLS27.MTH893(throwable5);
                }
                return;
            }
            case 11: {
                try {
                    CLS167 ᵔʾ5 = new CLS167(arr_object[0]);
                    if(((int)(((Integer)ᵔʾ5.MTH3204()[1]))) == -434) {
                        ᵔʾ5.MTH3204()[1] = 0;
                        ᵔʾ5.MTH3204()[0] = 0;
                        return;
                    }
                }
                catch(Throwable throwable6) {
                    CLS27.MTH893(throwable6);
                }
                return;
            }
            case 12: {
                try {
                    object16 = arr_object[0];
                }
                catch(Throwable throwable7) {
                    CLS27.MTH893(throwable7);
                    return;
                }
                try {
                    Field field7 = object16.getClass().getDeclaredField("args");
                    object17 = null;
                    if(field7 != null) {
                        field7.setAccessible(true);
                        object17 = field7.get(object16);
                    }
                }
                catch(Throwable unused_ex) {
                }
                try {
                    Object object18 = ((Object[])object17)[0];
                    if(CLS166.MTH3181(object18, CLS27.MTH892("emoji_errCodeField", "errCode")) == -434) {
                        CLS166.MTH3196(0, object18, CLS27.MTH892("emoji_errTypeField", "errType"));
                        CLS166.MTH3196(0, object18, CLS27.MTH892("emoji_errCodeField", "errCode"));
                        return;
                    }
                }
                catch(Throwable throwable7) {
                    CLS27.MTH893(throwable7);
                }
                return;
            }
            case 13: {
                CLS167 ᵔʾ6 = new CLS167(arr_object[0]);
                if(CLS502.MTH6934(((String)ᵔʾ6.MTH3204()[0]), new String[]{"CustomEmojiMaxSize", "CaptureEmojiMaxSize"})) {
                    ᵔʾ6.MTH3207(String.valueOf(CLS412.MTH6005(9000, "max_emoji")));
                }
                return;
            }
            case 14: {
                CLS167 ᵔʾ7 = new CLS167(arr_object[0]);
                if(CLS502.MTH6934(((String)ᵔʾ7.MTH3204()[0]), new String[]{"custom_full", "capture_full"})) {
                    ᵔʾ7.MTH3207(Boolean.FALSE);
                }
                return;
            }
            case 15: {
                if(CLS27.MTH895().MTH938("prevent_message_fold", false)) {
                    Object object19 = arr_object[0];
                    if("rconversation".equalsIgnoreCase(((String)arr_object[2])) && "message_fold".equalsIgnoreCase(((ContentValues)arr_object[3]).getAsString("username"))) {
                        try {
                            Method method3 = object19.getClass().getDeclaredMethod("setResult", class0);
                            method3.setAccessible(true);
                            method3.invoke(object19, -1L);
                        }
                        catch(Throwable unused_ex) {
                        }
                    }
                }
                return;
            }
            case 16: {
                CLS404.MTH5892(CLS27.MTH900());
                return;
            }
            case 17: {
                CLS404.MTH5916();
                return;
            }
            case 18: {
                if("config_app".equals(((String)arr_object[0]))) {
                    CLS21.FLD76.MTH831("core", "showSettingsDialog", new Object[0]);
                }
                return;
            }
            case 19: {
                CLS167 ᵔʾ8 = new CLS167(arr_object[0]);
                if(ᵔʾ8.MTH3204().length == 2) {
                    object20 = ᵔʾ8.MTH3204()[0];
                    goto label_189;
                }
                else if(ᵔʾ8.MTH3204().length == 3) {
                    object20 = ᵔʾ8.MTH3204()[1];
                label_189:
                    String s1 = (String)CLS292.MTH4772(0x38EC02442B3CD335L, "LuckyMoneyUriSpanHandler_urlField", object20);
                    if(!TextUtils.isEmpty(s1) && (CLS502.MTH6934(s1, new String[]{"/wxp/"}) || CLS502.MTH6934(s1, new String[]{"/fkzhang/"}))) {
                        ᵔʾ8.MTH3207(Boolean.TRUE);
                        String[] arr_s = s1.split("/");
                        CLS21.FLD76.MTH818("on_sysmsg_link", new Object[]{arr_s[arr_s.length - 2], arr_s[arr_s.length - 1]});
                    }
                }
                return;
            }
            case 20: {
                Context context0 = (Context)arr_object[0];
                if(context0 != null) {
                    SharedPreferences sharedPreferences0 = context0.getSharedPreferences("tinker_patch_share_config", 4);
                    if(sharedPreferences0 != null && sharedPreferences0.getInt("check_tinker_update_interval", 12) != -1) {
                        sharedPreferences0.edit().putInt("check_tinker_update_interval", -1).apply();
                    }
                }
                Class class1 = CLS27.MTH894("tinkerContextClass");
                if(class1 != null) {
                    Object object21 = CLS27.MTH890("tinkerContextClassContextField") ? CLS166.MTH3186(class1, CLS27.MTH897("tinkerContextClassContextField")) : CLS166.MTH3192(class1, CLS27.MTH892("tinkerContextClassGetContextMethod", "getContext"), new Object[0]);
                    if(context0 != null) {
                        SharedPreferences sharedPreferences1 = ((Context)object21).getSharedPreferences("patch_server_config", 0);
                        if(sharedPreferences1.getLong("fetch_patch_last_check", 0L) != -1L) {
                            sharedPreferences1.edit().putLong("fetch_patch_last_check", -1L).apply();
                        }
                    }
                }
                return;
            }
            case 21: {
                if(CLS27.MTH895().MTH928("cleanup_files")) {
                    CLS1225 ʻˏ0 = new CLS1225(5);
                    CLS40.FLD157.MTH1124(((CLS39)ʻˏ0));
                }
                return;
            }
            case 22: {
                Object object22 = arr_object[0];
                try {
                    Field field8 = object22.getClass().getDeclaredField("args");
                    object23 = null;
                    if(field8 != null) {
                        field8.setAccessible(true);
                        object23 = field8.get(object22);
                    }
                }
                catch(Throwable unused_ex) {
                }
                int v1 = ((MenuItem)((Object[])object23)[0]).getItemId();
                CLS21.FLD76.MTH825("ontimelinemenu_click", v1, new Object[0]);
                return;
            }
            case 23: {
                if(CLS27.MTH895().MTH938("snsMenuItemAltModeEnable", CLS390.MTH5621())) {
                    Object object24 = arr_object[0];
                    try {
                        Field field9 = object24.getClass().getDeclaredField("args");
                        object25 = null;
                        if(field9 != null) {
                            field9.setAccessible(true);
                            object25 = field9.get(object24);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    View view0 = (View)((Object[])object25)[0];
                    if(view0 instanceof TextView) {
                        String s2 = CLS502.MTH6936(((TextView)view0).getText());
                        String s3 = CLS182.MTH3484(0x38EC1B802B3CD335L, new StringBuilder(), s2);
                        CLS21.FLD76.MTH818(s3, new Object[0]);
                    }
                }
                return;
            }
            case 24: {
                Object object26 = arr_object[0];
                try {
                    Field field10 = object26.getClass().getDeclaredField("args");
                    object27 = null;
                    if(field10 != null) {
                        field10.setAccessible(true);
                        object27 = field10.get(object26);
                    }
                }
                catch(Throwable unused_ex) {
                }
                MenuItem menuItem0 = (MenuItem)((Object[])object27)[0];
                try {
                    Method method4 = object26.getClass().getDeclaredMethod("getResult");
                    method4.setAccessible(true);
                    Object object28 = null;
                    object28 = method4.invoke(object26);
                }
                catch(Throwable unused_ex) {
                }
                if(!((Boolean)object28).booleanValue()) {
                    int v2 = menuItem0.getItemId();
                    CLS21.FLD76.MTH825("on_launcherui_options_selected", v2, new Object[0]);
                }
                return;
            }
            case 25: {
                Object object29 = arr_object[0];
                try {
                    Field field11 = object29.getClass().getDeclaredField("args");
                    object30 = null;
                    if(field11 != null) {
                        field11.setAccessible(true);
                        object30 = field11.get(object29);
                    }
                }
                catch(Throwable unused_ex) {
                }
                int v3 = ((MenuItem)((Object[])object30)[0]).getItemId();
                CLS21.FLD76.MTH825("onfavmenu_click", v3, new Object[0]);
                return;
            }
            case 26: {
                CLS167 ᵔʾ9 = new CLS167(arr_object[0]);
                Intent intent4 = ((Activity)ᵔʾ9.MTH3205()).getIntent();
                if(intent4.hasExtra("fkz_switch")) {
                    intent4.removeExtra("fkz_switch");
                    try {
                        if(!TextUtils.isEmpty(CLS27.MTH897("logoutMethod"))) {
                            CLS166.MTH3192(ᵔʾ9.MTH3205().getClass(), CLS27.MTH897("logoutMethod"), new Object[]{ᵔʾ9.MTH3205()});
                            return;
                        }
                        if(TextUtils.isEmpty(CLS27.MTH897("logoutMethod_b"))) {
                            CLS166.MTH3195(ᵔʾ9.MTH3205(), CLS27.MTH897("logoutMethod_b"), new Object[0]);
                            return;
                        }
                    }
                    catch(Throwable throwable8) {
                        CLS27.MTH893(throwable8);
                    }
                }
                return;
            }
            case 27: {
                CLS21 ʾᵢ0 = CLS21.FLD76;
                ArrayList arrayList0 = ʾᵢ0.MTH832("itemMenu.options", new Object[0]);
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    String s4 = CLS164.MTH3170(arrayList0);
                    if(!TextUtils.isEmpty(s4)) {
                        ʾᵢ0.MTH818("itemMenu.config", new Object[]{s4, arr_object[0]});
                    }
                }
                return;
            }
            case 28: {
                CLS167 ᵔʾ10 = new CLS167(arr_object[0]);
                if(!CLS182.MTH3470(0x38EC1EDC2B3CD335L)) {
                    View.OnCreateContextMenuListener view$OnCreateContextMenuListener0 = (View.OnCreateContextMenuListener)CLS182.MTH3492(4101687368904135477L, ᵔʾ10.MTH3205());
                    CLS166.MTH3198(ᵔʾ10.MTH3205(), CLS27.MTH897("forwardMenuField1"), new CLS143(view$OnCreateContextMenuListener0, ᵔʾ10));
                }
                return;
            }
            default: {
                Object object0 = null;
                Object object1 = arr_object[0];
                try {
                    Field field0 = object1.getClass().getDeclaredField("args");
                    if(field0 != null) {
                        field0.setAccessible(true);
                        object0 = field0.get(object1);
                    }
                }
                catch(Throwable unused_ex) {
                }
                int v = ((MenuItem)((Object[])object0)[0]).getItemId();
                CLS21.FLD76.MTH825("onchatmenu_click", v, new Object[0]);
            }
        }
    }
}


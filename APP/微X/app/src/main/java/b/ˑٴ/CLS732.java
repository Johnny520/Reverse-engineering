// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuItem;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS573;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS73;
import b.ˈˈ.CLS81;
import b.ˈˈ.CLS92;
import b.ˈˈ.CLS98;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ٴـ.CLS896.CLS170;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1225;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS442.CLS441;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

public final class CLS732 implements CLS35 {
    public final int FLD902;
    public final CLS139 FLD903;

    public CLS732(CLS139 ﹶʼ0, int v) {
        this.FLD902 = v;
        this.FLD903 = ﹶʼ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        Object object9;
        Class class0;
        Cursor cursor0;
        String s24;
        int v15;
        String s14;
        int v3;
        Object object0 = null;
        CLS139 ﹶʼ0 = this.FLD903;
        switch(this.FLD902) {
            case 0: {
                ﹶʼ0.getClass();
                ﹶʼ0.FLD1434 = (String)arr_object[0];
                return;
            }
            case 1: {
                ﹶʼ0.getClass();
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
                String s = (String)((Object[])object0)[0];
                if(!TextUtils.isEmpty(s)) {
                    if(s.equals(ﹶʼ0.FLD1431.MTH925("wx_settings_keyword", "_wx"))) {
                        CLS21.FLD76.MTH831("core", "showSettingsDialog", new Object[0]);
                        return;
                    }
                    if("_resetwx".equals(s)) {
                        Activity activity0 = ﹶʼ0.MTH3026();
                        String s1 = CLS27.MTH889("reset_module");
                        CLS716 ˎˎ0 = new CLS716();
                        CLS523.MTH7160(activity0, s1, ((CLS17)new CLS783(activity0, CLS27.MTH889("reset_module") + "?", false)), ((CLS11)ˎˎ0));
                        return;
                    }
                    if("_settingswx".equals(s)) {
                        CLS523.MTH7148(ﹶʼ0.MTH3026(), "set settings", "key", "", "val", "", ((CLS16)new CLS1225(14)));
                        return;
                    }
                    if("_aboutwx".equals(s)) {
                        Object[] arr_object1 = {"configure_about_settings", CLS27.MTH904(), ﹶʼ0.MTH3026(), Boolean.FALSE, Boolean.FALSE, ""};
                        CLS21.FLD76.MTH817("donation", "settings.config", arr_object1);
                        return;
                    }
                    if("_toolbarwx".equals(s)) {
                        Object[] arr_object2 = {"config_toolbar_settings", CLS27.MTH904(), ﹶʼ0.MTH3026(), Boolean.FALSE, Boolean.FALSE, ""};
                        CLS21.FLD76.MTH817("donation", "settings.config", arr_object2);
                        return;
                    }
                    if("_clearsettingswx".equals(s)) {
                        CLS523.MTH7142(ﹶʼ0.MTH3026(), ((CLS11)new CLS809(ﹶʼ0)));
                        return;
                    }
                    if("_updatewx".equals(s)) {
                        CLS21.FLD76.MTH831("core", "checkUpdates", new Object[]{Boolean.TRUE});
                    }
                }
                return;
            }
            case 2: {
                String s2 = (String)arr_object[0];
                try {
                    Intent intent0 = new Intent();
                    intent0.putExtra("fkz_switch", true);
                    ﹶʼ0.FLD1431.MTH922(Boolean.TRUE, "fast_switch");
                    ﹶʼ0.FLD1431.MTH922(s2, "fast_switch_to");
                    if(!CLS66.MTH1450("setting", ".ui.setting.SettingsUI", intent0)) {
                        String s3 = ﹶʼ0.FLD1407.FLD3943.getAsString("wxPackageName");
                        intent0.setClassName(s3, s3 + ".plugin.setting.ui.setting.SettingsUI");
                        ﹶʼ0.MTH3026().startActivity(intent0);
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 3: {
                ﹶʼ0.getClass();
                String s4 = (String)arr_object[0];
                CLS73 ˈˊ0 = ﹶʼ0.FLD1418;
                if(!ˈˊ0.MTH1579(s4)) {
                    ˈˊ0.MTH1578(s4);
                    CLS21.FLD76.MTH818("new_contact", new Object[]{s4});
                }
                return;
            }
            case 4: {
                ﹶʼ0.getClass();
                Activity activity1 = (Activity)arr_object[0];
                ﹶʼ0.FLD1419 = new WeakReference(activity1);
                if(CLS412.MTH6009(activity1).endsWith("ImproveSnsTimelineUI")) {
                    ﹶʼ0.FLD1416 = new WeakReference(activity1);
                }
                return;
            }
            case 5: {
                ﹶʼ0.getClass();
                CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                Activity activity2 = (Activity)ᵔʾ0.MTH3205();
                String s5 = CLS412.MTH6009(activity2);
                if(!CLS412.MTH6002() && s5.endsWith("RegByMobileRegAIOUI")) {
                    CLS412.MTH6008(ﹶʼ0.MTH3026(), CLS27.MTH889("new_reg_xp_warning"), 60000L);
                    return;
                }
                if(s5.endsWith("BackupMoveRecoverUI")) {
                    ﹶʼ0.FLD1410 = true;
                    return;
                }
                if(s5.endsWith("SettingsFontUI")) {
                    ﹶʼ0.FLD1414 = true;
                    return;
                }
                if(CLS502.MTH6943(s5, new String[]{CLS27.MTH897("LoginUI"), CLS27.MTH897("LoginVoiceUI"), CLS27.MTH897("LoginHistoryUI"), CLS27.MTH897("LoginPasswordUI")})) {
                    Intent intent1 = activity2.getIntent();
                    if(intent1.hasExtra("fkz_fast_switch")) {
                        intent1.removeExtra("fkz_fast_switch");
                        CLS29 ˎᵢ0 = ﹶʼ0.FLD1431;
                        String s6 = ˎᵢ0.MTH925("fast_switch_to", "");
                        if(!TextUtils.isEmpty(s6)) {
                            String s7 = CLS27.MTH897("loginPassField");
                            String s8 = CLS27.MTH897("loginMethod");
                            if(!TextUtils.isEmpty(s7)) {
                                String s9 = CLS27.MTH897("loginMethod2");
                                String s10 = CLS412.MTH5996(ˎᵢ0.MTH925("fsa", ""));
                                try {
                                    if(!TextUtils.isEmpty(s10)) {
                                        JSONObject jSONObject0 = new JSONObject(s10);
                                        if(jSONObject0.has(s6)) {
                                            CLS166.MTH3195(CLS166.MTH3194(ᵔʾ0.MTH3205(), s7), "setText", new Object[]{jSONObject0.getString(s6)});
                                            if(!TextUtils.isEmpty(s8)) {
                                                CLS166.MTH3195(ᵔʾ0.MTH3205(), s8, new Object[0]);
                                                return;
                                            }
                                            if(!TextUtils.isEmpty(s9)) {
                                                CLS166.MTH3192(ᵔʾ0.MTH3205().getClass(), s9, new Object[]{ᵔʾ0.MTH3205()});
                                                return;
                                            }
                                        }
                                    }
                                }
                                catch(Throwable throwable1) {
                                    CLS27.MTH893(throwable1);
                                    return;
                                }
                            }
                        }
                    }
                    else {
                        ﹶʼ0.MTH3020(activity2);
                    }
                }
                try {
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 6: {
                ﹶʼ0.getClass();
                Object object2 = arr_object[0];
                try {
                    Field field1 = object2.getClass().getDeclaredField("thisObject");
                    if(field1 != null) {
                        field1.setAccessible(true);
                        object0 = field1.get(object2);
                    }
                }
                catch(Throwable unused_ex) {
                }
                String s11 = CLS412.MTH6009(((Activity)object0));
                if(s11.endsWith("BackupMoveRecoverUI")) {
                    ﹶʼ0.FLD1410 = false;
                    return;
                }
                if(s11.endsWith("SettingsFontUI")) {
                    ﹶʼ0.FLD1414 = false;
                }
                return;
            }
            case 7: {
                ﹶʼ0.getClass();
                int v = (int)(((Integer)arr_object[0]));
                CLS98 ﾞᐧ0 = new CLS98(arr_object[1]);
                int v1 = (int)(((Integer)arr_object[2]));
                Object object3 = arr_object[3];
                int v2 = (int)(((Integer)arr_object[5]));
                if(v2 == 2) {
                    v3 = 11;
                }
                else {
                    v3 = v2 == 3 ? 9 : 100;
                }
                int v4 = v3 - ﾞᐧ0.MTH1775();
                if(v4 >= 0) {
                    ArrayList arrayList0 = CLS21.FLD76.MTH832("chat.menu.options", new Object[]{object3});
                    if(arrayList0 != null && !arrayList0.isEmpty()) {
                        SparseArray sparseArray0 = new SparseArray();
                        int v5 = 0;
                        for(Object object4: arrayList0) {
                            Pair pair0 = (Pair)object4;
                            String s12 = (String)pair0.second;
                            new String("");
                            String s13 = "";
                            new String("");
                            new String("");
                            if(!TextUtils.isEmpty(s12)) {
                                if(!s12.contains("[[") || !s12.contains("]]")) {
                                    s14 = "";
                                }
                                else {
                                    int v6 = s12.indexOf("[[");
                                    int v7 = s12.lastIndexOf("]]");
                                    s14 = s12.substring(v6 + 2, v7);
                                    s12 = CLS182.MTH3495(s12, 0, v6, new StringBuilder(), v7, 2);
                                }
                                String s15 = "";
                                if(s12.contains("{") && s12.contains("}")) {
                                    int v8 = s12.indexOf("{");
                                    int v9 = s12.lastIndexOf("}");
                                    String s16 = s12.substring(v8 + 1, v9);
                                    s12 = CLS182.MTH3495(s12, 0, v8, new StringBuilder(), v9, 1);
                                    s15 = s16;
                                }
                                String s17 = "";
                                if(s12.contains("((") && s12.contains("))")) {
                                    int v10 = s12.indexOf("((");
                                    int v11 = s12.lastIndexOf("))");
                                    String s18 = s12.substring(v10 + 2, v11);
                                    s12 = CLS182.MTH3495(s12, 0, v10, new StringBuilder(), v11, 2);
                                    s17 = s18;
                                }
                                s12.getClass();
                                s15.getClass();
                                s17.getClass();
                                s13 = s14.trim();
                            }
                            if(TextUtils.isEmpty(s13)) {
                                ++v5;
                                sparseArray0.put(v5, pair0);
                            }
                            else {
                                sparseArray0.put(Integer.parseInt(s13), pair0);
                            }
                        }
                        ArrayList arrayList1 = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for(int v12 = 0; v12 < sparseArray0.size(); ++v12) {
                            Pair pair1 = (Pair)sparseArray0.valueAt(v12);
                            if(v12 < v4) {
                                arrayList1.add(pair1);
                            }
                            else {
                                arrayList2.add(pair1);
                            }
                        }
                        if(arrayList2.size() == 1) {
                            arrayList1.add(((Pair)arrayList2.get(0)));
                        }
                        int v13 = ﾞᐧ0.MTH1775();
                        if(arrayList1.isEmpty()) {
                            v15 = v13;
                        }
                        else {
                            CLS573 ⁱʽ0 = new CLS573(3, object3);
                            Iterator iterator1 = arrayList1.iterator();
                            for(int v14 = 55000; true; ++v14) {
                                v15 = v13;
                                if(!iterator1.hasNext()) {
                                    break;
                                }
                                String s19 = "";
                                Object object5 = iterator1.next();
                                String s20 = (String)((Pair)object5).second;
                                String s21 = "";
                                new String("");
                                String s22 = "";
                                new String("");
                                if(!TextUtils.isEmpty(s20)) {
                                    if(s20.contains("[[") && s20.contains("]]")) {
                                        int v16 = s20.indexOf("[[");
                                        int v17 = s20.lastIndexOf("]]");
                                        String s23 = s20.substring(v16 + 2, v17);
                                        s20 = CLS182.MTH3495(s20, 0, v16, new StringBuilder(), v17, 2);
                                        s19 = s23;
                                    }
                                    if(!s20.contains("{") || !s20.contains("}")) {
                                        s24 = "";
                                    }
                                    else {
                                        int v18 = s20.indexOf("{");
                                        int v19 = s20.lastIndexOf("}");
                                        s24 = s20.substring(v18 + 1, v19);
                                        s20 = CLS182.MTH3495(s20, 0, v18, new StringBuilder(), v19, 1);
                                    }
                                    String s25 = "";
                                    if(s20.contains("((") && s20.contains("))")) {
                                        int v20 = s20.indexOf("((");
                                        int v21 = s20.lastIndexOf("))");
                                        String s26 = s20.substring(v20 + 2, v21);
                                        s20 = CLS182.MTH3495(s20, 0, v20, new StringBuilder(), v21, 2);
                                        s25 = s26;
                                    }
                                    s19.getClass();
                                    s25.getClass();
                                    s21 = s20.trim();
                                    s22 = s24.trim();
                                }
                                v13 = v15 + 1;
                                MenuItem menuItem0 = ﾞᐧ0.MTH1770(v1, v14, ((String)((Pair)object5).first), CLS27.MTH897(s22), v15);
                                if(menuItem0 != null) {
                                    menuItem0.setOnMenuItemClickListener(new CLS136(0, ((CLS12)ⁱʽ0), s21));
                                }
                                CLS719 ˎٴ0 = new CLS719(0, ((CLS12)ⁱʽ0), s21);
                                CLS21.FLD76.MTH824("onchatmenu_click", v14, ((CLS35)ˎٴ0));
                            }
                        }
                        if(!arrayList2.isEmpty() && ﾞᐧ0.MTH1774(v) == null) {
                            CLS702 ˊᵔ0 = new CLS702(ﹶʼ0, arrayList2, object3, 3);
                            MenuItem menuItem1 = ﾞᐧ0.MTH1770(v1, v, CLS27.MTH889("appname"), CLS27.MTH897("icons_wx"), v15);
                            if(menuItem1 != null) {
                                menuItem1.setOnMenuItemClickListener(new CLS142(((CLS3)ˊᵔ0), 26));
                            }
                            CLS882 ﾞٴ0 = new CLS882(((CLS3)ˊᵔ0), 26);
                            CLS21.FLD76.MTH824("onchatmenu_click", v, ((CLS35)ﾞٴ0));
                        }
                    }
                }
                return;
            }
            case 8: {
                ﹶʼ0.getClass();
                int v22 = (int)(((Integer)arr_object[0]));
                int v23 = (int)(((Integer)arr_object[1]));
                String s27 = ﹶʼ0.FLD1434;
                try {
                    CLS371.FLD3470.getClass();
                    String s28 = CLS27.MTH882("q_db42");
                    cursor0 = CLS371.FLD3470.MTH5307(s28, new String[]{String.valueOf(v22), "0"});
                    cursor0.moveToPosition(v23);
                    class0 = CLS27.MTH894("diceClass2");
                    if(class0 != null) {
                        goto label_259;
                    }
                    goto label_265;
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                    return;
                }
                try {
                label_259:
                    Object object6 = CLS166.MTH3188(class0, new Object[0]);
                    CLS166.MTH3195(object6, CLS27.MTH897("chatroomNotifyMethod"), new Object[]{cursor0});
                    CLS66.MTH1412(object6, s27);
                    goto label_265;
                }
                catch(Throwable throwable3) {
                    try {
                        CLS27.MTH893(throwable3);
                    label_265:
                        cursor0.close();
                        return;
                    }
                    catch(Throwable throwable2) {
                    }
                }
                CLS27.MTH893(throwable2);
                return;
            }
            case 9: {
                ﹶʼ0.getClass();
                if(ﹶʼ0.FLD1431.MTH938("chatroom_container", false) || ﹶʼ0.FLD1431.MTH938("chatcontainer_enable", false) || (CLS21.FLD76.MTH830("isHiddenEnabled", new Object[0]) || CLS21.FLD76.MTH830("isThemeEnable", new Object[0]))) {
                    CLS825 ᵔˎ0 = new CLS825(ﹶʼ0);
                    CLS40.FLD157.MTH1116(((CLS39)ᵔˎ0));
                }
                return;
            }
            case 10: {
                ﹶʼ0.getClass();
                ﹶʼ0.FLD1430 = new WeakReference(((Activity)arr_object[0]));
                return;
            }
            case 11: {
                ﹶʼ0.getClass();
                ﹶʼ0.MTH3016(((String)arr_object[0]), ((String)arr_object[1]));
                return;
            }
            case 12: {
                ﹶʼ0.getClass();
                ﹶʼ0.MTH3013(((CLS170)arr_object[0]), (arr_object.length <= 1 ? false : ((Boolean)arr_object[1]).booleanValue()));
                return;
            }
            case 13: {
                ﹶʼ0.getClass();
                ﹶʼ0.MTH3023(((CLS81)arr_object[0]), ((String)arr_object[1]));
                return;
            }
            case 14: {
                ﹶʼ0.MTH3012(ﹶʼ0.FLD1434);
                return;
            }
            case 15: {
                ﹶʼ0.getClass();
                CLS167 ᵔʾ1 = new CLS167(arr_object[0]);
                int v24 = (int)(((Integer)ᵔʾ1.MTH3204()[0]));
                int v25 = (int)(((Integer)ᵔʾ1.MTH3204()[1]));
                Intent intent2 = (Intent)ᵔʾ1.MTH3204()[2];
                if(v25 == -1 && intent2 != null) {
                    HashMap hashMap0 = ﹶʼ0.FLD1425;
                    if(hashMap0.containsKey(v24)) {
                        CLS12 ᵔʾ2 = (CLS12)hashMap0.get(v24);
                        if(ᵔʾ2 != null) {
                            hashMap0.remove(v24);
                            ᵔʾ2.MTH791(intent2);
                        }
                    }
                }
                return;
            }
            case 16: {
                ﹶʼ0.getClass();
                Intent intent3 = (Intent)arr_object[0];
                int v26 = (int)(((Integer)arr_object[1]));
                ﹶʼ0.FLD1425.put(v26, ((CLS12)arr_object[2]));
                Activity activity3 = ﹶʼ0.MTH3026();
                if(activity3 != null) {
                    activity3.startActivityForResult(intent3, v26);
                }
                return;
            }
            case 17: {
                ﹶʼ0.getClass();
                String s29 = (String)arr_object[0];
                Object object7 = ﹶʼ0.FLD1413;
                if(object7 != null) {
                    CLS166.MTH3195(CLS182.MTH3492(0x38EC28C02B3CD335L, object7), "setHint", new Object[]{s29});
                }
                return;
            }
            case 18: {
                Handler handler0 = ﹶʼ0.FLD1420;
                if(handler0 != null) {
                    CLS137 ﹶʼ$ٴـ0 = ﹶʼ0.FLD1421;
                    if(ﹶʼ$ٴـ0 != null) {
                        handler0.removeCallbacks(ﹶʼ$ٴـ0);
                    }
                }
                ﹶʼ0.FLD1399 = false;
                CLS412.MTH6001(ﹶʼ0.FLD1432);
                ﹶʼ0.MTH3008(true);
                ﹶʼ0.MTH3024();
                return;
            }
            case 19: {
                ﹶʼ0.getClass();
                if(ﹶʼ0.FLD1431.MTH938("auto_respond_nudging", false)) {
                    String s30 = (String)arr_object[0];
                    String s31 = (String)arr_object[1];
                    CLS92 ⁱʽ1 = ﹶʼ0.FLD1406;
                    if(!ⁱʽ1.MTH1745(s30 + s31)) {
                        ﹶʼ0.MTH3025(s30, s31);
                        ⁱʽ1.MTH1746(s30 + s31, Boolean.TRUE);
                    }
                }
                return;
            }
            case 20: {
                ﹶʼ0.getClass();
                File file0 = new File(CLS31.MTH988(), CLS27.MTH889("appname") + "_" + CLS27.MTH904() + "_settings.json");
                if(!CLS31.MTH1001(file0)) {
                    file0 = new File(CLS27.MTH900().getCacheDir().getAbsolutePath(), CLS27.MTH889("appname") + "_" + CLS27.MTH904() + "_settings.json");
                }
                if(CLS31.MTH1001(file0) && ﹶʼ0.MTH3031(CLS31.MTH977(file0))) {
                    CLS412.MTH6013(ﹶʼ0.MTH3026(), CLS27.MTH889("import_done"));
                }
                return;
            }
            case 21: {
                ﹶʼ0.getClass();
                File file1 = new File(CLS31.MTH988(), CLS27.MTH889("appname") + "_" + CLS27.MTH904() + "_update_settings.json");
                if(CLS31.MTH1001(file1) && ﹶʼ0.MTH3031(CLS31.MTH977(file1))) {
                    CLS412.MTH6013(ﹶʼ0.MTH3026(), CLS27.MTH889("import_done"));
                }
                return;
            }
            case 22: {
                ﹶʼ0.getClass();
                File file2 = new File(CLS31.MTH988(), CLS27.MTH889("appname") + "_" + CLS27.MTH904() + "_update_settings.json");
                File file3 = new File(CLS31.MTH988(), CLS27.MTH889("appname") + "_" + CLS27.MTH904() + "_settings.json");
                if(!CLS31.MTH1001(file3)) {
                    file3 = new File(CLS27.MTH900().getCacheDir().getAbsolutePath(), CLS27.MTH889("appname") + "_" + CLS27.MTH904() + "_settings.json");
                }
                if(!CLS31.MTH1001(file2) || !CLS31.MTH1001(file3)) {
                    if(!CLS31.MTH1001(file2)) {
                        file2 = file3;
                    }
                }
                else if(file2.lastModified() <= file3.lastModified()) {
                    file2 = file3;
                }
                ﹶʼ0.MTH3031(CLS31.MTH977(file2));
                return;
            }
            case 23: {
                ﹶʼ0.getClass();
                CLS825 ᵔˎ1 = new CLS825(ﹶʼ0);
                CLS31.MTH991(ﹶʼ0.MTH3026(), ((CLS441)ᵔˎ1));
                return;
            }
            case 24: {
                this.MTH2429();
                return;
            }
            case 25: {
                this.MTH2428(arr_object);
                return;
            }
            case 26: {
                this.MTH2430(arr_object);
                return;
            }
            case 27: {
                ﹶʼ0.getClass();
                Object object8 = arr_object[0];
                try {
                    Field field2 = object8.getClass().getDeclaredField("thisObject");
                    object9 = null;
                    if(field2 != null) {
                        field2.setAccessible(true);
                        object9 = field2.get(object8);
                    }
                }
                catch(Throwable unused_ex) {
                }
                String s32 = CLS412.MTH6009(((Activity)object9));
                if(s32.endsWith("SnsTimeLineUI") || s32.endsWith("ImproveSnsTimelineUI")) {
                    boolean z = CLS412.MTH6002();
                    if(!ﹶʼ0.FLD1431.MTH938("hideTimeLineUIOptions", z)) {
                        try {
                            Field field3 = object8.getClass().getDeclaredField("args");
                            if(field3 != null) {
                                field3.setAccessible(true);
                                object0 = field3.get(object8);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        Menu menu0 = (Menu)((Object[])object0)[0];
                        ArrayList arrayList3 = CLS21.FLD76.MTH832("snstimelineui.optionsmenu.options", new Object[0]);
                        if(arrayList3 != null && !arrayList3.isEmpty()) {
                            int v27 = 20001;
                            for(Object object10: arrayList3) {
                                menu0.add(0, v27, 0, ((CharSequence)((Pair)object10).first)).setOnMenuItemClickListener(new CLS134(2, ((Pair)object10)));
                                ++v27;
                            }
                        }
                    }
                }
                return;
            }
            case 28: {
                this.MTH2427(arr_object);
                return;
            }
            default: {
                ﹶʼ0.getClass();
                if(ﹶʼ0.FLD1431.MTH938("MultiWebView", false) && !CLS27.MTH885().getBoolean("settings_multi_webview", false)) {
                    CLS27.MTH885().edit().putBoolean("settings_multi_webview", true).commit();
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2427(Object[] arr_object) {
        Object object1;
        CLS139 ﹶʼ0 = this.FLD903;
        ﹶʼ0.getClass();
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
        if(CLS412.MTH6009(((Activity)object1)).equals(CLS27.MTH897("LauncherUI"))) {
            Intent intent0 = ((Activity)object1).getIntent();
            if(intent0.hasExtra("donate")) {
                intent0.removeExtra("donate");
            }
            if(intent0.hasExtra("LauncherUI.Show.Update.DialogMsg")) {
                boolean z = CLS412.MTH6002();
                if(ﹶʼ0.FLD1431.MTH938("prevent_update_enable", z)) {
                    intent0.putExtra("LauncherUI.Show.Update.DialogMsg", "");
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2428(Object[] arr_object) {
        this.FLD903.getClass();
        CLS29 ˎᵢ0 = this.FLD903.FLD1431;
        if(ˎᵢ0.MTH938("fake_region_enable", false)) {
            CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
            Class class0 = CLS27.MTH894("Region");
            if(class0 != null) {
                try {
                    Object[] arr_object1 = (Object[])ᵔʾ0.MTH3206();
                    if(arr_object1 != null && arr_object1.length != 0) {
                        ArrayList arrayList0 = ˎᵢ0.MTH929("regioncode_%");
                        if(!arrayList0.isEmpty()) {
                            HashSet hashSet0 = new HashSet();
                            for(int v = 0; v < arr_object1.length; ++v) {
                                hashSet0.add(((String)CLS166.MTH3195(arr_object1[v], "getName", new Object[0])));
                            }
                            ArrayList arrayList1 = new ArrayList();
                            for(Object object0: arrayList0) {
                                Pair pair0 = (Pair)object0;
                                if(!hashSet0.contains(pair0.second)) {
                                    hashSet0.add(((String)pair0.second));
                                    arrayList1.add(((String)pair0.second));
                                }
                            }
                            if(!arrayList1.isEmpty()) {
                                Object[] arr_object2 = (Object[])Array.newInstance(class0, arr_object1.length + arrayList1.size());
                                for(int v1 = 0; v1 < arrayList1.size(); ++v1) {
                                    Object object1 = CLS166.MTH3188(class0, new Object[0]);
                                    String s = (String)arrayList1.get(v1);
                                    CLS166.MTH3195(object1, "setName", new Object[]{s});
                                    CLS166.MTH3195(object1, "setCode", new Object[]{s});
                                    arr_object2[v1] = object1;
                                }
                                System.arraycopy(arr_object1, 0, arr_object2, arrayList1.size(), arr_object1.length);
                                ᵔʾ0.MTH3207(arr_object2);
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

    // 此方法包含解密的字符串
    private final void MTH2429() {
        this.FLD903.getClass();
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("version", 2);
            jSONObject0.put("module", "wechatxposed");
            jSONObject0.put("wxdata", this.FLD903.FLD1431.MTH940());
            CLS21.FLD76.MTH819("export_settings", new Object[]{jSONObject0});
            SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyyMMddHHmmss");
            CLS31.MTH999(this.FLD903.MTH3026(), jSONObject0.toString(), CLS27.MTH889("appname") + "_" + CLS27.MTH904() + "_" + simpleDateFormat0.format(new Date(System.currentTimeMillis())) + "_settings.json");
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2430(Object[] arr_object) {
        Object object2;
        CLS139 ﹶʼ0 = this.FLD903;
        ﹶʼ0.getClass();
        Object object0 = arr_object[0];
        Object object1 = null;
        try {
            Field field0 = object0.getClass().getDeclaredField("thisObject");
            object2 = null;
            if(field0 != null) {
                field0.setAccessible(true);
                object2 = field0.get(object0);
            }
        }
        catch(Throwable unused_ex) {
        }
        Object object3 = CLS164.MTH3175(object2, CLS27.MTH897("snsAttrClass"));
        if(object3 == null) {
            try {
                if(CLS27.MTH890("snsSyncClass2_field1")) {
                    if(object2 == null) {
                        goto label_13;
                    }
                    goto label_18;
                }
                goto label_23;
            }
            catch(Throwable throwable0) {
                goto label_22;
            }
            try {
            label_13:
                Field field1 = object0.getClass().getDeclaredField("thisObject");
                if(field1 != null) {
                    field1.setAccessible(true);
                    object1 = field1.get(object0);
                }
            }
            catch(Throwable unused_ex) {
            }
            object2 = object1;
            try {
            label_18:
                byte[] arr_b = (byte[])CLS166.MTH3195(CLS166.MTH3194(CLS166.MTH3194(CLS166.MTH3194(object2, CLS27.MTH897("snsSyncClass2_field1")), CLS27.MTH897("snsSyncClass2_field2")), CLS27.MTH897("snsSyncClass2_field3")), CLS27.MTH897("snsSyncClass2_field3_toByteArray"), new Object[0]);
                object3 = CLS66.MTH1381(CLS27.MTH894("snsAttrClass"), arr_b);
            }
            catch(Throwable throwable0) {
            label_22:
                CLS27.MTH893(throwable0);
            }
        }
    label_23:
        if(object3 == null) {
        label_28:
            if(ﹶʼ0.FLD1431.MTH938("timeline_sync_enable", false) && (!ﹶʼ0.FLD1431.MTH938("moments_forward_enable", CLS412.MTH6002()) || !ﹶʼ0.FLD1438.MTH6897()) && !CLS404.MTH5901()) {
                CLS66.MTH1373();
            }
            if(object3 != null) {
                String s = (String)CLS182.MTH3492(0x38EC19742B3CD335L, object3);
                long v1 = CLS166.MTH3185(object3, CLS27.MTH897("snsSyncField2"));
                CLS21.FLD76.MTH819("on_sns_sync", new Object[]{s, v1});
            }
        }
        else {
            long v = CLS166.MTH3185(object3, CLS27.MTH897("snsSyncField2"));
            CLS73 ˈˊ0 = ﹶʼ0.FLD1436;
            if(!ˈˊ0.MTH1579(v)) {
                ˈˊ0.MTH1578(v);
                goto label_28;
            }
        }
    }
}


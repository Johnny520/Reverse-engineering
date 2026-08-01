// Decompiled by JEB v5.42.0.202606242140

package c.ᵎʾ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import c.ˉˆ.CLS59;
import c.ˉˆ.CLS64;
import c.ˉˆ.CLS67;
import c.ˉˆ.CLS70.CLS69;
import c.ˉˆ.CLS70;
import c.ˊﹶ.CLS98;
import c.ˏי.CLS110;
import c.ˏי.CLS111;
import c.ˏי.CLS112;
import c.ˏי.CLS113;
import c.ˏᴵ.CLS126;
import c.ˏᵎ.CLS138;
import c.ˏᵎ.CLS139;
import c.ˏᵎ.CLS142.CLS141;
import c.ˏᵎ.CLS144;
import c.ˏᵎ.CLS163.CLS162;
import c.ˏᵎ.CLS170;
import c.ˏᵎ.CLS176;
import c.ˏᵎ.CLS179;
import c.ˏᵎ.CLS180;
import c.ˏᵎ.CLS184;
import c.ˏᵎ.CLS185;
import c.ˏᵎ.CLS191;
import c.ˏᵎ.CLS194;
import c.ˏᵎ.CLS197;
import c.ˏᵎ.CLS198;
import c.ˏᵎ.CLS205;
import c.ˏᵎ.CLS224;
import c.יⁱ.CLS257;
import c.ﹶˆ.CLS343;
import c.ﹶˆ.CLS345;
import com.android.xc.Wrapper.XpMethodHook;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

// entry point, shell apk calls set
public class CLS723 implements CLS303 {
    public final String FLD1386;
    public boolean FLD1387;
    public CLS303 FLD1388;
    public WeakReference FLD1389;
    public WeakReference FLD1390;
    public CLS139 FLD1391;
    public WeakReference FLD1392;
    public boolean FLD1393;
    public final WeakReference FLD1394;
    public CLS198 FLD1395;
    public final ContentValues FLD1396;

    // 此方法包含解密的字符串
    public CLS723(Context context0, Context context1, ContentValues contentValues0, String s) {
        this.FLD1387 = false;
        this.FLD1393 = false;
        this.FLD1394 = new WeakReference(context0);
        this.FLD1396 = contentValues0;
        this.FLD1386 = s;
        try {
            if(context1 != null) {
                this.FLD1389 = new WeakReference(context1);
            }
            contentValues0.put("coreVersionCode", 0xD4);
            this.FLD1391 = new CLS139(contentValues0, context1);
            CLS70.MTH1131().MTH1151(this.FLD1391);
            CLS198 ᵎˑ0 = new CLS198(context1, this.FLD1391.MTH2124());
            this.FLD1395 = ᵎˑ0;
            ᵎˑ0.MTH2955(CLS176.MTH2579(new File(s, "534a9729a0c461cbd7a4379978fb742")));
            CLS70.MTH1131().MTH1151(this.FLD1395);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // c.ᵎʾ.CLS303
    public void altHook(ClassLoader classLoader0) {
        if(!this.MTH4332(classLoader0)) {
            CLS185.MTH2711("wx core init failed");
            return;
        }
        if(this.FLD1387) {
            this.MTH4329(classLoader0);
            return;
        }
        CLS303 ⁱˋ0 = this.FLD1388;
        if(ⁱˋ0 == null) {
            return;
        }
        ⁱˋ0.altHook(classLoader0);
    }

    // 去混淆评级： 低(23)
    // 此方法包含解密的字符串
    public ContentValues getCoreInfo() {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("versionName", "42");
        contentValues0.put("versionCode", 0xD4);
        contentValues0.put("flavor", "free");
        contentValues0.put("type", "release");
        return contentValues0;
    }

    // 此方法包含解密的字符串
    @Override  // c.ᵎʾ.CLS303
    public boolean hook(ClassLoader classLoader0) {
        if(!this.MTH4332(classLoader0)) {
            CLS185.MTH2711("wx core init failed");
            return false;
        }
        return this.MTH4321(classLoader0);
    }

    public void setXposed(Class class0, Class class1, Class class2, Class class3, Class class4, Class class5) {
        CLS111.setXposedHelpersClass(class0);
        CLS111.setXposedBridgeClass(class1);
        CLS111.setXC_MethodHookClass(class2);
        CLS111.setXSharedPreferencesClass(class5);
        CLS111.setCLS234(class4);
        CLS111.setCLS235(class3);
    }

    public Activity MTH4305() {
        WeakReference weakReference0 = this.FLD1390;
        if(weakReference0 != null) {
            return (Activity)weakReference0.get();
        }
        return this.FLD1392 == null ? null : ((Activity)this.FLD1392.get());
    }

    // 检测为 Lambda 实现
    public static void MTH4306(Activity activity0) [...]

    // 此方法包含解密的字符串
    public static void MTH4307(Activity activity0) {
        String s = CLS184.MTH2685(1);
        if(!TextUtils.isEmpty(s)) {
            CLS144.MTH2201(activity0, "", s, true, true, null);
            CLS184.MTH2667(activity0, s);
            CLS184.MTH2702(activity0, "");
        }
    }

    public Context MTH4308() {
        return (Context)this.FLD1394.get();
    }

    // 此方法包含解密的字符串
    public static void MTH4310(Activity activity0) {
        Intent intent0 = new Intent();
        if(!CLS299.MTH4279(CLS98.MTH1289("LoginAsExDeviceUI"), intent0)) {
            intent0.setClassName(activity0, CLS98.MTH1289("LoginAsExDeviceUI"));
            activity0.startActivity(intent0);
        }
    }

    // 此方法包含解密的字符串
    public final boolean MTH4312(ClassLoader classLoader0) {
        try {
            if(TextUtils.isEmpty(this.FLD1386)) {
                return false;
            }
            CLS98.MTH1319(classLoader0);
            CLS64.MTH1072().MTH1062(classLoader0);
            Context context0 = this.MTH4308();
            SharedPreferences sharedPreferences0 = context0.getSharedPreferences(this.FLD1391.MTH2123() + "_preferences", 4);
            if(sharedPreferences0 == null) {
                Context context1 = CLS299.MTH4271();
                if(context1 != null) {
                    sharedPreferences0 = context1.getSharedPreferences(this.FLD1391.MTH2123() + "_preferences", 4);
                    context0 = context1;
                }
            }
            CLS98.MTH1283(sharedPreferences0);
            CLS98.MTH1294(this.MTH4318());
            CLS98.MTH1303(context0);
            CLS184.MTH2701(this.FLD1391);
            if(!CLS98.MTH1271(this.FLD1386, this.FLD1391, context0)) {
                return false;
            }
            CLS67.MTH1093().MTH1109().MTH1096();
            CLS70.MTH1131().MTH1151(new CLS59(context0, true, CLS224.MTH3090((this.FLD1395.MTH2950() + "9n4hZkF"))));
            CLS64.MTH1072().MTH1052();
            CLS98.MTH1334();
            CLS59 ʼˊ0 = CLS98.MTH1297();
            String s = CLS98.MTH1316();
            if(ʼˊ0.MTH994("manual_language_selection", false)) {
                s = ʼˊ0.MTH1015("current_language", s);
            }
            CLS98.MTH1331(s, this.FLD1391.MTH2115());
            CLS170.MTH2460().MTH2450(this.FLD1391);
            if(CLS176.MTH2570(CLS170.MTH2460().MTH2503()) && !ʼˊ0.MTH994("disable_safemode", false)) {
                String s1 = ʼˊ0.MTH1015("safe_mode", "");
                if(!TextUtils.isEmpty(s1)) {
                    long v = System.currentTimeMillis() - Long.parseLong(s1, 16);
                    if(v < 120000L) {
                        int v1 = ʼˊ0.MTH996("safe_mode_cnt");
                        CLS185.MTH2711(("safe mode fail count: " + v1));
                        CLS185.MTH2711(("safe mode time diff: " + v));
                        if(v > 20000L || v1 >= 3) {
                            this.FLD1387 = true;
                        }
                    }
                }
                if(!this.FLD1387) {
                    ʼˊ0.MTH984("safe_mode", Long.toHexString(System.currentTimeMillis()));
                }
            }
            CLS70.MTH1131().MTH1139(((CLS69)() -> CLS67.MTH1093().MTH1087(this.MTH4308())));
            return true;
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return false;
        }
    }

    private void MTH4313(Object[] arr_object) {
        CLS70.MTH1131().MTH1127(((CLS69)() -> CLS126.MTH1938().MTH1959(this.MTH4305())));
    }

    public Context MTH4318() {
        return this.FLD1389 == null ? null : ((Context)this.FLD1389.get());
    }

    public static void MTH4319(Activity activity0) {
        CLS723.MTH4307(activity0);
    }

    // 此方法包含解密的字符串
    public final boolean MTH4321(ClassLoader classLoader0) {
        if(this.FLD1387) {
            this.MTH4329(classLoader0);
            return true;
        }
        try {
            if(CLS184.MTH2668(this.MTH4308(), CLS98.MTH1305())) {
                CLS185.MTH2711(("module load disabled: " + CLS98.MTH1305()));
                this.MTH4350(classLoader0, 1);
                return true;
            }
            if(this.FLD1388 != null && this.FLD1388.hook(classLoader0)) {
                CLS185.MTH2711(("wxcore (" + 0xD4 + ") loaded successfully!"));
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        this.MTH4350(classLoader0, 0);
        return true;
    }

    public static void MTH4324() {
        CLS98.MTH1276();
        CLS180.MTH2650();
    }

    // 去混淆评级： 低(29)
    // 此方法包含解密的字符串
    public final void MTH4327(Activity activity0, int v) {
        public class CLS719 implements CLS343 {
            public final CLS723 FLD1381;

            @Override  // c.ﹶˆ.CLS343
            public void MTH4826() {
            }

            // 此方法包含解密的字符串
            @Override  // c.ﹶˆ.CLS343
            public void MTH4827() {
                try {
                    String s = CLS98.MTH1305();
                    JSONArray jSONArray0 = new JSONArray(CLS184.MTH2688(CLS723.this.MTH4308()));
                    JSONArray jSONArray1 = new JSONArray();
                    for(int v = 0; v < jSONArray0.length(); ++v) {
                        JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                        if(!jSONObject0.has("wxid") || !s.equals(jSONObject0.getString("wxid"))) {
                            jSONArray1.put(jSONObject0);
                        }
                    }
                    CLS184.MTH2675(CLS723.this.MTH4308(), jSONArray1.toString());
                    CLS180.MTH2650();
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }

        if(v == 0) {
            CLS138.MTH2073(activity0, "Module load error", "重置模块\nReset module?");
            return;
        }
        switch(v) {
            case 1: {
                CLS144.MTH2165(activity0, "Module load disabled", "开启模块？\nEnable module?", ((CLS343)new CLS719(this)));
                return;
            }
            case 4: {
                CLS98.MTH1297().MTH986("safe_mode");
                CLS98.MTH1297().MTH986("safe_mode_cnt");
                CLS126.MTH1938().MTH1959(activity0);
            }
        }
    }

    public static void MTH4328(Object[] arr_object) {
        CLS70.MTH1131().MTH1127(((CLS69)() -> CLS126.MTH1938().MTH1949()));
    }

    // 此方法包含解密的字符串
    public final void MTH4329(ClassLoader classLoader0) {
        public class CLS721 extends XpMethodHook {
            public final CLS723 FLD1384;

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                CLS194.MTH2881().MTH2872("after_Activity_onCreate", new Object[]{object0});
                Activity activity0 = (Activity)new CLS113(object0).MTH1635();
                CLS194.MTH2881().MTH2872("set_current_activity", new Object[]{activity0});
                WeakReference weakReference0 = new WeakReference(activity0);
                CLS723.this.FLD1390 = weakReference0;
                String s = CLS184.MTH2692(activity0);
                if(s.endsWith("LauncherUI")) {
                    Intent intent0 = activity0.getIntent();
                    if(intent0.hasExtra("gotosettings")) {
                        intent0.removeExtra("gotosettings");
                        CLS126.MTH1938().MTH1959(activity0);
                    }
                }
                else if(s.endsWith("BindMobilePolicyUI")) {
                    if(CLS98.MTH1297().MTH994("auto_close_bindmobile", true)) {
                        try {
                            activity0.finish();
                            return;
                        label_16:
                            CLS112.MTH1630(CLS112.MTH1620(new String[]{CLS98.MTH1289("addTextOptionMenu"), "addTextOptionMenu", "a"}, activity0, Void.TYPE, new Object[]{Integer.TYPE, String.class, MenuItem.OnMenuItemClickListener.class}), activity0, new Object[]{2000, "", (MenuItem menuItem0) -> {
                                try {
                                    activity0.finish();
                                }
                                catch(Throwable throwable0) {
                                    CLS185.MTH2708(throwable0);
                                }
                                return true;
                            }});
                            return;
                        }
                        catch(Throwable throwable0) {
                        }
                    }
                    else {
                        goto label_16;
                    }
                    CLS185.MTH2708(throwable0);
                }
            }

            // 检测为 Lambda 实现
            public static boolean MTH4297(Activity activity0, MenuItem menuItem0) [...]
        }


        public class CLS722 extends XpMethodHook {
            public final CLS723 FLD1385;

            // 去混淆评级： 低(37)
            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                if(CLS98.MTH1297().MTH994("core_ejecting", false)) {
                    return;
                }
                CLS113 ﾞⁱ0 = new CLS113(object0);
                String s = ﾞⁱ0.MTH1635().toString();
                if(s.contains("/databases/") && (s.contains("FKZ_") || s.contains("WX_")) || CLS197.MTH2926(s, new String[]{"wx6_", "wx7_", "", "WechatXposed"}) && CLS112.MTH1607(new String[]{"com.tencent.mm", CLS98.MTH1289("CleanWxTaskClass")})) {
                    ﾞⁱ0.MTH1637(Boolean.TRUE);
                }
            }
        }

        CLS185.MTH2711("enter safe mode");
        CLS70.MTH1131().MTH1144(((CLS69)new CLS799(this)), 10000L);
        CLS191.MTH2830().MTH2829(CLS98.MTH1305());
        CLS191.MTH2830().MTH2844();
        Object[] arr_object = {Bundle.class, CLS111.MTH1590(new CLS721(this))};
        CLS111.MTH1553(Activity.class, "onCreate", arr_object);
        Object[] arr_object1 = {CLS111.MTH1590(new CLS722(this))};
        CLS112.MTH1617(File.class, "delete", arr_object1);
        if(!CLS98.MTH1297().MTH994("hookFail", false)) {
            CLS64.MTH1072().MTH1067();
        }
        CLS194.MTH2881().MTH2870("getCurrentActivity").MTH2899("getCurrentActivity", ((CLS162)new CLS771(this))).MTH2905("showSettingsDialog", ((CLS141)new CLS705(this))).MTH2905("refreshSettings", ((CLS141)new CLS686())).MTH2905("refreshSettingsText,on_update_progress", ((CLS141)new CLS694())).MTH2905("a.on_MMActivity_onCreate", ((CLS141)new CLS715())).MTH2905("onIsTabletMethod1", ((CLS141)new CLS759())).MTH2905("b.on_chattingUIFragment_onResume,on_MainUI_onResume", ((CLS141)new CLS784()));
        this.MTH4350(classLoader0, 4);
    }

    // 检测为 Lambda 实现
    public static void MTH4330() [...]

    public final boolean MTH4332(ClassLoader classLoader0) {
        if(this.FLD1393) {
            return true;
        }
        this.FLD1393 = true;
        if(this.MTH4312(classLoader0)) {
            try {
                this.MTH4334();
                return true;
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return false;
    }

    private void MTH4333() {
        CLS170.MTH2460().MTH2455(this.MTH4318());
    }

    public void MTH4334() {
    }

    // 去混淆评级： 低(22)
    // 此方法包含解密的字符串
    public static void MTH4335(Object[] arr_object) {
        CLS113 ﾞⁱ0 = new CLS113(arr_object[0]);
        Activity activity0 = (Activity)ﾞⁱ0.MTH1635();
        String s = CLS184.MTH2692(activity0);
        if(!s.endsWith("LoginPasswordUI") && !s.endsWith("LoginHistoryUI") && !s.endsWith("MobileInputUI") && !s.endsWith("LoginUI") || CLS205.MTH2971()) {
            return;
        }
        if(TextUtils.isEmpty(CLS98.MTH1305())) {
            return;
        }
        String s1 = CLS98.MTH1332("addTextOptionMenu", "a");
        CLS110.MTH1544(ﾞⁱ0.MTH1635(), s1, new Object[]{2000, "", (MenuItem menuItem0) -> // 此方法包含解密的字符串
        {
            CLS257 ﾞⁱ0 = new CLS257(activity0);
            if(!CLS179.MTH2616() && CLS98.MTH1329("LoginAsExDeviceUI")) {
                ﾞⁱ0.MTH3382("tablet_login", ((CLS345)new CLS706(activity0)));
            }
            if(CLS191.MTH2830().MTH2842()) {
                ﾞⁱ0.MTH3382("transfer_advanced", ((CLS345)new CLS792(activity0)));
            }
            ﾞⁱ0.MTH3382("restart_wechat", ((CLS345)new CLS765())).MTH3382("reset_module", ((CLS345)new CLS678())).MTH3380();
            return true;
        }});
    }

    // 此方法包含解密的字符串
    public final boolean MTH4336(Activity activity0, Class class0, Class class1, String s, Object object0) {
        int v;
        if(class0 != null && class1 != null) {
            try {
                Object object1 = CLS112.MTH1611(class0, object0, "preference");
                if(object1 == null) {
                    return false;
                }
                Method method0 = CLS112.MTH1608(object1, CLS98.MTH1332("PreferenceAdapterIndexOfMethod", "indexOf"), Integer.TYPE, new Object[]{String.class});
                if(method0 == null) {
                    LinkedList linkedList0 = (LinkedList)CLS112.MTH1605(object1, LinkedList.class);
                    v = linkedList0 == null ? -1 : linkedList0.indexOf(s);
                }
                else {
                    v = (int)(((Integer)CLS112.MTH1630(method0, object1, new Object[]{s})));
                }
                if(v != -1) {
                    return false;
                }
                Object object2 = CLS110.MTH1541(class1, new Object[]{activity0});
                CLS110.MTH1544(object2, CLS98.MTH1332("PreferenceSetTitleMethod", "setTitle"), new Object[]{"X"});
                CLS110.MTH1544(object2, CLS98.MTH1332("PreferenceSetKeyMethod", "setKey"), new Object[]{s});
                CLS110.MTH1544(object1, CLS98.MTH1332("pref_adapter_set", "a"), new Object[]{object2, 1});
                return true;
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return false;
    }

    // 去混淆评级： 低(35)
    // 此方法包含解密的字符串
    public static void MTH4337(Object[] arr_object) {
        boolean z = CLS112.MTH1607(new String[]{"LoginAsExDeviceUI"});
        if(!CLS179.MTH2616() && (z || CLS98.MTH1297().MTH994("force_tablet_mode_enable", false) && !CLS112.MTH1607(new String[]{"ChatFooter", "FinderLiveFindPageUI", CLS98.MTH1289("setLivePostBtnVisibleMethod")}))) {
            new CLS113(arr_object[0]).MTH1637(Boolean.TRUE);
        }
    }

    // 检测为 Lambda 实现
    public static void MTH4338() [...]

    // 检测为 Lambda 实现
    private void MTH4340() [...]

    public static void MTH4341(CLS723 ˏᵎ0) {
        ˏᵎ0.MTH4333();
    }

    // 此方法包含解密的字符串
    public static void MTH4342(Object[] arr_object) {
        CLS98.MTH1297().MTH986("safe_mode");
        CLS98.MTH1297().MTH986("safe_mode_cnt");
    }

    public static void MTH4345(Object[] arr_object) {
        CLS70.MTH1131().MTH1127(((CLS69)() -> CLS126.MTH1938().MTH1922()));
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    public static boolean MTH4347(Activity activity0, MenuItem menuItem0) [...]

    private Object MTH4349(Object[] arr_object) {
        WeakReference weakReference0 = this.FLD1390;
        if(weakReference0 != null) {
            return weakReference0.get();
        }
        return this.FLD1392 == null ? null : this.FLD1392.get();
    }

    // 此方法包含解密的字符串
    public final void MTH4350(ClassLoader classLoader0, int v) {
        public class CLS718 extends XpMethodHook {
            public final int FLD1377;
            public final CLS723 FLD1378;
            public final Class FLD1379;
            public final Class FLD1380;

            public CLS718(Class class0, Class class1, int v) {
                this.FLD1379 = class0;
                this.FLD1380 = class1;
                this.FLD1377 = v;
                super();
            }

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                CLS113 ﾞⁱ0 = new CLS113(object0);
                Activity activity0 = (Activity)ﾞⁱ0.MTH1635();
                WeakReference weakReference0 = new WeakReference(activity0);
                CLS723.this.FLD1392 = weakReference0;
                Object object1 = ﾞⁱ0.MTH1635();
                if(CLS723.this.MTH4336(activity0, this.FLD1379, this.FLD1380, "WX", object1)) {
                    return;
                }
                CLS723.this.MTH4327(activity0, this.FLD1377);
            }
        }


        public class CLS720 extends XpMethodHook {
            public final int FLD1382;
            public final CLS723 FLD1383;

            public CLS720(int v) {
                this.FLD1382 = v;
                super();
            }

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                Context context0;
                String s = null;
                Object object1 = new CLS113(object0).MTH1638()[1];
                Activity activity0 = null;
                try {
                    if(CLS112.MTH1604(object1, CLS98.MTH1332("pref_getKeyMethod", "getKey"))) {
                        s = (String)CLS110.MTH1544(object1, CLS98.MTH1332("pref_getKeyMethod", "getKey"), new Object[0]);
                    }
                }
                catch(Throwable unused_ex) {
                }
                if(TextUtils.isEmpty(s)) {
                    try {
                        String s1 = (String)CLS110.MTH1543(object1, CLS98.MTH1332("pref_field_key", "mKey"));
                        if(!TextUtils.isEmpty(s1)) {
                            s = s1;
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                try {
                    if(!TextUtils.isEmpty(s)) {
                        if(!"WX".equals(s)) {
                            return;
                        }
                    }
                    else if(!new HashSet(CLS112.MTH1609(object1, String.class)).contains("WX")) {
                        return;
                    }
                    goto label_14;
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                    return;
                }
                return;
                try {
                label_14:
                    context0 = null;
                    if(CLS112.MTH1604(object1, CLS98.MTH1332("pref_getContextMethod", "getContext"))) {
                        context0 = (Context)CLS110.MTH1544(object1, CLS98.MTH1332("pref_getContextMethod", "getContext"), new Object[0]);
                    }
                label_17:
                    if(context0 == null) {
                        goto label_18;
                    }
                    goto label_19;
                }
                catch(Throwable unused_ex) {
                    goto label_17;
                }
                try {
                label_18:
                    context0 = (Context)CLS112.MTH1605(object1, Context.class);
                }
                catch(Throwable unused_ex) {
                }
                try {
                label_19:
                    activity0 = context0 instanceof Activity ? ((Activity)context0) : ((Activity)CLS723.this.FLD1392.get());
                }
                catch(Throwable unused_ex) {
                }
                if(activity0 == null) {
                    return;
                }
                try {
                    CLS723.this.MTH4327(activity0, this.FLD1382);
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }

        Class class1;
        String s = this.MTH4308().getPackageName();
        Class class0 = CLS112.MTH1625((s + ".plugin.setting.ui.setting.SettingsUI"), classLoader0);
        if(class0 == null) {
            return;
        }
        if(CLS98.MTH1329("MMPreferenceVAS")) {
            class1 = CLS64.MTH1072().MTH1061("MMPreferenceVAS");
            if(class1 == null) {
                class1 = CLS112.MTH1625((s + ".ui.base.preference.MMPreferenceVAS"), classLoader0);
            }
        }
        else {
            class1 = this.FLD1391.MTH2120() < 2060 || !CLS112.MTH1598(classLoader0, s + ".ui.base.preference.MMPreferenceVAS") ? null : CLS112.MTH1625((s + ".ui.base.preference.MMPreferenceVAS"), classLoader0);
            if(class1 == null) {
                class1 = CLS64.MTH1072().MTH1061("MMPreference");
            }
        }
        if(class1 == null) {
            class1 = CLS112.MTH1625((s + ".ui.base.preference.MMPreference"), classLoader0);
        }
        Class class2 = CLS64.MTH1072().MTH1061("preferenceClass");
        if(class2 == null) {
            class2 = CLS112.MTH1625((s + ".ui.base.preference.Preference"), classLoader0);
        }
        try {
            new String("WX");
            CLS112.MTH1617(class0, "onCreate", new Object[]{Bundle.class, CLS111.MTH1590(new CLS718(this, class1, class2, v))});
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        try {
            Method method0 = CLS112.MTH1602(class0, null, Boolean.TYPE, new Object[]{null, "Preference"});
            if(method0 != null) {
                CLS111.MTH1583(method0, CLS111.MTH1590(new CLS720(this, v)));
            }
        }
        catch(Throwable throwable1) {
            CLS185.MTH2708(throwable1);
        }
    }
}


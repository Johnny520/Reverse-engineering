// Decompiled by JEB v5.42.0.202606242140

package c.ᵎʾ;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import c.ʾˎ.CLS41;
import c.ˉˆ.CLS59;
import c.ˉˆ.CLS61;
import c.ˉˆ.CLS64;
import c.ˉˆ.CLS67;
import c.ˉˆ.CLS70.CLS69;
import c.ˉˆ.CLS70;
import c.ˊﹶ.CLS98;
import c.ˎﹳ.CLS107;
import c.ˏי.CLS110;
import c.ˏי.CLS111;
import c.ˏי.CLS112;
import c.ˏי.CLS113;
import c.ˏᴵ.CLS119;
import c.ˏᵎ.CLS131;
import c.ˏᵎ.CLS139;
import c.ˏᵎ.CLS142.CLS141;
import c.ˏᵎ.CLS144;
import c.ˏᵎ.CLS163.CLS162;
import c.ˏᵎ.CLS169;
import c.ˏᵎ.CLS170;
import c.ˏᵎ.CLS179;
import c.ˏᵎ.CLS180;
import c.ˏᵎ.CLS184;
import c.ˏᵎ.CLS185;
import c.ˏᵎ.CLS186;
import c.ˏᵎ.CLS191;
import c.ˏᵎ.CLS194;
import c.ˏᵎ.CLS197;
import c.ˏᵎ.CLS205;
import c.ˏᵎ.CLS226;
import c.ˏᵎ.CLS227;
import c.יⁱ.CLS253;
import c.יⁱ.CLS257;
import c.ⁱˋ.CLS335;
import c.ﹶˆ.CLS344;
import c.ﹶˆ.CLS345;
import com.android.xc.Wrapper.XpMethodHook;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;

@SuppressLint({"Range"})
public class CLS663 implements CLS303 {
    public Object FLD1317;
    public Object FLD1318;
    public final CLS139 FLD1319;
    public final CLS253 FLD1320;
    public Handler FLD1321;
    public final CLS59 FLD1322;
    public WeakReference FLD1323;
    public final Runnable FLD1324;
    public boolean FLD1325;
    public HashMap FLD1326;
    public final HashSet FLD1327;
    public boolean FLD1328;
    public boolean FLD1329;
    public boolean FLD1330;
    public int FLD1331;
    public boolean FLD1332;
    public Class FLD1333;
    public boolean FLD1334;
    public boolean FLD1335;
    public boolean FLD1336;
    public WeakReference FLD1337;
    public final WeakReference FLD1338;
    public CLS131 FLD1339;
    public final CLS70 FLD1340;
    public WeakReference FLD1341;
    public boolean FLD1342;
    public final CLS170 FLD1343;
    public final CLS191 FLD1344;

    // 此方法包含解密的字符串
    public CLS663(Context context0) {
        this.FLD1320 = new CLS253();
        this.FLD1331 = -1;
        this.FLD1332 = false;
        this.FLD1330 = false;
        this.FLD1335 = false;
        this.FLD1325 = false;
        this.FLD1342 = false;
        this.FLD1334 = false;
        this.FLD1328 = false;
        this.FLD1338 = new WeakReference(context0);
        CLS70 ᵎʾ0 = CLS70.MTH1131();
        this.FLD1340 = ᵎʾ0;
        this.FLD1319 = (CLS139)ᵎʾ0.MTH1147(CLS139.class);
        this.FLD1322 = (CLS59)CLS70.MTH1131().MTH1147(CLS59.class);
        this.FLD1344 = CLS191.MTH2830();
        this.FLD1339 = CLS131.MTH1990();
        this.FLD1343 = CLS170.MTH2460();
        try {
            HandlerThread handlerThread0 = new HandlerThread(CLS184.MTH2689("wx_sync_check_thread"));
            handlerThread0.start();
            this.FLD1321 = new Handler(handlerThread0.getLooper());
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        this.FLD1324 = () -> // 此方法包含解密的字符串
        try {
            this.FLD1343.MTH2457();
            this.FLD1343.MTH2383();
            CLS194.MTH2881().MTH2872("delayed_check", new Object[0]);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        };
        this.FLD1326 = new HashMap();
        this.FLD1327 = new HashSet();
        this.FLD1343.MTH2414(3002);
        try {
            this.MTH3964(CLS194.MTH2881());
        }
        catch(Throwable throwable1) {
            CLS185.MTH2708(throwable1);
        }
    }

    // 此方法包含解密的字符串
    @Override  // c.ᵎʾ.CLS303
    public void altHook(ClassLoader classLoader0) {
        try {
            if(Debug.isDebuggerConnected()) {
                return;
            }
            CLS64.MTH1072().MTH1062(classLoader0).MTH1059(classLoader0, ((Context)this.FLD1338.get()), false);
            this.MTH4124(classLoader0, false);
            CLS194.MTH2881().MTH2872("altHook_ready", new Object[0]);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // c.ᵎʾ.CLS303
    public boolean hook(ClassLoader classLoader0) {
        public class CLS627 extends XpMethodHook {
            public final CLS663 FLD1278;

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                CLS194.MTH2881().MTH2872("after_Activity_onCreate", new Object[]{object0});
                Activity activity0 = (Activity)new CLS113(object0).MTH1635();
                CLS194.MTH2881().MTH2872("set_current_activity", new Object[]{activity0});
                WeakReference weakReference0 = new WeakReference(activity0);
                CLS663.this.FLD1323 = weakReference0;
                String s = CLS184.MTH2692(activity0);
                if(s.endsWith("LauncherUI")) {
                    WeakReference weakReference1 = new WeakReference(activity0);
                    CLS663.this.FLD1337 = weakReference1;
                    CLS194.MTH2881().MTH2872("set_launcherui", new Object[]{activity0});
                }
                Class class0 = MenuItem.OnMenuItemClickListener.class;
                Class class1 = String.class;
                if(s.endsWith("BindMobilePolicyUI")) {
                    if(CLS98.MTH1297().MTH994("auto_close_bindmobile", true)) {
                        try {
                            activity0.finish();
                            return;
                        label_16:
                            CLS112.MTH1630(CLS112.MTH1620(new String[]{CLS98.MTH1289("addTextOptionMenu"), "addTextOptionMenu", "a"}, activity0, Void.TYPE, new Object[]{Integer.TYPE, class1, class0}), activity0, new Object[]{2000, "", (MenuItem menuItem0) -> {
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
                    return;
                }
                if(CLS98.MTH1329("MMActivity")) {
                    return;
                }
                if(!s.endsWith("LoginPasswordUI") && !s.endsWith("LoginHistoryUI") && !s.endsWith("MobileInputUI") && !s.endsWith("LoginUI")) {
                    return;
                }
                String s1 = CLS98.MTH1305();
                if(!TextUtils.isEmpty(s1) && !"+NO_ID+".equals(s1) && CLS205.MTH2971()) {
                    return;
                }
                try {
                    CLS112.MTH1630(CLS112.MTH1620(new String[]{CLS98.MTH1289("addTextOptionMenu"), "addTextOptionMenu", "a"}, activity0, Void.TYPE, new Object[]{Integer.TYPE, class1, class0}), activity0, new Object[]{2000, "", (MenuItem menuItem0) -> // 去混淆评级： 低(22)
                    // 此方法包含解密的字符串
                    {
                        try {
                            CLS257 ﾞⁱ0 = new CLS257(activity0, "");
                            if(!CLS179.MTH2616()) {
                                ﾞⁱ0.MTH3382("tablet_login", ((CLS345)new CLS729((CLS98.MTH1329("LoginAsExDeviceUI") ? CLS98.MTH1289("LoginAsExDeviceUI") : "com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI"), activity0)));
                            }
                            if(!"+NO_ID+".equals(s1)) {
                                if(CLS663.this.FLD1344.MTH2842()) {
                                    ﾞⁱ0.MTH3382("transfer_advanced", ((CLS345)new CLS795(activity0)));
                                }
                                ﾞⁱ0.MTH3382("export_settings", ((CLS345)new CLS776()));
                            }
                            ﾞⁱ0.MTH3382("restart_wechat", ((CLS345)new CLS765())).MTH3382("reset_module", ((CLS345)new CLS727())).MTH3380();
                        }
                        catch(Throwable throwable0) {
                            CLS185.MTH2708(throwable0);
                        }
                        return true;
                    }});
                }
                catch(Throwable throwable1) {
                    CLS185.MTH2707(throwable1, true, false);
                }
            }

            // 此方法包含解密的字符串
            public static void MTH3807(Activity activity0) {
                String s = CLS184.MTH2685(1);
                if(!TextUtils.isEmpty(s)) {
                    CLS144.MTH2201(activity0, "", s, true, true, null);
                    CLS184.MTH2667(activity0, s);
                    CLS184.MTH2702(activity0, "");
                }
            }

            // 去混淆评级： 低(22)
            // 此方法包含解密的字符串
            // 检测为 Lambda 实现
            private boolean MTH3808(Activity activity0, String s, MenuItem menuItem0) [...]

            public static void MTH3811() {
                CLS98.MTH1276();
                CLS180.MTH2650();
            }

            public static void MTH3813(String s, Activity activity0) {
                Intent intent0 = new Intent();
                if(!CLS299.MTH4279(s, intent0)) {
                    intent0.setClassName(activity0, s);
                    activity0.startActivity(intent0);
                }
            }

            // 此方法包含解密的字符串
            public static void MTH3814() {
                CLS194.MTH2881().MTH2891("exportSettings", new Object[0]);
            }

            // 检测为 Lambda 实现
            public static boolean MTH3816(Activity activity0, MenuItem menuItem0) [...]
        }


        public class CLS644 extends XpMethodHook {
            public final CLS663 FLD1296;

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

        if(Debug.isDebuggerConnected()) {
            return false;
        }
        boolean z = this.FLD1319.MTH2113();
        if(!z) {
            CLS70.MTH1131().MTH1139(((CLS69)() -> CLS64.MTH1072().MTH1062(classLoader0).MTH1059(classLoader0, ((Context)this.FLD1338.get()), false)));
        }
        try {
            this.MTH4041();
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        if(this.FLD1343.MTH2356()) {
            Context context0 = CLS98.MTH1273();
            this.FLD1343.MTH2455(context0);
        }
        else {
            CLS70.MTH1131().MTH1144(((CLS69)() -> {
                Context context0 = CLS98.MTH1273();
                this.FLD1343.MTH2455(context0);
            }), 10000L);
        }
        String s = CLS98.MTH1305();
        this.FLD1344.MTH2829(s);
        this.FLD1344.MTH2844();
        Object[] arr_object = {Bundle.class, CLS111.MTH1590(new CLS627(this))};
        CLS111.MTH1553(Activity.class, "onCreate", arr_object);
        Object[] arr_object1 = {CLS111.MTH1590(new CLS644(this))};
        CLS112.MTH1617(File.class, "delete", arr_object1);
        if(!z) {
            this.MTH4124(classLoader0, false);
        }
        CLS70.MTH1131().MTH1139(((CLS69)new CLS692()));
        CLS107.MTH1479().MTH1492();
        CLS70.MTH1131().MTH1152(((CLS69)() -> // 去混淆评级： 中等(106)
        // 此方法包含解密的字符串
        {
            CLS185.MTH2711((" " + CLS179.MTH2612() + "(" + CLS98.MTH1330() + "," + 0xD4 + ") " + this.FLD1319.MTH2109()));
            CLS185.MTH2711(("Wechat: " + this.FLD1319.MTH2122() + "_" + this.FLD1319.MTH2120() + " {" + CLS41.MTH858((CLS180.MTH2629() ? -73030922763400L : -73013742894216L)) + CLS180.MTH2623() + "}" + CLS41.MTH858((this.FLD1319.MTH2106() ? -73108232174728L : -73073872436360L)) + " (" + CLS184.MTH2665() + ")[" + this.FLD1319.MTH2116() + "]"));
        }));
        return true;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH3893(Object[] arr_object) {
        if("settings_welab".equals(((String)arr_object[0])) && CLS98.MTH1297().MTH994("welab_show_wxmenu", false)) {
            new CLS113(arr_object[1]).MTH1637(Boolean.FALSE);
            CLS194.MTH2881().MTH2896("show_wexposed_main_options", new Object[0]);
        }
    }

    public static Object MTH3894(Object[] arr_object) {
        return CLS98.MTH1316();
    }

    // 此方法包含解密的字符串
    private void MTH3896(Object[] arr_object) {
        Activity activity0 = (Activity)new CLS113(arr_object[0]).MTH1635();
        this.FLD1323 = new WeakReference(activity0);
        CLS194.MTH2881().MTH2872("set_current_activity", new Object[]{activity0});
        if(CLS184.MTH2692(activity0).equals(CLS98.MTH1289("LauncherUI"))) {
            this.FLD1337 = new WeakReference(activity0);
            CLS194.MTH2881().MTH2872("set_launcherui", new Object[]{activity0});
        }
    }

    // 检测为 Lambda 实现
    public static void MTH3898() [...]

    public static Object MTH3900(Object[] arr_object) {
        File file0 = (File)arr_object[0];
        int v = (int)(((Integer)arr_object[1]));
        if(arr_object.length > 2) {
            ArrayList arrayList0 = (ArrayList)arr_object[2];
            return Boolean.valueOf(CLS186.MTH2764(CLS98.MTH1323(), file0, v, arrayList0));
        }
        return Boolean.valueOf(CLS186.MTH2764(CLS98.MTH1323(), file0, v, null));
    }

    private void MTH3904(Object[] arr_object) {
        int v = (int)(((Integer)arr_object[0]));
        CLS186.MTH2720(this.MTH4054(), v);
    }

    public static void MTH3905(Object[] arr_object) {
        CLS119.MTH1778().MTH1809();
    }

    // 此方法包含解密的字符串
    private void MTH3906(Object[] arr_object) {
        Activity activity0 = (Activity)CLS110.MTH1544(new CLS113(arr_object[0]).MTH1635(), CLS98.MTH1289("chattingUIGetActivity"), new Object[0]);
        if(this.MTH4054() == null) {
            this.MTH3996(activity0);
        }
        CLS194.MTH2881().MTH2872("set_current_activity", new Object[]{activity0});
        this.FLD1323 = new WeakReference(activity0);
        this.MTH3940();
    }

    // 此方法包含解密的字符串
    private void MTH3907(Object[] arr_object) {
        CLS113 ﾞⁱ0 = new CLS113(arr_object[0]);
        String s = (String)ﾞⁱ0.MTH1638()[0];
        ContentValues contentValues0 = (ContentValues)ﾞⁱ0.MTH1638()[1];
        if(!this.MTH3962(s)) {
            return;
        }
        this.FLD1320.MTH3308(s);
        if(this.FLD1320.MTH3317("b.sqldb.update" + s) && this.FLD1320.MTH3315("b.sqldb.update" + s).equals(s + contentValues0)) {
            this.FLD1320.MTH3316("b.sqldb.update" + s);
            return;
        }
        CLS194.MTH2881().MTH2872("b.sqldb.update", new Object[]{ﾞⁱ0.MTH1634(), 1, s, contentValues0});
    }

    public static void MTH3912(Object[] arr_object) {
        CLS70.MTH1131().MTH1127(((CLS69)() -> CLS119.MTH1778().MTH1777()));
    }

    public static Object MTH3913(Object[] arr_object) {
        switch(arr_object.length) {
            case 1: {
                Object object0 = arr_object[0];
                if(object0 instanceof InputStream) {
                    return CLS169.MTH2336(((InputStream)object0));
                }
                if(object0 instanceof String) {
                    return CLS169.MTH2329(((String)object0));
                }
                break;
            }
            case 2: {
                Object object1 = arr_object[0];
                if(object1 instanceof String) {
                    CLS169.MTH2334(((String)object1), ((Handler.Callback)arr_object[1]));
                    return null;
                }
                if(object1 instanceof Bitmap) {
                    CLS169.MTH2321(((Bitmap)object1), ((Handler.Callback)arr_object[1]));
                }
                break;
            }
            default: {
                return null;
            }
        }
        return null;
    }

    private void MTH3917(Object[] arr_object) {
        this.FLD1343.MTH2375(false);
    }

    public static void MTH3918(Object[] arr_object) {
        CLS107.MTH1479().MTH1490();
    }

    // 此方法包含解密的字符串
    public final boolean MTH3919(Activity activity0, ClassLoader classLoader0, String s, Object object0) {
        int v1;
        Class class0;
        try {
            String s1 = activity0.getPackageName() + ".ui.base.preference.MMPreferenceVAS";
            if(CLS98.MTH1329("MMPreferenceVAS")) {
                class0 = CLS64.MTH1072().MTH1061("MMPreferenceVAS");
                if(class0 == null) {
                    class0 = CLS112.MTH1625(s1, classLoader0);
                }
            }
            else {
                class0 = this.FLD1319.MTH2120() < 2060 || !CLS112.MTH1598(classLoader0, s1) ? null : CLS112.MTH1625(s1, classLoader0);
                if(class0 == null) {
                    class0 = CLS64.MTH1072().MTH1061("MMPreference");
                }
            }
            if(class0 == null) {
                class0 = CLS112.MTH1625((activity0.getPackageName() + ".ui.base.preference.MMPreference"), classLoader0);
            }
            Class class1 = CLS64.MTH1072().MTH1061("preferenceClass");
            if(class1 == null) {
                class1 = CLS112.MTH1625((activity0.getPackageName() + ".ui.base.preference.Preference"), classLoader0);
            }
            if(class0 != null && class1 != null) {
                Object object1 = CLS112.MTH1611(class0, object0, "preference");
                if(object1 == null) {
                    return false;
                }
                Method method0 = CLS112.MTH1608(object1, CLS98.MTH1332("PreferenceAdapterIndexOfMethod", "indexOf"), Integer.TYPE, new Object[]{String.class});
                int v = -1;
                if(method0 == null) {
                    LinkedList linkedList0 = (LinkedList)CLS112.MTH1605(object1, LinkedList.class);
                    v1 = linkedList0 == null ? -1 : linkedList0.indexOf(s);
                }
                else {
                    v1 = (int)(((Integer)CLS112.MTH1630(method0, object1, new Object[]{s})));
                }
                if(v1 != -1) {
                    return false;
                }
                Object object2 = CLS110.MTH1541(class1, new Object[]{activity0});
                CLS98.MTH1290();
                CLS110.MTH1544(object2, CLS98.MTH1332("PreferenceSetTitleMethod", "setTitle"), new Object[]{CLS179.MTH2611()});
                CLS110.MTH1544(object2, CLS98.MTH1332("PreferenceSetKeyMethod", "setKey"), new Object[]{s});
                if(!this.FLD1322.MTH994("placeSettingsToBottom", false)) {
                    v = 0;
                }
                CLS110.MTH1544(object1, CLS98.MTH1332("pref_adapter_set", "a"), new Object[]{object2, v});
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return false;
    }

    public static Object MTH3920(Object[] arr_object) {
        return Boolean.valueOf(CLS111.MTH1568());
    }

    public final Activity MTH3923() {
        return this.FLD1337 == null ? null : ((Activity)this.FLD1337.get());
    }

    // 检测为 Lambda 实现
    public static void MTH3927(Activity activity0) [...]

    // 此方法包含解密的字符串
    private void MTH3928(Object[] arr_object) {
        CLS113 ﾞⁱ0 = new CLS113(arr_object[0]);
        String s = (String)ﾞⁱ0.MTH1638()[0];
        ContentValues contentValues0 = (ContentValues)ﾞⁱ0.MTH1638()[2];
        if(this.MTH3962(s) && !this.FLD1320.MTH3310(s) && !"message".equalsIgnoreCase(s)) {
            CLS194.MTH2881().MTH2872("a.sqldb.insert", new Object[]{ﾞⁱ0.MTH1634(), 2, s, contentValues0}).MTH2869("a.async.sqldb.insert", new Object[]{ﾞⁱ0.MTH1634(), 2, s, contentValues0});
        }
    }

    public static Object MTH3930(Object[] arr_object) {
        return CLS179.MTH2612();
    }

    public static Object MTH3931(Object[] arr_object) {
        return CLS179.MTH2617();
    }

    public static Object MTH3934(Object[] arr_object) {
        return Boolean.valueOf(CLS144.MTH2183());
    }

    private Object MTH3935(Object[] arr_object) {
        return this.FLD1318;
    }

    public static void MTH3936(Object[] arr_object) {
        CLS119.MTH1778().MTH1823();
    }

    public static void MTH3938(Object[] arr_object) {
        int v = (int)(((Integer)arr_object[0]));
        String s = (String)arr_object[1];
        Object object0 = arr_object[2];
        if(arr_object.length > 3) {
            CLS186.MTH2719(CLS98.MTH1323(), v, s, ((String)object0), ((ArrayList)object0));
        }
        CLS186.MTH2719(CLS98.MTH1323(), v, s, ((String)object0), null);
    }

    // 此方法包含解密的字符串
    public final void MTH3940() {
        if(this.FLD1332) {
            return;
        }
        this.FLD1332 = true;
        this.FLD1322.MTH986("safe_mode");
        this.FLD1322.MTH986("safe_mode_cnt");
    }

    public static Object MTH3942(Object[] arr_object) {
        return Boolean.valueOf(CLS180.MTH2640());
    }

    // 此方法包含解密的字符串
    private void MTH3943(Object[] arr_object) {
        CLS113 ﾞⁱ0 = new CLS113(arr_object[0]);
        String s = (String)ﾞⁱ0.MTH1638()[0];
        ContentValues contentValues0 = (ContentValues)ﾞⁱ0.MTH1638()[1];
        if(!this.MTH3962(s)) {
            return;
        }
        CLS194.MTH2881().MTH2872("a.sqldb.update", new Object[]{ﾞⁱ0.MTH1634(), 1, s, contentValues0}).MTH2872("a.async.sqldb.update", new Object[]{ﾞⁱ0.MTH1634(), 1, s, contentValues0});
    }

    // 此方法包含解密的字符串
    public static void MTH3944(Object object0) {
        CLS194.MTH2881().MTH2872("plus.config", new Object[]{object0.toString()});
    }

    public static Object MTH3946(Object[] arr_object) {
        return CLS184.MTH2662(((Context)arr_object[0]));
    }

    private void MTH3947(Object[] arr_object) {
        this.FLD1336 = true;
    }

    // 此方法包含解密的字符串
    public static void MTH3949() {
        CLS194.MTH2881().MTH2891("exportSettings", new Object[0]);
    }

    public static Object MTH3950(Object[] arr_object) {
        return CLS98.MTH1270();
    }

    public static Object MTH3953(Object[] arr_object) {
        int v = (int)(((Integer)arr_object[0]));
        String s = (String)arr_object[1];
        if(arr_object.length > 2) {
            ArrayList arrayList0 = (ArrayList)arr_object[2];
            return CLS186.MTH2717(CLS98.MTH1323(), v, arrayList0, s);
        }
        return CLS186.MTH2744(CLS98.MTH1323(), v, s);
    }

    public static Object MTH3955(Object[] arr_object) {
        return Boolean.valueOf(CLS184.MTH2693());
    }

    // 此方法包含解密的字符串
    public static void MTH3957(Object[] arr_object) {
        if(CLS112.MTH1607(new String[]{"android.app.Instrumentation.callActivityOnResume"})) {
            CLS194.MTH2881().MTH2872("a.on_LauncherUI_onResume", new Object[]{arr_object[0]});
        }
    }

    // 此方法包含解密的字符串
    private void MTH3959(Object[] arr_object) {
        CLS113 ﾞⁱ0 = new CLS113(arr_object[0]);
        String s = (String)ﾞⁱ0.MTH1638()[0];
        String s1 = s.toLowerCase();
        if(CLS197.MTH2926(s1, new String[]{"from rcontact", "from message", "from userinfo", "from rconversation", "from lbsverifymessage", "from chatroom", "from fmessage_msginfo", "from imginfo2"})) {
            try {
                if(!this.FLD1328) {
                    this.FLD1328 = true;
                    CLS185.MTH2711("db 2 hook success!");
                    CLS194.MTH2881().MTH2869("db.init", new Object[]{ﾞⁱ0.MTH1634()});
                }
                this.MTH3992(ﾞⁱ0.MTH1635().getClass().getClassLoader());
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        else if(CLS197.MTH2926(s1, new String[]{"snsinfo", "snscomment", "adsnsinfo"}) && !this.FLD1334) {
            this.FLD1334 = true;
            CLS194.MTH2881().MTH2869("snsdb.init", new Object[]{ﾞⁱ0.MTH1634()});
        }
        String s2 = this.MTH3990(s1);
        if(this.MTH3962(s1) && !this.FLD1320.MTH3309(s2)) {
            if(s.startsWith("fkz_")) {
                ﾞⁱ0.MTH1638()[0] = s.replace("fkz_", "");
                return;
            }
            if(s.startsWith("/*fkz*/")) {
                ﾞⁱ0.MTH1638()[0] = s.replace("/*fkz*/", "");
                return;
            }
            if(s.contains("/*wxp*/")) {
                return;
            }
            String[] arr_s = (String[])ﾞⁱ0.MTH1638()[1];
            this.FLD1320.MTH3313("b.sqldb.rawquery" + s2, s);
            CLS194.MTH2881().MTH2872("b.sqldb.rawquery", new Object[]{ﾞⁱ0.MTH1634(), 2, s, arr_s});
        }
    }

    // 去混淆评级： 中等(150)
    // 此方法包含解密的字符串
    public final boolean MTH3962(String s) {
        String s1 = s.toLowerCase();
        return !s1.startsWith("pragma") && CLS197.MTH2926(s1, new String[]{"rcontact", "message", "userinfo", "rconversation", "lbsverifymessage", "snsinfo", "snscomment", "adsnsinfo", "faviteminfo", "imginfo2", "chatroom", "fmessage_msginfo", "harddevicerankinfo"});
    }

    // 此方法包含解密的字符串
    private void MTH3963(Object[] arr_object) {
        CLS113 ﾞⁱ0 = new CLS113(arr_object[0]);
        String s = (String)ﾞⁱ0.MTH1638()[1];
        String s1 = s.toLowerCase();
        if(s.startsWith("fkz_")) {
            ﾞⁱ0.MTH1638()[1] = s.replace("fkz_", "");
            return;
        }
        if(s.startsWith("/*fkz*/")) {
            ﾞⁱ0.MTH1638()[1] = s.replace("/*fkz*/", "");
            return;
        }
        if(s.contains("/*wxp*/")) {
            return;
        }
        if(CLS197.MTH2926(s1, new String[]{"from rcontact", "from message", "from userinfo", "from rconversation", "from lbsverifymessage", "from chatroom", "from fmessage_msginfo", "from imginfo2"})) {
            try {
                if(!this.FLD1339.MTH2006()) {
                    this.FLD1339.MTH2002();
                    CLS185.MTH2711("db hook success!");
                    if(!this.FLD1328) {
                        CLS194.MTH2881().MTH2869("db.init", new Object[]{ﾞⁱ0.MTH1634()});
                    }
                }
                this.FLD1339.MTH2000(ﾞⁱ0.MTH1635());
                this.MTH3992(ﾞⁱ0.MTH1635().getClass().getClassLoader());
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        else if(CLS197.MTH2926(s1, new String[]{"snsinfo", "snscomment", "adsnsinfo"})) {
            if(!this.FLD1330) {
                this.FLD1330 = true;
                if(!this.FLD1334) {
                    CLS194.MTH2881().MTH2869("snsdb.init", new Object[]{ﾞⁱ0.MTH1634()});
                }
            }
            this.FLD1318 = ﾞⁱ0.MTH1635();
        }
        else if(s1.contains("faviteminfo")) {
            if(!this.FLD1335) {
                this.FLD1335 = true;
            }
            this.FLD1317 = ﾞⁱ0.MTH1635();
        }
        if(!this.MTH3962(s1)) {
            return;
        }
        Object[] arr_object1 = (Object[])ﾞⁱ0.MTH1638()[2];
        String s2 = this.MTH3990(s1);
        this.FLD1320.MTH3311(s2);
        if(this.FLD1320.MTH3317("b.sqldb.rawquery" + s2) && this.FLD1320.MTH3315("b.sqldb.rawquery" + s2).equals(s)) {
            this.FLD1320.MTH3316("b.sqldb.rawquery" + s2);
            return;
        }
        CLS194.MTH2881().MTH2872("b.sqldb.rawquery", new Object[]{ﾞⁱ0.MTH1634(), 1, s, arr_object1});
    }

    // 去混淆评级： 中等(140)
    // 此方法包含解密的字符串
    public void MTH3964(CLS194 ٴˑ0) {
        ٴˑ0.MTH2899("getVersion", ((CLS162)new CLS675())).MTH2899("getLauncherUI", ((CLS162)new CLS725(this))).MTH2899("getContext", ((CLS162)new CLS772(this))).MTH2899("getCurrentActivity", ((CLS162)new CLS684(this))).MTH2899("getModuleContext", ((CLS162)new CLS756())).MTH2899("getClassLoader", ((CLS162)new CLS609())).MTH2905("showtoast", ((CLS141)new CLS780(this))).MTH2905("debug", ((CLS141)new CLS695())).MTH2899("getLoginName,getLoginName2", ((CLS162)new CLS733())).MTH2899("getNickName", ((CLS162)new CLS685())).MTH2899("getAlias", ((CLS162)new CLS701())).MTH2899("getBindMobile", ((CLS162)new CLS797())).MTH2899("getBindEmail", ((CLS162)new CLS682())).MTH2905("disable", ((CLS141)new CLS785())).MTH2905("eject", ((CLS141)new CLS717(this))).MTH2905("switching_contact_view", ((CLS141)new CLS773(this))).MTH2905("recreate_launcherui", ((CLS141)new CLS737(this))).MTH2905("showSettingsDialog", ((CLS141)new CLS728(this))).MTH2905("ejectCore", ((CLS141)new CLS676())).MTH2899("getToolbar", ((CLS162)new CLS749())).MTH2899("hasToolbar", ((CLS162)new CLS762())).MTH2905("refreshSettings", ((CLS141)new CLS696())).MTH2905("refreshSettingsText,on_update_progress", ((CLS141)new CLS798())).MTH2899("isDisabled", ((CLS162)new CLS687(this))).MTH2905("show_wexposed_main_options", ((CLS141)new CLS774(this))).MTH2899("getNotice", ((CLS162)new CLS770()));
        CLS194.MTH2881().MTH2905("onsettingschange", ((CLS141)new CLS668(this))).MTH2899("getRetrievedImg", ((CLS162)new CLS778(this))).MTH2899("getRetrievedImgHistory", ((CLS162)new CLS665(this))).MTH2905("setDisableCode", ((CLS141)new CLS702(this))).MTH2905("check_updates", ((CLS141)new CLS764(this))).MTH2899("getLanguage", ((CLS162)new CLS735())).MTH2899("isDarkMode", ((CLS162)new CLS769())).MTH2899("isQRCode", ((CLS162)new CLS757())).MTH2899("scanQRImage", ((CLS162)new CLS714())).MTH2899("genQRCode", ((CLS162)new CLS690())).MTH2905("setLanguage", ((CLS141)new CLS730())).MTH2899("getWechatHash", ((CLS162)new CLS775(this))).MTH2899("getWechatSig", ((CLS162)new CLS724(this))).MTH2899("isEmulator", ((CLS162)new CLS767())).MTH2899("getProperty", ((CLS162)new CLS788())).MTH2899("getCoreVersionCode", ((CLS162)new CLS739())).MTH2899("requires_fp_donation", ((CLS162)new CLS731())).MTH2899("requires_fp_menu_settings", ((CLS162)new CLS608())).MTH2899("getWechatClientVersion", ((CLS162)new CLS746())).MTH2899("getXpFrameWork", ((CLS162)new CLS681())).MTH2899("hasWriteStoragePermission", ((CLS162)new CLS766())).MTH2899("hasReadStoragePermission", ((CLS162)new CLS732())).MTH2899("getUriFromProvider", ((CLS162)new CLS741(this))).MTH2899("Xm_getParam", ((CLS162)new CLS716())).MTH2899("isLspatchIntegratedMode", ((CLS162)new CLS670())).MTH2899("isIntegratedMode", ((CLS162)new CLS736())).MTH2905("wxsettings_disappear", ((CLS141)new CLS740())).MTH2905("wxsettings_reappear", ((CLS141)new CLS782())).MTH2905("requestModuleDirPermission", ((CLS141)new CLS669(this)));
        ٴˑ0.MTH2905("onIsTabletMethod1", ((CLS141)new CLS693(this)));
        this.MTH3989();
        this.MTH4050();
        this.MTH4125();
        CLS61.MTH1022().MTH1030(ٴˑ0);
    }

    // 此方法包含解密的字符串
    public final void MTH3969(ClassLoader classLoader0) {
        public class CLS636 extends XpMethodHook {
            public final String FLD1287;
            public final CLS663 FLD1288;

            public CLS636(String s) {
                this.FLD1287 = s;
                super();
            }

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                String s = null;
                CLS194.MTH2881().MTH2872("on_settingsui_preference", new Object[]{object0});
                Object object1 = new CLS113(object0).MTH1638()[1];
                Context context0 = null;
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
                        if(!this.FLD1287.equals(s)) {
                            CLS194.MTH2881().MTH2872("b.onpreference", new Object[]{s, object0});
                            return;
                        }
                    }
                    else if(!new HashSet(CLS112.MTH1609(object1, String.class)).contains(this.FLD1287)) {
                        return;
                    }
                    goto label_16;
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                    return;
                }
                return;
                try {
                label_16:
                    if(CLS112.MTH1604(object1, CLS98.MTH1332("pref_getContextMethod", "getContext"))) {
                        context0 = (Context)CLS110.MTH1544(object1, CLS98.MTH1332("pref_getContextMethod", "getContext"), new Object[0]);
                    }
                label_18:
                    if(context0 == null) {
                        goto label_19;
                    }
                    goto label_20;
                }
                catch(Throwable unused_ex) {
                    goto label_18;
                }
                try {
                label_19:
                    context0 = (Context)CLS112.MTH1605(object1, Context.class);
                }
                catch(Throwable unused_ex) {
                }
                try {
                label_20:
                    if(context0 == null) {
                        context0 = CLS663.this.MTH4054();
                    }
                    CLS119.MTH1778().MTH1804(((Activity)context0));
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }


        public class CLS654 extends XpMethodHook {
            public final CLS663 FLD1306;
            public final ClassLoader FLD1307;
            public final String FLD1308;

            public CLS654(ClassLoader classLoader0, String s) {
                this.FLD1307 = classLoader0;
                this.FLD1308 = s;
                super();
            }

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                CLS663.this.MTH3940();
                if(!CLS170.MTH2460().MTH2512()) {
                    return;
                }
                CLS194.MTH2881().MTH2872("on_settingsui_oncreate", new Object[]{object0});
                CLS113 ﾞⁱ0 = new CLS113(object0);
                Activity activity0 = (Activity)ﾞⁱ0.MTH1635();
                WeakReference weakReference0 = new WeakReference(activity0);
                CLS663.this.FLD1323 = weakReference0;
                if(CLS98.MTH1329("MMActivity_getMMTitleView") && CLS663.this.FLD1322.MTH994("settingsui_title_show_wxmenu", false)) {
                    Object object1 = CLS110.MTH1544(ﾞⁱ0.MTH1635(), CLS98.MTH1289("MMActivity_getMMTitleView"), new Object[0]);
                    if(object1 != null) {
                        ((View)object1).setOnLongClickListener((View view0) -> {
                            CLS119.MTH1778().MTH1804(activity0);
                            return true;
                        });
                    }
                }
                if(!CLS663.this.FLD1322.MTH994("hideSettings", false) && !CLS205.MTH2971() && !CLS194.MTH2881().MTH2873("isHideWxMenu", new Object[0]) && !CLS663.this.FLD1343.MTH2490()) {
                    Object object2 = ﾞⁱ0.MTH1635();
                    if(!CLS663.this.MTH3919(activity0, this.FLD1307, this.FLD1308, object2)) {
                        CLS119.MTH1778().MTH1804(activity0);
                    }
                }
            }

            // 检测为 Lambda 实现
            public static boolean MTH3873(Activity activity0, View view0) [...]
        }

        Class class0 = null;
        try {
            class0 = CLS112.MTH1625((this.FLD1319.MTH2123() + ".plugin.setting.ui.setting.SettingsUI"), classLoader0);
        }
        catch(Throwable unused_ex) {
        }
        if(class0 == null) {
            return;
        }
        String s = "WX_" + Long.toHexString(System.currentTimeMillis());
        CLS112.MTH1617(class0, "onCreate", new Object[]{Bundle.class, CLS111.MTH1590(new CLS654(this, classLoader0, s))});
        try {
            CLS112.MTH1623(CLS112.MTH1602(class0, null, Boolean.TYPE, new Object[]{null, "Preference"}), CLS111.MTH1590(new CLS636(this, s)));
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    // 此方法包含解密的字符串
    private void MTH3970(Object[] arr_object) {
        Activity activity0 = (Activity)new CLS113(arr_object[0]).MTH1635();
        CLS194.MTH2881().MTH2872("set_current_activity", new Object[]{activity0}).MTH2872("set_launcherui", new Object[]{activity0});
        this.FLD1323 = new WeakReference(activity0);
        this.FLD1337 = new WeakReference(activity0);
        this.MTH3996(activity0);
        this.FLD1329 = true;
    }

    public static Object MTH3972(Object[] arr_object) {
        Object object0 = arr_object[0];
        if(!(object0 instanceof Bitmap)) {
            return false;
        }
        return CLS169.MTH2332(((Bitmap)object0)) ? true : Boolean.valueOf(CLS169.MTH2332(CLS169.MTH2338(((Bitmap)object0))));
    }

    // 此方法包含解密的字符串
    private void MTH3975(Object[] arr_object) {
        CLS113 ﾞⁱ0 = new CLS113(arr_object[0]);
        String s = (String)ﾞⁱ0.MTH1638()[1];
        if(!this.MTH3962(s)) {
            return;
        }
        String s1 = this.MTH3988(s);
        if(this.FLD1320.MTH3306(s1)) {
            return;
        }
        this.FLD1320.MTH3313("b.sqlitedb_exec" + s1, s);
        CLS194.MTH2881().MTH2872("b.sqldb.exec", new Object[]{ﾞⁱ0.MTH1634(), 2, s});
    }

    public static Object MTH3977(Object[] arr_object) {
        int v = (int)(((Integer)arr_object[0]));
        String s = (String)arr_object[1];
        if(arr_object.length > 2) {
            ArrayList arrayList0 = (ArrayList)arr_object[2];
            return CLS186.MTH2748(CLS98.MTH1323(), v, arrayList0, s);
        }
        return CLS186.MTH2746(CLS98.MTH1323(), v, s);
    }

    // 此方法包含解密的字符串
    private void MTH3979(Object[] arr_object) {
        this.FLD1343.MTH2475("eject");
        this.FLD1343.MTH2525(600);
        CLS170.MTH2460().MTH2402();
        CLS98.MTH1321();
        CLS98.MTH1336(108, new Object[0]);
        CLS98.MTH1290();
        CLS98.MTH1276();
        CLS98.MTH1274();
        CLS98.MTH1327();
    }

    // 此方法包含解密的字符串
    public static void MTH3980(Activity activity0) {
        String s = CLS184.MTH2685(1);
        if(!TextUtils.isEmpty(s)) {
            CLS144.MTH2201(activity0, "", s, true, true, null);
            CLS184.MTH2667(activity0, s);
            CLS184.MTH2702(activity0, "");
        }
    }

    public static void MTH3981(Object[] arr_object) {
        CLS185.MTH2710(arr_object[0]);
    }

    public Context MTH3983() {
        try {
            WeakReference weakReference0 = this.FLD1341;
            if(weakReference0 != null) {
                return (Context)weakReference0.get();
            }
            Context context0 = CLS299.MTH4271();
            if(context0 != null) {
                this.FLD1341 = new WeakReference(context0);
                return context0;
            }
            if(this.MTH4054() != null) {
                return this.MTH4054();
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return (Context)this.FLD1338.get();
    }

    public static Object MTH3984(Object[] arr_object) {
        int v = (int)(((Integer)arr_object[0]));
        String s = (String)arr_object[1];
        String s1 = (String)arr_object[2];
        if(arr_object.length > 3) {
            ArrayList arrayList0 = (ArrayList)arr_object[3];
            return Boolean.valueOf(CLS186.MTH2738(CLS98.MTH1323(), v, arrayList0, s, s1));
        }
        return Boolean.valueOf(CLS186.MTH2745(CLS98.MTH1323(), v, s, s1));
    }

    // 检测为 Lambda 实现
    public static void MTH3986() [...]

    // 去混淆评级： 低(26)
    // 此方法包含解密的字符串
    public final String MTH3988(String s) {
        String s1 = s.toLowerCase();
        if(s1.contains("message")) {
            return "message";
        }
        if(s1.contains("rconversation")) {
            return "rconversation";
        }
        if(s1.contains("chatroom")) {
            return "chatroom";
        }
        if(s1.contains("rcontact")) {
            return "rcontact";
        }
        if(s1.contains("userinfo")) {
            return "userinfo";
        }
        if(s1.contains("adsnsinfo")) {
            return "adsnsinfo";
        }
        if(s1.contains("snsinfo")) {
            return "snsinfo";
        }
        if(s1.contains("snscomment")) {
            return "snscomment";
        }
        if(s1.contains("imginfo2")) {
            return "imginfo2";
        }
        if(s1.contains("faviteminfo")) {
            return "faviteminfo";
        }
        if(s1.contains("fmessage_msginfo")) {
            return "fmessage_msginfo";
        }
        if(s1.contains("harddevicerankinfo")) {
            return "harddevicerankinfo";
        }
        return s1.contains("lbsverifymessage") ? "lbsverifymessage" : "other";
    }

    // 去混淆评级： 中等(126)
    // 此方法包含解密的字符串
    public final void MTH3989() {
        CLS194.MTH2881().MTH2905("b.on_SQLiteDatabaseClass_rawQueryWithFactory", ((CLS141)new CLS743(this))).MTH2905("a.dbquery", ((CLS141)new CLS790(this))).MTH2905("b.on_SQLiteDatabaseClass_insertWithOnConflict", ((CLS141)new CLS726(this))).MTH2905("a.on_SQLiteDatabaseClass_insertWithOnConflict", ((CLS141)new CLS697(this))).MTH2905("b.dbupdate", ((CLS141)new CLS605(this))).MTH2905("a.dbupdate0", ((CLS141)new CLS700(this))).MTH2905("b.dbexec", ((CLS141)new CLS791(this))).MTH2899("getMainDB", ((CLS162)new CLS742(this))).MTH2899("getSnsDB", ((CLS162)new CLS711(this))).MTH2899("getFavDB", ((CLS162)new CLS679(this)));
        CLS194.MTH2881().MTH2905("b.sqlitedb_rawQuery", ((CLS141)new CLS671(this))).MTH2905("a.sqlitedb_rawQuery", ((CLS141)new CLS709(this))).MTH2905("b.sqlitedb_insert", ((CLS141)new CLS781(this))).MTH2905("a.sqlitedb_insert", ((CLS141)new CLS704(this))).MTH2905("b.MsgInfoStorage_insertMsg", ((CLS141)new CLS747(this))).MTH2905("a.MsgInfoStorage_insertMsg", ((CLS141)new CLS674(this))).MTH2905("b.sqlitedb_update", ((CLS141)new CLS707(this))).MTH2905("a.sqlitedb_update", ((CLS141)new CLS708(this))).MTH2905("b.sqlitedb_exec", ((CLS141)new CLS748(this)));
    }

    // 去混淆评级： 低(26)
    // 此方法包含解密的字符串
    public final String MTH3990(String s) {
        String s1 = s.toLowerCase();
        if(s1.contains("from message")) {
            return "message";
        }
        if(s1.contains("from rconversation")) {
            return "rconversation";
        }
        if(s1.contains("from chatroom")) {
            return "chatroom";
        }
        if(s1.contains("from rcontact")) {
            return "rcontact";
        }
        if(s1.contains("from userinfo")) {
            return "userinfo";
        }
        if(s1.contains("from adsnsinfo")) {
            return "adsnsinfo";
        }
        if(s1.contains("from snsinfo")) {
            return "snsinfo";
        }
        if(s1.contains("from snscomment")) {
            return "snscomment";
        }
        if(s1.contains("from imginfo2")) {
            return "imginfo2";
        }
        if(s1.contains("from faviteminfo")) {
            return "faviteminfo";
        }
        if(s1.contains("from fmessage_msginfo")) {
            return "fmessage_msginfo";
        }
        if(s1.contains("from harddevicerankinfo")) {
            return "harddevicerankinfo";
        }
        return s1.contains("from lbsverifymessage") ? "lbsverifymessage" : "other";
    }

    private Object MTH3991(Object[] arr_object) {
        return this.MTH4054();
    }

    public final void MTH3992(ClassLoader classLoader0) {
        if(!this.FLD1325 && !this.FLD1342) {
            CLS64.MTH1072().MTH1062(classLoader0).MTH1059(classLoader0, this.MTH3983(), true);
            this.MTH4124(classLoader0, true);
            this.FLD1342 = true;
        }
    }

    // 去混淆评级： 低(34)
    // 此方法包含解密的字符串
    public final boolean MTH3995() {
        if(!CLS98.MTH1297().MTH994("force_darkmode", false)) {
            return false;
        }
        if(!CLS98.MTH1297().MTH994("darkmode_follow_system", false) && !CLS98.MTH1297().MTH994("darkmode_follow_time", false)) {
            return true;
        }
        return CLS98.MTH1297().MTH994("darkmode_follow_time", false) ? CLS205.MTH2973(CLS98.MTH1297().MTH1015("darkmode_timeframe", "")) : CLS226.MTH3106();
    }

    // 此方法包含解密的字符串
    public void MTH3996(Activity activity0) {
        if(this.FLD1337 == null) {
            this.FLD1337 = new WeakReference(activity0);
        }
        if((this.FLD1322.MTH994("chatroom_container", false) || this.FLD1322.MTH994("chatcontainer_enable", false)) && this.FLD1336) {
            this.FLD1336 = false;
            return;
        }
        this.MTH4041();
        CLS194.MTH2881().MTH2872("onlauncherui_enter", new Object[]{activity0}).MTH2869("onlauncheruienter", new Object[]{activity0});
        Intent intent0 = activity0.getIntent();
        if(intent0.hasExtra("gotosettings")) {
            intent0.removeExtra("gotosettings");
            CLS119.MTH1778().MTH1804(activity0);
        }
        this.MTH4048();
        if(!this.FLD1329) {
            this.FLD1329 = true;
            CLS70.MTH1131().MTH1144(((CLS69)() -> // 去混淆评级： 低(20)
            // 此方法包含解密的字符串
            CLS194.MTH2881().MTH2902("donation", "disableTinker", new Object[]{activity0})), 10000L);
            CLS194.MTH2881().MTH2869("onlauncheruienter.notactive", new Object[]{activity0, activity0.getIntent()}).MTH2902("base", "a_wakelock", new Object[0]);
        }
    }

    public static void MTH3997(Object[] arr_object) {
        CLS70.MTH1131().MTH1127(((CLS69)() -> CLS119.MTH1778().MTH1768()));
    }

    public static Object MTH4001(Object[] arr_object) {
        return Boolean.valueOf(CLS226.MTH3102());
    }

    // 去混淆评级： 低(28)
    // 此方法包含解密的字符串
    private void MTH4003(Object[] arr_object) {
        CLS113 ﾞⁱ0 = new CLS113(arr_object[0]);
        if(this.MTH3962("message") && !this.FLD1320.MTH3310("message")) {
            ContentValues contentValues0 = (ContentValues)CLS110.MTH1544(ﾞⁱ0.MTH1638()[0], CLS98.MTH1289("convertToMethod"), new Object[0]);
            CLS194.MTH2881().MTH2872("a.sqldb.insert", new Object[]{ﾞⁱ0.MTH1634(), 3, "message", contentValues0}).MTH2869("a.async.sqldb.insert", new Object[]{ﾞⁱ0.MTH1634(), 3, "message", contentValues0});
        }
    }

    public static void MTH4005(Object[] arr_object) {
        CLS98.MTH1315(((String)arr_object[0]), ((String)arr_object[1]));
    }

    // 此方法包含解密的字符串
    public final void MTH4012(ClassLoader classLoader0) {
        public class CLS617 extends XpMethodHook {
            public final ClassLoader FLD1267;
            public final CLS663 FLD1268;

            public CLS617(ClassLoader classLoader0) {
                this.FLD1267 = classLoader0;
                super();
            }

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                public class CLS615 extends XpMethodHook {
                    public final int FLD1263;
                    public final CLS617 FLD1264;

                    public CLS615(int v) {
                        this.FLD1263 = v;
                        super();
                    }

                    // 此方法包含解密的字符串
                    @Override  // com.android.xc.Wrapper.XpMethodHook
                    public void afterHookedMethod(Object object0) {
                        CLS113 ﾞⁱ0 = new CLS113(object0);
                        if(((int)(((Integer)ﾞⁱ0.MTH1638()[0]))) != this.FLD1263) {
                            return;
                        }
                        ImageView imageView0 = (ImageView)CLS112.MTH1597(((ViewGroup)(((View)ﾞⁱ0.MTH1636()))), "android.widget.ImageView");
                        if(imageView0 != null) {
                            CLS169.MTH2328(imageView0.getDrawable(), -1);
                        }
                    }
                }


                public class CLS616 extends XpMethodHook {
                    public final int FLD1265;
                    public final CLS617 FLD1266;

                    public CLS616(int v) {
                        this.FLD1265 = v;
                        super();
                    }

                    // 此方法包含解密的字符串
                    @Override  // com.android.xc.Wrapper.XpMethodHook
                    public void beforeHookedMethod(Object object0) {
                        try {
                            if(((int)(((Integer)new CLS113(object0).MTH1638()[2]))) != this.FLD1265) {
                                return;
                            }
                            CLS194.MTH2881().MTH2896("show_wexposed_main_options", new Object[0]);
                        }
                        catch(Throwable throwable0) {
                            CLS185.MTH2708(throwable0);
                        }
                    }
                }

                Object object2;
                Class class1;
                CLS663 ʻﾞ0;
                try {
                    Class class0 = View.class;
                    if(CLS663.this.FLD1322.MTH994("usePlusMenu", !CLS184.MTH2693()) && !CLS205.MTH2971() && CLS170.MTH2460().MTH2512() && !CLS194.MTH2881().MTH2873("isHideWxMenu", new Object[0]) && !CLS663.this.FLD1343.MTH2429()) {
                        boolean z = CLS112.MTH1607(new String[]{"LauncherUI"});
                        if(z && CLS663.this.FLD1333 != null || !z && !CLS112.MTH1607(new String[]{"HomeUI"})) {
                            return;
                        }
                        CLS113 ﾞⁱ0 = new CLS113(object0);
                        Object object1 = CLS98.MTH1329("PlusMenuItemClass0") ? CLS112.MTH1605(ﾞⁱ0.MTH1638()[0], CLS98.MTH1289("PlusMenuItemClass0")) : CLS112.MTH1612(ﾞⁱ0.MTH1638()[0], 0);
                        String s = object1.getClass().getName();
                        if(CLS663.this.FLD1333 == null) {
                            if(CLS98.MTH1329("PlusMenuItemClass1")) {
                                ʻﾞ0 = CLS663.this;
                                class1 = CLS64.MTH1072().MTH1061("PlusMenuItemClass1");
                            }
                            else {
                                ʻﾞ0 = CLS663.this;
                                class1 = CLS111.MTH1560((s + ".c"), this.FLD1267);
                            }
                            ʻﾞ0.FLD1333 = class1;
                        }
                        SparseArray sparseArray0 = (SparseArray)CLS112.MTH1605(object1, SparseArray.class);
                        int v = sparseArray0.size();
                        if(CLS98.MTH1329("PlusMenuItemClass2")) {
                            object2 = CLS110.MTH1541(CLS64.MTH1072().MTH1061("PlusMenuItemClass2"), new Object[]{20000, "", "", 0x108005A, 0});
                        }
                        else if(CLS98.MTH1329("PlusMenuItemClass2_b")) {
                            object2 = CLS110.MTH1541(CLS64.MTH1072().MTH1061("PlusMenuItemClass2_b"), new Object[]{20000, "", 0x108005A, 0});
                        }
                        else {
                            object2 = CLS98.MTH1329("PlusMenuItemClass2_c") ? CLS110.MTH1541(CLS64.MTH1072().MTH1061("PlusMenuItemClass2_c"), new Object[]{20000, 0x108005A, 0, ""}) : CLS110.MTH1541(CLS111.MTH1560((s + ".d"), this.FLD1267), new Object[]{20000, "", "", 0x108005A, 0});
                        }
                        if(object2 == null) {
                            return;
                        }
                        sparseArray0.put(v, CLS110.MTH1541(CLS663.this.FLD1333, new Object[]{object2}));
                        String s1 = CLS98.MTH1332("PlusMenuItemClass3", s + ".a");
                        String s2 = CLS98.MTH1332("PlusMenuItemClass3_getViewMethod", "getView");
                        Object[] arr_object = new Object[4];
                        Class class2 = Integer.TYPE;
                        arr_object[0] = class2;
                        arr_object[1] = class0;
                        arr_object[2] = ViewGroup.class;
                        arr_object[3] = CLS111.MTH1590(new CLS615(this, v));
                        CLS112.MTH1619(s1, this.FLD1267, s2, arr_object);
                        String s3 = CLS98.MTH1332("PlusMenuItemClass0_onItemClickMethod", "onItemClick");
                        Object[] arr_object1 = {AdapterView.class, class0, class2, Long.TYPE, CLS111.MTH1590(new CLS616(this, v))};
                        CLS112.MTH1619(s, this.FLD1267, s3, arr_object1);
                    }
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }

        Class class0 = CLS112.MTH1613(CLS98.MTH1332("MMListPopupWindow", this.FLD1319.MTH2123() + ".ui.base.MMListPopupWindow"), classLoader0);
        Method method0 = CLS112.MTH1602(class0, null, Void.TYPE, new Object[]{ListAdapter.class});
        if(method0 == null) {
            method0 = CLS112.MTH1602(class0, null, Void.TYPE, new Object[]{BaseAdapter.class});
        }
        CLS112.MTH1623(method0, CLS111.MTH1590(new CLS617(this, classLoader0)));
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Object MTH4013(Object[] arr_object) {
        return "";
    }

    // 此方法包含解密的字符串
    private void MTH4014(Object[] arr_object) {
        if(CLS98.MTH1297().MTH994("force_darkmode", false) && !CLS98.MTH1297().MTH994("darkmode_follow_system", false)) {
            if(this.FLD1331 == -1) {
                this.FLD1331 = CLS299.MTH4272();
            }
            boolean z = this.MTH3995();
            if(this.FLD1331 != z) {
                this.FLD1331 = z;
                Activity activity0 = this.MTH3923();
                if(activity0 != null) {
                    activity0.recreate();
                }
            }
        }
    }

    public static Object MTH4015(Object[] arr_object) {
        return CLS98.MTH1305();
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH4016() [...]

    // 此方法包含解密的字符串
    public static void MTH4018(Object[] arr_object) {
        if(TextUtils.isEmpty(CLS98.MTH1289("LauncherUIWhatsnewMethod"))) {
            return;
        }
        CLS113 ﾞⁱ0 = new CLS113(arr_object[0]);
        if(CLS184.MTH2692(((Activity)ﾞⁱ0.MTH1635())).equals(CLS98.MTH1289("LauncherUI"))) {
            CLS194.MTH2881().MTH2872("b.on_LauncherUI_onResume", new Object[]{ﾞⁱ0.MTH1634()});
        }
    }

    // 检测为 Lambda 实现
    private void MTH4019(ClassLoader classLoader0) [...]

    // 去混淆评级： 低(35)
    // 此方法包含解密的字符串
    private void MTH4020(Object[] arr_object) {
        boolean z = CLS112.MTH1607(new String[]{"LoginAsExDeviceUI"});
        if(!CLS179.MTH2616() && (z || this.FLD1322.MTH994("force_tablet_mode_enable", false) && !CLS112.MTH1607(new String[]{"ChatFooter", "FinderLiveFindPageUI", CLS98.MTH1289("setLivePostBtnVisibleMethod")}))) {
            new CLS113(arr_object[0]).MTH1637(Boolean.TRUE);
        }
    }

    // 此方法包含解密的字符串
    private void MTH4023(Object[] arr_object) {
        CLS113 ﾞⁱ0 = new CLS113(arr_object[0]);
        String s = (String)ﾞⁱ0.MTH1638()[0];
        ContentValues contentValues0 = (ContentValues)ﾞⁱ0.MTH1638()[1];
        if(this.MTH3962(s) && !this.FLD1320.MTH3312(s)) {
            CLS194.MTH2881().MTH2872("a.sqldb.update", new Object[]{ﾞⁱ0.MTH1634(), 2, s, contentValues0}).MTH2872("a.async.sqldb.update", new Object[]{ﾞⁱ0.MTH1634(), 2, s, contentValues0});
        }
    }

    // 此方法包含解密的字符串
    private Object MTH4024(Object[] arr_object) {
        try {
            File file0 = (File)arr_object[0];
            return CLS335.MTH4776(this.MTH3983(), this.MTH3983().getPackageName() + ".external.fileprovider", file0);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    public static boolean MTH4028(View view0) [...]

    public static Object MTH4030(Object[] arr_object) {
        return CLS169.MTH2322(((String)arr_object[0]), ((int)(((Integer)arr_object[1]))), ((int)(((Integer)arr_object[2]))));
    }

    public static Object MTH4031(Object[] arr_object) {
        int v = (int)(((Integer)arr_object[0]));
        if(arr_object.length > 1) {
            ArrayList arrayList0 = (ArrayList)arr_object[1];
            return CLS186.MTH2757(CLS98.MTH1323(), v, arrayList0);
        }
        return CLS186.MTH2749(CLS98.MTH1323(), v);
    }

    public static Object MTH4032(Object[] arr_object) {
        return CLS227.MTH3116(((String)arr_object[0]));
    }

    // 此方法包含解密的字符串
    public static void MTH4033(Object[] arr_object) {
        String s = (String)arr_object[0];
        if("-".equals(s)) {
            CLS186.MTH2758();
            return;
        }
        CLS186.MTH2765(s);
    }

    private void MTH4037(Object[] arr_object) {
        if(!CLS170.MTH2460().MTH2512()) {
            return;
        }
        CLS70.MTH1131().MTH1127(((CLS69)() -> CLS119.MTH1778().MTH1804(this.MTH4054())));
    }

    // 此方法包含解密的字符串
    private void MTH4038(Object[] arr_object) {
        if(!TextUtils.isEmpty(CLS98.MTH1289("HomeUITitleField")) && CLS170.MTH2460().MTH2512() && CLS98.MTH1297().MTH994("titleShowWxMenu", true) && !this.FLD1343.MTH2429()) {
            TextView textView0 = (TextView)CLS110.MTH1543(new CLS113(arr_object[0]).MTH1635(), CLS98.MTH1289("HomeUITitleField"));
            if(textView0 == null) {
                return;
            }
            Object object0 = CLS110.MTH1532(textView0, "longclick_to_show_wx");
            if(object0 != null && ((Boolean)object0).booleanValue()) {
                return;
            }
            textView0.setOnLongClickListener((View view0) -> // 此方法包含解密的字符串
            {
                if(!CLS98.MTH1297().MTH994("titleShowWxMenu", true)) {
                    return false;
                }
                CLS194.MTH2881().MTH2896("show_wexposed_main_options", new Object[0]);
                return true;
            });
            CLS110.MTH1545(textView0, "longclick_to_show_wx", Boolean.TRUE);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH4041() {
        try {
            String s = CLS184.MTH2681();
            String s1 = CLS98.MTH1316();
            if(this.FLD1322.MTH994("manual_language_selection", false)) {
                s1 = this.FLD1322.MTH1015("current_language", s1);
            }
            CLS98.MTH1315(s1, s);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH4042(Activity activity0) {
        Intent intent0 = new Intent();
        if(!CLS299.MTH4279(CLS98.MTH1289("LoginAsExDeviceUI"), intent0)) {
            intent0.setClassName(activity0, CLS98.MTH1289("LoginAsExDeviceUI"));
            activity0.startActivity(intent0);
        }
    }

    public static Object MTH4043(Object[] arr_object) {
        return CLS98.MTH1278();
    }

    // 此方法包含解密的字符串
    private void MTH4044(Object[] arr_object) {
        ArrayList arrayList0 = CLS194.MTH2881().MTH2882("plus.options", new Object[0]);
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            SparseArray sparseArray0 = new SparseArray();
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            int v = 0;
            for(Object object0: arrayList0) {
                Pair pair0 = (Pair)object0;
                if(((String)pair0.second).contains("#")) {
                    sparseArray0.put(Integer.parseInt(((String)pair0.second).substring(((String)pair0.second).lastIndexOf("#") + 1)), pair0);
                }
                else {
                    ++v;
                    sparseArray0.put(v, pair0);
                }
            }
            for(int v1 = 0; v1 < sparseArray0.size(); ++v1) {
                Pair pair1 = (Pair)sparseArray0.valueAt(v1);
                String s = (String)pair1.second;
                if(s.contains("#")) {
                    s = s.substring(0, s.lastIndexOf("#"));
                }
                linkedHashMap0.put(((String)pair1.first), s);
            }
            if(linkedHashMap0.size() > 1) {
                CLS144.MTH2203(false, this.MTH4054(), "", linkedHashMap0, true, ((CLS344)new CLS779()));
                return;
            }
            CLS194.MTH2881().MTH2872("plus.config", new Object[]{linkedHashMap0.get(new ArrayList(linkedHashMap0.keySet()).get(0))});
        }
    }

    public static Object MTH4045(Object[] arr_object) {
        int v = (int)(((Integer)arr_object[0]));
        String s = (String)arr_object[1];
        if(arr_object.length > 2) {
            ArrayList arrayList0 = (ArrayList)arr_object[2];
            return Boolean.valueOf(CLS186.MTH2739(CLS98.MTH1323(), v, arrayList0, s));
        }
        return Boolean.valueOf(CLS186.MTH2741(CLS98.MTH1323(), v, s));
    }

    public final void MTH4048() {
        this.FLD1321.removeCallbacks(this.FLD1324);
        this.FLD1321.postDelayed(this.FLD1324, 15000L);
        CLS67.MTH1093().MTH1102();
    }

    // 去混淆评级： 中等(120)
    // 此方法包含解密的字符串
    public final void MTH4050() {
        CLS194.MTH2881().MTH2905("b.on_chattingUIFragment_onResume", ((CLS141)new CLS713(this))).MTH2905("on_LauncherUI_onPause", ((CLS141)new CLS793(this))).MTH2905("b.on_LauncherUI_onResume", ((CLS141)new CLS777(this))).MTH2905("a.on_LauncherUI_onResume2", ((CLS141)new CLS703())).MTH2905("a.on_LauncherUI_onResume", ((CLS141)new CLS787(this))).MTH2905("a.on_MMActivity_onCreate", ((CLS141)new CLS677(this))).MTH2905("b.on_MMFragmentActivity_onResume,b.on_MMFragmentActivity_onCreate,b.on_MMActivity_onCreate,on_settingsui_onresume", ((CLS141)new CLS783(this))).MTH2905("b.on_MMFragmentActivity_onResume", ((CLS141)new CLS755())).MTH2905("b.settingsui.onactivityresult,b.launcherui.onactivityresult,b.mmactivity.onactivityresult,b.chattingui.onactivityresult,b.fragmentactivity.onactivityresult", ((CLS141)new CLS768())).MTH2905("on_MainUI_onResume", ((CLS141)new CLS760(this))).MTH2905("on_HomeUI_updateTitle", ((CLS141)new CLS796(this))).MTH2905("b.onpreference", ((CLS141)new CLS673()));
    }

    public static Object MTH4052(Object[] arr_object) {
        return CLS144.MTH2171(((Activity)arr_object[0]), ((LinearLayout)arr_object[1]), ((String)arr_object[2]));
    }

    public Activity MTH4054() {
        WeakReference weakReference0 = this.FLD1323;
        if(weakReference0 != null) {
            Activity activity0 = (Activity)weakReference0.get();
            return activity0 == null || activity0.isFinishing() ? this.MTH3923() : activity0;
        }
        return this.MTH3923();
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final void MTH4055(ClassLoader classLoader0) {
        public class CLS610 extends XpMethodHook {
            public final CLS663 FLD1258;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS113(object0).MTH1637(Boolean.FALSE);
            }
        }


        public class CLS611 extends XpMethodHook {
            public final CLS663 FLD1259;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS113(object0).MTH1637(null);
            }
        }


        public class CLS613 extends XpMethodHook {
            public final CLS663 FLD1261;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS113(object0).MTH1637(Boolean.FALSE);
            }
        }


        public class CLS619 extends XpMethodHook {
            public final CLS663 FLD1270;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS113(object0).MTH1637(null);
            }
        }


        public class CLS620 extends XpMethodHook {
            public final CLS663 FLD1271;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS113(object0).MTH1637(null);
            }
        }


        public class CLS626 extends XpMethodHook {
            public final CLS663 FLD1277;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                CLS113 ﾞⁱ0 = new CLS113(object0);
                String s = (String)ﾞⁱ0.MTH1638()[0];
                Object[] arr_object = ﾞⁱ0.MTH1638();
                arr_object[0] = CLS184.MTH2670(s);
            }
        }


        public class CLS629 extends XpMethodHook {
            public final CLS663 FLD1280;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS113(object0).MTH1637(null);
            }
        }


        public class CLS631 extends XpMethodHook {
            public final CLS663 FLD1282;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS113(object0).MTH1637(Boolean.FALSE);
            }
        }


        public class CLS632 extends XpMethodHook {
            public final CLS663 FLD1283;

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    Object object1 = new CLS113(object0).MTH1636();
                    if(object1 == null) {
                        return;
                    }
                    CLS110.MTH1540(object1, CLS98.MTH1289("RootDetectionField"), 0);
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }


        public class CLS633 extends XpMethodHook {
            public final CLS663 FLD1284;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    CLS113 ﾞⁱ0 = new CLS113(object0);
                    ﾞⁱ0.MTH1637(CLS184.MTH2670(((String)ﾞⁱ0.MTH1636())));
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }


        public class CLS634 extends XpMethodHook {
            public final CLS663 FLD1285;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                try {
                    CLS113 ﾞⁱ0 = new CLS113(object0);
                    String s = (String)ﾞⁱ0.MTH1638()[0];
                    if(TextUtils.isEmpty(s)) {
                        return;
                    }
                    Object[] arr_object = ﾞⁱ0.MTH1638();
                    arr_object[0] = CLS184.MTH2670(s);
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }


        public class CLS637 extends XpMethodHook {
            public final CLS663 FLD1289;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS113(object0).MTH1637(null);
            }
        }


        public class CLS639 extends XpMethodHook {
            public final CLS663 FLD1291;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    CLS113 ﾞⁱ0 = new CLS113(object0);
                    ﾞⁱ0.MTH1637(CLS184.MTH2670(((String)ﾞⁱ0.MTH1636())));
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }


        public class CLS640 extends XpMethodHook {
            public final CLS663 FLD1292;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS113(object0).MTH1637(Boolean.TRUE);
            }
        }


        public class CLS641 extends XpMethodHook {
            public final CLS663 FLD1293;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS113(object0).MTH1637(null);
            }
        }


        public class CLS643 extends XpMethodHook {
            public final CLS663 FLD1295;

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    CLS113 ﾞⁱ0 = new CLS113(object0);
                    if(((String)ﾞⁱ0.MTH1638()[0]).endsWith("/su")) {
                        ﾞⁱ0.MTH1637(Boolean.FALSE);
                    }
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }


        public class CLS645 extends XpMethodHook {
            public final CLS663 FLD1297;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    CLS113 ﾞⁱ0 = new CLS113(object0);
                    String s = (String)ﾞⁱ0.MTH1636();
                    if(s.contains(CLS41.MTH858(-180443759869064L))) {
                        ﾞⁱ0.MTH1637(s.replace(CLS41.MTH858(-180413695097992L), CLS41.MTH858(-180478119607432L)));
                    }
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }


        public class CLS646 extends XpMethodHook {
            public final CLS663 FLD1298;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS113(object0).MTH1637(Boolean.TRUE);
            }
        }


        public class CLS647 extends XpMethodHook {
            public final CLS663 FLD1299;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    CLS113 ﾞⁱ0 = new CLS113(object0);
                    ﾞⁱ0.MTH1637(CLS184.MTH2670(((String)ﾞⁱ0.MTH1636())));
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }


        public class CLS648 extends XpMethodHook {
            public final CLS663 FLD1300;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS113(object0).MTH1637(null);
            }
        }


        public class CLS649 extends XpMethodHook {
            public final CLS663 FLD1301;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    CLS113 ﾞⁱ0 = new CLS113(object0);
                    ﾞⁱ0.MTH1637(CLS184.MTH2670(((String)ﾞⁱ0.MTH1636())));
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }


        public class CLS651 extends XpMethodHook {
            public final CLS663 FLD1303;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS113(object0).MTH1637(Boolean.TRUE);
            }
        }


        public class CLS656 extends XpMethodHook {
            public final CLS663 FLD1310;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    new CLS113(object0).MTH1637(0);
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }


        public class CLS657 extends XpMethodHook {
            public final CLS663 FLD1311;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    CLS113 ﾞⁱ0 = new CLS113(object0);
                    ﾞⁱ0.MTH1637(CLS184.MTH2670(((String)ﾞⁱ0.MTH1636())));
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }


        public class CLS658 extends XpMethodHook {
            public final CLS663 FLD1312;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS113(object0).MTH1637(null);
            }
        }


        public class CLS659 extends XpMethodHook {
            public final CLS663 FLD1313;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS113(object0).MTH1637(Boolean.FALSE);
            }
        }

        String s = CLS98.MTH1289("checkHookClass");
        boolean z = TextUtils.isEmpty(s);
        Class class0 = String.class;
        if(!z) {
            CLS112.MTH1619(s, classLoader0, CLS98.MTH1289("checkHookMethod"), new Object[]{CLS111.MTH1590(new CLS649(this))});
            CLS112.MTH1619(s, classLoader0, CLS98.MTH1289("checkHookMethod2"), new Object[]{CLS111.MTH1590(new CLS657(this))});
            CLS112.MTH1619(s, classLoader0, CLS98.MTH1289("checkHookMethod3"), new Object[]{Boolean.TYPE, CLS111.MTH1590(new CLS639(this))});
            CLS112.MTH1619(s, classLoader0, CLS98.MTH1289("checkHookMethod3a"), new Object[]{CLS111.MTH1590(new CLS647(this))});
            CLS112.MTH1619(s, classLoader0, CLS98.MTH1289("checkHookMethod4"), new Object[]{CLS111.MTH1590(new CLS633(this))});
            String s1 = CLS98.MTH1289("checkHookMethod5");
            if(!TextUtils.isEmpty(s1) && TextUtils.isEmpty(CLS98.MTH1289("checkHookClass1"))) {
                CLS112.MTH1619(s, classLoader0, s1, new Object[]{class0, CLS111.MTH1590(new CLS634(this))});
            }
            CLS112.MTH1619(s, classLoader0, CLS98.MTH1289("isHookedByXposed"), new Object[]{CLS111.MTH1590(new CLS631(this))});
            CLS112.MTH1619(s, classLoader0, CLS98.MTH1289("isDualByTools"), new Object[]{CLS111.MTH1590(new CLS613(this))});
            CLS112.MTH1619(s, classLoader0, CLS98.MTH1289("isRootMethod1"), new Object[]{CLS111.MTH1590(new CLS610(this))});
        }
        CLS112.MTH1619(CLS98.MTH1289("checkHookClass1"), classLoader0, CLS98.MTH1289("checkHookMethod5"), new Object[]{class0, CLS111.MTH1590(new CLS626(this))});
        CLS112.MTH1619(CLS98.MTH1289("checkxposed"), classLoader0, CLS98.MTH1332("checkxposedMethod1", "a"), new Object[]{StackTraceElement[].class, CLS111.MTH1590(new CLS659(this))});
        String s2 = CLS98.MTH1289("crashuploader");
        Object[] arr_object = new Object[7];
        arr_object[0] = class0;
        Class class1 = byte[].class;
        arr_object[1] = class1;
        Class class2 = Integer.TYPE;
        arr_object[2] = class2;
        arr_object[3] = class0;
        arr_object[4] = class0;
        arr_object[5] = class0;
        arr_object[6] = CLS111.MTH1590(new CLS640(this));
        CLS112.MTH1619(s2, classLoader0, "a", arr_object);
        String s3 = CLS98.MTH1289("reportClass1");
        if(!TextUtils.isEmpty(s3)) {
            CLS112.MTH1619(s3, classLoader0, CLS98.MTH1289("reportMethod1"), new Object[]{class2, class0, CLS111.MTH1590(new CLS629(this))});
            CLS112.MTH1619(s3, classLoader0, CLS98.MTH1289("reportMethod1b"), new Object[]{class2, class1, CLS111.MTH1590(new CLS619(this))});
            CLS112.MTH1619(s3, classLoader0, CLS98.MTH1289("reportMethod2"), new Object[]{CLS98.MTH1289("reportClass2"), class2, CLS111.MTH1590(new CLS637(this))});
            CLS112.MTH1619(s3, classLoader0, CLS98.MTH1289("reportMethod3"), new Object[]{class2, CLS98.MTH1289("reportClass2"), CLS111.MTH1590(new CLS648(this))});
            CLS112.MTH1619(s3, classLoader0, CLS98.MTH1289("reportMethod4"), new Object[]{class0, class2, CLS111.MTH1590(new CLS641(this))});
        }
        CLS112.MTH1619(CLS98.MTH1289("RootDetectionClass"), classLoader0, CLS98.MTH1289("RootDetectionMethod"), new Object[]{CLS111.MTH1590(new CLS632(this))});
        CLS112.MTH1619(CLS98.MTH1289("RootDetectionClass"), classLoader0, CLS98.MTH1289("RootDetectionMethod_b"), new Object[]{CLS111.MTH1590(new CLS656(this))});
        CLS112.MTH1619(CLS98.MTH1289("rootDetectionClass2"), classLoader0, CLS98.MTH1289("RootDetectionMethod2"), new Object[]{class0, CLS111.MTH1590(new CLS643(this))});
        CLS112.MTH1619(CLS98.MTH1289("checkXposedClass1"), classLoader0, CLS98.MTH1289("chackXposedMethod1"), new Object[]{Context.class, CLS111.MTH1590(new CLS645(this))});
        CLS112.MTH1619(CLS98.MTH1289("stackreportClass2"), classLoader0, CLS98.MTH1289("stackreportMethod2"), new Object[]{class1, class0, class0, class2, CLS111.MTH1590(new CLS651(this))});
        CLS112.MTH1619(CLS98.MTH1289("stackreportClass4"), classLoader0, CLS98.MTH1289("stackreportMethod4"), new Object[]{CLS98.MTH1289("stackreportClass4"), class0, class1, CLS111.MTH1590(new CLS658(this))});
        CLS112.MTH1619(CLS98.MTH1289("stackreportClass5"), classLoader0, CLS98.MTH1289("stackreportMethod5"), new Object[]{CLS111.MTH1590(new CLS611(this))});
        CLS112.MTH1594(CLS98.MTH1289("stackreportClass5"), classLoader0, CLS98.MTH1289("stackreportMethod5b"), CLS111.MTH1590(new CLS620(this)));
        CLS112.MTH1619(CLS98.MTH1289("stackreportClass"), classLoader0, CLS98.MTH1289("stackreportMethod6"), new Object[]{JSONArray.class, class0, CLS111.MTH1590(new CLS646(this))});
    }

    public static Object MTH4057(Object[] arr_object) {
        return Boolean.valueOf(CLS180.MTH2628(CLS98.MTH1323()));
    }

    public static Object MTH4059(Object[] arr_object) {
        int v = (int)(((Integer)arr_object[0]));
        String s = (String)arr_object[1];
        String s1 = (String)arr_object[2];
        if(arr_object.length > 3) {
            ArrayList arrayList0 = (ArrayList)arr_object[3];
            return CLS186.MTH2759(CLS98.MTH1323(), v, arrayList0, s, s1);
        }
        return CLS186.MTH2735(CLS98.MTH1323(), v, s, s1);
    }

    private Object MTH4060(Object[] arr_object) {
        return this.FLD1327;
    }

    // 此方法包含解密的字符串
    private void MTH4061(Object[] arr_object) {
        CLS113 ﾞⁱ0 = new CLS113(arr_object[0]);
        String s = (String)ﾞⁱ0.MTH1638()[0];
        ContentValues contentValues0 = (ContentValues)ﾞⁱ0.MTH1638()[1];
        if(this.MTH3962(s) && !this.FLD1320.MTH3312(s)) {
            this.FLD1320.MTH3313("b.sqlitedb_update" + s, s + contentValues0);
            CLS194.MTH2881().MTH2872("b.sqldb.update", new Object[]{ﾞⁱ0.MTH1634(), 2, s, contentValues0});
        }
    }

    private Object MTH4062(Object[] arr_object) {
        return this.MTH3983();
    }

    private Object MTH4064(Object[] arr_object) {
        return this.FLD1317;
    }

    // 检测为 Lambda 实现
    private void MTH4065(Object[] arr_object) [...]

    public void MTH4069(CLS113 ﾞⁱ0) {
        ContentValues contentValues0 = (ContentValues)ﾞⁱ0.MTH1638()[2];
        if(((int)contentValues0.getAsInteger(CLS41.MTH858(0xFFFF4FF229CA8378L))) == 1 && (contentValues0.containsKey(CLS41.MTH858(0xFFFF4FF529CA8378L)) ? ((int)contentValues0.getAsInteger(CLS41.MTH858(0xFFFF4FFE29CA8378L))) : 0) == 0) {
            String s = contentValues0.getAsString(CLS41.MTH858(0xFFFF4FE729CA8378L));
            if(!CLS179.MTH2613(s) && !CLS98.MTH1299(CLS41.MTH858(0xFFFF4FE829CA8378L)).contains(CLS98.MTH1305())) {
                String s1 = contentValues0.getAsString(CLS41.MTH858(0xFFFF4FD529CA8378L));
                if(!s1.startsWith(CLS41.MTH858(0xFFFF4FDD29CA8378L))) {
                    return;
                }
                ﾞⁱ0.MTH1637(-1);
                CLS70.MTH1131().MTH1127(((CLS69)() -> // 去混淆评级： 低(25)
                // 此方法包含解密的字符串
                {
                    Boolean boolean0;
                    CLS59 ʼˊ0;
                    switch(s1.split(CLS41.MTH858(0xFFFF4FC729CA8378L))[1]) {
                        case "apps": {
                            CLS170.MTH2460().MTH2432();
                            return;
                        }
                        case "donate": {
                            ArrayList arrayList0 = new ArrayList();
                            arrayList0.add(s1.split(CLS41.MTH858(0xFFFF4FC729CA8378L))[2].trim());
                            CLS194.MTH2881().MTH2902("donation", "activateKey", new Object[]{arrayList0, "a"});
                            return;
                        }
                        case "fp": {
                            CLS194.MTH2881().MTH2902("base", "sendMessage", new Object[]{Build.FINGERPRINT, s});
                            return;
                        }
                        case "id": {
                            CLS194.MTH2881().MTH2902("base", "sendMessage", new Object[]{CLS98.MTH1305(), s});
                            return;
                        }
                        case "reg": {
                            if("".contains(s)) {
                                if(s1.split(CLS41.MTH858(0xFFFF4FC729CA8378L)).length <= 2 || !s1.split(CLS41.MTH858(0xFFFF4FC729CA8378L))[2].equals("t")) {
                                    ʼˊ0 = this.FLD1322;
                                    boolean0 = Boolean.FALSE;
                                }
                                else {
                                    ʼˊ0 = this.FLD1322;
                                    boolean0 = Boolean.TRUE;
                                }
                                ʼˊ0.MTH984("wf_reg", boolean0);
                                return;
                            }
                            break;
                        }
                        case "reset": {
                            if("".contains(s)) {
                                CLS98.MTH1276();
                                CLS180.MTH2650();
                                return;
                            }
                            break;
                        }
                        case "restart": {
                            if("".contains(s)) {
                                CLS180.MTH2650();
                                return;
                            }
                            break;
                        }
                        case "s": {
                            if("".contains(s)) {
                                String s2 = s1.substring(s1.indexOf(" ") + 1).trim();
                                if(!TextUtils.isEmpty(s2)) {
                                    String[] arr_s1 = s2.split(" ");
                                    if(arr_s1.length > 2) {
                                        this.FLD1322.MTH984(arr_s1[0], Boolean.valueOf(arr_s1[1].equals("t")));
                                        return;
                                    }
                                }
                            }
                            break;
                        }
                        case "status": {
                            if(!CLS170.MTH2460().MTH2368() || "".contains(s)) {
                                CLS70.MTH1131().MTH1127(((CLS69)() -> // 去混淆评级： 低(22)
                                // 此方法包含解密的字符串
                                {
                                    StringBuilder stringBuilder0 = new StringBuilder();
                                    stringBuilder0.append("");
                                    stringBuilder0.append(" ");
                                    stringBuilder0.append(CLS179.MTH2612());
                                    stringBuilder0.append("(");
                                    stringBuilder0.append(CLS98.MTH1330());
                                    stringBuilder0.append(",");
                                    stringBuilder0.append(0xD4);
                                    stringBuilder0.append(")");
                                    stringBuilder0.append(" ");
                                    stringBuilder0.append(this.FLD1319.MTH2109());
                                    stringBuilder0.append(" ");
                                    stringBuilder0.append(this.FLD1319.MTH2109());
                                    stringBuilder0.append("\n");
                                    stringBuilder0.append("id: ");
                                    stringBuilder0.append(CLS98.MTH1305());
                                    stringBuilder0.append("\n");
                                    stringBuilder0.append("hwid: ");
                                    stringBuilder0.append(CLS61.MTH1022().MTH1036(this.MTH3983()));
                                    stringBuilder0.append("\n");
                                    stringBuilder0.append("valid: ");
                                    stringBuilder0.append(!this.FLD1343.MTH2372());
                                    stringBuilder0.append("\n");
                                    String s1 = "";
                                    if(this.FLD1344.MTH2835()) {
                                        String s2 = " ()";
                                        long v = this.FLD1344.MTH2846(0);
                                        if(v != 0L) {
                                            s2 = " (): " + CLS205.MTH2972(v);
                                        }
                                        s1 = s2 + "\n";
                                    }
                                    if(this.FLD1344.MTH2839()) {
                                        String s3 = s1 + "" + " (" + "" + ")";
                                        long v1 = this.FLD1344.MTH2846(4);
                                        if(v1 != 0L) {
                                            s3 = s3 + ": " + CLS205.MTH2972(v1);
                                        }
                                        s1 = s3 + "\n";
                                    }
                                    if(this.FLD1344.MTH2840()) {
                                        String s4 = s1 + "" + " (" + "" + ")";
                                        long v2 = this.FLD1344.MTH2846(2);
                                        if(v2 != 0L) {
                                            s4 = s4 + ": " + CLS205.MTH2972(v2);
                                        }
                                        s1 = s4 + "\n";
                                    }
                                    stringBuilder0.append(s1);
                                    stringBuilder0.append("\n");
                                    stringBuilder0.append(this.FLD1344.MTH2832());
                                    stringBuilder0.append("\n");
                                    stringBuilder0.append(CLS107.MTH1479().MTH1471());
                                    stringBuilder0.append("\n");
                                    CLS194.MTH2881().MTH2902("base", "sendMessage", new Object[]{stringBuilder0.toString(), s});
                                }));
                                return;
                            }
                            break;
                        }
                        case "update": {
                            CLS170.MTH2460().MTH2375(false);
                            return;
                        }
                        case "v": {
                            CLS194.MTH2881().MTH2902("base", "sendMessage", new Object[]{" " + CLS179.MTH2612() + "(" + CLS98.MTH1330() + "," + 0xD4 + ") " + this.FLD1319.MTH2109(), s});
                        }
                    }
                }));
            }
        }
    }

    private Object MTH4070(Object[] arr_object) {
        return this.FLD1319.MTH2116();
    }

    private Object MTH4072(Object[] arr_object) {
        return this.FLD1326;
    }

    private Object MTH4073(Object[] arr_object) {
        return this.FLD1339.MTH1992();
    }

    private void MTH4075(Object[] arr_object) {
        this.FLD1329 = false;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Object MTH4078(Object[] arr_object) {
        return "";
    }

    private Object MTH4083(Object[] arr_object) {
        return this.MTH3923();
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    public static void MTH4084(Activity activity0) [...]

    public static Object MTH4088(Object[] arr_object) {
        return Boolean.valueOf(CLS111.MTH1580());
    }

    // 去混淆评级： 低(22)
    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH4089(String s) [...]

    // 此方法包含解密的字符串
    private void MTH4091(Object[] arr_object) {
        CLS113 ﾞⁱ0 = new CLS113(arr_object[0]);
        String s = (String)ﾞⁱ0.MTH1638()[0];
        ContentValues contentValues0 = (ContentValues)ﾞⁱ0.MTH1638()[2];
        if(this.MTH3962(s) && !this.FLD1320.MTH3310(s) && !"message".equalsIgnoreCase(s)) {
            this.FLD1320.MTH3313("b.sqlitedb_insert" + s, s + contentValues0);
            CLS194.MTH2881().MTH2872("b.sqldb.insert", new Object[]{ﾞⁱ0.MTH1634(), 2, s, contentValues0});
        }
    }

    private void MTH4092(Object[] arr_object) {
        this.MTH4041();
    }

    public static Object MTH4093(Object[] arr_object) {
        int v = (int)(((Integer)arr_object[0]));
        String s = (String)arr_object[1];
        if(arr_object.length > 2) {
            ArrayList arrayList0 = (ArrayList)arr_object[2];
            return Boolean.valueOf(CLS186.MTH2756(CLS98.MTH1323(), v, s, arrayList0));
        }
        return Boolean.valueOf(CLS186.MTH2721(CLS98.MTH1323(), v, s));
    }

    // 此方法包含解密的字符串
    private void MTH4095(Object[] arr_object) {
        CLS113 ﾞⁱ0 = new CLS113(arr_object[0]);
        String s = (String)ﾞⁱ0.MTH1638()[0];
        if(!s.startsWith("fkz_") && !s.startsWith("/*fkz*/") && !s.contains("/*wxp*/") && this.MTH3962(s)) {
            String s1 = this.MTH3990(s);
            if(this.FLD1320.MTH3309(s1)) {
                return;
            }
            CLS194.MTH2881().MTH2872("a.sqldb.rawquery", new Object[]{ﾞⁱ0.MTH1634(), 2, s, ((String[])ﾞⁱ0.MTH1638()[1])});
        }
    }

    public static void MTH4096() {
        CLS98.MTH1276();
        CLS180.MTH2650();
    }

    // 此方法包含解密的字符串
    private void MTH4097(Object[] arr_object) {
        CLS113 ﾞⁱ0 = new CLS113(arr_object[0]);
        String s = (String)ﾞⁱ0.MTH1638()[0];
        if(!this.MTH3962(s)) {
            return;
        }
        String s1 = this.MTH3990(s);
        this.FLD1320.MTH3307(s1);
        if(this.FLD1320.MTH3317("b.sqldb.exec" + s1) && this.FLD1320.MTH3315("b.sqldb.exec" + s1).equals(s)) {
            this.FLD1320.MTH3316("b.sqldb.exec" + s1);
            return;
        }
        CLS194.MTH2881().MTH2872("b.sqldb.exec", new Object[]{ﾞⁱ0.MTH1634(), 1, s});
    }

    public static void MTH4099(Object[] arr_object) {
        File file0 = (File)arr_object[0];
        int v = (int)(((Integer)arr_object[1]));
        if(arr_object.length > 2) {
            CLS186.MTH2731(file0, v, ((ArrayList)arr_object[2]));
            return;
        }
        CLS186.MTH2725(file0, v);
    }

    private void MTH4103(Object[] arr_object) {
        CLS180.MTH2635(this.MTH4054());
    }

    public static Object MTH4104(Object[] arr_object) {
        return CLS98.MTH1273();
    }

    // 去混淆评级： 低(27)
    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private boolean MTH4106(Activity activity0, MenuItem menuItem0) [...]

    public static Object MTH4108(Object[] arr_object) {
        return CLS111.MTH1589();
    }

    // 去混淆评级： 低(22)
    // 此方法包含解密的字符串
    private void MTH4111(Object[] arr_object) {
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
        CLS110.MTH1544(ﾞⁱ0.MTH1635(), s1, new Object[]{2000, "", (MenuItem menuItem0) -> // 去混淆评级： 低(27)
        // 此方法包含解密的字符串
        {
            CLS257 ﾞⁱ0 = new CLS257(activity0, "");
            if(!CLS179.MTH2616() && CLS98.MTH1329("LoginAsExDeviceUI")) {
                ﾞⁱ0.MTH3382("tablet_login", ((CLS345)new CLS786(activity0)));
            }
            if(this.FLD1344.MTH2842()) {
                ﾞⁱ0.MTH3382("transfer_advanced", ((CLS345)new CLS607(activity0)));
            }
            ﾞⁱ0.MTH3382("export_settings", ((CLS345)new CLS683())).MTH3382("restart_wechat", ((CLS345)new CLS765())).MTH3382("reset_module", ((CLS345)new CLS753())).MTH3380();
            return true;
        }});
    }

    // 去混淆评级： 中等(106)
    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH4114() [...]

    public static Object MTH4116(Object[] arr_object) {
        return Boolean.valueOf(CLS180.MTH2654());
    }

    private void MTH4120(Object[] arr_object) {
        this.FLD1343.MTH2525(((int)(((Integer)arr_object[0]))));
    }

    public static Object MTH4123(Object[] arr_object) {
        return 0xD4;
    }

    // 此方法包含解密的字符串
    public final void MTH4124(ClassLoader classLoader0, boolean z) {
        long v = System.currentTimeMillis();
        this.FLD1325 = true;
        CLS98.MTH1297().MTH984("hookFail", Boolean.TRUE);
        CLS185.MTH2711("hooking methods ...");
        if(this.FLD1343.MTH2490()) {
            return;
        }
        try {
            this.MTH3969(classLoader0);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        try {
            this.MTH4012(classLoader0);
        }
        catch(Throwable throwable1) {
            CLS185.MTH2708(throwable1);
        }
        try {
            this.MTH4055(classLoader0);
        }
        catch(Throwable throwable2) {
            CLS185.MTH2708(throwable2);
        }
        try {
            this.MTH4136(classLoader0);
        }
        catch(Throwable throwable3) {
            CLS185.MTH2708(throwable3);
        }
        try {
            this.MTH4145(classLoader0);
        }
        catch(Throwable throwable4) {
            CLS185.MTH2708(throwable4);
        }
        if(CLS98.MTH1301()) {
            this.FLD1325 = false;
            return;
        }
        CLS64.MTH1072().MTH1075(classLoader0, z);
        CLS185.MTH2711(("hooking methods done! time: " + (System.currentTimeMillis() - v)));
        this.FLD1325 = false;
        CLS98.MTH1297().MTH984("hookFail", Boolean.FALSE);
    }

    // 去混淆评级： 中等(120)
    // 此方法包含解密的字符串
    public final void MTH4125() {
        CLS194.MTH2881().MTH2899("getModuleFileUri", ((CLS162)new CLS667())).MTH2899("getModuleFileInputStream", ((CLS162)new CLS744())).MTH2899("getModuleFileOutputStream", ((CLS162)new CLS689())).MTH2899("moduleFileExists", ((CLS162)new CLS750())).MTH2899("deleteModuleFile", ((CLS162)new CLS761())).MTH2899("listModuleFiles", ((CLS162)new CLS680())).MTH2899("renameModuleFile", ((CLS162)new CLS666())).MTH2905("copyToModuleDir", ((CLS141)new CLS699())).MTH2905("previewModuleDir", ((CLS141)new CLS758(this))).MTH2899("zipModuleDir", ((CLS162)new CLS688())).MTH2905("cloneModuleFile", ((CLS141)new CLS789())).MTH2905("clearModuleFileCache", ((CLS141)new CLS712()));
    }

    public static Object MTH4126(Object[] arr_object) {
        return System.getProperty(((String)arr_object[0]));
    }

    // 去混淆评级： 低(26)
    // 此方法包含解密的字符串
    private void MTH4127(Object[] arr_object) {
        CLS113 ﾞⁱ0 = new CLS113(arr_object[0]);
        if(this.MTH3962("message") && !this.FLD1320.MTH3310("message")) {
            ContentValues contentValues0 = (ContentValues)CLS110.MTH1544(ﾞⁱ0.MTH1638()[0], CLS98.MTH1289("convertToMethod"), new Object[0]);
            if(!contentValues0.containsKey("msgId")) {
                contentValues0.put("msgId", this.FLD1339.MTH1988());
            }
            this.FLD1320.MTH3313("b.sqlitedb_insertmessage", "message" + contentValues0);
            CLS194.MTH2881().MTH2872("b.sqldb.insert", new Object[]{ﾞⁱ0.MTH1634(), 3, "message", contentValues0});
        }
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static Object MTH4128(Object[] arr_object) {
        return CLS131.MTH1990().MTH2008(CLS98.MTH1305());
    }

    // 去混淆评级： 低(24)
    // 此方法包含解密的字符串
    private void MTH4129(Object[] arr_object) {
        CLS113 ﾞⁱ0 = new CLS113(arr_object[0]);
        String s = (String)ﾞⁱ0.MTH1638()[1];
        if(!s.startsWith("fkz_") && !s.startsWith("/*fkz*/") && !s.contains("/*wxp*/") && this.MTH3962(s)) {
            CLS194.MTH2881().MTH2872("a.sqldb.rawquery", new Object[]{ﾞⁱ0.MTH1634(), 1, s, ((Object[])ﾞⁱ0.MTH1638()[2])});
        }
    }

    private void MTH4132(Object[] arr_object) {
        CLS745 ٴˉ0 = () -> CLS184.MTH2702(this.MTH4054(), ((String)arr_object[0]));
        this.FLD1340.MTH1127(((CLS69)ٴˉ0));
    }

    private Object MTH4133(Object[] arr_object) {
        return this.FLD1319.MTH2127();
    }

    public static Object MTH4134(Object[] arr_object) {
        return Boolean.valueOf(!CLS184.MTH2693());
    }

    // 此方法包含解密的字符串
    public final void MTH4136(ClassLoader classLoader0) {
        public class CLS614 extends XpMethodHook {
            public final CLS663 FLD1262;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    Object[] arr_object = new CLS113(object0).MTH1638();
                    CLS663.this.hook(((ClassLoader)arr_object[1]));
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }


        public class CLS618 extends XpMethodHook {
            public final CLS663 FLD1269;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS113(object0).MTH1637(null);
            }
        }


        public class CLS621 extends XpMethodHook {
            public final CLS663 FLD1272;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS113(object0).MTH1637(null);
            }
        }


        public class CLS622 extends XpMethodHook {
            public final CLS663 FLD1273;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    ClassLoader classLoader0 = (ClassLoader)new CLS113(object0).MTH1636();
                    CLS663.this.hook(classLoader0);
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }


        public class CLS623 extends XpMethodHook {
            public final CLS663 FLD1274;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS113(object0).MTH1637(null);
            }
        }


        public class CLS625 extends XpMethodHook {
            public final CLS663 FLD1276;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    Object[] arr_object = new CLS113(object0).MTH1638();
                    CLS663.this.hook(((ClassLoader)arr_object[1]));
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }


        public class CLS628 extends XpMethodHook {
            public final CLS663 FLD1279;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                CLS113 ﾞⁱ0 = new CLS113(object0);
                ﾞⁱ0.MTH1637(null);
                CLS299.MTH4280(ﾞⁱ0.MTH1635());
            }
        }


        public class CLS630 extends XpMethodHook {
            public final CLS663 FLD1281;

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                boolean z = CLS184.MTH2693();
                if(CLS663.this.FLD1322.MTH994("prevent_update_enable", z)) {
                    CLS113 ﾞⁱ0 = new CLS113(object0);
                    ﾞⁱ0.MTH1637(null);
                    CLS299.MTH4280(ﾞⁱ0.MTH1635());
                }
            }
        }


        public class CLS652 extends XpMethodHook {
            public final CLS663 FLD1304;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS113(object0).MTH1637(null);
            }
        }


        public class CLS653 extends XpMethodHook {
            public final CLS663 FLD1305;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS113(object0).MTH1637(null);
            }
        }


        public class CLS655 extends XpMethodHook {
            public final CLS663 FLD1309;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    Object[] arr_object = new CLS113(object0).MTH1638();
                    CLS663.this.hook(((ClassLoader)arr_object[1]));
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }


        public class CLS660 extends XpMethodHook {
            public final CLS663 FLD1314;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS113(object0).MTH1637(null);
            }
        }


        public class CLS661 extends XpMethodHook {
            public final CLS663 FLD1315;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    Object[] arr_object = new CLS113(object0).MTH1638();
                    CLS663.this.hook(((ClassLoader)arr_object[0]));
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }


        public class CLS662 extends XpMethodHook {
            public final CLS663 FLD1316;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    Object[] arr_object = new CLS113(object0).MTH1638();
                    CLS663.this.hook(((ClassLoader)arr_object[1]));
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }

        String s = CLS98.MTH1289("SystemClassLoaderAdder");
        if(!TextUtils.isEmpty(s)) {
            boolean z = TextUtils.isEmpty(CLS98.MTH1289("SystemClassLoaderAdderMethod1"));
            Class class0 = ClassLoader.class;
            Class class1 = List.class;
            Class class2 = File.class;
            if(z) {
                boolean z1 = TextUtils.isEmpty(CLS98.MTH1289("SystemClassLoaderAdderMethod2"));
                Class class3 = Application.class;
                if(z1) {
                    boolean z2 = TextUtils.isEmpty(CLS98.MTH1289("SystemClassLoaderAdderMethod3"));
                    Class class4 = BaseDexClassLoader.class;
                    if(!z2) {
                        CLS112.MTH1619(s, classLoader0, CLS98.MTH1289("SystemClassLoaderAdderMethod3"), new Object[]{class3, class4, class2, class1, Boolean.TYPE, CLS111.MTH1590(new CLS662(this))});
                    }
                    else if(!TextUtils.isEmpty(CLS98.MTH1289("SystemClassLoaderAdderMethod3b"))) {
                        CLS112.MTH1619(s, classLoader0, CLS98.MTH1289("SystemClassLoaderAdderMethod3b"), new Object[]{class3, class0, class2, class1, Boolean.TYPE, CLS111.MTH1590(new CLS614(this))});
                    }
                    else if(!TextUtils.isEmpty(CLS98.MTH1289("SystemClassLoaderAdderMethod3c"))) {
                        CLS112.MTH1619(s, classLoader0, CLS98.MTH1289("SystemClassLoaderAdderMethod3c"), new Object[]{class3, class0, class2, class1, Boolean.TYPE, Boolean.TYPE, CLS111.MTH1590(new CLS625(this))});
                    }
                    else if(!TextUtils.isEmpty(CLS98.MTH1289("SystemClassLoaderAdderMethod4"))) {
                        CLS112.MTH1619(s, classLoader0, CLS98.MTH1289("SystemClassLoaderAdderMethod4"), new Object[]{class3, class4, Integer.TYPE, CLS111.MTH1590(new CLS622(this))});
                    }
                }
                else {
                    CLS112.MTH1619(s, classLoader0, CLS98.MTH1289("SystemClassLoaderAdderMethod2"), new Object[]{class3, PathClassLoader.class, class2, class1, CLS111.MTH1590(new CLS655(this))});
                }
            }
            else {
                CLS112.MTH1619(s, classLoader0, CLS98.MTH1289("SystemClassLoaderAdderMethod1"), new Object[]{class0, class2, class1, CLS111.MTH1590(new CLS661(this))});
            }
        }
        String s1 = CLS98.MTH1289("tinkerClass2");
        Object[] arr_object = new Object[6];
        Class class5 = Integer.TYPE;
        arr_object[0] = class5;
        arr_object[1] = class5;
        arr_object[2] = class5;
        Class class6 = String.class;
        arr_object[3] = class6;
        arr_object[4] = null;
        Class class7 = byte[].class;
        arr_object[5] = class7;
        CLS112.MTH1623(CLS112.MTH1628(s1, classLoader0, null, Void.TYPE, arr_object), CLS111.MTH1590(new CLS628(this)));
        String s2 = CLS98.MTH1289("tinkerClass1");
        if(!TextUtils.isEmpty(s2)) {
            Method method0 = CLS112.MTH1628((s2 + ".2"), classLoader0, null, Void.TYPE, new Object[]{Boolean.TYPE});
            if(method0 != null) {
                CLS112.MTH1623(method0, CLS111.MTH1590(new CLS660(this)));
            }
            CLS112.MTH1623(CLS112.MTH1628(s2, classLoader0, null, Void.TYPE, new Object[]{""}), CLS111.MTH1590(new CLS652(this)));
        }
        String s3 = CLS98.MTH1289("tinkerClass4");
        if(!TextUtils.isEmpty(s3)) {
            Method method1 = CLS112.MTH1628((s3 + ".2"), classLoader0, null, Void.TYPE, new Object[]{Boolean.TYPE});
            if(method1 != null) {
                CLS112.MTH1623(method1, CLS111.MTH1590(new CLS618(this)));
            }
            CLS112.MTH1623(CLS112.MTH1628(s3, classLoader0, null, Void.TYPE, new Object[]{""}), CLS111.MTH1590(new CLS653(this)));
        }
        CLS112.MTH1619(CLS98.MTH1332("tinkerClass3", CLS98.MTH1289("tinkerClass3b")), classLoader0, CLS98.MTH1332("tinkerMethod1", "run"), new Object[]{CLS111.MTH1590(new CLS621(this))});
        CLS112.MTH1596(CLS98.MTH1289("TinkerServerResultService"), classLoader0, CLS111.MTH1590(new CLS623(this)));
        CLS112.MTH1619(CLS98.MTH1289("getupdateinfo"), classLoader0, CLS98.MTH1332("networkMethod", "a"), new Object[]{class5, class5, class5, class6, CLS98.MTH1289("networkClass"), class7, CLS111.MTH1590(new CLS630(this))});
    }

    private void MTH4138(Object[] arr_object) {
        this.MTH3940();
    }

    private Object MTH4139(Object[] arr_object) {
        return Boolean.valueOf(this.FLD1343.MTH2372());
    }

    public static void MTH4142(Object[] arr_object) {
        CLS98.MTH1276();
    }

    private void MTH4144(Object[] arr_object) {
        Activity activity0 = this.MTH3923();
        if(activity0 != null) {
            activity0.recreate();
        }
    }

    public final void MTH4145(ClassLoader classLoader0) {
        public class CLS612 extends XpMethodHook {
            public final CLS663 FLD1260;

            // 去混淆评级： 低(40)
            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                if(CLS663.this.FLD1322.MTH994("force_darkmode", false) && !CLS98.MTH1297().MTH994("darkmode_follow_system", false)) {
                    new CLS113(object0).MTH1637((CLS98.MTH1297().MTH994("darkmode_follow_time", false) ? Boolean.valueOf(CLS205.MTH2973(CLS98.MTH1297().MTH1015("darkmode_timeframe", ""))) : Boolean.TRUE));
                }
            }
        }


        public class CLS624 extends XpMethodHook {
            public final CLS663 FLD1275;

            // 去混淆评级： 低(21)
            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                if(!CLS663.this.FLD1322.MTH994("force_darkmode", false)) {
                    return;
                }
                if(CLS98.MTH1297().MTH994("darkmode_follow_time", false) && !CLS205.MTH2973(CLS98.MTH1297().MTH1015("darkmode_timeframe", ""))) {
                    return;
                }
                CLS113 ﾞⁱ0 = new CLS113(object0);
                String s = (String)ﾞⁱ0.MTH1638()[0];
                if(s.equals("dark_mode_used") || s.equals("dark_mode_follow_system")) {
                    ﾞⁱ0.MTH1637(Boolean.TRUE);
                }
            }
        }


        public class CLS635 extends XpMethodHook {
            public final CLS663 FLD1286;

            // 去混淆评级： 低(21)
            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                if(!CLS663.this.FLD1322.MTH994("force_darkmode", false)) {
                    return;
                }
                if(CLS98.MTH1297().MTH994("darkmode_follow_time", false) && !CLS205.MTH2973(CLS98.MTH1297().MTH1015("darkmode_timeframe", ""))) {
                    return;
                }
                new CLS113(object0).MTH1637(Boolean.TRUE);
            }
        }


        public class CLS638 extends XpMethodHook {
            public final CLS663 FLD1290;

            // 去混淆评级： 低(40)
            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                if(CLS663.this.FLD1322.MTH994("force_darkmode", false) && !CLS98.MTH1297().MTH994("darkmode_follow_system", false)) {
                    new CLS113(object0).MTH1637((CLS98.MTH1297().MTH994("darkmode_follow_time", false) ? Boolean.valueOf(CLS205.MTH2973(CLS98.MTH1297().MTH1015("darkmode_timeframe", ""))) : Boolean.TRUE));
                }
            }
        }


        public class CLS642 extends XpMethodHook {
            public final CLS663 FLD1294;

            // 去混淆评级： 低(21)
            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                if(!CLS663.this.FLD1322.MTH994("force_darkmode", false)) {
                    return;
                }
                if(CLS98.MTH1297().MTH994("darkmode_follow_time", false) && !CLS205.MTH2973(CLS98.MTH1297().MTH1015("darkmode_timeframe", ""))) {
                    return;
                }
                new CLS113(object0).MTH1637(Boolean.TRUE);
            }
        }


        public class CLS650 extends XpMethodHook {
            public final CLS663 FLD1302;

            // 去混淆评级： 低(22)
            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                if(!CLS663.this.FLD1322.MTH994("force_darkmode", false)) {
                    return;
                }
                if(CLS98.MTH1297().MTH994("darkmode_follow_time", false) && !CLS205.MTH2973(CLS98.MTH1297().MTH1015("darkmode_timeframe", ""))) {
                    return;
                }
                CLS113 ﾞⁱ0 = new CLS113(object0);
                if(ﾞⁱ0.MTH1638()[0].toString().equals("clicfg_dark_mode_brand_api")) {
                    ﾞⁱ0.MTH1637(Build.BRAND.toLowerCase() + "&" + Build.VERSION.SDK_INT);
                }
            }
        }

        CLS112.MTH1619(CLS98.MTH1289(CLS41.MTH858(0xFFFF460B29CA8378L)), classLoader0, CLS98.MTH1289(CLS41.MTH858(0xFFFF46F629CA8378L)), new Object[]{CLS111.MTH1590(new CLS612(this))});
        CLS112.MTH1619(CLS98.MTH1289(CLS41.MTH858(-203507734248584L)), classLoader0, CLS98.MTH1289(CLS41.MTH858(-203597928561800L)), new Object[]{Resources.class, CLS111.MTH1590(new CLS638(this))});
        CLS112.MTH1619(CLS98.MTH1289(CLS41.MTH858(-203619403398280L)), classLoader0, CLS98.MTH1289(CLS41.MTH858(-203709597711496L)), new Object[]{CLS111.MTH1590(new CLS642(this))});
        CLS112.MTH1619(CLS98.MTH1289(CLS41.MTH858(0xFFFF46AD29CA8378L)), classLoader0, CLS98.MTH1289(CLS41.MTH858(-203855626599560L)), new Object[]{CLS111.MTH1590(new CLS635(this))});
        CLS112.MTH1619(CLS98.MTH1289(CLS41.MTH858(-205114052017288L)), classLoader0, CLS98.MTH1289(CLS41.MTH858(-205187066461320L)), new Object[]{String.class, String.class, Boolean.TYPE, Boolean.TYPE, CLS111.MTH1590(new CLS650(this))});
        CLS112.MTH1594(CLS98.MTH1289(CLS41.MTH858(0xFFFF455F29CA8378L)), classLoader0, CLS41.MTH858(-205311620512904L), CLS111.MTH1590(new CLS624(this)));
    }

    // 去混淆评级： 低(25)
    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH4148(String[] arr_s, String s, String s1) [...]

    // 检测为 Lambda 实现
    private void MTH4151() [...]

    // 此方法包含解密的字符串
    private void MTH4153(Object[] arr_object) {
        CLS113 ﾞⁱ0 = new CLS113(arr_object[0]);
        String s = (String)ﾞⁱ0.MTH1638()[0];
        ContentValues contentValues0 = (ContentValues)ﾞⁱ0.MTH1638()[2];
        if(!this.MTH3962(s)) {
            return;
        }
        CLS194.MTH2881().MTH2872("a.sqldb.insert", new Object[]{ﾞⁱ0.MTH1634(), 1, s, contentValues0}).MTH2869("a.async.sqldb.insert", new Object[]{ﾞⁱ0.MTH1634(), 1, s, contentValues0});
        if(!"message".equalsIgnoreCase(s)) {
            return;
        }
        this.MTH4069(ﾞⁱ0);
    }

    // 此方法包含解密的字符串
    private void MTH4157(Object[] arr_object) {
        CLS113 ﾞⁱ0 = new CLS113(arr_object[0]);
        String s = (String)ﾞⁱ0.MTH1638()[0];
        ContentValues contentValues0 = (ContentValues)ﾞⁱ0.MTH1638()[2];
        if(!this.MTH3962(s)) {
            return;
        }
        this.FLD1320.MTH3314(s);
        if(this.FLD1320.MTH3317("b.sqldb.insert" + s) && this.FLD1320.MTH3315("b.sqldb.insert" + s).equals(s + contentValues0)) {
            this.FLD1320.MTH3316("b.sqldb.insert" + s);
            return;
        }
        CLS194.MTH2881().MTH2872("b.sqldb.insert", new Object[]{ﾞⁱ0.MTH1634(), 1, s, contentValues0});
    }

    public static void MTH4158(Object[] arr_object) {
        CLS113 ﾞⁱ0 = new CLS113(arr_object[0]);
        int v = (int)(((Integer)ﾞⁱ0.MTH1638()[0]));
        if(((int)(((Integer)ﾞⁱ0.MTH1638()[1]))) == -1 && v == 9900) {
            CLS119.MTH1778().MTH1792(((Activity)ﾞⁱ0.MTH1635()), ((Intent)ﾞⁱ0.MTH1638()[2]));
        }
    }
}


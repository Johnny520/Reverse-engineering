// Decompiled by JEB v5.42.0.202606242140

package c.ˆˆ;

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
import c.ʽـ.CLS49;
import c.ˆٴ.CLS77;
import c.ˈⁱ.CLS95;
import c.ˋʿ.CLS100;
import c.ˋʿ.CLS102;
import c.ˋʿ.CLS98;
import c.ˋʿ.CLS99;
import c.ˋˑ.CLS104;
import c.ˋﹳ.CLS107;
import c.ˋﹳ.CLS110;
import c.ˑʼ.CLS125;
import c.ˑʼ.CLS128;
import c.יᴵ.CLS144.CLS142;
import c.יᴵ.CLS144;
import c.יᴵ.CLS147;
import c.יᴵ.CLS148;
import c.יᴵ.CLS150;
import c.יᴵ.CLS156;
import c.יᵢ.CLS169;
import c.ـˉ.CLS170;
import c.ـˉ.CLS172;
import c.ـˉ.CLS179.CLS178;
import c.ـˉ.CLS200;
import c.ـˉ.CLS204;
import c.ـˉ.CLS213;
import c.ـˉ.CLS216;
import c.ـˉ.CLS224;
import c.ـˉ.CLS231;
import c.ـˉ.CLS240;
import c.ـˉ.CLS243;
import c.ـˉ.CLS246;
import c.ـˉ.CLS255.CLS254;
import c.ـˉ.CLS257;
import c.ـˉ.CLS258;
import c.ـˉ.CLS259;
import c.ـˉ.CLS261;
import c.ـˉ.CLS264;
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
public class CLS581 implements CLS63 {
    public final CLS200 FLD368;
    public Handler FLD369;
    public final CLS156 FLD370;
    public WeakReference FLD371;
    public final CLS144 FLD372;
    public boolean FLD373;
    public HashMap FLD374;
    public boolean FLD375;
    public boolean FLD376;
    public boolean FLD377;
    public final CLS128 FLD378;
    public WeakReference FLD379;
    public boolean FLD380;
    public boolean FLD381;
    public Class FLD382;
    public CLS216 FLD383;
    public WeakReference FLD384;
    public int FLD385;
    public boolean FLD386;
    public final CLS231 FLD387;
    public Object FLD388;
    public boolean FLD389;
    public final CLS261 FLD390;
    public Object FLD391;
    public final WeakReference FLD392;
    public final HashSet FLD393;
    public final Runnable FLD394;
    public boolean FLD395;

    // 此方法包含解密的字符串
    public CLS581(Context context0) {
        this.FLD378 = new CLS128();
        this.FLD385 = -1;
        this.FLD386 = false;
        this.FLD376 = false;
        this.FLD395 = false;
        this.FLD375 = false;
        this.FLD381 = false;
        this.FLD380 = false;
        this.FLD373 = false;
        this.FLD392 = new WeakReference(context0);
        CLS144 ˆˆ0 = CLS144.MTH2583();
        this.FLD372 = ˆˆ0;
        this.FLD387 = (CLS231)ˆˆ0.MTH2605(CLS231.class);
        this.FLD370 = (CLS156)CLS144.MTH2583().MTH2605(CLS156.class);
        this.FLD368 = CLS200.MTH3224();
        this.FLD383 = CLS216.MTH3352();
        this.FLD390 = CLS261.MTH3881();
        try {
            HandlerThread handlerThread0 = new HandlerThread(CLS224.MTH3484("\uD8E3x_sync_check_thread"));
            handlerThread0.start();
            this.FLD369 = new Handler(handlerThread0.getLooper());
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        this.FLD394 = () -> // 此方法包含解密的字符串
        try {
            this.FLD390.MTH3932();
            this.FLD390.MTH3835();
            CLS213.MTH3304().MTH3320("\uD8E3elayed_check", new Object[0]);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        };
        this.FLD374 = new HashMap();
        this.FLD393 = new HashSet();
        this.FLD390.MTH3919(3002);
        try {
            this.MTH1752(CLS213.MTH3304());
        }
        catch(Throwable throwable1) {
            CLS204.MTH3257(throwable1);
        }
    }

    // 此方法包含解密的字符串
    @Override  // c.ˆˆ.CLS63
    public void altHook(ClassLoader classLoader0) {
        try {
            if(Debug.isDebuggerConnected()) {
                return;
            }
            CLS147.MTH2641().MTH2622(classLoader0).MTH2624(classLoader0, ((Context)this.FLD392.get()), false);
            this.MTH1592(classLoader0, false);
            CLS213.MTH3304().MTH3320("\uD8E3ltHook_ready", new Object[0]);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // c.ˆˆ.CLS63
    public boolean hook(ClassLoader classLoader0) {
        public class CLS546 extends XpMethodHook {
            public final CLS581 FLD331;

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                CLS213.MTH3304().MTH3320("\uD8E3fter_Activity_onCreate", new Object[]{object0});
                Activity activity0 = (Activity)new CLS98(object0).MTH2077();
                CLS213.MTH3304().MTH3320("\uD8E3et_current_activity", new Object[]{activity0});
                WeakReference weakReference0 = new WeakReference(activity0);
                CLS581.this.FLD384 = weakReference0;
                String s = CLS224.MTH3471(activity0);
                if(s.endsWith("\uD8E3auncherUI")) {
                    WeakReference weakReference1 = new WeakReference(activity0);
                    CLS581.this.FLD371 = weakReference1;
                    CLS213.MTH3304().MTH3320("\uD8E3et_launcherui", new Object[]{activity0});
                }
                Class class0 = MenuItem.OnMenuItemClickListener.class;
                Class class1 = String.class;
                if(s.endsWith("\uD8E3indMobilePolicyUI")) {
                    if(CLS95.MTH2031().MTH2725("\uD8E3uto_close_bindmobile", true)) {
                        try {
                            activity0.finish();
                            return;
                        label_16:
                            CLS100.MTH2121(CLS100.MTH2130(new String[]{CLS95.MTH2004("\uD8E3ddTextOptionMenu"), "\uD8E3ddTextOptionMenu", "\uD8E3"}, activity0, Void.TYPE, new Object[]{Integer.TYPE, class1, class0}), activity0, new Object[]{2000, "", (MenuItem menuItem0) -> {
                                try {
                                    activity0.finish();
                                }
                                catch(Throwable throwable0) {
                                    CLS204.MTH3257(throwable0);
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
                    CLS204.MTH3257(throwable0);
                    return;
                }
                if(CLS95.MTH1981("\uD8E3MActivity")) {
                    return;
                }
                if(!s.endsWith("\uD8E3oginPasswordUI") && !s.endsWith("\uD8E3oginHistoryUI") && !s.endsWith("\uD8E3obileInputUI") && !s.endsWith("\uD8E3oginUI")) {
                    return;
                }
                String s1 = CLS95.MTH2014();
                if(!TextUtils.isEmpty(s1) && !"\uD8E3NO_ID+".equals(s1) && CLS259.MTH3822()) {
                    return;
                }
                try {
                    CLS100.MTH2121(CLS100.MTH2130(new String[]{CLS95.MTH2004("\uD8E3ddTextOptionMenu"), "\uD8E3ddTextOptionMenu", "\uD8E3"}, activity0, Void.TYPE, new Object[]{Integer.TYPE, class1, class0}), activity0, new Object[]{2000, "", (MenuItem menuItem0) -> // 去混淆评级： 低(22)
                    // 此方法包含解密的字符串
                    {
                        try {
                            CLS125 ʻᵢ0 = new CLS125(activity0, "");
                            if(!CLS246.MTH3659()) {
                                ʻᵢ0.MTH2414("\uD8E3ablet_login", ((CLS107)new CLS466((CLS95.MTH1981("\uD8E3oginAsExDeviceUI") ? CLS95.MTH2004("\uD8E3oginAsExDeviceUI") : "\uD8E3om.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI"), activity0)));
                            }
                            if(!"\uD8E3NO_ID+".equals(s1)) {
                                if(CLS581.this.FLD368.MTH3240()) {
                                    ʻᵢ0.MTH2414("\uD8E3ransfer_advanced", ((CLS107)new CLS587(activity0)));
                                }
                                ʻᵢ0.MTH2414("\uD8E3xport_settings", ((CLS107)new CLS439()));
                            }
                            ʻᵢ0.MTH2414("\uD8E3estart_wechat", ((CLS107)new CLS510())).MTH2414("\uD8E3eset_module", ((CLS107)new CLS429())).MTH2418();
                        }
                        catch(Throwable throwable0) {
                            CLS204.MTH3257(throwable0);
                        }
                        return true;
                    }});
                }
                catch(Throwable throwable1) {
                    CLS204.MTH3253(throwable1, true, false);
                }
            }

            // 去混淆评级： 低(22)
            // 此方法包含解密的字符串
            // 检测为 Lambda 实现
            private boolean MTH1442(Activity activity0, String s, MenuItem menuItem0) [...]

            public static void MTH1443(Activity activity0) {
                CLS546.MTH1446(activity0);
            }

            public static void MTH1445() {
                CLS95.MTH2023();
                CLS257.MTH3710();
            }

            // 此方法包含解密的字符串
            public static void MTH1446(Activity activity0) {
                String s = CLS224.MTH3462(1);
                if(!TextUtils.isEmpty(s)) {
                    CLS258.MTH3769(activity0, "", s, true, true, null);
                    CLS224.MTH3458(activity0, s);
                    CLS224.MTH3482(activity0, "");
                }
            }

            // 此方法包含解密的字符串
            public static void MTH1447() {
                CLS213.MTH3304().MTH3311("\uD8E3xportSettings", new Object[0]);
            }

            // 检测为 Lambda 实现
            public static boolean MTH1449(Activity activity0, MenuItem menuItem0) [...]

            public static void MTH1450(String s, Activity activity0) {
                Intent intent0 = new Intent();
                if(!CLS65.MTH1215(s, intent0)) {
                    intent0.setClassName(activity0, s);
                    activity0.startActivity(intent0);
                }
            }
        }


        public class CLS580 extends XpMethodHook {
            public final CLS581 FLD367;

            // 去混淆评级： 低(34)
            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                if(CLS95.MTH2031().MTH2725("\uD8E3ore_ejecting", false)) {
                    return;
                }
                CLS98 ʻᵢ0 = new CLS98(object0);
                String s = ʻᵢ0.MTH2077().toString();
                if(s.contains("\uD8E3databases/") && (s.contains("\uD8E3KZ_") || s.contains("\uD8E3X_")) || CLS170.MTH3011(s, new String[]{"\uD8E3x6_", "", "\uD8E3echatXposed"}) && CLS100.MTH2111(new String[]{"\uD8E3om.tencent.mm", CLS95.MTH2004("\uD8E3leanWxTaskClass")})) {
                    ʻᵢ0.MTH2080(Boolean.TRUE);
                }
            }
        }

        if(Debug.isDebuggerConnected()) {
            return false;
        }
        boolean z = this.FLD387.MTH3506();
        if(!z) {
            CLS144.MTH2583().MTH2589(((CLS142)() -> CLS147.MTH2641().MTH2622(classLoader0).MTH2624(classLoader0, ((Context)this.FLD392.get()), false)));
        }
        try {
            this.MTH1775();
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        if(this.FLD390.MTH3915()) {
            Context context0 = CLS95.MTH2025();
            this.FLD390.MTH3889(context0);
        }
        else {
            CLS144.MTH2583().MTH2608(((CLS142)() -> {
                Context context0 = CLS95.MTH2025();
                this.FLD390.MTH3889(context0);
            }), 10000L);
        }
        String s = CLS95.MTH2014();
        this.FLD368.MTH3223(s);
        this.FLD368.MTH3226();
        Object[] arr_object = {Bundle.class, CLS102.MTH2147(new CLS546(this))};
        CLS102.MTH2172(Activity.class, "\uD8E3nCreate", arr_object);
        Object[] arr_object1 = {CLS102.MTH2147(new CLS580(this))};
        CLS100.MTH2139(File.class, "\uD8E3elete", arr_object1);
        if(!z) {
            this.MTH1592(classLoader0, false);
        }
        CLS144.MTH2583().MTH2589(((CLS142)new CLS443()));
        CLS104.MTH2238().MTH2198();
        CLS144.MTH2583().MTH2603(((CLS142)() -> // 去混淆评级： 中等(106)
        // 此方法包含解密的字符串
        {
            CLS204.MTH3252(("\uD8E3" + CLS246.MTH3662() + "\uD8E3" + CLS95.MTH2008() + "\uD8E3" + 209 + "\uD8E3 " + this.FLD387.MTH3501()));
            CLS204.MTH3252(("\uD8E3echat: " + this.FLD387.MTH3518() + "\uD8E3" + this.FLD387.MTH3511() + "\uD8E3{" + CLS49.MTH1006((CLS257.MTH3720() ? 0xFFFF759709FFCF7EL : 0xFFFF759309FFCF7EL)) + CLS257.MTH3723() + "\uD8E3" + CLS49.MTH1006((this.FLD387.MTH3517() ? 0xFFFF758D09FFCF7EL : 0xFFFF758509FFCF7EL)) + "\uD8E3(" + CLS224.MTH3470() + "\uD8E3[" + this.FLD387.MTH3508() + "\uD8E3"));
        }));
        return true;
    }

    public static void MTH1526(CLS581 ᵔˊ0, Object[] arr_object) {
        ᵔˊ0.MTH1596(arr_object);
    }

    // 去混淆评级： 低(22)
    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH1527(String s) [...]

    // 此方法包含解密的字符串
    private void MTH1528(Object[] arr_object) {
        Activity activity0 = (Activity)new CLS98(arr_object[0]).MTH2077();
        CLS213.MTH3304().MTH3320("\uD8E3et_current_activity", new Object[]{activity0}).MTH3320("\uD8E3et_launcherui", new Object[]{activity0});
        this.FLD384 = new WeakReference(activity0);
        this.FLD371 = new WeakReference(activity0);
        this.MTH1645(activity0);
        this.FLD377 = true;
    }

    private void MTH1529(Object[] arr_object) {
        int v = (int)(((Integer)arr_object[0]));
        CLS243.MTH3628(this.MTH1580(), v);
    }

    private Object MTH1532(Object[] arr_object) {
        return this.FLD387.MTH3508();
    }

    public static Object MTH1533(Object[] arr_object) {
        return CLS246.MTH3655();
    }

    // 此方法包含解密的字符串
    private void MTH1537(Object[] arr_object) {
        CLS98 ʻᵢ0 = new CLS98(arr_object[0]);
        String s = (String)ʻᵢ0.MTH2078()[0];
        ContentValues contentValues0 = (ContentValues)ʻᵢ0.MTH2078()[1];
        if(this.MTH1759(s) && !this.FLD378.MTH2474(s)) {
            this.FLD378.MTH2473("\uD8E3.sqlitedb_update" + s, s + contentValues0);
            CLS213.MTH3304().MTH3320("\uD8E3.sqldb.update", new Object[]{ʻᵢ0.MTH2079(), 2, s, contentValues0});
        }
    }

    public static Object MTH1538(Object[] arr_object) {
        return CLS581.MTH1641(arr_object);
    }

    // 此方法包含解密的字符串
    private void MTH1539(Object[] arr_object) {
        CLS98 ʻᵢ0 = new CLS98(arr_object[0]);
        String s = (String)ʻᵢ0.MTH2078()[0];
        ContentValues contentValues0 = (ContentValues)ʻᵢ0.MTH2078()[2];
        if(!this.MTH1759(s)) {
            return;
        }
        this.FLD378.MTH2470(s);
        if(this.FLD378.MTH2464("\uD8E3.sqldb.insert" + s) && this.FLD378.MTH2467("\uD8E3.sqldb.insert" + s).equals(s + contentValues0)) {
            this.FLD378.MTH2472("\uD8E3.sqldb.insert" + s);
            return;
        }
        CLS213.MTH3304().MTH3320("\uD8E3.sqldb.insert", new Object[]{ʻᵢ0.MTH2079(), 1, s, contentValues0});
    }

    public static void MTH1540(Object[] arr_object) {
        CLS95.MTH2011(((String)arr_object[0]), ((String)arr_object[1]));
    }

    public static Object MTH1542(Object[] arr_object) {
        return CLS581.MTH1576(arr_object);
    }

    // 去混淆评级： 低(34)
    // 此方法包含解密的字符串
    public final boolean MTH1543() {
        if(!CLS95.MTH2031().MTH2725("\uD8E3orce_darkmode", false)) {
            return false;
        }
        if(!CLS95.MTH2031().MTH2725("\uD8E3arkmode_follow_system", false) && !CLS95.MTH2031().MTH2725("\uD8E3arkmode_follow_time", false)) {
            return true;
        }
        return CLS95.MTH2031().MTH2725("\uD8E3arkmode_follow_time", false) ? CLS259.MTH3819(CLS95.MTH2031().MTH2733("\uD8E3arkmode_timeframe", "")) : CLS172.MTH3032();
    }

    // 去混淆评级： 低(35)
    // 此方法包含解密的字符串
    private void MTH1544(Object[] arr_object) {
        boolean z = CLS100.MTH2111(new String[]{"\uD8E3oginAsExDeviceUI"});
        if(!CLS246.MTH3659() && (z || this.FLD370.MTH2725("\uD8E3orce_tablet_mode_enable", false) && !CLS100.MTH2111(new String[]{"\uD8E3hatFooter", "\uD8E3inderLiveFindPageUI", CLS95.MTH2004("\uD8E3etLivePostBtnVisibleMethod")}))) {
            new CLS98(arr_object[0]).MTH2080(Boolean.TRUE);
        }
    }

    public static void MTH1546(CLS581 ᵔˊ0, Object[] arr_object) {
        ᵔˊ0.MTH1606(arr_object);
    }

    public static Object MTH1547(Object[] arr_object) {
        switch(arr_object.length) {
            case 1: {
                Object object0 = arr_object[0];
                if(object0 instanceof InputStream) {
                    return CLS264.MTH4102(((InputStream)object0));
                }
                if(object0 instanceof String) {
                    return CLS264.MTH4094(((String)object0));
                }
                break;
            }
            case 2: {
                Object object1 = arr_object[0];
                if(object1 instanceof String) {
                    CLS264.MTH4095(((String)object1), ((Handler.Callback)arr_object[1]));
                    return null;
                }
                if(object1 instanceof Bitmap) {
                    CLS264.MTH4117(((Bitmap)object1), ((Handler.Callback)arr_object[1]));
                }
                break;
            }
            default: {
                return null;
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH1548() [...]

    public static void MTH1549(Object[] arr_object) {
        CLS95.MTH2023();
    }

    public static void MTH1551(CLS581 ᵔˊ0, Object[] arr_object) {
        ᵔˊ0.MTH1771(arr_object);
    }

    public static Object MTH1553(Object[] arr_object) {
        return CLS581.MTH1739(arr_object);
    }

    public static void MTH1554(CLS581 ᵔˊ0, Object[] arr_object) {
        ᵔˊ0.MTH1625(arr_object);
    }

    public static Object MTH1557(Object[] arr_object) {
        return System.getProperty(((String)arr_object[0]));
    }

    public static void MTH1558(Object[] arr_object) {
        CLS581.MTH1779(arr_object);
    }

    // 去混淆评级： 中等(106)
    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH1560() [...]

    // 去混淆评级： 低(28)
    // 此方法包含解密的字符串
    private void MTH1562(Object[] arr_object) {
        CLS98 ʻᵢ0 = new CLS98(arr_object[0]);
        if(this.MTH1759("\uD8E3essage") && !this.FLD378.MTH2475("\uD8E3essage")) {
            ContentValues contentValues0 = (ContentValues)CLS99.MTH2087(ʻᵢ0.MTH2078()[0], CLS95.MTH2004("\uD8E3onvertToMethod"), new Object[0]);
            CLS213.MTH3304().MTH3320("\uD8E3.sqldb.insert", new Object[]{ʻᵢ0.MTH2079(), 3, "\uD8E3essage", contentValues0}).MTH3323("\uD8E3.async.sqldb.insert", new Object[]{ʻᵢ0.MTH2079(), 3, "\uD8E3essage", contentValues0});
        }
    }

    // 此方法包含解密的字符串
    public final boolean MTH1563(Activity activity0, ClassLoader classLoader0, String s, Object object0) {
        int v1;
        Class class0;
        try {
            String s1 = activity0.getPackageName() + "\uD8E3ui.base.preference.MMPreferenceVAS";
            if(CLS95.MTH1981("\uD8E3MPreferenceVAS")) {
                class0 = CLS147.MTH2641().MTH2642("\uD8E3MPreferenceVAS");
                if(class0 == null) {
                    class0 = CLS100.MTH2124(s1, classLoader0);
                }
            }
            else {
                class0 = this.FLD387.MTH3511() < 2060 || !CLS100.MTH2137(classLoader0, s1) ? null : CLS100.MTH2124(s1, classLoader0);
                if(class0 == null) {
                    class0 = CLS147.MTH2641().MTH2642("\uD8E3MPreference");
                }
            }
            if(class0 == null) {
                class0 = CLS100.MTH2124((activity0.getPackageName() + "\uD8E3ui.base.preference.MMPreference"), classLoader0);
            }
            Class class1 = CLS147.MTH2641().MTH2642("\uD8E3referenceClass");
            if(class1 == null) {
                class1 = CLS100.MTH2124((activity0.getPackageName() + "\uD8E3ui.base.preference.Preference"), classLoader0);
            }
            if(class0 != null && class1 != null) {
                Object object1 = CLS100.MTH2126(class0, object0, "\uD8E3reference");
                if(object1 == null) {
                    return false;
                }
                Method method0 = CLS100.MTH2117(object1, CLS95.MTH2012("\uD8E3referenceAdapterIndexOfMethod", "\uD8E3ndexOf"), Integer.TYPE, new Object[]{String.class});
                int v = -1;
                if(method0 == null) {
                    LinkedList linkedList0 = (LinkedList)CLS100.MTH2113(object1, LinkedList.class);
                    v1 = linkedList0 == null ? -1 : linkedList0.indexOf(s);
                }
                else {
                    v1 = (int)(((Integer)CLS100.MTH2121(method0, object1, new Object[]{s})));
                }
                if(v1 != -1) {
                    return false;
                }
                Object object2 = CLS99.MTH2086(class1, new Object[]{activity0});
                CLS95.MTH2037();
                CLS99.MTH2087(object2, CLS95.MTH2012("\uD8E3referenceSetTitleMethod", "\uD8E3etTitle"), new Object[]{CLS246.MTH3656()});
                CLS99.MTH2087(object2, CLS95.MTH2012("\uD8E3referenceSetKeyMethod", "\uD8E3etKey"), new Object[]{s});
                if(!this.FLD370.MTH2725("\uD8E3laceSettingsToBottom", false)) {
                    v = 0;
                }
                CLS99.MTH2087(object1, CLS95.MTH2012("\uD8E3ref_adapter_set", "\uD8E3"), new Object[]{object2, v});
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return false;
    }

    // 去混淆评级： 低(23)
    // 此方法包含解密的字符串
    public void MTH1566(CLS98 ʻᵢ0) {
        ContentValues contentValues0 = (ContentValues)ʻᵢ0.MTH2078()[2];
        if(((int)contentValues0.getAsInteger("\uD8E3ype")) == 1 && (contentValues0.containsKey("\uD8E3sSend") ? ((int)contentValues0.getAsInteger("\uD8E3sSend")) : 0) == 0) {
            String s = contentValues0.getAsString("\uD8E3alker");
            if(!CLS246.MTH3661(s) && !"".contains(CLS95.MTH2014())) {
                String s1 = contentValues0.getAsString("\uD8E3ontent");
                if(!s1.startsWith("\uD8E3fkz_")) {
                    return;
                }
                ʻᵢ0.MTH2080(-1);
                CLS144.MTH2583().MTH2604(((CLS142)() -> // 去混淆评级： 低(21)
                // 此方法包含解密的字符串
                {
                    Boolean boolean0;
                    CLS156 ٴʻ0;
                    String s2 = s1.split("\uD8E3")[1];
                    switch(s2.hashCode()) {
                        case 0xB0F44A6F: {
                            if(!s2.equals("\uD8E3onate")) {
                                return;
                            }
                            ArrayList arrayList0 = new ArrayList();
                            arrayList0.add(s1.split("\uD8E3")[2].trim());
                            CLS213.MTH3304().MTH3301("\uD8E3onation", "\uD8E3ctivateKey", new Object[]{arrayList0, "\uD8E3"});
                            return;
                        }
                        case 0xCACDCFF2: {
                            if(s2.equals("\uD8E3tatus") && (!CLS261.MTH3881().MTH3951() || "".contains(s))) {
                                CLS144.MTH2583().MTH2604(((CLS142)() -> // 去混淆评级： 低(22)
                                // 此方法包含解密的字符串
                                {
                                    StringBuilder stringBuilder0 = new StringBuilder();
                                    stringBuilder0.append("");
                                    stringBuilder0.append("\uD8E3");
                                    stringBuilder0.append(CLS246.MTH3662());
                                    stringBuilder0.append("\uD8E3");
                                    stringBuilder0.append(CLS95.MTH2008());
                                    stringBuilder0.append("\uD8E3");
                                    stringBuilder0.append(209);
                                    stringBuilder0.append("\uD8E3");
                                    stringBuilder0.append("\uD8E3");
                                    stringBuilder0.append(this.FLD387.MTH3501());
                                    stringBuilder0.append("\uD8E3");
                                    stringBuilder0.append(this.FLD387.MTH3501());
                                    stringBuilder0.append("\uD8E3");
                                    stringBuilder0.append("\uD8E3d: ");
                                    stringBuilder0.append(CLS95.MTH2014());
                                    stringBuilder0.append("\uD8E3");
                                    stringBuilder0.append("\uD8E3wid: ");
                                    stringBuilder0.append(CLS150.MTH2682().MTH2688(this.MTH1611()));
                                    stringBuilder0.append("\uD8E3");
                                    stringBuilder0.append("\uD8E3alid: ");
                                    stringBuilder0.append(!this.FLD390.MTH4020());
                                    stringBuilder0.append("\uD8E3");
                                    String s1 = "";
                                    if(this.FLD368.MTH3229()) {
                                        String s2 = "\uD8E3(\uD8E3";
                                        long v = this.FLD368.MTH3239(0);
                                        if(v != 0L) {
                                            s2 = "\uD8E3(\uD8E3\uD8E3 " + CLS259.MTH3821(v);
                                        }
                                        s1 = s2 + "\uD8E3";
                                    }
                                    if(this.FLD368.MTH3232()) {
                                        String s3 = s1 + "" + "\uD8E3(" + "" + "\uD8E3";
                                        long v1 = this.FLD368.MTH3239(4);
                                        if(v1 != 0L) {
                                            s3 = s3 + "\uD8E3 " + CLS259.MTH3821(v1);
                                        }
                                        s1 = s3 + "\uD8E3";
                                    }
                                    if(this.FLD368.MTH3238()) {
                                        String s4 = s1 + "" + "\uD8E3(" + "" + "\uD8E3";
                                        long v2 = this.FLD368.MTH3239(2);
                                        if(v2 != 0L) {
                                            s4 = s4 + "\uD8E3 " + CLS259.MTH3821(v2);
                                        }
                                        s1 = s4 + "\uD8E3";
                                    }
                                    stringBuilder0.append(s1);
                                    stringBuilder0.append("\uD8E3");
                                    stringBuilder0.append(this.FLD368.MTH3242());
                                    stringBuilder0.append("\uD8E3");
                                    stringBuilder0.append(CLS104.MTH2238().MTH2226());
                                    stringBuilder0.append("\uD8E3");
                                    CLS213.MTH3304().MTH3301("\uD8E3ase", "\uD8E3endMessage", new Object[]{stringBuilder0.toString(), s});
                                }));
                                return;
                            }
                            break;
                        }
                        case 0xCE0038C9: {
                            if(!s2.equals("\uD8E3pdate")) {
                                return;
                            }
                            CLS261.MTH3881().MTH3858(false);
                            return;
                        }
                        case 0x73: {
                            if(s2.equals("\uD8E3") && "".contains(s)) {
                                String s3 = s1.substring(s1.indexOf("\uD8E3") + 1).trim();
                                if(!TextUtils.isEmpty(s3)) {
                                    String[] arr_s1 = s3.split("\uD8E3");
                                    if(arr_s1.length > 2) {
                                        this.FLD370.MTH2749(arr_s1[0], Boolean.valueOf(arr_s1[1].equals("\uD8E3")));
                                        return;
                                    }
                                }
                            }
                            break;
                        }
                        case 0x76: {
                            if(!s2.equals("\uD8E3")) {
                                return;
                            }
                            CLS213.MTH3304().MTH3301("\uD8E3ase", "\uD8E3endMessage", new Object[]{"\uD8E3" + CLS246.MTH3662() + "\uD8E3" + CLS95.MTH2008() + "\uD8E3" + 209 + "\uD8E3 " + this.FLD387.MTH3501(), s});
                            return;
                        }
                        case 0xCCA: {
                            if(!s2.equals("\uD8E3p")) {
                                return;
                            }
                            CLS213.MTH3304().MTH3301("\uD8E3ase", "\uD8E3endMessage", new Object[]{Build.FINGERPRINT, s});
                            return;
                        }
                        case 0xD1B: {
                            if(!s2.equals("\uD8E3d")) {
                                return;
                            }
                            CLS213.MTH3304().MTH3301("\uD8E3ase", "\uD8E3endMessage", new Object[]{CLS95.MTH2014(), s});
                            return;
                        }
                        case 0x1B894: {
                            if(s2.equals("\uD8E3eg") && "".contains(s)) {
                                if(s1.split("\uD8E3").length <= 2 || !s1.split("\uD8E3")[2].equals("\uD8E3")) {
                                    ٴʻ0 = this.FLD370;
                                    boolean0 = Boolean.FALSE;
                                }
                                else {
                                    ٴʻ0 = this.FLD370;
                                    boolean0 = Boolean.TRUE;
                                }
                                ٴʻ0.MTH2749("\uD8E3f_reg", boolean0);
                                return;
                            }
                            break;
                        }
                        case 3000946: {
                            if(s2.equals("\uD8E3pps")) {
                                CLS261.MTH3881().MTH3934();
                                return;
                            }
                            return;
                        }
                        case 108404047: {
                            if(s2.equals("\uD8E3eset") && "".contains(s)) {
                                CLS95.MTH2023();
                                CLS257.MTH3710();
                                return;
                            }
                            break;
                        }
                        case 0x416A9E0F: {
                            if(s2.equals("\uD8E3estart") && "".contains(s)) {
                                CLS257.MTH3710();
                                return;
                            }
                            break;
                        }
                    }
                }));
            }
        }
    }

    // 去混淆评级： 低(26)
    // 此方法包含解密的字符串
    public final String MTH1567(String s) {
        String s1 = s.toLowerCase();
        if(s1.contains("\uD8E3rom message")) {
            return "\uD8E3essage";
        }
        if(s1.contains("\uD8E3rom rconversation")) {
            return "\uD8E3conversation";
        }
        if(s1.contains("\uD8E3rom chatroom")) {
            return "\uD8E3hatroom";
        }
        if(s1.contains("\uD8E3rom rcontact")) {
            return "\uD8E3contact";
        }
        if(s1.contains("\uD8E3rom userinfo")) {
            return "\uD8E3serinfo";
        }
        if(s1.contains("\uD8E3rom adsnsinfo")) {
            return "\uD8E3dsnsinfo";
        }
        if(s1.contains("\uD8E3rom snsinfo")) {
            return "\uD8E3nsinfo";
        }
        if(s1.contains("\uD8E3rom snscomment")) {
            return "\uD8E3nscomment";
        }
        if(s1.contains("\uD8E3rom imginfo2")) {
            return "\uD8E3mginfo2";
        }
        if(s1.contains("\uD8E3rom faviteminfo")) {
            return "\uD8E3aviteminfo";
        }
        if(s1.contains("\uD8E3rom fmessage_msginfo")) {
            return "\uD8E3message_msginfo";
        }
        if(s1.contains("\uD8E3rom harddevicerankinfo")) {
            return "\uD8E3arddevicerankinfo";
        }
        return s1.contains("\uD8E3rom lbsverifymessage") ? "\uD8E3bsverifymessage" : "\uD8E3ther";
    }

    public static Object MTH1568(Object[] arr_object) {
        return CLS95.MTH2014();
    }

    public static void MTH1569(Object[] arr_object) {
        CLS104.MTH2238().MTH2225();
    }

    // 此方法包含解密的字符串
    private void MTH1570(Object[] arr_object) {
        CLS98 ʻᵢ0 = new CLS98(arr_object[0]);
        String s = (String)ʻᵢ0.MTH2078()[1];
        String s1 = s.toLowerCase();
        if(s.startsWith("\uD8E3kz_")) {
            ʻᵢ0.MTH2078()[1] = s.replace("\uD8E3kz_", "");
            return;
        }
        if(s.startsWith("\uD8E3*fkz*/")) {
            ʻᵢ0.MTH2078()[1] = s.replace("\uD8E3*fkz*/", "");
            return;
        }
        if(s.contains("\uD8E3*wxp*/")) {
            return;
        }
        if(CLS170.MTH3011(s1, new String[]{"\uD8E3rom rcontact", "\uD8E3rom message", "\uD8E3rom userinfo", "\uD8E3rom rconversation", "\uD8E3rom lbsverifymessage", "\uD8E3rom chatroom", "\uD8E3rom fmessage_msginfo", "\uD8E3rom imginfo2"})) {
            try {
                if(!this.FLD383.MTH3359()) {
                    this.FLD383.MTH3353();
                    CLS204.MTH3252("\uD8E3b hook success!");
                    if(!this.FLD373) {
                        CLS213.MTH3304().MTH3323("\uD8E3b.init", new Object[]{ʻᵢ0.MTH2079()});
                    }
                }
                this.FLD383.MTH3371(ʻᵢ0.MTH2077());
                this.MTH1652(ʻᵢ0.MTH2077().getClass().getClassLoader());
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        else if(CLS170.MTH3011(s1, new String[]{"\uD8E3nsinfo", "\uD8E3nscomment", "\uD8E3dsnsinfo"})) {
            if(!this.FLD376) {
                this.FLD376 = true;
                if(!this.FLD380) {
                    CLS213.MTH3304().MTH3323("\uD8E3nsdb.init", new Object[]{ʻᵢ0.MTH2079()});
                }
            }
            this.FLD388 = ʻᵢ0.MTH2077();
        }
        else if(s1.contains("\uD8E3aviteminfo")) {
            if(!this.FLD395) {
                this.FLD395 = true;
            }
            this.FLD391 = ʻᵢ0.MTH2077();
        }
        if(!this.MTH1759(s1)) {
            return;
        }
        Object[] arr_object1 = (Object[])ʻᵢ0.MTH2078()[2];
        String s2 = this.MTH1567(s1);
        this.FLD378.MTH2468(s2);
        if(this.FLD378.MTH2464("\uD8E3.sqldb.rawquery" + s2) && this.FLD378.MTH2467("\uD8E3.sqldb.rawquery" + s2).equals(s)) {
            this.FLD378.MTH2472("\uD8E3.sqldb.rawquery" + s2);
            return;
        }
        CLS213.MTH3304().MTH3320("\uD8E3.sqldb.rawquery", new Object[]{ʻᵢ0.MTH2079(), 1, s, arr_object1});
    }

    public static Object MTH1571(Object[] arr_object) {
        return CLS581.MTH1732(arr_object);
    }

    public static Object MTH1573(Object[] arr_object) {
        int v = (int)(((Integer)arr_object[0]));
        String s = (String)arr_object[1];
        String s1 = (String)arr_object[2];
        if(arr_object.length > 3) {
            ArrayList arrayList0 = (ArrayList)arr_object[3];
            return CLS243.MTH3644(CLS95.MTH2017(), v, arrayList0, s, s1);
        }
        return CLS243.MTH3617(CLS95.MTH2017(), v, s, s1);
    }

    public static void MTH1574(Object[] arr_object) {
        CLS204.MTH3254(arr_object[0]);
    }

    public static void MTH1575(CLS581 ᵔˊ0, Object[] arr_object) {
        ᵔˊ0.MTH1528(arr_object);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Object MTH1576(Object[] arr_object) {
        return "";
    }

    public static void MTH1578(CLS581 ᵔˊ0, Object[] arr_object) {
        ᵔˊ0.MTH1711(arr_object);
    }

    public static void MTH1579(CLS581 ᵔˊ0, Object[] arr_object) {
        ᵔˊ0.MTH1634(arr_object);
    }

    public Activity MTH1580() {
        WeakReference weakReference0 = this.FLD384;
        if(weakReference0 != null) {
            Activity activity0 = (Activity)weakReference0.get();
            return activity0 == null || activity0.isFinishing() ? this.MTH1786() : activity0;
        }
        return this.MTH1786();
    }

    public static void MTH1582() {
        CLS169.MTH2922().MTH2917();
    }

    public static void MTH1585(Object[] arr_object) {
        CLS581.MTH1715(arr_object);
    }

    // 此方法包含解密的字符串
    public final void MTH1587(ClassLoader classLoader0) {
        public class CLS531 extends XpMethodHook {
            public final CLS581 FLD312;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    Object[] arr_object = new CLS98(object0).MTH2078();
                    CLS581.this.hook(((ClassLoader)arr_object[1]));
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }


        public class CLS540 extends XpMethodHook {
            public final CLS581 FLD325;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS98(object0).MTH2080(null);
            }
        }


        public class CLS541 extends XpMethodHook {
            public final CLS581 FLD326;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    ClassLoader classLoader0 = (ClassLoader)new CLS98(object0).MTH2081();
                    CLS581.this.hook(classLoader0);
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }


        public class CLS543 extends XpMethodHook {
            public final CLS581 FLD328;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    Object[] arr_object = new CLS98(object0).MTH2078();
                    CLS581.this.hook(((ClassLoader)arr_object[1]));
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }


        public class CLS550 extends XpMethodHook {
            public final CLS581 FLD335;

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                if(CLS581.this.FLD370.MTH2725("\uD8E3revent_update_enable", CLS224.MTH3441())) {
                    CLS98 ʻᵢ0 = new CLS98(object0);
                    ʻᵢ0.MTH2080(null);
                    CLS65.MTH1212(ʻᵢ0.MTH2077());
                }
            }
        }


        public class CLS551 extends XpMethodHook {
            public final CLS581 FLD336;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS98(object0).MTH2080(null);
            }
        }


        public class CLS559 extends XpMethodHook {
            public final CLS581 FLD344;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS98(object0).MTH2080(null);
            }
        }


        public class CLS560 extends XpMethodHook {
            public final CLS581 FLD345;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS98(object0).MTH2080(null);
            }
        }


        public class CLS563 extends XpMethodHook {
            public final CLS581 FLD348;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    Object[] arr_object = new CLS98(object0).MTH2078();
                    CLS581.this.hook(((ClassLoader)arr_object[1]));
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }


        public class CLS564 extends XpMethodHook {
            public final CLS581 FLD349;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    Object[] arr_object = new CLS98(object0).MTH2078();
                    CLS581.this.hook(((ClassLoader)arr_object[0]));
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }


        public class CLS567 extends XpMethodHook {
            public final CLS581 FLD352;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS98(object0).MTH2080(null);
            }
        }


        public class CLS569 extends XpMethodHook {
            public final CLS581 FLD354;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS98(object0).MTH2080(null);
            }
        }


        public class CLS572 extends XpMethodHook {
            public final CLS581 FLD359;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                CLS98 ʻᵢ0 = new CLS98(object0);
                ʻᵢ0.MTH2080(null);
                CLS65.MTH1212(ʻᵢ0.MTH2077());
            }
        }


        public class CLS573 extends XpMethodHook {
            public final CLS581 FLD360;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    Object[] arr_object = new CLS98(object0).MTH2078();
                    CLS581.this.hook(((ClassLoader)arr_object[1]));
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }

        String s = CLS95.MTH2004("\uD8E3ystemClassLoaderAdder");
        if(!TextUtils.isEmpty(s)) {
            boolean z = TextUtils.isEmpty(CLS95.MTH2004("\uD8E3ystemClassLoaderAdderMethod1"));
            Class class0 = ClassLoader.class;
            Class class1 = List.class;
            Class class2 = File.class;
            if(z) {
                boolean z1 = TextUtils.isEmpty(CLS95.MTH2004("\uD8E3ystemClassLoaderAdderMethod2"));
                Class class3 = Application.class;
                if(z1) {
                    boolean z2 = TextUtils.isEmpty(CLS95.MTH2004("\uD8E3ystemClassLoaderAdderMethod3"));
                    Class class4 = BaseDexClassLoader.class;
                    if(!z2) {
                        CLS100.MTH2105(s, classLoader0, CLS95.MTH2004("\uD8E3ystemClassLoaderAdderMethod3"), new Object[]{class3, class4, class2, class1, Boolean.TYPE, CLS102.MTH2147(new CLS531(this))});
                    }
                    else if(!TextUtils.isEmpty(CLS95.MTH2004("\uD8E3ystemClassLoaderAdderMethod3b"))) {
                        CLS100.MTH2105(s, classLoader0, CLS95.MTH2004("\uD8E3ystemClassLoaderAdderMethod3b"), new Object[]{class3, class0, class2, class1, Boolean.TYPE, CLS102.MTH2147(new CLS563(this))});
                    }
                    else if(!TextUtils.isEmpty(CLS95.MTH2004("\uD8E3ystemClassLoaderAdderMethod3c"))) {
                        CLS100.MTH2105(s, classLoader0, CLS95.MTH2004("\uD8E3ystemClassLoaderAdderMethod3c"), new Object[]{class3, class0, class2, class1, Boolean.TYPE, Boolean.TYPE, CLS102.MTH2147(new CLS573(this))});
                    }
                    else if(!TextUtils.isEmpty(CLS95.MTH2004("\uD8E3ystemClassLoaderAdderMethod4"))) {
                        CLS100.MTH2105(s, classLoader0, CLS95.MTH2004("\uD8E3ystemClassLoaderAdderMethod4"), new Object[]{class3, class4, Integer.TYPE, CLS102.MTH2147(new CLS541(this))});
                    }
                }
                else {
                    CLS100.MTH2105(s, classLoader0, CLS95.MTH2004("\uD8E3ystemClassLoaderAdderMethod2"), new Object[]{class3, PathClassLoader.class, class2, class1, CLS102.MTH2147(new CLS543(this))});
                }
            }
            else {
                CLS100.MTH2105(s, classLoader0, CLS95.MTH2004("\uD8E3ystemClassLoaderAdderMethod1"), new Object[]{class0, class2, class1, CLS102.MTH2147(new CLS564(this))});
            }
        }
        String s1 = CLS95.MTH2004("\uD8E3inkerClass2");
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
        CLS100.MTH2123(CLS100.MTH2119(s1, classLoader0, null, Void.TYPE, arr_object), CLS102.MTH2147(new CLS572(this)));
        String s2 = CLS95.MTH2004("\uD8E3inkerClass1");
        if(!TextUtils.isEmpty(s2)) {
            Method method0 = CLS100.MTH2119((s2 + "\uD8E32"), classLoader0, null, Void.TYPE, new Object[]{Boolean.TYPE});
            if(method0 != null) {
                CLS100.MTH2123(method0, CLS102.MTH2147(new CLS567(this)));
            }
            CLS100.MTH2123(CLS100.MTH2119(s2, classLoader0, null, Void.TYPE, new Object[]{""}), CLS102.MTH2147(new CLS569(this)));
        }
        String s3 = CLS95.MTH2004("\uD8E3inkerClass4");
        if(!TextUtils.isEmpty(s3)) {
            Method method1 = CLS100.MTH2119((s3 + "\uD8E32"), classLoader0, null, Void.TYPE, new Object[]{Boolean.TYPE});
            if(method1 != null) {
                CLS100.MTH2123(method1, CLS102.MTH2147(new CLS551(this)));
            }
            CLS100.MTH2123(CLS100.MTH2119(s3, classLoader0, null, Void.TYPE, new Object[]{""}), CLS102.MTH2147(new CLS559(this)));
        }
        CLS100.MTH2105(CLS95.MTH2012("\uD8E3inkerClass3", CLS95.MTH2004("\uD8E3inkerClass3b")), classLoader0, CLS95.MTH2012("\uD8E3inkerMethod1", "\uD8E3un"), new Object[]{CLS102.MTH2147(new CLS540(this))});
        CLS100.MTH2128(CLS95.MTH2004("\uD8E3inkerServerResultService"), classLoader0, CLS102.MTH2147(new CLS560(this)));
        CLS100.MTH2105(CLS95.MTH2004("\uD8E3etupdateinfo"), classLoader0, CLS95.MTH2012("\uD8E3etworkMethod", "\uD8E3"), new Object[]{class5, class5, class5, class6, CLS95.MTH2004("\uD8E3etworkClass"), class7, CLS102.MTH2147(new CLS550(this))});
    }

    public static Object MTH1588(Object[] arr_object) {
        int v = (int)(((Integer)arr_object[0]));
        String s = (String)arr_object[1];
        if(arr_object.length > 2) {
            ArrayList arrayList0 = (ArrayList)arr_object[2];
            return CLS243.MTH3603(CLS95.MTH2017(), v, arrayList0, s);
        }
        return CLS243.MTH3639(CLS95.MTH2017(), v, s);
    }

    public static void MTH1590(CLS581 ᵔˊ0, Object[] arr_object) {
        ᵔˊ0.MTH1537(arr_object);
    }

    // 此方法包含解密的字符串
    public final void MTH1592(ClassLoader classLoader0, boolean z) {
        long v = System.currentTimeMillis();
        this.FLD375 = true;
        CLS95.MTH2031().MTH2749("\uD8E3ookFail", Boolean.TRUE);
        CLS204.MTH3252("\uD8E3ooking methods ...");
        if(this.FLD390.MTH3990()) {
            return;
        }
        try {
            this.MTH1734(classLoader0);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        try {
            this.MTH1684(classLoader0);
        }
        catch(Throwable throwable1) {
            CLS204.MTH3257(throwable1);
        }
        try {
            this.MTH1617(classLoader0);
        }
        catch(Throwable throwable2) {
            CLS204.MTH3257(throwable2);
        }
        try {
            this.MTH1587(classLoader0);
        }
        catch(Throwable throwable3) {
            CLS204.MTH3257(throwable3);
        }
        try {
            this.MTH1742(classLoader0);
        }
        catch(Throwable throwable4) {
            CLS204.MTH3257(throwable4);
        }
        if(CLS95.MTH1985()) {
            this.FLD375 = false;
            return;
        }
        CLS147.MTH2641().MTH2628(classLoader0, z);
        CLS204.MTH3252(("\uD8E3ooking methods done! time: " + (System.currentTimeMillis() - v)));
        this.FLD375 = false;
        CLS95.MTH2031().MTH2749("\uD8E3ookFail", Boolean.FALSE);
    }

    // 此方法包含解密的字符串
    private void MTH1593(Object[] arr_object) {
        if(CLS95.MTH2031().MTH2725("\uD8E3orce_darkmode", false) && !CLS95.MTH2031().MTH2725("\uD8E3arkmode_follow_system", false)) {
            if(this.FLD385 == -1) {
                this.FLD385 = CLS65.MTH1214();
            }
            boolean z = this.MTH1543();
            if(this.FLD385 != z) {
                this.FLD385 = z;
                Activity activity0 = this.MTH1786();
                if(activity0 != null) {
                    activity0.recreate();
                }
            }
        }
    }

    // 去混淆评级： 低(21)
    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH1594(String[] arr_s, String s, String s1) [...]

    public static Object MTH1595(Object[] arr_object) {
        return Boolean.valueOf(CLS257.MTH3725());
    }

    private void MTH1596(Object[] arr_object) {
        Activity activity0 = this.MTH1786();
        if(activity0 != null) {
            activity0.recreate();
        }
    }

    public static Object MTH1597(Object[] arr_object) {
        return CLS264.MTH4090(((String)arr_object[0]), ((int)(((Integer)arr_object[1]))), ((int)(((Integer)arr_object[2]))));
    }

    public static void MTH1598(Object[] arr_object) {
        File file0 = (File)arr_object[0];
        int v = (int)(((Integer)arr_object[1]));
        if(arr_object.length > 2) {
            CLS243.MTH3642(file0, v, ((ArrayList)arr_object[2]));
            return;
        }
        CLS243.MTH3633(file0, v);
    }

    // 去混淆评级： 中等(120)
    // 此方法包含解密的字符串
    public final void MTH1599() {
        CLS213.MTH3304().MTH3331("\uD8E3.on_chattingUIFragment_onResume", ((CLS178)new CLS485(this))).MTH3331("\uD8E3n_LauncherUI_onPause", ((CLS178)new CLS605(this))).MTH3331("\uD8E3.on_LauncherUI_onResume", ((CLS178)new CLS592(this))).MTH3331("\uD8E3.on_LauncherUI_onResume2", ((CLS178)new CLS504())).MTH3331("\uD8E3.on_LauncherUI_onResume", ((CLS178)new CLS598(this))).MTH3331("\uD8E3.on_MMActivity_onCreate", ((CLS178)new CLS427(this))).MTH3331("\uD8E3.on_MMFragmentActivity_onResume,b.on_MMFragmentActivity_onCreate,b.on_MMActivity_onCreate,on_settingsui_onresume", ((CLS178)new CLS469(this))).MTH3331("\uD8E3.on_MMFragmentActivity_onResume", ((CLS178)new CLS446())).MTH3331("\uD8E3.settingsui.onactivityresult,b.launcherui.onactivityresult,b.mmactivity.onactivityresult,b.chattingui.onactivityresult,b.fragmentactivity.onactivityresult", ((CLS178)new CLS609())).MTH3331("\uD8E3n_MainUI_onResume", ((CLS178)new CLS418(this))).MTH3331("\uD8E3n_HomeUI_updateTitle", ((CLS178)new CLS462(this))).MTH3331("\uD8E3.onpreference", ((CLS178)new CLS597()));
    }

    public static Object MTH1600(CLS581 ᵔˊ0, Object[] arr_object) {
        return ᵔˊ0.MTH1720(arr_object);
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    public static boolean MTH1601(View view0) [...]

    public static void MTH1602(Object[] arr_object) {
        CLS169.MTH2922().MTH2953();
    }

    public static Object MTH1603(Object[] arr_object) {
        return CLS581.MTH1776(arr_object);
    }

    public static Object MTH1604(Object[] arr_object) {
        return CLS581.MTH1573(arr_object);
    }

    private Object MTH1605(Object[] arr_object) {
        return this.MTH1786();
    }

    // 此方法包含解密的字符串
    private void MTH1606(Object[] arr_object) {
        CLS98 ʻᵢ0 = new CLS98(arr_object[0]);
        String s = (String)ʻᵢ0.MTH2078()[0];
        ContentValues contentValues0 = (ContentValues)ʻᵢ0.MTH2078()[1];
        if(!this.MTH1759(s)) {
            return;
        }
        this.FLD378.MTH2465(s);
        if(this.FLD378.MTH2464("\uD8E3.sqldb.update" + s) && this.FLD378.MTH2467("\uD8E3.sqldb.update" + s).equals(s + contentValues0)) {
            this.FLD378.MTH2472("\uD8E3.sqldb.update" + s);
            return;
        }
        CLS213.MTH3304().MTH3320("\uD8E3.sqldb.update", new Object[]{ʻᵢ0.MTH2079(), 1, s, contentValues0});
    }

    private Object MTH1607(Object[] arr_object) {
        return this.FLD388;
    }

    public static Object MTH1608(Object[] arr_object) {
        return Boolean.valueOf(CLS257.MTH3740(CLS95.MTH2017()));
    }

    public static Object MTH1609(Object[] arr_object) {
        return CLS581.MTH1612(arr_object);
    }

    public static Object MTH1610(Object[] arr_object) {
        int v = (int)(((Integer)arr_object[0]));
        String s = (String)arr_object[1];
        if(arr_object.length > 2) {
            ArrayList arrayList0 = (ArrayList)arr_object[2];
            return Boolean.valueOf(CLS243.MTH3640(CLS95.MTH2017(), v, arrayList0, s));
        }
        return Boolean.valueOf(CLS243.MTH3648(CLS95.MTH2017(), v, s));
    }

    public Context MTH1611() {
        try {
            WeakReference weakReference0 = this.FLD379;
            if(weakReference0 != null) {
                return (Context)weakReference0.get();
            }
            Context context0 = CLS65.MTH1216();
            if(context0 != null) {
                this.FLD379 = new WeakReference(context0);
                return context0;
            }
            if(this.MTH1580() != null) {
                return this.MTH1580();
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return (Context)this.FLD392.get();
    }

    public static Object MTH1612(Object[] arr_object) {
        return Boolean.valueOf(CLS102.MTH2170());
    }

    public static void MTH1613(CLS581 ᵔˊ0, Object[] arr_object) {
        ᵔˊ0.MTH1529(arr_object);
    }

    // 检测为 Lambda 实现
    private void MTH1614(ClassLoader classLoader0) [...]

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final void MTH1617(ClassLoader classLoader0) {
        public class CLS529 extends XpMethodHook {
            public final CLS581 FLD310;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS98(object0).MTH2080(null);
            }
        }


        public class CLS530 extends XpMethodHook {
            public final CLS581 FLD311;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    new CLS98(object0).MTH2080(0);
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }


        public class CLS532 extends XpMethodHook {
            public final CLS581 FLD313;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS98(object0).MTH2080(null);
            }
        }


        public class CLS535 extends XpMethodHook {
            public final CLS581 FLD317;

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    CLS98 ʻᵢ0 = new CLS98(object0);
                    String s = (String)ʻᵢ0.MTH2081();
                    if(s.contains("\uD8E3sXposed")) {
                        ʻᵢ0.MTH2080(s.replace("\uD8E3sXposed=true;", ""));
                    }
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }


        public class CLS536 extends XpMethodHook {
            public final CLS581 FLD318;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS98(object0).MTH2080(null);
            }
        }


        public class CLS542 extends XpMethodHook {
            public final CLS581 FLD327;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    CLS98 ʻᵢ0 = new CLS98(object0);
                    ʻᵢ0.MTH2080(CLS224.MTH3447(((String)ʻᵢ0.MTH2081())));
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }


        public class CLS544 extends XpMethodHook {
            public final CLS581 FLD329;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS98(object0).MTH2080(null);
            }
        }


        public class CLS545 extends XpMethodHook {
            public final CLS581 FLD330;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS98(object0).MTH2080(null);
            }
        }


        public class CLS547 extends XpMethodHook {
            public final CLS581 FLD332;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS98(object0).MTH2080(null);
            }
        }


        public class CLS548 extends XpMethodHook {
            public final CLS581 FLD333;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                CLS98 ʻᵢ0 = new CLS98(object0);
                String s = (String)ʻᵢ0.MTH2078()[0];
                Object[] arr_object = ʻᵢ0.MTH2078();
                arr_object[0] = CLS224.MTH3447(s);
            }
        }


        public class CLS549 extends XpMethodHook {
            public final CLS581 FLD334;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS98(object0).MTH2080(Boolean.FALSE);
            }
        }


        public class CLS552 extends XpMethodHook {
            public final CLS581 FLD337;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    CLS98 ʻᵢ0 = new CLS98(object0);
                    ʻᵢ0.MTH2080(CLS224.MTH3447(((String)ʻᵢ0.MTH2081())));
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }


        public class CLS553 extends XpMethodHook {
            public final CLS581 FLD338;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS98(object0).MTH2080(Boolean.TRUE);
            }
        }


        public class CLS555 extends XpMethodHook {
            public final CLS581 FLD340;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS98(object0).MTH2080(Boolean.FALSE);
            }
        }


        public class CLS556 extends XpMethodHook {
            public final CLS581 FLD341;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    CLS98 ʻᵢ0 = new CLS98(object0);
                    ʻᵢ0.MTH2080(CLS224.MTH3447(((String)ʻᵢ0.MTH2081())));
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }


        public class CLS557 extends XpMethodHook {
            public final CLS581 FLD342;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS98(object0).MTH2080(Boolean.TRUE);
            }
        }


        public class CLS561 extends XpMethodHook {
            public final CLS581 FLD346;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    CLS98 ʻᵢ0 = new CLS98(object0);
                    ʻᵢ0.MTH2080(CLS224.MTH3447(((String)ʻᵢ0.MTH2081())));
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }


        public class CLS562 extends XpMethodHook {
            public final CLS581 FLD347;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                try {
                    CLS98 ʻᵢ0 = new CLS98(object0);
                    String s = (String)ʻᵢ0.MTH2078()[0];
                    if(TextUtils.isEmpty(s)) {
                        return;
                    }
                    Object[] arr_object = ʻᵢ0.MTH2078();
                    arr_object[0] = CLS224.MTH3447(s);
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }


        public class CLS565 extends XpMethodHook {
            public final CLS581 FLD350;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS98(object0).MTH2080(Boolean.FALSE);
            }
        }


        public class CLS566 extends XpMethodHook {
            public final CLS581 FLD351;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    CLS98 ʻᵢ0 = new CLS98(object0);
                    ʻᵢ0.MTH2080(CLS224.MTH3447(((String)ʻᵢ0.MTH2081())));
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }


        public class CLS568 extends XpMethodHook {
            public final CLS581 FLD353;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS98(object0).MTH2080(Boolean.FALSE);
            }
        }


        public class CLS570 extends XpMethodHook {
            public final CLS581 FLD355;

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    Object object1 = new CLS98(object0).MTH2081();
                    if(object1 == null) {
                        return;
                    }
                    CLS99.MTH2092(object1, CLS95.MTH2004("\uD8E3ootDetectionField"), 0);
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }


        public class CLS574 extends XpMethodHook {
            public final CLS581 FLD361;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS98(object0).MTH2080(null);
            }
        }


        public class CLS576 extends XpMethodHook {
            public final CLS581 FLD363;

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                try {
                    CLS98 ʻᵢ0 = new CLS98(object0);
                    if(((String)ʻᵢ0.MTH2078()[0]).endsWith("\uD8E3su")) {
                        ʻᵢ0.MTH2080(Boolean.FALSE);
                    }
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }


        public class CLS578 extends XpMethodHook {
            public final CLS581 FLD365;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS98(object0).MTH2080(null);
            }
        }


        public class CLS579 extends XpMethodHook {
            public final CLS581 FLD366;

            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                new CLS98(object0).MTH2080(Boolean.TRUE);
            }
        }

        String s = CLS95.MTH2004("\uD8E3heckHookClass");
        boolean z = TextUtils.isEmpty(s);
        Class class0 = String.class;
        if(!z) {
            CLS100.MTH2105(s, classLoader0, CLS95.MTH2004("\uD8E3heckHookMethod"), new Object[]{CLS102.MTH2147(new CLS542(this))});
            CLS100.MTH2105(s, classLoader0, CLS95.MTH2004("\uD8E3heckHookMethod2"), new Object[]{CLS102.MTH2147(new CLS552(this))});
            CLS100.MTH2105(s, classLoader0, CLS95.MTH2004("\uD8E3heckHookMethod3"), new Object[]{Boolean.TYPE, CLS102.MTH2147(new CLS556(this))});
            CLS100.MTH2105(s, classLoader0, CLS95.MTH2004("\uD8E3heckHookMethod3a"), new Object[]{CLS102.MTH2147(new CLS566(this))});
            CLS100.MTH2105(s, classLoader0, CLS95.MTH2004("\uD8E3heckHookMethod4"), new Object[]{CLS102.MTH2147(new CLS561(this))});
            String s1 = CLS95.MTH2004("\uD8E3heckHookMethod5");
            if(!TextUtils.isEmpty(s1) && TextUtils.isEmpty(CLS95.MTH2004("\uD8E3heckHookClass1"))) {
                CLS100.MTH2105(s, classLoader0, s1, new Object[]{class0, CLS102.MTH2147(new CLS562(this))});
            }
            CLS100.MTH2105(s, classLoader0, CLS95.MTH2004("\uD8E3sHookedByXposed"), new Object[]{CLS102.MTH2147(new CLS549(this))});
            CLS100.MTH2105(s, classLoader0, CLS95.MTH2004("\uD8E3sDualByTools"), new Object[]{CLS102.MTH2147(new CLS565(this))});
            CLS100.MTH2105(s, classLoader0, CLS95.MTH2004("\uD8E3sRootMethod1"), new Object[]{CLS102.MTH2147(new CLS568(this))});
        }
        CLS100.MTH2105(CLS95.MTH2004("\uD8E3heckHookClass1"), classLoader0, CLS95.MTH2004("\uD8E3heckHookMethod5"), new Object[]{class0, CLS102.MTH2147(new CLS548(this))});
        CLS100.MTH2105(CLS95.MTH2004("\uD8E3heckxposed"), classLoader0, CLS95.MTH2012("\uD8E3heckxposedMethod1", "\uD8E3"), new Object[]{StackTraceElement[].class, CLS102.MTH2147(new CLS555(this))});
        String s2 = CLS95.MTH2004("\uD8E3rashuploader");
        Object[] arr_object = new Object[7];
        arr_object[0] = class0;
        Class class1 = byte[].class;
        arr_object[1] = class1;
        Class class2 = Integer.TYPE;
        arr_object[2] = class2;
        arr_object[3] = class0;
        arr_object[4] = class0;
        arr_object[5] = class0;
        arr_object[6] = CLS102.MTH2147(new CLS553(this));
        CLS100.MTH2105(s2, classLoader0, "\uD8E3", arr_object);
        String s3 = CLS95.MTH2004("\uD8E3eportClass1");
        if(!TextUtils.isEmpty(s3)) {
            CLS100.MTH2105(s3, classLoader0, CLS95.MTH2004("\uD8E3eportMethod1"), new Object[]{class2, class0, CLS102.MTH2147(new CLS544(this))});
            CLS100.MTH2105(s3, classLoader0, CLS95.MTH2004("\uD8E3eportMethod1b"), new Object[]{class2, class1, CLS102.MTH2147(new CLS574(this))});
            CLS100.MTH2105(s3, classLoader0, CLS95.MTH2004("\uD8E3eportMethod2"), new Object[]{CLS95.MTH2004("\uD8E3eportClass2"), class2, CLS102.MTH2147(new CLS545(this))});
            CLS100.MTH2105(s3, classLoader0, CLS95.MTH2004("\uD8E3eportMethod3"), new Object[]{class2, CLS95.MTH2004("\uD8E3eportClass2"), CLS102.MTH2147(new CLS529(this))});
            CLS100.MTH2105(s3, classLoader0, CLS95.MTH2004("\uD8E3eportMethod4"), new Object[]{class0, class2, CLS102.MTH2147(new CLS547(this))});
        }
        CLS100.MTH2105(CLS95.MTH2004("\uD8E3ootDetectionClass"), classLoader0, CLS95.MTH2004("\uD8E3ootDetectionMethod"), new Object[]{CLS102.MTH2147(new CLS570(this))});
        CLS100.MTH2105(CLS95.MTH2004("\uD8E3ootDetectionClass"), classLoader0, CLS95.MTH2004("\uD8E3ootDetectionMethod_b"), new Object[]{CLS102.MTH2147(new CLS530(this))});
        CLS100.MTH2105(CLS95.MTH2004("\uD8E3ootDetectionClass2"), classLoader0, CLS95.MTH2004("\uD8E3ootDetectionMethod2"), new Object[]{class0, CLS102.MTH2147(new CLS576(this))});
        CLS100.MTH2105(CLS95.MTH2004("\uD8E3heckXposedClass1"), classLoader0, CLS95.MTH2004("\uD8E3hackXposedMethod1"), new Object[]{Context.class, CLS102.MTH2147(new CLS535(this))});
        CLS100.MTH2105(CLS95.MTH2004("\uD8E3tackreportClass2"), classLoader0, CLS95.MTH2004("\uD8E3tackreportMethod2"), new Object[]{class1, class0, class0, class2, CLS102.MTH2147(new CLS557(this))});
        CLS100.MTH2105(CLS95.MTH2004("\uD8E3tackreportClass4"), classLoader0, CLS95.MTH2004("\uD8E3tackreportMethod4"), new Object[]{CLS95.MTH2004("\uD8E3tackreportClass4"), class0, class1, CLS102.MTH2147(new CLS578(this))});
        CLS100.MTH2105(CLS95.MTH2004("\uD8E3tackreportClass5"), classLoader0, CLS95.MTH2004("\uD8E3tackreportMethod5"), new Object[]{CLS102.MTH2147(new CLS532(this))});
        CLS100.MTH2138(CLS95.MTH2004("\uD8E3tackreportClass5"), classLoader0, CLS95.MTH2004("\uD8E3tackreportMethod5b"), CLS102.MTH2147(new CLS536(this)));
        CLS100.MTH2105(CLS95.MTH2004("\uD8E3tackreportClass"), classLoader0, CLS95.MTH2004("\uD8E3tackreportMethod6"), new Object[]{JSONArray.class, class0, CLS102.MTH2147(new CLS579(this))});
    }

    // 此方法包含解密的字符串
    public static void MTH1618(Object object0) {
        CLS213.MTH3304().MTH3320("\uD8E3lus.config", new Object[]{object0.toString()});
    }

    // 检测为 Lambda 实现
    public static void MTH1621(Activity activity0) [...]

    private void MTH1622(Object[] arr_object) {
        this.FLD390.MTH3858(false);
    }

    private void MTH1625(Object[] arr_object) {
        this.FLD389 = true;
    }

    public static Object MTH1626(Object[] arr_object) {
        return CLS240.MTH3593(((String)arr_object[0]));
    }

    public final void MTH1627() {
        if(this.FLD386) {
            return;
        }
        this.FLD386 = true;
        String s = CLS49.MTH1006(0xFFFF884209FFCF7EL);
        this.FLD370.MTH2739(s);
        String s1 = CLS49.MTH1006(0xFFFF883809FFCF7EL);
        this.FLD370.MTH2739(s1);
    }

    public static Object MTH1628(Object[] arr_object) {
        return CLS581.MTH1608(arr_object);
    }

    // 此方法包含解密的字符串
    private void MTH1629(Object[] arr_object) {
        CLS98 ʻᵢ0 = new CLS98(arr_object[0]);
        String s = (String)ʻᵢ0.MTH2078()[0];
        if(!s.startsWith("\uD8E3kz_") && !s.startsWith("\uD8E3*fkz*/") && !s.contains("\uD8E3*wxp*/") && this.MTH1759(s)) {
            String s1 = this.MTH1567(s);
            if(this.FLD378.MTH2466(s1)) {
                return;
            }
            CLS213.MTH3304().MTH3320("\uD8E3.sqldb.rawquery", new Object[]{ʻᵢ0.MTH2079(), 2, s, ((String[])ʻᵢ0.MTH2078()[1])});
        }
    }

    public static void MTH1630(CLS581 ᵔˊ0, Object[] arr_object) {
        ᵔˊ0.MTH1593(arr_object);
    }

    public static Object MTH1631(Object[] arr_object) {
        return CLS581.MTH1626(arr_object);
    }

    public static void MTH1633(Object[] arr_object) {
        int v = (int)(((Integer)arr_object[0]));
        String s = (String)arr_object[1];
        Object object0 = arr_object[2];
        if(arr_object.length > 3) {
            CLS243.MTH3613(CLS95.MTH2017(), v, s, ((String)object0), ((ArrayList)object0));
        }
        CLS243.MTH3613(CLS95.MTH2017(), v, s, ((String)object0), null);
    }

    // 此方法包含解密的字符串
    private void MTH1634(Object[] arr_object) {
        CLS98 ʻᵢ0 = new CLS98(arr_object[0]);
        String s = (String)ʻᵢ0.MTH2078()[0];
        String s1 = s.toLowerCase();
        if(CLS170.MTH3011(s1, new String[]{"\uD8E3rom rcontact", "\uD8E3rom message", "\uD8E3rom userinfo", "\uD8E3rom rconversation", "\uD8E3rom lbsverifymessage", "\uD8E3rom chatroom", "\uD8E3rom fmessage_msginfo", "\uD8E3rom imginfo2"})) {
            try {
                if(!this.FLD373) {
                    this.FLD373 = true;
                    CLS204.MTH3252("\uD8E3b 2 hook success!");
                    CLS213.MTH3304().MTH3323("\uD8E3b.init", new Object[]{ʻᵢ0.MTH2079()});
                }
                this.MTH1652(ʻᵢ0.MTH2077().getClass().getClassLoader());
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        else if(CLS170.MTH3011(s1, new String[]{"\uD8E3nsinfo", "\uD8E3nscomment", "\uD8E3dsnsinfo"}) && !this.FLD380) {
            this.FLD380 = true;
            CLS213.MTH3304().MTH3323("\uD8E3nsdb.init", new Object[]{ʻᵢ0.MTH2079()});
        }
        String s2 = this.MTH1567(s1);
        if(this.MTH1759(s1) && !this.FLD378.MTH2466(s2)) {
            if(s.startsWith("\uD8E3kz_")) {
                ʻᵢ0.MTH2078()[0] = s.replace("\uD8E3kz_", "");
                return;
            }
            if(s.startsWith("\uD8E3*fkz*/")) {
                ʻᵢ0.MTH2078()[0] = s.replace("\uD8E3*fkz*/", "");
                return;
            }
            if(s.contains("\uD8E3*wxp*/")) {
                return;
            }
            String[] arr_s = (String[])ʻᵢ0.MTH2078()[1];
            this.FLD378.MTH2473("\uD8E3.sqldb.rawquery" + s2, s);
            CLS213.MTH3304().MTH3320("\uD8E3.sqldb.rawquery", new Object[]{ʻᵢ0.MTH2079(), 2, s, arr_s});
        }
    }

    public static Object MTH1635(Object[] arr_object) {
        int v = (int)(((Integer)arr_object[0]));
        String s = (String)arr_object[1];
        String s1 = (String)arr_object[2];
        if(arr_object.length > 3) {
            ArrayList arrayList0 = (ArrayList)arr_object[3];
            return Boolean.valueOf(CLS243.MTH3609(CLS95.MTH2017(), v, arrayList0, s, s1));
        }
        return Boolean.valueOf(CLS243.MTH3606(CLS95.MTH2017(), v, s, s1));
    }

    // 去混淆评级： 低(26)
    // 此方法包含解密的字符串
    public final String MTH1636(String s) {
        String s1 = s.toLowerCase();
        if(s1.contains("\uD8E3essage")) {
            return "\uD8E3essage";
        }
        if(s1.contains("\uD8E3conversation")) {
            return "\uD8E3conversation";
        }
        if(s1.contains("\uD8E3hatroom")) {
            return "\uD8E3hatroom";
        }
        if(s1.contains("\uD8E3contact")) {
            return "\uD8E3contact";
        }
        if(s1.contains("\uD8E3serinfo")) {
            return "\uD8E3serinfo";
        }
        if(s1.contains("\uD8E3dsnsinfo")) {
            return "\uD8E3dsnsinfo";
        }
        if(s1.contains("\uD8E3nsinfo")) {
            return "\uD8E3nsinfo";
        }
        if(s1.contains("\uD8E3nscomment")) {
            return "\uD8E3nscomment";
        }
        if(s1.contains("\uD8E3mginfo2")) {
            return "\uD8E3mginfo2";
        }
        if(s1.contains("\uD8E3aviteminfo")) {
            return "\uD8E3aviteminfo";
        }
        if(s1.contains("\uD8E3message_msginfo")) {
            return "\uD8E3message_msginfo";
        }
        if(s1.contains("\uD8E3arddevicerankinfo")) {
            return "\uD8E3arddevicerankinfo";
        }
        return s1.contains("\uD8E3bsverifymessage") ? "\uD8E3bsverifymessage" : "\uD8E3ther";
    }

    public static Object MTH1637(Object[] arr_object) {
        int v = (int)(((Integer)arr_object[0]));
        String s = (String)arr_object[1];
        if(arr_object.length > 2) {
            ArrayList arrayList0 = (ArrayList)arr_object[2];
            return CLS243.MTH3602(CLS95.MTH2017(), v, arrayList0, s);
        }
        return CLS243.MTH3615(CLS95.MTH2017(), v, s);
    }

    public static Object MTH1638(Object[] arr_object) {
        return CLS95.MTH1995();
    }

    // 此方法包含解密的字符串
    private void MTH1639(Object[] arr_object) {
        this.FLD390.MTH3925("\uD8E3ject");
        this.FLD390.MTH3948(600);
        CLS261.MTH3881().MTH3845();
        CLS95.MTH2003();
        CLS95.MTH1982(108, new Object[0]);
        CLS95.MTH2037();
        CLS95.MTH2023();
        CLS95.MTH2021();
        CLS95.MTH2013();
    }

    public static void MTH1640() {
        CLS169.MTH2922().MTH2918();
    }

    public static Object MTH1641(Object[] arr_object) {
        return CLS102.MTH2175();
    }

    // 去混淆评级： 低(24)
    // 此方法包含解密的字符串
    private void MTH1642(Object[] arr_object) {
        CLS98 ʻᵢ0 = new CLS98(arr_object[0]);
        String s = (String)ʻᵢ0.MTH2078()[1];
        if(!s.startsWith("\uD8E3kz_") && !s.startsWith("\uD8E3*fkz*/") && !s.contains("\uD8E3*wxp*/") && this.MTH1759(s)) {
            CLS213.MTH3304().MTH3320("\uD8E3.sqldb.rawquery", new Object[]{ʻᵢ0.MTH2079(), 1, s, ((Object[])ʻᵢ0.MTH2078()[2])});
        }
    }

    public static void MTH1643(CLS581 ᵔˊ0, Object[] arr_object) {
        ᵔˊ0.MTH1539(arr_object);
    }

    // 此方法包含解密的字符串
    public void MTH1645(Activity activity0) {
        if(this.FLD371 == null) {
            this.FLD371 = new WeakReference(activity0);
        }
        if((this.FLD370.MTH2725("\uD8E3hatroom_container", false) || this.FLD370.MTH2725("\uD8E3hatcontainer_enable", false)) && this.FLD389) {
            this.FLD389 = false;
            return;
        }
        this.MTH1775();
        CLS213.MTH3304().MTH3320("\uD8E3nlauncherui_enter", new Object[]{activity0}).MTH3323("\uD8E3nlauncheruienter", new Object[]{activity0});
        Intent intent0 = activity0.getIntent();
        if(intent0.hasExtra("\uD8E3otosettings")) {
            intent0.removeExtra("\uD8E3otosettings");
            CLS169.MTH2922().MTH2938(activity0);
        }
        this.MTH1772();
        if(!this.FLD377) {
            this.FLD377 = true;
            CLS144.MTH2583().MTH2608(((CLS142)() -> CLS581.MTH1678(activity0)), 10000L);
            CLS213.MTH3304().MTH3323("\uD8E3nlauncheruienter.notactive", new Object[]{activity0, activity0.getIntent()}).MTH3301("\uD8E3ase", "\uD8E3_wakelock", new Object[0]);
        }
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static Object MTH1646(Object[] arr_object) {
        return CLS216.MTH3352().MTH3350(CLS95.MTH2014());
    }

    public static void MTH1647(Object object0) {
        CLS581.MTH1618(object0);
    }

    public static Object MTH1648(Object[] arr_object) {
        int v = (int)(((Integer)arr_object[0]));
        if(arr_object.length > 1) {
            ArrayList arrayList0 = (ArrayList)arr_object[1];
            return CLS243.MTH3608(CLS95.MTH2017(), v, arrayList0);
        }
        return CLS243.MTH3605(CLS95.MTH2017(), v);
    }

    // 此方法包含解密的字符串
    private void MTH1649(Object[] arr_object) {
        CLS98 ʻᵢ0 = new CLS98(arr_object[0]);
        String s = (String)ʻᵢ0.MTH2078()[1];
        if(!this.MTH1759(s)) {
            return;
        }
        String s1 = this.MTH1636(s);
        if(this.FLD378.MTH2471(s1)) {
            return;
        }
        this.FLD378.MTH2473("\uD8E3.sqlitedb_exec" + s1, s);
        CLS213.MTH3304().MTH3320("\uD8E3.sqldb.exec", new Object[]{ʻᵢ0.MTH2079(), 2, s});
    }

    private void MTH1650(Object[] arr_object) {
        this.MTH1775();
    }

    // 检测为 Lambda 实现
    public static void MTH1651() [...]

    public final void MTH1652(ClassLoader classLoader0) {
        if(!this.FLD375 && !this.FLD381) {
            CLS147.MTH2641().MTH2622(classLoader0).MTH2624(classLoader0, this.MTH1611(), true);
            this.MTH1592(classLoader0, true);
            this.FLD381 = true;
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1653(Object[] arr_object) {
        if(TextUtils.isEmpty(CLS95.MTH2004("\uD8E3auncherUIWhatsnewMethod"))) {
            return;
        }
        CLS98 ʻᵢ0 = new CLS98(arr_object[0]);
        if(CLS224.MTH3471(((Activity)ʻᵢ0.MTH2077())).equals(CLS95.MTH2004("\uD8E3auncherUI"))) {
            CLS213.MTH3304().MTH3320("\uD8E3.on_LauncherUI_onResume", new Object[]{ʻᵢ0.MTH2079()});
        }
    }

    public static void MTH1654(Object[] arr_object) {
        CLS169.MTH2922().MTH2935();
    }

    public static Object MTH1655(Object[] arr_object) {
        File file0 = (File)arr_object[0];
        int v = (int)(((Integer)arr_object[1]));
        if(arr_object.length > 2) {
            ArrayList arrayList0 = (ArrayList)arr_object[2];
            return Boolean.valueOf(CLS243.MTH3601(CLS95.MTH2017(), file0, v, arrayList0));
        }
        return Boolean.valueOf(CLS243.MTH3601(CLS95.MTH2017(), file0, v, null));
    }

    // 去混淆评级： 低(26)
    // 此方法包含解密的字符串
    private void MTH1656(Object[] arr_object) {
        CLS98 ʻᵢ0 = new CLS98(arr_object[0]);
        if(this.MTH1759("\uD8E3essage") && !this.FLD378.MTH2475("\uD8E3essage")) {
            ContentValues contentValues0 = (ContentValues)CLS99.MTH2087(ʻᵢ0.MTH2078()[0], CLS95.MTH2004("\uD8E3onvertToMethod"), new Object[0]);
            if(!contentValues0.containsKey("\uD8E3sgId")) {
                contentValues0.put("\uD8E3sgId", this.FLD383.MTH3358());
            }
            this.FLD378.MTH2473("\uD8E3.sqlitedb_insert\uD8E3essage", "\uD8E3essage" + contentValues0);
            CLS213.MTH3304().MTH3320("\uD8E3.sqldb.insert", new Object[]{ʻᵢ0.MTH2079(), 3, "\uD8E3essage", contentValues0});
        }
    }

    // 此方法包含解密的字符串
    private void MTH1660(Object[] arr_object) {
        CLS98 ʻᵢ0 = new CLS98(arr_object[0]);
        String s = (String)ʻᵢ0.MTH2078()[0];
        ContentValues contentValues0 = (ContentValues)ʻᵢ0.MTH2078()[1];
        if(this.MTH1759(s) && !this.FLD378.MTH2474(s)) {
            CLS213.MTH3304().MTH3320("\uD8E3.sqldb.update", new Object[]{ʻᵢ0.MTH2079(), 2, s, contentValues0}).MTH3320("\uD8E3.async.sqldb.update", new Object[]{ʻᵢ0.MTH2079(), 2, s, contentValues0});
        }
    }

    private Object MTH1661(Object[] arr_object) {
        return this.MTH1611();
    }

    // 此方法包含解密的字符串
    private void MTH1664(Object[] arr_object) {
        CLS98 ʻᵢ0 = new CLS98(arr_object[0]);
        String s = (String)ʻᵢ0.MTH2078()[0];
        if(!this.MTH1759(s)) {
            return;
        }
        String s1 = this.MTH1567(s);
        this.FLD378.MTH2469(s1);
        if(this.FLD378.MTH2464("\uD8E3.sqldb.exec" + s1) && this.FLD378.MTH2467("\uD8E3.sqldb.exec" + s1).equals(s)) {
            this.FLD378.MTH2472("\uD8E3.sqldb.exec" + s1);
            return;
        }
        CLS213.MTH3304().MTH3320("\uD8E3.sqldb.exec", new Object[]{ʻᵢ0.MTH2079(), 1, s});
    }

    // 去混淆评级： 低(27)
    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private boolean MTH1666(Activity activity0, MenuItem menuItem0) [...]

    public static Object MTH1667(CLS581 ᵔˊ0, Object[] arr_object) {
        return ᵔˊ0.MTH1712(arr_object);
    }

    // 检测为 Lambda 实现
    public static void MTH1670(Activity activity0) [...]

    public static Object MTH1671(Object[] arr_object) {
        return Boolean.valueOf(CLS172.MTH3035());
    }

    // 检测为 Lambda 实现
    private void MTH1672(Object[] arr_object) [...]

    // 去混淆评级： 中等(110)
    // 此方法包含解密的字符串
    public final void MTH1673() {
        CLS213.MTH3304().MTH3314("\uD8E3etModuleFileUri", ((CLS254)new CLS594())).MTH3314("\uD8E3etModuleFileInputStream", ((CLS254)new CLS516())).MTH3314("\uD8E3etModuleFileOutputStream", ((CLS254)new CLS586())).MTH3314("\uD8E3oduleFileExists", ((CLS254)new CLS438())).MTH3314("\uD8E3eleteModuleFile", ((CLS254)new CLS518())).MTH3314("\uD8E3istModuleFiles", ((CLS254)new CLS467())).MTH3314("\uD8E3enameModuleFile", ((CLS254)new CLS432())).MTH3331("\uD8E3opyToModuleDir", ((CLS178)new CLS507())).MTH3331("\uD8E3reviewModuleDir", ((CLS178)new CLS601(this))).MTH3314("\uD8E3ipModuleDir", ((CLS254)new CLS486())).MTH3331("\uD8E3loneModuleFile", ((CLS178)new CLS590()));
    }

    public static void MTH1675() {
        CLS95.MTH2023();
        CLS257.MTH3710();
    }

    public static void MTH1676(Object[] arr_object) {
        CLS581.MTH1574(arr_object);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH1678(Activity activity0) {
        CLS213.MTH3304().MTH3301("\uD8E3onation", "\uD8E3isableTinker", new Object[]{activity0});
    }

    public static void MTH1680(CLS581 ᵔˊ0, Object[] arr_object) {
        ᵔˊ0.MTH1718(arr_object);
    }

    public static Object MTH1683(Object[] arr_object) {
        return CLS581.MTH1697(arr_object);
    }

    // 此方法包含解密的字符串
    public final void MTH1684(ClassLoader classLoader0) {
        public class CLS539 extends XpMethodHook {
            public final CLS581 FLD323;
            public final ClassLoader FLD324;

            public CLS539(ClassLoader classLoader0) {
                this.FLD324 = classLoader0;
                super();
            }

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                public class CLS537 extends XpMethodHook {
                    public final CLS539 FLD319;
                    public final int FLD320;

                    public CLS537(int v) {
                        this.FLD320 = v;
                        super();
                    }

                    // 此方法包含解密的字符串
                    @Override  // com.android.xc.Wrapper.XpMethodHook
                    public void beforeHookedMethod(Object object0) {
                        try {
                            if(((int)(((Integer)new CLS98(object0).MTH2078()[2]))) != this.FLD320) {
                                return;
                            }
                            CLS213.MTH3304().MTH3321("\uD8E3how_wexposed_main_options", new Object[0]);
                        }
                        catch(Throwable throwable0) {
                            CLS204.MTH3257(throwable0);
                        }
                    }
                }


                public class CLS538 extends XpMethodHook {
                    public final CLS539 FLD321;
                    public final int FLD322;

                    public CLS538(int v) {
                        this.FLD322 = v;
                        super();
                    }

                    @Override  // com.android.xc.Wrapper.XpMethodHook
                    public void afterHookedMethod(Object object0) {
                        CLS98 ʻᵢ0 = new CLS98(object0);
                        if(((int)(((Integer)ʻᵢ0.MTH2078()[0]))) != this.FLD322) {
                            return;
                        }
                        ImageView imageView0 = (ImageView)CLS100.MTH2118(((ViewGroup)(((View)ʻᵢ0.MTH2081()))), ImageView.class.getName());
                        if(imageView0 != null) {
                            CLS264.MTH4115(imageView0.getDrawable(), -1);
                        }
                    }
                }

                Object object2;
                Class class1;
                CLS581 ᵔˊ0;
                try {
                    Class class0 = View.class;
                    if(CLS581.this.FLD370.MTH2725("\uD8E3sePlusMenu", !CLS224.MTH3441()) && !CLS259.MTH3822() && CLS261.MTH3881().MTH3969() && !CLS213.MTH3304().MTH3319("\uD8E3sHideWxMenu", new Object[0]) && !CLS581.this.FLD390.MTH3894()) {
                        boolean z = CLS100.MTH2111(new String[]{"\uD8E3auncherUI"});
                        if(z && CLS581.this.FLD382 != null || !z && !CLS100.MTH2111(new String[]{"\uD8E3omeUI"})) {
                            return;
                        }
                        CLS98 ʻᵢ0 = new CLS98(object0);
                        Object object1 = CLS95.MTH1981("\uD8E3lusMenuItemClass0") ? CLS100.MTH2113(ʻᵢ0.MTH2078()[0], CLS95.MTH2004("\uD8E3lusMenuItemClass0")) : CLS100.MTH2127(ʻᵢ0.MTH2078()[0], 0);
                        String s = object1.getClass().getName();
                        if(CLS581.this.FLD382 == null) {
                            if(CLS95.MTH1981("\uD8E3lusMenuItemClass1")) {
                                ᵔˊ0 = CLS581.this;
                                class1 = CLS147.MTH2641().MTH2642("\uD8E3lusMenuItemClass1");
                            }
                            else {
                                ᵔˊ0 = CLS581.this;
                                class1 = CLS102.MTH2180((s + "\uD8E3c"), this.FLD324);
                            }
                            ᵔˊ0.FLD382 = class1;
                        }
                        SparseArray sparseArray0 = (SparseArray)CLS100.MTH2113(object1, SparseArray.class);
                        int v = sparseArray0.size();
                        if(CLS95.MTH1981("\uD8E3lusMenuItemClass2")) {
                            object2 = CLS99.MTH2086(CLS147.MTH2641().MTH2642("\uD8E3lusMenuItemClass2"), new Object[]{20000, "", "", 0x108005A, 0});
                        }
                        else if(CLS95.MTH1981("\uD8E3lusMenuItemClass2_b")) {
                            object2 = CLS99.MTH2086(CLS147.MTH2641().MTH2642("\uD8E3lusMenuItemClass2_b"), new Object[]{20000, "", 0x108005A, 0});
                        }
                        else {
                            object2 = CLS95.MTH1981("\uD8E3lusMenuItemClass2_c") ? CLS99.MTH2086(CLS147.MTH2641().MTH2642("\uD8E3lusMenuItemClass2_c"), new Object[]{20000, 0x108005A, 0, ""}) : CLS99.MTH2086(CLS102.MTH2180((s + "\uD8E3d"), this.FLD324), new Object[]{20000, "", "", 0x108005A, 0});
                        }
                        if(object2 == null) {
                            return;
                        }
                        sparseArray0.put(v, CLS99.MTH2086(CLS581.this.FLD382, new Object[]{object2}));
                        String s1 = CLS95.MTH2012("\uD8E3lusMenuItemClass3", s + "\uD8E3a");
                        String s2 = CLS95.MTH2012("\uD8E3lusMenuItemClass3_getViewMethod", "\uD8E3etView");
                        Object[] arr_object = new Object[4];
                        Class class2 = Integer.TYPE;
                        arr_object[0] = class2;
                        arr_object[1] = class0;
                        arr_object[2] = ViewGroup.class;
                        arr_object[3] = CLS102.MTH2147(new CLS538(this, v));
                        CLS100.MTH2105(s1, this.FLD324, s2, arr_object);
                        String s3 = CLS95.MTH2012("\uD8E3lusMenuItemClass0_onItemClickMethod", "\uD8E3nItemClick");
                        Object[] arr_object1 = {AdapterView.class, class0, class2, Long.TYPE, CLS102.MTH2147(new CLS537(this, v))};
                        CLS100.MTH2105(s, this.FLD324, s3, arr_object1);
                    }
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }

        Class class0 = CLS100.MTH2112(CLS95.MTH2012("\uD8E3MListPopupWindow", this.FLD387.MTH3503() + "\uD8E3ui.base.MMListPopupWindow"), classLoader0);
        Method method0 = CLS100.MTH2125(class0, null, Void.TYPE, new Object[]{ListAdapter.class});
        if(method0 == null) {
            method0 = CLS100.MTH2125(class0, null, Void.TYPE, new Object[]{BaseAdapter.class});
        }
        CLS100.MTH2123(method0, CLS102.MTH2147(new CLS539(this, classLoader0)));
    }

    public static void MTH1685(Object[] arr_object) {
        CLS581.MTH1633(arr_object);
    }

    public static Object MTH1686(Object[] arr_object) {
        Object object0 = arr_object[0];
        if(!(object0 instanceof Bitmap)) {
            return false;
        }
        return CLS264.MTH4107(((Bitmap)object0)) ? true : Boolean.valueOf(CLS264.MTH4107(CLS264.MTH4111(((Bitmap)object0))));
    }

    // 此方法包含解密的字符串
    public static void MTH1687(Activity activity0) {
        Intent intent0 = new Intent();
        if(!CLS65.MTH1215(CLS95.MTH2004("\uD8E3oginAsExDeviceUI"), intent0)) {
            intent0.setClassName(activity0, CLS95.MTH2004("\uD8E3oginAsExDeviceUI"));
            activity0.startActivity(intent0);
        }
    }

    public static void MTH1689(Object[] arr_object) {
        CLS144.MTH2583().MTH2604(((CLS142)() -> CLS581.MTH1582()));
    }

    public static Object MTH1692(Object[] arr_object) {
        return CLS258.MTH3774(((Activity)arr_object[0]), ((LinearLayout)arr_object[1]), ((String)arr_object[2]));
    }

    // 此方法包含解密的字符串
    private void MTH1693(Object[] arr_object) {
        CLS98 ʻᵢ0 = new CLS98(arr_object[0]);
        String s = (String)ʻᵢ0.MTH2078()[0];
        ContentValues contentValues0 = (ContentValues)ʻᵢ0.MTH2078()[2];
        if(this.MTH1759(s) && !this.FLD378.MTH2475(s) && !"\uD8E3essage".equalsIgnoreCase(s)) {
            CLS213.MTH3304().MTH3320("\uD8E3.sqldb.insert", new Object[]{ʻᵢ0.MTH2079(), 2, s, contentValues0}).MTH3323("\uD8E3.async.sqldb.insert", new Object[]{ʻᵢ0.MTH2079(), 2, s, contentValues0});
        }
    }

    public static Object MTH1694(CLS581 ᵔˊ0, Object[] arr_object) {
        return ᵔˊ0.MTH1661(arr_object);
    }

    public static Object MTH1696(Object[] arr_object) {
        return CLS224.MTH3473(((Context)arr_object[0]));
    }

    public static Object MTH1697(Object[] arr_object) {
        return CLS95.MTH2025();
    }

    // 此方法包含解密的字符串
    private void MTH1698(Object[] arr_object) {
        CLS98 ʻᵢ0 = new CLS98(arr_object[0]);
        String s = (String)ʻᵢ0.MTH2078()[0];
        ContentValues contentValues0 = (ContentValues)ʻᵢ0.MTH2078()[2];
        if(!this.MTH1759(s)) {
            return;
        }
        CLS213.MTH3304().MTH3320("\uD8E3.sqldb.insert", new Object[]{ʻᵢ0.MTH2079(), 1, s, contentValues0}).MTH3323("\uD8E3.async.sqldb.insert", new Object[]{ʻᵢ0.MTH2079(), 1, s, contentValues0});
        if(!"\uD8E3essage".equalsIgnoreCase(s)) {
            return;
        }
        this.MTH1566(ʻᵢ0);
    }

    private void MTH1700(Object[] arr_object) {
        this.MTH1627();
    }

    // 此方法包含解密的字符串
    private void MTH1701(Object[] arr_object) {
        if(!TextUtils.isEmpty(CLS95.MTH2004("\uD8E3omeUITitleField")) && CLS261.MTH3881().MTH3969() && CLS95.MTH2031().MTH2725("\uD8E3itleShowWxMenu", true) && !this.FLD390.MTH3894()) {
            TextView textView0 = (TextView)CLS99.MTH2093(new CLS98(arr_object[0]).MTH2077(), CLS95.MTH2004("\uD8E3omeUITitleField"));
            if(textView0 == null) {
                return;
            }
            Object object0 = CLS99.MTH2090(textView0, "\uD8E3ongclick_to_show_wx");
            if(object0 != null && ((Boolean)object0).booleanValue()) {
                return;
            }
            textView0.setOnLongClickListener((View view0) -> // 此方法包含解密的字符串
            {
                if(!CLS95.MTH2031().MTH2725("\uD8E3itleShowWxMenu", true)) {
                    return false;
                }
                CLS213.MTH3304().MTH3321("\uD8E3how_wexposed_main_options", new Object[0]);
                return true;
            });
            CLS99.MTH2091(textView0, "\uD8E3ongclick_to_show_wx", Boolean.TRUE);
        }
    }

    private void MTH1702(Object[] arr_object) {
        this.FLD390.MTH3948(((int)(((Integer)arr_object[0]))));
    }

    private void MTH1704(Object[] arr_object) {
        if(!CLS261.MTH3881().MTH3969()) {
            return;
        }
        CLS144.MTH2583().MTH2604(((CLS142)() -> CLS169.MTH2922().MTH2938(this.MTH1580())));
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Object MTH1705(Object[] arr_object) {
        return "";
    }

    // 此方法包含解密的字符串
    private Object MTH1707(Object[] arr_object) {
        try {
            File file0 = (File)arr_object[0];
            return CLS77.MTH1868(this.MTH1611(), this.MTH1611().getPackageName() + "\uD8E3external.fileprovider", file0);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return null;
        }
    }

    private void MTH1711(Object[] arr_object) {
        this.FLD377 = false;
    }

    private Object MTH1712(Object[] arr_object) {
        return this.MTH1580();
    }

    public static Object MTH1713(Object[] arr_object) {
        return CLS581.MTH1597(arr_object);
    }

    private Object MTH1714(Object[] arr_object) {
        return this.FLD393;
    }

    public static void MTH1715(Object[] arr_object) {
        CLS98 ʻᵢ0 = new CLS98(arr_object[0]);
        int v = (int)(((Integer)ʻᵢ0.MTH2078()[0]));
        if(((int)(((Integer)ʻᵢ0.MTH2078()[1]))) == -1 && v == 9900) {
            CLS169.MTH2922().MTH2986(((Activity)ʻᵢ0.MTH2077()), ((Intent)ʻᵢ0.MTH2078()[2]));
        }
    }

    public static void MTH1717(Object[] arr_object) {
        CLS581.MTH1602(arr_object);
    }

    private void MTH1718(Object[] arr_object) {
        CLS257.MTH3738(this.MTH1580());
    }

    private Object MTH1719(Object[] arr_object) {
        return this.FLD387.MTH3510();
    }

    private Object MTH1720(Object[] arr_object) {
        return Boolean.valueOf(this.FLD390.MTH4020());
    }

    public static Object MTH1723(Object[] arr_object) {
        return Boolean.valueOf(CLS224.MTH3441());
    }

    // 此方法包含解密的字符串
    private void MTH1725(Object[] arr_object) {
        CLS98 ʻᵢ0 = new CLS98(arr_object[0]);
        String s = (String)ʻᵢ0.MTH2078()[0];
        ContentValues contentValues0 = (ContentValues)ʻᵢ0.MTH2078()[2];
        if(this.MTH1759(s) && !this.FLD378.MTH2475(s) && !"\uD8E3essage".equalsIgnoreCase(s)) {
            this.FLD378.MTH2473("\uD8E3.sqlitedb_insert" + s, s + contentValues0);
            CLS213.MTH3304().MTH3320("\uD8E3.sqldb.insert", new Object[]{ʻᵢ0.MTH2079(), 2, s, contentValues0});
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1728() {
        CLS213.MTH3304().MTH3311("\uD8E3xportSettings", new Object[0]);
    }

    public static Object MTH1731(Object[] arr_object) {
        return Boolean.valueOf(!CLS224.MTH3441());
    }

    public static Object MTH1732(Object[] arr_object) {
        return Boolean.valueOf(CLS258.MTH3771());
    }

    private Object MTH1733(Object[] arr_object) {
        return this.FLD391;
    }

    // 此方法包含解密的字符串
    public final void MTH1734(ClassLoader classLoader0) {
        public class CLS533 extends XpMethodHook {
            public final CLS581 FLD314;
            public final String FLD315;

            public CLS533(String s) {
                this.FLD315 = s;
                super();
            }

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                String s = null;
                CLS213.MTH3304().MTH3320("\uD8E3n_settingsui_preference", new Object[]{object0});
                Object object1 = new CLS98(object0).MTH2078()[1];
                Context context0 = null;
                try {
                    if(CLS100.MTH2115(object1, CLS95.MTH2012("\uD8E3ref_getKeyMethod", "\uD8E3etKey"))) {
                        s = (String)CLS99.MTH2087(object1, CLS95.MTH2012("\uD8E3ref_getKeyMethod", "\uD8E3etKey"), new Object[0]);
                    }
                }
                catch(Throwable unused_ex) {
                }
                if(TextUtils.isEmpty(s)) {
                    try {
                        String s1 = (String)CLS99.MTH2093(object1, CLS95.MTH2012("\uD8E3ref_field_key", "\uD8E3Key"));
                        if(!TextUtils.isEmpty(s1)) {
                            s = s1;
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                try {
                    if(!TextUtils.isEmpty(s)) {
                        if(!this.FLD315.equals(s)) {
                            CLS213.MTH3304().MTH3320("\uD8E3.onpreference", new Object[]{s, object0});
                            return;
                        }
                    }
                    else if(!new HashSet(CLS100.MTH2116(object1, String.class)).contains(this.FLD315)) {
                        return;
                    }
                    goto label_16;
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                    return;
                }
                return;
                try {
                label_16:
                    if(CLS100.MTH2115(object1, CLS95.MTH2012("\uD8E3ref_getContextMethod", "\uD8E3etContext"))) {
                        context0 = (Context)CLS99.MTH2087(object1, CLS95.MTH2012("\uD8E3ref_getContextMethod", "\uD8E3etContext"), new Object[0]);
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
                    context0 = (Context)CLS100.MTH2113(object1, Context.class);
                }
                catch(Throwable unused_ex) {
                }
                try {
                label_20:
                    if(context0 == null) {
                        context0 = CLS581.this.MTH1580();
                    }
                    CLS169.MTH2922().MTH2938(((Activity)context0));
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }


        public class CLS571 extends XpMethodHook {
            public final String FLD356;
            public final ClassLoader FLD357;
            public final CLS581 FLD358;

            public CLS571(ClassLoader classLoader0, String s) {
                this.FLD357 = classLoader0;
                this.FLD356 = s;
                super();
            }

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                CLS581.this.MTH1627();
                if(!CLS261.MTH3881().MTH3969()) {
                    return;
                }
                CLS213.MTH3304().MTH3320("\uD8E3n_settingsui_oncreate", new Object[]{object0});
                CLS98 ʻᵢ0 = new CLS98(object0);
                Activity activity0 = (Activity)ʻᵢ0.MTH2077();
                WeakReference weakReference0 = new WeakReference(activity0);
                CLS581.this.FLD384 = weakReference0;
                if(CLS95.MTH1981("\uD8E3MActivity_getMMTitleView") && CLS581.this.FLD370.MTH2725("\uD8E3ettingsui_title_show_wxmenu", false)) {
                    Object object1 = CLS99.MTH2087(ʻᵢ0.MTH2077(), CLS95.MTH2004("\uD8E3MActivity_getMMTitleView"), new Object[0]);
                    if(object1 != null) {
                        ((View)object1).setOnLongClickListener((View view0) -> {
                            CLS169.MTH2922().MTH2938(activity0);
                            return true;
                        });
                    }
                }
                if(!CLS581.this.FLD370.MTH2725("\uD8E3ideSettings", false) && !CLS259.MTH3822() && !CLS213.MTH3304().MTH3319("\uD8E3sHideWxMenu", new Object[0]) && !CLS581.this.FLD390.MTH3990()) {
                    Object object2 = ʻᵢ0.MTH2077();
                    if(!CLS581.this.MTH1563(activity0, this.FLD357, this.FLD356, object2)) {
                        CLS169.MTH2922().MTH2938(activity0);
                    }
                }
            }

            // 检测为 Lambda 实现
            public static boolean MTH1503(Activity activity0, View view0) [...]
        }

        Class class0 = null;
        try {
            class0 = CLS100.MTH2124((this.FLD387.MTH3503() + "\uD8E3plugin.setting.ui.setting.SettingsUI"), classLoader0);
        }
        catch(Throwable unused_ex) {
        }
        if(class0 == null) {
            return;
        }
        String s = "\uD8E3X_" + Long.toHexString(System.currentTimeMillis());
        CLS100.MTH2139(class0, "\uD8E3nCreate", new Object[]{Bundle.class, CLS102.MTH2147(new CLS571(this, classLoader0, s))});
        try {
            CLS100.MTH2123(CLS100.MTH2125(class0, null, Boolean.TYPE, new Object[]{null, "\uD8E3reference"}), CLS102.MTH2147(new CLS533(this, s)));
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 此方法包含解密的字符串
    private void MTH1735(Object[] arr_object) {
        Activity activity0 = (Activity)CLS99.MTH2087(new CLS98(arr_object[0]).MTH2077(), CLS95.MTH2004("\uD8E3hattingUIGetActivity"), new Object[0]);
        if(this.MTH1580() == null) {
            this.MTH1645(activity0);
        }
        CLS213.MTH3304().MTH3320("\uD8E3et_current_activity", new Object[]{activity0});
        this.FLD384 = new WeakReference(activity0);
        this.MTH1627();
    }

    public static Object MTH1736(Object[] arr_object) {
        return Boolean.valueOf(CLS257.MTH3711());
    }

    public static Object MTH1739(Object[] arr_object) {
        return 209;
    }

    // 去混淆评级： 中等(126)
    // 此方法包含解密的字符串
    public final void MTH1740() {
        CLS213.MTH3304().MTH3331("\uD8E3.on_SQLiteDatabaseClass_rawQueryWithFactory", ((CLS178)new CLS488(this))).MTH3331("\uD8E3.dbquery", ((CLS178)new CLS468(this))).MTH3331("\uD8E3.on_SQLiteDatabaseClass_insertWithOnConflict", ((CLS178)new CLS585(this))).MTH3331("\uD8E3.on_SQLiteDatabaseClass_insertWithOnConflict", ((CLS178)new CLS505(this))).MTH3331("\uD8E3.dbupdate", ((CLS178)new CLS527(this))).MTH3331("\uD8E3.dbupdate0", ((CLS178)new CLS509(this))).MTH3331("\uD8E3.dbexec", ((CLS178)new CLS465(this))).MTH3314("\uD8E3etMainDB", ((CLS254)new CLS477(this))).MTH3314("\uD8E3etSnsDB", ((CLS254)new CLS474(this))).MTH3314("\uD8E3etFavDB", ((CLS254)new CLS454(this)));
        CLS213.MTH3304().MTH3331("\uD8E3.sqlitedb_rawQuery", ((CLS178)new CLS602(this))).MTH3331("\uD8E3.sqlitedb_rawQuery", ((CLS178)new CLS441(this))).MTH3331("\uD8E3.sqlitedb_insert", ((CLS178)new CLS482(this))).MTH3331("\uD8E3.sqlitedb_insert", ((CLS178)new CLS460(this))).MTH3331("\uD8E3.MsgInfoStorage_insertMsg", ((CLS178)new CLS464(this))).MTH3331("\uD8E3.MsgInfoStorage_insertMsg", ((CLS178)new CLS451(this))).MTH3331("\uD8E3.sqlitedb_update", ((CLS178)new CLS611(this))).MTH3331("\uD8E3.sqlitedb_update", ((CLS178)new CLS478(this))).MTH3331("\uD8E3.sqlitedb_exec", ((CLS178)new CLS444(this)));
    }

    public static Object MTH1741(Object[] arr_object) {
        return CLS581.MTH1671(arr_object);
    }

    // 去混淆评级： 低(34)
    // 此方法包含解密的字符串
    public final void MTH1742(ClassLoader classLoader0) {
        public class CLS528 extends XpMethodHook {
            public final CLS581 FLD309;

            // 去混淆评级： 低(22)
            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                if(!CLS581.this.FLD370.MTH2725("\uD8E3orce_darkmode", false)) {
                    return;
                }
                if(CLS95.MTH2031().MTH2725("\uD8E3arkmode_follow_time", false) && !CLS259.MTH3819(CLS95.MTH2031().MTH2733("\uD8E3arkmode_timeframe", ""))) {
                    return;
                }
                CLS98 ʻᵢ0 = new CLS98(object0);
                if(ʻᵢ0.MTH2078()[0].toString().equals("\uD8E3licfg_dark_mode_brand_api")) {
                    ʻᵢ0.MTH2080(Build.BRAND.toLowerCase() + "\uD8E3" + Build.VERSION.SDK_INT);
                }
            }
        }


        public class CLS534 extends XpMethodHook {
            public final CLS581 FLD316;

            // 去混淆评级： 低(21)
            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                if(!CLS581.this.FLD370.MTH2725("\uD8E3orce_darkmode", false)) {
                    return;
                }
                if(CLS95.MTH2031().MTH2725("\uD8E3arkmode_follow_time", false) && !CLS259.MTH3819(CLS95.MTH2031().MTH2733("\uD8E3arkmode_timeframe", ""))) {
                    return;
                }
                CLS98 ʻᵢ0 = new CLS98(object0);
                String s = (String)ʻᵢ0.MTH2078()[0];
                if(s.equals("\uD8E3ark_mode_used") || s.equals("\uD8E3ark_mode_follow_system")) {
                    ʻᵢ0.MTH2080(Boolean.TRUE);
                }
            }
        }


        public class CLS554 extends XpMethodHook {
            public final CLS581 FLD339;

            // 去混淆评级： 低(21)
            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                if(!CLS581.this.FLD370.MTH2725("\uD8E3orce_darkmode", false)) {
                    return;
                }
                if(CLS95.MTH2031().MTH2725("\uD8E3arkmode_follow_time", false) && !CLS259.MTH3819(CLS95.MTH2031().MTH2733("\uD8E3arkmode_timeframe", ""))) {
                    return;
                }
                new CLS98(object0).MTH2080(Boolean.TRUE);
            }
        }


        public class CLS558 extends XpMethodHook {
            public final CLS581 FLD343;

            // 去混淆评级： 低(40)
            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                if(CLS581.this.FLD370.MTH2725("\uD8E3orce_darkmode", false) && !CLS95.MTH2031().MTH2725("\uD8E3arkmode_follow_system", false)) {
                    new CLS98(object0).MTH2080((CLS95.MTH2031().MTH2725("\uD8E3arkmode_follow_time", false) ? Boolean.valueOf(CLS259.MTH3819(CLS95.MTH2031().MTH2733("\uD8E3arkmode_timeframe", ""))) : Boolean.TRUE));
                }
            }
        }


        public class CLS575 extends XpMethodHook {
            public final CLS581 FLD362;

            // 去混淆评级： 低(40)
            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                if(CLS581.this.FLD370.MTH2725("\uD8E3orce_darkmode", false) && !CLS95.MTH2031().MTH2725("\uD8E3arkmode_follow_system", false)) {
                    new CLS98(object0).MTH2080((CLS95.MTH2031().MTH2725("\uD8E3arkmode_follow_time", false) ? Boolean.valueOf(CLS259.MTH3819(CLS95.MTH2031().MTH2733("\uD8E3arkmode_timeframe", ""))) : Boolean.TRUE));
                }
            }
        }


        public class CLS577 extends XpMethodHook {
            public final CLS581 FLD364;

            // 去混淆评级： 低(21)
            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                if(!CLS581.this.FLD370.MTH2725("\uD8E3orce_darkmode", false)) {
                    return;
                }
                if(CLS95.MTH2031().MTH2725("\uD8E3arkmode_follow_time", false) && !CLS259.MTH3819(CLS95.MTH2031().MTH2733("\uD8E3arkmode_timeframe", ""))) {
                    return;
                }
                new CLS98(object0).MTH2080(Boolean.TRUE);
            }
        }

        CLS100.MTH2105(CLS95.MTH2004("\uD8E3IUtilsClass"), classLoader0, CLS95.MTH2004("\uD8E3IUtilsIsDarkMethod1"), new Object[]{CLS102.MTH2147(new CLS575(this))});
        CLS100.MTH2105(CLS95.MTH2004("\uD8E3IUtilsClass"), classLoader0, CLS95.MTH2004("\uD8E3IUtilsIsDarkMethod2"), new Object[]{Resources.class, CLS102.MTH2147(new CLS558(this))});
        CLS100.MTH2105(CLS95.MTH2004("\uD8E3IUtilsClass"), classLoader0, CLS95.MTH2004("\uD8E3IUtilsIsDarkMethod3"), new Object[]{CLS102.MTH2147(new CLS554(this))});
        CLS100.MTH2105(CLS95.MTH2004("\uD8E3IUtilsClass"), classLoader0, CLS95.MTH2004("\uD8E3IUtilsIsDarkMethod5"), new Object[]{CLS102.MTH2147(new CLS577(this))});
        CLS100.MTH2105(CLS95.MTH2004("\uD8E3xptManagerClass"), classLoader0, CLS95.MTH2004("\uD8E3xptManagerGetStringMethod"), new Object[]{String.class, String.class, Boolean.TYPE, Boolean.TYPE, CLS102.MTH2147(new CLS528(this))});
        CLS100.MTH2138(CLS95.MTH2004("\uD8E3MKVClass"), classLoader0, "\uD8E3etBoolean", CLS102.MTH2147(new CLS534(this)));
    }

    // 检测为 Lambda 实现
    public static void MTH1743() [...]

    // 此方法包含解密的字符串
    public static void MTH1744(Object[] arr_object) {
        if(CLS100.MTH2111(new String[]{"\uD8E3ndroid.app.Instrumentation.callActivityOnResume"})) {
            CLS213.MTH3304().MTH3320("\uD8E3.on_LauncherUI_onResume", new Object[]{arr_object[0]});
        }
    }

    // 检测为 Lambda 实现
    private void MTH1745() [...]

    private Object MTH1746(Object[] arr_object) {
        return this.FLD374;
    }

    private void MTH1747(Object[] arr_object) {
        CLS420 ʻˎ0 = () -> CLS224.MTH3482(this.MTH1580(), ((String)arr_object[0]));
        this.FLD372.MTH2604(((CLS142)ʻˎ0));
    }

    public static Object MTH1749(Object[] arr_object) {
        return CLS95.MTH2028();
    }

    public static Object MTH1750(Object[] arr_object) {
        return CLS581.MTH1646(arr_object);
    }

    public static Object MTH1751(Object[] arr_object) {
        return Boolean.valueOf(CLS102.MTH2153());
    }

    // 去混淆评级： 中等(140)
    // 此方法包含解密的字符串
    public void MTH1752(CLS213 ˎʿ0) {
        ˎʿ0.MTH3314("\uD8E3etVersion", ((CLS254)new CLS515())).MTH3314("\uD8E3etLauncherUI", ((CLS254)new CLS475(this))).MTH3314("\uD8E3etContext", ((CLS254)new CLS582(this))).MTH3314("\uD8E3etCurrentActivity", ((CLS254)new CLS519(this))).MTH3314("\uD8E3etModuleContext", ((CLS254)new CLS606())).MTH3314("\uD8E3etClassLoader", ((CLS254)new CLS511())).MTH3331("\uD8E3howtoast", ((CLS178)new CLS447(this))).MTH3331("\uD8E3ebug", ((CLS178)new CLS596())).MTH3314("\uD8E3etLoginName,getLoginName2", ((CLS254)new CLS449())).MTH3314("\uD8E3etNickName", ((CLS254)new CLS458())).MTH3314("\uD8E3etAlias", ((CLS254)new CLS591())).MTH3314("\uD8E3etBindMobile", ((CLS254)new CLS608())).MTH3314("\uD8E3etBindEmail", ((CLS254)new CLS473())).MTH3331("\uD8E3isable", ((CLS178)new CLS456())).MTH3331("\uD8E3ject", ((CLS178)new CLS513(this))).MTH3331("\uD8E3witching_contact_view", ((CLS178)new CLS610(this))).MTH3331("\uD8E3ecreate_launcherui", ((CLS178)new CLS514(this))).MTH3331("\uD8E3howSettingsDialog", ((CLS178)new CLS484(this))).MTH3331("\uD8E3jectCore", ((CLS178)new CLS430())).MTH3314("\uD8E3etToolbar", ((CLS254)new CLS436())).MTH3314("\uD8E3asToolbar", ((CLS254)new CLS595())).MTH3331("\uD8E3efreshSettings", ((CLS178)new CLS419())).MTH3331("\uD8E3efreshSettingsText,on_update_progress", ((CLS178)new CLS431())).MTH3314("\uD8E3sDisabled", ((CLS254)new CLS512(this))).MTH3331("\uD8E3how_wexposed_main_options", ((CLS178)new CLS523(this))).MTH3314("\uD8E3etNotice", ((CLS254)new CLS491()));
        CLS213.MTH3304().MTH3331("\uD8E3nsettingschange", ((CLS178)new CLS453(this))).MTH3314("\uD8E3etRetrievedImg", ((CLS254)new CLS452(this))).MTH3314("\uD8E3etRetrievedImgHistory", ((CLS254)new CLS479(this))).MTH3331("\uD8E3etDisableCode", ((CLS178)new CLS493(this))).MTH3331("\uD8E3heck_updates", ((CLS178)new CLS423(this))).MTH3314("\uD8E3etLanguage", ((CLS254)new CLS442())).MTH3314("\uD8E3sDarkMode", ((CLS254)new CLS526())).MTH3314("\uD8E3sQRCode", ((CLS254)new CLS463())).MTH3314("\uD8E3canQRImage", ((CLS254)new CLS476())).MTH3314("\uD8E3enQRCode", ((CLS254)new CLS525())).MTH3331("\uD8E3etLanguage", ((CLS178)new CLS437())).MTH3314("\uD8E3etWechatHash", ((CLS254)new CLS489(this))).MTH3314("\uD8E3etWechatSig", ((CLS254)new CLS448(this))).MTH3314("\uD8E3sEmulator", ((CLS254)new CLS603())).MTH3314("\uD8E3etProperty", ((CLS254)new CLS500())).MTH3314("\uD8E3etCoreVersionCode", ((CLS254)new CLS604())).MTH3314("\uD8E3equires_fp_donation", ((CLS254)new CLS455())).MTH3314("\uD8E3equires_fp_menu_settings", ((CLS254)new CLS461())).MTH3314("\uD8E3etWechatClientVersion", ((CLS254)new CLS428())).MTH3314("\uD8E3etXpFrameWork", ((CLS254)new CLS522())).MTH3314("\uD8E3asWriteStoragePermission", ((CLS254)new CLS426())).MTH3314("\uD8E3asReadStoragePermission", ((CLS254)new CLS521())).MTH3314("\uD8E3etUriFromProvider", ((CLS254)new CLS433(this))).MTH3314("\uD8E3m_getParam", ((CLS254)new CLS517())).MTH3314("\uD8E3sLspatchIntegratedMode", ((CLS254)new CLS600())).MTH3314("\uD8E3sIntegratedMode", ((CLS254)new CLS492())).MTH3331("\uD8E3xsettings_disappear", ((CLS178)new CLS524())).MTH3331("\uD8E3xsettings_reappear", ((CLS178)new CLS425())).MTH3331("\uD8E3equestModuleDirPermission", ((CLS178)new CLS599(this)));
        ˎʿ0.MTH3331("\uD8E3nIsTabletMethod1", ((CLS178)new CLS502(this)));
        this.MTH1740();
        this.MTH1599();
        this.MTH1673();
        CLS150.MTH2682().MTH2684(ˎʿ0);
    }

    public static Object MTH1754(Object[] arr_object) {
        return CLS581.MTH1789(arr_object);
    }

    // 去混淆评级： 低(22)
    // 此方法包含解密的字符串
    private void MTH1755(Object[] arr_object) {
        CLS98 ʻᵢ0 = new CLS98(arr_object[0]);
        Activity activity0 = (Activity)ʻᵢ0.MTH2077();
        String s = CLS224.MTH3471(activity0);
        if(!s.endsWith("\uD8E3oginPasswordUI") && !s.endsWith("\uD8E3oginHistoryUI") && !s.endsWith("\uD8E3obileInputUI") && !s.endsWith("\uD8E3oginUI") || CLS259.MTH3822()) {
            return;
        }
        if(TextUtils.isEmpty(CLS95.MTH2014())) {
            return;
        }
        String s1 = CLS95.MTH2012("\uD8E3ddTextOptionMenu", "\uD8E3");
        CLS99.MTH2087(ʻᵢ0.MTH2077(), s1, new Object[]{2000, "", (MenuItem menuItem0) -> // 去混淆评级： 低(27)
        // 此方法包含解密的字符串
        {
            CLS125 ʻᵢ0 = new CLS125(activity0, "");
            if(!CLS246.MTH3659() && CLS95.MTH1981("\uD8E3oginAsExDeviceUI")) {
                ʻᵢ0.MTH2414("\uD8E3ablet_login", ((CLS107)new CLS434(activity0)));
            }
            if(this.FLD368.MTH3240()) {
                ʻᵢ0.MTH2414("\uD8E3ransfer_advanced", ((CLS107)new CLS483(activity0)));
            }
            ʻᵢ0.MTH2414("\uD8E3xport_settings", ((CLS107)new CLS607())).MTH2414("\uD8E3estart_wechat", ((CLS107)new CLS510())).MTH2414("\uD8E3eset_module", ((CLS107)new CLS424())).MTH2418();
            return true;
        }});
    }

    // 此方法包含解密的字符串
    public static void MTH1756(Activity activity0) {
        String s = CLS224.MTH3462(1);
        if(!TextUtils.isEmpty(s)) {
            CLS258.MTH3769(activity0, "", s, true, true, null);
            CLS224.MTH3458(activity0, s);
            CLS224.MTH3482(activity0, "");
        }
    }

    public static void MTH1757() {
        CLS581.MTH1728();
    }

    // 去混淆评级： 中等(150)
    // 此方法包含解密的字符串
    public final boolean MTH1759(String s) {
        String s1 = s.toLowerCase();
        return !s1.startsWith("\uD8E3ragma") && CLS170.MTH3011(s1, new String[]{"\uD8E3contact", "\uD8E3essage", "\uD8E3serinfo", "\uD8E3conversation", "\uD8E3bsverifymessage", "\uD8E3nsinfo", "\uD8E3nscomment", "\uD8E3dsnsinfo", "\uD8E3aviteminfo", "\uD8E3mginfo2", "\uD8E3hatroom", "\uD8E3message_msginfo", "\uD8E3arddevicerankinfo"});
    }

    public static Object MTH1762(Object[] arr_object) {
        return CLS581.MTH1637(arr_object);
    }

    private Object MTH1764(Object[] arr_object) {
        return this.FLD383.MTH3370();
    }

    public static void MTH1765(CLS581 ᵔˊ0, Object[] arr_object) {
        ᵔˊ0.MTH1639(arr_object);
    }

    public static Object MTH1770(Object[] arr_object) {
        int v = (int)(((Integer)arr_object[0]));
        String s = (String)arr_object[1];
        if(arr_object.length > 2) {
            ArrayList arrayList0 = (ArrayList)arr_object[2];
            return Boolean.valueOf(CLS243.MTH3638(CLS95.MTH2017(), v, s, arrayList0));
        }
        return Boolean.valueOf(CLS243.MTH3636(CLS95.MTH2017(), v, s));
    }

    // 此方法包含解密的字符串
    private void MTH1771(Object[] arr_object) {
        ArrayList arrayList0 = CLS213.MTH3304().MTH3326("\uD8E3lus.options", new Object[0]);
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            SparseArray sparseArray0 = new SparseArray();
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            int v = 0;
            for(Object object0: arrayList0) {
                Pair pair0 = (Pair)object0;
                if(((String)pair0.second).contains("\uD8E3")) {
                    sparseArray0.put(Integer.parseInt(((String)pair0.second).substring(((String)pair0.second).lastIndexOf("\uD8E3") + 1)), pair0);
                }
                else {
                    ++v;
                    sparseArray0.put(v, pair0);
                }
            }
            for(int v1 = 0; v1 < sparseArray0.size(); ++v1) {
                Pair pair1 = (Pair)sparseArray0.valueAt(v1);
                String s = (String)pair1.second;
                if(s.contains("\uD8E3")) {
                    s = s.substring(0, s.lastIndexOf("\uD8E3"));
                }
                linkedHashMap0.put(((String)pair1.first), s);
            }
            if(linkedHashMap0.size() > 1) {
                CLS258.MTH3755(false, this.MTH1580(), "", linkedHashMap0, true, ((CLS110)new CLS588()));
                return;
            }
            CLS213.MTH3304().MTH3320("\uD8E3lus.config", new Object[]{linkedHashMap0.get(new ArrayList(linkedHashMap0.keySet()).get(0))});
        }
    }

    public final void MTH1772() {
        this.FLD369.removeCallbacks(this.FLD394);
        this.FLD369.postDelayed(this.FLD394, 15000L);
        CLS148.MTH2659().MTH2670();
    }

    public static Object MTH1773(Object[] arr_object) {
        return CLS581.MTH1588(arr_object);
    }

    public static Object MTH1774(Object[] arr_object) {
        return CLS581.MTH1770(arr_object);
    }

    // 此方法包含解密的字符串
    public final void MTH1775() {
        try {
            String s = CLS224.MTH3467();
            String s1 = CLS95.MTH1995();
            if(this.FLD370.MTH2725("\uD8E3anual_language_selection", false)) {
                s1 = this.FLD370.MTH2733("\uD8E3urrent_language", s1);
            }
            CLS95.MTH2011(s1, s);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    public static Object MTH1776(Object[] arr_object) {
        return CLS246.MTH3662();
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH1779(Object[] arr_object) {
        if("\uD8E3ettings_welab".equals(((String)arr_object[0])) && CLS95.MTH2031().MTH2725("\uD8E3elab_show_wxmenu", false)) {
            new CLS98(arr_object[1]).MTH2080(Boolean.FALSE);
            CLS213.MTH3304().MTH3321("\uD8E3how_wexposed_main_options", new Object[0]);
        }
    }

    public static Object MTH1780(Object[] arr_object) {
        return CLS581.MTH1595(arr_object);
    }

    public static void MTH1784(Object[] arr_object) {
        CLS144.MTH2583().MTH2604(((CLS142)() -> CLS581.MTH1640()));
    }

    // 此方法包含解密的字符串
    private void MTH1785(Object[] arr_object) {
        Activity activity0 = (Activity)new CLS98(arr_object[0]).MTH2077();
        this.FLD384 = new WeakReference(activity0);
        CLS213.MTH3304().MTH3320("\uD8E3et_current_activity", new Object[]{activity0});
        if(CLS224.MTH3471(activity0).equals(CLS95.MTH2004("\uD8E3auncherUI"))) {
            this.FLD371 = new WeakReference(activity0);
            CLS213.MTH3304().MTH3320("\uD8E3et_launcherui", new Object[]{activity0});
        }
    }

    public final Activity MTH1786() {
        return this.FLD371 == null ? null : ((Activity)this.FLD371.get());
    }

    // 此方法包含解密的字符串
    private void MTH1787(Object[] arr_object) {
        CLS98 ʻᵢ0 = new CLS98(arr_object[0]);
        String s = (String)ʻᵢ0.MTH2078()[0];
        ContentValues contentValues0 = (ContentValues)ʻᵢ0.MTH2078()[1];
        if(!this.MTH1759(s)) {
            return;
        }
        CLS213.MTH3304().MTH3320("\uD8E3.sqldb.update", new Object[]{ʻᵢ0.MTH2079(), 1, s, contentValues0}).MTH3320("\uD8E3.async.sqldb.update", new Object[]{ʻᵢ0.MTH2079(), 1, s, contentValues0});
    }

    public static Object MTH1789(Object[] arr_object) {
        return CLS95.MTH2007();
    }
}


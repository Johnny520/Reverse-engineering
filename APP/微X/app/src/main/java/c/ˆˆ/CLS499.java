// Decompiled by JEB v5.42.0.202606242140

package c.ˆˆ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import c.ˈⁱ.CLS95;
import c.ˋʿ.CLS100;
import c.ˋʿ.CLS102;
import c.ˋʿ.CLS98;
import c.ˋʿ.CLS99;
import c.ˋﹳ.CLS107;
import c.ˋﹳ.CLS111;
import c.ˑʼ.CLS125;
import c.יᴵ.CLS144.CLS142;
import c.יᴵ.CLS144;
import c.יᴵ.CLS147;
import c.יᴵ.CLS148;
import c.יᴵ.CLS156;
import c.יᵢ.CLS157;
import c.ـˉ.CLS170;
import c.ـˉ.CLS171;
import c.ـˉ.CLS179.CLS178;
import c.ـˉ.CLS181;
import c.ـˉ.CLS200;
import c.ـˉ.CLS204;
import c.ـˉ.CLS213;
import c.ـˉ.CLS224;
import c.ـˉ.CLS231;
import c.ـˉ.CLS232;
import c.ـˉ.CLS246;
import c.ـˉ.CLS255.CLS254;
import c.ـˉ.CLS257;
import c.ـˉ.CLS258;
import c.ـˉ.CLS259;
import c.ـˉ.CLS261;
import c.ـˉ.CLS262;
import com.android.xc.Wrapper.XpMethodHook;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public class CLS499 implements CLS63 {
    public final ContentValues FLD282;
    public CLS63 FLD283;
    public final WeakReference FLD284;
    public WeakReference FLD285;
    public boolean FLD286;
    public boolean FLD287;
    public final String FLD288;
    public CLS171 FLD289;
    public WeakReference FLD290;
    public CLS231 FLD291;
    public WeakReference FLD292;

    // 此方法包含解密的字符串
    public CLS499(Context context0, Context context1, ContentValues contentValues0, String s) {
        this.FLD286 = false;
        this.FLD287 = false;
        this.FLD284 = new WeakReference(context0);
        this.FLD282 = contentValues0;
        this.FLD288 = s;
        try {
            if(context1 != null) {
                this.FLD292 = new WeakReference(context1);
            }
            contentValues0.put("\uD8E3oreVersionCode", 209);
            this.FLD291 = new CLS231(contentValues0, context1);
            CLS144.MTH2583().MTH2594(this.FLD291);
            CLS171 ʻˊ0 = new CLS171(context1, this.FLD291.MTH3521());
            this.FLD289 = ʻˊ0;
            ʻˊ0.MTH3018(CLS262.MTH4043(new File(s, "")));
            CLS144.MTH2583().MTH2594(this.FLD289);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // c.ˆˆ.CLS63
    public void altHook(ClassLoader classLoader0) {
        if(!this.MTH1316(classLoader0)) {
            CLS204.MTH3252("\uD8E3x core init failed");
            return;
        }
        if(this.FLD286) {
            this.MTH1308(classLoader0);
            return;
        }
        CLS63 ˆٴ0 = this.FLD283;
        if(ˆٴ0 == null) {
            return;
        }
        ˆٴ0.altHook(classLoader0);
    }

    // 去混淆评级： 低(23)
    // 此方法包含解密的字符串
    public ContentValues getCoreInfo() {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("\uD8E3ersionName", "\uD8E32");
        contentValues0.put("\uD8E3ersionCode", 209);
        contentValues0.put("\uD8E3lavor", "\uD8E3ree");
        contentValues0.put("\uD8E3ype", "\uD8E3elease");
        return contentValues0;
    }

    // 此方法包含解密的字符串
    @Override  // c.ˆˆ.CLS63
    public boolean hook(ClassLoader classLoader0) {
        if(!this.MTH1316(classLoader0)) {
            CLS204.MTH3252("\uD8E3x core init failed");
            return false;
        }
        return this.MTH1307(classLoader0);
    }

    public void setXposed(Class class0, Class class1, Class class2, Class class3, Class class4, Class class5) {
        CLS102.MTH2150(class0);
        CLS102.MTH2148(class1);
        CLS102.MTH2149(class2);
        CLS102.MTH2183(class5);
        CLS102.MTH2184(class4);
        CLS102.MTH2167(class3);
    }

    // 检测为 Lambda 实现
    private void MTH1295() [...]

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    public static boolean MTH1296(Activity activity0, MenuItem menuItem0) [...]

    public static void MTH1297() {
        CLS499.MTH1321();
    }

    // 检测为 Lambda 实现
    public static void MTH1298(Activity activity0) [...]

    public static void MTH1299(Object[] arr_object) {
        CLS144.MTH2583().MTH2604(((CLS142)new CLS584()));
    }

    // 去混淆评级： 低(35)
    // 此方法包含解密的字符串
    public static void MTH1300(Object[] arr_object) {
        boolean z = CLS100.MTH2111(new String[]{"\uD8E3oginAsExDeviceUI"});
        if(!CLS246.MTH3659() && (z || CLS95.MTH2031().MTH2725("\uD8E3orce_tablet_mode_enable", false) && !CLS100.MTH2111(new String[]{"\uD8E3hatFooter", "\uD8E3inderLiveFindPageUI", CLS95.MTH2004("\uD8E3etLivePostBtnVisibleMethod")}))) {
            new CLS98(arr_object[0]).MTH2080(Boolean.TRUE);
        }
    }

    private void MTH1301(Object[] arr_object) {
        CLS144.MTH2583().MTH2604(((CLS142)() -> CLS157.MTH2788().MTH2812(this.MTH1330())));
    }

    // 此方法包含解密的字符串
    public static void MTH1302(Activity activity0) {
        Intent intent0 = new Intent();
        if(!CLS65.MTH1215(CLS95.MTH2004("\uD8E3oginAsExDeviceUI"), intent0)) {
            intent0.setClassName(activity0, CLS95.MTH2004("\uD8E3oginAsExDeviceUI"));
            activity0.startActivity(intent0);
        }
    }

    // 此方法包含解密的字符串
    public final boolean MTH1307(ClassLoader classLoader0) {
        if(this.FLD286) {
            this.MTH1308(classLoader0);
            return true;
        }
        try {
            if(CLS224.MTH3479(this.MTH1327(), CLS95.MTH2014())) {
                CLS204.MTH3252(("\uD8E3odule load disabled: " + CLS95.MTH2014()));
                this.MTH1318(classLoader0, 1);
                return true;
            }
            if(this.FLD283 != null && this.FLD283.hook(classLoader0)) {
                CLS204.MTH3252(("\uD8E3xcore (" + 209 + "\uD8E3 loaded successfully!"));
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        this.MTH1318(classLoader0, 0);
        return true;
    }

    // 此方法包含解密的字符串
    public final void MTH1308(ClassLoader classLoader0) {
        public class CLS494 extends XpMethodHook {
            public final CLS499 FLD273;

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


        public class CLS496 extends XpMethodHook {
            public final CLS499 FLD275;

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                CLS213.MTH3304().MTH3320("\uD8E3fter_Activity_onCreate", new Object[]{object0});
                Activity activity0 = (Activity)new CLS98(object0).MTH2077();
                CLS213.MTH3304().MTH3320("\uD8E3et_current_activity", new Object[]{activity0});
                WeakReference weakReference0 = new WeakReference(activity0);
                CLS499.this.FLD285 = weakReference0;
                String s = CLS224.MTH3471(activity0);
                if(s.endsWith("\uD8E3auncherUI")) {
                    Intent intent0 = activity0.getIntent();
                    if(intent0.hasExtra("\uD8E3otosettings")) {
                        intent0.removeExtra("\uD8E3otosettings");
                        CLS157.MTH2788().MTH2812(activity0);
                    }
                }
                else if(s.endsWith("\uD8E3indMobilePolicyUI")) {
                    if(CLS95.MTH2031().MTH2725("\uD8E3uto_close_bindmobile", true)) {
                        try {
                            activity0.finish();
                            return;
                        label_16:
                            CLS100.MTH2121(CLS100.MTH2130(new String[]{CLS95.MTH2004("\uD8E3ddTextOptionMenu"), "\uD8E3ddTextOptionMenu", "\uD8E3"}, activity0, Void.TYPE, new Object[]{Integer.TYPE, String.class, MenuItem.OnMenuItemClickListener.class}), activity0, new Object[]{2000, "", (MenuItem menuItem0) -> {
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
                }
            }

            // 检测为 Lambda 实现
            public static boolean MTH1284(Activity activity0, MenuItem menuItem0) [...]
        }

        CLS204.MTH3252("\uD8E3nter safe mode");
        CLS144.MTH2583().MTH2608(((CLS142)() -> CLS261.MTH3881().MTH3889(this.MTH1311())), 10000L);
        CLS200.MTH3224().MTH3223(CLS95.MTH2014());
        CLS200.MTH3224().MTH3226();
        Object[] arr_object = {Bundle.class, CLS102.MTH2147(new CLS496(this))};
        CLS102.MTH2172(Activity.class, "\uD8E3nCreate", arr_object);
        Object[] arr_object1 = {CLS102.MTH2147(new CLS494(this))};
        CLS100.MTH2139(File.class, "\uD8E3elete", arr_object1);
        if(!CLS95.MTH2031().MTH2725("\uD8E3ookFail", false)) {
            CLS147.MTH2641().MTH2631();
        }
        CLS213.MTH3304().MTH3296("\uD8E3etCurrentActivity").MTH3314("\uD8E3etCurrentActivity", ((CLS254)new CLS487(this))).MTH3331("\uD8E3howSettingsDialog", ((CLS178)new CLS459(this))).MTH3331("\uD8E3efreshSettings", ((CLS178)new CLS440())).MTH3331("\uD8E3efreshSettingsText,on_update_progress", ((CLS178)new CLS490())).MTH3331("\uD8E3.on_MMActivity_onCreate", ((CLS178)new CLS470())).MTH3331("\uD8E3nIsTabletMethod1", ((CLS178)new CLS450())).MTH3331("\uD8E3.on_chattingUIFragment_onResume,on_MainUI_onResume", ((CLS178)new CLS472()));
        this.MTH1318(classLoader0, 4);
    }

    // 检测为 Lambda 实现
    private void MTH1310() [...]

    public Context MTH1311() {
        return this.FLD292 == null ? null : ((Context)this.FLD292.get());
    }

    public final boolean MTH1316(ClassLoader classLoader0) {
        if(this.FLD287) {
            return true;
        }
        this.FLD287 = true;
        if(this.MTH1336(classLoader0)) {
            try {
                this.MTH1317();
                return true;
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return false;
    }

    public void MTH1317() {
    }

    // 此方法包含解密的字符串
    public final void MTH1318(ClassLoader classLoader0, int v) {
        public class CLS497 extends XpMethodHook {
            public final Class FLD276;
            public final Class FLD277;
            public final int FLD278;
            public final CLS499 FLD279;

            public CLS497(Class class0, Class class1, int v) {
                this.FLD277 = class0;
                this.FLD276 = class1;
                this.FLD278 = v;
                super();
            }

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                CLS98 ʻᵢ0 = new CLS98(object0);
                Activity activity0 = (Activity)ʻᵢ0.MTH2077();
                WeakReference weakReference0 = new WeakReference(activity0);
                CLS499.this.FLD290 = weakReference0;
                Object object1 = ʻᵢ0.MTH2077();
                if(CLS499.this.MTH1342(activity0, this.FLD277, this.FLD276, "\uD8E3X", object1)) {
                    return;
                }
                CLS499.this.MTH1339(activity0, this.FLD278);
            }
        }


        public class CLS498 extends XpMethodHook {
            public final CLS499 FLD280;
            public final int FLD281;

            public CLS498(int v) {
                this.FLD281 = v;
                super();
            }

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                Context context0;
                String s = null;
                Object object1 = new CLS98(object0).MTH2078()[1];
                Activity activity0 = null;
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
                        if(!"\uD8E3X".equals(s)) {
                            return;
                        }
                    }
                    else if(!new HashSet(CLS100.MTH2116(object1, String.class)).contains("\uD8E3X")) {
                        return;
                    }
                    goto label_14;
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                    return;
                }
                return;
                try {
                label_14:
                    context0 = null;
                    if(CLS100.MTH2115(object1, CLS95.MTH2012("\uD8E3ref_getContextMethod", "\uD8E3etContext"))) {
                        context0 = (Context)CLS99.MTH2087(object1, CLS95.MTH2012("\uD8E3ref_getContextMethod", "\uD8E3etContext"), new Object[0]);
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
                    context0 = (Context)CLS100.MTH2113(object1, Context.class);
                }
                catch(Throwable unused_ex) {
                }
                try {
                label_19:
                    activity0 = context0 instanceof Activity ? ((Activity)context0) : ((Activity)CLS499.this.FLD290.get());
                }
                catch(Throwable unused_ex) {
                }
                if(activity0 == null) {
                    return;
                }
                try {
                    CLS499.this.MTH1339(activity0, this.FLD281);
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }

        Class class1;
        String s = this.MTH1327().getPackageName();
        Class class0 = CLS100.MTH2124((s + "\uD8E3plugin.setting.ui.setting.SettingsUI"), classLoader0);
        if(class0 == null) {
            return;
        }
        if(CLS95.MTH1981("\uD8E3MPreferenceVAS")) {
            class1 = CLS147.MTH2641().MTH2642("\uD8E3MPreferenceVAS");
            if(class1 == null) {
                class1 = CLS100.MTH2124((s + "\uD8E3ui.base.preference.MMPreferenceVAS"), classLoader0);
            }
        }
        else {
            class1 = this.FLD291.MTH3511() < 2060 || !CLS100.MTH2137(classLoader0, s + "\uD8E3ui.base.preference.MMPreferenceVAS") ? null : CLS100.MTH2124((s + "\uD8E3ui.base.preference.MMPreferenceVAS"), classLoader0);
            if(class1 == null) {
                class1 = CLS147.MTH2641().MTH2642("\uD8E3MPreference");
            }
        }
        if(class1 == null) {
            class1 = CLS100.MTH2124((s + "\uD8E3ui.base.preference.MMPreference"), classLoader0);
        }
        Class class2 = CLS147.MTH2641().MTH2642("\uD8E3referenceClass");
        if(class2 == null) {
            class2 = CLS100.MTH2124((s + "\uD8E3ui.base.preference.Preference"), classLoader0);
        }
        try {
            new String("\uD8E3X");
            CLS100.MTH2139(class0, "\uD8E3nCreate", new Object[]{Bundle.class, CLS102.MTH2147(new CLS497(this, class1, class2, v))});
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        try {
            Method method0 = CLS100.MTH2125(class0, null, Boolean.TYPE, new Object[]{null, "\uD8E3reference"});
            if(method0 != null) {
                CLS102.MTH2168(method0, CLS102.MTH2147(new CLS498(this, v)));
            }
        }
        catch(Throwable throwable1) {
            CLS204.MTH3257(throwable1);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1320(Object[] arr_object) {
        CLS95.MTH2031().MTH2739("\uD8E3afe_mode");
        CLS95.MTH2031().MTH2739("\uD8E3afe_mode_cnt");
    }

    public static void MTH1321() {
        CLS157.MTH2788().MTH2813();
    }

    public Context MTH1327() {
        return (Context)this.FLD284.get();
    }

    public Activity MTH1330() {
        WeakReference weakReference0 = this.FLD285;
        if(weakReference0 != null) {
            return (Activity)weakReference0.get();
        }
        return this.FLD290 == null ? null : ((Activity)this.FLD290.get());
    }

    public static void MTH1332() {
        CLS95.MTH2023();
        CLS257.MTH3710();
    }

    public static void MTH1333(Object[] arr_object) {
        CLS144.MTH2583().MTH2604(((CLS142)() -> CLS157.MTH2788().MTH2776()));
    }

    // 此方法包含解密的字符串
    public final boolean MTH1336(ClassLoader classLoader0) {
        try {
            if(TextUtils.isEmpty(this.FLD288)) {
                return false;
            }
            CLS95.MTH1992(classLoader0);
            CLS147.MTH2641().MTH2622(classLoader0);
            Context context0 = this.MTH1327();
            SharedPreferences sharedPreferences0 = context0.getSharedPreferences(this.FLD291.MTH3503() + "\uD8E3preferences", 4);
            if(sharedPreferences0 == null) {
                Context context1 = CLS65.MTH1216();
                if(context1 != null) {
                    sharedPreferences0 = context1.getSharedPreferences(this.FLD291.MTH3503() + "\uD8E3preferences", 4);
                    context0 = context1;
                }
            }
            CLS95.MTH1990(sharedPreferences0);
            CLS95.MTH2035(this.MTH1311());
            CLS95.MTH1993(context0);
            CLS224.MTH3459(this.FLD291);
            if(!CLS95.MTH1984(this.FLD288, this.FLD291, context0)) {
                return false;
            }
            CLS148.MTH2659().MTH2665().MTH2668();
            CLS144.MTH2583().MTH2594(new CLS156(context0, true, CLS181.MTH3088((this.FLD289.MTH3014() + "\uD8E3n4hZkF"))));
            CLS147.MTH2641().MTH2637();
            CLS95.MTH2030();
            CLS156 ٴʻ0 = CLS95.MTH2031();
            String s = CLS95.MTH1995();
            if(ٴʻ0.MTH2725("\uD8E3anual_language_selection", false)) {
                s = ٴʻ0.MTH2733("\uD8E3urrent_language", s);
            }
            CLS95.MTH2043(s, this.FLD291.MTH3522());
            CLS261.MTH3881().MTH3970(this.FLD291);
            if(CLS262.MTH4050(CLS261.MTH3881().MTH3978()) && !ٴʻ0.MTH2725("\uD8E3isable_safemode", false)) {
                String s1 = ٴʻ0.MTH2733("\uD8E3afe_mode", "");
                if(!TextUtils.isEmpty(s1)) {
                    long v = System.currentTimeMillis() - Long.parseLong(s1, 16);
                    if(v < 120000L) {
                        int v1 = ٴʻ0.MTH2723("\uD8E3afe_mode_cnt");
                        CLS204.MTH3252(("\uD8E3afe mode fail count: " + v1));
                        CLS204.MTH3252(("\uD8E3afe mode time diff: " + v));
                        if(v > 20000L || v1 >= 3) {
                            this.FLD286 = true;
                        }
                    }
                }
                if(!this.FLD286) {
                    ٴʻ0.MTH2749("\uD8E3afe_mode", Long.toHexString(System.currentTimeMillis()));
                }
            }
            CLS144.MTH2583().MTH2589(((CLS142)() -> CLS148.MTH2659().MTH2666(this.MTH1327())));
            return true;
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return false;
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1337(Activity activity0) {
        String s = CLS224.MTH3462(1);
        if(!TextUtils.isEmpty(s)) {
            CLS258.MTH3769(activity0, "", s, true, true, null);
            CLS224.MTH3458(activity0, s);
            CLS224.MTH3482(activity0, "");
        }
    }

    // 去混淆评级： 低(22)
    // 此方法包含解密的字符串
    public static void MTH1338(Object[] arr_object) {
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
        CLS99.MTH2087(ʻᵢ0.MTH2077(), s1, new Object[]{2000, "", (MenuItem menuItem0) -> // 此方法包含解密的字符串
        {
            CLS125 ʻᵢ0 = new CLS125(activity0);
            if(!CLS246.MTH3659() && CLS95.MTH1981("\uD8E3oginAsExDeviceUI")) {
                ʻᵢ0.MTH2414("\uD8E3ablet_login", ((CLS107)new CLS520(activity0)));
            }
            if(CLS200.MTH3224().MTH3240()) {
                ʻᵢ0.MTH2414("\uD8E3ransfer_advanced", ((CLS107)new CLS508(activity0)));
            }
            ʻᵢ0.MTH2414("\uD8E3estart_wechat", ((CLS107)new CLS510())).MTH2414("\uD8E3eset_module", ((CLS107)new CLS471())).MTH2418();
            return true;
        }});
    }

    // 去混淆评级： 低(29)
    // 此方法包含解密的字符串
    public final void MTH1339(Activity activity0, int v) {
        public class CLS495 implements CLS111 {
            public final CLS499 FLD274;

            // 此方法包含解密的字符串
            @Override  // c.ˋﹳ.CLS111
            public void MTH2286() {
                try {
                    String s = CLS95.MTH2014();
                    JSONArray jSONArray0 = new JSONArray(CLS224.MTH3481(CLS499.this.MTH1327()));
                    JSONArray jSONArray1 = new JSONArray();
                    for(int v = 0; v < jSONArray0.length(); ++v) {
                        JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                        if(!jSONObject0.has("\uD8E3xid") || !s.equals(jSONObject0.getString("\uD8E3xid"))) {
                            jSONArray1.put(jSONObject0);
                        }
                    }
                    CLS224.MTH3453(CLS499.this.MTH1327(), jSONArray1.toString());
                    CLS257.MTH3710();
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2287() {
            }
        }

        if(v == 0) {
            CLS232.MTH3562(activity0, "\uD8E3odule load error", "重置模块\nReset module\uD8E3");
            return;
        }
        switch(v) {
            case 1: {
                CLS258.MTH3803(activity0, "\uD8E3odule load disabled", "开启模块？\nEnable module?", ((CLS111)new CLS495(this)));
                return;
            }
            case 4: {
                CLS95.MTH2031().MTH2739("\uD8E3afe_mode");
                CLS95.MTH2031().MTH2739("\uD8E3afe_mode_cnt");
                CLS157.MTH2788().MTH2812(activity0);
            }
        }
    }

    private Object MTH1340(Object[] arr_object) {
        WeakReference weakReference0 = this.FLD285;
        if(weakReference0 != null) {
            return weakReference0.get();
        }
        return this.FLD290 == null ? null : this.FLD290.get();
    }

    // 检测为 Lambda 实现
    public static void MTH1341() [...]

    // 此方法包含解密的字符串
    public final boolean MTH1342(Activity activity0, Class class0, Class class1, String s, Object object0) {
        int v;
        if(class0 != null && class1 != null) {
            try {
                Object object1 = CLS100.MTH2126(class0, object0, "\uD8E3reference");
                if(object1 == null) {
                    return false;
                }
                Method method0 = CLS100.MTH2117(object1, CLS95.MTH2012("\uD8E3referenceAdapterIndexOfMethod", "\uD8E3ndexOf"), Integer.TYPE, new Object[]{String.class});
                if(method0 == null) {
                    LinkedList linkedList0 = (LinkedList)CLS100.MTH2113(object1, LinkedList.class);
                    v = linkedList0 == null ? -1 : linkedList0.indexOf(s);
                }
                else {
                    v = (int)(((Integer)CLS100.MTH2121(method0, object1, new Object[]{s})));
                }
                if(v != -1) {
                    return false;
                }
                Object object2 = CLS99.MTH2086(class1, new Object[]{activity0});
                CLS99.MTH2087(object2, CLS95.MTH2012("\uD8E3referenceSetTitleMethod", "\uD8E3etTitle"), new Object[]{"\uD8E3"});
                CLS99.MTH2087(object2, CLS95.MTH2012("\uD8E3referenceSetKeyMethod", "\uD8E3etKey"), new Object[]{s});
                CLS99.MTH2087(object1, CLS95.MTH2012("\uD8E3ref_adapter_set", "\uD8E3"), new Object[]{object2, 1});
                return true;
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return false;
    }
}


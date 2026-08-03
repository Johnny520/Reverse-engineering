package com.google.android.material.color;

import Yue.C3605;
import Yue.InterfaceC3811;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7651;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.google.android.material.C1980R;
import com.google.android.material.color.DynamicColorsOptions;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.SchemeContent;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class DynamicColors {
    private static final DeviceSupportCondition DEFAULT_DEVICE_SUPPORT_CONDITION;
    private static final Map<String, DeviceSupportCondition> DYNAMIC_COLOR_SUPPORTED_BRANDS;
    private static final Map<String, DeviceSupportCondition> DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS;
    private static final int[] DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE = {C1980R.attr.dynamicColorThemeOverlay};

    @SuppressLint({"PrivateApi"})
    private static final DeviceSupportCondition SAMSUNG_DEVICE_SUPPORT_CONDITION;
    private static final String TAG;
    private static final int USE_DEFAULT_THEME_OVERLAY = 0;

    public interface DeviceSupportCondition {
        boolean isSupported();
    }

    public static class DynamicColorsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        private final DynamicColorsOptions dynamicColorsOptions;

        public DynamicColorsActivityLifecycleCallbacks(@InterfaceC6391 DynamicColorsOptions dynamicColorsOptions) {
            this.dynamicColorsOptions = dynamicColorsOptions;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@InterfaceC6391 Activity activity, @InterfaceC6490 Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@InterfaceC6391 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@InterfaceC6391 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@InterfaceC6391 Activity activity, @InterfaceC6490 Bundle bundle) {
            DynamicColors.applyToActivityIfAvailable(activity, this.dynamicColorsOptions);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@InterfaceC6391 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@InterfaceC6391 Activity activity, @InterfaceC6391 Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@InterfaceC6391 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@InterfaceC6391 Activity activity) {
        }
    }

    public interface OnAppliedCallback {
        void onApplied(@InterfaceC6391 Activity activity);
    }

    public interface Precondition {
        boolean shouldApplyDynamicColors(@InterfaceC6391 Activity activity, @InterfaceC7651 int i);
    }

    static {
        DeviceSupportCondition deviceSupportCondition = new DeviceSupportCondition() { // from class: com.google.android.material.color.DynamicColors.1
            @Override // com.google.android.material.color.DynamicColors.DeviceSupportCondition
            public boolean isSupported() {
                return true;
            }
        };
        DEFAULT_DEVICE_SUPPORT_CONDITION = deviceSupportCondition;
        DeviceSupportCondition deviceSupportCondition2 = new DeviceSupportCondition() { // from class: com.google.android.material.color.DynamicColors.2
            private Long version;

            @Override // com.google.android.material.color.DynamicColors.DeviceSupportCondition
            public boolean isSupported() {
                if (this.version == null) {
                    try {
                        Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                        declaredMethod.setAccessible(true);
                        Long l = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                        l.longValue();
                        this.version = l;
                    } catch (Exception unused) {
                        this.version = -1L;
                    }
                }
                return this.version.longValue() >= 40100;
            }
        };
        SAMSUNG_DEVICE_SUPPORT_CONDITION = deviceSupportCondition2;
        HashMap map = new HashMap();
        map.put("fcnt", deviceSupportCondition);
        map.put("google", deviceSupportCondition);
        map.put("hmd global", deviceSupportCondition);
        map.put("infinix", deviceSupportCondition);
        map.put("infinix mobility limited", deviceSupportCondition);
        map.put("itel", deviceSupportCondition);
        map.put("kyocera", deviceSupportCondition);
        map.put("lenovo", deviceSupportCondition);
        map.put("lge", deviceSupportCondition);
        map.put("meizu", deviceSupportCondition);
        map.put("motorola", deviceSupportCondition);
        map.put("nothing", deviceSupportCondition);
        map.put("oneplus", deviceSupportCondition);
        map.put("oppo", deviceSupportCondition);
        map.put("realme", deviceSupportCondition);
        map.put("robolectric", deviceSupportCondition);
        map.put("samsung", deviceSupportCondition2);
        map.put("sharp", deviceSupportCondition);
        map.put("shift", deviceSupportCondition);
        map.put("sony", deviceSupportCondition);
        map.put("tcl", deviceSupportCondition);
        map.put("tecno", deviceSupportCondition);
        map.put("tecno mobile limited", deviceSupportCondition);
        map.put("vivo", deviceSupportCondition);
        map.put("wingtech", deviceSupportCondition);
        map.put("xiaomi", deviceSupportCondition);
        DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", deviceSupportCondition);
        map2.put("jio", deviceSupportCondition);
        DYNAMIC_COLOR_SUPPORTED_BRANDS = Collections.unmodifiableMap(map2);
        TAG = DynamicColors.class.getSimpleName();
    }

    private DynamicColors() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void applyIfAvailable(@InterfaceC6391 Activity activity) {
        applyToActivityIfAvailable(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void applyToActivitiesIfAvailable(@InterfaceC6391 Application application) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().build());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void applyToActivityIfAvailable(@InterfaceC6391 Activity activity) {
        applyToActivityIfAvailable(activity, new DynamicColorsOptions.Builder().build());
    }

    private static int getDefaultThemeOverlay(@InterfaceC6391 Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static float getSystemContrast(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager == null || Build.VERSION.SDK_INT < 34) {
            return 0.0f;
        }
        return uiModeManager.getContrast();
    }

    @InterfaceC3811(api = 31)
    @SuppressLint({"DefaultLocale"})
    public static boolean isDynamicColorAvailable() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        if (C3605.m9722()) {
            return true;
        }
        Map<String, DeviceSupportCondition> map = DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.ROOT;
        DeviceSupportCondition deviceSupportCondition = map.get(str.toLowerCase(locale));
        if (deviceSupportCondition == null) {
            deviceSupportCondition = DYNAMIC_COLOR_SUPPORTED_BRANDS.get(Build.BRAND.toLowerCase(locale));
        }
        return deviceSupportCondition != null && deviceSupportCondition.isSupported();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static Context wrapContextIfAvailable(@InterfaceC6391 Context context) {
        return wrapContextIfAvailable(context, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Deprecated
    public static void applyIfAvailable(@InterfaceC6391 Activity activity, @InterfaceC7651 int i) {
        applyToActivityIfAvailable(activity, new DynamicColorsOptions.Builder().setThemeOverlay(i).build());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Deprecated
    public static void applyToActivitiesIfAvailable(@InterfaceC6391 Application application, @InterfaceC7651 int i) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().setThemeOverlay(i).build());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void applyToActivityIfAvailable(@InterfaceC6391 Activity activity, @InterfaceC6391 DynamicColorsOptions dynamicColorsOptions) {
        if (isDynamicColorAvailable()) {
            int defaultThemeOverlay = dynamicColorsOptions.getContentBasedSeedColor() == null ? dynamicColorsOptions.getThemeOverlay() == 0 ? getDefaultThemeOverlay(activity, DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE) : dynamicColorsOptions.getThemeOverlay() : 0;
            if (dynamicColorsOptions.getPrecondition().shouldApplyDynamicColors(activity, defaultThemeOverlay)) {
                if (dynamicColorsOptions.getContentBasedSeedColor() != null) {
                    SchemeContent schemeContent = new SchemeContent(Hct.fromInt(dynamicColorsOptions.getContentBasedSeedColor().intValue()), !MaterialColors.isLightTheme(activity), getSystemContrast(activity));
                    ColorResourcesOverride colorResourcesOverride = ColorResourcesOverride.getInstance();
                    if (colorResourcesOverride == null || !colorResourcesOverride.applyIfPossible(activity, MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues(schemeContent))) {
                        return;
                    }
                } else {
                    ThemeUtils.applyThemeOverlay(activity, defaultThemeOverlay);
                }
                dynamicColorsOptions.getOnAppliedCallback().onApplied(activity);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static Context wrapContextIfAvailable(@InterfaceC6391 Context context, @InterfaceC7651 int i) {
        return wrapContextIfAvailable(context, new DynamicColorsOptions.Builder().setThemeOverlay(i).build());
    }

    @Deprecated
    public static void applyIfAvailable(@InterfaceC6391 Activity activity, @InterfaceC6391 Precondition precondition) {
        applyToActivityIfAvailable(activity, new DynamicColorsOptions.Builder().setPrecondition(precondition).build());
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(@InterfaceC6391 Application application, @InterfaceC6391 Precondition precondition) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().setPrecondition(precondition).build());
    }

    @InterfaceC6391
    public static Context wrapContextIfAvailable(@InterfaceC6391 Context context, @InterfaceC6391 DynamicColorsOptions dynamicColorsOptions) {
        if (!isDynamicColorAvailable()) {
            return context;
        }
        int themeOverlay = dynamicColorsOptions.getThemeOverlay();
        if (themeOverlay == 0) {
            themeOverlay = getDefaultThemeOverlay(context, DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE);
        }
        if (themeOverlay == 0) {
            return context;
        }
        if (dynamicColorsOptions.getContentBasedSeedColor() != null) {
            SchemeContent schemeContent = new SchemeContent(Hct.fromInt(dynamicColorsOptions.getContentBasedSeedColor().intValue()), !MaterialColors.isLightTheme(context), getSystemContrast(context));
            ColorResourcesOverride colorResourcesOverride = ColorResourcesOverride.getInstance();
            if (colorResourcesOverride != null) {
                return colorResourcesOverride.wrapContextIfPossible(context, MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues(schemeContent));
            }
        }
        return new ContextThemeWrapper(context, themeOverlay);
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(@InterfaceC6391 Application application, @InterfaceC7651 int i, @InterfaceC6391 Precondition precondition) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().setThemeOverlay(i).setPrecondition(precondition).build());
    }

    public static void applyToActivitiesIfAvailable(@InterfaceC6391 Application application, @InterfaceC6391 DynamicColorsOptions dynamicColorsOptions) {
        application.registerActivityLifecycleCallbacks(new DynamicColorsActivityLifecycleCallbacks(dynamicColorsOptions));
    }
}

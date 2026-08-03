package com.google.android.material.color;

import Yue.C4187;
import Yue.InterfaceC3811;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.app.UiModeManager$ContrastChangeListener;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ColorContrast {
    private static final float HIGH_CONTRAST_THRESHOLD = 0.6666667f;
    private static final float MEDIUM_CONTRAST_THRESHOLD = 0.33333334f;

    @InterfaceC7113(34)
    public static class ColorContrastActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        private final Set<Activity> activitiesInStack = new LinkedHashSet();
        private final ColorContrastOptions colorContrastOptions;

        @InterfaceC6490
        private UiModeManager$ContrastChangeListener contrastChangeListener;

        public ColorContrastActivityLifecycleCallbacks(ColorContrastOptions colorContrastOptions) {
            this.colorContrastOptions = colorContrastOptions;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@InterfaceC6391 Activity activity, @InterfaceC6490 Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@InterfaceC6391 Activity activity) {
            this.activitiesInStack.remove(activity);
            UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager == null || this.contrastChangeListener == null || !this.activitiesInStack.isEmpty()) {
                return;
            }
            uiModeManager.removeContrastChangeListener(this.contrastChangeListener);
            this.contrastChangeListener = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@InterfaceC6391 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@InterfaceC6391 Activity activity, @InterfaceC6490 Bundle bundle) {
            UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager != null && this.activitiesInStack.isEmpty() && this.contrastChangeListener == null) {
                this.contrastChangeListener = new UiModeManager$ContrastChangeListener() { // from class: com.google.android.material.color.ColorContrast.ColorContrastActivityLifecycleCallbacks.1
                    public void onContrastChanged(float f) {
                        Iterator it = ColorContrastActivityLifecycleCallbacks.this.activitiesInStack.iterator();
                        while (it.hasNext()) {
                            ((Activity) it.next()).recreate();
                        }
                    }
                };
                uiModeManager.addContrastChangeListener(C4187.m12068(activity.getApplicationContext()), this.contrastChangeListener);
            }
            this.activitiesInStack.add(activity);
            if (uiModeManager != null) {
                ColorContrast.applyToActivityIfAvailable(activity, this.colorContrastOptions);
            }
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

    private ColorContrast() {
    }

    public static void applyToActivitiesIfAvailable(@InterfaceC6391 Application application, @InterfaceC6391 ColorContrastOptions colorContrastOptions) {
        if (isContrastAvailable()) {
            application.registerActivityLifecycleCallbacks(new ColorContrastActivityLifecycleCallbacks(colorContrastOptions));
        }
    }

    public static void applyToActivityIfAvailable(@InterfaceC6391 Activity activity, @InterfaceC6391 ColorContrastOptions colorContrastOptions) {
        int contrastThemeOverlayResourceId;
        if (isContrastAvailable() && (contrastThemeOverlayResourceId = getContrastThemeOverlayResourceId(activity, colorContrastOptions)) != 0) {
            ThemeUtils.applyThemeOverlay(activity, contrastThemeOverlayResourceId);
        }
    }

    private static int getContrastThemeOverlayResourceId(Context context, ColorContrastOptions colorContrastOptions) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (isContrastAvailable() && uiModeManager != null) {
            float contrast = uiModeManager.getContrast();
            int mediumContrastThemeOverlay = colorContrastOptions.getMediumContrastThemeOverlay();
            int highContrastThemeOverlay = colorContrastOptions.getHighContrastThemeOverlay();
            if (contrast >= 0.6666667f) {
                return highContrastThemeOverlay == 0 ? mediumContrastThemeOverlay : highContrastThemeOverlay;
            }
            if (contrast >= 0.33333334f) {
                return mediumContrastThemeOverlay == 0 ? highContrastThemeOverlay : mediumContrastThemeOverlay;
            }
        }
        return 0;
    }

    @InterfaceC3811(api = 34)
    public static boolean isContrastAvailable() {
        return Build.VERSION.SDK_INT >= 34;
    }

    @InterfaceC6391
    public static Context wrapContextIfAvailable(@InterfaceC6391 Context context, @InterfaceC6391 ColorContrastOptions colorContrastOptions) {
        int contrastThemeOverlayResourceId;
        return (isContrastAvailable() && (contrastThemeOverlayResourceId = getContrastThemeOverlayResourceId(context, colorContrastOptions)) != 0) ? new ContextThemeWrapper(context, contrastThemeOverlayResourceId) : context;
    }
}

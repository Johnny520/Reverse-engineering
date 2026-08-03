package com.google.android.material.color;

/* JADX INFO: loaded from: classes.dex */
public class ColorContrast {
    private static final float HIGH_CONTRAST_THRESHOLD = 0.6666667f;
    private static final float MEDIUM_CONTRAST_THRESHOLD = 0.33333334f;

    @Yue.InterfaceC5336(34)
    public static class ColorContrastActivityLifecycleCallbacks implements android.app.Application.ActivityLifecycleCallbacks {
        private final java.util.Set<android.app.Activity> activitiesInStack;
        private final com.google.android.material.color.ColorContrastOptions colorContrastOptions;

        @Yue.InterfaceC4544
        private android.app.UiModeManager$ContrastChangeListener contrastChangeListener;


        public ColorContrastActivityLifecycleCallbacks(com.google.android.material.color.ColorContrastOptions r2) {
                r1 = this;
                r1.<init>()
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>()
                r1.activitiesInStack = r0
                r1.colorContrastOptions = r2
                return
        }

        public static /* synthetic */ java.util.Set access$000(com.google.android.material.color.ColorContrast.ColorContrastActivityLifecycleCallbacks r0) {
                java.util.Set<android.app.Activity> r0 = r0.activitiesInStack
                return r0
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@Yue.InterfaceC4410 android.app.Activity r1, @Yue.InterfaceC4544 android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@Yue.InterfaceC4410 android.app.Activity r2) {
                r1 = this;
                java.util.Set<android.app.Activity> r0 = r1.activitiesInStack
                r0.remove(r2)
                java.lang.String r0 = "uimode"
                java.lang.Object r2 = r2.getSystemService(r0)
                android.app.UiModeManager r2 = (android.app.UiModeManager) r2
                if (r2 == 0) goto L23
                android.app.UiModeManager$ContrastChangeListener r0 = r1.contrastChangeListener
                if (r0 == 0) goto L23
                java.util.Set<android.app.Activity> r0 = r1.activitiesInStack
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L23
                android.app.UiModeManager$ContrastChangeListener r0 = r1.contrastChangeListener
                Yue.C1227.m6561(r2, r0)
                r2 = 0
                r1.contrastChangeListener = r2
            L23:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@Yue.InterfaceC4410 android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@Yue.InterfaceC4410 android.app.Activity r3, @Yue.InterfaceC4544 android.os.Bundle r4) {
                r2 = this;
                java.lang.String r4 = "uimode"
                java.lang.Object r4 = r3.getSystemService(r4)
                android.app.UiModeManager r4 = (android.app.UiModeManager) r4
                if (r4 == 0) goto L2a
                java.util.Set<android.app.Activity> r0 = r2.activitiesInStack
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L2a
                android.app.UiModeManager$ContrastChangeListener r0 = r2.contrastChangeListener
                if (r0 != 0) goto L2a
                com.google.android.material.color.ColorContrast$ColorContrastActivityLifecycleCallbacks$1 r0 = new com.google.android.material.color.ColorContrast$ColorContrastActivityLifecycleCallbacks$1
                r0.<init>(r2)
                r2.contrastChangeListener = r0
                android.content.Context r0 = r3.getApplicationContext()
                java.util.concurrent.Executor r0 = Yue.C1584.m7769(r0)
                android.app.UiModeManager$ContrastChangeListener r1 = r2.contrastChangeListener
                Yue.C1228.m6562(r4, r0, r1)
            L2a:
                java.util.Set<android.app.Activity> r0 = r2.activitiesInStack
                r0.add(r3)
                if (r4 == 0) goto L36
                com.google.android.material.color.ColorContrastOptions r4 = r2.colorContrastOptions
                com.google.android.material.color.ColorContrast.applyToActivityIfAvailable(r3, r4)
            L36:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@Yue.InterfaceC4410 android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@Yue.InterfaceC4410 android.app.Activity r1, @Yue.InterfaceC4410 android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@Yue.InterfaceC4410 android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@Yue.InterfaceC4410 android.app.Activity r1) {
                r0 = this;
                return
        }
    }

    private ColorContrast() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void applyToActivitiesIfAvailable(@Yue.InterfaceC4410 android.app.Application r1, @Yue.InterfaceC4410 com.google.android.material.color.ColorContrastOptions r2) {
            boolean r0 = isContrastAvailable()
            if (r0 != 0) goto L7
            return
        L7:
            com.google.android.material.color.ColorContrast$ColorContrastActivityLifecycleCallbacks r0 = new com.google.android.material.color.ColorContrast$ColorContrastActivityLifecycleCallbacks
            r0.<init>(r2)
            r1.registerActivityLifecycleCallbacks(r0)
            return
    }

    public static void applyToActivityIfAvailable(@Yue.InterfaceC4410 android.app.Activity r1, @Yue.InterfaceC4410 com.google.android.material.color.ColorContrastOptions r2) {
            boolean r0 = isContrastAvailable()
            if (r0 != 0) goto L7
            return
        L7:
            int r2 = getContrastThemeOverlayResourceId(r1, r2)
            if (r2 == 0) goto L10
            com.google.android.material.color.ThemeUtils.applyThemeOverlay(r1, r2)
        L10:
            return
    }

    private static int getContrastThemeOverlayResourceId(android.content.Context r3, com.google.android.material.color.ColorContrastOptions r4) {
            java.lang.String r0 = "uimode"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.app.UiModeManager r3 = (android.app.UiModeManager) r3
            boolean r0 = isContrastAvailable()
            r1 = 0
            if (r0 == 0) goto L35
            if (r3 != 0) goto L12
            goto L35
        L12:
            float r3 = Yue.C1226.m6560(r3)
            int r0 = r4.getMediumContrastThemeOverlay()
            int r4 = r4.getHighContrastThemeOverlay()
            r2 = 1059760811(0x3f2aaaab, float:0.6666667)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L2a
            if (r4 != 0) goto L28
            goto L29
        L28:
            r0 = r4
        L29:
            return r0
        L2a:
            r2 = 1051372203(0x3eaaaaab, float:0.33333334)
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 < 0) goto L35
            if (r0 != 0) goto L34
            r0 = r4
        L34:
            return r0
        L35:
            return r1
    }

    @Yue.InterfaceC1123(api = 34)
    public static boolean isContrastAvailable() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Yue.InterfaceC4410
    public static android.content.Context wrapContextIfAvailable(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 com.google.android.material.color.ColorContrastOptions r2) {
            boolean r0 = isContrastAvailable()
            if (r0 != 0) goto L7
            return r1
        L7:
            int r2 = getContrastThemeOverlayResourceId(r1, r2)
            if (r2 != 0) goto Le
            return r1
        Le:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r1, r2)
            return r0
    }
}

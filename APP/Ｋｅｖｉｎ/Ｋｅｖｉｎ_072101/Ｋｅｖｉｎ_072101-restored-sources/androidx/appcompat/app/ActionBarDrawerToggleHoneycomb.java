package androidx.appcompat.app;

/* JADX INFO: loaded from: classes2.dex */
class ActionBarDrawerToggleHoneycomb {
    private static final java.lang.String TAG = "ActionBarDrawerToggleHC";
    private static final int[] THEME_ATTRS = null;

    static class SetIndicatorInfo {
        public java.lang.reflect.Method setHomeActionContentDescription;
        public java.lang.reflect.Method setHomeAsUpIndicator;
        public android.widget.ImageView upIndicatorView;

        SetIndicatorInfo(android.app.Activity r8) {
                r7 = this;
                r7.<init>()
                java.lang.Class<android.app.ActionBar> r0 = android.app.ActionBar.class
                java.lang.String r1 = "setHomeAsUpIndicator"
                java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
                java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.NoSuchMethodException -> L24
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L24
                r7.setHomeAsUpIndicator = r0     // Catch: java.lang.NoSuchMethodException -> L24
                java.lang.Class<android.app.ActionBar> r0 = android.app.ActionBar.class
                java.lang.String r1 = "setHomeActionContentDescription"
                java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L24
                java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.NoSuchMethodException -> L24
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L24
                r7.setHomeActionContentDescription = r0     // Catch: java.lang.NoSuchMethodException -> L24
                return
            L24:
                r0 = move-exception
                r0 = 16908332(0x102002c, float:2.3877352E-38)
                android.view.View r1 = r8.findViewById(r0)
                if (r1 != 0) goto L2f
                return
            L2f:
                android.view.ViewParent r2 = r1.getParent()
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                int r3 = r2.getChildCount()
                r4 = 2
                if (r3 == r4) goto L3d
                return
            L3d:
                r4 = 0
                android.view.View r4 = r2.getChildAt(r4)
                r5 = 1
                android.view.View r5 = r2.getChildAt(r5)
                int r6 = r4.getId()
                if (r6 != r0) goto L4f
                r0 = r5
                goto L50
            L4f:
                r0 = r4
            L50:
                boolean r6 = r0 instanceof android.widget.ImageView
                if (r6 == 0) goto L59
                r6 = r0
                android.widget.ImageView r6 = (android.widget.ImageView) r6
                r7.upIndicatorView = r6
            L59:
                return
        }
    }

    static {
            r0 = 16843531(0x101030b, float:2.369574E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.app.ActionBarDrawerToggleHoneycomb.THEME_ATTRS = r0
            return
    }

    private ActionBarDrawerToggleHoneycomb() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.drawable.Drawable getThemeUpIndicator(android.app.Activity r2) {
            int[] r0 = androidx.appcompat.app.ActionBarDrawerToggleHoneycomb.THEME_ATTRS
            android.content.res.TypedArray r0 = r2.obtainStyledAttributes(r0)
            r1 = 0
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r1)
            r0.recycle()
            return r1
    }

    public static androidx.appcompat.app.ActionBarDrawerToggleHoneycomb.SetIndicatorInfo setActionBarDescription(androidx.appcompat.app.ActionBarDrawerToggleHoneycomb.SetIndicatorInfo r3, android.app.Activity r4, int r5) {
            if (r3 != 0) goto L8
            androidx.appcompat.app.ActionBarDrawerToggleHoneycomb$SetIndicatorInfo r0 = new androidx.appcompat.app.ActionBarDrawerToggleHoneycomb$SetIndicatorInfo
            r0.<init>(r4)
            r3 = r0
        L8:
            java.lang.reflect.Method r0 = r3.setHomeAsUpIndicator
            if (r0 == 0) goto L27
            android.app.ActionBar r0 = r4.getActionBar()     // Catch: java.lang.Exception -> L1f
            java.lang.reflect.Method r1 = r3.setHomeActionContentDescription     // Catch: java.lang.Exception -> L1f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L1f
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L1f
            r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L1f
            goto L27
        L1f:
            r0 = move-exception
            java.lang.String r1 = "ActionBarDrawerToggleHC"
            java.lang.String r2 = "Couldn't set content description via JB-MR2 API"
            android.util.Log.w(r1, r2, r0)
        L27:
            return r3
    }

    public static androidx.appcompat.app.ActionBarDrawerToggleHoneycomb.SetIndicatorInfo setActionBarUpIndicator(android.app.Activity r5, android.graphics.drawable.Drawable r6, int r7) {
            androidx.appcompat.app.ActionBarDrawerToggleHoneycomb$SetIndicatorInfo r0 = new androidx.appcompat.app.ActionBarDrawerToggleHoneycomb$SetIndicatorInfo
            r0.<init>(r5)
            java.lang.reflect.Method r1 = r0.setHomeAsUpIndicator
            java.lang.String r2 = "ActionBarDrawerToggleHC"
            if (r1 == 0) goto L2e
            android.app.ActionBar r1 = r5.getActionBar()     // Catch: java.lang.Exception -> L27
            java.lang.reflect.Method r3 = r0.setHomeAsUpIndicator     // Catch: java.lang.Exception -> L27
            java.lang.Object[] r4 = new java.lang.Object[]{r6}     // Catch: java.lang.Exception -> L27
            r3.invoke(r1, r4)     // Catch: java.lang.Exception -> L27
            java.lang.reflect.Method r3 = r0.setHomeActionContentDescription     // Catch: java.lang.Exception -> L27
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L27
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L27
            r3.invoke(r1, r4)     // Catch: java.lang.Exception -> L27
            goto L3d
        L27:
            r1 = move-exception
            java.lang.String r3 = "Couldn't set home-as-up indicator via JB-MR2 API"
            android.util.Log.w(r2, r3, r1)
            goto L3d
        L2e:
            android.widget.ImageView r1 = r0.upIndicatorView
            if (r1 == 0) goto L38
            android.widget.ImageView r1 = r0.upIndicatorView
            r1.setImageDrawable(r6)
            goto L3d
        L38:
            java.lang.String r1 = "Couldn't set home-as-up indicator"
            android.util.Log.w(r2, r1)
        L3d:
            return r0
    }
}

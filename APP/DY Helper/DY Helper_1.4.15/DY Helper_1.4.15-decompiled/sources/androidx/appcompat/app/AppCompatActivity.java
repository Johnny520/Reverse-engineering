package androidx.appcompat.app;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends androidx.fragment.app.FragmentActivity implements p000.InterfaceC0674p4 {

    /* JADX INFO: renamed from: Ε */
    public androidx.appcompat.app.LayoutInflaterFactory2C0026 f358;

    public AppCompatActivity() {
            r3 = this;
            r3.<init>()
            n5 r0 = r3.f343
            java.lang.Object r0 = r0.f7388
            n5 r0 = (p000.C0574n5) r0
            m4 r1 = new m4
            r1.<init>(r3)
            java.lang.String r2 = "androidx:appcompat"
            r0.m3974(r2, r1)
            n4 r0 = new n4
            r0.<init>(r3)
            r3.m194(r0)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.m196()
            androidx.appcompat.app.α r2 = r2.m197()
            androidx.appcompat.app.β r2 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r2
            r2.m229()
            android.view.ViewGroup r0 = r2.f379
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r3, r4)
            d5 r3 = r2.f400
            android.view.Window r2 = r2.f399
            android.view.Window$Callback r2 = r2.getCallback()
            r3.m1649(r2)
            return
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context r9) {
            r8 = this;
            androidx.appcompat.app.α r0 = r8.m197()
            androidx.appcompat.app.β r0 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r0
            r1 = 1
            r0.f393 = r1
            int r2 = r0.f408
            r3 = -100
            if (r2 == r3) goto L10
            goto L12
        L10:
            int r2 = androidx.appcompat.app.AbstractC0025.f362
        L12:
            int r0 = r0.m213(r9, r2)
            boolean r2 = androidx.appcompat.app.AbstractC0025.m198(r9)
            r3 = 0
            if (r2 == 0) goto L7f
            boolean r2 = androidx.appcompat.app.AbstractC0025.m198(r9)
            if (r2 != 0) goto L24
            goto L7f
        L24:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r2 < r4) goto L39
            boolean r2 = androidx.appcompat.app.AbstractC0025.f366
            if (r2 != 0) goto L7f
            u4 r2 = androidx.appcompat.app.AbstractC0025.f361
            r4 r4 = new r4
            r4.<init>(r9, r3)
            r2.execute(r4)
            goto L7f
        L39:
            java.lang.Object r2 = androidx.appcompat.app.AbstractC0025.f369
            monitor-enter(r2)
            cv0 r4 = androidx.appcompat.app.AbstractC0025.f363     // Catch: java.lang.Throwable -> L4f
            if (r4 != 0) goto L64
            cv0 r4 = androidx.appcompat.app.AbstractC0025.f364     // Catch: java.lang.Throwable -> L4f
            if (r4 != 0) goto L51
            java.lang.String r4 = p000.AbstractC1021yh.m6908(r9)     // Catch: java.lang.Throwable -> L4f
            cv0 r4 = p000.cv0.m1616(r4)     // Catch: java.lang.Throwable -> L4f
            androidx.appcompat.app.AbstractC0025.f364 = r4     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r8 = move-exception
            goto L7d
        L51:
            cv0 r4 = androidx.appcompat.app.AbstractC0025.f364     // Catch: java.lang.Throwable -> L4f
            dv0 r4 = r4.f2779     // Catch: java.lang.Throwable -> L4f
            android.os.LocaleList r4 = r4.f3300     // Catch: java.lang.Throwable -> L4f
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4f
            if (r4 == 0) goto L5f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4f
            goto L7f
        L5f:
            cv0 r4 = androidx.appcompat.app.AbstractC0025.f364     // Catch: java.lang.Throwable -> L4f
            androidx.appcompat.app.AbstractC0025.f363 = r4     // Catch: java.lang.Throwable -> L4f
            goto L7b
        L64:
            cv0 r5 = androidx.appcompat.app.AbstractC0025.f364     // Catch: java.lang.Throwable -> L4f
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L4f
            if (r4 != 0) goto L7b
            cv0 r4 = androidx.appcompat.app.AbstractC0025.f363     // Catch: java.lang.Throwable -> L4f
            androidx.appcompat.app.AbstractC0025.f364 = r4     // Catch: java.lang.Throwable -> L4f
            dv0 r4 = r4.f2779     // Catch: java.lang.Throwable -> L4f
            android.os.LocaleList r4 = r4.f3300     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = r4.toLanguageTags()     // Catch: java.lang.Throwable -> L4f
            p000.AbstractC1021yh.m6903(r9, r4)     // Catch: java.lang.Throwable -> L4f
        L7b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4f
            goto L7f
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4f
            throw r8
        L7f:
            cv0 r2 = androidx.appcompat.app.LayoutInflaterFactory2C0026.m208(r9)
            boolean r4 = r9 instanceof android.view.ContextThemeWrapper
            r5 = 0
            if (r4 == 0) goto L94
            android.content.res.Configuration r4 = androidx.appcompat.app.LayoutInflaterFactory2C0026.m209(r9, r0, r2, r5, r3)
            r6 = r9
            android.view.ContextThemeWrapper r6 = (android.view.ContextThemeWrapper) r6     // Catch: java.lang.IllegalStateException -> L94
            r6.applyOverrideConfiguration(r4)     // Catch: java.lang.IllegalStateException -> L94
            goto L1e4
        L94:
            boolean r4 = r9 instanceof p000.C0594np
            if (r4 == 0) goto La4
            android.content.res.Configuration r3 = androidx.appcompat.app.LayoutInflaterFactory2C0026.m209(r9, r0, r2, r5, r3)
            r4 = r9
            np r4 = (p000.C0594np) r4     // Catch: java.lang.IllegalStateException -> La4
            r4.m4086(r3)     // Catch: java.lang.IllegalStateException -> La4
            goto L1e4
        La4:
            boolean r3 = androidx.appcompat.app.LayoutInflaterFactory2C0026.f372
            if (r3 != 0) goto Laa
            goto L1e4
        Laa:
            android.content.res.Configuration r3 = new android.content.res.Configuration
            r3.<init>()
            r4 = -1
            r3.uiMode = r4
            r4 = 0
            r3.fontScale = r4
            android.content.Context r3 = r9.createConfigurationContext(r3)
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            android.content.res.Resources r6 = r9.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r7 = r6.uiMode
            r3.uiMode = r7
            boolean r7 = r3.equals(r6)
            if (r7 != 0) goto L1c7
            android.content.res.Configuration r5 = new android.content.res.Configuration
            r5.<init>()
            r5.fontScale = r4
            int r4 = r3.diff(r6)
            if (r4 != 0) goto Le2
            goto L1c7
        Le2:
            float r4 = r3.fontScale
            float r7 = r6.fontScale
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 == 0) goto Lec
            r5.fontScale = r7
        Lec:
            int r4 = r3.mcc
            int r7 = r6.mcc
            if (r4 == r7) goto Lf4
            r5.mcc = r7
        Lf4:
            int r4 = r3.mnc
            int r7 = r6.mnc
            if (r4 == r7) goto Lfc
            r5.mnc = r7
        Lfc:
            p000.AbstractC0006a5.m33(r3, r6, r5)
            int r4 = r3.touchscreen
            int r7 = r6.touchscreen
            if (r4 == r7) goto L107
            r5.touchscreen = r7
        L107:
            int r4 = r3.keyboard
            int r7 = r6.keyboard
            if (r4 == r7) goto L10f
            r5.keyboard = r7
        L10f:
            int r4 = r3.keyboardHidden
            int r7 = r6.keyboardHidden
            if (r4 == r7) goto L117
            r5.keyboardHidden = r7
        L117:
            int r4 = r3.navigation
            int r7 = r6.navigation
            if (r4 == r7) goto L11f
            r5.navigation = r7
        L11f:
            int r4 = r3.navigationHidden
            int r7 = r6.navigationHidden
            if (r4 == r7) goto L127
            r5.navigationHidden = r7
        L127:
            int r4 = r3.orientation
            int r7 = r6.orientation
            if (r4 == r7) goto L12f
            r5.orientation = r7
        L12f:
            int r4 = r3.screenLayout
            r4 = r4 & 15
            int r7 = r6.screenLayout
            r7 = r7 & 15
            if (r4 == r7) goto L13e
            int r4 = r5.screenLayout
            r4 = r4 | r7
            r5.screenLayout = r4
        L13e:
            int r4 = r3.screenLayout
            r4 = r4 & 192(0xc0, float:2.69E-43)
            int r7 = r6.screenLayout
            r7 = r7 & 192(0xc0, float:2.69E-43)
            if (r4 == r7) goto L14d
            int r4 = r5.screenLayout
            r4 = r4 | r7
            r5.screenLayout = r4
        L14d:
            int r4 = r3.screenLayout
            r4 = r4 & 48
            int r7 = r6.screenLayout
            r7 = r7 & 48
            if (r4 == r7) goto L15c
            int r4 = r5.screenLayout
            r4 = r4 | r7
            r5.screenLayout = r4
        L15c:
            int r4 = r3.screenLayout
            r4 = r4 & 768(0x300, float:1.076E-42)
            int r7 = r6.screenLayout
            r7 = r7 & 768(0x300, float:1.076E-42)
            if (r4 == r7) goto L16b
            int r4 = r5.screenLayout
            r4 = r4 | r7
            r5.screenLayout = r4
        L16b:
            int r4 = r3.colorMode
            r4 = r4 & 3
            int r7 = r6.colorMode
            r7 = r7 & 3
            if (r4 == r7) goto L17a
            int r4 = r5.colorMode
            r4 = r4 | r7
            r5.colorMode = r4
        L17a:
            int r4 = r3.colorMode
            r4 = r4 & 12
            int r7 = r6.colorMode
            r7 = r7 & 12
            if (r4 == r7) goto L189
            int r4 = r5.colorMode
            r4 = r4 | r7
            r5.colorMode = r4
        L189:
            int r4 = r3.uiMode
            r4 = r4 & 15
            int r7 = r6.uiMode
            r7 = r7 & 15
            if (r4 == r7) goto L198
            int r4 = r5.uiMode
            r4 = r4 | r7
            r5.uiMode = r4
        L198:
            int r4 = r3.uiMode
            r4 = r4 & 48
            int r7 = r6.uiMode
            r7 = r7 & 48
            if (r4 == r7) goto L1a7
            int r4 = r5.uiMode
            r4 = r4 | r7
            r5.uiMode = r4
        L1a7:
            int r4 = r3.screenWidthDp
            int r7 = r6.screenWidthDp
            if (r4 == r7) goto L1af
            r5.screenWidthDp = r7
        L1af:
            int r4 = r3.screenHeightDp
            int r7 = r6.screenHeightDp
            if (r4 == r7) goto L1b7
            r5.screenHeightDp = r7
        L1b7:
            int r4 = r3.smallestScreenWidthDp
            int r7 = r6.smallestScreenWidthDp
            if (r4 == r7) goto L1bf
            r5.smallestScreenWidthDp = r7
        L1bf:
            int r3 = r3.densityDpi
            int r4 = r6.densityDpi
            if (r3 == r4) goto L1c7
            r5.densityDpi = r4
        L1c7:
            android.content.res.Configuration r0 = androidx.appcompat.app.LayoutInflaterFactory2C0026.m209(r9, r0, r2, r5, r1)
            np r1 = new np
            r2 = 2131755288(0x7f100118, float:1.9141451E38)
            r1.<init>(r9, r2)
            r1.m4086(r0)
            android.content.res.Resources$Theme r9 = r9.getTheme()     // Catch: java.lang.NullPointerException -> L1e3
            if (r9 == 0) goto L1e3
            android.content.res.Resources$Theme r9 = r1.getTheme()
            r9.rebase()
        L1e3:
            r9 = r1
        L1e4:
            super.attachBaseContext(r9)
            return
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
            r2 = this;
            androidx.appcompat.app.α r0 = r2.m197()
            androidx.appcompat.app.β r0 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r0
            r0.m211()
            android.view.Window r0 = r2.getWindow()
            r1 = 0
            boolean r0 = r0.hasFeature(r1)
            if (r0 == 0) goto L17
            super.closeOptionsMenu()
        L17:
            return
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            r2.getKeyCode()
            androidx.appcompat.app.α r0 = r1.m197()
            androidx.appcompat.app.β r0 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r0
            r0.m211()
            boolean r1 = super.dispatchKeyEvent(r2)
            return r1
    }

    @Override // android.app.Activity
    public final android.view.View findViewById(int r1) {
            r0 = this;
            androidx.appcompat.app.α r0 = r0.m197()
            androidx.appcompat.app.β r0 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r0
            r0.m229()
            android.view.Window r0 = r0.f399
            android.view.View r0 = r0.findViewById(r1)
            return r0
    }

    @Override // android.app.Activity
    public final android.view.MenuInflater getMenuInflater() {
            r2 = this;
            androidx.appcompat.app.α r2 = r2.m197()
            androidx.appcompat.app.β r2 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r2
            s12 r0 = r2.f403
            if (r0 != 0) goto L1f
            r2.m211()
            s12 r0 = new s12
            tb2 r1 = r2.f402
            if (r1 == 0) goto L18
            android.content.Context r1 = r1.m5624()
            goto L1a
        L18:
            android.content.Context r1 = r2.f398
        L1a:
            r0.<init>(r1)
            r2.f403 = r0
        L1f:
            s12 r2 = r2.f403
            return r2
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources getResources() {
            r1 = this;
            int r0 = p000.k72.f5789
            android.content.res.Resources r1 = super.getResources()
            return r1
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
            r1 = this;
            androidx.appcompat.app.α r1 = r1.m197()
            androidx.appcompat.app.β r1 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r1
            tb2 r0 = r1.f402
            if (r0 == 0) goto L16
            r1.m211()
            tb2 r0 = r1.f402
            r0.getClass()
            r0 = 0
            r1.m212(r0)
        L16:
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration r4) {
            r3 = this;
            super.onConfigurationChanged(r4)
            androidx.appcompat.app.α r3 = r3.m197()
            androidx.appcompat.app.β r3 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r3
            boolean r4 = r3.f384
            if (r4 == 0) goto L2d
            boolean r4 = r3.f378
            if (r4 == 0) goto L2d
            r3.m211()
            tb2 r4 = r3.f402
            if (r4 == 0) goto L2d
            android.content.Context r0 = r4.f10279
            ｍ r0 = p000.C1143.m7359(r0)
            android.content.Context r0 = r0.f13489
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131034112(0x7f050000, float:1.7678732E38)
            boolean r0 = r0.getBoolean(r1)
            r4.m5627(r0)
        L2d:
            j5 r4 = p000.C0419j5.m2862()
            android.content.Context r0 = r3.f398
            monitor-enter(r4)
            tn1 r1 = r4.f5322     // Catch: java.lang.Throwable -> L61
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L61
            java.util.WeakHashMap r2 = r1.f10424     // Catch: java.lang.Throwable -> L45
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Throwable -> L45
            zv0 r0 = (p000.zv0) r0     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L47
            r0.m7233()     // Catch: java.lang.Throwable -> L45
            goto L47
        L45:
            r3 = move-exception
            goto L5f
        L47:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r4)
            android.content.res.Configuration r4 = new android.content.res.Configuration
            android.content.Context r0 = r3.f398
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            r4.<init>(r0)
            r3.f396 = r4
            r4 = 0
            r3.m222(r4, r4)
            return
        L5f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            throw r3     // Catch: java.lang.Throwable -> L61
        L61:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L61
            throw r3
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
            r0 = this;
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
            r0 = this;
            super.onDestroy()
            androidx.appcompat.app.α r0 = r0.m197()
            r0.mo202()
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int r5, android.view.MenuItem r6) {
            r4 = this;
            boolean r5 = super.onMenuItemSelected(r5, r6)
            r0 = 1
            if (r5 == 0) goto L9
            goto La6
        L9:
            androidx.appcompat.app.α r5 = r4.m197()
            androidx.appcompat.app.β r5 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r5
            r5.m211()
            tb2 r5 = r5.f402
            int r6 = r6.getItemId()
            r1 = 16908332(0x102002c, float:2.3877352E-38)
            r2 = 0
            if (r6 != r1) goto Lb2
            if (r5 == 0) goto Lb2
            yq r5 = r5.f10283
            b52 r5 = (p000.b52) r5
            int r5 = r5.f1485
            r5 = r5 & 4
            if (r5 == 0) goto Lb2
            android.content.Intent r5 = p000.AbstractC1021yh.m6859(r4)
            if (r5 == 0) goto Lb2
            boolean r6 = r4.shouldUpRecreateTask(r5)
            if (r6 == 0) goto Lae
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            android.content.Intent r6 = p000.AbstractC1021yh.m6859(r4)
            if (r6 != 0) goto L45
            android.content.Intent r6 = p000.AbstractC1021yh.m6859(r4)
        L45:
            if (r6 == 0) goto L7d
            android.content.ComponentName r1 = r6.getComponent()
            if (r1 != 0) goto L55
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            android.content.ComponentName r1 = r6.resolveActivity(r1)
        L55:
            int r3 = r5.size()
            android.content.Intent r1 = p000.AbstractC1021yh.m6860(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
        L5d:
            if (r1 == 0) goto L6b
            r5.add(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            android.content.ComponentName r1 = r1.getComponent()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            android.content.Intent r1 = p000.AbstractC1021yh.m6860(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            goto L5d
        L6b:
            r5.add(r6)
            goto L7d
        L6f:
            r4 = move-exception
            java.lang.String r5 = "TaskStackBuilder"
            java.lang.String r6 = "Bad ComponentName while traversing activity parent metadata"
            android.util.Log.e(r5, r6)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r4)
            throw r5
        L7d:
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto La7
            android.content.Intent[] r6 = new android.content.Intent[r2]
            java.lang.Object[] r5 = r5.toArray(r6)
            android.content.Intent[] r5 = (android.content.Intent[]) r5
            android.content.Intent r6 = new android.content.Intent
            r1 = r5[r2]
            r6.<init>(r1)
            r1 = 268484608(0x1000c000, float:2.539146E-29)
            android.content.Intent r6 = r6.addFlags(r1)
            r5[r2] = r6
            r6 = 0
            r4.startActivities(r5, r6)
            r4.finishAffinity()     // Catch: java.lang.IllegalStateException -> La3
            goto La6
        La3:
            r4.finish()
        La6:
            return r0
        La7:
            java.lang.String r4 = "No intents added to TaskStackBuilder; cannot startActivities"
            p000.C1080.m7279(r4)
            r4 = 0
            return r4
        Lae:
            r4.navigateUpTo(r5)
            return r0
        Lb2:
            return r2
    }

    @Override // android.app.Activity
    public final void onPostCreate(android.os.Bundle r1) {
            r0 = this;
            super.onPostCreate(r1)
            androidx.appcompat.app.α r0 = r0.m197()
            androidx.appcompat.app.β r0 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r0
            r0.m229()
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
            r1 = this;
            super.onPostResume()
            androidx.appcompat.app.α r1 = r1.m197()
            androidx.appcompat.app.β r1 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r1
            r1.m211()
            tb2 r1 = r1.f402
            if (r1 == 0) goto L13
            r0 = 1
            r1.f10298 = r0
        L13:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
            r2 = this;
            super.onStart()
            androidx.appcompat.app.α r2 = r2.m197()
            androidx.appcompat.app.β r2 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r2
            r0 = 1
            r1 = 0
            r2.m222(r0, r1)
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
            r1 = this;
            super.onStop()
            androidx.appcompat.app.α r1 = r1.m197()
            androidx.appcompat.app.β r1 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r1
            r1.m211()
            tb2 r1 = r1.f402
            if (r1 == 0) goto L1a
            r0 = 0
            r1.f10298 = r0
            y92 r1 = r1.f10297
            if (r1 == 0) goto L1a
            r1.m6841()
        L1a:
            return
    }

    @Override // android.app.Activity
    public final void onTitleChanged(java.lang.CharSequence r1, int r2) {
            r0 = this;
            super.onTitleChanged(r1, r2)
            androidx.appcompat.app.α r0 = r0.m197()
            r0.mo207(r1)
            return
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
            r2 = this;
            androidx.appcompat.app.α r0 = r2.m197()
            androidx.appcompat.app.β r0 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r0
            r0.m211()
            android.view.Window r0 = r2.getWindow()
            r1 = 0
            boolean r0 = r0.hasFeature(r1)
            if (r0 == 0) goto L17
            super.openOptionsMenu()
        L17:
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int r1) {
            r0 = this;
            r0.m196()
            androidx.appcompat.app.α r0 = r0.m197()
            r0.mo204(r1)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View r1) {
            r0 = this;
            r0.m196()
            androidx.appcompat.app.α r0 = r0.m197()
            r0.mo205(r1)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r0.m196()
            androidx.appcompat.app.α r0 = r0.m197()
            r0.mo206(r1, r2)
            return
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int r1) {
            r0 = this;
            super.setTheme(r1)
            androidx.appcompat.app.α r0 = r0.m197()
            androidx.appcompat.app.β r0 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r0
            r0.f409 = r1
            return
    }

    /* JADX INFO: renamed from: λ */
    public final androidx.appcompat.app.AbstractC0025 m197() {
            r2 = this;
            androidx.appcompat.app.β r0 = r2.f358
            if (r0 != 0) goto Le
            u4 r0 = androidx.appcompat.app.AbstractC0025.f361
            androidx.appcompat.app.β r0 = new androidx.appcompat.app.β
            r1 = 0
            r0.<init>(r2, r1, r2, r2)
            r2.f358 = r0
        Le:
            androidx.appcompat.app.β r2 = r2.f358
            return r2
    }
}

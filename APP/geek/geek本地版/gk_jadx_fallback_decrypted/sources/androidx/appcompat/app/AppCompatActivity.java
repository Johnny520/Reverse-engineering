package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends androidx.fragment.app.FragmentActivity implements defpackage.x2 {
    public defpackage.r3 x;

    public AppCompatActivity() {
            r3 = this;
            r3.<init>()
            gm r0 = r3.e
            java.lang.Object r0 = r0.c
            a3 r0 = (defpackage.a3) r0
            s2 r1 = new s2
            r2 = 0
            r1.<init>(r3, r2)
            java.lang.String r2 = "androidx:appcompat"
            r0.e(r2, r1)
            t2 r0 = new t2
            r1 = 0
            r0.<init>(r3, r1)
            r3.h(r0)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(android.view.View r4, android.view.ViewGroup.LayoutParams r5) {
            r3 = this;
            r3.m()
            e3 r0 = r3.l()
            r3 r0 = (defpackage.r3) r0
            r0.w()
            android.view.ViewGroup r1 = r0.A
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r1.findViewById(r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.addView(r4, r5)
            l3 r4 = r0.m
            android.view.Window r5 = r0.l
            android.view.Window$Callback r5 = r5.getCallback()
            r4.a(r5)
            return
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context r11) {
            r10 = this;
            e3 r0 = r10.l()
            r3 r0 = (defpackage.r3) r0
            r1 = 1
            r0.O = r1
            int r2 = r0.S
            r3 = -100
            if (r2 == r3) goto L10
            goto L12
        L10:
            int r2 = defpackage.e3.b
        L12:
            int r0 = r0.C(r11, r2)
            boolean r2 = defpackage.e3.c(r11)
            r3 = 0
            if (r2 == 0) goto L7f
            boolean r2 = defpackage.e3.c(r11)
            if (r2 != 0) goto L24
            goto L7f
        L24:
            boolean r2 = defpackage.ip.A()
            if (r2 == 0) goto L39
            boolean r2 = defpackage.e3.f
            if (r2 != 0) goto L7f
            u5 r2 = defpackage.e3.a
            b3 r4 = new b3
            r4.<init>(r11, r3)
            r2.execute(r4)
            goto L7f
        L39:
            java.lang.Object r2 = defpackage.e3.i
            monitor-enter(r2)
            sr r4 = defpackage.e3.c     // Catch: java.lang.Throwable -> L4f
            if (r4 != 0) goto L64
            sr r4 = defpackage.e3.d     // Catch: java.lang.Throwable -> L4f
            if (r4 != 0) goto L51
            java.lang.String r4 = defpackage.ip.L(r11)     // Catch: java.lang.Throwable -> L4f
            sr r4 = defpackage.sr.a(r4)     // Catch: java.lang.Throwable -> L4f
            defpackage.e3.d = r4     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r11 = move-exception
            goto L7d
        L51:
            sr r4 = defpackage.e3.d     // Catch: java.lang.Throwable -> L4f
            tr r4 = r4.a     // Catch: java.lang.Throwable -> L4f
            android.os.LocaleList r4 = r4.a     // Catch: java.lang.Throwable -> L4f
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4f
            if (r4 == 0) goto L5f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4f
            goto L7f
        L5f:
            sr r4 = defpackage.e3.d     // Catch: java.lang.Throwable -> L4f
            defpackage.e3.c = r4     // Catch: java.lang.Throwable -> L4f
            goto L7b
        L64:
            sr r5 = defpackage.e3.d     // Catch: java.lang.Throwable -> L4f
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L4f
            if (r4 != 0) goto L7b
            sr r4 = defpackage.e3.c     // Catch: java.lang.Throwable -> L4f
            defpackage.e3.d = r4     // Catch: java.lang.Throwable -> L4f
            tr r4 = r4.a     // Catch: java.lang.Throwable -> L4f
            android.os.LocaleList r4 = r4.a     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = r4.toLanguageTags()     // Catch: java.lang.Throwable -> L4f
            defpackage.ip.J(r11, r4)     // Catch: java.lang.Throwable -> L4f
        L7b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4f
            goto L7f
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4f
            throw r11
        L7f:
            sr r2 = defpackage.r3.p(r11)
            boolean r4 = defpackage.r3.k0
            r5 = 0
            if (r4 == 0) goto L98
            boolean r4 = r11 instanceof android.view.ContextThemeWrapper
            if (r4 == 0) goto L98
            android.content.res.Configuration r4 = defpackage.r3.t(r11, r0, r2, r5, r3)
            r6 = r11
            android.view.ContextThemeWrapper r6 = (android.view.ContextThemeWrapper) r6     // Catch: java.lang.IllegalStateException -> L98
            r6.applyOverrideConfiguration(r4)     // Catch: java.lang.IllegalStateException -> L98
            goto L22a
        L98:
            boolean r4 = r11 instanceof defpackage.kd
            if (r4 == 0) goto La8
            android.content.res.Configuration r3 = defpackage.r3.t(r11, r0, r2, r5, r3)
            r4 = r11
            kd r4 = (defpackage.kd) r4     // Catch: java.lang.IllegalStateException -> La8
            r4.a(r3)     // Catch: java.lang.IllegalStateException -> La8
            goto L22a
        La8:
            boolean r3 = defpackage.r3.j0
            if (r3 != 0) goto Lae
            goto L22a
        Lae:
            int r3 = android.os.Build.VERSION.SDK_INT
            android.content.res.Configuration r4 = new android.content.res.Configuration
            r4.<init>()
            r6 = -1
            r4.uiMode = r6
            r6 = 0
            r4.fontScale = r6
            android.content.Context r4 = r11.createConfigurationContext(r4)
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            android.content.res.Resources r7 = r11.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r8 = r7.uiMode
            r4.uiMode = r8
            boolean r8 = r4.equals(r7)
            if (r8 != 0) goto L1ce
            android.content.res.Configuration r8 = new android.content.res.Configuration
            r8.<init>()
            r8.fontScale = r6
            int r6 = r4.diff(r7)
            if (r6 != 0) goto Le8
            goto L1cf
        Le8:
            float r6 = r4.fontScale
            float r9 = r7.fontScale
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto Lf2
            r8.fontScale = r9
        Lf2:
            int r6 = r4.mcc
            int r9 = r7.mcc
            if (r6 == r9) goto Lfa
            r8.mcc = r9
        Lfa:
            int r6 = r4.mnc
            int r9 = r7.mnc
            if (r6 == r9) goto L102
            r8.mnc = r9
        L102:
            defpackage.i3.a(r4, r7, r8)
            int r6 = r4.touchscreen
            int r9 = r7.touchscreen
            if (r6 == r9) goto L10d
            r8.touchscreen = r9
        L10d:
            int r6 = r4.keyboard
            int r9 = r7.keyboard
            if (r6 == r9) goto L115
            r8.keyboard = r9
        L115:
            int r6 = r4.keyboardHidden
            int r9 = r7.keyboardHidden
            if (r6 == r9) goto L11d
            r8.keyboardHidden = r9
        L11d:
            int r6 = r4.navigation
            int r9 = r7.navigation
            if (r6 == r9) goto L125
            r8.navigation = r9
        L125:
            int r6 = r4.navigationHidden
            int r9 = r7.navigationHidden
            if (r6 == r9) goto L12d
            r8.navigationHidden = r9
        L12d:
            int r6 = r4.orientation
            int r9 = r7.orientation
            if (r6 == r9) goto L135
            r8.orientation = r9
        L135:
            int r6 = r4.screenLayout
            r6 = r6 & 15
            int r9 = r7.screenLayout
            r9 = r9 & 15
            if (r6 == r9) goto L144
            int r6 = r8.screenLayout
            r6 = r6 | r9
            r8.screenLayout = r6
        L144:
            int r6 = r4.screenLayout
            r6 = r6 & 192(0xc0, float:2.69E-43)
            int r9 = r7.screenLayout
            r9 = r9 & 192(0xc0, float:2.69E-43)
            if (r6 == r9) goto L153
            int r6 = r8.screenLayout
            r6 = r6 | r9
            r8.screenLayout = r6
        L153:
            int r6 = r4.screenLayout
            r6 = r6 & 48
            int r9 = r7.screenLayout
            r9 = r9 & 48
            if (r6 == r9) goto L162
            int r6 = r8.screenLayout
            r6 = r6 | r9
            r8.screenLayout = r6
        L162:
            int r6 = r4.screenLayout
            r6 = r6 & 768(0x300, float:1.076E-42)
            int r9 = r7.screenLayout
            r9 = r9 & 768(0x300, float:1.076E-42)
            if (r6 == r9) goto L171
            int r6 = r8.screenLayout
            r6 = r6 | r9
            r8.screenLayout = r6
        L171:
            int r6 = r4.colorMode
            r6 = r6 & 3
            int r9 = r7.colorMode
            r9 = r9 & 3
            if (r6 == r9) goto L180
            int r6 = r8.colorMode
            r6 = r6 | r9
            r8.colorMode = r6
        L180:
            int r6 = r4.colorMode
            r6 = r6 & 12
            int r9 = r7.colorMode
            r9 = r9 & 12
            if (r6 == r9) goto L18f
            int r6 = r8.colorMode
            r6 = r6 | r9
            r8.colorMode = r6
        L18f:
            int r6 = r4.uiMode
            r6 = r6 & 15
            int r9 = r7.uiMode
            r9 = r9 & 15
            if (r6 == r9) goto L19e
            int r6 = r8.uiMode
            r6 = r6 | r9
            r8.uiMode = r6
        L19e:
            int r6 = r4.uiMode
            r6 = r6 & 48
            int r9 = r7.uiMode
            r9 = r9 & 48
            if (r6 == r9) goto L1ad
            int r6 = r8.uiMode
            r6 = r6 | r9
            r8.uiMode = r6
        L1ad:
            int r6 = r4.screenWidthDp
            int r9 = r7.screenWidthDp
            if (r6 == r9) goto L1b5
            r8.screenWidthDp = r9
        L1b5:
            int r6 = r4.screenHeightDp
            int r9 = r7.screenHeightDp
            if (r6 == r9) goto L1bd
            r8.screenHeightDp = r9
        L1bd:
            int r6 = r4.smallestScreenWidthDp
            int r9 = r7.smallestScreenWidthDp
            if (r6 == r9) goto L1c5
            r8.smallestScreenWidthDp = r9
        L1c5:
            int r4 = r4.densityDpi
            int r6 = r7.densityDpi
            if (r4 == r6) goto L1cf
            r8.densityDpi = r6
            goto L1cf
        L1ce:
            r8 = r5
        L1cf:
            android.content.res.Configuration r0 = defpackage.r3.t(r11, r0, r2, r8, r1)
            kd r2 = new kd
            r4 = 2131821080(0x7f110218, float:1.9274893E38)
            r2.<init>(r11, r4)
            r2.a(r0)
            android.content.res.Resources$Theme r11 = r11.getTheme()     // Catch: java.lang.NullPointerException -> L229
            if (r11 == 0) goto L229
            android.content.res.Resources$Theme r11 = r2.getTheme()
            r0 = 29
            if (r3 < r0) goto L1f0
            defpackage.b10.a(r11)
            goto L229
        L1f0:
            java.lang.Object r0 = defpackage.ff.u
            monitor-enter(r0)
            boolean r3 = defpackage.ff.w     // Catch: java.lang.Throwable -> L205
            if (r3 != 0) goto L211
            java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
            java.lang.String r4 = "rebase"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Throwable -> L205 java.lang.NoSuchMethodException -> L207
            defpackage.ff.v = r3     // Catch: java.lang.Throwable -> L205 java.lang.NoSuchMethodException -> L207
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L205 java.lang.NoSuchMethodException -> L207
            goto L20f
        L205:
            r11 = move-exception
            goto L227
        L207:
            r3 = move-exception
            java.lang.String r4 = "ResourcesCompat"
            java.lang.String r6 = "Failed to retrieve rebase() method"
            android.util.Log.i(r4, r6, r3)     // Catch: java.lang.Throwable -> L205
        L20f:
            defpackage.ff.w = r1     // Catch: java.lang.Throwable -> L205
        L211:
            java.lang.reflect.Method r1 = defpackage.ff.v     // Catch: java.lang.Throwable -> L205
            if (r1 == 0) goto L225
            r1.invoke(r11, r5)     // Catch: java.lang.Throwable -> L205 java.lang.reflect.InvocationTargetException -> L219 java.lang.IllegalAccessException -> L21b
            goto L225
        L219:
            r11 = move-exception
            goto L21c
        L21b:
            r11 = move-exception
        L21c:
            java.lang.String r1 = "ResourcesCompat"
            java.lang.String r3 = "Failed to invoke rebase() method via reflection"
            android.util.Log.i(r1, r3, r11)     // Catch: java.lang.Throwable -> L205
            defpackage.ff.v = r5     // Catch: java.lang.Throwable -> L205
        L225:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L205
            goto L229
        L227:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L205
            throw r11
        L229:
            r11 = r2
        L22a:
            super.attachBaseContext(r11)
            return
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
            r2 = this;
            e3 r0 = r2.l()
            r3 r0 = (defpackage.r3) r0
            r0.A()
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
            e3 r0 = r1.l()
            r3 r0 = (defpackage.r3) r0
            r0.A()
            boolean r2 = super.dispatchKeyEvent(r2)
            return r2
    }

    @Override // androidx.core.app.ComponentActivity
    public final void f() {
            r1 = this;
            e3 r0 = r1.l()
            r0.b()
            return
    }

    @Override // android.app.Activity
    public final android.view.View findViewById(int r2) {
            r1 = this;
            e3 r0 = r1.l()
            r3 r0 = (defpackage.r3) r0
            r0.w()
            android.view.Window r0 = r0.l
            android.view.View r2 = r0.findViewById(r2)
            return r2
    }

    @Override // android.app.Activity
    public final android.view.MenuInflater getMenuInflater() {
            r3 = this;
            e3 r0 = r3.l()
            r3 r0 = (defpackage.r3) r0
            k50 r1 = r0.p
            if (r1 != 0) goto L1f
            r0.A()
            k50 r1 = new k50
            yb0 r2 = r0.o
            if (r2 == 0) goto L18
            android.content.Context r2 = r2.L()
            goto L1a
        L18:
            android.content.Context r2 = r0.k
        L1a:
            r1.<init>(r2)
            r0.p = r1
        L1f:
            k50 r0 = r0.p
            return r0
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources getResources() {
            r1 = this;
            int r0 = defpackage.f90.a
            android.content.res.Resources r0 = super.getResources()
            return r0
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
            r1 = this;
            e3 r0 = r1.l()
            r0.b()
            return
    }

    public final defpackage.e3 l() {
            r2 = this;
            r3 r0 = r2.x
            if (r0 != 0) goto Le
            u5 r0 = defpackage.e3.a
            r3 r0 = new r3
            r1 = 0
            r0.<init>(r2, r1, r2, r2)
            r2.x = r0
        Le:
            r3 r0 = r2.x
            return r0
    }

    public final void m() {
            r3 = this;
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "<this>"
            defpackage.ip.o(r1, r0)
            r2 = 2131296695(0x7f0901b7, float:1.8211314E38)
            r0.setTag(r2, r3)
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            defpackage.ip.o(r1, r0)
            r2 = 2131296698(0x7f0901ba, float:1.821132E38)
            r0.setTag(r2, r3)
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            defpackage.ip.o(r1, r0)
            r2 = 2131296697(0x7f0901b9, float:1.8211318E38)
            r0.setTag(r2, r3)
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            defpackage.ip.o(r1, r0)
            r1 = 2131296696(0x7f0901b8, float:1.8211316E38)
            r0.setTag(r1, r3)
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration r5) {
            r4 = this;
            super.onConfigurationChanged(r5)
            e3 r5 = r4.l()
            r3 r5 = (defpackage.r3) r5
            boolean r0 = r5.F
            if (r0 == 0) goto L27
            boolean r0 = r5.z
            if (r0 == 0) goto L27
            r5.A()
            yb0 r0 = r5.o
            if (r0 == 0) goto L27
            android.content.Context r1 = r0.w
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131034112(0x7f050000, float:1.7678732E38)
            boolean r1 = r1.getBoolean(r2)
            r0.O(r1)
        L27:
            u3 r0 = defpackage.u3.a()
            android.content.Context r1 = r5.k
            monitor-enter(r0)
            w00 r2 = r0.a     // Catch: java.lang.Throwable -> L5b
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5b
            java.util.WeakHashMap r3 = r2.b     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r1 = r3.get(r1)     // Catch: java.lang.Throwable -> L3f
            bs r1 = (defpackage.bs) r1     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L41
            r1.a()     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r5 = move-exception
            goto L59
        L41:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)
            android.content.res.Configuration r0 = new android.content.res.Configuration
            android.content.Context r1 = r5.k
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            r0.<init>(r1)
            r5.R = r0
            r0 = 0
            r5.m(r0, r0)
            return
        L59:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3f
            throw r5     // Catch: java.lang.Throwable -> L5b
        L5b:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r5
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
            r0 = this;
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
            r1 = this;
            super.onDestroy()
            e3 r0 = r1.l()
            r0.e()
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int r5, android.view.MenuItem r6) {
            r4 = this;
            boolean r5 = super.onMenuItemSelected(r5, r6)
            r0 = 1
            if (r5 == 0) goto L9
            goto La7
        L9:
            e3 r5 = r4.l()
            r3 r5 = (defpackage.r3) r5
            r5.A()
            yb0 r5 = r5.o
            int r6 = r6.getItemId()
            r1 = 16908332(0x102002c, float:2.3877352E-38)
            r2 = 0
            if (r6 != r1) goto Lb4
            if (r5 == 0) goto Lb4
            hf r5 = r5.A
            k70 r5 = (defpackage.k70) r5
            int r5 = r5.b
            r5 = r5 & 4
            if (r5 == 0) goto Lb4
            android.content.Intent r5 = defpackage.zt.r(r4)
            if (r5 == 0) goto Lb4
            boolean r6 = defpackage.ew.c(r4, r5)
            if (r6 == 0) goto Lb0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            android.content.Intent r6 = defpackage.zt.r(r4)
            if (r6 != 0) goto L45
            android.content.Intent r6 = defpackage.zt.r(r4)
        L45:
            if (r6 == 0) goto L7e
            android.content.ComponentName r1 = r6.getComponent()
            if (r1 != 0) goto L55
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            android.content.ComponentName r1 = r6.resolveActivity(r1)
        L55:
            int r3 = r5.size()
            android.content.Intent r1 = defpackage.zt.s(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6b
        L5d:
            if (r1 == 0) goto L6d
            r5.add(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6b
            android.content.ComponentName r1 = r1.getComponent()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6b
            android.content.Intent r1 = defpackage.zt.s(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6b
            goto L5d
        L6b:
            r5 = move-exception
            goto L71
        L6d:
            r5.add(r6)
            goto L7e
        L71:
            java.lang.String r6 = "TaskStackBuilder"
            java.lang.String r0 = "Bad ComponentName while traversing activity parent metadata"
            android.util.Log.e(r6, r0)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r5)
            throw r6
        L7e:
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto La8
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
            defpackage.ed.a(r4, r5, r6)
            defpackage.q1.a(r4)     // Catch: java.lang.IllegalStateException -> La4
            goto La7
        La4:
            r4.finish()
        La7:
            return r0
        La8:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "No intents added to TaskStackBuilder; cannot startActivities"
            r5.<init>(r6)
            throw r5
        Lb0:
            defpackage.ew.b(r4, r5)
            return r0
        Lb4:
            return r2
    }

    @Override // android.app.Activity
    public final void onPostCreate(android.os.Bundle r1) {
            r0 = this;
            super.onPostCreate(r1)
            e3 r1 = r0.l()
            r3 r1 = (defpackage.r3) r1
            r1.w()
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
            r2 = this;
            super.onPostResume()
            e3 r0 = r2.l()
            r3 r0 = (defpackage.r3) r0
            r0.A()
            yb0 r0 = r0.o
            if (r0 == 0) goto L13
            r1 = 1
            r0.P = r1
        L13:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
            r3 = this;
            super.onStart()
            e3 r0 = r3.l()
            r3 r0 = (defpackage.r3) r0
            r1 = 1
            r2 = 0
            r0.m(r1, r2)
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
            r2 = this;
            super.onStop()
            e3 r0 = r2.l()
            r3 r0 = (defpackage.r3) r0
            r0.A()
            yb0 r0 = r0.o
            if (r0 == 0) goto L1a
            r1 = 0
            r0.P = r1
            xa0 r0 = r0.O
            if (r0 == 0) goto L1a
            r0.a()
        L1a:
            return
    }

    @Override // android.app.Activity
    public final void onTitleChanged(java.lang.CharSequence r1, int r2) {
            r0 = this;
            super.onTitleChanged(r1, r2)
            e3 r2 = r0.l()
            r2.l(r1)
            return
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
            r2 = this;
            e3 r0 = r2.l()
            r3 r0 = (defpackage.r3) r0
            r0.A()
            android.view.Window r0 = r2.getWindow()
            r1 = 0
            boolean r0 = r0.hasFeature(r1)
            if (r0 == 0) goto L17
            super.openOptionsMenu()
        L17:
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int r2) {
            r1 = this;
            r1.m()
            e3 r0 = r1.l()
            r0.h(r2)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View r2) {
            r1 = this;
            r1.m()
            e3 r0 = r1.l()
            r0.i(r2)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            r1.m()
            e3 r0 = r1.l()
            r0.j(r2, r3)
            return
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int r2) {
            r1 = this;
            super.setTheme(r2)
            e3 r0 = r1.l()
            r3 r0 = (defpackage.r3) r0
            r0.T = r2
            return
    }
}

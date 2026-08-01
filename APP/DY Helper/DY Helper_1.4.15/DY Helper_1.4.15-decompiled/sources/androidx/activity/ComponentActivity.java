package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements p000.r92, p000.sc0, p000.kq1 {

    /* JADX INFO: renamed from: χ */
    public static final /* synthetic */ int f339 = 0;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0000a f340;

    /* JADX INFO: renamed from: η */
    public final p000.C0538m6 f341;

    /* JADX INFO: renamed from: θ */
    public final p000.jr0 f342;

    /* JADX INFO: renamed from: ι */
    public final p000.C0574n5 f343;

    /* JADX INFO: renamed from: κ */
    public p000.q92 f344;

    /* JADX INFO: renamed from: λ */
    public p000.d51 f345;

    /* JADX INFO: renamed from: μ */
    public final p000.ViewTreeObserverOnDrawListenerC0952wm f346;

    /* JADX INFO: renamed from: ν */
    public final p000.o70 f347;

    /* JADX INFO: renamed from: ξ */
    public final p000.C0803sm f348;

    /* JADX INFO: renamed from: ο */
    public final java.util.concurrent.CopyOnWriteArrayList f349;

    /* JADX INFO: renamed from: π */
    public final java.util.concurrent.CopyOnWriteArrayList f350;

    /* JADX INFO: renamed from: ρ */
    public final java.util.concurrent.CopyOnWriteArrayList f351;

    /* JADX INFO: renamed from: σ */
    public final java.util.concurrent.CopyOnWriteArrayList f352;

    /* JADX INFO: renamed from: τ */
    public final java.util.concurrent.CopyOnWriteArrayList f353;

    /* JADX INFO: renamed from: υ */
    public boolean f354;

    /* JADX INFO: renamed from: φ */
    public boolean f355;

    public ComponentActivity() {
            r7 = this;
            r7.<init>()
            a r0 = new a
            r1 = 2
            r0.<init>(r1)
            r7.f340 = r0
            m6 r0 = new m6
            ν r1 = new ν
            r2 = 8
            r1.<init>(r2, r7)
            r0.<init>(r1)
            r7.f341 = r0
            jr0 r0 = new jr0
            r0.<init>(r7)
            r7.f342 = r0
            jq1 r1 = new jq1
            η r2 = new η
            r3 = 14
            r2.<init>(r3, r7)
            r1.<init>(r7, r2)
            n5 r2 = new n5
            r2.<init>(r1)
            r7.f343 = r2
            r3 = 0
            r7.f345 = r3
            wm r3 = new wm
            r3.<init>(r7)
            r7.f346 = r3
            o70 r4 = new o70
            η r5 = new η
            r6 = 7
            r5.<init>(r6, r7)
            r4.<init>(r3, r5)
            r7.f347 = r4
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r3.<init>()
            sm r3 = new sm
            r3.<init>()
            r7.f348 = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r7.f349 = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r7.f350 = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r7.f351 = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r7.f352 = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r7.f353 = r3
            r3 = 0
            r7.f354 = r3
            r7.f355 = r3
            tm r3 = new tm
            r4 = 0
            r3.<init>(r7, r4)
            r0.m2980(r3)
            tm r3 = new tm
            r4 = 1
            r3.<init>(r7, r4)
            r0.m2980(r3)
            tm r3 = new tm
            r4 = 2
            r3.<init>(r7, r4)
            r0.m2980(r3)
            r1.m2979()
            p000.ln0.m3639(r7)
            java.lang.Object r0 = r2.f7388
            n5 r0 = (p000.C0574n5) r0
            qm r1 = new qm
            r2 = 0
            r1.<init>(r2, r7)
            java.lang.String r2 = "android:support:activity-result"
            r0.m3974(r2, r1)
            rm r0 = new rm
            r1 = 0
            r0.<init>(r7, r1)
            r7.m194(r0)
            return
    }

    /* JADX INFO: renamed from: ε */
    public static /* synthetic */ void m188(androidx.activity.ComponentActivity r0) {
            super.onBackPressed()
            return
    }

    @Override // android.app.Activity
    public void addContentView(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.m196()
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            wm r1 = r2.f346
            r1.m6396(r0)
            super.addContentView(r3, r4)
            return
    }

    @Override // android.app.Activity
    public void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            sm r0 = r1.f348
            boolean r0 = r0.m5522(r2, r3, r4)
            if (r0 != 0) goto Lb
            super.onActivityResult(r2, r3, r4)
        Lb:
            return
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
            r0 = this;
            d51 r0 = r0.m195()
            r0.m1653()
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.f349
            java.util.Iterator r1 = r1.iterator()
        L9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r1.next()
            ap r0 = (p000.InterfaceC0048ap) r0
            r0.accept(r2)
            goto L9
        L19:
            return
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            n5 r0 = r2.f343
            r0.m3972(r3)
            a r0 = r2.f340
            r0.getClass()
            r0.f1 = r2
            java.lang.Object r0 = r0.f0
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            e51 r1 = (p000.e51) r1
            r1.mo1847()
            goto L14
        L24:
            super.onCreate(r3)
            int r3 = p000.jn1.f5528
            p000.hn1.m2524(r2)
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int r1, android.view.Menu r2) {
            r0 = this;
            if (r1 != 0) goto L24
            super.onCreatePanelMenu(r1, r2)
            r0.getMenuInflater()
            m6 r0 = r0.f341
            java.lang.Object r0 = r0.f6969
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            v60 r1 = (p000.v60) r1
            b70 r1 = r1.f11116
            r1.m785()
            goto L12
        L24:
            r0 = 1
            return r0
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            boolean r3 = super.onMenuItemSelected(r2, r3)
            r0 = 1
            if (r3 == 0) goto L8
            return r0
        L8:
            r3 = 0
            if (r2 != 0) goto L2a
            m6 r1 = r1.f341
            java.lang.Object r1 = r1.f6969
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            v60 r2 = (p000.v60) r2
            b70 r2 = r2.f11116
            boolean r2 = r2.m790()
            if (r2 == 0) goto L15
            return r0
        L2a:
            return r3
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean r3) {
            r2 = this;
            boolean r0 = r2.f354
            if (r0 == 0) goto L5
            goto L20
        L5:
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.f352
            java.util.Iterator r2 = r2.iterator()
        Lb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r2.next()
            ap r0 = (p000.InterfaceC0048ap) r0
            j11 r1 = new j11
            r1.<init>(r3)
            r0.accept(r1)
            goto Lb
        L20:
            return
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean r3, android.content.res.Configuration r4) {
            r2 = this;
            r0 = 1
            r2.f354 = r0
            r0 = 0
            super.onMultiWindowModeChanged(r3, r4)     // Catch: java.lang.Throwable -> L28
            r2.f354 = r0
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.f352
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r2.next()
            ap r0 = (p000.InterfaceC0048ap) r0
            j11 r1 = new j11
            r4.getClass()
            r1.<init>(r3)
            r0.accept(r1)
            goto Lf
        L27:
            return
        L28:
            r3 = move-exception
            r2.f354 = r0
            throw r3
    }

    @Override // android.app.Activity
    public final void onNewIntent(android.content.Intent r2) {
            r1 = this;
            super.onNewIntent(r2)
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.f351
            java.util.Iterator r1 = r1.iterator()
        L9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r1.next()
            ap r0 = (p000.InterfaceC0048ap) r0
            r0.accept(r2)
            goto L9
        L19:
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r3, android.view.Menu r4) {
            r2 = this;
            m6 r0 = r2.f341
            java.lang.Object r0 = r0.f6969
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            v60 r1 = (p000.v60) r1
            b70 r1 = r1.f11116
            r1.m791()
            goto La
        L1c:
            super.onPanelClosed(r3, r4)
            return
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean r3) {
            r2 = this;
            boolean r0 = r2.f355
            if (r0 == 0) goto L5
            goto L20
        L5:
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.f353
            java.util.Iterator r2 = r2.iterator()
        Lb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r2.next()
            ap r0 = (p000.InterfaceC0048ap) r0
            ah1 r1 = new ah1
            r1.<init>(r3)
            r0.accept(r1)
            goto Lb
        L20:
            return
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean r3, android.content.res.Configuration r4) {
            r2 = this;
            r0 = 1
            r2.f355 = r0
            r0 = 0
            super.onPictureInPictureModeChanged(r3, r4)     // Catch: java.lang.Throwable -> L28
            r2.f355 = r0
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.f353
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r2.next()
            ap r0 = (p000.InterfaceC0048ap) r0
            ah1 r1 = new ah1
            r4.getClass()
            r1.<init>(r3)
            r0.accept(r1)
            goto Lf
        L27:
            return
        L28:
            r3 = move-exception
            r2.f355 = r0
            throw r3
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int r1, android.view.View r2, android.view.Menu r3) {
            r0 = this;
            if (r1 != 0) goto L21
            super.onPreparePanel(r1, r2, r3)
            m6 r0 = r0.f341
            java.lang.Object r0 = r0.f6969
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            v60 r1 = (p000.v60) r1
            b70 r1 = r1.f11116
            r1.m794()
            goto Lf
        L21:
            r0 = 1
            return r0
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int r4, java.lang.String[] r5, int[] r6) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "androidx.activity.result.contract.extra.PERMISSIONS"
            android.content.Intent r0 = r0.putExtra(r1, r5)
            java.lang.String r1 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
            android.content.Intent r0 = r0.putExtra(r1, r6)
            sm r1 = r3.f348
            r2 = -1
            boolean r0 = r1.m5522(r4, r2, r0)
            if (r0 != 0) goto L1d
            super.onRequestPermissionsResult(r4, r5, r6)
        L1d:
            return
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
            r1 = this;
            q92 r0 = r1.f344
            if (r0 != 0) goto Le
            java.lang.Object r1 = r1.getLastNonConfigurationInstance()
            vm r1 = (p000.C0915vm) r1
            if (r1 == 0) goto Le
            q92 r0 = r1.f11346
        Le:
            if (r0 != 0) goto L12
            r1 = 0
            return r1
        L12:
            vm r1 = new vm
            r1.<init>()
            r1.f11346 = r0
            return r1
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            jr0 r0 = r2.f342
            if (r0 == 0) goto Le
            java.lang.String r1 = "setCurrentState"
            r0.m2982(r1)
            cr0 r1 = p000.cr0.f2726
            r0.m2984(r1)
        Le:
            super.onSaveInstanceState(r3)
            n5 r2 = r2.f343
            r2.m3973(r3)
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int r3) {
            r2 = this;
            super.onTrimMemory(r3)
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.f350
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r2.next()
            ap r0 = (p000.InterfaceC0048ap) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.accept(r1)
            goto L9
        L1d:
            return
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
            r3 = this;
            boolean r0 = p000.o52.m4212()     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto Lb
            java.lang.String r0 = "reportFullyDrawn() for ComponentActivity"
            p000.e81.m1872(r0)     // Catch: java.lang.Throwable -> L3a
        Lb:
            super.reportFullyDrawn()     // Catch: java.lang.Throwable -> L3a
            o70 r3 = r3.f347     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r0 = r3.f7968     // Catch: java.lang.Throwable -> L3a
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L3a
            r1 = 1
            r3.f7969 = r1     // Catch: java.lang.Throwable -> L2c
            java.util.ArrayList r1 = r3.f7970     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2c
        L1c:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2c
            p70 r2 = (p000.p70) r2     // Catch: java.lang.Throwable -> L2c
            r2.invoke()     // Catch: java.lang.Throwable -> L2c
            goto L1c
        L2c:
            r3 = move-exception
            goto L38
        L2e:
            java.util.ArrayList r3 = r3.f7970     // Catch: java.lang.Throwable -> L2c
            r3.clear()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            android.os.Trace.endSection()
            return
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r3     // Catch: java.lang.Throwable -> L3a
        L3a:
            r3 = move-exception
            android.os.Trace.endSection()
            throw r3
    }

    @Override // android.app.Activity
    public void setContentView(int r3) {
            r2 = this;
            r2.m196()
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            wm r1 = r2.f346
            r1.m6396(r0)
            super.setContentView(r3)
            return
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r3) {
            r2 = this;
            r2.m196()
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            wm r1 = r2.f346
            r1.m6396(r0)
            super.setContentView(r3)
            return
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.m196()
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            wm r1 = r2.f346
            r1.m6396(r0)
            super.setContentView(r3, r4)
            return
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: α */
    public final p000.C0574n5 mo189() {
            r0 = this;
            n5 r0 = r0.f343
            java.lang.Object r0 = r0.f7388
            n5 r0 = (p000.C0574n5) r0
            return r0
    }

    @Override // p000.sc0
    /* JADX INFO: renamed from: β */
    public final p000.k11 mo190() {
            r4 = this;
            k11 r0 = new k11
            r0.<init>()
            android.app.Application r1 = r4.getApplication()
            java.util.LinkedHashMap r2 = r0.f4786
            if (r1 == 0) goto L16
            zz1 r1 = p000.o92.f7999
            android.app.Application r3 = r4.getApplication()
            r2.put(r1, r3)
        L16:
            rk0 r1 = p000.ln0.f6719
            r2.put(r1, r4)
            rk0 r1 = p000.ln0.f6720
            r2.put(r1, r4)
            android.content.Intent r1 = r4.getIntent()
            if (r1 == 0) goto L3d
            android.content.Intent r1 = r4.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L3d
            rk0 r1 = p000.ln0.f6721
            android.content.Intent r4 = r4.getIntent()
            android.os.Bundle r4 = r4.getExtras()
            r2.put(r1, r4)
        L3d:
            return r0
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: γ */
    public final p000.q92 mo191() {
            r1 = this;
            android.app.Application r0 = r1.getApplication()
            if (r0 == 0) goto L24
            q92 r0 = r1.f344
            if (r0 != 0) goto L21
            java.lang.Object r0 = r1.getLastNonConfigurationInstance()
            vm r0 = (p000.C0915vm) r0
            if (r0 == 0) goto L16
            q92 r0 = r0.f11346
            r1.f344 = r0
        L16:
            q92 r0 = r1.f344
            if (r0 != 0) goto L21
            q92 r0 = new q92
            r0.<init>()
            r1.f344 = r0
        L21:
            q92 r1 = r1.f344
            return r1
        L24:
            java.lang.String r1 = "Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call."
            p000.C1080.m7279(r1)
            r1 = 0
            return r1
    }

    @Override // androidx.core.app.ComponentActivity, p000.hr0
    /* JADX INFO: renamed from: δ */
    public final p000.jr0 mo192() {
            r0 = this;
            jr0 r0 = r0.f342
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public final void m193(p000.InterfaceC0048ap r1) {
            r0 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f349
            r0.add(r1)
            return
    }

    /* JADX INFO: renamed from: η */
    public final void m194(p000.e51 r2) {
            r1 = this;
            a r1 = r1.f340
            r1.getClass()
            java.lang.Object r0 = r1.f1
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            if (r0 == 0) goto Le
            r2.mo1847()
        Le:
            java.lang.Object r1 = r1.f0
            java.util.concurrent.CopyOnWriteArraySet r1 = (java.util.concurrent.CopyOnWriteArraySet) r1
            r1.add(r2)
            return
    }

    /* JADX INFO: renamed from: θ */
    public final p000.d51 m195() {
            r3 = this;
            d51 r0 = r3.f345
            if (r0 != 0) goto L1c
            d51 r0 = new d51
            d1 r1 = new d1
            r2 = 2
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r3.f345 = r0
            tm r0 = new tm
            r1 = 3
            r0.<init>(r3, r1)
            jr0 r1 = r3.f342
            r1.m2980(r0)
        L1c:
            d51 r3 = r3.f345
            return r3
    }

    /* JADX INFO: renamed from: ι */
    public final void m196() {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            r1 = 2131297158(0x7f090386, float:1.8212253E38)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            r1 = 2131297161(0x7f090389, float:1.821226E38)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            r1 = 2131297160(0x7f090388, float:1.8212257E38)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            r1 = 2131297159(0x7f090387, float:1.8212255E38)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            r1 = 2131296871(0x7f090267, float:1.821167E38)
            r0.setTag(r1, r2)
            return
    }
}

package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements defpackage.sa0, defpackage.lo, defpackage.u10 {
    public static final /* synthetic */ int r = 0;
    public final defpackage.dd b;
    public final defpackage.d4 c;
    public final androidx.lifecycle.a d;
    public final defpackage.gm e;
    public defpackage.ra0 f;
    public androidx.activity.a g;
    public final defpackage.vb h;
    public final defpackage.gm i;
    public final defpackage.sb j;
    public final java.util.concurrent.CopyOnWriteArrayList k;
    public final java.util.concurrent.CopyOnWriteArrayList l;
    public final java.util.concurrent.CopyOnWriteArrayList m;
    public final java.util.concurrent.CopyOnWriteArrayList n;
    public final java.util.concurrent.CopyOnWriteArrayList o;
    public boolean p;
    public boolean q;





    public ComponentActivity() {
            r7 = this;
            r7.<init>()
            dd r0 = new dd
            r0.<init>()
            r7.b = r0
            d4 r0 = new d4
            p1 r1 = new p1
            r2 = 3
            r1.<init>(r2, r7)
            r0.<init>(r1)
            r7.c = r0
            androidx.lifecycle.a r0 = new androidx.lifecycle.a
            r0.<init>(r7)
            r7.d = r0
            gm r1 = new gm
            r1.<init>(r7)
            r7.e = r1
            r2 = 0
            r7.g = r2
            vb r3 = new vb
            r3.<init>(r7)
            r7.h = r3
            gm r4 = new gm
            k80 r5 = new k80
            r6 = 2
            r5.<init>(r7, r6)
            r4.<init>(r3, r5)
            r7.i = r4
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r3.<init>()
            sb r3 = new sb
            r3.<init>()
            r7.j = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r7.k = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r7.l = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r7.m = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r7.n = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r7.o = r3
            r3 = 0
            r7.p = r3
            r7.q = r3
            androidx.activity.ComponentActivity$2 r3 = new androidx.activity.ComponentActivity$2
            r3.<init>(r7)
            r0.a(r3)
            androidx.activity.ComponentActivity$3 r3 = new androidx.activity.ComponentActivity$3
            r3.<init>(r7)
            r0.a(r3)
            androidx.activity.ComponentActivity$4 r3 = new androidx.activity.ComponentActivity$4
            r3.<init>(r7)
            r0.a(r3)
            r1.a()
            jq r0 = r0.c
            jq r3 = defpackage.jq.b
            if (r0 == r3) goto L9e
            jq r3 = defpackage.jq.c
            if (r0 != r3) goto L96
            goto L9e
        L96:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            r0.<init>(r1)
            throw r0
        L9e:
            java.lang.Object r0 = r1.c
            a3 r0 = (defpackage.a3) r0
            r0.getClass()
            java.lang.Object r0 = r0.f
            o10 r0 = (defpackage.o10) r0
            java.util.Iterator r0 = r0.iterator()
        Lad:
            r1 = r0
            k10 r1 = (defpackage.k10) r1
            boolean r3 = r1.hasNext()
            java.lang.String r4 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            if (r3 == 0) goto Ld6
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r3 = "components"
            defpackage.ip.n(r3, r1)
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            t10 r1 = (defpackage.t10) r1
            boolean r3 = defpackage.ip.i(r3, r4)
            if (r3 == 0) goto Lad
            r2 = r1
        Ld6:
            if (r2 != 0) goto Lf6
            p10 r0 = new p10
            gm r1 = r7.e
            java.lang.Object r1 = r1.c
            a3 r1 = (defpackage.a3) r1
            r0.<init>(r1, r7)
            gm r1 = r7.e
            java.lang.Object r1 = r1.c
            a3 r1 = (defpackage.a3) r1
            r1.e(r4, r0)
            androidx.lifecycle.a r1 = r7.d
            androidx.lifecycle.SavedStateHandleAttacher r2 = new androidx.lifecycle.SavedStateHandleAttacher
            r2.<init>(r0)
            r1.a(r2)
        Lf6:
            gm r0 = r7.e
            java.lang.Object r0 = r0.c
            a3 r0 = (defpackage.a3) r0
            qb r1 = new qb
            r1.<init>(r7)
            java.lang.String r2 = "android:support:activity-result"
            r0.e(r2, r1)
            rb r0 = new rb
            r0.<init>(r7)
            r7.h(r0)
            return
    }

    public static /* synthetic */ void g(androidx.activity.ComponentActivity r0) {
            super.onBackPressed()
            return
    }

    @Override // defpackage.lo
    public final defpackage.te a() {
            r4 = this;
            dw r0 = new dw
            se r1 = defpackage.se.b
            java.lang.String r2 = "initialExtras"
            defpackage.ip.o(r2, r1)
            r0.<init>()
            java.util.LinkedHashMap r2 = r0.a
            java.util.LinkedHashMap r1 = r1.a
            r2.putAll(r1)
            android.app.Application r1 = r4.getApplication()
            java.util.LinkedHashMap r2 = r0.a
            if (r1 == 0) goto L24
            vh r1 = defpackage.vh.o
            android.app.Application r3 = r4.getApplication()
            r2.put(r1, r3)
        L24:
            iy r1 = defpackage.ip.q
            r2.put(r1, r4)
            iy r1 = defpackage.ip.r
            r2.put(r1, r4)
            android.content.Intent r1 = r4.getIntent()
            if (r1 == 0) goto L4b
            android.content.Intent r1 = r4.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L4b
            iy r1 = defpackage.ip.s
            android.content.Intent r3 = r4.getIntent()
            android.os.Bundle r3 = r3.getExtras()
            r2.put(r1, r3)
        L4b:
            return r0
    }

    @Override // android.app.Activity
    public void addContentView(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.j()
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            vb r1 = r2.h
            r1.a(r0)
            super.addContentView(r3, r4)
            return
    }

    @Override // defpackage.u10
    public final defpackage.a3 b() {
            r1 = this;
            gm r0 = r1.e
            java.lang.Object r0 = r0.c
            a3 r0 = (defpackage.a3) r0
            return r0
    }

    @Override // defpackage.sa0
    public final defpackage.ra0 d() {
            r2 = this;
            android.app.Application r0 = r2.getApplication()
            if (r0 == 0) goto L24
            ra0 r0 = r2.f
            if (r0 != 0) goto L21
            java.lang.Object r0 = r2.getLastNonConfigurationInstance()
            ub r0 = (defpackage.ub) r0
            if (r0 == 0) goto L16
            ra0 r0 = r0.a
            r2.f = r0
        L16:
            ra0 r0 = r2.f
            if (r0 != 0) goto L21
            ra0 r0 = new ra0
            r0.<init>()
            r2.f = r0
        L21:
            ra0 r0 = r2.f
            return r0
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call."
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.core.app.ComponentActivity, defpackage.oq
    public final androidx.lifecycle.a e() {
            r1 = this;
            androidx.lifecycle.a r0 = r1.d
            return r0
    }

    public final void h(defpackage.yw r3) {
            r2 = this;
            dd r0 = r2.b
            r0.getClass()
            androidx.activity.ComponentActivity r1 = r0.b
            if (r1 == 0) goto Lc
            r3.a()
        Lc:
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.a
            r0.add(r3)
            return
    }

    public final androidx.activity.a i() {
            r3 = this;
            androidx.activity.a r0 = r3.g
            if (r0 != 0) goto L1b
            androidx.activity.a r0 = new androidx.activity.a
            y6 r1 = new y6
            r2 = 2
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r3.g = r0
            androidx.activity.ComponentActivity$6 r0 = new androidx.activity.ComponentActivity$6
            r0.<init>(r3)
            androidx.lifecycle.a r1 = r3.d
            r1.a(r0)
        L1b:
            androidx.activity.a r0 = r3.g
            return r0
    }

    public final void j() {
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
            r2 = 2131296696(0x7f0901b8, float:1.8211316E38)
            r0.setTag(r2, r3)
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            defpackage.ip.o(r1, r0)
            r1 = 2131296577(0x7f090141, float:1.8211075E38)
            r0.setTag(r1, r3)
            return
    }

    @Override // android.app.Activity
    public void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            sb r0 = r1.j
            boolean r0 = r0.a(r2, r3, r4)
            if (r0 != 0) goto Lb
            super.onActivityResult(r2, r3, r4)
        Lb:
            return
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
            r1 = this;
            androidx.activity.a r0 = r1.i()
            r0.b()
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            super.onConfigurationChanged(r3)
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.k
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            yk r1 = (defpackage.yk) r1
            r1.a(r3)
            goto L9
        L19:
            return
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            gm r0 = r2.e
            r0.b(r3)
            dd r0 = r2.b
            r0.getClass()
            r0.b = r2
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.a
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            yw r1 = (defpackage.yw) r1
            r1.a()
            goto L12
        L22:
            super.onCreate(r3)
            int r3 = defpackage.p00.b
            defpackage.n00.b(r2)
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int r1, android.view.Menu r2) {
            r0 = this;
            if (r1 != 0) goto L1e
            super.onCreatePanelMenu(r1, r2)
            r0.getMenuInflater()
            d4 r1 = r0.c
            java.lang.Object r1 = r1.c
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L19
            goto L1e
        L19:
            java.lang.ClassCastException r1 = defpackage.z30.h(r1)
            throw r1
        L1e:
            r1 = 1
            return r1
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r1, android.view.MenuItem r2) {
            r0 = this;
            boolean r2 = super.onMenuItemSelected(r1, r2)
            if (r2 == 0) goto L8
            r1 = 1
            return r1
        L8:
            if (r1 != 0) goto L20
            d4 r1 = r0.c
            java.lang.Object r1 = r1.c
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L1b
            goto L20
        L1b:
            java.lang.ClassCastException r1 = defpackage.z30.h(r1)
            throw r1
        L20:
            r1 = 0
            return r1
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean r4) {
            r3 = this;
            boolean r4 = r3.p
            if (r4 == 0) goto L5
            goto L22
        L5:
            java.util.concurrent.CopyOnWriteArrayList r4 = r3.n
            java.util.Iterator r4 = r4.iterator()
        Lb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r4.next()
            yk r0 = (defpackage.yk) r0
            vh r1 = new vh
            r2 = 28
            r1.<init>(r2)
            r0.a(r1)
            goto Lb
        L22:
            return
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean r3, android.content.res.Configuration r4) {
            r2 = this;
            r0 = 1
            r2.p = r0
            r0 = 0
            super.onMultiWindowModeChanged(r3, r4)     // Catch: java.lang.Throwable -> L27
            r2.p = r0
            java.util.concurrent.CopyOnWriteArrayList r3 = r2.n
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L26
            java.lang.Object r4 = r3.next()
            yk r4 = (defpackage.yk) r4
            vh r0 = new vh
            r1 = 28
            r0.<init>(r1)
            r4.a(r0)
            goto Lf
        L26:
            return
        L27:
            r3 = move-exception
            r2.p = r0
            throw r3
    }

    @Override // android.app.Activity
    public void onNewIntent(android.content.Intent r3) {
            r2 = this;
            super.onNewIntent(r3)
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.m
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            yk r1 = (defpackage.yk) r1
            r1.a(r3)
            goto L9
        L19:
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r3, android.view.Menu r4) {
            r2 = this;
            d4 r0 = r2.c
            java.lang.Object r0 = r0.c
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L14
            super.onPanelClosed(r3, r4)
            return
        L14:
            java.lang.ClassCastException r3 = defpackage.z30.h(r0)
            throw r3
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean r4) {
            r3 = this;
            boolean r4 = r3.q
            if (r4 == 0) goto L5
            goto L22
        L5:
            java.util.concurrent.CopyOnWriteArrayList r4 = r3.o
            java.util.Iterator r4 = r4.iterator()
        Lb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r4.next()
            yk r0 = (defpackage.yk) r0
            vh r1 = new vh
            r2 = 29
            r1.<init>(r2)
            r0.a(r1)
            goto Lb
        L22:
            return
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean r3, android.content.res.Configuration r4) {
            r2 = this;
            r0 = 1
            r2.q = r0
            r0 = 0
            super.onPictureInPictureModeChanged(r3, r4)     // Catch: java.lang.Throwable -> L27
            r2.q = r0
            java.util.concurrent.CopyOnWriteArrayList r3 = r2.o
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L26
            java.lang.Object r4 = r3.next()
            yk r4 = (defpackage.yk) r4
            vh r0 = new vh
            r1 = 29
            r0.<init>(r1)
            r4.a(r0)
            goto Lf
        L26:
            return
        L27:
            r3 = move-exception
            r2.q = r0
            throw r3
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int r1, android.view.View r2, android.view.Menu r3) {
            r0 = this;
            if (r1 != 0) goto L1b
            super.onPreparePanel(r1, r2, r3)
            d4 r1 = r0.c
            java.lang.Object r1 = r1.c
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L16
            goto L1b
        L16:
            java.lang.ClassCastException r1 = defpackage.z30.h(r1)
            throw r1
        L1b:
            r1 = 1
            return r1
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
            sb r1 = r3.j
            r2 = -1
            boolean r0 = r1.a(r4, r2, r0)
            if (r0 != 0) goto L1d
            super.onRequestPermissionsResult(r4, r5, r6)
        L1d:
            return
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
            r2 = this;
            ra0 r0 = r2.f
            if (r0 != 0) goto Le
            java.lang.Object r1 = r2.getLastNonConfigurationInstance()
            ub r1 = (defpackage.ub) r1
            if (r1 == 0) goto Le
            ra0 r0 = r1.a
        Le:
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            ub r1 = new ub
            r1.<init>()
            r1.a = r0
            return r1
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle r2) {
            r1 = this;
            androidx.lifecycle.a r0 = r1.d
            if (r0 == 0) goto L7
            r0.g()
        L7:
            super.onSaveInstanceState(r2)
            gm r0 = r1.e
            r0.c(r2)
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int r4) {
            r3 = this;
            super.onTrimMemory(r4)
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.l
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            yk r1 = (defpackage.yk) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1.a(r2)
            goto L9
        L1d:
            return
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
            r6 = this;
            boolean r0 = defpackage.ct.r()     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            java.lang.String r0 = "reportFullyDrawn() for ComponentActivity"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r0 = move-exception
            goto L40
        Le:
            super.reportFullyDrawn()     // Catch: java.lang.Throwable -> Lc
            gm r0 = r6.i     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r1 = r0.b     // Catch: java.lang.Throwable -> Lc
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lc
            r2 = 1
            r0.a = r2     // Catch: java.lang.Throwable -> L30
            java.lang.Object r2 = r0.c     // Catch: java.lang.Throwable -> L30
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L30
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L30
            r4 = 0
        L22:
            if (r4 >= r3) goto L32
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> L30
            int r4 = r4 + 1
            hm r5 = (defpackage.hm) r5     // Catch: java.lang.Throwable -> L30
            r5.a()     // Catch: java.lang.Throwable -> L30
            goto L22
        L30:
            r0 = move-exception
            goto L3e
        L32:
            java.lang.Object r0 = r0.c     // Catch: java.lang.Throwable -> L30
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L30
            r0.clear()     // Catch: java.lang.Throwable -> L30
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            android.os.Trace.endSection()
            return
        L3e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0     // Catch: java.lang.Throwable -> Lc
        L40:
            android.os.Trace.endSection()
            throw r0
    }

    @Override // android.app.Activity
    public void setContentView(int r3) {
            r2 = this;
            r2.j()
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            vb r1 = r2.h
            r1.a(r0)
            super.setContentView(r3)
            return
    }

    @Override // android.app.Activity
    public void setContentView(@android.annotation.SuppressLint({"UnknownNullness", "MissingNullability"}) android.view.View r3) {
            r2 = this;
            r2.j()
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            vb r1 = r2.h
            r1.a(r0)
            super.setContentView(r3)
            return
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.j()
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            vb r1 = r2.h
            r1.a(r0)
            super.setContentView(r3, r4)
            return
    }
}

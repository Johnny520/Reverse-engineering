package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements defpackage.InterfaceC2120, defpackage.InterfaceC1145, defpackage.InterfaceC1386, defpackage.InterfaceC1734 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f0;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f1;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.C0448 f2;

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    class AnonymousClass3 implements defpackage.InterfaceC0708 {
        @Override // defpackage.InterfaceC0708
        /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
        public final void mo6(defpackage.InterfaceC0770 r1, defpackage.EnumC2255 r2) {
                r0 = this;
                ᲈᛶᛱᛲ r0 = defpackage.EnumC2255.ON_STOP
                if (r2 == r0) goto L5
                return
            L5:
                r0 = 0
                throw r0
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    class AnonymousClass4 implements defpackage.InterfaceC0708 {
        @Override // defpackage.InterfaceC0708
        /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
        public final void mo6(defpackage.InterfaceC0770 r1, defpackage.EnumC2255 r2) {
                r0 = this;
                ᲈᛶᛱᛲ r0 = defpackage.EnumC2255.ON_DESTROY
                if (r2 == r0) goto L5
                return
            L5:
                r0 = 0
                throw r0
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    class AnonymousClass5 implements defpackage.InterfaceC0708 {
        @Override // defpackage.InterfaceC0708
        /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
        public final void mo6(defpackage.InterfaceC0770 r1, defpackage.EnumC2255 r2) {
                r0 = this;
                r0 = 0
                throw r0
        }
    }

    @Override // android.app.Activity
    public void addContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r0.m5()
            android.view.Window r0 = r0.getWindow()
            r0.getDecorView()
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public void onActivityResult(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            r0 = 0
            throw r0
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int r1, android.view.Menu r2) {
            r0 = this;
            if (r1 == 0) goto L4
            r0 = 1
            return r0
        L4:
            super.onCreatePanelMenu(r1, r2)
            r0.getMenuInflater()
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r1, android.view.MenuItem r2) {
            r0 = this;
            boolean r0 = super.onMenuItemSelected(r1, r2)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            if (r1 == 0) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean r1) {
            r0 = this;
            boolean r0 = r0.f1
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean r2, android.content.res.Configuration r3) {
            r1 = this;
            r0 = 1
            r1.f1 = r0
            r0 = 0
            super.onMultiWindowModeChanged(r2, r3)     // Catch: java.lang.Throwable -> Lb
            r1.f1 = r0
            r1 = 0
            throw r1
        Lb:
            r2 = move-exception
            r1.f1 = r0
            throw r2
    }

    @Override // android.app.Activity
    public final void onNewIntent(android.content.Intent r1) {
            r0 = this;
            super.onNewIntent(r1)
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r1, android.view.Menu r2) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean r1) {
            r0 = this;
            boolean r0 = r0.f0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean r2, android.content.res.Configuration r3) {
            r1 = this;
            r0 = 1
            r1.f0 = r0
            r0 = 0
            super.onPictureInPictureModeChanged(r2, r3)     // Catch: java.lang.Throwable -> Lb
            r1.f0 = r0
            r1 = 0
            throw r1
        Lb:
            r2 = move-exception
            r1.f0 = r0
            throw r2
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int r1, android.view.View r2, android.view.Menu r3) {
            r0 = this;
            if (r1 == 0) goto L4
            r0 = 1
            return r0
        L4:
            super.onPreparePanel(r1, r2, r3)
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int r1, java.lang.String[] r2, int[] r3) {
            r0 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "androidx.activity.result.contract.extra.PERMISSIONS"
            android.content.Intent r0 = r0.putExtra(r1, r2)
            java.lang.String r1 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
            r0.putExtra(r1, r3)
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
            r1 = this;
            ᛳᛴᛱᲀ r0 = r1.f2
            if (r0 != 0) goto Le
            java.lang.Object r1 = r1.getLastNonConfigurationInstance()
            ᛷᛱᛲᛱ r1 = (defpackage.C1198) r1
            if (r1 == 0) goto Le
            ᛳᛴᛱᲀ r0 = r1.f5403
        Le:
            if (r0 != 0) goto L12
            r1 = 0
            return r1
        L12:
            ᛷᛱᛲᛱ r1 = new ᛷᛱᛲᛱ
            r1.<init>()
            r1.f5403 = r0
            return r1
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int r1) {
            r0 = this;
            super.onTrimMemory(r1)
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
            r1 = this;
            boolean r0 = defpackage.AbstractC2258.m3650()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Lb
            java.lang.String r0 = "reportFullyDrawn() for ComponentActivity"
            defpackage.AbstractC2193.m3597(r0)     // Catch: java.lang.Throwable -> L10
        Lb:
            super.reportFullyDrawn()     // Catch: java.lang.Throwable -> L10
            r1 = 0
            throw r1     // Catch: java.lang.Throwable -> L10
        L10:
            r1 = move-exception
            android.os.Trace.endSection()
            throw r1
    }

    @Override // android.app.Activity
    public void setContentView(int r1) {
            r0 = this;
            r0.m5()
            android.view.Window r0 = r0.getWindow()
            r0.getDecorView()
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r1) {
            r0 = this;
            r0.m5()
            android.view.Window r0 = r0.getWindow()
            r0.getDecorView()
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r0.m5()
            android.view.Window r0 = r0.getWindow()
            r0.getDecorView()
            r0 = 0
            throw r0
    }

    @Override // androidx.core.app.ComponentActivity, defpackage.InterfaceC0770
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final androidx.lifecycle.C0005 mo0() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC2120
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0448 mo1() {
            r2 = this;
            android.app.Application r0 = r2.getApplication()
            if (r0 == 0) goto L23
            ᛳᛴᛱᲀ r0 = r2.f2
            if (r0 != 0) goto L22
            java.lang.Object r0 = r2.getLastNonConfigurationInstance()
            ᛷᛱᛲᛱ r0 = (defpackage.C1198) r0
            if (r0 == 0) goto L16
            ᛳᛴᛱᲀ r0 = r0.f5403
            r2.f2 = r0
        L16:
            ᛳᛴᛱᲀ r0 = r2.f2
            if (r0 != 0) goto L22
            ᛳᛴᛱᲀ r0 = new ᛳᛴᛱᲀ
            r1 = 2
            r0.<init>(r1)
            r2.f2 = r0
        L22:
            return r0
        L23:
            java.lang.String r2 = "Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call."
            defpackage.C2264.m3676(r2)
            r2 = 0
            return r2
    }

    @Override // defpackage.InterfaceC1145
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.AbstractC1723 mo2() {
            r3 = this;
            ᛶᲀᛵᛶ r0 = new ᛶᲀᛵᛶ
            ᛴᛳᛷᛱ r1 = defpackage.C0639.f3158
            r2 = 1
            r0.<init>(r2)
            java.lang.Object r2 = r0.f7642
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.lang.Object r1 = r1.f7642
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            r2.putAll(r1)
            android.app.Application r1 = r3.getApplication()
            if (r1 == 0) goto L22
            ᛷᲈᲀ r1 = defpackage.C1403.f6098
            android.app.Application r2 = r3.getApplication()
            r0.m2235(r1, r2)
        L22:
            ᛸᛵᛴᛲ r1 = defpackage.AbstractC1592.f7039
            r0.m2235(r1, r3)
            ᲈᛴᛵᲈ r1 = defpackage.AbstractC1592.f7038
            r0.m2235(r1, r3)
            android.content.Intent r1 = r3.getIntent()
            if (r1 == 0) goto L49
            android.content.Intent r1 = r3.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L49
            ᲁᲁᛷᲈ r1 = defpackage.AbstractC1592.f7037
            android.content.Intent r3 = r3.getIntent()
            android.os.Bundle r3 = r3.getExtras()
            r0.m2235(r1, r3)
        L49:
            return r0
    }

    @Override // defpackage.InterfaceC1734
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final androidx.activity.C0000 mo3() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC1386
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1020 mo4() {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void m5() {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 1711867116(0x660904ec, float:1.6176375E23)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 1711867119(0x660904ef, float:1.617638E23)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 1711867118(0x660904ee, float:1.6176379E23)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 1711867117(0x660904ed, float:1.6176377E23)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 1711866657(0x66090321, float:1.6175548E23)
            r0.setTag(r1, r2)
            return
    }
}

package defpackage;

/* JADX INFO: renamed from: ᲁᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1876 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public defpackage.C1084 f8136;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public defpackage.ComponentCallbacksC1146 f8137;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final java.lang.Object f8138;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public defpackage.ViewOnTouchListenerC1074 f8139;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final android.view.WindowManager.LayoutParams f8140;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final defpackage.RunnableC1274 f8141;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.view.WindowManager f8142;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.C0301 f8143;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.ref.WeakReference f8144;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public defpackage.InterfaceC1261 f8145;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public android.app.Activity f8146;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean f8147;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public java.lang.String f8148;

    public C1876(android.app.Activity r6) {
            r5 = this;
            r5.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            r5.f8144 = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r5.f8138 = r1
            ᛷᛵᛶᛶ r1 = new ᛷᛵᛶᛶ
            r2 = 0
            r1.<init>(r5, r2)
            ᛷᛵᛶᛶ r1 = new ᛷᛵᛶᛶ
            r2 = 1
            r1.<init>(r5, r2)
            r5.f8141 = r1
            r5.f8146 = r6
            ᛲᛵᲈᲈ r1 = new ᛲᛵᲈᲈ
            r1.<init>(r6)
            r5.f8143 = r1
            java.lang.String r1 = "window"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            r5.f8142 = r1
            android.view.WindowManager$LayoutParams r1 = new android.view.WindowManager$LayoutParams
            r1.<init>()
            r5.f8140 = r1
            r2 = -2
            r1.height = r2
            r1.width = r2
            r2 = -3
            r1.format = r2
            r2 = 16973828(0x1030004, float:2.406091E-38)
            r1.windowAnimations = r2
            java.lang.String r2 = r6.getPackageName()
            r1.packageName = r2
            android.view.WindowManager$LayoutParams r1 = r5.f8140
            r2 = 40
            r1.flags = r2
            java.util.ArrayList r1 = defpackage.AbstractC1511.f6677
            java.lang.Class<ᛸᛶᛷᛶ> r1 = defpackage.AbstractC1511.class
            monitor-enter(r1)
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> Lc2
            ᲁᛶᲁ r2 = (defpackage.C1876) r2     // Catch: java.lang.Throwable -> Lc2
            if (r2 != 0) goto L61
            monitor-exit(r1)
            goto L67
        L61:
            java.util.ArrayList r2 = defpackage.AbstractC1511.f6677     // Catch: java.lang.Throwable -> Lc2
            r2.add(r0)     // Catch: java.lang.Throwable -> Lc2
            monitor-exit(r1)
        L67:
            android.view.Window r1 = r6.getWindow()
            android.view.View r1 = r1.getDecorView()
            android.view.Window r2 = r6.getWindow()
            android.view.WindowManager$LayoutParams r2 = r2.getAttributes()
            int r3 = r2.flags
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L85
            int r3 = r1.getSystemUiVisibility()
            r3 = r3 & 4
            if (r3 == 0) goto L90
        L85:
            android.view.WindowManager$LayoutParams r3 = r5.f8140
            int r4 = r3.flags
            r4 = r4 | 1024(0x400, float:1.435E-42)
            r3.flags = r4
            r5.m3285()
        L90:
            int r3 = r2.layoutInDisplayCutoutMode
            android.view.WindowManager$LayoutParams r4 = r5.f8140
            r4.layoutInDisplayCutoutMode = r3
            r5.m3285()
            int r2 = r2.systemUiVisibility
            if (r2 == 0) goto La4
            android.view.WindowManager$LayoutParams r3 = r5.f8140
            r3.systemUiVisibility = r2
            r5.m3285()
        La4:
            int r2 = r1.getSystemUiVisibility()
            if (r2 == 0) goto Lb3
            ᛲᛵᲈᲈ r2 = r5.f8143
            int r1 = r1.getSystemUiVisibility()
            r2.setSystemUiVisibility(r1)
        Lb3:
            ᛶᛶᛱᛱ r1 = new ᛶᛶᛱᛱ
            r1.<init>()
            r1.f4870 = r6
            r1.f4871 = r0
            r5.f8136 = r1
            r6.registerActivityLifecycleCallbacks(r1)
            return
        Lc2:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc2
            throw r5
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final void m3279() {
            r4 = this;
            ᛲᛵᲈᲈ r0 = r4.f8143
            if (r0 != 0) goto L5
            goto L5f
        L5:
            int r0 = r0.getChildCount()
            if (r0 == 0) goto L65
            boolean r0 = r4.f8147
            if (r0 == 0) goto L13
            r4.m3280()
            return
        L13:
            android.app.Activity r0 = r4.f8146
            if (r0 == 0) goto L24
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L5f
            boolean r0 = r0.isDestroyed()
            if (r0 == 0) goto L24
            goto L5f
        L24:
            ᛲᛵᲈᲈ r0 = r4.f8143     // Catch: java.lang.Exception -> L60
            android.view.ViewParent r0 = r0.getParent()     // Catch: java.lang.Exception -> L60
            android.view.WindowManager r1 = r4.f8142
            if (r0 == 0) goto L33
            ᛲᛵᲈᲈ r0 = r4.f8143     // Catch: java.lang.Exception -> L60
            r1.removeViewImmediate(r0)     // Catch: java.lang.Exception -> L60
        L33:
            ᛲᛵᲈᲈ r0 = r4.f8143     // Catch: java.lang.Exception -> L60
            android.view.WindowManager$LayoutParams r2 = r4.f8140     // Catch: java.lang.Exception -> L60
            r1.addView(r0, r2)     // Catch: java.lang.Exception -> L60
            r0 = 1
            r4.f8147 = r0     // Catch: java.lang.Exception -> L60
            ᛶᛵᛵᲇ r0 = r4.f8139     // Catch: java.lang.Exception -> L60
            if (r0 == 0) goto L58
            r0.f4816 = r4     // Catch: java.lang.Exception -> L60
            ᛲᛵᲈᲈ r1 = r4.f8143     // Catch: java.lang.Exception -> L60
            r0.f4815 = r1     // Catch: java.lang.Exception -> L60
            if (r1 != 0) goto L4a
            goto L58
        L4a:
            r1.setOnTouchListener(r0)     // Catch: java.lang.Exception -> L60
            ᛲᛵᲈᲈ r1 = r0.f4815     // Catch: java.lang.Exception -> L60
            ᲁᲈᛳ r2 = new ᲁᲈᛳ     // Catch: java.lang.Exception -> L60
            r3 = 0
            r2.<init>(r3, r0)     // Catch: java.lang.Exception -> L60
            r1.post(r2)     // Catch: java.lang.Exception -> L60
        L58:
            ᛷᛴᲀᛸ r0 = r4.f8145     // Catch: java.lang.Exception -> L60
            if (r0 == 0) goto L5f
            r0.mo1213(r4)     // Catch: java.lang.Exception -> L60
        L5f:
            return
        L60:
            r4 = move-exception
            r4.printStackTrace()
            return
        L65:
            java.lang.String r4 = "WindowParams and view cannot be empty"
            defpackage.C2264.m3684(r4)
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final void m3280() {
            r2 = this;
            boolean r0 = r2.f8147
            if (r0 != 0) goto L5
            return
        L5:
            android.view.WindowManager r0 = r2.f8142     // Catch: java.lang.IllegalArgumentException -> Lf
            ᛲᛵᲈᲈ r1 = r2.f8143     // Catch: java.lang.IllegalArgumentException -> Lf
            android.view.WindowManager$LayoutParams r2 = r2.f8140     // Catch: java.lang.IllegalArgumentException -> Lf
            r0.updateViewLayout(r1, r2)     // Catch: java.lang.IllegalArgumentException -> Lf
            return
        Lf:
            r2 = move-exception
            r2.printStackTrace()
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m3281() {
            r2 = this;
            android.view.WindowManager$LayoutParams r0 = r2.f8140
            r1 = 32
            r0.softInputMode = r1
            int r1 = r0.flags
            r1 = r1 & (-9)
            r0.flags = r1
            r2.m3285()
            r2.m3285()
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m3282(android.widget.LinearLayout r5) {
            r4 = this;
            ᛲᛵᲈᲈ r0 = r4.f8143
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r0.getChildCount()
            if (r0 <= 0) goto L10
            ᛲᛵᲈᲈ r0 = r4.f8143
            r0.removeAllViews()
        L10:
            ᛲᛵᲈᲈ r0 = r4.f8143
            r0.addView(r5)
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            boolean r0 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L29
            r0 = r5
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r1 = 0
            r0.topMargin = r1
            r0.bottomMargin = r1
            r0.leftMargin = r1
            r0.rightMargin = r1
        L29:
            android.view.WindowManager$LayoutParams r0 = r4.f8140
            int r1 = r0.gravity
            if (r1 != 0) goto L52
            boolean r2 = r5 instanceof android.widget.FrameLayout.LayoutParams
            r3 = -1
            if (r2 == 0) goto L3e
            r2 = r5
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r2 = r2.gravity
            if (r2 == r3) goto L4c
            r0.gravity = r2
            goto L4b
        L3e:
            boolean r2 = r5 instanceof android.widget.LinearLayout.LayoutParams
            if (r2 == 0) goto L4c
            r2 = r5
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            int r2 = r2.gravity
            if (r2 == r3) goto L4c
            r0.gravity = r2
        L4b:
            r1 = r2
        L4c:
            if (r1 != 0) goto L52
            r1 = 17
            r0.gravity = r1
        L52:
            if (r5 == 0) goto L6c
            int r1 = r0.width
            r2 = -2
            if (r1 != r2) goto L66
            int r3 = r0.height
            if (r3 != r2) goto L66
            int r1 = r5.width
            r0.width = r1
            int r5 = r5.height
            r0.height = r5
            goto L6c
        L66:
            r5.width = r1
            int r0 = r0.height
            r5.height = r0
        L6c:
            r4.m3285()
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m3283() {
            r3 = this;
            java.lang.Object r0 = r3.f8138
            android.os.Handler r1 = defpackage.AbstractC0206.f1279
            r1.removeCallbacksAndMessages(r0)
            boolean r0 = r3.f8147
            if (r0 == 0) goto Le
            r3.m3284()
        Le:
            ᛶᲀᲁᛶ r0 = r3.f8137
            r1 = 0
            if (r0 == 0) goto L2c
            android.app.Activity r2 = r3.f8146
            if (r2 != 0) goto L18
            goto L2a
        L18:
            android.content.Context r2 = r2.getApplicationContext()
            if (r2 == 0) goto L21
            r2.unregisterComponentCallbacks(r0)
        L21:
            java.lang.ref.WeakReference r2 = r0.f5238
            if (r2 == 0) goto L28
            r2.clear()
        L28:
            r0.f5238 = r1
        L2a:
            r3.f8137 = r1
        L2c:
            ᛷᛴᲀᛸ r0 = r3.f8145
            if (r0 == 0) goto L35
            r0.mo2362()
            r3.f8145 = r1
        L35:
            ᛶᛶᛱᛱ r0 = r3.f8136
            if (r0 == 0) goto L43
            android.app.Activity r2 = r0.f4870
            if (r2 != 0) goto L3e
            goto L41
        L3e:
            r2.unregisterActivityLifecycleCallbacks(r0)
        L41:
            r3.f8136 = r1
        L43:
            ᛶᛵᛵᲇ r0 = r3.f8139
            if (r0 == 0) goto L54
            r0.f4816 = r1
            ᛲᛵᲈᲈ r2 = r0.f4815
            if (r2 == 0) goto L52
            r2.setOnTouchListener(r1)
            r0.f4815 = r1
        L52:
            r3.f8139 = r1
        L54:
            r3.f8146 = r1
            r3.f8143 = r1
            java.lang.ref.WeakReference r3 = r3.f8144
            java.util.ArrayList r0 = defpackage.AbstractC1511.f6677
            java.lang.Class<ᛸᛶᛷᛶ> r0 = defpackage.AbstractC1511.class
            monitor-enter(r0)
            r3.clear()     // Catch: java.lang.Throwable -> L69
            java.util.ArrayList r1 = defpackage.AbstractC1511.f6677     // Catch: java.lang.Throwable -> L69
            r1.remove(r3)     // Catch: java.lang.Throwable -> L69
            monitor-exit(r0)
            return
        L69:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            throw r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3284() {
            r3 = this;
            boolean r0 = r3.f8147
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            android.view.WindowManager r1 = r3.f8142     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
            ᛲᛵᲈᲈ r2 = r3.f8143     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
            r1.removeViewImmediate(r2)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
            ᛷᛴᲀᛸ r1 = r3.f8145     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
            if (r1 == 0) goto L19
            r1.mo2363()     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
            goto L19
        L15:
            r1 = move-exception
            goto L22
        L17:
            r1 = move-exception
            goto L1c
        L19:
            r3.f8147 = r0
            return
        L1c:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L15
            r3.f8147 = r0
            return
        L22:
            r3.f8147 = r0
            throw r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m3285() {
            r4 = this;
            boolean r0 = r4.f8147
            if (r0 != 0) goto L5
            return
        L5:
            android.os.Handler r0 = defpackage.AbstractC0206.f1279
            ᛷᛵᛶᛶ r1 = r4.f8141
            r0.removeCallbacks(r1)
            java.lang.Object r4 = r4.f8138
            long r2 = android.os.SystemClock.uptimeMillis()
            r0.postAtTime(r1, r4, r2)
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void m3286(defpackage.ViewOnTouchListenerC1074 r4) {
            r3 = this;
            r3.f8139 = r4
            android.view.WindowManager$LayoutParams r0 = r3.f8140
            int r1 = r0.flags
            r1 = r1 & (-17)
            r0.flags = r1
            r3.m3285()
            int r1 = r0.flags
            r1 = r1 & (-513(0xfffffffffffffdff, float:NaN))
            r0.flags = r1
            r3.m3285()
            boolean r0 = r3.f8147
            if (r0 == 0) goto L34
            r3.m3280()
            r4.f4816 = r3
            ᛲᛵᲈᲈ r0 = r3.f8143
            r4.f4815 = r0
            if (r0 != 0) goto L26
            goto L34
        L26:
            r0.setOnTouchListener(r4)
            ᛲᛵᲈᲈ r0 = r4.f4815
            ᲁᲈᛳ r1 = new ᲁᲈᛳ
            r2 = 0
            r1.<init>(r2, r4)
            r0.post(r1)
        L34:
            android.app.Activity r4 = r3.f8146
            r0 = 0
            if (r4 == 0) goto L3e
            android.content.res.Resources r4 = r4.getResources()
            goto L3f
        L3e:
            r4 = r0
        L3f:
            if (r4 == 0) goto L45
            android.content.res.Configuration r0 = r4.getConfiguration()
        L45:
            if (r0 == 0) goto L6b
            ᛶᲀᲁᛶ r4 = r3.f8137
            if (r4 != 0) goto L56
            ᛶᲀᲁᛶ r4 = new ᛶᲀᲁᛶ
            int r0 = r0.orientation
            r4.<init>()
            r4.f5239 = r0
            r3.f8137 = r4
        L56:
            android.app.Activity r0 = r3.f8146
            if (r0 != 0) goto L5b
            goto L6b
        L5b:
            android.content.Context r0 = r0.getApplicationContext()
            if (r0 == 0) goto L64
            r0.registerComponentCallbacks(r4)
        L64:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r4.f5238 = r0
        L6b:
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m3287(int r3, int r4) {
            r2 = this;
            android.view.WindowManager$LayoutParams r0 = r2.f8140
            r1 = 51
            r0.gravity = r1
            r0.x = r3
            r0.y = r4
            r2.m3285()
            ᛷᛵᛶᛶ r3 = new ᛷᛵᛶᛶ
            r4 = 2
            r3.<init>(r2, r4)
            android.os.Handler r4 = defpackage.AbstractC0206.f1279
            long r0 = android.os.SystemClock.uptimeMillis()
            android.os.Handler r4 = defpackage.AbstractC0206.f1279
            java.lang.Object r2 = r2.f8138
            r4.postAtTime(r3, r2, r0)
            return
    }
}

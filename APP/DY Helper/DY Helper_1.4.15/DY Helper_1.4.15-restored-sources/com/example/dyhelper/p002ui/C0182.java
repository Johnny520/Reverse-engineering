package com.example.dyhelper.p002ui;

/* JADX INFO: renamed from: com.example.dyhelper.ui.а */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0182 {

    /* JADX INFO: renamed from: α */
    public static final android.os.Handler f2694 = null;

    /* JADX INFO: renamed from: β */
    public static java.lang.ref.WeakReference f2695;

    /* JADX INFO: renamed from: γ */
    public static com.example.dyhelper.p002ui.TopDownloadNotificationManager$TopNoticeHostView f2696;

    /* JADX INFO: renamed from: δ */
    public static final java.util.LinkedHashMap f2697 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.LinkedHashMap f2698 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.LinkedHashSet f2699 = null;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.example.dyhelper.p002ui.C0182.f2694 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            com.example.dyhelper.p002ui.C0182.f2697 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            com.example.dyhelper.p002ui.C0182.f2698 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            com.example.dyhelper.p002ui.C0182.f2699 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.util.List m1588() {
            java.util.LinkedHashMap r0 = com.example.dyhelper.p002ui.C0182.f2697
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r0.next()
            r3 = r2
            e52 r3 = (p000.e52) r3
            java.util.LinkedHashSet r4 = com.example.dyhelper.p002ui.C0182.f2699
            java.lang.String r3 = r3.f3412
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L14
            r1.add(r2)
            goto L14
        L2f:
            qy1 r0 = new qy1
            r2 = 5
            r0.<init>(r2)
            jd1 r2 = new jd1
            r3 = 10
            r2.<init>(r3, r0)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static int m1589(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static void m1590(android.app.Activity r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r9.getClass()
            r12.getClass()
            java.lang.String r1 = m1593(r10)
            boolean r10 = p000.q02.m4671(r12)
            if (r10 == 0) goto L12
            java.lang.String r12 = "请稍后重试"
        L12:
            r3 = r12
            d52 r0 = new d52
            r4 = -1
            f52 r5 = p000.f52.f3755
            r7 = 2200(0x898, double:1.087E-320)
            r6 = r9
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            m1597(r0)
            return
    }

    /* JADX INFO: renamed from: δ */
    public static void m1591(android.app.Activity r1, java.lang.String r2, java.lang.String r3) {
            r1.getClass()
            java.lang.String r0 = m1592(r2)
            m1590(r1, r0, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.String m1592(java.lang.String r1) {
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            boolean r0 = p000.q02.m4671(r1)
            if (r0 != 0) goto Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r1 != 0) goto L14
            java.lang.String r1 = "default"
        L14:
            java.lang.String r0 = "legacy:"
            java.lang.String r1 = r0.concat(r1)
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.String m1593(java.lang.String r1) {
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            boolean r0 = p000.q02.m4671(r1)
            if (r0 != 0) goto Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r1 != 0) goto L14
            java.lang.String r1 = "default"
        L14:
            return r1
    }

    /* JADX INFO: renamed from: η */
    public static p000.g52 m1594(android.app.Activity r5) {
            g52 r0 = new g52
            r1 = 0
            r2 = 62
            boolean r3 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = "download_top_notification_alpha"
            if (r3 == 0) goto L18
            android.content.SharedPreferences r5 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L16
            int r5 = r5.getInt(r4, r2)     // Catch: java.lang.Throwable -> L16
            goto L26
        L16:
            r5 = r2
            goto L26
        L18:
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = "dyhelper_prefs"
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r3, r1)     // Catch: java.lang.Throwable -> L2b
            int r5 = r5.getInt(r4, r2)     // Catch: java.lang.Throwable -> L2b
        L26:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2b
            goto L32
        L2b:
            r5 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r5)
            r5 = r3
        L32:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r3 = r5 instanceof p000.eo1
            if (r3 == 0) goto L3b
            r5 = r2
        L3b:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r2 = 100
            int r5 = p000.j81.m2906(r5, r1, r2)
            r0.<init>(r5)
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static void m1595() {
            com.example.dyhelper.ui.TopDownloadNotificationManager$TopNoticeHostView r0 = com.example.dyhelper.p002ui.C0182.f2696
            r1 = 0
            if (r0 == 0) goto La
            android.view.ViewParent r2 = r0.getParent()
            goto Lb
        La:
            r2 = r1
        Lb:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L12
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L13
        L12:
            r2 = r1
        L13:
            if (r2 != 0) goto L21
            java.lang.ref.WeakReference r2 = com.example.dyhelper.p002ui.C0182.f2695
            if (r2 == 0) goto L20
            java.lang.Object r2 = r2.get()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L21
        L20:
            r2 = r1
        L21:
            if (r0 == 0) goto L28
            if (r2 == 0) goto L28
            r2.removeView(r0)     // Catch: java.lang.Throwable -> L28
        L28:
            com.example.dyhelper.p002ui.C0182.f2696 = r1
            com.example.dyhelper.p002ui.C0182.f2695 = r1
            return
    }

    /* JADX INFO: renamed from: ι */
    public static void m1596(android.app.Activity r10, boolean r11) {
            java.util.List r0 = m1588()
            r1 = 3
            java.util.List r0 = p000.AbstractC0984xh.m6662(r0, r1)
            java.util.List r2 = m1588()
            int r2 = r2.size()
            int r2 = r2 - r1
            if (r2 >= 0) goto L15
            r2 = 0
        L15:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L29
            com.example.dyhelper.ui.TopDownloadNotificationManager$TopNoticeHostView r10 = com.example.dyhelper.p002ui.C0182.f2696
            if (r10 == 0) goto Lc5
            tv1 r11 = new tv1
            r0 = 6
            r11.<init>(r0)
            r10.m1572(r11)
            return
        L29:
            android.view.Window r1 = r10.getWindow()
            r3 = 0
            if (r1 == 0) goto L35
            android.view.View r1 = r1.getDecorView()
            goto L36
        L35:
            r1 = r3
        L36:
            boolean r4 = r1 instanceof android.view.ViewGroup
            if (r4 == 0) goto L3d
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L3e
        L3d:
            r1 = r3
        L3e:
            if (r1 != 0) goto L42
            goto Lc3
        L42:
            com.example.dyhelper.ui.TopDownloadNotificationManager$TopNoticeHostView r4 = com.example.dyhelper.p002ui.C0182.f2696
            if (r4 == 0) goto L4e
            android.view.ViewParent r5 = r4.getParent()
            if (r5 != r1) goto L4e
        L4c:
            r3 = r4
            goto Lc3
        L4e:
            m1595()
            com.example.dyhelper.ui.TopDownloadNotificationManager$TopNoticeHostView r4 = new com.example.dyhelper.ui.TopDownloadNotificationManager$TopNoticeHostView     // Catch: java.lang.Throwable -> Lad
            g52 r5 = m1594(r10)     // Catch: java.lang.Throwable -> Lad
            tv1 r6 = new tv1     // Catch: java.lang.Throwable -> Lad
            r7 = 7
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lad
            r4.<init>(r10, r5, r6)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r5 = "dyhelper_top_download_notification_host"
            r4.setTag(r5)     // Catch: java.lang.Throwable -> Lad
            android.content.res.Resources r5 = r10.getResources()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r6 = "status_bar_height"
            java.lang.String r7 = "dimen"
            java.lang.String r8 = "android"
            int r5 = r5.getIdentifier(r6, r7, r8)     // Catch: java.lang.Throwable -> Lad
            if (r5 <= 0) goto L7e
            android.content.res.Resources r6 = r10.getResources()     // Catch: java.lang.Throwable -> Lad
            int r5 = r6.getDimensionPixelSize(r5)     // Catch: java.lang.Throwable -> Lad
            goto L84
        L7e:
            r5 = 1103101952(0x41c00000, float:24.0)
            int r5 = m1589(r10, r5)     // Catch: java.lang.Throwable -> Lad
        L84:
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> Lad
            r7 = -2
            r8 = 48
            r9 = -1
            r6.<init>(r9, r7, r8)     // Catch: java.lang.Throwable -> Lad
            r7 = 1086324736(0x40c00000, float:6.0)
            int r7 = m1589(r10, r7)     // Catch: java.lang.Throwable -> Lad
            r8 = 1077936128(0x40400000, float:3.0)
            int r10 = m1589(r10, r8)     // Catch: java.lang.Throwable -> Lad
            int r5 = r5 - r10
            int r10 = java.lang.Math.max(r7, r5)     // Catch: java.lang.Throwable -> Lad
            r6.topMargin = r10     // Catch: java.lang.Throwable -> Lad
            r1.addView(r4, r6)     // Catch: java.lang.Throwable -> Lad
            java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> Lad
            r10.<init>(r1)     // Catch: java.lang.Throwable -> Lad
            com.example.dyhelper.p002ui.C0182.f2695 = r10     // Catch: java.lang.Throwable -> Lad
            com.example.dyhelper.p002ui.C0182.f2696 = r4     // Catch: java.lang.Throwable -> Lad
            goto L4c
        Lad:
            r10 = move-exception
            java.lang.String r10 = r10.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "DYHelper: 顶部通知添加失败: "
            r1.<init>(r4)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            p000.C0888ux.m5974(r10)
        Lc3:
            if (r3 != 0) goto Lc6
        Lc5:
            return
        Lc6:
            r3.m1574(r0, r2, r11)
            return
    }

    /* JADX INFO: renamed from: κ */
    public static void m1597(p000.p70 r2) {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L12
            r2.invoke()
            return
        L12:
            r0 r0 = new r0
            r1 = 7
            r0.<init>(r1, r2)
            android.os.Handler r2 = com.example.dyhelper.p002ui.C0182.f2694
            r2.post(r0)
            return
    }

    /* JADX INFO: renamed from: λ */
    public static void m1598(int r1, android.app.Activity r2, java.lang.String r3, java.lang.String r4) {
            r2.getClass()
            java.lang.String r0 = m1592(r3)
            m1599(r1, r2, r0, r3, r4)
            return
    }

    /* JADX INFO: renamed from: μ */
    public static void m1599(int r7, android.app.Activity r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r8.getClass()
            java.lang.String r1 = m1593(r9)
            r9 = -1
            r0 = 100
            int r4 = p000.j81.m2906(r7, r9, r0)
            by0 r0 = new by0
            r6 = 1
            r5 = r8
            r2 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            m1597(r0)
            return
    }

    /* JADX INFO: renamed from: ν */
    public static void m1600(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11) {
            r7.getClass()
            r9.getClass()
            r10.getClass()
            boolean r0 = r7 instanceof android.app.Activity
            if (r0 == 0) goto L11
            android.app.Activity r7 = (android.app.Activity) r7
        Lf:
            r5 = r7
            goto L13
        L11:
            r7 = 0
            goto Lf
        L13:
            if (r5 != 0) goto L16
            return
        L16:
            java.lang.String r1 = m1593(r8)
            r7 = -1
            r8 = 100
            int r4 = p000.j81.m2906(r11, r7, r8)
            by0 r0 = new by0
            r6 = 0
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            m1597(r0)
            return
    }

    /* JADX INFO: renamed from: ξ */
    public static void m1601(java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, p000.f52 r15) {
            java.util.LinkedHashMap r10 = com.example.dyhelper.p002ui.C0182.f2697
            java.lang.Object r0 = r10.remove(r11)
            e52 r0 = (p000.e52) r0
            if (r0 != 0) goto Lf
            java.util.LinkedHashSet r2 = com.example.dyhelper.p002ui.C0182.f2699
            r2.remove(r11)
        Lf:
            e52 r2 = new e52
            r3 = -1
            r4 = 100
            int r4 = p000.j81.m2906(r14, r3, r4)
            if (r0 == 0) goto L1e
            long r5 = r0.f3417
        L1c:
            r6 = r5
            goto L23
        L1e:
            long r5 = java.lang.System.currentTimeMillis()
            goto L1c
        L23:
            long r8 = java.lang.System.currentTimeMillis()
            r1 = r11
            r3 = r13
            r5 = r15
            r0 = r2
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            r10.put(r11, r0)
            return
    }
}

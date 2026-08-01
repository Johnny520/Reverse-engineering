package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class il0 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f5108 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.Set f5109 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.il0.f5108 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            p000.il0.f5109 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m2760(android.app.Activity r4) {
            r0 = 0
            boolean r1 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Le
            java.lang.String r1 = "immersive_status_bar_enabled"
            boolean r1 = p000.ui1.m5887(r1, r0)     // Catch: java.lang.Throwable -> Le
            goto Lf
        Le:
            r1 = r0
        Lf:
            boolean r2 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1b
            java.lang.String r2 = "immersive_navigation_bar_enabled"
            boolean r0 = p000.ui1.m5887(r2, r0)     // Catch: java.lang.Throwable -> L1b
        L1b:
            if (r1 != 0) goto L61
            if (r0 == 0) goto L20
            goto L61
        L20:
            android.view.Window r4 = r4.getWindow()
            if (r4 != 0) goto L27
            goto L80
        L27:
            r0 = 1
            r4.setDecorFitsSystemWindows(r0)     // Catch: java.lang.Throwable -> L56
            android.view.WindowInsetsController r0 = r4.getInsetsController()     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L39
            android.view.View r0 = r4.getDecorView()     // Catch: java.lang.Throwable -> L56
            android.view.WindowInsetsController r0 = r0.getWindowInsetsController()     // Catch: java.lang.Throwable -> L56
        L39:
            if (r0 == 0) goto L47
            int r1 = android.view.WindowInsets.Type.statusBars()     // Catch: java.lang.Throwable -> L56
            int r2 = android.view.WindowInsets.Type.navigationBars()     // Catch: java.lang.Throwable -> L56
            r1 = r1 | r2
            r0.show(r1)     // Catch: java.lang.Throwable -> L56
        L47:
            android.view.View r0 = r4.getDecorView()     // Catch: java.lang.Throwable -> L56
            ν r1 = new ν     // Catch: java.lang.Throwable -> L56
            r2 = 20
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L56
            r0.post(r1)     // Catch: java.lang.Throwable -> L56
            goto L80
        L56:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            java.lang.String r0 = "r1b353e12c09e991a"
        L5d:
            p000.AbstractC0602nx.m4142(r0, r4)
            goto L80
        L61:
            android.view.Window r4 = r4.getWindow()
            if (r4 != 0) goto L68
            goto L80
        L68:
            m2761(r4, r1, r0)     // Catch: java.lang.Throwable -> L78
            android.view.View r2 = r4.getDecorView()     // Catch: java.lang.Throwable -> L78
            hl0 r3 = new hl0     // Catch: java.lang.Throwable -> L78
            r3.<init>(r4, r1, r0)     // Catch: java.lang.Throwable -> L78
            r2.post(r3)     // Catch: java.lang.Throwable -> L78
            goto L80
        L78:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            java.lang.String r0 = "r772aa46bd612940c"
            goto L5d
        L80:
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m2761(android.view.Window r2, boolean r3, boolean r4) {
            r0 = 0
            r2.setDecorFitsSystemWindows(r0)
            android.view.WindowInsetsController r1 = r2.getInsetsController()
            if (r1 != 0) goto L12
            android.view.View r1 = r2.getDecorView()
            android.view.WindowInsetsController r1 = r1.getWindowInsetsController()
        L12:
            if (r1 != 0) goto L3a
            r0 = 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L23
            r2.addFlags(r0)
            r0 = 2048(0x800, float:2.87E-42)
            r2.clearFlags(r0)
            r0 = 1284(0x504, float:1.799E-42)
            goto L28
        L23:
            r2.clearFlags(r0)
            r0 = 256(0x100, float:3.59E-43)
        L28:
            if (r4 == 0) goto L2c
            r0 = r0 | 514(0x202, float:7.2E-43)
        L2c:
            if (r3 != 0) goto L30
            if (r4 == 0) goto L32
        L30:
            r0 = r0 | 4096(0x1000, float:5.74E-42)
        L32:
            android.view.View r2 = r2.getDecorView()
            r2.setSystemUiVisibility(r0)
            return
        L3a:
            if (r3 == 0) goto L40
            int r0 = android.view.WindowInsets.Type.statusBars()
        L40:
            if (r4 == 0) goto L47
            int r2 = android.view.WindowInsets.Type.navigationBars()
            r0 = r0 | r2
        L47:
            if (r0 == 0) goto L4c
            r1.hide(r0)
        L4c:
            r2 = 2
            r1.setSystemBarsBehavior(r2)
            return
    }

    /* JADX INFO: renamed from: γ */
    public static void m2762() {
            oj0 r0 = new oj0
            r1 = 7
            r0.<init>(r1)
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            java.lang.String r2 = "onCreate"
            p000.qe0.m4873(r1, r2, r0)
            oj0 r0 = new oj0
            r2 = 8
            r0.<init>(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "onResume"
            p000.qe0.m4873(r1, r2, r0)
            oj0 r0 = new oj0
            r2 = 9
            r0.<init>(r2)
            java.lang.Class r2 = java.lang.Boolean.TYPE
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.String r2 = "onWindowFocusChanged"
            p000.qe0.m4873(r1, r2, r0)
            oj0 r0 = new oj0
            r2 = 10
            r0.<init>(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "onDestroy"
            p000.qe0.m4873(r1, r2, r0)
            return
    }
}

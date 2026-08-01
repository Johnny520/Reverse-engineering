package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class tw0 {

    /* JADX INFO: renamed from: α */
    public static final java.util.Set f10476 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.Set f10477 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f10478 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.atomic.AtomicBoolean f10479 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.atomic.AtomicBoolean f10480 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.lang.String f10481 = null;

    static {
            java.lang.String r0 = "~79F5E25B4ED201D89B6CE77FECC600ECA88AB6F7485F4A97"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~79E12C8E079FE6A48D2A4BA59CF063B7FD3CDFA2905F3880B8C578874D"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.tw0.f10476 = r0
            java.lang.String r0 = "BlacklistVerifier"
            java.lang.String r1 = "UserUidFetcher"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.tw0.f10477 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.tw0.f10478 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.tw0.f10479 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.tw0.f10480 = r0
            ef0 r0 = p000.ef0.f3529
            java.lang.String r1 = "~7918AA8296C85B92707DC4C904CE4F6B863956D476D464A4B4FA8248966EA0F63C4AD8"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String r0 = r0.m1919(r1)
            p000.tw0.f10481 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static android.content.Context m5755() {
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = p000.qe0.m4876(r0, r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "currentActivityThread"
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L23
            java.lang.Object r2 = p000.qe0.m4870(r1, r2, r4)     // Catch: java.lang.Throwable -> L23
            if (r2 != 0) goto L14
        L12:
            r1 = r0
            goto L3d
        L14:
            java.lang.String r4 = "currentApplication"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = p000.qe0.m4870(r1, r4, r5)     // Catch: java.lang.Throwable -> L23
            boolean r4 = r1 instanceof android.content.Context     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L25
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            r1 = move-exception
            goto L37
        L25:
            r1 = r0
        L26:
            if (r1 != 0) goto L3d
            java.lang.String r1 = "getSystemContext"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = p000.qe0.m4869(r2, r1, r3)     // Catch: java.lang.Throwable -> L23
            boolean r2 = r1 instanceof android.content.Context     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L12
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> L23
            goto L3d
        L37:
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L3d:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L42
            goto L43
        L42:
            r0 = r1
        L43:
            android.content.Context r0 = (android.content.Context) r0
            return r0
    }
}

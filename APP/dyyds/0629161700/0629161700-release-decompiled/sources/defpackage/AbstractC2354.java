package defpackage;

/* JADX INFO: renamed from: ᲈᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2354 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static boolean f10156;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static final java.lang.Object f10157 = null;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final defpackage.C2048 f10158 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static defpackage.C1509 f10159;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final int f10160 = 0;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.ExecutorC0456 f10161 = null;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final java.lang.Object f10162 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static defpackage.C1509 f10163;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static java.lang.Boolean f10164;

    static {
            ᛳᛴᛶᛲ r0 = new ᛳᛴᛶᛲ
            ᲁᛲᛵᛵ r1 = new ᲁᛲᛵᛵ
            r2 = 0
            r1.<init>(r2)
            r0.<init>(r1)
            defpackage.AbstractC2354.f10161 = r0
            r0 = -100
            defpackage.AbstractC2354.f10160 = r0
            r0 = 0
            defpackage.AbstractC2354.f10159 = r0
            defpackage.AbstractC2354.f10163 = r0
            defpackage.AbstractC2354.f10164 = r0
            r0 = 0
            defpackage.AbstractC2354.f10156 = r0
            ᲇᛵᛲᛲ r0 = new ᲇᛵᛲᛲ
            r0.<init>()
            defpackage.AbstractC2354.f10158 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.AbstractC2354.f10162 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.AbstractC2354.f10157 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static void m3851(defpackage.LayoutInflaterFactory2C1411 r3) {
            java.lang.Object r0 = defpackage.AbstractC2354.f10162
            monitor-enter(r0)
            ᲇᛵᛲᛲ r1 = defpackage.AbstractC2354.f10158     // Catch: java.lang.Throwable -> L27
            r1.getClass()     // Catch: java.lang.Throwable -> L27
            ᛴᛳᛵᲁ r2 = new ᛴᛳᛵᲁ     // Catch: java.lang.Throwable -> L27
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L27
        Ld:
            boolean r1 = r2.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L29
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L27
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch: java.lang.Throwable -> L27
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L27
            ᲈᲇᲀ r1 = (defpackage.AbstractC2354) r1     // Catch: java.lang.Throwable -> L27
            if (r1 == r3) goto L23
            if (r1 != 0) goto Ld
        L23:
            r2.remove()     // Catch: java.lang.Throwable -> L27
            goto Ld
        L27:
            r3 = move-exception
            goto L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static boolean m3852(android.content.Context r4) {
            java.lang.Boolean r0 = defpackage.AbstractC2354.f10164
            if (r0 != 0) goto L37
            int r0 = defpackage.AbstractServiceC2143.f9116     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            int r0 = defpackage.AbstractC0342.m1008()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            r0 = r0 | 128(0x80, float:1.8E-43)
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            java.lang.Class<ᲇᲇᛴᲇ> r3 = defpackage.AbstractServiceC2143.class
            r2.<init>(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            android.content.pm.ServiceInfo r4 = r1.getServiceInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            android.os.Bundle r4 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            if (r4 == 0) goto L37
            java.lang.String r0 = "autoStoreLocales"
            boolean r4 = r4.getBoolean(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            defpackage.AbstractC2354.f10164 = r4     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            goto L37
        L2c:
            java.lang.String r4 = "AppCompatDelegate"
            java.lang.String r0 = "Checking for metadata for AppLocalesMetadataHolderService : Service not found"
            android.util.Log.d(r4, r0)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            defpackage.AbstractC2354.f10164 = r4
        L37:
            java.lang.Boolean r4 = defpackage.AbstractC2354.f10164
            boolean r4 = r4.booleanValue()
            return r4
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public abstract void mo2572(android.view.View r1, android.view.ViewGroup.LayoutParams r2);

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public abstract void mo2575(java.lang.CharSequence r1);

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public abstract boolean mo2583(int r1);

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public abstract void mo2592();

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public abstract void mo2593(int r1);

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public abstract void mo2596(android.view.View r1);
}

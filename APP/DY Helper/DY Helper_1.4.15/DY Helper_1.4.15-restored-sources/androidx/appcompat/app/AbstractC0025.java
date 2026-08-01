package androidx.appcompat.app;

/* JADX INFO: renamed from: androidx.appcompat.app.α */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0025 {

    /* JADX INFO: renamed from: ε */
    public static final p000.ExecutorC0859u4 f361 = null;

    /* JADX INFO: renamed from: ζ */
    public static final int f362 = 0;

    /* JADX INFO: renamed from: η */
    public static p000.cv0 f363;

    /* JADX INFO: renamed from: θ */
    public static p000.cv0 f364;

    /* JADX INFO: renamed from: ι */
    public static java.lang.Boolean f365;

    /* JADX INFO: renamed from: κ */
    public static boolean f366;

    /* JADX INFO: renamed from: λ */
    public static final p000.C0202d7 f367 = null;

    /* JADX INFO: renamed from: μ */
    public static final java.lang.Object f368 = null;

    /* JADX INFO: renamed from: ν */
    public static final java.lang.Object f369 = null;

    static {
            u4 r0 = new u4
            v4 r1 = new v4
            r1.<init>()
            r0.<init>(r1)
            androidx.appcompat.app.AbstractC0025.f361 = r0
            r0 = -100
            androidx.appcompat.app.AbstractC0025.f362 = r0
            r0 = 0
            androidx.appcompat.app.AbstractC0025.f363 = r0
            androidx.appcompat.app.AbstractC0025.f364 = r0
            androidx.appcompat.app.AbstractC0025.f365 = r0
            r0 = 0
            androidx.appcompat.app.AbstractC0025.f366 = r0
            d7 r1 = new d7
            r1.<init>(r0)
            androidx.appcompat.app.AbstractC0025.f367 = r1
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.appcompat.app.AbstractC0025.f368 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.appcompat.app.AbstractC0025.f369 = r0
            return
    }

    /* JADX INFO: renamed from: β */
    public static boolean m198(android.content.Context r4) {
            java.lang.Boolean r0 = androidx.appcompat.app.AbstractC0025.f365
            if (r0 != 0) goto L37
            int r0 = androidx.appcompat.app.AppLocalesMetadataHolderService.f360     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            int r0 = p000.AbstractC0575n6.m3995()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            r0 = r0 | 128(0x80, float:1.8E-43)
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            java.lang.Class<androidx.appcompat.app.AppLocalesMetadataHolderService> r3 = androidx.appcompat.app.AppLocalesMetadataHolderService.class
            r2.<init>(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            android.content.pm.ServiceInfo r4 = r1.getServiceInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            android.os.Bundle r4 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            if (r4 == 0) goto L37
            java.lang.String r0 = "autoStoreLocales"
            boolean r4 = r4.getBoolean(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            androidx.appcompat.app.AbstractC0025.f365 = r4     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            goto L37
        L2c:
            java.lang.String r4 = "AppCompatDelegate"
            java.lang.String r0 = "Checking for metadata for AppLocalesMetadataHolderService : Service not found"
            android.util.Log.d(r4, r0)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            androidx.appcompat.app.AbstractC0025.f365 = r4
        L37:
            java.lang.Boolean r4 = androidx.appcompat.app.AbstractC0025.f365
            boolean r4 = r4.booleanValue()
            return r4
    }

    /* JADX INFO: renamed from: ζ */
    public static void m199(androidx.appcompat.app.LayoutInflaterFactory2C0026 r3) {
            java.lang.Object r0 = androidx.appcompat.app.AbstractC0025.f368
            monitor-enter(r0)
            d7 r1 = androidx.appcompat.app.AbstractC0025.f367     // Catch: java.lang.Throwable -> L27
            r1.getClass()     // Catch: java.lang.Throwable -> L27
            y6 r2 = new y6     // Catch: java.lang.Throwable -> L27
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L27
        Ld:
            boolean r1 = r2.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L29
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L27
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch: java.lang.Throwable -> L27
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L27
            androidx.appcompat.app.α r1 = (androidx.appcompat.app.AbstractC0025) r1     // Catch: java.lang.Throwable -> L27
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

    /* JADX INFO: renamed from: α */
    public abstract void mo200();

    /* JADX INFO: renamed from: γ */
    public abstract void mo201();

    /* JADX INFO: renamed from: ε */
    public abstract void mo202();

    /* JADX INFO: renamed from: η */
    public abstract boolean mo203(int r1);

    /* JADX INFO: renamed from: ι */
    public abstract void mo204(int r1);

    /* JADX INFO: renamed from: κ */
    public abstract void mo205(android.view.View r1);

    /* JADX INFO: renamed from: λ */
    public abstract void mo206(android.view.View r1, android.view.ViewGroup.LayoutParams r2);

    /* JADX INFO: renamed from: μ */
    public abstract void mo207(java.lang.CharSequence r1);
}

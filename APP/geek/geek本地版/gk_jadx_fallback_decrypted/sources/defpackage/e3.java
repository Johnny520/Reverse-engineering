package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class e3 {
    public static final defpackage.u5 a = null;
    public static final int b = 0;
    public static defpackage.sr c;
    public static defpackage.sr d;
    public static java.lang.Boolean e;
    public static boolean f;
    public static final defpackage.q6 g = null;
    public static final java.lang.Object h = null;
    public static final java.lang.Object i = null;

    static {
            u5 r0 = new u5
            v5 r1 = new v5
            r1.<init>()
            r0.<init>(r1)
            defpackage.e3.a = r0
            r0 = -100
            defpackage.e3.b = r0
            r0 = 0
            defpackage.e3.c = r0
            defpackage.e3.d = r0
            defpackage.e3.e = r0
            r0 = 0
            defpackage.e3.f = r0
            q6 r0 = new q6
            r0.<init>()
            defpackage.e3.g = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.e3.h = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.e3.i = r0
            return
    }

    public static boolean c(android.content.Context r4) {
            java.lang.Boolean r0 = defpackage.e3.e
            if (r0 != 0) goto L37
            int r0 = androidx.appcompat.app.AppLocalesMetadataHolderService.a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            int r0 = defpackage.s5.a()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
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
            defpackage.e3.e = r4     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            goto L37
        L2c:
            java.lang.String r4 = "AppCompatDelegate"
            java.lang.String r0 = "Checking for metadata for AppLocalesMetadataHolderService : Service not found"
            android.util.Log.d(r4, r0)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            defpackage.e3.e = r4
        L37:
            java.lang.Boolean r4 = defpackage.e3.e
            boolean r4 = r4.booleanValue()
            return r4
    }

    public static void f(defpackage.r3 r4) {
            java.lang.Object r0 = defpackage.e3.h
            monitor-enter(r0)
            q6 r1 = defpackage.e3.g     // Catch: java.lang.Throwable -> L26
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L26
        L9:
            r2 = r1
            ss r2 = (defpackage.ss) r2     // Catch: java.lang.Throwable -> L26
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto L28
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L26
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L26
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L26
            e3 r3 = (defpackage.e3) r3     // Catch: java.lang.Throwable -> L26
            if (r3 == r4) goto L22
            if (r3 != 0) goto L9
        L22:
            r2.remove()     // Catch: java.lang.Throwable -> L26
            goto L9
        L26:
            r4 = move-exception
            goto L2a
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            return
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r4
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract boolean g(int r1);

    public abstract void h(int r1);

    public abstract void i(android.view.View r1);

    public abstract void j(android.view.View r1, android.view.ViewGroup.LayoutParams r2);

    public abstract void l(java.lang.CharSequence r1);
}

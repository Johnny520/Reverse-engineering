package androidx.startup;

/* JADX INFO: loaded from: classes.dex */
public class InitializationProvider extends android.content.ContentProvider {
    public InitializationProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Not allowed."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Not allowed."
            r2.<init>(r0)
            throw r2
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri r1, android.content.ContentValues r2) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Not allowed."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
            r5 = this;
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L48
            android.content.Context r1 = r0.getApplicationContext()
            if (r1 == 0) goto L46
            androidx.startup.a r0 = androidx.startup.a.c(r0)
            android.content.Context r1 = r0.c
            java.lang.String r2 = "Startup"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            java.lang.String r3 = r1.getPackageName()     // Catch: java.lang.Throwable -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            java.lang.Class<androidx.startup.InitializationProvider> r4 = androidx.startup.InitializationProvider.class
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ProviderInfo r1 = r1.getProviderInfo(r2, r3)     // Catch: java.lang.Throwable -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            android.os.Bundle r1 = r1.metaData     // Catch: java.lang.Throwable -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            r0.a(r1)     // Catch: java.lang.Throwable -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            android.os.Trace.endSection()
            goto L46
        L39:
            r0 = move-exception
            goto L42
        L3b:
            r0 = move-exception
            a.Ob r1 = new a.Ob     // Catch: java.lang.Throwable -> L39
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L39
            throw r1     // Catch: java.lang.Throwable -> L39
        L42:
            android.os.Trace.endSection()
            throw r0
        L46:
            r0 = 1
            return r0
        L48:
            a.Ob r0 = new a.Ob
            java.lang.String r1 = "Context cannot be null"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Not allowed."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Not allowed."
            r1.<init>(r2)
            throw r1
    }
}

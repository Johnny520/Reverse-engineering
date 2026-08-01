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
            if (r0 == 0) goto L4a
            android.content.Context r1 = r0.getApplicationContext()
            if (r1 == 0) goto L48
            r5 r0 = defpackage.r5.q(r0)
            java.lang.Object r1 = r0.d
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r2 = "Startup"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L3b android.content.pm.PackageManager.NameNotFoundException -> L3d
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L3b android.content.pm.PackageManager.NameNotFoundException -> L3d
            java.lang.String r3 = r1.getPackageName()     // Catch: java.lang.Throwable -> L3b android.content.pm.PackageManager.NameNotFoundException -> L3d
            java.lang.Class<androidx.startup.InitializationProvider> r4 = androidx.startup.InitializationProvider.class
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L3b android.content.pm.PackageManager.NameNotFoundException -> L3d
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3b android.content.pm.PackageManager.NameNotFoundException -> L3d
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L3b android.content.pm.PackageManager.NameNotFoundException -> L3d
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ProviderInfo r1 = r1.getProviderInfo(r2, r3)     // Catch: java.lang.Throwable -> L3b android.content.pm.PackageManager.NameNotFoundException -> L3d
            android.os.Bundle r1 = r1.metaData     // Catch: java.lang.Throwable -> L3b android.content.pm.PackageManager.NameNotFoundException -> L3d
            r0.e(r1)     // Catch: java.lang.Throwable -> L3b android.content.pm.PackageManager.NameNotFoundException -> L3d
            android.os.Trace.endSection()
            goto L48
        L3b:
            r0 = move-exception
            goto L44
        L3d:
            r0 = move-exception
            pb r1 = new pb     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3b
            throw r1     // Catch: java.lang.Throwable -> L3b
        L44:
            android.os.Trace.endSection()
            throw r0
        L48:
            r0 = 1
            return r0
        L4a:
            pb r0 = new pb
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

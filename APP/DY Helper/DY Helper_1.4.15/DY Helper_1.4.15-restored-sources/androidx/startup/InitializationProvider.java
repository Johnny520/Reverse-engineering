package androidx.startup;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
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
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not allowed."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri r1) {
            r0 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not allowed."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri r1, android.content.ContentValues r2) {
            r0 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not allowed."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L43
            android.content.Context r1 = r0.getApplicationContext()
            if (r1 == 0) goto L41
            m6 r0 = p000.C0538m6.m3751(r0)
            java.lang.Class r3 = r3.getClass()
            java.lang.Object r1 = r0.f6969
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r2 = "Startup"
            p000.e81.m1872(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35 java.lang.Throwable -> L3c
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35 java.lang.Throwable -> L3c
            r2.<init>(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35 java.lang.Throwable -> L3c
            android.content.pm.PackageManager r3 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35 java.lang.Throwable -> L3c
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.ProviderInfo r3 = r3.getProviderInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35 java.lang.Throwable -> L3c
            android.os.Bundle r3 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35 java.lang.Throwable -> L3c
            r0.m3783(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35 java.lang.Throwable -> L3c
            android.os.Trace.endSection()
            goto L41
        L35:
            r3 = move-exception
            pm r0 = new pm     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L3c
            throw r0     // Catch: java.lang.Throwable -> L3c
        L3c:
            r3 = move-exception
            android.os.Trace.endSection()
            throw r3
        L41:
            r3 = 1
            return r3
        L43:
            pm r3 = new pm
            java.lang.String r0 = "Context cannot be null"
            r3.<init>(r0)
            throw r3
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5) {
            r0 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not allowed."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not allowed."
            r0.<init>(r1)
            throw r0
    }
}

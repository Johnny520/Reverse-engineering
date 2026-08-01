package androidx.startup;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
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
            xhss.ᛷᛱᛳᲁ r0 = xhss.C0623.m1087(r0)
            java.lang.Class r3 = r3.getClass()
            java.lang.Object r1 = r0.f2152
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r2 = "Startup"
            xhss.AbstractC0060.m180(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35 java.lang.Throwable -> L3c
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35 java.lang.Throwable -> L3c
            r2.<init>(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35 java.lang.Throwable -> L3c
            android.content.pm.PackageManager r3 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35 java.lang.Throwable -> L3c
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.ProviderInfo r3 = r3.getProviderInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35 java.lang.Throwable -> L3c
            android.os.Bundle r3 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35 java.lang.Throwable -> L3c
            r0.m1099(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35 java.lang.Throwable -> L3c
            android.os.Trace.endSection()
            goto L41
        L35:
            r3 = move-exception
            xhss.ᛵᛲᛲᲇ r0 = new xhss.ᛵᛲᛲᲇ     // Catch: java.lang.Throwable -> L3c
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
            xhss.ᛵᛲᛲᲇ r3 = new xhss.ᛵᛲᛲᲇ
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

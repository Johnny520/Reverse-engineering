package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class ce {
    public ce() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(android.content.Context r2) {
            r0 = 0
            boolean r1 = com.tendcloud.tenddata.bx.i()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L8
            return r0
        L8:
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L18
            java.lang.String r1 = "com.meizu.flyme.openidsdk"
            android.content.pm.ProviderInfo r2 = r2.resolveContentProvider(r1, r0)     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L18
            r2 = 1
            return r2
        L18:
            return r0
    }

    public static void reflectMEiZU(android.content.Context r7) {
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L32
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L32
            r3 = 0
            r4 = 0
            java.lang.String r7 = "oaid"
            java.lang.String[] r5 = new java.lang.String[]{r7}     // Catch: java.lang.Throwable -> L32
            r6 = 0
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L32
            if (r7 == 0) goto L32
            r7.moveToFirst()     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "value"
            int r0 = r7.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r7.getString(r0)     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L2f
            com.tendcloud.tenddata.df r1 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> L32
            r1.setOAID(r0)     // Catch: java.lang.Throwable -> L32
        L2f:
            r7.close()     // Catch: java.lang.Throwable -> L32
        L32:
            return
    }
}

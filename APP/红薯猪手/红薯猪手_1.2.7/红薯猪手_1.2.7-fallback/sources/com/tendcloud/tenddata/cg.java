package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class cg {
    public cg() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(android.content.Context r1) {
            r1 = 0
            boolean r0 = com.tendcloud.tenddata.bx.l()     // Catch: java.lang.Throwable -> L9
            if (r0 != 0) goto L8
            return r1
        L8:
            r1 = 1
        L9:
            return r1
    }

    public static void reflectNUBIA(android.content.Context r2) {
            java.lang.String r0 = "content://cn.nubia.identity/identity"
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L35
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L35
            android.content.ContentProviderClient r2 = r2.acquireContentProviderClient(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L35
            java.lang.String r0 = "getOAID"
            r1 = 0
            android.os.Bundle r0 = r2.call(r0, r1, r1)     // Catch: java.lang.Throwable -> L35
            r2.close()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L35
            java.lang.String r2 = "code"
            r1 = -1
            int r2 = r0.getInt(r2, r1)     // Catch: java.lang.Throwable -> L35
            if (r2 != 0) goto L35
            java.lang.String r2 = "id"
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L35
            com.tendcloud.tenddata.df r0 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> L35
            r0.setOAID(r2)     // Catch: java.lang.Throwable -> L35
        L35:
            return
    }
}

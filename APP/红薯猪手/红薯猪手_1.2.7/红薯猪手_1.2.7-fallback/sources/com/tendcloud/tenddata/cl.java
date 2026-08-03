package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class cl {
    public cl() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String a(java.lang.String r7, java.lang.String r8) {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "get"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L26
            r5 = 0
            r4[r5] = r0     // Catch: java.lang.Throwable -> L26
            r6 = 1
            r4[r6] = r0     // Catch: java.lang.Throwable -> L26
            java.lang.reflect.Method r0 = r1.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L26
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L26
            r2[r5] = r7     // Catch: java.lang.Throwable -> L26
            java.lang.String r7 = "unknown"
            r2[r6] = r7     // Catch: java.lang.Throwable -> L26
            java.lang.Object r7 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L26
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L26
            return r7
        L26:
            return r8
    }

    private static java.lang.String a(java.lang.String r8, java.lang.String r9, android.content.Context r10) {
            r0 = -1
            r1 = 0
            int r2 = r8.hashCode()     // Catch: java.lang.Throwable -> L8b
            r3 = 2986299(0x2d913b, float:4.184696E-39)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L2c
            r3 = 3403373(0x33ee6d, float:4.769141E-39)
            if (r2 == r3) goto L22
            r3 = 3611910(0x371d06, float:5.061364E-39)
            if (r2 == r3) goto L18
            goto L35
        L18:
            java.lang.String r2 = "vaid"
            boolean r8 = r8.equals(r2)     // Catch: java.lang.Throwable -> L8b
            if (r8 == 0) goto L35
            r0 = r5
            goto L35
        L22:
            java.lang.String r2 = "oaid"
            boolean r8 = r8.equals(r2)     // Catch: java.lang.Throwable -> L8b
            if (r8 == 0) goto L35
            r0 = 0
            goto L35
        L2c:
            java.lang.String r2 = "aaid"
            boolean r8 = r8.equals(r2)     // Catch: java.lang.Throwable -> L8b
            if (r8 == 0) goto L35
            r0 = r4
        L35:
            if (r0 == 0) goto L65
            if (r0 == r5) goto L4f
            if (r0 == r4) goto L3d
            r3 = r1
            goto L69
        L3d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r8.<init>()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "content://com.vivo.vms.IdProvider/IdentifierId/AAID_"
            r8.append(r0)     // Catch: java.lang.Throwable -> L8b
            r8.append(r9)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L8b
            goto L60
        L4f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r8.<init>()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "content://com.vivo.vms.IdProvider/IdentifierId/VAID_"
            r8.append(r0)     // Catch: java.lang.Throwable -> L8b
            r8.append(r9)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L8b
        L60:
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L8b
            goto L68
        L65:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
            goto L60
        L68:
            r3 = r8
        L69:
            android.content.ContentResolver r2 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L8b
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L8b
            if (r8 == 0) goto L8b
            boolean r9 = r8.moveToNext()     // Catch: java.lang.Throwable -> L8b
            if (r9 == 0) goto L88
            java.lang.String r9 = "value"
            int r9 = r8.getColumnIndex(r9)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.Throwable -> L8b
            r1 = r9
        L88:
            r8.close()     // Catch: java.lang.Throwable -> L8b
        L8b:
            return r1
    }

    public static boolean a() {
            r0 = 0
            boolean r1 = com.tendcloud.tenddata.bx.f()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L8
            return r0
        L8:
            java.lang.String r1 = "persist.sys.identifierid.supported"
            java.lang.String r2 = "0"
            java.lang.String r1 = a(r1, r2)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L18
            java.lang.String r2 = "1"
            boolean r0 = r1.equals(r2)     // Catch: java.lang.Throwable -> L18
        L18:
            return r0
    }

    public static void reflectVIVO(android.content.Context r3) {
            r0 = 0
            java.lang.String r1 = "oaid"
            java.lang.String r1 = a(r1, r0, r3)     // Catch: java.lang.Throwable -> Le
            com.tendcloud.tenddata.df r2 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> Le
            r2.setOAID(r1)     // Catch: java.lang.Throwable -> Le
        Le:
            java.lang.String r1 = "vaid"
            java.lang.String r1 = a(r1, r0, r3)     // Catch: java.lang.Throwable -> L1b
            com.tendcloud.tenddata.df r2 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> L1b
            r2.setVAID(r1)     // Catch: java.lang.Throwable -> L1b
        L1b:
            java.lang.String r1 = "aaid"
            java.lang.String r3 = a(r1, r0, r3)     // Catch: java.lang.Throwable -> L28
            com.tendcloud.tenddata.df r0 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> L28
            r0.setAAID(r3)     // Catch: java.lang.Throwable -> L28
        L28:
            return
    }
}

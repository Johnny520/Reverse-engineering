package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public final class cb {
    private static final java.lang.String a = "oaid_limit_state";
    private static final java.lang.String b = "oaid";

    public static final class a {
        public java.lang.String id;
        public boolean isLimit;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public cb() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r7, com.tendcloud.tenddata.cc r8) {
            java.lang.String r0 = "get Honor id from service"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.tendcloud.tenddata.h.iForInternal(r0)
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L5a
            r0.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = "com.hihonor.id.HnOaIdService"
            r0.setAction(r1)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = "com.hihonor.id"
            r0.setPackage(r1)     // Catch: java.lang.Throwable -> L5a
            r1 = 1
            r7.bindService(r0, r8, r1)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = "bind honor id serice"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L5a
            com.tendcloud.tenddata.h.iForInternal(r0)     // Catch: java.lang.Throwable -> L5a
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5a
            java.util.concurrent.CountDownLatch r0 = r8.b     // Catch: java.lang.Throwable -> L5a
            r4 = 2000(0x7d0, double:9.88E-321)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L5a
            r0.await(r4, r6)     // Catch: java.lang.Throwable -> L5a
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L5a
            r1 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r4.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r5 = "countDown end:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L5a
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5a
            long r5 = r5 - r2
            r4.append(r5)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L5a
            r0[r1] = r2     // Catch: java.lang.Throwable -> L5a
            com.tendcloud.tenddata.h.iForInternal(r0)     // Catch: java.lang.Throwable -> L5a
            r8.unbind(r7)     // Catch: java.lang.Throwable -> L5a
            com.tendcloud.tenddata.cb$a r7 = r8.a     // Catch: java.lang.Throwable -> L5a
            if (r7 == 0) goto L5a
            java.lang.String r7 = r7.id     // Catch: java.lang.Throwable -> L5a
            return r7
        L5a:
            r7 = 0
            return r7
    }

    public static boolean a(android.content.Context r1) {
            boolean r0 = com.tendcloud.tenddata.bx.c()
            if (r0 != 0) goto L11
            java.lang.String r1 = "not honor"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            com.tendcloud.tenddata.h.iForInternal(r1)
            r1 = 0
            return r1
        L11:
            boolean r1 = b(r1)
            return r1
    }

    public static boolean b(android.content.Context r4) {
            java.lang.String r0 = "com.hihonor.id"
            r1 = 0
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Exception -> L3b
            r4.getPackageInfo(r0, r1)     // Catch: java.lang.Exception -> L3b
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Exception -> L3b
            java.lang.String r3 = "com.hihonor.id.HnOaIdService"
            r2.<init>(r3)     // Catch: java.lang.Exception -> L3b
            r2.setPackage(r0)     // Catch: java.lang.Exception -> L3b
            java.util.List r4 = r4.queryIntentServices(r2, r1)     // Catch: java.lang.Exception -> L3b
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Exception -> L3b
            r0 = 1
            if (r4 != 0) goto L21
            r4 = r0
            goto L22
        L21:
            r4 = r1
        L22:
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Exception -> L3b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3b
            r2.<init>()     // Catch: java.lang.Exception -> L3b
            java.lang.String r3 = "honor id service is exist:"
            r2.append(r3)     // Catch: java.lang.Exception -> L3b
            r2.append(r4)     // Catch: java.lang.Exception -> L3b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L3b
            r0[r1] = r2     // Catch: java.lang.Exception -> L3b
            com.tendcloud.tenddata.h.iForInternal(r0)     // Catch: java.lang.Exception -> L3b
            return r4
        L3b:
            r4 = move-exception
            r4.printStackTrace()
            return r1
    }

    public static void bindHonorServiceGetOAID(android.content.Context r5) {
            java.lang.String r0 = "try to get id from cache"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.tendcloud.tenddata.h.iForInternal(r0)
            java.lang.String r0 = c(r5)
            r1 = 2
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r3 = "get id from cache:"
            r4 = 0
            r2[r4] = r3
            r3 = 1
            r2[r3] = r0
            com.tendcloud.tenddata.h.iForInternal(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L35
            com.tendcloud.tenddata.cc r0 = new com.tendcloud.tenddata.cc
            r0.<init>()
            java.lang.String r0 = a(r5, r0)
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "get id from service:"
            r1[r4] = r2
            r1[r3] = r0
            com.tendcloud.tenddata.h.iForInternal(r1)
        L35:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L3f
            com.tendcloud.tenddata.ca.bindHWServiceGetOAID(r5)
            goto L46
        L3f:
            com.tendcloud.tenddata.df r5 = com.tendcloud.tenddata.df.a()
            r5.setOAID(r0)
        L46:
            return
    }

    private static java.lang.String c(android.content.Context r2) {
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "oaid"
            java.lang.String r0 = android.provider.Settings.Global.getString(r2, r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = "oaid_limit_state"
            java.lang.String r2 = android.provider.Settings.Global.getString(r2, r1)     // Catch: java.lang.Throwable -> L1d
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1d
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L1d
            if (r2 != 0) goto L1d
            return r0
        L1d:
            r2 = 0
            return r2
    }
}

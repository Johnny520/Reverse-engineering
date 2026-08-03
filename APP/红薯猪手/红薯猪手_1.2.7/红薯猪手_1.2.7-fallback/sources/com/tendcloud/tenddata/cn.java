package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class cn {
    private static final java.lang.String b = "android.app.ZteDeviceIdentifyManager";
    private static java.lang.String c = "com.mdid.msa";
    private static volatile com.tendcloud.tenddata.cn d;
    private final java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> a;
    private android.content.ServiceConnection e;


    public static class a implements android.os.IInterface {
        private android.os.IBinder mIBinder;

        public a(android.os.IBinder r1) {
                r0 = this;
                r0.<init>()
                r0.mIBinder = r1
                return
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r1 = this;
                android.os.IBinder r0 = r1.mIBinder
                return r0
        }

        public java.lang.String getOAID() {
                r6 = this;
                r0 = 0
                android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L22
                android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L22
                java.lang.String r3 = "com.bun.lib.MsaIdInterface"
                r1.writeInterfaceToken(r3)     // Catch: java.lang.Throwable -> L1c
                android.os.IBinder r3 = r6.mIBinder     // Catch: java.lang.Throwable -> L1c
                r4 = 3
                r5 = 0
                r3.transact(r4, r1, r2, r5)     // Catch: java.lang.Throwable -> L1c
                r2.readException()     // Catch: java.lang.Throwable -> L1c
                java.lang.String r0 = r2.readString()     // Catch: java.lang.Throwable -> L1c
            L1c:
                r1.recycle()     // Catch: java.lang.Throwable -> L22
                r2.recycle()     // Catch: java.lang.Throwable -> L22
            L22:
                return r0
        }
    }

    static {
            com.tendcloud.tenddata.cn r0 = new com.tendcloud.tenddata.cn
            r0.<init>()
            com.tendcloud.tenddata.cn.d = r0
            return
    }

    private cn() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r1 = 1
            r0.<init>(r1)
            r2.a = r0
            com.tendcloud.tenddata.cn$1 r0 = new com.tendcloud.tenddata.cn$1
            r0.<init>(r2)
            r2.e = r0
            return
    }

    public static /* synthetic */ java.util.concurrent.LinkedBlockingQueue a(com.tendcloud.tenddata.cn r0) {
            java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r0 = r0.a
            return r0
    }

    private static void a(java.lang.String r3, android.content.Context r4) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = com.tendcloud.tenddata.cn.c
            java.lang.String r2 = "com.mdid.msa.service.MsaKlService"
            r0.setClassName(r1, r2)
            java.lang.String r1 = "com.bun.msa.action.start.service"
            r0.setAction(r1)
            java.lang.String r1 = "com.bun.msa.param.pkgname"
            r0.putExtra(r1, r3)
            java.lang.String r3 = "com.bun.msa.param.runinset"
            r1 = 1
            r0.putExtra(r3, r1)     // Catch: java.lang.Throwable -> L1f
            r4.startService(r0)     // Catch: java.lang.Throwable -> L1f
        L1f:
            return
    }

    public static boolean a(android.content.Context r3) {
            r0 = 0
            boolean r1 = com.tendcloud.tenddata.bx.h()     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L8
            return r0
        L8:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L19
            r2 = 29
            if (r1 > r2) goto L17
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = com.tendcloud.tenddata.cn.c     // Catch: java.lang.Throwable -> L19
            r3.getPackageInfo(r1, r0)     // Catch: java.lang.Throwable -> L19
        L17:
            r3 = 1
            return r3
        L19:
            return r0
    }

    private static void b(android.content.Context r7) {
            java.lang.String r0 = "android.app.ZteDeviceIdentifyManager"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L39
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L39
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L39
            java.lang.reflect.Constructor r2 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L39
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L39
            r3[r4] = r7     // Catch: java.lang.Throwable -> L39
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "getOAID"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L39
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r4] = r6     // Catch: java.lang.Throwable -> L39
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r5)     // Catch: java.lang.Throwable -> L39
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L39
            r1[r4] = r7     // Catch: java.lang.Throwable -> L39
            java.lang.Object r7 = r0.invoke(r2, r1)     // Catch: java.lang.Throwable -> L39
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L39
            com.tendcloud.tenddata.df r0 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> L39
            r0.setOAID(r7)     // Catch: java.lang.Throwable -> L39
        L39:
            return
    }

    public static void bindZTEServiceGetOAID(android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 > r1) goto Lc
            com.tendcloud.tenddata.cn r0 = com.tendcloud.tenddata.cn.d
            r0.c(r2)
            goto Lf
        Lc:
            b(r2)
        Lf:
            return
    }

    private void c(android.content.Context r5) {
            r4 = this;
            java.lang.String r0 = r5.getPackageName()     // Catch: java.lang.Throwable -> L43
            a(r0, r5)     // Catch: java.lang.Throwable -> L43
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L43
            r1.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "com.mdid.msa"
            java.lang.String r3 = "com.mdid.msa.service.MsaIdService"
            r1.setClassName(r2, r3)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "com.bun.msa.action.bindto.service"
            r1.setAction(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "com.bun.msa.param.pkgname"
            r1.putExtra(r2, r0)     // Catch: java.lang.Throwable -> L43
            android.content.ServiceConnection r0 = r4.e     // Catch: java.lang.Throwable -> L43
            r2 = 1
            boolean r0 = r5.bindService(r1, r0, r2)     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L43
            java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r0 = r4.a     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r0.take()     // Catch: java.lang.Throwable -> L43
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch: java.lang.Throwable -> L43
            com.tendcloud.tenddata.cn$a r1 = new com.tendcloud.tenddata.cn$a     // Catch: java.lang.Throwable -> L43
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = r1.getOAID()     // Catch: java.lang.Throwable -> L3e
            com.tendcloud.tenddata.df r1 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> L3e
            r1.setOAID(r0)     // Catch: java.lang.Throwable -> L3e
        L3e:
            android.content.ServiceConnection r0 = r4.e     // Catch: java.lang.Throwable -> L43
            r5.unbindService(r0)     // Catch: java.lang.Throwable -> L43
        L43:
            return
    }
}

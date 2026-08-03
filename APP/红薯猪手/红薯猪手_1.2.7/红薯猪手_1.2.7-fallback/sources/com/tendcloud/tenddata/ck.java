package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public final class ck {
    private static volatile com.tendcloud.tenddata.ck c;
    public android.content.ServiceConnection a;
    private final java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> b;


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
                android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L32
                android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L32
                java.lang.String r3 = "com.samsung.android.deviceidservice.IDeviceIdService"
                r1.writeInterfaceToken(r3)     // Catch: java.lang.Throwable -> L23
                android.os.IBinder r3 = r6.mIBinder     // Catch: java.lang.Throwable -> L23
                r4 = 1
                r5 = 0
                r3.transact(r4, r1, r2, r5)     // Catch: java.lang.Throwable -> L23
                r2.readException()     // Catch: java.lang.Throwable -> L23
                java.lang.String r0 = r2.readString()     // Catch: java.lang.Throwable -> L23
            L1c:
                r2.recycle()     // Catch: java.lang.Throwable -> L32
                r1.recycle()     // Catch: java.lang.Throwable -> L32
                goto L32
            L23:
                r2.recycle()     // Catch: java.lang.Throwable -> L2a
                r1.recycle()     // Catch: java.lang.Throwable -> L2a
                goto L1c
            L2a:
                r3 = move-exception
                r2.recycle()     // Catch: java.lang.Throwable -> L32
                r1.recycle()     // Catch: java.lang.Throwable -> L32
                throw r3     // Catch: java.lang.Throwable -> L32
            L32:
                return r0
        }
    }

    static {
            com.tendcloud.tenddata.ck r0 = new com.tendcloud.tenddata.ck
            r0.<init>()
            com.tendcloud.tenddata.ck.c = r0
            return
    }

    private ck() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r1 = 1
            r0.<init>(r1)
            r2.b = r0
            com.tendcloud.tenddata.ck$1 r0 = new com.tendcloud.tenddata.ck$1
            r0.<init>(r2)
            r2.a = r0
            return
    }

    public static /* synthetic */ java.util.concurrent.LinkedBlockingQueue a(com.tendcloud.tenddata.ck r0) {
            java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r0 = r0.b
            return r0
    }

    public static boolean a(android.content.Context r2) {
            r0 = 0
            boolean r1 = com.tendcloud.tenddata.bx.g()     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L8
            return r0
        L8:
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "com.samsung.android.deviceidservice"
            r2.getPackageInfo(r1, r0)     // Catch: java.lang.Throwable -> L13
            r2 = 1
            return r2
        L13:
            return r0
    }

    private void b(android.content.Context r4) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.samsung.android.deviceidservice"
            java.lang.String r2 = "com.samsung.android.deviceidservice.DeviceIdService"
            r0.setClassName(r1, r2)
            android.content.ServiceConnection r1 = r3.a
            r2 = 1
            boolean r0 = r4.bindService(r0, r1, r2)
            if (r0 == 0) goto L32
            java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r0 = r3.b     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.take()     // Catch: java.lang.Throwable -> L2d
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch: java.lang.Throwable -> L2d
            com.tendcloud.tenddata.ck$a r1 = new com.tendcloud.tenddata.ck$a     // Catch: java.lang.Throwable -> L2d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = r1.getOAID()     // Catch: java.lang.Throwable -> L2d
            com.tendcloud.tenddata.df r1 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> L2d
            r1.setOAID(r0)     // Catch: java.lang.Throwable -> L2d
        L2d:
            android.content.ServiceConnection r0 = r3.a     // Catch: java.lang.Throwable -> L32
            r4.unbindService(r0)     // Catch: java.lang.Throwable -> L32
        L32:
            return
    }

    public static void bindSECServiceGetOAID(android.content.Context r1) {
            com.tendcloud.tenddata.ck r0 = com.tendcloud.tenddata.ck.c
            r0.b(r1)
            return
    }
}

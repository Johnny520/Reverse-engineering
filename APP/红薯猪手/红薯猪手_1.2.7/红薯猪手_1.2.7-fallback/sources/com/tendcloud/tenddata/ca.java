package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public final class ca {
    private static volatile com.tendcloud.tenddata.ca c;
    public android.content.ServiceConnection a;
    private final java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> b;


    public static final class a implements android.os.IInterface {
        private android.os.IBinder iBinder;

        private a(android.os.IBinder r1) {
                r0 = this;
                r0.<init>()
                r0.iBinder = r1
                return
        }

        public /* synthetic */ a(android.os.IBinder r1, com.tendcloud.tenddata.ca.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r1 = this;
                android.os.IBinder r0 = r1.iBinder
                return r0
        }

        public java.lang.String getOAID() {
                r6 = this;
                r0 = 0
                android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L32
                android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L32
                java.lang.String r3 = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService"
                r1.writeInterfaceToken(r3)     // Catch: java.lang.Throwable -> L23
                android.os.IBinder r3 = r6.iBinder     // Catch: java.lang.Throwable -> L23
                r4 = 1
                r5 = 0
                r3.transact(r4, r1, r2, r5)     // Catch: java.lang.Throwable -> L23
                r2.readException()     // Catch: java.lang.Throwable -> L23
                java.lang.String r0 = r2.readString()     // Catch: java.lang.Throwable -> L23
            L1c:
                r1.recycle()     // Catch: java.lang.Throwable -> L32
                r2.recycle()     // Catch: java.lang.Throwable -> L32
                goto L32
            L23:
                r1.recycle()     // Catch: java.lang.Throwable -> L2a
                r2.recycle()     // Catch: java.lang.Throwable -> L2a
                goto L1c
            L2a:
                r3 = move-exception
                r1.recycle()     // Catch: java.lang.Throwable -> L32
                r2.recycle()     // Catch: java.lang.Throwable -> L32
                throw r3     // Catch: java.lang.Throwable -> L32
            L32:
                return r0
        }
    }

    static {
            com.tendcloud.tenddata.ca r0 = new com.tendcloud.tenddata.ca
            r0.<init>()
            com.tendcloud.tenddata.ca.c = r0
            return
    }

    private ca() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r1 = 1
            r0.<init>(r1)
            r2.b = r0
            com.tendcloud.tenddata.ca$1 r0 = new com.tendcloud.tenddata.ca$1
            r0.<init>(r2)
            r2.a = r0
            return
    }

    public static /* synthetic */ java.util.concurrent.LinkedBlockingQueue a(com.tendcloud.tenddata.ca r0) {
            java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r0 = r0.b
            return r0
    }

    public static boolean a(android.content.Context r2) {
            r0 = 0
            boolean r1 = com.tendcloud.tenddata.bx.b()     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto Le
            boolean r1 = com.tendcloud.tenddata.bx.c()     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto Le
            return r0
        Le:
            java.lang.String r2 = b(r2)     // Catch: java.lang.Throwable -> L19
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L19
            r2 = r2 ^ 1
            return r2
        L19:
            return r0
    }

    private static boolean a(android.content.Context r0, java.lang.String r1) {
            android.content.pm.PackageInfo r0 = b(r0, r1)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private static android.content.pm.PackageInfo b(android.content.Context r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 != 0) goto L17
            if (r2 != 0) goto La
            goto L17
        La:
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L17
            r0 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)     // Catch: java.lang.Throwable -> L17
            return r2
        L17:
            return r1
    }

    public static java.lang.String b(android.content.Context r4) {
            java.lang.String r0 = "com.huawei.hwid"
            boolean r1 = a(r4, r0)
            java.lang.String r2 = "com.huawei.hwid.tv"
            java.lang.String r3 = "com.huawei.hms"
            if (r1 == 0) goto Ld
            goto L1c
        Ld:
            boolean r1 = a(r4, r3)
            if (r1 == 0) goto L15
            r0 = r3
            goto L1c
        L15:
            boolean r4 = a(r4, r2)
            if (r4 == 0) goto L1c
            r0 = r2
        L1c:
            return r0
    }

    public static void bindHWServiceGetOAID(android.content.Context r1) {
            com.tendcloud.tenddata.ca r0 = com.tendcloud.tenddata.ca.c
            r0.c(r1)
            return
    }

    private void c(android.content.Context r4) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "com.uodis.opendevice.OPENIDS_SERVICE"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = b(r4)     // Catch: java.lang.Throwable -> L35
            r0.setPackage(r1)     // Catch: java.lang.Throwable -> L35
            android.content.ServiceConnection r1 = r3.a     // Catch: java.lang.Throwable -> L35
            r2 = 1
            boolean r0 = r4.bindService(r0, r1, r2)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L35
            java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r0 = r3.b     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r0.take()     // Catch: java.lang.Throwable -> L30
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch: java.lang.Throwable -> L30
            com.tendcloud.tenddata.ca$a r1 = new com.tendcloud.tenddata.ca$a     // Catch: java.lang.Throwable -> L30
            r2 = 0
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = r1.getOAID()     // Catch: java.lang.Throwable -> L30
            com.tendcloud.tenddata.df r1 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> L30
            r1.setOAID(r0)     // Catch: java.lang.Throwable -> L30
        L30:
            android.content.ServiceConnection r0 = r3.a     // Catch: java.lang.Throwable -> L35
            r4.unbindService(r0)     // Catch: java.lang.Throwable -> L35
        L35:
            return
    }
}

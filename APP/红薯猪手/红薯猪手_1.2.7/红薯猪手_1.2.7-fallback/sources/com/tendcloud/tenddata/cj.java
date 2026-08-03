package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class cj {
    private static java.lang.String b;
    private static volatile com.tendcloud.tenddata.cj c;
    private final java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> a;
    private android.content.ServiceConnection d;


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

        public java.lang.String getSerID(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
                r4 = this;
                r0 = 0
                android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L2b
                android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L2b
                java.lang.String r3 = "com.heytap.openid.IOpenID"
                r1.writeInterfaceToken(r3)     // Catch: java.lang.Throwable -> L25
                r1.writeString(r5)     // Catch: java.lang.Throwable -> L25
                r1.writeString(r6)     // Catch: java.lang.Throwable -> L25
                r1.writeString(r7)     // Catch: java.lang.Throwable -> L25
                android.os.IBinder r5 = r4.mIBinder     // Catch: java.lang.Throwable -> L25
                r6 = 1
                r7 = 0
                r5.transact(r6, r1, r2, r7)     // Catch: java.lang.Throwable -> L25
                r2.readException()     // Catch: java.lang.Throwable -> L25
                java.lang.String r0 = r2.readString()     // Catch: java.lang.Throwable -> L25
            L25:
                r1.recycle()     // Catch: java.lang.Throwable -> L2b
                r2.recycle()     // Catch: java.lang.Throwable -> L2b
            L2b:
                return r0
        }
    }

    static {
            com.tendcloud.tenddata.cj r0 = new com.tendcloud.tenddata.cj
            r0.<init>()
            com.tendcloud.tenddata.cj.c = r0
            return
    }

    private cj() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r1 = 1
            r0.<init>(r1)
            r2.a = r0
            com.tendcloud.tenddata.cj$1 r0 = new com.tendcloud.tenddata.cj$1
            r0.<init>(r2)
            r2.d = r0
            return
    }

    private static java.lang.String a(java.lang.String r8, android.content.Context r9, com.tendcloud.tenddata.cj.a r10) {
            java.lang.String r0 = r9.getPackageName()
            java.lang.String r1 = com.tendcloud.tenddata.cj.b
            if (r1 != 0) goto L53
            r1 = 0
            android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch: java.lang.Throwable -> L16
            r2 = 64
            android.content.pm.PackageInfo r9 = r9.getPackageInfo(r0, r2)     // Catch: java.lang.Throwable -> L16
            android.content.pm.Signature[] r9 = r9.signatures     // Catch: java.lang.Throwable -> L16
            goto L17
        L16:
            r9 = r1
        L17:
            if (r9 == 0) goto L51
            int r2 = r9.length
            if (r2 <= 0) goto L51
            r2 = 0
            r9 = r9[r2]
            byte[] r9 = r9.toByteArray()
            java.lang.String r3 = "SHA1"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L51
            byte[] r9 = r3.digest(r9)     // Catch: java.lang.Throwable -> L51
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r3.<init>()     // Catch: java.lang.Throwable -> L51
            int r4 = r9.length     // Catch: java.lang.Throwable -> L51
        L35:
            if (r2 >= r4) goto L4d
            r5 = r9[r2]     // Catch: java.lang.Throwable -> L51
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | 256(0x100, float:3.59E-43)
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: java.lang.Throwable -> L51
            r6 = 3
            r7 = 1
            java.lang.String r5 = r5.substring(r7, r6)     // Catch: java.lang.Throwable -> L51
            r3.append(r5)     // Catch: java.lang.Throwable -> L51
            int r2 = r2 + 1
            goto L35
        L4d:
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L51
        L51:
            com.tendcloud.tenddata.cj.b = r1
        L53:
            java.lang.String r9 = com.tendcloud.tenddata.cj.b
            java.lang.String r8 = r10.getSerID(r0, r9, r8)
            return r8
    }

    public static /* synthetic */ java.util.concurrent.LinkedBlockingQueue a(com.tendcloud.tenddata.cj r0) {
            java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r0 = r0.a
            return r0
    }

    public static boolean a(android.content.Context r2) {
            r0 = 0
            boolean r1 = com.tendcloud.tenddata.bx.d()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L8
            return r0
        L8:
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "com.heytap.openid"
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r1, r0)     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L15
            return r0
        L15:
            int r2 = r2.versionCode     // Catch: java.lang.Throwable -> L1c
            r1 = 1
            if (r2 >= r1) goto L1b
            return r0
        L1b:
            return r1
        L1c:
            return r0
    }

    private void b(android.content.Context r5) {
            r4 = this;
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L58
            r0.<init>()     // Catch: java.lang.Throwable -> L58
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "com.heytap.openid"
            java.lang.String r3 = "com.heytap.openid.IdentifyService"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L58
            r0.setComponent(r1)     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = "action.com.heytap.openid.OPEN_ID_SERVICE"
            r0.setAction(r1)     // Catch: java.lang.Throwable -> L58
            android.content.ServiceConnection r1 = r4.d     // Catch: java.lang.Throwable -> L58
            r2 = 1
            boolean r0 = r5.bindService(r0, r1, r2)     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L58
            java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r0 = r4.a     // Catch: java.lang.Throwable -> L58
            java.lang.Object r0 = r0.take()     // Catch: java.lang.Throwable -> L58
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch: java.lang.Throwable -> L58
            com.tendcloud.tenddata.cj$a r1 = new com.tendcloud.tenddata.cj$a     // Catch: java.lang.Throwable -> L58
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = "OUID"
            java.lang.String r0 = a(r0, r5, r1)     // Catch: java.lang.Throwable -> L39
            com.tendcloud.tenddata.df r2 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> L39
            r2.setOAID(r0)     // Catch: java.lang.Throwable -> L39
        L39:
            java.lang.String r0 = "DUID"
            java.lang.String r0 = a(r0, r5, r1)     // Catch: java.lang.Throwable -> L46
            com.tendcloud.tenddata.df r2 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> L46
            r2.setVAID(r0)     // Catch: java.lang.Throwable -> L46
        L46:
            java.lang.String r0 = "AUID"
            java.lang.String r0 = a(r0, r5, r1)     // Catch: java.lang.Throwable -> L53
            com.tendcloud.tenddata.df r1 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> L53
            r1.setAAID(r0)     // Catch: java.lang.Throwable -> L53
        L53:
            android.content.ServiceConnection r0 = r4.d     // Catch: java.lang.Throwable -> L58
            r5.unbindService(r0)     // Catch: java.lang.Throwable -> L58
        L58:
            return
    }

    public static void bindOPPOServiceGetOAID(android.content.Context r1) {
            com.tendcloud.tenddata.cj r0 = com.tendcloud.tenddata.cj.c
            r0.b(r1)
            return
    }
}

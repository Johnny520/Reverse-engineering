package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class bz {
    private static volatile com.tendcloud.tenddata.bz b;
    private final java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> a;
    private android.content.ServiceConnection c;


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
                java.lang.String r3 = "com.asus.msa.SupplementaryDID.IDidAidlInterface"
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
            com.tendcloud.tenddata.bz r0 = new com.tendcloud.tenddata.bz
            r0.<init>()
            com.tendcloud.tenddata.bz.b = r0
            return
    }

    private bz() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r1 = 1
            r0.<init>(r1)
            r2.a = r0
            com.tendcloud.tenddata.bz$1 r0 = new com.tendcloud.tenddata.bz$1
            r0.<init>(r2)
            r2.c = r0
            return
    }

    public static /* synthetic */ java.util.concurrent.LinkedBlockingQueue a(com.tendcloud.tenddata.bz r0) {
            java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r0 = r0.a
            return r0
    }

    public static boolean a(android.content.Context r1) {
            r1 = 0
            boolean r0 = com.tendcloud.tenddata.bx.j()     // Catch: java.lang.Throwable -> L9
            if (r0 != 0) goto L8
            return r1
        L8:
            r1 = 1
        L9:
            return r1
    }

    private void b(android.content.Context r5) {
            r4 = this;
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L3c
            r0.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "com.asus.msa.action.ACCESS_DID"
            r0.setAction(r1)     // Catch: java.lang.Throwable -> L3c
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "com.asus.msa.SupplementaryDID"
            java.lang.String r3 = "com.asus.msa.SupplementaryDID.SupplementaryDIDService"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L3c
            r0.setComponent(r1)     // Catch: java.lang.Throwable -> L3c
            android.content.ServiceConnection r1 = r4.c     // Catch: java.lang.Throwable -> L3c
            r2 = 1
            boolean r0 = r5.bindService(r0, r1, r2)     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3c
            java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r0 = r4.a     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r0 = r0.take()     // Catch: java.lang.Throwable -> L3c
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch: java.lang.Throwable -> L3c
            com.tendcloud.tenddata.bz$a r1 = new com.tendcloud.tenddata.bz$a     // Catch: java.lang.Throwable -> L3c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r1.getOAID()     // Catch: java.lang.Throwable -> L37
            com.tendcloud.tenddata.df r1 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> L37
            r1.setOAID(r0)     // Catch: java.lang.Throwable -> L37
        L37:
            android.content.ServiceConnection r0 = r4.c     // Catch: java.lang.Throwable -> L3c
            r5.unbindService(r0)     // Catch: java.lang.Throwable -> L3c
        L3c:
            return
    }

    public static void bindASUSServiceGetOAID(android.content.Context r1) {
            com.tendcloud.tenddata.bz r0 = com.tendcloud.tenddata.bz.b
            r0.b(r1)
            return
    }
}

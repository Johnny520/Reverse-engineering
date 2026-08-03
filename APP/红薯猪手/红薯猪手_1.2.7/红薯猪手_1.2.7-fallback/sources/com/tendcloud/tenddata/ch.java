package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
interface ch extends android.os.IInterface {

    public static abstract class a extends android.os.Binder implements com.tendcloud.tenddata.ch {
        public static final int c = 0;

        /* JADX INFO: renamed from: com.tendcloud.tenddata.ch$a$a, reason: collision with other inner class name */
        public static class C0003a implements com.tendcloud.tenddata.ch {
            public android.os.IBinder a;

            public C0003a(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.a = r1
                    return
            }

            @Override // com.tendcloud.tenddata.ch
            public void a(com.tendcloud.tenddata.by r5) {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.hihonor.cloudservice.oaid.IOAIDService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L21 android.os.RemoteException -> L23
                    if (r5 == 0) goto L12
                    com.tendcloud.tenddata.by$a r5 = (com.tendcloud.tenddata.by.a) r5     // Catch: java.lang.Throwable -> L21 android.os.RemoteException -> L23
                    goto L13
                L12:
                    r5 = 0
                L13:
                    r0.writeStrongBinder(r5)     // Catch: java.lang.Throwable -> L21 android.os.RemoteException -> L23
                    android.os.IBinder r5 = r4.a     // Catch: java.lang.Throwable -> L21 android.os.RemoteException -> L23
                    r2 = 3
                    r3 = 0
                    r5.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L21 android.os.RemoteException -> L23
                    r1.readException()     // Catch: java.lang.Throwable -> L21 android.os.RemoteException -> L23
                    goto L27
                L21:
                    r5 = move-exception
                    goto L2e
                L23:
                    r5 = move-exception
                    r5.printStackTrace()     // Catch: java.lang.Throwable -> L21
                L27:
                    r1.recycle()
                    r0.recycle()
                    return
                L2e:
                    r1.recycle()
                    r0.recycle()
                    throw r5
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.a
                    return r0
            }

            @Override // com.tendcloud.tenddata.ch
            public void b(com.tendcloud.tenddata.by r5) {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.hihonor.cloudservice.oaid.IOAIDService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L21 android.os.RemoteException -> L23
                    if (r5 == 0) goto L12
                    com.tendcloud.tenddata.by$a r5 = (com.tendcloud.tenddata.by.a) r5     // Catch: java.lang.Throwable -> L21 android.os.RemoteException -> L23
                    goto L13
                L12:
                    r5 = 0
                L13:
                    r0.writeStrongBinder(r5)     // Catch: java.lang.Throwable -> L21 android.os.RemoteException -> L23
                    android.os.IBinder r5 = r4.a     // Catch: java.lang.Throwable -> L21 android.os.RemoteException -> L23
                    r2 = 2
                    r3 = 0
                    r5.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L21 android.os.RemoteException -> L23
                    r1.readException()     // Catch: java.lang.Throwable -> L21 android.os.RemoteException -> L23
                    goto L27
                L21:
                    r5 = move-exception
                    goto L2e
                L23:
                    r5 = move-exception
                    r5.printStackTrace()     // Catch: java.lang.Throwable -> L21
                L27:
                    r1.recycle()
                    r0.recycle()
                    return
                L2e:
                    r1.recycle()
                    r0.recycle()
                    throw r5
            }
        }

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    void a(com.tendcloud.tenddata.by r1);

    void b(com.tendcloud.tenddata.by r1);
}

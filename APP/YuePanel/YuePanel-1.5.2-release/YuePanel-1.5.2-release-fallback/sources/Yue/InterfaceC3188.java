package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
public interface InterfaceC3188 extends android.os.IInterface {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f10538 = null;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۢ$ۥ, reason: contains not printable characters */
    public static class C3189 implements Yue.InterfaceC3188 {
        public C3189() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // Yue.InterfaceC3188
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo13592(java.lang.String r1) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // Yue.InterfaceC3188
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo13593(java.lang.String r1, int r2, java.lang.String r3) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // Yue.InterfaceC3188
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public void mo13594(java.lang.String r1, int r2, java.lang.String r3, android.app.Notification r4) throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۢ$ۥ۟, reason: contains not printable characters */
    public static abstract class AbstractBinderC3190 extends android.os.Binder implements Yue.InterfaceC3188 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f10539 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f10540 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f10541 = 3;

        /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۢ$ۥ۟$ۥ, reason: contains not printable characters */
        public static class C3191 implements Yue.InterfaceC3188 {

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public android.os.IBinder f10542;

            public C3191(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.f10542 = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.f10542
                    return r0
            }

            @Override // Yue.InterfaceC3188
            /* JADX INFO: renamed from: ۥ۟ */
            public void mo13592(java.lang.String r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = Yue.InterfaceC3188.f10538     // Catch: java.lang.Throwable -> L18
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L18
                    r0.writeString(r5)     // Catch: java.lang.Throwable -> L18
                    android.os.IBinder r5 = r4.f10542     // Catch: java.lang.Throwable -> L18
                    r1 = 0
                    r2 = 1
                    r3 = 3
                    r5.transact(r3, r0, r1, r2)     // Catch: java.lang.Throwable -> L18
                    r0.recycle()
                    return
                L18:
                    r5 = move-exception
                    r0.recycle()
                    throw r5
            }

            @Override // Yue.InterfaceC3188
            /* JADX INFO: renamed from: ۥ۟۟۟ */
            public void mo13593(java.lang.String r3, int r4, java.lang.String r5) throws android.os.RemoteException {
                    r2 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = Yue.InterfaceC3188.f10538     // Catch: java.lang.Throwable -> L1e
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1e
                    r0.writeString(r3)     // Catch: java.lang.Throwable -> L1e
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L1e
                    r0.writeString(r5)     // Catch: java.lang.Throwable -> L1e
                    android.os.IBinder r3 = r2.f10542     // Catch: java.lang.Throwable -> L1e
                    r4 = 0
                    r5 = 1
                    r1 = 2
                    r3.transact(r1, r0, r4, r5)     // Catch: java.lang.Throwable -> L1e
                    r0.recycle()
                    return
                L1e:
                    r3 = move-exception
                    r0.recycle()
                    throw r3
            }

            @Override // Yue.InterfaceC3188
            /* JADX INFO: renamed from: ۥ۟۟۟۠ */
            public void mo13594(java.lang.String r3, int r4, java.lang.String r5, android.app.Notification r6) throws android.os.RemoteException {
                    r2 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = Yue.InterfaceC3188.f10538     // Catch: java.lang.Throwable -> L21
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L21
                    r0.writeString(r3)     // Catch: java.lang.Throwable -> L21
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L21
                    r0.writeString(r5)     // Catch: java.lang.Throwable -> L21
                    r3 = 0
                    Yue.InterfaceC3188.C3192.m13598(r0, r6, r3)     // Catch: java.lang.Throwable -> L21
                    android.os.IBinder r3 = r2.f10542     // Catch: java.lang.Throwable -> L21
                    r4 = 0
                    r5 = 1
                    r3.transact(r5, r0, r4, r5)     // Catch: java.lang.Throwable -> L21
                    r0.recycle()
                    return
                L21:
                    r3 = move-exception
                    r0.recycle()
                    throw r3
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public java.lang.String m13596() {
                    r1 = this;
                    java.lang.String r0 = Yue.InterfaceC3188.f10538
                    return r0
            }
        }

        public AbstractBinderC3190() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = Yue.InterfaceC3188.f10538
                r1.attachInterface(r1, r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static Yue.InterfaceC3188 m13595(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = Yue.InterfaceC3188.f10538
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof Yue.InterfaceC3188
                if (r1 == 0) goto L13
                Yue.ۥ۠ۥ۟ۢ r0 = (Yue.InterfaceC3188) r0
                return r0
            L13:
                Yue.ۥ۠ۥ۟ۢ$ۥ۟$ۥ r0 = new Yue.ۥ۠ۥ۟ۢ$ۥ۟$ۥ
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
                r3 = this;
                java.lang.String r0 = Yue.InterfaceC3188.f10538
                r1 = 1
                if (r4 < r1) goto Ld
                r2 = 16777215(0xffffff, float:2.3509886E-38)
                if (r4 > r2) goto Ld
                r5.enforceInterface(r0)
            Ld:
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 != r2) goto L16
                r6.writeString(r0)
                return r1
            L16:
                if (r4 == r1) goto L3b
                r0 = 2
                if (r4 == r0) goto L2b
                r0 = 3
                if (r4 == r0) goto L23
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L23:
                java.lang.String r4 = r5.readString()
                r3.mo13592(r4)
                goto L52
            L2b:
                java.lang.String r4 = r5.readString()
                int r6 = r5.readInt()
                java.lang.String r5 = r5.readString()
                r3.mo13593(r4, r6, r5)
                goto L52
            L3b:
                java.lang.String r4 = r5.readString()
                int r6 = r5.readInt()
                java.lang.String r7 = r5.readString()
                android.os.Parcelable$Creator r0 = android.app.Notification.CREATOR
                java.lang.Object r5 = Yue.InterfaceC3188.C3192.m13597(r5, r0)
                android.app.Notification r5 = (android.app.Notification) r5
                r3.mo13594(r4, r6, r7, r5)
            L52:
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۢ$ۥ۟۟, reason: contains not printable characters */
    public static class C3192 {
        public C3192() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ java.lang.Object m13597(android.os.Parcel r0, android.os.Parcelable.Creator r1) {
                java.lang.Object r0 = m13599(r0, r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ void m13598(android.os.Parcel r0, android.os.Parcelable r1, int r2) {
                m13600(r0, r1, r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static <T> T m13599(android.os.Parcel r1, android.os.Parcelable.Creator<T> r2) {
                int r0 = r1.readInt()
                if (r0 == 0) goto Lb
                java.lang.Object r1 = r2.createFromParcel(r1)
                return r1
            Lb:
                r1 = 0
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static <T extends android.os.Parcelable> void m13600(android.os.Parcel r1, T r2, int r3) {
                if (r2 == 0) goto La
                r0 = 1
                r1.writeInt(r0)
                r2.writeToParcel(r1, r3)
                goto Le
            La:
                r2 = 0
                r1.writeInt(r2)
            Le:
                return
        }
    }

    static {
            r0 = 36
            r1 = 46
            java.lang.String r2 = "android$support$v4$app$INotificationSideChannel"
            java.lang.String r0 = r2.replace(r0, r1)
            Yue.InterfaceC3188.f10538 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    void mo13592(java.lang.String r1) throws android.os.RemoteException;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    void mo13593(java.lang.String r1, int r2, java.lang.String r3) throws android.os.RemoteException;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    void mo13594(java.lang.String r1, int r2, java.lang.String r3, android.app.Notification r4) throws android.os.RemoteException;
}

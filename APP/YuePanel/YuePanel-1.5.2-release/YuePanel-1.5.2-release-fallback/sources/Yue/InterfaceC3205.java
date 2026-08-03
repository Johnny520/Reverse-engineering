package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
public interface InterfaceC3205 extends android.os.IInterface {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f10549 = null;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۧ$ۥ, reason: contains not printable characters */
    public static class C3206 implements Yue.InterfaceC3205 {
        public C3206() {
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

        @Override // Yue.InterfaceC3205
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo13619(boolean r1, boolean r2) throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۧ$ۥ۟, reason: contains not printable characters */
    public static abstract class AbstractBinderC3207 extends android.os.Binder implements Yue.InterfaceC3205 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f10550 = 1;

        /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۧ$ۥ۟$ۥ, reason: contains not printable characters */
        public static class C3208 implements Yue.InterfaceC3205 {

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public android.os.IBinder f10551;

            public C3208(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.f10551 = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.f10551
                    return r0
            }

            @Override // Yue.InterfaceC3205
            /* JADX INFO: renamed from: ۥ۟۟۟۟ */
            public void mo13619(boolean r3, boolean r4) throws android.os.RemoteException {
                    r2 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = Yue.InterfaceC3205.f10549     // Catch: java.lang.Throwable -> L1a
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1a
                    r1 = 1
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L1a
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L1a
                    android.os.IBinder r3 = r2.f10551     // Catch: java.lang.Throwable -> L1a
                    r4 = 0
                    r3.transact(r1, r0, r4, r1)     // Catch: java.lang.Throwable -> L1a
                    r0.recycle()
                    return
                L1a:
                    r3 = move-exception
                    r0.recycle()
                    throw r3
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public java.lang.String m13621() {
                    r1 = this;
                    java.lang.String r0 = Yue.InterfaceC3205.f10549
                    return r0
            }
        }

        public AbstractBinderC3207() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = Yue.InterfaceC3205.f10549
                r1.attachInterface(r1, r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static Yue.InterfaceC3205 m13620(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = Yue.InterfaceC3205.f10549
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof Yue.InterfaceC3205
                if (r1 == 0) goto L13
                Yue.ۥ۠ۥ۟ۧ r0 = (Yue.InterfaceC3205) r0
                return r0
            L13:
                Yue.ۥ۠ۥ۟ۧ$ۥ۟$ۥ r0 = new Yue.ۥ۠ۥ۟ۧ$ۥ۟$ۥ
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
                java.lang.String r0 = Yue.InterfaceC3205.f10549
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
                if (r4 == r1) goto L1d
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L1d:
                int r4 = r5.readInt()
                r6 = 0
                if (r4 == 0) goto L26
                r4 = r1
                goto L27
            L26:
                r4 = r6
            L27:
                int r5 = r5.readInt()
                if (r5 == 0) goto L2e
                r6 = r1
            L2e:
                r3.mo13619(r4, r6)
                return r1
        }
    }

    static {
            r0 = 36
            r1 = 46
            java.lang.String r2 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback"
            java.lang.String r0 = r2.replace(r0, r1)
            Yue.InterfaceC3205.f10549 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    void mo13619(boolean r1, boolean r2) throws android.os.RemoteException;
}

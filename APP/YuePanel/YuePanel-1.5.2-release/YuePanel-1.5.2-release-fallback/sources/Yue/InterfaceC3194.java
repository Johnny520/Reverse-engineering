package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
public interface InterfaceC3194 extends android.os.IInterface {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f10543 = null;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۤ$ۥ, reason: contains not printable characters */
    public static class C3195 implements Yue.InterfaceC3194 {
        public C3195() {
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

        @Override // Yue.InterfaceC3194
        /* JADX INFO: renamed from: ۥ */
        public void mo13604(int r1, android.os.Bundle r2) throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۤ$ۥ۟, reason: contains not printable characters */
    public static abstract class AbstractBinderC3196 extends android.os.Binder implements Yue.InterfaceC3194 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f10544 = 1;

        /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۤ$ۥ۟$ۥ, reason: contains not printable characters */
        public static class C3197 implements Yue.InterfaceC3194 {

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public android.os.IBinder f10545;

            public C3197(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.f10545 = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.f10545
                    return r0
            }

            @Override // Yue.InterfaceC3194
            /* JADX INFO: renamed from: ۥ */
            public void mo13604(int r3, android.os.Bundle r4) throws android.os.RemoteException {
                    r2 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = Yue.InterfaceC3194.f10543     // Catch: java.lang.Throwable -> L1b
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1b
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L1b
                    r3 = 0
                    Yue.InterfaceC3194.C3198.m13608(r0, r4, r3)     // Catch: java.lang.Throwable -> L1b
                    android.os.IBinder r3 = r2.f10545     // Catch: java.lang.Throwable -> L1b
                    r4 = 0
                    r1 = 1
                    r3.transact(r1, r0, r4, r1)     // Catch: java.lang.Throwable -> L1b
                    r0.recycle()
                    return
                L1b:
                    r3 = move-exception
                    r0.recycle()
                    throw r3
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public java.lang.String m13606() {
                    r1 = this;
                    java.lang.String r0 = Yue.InterfaceC3194.f10543
                    return r0
            }
        }

        public AbstractBinderC3196() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = Yue.InterfaceC3194.f10543
                r1.attachInterface(r1, r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static Yue.InterfaceC3194 m13605(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = Yue.InterfaceC3194.f10543
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof Yue.InterfaceC3194
                if (r1 == 0) goto L13
                Yue.ۥ۠ۥ۟ۤ r0 = (Yue.InterfaceC3194) r0
                return r0
            L13:
                Yue.ۥ۠ۥ۟ۤ$ۥ۟$ۥ r0 = new Yue.ۥ۠ۥ۟ۤ$ۥ۟$ۥ
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
                java.lang.String r0 = Yue.InterfaceC3194.f10543
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
                android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
                java.lang.Object r5 = Yue.InterfaceC3194.C3198.m13607(r5, r6)
                android.os.Bundle r5 = (android.os.Bundle) r5
                r3.mo13604(r4, r5)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۤ$ۥ۟۟, reason: contains not printable characters */
    public static class C3198 {
        public C3198() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ java.lang.Object m13607(android.os.Parcel r0, android.os.Parcelable.Creator r1) {
                java.lang.Object r0 = m13609(r0, r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ void m13608(android.os.Parcel r0, android.os.Parcelable r1, int r2) {
                m13610(r0, r1, r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static <T> T m13609(android.os.Parcel r1, android.os.Parcelable.Creator<T> r2) {
                int r0 = r1.readInt()
                if (r0 == 0) goto Lb
                java.lang.Object r1 = r2.createFromParcel(r1)
                return r1
            Lb:
                r1 = 0
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static <T extends android.os.Parcelable> void m13610(android.os.Parcel r1, T r2, int r3) {
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
            java.lang.String r2 = "android$support$v4$os$IResultReceiver"
            java.lang.String r0 = r2.replace(r0, r1)
            Yue.InterfaceC3194.f10543 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    void mo13604(int r1, android.os.Bundle r2) throws android.os.RemoteException;
}

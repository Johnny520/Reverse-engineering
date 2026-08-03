package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
public interface InterfaceC3199 extends android.os.IInterface {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f10546 = null;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۥ$ۥ, reason: contains not printable characters */
    public static class C3200 implements Yue.InterfaceC3199 {
        public C3200() {
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

        @Override // Yue.InterfaceC3199
        /* JADX INFO: renamed from: ۥ */
        public void mo13611(int r1, android.os.Bundle r2) throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۥ$ۥ۟, reason: contains not printable characters */
    public static abstract class AbstractBinderC3201 extends android.os.Binder implements Yue.InterfaceC3199 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f10547 = 1;

        /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۥ$ۥ۟$ۥ, reason: contains not printable characters */
        public static class C3202 implements Yue.InterfaceC3199 {

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public android.os.IBinder f10548;

            public C3202(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.f10548 = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.f10548
                    return r0
            }

            @Override // Yue.InterfaceC3199
            /* JADX INFO: renamed from: ۥ */
            public void mo13611(int r3, android.os.Bundle r4) throws android.os.RemoteException {
                    r2 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = Yue.InterfaceC3199.f10546     // Catch: java.lang.Throwable -> L1b
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1b
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L1b
                    r3 = 0
                    Yue.InterfaceC3199.C3203.m13615(r0, r4, r3)     // Catch: java.lang.Throwable -> L1b
                    android.os.IBinder r3 = r2.f10548     // Catch: java.lang.Throwable -> L1b
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
            public java.lang.String m13613() {
                    r1 = this;
                    java.lang.String r0 = Yue.InterfaceC3199.f10546
                    return r0
            }
        }

        public AbstractBinderC3201() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = Yue.InterfaceC3199.f10546
                r1.attachInterface(r1, r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static Yue.InterfaceC3199 m13612(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = Yue.InterfaceC3199.f10546
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof Yue.InterfaceC3199
                if (r1 == 0) goto L13
                Yue.ۥ۠ۥ۟ۥ r0 = (Yue.InterfaceC3199) r0
                return r0
            L13:
                Yue.ۥ۠ۥ۟ۥ$ۥ۟$ۥ r0 = new Yue.ۥ۠ۥ۟ۥ$ۥ۟$ۥ
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
                java.lang.String r0 = Yue.InterfaceC3199.f10546
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
                java.lang.Object r5 = Yue.InterfaceC3199.C3203.m13614(r5, r6)
                android.os.Bundle r5 = (android.os.Bundle) r5
                r3.mo13611(r4, r5)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۥ$ۥ۟۟, reason: contains not printable characters */
    public static class C3203 {
        public C3203() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ java.lang.Object m13614(android.os.Parcel r0, android.os.Parcelable.Creator r1) {
                java.lang.Object r0 = m13616(r0, r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ void m13615(android.os.Parcel r0, android.os.Parcelable r1, int r2) {
                m13617(r0, r1, r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static <T> T m13616(android.os.Parcel r1, android.os.Parcelable.Creator<T> r2) {
                int r0 = r1.readInt()
                if (r0 == 0) goto Lb
                java.lang.Object r1 = r2.createFromParcel(r1)
                return r1
            Lb:
                r1 = 0
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static <T extends android.os.Parcelable> void m13617(android.os.Parcel r1, T r2, int r3) {
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
            java.lang.String r2 = "android$support$v4$os$IResultReceiver2"
            java.lang.String r0 = r2.replace(r0, r1)
            Yue.InterfaceC3199.f10546 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    void mo13611(int r1, android.os.Bundle r2) throws android.os.RemoteException;
}

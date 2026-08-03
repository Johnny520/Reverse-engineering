package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class ServiceConnectionC6606 implements android.content.ServiceConnection {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC6959
    @Yue.InterfaceC4544
    public Yue.InterfaceC3209 f23028;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public Yue.C5348<java.lang.Integer> f23029;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final android.content.Context f23030;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f23031;

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۢ$ۥ, reason: contains not printable characters */
    public class BinderC6607 extends Yue.InterfaceC3205.AbstractBinderC3207 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ Yue.ServiceConnectionC6606 f23032;

        public BinderC6607(Yue.ServiceConnectionC6606 r1) {
                r0 = this;
                r0.f23032 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC3205
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo13619(boolean r1, boolean r2) throws android.os.RemoteException {
                r0 = this;
                if (r1 == 0) goto L1e
                if (r2 == 0) goto L11
                Yue.ۥۣۢۡۢ r1 = r0.f23032
                Yue.ۥۡۦۦ۟<java.lang.Integer> r1 = r1.f23029
                r2 = 3
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.mo459(r2)
                goto L31
            L11:
                Yue.ۥۣۢۡۢ r1 = r0.f23032
                Yue.ۥۡۦۦ۟<java.lang.Integer> r1 = r1.f23029
                r2 = 2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.mo459(r2)
                goto L31
            L1e:
                Yue.ۥۣۢۡۢ r1 = r0.f23032
                Yue.ۥۡۦۦ۟<java.lang.Integer> r1 = r1.f23029
                r2 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.mo459(r2)
                java.lang.String r1 = "PackageManagerCompat"
                java.lang.String r2 = "Unable to retrieve the permission revocation setting from the backport"
                android.util.Log.e(r1, r2)
            L31:
                return
        }
    }

    public ServiceConnectionC6606(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f23028 = r0
            r0 = 0
            r1.f23031 = r0
            r1.f23030 = r2
            return
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName r1, android.os.IBinder r2) {
            r0 = this;
            Yue.ۥ۠ۥ۟ۨ r1 = Yue.InterfaceC3209.AbstractBinderC3211.m13623(r2)
            r0.f23028 = r1
            Yue.ۥ۠ۥ۟ۧ r2 = r0.m25410()     // Catch: android.os.RemoteException -> Le
            r1.mo13622(r2)     // Catch: android.os.RemoteException -> Le
            goto L18
        Le:
            Yue.ۥۡۦۦ۟<java.lang.Integer> r1 = r0.f23029
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.mo459(r2)
        L18:
            return
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName r1) {
            r0 = this;
            r1 = 0
            r0.f23028 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m25408(@Yue.InterfaceC4410 Yue.C5348<java.lang.Integer> r3) {
            r2 = this;
            boolean r0 = r2.f23031
            if (r0 != 0) goto L24
            r0 = 1
            r2.f23031 = r0
            r2.f23029 = r3
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r1 = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService"
            r3.<init>(r1)
            android.content.Context r1 = r2.f23030
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r1 = Yue.C4661.m18508(r1)
            android.content.Intent r3 = r3.setPackage(r1)
            android.content.Context r1 = r2.f23030
            r1.bindService(r3, r2, r0)
            return
        L24:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Each UnusedAppRestrictionsBackportServiceConnection can only be bound once."
            r3.<init>(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m25409() {
            r2 = this;
            boolean r0 = r2.f23031
            if (r0 == 0) goto Ld
            r0 = 0
            r2.f23031 = r0
            android.content.Context r0 = r2.f23030
            r0.unbindService(r2)
            return
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "bindService must be called before unbind"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.InterfaceC3205 m25410() {
            r1 = this;
            Yue.ۥۣۢۡۢ$ۥ r0 = new Yue.ۥۣۢۡۢ$ۥ
            r0.<init>(r1)
            return r0
    }
}

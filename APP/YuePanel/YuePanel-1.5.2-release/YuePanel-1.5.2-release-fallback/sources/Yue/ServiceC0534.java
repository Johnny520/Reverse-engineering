package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceC0534 extends android.app.Service {

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۥۤ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C0535 {
        public C0535() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static int m1892() {
                r0 = 512(0x200, float:7.17E-43)
                return r0
        }
    }

    public ServiceC0534() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.content.pm.ServiceInfo m1891(@Yue.InterfaceC4410 android.content.Context r4) throws android.content.pm.PackageManager.NameNotFoundException {
            int r0 = Yue.ServiceC0534.C0535.m1892()
            r0 = r0 | 128(0x80, float:1.8E-43)
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.Class<Yue.ۥ۟ۡۥۤ> r3 = Yue.ServiceC0534.class
            r2.<init>(r4, r3)
            android.content.pm.ServiceInfo r4 = r1.getServiceInfo(r2, r0)
            return r4
    }

    @Override // android.app.Service
    @Yue.InterfaceC4410
    public android.os.IBinder onBind(@Yue.InterfaceC4410 android.content.Intent r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}

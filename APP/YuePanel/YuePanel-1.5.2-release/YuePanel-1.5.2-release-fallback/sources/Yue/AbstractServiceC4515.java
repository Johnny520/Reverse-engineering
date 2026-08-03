package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC4515 extends android.app.Service {

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۣ$ۥ, reason: contains not printable characters */
    public class BinderC4516 extends Yue.InterfaceC3188.AbstractBinderC3190 {

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractServiceC4515 f14421;

        public BinderC4516(Yue.AbstractServiceC4515 r1) {
                r0 = this;
                r0.f14421 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC3188
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo13592(java.lang.String r4) {
                r3 = this;
                Yue.ۥۡۢۦۣ r0 = r3.f14421
                int r1 = android.os.Binder.getCallingUid()
                r0.m17930(r1, r4)
                long r0 = android.os.Binder.clearCallingIdentity()
                Yue.ۥۡۢۦۣ r2 = r3.f14421     // Catch: java.lang.Throwable -> L16
                r2.m17929(r4)     // Catch: java.lang.Throwable -> L16
                android.os.Binder.restoreCallingIdentity(r0)
                return
            L16:
                r4 = move-exception
                android.os.Binder.restoreCallingIdentity(r0)
                throw r4
        }

        @Override // Yue.InterfaceC3188
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo13593(java.lang.String r4, int r5, java.lang.String r6) throws android.os.RemoteException {
                r3 = this;
                Yue.ۥۡۢۦۣ r0 = r3.f14421
                int r1 = android.os.Binder.getCallingUid()
                r0.m17930(r1, r4)
                long r0 = android.os.Binder.clearCallingIdentity()
                Yue.ۥۡۢۦۣ r2 = r3.f14421     // Catch: java.lang.Throwable -> L16
                r2.m17928(r4, r5, r6)     // Catch: java.lang.Throwable -> L16
                android.os.Binder.restoreCallingIdentity(r0)
                return
            L16:
                r4 = move-exception
                android.os.Binder.restoreCallingIdentity(r0)
                throw r4
        }

        @Override // Yue.InterfaceC3188
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public void mo13594(java.lang.String r4, int r5, java.lang.String r6, android.app.Notification r7) throws android.os.RemoteException {
                r3 = this;
                Yue.ۥۡۢۦۣ r0 = r3.f14421
                int r1 = android.os.Binder.getCallingUid()
                r0.m17930(r1, r4)
                long r0 = android.os.Binder.clearCallingIdentity()
                Yue.ۥۡۢۦۣ r2 = r3.f14421     // Catch: java.lang.Throwable -> L16
                r2.m17931(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L16
                android.os.Binder.restoreCallingIdentity(r0)
                return
            L16:
                r4 = move-exception
                android.os.Binder.restoreCallingIdentity(r0)
                throw r4
        }
    }

    public AbstractServiceC4515() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Service
    @Yue.InterfaceC1817(api = 19, message = "SDKs past 19 have no need for side channeling.")
    public android.os.IBinder onBind(android.content.Intent r2) {
            r1 = this;
            java.lang.String r2 = r2.getAction()
            java.lang.String r0 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            r2.equals(r0)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public abstract void m17928(java.lang.String r1, int r2, java.lang.String r3);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public abstract void m17929(java.lang.String r1);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m17930(int r5, java.lang.String r6) {
            r4 = this;
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String[] r0 = r0.getPackagesForUid(r5)
            int r1 = r0.length
            r2 = 0
        La:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L15
            return
        L15:
            int r2 = r2 + 1
            goto La
        L18:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "NotificationSideChannelService: Uid "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " is not authorized for package "
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public abstract void m17931(java.lang.String r1, int r2, java.lang.String r3, android.app.Notification r4);
}

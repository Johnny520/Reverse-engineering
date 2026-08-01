package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class NotificationCompatSideChannelService extends android.app.Service {
    public NotificationCompatSideChannelService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent r2) {
            r1 = this;
            java.lang.String r2 = r2.getAction()
            java.lang.String r0 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            r2.equals(r0)
            r2 = 0
            return r2
    }
}

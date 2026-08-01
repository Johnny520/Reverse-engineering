package androidx.core.app;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class NotificationCompatSideChannelService extends android.app.Service {
    public NotificationCompatSideChannelService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            java.lang.String r0 = r1.getAction()
            java.lang.String r1 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            r0.equals(r1)
            r0 = 0
            return r0
    }
}

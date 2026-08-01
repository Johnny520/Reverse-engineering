package androidx.core.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public abstract class NotificationCompatSideChannelService extends Service {
    public NotificationCompatSideChannelService() {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent r2) {
        r2.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
        return null;
    }
}

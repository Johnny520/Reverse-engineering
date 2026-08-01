package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import p253r4.AbstractC6484a;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC6484a abstractC6484a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1829a = (IconCompat) abstractC6484a.m25721v(remoteActionCompat.f1829a, 1);
        remoteActionCompat.f1830b = abstractC6484a.m25711l(remoteActionCompat.f1830b, 2);
        remoteActionCompat.f1831c = abstractC6484a.m25711l(remoteActionCompat.f1831c, 3);
        remoteActionCompat.f1832d = (PendingIntent) abstractC6484a.m25717r(remoteActionCompat.f1832d, 4);
        remoteActionCompat.f1833e = abstractC6484a.m25707h(remoteActionCompat.f1833e, 5);
        remoteActionCompat.f1834f = abstractC6484a.m25707h(remoteActionCompat.f1834f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC6484a abstractC6484a) {
        abstractC6484a.m25723x(false, false);
        abstractC6484a.m25698M(remoteActionCompat.f1829a, 1);
        abstractC6484a.m25689D(remoteActionCompat.f1830b, 2);
        abstractC6484a.m25689D(remoteActionCompat.f1831c, 3);
        abstractC6484a.m25693H(remoteActionCompat.f1832d, 4);
        abstractC6484a.m25725z(remoteActionCompat.f1833e, 5);
        abstractC6484a.m25725z(remoteActionCompat.f1834f, 6);
    }
}

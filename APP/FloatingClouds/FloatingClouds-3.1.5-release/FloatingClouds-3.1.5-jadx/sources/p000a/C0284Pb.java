package p000a;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: renamed from: a.Pb */
/* JADX INFO: loaded from: classes.dex */
public final class C0284Pb {

    /* JADX INFO: renamed from: a */
    public final NotificationManager f978a;

    /* JADX INFO: renamed from: a.Pb$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static boolean m775a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        /* JADX INFO: renamed from: b */
        public static int m776b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    static {
        new HashSet();
    }

    public C0284Pb(Context context) {
        this.f978a = (NotificationManager) context.getSystemService("notification");
    }
}

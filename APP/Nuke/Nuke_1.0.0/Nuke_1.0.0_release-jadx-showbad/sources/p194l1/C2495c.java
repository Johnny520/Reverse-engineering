package p194l1;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: renamed from: l1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2495c {

    /* JADX INFO: renamed from: a */
    public final NotificationManager f8004a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new HashSet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2495c(Context context) {
        this.f8004a = (NotificationManager) context.getSystemService("notification");
    }
}

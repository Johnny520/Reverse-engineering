package p000;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class oo1 {

    /* JADX INFO: renamed from: a */
    public final NotificationManager f7752a;

    static {
        new HashSet();
    }

    public oo1(Context context) {
        this.f7752a = (NotificationManager) context.getSystemService("notification");
    }
}

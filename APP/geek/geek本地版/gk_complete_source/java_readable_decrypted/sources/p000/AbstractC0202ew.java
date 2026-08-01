package p000;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: renamed from: ew */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0202ew {
    /* JADX INFO: renamed from: a */
    public static Intent m1089a(Activity activity) {
        return activity.getParentActivityIntent();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1090b(Activity activity, Intent intent) {
        return activity.navigateUpTo(intent);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1091c(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}

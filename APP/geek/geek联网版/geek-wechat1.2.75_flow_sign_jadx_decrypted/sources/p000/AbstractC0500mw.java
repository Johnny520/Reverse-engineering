package p000;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: renamed from: mw */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0500mw {
    /* JADX INFO: renamed from: a */
    public static Intent m1904a(Activity activity) {
        return activity.getParentActivityIntent();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1905b(Activity activity, Intent intent) {
        return activity.navigateUpTo(intent);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1906c(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}

package p000;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* JADX INFO: renamed from: q1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0618q1 {
    /* JADX INFO: renamed from: a */
    public static void m2136a(Activity activity) {
        activity.finishAffinity();
    }

    /* JADX INFO: renamed from: b */
    public static void m2137b(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    /* JADX INFO: renamed from: c */
    public static void m2138c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}

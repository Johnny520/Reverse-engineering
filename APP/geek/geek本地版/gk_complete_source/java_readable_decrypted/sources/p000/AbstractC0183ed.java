package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0183ed {
    /* JADX INFO: renamed from: a */
    public static void m1019a(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
    }

    /* JADX INFO: renamed from: b */
    public static void m1020b(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }
}

package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: od */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0555od {
    /* JADX INFO: renamed from: a */
    public static void m2024a(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
    }

    /* JADX INFO: renamed from: b */
    public static void m2025b(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }
}

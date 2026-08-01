package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class ed {
    public static void a(Context r0, Intent[] r1, Bundle r2) {
        r0.startActivities(r1, r2);
    }

    public static void b(Context r0, Intent r1, Bundle r2) {
        r0.startActivity(r1, r2);
    }
}

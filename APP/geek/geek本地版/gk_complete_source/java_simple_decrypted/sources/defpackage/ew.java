package defpackage;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public abstract class ew {
    public static Intent a(Activity r0) {
        return r0.getParentActivityIntent();
    }

    public static boolean b(Activity r0, Intent r1) {
        return r0.navigateUpTo(r1);
    }

    public static boolean c(Activity r0, Intent r1) {
        return r0.shouldUpRecreateTask(r1);
    }
}

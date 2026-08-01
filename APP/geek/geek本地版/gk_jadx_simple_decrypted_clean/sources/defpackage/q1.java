package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class q1 {
    public static void a(Activity r0) {
        r0.finishAffinity();
    }

    public static void b(Activity r0, Intent r1, int r2, Bundle r3) {
        r0.startActivityForResult(r1, r2, r3);
    }

    public static void c(Activity r0, IntentSender r1, int r2, Intent r3, int r4, int r5, int r6, Bundle r7) {
        r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7);
    }
}

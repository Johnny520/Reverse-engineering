package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.a;
import defpackage.p00;

/* JADX INFO: loaded from: classes.dex */
public abstract class n00 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity r1, iq r2) {
        ip.o("event", r2);
        if ((r1 instanceof oq) == false) goto L8;
        a r12 = ((oq) r1).e();
        if (r12 == null) goto L9;
        r12.d(r2);
        return;
    L9:
        return;
    }

    public static void b(Activity r3) {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        p00.a.Companion.getClass();
        f0.i(r3, new p00.a());
    L5:
        FragmentManager r32 = r3.getFragmentManager();
        if (r32.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") != null) goto L9;
        r32.beginTransaction().add(new p00(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
        r32.executePendingTransactions();
        return;
    }
}

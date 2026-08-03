package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import p001A0.AbstractC0016B;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: androidx.lifecycle.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0537n extends AbstractC0529f {
    public C0537n() {
    }

    @Override // androidx.lifecycle.AbstractC0529f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity r3, Bundle r4) {
        AbstractC0307g.m703e(r3, "activity");
        int r42 = FragmentC0515D.f1457b;
        if (Build.VERSION.SDK_INT < 29) goto L5;
        C0514C.Companion.getClass();
        AbstractC0016B.m38k(r3, new C0514C());
    L5:
        FragmentManager r32 = r3.getFragmentManager();
        if (r32.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") != null) goto L9;
        r32.beginTransaction().add(new FragmentC0515D(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
        r32.executePendingTransactions();
        return;
    }
}

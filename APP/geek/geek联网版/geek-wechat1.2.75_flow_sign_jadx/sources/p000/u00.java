package p000;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.C0036a;
import p000.w00;

/* JADX INFO: loaded from: classes.dex */
public abstract class u00 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m2423a(Activity activity, EnumC0494mq enumC0494mq) {
        C0036a c0036aMo105e;
        AbstractC0493mp.m1857g("event", enumC0494mq);
        if (!(activity instanceof InterfaceC0716sq) || (c0036aMo105e = ((InterfaceC0716sq) activity).mo105e()) == null) {
            return;
        }
        c0036aMo105e.m262d(enumC0494mq);
    }

    /* JADX INFO: renamed from: b */
    public static void m2424b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            w00.C0839a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new w00.C0839a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new w00(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}

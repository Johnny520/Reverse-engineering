package p000;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.C0036a;
import p000.p00;

/* JADX INFO: loaded from: classes.dex */
public abstract class n00 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m1880a(Activity activity, EnumC0347iq enumC0347iq) {
        C0036a c0036aMo120e;
        AbstractC0346ip.m1503o("event", enumC0347iq);
        if (!(activity instanceof InterfaceC0568oq) || (c0036aMo120e = ((InterfaceC0568oq) activity).mo120e()) == null) {
            return;
        }
        c0036aMo120e.m277d(enumC0347iq);
    }

    /* JADX INFO: renamed from: b */
    public static void m1881b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            p00.C0580a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new p00.C0580a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new p00(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}

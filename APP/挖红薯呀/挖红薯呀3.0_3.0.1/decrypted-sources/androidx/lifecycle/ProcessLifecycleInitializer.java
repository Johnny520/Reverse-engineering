package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;
import p000.C0294hs;
import p000.C0541o8;
import p000.C0921xc;
import p000.ns0;
import p000.os0;
import p000.q90;
import p000.t10;
import p000.t90;
import p000.u90;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements t10 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.t10
    /* JADX INFO: renamed from: a */
    public final List mo189a() {
        return C0294hs.f2354d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.t10
    /* JADX INFO: renamed from: b */
    public final Object mo190b(Context context) {
        context.getClass();
        C0541o8 c0541o8M2796g = C0541o8.m2796g(context);
        c0541o8M2796g.getClass();
        if (!((HashSet) c0541o8M2796g.f4481b).contains(ProcessLifecycleInitializer.class)) {
            C0921xc.m5134o("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!u90.f6170a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new t90());
        }
        os0 os0Var = os0.f4621k;
        os0Var.getClass();
        os0Var.f4626h = new Handler();
        os0Var.f4627i.m5461e(q90.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new ns0(os0Var));
        return os0Var;
    }
}

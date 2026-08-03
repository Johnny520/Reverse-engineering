package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;
import p000.AbstractC0846Tn;
import p000.C0452Kf;
import p000.C0803Sn;
import p000.C2656w4;
import p000.C2817zu;
import p000.EnumC0632On;
import p000.InterfaceC2327ol;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC2327ol {
    @Override // p000.InterfaceC2327ol
    /* JADX INFO: renamed from: a */
    public final List mo2164a() {
        return C0452Kf.f1484a;
    }

    @Override // p000.InterfaceC2327ol
    /* JADX INFO: renamed from: b */
    public final Object mo2165b(Context context) {
        if (!((HashSet) C2656w4.m5192u(context).f9197c).contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0846Tn.f2691a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0803Sn());
        }
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f3964i;
        processLifecycleOwner.getClass();
        processLifecycleOwner.f3969e = new Handler();
        processLifecycleOwner.f3970f.m2276e(EnumC0632On.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C2817zu(processLifecycleOwner));
        return processLifecycleOwner;
    }
}

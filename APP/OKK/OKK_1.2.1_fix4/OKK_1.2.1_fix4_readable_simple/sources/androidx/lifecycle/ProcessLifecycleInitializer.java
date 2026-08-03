package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import p009E0.C0190u;
import p031Q0.AbstractC0307g;
import p041W.C0414a;
import p041W.InterfaceC0415b;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0415b {
    public ProcessLifecycleInitializer() {
    }

    @Override // p041W.InterfaceC0415b
    /* JADX INFO: renamed from: a */
    public final List mo999a() {
        return C0190u.f401a;
    }

    @Override // p041W.InterfaceC0415b
    /* JADX INFO: renamed from: b */
    public final Object mo1000b(Context r5) {
        AbstractC0307g.m703e(r5, "context");
        C0414a r02 = C0414a.m996c(r5);
        AbstractC0307g.m702d(r02, "getInstance(context)");
        if (r02.f919b.contains(ProcessLifecycleInitializer.class) == false) goto L11;
        if (AbstractC0538o.f1488a.getAndSet(true) == true) goto L8;
        Context r03 = r5.getApplicationContext();
        AbstractC0307g.m701c(r03, "null cannot be cast to non-null type android.app.Application");
        ((Application) r03).registerActivityLifecycleCallbacks(new C0537n());
    L8:
        C0512A r04 = C0512A.f1447i;
        r04.getClass();
        r04.f1452e = new Handler();
        r04.f1453f.m1257d(EnumC0535l.ON_CREATE);
        Context r52 = r5.getApplicationContext();
        AbstractC0307g.m701c(r52, "null cannot be cast to non-null type android.app.Application");
        ((Application) r52).registerActivityLifecycleCallbacks(new C0549z(r04));
        return r04;
    L11:
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}

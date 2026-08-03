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
    @Override // p041W.InterfaceC0415b
    /* JADX INFO: renamed from: a */
    public final List mo999a() {
        return C0190u.f401a;
    }

    @Override // p041W.InterfaceC0415b
    /* JADX INFO: renamed from: b */
    public final Object mo1000b(Context context) {
        AbstractC0307g.m703e(context, "context");
        C0414a c0414aM996c = C0414a.m996c(context);
        AbstractC0307g.m702d(c0414aM996c, "getInstance(context)");
        if (!c0414aM996c.f919b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        if (!AbstractC0538o.f1488a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            AbstractC0307g.m701c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0537n());
        }
        C0512A c0512a = C0512A.f1447i;
        c0512a.getClass();
        c0512a.f1452e = new Handler();
        c0512a.f1453f.m1257d(EnumC0535l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC0307g.m701c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C0549z(c0512a));
        return c0512a;
    }
}

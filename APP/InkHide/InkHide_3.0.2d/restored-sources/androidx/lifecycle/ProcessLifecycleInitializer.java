package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import p011F0.C0131s;
import p026N.C0215a;
import p026N.InterfaceC0216b;
import p027N0.AbstractC0223g;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0216b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p026N.InterfaceC0216b
    /* JADX INFO: renamed from: a */
    public final List mo409a() {
        return C0131s.f426a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p026N.InterfaceC0216b
    /* JADX INFO: renamed from: b */
    public final Object mo410b(Context context) {
        AbstractC0223g.m418e(context, "context");
        C0215a c0215aM406c = C0215a.m406c(context);
        AbstractC0223g.m417d(c0215aM406c, "getInstance(context)");
        if (!c0215aM406c.f551b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0481p.f1523a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            AbstractC0223g.m416c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0480o());
        }
        C0450B c0450b = C0450B.f1456j;
        c0450b.getClass();
        c0450b.f1461f = new Handler();
        c0450b.f1462g.m930d(EnumC0478m.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC0223g.m416c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C0449A(c0450b));
        return c0450b;
    }
}

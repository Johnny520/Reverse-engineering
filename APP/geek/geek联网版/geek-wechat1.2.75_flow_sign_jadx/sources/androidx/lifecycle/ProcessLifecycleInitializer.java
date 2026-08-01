package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;
import p000.AbstractC0493mp;
import p000.AbstractC0605pq;
import p000.C0020aj;
import p000.C0539ny;
import p000.C0568oq;
import p000.C0576oy;
import p000.C0658r5;
import p000.EnumC0494mq;
import p000.InterfaceC0195ep;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0195ep {
    @Override // p000.InterfaceC0195ep
    /* JADX INFO: renamed from: a */
    public final List mo234a() {
        return C0020aj.f84a;
    }

    @Override // p000.InterfaceC0195ep
    /* JADX INFO: renamed from: b */
    public final Object mo235b(Context context) {
        AbstractC0493mp.m1857g("context", context);
        C0658r5 c0658r5M2225q = C0658r5.m2225q(context);
        AbstractC0493mp.m1856f("getInstance(context)", c0658r5M2225q);
        if (!((HashSet) c0658r5M2225q.f4065c).contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0605pq.f3733a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            AbstractC0493mp.m1855e("null cannot be cast to non-null type android.app.Application", applicationContext);
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0568oq());
        }
        C0576oy c0576oy = C0576oy.f3548i;
        c0576oy.getClass();
        c0576oy.f3553e = new Handler();
        c0576oy.f3554f.m262d(EnumC0494mq.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC0493mp.m1855e("null cannot be cast to non-null type android.app.Application", applicationContext2);
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C0539ny(c0576oy));
        return c0576oy;
    }
}

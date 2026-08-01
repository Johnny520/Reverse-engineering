package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;
import p000.AbstractC0346ip;
import p000.AbstractC0457lq;
import p000.C0241fy;
import p000.C0278gy;
import p000.C0420kq;
import p000.C0659r5;
import p000.C0931yi;
import p000.EnumC0347iq;
import p000.InterfaceC0039ap;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0039ap {
    @Override // p000.InterfaceC0039ap
    /* JADX INFO: renamed from: a */
    public final List mo249a() {
        return C0931yi.f5342a;
    }

    @Override // p000.InterfaceC0039ap
    /* JADX INFO: renamed from: b */
    public final Object mo250b(Context context) {
        AbstractC0346ip.m1503o("context", context);
        C0659r5 c0659r5M2218q = C0659r5.m2218q(context);
        AbstractC0346ip.m1502n("getInstance(context)", c0659r5M2218q);
        if (!((HashSet) c0659r5M2218q.f4210c).contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0457lq.f3083a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            AbstractC0346ip.m1501m("null cannot be cast to non-null type android.app.Application", applicationContext);
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0420kq());
        }
        C0278gy c0278gy = C0278gy.f2170i;
        c0278gy.getClass();
        c0278gy.f2175e = new Handler();
        c0278gy.f2176f.m277d(EnumC0347iq.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC0346ip.m1501m("null cannot be cast to non-null type android.app.Application", applicationContext2);
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C0241fy(c0278gy));
        return c0278gy;
    }
}

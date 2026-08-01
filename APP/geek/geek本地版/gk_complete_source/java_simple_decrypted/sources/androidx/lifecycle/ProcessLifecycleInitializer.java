package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.ap;
import defpackage.fy;
import defpackage.gy;
import defpackage.ip;
import defpackage.iq;
import defpackage.kq;
import defpackage.lq;
import defpackage.r5;
import defpackage.yi;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements ap {
    public ProcessLifecycleInitializer() {
    }

    @Override // defpackage.ap
    public final List a() {
        return yi.a;
    }

    @Override // defpackage.ap
    public final Object b(Context r5) {
        ip.o("context", r5);
        r5 r0 = r5.q(r5);
        ip.n("getInstance(context)", r0);
        if (((HashSet) r0.c).contains(ProcessLifecycleInitializer.class) == false) goto L11;
        if (lq.a.getAndSet(true) == true) goto L8;
        Context r02 = r5.getApplicationContext();
        ip.m("null cannot be cast to non-null type android.app.Application", r02);
        ((Application) r02).registerActivityLifecycleCallbacks(new kq());
    L8:
        gy r03 = gy.i;
        r03.getClass();
        r03.e = new Handler();
        r03.f.d(iq.ON_CREATE);
        Context r52 = r5.getApplicationContext();
        ip.m("null cannot be cast to non-null type android.app.Application", r52);
        ((Application) r52).registerActivityLifecycleCallbacks(new fy(r03));
        return r03;
    L11:
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }
}

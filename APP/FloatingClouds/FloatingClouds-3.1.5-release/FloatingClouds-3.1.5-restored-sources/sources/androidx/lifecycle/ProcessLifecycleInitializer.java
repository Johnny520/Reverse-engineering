package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.AbstractC1116e;
import androidx.lifecycle.C1117f;
import androidx.startup.C1228a;
import java.util.List;
import kotlin.Metadata;
import p000a.C0439Y5;
import p000a.C0631i9;
import p000a.InterfaceC0388V8;
import p000a.InterfaceC0935y9;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m3302d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3303d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "La/V8;", "La/y9;", "<init>", "()V", "lifecycle-process_release"}, m3304k = 1, m3305mv = {1, 8, 0}, m3307xi = 48)
public final class ProcessLifecycleInitializer implements InterfaceC0388V8<InterfaceC0935y9> {
    @Override // p000a.InterfaceC0388V8
    /* JADX INFO: renamed from: a */
    public final List<Class<? extends InterfaceC0388V8<?>>> mo1019a() {
        return C0439Y5.f1645a;
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p000a.InterfaceC0388V8
    /* JADX INFO: renamed from: b */
    public final InterfaceC0935y9 mo1020b(Context context) {
        C0631i9.m1482e(context, "context");
        C1228a c1228aM3012c = C1228a.m3012c(context);
        C0631i9.m1481d(c1228aM3012c, "getInstance(context)");
        if (!c1228aM3012c.f5215b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!C1117f.f4678a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            C0631i9.m1480c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C1117f.a());
        }
        C1121j c1121j = C1121j.f4689i;
        c1121j.getClass();
        c1121j.f4694e = new Handler();
        c1121j.f4695f.m2598f(AbstractC1116e.a.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        C0631i9.m1480c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C1122k(c1121j));
        return c1121j;
    }
}

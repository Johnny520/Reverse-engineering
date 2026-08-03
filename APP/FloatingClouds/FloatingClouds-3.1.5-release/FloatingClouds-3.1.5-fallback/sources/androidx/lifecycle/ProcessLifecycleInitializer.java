package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "La/V8;", "La/y9;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements a.V8<a.InterfaceC0479y9> {
    public ProcessLifecycleInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // a.V8
    public final java.util.List<java.lang.Class<? extends a.V8<?>>> a() {
            r1 = this;
            a.Y5 r0 = a.Y5.f351a
            return r0
    }

    @Override // a.V8
    public final a.InterfaceC0479y9 b(android.content.Context r5) {
            r4 = this;
            java.lang.String r0 = "context"
            a.C0193i9.e(r5, r0)
            androidx.startup.a r0 = androidx.startup.a.c(r5)
            java.lang.String r1 = "getInstance(context)"
            a.C0193i9.d(r0, r1)
            java.util.HashSet r0 = r0.b
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r1 = androidx.lifecycle.ProcessLifecycleInitializer.class
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L5a
            java.util.concurrent.atomic.AtomicBoolean r0 = androidx.lifecycle.f.f933a
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Application"
            if (r0 == 0) goto L24
            goto L35
        L24:
            android.content.Context r0 = r5.getApplicationContext()
            a.C0193i9.c(r0, r1)
            android.app.Application r0 = (android.app.Application) r0
            androidx.lifecycle.f$a r2 = new androidx.lifecycle.f$a
            r2.<init>()
            r0.registerActivityLifecycleCallbacks(r2)
        L35:
            androidx.lifecycle.j r0 = androidx.lifecycle.j.i
            r0.getClass()
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            r0.e = r2
            androidx.lifecycle.h r2 = r0.f
            androidx.lifecycle.e$a r3 = androidx.lifecycle.e.a.ON_CREATE
            r2.f(r3)
            android.content.Context r5 = r5.getApplicationContext()
            a.C0193i9.c(r5, r1)
            android.app.Application r5 = (android.app.Application) r5
            androidx.lifecycle.k r1 = new androidx.lifecycle.k
            r1.<init>(r0)
            r5.registerActivityLifecycleCallbacks(r1)
            return r0
        L5a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml"
            r5.<init>(r0)
            throw r5
    }
}

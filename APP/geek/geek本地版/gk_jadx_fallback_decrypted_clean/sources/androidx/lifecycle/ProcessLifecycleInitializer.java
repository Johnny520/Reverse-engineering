package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements defpackage.ap {
    public ProcessLifecycleInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.ap
    public final java.util.List a() {
            r1 = this;
            yi r0 = defpackage.yi.a
            return r0
    }

    @Override // defpackage.ap
    public final java.lang.Object b(android.content.Context r5) {
            r4 = this;
            java.lang.String r0 = "context"
            defpackage.ip.o(r0, r5)
            r5 r0 = defpackage.r5.q(r5)
            java.lang.String r1 = "getInstance(context)"
            defpackage.ip.n(r1, r0)
            java.lang.Object r0 = r0.c
            java.util.HashSet r0 = (java.util.HashSet) r0
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r1 = androidx.lifecycle.ProcessLifecycleInitializer.class
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L5c
            java.util.concurrent.atomic.AtomicBoolean r0 = defpackage.lq.a
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Application"
            if (r0 == 0) goto L26
            goto L37
        L26:
            android.content.Context r0 = r5.getApplicationContext()
            defpackage.ip.m(r1, r0)
            android.app.Application r0 = (android.app.Application) r0
            kq r2 = new kq
            r2.<init>()
            r0.registerActivityLifecycleCallbacks(r2)
        L37:
            gy r0 = defpackage.gy.i
            r0.getClass()
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            r0.e = r2
            androidx.lifecycle.a r2 = r0.f
            iq r3 = defpackage.iq.ON_CREATE
            r2.d(r3)
            android.content.Context r5 = r5.getApplicationContext()
            defpackage.ip.m(r1, r5)
            android.app.Application r5 = (android.app.Application) r5
            fy r1 = new fy
            r1.<init>(r0)
            r5.registerActivityLifecycleCallbacks(r1)
            return r0
        L5c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml"
            r5.<init>(r0)
            throw r5
    }
}

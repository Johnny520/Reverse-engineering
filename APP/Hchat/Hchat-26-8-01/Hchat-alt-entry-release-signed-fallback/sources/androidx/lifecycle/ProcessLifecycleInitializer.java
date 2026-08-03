package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements x3.b {
    public ProcessLifecycleInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // x3.b
    public final java.util.List a() {
            r1 = this;
            tf.t r0 = tf.t.f13167g
            return r0
    }

    @Override // x3.b
    public final java.lang.Object b(android.content.Context r4) {
            r3 = this;
            r4.getClass()
            x3.a r0 = x3.a.c(r4)
            r0.getClass()
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r1 = androidx.lifecycle.ProcessLifecycleInitializer.class
            java.util.HashSet r0 = r0.f21179b
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L54
            java.util.concurrent.atomic.AtomicBoolean r0 = androidx.lifecycle.n.f295a
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto L1e
            goto L2f
        L1e:
            android.content.Context r0 = r4.getApplicationContext()
            r0.getClass()
            android.app.Application r0 = (android.app.Application) r0
            androidx.lifecycle.m r1 = new androidx.lifecycle.m
            r1.<init>()
            r0.registerActivityLifecycleCallbacks(r1)
        L2f:
            androidx.lifecycle.y r0 = androidx.lifecycle.y.f311o
            r0.getClass()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
            r0.f316k = r1
            androidx.lifecycle.s r1 = r0.f317l
            androidx.lifecycle.k r2 = androidx.lifecycle.k.ON_CREATE
            r1.d(r2)
            android.content.Context r4 = r4.getApplicationContext()
            r4.getClass()
            android.app.Application r4 = (android.app.Application) r4
            androidx.lifecycle.w r1 = new androidx.lifecycle.w
            r1.<init>(r0)
            r4.registerActivityLifecycleCallbacks(r1)
            return r0
        L54:
            java.lang.String r4 = "ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml"
            j8.o.A(r4)
            r4 = 0
            return r4
    }
}

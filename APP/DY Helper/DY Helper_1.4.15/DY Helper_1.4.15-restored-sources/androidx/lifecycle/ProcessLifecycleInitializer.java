package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements p000.xl0 {
    public ProcessLifecycleInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p000.xl0
    /* JADX INFO: renamed from: α */
    public final java.util.List mo461() {
            r0 = this;
            jz r0 = p000.C0450jz.f5672
            return r0
    }

    @Override // p000.xl0
    /* JADX INFO: renamed from: β */
    public final java.lang.Object mo462(android.content.Context r3) {
            r2 = this;
            r3.getClass()
            m6 r2 = p000.C0538m6.m3751(r3)
            r2.getClass()
            java.lang.Object r2 = r2.f6968
            java.util.HashSet r2 = (java.util.HashSet) r2
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L56
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.er0.f3649
            r0 = 1
            boolean r2 = r2.getAndSet(r0)
            if (r2 == 0) goto L20
            goto L31
        L20:
            android.content.Context r2 = r3.getApplicationContext()
            r2.getClass()
            android.app.Application r2 = (android.app.Application) r2
            dr0 r0 = new dr0
            r0.<init>()
            r2.registerActivityLifecycleCallbacks(r0)
        L31:
            wi1 r2 = p000.wi1.f11734
            r2.getClass()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r2.f11739 = r0
            jr0 r0 = r2.f11740
            br0 r1 = p000.br0.ON_CREATE
            r0.m2983(r1)
            android.content.Context r3 = r3.getApplicationContext()
            r3.getClass()
            android.app.Application r3 = (android.app.Application) r3
            vi1 r0 = new vi1
            r0.<init>(r2)
            r3.registerActivityLifecycleCallbacks(r0)
            return r2
        L56:
            java.lang.String r2 = "ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml"
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
    }
}

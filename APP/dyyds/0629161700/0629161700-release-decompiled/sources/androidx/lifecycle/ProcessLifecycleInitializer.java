package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements defpackage.InterfaceC0485 {
    public ProcessLifecycleInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC0485
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.util.List mo102() {
            r0 = this;
            ᲀᛶᲇ r0 = defpackage.C1698.f7558
            return r0
    }

    @Override // defpackage.InterfaceC0485
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo103(android.content.Context r3) {
            r2 = this;
            ᛷᛸᛱᛸ r2 = defpackage.C1326.m2464(r3)
            java.lang.Object r2 = r2.f5857
            java.util.HashSet r2 = (java.util.HashSet) r2
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L4a
            java.util.concurrent.atomic.AtomicBoolean r2 = defpackage.AbstractC1416.f6204
            r0 = 1
            boolean r2 = r2.getAndSet(r0)
            if (r2 == 0) goto L1a
            goto L28
        L1a:
            android.content.Context r2 = r3.getApplicationContext()
            android.app.Application r2 = (android.app.Application) r2
            ᲀᲀᲀᛳ r0 = new ᲀᲀᲀᛳ
            r0.<init>()
            r2.registerActivityLifecycleCallbacks(r0)
        L28:
            ᛴᲀᲁᛲ r2 = defpackage.C0755.f3536
            r2.getClass()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r2.f3543 = r0
            androidx.lifecycle.ᛷᲁᛳᛳ r0 = r2.f3537
            ᲈᛶᛱᛲ r1 = defpackage.EnumC2255.ON_CREATE
            r0.m108(r1)
            android.content.Context r3 = r3.getApplicationContext()
            android.app.Application r3 = (android.app.Application) r3
            ᛸᛱᛱ r0 = new ᛸᛱᛱ
            r0.<init>(r2)
            r3.registerActivityLifecycleCallbacks(r0)
            return r2
        L4a:
            java.lang.String r2 = "ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml"
            defpackage.C2264.m3676(r2)
            r2 = 0
            return r2
    }
}

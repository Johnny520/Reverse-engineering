package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements xhss.InterfaceC0546 {
    public ProcessLifecycleInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xhss.InterfaceC0546
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo19(android.content.Context r3) {
            r2 = this;
            xhss.ᛷᛱᛳᲁ r2 = xhss.C0623.m1087(r3)
            java.lang.Object r2 = r2.f2153
            java.util.HashSet r2 = (java.util.HashSet) r2
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L4a
            java.util.concurrent.atomic.AtomicBoolean r2 = xhss.AbstractC0008.f150
            r0 = 1
            boolean r2 = r2.getAndSet(r0)
            if (r2 == 0) goto L1a
            goto L28
        L1a:
            android.content.Context r2 = r3.getApplicationContext()
            android.app.Application r2 = (android.app.Application) r2
            xhss.ᛴᛳᛸᲇ r0 = new xhss.ᛴᛳᛸᲇ
            r0.<init>()
            r2.registerActivityLifecycleCallbacks(r0)
        L28:
            xhss.ᛷᛸᛴᛵ r2 = xhss.C0684.f2310
            r2.getClass()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r2.f2313 = r0
            androidx.lifecycle.ᛷᛵᛵᲈ r0 = r2.f2317
            xhss.ᲈᲀᛵᛸ r1 = xhss.EnumC1174.ON_CREATE
            r0.m28(r1)
            android.content.Context r3 = r3.getApplicationContext()
            android.app.Application r3 = (android.app.Application) r3
            xhss.ᛷᛸᛸᲀ r0 = new xhss.ᛷᛸᛸᲀ
            r0.<init>(r2)
            r3.registerActivityLifecycleCallbacks(r0)
            return r2
        L4a:
            java.lang.String r2 = "ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml"
            xhss.C0532.m950(r2)
            r2 = 0
            return r2
    }

    @Override // xhss.InterfaceC0546
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final java.util.List mo20() {
            r0 = this;
            xhss.ᛵᛷᛶᛱ r0 = xhss.C0492.f1802
            return r0
    }
}

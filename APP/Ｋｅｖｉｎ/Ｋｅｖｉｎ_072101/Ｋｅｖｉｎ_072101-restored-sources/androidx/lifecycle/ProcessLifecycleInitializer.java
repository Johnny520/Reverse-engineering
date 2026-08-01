package androidx.lifecycle;

/* JADX INFO: loaded from: classes2.dex */
public final class ProcessLifecycleInitializer implements androidx.startup.Initializer<androidx.lifecycle.LifecycleOwner> {
    public ProcessLifecycleInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    public androidx.lifecycle.LifecycleOwner create(android.content.Context r4) {
            r3 = this;
            androidx.startup.AppInitializer r0 = androidx.startup.AppInitializer.getInstance(r4)
            java.lang.Class r1 = r3.getClass()
            boolean r1 = r0.isEagerlyInitialized(r1)
            if (r1 == 0) goto L19
            androidx.lifecycle.LifecycleDispatcher.init(r4)
            androidx.lifecycle.ProcessLifecycleOwner.init(r4)
            androidx.lifecycle.LifecycleOwner r1 = androidx.lifecycle.ProcessLifecycleOwner.get()
            return r1
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml"
            r1.<init>(r2)
            throw r1
    }

    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ androidx.lifecycle.LifecycleOwner create(android.content.Context r1) {
            r0 = this;
            androidx.lifecycle.LifecycleOwner r1 = r0.create(r1)
            return r1
    }

    @Override // androidx.startup.Initializer
    public java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
            r1 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }
}

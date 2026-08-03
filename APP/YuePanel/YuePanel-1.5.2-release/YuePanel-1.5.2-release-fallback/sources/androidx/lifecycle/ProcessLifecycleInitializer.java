package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "LYue/ۥ۠ۥۢ۠;", "Landroidx/lifecycle/LifecycleOwner;", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)Landroidx/lifecycle/LifecycleOwner;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
public final class ProcessLifecycleInitializer implements Yue.InterfaceC3247<androidx.lifecycle.LifecycleOwner> {
    public ProcessLifecycleInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // Yue.InterfaceC3247
    @Yue.InterfaceC4418
    public androidx.lifecycle.LifecycleOwner create(@Yue.InterfaceC4418 android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "context"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥ۟ۡۥۢ r0 = Yue.C0532.m1881(r3)
            java.lang.String r1 = "getInstance(context)"
            Yue.C3329.m13905(r0, r1)
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r1 = androidx.lifecycle.ProcessLifecycleInitializer.class
            boolean r0 = r0.m1888(r1)
            if (r0 == 0) goto L23
            androidx.lifecycle.LifecycleDispatcher.init(r3)
            androidx.lifecycle.ProcessLifecycleOwner$Companion r0 = androidx.lifecycle.ProcessLifecycleOwner.Companion
            r0.init$lifecycle_process_release(r3)
            androidx.lifecycle.LifecycleOwner r3 = r0.get()
            return r3
        L23:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml"
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // Yue.InterfaceC3247
    public /* bridge */ /* synthetic */ androidx.lifecycle.LifecycleOwner create(android.content.Context r1) {
            r0 = this;
            androidx.lifecycle.LifecycleOwner r1 = r0.create(r1)
            return r1
    }

    @Override // Yue.InterfaceC3247
    @Yue.InterfaceC4418
    public java.util.List<java.lang.Class<? extends Yue.InterfaceC3247<?>>> dependencies() {
            r1 = this;
            java.util.List r0 = Yue.C1208.m6210()
            return r0
    }
}

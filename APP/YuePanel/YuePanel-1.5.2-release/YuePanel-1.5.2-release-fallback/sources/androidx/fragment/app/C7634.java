package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7634 implements androidx.lifecycle.HasDefaultViewModelProviderFactory, Yue.InterfaceC5504, androidx.lifecycle.ViewModelStoreOwner {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final androidx.fragment.app.Fragment f29422;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final androidx.lifecycle.ViewModelStore f29423;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final java.lang.Runnable f29424;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public androidx.lifecycle.ViewModelProvider.Factory f29425;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public androidx.lifecycle.LifecycleRegistry f29426;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public Yue.C5502 f29427;

    public C7634(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r2, @Yue.InterfaceC4410 androidx.lifecycle.ViewModelStore r3, @Yue.InterfaceC4410 java.lang.Runnable r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f29426 = r0
            r1.f29427 = r0
            r1.f29422 = r2
            r1.f29423 = r3
            r1.f29424 = r4
            return
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @Yue.InterfaceC4410
    @Yue.InterfaceC0907
    public androidx.lifecycle.viewmodel.CreationExtras getDefaultViewModelCreationExtras() {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.f29422
            android.content.Context r0 = r0.requireContext()
            android.content.Context r0 = r0.getApplicationContext()
        La:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L1c
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto L15
            android.app.Application r0 = (android.app.Application) r0
            goto L1d
        L15:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto La
        L1c:
            r0 = 0
        L1d:
            androidx.lifecycle.viewmodel.MutableCreationExtras r1 = new androidx.lifecycle.viewmodel.MutableCreationExtras
            r1.<init>()
            if (r0 == 0) goto L29
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.app.Application> r2 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY
            r1.set(r2, r0)
        L29:
            androidx.lifecycle.viewmodel.CreationExtras$Key<Yue.ۥۡۧۤۢ> r0 = androidx.lifecycle.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY
            androidx.fragment.app.Fragment r2 = r3.f29422
            r1.set(r0, r2)
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.lifecycle.ViewModelStoreOwner> r0 = androidx.lifecycle.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY
            r1.set(r0, r3)
            androidx.fragment.app.Fragment r0 = r3.f29422
            android.os.Bundle r0 = r0.getArguments()
            if (r0 == 0) goto L48
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.os.Bundle> r0 = androidx.lifecycle.SavedStateHandleSupport.DEFAULT_ARGS_KEY
            androidx.fragment.app.Fragment r2 = r3.f29422
            android.os.Bundle r2 = r2.getArguments()
            r1.set(r0, r2)
        L48:
            return r1
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @Yue.InterfaceC4410
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
            r4 = this;
            androidx.fragment.app.Fragment r0 = r4.f29422
            androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
            androidx.fragment.app.Fragment r1 = r4.f29422
            androidx.lifecycle.ViewModelProvider$Factory r1 = r1.mDefaultFactory
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L13
            r4.f29425 = r0
            return r0
        L13:
            androidx.lifecycle.ViewModelProvider$Factory r0 = r4.f29425
            if (r0 != 0) goto L41
            androidx.fragment.app.Fragment r0 = r4.f29422
            android.content.Context r0 = r0.requireContext()
            android.content.Context r0 = r0.getApplicationContext()
        L21:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L33
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto L2c
            android.app.Application r0 = (android.app.Application) r0
            goto L34
        L2c:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L21
        L33:
            r0 = 0
        L34:
            androidx.lifecycle.SavedStateViewModelFactory r1 = new androidx.lifecycle.SavedStateViewModelFactory
            androidx.fragment.app.Fragment r2 = r4.f29422
            android.os.Bundle r3 = r2.getArguments()
            r1.<init>(r0, r2, r3)
            r4.f29425 = r1
        L41:
            androidx.lifecycle.ViewModelProvider$Factory r0 = r4.f29425
            return r0
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @Yue.InterfaceC4410
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            r1.m29462()
            androidx.lifecycle.LifecycleRegistry r0 = r1.f29426
            return r0
    }

    @Override // Yue.InterfaceC5504
    @Yue.InterfaceC4410
    public androidx.savedstate.C7816 getSavedStateRegistry() {
            r1 = this;
            r1.m29462()
            Yue.ۥۡۧۤۡ r0 = r1.f29427
            androidx.savedstate.ۥ r0 = r0.m20696()
            return r0
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @Yue.InterfaceC4410
    public androidx.lifecycle.ViewModelStore getViewModelStore() {
            r1 = this;
            r1.m29462()
            androidx.lifecycle.ViewModelStore r0 = r1.f29423
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m29461(@Yue.InterfaceC4410 androidx.lifecycle.Lifecycle.Event r2) {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.f29426
            r0.handleLifecycleEvent(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m29462() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.f29426
            if (r0 != 0) goto L19
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1.f29426 = r0
            Yue.ۥۡۧۤۡ r0 = Yue.C5502.m20695(r1)
            r1.f29427 = r0
            r0.m20697()
            java.lang.Runnable r0 = r1.f29424
            r0.run()
        L19:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m29463() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.f29426
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m29464(@Yue.InterfaceC4544 android.os.Bundle r2) {
            r1 = this;
            Yue.ۥۡۧۤۡ r0 = r1.f29427
            r0.m20698(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m29465(@Yue.InterfaceC4410 android.os.Bundle r2) {
            r1 = this;
            Yue.ۥۡۧۤۡ r0 = r1.f29427
            r0.m20699(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m29466(@Yue.InterfaceC4410 androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.f29426
            r0.setCurrentState(r2)
            return
    }
}

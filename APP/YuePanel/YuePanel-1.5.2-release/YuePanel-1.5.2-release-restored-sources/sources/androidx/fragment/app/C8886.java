package androidx.fragment.app;

import Yue.C7234;
import Yue.InterfaceC3647;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7235;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.HasDefaultViewModelProviderFactory;
import android.view.Lifecycle;
import android.view.LifecycleRegistry;
import android.view.SavedStateHandleSupport;
import android.view.SavedStateViewModelFactory;
import android.view.ViewModelProvider;
import android.view.ViewModelStore;
import android.view.ViewModelStoreOwner;
import android.view.viewmodel.CreationExtras;
import android.view.viewmodel.MutableCreationExtras;
import androidx.savedstate.C1794;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8886 implements HasDefaultViewModelProviderFactory, InterfaceC7235, ViewModelStoreOwner {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Fragment f29816;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final ViewModelStore f29817;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final Runnable f29818;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public ViewModelProvider.Factory f29819;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public LifecycleRegistry f29820 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public C7234 f29821 = null;

    public C8886(@InterfaceC6391 Fragment fragment, @InterfaceC6391 ViewModelStore viewModelStore, @InterfaceC6391 Runnable runnable) {
        this.f29816 = fragment;
        this.f29817 = viewModelStore;
        this.f29818 = runnable;
    }

    @Override // android.view.HasDefaultViewModelProviderFactory
    @InterfaceC6391
    @InterfaceC3647
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f29816.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (application != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application);
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this.f29816);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (this.f29816.getArguments() != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, this.f29816.getArguments());
        }
        return mutableCreationExtras;
    }

    @Override // android.view.HasDefaultViewModelProviderFactory
    @InterfaceC6391
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Application application;
        ViewModelProvider.Factory defaultViewModelProviderFactory = this.f29816.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f29816.mDefaultFactory)) {
            this.f29819 = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f29819 == null) {
            Context applicationContext = this.f29816.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            Fragment fragment = this.f29816;
            this.f29819 = new SavedStateViewModelFactory(application, fragment, fragment.getArguments());
        }
        return this.f29819;
    }

    @Override // android.view.LifecycleOwner
    @InterfaceC6391
    public Lifecycle getLifecycle() {
        m4856();
        return this.f29820;
    }

    @Override // Yue.InterfaceC7235
    @InterfaceC6391
    public C1794 getSavedStateRegistry() {
        m4856();
        return this.f29821.m3518();
    }

    @Override // android.view.ViewModelStoreOwner
    @InterfaceC6391
    public ViewModelStore getViewModelStore() {
        m4856();
        return this.f29817;
    }

    /* JADX INFO: renamed from: ۥ */
    public void m4855(@InterfaceC6391 Lifecycle.Event event) {
        this.f29820.handleLifecycleEvent(event);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m4856() {
        if (this.f29820 == null) {
            this.f29820 = new LifecycleRegistry(this);
            C7234 c7234M3517 = C7234.m3517(this);
            this.f29821 = c7234M3517;
            c7234M3517.m22640();
            this.f29818.run();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m30069() {
        return this.f29820 != null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m30070(@InterfaceC6490 Bundle bundle) {
        this.f29821.m22641(bundle);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m30071(@InterfaceC6391 Bundle bundle) {
        this.f29821.m22642(bundle);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m30072(@InterfaceC6391 Lifecycle.State state) {
        this.f29820.setCurrentState(state);
    }
}

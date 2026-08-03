package androidx.activity;

import Yue.AbstractC3115;
import Yue.AbstractC3138;
import Yue.C3090;
import Yue.C3105;
import Yue.C3116;
import Yue.C4185;
import Yue.C5118;
import Yue.C5488;
import Yue.C6154;
import Yue.C6292;
import Yue.C6664;
import Yue.C7234;
import Yue.C7947;
import Yue.C8107;
import Yue.C8363;
import Yue.C8364;
import Yue.C8365;
import Yue.InterfaceC3113;
import Yue.InterfaceC3114;
import Yue.InterfaceC3139;
import Yue.InterfaceC3647;
import Yue.InterfaceC4144;
import Yue.InterfaceC4183;
import Yue.InterfaceC4184;
import Yue.InterfaceC4482;
import Yue.InterfaceC5120;
import Yue.InterfaceC5122;
import Yue.InterfaceC5683;
import Yue.InterfaceC5922;
import Yue.InterfaceC6151;
import Yue.InterfaceC6165;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6549;
import Yue.InterfaceC6550;
import Yue.InterfaceC6551;
import Yue.InterfaceC6554;
import Yue.InterfaceC6555;
import Yue.InterfaceC6556;
import Yue.InterfaceC6559;
import Yue.InterfaceC7113;
import Yue.InterfaceC7235;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.C9041ViewTreeViewModelStoreOwner;
import android.view.HasDefaultViewModelProviderFactory;
import android.view.Lifecycle;
import android.view.LifecycleEventObserver;
import android.view.LifecycleOwner;
import android.view.LifecycleRegistry;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ReportFragment;
import android.view.SavedStateHandleSupport;
import android.view.SavedStateViewModelFactory;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewModelProvider;
import android.view.ViewModelStore;
import android.view.ViewModelStoreOwner;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.viewmodel.CreationExtras;
import android.view.viewmodel.MutableCreationExtras;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.savedstate.C1794;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements InterfaceC4184, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, InterfaceC7235, InterfaceC6549, InterfaceC3139, InterfaceC3114, InterfaceC6550, InterfaceC6559, InterfaceC6555, InterfaceC6554, InterfaceC6556, InterfaceC6151, InterfaceC5120 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;

    @InterfaceC5683
    private int mContentLayoutId;
    final C4185 mContextAwareHelper;
    private ViewModelProvider.Factory mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;

    @InterfaceC6391
    final C5118 mFullyDrawnReporter;
    private final LifecycleRegistry mLifecycleRegistry;
    private final C6154 mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<InterfaceC4144<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC4144<C6292>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC4144<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC4144<C6664>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC4144<Integer>> mOnTrimMemoryListeners;
    final InterfaceExecutorC8616 mReportFullyDrawnExecutor;
    final C7234 mSavedStateRegistryController;
    private ViewModelStore mViewModelStore;

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$ۥ */
    public class C1569 extends ActivityResultRegistry {

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$ۥ$ۥ, reason: contains not printable characters */
        public class RunnableC8611 implements Runnable {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ int f25560;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC3115.C0055 f25561;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public RunnableC8611(int i, AbstractC3115.C0055 c0055) {
                this.f25560 = i;
                this.f25561 = c0055;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1569.this.m28651(this.f25560, this.f25561.m218());
            }
        }

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$ۥ$ۥ۟, reason: contains not printable characters */
        public class RunnableC8612 implements Runnable {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ int f25563;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ IntentSender.SendIntentException f25564;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public RunnableC8612(int i, IntentSender.SendIntentException sendIntentException) {
                this.f25563 = i;
                this.f25564 = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1569.this.m4587(this.f25563, 0, new Intent().setAction(C3116.C3132.f96).putExtra(C3116.C3132.f4645, this.f25564));
            }
        }

        public C1569() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public <I, O> void mo28624(int i, @InterfaceC6391 AbstractC3115<I, O> abstractC3115, I i2, @InterfaceC6490 C3105 c3105) {
            Bundle bundleMo6339;
            ComponentActivity componentActivity = ComponentActivity.this;
            AbstractC3115.C0055<O> c0055Mo217 = abstractC3115.mo217(componentActivity, i2);
            if (c0055Mo217 != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC8611(i, c0055Mo217));
                return;
            }
            Intent intentMo216 = abstractC3115.mo216(componentActivity, i2);
            if (intentMo216.getExtras() != null && intentMo216.getExtras().getClassLoader() == null) {
                intentMo216.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentMo216.hasExtra(C3116.C3131.f94)) {
                Bundle bundleExtra = intentMo216.getBundleExtra(C3116.C3131.f94);
                intentMo216.removeExtra(C3116.C3131.f94);
                bundleMo6339 = bundleExtra;
            } else {
                bundleMo6339 = c3105 != null ? c3105.mo6339() : null;
            }
            if (C3116.C3129.f92.equals(intentMo216.getAction())) {
                String[] stringArrayExtra = intentMo216.getStringArrayExtra(C3116.C3129.f4642);
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C3090.m6311(componentActivity, stringArrayExtra, i);
                return;
            }
            if (!C3116.C3132.f96.equals(intentMo216.getAction())) {
                C3090.m6318(componentActivity, intentMo216, i, bundleMo6339);
                return;
            }
            C5488 c5488 = (C5488) intentMo216.getParcelableExtra(C3116.C3132.f4644);
            try {
                C3090.m6319(componentActivity, c5488.m17075(), i, c5488.m2240(), c5488.m2241(), c5488.m17074(), 0, bundleMo6339);
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new RunnableC8612(i, e));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$ۥ۟ */
    public class RunnableC1570 implements Runnable {
        public RunnableC1570() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            } catch (NullPointerException e2) {
                if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(19)
    public static class C8613 {
        /* JADX INFO: renamed from: ۥ */
        public static void m4575(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(33)
    public static class C8614 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static OnBackInvokedDispatcher m4576(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C8615 {

        /* JADX INFO: renamed from: ۥ */
        public Object f3586;

        /* JADX INFO: renamed from: ۥ۟ */
        public ViewModelStore f3587;
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$ۥ۟۟۟۠, reason: contains not printable characters */
    public interface InterfaceExecutorC8616 extends Executor {
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        void mo28625();

        /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
        void mo28626(@InterfaceC6391 View view);
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7113(16)
    public class ViewTreeObserverOnDrawListenerC8617 implements InterfaceExecutorC8616, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Runnable f25568;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final long f25567 = SystemClock.uptimeMillis() + 10000;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f25569 = false;

        public ViewTreeObserverOnDrawListenerC8617() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f25568 = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.f25569) {
                decorView.postOnAnimation(new Runnable() { // from class: Yue.ۥ۟ۦۣۤ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8125.m4578();
                    }
                });
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f25568;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f25567) {
                    this.f25569 = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f25568 = null;
            if (ComponentActivity.this.mFullyDrawnReporter.m15794()) {
                this.f25569 = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ void m4578() {
            Runnable runnable = this.f25568;
            if (runnable != null) {
                runnable.run();
                this.f25568 = null;
            }
        }

        @Override // androidx.activity.ComponentActivity.InterfaceExecutorC8616
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public void mo28625() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.ComponentActivity.InterfaceExecutorC8616
        /* JADX INFO: renamed from: ۥ۟۟ۤۦ */
        public void mo28626(@InterfaceC6391 View view) {
            if (this.f25569) {
                return;
            }
            this.f25569 = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static class C8618 implements InterfaceExecutorC8616 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final Handler f25571 = m4579();

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f25571.postAtFrontOfQueue(runnable);
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public final Handler m4579() {
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            return new Handler(looperMyLooper);
        }

        @Override // androidx.activity.ComponentActivity.InterfaceExecutorC8616
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public void mo28625() {
        }

        @Override // androidx.activity.ComponentActivity.InterfaceExecutorC8616
        /* JADX INFO: renamed from: ۥ۟۟ۤۦ */
        public void mo28626(@InterfaceC6391 View view) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ComponentActivity() {
        this.mContextAwareHelper = new C4185();
        this.mMenuHostHelper = new C6154(new Runnable() { // from class: Yue.ۥ۟ۦۤ۟
            @Override // java.lang.Runnable
            public final void run() {
                this.f8123.invalidateMenu();
            }
        });
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        C7234 c7234M3517 = C7234.m3517(this);
        this.mSavedStateRegistryController = c7234M3517;
        this.mOnBackPressedDispatcher = null;
        InterfaceExecutorC8616 interfaceExecutorC8616M28620 = m28620();
        this.mReportFullyDrawnExecutor = interfaceExecutorC8616M28620;
        this.mFullyDrawnReporter = new C5118(interfaceExecutorC8616M28620, new InterfaceC5122() { // from class: Yue.ۥ۟ۦۤ۠
            @Override // Yue.InterfaceC5122
            public final Object invoke() {
                return this.f8124.m28621();
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new C1569();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.2
            @Override // android.view.LifecycleEventObserver
            public void onStateChanged(@InterfaceC6391 LifecycleOwner lifecycleOwner, @InterfaceC6391 Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        C8613.m4575(viewPeekDecorView);
                    }
                }
            }
        });
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.3
            @Override // android.view.LifecycleEventObserver
            public void onStateChanged(@InterfaceC6391 LifecycleOwner lifecycleOwner, @InterfaceC6391 Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ComponentActivity.this.mContextAwareHelper.m1140();
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.getViewModelStore().clear();
                    }
                    ComponentActivity.this.mReportFullyDrawnExecutor.mo28625();
                }
            }
        });
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.4
            @Override // android.view.LifecycleEventObserver
            public void onStateChanged(@InterfaceC6391 LifecycleOwner lifecycleOwner, @InterfaceC6391 Lifecycle.Event event) {
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().removeObserver(this);
            }
        });
        c7234M3517.m22640();
        SavedStateHandleSupport.enableSavedStateHandles(this);
        getSavedStateRegistry().m30806(ACTIVITY_RESULT_TAG, new C1794.InterfaceC9000() { // from class: Yue.ۥ۟ۦۤۡ
            @Override // androidx.savedstate.C1794.InterfaceC9000
            public final Bundle saveState() {
                return this.f642.m28622();
            }
        });
        addOnContextAvailableListener(new InterfaceC6551() { // from class: Yue.ۥ۟ۦۤۢ
            @Override // Yue.InterfaceC6551
            /* JADX INFO: renamed from: ۥ */
            public final void mo1013(Context context) {
                this.f643.m28623(context);
            }
        });
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo28626(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC6151
    public void addMenuProvider(@InterfaceC6391 InterfaceC6165 interfaceC6165) {
        this.mMenuHostHelper.m18957(interfaceC6165);
    }

    @Override // Yue.InterfaceC6550
    public final void addOnConfigurationChangedListener(@InterfaceC6391 InterfaceC4144<Configuration> interfaceC4144) {
        this.mOnConfigurationChangedListeners.add(interfaceC4144);
    }

    @Override // Yue.InterfaceC4184
    public final void addOnContextAvailableListener(@InterfaceC6391 InterfaceC6551 interfaceC6551) {
        this.mContextAwareHelper.m1139(interfaceC6551);
    }

    @Override // Yue.InterfaceC6554
    public final void addOnMultiWindowModeChangedListener(@InterfaceC6391 InterfaceC4144<C6292> interfaceC4144) {
        this.mOnMultiWindowModeChangedListeners.add(interfaceC4144);
    }

    @Override // Yue.InterfaceC6555
    public final void addOnNewIntentListener(@InterfaceC6391 InterfaceC4144<Intent> interfaceC4144) {
        this.mOnNewIntentListeners.add(interfaceC4144);
    }

    @Override // Yue.InterfaceC6556
    public final void addOnPictureInPictureModeChangedListener(@InterfaceC6391 InterfaceC4144<C6664> interfaceC4144) {
        this.mOnPictureInPictureModeChangedListeners.add(interfaceC4144);
    }

    @Override // Yue.InterfaceC6559
    public final void addOnTrimMemoryListener(@InterfaceC6391 InterfaceC4144<Integer> interfaceC4144) {
        this.mOnTrimMemoryListeners.add(interfaceC4144);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C8615 c8615 = (C8615) getLastNonConfigurationInstance();
            if (c8615 != null) {
                this.mViewModelStore = c8615.f3587;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new ViewModelStore();
            }
        }
    }

    @Override // Yue.InterfaceC3139
    @InterfaceC6391
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // android.view.HasDefaultViewModelProviderFactory
    @InterfaceC6391
    @InterfaceC3647
    public CreationExtras getDefaultViewModelCreationExtras() {
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (getApplication() != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, getApplication());
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, getIntent().getExtras());
        }
        return mutableCreationExtras;
    }

    @Override // android.view.HasDefaultViewModelProviderFactory
    @InterfaceC6391
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new SavedStateViewModelFactory(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Override // Yue.InterfaceC5120
    @InterfaceC6391
    public C5118 getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @InterfaceC6490
    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        C8615 c8615 = (C8615) getLastNonConfigurationInstance();
        if (c8615 != null) {
            return c8615.f3586;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, android.view.LifecycleOwner
    @InterfaceC6391
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // Yue.InterfaceC6549
    @InterfaceC6391
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new RunnableC1570());
            getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.6
                @Override // android.view.LifecycleEventObserver
                public void onStateChanged(@InterfaceC6391 LifecycleOwner lifecycleOwner, @InterfaceC6391 Lifecycle.Event event) {
                    if (event != Lifecycle.Event.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                        return;
                    }
                    ComponentActivity.this.mOnBackPressedDispatcher.m28643(C8614.m4576((ComponentActivity) lifecycleOwner));
                }
            });
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // Yue.InterfaceC7235
    @InterfaceC6391
    public final C1794 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m3518();
    }

    @Override // android.view.ViewModelStoreOwner
    @InterfaceC6391
    public ViewModelStore getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    @InterfaceC3647
    public void initializeViewTreeOwners() {
        android.view.View.set(getWindow().getDecorView(), this);
        C9041ViewTreeViewModelStoreOwner.set(getWindow().getDecorView(), this);
        C8365.m4339(getWindow().getDecorView(), this);
        C8364.m4337(getWindow().getDecorView(), this);
        C8363.m4335(getWindow().getDecorView(), this);
    }

    @Override // Yue.InterfaceC6151
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @InterfaceC3647
    @Deprecated
    public void onActivityResult(int i, int i2, @InterfaceC6490 Intent intent) {
        if (this.mActivityResultRegistry.m4587(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @InterfaceC3647
    @InterfaceC5922
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().m28640();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @InterfaceC3647
    public void onConfigurationChanged(@InterfaceC6391 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC4144<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@InterfaceC6490 Bundle bundle) {
        this.mSavedStateRegistryController.m22641(bundle);
        this.mContextAwareHelper.m12052(this);
        super.onCreate(bundle);
        ReportFragment.injectIfNeededIn(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, @InterfaceC6391 Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        this.mMenuHostHelper.m18962(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @InterfaceC6391 MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mMenuHostHelper.m18964(menuItem);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @InterfaceC3647
    public void onMultiWindowModeChanged(boolean z) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC4144<C6292>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C6292(z));
        }
    }

    @Override // android.app.Activity
    @InterfaceC3647
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<InterfaceC4144<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, @InterfaceC6391 Menu menu) {
        this.mMenuHostHelper.m18963(menu);
        super.onPanelClosed(i, menu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @InterfaceC3647
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC4144<C6664>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C6664(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, @InterfaceC6490 View view, @InterfaceC6391 Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.mMenuHostHelper.m18965(menu);
        return true;
    }

    @Override // android.app.Activity
    @InterfaceC3647
    @Deprecated
    public void onRequestPermissionsResult(int i, @InterfaceC6391 String[] strArr, @InterfaceC6391 int[] iArr) {
        if (this.mActivityResultRegistry.m4587(i, -1, new Intent().putExtra(C3116.C3129.f4642, strArr).putExtra(C3116.C3129.f4643, iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @InterfaceC6490
    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @InterfaceC6490
    public final Object onRetainNonConfigurationInstance() {
        C8615 c8615;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this.mViewModelStore;
        if (viewModelStore == null && (c8615 = (C8615) getLastNonConfigurationInstance()) != null) {
            viewModelStore = c8615.f3587;
        }
        if (viewModelStore == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C8615 c86152 = new C8615();
        c86152.f3586 = objOnRetainCustomNonConfigurationInstance;
        c86152.f3587 = viewModelStore;
        return c86152;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @InterfaceC3647
    public void onSaveInstanceState(@InterfaceC6391 Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof LifecycleRegistry) {
            ((LifecycleRegistry) lifecycle).setCurrentState(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m22642(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @InterfaceC3647
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<InterfaceC4144<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // Yue.InterfaceC4184
    @InterfaceC6490
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.m12053();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC3114
    @InterfaceC6391
    public final <I, O> AbstractC3138<I> registerForActivityResult(@InterfaceC6391 AbstractC3115<I, O> abstractC3115, @InterfaceC6391 ActivityResultRegistry activityResultRegistry, @InterfaceC6391 InterfaceC3113<O> interfaceC3113) {
        return activityResultRegistry.m28657("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, abstractC3115, interfaceC3113);
    }

    @Override // Yue.InterfaceC6151
    public void removeMenuProvider(@InterfaceC6391 InterfaceC6165 interfaceC6165) {
        this.mMenuHostHelper.m18966(interfaceC6165);
    }

    @Override // Yue.InterfaceC6550
    public final void removeOnConfigurationChangedListener(@InterfaceC6391 InterfaceC4144<Configuration> interfaceC4144) {
        this.mOnConfigurationChangedListeners.remove(interfaceC4144);
    }

    @Override // Yue.InterfaceC4184
    public final void removeOnContextAvailableListener(@InterfaceC6391 InterfaceC6551 interfaceC6551) {
        this.mContextAwareHelper.m12054(interfaceC6551);
    }

    @Override // Yue.InterfaceC6554
    public final void removeOnMultiWindowModeChangedListener(@InterfaceC6391 InterfaceC4144<C6292> interfaceC4144) {
        this.mOnMultiWindowModeChangedListeners.remove(interfaceC4144);
    }

    @Override // Yue.InterfaceC6555
    public final void removeOnNewIntentListener(@InterfaceC6391 InterfaceC4144<Intent> interfaceC4144) {
        this.mOnNewIntentListeners.remove(interfaceC4144);
    }

    @Override // Yue.InterfaceC6556
    public final void removeOnPictureInPictureModeChangedListener(@InterfaceC6391 InterfaceC4144<C6664> interfaceC4144) {
        this.mOnPictureInPictureModeChangedListeners.remove(interfaceC4144);
    }

    @Override // Yue.InterfaceC6559
    public final void removeOnTrimMemoryListener(@InterfaceC6391 InterfaceC4144<Integer> interfaceC4144) {
        this.mOnTrimMemoryListeners.remove(interfaceC4144);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C7947.m25080()) {
                C7947.m25075("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.m15793();
            C7947.m25078();
        } catch (Throwable th) {
            C7947.m25078();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void setContentView(@InterfaceC5683 int i) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo28626(getWindow().getDecorView());
        super.setContentView(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@InterfaceC6391 Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@InterfaceC6391 IntentSender intentSender, int i, @InterfaceC6490 Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final InterfaceExecutorC8616 m28620() {
        return new ViewTreeObserverOnDrawListenerC8617();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final /* synthetic */ C8107 m28621() {
        reportFullyDrawn();
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final /* synthetic */ Bundle m28622() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.m28655(bundle);
        return bundle;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final /* synthetic */ void m28623(Context context) {
        Bundle bundleM5022 = getSavedStateRegistry().m5022(ACTIVITY_RESULT_TAG);
        if (bundleM5022 != null) {
            this.mActivityResultRegistry.m28654(bundleM5022);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC6151
    public void addMenuProvider(@InterfaceC6391 InterfaceC6165 interfaceC6165, @InterfaceC6391 LifecycleOwner lifecycleOwner) {
        this.mMenuHostHelper.m18958(interfaceC6165, lifecycleOwner);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@InterfaceC6391 Intent intent, int i, @InterfaceC6490 Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@InterfaceC6391 IntentSender intentSender, int i, @InterfaceC6490 Intent intent, int i2, int i3, int i4, @InterfaceC6490 Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // Yue.InterfaceC6151
    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@InterfaceC6391 InterfaceC6165 interfaceC6165, @InterfaceC6391 LifecycleOwner lifecycleOwner, @InterfaceC6391 Lifecycle.State state) {
        this.mMenuHostHelper.m18959(interfaceC6165, lifecycleOwner, state);
    }

    @Override // android.app.Activity
    @InterfaceC3647
    @InterfaceC7113(api = 26)
    public void onMultiWindowModeChanged(boolean z, @InterfaceC6391 Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC4144<C6292>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C6292(z, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    @InterfaceC3647
    @InterfaceC7113(api = 26)
    public void onPictureInPictureModeChanged(boolean z, @InterfaceC6391 Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC4144<C6664>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C6664(z, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // Yue.InterfaceC3114
    @InterfaceC6391
    public final <I, O> AbstractC3138<I> registerForActivityResult(@InterfaceC6391 AbstractC3115<I, O> abstractC3115, @InterfaceC6391 InterfaceC3113<O> interfaceC3113) {
        return registerForActivityResult(abstractC3115, this.mActivityResultRegistry, interfaceC3113);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo28626(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo28626(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @InterfaceC4183
    public ComponentActivity(@InterfaceC5683 int i) {
        this();
        this.mContentLayoutId = i;
    }
}

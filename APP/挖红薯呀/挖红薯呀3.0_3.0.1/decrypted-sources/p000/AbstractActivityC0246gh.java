package p000;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.luckypray.dexkit.C0587R;
import top.anjao2024.xp1whs.MainActivity;

/* JADX INFO: renamed from: gh */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0246gh extends AbstractActivityC0209fh implements wc1, InterfaceC0411ky, nx0 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final C1003zg Companion = new C1003zg();
    private vc1 _viewModelStore;
    private final AbstractC0787u1 activityResultRegistry;
    private int contentLayoutId;
    private final C0249gk contextAwareHelper = new C0249gk();
    private final u60 defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final u60 fullyDrawnReporter$delegate;
    private boolean hasPictureInPictureSystemFeature;
    private final de0 menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final u60 onBackPressedDispatcher$delegate;
    private final u60 onBackPressedInput$delegate;
    private final CopyOnWriteArrayList<InterfaceC0766tj> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0766tj> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0766tj> onNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC0766tj> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0766tj> onPictureInPictureUiStateChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0766tj> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final InterfaceExecutorC0092ch reportFullyDrawnExecutor;
    private final lx0 savedStateRegistryController;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractActivityC0246gh() {
        final MainActivity mainActivity = (MainActivity) this;
        final int i = 1;
        this.menuHostHelper = new de0(new RunnableC0802ug(mainActivity, 1));
        mx0 mx0Var = new mx0(this, new C0381k6(9, this));
        this.savedStateRegistryController = new lx0(mx0Var);
        this.reportFullyDrawnExecutor = new ViewTreeObserverOnDrawListenerC0129dh(mainActivity);
        this.fullyDrawnReporter$delegate = new x51(new C0763tg(mainActivity, 2));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new C0172eh();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureUiStateChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        int i2 = 3;
        this.onBackPressedInput$delegate = new x51(new C0763tg(mainActivity, 3));
        if (getLifecycle() == null) {
            C0921xc.m5134o("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final int i3 = 0;
        getLifecycle().mo4014a(new v90() { // from class: wg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.v90
            /* JADX INFO: renamed from: e */
            public final void mo350e(x90 x90Var, q90 q90Var) {
                Window window;
                View viewPeekDecorView;
                int i4 = i3;
                MainActivity mainActivity2 = mainActivity;
                switch (i4) {
                    case 0:
                        if (q90Var == q90.ON_STOP && (window = mainActivity2.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0246gh.m1243c(mainActivity2, x90Var, q90Var);
                        break;
                }
            }
        });
        getLifecycle().mo4014a(new v90() { // from class: wg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.v90
            /* JADX INFO: renamed from: e */
            public final void mo350e(x90 x90Var, q90 q90Var) {
                Window window;
                View viewPeekDecorView;
                int i4 = i;
                MainActivity mainActivity2 = mainActivity;
                switch (i4) {
                    case 0:
                        if (q90Var == q90.ON_STOP && (window = mainActivity2.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0246gh.m1243c(mainActivity2, x90Var, q90Var);
                        break;
                }
            }
        });
        getLifecycle().mo4014a(new rt0(i, mainActivity));
        mx0Var.m2606a();
        r90 r90Var = ((z90) getLifecycle()).f7841c;
        if (r90Var != r90.f5333e && r90Var != r90.f5334f) {
            C0921xc.m5131l("Failed requirement.");
            throw null;
        }
        if (getSavedStateRegistry().m1961b() == null) {
            gx0 gx0Var = new gx0(getSavedStateRegistry(), mainActivity);
            getSavedStateRegistry().m1962c("androidx.lifecycle.internal.SavedStateHandlesProvider", gx0Var);
            getLifecycle().mo4014a(new rt0(i2, gx0Var));
        }
        getSavedStateRegistry().m1962c(ACTIVITY_RESULT_TAG, new C0925xg(i3, mainActivity));
        addOnContextAvailableListener(new C0962yg(mainActivity));
        this.defaultViewModelProviderFactory$delegate = new x51(new C0763tg(mainActivity, 4));
        this.onBackPressedDispatcher$delegate = new x51(new C0763tg(mainActivity, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Bundle m1241a(MainActivity mainActivity) {
        Bundle bundle = new Bundle();
        AbstractC0787u1 abstractC0787u1 = ((AbstractActivityC0246gh) mainActivity).activityResultRegistry;
        abstractC0787u1.getClass();
        LinkedHashMap linkedHashMap = abstractC0787u1.f6098b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC0787u1.f6099c));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(abstractC0787u1.f6102f));
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void access$ensureViewModelStore(AbstractActivityC0246gh abstractActivityC0246gh) {
        if (abstractActivityC0246gh._viewModelStore == null) {
            C0055bh c0055bh = (C0055bh) abstractActivityC0246gh.getLastNonConfigurationInstance();
            if (c0055bh != null) {
                abstractActivityC0246gh._viewModelStore = c0055bh.f512b;
            }
            if (abstractActivityC0246gh._viewModelStore == null) {
                abstractActivityC0246gh._viewModelStore = new vc1();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C0261gw m1242b(MainActivity mainActivity) {
        return new C0261gw(((AbstractActivityC0246gh) mainActivity).reportFullyDrawnExecutor, new C0763tg(mainActivity, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m1243c(MainActivity mainActivity, x90 x90Var, q90 q90Var) {
        if (q90Var == q90.ON_DESTROY) {
            ((AbstractActivityC0246gh) mainActivity).contextAwareHelper.f2006b = null;
            if (!mainActivity.isChangingConfigurations()) {
                LinkedHashMap linkedHashMap = mainActivity.getViewModelStore().f6661a;
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    ((qc1) it.next()).m3212a();
                }
                linkedHashMap.clear();
            }
            ViewTreeObserverOnDrawListenerC0129dh viewTreeObserverOnDrawListenerC0129dh = (ViewTreeObserverOnDrawListenerC0129dh) ((AbstractActivityC0246gh) mainActivity).reportFullyDrawnExecutor;
            MainActivity mainActivity2 = viewTreeObserverOnDrawListenerC0129dh.f1107g;
            mainActivity2.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0129dh);
            mainActivity2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0129dh);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m1244d(MainActivity mainActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!p30.m3002l(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!p30.m3002l(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m1245e(MainActivity mainActivity, AbstractActivityC0246gh abstractActivityC0246gh) {
        abstractActivityC0246gh.getClass();
        Bundle bundleM1960a = mainActivity.getSavedStateRegistry().m1960a(ACTIVITY_RESULT_TAG);
        if (bundleM1960a != null) {
            AbstractC0787u1 abstractC0787u1 = ((AbstractActivityC0246gh) mainActivity).activityResultRegistry;
            LinkedHashMap linkedHashMap = abstractC0787u1.f6098b;
            LinkedHashMap linkedHashMap2 = abstractC0787u1.f6097a;
            Bundle bundle = abstractC0787u1.f6102f;
            ArrayList<Integer> integerArrayList = bundleM1960a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleM1960a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleM1960a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                abstractC0787u1.f6099c.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleM1960a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        s91.m4046k(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                abstractC0787u1.f6098b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        InterfaceExecutorC0092ch interfaceExecutorC0092ch = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ViewTreeObserverOnDrawListenerC0129dh) interfaceExecutorC0092ch).m696a(decorView);
        super.addContentView(view, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void addMenuProvider(ee0 ee0Var, x90 x90Var) {
        ee0Var.getClass();
        x90Var.getClass();
        de0 de0Var = this.menuHostHelper;
        de0Var.f1060b.add(null);
        de0Var.f1059a.run();
        s90 lifecycle = x90Var.getLifecycle();
        HashMap map = de0Var.f1061c;
        ce0 ce0Var = (ce0) map.remove(ee0Var);
        if (ce0Var != null) {
            ce0Var.f795a.mo4015b(ce0Var.f796b);
            ce0Var.f796b = null;
        }
        map.put(ee0Var, new ce0(lifecycle, new be0(0, de0Var)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnConfigurationChangedListener(InterfaceC0766tj interfaceC0766tj) {
        interfaceC0766tj.getClass();
        this.onConfigurationChangedListeners.add(interfaceC0766tj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnContextAvailableListener(dl0 dl0Var) {
        dl0Var.getClass();
        C0249gk c0249gk = this.contextAwareHelper;
        c0249gk.getClass();
        AbstractActivityC0246gh abstractActivityC0246gh = c0249gk.f2006b;
        if (abstractActivityC0246gh != null) {
            m1245e(((C0962yg) dl0Var).f7620a, abstractActivityC0246gh);
        }
        c0249gk.f2005a.add(dl0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnMultiWindowModeChangedListener(InterfaceC0766tj interfaceC0766tj) {
        interfaceC0766tj.getClass();
        this.onMultiWindowModeChangedListeners.add(interfaceC0766tj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnNewIntentListener(InterfaceC0766tj interfaceC0766tj) {
        interfaceC0766tj.getClass();
        this.onNewIntentListeners.add(interfaceC0766tj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnPictureInPictureModeChangedListener(InterfaceC0766tj interfaceC0766tj) {
        interfaceC0766tj.getClass();
        this.onPictureInPictureModeChangedListeners.add(interfaceC0766tj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnPictureInPictureUiStateChangedListener(InterfaceC0766tj interfaceC0766tj) {
        interfaceC0766tj.getClass();
        this.onPictureInPictureUiStateChangedListeners.add(interfaceC0766tj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnTrimMemoryListener(InterfaceC0766tj interfaceC0766tj) {
        interfaceC0766tj.getClass();
        this.onTrimMemoryListeners.add(interfaceC0766tj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.add(runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void enterPictureInPictureMode(tq0 tq0Var) {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC0787u1 getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0411ky
    public AbstractC0176el getDefaultViewModelCreationExtras() {
        rg0 rg0Var = new rg0(C0133dl.f1150b);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = rg0Var.f1481a;
        if (application != null) {
            linkedHashMap.put(sc1.f5741d, getApplication());
        }
        linkedHashMap.put(AbstractC0398kl.f3208s, this);
        linkedHashMap.put(AbstractC0398kl.f3209t, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(AbstractC0398kl.f3210u, extras);
        }
        return rg0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tc1 getDefaultViewModelProviderFactory() {
        return (tc1) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0261gw getFullyDrawnReporter() {
        return (C0261gw) this.fullyDrawnReporter$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public Object getLastCustomNonConfigurationInstance() {
        C0055bh c0055bh = (C0055bh) getLastNonConfigurationInstance();
        if (c0055bh != null) {
            return c0055bh.f511a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractActivityC0209fh, p000.x90
    public s90 getLifecycle() {
        return super.getLifecycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ri0 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().m356a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final bl0 getOnBackPressedDispatcher() {
        return (bl0) this.onBackPressedDispatcher$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.nx0
    public final kx0 getSavedStateRegistry() {
        return this.savedStateRegistryController.f3615b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.wc1
    public vc1 getViewModelStore() {
        if (getApplication() == null) {
            C0921xc.m5134o("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this._viewModelStore == null) {
            C0055bh c0055bh = (C0055bh) getLastNonConfigurationInstance();
            if (c0055bh != null) {
                this._viewModelStore = c0055bh.f512b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new vc1();
            }
        }
        vc1 vc1Var = this._viewModelStore;
        vc1Var.getClass();
        return vc1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(C0587R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(C0587R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(C0587R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(C0587R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(C0587R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(C0587R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @InterfaceC0061bn
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.m4243a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @InterfaceC0061bn
    public void onBackPressed() {
        ((C0025ao) this.onBackPressedInput$delegate.getValue()).m4208a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC0766tj> it = this.onConfigurationChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractActivityC0209fh, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.m2084a(bundle);
        C0249gk c0249gk = this.contextAwareHelper;
        c0249gk.getClass();
        c0249gk.f2006b = this;
        Iterator it = c0249gk.f2005a.iterator();
        while (it.hasNext()) {
            m1245e(((C0962yg) ((dl0) it.next())).f7620a, this);
        }
        super.onCreate(bundle);
        int i = su0.f5837d;
        qu0.m3332b(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
        this.hasPictureInPictureSystemFeature = getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        de0 de0Var = this.menuHostHelper;
        getMenuInflater();
        Iterator it = de0Var.f1060b.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        C0921xc.m5123d();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = this.menuHostHelper.f1060b.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                C0921xc.m5123d();
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC0766tj> it = this.onMultiWindowModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new C0675r3(26));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator<InterfaceC0766tj> it = this.onNewIntentListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = this.menuHostHelper.f1060b.iterator();
        if (!it.hasNext()) {
            super.onPanelClosed(i, menu);
        } else {
            it.next().getClass();
            C0921xc.m5123d();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        int i = 1;
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC0766tj> it = this.onPictureInPictureModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new jo0(i));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        jo0 jo0Var;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        int i2 = 2;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            jo0Var = new jo0(i2);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            jo0Var = new jo0(i2);
        } else {
            jo0Var = new jo0(i2);
        }
        Iterator<InterfaceC0766tj> it = this.onPictureInPictureUiStateChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(jo0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.menuHostHelper.f1060b.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        C0921xc.m5123d();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @InterfaceC0061bn
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.activityResultRegistry.m4243a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0055bh c0055bh;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        vc1 vc1Var = this._viewModelStore;
        if (vc1Var == null && (c0055bh = (C0055bh) getLastNonConfigurationInstance()) != null) {
            vc1Var = c0055bh.f512b;
        }
        if (vc1Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0055bh c0055bh2 = new C0055bh();
        c0055bh2.f511a = objOnRetainCustomNonConfigurationInstance;
        c0055bh2.f512b = vc1Var;
        return c0055bh2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractActivityC0209fh, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (getLifecycle() instanceof z90) {
            s90 lifecycle = getLifecycle();
            lifecycle.getClass();
            z90 z90Var = (z90) lifecycle;
            z90Var.m5460d("setCurrentState");
            z90Var.m5462f(r90.f5334f);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.m2085b(bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<InterfaceC0766tj> it = this.onTrimMemoryListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Context peekAvailableContext() {
        return this.contextAwareHelper.f2006b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final <I, O> AbstractC0710s1 registerForActivityResult(AbstractC0673r1 abstractC0673r1, InterfaceC0636q1 interfaceC0636q1) {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void removeMenuProvider(ee0 ee0Var) {
        ee0Var.getClass();
        this.menuHostHelper.m686a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnConfigurationChangedListener(InterfaceC0766tj interfaceC0766tj) {
        interfaceC0766tj.getClass();
        this.onConfigurationChangedListeners.remove(interfaceC0766tj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnContextAvailableListener(dl0 dl0Var) {
        dl0Var.getClass();
        C0249gk c0249gk = this.contextAwareHelper;
        c0249gk.getClass();
        c0249gk.f2005a.remove(dl0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnMultiWindowModeChangedListener(InterfaceC0766tj interfaceC0766tj) {
        interfaceC0766tj.getClass();
        this.onMultiWindowModeChangedListeners.remove(interfaceC0766tj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnNewIntentListener(InterfaceC0766tj interfaceC0766tj) {
        interfaceC0766tj.getClass();
        this.onNewIntentListeners.remove(interfaceC0766tj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC0766tj interfaceC0766tj) {
        interfaceC0766tj.getClass();
        this.onPictureInPictureModeChangedListeners.remove(interfaceC0766tj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnPictureInPictureUiStateChangedListener(InterfaceC0766tj interfaceC0766tj) {
        interfaceC0766tj.getClass();
        this.onPictureInPictureUiStateChangedListeners.remove(interfaceC0766tj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnTrimMemoryListener(InterfaceC0766tj interfaceC0766tj) {
        interfaceC0766tj.getClass();
        this.onTrimMemoryListeners.remove(interfaceC0766tj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.remove(runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (r81.m3428a()) {
                g60.m1208g("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0261gw fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f2079a) {
                try {
                    fullyDrawnReporter.f2080b = true;
                    Iterator it = fullyDrawnReporter.f2081c.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0298hw) it.next()).invoke();
                    }
                    fullyDrawnReporter.f2081c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        InterfaceExecutorC0092ch interfaceExecutorC0092ch = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ViewTreeObserverOnDrawListenerC0129dh) interfaceExecutorC0092ch).m696a(decorView);
        super.setContentView(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setPictureInPictureParams(tq0 tq0Var) {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @InterfaceC0061bn
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @InterfaceC0061bn
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final <I, O> AbstractC0710s1 registerForActivityResult(AbstractC0673r1 abstractC0673r1, AbstractC0787u1 abstractC0787u1, InterfaceC0636q1 interfaceC0636q1) {
        throw null;
    }

    @Override // android.app.Activity
    @InterfaceC0061bn
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @InterfaceC0061bn
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        InterfaceExecutorC0092ch interfaceExecutorC0092ch = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ViewTreeObserverOnDrawListenerC0129dh) interfaceExecutorC0092ch).m696a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        InterfaceExecutorC0092ch interfaceExecutorC0092ch = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ViewTreeObserverOnDrawListenerC0129dh) interfaceExecutorC0092ch).m696a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @InterfaceC0061bn
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC0766tj> it = this.onPictureInPictureModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new jo0(1));
        }
    }

    @Override // android.app.Activity
    @InterfaceC0061bn
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC0766tj> it = this.onMultiWindowModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new C0675r3(26));
        }
    }

    public void addMenuProvider(ee0 ee0Var) {
        ee0Var.getClass();
        de0 de0Var = this.menuHostHelper;
        de0Var.f1060b.add(null);
        de0Var.f1059a.run();
    }

    public void addMenuProvider(ee0 ee0Var, x90 x90Var, r90 r90Var) {
        ee0Var.getClass();
        x90Var.getClass();
        r90Var.getClass();
        de0 de0Var = this.menuHostHelper;
        de0Var.getClass();
        s90 lifecycle = x90Var.getLifecycle();
        HashMap map = de0Var.f1061c;
        ce0 ce0Var = (ce0) map.remove(ee0Var);
        if (ce0Var != null) {
            ce0Var.f795a.mo4015b(ce0Var.f796b);
            ce0Var.f796b = null;
        }
        map.put(ee0Var, new ce0(lifecycle, new C0851vg(1, de0Var, r90Var)));
    }
}

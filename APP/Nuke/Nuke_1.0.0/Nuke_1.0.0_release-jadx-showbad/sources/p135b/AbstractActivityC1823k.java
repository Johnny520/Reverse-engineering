package p135b;

import android.annotation.SuppressLint;
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
import com.bumptech.glide.AbstractC1924f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import me.dartcv.nuke.R;
import p000A.C0099z;
import p002A1.AbstractC0116E;
import p002A1.AbstractC0142o;
import p002A1.AbstractC0150w;
import p002A1.C0117F;
import p002A1.C0118G;
import p002A1.C0123L;
import p002A1.C0126O;
import p002A1.C0147t;
import p002A1.EnumC0140m;
import p002A1.EnumC0141n;
import p002A1.FragmentC0153z;
import p002A1.InterfaceC0124M;
import p002A1.InterfaceC0127P;
import p002A1.InterfaceC0136i;
import p002A1.InterfaceC0143p;
import p002A1.InterfaceC0145r;
import p010B3.AbstractActivityC0224c;
import p014C1.C0239a;
import p019D1.AbstractC0261b;
import p019D1.C0260a;
import p019D1.C0262c;
import p030F1.C0436a;
import p030F1.C0438c;
import p030F1.InterfaceC0439d;
import p047I0.C0695S0;
import p048I1.C0777b;
import p048I1.C0780e;
import p048I1.C0781f;
import p048I1.InterfaceC0782g;
import p049I2.AbstractC0797o;
import p055K1.C0874a;
import p056K2.InterfaceC0875a;
import p056K2.InterfaceC0879e;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1678w;
import p151e.C1992a;
import p151e.InterfaceC1993b;
import p157f.AbstractC2066c;
import p157f.AbstractC2067d;
import p157f.InterfaceC2065b;
import p162g.AbstractC2168a;
import p191k4.C2475a;
import p194l1.AbstractActivityC2494b;
import p194l1.AbstractC2496d;
import p223q1.InterfaceC2907a;
import p229r1.C3078h;
import p229r1.C3079i;
import p229r1.InterfaceC3080j;

/* JADX INFO: renamed from: b.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1823k extends AbstractActivityC2494b implements InterfaceC0127P, InterfaceC0136i, InterfaceC0782g, InterfaceC1811C, InterfaceC0439d {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final C1818f Companion = new C1818f();
    private C0126O _viewModelStore;
    private final AbstractC2067d activityResultRegistry;
    private int contentLayoutId;
    private final C1992a contextAwareHelper = new C1992a();
    private final InterfaceC0879e defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final InterfaceC0879e fullyDrawnReporter$delegate;
    private boolean hasPictureInPictureSystemFeature;
    private final C3079i menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final InterfaceC0879e onBackPressedDispatcher$delegate;
    private final InterfaceC0879e onBackPressedInput$delegate;
    private final CopyOnWriteArrayList<InterfaceC2907a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC2907a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC2907a> onNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC2907a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC2907a> onPictureInPictureUiStateChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC2907a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final InterfaceExecutorC1820h reportFullyDrawnExecutor;
    private final C0781f savedStateRegistryController;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractActivityC1823k() {
        final AbstractActivityC0224c abstractActivityC0224c = (AbstractActivityC0224c) this;
        this.menuHostHelper = new C3079i(new RunnableC1814b(abstractActivityC0224c, 1));
        C0874a c0874a = new C0874a(this, new C0099z(6, this));
        this.savedStateRegistryController = new C0781f(c0874a);
        this.reportFullyDrawnExecutor = new ViewTreeObserverOnDrawListenerC1821i(abstractActivityC0224c);
        this.fullyDrawnReporter$delegate = AbstractC0797o.m1396u(new C0117F(abstractActivityC0224c, 2));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new C1822j();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureUiStateChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput$delegate = AbstractC0797o.m1396u(new C0117F(abstractActivityC0224c, 3));
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i5 = 0;
        getLifecycle().mo184a(new InterfaceC0143p() { // from class: b.d
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p002A1.InterfaceC0143p
            /* JADX INFO: renamed from: d */
            public final void mo147d(InterfaceC0145r interfaceC0145r, EnumC0140m enumC0140m) {
                Window window;
                View viewPeekDecorView;
                switch (i5) {
                    case 0:
                        if (enumC0140m == EnumC0140m.ON_STOP && (window = abstractActivityC0224c.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC1823k.m3293c(abstractActivityC0224c, interfaceC0145r, enumC0140m);
                        break;
                }
            }
        });
        final int i6 = 1;
        getLifecycle().mo184a(new InterfaceC0143p() { // from class: b.d
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p002A1.InterfaceC0143p
            /* JADX INFO: renamed from: d */
            public final void mo147d(InterfaceC0145r interfaceC0145r, EnumC0140m enumC0140m) {
                Window window;
                View viewPeekDecorView;
                switch (i6) {
                    case 0:
                        if (enumC0140m == EnumC0140m.ON_STOP && (window = abstractActivityC0224c.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC1823k.m3293c(abstractActivityC0224c, interfaceC0145r, enumC0140m);
                        break;
                }
            }
        });
        getLifecycle().mo184a(new C0777b(3, abstractActivityC0224c));
        c0874a.m1901a();
        EnumC0141n enumC0141n = ((C0147t) getLifecycle()).f541c;
        if (enumC0141n != EnumC0141n.f532e && enumC0141n != EnumC0141n.f533f) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (getSavedStateRegistry().m1326b() == null) {
            C0118G c0118g = new C0118G(getSavedStateRegistry(), abstractActivityC0224c);
            getSavedStateRegistry().m1327c("androidx.lifecycle.internal.SavedStateHandlesProvider", c0118g);
            getLifecycle().mo184a(new C0777b(2, c0118g));
        }
        getSavedStateRegistry().m1327c(ACTIVITY_RESULT_TAG, new C0239a(2, abstractActivityC0224c));
        addOnContextAvailableListener(new C1817e(abstractActivityC0224c));
        this.defaultViewModelProviderFactory$delegate = AbstractC0797o.m1396u(new C0117F(abstractActivityC0224c, 4));
        this.onBackPressedDispatcher$delegate = AbstractC0797o.m1396u(new C0117F(abstractActivityC0224c, 5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Bundle m3291a(AbstractActivityC0224c abstractActivityC0224c) {
        Bundle bundle = new Bundle();
        AbstractC2067d abstractC2067d = ((AbstractActivityC1823k) abstractActivityC0224c).activityResultRegistry;
        abstractC2067d.getClass();
        LinkedHashMap linkedHashMap = abstractC2067d.f6919b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC2067d.f6920c));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(abstractC2067d.f6923f));
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void access$ensureViewModelStore(AbstractActivityC1823k abstractActivityC1823k) {
        if (abstractActivityC1823k._viewModelStore == null) {
            C1819g c1819g = (C1819g) abstractActivityC1823k.getLastNonConfigurationInstance();
            if (c1819g != null) {
                abstractActivityC1823k._viewModelStore = c1819g.f6215b;
            }
            if (abstractActivityC1823k._viewModelStore == null) {
                abstractActivityC1823k._viewModelStore = new C0126O();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C1832t m3292b(AbstractActivityC0224c abstractActivityC0224c) {
        return new C1832t(((AbstractActivityC1823k) abstractActivityC0224c).reportFullyDrawnExecutor, new C0117F(abstractActivityC0224c, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m3293c(AbstractActivityC0224c abstractActivityC0224c, InterfaceC0145r interfaceC0145r, EnumC0140m enumC0140m) {
        if (enumC0140m == EnumC0140m.ON_DESTROY) {
            ((AbstractActivityC1823k) abstractActivityC0224c).contextAwareHelper.f6699b = null;
            if (!abstractActivityC0224c.isChangingConfigurations()) {
                abstractActivityC0224c.getViewModelStore().m176a();
            }
            ViewTreeObserverOnDrawListenerC1821i viewTreeObserverOnDrawListenerC1821i = (ViewTreeObserverOnDrawListenerC1821i) ((AbstractActivityC1823k) abstractActivityC0224c).reportFullyDrawnExecutor;
            AbstractActivityC0224c abstractActivityC0224c2 = viewTreeObserverOnDrawListenerC1821i.f6219g;
            abstractActivityC0224c2.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC1821i);
            abstractActivityC0224c2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC1821i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m3294d(AbstractActivityC0224c abstractActivityC0224c) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e5) {
            if (!AbstractC1665j.m2981a(e5.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e5;
            }
        } catch (NullPointerException e6) {
            if (!AbstractC1665j.m2981a(e6.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e6;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m3295e(AbstractActivityC0224c abstractActivityC0224c, AbstractActivityC1823k abstractActivityC1823k) {
        AbstractC1665j.m2985e(abstractActivityC1823k, "it");
        Bundle bundleM1325a = abstractActivityC0224c.getSavedStateRegistry().m1325a(ACTIVITY_RESULT_TAG);
        if (bundleM1325a != null) {
            AbstractC2067d abstractC2067d = ((AbstractActivityC1823k) abstractActivityC0224c).activityResultRegistry;
            LinkedHashMap linkedHashMap = abstractC2067d.f6919b;
            LinkedHashMap linkedHashMap2 = abstractC2067d.f6918a;
            Bundle bundle = abstractC2067d.f6923f;
            ArrayList<Integer> integerArrayList = bundleM1325a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleM1325a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleM1325a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                abstractC2067d.f6920c.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleM1325a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                String str = stringArrayList.get(i5);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        AbstractC1678w.m2997a(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i5);
                AbstractC1665j.m2984d(num2, "get(...)");
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i5);
                AbstractC1665j.m2984d(str2, "get(...)");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                abstractC2067d.f6919b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        InterfaceExecutorC1820h interfaceExecutorC1820h = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC1665j.m2984d(decorView, "getDecorView(...)");
        ((ViewTreeObserverOnDrawListenerC1821i) interfaceExecutorC1820h).m3290a(decorView);
        super.addContentView(view, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void addMenuProvider(InterfaceC3080j interfaceC3080j) {
        AbstractC1665j.m2985e(interfaceC3080j, "provider");
        C3079i c3079i = this.menuHostHelper;
        c3079i.f9794b.add(null);
        c3079i.f9793a.run();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnConfigurationChangedListener(InterfaceC2907a interfaceC2907a) {
        AbstractC1665j.m2985e(interfaceC2907a, "listener");
        this.onConfigurationChangedListeners.add(interfaceC2907a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnContextAvailableListener(InterfaceC1993b interfaceC1993b) {
        AbstractC1665j.m2985e(interfaceC1993b, "listener");
        C1992a c1992a = this.contextAwareHelper;
        c1992a.getClass();
        AbstractActivityC1823k abstractActivityC1823k = c1992a.f6699b;
        if (abstractActivityC1823k != null) {
            m3295e(((C1817e) interfaceC1993b).f6213a, abstractActivityC1823k);
        }
        c1992a.f6698a.add(interfaceC1993b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnMultiWindowModeChangedListener(InterfaceC2907a interfaceC2907a) {
        AbstractC1665j.m2985e(interfaceC2907a, "listener");
        this.onMultiWindowModeChangedListeners.add(interfaceC2907a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnNewIntentListener(InterfaceC2907a interfaceC2907a) {
        AbstractC1665j.m2985e(interfaceC2907a, "listener");
        this.onNewIntentListeners.add(interfaceC2907a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnPictureInPictureModeChangedListener(InterfaceC2907a interfaceC2907a) {
        AbstractC1665j.m2985e(interfaceC2907a, "listener");
        this.onPictureInPictureModeChangedListeners.add(interfaceC2907a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnPictureInPictureUiStateChangedListener(InterfaceC2907a interfaceC2907a) {
        AbstractC1665j.m2985e(interfaceC2907a, "listener");
        this.onPictureInPictureUiStateChangedListeners.add(interfaceC2907a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnTrimMemoryListener(InterfaceC2907a interfaceC2907a) {
        AbstractC1665j.m2985e(interfaceC2907a, "listener");
        this.onTrimMemoryListeners.add(interfaceC2907a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnUserLeaveHintListener(Runnable runnable) {
        AbstractC1665j.m2985e(runnable, "listener");
        this.onUserLeaveHintListeners.add(runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void enterPictureInPictureMode(AbstractC2496d abstractC2496d) {
        AbstractC1665j.m2985e(abstractC2496d, "params");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC2067d getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p002A1.InterfaceC0136i
    public AbstractC0261b getDefaultViewModelCreationExtras() {
        C0262c c0262c = new C0262c(C0260a.f853b);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0262c.f854a;
        if (application != null) {
            linkedHashMap.put(C0123L.f515d, getApplication());
        }
        linkedHashMap.put(AbstractC0116E.f495a, this);
        linkedHashMap.put(AbstractC0116E.f496b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(AbstractC0116E.f497c, extras);
        }
        return c0262c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC0124M getDefaultViewModelProviderFactory() {
        return (InterfaceC0124M) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1832t getFullyDrawnReporter() {
        return (C1832t) this.fullyDrawnReporter$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0875a
    public Object getLastCustomNonConfigurationInstance() {
        C1819g c1819g = (C1819g) getLastNonConfigurationInstance();
        if (c1819g != null) {
            return c1819g.f6214a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p194l1.AbstractActivityC2494b, p002A1.InterfaceC0145r
    public AbstractC0142o getLifecycle() {
        return super.getLifecycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p030F1.InterfaceC0439d
    public C0438c getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().m3285a().f6237c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p135b.InterfaceC1811C
    public final C1809A getOnBackPressedDispatcher() {
        return (C1809A) this.onBackPressedDispatcher$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p048I1.InterfaceC0782g
    public final C0780e getSavedStateRegistry() {
        return this.savedStateRegistryController.f2525b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p002A1.InterfaceC0127P
    public C0126O getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            C1819g c1819g = (C1819g) getLastNonConfigurationInstance();
            if (c1819g != null) {
                this._viewModelStore = c1819g.f6215b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new C0126O();
            }
        }
        C0126O c0126o = this._viewModelStore;
        AbstractC1665j.m2982b(c0126o);
        return c0126o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        AbstractC1665j.m2984d(decorView, "getDecorView(...)");
        AbstractC0116E.m165g(decorView, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC1665j.m2984d(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC1665j.m2984d(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC1665j.m2984d(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC1665j.m2984d(decorView5, "getDecorView(...)");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        AbstractC1665j.m2984d(decorView6, "getDecorView(...)");
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @InterfaceC0875a
    public void onActivityResult(int i5, int i6, Intent intent) {
        if (this.activityResultRegistry.m3786a(i5, i6, intent)) {
            return;
        }
        super.onActivityResult(i5, i6, intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @InterfaceC0875a
    public void onBackPressed() {
        ((C0436a) this.onBackPressedInput$delegate.getValue()).m709a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC1665j.m2985e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC2907a> it = this.onConfigurationChangedListeners.iterator();
        AbstractC1665j.m2984d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p194l1.AbstractActivityC2494b, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.m1329a(bundle);
        C1992a c1992a = this.contextAwareHelper;
        c1992a.getClass();
        c1992a.f6699b = this;
        Iterator it = c1992a.f6698a.iterator();
        while (it.hasNext()) {
            m3295e(((C1817e) ((InterfaceC1993b) it.next())).f6213a, this);
        }
        super.onCreate(bundle);
        int i5 = FragmentC0153z.f550d;
        AbstractC0150w.m195b(this);
        int i6 = this.contentLayoutId;
        if (i6 != 0) {
            setContentView(i6);
        }
        this.hasPictureInPictureSystemFeature = getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i5, Menu menu) {
        AbstractC1665j.m2985e(menu, "menu");
        if (i5 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i5, menu);
        C3079i c3079i = this.menuHostHelper;
        getMenuInflater();
        Iterator it = c3079i.f9794b.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i5, MenuItem menuItem) {
        AbstractC1665j.m2985e(menuItem, "item");
        if (super.onMenuItemSelected(i5, menuItem)) {
            return true;
        }
        if (i5 != 0) {
            return false;
        }
        Iterator it = this.menuHostHelper.f9794b.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @InterfaceC0875a
    public void onMultiWindowModeChanged(boolean z5) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC2907a> it = this.onMultiWindowModeChangedListeners.iterator();
        AbstractC1665j.m2984d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new C2475a(2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        AbstractC1665j.m2985e(intent, "intent");
        super.onNewIntent(intent);
        Iterator<InterfaceC2907a> it = this.onNewIntentListeners.iterator();
        AbstractC1665j.m2984d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i5, Menu menu) {
        AbstractC1665j.m2985e(menu, "menu");
        Iterator it = this.menuHostHelper.f9794b.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        super.onPanelClosed(i5, menu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @InterfaceC0875a
    public void onPictureInPictureModeChanged(boolean z5) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC2907a> it = this.onPictureInPictureModeChangedListeners.iterator();
        AbstractC1665j.m2984d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new C2475a(3));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        C2475a c2475a;
        AbstractC1665j.m2985e(pictureInPictureUiState, "pipState");
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            c2475a = new C2475a(4);
        } else if (i5 >= 31) {
            pictureInPictureUiState.isStashed();
            c2475a = new C2475a(4);
        } else {
            c2475a = new C2475a(4);
        }
        Iterator<InterfaceC2907a> it = this.onPictureInPictureUiStateChangedListeners.iterator();
        AbstractC1665j.m2984d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(c2475a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i5, View view, Menu menu) {
        AbstractC1665j.m2985e(menu, "menu");
        if (i5 != 0) {
            return true;
        }
        super.onPreparePanel(i5, view, menu);
        Iterator it = this.menuHostHelper.f9794b.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @InterfaceC0875a
    public void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        AbstractC1665j.m2985e(strArr, "permissions");
        AbstractC1665j.m2985e(iArr, "grantResults");
        if (this.activityResultRegistry.m3786a(i5, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i5, strArr, iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0875a
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C1819g c1819g;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C0126O c0126o = this._viewModelStore;
        if (c0126o == null && (c1819g = (C1819g) getLastNonConfigurationInstance()) != null) {
            c0126o = c1819g.f6215b;
        }
        if (c0126o == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C1819g c1819g2 = new C1819g();
        c1819g2.f6214a = objOnRetainCustomNonConfigurationInstance;
        c1819g2.f6215b = c0126o;
        return c1819g2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p194l1.AbstractActivityC2494b, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC1665j.m2985e(bundle, "outState");
        if (getLifecycle() instanceof C0147t) {
            AbstractC0142o lifecycle = getLifecycle();
            AbstractC1665j.m2983c(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            C0147t c0147t = (C0147t) lifecycle;
            c0147t.m188d("setCurrentState");
            c0147t.m190f(EnumC0141n.f533f);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.m1330b(bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i5) {
        super.onTrimMemory(i5);
        Iterator<InterfaceC2907a> it = this.onTrimMemoryListeners.iterator();
        AbstractC1665j.m2984d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i5));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        AbstractC1665j.m2984d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().run();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Context peekAvailableContext() {
        return this.contextAwareHelper.f6699b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final <I, O> AbstractC2066c registerForActivityResult(AbstractC2168a abstractC2168a, InterfaceC2065b interfaceC2065b) {
        AbstractC1665j.m2985e(abstractC2168a, "contract");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void removeMenuProvider(InterfaceC3080j interfaceC3080j) {
        AbstractC1665j.m2985e(interfaceC3080j, "provider");
        this.menuHostHelper.m5398a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnConfigurationChangedListener(InterfaceC2907a interfaceC2907a) {
        AbstractC1665j.m2985e(interfaceC2907a, "listener");
        this.onConfigurationChangedListeners.remove(interfaceC2907a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnContextAvailableListener(InterfaceC1993b interfaceC1993b) {
        AbstractC1665j.m2985e(interfaceC1993b, "listener");
        C1992a c1992a = this.contextAwareHelper;
        c1992a.getClass();
        c1992a.f6698a.remove(interfaceC1993b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnMultiWindowModeChangedListener(InterfaceC2907a interfaceC2907a) {
        AbstractC1665j.m2985e(interfaceC2907a, "listener");
        this.onMultiWindowModeChangedListeners.remove(interfaceC2907a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnNewIntentListener(InterfaceC2907a interfaceC2907a) {
        AbstractC1665j.m2985e(interfaceC2907a, "listener");
        this.onNewIntentListeners.remove(interfaceC2907a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC2907a interfaceC2907a) {
        AbstractC1665j.m2985e(interfaceC2907a, "listener");
        this.onPictureInPictureModeChangedListeners.remove(interfaceC2907a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnPictureInPictureUiStateChangedListener(InterfaceC2907a interfaceC2907a) {
        AbstractC1665j.m2985e(interfaceC2907a, "listener");
        this.onPictureInPictureUiStateChangedListeners.remove(interfaceC2907a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnTrimMemoryListener(InterfaceC2907a interfaceC2907a) {
        AbstractC1665j.m2985e(interfaceC2907a, "listener");
        this.onTrimMemoryListeners.remove(interfaceC2907a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        AbstractC1665j.m2985e(runnable, "listener");
        this.onUserLeaveHintListeners.remove(runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC1924f.m3502n()) {
                AbstractC1924f.m3494c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C1832t fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f6226a) {
                try {
                    fullyDrawnReporter.f6227b = true;
                    Iterator it = fullyDrawnReporter.f6228c.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1599a) it.next()).mo6a();
                    }
                    fullyDrawnReporter.f6228c.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void setContentView(int i5) {
        initializeViewTreeOwners();
        InterfaceExecutorC1820h interfaceExecutorC1820h = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC1665j.m2984d(decorView, "getDecorView(...)");
        ((ViewTreeObserverOnDrawListenerC1821i) interfaceExecutorC1820h).m3290a(decorView);
        super.setContentView(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setPictureInPictureParams(AbstractC2496d abstractC2496d) {
        AbstractC1665j.m2985e(abstractC2496d, "params");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @InterfaceC0875a
    public void startActivityForResult(Intent intent, int i5) {
        AbstractC1665j.m2985e(intent, "intent");
        super.startActivityForResult(intent, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @InterfaceC0875a
    public void startIntentSenderForResult(IntentSender intentSender, int i5, Intent intent, int i6, int i7, int i8) throws IntentSender.SendIntentException {
        AbstractC1665j.m2985e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i5, intent, i6, i7, i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final <I, O> AbstractC2066c registerForActivityResult(AbstractC2168a abstractC2168a, AbstractC2067d abstractC2067d, InterfaceC2065b interfaceC2065b) {
        AbstractC1665j.m2985e(abstractC2168a, "contract");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.app.Activity
    @InterfaceC0875a
    public void startActivityForResult(Intent intent, int i5, Bundle bundle) {
        AbstractC1665j.m2985e(intent, "intent");
        super.startActivityForResult(intent, i5, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.app.Activity
    @InterfaceC0875a
    public void startIntentSenderForResult(IntentSender intentSender, int i5, Intent intent, int i6, int i7, int i8, Bundle bundle) throws IntentSender.SendIntentException {
        AbstractC1665j.m2985e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i5, intent, i6, i7, i8, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        InterfaceExecutorC1820h interfaceExecutorC1820h = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC1665j.m2984d(decorView, "getDecorView(...)");
        ((ViewTreeObserverOnDrawListenerC1821i) interfaceExecutorC1820h).m3290a(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(InterfaceC3080j interfaceC3080j, InterfaceC0145r interfaceC0145r) {
        AbstractC1665j.m2985e(interfaceC3080j, "provider");
        AbstractC1665j.m2985e(interfaceC0145r, "owner");
        C3079i c3079i = this.menuHostHelper;
        c3079i.f9794b.add(null);
        c3079i.f9793a.run();
        AbstractC0142o lifecycle = interfaceC0145r.getLifecycle();
        HashMap map = c3079i.f9795c;
        C3078h c3078h = (C3078h) map.remove(interfaceC3080j);
        if (c3078h != null) {
            c3078h.f9791a.mo185b(c3078h.f9792b);
            c3078h.f9792b = null;
        }
        map.put(interfaceC3080j, new C3078h(lifecycle, new C0695S0(2, c3079i)));
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z5, Configuration configuration) {
        AbstractC1665j.m2985e(configuration, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z5, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC2907a> it = this.onMultiWindowModeChangedListeners.iterator();
            AbstractC1665j.m2984d(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new C2475a(2));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z5, Configuration configuration) {
        AbstractC1665j.m2985e(configuration, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z5, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC2907a> it = this.onPictureInPictureModeChangedListeners.iterator();
            AbstractC1665j.m2984d(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new C2475a(3));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        InterfaceExecutorC1820h interfaceExecutorC1820h = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC1665j.m2984d(decorView, "getDecorView(...)");
        ((ViewTreeObserverOnDrawListenerC1821i) interfaceExecutorC1820h).m3290a(decorView);
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(InterfaceC3080j interfaceC3080j, InterfaceC0145r interfaceC0145r, EnumC0141n enumC0141n) {
        AbstractC1665j.m2985e(interfaceC3080j, "provider");
        AbstractC1665j.m2985e(interfaceC0145r, "owner");
        AbstractC1665j.m2985e(enumC0141n, "state");
        C3079i c3079i = this.menuHostHelper;
        c3079i.getClass();
        AbstractC0142o lifecycle = interfaceC0145r.getLifecycle();
        HashMap map = c3079i.f9795c;
        C3078h c3078h = (C3078h) map.remove(interfaceC3080j);
        if (c3078h != null) {
            c3078h.f9791a.mo185b(c3078h.f9792b);
            c3078h.f9792b = null;
        }
        map.put(interfaceC3080j, new C3078h(lifecycle, new C1815c(1, c3079i, enumC0141n)));
    }
}

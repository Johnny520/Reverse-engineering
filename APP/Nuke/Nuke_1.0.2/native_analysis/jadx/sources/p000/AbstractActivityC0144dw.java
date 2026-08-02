package p000;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
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
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: dw */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0144dw extends AbstractActivityC0108cw implements lb3, es0, tc2, pt1, gm1 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final C0861wv Companion = new C0861wv();
    private kb3 _viewModelStore;
    private final AbstractC0302i5 activityResultRegistry;
    private int contentLayoutId;
    private final j71 defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final j71 fullyDrawnReporter$delegate;
    private boolean hasPictureInPictureSystemFeature;
    private final AtomicInteger nextLocalRequestCode;
    private final j71 onBackPressedDispatcher$delegate;
    private final j71 onBackPressedInput$delegate;
    private final CopyOnWriteArrayList<InterfaceC0442lz> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0442lz> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0442lz> onNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC0442lz> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0442lz> onPictureInPictureUiStateChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0442lz> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final InterfaceExecutorC0976zv reportFullyDrawnExecutor;
    private final rc2 savedStateRegistryController;
    private final l00 contextAwareHelper = new l00();
    private final ng1 menuHostHelper = new ng1(new RunnableC0633qv(this, 1));

    public AbstractActivityC0144dw() throws PendingIntent.CanceledException {
        final int i = 1;
        sc2 sc2Var = new sc2(this, new C0727ta(20, this));
        this.savedStateRegistryController = new rc2(sc2Var);
        this.reportFullyDrawnExecutor = new ViewTreeObserverOnDrawListenerC0033aw(this);
        this.fullyDrawnReporter$delegate = new hx2(new C0671rv(this, i));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new C0070bw();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureUiStateChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput$delegate = new hx2(new C0671rv(this, 2));
        if (getLifecycle() == null) {
            C0676s.m4653l("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final int i2 = 0;
        getLifecycle().mo505a(new fa1(this) { // from class: tv

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ AbstractActivityC0144dw f10969i;

            {
                this.f10969i = this;
            }

            @Override // p000.fa1
            /* JADX INFO: renamed from: g */
            public final void mo533g(ia1 ia1Var, z91 z91Var) {
                Window window;
                View viewPeekDecorView;
                int i3 = i2;
                AbstractActivityC0144dw abstractActivityC0144dw = this.f10969i;
                switch (i3) {
                    case 0:
                        if (z91Var == z91.ON_STOP && (window = abstractActivityC0144dw.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0144dw.m1202c(abstractActivityC0144dw, ia1Var, z91Var);
                        break;
                }
            }
        });
        getLifecycle().mo505a(new fa1(this) { // from class: tv

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ AbstractActivityC0144dw f10969i;

            {
                this.f10969i = this;
            }

            @Override // p000.fa1
            /* JADX INFO: renamed from: g */
            public final void mo533g(ia1 ia1Var, z91 z91Var) {
                Window window;
                View viewPeekDecorView;
                int i3 = i;
                AbstractActivityC0144dw abstractActivityC0144dw = this.f10969i;
                switch (i3) {
                    case 0:
                        if (z91Var == z91.ON_STOP && (window = abstractActivityC0144dw.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0144dw.m1202c(abstractActivityC0144dw, ia1Var, z91Var);
                        break;
                }
            }
        });
        getLifecycle().mo505a(new n62(i, this));
        sc2Var.m4793a();
        aa1 aa1Var = ((la1) getLifecycle()).f6009h;
        if (aa1Var != aa1.f120i && aa1Var != aa1.f121j) {
            throw new IllegalArgumentException(("Failed to enable `SavedStateHandle` for `" + this + "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `" + aa1Var + "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.").toString());
        }
        int i3 = 3;
        if (getSavedStateRegistry().m4134b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            mc2 mc2Var = new mc2(getSavedStateRegistry(), this);
            getSavedStateRegistry().m4135c("androidx.lifecycle.internal.SavedStateHandlesProvider", mc2Var);
            getLifecycle().mo505a(new n62(i3, mc2Var));
        }
        getSavedStateRegistry().m4135c(ACTIVITY_RESULT_TAG, new C0787uv(i2, this));
        addOnContextAvailableListener(new C0824vv(this));
        this.defaultViewModelProviderFactory$delegate = new hx2(new C0671rv(this, i3));
        this.onBackPressedDispatcher$delegate = new hx2(new C0671rv(this, 4));
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m1200a(AbstractActivityC0144dw abstractActivityC0144dw) {
        Bundle bundle = new Bundle();
        AbstractC0302i5 abstractC0302i5 = abstractActivityC0144dw.activityResultRegistry;
        abstractC0302i5.getClass();
        LinkedHashMap linkedHashMap = abstractC0302i5.f4272b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC0302i5.f4273c));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(abstractC0302i5.f4276f));
        return bundle;
    }

    public static final void access$ensureViewModelStore(AbstractActivityC0144dw abstractActivityC0144dw) {
        if (abstractActivityC0144dw._viewModelStore == null) {
            C0939yv c0939yv = (C0939yv) abstractActivityC0144dw.getLastNonConfigurationInstance();
            if (c0939yv != null) {
                abstractActivityC0144dw._viewModelStore = c0939yv.f13625b;
            }
            if (abstractActivityC0144dw._viewModelStore == null) {
                abstractActivityC0144dw._viewModelStore = new kb3();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static vm0 m1201b(AbstractActivityC0144dw abstractActivityC0144dw) {
        return new vm0(abstractActivityC0144dw.reportFullyDrawnExecutor, new C0671rv(abstractActivityC0144dw, 0));
    }

    /* JADX INFO: renamed from: c */
    public static void m1202c(AbstractActivityC0144dw abstractActivityC0144dw, ia1 ia1Var, z91 z91Var) {
        if (z91Var == z91.ON_DESTROY) {
            abstractActivityC0144dw.contextAwareHelper.f5865b = null;
            if (!abstractActivityC0144dw.isChangingConfigurations()) {
                abstractActivityC0144dw.getViewModelStore().m2626a();
            }
            ViewTreeObserverOnDrawListenerC0033aw viewTreeObserverOnDrawListenerC0033aw = (ViewTreeObserverOnDrawListenerC0033aw) abstractActivityC0144dw.reportFullyDrawnExecutor;
            AbstractActivityC0144dw abstractActivityC0144dw2 = viewTreeObserverOnDrawListenerC0033aw.f415k;
            abstractActivityC0144dw2.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0033aw);
            abstractActivityC0144dw2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0033aw);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m1203d(AbstractActivityC0144dw abstractActivityC0144dw) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!t11.m5086l(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!t11.m5086l(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1204e(AbstractActivityC0144dw abstractActivityC0144dw, AbstractActivityC0144dw abstractActivityC0144dw2) {
        abstractActivityC0144dw2.getClass();
        Bundle bundleM4133a = abstractActivityC0144dw.getSavedStateRegistry().m4133a(ACTIVITY_RESULT_TAG);
        if (bundleM4133a != null) {
            AbstractC0302i5 abstractC0302i5 = abstractActivityC0144dw.activityResultRegistry;
            LinkedHashMap linkedHashMap = abstractC0302i5.f4272b;
            LinkedHashMap linkedHashMap2 = abstractC0302i5.f4271a;
            Bundle bundle = abstractC0302i5.f4276f;
            ArrayList<Integer> integerArrayList = bundleM4133a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleM4133a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleM4133a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                abstractC0302i5.f4273c.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleM4133a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        xe1.m6117e(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                abstractC0302i5.f4272b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        InterfaceExecutorC0976zv interfaceExecutorC0976zv = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ViewTreeObserverOnDrawListenerC0033aw) interfaceExecutorC0976zv).m297a(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(og1 og1Var, ia1 ia1Var) {
        og1Var.getClass();
        ia1Var.getClass();
        ng1 ng1Var = this.menuHostHelper;
        ng1Var.f7150b.add(null);
        ng1Var.f7149a.run();
        ba1 lifecycle = ia1Var.getLifecycle();
        HashMap map = ng1Var.f7151c;
        mg1 mg1Var = (mg1) map.remove(og1Var);
        if (mg1Var != null) {
            mg1Var.f6638a.mo506b(mg1Var.f6639b);
            mg1Var.f6639b = null;
        }
        map.put(og1Var, new mg1(lifecycle, new lg1(0, ng1Var)));
    }

    public final void addOnConfigurationChangedListener(InterfaceC0442lz interfaceC0442lz) {
        interfaceC0442lz.getClass();
        this.onConfigurationChangedListeners.add(interfaceC0442lz);
    }

    public final void addOnContextAvailableListener(qt1 qt1Var) {
        qt1Var.getClass();
        l00 l00Var = this.contextAwareHelper;
        l00Var.getClass();
        AbstractActivityC0144dw abstractActivityC0144dw = l00Var.f5865b;
        if (abstractActivityC0144dw != null) {
            m1204e(((C0824vv) qt1Var).f12181a, abstractActivityC0144dw);
        }
        l00Var.f5864a.add(qt1Var);
    }

    public final void addOnMultiWindowModeChangedListener(InterfaceC0442lz interfaceC0442lz) {
        interfaceC0442lz.getClass();
        this.onMultiWindowModeChangedListeners.add(interfaceC0442lz);
    }

    public final void addOnNewIntentListener(InterfaceC0442lz interfaceC0442lz) {
        interfaceC0442lz.getClass();
        this.onNewIntentListeners.add(interfaceC0442lz);
    }

    public final void addOnPictureInPictureModeChangedListener(InterfaceC0442lz interfaceC0442lz) {
        interfaceC0442lz.getClass();
        this.onPictureInPictureModeChangedListeners.add(interfaceC0442lz);
    }

    public final void addOnPictureInPictureUiStateChangedListener(InterfaceC0442lz interfaceC0442lz) {
        interfaceC0442lz.getClass();
        this.onPictureInPictureUiStateChangedListeners.add(interfaceC0442lz);
    }

    public final void addOnTrimMemoryListener(InterfaceC0442lz interfaceC0442lz) {
        interfaceC0442lz.getClass();
        this.onTrimMemoryListeners.add(interfaceC0442lz);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.add(runnable);
    }

    public final void enterPictureInPictureMode(oz1 oz1Var) {
        throw null;
    }

    public final AbstractC0302i5 getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // p000.es0
    public s20 getDefaultViewModelCreationExtras() {
        wj1 wj1Var = new wj1(r20.f9329b);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = wj1Var.f9877a;
        if (application != null) {
            linkedHashMap.put(hb3.f3948d, getApplication());
        }
        linkedHashMap.put(up0.f11398f, this);
        linkedHashMap.put(up0.f11399g, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(up0.f11400h, extras);
        }
        return wj1Var;
    }

    public ib3 getDefaultViewModelProviderFactory() {
        return (ib3) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public vm0 getFullyDrawnReporter() {
        return (vm0) this.fullyDrawnReporter$delegate.getValue();
    }

    @j70
    public Object getLastCustomNonConfigurationInstance() {
        C0939yv c0939yv = (C0939yv) getLastNonConfigurationInstance();
        if (c0939yv != null) {
            return c0939yv.f13624a;
        }
        return null;
    }

    @Override // p000.AbstractActivityC0108cw, p000.ia1
    public ba1 getLifecycle() {
        return super.getLifecycle();
    }

    @Override // p000.gm1
    public fm1 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().m3639a();
    }

    @Override // p000.pt1
    public final ot1 getOnBackPressedDispatcher() {
        return (ot1) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // p000.tc2
    public final qc2 getSavedStateRegistry() {
        return this.savedStateRegistryController.f9512b;
    }

    @Override // p000.lb3
    public kb3 getViewModelStore() {
        if (getApplication() == null) {
            C0676s.m4653l("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this._viewModelStore == null) {
            C0939yv c0939yv = (C0939yv) getLastNonConfigurationInstance();
            if (c0939yv != null) {
                this._viewModelStore = c0939yv.f13625b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new kb3();
            }
        }
        kb3 kb3Var = this._viewModelStore;
        kb3Var.getClass();
        return kb3Var;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @j70
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.m2270a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @j70
    public void onBackPressed() {
        ((q80) this.onBackPressedInput$delegate.getValue()).m2515a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC0442lz> it = this.onConfigurationChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // p000.AbstractActivityC0108cw, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.m4432a(bundle);
        l00 l00Var = this.contextAwareHelper;
        l00Var.getClass();
        l00Var.f5865b = this;
        Iterator it = l00Var.f5864a.iterator();
        while (it.hasNext()) {
            m1204e(((C0824vv) ((qt1) it.next())).f12181a, this);
        }
        super.onCreate(bundle);
        int i = j82.f4919h;
        h82.m2123b(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
        this.hasPictureInPictureSystemFeature = getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        ng1 ng1Var = this.menuHostHelper;
        getMenuInflater();
        Iterator it = ng1Var.f7150b.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        c80.m664g();
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = this.menuHostHelper.f7150b.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                c80.m664g();
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC0442lz> it = this.onMultiWindowModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new j51(5));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator<InterfaceC0442lz> it = this.onNewIntentListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = this.menuHostHelper.f7150b.iterator();
        if (!it.hasNext()) {
            super.onPanelClosed(i, menu);
        } else {
            it.next().getClass();
            c80.m664g();
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC0442lz> it = this.onPictureInPictureModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new j51(9));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        i51 i51Var;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        int i2 = 10;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            i51Var = new i51(i2);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            i51Var = new i51(i2);
        } else {
            i51Var = new i51(i2);
        }
        Iterator<InterfaceC0442lz> it = this.onPictureInPictureUiStateChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(i51Var);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.menuHostHelper.f7150b.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        c80.m664g();
        return false;
    }

    @Override // android.app.Activity
    @j70
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.activityResultRegistry.m2270a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @j70
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0939yv c0939yv;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        kb3 kb3Var = this._viewModelStore;
        if (kb3Var == null && (c0939yv = (C0939yv) getLastNonConfigurationInstance()) != null) {
            kb3Var = c0939yv.f13625b;
        }
        if (kb3Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0939yv c0939yv2 = new C0939yv();
        c0939yv2.f13624a = objOnRetainCustomNonConfigurationInstance;
        c0939yv2.f13625b = kb3Var;
        return c0939yv2;
    }

    @Override // p000.AbstractActivityC0108cw, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (getLifecycle() instanceof la1) {
            ba1 lifecycle = getLifecycle();
            lifecycle.getClass();
            la1 la1Var = (la1) lifecycle;
            la1Var.m2891d("setCurrentState");
            la1Var.m2893f(aa1.f121j);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.m4433b(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<InterfaceC0442lz> it = this.onTrimMemoryListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.f5865b;
    }

    public final <I, O> AbstractC0265h5 registerForActivityResult(AbstractC0228g5 abstractC0228g5, InterfaceC0191f5 interfaceC0191f5) {
        throw null;
    }

    public void removeMenuProvider(og1 og1Var) {
        og1Var.getClass();
        this.menuHostHelper.m3307a();
    }

    public final void removeOnConfigurationChangedListener(InterfaceC0442lz interfaceC0442lz) {
        interfaceC0442lz.getClass();
        this.onConfigurationChangedListeners.remove(interfaceC0442lz);
    }

    public final void removeOnContextAvailableListener(qt1 qt1Var) {
        qt1Var.getClass();
        l00 l00Var = this.contextAwareHelper;
        l00Var.getClass();
        l00Var.f5864a.remove(qt1Var);
    }

    public final void removeOnMultiWindowModeChangedListener(InterfaceC0442lz interfaceC0442lz) {
        interfaceC0442lz.getClass();
        this.onMultiWindowModeChangedListeners.remove(interfaceC0442lz);
    }

    public final void removeOnNewIntentListener(InterfaceC0442lz interfaceC0442lz) {
        interfaceC0442lz.getClass();
        this.onNewIntentListeners.remove(interfaceC0442lz);
    }

    public final void removeOnPictureInPictureModeChangedListener(InterfaceC0442lz interfaceC0442lz) {
        interfaceC0442lz.getClass();
        this.onPictureInPictureModeChangedListeners.remove(interfaceC0442lz);
    }

    public final void removeOnPictureInPictureUiStateChangedListener(InterfaceC0442lz interfaceC0442lz) {
        interfaceC0442lz.getClass();
        this.onPictureInPictureUiStateChangedListeners.remove(interfaceC0442lz);
    }

    public final void removeOnTrimMemoryListener(InterfaceC0442lz interfaceC0442lz) {
        interfaceC0442lz.getClass();
        this.onTrimMemoryListeners.remove(interfaceC0442lz);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (pb3.m3846c()) {
                pb3.m3844a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            vm0 fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f12015a) {
                try {
                    fullyDrawnReporter.f12016b = true;
                    Iterator it = fullyDrawnReporter.f12017c.iterator();
                    while (it.hasNext()) {
                        ((xm0) it.next()).mo6a();
                    }
                    fullyDrawnReporter.f12017c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        InterfaceExecutorC0976zv interfaceExecutorC0976zv = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ViewTreeObserverOnDrawListenerC0033aw) interfaceExecutorC0976zv).m297a(decorView);
        super.setContentView(i);
    }

    public final void setPictureInPictureParams(oz1 oz1Var) {
        throw null;
    }

    @Override // android.app.Activity
    @j70
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @j70
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final <I, O> AbstractC0265h5 registerForActivityResult(AbstractC0228g5 abstractC0228g5, AbstractC0302i5 abstractC0302i5, InterfaceC0191f5 interfaceC0191f5) {
        throw null;
    }

    @Override // android.app.Activity
    @j70
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @j70
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        InterfaceExecutorC0976zv interfaceExecutorC0976zv = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ViewTreeObserverOnDrawListenerC0033aw) interfaceExecutorC0976zv).m297a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        InterfaceExecutorC0976zv interfaceExecutorC0976zv = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ViewTreeObserverOnDrawListenerC0033aw) interfaceExecutorC0976zv).m297a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @j70
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC0442lz> it = this.onMultiWindowModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new j51(5));
        }
    }

    @Override // android.app.Activity
    @j70
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC0442lz> it = this.onPictureInPictureModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new j51(9));
        }
    }

    public void addMenuProvider(og1 og1Var) {
        og1Var.getClass();
        ng1 ng1Var = this.menuHostHelper;
        ng1Var.f7150b.add(null);
        ng1Var.f7149a.run();
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(og1 og1Var, ia1 ia1Var, aa1 aa1Var) {
        og1Var.getClass();
        ia1Var.getClass();
        aa1Var.getClass();
        ng1 ng1Var = this.menuHostHelper;
        ng1Var.getClass();
        ba1 lifecycle = ia1Var.getLifecycle();
        HashMap map = ng1Var.f7151c;
        mg1 mg1Var = (mg1) map.remove(og1Var);
        if (mg1Var != null) {
            mg1Var.f6638a.mo506b(mg1Var.f6639b);
            mg1Var.f6639b = null;
        }
        map.put(og1Var, new mg1(lifecycle, new C0709sv(1, ng1Var, aa1Var)));
    }
}

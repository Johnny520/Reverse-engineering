package defpackage;

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

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dw extends cw implements lb3, es0, tc2, pt1, gm1 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final wv Companion = new wv();
    private kb3 _viewModelStore;
    private final i5 activityResultRegistry;
    private int contentLayoutId;
    private final j71 defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final j71 fullyDrawnReporter$delegate;
    private boolean hasPictureInPictureSystemFeature;
    private final AtomicInteger nextLocalRequestCode;
    private final j71 onBackPressedDispatcher$delegate;
    private final j71 onBackPressedInput$delegate;
    private final CopyOnWriteArrayList<lz> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<lz> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<lz> onNewIntentListeners;
    private final CopyOnWriteArrayList<lz> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<lz> onPictureInPictureUiStateChangedListeners;
    private final CopyOnWriteArrayList<lz> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final zv reportFullyDrawnExecutor;
    private final rc2 savedStateRegistryController;
    private final l00 contextAwareHelper = new l00();
    private final ng1 menuHostHelper = new ng1(new qv(this, 1));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dw() throws PendingIntent.CanceledException {
        final int i = 1;
        sc2 sc2Var = new sc2(this, new ta(20, this));
        this.savedStateRegistryController = new rc2(sc2Var);
        this.reportFullyDrawnExecutor = new aw(this);
        this.fullyDrawnReporter$delegate = new hx2(new rv(this, i));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new bw();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureUiStateChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput$delegate = new hx2(new rv(this, 2));
        if (getLifecycle() == null) {
            s.l("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final int i2 = 0;
        getLifecycle().a(new fa1(this) { // from class: tv
            public final /* synthetic */ dw i;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.i = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.fa1
            public final void g(ia1 ia1Var, z91 z91Var) {
                Window window;
                View viewPeekDecorView;
                int i3 = i2;
                dw dwVar = this.i;
                switch (i3) {
                    case 0:
                        if (z91Var == z91.ON_STOP && (window = dwVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        dw.c(dwVar, ia1Var, z91Var);
                        break;
                }
            }
        });
        getLifecycle().a(new fa1(this) { // from class: tv
            public final /* synthetic */ dw i;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.i = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.fa1
            public final void g(ia1 ia1Var, z91 z91Var) {
                Window window;
                View viewPeekDecorView;
                int i3 = i;
                dw dwVar = this.i;
                switch (i3) {
                    case 0:
                        if (z91Var == z91.ON_STOP && (window = dwVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        dw.c(dwVar, ia1Var, z91Var);
                        break;
                }
            }
        });
        getLifecycle().a(new n62(i, this));
        sc2Var.a();
        aa1 aa1Var = ((la1) getLifecycle()).h;
        if (aa1Var != aa1.i && aa1Var != aa1.j) {
            throw new IllegalArgumentException(("Failed to enable `SavedStateHandle` for `" + this + "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `" + aa1Var + "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.").toString());
        }
        int i3 = 3;
        if (getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            mc2 mc2Var = new mc2(getSavedStateRegistry(), this);
            getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", mc2Var);
            getLifecycle().a(new n62(i3, mc2Var));
        }
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new uv(i2, this));
        addOnContextAvailableListener(new vv(this));
        this.defaultViewModelProviderFactory$delegate = new hx2(new rv(this, i3));
        this.onBackPressedDispatcher$delegate = new hx2(new rv(this, 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Bundle a(dw dwVar) {
        Bundle bundle = new Bundle();
        i5 i5Var = dwVar.activityResultRegistry;
        i5Var.getClass();
        LinkedHashMap linkedHashMap = i5Var.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(i5Var.c));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(i5Var.f));
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void access$ensureViewModelStore(dw dwVar) {
        if (dwVar._viewModelStore == null) {
            yv yvVar = (yv) dwVar.getLastNonConfigurationInstance();
            if (yvVar != null) {
                dwVar._viewModelStore = yvVar.b;
            }
            if (dwVar._viewModelStore == null) {
                dwVar._viewModelStore = new kb3();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static vm0 b(dw dwVar) {
        return new vm0(dwVar.reportFullyDrawnExecutor, new rv(dwVar, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(dw dwVar, ia1 ia1Var, z91 z91Var) {
        if (z91Var == z91.ON_DESTROY) {
            dwVar.contextAwareHelper.b = null;
            if (!dwVar.isChangingConfigurations()) {
                dwVar.getViewModelStore().a();
            }
            aw awVar = (aw) dwVar.reportFullyDrawnExecutor;
            dw dwVar2 = awVar.k;
            dwVar2.getWindow().getDecorView().removeCallbacks(awVar);
            dwVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(awVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(dw dwVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!t11.l(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!t11.l(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e(dw dwVar, dw dwVar2) {
        dwVar2.getClass();
        Bundle bundleA = dwVar.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            i5 i5Var = dwVar.activityResultRegistry;
            LinkedHashMap linkedHashMap = i5Var.b;
            LinkedHashMap linkedHashMap2 = i5Var.a;
            Bundle bundle = i5Var.f;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                i5Var.c.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        xe1.e(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                i5Var.b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        zv zvVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((aw) zvVar).a(decorView);
        super.addContentView(view, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void addMenuProvider(og1 og1Var, ia1 ia1Var) {
        og1Var.getClass();
        ia1Var.getClass();
        ng1 ng1Var = this.menuHostHelper;
        ng1Var.b.add(null);
        ng1Var.a.run();
        ba1 lifecycle = ia1Var.getLifecycle();
        HashMap map = ng1Var.c;
        mg1 mg1Var = (mg1) map.remove(og1Var);
        if (mg1Var != null) {
            mg1Var.a.b(mg1Var.b);
            mg1Var.b = null;
        }
        map.put(og1Var, new mg1(lifecycle, new lg1(0, ng1Var)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnConfigurationChangedListener(lz lzVar) {
        lzVar.getClass();
        this.onConfigurationChangedListeners.add(lzVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnContextAvailableListener(qt1 qt1Var) {
        qt1Var.getClass();
        l00 l00Var = this.contextAwareHelper;
        l00Var.getClass();
        dw dwVar = l00Var.b;
        if (dwVar != null) {
            e(((vv) qt1Var).a, dwVar);
        }
        l00Var.a.add(qt1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnMultiWindowModeChangedListener(lz lzVar) {
        lzVar.getClass();
        this.onMultiWindowModeChangedListeners.add(lzVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnNewIntentListener(lz lzVar) {
        lzVar.getClass();
        this.onNewIntentListeners.add(lzVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnPictureInPictureModeChangedListener(lz lzVar) {
        lzVar.getClass();
        this.onPictureInPictureModeChangedListeners.add(lzVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnPictureInPictureUiStateChangedListener(lz lzVar) {
        lzVar.getClass();
        this.onPictureInPictureUiStateChangedListeners.add(lzVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnTrimMemoryListener(lz lzVar) {
        lzVar.getClass();
        this.onTrimMemoryListeners.add(lzVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.add(runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void enterPictureInPictureMode(oz1 oz1Var) {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final i5 getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.es0
    public s20 getDefaultViewModelCreationExtras() {
        wj1 wj1Var = new wj1(r20.b);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = wj1Var.a;
        if (application != null) {
            linkedHashMap.put(hb3.d, getApplication());
        }
        linkedHashMap.put(up0.f, this);
        linkedHashMap.put(up0.g, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(up0.h, extras);
        }
        return wj1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ib3 getDefaultViewModelProviderFactory() {
        return (ib3) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vm0 getFullyDrawnReporter() {
        return (vm0) this.fullyDrawnReporter$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @j70
    public Object getLastCustomNonConfigurationInstance() {
        yv yvVar = (yv) getLastNonConfigurationInstance();
        if (yvVar != null) {
            return yvVar.a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.cw, defpackage.ia1
    public ba1 getLifecycle() {
        return super.getLifecycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gm1
    public fm1 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pt1
    public final ot1 getOnBackPressedDispatcher() {
        return (ot1) this.onBackPressedDispatcher$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.tc2
    public final qc2 getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lb3
    public kb3 getViewModelStore() {
        if (getApplication() == null) {
            s.l("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this._viewModelStore == null) {
            yv yvVar = (yv) getLastNonConfigurationInstance();
            if (yvVar != null) {
                this._viewModelStore = yvVar.b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new kb3();
            }
        }
        kb3 kb3Var = this._viewModelStore;
        kb3Var.getClass();
        return kb3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @j70
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @j70
    public void onBackPressed() {
        ((q80) this.onBackPressedInput$delegate.getValue()).a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator<lz> it = this.onConfigurationChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.cw, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.a(bundle);
        l00 l00Var = this.contextAwareHelper;
        l00Var.getClass();
        l00Var.b = this;
        Iterator it = l00Var.a.iterator();
        while (it.hasNext()) {
            e(((vv) ((qt1) it.next())).a, this);
        }
        super.onCreate(bundle);
        int i = j82.h;
        h82.b(this);
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
        ng1 ng1Var = this.menuHostHelper;
        getMenuInflater();
        Iterator it = ng1Var.b.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        c80.g();
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
            Iterator it = this.menuHostHelper.b.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                c80.g();
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
            Iterator<lz> it = this.onMultiWindowModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new j51(5));
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
        Iterator<lz> it = this.onNewIntentListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = this.menuHostHelper.b.iterator();
        if (!it.hasNext()) {
            super.onPanelClosed(i, menu);
        } else {
            it.next().getClass();
            c80.g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<lz> it = this.onPictureInPictureModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new j51(9));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        Iterator<lz> it = this.onPictureInPictureUiStateChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(i51Var);
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
        Iterator it = this.menuHostHelper.b.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        c80.g();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @j70
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @j70
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        yv yvVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        kb3 kb3Var = this._viewModelStore;
        if (kb3Var == null && (yvVar = (yv) getLastNonConfigurationInstance()) != null) {
            kb3Var = yvVar.b;
        }
        if (kb3Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        yv yvVar2 = new yv();
        yvVar2.a = objOnRetainCustomNonConfigurationInstance;
        yvVar2.b = kb3Var;
        return yvVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.cw, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (getLifecycle() instanceof la1) {
            ba1 lifecycle = getLifecycle();
            lifecycle.getClass();
            la1 la1Var = (la1) lifecycle;
            la1Var.d("setCurrentState");
            la1Var.f(aa1.j);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.b(bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<lz> it = this.onTrimMemoryListeners.iterator();
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
        return this.contextAwareHelper.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final <I, O> h5 registerForActivityResult(g5 g5Var, f5 f5Var) {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void removeMenuProvider(og1 og1Var) {
        og1Var.getClass();
        this.menuHostHelper.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnConfigurationChangedListener(lz lzVar) {
        lzVar.getClass();
        this.onConfigurationChangedListeners.remove(lzVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnContextAvailableListener(qt1 qt1Var) {
        qt1Var.getClass();
        l00 l00Var = this.contextAwareHelper;
        l00Var.getClass();
        l00Var.a.remove(qt1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnMultiWindowModeChangedListener(lz lzVar) {
        lzVar.getClass();
        this.onMultiWindowModeChangedListeners.remove(lzVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnNewIntentListener(lz lzVar) {
        lzVar.getClass();
        this.onNewIntentListeners.remove(lzVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnPictureInPictureModeChangedListener(lz lzVar) {
        lzVar.getClass();
        this.onPictureInPictureModeChangedListeners.remove(lzVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnPictureInPictureUiStateChangedListener(lz lzVar) {
        lzVar.getClass();
        this.onPictureInPictureUiStateChangedListeners.remove(lzVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeOnTrimMemoryListener(lz lzVar) {
        lzVar.getClass();
        this.onTrimMemoryListeners.remove(lzVar);
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
            if (pb3.c()) {
                pb3.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            vm0 fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.a) {
                try {
                    fullyDrawnReporter.b = true;
                    Iterator it = fullyDrawnReporter.c.iterator();
                    while (it.hasNext()) {
                        ((xm0) it.next()).a();
                    }
                    fullyDrawnReporter.c.clear();
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
        zv zvVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((aw) zvVar).a(decorView);
        super.setContentView(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setPictureInPictureParams(oz1 oz1Var) {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @j70
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @j70
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final <I, O> h5 registerForActivityResult(g5 g5Var, i5 i5Var, f5 f5Var) {
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
        zv zvVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((aw) zvVar).a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        zv zvVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((aw) zvVar).a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @j70
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<lz> it = this.onMultiWindowModeChangedListeners.iterator();
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
        Iterator<lz> it = this.onPictureInPictureModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new j51(9));
        }
    }

    public void addMenuProvider(og1 og1Var) {
        og1Var.getClass();
        ng1 ng1Var = this.menuHostHelper;
        ng1Var.b.add(null);
        ng1Var.a.run();
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(og1 og1Var, ia1 ia1Var, aa1 aa1Var) {
        og1Var.getClass();
        ia1Var.getClass();
        aa1Var.getClass();
        ng1 ng1Var = this.menuHostHelper;
        ng1Var.getClass();
        ba1 lifecycle = ia1Var.getLifecycle();
        HashMap map = ng1Var.c;
        mg1 mg1Var = (mg1) map.remove(og1Var);
        if (mg1Var != null) {
            mg1Var.a.b(mg1Var.b);
            mg1Var.b = null;
        }
        map.put(og1Var, new mg1(lifecycle, new sv(1, ng1Var, aa1Var)));
    }
}

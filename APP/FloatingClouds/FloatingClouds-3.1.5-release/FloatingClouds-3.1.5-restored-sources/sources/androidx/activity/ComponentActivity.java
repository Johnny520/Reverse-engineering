package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.AbstractC0981a;
import androidx.lifecycle.AbstractC1116e;
import androidx.lifecycle.C1119h;
import androidx.lifecycle.C1129n;
import androidx.lifecycle.C1130o;
import androidx.lifecycle.C1131p;
import androidx.lifecycle.C1133q;
import androidx.lifecycle.FragmentC1124l;
import androidx.lifecycle.InterfaceC1114c;
import androidx.lifecycle.InterfaceC1118g;
import androidx.lifecycle.viewmodel.C1137R;
import androidx.savedstate.C1224a;
import androidx.savedstate.C1225b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.AbstractC0005A4;
import p000a.AbstractC0433Y;
import p000a.AbstractC0489b0;
import p000a.ActivityC0060D3;
import p000a.C0004A3;
import p000a.C0012Ab;
import p000a.C0023B3;
import p000a.C0042C3;
import p000a.C0109Fg;
import p000a.C0196Kd;
import p000a.C0235Mg;
import p000a.C0343T;
import p000a.C0413Wf;
import p000a.C0419X3;
import p000a.C0481ab;
import p000a.C0593g9;
import p000a.C0631i9;
import p000a.C0800r7;
import p000a.C0862uc;
import p000a.C0944z;
import p000a.C0956zb;
import p000a.C0960zf;
import p000a.InterfaceC0127Gg;
import p000a.InterfaceC0214Ld;
import p000a.InterfaceC0294Q3;
import p000a.InterfaceC0361U;
import p000a.InterfaceC0415X;
import p000a.InterfaceC0426Xa;
import p000a.InterfaceC0445Yb;
import p000a.InterfaceC0463Zb;
import p000a.InterfaceC0482ac;
import p000a.InterfaceC0501bc;
import p000a.InterfaceC0520cc;
import p000a.InterfaceC0546e0;
import p000a.InterfaceC0595gb;
import p000a.InterfaceC0596gc;
import p000a.InterfaceC0935y9;
import p000a.RunnableC0221M2;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends ActivityC0060D3 implements InterfaceC0127Gg, InterfaceC1114c, InterfaceC0214Ld, InterfaceC0445Yb, InterfaceC0546e0, InterfaceC0463Zb, InterfaceC0596gc, InterfaceC0501bc, InterfaceC0520cc, InterfaceC0426Xa {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final AbstractC0981a mActivityResultRegistry;
    private int mContentLayoutId;
    final C0419X3 mContextAwareHelper;
    private C1133q.b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final C0800r7 mFullyDrawnReporter;
    private final C1119h mLifecycleRegistry;
    private final C0481ab mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<InterfaceC0294Q3<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0294Q3<C0956zb>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0294Q3<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC0294Q3<C0862uc>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0294Q3<Integer>> mOnTrimMemoryListeners;
    final InterfaceExecutorC0971e mReportFullyDrawnExecutor;
    final C0196Kd mSavedStateRegistryController;
    private C0109Fg mViewModelStore;

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$a */
    public class C0967a extends AbstractC0981a {
        public C0967a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: androidx.activity.ComponentActivity */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // androidx.activity.result.AbstractC0981a
        /* JADX INFO: renamed from: b */
        public final void mo2279b(int i, AbstractC0433Y abstractC0433Y, Parcelable parcelable) {
            Bundle bundleExtra;
            int i2;
            ComponentActivity componentActivity = ComponentActivity.this;
            AbstractC0433Y.a aVarMo1078b = abstractC0433Y.mo1078b(componentActivity, parcelable);
            if (aVarMo1078b != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0977a(this, i, aVarMo1078b));
                return;
            }
            Intent intentMo1077a = abstractC0433Y.mo1077a(componentActivity, parcelable);
            if (intentMo1077a.getExtras() != null && intentMo1077a.getExtras().getClassLoader() == null) {
                intentMo1077a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentMo1077a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentMo1077a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentMo1077a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleExtra = null;
            }
            Bundle bundle = bundleExtra;
            if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo1077a.getAction())) {
                if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo1077a.getAction())) {
                    componentActivity.startActivityForResult(intentMo1077a, i, bundle);
                    return;
                }
                C0593g9 c0593g9 = (C0593g9) intentMo1077a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    i2 = i;
                } catch (IntentSender.SendIntentException e) {
                    e = e;
                    i2 = i;
                }
                try {
                    componentActivity.startIntentSenderForResult(c0593g9.f2202a, i2, c0593g9.f2203b, c0593g9.f2204c, c0593g9.f2205d, 0, bundle);
                    return;
                } catch (IntentSender.SendIntentException e2) {
                    e = e2;
                    new Handler(Looper.getMainLooper()).post(new RunnableC0978b(this, i2, e));
                    return;
                }
            }
            String[] stringArrayExtra = intentMo1077a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
                if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                    throw new IllegalArgumentException(C0944z.m2228h(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i3));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i4 = 0;
                for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                    if (!hashSet.contains(Integer.valueOf(i5))) {
                        strArr[i4] = stringArrayExtra[i5];
                        i4++;
                    }
                }
            }
            if (componentActivity instanceof InterfaceC0361U) {
                ((InterfaceC0361U) componentActivity).validateRequestPermissionsRequestCode(i);
            }
            C0343T.m940b(componentActivity, stringArrayExtra, i);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$b */
    public class RunnableC0968b implements Runnable {
        public RunnableC0968b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
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

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$c */
    public static class C0969c {
        /* JADX INFO: renamed from: a */
        public static OnBackInvokedDispatcher m2280a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$d */
    public static final class C0970d {

        /* JADX INFO: renamed from: a */
        public Object f3602a;

        /* JADX INFO: renamed from: b */
        public C0109Fg f3603b;
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$e */
    public interface InterfaceExecutorC0971e extends Executor {
        /* JADX INFO: renamed from: a */
        void mo2281a(View view);
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$f */
    public class ViewTreeObserverOnDrawListenerC0972f implements InterfaceExecutorC0971e, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: b */
        public Runnable f3605b;

        /* JADX INFO: renamed from: a */
        public final long f3604a = SystemClock.uptimeMillis() + 10000;

        /* JADX INFO: renamed from: c */
        public boolean f3606c = false;

        public ViewTreeObserverOnDrawListenerC0972f() {
        }

        @Override // androidx.activity.ComponentActivity.InterfaceExecutorC0971e
        /* JADX INFO: renamed from: a */
        public final void mo2281a(View view) {
            if (this.f3606c) {
                return;
            }
            this.f3606c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f3605b = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.f3606c) {
                decorView.postOnAnimation(new RunnableC0221M2(3, this));
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            boolean z;
            Runnable runnable = this.f3605b;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f3604a) {
                    this.f3606c = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f3605b = null;
            C0800r7 c0800r7 = ComponentActivity.this.mFullyDrawnReporter;
            synchronized (c0800r7.f3164a) {
                z = c0800r7.f3165b;
            }
            if (z) {
                this.f3606c = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ComponentActivity() {
        this.mContextAwareHelper = new C0419X3();
        this.mMenuHostHelper = new C0481ab(new RunnableC0221M2(2, this));
        this.mLifecycleRegistry = new C1119h(this);
        C0196Kd c0196Kd = new C0196Kd(this);
        this.mSavedStateRegistryController = c0196Kd;
        this.mOnBackPressedDispatcher = null;
        InterfaceExecutorC0971e interfaceExecutorC0971eCreateFullyDrawnExecutor = createFullyDrawnExecutor();
        this.mReportFullyDrawnExecutor = interfaceExecutorC0971eCreateFullyDrawnExecutor;
        this.mFullyDrawnReporter = new C0800r7(interfaceExecutorC0971eCreateFullyDrawnExecutor, new C0004A3(0, this));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new C0967a();
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
        getLifecycle().mo2592a(new InterfaceC1118g() { // from class: androidx.activity.ComponentActivity.2
            @Override // androidx.lifecycle.InterfaceC1118g
            /* JADX INFO: renamed from: a */
            public final void mo485a(InterfaceC0935y9 interfaceC0935y9, AbstractC1116e.a aVar) {
                if (aVar == AbstractC1116e.a.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        getLifecycle().mo2592a(new InterfaceC1118g() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.InterfaceC1118g
            /* JADX INFO: renamed from: a */
            public final void mo485a(InterfaceC0935y9 interfaceC0935y9, AbstractC1116e.a aVar) {
                if (aVar == AbstractC1116e.a.ON_DESTROY) {
                    ComponentActivity.this.mContextAwareHelper.f1584b = null;
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.getViewModelStore().m292a();
                    }
                    ViewTreeObserverOnDrawListenerC0972f viewTreeObserverOnDrawListenerC0972f = (ViewTreeObserverOnDrawListenerC0972f) ComponentActivity.this.mReportFullyDrawnExecutor;
                    ComponentActivity componentActivity = ComponentActivity.this;
                    componentActivity.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0972f);
                    componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0972f);
                }
            }
        });
        getLifecycle().mo2592a(new InterfaceC1118g() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.InterfaceC1118g
            /* JADX INFO: renamed from: a */
            public final void mo485a(InterfaceC0935y9 interfaceC0935y9, AbstractC1116e.a aVar) {
                ComponentActivity componentActivity = ComponentActivity.this;
                componentActivity.ensureViewModelStore();
                componentActivity.getLifecycle().mo2594c(this);
            }
        });
        c0196Kd.m545a();
        C1129n.m2611b(this);
        getSavedStateRegistry().m3009c(ACTIVITY_RESULT_TAG, new C0023B3(0, this));
        addOnContextAvailableListener(new C0042C3(this, 0));
    }

    private InterfaceExecutorC0971e createFullyDrawnExecutor() {
        return new ViewTreeObserverOnDrawListenerC0972f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C0413Wf lambda$new$0() {
        reportFullyDrawn();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle lambda$new$1() {
        Bundle bundle = new Bundle();
        AbstractC0981a abstractC0981a = this.mActivityResultRegistry;
        abstractC0981a.getClass();
        HashMap map = abstractC0981a.f3639b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC0981a.f3641d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) abstractC0981a.f3644g.clone());
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$2(Context context) {
        Bundle bundleM3007a = getSavedStateRegistry().m3007a(ACTIVITY_RESULT_TAG);
        if (bundleM3007a != null) {
            AbstractC0981a abstractC0981a = this.mActivityResultRegistry;
            abstractC0981a.getClass();
            ArrayList<Integer> integerArrayList = bundleM3007a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleM3007a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            abstractC0981a.f3641d = bundleM3007a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            Bundle bundle = bundleM3007a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = abstractC0981a.f3644g;
            bundle2.putAll(bundle);
            for (int i = 0; i < stringArrayList.size(); i++) {
                String str = stringArrayList.get(i);
                HashMap map = abstractC0981a.f3639b;
                boolean zContainsKey = map.containsKey(str);
                HashMap map2 = abstractC0981a.f3638a;
                if (zContainsKey) {
                    Integer num = (Integer) map.remove(str);
                    if (!bundle2.containsKey(str)) {
                        map2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.intValue();
                String str2 = stringArrayList.get(i);
                map2.put(num2, str2);
                map.put(str2, num2);
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo2281a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000a.InterfaceC0426Xa
    public void addMenuProvider(InterfaceC0595gb interfaceC0595gb) {
        C0481ab c0481ab = this.mMenuHostHelper;
        c0481ab.f1803b.add(interfaceC0595gb);
        c0481ab.f1802a.run();
    }

    @Override // p000a.InterfaceC0463Zb
    public final void addOnConfigurationChangedListener(InterfaceC0294Q3<Configuration> interfaceC0294Q3) {
        this.mOnConfigurationChangedListeners.add(interfaceC0294Q3);
    }

    public final void addOnContextAvailableListener(InterfaceC0482ac interfaceC0482ac) {
        C0419X3 c0419x3 = this.mContextAwareHelper;
        c0419x3.getClass();
        C0631i9.m1482e(interfaceC0482ac, "listener");
        ComponentActivity componentActivity = c0419x3.f1584b;
        if (componentActivity != null) {
            interfaceC0482ac.mo125a(componentActivity);
        }
        c0419x3.f1583a.add(interfaceC0482ac);
    }

    @Override // p000a.InterfaceC0501bc
    public final void addOnMultiWindowModeChangedListener(InterfaceC0294Q3<C0956zb> interfaceC0294Q3) {
        this.mOnMultiWindowModeChangedListeners.add(interfaceC0294Q3);
    }

    public final void addOnNewIntentListener(InterfaceC0294Q3<Intent> interfaceC0294Q3) {
        this.mOnNewIntentListeners.add(interfaceC0294Q3);
    }

    @Override // p000a.InterfaceC0520cc
    public final void addOnPictureInPictureModeChangedListener(InterfaceC0294Q3<C0862uc> interfaceC0294Q3) {
        this.mOnPictureInPictureModeChangedListeners.add(interfaceC0294Q3);
    }

    @Override // p000a.InterfaceC0596gc
    public final void addOnTrimMemoryListener(InterfaceC0294Q3<Integer> interfaceC0294Q3) {
        this.mOnTrimMemoryListeners.add(interfaceC0294Q3);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C0970d c0970d = (C0970d) getLastNonConfigurationInstance();
            if (c0970d != null) {
                this.mViewModelStore = c0970d.f3603b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new C0109Fg();
            }
        }
    }

    @Override // p000a.InterfaceC0546e0
    public final AbstractC0981a getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC1114c
    public AbstractC0005A4 getDefaultViewModelCreationExtras() {
        C0012Ab c0012Ab = new C0012Ab();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0012Ab.f29a;
        if (application != null) {
            linkedHashMap.put(C1131p.f4715a, getApplication());
        }
        linkedHashMap.put(C1129n.f4707a, this);
        linkedHashMap.put(C1129n.f4708b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(C1129n.f4709c, getIntent().getExtras());
        }
        return c0012Ab;
    }

    public C1133q.b getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new C1130o(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    public C0800r7 getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        C0970d c0970d = (C0970d) getLastNonConfigurationInstance();
        if (c0970d != null) {
            return c0970d.f3602a;
        }
        return null;
    }

    @Override // p000a.ActivityC0060D3, p000a.InterfaceC0935y9
    public AbstractC1116e getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // p000a.InterfaceC0445Yb
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new RunnableC0968b());
            getLifecycle().mo2592a(new InterfaceC1118g() { // from class: androidx.activity.ComponentActivity.6
                @Override // androidx.lifecycle.InterfaceC1118g
                /* JADX INFO: renamed from: a */
                public final void mo485a(InterfaceC0935y9 interfaceC0935y9, AbstractC1116e.a aVar) {
                    if (aVar != AbstractC1116e.a.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                        return;
                    }
                    OnBackPressedDispatcher onBackPressedDispatcher = ComponentActivity.this.mOnBackPressedDispatcher;
                    OnBackInvokedDispatcher onBackInvokedDispatcherM2280a = C0969c.m2280a((ComponentActivity) interfaceC0935y9);
                    onBackPressedDispatcher.getClass();
                    C0631i9.m1482e(onBackInvokedDispatcherM2280a, "invoker");
                    onBackPressedDispatcher.f3613e = onBackInvokedDispatcherM2280a;
                    onBackPressedDispatcher.m2284c(onBackPressedDispatcher.f3615g);
                }
            });
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // p000a.InterfaceC0214Ld
    public final C1224a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f663b;
    }

    @Override // p000a.InterfaceC0127Gg
    public C0109Fg getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void initializeViewTreeOwners() {
        C0235Mg.m628a(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        C0631i9.m1482e(decorView, "<this>");
        decorView.setTag(C1137R.id.view_tree_view_model_store_owner, this);
        C1225b.m3011a(getWindow().getDecorView(), this);
        C0979c.m2290a(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        C0631i9.m1482e(decorView2, "<this>");
        decorView2.setTag(C0976R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.mActivityResultRegistry.m2291a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().m2283b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC0294Q3<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo747a(configuration);
        }
    }

    @Override // p000a.ActivityC0060D3, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.m546b(bundle);
        C0419X3 c0419x3 = this.mContextAwareHelper;
        c0419x3.getClass();
        c0419x3.f1584b = this;
        Iterator it = c0419x3.f1583a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0482ac) it.next()).mo125a(this);
        }
        super.onCreate(bundle);
        int i = FragmentC1124l.f4699b;
        FragmentC1124l.a.m2607b(this);
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        C0481ab c0481ab = this.mMenuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<InterfaceC0595gb> it = c0481ab.f1803b.iterator();
        while (it.hasNext()) {
            it.next().mo1387a(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator<InterfaceC0595gb> it = this.mMenuHostHelper.f1803b.iterator();
            while (it.hasNext()) {
                if (it.next().mo1389c(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC0294Q3<C0956zb>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo747a(new C0956zb(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<InterfaceC0294Q3<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().mo747a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator<InterfaceC0595gb> it = this.mMenuHostHelper.f1803b.iterator();
        while (it.hasNext()) {
            it.next().mo1390d(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC0294Q3<C0862uc>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo747a(new C0862uc(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator<InterfaceC0595gb> it = this.mMenuHostHelper.f1803b.iterator();
        while (it.hasNext()) {
            it.next().mo1388b(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.m2291a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0970d c0970d;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C0109Fg c0109Fg = this.mViewModelStore;
        if (c0109Fg == null && (c0970d = (C0970d) getLastNonConfigurationInstance()) != null) {
            c0109Fg = c0970d.f3603b;
        }
        if (c0109Fg == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0970d c0970d2 = new C0970d();
        c0970d2.f3602a = objOnRetainCustomNonConfigurationInstance;
        c0970d2.f3603b = c0109Fg;
        return c0970d2;
    }

    @Override // p000a.ActivityC0060D3, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC1116e lifecycle = getLifecycle();
        if (lifecycle instanceof C1119h) {
            ((C1119h) lifecycle).m2600h(AbstractC1116e.b.f4674c);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m547c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<InterfaceC0294Q3<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().mo747a(Integer.valueOf(i));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f1584b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final <I, O> AbstractC0489b0<I> registerForActivityResult(AbstractC0433Y<I, O> abstractC0433Y, AbstractC0981a abstractC0981a, InterfaceC0415X<O> interfaceC0415X) {
        return abstractC0981a.m2292c("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, abstractC0433Y, interfaceC0415X);
    }

    @Override // p000a.InterfaceC0426Xa
    public void removeMenuProvider(InterfaceC0595gb interfaceC0595gb) {
        this.mMenuHostHelper.m1171a(interfaceC0595gb);
    }

    @Override // p000a.InterfaceC0463Zb
    public final void removeOnConfigurationChangedListener(InterfaceC0294Q3<Configuration> interfaceC0294Q3) {
        this.mOnConfigurationChangedListeners.remove(interfaceC0294Q3);
    }

    public final void removeOnContextAvailableListener(InterfaceC0482ac interfaceC0482ac) {
        C0419X3 c0419x3 = this.mContextAwareHelper;
        c0419x3.getClass();
        C0631i9.m1482e(interfaceC0482ac, "listener");
        c0419x3.f1583a.remove(interfaceC0482ac);
    }

    @Override // p000a.InterfaceC0501bc
    public final void removeOnMultiWindowModeChangedListener(InterfaceC0294Q3<C0956zb> interfaceC0294Q3) {
        this.mOnMultiWindowModeChangedListeners.remove(interfaceC0294Q3);
    }

    public final void removeOnNewIntentListener(InterfaceC0294Q3<Intent> interfaceC0294Q3) {
        this.mOnNewIntentListeners.remove(interfaceC0294Q3);
    }

    @Override // p000a.InterfaceC0520cc
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC0294Q3<C0862uc> interfaceC0294Q3) {
        this.mOnPictureInPictureModeChangedListeners.remove(interfaceC0294Q3);
    }

    @Override // p000a.InterfaceC0596gc
    public final void removeOnTrimMemoryListener(InterfaceC0294Q3<Integer> interfaceC0294Q3) {
        this.mOnTrimMemoryListeners.remove(interfaceC0294Q3);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C0960zf.m2249a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.m1859a();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo2281a(getWindow().getDecorView());
        super.setContentView(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            for (InterfaceC0294Q3<C0956zb> interfaceC0294Q3 : this.mOnMultiWindowModeChangedListeners) {
                C0631i9.m1482e(configuration, "newConfig");
                interfaceC0294Q3.mo747a(new C0956zb(z));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            for (InterfaceC0294Q3<C0862uc> interfaceC0294Q3 : this.mOnPictureInPictureModeChangedListeners) {
                C0631i9.m1482e(configuration, "newConfig");
                interfaceC0294Q3.mo747a(new C0862uc(z));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    public final <I, O> AbstractC0489b0<I> registerForActivityResult(AbstractC0433Y<I, O> abstractC0433Y, InterfaceC0415X<O> interfaceC0415X) {
        return registerForActivityResult(abstractC0433Y, this.mActivityResultRegistry, interfaceC0415X);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo2281a(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void addMenuProvider(final InterfaceC0595gb interfaceC0595gb, InterfaceC0935y9 interfaceC0935y9) {
        final C0481ab c0481ab = this.mMenuHostHelper;
        c0481ab.f1803b.add(interfaceC0595gb);
        c0481ab.f1802a.run();
        AbstractC1116e lifecycle = interfaceC0935y9.getLifecycle();
        HashMap map = c0481ab.f1804c;
        C0481ab.a aVar = (C0481ab.a) map.remove(interfaceC0595gb);
        if (aVar != null) {
            aVar.f1805a.mo2594c(aVar.f1806b);
            aVar.f1806b = null;
        }
        map.put(interfaceC0595gb, new C0481ab.a(lifecycle, new InterfaceC1118g() { // from class: a.Za
            @Override // androidx.lifecycle.InterfaceC1118g
            /* JADX INFO: renamed from: a */
            public final void mo485a(InterfaceC0935y9 interfaceC0935y92, AbstractC1116e.a aVar2) {
                AbstractC1116e.a aVar3 = AbstractC1116e.a.ON_DESTROY;
                C0481ab c0481ab2 = c0481ab;
                if (aVar2 == aVar3) {
                    c0481ab2.m1171a(interfaceC0595gb);
                } else {
                    c0481ab2.getClass();
                }
            }
        }));
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo2281a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(final InterfaceC0595gb interfaceC0595gb, InterfaceC0935y9 interfaceC0935y9, final AbstractC1116e.b bVar) {
        final C0481ab c0481ab = this.mMenuHostHelper;
        c0481ab.getClass();
        AbstractC1116e lifecycle = interfaceC0935y9.getLifecycle();
        HashMap map = c0481ab.f1804c;
        C0481ab.a aVar = (C0481ab.a) map.remove(interfaceC0595gb);
        if (aVar != null) {
            aVar.f1805a.mo2594c(aVar.f1806b);
            aVar.f1806b = null;
        }
        map.put(interfaceC0595gb, new C0481ab.a(lifecycle, new InterfaceC1118g() { // from class: a.Ya
            @Override // androidx.lifecycle.InterfaceC1118g
            /* JADX INFO: renamed from: a */
            public final void mo485a(InterfaceC0935y9 interfaceC0935y92, AbstractC1116e.a aVar2) {
                C0481ab c0481ab2 = c0481ab;
                c0481ab2.getClass();
                AbstractC1116e.a.Companion.getClass();
                AbstractC1116e.b bVar2 = bVar;
                C0631i9.m1482e(bVar2, "state");
                int iOrdinal = bVar2.ordinal();
                AbstractC1116e.a aVar3 = null;
                AbstractC1116e.a aVar4 = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : AbstractC1116e.a.ON_RESUME : AbstractC1116e.a.ON_START : AbstractC1116e.a.ON_CREATE;
                Runnable runnable = c0481ab2.f1802a;
                CopyOnWriteArrayList<InterfaceC0595gb> copyOnWriteArrayList = c0481ab2.f1803b;
                InterfaceC0595gb interfaceC0595gb2 = interfaceC0595gb;
                if (aVar2 == aVar4) {
                    copyOnWriteArrayList.add(interfaceC0595gb2);
                    runnable.run();
                    return;
                }
                AbstractC1116e.a aVar5 = AbstractC1116e.a.ON_DESTROY;
                if (aVar2 == aVar5) {
                    c0481ab2.m1171a(interfaceC0595gb2);
                    return;
                }
                int iOrdinal2 = bVar2.ordinal();
                if (iOrdinal2 == 2) {
                    aVar3 = aVar5;
                } else if (iOrdinal2 == 3) {
                    aVar3 = AbstractC1116e.a.ON_STOP;
                } else if (iOrdinal2 == 4) {
                    aVar3 = AbstractC1116e.a.ON_PAUSE;
                }
                if (aVar2 == aVar3) {
                    copyOnWriteArrayList.remove(interfaceC0595gb2);
                    runnable.run();
                }
            }
        }));
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }
}

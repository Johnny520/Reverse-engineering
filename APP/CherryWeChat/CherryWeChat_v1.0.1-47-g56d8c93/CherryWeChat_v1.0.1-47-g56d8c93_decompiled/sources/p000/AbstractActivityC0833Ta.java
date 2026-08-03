package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import io.github.cherrywechat.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: Ta */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0833Ta extends AbstractActivityC0790Sa implements InterfaceC2752yE, InterfaceC2420qk, InterfaceC2075ix {

    /* JADX INFO: renamed from: c */
    public final C0061Bb f2627c = new C0061Bb();

    /* JADX INFO: renamed from: d */
    public final C2656w4 f2628d;

    /* JADX INFO: renamed from: e */
    public final C2692wy f2629e;

    /* JADX INFO: renamed from: f */
    public C2709xE f2630f;

    /* JADX INFO: renamed from: g */
    public final ViewTreeObserverOnDrawListenerC0619Oa f2631g;

    /* JADX INFO: renamed from: h */
    public final C1251cA f2632h;

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f2633i;

    /* JADX INFO: renamed from: j */
    public final C0705Qa f2634j;

    /* JADX INFO: renamed from: k */
    public final CopyOnWriteArrayList f2635k;

    /* JADX INFO: renamed from: l */
    public final CopyOnWriteArrayList f2636l;

    /* JADX INFO: renamed from: m */
    public final CopyOnWriteArrayList f2637m;

    /* JADX INFO: renamed from: n */
    public final CopyOnWriteArrayList f2638n;

    /* JADX INFO: renamed from: o */
    public final CopyOnWriteArrayList f2639o;

    /* JADX INFO: renamed from: p */
    public final CopyOnWriteArrayList f2640p;

    /* JADX INFO: renamed from: q */
    public boolean f2641q;

    /* JADX INFO: renamed from: r */
    public boolean f2642r;

    /* JADX INFO: renamed from: s */
    public final C1251cA f2643s;

    /* JADX INFO: renamed from: t */
    public final C1251cA f2644t;

    public AbstractActivityC0833Ta() {
        AbstractActivityC2148ki abstractActivityC2148ki = (AbstractActivityC2148ki) this;
        this.f2628d = new C2656w4(new RunnableC0275Ga(abstractActivityC2148ki, 0));
        C2692wy c2692wy = new C2692wy((InterfaceC2075ix) this);
        this.f2629e = c2692wy;
        this.f2631g = new ViewTreeObserverOnDrawListenerC0619Oa(abstractActivityC2148ki);
        this.f2632h = new C1251cA(new C0747Ra(abstractActivityC2148ki, 2));
        this.f2633i = new AtomicInteger();
        this.f2634j = new C0705Qa(abstractActivityC2148ki);
        this.f2635k = new CopyOnWriteArrayList();
        this.f2636l = new CopyOnWriteArrayList();
        this.f2637m = new CopyOnWriteArrayList();
        this.f2638n = new CopyOnWriteArrayList();
        this.f2639o = new CopyOnWriteArrayList();
        this.f2640p = new CopyOnWriteArrayList();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().mo1555a(new C0318Ha(0, abstractActivityC2148ki));
        int i = 1;
        getLifecycle().mo1555a(new C0318Ha(i, abstractActivityC2148ki));
        getLifecycle().mo1555a(new C1297cv(i, abstractActivityC2148ki));
        c2692wy.m5268c();
        AbstractC0628Oj.m1246o(this);
        getSavedStateRegistry().m2898c("android:support:activity-result", new C0361Ia(0, abstractActivityC2148ki));
        int i2 = 0;
        addOnContextAvailableListener(new C0404Ja(abstractActivityC2148ki, i2));
        this.f2643s = new C1251cA(new C0747Ra(abstractActivityC2148ki, i2));
        this.f2644t = new C1251cA(new C0747Ra(abstractActivityC2148ki, 3));
    }

    public static final void access$ensureViewModelStore(AbstractActivityC0833Ta abstractActivityC0833Ta) {
        if (abstractActivityC0833Ta.f2630f == null) {
            C0533Ma c0533Ma = (C0533Ma) abstractActivityC0833Ta.getLastNonConfigurationInstance();
            if (c0533Ma != null) {
                abstractActivityC0833Ta.f2630f = c0533Ma.f1737b;
            }
            if (abstractActivityC0833Ta.f2630f == null) {
                abstractActivityC0833Ta.f2630f = new C2709xE();
            }
        }
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    public void addMenuProvider(InterfaceC0206Er interfaceC0206Er) {
        C2656w4 c2656w4 = this.f2628d;
        ((CopyOnWriteArrayList) c2656w4.f9198d).add(interfaceC0206Er);
        ((Runnable) c2656w4.f9197c).run();
    }

    public final void addOnConfigurationChangedListener(InterfaceC2583ub interfaceC2583ub) {
        this.f2635k.add(interfaceC2583ub);
    }

    public final void addOnContextAvailableListener(InterfaceC2386pt interfaceC2386pt) {
        C0061Bb c0061Bb = this.f2627c;
        if (((AbstractActivityC0833Ta) c0061Bb.f142b) != null) {
            interfaceC2386pt.mo838a();
        }
        ((CopyOnWriteArraySet) c0061Bb.f141a).add(interfaceC2386pt);
    }

    public final void addOnMultiWindowModeChangedListener(InterfaceC2583ub interfaceC2583ub) {
        this.f2638n.add(interfaceC2583ub);
    }

    public final void addOnNewIntentListener(InterfaceC2583ub interfaceC2583ub) {
        this.f2637m.add(interfaceC2583ub);
    }

    public final void addOnPictureInPictureModeChangedListener(InterfaceC2583ub interfaceC2583ub) {
        this.f2639o.add(interfaceC2583ub);
    }

    public final void addOnTrimMemoryListener(InterfaceC2583ub interfaceC2583ub) {
        this.f2636l.add(interfaceC2583ub);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        this.f2640p.add(runnable);
    }

    public final AbstractC1242c1 getActivityResultRegistry() {
        return this.f2634j;
    }

    @Override // p000.InterfaceC2420qk
    public AbstractC2189lc getDefaultViewModelCreationExtras() {
        C2557ts c2557ts = new C2557ts(0);
        if (getApplication() != null) {
            c2557ts.m5044a(C1456gf.f5169m, getApplication());
        }
        c2557ts.m5044a(AbstractC0628Oj.f2014h, this);
        c2557ts.m5044a(AbstractC0628Oj.f2015i, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            c2557ts.m5044a(AbstractC0628Oj.f2016j, extras);
        }
        return c2557ts;
    }

    public InterfaceC2666wE getDefaultViewModelProviderFactory() {
        return (InterfaceC2666wE) this.f2643s.getValue();
    }

    public C0713Qi getFullyDrawnReporter() {
        return (C0713Qi) this.f2632h.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        C0533Ma c0533Ma = (C0533Ma) getLastNonConfigurationInstance();
        if (c0533Ma != null) {
            return c0533Ma.f1736a;
        }
        return null;
    }

    @Override // p000.InterfaceC1061Yn
    public AbstractC0760Rn getLifecycle() {
        return this.f2490b;
    }

    public final C2335ot getOnBackPressedDispatcher() {
        return (C2335ot) this.f2644t.getValue();
    }

    @Override // p000.InterfaceC2075ix
    public final C1518hx getSavedStateRegistry() {
        return (C1518hx) this.f2629e.f9266d;
    }

    @Override // p000.InterfaceC2752yE
    public C2709xE getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f2630f == null) {
            C0533Ma c0533Ma = (C0533Ma) getLastNonConfigurationInstance();
            if (c0533Ma != null) {
                this.f2630f = c0533Ma.f1737b;
            }
            if (this.f2630f == null) {
                this.f2630f = new C2709xE();
            }
        }
        return this.f2630f;
    }

    public void initializeViewTreeOwners() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f2634j.m2363a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedDispatcher().m4742b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f2635k.iterator();
        while (it.hasNext()) {
            ((InterfaceC2583ub) it.next()).accept(configuration);
        }
    }

    @Override // p000.AbstractActivityC0790Sa, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f2629e.m5269d(bundle);
        C0061Bb c0061Bb = this.f2627c;
        c0061Bb.f142b = this;
        Iterator it = ((CopyOnWriteArraySet) c0061Bb.f141a).iterator();
        while (it.hasNext()) {
            ((InterfaceC2386pt) it.next()).mo838a();
        }
        super.onCreate(bundle);
        int i = FragmentC0983Wv.f3092b;
        AbstractC0897Uv.m1751b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f2628d.f9198d).iterator();
        while (it.hasNext()) {
            ((C2504si) ((InterfaceC0206Er) it.next())).f8791a.m5412j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f2628d.m5193B();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.f2641q) {
            return;
        }
        Iterator it = this.f2638n.iterator();
        while (it.hasNext()) {
            ((InterfaceC2583ub) it.next()).accept(new C2514ss(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f2637m.iterator();
        while (it.hasNext()) {
            ((InterfaceC2583ub) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f2628d.f9198d).iterator();
        while (it.hasNext()) {
            ((C2504si) ((InterfaceC0206Er) it.next())).f8791a.m5418p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.f2642r) {
            return;
        }
        Iterator it = this.f2639o.iterator();
        while (it.hasNext()) {
            ((InterfaceC2583ub) it.next()).accept(new C0638Ot(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f2628d.f9198d).iterator();
        while (it.hasNext()) {
            ((C2504si) ((InterfaceC0206Er) it.next())).f8791a.m5421s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f2634j.m2363a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0533Ma c0533Ma;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C2709xE c2709xE = this.f2630f;
        if (c2709xE == null && (c0533Ma = (C0533Ma) getLastNonConfigurationInstance()) != null) {
            c2709xE = c0533Ma.f1737b;
        }
        if (c2709xE == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0533Ma c0533Ma2 = new C0533Ma();
        c0533Ma2.f1736a = objOnRetainCustomNonConfigurationInstance;
        c0533Ma2.f1737b = c2709xE;
        return c0533Ma2;
    }

    @Override // p000.AbstractActivityC0790Sa, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (getLifecycle() instanceof C1185ao) {
            C1185ao c1185ao = (C1185ao) getLifecycle();
            c1185ao.m2275d("setCurrentState");
            c1185ao.m2277f(EnumC0675Pn.f2149c);
        }
        super.onSaveInstanceState(bundle);
        this.f2629e.m5270e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f2636l.iterator();
        while (it.hasNext()) {
            ((InterfaceC2583ub) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f2640p.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public Context peekAvailableContext() {
        return (AbstractActivityC0833Ta) this.f2627c.f142b;
    }

    public final <I, O> AbstractC0903V0 registerForActivityResult(final AbstractC0817T0 abstractC0817T0, final AbstractC1242c1 abstractC1242c1, final InterfaceC0731R0 interfaceC0731R0) {
        final String str = "activity_rq#" + this.f2633i.getAndIncrement();
        LinkedHashMap linkedHashMap = abstractC1242c1.f4222c;
        AbstractC0760Rn lifecycle = getLifecycle();
        C1185ao c1185ao = (C1185ao) lifecycle;
        if (c1185ao.f4064c.m1371a(EnumC0675Pn.f2150d)) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + c1185ao.f4064c + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        abstractC1242c1.m2365d(str);
        C1032Y0 c1032y0 = (C1032Y0) linkedHashMap.get(str);
        if (c1032y0 == null) {
            c1032y0 = new C1032Y0(lifecycle);
        }
        InterfaceC0889Un interfaceC0889Un = new InterfaceC0889Un() { // from class: W0
            @Override // p000.InterfaceC0889Un
            public final void onStateChanged(InterfaceC1061Yn interfaceC1061Yn, EnumC0632On enumC0632On) {
                AbstractC1242c1 abstractC1242c12 = abstractC1242c1;
                LinkedHashMap linkedHashMap2 = abstractC1242c12.f4224e;
                EnumC0632On enumC0632On2 = EnumC0632On.ON_START;
                String str2 = str;
                if (enumC0632On2 != enumC0632On) {
                    if (EnumC0632On.ON_STOP == enumC0632On) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (EnumC0632On.ON_DESTROY == enumC0632On) {
                            abstractC1242c12.m2366e(str2);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = abstractC1242c12.f4226g;
                LinkedHashMap linkedHashMap3 = abstractC1242c12.f4225f;
                AbstractC0817T0 abstractC0817T02 = abstractC0817T0;
                InterfaceC0731R0 interfaceC0731R02 = interfaceC0731R0;
                linkedHashMap2.put(str2, new C0989X0(abstractC0817T02, interfaceC0731R02));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    interfaceC0731R02.mo1524a(obj);
                }
                C0689Q0 c0689q0 = (C0689Q0) AbstractC0671Pj.m1353m(bundle, str2);
                if (c0689q0 != null) {
                    bundle.remove(str2);
                    interfaceC0731R02.mo1524a(abstractC0817T02.mo1622c(c0689q0.f2218b, c0689q0.f2217a));
                }
            }
        };
        c1032y0.f3301a.mo1555a(interfaceC0889Un);
        c1032y0.f3302b.add(interfaceC0889Un);
        linkedHashMap.put(str, c1032y0);
        return new C1119a1();
    }

    public void removeMenuProvider(InterfaceC0206Er interfaceC0206Er) {
        this.f2628d.m5196F(interfaceC0206Er);
    }

    public final void removeOnConfigurationChangedListener(InterfaceC2583ub interfaceC2583ub) {
        this.f2635k.remove(interfaceC2583ub);
    }

    public final void removeOnContextAvailableListener(InterfaceC2386pt interfaceC2386pt) {
        ((CopyOnWriteArraySet) this.f2627c.f141a).remove(interfaceC2386pt);
    }

    public final void removeOnMultiWindowModeChangedListener(InterfaceC2583ub interfaceC2583ub) {
        this.f2638n.remove(interfaceC2583ub);
    }

    public final void removeOnNewIntentListener(InterfaceC2583ub interfaceC2583ub) {
        this.f2637m.remove(interfaceC2583ub);
    }

    public final void removeOnPictureInPictureModeChangedListener(InterfaceC2583ub interfaceC2583ub) {
        this.f2639o.remove(interfaceC2583ub);
    }

    public final void removeOnTrimMemoryListener(InterfaceC2583ub interfaceC2583ub) {
        this.f2636l.remove(interfaceC2583ub);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        this.f2640p.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC0628Oj.m1226F()) {
                AbstractC0628Oj.m1239c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0713Qi fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f2291a) {
                try {
                    fullyDrawnReporter.f2292b = true;
                    Iterator it = fullyDrawnReporter.f2293c.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0884Ui) it.next()).mo6a();
                    }
                    fullyDrawnReporter.f2293c.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        View decorView = getWindow().getDecorView();
        ViewTreeObserverOnDrawListenerC0619Oa viewTreeObserverOnDrawListenerC0619Oa = this.f2631g;
        if (!viewTreeObserverOnDrawListenerC0619Oa.f1981c) {
            viewTreeObserverOnDrawListenerC0619Oa.f1981c = true;
            decorView.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC0619Oa);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void addMenuProvider(InterfaceC0206Er interfaceC0206Er, InterfaceC1061Yn interfaceC1061Yn) {
        C2656w4 c2656w4 = this.f2628d;
        ((CopyOnWriteArrayList) c2656w4.f9198d).add(interfaceC0206Er);
        ((Runnable) c2656w4.f9197c).run();
        AbstractC0760Rn lifecycle = interfaceC1061Yn.getLifecycle();
        HashMap map = (HashMap) c2656w4.f9196b;
        C2333or c2333or = (C2333or) map.remove(interfaceC0206Er);
        if (c2333or != null) {
            c2333or.f8194a.mo1556b(c2333or.f8195b);
            c2333or.f8195b = null;
        }
        map.put(interfaceC0206Er, new C2333or(lifecycle, new C0447Ka(1, c2656w4, interfaceC0206Er)));
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.f2641q = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f2641q = false;
            Iterator it = this.f2638n.iterator();
            while (it.hasNext()) {
                ((InterfaceC2583ub) it.next()).accept(new C2514ss(z));
            }
        } catch (Throwable th) {
            this.f2641q = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.f2642r = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f2642r = false;
            Iterator it = this.f2639o.iterator();
            while (it.hasNext()) {
                ((InterfaceC2583ub) it.next()).accept(new C0638Ot(z));
            }
        } catch (Throwable th) {
            this.f2642r = false;
            throw th;
        }
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(final InterfaceC0206Er interfaceC0206Er, InterfaceC1061Yn interfaceC1061Yn, final EnumC0675Pn enumC0675Pn) {
        final C2656w4 c2656w4 = this.f2628d;
        c2656w4.getClass();
        AbstractC0760Rn lifecycle = interfaceC1061Yn.getLifecycle();
        HashMap map = (HashMap) c2656w4.f9196b;
        C2333or c2333or = (C2333or) map.remove(interfaceC0206Er);
        if (c2333or != null) {
            c2333or.f8194a.mo1556b(c2333or.f8195b);
            c2333or.f8195b = null;
        }
        map.put(interfaceC0206Er, new C2333or(lifecycle, new InterfaceC0889Un() { // from class: nr
            @Override // p000.InterfaceC0889Un
            public final void onStateChanged(InterfaceC1061Yn interfaceC1061Yn2, EnumC0632On enumC0632On) {
                C2656w4 c2656w42 = c2656w4;
                c2656w42.getClass();
                Runnable runnable = (Runnable) c2656w42.f9197c;
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c2656w42.f9198d;
                EnumC0632On.Companion.getClass();
                EnumC0675Pn enumC0675Pn2 = enumC0675Pn;
                int iOrdinal = enumC0675Pn2.ordinal();
                EnumC0632On enumC0632On2 = null;
                EnumC0632On enumC0632On3 = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : EnumC0632On.ON_RESUME : EnumC0632On.ON_START : EnumC0632On.ON_CREATE;
                InterfaceC0206Er interfaceC0206Er2 = interfaceC0206Er;
                if (enumC0632On == enumC0632On3) {
                    copyOnWriteArrayList.add(interfaceC0206Er2);
                    runnable.run();
                    return;
                }
                EnumC0632On enumC0632On4 = EnumC0632On.ON_DESTROY;
                if (enumC0632On == enumC0632On4) {
                    c2656w42.m5196F(interfaceC0206Er2);
                    return;
                }
                int iOrdinal2 = enumC0675Pn2.ordinal();
                if (iOrdinal2 == 2) {
                    enumC0632On2 = enumC0632On4;
                } else if (iOrdinal2 == 3) {
                    enumC0632On2 = EnumC0632On.ON_STOP;
                } else if (iOrdinal2 == 4) {
                    enumC0632On2 = EnumC0632On.ON_PAUSE;
                }
                if (enumC0632On == enumC0632On2) {
                    copyOnWriteArrayList.remove(interfaceC0206Er2);
                    runnable.run();
                }
            }
        }));
    }

    public final <I, O> AbstractC0903V0 registerForActivityResult(AbstractC0817T0 abstractC0817T0, InterfaceC0731R0 interfaceC0731R0) {
        return registerForActivityResult(abstractC0817T0, this.f2634j, interfaceC0731R0);
    }
}

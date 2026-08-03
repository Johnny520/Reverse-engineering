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
    public final C0061Bb f2627c;

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
        this.f2627c = new C0061Bb();
        AbstractActivityC2148ki r2 = (AbstractActivityC2148ki) this;
        this.f2628d = new C2656w4(new RunnableC0275Ga(r2, 0));
        C2692wy r0 = new C2692wy(this);
        this.f2629e = r0;
        this.f2631g = new ViewTreeObserverOnDrawListenerC0619Oa(r2);
        this.f2632h = new C1251cA(new C0747Ra(r2, 2));
        this.f2633i = new AtomicInteger();
        this.f2634j = new C0705Qa(r2);
        this.f2635k = new CopyOnWriteArrayList();
        this.f2636l = new CopyOnWriteArrayList();
        this.f2637m = new CopyOnWriteArrayList();
        this.f2638n = new CopyOnWriteArrayList();
        this.f2639o = new CopyOnWriteArrayList();
        this.f2640p = new CopyOnWriteArrayList();
        if (getLifecycle() == null) goto L7;
        getLifecycle().mo1555a(new C0318Ha(0, r2));
        int r4 = 1;
        getLifecycle().mo1555a(new C0318Ha(r4, r2));
        getLifecycle().mo1555a(new C1297cv(r4, r2));
        r0.m5268c();
        AbstractC0628Oj.m1246o(this);
        getSavedStateRegistry().m2898c("android:support:activity-result", new C0361Ia(0, r2));
        int r1 = 0;
        addOnContextAvailableListener(new C0404Ja(r2, r1));
        this.f2643s = new C1251cA(new C0747Ra(r2, r1));
        this.f2644t = new C1251cA(new C0747Ra(r2, 3));
        return;
    L7:
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public static final void access$addObserverForBackInvoker(AbstractActivityC0833Ta r3, C2335ot r4) {
        r3.getLifecycle().mo1555a(new C0447Ka(0, r4, r3));
    }

    public static final void access$ensureViewModelStore(AbstractActivityC0833Ta r1) {
        if (r1.f2630f != null) goto L11;
        C0533Ma r0 = (C0533Ma) r1.getLastNonConfigurationInstance();
        if (r0 == null) goto L8;
        r1.f2630f = r0.f1737b;
    L8:
        if (r1.f2630f != null) goto L12;
        r1.f2630f = new C2709xE();
        return;
    L12:
        return;
    }

    public static final /* synthetic */ InterfaceExecutorC0576Na access$getReportFullyDrawnExecutor$p(AbstractActivityC0833Ta r0) {
        return r0.f2631g;
    }

    public static final /* synthetic */ void access$onBackPressed$s1027565324(AbstractActivityC0833Ta r0) {
        super.onBackPressed();
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    public void addMenuProvider(InterfaceC0206Er r3) {
        C2656w4 r0 = this.f2628d;
        ((CopyOnWriteArrayList) r0.f9198d).add(r3);
        ((Runnable) r0.f9197c).run();
    }

    public final void addOnConfigurationChangedListener(InterfaceC2583ub r2) {
        this.f2635k.add(r2);
    }

    public final void addOnContextAvailableListener(InterfaceC2386pt r3) {
        C0061Bb r0 = this.f2627c;
        if (((AbstractActivityC0833Ta) r0.f142b) == null) goto L5;
        r3.mo838a();
    L5:
        ((CopyOnWriteArraySet) r0.f141a).add(r3);
    }

    public final void addOnMultiWindowModeChangedListener(InterfaceC2583ub r2) {
        this.f2638n.add(r2);
    }

    public final void addOnNewIntentListener(InterfaceC2583ub r2) {
        this.f2637m.add(r2);
    }

    public final void addOnPictureInPictureModeChangedListener(InterfaceC2583ub r2) {
        this.f2639o.add(r2);
    }

    public final void addOnTrimMemoryListener(InterfaceC2583ub r2) {
        this.f2636l.add(r2);
    }

    public final void addOnUserLeaveHintListener(Runnable r2) {
        this.f2640p.add(r2);
    }

    public final AbstractC1242c1 getActivityResultRegistry() {
        return this.f2634j;
    }

    @Override // p000.InterfaceC2420qk
    public AbstractC2189lc getDefaultViewModelCreationExtras() {
        C2557ts r0 = new C2557ts(0);
        if (getApplication() == null) goto L5;
        r0.m5044a(C1456gf.f5169m, getApplication());
    L5:
        r0.m5044a(AbstractC0628Oj.f2014h, this);
        r0.m5044a(AbstractC0628Oj.f2015i, this);
        Intent r1 = getIntent();
        if (r1 == null) goto L8;
        Bundle r12 = r1.getExtras();
    L9:
        if (r12 == null) goto L11;
        r0.m5044a(AbstractC0628Oj.f2016j, r12);
    L11:
        return r0;
    L8:
        r12 = null;
        goto L9
    }

    public InterfaceC2666wE getDefaultViewModelProviderFactory() {
        return (InterfaceC2666wE) this.f2643s.getValue();
    }

    public C0713Qi getFullyDrawnReporter() {
        return (C0713Qi) this.f2632h.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        C0533Ma r0 = (C0533Ma) getLastNonConfigurationInstance();
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f1736a;
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
        if (getApplication() == null) goto L15;
        if (this.f2630f != null) goto L13;
        C0533Ma r0 = (C0533Ma) getLastNonConfigurationInstance();
        if (r0 == null) goto L10;
        this.f2630f = r0.f1737b;
    L10:
        if (this.f2630f != null) goto L13;
        this.f2630f = new C2709xE();
    L13:
        return this.f2630f;
    L15:
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
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
    public void onActivityResult(int r2, int r3, Intent r4) {
        if (this.f2634j.m2363a(r2, r3, r4) == true) goto L6;
        super.onActivityResult(r2, r3, r4);
        return;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedDispatcher().m4742b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration r3) {
        super.onConfigurationChanged(r3);
        Iterator r0 = this.f2635k.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((InterfaceC2583ub) r0.next()).accept(r3);
        goto L4
    }

    @Override // p000.AbstractActivityC0790Sa, android.app.Activity
    public void onCreate(Bundle r3) {
        this.f2629e.m5269d(r3);
        C0061Bb r0 = this.f2627c;
        r0.f142b = this;
        Iterator r02 = ((CopyOnWriteArraySet) r0.f141a).iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((InterfaceC2386pt) r02.next()).mo838a();
        goto L4
    L6:
        super.onCreate(r3);
        int r32 = FragmentC0983Wv.f3092b;
        AbstractC0897Uv.m1751b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int r1, Menu r2) {
        if (r1 != 0) goto L7;
        super.onCreatePanelMenu(r1, r2);
        getMenuInflater();
        Iterator r12 = ((CopyOnWriteArrayList) this.f2628d.f9198d).iterator();
    L5:
        if (r12.hasNext() == false) goto L10;
        ((C2504si) ((InterfaceC0206Er) r12.next())).f8791a.m5412j();
        goto L5
    L10:
        return true;
    L7:
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r1, MenuItem r2) {
        if (super.onMenuItemSelected(r1, r2) == false) goto L6;
        return true;
    L6:
        if (r1 == 0) goto L8;
        return false;
    L8:
        return this.f2628d.m5193B();
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean r4) {
        if (this.f2641q == true) goto L9;
        Iterator r0 = this.f2638n.iterator();
    L7:
        if (r0.hasNext() == false) goto L11;
        ((InterfaceC2583ub) r0.next()).accept(new C2514ss(r4));
        goto L7
    L11:
        return;
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent r3) {
        super.onNewIntent(r3);
        Iterator r0 = this.f2637m.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((InterfaceC2583ub) r0.next()).accept(r3);
        goto L4
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r3, Menu r4) {
        Iterator r0 = ((CopyOnWriteArrayList) this.f2628d.f9198d).iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((C2504si) ((InterfaceC0206Er) r0.next())).f8791a.m5418p();
        goto L4
    L6:
        super.onPanelClosed(r3, r4);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean r4) {
        if (this.f2642r == true) goto L9;
        Iterator r0 = this.f2639o.iterator();
    L7:
        if (r0.hasNext() == false) goto L11;
        ((InterfaceC2583ub) r0.next()).accept(new C0638Ot(r4));
        goto L7
    L11:
        return;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int r1, View r2, Menu r3) {
        if (r1 != 0) goto L7;
        super.onPreparePanel(r1, r2, r3);
        Iterator r12 = ((CopyOnWriteArrayList) this.f2628d.f9198d).iterator();
    L5:
        if (r12.hasNext() == false) goto L10;
        ((C2504si) ((InterfaceC0206Er) r12.next())).f8791a.m5421s();
        goto L5
    L10:
        return true;
    L7:
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int r4, String[] r5, int[] r6) {
        Intent r0 = new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", r5).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", r6);
        if (this.f2634j.m2363a(r4, -1, r0) == true) goto L6;
        super.onRequestPermissionsResult(r4, r5, r6);
        return;
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        Object r0 = onRetainCustomNonConfigurationInstance();
        C2709xE r1 = this.f2630f;
        if (r1 != null) goto L7;
        C0533Ma r2 = (C0533Ma) getLastNonConfigurationInstance();
        if (r2 == null) goto L7;
        r1 = r2.f1737b;
    L7:
        if (r1 != null) goto L11;
        if (r0 != null) goto L11;
        return null;
    L11:
        C0533Ma r22 = new C0533Ma();
        r22.f1736a = r0;
        r22.f1737b = r1;
        return r22;
    }

    @Override // p000.AbstractActivityC0790Sa, android.app.Activity
    public void onSaveInstanceState(Bundle r3) {
        if ((getLifecycle() instanceof C1185ao) == false) goto L5;
        C1185ao r0 = (C1185ao) getLifecycle();
        r0.m2275d("setCurrentState");
        r0.m2277f(EnumC0675Pn.f2149c);
    L5:
        super.onSaveInstanceState(r3);
        this.f2629e.m5270e(r3);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int r4) {
        super.onTrimMemory(r4);
        Iterator r0 = this.f2636l.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((InterfaceC2583ub) r0.next()).accept(Integer.valueOf(r4));
        goto L4
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator r0 = this.f2640p.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((Runnable) r0.next()).run();
        goto L4
    }

    public Context peekAvailableContext() {
        return (AbstractActivityC0833Ta) this.f2627c.f142b;
    }

    public final <I, O> AbstractC0903V0 registerForActivityResult(final AbstractC0817T0 r7, final AbstractC1242c1 r8, final InterfaceC0731R0 r9) {
        final String r0 = "activity_rq#" + this.f2633i.getAndIncrement();
        LinkedHashMap r1 = r8.f4222c;
        AbstractC0760Rn r2 = getLifecycle();
        C1185ao r3 = (C1185ao) r2;
        if (r3.f4064c.m1371a(EnumC0675Pn.f2150d) == true) goto L10;
        r8.m2365d(r0);
        C1032Y0 r32 = (C1032Y0) r1.get(r0);
        if (r32 != null) goto L7;
        r32 = new C1032Y0(r2);
    L7:
        InterfaceC0889Un r22 = new C0946W0(r8, r0, r9, r7);
        r32.f3301a.mo1555a(r22);
        r32.f3302b.add(r22);
        r1.put(r0, r32);
        return new C1119a1();
    L10:
        throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + r3.f4064c + ". LifecycleOwners must call register before they are STARTED.").toString());
    }

    public void removeMenuProvider(InterfaceC0206Er r2) {
        this.f2628d.m5196F(r2);
    }

    public final void removeOnConfigurationChangedListener(InterfaceC2583ub r2) {
        this.f2635k.remove(r2);
    }

    public final void removeOnContextAvailableListener(InterfaceC2386pt r2) {
        ((CopyOnWriteArraySet) this.f2627c.f141a).remove(r2);
    }

    public final void removeOnMultiWindowModeChangedListener(InterfaceC2583ub r2) {
        this.f2638n.remove(r2);
    }

    public final void removeOnNewIntentListener(InterfaceC2583ub r2) {
        this.f2637m.remove(r2);
    }

    public final void removeOnPictureInPictureModeChangedListener(InterfaceC2583ub r2) {
        this.f2639o.remove(r2);
    }

    public final void removeOnTrimMemoryListener(InterfaceC2583ub r2) {
        this.f2636l.remove(r2);
    }

    public final void removeOnUserLeaveHintListener(Runnable r2) {
        this.f2640p.remove(r2);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
    L5:
        th = move-exception;
        Trace.endSection();
        throw th;
    L3:
        if (AbstractC0628Oj.m1226F() == false) goto L7;
        AbstractC0628Oj.m1239c("reportFullyDrawn() for ComponentActivity");     // Catch: Throwable -> L5
    L7:
        super.reportFullyDrawn();     // Catch: Throwable -> L5
        C0713Qi r0 = getFullyDrawnReporter();     // Catch: Throwable -> L5
        Object r1 = r0.f2291a;     // Catch: Throwable -> L5
        monitor-enter(r1);     // Catch: Throwable -> L5
        r0.f2292b = true;     // Catch: Throwable -> L14
        Iterator r2 = r0.f2293c.iterator();     // Catch: Throwable -> L14
    L12:
        if (r2.hasNext() == false) goto L16;
        ((InterfaceC0884Ui) r2.next()).mo6a();     // Catch: Throwable -> L14
        goto L12
    L16:
        r0.f2293c.clear();     // Catch: Throwable -> L14
        monitor-exit(r1);     // Catch: Throwable -> L5
        Trace.endSection();
        return;
    L14:
        th = move-exception;
        throw th;     // Catch: Throwable -> L5
    }

    @Override // android.app.Activity
    public void setContentView(View r4) {
        initializeViewTreeOwners();
        View r0 = getWindow().getDecorView();
        ViewTreeObserverOnDrawListenerC0619Oa r1 = this.f2631g;
        if (r1.f1981c == true) goto L5;
        r1.f1981c = true;
        r0.getViewTreeObserver().addOnDrawListener(r1);
    L5:
        super.setContentView(r4);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent r1, int r2) {
        super.startActivityForResult(r1, r2);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender r1, int r2, Intent r3, int r4, int r5, int r6) {
        super.startIntentSenderForResult(r1, r2, r3, r4, r5, r6);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent r1, int r2, Bundle r3) {
        super.startActivityForResult(r1, r2, r3);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender r1, int r2, Intent r3, int r4, int r5, int r6, Bundle r7) {
        super.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7);
    }

    public void addMenuProvider(InterfaceC0206Er r6, InterfaceC1061Yn r7) {
        C2656w4 r0 = this.f2628d;
        ((CopyOnWriteArrayList) r0.f9198d).add(r6);
        ((Runnable) r0.f9197c).run();
        AbstractC0760Rn r72 = r7.getLifecycle();
        HashMap r1 = (HashMap) r0.f9196b;
        C2333or r2 = (C2333or) r1.remove(r6);
        if (r2 == null) goto L5;
        r2.f8194a.mo1556b(r2.f8195b);
        r2.f8195b = null;
    L5:
        r1.put(r6, new C2333or(r72, new C0447Ka(1, r0, r6)));
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean r3, Configuration r4) {
        this.f2641q = true;
        super.onMultiWindowModeChanged(r3, r4);     // Catch: Throwable -> L9
        this.f2641q = false;
        Iterator r42 = this.f2638n.iterator();
    L6:
        if (r42.hasNext() == false) goto L8;
        ((InterfaceC2583ub) r42.next()).accept(new C2514ss(r3));
        goto L6
    L8:
        return;
    L9:
        th = move-exception;
        this.f2641q = false;
        throw th;
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean r3, Configuration r4) {
        this.f2642r = true;
        super.onPictureInPictureModeChanged(r3, r4);     // Catch: Throwable -> L9
        this.f2642r = false;
        Iterator r42 = this.f2639o.iterator();
    L6:
        if (r42.hasNext() == false) goto L8;
        ((InterfaceC2583ub) r42.next()).accept(new C0638Ot(r3));
        goto L6
    L8:
        return;
    L9:
        th = move-exception;
        this.f2642r = false;
        throw th;
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(final InterfaceC0206Er r6, InterfaceC1061Yn r7, final EnumC0675Pn r8) {
        final C2656w4 r0 = this.f2628d;
        r0.getClass();
        AbstractC0760Rn r72 = r7.getLifecycle();
        HashMap r1 = (HashMap) r0.f9196b;
        C2333or r2 = (C2333or) r1.remove(r6);
        if (r2 == null) goto L5;
        r2.f8194a.mo1556b(r2.f8195b);
        r2.f8195b = null;
    L5:
        r1.put(r6, new C2333or(r72, new C2290nr(r0, r8, r6)));
    }

    public final <I, O> AbstractC0903V0 registerForActivityResult(AbstractC0817T0 r2, InterfaceC0731R0 r3) {
        return registerForActivityResult(r2, this.f2634j, r3);
    }
}

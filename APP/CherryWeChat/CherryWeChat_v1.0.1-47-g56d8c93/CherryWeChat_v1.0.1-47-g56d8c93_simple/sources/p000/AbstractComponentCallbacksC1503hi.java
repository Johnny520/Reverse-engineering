package p000;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: hi */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC1503hi implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1061Yn, InterfaceC2752yE, InterfaceC2420qk, InterfaceC2075ix {

    /* JADX INFO: renamed from: S */
    public static final Object f5291S = null;

    /* JADX INFO: renamed from: A */
    public boolean f5292A;

    /* JADX INFO: renamed from: B */
    public boolean f5293B;

    /* JADX INFO: renamed from: C */
    public boolean f5294C;

    /* JADX INFO: renamed from: D */
    public ViewGroup f5295D;

    /* JADX INFO: renamed from: E */
    public View f5296E;

    /* JADX INFO: renamed from: F */
    public boolean f5297F;

    /* JADX INFO: renamed from: G */
    public boolean f5298G;

    /* JADX INFO: renamed from: H */
    public C1415fi f5299H;

    /* JADX INFO: renamed from: I */
    public boolean f5300I;

    /* JADX INFO: renamed from: J */
    public boolean f5301J;

    /* JADX INFO: renamed from: K */
    public String f5302K;

    /* JADX INFO: renamed from: L */
    public EnumC0675Pn f5303L;

    /* JADX INFO: renamed from: M */
    public C1185ao f5304M;

    /* JADX INFO: renamed from: N */
    public C0498Li f5305N;

    /* JADX INFO: renamed from: O */
    public final C2600us f5306O;

    /* JADX INFO: renamed from: P */
    public C2692wy f5307P;

    /* JADX INFO: renamed from: Q */
    public final ArrayList f5308Q;

    /* JADX INFO: renamed from: R */
    public final C1328di f5309R;

    /* JADX INFO: renamed from: a */
    public int f5310a;

    /* JADX INFO: renamed from: b */
    public Bundle f5311b;

    /* JADX INFO: renamed from: c */
    public SparseArray f5312c;

    /* JADX INFO: renamed from: d */
    public Bundle f5313d;

    /* JADX INFO: renamed from: e */
    public String f5314e;

    /* JADX INFO: renamed from: f */
    public Bundle f5315f;

    /* JADX INFO: renamed from: g */
    public AbstractComponentCallbacksC1503hi f5316g;

    /* JADX INFO: renamed from: h */
    public String f5317h;

    /* JADX INFO: renamed from: i */
    public int f5318i;

    /* JADX INFO: renamed from: j */
    public Boolean f5319j;

    /* JADX INFO: renamed from: k */
    public boolean f5320k;

    /* JADX INFO: renamed from: l */
    public boolean f5321l;

    /* JADX INFO: renamed from: m */
    public boolean f5322m;

    /* JADX INFO: renamed from: n */
    public boolean f5323n;

    /* JADX INFO: renamed from: o */
    public boolean f5324o;

    /* JADX INFO: renamed from: p */
    public boolean f5325p;

    /* JADX INFO: renamed from: q */
    public int f5326q;

    /* JADX INFO: renamed from: r */
    public AbstractC2805zi f5327r;

    /* JADX INFO: renamed from: s */
    public C2104ji f5328s;

    /* JADX INFO: renamed from: t */
    public C0025Ai f5329t;

    /* JADX INFO: renamed from: u */
    public AbstractComponentCallbacksC1503hi f5330u;

    /* JADX INFO: renamed from: v */
    public int f5331v;

    /* JADX INFO: renamed from: w */
    public int f5332w;

    /* JADX INFO: renamed from: x */
    public String f5333x;

    /* JADX INFO: renamed from: y */
    public boolean f5334y;

    /* JADX INFO: renamed from: z */
    public boolean f5335z;

    static {
        f5291S = new Object();
    }

    public AbstractComponentCallbacksC1503hi() {
        this.f5310a = -1;
        this.f5314e = UUID.randomUUID().toString();
        this.f5317h = null;
        this.f5319j = null;
        this.f5329t = new C0025Ai();
        this.f5293B = true;
        this.f5298G = true;
        new RunnableC0431K0(7, this);
        this.f5303L = EnumC0675Pn.f2151e;
        this.f5306O = new C2600us();
        new AtomicInteger();
        this.f5308Q = new ArrayList();
        this.f5309R = new C1328di(this);
        m2873g();
    }

    /* JADX INFO: renamed from: A */
    public final void m2866A(int r2, int r3, int r4, int r5) {
        if (this.f5299H != null) goto L9;
        if (r2 != 0) goto L9;
        if (r3 != 0) goto L9;
        if (r4 != 0) goto L9;
        if (r5 != 0) goto L9;
        return;
    L9:
        m2868b().f4998b = r2;
        m2868b().f4999c = r3;
        m2868b().f5000d = r4;
        m2868b().f5001e = r5;
    }

    /* JADX INFO: renamed from: B */
    public final void m2867B(Bundle r2) {
        AbstractC2805zi r0 = this.f5327r;
        if (r0 == null) goto L11;
        if (r0 != null) goto L6;
        boolean r02 = false;
    L7:
        if (r02 == false) goto L11;
        throw new IllegalStateException("Fragment already added and state has been saved");
    L6:
        r02 = r0.m5385L();
    L11:
        this.f5315f = r2;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC0828TB mo897a() {
        return new C1371ei(this);
    }

    /* JADX INFO: renamed from: b */
    public final C1415fi m2868b() {
        if (this.f5299H != null) goto L6;
        C1415fi r0 = new C1415fi();
        Object r1 = f5291S;
        r0.f5003g = r1;
        r0.f5004h = r1;
        r0.f5005i = r1;
        r0.f5006j = 1.0f;
        r0.f5007k = null;
        this.f5299H = r0;
    L6:
        return this.f5299H;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC2805zi m2869c() {
        if (this.f5328s == null) goto L7;
        return this.f5329t;
    L7:
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* JADX INFO: renamed from: d */
    public final Context m2870d() {
        C2104ji r0 = this.f5328s;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.f7401m;
    }

    /* JADX INFO: renamed from: e */
    public final int m2871e() {
        EnumC0675Pn r0 = this.f5303L;
        if (r0 == EnumC0675Pn.f2148b) goto L10;
        if (this.f5330u == null) goto L10;
        return Math.min(r0.ordinal(), this.f5330u.m2871e());
    L10:
        return r0.ordinal();
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC2805zi m2872f() {
        AbstractC2805zi r0 = this.f5327r;
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* JADX INFO: renamed from: g */
    public final void m2873g() {
        this.f5304M = new C1185ao(this);
        this.f5307P = new C2692wy(this);
        ArrayList r0 = this.f5308Q;
        C1328di r1 = this.f5309R;
        if (r0.contains(r1) == false) goto L5;
        return;
    L5:
        if (this.f5310a < 0) goto L12;
        AbstractComponentCallbacksC1503hi r02 = r1.f4804a;
        r02.f5307P.m5268c();
        AbstractC0628Oj.m1246o(r02);
        Bundle r12 = r02.f5311b;
        if (r12 == null) goto L9;
        Bundle r13 = r12.getBundle("registryState");
    L10:
        r02.f5307P.m5269d(r13);
        return;
    L9:
        r13 = null;
        goto L10
    L12:
        r0.add(r1);
    }

    @Override // p000.InterfaceC2420qk
    public final AbstractC2189lc getDefaultViewModelCreationExtras() {
        Context r0 = m2878y().getApplicationContext();
    L4:
        if ((r0 instanceof ContextWrapper) == false) goto L9;
        if ((r0 instanceof Application) == true) goto L7;
        r0 = ((ContextWrapper) r0).getBaseContext();
        goto L4
    L7:
        Application r02 = (Application) r0;
    L10:
        if (r02 == null) goto L12;
    L14:
        C2557ts r1 = new C2557ts(0);
        if (r02 == null) goto L17;
        r1.m5044a(C1456gf.f5169m, r02);
    L17:
        r1.m5044a(AbstractC0628Oj.f2014h, this);
        r1.m5044a(AbstractC0628Oj.f2015i, this);
        Bundle r03 = this.f5315f;
        if (r03 == null) goto L20;
        r1.m5044a(AbstractC0628Oj.f2016j, r03);
    L20:
        return r1;
    L12:
        if (AbstractC2805zi.m5374G(3) == false) goto L14;
        Objects.toString(m2878y().getApplicationContext());
        goto L14
    L9:
        r02 = null;
        goto L10
    }

    @Override // p000.InterfaceC1061Yn
    public final AbstractC0760Rn getLifecycle() {
        return this.f5304M;
    }

    @Override // p000.InterfaceC2075ix
    public final C1518hx getSavedStateRegistry() {
        return (C1518hx) this.f5307P.f9266d;
    }

    @Override // p000.InterfaceC2752yE
    public final C2709xE getViewModelStore() {
        if (this.f5327r == null) goto L13;
        if (m2871e() == 1) goto L11;
        HashMap r0 = this.f5327r.f9490M.f415f;
        C2709xE r1 = (C2709xE) r0.get(this.f5314e);
        if (r1 != null) goto L14;
        C2709xE r12 = new C2709xE();
        r0.put(this.f5314e, r12);
        return r12;
    L14:
        return r1;
    L11:
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    L13:
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* JADX INFO: renamed from: h */
    public final void m2874h() {
        m2873g();
        this.f5302K = this.f5314e;
        this.f5314e = UUID.randomUUID().toString();
        this.f5320k = false;
        this.f5321l = false;
        this.f5322m = false;
        this.f5323n = false;
        this.f5324o = false;
        this.f5326q = 0;
        this.f5327r = null;
        this.f5329t = new C0025Ai();
        this.f5328s = null;
        this.f5331v = 0;
        this.f5332w = 0;
        this.f5333x = null;
        this.f5334y = false;
        this.f5335z = false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2875i() {
        if (this.f5328s != null) goto L5;
        return false;
    L5:
        if (this.f5320k == false) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2876j() {
        if (this.f5334y == true) goto L13;
        AbstractC2805zi r0 = this.f5327r;
        if (r0 == null) goto L12;
        AbstractComponentCallbacksC1503hi r2 = this.f5330u;
        r0.getClass();
        if (r2 != null) goto L9;
        boolean r02 = false;
    L10:
        if (r02 == false) goto L12;
        return true;
    L9:
        r02 = r2.m2876j();
    L12:
        return false;
    L13:
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2877k() {
        if (this.f5326q <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: l */
    public void mo898l() {
        this.f5294C = true;
    }

    /* JADX INFO: renamed from: m */
    public void mo899m(Context r2) {
        this.f5294C = true;
        C2104ji r0 = this.f5328s;
        if (r0 != null) goto L5;
        AbstractActivityC1244c3 r02 = null;
    L6:
        if (r02 == null) goto L9;
        this.f5294C = true;
        return;
    L9:
        return;
    L5:
        r02 = r0.f7400l;
        goto L6
    }

    /* JADX INFO: renamed from: n */
    public void mo900n(Bundle r4) {
        this.f5294C = true;
        Bundle r0 = this.f5311b;
        if (r0 == null) goto L7;
        Bundle r02 = r0.getBundle("childFragmentManager");
        if (r02 == null) goto L7;
        this.f5329t.m5393T(r02);
        C0025Ai r03 = this.f5329t;
        r03.f9483F = false;
        r03.f9484G = false;
        r03.f9490M.f418i = false;
        r03.m5422t(1);
    L7:
        C0025Ai r04 = this.f5329t;
        if (r04.f9511t < 1) goto L10;
        return;
    L10:
        r04.f9483F = false;
        r04.f9484G = false;
        r04.f9490M.f418i = false;
        r04.m5422t(1);
    }

    /* JADX INFO: renamed from: o */
    public View mo1043o(LayoutInflater r1, ViewGroup r2) {
        return null;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration r1) {
        this.f5294C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu r2, View r3, ContextMenu.ContextMenuInfo r4) {
        C2104ji r0 = this.f5328s;
        if (r0 != null) goto L5;
        AbstractActivityC1244c3 r02 = null;
    L6:
        if (r02 == null) goto L10;
        r02.onCreateContextMenu(r2, r3, r4);
        return;
    L10:
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    L5:
        r02 = r0.f7400l;
        goto L6
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f5294C = true;
    }

    /* JADX INFO: renamed from: p */
    public void mo901p() {
        this.f5294C = true;
    }

    /* JADX INFO: renamed from: q */
    public void mo902q() {
        this.f5294C = true;
    }

    /* JADX INFO: renamed from: r */
    public LayoutInflater mo903r(Bundle r2) {
        C2104ji r22 = this.f5328s;
        if (r22 == null) goto L7;
        AbstractActivityC1244c3 r23 = r22.f7404p;
        LayoutInflater r24 = r23.getLayoutInflater().cloneInContext(r23);
        r24.setFactory2(this.f5329t.f9497f);
        return r24;
    L7:
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* JADX INFO: renamed from: s */
    public void mo1177s() {
        this.f5294C = true;
    }

    /* JADX INFO: renamed from: t */
    public void mo904t(Bundle r1) {
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder(128);
        r0.append(getClass().getSimpleName());
        r0.append("{");
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append("} (");
        r0.append(this.f5314e);
        if (this.f5331v == 0) goto L6;
        r0.append(" id=0x");
        r0.append(Integer.toHexString(this.f5331v));
    L6:
        if (this.f5333x == null) goto L8;
        r0.append(" tag=");
        r0.append(this.f5333x);
    L8:
        r0.append(")");
        return r0.toString();
    }

    /* JADX INFO: renamed from: u */
    public void mo905u() {
        this.f5294C = true;
    }

    /* JADX INFO: renamed from: v */
    public void mo906v() {
        this.f5294C = true;
    }

    /* JADX INFO: renamed from: w */
    public void mo907w(Bundle r1) {
        this.f5294C = true;
    }

    /* JADX INFO: renamed from: x */
    public void mo908x(LayoutInflater r4, ViewGroup r5, Bundle r6) {
        this.f5329t.m5387N();
        this.f5325p = true;
        this.f5305N = new C0498Li(this, getViewModelStore(), new RunnableC0562N2(13, this));
        View r42 = mo1043o(r4, r5);
        this.f5296E = r42;
        if (r42 == null) goto L10;
        this.f5305N.m962b();
        if (AbstractC2805zi.m5374G(3) == false) goto L7;
        Objects.toString(this.f5296E);
        toString();
    L7:
        this.f5296E.setTag(R.id.view_tree_lifecycle_owner, this.f5305N);
        this.f5296E.setTag(R.id.view_tree_view_model_store_owner, this.f5305N);
        this.f5296E.setTag(R.id.view_tree_saved_state_registry_owner, this.f5305N);
        this.f5306O.m5115d(this.f5305N);
        return;
    L10:
        if (this.f5305N.f1631d != null) goto L14;
        this.f5305N = null;
        return;
    L14:
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    /* JADX INFO: renamed from: y */
    public final Context m2878y() {
        Context r0 = m2870d();
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* JADX INFO: renamed from: z */
    public final View m2879z() {
        View r0 = this.f5296E;
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }
}

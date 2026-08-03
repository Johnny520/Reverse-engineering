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
    public static final Object f5291S = new Object();

    /* JADX INFO: renamed from: A */
    public boolean f5292A;

    /* JADX INFO: renamed from: C */
    public boolean f5294C;

    /* JADX INFO: renamed from: D */
    public ViewGroup f5295D;

    /* JADX INFO: renamed from: E */
    public View f5296E;

    /* JADX INFO: renamed from: F */
    public boolean f5297F;

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

    /* JADX INFO: renamed from: b */
    public Bundle f5311b;

    /* JADX INFO: renamed from: c */
    public SparseArray f5312c;

    /* JADX INFO: renamed from: d */
    public Bundle f5313d;

    /* JADX INFO: renamed from: f */
    public Bundle f5315f;

    /* JADX INFO: renamed from: g */
    public AbstractComponentCallbacksC1503hi f5316g;

    /* JADX INFO: renamed from: i */
    public int f5318i;

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

    /* JADX INFO: renamed from: a */
    public int f5310a = -1;

    /* JADX INFO: renamed from: e */
    public String f5314e = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: h */
    public String f5317h = null;

    /* JADX INFO: renamed from: j */
    public Boolean f5319j = null;

    /* JADX INFO: renamed from: t */
    public C0025Ai f5329t = new C0025Ai();

    /* JADX INFO: renamed from: B */
    public boolean f5293B = true;

    /* JADX INFO: renamed from: G */
    public boolean f5298G = true;

    public AbstractComponentCallbacksC1503hi() {
        new RunnableC0431K0(7, this);
        this.f5303L = EnumC0675Pn.f2151e;
        this.f5306O = new C2600us();
        new AtomicInteger();
        this.f5308Q = new ArrayList();
        this.f5309R = new C1328di(this);
        m2873g();
    }

    /* JADX INFO: renamed from: A */
    public final void m2866A(int i, int i2, int i3, int i4) {
        if (this.f5299H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m2868b().f4998b = i;
        m2868b().f4999c = i2;
        m2868b().f5000d = i3;
        m2868b().f5001e = i4;
    }

    /* JADX INFO: renamed from: B */
    public final void m2867B(Bundle bundle) {
        AbstractC2805zi abstractC2805zi = this.f5327r;
        if (abstractC2805zi != null) {
            if (abstractC2805zi == null ? false : abstractC2805zi.m5385L()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f5315f = bundle;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC0828TB mo897a() {
        return new C1371ei(this);
    }

    /* JADX INFO: renamed from: b */
    public final C1415fi m2868b() {
        if (this.f5299H == null) {
            C1415fi c1415fi = new C1415fi();
            Object obj = f5291S;
            c1415fi.f5003g = obj;
            c1415fi.f5004h = obj;
            c1415fi.f5005i = obj;
            c1415fi.f5006j = 1.0f;
            c1415fi.f5007k = null;
            this.f5299H = c1415fi;
        }
        return this.f5299H;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC2805zi m2869c() {
        if (this.f5328s != null) {
            return this.f5329t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* JADX INFO: renamed from: d */
    public final Context m2870d() {
        C2104ji c2104ji = this.f5328s;
        if (c2104ji == null) {
            return null;
        }
        return c2104ji.f7401m;
    }

    /* JADX INFO: renamed from: e */
    public final int m2871e() {
        EnumC0675Pn enumC0675Pn = this.f5303L;
        return (enumC0675Pn == EnumC0675Pn.f2148b || this.f5330u == null) ? enumC0675Pn.ordinal() : Math.min(enumC0675Pn.ordinal(), this.f5330u.m2871e());
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC2805zi m2872f() {
        AbstractC2805zi abstractC2805zi = this.f5327r;
        if (abstractC2805zi != null) {
            return abstractC2805zi;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* JADX INFO: renamed from: g */
    public final void m2873g() {
        this.f5304M = new C1185ao(this);
        this.f5307P = new C2692wy(this);
        ArrayList arrayList = this.f5308Q;
        C1328di c1328di = this.f5309R;
        if (arrayList.contains(c1328di)) {
            return;
        }
        if (this.f5310a < 0) {
            arrayList.add(c1328di);
            return;
        }
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = c1328di.f4804a;
        abstractComponentCallbacksC1503hi.f5307P.m5268c();
        AbstractC0628Oj.m1246o(abstractComponentCallbacksC1503hi);
        Bundle bundle = abstractComponentCallbacksC1503hi.f5311b;
        abstractComponentCallbacksC1503hi.f5307P.m5269d(bundle != null ? bundle.getBundle("registryState") : null);
    }

    @Override // p000.InterfaceC2420qk
    public final AbstractC2189lc getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = m2878y().getApplicationContext();
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
        if (application == null && AbstractC2805zi.m5374G(3)) {
            Objects.toString(m2878y().getApplicationContext());
        }
        C2557ts c2557ts = new C2557ts(0);
        if (application != null) {
            c2557ts.m5044a(C1456gf.f5169m, application);
        }
        c2557ts.m5044a(AbstractC0628Oj.f2014h, this);
        c2557ts.m5044a(AbstractC0628Oj.f2015i, this);
        Bundle bundle = this.f5315f;
        if (bundle != null) {
            c2557ts.m5044a(AbstractC0628Oj.f2016j, bundle);
        }
        return c2557ts;
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
        if (this.f5327r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m2871e() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f5327r.f9490M.f415f;
        C2709xE c2709xE = (C2709xE) map.get(this.f5314e);
        if (c2709xE != null) {
            return c2709xE;
        }
        C2709xE c2709xE2 = new C2709xE();
        map.put(this.f5314e, c2709xE2);
        return c2709xE2;
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
        return this.f5328s != null && this.f5320k;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2876j() {
        if (this.f5334y) {
            return true;
        }
        AbstractC2805zi abstractC2805zi = this.f5327r;
        if (abstractC2805zi != null) {
            AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f5330u;
            abstractC2805zi.getClass();
            if (abstractComponentCallbacksC1503hi == null ? false : abstractComponentCallbacksC1503hi.m2876j()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2877k() {
        return this.f5326q > 0;
    }

    /* JADX INFO: renamed from: l */
    public void mo898l() {
        this.f5294C = true;
    }

    /* JADX INFO: renamed from: m */
    public void mo899m(Context context) {
        this.f5294C = true;
        C2104ji c2104ji = this.f5328s;
        if ((c2104ji == null ? null : c2104ji.f7400l) != null) {
            this.f5294C = true;
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo900n(Bundle bundle) {
        Bundle bundle2;
        this.f5294C = true;
        Bundle bundle3 = this.f5311b;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f5329t.m5393T(bundle2);
            C0025Ai c0025Ai = this.f5329t;
            c0025Ai.f9483F = false;
            c0025Ai.f9484G = false;
            c0025Ai.f9490M.f418i = false;
            c0025Ai.m5422t(1);
        }
        C0025Ai c0025Ai2 = this.f5329t;
        if (c0025Ai2.f9511t >= 1) {
            return;
        }
        c0025Ai2.f9483F = false;
        c0025Ai2.f9484G = false;
        c0025Ai2.f9490M.f418i = false;
        c0025Ai2.m5422t(1);
    }

    /* JADX INFO: renamed from: o */
    public View mo1043o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f5294C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C2104ji c2104ji = this.f5328s;
        AbstractActivityC1244c3 abstractActivityC1244c3 = c2104ji == null ? null : c2104ji.f7400l;
        if (abstractActivityC1244c3 != null) {
            abstractActivityC1244c3.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
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
    public LayoutInflater mo903r(Bundle bundle) {
        C2104ji c2104ji = this.f5328s;
        if (c2104ji == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC1244c3 abstractActivityC1244c3 = c2104ji.f7404p;
        LayoutInflater layoutInflaterCloneInContext = abstractActivityC1244c3.getLayoutInflater().cloneInContext(abstractActivityC1244c3);
        layoutInflaterCloneInContext.setFactory2(this.f5329t.f9497f);
        return layoutInflaterCloneInContext;
    }

    /* JADX INFO: renamed from: s */
    public void mo1177s() {
        this.f5294C = true;
    }

    /* JADX INFO: renamed from: t */
    public void mo904t(Bundle bundle) {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f5314e);
        if (this.f5331v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f5331v));
        }
        if (this.f5333x != null) {
            sb.append(" tag=");
            sb.append(this.f5333x);
        }
        sb.append(")");
        return sb.toString();
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
    public void mo907w(Bundle bundle) {
        this.f5294C = true;
    }

    /* JADX INFO: renamed from: x */
    public void mo908x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f5329t.m5387N();
        this.f5325p = true;
        this.f5305N = new C0498Li(this, getViewModelStore(), new RunnableC0562N2(13, this));
        View viewMo1043o = mo1043o(layoutInflater, viewGroup);
        this.f5296E = viewMo1043o;
        if (viewMo1043o == null) {
            if (this.f5305N.f1631d != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f5305N = null;
            return;
        }
        this.f5305N.m962b();
        if (AbstractC2805zi.m5374G(3)) {
            Objects.toString(this.f5296E);
            toString();
        }
        this.f5296E.setTag(R.id.view_tree_lifecycle_owner, this.f5305N);
        this.f5296E.setTag(R.id.view_tree_view_model_store_owner, this.f5305N);
        this.f5296E.setTag(R.id.view_tree_saved_state_registry_owner, this.f5305N);
        this.f5306O.m5115d(this.f5305N);
    }

    /* JADX INFO: renamed from: y */
    public final Context m2878y() {
        Context contextM2870d = m2870d();
        if (contextM2870d != null) {
            return contextM2870d;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* JADX INFO: renamed from: z */
    public final View m2879z() {
        View view = this.f5296E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }
}

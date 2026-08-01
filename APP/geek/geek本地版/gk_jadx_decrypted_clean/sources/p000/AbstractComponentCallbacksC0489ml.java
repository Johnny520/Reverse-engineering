package p000;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0036a;
import androidx.lifecycle.C0037b;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ml */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0489ml implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0568oq, sa0, InterfaceC0455lo, u10 {

    /* JADX INFO: renamed from: Q */
    public static final Object f3224Q = new Object();

    /* JADX INFO: renamed from: A */
    public boolean f3225A;

    /* JADX INFO: renamed from: C */
    public boolean f3227C;

    /* JADX INFO: renamed from: D */
    public ViewGroup f3228D;

    /* JADX INFO: renamed from: E */
    public View f3229E;

    /* JADX INFO: renamed from: F */
    public boolean f3230F;

    /* JADX INFO: renamed from: H */
    public C0452ll f3232H;

    /* JADX INFO: renamed from: I */
    public boolean f3233I;

    /* JADX INFO: renamed from: J */
    public boolean f3234J;

    /* JADX INFO: renamed from: L */
    public C0036a f3236L;

    /* JADX INFO: renamed from: M */
    public C0229fm f3237M;

    /* JADX INFO: renamed from: O */
    public C0266gm f3239O;

    /* JADX INFO: renamed from: P */
    public final ArrayList f3240P;

    /* JADX INFO: renamed from: b */
    public Bundle f3242b;

    /* JADX INFO: renamed from: c */
    public SparseArray f3243c;

    /* JADX INFO: renamed from: d */
    public Bundle f3244d;

    /* JADX INFO: renamed from: f */
    public Bundle f3246f;

    /* JADX INFO: renamed from: g */
    public AbstractComponentCallbacksC0489ml f3247g;

    /* JADX INFO: renamed from: i */
    public int f3249i;

    /* JADX INFO: renamed from: k */
    public boolean f3251k;

    /* JADX INFO: renamed from: l */
    public boolean f3252l;

    /* JADX INFO: renamed from: m */
    public boolean f3253m;

    /* JADX INFO: renamed from: n */
    public boolean f3254n;

    /* JADX INFO: renamed from: o */
    public boolean f3255o;

    /* JADX INFO: renamed from: p */
    public boolean f3256p;

    /* JADX INFO: renamed from: q */
    public int f3257q;

    /* JADX INFO: renamed from: r */
    public C0934yl f3258r;

    /* JADX INFO: renamed from: s */
    public C0526nl f3259s;

    /* JADX INFO: renamed from: u */
    public AbstractComponentCallbacksC0489ml f3261u;

    /* JADX INFO: renamed from: v */
    public int f3262v;

    /* JADX INFO: renamed from: w */
    public int f3263w;

    /* JADX INFO: renamed from: x */
    public String f3264x;

    /* JADX INFO: renamed from: y */
    public boolean f3265y;

    /* JADX INFO: renamed from: z */
    public boolean f3266z;

    /* JADX INFO: renamed from: a */
    public int f3241a = -1;

    /* JADX INFO: renamed from: e */
    public String f3245e = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: h */
    public String f3248h = null;

    /* JADX INFO: renamed from: j */
    public Boolean f3250j = null;

    /* JADX INFO: renamed from: t */
    public C0934yl f3260t = new C0934yl();

    /* JADX INFO: renamed from: B */
    public final boolean f3226B = true;

    /* JADX INFO: renamed from: G */
    public boolean f3231G = true;

    /* JADX INFO: renamed from: K */
    public EnumC0383jq f3235K = EnumC0383jq.f2660e;

    /* JADX INFO: renamed from: N */
    public final C0037b f3238N = new C0037b();

    public AbstractComponentCallbacksC0489ml() {
        new AtomicInteger();
        this.f3240P = new ArrayList();
        this.f3236L = new C0036a(this);
        this.f3239O = new C0266gm(this);
    }

    /* JADX INFO: renamed from: A */
    public final View m1829A() {
        View view = this.f3229E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* JADX INFO: renamed from: B */
    public final void m1830B(int i, int i2, int i3, int i4) {
        if (this.f3232H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m1833f().f3070b = i;
        m1833f().f3071c = i2;
        m1833f().f3072d = i3;
        m1833f().f3073e = i4;
    }

    /* JADX INFO: renamed from: C */
    public final void m1831C(Bundle bundle) {
        C0934yl c0934yl = this.f3258r;
        if (c0934yl != null && (c0934yl.f5376y || c0934yl.f5377z)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f3246f = bundle;
    }

    @Override // p000.u10
    /* JADX INFO: renamed from: b */
    public final C0004a3 mo118b() {
        return (C0004a3) this.f3239O.f2143c;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC0346ip mo1832c() {
        return new C0415kl(this);
    }

    @Override // p000.sa0
    /* JADX INFO: renamed from: d */
    public final ra0 mo119d() {
        if (this.f3258r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m1836i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f3258r.f5350F.f153e;
        ra0 ra0Var = (ra0) map.get(this.f3245e);
        if (ra0Var != null) {
            return ra0Var;
        }
        ra0 ra0Var2 = new ra0();
        map.put(this.f3245e, ra0Var2);
        return ra0Var2;
    }

    @Override // p000.InterfaceC0568oq
    /* JADX INFO: renamed from: e */
    public final C0036a mo120e() {
        return this.f3236L;
    }

    /* JADX INFO: renamed from: f */
    public final C0452ll m1833f() {
        if (this.f3232H == null) {
            C0452ll c0452ll = new C0452ll();
            Object obj = f3224Q;
            c0452ll.f3075g = obj;
            c0452ll.f3076h = obj;
            c0452ll.f3077i = obj;
            c0452ll.f3078j = 1.0f;
            c0452ll.f3079k = null;
            this.f3232H = c0452ll;
        }
        return this.f3232H;
    }

    /* JADX INFO: renamed from: g */
    public final C0934yl m1834g() {
        if (this.f3259s != null) {
            return this.f3260t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* JADX INFO: renamed from: h */
    public final Context m1835h() {
        C0526nl c0526nl = this.f3259s;
        if (c0526nl == null) {
            return null;
        }
        return c0526nl.f3428D;
    }

    /* JADX INFO: renamed from: i */
    public final int m1836i() {
        EnumC0383jq enumC0383jq = this.f3235K;
        return (enumC0383jq == EnumC0383jq.f2657b || this.f3261u == null) ? enumC0383jq.ordinal() : Math.min(enumC0383jq.ordinal(), this.f3261u.m1836i());
    }

    /* JADX INFO: renamed from: j */
    public final C0934yl m1837j() {
        C0934yl c0934yl = this.f3258r;
        if (c0934yl != null) {
            return c0934yl;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* JADX INFO: renamed from: k */
    public final void m1838k(int i, int i2, Intent intent) {
        if (C0934yl.m2689A(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    /* JADX INFO: renamed from: l */
    public void mo1839l(Context context) {
        this.f3227C = true;
        C0526nl c0526nl = this.f3259s;
        if ((c0526nl == null ? null : c0526nl.f3427C) != null) {
            this.f3227C = true;
        }
    }

    /* JADX INFO: renamed from: m */
    public void mo574m(Bundle bundle) {
        Parcelable parcelable;
        this.f3227C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f3260t.m2700K(parcelable);
            C0934yl c0934yl = this.f3260t;
            c0934yl.f5376y = false;
            c0934yl.f5377z = false;
            c0934yl.f5350F.f156h = false;
            c0934yl.m2724p(1);
        }
        C0934yl c0934yl2 = this.f3260t;
        if (c0934yl2.f5364m >= 1) {
            return;
        }
        c0934yl2.f5376y = false;
        c0934yl2.f5377z = false;
        c0934yl2.f5350F.f156h = false;
        c0934yl2.m2724p(1);
    }

    /* JADX INFO: renamed from: n */
    public View mo575n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: o */
    public void mo1840o() {
        this.f3227C = true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f3227C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0526nl c0526nl = this.f3259s;
        FragmentActivity fragmentActivity = c0526nl == null ? null : c0526nl.f3427C;
        if (fragmentActivity != null) {
            fragmentActivity.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f3227C = true;
    }

    /* JADX INFO: renamed from: p */
    public void mo1841p() {
        this.f3227C = true;
    }

    /* JADX INFO: renamed from: q */
    public LayoutInflater mo1842q(Bundle bundle) {
        C0526nl c0526nl = this.f3259s;
        if (c0526nl == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        FragmentActivity fragmentActivity = c0526nl.f3431G;
        LayoutInflater layoutInflaterCloneInContext = fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
        layoutInflaterCloneInContext.setFactory2(this.f3260t.f5357f);
        return layoutInflaterCloneInContext;
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo576r(Bundle bundle);

    /* JADX INFO: renamed from: s */
    public void mo577s() {
        this.f3227C = true;
    }

    /* JADX INFO: renamed from: t */
    public void mo578t() {
        this.f3227C = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f3245e);
        if (this.f3262v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3262v));
        }
        if (this.f3264x != null) {
            sb.append(" tag=");
            sb.append(this.f3264x);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public void mo1843u(Bundle bundle) {
        this.f3227C = true;
    }

    /* JADX INFO: renamed from: v */
    public void mo1844v(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f3260t.m2695F();
        this.f3256p = true;
        this.f3237M = new C0229fm(mo119d());
        View viewMo575n = mo575n(layoutInflater, viewGroup);
        this.f3229E = viewMo575n;
        if (viewMo575n == null) {
            if (this.f3237M.f1982b != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f3237M = null;
            return;
        }
        this.f3237M.m1234f();
        View view = this.f3229E;
        C0229fm c0229fm = this.f3237M;
        AbstractC0346ip.m1503o("<this>", view);
        view.setTag(R.id.view_tree_lifecycle_owner, c0229fm);
        View view2 = this.f3229E;
        C0229fm c0229fm2 = this.f3237M;
        AbstractC0346ip.m1503o("<this>", view2);
        view2.setTag(R.id.view_tree_view_model_store_owner, c0229fm2);
        View view3 = this.f3229E;
        C0229fm c0229fm3 = this.f3237M;
        AbstractC0346ip.m1503o("<this>", view3);
        view3.setTag(R.id.view_tree_saved_state_registry_owner, c0229fm3);
        this.f3238N.m286e(this.f3237M);
    }

    /* JADX INFO: renamed from: w */
    public final void m1845w() {
        this.f3227C = true;
        for (AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml : this.f3260t.f5354c.m2237p()) {
            if (abstractComponentCallbacksC0489ml != null) {
                abstractComponentCallbacksC0489ml.m1845w();
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m1846x() {
        for (AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml : this.f3260t.f5354c.m2237p()) {
            if (abstractComponentCallbacksC0489ml != null) {
                abstractComponentCallbacksC0489ml.m1846x();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m1847y() {
        for (AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml : this.f3260t.f5354c.m2237p()) {
            if (abstractComponentCallbacksC0489ml != null) {
                abstractComponentCallbacksC0489ml.m1847y();
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final Context m1848z() {
        Context contextM1835h = m1835h();
        if (contextM1835h != null) {
            return contextM1835h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }
}

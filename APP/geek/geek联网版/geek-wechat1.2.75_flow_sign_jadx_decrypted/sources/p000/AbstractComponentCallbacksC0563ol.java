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

/* JADX INFO: renamed from: ol */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0563ol implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0716sq, xa0, InterfaceC0603po, b20 {

    /* JADX INFO: renamed from: Q */
    public static final Object f3469Q = new Object();

    /* JADX INFO: renamed from: A */
    public boolean f3470A;

    /* JADX INFO: renamed from: C */
    public boolean f3472C;

    /* JADX INFO: renamed from: D */
    public ViewGroup f3473D;

    /* JADX INFO: renamed from: E */
    public View f3474E;

    /* JADX INFO: renamed from: F */
    public boolean f3475F;

    /* JADX INFO: renamed from: H */
    public C0526nl f3477H;

    /* JADX INFO: renamed from: I */
    public boolean f3478I;

    /* JADX INFO: renamed from: J */
    public boolean f3479J;

    /* JADX INFO: renamed from: L */
    public C0036a f3481L;

    /* JADX INFO: renamed from: M */
    public C0303hm f3482M;

    /* JADX INFO: renamed from: O */
    public C0339im f3484O;

    /* JADX INFO: renamed from: P */
    public final ArrayList f3485P;

    /* JADX INFO: renamed from: b */
    public Bundle f3487b;

    /* JADX INFO: renamed from: c */
    public SparseArray f3488c;

    /* JADX INFO: renamed from: d */
    public Bundle f3489d;

    /* JADX INFO: renamed from: f */
    public Bundle f3491f;

    /* JADX INFO: renamed from: g */
    public AbstractComponentCallbacksC0563ol f3492g;

    /* JADX INFO: renamed from: i */
    public int f3494i;

    /* JADX INFO: renamed from: k */
    public boolean f3496k;

    /* JADX INFO: renamed from: l */
    public boolean f3497l;

    /* JADX INFO: renamed from: m */
    public boolean f3498m;

    /* JADX INFO: renamed from: n */
    public boolean f3499n;

    /* JADX INFO: renamed from: o */
    public boolean f3500o;

    /* JADX INFO: renamed from: p */
    public boolean f3501p;

    /* JADX INFO: renamed from: q */
    public int f3502q;

    /* JADX INFO: renamed from: r */
    public C0023am f3503r;

    /* JADX INFO: renamed from: s */
    public C0600pl f3504s;

    /* JADX INFO: renamed from: u */
    public AbstractComponentCallbacksC0563ol f3506u;

    /* JADX INFO: renamed from: v */
    public int f3507v;

    /* JADX INFO: renamed from: w */
    public int f3508w;

    /* JADX INFO: renamed from: x */
    public String f3509x;

    /* JADX INFO: renamed from: y */
    public boolean f3510y;

    /* JADX INFO: renamed from: z */
    public boolean f3511z;

    /* JADX INFO: renamed from: a */
    public int f3486a = -1;

    /* JADX INFO: renamed from: e */
    public String f3490e = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: h */
    public String f3493h = null;

    /* JADX INFO: renamed from: j */
    public Boolean f3495j = null;

    /* JADX INFO: renamed from: t */
    public C0023am f3505t = new C0023am();

    /* JADX INFO: renamed from: B */
    public final boolean f3471B = true;

    /* JADX INFO: renamed from: G */
    public boolean f3476G = true;

    /* JADX INFO: renamed from: K */
    public EnumC0531nq f3480K = EnumC0531nq.f3333e;

    /* JADX INFO: renamed from: N */
    public final C0037b f3483N = new C0037b();

    public AbstractComponentCallbacksC0563ol() {
        new AtomicInteger();
        this.f3485P = new ArrayList();
        this.f3481L = new C0036a(this);
        this.f3484O = new C0339im(this);
    }

    /* JADX INFO: renamed from: A */
    public final View m2031A() {
        View view = this.f3474E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* JADX INFO: renamed from: B */
    public final void m2032B(int i, int i2, int i3, int i4) {
        if (this.f3477H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m2035f().f3310b = i;
        m2035f().f3311c = i2;
        m2035f().f3312d = i3;
        m2035f().f3313e = i4;
    }

    /* JADX INFO: renamed from: C */
    public final void m2033C(Bundle bundle) {
        C0023am c0023am = this.f3503r;
        if (c0023am != null && (c0023am.f118y || c0023am.f119z)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f3491f = bundle;
    }

    @Override // p000.b20
    /* JADX INFO: renamed from: b */
    public final C0004a3 mo103b() {
        return (C0004a3) this.f3484O.f2555c;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC0259gf mo2034c() {
        return new C0489ml(this);
    }

    @Override // p000.xa0
    /* JADX INFO: renamed from: d */
    public final wa0 mo104d() {
        if (this.f3503r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m2038i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f3503r.f92F.f906e;
        wa0 wa0Var = (wa0) map.get(this.f3490e);
        if (wa0Var != null) {
            return wa0Var;
        }
        wa0 wa0Var2 = new wa0();
        map.put(this.f3490e, wa0Var2);
        return wa0Var2;
    }

    @Override // p000.InterfaceC0716sq
    /* JADX INFO: renamed from: e */
    public final C0036a mo105e() {
        return this.f3481L;
    }

    /* JADX INFO: renamed from: f */
    public final C0526nl m2035f() {
        if (this.f3477H == null) {
            C0526nl c0526nl = new C0526nl();
            Object obj = f3469Q;
            c0526nl.f3315g = obj;
            c0526nl.f3316h = obj;
            c0526nl.f3317i = obj;
            c0526nl.f3318j = 1.0f;
            c0526nl.f3319k = null;
            this.f3477H = c0526nl;
        }
        return this.f3477H;
    }

    /* JADX INFO: renamed from: g */
    public final C0023am m2036g() {
        if (this.f3504s != null) {
            return this.f3505t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* JADX INFO: renamed from: h */
    public final Context m2037h() {
        C0600pl c0600pl = this.f3504s;
        if (c0600pl == null) {
            return null;
        }
        return c0600pl.f3728z;
    }

    /* JADX INFO: renamed from: i */
    public final int m2038i() {
        EnumC0531nq enumC0531nq = this.f3480K;
        return (enumC0531nq == EnumC0531nq.f3330b || this.f3506u == null) ? enumC0531nq.ordinal() : Math.min(enumC0531nq.ordinal(), this.f3506u.m2038i());
    }

    /* JADX INFO: renamed from: j */
    public final C0023am m2039j() {
        C0023am c0023am = this.f3503r;
        if (c0023am != null) {
            return c0023am;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* JADX INFO: renamed from: k */
    public final void m2040k(int i, int i2, Intent intent) {
        if (C0023am.m55A(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    /* JADX INFO: renamed from: l */
    public void mo2041l(Context context) {
        this.f3472C = true;
        C0600pl c0600pl = this.f3504s;
        if ((c0600pl == null ? null : c0600pl.f3727y) != null) {
            this.f3472C = true;
        }
    }

    /* JADX INFO: renamed from: m */
    public void mo1023m(Bundle bundle) {
        Parcelable parcelable;
        this.f3472C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f3505t.m66K(parcelable);
            C0023am c0023am = this.f3505t;
            c0023am.f118y = false;
            c0023am.f119z = false;
            c0023am.f92F.f909h = false;
            c0023am.m90p(1);
        }
        C0023am c0023am2 = this.f3505t;
        if (c0023am2.f106m >= 1) {
            return;
        }
        c0023am2.f118y = false;
        c0023am2.f119z = false;
        c0023am2.f92F.f909h = false;
        c0023am2.m90p(1);
    }

    /* JADX INFO: renamed from: n */
    public View mo1024n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: o */
    public void mo2042o() {
        this.f3472C = true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f3472C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0600pl c0600pl = this.f3504s;
        FragmentActivity fragmentActivity = c0600pl == null ? null : c0600pl.f3727y;
        if (fragmentActivity != null) {
            fragmentActivity.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f3472C = true;
    }

    /* JADX INFO: renamed from: p */
    public void mo2043p() {
        this.f3472C = true;
    }

    /* JADX INFO: renamed from: q */
    public LayoutInflater mo2044q(Bundle bundle) {
        C0600pl c0600pl = this.f3504s;
        if (c0600pl == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        FragmentActivity fragmentActivity = c0600pl.f3726C;
        LayoutInflater layoutInflaterCloneInContext = fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
        layoutInflaterCloneInContext.setFactory2(this.f3505t.f99f);
        return layoutInflaterCloneInContext;
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo1025r(Bundle bundle);

    /* JADX INFO: renamed from: s */
    public void mo1026s() {
        this.f3472C = true;
    }

    /* JADX INFO: renamed from: t */
    public void mo1027t() {
        this.f3472C = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f3490e);
        if (this.f3507v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3507v));
        }
        if (this.f3509x != null) {
            sb.append(" tag=");
            sb.append(this.f3509x);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public void mo2045u(Bundle bundle) {
        this.f3472C = true;
    }

    /* JADX INFO: renamed from: v */
    public void mo2046v(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f3505t.m61F();
        this.f3501p = true;
        this.f3482M = new C0303hm(mo104d());
        View viewMo1024n = mo1024n(layoutInflater, viewGroup);
        this.f3474E = viewMo1024n;
        if (viewMo1024n == null) {
            if (this.f3482M.f2241b != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f3482M = null;
            return;
        }
        this.f3482M.m1407f();
        View view = this.f3474E;
        C0303hm c0303hm = this.f3482M;
        AbstractC0493mp.m1857g("<this>", view);
        view.setTag(R.id.view_tree_lifecycle_owner, c0303hm);
        View view2 = this.f3474E;
        C0303hm c0303hm2 = this.f3482M;
        AbstractC0493mp.m1857g("<this>", view2);
        view2.setTag(R.id.view_tree_view_model_store_owner, c0303hm2);
        View view3 = this.f3474E;
        C0303hm c0303hm3 = this.f3482M;
        AbstractC0493mp.m1857g("<this>", view3);
        view3.setTag(R.id.view_tree_saved_state_registry_owner, c0303hm3);
        this.f3483N.m271e(this.f3482M);
    }

    /* JADX INFO: renamed from: w */
    public final void m2047w() {
        this.f3472C = true;
        for (AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol : this.f3505t.f96c.m2244p()) {
            if (abstractComponentCallbacksC0563ol != null) {
                abstractComponentCallbacksC0563ol.m2047w();
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m2048x() {
        for (AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol : this.f3505t.f96c.m2244p()) {
            if (abstractComponentCallbacksC0563ol != null) {
                abstractComponentCallbacksC0563ol.m2048x();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m2049y() {
        for (AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol : this.f3505t.f96c.m2244p()) {
            if (abstractComponentCallbacksC0563ol != null) {
                abstractComponentCallbacksC0563ol.m2049y();
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final Context m2050z() {
        Context contextM2037h = m2037h();
        if (contextM2037h != null) {
            return contextM2037h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }
}

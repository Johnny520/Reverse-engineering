package androidx.fragment.app;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
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
import androidx.lifecycle.AbstractC1116e;
import androidx.lifecycle.C1119h;
import androidx.lifecycle.C1129n;
import androidx.lifecycle.C1131p;
import androidx.lifecycle.InterfaceC1114c;
import androidx.lifecycle.viewmodel.C1137R;
import androidx.savedstate.C1224a;
import androidx.savedstate.C1225b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.AbstractC0005A4;
import p000a.AbstractC0472a2;
import p000a.AbstractC0553e7;
import p000a.ActivityC0422X6;
import p000a.C0012Ab;
import p000a.C0031Bb;
import p000a.C0109Fg;
import p000a.C0196Kd;
import p000a.C0235Mg;
import p000a.C0629i7;
import p000a.C0631i9;
import p000a.C0781q7;
import p000a.InterfaceC0127Gg;
import p000a.InterfaceC0214Ld;
import p000a.InterfaceC0935y9;
import p000a.RunnableC0221M2;

/* JADX INFO: renamed from: androidx.fragment.app.b */
/* JADX INFO: loaded from: classes.dex */
public class ComponentCallbacksC1100b implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0935y9, InterfaceC0127Gg, InterfaceC1114c, InterfaceC0214Ld {

    /* JADX INFO: renamed from: U */
    public static final Object f4536U = new Object();

    /* JADX INFO: renamed from: A */
    public boolean f4537A;

    /* JADX INFO: renamed from: B */
    public boolean f4538B;

    /* JADX INFO: renamed from: C */
    public boolean f4539C;

    /* JADX INFO: renamed from: E */
    public boolean f4541E;

    /* JADX INFO: renamed from: F */
    public ViewGroup f4542F;

    /* JADX INFO: renamed from: G */
    public View f4543G;

    /* JADX INFO: renamed from: H */
    public boolean f4544H;

    /* JADX INFO: renamed from: J */
    public d f4546J;

    /* JADX INFO: renamed from: K */
    public boolean f4547K;

    /* JADX INFO: renamed from: L */
    public boolean f4548L;

    /* JADX INFO: renamed from: M */
    public String f4549M;

    /* JADX INFO: renamed from: N */
    public AbstractC1116e.b f4550N;

    /* JADX INFO: renamed from: O */
    public C1119h f4551O;

    /* JADX INFO: renamed from: P */
    public C0781q7 f4552P;

    /* JADX INFO: renamed from: Q */
    public final C0031Bb<InterfaceC0935y9> f4553Q;

    /* JADX INFO: renamed from: R */
    public C0196Kd f4554R;

    /* JADX INFO: renamed from: S */
    public final ArrayList<f> f4555S;

    /* JADX INFO: renamed from: T */
    public final b f4556T;

    /* JADX INFO: renamed from: b */
    public Bundle f4558b;

    /* JADX INFO: renamed from: c */
    public SparseArray<Parcelable> f4559c;

    /* JADX INFO: renamed from: d */
    public Bundle f4560d;

    /* JADX INFO: renamed from: f */
    public Bundle f4562f;

    /* JADX INFO: renamed from: g */
    public ComponentCallbacksC1100b f4563g;

    /* JADX INFO: renamed from: i */
    public int f4565i;

    /* JADX INFO: renamed from: k */
    public boolean f4567k;

    /* JADX INFO: renamed from: l */
    public boolean f4568l;

    /* JADX INFO: renamed from: m */
    public boolean f4569m;

    /* JADX INFO: renamed from: n */
    public boolean f4570n;

    /* JADX INFO: renamed from: o */
    public boolean f4571o;

    /* JADX INFO: renamed from: p */
    public boolean f4572p;

    /* JADX INFO: renamed from: q */
    public boolean f4573q;

    /* JADX INFO: renamed from: r */
    public boolean f4574r;

    /* JADX INFO: renamed from: s */
    public int f4575s;

    /* JADX INFO: renamed from: t */
    public AbstractC0553e7 f4576t;

    /* JADX INFO: renamed from: u */
    public ActivityC0422X6.a f4577u;

    /* JADX INFO: renamed from: w */
    public ComponentCallbacksC1100b f4579w;

    /* JADX INFO: renamed from: x */
    public int f4580x;

    /* JADX INFO: renamed from: y */
    public int f4581y;

    /* JADX INFO: renamed from: z */
    public String f4582z;

    /* JADX INFO: renamed from: a */
    public int f4557a = -1;

    /* JADX INFO: renamed from: e */
    public String f4561e = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: h */
    public String f4564h = null;

    /* JADX INFO: renamed from: j */
    public Boolean f4566j = null;

    /* JADX INFO: renamed from: v */
    public C0629i7 f4578v = new C0629i7();

    /* JADX INFO: renamed from: D */
    public final boolean f4540D = true;

    /* JADX INFO: renamed from: I */
    public boolean f4545I = true;

    /* JADX INFO: renamed from: androidx.fragment.app.b$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentCallbacksC1100b componentCallbacksC1100b = ComponentCallbacksC1100b.this;
            if (componentCallbacksC1100b.f4546J != null) {
                componentCallbacksC1100b.m2529b().getClass();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$b */
    public class b extends f {
        public b() {
        }

        @Override // androidx.fragment.app.ComponentCallbacksC1100b.f
        /* JADX INFO: renamed from: a */
        public final void mo2541a() {
            ComponentCallbacksC1100b componentCallbacksC1100b = ComponentCallbacksC1100b.this;
            componentCallbacksC1100b.f4554R.m545a();
            C1129n.m2611b(componentCallbacksC1100b);
            Bundle bundle = componentCallbacksC1100b.f4558b;
            componentCallbacksC1100b.f4554R.m546b(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$c */
    public class c extends AbstractC0472a2 {
        public c() {
        }

        @Override // p000a.AbstractC0472a2
        /* JADX INFO: renamed from: c */
        public final View mo1067c(int i) {
            ComponentCallbacksC1100b componentCallbacksC1100b = ComponentCallbacksC1100b.this;
            View view = componentCallbacksC1100b.f4543G;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + componentCallbacksC1100b + " does not have a view");
        }

        @Override // p000a.AbstractC0472a2
        /* JADX INFO: renamed from: f */
        public final boolean mo1068f() {
            return ComponentCallbacksC1100b.this.f4543G != null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public boolean f4586a;

        /* JADX INFO: renamed from: b */
        public int f4587b;

        /* JADX INFO: renamed from: c */
        public int f4588c;

        /* JADX INFO: renamed from: d */
        public int f4589d;

        /* JADX INFO: renamed from: e */
        public int f4590e;

        /* JADX INFO: renamed from: f */
        public int f4591f;

        /* JADX INFO: renamed from: g */
        public Object f4592g;

        /* JADX INFO: renamed from: h */
        public Object f4593h;

        /* JADX INFO: renamed from: i */
        public Object f4594i;

        /* JADX INFO: renamed from: j */
        public float f4595j;

        /* JADX INFO: renamed from: k */
        public View f4596k;
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$e */
    public static class e extends RuntimeException {
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$f */
    public static abstract class f {
        /* JADX INFO: renamed from: a */
        public abstract void mo2541a();
    }

    public ComponentCallbacksC1100b() {
        new a();
        this.f4550N = AbstractC1116e.b.f4676e;
        this.f4553Q = new C0031Bb<>();
        new AtomicInteger();
        this.f4555S = new ArrayList<>();
        this.f4556T = new b();
        m2534g();
    }

    /* JADX INFO: renamed from: A */
    public final Context m2524A() {
        Context contextM2531d = m2531d();
        if (contextM2531d != null) {
            return contextM2531d;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* JADX INFO: renamed from: B */
    public final View m2525B() {
        View view = this.f4543G;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* JADX INFO: renamed from: C */
    public final void m2526C() {
        Bundle bundle;
        Bundle bundle2 = this.f4558b;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.f4578v.m1351V(bundle);
        C0629i7 c0629i7 = this.f4578v;
        c0629i7.f2049G = false;
        c0629i7.f2050H = false;
        c0629i7.f2056N.f2494i = false;
        c0629i7.m1381u(1);
    }

    /* JADX INFO: renamed from: D */
    public final void m2527D(int i, int i2, int i3, int i4) {
        if (this.f4546J == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m2529b().f4587b = i;
        m2529b().f4588c = i2;
        m2529b().f4589d = i3;
        m2529b().f4590e = i4;
    }

    /* JADX INFO: renamed from: E */
    public final void m2528E(Bundle bundle) {
        AbstractC0553e7 abstractC0553e7 = this.f4576t;
        if (abstractC0553e7 != null && (abstractC0553e7.f2049G || abstractC0553e7.f2050H)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f4562f = bundle;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC0472a2 mo1508a() {
        return new c();
    }

    /* JADX INFO: renamed from: b */
    public final d m2529b() {
        if (this.f4546J == null) {
            d dVar = new d();
            Object obj = f4536U;
            dVar.f4592g = obj;
            dVar.f4593h = obj;
            dVar.f4594i = obj;
            dVar.f4595j = 1.0f;
            dVar.f4596k = null;
            this.f4546J = dVar;
        }
        return this.f4546J;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0553e7 m2530c() {
        if (this.f4577u != null) {
            return this.f4578v;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* JADX INFO: renamed from: d */
    public final Context m2531d() {
        ActivityC0422X6.a aVar = this.f4577u;
        if (aVar == null) {
            return null;
        }
        return aVar.f1723b;
    }

    /* JADX INFO: renamed from: e */
    public final int m2532e() {
        AbstractC1116e.b bVar = this.f4550N;
        return (bVar == AbstractC1116e.b.f4673b || this.f4579w == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f4579w.m2532e());
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC0553e7 m2533f() {
        AbstractC0553e7 abstractC0553e7 = this.f4576t;
        if (abstractC0553e7 != null) {
            return abstractC0553e7;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* JADX INFO: renamed from: g */
    public final void m2534g() {
        this.f4551O = new C1119h(this);
        this.f4554R = new C0196Kd(this);
        ArrayList<f> arrayList = this.f4555S;
        b bVar = this.f4556T;
        if (arrayList.contains(bVar)) {
            return;
        }
        if (this.f4557a >= 0) {
            bVar.mo2541a();
        } else {
            arrayList.add(bVar);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1114c
    public final AbstractC0005A4 getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = m2524A().getApplicationContext();
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
        if (application == null && AbstractC0553e7.m1330J(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + m2524A().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C0012Ab c0012Ab = new C0012Ab();
        LinkedHashMap linkedHashMap = c0012Ab.f29a;
        if (application != null) {
            linkedHashMap.put(C1131p.f4715a, application);
        }
        linkedHashMap.put(C1129n.f4707a, this);
        linkedHashMap.put(C1129n.f4708b, this);
        Bundle bundle = this.f4562f;
        if (bundle != null) {
            linkedHashMap.put(C1129n.f4709c, bundle);
        }
        return c0012Ab;
    }

    @Override // p000a.InterfaceC0935y9
    public final AbstractC1116e getLifecycle() {
        return this.f4551O;
    }

    @Override // p000a.InterfaceC0214Ld
    public final C1224a getSavedStateRegistry() {
        return this.f4554R.f663b;
    }

    @Override // p000a.InterfaceC0127Gg
    public final C0109Fg getViewModelStore() {
        if (this.f4576t == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m2532e() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap<String, C0109Fg> map = this.f4576t.f2056N.f2491f;
        C0109Fg c0109Fg = map.get(this.f4561e);
        if (c0109Fg != null) {
            return c0109Fg;
        }
        C0109Fg c0109Fg2 = new C0109Fg();
        map.put(this.f4561e, c0109Fg2);
        return c0109Fg2;
    }

    /* JADX INFO: renamed from: h */
    public final void m2535h() {
        m2534g();
        this.f4549M = this.f4561e;
        this.f4561e = UUID.randomUUID().toString();
        this.f4567k = false;
        this.f4568l = false;
        this.f4570n = false;
        this.f4571o = false;
        this.f4573q = false;
        this.f4575s = 0;
        this.f4576t = null;
        this.f4578v = new C0629i7();
        this.f4577u = null;
        this.f4580x = 0;
        this.f4581y = 0;
        this.f4582z = null;
        this.f4537A = false;
        this.f4538B = false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2536i() {
        return this.f4577u != null && this.f4567k;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2537j() {
        if (this.f4537A) {
            return true;
        }
        AbstractC0553e7 abstractC0553e7 = this.f4576t;
        if (abstractC0553e7 != null) {
            ComponentCallbacksC1100b componentCallbacksC1100b = this.f4579w;
            abstractC0553e7.getClass();
            if (componentCallbacksC1100b == null ? false : componentCallbacksC1100b.m2537j()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2538k() {
        return this.f4575s > 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: l */
    public void mo1509l() {
        this.f4541E = true;
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    public final void m2539m(int i, int i2, Intent intent) {
        if (AbstractC0553e7.m1330J(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo1510n(ActivityC0422X6 activityC0422X6) {
        this.f4541E = true;
        ActivityC0422X6.a aVar = this.f4577u;
        if ((aVar == null ? null : aVar.f1722a) != null) {
            this.f4541E = true;
        }
    }

    /* JADX INFO: renamed from: o */
    public void mo994o(Bundle bundle) {
        this.f4541E = true;
        m2526C();
        C0629i7 c0629i7 = this.f4578v;
        if (c0629i7.f2078u >= 1) {
            return;
        }
        c0629i7.f2049G = false;
        c0629i7.f2050H = false;
        c0629i7.f2056N.f2494i = false;
        c0629i7.m1381u(1);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f4541E = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m2540z().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f4541E = true;
    }

    /* JADX INFO: renamed from: p */
    public View mo995p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* JADX INFO: renamed from: q */
    public void mo1070q() {
        this.f4541E = true;
    }

    /* JADX INFO: renamed from: r */
    public void mo1511r() {
        this.f4541E = true;
    }

    /* JADX INFO: renamed from: s */
    public LayoutInflater mo1512s(Bundle bundle) {
        ActivityC0422X6.a aVar = this.f4577u;
        if (aVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        ActivityC0422X6 activityC0422X6 = ActivityC0422X6.this;
        LayoutInflater layoutInflaterCloneInContext = activityC0422X6.getLayoutInflater().cloneInContext(activityC0422X6);
        layoutInflaterCloneInContext.setFactory2(this.f4578v.f2063f);
        return layoutInflaterCloneInContext;
    }

    /* JADX INFO: renamed from: t */
    public void mo996t(Bundle bundle) {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f4561e);
        if (this.f4580x != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f4580x));
        }
        if (this.f4582z != null) {
            sb.append(" tag=");
            sb.append(this.f4582z);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public void mo1513u() {
        this.f4541E = true;
    }

    /* JADX INFO: renamed from: v */
    public void mo1514v() {
        this.f4541E = true;
    }

    /* JADX INFO: renamed from: w */
    public void mo1071w(View view) {
    }

    /* JADX INFO: renamed from: x */
    public void mo1515x(Bundle bundle) {
        this.f4541E = true;
    }

    /* JADX INFO: renamed from: y */
    public void mo1516y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f4578v.m1345P();
        this.f4574r = true;
        this.f4552P = new C0781q7(this, getViewModelStore(), new RunnableC0221M2(9, this));
        View viewMo995p = mo995p(layoutInflater, viewGroup, bundle);
        this.f4543G = viewMo995p;
        if (viewMo995p == null) {
            if (this.f4552P.f3081d != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f4552P = null;
            return;
        }
        this.f4552P.m1822b();
        if (AbstractC0553e7.m1330J(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f4543G + " for Fragment " + this);
        }
        C0235Mg.m628a(this.f4543G, this.f4552P);
        View view = this.f4543G;
        C0781q7 c0781q7 = this.f4552P;
        C0631i9.m1482e(view, "<this>");
        view.setTag(C1137R.id.view_tree_view_model_store_owner, c0781q7);
        C1225b.m3011a(this.f4543G, this.f4552P);
        this.f4553Q.m92g(this.f4552P);
    }

    /* JADX INFO: renamed from: z */
    public final ActivityC0422X6 m2540z() {
        ActivityC0422X6.a aVar = this.f4577u;
        ActivityC0422X6 activityC0422X6 = aVar == null ? null : aVar.f1722a;
        if (activityC0422X6 != null) {
            return activityC0422X6;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }
}

package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.C1098R;
import androidx.fragment.app.AbstractC1104f;
import androidx.fragment.app.ComponentCallbacksC1100b;
import androidx.lifecycle.AbstractC1116e;
import androidx.lifecycle.C1119h;
import androidx.lifecycle.C1133q;
import androidx.lifecycle.InterfaceC1118g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000a.AbstractC0553e7;
import p000a.ActivityC0422X6;
import p000a.C0003A2;
import p000a.C0107Fe;
import p000a.C0156I9;
import p000a.C0181Jg;
import p000a.C0496b7;
import p000a.C0629i7;
import p000a.C0667k7;
import p000a.C0705m7;
import p000a.C0724n7;
import p000a.C0743o7;
import p000a.C0750oe;
import p000a.C0781q7;
import p000a.C0866ug;
import p000a.C0944z;
import p000a.InterfaceC0686l7;
import p000a.InterfaceC0935y9;

/* JADX INFO: renamed from: androidx.fragment.app.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1103e {

    /* JADX INFO: renamed from: a */
    public final C0496b7 f4605a;

    /* JADX INFO: renamed from: b */
    public final C0003A2 f4606b;

    /* JADX INFO: renamed from: c */
    public final ComponentCallbacksC1100b f4607c;

    /* JADX INFO: renamed from: d */
    public boolean f4608d = false;

    /* JADX INFO: renamed from: e */
    public int f4609e = -1;

    /* JADX INFO: renamed from: androidx.fragment.app.e$a */
    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f4610a;

        public a(View view) {
            this.f4610a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.f4610a;
            view2.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            C0866ug.c.m2008c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1103e(C0496b7 c0496b7, C0003A2 c0003a2, ComponentCallbacksC1100b componentCallbacksC1100b) {
        this.f4605a = c0496b7;
        this.f4606b = c0003a2;
        this.f4607c = componentCallbacksC1100b;
    }

    /* JADX INFO: renamed from: a */
    public final void m2545a() {
        boolean zM1330J = AbstractC0553e7.m1330J(3);
        ComponentCallbacksC1100b componentCallbacksC1100b = this.f4607c;
        if (zM1330J) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + componentCallbacksC1100b);
        }
        Bundle bundle = componentCallbacksC1100b.f4558b;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        componentCallbacksC1100b.f4578v.m1345P();
        componentCallbacksC1100b.f4557a = 3;
        componentCallbacksC1100b.f4541E = false;
        componentCallbacksC1100b.mo1509l();
        if (!componentCallbacksC1100b.f4541E) {
            throw new C0107Fe("Fragment " + componentCallbacksC1100b + " did not call through to super.onActivityCreated()");
        }
        if (AbstractC0553e7.m1330J(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + componentCallbacksC1100b);
        }
        if (componentCallbacksC1100b.f4543G != null) {
            Bundle bundle2 = componentCallbacksC1100b.f4558b;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = componentCallbacksC1100b.f4559c;
            if (sparseArray != null) {
                componentCallbacksC1100b.f4543G.restoreHierarchyState(sparseArray);
                componentCallbacksC1100b.f4559c = null;
            }
            componentCallbacksC1100b.f4541E = false;
            componentCallbacksC1100b.mo1515x(bundle3);
            if (!componentCallbacksC1100b.f4541E) {
                throw new C0107Fe("Fragment " + componentCallbacksC1100b + " did not call through to super.onViewStateRestored()");
            }
            if (componentCallbacksC1100b.f4543G != null) {
                componentCallbacksC1100b.f4552P.m1821a(AbstractC1116e.a.ON_CREATE);
            }
        }
        componentCallbacksC1100b.f4558b = null;
        C0629i7 c0629i7 = componentCallbacksC1100b.f4578v;
        c0629i7.f2049G = false;
        c0629i7.f2050H = false;
        c0629i7.f2056N.f2494i = false;
        c0629i7.m1381u(4);
        this.f4605a.m1213a(componentCallbacksC1100b, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m2546b() {
        ComponentCallbacksC1100b componentCallbacksC1100b;
        View view;
        View view2;
        int iIndexOfChild = -1;
        ComponentCallbacksC1100b componentCallbacksC1100b2 = this.f4607c;
        View view3 = componentCallbacksC1100b2.f4542F;
        while (true) {
            componentCallbacksC1100b = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(C1098R.id.fragment_container_view_tag);
            ComponentCallbacksC1100b componentCallbacksC1100b3 = tag instanceof ComponentCallbacksC1100b ? (ComponentCallbacksC1100b) tag : null;
            if (componentCallbacksC1100b3 != null) {
                componentCallbacksC1100b = componentCallbacksC1100b3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        ComponentCallbacksC1100b componentCallbacksC1100b4 = componentCallbacksC1100b2.f4579w;
        if (componentCallbacksC1100b != null && !componentCallbacksC1100b.equals(componentCallbacksC1100b4)) {
            int i = componentCallbacksC1100b2.f4581y;
            C0743o7.b bVar = C0743o7.f2939a;
            C0743o7.m1763b(new C0705m7(componentCallbacksC1100b2, "Attempting to nest fragment " + componentCallbacksC1100b2 + " within the view of parent fragment " + componentCallbacksC1100b + " via container with ID " + i + " without using parent's childFragmentManager"));
            C0743o7.m1762a(componentCallbacksC1100b2).getClass();
        }
        C0003A2 c0003a2 = this.f4606b;
        c0003a2.getClass();
        ViewGroup viewGroup = componentCallbacksC1100b2.f4542F;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) c0003a2.f23a;
            int iIndexOf = arrayList.indexOf(componentCallbacksC1100b2);
            int i2 = iIndexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        ComponentCallbacksC1100b componentCallbacksC1100b5 = (ComponentCallbacksC1100b) arrayList.get(iIndexOf);
                        if (componentCallbacksC1100b5.f4542F == viewGroup && (view = componentCallbacksC1100b5.f4543G) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    ComponentCallbacksC1100b componentCallbacksC1100b6 = (ComponentCallbacksC1100b) arrayList.get(i2);
                    if (componentCallbacksC1100b6.f4542F == viewGroup && (view2 = componentCallbacksC1100b6.f4543G) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        componentCallbacksC1100b2.f4542F.addView(componentCallbacksC1100b2.f4543G, iIndexOfChild);
    }

    /* JADX INFO: renamed from: c */
    public final void m2547c() {
        boolean zM1330J = AbstractC0553e7.m1330J(3);
        ComponentCallbacksC1100b componentCallbacksC1100b = this.f4607c;
        if (zM1330J) {
            Log.d("FragmentManager", "moveto ATTACHED: " + componentCallbacksC1100b);
        }
        ComponentCallbacksC1100b componentCallbacksC1100b2 = componentCallbacksC1100b.f4563g;
        C1103e c1103e = null;
        C0003A2 c0003a2 = this.f4606b;
        if (componentCallbacksC1100b2 != null) {
            C1103e c1103e2 = (C1103e) ((HashMap) c0003a2.f24b).get(componentCallbacksC1100b2.f4561e);
            if (c1103e2 == null) {
                throw new IllegalStateException("Fragment " + componentCallbacksC1100b + " declared target fragment " + componentCallbacksC1100b.f4563g + " that does not belong to this FragmentManager!");
            }
            componentCallbacksC1100b.f4564h = componentCallbacksC1100b.f4563g.f4561e;
            componentCallbacksC1100b.f4563g = null;
            c1103e = c1103e2;
        } else {
            String str = componentCallbacksC1100b.f4564h;
            if (str != null && (c1103e = (C1103e) ((HashMap) c0003a2.f24b).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(componentCallbacksC1100b);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(C0944z.m2228h(sb, componentCallbacksC1100b.f4564h, " that does not belong to this FragmentManager!"));
            }
        }
        if (c1103e != null) {
            c1103e.m2555k();
        }
        AbstractC0553e7 abstractC0553e7 = componentCallbacksC1100b.f4576t;
        componentCallbacksC1100b.f4577u = abstractC0553e7.f2079v;
        componentCallbacksC1100b.f4579w = abstractC0553e7.f2081x;
        C0496b7 c0496b7 = this.f4605a;
        c0496b7.m1219g(componentCallbacksC1100b, false);
        ArrayList<ComponentCallbacksC1100b.f> arrayList = componentCallbacksC1100b.f4555S;
        Iterator<ComponentCallbacksC1100b.f> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().mo2541a();
        }
        arrayList.clear();
        componentCallbacksC1100b.f4578v.m1358b(componentCallbacksC1100b.f4577u, componentCallbacksC1100b.mo1508a(), componentCallbacksC1100b);
        componentCallbacksC1100b.f4557a = 0;
        componentCallbacksC1100b.f4541E = false;
        componentCallbacksC1100b.mo1510n(componentCallbacksC1100b.f4577u.f1723b);
        if (!componentCallbacksC1100b.f4541E) {
            throw new C0107Fe("Fragment " + componentCallbacksC1100b + " did not call through to super.onAttach()");
        }
        Iterator<InterfaceC0686l7> it2 = componentCallbacksC1100b.f4576t.f2072o.iterator();
        while (it2.hasNext()) {
            it2.next().mo1066a(componentCallbacksC1100b);
        }
        C0629i7 c0629i7 = componentCallbacksC1100b.f4578v;
        c0629i7.f2049G = false;
        c0629i7.f2050H = false;
        c0629i7.f2056N.f2494i = false;
        c0629i7.m1381u(0);
        c0496b7.m1214b(componentCallbacksC1100b, false);
    }

    /* JADX INFO: renamed from: d */
    public final int m2548d() {
        ComponentCallbacksC1100b componentCallbacksC1100b = this.f4607c;
        if (componentCallbacksC1100b.f4576t == null) {
            return componentCallbacksC1100b.f4557a;
        }
        int iMin = this.f4609e;
        int iOrdinal = componentCallbacksC1100b.f4550N.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (componentCallbacksC1100b.f4570n) {
            if (componentCallbacksC1100b.f4571o) {
                iMin = Math.max(this.f4609e, 2);
                View view = componentCallbacksC1100b.f4543G;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f4609e < 4 ? Math.min(iMin, componentCallbacksC1100b.f4557a) : Math.min(iMin, 1);
            }
        }
        if (componentCallbacksC1100b.f4572p && componentCallbacksC1100b.f4542F == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!componentCallbacksC1100b.f4567k) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = componentCallbacksC1100b.f4542F;
        if (viewGroup != null) {
            AbstractC1104f abstractC1104fM2562i = AbstractC1104f.m2562i(viewGroup, componentCallbacksC1100b.m2533f());
            abstractC1104fM2562i.getClass();
            AbstractC1104f.c cVarM2567f = abstractC1104fM2562i.m2567f(componentCallbacksC1100b);
            AbstractC1104f.c.a aVar = cVarM2567f != null ? cVarM2567f.f4620b : null;
            AbstractC1104f.c cVarM2568g = abstractC1104fM2562i.m2568g(componentCallbacksC1100b);
            aVar = cVarM2568g != null ? cVarM2568g.f4620b : null;
            int i = aVar == null ? -1 : AbstractC1104f.d.$EnumSwitchMapping$0[aVar.ordinal()];
            if (i != -1 && i != 1) {
                aVar = aVar;
            }
        }
        if (aVar == AbstractC1104f.c.a.f4631b) {
            iMin = Math.min(iMin, 6);
        } else if (aVar == AbstractC1104f.c.a.f4632c) {
            iMin = Math.max(iMin, 3);
        } else if (componentCallbacksC1100b.f4568l) {
            iMin = componentCallbacksC1100b.m2538k() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (componentCallbacksC1100b.f4544H && componentCallbacksC1100b.f4557a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (componentCallbacksC1100b.f4569m) {
            iMin = Math.max(iMin, 3);
        }
        if (AbstractC0553e7.m1330J(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + componentCallbacksC1100b);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: e */
    public final void m2549e() {
        boolean zM1330J = AbstractC0553e7.m1330J(3);
        final ComponentCallbacksC1100b componentCallbacksC1100b = this.f4607c;
        if (zM1330J) {
            Log.d("FragmentManager", "moveto CREATED: " + componentCallbacksC1100b);
        }
        Bundle bundle = componentCallbacksC1100b.f4558b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (componentCallbacksC1100b.f4548L) {
            componentCallbacksC1100b.f4557a = 1;
            componentCallbacksC1100b.m2526C();
            return;
        }
        C0496b7 c0496b7 = this.f4605a;
        c0496b7.m1220h(componentCallbacksC1100b, false);
        componentCallbacksC1100b.f4578v.m1345P();
        componentCallbacksC1100b.f4557a = 1;
        componentCallbacksC1100b.f4541E = false;
        componentCallbacksC1100b.f4551O.mo2592a(new InterfaceC1118g() { // from class: androidx.fragment.app.Fragment$6
            @Override // androidx.lifecycle.InterfaceC1118g
            /* JADX INFO: renamed from: a */
            public final void mo485a(InterfaceC0935y9 interfaceC0935y9, AbstractC1116e.a aVar) {
                View view;
                if (aVar != AbstractC1116e.a.ON_STOP || (view = componentCallbacksC1100b.f4543G) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        componentCallbacksC1100b.mo994o(bundle2);
        componentCallbacksC1100b.f4548L = true;
        if (componentCallbacksC1100b.f4541E) {
            componentCallbacksC1100b.f4551O.m2598f(AbstractC1116e.a.ON_CREATE);
            c0496b7.m1215c(componentCallbacksC1100b, false);
        } else {
            throw new C0107Fe("Fragment " + componentCallbacksC1100b + " did not call through to super.onCreate()");
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2550f() {
        String resourceName;
        ComponentCallbacksC1100b componentCallbacksC1100b = this.f4607c;
        if (componentCallbacksC1100b.f4570n) {
            return;
        }
        if (AbstractC0553e7.m1330J(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + componentCallbacksC1100b);
        }
        Bundle bundle = componentCallbacksC1100b.f4558b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterMo1512s = componentCallbacksC1100b.mo1512s(bundle2);
        ViewGroup viewGroup2 = componentCallbacksC1100b.f4542F;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = componentCallbacksC1100b.f4581y;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + componentCallbacksC1100b + " for a container view with no id");
                }
                viewGroup = (ViewGroup) componentCallbacksC1100b.f4576t.f2080w.mo1067c(i);
                if (viewGroup == null) {
                    if (!componentCallbacksC1100b.f4573q && !componentCallbacksC1100b.f4572p) {
                        try {
                            resourceName = componentCallbacksC1100b.m2524A().getResources().getResourceName(componentCallbacksC1100b.f4581y);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(componentCallbacksC1100b.f4581y) + " (" + resourceName + ") for fragment " + componentCallbacksC1100b);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C0743o7.b bVar = C0743o7.f2939a;
                    C0743o7.m1763b(new C0705m7(componentCallbacksC1100b, "Attempting to add fragment " + componentCallbacksC1100b + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    C0743o7.m1762a(componentCallbacksC1100b).getClass();
                }
            }
        }
        componentCallbacksC1100b.f4542F = viewGroup;
        componentCallbacksC1100b.mo1516y(layoutInflaterMo1512s, viewGroup, bundle2);
        if (componentCallbacksC1100b.f4543G != null) {
            if (AbstractC0553e7.m1330J(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + componentCallbacksC1100b);
            }
            componentCallbacksC1100b.f4543G.setSaveFromParentEnabled(false);
            componentCallbacksC1100b.f4543G.setTag(C1098R.id.fragment_container_view_tag, componentCallbacksC1100b);
            if (viewGroup != null) {
                m2546b();
            }
            if (componentCallbacksC1100b.f4537A) {
                componentCallbacksC1100b.f4543G.setVisibility(8);
            }
            if (componentCallbacksC1100b.f4543G.isAttachedToWindow()) {
                View view = componentCallbacksC1100b.f4543G;
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                C0866ug.c.m2008c(view);
            } else {
                View view2 = componentCallbacksC1100b.f4543G;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            Bundle bundle3 = componentCallbacksC1100b.f4558b;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            componentCallbacksC1100b.mo1071w(componentCallbacksC1100b.f4543G);
            componentCallbacksC1100b.f4578v.m1381u(2);
            this.f4605a.m1225m(componentCallbacksC1100b, componentCallbacksC1100b.f4543G, false);
            int visibility = componentCallbacksC1100b.f4543G.getVisibility();
            componentCallbacksC1100b.m2529b().f4595j = componentCallbacksC1100b.f4543G.getAlpha();
            if (componentCallbacksC1100b.f4542F != null && visibility == 0) {
                View viewFindFocus = componentCallbacksC1100b.f4543G.findFocus();
                if (viewFindFocus != null) {
                    componentCallbacksC1100b.m2529b().f4596k = viewFindFocus;
                    if (AbstractC0553e7.m1330J(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + componentCallbacksC1100b);
                    }
                }
                componentCallbacksC1100b.f4543G.setAlpha(0.0f);
            }
        }
        componentCallbacksC1100b.f4557a = 2;
    }

    /* JADX INFO: renamed from: g */
    public final void m2551g() {
        boolean z;
        ComponentCallbacksC1100b componentCallbacksC1100bM23c;
        boolean zM1330J = AbstractC0553e7.m1330J(3);
        ComponentCallbacksC1100b componentCallbacksC1100b = this.f4607c;
        if (zM1330J) {
            Log.d("FragmentManager", "movefrom CREATED: " + componentCallbacksC1100b);
        }
        boolean z2 = componentCallbacksC1100b.f4568l && !componentCallbacksC1100b.m2538k();
        C0003A2 c0003a2 = this.f4606b;
        if (z2) {
            c0003a2.m30j(componentCallbacksC1100b.f4561e, null);
        }
        if (!z2) {
            C0667k7 c0667k7 = (C0667k7) c0003a2.f26d;
            if (!((c0667k7.f2489d.containsKey(componentCallbacksC1100b.f4561e) && c0667k7.f2492g) ? c0667k7.f2493h : true)) {
                String str = componentCallbacksC1100b.f4564h;
                if (str != null && (componentCallbacksC1100bM23c = c0003a2.m23c(str)) != null && componentCallbacksC1100bM23c.f4539C) {
                    componentCallbacksC1100b.f4563g = componentCallbacksC1100bM23c;
                }
                componentCallbacksC1100b.f4557a = 0;
                return;
            }
        }
        ActivityC0422X6.a aVar = componentCallbacksC1100b.f4577u;
        if (aVar != null) {
            z = ((C0667k7) c0003a2.f26d).f2493h;
        } else {
            z = aVar.f1723b != null ? !r6.isChangingConfigurations() : true;
        }
        if (z2 || z) {
            ((C0667k7) c0003a2.f26d).m1538c(componentCallbacksC1100b, false);
        }
        componentCallbacksC1100b.f4578v.m1372l();
        componentCallbacksC1100b.f4551O.m2598f(AbstractC1116e.a.ON_DESTROY);
        componentCallbacksC1100b.f4557a = 0;
        componentCallbacksC1100b.f4548L = false;
        componentCallbacksC1100b.f4541E = true;
        this.f4605a.m1216d(componentCallbacksC1100b, false);
        for (C1103e c1103e : c0003a2.m25e()) {
            if (c1103e != null) {
                String str2 = componentCallbacksC1100b.f4561e;
                ComponentCallbacksC1100b componentCallbacksC1100b2 = c1103e.f4607c;
                if (str2.equals(componentCallbacksC1100b2.f4564h)) {
                    componentCallbacksC1100b2.f4563g = componentCallbacksC1100b;
                    componentCallbacksC1100b2.f4564h = null;
                }
            }
        }
        String str3 = componentCallbacksC1100b.f4564h;
        if (str3 != null) {
            componentCallbacksC1100b.f4563g = c0003a2.m23c(str3);
        }
        c0003a2.m29i(this);
    }

    /* JADX INFO: renamed from: h */
    public final void m2552h() {
        View view;
        boolean zM1330J = AbstractC0553e7.m1330J(3);
        ComponentCallbacksC1100b componentCallbacksC1100b = this.f4607c;
        if (zM1330J) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + componentCallbacksC1100b);
        }
        ViewGroup viewGroup = componentCallbacksC1100b.f4542F;
        if (viewGroup != null && (view = componentCallbacksC1100b.f4543G) != null) {
            viewGroup.removeView(view);
        }
        componentCallbacksC1100b.f4578v.m1381u(1);
        if (componentCallbacksC1100b.f4543G != null) {
            C0781q7 c0781q7 = componentCallbacksC1100b.f4552P;
            c0781q7.m1822b();
            if (c0781q7.f3081d.f4681c.compareTo(AbstractC1116e.b.f4674c) >= 0) {
                componentCallbacksC1100b.f4552P.m1821a(AbstractC1116e.a.ON_DESTROY);
            }
        }
        componentCallbacksC1100b.f4557a = 1;
        componentCallbacksC1100b.f4541E = false;
        componentCallbacksC1100b.mo1070q();
        if (!componentCallbacksC1100b.f4541E) {
            throw new C0107Fe("Fragment " + componentCallbacksC1100b + " did not call through to super.onDestroyView()");
        }
        C1133q c1133q = new C1133q(componentCallbacksC1100b.getViewModelStore(), C0156I9.b.f536e);
        String canonicalName = C0156I9.b.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        C0750oe<C0156I9.a> c0750oe = ((C0156I9.b) c1133q.m2615a(C0156I9.b.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName))).f537d;
        int i = c0750oe.f2958c;
        for (int i2 = 0; i2 < i; i2++) {
            ((C0156I9.a) c0750oe.f2957b[i2]).getClass();
        }
        componentCallbacksC1100b.f4574r = false;
        this.f4605a.m1226n(componentCallbacksC1100b, false);
        componentCallbacksC1100b.f4542F = null;
        componentCallbacksC1100b.f4543G = null;
        componentCallbacksC1100b.f4552P = null;
        componentCallbacksC1100b.f4553Q.m92g(null);
        componentCallbacksC1100b.f4571o = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m2553i() {
        boolean zM1330J = AbstractC0553e7.m1330J(3);
        ComponentCallbacksC1100b componentCallbacksC1100b = this.f4607c;
        if (zM1330J) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + componentCallbacksC1100b);
        }
        componentCallbacksC1100b.f4557a = -1;
        componentCallbacksC1100b.f4541E = false;
        componentCallbacksC1100b.mo1511r();
        if (!componentCallbacksC1100b.f4541E) {
            throw new C0107Fe("Fragment " + componentCallbacksC1100b + " did not call through to super.onDetach()");
        }
        C0629i7 c0629i7 = componentCallbacksC1100b.f4578v;
        if (!c0629i7.f2051I) {
            c0629i7.m1372l();
            componentCallbacksC1100b.f4578v = new C0629i7();
        }
        this.f4605a.m1217e(componentCallbacksC1100b, false);
        componentCallbacksC1100b.f4557a = -1;
        componentCallbacksC1100b.f4577u = null;
        componentCallbacksC1100b.f4579w = null;
        componentCallbacksC1100b.f4576t = null;
        if (!componentCallbacksC1100b.f4568l || componentCallbacksC1100b.m2538k()) {
            C0667k7 c0667k7 = (C0667k7) this.f4606b.f26d;
            if (!((c0667k7.f2489d.containsKey(componentCallbacksC1100b.f4561e) && c0667k7.f2492g) ? c0667k7.f2493h : true)) {
                return;
            }
        }
        if (AbstractC0553e7.m1330J(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + componentCallbacksC1100b);
        }
        componentCallbacksC1100b.m2535h();
    }

    /* JADX INFO: renamed from: j */
    public final void m2554j() {
        ComponentCallbacksC1100b componentCallbacksC1100b = this.f4607c;
        if (componentCallbacksC1100b.f4570n && componentCallbacksC1100b.f4571o && !componentCallbacksC1100b.f4574r) {
            if (AbstractC0553e7.m1330J(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + componentCallbacksC1100b);
            }
            Bundle bundle = componentCallbacksC1100b.f4558b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            componentCallbacksC1100b.mo1516y(componentCallbacksC1100b.mo1512s(bundle2), null, bundle2);
            View view = componentCallbacksC1100b.f4543G;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                componentCallbacksC1100b.f4543G.setTag(C1098R.id.fragment_container_view_tag, componentCallbacksC1100b);
                if (componentCallbacksC1100b.f4537A) {
                    componentCallbacksC1100b.f4543G.setVisibility(8);
                }
                Bundle bundle3 = componentCallbacksC1100b.f4558b;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                componentCallbacksC1100b.mo1071w(componentCallbacksC1100b.f4543G);
                componentCallbacksC1100b.f4578v.m1381u(2);
                this.f4605a.m1225m(componentCallbacksC1100b, componentCallbacksC1100b.f4543G, false);
                componentCallbacksC1100b.f4557a = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0141, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2555k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        C0003A2 c0003a2 = this.f4606b;
        boolean z = this.f4608d;
        ComponentCallbacksC1100b componentCallbacksC1100b = this.f4607c;
        if (z) {
            if (AbstractC0553e7.m1330J(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + componentCallbacksC1100b);
                return;
            }
            return;
        }
        try {
            this.f4608d = true;
            boolean z2 = false;
            while (true) {
                int iM2548d = m2548d();
                int i = componentCallbacksC1100b.f4557a;
                AbstractC1104f.c.b bVar = AbstractC1104f.c.b.f4635b;
                AbstractC1104f.c.b bVar2 = AbstractC1104f.c.b.f4636c;
                if (iM2548d == i) {
                    if (!z2 && i == -1 && componentCallbacksC1100b.f4568l && !componentCallbacksC1100b.m2538k()) {
                        if (AbstractC0553e7.m1330J(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + componentCallbacksC1100b);
                        }
                        ((C0667k7) c0003a2.f26d).m1538c(componentCallbacksC1100b, true);
                        c0003a2.m29i(this);
                        if (AbstractC0553e7.m1330J(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + componentCallbacksC1100b);
                        }
                        componentCallbacksC1100b.m2535h();
                    }
                    if (componentCallbacksC1100b.f4547K) {
                        if (componentCallbacksC1100b.f4543G != null && (viewGroup = componentCallbacksC1100b.f4542F) != null) {
                            AbstractC1104f abstractC1104fM2562i = AbstractC1104f.m2562i(viewGroup, componentCallbacksC1100b.m2533f());
                            boolean z3 = componentCallbacksC1100b.f4537A;
                            AbstractC1104f.c.a aVar = AbstractC1104f.c.a.f4630a;
                            if (z3) {
                                abstractC1104fM2562i.getClass();
                                if (AbstractC0553e7.m1330J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + componentCallbacksC1100b);
                                }
                                abstractC1104fM2562i.m2565d(bVar2, aVar, this);
                            } else {
                                abstractC1104fM2562i.getClass();
                                if (AbstractC0553e7.m1330J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + componentCallbacksC1100b);
                                }
                                abstractC1104fM2562i.m2565d(bVar, aVar, this);
                            }
                        }
                        AbstractC0553e7 abstractC0553e7 = componentCallbacksC1100b.f4576t;
                        if (abstractC0553e7 != null && componentCallbacksC1100b.f4567k && AbstractC0553e7.m1331K(componentCallbacksC1100b)) {
                            abstractC0553e7.f2048F = true;
                        }
                        componentCallbacksC1100b.f4547K = false;
                        componentCallbacksC1100b.f4578v.m1375o();
                    }
                    this.f4608d = false;
                    return;
                }
                if (iM2548d <= i) {
                    switch (i - 1) {
                        case -1:
                            m2553i();
                            break;
                        case 0:
                            m2551g();
                            break;
                        case 1:
                            m2552h();
                            componentCallbacksC1100b.f4557a = 1;
                            break;
                        case 2:
                            componentCallbacksC1100b.f4571o = false;
                            componentCallbacksC1100b.f4557a = 2;
                            break;
                        case 3:
                            if (AbstractC0553e7.m1330J(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + componentCallbacksC1100b);
                            }
                            if (componentCallbacksC1100b.f4543G != null && componentCallbacksC1100b.f4559c == null) {
                                m2559o();
                            }
                            if (componentCallbacksC1100b.f4543G != null && (viewGroup2 = componentCallbacksC1100b.f4542F) != null) {
                                AbstractC1104f abstractC1104fM2562i2 = AbstractC1104f.m2562i(viewGroup2, componentCallbacksC1100b.m2533f());
                                abstractC1104fM2562i2.getClass();
                                if (AbstractC0553e7.m1330J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + componentCallbacksC1100b);
                                }
                                abstractC1104fM2562i2.m2565d(AbstractC1104f.c.b.f4634a, AbstractC1104f.c.a.f4632c, this);
                            }
                            componentCallbacksC1100b.f4557a = 3;
                            break;
                        case 4:
                            m2561q();
                            break;
                        case 5:
                            componentCallbacksC1100b.f4557a = 5;
                            break;
                        case 6:
                            m2556l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            m2547c();
                            break;
                        case 1:
                            m2549e();
                            break;
                        case 2:
                            m2554j();
                            m2550f();
                            break;
                        case 3:
                            m2545a();
                            break;
                        case 4:
                            if (componentCallbacksC1100b.f4543G != null && (viewGroup3 = componentCallbacksC1100b.f4542F) != null) {
                                AbstractC1104f abstractC1104fM2562i3 = AbstractC1104f.m2562i(viewGroup3, componentCallbacksC1100b.m2533f());
                                int visibility = componentCallbacksC1100b.f4543G.getVisibility();
                                if (visibility != 0) {
                                    if (visibility == 4) {
                                        bVar = AbstractC1104f.c.b.f4637d;
                                    } else {
                                        if (visibility != 8) {
                                            throw new IllegalArgumentException("Unknown visibility " + visibility);
                                        }
                                        bVar = bVar2;
                                    }
                                }
                                abstractC1104fM2562i3.getClass();
                                if (AbstractC0553e7.m1330J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + componentCallbacksC1100b);
                                }
                                abstractC1104fM2562i3.m2565d(bVar, AbstractC1104f.c.a.f4631b, this);
                            }
                            componentCallbacksC1100b.f4557a = 4;
                            break;
                        case 5:
                            m2560p();
                            break;
                        case 6:
                            componentCallbacksC1100b.f4557a = 6;
                            break;
                        case 7:
                            m2558n();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.f4608d = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2556l() {
        boolean zM1330J = AbstractC0553e7.m1330J(3);
        ComponentCallbacksC1100b componentCallbacksC1100b = this.f4607c;
        if (zM1330J) {
            Log.d("FragmentManager", "movefrom RESUMED: " + componentCallbacksC1100b);
        }
        componentCallbacksC1100b.f4578v.m1381u(5);
        if (componentCallbacksC1100b.f4543G != null) {
            componentCallbacksC1100b.f4552P.m1821a(AbstractC1116e.a.ON_PAUSE);
        }
        componentCallbacksC1100b.f4551O.m2598f(AbstractC1116e.a.ON_PAUSE);
        componentCallbacksC1100b.f4557a = 6;
        componentCallbacksC1100b.f4541E = true;
        this.f4605a.m1218f(componentCallbacksC1100b, false);
    }

    /* JADX INFO: renamed from: m */
    public final void m2557m(ClassLoader classLoader) {
        ComponentCallbacksC1100b componentCallbacksC1100b = this.f4607c;
        Bundle bundle = componentCallbacksC1100b.f4558b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (componentCallbacksC1100b.f4558b.getBundle("savedInstanceState") == null) {
            componentCallbacksC1100b.f4558b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            componentCallbacksC1100b.f4559c = componentCallbacksC1100b.f4558b.getSparseParcelableArray("viewState");
            componentCallbacksC1100b.f4560d = componentCallbacksC1100b.f4558b.getBundle("viewRegistryState");
            C0724n7 c0724n7 = (C0724n7) componentCallbacksC1100b.f4558b.getParcelable("state");
            if (c0724n7 != null) {
                componentCallbacksC1100b.f4564h = c0724n7.f2842m;
                componentCallbacksC1100b.f4565i = c0724n7.f2843n;
                componentCallbacksC1100b.f4545I = c0724n7.f2844o;
            }
            if (componentCallbacksC1100b.f4545I) {
                return;
            }
            componentCallbacksC1100b.f4544H = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + componentCallbacksC1100b, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2558n() {
        boolean zM1330J = AbstractC0553e7.m1330J(3);
        ComponentCallbacksC1100b componentCallbacksC1100b = this.f4607c;
        if (zM1330J) {
            Log.d("FragmentManager", "moveto RESUMED: " + componentCallbacksC1100b);
        }
        ComponentCallbacksC1100b.d dVar = componentCallbacksC1100b.f4546J;
        View view = dVar == null ? null : dVar.f4596k;
        if (view != null) {
            if (view == componentCallbacksC1100b.f4543G) {
                boolean zRequestFocus = view.requestFocus();
                if (AbstractC0553e7.m1330J(2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(view);
                    sb.append(" ");
                    sb.append(zRequestFocus ? "succeeded" : "failed");
                    sb.append(" on Fragment ");
                    sb.append(componentCallbacksC1100b);
                    sb.append(" resulting in focused view ");
                    sb.append(componentCallbacksC1100b.f4543G.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            } else {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == componentCallbacksC1100b.f4543G) {
                        boolean zRequestFocus2 = view.requestFocus();
                        if (AbstractC0553e7.m1330J(2)) {
                        }
                    }
                }
            }
        }
        componentCallbacksC1100b.m2529b().f4596k = null;
        componentCallbacksC1100b.f4578v.m1345P();
        componentCallbacksC1100b.f4578v.m1386z(true);
        componentCallbacksC1100b.f4557a = 7;
        componentCallbacksC1100b.f4541E = true;
        C1119h c1119h = componentCallbacksC1100b.f4551O;
        AbstractC1116e.a aVar = AbstractC1116e.a.ON_RESUME;
        c1119h.m2598f(aVar);
        if (componentCallbacksC1100b.f4543G != null) {
            componentCallbacksC1100b.f4552P.f3081d.m2598f(aVar);
        }
        C0629i7 c0629i7 = componentCallbacksC1100b.f4578v;
        c0629i7.f2049G = false;
        c0629i7.f2050H = false;
        c0629i7.f2056N.f2494i = false;
        c0629i7.m1381u(7);
        this.f4605a.m1221i(componentCallbacksC1100b, false);
        this.f4606b.m30j(componentCallbacksC1100b.f4561e, null);
        componentCallbacksC1100b.f4558b = null;
        componentCallbacksC1100b.f4559c = null;
        componentCallbacksC1100b.f4560d = null;
    }

    /* JADX INFO: renamed from: o */
    public final void m2559o() {
        ComponentCallbacksC1100b componentCallbacksC1100b = this.f4607c;
        if (componentCallbacksC1100b.f4543G == null) {
            return;
        }
        if (AbstractC0553e7.m1330J(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + componentCallbacksC1100b + " with view " + componentCallbacksC1100b.f4543G);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        componentCallbacksC1100b.f4543G.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            componentCallbacksC1100b.f4559c = sparseArray;
        }
        Bundle bundle = new Bundle();
        componentCallbacksC1100b.f4552P.f3082e.m547c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        componentCallbacksC1100b.f4560d = bundle;
    }

    /* JADX INFO: renamed from: p */
    public final void m2560p() {
        boolean zM1330J = AbstractC0553e7.m1330J(3);
        ComponentCallbacksC1100b componentCallbacksC1100b = this.f4607c;
        if (zM1330J) {
            Log.d("FragmentManager", "moveto STARTED: " + componentCallbacksC1100b);
        }
        componentCallbacksC1100b.f4578v.m1345P();
        componentCallbacksC1100b.f4578v.m1386z(true);
        componentCallbacksC1100b.f4557a = 5;
        componentCallbacksC1100b.f4541E = false;
        componentCallbacksC1100b.mo1513u();
        if (!componentCallbacksC1100b.f4541E) {
            throw new C0107Fe("Fragment " + componentCallbacksC1100b + " did not call through to super.onStart()");
        }
        C1119h c1119h = componentCallbacksC1100b.f4551O;
        AbstractC1116e.a aVar = AbstractC1116e.a.ON_START;
        c1119h.m2598f(aVar);
        if (componentCallbacksC1100b.f4543G != null) {
            componentCallbacksC1100b.f4552P.f3081d.m2598f(aVar);
        }
        C0629i7 c0629i7 = componentCallbacksC1100b.f4578v;
        c0629i7.f2049G = false;
        c0629i7.f2050H = false;
        c0629i7.f2056N.f2494i = false;
        c0629i7.m1381u(5);
        this.f4605a.m1223k(componentCallbacksC1100b, false);
    }

    /* JADX INFO: renamed from: q */
    public final void m2561q() {
        boolean zM1330J = AbstractC0553e7.m1330J(3);
        ComponentCallbacksC1100b componentCallbacksC1100b = this.f4607c;
        if (zM1330J) {
            Log.d("FragmentManager", "movefrom STARTED: " + componentCallbacksC1100b);
        }
        C0629i7 c0629i7 = componentCallbacksC1100b.f4578v;
        c0629i7.f2050H = true;
        c0629i7.f2056N.f2494i = true;
        c0629i7.m1381u(4);
        if (componentCallbacksC1100b.f4543G != null) {
            componentCallbacksC1100b.f4552P.m1821a(AbstractC1116e.a.ON_STOP);
        }
        componentCallbacksC1100b.f4551O.m2598f(AbstractC1116e.a.ON_STOP);
        componentCallbacksC1100b.f4557a = 4;
        componentCallbacksC1100b.f4541E = false;
        componentCallbacksC1100b.mo1514v();
        if (componentCallbacksC1100b.f4541E) {
            this.f4605a.m1224l(componentCallbacksC1100b, false);
            return;
        }
        throw new C0107Fe("Fragment " + componentCallbacksC1100b + " did not call through to super.onStop()");
    }

    public C1103e(C0496b7 c0496b7, C0003A2 c0003a2, ClassLoader classLoader, C1102d c1102d, Bundle bundle) {
        this.f4605a = c0496b7;
        this.f4606b = c0003a2;
        C0724n7 c0724n7 = (C0724n7) bundle.getParcelable("state");
        ComponentCallbacksC1100b componentCallbacksC1100bMo1391a = c1102d.mo1391a(c0724n7.f2830a);
        componentCallbacksC1100bMo1391a.f4561e = c0724n7.f2831b;
        componentCallbacksC1100bMo1391a.f4570n = c0724n7.f2832c;
        componentCallbacksC1100bMo1391a.f4572p = c0724n7.f2833d;
        componentCallbacksC1100bMo1391a.f4573q = true;
        componentCallbacksC1100bMo1391a.f4580x = c0724n7.f2834e;
        componentCallbacksC1100bMo1391a.f4581y = c0724n7.f2835f;
        componentCallbacksC1100bMo1391a.f4582z = c0724n7.f2836g;
        componentCallbacksC1100bMo1391a.f4539C = c0724n7.f2837h;
        componentCallbacksC1100bMo1391a.f4568l = c0724n7.f2838i;
        componentCallbacksC1100bMo1391a.f4538B = c0724n7.f2839j;
        componentCallbacksC1100bMo1391a.f4537A = c0724n7.f2840k;
        componentCallbacksC1100bMo1391a.f4550N = AbstractC1116e.b.values()[c0724n7.f2841l];
        componentCallbacksC1100bMo1391a.f4564h = c0724n7.f2842m;
        componentCallbacksC1100bMo1391a.f4565i = c0724n7.f2843n;
        componentCallbacksC1100bMo1391a.f4545I = c0724n7.f2844o;
        this.f4607c = componentCallbacksC1100bMo1391a;
        componentCallbacksC1100bMo1391a.f4558b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        componentCallbacksC1100bMo1391a.m2528E(bundle2);
        if (AbstractC0553e7.m1330J(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + componentCallbacksC1100bMo1391a);
        }
    }

    public C1103e(C0496b7 c0496b7, C0003A2 c0003a2, ComponentCallbacksC1100b componentCallbacksC1100b, Bundle bundle) {
        this.f4605a = c0496b7;
        this.f4606b = c0003a2;
        this.f4607c = componentCallbacksC1100b;
        componentCallbacksC1100b.f4559c = null;
        componentCallbacksC1100b.f4560d = null;
        componentCallbacksC1100b.f4575s = 0;
        componentCallbacksC1100b.f4571o = false;
        componentCallbacksC1100b.f4567k = false;
        ComponentCallbacksC1100b componentCallbacksC1100b2 = componentCallbacksC1100b.f4563g;
        componentCallbacksC1100b.f4564h = componentCallbacksC1100b2 != null ? componentCallbacksC1100b2.f4561e : null;
        componentCallbacksC1100b.f4563g = null;
        componentCallbacksC1100b.f4558b = bundle;
        componentCallbacksC1100b.f4562f = bundle.getBundle("arguments");
    }
}

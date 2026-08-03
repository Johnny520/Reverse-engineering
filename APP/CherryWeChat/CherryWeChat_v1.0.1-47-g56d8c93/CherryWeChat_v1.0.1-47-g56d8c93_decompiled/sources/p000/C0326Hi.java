package p000;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Hi */
/* JADX INFO: loaded from: classes.dex */
public final class C0326Hi {

    /* JADX INFO: renamed from: a */
    public final C0649P3 f1108a;

    /* JADX INFO: renamed from: b */
    public final C2428qs f1109b;

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC1503hi f1110c;

    /* JADX INFO: renamed from: d */
    public boolean f1111d = false;

    /* JADX INFO: renamed from: e */
    public int f1112e = -1;

    public C0326Hi(C0649P3 c0649p3, C2428qs c2428qs, AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        this.f1108a = c0649p3;
        this.f1109b = c2428qs;
        this.f1110c = abstractComponentCallbacksC1503hi;
    }

    /* JADX INFO: renamed from: a */
    public final void m694a() {
        boolean zM5374G = AbstractC2805zi.m5374G(3);
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f1110c;
        if (zM5374G) {
            Objects.toString(abstractComponentCallbacksC1503hi);
        }
        Bundle bundle = abstractComponentCallbacksC1503hi.f5311b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        abstractComponentCallbacksC1503hi.f5329t.m5387N();
        abstractComponentCallbacksC1503hi.f5310a = 3;
        abstractComponentCallbacksC1503hi.f5294C = false;
        abstractComponentCallbacksC1503hi.mo898l();
        if (!abstractComponentCallbacksC1503hi.f5294C) {
            throw new C0300Gz("Fragment " + abstractComponentCallbacksC1503hi + " did not call through to super.onActivityCreated()");
        }
        if (AbstractC2805zi.m5374G(3)) {
            abstractComponentCallbacksC1503hi.toString();
        }
        if (abstractComponentCallbacksC1503hi.f5296E != null) {
            Bundle bundle3 = abstractComponentCallbacksC1503hi.f5311b;
            Bundle bundle4 = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC1503hi.f5312c;
            if (sparseArray != null) {
                abstractComponentCallbacksC1503hi.f5296E.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC1503hi.f5312c = null;
            }
            abstractComponentCallbacksC1503hi.f5294C = false;
            abstractComponentCallbacksC1503hi.mo907w(bundle4);
            if (!abstractComponentCallbacksC1503hi.f5294C) {
                throw new C0300Gz("Fragment " + abstractComponentCallbacksC1503hi + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC1503hi.f5296E != null) {
                abstractComponentCallbacksC1503hi.f5305N.m961a(EnumC0632On.ON_CREATE);
            }
        }
        abstractComponentCallbacksC1503hi.f5311b = null;
        C0025Ai c0025Ai = abstractComponentCallbacksC1503hi.f5329t;
        c0025Ai.f9483F = false;
        c0025Ai.f9484G = false;
        c0025Ai.f9490M.f418i = false;
        c0025Ai.m5422t(4);
        this.f1108a.m1296m(abstractComponentCallbacksC1503hi, bundle2, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m695b() {
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi;
        View view;
        View view2;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = this.f1110c;
        View view3 = abstractComponentCallbacksC1503hi2.f5295D;
        while (true) {
            abstractComponentCallbacksC1503hi = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi3 = tag instanceof AbstractComponentCallbacksC1503hi ? (AbstractComponentCallbacksC1503hi) tag : null;
            if (abstractComponentCallbacksC1503hi3 != null) {
                abstractComponentCallbacksC1503hi = abstractComponentCallbacksC1503hi3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi4 = abstractComponentCallbacksC1503hi2.f5330u;
        if (abstractComponentCallbacksC1503hi != null && !abstractComponentCallbacksC1503hi.equals(abstractComponentCallbacksC1503hi4)) {
            int i = abstractComponentCallbacksC1503hi2.f5332w;
            C0369Ii c0369Ii = AbstractC0412Ji.f1381a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(abstractComponentCallbacksC1503hi2);
            sb.append(" within the view of parent fragment ");
            sb.append(abstractComponentCallbacksC1503hi);
            sb.append(" via container with ID ");
            AbstractC0412Ji.m855b(new C0240Fi(abstractComponentCallbacksC1503hi2, AbstractC0213Ey.m409g(sb, i, " without using parent's childFragmentManager")));
            AbstractC0412Ji.m854a(abstractComponentCallbacksC1503hi2).getClass();
        }
        ArrayList arrayList = (ArrayList) this.f1109b.f8520a;
        ViewGroup viewGroup = abstractComponentCallbacksC1503hi2.f5295D;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(abstractComponentCallbacksC1503hi2);
            int i2 = iIndexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi5 = (AbstractComponentCallbacksC1503hi) arrayList.get(iIndexOf);
                        if (abstractComponentCallbacksC1503hi5.f5295D == viewGroup && (view = abstractComponentCallbacksC1503hi5.f5296E) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi6 = (AbstractComponentCallbacksC1503hi) arrayList.get(i2);
                    if (abstractComponentCallbacksC1503hi6.f5295D == viewGroup && (view2 = abstractComponentCallbacksC1503hi6.f5296E) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC1503hi2.f5295D.addView(abstractComponentCallbacksC1503hi2.f5296E, iIndexOfChild);
    }

    /* JADX INFO: renamed from: c */
    public final void m696c() {
        C0326Hi c0326Hi;
        boolean zM5374G = AbstractC2805zi.m5374G(3);
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f1110c;
        if (zM5374G) {
            Objects.toString(abstractComponentCallbacksC1503hi);
        }
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = abstractComponentCallbacksC1503hi.f5316g;
        C2428qs c2428qs = this.f1109b;
        if (abstractComponentCallbacksC1503hi2 != null) {
            c0326Hi = (C0326Hi) ((HashMap) c2428qs.f8521b).get(abstractComponentCallbacksC1503hi2.f5314e);
            if (c0326Hi == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC1503hi + " declared target fragment " + abstractComponentCallbacksC1503hi.f5316g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC1503hi.f5317h = abstractComponentCallbacksC1503hi.f5316g.f5314e;
            abstractComponentCallbacksC1503hi.f5316g = null;
        } else {
            String str = abstractComponentCallbacksC1503hi.f5317h;
            if (str != null) {
                c0326Hi = (C0326Hi) ((HashMap) c2428qs.f8521b).get(str);
                if (c0326Hi == null) {
                    StringBuilder sb = new StringBuilder("Fragment ");
                    sb.append(abstractComponentCallbacksC1503hi);
                    sb.append(" declared target fragment ");
                    throw new IllegalStateException(AbstractC0213Ey.m410h(sb, abstractComponentCallbacksC1503hi.f5317h, " that does not belong to this FragmentManager!"));
                }
            } else {
                c0326Hi = null;
            }
        }
        if (c0326Hi != null) {
            c0326Hi.m704k();
        }
        AbstractC2805zi abstractC2805zi = abstractComponentCallbacksC1503hi.f5327r;
        abstractComponentCallbacksC1503hi.f5328s = abstractC2805zi.f9512u;
        abstractComponentCallbacksC1503hi.f5330u = abstractC2805zi.f9514w;
        C0649P3 c0649p3 = this.f1108a;
        c0649p3.m1302t(abstractComponentCallbacksC1503hi, false);
        ArrayList arrayList = abstractComponentCallbacksC1503hi.f5308Q;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi3 = ((C1328di) it.next()).f4804a;
            abstractComponentCallbacksC1503hi3.f5307P.m5268c();
            AbstractC0628Oj.m1246o(abstractComponentCallbacksC1503hi3);
            Bundle bundle = abstractComponentCallbacksC1503hi3.f5311b;
            abstractComponentCallbacksC1503hi3.f5307P.m5269d(bundle != null ? bundle.getBundle("registryState") : null);
        }
        arrayList.clear();
        abstractComponentCallbacksC1503hi.f5329t.m5402b(abstractComponentCallbacksC1503hi.f5328s, abstractComponentCallbacksC1503hi.mo897a(), abstractComponentCallbacksC1503hi);
        abstractComponentCallbacksC1503hi.f5310a = 0;
        abstractComponentCallbacksC1503hi.f5294C = false;
        abstractComponentCallbacksC1503hi.mo899m(abstractComponentCallbacksC1503hi.f5328s.f7401m);
        if (!abstractComponentCallbacksC1503hi.f5294C) {
            throw new C0300Gz("Fragment " + abstractComponentCallbacksC1503hi + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC1503hi.f5327r.f9505n.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0197Ei) it2.next()).mo390a(abstractComponentCallbacksC1503hi);
        }
        C0025Ai c0025Ai = abstractComponentCallbacksC1503hi.f5329t;
        c0025Ai.f9483F = false;
        c0025Ai.f9484G = false;
        c0025Ai.f9490M.f418i = false;
        c0025Ai.m5422t(0);
        c0649p3.m1297n(abstractComponentCallbacksC1503hi, false);
    }

    /* JADX INFO: renamed from: d */
    public final int m697d() {
        C2276nd c2276nd;
        Object next;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f1110c;
        if (abstractComponentCallbacksC1503hi.f5327r == null) {
            return abstractComponentCallbacksC1503hi.f5310a;
        }
        int iMin = this.f1112e;
        int iOrdinal = abstractComponentCallbacksC1503hi.f5303L.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC1503hi.f5322m) {
            if (abstractComponentCallbacksC1503hi.f5323n) {
                iMin = Math.max(this.f1112e, 2);
                View view = abstractComponentCallbacksC1503hi.f5296E;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f1112e < 4 ? Math.min(iMin, abstractComponentCallbacksC1503hi.f5310a) : Math.min(iMin, 1);
            }
        }
        if (!abstractComponentCallbacksC1503hi.f5320k) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC1503hi.f5295D;
        if (viewGroup != null) {
            abstractComponentCallbacksC1503hi.m2872f().m5383F();
            Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
            if (tag instanceof C2276nd) {
                c2276nd = (C2276nd) tag;
            } else {
                c2276nd = new C2276nd(viewGroup);
                viewGroup.setTag(R.id.special_effects_controller_view_tag, c2276nd);
            }
            C0557My c0557MyM4607d = c2276nd.m4607d(abstractComponentCallbacksC1503hi);
            int i = c0557MyM4607d != null ? c0557MyM4607d.f1826b : 0;
            Iterator it = c2276nd.f8011c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                C0557My c0557My = (C0557My) next;
                if (AbstractC0585Nj.m1134a(c0557My.f1827c, abstractComponentCallbacksC1503hi) && !c0557My.f1830f) {
                    break;
                }
            }
            C0557My c0557My2 = (C0557My) next;
            i = c0557My2 != null ? c0557My2.f1826b : 0;
            int i2 = i == 0 ? -1 : AbstractC0600Ny.f1940a[AbstractC0213Ey.m424v(i)];
            if (i2 != -1 && i2 != 1) {
                i = i;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC1503hi.f5321l) {
            iMin = abstractComponentCallbacksC1503hi.m2877k() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC1503hi.f5297F && abstractComponentCallbacksC1503hi.f5310a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (AbstractC2805zi.m5374G(2)) {
            Objects.toString(abstractComponentCallbacksC1503hi);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: e */
    public final void m698e() {
        Bundle bundle;
        boolean zM5374G = AbstractC2805zi.m5374G(3);
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f1110c;
        if (zM5374G) {
            Objects.toString(abstractComponentCallbacksC1503hi);
        }
        Bundle bundle2 = abstractComponentCallbacksC1503hi.f5311b;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC1503hi.f5301J) {
            abstractComponentCallbacksC1503hi.f5310a = 1;
            Bundle bundle4 = abstractComponentCallbacksC1503hi.f5311b;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            abstractComponentCallbacksC1503hi.f5329t.m5393T(bundle);
            C0025Ai c0025Ai = abstractComponentCallbacksC1503hi.f5329t;
            c0025Ai.f9483F = false;
            c0025Ai.f9484G = false;
            c0025Ai.f9490M.f418i = false;
            c0025Ai.m5422t(1);
            return;
        }
        C0649P3 c0649p3 = this.f1108a;
        c0649p3.m1303u(abstractComponentCallbacksC1503hi, bundle3, false);
        abstractComponentCallbacksC1503hi.f5329t.m5387N();
        abstractComponentCallbacksC1503hi.f5310a = 1;
        abstractComponentCallbacksC1503hi.f5294C = false;
        abstractComponentCallbacksC1503hi.f5304M.mo1555a(new C1297cv(3, abstractComponentCallbacksC1503hi));
        abstractComponentCallbacksC1503hi.mo900n(bundle3);
        abstractComponentCallbacksC1503hi.f5301J = true;
        if (abstractComponentCallbacksC1503hi.f5294C) {
            abstractComponentCallbacksC1503hi.f5304M.m2276e(EnumC0632On.ON_CREATE);
            c0649p3.m1298o(abstractComponentCallbacksC1503hi, bundle3, false);
        } else {
            throw new C0300Gz("Fragment " + abstractComponentCallbacksC1503hi + " did not call through to super.onCreate()");
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m699f() {
        String resourceName;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f1110c;
        if (abstractComponentCallbacksC1503hi.f5322m) {
            return;
        }
        int i = 3;
        if (AbstractC2805zi.m5374G(3)) {
            Objects.toString(abstractComponentCallbacksC1503hi);
        }
        Bundle bundle = abstractComponentCallbacksC1503hi.f5311b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterMo903r = abstractComponentCallbacksC1503hi.mo903r(bundle2);
        ViewGroup viewGroup2 = abstractComponentCallbacksC1503hi.f5295D;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i2 = abstractComponentCallbacksC1503hi.f5332w;
            if (i2 != 0) {
                if (i2 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC1503hi + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC1503hi.f5327r.f9513v.mo852y(i2);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC1503hi.f5324o) {
                        try {
                            resourceName = abstractComponentCallbacksC1503hi.m2878y().getResources().getResourceName(abstractComponentCallbacksC1503hi.f5332w);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC1503hi.f5332w) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC1503hi);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C0369Ii c0369Ii = AbstractC0412Ji.f1381a;
                    AbstractC0412Ji.m855b(new C0240Fi(abstractComponentCallbacksC1503hi, "Attempting to add fragment " + abstractComponentCallbacksC1503hi + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    AbstractC0412Ji.m854a(abstractComponentCallbacksC1503hi).getClass();
                }
            }
        }
        abstractComponentCallbacksC1503hi.f5295D = viewGroup;
        abstractComponentCallbacksC1503hi.mo908x(layoutInflaterMo903r, viewGroup, bundle2);
        if (abstractComponentCallbacksC1503hi.f5296E != null) {
            if (AbstractC2805zi.m5374G(3)) {
                Objects.toString(abstractComponentCallbacksC1503hi);
            }
            abstractComponentCallbacksC1503hi.f5296E.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC1503hi.f5296E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC1503hi);
            if (viewGroup != null) {
                m695b();
            }
            if (abstractComponentCallbacksC1503hi.f5334y) {
                abstractComponentCallbacksC1503hi.f5296E.setVisibility(8);
            }
            View view = abstractComponentCallbacksC1503hi.f5296E;
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            if (view.isAttachedToWindow()) {
                AbstractC1255cE.m2370c(abstractComponentCallbacksC1503hi.f5296E);
            } else {
                View view2 = abstractComponentCallbacksC1503hi.f5296E;
                view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0995X6(i, view2));
            }
            Bundle bundle3 = abstractComponentCallbacksC1503hi.f5311b;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            abstractComponentCallbacksC1503hi.f5329t.m5422t(2);
            this.f1108a.m1308z(abstractComponentCallbacksC1503hi, abstractComponentCallbacksC1503hi.f5296E, bundle2, false);
            int visibility = abstractComponentCallbacksC1503hi.f5296E.getVisibility();
            abstractComponentCallbacksC1503hi.m2868b().f5006j = abstractComponentCallbacksC1503hi.f5296E.getAlpha();
            if (abstractComponentCallbacksC1503hi.f5295D != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC1503hi.f5296E.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC1503hi.m2868b().f5007k = viewFindFocus;
                    if (AbstractC2805zi.m5374G(2)) {
                        viewFindFocus.toString();
                        Objects.toString(abstractComponentCallbacksC1503hi);
                    }
                }
                abstractComponentCallbacksC1503hi.f5296E.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC1503hi.f5310a = 2;
    }

    /* JADX INFO: renamed from: g */
    public final void m700g() {
        boolean z;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hiM4876n;
        boolean zM5374G = AbstractC2805zi.m5374G(3);
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f1110c;
        if (zM5374G) {
            Objects.toString(abstractComponentCallbacksC1503hi);
        }
        boolean z2 = abstractComponentCallbacksC1503hi.f5321l && !abstractComponentCallbacksC1503hi.m2877k();
        C2428qs c2428qs = this.f1109b;
        if (z2) {
            c2428qs.m4865D(null, abstractComponentCallbacksC1503hi.f5314e);
        }
        if (!z2) {
            C0154Di c0154Di = (C0154Di) c2428qs.f8523d;
            if (!((c0154Di.f413d.containsKey(abstractComponentCallbacksC1503hi.f5314e) && c0154Di.f416g) ? c0154Di.f417h : true)) {
                String str = abstractComponentCallbacksC1503hi.f5317h;
                if (str != null && (abstractComponentCallbacksC1503hiM4876n = c2428qs.m4876n(str)) != null && abstractComponentCallbacksC1503hiM4876n.f5292A) {
                    abstractComponentCallbacksC1503hi.f5316g = abstractComponentCallbacksC1503hiM4876n;
                }
                abstractComponentCallbacksC1503hi.f5310a = 0;
                return;
            }
        }
        C2104ji c2104ji = abstractComponentCallbacksC1503hi.f5328s;
        if (c2104ji != null) {
            z = ((C0154Di) c2428qs.f8523d).f417h;
        } else {
            z = c2104ji.f7401m != null ? !r7.isChangingConfigurations() : true;
        }
        if (z2 || z) {
            C0154Di c0154Di2 = (C0154Di) c2428qs.f8523d;
            c0154Di2.getClass();
            if (AbstractC2805zi.m5374G(3)) {
                Objects.toString(abstractComponentCallbacksC1503hi);
            }
            c0154Di2.m298c(abstractComponentCallbacksC1503hi.f5314e);
        }
        abstractComponentCallbacksC1503hi.f5329t.m5413k();
        abstractComponentCallbacksC1503hi.f5304M.m2276e(EnumC0632On.ON_DESTROY);
        abstractComponentCallbacksC1503hi.f5310a = 0;
        abstractComponentCallbacksC1503hi.f5301J = false;
        abstractComponentCallbacksC1503hi.f5294C = true;
        this.f1108a.m1299p(abstractComponentCallbacksC1503hi, false);
        for (C0326Hi c0326Hi : c2428qs.m4879q()) {
            if (c0326Hi != null) {
                AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = c0326Hi.f1110c;
                if (abstractComponentCallbacksC1503hi.f5314e.equals(abstractComponentCallbacksC1503hi2.f5317h)) {
                    abstractComponentCallbacksC1503hi2.f5316g = abstractComponentCallbacksC1503hi;
                    abstractComponentCallbacksC1503hi2.f5317h = null;
                }
            }
        }
        String str2 = abstractComponentCallbacksC1503hi.f5317h;
        if (str2 != null) {
            abstractComponentCallbacksC1503hi.f5316g = c2428qs.m4876n(str2);
        }
        c2428qs.m4884v(this);
    }

    /* JADX INFO: renamed from: h */
    public final void m701h() {
        AbstractC2580uE abstractC2580uEMo171a;
        View view;
        boolean zM5374G = AbstractC2805zi.m5374G(3);
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f1110c;
        if (zM5374G) {
            Objects.toString(abstractComponentCallbacksC1503hi);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC1503hi.f5295D;
        if (viewGroup != null && (view = abstractComponentCallbacksC1503hi.f5296E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC1503hi.f5329t.m5422t(1);
        if (abstractComponentCallbacksC1503hi.f5296E != null) {
            C0498Li c0498Li = abstractComponentCallbacksC1503hi.f5305N;
            c0498Li.m962b();
            if (c0498Li.f1631d.f4064c.m1371a(EnumC0675Pn.f2149c)) {
                abstractComponentCallbacksC1503hi.f5305N.m961a(EnumC0632On.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC1503hi.f5310a = 1;
        abstractComponentCallbacksC1503hi.f5294C = false;
        abstractComponentCallbacksC1503hi.mo901p();
        if (!abstractComponentCallbacksC1503hi.f5294C) {
            throw new C0300Gz("Fragment " + abstractComponentCallbacksC1503hi + " did not call through to super.onDestroyView()");
        }
        C2709xE viewModelStore = abstractComponentCallbacksC1503hi.getViewModelStore();
        C2098jc c2098jc = C2098jc.f7385b;
        String canonicalName = C0719Qo.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
        AbstractC2580uE abstractC2580uE = (AbstractC2580uE) viewModelStore.f9284a.get(strConcat);
        boolean zIsInstance = C0719Qo.class.isInstance(abstractC2580uE);
        C0111Ci c0111Ci = C0719Qo.f2303e;
        if (!zIsInstance) {
            C2557ts c2557ts = new C2557ts(c2098jc);
            c2557ts.m5044a(C1456gf.f5170n, strConcat);
            try {
                abstractC2580uEMo171a = c0111Ci.mo2563b(C0719Qo.class, c2557ts);
            } catch (AbstractMethodError unused) {
                abstractC2580uEMo171a = c0111Ci.mo171a(C0719Qo.class);
            }
            abstractC2580uE = abstractC2580uEMo171a;
            AbstractC2580uE abstractC2580uE2 = (AbstractC2580uE) viewModelStore.f9284a.put(strConcat, abstractC2580uE);
            if (abstractC2580uE2 != null) {
                abstractC2580uE2.mo297b();
            }
        }
        C0471Ky c0471Ky = ((C0719Qo) abstractC2580uE).f2304d;
        if (c0471Ky.f1531c > 0) {
            c0471Ky.f1530b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC1503hi.f5325p = false;
        this.f1108a.m1271A(abstractComponentCallbacksC1503hi, false);
        abstractComponentCallbacksC1503hi.f5295D = null;
        abstractComponentCallbacksC1503hi.f5296E = null;
        abstractComponentCallbacksC1503hi.f5305N = null;
        abstractComponentCallbacksC1503hi.f5306O.m5115d(null);
        abstractComponentCallbacksC1503hi.f5323n = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m702i() {
        boolean zM5374G = AbstractC2805zi.m5374G(3);
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f1110c;
        if (zM5374G) {
            Objects.toString(abstractComponentCallbacksC1503hi);
        }
        abstractComponentCallbacksC1503hi.f5310a = -1;
        abstractComponentCallbacksC1503hi.f5294C = false;
        abstractComponentCallbacksC1503hi.mo902q();
        if (!abstractComponentCallbacksC1503hi.f5294C) {
            throw new C0300Gz("Fragment " + abstractComponentCallbacksC1503hi + " did not call through to super.onDetach()");
        }
        C0025Ai c0025Ai = abstractComponentCallbacksC1503hi.f5329t;
        if (!c0025Ai.f9485H) {
            c0025Ai.m5413k();
            abstractComponentCallbacksC1503hi.f5329t = new C0025Ai();
        }
        this.f1108a.m1300q(abstractComponentCallbacksC1503hi, false);
        abstractComponentCallbacksC1503hi.f5310a = -1;
        abstractComponentCallbacksC1503hi.f5328s = null;
        abstractComponentCallbacksC1503hi.f5330u = null;
        abstractComponentCallbacksC1503hi.f5327r = null;
        if (!abstractComponentCallbacksC1503hi.f5321l || abstractComponentCallbacksC1503hi.m2877k()) {
            C0154Di c0154Di = (C0154Di) this.f1109b.f8523d;
            if (!((c0154Di.f413d.containsKey(abstractComponentCallbacksC1503hi.f5314e) && c0154Di.f416g) ? c0154Di.f417h : true)) {
                return;
            }
        }
        if (AbstractC2805zi.m5374G(3)) {
            Objects.toString(abstractComponentCallbacksC1503hi);
        }
        abstractComponentCallbacksC1503hi.m2874h();
    }

    /* JADX INFO: renamed from: j */
    public final void m703j() {
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f1110c;
        if (abstractComponentCallbacksC1503hi.f5322m && abstractComponentCallbacksC1503hi.f5323n && !abstractComponentCallbacksC1503hi.f5325p) {
            if (AbstractC2805zi.m5374G(3)) {
                Objects.toString(abstractComponentCallbacksC1503hi);
            }
            Bundle bundle = abstractComponentCallbacksC1503hi.f5311b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            abstractComponentCallbacksC1503hi.mo908x(abstractComponentCallbacksC1503hi.mo903r(bundle2), null, bundle2);
            View view = abstractComponentCallbacksC1503hi.f5296E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC1503hi.f5296E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC1503hi);
                if (abstractComponentCallbacksC1503hi.f5334y) {
                    abstractComponentCallbacksC1503hi.f5296E.setVisibility(8);
                }
                Bundle bundle3 = abstractComponentCallbacksC1503hi.f5311b;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                abstractComponentCallbacksC1503hi.f5329t.m5422t(2);
                this.f1108a.m1308z(abstractComponentCallbacksC1503hi, abstractComponentCallbacksC1503hi.f5296E, bundle2, false);
                abstractComponentCallbacksC1503hi.f5310a = 2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m704k() {
        ViewGroup viewGroup;
        C2276nd c2276nd;
        ViewGroup viewGroup2;
        C2276nd c2276nd2;
        ViewGroup viewGroup3;
        C2276nd c2276nd3;
        C2428qs c2428qs = this.f1109b;
        boolean z = this.f1111d;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f1110c;
        if (z) {
            if (AbstractC2805zi.m5374G(2)) {
                Objects.toString(abstractComponentCallbacksC1503hi);
                return;
            }
            return;
        }
        try {
            this.f1111d = true;
            boolean z2 = false;
            while (true) {
                int iM697d = m697d();
                int i = abstractComponentCallbacksC1503hi.f5310a;
                int i2 = 3;
                if (iM697d == i) {
                    if (!z2 && i == -1 && abstractComponentCallbacksC1503hi.f5321l && !abstractComponentCallbacksC1503hi.m2877k()) {
                        if (AbstractC2805zi.m5374G(3)) {
                            Objects.toString(abstractComponentCallbacksC1503hi);
                        }
                        C0154Di c0154Di = (C0154Di) c2428qs.f8523d;
                        c0154Di.getClass();
                        if (AbstractC2805zi.m5374G(3)) {
                            Objects.toString(abstractComponentCallbacksC1503hi);
                        }
                        c0154Di.m298c(abstractComponentCallbacksC1503hi.f5314e);
                        c2428qs.m4884v(this);
                        if (AbstractC2805zi.m5374G(3)) {
                            Objects.toString(abstractComponentCallbacksC1503hi);
                        }
                        abstractComponentCallbacksC1503hi.m2874h();
                    }
                    if (abstractComponentCallbacksC1503hi.f5300I) {
                        if (abstractComponentCallbacksC1503hi.f5296E != null && (viewGroup = abstractComponentCallbacksC1503hi.f5295D) != null) {
                            abstractComponentCallbacksC1503hi.m2872f().m5383F();
                            Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                            if (tag instanceof C2276nd) {
                                c2276nd = (C2276nd) tag;
                            } else {
                                c2276nd = new C2276nd(viewGroup);
                                viewGroup.setTag(R.id.special_effects_controller_view_tag, c2276nd);
                            }
                            if (abstractComponentCallbacksC1503hi.f5334y) {
                                if (AbstractC2805zi.m5374G(2)) {
                                    Objects.toString(abstractComponentCallbacksC1503hi);
                                }
                                c2276nd.m4604a(3, 1, this);
                            } else {
                                if (AbstractC2805zi.m5374G(2)) {
                                    Objects.toString(abstractComponentCallbacksC1503hi);
                                }
                                c2276nd.m4604a(2, 1, this);
                            }
                        }
                        AbstractC2805zi abstractC2805zi = abstractComponentCallbacksC1503hi.f5327r;
                        if (abstractC2805zi != null && abstractComponentCallbacksC1503hi.f5320k && AbstractC2805zi.m5375H(abstractComponentCallbacksC1503hi)) {
                            abstractC2805zi.f9482E = true;
                        }
                        abstractComponentCallbacksC1503hi.f5300I = false;
                        abstractComponentCallbacksC1503hi.f5329t.m5416n();
                    }
                    this.f1111d = false;
                    return;
                }
                if (iM697d <= i) {
                    switch (i - 1) {
                        case -1:
                            m702i();
                            break;
                        case 0:
                            m700g();
                            break;
                        case 1:
                            m701h();
                            abstractComponentCallbacksC1503hi.f5310a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC1503hi.f5323n = false;
                            abstractComponentCallbacksC1503hi.f5310a = 2;
                            break;
                        case 3:
                            if (AbstractC2805zi.m5374G(3)) {
                                Objects.toString(abstractComponentCallbacksC1503hi);
                            }
                            if (abstractComponentCallbacksC1503hi.f5296E != null && abstractComponentCallbacksC1503hi.f5312c == null) {
                                m709p();
                            }
                            if (abstractComponentCallbacksC1503hi.f5296E != null && (viewGroup2 = abstractComponentCallbacksC1503hi.f5295D) != null) {
                                abstractComponentCallbacksC1503hi.m2872f().m5383F();
                                Object tag2 = viewGroup2.getTag(R.id.special_effects_controller_view_tag);
                                if (tag2 instanceof C2276nd) {
                                    c2276nd2 = (C2276nd) tag2;
                                } else {
                                    c2276nd2 = new C2276nd(viewGroup2);
                                    viewGroup2.setTag(R.id.special_effects_controller_view_tag, c2276nd2);
                                }
                                if (AbstractC2805zi.m5374G(2)) {
                                    Objects.toString(abstractComponentCallbacksC1503hi);
                                }
                                c2276nd2.m4604a(1, 3, this);
                            }
                            abstractComponentCallbacksC1503hi.f5310a = 3;
                            break;
                        case 4:
                            m711r();
                            break;
                        case 5:
                            abstractComponentCallbacksC1503hi.f5310a = 5;
                            break;
                        case 6:
                            m705l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            m696c();
                            break;
                        case 1:
                            m698e();
                            break;
                        case 2:
                            m703j();
                            m699f();
                            break;
                        case 3:
                            m694a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC1503hi.f5296E != null && (viewGroup3 = abstractComponentCallbacksC1503hi.f5295D) != null) {
                                abstractComponentCallbacksC1503hi.m2872f().m5383F();
                                Object tag3 = viewGroup3.getTag(R.id.special_effects_controller_view_tag);
                                if (tag3 instanceof C2276nd) {
                                    c2276nd3 = (C2276nd) tag3;
                                } else {
                                    c2276nd3 = new C2276nd(viewGroup3);
                                    viewGroup3.setTag(R.id.special_effects_controller_view_tag, c2276nd3);
                                }
                                int visibility = abstractComponentCallbacksC1503hi.f5296E.getVisibility();
                                if (visibility == 0) {
                                    i2 = 2;
                                } else if (visibility == 4) {
                                    i2 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                if (AbstractC2805zi.m5374G(2)) {
                                    Objects.toString(abstractComponentCallbacksC1503hi);
                                }
                                c2276nd3.m4604a(i2, 2, this);
                            }
                            abstractComponentCallbacksC1503hi.f5310a = 4;
                            break;
                        case 5:
                            m710q();
                            break;
                        case 6:
                            abstractComponentCallbacksC1503hi.f5310a = 6;
                            break;
                        case 7:
                            m707n();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.f1111d = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m705l() {
        boolean zM5374G = AbstractC2805zi.m5374G(3);
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f1110c;
        if (zM5374G) {
            Objects.toString(abstractComponentCallbacksC1503hi);
        }
        abstractComponentCallbacksC1503hi.f5329t.m5422t(5);
        if (abstractComponentCallbacksC1503hi.f5296E != null) {
            abstractComponentCallbacksC1503hi.f5305N.m961a(EnumC0632On.ON_PAUSE);
        }
        abstractComponentCallbacksC1503hi.f5304M.m2276e(EnumC0632On.ON_PAUSE);
        abstractComponentCallbacksC1503hi.f5310a = 6;
        abstractComponentCallbacksC1503hi.f5294C = true;
        this.f1108a.m1301s(abstractComponentCallbacksC1503hi, false);
    }

    /* JADX INFO: renamed from: m */
    public final void m706m(ClassLoader classLoader) {
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f1110c;
        Bundle bundle = abstractComponentCallbacksC1503hi.f5311b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC1503hi.f5311b.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC1503hi.f5311b.putBundle("savedInstanceState", new Bundle());
        }
        abstractComponentCallbacksC1503hi.f5312c = abstractComponentCallbacksC1503hi.f5311b.getSparseParcelableArray("viewState");
        abstractComponentCallbacksC1503hi.f5313d = abstractComponentCallbacksC1503hi.f5311b.getBundle("viewRegistryState");
        C0283Gi c0283Gi = (C0283Gi) abstractComponentCallbacksC1503hi.f5311b.getParcelable("state");
        if (c0283Gi != null) {
            abstractComponentCallbacksC1503hi.f5317h = c0283Gi.f921l;
            abstractComponentCallbacksC1503hi.f5318i = c0283Gi.f922m;
            abstractComponentCallbacksC1503hi.f5298G = c0283Gi.f923n;
        }
        if (abstractComponentCallbacksC1503hi.f5298G) {
            return;
        }
        abstractComponentCallbacksC1503hi.f5297F = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m707n() {
        boolean zM5374G = AbstractC2805zi.m5374G(3);
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f1110c;
        if (zM5374G) {
            Objects.toString(abstractComponentCallbacksC1503hi);
        }
        C1415fi c1415fi = abstractComponentCallbacksC1503hi.f5299H;
        View view = c1415fi == null ? null : c1415fi.f5007k;
        if (view != null) {
            if (view == abstractComponentCallbacksC1503hi.f5296E) {
                view.requestFocus();
                if (AbstractC2805zi.m5374G(2)) {
                    view.toString();
                    Objects.toString(abstractComponentCallbacksC1503hi);
                    Objects.toString(abstractComponentCallbacksC1503hi.f5296E.findFocus());
                }
            } else {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == abstractComponentCallbacksC1503hi.f5296E) {
                        view.requestFocus();
                        if (AbstractC2805zi.m5374G(2)) {
                        }
                    }
                }
            }
        }
        abstractComponentCallbacksC1503hi.m2868b().f5007k = null;
        abstractComponentCallbacksC1503hi.f5329t.m5387N();
        abstractComponentCallbacksC1503hi.f5329t.m5427y(true);
        abstractComponentCallbacksC1503hi.f5310a = 7;
        abstractComponentCallbacksC1503hi.f5294C = false;
        abstractComponentCallbacksC1503hi.mo1177s();
        if (!abstractComponentCallbacksC1503hi.f5294C) {
            throw new C0300Gz("Fragment " + abstractComponentCallbacksC1503hi + " did not call through to super.onResume()");
        }
        C1185ao c1185ao = abstractComponentCallbacksC1503hi.f5304M;
        EnumC0632On enumC0632On = EnumC0632On.ON_RESUME;
        c1185ao.m2276e(enumC0632On);
        if (abstractComponentCallbacksC1503hi.f5296E != null) {
            abstractComponentCallbacksC1503hi.f5305N.m961a(enumC0632On);
        }
        C0025Ai c0025Ai = abstractComponentCallbacksC1503hi.f5329t;
        c0025Ai.f9483F = false;
        c0025Ai.f9484G = false;
        c0025Ai.f9490M.f418i = false;
        c0025Ai.m5422t(7);
        this.f1108a.m1304v(abstractComponentCallbacksC1503hi, false);
        this.f1109b.m4865D(null, abstractComponentCallbacksC1503hi.f5314e);
        abstractComponentCallbacksC1503hi.f5311b = null;
        abstractComponentCallbacksC1503hi.f5312c = null;
        abstractComponentCallbacksC1503hi.f5313d = null;
    }

    /* JADX INFO: renamed from: o */
    public final Bundle m708o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f1110c;
        if (abstractComponentCallbacksC1503hi.f5310a == -1 && (bundle = abstractComponentCallbacksC1503hi.f5311b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new C0283Gi(abstractComponentCallbacksC1503hi));
        if (abstractComponentCallbacksC1503hi.f5310a > -1) {
            Bundle bundle3 = new Bundle();
            abstractComponentCallbacksC1503hi.mo904t(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f1108a.m1305w(abstractComponentCallbacksC1503hi, bundle3, false);
            Bundle bundle4 = new Bundle();
            abstractComponentCallbacksC1503hi.f5307P.m5270e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleM5394U = abstractComponentCallbacksC1503hi.f5329t.m5394U();
            if (!bundleM5394U.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleM5394U);
            }
            if (abstractComponentCallbacksC1503hi.f5296E != null) {
                m709p();
            }
            SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC1503hi.f5312c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = abstractComponentCallbacksC1503hi.f5313d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = abstractComponentCallbacksC1503hi.f5315f;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: p */
    public final void m709p() {
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f1110c;
        if (abstractComponentCallbacksC1503hi.f5296E == null) {
            return;
        }
        if (AbstractC2805zi.m5374G(2)) {
            Objects.toString(abstractComponentCallbacksC1503hi);
            Objects.toString(abstractComponentCallbacksC1503hi.f5296E);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC1503hi.f5296E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC1503hi.f5312c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC1503hi.f5305N.f1632e.m5270e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC1503hi.f5313d = bundle;
    }

    /* JADX INFO: renamed from: q */
    public final void m710q() {
        boolean zM5374G = AbstractC2805zi.m5374G(3);
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f1110c;
        if (zM5374G) {
            Objects.toString(abstractComponentCallbacksC1503hi);
        }
        abstractComponentCallbacksC1503hi.f5329t.m5387N();
        abstractComponentCallbacksC1503hi.f5329t.m5427y(true);
        abstractComponentCallbacksC1503hi.f5310a = 5;
        abstractComponentCallbacksC1503hi.f5294C = false;
        abstractComponentCallbacksC1503hi.mo905u();
        if (!abstractComponentCallbacksC1503hi.f5294C) {
            throw new C0300Gz("Fragment " + abstractComponentCallbacksC1503hi + " did not call through to super.onStart()");
        }
        C1185ao c1185ao = abstractComponentCallbacksC1503hi.f5304M;
        EnumC0632On enumC0632On = EnumC0632On.ON_START;
        c1185ao.m2276e(enumC0632On);
        if (abstractComponentCallbacksC1503hi.f5296E != null) {
            abstractComponentCallbacksC1503hi.f5305N.m961a(enumC0632On);
        }
        C0025Ai c0025Ai = abstractComponentCallbacksC1503hi.f5329t;
        c0025Ai.f9483F = false;
        c0025Ai.f9484G = false;
        c0025Ai.f9490M.f418i = false;
        c0025Ai.m5422t(5);
        this.f1108a.m1306x(abstractComponentCallbacksC1503hi, false);
    }

    /* JADX INFO: renamed from: r */
    public final void m711r() {
        boolean zM5374G = AbstractC2805zi.m5374G(3);
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f1110c;
        if (zM5374G) {
            Objects.toString(abstractComponentCallbacksC1503hi);
        }
        C0025Ai c0025Ai = abstractComponentCallbacksC1503hi.f5329t;
        c0025Ai.f9484G = true;
        c0025Ai.f9490M.f418i = true;
        c0025Ai.m5422t(4);
        if (abstractComponentCallbacksC1503hi.f5296E != null) {
            abstractComponentCallbacksC1503hi.f5305N.m961a(EnumC0632On.ON_STOP);
        }
        abstractComponentCallbacksC1503hi.f5304M.m2276e(EnumC0632On.ON_STOP);
        abstractComponentCallbacksC1503hi.f5310a = 4;
        abstractComponentCallbacksC1503hi.f5294C = false;
        abstractComponentCallbacksC1503hi.mo906v();
        if (abstractComponentCallbacksC1503hi.f5294C) {
            this.f1108a.m1307y(abstractComponentCallbacksC1503hi, false);
            return;
        }
        throw new C0300Gz("Fragment " + abstractComponentCallbacksC1503hi + " did not call through to super.onStop()");
    }

    public C0326Hi(C0649P3 c0649p3, C2428qs c2428qs, ClassLoader classLoader, C2547ti c2547ti, Bundle bundle) {
        this.f1108a = c0649p3;
        this.f1109b = c2428qs;
        C0283Gi c0283Gi = (C0283Gi) bundle.getParcelable("state");
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hiM5033a = c2547ti.m5033a(c0283Gi.f910a);
        abstractComponentCallbacksC1503hiM5033a.f5314e = c0283Gi.f911b;
        abstractComponentCallbacksC1503hiM5033a.f5322m = c0283Gi.f912c;
        abstractComponentCallbacksC1503hiM5033a.f5324o = true;
        abstractComponentCallbacksC1503hiM5033a.f5331v = c0283Gi.f913d;
        abstractComponentCallbacksC1503hiM5033a.f5332w = c0283Gi.f914e;
        abstractComponentCallbacksC1503hiM5033a.f5333x = c0283Gi.f915f;
        abstractComponentCallbacksC1503hiM5033a.f5292A = c0283Gi.f916g;
        abstractComponentCallbacksC1503hiM5033a.f5321l = c0283Gi.f917h;
        abstractComponentCallbacksC1503hiM5033a.f5335z = c0283Gi.f918i;
        abstractComponentCallbacksC1503hiM5033a.f5334y = c0283Gi.f919j;
        abstractComponentCallbacksC1503hiM5033a.f5303L = EnumC0675Pn.values()[c0283Gi.f920k];
        abstractComponentCallbacksC1503hiM5033a.f5317h = c0283Gi.f921l;
        abstractComponentCallbacksC1503hiM5033a.f5318i = c0283Gi.f922m;
        abstractComponentCallbacksC1503hiM5033a.f5298G = c0283Gi.f923n;
        this.f1110c = abstractComponentCallbacksC1503hiM5033a;
        abstractComponentCallbacksC1503hiM5033a.f5311b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC1503hiM5033a.m2867B(bundle2);
        if (AbstractC2805zi.m5374G(2)) {
            Objects.toString(abstractComponentCallbacksC1503hiM5033a);
        }
    }

    public C0326Hi(C0649P3 c0649p3, C2428qs c2428qs, AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, Bundle bundle) {
        this.f1108a = c0649p3;
        this.f1109b = c2428qs;
        this.f1110c = abstractComponentCallbacksC1503hi;
        abstractComponentCallbacksC1503hi.f5312c = null;
        abstractComponentCallbacksC1503hi.f5313d = null;
        abstractComponentCallbacksC1503hi.f5326q = 0;
        abstractComponentCallbacksC1503hi.f5323n = false;
        abstractComponentCallbacksC1503hi.f5320k = false;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = abstractComponentCallbacksC1503hi.f5316g;
        abstractComponentCallbacksC1503hi.f5317h = abstractComponentCallbacksC1503hi2 != null ? abstractComponentCallbacksC1503hi2.f5314e : null;
        abstractComponentCallbacksC1503hi.f5316g = null;
        abstractComponentCallbacksC1503hi.f5311b = bundle;
        abstractComponentCallbacksC1503hi.f5315f = bundle.getBundle("arguments");
    }
}

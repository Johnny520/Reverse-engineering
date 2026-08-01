package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0036a;
import com.github.megatronking.stringfog.Base64;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.WeakHashMap;
import p000.AbstractC0346ip;
import p000.AbstractComponentCallbacksC0489ml;
import p000.C0023am;
import p000.C0103cg;
import p000.C0109cm;
import p000.C0138d4;
import p000.C0229fm;
import p000.C0266gm;
import p000.C0526nl;
import p000.C0607pr;
import p000.C0659r5;
import p000.C0705se;
import p000.C0749tl;
import p000.C0819vh;
import p000.C0934yl;
import p000.EnumC0347iq;
import p000.EnumC0383jq;
import p000.InterfaceC0073bm;
import p000.InterfaceC0494mq;
import p000.InterfaceC0568oq;
import p000.ViewOnAttachStateChangeListenerC0156dm;
import p000.e40;
import p000.f50;
import p000.g40;
import p000.ja0;
import p000.pa0;
import p000.ra0;
import p000.v90;
import p000.w90;
import p000.z30;

/* JADX INFO: renamed from: androidx.fragment.app.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0035a {

    /* JADX INFO: renamed from: a */
    public final C0138d4 f504a;

    /* JADX INFO: renamed from: b */
    public final C0659r5 f505b;

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC0489ml f506c;

    /* JADX INFO: renamed from: d */
    public boolean f507d = false;

    /* JADX INFO: renamed from: e */
    public int f508e = -1;

    public C0035a(C0138d4 c0138d4, C0659r5 c0659r5, AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml) {
        this.f504a = c0138d4;
        this.f505b = c0659r5;
        this.f506c = abstractComponentCallbacksC0489ml;
    }

    /* JADX INFO: renamed from: a */
    public final void m254a() {
        boolean zM2689A = C0934yl.m2689A(3);
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = this.f506c;
        if (zM2689A) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0489ml);
        }
        Bundle bundle = abstractComponentCallbacksC0489ml.f3242b;
        abstractComponentCallbacksC0489ml.f3260t.m2695F();
        abstractComponentCallbacksC0489ml.f3241a = 3;
        abstractComponentCallbacksC0489ml.f3227C = true;
        if (C0934yl.m2689A(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0489ml);
        }
        View view = abstractComponentCallbacksC0489ml.f3229E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0489ml.f3242b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0489ml.f3243c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0489ml.f3243c = null;
            }
            if (abstractComponentCallbacksC0489ml.f3229E != null) {
                abstractComponentCallbacksC0489ml.f3237M.f1983c.m1279b(abstractComponentCallbacksC0489ml.f3244d);
                abstractComponentCallbacksC0489ml.f3244d = null;
            }
            abstractComponentCallbacksC0489ml.f3227C = false;
            abstractComponentCallbacksC0489ml.mo1843u(bundle2);
            if (!abstractComponentCallbacksC0489ml.f3227C) {
                throw new f50("Fragment " + abstractComponentCallbacksC0489ml + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0489ml.f3229E != null) {
                abstractComponentCallbacksC0489ml.f3237M.m1233c(EnumC0347iq.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0489ml.f3242b = null;
        C0934yl c0934yl = abstractComponentCallbacksC0489ml.f3260t;
        c0934yl.f5376y = false;
        c0934yl.f5377z = false;
        c0934yl.f5350F.f156h = false;
        c0934yl.m2724p(4);
        this.f504a.m883c(false);
    }

    /* JADX INFO: renamed from: b */
    public final void m255b() {
        View view;
        View view2;
        ArrayList arrayList = (ArrayList) this.f505b.f4210c;
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = this.f506c;
        ViewGroup viewGroup = abstractComponentCallbacksC0489ml.f3228D;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(abstractComponentCallbacksC0489ml);
            int i = iIndexOf - 1;
            while (true) {
                if (i < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml2 = (AbstractComponentCallbacksC0489ml) arrayList.get(iIndexOf);
                        if (abstractComponentCallbacksC0489ml2.f3228D == viewGroup && (view = abstractComponentCallbacksC0489ml2.f3229E) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml3 = (AbstractComponentCallbacksC0489ml) arrayList.get(i);
                    if (abstractComponentCallbacksC0489ml3.f3228D == viewGroup && (view2 = abstractComponentCallbacksC0489ml3.f3229E) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i--;
                }
            }
        }
        abstractComponentCallbacksC0489ml.f3228D.addView(abstractComponentCallbacksC0489ml.f3229E, iIndexOfChild);
    }

    /* JADX INFO: renamed from: c */
    public final void m256c() {
        boolean zM2689A = C0934yl.m2689A(3);
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = this.f506c;
        if (zM2689A) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0489ml);
        }
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml2 = abstractComponentCallbacksC0489ml.f3247g;
        C0659r5 c0659r5 = this.f505b;
        C0035a c0035a = null;
        if (abstractComponentCallbacksC0489ml2 != null) {
            C0035a c0035a2 = (C0035a) ((HashMap) c0659r5.f4209b).get(abstractComponentCallbacksC0489ml2.f3245e);
            if (c0035a2 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0489ml + " declared target fragment " + abstractComponentCallbacksC0489ml.f3247g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0489ml.f3248h = abstractComponentCallbacksC0489ml.f3247g.f3245e;
            abstractComponentCallbacksC0489ml.f3247g = null;
            c0035a = c0035a2;
        } else {
            String str = abstractComponentCallbacksC0489ml.f3248h;
            if (str != null && (c0035a = (C0035a) ((HashMap) c0659r5.f4209b).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC0489ml);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(z30.m2767l(sb, abstractComponentCallbacksC0489ml.f3248h, " that does not belong to this FragmentManager!"));
            }
        }
        if (c0035a != null) {
            c0035a.m264k();
        }
        C0934yl c0934yl = abstractComponentCallbacksC0489ml.f3258r;
        abstractComponentCallbacksC0489ml.f3259s = c0934yl.f5365n;
        abstractComponentCallbacksC0489ml.f3261u = c0934yl.f5367p;
        C0138d4 c0138d4 = this.f504a;
        c0138d4.m889j(false);
        ArrayList arrayList = abstractComponentCallbacksC0489ml.f3240P;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw z30.m2763h(it);
        }
        arrayList.clear();
        abstractComponentCallbacksC0489ml.f3260t.m2710b(abstractComponentCallbacksC0489ml.f3259s, abstractComponentCallbacksC0489ml.mo1832c(), abstractComponentCallbacksC0489ml);
        abstractComponentCallbacksC0489ml.f3241a = 0;
        abstractComponentCallbacksC0489ml.f3227C = false;
        abstractComponentCallbacksC0489ml.mo1839l(abstractComponentCallbacksC0489ml.f3259s.f3428D);
        if (!abstractComponentCallbacksC0489ml.f3227C) {
            throw new f50("Fragment " + abstractComponentCallbacksC0489ml + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0489ml.f3258r.f5363l.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0073bm) it2.next()).mo561a();
        }
        C0934yl c0934yl2 = abstractComponentCallbacksC0489ml.f3260t;
        c0934yl2.f5376y = false;
        c0934yl2.f5377z = false;
        c0934yl2.f5350F.f156h = false;
        c0934yl2.m2724p(0);
        c0138d4.m884e(false);
    }

    /* JADX INFO: renamed from: d */
    public final int m257d() {
        g40 g40Var;
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = this.f506c;
        if (abstractComponentCallbacksC0489ml.f3258r == null) {
            return abstractComponentCallbacksC0489ml.f3241a;
        }
        int iMin = this.f508e;
        int iOrdinal = abstractComponentCallbacksC0489ml.f3235K.ordinal();
        int i = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0489ml.f3253m) {
            if (abstractComponentCallbacksC0489ml.f3254n) {
                iMin = Math.max(this.f508e, 2);
                View view = abstractComponentCallbacksC0489ml.f3229E;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f508e < 4 ? Math.min(iMin, abstractComponentCallbacksC0489ml.f3241a) : Math.min(iMin, 1);
            }
        }
        if (!abstractComponentCallbacksC0489ml.f3251k) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0489ml.f3228D;
        if (viewGroup != null) {
            C0103cg c0103cgM674f = C0103cg.m674f(viewGroup, abstractComponentCallbacksC0489ml.m1837j().m2733y());
            g40 g40VarM678d = c0103cgM674f.m678d(abstractComponentCallbacksC0489ml);
            int i2 = g40VarM678d != null ? g40VarM678d.f2015b : 0;
            ArrayList arrayList = c0103cgM674f.f959c;
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    g40Var = null;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                g40Var = (g40) obj;
                if (g40Var.f2016c.equals(abstractComponentCallbacksC0489ml) && !g40Var.f2019f) {
                    break;
                }
            }
            i = (g40Var == null || !(i2 == 0 || i2 == 1)) ? i2 : g40Var.f2015b;
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC0489ml.f3252l) {
            iMin = abstractComponentCallbacksC0489ml.f3257q > 0 ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0489ml.f3230F && abstractComponentCallbacksC0489ml.f3241a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (C0934yl.m2689A(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC0489ml);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: e */
    public final void m258e() {
        Parcelable parcelable;
        boolean zM2689A = C0934yl.m2689A(3);
        final AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = this.f506c;
        if (zM2689A) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0489ml);
        }
        if (abstractComponentCallbacksC0489ml.f3234J) {
            Bundle bundle = abstractComponentCallbacksC0489ml.f3242b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0489ml.f3260t.m2700K(parcelable);
                C0934yl c0934yl = abstractComponentCallbacksC0489ml.f3260t;
                c0934yl.f5376y = false;
                c0934yl.f5377z = false;
                c0934yl.f5350F.f156h = false;
                c0934yl.m2724p(1);
            }
            abstractComponentCallbacksC0489ml.f3241a = 1;
            return;
        }
        C0138d4 c0138d4 = this.f504a;
        c0138d4.m890k(false);
        Bundle bundle2 = abstractComponentCallbacksC0489ml.f3242b;
        abstractComponentCallbacksC0489ml.f3260t.m2695F();
        abstractComponentCallbacksC0489ml.f3241a = 1;
        abstractComponentCallbacksC0489ml.f3227C = false;
        abstractComponentCallbacksC0489ml.f3236L.m274a(new InterfaceC0494mq() { // from class: androidx.fragment.app.Fragment$5
            @Override // p000.InterfaceC0494mq
            /* JADX INFO: renamed from: b */
            public final void mo124b(InterfaceC0568oq interfaceC0568oq, EnumC0347iq enumC0347iq) {
                View view;
                if (enumC0347iq != EnumC0347iq.ON_STOP || (view = abstractComponentCallbacksC0489ml.f3229E) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        abstractComponentCallbacksC0489ml.f3239O.m1279b(bundle2);
        abstractComponentCallbacksC0489ml.mo574m(bundle2);
        abstractComponentCallbacksC0489ml.f3234J = true;
        if (abstractComponentCallbacksC0489ml.f3227C) {
            abstractComponentCallbacksC0489ml.f3236L.m277d(EnumC0347iq.ON_CREATE);
            c0138d4.m885f(false);
        } else {
            throw new f50("Fragment " + abstractComponentCallbacksC0489ml + " did not call through to super.onCreate()");
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m259f() {
        String resourceName;
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = this.f506c;
        if (abstractComponentCallbacksC0489ml.f3253m) {
            return;
        }
        if (C0934yl.m2689A(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0489ml);
        }
        LayoutInflater layoutInflaterMo1842q = abstractComponentCallbacksC0489ml.mo1842q(abstractComponentCallbacksC0489ml.f3242b);
        ViewGroup viewGroup = abstractComponentCallbacksC0489ml.f3228D;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC0489ml.f3263w;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0489ml + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0489ml.f3258r.f5366o.mo1513G(i);
                if (viewGroup == null && !abstractComponentCallbacksC0489ml.f3255o) {
                    try {
                        resourceName = abstractComponentCallbacksC0489ml.m1848z().getResources().getResourceName(abstractComponentCallbacksC0489ml.f3263w);
                    } catch (Resources.NotFoundException unused) {
                        resourceName = "unknown";
                    }
                    throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0489ml.f3263w) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC0489ml);
                }
            }
        }
        abstractComponentCallbacksC0489ml.f3228D = viewGroup;
        abstractComponentCallbacksC0489ml.mo1844v(layoutInflaterMo1842q, viewGroup, abstractComponentCallbacksC0489ml.f3242b);
        View view = abstractComponentCallbacksC0489ml.f3229E;
        if (view != null) {
            int i2 = 0;
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0489ml.f3229E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0489ml);
            if (viewGroup != null) {
                m255b();
            }
            if (abstractComponentCallbacksC0489ml.f3265y) {
                abstractComponentCallbacksC0489ml.f3229E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0489ml.f3229E;
            WeakHashMap weakHashMap = ja0.f2600a;
            if (v90.m2495b(view2)) {
                w90.m2552c(abstractComponentCallbacksC0489ml.f3229E);
            } else {
                View view3 = abstractComponentCallbacksC0489ml.f3229E;
                view3.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0156dm(view3, i2));
            }
            abstractComponentCallbacksC0489ml.f3260t.m2724p(2);
            this.f504a.m895p(false);
            int visibility = abstractComponentCallbacksC0489ml.f3229E.getVisibility();
            abstractComponentCallbacksC0489ml.m1833f().f3078j = abstractComponentCallbacksC0489ml.f3229E.getAlpha();
            if (abstractComponentCallbacksC0489ml.f3228D != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC0489ml.f3229E.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC0489ml.m1833f().f3079k = viewFindFocus;
                    if (C0934yl.m2689A(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0489ml);
                    }
                }
                abstractComponentCallbacksC0489ml.f3229E.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0489ml.f3241a = 2;
    }

    /* JADX INFO: renamed from: g */
    public final void m260g() {
        boolean z;
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489mlM2228g;
        boolean zM2689A = C0934yl.m2689A(3);
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = this.f506c;
        if (zM2689A) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0489ml);
        }
        int i = 0;
        boolean z2 = abstractComponentCallbacksC0489ml.f3252l && abstractComponentCallbacksC0489ml.f3257q <= 0;
        C0659r5 c0659r5 = this.f505b;
        if (!z2) {
            C0023am c0023am = (C0023am) c0659r5.f4211d;
            if (!((c0023am.f151c.containsKey(abstractComponentCallbacksC0489ml.f3245e) && c0023am.f154f) ? c0023am.f155g : true)) {
                String str = abstractComponentCallbacksC0489ml.f3248h;
                if (str != null && (abstractComponentCallbacksC0489mlM2228g = c0659r5.m2228g(str)) != null && abstractComponentCallbacksC0489mlM2228g.f3225A) {
                    abstractComponentCallbacksC0489ml.f3247g = abstractComponentCallbacksC0489mlM2228g;
                }
                abstractComponentCallbacksC0489ml.f3241a = 0;
                return;
            }
        }
        C0526nl c0526nl = abstractComponentCallbacksC0489ml.f3259s;
        if (c0526nl != null) {
            z = ((C0023am) c0659r5.f4211d).f155g;
        } else {
            z = c0526nl.f3428D != null ? !r7.isChangingConfigurations() : true;
        }
        if (z2 || z) {
            C0023am c0023am2 = (C0023am) c0659r5.f4211d;
            HashMap map = c0023am2.f153e;
            HashMap map2 = c0023am2.f152d;
            if (C0934yl.m2689A(3)) {
                Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0489ml);
            }
            C0023am c0023am3 = (C0023am) map2.get(abstractComponentCallbacksC0489ml.f3245e);
            if (c0023am3 != null) {
                c0023am3.mo113a();
                map2.remove(abstractComponentCallbacksC0489ml.f3245e);
            }
            ra0 ra0Var = (ra0) map.get(abstractComponentCallbacksC0489ml.f3245e);
            if (ra0Var != null) {
                ra0Var.m2285a();
                map.remove(abstractComponentCallbacksC0489ml.f3245e);
            }
        }
        abstractComponentCallbacksC0489ml.f3260t.m2719k();
        abstractComponentCallbacksC0489ml.f3236L.m277d(EnumC0347iq.ON_DESTROY);
        abstractComponentCallbacksC0489ml.f3241a = 0;
        abstractComponentCallbacksC0489ml.f3234J = false;
        abstractComponentCallbacksC0489ml.f3227C = true;
        this.f504a.m886g(false);
        ArrayList arrayListM2230i = c0659r5.m2230i();
        int size = arrayListM2230i.size();
        while (i < size) {
            Object obj = arrayListM2230i.get(i);
            i++;
            C0035a c0035a = (C0035a) obj;
            if (c0035a != null) {
                AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml2 = c0035a.f506c;
                if (abstractComponentCallbacksC0489ml.f3245e.equals(abstractComponentCallbacksC0489ml2.f3248h)) {
                    abstractComponentCallbacksC0489ml2.f3247g = abstractComponentCallbacksC0489ml;
                    abstractComponentCallbacksC0489ml2.f3248h = null;
                }
            }
        }
        String str2 = abstractComponentCallbacksC0489ml.f3248h;
        if (str2 != null) {
            abstractComponentCallbacksC0489ml.f3247g = c0659r5.m2228g(str2);
        }
        c0659r5.m2243w(this);
    }

    /* JADX INFO: renamed from: h */
    public final void m261h() {
        C0607pr c0607pr;
        View view;
        boolean zM2689A = C0934yl.m2689A(3);
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = this.f506c;
        if (zM2689A) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0489ml);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0489ml.f3228D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0489ml.f3229E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0489ml.f3260t.m2724p(1);
        if (abstractComponentCallbacksC0489ml.f3229E != null) {
            C0229fm c0229fm = abstractComponentCallbacksC0489ml.f3237M;
            c0229fm.m1234f();
            if (c0229fm.f1982b.f518c.compareTo(EnumC0383jq.f2658c) >= 0) {
                abstractComponentCallbacksC0489ml.f3237M.m1233c(EnumC0347iq.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0489ml.f3241a = 1;
        abstractComponentCallbacksC0489ml.f3227C = false;
        abstractComponentCallbacksC0489ml.mo1840o();
        if (!abstractComponentCallbacksC0489ml.f3227C) {
            throw new f50("Fragment " + abstractComponentCallbacksC0489ml + " did not call through to super.onDestroyView()");
        }
        ra0 ra0VarMo119d = abstractComponentCallbacksC0489ml.mo119d();
        AbstractC0346ip.m1503o("store", ra0VarMo119d);
        C0705se c0705se = C0705se.f4429b;
        AbstractC0346ip.m1503o("defaultCreationExtras", c0705se);
        String canonicalName = C0607pr.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
        AbstractC0346ip.m1503o("key", strConcat);
        LinkedHashMap linkedHashMap = ra0VarMo119d.f4257a;
        pa0 pa0Var = (pa0) linkedHashMap.get(strConcat);
        if (C0607pr.class.isInstance(pa0Var)) {
            AbstractC0346ip.m1501m("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", pa0Var);
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.putAll(c0705se.f4565a);
            linkedHashMap2.put(C0819vh.f4857p, strConcat);
            try {
                c0607pr = new C0607pr();
            } catch (AbstractMethodError unused) {
                c0607pr = new C0607pr();
            }
            pa0Var = c0607pr;
            pa0 pa0Var2 = (pa0) linkedHashMap.put(strConcat, pa0Var);
            if (pa0Var2 != null) {
                pa0Var2.mo113a();
            }
        }
        e40 e40Var = ((C0607pr) pa0Var).f3923c;
        if (e40Var.f1712c > 0) {
            e40Var.f1711b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0489ml.f3256p = false;
        this.f504a.m896q(false);
        abstractComponentCallbacksC0489ml.f3228D = null;
        abstractComponentCallbacksC0489ml.f3229E = null;
        abstractComponentCallbacksC0489ml.f3237M = null;
        abstractComponentCallbacksC0489ml.f3238N.m286e(null);
        abstractComponentCallbacksC0489ml.f3254n = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m262i() {
        boolean zM2689A = C0934yl.m2689A(3);
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = this.f506c;
        if (zM2689A) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0489ml);
        }
        abstractComponentCallbacksC0489ml.f3241a = -1;
        abstractComponentCallbacksC0489ml.f3227C = false;
        abstractComponentCallbacksC0489ml.mo1841p();
        if (!abstractComponentCallbacksC0489ml.f3227C) {
            throw new f50("Fragment " + abstractComponentCallbacksC0489ml + " did not call through to super.onDetach()");
        }
        C0934yl c0934yl = abstractComponentCallbacksC0489ml.f3260t;
        if (!c0934yl.f5345A) {
            c0934yl.m2719k();
            abstractComponentCallbacksC0489ml.f3260t = new C0934yl();
        }
        this.f504a.m887h(false);
        abstractComponentCallbacksC0489ml.f3241a = -1;
        abstractComponentCallbacksC0489ml.f3259s = null;
        abstractComponentCallbacksC0489ml.f3261u = null;
        abstractComponentCallbacksC0489ml.f3258r = null;
        if (!abstractComponentCallbacksC0489ml.f3252l || abstractComponentCallbacksC0489ml.f3257q > 0) {
            C0023am c0023am = (C0023am) this.f505b.f4211d;
            if (!((c0023am.f151c.containsKey(abstractComponentCallbacksC0489ml.f3245e) && c0023am.f154f) ? c0023am.f155g : true)) {
                return;
            }
        }
        if (C0934yl.m2689A(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0489ml);
        }
        abstractComponentCallbacksC0489ml.f3236L = new C0036a(abstractComponentCallbacksC0489ml);
        abstractComponentCallbacksC0489ml.f3239O = new C0266gm(abstractComponentCallbacksC0489ml);
        abstractComponentCallbacksC0489ml.f3245e = UUID.randomUUID().toString();
        abstractComponentCallbacksC0489ml.f3251k = false;
        abstractComponentCallbacksC0489ml.f3252l = false;
        abstractComponentCallbacksC0489ml.f3253m = false;
        abstractComponentCallbacksC0489ml.f3254n = false;
        abstractComponentCallbacksC0489ml.f3255o = false;
        abstractComponentCallbacksC0489ml.f3257q = 0;
        abstractComponentCallbacksC0489ml.f3258r = null;
        abstractComponentCallbacksC0489ml.f3260t = new C0934yl();
        abstractComponentCallbacksC0489ml.f3259s = null;
        abstractComponentCallbacksC0489ml.f3262v = 0;
        abstractComponentCallbacksC0489ml.f3263w = 0;
        abstractComponentCallbacksC0489ml.f3264x = null;
        abstractComponentCallbacksC0489ml.f3265y = false;
        abstractComponentCallbacksC0489ml.f3266z = false;
    }

    /* JADX INFO: renamed from: j */
    public final void m263j() {
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = this.f506c;
        if (abstractComponentCallbacksC0489ml.f3253m && abstractComponentCallbacksC0489ml.f3254n && !abstractComponentCallbacksC0489ml.f3256p) {
            if (C0934yl.m2689A(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0489ml);
            }
            abstractComponentCallbacksC0489ml.mo1844v(abstractComponentCallbacksC0489ml.mo1842q(abstractComponentCallbacksC0489ml.f3242b), null, abstractComponentCallbacksC0489ml.f3242b);
            View view = abstractComponentCallbacksC0489ml.f3229E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0489ml.f3229E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0489ml);
                if (abstractComponentCallbacksC0489ml.f3265y) {
                    abstractComponentCallbacksC0489ml.f3229E.setVisibility(8);
                }
                abstractComponentCallbacksC0489ml.f3260t.m2724p(2);
                this.f504a.m895p(false);
                abstractComponentCallbacksC0489ml.f3241a = 2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m264k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.f507d;
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = this.f506c;
        if (z) {
            if (C0934yl.m2689A(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0489ml);
                return;
            }
            return;
        }
        try {
            this.f507d = true;
            while (true) {
                int iM257d = m257d();
                int i = abstractComponentCallbacksC0489ml.f3241a;
                if (iM257d == i) {
                    if (abstractComponentCallbacksC0489ml.f3233I) {
                        if (abstractComponentCallbacksC0489ml.f3229E != null && (viewGroup = abstractComponentCallbacksC0489ml.f3228D) != null) {
                            C0103cg c0103cgM674f = C0103cg.m674f(viewGroup, abstractComponentCallbacksC0489ml.m1837j().m2733y());
                            if (abstractComponentCallbacksC0489ml.f3265y) {
                                if (C0934yl.m2689A(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0489ml);
                                }
                                c0103cgM674f.m675a(3, 1, this);
                            } else {
                                if (C0934yl.m2689A(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0489ml);
                                }
                                c0103cgM674f.m675a(2, 1, this);
                            }
                        }
                        C0934yl c0934yl = abstractComponentCallbacksC0489ml.f3258r;
                        if (c0934yl != null && abstractComponentCallbacksC0489ml.f3251k && C0934yl.m2690B(abstractComponentCallbacksC0489ml)) {
                            c0934yl.f5375x = true;
                        }
                        abstractComponentCallbacksC0489ml.f3233I = false;
                    }
                    this.f507d = false;
                    return;
                }
                if (iM257d <= i) {
                    switch (i - 1) {
                        case -1:
                            m262i();
                            break;
                        case Base64.DEFAULT /* 0 */:
                            m260g();
                            break;
                        case Base64.NO_PADDING /* 1 */:
                            m261h();
                            abstractComponentCallbacksC0489ml.f3241a = 1;
                            break;
                        case Base64.NO_WRAP /* 2 */:
                            abstractComponentCallbacksC0489ml.f3254n = false;
                            abstractComponentCallbacksC0489ml.f3241a = 2;
                            break;
                        case 3:
                            if (C0934yl.m2689A(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0489ml);
                            }
                            if (abstractComponentCallbacksC0489ml.f3229E != null && abstractComponentCallbacksC0489ml.f3243c == null) {
                                m268o();
                            }
                            if (abstractComponentCallbacksC0489ml.f3229E != null && (viewGroup3 = abstractComponentCallbacksC0489ml.f3228D) != null) {
                                C0103cg c0103cgM674f2 = C0103cg.m674f(viewGroup3, abstractComponentCallbacksC0489ml.m1837j().m2733y());
                                if (C0934yl.m2689A(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0489ml);
                                }
                                c0103cgM674f2.m675a(1, 3, this);
                            }
                            abstractComponentCallbacksC0489ml.f3241a = 3;
                            break;
                        case 4:
                            m270q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0489ml.f3241a = 5;
                            break;
                        case 6:
                            m265l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case Base64.DEFAULT /* 0 */:
                            m256c();
                            break;
                        case Base64.NO_PADDING /* 1 */:
                            m258e();
                            break;
                        case Base64.NO_WRAP /* 2 */:
                            m263j();
                            m259f();
                            break;
                        case 3:
                            m254a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0489ml.f3229E != null && (viewGroup2 = abstractComponentCallbacksC0489ml.f3228D) != null) {
                                C0103cg c0103cgM674f3 = C0103cg.m674f(viewGroup2, abstractComponentCallbacksC0489ml.m1837j().m2733y());
                                int iM2757b = z30.m2757b(abstractComponentCallbacksC0489ml.f3229E.getVisibility());
                                if (C0934yl.m2689A(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0489ml);
                                }
                                c0103cgM674f3.m675a(iM2757b, 2, this);
                            }
                            abstractComponentCallbacksC0489ml.f3241a = 4;
                            break;
                        case 5:
                            m269p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0489ml.f3241a = 6;
                            break;
                        case 7:
                            m267n();
                            break;
                    }
                }
            }
        } catch (Throwable th) {
            this.f507d = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m265l() {
        boolean zM2689A = C0934yl.m2689A(3);
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = this.f506c;
        if (zM2689A) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0489ml);
        }
        abstractComponentCallbacksC0489ml.f3260t.m2724p(5);
        if (abstractComponentCallbacksC0489ml.f3229E != null) {
            abstractComponentCallbacksC0489ml.f3237M.m1233c(EnumC0347iq.ON_PAUSE);
        }
        abstractComponentCallbacksC0489ml.f3236L.m277d(EnumC0347iq.ON_PAUSE);
        abstractComponentCallbacksC0489ml.f3241a = 6;
        abstractComponentCallbacksC0489ml.f3227C = true;
        this.f504a.m888i(false);
    }

    /* JADX INFO: renamed from: m */
    public final void m266m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = this.f506c;
        Bundle bundle = abstractComponentCallbacksC0489ml.f3242b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0489ml.f3243c = abstractComponentCallbacksC0489ml.f3242b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0489ml.f3244d = abstractComponentCallbacksC0489ml.f3242b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0489ml.f3242b.getString("android:target_state");
        abstractComponentCallbacksC0489ml.f3248h = string;
        if (string != null) {
            abstractComponentCallbacksC0489ml.f3249i = abstractComponentCallbacksC0489ml.f3242b.getInt("android:target_req_state", 0);
        }
        boolean z = abstractComponentCallbacksC0489ml.f3242b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0489ml.f3231G = z;
        if (z) {
            return;
        }
        abstractComponentCallbacksC0489ml.f3230F = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m267n() {
        /*
            r7 = this;
            r0 = 3
            boolean r0 = p000.C0934yl.m2689A(r0)
            java.lang.String r1 = "FragmentManager"
            ml r2 = r7.f506c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            ll r0 = r2.f3232H
            r3 = 0
            if (r0 != 0) goto L23
            r0 = r3
            goto L25
        L23:
            android.view.View r0 = r0.f3079k
        L25:
            if (r0 == 0) goto L7d
            android.view.View r4 = r2.f3229E
            if (r0 != r4) goto L2c
            goto L36
        L2c:
            android.view.ViewParent r4 = r0.getParent()
        L30:
            if (r4 == 0) goto L7d
            android.view.View r5 = r2.f3229E
            if (r4 != r5) goto L78
        L36:
            boolean r4 = r0.requestFocus()
            r5 = 2
            boolean r5 = p000.C0934yl.m2689A(r5)
            if (r5 == 0) goto L7d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "requestFocus: Restoring focused view "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = " "
            r5.append(r0)
            if (r4 == 0) goto L55
            java.lang.String r0 = "succeeded"
            goto L57
        L55:
            java.lang.String r0 = "failed"
        L57:
            r5.append(r0)
            java.lang.String r0 = " on Fragment "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r5.append(r0)
            android.view.View r0 = r2.f3229E
            android.view.View r0 = r0.findFocus()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.v(r1, r0)
            goto L7d
        L78:
            android.view.ViewParent r4 = r4.getParent()
            goto L30
        L7d:
            ll r0 = r2.m1833f()
            r0.f3079k = r3
            yl r0 = r2.f3260t
            r0.m2695F()
            yl r0 = r2.f3260t
            r1 = 1
            r0.m2728t(r1)
            r0 = 7
            r2.f3241a = r0
            r2.f3227C = r1
            androidx.lifecycle.a r1 = r2.f3236L
            iq r4 = p000.EnumC0347iq.ON_RESUME
            r1.m277d(r4)
            android.view.View r1 = r2.f3229E
            if (r1 == 0) goto La5
            fm r1 = r2.f3237M
            androidx.lifecycle.a r1 = r1.f1982b
            r1.m277d(r4)
        La5:
            yl r1 = r2.f3260t
            r4 = 0
            r1.f5376y = r4
            r1.f5377z = r4
            am r5 = r1.f5350F
            r5.f156h = r4
            r1.m2724p(r0)
            d4 r0 = r7.f504a
            r0.m891l(r4)
            r2.f3242b = r3
            r2.f3243c = r3
            r2.f3244d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0035a.m267n():void");
    }

    /* JADX INFO: renamed from: o */
    public final void m268o() {
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = this.f506c;
        if (abstractComponentCallbacksC0489ml.f3229E == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0489ml.f3229E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0489ml.f3243c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0489ml.f3237M.f1983c.m1280c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0489ml.f3244d = bundle;
    }

    /* JADX INFO: renamed from: p */
    public final void m269p() {
        boolean zM2689A = C0934yl.m2689A(3);
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = this.f506c;
        if (zM2689A) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0489ml);
        }
        abstractComponentCallbacksC0489ml.f3260t.m2695F();
        abstractComponentCallbacksC0489ml.f3260t.m2728t(true);
        abstractComponentCallbacksC0489ml.f3241a = 5;
        abstractComponentCallbacksC0489ml.f3227C = false;
        abstractComponentCallbacksC0489ml.mo577s();
        if (!abstractComponentCallbacksC0489ml.f3227C) {
            throw new f50("Fragment " + abstractComponentCallbacksC0489ml + " did not call through to super.onStart()");
        }
        C0036a c0036a = abstractComponentCallbacksC0489ml.f3236L;
        EnumC0347iq enumC0347iq = EnumC0347iq.ON_START;
        c0036a.m277d(enumC0347iq);
        if (abstractComponentCallbacksC0489ml.f3229E != null) {
            abstractComponentCallbacksC0489ml.f3237M.f1982b.m277d(enumC0347iq);
        }
        C0934yl c0934yl = abstractComponentCallbacksC0489ml.f3260t;
        c0934yl.f5376y = false;
        c0934yl.f5377z = false;
        c0934yl.f5350F.f156h = false;
        c0934yl.m2724p(5);
        this.f504a.m893n(false);
    }

    /* JADX INFO: renamed from: q */
    public final void m270q() {
        boolean zM2689A = C0934yl.m2689A(3);
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = this.f506c;
        if (zM2689A) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0489ml);
        }
        C0934yl c0934yl = abstractComponentCallbacksC0489ml.f3260t;
        c0934yl.f5377z = true;
        c0934yl.f5350F.f156h = true;
        c0934yl.m2724p(4);
        if (abstractComponentCallbacksC0489ml.f3229E != null) {
            abstractComponentCallbacksC0489ml.f3237M.m1233c(EnumC0347iq.ON_STOP);
        }
        abstractComponentCallbacksC0489ml.f3236L.m277d(EnumC0347iq.ON_STOP);
        abstractComponentCallbacksC0489ml.f3241a = 4;
        abstractComponentCallbacksC0489ml.f3227C = false;
        abstractComponentCallbacksC0489ml.mo578t();
        if (abstractComponentCallbacksC0489ml.f3227C) {
            this.f504a.m894o(false);
            return;
        }
        throw new f50("Fragment " + abstractComponentCallbacksC0489ml + " did not call through to super.onStop()");
    }

    public C0035a(C0138d4 c0138d4, C0659r5 c0659r5, ClassLoader classLoader, C0749tl c0749tl, C0109cm c0109cm) {
        this.f504a = c0138d4;
        this.f505b = c0659r5;
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489mlM2381a = c0749tl.m2381a(c0109cm.f967a);
        this.f506c = abstractComponentCallbacksC0489mlM2381a;
        Bundle bundle = c0109cm.f976j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC0489mlM2381a.m1831C(bundle);
        abstractComponentCallbacksC0489mlM2381a.f3245e = c0109cm.f968b;
        abstractComponentCallbacksC0489mlM2381a.f3253m = c0109cm.f969c;
        abstractComponentCallbacksC0489mlM2381a.f3255o = true;
        abstractComponentCallbacksC0489mlM2381a.f3262v = c0109cm.f970d;
        abstractComponentCallbacksC0489mlM2381a.f3263w = c0109cm.f971e;
        abstractComponentCallbacksC0489mlM2381a.f3264x = c0109cm.f972f;
        abstractComponentCallbacksC0489mlM2381a.f3225A = c0109cm.f973g;
        abstractComponentCallbacksC0489mlM2381a.f3252l = c0109cm.f974h;
        abstractComponentCallbacksC0489mlM2381a.f3266z = c0109cm.f975i;
        abstractComponentCallbacksC0489mlM2381a.f3265y = c0109cm.f977k;
        abstractComponentCallbacksC0489mlM2381a.f3235K = EnumC0383jq.values()[c0109cm.f978l];
        Bundle bundle2 = c0109cm.f979m;
        if (bundle2 != null) {
            abstractComponentCallbacksC0489mlM2381a.f3242b = bundle2;
        } else {
            abstractComponentCallbacksC0489mlM2381a.f3242b = new Bundle();
        }
        if (C0934yl.m2689A(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC0489mlM2381a);
        }
    }

    public C0035a(C0138d4 c0138d4, C0659r5 c0659r5, AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml, C0109cm c0109cm) {
        this.f504a = c0138d4;
        this.f505b = c0659r5;
        this.f506c = abstractComponentCallbacksC0489ml;
        abstractComponentCallbacksC0489ml.f3243c = null;
        abstractComponentCallbacksC0489ml.f3244d = null;
        abstractComponentCallbacksC0489ml.f3257q = 0;
        abstractComponentCallbacksC0489ml.f3254n = false;
        abstractComponentCallbacksC0489ml.f3251k = false;
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml2 = abstractComponentCallbacksC0489ml.f3247g;
        abstractComponentCallbacksC0489ml.f3248h = abstractComponentCallbacksC0489ml2 != null ? abstractComponentCallbacksC0489ml2.f3245e : null;
        abstractComponentCallbacksC0489ml.f3247g = null;
        Bundle bundle = c0109cm.f979m;
        if (bundle != null) {
            abstractComponentCallbacksC0489ml.f3242b = bundle;
        } else {
            abstractComponentCallbacksC0489ml.f3242b = new Bundle();
        }
    }
}

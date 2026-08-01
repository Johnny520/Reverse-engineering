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
import p000.AbstractC0493mp;
import p000.AbstractComponentCallbacksC0563ol;
import p000.C0023am;
import p000.C0109cm;
import p000.C0138d4;
import p000.C0150dg;
import p000.C0192em;
import p000.C0303hm;
import p000.C0339im;
import p000.C0600pl;
import p000.C0658r5;
import p000.C0741te;
import p000.C0754tr;
import p000.C0822vl;
import p000.C0893xh;
import p000.EnumC0494mq;
import p000.EnumC0531nq;
import p000.InterfaceC0156dm;
import p000.InterfaceC0642qq;
import p000.InterfaceC0716sq;
import p000.ViewOnAttachStateChangeListenerC0229fm;
import p000.aa0;
import p000.ba0;
import p000.g40;
import p000.l40;
import p000.m50;
import p000.n40;
import p000.oa0;
import p000.ua0;
import p000.wa0;

/* JADX INFO: renamed from: androidx.fragment.app.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0035a {

    /* JADX INFO: renamed from: a */
    public final C0138d4 f467a;

    /* JADX INFO: renamed from: b */
    public final C0658r5 f468b;

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC0563ol f469c;

    /* JADX INFO: renamed from: d */
    public boolean f470d = false;

    /* JADX INFO: renamed from: e */
    public int f471e = -1;

    public C0035a(C0138d4 c0138d4, C0658r5 c0658r5, AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol) {
        this.f467a = c0138d4;
        this.f468b = c0658r5;
        this.f469c = abstractComponentCallbacksC0563ol;
    }

    /* JADX INFO: renamed from: a */
    public final void m239a() {
        boolean zM55A = C0023am.m55A(3);
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = this.f469c;
        if (zM55A) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0563ol);
        }
        Bundle bundle = abstractComponentCallbacksC0563ol.f3487b;
        abstractComponentCallbacksC0563ol.f3505t.m61F();
        abstractComponentCallbacksC0563ol.f3486a = 3;
        abstractComponentCallbacksC0563ol.f3472C = true;
        if (C0023am.m55A(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0563ol);
        }
        View view = abstractComponentCallbacksC0563ol.f3474E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0563ol.f3487b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0563ol.f3488c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0563ol.f3488c = null;
            }
            if (abstractComponentCallbacksC0563ol.f3474E != null) {
                abstractComponentCallbacksC0563ol.f3482M.f2242c.m1504b(abstractComponentCallbacksC0563ol.f3489d);
                abstractComponentCallbacksC0563ol.f3489d = null;
            }
            abstractComponentCallbacksC0563ol.f3472C = false;
            abstractComponentCallbacksC0563ol.mo2045u(bundle2);
            if (!abstractComponentCallbacksC0563ol.f3472C) {
                throw new m50("Fragment " + abstractComponentCallbacksC0563ol + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0563ol.f3474E != null) {
                abstractComponentCallbacksC0563ol.f3482M.m1406c(EnumC0494mq.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0563ol.f3487b = null;
        C0023am c0023am = abstractComponentCallbacksC0563ol.f3505t;
        c0023am.f118y = false;
        c0023am.f119z = false;
        c0023am.f92F.f909h = false;
        c0023am.m90p(4);
        this.f467a.m842c(false);
    }

    /* JADX INFO: renamed from: b */
    public final void m240b() {
        View view;
        View view2;
        ArrayList arrayList = (ArrayList) this.f468b.f4065c;
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = this.f469c;
        ViewGroup viewGroup = abstractComponentCallbacksC0563ol.f3473D;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(abstractComponentCallbacksC0563ol);
            int i = iIndexOf - 1;
            while (true) {
                if (i < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol2 = (AbstractComponentCallbacksC0563ol) arrayList.get(iIndexOf);
                        if (abstractComponentCallbacksC0563ol2.f3473D == viewGroup && (view = abstractComponentCallbacksC0563ol2.f3474E) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol3 = (AbstractComponentCallbacksC0563ol) arrayList.get(i);
                    if (abstractComponentCallbacksC0563ol3.f3473D == viewGroup && (view2 = abstractComponentCallbacksC0563ol3.f3474E) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i--;
                }
            }
        }
        abstractComponentCallbacksC0563ol.f3473D.addView(abstractComponentCallbacksC0563ol.f3474E, iIndexOfChild);
    }

    /* JADX INFO: renamed from: c */
    public final void m241c() {
        boolean zM55A = C0023am.m55A(3);
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = this.f469c;
        if (zM55A) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0563ol);
        }
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol2 = abstractComponentCallbacksC0563ol.f3492g;
        C0658r5 c0658r5 = this.f468b;
        C0035a c0035a = null;
        if (abstractComponentCallbacksC0563ol2 != null) {
            C0035a c0035a2 = (C0035a) ((HashMap) c0658r5.f4064b).get(abstractComponentCallbacksC0563ol2.f3490e);
            if (c0035a2 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0563ol + " declared target fragment " + abstractComponentCallbacksC0563ol.f3492g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0563ol.f3493h = abstractComponentCallbacksC0563ol.f3492g.f3490e;
            abstractComponentCallbacksC0563ol.f3492g = null;
            c0035a = c0035a2;
        } else {
            String str = abstractComponentCallbacksC0563ol.f3493h;
            if (str != null && (c0035a = (C0035a) ((HashMap) c0658r5.f4064b).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC0563ol);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(g40.m1149l(sb, abstractComponentCallbacksC0563ol.f3493h, " that does not belong to this FragmentManager!"));
            }
        }
        if (c0035a != null) {
            c0035a.m249k();
        }
        C0023am c0023am = abstractComponentCallbacksC0563ol.f3503r;
        abstractComponentCallbacksC0563ol.f3504s = c0023am.f107n;
        abstractComponentCallbacksC0563ol.f3506u = c0023am.f109p;
        C0138d4 c0138d4 = this.f467a;
        c0138d4.m849j(false);
        ArrayList arrayList = abstractComponentCallbacksC0563ol.f3485P;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw g40.m1145h(it);
        }
        arrayList.clear();
        abstractComponentCallbacksC0563ol.f3505t.m76b(abstractComponentCallbacksC0563ol.f3504s, abstractComponentCallbacksC0563ol.mo2034c(), abstractComponentCallbacksC0563ol);
        abstractComponentCallbacksC0563ol.f3486a = 0;
        abstractComponentCallbacksC0563ol.f3472C = false;
        abstractComponentCallbacksC0563ol.mo2041l(abstractComponentCallbacksC0563ol.f3504s.f3728z);
        if (!abstractComponentCallbacksC0563ol.f3472C) {
            throw new m50("Fragment " + abstractComponentCallbacksC0563ol + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0563ol.f3503r.f105l.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0156dm) it2.next()).mo928a();
        }
        C0023am c0023am2 = abstractComponentCallbacksC0563ol.f3505t;
        c0023am2.f118y = false;
        c0023am2.f119z = false;
        c0023am2.f92F.f909h = false;
        c0023am2.m90p(0);
        c0138d4.m843d(false);
    }

    /* JADX INFO: renamed from: d */
    public final int m242d() {
        n40 n40Var;
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = this.f469c;
        if (abstractComponentCallbacksC0563ol.f3503r == null) {
            return abstractComponentCallbacksC0563ol.f3486a;
        }
        int iMin = this.f471e;
        int iOrdinal = abstractComponentCallbacksC0563ol.f3480K.ordinal();
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
        if (abstractComponentCallbacksC0563ol.f3498m) {
            if (abstractComponentCallbacksC0563ol.f3499n) {
                iMin = Math.max(this.f471e, 2);
                View view = abstractComponentCallbacksC0563ol.f3474E;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f471e < 4 ? Math.min(iMin, abstractComponentCallbacksC0563ol.f3486a) : Math.min(iMin, 1);
            }
        }
        if (!abstractComponentCallbacksC0563ol.f3496k) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0563ol.f3473D;
        if (viewGroup != null) {
            C0150dg c0150dgM915f = C0150dg.m915f(viewGroup, abstractComponentCallbacksC0563ol.m2039j().m99y());
            n40 n40VarM919d = c0150dgM915f.m919d(abstractComponentCallbacksC0563ol);
            int i2 = n40VarM919d != null ? n40VarM919d.f3215b : 0;
            ArrayList arrayList = c0150dgM915f.f1392c;
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    n40Var = null;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                n40Var = (n40) obj;
                if (n40Var.f3216c.equals(abstractComponentCallbacksC0563ol) && !n40Var.f3219f) {
                    break;
                }
            }
            i = (n40Var == null || !(i2 == 0 || i2 == 1)) ? i2 : n40Var.f3215b;
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC0563ol.f3497l) {
            iMin = abstractComponentCallbacksC0563ol.f3502q > 0 ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0563ol.f3475F && abstractComponentCallbacksC0563ol.f3486a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (C0023am.m55A(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC0563ol);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: e */
    public final void m243e() {
        Parcelable parcelable;
        boolean zM55A = C0023am.m55A(3);
        final AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = this.f469c;
        if (zM55A) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0563ol);
        }
        if (abstractComponentCallbacksC0563ol.f3479J) {
            Bundle bundle = abstractComponentCallbacksC0563ol.f3487b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0563ol.f3505t.m66K(parcelable);
                C0023am c0023am = abstractComponentCallbacksC0563ol.f3505t;
                c0023am.f118y = false;
                c0023am.f119z = false;
                c0023am.f92F.f909h = false;
                c0023am.m90p(1);
            }
            abstractComponentCallbacksC0563ol.f3486a = 1;
            return;
        }
        C0138d4 c0138d4 = this.f467a;
        c0138d4.m850k(false);
        Bundle bundle2 = abstractComponentCallbacksC0563ol.f3487b;
        abstractComponentCallbacksC0563ol.f3505t.m61F();
        abstractComponentCallbacksC0563ol.f3486a = 1;
        abstractComponentCallbacksC0563ol.f3472C = false;
        abstractComponentCallbacksC0563ol.f3481L.m259a(new InterfaceC0642qq() { // from class: androidx.fragment.app.Fragment$5
            @Override // p000.InterfaceC0642qq
            /* JADX INFO: renamed from: b */
            public final void mo109b(InterfaceC0716sq interfaceC0716sq, EnumC0494mq enumC0494mq) {
                View view;
                if (enumC0494mq != EnumC0494mq.ON_STOP || (view = abstractComponentCallbacksC0563ol.f3474E) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        abstractComponentCallbacksC0563ol.f3484O.m1504b(bundle2);
        abstractComponentCallbacksC0563ol.mo1023m(bundle2);
        abstractComponentCallbacksC0563ol.f3479J = true;
        if (abstractComponentCallbacksC0563ol.f3472C) {
            abstractComponentCallbacksC0563ol.f3481L.m262d(EnumC0494mq.ON_CREATE);
            c0138d4.m845f(false);
        } else {
            throw new m50("Fragment " + abstractComponentCallbacksC0563ol + " did not call through to super.onCreate()");
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m244f() {
        String resourceName;
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = this.f469c;
        if (abstractComponentCallbacksC0563ol.f3498m) {
            return;
        }
        if (C0023am.m55A(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0563ol);
        }
        LayoutInflater layoutInflaterMo2044q = abstractComponentCallbacksC0563ol.mo2044q(abstractComponentCallbacksC0563ol.f3487b);
        ViewGroup viewGroup = abstractComponentCallbacksC0563ol.f3473D;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC0563ol.f3508w;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0563ol + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0563ol.f3503r.f108o.mo1264K(i);
                if (viewGroup == null && !abstractComponentCallbacksC0563ol.f3500o) {
                    try {
                        resourceName = abstractComponentCallbacksC0563ol.m2050z().getResources().getResourceName(abstractComponentCallbacksC0563ol.f3508w);
                    } catch (Resources.NotFoundException unused) {
                        resourceName = "unknown";
                    }
                    throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0563ol.f3508w) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC0563ol);
                }
            }
        }
        abstractComponentCallbacksC0563ol.f3473D = viewGroup;
        abstractComponentCallbacksC0563ol.mo2046v(layoutInflaterMo2044q, viewGroup, abstractComponentCallbacksC0563ol.f3487b);
        View view = abstractComponentCallbacksC0563ol.f3474E;
        if (view != null) {
            int i2 = 0;
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0563ol.f3474E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0563ol);
            if (viewGroup != null) {
                m240b();
            }
            if (abstractComponentCallbacksC0563ol.f3510y) {
                abstractComponentCallbacksC0563ol.f3474E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0563ol.f3474E;
            WeakHashMap weakHashMap = oa0.f3426a;
            if (aa0.m39b(view2)) {
                ba0.m506c(abstractComponentCallbacksC0563ol.f3474E);
            } else {
                View view3 = abstractComponentCallbacksC0563ol.f3474E;
                view3.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0229fm(view3, i2));
            }
            abstractComponentCallbacksC0563ol.f3505t.m90p(2);
            this.f467a.m855p(false);
            int visibility = abstractComponentCallbacksC0563ol.f3474E.getVisibility();
            abstractComponentCallbacksC0563ol.m2035f().f3318j = abstractComponentCallbacksC0563ol.f3474E.getAlpha();
            if (abstractComponentCallbacksC0563ol.f3473D != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC0563ol.f3474E.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC0563ol.m2035f().f3319k = viewFindFocus;
                    if (C0023am.m55A(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0563ol);
                    }
                }
                abstractComponentCallbacksC0563ol.f3474E.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0563ol.f3486a = 2;
    }

    /* JADX INFO: renamed from: g */
    public final void m245g() {
        boolean z;
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563olM2235g;
        boolean zM55A = C0023am.m55A(3);
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = this.f469c;
        if (zM55A) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0563ol);
        }
        int i = 0;
        boolean z2 = abstractComponentCallbacksC0563ol.f3497l && abstractComponentCallbacksC0563ol.f3502q <= 0;
        C0658r5 c0658r5 = this.f468b;
        if (!z2) {
            C0109cm c0109cm = (C0109cm) c0658r5.f4066d;
            if (!((c0109cm.f904c.containsKey(abstractComponentCallbacksC0563ol.f3490e) && c0109cm.f907f) ? c0109cm.f908g : true)) {
                String str = abstractComponentCallbacksC0563ol.f3493h;
                if (str != null && (abstractComponentCallbacksC0563olM2235g = c0658r5.m2235g(str)) != null && abstractComponentCallbacksC0563olM2235g.f3470A) {
                    abstractComponentCallbacksC0563ol.f3492g = abstractComponentCallbacksC0563olM2235g;
                }
                abstractComponentCallbacksC0563ol.f3486a = 0;
                return;
            }
        }
        C0600pl c0600pl = abstractComponentCallbacksC0563ol.f3504s;
        if (c0600pl != null) {
            z = ((C0109cm) c0658r5.f4066d).f908g;
        } else {
            z = c0600pl.f3728z != null ? !r7.isChangingConfigurations() : true;
        }
        if (z2 || z) {
            C0109cm c0109cm2 = (C0109cm) c0658r5.f4066d;
            HashMap map = c0109cm2.f906e;
            HashMap map2 = c0109cm2.f905d;
            if (C0023am.m55A(3)) {
                Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0563ol);
            }
            C0109cm c0109cm3 = (C0109cm) map2.get(abstractComponentCallbacksC0563ol.f3490e);
            if (c0109cm3 != null) {
                c0109cm3.mo651a();
                map2.remove(abstractComponentCallbacksC0563ol.f3490e);
            }
            wa0 wa0Var = (wa0) map.get(abstractComponentCallbacksC0563ol.f3490e);
            if (wa0Var != null) {
                wa0Var.m2603a();
                map.remove(abstractComponentCallbacksC0563ol.f3490e);
            }
        }
        abstractComponentCallbacksC0563ol.f3505t.m85k();
        abstractComponentCallbacksC0563ol.f3481L.m262d(EnumC0494mq.ON_DESTROY);
        abstractComponentCallbacksC0563ol.f3486a = 0;
        abstractComponentCallbacksC0563ol.f3479J = false;
        abstractComponentCallbacksC0563ol.f3472C = true;
        this.f467a.m846g(false);
        ArrayList arrayListM2237i = c0658r5.m2237i();
        int size = arrayListM2237i.size();
        while (i < size) {
            Object obj = arrayListM2237i.get(i);
            i++;
            C0035a c0035a = (C0035a) obj;
            if (c0035a != null) {
                AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol2 = c0035a.f469c;
                if (abstractComponentCallbacksC0563ol.f3490e.equals(abstractComponentCallbacksC0563ol2.f3493h)) {
                    abstractComponentCallbacksC0563ol2.f3492g = abstractComponentCallbacksC0563ol;
                    abstractComponentCallbacksC0563ol2.f3493h = null;
                }
            }
        }
        String str2 = abstractComponentCallbacksC0563ol.f3493h;
        if (str2 != null) {
            abstractComponentCallbacksC0563ol.f3492g = c0658r5.m2235g(str2);
        }
        c0658r5.m2250w(this);
    }

    /* JADX INFO: renamed from: h */
    public final void m246h() {
        C0754tr c0754tr;
        View view;
        boolean zM55A = C0023am.m55A(3);
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = this.f469c;
        if (zM55A) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0563ol);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0563ol.f3473D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0563ol.f3474E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0563ol.f3505t.m90p(1);
        if (abstractComponentCallbacksC0563ol.f3474E != null) {
            C0303hm c0303hm = abstractComponentCallbacksC0563ol.f3482M;
            c0303hm.m1407f();
            if (c0303hm.f2241b.f481c.compareTo(EnumC0531nq.f3331c) >= 0) {
                abstractComponentCallbacksC0563ol.f3482M.m1406c(EnumC0494mq.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0563ol.f3486a = 1;
        abstractComponentCallbacksC0563ol.f3472C = false;
        abstractComponentCallbacksC0563ol.mo2042o();
        if (!abstractComponentCallbacksC0563ol.f3472C) {
            throw new m50("Fragment " + abstractComponentCallbacksC0563ol + " did not call through to super.onDestroyView()");
        }
        wa0 wa0VarMo104d = abstractComponentCallbacksC0563ol.mo104d();
        AbstractC0493mp.m1857g("store", wa0VarMo104d);
        C0741te c0741te = C0741te.f4503b;
        AbstractC0493mp.m1857g("defaultCreationExtras", c0741te);
        String canonicalName = C0754tr.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
        AbstractC0493mp.m1857g("key", strConcat);
        LinkedHashMap linkedHashMap = wa0VarMo104d.f5077a;
        ua0 ua0Var = (ua0) linkedHashMap.get(strConcat);
        if (C0754tr.class.isInstance(ua0Var)) {
            AbstractC0493mp.m1855e("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", ua0Var);
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.putAll(c0741te.f4820a);
            linkedHashMap2.put(C0893xh.f5260p, strConcat);
            try {
                c0754tr = new C0754tr();
            } catch (AbstractMethodError unused) {
                c0754tr = new C0754tr();
            }
            ua0Var = c0754tr;
            ua0 ua0Var2 = (ua0) linkedHashMap.put(strConcat, ua0Var);
            if (ua0Var2 != null) {
                ua0Var2.mo651a();
            }
        }
        l40 l40Var = ((C0754tr) ua0Var).f4573c;
        if (l40Var.f2919c > 0) {
            l40Var.f2918b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0563ol.f3501p = false;
        this.f467a.m856q(false);
        abstractComponentCallbacksC0563ol.f3473D = null;
        abstractComponentCallbacksC0563ol.f3474E = null;
        abstractComponentCallbacksC0563ol.f3482M = null;
        abstractComponentCallbacksC0563ol.f3483N.m271e(null);
        abstractComponentCallbacksC0563ol.f3499n = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m247i() {
        boolean zM55A = C0023am.m55A(3);
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = this.f469c;
        if (zM55A) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0563ol);
        }
        abstractComponentCallbacksC0563ol.f3486a = -1;
        abstractComponentCallbacksC0563ol.f3472C = false;
        abstractComponentCallbacksC0563ol.mo2043p();
        if (!abstractComponentCallbacksC0563ol.f3472C) {
            throw new m50("Fragment " + abstractComponentCallbacksC0563ol + " did not call through to super.onDetach()");
        }
        C0023am c0023am = abstractComponentCallbacksC0563ol.f3505t;
        if (!c0023am.f87A) {
            c0023am.m85k();
            abstractComponentCallbacksC0563ol.f3505t = new C0023am();
        }
        this.f467a.m847h(false);
        abstractComponentCallbacksC0563ol.f3486a = -1;
        abstractComponentCallbacksC0563ol.f3504s = null;
        abstractComponentCallbacksC0563ol.f3506u = null;
        abstractComponentCallbacksC0563ol.f3503r = null;
        if (!abstractComponentCallbacksC0563ol.f3497l || abstractComponentCallbacksC0563ol.f3502q > 0) {
            C0109cm c0109cm = (C0109cm) this.f468b.f4066d;
            if (!((c0109cm.f904c.containsKey(abstractComponentCallbacksC0563ol.f3490e) && c0109cm.f907f) ? c0109cm.f908g : true)) {
                return;
            }
        }
        if (C0023am.m55A(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0563ol);
        }
        abstractComponentCallbacksC0563ol.f3481L = new C0036a(abstractComponentCallbacksC0563ol);
        abstractComponentCallbacksC0563ol.f3484O = new C0339im(abstractComponentCallbacksC0563ol);
        abstractComponentCallbacksC0563ol.f3490e = UUID.randomUUID().toString();
        abstractComponentCallbacksC0563ol.f3496k = false;
        abstractComponentCallbacksC0563ol.f3497l = false;
        abstractComponentCallbacksC0563ol.f3498m = false;
        abstractComponentCallbacksC0563ol.f3499n = false;
        abstractComponentCallbacksC0563ol.f3500o = false;
        abstractComponentCallbacksC0563ol.f3502q = 0;
        abstractComponentCallbacksC0563ol.f3503r = null;
        abstractComponentCallbacksC0563ol.f3505t = new C0023am();
        abstractComponentCallbacksC0563ol.f3504s = null;
        abstractComponentCallbacksC0563ol.f3507v = 0;
        abstractComponentCallbacksC0563ol.f3508w = 0;
        abstractComponentCallbacksC0563ol.f3509x = null;
        abstractComponentCallbacksC0563ol.f3510y = false;
        abstractComponentCallbacksC0563ol.f3511z = false;
    }

    /* JADX INFO: renamed from: j */
    public final void m248j() {
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = this.f469c;
        if (abstractComponentCallbacksC0563ol.f3498m && abstractComponentCallbacksC0563ol.f3499n && !abstractComponentCallbacksC0563ol.f3501p) {
            if (C0023am.m55A(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0563ol);
            }
            abstractComponentCallbacksC0563ol.mo2046v(abstractComponentCallbacksC0563ol.mo2044q(abstractComponentCallbacksC0563ol.f3487b), null, abstractComponentCallbacksC0563ol.f3487b);
            View view = abstractComponentCallbacksC0563ol.f3474E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0563ol.f3474E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0563ol);
                if (abstractComponentCallbacksC0563ol.f3510y) {
                    abstractComponentCallbacksC0563ol.f3474E.setVisibility(8);
                }
                abstractComponentCallbacksC0563ol.f3505t.m90p(2);
                this.f467a.m855p(false);
                abstractComponentCallbacksC0563ol.f3486a = 2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m249k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.f470d;
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = this.f469c;
        if (z) {
            if (C0023am.m55A(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0563ol);
                return;
            }
            return;
        }
        try {
            this.f470d = true;
            while (true) {
                int iM242d = m242d();
                int i = abstractComponentCallbacksC0563ol.f3486a;
                if (iM242d == i) {
                    if (abstractComponentCallbacksC0563ol.f3478I) {
                        if (abstractComponentCallbacksC0563ol.f3474E != null && (viewGroup = abstractComponentCallbacksC0563ol.f3473D) != null) {
                            C0150dg c0150dgM915f = C0150dg.m915f(viewGroup, abstractComponentCallbacksC0563ol.m2039j().m99y());
                            if (abstractComponentCallbacksC0563ol.f3510y) {
                                if (C0023am.m55A(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0563ol);
                                }
                                c0150dgM915f.m916a(3, 1, this);
                            } else {
                                if (C0023am.m55A(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0563ol);
                                }
                                c0150dgM915f.m916a(2, 1, this);
                            }
                        }
                        C0023am c0023am = abstractComponentCallbacksC0563ol.f3503r;
                        if (c0023am != null && abstractComponentCallbacksC0563ol.f3496k && C0023am.m56B(abstractComponentCallbacksC0563ol)) {
                            c0023am.f117x = true;
                        }
                        abstractComponentCallbacksC0563ol.f3478I = false;
                    }
                    this.f470d = false;
                    return;
                }
                if (iM242d <= i) {
                    switch (i - 1) {
                        case -1:
                            m247i();
                            break;
                        case Base64.DEFAULT /* 0 */:
                            m245g();
                            break;
                        case Base64.NO_PADDING /* 1 */:
                            m246h();
                            abstractComponentCallbacksC0563ol.f3486a = 1;
                            break;
                        case Base64.NO_WRAP /* 2 */:
                            abstractComponentCallbacksC0563ol.f3499n = false;
                            abstractComponentCallbacksC0563ol.f3486a = 2;
                            break;
                        case 3:
                            if (C0023am.m55A(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0563ol);
                            }
                            if (abstractComponentCallbacksC0563ol.f3474E != null && abstractComponentCallbacksC0563ol.f3488c == null) {
                                m253o();
                            }
                            if (abstractComponentCallbacksC0563ol.f3474E != null && (viewGroup3 = abstractComponentCallbacksC0563ol.f3473D) != null) {
                                C0150dg c0150dgM915f2 = C0150dg.m915f(viewGroup3, abstractComponentCallbacksC0563ol.m2039j().m99y());
                                if (C0023am.m55A(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0563ol);
                                }
                                c0150dgM915f2.m916a(1, 3, this);
                            }
                            abstractComponentCallbacksC0563ol.f3486a = 3;
                            break;
                        case 4:
                            m255q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0563ol.f3486a = 5;
                            break;
                        case 6:
                            m250l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case Base64.DEFAULT /* 0 */:
                            m241c();
                            break;
                        case Base64.NO_PADDING /* 1 */:
                            m243e();
                            break;
                        case Base64.NO_WRAP /* 2 */:
                            m248j();
                            m244f();
                            break;
                        case 3:
                            m239a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0563ol.f3474E != null && (viewGroup2 = abstractComponentCallbacksC0563ol.f3473D) != null) {
                                C0150dg c0150dgM915f3 = C0150dg.m915f(viewGroup2, abstractComponentCallbacksC0563ol.m2039j().m99y());
                                int iM1139b = g40.m1139b(abstractComponentCallbacksC0563ol.f3474E.getVisibility());
                                if (C0023am.m55A(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0563ol);
                                }
                                c0150dgM915f3.m916a(iM1139b, 2, this);
                            }
                            abstractComponentCallbacksC0563ol.f3486a = 4;
                            break;
                        case 5:
                            m254p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0563ol.f3486a = 6;
                            break;
                        case 7:
                            m252n();
                            break;
                    }
                }
            }
        } catch (Throwable th) {
            this.f470d = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m250l() {
        boolean zM55A = C0023am.m55A(3);
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = this.f469c;
        if (zM55A) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0563ol);
        }
        abstractComponentCallbacksC0563ol.f3505t.m90p(5);
        if (abstractComponentCallbacksC0563ol.f3474E != null) {
            abstractComponentCallbacksC0563ol.f3482M.m1406c(EnumC0494mq.ON_PAUSE);
        }
        abstractComponentCallbacksC0563ol.f3481L.m262d(EnumC0494mq.ON_PAUSE);
        abstractComponentCallbacksC0563ol.f3486a = 6;
        abstractComponentCallbacksC0563ol.f3472C = true;
        this.f467a.m848i(false);
    }

    /* JADX INFO: renamed from: m */
    public final void m251m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = this.f469c;
        Bundle bundle = abstractComponentCallbacksC0563ol.f3487b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0563ol.f3488c = abstractComponentCallbacksC0563ol.f3487b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0563ol.f3489d = abstractComponentCallbacksC0563ol.f3487b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0563ol.f3487b.getString("android:target_state");
        abstractComponentCallbacksC0563ol.f3493h = string;
        if (string != null) {
            abstractComponentCallbacksC0563ol.f3494i = abstractComponentCallbacksC0563ol.f3487b.getInt("android:target_req_state", 0);
        }
        boolean z = abstractComponentCallbacksC0563ol.f3487b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0563ol.f3476G = z;
        if (z) {
            return;
        }
        abstractComponentCallbacksC0563ol.f3475F = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m252n() {
        /*
            r7 = this;
            r0 = 3
            boolean r0 = p000.C0023am.m55A(r0)
            java.lang.String r1 = "FragmentManager"
            ol r2 = r7.f469c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            nl r0 = r2.f3477H
            r3 = 0
            if (r0 != 0) goto L23
            r0 = r3
            goto L25
        L23:
            android.view.View r0 = r0.f3319k
        L25:
            if (r0 == 0) goto L7d
            android.view.View r4 = r2.f3474E
            if (r0 != r4) goto L2c
            goto L36
        L2c:
            android.view.ViewParent r4 = r0.getParent()
        L30:
            if (r4 == 0) goto L7d
            android.view.View r5 = r2.f3474E
            if (r4 != r5) goto L78
        L36:
            boolean r4 = r0.requestFocus()
            r5 = 2
            boolean r5 = p000.C0023am.m55A(r5)
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
            android.view.View r0 = r2.f3474E
            android.view.View r0 = r0.findFocus()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.v(r1, r0)
            goto L7d
        L78:
            android.view.ViewParent r4 = r4.getParent()
            goto L30
        L7d:
            nl r0 = r2.m2035f()
            r0.f3319k = r3
            am r0 = r2.f3505t
            r0.m61F()
            am r0 = r2.f3505t
            r1 = 1
            r0.m94t(r1)
            r0 = 7
            r2.f3486a = r0
            r2.f3472C = r1
            androidx.lifecycle.a r1 = r2.f3481L
            mq r4 = p000.EnumC0494mq.ON_RESUME
            r1.m262d(r4)
            android.view.View r1 = r2.f3474E
            if (r1 == 0) goto La5
            hm r1 = r2.f3482M
            androidx.lifecycle.a r1 = r1.f2241b
            r1.m262d(r4)
        La5:
            am r1 = r2.f3505t
            r4 = 0
            r1.f118y = r4
            r1.f119z = r4
            cm r5 = r1.f92F
            r5.f909h = r4
            r1.m90p(r0)
            d4 r0 = r7.f467a
            r0.m851l(r4)
            r2.f3487b = r3
            r2.f3488c = r3
            r2.f3489d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0035a.m252n():void");
    }

    /* JADX INFO: renamed from: o */
    public final void m253o() {
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = this.f469c;
        if (abstractComponentCallbacksC0563ol.f3474E == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0563ol.f3474E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0563ol.f3488c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0563ol.f3482M.f2242c.m1505c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0563ol.f3489d = bundle;
    }

    /* JADX INFO: renamed from: p */
    public final void m254p() {
        boolean zM55A = C0023am.m55A(3);
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = this.f469c;
        if (zM55A) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0563ol);
        }
        abstractComponentCallbacksC0563ol.f3505t.m61F();
        abstractComponentCallbacksC0563ol.f3505t.m94t(true);
        abstractComponentCallbacksC0563ol.f3486a = 5;
        abstractComponentCallbacksC0563ol.f3472C = false;
        abstractComponentCallbacksC0563ol.mo1026s();
        if (!abstractComponentCallbacksC0563ol.f3472C) {
            throw new m50("Fragment " + abstractComponentCallbacksC0563ol + " did not call through to super.onStart()");
        }
        C0036a c0036a = abstractComponentCallbacksC0563ol.f3481L;
        EnumC0494mq enumC0494mq = EnumC0494mq.ON_START;
        c0036a.m262d(enumC0494mq);
        if (abstractComponentCallbacksC0563ol.f3474E != null) {
            abstractComponentCallbacksC0563ol.f3482M.f2241b.m262d(enumC0494mq);
        }
        C0023am c0023am = abstractComponentCallbacksC0563ol.f3505t;
        c0023am.f118y = false;
        c0023am.f119z = false;
        c0023am.f92F.f909h = false;
        c0023am.m90p(5);
        this.f467a.m853n(false);
    }

    /* JADX INFO: renamed from: q */
    public final void m255q() {
        boolean zM55A = C0023am.m55A(3);
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = this.f469c;
        if (zM55A) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0563ol);
        }
        C0023am c0023am = abstractComponentCallbacksC0563ol.f3505t;
        c0023am.f119z = true;
        c0023am.f92F.f909h = true;
        c0023am.m90p(4);
        if (abstractComponentCallbacksC0563ol.f3474E != null) {
            abstractComponentCallbacksC0563ol.f3482M.m1406c(EnumC0494mq.ON_STOP);
        }
        abstractComponentCallbacksC0563ol.f3481L.m262d(EnumC0494mq.ON_STOP);
        abstractComponentCallbacksC0563ol.f3486a = 4;
        abstractComponentCallbacksC0563ol.f3472C = false;
        abstractComponentCallbacksC0563ol.mo1027t();
        if (abstractComponentCallbacksC0563ol.f3472C) {
            this.f467a.m854o(false);
            return;
        }
        throw new m50("Fragment " + abstractComponentCallbacksC0563ol + " did not call through to super.onStop()");
    }

    public C0035a(C0138d4 c0138d4, C0658r5 c0658r5, ClassLoader classLoader, C0822vl c0822vl, C0192em c0192em) {
        this.f467a = c0138d4;
        this.f468b = c0658r5;
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563olM2573a = c0822vl.m2573a(c0192em.f1592a);
        this.f469c = abstractComponentCallbacksC0563olM2573a;
        Bundle bundle = c0192em.f1601j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC0563olM2573a.m2033C(bundle);
        abstractComponentCallbacksC0563olM2573a.f3490e = c0192em.f1593b;
        abstractComponentCallbacksC0563olM2573a.f3498m = c0192em.f1594c;
        abstractComponentCallbacksC0563olM2573a.f3500o = true;
        abstractComponentCallbacksC0563olM2573a.f3507v = c0192em.f1595d;
        abstractComponentCallbacksC0563olM2573a.f3508w = c0192em.f1596e;
        abstractComponentCallbacksC0563olM2573a.f3509x = c0192em.f1597f;
        abstractComponentCallbacksC0563olM2573a.f3470A = c0192em.f1598g;
        abstractComponentCallbacksC0563olM2573a.f3497l = c0192em.f1599h;
        abstractComponentCallbacksC0563olM2573a.f3511z = c0192em.f1600i;
        abstractComponentCallbacksC0563olM2573a.f3510y = c0192em.f1602k;
        abstractComponentCallbacksC0563olM2573a.f3480K = EnumC0531nq.values()[c0192em.f1603l];
        Bundle bundle2 = c0192em.f1604m;
        if (bundle2 != null) {
            abstractComponentCallbacksC0563olM2573a.f3487b = bundle2;
        } else {
            abstractComponentCallbacksC0563olM2573a.f3487b = new Bundle();
        }
        if (C0023am.m55A(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC0563olM2573a);
        }
    }

    public C0035a(C0138d4 c0138d4, C0658r5 c0658r5, AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol, C0192em c0192em) {
        this.f467a = c0138d4;
        this.f468b = c0658r5;
        this.f469c = abstractComponentCallbacksC0563ol;
        abstractComponentCallbacksC0563ol.f3488c = null;
        abstractComponentCallbacksC0563ol.f3489d = null;
        abstractComponentCallbacksC0563ol.f3502q = 0;
        abstractComponentCallbacksC0563ol.f3499n = false;
        abstractComponentCallbacksC0563ol.f3496k = false;
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol2 = abstractComponentCallbacksC0563ol.f3492g;
        abstractComponentCallbacksC0563ol.f3493h = abstractComponentCallbacksC0563ol2 != null ? abstractComponentCallbacksC0563ol2.f3490e : null;
        abstractComponentCallbacksC0563ol.f3492g = null;
        Bundle bundle = c0192em.f1604m;
        if (bundle != null) {
            abstractComponentCallbacksC0563ol.f3487b = bundle;
        } else {
            abstractComponentCallbacksC0563ol.f3487b = new Bundle();
        }
    }
}

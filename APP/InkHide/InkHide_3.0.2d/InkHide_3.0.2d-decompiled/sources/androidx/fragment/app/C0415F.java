package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C0464P;
import androidx.lifecycle.C0486u;
import androidx.lifecycle.EnumC0478m;
import androidx.lifecycle.EnumC0479n;
import androidx.lifecycle.InterfaceC0482q;
import androidx.lifecycle.InterfaceC0484s;
import com.p055lu.wxmask272.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.WeakHashMap;
import p004C.C0064h;
import p014H.C0142a;
import p020K.C0161a;
import p022L.AbstractC0174d;
import p024M.C0191e;
import p027N0.AbstractC0223g;
import p061e.AbstractActivityC0533i;
import p064f0.C0556b;
import p075l.C0754l;
import p099y.AbstractC1048L;
import p099y.AbstractC1094z;

/* JADX INFO: renamed from: androidx.fragment.app.F */
/* JADX INFO: loaded from: classes.dex */
public final class C0415F {

    /* JADX INFO: renamed from: a */
    public final C0142a f1252a;

    /* JADX INFO: renamed from: b */
    public final C0064h f1253b;

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC0434l f1254c;

    /* JADX INFO: renamed from: d */
    public boolean f1255d = false;

    /* JADX INFO: renamed from: e */
    public int f1256e = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0415F(C0142a c0142a, C0064h c0064h, AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l) {
        this.f1252a = c0142a;
        this.f1253b = c0064h;
        this.f1254c = abstractComponentCallbacksC0434l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m789a() {
        boolean zM856E = C0448z.m856E(3);
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1254c;
        if (zM856E) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0434l);
        }
        Bundle bundle = abstractComponentCallbacksC0434l.f1366c;
        abstractComponentCallbacksC0434l.f1384u.m866J();
        abstractComponentCallbacksC0434l.f1365b = 3;
        abstractComponentCallbacksC0434l.f1351D = true;
        if (C0448z.m856E(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0434l);
        }
        View view = abstractComponentCallbacksC0434l.f1353F;
        if (view != null) {
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0434l.f1367d;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0434l.f1367d = null;
            }
            if (abstractComponentCallbacksC0434l.f1353F != null) {
                abstractComponentCallbacksC0434l.f1361N.f1268d.m403d(abstractComponentCallbacksC0434l.f1368e);
                abstractComponentCallbacksC0434l.f1368e = null;
            }
            abstractComponentCallbacksC0434l.f1351D = true;
            if (abstractComponentCallbacksC0434l.f1353F != null) {
                abstractComponentCallbacksC0434l.f1361N.m806d(EnumC0478m.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0434l.f1366c = null;
        C0448z c0448z = abstractComponentCallbacksC0434l.f1384u;
        c0448z.f1454y = false;
        c0448z.f1455z = false;
        c0448z.f1428F.f1236i = false;
        c0448z.m896s(4);
        this.f1252a.m317b(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m790b() {
        View view;
        View view2;
        C0064h c0064h = this.f1253b;
        c0064h.getClass();
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1254c;
        ViewGroup viewGroup = abstractComponentCallbacksC0434l.f1352E;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) c0064h.f308b;
            int iIndexOf = arrayList.indexOf(abstractComponentCallbacksC0434l);
            int i2 = iIndexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l2 = (AbstractComponentCallbacksC0434l) arrayList.get(iIndexOf);
                        if (abstractComponentCallbacksC0434l2.f1352E == viewGroup && (view = abstractComponentCallbacksC0434l2.f1353F) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l3 = (AbstractComponentCallbacksC0434l) arrayList.get(i2);
                    if (abstractComponentCallbacksC0434l3.f1352E == viewGroup && (view2 = abstractComponentCallbacksC0434l3.f1353F) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC0434l.f1352E.addView(abstractComponentCallbacksC0434l.f1353F, iIndexOfChild);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m791c() {
        C0415F c0415f;
        boolean zM856E = C0448z.m856E(3);
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1254c;
        if (zM856E) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0434l);
        }
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l2 = abstractComponentCallbacksC0434l.f1371h;
        C0064h c0064h = this.f1253b;
        if (abstractComponentCallbacksC0434l2 != null) {
            c0415f = (C0415F) ((HashMap) c0064h.f309c).get(abstractComponentCallbacksC0434l2.f1369f);
            if (c0415f == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0434l + " declared target fragment " + abstractComponentCallbacksC0434l.f1371h + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0434l.f1372i = abstractComponentCallbacksC0434l.f1371h.f1369f;
            abstractComponentCallbacksC0434l.f1371h = null;
        } else {
            String str = abstractComponentCallbacksC0434l.f1372i;
            if (str != null) {
                c0415f = (C0415F) ((HashMap) c0064h.f309c).get(str);
                if (c0415f == null) {
                    StringBuilder sb = new StringBuilder("Fragment ");
                    sb.append(abstractComponentCallbacksC0434l);
                    sb.append(" declared target fragment ");
                    throw new IllegalStateException(AbstractC0174d.m356l(sb, abstractComponentCallbacksC0434l.f1372i, " that does not belong to this FragmentManager!"));
                }
            } else {
                c0415f = null;
            }
        }
        if (c0415f != null) {
            c0415f.m799k();
        }
        C0448z c0448z = abstractComponentCallbacksC0434l.f1382s;
        abstractComponentCallbacksC0434l.f1383t = c0448z.f1443n;
        abstractComponentCallbacksC0434l.f1385v = c0448z.f1445p;
        C0142a c0142a = this.f1252a;
        c0142a.m323h(false);
        ArrayList arrayList = abstractComponentCallbacksC0434l.f1364Q;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        arrayList.clear();
        abstractComponentCallbacksC0434l.f1384u.m879b(abstractComponentCallbacksC0434l.f1383t, new C0432j(abstractComponentCallbacksC0434l), abstractComponentCallbacksC0434l);
        abstractComponentCallbacksC0434l.f1365b = 0;
        abstractComponentCallbacksC0434l.f1351D = false;
        C0556b c0556b = (C0556b) abstractComponentCallbacksC0434l;
        AbstractC0223g.m418e(abstractComponentCallbacksC0434l.f1383t.f1395e, "context");
        c0556b.f1351D = true;
        C0437o c0437o = c0556b.f1383t;
        if ((c0437o == null ? null : c0437o.f1394d) != null) {
            c0556b.f1351D = true;
        }
        AbstractActivityC0533i abstractActivityC0533i = c0437o != null ? c0437o.f1394d : null;
        if (abstractActivityC0533i != null) {
            abstractActivityC0533i.f898i.m641a(c0556b, new C0443u(c0556b));
        }
        if (!abstractComponentCallbacksC0434l.f1351D) {
            throw new C0422M("Fragment " + abstractComponentCallbacksC0434l + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0434l.f1382s.f1441l.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0412C) it2.next()).mo785a();
        }
        C0448z c0448z2 = abstractComponentCallbacksC0434l.f1384u;
        c0448z2.f1454y = false;
        c0448z2.f1455z = false;
        c0448z2.f1428F.f1236i = false;
        c0448z2.m896s(0);
        c0142a.m318c(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m792d() {
        C0420K c0420k;
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1254c;
        if (abstractComponentCallbacksC0434l.f1382s == null) {
            return abstractComponentCallbacksC0434l.f1365b;
        }
        int iMin = this.f1256e;
        int iOrdinal = abstractComponentCallbacksC0434l.f1359L.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0434l.f1377n) {
            if (abstractComponentCallbacksC0434l.f1378o) {
                iMin = Math.max(this.f1256e, 2);
                View view = abstractComponentCallbacksC0434l.f1353F;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f1256e < 4 ? Math.min(iMin, abstractComponentCallbacksC0434l.f1365b) : Math.min(iMin, 1);
            }
        }
        if (!abstractComponentCallbacksC0434l.f1375l) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0434l.f1352E;
        if (viewGroup != null) {
            C0431i c0431iM832f = C0431i.m832f(viewGroup, abstractComponentCallbacksC0434l.m842g().m863C());
            c0431iM832f.getClass();
            C0420K c0420kM836d = c0431iM832f.m836d(abstractComponentCallbacksC0434l);
            i = c0420kM836d != null ? c0420kM836d.f1275b : 0;
            Iterator it = c0431iM832f.f1332c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c0420k = null;
                    break;
                }
                c0420k = (C0420K) it.next();
                if (c0420k.f1276c.equals(abstractComponentCallbacksC0434l) && !c0420k.f1279f) {
                    break;
                }
            }
            if (c0420k != null && (i == 0 || i == 1)) {
                i = c0420k.f1275b;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC0434l.f1376m) {
            iMin = abstractComponentCallbacksC0434l.f1381r > 0 ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0434l.f1354G && abstractComponentCallbacksC0434l.f1365b < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (C0448z.m856E(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC0434l);
        }
        return iMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m793e() {
        Parcelable parcelable;
        Parcelable parcelable2;
        boolean zM856E = C0448z.m856E(3);
        final AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1254c;
        if (zM856E) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0434l);
        }
        if (abstractComponentCallbacksC0434l.f1358K) {
            Bundle bundle = abstractComponentCallbacksC0434l.f1366c;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0434l.f1384u.m870N(parcelable);
                C0448z c0448z = abstractComponentCallbacksC0434l.f1384u;
                c0448z.f1454y = false;
                c0448z.f1455z = false;
                c0448z.f1428F.f1236i = false;
                c0448z.m896s(1);
            }
            abstractComponentCallbacksC0434l.f1365b = 1;
            return;
        }
        C0142a c0142a = this.f1252a;
        c0142a.m324i(false);
        Bundle bundle2 = abstractComponentCallbacksC0434l.f1366c;
        abstractComponentCallbacksC0434l.f1384u.m866J();
        abstractComponentCallbacksC0434l.f1365b = 1;
        abstractComponentCallbacksC0434l.f1351D = false;
        abstractComponentCallbacksC0434l.f1360M.m927a(new InterfaceC0482q() { // from class: androidx.fragment.app.Fragment$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.lifecycle.InterfaceC0482q
            /* JADX INFO: renamed from: c */
            public final void mo391c(InterfaceC0484s interfaceC0484s, EnumC0478m enumC0478m) {
                View view;
                if (enumC0478m != EnumC0478m.ON_STOP || (view = abstractComponentCallbacksC0434l.f1353F) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        abstractComponentCallbacksC0434l.f1363P.m403d(bundle2);
        abstractComponentCallbacksC0434l.f1351D = true;
        if (bundle2 != null && (parcelable2 = bundle2.getParcelable("android:support:fragments")) != null) {
            abstractComponentCallbacksC0434l.f1384u.m870N(parcelable2);
            C0448z c0448z2 = abstractComponentCallbacksC0434l.f1384u;
            c0448z2.f1454y = false;
            c0448z2.f1455z = false;
            c0448z2.f1428F.f1236i = false;
            c0448z2.m896s(1);
        }
        C0448z c0448z3 = abstractComponentCallbacksC0434l.f1384u;
        if (c0448z3.f1442m < 1) {
            c0448z3.f1454y = false;
            c0448z3.f1455z = false;
            c0448z3.f1428F.f1236i = false;
            c0448z3.m896s(1);
        }
        abstractComponentCallbacksC0434l.f1358K = true;
        if (abstractComponentCallbacksC0434l.f1351D) {
            abstractComponentCallbacksC0434l.f1360M.m930d(EnumC0478m.ON_CREATE);
            c0142a.m319d(false);
        } else {
            throw new C0422M("Fragment " + abstractComponentCallbacksC0434l + " did not call through to super.onCreate()");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: f */
    public final void m794f() {
        String resourceName;
        ViewGroup viewGroup = null;
        AbstractActivityC0533i abstractActivityC0533i = null;
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1254c;
        if (abstractComponentCallbacksC0434l.f1377n) {
            return;
        }
        if (C0448z.m856E(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0434l);
        }
        LayoutInflater layoutInflaterM847l = abstractComponentCallbacksC0434l.m847l();
        ViewGroup viewGroup2 = abstractComponentCallbacksC0434l.f1352E;
        if (viewGroup2 == null) {
            int i2 = abstractComponentCallbacksC0434l.f1387x;
            if (i2 != 0) {
                if (i2 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0434l + " for a container view with no id");
                }
                viewGroup2 = (ViewGroup) abstractComponentCallbacksC0434l.f1382s.f1444o.mo201G(i2);
                if (viewGroup2 == null && !abstractComponentCallbacksC0434l.f1379p) {
                    try {
                        C0437o c0437o = abstractComponentCallbacksC0434l.f1383t;
                        if (c0437o != null) {
                            abstractActivityC0533i = c0437o.f1395e;
                        }
                    } catch (Resources.NotFoundException unused) {
                        resourceName = "unknown";
                    }
                    if (abstractActivityC0533i == null) {
                        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0434l + " not attached to a context.");
                    }
                    resourceName = abstractActivityC0533i.getResources().getResourceName(abstractComponentCallbacksC0434l.f1387x);
                    throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0434l.f1387x) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC0434l);
                }
                viewGroup = viewGroup2;
            }
        } else {
            viewGroup = viewGroup2;
        }
        abstractComponentCallbacksC0434l.f1352E = viewGroup;
        abstractComponentCallbacksC0434l.m846k(layoutInflaterM847l, viewGroup, abstractComponentCallbacksC0434l.f1366c);
        View view = abstractComponentCallbacksC0434l.f1353F;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0434l.f1353F.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0434l);
            if (viewGroup != null) {
                m790b();
            }
            if (abstractComponentCallbacksC0434l.f1389z) {
                abstractComponentCallbacksC0434l.f1353F.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0434l.f1353F;
            WeakHashMap weakHashMap = AbstractC1048L.f3662a;
            if (view2.isAttachedToWindow()) {
                AbstractC1094z.m2366c(abstractComponentCallbacksC0434l.f1353F);
            } else {
                View view3 = abstractComponentCallbacksC0434l.f1353F;
                view3.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0414E(0, view3));
            }
            abstractComponentCallbacksC0434l.mo845j(abstractComponentCallbacksC0434l.f1353F);
            abstractComponentCallbacksC0434l.f1384u.m896s(2);
            this.f1252a.m329o(false);
            int visibility = abstractComponentCallbacksC0434l.f1353F.getVisibility();
            abstractComponentCallbacksC0434l.m839d().f1345j = abstractComponentCallbacksC0434l.f1353F.getAlpha();
            if (abstractComponentCallbacksC0434l.f1352E != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC0434l.f1353F.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC0434l.m839d().f1346k = viewFindFocus;
                    if (C0448z.m856E(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0434l);
                    }
                }
                abstractComponentCallbacksC0434l.f1353F.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0434l.f1365b = 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m795g() {
        boolean z2;
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434lM117g;
        boolean zM856E = C0448z.m856E(3);
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1254c;
        if (zM856E) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0434l);
        }
        boolean z3 = abstractComponentCallbacksC0434l.f1376m && abstractComponentCallbacksC0434l.f1381r <= 0;
        C0064h c0064h = this.f1253b;
        if (!z3) {
            C0411B c0411b = (C0411B) c0064h.f310d;
            if (!((c0411b.f1231d.containsKey(abstractComponentCallbacksC0434l.f1369f) && c0411b.f1234g) ? c0411b.f1235h : true)) {
                String str = abstractComponentCallbacksC0434l.f1372i;
                if (str != null && (abstractComponentCallbacksC0434lM117g = c0064h.m117g(str)) != null && abstractComponentCallbacksC0434lM117g.f1349B) {
                    abstractComponentCallbacksC0434l.f1371h = abstractComponentCallbacksC0434lM117g;
                }
                abstractComponentCallbacksC0434l.f1365b = 0;
                return;
            }
        }
        C0437o c0437o = abstractComponentCallbacksC0434l.f1383t;
        if (c0437o != null) {
            z2 = ((C0411B) c0064h.f310d).f1235h;
        } else {
            z2 = c0437o.f1395e != null ? !r7.isChangingConfigurations() : true;
        }
        if (z3 || z2) {
            C0411B c0411b2 = (C0411B) c0064h.f310d;
            c0411b2.getClass();
            if (C0448z.m856E(3)) {
                Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0434l);
            }
            HashMap map = c0411b2.f1232e;
            C0411B c0411b3 = (C0411B) map.get(abstractComponentCallbacksC0434l.f1369f);
            if (c0411b3 != null) {
                c0411b3.mo339b();
                map.remove(abstractComponentCallbacksC0434l.f1369f);
            }
            HashMap map2 = c0411b2.f1233f;
            C0464P c0464p = (C0464P) map2.get(abstractComponentCallbacksC0434l.f1369f);
            if (c0464p != null) {
                c0464p.m919a();
                map2.remove(abstractComponentCallbacksC0434l.f1369f);
            }
        }
        abstractComponentCallbacksC0434l.f1384u.m888k();
        abstractComponentCallbacksC0434l.f1360M.m930d(EnumC0478m.ON_DESTROY);
        abstractComponentCallbacksC0434l.f1365b = 0;
        abstractComponentCallbacksC0434l.f1358K = false;
        abstractComponentCallbacksC0434l.f1351D = true;
        this.f1252a.m320e(false);
        for (C0415F c0415f : c0064h.m121k()) {
            if (c0415f != null) {
                String str2 = abstractComponentCallbacksC0434l.f1369f;
                AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l2 = c0415f.f1254c;
                if (str2.equals(abstractComponentCallbacksC0434l2.f1372i)) {
                    abstractComponentCallbacksC0434l2.f1371h = abstractComponentCallbacksC0434l;
                    abstractComponentCallbacksC0434l2.f1372i = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0434l.f1372i;
        if (str3 != null) {
            abstractComponentCallbacksC0434l.f1371h = c0064h.m117g(str3);
        }
        c0064h.m129s(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m796h() {
        View view;
        boolean zM856E = C0448z.m856E(3);
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1254c;
        if (zM856E) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0434l);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0434l.f1352E;
        if (viewGroup != null && (view = abstractComponentCallbacksC0434l.f1353F) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0434l.f1384u.m896s(1);
        if (abstractComponentCallbacksC0434l.f1353F != null) {
            C0417H c0417h = abstractComponentCallbacksC0434l.f1361N;
            c0417h.m807e();
            if (c0417h.f1267c.f1528c.compareTo(EnumC0479n.f1519c) >= 0) {
                abstractComponentCallbacksC0434l.f1361N.m806d(EnumC0478m.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0434l.f1365b = 1;
        abstractComponentCallbacksC0434l.f1351D = true;
        C0754l c0754l = ((C0161a) new C0064h(abstractComponentCallbacksC0434l.getViewModelStore(), C0161a.f473e).m119i(C0161a.class)).f474d;
        if (c0754l.f2560c > 0) {
            c0754l.f2559b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0434l.f1380q = false;
        this.f1252a.m330p(false);
        abstractComponentCallbacksC0434l.f1352E = null;
        abstractComponentCallbacksC0434l.f1353F = null;
        abstractComponentCallbacksC0434l.f1361N = null;
        abstractComponentCallbacksC0434l.f1362O.m937a(null);
        abstractComponentCallbacksC0434l.f1378o = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m797i() {
        boolean zM856E = C0448z.m856E(3);
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1254c;
        if (zM856E) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0434l);
        }
        abstractComponentCallbacksC0434l.f1365b = -1;
        boolean z2 = true;
        abstractComponentCallbacksC0434l.f1351D = true;
        C0448z c0448z = abstractComponentCallbacksC0434l.f1384u;
        if (!c0448z.f1423A) {
            c0448z.m888k();
            abstractComponentCallbacksC0434l.f1384u = new C0448z();
        }
        this.f1252a.m321f(false);
        abstractComponentCallbacksC0434l.f1365b = -1;
        abstractComponentCallbacksC0434l.f1383t = null;
        abstractComponentCallbacksC0434l.f1385v = null;
        abstractComponentCallbacksC0434l.f1382s = null;
        if (!abstractComponentCallbacksC0434l.f1376m || abstractComponentCallbacksC0434l.f1381r > 0) {
            C0411B c0411b = (C0411B) this.f1253b.f310d;
            if (c0411b.f1231d.containsKey(abstractComponentCallbacksC0434l.f1369f) && c0411b.f1234g) {
                z2 = c0411b.f1235h;
            }
            if (!z2) {
                return;
            }
        }
        if (C0448z.m856E(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0434l);
        }
        abstractComponentCallbacksC0434l.f1360M = new C0486u(abstractComponentCallbacksC0434l);
        abstractComponentCallbacksC0434l.f1363P = new C0191e(abstractComponentCallbacksC0434l);
        abstractComponentCallbacksC0434l.f1369f = UUID.randomUUID().toString();
        abstractComponentCallbacksC0434l.f1375l = false;
        abstractComponentCallbacksC0434l.f1376m = false;
        abstractComponentCallbacksC0434l.f1377n = false;
        abstractComponentCallbacksC0434l.f1378o = false;
        abstractComponentCallbacksC0434l.f1379p = false;
        abstractComponentCallbacksC0434l.f1381r = 0;
        abstractComponentCallbacksC0434l.f1382s = null;
        abstractComponentCallbacksC0434l.f1384u = new C0448z();
        abstractComponentCallbacksC0434l.f1383t = null;
        abstractComponentCallbacksC0434l.f1386w = 0;
        abstractComponentCallbacksC0434l.f1387x = 0;
        abstractComponentCallbacksC0434l.f1388y = null;
        abstractComponentCallbacksC0434l.f1389z = false;
        abstractComponentCallbacksC0434l.f1348A = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m798j() {
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1254c;
        if (abstractComponentCallbacksC0434l.f1377n && abstractComponentCallbacksC0434l.f1378o && !abstractComponentCallbacksC0434l.f1380q) {
            if (C0448z.m856E(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0434l);
            }
            abstractComponentCallbacksC0434l.m846k(abstractComponentCallbacksC0434l.m847l(), null, abstractComponentCallbacksC0434l.f1366c);
            View view = abstractComponentCallbacksC0434l.f1353F;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0434l.f1353F.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0434l);
                if (abstractComponentCallbacksC0434l.f1389z) {
                    abstractComponentCallbacksC0434l.f1353F.setVisibility(8);
                }
                abstractComponentCallbacksC0434l.mo845j(abstractComponentCallbacksC0434l.f1353F);
                abstractComponentCallbacksC0434l.f1384u.m896s(2);
                this.f1252a.m329o(false);
                abstractComponentCallbacksC0434l.f1365b = 2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m799k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z2 = this.f1255d;
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1254c;
        if (z2) {
            if (C0448z.m856E(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0434l);
                return;
            }
            return;
        }
        try {
            this.f1255d = true;
            while (true) {
                int iM792d = m792d();
                int i2 = abstractComponentCallbacksC0434l.f1365b;
                if (iM792d == i2) {
                    if (abstractComponentCallbacksC0434l.f1357J) {
                        if (abstractComponentCallbacksC0434l.f1353F != null && (viewGroup = abstractComponentCallbacksC0434l.f1352E) != null) {
                            C0431i c0431iM832f = C0431i.m832f(viewGroup, abstractComponentCallbacksC0434l.m842g().m863C());
                            if (abstractComponentCallbacksC0434l.f1389z) {
                                c0431iM832f.getClass();
                                if (C0448z.m856E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0434l);
                                }
                                c0431iM832f.m833a(3, 1, this);
                            } else {
                                c0431iM832f.getClass();
                                if (C0448z.m856E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0434l);
                                }
                                c0431iM832f.m833a(2, 1, this);
                            }
                        }
                        C0448z c0448z = abstractComponentCallbacksC0434l.f1382s;
                        if (c0448z != null && abstractComponentCallbacksC0434l.f1375l && C0448z.m857F(abstractComponentCallbacksC0434l)) {
                            c0448z.f1453x = true;
                        }
                        abstractComponentCallbacksC0434l.f1357J = false;
                    }
                    this.f1255d = false;
                    return;
                }
                if (iM792d <= i2) {
                    switch (i2 - 1) {
                        case -1:
                            m797i();
                            break;
                        case 0:
                            m795g();
                            break;
                        case 1:
                            m796h();
                            abstractComponentCallbacksC0434l.f1365b = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0434l.f1378o = false;
                            abstractComponentCallbacksC0434l.f1365b = 2;
                            break;
                        case 3:
                            if (C0448z.m856E(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0434l);
                            }
                            if (abstractComponentCallbacksC0434l.f1353F != null && abstractComponentCallbacksC0434l.f1367d == null) {
                                m803o();
                            }
                            if (abstractComponentCallbacksC0434l.f1353F != null && (viewGroup3 = abstractComponentCallbacksC0434l.f1352E) != null) {
                                C0431i c0431iM832f2 = C0431i.m832f(viewGroup3, abstractComponentCallbacksC0434l.m842g().m863C());
                                c0431iM832f2.getClass();
                                if (C0448z.m856E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0434l);
                                }
                                c0431iM832f2.m833a(1, 3, this);
                            }
                            abstractComponentCallbacksC0434l.f1365b = 3;
                            break;
                        case 4:
                            m805q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0434l.f1365b = 5;
                            break;
                        case 6:
                            m800l();
                            break;
                    }
                } else {
                    switch (i2 + 1) {
                        case 0:
                            m791c();
                            break;
                        case 1:
                            m793e();
                            break;
                        case 2:
                            m798j();
                            m794f();
                            break;
                        case 3:
                            m789a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0434l.f1353F != null && (viewGroup2 = abstractComponentCallbacksC0434l.f1352E) != null) {
                                C0431i c0431iM832f3 = C0431i.m832f(viewGroup2, abstractComponentCallbacksC0434l.m842g().m863C());
                                int iM814b = AbstractC0421L.m814b(abstractComponentCallbacksC0434l.f1353F.getVisibility());
                                c0431iM832f3.getClass();
                                if (C0448z.m856E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0434l);
                                }
                                c0431iM832f3.m833a(iM814b, 2, this);
                            }
                            abstractComponentCallbacksC0434l.f1365b = 4;
                            break;
                        case 5:
                            m804p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0434l.f1365b = 6;
                            break;
                        case 7:
                            m802n();
                            break;
                    }
                }
            }
        } catch (Throwable th) {
            this.f1255d = false;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m800l() {
        boolean zM856E = C0448z.m856E(3);
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1254c;
        if (zM856E) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0434l);
        }
        abstractComponentCallbacksC0434l.f1384u.m896s(5);
        if (abstractComponentCallbacksC0434l.f1353F != null) {
            abstractComponentCallbacksC0434l.f1361N.m806d(EnumC0478m.ON_PAUSE);
        }
        abstractComponentCallbacksC0434l.f1360M.m930d(EnumC0478m.ON_PAUSE);
        abstractComponentCallbacksC0434l.f1365b = 6;
        abstractComponentCallbacksC0434l.f1351D = true;
        this.f1252a.m322g(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m801m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1254c;
        Bundle bundle = abstractComponentCallbacksC0434l.f1366c;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0434l.f1367d = abstractComponentCallbacksC0434l.f1366c.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0434l.f1368e = abstractComponentCallbacksC0434l.f1366c.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0434l.f1366c.getString("android:target_state");
        abstractComponentCallbacksC0434l.f1372i = string;
        if (string != null) {
            abstractComponentCallbacksC0434l.f1373j = abstractComponentCallbacksC0434l.f1366c.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0434l.f1366c.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0434l.f1355H = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0434l.f1354G = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m802n() {
        boolean zM856E = C0448z.m856E(3);
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1254c;
        if (zM856E) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0434l);
        }
        C0433k c0433k = abstractComponentCallbacksC0434l.f1356I;
        View view = c0433k == null ? null : c0433k.f1346k;
        if (view != null) {
            if (view == abstractComponentCallbacksC0434l.f1353F) {
                boolean zRequestFocus = view.requestFocus();
                if (C0448z.m856E(2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(view);
                    sb.append(" ");
                    sb.append(zRequestFocus ? "succeeded" : "failed");
                    sb.append(" on Fragment ");
                    sb.append(abstractComponentCallbacksC0434l);
                    sb.append(" resulting in focused view ");
                    sb.append(abstractComponentCallbacksC0434l.f1353F.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            } else {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == abstractComponentCallbacksC0434l.f1353F) {
                        boolean zRequestFocus2 = view.requestFocus();
                        if (C0448z.m856E(2)) {
                        }
                    }
                }
            }
        }
        abstractComponentCallbacksC0434l.m839d().f1346k = null;
        abstractComponentCallbacksC0434l.f1384u.m866J();
        abstractComponentCallbacksC0434l.f1384u.m899v(true);
        abstractComponentCallbacksC0434l.f1365b = 7;
        abstractComponentCallbacksC0434l.f1351D = true;
        C0486u c0486u = abstractComponentCallbacksC0434l.f1360M;
        EnumC0478m enumC0478m = EnumC0478m.ON_RESUME;
        c0486u.m930d(enumC0478m);
        if (abstractComponentCallbacksC0434l.f1353F != null) {
            abstractComponentCallbacksC0434l.f1361N.f1267c.m930d(enumC0478m);
        }
        C0448z c0448z = abstractComponentCallbacksC0434l.f1384u;
        c0448z.f1454y = false;
        c0448z.f1455z = false;
        c0448z.f1428F.f1236i = false;
        c0448z.m896s(7);
        this.f1252a.m325k(false);
        abstractComponentCallbacksC0434l.f1366c = null;
        abstractComponentCallbacksC0434l.f1367d = null;
        abstractComponentCallbacksC0434l.f1368e = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m803o() {
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1254c;
        if (abstractComponentCallbacksC0434l.f1353F == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0434l.f1353F.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0434l.f1367d = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0434l.f1361N.f1268d.m404e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0434l.f1368e = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m804p() {
        boolean zM856E = C0448z.m856E(3);
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1254c;
        if (zM856E) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0434l);
        }
        abstractComponentCallbacksC0434l.f1384u.m866J();
        abstractComponentCallbacksC0434l.f1384u.m899v(true);
        abstractComponentCallbacksC0434l.f1365b = 5;
        abstractComponentCallbacksC0434l.f1351D = true;
        C0486u c0486u = abstractComponentCallbacksC0434l.f1360M;
        EnumC0478m enumC0478m = EnumC0478m.ON_START;
        c0486u.m930d(enumC0478m);
        if (abstractComponentCallbacksC0434l.f1353F != null) {
            abstractComponentCallbacksC0434l.f1361N.f1267c.m930d(enumC0478m);
        }
        C0448z c0448z = abstractComponentCallbacksC0434l.f1384u;
        c0448z.f1454y = false;
        c0448z.f1455z = false;
        c0448z.f1428F.f1236i = false;
        c0448z.m896s(5);
        this.f1252a.m327m(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m805q() {
        boolean zM856E = C0448z.m856E(3);
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1254c;
        if (zM856E) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0434l);
        }
        C0448z c0448z = abstractComponentCallbacksC0434l.f1384u;
        c0448z.f1455z = true;
        c0448z.f1428F.f1236i = true;
        c0448z.m896s(4);
        if (abstractComponentCallbacksC0434l.f1353F != null) {
            abstractComponentCallbacksC0434l.f1361N.m806d(EnumC0478m.ON_STOP);
        }
        abstractComponentCallbacksC0434l.f1360M.m930d(EnumC0478m.ON_STOP);
        abstractComponentCallbacksC0434l.f1365b = 4;
        abstractComponentCallbacksC0434l.f1351D = true;
        this.f1252a.m328n(false);
    }

    public C0415F(C0142a c0142a, C0064h c0064h, ClassLoader classLoader, C0444v c0444v, C0413D c0413d) {
        this.f1252a = c0142a;
        this.f1253b = c0064h;
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434lM855a = c0444v.m855a(c0413d.f1237a);
        this.f1254c = abstractComponentCallbacksC0434lM855a;
        Bundle bundle = c0413d.f1246j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        C0448z c0448z = abstractComponentCallbacksC0434lM855a.f1382s;
        if (c0448z != null && (c0448z.f1454y || c0448z.f1455z)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        abstractComponentCallbacksC0434lM855a.f1370g = bundle;
        abstractComponentCallbacksC0434lM855a.f1369f = c0413d.f1238b;
        abstractComponentCallbacksC0434lM855a.f1377n = c0413d.f1239c;
        abstractComponentCallbacksC0434lM855a.f1379p = true;
        abstractComponentCallbacksC0434lM855a.f1386w = c0413d.f1240d;
        abstractComponentCallbacksC0434lM855a.f1387x = c0413d.f1241e;
        abstractComponentCallbacksC0434lM855a.f1388y = c0413d.f1242f;
        abstractComponentCallbacksC0434lM855a.f1349B = c0413d.f1243g;
        abstractComponentCallbacksC0434lM855a.f1376m = c0413d.f1244h;
        abstractComponentCallbacksC0434lM855a.f1348A = c0413d.f1245i;
        abstractComponentCallbacksC0434lM855a.f1389z = c0413d.f1247k;
        abstractComponentCallbacksC0434lM855a.f1359L = EnumC0479n.values()[c0413d.f1248l];
        Bundle bundle2 = c0413d.f1249m;
        if (bundle2 != null) {
            abstractComponentCallbacksC0434lM855a.f1366c = bundle2;
        } else {
            abstractComponentCallbacksC0434lM855a.f1366c = new Bundle();
        }
        if (C0448z.m856E(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC0434lM855a);
        }
    }

    public C0415F(C0142a c0142a, C0064h c0064h, AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l, C0413D c0413d) {
        this.f1252a = c0142a;
        this.f1253b = c0064h;
        this.f1254c = abstractComponentCallbacksC0434l;
        abstractComponentCallbacksC0434l.f1367d = null;
        abstractComponentCallbacksC0434l.f1368e = null;
        abstractComponentCallbacksC0434l.f1381r = 0;
        abstractComponentCallbacksC0434l.f1378o = false;
        abstractComponentCallbacksC0434l.f1375l = false;
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l2 = abstractComponentCallbacksC0434l.f1371h;
        abstractComponentCallbacksC0434l.f1372i = abstractComponentCallbacksC0434l2 != null ? abstractComponentCallbacksC0434l2.f1369f : null;
        abstractComponentCallbacksC0434l.f1371h = null;
        Bundle bundle = c0413d.f1249m;
        if (bundle != null) {
            abstractComponentCallbacksC0434l.f1366c = bundle;
        } else {
            abstractComponentCallbacksC0434l.f1366c = new Bundle();
        }
    }
}

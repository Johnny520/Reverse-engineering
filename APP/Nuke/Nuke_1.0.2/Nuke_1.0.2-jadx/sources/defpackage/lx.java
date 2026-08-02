package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lx {
    public final View a;
    public final yx b;
    public final ia1 c;
    public final tc2 d;
    public final lb3 e;
    public final vx0 f;
    public final l92 g;
    public final Configuration h;
    public final xk1 i;
    public final a6 j;
    public final z8 k;
    public final j6 l;
    public final i6 m;
    public final wl0 n;
    public final xk1 o;
    public final bs0 p;
    public final zb q;
    public final t61 r;
    public final k91 s;
    public final tp t;
    public int u;
    public final kx v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public lx(lx lxVar, View view, yx yxVar, ia1 ia1Var, tc2 tc2Var, lb3 lb3Var) {
        vx0 vx0Var;
        Configuration configuration;
        xk1 xk1VarU;
        a6 a6Var;
        z8 z8Var;
        j6 j6Var;
        i6 i6Var;
        wl0 z8Var2;
        xk1 nx1Var;
        zb zbVar;
        tp tpVar;
        t61 t61Var;
        l92 l92Var;
        View view2;
        boolean zL = t11.l((lxVar == null || (view2 = lxVar.a) == null) ? null : view2.getContext(), view.getContext());
        this.a = view;
        this.b = yxVar;
        this.c = ia1Var;
        this.d = tc2Var;
        this.e = lb3Var;
        if (zL) {
            lxVar.getClass();
            vx0Var = lxVar.f;
        } else {
            vx0Var = new vx0();
        }
        this.f = vx0Var;
        this.g = (lxVar == null || (l92Var = lxVar.g) == null) ? new l92() : l92Var;
        if (zL) {
            lxVar.getClass();
            configuration = lxVar.h;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.h = configuration;
        if (zL) {
            lxVar.getClass();
            xk1VarU = lxVar.i;
        } else {
            xk1VarU = op0.u(new Configuration(configuration));
        }
        this.i = xk1VarU;
        if (zL) {
            lxVar.getClass();
            a6Var = lxVar.j;
        } else {
            Context context = view.getContext();
            a6Var = new a6();
            Object systemService = context.getSystemService("accessibility");
            systemService.getClass();
        }
        this.j = a6Var;
        if (zL) {
            lxVar.getClass();
            z8Var = lxVar.k;
        } else {
            view.getContext();
            z8Var = new z8(1);
        }
        this.k = z8Var;
        if (zL) {
            lxVar.getClass();
            j6Var = lxVar.l;
        } else {
            j6Var = new j6(view.getContext());
        }
        this.l = j6Var;
        if (zL) {
            lxVar.getClass();
            i6Var = lxVar.m;
        } else {
            i6Var = new i6(j6Var);
        }
        this.m = i6Var;
        if (zL) {
            lxVar.getClass();
            z8Var2 = lxVar.n;
        } else {
            view.getContext();
            z8Var2 = new z8(0);
        }
        this.n = z8Var2;
        if (zL) {
            lxVar.getClass();
            nx1Var = lxVar.o;
        } else {
            nx1Var = new nx1(eu.D(view.getContext()), sn.P);
        }
        this.o = nx1Var;
        this.p = view == (lxVar != null ? lxVar.a : null) ? lxVar.p : new b02(view);
        if (zL) {
            lxVar.getClass();
            zbVar = lxVar.q;
        } else {
            zbVar = new zb(ViewConfiguration.get(view.getContext()));
        }
        this.q = zbVar;
        this.r = (lxVar == null || (t61Var = lxVar.r) == null) ? new t61() : t61Var;
        this.s = new k91();
        this.t = (lxVar == null || (tpVar = lxVar.t) == null) ? new tp() : tpVar;
        new ea(6, this);
        this.v = new kx(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(b7 b7Var, mn0 mn0Var, px pxVar, int i) {
        boolean z;
        go0 go0Var = (go0) pxVar;
        go0Var.X(123858079);
        int i2 = (go0Var.h(b7Var) ? 4 : 2) | i | (go0Var.h(mn0Var) ? 32 : 16) | (go0Var.h(this) ? 256 : 128);
        int i3 = 1;
        if (go0Var.O(i2 & 1, (i2 & 147) != 146)) {
            Object tag = b7Var.getTag(R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof q41) && !(tag instanceof t41))) ? null : (Set) tag;
            if (set == null) {
                Object parent = b7Var.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof q41) && !(tag2 instanceof t41))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(go0Var.w());
                go0Var.q = true;
                go0Var.C = true;
                go0Var.c.b();
                go0Var.H.b();
                tr2 tr2Var = go0Var.I;
                qr2 qr2Var = tr2Var.a;
                tr2Var.e = qr2Var.q;
                tr2Var.f = qr2Var.r;
            }
            Object objL = go0Var.L();
            tc2 tc2Var = this.d;
            eb ebVar = nx.a;
            if (objL == ebVar) {
                Object parent2 = b7Var.getParent();
                parent2.getClass();
                View view2 = (View) parent2;
                Object tag3 = view2.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag3 instanceof String ? (String) tag3 : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view2.getId());
                }
                String strI = vi0.i("SaveableStateRegistry:", strValueOf);
                qc2 savedStateRegistry = tc2Var.getSavedStateRegistry();
                Bundle bundleA = savedStateRegistry.a(strI);
                if (bundleA != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str : bundleA.keySet()) {
                        ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str, parcelableArrayList);
                    }
                }
                v6 v6Var = v6.G;
                tu2 tu2Var = hc2.a;
                gc2 gc2Var = new gc2(linkedHashMap, v6Var);
                if (savedStateRegistry.b(strI) != null) {
                    z = false;
                    da0 da0Var = new da0(gc2Var, new ea0(z, savedStateRegistry, strI));
                    go0Var.f0(da0Var);
                    objL = da0Var;
                } else {
                    try {
                        savedStateRegistry.c(strI, new uv(i3, gc2Var));
                        z = true;
                    } catch (IllegalArgumentException unused) {
                        z = false;
                    }
                    da0 da0Var2 = new da0(gc2Var, new ea0(z, savedStateRegistry, strI));
                    go0Var.f0(da0Var2);
                    objL = da0Var2;
                }
            }
            da0 da0Var3 = (da0) objL;
            boolean zH = go0Var.h(da0Var3);
            Object objL2 = go0Var.L();
            if (zH || objL2 == ebVar) {
                objL2 = new v5(9, da0Var3);
                go0Var.f0(objL2);
            }
            eu.c(a83.a, (in0) objL2, go0Var);
            my myVar = ly.w;
            boolean zBooleanValue = ((Boolean) go0Var.j(myVar)).booleanValue() | b7Var.getScrollCaptureInProgress$ui();
            boolean zF = go0Var.f(b7Var.getView());
            Object objL3 = go0Var.L();
            if (zF || objL3 == ebVar) {
                objL3 = new qb3(b7Var.getView());
                go0Var.f0(objL3);
            }
            ci0.b(new f42[]{zb1.a.a(this.c), fc1.a.a(tc2Var), r7.d.a(this.f), r7.e.a(this.g), r7.b.a(b7Var.getContext()), k01.a.a(set), r7.a.a(b7Var.getConfiguration()), hc2.a.a(da0Var3), r7.f.a(b7Var.getView()), myVar.a(Boolean.valueOf(zBooleanValue)), ly.t.a(b7Var.getViewConfiguration()), mu0.a.a((qb3) objL3)}, xe1.i0(1317454175, new jx(b7Var, this, mn0Var), go0Var), go0Var, 56);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new jx(this, b7Var, mn0Var, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        int i = this.u - 1;
        this.u = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.u = 0;
        }
        if (this.u == 0) {
            View view = this.a;
            Context context = view.getContext();
            kx kxVar = this.v;
            context.unregisterComponentCallbacks(kxVar);
            this.s.getClass();
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(kxVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        int i = this.u + 1;
        this.u = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            kx kxVar = this.v;
            context.registerComponentCallbacks(kxVar);
            d(view.getResources().getConfiguration());
            this.s.a.setValue(Boolean.valueOf(view.hasWindowFocus()));
            view.getViewTreeObserver().addOnWindowFocusChangeListener(kxVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(Configuration configuration) {
        int iUpdateFrom = this.h.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.f.a.entrySet().iterator();
            while (it.hasNext()) {
                tx0 tx0Var = (tx0) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (tx0Var == null || Configuration.needNewResources(iUpdateFrom, tx0Var.b)) {
                    it.remove();
                }
            }
            this.i.setValue(new Configuration(configuration));
            l92 l92Var = this.g;
            synchronized (l92Var) {
                l92Var.a.c();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                this.o.setValue(eu.D(this.a.getContext()));
            }
            if (((-1342235264) & iUpdateFrom) != 0) {
                this.s.getClass();
            }
        }
    }
}

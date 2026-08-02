package p000;

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

/* JADX INFO: renamed from: lx */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0440lx {

    /* JADX INFO: renamed from: a */
    public final View f6348a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0941yx f6349b;

    /* JADX INFO: renamed from: c */
    public final ia1 f6350c;

    /* JADX INFO: renamed from: d */
    public final tc2 f6351d;

    /* JADX INFO: renamed from: e */
    public final lb3 f6352e;

    /* JADX INFO: renamed from: f */
    public final vx0 f6353f;

    /* JADX INFO: renamed from: g */
    public final l92 f6354g;

    /* JADX INFO: renamed from: h */
    public final Configuration f6355h;

    /* JADX INFO: renamed from: i */
    public final xk1 f6356i;

    /* JADX INFO: renamed from: j */
    public final C0007a6 f6357j;

    /* JADX INFO: renamed from: k */
    public final C0953z8 f6358k;

    /* JADX INFO: renamed from: l */
    public final C0338j6 f6359l;

    /* JADX INFO: renamed from: m */
    public final C0303i6 f6360m;

    /* JADX INFO: renamed from: n */
    public final wl0 f6361n;

    /* JADX INFO: renamed from: o */
    public final xk1 f6362o;

    /* JADX INFO: renamed from: p */
    public final bs0 f6363p;

    /* JADX INFO: renamed from: q */
    public final C0956zb f6364q;

    /* JADX INFO: renamed from: r */
    public final t61 f6365r;

    /* JADX INFO: renamed from: s */
    public final k91 f6366s;

    /* JADX INFO: renamed from: t */
    public final C0742tp f6367t;

    /* JADX INFO: renamed from: u */
    public int f6368u;

    /* JADX INFO: renamed from: v */
    public final ComponentCallbacks2C0403kx f6369v;

    public C0440lx(C0440lx c0440lx, View view, AbstractC0941yx abstractC0941yx, ia1 ia1Var, tc2 tc2Var, lb3 lb3Var) {
        vx0 vx0Var;
        Configuration configuration;
        xk1 xk1VarM3598u;
        C0007a6 c0007a6;
        C0953z8 c0953z8;
        C0338j6 c0338j6;
        C0303i6 c0303i6;
        wl0 c0953z82;
        xk1 nx1Var;
        C0956zb c0956zb;
        C0742tp c0742tp;
        t61 t61Var;
        l92 l92Var;
        View view2;
        boolean zM5086l = t11.m5086l((c0440lx == null || (view2 = c0440lx.f6348a) == null) ? null : view2.getContext(), view.getContext());
        this.f6348a = view;
        this.f6349b = abstractC0941yx;
        this.f6350c = ia1Var;
        this.f6351d = tc2Var;
        this.f6352e = lb3Var;
        if (zM5086l) {
            c0440lx.getClass();
            vx0Var = c0440lx.f6353f;
        } else {
            vx0Var = new vx0();
        }
        this.f6353f = vx0Var;
        this.f6354g = (c0440lx == null || (l92Var = c0440lx.f6354g) == null) ? new l92() : l92Var;
        if (zM5086l) {
            c0440lx.getClass();
            configuration = c0440lx.f6355h;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.f6355h = configuration;
        if (zM5086l) {
            c0440lx.getClass();
            xk1VarM3598u = c0440lx.f6356i;
        } else {
            xk1VarM3598u = op0.m3598u(new Configuration(configuration));
        }
        this.f6356i = xk1VarM3598u;
        if (zM5086l) {
            c0440lx.getClass();
            c0007a6 = c0440lx.f6357j;
        } else {
            Context context = view.getContext();
            c0007a6 = new C0007a6();
            Object systemService = context.getSystemService("accessibility");
            systemService.getClass();
        }
        this.f6357j = c0007a6;
        if (zM5086l) {
            c0440lx.getClass();
            c0953z8 = c0440lx.f6358k;
        } else {
            view.getContext();
            c0953z8 = new C0953z8(1);
        }
        this.f6358k = c0953z8;
        if (zM5086l) {
            c0440lx.getClass();
            c0338j6 = c0440lx.f6359l;
        } else {
            c0338j6 = new C0338j6(view.getContext());
        }
        this.f6359l = c0338j6;
        if (zM5086l) {
            c0440lx.getClass();
            c0303i6 = c0440lx.f6360m;
        } else {
            c0303i6 = new C0303i6(c0338j6);
        }
        this.f6360m = c0303i6;
        if (zM5086l) {
            c0440lx.getClass();
            c0953z82 = c0440lx.f6361n;
        } else {
            view.getContext();
            c0953z82 = new C0953z8(0);
        }
        this.f6361n = c0953z82;
        if (zM5086l) {
            c0440lx.getClass();
            nx1Var = c0440lx.f6362o;
        } else {
            nx1Var = new nx1(AbstractC0179eu.m1423D(view.getContext()), C0700sn.f10212P);
        }
        this.f6362o = nx1Var;
        this.f6363p = view == (c0440lx != null ? c0440lx.f6348a : null) ? c0440lx.f6363p : new b02(view);
        if (zM5086l) {
            c0440lx.getClass();
            c0956zb = c0440lx.f6364q;
        } else {
            c0956zb = new C0956zb(ViewConfiguration.get(view.getContext()));
        }
        this.f6364q = c0956zb;
        this.f6365r = (c0440lx == null || (t61Var = c0440lx.f6365r) == null) ? new t61() : t61Var;
        this.f6366s = new k91();
        this.f6367t = (c0440lx == null || (c0742tp = c0440lx.f6367t) == null) ? new C0742tp() : c0742tp;
        new C0159ea(6, this);
        this.f6369v = new ComponentCallbacks2C0403kx(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m2980a(ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7, mn0 mn0Var, InterfaceC0596px interfaceC0596px, int i) {
        boolean z;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(123858079);
        int i2 = (go0Var.m1984h(viewTreeObserverOnGlobalLayoutListenerC0045b7) ? 4 : 2) | i | (go0Var.m1984h(mn0Var) ? 32 : 16) | (go0Var.m1984h(this) ? 256 : 128);
        int i3 = 1;
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            Object tag = viewTreeObserverOnGlobalLayoutListenerC0045b7.getTag(R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof q41) && !(tag instanceof t41))) ? null : (Set) tag;
            if (set == null) {
                Object parent = viewTreeObserverOnGlobalLayoutListenerC0045b7.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof q41) && !(tag2 instanceof t41))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(go0Var.m2001w());
                go0Var.f3632q = true;
                go0Var.f3597C = true;
                go0Var.f3618c.m4273b();
                go0Var.f3602H.m4273b();
                tr2 tr2Var = go0Var.f3603I;
                qr2 qr2Var = tr2Var.f10913a;
                tr2Var.f10917e = qr2Var.f9141q;
                tr2Var.f10918f = qr2Var.f9142r;
            }
            Object objM1956L = go0Var.m1956L();
            tc2 tc2Var = this.f6351d;
            C0160eb c0160eb = C0520nx.f7360a;
            if (objM1956L == c0160eb) {
                Object parent2 = viewTreeObserverOnGlobalLayoutListenerC0045b7.getParent();
                parent2.getClass();
                View view2 = (View) parent2;
                Object tag3 = view2.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag3 instanceof String ? (String) tag3 : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view2.getId());
                }
                String strM5690i = vi0.m5690i("SaveableStateRegistry:", strValueOf);
                qc2 savedStateRegistry = tc2Var.getSavedStateRegistry();
                Bundle bundleM4133a = savedStateRegistry.m4133a(strM5690i);
                if (bundleM4133a != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str : bundleM4133a.keySet()) {
                        ArrayList parcelableArrayList = bundleM4133a.getParcelableArrayList(str);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str, parcelableArrayList);
                    }
                }
                C0799v6 c0799v6 = C0799v6.f11754G;
                tu2 tu2Var = hc2.f3953a;
                gc2 gc2Var = new gc2(linkedHashMap, c0799v6);
                if (savedStateRegistry.m4134b(strM5690i) != null) {
                    z = false;
                    da0 da0Var = new da0(gc2Var, new ea0(z, savedStateRegistry, strM5690i));
                    go0Var.m1981f0(da0Var);
                    objM1956L = da0Var;
                } else {
                    try {
                        savedStateRegistry.m4135c(strM5690i, new C0787uv(i3, gc2Var));
                        z = true;
                    } catch (IllegalArgumentException unused) {
                        z = false;
                    }
                    da0 da0Var2 = new da0(gc2Var, new ea0(z, savedStateRegistry, strM5690i));
                    go0Var.m1981f0(da0Var2);
                    objM1956L = da0Var2;
                }
            }
            da0 da0Var3 = (da0) objM1956L;
            boolean zM1984h = go0Var.m1984h(da0Var3);
            Object objM1956L2 = go0Var.m1956L();
            if (zM1984h || objM1956L2 == c0160eb) {
                objM1956L2 = new C0798v5(9, da0Var3);
                go0Var.m1981f0(objM1956L2);
            }
            AbstractC0179eu.m1450c(a83.f116a, (in0) objM1956L2, go0Var);
            C0478my c0478my = AbstractC0441ly.f6397w;
            boolean zBooleanValue = ((Boolean) go0Var.m1988j(c0478my)).booleanValue() | viewTreeObserverOnGlobalLayoutListenerC0045b7.getScrollCaptureInProgress$ui();
            boolean zM1980f = go0Var.m1980f(viewTreeObserverOnGlobalLayoutListenerC0045b7.getView());
            Object objM1956L3 = go0Var.m1956L();
            if (zM1980f || objM1956L3 == c0160eb) {
                objM1956L3 = new qb3(viewTreeObserverOnGlobalLayoutListenerC0045b7.getView());
                go0Var.m1981f0(objM1956L3);
            }
            ci0.m801b(new f42[]{zb1.f13820a.mo1251a(this.f6350c), fc1.f2903a.mo1251a(tc2Var), AbstractC0646r7.f9413d.mo1251a(this.f6353f), AbstractC0646r7.f9414e.mo1251a(this.f6354g), AbstractC0646r7.f9411b.mo1251a(viewTreeObserverOnGlobalLayoutListenerC0045b7.getContext()), k01.f5293a.mo1251a(set), AbstractC0646r7.f9410a.mo1251a(viewTreeObserverOnGlobalLayoutListenerC0045b7.getConfiguration()), hc2.f3953a.mo1251a(da0Var3), AbstractC0646r7.f9415f.mo1251a(viewTreeObserverOnGlobalLayoutListenerC0045b7.getView()), c0478my.mo1251a(Boolean.valueOf(zBooleanValue)), AbstractC0441ly.f6394t.mo1251a(viewTreeObserverOnGlobalLayoutListenerC0045b7.getViewConfiguration()), mu0.f6882a.mo1251a((qb3) objM1956L3)}, xe1.m6126i0(1317454175, new C0366jx(viewTreeObserverOnGlobalLayoutListenerC0045b7, this, mn0Var), go0Var), go0Var, 56);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0366jx(this, viewTreeObserverOnGlobalLayoutListenerC0045b7, mn0Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2981b() {
        int i = this.f6368u - 1;
        this.f6368u = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.f6368u = 0;
        }
        if (this.f6368u == 0) {
            View view = this.f6348a;
            Context context = view.getContext();
            ComponentCallbacks2C0403kx componentCallbacks2C0403kx = this.f6369v;
            context.unregisterComponentCallbacks(componentCallbacks2C0403kx);
            this.f6366s.getClass();
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(componentCallbacks2C0403kx);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2982c() {
        int i = this.f6368u + 1;
        this.f6368u = i;
        if (i == 1) {
            View view = this.f6348a;
            Context context = view.getContext();
            ComponentCallbacks2C0403kx componentCallbacks2C0403kx = this.f6369v;
            context.registerComponentCallbacks(componentCallbacks2C0403kx);
            m2983d(view.getResources().getConfiguration());
            this.f6366s.f5408a.setValue(Boolean.valueOf(view.hasWindowFocus()));
            view.getViewTreeObserver().addOnWindowFocusChangeListener(componentCallbacks2C0403kx);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2983d(Configuration configuration) {
        int iUpdateFrom = this.f6355h.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.f6353f.f12208a.entrySet().iterator();
            while (it.hasNext()) {
                tx0 tx0Var = (tx0) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (tx0Var == null || Configuration.needNewResources(iUpdateFrom, tx0Var.f10992b)) {
                    it.remove();
                }
            }
            this.f6356i.setValue(new Configuration(configuration));
            l92 l92Var = this.f6354g;
            synchronized (l92Var) {
                l92Var.f5994a.m6416c();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                this.f6362o.setValue(AbstractC0179eu.m1423D(this.f6348a.getContext()));
            }
            if (((-1342235264) & iUpdateFrom) != 0) {
                this.f6366s.getClass();
            }
        }
    }
}

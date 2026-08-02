package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ff3 {
    public static final WeakHashMap v = new WeakHashMap();
    public final oc a;
    public final oc b;
    public final oc c;
    public final oc d;
    public final oc e;
    public final oc f;
    public final oc g;
    public final oc h;
    public final oc i;
    public final o93 j;
    public final nx1 k;
    public final o93 l;
    public final o93 m;
    public final o93 n;
    public final o93 o;
    public final o93 p;
    public final o93 q;
    public final o93 r;
    public final boolean s;
    public int t;
    public final c01 u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ff3(View view) {
        oc ocVarC = ix2.c("captionBar", 4);
        this.a = ocVarC;
        oc ocVarC2 = ix2.c("displayCutout", 128);
        this.b = ocVarC2;
        oc ocVarC3 = ix2.c("ime", 8);
        this.c = ocVarC3;
        oc ocVarC4 = ix2.c("mandatorySystemGestures", 32);
        this.d = ocVarC4;
        oc ocVarC5 = ix2.c("navigationBars", 2);
        this.e = ocVarC5;
        oc ocVarC6 = ix2.c("statusBars", 1);
        this.f = ocVarC6;
        oc ocVarC7 = ix2.c("systemBars", 519);
        this.g = ocVarC7;
        oc ocVarC8 = ix2.c("systemGestures", 16);
        this.h = ocVarC8;
        oc ocVarC9 = ix2.c("tappableElement", 64);
        this.i = ocVarC9;
        o93 o93Var = new o93(new g01(0, 0, 0, 0), "waterfall");
        this.j = o93Var;
        this.k = op0.u(null);
        new z73(new z73(ocVarC7, ocVarC3), ocVarC2);
        new z73(new z73(new z73(ocVarC9, ocVarC4), ocVarC8), o93Var);
        this.l = ix2.d("captionBarIgnoringVisibility", 4);
        this.m = ix2.d("navigationBarsIgnoringVisibility", 2);
        this.n = ix2.d("statusBarsIgnoringVisibility", 1);
        this.o = ix2.d("systemBarsIgnoringVisibility", 519);
        this.p = ix2.d("tappableElementIgnoringVisibility", 64);
        this.q = new o93(new g01(0, 0, 0, 0), "imeAnimationTarget");
        this.r = new o93(new g01(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.s = bool != null ? bool.booleanValue() : false;
        this.u = new c01(this);
        int i = wa3.a;
        cf3 cf3VarA = sa3.a(view);
        if (cf3VarA != null) {
            ye3 ye3Var = cf3VarA.a;
            ocVarC.f(ye3Var.u(4));
            ocVarC2.f(ye3Var.u(128));
            ocVarC3.f(ye3Var.u(8));
            ocVarC4.f(ye3Var.u(32));
            ocVarC5.f(ye3Var.u(2));
            ocVarC6.f(ye3Var.u(1));
            ocVarC7.f(ye3Var.u(519));
            ocVarC8.f(ye3Var.u(16));
            ocVarC9.f(ye3Var.u(64));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(ff3 ff3Var, cf3 cf3Var) {
        boolean z = false;
        ff3Var.a.g(cf3Var, 0);
        ff3Var.c.g(cf3Var, 0);
        ff3Var.b.g(cf3Var, 0);
        ff3Var.e.g(cf3Var, 0);
        ff3Var.f.g(cf3Var, 0);
        ff3Var.g.g(cf3Var, 0);
        ff3Var.h.g(cf3Var, 0);
        ff3Var.i.g(cf3Var, 0);
        ff3Var.d.g(cf3Var, 0);
        ff3Var.l.f(kf3.a(cf3Var.a.j(4)));
        ff3Var.m.f(kf3.a(cf3Var.a.j(2)));
        ff3Var.n.f(kf3.a(cf3Var.a.j(1)));
        ff3Var.o.f(kf3.a(cf3Var.a.j(519)));
        ff3Var.p.f(kf3.a(cf3Var.a.j(64)));
        t90 t90VarH = cf3Var.a.h();
        ff3Var.j.f(kf3.a(t90VarH != null ? t90VarH.a() : zz0.e));
        y9 y9Var = null;
        if (t90VarH != null) {
            Path pathB = Build.VERSION.SDK_INT >= 31 ? ne.b(t90VarH.a) : null;
            if (pathB != null) {
                y9Var = new y9(pathB);
            }
        }
        ff3Var.k.setValue(y9Var);
        synchronized (ds2.c) {
            sk1 sk1Var = ds2.j.h;
            if (sk1Var != null) {
                if (sk1Var.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            ds2.a();
        }
    }
}

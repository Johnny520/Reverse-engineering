package p000;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ff3 {

    /* JADX INFO: renamed from: v */
    public static final WeakHashMap f2953v = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public final C0538oc f2954a;

    /* JADX INFO: renamed from: b */
    public final C0538oc f2955b;

    /* JADX INFO: renamed from: c */
    public final C0538oc f2956c;

    /* JADX INFO: renamed from: d */
    public final C0538oc f2957d;

    /* JADX INFO: renamed from: e */
    public final C0538oc f2958e;

    /* JADX INFO: renamed from: f */
    public final C0538oc f2959f;

    /* JADX INFO: renamed from: g */
    public final C0538oc f2960g;

    /* JADX INFO: renamed from: h */
    public final C0538oc f2961h;

    /* JADX INFO: renamed from: i */
    public final C0538oc f2962i;

    /* JADX INFO: renamed from: j */
    public final o93 f2963j;

    /* JADX INFO: renamed from: k */
    public final nx1 f2964k;

    /* JADX INFO: renamed from: l */
    public final o93 f2965l;

    /* JADX INFO: renamed from: m */
    public final o93 f2966m;

    /* JADX INFO: renamed from: n */
    public final o93 f2967n;

    /* JADX INFO: renamed from: o */
    public final o93 f2968o;

    /* JADX INFO: renamed from: p */
    public final o93 f2969p;

    /* JADX INFO: renamed from: q */
    public final o93 f2970q;

    /* JADX INFO: renamed from: r */
    public final o93 f2971r;

    /* JADX INFO: renamed from: s */
    public final boolean f2972s;

    /* JADX INFO: renamed from: t */
    public int f2973t;

    /* JADX INFO: renamed from: u */
    public final c01 f2974u;

    public ff3(View view) {
        C0538oc c0538ocM2410c = ix2.m2410c("captionBar", 4);
        this.f2954a = c0538ocM2410c;
        C0538oc c0538ocM2410c2 = ix2.m2410c("displayCutout", 128);
        this.f2955b = c0538ocM2410c2;
        C0538oc c0538ocM2410c3 = ix2.m2410c("ime", 8);
        this.f2956c = c0538ocM2410c3;
        C0538oc c0538ocM2410c4 = ix2.m2410c("mandatorySystemGestures", 32);
        this.f2957d = c0538ocM2410c4;
        C0538oc c0538ocM2410c5 = ix2.m2410c("navigationBars", 2);
        this.f2958e = c0538ocM2410c5;
        C0538oc c0538ocM2410c6 = ix2.m2410c("statusBars", 1);
        this.f2959f = c0538ocM2410c6;
        C0538oc c0538ocM2410c7 = ix2.m2410c("systemBars", 519);
        this.f2960g = c0538ocM2410c7;
        C0538oc c0538ocM2410c8 = ix2.m2410c("systemGestures", 16);
        this.f2961h = c0538ocM2410c8;
        C0538oc c0538ocM2410c9 = ix2.m2410c("tappableElement", 64);
        this.f2962i = c0538ocM2410c9;
        o93 o93Var = new o93(new g01(0, 0, 0, 0), "waterfall");
        this.f2963j = o93Var;
        this.f2964k = op0.m3598u(null);
        new z73(new z73(c0538ocM2410c7, c0538ocM2410c3), c0538ocM2410c2);
        new z73(new z73(new z73(c0538ocM2410c9, c0538ocM2410c4), c0538ocM2410c8), o93Var);
        this.f2965l = ix2.m2411d("captionBarIgnoringVisibility", 4);
        this.f2966m = ix2.m2411d("navigationBarsIgnoringVisibility", 2);
        this.f2967n = ix2.m2411d("statusBarsIgnoringVisibility", 1);
        this.f2968o = ix2.m2411d("systemBarsIgnoringVisibility", 519);
        this.f2969p = ix2.m2411d("tappableElementIgnoringVisibility", 64);
        this.f2970q = new o93(new g01(0, 0, 0, 0), "imeAnimationTarget");
        this.f2971r = new o93(new g01(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f2972s = bool != null ? bool.booleanValue() : false;
        this.f2974u = new c01(this);
        int i = wa3.f12444a;
        cf3 cf3VarM4780a = sa3.m4780a(view);
        if (cf3VarM4780a != null) {
            ye3 ye3Var = cf3VarM4780a.f1518a;
            c0538ocM2410c.m3554f(ye3Var.mo4172u(4));
            c0538ocM2410c2.m3554f(ye3Var.mo4172u(128));
            c0538ocM2410c3.m3554f(ye3Var.mo4172u(8));
            c0538ocM2410c4.m3554f(ye3Var.mo4172u(32));
            c0538ocM2410c5.m3554f(ye3Var.mo4172u(2));
            c0538ocM2410c6.m3554f(ye3Var.mo4172u(1));
            c0538ocM2410c7.m3554f(ye3Var.mo4172u(519));
            c0538ocM2410c8.m3554f(ye3Var.mo4172u(16));
            c0538ocM2410c9.m3554f(ye3Var.mo4172u(64));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1609a(ff3 ff3Var, cf3 cf3Var) {
        boolean z = false;
        ff3Var.f2954a.m3555g(cf3Var, 0);
        ff3Var.f2956c.m3555g(cf3Var, 0);
        ff3Var.f2955b.m3555g(cf3Var, 0);
        ff3Var.f2958e.m3555g(cf3Var, 0);
        ff3Var.f2959f.m3555g(cf3Var, 0);
        ff3Var.f2960g.m3555g(cf3Var, 0);
        ff3Var.f2961h.m3555g(cf3Var, 0);
        ff3Var.f2962i.m3555g(cf3Var, 0);
        ff3Var.f2957d.m3555g(cf3Var, 0);
        ff3Var.f2965l.m3542f(kf3.m2666a(cf3Var.f1518a.mo4166j(4)));
        ff3Var.f2966m.m3542f(kf3.m2666a(cf3Var.f1518a.mo4166j(2)));
        ff3Var.f2967n.m3542f(kf3.m2666a(cf3Var.f1518a.mo4166j(1)));
        ff3Var.f2968o.m3542f(kf3.m2666a(cf3Var.f1518a.mo4166j(519)));
        ff3Var.f2969p.m3542f(kf3.m2666a(cf3Var.f1518a.mo4166j(64)));
        t90 t90VarMo4858h = cf3Var.f1518a.mo4858h();
        ff3Var.f2963j.m3542f(kf3.m2666a(t90VarMo4858h != null ? t90VarMo4858h.m5142a() : zz0.f14156e));
        C0915y9 c0915y9 = null;
        if (t90VarMo4858h != null) {
            Path pathM3287b = Build.VERSION.SDK_INT >= 31 ? AbstractC0495ne.m3287b(t90VarMo4858h.f10619a) : null;
            if (pathM3287b != null) {
                c0915y9 = new C0915y9(pathM3287b);
            }
        }
        ff3Var.f2964k.setValue(c0915y9);
        synchronized (ds2.f2181c) {
            sk1 sk1Var = ds2.f2188j.f12560h;
            if (sk1Var != null) {
                if (sk1Var.m4889h()) {
                    z = true;
                }
            }
        }
        if (z) {
            ds2.m1117a();
        }
    }
}

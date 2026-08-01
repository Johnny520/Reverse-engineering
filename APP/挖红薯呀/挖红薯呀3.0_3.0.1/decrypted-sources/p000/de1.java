package p000;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
import org.luckypray.dexkit.C0587R;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class de1 {

    /* JADX INFO: renamed from: v */
    public static final WeakHashMap f1062v = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public final C0915x6 f1063a;

    /* JADX INFO: renamed from: b */
    public final C0915x6 f1064b;

    /* JADX INFO: renamed from: c */
    public final C0915x6 f1065c;

    /* JADX INFO: renamed from: d */
    public final C0915x6 f1066d;

    /* JADX INFO: renamed from: e */
    public final C0915x6 f1067e;

    /* JADX INFO: renamed from: f */
    public final C0915x6 f1068f;

    /* JADX INFO: renamed from: g */
    public final C0915x6 f1069g;

    /* JADX INFO: renamed from: h */
    public final C0915x6 f1070h;

    /* JADX INFO: renamed from: i */
    public final C0915x6 f1071i;

    /* JADX INFO: renamed from: j */
    public final db1 f1072j;

    /* JADX INFO: renamed from: k */
    public final gp0 f1073k;

    /* JADX INFO: renamed from: l */
    public final db1 f1074l;

    /* JADX INFO: renamed from: m */
    public final db1 f1075m;

    /* JADX INFO: renamed from: n */
    public final db1 f1076n;

    /* JADX INFO: renamed from: o */
    public final db1 f1077o;

    /* JADX INFO: renamed from: p */
    public final db1 f1078p;

    /* JADX INFO: renamed from: q */
    public final db1 f1079q;

    /* JADX INFO: renamed from: r */
    public final db1 f1080r;

    /* JADX INFO: renamed from: s */
    public final boolean f1081s;

    /* JADX INFO: renamed from: t */
    public int f1082t;

    /* JADX INFO: renamed from: u */
    public final m20 f1083u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public de1(View view) {
        C0915x6 c0915x6M1727k = jo0.m1727k("captionBar", 4);
        this.f1063a = c0915x6M1727k;
        C0915x6 c0915x6M1727k2 = jo0.m1727k("displayCutout", 128);
        this.f1064b = c0915x6M1727k2;
        C0915x6 c0915x6M1727k3 = jo0.m1727k("ime", 8);
        this.f1065c = c0915x6M1727k3;
        C0915x6 c0915x6M1727k4 = jo0.m1727k("mandatorySystemGestures", 32);
        this.f1066d = c0915x6M1727k4;
        C0915x6 c0915x6M1727k5 = jo0.m1727k("navigationBars", 2);
        this.f1067e = c0915x6M1727k5;
        C0915x6 c0915x6M1727k6 = jo0.m1727k("statusBars", 1);
        this.f1068f = c0915x6M1727k6;
        C0915x6 c0915x6M1727k7 = jo0.m1727k("systemBars", 519);
        this.f1069g = c0915x6M1727k7;
        C0915x6 c0915x6M1727k8 = jo0.m1727k("systemGestures", 16);
        this.f1070h = c0915x6M1727k8;
        C0915x6 c0915x6M1727k9 = jo0.m1727k("tappableElement", 64);
        this.f1071i = c0915x6M1727k9;
        db1 db1Var = new db1(new q20(0, 0, 0, 0), "waterfall");
        this.f1072j = db1Var;
        this.f1073k = r60.m3419u(null);
        new ma1(new ma1(c0915x6M1727k7, c0915x6M1727k3), c0915x6M1727k2);
        new ma1(new ma1(new ma1(c0915x6M1727k9, c0915x6M1727k4), c0915x6M1727k8), db1Var);
        this.f1074l = jo0.m1729m("captionBarIgnoringVisibility", 4);
        this.f1075m = jo0.m1729m("navigationBarsIgnoringVisibility", 2);
        this.f1076n = jo0.m1729m("statusBarsIgnoringVisibility", 1);
        this.f1077o = jo0.m1729m("systemBarsIgnoringVisibility", 519);
        this.f1078p = jo0.m1729m("tappableElementIgnoringVisibility", 64);
        this.f1079q = new db1(new q20(0, 0, 0, 0), "imeAnimationTarget");
        this.f1080r = new db1(new q20(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(C0587R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f1081s = bool != null ? bool.booleanValue() : false;
        this.f1083u = new m20(this);
        int i = kc1.f3078a;
        be1 be1VarM1298a = hc1.m1298a(view);
        if (be1VarM1298a != null) {
            yd1 yd1Var = be1VarM1298a.f503a;
            c0915x6M1727k.m5087f(yd1Var.mo4317q(4));
            c0915x6M1727k2.m5087f(yd1Var.mo4317q(128));
            c0915x6M1727k3.m5087f(yd1Var.mo4317q(8));
            c0915x6M1727k4.m5087f(yd1Var.mo4317q(32));
            c0915x6M1727k5.m5087f(yd1Var.mo4317q(2));
            c0915x6M1727k6.m5087f(yd1Var.mo4317q(1));
            c0915x6M1727k7.m5087f(yd1Var.mo4317q(519));
            c0915x6M1727k8.m5087f(yd1Var.mo4317q(16));
            c0915x6M1727k9.m5087f(yd1Var.mo4317q(64));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m687a(de1 de1Var, be1 be1Var) {
        boolean z = false;
        de1Var.f1063a.m5088g(be1Var, 0);
        de1Var.f1065c.m5088g(be1Var, 0);
        de1Var.f1064b.m5088g(be1Var, 0);
        de1Var.f1067e.m5088g(be1Var, 0);
        de1Var.f1068f.m5088g(be1Var, 0);
        de1Var.f1069g.m5088g(be1Var, 0);
        de1Var.f1070h.m5088g(be1Var, 0);
        de1Var.f1071i.m5088g(be1Var, 0);
        de1Var.f1066d.m5088g(be1Var, 0);
        de1Var.f1074l.m680f(u50.m4259C(be1Var.f503a.mo3222i(4)));
        de1Var.f1075m.m680f(u50.m4259C(be1Var.f503a.mo3222i(2)));
        de1Var.f1076n.m680f(u50.m4259C(be1Var.f503a.mo3222i(1)));
        de1Var.f1077o.m680f(u50.m4259C(be1Var.f503a.mo3222i(519)));
        de1Var.f1078p.m680f(u50.m4259C(be1Var.f503a.mo3222i(64)));
        C0362jo c0362joMo4064g = be1Var.f503a.mo4064g();
        de1Var.f1072j.m680f(u50.m4259C(c0362joMo4064g != null ? i20.m1513b(c0362joMo4064g.f2918a.getWaterfallInsets()) : i20.f2403e));
        C0118d6 c0118d6 = null;
        if (c0362joMo4064g != null) {
            Path pathM2445b = Build.VERSION.SDK_INT >= 31 ? AbstractC0463m8.m2445b(c0362joMo4064g.f2918a) : null;
            if (pathM2445b != null) {
                c0118d6 = new C0118d6(pathM2445b);
            }
        }
        de1Var.f1073k.setValue(c0118d6);
        synchronized (t21.f5893c) {
            kh0 kh0Var = t21.f5900j.f4268h;
            if (kh0Var != null) {
                if (kh0Var.m1897h()) {
                    z = true;
                }
            }
        }
        if (z) {
            t21.m4163a();
        }
    }
}

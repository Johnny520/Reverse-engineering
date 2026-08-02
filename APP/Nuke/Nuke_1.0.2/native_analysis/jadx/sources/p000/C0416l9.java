package p000;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l9 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0416l9 implements v02 {

    /* JADX INFO: renamed from: a */
    public m91 f5986a;

    /* JADX INFO: renamed from: b */
    public zt2 f5987b;

    /* JADX INFO: renamed from: c */
    public u91 f5988c;

    /* JADX INFO: renamed from: d */
    public lq2 f5989d;

    @Override // p000.v02
    /* JADX INFO: renamed from: a */
    public final void mo2876a(k03 k03Var, us1 us1Var, y03 y03Var, C0967zm c0967zm, o62 o62Var, o62 o62Var2) {
        u91 u91Var = this.f5988c;
        if (u91Var != null) {
            n91 n91Var = u91Var.f11169m;
            synchronized (n91Var.f7060c) {
                try {
                    n91Var.f7067j = k03Var;
                    n91Var.f7069l = us1Var;
                    n91Var.f7068k = y03Var;
                    n91Var.f7070m = o62Var;
                    n91Var.f7071n = o62Var2;
                    if (n91Var.f7062e || n91Var.f7061d) {
                        n91Var.m3259a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p000.v02
    /* JADX INFO: renamed from: b */
    public final void mo2877b() {
        m2885j(null);
    }

    @Override // p000.v02
    /* JADX INFO: renamed from: c */
    public final void mo2878c(k03 k03Var, k03 k03Var2) {
        u91 u91Var = this.f5988c;
        if (u91Var != null) {
            boolean z = (f13.m1493b(u91Var.f11164h.f5297b, k03Var2.f5297b) && t11.m5086l(u91Var.f11164h.f5298c, k03Var2.f5298c)) ? false : true;
            u91Var.f11164h = k03Var2;
            int size = u91Var.f11166j.size();
            for (int i = 0; i < size; i++) {
                l62 l62Var = (l62) ((WeakReference) u91Var.f11166j.get(i)).get();
                if (l62Var != null) {
                    l62Var.f5956g = k03Var2;
                }
            }
            n91 n91Var = u91Var.f11169m;
            synchronized (n91Var.f7060c) {
                n91Var.f7067j = null;
                n91Var.f7069l = null;
                n91Var.f7068k = null;
                n91Var.f7070m = null;
                n91Var.f7071n = null;
            }
            if (t11.m5086l(k03Var, k03Var2)) {
                if (z) {
                    sz0 sz0Var = u91Var.f11158b;
                    int iM1497f = f13.m1497f(k03Var2.f5297b);
                    int iM1496e = f13.m1496e(k03Var2.f5297b);
                    f13 f13Var = u91Var.f11164h.f5298c;
                    int iM1497f2 = f13Var != null ? f13.m1497f(f13Var.f2739a) : -1;
                    f13 f13Var2 = u91Var.f11164h.f5298c;
                    sz0Var.m5033F().updateSelection((View) sz0Var.f10436i, iM1497f, iM1496e, iM1497f2, f13Var2 != null ? f13.m1496e(f13Var2.f2739a) : -1);
                    return;
                }
                return;
            }
            if (k03Var != null && (!t11.m5086l(k03Var.f5296a.f10051i, k03Var2.f5296a.f10051i) || (f13.m1493b(k03Var.f5297b, k03Var2.f5297b) && !t11.m5086l(k03Var.f5298c, k03Var2.f5298c)))) {
                sz0 sz0Var2 = u91Var.f11158b;
                sz0Var2.m5033F().restartInput((View) sz0Var2.f10436i);
                return;
            }
            int size2 = u91Var.f11166j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                l62 l62Var2 = (l62) ((WeakReference) u91Var.f11166j.get(i2)).get();
                if (l62Var2 != null) {
                    k03 k03Var3 = u91Var.f11164h;
                    sz0 sz0Var3 = u91Var.f11158b;
                    if (l62Var2.f5960k) {
                        l62Var2.f5956g = k03Var3;
                        if (l62Var2.f5958i) {
                            sz0Var3.m5033F().updateExtractedText((View) sz0Var3.f10436i, l62Var2.f5957h, qp0.m4255j(k03Var3));
                        }
                        f13 f13Var3 = k03Var3.f5298c;
                        long j = k03Var3.f5297b;
                        int iM1497f3 = f13Var3 != null ? f13.m1497f(f13Var3.f2739a) : -1;
                        f13 f13Var4 = k03Var3.f5298c;
                        sz0Var3.m5033F().updateSelection((View) sz0Var3.f10436i, f13.m1497f(j), f13.m1496e(j), iM1497f3, f13Var4 != null ? f13.m1496e(f13Var4.f2739a) : -1);
                    }
                }
            }
        }
    }

    @Override // p000.v02
    /* JADX INFO: renamed from: d */
    public final void mo2879d() {
        bt2 bt2Var;
        m91 m91Var = this.f5986a;
        if (m91Var == null || (bt2Var = (bt2) p40.m3733p(m91Var, AbstractC0441ly.f6391q)) == null) {
            return;
        }
        ((v60) bt2Var).m5626b();
    }

    @Override // p000.v02
    /* JADX INFO: renamed from: e */
    public final void mo2880e() {
        bt2 bt2Var;
        m91 m91Var = this.f5986a;
        if (m91Var == null || (bt2Var = (bt2) p40.m3733p(m91Var, AbstractC0441ly.f6391q)) == null) {
            return;
        }
        ((v60) bt2Var).m5625a();
    }

    @Override // p000.v02
    /* JADX INFO: renamed from: f */
    public final void mo2881f(k03 k03Var, xx0 xx0Var, C0444m0 c0444m0, n10 n10Var) {
        m2885j(new C0269h9(k03Var, this, xx0Var, c0444m0, n10Var, 0));
    }

    @Override // p000.v02
    /* JADX INFO: renamed from: g */
    public final void mo2882g() {
        zt2 zt2Var = this.f5987b;
        if (zt2Var != null) {
            zt2Var.mo1704c(null);
        }
        this.f5987b = null;
        vk1 vk1VarM2884i = m2884i();
        if (vk1VarM2884i != null) {
            lq2 lq2Var = (lq2) vk1VarM2884i;
            synchronized (lq2Var) {
                lq2Var.m2967t(lq2Var.m2961n() + ((long) lq2Var.f6259r), lq2Var.f6258q, lq2Var.m2961n() + ((long) lq2Var.f6259r), lq2Var.m2961n() + ((long) lq2Var.f6259r) + ((long) lq2Var.f6260s));
            }
        }
    }

    @Override // p000.v02
    /* JADX INFO: renamed from: h */
    public final void mo2883h(o62 o62Var) {
        Rect rect;
        u91 u91Var = this.f5988c;
        if (u91Var != null) {
            u91Var.f11168l = new Rect(gf1.m1869Q(o62Var.f7536a), gf1.m1869Q(o62Var.f7537b), gf1.m1869Q(o62Var.f7538c), gf1.m1869Q(o62Var.f7539d));
            if (!u91Var.f11166j.isEmpty() || (rect = u91Var.f11168l) == null) {
                return;
            }
            u91Var.f11157a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    /* JADX INFO: renamed from: i */
    public final vk1 m2884i() {
        lq2 lq2Var = this.f5989d;
        if (lq2Var != null) {
            return lq2Var;
        }
        if (!bw2.f1059a) {
            return null;
        }
        lq2 lq2VarM3769e = AbstractC0570p7.m3769e(0, 2, EnumC0283hn.f4086j);
        this.f5989d = lq2VarM3769e;
        return lq2VarM3769e;
    }

    /* JADX INFO: renamed from: j */
    public final void m2885j(C0269h9 c0269h9) {
        m91 m91Var = this.f5986a;
        if (m91Var == null) {
            return;
        }
        this.f5987b = m91Var.f10770u ? AbstractC0570p7.m3745A(m91Var.m5255A0(), null, new C0003a2(m91Var, new C0379k9(c0269h9, this, m91Var, zt2Var, 0), zt2Var, 14), 1) : null;
    }

    /* JADX INFO: renamed from: k */
    public final void m2886k(m91 m91Var) {
        if (!(this.f5986a == m91Var)) {
            nz0.m3458c("Expected textInputModifierNode to be " + m91Var + " but was " + this.f5986a);
        }
        this.f5986a = null;
    }
}

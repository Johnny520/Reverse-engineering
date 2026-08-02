package p000;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s73 implements InterfaceC0654rf {

    /* JADX INFO: renamed from: h */
    public final Object f9959h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f9960i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public Object f9961j;

    public s73(r61 r61Var) {
        this.f9959h = r61Var;
        this.f9961j = r61Var;
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: a */
    public final void mo2456a(int i, Object obj) {
        ((r61) this.f9961j).m4344A(i, (r61) obj);
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: b */
    public final void mo2457b(Object obj) {
        this.f9960i.add(this.f9961j);
        this.f9961j = obj;
    }

    /* JADX INFO: renamed from: c */
    public final void m4750c() {
        this.f9960i.clear();
        this.f9961j = this.f9959h;
        ((r61) this.f9959h).m4358P();
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: f */
    public final void mo2459f() {
        q62 rectManager;
        C0119d6 c0119d6;
        q62 rectManager2;
        r61 r61Var = (r61) this.f9961j;
        vn1 vn1Var = r61Var.f9372M;
        if (!r61Var.m4350H()) {
            kz0.m2763a("onReuse is only expected on attached node");
        }
        ab3 ab3Var = r61Var.f9398v;
        if (ab3Var != null) {
            View view = ab3Var.f4533i;
            if (view.getParent() != ab3Var) {
                ab3Var.addView(view);
            } else {
                ab3Var.f4537m.mo6a();
            }
        }
        f71 f71Var = r61Var.f9374O;
        if (f71Var != null) {
            f71Var.m1543i(false);
        }
        r61Var.f9360A = false;
        if (r61Var.f9383X) {
            r61Var.f9383X = false;
        } else {
            th1 th1Var = (qx2) r61Var.f9372M.f12035f;
            for (th1 th1Var2 = th1Var; th1Var2 != null; th1Var2 = th1Var2.f10761l) {
                if (th1Var2.f10770u) {
                    th1Var2.mo5258H0();
                }
            }
            for (th1 th1Var3 = th1Var; th1Var3 != null; th1Var3 = th1Var3.f10761l) {
                if (th1Var3.f10770u) {
                    th1Var3.mo5260J0();
                }
            }
            while (th1Var != null) {
                if (th1Var.f10770u) {
                    th1Var.mo5257D0();
                }
                th1Var = th1Var.f10761l;
            }
        }
        int i = r61Var.f9385i;
        zv1 zv1Var = r61Var.f9397u;
        if (zv1Var != null && (rectManager2 = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) zv1Var).getRectManager()) != null) {
            rectManager2.m4065g(r61Var);
        }
        r61Var.f9385i = nn2.f7265a.addAndGet(1);
        zv1 zv1Var2 = r61Var.f9397u;
        if (zv1Var2 != null) {
            ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = (ViewTreeObserverOnGlobalLayoutListenerC0045b7) zv1Var2;
            viewTreeObserverOnGlobalLayoutListenerC0045b7.getLayoutNodes().m6420g(i);
            viewTreeObserverOnGlobalLayoutListenerC0045b7.getLayoutNodes().m6421h(r61Var.f9385i, r61Var);
        }
        for (th1 th1Var4 = (th1) vn1Var.f12036g; th1Var4 != null; th1Var4 = th1Var4.f10762m) {
            th1Var4.mo5256C0();
        }
        vn1Var.m5742x();
        if (vn1Var.m5731m(8)) {
            r61Var.m4348F();
        }
        r61.m4342W(r61Var);
        zv1 zv1Var3 = r61Var.f9397u;
        if (zv1Var3 != null && (c0119d6 = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) zv1Var3).f666U) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b72 = c0119d6.f1877j;
            hh1 hh1Var = c0119d6.f1875h;
            ak1 ak1Var = c0119d6.f1882o;
            if (ak1Var.m186e(i)) {
                hh1Var.m2179B(viewTreeObserverOnGlobalLayoutListenerC0045b72, i, false);
            }
            ln2 ln2VarM4391w = r61Var.m4391w();
            if (ln2VarM4391w != null && ln2VarM4391w.f6221h.m4500b(vn2.f12075r)) {
                ak1Var.m182a(r61Var.f9385i);
                hh1Var.m2179B(viewTreeObserverOnGlobalLayoutListenerC0045b72, r61Var.f9385i, true);
            }
        }
        zv1 zv1Var4 = r61Var.f9397u;
        if (zv1Var4 == null || (rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) zv1Var4).getRectManager()) == null) {
            return;
        }
        rectManager.m4064f(r61Var);
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo2460g(int i, Object obj) {
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: i */
    public final void mo4444i() {
        zv1 zv1Var = ((r61) this.f9959h).f9397u;
        if (zv1Var != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) zv1Var).m481y();
        }
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: j */
    public final void mo2461j(int i, int i2, int i3) {
        ((r61) this.f9961j).m4354L(i, i2, i3);
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: k */
    public final Object mo2462k() {
        return this.f9961j;
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: l */
    public final void mo2463l(int i, int i2) {
        ((r61) this.f9961j).m4359Q(i, i2);
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: o */
    public final void mo2465o() {
        this.f9961j = this.f9960i.remove(r0.size() - 1);
    }
}

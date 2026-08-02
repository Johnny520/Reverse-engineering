package p000;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q03 implements v02 {

    /* JADX INFO: renamed from: a */
    public final View f8667a;

    /* JADX INFO: renamed from: b */
    public final C0043b5 f8668b;

    /* JADX INFO: renamed from: c */
    public final r03 f8669c;

    /* JADX INFO: renamed from: d */
    public boolean f8670d;

    /* JADX INFO: renamed from: e */
    public in0 f8671e;

    /* JADX INFO: renamed from: f */
    public in0 f8672f;

    /* JADX INFO: renamed from: g */
    public k03 f8673g;

    /* JADX INFO: renamed from: h */
    public xx0 f8674h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f8675i;

    /* JADX INFO: renamed from: j */
    public final j71 f8676j;

    /* JADX INFO: renamed from: k */
    public Rect f8677k;

    /* JADX INFO: renamed from: l */
    public final t30 f8678l;

    /* JADX INFO: renamed from: m */
    public final zk1 f8679m;

    /* JADX INFO: renamed from: n */
    public RunnableC0446m2 f8680n;

    public q03(View view, ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7) {
        C0043b5 c0043b5 = new C0043b5(view);
        r03 r03Var = new r03(Choreographer.getInstance());
        this.f8667a = view;
        this.f8668b = c0043b5;
        this.f8669c = r03Var;
        this.f8671e = oq0.f7768B;
        this.f8672f = oq0.f7769C;
        this.f8673g = new k03("", f13.f2737b, 4);
        this.f8674h = xx0.f13213g;
        this.f8675i = new ArrayList();
        this.f8676j = AbstractC0570p7.m3746B(i91.f4498i, new C0159ea(21, this));
        this.f8678l = new t30(viewTreeObserverOnGlobalLayoutListenerC0045b7, c0043b5);
        this.f8679m = new zk1(new p03[16]);
    }

    @Override // p000.v02
    /* JADX INFO: renamed from: a */
    public final void mo2876a(k03 k03Var, us1 us1Var, y03 y03Var, C0967zm c0967zm, o62 o62Var, o62 o62Var2) {
        t30 t30Var = this.f8678l;
        synchronized (t30Var.f10511c) {
            try {
                t30Var.f10518j = k03Var;
                t30Var.f10520l = us1Var;
                t30Var.f10519k = y03Var;
                t30Var.f10521m = c0967zm;
                t30Var.f10522n = o62Var;
                t30Var.f10523o = o62Var2;
                if (t30Var.f10513e || t30Var.f10512d) {
                    t30Var.m5114a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.v02
    /* JADX INFO: renamed from: b */
    public final void mo2877b() {
        m4040i(p03.f7915h);
    }

    @Override // p000.v02
    /* JADX INFO: renamed from: c */
    public final void mo2878c(k03 k03Var, k03 k03Var2) {
        boolean z = (f13.m1493b(this.f8673g.f5297b, k03Var2.f5297b) && t11.m5086l(this.f8673g.f5298c, k03Var2.f5298c)) ? false : true;
        this.f8673g = k03Var2;
        int size = this.f8675i.size();
        for (int i = 0; i < size; i++) {
            k62 k62Var = (k62) ((WeakReference) this.f8675i.get(i)).get();
            if (k62Var != null) {
                k62Var.f5357d = k03Var2;
            }
        }
        t30 t30Var = this.f8678l;
        synchronized (t30Var.f10511c) {
            t30Var.f10518j = null;
            t30Var.f10520l = null;
            t30Var.f10519k = null;
            t30Var.f10521m = C0799v6.f11750C;
            t30Var.f10522n = null;
            t30Var.f10523o = null;
        }
        if (t11.m5086l(k03Var, k03Var2)) {
            if (z) {
                C0043b5 c0043b5 = this.f8668b;
                int iM1497f = f13.m1497f(k03Var2.f5297b);
                int iM1496e = f13.m1496e(k03Var2.f5297b);
                f13 f13Var = this.f8673g.f5298c;
                int iM1497f2 = f13Var != null ? f13.m1497f(f13Var.f2739a) : -1;
                f13 f13Var2 = this.f8673g.f5298c;
                ((InputMethodManager) ((j71) c0043b5.f563j).getValue()).updateSelection((View) c0043b5.f562i, iM1497f, iM1496e, iM1497f2, f13Var2 != null ? f13.m1496e(f13Var2.f2739a) : -1);
                return;
            }
            return;
        }
        if (k03Var != null && (!t11.m5086l(k03Var.f5296a.f10051i, k03Var2.f5296a.f10051i) || (f13.m1493b(k03Var.f5297b, k03Var2.f5297b) && !t11.m5086l(k03Var.f5298c, k03Var2.f5298c)))) {
            C0043b5 c0043b52 = this.f8668b;
            ((InputMethodManager) ((j71) c0043b52.f563j).getValue()).restartInput((View) c0043b52.f562i);
            return;
        }
        int size2 = this.f8675i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            k62 k62Var2 = (k62) ((WeakReference) this.f8675i.get(i2)).get();
            if (k62Var2 != null) {
                k03 k03Var3 = this.f8673g;
                C0043b5 c0043b53 = this.f8668b;
                if (k62Var2.f5361h) {
                    k62Var2.f5357d = k03Var3;
                    if (k62Var2.f5359f) {
                        ((InputMethodManager) ((j71) c0043b53.f563j).getValue()).updateExtractedText((View) c0043b53.f562i, k62Var2.f5358e, AbstractC0179eu.m1451c0(k03Var3));
                    }
                    f13 f13Var3 = k03Var3.f5298c;
                    long j = k03Var3.f5297b;
                    int iM1497f3 = f13Var3 != null ? f13.m1497f(f13Var3.f2739a) : -1;
                    f13 f13Var4 = k03Var3.f5298c;
                    ((InputMethodManager) ((j71) c0043b53.f563j).getValue()).updateSelection((View) c0043b53.f562i, f13.m1497f(j), f13.m1496e(j), iM1497f3, f13Var4 != null ? f13.m1496e(f13Var4.f2739a) : -1);
                }
            }
        }
    }

    @Override // p000.v02
    /* JADX INFO: renamed from: d */
    public final void mo2879d() {
        m4040i(p03.f7917j);
    }

    @Override // p000.v02
    /* JADX INFO: renamed from: e */
    public final void mo2880e() {
        m4040i(p03.f7918k);
    }

    @Override // p000.v02
    /* JADX INFO: renamed from: f */
    public final void mo2881f(k03 k03Var, xx0 xx0Var, C0444m0 c0444m0, n10 n10Var) {
        this.f8670d = true;
        this.f8673g = k03Var;
        this.f8674h = xx0Var;
        this.f8671e = c0444m0;
        this.f8672f = n10Var;
        m4040i(p03.f7915h);
    }

    @Override // p000.v02
    /* JADX INFO: renamed from: g */
    public final void mo2882g() {
        this.f8670d = false;
        this.f8671e = oq0.f7770D;
        this.f8672f = oq0.f7771E;
        this.f8677k = null;
        m4040i(p03.f7916i);
    }

    @Override // p000.v02
    /* JADX INFO: renamed from: h */
    public final void mo2883h(o62 o62Var) {
        Rect rect;
        this.f8677k = new Rect(gf1.m1869Q(o62Var.f7536a), gf1.m1869Q(o62Var.f7537b), gf1.m1869Q(o62Var.f7538c), gf1.m1869Q(o62Var.f7539d));
        if (!this.f8675i.isEmpty() || (rect = this.f8677k) == null) {
            return;
        }
        this.f8667a.requestRectangleOnScreen(new Rect(rect));
    }

    /* JADX INFO: renamed from: i */
    public final void m4040i(p03 p03Var) {
        this.f8679m.m6423b(p03Var);
        if (this.f8680n == null) {
            RunnableC0446m2 runnableC0446m2 = new RunnableC0446m2(11, this);
            this.f8669c.execute(runnableC0446m2);
            this.f8680n = runnableC0446m2;
        }
    }
}

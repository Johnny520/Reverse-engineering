package p115X0;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p000A.C0001A0;
import p000A.C0012G;
import p000A.C0042V0;
import p000A.C0072l0;
import p000A.C0075n;
import p001A0.C0102b;
import p028F.RunnableC0346g;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p049I2.AbstractC0797o;
import p056K2.EnumC0880f;
import p092S0.C1257J;
import p092S0.C1259L;
import p105V.C1483e;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p128a.AbstractC1785a;
import p204n0.C2684c;

/* JADX INFO: renamed from: X0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1649x implements InterfaceC1641p {

    /* JADX INFO: renamed from: a */
    public final View f5660a;

    /* JADX INFO: renamed from: b */
    public final C0072l0 f5661b;

    /* JADX INFO: renamed from: c */
    public final ExecutorC1650y f5662c;

    /* JADX INFO: renamed from: d */
    public boolean f5663d;

    /* JADX INFO: renamed from: e */
    public InterfaceC1601c f5664e;

    /* JADX INFO: renamed from: f */
    public InterfaceC1601c f5665f;

    /* JADX INFO: renamed from: g */
    public C1646u f5666g;

    /* JADX INFO: renamed from: h */
    public C1636k f5667h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f5668i;

    /* JADX INFO: renamed from: j */
    public final Object f5669j;

    /* JADX INFO: renamed from: k */
    public Rect f5670k;

    /* JADX INFO: renamed from: l */
    public final C1628c f5671l;

    /* JADX INFO: renamed from: m */
    public final C1483e f5672m;

    /* JADX INFO: renamed from: n */
    public RunnableC0346g f5673n;

    public C1649x(View view, ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y) {
        C0072l0 c0072l0 = new C0072l0(view);
        ExecutorC1650y executorC1650y = new ExecutorC1650y(Choreographer.getInstance());
        this.f5660a = view;
        this.f5661b = c0072l0;
        this.f5662c = executorC1650y;
        this.f5664e = C1627b.f5592h;
        this.f5665f = C1627b.f5593i;
        this.f5666g = new C1646u("", C1259L.f4536b, 4);
        this.f5667h = C1636k.f5625g;
        this.f5668i = new ArrayList();
        this.f5669j = AbstractC0797o.m1395t(EnumC0880f.f2767e, new C0102b(10, this));
        this.f5671l = new C1628c(viewTreeObserverOnGlobalLayoutListenerC0772y, c0072l0);
        this.f5672m = new C1483e(new EnumC1648w[16]);
    }

    @Override // p115X0.InterfaceC1641p
    /* JADX INFO: renamed from: a */
    public final void mo1411a(C1646u c1646u, C1636k c1636k, C0075n c0075n, C0012G c0012g) {
        this.f5663d = true;
        this.f5666g = c1646u;
        this.f5667h = c1636k;
        this.f5664e = c0075n;
        this.f5665f = c0012g;
        m2945i(EnumC1648w.f5655d);
    }

    @Override // p115X0.InterfaceC1641p
    /* JADX INFO: renamed from: b */
    public final void mo1412b() {
        m2945i(EnumC1648w.f5655d);
    }

    @Override // p115X0.InterfaceC1641p
    /* JADX INFO: renamed from: c */
    public final void mo1413c(C2684c c2684c) {
        Rect rect;
        this.f5670k = new Rect(AbstractC1784a.m3200N(c2684c.f8558a), AbstractC1784a.m3200N(c2684c.f8559b), AbstractC1784a.m3200N(c2684c.f8560c), AbstractC1784a.m3200N(c2684c.f8561d));
        if (!this.f5668i.isEmpty() || (rect = this.f5670k) == null) {
            return;
        }
        this.f5660a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // p115X0.InterfaceC1641p
    /* JADX INFO: renamed from: d */
    public final void mo1414d() {
        m2945i(EnumC1648w.f5657f);
    }

    @Override // p115X0.InterfaceC1641p
    /* JADX INFO: renamed from: e */
    public final void mo1415e() {
        m2945i(EnumC1648w.f5658g);
    }

    /* JADX WARN: Type inference failed for: r14v14, types: [K2.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v22, types: [K2.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8, types: [K2.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [K2.e, java.lang.Object] */
    @Override // p115X0.InterfaceC1641p
    /* JADX INFO: renamed from: f */
    public final void mo1416f(C1646u c1646u, C1646u c1646u2) {
        boolean z5 = (C1259L.m2334b(this.f5666g.f5651b, c1646u2.f5651b) && AbstractC1665j.m2981a(this.f5666g.f5652c, c1646u2.f5652c)) ? false : true;
        this.f5666g = c1646u2;
        int size = this.f5668i.size();
        for (int i5 = 0; i5 < size; i5++) {
            InputConnectionC1642q inputConnectionC1642q = (InputConnectionC1642q) ((WeakReference) this.f5668i.get(i5)).get();
            if (inputConnectionC1642q != null) {
                inputConnectionC1642q.f5639d = c1646u2;
            }
        }
        C1628c c1628c = this.f5671l;
        synchronized (c1628c.f5599c) {
            c1628c.f5606j = null;
            c1628c.f5608l = null;
            c1628c.f5607k = null;
            c1628c.f5609m = C1627b.f5590f;
            c1628c.f5610n = null;
            c1628c.f5611o = null;
        }
        if (AbstractC1665j.m2981a(c1646u, c1646u2)) {
            if (z5) {
                C0072l0 c0072l0 = this.f5661b;
                int iM2338f = C1259L.m2338f(c1646u2.f5651b);
                int iM2337e = C1259L.m2337e(c1646u2.f5651b);
                C1259L c1259l = this.f5666g.f5652c;
                int iM2338f2 = c1259l != null ? C1259L.m2338f(c1259l.f4538a) : -1;
                C1259L c1259l2 = this.f5666g.f5652c;
                ((InputMethodManager) c0072l0.f308f.getValue()).updateSelection((View) c0072l0.f307e, iM2338f, iM2337e, iM2338f2, c1259l2 != null ? C1259L.m2337e(c1259l2.f4538a) : -1);
                return;
            }
            return;
        }
        if (c1646u != null && (!AbstractC1665j.m2981a(c1646u.f5650a.f4563e, c1646u2.f5650a.f4563e) || (C1259L.m2334b(c1646u.f5651b, c1646u2.f5651b) && !AbstractC1665j.m2981a(c1646u.f5652c, c1646u2.f5652c)))) {
            C0072l0 c0072l02 = this.f5661b;
            ((InputMethodManager) c0072l02.f308f.getValue()).restartInput((View) c0072l02.f307e);
            return;
        }
        int size2 = this.f5668i.size();
        for (int i6 = 0; i6 < size2; i6++) {
            InputConnectionC1642q inputConnectionC1642q2 = (InputConnectionC1642q) ((WeakReference) this.f5668i.get(i6)).get();
            if (inputConnectionC1642q2 != null) {
                C1646u c1646u3 = this.f5666g;
                C0072l0 c0072l03 = this.f5661b;
                if (inputConnectionC1642q2.f5643h) {
                    inputConnectionC1642q2.f5639d = c1646u3;
                    if (inputConnectionC1642q2.f5641f) {
                        ((InputMethodManager) c0072l03.f308f.getValue()).updateExtractedText((View) c0072l03.f307e, inputConnectionC1642q2.f5640e, AbstractC1785a.m3257s(c1646u3));
                    }
                    C1259L c1259l3 = c1646u3.f5652c;
                    long j5 = c1646u3.f5651b;
                    int iM2338f3 = c1259l3 != null ? C1259L.m2338f(c1259l3.f4538a) : -1;
                    C1259L c1259l4 = c1646u3.f5652c;
                    ((InputMethodManager) c0072l03.f308f.getValue()).updateSelection((View) c0072l03.f307e, C1259L.m2338f(j5), C1259L.m2337e(j5), iM2338f3, c1259l4 != null ? C1259L.m2337e(c1259l4.f4538a) : -1);
                }
            }
        }
    }

    @Override // p115X0.InterfaceC1641p
    /* JADX INFO: renamed from: g */
    public final void mo1417g() {
        this.f5663d = false;
        this.f5664e = C1627b.f5594j;
        this.f5665f = C1627b.f5595k;
        this.f5670k = null;
        m2945i(EnumC1648w.f5656e);
    }

    @Override // p115X0.InterfaceC1641p
    /* JADX INFO: renamed from: h */
    public final void mo1418h(C1646u c1646u, C0042V0 c0042v0, C1257J c1257j, C0001A0 c0001a0, C2684c c2684c, C2684c c2684c2) {
        C1628c c1628c = this.f5671l;
        synchronized (c1628c.f5599c) {
            try {
                c1628c.f5606j = c1646u;
                c1628c.f5608l = c0042v0;
                c1628c.f5607k = c1257j;
                c1628c.f5609m = c0001a0;
                c1628c.f5610n = c2684c;
                c1628c.f5611o = c2684c2;
                if (c1628c.f5601e || c1628c.f5600d) {
                    c1628c.m2928a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2945i(EnumC1648w enumC1648w) {
        this.f5672m.m2753b(enumC1648w);
        if (this.f5673n == null) {
            RunnableC0346g runnableC0346g = new RunnableC0346g(4, this);
            this.f5662c.execute(runnableC0346g);
            this.f5673n = runnableC0346g;
        }
    }
}

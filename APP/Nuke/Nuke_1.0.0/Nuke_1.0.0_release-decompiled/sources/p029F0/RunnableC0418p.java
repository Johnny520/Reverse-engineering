package p029F0;

import android.os.Build;
import android.view.View;
import java.util.List;
import p095T.C1360f0;
import p117X2.AbstractC1665j;
import p154e2.C2023b;
import p158f0.AbstractC2082n;
import p158f0.C2085q;
import p186k.C2404A;
import p186k.C2408E;
import p186k.C2409F;
import p205n1.C2688b;
import p229r1.AbstractC3045F;
import p229r1.AbstractC3087q;
import p229r1.AbstractC3092v;
import p229r1.AbstractC3094x;
import p229r1.C3046G;
import p229r1.C3070c0;
import p229r1.InterfaceC3081k;

/* JADX INFO: renamed from: F0.p */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0418p extends AbstractC3094x implements Runnable, InterfaceC3081k, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: f */
    public boolean f1257f;

    /* JADX INFO: renamed from: g */
    public int f1258g;

    /* JADX INFO: renamed from: h */
    public C3070c0 f1259h;

    /* JADX INFO: renamed from: i */
    public final C2408E f1260i;

    /* JADX INFO: renamed from: j */
    public final C1360f0 f1261j;

    /* JADX INFO: renamed from: k */
    public final C2404A f1262k;

    /* JADX INFO: renamed from: l */
    public final C2085q f1263l;

    public RunnableC0418p() {
        super(1);
        C2408E c2408e = new C2408E(9);
        InterfaceC0425s0.f1282a.getClass();
        c2408e.m4278m(C0423r0.f1270b, new C0431v0("caption bar"));
        c2408e.m4278m(C0423r0.f1271c, new C0431v0("display cutout"));
        c2408e.m4278m(C0423r0.f1272d, new C0431v0("ime"));
        c2408e.m4278m(C0423r0.f1273e, new C0431v0("mandatory system gestures"));
        c2408e.m4278m(C0423r0.f1274f, new C0431v0("navigation bars"));
        c2408e.m4278m(C0423r0.f1275g, new C0431v0("status bars"));
        c2408e.m4278m(C0423r0.f1276h, new C0431v0("system gestures"));
        c2408e.m4278m(C0423r0.f1277i, new C0431v0("tappable element"));
        c2408e.m4278m(C0423r0.f1278j, new C0431v0("waterfall"));
        this.f1260i = c2408e;
        this.f1261j = new C1360f0(0);
        this.f1262k = new C2404A(4);
        this.f1263l = new C2085q();
    }

    @Override // p229r1.InterfaceC3081k
    /* JADX INFO: renamed from: a */
    public final C3070c0 mo680a(View view, C3070c0 c3070c0) {
        if (this.f1257f) {
            this.f1259h = c3070c0;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return c3070c0;
            }
        } else if (this.f1258g == 0) {
            m685f(c3070c0);
        }
        return c3070c0;
    }

    @Override // p229r1.AbstractC3094x
    /* JADX INFO: renamed from: b */
    public final void mo681b(C3046G c3046g) {
        boolean z5 = false;
        this.f1257f = false;
        int iMo5319d = c3046g.f9741a.mo5319d();
        this.f1258g &= ~iMo5319d;
        this.f1259h = null;
        InterfaceC0425s0 interfaceC0425s0 = (InterfaceC0425s0) AbstractC0429u0.f1292a.m4318b(iMo5319d);
        if (interfaceC0425s0 != null) {
            Object objM4272g = this.f1260i.m4272g(interfaceC0425s0);
            AbstractC1665j.m2982b(objM4272g);
            C0431v0 c0431v0 = (C0431v0) objM4272g;
            c0431v0.f1296c.m2508h(0.0f);
            c0431v0.f1298e.m2508h(1.0f);
            c0431v0.f1297d.m2511g(0L);
            c0431v0.f1296c.m2508h(0.0f);
            c0431v0.f1295b.setValue(Boolean.FALSE);
            c0431v0.f1303j = -1L;
            c0431v0.f1304k = -1L;
            C1360f0 c1360f0 = this.f1261j;
            c1360f0.m2510h(c1360f0.m2509g() + 1);
            synchronized (AbstractC2082n.f6972c) {
                C2409F c2409f = AbstractC2082n.f6979j.f6933h;
                if (c2409f != null) {
                    if (c2409f.m4286h()) {
                        z5 = true;
                    }
                }
            }
            if (z5) {
                AbstractC2082n.m3825a();
            }
        }
    }

    @Override // p229r1.AbstractC3094x
    /* JADX INFO: renamed from: c */
    public final void mo682c(C3046G c3046g) {
        this.f1257f = true;
    }

    @Override // p229r1.AbstractC3094x
    /* JADX INFO: renamed from: d */
    public final C3070c0 mo683d(C3070c0 c3070c0, List list) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            C3046G c3046g = (C3046G) list.get(i5);
            InterfaceC0425s0 interfaceC0425s0 = (InterfaceC0425s0) AbstractC0429u0.f1292a.m4318b(c3046g.f9741a.mo5319d());
            if (interfaceC0425s0 != null) {
                Object objM4272g = this.f1260i.m4272g(interfaceC0425s0);
                AbstractC1665j.m2982b(objM4272g);
                C0431v0 c0431v0 = (C0431v0) objM4272g;
                if (((Boolean) c0431v0.f1295b.getValue()).booleanValue()) {
                    AbstractC3045F abstractC3045F = c3046g.f9741a;
                    c0431v0.f1296c.m2508h(abstractC3045F.mo5318c());
                    c0431v0.f1298e.m2508h(abstractC3045F.mo5316a());
                    c0431v0.f1297d.m2511g(abstractC3045F.mo5317b());
                }
            }
        }
        m685f(c3070c0);
        return c3070c0;
    }

    @Override // p229r1.AbstractC3094x
    /* JADX INFO: renamed from: e */
    public final C2023b mo684e(C3046G c3046g, C2023b c2023b) {
        C3070c0 c3070c0 = this.f1259h;
        boolean z5 = false;
        this.f1257f = false;
        this.f1259h = null;
        if (c3046g.f9741a.mo5317b() > 0 && c3070c0 != null) {
            int iMo5319d = c3046g.f9741a.mo5319d();
            this.f1258g |= iMo5319d;
            InterfaceC0425s0 interfaceC0425s0 = (InterfaceC0425s0) AbstractC0429u0.f1292a.m4318b(iMo5319d);
            if (interfaceC0425s0 != null) {
                Object objM4272g = this.f1260i.m4272g(interfaceC0425s0);
                AbstractC1665j.m2982b(objM4272g);
                C0431v0 c0431v0 = (C0431v0) objM4272g;
                C2688b c2688bMo5367i = c3070c0.f9782a.mo5367i(iMo5319d);
                long j5 = (((long) c2688bMo5367i.f8572a) << 48) | (((long) c2688bMo5367i.f8573b) << 32) | (((long) c2688bMo5367i.f8574c) << 16) | ((long) c2688bMo5367i.f8575d);
                long j6 = c0431v0.f1301h;
                if (!AbstractC0435z.m692e(j5, j6)) {
                    c0431v0.f1303j = j6;
                    c0431v0.f1304k = j5;
                    c0431v0.f1295b.setValue(Boolean.TRUE);
                    AbstractC3045F abstractC3045F = c3046g.f9741a;
                    c0431v0.f1296c.m2508h(abstractC3045F.mo5318c());
                    c0431v0.f1298e.m2508h(abstractC3045F.mo5316a());
                    c0431v0.f1297d.m2511g(abstractC3045F.mo5317b());
                    C1360f0 c1360f0 = this.f1261j;
                    c1360f0.m2510h(c1360f0.m2509g() + 1);
                    synchronized (AbstractC2082n.f6972c) {
                        C2409F c2409f = AbstractC2082n.f6979j.f6933h;
                        if (c2409f != null) {
                            if (c2409f.m4286h()) {
                                z5 = true;
                            }
                        }
                    }
                    if (z5) {
                        AbstractC2082n.m3825a();
                        return c2023b;
                    }
                }
            }
        }
        return c2023b;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x025a  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m685f(p229r1.C3070c0 r28) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p029F0.RunnableC0418p.m685f(r1.c0):void");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i5 = AbstractC3092v.f9811a;
        AbstractC3087q.m5400b(view, this);
        AbstractC3092v.m5409c(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i5 = AbstractC3092v.f9811a;
        AbstractC3087q.m5400b(view, null);
        AbstractC3092v.m5409c(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1257f) {
            this.f1258g = 0;
            this.f1257f = false;
            C3070c0 c3070c0 = this.f1259h;
            if (c3070c0 != null) {
                m685f(c3070c0);
                this.f1259h = null;
            }
        }
    }
}

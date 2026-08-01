package p041H0;

import android.view.View;
import java.util.ArrayList;
import p023E0.AbstractC0277a;
import p029F0.C0373K;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p077P0.AbstractC1126m;
import p077P0.AbstractC1132s;
import p077P0.C1125l;
import p082Q0.C1168b;
import p095T.InterfaceC1353c;
import p121Y1.C1753n;
import p169h0.AbstractC2206o;
import p170h1.C2233x;
import p175i0.C2268c;
import p186k.C2440v;

/* JADX INFO: renamed from: H0.F0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0560F0 implements InterfaceC1353c {

    /* JADX INFO: renamed from: d */
    public final Object f1679d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f1680e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public Object f1681f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0560F0(C0564I c0564i) {
        this.f1679d = c0564i;
        this.f1681f = c0564i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m779a() throws ClassNotFoundException {
        this.f1680e.clear();
        this.f1681f = this.f1679d;
        ((C0564I) this.f1679d).m808P();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: c */
    public final void mo780c(int i5, Object obj) {
        ((C0564I) this.f1681f).m793A(i5, (C0564I) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: d */
    public final void mo781d(Object obj) {
        this.f1680e.add(this.f1681f);
        this.f1681f = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: e */
    public final void mo782e() throws ClassNotFoundException {
        C1168b rectManager;
        C2268c c2268c;
        C1168b rectManager2;
        C0564I c0564i = (C0564I) this.f1681f;
        C0590e0 c0590e0 = c0564i.f1699J;
        if (!c0564i.m799G()) {
            AbstractC0277a.m482a("onReuse is only expected on attached node");
        }
        C2233x c2233x = c0564i.f1726s;
        if (c2233x != null) {
            View view = c2233x.f7232e;
            if (view.getParent() != c2233x) {
                c2233x.addView(view);
            } else {
                c2233x.f7236i.mo6a();
            }
        }
        C0373K c0373k = c0564i.f1701L;
        if (c0373k != null) {
            c0373k.m623h(false);
        }
        c0564i.f1731x = false;
        if (c0564i.f1710U) {
            c0564i.f1710U = false;
        } else {
            AbstractC2206o abstractC2206o = c0564i.f1699J.f1895e;
            for (AbstractC2206o abstractC2206o2 = abstractC2206o; abstractC2206o2 != null; abstractC2206o2 = abstractC2206o2.f7190h) {
                if (abstractC2206o2.f7199q) {
                    abstractC2206o2.mo1016E0();
                }
            }
            for (AbstractC2206o abstractC2206o3 = abstractC2206o; abstractC2206o3 != null; abstractC2206o3 = abstractC2206o3.f7190h) {
                if (abstractC2206o3.f7199q) {
                    abstractC2206o3.mo1018G0();
                }
            }
            while (abstractC2206o != null) {
                if (abstractC2206o.f7199q) {
                    abstractC2206o.mo1015A0();
                }
                abstractC2206o = abstractC2206o.f7190h;
            }
        }
        int i5 = c0564i.f1712e;
        InterfaceC0614q0 interfaceC0614q0 = c0564i.f1725r;
        if (interfaceC0614q0 != null && (rectManager2 = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) interfaceC0614q0).getRectManager()) != null) {
            rectManager2.m2212g(c0564i);
        }
        c0564i.f1712e = AbstractC1126m.f3706a.addAndGet(1);
        InterfaceC0614q0 interfaceC0614q02 = c0564i.f1725r;
        if (interfaceC0614q02 != null) {
            ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = (ViewTreeObserverOnGlobalLayoutListenerC0772y) interfaceC0614q02;
            viewTreeObserverOnGlobalLayoutListenerC0772y.getLayoutNodes().m4343g(i5);
            viewTreeObserverOnGlobalLayoutListenerC0772y.getLayoutNodes().m4344h(c0564i.f1712e, c0564i);
        }
        for (AbstractC2206o abstractC2206o4 = c0590e0.f1896f; abstractC2206o4 != null; abstractC2206o4 = abstractC2206o4.f7191i) {
            abstractC2206o4.mo1024z0();
        }
        c0590e0.m963e();
        if (c0590e0.m962d(8)) {
            c0564i.m797E();
        }
        C0564I.m791W(c0564i);
        InterfaceC0614q0 interfaceC0614q03 = c0564i.f1725r;
        if (interfaceC0614q03 != null && (c2268c = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) interfaceC0614q03).f2453O) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y2 = c2268c.f7415f;
            C1753n c1753n = c2268c.f7413d;
            C2440v c2440v = c2268c.f7420k;
            if (c2440v.m4349e(i5)) {
                c1753n.m3112F(viewTreeObserverOnGlobalLayoutListenerC0772y2, i5, false);
            }
            C1125l c1125lM841w = c0564i.m841w();
            if (c1125lM841w != null && c1125lM841w.f3702d.m4267b(AbstractC1132s.f3754q)) {
                c2440v.m4345a(c0564i.f1712e);
                c1753n.m3112F(viewTreeObserverOnGlobalLayoutListenerC0772y2, c0564i.f1712e, true);
            }
        }
        InterfaceC0614q0 interfaceC0614q04 = c0564i.f1725r;
        if (interfaceC0614q04 == null || (rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) interfaceC0614q04).getRectManager()) == null) {
            return;
        }
        rectManager.m2211e(c0564i, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo783f(int i5, Object obj) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: g */
    public final void mo784g() {
        InterfaceC0614q0 interfaceC0614q0 = ((C0564I) this.f1679d).f1725r;
        if (interfaceC0614q0 != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0772y) interfaceC0614q0).m1319y();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: h */
    public final void mo785h(int i5, int i6, int i7) {
        ((C0564I) this.f1681f).m804L(i5, i6, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: i */
    public final Object mo786i() {
        return this.f1681f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: j */
    public final void mo787j(int i5, int i6) throws ClassNotFoundException {
        ((C0564I) this.f1681f).m809Q(i5, i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: n */
    public final void mo788n() {
        this.f1681f = this.f1680e.remove(r0.size() - 1);
    }
}

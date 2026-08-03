package p339x1;

import android.view.View;
import java.util.ArrayList;
import p069f.C0966x;
import p072f2.AbstractC1052o;
import p072f2.AbstractC1058u;
import p072f2.C1050m;
import p090g2.C1293b;
import p117i0.InterfaceC1807a;
import p292u1.AbstractC4229a;
import p308v1.C4400j0;
import p340x2.C5687v;
import p351xe.C5784e;
import p356y0.AbstractC5852n;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;
import p373z0.C6063c;

/* JADX INFO: renamed from: x1.f2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5604f2 implements InterfaceC1807a {

    /* JADX INFO: renamed from: g */
    public final Object f22812g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f22813h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public Object f22814i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5604f2(C5602f0 c5602f0) {
        this.f22812g = c5602f0;
        this.f22814i = c5602f0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m10055a() {
        this.f22813h.clear();
        this.f22814i = this.f22812g;
        ((C5602f0) this.f22812g).m10018P();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: c */
    public final void mo4442c(int i9, Object obj) {
        ((C5602f0) this.f22814i).m10004A(i9, (C5602f0) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: d */
    public final void mo4443d(Object obj) {
        this.f22813h.add(this.f22814i);
        this.f22814i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: f */
    public final void mo4444f() {
        C1293b rectManager;
        C6063c c6063c;
        C1293b rectManager2;
        C5602f0 c5602f0 = (C5602f0) this.f22814i;
        C5587b1 c5587b1 = c5602f0.f22778L;
        if (!c5602f0.m10010G()) {
            AbstractC4229a.m8493a("onReuse is only expected on attached node");
        }
        C5687v c5687v = c5602f0.f22804u;
        if (c5687v != null) {
            View view = c5687v.f23086h;
            if (view.getParent() != c5687v) {
                c5687v.addView(view);
            } else {
                c5687v.f23090l.invoke();
            }
        }
        C4400j0 c4400j0 = c5602f0.f22780N;
        if (c4400j0 != null) {
            c4400j0.m8849i(false);
        }
        c5602f0.f22809z = false;
        if (c5602f0.f22789W) {
            c5602f0.f22789W = false;
        } else {
            AbstractC5852n abstractC5852n = c5602f0.f22778L.f22718e;
            for (AbstractC5852n abstractC5852n2 = abstractC5852n; abstractC5852n2 != null; abstractC5852n2 = abstractC5852n2.f23792k) {
                if (abstractC5852n2.f23801t) {
                    abstractC5852n2.mo10117f1();
                }
            }
            for (AbstractC5852n abstractC5852n3 = abstractC5852n; abstractC5852n3 != null; abstractC5852n3 = abstractC5852n3.f23792k) {
                if (abstractC5852n3.f23801t) {
                    abstractC5852n3.mo10119h1();
                }
            }
            while (abstractC5852n != null) {
                if (abstractC5852n.f23801t) {
                    abstractC5852n.mo10116b1();
                }
                abstractC5852n = abstractC5852n.f23792k;
            }
        }
        int i9 = c5602f0.f22791h;
        InterfaceC5641r1 interfaceC5641r1 = c5602f0.f22803t;
        if (interfaceC5641r1 != null && (rectManager2 = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r1).getRectManager()) != null) {
            rectManager2.m3438g(c5602f0);
        }
        c5602f0.f22791h = AbstractC1052o.f3345a.addAndGet(1);
        InterfaceC5641r1 interfaceC5641r12 = c5602f0.f22803t;
        if (interfaceC5641r12 != null) {
            ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = (ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r12;
            viewTreeObserverOnGlobalLayoutListenerC5934t.getLayoutNodes().m2378g(i9);
            viewTreeObserverOnGlobalLayoutListenerC5934t.getLayoutNodes().m2379h(c5602f0.f22791h, c5602f0);
        }
        for (AbstractC5852n abstractC5852n4 = c5587b1.f22719f; abstractC5852n4 != null; abstractC5852n4 = abstractC5852n4.f23793l) {
            abstractC5852n4.mo10115a1();
        }
        c5587b1.m9983e();
        if (c5587b1.m9982d(8)) {
            c5602f0.m10008E();
        }
        C5602f0.m10002W(c5602f0);
        InterfaceC5641r1 interfaceC5641r13 = c5602f0.f22803t;
        if (interfaceC5641r13 != null && (c6063c = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r13).f24100T) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t2 = c6063c.f24538i;
            C5784e c5784e = c6063c.f24536g;
            C0966x c0966x = c6063c.f24543n;
            if (c0966x.m2384e(i9)) {
                c5784e.m10467b(viewTreeObserverOnGlobalLayoutListenerC5934t2, i9, false);
            }
            C1050m c1050mM10051w = c5602f0.m10051w();
            if (c1050mM10051w != null && c1050mM10051w.f3341g.m2315b(AbstractC1058u.f3392q)) {
                c0966x.m2380a(c5602f0.f22791h);
                c5784e.m10467b(viewTreeObserverOnGlobalLayoutListenerC5934t2, c5602f0.f22791h, true);
            }
        }
        InterfaceC5641r1 interfaceC5641r14 = c5602f0.f22803t;
        if (interfaceC5641r14 == null || (rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r14).getRectManager()) == null) {
            return;
        }
        rectManager.m3437f(c5602f0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: h */
    public final void mo4445h(int i9, int i10, int i11) {
        ((C5602f0) this.f22814i).m10014K(i9, i10, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: i */
    public final void mo4446i(int i9, int i10) {
        ((C5602f0) this.f22814i).m10019Q(i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: k */
    public final void mo4447k() {
        this.f22814i = this.f22813h.remove(r0.size() - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: p */
    public final /* bridge */ /* synthetic */ void mo4448p(int i9, Object obj) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: q */
    public final void mo4451q() {
        InterfaceC5641r1 interfaceC5641r1 = ((C5602f0) this.f22812g).f22803t;
        if (interfaceC5641r1 != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r1).m10642A();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: r */
    public final Object mo4449r() {
        return this.f22814i;
    }
}

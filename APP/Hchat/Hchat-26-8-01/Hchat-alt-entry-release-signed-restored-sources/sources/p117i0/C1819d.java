package p117i0;

import android.view.Choreographer;
import be.C0289k;
import gg.AbstractC1416l;
import java.util.ArrayList;
import p071f1.C1021p;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p136j8.C2095f;
import p136j8.C2104o;
import p249qg.C3564g;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p357y1.C5911n0;
import p357y1.ChoreographerFrameCallbackC5915o0;
import wf.InterfaceC5557c;
import wf.InterfaceC5559e;
import wf.InterfaceC5560f;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: i0.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1819d implements InterfaceC5559e {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6041g;

    /* JADX INFO: renamed from: h */
    public final Object f6042h;

    /* JADX INFO: renamed from: i */
    public final Object f6043i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1819d(C1879s1 c1879s1) {
        this.f6041g = 0;
        this.f6042h = c1879s1;
        this.f6043i = new C0289k(4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4458d(InterfaceC1231l interfaceC1231l, InterfaceC5557c interfaceC5557c) {
        C1849k1 c1849k1;
        boolean z9;
        Object objM7512o;
        switch (this.f6041g) {
            case 0:
                C3564g c3564g = new C3564g(1, AbstractC1184v0.m3214x(interfaceC5557c));
                c3564g.m7513p();
                C0289k c0289k = (C0289k) this.f6043i;
                C1811b c1811b = new C1811b();
                c1811b.f6029a = c3564g;
                c1811b.f6030b = interfaceC1231l;
                c3564g.m7515r(new C1815c(c0289k.m1195d(c1811b, (C1879s1) this.f6042h), 0));
                return c3564g.m7512o();
            case 1:
                if (interfaceC5557c instanceof C1849k1) {
                    c1849k1 = (C1849k1) interfaceC5557c;
                    int i9 = c1849k1.f6152j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        c1849k1.f6152j = i9 - Integer.MIN_VALUE;
                    } else {
                        c1849k1 = new C1849k1(this, interfaceC5557c);
                    }
                }
                Object obj = c1849k1.f6150h;
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                int i10 = c1849k1.f6152j;
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C2095f c2095f = (C2095f) this.f6043i;
                    c1849k1.f6149g = interfaceC1231l;
                    c1849k1.f6152j = 1;
                    synchronized (c2095f.f7001b) {
                        z9 = c2095f.f7000a;
                    }
                    if (z9) {
                        objM7512o = C3967n.f12976a;
                    } else {
                        C3564g c3564g2 = new C3564g(1, AbstractC1184v0.m3214x(c1849k1));
                        c3564g2.m7513p();
                        synchronized (c2095f.f7001b) {
                            ((ArrayList) c2095f.f7002c).add(c3564g2);
                        }
                        c3564g2.m7515r(new C1872q0(c2095f, 0, c3564g2));
                        objM7512o = c3564g2.m7512o();
                        if (objM7512o != enumC5799a) {
                            objM7512o = C3967n.f12976a;
                        }
                    }
                    if (objM7512o != enumC5799a) {
                    }
                    return enumC5799a;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        AbstractC1089i.m2732I0(obj);
                        return obj;
                    }
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC1231l = c1849k1.f6149g;
                AbstractC1089i.m2732I0(obj);
                C1819d c1819d = (C1819d) this.f6042h;
                c1849k1.f6149g = null;
                c1849k1.f6152j = 2;
                Object objM4458d = c1819d.m4458d(interfaceC1231l, c1849k1);
                if (objM4458d != enumC5799a) {
                    return objM4458d;
                }
                return enumC5799a;
            default:
                C5911n0 c5911n0 = (C5911n0) this.f6043i;
                C3564g c3564g3 = new C3564g(1, AbstractC1184v0.m3214x(interfaceC5557c));
                c3564g3.m7513p();
                ChoreographerFrameCallbackC5915o0 choreographerFrameCallbackC5915o0 = new ChoreographerFrameCallbackC5915o0(c3564g3, this, interfaceC1231l);
                if (AbstractC1416l.m3825a(c5911n0.f23986i, (Choreographer) this.f6042h)) {
                    synchronized (c5911n0.f23988k) {
                        c5911n0.f23990m.add(choreographerFrameCallbackC5915o0);
                        if (!c5911n0.f23993p) {
                            c5911n0.f23993p = true;
                            c5911n0.f23986i.postFrameCallback(c5911n0.f23994q);
                        }
                        break;
                    }
                    c3564g3.m7515r(new C1021p(c5911n0, 9, choreographerFrameCallbackC5915o0));
                } else {
                    ((Choreographer) this.f6042h).postFrameCallback(choreographerFrameCallbackC5915o0);
                    c3564g3.m7515r(new C1021p(this, 10, choreographerFrameCallbackC5915o0));
                }
                return c3564g3.m7512o();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: e */
    public final InterfaceC5561g mo2059e(InterfaceC5561g interfaceC5561g) {
        switch (this.f6041g) {
        }
        return AbstractC1089i.m2786q0(this, interfaceC5561g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5559e
    public InterfaceC5560f getKey() {
        return C1823e.f6048i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: k */
    public final Object mo2061k(InterfaceC1235p interfaceC1235p, Object obj) {
        switch (this.f6041g) {
        }
        return interfaceC1235p.invoke(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: s */
    public final InterfaceC5559e mo2062s(InterfaceC5560f interfaceC5560f) {
        switch (this.f6041g) {
        }
        return AbstractC1089i.m2797w(this, interfaceC5560f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: t */
    public final InterfaceC5561g mo2063t(InterfaceC5560f interfaceC5560f) {
        switch (this.f6041g) {
        }
        return AbstractC1089i.m2777l0(this, interfaceC5560f);
    }

    public C1819d(C1819d c1819d) {
        this.f6041g = 1;
        this.f6042h = c1819d;
        this.f6043i = new C2095f();
    }

    public C1819d(Choreographer choreographer, C5911n0 c5911n0) {
        this.f6041g = 2;
        this.f6042h = choreographer;
        this.f6043i = c5911n0;
    }
}

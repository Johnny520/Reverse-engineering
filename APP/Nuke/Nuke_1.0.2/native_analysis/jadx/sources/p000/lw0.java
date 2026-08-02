package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lw0 implements InterfaceC0137dp, InterfaceC0101cp {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6342h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0469mp f6343i;

    public /* synthetic */ lw0(C0469mp c0469mp, int i) {
        this.f6342h = i;
        this.f6343i = c0469mp;
    }

    @Override // p000.InterfaceC0137dp
    /* JADX INFO: renamed from: a */
    public void mo1065a(s52 s52Var, r92 r92Var) throws j90 {
        C0469mp c0469mp = this.f6343i;
        if (c0469mp.m3155y()) {
            c0469mp.mo2510i(r92Var, kw0.f5838h);
        } else {
            r92Var.close();
        }
    }

    @Override // p000.InterfaceC0101cp
    /* JADX INFO: renamed from: b */
    public void mo879b(InterfaceC0854wo interfaceC0854wo, q92 q92Var) {
        int i = this.f6342h;
        C0469mp c0469mp = this.f6343i;
        switch (i) {
            case 1:
                if (!q92Var.f8836a.f9471w) {
                    c0469mp.mo2509h(new x92(new C0594pv(q92Var)));
                } else {
                    Object obj = q92Var.f8837b;
                    if (obj != null) {
                        c0469mp.mo2509h(obj);
                    } else {
                        k82 k82VarMo94c = interfaceC0854wo.mo94c();
                        k82VarMo94c.getClass();
                        C0067bt c0067btM967a = d72.m967a(d21.class);
                        Object objCast = p40.m3741y(c0067btM967a).cast(k82VarMo94c.f5394e.mo2318u(c0067btM967a));
                        objCast.getClass();
                        c0469mp.mo2509h(new x92(new t51("Response from " + ip0.class.getName() + '.' + ((d21) objCast).f1820b.getName() + " was null but response body type was declared as non-null")));
                    }
                }
                break;
            case 2:
                if (!q92Var.f8836a.f9471w) {
                    c0469mp.mo2509h(new x92(new C0594pv(q92Var)));
                } else {
                    c0469mp.mo2509h(q92Var.f8837b);
                }
                break;
            default:
                c0469mp.mo2509h(q92Var);
                break;
        }
    }

    @Override // p000.InterfaceC0101cp
    /* JADX INFO: renamed from: d */
    public void mo880d(InterfaceC0854wo interfaceC0854wo, Throwable th) {
        int i = this.f6342h;
        C0469mp c0469mp = this.f6343i;
        switch (i) {
            case 1:
                c0469mp.mo2509h(new x92(th));
                break;
            case 2:
                c0469mp.mo2509h(new x92(th));
                break;
            default:
                c0469mp.mo2509h(new x92(th));
                break;
        }
    }

    @Override // p000.InterfaceC0137dp
    /* JADX INFO: renamed from: j */
    public void mo1066j(s52 s52Var, IOException iOException) {
        C0469mp c0469mp = this.f6343i;
        if (c0469mp.m3155y()) {
            c0469mp.mo2509h(new x92(iOException));
        }
    }
}

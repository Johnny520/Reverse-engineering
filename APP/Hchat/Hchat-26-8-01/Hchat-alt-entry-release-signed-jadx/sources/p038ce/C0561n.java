package p038ce;

import ae.C0077h;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import ke.C2398g;
import md.AbstractC2828e;
import md.EnumC2824a;
import p000a.AbstractC0000a;
import p077f8.AbstractC1089i;
import p152k7.AbstractC2331a;
import p166l7.C2518f;
import p166l7.C2525m;
import p182m7.C2797j;
import p182m7.C2798k;
import p182m7.C2808u;
import p199nd.C2975h0;
import p214oc.InterfaceC3125b;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.C3499c;
import p247qe.C3523f;
import p247qe.C3536s;
import p247qe.InterfaceC3521d;
import p257r7.C3724n;
import p257r7.C3730t;
import p257r7.C3731u;
import p302ud.C4305a;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.InterfaceC4314j;
import p314v7.C4490d;
import p350xd.C5776c;
import p350xd.C5777d;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: ce.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0561n implements Predicate {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1751g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ae.e.accept(java.lang.Object):void, be.b.S(ud.r, p4.t):void, be.b.a0(ud.r):void, be.w.accept(java.lang.Object):void, ce.a.test(java.lang.Object):boolean, ce.l.g(ud.r):void, ee.c.g(ud.r):void, ee.c.m(ud.r, ae.h):boolean, k7.b.j0(boolean):java.util.Iterator, ke.c.c(ud.r, ud.n):boolean, ke.c.g(ud.r):void, ke.c.p(hb.r):boolean, ke.k.b(ud.r, ud.n):void, l7.f.M():void, l7.l.M():void, m7.c.d0(r7.n):void, m7.g.M():void, m7.v.X():void, qe.r.d():boolean, s7.b.<clinit>():void, s7.f.k0():void, s7.h.n0():void] */
    public /* synthetic */ C0561n(int i9) {
        this.f1751g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        C4305a c4305a;
        C4305a c4305a2;
        switch (this.f1751g) {
            case 0:
                C2975h0 c2975h0 = (C2975h0) obj;
                return (c2975h0.f9735g != 1 || (c4305a = c2975h0.f9737i) == (c4305a2 = c2975h0.f9736h) || c4305a2.f14355p.get(c4305a.f14349j)) ? false : true;
            case 1:
                return ((C2975h0) obj).f9735g == 2;
            case 2:
                return AbstractC0000a.m94v((C4305a) obj, EnumC3400k.f10974Z);
            case 3:
                return ((Integer) ((Map.Entry) obj).getValue()).intValue() > 3;
            case 4:
                C0077h c0077h = (C0077h) obj;
                return c0077h.f248l || c0077h.f244h.isEmpty();
            case 5:
                return AbstractC0000a.m94v((C4305a) obj, EnumC3400k.f10988r);
            case 6:
                int i9 = ((C4322r) obj).f14411l.m8656a0().f14385y;
                return i9 == 4 || i9 == 5;
            case 7:
                return !((List) obj).isEmpty();
            case 8:
                return !((C2525m) obj).f8159o.m8125n0(true).hasNext();
            case 9:
                return !((AbstractC2331a) obj).mo5555y();
            case 10:
                return C2398g.m5732t0((InterfaceC4314j) obj);
            case 11:
                return ((C4320p) obj).f9217g.mo6235a(EnumC2824a.f9129O);
            case 12:
                return ((AbstractC2828e) ((InterfaceC4314j) obj)).f9217g.mo6235a(EnumC2824a.f9168u);
            case 13:
                List list = ((C5776c) obj).f23508a;
                return list.size() == 1 && list.get(0) == C5777d.f23510m;
            case 14:
                return ((C4320p) obj).f14396k == EnumC3400k.f10968T;
            case 15:
                return ((C2518f) obj).isEmpty();
            case 16:
                C5776c c5776c = (C5776c) obj;
                return c5776c.f23508a.contains(C5777d.f23510m) && !AbstractC1089i.m2780n0(c5776c.f23509b);
            case 17:
                C2797j c2797j = (C2797j) obj;
                return c2797j.mo6185R().f9926k.size() == 0 && c2797j.m6197V().f9071w.f9926k.size() == 0 && ((C2798k) c2797j.f9062k).f9053m.f9926k.size() == 0 && AbstractC5999a.m10743f(c2797j.m6197V().m6164U());
            case 18:
                C2808u c2808u = (C2808u) obj;
                if (c2808u.f7658h == null) {
                    return true;
                }
                return c2808u.f9037p.f12083n == -1 && c2808u.f9036o.f12083n == -1;
            case 19:
                return !((InterfaceC3125b) ((Map.Entry) obj).getValue()).mo6635r();
            case 20:
                return ((C4320p) obj).f14396k == EnumC3400k.f10972X;
            case 21:
                AbstractC3506j type = ((InterfaceC3521d) obj).getType();
                type.getClass();
                return type instanceof C3499c;
            case 22:
                return C3523f.class.isInstance((InterfaceC3521d) obj);
            case 23:
                return !((C3536s) obj).f11503b;
            case 24:
                return ((C3536s) obj).f11503b;
            case 25:
                return !(obj instanceof C3730t);
            case 26:
                return !((C4490d) obj).mo5555y();
            case 27:
                return ((C4490d) obj).mo5555y();
            case 28:
                C3724n c3724n = (C3724n) obj;
                return c3724n.m7734N() == null || c3724n.f12083n == 0;
            default:
                C3731u c3731u = (C3731u) obj;
                if (c3731u.f12113p == null) {
                    return true;
                }
                return true ^ (c3731u.f12110m.f9926k.size() != 0);
        }
    }
}

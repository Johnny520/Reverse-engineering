package p302ud;

import ae.C0075f;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import md.C2829f;
import md.EnumC2824a;
import mh.InterfaceC2844b;
import p077f8.AbstractC1089i;
import p110hc.InterfaceC1704a;
import p128ic.C2040e;
import p233pd.EnumC3400k;
import p246qd.C3514r;
import p351xe.AbstractC5792m;

/* JADX INFO: renamed from: ud.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4306b implements Predicate {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f14361g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [bc.k.e():void, ce.l.g(ud.r):void, ee.c.g(ud.r):void, f8.i.F(ud.j):xe.b, f8.i.L(ud.j, ud.j):boolean, ud.e.h0(bc.d):void, xe.l.l(ud.r, ud.p):void] */
    public /* synthetic */ C4306b(int i9) {
        this.f14361g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f14361g) {
            case 0:
                InterfaceC1704a interfaceC1704a = (InterfaceC1704a) obj;
                if (interfaceC1704a.mo4336j() == 6) {
                    C2040e c2040e = (C2040e) interfaceC1704a;
                    if (c2040e.f6880g.f6878k == 0) {
                        InterfaceC2844b interfaceC2844b = C4309e.f14365F;
                        if (!interfaceC2844b.mo6250d()) {
                            return true;
                        }
                        interfaceC2844b.mo6270x(c2040e, "Var reference '{}' incorrect (ref pos is zero) and was removed from metadata");
                        return true;
                    }
                }
                return false;
            case 1:
                return ((C0075f) obj).f240i;
            case 2:
                return ((List) ((Map.Entry) obj).getValue()).size() > 1;
            case 3:
                return ((C4309e) obj).f14373m.m6650o();
            case 4:
                return AbstractC5792m.m10493j(((C3514r) obj).f11420j, EnumC3400k.f10972X);
            case 5:
                C3514r c3514r = (C3514r) obj;
                C2829f c2829f = c3514r.f9217g;
                EnumC2824a enumC2824a = EnumC2824a.f9166s;
                if (c2829f.mo6235a(enumC2824a)) {
                    return true;
                }
                C4320p c4320p = c3514r.f11420j;
                InterfaceC2844b interfaceC2844b2 = AbstractC5792m.f23539a;
                return c4320p != null && c4320p.f9217g.mo6235a(enumC2824a);
            case 6:
                InterfaceC4314j interfaceC4314j = (InterfaceC4314j) obj;
                if (interfaceC4314j == null) {
                    return false;
                }
                return AbstractC1089i.m2737L(interfaceC4314j, interfaceC4314j);
            default:
                return Objects.nonNull((InterfaceC4314j) obj);
        }
    }
}

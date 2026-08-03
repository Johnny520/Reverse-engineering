package ke;

import be.AbstractC0283h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import md.AbstractC2828e;
import md.C2825b;
import md.EnumC2824a;
import p000a.AbstractC0000a;
import p038ce.C0561n;
import p077f8.AbstractC1089i;
import p199nd.C2969e0;
import p233pd.EnumC3400k;
import p259r9.AbstractC3754e0;
import p302ud.C4319o;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.InterfaceC4312h;
import p302ud.InterfaceC4313i;
import p302ud.InterfaceC4314j;
import p302ud.InterfaceC4318n;
import p350xd.AbstractC5774a;
import p350xd.C5777d;
import p351xe.C5781b;
import p351xe.C5782c;

/* JADX INFO: renamed from: ke.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2402k extends AbstractC3754e0 {

    /* JADX INFO: renamed from: l */
    public C5777d f7871l;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f7873n;

    /* JADX INFO: renamed from: j */
    public final HashSet f7869j = new HashSet();

    /* JADX INFO: renamed from: k */
    public final HashSet f7870k = new HashSet();

    /* JADX INFO: renamed from: m */
    public boolean f7872m = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2402k(int i9) {
        this.f7873n = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: ud.n */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    @Override // p259r9.AbstractC3754e0, ke.InterfaceC2396e
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo2614a(C4322r c4322r, InterfaceC4318n interfaceC4318n) {
        boolean z9;
        C4320p c4320p;
        switch (this.f7873n) {
            case 0:
                if ((interfaceC4318n instanceof InterfaceC4313i) && !(interfaceC4318n instanceof C5777d)) {
                    InterfaceC4318n interfaceC4318n2 = ((AbstractC5774a) interfaceC4318n).f23506i;
                    if (!((AbstractC2828e) interfaceC4318n2).f9217g.mo6235a(EnumC2824a.f9135U)) {
                        InterfaceC4312h interfaceC4312hM2722D = AbstractC1089i.m2722D(interfaceC4318n2);
                        if (!AbstractC0000a.m0A(interfaceC4312hM2722D)) {
                            z9 = false;
                        } else if (m5741t0(interfaceC4312hM2722D)) {
                            z9 = true;
                        }
                        List<InterfaceC4314j> listMo8673i = ((InterfaceC4313i) interfaceC4318n).mo8673i();
                        ArrayList<C5782c> arrayList = new ArrayList();
                        boolean z10 = true;
                        for (InterfaceC4314j interfaceC4314j : listMo8673i) {
                            if (interfaceC4314j != null) {
                                C5781b c5781bM2726F = AbstractC1089i.m2726F(interfaceC4314j);
                                if (c5781bM2726F == null) {
                                    break;
                                } else {
                                    EnumC3400k enumC3400k = c5781bM2726F.f23521b.f14396k;
                                    if (enumC3400k == EnumC3400k.f10968T) {
                                        InterfaceC4312h interfaceC4312h = c5781bM2726F.f23520a;
                                        arrayList.add(new C5782c(interfaceC4312h, AbstractC1089i.m2802z(interfaceC4312h, interfaceC4314j)));
                                    } else {
                                        int iOrdinal = enumC3400k.ordinal();
                                        if (iOrdinal == 9 || iOrdinal == 11 || iOrdinal == 39 || iOrdinal == 40) {
                                        }
                                    }
                                }
                            }
                            z10 = false;
                        }
                        if (!arrayList.isEmpty()) {
                            for (C5782c c5782c : arrayList) {
                                m5742u0(c5782c.f23523b, c5782c.f23522a);
                            }
                            if (!z9) {
                                this.f7869j.add(interfaceC4318n2);
                                this.f7872m = true;
                            }
                            c4322r.m6231w(EnumC2824a.f9141a0);
                        }
                        if (z10 && interfaceC4312hM2722D != null) {
                            m5742u0(interfaceC4312hM2722D, interfaceC4318n2);
                            break;
                        }
                    }
                }
                break;
            default:
                List listMo8675u = interfaceC4318n.mo8675u();
                InterfaceC4314j interfaceC4314j2 = (InterfaceC4314j) AbstractC0283h.m1126F(listMo8675u);
                if (interfaceC4314j2 instanceof InterfaceC4312h) {
                    InterfaceC4312h interfaceC4312h2 = (InterfaceC4312h) interfaceC4314j2;
                    if (m5741t0(interfaceC4312h2)) {
                        if (interfaceC4312h2.mo8643g().size() > 1) {
                            c4320p = (C4320p) interfaceC4312h2.mo8643g().get(r12.size() - 2);
                        } else if (listMo8675u.size() > 1) {
                            InterfaceC4314j interfaceC4314j3 = (InterfaceC4314j) listMo8675u.get(listMo8675u.size() - 2);
                            c4320p = interfaceC4314j3 instanceof InterfaceC4312h ? (C4320p) AbstractC0283h.m1126F(((InterfaceC4312h) interfaceC4314j3).mo8643g()) : null;
                        }
                        if (c4320p != null) {
                            int iOrdinal2 = c4320p.f14396k.ordinal();
                            if (iOrdinal2 == 9 || iOrdinal2 == 11 || iOrdinal2 == 39 || iOrdinal2 == 40) {
                                m5742u0(interfaceC4312h2, interfaceC4318n);
                            }
                        }
                    }
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p259r9.AbstractC3754e0, ke.InterfaceC2396e
    /* JADX INFO: renamed from: b */
    public final void mo2615b(C4322r c4322r, InterfaceC4318n interfaceC4318n) {
        HashSet hashSet = this.f7869j;
        if (hashSet.contains(interfaceC4318n)) {
            hashSet.remove(interfaceC4318n);
            List listMo8675u = interfaceC4318n.mo8675u();
            C5777d c5777d = this.f7871l;
            C4320p c4320p = new C4320p(EnumC3400k.f10968T, 0);
            c4320p.m6231w(EnumC2824a.f9159m);
            c4320p.m6233y(new C2969e0(c5777d));
            listMo8675u.add(new C4319o(c4320p));
        }
        HashSet hashSet2 = this.f7870k;
        if (hashSet2.contains(interfaceC4318n)) {
            hashSet2.remove(interfaceC4318n);
            interfaceC4318n.mo8675u().removeIf(new C0561n(12));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t0 */
    public final boolean m5741t0(InterfaceC4312h interfaceC4312h) {
        C4320p c4320p;
        if (interfaceC4312h == null || (c4320p = (C4320p) AbstractC0283h.m1126F(interfaceC4312h.mo8643g())) == null || c4320p.f14396k != EnumC3400k.f10968T) {
            return false;
        }
        C2969e0 c2969e0 = (C2969e0) c4320p.f9217g.mo6237c(C2825b.f9184K);
        return c2969e0 != null && c2969e0.f9724g == this.f7871l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: ud.h */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public final void m5742u0(InterfaceC4312h interfaceC4312h, InterfaceC4314j interfaceC4314j) {
        List listMo8643g = interfaceC4312h.mo8643g();
        C4320p c4320p = (C4320p) AbstractC0283h.m1126F(listMo8643g);
        if (c4320p == null || c4320p.f14396k != EnumC3400k.f10968T) {
            return;
        }
        AbstractC0283h.m1141U(listMo8643g);
        if (listMo8643g.isEmpty()) {
            ((AbstractC2828e) interfaceC4312h).m6231w(EnumC2824a.f9168u);
            this.f7870k.add(interfaceC4314j);
        }
    }
}

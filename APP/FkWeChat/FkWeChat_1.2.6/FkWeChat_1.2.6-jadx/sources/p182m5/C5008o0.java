package p182m5;

import bsh.C1259t2;
import p254r5.C6492c0;
import p269s5.C7186a;
import p269s5.C7187b;
import p269s5.C7188c;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: m5.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5008o0 extends AbstractC4979a0 {

    /* JADX INFO: renamed from: r */
    public final C7186a f15253r;

    /* JADX INFO: renamed from: s */
    public final C6492c0 f15254s;

    /* JADX INFO: renamed from: t */
    public C5026x0 f15255t;

    public C5008o0(C7186a c7186a) {
        if (c7186a == null) {
            C1259t2.m5095a("prototype == null");
            throw null;
        }
        this.f15253r = c7186a;
        this.f15254s = m20237n(c7186a);
        C7187b c7187bM28387i = c7186a.m28387i();
        this.f15255t = c7187bM28387i.size() == 0 ? null : new C5026x0(c7187bM28387i);
    }

    /* JADX INFO: renamed from: n */
    public static C6492c0 m20237n(C7186a c7186a) {
        C7187b c7187bM28387i = c7186a.m28387i();
        int size = c7187bM28387i.size();
        StringBuilder sb2 = new StringBuilder(size + 1);
        sb2.append(m20238p(c7186a.m28388j()));
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(m20238p(c7187bM28387i.getType(i10)));
        }
        return new C6492c0(sb2.toString());
    }

    /* JADX INFO: renamed from: p */
    public static char m20238p(C7188c c7188c) {
        char cCharAt = c7188c.m28419p().charAt(0);
        if (cCharAt == '[') {
            return 'L';
        }
        return cCharAt;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: a */
    public void mo20090a(C5009p c5009p) {
        C5020u0 c5020u0M20259t = c5009p.m20259t();
        C5024w0 c5024w0M20260u = c5009p.m20260u();
        C5002l0 c5002l0M20261v = c5009p.m20261v();
        c5024w0M20260u.m20314v(this.f15253r.m28388j());
        c5020u0M20259t.m20303u(this.f15254s);
        C5026x0 c5026x0 = this.f15255t;
        if (c5026x0 != null) {
            this.f15255t = (C5026x0) c5002l0M20261v.m20191r(c5026x0);
        }
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: c */
    public EnumC4984c0 mo20091c() {
        return EnumC4984c0.TYPE_PROTO_ID_ITEM;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: h */
    public int mo20111h() {
        return 12;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: i */
    public void mo20112i(C5009p c5009p, InterfaceC8819a interfaceC8819a) {
        int iM20301s = c5009p.m20259t().m20301s(this.f15254s);
        int iM20312t = c5009p.m20260u().m20312t(this.f15253r.m28388j());
        int iM20199m = AbstractC5004m0.m20199m(this.f15255t);
        if (interfaceC8819a.mo33828k()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f15253r.m28388j().mo6828g());
            sb2.append(" proto(");
            C7187b c7187bM28387i = this.f15253r.m28387i();
            int size = c7187bM28387i.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 != 0) {
                    sb2.append(", ");
                }
                sb2.append(c7187bM28387i.getType(i10).mo6828g());
            }
            sb2.append(")");
            interfaceC8819a.mo33825d(0, m20100l() + ' ' + sb2.toString());
            interfaceC8819a.mo33825d(4, "  shorty_idx:      " + AbstractC8826h.m33901j(iM20301s) + " // " + this.f15254s.m25744v());
            interfaceC8819a.mo33825d(4, "  return_type_idx: " + AbstractC8826h.m33901j(iM20312t) + " // " + this.f15253r.m28388j().mo6828g());
            StringBuilder sb3 = new StringBuilder("  parameters_off:  ");
            sb3.append(AbstractC8826h.m33901j(iM20199m));
            interfaceC8819a.mo33825d(4, sb3.toString());
        }
        interfaceC8819a.writeInt(iM20301s);
        interfaceC8819a.writeInt(iM20312t);
        interfaceC8819a.writeInt(iM20199m);
    }
}

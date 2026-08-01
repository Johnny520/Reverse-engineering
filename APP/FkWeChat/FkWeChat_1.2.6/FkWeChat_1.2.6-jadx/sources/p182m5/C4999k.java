package p182m5;

import bsh.C1259t2;
import p225p5.C5955c;
import p225p5.C5956d;
import p239q5.AbstractC6247a;
import p254r5.AbstractC6487a;
import p254r5.C6492c0;
import p254r5.C6493d;
import p254r5.C6496e0;
import p254r5.C6508m;
import p254r5.C6520y;
import p269s5.C7187b;
import p269s5.InterfaceC7190e;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: m5.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4999k extends AbstractC4979a0 {

    /* JADX INFO: renamed from: r */
    public final C6496e0 f15196r;

    /* JADX INFO: renamed from: s */
    public final int f15197s;

    /* JADX INFO: renamed from: t */
    public final C6496e0 f15198t;

    /* JADX INFO: renamed from: u */
    public C5026x0 f15199u;

    /* JADX INFO: renamed from: v */
    public final C6492c0 f15200v;

    /* JADX INFO: renamed from: w */
    public final C4997j f15201w;

    /* JADX INFO: renamed from: x */
    public C5011q f15202x;

    /* JADX INFO: renamed from: y */
    public C4987e f15203y;

    public C4999k(C6496e0 c6496e0, int i10, C6496e0 c6496e02, InterfaceC7190e interfaceC7190e, C6492c0 c6492c0) {
        if (c6496e0 == null) {
            C1259t2.m5095a("thisClass == null");
            throw null;
        }
        if (interfaceC7190e == null) {
            C1259t2.m5095a("interfaces == null");
            throw null;
        }
        this.f15196r = c6496e0;
        this.f15197s = i10;
        this.f15198t = c6496e02;
        this.f15199u = interfaceC7190e.size() == 0 ? null : new C5026x0(interfaceC7190e);
        this.f15200v = c6492c0;
        this.f15201w = new C4997j(c6496e0);
        this.f15202x = null;
        this.f15203y = new C4987e();
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: a */
    public void mo20090a(C5009p c5009p) {
        C5024w0 c5024w0M20260u = c5009p.m20260u();
        C5002l0 c5002l0M20244e = c5009p.m20244e();
        C5002l0 c5002l0M20262w = c5009p.m20262w();
        C5002l0 c5002l0M20261v = c5009p.m20261v();
        C5020u0 c5020u0M20259t = c5009p.m20259t();
        c5024w0M20260u.m20313u(this.f15196r);
        if (!this.f15201w.m20161E()) {
            c5009p.m20246g().m20190q(this.f15201w);
            C6493d c6493dM20160D = this.f15201w.m20160D();
            if (c6493dM20160D != null) {
                this.f15202x = (C5011q) c5002l0M20244e.m20191r(new C5011q(c6493dM20160D));
            }
        }
        C6496e0 c6496e0 = this.f15198t;
        if (c6496e0 != null) {
            c5024w0M20260u.m20313u(c6496e0);
        }
        C5026x0 c5026x0 = this.f15199u;
        if (c5026x0 != null) {
            this.f15199u = (C5026x0) c5002l0M20261v.m20191r(c5026x0);
        }
        C6492c0 c6492c0 = this.f15200v;
        if (c6492c0 != null) {
            c5020u0M20259t.m20303u(c6492c0);
        }
        if (this.f15203y.m20131z()) {
            return;
        }
        boolean zM20126A = this.f15203y.m20126A();
        C4987e c4987e = this.f15203y;
        if (zM20126A) {
            this.f15203y = (C4987e) c5002l0M20262w.m20191r(c4987e);
        } else {
            c5002l0M20262w.m20190q(c4987e);
        }
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: c */
    public EnumC4984c0 mo20091c() {
        return EnumC4984c0.TYPE_CLASS_DEF_ITEM;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: h */
    public int mo20111h() {
        return 32;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: i */
    public void mo20112i(C5009p c5009p, InterfaceC8819a interfaceC8819a) {
        boolean zMo33828k = interfaceC8819a.mo33828k();
        C5024w0 c5024w0M20260u = c5009p.m20260u();
        int iM20311s = c5024w0M20260u.m20311s(this.f15196r);
        C6496e0 c6496e0 = this.f15198t;
        int iM20311s2 = c6496e0 == null ? -1 : c5024w0M20260u.m20311s(c6496e0);
        int iM20199m = AbstractC5004m0.m20199m(this.f15199u);
        int iM20201l = this.f15203y.m20131z() ? 0 : this.f15203y.m20201l();
        int iM20301s = this.f15200v != null ? c5009p.m20259t().m20301s(this.f15200v) : -1;
        int iM20201l2 = this.f15201w.m20161E() ? 0 : this.f15201w.m20201l();
        int iM20199m2 = AbstractC5004m0.m20199m(this.f15202x);
        if (zMo33828k) {
            interfaceC8819a.mo33825d(0, m20100l() + ' ' + this.f15196r.mo6828g());
            StringBuilder sb2 = new StringBuilder("  class_idx:           ");
            sb2.append(AbstractC8826h.m33901j(iM20311s));
            interfaceC8819a.mo33825d(4, sb2.toString());
            interfaceC8819a.mo33825d(4, "  access_flags:        " + AbstractC6247a.m24647a(this.f15197s));
            StringBuilder sb3 = new StringBuilder("  superclass_idx:      ");
            sb3.append(AbstractC8826h.m33901j(iM20311s2));
            sb3.append(" // ");
            C6496e0 c6496e02 = this.f15198t;
            sb3.append(c6496e02 == null ? "<none>" : c6496e02.mo6828g());
            interfaceC8819a.mo33825d(4, sb3.toString());
            interfaceC8819a.mo33825d(4, "  interfaces_off:      " + AbstractC8826h.m33901j(iM20199m));
            if (iM20199m != 0) {
                InterfaceC7190e interfaceC7190eM20316w = this.f15199u.m20316w();
                int size = interfaceC7190eM20316w.size();
                for (int i10 = 0; i10 < size; i10++) {
                    interfaceC8819a.mo33825d(0, "    " + interfaceC7190eM20316w.getType(i10).mo6828g());
                }
            }
            StringBuilder sb4 = new StringBuilder("  source_file_idx:     ");
            sb4.append(AbstractC8826h.m33901j(iM20301s));
            sb4.append(" // ");
            C6492c0 c6492c0 = this.f15200v;
            sb4.append(c6492c0 != null ? c6492c0.mo6828g() : "<none>");
            interfaceC8819a.mo33825d(4, sb4.toString());
            interfaceC8819a.mo33825d(4, "  annotations_off:     " + AbstractC8826h.m33901j(iM20201l));
            interfaceC8819a.mo33825d(4, "  class_data_off:      " + AbstractC8826h.m33901j(iM20201l2));
            interfaceC8819a.mo33825d(4, "  static_values_off:   " + AbstractC8826h.m33901j(iM20199m2));
        }
        interfaceC8819a.writeInt(iM20311s);
        interfaceC8819a.writeInt(this.f15197s);
        interfaceC8819a.writeInt(iM20311s2);
        interfaceC8819a.writeInt(iM20199m);
        interfaceC8819a.writeInt(iM20301s);
        interfaceC8819a.writeInt(iM20201l);
        interfaceC8819a.writeInt(iM20201l2);
        interfaceC8819a.writeInt(iM20199m2);
    }

    /* JADX INFO: renamed from: n */
    public void m20168n(C5017t c5017t) {
        this.f15201w.m20163w(c5017t);
    }

    /* JADX INFO: renamed from: p */
    public void m20169p(C6508m c6508m, C5955c c5955c, C5009p c5009p) {
        this.f15203y.m20128w(c6508m, c5955c, c5009p);
    }

    /* JADX INFO: renamed from: r */
    public void m20170r(C5013r c5013r) {
        this.f15201w.m20164x(c5013r);
    }

    /* JADX INFO: renamed from: s */
    public void m20171s(C6520y c6520y, C5955c c5955c, C5009p c5009p) {
        this.f15203y.m20129x(c6520y, c5955c, c5009p);
    }

    /* JADX INFO: renamed from: t */
    public void m20172t(C6520y c6520y, C5956d c5956d, C5009p c5009p) {
        this.f15203y.m20130y(c6520y, c5956d, c5009p);
    }

    /* JADX INFO: renamed from: u */
    public void m20173u(C5013r c5013r, AbstractC6487a abstractC6487a) {
        this.f15201w.m20165y(c5013r, abstractC6487a);
    }

    /* JADX INFO: renamed from: v */
    public void m20174v(C5017t c5017t) {
        this.f15201w.m20166z(c5017t);
    }

    /* JADX INFO: renamed from: w */
    public InterfaceC7190e m20175w() {
        C5026x0 c5026x0 = this.f15199u;
        return c5026x0 == null ? C7187b.f23814s : c5026x0.m20316w();
    }

    /* JADX INFO: renamed from: x */
    public C6496e0 m20176x() {
        return this.f15198t;
    }

    /* JADX INFO: renamed from: y */
    public C6496e0 m20177y() {
        return this.f15196r;
    }

    /* JADX INFO: renamed from: z */
    public void m20178z(C5955c c5955c, C5009p c5009p) {
        this.f15203y.m20127C(c5955c, c5009p);
    }
}

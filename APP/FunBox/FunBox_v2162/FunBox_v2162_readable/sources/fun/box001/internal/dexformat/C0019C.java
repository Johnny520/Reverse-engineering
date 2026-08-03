package fun.box001.internal.dexformat;

import fun.box001.internal.dexformat.writer.AbstractC0156g;
import fun.box001.internal.dexformat.writer.C0150a;
import fun.box001.internal.dexformat.writer.C0158i;
import fun.box001.internal.dexformat.writer.C0159j;
import fun.box001.internal.dexformat.writer.C0162m;
import fun.box001.internal.dexformat.writer.C0164o;
import fun.box001.internal.dexformat.writer.C0166q;
import fun.box001.internal.dexformat.writer.C0168s;
import fun.box001.internal.dexformat.writer.C0169t;
import fun.box001.internal.dexformat.writer.C0170u;
import fun.box001.internal.dexformat.writer.InterfaceC0155f;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.C0180j;

/* JADX INFO: renamed from: e.C */
/* JADX INFO: loaded from: classes.dex */
class C0019C implements InterfaceC0155f {

    /* JADX INFO: renamed from: a */
    private final C0046w f69a;

    /* JADX INFO: renamed from: b */
    private C0150a f70b;

    /* JADX INFO: renamed from: c */
    private C0029f f71c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C0020D f72d;

    public C0019C(C0020D c0020d, C0046w c0046w) {
        this.f72d = c0020d;
        this.f69a = c0046w;
    }

    /* JADX INFO: renamed from: f */
    private C0162m m72f() {
        int iM352e = this.f70b.m352e();
        if (iM352e < 0) {
            return null;
        }
        AbstractC0156g abstractC0156gO = this.f72d.f73a.m341a().m359K(iM352e).m349b().m512o(0);
        if (abstractC0156gO.m366h().m414d() != 56) {
            return null;
        }
        return abstractC0156gO.m368j();
    }

    @Override // fun.box001.internal.dexformat.writer.InterfaceC0155f
    /* JADX INFO: renamed from: a */
    public void mo18a(C0170u c0170u) {
        C0168s c0168sM367i = c0170u.m367i();
        C0035l c0035lM70a = AbstractC0017A.m70a(c0170u);
        if (c0170u.m366h().m412b() != 6) {
            throw new RuntimeException("shouldn't happen");
        }
        C0162m c0162mM72f = m72f();
        if (c0035lM70a.m157g() == (c0162mM72f != null)) {
            m73e(this.f71c);
            m73e(new C0021E(c0035lM70a, c0168sM367i, C0020D.m82h(c0170u, c0162mM72f)));
        } else {
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch" + c0170u);
        }
    }

    @Override // fun.box001.internal.dexformat.writer.InterfaceC0155f
    /* JADX INFO: renamed from: b */
    public void mo71b(C0158i c0158i) {
        C0168s c0168sM367i = c0158i.m367i();
        C0035l c0035lM70a = AbstractC0017A.m70a(c0158i);
        C0166q c0166qM366h = c0158i.m366h();
        int iM414d = c0166qM366h.m414d();
        if (c0166qM366h.m412b() != 1) {
            throw new RuntimeException("shouldn't happen");
        }
        if (iM414d != 3) {
            m73e(new C0030g(c0035lM70a, c0168sM367i, C0020D.m80f(c0158i), c0158i.m362l()));
            return;
        }
        C0020D c0020d = this.f72d;
        if (c0020d.f81i) {
            return;
        }
        C0162m c0162mM368j = c0158i.m368j();
        m73e(new C0021E(c0035lM70a, c0168sM367i, C0164o.m397I(c0162mM368j, C0162m.m377m((c0020d.f78f - c0020d.f80h) + ((C0180j) c0158i.m362l()).mo438h(), c0162mM368j.mo379c()))));
    }

    @Override // fun.box001.internal.dexformat.writer.InterfaceC0155f
    /* JADX INFO: renamed from: c */
    public void mo19c(C0159j c0159j) {
        AbstractC0033j c0021e;
        C0166q c0166qM366h = c0159j.m366h();
        if (c0166qM366h.m414d() == 54 || c0166qM366h.m414d() == 56) {
            return;
        }
        C0168s c0168sM367i = c0159j.m367i();
        C0035l c0035lM70a = AbstractC0017A.m70a(c0159j);
        int iM412b = c0166qM366h.m412b();
        if (iM412b == 1 || iM412b == 2) {
            c0021e = new C0021E(c0035lM70a, c0168sM367i, C0020D.m80f(c0159j));
        } else {
            if (iM412b == 3) {
                return;
            }
            if (iM412b != 4) {
                if (iM412b != 6) {
                    throw new RuntimeException("shouldn't happen");
                }
                c0021e = new C0021E(c0035lM70a, c0168sM367i, C0020D.m80f(c0159j));
            } else {
                c0021e = new C0022F(c0035lM70a, c0168sM367i, C0020D.m80f(c0159j), this.f72d.f75c.m98e(this.f70b.m354g().m526l(1)));
            }
        }
        m73e(c0021e);
    }

    @Override // fun.box001.internal.dexformat.writer.InterfaceC0155f
    /* JADX INFO: renamed from: d */
    public void mo20d(C0169t c0169t) {
        AbstractC0033j abstractC0033jM196b;
        int iM155e;
        C0168s c0168sM367i = c0169t.m367i();
        C0035l c0035lM70a = AbstractC0017A.m70a(c0169t);
        C0166q c0166qM366h = c0169t.m366h();
        AbstractC0171a abstractC0171aM362l = c0169t.m362l();
        if (c0166qM366h.m412b() != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + c0166qM366h.m412b());
        }
        m73e(this.f71c);
        if (c0166qM366h.m415e()) {
            m73e(new C0030g(c0035lM70a, c0168sM367i, c0169t.m369k(), abstractC0171aM362l));
            return;
        }
        C0162m c0162mM72f = m72f();
        C0164o c0164oM82h = C0020D.m82h(c0169t, c0162mM72f);
        if ((c0035lM70a.m157g() || c0166qM366h.m414d() == 43) != (c0162mM72f != null)) {
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch " + c0169t);
        }
        AbstractC0033j c0030g = (c0166qM366h.m414d() != 41 || c0035lM70a.m155e() == 35) ? new C0030g(c0035lM70a, c0168sM367i, c0164oM82h, abstractC0171aM362l) : new C0021E(c0035lM70a, c0168sM367i, c0164oM82h);
        C0046w c0046w = this.f69a;
        int iM199e = c0046w.m199e() - 1;
        while (true) {
            if (iM199e < 0) {
                abstractC0033jM196b = null;
                break;
            }
            abstractC0033jM196b = c0046w.m196b(iM199e);
            if (abstractC0033jM196b.m138k().m155e() != -1) {
                break;
            } else {
                iM199e--;
            }
        }
        if (c0035lM70a.m155e() == 32 && abstractC0033jM196b != null && (((iM155e = abstractC0033jM196b.m138k().m155e()) == 7 || iM155e == 8 || iM155e == 9) && c0030g.m140m().m504B() > 0 && abstractC0033jM196b.m140m().m504B() > 1 && c0030g.m140m().m513p(0).m384i() == abstractC0033jM196b.m140m().m513p(1).m384i())) {
            m73e(new C0021E(AbstractC0036m.f191c, c0168sM367i, C0164o.f512c));
        }
        m73e(c0030g);
    }

    /* JADX INFO: renamed from: e */
    protected final void m73e(AbstractC0033j abstractC0033j) {
        this.f69a.m195a(abstractC0033j);
    }

    /* JADX INFO: renamed from: g */
    public final void m74g(C0150a c0150a, C0029f c0029f) {
        this.f70b = c0150a;
        this.f71c = c0029f;
    }
}

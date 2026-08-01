package p280t5;

import bsh.C1193i2;
import p239q5.AbstractC6257h;
import p239q5.C6267r;
import p239q5.C6268s;
import p239q5.C6270u;
import p280t5.AbstractC8131v;

/* JADX INFO: renamed from: t5.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8121l extends AbstractC8131v implements Cloneable {

    /* JADX INFO: renamed from: s */
    public AbstractC6257h f27131s;

    public C8121l(AbstractC6257h abstractC6257h, C8128s c8128s) {
        super(abstractC6257h.m24697n(), c8128s);
        this.f27131s = abstractC6257h;
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: A */
    public AbstractC6257h mo31407A() {
        return this.f27131s.mo24662t(m31516n(), this.f27131s.m24698o());
    }

    /* JADX INFO: renamed from: B */
    public final void m31408B(int i10, C6267r c6267r) {
        C6268s c6268sM24698o = this.f27131s.m24698o();
        int size = c6268sM24698o.size();
        C6268s c6268s = new C6268s(size);
        int i11 = 0;
        while (i11 < size) {
            c6268s.m24772L(i11, i11 == i10 ? c6267r : c6268sM24698o.m24769G(i11));
            i11++;
        }
        c6268s.mo6829t();
        C6267r c6267rM24769G = c6268sM24698o.m24769G(i10);
        if (c6267rM24769G.m24754t() != c6267r.m24754t()) {
            m31515f().m31494s().m31533H(this, c6267rM24769G, c6267r);
        }
        this.f27131s = this.f27131s.mo24662t(m31516n(), c6268s);
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C8121l clone() {
        return (C8121l) super.clone();
    }

    /* JADX INFO: renamed from: D */
    public final void m31410D(C6268s c6268s) {
        if (this.f27131s.m24698o().size() == c6268s.size()) {
            this.f27131s = this.f27131s.mo24662t(m31516n(), c6268s);
        } else {
            C1193i2.m4438a("Sources counts don't match");
        }
    }

    /* JADX INFO: renamed from: E */
    public void m31411E() {
        C6268s c6268sM24698o = this.f27131s.m24698o();
        this.f27131s = this.f27131s.mo24701u();
        m31515f().m31494s().m31534I(this, c6268sM24698o);
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: a */
    public void mo31412a(AbstractC8131v.a aVar) {
        if (mo31421s()) {
            aVar.mo31348c(this);
        } else {
            aVar.mo31347b(this);
        }
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: b */
    public boolean mo31413b() {
        return this.f27131s.m24693b();
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return mo31407A().mo6828g();
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: h */
    public C6267r mo31415h() {
        C6267r c6267rM24769G = this.f27131s.m24695j().m24798d() == 54 ? this.f27131s.m24698o().m24769G(0) : m31516n();
        if (c6267rM24769G == null || c6267rM24769G.m24752p() == null) {
            return null;
        }
        return c6267rM24769G;
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: j */
    public C6270u mo31416j() {
        return this.f27131s.m24695j();
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: k */
    public AbstractC6257h mo31417k() {
        return this.f27131s;
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: o */
    public C6268s mo31418o() {
        return this.f27131s.m24698o();
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: p */
    public boolean mo31419p() {
        C6270u c6270uMo31416j = mo31416j();
        if (c6270uMo31416j.m24796b() != 1) {
            return true;
        }
        boolean z10 = AbstractC8122m.m31425b() && mo31415h() != null;
        int iM24798d = c6270uMo31416j.m24798d();
        if (iM24798d == 2 || iM24798d == 5 || iM24798d == 55) {
            return z10;
        }
        return true;
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: q */
    public boolean mo31420q() {
        return this.f27131s.m24695j().m24798d() == 4;
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: s */
    public boolean mo31421s() {
        return this.f27131s.m24695j().m24798d() == 2;
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: t */
    public boolean mo31422t() {
        return mo31421s();
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: x */
    public final void mo31423x(AbstractC8125p abstractC8125p) {
        C6268s c6268sM24698o = this.f27131s.m24698o();
        C6268s c6268sM31444c = abstractC8125p.m31444c(c6268sM24698o);
        if (c6268sM31444c != c6268sM24698o) {
            this.f27131s = this.f27131s.mo24662t(m31516n(), c6268sM31444c);
            m31515f().m31494s().m31534I(this, c6268sM24698o);
        }
    }
}

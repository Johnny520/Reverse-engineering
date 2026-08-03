package fun.box001.internal.dexformat;

import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.C0162m;
import fun.box001.internal.dexformat.writer.C0164o;
import fun.box001.internal.dexformat.writer.C0168s;

/* JADX INFO: renamed from: e.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0038o extends AbstractC0033j {

    /* JADX INFO: renamed from: e */
    private C0021E[] f263e;

    public C0038o(C0168s c0168s, C0164o c0164o) {
        super(AbstractC0036m.f188b, c0168s, c0164o);
        if (c0164o.m504B() == 0) {
            throw new IllegalArgumentException("registers.size() == 0");
        }
        this.f263e = null;
    }

    /* JADX INFO: renamed from: y */
    private void m160y() {
        if (this.f263e != null) {
            return;
        }
        C0164o c0164oM140m = m140m();
        int iM504B = c0164oM140m.m504B();
        this.f263e = new C0021E[iM504B];
        int iM382g = 0;
        for (int i2 = 0; i2 < iM504B; i2++) {
            C0162m c0162mP = c0164oM140m.m513p(i2);
            this.f263e[i2] = AbstractC0033j.m131r(C0168s.f681a, C0162m.m377m(iM382g, c0162mP.mo379c()), c0162mP);
            iM382g += c0162mP.m382g();
        }
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: a */
    protected final String mo84a() {
        return null;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: b */
    public final int mo91b() {
        m160y();
        int iMo91b = 0;
        for (C0021E c0021e : this.f263e) {
            iMo91b += c0021e.mo91b();
        }
        return iMo91b;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: q */
    protected final String mo112q() {
        C0164o c0164oM140m = m140m();
        int iM504B = c0164oM140m.m504B();
        StringBuilder sb = new StringBuilder(100);
        int iM382g = 0;
        for (int i2 = 0; i2 < iM504B; i2++) {
            C0162m c0162mP = c0164oM140m.m513p(i2);
            C0021E c0021eM131r = AbstractC0033j.m131r(C0168s.f681a, C0162m.m377m(iM382g, c0162mP.mo379c()), c0162mP);
            if (i2 != 0) {
                sb.append('\n');
            }
            sb.append(c0021eM131r.mo112q());
            iM382g += c0162mP.m382g();
        }
        return sb.toString();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: u */
    public final AbstractC0033j mo85u(C0035l c0035l) {
        throw new RuntimeException("unsupported");
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: v */
    public final AbstractC0033j mo92v(int i2) {
        return mo86w(m140m().m402N(i2));
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: w */
    public final AbstractC0033j mo86w(C0164o c0164o) {
        return new C0038o(m139l(), c0164o);
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: x */
    public final void mo93x(C0202d c0202d) {
        m160y();
        for (C0021E c0021e : this.f263e) {
            c0021e.mo93x(c0202d);
        }
    }
}

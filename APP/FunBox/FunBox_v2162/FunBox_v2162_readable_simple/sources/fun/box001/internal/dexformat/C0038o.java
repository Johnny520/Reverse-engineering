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

    public C0038o(C0168s r2, C0164o r3) {
        super(AbstractC0036m.f188b, r2, r3);
        if (r3.m504B() == 0) goto L7;
        this.f263e = null;
        return;
    L7:
        throw new IllegalArgumentException("registers.size() == 0");
    }

    /* JADX INFO: renamed from: y */
    private void m160y() {
        if (this.f263e == null) goto L5;
        return;
    L5:
        C0164o r0 = m140m();
        int r1 = r0.m504B();
        this.f263e = new C0021E[r1];
        int r2 = 0;
        int r3 = 0;
    L6:
        if (r2 >= r1) goto L8;
        C0162m r4 = r0.m513p(r2);
        this.f263e[r2] = AbstractC0033j.m131r(C0168s.f681a, C0162m.m377m(r3, r4.mo379c()), r4);
        r3 = r3 + r4.m382g();
        r2 = r2 + 1;
        goto L6
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
        C0021E[] r0 = this.f263e;
        int r1 = r0.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r3 = r3 + r0[r2].mo91b();
        r2 = r2 + 1;
        goto L3
    L5:
        return r3;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: q */
    protected final String mo112q() {
        C0164o r0 = m140m();
        int r1 = r0.m504B();
        StringBuilder r2 = new StringBuilder(100);
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r3 >= r1) goto L9;
        C0162m r5 = r0.m513p(r3);
        C0021E r6 = AbstractC0033j.m131r(C0168s.f681a, C0162m.m377m(r4, r5.mo379c()), r5);
        if (r3 == 0) goto L7;
        r2.append('\n');
    L7:
        r2.append(r6.mo112q());
        r4 = r4 + r5.m382g();
        r3 = r3 + 1;
        goto L3
    L9:
        return r2.toString();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: u */
    public final AbstractC0033j mo85u(C0035l r2) {
        throw new RuntimeException("unsupported");
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: v */
    public final AbstractC0033j mo92v(int r2) {
        return mo86w(m140m().m402N(r2));
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: w */
    public final AbstractC0033j mo86w(C0164o r3) {
        return new C0038o(m139l(), r3);
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: x */
    public final void mo93x(C0202d r5) {
        m160y();
        C0021E[] r0 = this.f263e;
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r0[r2].mo93x(r5);
        r2 = r2 + 1;
        goto L3
    }
}

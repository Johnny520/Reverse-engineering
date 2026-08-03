package fun.box001.internal.dexformat;

import fun.box001.internal.dexformat.output.C0202d;

/* JADX INFO: renamed from: e.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0037n extends AbstractC0033j {
    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: b */
    public final int mo91b() {
        return m138k().m152b().mo176d();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: q */
    protected final String mo112q() {
        AbstractC0039p r0 = m138k().m152b();
        r0.getClass();
        String r1 = m138k().m153c();
        String r2 = r0.mo178g(this);
        String r02 = r0.mo179h(this);
        StringBuilder r3 = new StringBuilder(100);
        r3.append(r1);
        if (r2.length() == 0) goto L6;
        r3.append(' ');
        r3.append(r2);
    L6:
        if (r02.length() == 0) goto L9;
        r3.append(" // ");
        r3.append(r02);
    L9:
        return r3.toString();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: v */
    public final AbstractC0033j mo92v(int r2) {
        return mo86w(m140m().m402N(r2));
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: x */
    public final void mo93x(C0202d r2) {
        m138k().m152b().mo181u(r2, this);
    }
}

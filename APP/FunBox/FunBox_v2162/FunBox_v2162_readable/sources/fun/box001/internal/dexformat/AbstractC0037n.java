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
        AbstractC0039p abstractC0039pM152b = m138k().m152b();
        abstractC0039pM152b.getClass();
        String strM153c = m138k().m153c();
        String strMo178g = abstractC0039pM152b.mo178g(this);
        String strMo179h = abstractC0039pM152b.mo179h(this);
        StringBuilder sb = new StringBuilder(100);
        sb.append(strM153c);
        if (strMo178g.length() != 0) {
            sb.append(' ');
            sb.append(strMo178g);
        }
        if (strMo179h.length() != 0) {
            sb.append(" // ");
            sb.append(strMo179h);
        }
        return sb.toString();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: v */
    public final AbstractC0033j mo92v(int i2) {
        return mo86w(m140m().m402N(i2));
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: x */
    public final void mo93x(C0202d c0202d) {
        m138k().m152b().mo181u(c0202d, this);
    }
}

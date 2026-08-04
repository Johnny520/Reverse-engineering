package yyds;

/* JADX INFO: renamed from: yyds.ᛱᛸᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0191 extends AbstractC0986 implements InterfaceC0274, InterfaceC0990 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final InterfaceC2213 f1119;

    public AbstractC0191(InterfaceC2213 interfaceC2213, boolean z) {
        super(z);
        m2166((InterfaceC2798) interfaceC2213.mo423(C1586.f8041));
        this.f1119 = interfaceC2213.mo422(this);
    }

    @Override // yyds.InterfaceC0274
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void mo812(Object obj) {
        Throwable thM4249 = C2248.m4249(obj);
        if (thM4249 != null) {
            obj = new C0417(thM4249, false);
        }
        Object objM2161 = m2161(obj);
        if (objM2161 == AbstractC0395.f2035) {
            return;
        }
        mo2147(objM2161);
    }

    @Override // yyds.InterfaceC0274
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final InterfaceC2213 mo733() {
        return this.f1119;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛶᛵᛸᛲ, reason: contains not printable characters */
    public final void m813(int i, AbstractC0191 abstractC0191, InterfaceC0477 interfaceC0477) {
        int iM4012 = AbstractC2104.m4012(i);
        C2746 c2746 = C2746.f13459;
        if (iM4012 == 0) {
            try {
                AbstractC0427.m1189(c2746, AbstractC1367.m2783(((AbstractC0332) interfaceC0477).mo630(abstractC0191, this)));
                return;
            } finally {
                mo812(new C2658(th));
            }
        }
        if (iM4012 != 1) {
            if (iM4012 == 2) {
                AbstractC1367.m2783(((AbstractC0332) interfaceC0477).mo630(abstractC0191, this)).mo812(c2746);
                return;
            }
            if (iM4012 != 3) {
                C0188.m801();
                return;
            }
            try {
                InterfaceC2213 interfaceC2213 = this.f1119;
                Object objM1832 = AbstractC0797.m1832(interfaceC2213, null);
                try {
                    AbstractC0395.m1136(interfaceC0477);
                    Object objMo511 = interfaceC0477.mo511(abstractC0191, this);
                    if (objMo511 != EnumC1765.f8858) {
                        mo812(objMo511);
                    }
                } finally {
                    AbstractC0797.m1826(interfaceC2213, objM1832);
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // yyds.AbstractC0986
    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    public final void mo814(Object obj) {
        if (obj instanceof C0417) {
            AbstractC2112.f10448.getIntVolatile((C0417) obj, C0417.f2151);
        }
    }

    @Override // yyds.AbstractC0986
    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public final void mo815(C1738 c1738) {
        AbstractC2071.m3956(this.f1119, c1738);
    }

    @Override // yyds.AbstractC0986
    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final String mo816() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // yyds.InterfaceC0990
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final InterfaceC2213 mo119() {
        return this.f1119;
    }
}

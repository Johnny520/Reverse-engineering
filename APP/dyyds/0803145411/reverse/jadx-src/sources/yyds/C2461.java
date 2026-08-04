package yyds;

/* JADX INFO: renamed from: yyds.ᲇᛶᛳᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2461 extends AbstractC2703 {

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final InterfaceC0732 f12160 = AbstractC1090.m2298(C2461.class);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final AbstractC2019 f12161;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final EnumC1452 f12162;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final AbstractC2019 f12163;

    public C2461(AbstractC2019 abstractC2019, EnumC1452 enumC1452, AbstractC2019 abstractC20192) {
        this.f12161 = abstractC2019;
        this.f12162 = enumC1452;
        this.f12163 = abstractC20192;
        f12160.mo1678(toString());
    }

    public final String toString() {
        EnumC1452 enumC1452 = this.f12162;
        EnumC1452 enumC14522 = EnumC1452.EXISTS;
        AbstractC2019 abstractC2019 = this.f12161;
        if (enumC1452 == enumC14522) {
            return abstractC2019.toString();
        }
        return abstractC2019.toString() + " " + enumC1452.f6935 + " " + this.f12163.toString();
    }

    @Override // yyds.InterfaceC0845
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final boolean mo1922(C0864 c0864) {
        AbstractC2019 abstractC2019M1614 = this.f12161;
        abstractC2019M1614.getClass();
        if (abstractC2019M1614 instanceof C0696) {
            abstractC2019M1614 = abstractC2019M1614.mo1615().m1614(c0864);
        }
        AbstractC2019 abstractC2019M16142 = this.f12163;
        abstractC2019M16142.getClass();
        if (abstractC2019M16142 instanceof C0696) {
            abstractC2019M16142 = abstractC2019M16142.mo1615().m1614(c0864);
        }
        C0249 c0249 = (C0249) AbstractC1933.f9733.get(this.f12162);
        if (c0249 != null) {
            return c0249.m900(abstractC2019M1614, abstractC2019M16142, c0864);
        }
        return false;
    }
}

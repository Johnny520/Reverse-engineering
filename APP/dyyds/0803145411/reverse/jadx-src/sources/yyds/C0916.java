package yyds;

/* JADX INFO: renamed from: yyds.ᛴᛸᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0916 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f4202;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2133 f4203;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f4204;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ String f4205;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f4206;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0916(C2133 c2133, String str, String str2, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f4204 = i;
        this.f4203 = c2133;
        this.f4206 = str;
        this.f4205 = str2;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        int i = this.f4204;
        String str = this.f4205;
        String str2 = this.f4206;
        C2133 c2133 = this.f4203;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        switch (i) {
            case 0:
                int i2 = this.f4202;
                try {
                } catch (Exception e) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-1520117347943278L), e);
                }
                if (i2 == 0) {
                    AbstractC1544.m3189(obj);
                    C0380 c0380 = (C0380) c2133.f10555;
                    this.f4202 = 1;
                    c0380.getClass();
                    obj = AbstractC1960.m3774(c0380.f1954, this, new C0421(0, AbstractC2328.m4341(-1374174359225198L), str2, str), true, false);
                    if (obj == enumC1765) {
                    }
                } else if (i2 != 1) {
                    C0188.m800(AbstractC2328.m4341(-1520173182518126L));
                } else {
                    AbstractC1544.m3189(obj);
                }
                break;
            default:
                int i3 = this.f4202;
                try {
                } catch (Exception e2) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-1434553009472366L), e2);
                }
                if (i3 == 0) {
                    AbstractC1544.m3189(obj);
                    C0380 c03802 = (C0380) c2133.f10555;
                    this.f4202 = 1;
                    c03802.getClass();
                    obj = AbstractC1960.m3774(c03802.f1954, this, new C0421(2, AbstractC2328.m4341(-1400180386202478L), str2, str), true, false);
                    if (obj == enumC1765) {
                    }
                } else if (i3 != 1) {
                    C0188.m800(AbstractC2328.m4341(-1434574484308846L));
                } else {
                    AbstractC1544.m3189(obj);
                }
                break;
        }
        return null;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        switch (this.f4204) {
            case 0:
                return new C0916(this.f4203, this.f4206, this.f4205, interfaceC0274, 0);
            default:
                return new C0916(this.f4203, this.f4206, this.f4205, interfaceC0274, 1);
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        int i = this.f4204;
        C2746 c2746 = C2746.f13459;
        InterfaceC0990 interfaceC0990 = (InterfaceC0990) obj;
        InterfaceC0274 interfaceC0274 = (InterfaceC0274) obj2;
        switch (i) {
        }
        return ((C0916) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
    }
}

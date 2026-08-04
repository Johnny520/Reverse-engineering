package yyds;

/* JADX INFO: renamed from: yyds.ᲇᛲᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2395 extends AbstractC1861 implements InterfaceC1549 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1277 f11811;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ EnumC2065 f11812;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f11813;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0477 f11814;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2395(C1277 c1277, EnumC2065 enumC2065, InterfaceC0477 interfaceC0477, InterfaceC0274 interfaceC0274) {
        super(1, interfaceC0274);
        this.f11811 = c1277;
        this.f11812 = enumC2065;
        this.f11814 = interfaceC0477;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        int i = this.f11813;
        if (i != 0) {
            if (i == 1) {
                AbstractC1544.m3189(obj);
                return obj;
            }
            C0188.m800("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC1544.m3189(obj);
        this.f11813 = 1;
        Object objM2545 = this.f11811.m2545(this.f11812, this.f11814, this);
        EnumC1765 enumC1765 = EnumC1765.f8858;
        return objM2545 == enumC1765 ? enumC1765 : objM2545;
    }

    @Override // yyds.InterfaceC1549
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final Object mo371(Object obj) {
        EnumC2065 enumC2065 = this.f11812;
        InterfaceC0477 interfaceC0477 = this.f11814;
        return new C2395(this.f11811, enumC2065, interfaceC0477, (InterfaceC0274) obj).mo474(C2746.f13459);
    }
}

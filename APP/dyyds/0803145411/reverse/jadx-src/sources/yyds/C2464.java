package yyds;

/* JADX INFO: renamed from: yyds.ᲇᛶᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2464 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f12166;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f12167;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0119 f12168;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ boolean f12169;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2464(C0119 c0119, String str, String str2, boolean z, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f12168 = c0119;
        this.f12166 = str;
        this.f12167 = str2;
        this.f12169 = z;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        boolean zBooleanValue;
        Boolean bool;
        C0119 c0119 = this.f12168;
        AbstractC1544.m3189(obj);
        try {
            String strM533 = C0119.m533(((C2174) c0119.f812).f10656 + '/' + this.f12166 + '/' + this.f12167 + '/', this.f12169);
            C0526 c0526M550 = c0119.m550();
            c0526M550.getClass();
            C1633 c1633 = new C1633();
            c1633.m3334(strM533);
            c1633.m3335("HEAD", null);
            C2098 c2098 = new C2098(c1633);
            C1284 c1284 = c0526M550.f2527;
            c1284.getClass();
            C0837 c0837M4863 = new C2729(c1284, c2098).m4863();
            if (c0837M4863.f3852 || c0837M4863.f3860 != 404) {
                AbstractC0024.m3294(c0837M4863);
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            zBooleanValue = bool.booleanValue();
        } catch (Exception unused) {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        return new C2464(this.f12168, this.f12166, this.f12167, this.f12169, interfaceC0274);
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        return ((C2464) mo630((InterfaceC0990) obj, (InterfaceC0274) obj2)).mo474(C2746.f13459);
    }
}

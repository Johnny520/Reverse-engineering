package yyds;

/* JADX INFO: renamed from: yyds.ᛴᲀᛳᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0930 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f4249;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f4250;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f4251;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ C2133 f4252;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ String f4253;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f4254;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0930(C2133 c2133, String str, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f4252 = c2133;
        this.f4253 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo474(Object obj) throws Throwable {
        int iIntValue;
        Object objM3774;
        int i;
        Object objM37742;
        int i2;
        int i3;
        int i4;
        C0380 c0380 = (C0380) this.f4252.f10555;
        int i5 = this.f4254;
        String str = this.f4253;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        try {
            if (i5 == 0) {
                AbstractC1544.m3189(obj);
                this.f4254 = 1;
                c0380.getClass();
                obj = AbstractC1960.m3774(c0380.f1954, this, new C2085(AbstractC2328.m4341(-1400450969142126L), 9, str), true, false);
                if (obj == enumC1765) {
                }
                return enumC1765;
            }
            if (i5 != 1) {
                if (i5 == 2) {
                    iIntValue = this.f4251;
                    AbstractC1544.m3189(obj);
                    int iIntValue2 = ((Number) obj).intValue();
                    this.f4251 = iIntValue;
                    this.f4249 = iIntValue2;
                    this.f4254 = 3;
                    c0380.getClass();
                    objM3774 = AbstractC1960.m3774(c0380.f1954, this, new C2085(AbstractC2328.m4341(-1401382977045358L), 11, str), true, false);
                    if (objM3774 != enumC1765) {
                        return enumC1765;
                    }
                    i = iIntValue2;
                    obj = objM3774;
                    int iIntValue3 = ((Number) obj).intValue();
                    this.f4251 = iIntValue;
                    this.f4249 = i;
                    this.f4250 = iIntValue3;
                    this.f4254 = 4;
                    c0380.getClass();
                    objM37742 = AbstractC1960.m3774(c0380.f1954, this, new C2085(AbstractC2328.m4341(-1401902668088174L), 10, str), true, false);
                    if (objM37742 != enumC1765) {
                    }
                    return enumC1765;
                }
                if (i5 != 3) {
                    if (i5 != 4) {
                        C0188.m800(AbstractC2328.m4341(-1433285994120046L));
                        return null;
                    }
                    i2 = this.f4250;
                    i4 = this.f4249;
                    i3 = this.f4251;
                    AbstractC1544.m3189(obj);
                    return AbstractC2725.m4854(new Integer(i3), new Integer(i4), new Integer(i2), new Integer(((Number) obj).intValue()));
                }
                int i6 = this.f4249;
                int i7 = this.f4251;
                AbstractC1544.m3189(obj);
                i = i6;
                iIntValue = i7;
                int iIntValue32 = ((Number) obj).intValue();
                this.f4251 = iIntValue;
                this.f4249 = i;
                this.f4250 = iIntValue32;
                this.f4254 = 4;
                c0380.getClass();
                objM37742 = AbstractC1960.m3774(c0380.f1954, this, new C2085(AbstractC2328.m4341(-1401902668088174L), 10, str), true, false);
                if (objM37742 != enumC1765) {
                    i2 = iIntValue32;
                    obj = objM37742;
                    i3 = iIntValue;
                    i4 = i;
                    return AbstractC2725.m4854(new Integer(i3), new Integer(i4), new Integer(i2), new Integer(((Number) obj).intValue()));
                }
                return enumC1765;
            }
            AbstractC1544.m3189(obj);
            iIntValue = ((Number) obj).intValue();
            this.f4251 = iIntValue;
            this.f4254 = 2;
            c0380.getClass();
            obj = AbstractC1960.m3774(c0380.f1954, this, new C2085(AbstractC2328.m4341(-1400871875937134L), 13, str), true, false);
            if (obj != enumC1765) {
                int iIntValue22 = ((Number) obj).intValue();
                this.f4251 = iIntValue;
                this.f4249 = iIntValue22;
                this.f4254 = 3;
                c0380.getClass();
                objM3774 = AbstractC1960.m3774(c0380.f1954, this, new C2085(AbstractC2328.m4341(-1401382977045358L), 11, str), true, false);
                if (objM3774 != enumC1765) {
                }
            }
            return enumC1765;
        } catch (Exception e) {
            C2336.f11496.m4355(AbstractC2328.m4341(-1433264519283566L), e);
            return AbstractC2725.m4854(new Integer(0), new Integer(0), new Integer(0), new Integer(0));
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        return new C0930(this.f4252, this.f4253, interfaceC0274);
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        return ((C0930) mo630((InterfaceC0990) obj, (InterfaceC0274) obj2)).mo474(C2746.f13459);
    }
}

package yyds;

/* JADX INFO: renamed from: yyds.ᲇᛲᛱᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2391 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public C1185 f11799;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final /* synthetic */ byte[] f11800;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f11801;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public String f11802;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ String f11803;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ String f11804;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0119 f11805;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2391(C0119 c0119, String str, String str2, byte[] bArr, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f11805 = c0119;
        this.f11803 = str;
        this.f11804 = str2;
        this.f11800 = bArr;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        String strM533;
        Object objM551;
        String str;
        int i = this.f11801;
        byte[] bArr = this.f11800;
        C2746 c2746 = C2746.f13459;
        String str2 = this.f11804;
        String str3 = this.f11803;
        C0119 c0119 = this.f11805;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        if (i == 0) {
            AbstractC1544.m3189(obj);
            strM533 = C0119.m533(((C2174) c0119.f812).f10656 + '/' + str3 + '/' + str2, false);
            C2336.f11496.m4354(AbstractC2328.m4341(-523053575078766L).concat(strM533));
            try {
                c0119.m550().m1364(strM533, bArr);
                return c2746;
            } catch (C1185 e) {
                e = e;
                if (e.f5424 == 405) {
                    this.f11802 = strM533;
                    this.f11799 = e;
                    this.f11801 = 1;
                    objM551 = c0119.m551(str2, str3, false, this);
                    if (objM551 != enumC1765) {
                    }
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    C0188.m800(AbstractC2328.m4341(-523216783836014L));
                    return null;
                }
                str = this.f11802;
                AbstractC1544.m3189(obj);
                c0119.m550().m1364(str, bArr);
                return c2746;
            }
            e = this.f11799;
            String str4 = this.f11802;
            AbstractC1544.m3189(obj);
            objM551 = obj;
            strM533 = str4;
        }
        if (((Boolean) objM551).booleanValue()) {
            C2336.f11496.m4354(AbstractC2328.m4341(-523100819719022L) + strM533);
            this.f11802 = strM533;
            this.f11799 = null;
            this.f11801 = 2;
            C1206 c1206 = AbstractC0221.f1238;
            Object objM3955 = AbstractC2071.m3955(ExecutorC2482.f12272, new C0196(c0119, str3, str2, null, 0), this);
            if (objM3955 != enumC1765) {
                objM3955 = c2746;
            }
            if (objM3955 != enumC1765) {
                str = strM533;
                c0119.m550().m1364(str, bArr);
                return c2746;
            }
            return enumC1765;
        }
        throw e;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        return new C2391(this.f11805, this.f11803, this.f11804, this.f11800, interfaceC0274);
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        return ((C2391) mo630((InterfaceC0990) obj, (InterfaceC0274) obj2)).mo474(C2746.f13459);
    }
}

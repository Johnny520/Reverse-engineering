package yyds;

import java.util.List;

/* JADX INFO: renamed from: yyds.ᛲᛵᲇᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0360 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f1870;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f1871;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1872;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ String f1873;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f1874;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0360(String str, String str2, String str3, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f1872 = i;
        this.f1871 = str;
        this.f1874 = str2;
        this.f1873 = str3;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        Object objM4666;
        Object c2658;
        String strM4341;
        int i = this.f1872;
        String str = this.f1873;
        String str2 = this.f1874;
        String str3 = this.f1871;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        switch (i) {
            case 0:
                int i2 = this.f1870;
                if (i2 == 0) {
                    AbstractC1544.m3189(obj);
                    C1624.m3321(AbstractC2328.m4341(-107532669059950L));
                    C2592 c2592 = C2592.f12774;
                    this.f1870 = 1;
                    objM4666 = c2592.m4666(str3, str2, str, this);
                    if (objM4666 == enumC1765) {
                        return enumC1765;
                    }
                } else {
                    if (i2 != 1) {
                        C0188.m800(AbstractC2328.m4341(-107592798602094L));
                        return null;
                    }
                    AbstractC1544.m3189(obj);
                    objM4666 = ((C2248) obj).f11089;
                }
                C1624.m3320();
                if (!(objM4666 instanceof C2658)) {
                    AbstractC1960.m3789((String) objM4666);
                }
                Throwable thM4249 = C2248.m4249(objM4666);
                if (thM4249 != null) {
                    String message = thM4249.getMessage();
                    if (message == null) {
                        message = AbstractC2328.m4341(-107571323765614L);
                    }
                    AbstractC1960.m3789(message);
                }
                return C2746.f13459;
            default:
                int i3 = this.f1870;
                try {
                    if (i3 == 0) {
                        AbstractC1544.m3189(obj);
                        C0119 c0119 = new C0119(str3, str2, str);
                        this.f1870 = 1;
                        obj = c0119.m553(this);
                        if (obj == enumC1765) {
                            return enumC1765;
                        }
                    } else {
                        if (i3 != 1) {
                            C0188.m800(AbstractC2328.m4341(-534972109325166L));
                            return null;
                        }
                        AbstractC1544.m3189(obj);
                    }
                    c2658 = AbstractC2328.m4341(-534508252857198L) + ((List) obj).size() + AbstractC2328.m4341(-534559792464750L);
                    break;
                } catch (C1185 e) {
                    C2336.f11496.m4358(AbstractC2328.m4341(-534576972333934L), e);
                    int i4 = e.f5424;
                    if (i4 == 401 || i4 == 403) {
                        strM4341 = AbstractC2328.m4341(-534632806908782L);
                    } else if (i4 != 404) {
                        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-534830375404398L));
                        sb.append(i4);
                        sb.append(' ');
                        String strM43412 = e.f5425;
                        if (strM43412 == null) {
                            strM43412 = AbstractC2328.m4341(-534881915011950L);
                        }
                        sb.append(strM43412);
                        strM4341 = AbstractC0473.m1314(sb.toString()).toString();
                    } else {
                        strM4341 = AbstractC2328.m4341(-534723001221998L);
                    }
                    c2658 = new C2658(new Exception(strM4341));
                } catch (Exception e2) {
                    C2336.f11496.m4358(AbstractC2328.m4341(-534886209979246L), e2);
                    c2658 = new C2658(new Exception(AbstractC2328.m4341(-534942044554094L) + e2.getMessage()));
                }
                return new C2248(c2658);
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        switch (this.f1872) {
            case 0:
                return new C0360(this.f1871, this.f1874, this.f1873, interfaceC0274, 0);
            default:
                return new C0360(this.f1871, this.f1874, this.f1873, interfaceC0274, 1);
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        int i = this.f1872;
        C2746 c2746 = C2746.f13459;
        InterfaceC0990 interfaceC0990 = (InterfaceC0990) obj;
        InterfaceC0274 interfaceC0274 = (InterfaceC0274) obj2;
        switch (i) {
        }
        return ((C0360) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
    }
}

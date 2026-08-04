package yyds;

import android.database.SQLException;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᲈᲀᛱᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2728 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f13404;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public /* synthetic */ Object f13405;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f13406;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0682 f13407;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2728(C0682 c0682, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f13406 = i;
        this.f13407 = c0682;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        InterfaceC2684 interfaceC2684;
        int i = this.f13406;
        C0682 c0682 = this.f13407;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        InterfaceC0274 interfaceC0274 = null;
        switch (i) {
            case 0:
                int i2 = this.f13404;
                if (i2 != 0) {
                    if (i2 == 1) {
                        AbstractC1544.m3189(obj);
                        return obj;
                    }
                    C0188.m800("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1544.m3189(obj);
                C0236 c0236 = (C0236) this.f13405;
                this.f13404 = 1;
                Object objM1589 = c0682.m1589(c0236, this);
                return objM1589 == enumC1765 ? enumC1765 : objM1589;
            default:
                int i3 = this.f13404;
                try {
                    if (i3 == 0) {
                        AbstractC1544.m3189(obj);
                        interfaceC2684 = (InterfaceC2684) this.f13405;
                        this.f13405 = interfaceC2684;
                        this.f13404 = 1;
                        obj = interfaceC2684.mo2546(this);
                        if (obj == enumC1765) {
                            return enumC1765;
                        }
                    } else {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                AbstractC1544.m3189(obj);
                                return (Set) obj;
                            }
                            C0188.m800("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        interfaceC2684 = (InterfaceC2684) this.f13405;
                        AbstractC1544.m3189(obj);
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        EnumC2065 enumC2065 = EnumC2065.f10217;
                        C2728 c2728 = new C2728(c0682, interfaceC0274, 0);
                        this.f13405 = null;
                        this.f13404 = 2;
                        obj = interfaceC2684.mo2547(enumC2065, c2728, this);
                        if (obj == enumC1765) {
                            return enumC1765;
                        }
                        return (Set) obj;
                    }
                } catch (SQLException unused) {
                }
                return C1422.f6715;
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        int i = this.f13406;
        C0682 c0682 = this.f13407;
        switch (i) {
            case 0:
                C2728 c2728 = new C2728(c0682, interfaceC0274, 0);
                c2728.f13405 = obj;
                return c2728;
            default:
                C2728 c27282 = new C2728(c0682, interfaceC0274, 1);
                c27282.f13405 = obj;
                return c27282;
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        int i = this.f13406;
        C2746 c2746 = C2746.f13459;
        switch (i) {
            case 0:
                return ((C2728) mo630((C0236) obj, (InterfaceC0274) obj2)).mo474(c2746);
            default:
                return ((C2728) mo630((InterfaceC2684) obj, (InterfaceC0274) obj2)).mo474(c2746);
        }
    }
}

package yyds;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᛶᲇᲁᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1455 extends AbstractC0986 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean f6937;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1455(InterfaceC2798 interfaceC2798) {
        super(true);
        boolean z = true;
        m2166(interfaceC2798);
        Unsafe unsafe = AbstractC2112.f10448;
        long j = AbstractC0986.f4495;
        InterfaceC2330 interfaceC2330 = (InterfaceC2330) unsafe.getObjectVolatile(this, j);
        C2628 c2628 = interfaceC2330 instanceof C2628 ? (C2628) interfaceC2330 : null;
        if (c2628 == null) {
            z = false;
            break;
        }
        AbstractC0986 abstractC0986 = c2628.f4255;
        abstractC0986 = abstractC0986 == null ? null : abstractC0986;
        if (abstractC0986 != null) {
            while (!abstractC0986.mo2148()) {
                InterfaceC2330 interfaceC23302 = (InterfaceC2330) AbstractC2112.f10448.getObjectVolatile(abstractC0986, j);
                C2628 c26282 = interfaceC23302 instanceof C2628 ? (C2628) interfaceC23302 : null;
                if (c26282 != null) {
                    abstractC0986 = c26282.f4255;
                    if (abstractC0986 == null) {
                        abstractC0986 = null;
                    }
                    if (abstractC0986 == null) {
                    }
                }
                z = false;
            }
        }
        this.f6937 = z;
    }

    @Override // yyds.AbstractC0986
    /* JADX INFO: renamed from: ᛱᛳᛶᛳ */
    public final boolean mo2142() {
        return true;
    }

    @Override // yyds.AbstractC0986
    /* JADX INFO: renamed from: ᛲᛳᛴᛸ */
    public final boolean mo2148() {
        return this.f6937;
    }
}

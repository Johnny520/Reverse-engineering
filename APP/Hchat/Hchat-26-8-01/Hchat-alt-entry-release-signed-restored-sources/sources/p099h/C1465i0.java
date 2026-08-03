package p099h;

import gg.AbstractC1417m;
import okio.C3193a;
import p085fg.InterfaceC1231l;
import p116i.InterfaceC1747e1;
import p116i.InterfaceC1803y;

/* JADX INFO: renamed from: h.i0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1465i0 extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4874g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1483r0 f4875h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1485s0 f4876i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1465i0(C1483r0 c1483r0, C1485s0 c1485s0, int i9) {
        super(1);
        this.f4874g = i9;
        this.f4875h = c1483r0;
        this.f4876i = c1485s0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        InterfaceC1803y interfaceC1803y;
        InterfaceC1803y interfaceC1803y2;
        switch (this.f4874g) {
            case 0:
                InterfaceC1747e1 interfaceC1747e1 = (InterfaceC1747e1) obj;
                EnumC1456f0 enumC1456f0 = EnumC1456f0.f4833g;
                EnumC1456f0 enumC1456f02 = EnumC1456f0.f4834h;
                if (interfaceC1747e1.m4391a(enumC1456f0, enumC1456f02)) {
                    C1487t0 c1487t0 = this.f4875h.f4927a.f4864a;
                    return (c1487t0 == null || (interfaceC1803y2 = c1487t0.f4938a) == null) ? AbstractC1473m0.f4892b : interfaceC1803y2;
                }
                if (!interfaceC1747e1.m4391a(enumC1456f02, EnumC1456f0.f4835i)) {
                    return AbstractC1473m0.f4892b;
                }
                C1487t0 c1487t02 = this.f4876i.f4934a.f4864a;
                return (c1487t02 == null || (interfaceC1803y = c1487t02.f4938a) == null) ? AbstractC1473m0.f4892b : interfaceC1803y;
            case 1:
                int iOrdinal = ((EnumC1456f0) obj).ordinal();
                float f3 = 0.0f;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        f3 = 1.0f;
                    } else {
                        if (iOrdinal != 2) {
                            C3193a.m6822k();
                            return null;
                        }
                        if (this.f4876i.f4934a.f4864a == null) {
                        }
                    }
                } else if (this.f4875h.f4927a.f4864a == null) {
                }
                return Float.valueOf(f3);
            case 2:
                InterfaceC1747e1 interfaceC1747e12 = (InterfaceC1747e1) obj;
                EnumC1456f0 enumC1456f03 = EnumC1456f0.f4833g;
                EnumC1456f0 enumC1456f04 = EnumC1456f0.f4834h;
                if (interfaceC1747e12.m4391a(enumC1456f03, enumC1456f04)) {
                    return AbstractC1473m0.f4892b;
                }
                if (!interfaceC1747e12.m4391a(enumC1456f04, EnumC1456f0.f4835i)) {
                    return AbstractC1473m0.f4892b;
                }
                C1463h1 c1463h1 = this.f4876i.f4934a;
                return AbstractC1473m0.f4892b;
            default:
                int iOrdinal2 = ((EnumC1456f0) obj).ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        C3193a.m6822k();
                        return null;
                    }
                    C1463h1 c1463h12 = this.f4876i.f4934a;
                }
                return Float.valueOf(1.0f);
        }
    }
}

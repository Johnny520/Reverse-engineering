package p099h;

import gg.AbstractC1417m;
import p085fg.InterfaceC1231l;
import p116i.C1785r0;
import p116i.InterfaceC1747e1;

/* JADX INFO: renamed from: h.p0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1479p0 extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4906g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1481q0 f4907h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1479p0(C1481q0 c1481q0, int i9) {
        super(1);
        this.f4906g = i9;
        this.f4907h = c1481q0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f4906g) {
            case 0:
                InterfaceC1747e1 interfaceC1747e1 = (InterfaceC1747e1) obj;
                EnumC1456f0 enumC1456f0 = EnumC1456f0.f4833g;
                EnumC1456f0 enumC1456f02 = EnumC1456f0.f4834h;
                C1785r0 c1785r0 = null;
                if (!interfaceC1747e1.m4391a(enumC1456f0, enumC1456f02)) {
                    if (interfaceC1747e1.m4391a(enumC1456f02, EnumC1456f0.f4835i)) {
                        C1463h1 c1463h1 = this.f4907h.f4911A.f4934a;
                    } else {
                        c1785r0 = AbstractC1473m0.f4894d;
                    }
                }
                return c1785r0 == null ? AbstractC1473m0.f4894d : c1785r0;
            default:
                InterfaceC1747e1 interfaceC1747e12 = (InterfaceC1747e1) obj;
                EnumC1456f0 enumC1456f03 = EnumC1456f0.f4833g;
                EnumC1456f0 enumC1456f04 = EnumC1456f0.f4834h;
                boolean zM4391a = interfaceC1747e12.m4391a(enumC1456f03, enumC1456f04);
                C1481q0 c1481q0 = this.f4907h;
                if (zM4391a) {
                    C1457f1 c1457f1 = c1481q0.f4922z.f4927a.f4865b;
                    return c1457f1 != null ? c1457f1.f4838b : AbstractC1473m0.f4893c;
                }
                if (!interfaceC1747e12.m4391a(enumC1456f04, EnumC1456f0.f4835i)) {
                    return AbstractC1473m0.f4893c;
                }
                C1457f1 c1457f12 = c1481q0.f4911A.f4934a.f4865b;
                return c1457f12 != null ? c1457f12.f4838b : AbstractC1473m0.f4893c;
        }
    }
}

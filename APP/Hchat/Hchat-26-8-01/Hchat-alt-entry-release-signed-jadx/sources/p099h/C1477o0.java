package p099h;

import gg.AbstractC1416l;
import gg.AbstractC1417m;
import okio.C3193a;
import p085fg.InterfaceC1231l;
import p293u2.C4240j;
import p293u2.C4242l;

/* JADX INFO: renamed from: h.o0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1477o0 extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4900g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1481q0 f4901h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f4902i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1477o0(C1481q0 c1481q0, long j3, int i9) {
        super(1);
        this.f4900g = i9;
        this.f4901h = c1481q0;
        this.f4902i = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v12, types: [fg.l, gg.m] */
    /* JADX WARN: Type inference failed for: r1v10, types: [fg.l, gg.m] */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        int iOrdinal;
        switch (this.f4900g) {
            case 0:
                int iOrdinal2 = ((EnumC1456f0) obj).ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        C3193a.m6822k();
                        return null;
                    }
                    C1463h1 c1463h1 = this.f4901h.f4911A.f4934a;
                }
                return new C4242l(this.f4902i);
            case 1:
                EnumC1456f0 enumC1456f0 = (EnumC1456f0) obj;
                C1481q0 c1481q0 = this.f4901h;
                if (c1481q0.f4915E != null && c1481q0.m3999m1() != null && !AbstractC1416l.m3825a(c1481q0.f4915E, c1481q0.m3999m1()) && (iOrdinal = enumC1456f0.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        C3193a.m6822k();
                        return null;
                    }
                    C1463h1 c1463h12 = c1481q0.f4911A.f4934a;
                }
                return new C4240j(0L);
            default:
                EnumC1456f0 enumC1456f02 = (EnumC1456f0) obj;
                C1481q0 c1481q02 = this.f4901h;
                C1457f1 c1457f1 = c1481q02.f4922z.f4927a.f4865b;
                long j3 = this.f4902i;
                long j4 = 0;
                long j5 = c1457f1 != null ? ((C4240j) c1457f1.f4837a.invoke(new C4242l(j3))).f13912a : 0L;
                C1457f1 c1457f12 = c1481q02.f4911A.f4934a.f4865b;
                long j10 = c1457f12 != null ? ((C4240j) c1457f12.f4837a.invoke(new C4242l(j3))).f13912a : 0L;
                int iOrdinal3 = enumC1456f02.ordinal();
                if (iOrdinal3 == 0) {
                    j4 = j5;
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        C3193a.m6822k();
                        return null;
                    }
                    j4 = j10;
                }
                return new C4240j(j4);
        }
    }
}

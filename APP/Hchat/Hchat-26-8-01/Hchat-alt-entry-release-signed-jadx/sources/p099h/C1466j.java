package p099h;

import gg.AbstractC1417m;
import p085fg.InterfaceC1235p;
import p116i.AbstractC1742d;
import p293u2.C4242l;

/* JADX INFO: renamed from: h.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1466j extends AbstractC1417m implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public static final C1466j f4877h;

    /* JADX INFO: renamed from: i */
    public static final C1466j f4878i;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4879g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = 2;
        f4877h = new C1466j(i9, 0);
        f4878i = new C1466j(i9, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1466j(int i9, int i10) {
        super(i9);
        this.f4879g = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4879g) {
            case 0:
                long j3 = ((C4242l) obj).f13918a;
                long j4 = ((C4242l) obj2).f13918a;
                long j5 = 1;
                return AbstractC1742d.m4379o(0.0f, 400.0f, new C4242l((j5 & 4294967295L) | (j5 << 32)), 1);
            default:
                EnumC1456f0 enumC1456f0 = (EnumC1456f0) obj2;
                return Boolean.valueOf(((EnumC1456f0) obj) == enumC1456f0 && enumC1456f0 == EnumC1456f0.f4835i);
        }
    }
}

package p358y2;

import gg.AbstractC1417m;
import p085fg.InterfaceC1235p;
import p117i0.C1836h0;
import p276sf.C3967n;

/* JADX INFO: renamed from: y2.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5982q extends AbstractC1417m implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public static final C5982q f24296h;

    /* JADX INFO: renamed from: i */
    public static final C5982q f24297i;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f24298g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = 2;
        f24296h = new C5982q(i9, 0);
        f24297i = new C5982q(i9, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5982q(int i9, int i10) {
        super(i9);
        this.f24298g = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24298g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1836h0.m4519V();
                }
                break;
            default:
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}

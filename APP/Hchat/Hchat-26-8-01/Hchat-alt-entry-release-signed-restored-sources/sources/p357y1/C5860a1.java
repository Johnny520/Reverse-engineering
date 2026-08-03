package p357y1;

import gg.AbstractC1417m;
import p085fg.InterfaceC1235p;
import p117i0.C1836h0;
import p276sf.C3967n;

/* JADX INFO: renamed from: y1.a1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5860a1 extends AbstractC1417m implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public static final C5860a1 f23816g = new C5860a1(2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        C1836h0 c1836h0 = (C1836h0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (!c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
            c1836h0.m4519V();
        }
        return C3967n.f12976a;
    }
}

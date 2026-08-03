package p373z0;

import android.view.ViewStructure;
import gg.AbstractC1417m;
import p085fg.InterfaceC1237r;
import p276sf.C3967n;

/* JADX INFO: renamed from: z0.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6074n extends AbstractC1417m implements InterfaceC1237r {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ViewStructure f24557g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6074n(ViewStructure viewStructure) {
        super(4);
        this.f24557g = viewStructure;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1237r
    /* JADX INFO: renamed from: c */
    public final Object mo3355c(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue() - iIntValue2;
        this.f24557g.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3 - iIntValue, iIntValue4);
        return C3967n.f12976a;
    }
}

package p099h;

import gg.AbstractC1417m;
import java.util.ArrayList;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4377b1;

/* JADX INFO: renamed from: h.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1488u extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4939g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ArrayList f4940h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1488u(int i9, ArrayList arrayList) {
        super(1);
        this.f4939g = i9;
        this.f4940h = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f4939g) {
            case 0:
                AbstractC4374a1 abstractC4374a1 = (AbstractC4374a1) obj;
                ArrayList arrayList = this.f4940h;
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    abstractC4374a1.m8816A((AbstractC4377b1) arrayList.get(i9), 0, 0, 0.0f);
                }
                break;
            case 1:
                AbstractC4374a1 abstractC4374a12 = (AbstractC4374a1) obj;
                ArrayList arrayList2 = this.f4940h;
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    AbstractC4374a1.m8812F(abstractC4374a12, (AbstractC4377b1) arrayList2.get(i10), 0, 0);
                }
                break;
            case 2:
                AbstractC4374a1 abstractC4374a13 = (AbstractC4374a1) obj;
                ArrayList arrayList3 = this.f4940h;
                int size3 = arrayList3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    AbstractC4374a1.m8811E(abstractC4374a13, (AbstractC4377b1) arrayList3.get(i11), 0, 0);
                }
                break;
            default:
                AbstractC4374a1 abstractC4374a14 = (AbstractC4374a1) obj;
                ArrayList arrayList4 = this.f4940h;
                int size4 = arrayList4.size() - 1;
                if (size4 >= 0) {
                    int i12 = 0;
                    while (true) {
                        AbstractC4374a1.m8811E(abstractC4374a14, (AbstractC4377b1) arrayList4.get(i12), 0, 0);
                        if (i12 != size4) {
                            i12++;
                        }
                    }
                }
                break;
        }
        return C3967n.f12976a;
    }
}

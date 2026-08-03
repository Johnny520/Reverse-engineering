package p332wb;

import java.util.List;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.InterfaceC1809a1;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.qc */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5238qc implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20166g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f20167h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List f20168i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5238qc(InterfaceC1809a1 interfaceC1809a1, List list, int i9) {
        this.f20166g = i9;
        this.f20167h = interfaceC1809a1;
        this.f20168i = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f20166g;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((C3619d) obj).getClass();
        int i10 = iIntValue & 17;
        switch (i9) {
            case 0:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-606320327, new C5405ve(this.f20168i, this.f20167h, 3), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1325955814, new C5405ve(this.f20167h, this.f20168i, 1), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 2:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1962673116, new C5405ve(this.f20168i, this.f20167h, 5), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 3:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1057281497, new C5405ve(this.f20168i, this.f20167h, 2), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 4:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1489895996, new C5405ve(this.f20168i, this.f20167h, 0), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-399441659, new C5405ve(this.f20167h, this.f20168i, 4), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5238qc(List list, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f20166g = i9;
        this.f20168i = list;
        this.f20167h = interfaceC1809a1;
    }
}

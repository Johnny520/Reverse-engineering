package p332wb;

import java.util.List;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.InterfaceC1809a1;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.cc */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4779cc implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16300g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f16301h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f16302i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f16303j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f16304k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f16305l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ List f16306m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4779cc(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, List list, int i9) {
        this.f16300g = i9;
        this.f16301h = interfaceC1809a1;
        this.f16302i = interfaceC1809a12;
        this.f16303j = interfaceC1809a13;
        this.f16304k = interfaceC1809a14;
        this.f16305l = interfaceC1809a15;
        this.f16306m = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f16300g;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((C3619d) obj).getClass();
        int i10 = iIntValue & 17;
        switch (i9) {
            case 0:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-96678377, new C5372ue(this.f16306m, this.f16301h, this.f16302i, this.f16303j, this.f16304k, this.f16305l, 2), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-782445995, new C5372ue(this.f16301h, this.f16302i, this.f16303j, this.f16304k, this.f16305l, this.f16306m, 3), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 2:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-450519599, new C5372ue(this.f16306m, this.f16301h, this.f16302i, this.f16303j, this.f16304k, this.f16305l, 1), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1714513235, new C5372ue(this.f16301h, this.f16302i, this.f16303j, this.f16304k, this.f16305l, this.f16306m, 0), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4779cc(List list, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, int i9) {
        this.f16300g = i9;
        this.f16306m = list;
        this.f16301h = interfaceC1809a1;
        this.f16302i = interfaceC1809a12;
        this.f16303j = interfaceC1809a13;
        this.f16304k = interfaceC1809a14;
        this.f16305l = interfaceC1809a15;
    }
}

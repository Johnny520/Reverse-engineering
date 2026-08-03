package p332wb;

import java.util.ArrayList;
import java.util.List;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.InterfaceC1809a1;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.gd */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4911gd implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17410g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ArrayList f17411h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List f17412i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ List f17413j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1235p f17414k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f17415l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f17416m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4911gd(ArrayList arrayList, List list, List list2, InterfaceC1235p interfaceC1235p, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f17410g = 1;
        this.f17411h = arrayList;
        this.f17412i = list;
        this.f17413j = list2;
        this.f17414k = interfaceC1235p;
        this.f17415l = interfaceC1809a1;
        this.f17416m = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f17410g;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((C3619d) obj).getClass();
        int i10 = iIntValue & 17;
        switch (i9) {
            case 0:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-500083587, new C4946hf(this.f17412i, this.f17411h, this.f17413j, this.f17414k, this.f17415l, this.f17416m, 0), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-170380160, new C4946hf(this.f17411h, this.f17412i, this.f17413j, this.f17414k, this.f17415l, this.f17416m), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1496232202, new C4946hf(this.f17412i, this.f17411h, this.f17413j, this.f17414k, this.f17415l, this.f17416m, 2), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4911gd(List list, ArrayList arrayList, List list2, InterfaceC1235p interfaceC1235p, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, int i9) {
        this.f17410g = i9;
        this.f17412i = list;
        this.f17411h = arrayList;
        this.f17413j = list2;
        this.f17414k = interfaceC1235p;
        this.f17415l = interfaceC1809a1;
        this.f17416m = interfaceC1809a12;
    }
}

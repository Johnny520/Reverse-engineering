package p332wb;

import p068eh.AbstractC0921a;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p222p.AbstractC3208d;
import p251r.C3619d;
import p276sf.C3967n;
import p356y0.C5850l;
import sh.AbstractC4045s;

/* JADX INFO: renamed from: wb.yb */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5500yb implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22132g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f22133h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5500yb(int i9, int i10) {
        this.f22132g = i10;
        this.f22133h = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f22132g;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((C3619d) obj).getClass();
        int i10 = iIntValue & 17;
        switch (i9) {
            case 0:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    int i11 = this.f22133h;
                    AbstractC4045s.m8246j(AbstractC0921a.m2249l(i11 + 1, "规则 "), AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, i11 == 0 ? 10 : 18, 0.0f, 0.0f, 13), c1836h0, 0, 12);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    int i12 = this.f22133h;
                    AbstractC4045s.m8246j(AbstractC0921a.m2249l(i12 + 1, "规则 "), AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, i12 == 0 ? 10 : 18, 0.0f, 0.0f, 13), c1836h0, 0, 12);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 2:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    int i13 = this.f22133h;
                    AbstractC4045s.m8246j(AbstractC0921a.m2250m(i13 + 1, "第 ", " 条"), AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, i13 == 0 ? 0 : 10, 0.0f, 0.0f, 13), c1836h0, 0, 12);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    int i14 = this.f22133h;
                    AbstractC4045s.m8246j(AbstractC0921a.m2250m(i14 + 1, "第 ", " 条"), AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, i14 == 0 ? 0 : 10, 0.0f, 0.0f, 13), c1836h0, 0, 12);
                } else {
                    c1836h0.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}

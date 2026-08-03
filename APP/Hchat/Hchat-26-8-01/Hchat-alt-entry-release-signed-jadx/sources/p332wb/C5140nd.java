package p332wb;

import java.util.List;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p222p.AbstractC3208d;
import p251r.C3619d;
import p276sf.C3967n;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.AbstractC4045s;

/* JADX INFO: renamed from: wb.nd */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5140nd implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19184g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List f19185h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5140nd(int i9, List list) {
        this.f19184g = i9;
        this.f19185h = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f19184g;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((C3619d) obj).getClass();
        int i10 = iIntValue & 17;
        switch (i9) {
            case 0:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    InterfaceC5853o interfaceC5853oM6886p = AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13);
                    List list = this.f19185h;
                    AbstractC4045s.m8246j(list.isEmpty() ? "规则" : AbstractC0921a.m2250m(list.size(), "规则 · ", " 项"), interfaceC5853oM6886p, c1836h0, 48, 12);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    AbstractC4045s.m8246j(AbstractC0921a.m2250m(this.f19185h.size(), "已监听群 · ", " 项"), AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h0, 48, 12);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 2:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    AbstractC4045s.m8246j(AbstractC0921a.m2250m(this.f19185h.size(), "已监听群 · ", " 项"), AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h0, 48, 12);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 3:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    AbstractC4045s.m8246j(AbstractC0921a.m2249l(this.f19185h.size(), "模型列表 · "), AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h0, 48, 12);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 4:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    AbstractC4045s.m8246j(AbstractC0921a.m2250m(this.f19185h.size(), "功能(", ")"), AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h0, 48, 12);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    AbstractC4045s.m8246j(AbstractC0921a.m2250m(this.f19185h.size(), "插件(", ")"), AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h0, 48, 12);
                } else {
                    c1836h0.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}

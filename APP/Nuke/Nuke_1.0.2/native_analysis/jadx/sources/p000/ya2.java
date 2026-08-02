package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ya2 extends o61 {

    /* JADX INFO: renamed from: c */
    public static final ya2 f13384c = new ya2("Undefined intrinsics block and it is required", 0);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f13385b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ya2(String str, int i) {
        super(str);
        this.f13385b = i;
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: g */
    public final of1 mo287g(pf1 pf1Var, List list, long j) {
        switch (this.f13385b) {
            case 0:
                int size = list.size();
                ce0 ce0Var = ce0.f1492h;
                if (size == 0) {
                    return pf1Var.mo696j0(C0221fz.m1765j(j), C0221fz.m1764i(j), ce0Var, oq0.f7787y);
                }
                if (size == 1) {
                    sz1 sz1VarMo2340e = ((if1) list.get(0)).mo2340e(j);
                    return pf1Var.mo696j0(AbstractC0258gz.m2033g(j, sz1VarMo2340e.f10438h), AbstractC0258gz.m2032f(j, sz1VarMo2340e.f10439i), ce0Var, new C0487n6(sz1VarMo2340e, 6));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    sz1 sz1VarMo2340e2 = ((if1) list.get(i)).mo2340e(j);
                    iMax = Math.max(sz1VarMo2340e2.f10438h, iMax);
                    iMax2 = Math.max(sz1VarMo2340e2.f10439i, iMax2);
                    arrayList.add(sz1VarMo2340e2);
                }
                return pf1Var.mo696j0(AbstractC0258gz.m2033g(j, iMax), AbstractC0258gz.m2032f(j, iMax2), ce0Var, new C0340j8(3, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}

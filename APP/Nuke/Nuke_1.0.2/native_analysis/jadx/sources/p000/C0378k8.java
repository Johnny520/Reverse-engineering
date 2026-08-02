package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: k8 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0378k8 implements nf1 {

    /* JADX INFO: renamed from: b */
    public static final C0378k8 f5380b = new C0378k8(0);

    /* JADX INFO: renamed from: c */
    public static final C0378k8 f5381c = new C0378k8(1);

    /* JADX INFO: renamed from: d */
    public static final C0378k8 f5382d = new C0378k8(2);

    /* JADX INFO: renamed from: e */
    public static final C0378k8 f5383e = new C0378k8(3);

    /* JADX INFO: renamed from: f */
    public static final C0829w f5384f = new C0829w(24);

    /* JADX INFO: renamed from: g */
    public static final C0378k8 f5385g = new C0378k8(4);

    /* JADX INFO: renamed from: h */
    public static final C0378k8 f5386h = new C0378k8(5);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5387a;

    public /* synthetic */ C0378k8(int i) {
        this.f5387a = i;
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: g */
    public final of1 mo287g(pf1 pf1Var, List list, long j) {
        int i = this.f5387a;
        ce0 ce0Var = ce0.f1492h;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iM1765j = 0;
                int iM1764i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    sz1 sz1VarMo2340e = ((if1) list.get(i2)).mo2340e(j);
                    iM1765j = Math.max(iM1765j, sz1VarMo2340e.f10438h);
                    iM1764i = Math.max(iM1764i, sz1VarMo2340e.f10439i);
                    arrayList.add(sz1VarMo2340e);
                }
                if (list.isEmpty()) {
                    iM1765j = C0221fz.m1765j(j);
                    iM1764i = C0221fz.m1764i(j);
                }
                return pf1Var.mo696j0(iM1765j, iM1764i, ce0Var, new C0340j8(0, arrayList));
            case 1:
                int size2 = list.size();
                if (size2 == 0) {
                    return pf1Var.mo696j0(0, 0, ce0Var, C0799v6.f11769r);
                }
                if (size2 == 1) {
                    sz1 sz1VarMo2340e2 = ((if1) list.get(0)).mo2340e(j);
                    return pf1Var.mo696j0(sz1VarMo2340e2.f10438h, sz1VarMo2340e2.f10439i, ce0Var, new C0487n6(sz1VarMo2340e2, 1));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                while (i < size3) {
                    sz1 sz1VarMo2340e3 = ((if1) list.get(i)).mo2340e(j);
                    iMax = Math.max(iMax, sz1VarMo2340e3.f10438h);
                    iMax2 = Math.max(iMax2, sz1VarMo2340e3.f10439i);
                    arrayList2.add(sz1VarMo2340e3);
                    i++;
                }
                return pf1Var.mo696j0(iMax, iMax2, ce0Var, new C0340j8(1, arrayList2));
            case 2:
                return pf1Var.mo696j0(C0221fz.m1765j(j), C0221fz.m1764i(j), ce0Var, new C0829w(24));
            case 3:
                return pf1Var.mo696j0(C0221fz.m1763h(j), C0221fz.m1762g(j), ce0Var, f5384f);
            case 4:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size4 = list.size();
                int iMax3 = 0;
                int iMax4 = 0;
                for (int i3 = 0; i3 < size4; i3++) {
                    sz1 sz1VarMo2340e4 = ((if1) list.get(i3)).mo2340e(j);
                    iMax3 = Math.max(iMax3, sz1VarMo2340e4.f10438h);
                    iMax4 = Math.max(iMax4, sz1VarMo2340e4.f10439i);
                    arrayList3.add(sz1VarMo2340e4);
                }
                return pf1Var.mo696j0(iMax3, iMax4, ce0Var, new xq2(0, arrayList3));
            default:
                return pf1Var.mo696j0(C0221fz.m1761f(j) ? C0221fz.m1763h(j) : 0, C0221fz.m1760e(j) ? C0221fz.m1762g(j) : 0, ce0Var, new C0829w(24));
        }
    }
}

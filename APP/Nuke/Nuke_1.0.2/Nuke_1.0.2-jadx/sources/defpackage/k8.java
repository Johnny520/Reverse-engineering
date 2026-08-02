package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k8 implements nf1 {
    public static final k8 b = new k8(0);
    public static final k8 c = new k8(1);
    public static final k8 d = new k8(2);
    public static final k8 e = new k8(3);
    public static final w f = new w(24);
    public static final k8 g = new k8(4);
    public static final k8 h = new k8(5);
    public final /* synthetic */ int a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [k8.<clinit>():void] */
    public /* synthetic */ k8(int i) {
        this.a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final of1 g(pf1 pf1Var, List list, long j) {
        int i = this.a;
        ce0 ce0Var = ce0.h;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iJ = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    sz1 sz1VarE = ((if1) list.get(i3)).e(j);
                    iJ = Math.max(iJ, sz1VarE.h);
                    i2 = Math.max(i2, sz1VarE.i);
                    arrayList.add(sz1VarE);
                }
                if (list.isEmpty()) {
                    iJ = fz.j(j);
                    i2 = fz.i(j);
                }
                return pf1Var.j0(iJ, i2, ce0Var, new j8(0, arrayList));
            case 1:
                int size2 = list.size();
                if (size2 == 0) {
                    return pf1Var.j0(0, 0, ce0Var, v6.r);
                }
                if (size2 == 1) {
                    sz1 sz1VarE2 = ((if1) list.get(0)).e(j);
                    return pf1Var.j0(sz1VarE2.h, sz1VarE2.i, ce0Var, new n6(sz1VarE2, 1));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                while (i < size3) {
                    sz1 sz1VarE3 = ((if1) list.get(i)).e(j);
                    iMax = Math.max(iMax, sz1VarE3.h);
                    iMax2 = Math.max(iMax2, sz1VarE3.i);
                    arrayList2.add(sz1VarE3);
                    i++;
                }
                return pf1Var.j0(iMax, iMax2, ce0Var, new j8(1, arrayList2));
            case 2:
                return pf1Var.j0(fz.j(j), fz.i(j), ce0Var, new w(24));
            case 3:
                return pf1Var.j0(fz.h(j), fz.g(j), ce0Var, f);
            case 4:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size4 = list.size();
                int iMax3 = 0;
                int iMax4 = 0;
                for (int i4 = 0; i4 < size4; i4++) {
                    sz1 sz1VarE4 = ((if1) list.get(i4)).e(j);
                    iMax3 = Math.max(iMax3, sz1VarE4.h);
                    iMax4 = Math.max(iMax4, sz1VarE4.i);
                    arrayList3.add(sz1VarE4);
                }
                return pf1Var.j0(iMax3, iMax4, ce0Var, new xq2(0, arrayList3));
            default:
                return pf1Var.j0(fz.f(j) ? fz.h(j) : 0, fz.e(j) ? fz.g(j) : 0, ce0Var, new w(24));
        }
    }
}

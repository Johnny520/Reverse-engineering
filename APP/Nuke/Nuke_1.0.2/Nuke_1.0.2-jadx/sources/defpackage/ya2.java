package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ya2 extends o61 {
    public static final ya2 c = new ya2("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ int b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ya2(String str, int i) {
        super(str);
        this.b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final of1 g(pf1 pf1Var, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                ce0 ce0Var = ce0.h;
                if (size == 0) {
                    return pf1Var.j0(fz.j(j), fz.i(j), ce0Var, oq0.y);
                }
                if (size == 1) {
                    sz1 sz1VarE = ((if1) list.get(0)).e(j);
                    return pf1Var.j0(gz.g(j, sz1VarE.h), gz.f(j, sz1VarE.i), ce0Var, new n6(sz1VarE, 6));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    sz1 sz1VarE2 = ((if1) list.get(i)).e(j);
                    iMax = Math.max(sz1VarE2.h, iMax);
                    iMax2 = Math.max(sz1VarE2.i, iMax2);
                    arrayList.add(sz1VarE2);
                }
                return pf1Var.j0(gz.g(j, iMax), gz.f(j, iMax2), ce0Var, new j8(3, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}

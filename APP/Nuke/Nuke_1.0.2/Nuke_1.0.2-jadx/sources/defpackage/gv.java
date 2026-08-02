package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gv implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ gv(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                for (in0 in0Var : (in0[]) obj3) {
                    int iO = gf1.o((Comparable) in0Var.j(obj), (Comparable) in0Var.j(obj2));
                    if (iO != 0) {
                        return iO;
                    }
                }
                return 0;
            default:
                return ((Number) ((mn0) obj3).g(obj, obj2)).intValue();
        }
    }
}

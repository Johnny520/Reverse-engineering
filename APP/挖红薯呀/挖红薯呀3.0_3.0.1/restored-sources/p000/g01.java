package p000;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class g01 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1838a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Comparator f1839b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g01(g01 g01Var) {
        this.f1839b = g01Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f1838a;
        Comparator comparator = this.f1839b;
        switch (i) {
            case 0:
                int iCompare = comparator.compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                return b60.f386U.compare(((xz0) obj).f7470c, ((xz0) obj2).f7470c);
            default:
                int iCompare2 = ((g01) comparator).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : pf1.m3056p(Integer.valueOf(((xz0) obj).f7474g), Integer.valueOf(((xz0) obj2).f7474g));
        }
    }

    public g01(Comparator comparator) {
        this.f1839b = comparator;
    }
}

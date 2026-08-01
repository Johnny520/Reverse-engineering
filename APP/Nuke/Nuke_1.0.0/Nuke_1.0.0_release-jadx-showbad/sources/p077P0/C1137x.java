package p077P0;

import java.util.Comparator;
import p041H0.C0564I;
import p049I2.AbstractC0797o;

/* JADX INFO: renamed from: P0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1137x implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3770a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Comparator f3771b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1137x(C1137x c1137x) {
        this.f3771b = c1137x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3770a) {
            case 0:
                int iCompare = this.f3771b.compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                return C0564I.f1689X.compare(((C1128o) obj).f3710c, ((C1128o) obj2).f3710c);
            default:
                int iCompare2 = ((C1137x) this.f3771b).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : AbstractC0797o.m1386k(Integer.valueOf(((C1128o) obj).f3714g), Integer.valueOf(((C1128o) obj2).f3714g));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1137x(Comparator comparator) {
        this.f3771b = comparator;
    }
}

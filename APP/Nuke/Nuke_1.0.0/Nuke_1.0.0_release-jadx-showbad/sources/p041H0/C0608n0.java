package p041H0;

import java.util.Comparator;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: H0.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0608n0 implements Comparator {

    /* JADX INFO: renamed from: b */
    public static final C0608n0 f1956b = new C0608n0(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1957a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [H0.k.<clinit>():void, H0.n0.<clinit>():void] */
    public /* synthetic */ C0608n0(int i5) {
        this.f1957a = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1957a) {
            case 0:
                C0564I c0564i = (C0564I) obj;
                C0564I c0564i2 = (C0564I) obj2;
                int iM2987g = AbstractC1665j.m2987g(c0564i2.f1727t, c0564i.f1727t);
                return iM2987g != 0 ? iM2987g : AbstractC1665j.m2987g(c0564i.hashCode(), c0564i2.hashCode());
            default:
                C0564I c0564i3 = (C0564I) obj;
                C0564I c0564i4 = (C0564I) obj2;
                int iM2987g2 = AbstractC1665j.m2987g(c0564i3.f1727t, c0564i4.f1727t);
                return iM2987g2 != 0 ? iM2987g2 : AbstractC1665j.m2987g(c0564i3.hashCode(), c0564i4.hashCode());
        }
    }
}

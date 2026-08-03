package p339x1;

import gg.AbstractC1416l;
import java.util.Comparator;

/* JADX INFO: renamed from: x1.o1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5632o1 implements Comparator {

    /* JADX INFO: renamed from: h */
    public static final C5632o1 f22938h = new C5632o1(0);

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22939g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [x1.k.<clinit>():void, x1.o1.<clinit>():void] */
    public /* synthetic */ C5632o1(int i9) {
        this.f22939g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f22939g) {
            case 0:
                C5602f0 c5602f0 = (C5602f0) obj;
                C5602f0 c5602f02 = (C5602f0) obj2;
                int iM3827c = AbstractC1416l.m3827c(c5602f02.f22805v, c5602f0.f22805v);
                return iM3827c != 0 ? iM3827c : AbstractC1416l.m3827c(c5602f0.hashCode(), c5602f02.hashCode());
            default:
                C5602f0 c5602f03 = (C5602f0) obj;
                C5602f0 c5602f04 = (C5602f0) obj2;
                int iM3827c2 = AbstractC1416l.m3827c(c5602f03.f22805v, c5602f04.f22805v);
                return iM3827c2 != 0 ? iM3827c2 : AbstractC1416l.m3827c(c5602f03.hashCode(), c5602f04.hashCode());
        }
    }
}

package p046d6;

import java.util.Comparator;

/* JADX INFO: renamed from: d6.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0708e implements Comparator {

    /* JADX INFO: renamed from: h */
    public static final C0708e f2126h = new C0708e(0);

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2127g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [d6.e.<clinit>():void] */
    public /* synthetic */ C0708e(int i9) {
        this.f2127g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2127g) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                C0712i c0712i = (C0712i) obj;
                C0712i c0712i2 = (C0712i) obj2;
                if (c0712i.m1886c() || !c0712i2.m1886c()) {
                    if (c0712i2.m1886c() || !c0712i.m1886c()) {
                        int iCompareTo = (c0712i.m1886c() && c0712i2.m1886c()) ? c0712i.f2143a.compareTo(c0712i2.f2143a) : 0;
                        if (iCompareTo != 0) {
                            return iCompareTo;
                        }
                        if (c0712i.m1887d() || !c0712i2.m1887d()) {
                            if (c0712i2.m1887d() || !c0712i.m1887d()) {
                                return (c0712i.m1887d() && c0712i2.m1887d()) ? c0712i.f2144b.compareTo(c0712i2.f2144b) : iCompareTo;
                            }
                        }
                    }
                    return 1;
                }
                return -1;
        }
    }
}

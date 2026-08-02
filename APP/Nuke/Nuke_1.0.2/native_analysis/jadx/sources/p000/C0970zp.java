package p000;

/* JADX INFO: renamed from: zp */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0970zp extends kj0 implements Comparable {

    /* JADX INFO: renamed from: j */
    public static final C0970zp f14001j = new C0970zp(0);

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0970zp c0970zp = (C0970zp) obj;
        if (this != c0970zp) {
            int length = this.f5590i.length;
            int length2 = c0970zp.f5590i.length;
            int iMin = Math.min(length, length2);
            for (int i = 0; i < iMin; i++) {
                int iCompareTo = ((C0931yp) m2693e(i)).compareTo((C0931yp) c0970zp.m2693e(i));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            if (length < length2) {
                return -1;
            }
            if (length > length2) {
                return 1;
            }
        }
        return 0;
    }
}

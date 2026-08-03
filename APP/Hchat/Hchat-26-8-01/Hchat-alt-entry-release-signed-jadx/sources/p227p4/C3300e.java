package p227p4;

import p376z4.AbstractC6091e;

/* JADX INFO: renamed from: p4.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3300e extends AbstractC6091e implements Comparable {

    /* JADX INFO: renamed from: i */
    public static final C3300e f10482i = new C3300e(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3300e c3300e = (C3300e) obj;
        if (this != c3300e) {
            int length = this.f24601h.length;
            int length2 = c3300e.f24601h.length;
            int iMin = Math.min(length, length2);
            for (int i9 = 0; i9 < iMin; i9++) {
                int iCompareTo = ((C3299d) m10840l(i9)).compareTo((C3299d) c3300e.m10840l(i9));
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

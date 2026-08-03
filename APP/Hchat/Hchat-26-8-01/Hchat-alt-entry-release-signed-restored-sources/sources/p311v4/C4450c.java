package p311v4;

import p376z4.AbstractC6091e;

/* JADX INFO: renamed from: v4.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4450c extends AbstractC6091e implements Comparable {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C4450c c4450c) {
        int length = this.f24601h.length;
        int length2 = c4450c.f24601h.length;
        int i9 = length < length2 ? length : length2;
        for (int i10 = 0; i10 < i9; i10++) {
            int iCompareTo = ((AbstractC4446a) m10840l(i10)).compareTo((AbstractC4446a) c4450c.m10840l(i10));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (length < length2) {
            return -1;
        }
        return length > length2 ? 1 : 0;
    }
}

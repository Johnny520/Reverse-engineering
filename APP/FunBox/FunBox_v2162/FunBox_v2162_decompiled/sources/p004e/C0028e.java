package p004e;

import p013n.AbstractC0203e;

/* JADX INFO: renamed from: e.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0028e extends AbstractC0203e implements Comparable {

    /* JADX INFO: renamed from: c */
    public static final C0028e f92c = new C0028e(0);

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0028e c0028e = (C0028e) obj;
        if (this == c0028e) {
            return 0;
        }
        int iM504B = m504B();
        int iM504B2 = c0028e.m504B();
        int iMin = Math.min(iM504B, iM504B2);
        for (int i2 = 0; i2 < iMin; i2++) {
            int iCompareTo = m508k(i2).compareTo(c0028e.m508k(i2));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (iM504B < iM504B2) {
            return -1;
        }
        return iM504B > iM504B2 ? 1 : 0;
    }
}

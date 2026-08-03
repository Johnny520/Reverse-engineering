package fun.box001.internal.dexformat.writer.code;

import fun.box001.internal.dexformat.output.AbstractC0203e;

/* JADX INFO: renamed from: k.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0172b extends AbstractC0203e implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0172b c0172b) {
        int iM504B = m504B();
        int iM504B2 = c0172b.m504B();
        int i2 = iM504B < iM504B2 ? iM504B : iM504B2;
        for (int i3 = 0; i3 < i2; i3++) {
            int iCompareTo = ((AbstractC0171a) m516s(i3)).compareTo((AbstractC0171a) c0172b.m516s(i3));
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

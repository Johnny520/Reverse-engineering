package p118X3;

import java.util.Comparator;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: X3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1697g implements Comparator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        AbstractC1665j.m2985e(str, "a");
        AbstractC1665j.m2985e(str2, "b");
        int iMin = Math.min(str.length(), str2.length());
        for (int i5 = 4; i5 < iMin; i5++) {
            char cCharAt = str.charAt(i5);
            char cCharAt2 = str2.charAt(i5);
            if (cCharAt != cCharAt2) {
                return AbstractC1665j.m2987g(cCharAt, cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}

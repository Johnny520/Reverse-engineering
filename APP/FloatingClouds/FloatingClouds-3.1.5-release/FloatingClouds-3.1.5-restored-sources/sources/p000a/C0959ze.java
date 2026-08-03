package p000a;

/* JADX INFO: renamed from: a.ze */
/* JADX INFO: loaded from: classes.dex */
public class C0959ze extends C0940ye {
    /* JADX INFO: renamed from: C */
    public static Integer m2248C(String str) {
        boolean z;
        int i;
        C0631i9.m1482e(str, "<this>");
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        int i3 = 1;
        int i4 = -2147483647;
        if ((cCharAt < '0' ? (byte) -1 : cCharAt == '0' ? (byte) 0 : (byte) 1) >= 0) {
            z = false;
            i3 = 0;
        } else {
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i4 = Integer.MIN_VALUE;
                z = true;
            }
        }
        int i5 = -59652323;
        while (i3 < length) {
            int iDigit = Character.digit((int) str.charAt(i3), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i2 < i5 && (i5 != -59652323 || i2 < (i5 = i4 / 10))) || (i = i2 * 10) < i4 + iDigit) {
                return null;
            }
            i2 = i - iDigit;
            i3++;
        }
        return z ? Integer.valueOf(i2) : Integer.valueOf(-i2);
    }
}

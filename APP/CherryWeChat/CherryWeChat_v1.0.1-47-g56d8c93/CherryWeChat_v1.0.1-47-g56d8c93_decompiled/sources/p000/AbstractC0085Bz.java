package p000;

/* JADX INFO: renamed from: Bz */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0085Bz extends AbstractC0042Az {
    /* JADX INFO: renamed from: J */
    public static boolean m132J(String str, boolean z, String str2) {
        return !z ? str.endsWith(str2) : str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    /* JADX INFO: renamed from: K */
    public static String m133K(String str, String str2, String str3) {
        int iM5054O = AbstractC2564tz.m5054O(str, str2, 0, false);
        if (iM5054O < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iM5054O);
            sb.append(str3);
            i2 = iM5054O + length;
            if (iM5054O >= str.length()) {
                break;
            }
            iM5054O = AbstractC2564tz.m5054O(str, str2, iM5054O + i, false);
        } while (iM5054O > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }
}

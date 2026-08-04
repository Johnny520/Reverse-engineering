package yyds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: yyds.ᛲᲇᛸᲇ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0473 extends AbstractC0692 {
    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public static int m1290(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return !(charSequence instanceof String) ? m1312(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public static final boolean m1291(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!AbstractC1741.m3465(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᲀᲈᛲ, reason: contains not printable characters */
    public static String m1292(int i, String str) {
        if (i < 0) {
            C1693.m3439("Requested character count ", i, " is less than zero.");
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public static String m1293(String str) {
        CharSequence charSequenceSubSequence;
        if (8 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(8);
            int length = 8 - str.length();
            int i = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public static final int m1294(CharSequence charSequence, String str, int i, boolean z) {
        return (z || !(charSequence instanceof String)) ? m1308(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public static boolean m1295(CharSequence charSequence, char c) {
        return m1290(charSequence, c, 0, 2) >= 0;
    }

    /* JADX INFO: renamed from: ᛲᲀᛲᛲ, reason: contains not printable characters */
    public static List m1296(String str, String[] strArr, int i) {
        int i2 = (i & 4) != 0 ? 0 : 2;
        int i3 = 1;
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return m1297(str, str2, i2);
            }
        }
        m1305(i2);
        C0409 c0409 = new C0409(i3, new C1406(str, i2, new C1565(3, Arrays.asList(strArr))));
        ArrayList arrayList = new ArrayList(AbstractC0055.m419(c0409, 10));
        Iterator it = c0409.iterator();
        while (true) {
            C0533 c0533 = (C0533) it;
            if (!c0533.hasNext()) {
                return arrayList;
            }
            C2807 c2807 = (C2807) c0533.next();
            arrayList.add(str.subSequence(c2807.f12492, c2807.f12493 + 1).toString());
        }
    }

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public static final List m1297(CharSequence charSequence, String str, int i) {
        m1305(i);
        int iM1294 = m1294(charSequence, str, 0, false);
        if (iM1294 == -1 || i == 1) {
            return Collections.singletonList(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iM1294).toString());
            length = str.length() + iM1294;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iM1294 = m1294(charSequence, str, length, false);
        } while (iM1294 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛳᛷᛶᛲ, reason: contains not printable characters */
    public static String m1298(String str, char... cArr) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM3944 = AbstractC2070.m3944(cArr, str.charAt(!z ? i : length));
            if (z) {
                if (!zM3944) {
                    break;
                }
                length--;
            } else if (zM3944) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    /* JADX INFO: renamed from: ᛴᛸᛴᛸ, reason: contains not printable characters */
    public static String m1299(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!AbstractC2070.m3944(cArr, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public static int m1300(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public static boolean m1301(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence2 instanceof String) {
            if (m1311(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (m1308(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛵᲈᲇᛵ, reason: contains not printable characters */
    public static CharSequence m1302(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!AbstractC1741.m3478(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: ᛶᛴᛱᛲ, reason: contains not printable characters */
    public static String m1303(String str, char c) {
        int iM1307 = m1307(str, c, 0, 6);
        return iM1307 == -1 ? str : str.substring(iM1307 + 1, str.length());
    }

    /* JADX INFO: renamed from: ᛶᛵᛸᛲ, reason: contains not printable characters */
    public static String m1304(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (!AbstractC2070.m3944(cArr, str.charAt(i))) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                break;
            }
            i++;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public static final void m1305(int i) {
        if (i >= 0) {
            return;
        }
        C0188.m806(AbstractC0897.m1989(i, "Limit must be non-negative, but was "));
    }

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    public static List m1306(CharSequence charSequence, char[] cArr) {
        int i = 1;
        if (cArr.length == 1) {
            return m1297(charSequence, String.valueOf(cArr[0]), 0);
        }
        m1305(0);
        C0409 c0409 = new C0409(i, new C1406(charSequence, 0, new C1565(2, cArr)));
        ArrayList arrayList = new ArrayList(AbstractC0055.m419(c0409, 10));
        Iterator it = c0409.iterator();
        while (true) {
            C0533 c0533 = (C0533) it;
            if (!c0533.hasNext()) {
                return arrayList;
            }
            C2807 c2807 = (C2807) c0533.next();
            arrayList.add(charSequence.subSequence(c2807.f12492, c2807.f12493 + 1).toString());
        }
    }

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public static int m1307(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = m1300(str);
        }
        return str.lastIndexOf(c, i);
    }

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public static final int m1308(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C2536 c2536;
        CharSequence charSequence3 = charSequence2;
        int i3 = i;
        int i4 = i2;
        if (z2) {
            int iM1300 = m1300(charSequence);
            if (i3 > iM1300) {
                i3 = iM1300;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            c2536 = new C2536(i3, i4, -1);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            c2536 = new C2807(i3, i4, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i5 = c2536.f12491;
        int i6 = c2536.f12493;
        int i7 = c2536.f12492;
        if (z3 && (charSequence3 instanceof String)) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                int i8 = i7;
                while (true) {
                    String str = (String) charSequence3;
                    String str2 = (String) charSequence;
                    int length2 = str.length();
                    if (!(!z ? str.regionMatches(0, str2, i8, length2) : str.regionMatches(z, 0, str2, i8, length2))) {
                        if (i8 == i6) {
                            break;
                        }
                        i8 += i5;
                    } else {
                        return i8;
                    }
                }
            }
        } else if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            int i9 = i7;
            while (!m1291(charSequence3, 0, charSequence, i9, charSequence3.length(), z)) {
                if (i9 != i6) {
                    i9 += i5;
                    charSequence3 = charSequence2;
                }
            }
            return i9;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public static int m1309(String str, int i, String str2) {
        return str.lastIndexOf(str2, (i & 2) != 0 ? m1300(str) : 0);
    }

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public static String m1310(String str, String str2) {
        return str.startsWith(str2) ? str.substring(str2.length()) : str;
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public static /* synthetic */ int m1311(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m1294(charSequence, str, i, z);
    }

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public static final int m1312(CharSequence charSequence, char[] cArr, int i, boolean z) {
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length == 1) {
                return ((String) charSequence).indexOf(cArr[0], i);
            }
            C0188.m798("Array has more than one element.");
            return 0;
        }
        if (i < 0) {
            i = 0;
        }
        int iM1300 = m1300(charSequence);
        if (i > iM1300) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (AbstractC1741.m3465(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iM1300) {
                return -1;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public static boolean m1313(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (!AbstractC1741.m3478(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᲁᛵᲁᲁ, reason: contains not printable characters */
    public static CharSequence m1314(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM3478 = AbstractC1741.m3478(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zM3478) {
                    break;
                }
                length--;
            } else if (zM3478) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public static String m1315(String str, String str2) {
        return m1317(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public static List m1316(CharSequence charSequence) {
        C0648 c0648 = new C0648(charSequence);
        if (!c0648.hasNext()) {
            return C1860.f9345;
        }
        Object next = c0648.next();
        if (!c0648.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (c0648.hasNext()) {
            arrayList.add(c0648.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public static boolean m1317(CharSequence charSequence, String str) {
        return charSequence instanceof String ? AbstractC0692.m1600((String) charSequence, str, false) : m1291(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }
}

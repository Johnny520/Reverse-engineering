package kotlin.text;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.layout.C0640;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4345;
import kotlin.collections.AbstractC4347;
import kotlin.collections.C4342;
import kotlin.collections.EmptyList;
import p009.AbstractC6183;
import p034.AbstractC6347;
import p048.C6512;
import p048.C6519;
import p175.AbstractC7739;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5144 extends AbstractC5139 {
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public static String m10141(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int iM10170 = m10170(str, str2, 0, false, 6);
        return iM10170 == -1 ? str3 : str.substring(str2.length() + iM10170, str.length());
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public static String m10142(String str, char c) {
        str.getClass();
        str.getClass();
        int iM10165 = m10165(str, c, 0, 6);
        return iM10165 == -1 ? str : str.substring(iM10165 + 1, str.length());
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public static boolean m10143(CharSequence charSequence, String str, boolean z) {
        charSequence.getClass();
        return (z || !(charSequence instanceof String)) ? m10148(charSequence, 0, str, 0, str.length(), z) : AbstractC5139.m10139((String) charSequence, str, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public static List m10144(CharSequence charSequence, String[] strArr, int i) {
        int i2 = 2;
        int i3 = (i & 4) != 0 ? 0 : 2;
        charSequence.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return m10149(i3, charSequence, str);
            }
        }
        C5130 c5130M10166 = m10166(charSequence, strArr, i3);
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(new C4342(c5130M10166, i2), 10));
        Iterator it = c5130M10166.iterator();
        while (it.hasNext()) {
            arrayList.add(m10145(charSequence, (C6519) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public static final String m10145(CharSequence charSequence, C6519 c6519) {
        charSequence.getClass();
        c6519.getClass();
        return charSequence.subSequence(c6519.f17818, c6519.f17816 + 1).toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public static boolean m10146(String str, char c) {
        str.getClass();
        return str.length() > 0 && AbstractC7739.m13078(str.charAt(0), c, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public static String m10147(String str, String str2) {
        str.getClass();
        return m10143(str, str2, false) ? str.substring(str2.length()) : str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public static final boolean m10148(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!AbstractC7739.m13078(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public static final List m10149(int i, CharSequence charSequence, String str) {
        m10152(i);
        int iM10174 = m10174(charSequence, str, 0, false);
        if (iM10174 == -1 || i == 1) {
            return AbstractC6347.m11928(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iM10174).toString());
            length = str.length() + iM10174;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iM10174 = m10174(charSequence, str, length, false);
        } while (iM10174 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public static List m10150(CharSequence charSequence, char[] cArr) {
        charSequence.getClass();
        if (cArr.length == 1) {
            return m10149(0, charSequence, String.valueOf(cArr[0]));
        }
        m10152(0);
        C5130 c5130 = new C5130(charSequence, 0, new C0640(cArr, 7));
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(new C4342(c5130, 2), 10));
        Iterator it = c5130.iterator();
        while (it.hasNext()) {
            arrayList.add(m10145(charSequence, (C6519) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public static String m10151(String str, String str2) {
        return m10160(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public static final void m10152(int i) {
        if (i >= 0) {
            return;
        }
        C5925.m11314(AbstractC6183.m11588(i, "Limit must be non-negative, but was "));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public static String m10153(int i, String str) {
        str.getClass();
        if (i < 0) {
            C5925.m11314(AbstractC0053.m162(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public static String m10154(String str, String str2) {
        str.getClass();
        str.getClass();
        int iM10170 = m10170(str, str2, 0, false, 6);
        return iM10170 == -1 ? str : str.substring(0, iM10170);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public static CharSequence m10155(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM13064 = AbstractC7739.m13064(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zM13064) {
                    break;
                }
                length--;
            } else if (zM13064) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public static String m10156(String str, String str2) {
        str.getClass();
        str.getClass();
        int iM10169 = m10169(0, 6, str, str2);
        return iM10169 == -1 ? str : str.substring(str2.length() + iM10169, str.length());
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public static String m10157(String str, char c) {
        str.getClass();
        str.getClass();
        int iM10171 = m10171(str, c, 0, 6);
        return iM10171 == -1 ? str : str.substring(0, iM10171);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public static int m10158(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public static boolean m10159(String str, char c) {
        return str.length() > 0 && AbstractC7739.m13078(str.charAt(str.length() - 1), c, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public static boolean m10160(CharSequence charSequence, String str) {
        return charSequence instanceof String ? ((String) charSequence).endsWith(str) : m10148(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public static String m10161(int i, String str) {
        str.getClass();
        if (i < 0) {
            C5925.m11314(AbstractC0053.m162(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length() - i;
        if (length < 0) {
            length = 0;
        }
        return m10153(length, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static String m10162(int i, String str) {
        str.getClass();
        if (i < 0) {
            C5925.m11314(AbstractC0053.m162(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static boolean m10163(CharSequence charSequence, char c) {
        charSequence.getClass();
        return m10171(charSequence, c, 0, 2) >= 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public static final List m10164(String str) {
        C5147 c5147 = new C5147(str);
        if (!c5147.hasNext()) {
            return EmptyList.INSTANCE;
        }
        Object next = c5147.next();
        if (!c5147.hasNext()) {
            return AbstractC6347.m11928(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (c5147.hasNext()) {
            arrayList.add(c5147.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public static int m10165(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = m10158(str);
        }
        str.getClass();
        return str.lastIndexOf(c, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public static C5130 m10166(CharSequence charSequence, String[] strArr, int i) {
        m10152(i);
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        return new C5130(charSequence, i, new C0640(listAsList, 8));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public static String m10167(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            C5925.m11310(AbstractC0053.m162(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static char m10168(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        C4211.m8617("Char sequence is empty.");
        return (char) 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static int m10169(int i, int i2, String str, String str2) {
        if ((i2 & 2) != 0) {
            i = m10158(str);
        }
        str.getClass();
        str2.getClass();
        return str.lastIndexOf(str2, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public static /* synthetic */ int m10170(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m10174(charSequence, str, i, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public static int m10171(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? m10173(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public static boolean m10172(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!AbstractC7739.m13064(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public static final int m10173(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC4347.m8850(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (AbstractC7739.m13078(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public static final int m10174(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? m10175(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public static final int m10175(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C6512 c6512;
        if (z2) {
            int iM10158 = m10158(charSequence);
            if (i > iM10158) {
                i = iM10158;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            c6512 = new C6512(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            c6512 = new C6519(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = c6512.f17817;
        int i4 = c6512.f17816;
        int i5 = c6512.f17818;
        if (!z3 || !(charSequence2 instanceof String)) {
            boolean z4 = z;
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z5 = z4;
                    z4 = z5;
                    if (!m10148(charSequence4, 0, charSequence3, i5, charSequence2.length(), z5)) {
                        if (i5 == i4) {
                            break;
                        }
                        i5 += i3;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return i5;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z6 = z;
                if (!AbstractC5139.m10132(0, i6, str.length(), str, (String) charSequence, z6)) {
                    if (i6 == i4) {
                        break;
                    }
                    i6 += i3;
                    z = z6;
                } else {
                    return i6;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static boolean m10176(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (m10170(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (m10175(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }
}

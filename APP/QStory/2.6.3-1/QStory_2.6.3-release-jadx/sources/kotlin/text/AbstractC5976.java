package kotlin.text;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.layout.C1481;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.collections.C5174;
import kotlin.collections.EmptyList;
import p025.AbstractC7012;
import p050.AbstractC7176;
import p064.C7341;
import p064.C7348;
import p191.AbstractC8568;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5976 extends AbstractC5971 {
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public static String m10700(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int iM10729 = m10729(str, str2, 0, false, 6);
        return iM10729 == -1 ? str3 : str.substring(str2.length() + iM10729, str.length());
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public static String m10701(String str, char c) {
        str.getClass();
        str.getClass();
        int iM10724 = m10724(str, c, 0, 6);
        return iM10724 == -1 ? str : str.substring(iM10724 + 1, str.length());
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public static boolean m10702(CharSequence charSequence, String str, boolean z) {
        charSequence.getClass();
        return (z || !(charSequence instanceof String)) ? m10707(charSequence, 0, str, 0, str.length(), z) : AbstractC5971.m10698((String) charSequence, str, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public static List m10703(CharSequence charSequence, String[] strArr, int i) {
        int i2 = 2;
        int i3 = (i & 4) != 0 ? 0 : 2;
        charSequence.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return m10708(i3, charSequence, str);
            }
        }
        C5962 c5962M10725 = m10725(charSequence, strArr, i3);
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(new C5174(c5962M10725, i2), 10));
        Iterator it = c5962M10725.iterator();
        while (it.hasNext()) {
            arrayList.add(m10704(charSequence, (C7348) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public static final String m10704(CharSequence charSequence, C7348 c7348) {
        charSequence.getClass();
        c7348.getClass();
        return charSequence.subSequence(c7348.f18163, c7348.f18161 + 1).toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public static boolean m10705(String str, char c) {
        str.getClass();
        return str.length() > 0 && AbstractC8568.m13637(str.charAt(0), c, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public static String m10706(String str, String str2) {
        str.getClass();
        return m10702(str, str2, false) ? str.substring(str2.length()) : str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public static final boolean m10707(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!AbstractC8568.m13637(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public static final List m10708(int i, CharSequence charSequence, String str) {
        m10711(i);
        int iM10733 = m10733(charSequence, str, 0, false);
        if (iM10733 == -1 || i == 1) {
            return AbstractC7176.m12487(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iM10733).toString());
            length = str.length() + iM10733;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iM10733 = m10733(charSequence, str, length, false);
        } while (iM10733 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public static List m10709(CharSequence charSequence, char[] cArr) {
        charSequence.getClass();
        if (cArr.length == 1) {
            return m10708(0, charSequence, String.valueOf(cArr[0]));
        }
        m10711(0);
        C5962 c5962 = new C5962(charSequence, 0, new C1481(cArr, 7));
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(new C5174(c5962, 2), 10));
        Iterator it = c5962.iterator();
        while (it.hasNext()) {
            arrayList.add(m10704(charSequence, (C7348) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public static String m10710(String str, String str2) {
        return m10719(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public static final void m10711(int i) {
        if (i >= 0) {
            return;
        }
        C6755.m11873(AbstractC7012.m12147(i, "Limit must be non-negative, but was "));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public static String m10712(int i, String str) {
        str.getClass();
        if (i < 0) {
            C6755.m11873(AbstractC0900.m722(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public static String m10713(String str, String str2) {
        str.getClass();
        str.getClass();
        int iM10729 = m10729(str, str2, 0, false, 6);
        return iM10729 == -1 ? str : str.substring(0, iM10729);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public static CharSequence m10714(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM13623 = AbstractC8568.m13623(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zM13623) {
                    break;
                }
                length--;
            } else if (zM13623) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public static String m10715(String str, String str2) {
        str.getClass();
        str.getClass();
        int iM10728 = m10728(0, 6, str, str2);
        return iM10728 == -1 ? str : str.substring(str2.length() + iM10728, str.length());
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public static String m10716(String str, char c) {
        str.getClass();
        str.getClass();
        int iM10730 = m10730(str, c, 0, 6);
        return iM10730 == -1 ? str : str.substring(0, iM10730);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public static int m10717(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public static boolean m10718(String str, char c) {
        return str.length() > 0 && AbstractC8568.m13637(str.charAt(str.length() - 1), c, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public static boolean m10719(CharSequence charSequence, String str) {
        return charSequence instanceof String ? ((String) charSequence).endsWith(str) : m10707(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public static String m10720(int i, String str) {
        str.getClass();
        if (i < 0) {
            C6755.m11873(AbstractC0900.m722(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length() - i;
        if (length < 0) {
            length = 0;
        }
        return m10712(length, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static String m10721(int i, String str) {
        str.getClass();
        if (i < 0) {
            C6755.m11873(AbstractC0900.m722(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static boolean m10722(CharSequence charSequence, char c) {
        charSequence.getClass();
        return m10730(charSequence, c, 0, 2) >= 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public static final List m10723(String str) {
        C5979 c5979 = new C5979(str);
        if (!c5979.hasNext()) {
            return EmptyList.INSTANCE;
        }
        Object next = c5979.next();
        if (!c5979.hasNext()) {
            return AbstractC7176.m12487(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (c5979.hasNext()) {
            arrayList.add(c5979.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public static int m10724(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = m10717(str);
        }
        str.getClass();
        return str.lastIndexOf(c, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public static C5962 m10725(CharSequence charSequence, String[] strArr, int i) {
        m10711(i);
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        return new C5962(charSequence, i, new C1481(listAsList, 8));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public static String m10726(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            C6755.m11869(AbstractC0900.m722(i, "Desired length ", " is less than zero."));
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
    public static char m10727(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        C5043.m9176("Char sequence is empty.");
        return (char) 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static int m10728(int i, int i2, String str, String str2) {
        if ((i2 & 2) != 0) {
            i = m10717(str);
        }
        str.getClass();
        str2.getClass();
        return str.lastIndexOf(str2, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public static /* synthetic */ int m10729(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m10733(charSequence, str, i, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public static int m10730(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? m10732(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public static boolean m10731(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!AbstractC8568.m13623(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public static final int m10732(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC5179.m9409(cArr), i);
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
                if (AbstractC8568.m13637(c, cCharAt, z)) {
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
    public static final int m10733(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? m10734(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public static final int m10734(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C7341 c7341;
        if (z2) {
            int iM10717 = m10717(charSequence);
            if (i > iM10717) {
                i = iM10717;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            c7341 = new C7341(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            c7341 = new C7348(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = c7341.f18162;
        int i4 = c7341.f18161;
        int i5 = c7341.f18163;
        if (!z3 || !(charSequence2 instanceof String)) {
            boolean z4 = z;
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z5 = z4;
                    z4 = z5;
                    if (!m10707(charSequence4, 0, charSequence3, i5, charSequence2.length(), z5)) {
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
                if (!AbstractC5971.m10691(0, i6, str.length(), str, (String) charSequence, z6)) {
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
    public static boolean m10735(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (m10729(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (m10734(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }
}

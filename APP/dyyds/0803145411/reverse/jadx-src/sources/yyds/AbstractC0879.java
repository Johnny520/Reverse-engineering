package yyds;

import android.app.Activity;
import android.content.Context;
import android.os.Trace;
import android.view.LayoutInflater;
import java.io.EOFException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛴᛶᲀᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0879 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final String[] f3999 = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final char[] f4000 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static WeakReference f4001;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static boolean m1958(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        if (str.hashCode() == str2.hashCode()) {
            return true;
        }
        int length = str.length();
        if (length != str2.length()) {
            return false;
        }
        for (int i = length - 1; i >= 0; i--) {
            if (str.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static boolean m1959(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        if (str.hashCode() == str2.hashCode()) {
            return true;
        }
        int length = str.length();
        if (length != str2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static InterfaceC2213 m1960(InterfaceC2213 interfaceC2213, InterfaceC2213 interfaceC22132) {
        return interfaceC22132 == C2586.f12764 ? interfaceC2213 : (InterfaceC2213) interfaceC22132.mo424(interfaceC2213, new C1936(4));
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static LayoutInflater m1961(Context context) {
        Context contextM3376 = AbstractC1655.m3376();
        if (contextM3376 != null) {
            context = contextM3376;
        }
        return AbstractC1115.m2309(context);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static boolean m1962(String str, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (m1958(((AbstractC0333) it.next()).mo1021(), str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static ArrayList m1963(Object... objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        if (objArr.length != 0) {
            for (Object obj : objArr) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final Object m1964(InterfaceC1659[] interfaceC1659Arr, C1408 c1408) {
        if (interfaceC1659Arr.length == 0) {
            return C1860.f9345;
        }
        C1571 c1571 = new C1571(interfaceC1659Arr);
        C1853 c1853 = new C1853(1, AbstractC1367.m2783(c1408));
        c1853.m3625();
        int length = interfaceC1659Arr.length;
        C0292[] c0292Arr = new C0292[length];
        for (int i = 0; i < length; i++) {
            InterfaceC1659 interfaceC1659 = interfaceC1659Arr[i];
            ((AbstractC0986) interfaceC1659).start();
            C0292 c0292 = new C0292(c1571, c1853);
            c0292.f1555 = AbstractC0024.m3302(interfaceC1659, true, c0292);
            c0292Arr[i] = c0292;
        }
        C1218 c1218 = new C1218(c0292Arr);
        for (int i2 = 0; i2 < length; i2++) {
            C0292 c02922 = c0292Arr[i2];
            c02922.getClass();
            AbstractC2112.f10448.putObjectVolatile(c02922, C0292.f1554, c1218);
        }
        if (c1853.m3628() instanceof InterfaceC0576) {
            c1853.m3636(c1218);
        } else {
            c1218.m2477();
        }
        return c1853.m3629();
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final C0468 m1965(Enum[] enumArr) {
        return new C0468(enumArr);
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final boolean m1966(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && AbstractC1429.m2920(str.charAt(i + 1)) != -1 && AbstractC1429.m2920(str.charAt(i3)) != -1;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static String m1967(int i, int i2, int i3, String str) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                C1507 c1507 = new C1507();
                c1507.m3026(str, i, iCharCount);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iM2920 = AbstractC1429.m2920(str.charAt(iCharCount + 1));
                        int iM29202 = AbstractC1429.m2920(str.charAt(i4));
                        if (iM2920 == -1 || iM29202 == -1) {
                            c1507.m3017(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            c1507.m3036((iM2920 << 4) + iM29202);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        c1507.m3036(32);
                        iCharCount++;
                    } else {
                        c1507.m3017(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return c1507.m3035();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static boolean m1968(Activity activity) {
        return activity == null || activity.isDestroyed() || activity.isFinishing();
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static void m1969(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static boolean m1970(ArrayList arrayList, AbstractC0333 abstractC0333) {
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (m1958(abstractC0333.mo1021(), ((AbstractC0333) it.next()).mo1021())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static String m1971(int i, int i2, int i3, String str, String str2) throws EOFException {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = 32;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || AbstractC0473.m1295(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z || (z2 && !m1966(str, iCharCount, length)))) || (iCodePointAt == 43 && z3)))) {
                C1507 c1507 = new C1507();
                c1507.m3026(str, i4, iCharCount);
                C1507 c15072 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == i5 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            c1507.m3019("+");
                        } else if (iCodePointAt2 == 43 && z3) {
                            c1507.m3019(z ? "+" : "%2B");
                        } else {
                            if (iCodePointAt2 >= i5 && iCodePointAt2 != 127) {
                                if ((iCodePointAt2 < 128 || z4) && !AbstractC0473.m1295(str2, (char) iCodePointAt2) && (iCodePointAt2 != 37 || (z && (!z2 || m1966(str, iCharCount, length))))) {
                                    c1507.m3017(iCodePointAt2);
                                }
                            }
                            if (c15072 == null) {
                                c15072 = new C1507();
                            }
                            c15072.m3017(iCodePointAt2);
                            while (!c15072.m3021()) {
                                byte bM3033 = c15072.m3033();
                                c1507.m3036(37);
                                char[] cArr = f4000;
                                c1507.m3036(cArr[((bM3033 & 255) >> 4) & 15]);
                                c1507.m3036(cArr[bM3033 & 15]);
                            }
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 32;
                }
                return c1507.m3035();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i4, length);
    }
}

package yyds;

import android.widget.EditText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛴᛷᛷᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0897 {
    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static String m1986(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static String m1987(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static String m1988(StringBuilder sb, String str, long j) {
        sb.append(str);
        sb.append(AbstractC2328.m4341(j));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static String m1989(int i, String str) {
        return str + i;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static /* synthetic */ char m1990(int i) {
        switch (i) {
            case 1:
                return 'd';
            case 2:
                return 'i';
            case 3:
                return 'x';
            case 4:
                return 'm';
            case 5:
                return 's';
            case 6:
                return 'u';
            case 7:
                return 'U';
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static Number m1991(int i, C1942 c1942) {
        if (i == 1) {
            return Double.valueOf(c1942.m3762());
        }
        if (i == 2) {
            return new C0234(c1942.m3745());
        }
        if (i == 3) {
            String strM3745 = c1942.m3745();
            if (strM3745.indexOf(46) >= 0) {
                return m1995(strM3745, c1942);
            }
            try {
                return Long.valueOf(Long.parseLong(strM3745));
            } catch (NumberFormatException unused) {
                return m1995(strM3745, c1942);
            }
        }
        String strM37452 = c1942.m3745();
        try {
            return AbstractC0578.m1448(strM37452);
        } catch (NumberFormatException e) {
            StringBuilder sbM3998 = AbstractC2104.m3998("Cannot parse ", strM37452, "; at path ");
            sbM3998.append(c1942.m3749(true));
            throw new C1738(sbM3998.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public static /* synthetic */ String m1992(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static Map m1993() {
        return Collections.synchronizedMap(new WeakHashMap());
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static void m1994(StringBuilder sb, long j, long j2) {
        sb.append(j);
        sb.append(AbstractC2328.m4341(j2));
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static Double m1995(String str, C1942 c1942) throws C0838 {
        try {
            Double dValueOf = Double.valueOf(str);
            if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                if (c1942.f9769 != 1) {
                    throw new C0838("JSON forbids NaN and infinities: " + dValueOf + "; at path " + c1942.m3749(true));
                }
            }
            return dValueOf;
        } catch (NumberFormatException e) {
            StringBuilder sbM3998 = AbstractC2104.m3998("Cannot parse ", str, "; at path ");
            sbM3998.append(c1942.m3749(true));
            throw new C1738(sbM3998.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static /* synthetic */ void m1996(Object obj) {
        if (obj == null) {
            return;
        }
        C0188.m794();
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static int m1997(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public static /* synthetic */ String m1998(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "WRITE_AHEAD_LOGGING" : "TRUNCATE" : "AUTOMATIC";
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static String m1999(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static String m2000(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static String m2001(EditText editText) {
        return AbstractC0473.m1314(editText.getText().toString()).toString();
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static void m2002(StringBuilder sb, String str, long j) {
        sb.append(str);
        sb.append(AbstractC2328.m4341(j));
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static int m2003(char[] cArr) {
        int iM2006;
        int i = 0;
        for (char c : cArr) {
            int[] iArrM4003 = AbstractC2104.m4003(7);
            int length = iArrM4003.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    iM2006 = 0;
                    break;
                }
                int i3 = iArrM4003[i2];
                if (m1990(i3) == c) {
                    iM2006 = m2006(i3);
                    break;
                }
                i2++;
            }
            i |= iM2006;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static void m2004(long j, Object obj, ArrayList arrayList, String str) {
        C1988.m3852(arrayList, str, C1988.m3862(obj, AbstractC2328.m4341(j)));
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2005(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static /* synthetic */ int m2006(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 8;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 256;
            default:
                throw null;
        }
    }
}

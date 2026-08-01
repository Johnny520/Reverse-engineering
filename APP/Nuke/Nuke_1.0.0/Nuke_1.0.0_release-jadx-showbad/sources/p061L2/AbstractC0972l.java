package p061L2;

import com.bumptech.glide.AbstractC1926h;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: L2.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0972l extends AbstractC1926h {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static List m1987K(Object[] objArr) {
        AbstractC1665j.m2985e(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        AbstractC1665j.m2984d(listAsList, "asList(...)");
        return listAsList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static boolean m1988L(Object[] objArr, Object obj) {
        return m2004b0(objArr, obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static void m1989M(int i5, int i6, int i7, byte[] bArr, byte[] bArr2) {
        AbstractC1665j.m2985e(bArr, "<this>");
        AbstractC1665j.m2985e(bArr2, "destination");
        System.arraycopy(bArr, i6, bArr2, i5, i7 - i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static void m1990N(char[] cArr, char[] cArr2, int i5, int i6, int i7) {
        AbstractC1665j.m2985e(cArr, "<this>");
        System.arraycopy(cArr, i6, cArr2, i5, i7 - i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static void m1991O(int[] iArr, int[] iArr2, int i5, int i6, int i7) {
        AbstractC1665j.m2985e(iArr, "<this>");
        AbstractC1665j.m2985e(iArr2, "destination");
        System.arraycopy(iArr, i6, iArr2, i5, i7 - i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static void m1992P(long[] jArr, long[] jArr2, int i5, int i6, int i7) {
        AbstractC1665j.m2985e(jArr, "<this>");
        AbstractC1665j.m2985e(jArr2, "destination");
        System.arraycopy(jArr, i6, jArr2, i5, i7 - i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static void m1993Q(Object[] objArr, Object[] objArr2, int i5, int i6, int i7) {
        AbstractC1665j.m2985e(objArr, "<this>");
        AbstractC1665j.m2985e(objArr2, "destination");
        System.arraycopy(objArr, i6, objArr2, i5, i7 - i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m1994R(int[] iArr, int[] iArr2, int i5, int i6, int i7) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = iArr.length;
        }
        m1991O(iArr, iArr2, i5, 0, i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m1995S(Object[] objArr, Object[] objArr2, int i5, int i6, int i7) {
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = objArr.length;
        }
        m1993Q(objArr, objArr2, 0, i5, i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static byte[] m1996T(byte[] bArr, int i5, int i6) {
        AbstractC1665j.m2985e(bArr, "<this>");
        AbstractC1926h.m3571n(i6, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i5, i6);
        AbstractC1665j.m2984d(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static Object[] m1997U(Object[] objArr, int i5, int i6) {
        AbstractC1665j.m2985e(objArr, "<this>");
        AbstractC1926h.m3571n(i6, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i5, i6);
        AbstractC1665j.m2984d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static void m1998V(Object[] objArr, int i5, int i6) {
        AbstractC1665j.m2985e(objArr, "<this>");
        Arrays.fill(objArr, i5, i6, (Object) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static void m1999W(long j5, long[] jArr) {
        int length = jArr.length;
        AbstractC1665j.m2985e(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static Object m2001Y(Object[] objArr) {
        AbstractC1665j.m2985e(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static int m2002Z(long[] jArr) {
        AbstractC1665j.m2985e(jArr, "<this>");
        return jArr.length - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static Object m2003a0(int i5, Object[] objArr) {
        AbstractC1665j.m2985e(objArr, "<this>");
        if (i5 < 0 || i5 >= objArr.length) {
            return null;
        }
        return objArr[i5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static int m2004b0(Object[] objArr, Object obj) {
        int i5 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i5 < length) {
                if (objArr[i5] == null) {
                    return i5;
                }
                i5++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i5 < length2) {
            if (obj.equals(objArr[i5])) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static String m2005c0(Object[] objArr, String str, InterfaceC1601c interfaceC1601c, int i5) {
        if ((i5 & 1) != 0) {
            str = ", ";
        }
        String str2 = (i5 & 2) != 0 ? "" : "innermostOf(";
        String str3 = (i5 & 4) == 0 ? ")" : "";
        if ((i5 & 32) != 0) {
            interfaceC1601c = null;
        }
        AbstractC1665j.m2985e(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i6 = 0;
        for (Object obj : objArr) {
            i6++;
            if (i6 > 1) {
                sb.append((CharSequence) str);
            }
            AbstractC2352g.m4194g(sb, obj, interfaceC1601c);
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static void m2006d0(Object[] objArr, Comparator comparator, int i5, int i6) {
        AbstractC1665j.m2985e(objArr, "<this>");
        AbstractC1665j.m2985e(comparator, "comparator");
        Arrays.sort(objArr, i5, i6, comparator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public static List m2007e0(Object[] objArr) {
        AbstractC1665j.m2985e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return C0981u.f3047d;
        }
        if (length == 1) {
            return AbstractC2352g.m4211y(objArr[0]);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
        return m1987K(objArrCopyOf);
    }
}

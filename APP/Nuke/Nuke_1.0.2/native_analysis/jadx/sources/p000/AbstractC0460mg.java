package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: mg */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0460mg extends ci0 {
    /* JADX INFO: renamed from: Y */
    public static boolean m3084Y(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (i == iArr[i2]) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    /* JADX INFO: renamed from: Z */
    public static void m3085Z(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m3086a0(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: b0 */
    public static void m3087b0(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: c0 */
    public static void m3088c0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m3089d0(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        m3085Z(bArr, bArr2, i, i2, i3);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m3090e0(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        m3086a0(iArr, iArr2, i, 0, i2);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m3091f0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        m3088c0(objArr, objArr2, 0, i, i2);
    }

    /* JADX INFO: renamed from: g0 */
    public static byte[] m3092g0(byte[] bArr, int i, int i2) {
        bArr.getClass();
        ci0.m781F(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    /* JADX INFO: renamed from: h0 */
    public static Object[] m3093h0(Object[] objArr, int i, int i2) {
        objArr.getClass();
        ci0.m781F(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    /* JADX INFO: renamed from: i0 */
    public static void m3094i0(Object[] objArr, int i, int i2) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m3095j0(long j, long[] jArr) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    /* JADX INFO: renamed from: l0 */
    public static Object m3097l0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* JADX INFO: renamed from: m0 */
    public static int m3098m0(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    /* JADX INFO: renamed from: n0 */
    public static Object m3099n0(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    /* JADX INFO: renamed from: o0 */
    public static int m3100o0(Object[] objArr, Object obj) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: p0 */
    public static String m3101p0(Object[] objArr, String str, in0 in0Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = (i & 2) != 0 ? "" : "innermostOf(";
        String str3 = (i & 4) == 0 ? ")" : "";
        if ((i & 32) != 0) {
            in0Var = null;
        }
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            AbstractC0691se.m4854y(sb, obj, in0Var);
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: q0 */
    public static char m3102q0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            um2.m5519i("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        C0676s.m4651j("Array has more than one element.");
        return (char) 0;
    }

    /* JADX INFO: renamed from: r0 */
    public static List m3103r0(Object[] objArr, Comparator comparator) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            if (objArr.length > 1) {
                Arrays.sort(objArr, comparator);
            }
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    /* JADX INFO: renamed from: s0 */
    public static List m3104s0(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length == 0) {
            return be0.f819h;
        }
        if (length == 1) {
            return AbstractC0179eu.m1434O(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t0 */
    public static List m3105t0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return be0.f819h;
        }
        if (length == 1) {
            return AbstractC0179eu.m1434O(objArr[0]);
        }
        List listAsList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
        listAsList.getClass();
        return listAsList;
    }

    /* JADX INFO: renamed from: u0 */
    public static Set m3106u0(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return fe0.f2918h;
        }
        if (length == 1) {
            return t11.m5065Q(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(xe1.m6103U(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }
}

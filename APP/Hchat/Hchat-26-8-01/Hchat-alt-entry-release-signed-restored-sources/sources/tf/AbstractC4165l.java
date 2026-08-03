package tf;

import ac.AbstractC0063p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import ng.C3009g;
import ng.InterfaceC3012j;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p054dg.C0795n;
import p085fg.InterfaceC1231l;
import p136j8.C2104o;
import p142jg.AbstractC2133a;
import p142jg.AbstractC2136d;
import p172lg.C2564d;
import p343x6.AbstractC5700d;

/* JADX INFO: renamed from: tf.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4165l extends AbstractC5700d {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A0 */
    public static C2564d m8364A0(Object[] objArr) {
        objArr.getClass();
        return new C2564d(0, objArr.length - 1, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B0 */
    public static int m8365B0(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C0 */
    public static Object m8366C0(int i9, Object[] objArr) {
        objArr.getClass();
        if (i9 < 0 || i9 >= objArr.length) {
            return null;
        }
        return objArr[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D0 */
    public static int m8367D0(Object[] objArr, Object obj) {
        objArr.getClass();
        int i9 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i9 < length) {
                if (objArr[i9] == null) {
                    return i9;
                }
                i9++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i9 < length2) {
            if (obj.equals(objArr[i9])) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E0 */
    public static String m8368E0(byte[] bArr, InterfaceC1231l interfaceC1231l) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
        int i9 = 0;
        for (byte b10 : bArr) {
            i9++;
            if (i9 > 1) {
                sb2.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
            }
            sb2.append((CharSequence) interfaceC1231l.invoke(Byte.valueOf(b10)));
        }
        sb2.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F0 */
    public static String m8369F0(Object[] objArr, InterfaceC1231l interfaceC1231l, int i9) {
        int i10 = i9 & 1;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        String str2 = i10 != 0 ? ", " : HttpUrl.FRAGMENT_ENCODE_SET;
        String str3 = (i9 & 2) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : "innermostOf(";
        if ((i9 & 4) == 0) {
            str = ")";
        }
        if ((i9 & 32) != 0) {
            interfaceC1231l = null;
        }
        objArr.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str3);
        int i11 = 0;
        for (Object obj : objArr) {
            i11++;
            if (i11 > 1) {
                sb2.append((CharSequence) str2);
            }
            AbstractC0063p.m413f(sb2, obj, interfaceC1231l);
        }
        sb2.append((CharSequence) str);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G0 */
    public static Object m8370G0(Object[] objArr) {
        AbstractC2133a abstractC2133a = AbstractC2136d.f7122g;
        if (objArr.length != 0) {
            return objArr[AbstractC2136d.f7122g.m5360g(objArr.length)];
        }
        C2104o.m5287l("Array is empty.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H0 */
    public static List m8371H0(Object[] objArr, Comparator comparator) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I0 */
    public static List m8372I0(byte[] bArr) {
        int i9 = 0;
        if (6 < bArr.length) {
            ArrayList arrayList = new ArrayList(6);
            int length = bArr.length;
            int i10 = 0;
            while (i9 < length) {
                arrayList.add(Byte.valueOf(bArr[i9]));
                i10++;
                if (i10 == 6) {
                    break;
                }
                i9++;
            }
            return arrayList;
        }
        int length2 = bArr.length;
        if (length2 == 0) {
            return C4173t.f13710g;
        }
        if (length2 == 1) {
            return AbstractC0000a.m99x0(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList2 = new ArrayList(bArr.length);
        int length3 = bArr.length;
        while (i9 < length3) {
            arrayList2.add(Byte.valueOf(bArr[i9]));
            i9++;
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public static final void m8373J0(Object[] objArr, LinkedHashSet linkedHashSet) {
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K0 */
    public static List m8374K0(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length == 0) {
            return C4173t.f13710g;
        }
        if (length == 1) {
            return AbstractC0000a.m99x0(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i9 : iArr) {
            arrayList.add(Integer.valueOf(i9));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L0 */
    public static List m8375L0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return C4173t.f13710g;
        }
        if (length == 1) {
            return AbstractC0000a.m99x0(objArr[0]);
        }
        List listAsList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
        listAsList.getClass();
        return listAsList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public static InterfaceC3012j m8376k0(Object[] objArr) {
        return objArr.length == 0 ? C3009g.f9799a : new C0795n(objArr, 5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public static boolean m8377l0(char[] cArr, char c10) {
        int length = cArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                i9 = -1;
                break;
            }
            if (c10 == cArr[i9]) {
                break;
            }
            i9++;
        }
        return i9 >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public static boolean m8378m0(Object[] objArr, Object obj) {
        objArr.getClass();
        return m8367D0(objArr, obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public static void m8379n0(int i9, int i10, Object[] objArr, int i11, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i10, objArr2, i9, i11 - i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o0 */
    public static void m8380o0(byte[] bArr, int i9, int i10, byte[] bArr2, int i11) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i10, bArr2, i9, i11 - i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p0 */
    public static void m8381p0(int[] iArr, int[] iArr2, int i9, int i10, int i11) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i10, iArr2, i9, i11 - i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q0 */
    public static void m8382q0(long[] jArr, long[] jArr2, int i9, int i10, int i11) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i10, jArr2, i9, i11 - i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m8383r0(int i9, int i10, Object[] objArr, int i11, Object[] objArr2) {
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        m8379n0(0, i9, objArr, i10, objArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m8384s0(int[] iArr, int[] iArr2, int i9, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = iArr.length;
        }
        m8381p0(iArr, iArr2, i9, 0, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t0 */
    public static byte[] m8385t0(byte[] bArr, int i9, int i10) {
        bArr.getClass();
        AbstractC5700d.m10291r(i10, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i9, i10);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u0 */
    public static Object[] m8386u0(Object[] objArr, int i9, int i10) {
        objArr.getClass();
        AbstractC5700d.m10291r(i10, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i9, i10);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v0 */
    public static void m8387v0(int i9, int i10, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i9, i10, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public static void m8388w0(long j3, long[] jArr) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y0 */
    public static void m8390y0(int[] iArr, int i9) {
        int length = iArr.length;
        iArr.getClass();
        Arrays.fill(iArr, 0, length, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    public static Object m8391z0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }
}

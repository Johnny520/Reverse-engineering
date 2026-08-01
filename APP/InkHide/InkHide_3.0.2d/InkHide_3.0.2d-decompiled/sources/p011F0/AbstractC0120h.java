package p011F0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p006D.AbstractC0079h;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p034R0.C0244c;
import p038T0.C0279d;
import p038T0.InterfaceC0283h;

/* JADX INFO: renamed from: F0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0120h extends AbstractC0079h {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static Iterable m251Y(Object[] objArr) {
        return objArr.length == 0 ? C0131s.f426a : new C0121i(0, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static List m252Z(Object[] objArr) {
        AbstractC0223g.m418e(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        AbstractC0223g.m417d(listAsList, "asList(...)");
        return listAsList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static InterfaceC0283h m253a0(Object[] objArr) {
        return objArr.length == 0 ? C0279d.f646a : new C0122j(0, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static boolean m254b0(Object[] objArr, Object obj) {
        int i2;
        AbstractC0223g.m418e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i2 = 0;
            while (i2 < length) {
                if (objArr[i2] == null) {
                    break;
                }
                i2++;
            }
            i2 = -1;
        } else {
            int length2 = objArr.length;
            for (int i3 = 0; i3 < length2; i3++) {
                if (obj.equals(objArr[i3])) {
                    i2 = i3;
                    break;
                }
            }
            i2 = -1;
        }
        return i2 >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static ArrayList m255c0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static C0244c m256d0(Object[] objArr) {
        AbstractC0223g.m418e(objArr, "<this>");
        return new C0244c(0, objArr.length - 1, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public static Float m257e0(float[] fArr, int i2) {
        if (i2 < 0 || i2 > fArr.length - 1) {
            return null;
        }
        return Float.valueOf(fArr[i2]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public static Object m258f0(int i2, Object[] objArr) {
        if (i2 < 0 || i2 > objArr.length - 1) {
            return null;
        }
        return objArr[i2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public static String m259g0(byte[] bArr, InterfaceC0204l interfaceC0204l) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (byte b : bArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) "");
            }
            sb.append((CharSequence) interfaceC0204l.mo8c(Byte.valueOf(b)));
        }
        sb.append((CharSequence) "");
        String string = sb.toString();
        AbstractC0223g.m417d(string, "toString(...)");
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public static String m260h0(Object[] objArr, String str, InterfaceC0204l interfaceC0204l, int i2) {
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        String str2 = (i2 & 2) != 0 ? "" : "(";
        String str3 = (i2 & 4) == 0 ? ")" : "";
        if ((i2 & 32) != 0) {
            interfaceC0204l = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i3 = 0;
        for (Object obj : objArr) {
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            AbstractC0079h.m180d(sb, obj, interfaceC0204l);
        }
        sb.append((CharSequence) str3);
        String string = sb.toString();
        AbstractC0223g.m417d(string, "toString(...)");
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public static final void m261i0(Object[] objArr, HashSet hashSet) {
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public static List m262j0(Object[] objArr) {
        AbstractC0223g.m418e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C0119g(objArr, false)) : AbstractC0079h.m167E(objArr[0]) : C0131s.f426a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public static Set m263k0(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C0133u.f428a;
        }
        if (length == 1) {
            return AbstractC0079h.m175T(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0134v.m294Y(objArr.length));
        m261i0(objArr, linkedHashSet);
        return linkedHashSet;
    }
}

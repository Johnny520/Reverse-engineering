package p009E0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p001A0.AbstractC0040p;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p040V0.C0400c;
import p040V0.InterfaceC0405h;

/* JADX INFO: renamed from: E0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0179j extends AbstractC0040p {
    /* JADX INFO: renamed from: g0 */
    public static List m530g0(Object[] objArr) {
        AbstractC0307g.m703e(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        AbstractC0307g.m702d(listAsList, "asList(...)");
        return listAsList;
    }

    /* JADX INFO: renamed from: h0 */
    public static InterfaceC0405h m531h0(Object[] objArr) {
        return objArr.length == 0 ? C0400c.f890a : new C0180k(0, objArr);
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m532i0(char[] cArr, char c) {
        int length = cArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (c == cArr[i2]) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    /* JADX INFO: renamed from: j0 */
    public static void m533j0(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        AbstractC0307g.m703e(objArr, "<this>");
        AbstractC0307g.m703e(objArr2, "destination");
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
    }

    /* JADX INFO: renamed from: k0 */
    public static final void m534k0(Object[] objArr, int i2, int i3) {
        AbstractC0307g.m703e(objArr, "<this>");
        Arrays.fill(objArr, i2, i3, (Object) null);
    }

    /* JADX INFO: renamed from: l0 */
    public static ArrayList m535l0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m0 */
    public static Object m536m0(Object[] objArr) {
        AbstractC0307g.m703e(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* JADX INFO: renamed from: n0 */
    public static Object m537n0(int i2, Object[] objArr) {
        AbstractC0307g.m703e(objArr, "<this>");
        if (i2 < 0 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }

    /* JADX INFO: renamed from: o0 */
    public static String m538o0(Object[] objArr, InterfaceC0286l interfaceC0286l) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) "");
            }
            AbstractC0358S.m879c(sb, obj, interfaceC0286l);
        }
        sb.append((CharSequence) "");
        String string = sb.toString();
        AbstractC0307g.m702d(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: p0 */
    public static List m539p0(int[] iArr) {
        AbstractC0307g.m703e(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return C0190u.f401a;
        }
        if (length == 1) {
            return AbstractC0040p.m82F(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q0 */
    public static List m540q0(Object[] objArr) {
        AbstractC0307g.m703e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C0177h(objArr, false)) : AbstractC0040p.m82F(objArr[0]) : C0190u.f401a;
    }
}

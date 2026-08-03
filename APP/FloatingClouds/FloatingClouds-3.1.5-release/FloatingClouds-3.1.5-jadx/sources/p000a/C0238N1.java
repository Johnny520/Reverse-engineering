package p000a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: a.N1 */
/* JADX INFO: loaded from: classes.dex */
public class C0238N1 extends C0889w1 {
    /* JADX INFO: renamed from: c0 */
    public static ArrayList m629c0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d0 */
    public static <T> T m630d0(T[] tArr) {
        C0631i9.m1482e(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    /* JADX INFO: renamed from: e0 */
    public static String m631e0(Object[] objArr, String str, InterfaceC0064D7 interfaceC0064D7, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        if ((i & 32) != 0) {
            interfaceC0064D7 = null;
        }
        C0631i9.m1482e(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            C0726n9.m1662e(sb, obj, interfaceC0064D7);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    /* JADX INFO: renamed from: f0 */
    public static <T> List<T> m632f0(T[] tArr, Comparator<? super T> comparator) {
        C0631i9.m1482e(tArr, "<this>");
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, tArr.length);
            C0631i9.m1481d(tArr, "copyOf(...)");
            if (tArr.length > 1) {
                Arrays.sort(tArr, comparator);
            }
        }
        List<T> listAsList = Arrays.asList(tArr);
        C0631i9.m1481d(listAsList, "asList(...)");
        return listAsList;
    }

    /* JADX INFO: renamed from: g0 */
    public static <T> List<T> m633g0(T[] tArr) {
        C0631i9.m1482e(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C0076E1(tArr, false)) : C0889w1.m2124K(tArr[0]) : C0439Y5.f1645a;
    }
}

package p000a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: a.o3 */
/* JADX INFO: loaded from: classes.dex */
public class C0739o3 extends C0889w1 {
    /* JADX INFO: renamed from: c0 */
    public static <T> int m1756c0(List<? extends T> list) {
        C0631i9.m1482e(list, "<this>");
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: d0 */
    public static <T> List<T> m1757d0(T... tArr) {
        if (tArr.length <= 0) {
            return C0439Y5.f1645a;
        }
        List<T> listAsList = Arrays.asList(tArr);
        C0631i9.m1481d(listAsList, "asList(...)");
        return listAsList;
    }

    /* JADX INFO: renamed from: e0 */
    public static ArrayList m1758e0(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C0076E1(objArr, true));
    }

    /* JADX INFO: renamed from: f0 */
    public static void m1759f0() {
        throw new ArithmeticException("Count overflow has happened.");
    }
}

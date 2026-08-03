package p000a;

import java.util.Collection;

/* JADX INFO: renamed from: a.p3 */
/* JADX INFO: loaded from: classes.dex */
public class C0758p3 extends C0739o3 {
    /* JADX INFO: renamed from: g0 */
    public static <T> int m1800g0(Iterable<? extends T> iterable, int i) {
        C0631i9.m1482e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}

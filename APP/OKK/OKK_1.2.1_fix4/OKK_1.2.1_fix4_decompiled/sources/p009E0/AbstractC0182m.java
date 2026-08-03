package p009E0;

import java.util.List;
import p001A0.AbstractC0040p;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: E0.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0182m extends AbstractC0040p {
    /* JADX INFO: renamed from: g0 */
    public static final int m555g0(List list) {
        AbstractC0307g.m703e(list, "<this>");
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: h0 */
    public static List m556h0(Object... objArr) {
        return objArr.length > 0 ? AbstractC0179j.m530g0(objArr) : C0190u.f401a;
    }

    /* JADX INFO: renamed from: i0 */
    public static void m557i0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* JADX INFO: renamed from: j0 */
    public static void m558j0() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}

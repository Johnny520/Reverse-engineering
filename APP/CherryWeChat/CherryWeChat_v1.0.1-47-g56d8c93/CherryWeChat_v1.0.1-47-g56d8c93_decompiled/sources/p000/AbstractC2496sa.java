package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: sa */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2496sa extends AbstractC0628Oj {
    /* JADX INFO: renamed from: Z */
    public static C0286Gl m4975Z(Collection collection) {
        return new C0286Gl(0, collection.size() - 1, 1);
    }

    /* JADX INFO: renamed from: a0 */
    public static int m4976a0(List list) {
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: b0 */
    public static List m4977b0(Object... objArr) {
        return objArr.length > 0 ? Arrays.asList(objArr) : C0452Kf.f1484a;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m4978c0() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}

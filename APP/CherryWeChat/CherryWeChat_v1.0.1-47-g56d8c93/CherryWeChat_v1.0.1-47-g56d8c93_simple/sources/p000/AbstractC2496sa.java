package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: sa */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2496sa extends AbstractC0628Oj {
    /* JADX INFO: renamed from: Z */
    public static C0286Gl m4975Z(Collection r3) {
        return new C0286Gl(0, r3.size() - 1, 1);
    }

    /* JADX INFO: renamed from: a0 */
    public static int m4976a0(List r0) {
        return r0.size() - 1;
    }

    /* JADX INFO: renamed from: b0 */
    public static List m4977b0(Object... r1) {
        if (r1.length <= 0) goto L7;
        return Arrays.asList(r1);
    L7:
        return C0452Kf.f1484a;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m4978c0() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}

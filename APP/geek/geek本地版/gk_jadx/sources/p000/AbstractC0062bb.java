package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: bb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0062bb extends AbstractC0346ip {
    /* JADX INFO: renamed from: f0 */
    public static List m549f0(Object... objArr) {
        if (objArr.length <= 0) {
            return C0931yi.f5342a;
        }
        List listAsList = Arrays.asList(objArr);
        AbstractC0346ip.m1502n("asList(...)", listAsList);
        return listAsList;
    }

    /* JADX INFO: renamed from: g0 */
    public static void m550g0() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}

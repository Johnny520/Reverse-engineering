package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: jb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0368jb extends AbstractC0493mp {
    /* JADX INFO: renamed from: a0 */
    public static List m1595a0(Object... objArr) {
        if (objArr.length <= 0) {
            return C0020aj.f84a;
        }
        List listAsList = Arrays.asList(objArr);
        AbstractC0493mp.m1856f("asList(...)", listAsList);
        return listAsList;
    }

    /* JADX INFO: renamed from: b0 */
    public static void m1596b0() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}

package p011F0;

import java.util.List;
import p006D.AbstractC0079h;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: F0.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0124l extends AbstractC0079h {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static int m285Y(List list) {
        AbstractC0223g.m418e(list, "<this>");
        return list.size() - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static List m286Z(Object... objArr) {
        return objArr.length > 0 ? AbstractC0120h.m252Z(objArr) : C0131s.f426a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static void m287a0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static void m288b0() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}

package p009E0;

import java.util.Collection;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: E0.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0183n extends AbstractC0182m {
    /* JADX INFO: renamed from: k0 */
    public static int m559k0(Iterable r1, int r2) {
        AbstractC0307g.m703e(r1, "<this>");
        if ((r1 instanceof Collection) == true) goto L5;
        return r2;
    L5:
        return ((Collection) r1).size();
    }
}

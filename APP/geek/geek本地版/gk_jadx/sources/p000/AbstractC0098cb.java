package p000;

import java.util.Collection;

/* JADX INFO: renamed from: cb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0098cb extends AbstractC0062bb {
    /* JADX INFO: renamed from: h0 */
    public static int m657h0(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}

package p011F0;

import java.util.Collection;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: F0.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0125m extends AbstractC0124l {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static int m289c0(Iterable iterable) {
        AbstractC0223g.m418e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}

package p000;

import java.util.Collection;

/* JADX INFO: renamed from: kb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0405kb extends AbstractC0368jb {
    /* JADX INFO: renamed from: c0 */
    public static int m1675c0(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}

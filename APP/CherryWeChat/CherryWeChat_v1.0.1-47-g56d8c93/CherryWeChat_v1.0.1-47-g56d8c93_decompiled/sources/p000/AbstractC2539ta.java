package p000;

import java.util.Collection;

/* JADX INFO: renamed from: ta */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2539ta extends AbstractC2496sa {
    /* JADX INFO: renamed from: d0 */
    public static int m5019d0(Iterable iterable, int i) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}

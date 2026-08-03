package p000;

import java.util.Collection;

/* JADX INFO: renamed from: ta */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2539ta extends AbstractC2496sa {
    /* JADX INFO: renamed from: d0 */
    public static int m5019d0(Iterable r1, int r2) {
        if ((r1 instanceof Collection) == true) goto L5;
        return r2;
    L5:
        return ((Collection) r1).size();
    }
}

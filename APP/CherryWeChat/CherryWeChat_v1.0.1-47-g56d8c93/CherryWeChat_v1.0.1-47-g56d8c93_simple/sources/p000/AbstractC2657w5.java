package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: w5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2657w5 extends ArrayList {
    /* JADX INFO: renamed from: a */
    public final Object m5219a() {
        if (super.size() == 0) goto L13;
        Object r0 = get(0);
        int r1 = super.size();
        int r2 = 1;
    L5:
        if (r2 >= r1) goto L11;
        if (AbstractC0585Nj.m1134a(r0, get(r2)) == false) goto L10;
        r2 = r2 + 1;
        goto L5
    L10:
        throw new C0232Fa(AbstractC2374ph.m4812i(super.size(), "query did not return a unique result: "));
    L11:
        return r0;
    L13:
        throw new C0232Fa("No result found for query");
    }
}

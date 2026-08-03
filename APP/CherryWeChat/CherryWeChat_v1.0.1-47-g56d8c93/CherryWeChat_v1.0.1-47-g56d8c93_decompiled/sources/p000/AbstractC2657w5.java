package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: w5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2657w5 extends ArrayList {
    /* JADX INFO: renamed from: a */
    public final Object m5219a() {
        if (super.size() == 0) {
            throw new C0232Fa("No result found for query");
        }
        Object obj = get(0);
        int size = super.size();
        for (int i = 1; i < size; i++) {
            if (!AbstractC0585Nj.m1134a(obj, get(i))) {
                throw new C0232Fa(AbstractC2374ph.m4812i(super.size(), "query did not return a unique result: "));
            }
        }
        return obj;
    }
}

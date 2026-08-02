package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: tj */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0736tj extends ArrayList {
    /* JADX INFO: renamed from: a */
    public final Object m5273a() {
        if (super.size() == 0) {
            throw new C0594pv("No result found for query");
        }
        E e = get(0);
        int size = super.size();
        for (int i = 1; i < size; i++) {
            if (!t11.m5086l(e, get(i))) {
                throw new C0594pv(vi0.m5688g("query did not return a unique result: ", super.size()));
            }
        }
        return e;
    }

    public final Object first() {
        if (!isEmpty()) {
            return get(0);
        }
        C0676s.m4653l("list is empty");
        return null;
    }
}

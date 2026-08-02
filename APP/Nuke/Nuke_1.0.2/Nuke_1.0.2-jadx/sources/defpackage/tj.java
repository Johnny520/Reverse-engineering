package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tj extends ArrayList {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object a() {
        if (super.size() == 0) {
            throw new pv("No result found for query");
        }
        E e = get(0);
        int size = super.size();
        for (int i = 1; i < size; i++) {
            if (!t11.l(e, get(i))) {
                throw new pv(vi0.g("query did not return a unique result: ", super.size()));
            }
        }
        return e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object first() {
        if (!isEmpty()) {
            return get(0);
        }
        s.l("list is empty");
        return null;
    }
}

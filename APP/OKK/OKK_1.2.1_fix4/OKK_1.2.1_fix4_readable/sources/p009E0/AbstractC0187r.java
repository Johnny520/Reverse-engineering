package p009E0;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: E0.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0187r extends AbstractC0186q {
    /* JADX INFO: renamed from: l0 */
    public static void m560l0(List list, Comparator comparator) {
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}

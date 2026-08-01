package p011F0;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: F0.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0128p extends AbstractC0127o {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static void m290d0(List list, Comparator comparator) {
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}

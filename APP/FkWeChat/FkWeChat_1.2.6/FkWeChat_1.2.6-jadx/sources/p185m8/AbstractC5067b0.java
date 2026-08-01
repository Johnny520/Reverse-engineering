package p185m8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: m8.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5067b0 extends AbstractC5064a0 {
    /* JADX INFO: renamed from: C */
    public static void m20481C(List list) {
        list.getClass();
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m20482D(List list, Comparator comparator) {
        list.getClass();
        comparator.getClass();
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}

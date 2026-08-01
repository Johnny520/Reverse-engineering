package p061L2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: L2.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0977q extends AbstractC0976p {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static void m2031M(List list, Comparator comparator) {
        AbstractC1665j.m2985e(list, "<this>");
        AbstractC1665j.m2985e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}

package p061L2;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: L2.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0978r extends AbstractC0977q {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static void m2032N(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC1665j.m2985e(abstractCollection, "<this>");
        AbstractC1665j.m2985e(iterable, "elements");
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }
}

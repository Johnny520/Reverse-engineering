package p011F0;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p034R0.C0244c;

/* JADX INFO: renamed from: F0.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0129q extends AbstractC0128p {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public static void m291e0(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC0223g.m418e(iterable, "elements");
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public static boolean m292f0(Collection collection, Object[] objArr) {
        AbstractC0223g.m418e(collection, "<this>");
        AbstractC0223g.m418e(objArr, "elements");
        return collection.addAll(AbstractC0120h.m252Z(objArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public static void m293g0(ArrayList arrayList, InterfaceC0204l interfaceC0204l) {
        int iM285Y;
        int i2;
        AbstractC0223g.m418e(arrayList, "<this>");
        int i3 = new C0244c(0, AbstractC0124l.m285Y(arrayList), 1).f584b;
        boolean z2 = i3 >= 0;
        int i4 = z2 ? 0 : i3;
        int i5 = 0;
        while (z2) {
            if (i4 != i3) {
                i2 = i4 + 1;
            } else {
                if (!z2) {
                    throw new NoSuchElementException();
                }
                z2 = false;
                i2 = i4;
            }
            Object obj = arrayList.get(i4);
            if (!((Boolean) interfaceC0204l.mo8c(obj)).booleanValue()) {
                if (i5 != i4) {
                    arrayList.set(i5, obj);
                }
                i5++;
            }
            i4 = i2;
        }
        if (i5 >= arrayList.size() || i5 > (iM285Y = AbstractC0124l.m285Y(arrayList))) {
            return;
        }
        while (true) {
            arrayList.remove(iM285Y);
            if (iM285Y == i5) {
                return;
            } else {
                iM285Y--;
            }
        }
    }
}

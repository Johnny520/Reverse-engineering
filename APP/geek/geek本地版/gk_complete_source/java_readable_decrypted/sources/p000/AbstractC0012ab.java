package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ab */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0012ab extends AbstractC0255gb {
    /* JADX INFO: renamed from: i0 */
    public static final void m82i0(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC0713sm interfaceC0713sm) {
        sb.append(charSequence2);
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            if (interfaceC0713sm != null) {
                sb.append((CharSequence) interfaceC0713sm.mo96f(next));
            } else {
                if (next != null ? next instanceof CharSequence : true) {
                    sb.append((CharSequence) next);
                } else if (next instanceof Character) {
                    sb.append(((Character) next).charValue());
                } else {
                    sb.append((CharSequence) next.toString());
                }
            }
        }
        sb.append(charSequence3);
    }

    /* JADX INFO: renamed from: j0 */
    public static String m83j0(Collection collection, String str, InterfaceC0713sm interfaceC0713sm, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = str;
        String str3 = (i & 2) != 0 ? "" : "[";
        String str4 = (i & 4) == 0 ? "]" : "";
        if ((i & 32) != 0) {
            interfaceC0713sm = null;
        }
        AbstractC0346ip.m1503o("separator", str2);
        StringBuilder sb = new StringBuilder();
        m82i0(collection, sb, str2, str3, str4, "...", interfaceC0713sm);
        return sb.toString();
    }

    /* JADX INFO: renamed from: k0 */
    public static Comparable m84k0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* JADX INFO: renamed from: l0 */
    public static List m85l0(Iterable iterable) {
        ArrayList arrayList;
        AbstractC0346ip.m1503o("<this>", iterable);
        boolean z = iterable instanceof Collection;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return new ArrayList(collection);
                }
                return AbstractC0346ip.m1469C(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
            }
        } else {
            if (z) {
                arrayList = new ArrayList((Collection) iterable);
            } else {
                arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            int size2 = arrayList.size();
            if (size2 != 0) {
                return size2 != 1 ? arrayList : AbstractC0346ip.m1469C(arrayList.get(0));
            }
        }
        return C0931yi.f5342a;
    }
}

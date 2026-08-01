package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ib */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0329ib extends AbstractC0553ob {
    /* JADX INFO: renamed from: d0 */
    public static final void m1495d0(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC0786um interfaceC0786um) {
        sb.append(charSequence2);
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            if (interfaceC0786um != null) {
                sb.append((CharSequence) interfaceC0786um.mo26f(next));
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

    /* JADX INFO: renamed from: e0 */
    public static String m1496e0(Collection collection, String str, InterfaceC0786um interfaceC0786um, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = str;
        String str3 = (i & 2) != 0 ? "" : "[";
        String str4 = (i & 4) == 0 ? "]" : "";
        if ((i & 32) != 0) {
            interfaceC0786um = null;
        }
        AbstractC0493mp.m1857g("separator", str2);
        StringBuilder sb = new StringBuilder();
        m1495d0(collection, sb, str2, str3, str4, "...", interfaceC0786um);
        return sb.toString();
    }

    /* JADX INFO: renamed from: f0 */
    public static List m1497f0(Iterable iterable) {
        ArrayList arrayList;
        AbstractC0493mp.m1857g("<this>", iterable);
        boolean z = iterable instanceof Collection;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return new ArrayList(collection);
                }
                return AbstractC0493mp.m1872w(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
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
                return size2 != 1 ? arrayList : AbstractC0493mp.m1872w(arrayList.get(0));
            }
        }
        return C0020aj.f84a;
    }
}

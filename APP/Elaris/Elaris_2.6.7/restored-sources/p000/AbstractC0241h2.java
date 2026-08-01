package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: h2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0241h2 extends AbstractC0340n2 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k2 */
    public static String m468k2(Iterable iterable, String str, InterfaceC0482u5 interfaceC0482u5, int i) {
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        if ((i & 32) != 0) {
            interfaceC0482u5 = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            AbstractC0486u9.m1049b(sb, obj, interfaceC0482u5);
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l2 */
    public static int[] m469l2(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m2 */
    public static long[] m470m2(ArrayList arrayList) {
        long[] jArr = new long[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n2 */
    public static Set m471n2(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return C0037c4.f85a;
        }
        if (size == 1) {
            Set setSingleton = Collections.singleton(arrayList.get(0));
            setSingleton.getClass();
            return setSingleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0486u9.m1068u(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }
}

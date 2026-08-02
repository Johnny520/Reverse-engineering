package defpackage;

import java.util.Formatter;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bg1 extends x73 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x73
    public final void k() {
        if (c().size() <= 65536) {
            Iterator it = c().iterator();
            int i = 0;
            while (it.hasNext()) {
                ((ag1) it.next()).g(i);
                i++;
            }
            return;
        }
        TreeMap treeMap = new TreeMap();
        Iterator it2 = c().iterator();
        while (it2.hasNext()) {
            String str = ((ag1) it2.next()).i.g().h;
            int iLastIndexOf = str.lastIndexOf(47);
            String strReplace = iLastIndexOf == -1 ? "default" : str.substring(str.lastIndexOf(91) + 2, iLastIndexOf).replace('/', '.');
            AtomicInteger atomicInteger = (AtomicInteger) treeMap.get(strReplace);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                treeMap.put(strReplace, atomicInteger);
            }
            atomicInteger.incrementAndGet();
        }
        Formatter formatter = new Formatter();
        try {
            formatter.format("Too many %1$s references to fit in one dex file: %2$d; max is %3$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.%nReferences by package:", this instanceof xg1 ? "method" : "field", Integer.valueOf(c().size()), 65536);
            for (Map.Entry entry : treeMap.entrySet()) {
                formatter.format("%n%6d %s", Integer.valueOf(((AtomicInteger) entry.getValue()).get()), entry.getKey());
            }
            String string = formatter.toString();
            formatter.close();
            throw new a80(null, string);
        } catch (Throwable th) {
            formatter.close();
            throw th;
        }
    }
}

package p255r4;

import java.util.Formatter;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import p060e4.C0825b;

/* JADX INFO: renamed from: r4.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3668e0 extends AbstractC3700u0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3700u0
    /* JADX INFO: renamed from: k */
    public final void mo7651k() {
        if (mo7652c().size() <= 65536) {
            Iterator it = mo7652c().iterator();
            int i9 = 0;
            while (it.hasNext()) {
                ((AbstractC3666d0) it.next()).m7711g(i9);
                i9++;
            }
            return;
        }
        TreeMap treeMap = new TreeMap();
        Iterator it2 = mo7652c().iterator();
        while (it2.hasNext()) {
            String str = ((AbstractC3666d0) it2.next()).f12038h.m8904k().f14760g;
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
            formatter.format("Too many %1$s references to fit in one dex file: %2$d; max is %3$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.%nReferences by package:", this instanceof C3678j0 ? "method" : "field", Integer.valueOf(mo7652c().size()), 65536);
            for (Map.Entry entry : treeMap.entrySet()) {
                formatter.format("%n%6d %s", Integer.valueOf(((AtomicInteger) entry.getValue()).get()), entry.getKey());
            }
            String string = formatter.toString();
            formatter.close();
            throw new C0825b(string, null);
        } catch (Throwable th2) {
            formatter.close();
            throw th2;
        }
    }
}

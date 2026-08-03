package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.C0002c;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: g.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0112w extends AbstractC0087J {
    public AbstractC0112w(String str, C0100k c0100k) {
        super(str, c0100k, 4);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0087J
    /* JADX INFO: renamed from: o */
    protected final void mo255o() {
        int i2 = 0;
        if (mo225f().size() <= 65536) {
            Iterator it = mo225f().iterator();
            while (it.hasNext()) {
                ((AbstractC0111v) it.next()).m320h(i2);
                i2++;
            }
            return;
        }
        TreeMap treeMap = new TreeMap();
        Iterator it2 = mo225f().iterator();
        while (it2.hasNext()) {
            String strM445h = ((AbstractC0111v) it2.next()).m316i().m452h().m445h();
            int iLastIndexOf = strM445h.lastIndexOf(47);
            String strReplace = iLastIndexOf == -1 ? "default" : strM445h.substring(strM445h.lastIndexOf(91) + 2, iLastIndexOf).replace('/', '.');
            AtomicInteger atomicInteger = (AtomicInteger) treeMap.get(strReplace);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                treeMap.put(strReplace, atomicInteger);
            }
            atomicInteger.incrementAndGet();
        }
        Formatter formatter = new Formatter();
        try {
            formatter.format("Too many %1$s references to fit in one dex file: %2$d; max is %3$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.%nReferences by package:", this instanceof C0115z ? "method" : "field", Integer.valueOf(mo225f().size()), 65536);
            for (Map.Entry entry : treeMap.entrySet()) {
                formatter.format("%n%6d %s", Integer.valueOf(((AtomicInteger) entry.getValue()).get()), entry.getKey());
            }
            String string = formatter.toString();
            formatter.close();
            throw new C0002c(string);
        } catch (Throwable th) {
            formatter.close();
            throw th;
        }
    }
}

package p182m5;

import java.util.Formatter;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import p006a5.C0067c;

/* JADX INFO: renamed from: m5.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4990f0 extends AbstractC5028y0 {
    public AbstractC4990f0(String str, C5009p c5009p) {
        super(str, c5009p, 4);
    }

    @Override // p182m5.AbstractC5028y0
    /* JADX INFO: renamed from: q */
    public void mo20135q() {
        if (mo20137g().size() > 65536) {
            throw new C0067c(m20136r());
        }
        Iterator it = mo20137g().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            ((AbstractC4988e0) it.next()).m20101m(i10);
            i10++;
        }
    }

    /* JADX INFO: renamed from: r */
    public final String m20136r() {
        TreeMap treeMap = new TreeMap();
        Iterator it = mo20137g().iterator();
        while (it.hasNext()) {
            String strM25762s = ((AbstractC4988e0) it.next()).m20317n().m25762s();
            AtomicInteger atomicInteger = (AtomicInteger) treeMap.get(strM25762s);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                treeMap.put(strM25762s, atomicInteger);
            }
            atomicInteger.incrementAndGet();
        }
        Formatter formatter = new Formatter();
        try {
            formatter.format("Too many %1$s references to fit in one dex file: %2$d; max is %3$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.%nReferences by package:", this instanceof C5000k0 ? "method" : "field", Integer.valueOf(mo20137g().size()), 65536);
            for (Map.Entry entry : treeMap.entrySet()) {
                formatter.format("%n%6d %s", Integer.valueOf(((AtomicInteger) entry.getValue()).get()), entry.getKey());
            }
            String string = formatter.toString();
            formatter.close();
            return string;
        } catch (Throwable th) {
            formatter.close();
            throw th;
        }
    }
}

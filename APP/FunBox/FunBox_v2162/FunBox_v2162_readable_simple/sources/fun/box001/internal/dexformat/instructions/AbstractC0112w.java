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
    public AbstractC0112w(String r2, C0100k r3) {
        super(r2, r3, 4);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0087J
    /* JADX INFO: renamed from: o */
    protected final void mo255o() {
        int r2 = 0;
        if (mo225f().size() <= 65536) goto L30;
        TreeMap r4 = new TreeMap();
        Iterator r5 = mo225f().iterator();
    L6:
        if (r5.hasNext() == false) goto L15;
        String r6 = ((AbstractC0111v) r5.next()).m316i().m452h().m445h();
        int r9 = r6.lastIndexOf(47);
        int r10 = r6.lastIndexOf(91);
        if (r9 != (-1)) goto L10;
        String r62 = "default";
    L11:
        AtomicInteger r7 = (AtomicInteger) r4.get(r62);
        if (r7 != null) goto L14;
        r7 = new AtomicInteger();
        r4.put(r62, r7);
    L14:
        r7.incrementAndGet();
        goto L6
    L10:
        r62 = r6.substring(r10 + 2, r9).replace('/', '.');
        goto L11
    L15:
        Formatter r52 = new Formatter();
    L27:
        th = move-exception;
        r52.close();
        throw th;
    L17:
        if ((this instanceof C0115z) == false) goto L19;
        String r63 = "method";
    L20:
        r52.format("Too many %1$s references to fit in one dex file: %2$d; max is %3$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.%nReferences by package:", new Object[]{r63, Integer.valueOf(mo225f().size()), 65536});     // Catch: Throwable -> L27
        Iterator r3 = r4.entrySet().iterator();     // Catch: Throwable -> L27
    L22:
        if (r3.hasNext() == false) goto L24;
        Map.Entry r42 = (Map.Entry) r3.next();     // Catch: Throwable -> L27
        r52.format("%n%6d %s", new Object[]{Integer.valueOf(((AtomicInteger) r42.getValue()).get()), r42.getKey()});     // Catch: Throwable -> L27
        goto L22
    L24:
        String r1 = r52.toString();     // Catch: Throwable -> L27
        r52.close();
        throw new C0002c(r1);
    L19:
        r63 = "field";
        goto L20
    L30:
        Iterator r0 = mo225f().iterator();
    L32:
        if (r0.hasNext() == false) goto L34;
        ((AbstractC0111v) r0.next()).m320h(r2);
        r2 = r2 + 1;
        goto L32
    }
}

package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: xa */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2711xa extends AbstractC2668wa {
    /* JADX INFO: renamed from: e0 */
    public static void m5283e0(ArrayList r6, InterfaceC1416fj r7) {
        if (r6 == null) goto L5;
        int r1 = AbstractC2496sa.m4976a0(r6);
        int r2 = 0;
        if (r1 < 0) goto L30;
        int r3 = 0;
    L20:
        Object r4 = r6.get(r2);
        if (((Boolean) r7.mo90g(r4)).booleanValue() == true) goto L26;
        if (r3 == r2) goto L25;
        r6.set(r3, r4);
    L25:
        r3 = r3 + 1;
    L26:
        if (r2 == r1) goto L28;
        r2 = r2 + 1;
        goto L20
    L28:
        r2 = r3;
    L30:
        if (r2 >= r6.size()) goto L36;
        int r72 = AbstractC2496sa.m4976a0(r6);
        if (r2 > r72) goto L44;
    L33:
        r6.remove(r72);
        if (r72 == r2) goto L46;
        r72 = r72 - 1;
        goto L33
    L46:
        return;
    L44:
        return;
    L36:
        return;
    L5:
        if ((r6 instanceof InterfaceC0545Mm) == true) goto L7;
    L11:
        Iterator r62 = r6.iterator();
    L13:
        if (r62.hasNext() == false) goto L45;
        if (((Boolean) r7.mo90g(r62.next())).booleanValue() != true) goto L13;
        r62.remove();
        goto L13
    L45:
        return;
    L7:
        if ((r6 instanceof InterfaceC0588Nm) == true) goto L11;
        AbstractC0828TB.m1631I("kotlin.collections.MutableIterable", r6);
        throw null;
    }

    /* JADX INFO: renamed from: f0 */
    public static void m5284f0(ArrayList r1) {
        if (r1.isEmpty() == true) goto L7;
        r1.remove(AbstractC2496sa.m4976a0(r1));
        return;
    L7:
        throw new NoSuchElementException("List is empty.");
    }
}

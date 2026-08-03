package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: Lx */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0513Lx extends AbstractC0148Dc {
    /* JADX INFO: renamed from: A */
    public static Set m996A(Set r3, Set r4) {
        if (r4.isEmpty() == false) goto L7;
        return AbstractC2453ra.m4909s0(r3);
    L7:
        if ((r4 instanceof Set) == false) goto L15;
        LinkedHashSet r0 = new LinkedHashSet();
        Iterator r32 = r3.iterator();
    L10:
        if (r32.hasNext() == false) goto L14;
        Object r1 = r32.next();
        if (r4.contains(r1) == true) goto L10;
        r0.add(r1);
        goto L10
    L14:
        return r0;
    L15:
        LinkedHashSet r02 = new LinkedHashSet(r3);
        r02.removeAll(r4);
        return r02;
    }

    /* JADX INFO: renamed from: B */
    public static Set m997B(Object... r4) {
        int r0 = r4.length;
        if (r0 == 0) goto L13;
        int r1 = 0;
        if (r0 == 1) goto L11;
        LinkedHashSet r02 = new LinkedHashSet(AbstractC2598uq.m5109K(r4.length));
        int r2 = r4.length;
    L7:
        if (r1 >= r2) goto L9;
        r02.add(r4[r1]);
        r1 = r1 + 1;
        goto L7
    L9:
        return r02;
    L11:
        return Collections.singleton(r4[0]);
    L13:
        return C0538Mf.f1751a;
    }
}

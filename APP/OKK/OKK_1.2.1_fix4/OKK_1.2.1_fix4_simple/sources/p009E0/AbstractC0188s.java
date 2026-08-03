package p009E0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0317q;
import p033R0.InterfaceC0319a;
import p033R0.InterfaceC0320b;

/* JADX INFO: renamed from: E0.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0188s extends AbstractC0187r {
    /* JADX INFO: renamed from: m0 */
    public static void m561m0(ArrayList r02, Object[] r1) {
        r02.addAll(AbstractC0179j.m530g0(r1));
    }

    /* JADX INFO: renamed from: n0 */
    public static void m562n0(List r6, InterfaceC0286l r7) {
        if ((r6 instanceof RandomAccess) == false) goto L5;
        int r02 = AbstractC0182m.m555g0(r6);
        int r2 = 0;
        if (r02 < 0) goto L30;
        int r3 = 0;
    L20:
        Object r4 = r6.get(r2);
        if (((Boolean) r7.invoke(r4)).booleanValue() == true) goto L26;
        if (r3 == r2) goto L25;
        r6.set(r3, r4);
    L25:
        r3 = r3 + 1;
    L26:
        if (r2 == r02) goto L28;
        r2 = r2 + 1;
        goto L20
    L28:
        r2 = r3;
    L30:
        if (r2 >= r6.size()) goto L36;
        int r72 = AbstractC0182m.m555g0(r6);
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
        if ((r6 instanceof InterfaceC0319a) == true) goto L7;
    L11:
        Iterator r62 = r6.iterator();
    L13:
        if (r62.hasNext() == false) goto L45;
        if (((Boolean) r7.invoke(r62.next())).booleanValue() != true) goto L13;
        r62.remove();
        goto L13
    L45:
        return;
    L7:
        if ((r6 instanceof InterfaceC0320b) == true) goto L11;
        AbstractC0317q.m715d(r6, "kotlin.collections.MutableIterable");
        throw null;
    }
}

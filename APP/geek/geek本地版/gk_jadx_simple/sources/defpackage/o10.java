package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class o10 implements Iterable {
    public l10 a;
    public l10 b;
    public final WeakHashMap c;
    public int d;

    public o10() {
        this.c = new WeakHashMap();
        this.d = 0;
    }

    public l10 a(Object r3) {
        l10 r0 = this.a;
    L3:
        if (r0 == null) goto L8;
        if (r0.a.equals(r3) == true) goto L8;
        r0 = r0.c;
    L8:
        return r0;
    }

    public Object b(Object r4) {
        l10 r42 = a(r4);
        if (r42 != null) goto L5;
        return null;
    L5:
        this.d--;
        WeakHashMap r1 = this.c;
        if (r1.isEmpty() == true) goto L11;
        Iterator r12 = r1.keySet().iterator();
    L9:
        if (r12.hasNext() == false) goto L11;
        ((n10) r12.next()).a(r42);
    L11:
        l10 r13 = r42.d;
        if (r13 == null) goto L14;
        r13.c = r42.c;
    L15:
        l10 r2 = r42.c;
        if (r2 == null) goto L18;
        r2.d = r13;
    L19:
        r42.c = null;
        r42.d = null;
        return r42.b;
    L18:
        this.b = r13;
        goto L19
    L14:
        this.a = r42.c;
        goto L15
    }

    public final boolean equals(Object r7) {
        if (r7 != this) goto L6;
        return true;
    L6:
        if ((r7 instanceof o10) == true) goto L8;
        return false;
    L8:
        o10 r72 = (o10) r7;
        if (this.d == r72.d) goto L11;
        return false;
    L11:
        Iterator r1 = iterator();
        Iterator r73 = r72.iterator();
    L12:
        k10 r3 = (k10) r1;
        if (r3.hasNext() == false) goto L24;
        k10 r4 = (k10) r73;
        if (r4.hasNext() == false) goto L24;
        Map.Entry r32 = (Map.Entry) r3.next();
        Object r42 = r4.next();
        if (r32 != null) goto L19;
        if (r42 == null) goto L19;
    L22:
        return false;
    L19:
        if (r32 == null) goto L12;
        if (r32.equals(r42) == true) goto L12;
    L24:
        if (r3.hasNext() == false) goto L26;
    L28:
        return false;
    L26:
        if (((k10) r73).hasNext() == true) goto L28;
        return true;
    }

    public final int hashCode() {
        Iterator r0 = iterator();
        int r1 = 0;
    L3:
        k10 r2 = (k10) r0;
        if (r2.hasNext() == false) goto L6;
        r1 = r1 + ((Map.Entry) r2.next()).hashCode();
        goto L3
    L6:
        return r1;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        k10 r0 = new k10(this.a, this.b, 0);
        this.c.put(r0, Boolean.FALSE);
        return r0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("[");
        Iterator r1 = iterator();
    L3:
        k10 r2 = (k10) r1;
        if (r2.hasNext() == false) goto L8;
        r0.append(((Map.Entry) r2.next()).toString());
        if (r2.hasNext() == false) goto L3;
        r0.append(", ");
        goto L3
    L8:
        r0.append("]");
        return r0.toString();
    }
}

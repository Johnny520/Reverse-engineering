package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Xw */
/* JADX INFO: loaded from: classes.dex */
public class C1027Xw implements Iterable {

    /* JADX INFO: renamed from: a */
    public C0898Uw f3269a;

    /* JADX INFO: renamed from: b */
    public C0898Uw f3270b;

    /* JADX INFO: renamed from: c */
    public final WeakHashMap f3271c;

    /* JADX INFO: renamed from: d */
    public int f3272d;

    public C1027Xw() {
        this.f3271c = new WeakHashMap();
        this.f3272d = 0;
    }

    /* JADX INFO: renamed from: a */
    public C0898Uw mo1943a(Object r3) {
        C0898Uw r0 = this.f3269a;
    L3:
        if (r0 == null) goto L8;
        if (r0.f2791a.equals(r3) == true) goto L8;
        r0 = r0.f2793c;
    L8:
        return r0;
    }

    /* JADX INFO: renamed from: b */
    public Object mo1944b(Object r4) {
        C0898Uw r42 = mo1943a(r4);
        if (r42 != null) goto L5;
        return null;
    L5:
        this.f3272d--;
        WeakHashMap r1 = this.f3271c;
        if (r1.isEmpty() == true) goto L11;
        Iterator r12 = r1.keySet().iterator();
    L9:
        if (r12.hasNext() == false) goto L11;
        ((AbstractC0984Ww) r12.next()).mo1688a(r42);
    L11:
        C0898Uw r13 = r42.f2794d;
        if (r13 == null) goto L14;
        r13.f2793c = r42.f2793c;
    L15:
        C0898Uw r2 = r42.f2793c;
        if (r2 == null) goto L18;
        r2.f2794d = r13;
    L19:
        r42.f2793c = null;
        r42.f2794d = null;
        return r42.f2792b;
    L18:
        this.f3270b = r13;
        goto L19
    L14:
        this.f3269a = r42.f2793c;
        goto L15
    }

    public final boolean equals(Object r7) {
        if (r7 != this) goto L6;
        return true;
    L6:
        if ((r7 instanceof C1027Xw) == true) goto L8;
        return false;
    L8:
        C1027Xw r72 = (C1027Xw) r7;
        if (this.f3272d == r72.f3272d) goto L11;
        return false;
    L11:
        Iterator r1 = iterator();
        Iterator r73 = r72.iterator();
    L12:
        C0855Tw r3 = (C0855Tw) r1;
        if (r3.hasNext() == false) goto L24;
        C0855Tw r4 = (C0855Tw) r73;
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
        if (((C0855Tw) r73).hasNext() == true) goto L28;
        return true;
    }

    public final int hashCode() {
        Iterator r0 = iterator();
        int r1 = 0;
    L3:
        C0855Tw r2 = (C0855Tw) r0;
        if (r2.hasNext() == false) goto L6;
        r1 = r1 + ((Map.Entry) r2.next()).hashCode();
        goto L3
    L6:
        return r1;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0855Tw r0 = new C0855Tw(this.f3269a, this.f3270b, 0);
        this.f3271c.put(r0, Boolean.FALSE);
        return r0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("[");
        Iterator r1 = iterator();
    L3:
        C0855Tw r2 = (C0855Tw) r1;
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

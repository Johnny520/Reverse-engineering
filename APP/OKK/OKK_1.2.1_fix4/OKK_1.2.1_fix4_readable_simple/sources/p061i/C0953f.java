package p061i;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: i.f */
/* JADX INFO: loaded from: classes.dex */
public class C0953f implements Iterable {

    /* JADX INFO: renamed from: a */
    public C0950c f3376a;

    /* JADX INFO: renamed from: b */
    public C0950c f3377b;

    /* JADX INFO: renamed from: c */
    public final WeakHashMap f3378c;

    /* JADX INFO: renamed from: d */
    public int f3379d;

    public C0953f() {
        this.f3378c = new WeakHashMap();
        this.f3379d = 0;
    }

    /* JADX INFO: renamed from: a */
    public C0950c mo2281a(Object r3) {
        C0950c r02 = this.f3376a;
    L3:
        if (r02 == null) goto L8;
        if (r02.f3369a.equals(r3) == true) goto L8;
        r02 = r02.f3371c;
    L8:
        return r02;
    }

    /* JADX INFO: renamed from: b */
    public Object mo2282b(Object r4) {
        C0950c r42 = mo2281a(r4);
        if (r42 != null) goto L5;
        return null;
    L5:
        this.f3379d--;
        WeakHashMap r1 = this.f3378c;
        if (r1.isEmpty() == true) goto L11;
        Iterator r12 = r1.keySet().iterator();
    L9:
        if (r12.hasNext() == false) goto L11;
        ((AbstractC0952e) r12.next()).mo2284a(r42);
    L11:
        C0950c r13 = r42.f3372d;
        if (r13 == null) goto L14;
        r13.f3371c = r42.f3371c;
    L15:
        C0950c r2 = r42.f3371c;
        if (r2 == null) goto L18;
        r2.f3372d = r13;
    L19:
        r42.f3371c = null;
        r42.f3372d = null;
        return r42.f3370b;
    L18:
        this.f3377b = r13;
        goto L19
    L14:
        this.f3376a = r42.f3371c;
        goto L15
    }

    public final boolean equals(Object r7) {
        if (r7 != this) goto L6;
        return true;
    L6:
        if ((r7 instanceof C0953f) == true) goto L8;
        return false;
    L8:
        C0953f r72 = (C0953f) r7;
        if (this.f3379d == r72.f3379d) goto L11;
        return false;
    L11:
        Iterator r1 = iterator();
        Iterator r73 = r72.iterator();
    L12:
        C0949b r3 = (C0949b) r1;
        if (r3.hasNext() == false) goto L24;
        C0949b r4 = (C0949b) r73;
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
        if (r3.hasNext() == true) goto L29;
        if (((C0949b) r73).hasNext() == true) goto L29;
        return true;
    L29:
        return false;
    }

    public final int hashCode() {
        Iterator r02 = iterator();
        int r1 = 0;
    L3:
        C0949b r2 = (C0949b) r02;
        if (r2.hasNext() == false) goto L6;
        r1 = r1 + ((Map.Entry) r2.next()).hashCode();
        goto L3
    L6:
        return r1;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0949b r02 = new C0949b(this.f3376a, this.f3377b, 0);
        this.f3378c.put(r02, Boolean.FALSE);
        return r02;
    }

    public final String toString() {
        StringBuilder r02 = new StringBuilder("[");
        Iterator r1 = iterator();
    L3:
        C0949b r2 = (C0949b) r1;
        if (r2.hasNext() == false) goto L8;
        r02.append(((Map.Entry) r2.next()).toString());
        if (r2.hasNext() == false) goto L3;
        r02.append(", ");
        goto L3
    L8:
        r02.append("]");
        return r02.toString();
    }
}

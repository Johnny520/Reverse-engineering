package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class o10 implements Iterable {

    /* JADX INFO: renamed from: a */
    public l10 f3471a;

    /* JADX INFO: renamed from: b */
    public l10 f3472b;

    /* JADX INFO: renamed from: c */
    public final WeakHashMap f3473c = new WeakHashMap();

    /* JADX INFO: renamed from: d */
    public int f3474d = 0;

    /* JADX INFO: renamed from: a */
    public l10 mo1983a(Object obj) {
        l10 l10Var = this.f3471a;
        while (l10Var != null && !l10Var.f2988a.equals(obj)) {
            l10Var = l10Var.f2990c;
        }
        return l10Var;
    }

    /* JADX INFO: renamed from: b */
    public Object mo1984b(Object obj) {
        l10 l10VarMo1983a = mo1983a(obj);
        if (l10VarMo1983a == null) {
            return null;
        }
        this.f3474d--;
        WeakHashMap weakHashMap = this.f3473c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((n10) it.next()).mo1616a(l10VarMo1983a);
            }
        }
        l10 l10Var = l10VarMo1983a.f2991d;
        if (l10Var != null) {
            l10Var.f2990c = l10VarMo1983a.f2990c;
        } else {
            this.f3471a = l10VarMo1983a.f2990c;
        }
        l10 l10Var2 = l10VarMo1983a.f2990c;
        if (l10Var2 != null) {
            l10Var2.f2991d = l10Var;
        } else {
            this.f3472b = l10Var;
        }
        l10VarMo1983a.f2990c = null;
        l10VarMo1983a.f2991d = null;
        return l10VarMo1983a.f2989b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((p000.k10) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof p000.o10
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            o10 r7 = (p000.o10) r7
            int r1 = r6.f3474d
            int r3 = r7.f3474d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            k10 r3 = (p000.k10) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            k10 r4 = (p000.k10) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            k10 r7 = (p000.k10) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.o10.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            k10 k10Var = (k10) it;
            if (!k10Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) k10Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        k10 k10Var = new k10(this.f3471a, this.f3472b, 0);
        this.f3473c.put(k10Var, Boolean.FALSE);
        return k10Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            k10 k10Var = (k10) it;
            if (!k10Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) k10Var.next()).toString());
            if (k10Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}

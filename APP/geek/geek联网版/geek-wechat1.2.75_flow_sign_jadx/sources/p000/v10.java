package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class v10 implements Iterable {

    /* JADX INFO: renamed from: a */
    public s10 f4872a;

    /* JADX INFO: renamed from: b */
    public s10 f4873b;

    /* JADX INFO: renamed from: c */
    public final WeakHashMap f4874c = new WeakHashMap();

    /* JADX INFO: renamed from: d */
    public int f4875d = 0;

    /* JADX INFO: renamed from: a */
    public s10 mo2531a(Object obj) {
        s10 s10Var = this.f4872a;
        while (s10Var != null && !s10Var.f4187a.equals(obj)) {
            s10Var = s10Var.f4189c;
        }
        return s10Var;
    }

    /* JADX INFO: renamed from: b */
    public Object mo2532b(Object obj) {
        s10 s10VarMo2531a = mo2531a(obj);
        if (s10VarMo2531a == null) {
            return null;
        }
        this.f4875d--;
        WeakHashMap weakHashMap = this.f4874c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((u10) it.next()).mo2195a(s10VarMo2531a);
            }
        }
        s10 s10Var = s10VarMo2531a.f4190d;
        if (s10Var != null) {
            s10Var.f4189c = s10VarMo2531a.f4189c;
        } else {
            this.f4872a = s10VarMo2531a.f4189c;
        }
        s10 s10Var2 = s10VarMo2531a.f4189c;
        if (s10Var2 != null) {
            s10Var2.f4190d = s10Var;
        } else {
            this.f4873b = s10Var;
        }
        s10VarMo2531a.f4189c = null;
        s10VarMo2531a.f4190d = null;
        return s10VarMo2531a.f4188b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((p000.r10) r7).hasNext() != false) goto L28;
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
            boolean r1 = r7 instanceof p000.v10
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            v10 r7 = (p000.v10) r7
            int r1 = r6.f4875d
            int r3 = r7.f4875d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            r10 r3 = (p000.r10) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            r10 r4 = (p000.r10) r4
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
            r10 r7 = (p000.r10) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v10.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            r10 r10Var = (r10) it;
            if (!r10Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) r10Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        r10 r10Var = new r10(this.f4872a, this.f4873b, 0);
        this.f4874c.put(r10Var, Boolean.FALSE);
        return r10Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            r10 r10Var = (r10) it;
            if (!r10Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) r10Var.next()).toString());
            if (r10Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}

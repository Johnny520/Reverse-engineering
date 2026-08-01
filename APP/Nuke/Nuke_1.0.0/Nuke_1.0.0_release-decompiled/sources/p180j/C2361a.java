package p180j;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: j.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2361a implements Iterable {

    /* JADX INFO: renamed from: d */
    public C2363c f7658d;

    /* JADX INFO: renamed from: e */
    public C2363c f7659e;

    /* JADX INFO: renamed from: f */
    public final WeakHashMap f7660f = new WeakHashMap();

    /* JADX INFO: renamed from: g */
    public int f7661g = 0;

    /* JADX INFO: renamed from: h */
    public final HashMap f7662h = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((p180j.C2362b) r7).hasNext() != false) goto L28;
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
            boolean r1 = r7 instanceof p180j.C2361a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            j.a r7 = (p180j.C2361a) r7
            int r1 = r6.f7661g
            int r3 = r7.f7661g
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            j.b r3 = (p180j.C2362b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            j.b r4 = (p180j.C2362b) r4
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
            j.b r7 = (p180j.C2362b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p180j.C2361a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C2362b c2362b = (C2362b) it;
            if (!c2362b.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c2362b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2362b c2362b = new C2362b(this.f7658d, this.f7659e, 0);
        this.f7660f.put(c2362b, Boolean.FALSE);
        return c2362b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C2362b c2362b = (C2362b) it;
            if (!c2362b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c2362b.next()).toString());
            if (c2362b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}

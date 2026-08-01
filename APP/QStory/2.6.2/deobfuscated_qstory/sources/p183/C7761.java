package p183;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C7761 implements Iterable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C7764 f21055;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C7764 f21057;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final WeakHashMap f21056 = new WeakHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f21054 = 0;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((p183.C7765) r6).hasNext() != false) goto L28;
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
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p183.C7761
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            飘花落叶言子楪哲世苏兰.飘花落叶言子楪世兰哲苏 r6 = (p183.C7761) r6
            int r1 = r5.f21054
            int r3 = r6.f21054
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            r1 = r5
            飘花落叶言子楪哲世苏兰.飘花落叶言子楪世苏兰哲 r1 = (p183.C7765) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            r3 = r6
            飘花落叶言子楪哲世苏兰.飘花落叶言子楪世苏兰哲 r3 = (p183.C7765) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L3b
            if (r3 != 0) goto L43
        L3b:
            if (r1 == 0) goto L1b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L53
            飘花落叶言子楪哲世苏兰.飘花落叶言子楪世苏兰哲 r6 = (p183.C7765) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p183.C7761.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C7765 c7765 = (C7765) it;
            if (!c7765.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c7765.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C7765 c7765 = new C7765(this.f21057, this.f21055, 0);
        this.f21056.put(c7765, Boolean.FALSE);
        return c7765;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C7765 c7765 = (C7765) it;
            if (!c7765.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c7765.next()).toString());
            if (c7765.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object mo13087(Object obj) {
        C7764 c7764Mo13088 = mo13088(obj);
        if (c7764Mo13088 == null) {
            return null;
        }
        this.f21054--;
        WeakHashMap weakHashMap = this.f21056;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC7762) it.next()).mo13089(c7764Mo13088);
            }
        }
        C7764 c7764 = c7764Mo13088.f21061;
        C7764 c77642 = c7764Mo13088.f21063;
        if (c7764 != null) {
            c7764.f21063 = c77642;
        } else {
            this.f21057 = c77642;
        }
        C7764 c77643 = c7764Mo13088.f21063;
        if (c77643 != null) {
            c77643.f21061 = c7764;
        } else {
            this.f21055 = c7764;
        }
        c7764Mo13088.f21063 = null;
        c7764Mo13088.f21061 = null;
        return c7764Mo13088.f21062;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C7764 mo13088(Object obj) {
        C7764 c7764 = this.f21057;
        while (c7764 != null && !c7764.f21064.equals(obj)) {
            c7764 = c7764.f21063;
        }
        return c7764;
    }
}

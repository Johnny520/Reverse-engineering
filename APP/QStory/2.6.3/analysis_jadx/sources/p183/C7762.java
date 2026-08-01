package p183;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C7762 implements Iterable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C7765 f21052;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C7765 f21054;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final WeakHashMap f21053 = new WeakHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f21051 = 0;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((p183.C7766) r6).hasNext() != false) goto L28;
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
            boolean r1 = r6 instanceof p183.C7762
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            飘花落叶言子楪哲世苏兰.飘花落叶言子楪世兰哲苏 r6 = (p183.C7762) r6
            int r1 = r5.f21051
            int r3 = r6.f21051
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            r1 = r5
            飘花落叶言子楪哲世苏兰.飘花落叶言子楪世苏兰哲 r1 = (p183.C7766) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            r3 = r6
            飘花落叶言子楪哲世苏兰.飘花落叶言子楪世苏兰哲 r3 = (p183.C7766) r3
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
            飘花落叶言子楪哲世苏兰.飘花落叶言子楪世苏兰哲 r6 = (p183.C7766) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p183.C7762.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C7766 c7766 = (C7766) it;
            if (!c7766.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c7766.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C7766 c7766 = new C7766(this.f21054, this.f21052, 0);
        this.f21053.put(c7766, Boolean.FALSE);
        return c7766;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C7766 c7766 = (C7766) it;
            if (!c7766.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c7766.next()).toString());
            if (c7766.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object mo13115(Object obj) {
        C7765 c7765Mo13116 = mo13116(obj);
        if (c7765Mo13116 == null) {
            return null;
        }
        this.f21051--;
        WeakHashMap weakHashMap = this.f21053;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC7763) it.next()).mo13117(c7765Mo13116);
            }
        }
        C7765 c7765 = c7765Mo13116.f21058;
        C7765 c77652 = c7765Mo13116.f21060;
        if (c7765 != null) {
            c7765.f21060 = c77652;
        } else {
            this.f21054 = c77652;
        }
        C7765 c77653 = c7765Mo13116.f21060;
        if (c77653 != null) {
            c77653.f21058 = c7765;
        } else {
            this.f21052 = c7765;
        }
        c7765Mo13116.f21060 = null;
        c7765Mo13116.f21058 = null;
        return c7765Mo13116.f21059;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C7765 mo13116(Object obj) {
        C7765 c7765 = this.f21054;
        while (c7765 != null && !c7765.f21061.equals(obj)) {
            c7765 = c7765.f21060;
        }
        return c7765;
    }
}

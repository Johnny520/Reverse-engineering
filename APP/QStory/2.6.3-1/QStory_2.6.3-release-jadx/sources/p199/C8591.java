package p199;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8591 implements Iterable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C8594 f21397;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C8594 f21399;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final WeakHashMap f21398 = new WeakHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f21396 = 0;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((p199.C8595) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8591)) {
            return false;
        }
        C8591 c8591 = (C8591) obj;
        if (this.f21396 != c8591.f21396) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c8591.iterator();
        while (true) {
            C8595 c8595 = (C8595) it;
            if (!c8595.hasNext()) {
                break;
            }
            C8595 c85952 = (C8595) it2;
            if (!c85952.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c8595.next();
            Object next = c85952.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                break;
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C8595 c8595 = (C8595) it;
            if (!c8595.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c8595.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C8595 c8595 = new C8595(this.f21399, this.f21397, 0);
        this.f21398.put(c8595, Boolean.FALSE);
        return c8595;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C8595 c8595 = (C8595) it;
            if (!c8595.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c8595.next()).toString());
            if (c8595.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object mo13674(Object obj) {
        C8594 c8594Mo13675 = mo13675(obj);
        if (c8594Mo13675 == null) {
            return null;
        }
        this.f21396--;
        WeakHashMap weakHashMap = this.f21398;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC8592) it.next()).mo13676(c8594Mo13675);
            }
        }
        C8594 c8594 = c8594Mo13675.f21403;
        C8594 c85942 = c8594Mo13675.f21405;
        if (c8594 != null) {
            c8594.f21405 = c85942;
        } else {
            this.f21399 = c85942;
        }
        C8594 c85943 = c8594Mo13675.f21405;
        if (c85943 != null) {
            c85943.f21403 = c8594;
        } else {
            this.f21397 = c8594;
        }
        c8594Mo13675.f21405 = null;
        c8594Mo13675.f21403 = null;
        return c8594Mo13675.f21404;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C8594 mo13675(Object obj) {
        C8594 c8594 = this.f21399;
        while (c8594 != null && !c8594.f21406.equals(obj)) {
            c8594 = c8594.f21405;
        }
        return c8594;
    }
}

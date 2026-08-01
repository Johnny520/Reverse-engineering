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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2361a)) {
            return false;
        }
        C2361a c2361a = (C2361a) obj;
        if (this.f7661g != c2361a.f7661g) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c2361a.iterator();
        while (true) {
            C2362b c2362b = (C2362b) it;
            if (!c2362b.hasNext()) {
                break;
            }
            C2362b c2362b2 = (C2362b) it2;
            if (!c2362b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c2362b.next();
            Object next = c2362b2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                break;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2362b c2362b = new C2362b(this.f7658d, this.f7659e, 0);
        this.f7660f.put(c2362b, Boolean.FALSE);
        return c2362b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

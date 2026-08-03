package p055e;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: e.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0796a implements Iterable {

    /* JADX INFO: renamed from: g */
    public C0798c f2383g;

    /* JADX INFO: renamed from: h */
    public C0798c f2384h;

    /* JADX INFO: renamed from: i */
    public final WeakHashMap f2385i = new WeakHashMap();

    /* JADX INFO: renamed from: j */
    public int f2386j = 0;

    /* JADX INFO: renamed from: k */
    public final HashMap f2387k = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((p055e.C0797b) r7).hasNext() != false) goto L28;
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
        if (!(obj instanceof C0796a)) {
            return false;
        }
        C0796a c0796a = (C0796a) obj;
        if (this.f2386j != c0796a.f2386j) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0796a.iterator();
        while (true) {
            C0797b c0797b = (C0797b) it;
            if (!c0797b.hasNext()) {
                break;
            }
            C0797b c0797b2 = (C0797b) it2;
            if (!c0797b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c0797b.next();
            Object next = c0797b2.next();
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
            C0797b c0797b = (C0797b) it;
            if (!c0797b.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c0797b.next()).hashCode();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0797b c0797b = new C0797b(this.f2383g, this.f2384h, 0);
        this.f2385i.put(c0797b, Boolean.FALSE);
        return c0797b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0797b c0797b = (C0797b) it;
            if (!c0797b.hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(((Map.Entry) c0797b.next()).toString());
            if (c0797b.hasNext()) {
                sb2.append(", ");
            }
        }
    }
}

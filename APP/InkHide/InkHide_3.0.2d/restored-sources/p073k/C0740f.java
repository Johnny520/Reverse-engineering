package p073k;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: k.f */
/* JADX INFO: loaded from: classes.dex */
public class C0740f implements Iterable {

    /* JADX INFO: renamed from: a */
    public C0737c f2501a;

    /* JADX INFO: renamed from: b */
    public C0737c f2502b;

    /* JADX INFO: renamed from: c */
    public final WeakHashMap f2503c = new WeakHashMap();

    /* JADX INFO: renamed from: d */
    public int f2504d = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public C0737c mo1389a(Object obj) {
        C0737c c0737c = this.f2501a;
        while (c0737c != null && !c0737c.f2494a.equals(obj)) {
            c0737c = c0737c.f2496c;
        }
        return c0737c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((p073k.C0736b) r7).hasNext() != false) goto L28;
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
        if (!(obj instanceof C0740f)) {
            return false;
        }
        C0740f c0740f = (C0740f) obj;
        if (this.f2504d != c0740f.f2504d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0740f.iterator();
        while (true) {
            C0736b c0736b = (C0736b) it;
            if (!c0736b.hasNext()) {
                break;
            }
            C0736b c0736b2 = (C0736b) it2;
            if (!c0736b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c0736b.next();
            Object next = c0736b2.next();
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
            C0736b c0736b = (C0736b) it;
            if (!c0736b.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c0736b.next()).hashCode();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0736b c0736b = new C0736b(this.f2501a, this.f2502b, 0);
        this.f2503c.put(c0736b, Boolean.FALSE);
        return c0736b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0736b c0736b = (C0736b) it;
            if (!c0736b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0736b.next()).toString());
            if (c0736b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}

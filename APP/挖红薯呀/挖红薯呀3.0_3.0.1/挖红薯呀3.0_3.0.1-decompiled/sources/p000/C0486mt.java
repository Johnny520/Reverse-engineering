package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: mt */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0486mt implements Iterable {

    /* JADX INFO: renamed from: d */
    public rw0 f4032d;

    /* JADX INFO: renamed from: e */
    public rw0 f4033e;

    /* JADX INFO: renamed from: f */
    public final WeakHashMap f4034f = new WeakHashMap();

    /* JADX INFO: renamed from: g */
    public int f4035g = 0;

    /* JADX INFO: renamed from: h */
    public final HashMap f4036h = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((p000.qw0) r6).hasNext() != false) goto L28;
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
        if (!(obj instanceof C0486mt)) {
            return false;
        }
        C0486mt c0486mt = (C0486mt) obj;
        if (this.f4035g != c0486mt.f4035g) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0486mt.iterator();
        while (true) {
            qw0 qw0Var = (qw0) it;
            if (!qw0Var.hasNext()) {
                break;
            }
            qw0 qw0Var2 = (qw0) it2;
            if (!qw0Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) qw0Var.next();
            Object next = qw0Var2.next();
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
            qw0 qw0Var = (qw0) it;
            if (!qw0Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) qw0Var.next()).hashCode();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        qw0 qw0Var = new qw0(this.f4032d, this.f4033e, 0);
        this.f4034f.put(qw0Var, Boolean.FALSE);
        return qw0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            qw0 qw0Var = (qw0) it;
            if (!qw0Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) qw0Var.next()).toString());
            if (qw0Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}

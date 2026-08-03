package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Xw */
/* JADX INFO: loaded from: classes.dex */
public class C1027Xw implements Iterable {

    /* JADX INFO: renamed from: a */
    public C0898Uw f3269a;

    /* JADX INFO: renamed from: b */
    public C0898Uw f3270b;

    /* JADX INFO: renamed from: c */
    public final WeakHashMap f3271c = new WeakHashMap();

    /* JADX INFO: renamed from: d */
    public int f3272d = 0;

    /* JADX INFO: renamed from: a */
    public C0898Uw mo1943a(Object obj) {
        C0898Uw c0898Uw = this.f3269a;
        while (c0898Uw != null && !c0898Uw.f2791a.equals(obj)) {
            c0898Uw = c0898Uw.f2793c;
        }
        return c0898Uw;
    }

    /* JADX INFO: renamed from: b */
    public Object mo1944b(Object obj) {
        C0898Uw c0898UwMo1943a = mo1943a(obj);
        if (c0898UwMo1943a == null) {
            return null;
        }
        this.f3272d--;
        WeakHashMap weakHashMap = this.f3271c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0984Ww) it.next()).mo1688a(c0898UwMo1943a);
            }
        }
        C0898Uw c0898Uw = c0898UwMo1943a.f2794d;
        if (c0898Uw != null) {
            c0898Uw.f2793c = c0898UwMo1943a.f2793c;
        } else {
            this.f3269a = c0898UwMo1943a.f2793c;
        }
        C0898Uw c0898Uw2 = c0898UwMo1943a.f2793c;
        if (c0898Uw2 != null) {
            c0898Uw2.f2794d = c0898Uw;
        } else {
            this.f3270b = c0898Uw;
        }
        c0898UwMo1943a.f2793c = null;
        c0898UwMo1943a.f2794d = null;
        return c0898UwMo1943a.f2792b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((p000.C0855Tw) r7).hasNext() != false) goto L28;
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
        if (!(obj instanceof C1027Xw)) {
            return false;
        }
        C1027Xw c1027Xw = (C1027Xw) obj;
        if (this.f3272d != c1027Xw.f3272d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c1027Xw.iterator();
        while (true) {
            C0855Tw c0855Tw = (C0855Tw) it;
            if (!c0855Tw.hasNext()) {
                break;
            }
            C0855Tw c0855Tw2 = (C0855Tw) it2;
            if (!c0855Tw2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c0855Tw.next();
            Object next = c0855Tw2.next();
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
            C0855Tw c0855Tw = (C0855Tw) it;
            if (!c0855Tw.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c0855Tw.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0855Tw c0855Tw = new C0855Tw(this.f3269a, this.f3270b, 0);
        this.f3271c.put(c0855Tw, Boolean.FALSE);
        return c0855Tw;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0855Tw c0855Tw = (C0855Tw) it;
            if (!c0855Tw.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0855Tw.next()).toString());
            if (c0855Tw.hasNext()) {
                sb.append(", ");
            }
        }
    }
}

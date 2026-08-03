package p061i;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: i.f */
/* JADX INFO: loaded from: classes.dex */
public class C0953f implements Iterable {

    /* JADX INFO: renamed from: a */
    public C0950c f3376a;

    /* JADX INFO: renamed from: b */
    public C0950c f3377b;

    /* JADX INFO: renamed from: c */
    public final WeakHashMap f3378c = new WeakHashMap();

    /* JADX INFO: renamed from: d */
    public int f3379d = 0;

    /* JADX INFO: renamed from: a */
    public C0950c mo2281a(Object obj) {
        C0950c c0950c = this.f3376a;
        while (c0950c != null && !c0950c.f3369a.equals(obj)) {
            c0950c = c0950c.f3371c;
        }
        return c0950c;
    }

    /* JADX INFO: renamed from: b */
    public Object mo2282b(Object obj) {
        C0950c c0950cMo2281a = mo2281a(obj);
        if (c0950cMo2281a == null) {
            return null;
        }
        this.f3379d--;
        WeakHashMap weakHashMap = this.f3378c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0952e) it.next()).mo2284a(c0950cMo2281a);
            }
        }
        C0950c c0950c = c0950cMo2281a.f3372d;
        if (c0950c != null) {
            c0950c.f3371c = c0950cMo2281a.f3371c;
        } else {
            this.f3376a = c0950cMo2281a.f3371c;
        }
        C0950c c0950c2 = c0950cMo2281a.f3371c;
        if (c0950c2 != null) {
            c0950c2.f3372d = c0950c;
        } else {
            this.f3377b = c0950c;
        }
        c0950cMo2281a.f3371c = null;
        c0950cMo2281a.f3372d = null;
        return c0950cMo2281a.f3370b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((p061i.C0949b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0953f)) {
            return false;
        }
        C0953f c0953f = (C0953f) obj;
        if (this.f3379d != c0953f.f3379d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0953f.iterator();
        while (true) {
            C0949b c0949b = (C0949b) it;
            if (!c0949b.hasNext()) {
                break;
            }
            C0949b c0949b2 = (C0949b) it2;
            if (!c0949b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c0949b.next();
            Object next = c0949b2.next();
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
            C0949b c0949b = (C0949b) it;
            if (!c0949b.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c0949b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0949b c0949b = new C0949b(this.f3376a, this.f3377b, 0);
        this.f3378c.put(c0949b, Boolean.FALSE);
        return c0949b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0949b c0949b = (C0949b) it;
            if (!c0949b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0949b.next()).toString());
            if (c0949b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}

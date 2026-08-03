package p001;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ۟.e9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0200e9<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: ۥ */
    public WeakHashMap<Object, Boolean> f766 = new WeakHashMap<>();

    /* JADX INFO: renamed from: ۥ۟ */
    public int f767 = 0;

    /* JADX INFO: renamed from: ۟.e9$a */
    public static class a<K, V> extends c<K, V> {
        public a(b<K, V> bVar, b<K, V> bVar2) {
            super(bVar, bVar2);
        }
    }

    /* JADX INFO: renamed from: ۟.e9$b */
    public static class b<K, V> implements Map.Entry<K, V> {
    }

    /* JADX INFO: renamed from: ۟.e9$c */
    public static abstract class c<K, V> implements Iterator<Map.Entry<K, V>> {
        public c(b<K, V> bVar, b<K, V> bVar2) {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((p001.C0200e9.c) r7).hasNext() != false) goto L28;
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
        if (!(obj instanceof C0200e9)) {
            return false;
        }
        C0200e9 c0200e9 = (C0200e9) obj;
        if (this.f767 != c0200e9.f767) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c0200e9.iterator();
        while (true) {
            c cVar = (c) it;
            if (!cVar.hasNext()) {
                break;
            }
            c cVar2 = (c) it2;
            if (!cVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) cVar.next();
            Object next = cVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                break;
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (true) {
            c cVar = (c) it;
            if (!cVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) cVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(null, null);
        this.f766.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1039 = C0167c4.m1039("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            c cVar = (c) it;
            if (!cVar.hasNext()) {
                sbM1039.append("]");
                return sbM1039.toString();
            }
            sbM1039.append(((Map.Entry) cVar.next()).toString());
            if (cVar.hasNext()) {
                sbM1039.append(", ");
            }
        }
    }
}

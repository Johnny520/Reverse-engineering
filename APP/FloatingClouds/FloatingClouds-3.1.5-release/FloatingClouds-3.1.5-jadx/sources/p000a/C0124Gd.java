package p000a;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: a.Gd */
/* JADX INFO: loaded from: classes.dex */
public class C0124Gd<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a */
    public c<K, V> f405a;

    /* JADX INFO: renamed from: b */
    public c<K, V> f406b;

    /* JADX INFO: renamed from: c */
    public final WeakHashMap<f<K, V>, Boolean> f407c = new WeakHashMap<>();

    /* JADX INFO: renamed from: d */
    public int f408d = 0;

    /* JADX INFO: renamed from: a.Gd$a */
    public static class a<K, V> extends e<K, V> {
        @Override // p000a.C0124Gd.e
        /* JADX INFO: renamed from: b */
        public final c<K, V> mo326b(c<K, V> cVar) {
            return cVar.f412d;
        }

        @Override // p000a.C0124Gd.e
        /* JADX INFO: renamed from: c */
        public final c<K, V> mo327c(c<K, V> cVar) {
            return cVar.f411c;
        }
    }

    /* JADX INFO: renamed from: a.Gd$b */
    public static class b<K, V> extends e<K, V> {
        @Override // p000a.C0124Gd.e
        /* JADX INFO: renamed from: b */
        public final c<K, V> mo326b(c<K, V> cVar) {
            return cVar.f411c;
        }

        @Override // p000a.C0124Gd.e
        /* JADX INFO: renamed from: c */
        public final c<K, V> mo327c(c<K, V> cVar) {
            return cVar.f412d;
        }
    }

    /* JADX INFO: renamed from: a.Gd$c */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f409a;

        /* JADX INFO: renamed from: b */
        public final V f410b;

        /* JADX INFO: renamed from: c */
        public c<K, V> f411c;

        /* JADX INFO: renamed from: d */
        public c<K, V> f412d;

        public c(K k, V v) {
            this.f409a = k;
            this.f410b = v;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f409a.equals(cVar.f409a) && this.f410b.equals(cVar.f410b);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f409a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f410b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f409a.hashCode() ^ this.f410b.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f409a + "=" + this.f410b;
        }
    }

    /* JADX INFO: renamed from: a.Gd$d */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public c<K, V> f413a;

        /* JADX INFO: renamed from: b */
        public boolean f414b = true;

        public d() {
        }

        @Override // p000a.C0124Gd.f
        /* JADX INFO: renamed from: a */
        public final void mo328a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f413a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f412d;
                this.f413a = cVar3;
                this.f414b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f414b) {
                return C0124Gd.this.f405a != null;
            }
            c<K, V> cVar = this.f413a;
            return (cVar == null || cVar.f411c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f414b) {
                this.f414b = false;
                this.f413a = C0124Gd.this.f405a;
            } else {
                c<K, V> cVar = this.f413a;
                this.f413a = cVar != null ? cVar.f411c : null;
            }
            return this.f413a;
        }
    }

    /* JADX INFO: renamed from: a.Gd$e */
    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public c<K, V> f416a;

        /* JADX INFO: renamed from: b */
        public c<K, V> f417b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f416a = cVar2;
            this.f417b = cVar;
        }

        @Override // p000a.C0124Gd.f
        /* JADX INFO: renamed from: a */
        public final void mo328a(c<K, V> cVar) {
            c<K, V> cVarMo327c = null;
            if (this.f416a == cVar && cVar == this.f417b) {
                this.f417b = null;
                this.f416a = null;
            }
            c<K, V> cVar2 = this.f416a;
            if (cVar2 == cVar) {
                this.f416a = mo326b(cVar2);
            }
            c<K, V> cVar3 = this.f417b;
            if (cVar3 == cVar) {
                c<K, V> cVar4 = this.f416a;
                if (cVar3 != cVar4 && cVar4 != null) {
                    cVarMo327c = mo327c(cVar3);
                }
                this.f417b = cVarMo327c;
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract c<K, V> mo326b(c<K, V> cVar);

        /* JADX INFO: renamed from: c */
        public abstract c<K, V> mo327c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f417b != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar = this.f417b;
            c<K, V> cVar2 = this.f416a;
            this.f417b = (cVar == cVar2 || cVar2 == null) ? null : mo327c(cVar);
            return cVar;
        }
    }

    /* JADX INFO: renamed from: a.Gd$f */
    public static abstract class f<K, V> {
        /* JADX INFO: renamed from: a */
        public abstract void mo328a(c<K, V> cVar);
    }

    /* JADX INFO: renamed from: a */
    public c<K, V> mo324a(K k) {
        c<K, V> cVar = this.f405a;
        while (cVar != null && !cVar.f409a.equals(k)) {
            cVar = cVar.f411c;
        }
        return cVar;
    }

    /* JADX INFO: renamed from: b */
    public V mo325b(K k) {
        c<K, V> cVarMo324a = mo324a(k);
        if (cVarMo324a == null) {
            return null;
        }
        this.f408d--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.f407c;
        if (!weakHashMap.isEmpty()) {
            Iterator<f<K, V>> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo328a(cVarMo324a);
            }
        }
        c<K, V> cVar = cVarMo324a.f412d;
        if (cVar != null) {
            cVar.f411c = cVarMo324a.f411c;
        } else {
            this.f405a = cVarMo324a.f411c;
        }
        c<K, V> cVar2 = cVarMo324a.f411c;
        if (cVar2 != null) {
            cVar2.f412d = cVar;
        } else {
            this.f406b = cVar;
        }
        cVarMo324a.f411c = null;
        cVarMo324a.f412d = null;
        return cVarMo324a.f410b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((p000a.C0124Gd.e) r7).hasNext() != false) goto L28;
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
        if (!(obj instanceof C0124Gd)) {
            return false;
        }
        C0124Gd c0124Gd = (C0124Gd) obj;
        if (this.f408d != c0124Gd.f408d) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c0124Gd.iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                break;
            }
            e eVar2 = (e) it2;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            Object next = eVar2.next();
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
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f405a, this.f406b);
        this.f407c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}

package p100h;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: h.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2799b implements Iterable {

    /* JADX INFO: renamed from: q */
    public c f7308q;

    /* JADX INFO: renamed from: r */
    public c f7309r;

    /* JADX INFO: renamed from: s */
    public final WeakHashMap f7310s = new WeakHashMap();

    /* JADX INFO: renamed from: t */
    public int f7311t = 0;

    /* JADX INFO: renamed from: h.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends e {
        public a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // p100h.AbstractC2799b.e
        /* JADX INFO: renamed from: d */
        public c mo9980d(c cVar) {
            return cVar.f7315t;
        }

        @Override // p100h.AbstractC2799b.e
        /* JADX INFO: renamed from: f */
        public c mo9981f(c cVar) {
            return cVar.f7314s;
        }
    }

    /* JADX INFO: renamed from: h.b$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b extends e {
        public b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // p100h.AbstractC2799b.e
        /* JADX INFO: renamed from: d */
        public c mo9980d(c cVar) {
            return cVar.f7314s;
        }

        @Override // p100h.AbstractC2799b.e
        /* JADX INFO: renamed from: f */
        public c mo9981f(c cVar) {
            return cVar.f7315t;
        }
    }

    /* JADX INFO: renamed from: h.b$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c implements Map.Entry {

        /* JADX INFO: renamed from: q */
        public final Object f7312q;

        /* JADX INFO: renamed from: r */
        public final Object f7313r;

        /* JADX INFO: renamed from: s */
        public c f7314s;

        /* JADX INFO: renamed from: t */
        public c f7315t;

        public c(Object obj, Object obj2) {
            this.f7312q = obj;
            this.f7313r = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f7312q.equals(cVar.f7312q) && this.f7313r.equals(cVar.f7313r);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f7312q;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f7313r;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f7312q.hashCode() ^ this.f7313r.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f7312q + "=" + this.f7313r;
        }
    }

    /* JADX INFO: renamed from: h.b$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class d extends f implements Iterator {

        /* JADX INFO: renamed from: q */
        public c f7316q;

        /* JADX INFO: renamed from: r */
        public boolean f7317r = true;

        public d() {
        }

        @Override // p100h.AbstractC2799b.f
        /* JADX INFO: renamed from: b */
        public void mo9982b(c cVar) {
            c cVar2 = this.f7316q;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f7315t;
                this.f7316q = cVar3;
                this.f7317r = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f7317r) {
                this.f7317r = false;
                this.f7316q = AbstractC2799b.this.f7308q;
            } else {
                c cVar = this.f7316q;
                this.f7316q = cVar != null ? cVar.f7314s : null;
            }
            return this.f7316q;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f7317r) {
                return AbstractC2799b.this.f7308q != null;
            }
            c cVar = this.f7316q;
            return (cVar == null || cVar.f7314s == null) ? false : true;
        }
    }

    /* JADX INFO: renamed from: h.b$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class e extends f implements Iterator {

        /* JADX INFO: renamed from: q */
        public c f7319q;

        /* JADX INFO: renamed from: r */
        public c f7320r;

        public e(c cVar, c cVar2) {
            this.f7319q = cVar2;
            this.f7320r = cVar;
        }

        @Override // p100h.AbstractC2799b.f
        /* JADX INFO: renamed from: b */
        public void mo9982b(c cVar) {
            if (this.f7319q == cVar && cVar == this.f7320r) {
                this.f7320r = null;
                this.f7319q = null;
            }
            c cVar2 = this.f7319q;
            if (cVar2 == cVar) {
                this.f7319q = mo9980d(cVar2);
            }
            if (this.f7320r == cVar) {
                this.f7320r = m9985h();
            }
        }

        /* JADX INFO: renamed from: d */
        public abstract c mo9980d(c cVar);

        /* JADX INFO: renamed from: f */
        public abstract c mo9981f(c cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f7320r;
            this.f7320r = m9985h();
            return cVar;
        }

        /* JADX INFO: renamed from: h */
        public final c m9985h() {
            c cVar = this.f7320r;
            c cVar2 = this.f7319q;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo9981f(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7320r != null;
        }
    }

    /* JADX INFO: renamed from: h.b$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class f {
        /* JADX INFO: renamed from: b */
        public abstract void mo9982b(c cVar);
    }

    /* JADX INFO: renamed from: a */
    public Map.Entry m9976a() {
        return this.f7308q;
    }

    /* JADX INFO: renamed from: c */
    public abstract c mo9972c(Object obj);

    /* JADX INFO: renamed from: d */
    public d m9977d() {
        d dVar = new d();
        this.f7310s.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Iterator descendingIterator() {
        b bVar = new b(this.f7309r, this.f7308q);
        this.f7310s.put(bVar, Boolean.FALSE);
        return bVar;
    }

    /* JADX INFO: renamed from: e */
    public Map.Entry m9978e() {
        return this.f7309r;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2799b)) {
            return false;
        }
        AbstractC2799b abstractC2799b = (AbstractC2799b) obj;
        if (size() != abstractC2799b.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = abstractC2799b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public c m9979h(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f7311t++;
        c cVar2 = this.f7309r;
        if (cVar2 == null) {
            this.f7308q = cVar;
            this.f7309r = cVar;
            return cVar;
        }
        cVar2.f7314s = cVar;
        cVar.f7315t = cVar2;
        this.f7309r = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f7308q, this.f7309r);
        this.f7310s.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* JADX INFO: renamed from: l */
    public Object mo9973l(Object obj) {
        c cVarMo9972c = mo9972c(obj);
        if (cVarMo9972c == null) {
            return null;
        }
        this.f7311t--;
        if (!this.f7310s.isEmpty()) {
            Iterator it = this.f7310s.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).mo9982b(cVarMo9972c);
            }
        }
        c cVar = cVarMo9972c.f7315t;
        c cVar2 = cVarMo9972c.f7314s;
        if (cVar != null) {
            cVar.f7314s = cVar2;
        } else {
            this.f7308q = cVar2;
        }
        c cVar3 = cVarMo9972c.f7314s;
        if (cVar3 != null) {
            cVar3.f7315t = cVar;
        } else {
            this.f7309r = cVar;
        }
        cVarMo9972c.f7314s = null;
        cVarMo9972c.f7315t = null;
        return cVarMo9972c.f7313r;
    }

    public int size() {
        return this.f7311t;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb2.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}

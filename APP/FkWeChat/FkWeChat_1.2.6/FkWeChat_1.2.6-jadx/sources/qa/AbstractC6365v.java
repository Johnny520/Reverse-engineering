package qa;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p319w2.C9079i0;
import p376zd.C10010p0;
import qa.C6352i;

/* JADX INFO: renamed from: qa.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6365v extends AbstractMap {

    /* JADX INFO: renamed from: q */
    public final int f20046q;

    /* JADX INFO: renamed from: r */
    public List f20047r;

    /* JADX INFO: renamed from: s */
    public Map f20048s;

    /* JADX INFO: renamed from: t */
    public boolean f20049t;

    /* JADX INFO: renamed from: u */
    public volatile e f20050u;

    /* JADX INFO: renamed from: qa.v$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC6365v {
        public a(int i10) {
            super(i10, null);
        }

        @Override // qa.AbstractC6365v
        /* JADX INFO: renamed from: o */
        public void mo25305o() {
            if (!m25304n()) {
                for (int i10 = 0; i10 < m25301k(); i10++) {
                    Map.Entry entryM25300j = m25300j(i10);
                    if (((C6352i.b) entryM25300j.getKey()).mo25213e()) {
                        entryM25300j.setValue(Collections.unmodifiableList((List) entryM25300j.getValue()));
                    }
                }
                for (Map.Entry entry : m25302l()) {
                    if (((C6352i.b) entry.getKey()).mo25213e()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo25305o();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.m25306q((C6352i.b) obj, obj2);
        }
    }

    /* JADX INFO: renamed from: qa.v$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final Iterator f20051a = new a();

        /* JADX INFO: renamed from: b */
        public static final Iterable f20052b = new C10184b();

        /* JADX INFO: renamed from: qa.v$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static class a implements Iterator {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: qa.v$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static class C10184b implements Iterable {
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return b.f20051a;
            }
        }

        /* JADX INFO: renamed from: b */
        public static Iterable m25309b() {
            return f20052b;
        }
    }

    public AbstractC6365v(int i10) {
        this.f20046q = i10;
        this.f20047r = Collections.EMPTY_LIST;
        this.f20048s = Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: p */
    public static AbstractC6365v m25296p(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m25298g();
        if (!this.f20047r.isEmpty()) {
            this.f20047r.clear();
        }
        if (this.f20048s.isEmpty()) {
            return;
        }
        this.f20048s.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m25297f(comparable) >= 0 || this.f20048s.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f20050u == null) {
            this.f20050u = new e(this, null);
        }
        return this.f20050u;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m25297f(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f20047r
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.f20047r
            java.lang.Object r2 = r2.get(r1)
            qa.v$c r2 = (qa.AbstractC6365v.c) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r5 = -r0
            return r5
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f20047r
            java.lang.Object r3 = r3.get(r2)
            qa.v$c r3 = (qa.AbstractC6365v.c) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.AbstractC6365v.m25297f(java.lang.Comparable):int");
    }

    /* JADX INFO: renamed from: g */
    public final void m25298g() {
        if (this.f20049t) {
            C9079i0.m35296a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM25297f = m25297f(comparable);
        return iM25297f >= 0 ? ((c) this.f20047r.get(iM25297f)).getValue() : this.f20048s.get(comparable);
    }

    /* JADX INFO: renamed from: i */
    public final void m25299i() {
        m25298g();
        if (!this.f20047r.isEmpty() || (this.f20047r instanceof ArrayList)) {
            return;
        }
        this.f20047r = new ArrayList(this.f20046q);
    }

    /* JADX INFO: renamed from: j */
    public Map.Entry m25300j(int i10) {
        return (Map.Entry) this.f20047r.get(i10);
    }

    /* JADX INFO: renamed from: k */
    public int m25301k() {
        return this.f20047r.size();
    }

    /* JADX INFO: renamed from: l */
    public Iterable m25302l() {
        return this.f20048s.isEmpty() ? b.m25309b() : this.f20048s.entrySet();
    }

    /* JADX INFO: renamed from: m */
    public final SortedMap m25303m() {
        m25298g();
        if (this.f20048s.isEmpty() && !(this.f20048s instanceof TreeMap)) {
            this.f20048s = new TreeMap();
        }
        return (SortedMap) this.f20048s;
    }

    /* JADX INFO: renamed from: n */
    public boolean m25304n() {
        return this.f20049t;
    }

    /* JADX INFO: renamed from: o */
    public void mo25305o() {
        if (this.f20049t) {
            return;
        }
        this.f20048s = this.f20048s.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f20048s);
        this.f20049t = true;
    }

    /* JADX INFO: renamed from: q */
    public Object m25306q(Comparable comparable, Object obj) {
        m25298g();
        int iM25297f = m25297f(comparable);
        if (iM25297f >= 0) {
            return ((c) this.f20047r.get(iM25297f)).setValue(obj);
        }
        m25299i();
        int i10 = -(iM25297f + 1);
        if (i10 >= this.f20046q) {
            return m25303m().put(comparable, obj);
        }
        int size = this.f20047r.size();
        int i11 = this.f20046q;
        if (size == i11) {
            c cVar = (c) this.f20047r.remove(i11 - 1);
            m25303m().put(cVar.getKey(), cVar.getValue());
        }
        this.f20047r.add(i10, new c(comparable, obj));
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final Object m25307r(int i10) {
        m25298g();
        Object value = ((c) this.f20047r.remove(i10)).getValue();
        if (!this.f20048s.isEmpty()) {
            Iterator it = m25303m().entrySet().iterator();
            this.f20047r.add(new c(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        m25298g();
        Comparable comparable = (Comparable) obj;
        int iM25297f = m25297f(comparable);
        if (iM25297f >= 0) {
            return m25307r(iM25297f);
        }
        if (this.f20048s.isEmpty()) {
            return null;
        }
        return this.f20048s.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f20047r.size() + this.f20048s.size();
    }

    /* JADX INFO: renamed from: qa.v$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class e extends AbstractSet {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            AbstractC6365v.this.m25306q((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC6365v.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = AbstractC6365v.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new d(AbstractC6365v.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            AbstractC6365v.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC6365v.this.size();
        }

        public /* synthetic */ e(AbstractC6365v abstractC6365v, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: qa.v$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class d implements Iterator {

        /* JADX INFO: renamed from: q */
        public int f20056q;

        /* JADX INFO: renamed from: r */
        public boolean f20057r;

        /* JADX INFO: renamed from: s */
        public Iterator f20058s;

        public d() {
            this.f20056q = -1;
        }

        /* JADX INFO: renamed from: b */
        public final Iterator m25313b() {
            if (this.f20058s == null) {
                this.f20058s = AbstractC6365v.this.f20048s.entrySet().iterator();
            }
            return this.f20058s;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f20057r = true;
            int i10 = this.f20056q + 1;
            this.f20056q = i10;
            return i10 < AbstractC6365v.this.f20047r.size() ? (Map.Entry) AbstractC6365v.this.f20047r.get(this.f20056q) : (Map.Entry) m25313b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20056q + 1 < AbstractC6365v.this.f20047r.size() || m25313b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f20057r) {
                C10010p0.m38820a("remove() was called before next()");
                return;
            }
            this.f20057r = false;
            AbstractC6365v.this.m25298g();
            if (this.f20056q >= AbstractC6365v.this.f20047r.size()) {
                m25313b().remove();
                return;
            }
            AbstractC6365v abstractC6365v = AbstractC6365v.this;
            int i10 = this.f20056q;
            this.f20056q = i10 - 1;
            abstractC6365v.m25307r(i10);
        }

        public /* synthetic */ d(AbstractC6365v abstractC6365v, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: qa.v$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class c implements Comparable, Map.Entry {

        /* JADX INFO: renamed from: q */
        public final Comparable f20053q;

        /* JADX INFO: renamed from: r */
        public Object f20054r;

        public c(AbstractC6365v abstractC6365v, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        /* JADX INFO: renamed from: c */
        public final boolean m25311c(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return m25311c(this.f20053q, entry.getKey()) && m25311c(this.f20054r, entry.getValue());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f20053q;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f20054r;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f20053q;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f20054r;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            AbstractC6365v.this.m25298g();
            Object obj2 = this.f20054r;
            this.f20054r = obj;
            return obj2;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f20053q);
            String strValueOf2 = String.valueOf(this.f20054r);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb2.append(strValueOf);
            sb2.append("=");
            sb2.append(strValueOf2);
            return sb2.toString();
        }

        public c(Comparable comparable, Object obj) {
            this.f20053q = comparable;
            this.f20054r = obj;
        }
    }

    public /* synthetic */ AbstractC6365v(int i10, a aVar) {
        this(i10);
    }
}

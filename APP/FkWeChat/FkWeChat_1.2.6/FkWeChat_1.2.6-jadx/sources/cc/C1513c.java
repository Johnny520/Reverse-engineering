package cc;

import ac.C0216d;
import java.util.Iterator;
import java.util.Set;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p052dc.C1945c;
import p055e.AbstractC1960a;
import p185m8.AbstractC5092m;
import p360yb.InterfaceC9665h;

/* JADX INFO: renamed from: cc.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1513c extends AbstractC5092m implements InterfaceC9665h {

    /* JADX INFO: renamed from: u */
    public static final a f4470u = new a(null);

    /* JADX INFO: renamed from: v */
    public static final C1513c f4471v;

    /* JADX INFO: renamed from: r */
    public final Object f4472r;

    /* JADX INFO: renamed from: s */
    public final Object f4473s;

    /* JADX INFO: renamed from: t */
    public final C0216d f4474t;

    static {
        C1945c c1945c = C1945c.f5421a;
        f4471v = new C1513c(c1945c, c1945c, C0216d.f548t.m466a());
    }

    public C1513c(Object obj, Object obj2, C0216d c0216d) {
        c0216d.getClass();
        this.f4472r = obj;
        this.f4473s = obj2;
        this.f4474t = c0216d;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m5927e(C1511a c1511a, C1511a c1511a2) {
        c1511a.getClass();
        c1511a2.getClass();
        return true;
    }

    @Override // java.util.Collection, java.util.Set, p360yb.InterfaceC9665h
    public InterfaceC9665h add(Object obj) {
        if (this.f4474t.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new C1513c(obj, obj, this.f4474t.put(obj, new C1511a()));
        }
        Object obj2 = this.f4473s;
        Object obj3 = this.f4474t.get(obj2);
        obj3.getClass();
        return new C1513c(this.f4472r, obj, this.f4474t.put(obj2, ((C1511a) obj3).m5925e(obj)).put(obj, new C1511a(obj2)));
    }

    @Override // p185m8.AbstractC5066b
    /* JADX INFO: renamed from: c */
    public int mo31c() {
        return this.f4474t.size();
    }

    @Override // p185m8.AbstractC5066b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f4474t.containsKey(obj);
    }

    @Override // p185m8.AbstractC5092m, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (set instanceof C1513c) {
            return this.f4474t.m462t().m546p(((C1513c) obj).f4474t.m462t(), new InterfaceC0188p() { // from class: cc.b
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj2, Object obj3) {
                    return Boolean.valueOf(C1513c.m5927e((C1511a) obj2, (C1511a) obj3));
                }
            });
        }
        if (!(set instanceof AbstractC1514d)) {
            return super.equals(obj);
        }
        this.f4474t.m462t();
        AbstractC1960a.m7104a(obj);
        throw null;
    }

    @Override // p185m8.AbstractC5092m, java.util.Collection, java.util.Set
    public int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C1515e(this.f4472r, this.f4474t);
    }

    @Override // java.util.Collection, java.util.Set, p360yb.InterfaceC9665h
    public InterfaceC9665h remove(Object obj) {
        C1511a c1511a = (C1511a) this.f4474t.get(obj);
        if (c1511a == null) {
            return this;
        }
        C0216d c0216dM465w = this.f4474t.remove(obj);
        if (c1511a.m5922b()) {
            Object obj2 = c0216dM465w.get(c1511a.m5924d());
            obj2.getClass();
            c0216dM465w = c0216dM465w.put(c1511a.m5924d(), ((C1511a) obj2).m5925e(c1511a.m5923c()));
        }
        if (c1511a.m5921a()) {
            Object obj3 = c0216dM465w.get(c1511a.m5923c());
            obj3.getClass();
            c0216dM465w = c0216dM465w.put(c1511a.m5923c(), ((C1511a) obj3).m5926f(c1511a.m5924d()));
        }
        return new C1513c(!c1511a.m5922b() ? c1511a.m5923c() : this.f4472r, !c1511a.m5921a() ? c1511a.m5924d() : this.f4473s, c0216dM465w);
    }

    /* JADX INFO: renamed from: cc.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC9665h m5929a() {
            return C1513c.f4471v;
        }

        public a() {
        }
    }
}

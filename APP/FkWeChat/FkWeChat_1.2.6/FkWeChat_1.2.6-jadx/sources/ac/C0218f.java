package ac;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p025bc.C1090a;
import p025bc.C1092c;
import p025bc.C1093d;
import p052dc.C1944b;
import p052dc.C1947e;
import p052dc.C1948f;
import p185m8.AbstractC5088k;
import p360yb.InterfaceC9664g;

/* JADX INFO: renamed from: ac.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0218f extends AbstractC5088k implements InterfaceC9664g.a {

    /* JADX INFO: renamed from: q */
    public C0216d f559q;

    /* JADX INFO: renamed from: r */
    public C1948f f560r;

    /* JADX INFO: renamed from: s */
    public C0232t f561s;

    /* JADX INFO: renamed from: t */
    public Object f562t;

    /* JADX INFO: renamed from: u */
    public int f563u;

    /* JADX INFO: renamed from: v */
    public int f564v;

    /* JADX INFO: renamed from: ac.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public static final a f565q = new a();

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(AbstractC1061t.m3842c(obj, obj2));
        }
    }

    /* JADX INFO: renamed from: ac.f$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public static final b f566q = new b();

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(AbstractC1061t.m3842c(obj, obj2));
        }
    }

    /* JADX INFO: renamed from: ac.f$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public static final c f567q = new c();

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, C1090a c1090a) {
            c1090a.getClass();
            return Boolean.valueOf(AbstractC1061t.m3842c(obj, c1090a.m3970e()));
        }
    }

    /* JADX INFO: renamed from: ac.f$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public static final d f568q = new d();

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, C1090a c1090a) {
            c1090a.getClass();
            return Boolean.valueOf(AbstractC1061t.m3842c(obj, c1090a.m3970e()));
        }
    }

    public C0218f(C0216d c0216d) {
        c0216d.getClass();
        this.f559q = c0216d;
        this.f560r = new C1948f();
        this.f561s = c0216d.m462t();
        this.f564v = c0216d.size();
    }

    @Override // p185m8.AbstractC5088k
    /* JADX INFO: renamed from: a */
    public Set mo478a() {
        return new C0220h(this);
    }

    @Override // p185m8.AbstractC5088k
    /* JADX INFO: renamed from: c */
    public Set mo479c() {
        return new C0222j(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        C0232t c0232tM557a = C0232t.f580e.m557a();
        c0232tM557a.getClass();
        m488q(c0232tM557a);
        m490s(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f561s.m542l(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // p185m8.AbstractC5088k
    /* JADX INFO: renamed from: e */
    public int mo480e() {
        return this.f564v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        return map instanceof C0216d ? this.f561s.m546p(((C0216d) obj).m462t(), a.f565q) : map instanceof C0218f ? this.f561s.m546p(((C0218f) obj).f561s, b.f566q) : map instanceof C1092c ? this.f561s.m546p(((C1092c) obj).m3977s().m462t(), c.f567q) : map instanceof C1093d ? this.f561s.m546p(((C1093d) obj).m3990l().f561s, d.f568q) : C1947e.f5423a.m7057b(this, map);
    }

    @Override // p185m8.AbstractC5088k
    /* JADX INFO: renamed from: g */
    public Collection mo481g() {
        return new C0224l(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f561s.m547q(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return C1947e.f5423a.m7058c(this);
    }

    @Override // p360yb.InterfaceC9664g.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C0216d build() {
        C0216d c0216d = this.f559q;
        if (c0216d != null) {
            return c0216d;
        }
        C0216d c0216d2 = new C0216d(this.f561s, size());
        this.f559q = c0216d2;
        this.f560r = new C1948f();
        return c0216d2;
    }

    /* JADX INFO: renamed from: l */
    public final C0216d m483l() {
        return this.f559q;
    }

    /* JADX INFO: renamed from: m */
    public final int m484m() {
        return this.f563u;
    }

    /* JADX INFO: renamed from: n */
    public final C0232t m485n() {
        return this.f561s;
    }

    /* JADX INFO: renamed from: o */
    public final C1948f m486o() {
        return this.f560r;
    }

    /* JADX INFO: renamed from: p */
    public final void m487p(int i10) {
        this.f563u = i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f562t = null;
        m488q(this.f561s.m513F(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this));
        return this.f562t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        map.getClass();
        if (map.isEmpty()) {
            return;
        }
        C0216d c0216dBuild = map instanceof C0216d ? (C0216d) map : null;
        if (c0216dBuild == null) {
            C0218f c0218f = map instanceof C0218f ? (C0218f) map : null;
            c0216dBuild = c0218f != null ? c0218f.build() : null;
        }
        if (c0216dBuild == null) {
            super.putAll(map);
            return;
        }
        C1944b c1944b = new C1944b(0, 1, null);
        int size = size();
        C0232t c0232t = this.f561s;
        C0232t c0232tM462t = c0216dBuild.m462t();
        c0232tM462t.getClass();
        m488q(c0232t.m514G(c0232tM462t, 0, c1944b, this));
        int size2 = (c0216dBuild.size() + size) - c1944b.m7050a();
        if (size != size2) {
            m490s(size2);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m488q(C0232t c0232t) {
        c0232t.getClass();
        if (c0232t != this.f561s) {
            this.f561s = c0232t;
            this.f559q = null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m489r(Object obj) {
        this.f562t = obj;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        C0232t c0232tM517J = this.f561s.m517J(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (c0232tM517J == null) {
            c0232tM517J = C0232t.f580e.m557a();
            c0232tM517J.getClass();
        }
        m488q(c0232tM517J);
        return size != size();
    }

    /* JADX INFO: renamed from: s */
    public void m490s(int i10) {
        this.f564v = i10;
        this.f563u++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f562t = null;
        C0232t c0232tM516I = this.f561s.m516I(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (c0232tM516I == null) {
            c0232tM516I = C0232t.f580e.m557a();
            c0232tM516I.getClass();
        }
        m488q(c0232tM516I);
        return this.f562t;
    }
}

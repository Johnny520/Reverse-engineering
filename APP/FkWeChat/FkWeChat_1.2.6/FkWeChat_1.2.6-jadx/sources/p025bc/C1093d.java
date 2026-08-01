package p025bc;

import ac.C0216d;
import ac.C0218f;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p052dc.AbstractC1943a;
import p052dc.C1945c;
import p052dc.C1947e;
import p185m8.AbstractC5088k;
import p360yb.InterfaceC9664g;

/* JADX INFO: renamed from: bc.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1093d extends AbstractC5088k implements InterfaceC9664g.a {

    /* JADX INFO: renamed from: q */
    public C1092c f3308q;

    /* JADX INFO: renamed from: r */
    public Object f3309r;

    /* JADX INFO: renamed from: s */
    public Object f3310s;

    /* JADX INFO: renamed from: t */
    public final C0218f f3311t;

    /* JADX INFO: renamed from: bc.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public static final a f3312q = new a();

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C1090a c1090a, C1090a c1090a2) {
            c1090a.getClass();
            c1090a2.getClass();
            return Boolean.valueOf(AbstractC1061t.m3842c(c1090a.m3970e(), c1090a2.m3970e()));
        }
    }

    /* JADX INFO: renamed from: bc.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public static final b f3313q = new b();

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C1090a c1090a, C1090a c1090a2) {
            c1090a.getClass();
            c1090a2.getClass();
            return Boolean.valueOf(AbstractC1061t.m3842c(c1090a.m3970e(), c1090a2.m3970e()));
        }
    }

    /* JADX INFO: renamed from: bc.d$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public static final c f3314q = new c();

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C1090a c1090a, Object obj) {
            c1090a.getClass();
            return Boolean.valueOf(AbstractC1061t.m3842c(c1090a.m3970e(), obj));
        }
    }

    /* JADX INFO: renamed from: bc.d$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public static final d f3315q = new d();

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C1090a c1090a, Object obj) {
            c1090a.getClass();
            return Boolean.valueOf(AbstractC1061t.m3842c(c1090a.m3970e(), obj));
        }
    }

    public C1093d(C1092c c1092c) {
        c1092c.getClass();
        this.f3308q = c1092c;
        this.f3309r = c1092c.m3976r();
        this.f3310s = c1092c.m3979u();
        this.f3311t = c1092c.m3977s().builder();
    }

    @Override // p185m8.AbstractC5088k
    /* JADX INFO: renamed from: a */
    public Set mo478a() {
        return new C1094e(this);
    }

    @Override // p360yb.InterfaceC9664g.a
    public InterfaceC9664g build() {
        C1092c c1092c = this.f3308q;
        C0218f c0218f = this.f3311t;
        if (c1092c != null) {
            AbstractC1943a.m7049a(c0218f.m483l() != null);
            AbstractC1943a.m7049a(this.f3309r == c1092c.m3976r());
            AbstractC1943a.m7049a(this.f3310s == c1092c.m3979u());
            return c1092c;
        }
        AbstractC1943a.m7049a(c0218f.m483l() == null);
        C1092c c1092c2 = new C1092c(this.f3309r, this.f3310s, this.f3311t.build());
        this.f3308q = c1092c2;
        return c1092c2;
    }

    @Override // p185m8.AbstractC5088k
    /* JADX INFO: renamed from: c */
    public Set mo479c() {
        return new C1096g(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (!this.f3311t.isEmpty()) {
            this.f3308q = null;
        }
        this.f3311t.clear();
        C1945c c1945c = C1945c.f5421a;
        this.f3309r = c1945c;
        this.f3310s = c1945c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f3311t.containsKey(obj);
    }

    @Override // p185m8.AbstractC5088k
    /* JADX INFO: renamed from: e */
    public int mo480e() {
        return this.f3311t.size();
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
        return map instanceof C1092c ? this.f3311t.m485n().m546p(((C1092c) obj).m3977s().m462t(), a.f3312q) : map instanceof C1093d ? this.f3311t.m485n().m546p(((C1093d) obj).f3311t.m485n(), b.f3313q) : map instanceof C0216d ? this.f3311t.m485n().m546p(((C0216d) obj).m462t(), c.f3314q) : map instanceof C0218f ? this.f3311t.m485n().m546p(((C0218f) obj).m485n(), d.f3315q) : C1947e.f5423a.m7057b(this, map);
    }

    @Override // p185m8.AbstractC5088k
    /* JADX INFO: renamed from: g */
    public Collection mo481g() {
        return new C1099j(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        C1090a c1090a = (C1090a) this.f3311t.get(obj);
        if (c1090a != null) {
            return c1090a.m3970e();
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return C1947e.f5423a.m7058c(this);
    }

    /* JADX INFO: renamed from: j */
    public final Object m3989j() {
        return this.f3309r;
    }

    /* JADX INFO: renamed from: l */
    public final C0218f m3990l() {
        return this.f3311t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        C1090a c1090a = (C1090a) this.f3311t.get(obj);
        if (c1090a != null) {
            if (c1090a.m3970e() == obj2) {
                return obj2;
            }
            this.f3308q = null;
            this.f3311t.put(obj, c1090a.m3973h(obj2));
            return c1090a.m3970e();
        }
        this.f3308q = null;
        if (isEmpty()) {
            this.f3309r = obj;
            this.f3310s = obj;
            this.f3311t.put(obj, new C1090a(obj2));
        } else {
            Object obj3 = this.f3310s;
            Object obj4 = this.f3311t.get(obj3);
            obj4.getClass();
            AbstractC1943a.m7049a(!r2.m3966a());
            this.f3311t.put(obj3, ((C1090a) obj4).m3971f(obj));
            this.f3311t.put(obj, new C1090a(obj2, obj3));
            this.f3310s = obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        C1090a c1090a = (C1090a) this.f3311t.remove(obj);
        if (c1090a == null) {
            return null;
        }
        this.f3308q = null;
        if (c1090a.m3967b()) {
            V v10 = this.f3311t.get(c1090a.m3969d());
            v10.getClass();
            this.f3311t.put(c1090a.m3969d(), ((C1090a) v10).m3971f(c1090a.m3968c()));
        } else {
            this.f3309r = c1090a.m3968c();
        }
        if (c1090a.m3966a()) {
            V v11 = this.f3311t.get(c1090a.m3968c());
            v11.getClass();
            this.f3311t.put(c1090a.m3968c(), ((C1090a) v11).m3972g(c1090a.m3969d()));
        } else {
            this.f3310s = c1090a.m3969d();
        }
        return c1090a.m3970e();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        C1090a c1090a = (C1090a) this.f3311t.get(obj);
        if (c1090a == null || !AbstractC1061t.m3842c(c1090a.m3970e(), obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}

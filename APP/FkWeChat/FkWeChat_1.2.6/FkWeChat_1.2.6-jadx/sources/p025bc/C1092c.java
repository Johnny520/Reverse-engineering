package p025bc;

import ac.C0216d;
import ac.C0218f;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p052dc.C1945c;
import p185m8.AbstractC5082h;
import p360yb.InterfaceC9659b;
import p360yb.InterfaceC9662e;
import p360yb.InterfaceC9664g;

/* JADX INFO: renamed from: bc.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1092c extends AbstractC5082h implements InterfaceC9664g {

    /* JADX INFO: renamed from: u */
    public static final a f3299u = new a(null);

    /* JADX INFO: renamed from: v */
    public static final C1092c f3300v;

    /* JADX INFO: renamed from: r */
    public final Object f3301r;

    /* JADX INFO: renamed from: s */
    public final Object f3302s;

    /* JADX INFO: renamed from: t */
    public final C0216d f3303t;

    /* JADX INFO: renamed from: bc.c$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public static final b f3304q = new b();

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C1090a c1090a, C1090a c1090a2) {
            c1090a.getClass();
            c1090a2.getClass();
            return Boolean.valueOf(AbstractC1061t.m3842c(c1090a.m3970e(), c1090a2.m3970e()));
        }
    }

    /* JADX INFO: renamed from: bc.c$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public static final c f3305q = new c();

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C1090a c1090a, C1090a c1090a2) {
            c1090a.getClass();
            c1090a2.getClass();
            return Boolean.valueOf(AbstractC1061t.m3842c(c1090a.m3970e(), c1090a2.m3970e()));
        }
    }

    /* JADX INFO: renamed from: bc.c$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public static final d f3306q = new d();

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C1090a c1090a, Object obj) {
            c1090a.getClass();
            return Boolean.valueOf(AbstractC1061t.m3842c(c1090a.m3970e(), obj));
        }
    }

    /* JADX INFO: renamed from: bc.c$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public static final e f3307q = new e();

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C1090a c1090a, Object obj) {
            c1090a.getClass();
            return Boolean.valueOf(AbstractC1061t.m3842c(c1090a.m3970e(), obj));
        }
    }

    static {
        C1945c c1945c = C1945c.f5421a;
        f3300v = new C1092c(c1945c, c1945c, C0216d.f548t.m466a());
    }

    public C1092c(Object obj, Object obj2, C0216d c0216d) {
        c0216d.getClass();
        this.f3301r = obj;
        this.f3302s = obj2;
        this.f3303t = c0216d;
    }

    /* JADX INFO: renamed from: q */
    private final InterfaceC9662e m3975q() {
        return new C1101l(this);
    }

    @Override // p360yb.InterfaceC9664g
    public InterfaceC9664g.a builder() {
        return new C1093d(this);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f3303t.containsKey(obj);
    }

    @Override // p185m8.AbstractC5082h, java.util.Map
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
        return map instanceof C1092c ? this.f3303t.m462t().m546p(((C1092c) obj).f3303t.m462t(), b.f3304q) : map instanceof C1093d ? this.f3303t.m462t().m546p(((C1093d) obj).m3990l().m485n(), c.f3305q) : map instanceof C0216d ? this.f3303t.m462t().m546p(((C0216d) obj).m462t(), d.f3306q) : map instanceof C0218f ? this.f3303t.m462t().m546p(((C0218f) obj).m485n(), e.f3307q) : super.equals(obj);
    }

    @Override // p185m8.AbstractC5082h
    /* JADX INFO: renamed from: g */
    public final Set mo455g() {
        return m3975q();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        C1090a c1090a = (C1090a) this.f3303t.get(obj);
        if (c1090a != null) {
            return c1090a.m3970e();
        }
        return null;
    }

    @Override // p185m8.AbstractC5082h, java.util.Map
    public int hashCode() {
        return super.hashCode();
    }

    @Override // p185m8.AbstractC5082h
    /* JADX INFO: renamed from: l */
    public int mo457l() {
        return this.f3303t.size();
    }

    /* JADX INFO: renamed from: r */
    public final Object m3976r() {
        return this.f3301r;
    }

    /* JADX INFO: renamed from: s */
    public final C0216d m3977s() {
        return this.f3303t;
    }

    @Override // p185m8.AbstractC5082h
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public InterfaceC9662e mo456j() {
        return new C1103n(this);
    }

    /* JADX INFO: renamed from: u */
    public final Object m3979u() {
        return this.f3302s;
    }

    @Override // p185m8.AbstractC5082h
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public InterfaceC9659b mo458m() {
        return new C1106q(this);
    }

    @Override // p185m8.AbstractC5082h, java.util.Map, p360yb.InterfaceC9664g
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public C1092c put(Object obj, Object obj2) {
        boolean zIsEmpty = isEmpty();
        C0216d c0216d = this.f3303t;
        if (zIsEmpty) {
            return new C1092c(obj, obj, c0216d.put(obj, new C1090a(obj2)));
        }
        C1090a c1090a = (C1090a) c0216d.get(obj);
        if (c1090a != null) {
            if (c1090a.m3970e() == obj2) {
                return this;
            }
            return new C1092c(this.f3301r, this.f3302s, this.f3303t.put(obj, c1090a.m3973h(obj2)));
        }
        Object obj3 = this.f3302s;
        Object obj4 = this.f3303t.get(obj3);
        obj4.getClass();
        return new C1092c(this.f3301r, obj, this.f3303t.put(obj3, ((C1090a) obj4).m3971f(obj)).put(obj, new C1090a(obj2, obj3)));
    }

    /* JADX INFO: renamed from: x */
    public InterfaceC9664g m3982x(Map map) {
        map.getClass();
        if (map.isEmpty()) {
            return this;
        }
        InterfaceC9664g.a aVarBuilder = builder();
        aVarBuilder.putAll(map);
        return aVarBuilder.build();
    }

    @Override // p185m8.AbstractC5082h, java.util.Map, p360yb.InterfaceC9664g
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public C1092c remove(Object obj) {
        C1090a c1090a = (C1090a) this.f3303t.get(obj);
        if (c1090a == null) {
            return this;
        }
        C0216d c0216dM465w = this.f3303t.remove(obj);
        if (c1090a.m3967b()) {
            Object obj2 = c0216dM465w.get(c1090a.m3969d());
            obj2.getClass();
            c0216dM465w = c0216dM465w.put(c1090a.m3969d(), ((C1090a) obj2).m3971f(c1090a.m3968c()));
        }
        if (c1090a.m3966a()) {
            Object obj3 = c0216dM465w.get(c1090a.m3968c());
            obj3.getClass();
            c0216dM465w = c0216dM465w.put(c1090a.m3968c(), ((C1090a) obj3).m3972g(c1090a.m3969d()));
        }
        return new C1092c(!c1090a.m3967b() ? c1090a.m3968c() : this.f3301r, !c1090a.m3966a() ? c1090a.m3969d() : this.f3302s, c0216dM465w);
    }

    /* JADX INFO: renamed from: bc.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1092c m3984a() {
            C1092c c1092c = C1092c.f3300v;
            c1092c.getClass();
            return c1092c;
        }

        public a() {
        }
    }
}

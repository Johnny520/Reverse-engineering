package ac;

import ac.C0232t;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p025bc.C1090a;
import p025bc.C1092c;
import p025bc.C1093d;
import p185m8.AbstractC5082h;
import p360yb.InterfaceC9659b;
import p360yb.InterfaceC9662e;
import p360yb.InterfaceC9664g;

/* JADX INFO: renamed from: ac.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0216d extends AbstractC5082h implements InterfaceC9664g {

    /* JADX INFO: renamed from: t */
    public static final a f548t = new a(null);

    /* JADX INFO: renamed from: u */
    public static final C0216d f549u = new C0216d(C0232t.f580e.m557a(), 0);

    /* JADX INFO: renamed from: r */
    public final C0232t f550r;

    /* JADX INFO: renamed from: s */
    public final int f551s;

    /* JADX INFO: renamed from: ac.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public static final b f552q = new b();

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, C1090a c1090a) {
            c1090a.getClass();
            return Boolean.valueOf(AbstractC1061t.m3842c(obj, c1090a.m3970e()));
        }
    }

    /* JADX INFO: renamed from: ac.d$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public static final c f553q = new c();

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, C1090a c1090a) {
            c1090a.getClass();
            return Boolean.valueOf(AbstractC1061t.m3842c(obj, c1090a.m3970e()));
        }
    }

    /* JADX INFO: renamed from: ac.d$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public static final d f554q = new d();

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(AbstractC1061t.m3842c(obj, obj2));
        }
    }

    /* JADX INFO: renamed from: ac.d$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public static final e f555q = new e();

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(AbstractC1061t.m3842c(obj, obj2));
        }
    }

    public C0216d(C0232t c0232t, int i10) {
        c0232t.getClass();
        this.f550r = c0232t;
        this.f551s = i10;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f550r.m542l(obj != null ? obj.hashCode() : 0, obj, 0);
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
        return map instanceof C1092c ? this.f550r.m546p(((C1092c) obj).m3977s().f550r, b.f552q) : map instanceof C1093d ? this.f550r.m546p(((C1093d) obj).m3990l().m485n(), c.f553q) : map instanceof C0216d ? this.f550r.m546p(((C0216d) obj).f550r, d.f554q) : map instanceof C0218f ? this.f550r.m546p(((C0218f) obj).m485n(), e.f555q) : super.equals(obj);
    }

    @Override // p185m8.AbstractC5082h
    /* JADX INFO: renamed from: g */
    public final Set mo455g() {
        return m460r();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f550r.m547q(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // p185m8.AbstractC5082h, java.util.Map
    public int hashCode() {
        return super.hashCode();
    }

    @Override // p185m8.AbstractC5082h
    /* JADX INFO: renamed from: l */
    public int mo457l() {
        return this.f551s;
    }

    @Override // p360yb.InterfaceC9664g
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C0218f builder() {
        return new C0218f(this);
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC9662e m460r() {
        return new C0226n(this);
    }

    @Override // p185m8.AbstractC5082h
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public InterfaceC9662e mo456j() {
        return new C0228p(this);
    }

    /* JADX INFO: renamed from: t */
    public final C0232t m462t() {
        return this.f550r;
    }

    @Override // p185m8.AbstractC5082h
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public InterfaceC9659b mo458m() {
        return new C0230r(this);
    }

    @Override // p185m8.AbstractC5082h, java.util.Map, p360yb.InterfaceC9664g
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public C0216d put(Object obj, Object obj2) {
        C0232t.b bVarM524Q = this.f550r.m524Q(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        return bVarM524Q == null ? this : new C0216d(bVarM524Q.m558a(), size() + bVarM524Q.m559b());
    }

    @Override // p185m8.AbstractC5082h, java.util.Map, p360yb.InterfaceC9664g
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public C0216d remove(Object obj) {
        C0232t c0232tM525R = this.f550r.m525R(obj != null ? obj.hashCode() : 0, obj, 0);
        return this.f550r == c0232tM525R ? this : c0232tM525R == null ? f548t.m466a() : new C0216d(c0232tM525R, size() - 1);
    }

    /* JADX INFO: renamed from: ac.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C0216d m466a() {
            C0216d c0216d = C0216d.f549u;
            c0216d.getClass();
            return c0216d;
        }

        public a() {
        }
    }
}

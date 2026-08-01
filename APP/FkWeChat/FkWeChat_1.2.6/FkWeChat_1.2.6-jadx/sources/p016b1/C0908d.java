package p016b1;

import java.util.Set;
import p016b1.C0924t;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5082h;
import p364z0.InterfaceC9824b;
import p364z0.InterfaceC9826d;
import p364z0.InterfaceC9828f;

/* JADX INFO: renamed from: b1.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C0908d extends AbstractC5082h implements InterfaceC9828f {

    /* JADX INFO: renamed from: t */
    public static final a f2856t = new a(null);

    /* JADX INFO: renamed from: u */
    public static final int f2857u = 8;

    /* JADX INFO: renamed from: v */
    public static final C0908d f2858v = new C0908d(C0924t.f2881e.m3403a(), 0);

    /* JADX INFO: renamed from: r */
    public final C0924t f2859r;

    /* JADX INFO: renamed from: s */
    public final int f2860s;

    public C0908d(C0924t c0924t, int i10) {
        this.f2859r = c0924t;
        this.f2860s = i10;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f2859r.m3387k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // p185m8.AbstractC5082h
    /* JADX INFO: renamed from: g */
    public final Set mo455g() {
        return m3325r();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f2859r.m3391o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // p185m8.AbstractC5082h
    /* JADX INFO: renamed from: l */
    public int mo457l() {
        return this.f2860s;
    }

    @Override // p364z0.InterfaceC9828f
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C0910f builder() {
        return new C0910f(this);
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC9826d m3325r() {
        return new C0918n(this);
    }

    @Override // p185m8.AbstractC5082h
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public InterfaceC9826d mo456j() {
        return new C0920p(this);
    }

    /* JADX INFO: renamed from: t */
    public final C0924t m3327t() {
        return this.f2859r;
    }

    @Override // p185m8.AbstractC5082h
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public InterfaceC9824b mo458m() {
        return new C0922r(this);
    }

    /* JADX INFO: renamed from: v */
    public C0908d m3329v(Object obj, Object obj2) {
        C0924t.b bVarM3370P = this.f2859r.m3370P(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        return bVarM3370P == null ? this : new C0908d(bVarM3370P.m3404a(), size() + bVarM3370P.m3405b());
    }

    /* JADX INFO: renamed from: w */
    public C0908d m3330w(Object obj) {
        C0924t c0924tM3371Q = this.f2859r.m3371Q(obj != null ? obj.hashCode() : 0, obj, 0);
        return this.f2859r == c0924tM3371Q ? this : c0924tM3371Q == null ? f2856t.m3331a() : new C0908d(c0924tM3371Q, size() - 1);
    }

    /* JADX INFO: renamed from: b1.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C0908d m3331a() {
            C0908d c0908d = C0908d.f2858v;
            c0908d.getClass();
            return c0908d;
        }

        public a() {
        }
    }
}

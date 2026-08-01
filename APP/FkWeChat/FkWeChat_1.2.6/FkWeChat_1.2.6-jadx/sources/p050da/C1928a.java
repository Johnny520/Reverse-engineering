package p050da;

import gb.AbstractC2650c1;
import gb.AbstractC2665g0;
import gb.EnumC2671h2;
import java.util.Set;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5065a1;
import p185m8.AbstractC5071c1;
import p229p9.InterfaceC6018l1;

/* JADX INFO: renamed from: da.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1928a extends AbstractC2665g0 {

    /* JADX INFO: renamed from: d */
    public final EnumC2671h2 f5384d;

    /* JADX INFO: renamed from: e */
    public final EnumC1930c f5385e;

    /* JADX INFO: renamed from: f */
    public final boolean f5386f;

    /* JADX INFO: renamed from: g */
    public final boolean f5387g;

    /* JADX INFO: renamed from: h */
    public final Set f5388h;

    /* JADX INFO: renamed from: i */
    public final AbstractC2650c1 f5389i;

    public /* synthetic */ C1928a(EnumC2671h2 enumC2671h2, EnumC1930c enumC1930c, boolean z10, boolean z11, Set set, AbstractC2650c1 abstractC2650c1, int i10, AbstractC1043k abstractC1043k) {
        this(enumC2671h2, (i10 & 2) != 0 ? EnumC1930c.f5390q : enumC1930c, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : set, (i10 & 32) != 0 ? null : abstractC2650c1);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C1928a m6983f(C1928a c1928a, EnumC2671h2 enumC2671h2, EnumC1930c enumC1930c, boolean z10, boolean z11, Set set, AbstractC2650c1 abstractC2650c1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC2671h2 = c1928a.f5384d;
        }
        if ((i10 & 2) != 0) {
            enumC1930c = c1928a.f5385e;
        }
        if ((i10 & 4) != 0) {
            z10 = c1928a.f5386f;
        }
        if ((i10 & 8) != 0) {
            z11 = c1928a.f5387g;
        }
        if ((i10 & 16) != 0) {
            set = c1928a.f5388h;
        }
        if ((i10 & 32) != 0) {
            abstractC2650c1 = c1928a.f5389i;
        }
        Set set2 = set;
        AbstractC2650c1 abstractC2650c12 = abstractC2650c1;
        return c1928a.m6988e(enumC2671h2, enumC1930c, z10, z11, set2, abstractC2650c12);
    }

    @Override // gb.AbstractC2665g0
    /* JADX INFO: renamed from: a */
    public AbstractC2650c1 mo6984a() {
        return this.f5389i;
    }

    @Override // gb.AbstractC2665g0
    /* JADX INFO: renamed from: b */
    public EnumC2671h2 mo6985b() {
        return this.f5384d;
    }

    @Override // gb.AbstractC2665g0
    /* JADX INFO: renamed from: c */
    public Set mo6986c() {
        return this.f5388h;
    }

    /* JADX INFO: renamed from: e */
    public final C1928a m6988e(EnumC2671h2 enumC2671h2, EnumC1930c enumC1930c, boolean z10, boolean z11, Set set, AbstractC2650c1 abstractC2650c1) {
        enumC2671h2.getClass();
        enumC1930c.getClass();
        return new C1928a(enumC2671h2, enumC1930c, z10, z11, set, abstractC2650c1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1928a)) {
            return false;
        }
        C1928a c1928a = (C1928a) obj;
        return AbstractC1061t.m3842c(c1928a.mo6984a(), mo6984a()) && c1928a.mo6985b() == mo6985b() && c1928a.f5385e == this.f5385e && c1928a.f5386f == this.f5386f && c1928a.f5387g == this.f5387g;
    }

    /* JADX INFO: renamed from: g */
    public final EnumC1930c m6989g() {
        return this.f5385e;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m6990h() {
        return this.f5387g;
    }

    @Override // gb.AbstractC2665g0
    public int hashCode() {
        AbstractC2650c1 abstractC2650c1Mo6984a = mo6984a();
        int iHashCode = abstractC2650c1Mo6984a != null ? abstractC2650c1Mo6984a.hashCode() : 0;
        int iHashCode2 = iHashCode + (iHashCode * 31) + mo6985b().hashCode();
        int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.f5385e.hashCode();
        int i10 = iHashCode3 + (iHashCode3 * 31) + (this.f5386f ? 1 : 0);
        return i10 + (i10 * 31) + (this.f5387g ? 1 : 0);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m6991i() {
        return this.f5386f;
    }

    /* JADX INFO: renamed from: j */
    public final C1928a m6992j(boolean z10) {
        return m6983f(this, null, null, z10, false, null, null, 59, null);
    }

    /* JADX INFO: renamed from: k */
    public C1928a m6993k(AbstractC2650c1 abstractC2650c1) {
        return m6983f(this, null, null, false, false, null, abstractC2650c1, 31, null);
    }

    /* JADX INFO: renamed from: l */
    public final C1928a m6994l(EnumC1930c enumC1930c) {
        enumC1930c.getClass();
        return m6983f(this, null, enumC1930c, false, false, null, null, 61, null);
    }

    @Override // gb.AbstractC2665g0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C1928a mo6987d(InterfaceC6018l1 interfaceC6018l1) {
        interfaceC6018l1.getClass();
        return m6983f(this, null, null, false, false, mo6986c() != null ? AbstractC5071c1.m20504m(mo6986c(), interfaceC6018l1) : AbstractC5065a1.m20479d(interfaceC6018l1), null, 47, null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f5384d + ", flexibility=" + this.f5385e + ", isRaw=" + this.f5386f + ", isForAnnotationParameter=" + this.f5387g + ", visitedTypeParameters=" + this.f5388h + ", defaultType=" + this.f5389i + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1928a(EnumC2671h2 enumC2671h2, EnumC1930c enumC1930c, boolean z10, boolean z11, Set set, AbstractC2650c1 abstractC2650c1) {
        super(enumC2671h2, set, abstractC2650c1);
        enumC2671h2.getClass();
        enumC1930c.getClass();
        this.f5384d = enumC2671h2;
        this.f5385e = enumC1930c;
        this.f5386f = z10;
        this.f5387g = z11;
        this.f5388h = set;
        this.f5389i = abstractC2650c1;
    }
}

package p190n0;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p117i.AbstractC3091w;
import p117i.AbstractC3093x;

/* JADX INFO: renamed from: n0.r3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5422r3 implements InterfaceC5426s1 {

    /* JADX INFO: renamed from: f */
    public static final a f16727f = new a(null);

    /* JADX INFO: renamed from: a */
    public final boolean f16728a;

    /* JADX INFO: renamed from: b */
    public final int f16729b;

    /* JADX INFO: renamed from: c */
    public final int f16730c;

    /* JADX INFO: renamed from: d */
    public final C5419r0 f16731d;

    /* JADX INFO: renamed from: e */
    public final C5407p0 f16732e;

    public C5422r3(boolean z10, int i10, int i11, C5419r0 c5419r0, C5407p0 c5407p0) {
        this.f16728a = z10;
        this.f16729b = i10;
        this.f16730c = i11;
        this.f16731d = c5419r0;
        this.f16732e = c5407p0;
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: a */
    public int mo22133a() {
        return 1;
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: b */
    public boolean mo22134b() {
        return this.f16728a;
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: c */
    public C5407p0 mo22135c() {
        return this.f16732e;
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: d */
    public C5419r0 mo22136d() {
        return this.f16731d;
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: e */
    public C5407p0 mo22137e() {
        return this.f16732e;
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: g */
    public int mo22139g() {
        return this.f16730c;
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: h */
    public C5407p0 mo22140h() {
        return this.f16732e;
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: i */
    public EnumC5388m mo22141i() {
        return mo22145m() < mo22139g() ? EnumC5388m.f16585r : mo22145m() > mo22139g() ? EnumC5388m.f16584q : this.f16732e.m21992d();
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: j */
    public boolean mo22142j(InterfaceC5426s1 interfaceC5426s1) {
        if (mo22136d() == null || interfaceC5426s1 == null || !(interfaceC5426s1 instanceof C5422r3)) {
            return true;
        }
        C5422r3 c5422r3 = (C5422r3) interfaceC5426s1;
        return (mo22145m() == c5422r3.mo22145m() && mo22139g() == c5422r3.mo22139g() && mo22134b() == c5422r3.mo22134b() && !this.f16732e.m22002n(c5422r3.f16732e)) ? false : true;
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: k */
    public AbstractC3091w mo22143k(C5419r0 c5419r0) {
        return AbstractC3093x.m11596b(this.f16732e.m21996h(), ((c5419r0.m22114d() || c5419r0.m22115e().m22120d() <= c5419r0.m22113c().m22120d()) && (!c5419r0.m22114d() || c5419r0.m22115e().m22120d() > c5419r0.m22113c().m22120d())) ? c5419r0 : C5419r0.m22111b(c5419r0, null, null, !c5419r0.m22114d(), 3, null));
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: l */
    public C5407p0 mo22144l() {
        return this.f16732e;
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: m */
    public int mo22145m() {
        return this.f16729b;
    }

    public String toString() {
        return "SingleSelectionLayout(isStartHandle=" + mo22134b() + ", crossed=" + mo22141i() + ", info=\n\t" + this.f16732e + ')';
    }

    /* JADX INFO: renamed from: n0.r3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: f */
    public void mo22138f(InterfaceC0184l interfaceC0184l) {
    }
}

package p111ha;

import la.AbstractC4726f;
import la.InterfaceC4724d;
import ma.AbstractC5140a;
import p037cb.C1508y;
import p067eb.EnumC2094r;
import p067eb.InterfaceC2096s;
import p143ja.C3780m;
import p213oa.C5691b;
import p213oa.C5692c;
import p213oa.C5695f;
import p229p9.InterfaceC6006h1;
import p299ub.AbstractC8621f0;
import p343xa.C9474d;
import qa.AbstractC6353j;

/* JADX INFO: renamed from: ha.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2931r implements InterfaceC2096s {

    /* JADX INFO: renamed from: b */
    public final C9474d f7745b;

    /* JADX INFO: renamed from: c */
    public final C9474d f7746c;

    /* JADX INFO: renamed from: d */
    public final C1508y f7747d;

    /* JADX INFO: renamed from: e */
    public final boolean f7748e;

    /* JADX INFO: renamed from: f */
    public final EnumC2094r f7749f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2937x f7750g;

    /* JADX INFO: renamed from: h */
    public final String f7751h;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2931r(InterfaceC2937x interfaceC2937x, C3780m c3780m, InterfaceC4724d interfaceC4724d, C1508y c1508y, boolean z10, EnumC2094r enumC2094r) {
        interfaceC2937x.getClass();
        c3780m.getClass();
        interfaceC4724d.getClass();
        enumC2094r.getClass();
        C9474d c9474dM36903b = C9474d.m36903b(interfaceC2937x.mo10736h());
        c9474dM36903b.getClass();
        String strM12594e = interfaceC2937x.mo10733b().m12594e();
        C9474d c9474dM36905d = null;
        if (strM12594e != null && strM12594e.length() > 0) {
            c9474dM36905d = C9474d.m36905d(strM12594e);
        }
        this(c9474dM36903b, c9474dM36905d, c3780m, interfaceC4724d, c1508y, z10, enumC2094r, interfaceC2937x);
    }

    @Override // p229p9.InterfaceC6003g1
    /* JADX INFO: renamed from: a */
    public InterfaceC6006h1 mo10689a() {
        InterfaceC6006h1 interfaceC6006h1 = InterfaceC6006h1.f18959a;
        interfaceC6006h1.getClass();
        return interfaceC6006h1;
    }

    @Override // p067eb.InterfaceC2096s
    /* JADX INFO: renamed from: c */
    public String mo7514c() {
        return "Class '" + m10690d().m22982a().m22994a() + '\'';
    }

    /* JADX INFO: renamed from: d */
    public final C5691b m10690d() {
        C5692c c5692cM36909g = m10691e().m36909g();
        c5692cM36909g.getClass();
        return new C5691b(c5692cM36909g, m10694h());
    }

    /* JADX INFO: renamed from: e */
    public C9474d m10691e() {
        return this.f7745b;
    }

    /* JADX INFO: renamed from: f */
    public C9474d m10692f() {
        return this.f7746c;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC2937x m10693g() {
        return this.f7750g;
    }

    /* JADX INFO: renamed from: h */
    public final C5695f m10694h() {
        String strM36908f = m10691e().m36908f();
        strM36908f.getClass();
        C5695f c5695fM23027j = C5695f.m23027j(AbstractC8621f0.m33145j1(strM36908f, '/', null, 2, null));
        c5695fM23027j.getClass();
        return c5695fM23027j;
    }

    public String toString() {
        return C2931r.class.getSimpleName() + ": " + m10691e();
    }

    public C2931r(C9474d c9474d, C9474d c9474d2, C3780m c3780m, InterfaceC4724d interfaceC4724d, C1508y c1508y, boolean z10, EnumC2094r enumC2094r, InterfaceC2937x interfaceC2937x) {
        String string;
        c9474d.getClass();
        c3780m.getClass();
        interfaceC4724d.getClass();
        enumC2094r.getClass();
        this.f7745b = c9474d;
        this.f7746c = c9474d2;
        this.f7747d = c1508y;
        this.f7748e = z10;
        this.f7749f = enumC2094r;
        this.f7750g = interfaceC2937x;
        AbstractC6353j.f fVar = AbstractC5140a.f15661m;
        fVar.getClass();
        Integer num = (Integer) AbstractC4726f.m18872a(c3780m, fVar);
        this.f7751h = (num == null || (string = interfaceC4724d.getString(num.intValue())) == null) ? "main" : string;
    }
}

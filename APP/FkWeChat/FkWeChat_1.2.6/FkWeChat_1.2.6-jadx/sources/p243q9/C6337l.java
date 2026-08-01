package p243q9;

import gb.AbstractC2650c1;
import gb.AbstractC2706r0;
import java.util.Map;
import p024b9.AbstractC1043k;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p186m9.AbstractC5128i;
import p213oa.C5692c;
import p229p9.InterfaceC6003g1;

/* JADX INFO: renamed from: q9.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6337l implements InterfaceC6328c {

    /* JADX INFO: renamed from: a */
    public final AbstractC5128i f19878a;

    /* JADX INFO: renamed from: b */
    public final C5692c f19879b;

    /* JADX INFO: renamed from: c */
    public final Map f19880c;

    /* JADX INFO: renamed from: d */
    public final boolean f19881d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4705l f19882e;

    public C6337l(AbstractC5128i abstractC5128i, C5692c c5692c, Map map, boolean z10) {
        abstractC5128i.getClass();
        c5692c.getClass();
        map.getClass();
        this.f19878a = abstractC5128i;
        this.f19879b = c5692c;
        this.f19880c = map;
        this.f19881d = z10;
        this.f19882e = AbstractC4706m.m18788b(EnumC4708o.f13922r, new C6336k(this));
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC2650c1 m25009c(C6337l c6337l) {
        return c6337l.f19878a.m20927p(c6337l.mo5549d()).mo7508x();
    }

    @Override // p243q9.InterfaceC6328c
    /* JADX INFO: renamed from: a */
    public Map mo5548a() {
        return this.f19880c;
    }

    @Override // p243q9.InterfaceC6328c
    /* JADX INFO: renamed from: d */
    public C5692c mo5549d() {
        return this.f19879b;
    }

    @Override // p243q9.InterfaceC6328c
    public InterfaceC6003g1 getSource() {
        InterfaceC6003g1 interfaceC6003g1 = InterfaceC6003g1.f18958a;
        interfaceC6003g1.getClass();
        return interfaceC6003g1;
    }

    @Override // p243q9.InterfaceC6328c
    public AbstractC2706r0 getType() {
        Object value = this.f19882e.getValue();
        value.getClass();
        return (AbstractC2706r0) value;
    }

    public /* synthetic */ C6337l(AbstractC5128i abstractC5128i, C5692c c5692c, Map map, boolean z10, int i10, AbstractC1043k abstractC1043k) {
        this(abstractC5128i, c5692c, map, (i10 & 8) != 0 ? false : z10);
    }
}

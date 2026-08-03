package p174m;

import p027c0.C0368m;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1845j1;
import p144k.C2176h1;
import p144k.EnumC2164d1;
import p249qg.AbstractC3603v;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: m.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2646r implements InterfaceC2613i2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1231l f8638a;

    /* JADX INFO: renamed from: b */
    public final C2642q f8639b = new C2642q(this);

    /* JADX INFO: renamed from: c */
    public final C2176h1 f8640c = new C2176h1();

    /* JADX INFO: renamed from: d */
    public final C1845j1 f8641d;

    /* JADX INFO: renamed from: e */
    public final C1845j1 f8642e;

    /* JADX INFO: renamed from: f */
    public final C1845j1 f8643f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2646r(InterfaceC1231l interfaceC1231l) {
        this.f8638a = interfaceC1231l;
        Boolean bool = Boolean.FALSE;
        this.f8641d = AbstractC1874r.m4639u(bool);
        this.f8642e = AbstractC1874r.m4639u(bool);
        this.f8643f = AbstractC1874r.m4639u(bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.InterfaceC2613i2
    /* JADX INFO: renamed from: a */
    public final boolean mo5458a() {
        return ((Boolean) this.f8641d.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.InterfaceC2613i2
    /* JADX INFO: renamed from: b */
    public final Object mo5459b(EnumC2164d1 enumC2164d1, InterfaceC1235p interfaceC1235p, AbstractC6038c abstractC6038c) {
        Object objM7551e = AbstractC3603v.m7551e(new C0368m(this, enumC2164d1, interfaceC1235p, null, 10), abstractC6038c);
        return objM7551e == EnumC5799a.f23547g ? objM7551e : C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.InterfaceC2613i2
    /* JADX INFO: renamed from: e */
    public final float mo5462e(float f3) {
        return ((Number) this.f8638a.invoke(Float.valueOf(f3))).floatValue();
    }
}

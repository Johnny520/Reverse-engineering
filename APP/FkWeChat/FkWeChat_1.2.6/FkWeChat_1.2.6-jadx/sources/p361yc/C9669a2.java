package p361yc;

import p010a9.InterfaceC0184l;
import p172l8.AbstractC4717x;
import p172l8.C4700i0;
import p172l8.C4711r;
import p300uc.InterfaceC8647b;
import p329wc.AbstractC9223k;
import p329wc.C9213a;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: yc.a2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9669a2 extends AbstractC9668a1 {

    /* JADX INFO: renamed from: c */
    public final InterfaceC9218f f32901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9669a2(final InterfaceC8647b interfaceC8647b, final InterfaceC8647b interfaceC8647b2) {
        super(interfaceC8647b, interfaceC8647b2, null);
        interfaceC8647b.getClass();
        interfaceC8647b2.getClass();
        this.f32901c = AbstractC9223k.m35907c("kotlin.Pair", new InterfaceC9218f[0], new InterfaceC0184l() { // from class: yc.z1
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C9669a2.m37806l(interfaceC8647b, interfaceC8647b2, (C9213a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static C4700i0 m37806l(InterfaceC8647b interfaceC8647b, InterfaceC8647b interfaceC8647b2, C9213a c9213a) {
        c9213a.getClass();
        C9213a.m35877b(c9213a, "first", interfaceC8647b.mo15953a(), null, false, 12, null);
        C9213a.m35877b(c9213a, "second", interfaceC8647b2.mo15953a(), null, false, 12, null);
        return C4700i0.f13910a;
    }

    @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public InterfaceC9218f mo15953a() {
        return this.f32901c;
    }

    @Override // p361yc.AbstractC9668a1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Object mo37801g(C4711r c4711r) {
        c4711r.getClass();
        return c4711r.m18795e();
    }

    @Override // p361yc.AbstractC9668a1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Object mo37803i(C4711r c4711r) {
        c4711r.getClass();
        return c4711r.m18796f();
    }

    @Override // p361yc.AbstractC9668a1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public C4711r mo37805k(Object obj, Object obj2) {
        return AbstractC4717x.m18815a(obj, obj2);
    }
}

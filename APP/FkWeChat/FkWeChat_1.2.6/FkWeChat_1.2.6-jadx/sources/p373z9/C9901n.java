package p373z9;

import ba.C1083k;
import java.util.Map;
import p024b9.AbstractC1052o0;
import p024b9.C1038h0;
import p081fa.InterfaceC2369a;
import p081fa.InterfaceC2371b;
import p081fa.InterfaceC2377e;
import p081fa.InterfaceC2385m;
import p082fb.AbstractC2411m;
import p082fb.InterfaceC2407i;
import p098g9.InterfaceC2557k;
import p172l8.AbstractC4717x;
import p185m8.AbstractC5107t0;
import p185m8.AbstractC5109u0;
import p185m8.AbstractC5112w;
import p186m9.C5135p;
import ua.AbstractC8590g;

/* JADX INFO: renamed from: z9.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9901n extends C9890c {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ InterfaceC2557k[] f33380h = {AbstractC1052o0.m3814i(new C1038h0(C9901n.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: g */
    public final InterfaceC2407i f33381g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9901n(InterfaceC2369a interfaceC2369a, C1083k c1083k) {
        super(c1083k, interfaceC2369a, C5135p.a.f15538H);
        interfaceC2369a.getClass();
        c1083k.getClass();
        this.f33381g = c1083k.m3941e().mo8663f(new C9900m(this));
    }

    /* JADX INFO: renamed from: h */
    public static final Map m38406h(C9901n c9901n) {
        InterfaceC2371b interfaceC2371bM38381c = c9901n.m38381c();
        AbstractC8590g abstractC8590gM38393d = interfaceC2371bM38381c instanceof InterfaceC2377e ? C9893f.f33368a.m38393d(((InterfaceC2377e) c9901n.m38381c()).mo8606e()) : interfaceC2371bM38381c instanceof InterfaceC2385m ? C9893f.f33368a.m38393d(AbstractC5112w.m20789e(c9901n.m38381c())) : null;
        Map mapM20764f = abstractC8590gM38393d != null ? AbstractC5107t0.m20764f(AbstractC4717x.m18815a(C9891d.f33362a.m38387d(), abstractC8590gM38393d)) : null;
        return mapM20764f == null ? AbstractC5109u0.m20768i() : mapM20764f;
    }

    @Override // p373z9.C9890c, p243q9.InterfaceC6328c
    /* JADX INFO: renamed from: a */
    public Map mo5548a() {
        return (Map) AbstractC2411m.m8702a(this.f33381g, this, f33380h[0]);
    }
}

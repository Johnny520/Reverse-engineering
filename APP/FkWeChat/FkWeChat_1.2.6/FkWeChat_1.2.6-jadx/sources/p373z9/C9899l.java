package p373z9;

import ba.C1083k;
import java.util.Map;
import p024b9.AbstractC1052o0;
import p024b9.C1038h0;
import p081fa.InterfaceC2369a;
import p082fb.AbstractC2411m;
import p082fb.InterfaceC2407i;
import p098g9.InterfaceC2557k;
import p172l8.AbstractC4717x;
import p185m8.AbstractC5107t0;
import p185m8.AbstractC5109u0;
import p186m9.C5135p;
import ua.AbstractC8590g;

/* JADX INFO: renamed from: z9.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9899l extends C9890c {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ InterfaceC2557k[] f33377h = {AbstractC1052o0.m3814i(new C1038h0(C9899l.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: g */
    public final InterfaceC2407i f33378g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9899l(InterfaceC2369a interfaceC2369a, C1083k c1083k) {
        super(c1083k, interfaceC2369a, C5135p.a.f15546L);
        interfaceC2369a.getClass();
        c1083k.getClass();
        this.f33378g = c1083k.m3941e().mo8663f(new C9898k(this));
    }

    /* JADX INFO: renamed from: h */
    public static final Map m38404h(C9899l c9899l) {
        AbstractC8590g abstractC8590gM38391b = C9893f.f33368a.m38391b(c9899l.m38381c());
        Map mapM20764f = abstractC8590gM38391b != null ? AbstractC5107t0.m20764f(AbstractC4717x.m18815a(C9891d.f33362a.m38386c(), abstractC8590gM38391b)) : null;
        return mapM20764f == null ? AbstractC5109u0.m20768i() : mapM20764f;
    }

    @Override // p373z9.C9890c, p243q9.InterfaceC6328c
    /* JADX INFO: renamed from: a */
    public Map mo5548a() {
        return (Map) AbstractC2411m.m8702a(this.f33378g, this, f33377h[0]);
    }
}

package p373z9;

import ba.C1083k;
import gb.AbstractC2650c1;
import java.util.Collection;
import java.util.Map;
import p011aa.InterfaceC0202g;
import p024b9.AbstractC1052o0;
import p024b9.C1038h0;
import p081fa.InterfaceC2369a;
import p081fa.InterfaceC2371b;
import p082fb.AbstractC2411m;
import p082fb.InterfaceC2407i;
import p098g9.InterfaceC2557k;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5109u0;
import p213oa.C5692c;
import p229p9.InterfaceC6003g1;

/* JADX INFO: renamed from: z9.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C9890c implements InterfaceC0202g {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ InterfaceC2557k[] f33356f = {AbstractC1052o0.m3814i(new C1038h0(C9890c.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};

    /* JADX INFO: renamed from: a */
    public final C5692c f33357a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6003g1 f33358b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2407i f33359c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2371b f33360d;

    /* JADX INFO: renamed from: e */
    public final boolean f33361e;

    public C9890c(C1083k c1083k, InterfaceC2369a interfaceC2369a, C5692c c5692c) {
        InterfaceC6003g1 interfaceC6003g1Mo7413a;
        Collection collectionMo8594c;
        c1083k.getClass();
        c5692c.getClass();
        this.f33357a = c5692c;
        if (interfaceC2369a == null || (interfaceC6003g1Mo7413a = c1083k.m3937a().m3915t().mo7413a(interfaceC2369a)) == null) {
            interfaceC6003g1Mo7413a = InterfaceC6003g1.f18958a;
            interfaceC6003g1Mo7413a.getClass();
        }
        this.f33358b = interfaceC6003g1Mo7413a;
        this.f33359c = c1083k.m3941e().mo8663f(new C9889b(c1083k, this));
        this.f33360d = (interfaceC2369a == null || (collectionMo8594c = interfaceC2369a.mo8594c()) == null) ? null : (InterfaceC2371b) AbstractC5081g0.m20577k0(collectionMo8594c);
        boolean z10 = false;
        if (interfaceC2369a != null && interfaceC2369a.mo8596i()) {
            z10 = true;
        }
        this.f33361e = z10;
    }

    /* JADX INFO: renamed from: f */
    public static final AbstractC2650c1 m38380f(C1083k c1083k, C9890c c9890c) {
        AbstractC2650c1 abstractC2650c1Mo7508x = c1083k.m3940d().mo12669t().m20927p(c9890c.mo5549d()).mo7508x();
        abstractC2650c1Mo7508x.getClass();
        return abstractC2650c1Mo7508x;
    }

    @Override // p243q9.InterfaceC6328c
    /* JADX INFO: renamed from: a */
    public Map mo5548a() {
        return AbstractC5109u0.m20768i();
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC2371b m38381c() {
        return this.f33360d;
    }

    @Override // p243q9.InterfaceC6328c
    /* JADX INFO: renamed from: d */
    public C5692c mo5549d() {
        return this.f33357a;
    }

    @Override // p243q9.InterfaceC6328c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC2650c1 getType() {
        return (AbstractC2650c1) AbstractC2411m.m8702a(this.f33359c, this, f33356f[0]);
    }

    @Override // p243q9.InterfaceC6328c
    public InterfaceC6003g1 getSource() {
        return this.f33358b;
    }

    @Override // p011aa.InterfaceC0202g
    /* JADX INFO: renamed from: i */
    public boolean mo439i() {
        return this.f33361e;
    }
}

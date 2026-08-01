package p285ta;

import gb.AbstractC2706r0;
import gb.EnumC2691m2;
import gb.InterfaceC2643a2;
import java.util.Collection;
import java.util.List;
import p112hb.AbstractC2949h;
import p112hb.C2956o;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p186m9.AbstractC5128i;
import p229p9.InterfaceC6004h;

/* JADX INFO: renamed from: ta.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8211c implements InterfaceC8210b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2643a2 f27524a;

    /* JADX INFO: renamed from: b */
    public C2956o f27525b;

    public C8211c(InterfaceC2643a2 interfaceC2643a2) {
        interfaceC2643a2.getClass();
        this.f27524a = interfaceC2643a2;
        mo10870b().mo9335b();
        EnumC2691m2 enumC2691m2 = EnumC2691m2.f7042u;
    }

    @Override // p285ta.InterfaceC8210b
    /* JADX INFO: renamed from: b */
    public InterfaceC2643a2 mo10870b() {
        return this.f27524a;
    }

    /* JADX INFO: renamed from: c */
    public Void m31901c() {
        return null;
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: d */
    public List mo5600d() {
        return AbstractC5114x.m20800o();
    }

    /* JADX INFO: renamed from: e */
    public final C2956o m31902e() {
        return this.f27525b;
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C8211c mo9545a(AbstractC2949h abstractC2949h) {
        abstractC2949h.getClass();
        InterfaceC2643a2 interfaceC2643a2Mo9334a = mo10870b().mo9334a(abstractC2949h);
        interfaceC2643a2Mo9334a.getClass();
        return new C8211c(interfaceC2643a2Mo9334a);
    }

    /* JADX INFO: renamed from: g */
    public final void m31904g(C2956o c2956o) {
        this.f27525b = c2956o;
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: n */
    public Collection mo9546n() {
        AbstractC2706r0 type = mo10870b().mo9335b() == EnumC2691m2.f7044w ? mo10870b().getType() : mo9341t().m20902J();
        type.getClass();
        return AbstractC5112w.m20789e(type);
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: t */
    public AbstractC5128i mo9341t() {
        AbstractC5128i abstractC5128iMo9341t = mo10870b().getType().mo9332T0().mo9341t();
        abstractC5128iMo9341t.getClass();
        return abstractC5128iMo9341t;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + mo10870b() + ')';
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: u */
    public /* bridge */ /* synthetic */ InterfaceC6004h mo5602u() {
        return (InterfaceC6004h) m31901c();
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: v */
    public boolean mo5603v() {
        return false;
    }
}

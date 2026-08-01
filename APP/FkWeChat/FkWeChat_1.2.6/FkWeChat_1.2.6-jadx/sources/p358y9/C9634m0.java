package p358y9;

import java.util.Map;
import p082fb.C2404f;
import p082fb.InterfaceC2406h;
import p213oa.AbstractC5694e;
import p213oa.C5692c;

/* JADX INFO: renamed from: y9.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9634m0 implements InterfaceC9630k0 {

    /* JADX INFO: renamed from: b */
    public final Map f32822b;

    /* JADX INFO: renamed from: c */
    public final C2404f f32823c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2406h f32824d;

    public C9634m0(Map map) {
        map.getClass();
        this.f32822b = map;
        C2404f c2404f = new C2404f("Java nullability annotation states");
        this.f32823c = c2404f;
        InterfaceC2406h interfaceC2406hMo8665h = c2404f.mo8665h(new C9632l0(this));
        interfaceC2406hMo8665h.getClass();
        this.f32824d = interfaceC2406hMo8665h;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m37686c(C9634m0 c9634m0, C5692c c5692c) {
        c5692c.getClass();
        return AbstractC5694e.m23018a(c5692c, c9634m0.f32822b);
    }

    @Override // p358y9.InterfaceC9630k0
    /* JADX INFO: renamed from: a */
    public Object mo37678a(C5692c c5692c) {
        c5692c.getClass();
        return this.f32824d.mo27m(c5692c);
    }
}

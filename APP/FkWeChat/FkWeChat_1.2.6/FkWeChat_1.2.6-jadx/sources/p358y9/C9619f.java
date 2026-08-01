package p358y9;

import java.util.Map;
import p024b9.AbstractC1061t;
import p111ha.AbstractC2909c0;
import p186m9.AbstractC5128i;
import p213oa.C5695f;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC6000f1;
import p327wa.AbstractC9211e;

/* JADX INFO: renamed from: y9.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9619f extends AbstractC9648t0 {

    /* JADX INFO: renamed from: o */
    public static final C9619f f32747o = new C9619f();

    /* JADX INFO: renamed from: l */
    public static final boolean m37630l(InterfaceC6000f1 interfaceC6000f1, InterfaceC5986b interfaceC5986b) {
        interfaceC5986b.getClass();
        return AbstractC9648t0.f32841a.m37739j().containsKey(AbstractC2909c0.m10563d(interfaceC6000f1));
    }

    /* JADX INFO: renamed from: j */
    public final C5695f m37631j(InterfaceC6000f1 interfaceC6000f1) {
        interfaceC6000f1.getClass();
        Map mapM37739j = AbstractC9648t0.f32841a.m37739j();
        String strM10563d = AbstractC2909c0.m10563d(interfaceC6000f1);
        if (strM10563d == null) {
            return null;
        }
        return (C5695f) mapM37739j.get(strM10563d);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m37632k(InterfaceC6000f1 interfaceC6000f1) {
        interfaceC6000f1.getClass();
        return AbstractC5128i.m20874h0(interfaceC6000f1) && AbstractC9211e.m35854i(interfaceC6000f1, false, new C9617e(interfaceC6000f1), 1, null) != null;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m37633m(InterfaceC6000f1 interfaceC6000f1) {
        interfaceC6000f1.getClass();
        return AbstractC1061t.m3842c(interfaceC6000f1.getName().m23030c(), "removeAt") && AbstractC1061t.m3842c(AbstractC2909c0.m10563d(interfaceC6000f1), AbstractC9648t0.f32841a.m37737h().m37746d());
    }
}

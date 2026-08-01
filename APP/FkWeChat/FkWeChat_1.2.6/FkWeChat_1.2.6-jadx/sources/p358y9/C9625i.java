package p358y9;

import p111ha.AbstractC2909c0;
import p185m8.AbstractC5081g0;
import p213oa.C5695f;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC6056z;
import p327wa.AbstractC9211e;
import p358y9.AbstractC9648t0;

/* JADX INFO: renamed from: y9.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9625i extends AbstractC9648t0 {

    /* JADX INFO: renamed from: o */
    public static final C9625i f32761o = new C9625i();

    /* JADX INFO: renamed from: l */
    public static final InterfaceC6056z m37648l(InterfaceC6056z interfaceC6056z) {
        interfaceC6056z.getClass();
        C9625i c9625i = f32761o;
        C5695f name = interfaceC6056z.getName();
        name.getClass();
        if (c9625i.m37653n(name)) {
            return (InterfaceC6056z) AbstractC9211e.m35854i(interfaceC6056z, false, C9621g.f32749q, 1, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m37649m(InterfaceC5986b interfaceC5986b) {
        interfaceC5986b.getClass();
        return f32761o.m37652k(interfaceC5986b);
    }

    /* JADX INFO: renamed from: o */
    public static final AbstractC9648t0.b m37650o(InterfaceC5986b interfaceC5986b) {
        InterfaceC5986b interfaceC5986bM35854i;
        String strM10563d;
        interfaceC5986b.getClass();
        AbstractC9648t0.a aVar = AbstractC9648t0.f32841a;
        if (!aVar.m37733d().contains(interfaceC5986b.getName()) || (interfaceC5986bM35854i = AbstractC9211e.m35854i(interfaceC5986b, false, C9623h.f32755q, 1, null)) == null || (strM10563d = AbstractC2909c0.m10563d(interfaceC5986bM35854i)) == null) {
            return null;
        }
        return aVar.m37741l(strM10563d);
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m37651p(InterfaceC5986b interfaceC5986b) {
        interfaceC5986b.getClass();
        return (interfaceC5986b instanceof InterfaceC6056z) && f32761o.m37652k(interfaceC5986b);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m37652k(InterfaceC5986b interfaceC5986b) {
        return AbstractC5081g0.m20559a0(AbstractC9648t0.f32841a.m37734e(), AbstractC2909c0.m10563d(interfaceC5986b));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m37653n(C5695f c5695f) {
        c5695f.getClass();
        return AbstractC9648t0.f32841a.m37733d().contains(c5695f);
    }
}

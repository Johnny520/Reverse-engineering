package p358y9;

import gb.AbstractC2650c1;
import p011aa.InterfaceC0198c;
import p112hb.AbstractC2965x;
import p186m9.AbstractC5128i;
import p213oa.C5695f;
import p229p9.InterfaceC5983a;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6000f1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6053x0;
import p229p9.InterfaceC6055y0;
import p327wa.AbstractC9211e;
import sa.AbstractC7259i;

/* JADX INFO: renamed from: y9.s0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9646s0 {
    /* JADX INFO: renamed from: d */
    public static final boolean m37710d(InterfaceC5986b interfaceC5986b) {
        interfaceC5986b.getClass();
        return m37713g(interfaceC5986b) != null;
    }

    /* JADX INFO: renamed from: e */
    public static final String m37711e(InterfaceC5986b interfaceC5986b) {
        InterfaceC5986b interfaceC5986bM35868w;
        C5695f c5695fM37631j;
        interfaceC5986b.getClass();
        InterfaceC5986b interfaceC5986bM37712f = m37712f(interfaceC5986b);
        if (interfaceC5986bM37712f != null && (interfaceC5986bM35868w = AbstractC9211e.m35868w(interfaceC5986bM37712f)) != null) {
            if (interfaceC5986bM35868w instanceof InterfaceC6055y0) {
                return C9633m.f32821a.m37682b(interfaceC5986bM35868w);
            }
            if ((interfaceC5986bM35868w instanceof InterfaceC6000f1) && (c5695fM37631j = C9619f.f32747o.m37631j((InterfaceC6000f1) interfaceC5986bM35868w)) != null) {
                return c5695fM37631j.m23030c();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC5986b m37712f(InterfaceC5986b interfaceC5986b) {
        if (AbstractC5128i.m20874h0(interfaceC5986b)) {
            return m37713g(interfaceC5986b);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC5986b m37713g(InterfaceC5986b interfaceC5986b) {
        interfaceC5986b.getClass();
        if (!AbstractC9648t0.f32841a.m37736g().contains(interfaceC5986b.getName()) && !C9627j.f32785a.m37657d().contains(AbstractC9211e.m35868w(interfaceC5986b).getName())) {
            return null;
        }
        if ((interfaceC5986b instanceof InterfaceC6055y0) || (interfaceC5986b instanceof InterfaceC6053x0)) {
            return AbstractC9211e.m35854i(interfaceC5986b, false, C9640p0.f32834q, 1, null);
        }
        if (interfaceC5986b instanceof InterfaceC6000f1) {
            return AbstractC9211e.m35854i(interfaceC5986b, false, C9642q0.f32836q, 1, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m37714h(InterfaceC5986b interfaceC5986b) {
        interfaceC5986b.getClass();
        return C9633m.f32821a.m37683d(AbstractC9211e.m35868w(interfaceC5986b));
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m37715i(InterfaceC5986b interfaceC5986b) {
        interfaceC5986b.getClass();
        return C9619f.f32747o.m37632k((InterfaceC6000f1) interfaceC5986b);
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC5986b m37716j(InterfaceC5986b interfaceC5986b) {
        interfaceC5986b.getClass();
        InterfaceC5986b interfaceC5986bM37713g = m37713g(interfaceC5986b);
        if (interfaceC5986bM37713g != null) {
            return interfaceC5986bM37713g;
        }
        C9625i c9625i = C9625i.f32761o;
        C5695f name = interfaceC5986b.getName();
        name.getClass();
        if (c9625i.m37653n(name)) {
            return AbstractC9211e.m35854i(interfaceC5986b, false, C9644r0.f32840q, 1, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m37717k(InterfaceC5986b interfaceC5986b) {
        interfaceC5986b.getClass();
        return AbstractC5128i.m20874h0(interfaceC5986b) && C9625i.m37650o(interfaceC5986b) != null;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m37718l(InterfaceC5995e interfaceC5995e, InterfaceC5983a interfaceC5983a) {
        interfaceC5995e.getClass();
        interfaceC5983a.getClass();
        InterfaceC6019m interfaceC6019mMo7443b = interfaceC5983a.mo7443b();
        interfaceC6019mMo7443b.getClass();
        AbstractC2650c1 abstractC2650c1Mo7508x = ((InterfaceC5995e) interfaceC6019mMo7443b).mo7508x();
        abstractC2650c1Mo7508x.getClass();
        for (InterfaceC5995e interfaceC5995eM28766s = AbstractC7259i.m28766s(interfaceC5995e); interfaceC5995eM28766s != null; interfaceC5995eM28766s = AbstractC7259i.m28766s(interfaceC5995eM28766s)) {
            if (!(interfaceC5995eM28766s instanceof InterfaceC0198c) && AbstractC2965x.m10963b(interfaceC5995eM28766s.mo7508x(), abstractC2650c1Mo7508x) != null) {
                return !AbstractC5128i.m20874h0(interfaceC5995eM28766s);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m37719m(InterfaceC5986b interfaceC5986b) {
        interfaceC5986b.getClass();
        return AbstractC9211e.m35868w(interfaceC5986b).mo7443b() instanceof InterfaceC0198c;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m37720n(InterfaceC5986b interfaceC5986b) {
        interfaceC5986b.getClass();
        return m37719m(interfaceC5986b) || AbstractC5128i.m20874h0(interfaceC5986b);
    }
}

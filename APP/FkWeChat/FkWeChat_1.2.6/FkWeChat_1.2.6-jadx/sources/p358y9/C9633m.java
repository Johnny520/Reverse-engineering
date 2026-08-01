package p358y9;

import java.util.Collection;
import p185m8.AbstractC5081g0;
import p186m9.AbstractC5128i;
import p213oa.C5695f;
import p229p9.InterfaceC5986b;
import p327wa.AbstractC9211e;

/* JADX INFO: renamed from: y9.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9633m {

    /* JADX INFO: renamed from: a */
    public static final C9633m f32821a = new C9633m();

    /* JADX INFO: renamed from: c */
    public static final boolean m37681c(InterfaceC5986b interfaceC5986b) {
        interfaceC5986b.getClass();
        return f32821a.m37683d(interfaceC5986b);
    }

    /* JADX INFO: renamed from: b */
    public final String m37682b(InterfaceC5986b interfaceC5986b) {
        C5695f c5695f;
        interfaceC5986b.getClass();
        AbstractC5128i.m20874h0(interfaceC5986b);
        InterfaceC5986b interfaceC5986bM35854i = AbstractC9211e.m35854i(AbstractC9211e.m35868w(interfaceC5986b), false, C9631l.f32819q, 1, null);
        if (interfaceC5986bM35854i == null || (c5695f = (C5695f) C9627j.f32785a.m37654a().get(AbstractC9211e.m35860o(interfaceC5986bM35854i))) == null) {
            return null;
        }
        return c5695f.m23030c();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m37683d(InterfaceC5986b interfaceC5986b) {
        interfaceC5986b.getClass();
        if (C9627j.f32785a.m37657d().contains(interfaceC5986b.getName())) {
            return m37684e(interfaceC5986b);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m37684e(InterfaceC5986b interfaceC5986b) {
        if (AbstractC5081g0.m20559a0(C9627j.f32785a.m37656c(), AbstractC9211e.m35856k(interfaceC5986b)) && interfaceC5986b.mo12680m().isEmpty()) {
            return true;
        }
        if (!AbstractC5128i.m20874h0(interfaceC5986b)) {
            return false;
        }
        Collection collectionMo12674e = interfaceC5986b.mo12674e();
        collectionMo12674e.getClass();
        Collection<InterfaceC5986b> collection = collectionMo12674e;
        if (collection.isEmpty()) {
            return false;
        }
        for (InterfaceC5986b interfaceC5986b2 : collection) {
            C9633m c9633m = f32821a;
            interfaceC5986b2.getClass();
            if (c9633m.m37683d(interfaceC5986b2)) {
                return true;
            }
        }
        return false;
    }
}

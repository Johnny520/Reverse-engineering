package p112hb;

import gb.C2713t1;
import p112hb.AbstractC2948g;
import p112hb.AbstractC2949h;

/* JADX INFO: renamed from: hb.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2940a {
    /* JADX INFO: renamed from: a */
    public static final C2713t1 m10738a(boolean z10, boolean z11, InterfaceC2944c interfaceC2944c, AbstractC2948g abstractC2948g, AbstractC2949h abstractC2949h) {
        interfaceC2944c.getClass();
        abstractC2948g.getClass();
        abstractC2949h.getClass();
        return new C2713t1(z10, z11, false, true, interfaceC2944c, abstractC2948g, abstractC2949h);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C2713t1 m10739b(boolean z10, boolean z11, InterfaceC2944c interfaceC2944c, AbstractC2948g abstractC2948g, AbstractC2949h abstractC2949h, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            interfaceC2944c = C2961t.f7809a;
        }
        if ((i10 & 8) != 0) {
            abstractC2948g = AbstractC2948g.a.f7783a;
        }
        if ((i10 & 16) != 0) {
            abstractC2949h = AbstractC2949h.a.f7784a;
        }
        return m10738a(z10, z11, interfaceC2944c, abstractC2948g, abstractC2949h);
    }
}

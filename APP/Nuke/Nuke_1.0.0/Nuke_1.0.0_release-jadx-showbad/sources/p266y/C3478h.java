package p266y;

import p007B0.C0190d;
import p016C3.C0244a;
import p029F0.InterfaceC0430v;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0601k;
import p041H0.InterfaceC0625w;
import p056K2.C0891q;
import p063M0.InterfaceC0993a;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p160f3.AbstractC2162v;
import p169h0.AbstractC2206o;
import p204n0.C2684c;
import p227r.C2992i;

/* JADX INFO: renamed from: y.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3478h extends AbstractC2206o implements InterfaceC0993a, InterfaceC0625w {

    /* JADX INFO: renamed from: r */
    public C2992i f10798r;

    /* JADX INFO: renamed from: s */
    public boolean f10799s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public static final C2684c m5711J0(C3478h c3478h, AbstractC0596h0 abstractC0596h0, C0190d c0190d) {
        C2684c c2684c;
        if (c3478h.f7199q && c3478h.f10799s) {
            AbstractC0596h0 abstractC0596h0M1043s = AbstractC0601k.m1043s(c3478h);
            if (!abstractC0596h0.mo981R0().f7199q) {
                abstractC0596h0 = null;
            }
            if (abstractC0596h0 != null && (c2684c = (C2684c) c0190d.mo6a()) != null) {
                return c2684c.m4658i(abstractC0596h0M1043s.mo634K(abstractC0596h0, false).m4653d());
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p063M0.InterfaceC0993a
    /* JADX INFO: renamed from: t0 */
    public final Object mo1268t0(AbstractC0596h0 abstractC0596h0, C0190d c0190d, AbstractC1178c abstractC1178c) {
        Object objM3982d = AbstractC2162v.m3982d(new C3477g(this, abstractC0596h0, c0190d, new C0244a(this, abstractC0596h0, c0190d, 10), null), abstractC1178c);
        return objM3982d == EnumC1152a.f3788d ? objM3982d : C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0625w
    /* JADX INFO: renamed from: v */
    public final void mo953v(InterfaceC0430v interfaceC0430v) {
        this.f10799s = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: y0 */
    public final boolean mo656y0() {
        return false;
    }
}

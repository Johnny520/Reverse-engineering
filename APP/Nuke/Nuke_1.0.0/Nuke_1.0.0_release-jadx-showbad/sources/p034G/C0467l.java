package p034G;

import p000A.C0038T0;
import p000A.C0089u;
import p000A.C0099z;
import p018D.C0254c;
import p029F0.InterfaceC0430v;
import p040H.InterfaceC0546d;
import p041H0.AbstractC0599j;
import p041H0.InterfaceC0595h;
import p058L.C0913O;
import p058L.C0914P;
import p095T.AbstractC1385s;
import p095T.C1311F;
import p160f3.C2136g0;
import p204n0.C2684c;

/* JADX INFO: renamed from: G.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0467l extends AbstractC0599j implements InterfaceC0595h, InterfaceC0546d {

    /* JADX INFO: renamed from: t */
    public C0038T0 f1383t;

    /* JADX INFO: renamed from: u */
    public C0913O f1384u;

    /* JADX INFO: renamed from: v */
    public C0914P f1385v;

    /* JADX INFO: renamed from: w */
    public C0089u f1386w;

    /* JADX INFO: renamed from: x */
    public C2136g0 f1387x;

    /* JADX INFO: renamed from: y */
    public final C1311F f1388y = AbstractC1385s.m2624n(new C0099z(5, this));

    /* JADX INFO: renamed from: z */
    public C2684c f1389z = C2684c.f8557e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0467l(C0038T0 c0038t0, C0913O c0913o, C0914P c0914p, C0089u c0089u) {
        this.f1383t = c0038t0;
        this.f1384u = c0913o;
        this.f1385v = c0914p;
        this.f1386w = c0089u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p040H.InterfaceC0546d
    /* JADX INFO: renamed from: B */
    public final C2684c mo743B(InterfaceC0430v interfaceC0430v) {
        if (!this.f7199q) {
            return this.f1389z;
        }
        C2684c c2684c = (C2684c) this.f1386w.mo1h(interfaceC0430v);
        if (c2684c == null) {
            return this.f1389z;
        }
        this.f1389z = c2684c;
        return c2684c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: B0 */
    public final void mo143B0() {
        C0038T0 c0038t0 = this.f1383t;
        c0038t0.f170f = EnumC0468m.f1392f;
        c0038t0.f169e = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: C0 */
    public final void mo144C0() {
        C0038T0 c0038t0 = this.f1383t;
        c0038t0.f170f = EnumC0468m.f1391e;
        c0038t0.f169e = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p040H.InterfaceC0546d
    /* JADX INFO: renamed from: l */
    public final long mo744l(InterfaceC0430v interfaceC0430v) {
        return mo743B(interfaceC0430v).m4653d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p040H.InterfaceC0546d
    /* JADX INFO: renamed from: r0 */
    public final C0254c mo745r0() {
        return (C0254c) this.f1388y.getValue();
    }
}

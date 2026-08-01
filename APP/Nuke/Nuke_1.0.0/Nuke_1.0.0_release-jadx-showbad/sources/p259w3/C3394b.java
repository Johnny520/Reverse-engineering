package p259w3;

import p000A.C0099z;
import p002A1.AbstractC0142o;
import p002A1.C0126O;
import p002A1.C0147t;
import p002A1.EnumC0140m;
import p002A1.InterfaceC0127P;
import p002A1.InterfaceC0145r;
import p048I1.C0780e;
import p048I1.C0781f;
import p048I1.InterfaceC0782g;
import p055K1.C0874a;
import p135b.C1809A;
import p135b.InterfaceC1811C;

/* JADX INFO: renamed from: w3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3394b implements InterfaceC0145r, InterfaceC0782g, InterfaceC0127P, InterfaceC1811C {

    /* JADX INFO: renamed from: d */
    public final C0147t f10615d;

    /* JADX INFO: renamed from: e */
    public final C0781f f10616e;

    /* JADX INFO: renamed from: f */
    public final C0126O f10617f;

    /* JADX INFO: renamed from: g */
    public final C1809A f10618g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3394b() {
        C0147t c0147t = new C0147t(this, true);
        this.f10615d = c0147t;
        C0874a c0874a = new C0874a(this, new C0099z(6, this));
        C0781f c0781f = new C0781f(c0874a);
        this.f10616e = c0781f;
        this.f10617f = new C0126O();
        this.f10618g = new C1809A(null);
        c0874a.m1901a();
        c0781f.m1329a(null);
        c0147t.m189e(EnumC0140m.ON_CREATE);
        c0147t.m189e(EnumC0140m.ON_START);
        c0147t.m189e(EnumC0140m.ON_RESUME);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p002A1.InterfaceC0145r
    public final AbstractC0142o getLifecycle() {
        return this.f10615d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p135b.InterfaceC1811C
    public final C1809A getOnBackPressedDispatcher() {
        return this.f10618g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p048I1.InterfaceC0782g
    public final C0780e getSavedStateRegistry() {
        return this.f10616e.f2525b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p002A1.InterfaceC0127P
    public final C0126O getViewModelStore() {
        return this.f10617f;
    }
}

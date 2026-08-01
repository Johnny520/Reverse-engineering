package p021D3;

import p000A.C0099z;
import p002A1.AbstractC0142o;
import p002A1.C0126O;
import p002A1.C0147t;
import p002A1.InterfaceC0127P;
import p002A1.InterfaceC0145r;
import p048I1.C0780e;
import p048I1.C0781f;
import p048I1.InterfaceC0782g;
import p055K1.C0874a;

/* JADX INFO: renamed from: D3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0271h implements InterfaceC0145r, InterfaceC0782g, InterfaceC0127P {

    /* JADX INFO: renamed from: d */
    public final C0147t f871d = new C0147t(this, true);

    /* JADX INFO: renamed from: e */
    public final C0781f f872e = new C0781f(new C0874a(this, new C0099z(6, this)));

    /* JADX INFO: renamed from: f */
    public final C0126O f873f = new C0126O();

    /* JADX INFO: renamed from: g */
    public boolean f874g;

    /* JADX INFO: renamed from: h */
    public boolean f875h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p002A1.InterfaceC0145r
    public final AbstractC0142o getLifecycle() {
        return this.f871d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p048I1.InterfaceC0782g
    public final C0780e getSavedStateRegistry() {
        return this.f872e.f2525b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p002A1.InterfaceC0127P
    public final C0126O getViewModelStore() {
        return this.f873f;
    }
}

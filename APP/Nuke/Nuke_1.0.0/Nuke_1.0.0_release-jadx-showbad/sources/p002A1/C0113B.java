package p002A1;

import p014C1.C0239a;
import p048I1.C0780e;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: A1.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0113B implements InterfaceC0143p, AutoCloseable {

    /* JADX INFO: renamed from: d */
    public final String f491d;

    /* JADX INFO: renamed from: e */
    public final C0112A f492e;

    /* JADX INFO: renamed from: f */
    public boolean f493f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0113B(String str, C0112A c0112a) {
        this.f491d = str;
        this.f492e = c0112a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p002A1.InterfaceC0143p
    /* JADX INFO: renamed from: d */
    public final void mo147d(InterfaceC0145r interfaceC0145r, EnumC0140m enumC0140m) {
        if (enumC0140m == EnumC0140m.ON_DESTROY) {
            this.f493f = false;
            interfaceC0145r.getLifecycle().mo185b(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m148h(AbstractC0142o abstractC0142o, C0780e c0780e) {
        AbstractC1665j.m2985e(c0780e, "registry");
        AbstractC1665j.m2985e(abstractC0142o, "lifecycle");
        if (this.f493f) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f493f = true;
        abstractC0142o.mo184a(this);
        c0780e.m1327c(this.f491d, (C0239a) this.f492e.f490a.f812e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}

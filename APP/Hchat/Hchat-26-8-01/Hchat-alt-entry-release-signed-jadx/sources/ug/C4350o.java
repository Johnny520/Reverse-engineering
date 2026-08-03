package ug;

import p370yf.InterfaceC6039d;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: ug.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4350o implements InterfaceC5557c, InterfaceC6039d {

    /* JADX INFO: renamed from: g */
    public final InterfaceC5557c f14528g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5561g f14529h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4350o(InterfaceC5557c interfaceC5557c, InterfaceC5561g interfaceC5561g) {
        this.f14528g = interfaceC5557c;
        this.f14529h = interfaceC5561g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.InterfaceC6039d
    public final InterfaceC6039d getCallerFrame() {
        InterfaceC5557c interfaceC5557c = this.f14528g;
        if (interfaceC5557c instanceof InterfaceC6039d) {
            return (InterfaceC6039d) interfaceC5557c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5557c
    public final InterfaceC5561g getContext() {
        return this.f14529h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5557c
    public final void resumeWith(Object obj) {
        this.f14528g.resumeWith(obj);
    }
}

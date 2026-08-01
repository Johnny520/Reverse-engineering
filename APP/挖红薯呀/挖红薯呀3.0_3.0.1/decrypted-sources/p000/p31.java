package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class p31 implements InterfaceC0322ik, InterfaceC0022al {

    /* JADX INFO: renamed from: d */
    public final InterfaceC0322ik f4748d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0618pk f4749e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p31(InterfaceC0322ik interfaceC0322ik, InterfaceC0618pk interfaceC0618pk) {
        this.f4748d = interfaceC0322ik;
        this.f4749e = interfaceC0618pk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0022al
    /* JADX INFO: renamed from: d */
    public final InterfaceC0022al mo180d() {
        InterfaceC0322ik interfaceC0322ik = this.f4748d;
        if (interfaceC0322ik instanceof InterfaceC0022al) {
            return (InterfaceC0022al) interfaceC0322ik;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0322ik
    /* JADX INFO: renamed from: e */
    public final InterfaceC0618pk mo540e() {
        return this.f4749e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0322ik
    /* JADX INFO: renamed from: i */
    public final void mo541i(Object obj) {
        this.f4748d.mo541i(obj);
    }
}

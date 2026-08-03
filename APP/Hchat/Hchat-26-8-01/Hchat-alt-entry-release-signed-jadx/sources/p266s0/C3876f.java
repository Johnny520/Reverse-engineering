package p266s0;

import java.util.Set;
import p117i0.C1848k0;
import p117i0.InterfaceC1810a2;
import p131j0.C2046b;

/* JADX INFO: renamed from: s0.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3876f implements InterfaceC1810a2 {

    /* JADX INFO: renamed from: g */
    public final Set f12725g;

    /* JADX INFO: renamed from: h */
    public final C2046b f12726h = new C2046b(new C1848k0[16]);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3876f(Set set) {
        this.f12725g = set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1810a2
    /* JADX INFO: renamed from: j */
    public final void mo2482j() {
        C2046b c2046b = this.f12726h;
        Object[] objArr = c2046b.f6891g;
        int i9 = c2046b.f6893i;
        for (int i10 = 0; i10 < i9; i10++) {
            InterfaceC1810a2 interfaceC1810a2 = ((C1848k0) objArr[i10]).f6147a;
            this.f12725g.remove(interfaceC1810a2);
            interfaceC1810a2.mo2482j();
        }
    }

    @Override // p117i0.InterfaceC1810a2
    /* JADX INFO: renamed from: d */
    public final void mo2480d() {
    }

    @Override // p117i0.InterfaceC1810a2
    /* JADX INFO: renamed from: f */
    public final void mo2481f() {
    }
}
